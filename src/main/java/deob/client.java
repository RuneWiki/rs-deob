package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.v")
    public static boolean field472 = true;

    @ObfuscatedName("client.p")
    public static int field473 = 1;

    @ObfuscatedName("client.d")
    public static int field474 = 0;

    @ObfuscatedName("client.z")
    public static boolean field476 = false;

    @ObfuscatedName("client.o")
    public static boolean field477 = false;

    @ObfuscatedName("client.u")
    public static int field601 = 0;

    @ObfuscatedName("client.f")
    public static int field607 = 1;

    @ObfuscatedName("client.q")
    public static int field480 = 0;

    @ObfuscatedName("client.a")
    public static boolean field481 = true;

    @ObfuscatedName("client.w")
    public static class164[] field712 = new class164[4];

    @ObfuscatedName("client.g")
    public static int field482 = 0;

    @ObfuscatedName("client.l")
    public static long field483 = -1L;

    @ObfuscatedName("client.b")
    public static int field484 = -1;

    @ObfuscatedName("client.h")
    public static int field707 = -1;

    @ObfuscatedName("client.n")
    public static int field486 = -1;

    @ObfuscatedName("client.s")
    public static boolean field487 = true;

    @ObfuscatedName("client.c")
    public static boolean field488 = false;

    @ObfuscatedName("client.am")
    public static int field653 = 0;

    @ObfuscatedName("client.ap")
    public static int field520 = 0;

    @ObfuscatedName("client.au")
    public static int field491 = 0;

    @ObfuscatedName("client.ab")
    public static int field492 = 0;

    @ObfuscatedName("client.ae")
    public static int field493 = 0;

    @ObfuscatedName("client.as")
    public static int field678 = 0;

    @ObfuscatedName("client.av")
    public static int field731 = 0;

    @ObfuscatedName("client.ar")
    public static int field496 = 0;

    @ObfuscatedName("client.ad")
    public static int field497 = 0;

    @ObfuscatedName("client.ac")
    public static class127 field498 = new class127(new byte[5000]);

    @ObfuscatedName("client.aj")
    public static int field499 = 0;

    @ObfuscatedName("client.ag")
    public static int field500 = 0;

    @ObfuscatedName("client.ah")
    public static int field501 = 0;

    @ObfuscatedName("client.bl")
    public static int field503 = 0;

    @ObfuscatedName("client.bx")
    public static int field541 = 0;

    @ObfuscatedName("client.bh")
    public static int field505 = 0;

    @ObfuscatedName("client.bu")
    public static int field506 = 0;

    @ObfuscatedName("client.bi")
    public static int field507 = 0;

    @ObfuscatedName("client.bw")
    public static class25[] field631 = new class25[32768];

    @ObfuscatedName("client.bn")
    public static int field509 = 0;

    @ObfuscatedName("client.bj")
    public static int[] field510 = new int[32768];

    @ObfuscatedName("client.cf")
    public static class116 field692 = new class116(5000);

    @ObfuscatedName("client.cc")
    public static class116 field512 = new class116(5000);

    @ObfuscatedName("client.cn")
    public static class116 field513 = new class116(5000);

    @ObfuscatedName("client.ca")
    public static int field514 = 0;

    @ObfuscatedName("client.cb")
    public static int field540 = 0;

    @ObfuscatedName("client.cg")
    public static int field516 = 0;

    @ObfuscatedName("client.ci")
    public static int field494 = 0;

    @ObfuscatedName("client.cl")
    public static int field518 = 0;

    @ObfuscatedName("client.cd")
    public static int field672 = 0;

    @ObfuscatedName("client.ct")
    public static int field578 = 0;

    @ObfuscatedName("client.cy")
    public static int field521 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field522 = false;

    @ObfuscatedName("client.cu")
    public static int field523 = 0;

    @ObfuscatedName("client.cm")
    public static int field524 = 0;

    @ObfuscatedName("client.cv")
    public static int field525 = 1;

    @ObfuscatedName("client.cz")
    public static int field526 = 0;

    @ObfuscatedName("client.df")
    public static int field527 = 1;

    @ObfuscatedName("client.di")
    public static int field608 = 0;

    @ObfuscatedName("client.dy")
    public static boolean field530 = false;

    @ObfuscatedName("client.dl")
    public static int[][][] field490 = new int[4][13][13];

    @ObfuscatedName("client.dg")
    public static final int[] field532 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field612 = 0;

    @ObfuscatedName("client.da")
    public static int[][] field534 = new int[104][104];

    @ObfuscatedName("client.do")
    public static int[][] field535 = new int[104][104];

    @ObfuscatedName("client.dc")
    public static int[] field536 = new int[4000];

    @ObfuscatedName("client.dz")
    public static int[] field537 = new int[4000];

    @ObfuscatedName("client.dv")
    public static int field538 = 0;

    @ObfuscatedName("client.ds")
    public static int field539 = 2;

    @ObfuscatedName("client.dj")
    public static int field576 = 0;

    @ObfuscatedName("client.dn")
    public static int field700 = 2;

    @ObfuscatedName("client.dk")
    public static int field634 = 0;

    @ObfuscatedName("client.dx")
    public static int field543 = 1;

    @ObfuscatedName("client.dp")
    public static int field489 = 0;

    @ObfuscatedName("client.eq")
    public static int field545 = 0;

    @ObfuscatedName("client.eo")
    public static int field726 = 2;

    @ObfuscatedName("client.ek")
    public static int field547 = 0;

    @ObfuscatedName("client.eh")
    public static int field548 = 1;

    @ObfuscatedName("client.es")
    public static int field549 = 0;

    @ObfuscatedName("client.em")
    public static int field550 = 0;

    @ObfuscatedName("client.ex")
    public static int field504 = 2301979;

    @ObfuscatedName("client.ep")
    public static int field552 = 5063219;

    @ObfuscatedName("client.fc")
    public static int field553 = 3353893;

    @ObfuscatedName("client.fe")
    public static int field619 = 7759444;

    @ObfuscatedName("client.fl")
    public static boolean field555 = false;

    @ObfuscatedName("client.fo")
    public static int field556 = 0;

    @ObfuscatedName("client.fn")
    public static int field584 = 128;

    @ObfuscatedName("client.fx")
    public static int field558 = 0;

    @ObfuscatedName("client.fm")
    public static int field559 = 0;

    @ObfuscatedName("client.ff")
    public static int field688 = 0;

    @ObfuscatedName("client.fs")
    public static int field716 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field562 = false;

    @ObfuscatedName("client.fy")
    public static int field563 = 0;

    @ObfuscatedName("client.fb")
    public static int field564 = 0;

    @ObfuscatedName("client.fa")
    public static int field565 = 50;

    @ObfuscatedName("client.fz")
    public static int[] field566 = new int[field565];

    @ObfuscatedName("client.fv")
    public static int[] field567 = new int[field565];

    @ObfuscatedName("client.fi")
    public static int[] field624 = new int[field565];

    @ObfuscatedName("client.fr")
    public static int[] field652 = new int[field565];

    @ObfuscatedName("client.fh")
    public static int[] field570 = new int[field565];

    @ObfuscatedName("client.fg")
    public static int[] field655 = new int[field565];

    @ObfuscatedName("client.gt")
    public static int[] field724 = new int[field565];

    @ObfuscatedName("client.gf")
    public static String[] field720 = new String[field565];

    @ObfuscatedName("client.gn")
    public static int[][] field574 = new int[104][104];

    @ObfuscatedName("client.gs")
    public static int field575 = 0;

    @ObfuscatedName("client.gb")
    public static int field606 = -1;

    @ObfuscatedName("client.gw")
    public static int field577 = -1;

    @ObfuscatedName("client.gd")
    public static int field596 = 0;

    @ObfuscatedName("client.gv")
    public static int field579 = 0;

    @ObfuscatedName("client.gr")
    public static int field560 = 0;

    @ObfuscatedName("client.gg")
    public static int field581 = 0;

    @ObfuscatedName("client.gy")
    public static int field582 = 0;

    @ObfuscatedName("client.gk")
    public static int field583 = 0;

    @ObfuscatedName("client.ga")
    public static int field651 = 0;

    @ObfuscatedName("client.gi")
    public static int field585 = 0;

    @ObfuscatedName("client.gl")
    public static int field591 = 0;

    @ObfuscatedName("client.gj")
    public static int field587 = 0;

    @ObfuscatedName("client.gm")
    public static boolean field588 = false;

    @ObfuscatedName("client.gh")
    public static int field589 = 0;

    @ObfuscatedName("client.gc")
    public static int field590 = 0;

    @ObfuscatedName("client.gq")
    public static class3[] field693 = new class3[2048];

    @ObfuscatedName("client.gx")
    public static int field592 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field593 = new int[2048];

    @ObfuscatedName("client.hb")
    public static int field706 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field529 = new int[2048];

    @ObfuscatedName("client.hn")
    public static class127[] field734 = new class127[2048];

    @ObfuscatedName("client.hr")
    public static int field597 = -1;

    @ObfuscatedName("client.ha")
    public static int field598 = 0;

    @ObfuscatedName("client.hd")
    public static int field599 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field600 = new int[1000];

    @ObfuscatedName("client.hw")
    public static final int[] field684 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field681 = new String[8];

    @ObfuscatedName("client.hy")
    public static boolean[] field603 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field733 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hx")
    public static class177[][][] field605 = new class177[4][104][104];

    @ObfuscatedName("client.hz")
    public static class177 field502 = new class177();

    @ObfuscatedName("client.hu")
    public static class177 field662 = new class177();

    @ObfuscatedName("client.hg")
    public static class177 field554 = new class177();

    @ObfuscatedName("client.hk")
    public static int[] field609 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field610 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field572 = new int[25];

    @ObfuscatedName("client.hh")
    public static int field519 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field613 = false;

    @ObfuscatedName("client.il")
    public static int field614 = 0;

    @ObfuscatedName("client.iq")
    public static int[] field615 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field616 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field478 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field618 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field663 = new String[500];

    @ObfuscatedName("client.ip")
    public static String[] field620 = new String[500];

    @ObfuscatedName("client.ii")
    public static int field621 = -1;

    @ObfuscatedName("client.ig")
    public static int field683 = -1;

    @ObfuscatedName("client.in")
    public static int field623 = 0;

    @ObfuscatedName("client.ic")
    public static int field736 = 50;

    @ObfuscatedName("client.ia")
    public static int field625 = 0;

    @ObfuscatedName("client.it")
    public static String field626 = null;

    @ObfuscatedName("client.id")
    public static boolean field627 = false;

    @ObfuscatedName("client.iu")
    public static int field628 = -1;

    @ObfuscatedName("client.iz")
    public static String field629 = null;

    @ObfuscatedName("client.jd")
    public static String field630 = null;

    @ObfuscatedName("client.jv")
    public static int field586 = -1;

    @ObfuscatedName("client.jj")
    public static class175 field632 = new class175(8);

    @ObfuscatedName("client.jm")
    public static int field633 = 0;

    @ObfuscatedName("client.jp")
    public static int field485 = 0;

    @ObfuscatedName("client.js")
    public static class158 field557 = null;

    @ObfuscatedName("client.jl")
    public static int field617 = 0;

    @ObfuscatedName("client.jx")
    public static int field637 = 0;

    @ObfuscatedName("client.jo")
    public static int field638 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field639 = false;

    @ObfuscatedName("client.jt")
    public static boolean field640 = false;

    @ObfuscatedName("client.jh")
    public static boolean field641 = false;

    @ObfuscatedName("client.jr")
    public static class158 field642 = null;

    @ObfuscatedName("client.je")
    public static class158 field643 = null;

    @ObfuscatedName("client.jy")
    public static int field544 = 0;

    @ObfuscatedName("client.ja")
    public static int field551 = 0;

    @ObfuscatedName("client.jb")
    public static class158 field517 = null;

    @ObfuscatedName("client.jq")
    public static boolean field542 = false;

    @ObfuscatedName("client.ju")
    public static int field648 = -1;

    @ObfuscatedName("client.jc")
    public static int field649 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field650 = false;

    @ObfuscatedName("client.ji")
    public static int field645 = -1;

    @ObfuscatedName("client.jf")
    public static int field647 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field594 = false;

    @ObfuscatedName("client.kq")
    public static int field654 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field495 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field656 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field657 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field658 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field659 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field646 = 0;

    @ObfuscatedName("client.kz")
    public static int field470 = 0;

    @ObfuscatedName("client.kw")
    public static int field667 = 0;

    @ObfuscatedName("client.kt")
    public static int field661 = 0;

    @ObfuscatedName("client.ka")
    public static int field664 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field665 = new int[2000];

    @ObfuscatedName("client.kv")
    public static String[] field666 = new String[1000];

    @ObfuscatedName("client.km")
    public static int field711 = 0;

    @ObfuscatedName("client.ke")
    public static class177 field668 = new class177();

    @ObfuscatedName("client.kj")
    public static class177 field669 = new class177();

    @ObfuscatedName("client.kh")
    public static class177 field670 = new class177();

    @ObfuscatedName("client.ky")
    public static class175 field671 = new class175(512);

    @ObfuscatedName("client.kp")
    public static int field515 = 0;

    @ObfuscatedName("client.ki")
    public static int field635 = -2;

    @ObfuscatedName("client.ln")
    public static boolean[] field674 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field675 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field602 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static int[] field677 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field508 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field679 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field580 = new int[100];

    @ObfuscatedName("client.lh")
    public static int field479 = 0;

    @ObfuscatedName("client.ls")
    public static int[] field682 = new int[100];

    @ObfuscatedName("client.lx")
    public static String[] field604 = new String[100];

    @ObfuscatedName("client.lp")
    public static String[] field717 = new String[100];

    @ObfuscatedName("client.lf")
    public static String[] field685 = new String[100];

    @ObfuscatedName("client.la")
    public static int field686 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field687 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lm")
    public static int field528 = 0;

    @ObfuscatedName("client.lq")
    public static int field689 = 0;

    @ObfuscatedName("client.lb")
    public static long[] field690 = new long[100];

    @ObfuscatedName("client.lv")
    public static int field691 = 0;

    @ObfuscatedName("client.li")
    public static int field511 = 0;

    @ObfuscatedName("client.lo")
    public static int[] field673 = new int[128];

    @ObfuscatedName("client.lc")
    public static int[] field694 = new int[128];

    @ObfuscatedName("client.ly")
    public static long field695 = -1L;

    @ObfuscatedName("client.ma")
    public static String field696 = null;

    @ObfuscatedName("client.mk")
    public static String field697 = null;

    @ObfuscatedName("client.mx")
    public static int field698 = -1;

    @ObfuscatedName("client.ms")
    public static int field699 = 0;

    @ObfuscatedName("client.ml")
    public static int[] field569 = new int[1000];

    @ObfuscatedName("client.mf")
    public static int[] field701 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class86[] field702 = new class86[1000];

    @ObfuscatedName("client.mg")
    public static int field703 = 0;

    @ObfuscatedName("client.mu")
    public static int field704 = 0;

    @ObfuscatedName("client.mi")
    public static int field705 = 0;

    @ObfuscatedName("client.mh")
    public static int field622 = 255;

    @ObfuscatedName("client.my")
    public static int field573 = -1;

    @ObfuscatedName("client.md")
    public static boolean field708 = false;

    @ObfuscatedName("client.me")
    public static int field709 = 127;

    @ObfuscatedName("client.mj")
    public static int field710 = 127;

    @ObfuscatedName("client.nb")
    public static int field680 = 0;

    @ObfuscatedName("client.nh")
    public static int[] field561 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field713 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field660 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field715 = new int[50];

    @ObfuscatedName("client.nv")
    public static class57[] field676 = new class57[50];

    @ObfuscatedName("client.nc")
    public static boolean field636 = false;

    @ObfuscatedName("client.nn")
    public static boolean[] field718 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field719 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field644 = new int[5];

    @ObfuscatedName("client.oa")
    public static int[] field611 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field722 = new int[5];

    @ObfuscatedName("client.ou")
    public static int field723 = 0;

    @ObfuscatedName("client.ol")
    public static int field595 = 0;

    @ObfuscatedName("client.oe")
    public static class23[] field725 = new class23[200];

    @ObfuscatedName("client.or")
    public static class173 field533 = new class173();

    @ObfuscatedName("client.ov")
    public static int field727 = 0;

    @ObfuscatedName("client.oy")
    public static class11[] field728 = new class11[100];

    @ObfuscatedName("client.om")
    public static class163 field729 = new class163();

    @ObfuscatedName("client.of")
    public static int field730 = -1;

    @ObfuscatedName("client.on")
    public static int field531 = -1;

    @ObfuscatedName("client.v(I)V")
    public final void method269() {
    }

    public final void init() {
        if (!this.method1419()) {
            return;
        }
        class167[] var1 = class167.method782();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2780);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2780)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                            field476 = true;
                        } else {
                            field476 = false;
                        }
                    case 2:
                    default:
                        break;
                    case 3:
                        int var5 = Integer.parseInt(var4);
                        class132[] var6 = class132.method3149();
                        int var7 = 0;
                        class132 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class132 var8 = var6[var7];
                            if (var8.field2056 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field1738 = var9;
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                            field607 = 1;
                        } else {
                            field607 = 0;
                        }
                        break;
                    case 5:
                        field474 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field601 = Integer.parseInt(var4);
                        break;
                    case 7:
                        class133[] var10 = new class133[] { class133.field2063, class133.field2061, class133.field2062, class133.field2066, class133.field2064, class133.field2065 };
                        int var12 = Integer.parseInt(var4);
                        class133[] var13 = var10;
                        int var14 = 0;
                        class133 var16;
                        while (true) {
                            if (var14 >= var13.length) {
                                var16 = null;
                                break;
                            }
                            class133 var15 = var13[var14];
                            if (var12 == var15.method2352()) {
                                var16 = var15;
                                break;
                            }
                            var14++;
                        }
                        Statics.field475 = (class133) var16;
                        if (Statics.field475 == class133.field2061) {
                            Statics.field204 = class186.field2857;
                        } else {
                            Statics.field204 = class186.field2859;
                        }
                        break;
                    case 8:
                        field473 = Integer.parseInt(var4);
                        break;
                    case 9:
                        Statics.field952 = var4;
                }
            }
        }
        method732();
        Statics.field2553 = this.getCodeBase().getHost();
        String var17 = Statics.field1738.field2055;
        byte var18 = 0;
        try {
            class82.method670("oldschool", var17, var18, 16);
        } catch (Exception var20) {
            class80.method2830((String) null, var20);
        }
        Statics.field471 = this;
        this.method1439(765, 503, 13);
    }

    @ObfuscatedName("ar.e(I)V")
    public static final void method732() {
        class95.field1574 = false;
        field477 = false;
    }

    @ObfuscatedName("client.d(B)V")
    public final void method365() {
        Statics.field134 = field474 == 0 ? 43594 : field473 + 40000;
        Statics.field746 = field474 == 0 ? 443 : field473 + 50000;
        Statics.field1312 = Statics.field134;
        Statics.field1107 = class161.field2704;
        Statics.field2018 = class161.field2706;
        Statics.field2720 = class161.field2702;
        Statics.field80 = class161.field2703;
        if (Statics.field1314.toLowerCase().indexOf("microsoft") == -1) {
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
        Canvas var1 = Statics.field1494;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class75.field1345);
        var1.addFocusListener(class75.field1345);
        class77.method1491(Statics.field1494);
        Statics.field1805 = class66.method1500();
        if (Statics.field1805 != null) {
            Statics.field1805.method1350(Statics.field1494);
        }
        Statics.field1916 = new class71(255, class82.field1413, class82.field1412, 500000);
        class29 var2 = null;
        class12 var3 = new class12();
        try {
            var2 = class82.method1186("", Statics.field475.field2067, false);
            byte[] var4 = new byte[(int) var2.method553()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method560(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class12(new class127(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method554();
            }
        } catch (Exception var10) {
        }
        Statics.field245 = var3;
        if (field474 != 0) {
            field488 = true;
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method273() {
        field482++;
        this.method518();
        class157.method151();
        class138.method2044();
        method1847();
        class75.method130();
        class77.method1371();
        if (Statics.field1805 != null) {
            int var1 = Statics.field1805.method1352();
            field711 = var1;
        }
        if (field480 == 0) {
            method4();
            Statics.field737.method1347();
            for (int var2 = 0; var2 < 32; var2++) {
                field1307[var2] = 0L;
            }
            for (int var3 = 0; var3 < 32; var3++) {
                field1306[var3] = 0L;
            }
            Statics.field1231 = 0;
        } else if (field480 == 5) {
            class21.method2316(this);
            method4();
            Statics.field737.method1347();
            for (int var4 = 0; var4 < 32; var4++) {
                field1307[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field1306[var5] = 0L;
            }
            Statics.field1231 = 0;
        } else if (field480 == 10) {
            class21.method2316(this);
        } else if (field480 == 20) {
            class21.method2316(this);
            method164();
        } else if (field480 == 25) {
            method243(false);
            field524 = 0;
            boolean var6 = true;
            for (int var7 = 0; var7 < Statics.field974.length; var7++) {
                if (Statics.field373[var7] != -1 && Statics.field974[var7] == null) {
                    Statics.field974[var7] = Statics.field348.method3016(Statics.field373[var7], 0);
                    if (Statics.field974[var7] == null) {
                        var6 = false;
                        field524++;
                    }
                }
                if (Statics.field126[var7] != -1 && Statics.field397[var7] == null) {
                    Statics.field397[var7] = Statics.field348.method2987(Statics.field126[var7], 0, Statics.field2741[var7]);
                    if (Statics.field397[var7] == null) {
                        var6 = false;
                        field524++;
                    }
                }
            }
            if (var6) {
                field526 = 0;
                boolean var8 = true;
                for (int var9 = 0; var9 < Statics.field974.length; var9++) {
                    byte[] var10 = Statics.field397[var9];
                    if (var10 != null) {
                        int var11 = (Statics.field741[var9] >> 8) * 64 - Statics.field54;
                        int var12 = (Statics.field741[var9] & 0xFF) * 64 - Statics.field977;
                        if (field530) {
                            var11 = 10;
                            var12 = 10;
                        }
                        var8 &= class9.method2366(var10, var11, var12);
                    }
                }
                if (var8) {
                    if (field608 != 0) {
                        method1503(class134.field2301 + class2.field21 + class2.field20 + 100 + "%" + class2.field23, true);
                    }
                    method1847();
                    method1565();
                    method1847();
                    Statics.field1268.method2005();
                    method1847();
                    System.gc();
                    for (int var13 = 0; var13 < 4; var13++) {
                        field712[var13].method3200();
                    }
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                class9.field115[var14][var15][var16] = 0;
                            }
                        }
                    }
                    method1847();
                    class9.field116 = 99;
                    Statics.field117 = new byte[4][104][104];
                    Statics.field124 = new byte[4][104][104];
                    Statics.field119 = new byte[4][104][104];
                    Statics.field120 = new byte[4][104][104];
                    Statics.field1355 = new int[4][105][105];
                    Statics.field1998 = new byte[4][105][105];
                    Statics.field121 = new int[105][105];
                    Statics.field114 = new int[104];
                    Statics.field960 = new int[104];
                    Statics.field123 = new int[104];
                    Statics.field139 = new int[104];
                    Statics.field65 = new int[104];
                    int var17 = Statics.field974.length;
                    for (class7 var18 = (class7) class7.field91.method3326(); var18 != null; var18 = (class7) class7.field91.method3347()) {
                        if (var18.field90 != null) {
                            Statics.field2021.method1100(var18.field90);
                            var18.field90 = null;
                        }
                        if (var18.field96 != null) {
                            Statics.field2021.method1100(var18.field96);
                            var18.field96 = null;
                        }
                    }
                    class7.field91.method3320();
                    method243(true);
                    if (!field530) {
                        for (int var19 = 0; var19 < var17; var19++) {
                            int var20 = (Statics.field741[var19] >> 8) * 64 - Statics.field54;
                            int var21 = (Statics.field741[var19] & 0xFF) * 64 - Statics.field977;
                            byte[] var22 = Statics.field974[var19];
                            if (var22 != null) {
                                method1847();
                                class9.method692(var22, var20, var21, Statics.field125 * 8 - 48, Statics.field1266 * 8 - 48, field712);
                            }
                        }
                        for (int var23 = 0; var23 < var17; var23++) {
                            int var24 = (Statics.field741[var23] >> 8) * 64 - Statics.field54;
                            int var25 = (Statics.field741[var23] & 0xFF) * 64 - Statics.field977;
                            byte[] var26 = Statics.field974[var23];
                            if (var26 == null && Statics.field1266 < 800) {
                                method1847();
                                class9.method143(var24, var25, 64, 64);
                            }
                        }
                        method243(true);
                        for (int var27 = 0; var27 < var17; var27++) {
                            byte[] var28 = Statics.field397[var27];
                            if (var28 != null) {
                                int var29 = (Statics.field741[var27] >> 8) * 64 - Statics.field54;
                                int var30 = (Statics.field741[var27] & 0xFF) * 64 - Statics.field977;
                                method1847();
                                class9.method196(var28, var29, var30, Statics.field1268, field712);
                            }
                        }
                    }
                    if (field530) {
                        int var31 = 0;
                        label335: while (true) {
                            if (var31 >= 4) {
                                for (int var42 = 0; var42 < 13; var42++) {
                                    for (int var43 = 0; var43 < 13; var43++) {
                                        int var44 = field490[0][var42][var43];
                                        if (var44 == -1) {
                                            class9.method143(var42 * 8, var43 * 8, 8, 8);
                                        }
                                    }
                                }
                                method243(true);
                                int var45 = 0;
                                while (true) {
                                    if (var45 >= 4) {
                                        break label335;
                                    }
                                    method1847();
                                    for (int var46 = 0; var46 < 13; var46++) {
                                        for (int var47 = 0; var47 < 13; var47++) {
                                            int var48 = field490[var45][var46][var47];
                                            if (var48 != -1) {
                                                int var49 = var48 >> 24 & 0x3;
                                                int var50 = var48 >> 1 & 0x3;
                                                int var51 = var48 >> 14 & 0x3FF;
                                                int var52 = var48 >> 3 & 0x7FF;
                                                int var53 = (var51 / 8 << 8) + var52 / 8;
                                                for (int var54 = 0; var54 < Statics.field741.length; var54++) {
                                                    if (Statics.field741[var54] == var53 && Statics.field397[var54] != null) {
                                                        class9.method2824(Statics.field397[var54], var45, var46 * 8, var47 * 8, var49, (var51 & 0x7) * 8, (var52 & 0x7) * 8, var50, Statics.field1268, field712);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var45++;
                                }
                            }
                            method1847();
                            for (int var32 = 0; var32 < 13; var32++) {
                                for (int var33 = 0; var33 < 13; var33++) {
                                    boolean var34 = false;
                                    int var35 = field490[var31][var32][var33];
                                    if (var35 != -1) {
                                        int var36 = var35 >> 24 & 0x3;
                                        int var37 = var35 >> 1 & 0x3;
                                        int var38 = var35 >> 14 & 0x3FF;
                                        int var39 = var35 >> 3 & 0x7FF;
                                        int var40 = (var38 / 8 << 8) + var39 / 8;
                                        for (int var41 = 0; var41 < Statics.field741.length; var41++) {
                                            if (Statics.field741[var41] == var40 && Statics.field974[var41] != null) {
                                                class9.method168(Statics.field974[var41], var31, var32 * 8, var33 * 8, var36, (var38 & 0x7) * 8, (var39 & 0x7) * 8, var37, field712);
                                                var34 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var34) {
                                        class9.method2131(var31, var32 * 8, var33 * 8);
                                    }
                                }
                            }
                            var31++;
                        }
                    }
                    method243(true);
                    method1565();
                    method1847();
                    class9.method542(Statics.field1268, field712);
                    method243(true);
                    int var55 = class9.field116;
                    if (var55 > Statics.field2386) {
                        var55 = Statics.field2386;
                    }
                    if (var55 < Statics.field2386 - 1) {
                        int var56 = Statics.field2386 - 1;
                    }
                    if (field477) {
                        Statics.field1268.method1859(class9.field116);
                    } else {
                        Statics.field1268.method1859(0);
                    }
                    for (int var57 = 0; var57 < 104; var57++) {
                        for (int var58 = 0; var58 < 104; var58++) {
                            method167(var57, var58);
                        }
                    }
                    method1847();
                    for (class22 var59 = (class22) field502.method3326(); var59 != null; var59 = (class22) field502.method3347()) {
                        if (var59.field346 == -1) {
                            var59.field345 = 0;
                            method878(var59);
                        } else {
                            var59.method3359();
                        }
                    }
                    class32.field813.method3258();
                    if (Statics.field359 != null) {
                        field692.method2319(83);
                        field692.method2430(1057001181);
                    }
                    if (!field530) {
                        int var60 = (Statics.field125 - 6) / 8;
                        int var61 = (Statics.field125 + 6) / 8;
                        int var62 = (Statics.field1266 - 6) / 8;
                        int var63 = (Statics.field1266 + 6) / 8;
                        for (int var64 = var60 - 1; var64 <= var61 + 1; var64++) {
                            for (int var65 = var62 - 1; var65 <= var63 + 1; var65++) {
                                if (var64 < var60 || var64 > var61 || var65 < var62 || var65 > var63) {
                                    Statics.field348.method2978("m" + var64 + "_" + var65);
                                    Statics.field348.method2978("l" + var64 + "_" + var65);
                                }
                            }
                        }
                    }
                    method62(30);
                    method1847();
                    class9.method812();
                    field692.method2319(30);
                    Statics.field737.method1347();
                    for (int var66 = 0; var66 < 32; var66++) {
                        field1307[var66] = 0L;
                    }
                    for (int var67 = 0; var67 < 32; var67++) {
                        field1306[var67] = 0L;
                    }
                    Statics.field1231 = 0;
                } else {
                    field608 = 2;
                }
            } else {
                field608 = 1;
            }
        }
        if (field480 == 30) {
            method2924();
        } else if (field480 == 40) {
            method164();
        }
    }

    @ObfuscatedName("client.x(B)V")
    public final void method511() {
        boolean var1;
        label150: {
            try {
                if (class138.field2329 == 2) {
                    if (Statics.field111 == null) {
                        Statics.field111 = class139.method2706(Statics.field2327, Statics.field258, Statics.field2324);
                        if (Statics.field111 == null) {
                            var1 = false;
                            break label150;
                        }
                    }
                    if (Statics.field2330 == null) {
                        Statics.field2330 = new class58(Statics.field2323, Statics.field2321);
                    }
                    if (Statics.field2320.method2722(Statics.field111, Statics.field2325, Statics.field2330, 22050)) {
                        Statics.field2320.method2778();
                        Statics.field2320.method2748(Statics.field2326);
                        Statics.field2320.method2725(Statics.field111, Statics.field2322);
                        class138.field2329 = 0;
                        Statics.field111 = null;
                        Statics.field2330 = null;
                        Statics.field2327 = null;
                        var1 = true;
                        break label150;
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
                Statics.field2320.method2726();
                class138.field2329 = 0;
                Statics.field111 = null;
                Statics.field2330 = null;
                Statics.field2327 = null;
            }
            var1 = false;
        }
        if (var1 && field708 && Statics.field270 != null) {
            Statics.field270.method1165();
        }
        if (field1309) {
            class75.method691(Statics.field1494);
            Canvas var4 = Statics.field1494;
            var4.removeMouseListener(class77.field1368);
            var4.removeMouseMotionListener(class77.field1368);
            var4.removeFocusListener(class77.field1368);
            class77.field1370 = 0;
            if (Statics.field1805 != null) {
                Statics.field1805.method1351(Statics.field1494);
            }
            this.method1423();
            Canvas var5 = Statics.field1494;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class75.field1345);
            var5.addFocusListener(class75.field1345);
            class77.method1491(Statics.field1494);
            if (Statics.field1805 != null) {
                Statics.field1805.method1350(Statics.field1494);
            }
        }
        if (field480 == 0) {
            int var6 = class21.field313;
            String var7 = class21.field323;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1494.getGraphics();
                if (Statics.field1509 == null) {
                    Statics.field1509 = new Font("Helvetica", 1, 13);
                    Statics.field1201 = Statics.field1494.getFontMetrics(Statics.field1509);
                }
                if (field1313) {
                    field1313 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field182, Statics.field15);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field267 == null) {
                        Statics.field267 = Statics.field1494.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field267.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1509);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1201.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field267, Statics.field182 / 2 - 152, Statics.field15 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field182 / 2 - 152;
                    int var13 = Statics.field15 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1509);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1201.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field1494.repaint();
            }
        } else if (field480 == 5) {
            class21.method228(Statics.field2821, Statics.field251);
        } else if (field480 == 10) {
            class21.method228(Statics.field2821, Statics.field251);
        } else if (field480 == 20) {
            class21.method228(Statics.field2821, Statics.field251);
        } else if (field480 == 25) {
            if (field608 == 1) {
                if (field524 > field525) {
                    field525 = field524;
                }
                int var15 = (field525 * 50 - field524 * 50) / field525;
                method1503(class134.field2301 + class2.field21 + class2.field20 + var15 + "%" + class2.field23, false);
            } else if (field608 == 2) {
                if (field526 > field527) {
                    field527 = field526;
                }
                int var16 = (field527 * 50 - field526 * 50) / field527 + 50;
                method1503(class134.field2301 + class2.field21 + class2.field20 + var16 + "%" + class2.field23, false);
            } else {
                method1503(class134.field2301, false);
            }
        } else if (field480 == 30) {
            Statics.method152();
        } else if (field480 == 40) {
            method1503(class134.field2079 + class2.field21 + class134.field2080, false);
        }
        if (field480 == 30 && field479 == 0 && !field1313) {
            try {
                Graphics var17 = Statics.field1494.getGraphics();
                for (int var18 = 0; var18 < field515; var18++) {
                    if (field675[var18]) {
                        Statics.field468.method1614(var17, field677[var18], field508[var18], field679[var18], field580[var18]);
                        field675[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field1494.repaint();
            }
        } else if (field480 > 0) {
            try {
                Graphics var20 = Statics.field1494.getGraphics();
                Statics.field468.method1594(var20, 0, 0);
                field1313 = false;
                for (int var21 = 0; var21 < field515; var21++) {
                    field675[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field1494.repaint();
            }
        }
    }

    @ObfuscatedName("client.t(I)V")
    public final void method275() {
        if (Statics.field266 != null) {
            Statics.field266.field240 = false;
        }
        Statics.field266 = null;
        if (Statics.field137 != null) {
            Statics.field137.method1375();
            Statics.field137 = null;
        }
        if (class75.field1345 != null) {
            class75 var1 = class75.field1345;
            synchronized (class75.field1345) {
                class75.field1345 = null;
            }
        }
        if (class77.field1368 != null) {
            class77 var3 = class77.field1368;
            synchronized (class77.field1368) {
                class77.field1368 = null;
            }
        }
        Statics.field1805 = null;
        if (Statics.field270 != null) {
            Statics.field270.method1156();
        }
        if (Statics.field860 != null) {
            Statics.field860.method1156();
        }
        if (Statics.field2517 != null) {
            Statics.field2517.method1375();
        }
        class157.method1373();
        try {
            class82.field1413.method586();
            for (int var5 = 0; var5 < Statics.field1409; var5++) {
                Statics.field1406[var5].method586();
            }
            class82.field1412.method586();
            class82.field1415.method586();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("y.i(IB)V")
    public static void method62(int arg0) {
        if (field480 == arg0) {
            return;
        }
        if (field480 == 0) {
            Statics.field267 = null;
            Statics.field1509 = null;
            Statics.field1201 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field541 = 0;
            field505 = 0;
            field506 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1958 != null) {
            Statics.field1958.method1375();
            Statics.field1958 = null;
        }
        if (field480 == 25) {
            field608 = 0;
            field524 = 0;
            field525 = 1;
            field526 = 0;
            field527 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1494;
            class154 var2 = Statics.field104;
            class154 var3 = Statics.field1911;
            if (!Statics.field333) {
                class89.method1835();
                byte[] var4 = var2.method2976("title.jpg", "");
                Statics.field326 = new class86(var4, var1);
                Statics.field173 = Statics.field326.method1690();
                Statics.field1999 = class84.method40(var3, "logo", "");
                Statics.field299 = class84.method40(var3, "titlebox", "");
                Statics.field300 = class84.method40(var3, "titlebutton", "");
                Statics.field301 = class84.method197(var3, "runes", "");
                Statics.field303 = class84.method197(var3, "title_mute", "");
                Statics.field1442 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field1442[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field1442[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field1442[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field1442[var8 + 192] = 16777215;
                }
                Statics.field302 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field302[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field302[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field302[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field302[var12 + 192] = 16777215;
                }
                Statics.field363 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field363[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field363[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field363[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field363[var16 + 192] = 16777215;
                }
                Statics.field294 = new int[256];
                Statics.field909 = new int[32768];
                Statics.field2311 = new int[32768];
                class21.method1670((class87) null);
                Statics.field187 = new int[32768];
                Statics.field1907 = new int[32768];
                class21.field316 = 0;
                class21.field320 = "";
                class21.field321 = "";
                class21.field324 = false;
                if (field622 == 0) {
                    class21.field327 = true;
                } else {
                    class21.field327 = false;
                }
                if (class21.field327) {
                    class138.method33(2);
                } else {
                    class138.method2043(2, Statics.field98, "scape main", "", 255, false);
                }
                class153.method1589(false);
                Statics.field333 = true;
                Statics.field326.method1681(0, 0);
                Statics.field173.method1681(382, 0);
                Statics.field1999.method1765(382 - Statics.field1999.field1459 / 2, 18);
            }
        } else {
            class21.method244();
        }
        field480 = arg0;
    }

    @ObfuscatedName("client.z(I)V")
    public void method518() {
        if (field480 != 1000) {
            boolean var1 = class153.method2047();
            if (!var1) {
                this.method277();
            }
        }
    }

    @ObfuscatedName("client.o(I)V")
    public void method277() {
        if (class153.field2529 >= 4) {
            this.method1460("js5crc");
            field480 = 1000;
            return;
        }
        if (class153.field2530 >= 4) {
            if (field480 <= 5) {
                this.method1460("js5io");
                field480 = 1000;
                return;
            }
            field501 = 3000;
            class153.field2530 = 3;
        }
        if (--field501 + 1 > 0) {
            return;
        }
        try {
            if (field500 == 0) {
                Statics.field275 = Statics.field2333.method1475(Statics.field2553, Statics.field1312);
                field500++;
            }
            if (field500 == 1) {
                if (Statics.field275.field1394 == 2) {
                    this.method278(-1);
                    return;
                }
                if (Statics.field275.field1394 == 1) {
                    field500++;
                }
            }
            if (field500 == 2) {
                Statics.field27 = new class70((Socket) Statics.field275.field1391, Statics.field2333);
                class127 var1 = new class127(5);
                var1.method2482(15);
                var1.method2430(13);
                Statics.field27.method1380(var1.field2025, 0, 5);
                field500++;
                Statics.field67 = Statics.method2045();
            }
            if (field500 == 3) {
                if (field480 <= 5 || Statics.field27.method1379() > 0) {
                    int var2 = Statics.field27.method1377();
                    if (var2 != 0) {
                        this.method278(var2);
                        return;
                    }
                    field500++;
                } else if (Statics.method2045() - Statics.field67 > 30000L) {
                    this.method278(-2);
                    return;
                }
            }
            if (field500 == 4) {
                class153.method1499(Statics.field27, field480 > 20);
                Statics.field275 = null;
                Statics.field27 = null;
                field500 = 0;
                field503 = 0;
            }
        } catch (IOException var4) {
            this.method278(-3);
        }
    }

    @ObfuscatedName("client.u(II)V")
    public void method278(int arg0) {
        Statics.field275 = null;
        Statics.field27 = null;
        field500 = 0;
        if (Statics.field134 == Statics.field1312) {
            Statics.field1312 = Statics.field746;
        } else {
            Statics.field1312 = Statics.field134;
        }
        field503++;
        if (field503 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field480 <= 5) {
                this.method1460("js5connect_full");
                field480 = 1000;
            } else {
                field501 = 3000;
            }
        } else if (field503 >= 2 && arg0 == 6) {
            this.method1460("js5connect_outofdate");
            field480 = 1000;
        } else if (field503 >= 4) {
            if (field480 <= 5) {
                this.method1460("js5connect");
                field480 = 1000;
            } else {
                field501 = 3000;
            }
        }
    }

    @ObfuscatedName("j.f(B)V")
    public static void method4() {
        if (field499 == 0) {
            Statics.field1268 = new class95(4, 104, 104, class9.field141);
            for (int var0 = 0; var0 < 4; var0++) {
                field712[var0] = new class164(104, 104);
            }
            Statics.field469 = new class86(512, 512);
            class21.field323 = class134.field2201;
            class21.field313 = 5;
            field499 = 20;
        } else if (field499 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1749[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1892(var1, 500, 800, 512, 334);
            class21.field323 = class134.field2082;
            class21.field313 = 10;
            field499 = 30;
        } else if (field499 == 30) {
            Statics.field571 = method2672(0, false, true, true);
            Statics.field1229 = method2672(1, false, true, true);
            Statics.field375 = method2672(2, true, false, true);
            Statics.field1204 = method2672(3, false, true, true);
            Statics.field1316 = method2672(4, false, true, true);
            Statics.field348 = method2672(5, true, true, true);
            Statics.field98 = method2672(6, true, true, false);
            Statics.field1225 = method2672(7, false, true, true);
            Statics.field1911 = method2672(8, false, true, true);
            Statics.field1038 = method2672(9, false, true, true);
            Statics.field104 = method2672(10, false, true, true);
            Statics.field2047 = method2672(11, false, true, true);
            Statics.field1505 = method2672(12, false, true, true);
            Statics.field1963 = method2672(13, true, false, true);
            Statics.field2505 = method2672(14, false, true, false);
            Statics.field1028 = method2672(15, false, true, true);
            class21.field323 = class134.field2083;
            class21.field313 = 20;
            field499 = 40;
        } else if (field499 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field571.method3057() * 4 / 100;
            int var8 = var7 + Statics.field1229.method3057() * 4 / 100;
            int var9 = var8 + Statics.field375.method3057() * 2 / 100;
            int var10 = var9 + Statics.field1204.method3057() * 2 / 100;
            int var11 = var10 + Statics.field1316.method3057() * 6 / 100;
            int var12 = var11 + Statics.field348.method3057() * 4 / 100;
            int var13 = var12 + Statics.field98.method3057() * 2 / 100;
            int var14 = var13 + Statics.field1225.method3057() * 60 / 100;
            int var15 = var14 + Statics.field1911.method3057() * 2 / 100;
            int var16 = var15 + Statics.field1038.method3057() * 2 / 100;
            int var17 = var16 + Statics.field104.method3057() * 2 / 100;
            int var18 = var17 + Statics.field2047.method3057() * 2 / 100;
            int var19 = var18 + Statics.field1505.method3057() * 2 / 100;
            int var20 = var19 + Statics.field1963.method3057() * 2 / 100;
            int var21 = var20 + Statics.field2505.method3057() * 2 / 100;
            int var22 = var21 + Statics.field1028.method3057() * 2 / 100;
            if (var22 == 100) {
                class21.field323 = class134.field2085;
                class21.field313 = 30;
                field499 = 45;
            } else {
                if (var22 != 0) {
                    class21.field323 = class134.field2294 + var22 + "%";
                }
                class21.field313 = 30;
            }
        } else if (field499 == 45) {
            class52.method783(22050, !field477, 2);
            class141 var23 = new class141();
            var23.method2728(9, 128);
            Statics.field270 = class52.method801(Statics.field2333, Statics.field1494, 0, 22050);
            Statics.field270.method1153(var23);
            class138.method2041(Statics.field1028, Statics.field2505, Statics.field1316, var23);
            Statics.field860 = class52.method801(Statics.field2333, Statics.field1494, 1, 2048);
            Statics.field2021 = new class46();
            Statics.field860.method1153(Statics.field2021);
            Statics.field2019 = new class62(22050, Statics.field1205);
            class21.field323 = class134.field2086;
            class21.field313 = 35;
            field499 = 50;
        } else if (field499 == 50) {
            int var24 = 0;
            if (Statics.field251 == null) {
                class154 var25 = Statics.field1911;
                class154 var26 = Statics.field1963;
                int var27 = var25.method2974("p11_full");
                int var28 = var25.method2975(var27, "");
                class183 var29;
                if (class84.method30(var25, var27, var28)) {
                    byte[] var30 = var26.method3016(var27, var28);
                    class183 var31;
                    if (var30 == null) {
                        var31 = null;
                    } else {
                        class183 var32 = new class183(var30, Statics.field1429, Statics.field1430, Statics.field1426, Statics.field1432, Statics.field55, Statics.field110);
                        class84.method806();
                        var31 = var32;
                    }
                    var29 = var31;
                } else {
                    var29 = null;
                }
                Statics.field251 = var29;
            } else {
                var24++;
            }
            if (Statics.field1905 == null) {
                class154 var34 = Statics.field1911;
                class154 var35 = Statics.field1963;
                int var36 = var34.method2974("p12_full");
                int var37 = var34.method2975(var36, "");
                class183 var38;
                if (class84.method30(var34, var36, var37)) {
                    byte[] var39 = var35.method3016(var36, var37);
                    class183 var40;
                    if (var39 == null) {
                        var40 = null;
                    } else {
                        class183 var41 = new class183(var39, Statics.field1429, Statics.field1430, Statics.field1426, Statics.field1432, Statics.field55, Statics.field110);
                        class84.method806();
                        var40 = var41;
                    }
                    var38 = var40;
                } else {
                    var38 = null;
                }
                Statics.field1905 = var38;
            } else {
                var24++;
            }
            if (Statics.field2821 == null) {
                class154 var43 = Statics.field1911;
                class154 var44 = Statics.field1963;
                int var45 = var43.method2974("b12_full");
                int var46 = var43.method2975(var45, "");
                class183 var47;
                if (class84.method30(var43, var45, var46)) {
                    byte[] var48 = var44.method3016(var45, var46);
                    class183 var49;
                    if (var48 == null) {
                        var49 = null;
                    } else {
                        class183 var50 = new class183(var48, Statics.field1429, Statics.field1430, Statics.field1426, Statics.field1432, Statics.field55, Statics.field110);
                        class84.method806();
                        var49 = var50;
                    }
                    var47 = var49;
                } else {
                    var47 = null;
                }
                Statics.field2821 = var47;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class21.field323 = class134.field2172 + var24 * 100 / 3 + "%";
                class21.field313 = 40;
            } else {
                Statics.field1491 = new class151(true);
                class21.field323 = class134.field2088;
                class21.field313 = 40;
                field499 = 60;
            }
        } else if (field499 == 60) {
            int var52 = class21.method1587(Statics.field104, Statics.field1911);
            int var53 = class21.method35();
            if (var52 < var53) {
                class21.field323 = class134.field2089 + var52 * 100 / var53 + "%";
                class21.field313 = 50;
            } else {
                class21.field323 = class134.field2090;
                class21.field313 = 50;
                method62(5);
                field499 = 70;
            }
        } else if (field499 == 70) {
            if (Statics.field375.method2963()) {
                class154 var54 = Statics.field375;
                Statics.field954 = var54;
                class33.method225(Statics.field375);
                class36.method889(Statics.field375, Statics.field1225);
                class154 var55 = Statics.field375;
                class154 var56 = Statics.field1225;
                boolean var57 = field477;
                Statics.field810 = var55;
                Statics.field811 = var56;
                class32.field840 = var57;
                class154 var58 = Statics.field375;
                class154 var59 = Statics.field1225;
                Statics.field806 = var58;
                Statics.field794 = var59;
                class154 var60 = Statics.field375;
                class154 var61 = Statics.field1225;
                boolean var62 = field476;
                class183 var63 = Statics.field251;
                Statics.field1006 = var60;
                Statics.field979 = var61;
                Statics.field980 = var62;
                Statics.field1006.method2969(10);
                Statics.field362 = var63;
                class34.method2897(Statics.field375, Statics.field571, Statics.field1229);
                class35.method639(Statics.field375, Statics.field1225);
                class154 var64 = Statics.field375;
                Statics.field957 = var64;
                class42.method5(Statics.field375);
                class154 var65 = Statics.field1204;
                class154 var66 = Statics.field1225;
                class154 var67 = Statics.field1911;
                class154 var68 = Statics.field1963;
                Statics.field2565 = var65;
                Statics.field2566 = var66;
                Statics.field2567 = var67;
                Statics.field2603 = var68;
                Statics.field2627 = new class158[Statics.field2565.method2988()][];
                Statics.field2599 = new boolean[Statics.field2565.method2988()];
                class41.method2941(Statics.field375);
                class154 var69 = Statics.field375;
                Statics.field968 = var69;
                class21.field323 = class134.field2092;
                class21.field313 = 60;
                field499 = 80;
            } else {
                class21.field323 = class134.field2269 + Statics.field375.method3050() + "%";
                class21.field313 = 60;
            }
        } else if (field499 == 80) {
            int var70 = 0;
            if (Statics.field401 == null) {
                Statics.field401 = class84.method163(Statics.field1911, "compass", "");
            } else {
                var70++;
            }
            if (Statics.field721 == null) {
                Statics.field721 = class84.method163(Statics.field1911, "mapedge", "");
            } else {
                var70++;
            }
            if (Statics.field51 == null) {
                Statics.field51 = class84.method197(Statics.field1911, "mapscene", "");
            } else {
                var70++;
            }
            if (Statics.field2302 == null) {
                Statics.field2302 = class84.method165(Statics.field1911, "mapfunction", "");
            } else {
                var70++;
            }
            if (Statics.field210 == null) {
                Statics.field210 = class84.method165(Statics.field1911, "hitmarks", "");
            } else {
                var70++;
            }
            if (Statics.field11 == null) {
                Statics.field11 = class84.method165(Statics.field1911, "headicons_pk", "");
            } else {
                var70++;
            }
            if (Statics.field465 == null) {
                Statics.field465 = class84.method165(Statics.field1911, "headicons_prayer", "");
            } else {
                var70++;
            }
            if (Statics.field1739 == null) {
                Statics.field1739 = class84.method165(Statics.field1911, "headicons_hint", "");
            } else {
                var70++;
            }
            if (Statics.field17 == null) {
                Statics.field17 = class84.method165(Statics.field1911, "mapmarker", "");
            } else {
                var70++;
            }
            if (Statics.field2451 == null) {
                Statics.field2451 = class84.method165(Statics.field1911, "cross", "");
            } else {
                var70++;
            }
            if (Statics.field12 == null) {
                Statics.field12 = class84.method165(Statics.field1911, "mapdots", "");
            } else {
                var70++;
            }
            if (Statics.field877 == null) {
                Statics.field877 = class84.method197(Statics.field1911, "scrollbar", "");
            } else {
                var70++;
            }
            if (Statics.field962 == null) {
                Statics.field962 = class84.method197(Statics.field1911, "mod_icons", "");
            } else {
                var70++;
            }
            if (Statics.field805 == null) {
                Statics.field805 = class84.method40(Statics.field1911, "mapback", "");
            } else {
                var70++;
            }
            if (var70 < 14) {
                class21.field323 = class134.field2093 + var70 * 100 / 14 + "%";
                class21.field313 = 70;
            } else {
                Statics.field2842 = Statics.field962;
                Statics.field721.method1675();
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 41.0D) - 20;
                for (int var75 = 0; var75 < Statics.field2302.length; var75++) {
                    Statics.field2302[var75].method1678(var71 + var74, var72 + var74, var73 + var74);
                }
                Statics.field51[0].method1777(var71 + var74, var72 + var74, var73 + var74);
                method156();
                class21.field323 = class134.field2163;
                class21.field313 = 70;
                field499 = 90;
            }
        } else if (field499 == 90) {
            if (Statics.field1038.method2963()) {
                class110 var76 = new class110(Statics.field1038, Statics.field1911, 20, 0.8D, field477 ? 64 : 128);
                class104.method2137(var76);
                class104.method2138(0.8D);
                class21.field323 = class134.field2074;
                class21.field313 = 90;
                field499 = 110;
            } else {
                class21.field323 = class134.field2095 + Statics.field1038.method3050() + "%";
                class21.field313 = 90;
            }
        } else if (field499 == 110) {
            Statics.field266 = new class16();
            Statics.field2333.method1479(Statics.field266, 10);
            class21.field323 = class134.field2097;
            class21.field313 = 94;
            field499 = 120;
        } else if (field499 == 120) {
            if (Statics.field104.method2977("huffman", "")) {
                class120 var77 = new class120(Statics.field104.method2976("huffman", ""));
                Statics.field2831 = var77;
                class21.field323 = class134.field2290;
                class21.field313 = 96;
                field499 = 130;
            } else {
                class21.field323 = class134.field2098 + "%";
                class21.field313 = 96;
            }
        } else if (field499 == 130) {
            if (!Statics.field1204.method2963()) {
                class21.field323 = class134.field2094 + Statics.field1204.method3050() * 4 / 5 + "%";
                class21.field313 = 100;
            } else if (!Statics.field1505.method2963()) {
                class21.field323 = class134.field2094 + (80 + Statics.field1505.method3050() / 6) + "%";
                class21.field313 = 100;
            } else if (Statics.field1963.method2963()) {
                class21.field323 = class134.field2101;
                class21.field313 = 100;
                field499 = 140;
            } else {
                class21.field323 = class134.field2094 + (96 + Statics.field1963.method3050() / 20) + "%";
                class21.field313 = 100;
            }
        } else if (field499 == 140) {
            method62(10);
        }
    }

    @ObfuscatedName("eh.k(IZZZB)Lei;")
    public static class154 method2672(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1413 != null) {
            var4 = new class71(arg0, class82.field1413, Statics.field1406[arg0], 1000000);
        }
        return new class154(var4, Statics.field1916, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("k.q(I)V")
    public static void method156() {
        Statics.field249 = new int[33];
        Statics.field374 = new int[33];
        Statics.field81 = new int[151];
        Statics.field68 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field805.field1460[Statics.field805.field1459 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field249[var0] = var1;
            Statics.field374[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field805.field1460[Statics.field805.field1459 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field81[var4 - 5] = var5 - 25;
            Statics.field68[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("a.a(I)V")
    public static final void method164() {
        try {
            if (field541 == 0) {
                if (Statics.field137 != null) {
                    Statics.field137.method1375();
                    Statics.field137 = null;
                }
                Statics.field206 = null;
                field522 = false;
                field505 = 0;
                field541 = 1;
            }
            if (field541 == 1) {
                if (Statics.field206 == null) {
                    Statics.field206 = Statics.field2333.method1475(Statics.field2553, Statics.field1312);
                }
                if (Statics.field206.field1394 == 2) {
                    throw new IOException();
                }
                if (Statics.field206.field1394 == 1) {
                    Statics.field137 = new class70((Socket) Statics.field206.field1391, Statics.field2333);
                    Statics.field206 = null;
                    field541 = 2;
                }
            }
            if (field541 == 2) {
                field692.field2022 = 0;
                field692.method2482(14);
                Statics.field137.method1380(field692.field2025, 0, 1);
                field513.field2022 = 0;
                field541 = 3;
            }
            if (field541 == 3) {
                if (Statics.field270 != null) {
                    Statics.field270.method1181();
                }
                if (Statics.field860 != null) {
                    Statics.field860.method1181();
                }
                int var0 = Statics.field137.method1377();
                if (Statics.field270 != null) {
                    Statics.field270.method1181();
                }
                if (Statics.field860 != null) {
                    Statics.field860.method1181();
                }
                if (var0 != 0) {
                    method241(var0);
                    return;
                }
                field513.field2022 = 0;
                field541 = 5;
            }
            if (field541 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field692.field2022 = 0;
                field692.method2482(10);
                field692.method2430(var1[0]);
                field692.method2430(var1[1]);
                field692.method2430(var1[2]);
                field692.method2430(var1[3]);
                field692.method2431(0L);
                field692.method2432(class21.field321);
                field692.method2459(class6.field77, class6.field72);
                field512.field2022 = 0;
                if (field480 == 40) {
                    field512.method2482(18);
                } else {
                    field512.method2482(16);
                }
                field512.method2428(0);
                int var2 = field512.field2022;
                field512.method2430(13);
                field512.method2435(field692.field2025, 0, field692.field2022);
                int var3 = field512.field2022;
                field512.method2432(class21.field320);
                field512.method2482(field477 ? 1 : 0);
                class82.method3148(field512);
                class127 var4 = new class127(Statics.field1491.method2945());
                Statics.field1491.method2953(var4);
                field512.method2435(var4.field2025, 0, var4.field2025.length);
                field512.method2430(Statics.field571.field2501);
                field512.method2430(Statics.field1229.field2501);
                field512.method2430(Statics.field375.field2501);
                field512.method2430(Statics.field1204.field2501);
                field512.method2430(Statics.field1316.field2501);
                field512.method2430(Statics.field348.field2501);
                field512.method2430(Statics.field98.field2501);
                field512.method2430(Statics.field1225.field2501);
                field512.method2430(Statics.field1911.field2501);
                field512.method2430(Statics.field1038.field2501);
                field512.method2430(Statics.field104.field2501);
                field512.method2430(Statics.field2047.field2501);
                field512.method2430(Statics.field1505.field2501);
                field512.method2430(Statics.field1963.field2501);
                field512.method2430(Statics.field2505.field2501);
                field512.method2430(Statics.field1028.field2501);
                field512.method2457(var1, var3, field512.field2022);
                field512.method2437(field512.field2022 - var2);
                Statics.field137.method1380(field512.field2025, 0, field512.field2022);
                field692.method2318(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field513.method2318(var1);
                field541 = 6;
            }
            if (field541 == 6 && Statics.field137.method1379() > 0) {
                int var6 = Statics.field137.method1377();
                if (var6 == 21 && field480 == 20) {
                    field541 = 7;
                } else if (var6 == 2) {
                    field541 = 9;
                } else if (var6 == 15 && field480 == 40) {
                    field692.field2022 = 0;
                    field513.field2022 = 0;
                    field540 = -1;
                    field672 = -1;
                    field578 = -1;
                    field521 = -1;
                    field514 = 0;
                    field516 = 0;
                    field653 = 0;
                    field614 = 0;
                    field613 = false;
                    field705 = 0;
                    field703 = 0;
                    for (int var7 = 0; var7 < field693.length; var7++) {
                        if (field693[var7] != null) {
                            field693[var7].field420 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field631.length; var8++) {
                        if (field631[var8] != null) {
                            field631[var8].field420 = -1;
                        }
                    }
                    class19.method146();
                    method62(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field674[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field506 < 1) {
                    field506++;
                    field541 = 0;
                } else {
                    method241(var6);
                    return;
                }
            }
            if (field541 == 7 && Statics.field137.method1379() > 0) {
                field507 = (Statics.field137.method1377() + 3) * 60;
                field541 = 8;
            }
            if (field541 == 8) {
                field505 = 0;
                class21.method800(class134.field2102, class134.field2103, field507 / 60 + class134.field2283);
                if (--field507 <= 0) {
                    field541 = 0;
                }
            } else {
                if (field541 == 9 && Statics.field137.method1379() >= 8) {
                    field638 = Statics.field137.method1377();
                    field639 = Statics.field137.method1377() == 1;
                    field597 = Statics.field137.method1377();
                    field597 <<= 0x8;
                    field597 += Statics.field137.method1377();
                    field598 = Statics.field137.method1377();
                    Statics.field137.method1390(field513.field2025, 0, 1);
                    field513.field2022 = 0;
                    field540 = field513.method2325();
                    Statics.field137.method1390(field513.field2025, 0, 2);
                    field513.field2022 = 0;
                    field514 = field513.method2609();
                    if (field598 == 1) {
                        try {
                            class67.method1364(Statics.field471, "zap");
                        } catch (Throwable var26) {
                        }
                    } else {
                        try {
                            class67.method1364(Statics.field471, "unzap");
                        } catch (Throwable var25) {
                        }
                    }
                    field541 = 10;
                }
                if (field541 != 10) {
                    field505++;
                    if (field505 > 2000) {
                        if (field506 < 1) {
                            if (Statics.field134 == Statics.field1312) {
                                Statics.field1312 = Statics.field746;
                            } else {
                                Statics.field1312 = Statics.field134;
                            }
                            field506++;
                            field541 = 0;
                        } else {
                            method241(-3);
                        }
                    }
                } else if (Statics.field137.method1379() >= field514) {
                    field513.field2022 = 0;
                    Statics.field137.method1390(field513.field2025, 0, field514);
                    field483 = -1L;
                    field486 = -1;
                    Statics.field266.field243 = 0;
                    Statics.field1029 = true;
                    field487 = true;
                    field695 = -1L;
                    class182.field2830 = new class177();
                    field692.field2022 = 0;
                    field513.field2022 = 0;
                    field540 = -1;
                    field672 = -1;
                    field578 = -1;
                    field521 = -1;
                    field516 = 0;
                    field653 = 0;
                    field518 = 0;
                    field520 = 0;
                    field614 = 0;
                    field613 = false;
                    class77.field1380 = 0;
                    for (int var12 = 0; var12 < 100; var12++) {
                        field685[var12] = null;
                    }
                    field686 = 0;
                    field625 = 0;
                    field627 = false;
                    field680 = 0;
                    field538 = (int) (Math.random() * 100.0D) - 50;
                    field576 = (int) (Math.random() * 110.0D) - 55;
                    field634 = (int) (Math.random() * 80.0D) - 40;
                    field545 = (int) (Math.random() * 120.0D) - 60;
                    field547 = (int) (Math.random() * 30.0D) - 20;
                    field558 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field705 = 0;
                    field698 = -1;
                    field703 = 0;
                    field704 = 0;
                    field592 = 0;
                    field509 = 0;
                    for (int var13 = 0; var13 < 2048; var13++) {
                        field693[var13] = null;
                        field734[var13] = null;
                    }
                    for (int var14 = 0; var14 < 32768; var14++) {
                        field631[var14] = null;
                    }
                    Statics.field71 = field693[2047] = new class3();
                    field662.method3320();
                    field554.method3320();
                    for (int var15 = 0; var15 < 4; var15++) {
                        for (int var16 = 0; var16 < 104; var16++) {
                            for (int var17 = 0; var17 < 104; var17++) {
                                field605[var15][var16][var17] = null;
                            }
                        }
                    }
                    field502 = new class177();
                    field595 = 0;
                    field723 = 0;
                    for (int var18 = 0; var18 < Statics.field1032; var18++) {
                        class42 var19 = class42.method1501(var18);
                        if (var19 != null && var19.field1035 == 0) {
                            class159.field2694[var18] = 0;
                            class159.field2693[var18] = 0;
                        }
                    }
                    for (int var20 = 0; var20 < field665.length; var20++) {
                        field665[var20] = -1;
                    }
                    if (field586 != -1) {
                        class158.method2211(field586);
                    }
                    for (class4 var21 = (class4) field632.method3316(); var21 != null; var21 = (class4) field632.method3306()) {
                        method2360(var21, true);
                    }
                    field586 = -1;
                    field632 = new class175(8);
                    field557 = null;
                    field613 = false;
                    field614 = 0;
                    field729.method3174((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var22 = 0; var22 < 8; var22++) {
                        field681[var22] = null;
                        field603[var22] = false;
                    }
                    class19.method146();
                    field481 = true;
                    for (int var23 = 0; var23 < 100; var23++) {
                        field674[var23] = true;
                    }
                    field696 = null;
                    Statics.field86 = 0;
                    Statics.field1362 = null;
                    Statics.field125 = -1;
                    method599(false);
                    field540 = -1;
                }
            }
        } catch (IOException var27) {
            if (field506 < 1) {
                if (Statics.field134 == Statics.field1312) {
                    Statics.field1312 = Statics.field746;
                } else {
                    Statics.field1312 = Statics.field134;
                }
                field506++;
                field541 = 0;
            } else {
                method241(-2);
            }
        }
    }

    @ObfuscatedName("s.w(II)V")
    public static void method241(int arg0) {
        if (arg0 == -3) {
            class21.method800(class134.field2105, class134.field2170, class134.field2277);
        } else if (arg0 == -2) {
            class21.method800(class134.field2236, class134.field2109, class134.field2110);
        } else if (arg0 == -1) {
            class21.method800(class134.field2111, class134.field2280, class134.field2113);
        } else if (arg0 == 3) {
            class21.method800(class134.field2114, class134.field2115, class134.field2116);
        } else if (arg0 == 4) {
            class21.method800(class134.field2183, class134.field2118, class134.field2119);
        } else if (arg0 == 5) {
            class21.method800(class134.field2120, class134.field2121, class134.field2122);
        } else if (arg0 == 6) {
            class21.method800(class134.field2157, class134.field2124, class134.field2125);
        } else if (arg0 == 7) {
            class21.method800(class134.field2126, class134.field2127, class134.field2128);
        } else if (arg0 == 8) {
            class21.method800(class134.field2129, class134.field2130, class134.field2106);
        } else if (arg0 == 9) {
            class21.method800(class134.field2132, class134.field2133, class134.field2131);
        } else if (arg0 == 10) {
            class21.method800(class134.field2135, class134.field2117, class134.field2137);
        } else if (arg0 == 11) {
            class21.method800(class134.field2138, class134.field2261, class134.field2140);
        } else if (arg0 == 12) {
            class21.method800(class134.field2136, class134.field2142, class134.field2248);
        } else if (arg0 == 13) {
            class21.method800(class134.field2267, class134.field2145, class134.field2146);
        } else if (arg0 == 14) {
            class21.method800(class134.field2147, class134.field2148, class134.field2211);
        } else if (arg0 == 16) {
            class21.method800(class134.field2108, class134.field2166, class134.field2179);
        } else if (arg0 == 17) {
            class21.method800(class134.field2153, class134.field2154, class134.field2208);
        } else if (arg0 == 18) {
            class21.method800(class134.field2091, class134.field2258, class134.field2158);
        } else if (arg0 == 19) {
            class21.method800(class134.field2159, class134.field2160, class134.field2161);
        } else if (arg0 == 20) {
            class21.method800(class134.field2162, class134.field2164, class134.field2078);
        } else if (arg0 == 22) {
            class21.method800(class134.field2165, class134.field2191, class134.field2167);
        } else if (arg0 == 23) {
            class21.method800(class134.field2284, class134.field2169, class134.field2199);
        } else if (arg0 == 24) {
            class21.method800(class134.field2171, class134.field2289, class134.field2173);
        } else if (arg0 == 25) {
            class21.method800(class134.field2174, class134.field2175, class134.field2286);
        } else if (arg0 == 26) {
            class21.method800(class134.field2176, class134.field2178, class134.field2084);
        } else if (arg0 == 27) {
            class21.method800(class134.field2180, class134.field2181, class134.field2182);
        } else if (arg0 == 31) {
            class21.method800(class134.field2226, class134.field2213, class134.field2225);
        } else if (arg0 == 32) {
            class21.method800(class134.field2192, class134.field2193, class134.field2194);
        } else if (arg0 == 37) {
            class21.method800(class134.field2156, class134.field2071, class134.field2197);
        } else if (arg0 == 38) {
            class21.method800(class134.field2081, class134.field2281, class134.field2200);
        } else if (arg0 == 55) {
            class21.method800(class134.field2152, class134.field2202, class134.field2203);
        } else {
            class21.method800(class134.field2204, class134.field2279, class134.field2206);
        }
        method62(10);
    }

    @ObfuscatedName("ap.g(B)V")
    public static final void method545() {
        if (Statics.field137 != null) {
            Statics.field137.method1375();
            Statics.field137 = null;
        }
        method1565();
        Statics.field1268.method2005();
        for (int var0 = 0; var0 < 4; var0++) {
            field712[var0].method3200();
        }
        System.gc();
        class138.method33(2);
        field573 = -1;
        field708 = false;
        for (class7 var1 = (class7) class7.field91.method3326(); var1 != null; var1 = (class7) class7.field91.method3347()) {
            if (var1.field90 != null) {
                Statics.field2021.method1100(var1.field90);
                var1.field90 = null;
            }
            if (var1.field96 != null) {
                Statics.field2021.method1100(var1.field96);
                var1.field96 = null;
            }
        }
        class7.field91.method3320();
        method62(10);
    }

    @ObfuscatedName("bm.l(I)V")
    public static final void method1565() {
        Statics.method1850();
        class33.method1157();
        class36.method34();
        class32.field812.method3258();
        class32.field813.method3258();
        class32.field821.method3258();
        class32.field815.method3258();
        class31.field769.method3258();
        class31.field777.method3258();
        class40.field1023.method3258();
        class40.field982.method3258();
        class40.field983.method3258();
        class34.method2196();
        class35.field896.method3258();
        class35.field897.method3258();
        class38.field956.method3258();
        class42.method238();
        class163.method803();
        class158.field2569.method3258();
        class158.field2570.method3258();
        class158.field2626.method3258();
        ((class110) Statics.field1761).method2219();
        class5.field69.method3258();
        Statics.field571.method2992();
        Statics.field1229.method2992();
        Statics.field1204.method2992();
        Statics.field1316.method2992();
        Statics.field348.method2992();
        Statics.field98.method2992();
        Statics.field1225.method2992();
        Statics.field1911.method2992();
        Statics.field1038.method2992();
        Statics.field104.method2992();
        Statics.field2047.method2992();
        Statics.field1505.method2992();
    }

    @ObfuscatedName("cj.m(I)V")
    public static final void method1856() {
        if (field518 > 0) {
            method545();
        } else {
            method62(40);
            Statics.field1958 = Statics.field137;
            Statics.field137 = null;
        }
    }

    @ObfuscatedName("en.b(I)V")
    public static final void method2924() {
        if (field653 > 1) {
            field653--;
        }
        if (field518 > 0) {
            field518--;
        }
        if (field522) {
            field522 = false;
            method1856();
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field137 == null) {
                var1 = false;
            } else {
                label2899: {
                    try {
                        int var2 = Statics.field137.method1379();
                        if (var2 == 0) {
                            var1 = false;
                            break label2899;
                        }
                        if (field540 == -1) {
                            Statics.field137.method1390(field513.field2025, 0, 1);
                            field513.field2022 = 0;
                            field540 = field513.method2325();
                            field514 = class165.field2769[field540];
                            var2--;
                        }
                        if (field514 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2899;
                            }
                            Statics.field137.method1390(field513.field2025, 0, 1);
                            field514 = field513.field2025[0] & 0xFF;
                            var2--;
                        }
                        if (field514 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2899;
                            }
                            Statics.field137.method1390(field513.field2025, 0, 2);
                            field513.field2022 = 0;
                            field514 = field513.method2609();
                            var2 -= 2;
                        }
                        if (var2 < field514) {
                            var1 = false;
                            break label2899;
                        }
                        field513.field2022 = 0;
                        Statics.field137.method1390(field513.field2025, 0, field514);
                        field516 = 0;
                        field521 = field578;
                        field578 = field672;
                        field672 = field540;
                        if (field540 == 17) {
                            String var3 = field513.method2449();
                            long var4 = field513.method2575();
                            long var6 = (long) field513.method2609();
                            long var8 = (long) field513.method2461();
                            int var10 = field513.method2441();
                            long var11 = (var6 << 32) + var8;
                            boolean var13 = false;
                            for (int var14 = 0; var14 < 100; var14++) {
                                if (field690[var14] == var11) {
                                    var13 = true;
                                    break;
                                }
                            }
                            if (var10 <= 1 && method1403(var3)) {
                                var13 = true;
                            }
                            if (!var13 && field590 == 0) {
                                field690[field691] = var11;
                                field691 = (field691 + 1) % 100;
                                class116 var15 = field513;
                                String var19;
                                try {
                                    int var16 = var15.method2454();
                                    if (var16 > 32767) {
                                        var16 = 32767;
                                    }
                                    byte[] var17 = new byte[var16];
                                    var15.field2022 += Statics.field2831.method2370(var15.field2025, var15.field2022, var17, 0, var16);
                                    String var18 = class149.method2313(var17, 0, var16);
                                    var19 = var18;
                                } catch (Exception var429) {
                                    var19 = "Cabbage";
                                }
                                String var22 = class185.method3398(class147.method2674(var19));
                                if (var10 == 2 || var10 == 3) {
                                    method1416(9, class2.method429(1) + var3, var22, class146.method632(var4));
                                } else if (var10 == 1) {
                                    method1416(9, class2.method429(0) + var3, var22, class146.method632(var4));
                                } else {
                                    method1416(9, var3, var22, class146.method632(var4));
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 64) {
                            field705 = field513.method2441();
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 78) {
                            field636 = false;
                            for (int var23 = 0; var23 < 5; var23++) {
                                field718[var23] = false;
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 144) {
                            String var24 = field513.method2449();
                            Object[] var25 = new Object[var24.length() + 1];
                            for (int var26 = var24.length() - 1; var26 >= 0; var26--) {
                                if (var24.charAt(var26) == 's') {
                                    var25[var26 + 1] = field513.method2449();
                                } else {
                                    var25[var26 + 1] = Integer.valueOf(field513.method2446());
                                }
                            }
                            var25[0] = Integer.valueOf(field513.method2446());
                            class1 var27 = new class1();
                            var27.field4 = var25;
                            class26.method2(var27);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 139) {
                            int var28 = field513.method2475();
                            class19.method2309(var28);
                            field657[++field658 - 1 & 0x1F] = var28 & 0x7FFF;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 123) {
                            field703 = 0;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 221) {
                            int var29 = field513.method2441();
                            int var30 = field513.method2441();
                            int var31 = field513.method2441();
                            int var32 = field513.method2441();
                            field718[var29] = true;
                            field719[var29] = var30;
                            field644[var29] = var31;
                            field611[var29] = var32;
                            field722[var29] = 0;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 143) {
                            int var33 = field513.method2475();
                            if (var33 == 65535) {
                                var33 = -1;
                            }
                            Statics.method134(var33);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 254) {
                            int var34 = field513.method2461();
                            int var35 = field513.method2609();
                            if (var35 == 65535) {
                                var35 = -1;
                            }
                            method28(var35, var34);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 62) {
                            int var36 = field513.method2446();
                            int var37 = field513.method2494();
                            if (var37 == 65535) {
                                var37 = -1;
                            }
                            int var38 = field513.method2446();
                            class158 var39 = class158.method3(var36);
                            if (var39.field2573) {
                                var39.field2678 = var37;
                                var39.field2679 = var38;
                                class40 var41 = class40.method789(var37);
                                var39.field2614 = var41.field992;
                                var39.field2615 = var41.field981;
                                var39.field2589 = var41.field997;
                                var39.field2612 = var41.field1021;
                                var39.field2613 = var41.field996;
                                var39.field2656 = var41.field991;
                                if (var39.field2583 > 0) {
                                    var39.field2656 = var39.field2656 * 32 / var39.field2583;
                                }
                                method1586(var39);
                            } else {
                                if (var37 == -1) {
                                    var39.field2687 = 0;
                                    field540 = -1;
                                    var1 = true;
                                    break label2899;
                                }
                                class40 var40 = class40.method789(var37);
                                var39.field2687 = 4;
                                var39.field2607 = var37;
                                var39.field2614 = var40.field992;
                                var39.field2615 = var40.field981;
                                var39.field2656 = var40.field991 * 100 / var38;
                                method1586(var39);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 242) {
                            class182.method695(field513, field514);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 36) {
                            int var42 = field513.method2446();
                            int var43 = field513.method2474();
                            int var44 = field513.method2494();
                            if (var44 == 65535) {
                                var44 = -1;
                            }
                            int var45 = field513.method2494();
                            if (var45 == 65535) {
                                var45 = -1;
                            }
                            for (int var46 = var45; var46 <= var44; var46++) {
                                long var47 = ((long) var43 << 32) + (long) var46;
                                class179 var49 = field671.method3302(var47);
                                if (var49 != null) {
                                    var49.method3359();
                                }
                                field671.method3318(new class171(var42), var47);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 122) {
                            field528 = field513.method2441();
                            field689 = field513.method2441();
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 73) {
                            field661 = field654;
                            if (field514 == 0) {
                                field696 = null;
                                field697 = null;
                                Statics.field86 = 0;
                                Statics.field1362 = null;
                                field540 = -1;
                                var1 = true;
                            } else {
                                field697 = field513.method2449();
                                long var50 = field513.method2575();
                                long var52 = var50;
                                String var54;
                                if (var50 <= 0L || var50 >= 6582952005840035281L) {
                                    var54 = null;
                                } else if (var50 % 37L == 0L) {
                                    var54 = null;
                                } else {
                                    int var55 = 0;
                                    for (long var56 = var50; var56 != 0L; var56 /= 37L) {
                                        var55++;
                                    }
                                    StringBuilder var58 = new StringBuilder(var55);
                                    while (var52 != 0L) {
                                        long var59 = var52;
                                        var52 /= 37L;
                                        var58.append(class146.field2431[(int) (var59 - var52 * 37L)]);
                                    }
                                    var54 = var58.reverse().toString();
                                }
                                field696 = var54;
                                Statics.field168 = field513.method2442();
                                int var61 = field513.method2441();
                                if (var61 == 255) {
                                    field540 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field86 = var61;
                                    class8[] var62 = new class8[100];
                                    for (int var63 = 0; var63 < Statics.field86; var63++) {
                                        var62[var63] = new class8();
                                        var62[var63].field105 = field513.method2449();
                                        var62[var63].field109 = class148.method747(var62[var63].field105, Statics.field204);
                                        var62[var63].field106 = field513.method2609();
                                        var62[var63].field107 = field513.method2442();
                                        field513.method2449();
                                        if (var62[var63].field105.equals(Statics.field71.field39)) {
                                            Statics.field169 = var62[var63].field107;
                                        }
                                    }
                                    boolean var64 = false;
                                    int var65 = Statics.field86;
                                    while (var65 > 0) {
                                        boolean var66 = true;
                                        var65--;
                                        for (int var67 = 0; var67 < var65; var67++) {
                                            if (var62[var67].field109.compareTo(var62[var67 + 1].field109) > 0) {
                                                class8 var68 = var62[var67];
                                                var62[var67] = var62[var67 + 1];
                                                var62[var67 + 1] = var68;
                                                var66 = false;
                                            }
                                        }
                                        if (var66) {
                                            break;
                                        }
                                    }
                                    Statics.field1362 = var62;
                                    field540 = -1;
                                    var1 = true;
                                }
                            }
                            break label2899;
                        }
                        if (field540 == 209) {
                            while (field513.field2022 < field514) {
                                boolean var69 = field513.method2441() == 1;
                                String var70 = field513.method2449();
                                String var71 = field513.method2449();
                                int var72 = field513.method2609();
                                int var73 = field513.method2441();
                                int var74 = field513.method2441();
                                boolean var75 = (var74 & 0x2) != 0;
                                boolean var76 = (var74 & 0x1) != 0;
                                if (var72 > 0) {
                                    field513.method2449();
                                    field513.method2441();
                                    field513.method2446();
                                }
                                field513.method2449();
                                for (int var77 = 0; var77 < field723; var77++) {
                                    class23 var78 = field725[var77];
                                    if (var69) {
                                        if (var71.equals(var78.field357)) {
                                            var78.field357 = var70;
                                            var78.field355 = var71;
                                            var70 = null;
                                            break;
                                        }
                                    } else if (var70.equals(var78.field357)) {
                                        if (var78.field354 != var72) {
                                            boolean var79 = true;
                                            for (class28 var80 = (class28) field533.method3289(); var80 != null; var80 = (class28) field533.method3290()) {
                                                if (var80.field738.equals(var70)) {
                                                    if (var72 != 0 && var80.field739 == 0) {
                                                        var80.method3355();
                                                        var79 = false;
                                                    } else if (var72 == 0 && var80.field739 != 0) {
                                                        var80.method3355();
                                                        var79 = false;
                                                    }
                                                }
                                            }
                                            if (var79) {
                                                field533.method3288(new class28(var70, var72));
                                            }
                                            var78.field354 = var72;
                                        }
                                        var78.field355 = var71;
                                        var78.field358 = var73;
                                        var78.field356 = var75;
                                        var78.field353 = var76;
                                        var70 = null;
                                        break;
                                    }
                                }
                                if (var70 != null && field723 < 200) {
                                    class23 var81 = new class23();
                                    field725[field723] = var81;
                                    var81.field357 = var70;
                                    var81.field355 = var71;
                                    var81.field354 = var72;
                                    var81.field358 = var73;
                                    var81.field356 = var75;
                                    var81.field353 = var76;
                                    field723++;
                                }
                            }
                            field595 = 2;
                            field667 = field654;
                            boolean var82 = false;
                            int var83 = field723;
                            while (var83 > 0) {
                                boolean var84 = true;
                                var83--;
                                for (int var85 = 0; var85 < var83; var85++) {
                                    boolean var86 = false;
                                    class23 var87 = field725[var85];
                                    class23 var88 = field725[var85 + 1];
                                    if (field473 != var87.field354 && field473 == var88.field354) {
                                        var86 = true;
                                    }
                                    if (!var86 && var87.field354 == 0 && var88.field354 != 0) {
                                        var86 = true;
                                    }
                                    if (!var86 && !var87.field356 && var88.field356) {
                                        var86 = true;
                                    }
                                    if (!var86 && !var87.field353 && var88.field353) {
                                        var86 = true;
                                    }
                                    if (var86) {
                                        class23 var89 = field725[var85];
                                        field725[var85] = field725[var85 + 1];
                                        field725[var85 + 1] = var89;
                                        var84 = false;
                                    }
                                }
                                if (var84) {
                                    break;
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 19) {
                            int var90 = field513.method2446();
                            int var91 = field513.method2609();
                            if (var90 < -70000) {
                                var91 += 32768;
                            }
                            class158 var92;
                            if (var90 >= 0) {
                                var92 = class158.method3(var90);
                            } else {
                                var92 = null;
                            }
                            if (var92 != null) {
                                for (int var93 = 0; var93 < var92.field2676.length; var93++) {
                                    var92.field2676[var93] = 0;
                                    var92.field2677[var93] = 0;
                                }
                            }
                            class19.method1564(var91);
                            int var94 = field513.method2609();
                            for (int var95 = 0; var95 < var94; var95++) {
                                int var96 = field513.method2466();
                                if (var96 == 255) {
                                    var96 = field513.method2447();
                                }
                                int var97 = field513.method2473();
                                if (var92 != null && var95 < var92.field2676.length) {
                                    var92.field2676[var95] = var97;
                                    var92.field2677[var95] = var96;
                                }
                                class19.method36(var91, var95, var97 - 1, var96);
                            }
                            if (var92 != null) {
                                method1586(var92);
                            }
                            method194();
                            field657[++field658 - 1 & 0x1F] = var91 & 0x7FFF;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 21) {
                            int var98 = field514 + field513.field2022;
                            int var99 = field513.method2609();
                            int var100 = field513.method2609();
                            if (field586 != var99) {
                                field586 = var99;
                                method2955(field586);
                                class26.method39(field586);
                                for (int var101 = 0; var101 < 100; var101++) {
                                    field674[var101] = true;
                                }
                            }
                            while (var100-- > 0) {
                                int var102 = field513.method2446();
                                int var103 = field513.method2609();
                                int var104 = field513.method2441();
                                class4 var105 = (class4) field632.method3302((long) var102);
                                if (var105 != null && var105.field53 != var103) {
                                    method2360(var105, true);
                                    var105 = null;
                                }
                                if (var105 == null) {
                                    var105 = method3138(var102, var103, var104);
                                }
                                var105.field50 = true;
                            }
                            for (class4 var106 = (class4) field632.method3316(); var106 != null; var106 = (class4) field632.method3306()) {
                                if (var106.field50) {
                                    var106.field50 = false;
                                } else {
                                    method2360(var106, true);
                                }
                            }
                            field671 = new class175(512);
                            while (field513.field2022 < var98) {
                                int var107 = field513.method2446();
                                int var108 = field513.method2609();
                                int var109 = field513.method2609();
                                int var110 = field513.method2446();
                                for (int var111 = var108; var111 <= var109; var111++) {
                                    long var112 = ((long) var107 << 32) + (long) var111;
                                    field671.method3318(new class171(var110), var112);
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 38) {
                            field513.field2022 += 28;
                            if (field513.method2460()) {
                                class82.method160(field513, field513.field2022 - 28);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 23) {
                            field653 = field513.method2475() * 30;
                            field664 = field654;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 34) {
                            field636 = true;
                            Statics.field546 = field513.method2441();
                            Statics.field1497 = field513.method2441();
                            Statics.field112 = field513.method2609();
                            Statics.field1636 = field513.method2441();
                            Statics.field1357 = field513.method2441();
                            if (Statics.field1357 >= 100) {
                                int var114 = Statics.field546 * 128 + 64;
                                int var115 = Statics.field1497 * 128 + 64;
                                int var116 = method264(var114, var115, Statics.field2386) - Statics.field112;
                                int var117 = var114 - Statics.field2069;
                                int var118 = var116 - Statics.field1609;
                                int var119 = var115 - Statics.field1178;
                                int var120 = (int) Math.sqrt((double) (var117 * var117 + var119 * var119));
                                Statics.field1608 = (int) (Math.atan2((double) var118, (double) var120) * 325.949D) & 0x7FF;
                                Statics.field2445 = (int) (Math.atan2((double) var117, (double) var119) * -325.949D) & 0x7FF;
                                if (Statics.field1608 < 128) {
                                    Statics.field1608 = 128;
                                }
                                if (Statics.field1608 > 383) {
                                    Statics.field1608 = 383;
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 197) {
                            for (int var121 = 0; var121 < field693.length; var121++) {
                                if (field693[var121] != null) {
                                    field693[var121].field435 = -1;
                                }
                            }
                            for (int var122 = 0; var122 < field631.length; var122++) {
                                if (field631[var122] != null) {
                                    field631[var122].field435 = -1;
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 181) {
                            int var123 = field513.method2474();
                            int var124 = field513.method2495();
                            class158 var125 = class158.method3(var123);
                            if (var125.field2610 != var124 || var124 == -1) {
                                var125.field2610 = var124;
                                var125.field2680 = 0;
                                var125.field2653 = 0;
                                method1586(var125);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 231) {
                            Statics.field1437 = field513.method2464();
                            Statics.field1275 = field513.method2465();
                            for (int var126 = Statics.field1437; var126 < Statics.field1437 + 8; var126++) {
                                for (int var127 = Statics.field1275; var127 < Statics.field1275 + 8; var127++) {
                                    if (field605[Statics.field2386][var126][var127] != null) {
                                        field605[Statics.field2386][var126][var127] = null;
                                        method167(var126, var127);
                                    }
                                }
                            }
                            for (class22 var128 = (class22) field502.method3326(); var128 != null; var128 = (class22) field502.method3347()) {
                                if (var128.field349 >= Statics.field1437 && var128.field349 < Statics.field1437 + 8 && var128.field338 >= Statics.field1275 && var128.field338 < Statics.field1275 + 8 && Statics.field2386 == var128.field337) {
                                    var128.field346 = 0;
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 27) {
                            field636 = true;
                            Statics.field1425 = field513.method2441();
                            Statics.field257 = field513.method2441();
                            Statics.field389 = field513.method2609();
                            Statics.field1964 = field513.method2441();
                            Statics.field913 = field513.method2441();
                            if (Statics.field913 >= 100) {
                                Statics.field2069 = Statics.field1425 * 128 + 64;
                                Statics.field1178 = Statics.field257 * 128 + 64;
                                Statics.field1609 = method264(Statics.field2069, Statics.field1178, Statics.field2386) - Statics.field389;
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 176) {
                            int var129 = field513.method2473();
                            int var130 = field513.method2620();
                            class158 var131 = class158.method3(var130);
                            if (var131 != null && var131.field2586 == 0) {
                                if (var129 > var131.field2650 - var131.field2584) {
                                    var129 = var131.field2650 - var131.field2584;
                                }
                                if (var129 < 0) {
                                    var129 = 0;
                                }
                                if (var131.field2588 != var129) {
                                    var131.field2588 = var129;
                                    method1586(var131);
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 140) {
                            method194();
                            int var132 = field513.method2441();
                            int var133 = field513.method2474();
                            int var134 = field513.method2465();
                            field572[var132] = var133;
                            field609[var132] = var134;
                            field610[var132] = 1;
                            for (int var135 = 0; var135 < 98; var135++) {
                                if (var133 >= class130.field2037[var135]) {
                                    field610[var132] = var135 + 2;
                                }
                            }
                            field659[++field646 - 1 & 0x1F] = var132;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 185) {
                            method545();
                            field540 = -1;
                            var1 = false;
                            break label2899;
                        }
                        if (field540 == 52) {
                            Statics.field1437 = field513.method2441();
                            Statics.field1275 = field513.method2465();
                            while (field513.field2022 < field514) {
                                field540 = field513.method2441();
                                method224();
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 246) {
                            int var136 = field513.method2475();
                            int var137 = field513.method2620();
                            class159.field2694[var136] = var137;
                            if (class159.field2693[var136] != var137) {
                                class159.field2693[var136] = var137;
                                method166(var136);
                            }
                            field495[++field656 - 1 & 0x1F] = var136;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 25) {
                            field595 = 1;
                            field667 = field654;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 238) {
                            int var138 = field513.method2466();
                            String var139 = field513.method2449();
                            int var140 = field513.method2464();
                            if (var140 >= 1 && var140 <= 8) {
                                if (var139.equalsIgnoreCase("null")) {
                                    var139 = null;
                                }
                                field681[var140 - 1] = var139;
                                field603[var140 - 1] = var138 == 0;
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 166) {
                            int var141 = field513.method2476();
                            int var142 = field513.method2474();
                            int var143 = field513.method2477();
                            class158 var144 = class158.method3(var142);
                            int var145 = var144.field2572 + var143;
                            int var146 = var144.field2582 + var141;
                            if (var144.field2690 != var145 || var144.field2580 != var146) {
                                var144.field2690 = var145;
                                var144.field2580 = var146;
                                method1586(var144);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 70) {
                            int var147 = field513.method2446();
                            int var148 = field513.method2609();
                            if (var147 < -70000) {
                                var148 += 32768;
                            }
                            class158 var149;
                            if (var147 >= 0) {
                                var149 = class158.method3(var147);
                            } else {
                                var149 = null;
                            }
                            while (field513.field2022 < field514) {
                                int var150 = field513.method2454();
                                int var151 = field513.method2609();
                                int var152 = 0;
                                if (var151 != 0) {
                                    var152 = field513.method2441();
                                    if (var152 == 255) {
                                        var152 = field513.method2446();
                                    }
                                }
                                if (var149 != null && var150 >= 0 && var150 < var149.field2676.length) {
                                    var149.field2676[var150] = var151;
                                    var149.field2677[var150] = var152;
                                }
                                class19.method36(var148, var150, var151 - 1, var152);
                            }
                            if (var149 != null) {
                                method1586(var149);
                            }
                            method194();
                            field657[++field658 - 1 & 0x1F] = var148 & 0x7FFF;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 32) {
                            field599 = 0;
                            field706 = 0;
                            method1531();
                            method84();
                            while (field513.method2324(field514) >= 11) {
                                int var153 = field513.method2322(11);
                                if (var153 == 2047) {
                                    break;
                                }
                                boolean var154 = false;
                                if (field693[var153] == null) {
                                    field693[var153] = new class3();
                                    if (field734[var153] != null) {
                                        field693[var153].method15(field734[var153]);
                                    }
                                    var154 = true;
                                }
                                field593[++field592 - 1] = var153;
                                class3 var155 = field693[var153];
                                var155.field437 = field482;
                                int var156 = field513.method2322(1);
                                if (var156 == 1) {
                                    field529[++field706 - 1] = var153;
                                }
                                int var157 = field733[field513.method2322(3)];
                                if (var154) {
                                    var155.field454 = var155.field408 = var157;
                                }
                                int var158 = field513.method2322(5);
                                if (var158 > 15) {
                                    var158 -= 32;
                                }
                                int var159 = field513.method2322(1);
                                int var160 = field513.method2322(5);
                                if (var160 > 15) {
                                    var160 -= 32;
                                }
                                var155.method253(Statics.field71.field458[0] + var158, Statics.field71.field447[0] + var160, var159 == 1);
                            }
                            field513.method2323();
                            for (int var161 = 0; var161 < field706; var161++) {
                                int var162 = field529[var161];
                                class3 var163 = field693[var162];
                                int var164 = field513.method2441();
                                if ((var164 & 0x80) != 0) {
                                    var164 += field513.method2441() << 8;
                                }
                                if ((var164 & 0x200) != 0) {
                                    var163.field445 = field513.method2466();
                                    var163.field442 = field513.method2465();
                                    var163.field464 = field513.method2441();
                                    var163.field448 = field513.method2464();
                                    var163.field467 = field513.method2494() + field482;
                                    var163.field450 = field513.method2609() + field482;
                                    var163.field451 = field513.method2465();
                                    var163.field457 = 1;
                                    var163.field462 = 0;
                                }
                                if ((var164 & 0x10) != 0) {
                                    var163.field430 = field513.method2494();
                                    var163.field431 = field513.method2475();
                                }
                                if ((var164 & 0x40) != 0) {
                                    int var165 = field513.method2441();
                                    int var166 = field513.method2464();
                                    var163.method257(var165, var166, field482);
                                    var163.field426 = field482 + 300;
                                    var163.field427 = field513.method2464();
                                    var163.field428 = field513.method2466();
                                }
                                if ((var164 & 0x1) != 0) {
                                    int var167 = field513.method2494();
                                    if (var167 == 65535) {
                                        var167 = -1;
                                    }
                                    int var168 = field513.method2441();
                                    method242(var163, var167, var168);
                                }
                                if ((var164 & 0x400) != 0) {
                                    var163.field455 = field513.method2475();
                                    int var169 = field513.method2620();
                                    var163.field444 = var169 >> 16;
                                    var163.field443 = (var169 & 0xFFFF) + field482;
                                    var163.field441 = 0;
                                    var163.field460 = 0;
                                    if (var163.field443 > field482) {
                                        var163.field441 = -1;
                                    }
                                    if (var163.field455 == 65535) {
                                        var163.field455 = -1;
                                    }
                                }
                                if ((var164 & 0x100) != 0) {
                                    int var170 = field513.method2465();
                                    int var171 = field513.method2441();
                                    var163.method257(var170, var171, field482);
                                    var163.field426 = field482 + 300;
                                    var163.field427 = field513.method2441();
                                    var163.field428 = field513.method2464();
                                }
                                if ((var164 & 0x20) != 0) {
                                    var163.field419 = field513.method2449();
                                    if (var163.field419.charAt(0) == '~') {
                                        var163.field419 = var163.field419.substring(1);
                                        method2379(2, var163.field39, var163.field419);
                                    } else if (Statics.field71 == var163) {
                                        method2379(2, var163.field39, var163.field419);
                                    }
                                    var163.field463 = 0;
                                    var163.field422 = 0;
                                    var163.field446 = 150;
                                }
                                if ((var164 & 0x8) != 0) {
                                    int var172 = field513.method2609();
                                    int var173 = field513.method2464();
                                    int var174 = field513.method2441();
                                    int var175 = field513.field2022;
                                    if (var163.field39 != null && var163.field30 != null) {
                                        boolean var176 = false;
                                        if (var173 <= 1 && method1403(var163.field39)) {
                                            var176 = true;
                                        }
                                        if (!var176 && field590 == 0) {
                                            field498.field2022 = 0;
                                            field513.method2485(field498.field2025, 0, var174);
                                            field498.field2022 = 0;
                                            class127 var177 = field498;
                                            String var181;
                                            try {
                                                int var178 = var177.method2454();
                                                if (var178 > 32767) {
                                                    var178 = 32767;
                                                }
                                                byte[] var179 = new byte[var178];
                                                var177.field2022 += Statics.field2831.method2370(var177.field2025, var177.field2022, var179, 0, var178);
                                                String var180 = class149.method2313(var179, 0, var178);
                                                var181 = var180;
                                            } catch (Exception var428) {
                                                var181 = "Cabbage";
                                            }
                                            String var184 = class185.method3398(class147.method2674(var181));
                                            var163.field419 = var184.trim();
                                            var163.field463 = var172 >> 8;
                                            var163.field422 = var172 & 0xFF;
                                            var163.field446 = 150;
                                            if (var173 == 2 || var173 == 3) {
                                                method2379(1, class2.method429(1) + var163.field39, var184);
                                            } else if (var173 == 1) {
                                                method2379(1, class2.method429(0) + var163.field39, var184);
                                            } else {
                                                method2379(2, var163.field39, var184);
                                            }
                                        }
                                    }
                                    field513.field2022 = var174 + var175;
                                }
                                if ((var164 & 0x4) != 0) {
                                    int var185 = field513.method2465();
                                    byte[] var186 = new byte[var185];
                                    class127 var187 = new class127(var186);
                                    field513.method2485(var186, 0, var185);
                                    field734[var162] = var187;
                                    var163.method15(var187);
                                }
                                if ((var164 & 0x2) != 0) {
                                    var163.field420 = field513.method2494();
                                    if (var163.field420 == 65535) {
                                        var163.field420 = -1;
                                    }
                                }
                            }
                            for (int var188 = 0; var188 < field599; var188++) {
                                int var189 = field600[var188];
                                if (field482 != field693[var189].field437) {
                                    field693[var189] = null;
                                }
                            }
                            if (field514 != field513.field2022) {
                                throw new RuntimeException(field513.field2022 + class2.field25 + field514);
                            }
                            for (int var190 = 0; var190 < field592; var190++) {
                                if (field693[field593[var190]] == null) {
                                    throw new RuntimeException(var190 + class2.field25 + field592);
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 110) {
                            int var191 = field513.method2465();
                            int var192 = field513.method2465();
                            int var193 = field513.method2441();
                            Statics.field2386 = var192 >> 1;
                            Statics.field71.method253(var191, var193, (var192 & 0x1) == 1);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 148) {
                            String var194 = field513.method2449();
                            int var195 = field513.method2447();
                            class158 var196 = class158.method3(var195);
                            if (!var194.equals(var196.field2621)) {
                                var196.field2621 = var194;
                                method1586(var196);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 162) {
                            int var197 = field513.method2465();
                            int var198 = field513.method2446();
                            int var199 = field513.method2609();
                            class4 var200 = (class4) field632.method3302((long) var198);
                            if (var200 != null) {
                                method2360(var200, var200.field53 != var199);
                            }
                            method3138(var198, var199, var197);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 10) {
                            field520 = field513.method2441();
                            if (field520 == 1) {
                                field491 = field513.method2609();
                            }
                            if (field520 >= 2 && field520 <= 6) {
                                if (field520 == 2) {
                                    field496 = 64;
                                    field497 = 64;
                                }
                                if (field520 == 3) {
                                    field496 = 0;
                                    field497 = 64;
                                }
                                if (field520 == 4) {
                                    field496 = 128;
                                    field497 = 64;
                                }
                                if (field520 == 5) {
                                    field496 = 64;
                                    field497 = 0;
                                }
                                if (field520 == 6) {
                                    field496 = 64;
                                    field497 = 128;
                                }
                                field520 = 2;
                                field493 = field513.method2609();
                                field678 = field513.method2609();
                                field731 = field513.method2441();
                            }
                            if (field520 == 10) {
                                field492 = field513.method2609();
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 218) {
                            int var201 = field513.method2447();
                            class158 var202 = class158.method3(var201);
                            for (int var203 = 0; var203 < var202.field2676.length; var203++) {
                                var202.field2676[var203] = -1;
                                var202.field2676[var203] = 0;
                            }
                            method1586(var202);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 229) {
                            int var204 = field513.method2494();
                            int var205 = field513.method2475();
                            int var206 = field513.method2474();
                            int var207 = field513.method2494();
                            class158 var208 = class158.method3(var206);
                            if (var208.field2614 != var204 || var208.field2615 != var205 || var208.field2656 != var207) {
                                var208.field2614 = var204;
                                var208.field2615 = var205;
                                var208.field2656 = var207;
                                method1586(var208);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 227) {
                            int var209 = field513.method2494();
                            int var210 = field513.method2620();
                            class158 var211 = class158.method3(var210);
                            if (var211.field2687 != 2 || var211.field2607 != var209) {
                                var211.field2687 = 2;
                                var211.field2607 = var209;
                                method1586(var211);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 223) {
                            method599(true);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 49) {
                            int var212 = field513.method2609();
                            int var213 = field513.method2441();
                            int var214 = field513.method2609();
                            method9(var212, var213, var214);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 183) {
                            int var215 = field513.method2474();
                            Statics.field1401 = Statics.field2333.method1480(var215);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 169) {
                            int var216 = field513.method2620();
                            boolean var217 = field513.method2441() == 1;
                            class158 var218 = class158.method3(var216);
                            if (var218.field2576 != var217) {
                                var218.field2576 = var217;
                                method1586(var218);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 0) {
                            method194();
                            field637 = field513.method2495();
                            field664 = field654;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 214) {
                            String var219 = field513.method2449();
                            long var220 = (long) field513.method2609();
                            long var222 = (long) field513.method2461();
                            int var224 = field513.method2441();
                            long var225 = (var220 << 32) + var222;
                            boolean var227 = false;
                            for (int var228 = 0; var228 < 100; var228++) {
                                if (field690[var228] == var225) {
                                    var227 = true;
                                    break;
                                }
                            }
                            if (method1403(var219)) {
                                var227 = true;
                            }
                            if (!var227 && field590 == 0) {
                                field690[field691] = var225;
                                field691 = (field691 + 1) % 100;
                                class116 var229 = field513;
                                String var233;
                                try {
                                    int var230 = var229.method2454();
                                    if (var230 > 32767) {
                                        var230 = 32767;
                                    }
                                    byte[] var231 = new byte[var230];
                                    var229.field2022 += Statics.field2831.method2370(var229.field2025, var229.field2022, var231, 0, var230);
                                    String var232 = class149.method2313(var231, 0, var230);
                                    var233 = var232;
                                } catch (Exception var427) {
                                    var233 = "Cabbage";
                                }
                                String var236 = class185.method3398(class147.method2674(var233));
                                if (var224 == 2 || var224 == 3) {
                                    method2379(7, class2.method429(1) + var219, var236);
                                } else if (var224 == 1) {
                                    method2379(7, class2.method429(0) + var219, var236);
                                } else {
                                    method2379(3, var219, var236);
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 45) {
                            int var237 = field513.method2473();
                            byte var238 = field513.method2467();
                            class159.field2694[var237] = var238;
                            if (class159.field2693[var237] != var238) {
                                class159.field2693[var237] = var238;
                                method166(var237);
                            }
                            field495[++field656 - 1 & 0x1F] = var237;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 201) {
                            int var239 = field513.method2475();
                            field586 = var239;
                            method2955(var239);
                            class26.method39(field586);
                            for (int var240 = 0; var240 < 100; var240++) {
                                field674[var240] = true;
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 87) {
                            method133();
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 109) {
                            int var241 = field513.method2474();
                            class158 var242 = class158.method3(var241);
                            var242.field2687 = 3;
                            var242.field2607 = Statics.field71.field30.method3173();
                            method1586(var242);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 26) {
                            if (field586 != -1) {
                                int var243 = field586;
                                if (class158.method2675(var243)) {
                                    method630(Statics.field2627[var243], 0);
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 251) {
                            for (int var244 = 0; var244 < Statics.field1032; var244++) {
                                class42 var245 = class42.method1501(var244);
                                if (var245 != null && var245.field1035 == 0) {
                                    class159.field2694[var244] = 0;
                                    class159.field2693[var244] = 0;
                                }
                            }
                            method194();
                            field656 += 32;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 236) {
                            method194();
                            field617 = field513.method2441();
                            field664 = field654;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 138 || field540 == 252 || field540 == 12 || field540 == 240 || field540 == 175 || field540 == 190 || field540 == 20 || field540 == 77 || field540 == 160 || field540 == 154 || field540 == 6) {
                            method224();
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 217) {
                            String var246 = field513.method2449();
                            class116 var247 = field513;
                            String var251;
                            try {
                                int var248 = var247.method2454();
                                if (var248 > 32767) {
                                    var248 = 32767;
                                }
                                byte[] var249 = new byte[var248];
                                var247.field2022 += Statics.field2831.method2370(var247.field2025, var247.field2022, var249, 0, var248);
                                String var250 = class149.method2313(var249, 0, var248);
                                var251 = var250;
                            } catch (Exception var426) {
                                var251 = "Cabbage";
                            }
                            String var254 = class185.method3398(class147.method2674(var251));
                            method2379(6, var246, var254);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 150) {
                            int var255 = field513.method2475();
                            int var256 = field513.method2447();
                            class158 var257 = class158.method3(var256);
                            if (var257.field2687 != 1 || var257.field2607 != var255) {
                                var257.field2687 = 1;
                                var257.field2607 = var255;
                                method1586(var257);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 80) {
                            int var258 = field513.method2446();
                            class4 var259 = (class4) field632.method3302((long) var258);
                            if (var259 != null) {
                                method2360(var259, true);
                            }
                            if (field557 != null) {
                                method1586(field557);
                                field557 = null;
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 7) {
                            Statics.field1437 = field513.method2441();
                            Statics.field1275 = field513.method2466();
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 135) {
                            String var260 = field513.method2449();
                            int var261 = field513.method2609();
                            byte var262 = field513.method2442();
                            boolean var263 = false;
                            if (var262 == -128) {
                                var263 = true;
                            }
                            if (var263) {
                                if (Statics.field86 == 0) {
                                    field540 = -1;
                                    var1 = true;
                                    break label2899;
                                }
                                boolean var264 = false;
                                int var265;
                                for (var265 = 0; var265 < Statics.field86 && (!Statics.field1362[var265].field105.equals(var260) || Statics.field1362[var265].field106 != var261); var265++) {
                                }
                                if (var265 < Statics.field86) {
                                    while (var265 < Statics.field86 - 1) {
                                        Statics.field1362[var265] = Statics.field1362[var265 + 1];
                                        var265++;
                                    }
                                    Statics.field86--;
                                    Statics.field1362[Statics.field86] = null;
                                }
                            } else {
                                field513.method2449();
                                class8 var266 = new class8();
                                var266.field105 = var260;
                                var266.field109 = class148.method747(var266.field105, Statics.field204);
                                var266.field106 = var261;
                                var266.field107 = var262;
                                int var267;
                                for (var267 = Statics.field86 - 1; var267 >= 0; var267--) {
                                    int var268 = Statics.field1362[var267].field109.compareTo(var266.field105);
                                    if (var268 == 0) {
                                        Statics.field1362[var267].field106 = var261;
                                        Statics.field1362[var267].field107 = var262;
                                        if (var260.equals(Statics.field71.field39)) {
                                            Statics.field169 = var262;
                                        }
                                        field661 = field654;
                                        field540 = -1;
                                        var1 = true;
                                        break label2899;
                                    }
                                    if (var268 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field86 >= Statics.field1362.length) {
                                    field540 = -1;
                                    var1 = true;
                                    break label2899;
                                }
                                for (int var269 = Statics.field86 - 1; var269 > var267; var269--) {
                                    Statics.field1362[var269 + 1] = Statics.field1362[var269];
                                }
                                if (Statics.field86 == 0) {
                                    Statics.field1362 = new class8[100];
                                }
                                Statics.field1362[var267 + 1] = var266;
                                Statics.field86++;
                                if (var260.equals(Statics.field71.field39)) {
                                    Statics.field169 = var262;
                                }
                            }
                            field661 = field654;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 244) {
                            method599(false);
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 235) {
                            Statics.field932 = class137.method229(field513.method2441());
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 126) {
                            int var270 = field513.method2473();
                            int var271 = field513.method2446();
                            int var272 = field513.method2609();
                            class158 var273 = class158.method3(var271);
                            var273.field2606 = (var270 << 16) + var272;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 5) {
                            while (field513.field2022 < field514) {
                                int var274 = field513.method2441();
                                boolean var275 = (var274 & 0x1) == 1;
                                String var276 = field513.method2449();
                                String var277 = field513.method2449();
                                field513.method2449();
                                for (int var278 = 0; var278 < field727; var278++) {
                                    class11 var279 = field728[var278];
                                    if (var275) {
                                        if (var277.equals(var279.field174)) {
                                            var279.field174 = var276;
                                            var279.field177 = var277;
                                            var276 = null;
                                            break;
                                        }
                                    } else if (var276.equals(var279.field174)) {
                                        var279.field174 = var276;
                                        var279.field177 = var277;
                                        var276 = null;
                                        break;
                                    }
                                }
                                if (var276 != null && field727 < 100) {
                                    class11 var280 = new class11();
                                    field728[field727] = var280;
                                    var280.field174 = var276;
                                    var280.field177 = var277;
                                    field727++;
                                }
                            }
                            field667 = field654;
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 226) {
                            String var281 = field513.method2449();
                            if (var281.endsWith(":tradereq:")) {
                                String var282 = var281.substring(0, var281.indexOf(":"));
                                boolean var283 = false;
                                if (method1403(var282)) {
                                    var283 = true;
                                }
                                if (!var283 && field590 == 0) {
                                    method2379(4, var282, class134.field2207);
                                }
                            } else if (var281.endsWith(":duelreq:")) {
                                String var284 = var281.substring(0, var281.indexOf(":"));
                                boolean var285 = false;
                                if (method1403(var284)) {
                                    var285 = true;
                                }
                                if (!var285 && field590 == 0) {
                                    method2379(8, var284, class134.field2107);
                                }
                            } else if (var281.endsWith(":chalreq:")) {
                                String var286 = var281.substring(0, var281.indexOf(":"));
                                boolean var287 = false;
                                if (method1403(var286)) {
                                    var287 = true;
                                }
                                if (!var287 && field590 == 0) {
                                    String var288 = var281.substring(var281.indexOf(":") + 1, var281.length() - 9);
                                    method2379(8, var286, var288);
                                }
                            } else if (var281.endsWith(":assistreq:")) {
                                String var289 = var281.substring(0, var281.indexOf(":"));
                                boolean var290 = false;
                                if (method1403(var289)) {
                                    var290 = true;
                                }
                                if (!var290 && field590 == 0) {
                                    method2379(10, var289, "");
                                }
                            } else if (var281.endsWith(":clan:")) {
                                String var291 = var281.substring(0, var281.indexOf(":clan:"));
                                method2379(11, "", var291);
                            } else if (var281.endsWith(":trade:")) {
                                String var292 = var281.substring(0, var281.indexOf(":trade:"));
                                if (field590 == 0) {
                                    method2379(12, "", var292);
                                }
                            } else if (var281.endsWith(":assist:")) {
                                String var293 = var281.substring(0, var281.indexOf(":assist:"));
                                if (field590 == 0) {
                                    method2379(13, "", var293);
                                }
                            } else {
                                method2379(0, "", var281);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 249) {
                            int var294 = field513.method2620();
                            int var295 = field513.method2473();
                            int var296 = var295 >> 10 & 0x1F;
                            int var297 = var295 >> 5 & 0x1F;
                            int var298 = var295 & 0x1F;
                            int var299 = (var298 << 3) + (var296 << 19) + (var297 << 11);
                            class158 var300 = class158.method3(var294);
                            if (var300.field2659 != var299) {
                                var300.field2659 = var299;
                                method1586(var300);
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        if (field540 == 119) {
                            for (int var301 = 0; var301 < class159.field2693.length; var301++) {
                                if (class159.field2694[var301] != class159.field2693[var301]) {
                                    class159.field2693[var301] = class159.field2694[var301];
                                    method166(var301);
                                    field495[++field656 - 1 & 0x1F] = var301;
                                }
                            }
                            field540 = -1;
                            var1 = true;
                            break label2899;
                        }
                        class80.method2830("" + field540 + class2.field25 + field578 + class2.field25 + field521 + class2.field25 + field514, (Throwable) null);
                        method545();
                    } catch (IOException var432) {
                        if (field518 > 0) {
                            method545();
                        } else {
                            method62(40);
                            Statics.field1958 = Statics.field137;
                            Statics.field137 = null;
                        }
                    } catch (Exception var433) {
                        String var304 = "" + field540 + class2.field25 + field578 + class2.field25 + field521 + class2.field25 + field514 + class2.field25 + (Statics.field54 + Statics.field71.field458[0]) + class2.field25 + (Statics.field977 + Statics.field71.field447[0]) + class2.field25;
                        for (int var305 = 0; var305 < field514 && var305 < 50; var305++) {
                            var304 = var304 + field513.field2025[var305] + class2.field25;
                        }
                        class80.method2830(var304, var433);
                        method545();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field480 != 30) {
            return;
        }
        class182.method232(field692, 182);
        Object var306 = Statics.field266.field247;
        synchronized (Statics.field266.field247) {
            if (!field472) {
                Statics.field266.field243 = 0;
            } else if (class77.field1374 != 0 || Statics.field266.field243 >= 40) {
                field692.method2319(224);
                field692.method2482(0);
                int var307 = field692.field2022;
                int var308 = 0;
                for (int var309 = 0; var309 < Statics.field266.field243 && field692.field2022 - var307 < 240; var309++) {
                    var308++;
                    int var310 = Statics.field266.field242[var309];
                    if (var310 < 0) {
                        var310 = 0;
                    } else if (var310 > 502) {
                        var310 = 502;
                    }
                    int var311 = Statics.field266.field241[var309];
                    if (var311 < 0) {
                        var311 = 0;
                    } else if (var311 > 764) {
                        var311 = 764;
                    }
                    int var312 = var310 * 765 + var311;
                    if (Statics.field266.field242[var309] == -1 && Statics.field266.field241[var309] == -1) {
                        var311 = -1;
                        var310 = -1;
                        var312 = 524287;
                    }
                    if (field484 != var311 || field707 != var310) {
                        int var313 = var311 - field484;
                        field484 = var311;
                        int var314 = var310 - field707;
                        field707 = var310;
                        if (field486 < 8 && var313 >= -32 && var313 <= 31 && var314 >= -32 && var314 <= 31) {
                            var313 += 32;
                            var314 += 32;
                            field692.method2428((field486 << 12) + (var313 << 6) + var314);
                            field486 = 0;
                        } else if (field486 < 8) {
                            field692.method2625((field486 << 19) + 8388608 + var312);
                            field486 = 0;
                        } else {
                            field692.method2430((field486 << 19) + -1073741824 + var312);
                            field486 = 0;
                        }
                    } else if (field486 < 2047) {
                        field486++;
                    }
                }
                field692.method2438(field692.field2022 - var307);
                if (var308 >= Statics.field266.field243) {
                    Statics.field266.field243 = 0;
                } else {
                    Statics.field266.field243 -= var308;
                    for (int var315 = 0; var315 < Statics.field266.field243; var315++) {
                        Statics.field266.field241[var315] = Statics.field266.field241[var308 + var315];
                        Statics.field266.field242[var315] = Statics.field266.field242[var308 + var315];
                    }
                }
            }
        }
        if (class77.field1374 != 0) {
            long var317 = (class77.field1383 - field483) / 50L;
            if (var317 > 4095L) {
                var317 = 4095L;
            }
            field483 = class77.field1383;
            int var319 = class77.field1373;
            if (var319 < 0) {
                var319 = 0;
            } else if (var319 > 502) {
                var319 = 502;
            }
            int var320 = class77.field1381;
            if (var320 < 0) {
                var320 = 0;
            } else if (var320 > 764) {
                var320 = 764;
            }
            int var321 = var319 * 765 + var320;
            byte var322 = 0;
            if (class77.field1374 == 2) {
                var322 = 1;
            }
            int var323 = (int) var317;
            field692.method2319(34);
            field692.method2430((var322 << 19) + (var323 << 20) + var321);
        }
        if (class75.field1328 > 0) {
            field692.method2319(20);
            field692.method2428(0);
            int var324 = field692.field2022;
            long var325 = Statics.method2045();
            for (int var327 = 0; var327 < class75.field1328; var327++) {
                long var328 = var325 - field695;
                if (var328 > 16777215L) {
                    var328 = 16777215L;
                }
                field695 = var325;
                field692.method2521((int) var328);
                field692.method2463(class75.field1348[var327]);
            }
            field692.method2437(field692.field2022 - var324);
        }
        if (field716 > 0) {
            field716--;
        }
        if (class75.field1342[96] || class75.field1342[97] || class75.field1342[98] || class75.field1342[99]) {
            field562 = true;
        }
        if (field562 && field716 <= 0) {
            field716 = 20;
            field562 = false;
            field692.method2319(229);
            field692.method2428(field558);
            field692.method2471(field584);
        }
        if (Statics.field1029 && !field487) {
            field487 = true;
            field692.method2319(124);
            field692.method2482(1);
        }
        if (!Statics.field1029 && field487) {
            field487 = false;
            field692.method2319(124);
            field692.method2482(0);
        }
        if (field477 && Statics.field2386 != field523) {
            method1187(Statics.field125, Statics.field1266, Statics.field2386, Statics.field71.field458[0], Statics.field71.field447[0]);
        } else if (Statics.field2386 != field698) {
            field698 = Statics.field2386;
            int var330 = Statics.field2386;
            int[] var331 = Statics.field469.field1446;
            int var332 = var331.length;
            for (int var333 = 0; var333 < var332; var333++) {
                var331[var333] = 0;
            }
            for (int var334 = 1; var334 < 103; var334++) {
                int var335 = (103 - var334) * 2048 + 24628;
                for (int var336 = 1; var336 < 103; var336++) {
                    if ((class9.field115[var330][var336][var334] & 0x18) == 0) {
                        Statics.field1268.method1968(var331, var335, 512, var330, var336, var334);
                    }
                    if (var330 < 3 && (class9.field115[var330 + 1][var336][var334] & 0x8) != 0) {
                        Statics.field1268.method1968(var331, var335, 512, var330 + 1, var336, var334);
                    }
                    var335 += 4;
                }
            }
            int var337 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var338 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field469.method1673();
            for (int var339 = 1; var339 < 103; var339++) {
                for (int var340 = 1; var340 < 103; var340++) {
                    if ((class9.field115[var330][var340][var339] & 0x18) == 0) {
                        method125(var330, var340, var339, var337, var338);
                    }
                    if (var330 < 3 && (class9.field115[var330 + 1][var340][var339] & 0x8) != 0) {
                        method125(var330 + 1, var340, var339, var337, var338);
                    }
                }
            }
            field699 = 0;
            for (int var341 = 0; var341 < 104; var341++) {
                for (int var342 = 0; var342 < 104; var342++) {
                    int var343 = Statics.field1268.method2021(Statics.field2386, var341, var342);
                    if (var343 != 0) {
                        int var344 = var343 >> 14 & 0x7FFF;
                        int var345 = class32.method606(var344).field849;
                        if (var345 >= 0) {
                            int var346 = var341;
                            int var347 = var342;
                            if (var345 != 22 && var345 != 29 && var345 != 34 && var345 != 36 && var345 != 46 && var345 != 47 && var345 != 48) {
                                int[][] var348 = field712[Statics.field2386].field2737;
                                for (int var349 = 0; var349 < 10; var349++) {
                                    int var350 = (int) (Math.random() * 4.0D);
                                    if (var350 == 0 && var346 > 0 && var346 > var341 - 3 && (var348[var346 - 1][var347] & 0x12C0108) == 0) {
                                        var346--;
                                    }
                                    if (var350 == 1 && var346 < 103 && var346 < var341 + 3 && (var348[var346 + 1][var347] & 0x12C0180) == 0) {
                                        var346++;
                                    }
                                    if (var350 == 2 && var347 > 0 && var347 > var342 - 3 && (var348[var346][var347 - 1] & 0x12C0102) == 0) {
                                        var347--;
                                    }
                                    if (var350 == 3 && var347 < 103 && var347 < var342 + 3 && (var348[var346][var347 + 1] & 0x12C0120) == 0) {
                                        var347++;
                                    }
                                }
                            }
                            field702[field699] = Statics.field2302[var345];
                            field569[field699] = var346;
                            field701[field699] = var347;
                            field699++;
                        }
                    }
                }
            }
            Statics.field468.method1662();
        }
        if (field480 != 30) {
            return;
        }
        for (class22 var351 = (class22) field502.method3326(); var351 != null; var351 = (class22) field502.method3347()) {
            if (var351.field346 > 0) {
                var351.field346--;
            }
            if (var351.field346 != 0) {
                if (var351.field345 > 0) {
                    var351.field345--;
                }
                if (var351.field345 == 0 && var351.field349 >= 1 && var351.field338 >= 1 && var351.field349 <= 102 && var351.field338 <= 102 && (var351.field342 < 0 || class9.method2718(var351.field342, var351.field344))) {
                    method860(var351.field337, var351.field336, var351.field349, var351.field338, var351.field342, var351.field341, var351.field344);
                    var351.field345 = -1;
                    if (var351.field342 == var351.field339 && var351.field339 == -1) {
                        var351.method3359();
                    } else if (var351.field342 == var351.field339 && var351.field341 == var351.field340 && var351.field344 == var351.field343) {
                        var351.method3359();
                    }
                }
            } else if (var351.field339 < 0 || class9.method2718(var351.field339, var351.field343)) {
                method860(var351.field337, var351.field336, var351.field349, var351.field338, var351.field339, var351.field340, var351.field343);
                var351.method3359();
            }
        }
        method169();
        field516++;
        if (field516 > 750) {
            method1856();
            return;
        }
        for (int var352 = -1; var352 < field592; var352++) {
            int var353;
            if (var352 == -1) {
                var353 = 2047;
            } else {
                var353 = field593[var352];
            }
            class3 var354 = field693[var353];
            if (var354 != null) {
                method145(var354, 1);
            }
        }
        method2671();
        method135();
        field550++;
        if (field581 != 0) {
            field560 += 20;
            if (field560 >= 400) {
                field581 = 0;
            }
        }
        if (Statics.field2520 != null) {
            field582++;
            if (field582 >= 15) {
                method1586(Statics.field2520);
                Statics.field2520 = null;
            }
        }
        if (Statics.field167 != null) {
            method1586(Statics.field167);
            field589++;
            if (class77.field1382 > field585 + 5 || class77.field1382 < field585 - 5 || class77.field1375 > field591 + 5 || class77.field1375 < field591 - 5) {
                field588 = true;
            }
            if (class77.field1369 == 0) {
                if (field588 && field589 >= 5) {
                    if (Statics.field1979 == Statics.field167 && field651 != field587) {
                        class158 var355 = Statics.field167;
                        byte var356 = 0;
                        if (field485 == 1 && var355.field2578 == 206) {
                            var356 = 1;
                        }
                        if (var355.field2676[field587] <= 0) {
                            var356 = 0;
                        }
                        int var357 = method1588(var355);
                        boolean var358 = (var357 >> 29 & 0x1) != 0;
                        if (var358) {
                            int var359 = field651;
                            int var360 = field587;
                            var355.field2676[var360] = var355.field2676[var359];
                            var355.field2677[var360] = var355.field2677[var359];
                            var355.field2676[var359] = -1;
                            var355.field2677[var359] = 0;
                        } else if (var356 == 1) {
                            int var361 = field651;
                            int var362 = field587;
                            while (var361 != var362) {
                                if (var361 > var362) {
                                    var355.method3131(var361 - 1, var361);
                                    var361--;
                                } else if (var361 < var362) {
                                    var355.method3131(var361 + 1, var361);
                                    var361++;
                                }
                            }
                        } else {
                            var355.method3131(field587, field651);
                        }
                        field692.method2319(57);
                        field692.method2426(var356);
                        field692.method2430(Statics.field167.field2574);
                        field692.method2428(field587);
                        field692.method2472(field651);
                    }
                } else if ((field519 == 1 || method2315(field614 - 1)) && field614 > 2) {
                    method139();
                } else if (field614 > 0) {
                    method43(field614 - 1);
                }
                field582 = 10;
                class77.field1374 = 0;
                Statics.field167 = null;
            }
        }
        class158 var363 = Statics.field901;
        class158 var364 = Statics.field1200;
        Statics.field901 = null;
        Statics.field1200 = null;
        field517 = null;
        field650 = false;
        field542 = false;
        for (field511 = 0; class75.method595() && field511 < 128; field511++) {
            field694[field511] = Statics.field1289;
            field673[field511] = Statics.field1261;
        }
        method549(field586, 0, 0, 765, 503, 0, 0);
        field654++;
        while (true) {
            class1 var365;
            class158 var366;
            class158 var367;
            do {
                var365 = (class1) field669.method3324();
                if (var365 == null) {
                    while (true) {
                        class1 var368;
                        class158 var369;
                        class158 var370;
                        do {
                            var368 = (class1) field670.method3324();
                            if (var368 == null) {
                                while (true) {
                                    class1 var371;
                                    class158 var372;
                                    class158 var373;
                                    do {
                                        var371 = (class1) field668.method3324();
                                        if (var371 == null) {
                                            if (field642 != null) {
                                                method227();
                                            }
                                            if (class95.field1572 != -1) {
                                                int var374 = class95.field1572;
                                                int var375 = class95.field1573;
                                                boolean var376 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var374, var375, true, 0, 0, 0, 0, 0, 0);
                                                class95.field1572 = -1;
                                                if (var376) {
                                                    field596 = class77.field1381;
                                                    field579 = class77.field1373;
                                                    field581 = 1;
                                                    field560 = 0;
                                                }
                                            }
                                            if (Statics.field167 == null && field642 == null) {
                                                int var377 = class77.field1374;
                                                if (field613) {
                                                    if (var377 != 1) {
                                                        int var378 = class77.field1382;
                                                        int var379 = class77.field1375;
                                                        if (var378 < Statics.field376 - 10 || var378 > Statics.field376 + Statics.field1768 + 10 || var379 < Statics.field770 - 10 || var379 > Statics.field931 + Statics.field770 + 10) {
                                                            field613 = false;
                                                            method2666(Statics.field376, Statics.field770, Statics.field1768, Statics.field931);
                                                        }
                                                    }
                                                    if (var377 == 1) {
                                                        int var380 = Statics.field376;
                                                        int var381 = Statics.field770;
                                                        int var382 = Statics.field1768;
                                                        int var383 = class77.field1381;
                                                        int var384 = class77.field1373;
                                                        int var385 = -1;
                                                        for (int var386 = 0; var386 < field614; var386++) {
                                                            int var387 = (field614 - 1 - var386) * 15 + var381 + 31;
                                                            if (var383 > var380 && var383 < var380 + var382 && var384 > var387 - 13 && var384 < var387 + 3) {
                                                                var385 = var386;
                                                            }
                                                        }
                                                        if (var385 != -1) {
                                                            method43(var385);
                                                        }
                                                        field613 = false;
                                                        method2666(Statics.field376, Statics.field770, Statics.field1768, Statics.field931);
                                                    }
                                                } else {
                                                    label3012: {
                                                        int var389;
                                                        int var390;
                                                        label3085: {
                                                            if (var377 == 1 && field614 > 0) {
                                                                int var388 = field478[field614 - 1];
                                                                if (var388 == 39 || var388 == 40 || var388 == 41 || var388 == 42 || var388 == 43 || var388 == 33 || var388 == 34 || var388 == 35 || var388 == 36 || var388 == 37 || var388 == 38 || var388 == 1005) {
                                                                    var389 = field615[field614 - 1];
                                                                    var390 = field616[field614 - 1];
                                                                    class158 var391 = class158.method3(var390);
                                                                    if (class162.method694(method1588(var391))) {
                                                                        break label3085;
                                                                    }
                                                                    int var392 = method1588(var391);
                                                                    boolean var393 = (var392 >> 29 & 0x1) != 0;
                                                                    if (var393) {
                                                                        break label3085;
                                                                    }
                                                                }
                                                            }
                                                            if (var377 == 1 && (field519 == 1 && field614 > 2 || method2315(field614 - 1))) {
                                                                var377 = 2;
                                                            }
                                                            if (var377 == 1 && field614 > 0) {
                                                                method43(field614 - 1);
                                                            }
                                                            if (var377 == 2 && field614 > 0) {
                                                                method139();
                                                            }
                                                            break label3012;
                                                        }
                                                        field588 = false;
                                                        field589 = 0;
                                                        if (Statics.field167 != null) {
                                                            method1586(Statics.field167);
                                                        }
                                                        Statics.field167 = class158.method3(var390);
                                                        field651 = var389;
                                                        field585 = class77.field1381;
                                                        field591 = class77.field1373;
                                                        method1586(Statics.field167);
                                                    }
                                                }
                                            }
                                            if (Statics.field901 != var363) {
                                                if (var363 != null) {
                                                    method1586(var363);
                                                }
                                                if (Statics.field901 != null) {
                                                    method1586(Statics.field901);
                                                }
                                            }
                                            if (Statics.field1200 != var364 && field736 == field623) {
                                                if (var364 != null) {
                                                    method1586(var364);
                                                }
                                                if (Statics.field1200 != null) {
                                                    method1586(Statics.field1200);
                                                }
                                            }
                                            if (Statics.field1200 == null) {
                                                if (field623 > 0) {
                                                    field623--;
                                                }
                                            } else if (field623 < field736) {
                                                field623++;
                                                if (field736 == field623) {
                                                    method1586(Statics.field1200);
                                                }
                                            }
                                            int var394 = field538 + Statics.field71.field410;
                                            int var395 = field576 + Statics.field71.field407;
                                            if (Statics.field2826 - var394 < -500 || Statics.field2826 - var394 > 500 || Statics.field1177 - var395 < -500 || Statics.field1177 - var395 > 500) {
                                                Statics.field2826 = var394;
                                                Statics.field1177 = var395;
                                            }
                                            if (Statics.field2826 != var394) {
                                                Statics.field2826 += (var394 - Statics.field2826) / 16;
                                            }
                                            if (Statics.field1177 != var395) {
                                                Statics.field1177 += (var395 - Statics.field1177) / 16;
                                            }
                                            if (class75.field1342[96]) {
                                                field559 += (-24 - field559) / 2;
                                            } else if (class75.field1342[97]) {
                                                field559 += (24 - field559) / 2;
                                            } else {
                                                field559 /= 2;
                                            }
                                            if (class75.field1342[98]) {
                                                field688 += (12 - field688) / 2;
                                            } else if (class75.field1342[99]) {
                                                field688 += (-12 - field688) / 2;
                                            } else {
                                                field688 /= 2;
                                            }
                                            field558 = field559 / 2 + field558 & 0x7FF;
                                            field584 += field688 / 2;
                                            if (field584 < 128) {
                                                field584 = 128;
                                            }
                                            if (field584 > 383) {
                                                field584 = 383;
                                            }
                                            int var396 = Statics.field2826 >> 7;
                                            int var397 = Statics.field1177 >> 7;
                                            int var398 = method264(Statics.field2826, Statics.field1177, Statics.field2386);
                                            int var399 = 0;
                                            if (var396 > 3 && var397 > 3 && var396 < 100 && var397 < 100) {
                                                for (int var400 = var396 - 4; var400 <= var396 + 4; var400++) {
                                                    for (int var401 = var397 - 4; var401 <= var397 + 4; var401++) {
                                                        int var402 = Statics.field2386;
                                                        if (var402 < 3 && (class9.field115[1][var400][var401] & 0x2) == 2) {
                                                            var402++;
                                                        }
                                                        int var403 = var398 - class9.field141[var402][var400][var401];
                                                        if (var403 > var399) {
                                                            var399 = var403;
                                                        }
                                                    }
                                                }
                                            }
                                            int var404 = var399 * 192;
                                            if (var404 > 98048) {
                                                var404 = 98048;
                                            }
                                            if (var404 < 32768) {
                                                var404 = 32768;
                                            }
                                            if (var404 > field563) {
                                                field563 += (var404 - field563) / 24;
                                            } else if (var404 < field563) {
                                                field563 += (var404 - field563) / 80;
                                            }
                                            if (field636) {
                                                int var405 = Statics.field1425 * 128 + 64;
                                                int var406 = Statics.field257 * 128 + 64;
                                                int var407 = method264(var405, var406, Statics.field2386) - Statics.field389;
                                                if (Statics.field2069 < var405) {
                                                    Statics.field2069 += Statics.field913 * (var405 - Statics.field2069) / 1000 + Statics.field1964;
                                                    if (Statics.field2069 > var405) {
                                                        Statics.field2069 = var405;
                                                    }
                                                }
                                                if (Statics.field2069 > var405) {
                                                    Statics.field2069 -= Statics.field913 * (Statics.field2069 - var405) / 1000 + Statics.field1964;
                                                    if (Statics.field2069 < var405) {
                                                        Statics.field2069 = var405;
                                                    }
                                                }
                                                if (Statics.field1609 < var407) {
                                                    Statics.field1609 += Statics.field913 * (var407 - Statics.field1609) / 1000 + Statics.field1964;
                                                    if (Statics.field1609 > var407) {
                                                        Statics.field1609 = var407;
                                                    }
                                                }
                                                if (Statics.field1609 > var407) {
                                                    Statics.field1609 -= Statics.field913 * (Statics.field1609 - var407) / 1000 + Statics.field1964;
                                                    if (Statics.field1609 < var407) {
                                                        Statics.field1609 = var407;
                                                    }
                                                }
                                                if (Statics.field1178 < var406) {
                                                    Statics.field1178 += Statics.field913 * (var406 - Statics.field1178) / 1000 + Statics.field1964;
                                                    if (Statics.field1178 > var406) {
                                                        Statics.field1178 = var406;
                                                    }
                                                }
                                                if (Statics.field1178 > var406) {
                                                    Statics.field1178 -= Statics.field913 * (Statics.field1178 - var406) / 1000 + Statics.field1964;
                                                    if (Statics.field1178 < var406) {
                                                        Statics.field1178 = var406;
                                                    }
                                                }
                                                int var408 = Statics.field546 * 128 + 64;
                                                int var409 = Statics.field1497 * 128 + 64;
                                                int var410 = method264(var408, var409, Statics.field2386) - Statics.field112;
                                                int var411 = var408 - Statics.field2069;
                                                int var412 = var410 - Statics.field1609;
                                                int var413 = var409 - Statics.field1178;
                                                int var414 = (int) Math.sqrt((double) (var411 * var411 + var413 * var413));
                                                int var415 = (int) (Math.atan2((double) var412, (double) var414) * 325.949D) & 0x7FF;
                                                int var416 = (int) (Math.atan2((double) var411, (double) var413) * -325.949D) & 0x7FF;
                                                if (var415 < 128) {
                                                    var415 = 128;
                                                }
                                                if (var415 > 383) {
                                                    var415 = 383;
                                                }
                                                if (Statics.field1608 < var415) {
                                                    Statics.field1608 += Statics.field1357 * (var415 - Statics.field1608) / 1000 + Statics.field1636;
                                                    if (Statics.field1608 > var415) {
                                                        Statics.field1608 = var415;
                                                    }
                                                }
                                                if (Statics.field1608 > var415) {
                                                    Statics.field1608 -= Statics.field1357 * (Statics.field1608 - var415) / 1000 + Statics.field1636;
                                                    if (Statics.field1608 < var415) {
                                                        Statics.field1608 = var415;
                                                    }
                                                }
                                                int var417 = var416 - Statics.field2445;
                                                if (var417 > 1024) {
                                                    var417 -= 2048;
                                                }
                                                if (var417 < -1024) {
                                                    var417 += 2048;
                                                }
                                                if (var417 > 0) {
                                                    Statics.field2445 += Statics.field1357 * var417 / 1000 + Statics.field1636;
                                                    Statics.field2445 &= 0x7FF;
                                                }
                                                if (var417 < 0) {
                                                    Statics.field2445 -= Statics.field1357 * -var417 / 1000 + Statics.field1636;
                                                    Statics.field2445 &= 0x7FF;
                                                }
                                                int var418 = var416 - Statics.field2445;
                                                if (var418 > 1024) {
                                                    var418 -= 2048;
                                                }
                                                if (var418 < -1024) {
                                                    var418 += 2048;
                                                }
                                                if (var418 < 0 && var417 > 0 || var418 > 0 && var417 < 0) {
                                                    Statics.field2445 = var416;
                                                }
                                            }
                                            for (int var419 = 0; var419 < 5; var419++) {
                                                int var10002 = field722[var419]++;
                                            }
                                            int var420 = class77.method1370();
                                            int var421 = class75.method2384();
                                            if (var420 > 15000 && var421 > 15000) {
                                                field518 = 250;
                                                class77.field1380 = 14500;
                                                field692.method2319(51);
                                            }
                                            field489++;
                                            if (field489 > 500) {
                                                field489 = 0;
                                                int var422 = (int) (Math.random() * 8.0D);
                                                if ((var422 & 0x1) == 1) {
                                                    field538 += field539;
                                                }
                                                if ((var422 & 0x2) == 2) {
                                                    field576 += field700;
                                                }
                                                if ((var422 & 0x4) == 4) {
                                                    field634 += field543;
                                                }
                                            }
                                            if (field538 < -50) {
                                                field539 = 2;
                                            }
                                            if (field538 > 50) {
                                                field539 = -2;
                                            }
                                            if (field576 < -55) {
                                                field700 = 2;
                                            }
                                            if (field576 > 55) {
                                                field700 = -2;
                                            }
                                            if (field634 < -40) {
                                                field543 = 1;
                                            }
                                            if (field634 > 40) {
                                                field543 = -1;
                                            }
                                            field549++;
                                            if (field549 > 500) {
                                                field549 = 0;
                                                int var423 = (int) (Math.random() * 8.0D);
                                                if ((var423 & 0x1) == 1) {
                                                    field545 += field726;
                                                }
                                                if ((var423 & 0x2) == 2) {
                                                    field547 += field548;
                                                }
                                            }
                                            if (field545 < -60) {
                                                field726 = 2;
                                            }
                                            if (field545 > 60) {
                                                field726 = -2;
                                            }
                                            if (field547 < -20) {
                                                field548 = 1;
                                            }
                                            if (field547 > 10) {
                                                field548 = -1;
                                            }
                                            for (class28 var424 = (class28) field533.method3289(); var424 != null; var424 = (class28) field533.method3290()) {
                                                if ((long) var424.field742 < Statics.method2045() / 1000L - 5L) {
                                                    if (var424.field739 > 0) {
                                                        method2379(5, "", var424.field738 + class134.field2209);
                                                    }
                                                    if (var424.field739 == 0) {
                                                        method2379(5, "", var424.field738 + class134.field2210);
                                                    }
                                                    var424.method3355();
                                                }
                                            }
                                            field494++;
                                            if (field494 > 50) {
                                                field692.method2319(236);
                                            }
                                            try {
                                                if (Statics.field137 != null && field692.field2022 > 0) {
                                                    Statics.field137.method1380(field692.field2025, 0, field692.field2022);
                                                    field692.field2022 = 0;
                                                    field494 = 0;
                                                }
                                            } catch (IOException var430) {
                                                if (field518 > 0) {
                                                    method545();
                                                } else {
                                                    method62(40);
                                                    Statics.field1958 = Statics.field137;
                                                    Statics.field137 = null;
                                                }
                                            }
                                            return;
                                        }
                                        var372 = var371.field5;
                                        if (var372.field2575 < 0) {
                                            break;
                                        }
                                        var373 = class158.method3(var372.field2585);
                                    } while (var373 == null || var373.field2642 == null || var372.field2575 >= var373.field2642.length || var373.field2642[var372.field2575] != var372);
                                    class26.method2(var371);
                                }
                            }
                            var369 = var368.field5;
                            if (var369.field2575 < 0) {
                                break;
                            }
                            var370 = class158.method3(var369.field2585);
                        } while (var370 == null || var370.field2642 == null || var369.field2575 >= var370.field2642.length || var370.field2642[var369.field2575] != var369);
                        class26.method2(var368);
                    }
                }
                var366 = var365.field5;
                if (var366.field2575 < 0) {
                    break;
                }
                var367 = class158.method3(var366.field2585);
            } while (var367 == null || var367.field2642 == null || var366.field2575 >= var367.field2642.length || var367.field2642[var366.field2575] != var366);
            class26.method2(var365);
        }
    }

    @ObfuscatedName("ce.h(B)V")
    public static final void method1847() {
        if (Statics.field860 != null) {
            Statics.field860.method1154();
        }
        if (Statics.field270 != null) {
            Statics.field270.method1154();
        }
    }

    @ObfuscatedName("w.n(I)V")
    public static final void method169() {
        for (int var0 = 0; var0 < field680; var0++) {
            int var10002 = field660[var0]--;
            if (field660[var0] >= -10) {
                class57 var2 = field676[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1254(Statics.field1316, field561[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field660[var0] += var2.method1255();
                    field676[var0] = var2;
                }
                if (field660[var0] < 0) {
                    int var9;
                    if (field715[var0] == 0) {
                        var9 = field709;
                    } else {
                        int var3 = (field715[var0] & 0xFF) * 128;
                        int var4 = field715[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field71.field410;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field715[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field71.field407;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field660[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field710 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1260().method1319(Statics.field2019);
                        class45 var11 = class45.method996(var10, 100, var9);
                        var11.method967(field713[var0] - 1);
                        Statics.field2021.method1123(var11);
                    }
                    field660[var0] = -100;
                }
            } else {
                field680--;
                for (int var1 = var0; var1 < field680; var1++) {
                    field561[var1] = field561[var1 + 1];
                    field676[var1] = field676[var1 + 1];
                    field713[var1] = field713[var1 + 1];
                    field660[var1] = field660[var1 + 1];
                    field715[var1] = field715[var1 + 1];
                }
                var0--;
            }
        }
        if (field708 && !class138.method2682()) {
            if (field622 != 0 && field573 != -1) {
                class138.method1408(Statics.field98, field573, 0, field622, false);
            }
            field708 = false;
        }
    }

    @ObfuscatedName("ex.s(Lar;IIII)V")
    public static void method3070(class34 arg0, int arg1, int arg2, int arg3) {
        if (field680 >= 50 || field710 == 0 || arg0.field879 == null || arg1 >= arg0.field879.length) {
            return;
        }
        int var4 = arg0.field879[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field561[field680] = var5;
        field713[field680] = var6;
        field660[field680] = 0;
        field676[field680] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field715[field680] = (var8 << 16) + (var9 << 8) + var7;
        field680++;
    }

    @ObfuscatedName("r.c(IIII)V")
    public static void method9(int arg0, int arg1, int arg2) {
        if (field709 == 0 || arg1 == 0 || field680 >= 50) {
            return;
        }
        field561[field680] = arg0;
        field713[field680] = arg1;
        field660[field680] = arg2;
        field676[field680] = null;
        field715[field680] = 0;
        field680++;
    }

    @ObfuscatedName("v.ap(III)V")
    public static void method28(int arg0, int arg1) {
        if (field622 != 0 && arg0 != -1) {
            class138.method1408(Statics.field2047, arg0, 0, field622, false);
            field708 = true;
        }
    }

    @ObfuscatedName("o.au(B)V")
    public static final void method135() {
        for (int var0 = -1; var0 < field592; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field593[var0];
            }
            class3 var2 = field693[var1];
            if (var2 != null && var2.field446 > 0) {
                var2.field446--;
                if (var2.field446 == 0) {
                    var2.field419 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field509; var3++) {
            int var4 = field510[var3];
            class25 var5 = field631[var4];
            if (var5 != null && var5.field446 > 0) {
                var5.field446--;
                if (var5.field446 == 0) {
                    var5.field419 = null;
                }
            }
        }
    }

    @ObfuscatedName("ek.ab(B)V")
    public static final void method2671() {
        for (int var0 = 0; var0 < field509; var0++) {
            int var1 = field510[var0];
            class25 var2 = field631[var1];
            if (var2 != null) {
                method145(var2, var2.field383.field773);
            }
        }
    }

    @ObfuscatedName("u.ae(Lam;II)V")
    public static final void method145(class27 arg0, int arg1) {
        if (arg0.field467 > field482) {
            Statics.method2369(arg0);
        } else if (arg0.field450 >= field482) {
            method1664(arg0);
        } else {
            arg0.field432 = arg0.field452;
            if (arg0.field457 == 0) {
                arg0.field461 = 0;
            } else {
                label424: {
                    if (arg0.field435 != -1 && arg0.field438 == 0) {
                        class34 var2 = class34.method2349(arg0.field435);
                        if (arg0.field462 > 0 && var2.field871 == 0) {
                            arg0.field461++;
                            break label424;
                        }
                        if (arg0.field462 <= 0 && var2.field888 == 0) {
                            arg0.field461++;
                            break label424;
                        }
                    }
                    int var3 = arg0.field410;
                    int var4 = arg0.field407;
                    int var5 = arg0.field458[arg0.field457 - 1] * 128 + arg0.field436 * 64;
                    int var6 = arg0.field447[arg0.field457 - 1] * 128 + arg0.field436 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field454 = 1280;
                            } else if (var4 > var6) {
                                arg0.field454 = 1792;
                            } else {
                                arg0.field454 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field454 = 768;
                            } else if (var4 > var6) {
                                arg0.field454 = 256;
                            } else {
                                arg0.field454 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field454 = 1024;
                        } else if (var4 > var6) {
                            arg0.field454 = 0;
                        }
                        int var7 = arg0.field454 - arg0.field408 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field418;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field414;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field417;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field416;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field414;
                        }
                        arg0.field432 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class25) {
                            var10 = ((class25) arg0).field383.field772;
                        }
                        if (var10) {
                            if (arg0.field454 != arg0.field408 && arg0.field420 == -1 && arg0.field456 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field457 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field457 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field461 > 0 && arg0.field457 > 1) {
                                var9 = 8;
                                arg0.field461--;
                            }
                        } else {
                            if (arg0.field457 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field457 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field461 > 0 && arg0.field457 > 1) {
                                var9 = 8;
                                arg0.field461--;
                            }
                        }
                        if (arg0.field415[arg0.field457 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field432 == arg0.field414 && arg0.field466 != -1) {
                            arg0.field432 = arg0.field466;
                        }
                        if (var3 < var5) {
                            arg0.field410 += var9;
                            if (arg0.field410 > var5) {
                                arg0.field410 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field410 -= var9;
                            if (arg0.field410 < var5) {
                                arg0.field410 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field407 += var9;
                            if (arg0.field407 > var6) {
                                arg0.field407 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field407 -= var9;
                            if (arg0.field407 < var6) {
                                arg0.field407 = var6;
                            }
                        }
                        if (arg0.field410 == var5 && arg0.field407 == var6) {
                            arg0.field457--;
                            if (arg0.field462 > 0) {
                                arg0.field462--;
                            }
                        }
                    } else {
                        arg0.field410 = var5;
                        arg0.field407 = var6;
                    }
                }
            }
        }
        if (arg0.field410 < 128 || arg0.field407 < 128 || arg0.field410 >= 13184 || arg0.field407 >= 13184) {
            arg0.field435 = -1;
            arg0.field455 = -1;
            arg0.field467 = 0;
            arg0.field450 = 0;
            arg0.field410 = arg0.field458[0] * 128 + arg0.field436 * 64;
            arg0.field407 = arg0.field447[0] * 128 + arg0.field436 * 64;
            arg0.method261();
        }
        if (Statics.field71 == arg0 && (arg0.field410 < 1536 || arg0.field407 < 1536 || arg0.field410 >= 11776 || arg0.field407 >= 11776)) {
            arg0.field435 = -1;
            arg0.field455 = -1;
            arg0.field467 = 0;
            arg0.field450 = 0;
            arg0.field410 = arg0.field458[0] * 128 + arg0.field436 * 64;
            arg0.field407 = arg0.field447[0] * 128 + arg0.field436 * 64;
            arg0.method261();
        }
        if (arg0.field456 != 0) {
            if (arg0.field420 != -1 && arg0.field420 < 32768) {
                class25 var11 = field631[arg0.field420];
                if (var11 != null) {
                    int var12 = arg0.field410 - var11.field410;
                    int var13 = arg0.field407 - var11.field407;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field454 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field420 >= 32768) {
                int var14 = arg0.field420 - 32768;
                if (field597 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field693[var14];
                if (var15 != null) {
                    int var16 = arg0.field410 - var15.field410;
                    int var17 = arg0.field407 - var15.field407;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field454 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field430 != 0 || arg0.field431 != 0) && (arg0.field457 == 0 || arg0.field461 > 0)) {
                int var18 = arg0.field410 - (arg0.field430 * 64 - Statics.field54 * 64 - Statics.field54 * 64);
                int var19 = arg0.field407 - (arg0.field431 * 64 - Statics.field977 * 64 - Statics.field977 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field454 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field430 = 0;
                arg0.field431 = 0;
            }
            int var20 = arg0.field454 - arg0.field408 & 0x7FF;
            if (var20 == 0) {
                arg0.field423 = 0;
            } else {
                arg0.field423++;
                if (var20 > 1024) {
                    arg0.field408 -= arg0.field456;
                    boolean var21 = true;
                    if (var20 < arg0.field456 || var20 > 2048 - arg0.field456) {
                        arg0.field408 = arg0.field454;
                        var21 = false;
                    }
                    if (arg0.field452 == arg0.field432 && (arg0.field423 > 25 || var21)) {
                        if (arg0.field412 == -1) {
                            arg0.field432 = arg0.field414;
                        } else {
                            arg0.field432 = arg0.field412;
                        }
                    }
                } else {
                    arg0.field408 += arg0.field456;
                    boolean var22 = true;
                    if (var20 < arg0.field456 || var20 > 2048 - arg0.field456) {
                        arg0.field408 = arg0.field454;
                        var22 = false;
                    }
                    if (arg0.field452 == arg0.field432 && (arg0.field423 > 25 || var22)) {
                        if (arg0.field413 == -1) {
                            arg0.field432 = arg0.field414;
                        } else {
                            arg0.field432 = arg0.field413;
                        }
                    }
                }
                arg0.field408 &= 0x7FF;
            }
        }
        arg0.field409 = false;
        if (arg0.field432 != -1) {
            class34 var24 = class34.method2349(arg0.field432);
            if (var24 == null || var24.field876 == null) {
                arg0.field432 = -1;
            } else {
                arg0.field434++;
                if (arg0.field433 < var24.field876.length && arg0.field434 > var24.field878[arg0.field433]) {
                    arg0.field434 = 1;
                    arg0.field433++;
                    method3070(var24, arg0.field433, arg0.field410, arg0.field407);
                }
                if (arg0.field433 >= var24.field876.length) {
                    arg0.field434 = 0;
                    arg0.field433 = 0;
                    method3070(var24, arg0.field433, arg0.field410, arg0.field407);
                }
            }
        }
        if (arg0.field455 != -1 && field482 >= arg0.field443) {
            if (arg0.field441 < 0) {
                arg0.field441 = 0;
            }
            int var25 = class35.method233(arg0.field455).field900;
            if (var25 == -1) {
                arg0.field455 = -1;
            } else {
                class34 var26 = class34.method2349(var25);
                if (var26 == null || var26.field876 == null) {
                    arg0.field455 = -1;
                } else {
                    arg0.field460++;
                    if (arg0.field441 < var26.field876.length && arg0.field460 > var26.field878[arg0.field441]) {
                        arg0.field460 = 1;
                        arg0.field441++;
                        method3070(var26, arg0.field441, arg0.field410, arg0.field407);
                    }
                    if (arg0.field441 >= var26.field876.length && (arg0.field441 < 0 || arg0.field441 >= var26.field876.length)) {
                        arg0.field455 = -1;
                    }
                }
            }
        }
        if (arg0.field435 != -1 && arg0.field438 <= 1) {
            class34 var27 = class34.method2349(arg0.field435);
            if (var27.field871 == 1 && arg0.field462 > 0 && arg0.field467 <= field482 && arg0.field450 < field482) {
                arg0.field438 = 1;
                return;
            }
        }
        if (arg0.field435 != -1 && arg0.field438 == 0) {
            class34 var28 = class34.method2349(arg0.field435);
            if (var28 == null || var28.field876 == null) {
                arg0.field435 = -1;
            } else {
                arg0.field449++;
                if (arg0.field421 < var28.field876.length && arg0.field449 > var28.field878[arg0.field421]) {
                    arg0.field449 = 1;
                    arg0.field421++;
                    method3070(var28, arg0.field421, arg0.field410, arg0.field407);
                }
                if (arg0.field421 >= var28.field876.length) {
                    arg0.field421 -= var28.field880;
                    arg0.field439++;
                    if (arg0.field439 >= var28.field886) {
                        arg0.field435 = -1;
                    } else if (arg0.field421 >= 0 && arg0.field421 < var28.field876.length) {
                        method3070(var28, arg0.field421, arg0.field410, arg0.field407);
                    } else {
                        arg0.field435 = -1;
                    }
                }
                arg0.field409 = var28.field890;
            }
        }
        if (arg0.field438 > 0) {
            arg0.field438--;
        }
    }

    @ObfuscatedName("cg.av(Lam;I)V")
    public static final void method1664(class27 arg0) {
        if (field482 == arg0.field450 || arg0.field435 == -1 || arg0.field438 != 0 || arg0.field449 + 1 > class34.method2349(arg0.field435).field878[arg0.field421]) {
            int var1 = arg0.field450 - arg0.field467;
            int var2 = field482 - arg0.field467;
            int var3 = arg0.field445 * 128 + arg0.field436 * 64;
            int var4 = arg0.field442 * 128 + arg0.field436 * 64;
            int var5 = arg0.field464 * 128 + arg0.field436 * 64;
            int var6 = arg0.field448 * 128 + arg0.field436 * 64;
            arg0.field410 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field407 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field461 = 0;
        if (arg0.field451 == 0) {
            arg0.field454 = 1024;
        }
        if (arg0.field451 == 1) {
            arg0.field454 = 1536;
        }
        if (arg0.field451 == 2) {
            arg0.field454 = 0;
        }
        if (arg0.field451 == 3) {
            arg0.field454 = 512;
        }
        arg0.field408 = arg0.field454;
    }

    @ObfuscatedName("s.ar(Lv;III)V")
    public static void method242(class3 arg0, int arg1, int arg2) {
        if (arg0.field435 == arg1 && arg1 != -1) {
            int var3 = class34.method2349(arg1).field889;
            if (var3 == 1) {
                arg0.field421 = 0;
                arg0.field449 = 0;
                arg0.field438 = arg2;
                arg0.field439 = 0;
            }
            if (var3 == 2) {
                arg0.field439 = 0;
            }
        } else if (arg1 == -1 || arg0.field435 == -1 || class34.method2349(arg1).field883 >= class34.method2349(arg0.field435).field883) {
            arg0.field435 = arg1;
            arg0.field421 = 0;
            arg0.field449 = 0;
            arg0.field438 = arg2;
            arg0.field439 = 0;
            arg0.field462 = arg0.field457;
        }
    }

    @ObfuscatedName("bn.ac(Ljava/lang/String;ZI)V")
    public static final void method1503(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1905.method3396(arg0, 250);
        int var6 = Statics.field1905.method3453(arg0, 250) * 13;
        class89.method1787(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1831(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1905.method3401(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2666(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1494.getGraphics();
                Statics.field468.method1594(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1494.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field515; var13++) {
            if (field679[var13] + field677[var13] > var9 && field677[var13] < var9 + var11 && field580[var13] + field508[var13] > var10 && field508[var13] < var10 + var12) {
                field675[var13] = true;
            }
        }
    }

    @ObfuscatedName("ch.ax(IIIII)V")
    public static final void method2042(int arg0, int arg1, int arg2, int arg3) {
        class89.method1781(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2161();
        field575++;
        method1368(true);
        method129(true);
        method1368(false);
        method129(false);
        for (class10 var4 = (class10) field662.method3326(); var4 != null; var4 = (class10) field662.method3347()) {
            if (Statics.field2386 != var4.field153 || field482 > var4.field157) {
                var4.method3359();
            } else if (field482 >= var4.field148) {
                if (var4.field152 > 0) {
                    class25 var5 = field631[var4.field152 - 1];
                    if (var5 != null && var5.field410 >= 0 && var5.field410 < 13312 && var5.field407 >= 0 && var5.field407 < 13312) {
                        var4.method122(var5.field410, var5.field407, method264(var5.field410, var5.field407, var4.field153) - var4.field165, field482);
                    }
                }
                if (var4.field152 < 0) {
                    int var6 = -var4.field152 - 1;
                    class3 var7;
                    if (field597 == var6) {
                        var7 = Statics.field71;
                    } else {
                        var7 = field693[var6];
                    }
                    if (var7 != null && var7.field410 >= 0 && var7.field410 < 13312 && var7.field407 >= 0 && var7.field407 < 13312) {
                        var4.method122(var7.field410, var7.field407, method264(var7.field410, var7.field407, var4.field153) - var4.field165, field482);
                    }
                }
                var4.method132(field550);
                Statics.field1268.method2028(Statics.field2386, (int) var4.field154, (int) var4.field155, (int) var4.field156, 60, var4, var4.field147, -1, false);
            }
        }
        method1237();
        if (!field636) {
            int var8 = field584;
            if (field563 / 256 > var8) {
                var8 = field563 / 256;
            }
            if (field718[4] && field644[4] + 128 > var8) {
                var8 = field644[4] + 128;
            }
            int var9 = field634 + field558 & 0x7FF;
            method1369(Statics.field2826, method264(Statics.field71.field410, Statics.field71.field407, Statics.field2386) - 50, Statics.field1177, var8, var9, var8 * 3 + 600);
        }
        int var22;
        if (field636) {
            int var23;
            if (Statics.field245.field179) {
                var23 = Statics.field2386;
            } else {
                int var24 = method264(Statics.field2069, Statics.field1178, Statics.field2386);
                if (var24 - Statics.field1609 >= 800 || (class9.field115[Statics.field2386][Statics.field2069 >> 7][Statics.field1178 >> 7] & 0x4) == 0) {
                    var23 = 3;
                } else {
                    var23 = Statics.field2386;
                }
            }
            var22 = var23;
        } else {
            int var10;
            if (Statics.field245.field179) {
                var10 = Statics.field2386;
            } else {
                int var11 = 3;
                if (Statics.field1608 < 310) {
                    int var12 = Statics.field2069 >> 7;
                    int var13 = Statics.field1178 >> 7;
                    int var14 = Statics.field71.field410 >> 7;
                    int var15 = Statics.field71.field407 >> 7;
                    if ((class9.field115[Statics.field2386][var12][var13] & 0x4) != 0) {
                        var11 = Statics.field2386;
                    }
                    int var16;
                    if (var14 > var12) {
                        var16 = var14 - var12;
                    } else {
                        var16 = var12 - var14;
                    }
                    int var17;
                    if (var15 > var13) {
                        var17 = var15 - var13;
                    } else {
                        var17 = var13 - var15;
                    }
                    if (var16 > var17) {
                        int var18 = var17 * 65536 / var16;
                        int var19 = 32768;
                        while (var12 != var14) {
                            if (var12 < var14) {
                                var12++;
                            } else if (var12 > var14) {
                                var12--;
                            }
                            if ((class9.field115[Statics.field2386][var12][var13] & 0x4) != 0) {
                                var11 = Statics.field2386;
                            }
                            var19 += var18;
                            if (var19 >= 65536) {
                                var19 -= 65536;
                                if (var13 < var15) {
                                    var13++;
                                } else if (var13 > var15) {
                                    var13--;
                                }
                                if ((class9.field115[Statics.field2386][var12][var13] & 0x4) != 0) {
                                    var11 = Statics.field2386;
                                }
                            }
                        }
                    } else {
                        int var20 = var16 * 65536 / var17;
                        int var21 = 32768;
                        while (var13 != var15) {
                            if (var13 < var15) {
                                var13++;
                            } else if (var13 > var15) {
                                var13--;
                            }
                            if ((class9.field115[Statics.field2386][var12][var13] & 0x4) != 0) {
                                var11 = Statics.field2386;
                            }
                            var21 += var20;
                            if (var21 >= 65536) {
                                var21 -= 65536;
                                if (var12 < var14) {
                                    var12++;
                                } else if (var12 > var14) {
                                    var12--;
                                }
                                if ((class9.field115[Statics.field2386][var12][var13] & 0x4) != 0) {
                                    var11 = Statics.field2386;
                                }
                            }
                        }
                    }
                }
                if ((class9.field115[Statics.field2386][Statics.field71.field410 >> 7][Statics.field71.field407 >> 7] & 0x4) != 0) {
                    var11 = Statics.field2386;
                }
                var10 = var11;
            }
            var22 = var10;
        }
        int var25 = Statics.field2069;
        int var26 = Statics.field1609;
        int var27 = Statics.field1178;
        int var28 = Statics.field1608;
        int var29 = Statics.field2445;
        for (int var30 = 0; var30 < 5; var30++) {
            if (field718[var30]) {
                int var31 = (int) (Math.random() * (double) (field719[var30] * 2 + 1) - (double) field719[var30] + Math.sin((double) field611[var30] / 100.0D * (double) field722[var30]) * (double) field644[var30]);
                if (var30 == 0) {
                    Statics.field2069 += var31;
                }
                if (var30 == 1) {
                    Statics.field1609 += var31;
                }
                if (var30 == 2) {
                    Statics.field1178 += var31;
                }
                if (var30 == 3) {
                    Statics.field2445 = Statics.field2445 + var31 & 0x7FF;
                }
                if (var30 == 4) {
                    Statics.field1608 += var31;
                    if (Statics.field1608 < 128) {
                        Statics.field1608 = 128;
                    }
                    if (Statics.field1608 > 383) {
                        Statics.field1608 = 383;
                    }
                }
            }
        }
        int var32 = class77.field1382;
        int var33 = class77.field1375;
        if (var32 >= arg0 && var32 < arg0 + arg2 && var33 >= arg1 && var33 < arg1 + arg3) {
            class112.field1859 = true;
            class112.field1883 = 0;
            class112.field1880 = class77.field1382 - arg0;
            class112.field1895 = class77.field1375 - arg1;
        } else {
            class112.field1859 = false;
            class112.field1883 = 0;
        }
        method1847();
        class89.method1787(arg0, arg1, arg2, arg3, 0);
        method1847();
        Statics.field1268.method1896(Statics.field2069, Statics.field1609, Statics.field1178, Statics.field1608, Statics.field2445, var22);
        method1847();
        Statics.field1268.method1872();
        method32(arg0, arg1, arg2, arg3);
        if (field520 == 2) {
            method2217((field493 - Statics.field54 << 7) + field496, (field678 - Statics.field977 << 7) + field497, field731 * 2);
            if (field606 > -1 && field482 % 20 < 10) {
                Statics.field1739[0].method1684(field606 + arg0 - 12, field577 + arg1 - 28);
            }
        }
        ((class110) Statics.field1761).method2220(field550);
        if (field581 == 1) {
            Statics.field2451[field560 / 100].method1684(field596 - 8, field579 - 8);
        }
        if (field581 == 2) {
            Statics.field2451[field560 / 100 + 4].method1684(field596 - 8, field579 - 8);
        }
        method2132();
        if (field488) {
            int var34 = arg0 + 512 - 5;
            int var35 = arg1 + 20;
            Statics.field1905.method3400("Fps:" + field1304, var34, var35, 16776960, -1);
            int var66 = var35 + 15;
            Runtime var36 = Runtime.getRuntime();
            int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
            int var38 = 16776960;
            if (var37 > 32768 && field477) {
                var38 = 16711680;
            }
            if (var37 > 65536 && !field477) {
                var38 = 16711680;
            }
            Statics.field1905.method3400("Mem:" + var37 + "k", var34, var66, var38, -1);
            var35 = var66 + 15;
        }
        Statics.field2069 = var25;
        Statics.field1609 = var26;
        Statics.field1178 = var27;
        Statics.field1608 = var28;
        Statics.field2445 = var29;
        if (field481 && class153.method1572(true, false) == 0) {
            field481 = false;
        }
        if (field481) {
            class89.method1787(arg0, arg1, arg2, arg3, 0);
            method1503(class134.field2301, false);
        }
        if (field481 || field613 || var32 < arg0 || var32 >= arg0 + arg2 || var33 < arg1 || var33 >= arg1 + arg3) {
            return;
        }
        if (field625 == 0 && !field627) {
            method41(class134.field2217, "", 23, 0, var32 - arg0, var33 - arg1);
        }
        int var39 = -1;
        for (int var40 = 0; var40 < class112.field1883; var40++) {
            int var41 = class112.field1897[var40];
            int var42 = var41 & 0x7F;
            int var43 = var41 >> 7 & 0x7F;
            int var44 = var41 >> 29 & 0x3;
            int var45 = var41 >> 14 & 0x7FFF;
            if (var39 != var41) {
                var39 = var41;
                if (var44 == 2 && Statics.field1268.method1888(Statics.field2386, var42, var43, var41) >= 0) {
                    class32 var46 = class32.method606(var45);
                    if (var46.field857 != null) {
                        var46 = var46.method642();
                    }
                    if (var46 == null) {
                        continue;
                    }
                    if (field625 == 1) {
                        method41(class134.field2212, field626 + " " + class2.field22 + " " + class2.method1661(65535) + var46.field826, 1, var41, var42, var43);
                    } else if (!field627) {
                        String[] var47 = var46.field839;
                        if (field641) {
                            var47 = method547(var47);
                        }
                        if (var47 != null) {
                            for (int var48 = 4; var48 >= 0; var48--) {
                                if (var47[var48] != null) {
                                    short var49 = 0;
                                    if (var48 == 0) {
                                        var49 = 3;
                                    }
                                    if (var48 == 1) {
                                        var49 = 4;
                                    }
                                    if (var48 == 2) {
                                        var49 = 5;
                                    }
                                    if (var48 == 3) {
                                        var49 = 6;
                                    }
                                    if (var48 == 4) {
                                        var49 = 1001;
                                    }
                                    method41(var47[var48], class2.method1661(65535) + var46.field826, var49, var41, var42, var43);
                                }
                            }
                        }
                        method41(class134.field2256, class2.method1661(65535) + var46.field826, 1002, var46.field817 << 14, var42, var43);
                    } else if ((Statics.field2070 & 0x4) == 4) {
                        method41(field629, field630 + " " + class2.field22 + " " + class2.method1661(65535) + var46.field826, 2, var41, var42, var43);
                    }
                }
                if (var44 == 1) {
                    class25 var50 = field631[var45];
                    if (var50.field383.field773 == 1 && (var50.field410 & 0x7F) == 64 && (var50.field407 & 0x7F) == 64) {
                        for (int var51 = 0; var51 < field509; var51++) {
                            class25 var52 = field631[field510[var51]];
                            if (var52 != null && var50 != var52 && var52.field383.field773 == 1 && var50.field410 == var52.field410 && var50.field407 == var52.field407) {
                                method123(var52.field383, field510[var51], var42, var43);
                            }
                        }
                        for (int var53 = 0; var53 < field592; var53++) {
                            class3 var54 = field693[field593[var53]];
                            if (var54 != null && var50.field410 == var54.field410 && var50.field407 == var54.field407) {
                                method2343(var54, field593[var53], var42, var43);
                            }
                        }
                    }
                    method123(var50.field383, var45, var42, var43);
                }
                if (var44 == 0) {
                    class3 var55 = field693[var45];
                    if ((var55.field410 & 0x7F) == 64 && (var55.field407 & 0x7F) == 64) {
                        for (int var56 = 0; var56 < field509; var56++) {
                            class25 var57 = field631[field510[var56]];
                            if (var57 != null && var57.field383.field773 == 1 && var55.field410 == var57.field410 && var55.field407 == var57.field407) {
                                method123(var57.field383, field510[var56], var42, var43);
                            }
                        }
                        for (int var58 = 0; var58 < field592; var58++) {
                            class3 var59 = field693[field593[var58]];
                            if (var59 != null && var55 != var59 && var55.field410 == var59.field410 && var55.field407 == var59.field407) {
                                method2343(var59, field593[var58], var42, var43);
                            }
                        }
                    }
                    method2343(var55, var45, var42, var43);
                }
                if (var44 == 3) {
                    class177 var60 = field605[Statics.field2386][var42][var43];
                    if (var60 != null) {
                        for (class17 var61 = (class17) var60.method3335(); var61 != null; var61 = (class17) var60.method3334()) {
                            class40 var62 = class40.method789(var61.field261);
                            if (field625 == 1) {
                                method41(class134.field2212, field626 + " " + class2.field22 + " " + class2.method1661(16748608) + var62.field986, 16, var61.field261, var42, var43);
                            } else if (!field627) {
                                String[] var63 = var62.field1016;
                                if (field641) {
                                    var63 = method547(var63);
                                }
                                for (int var64 = 4; var64 >= 0; var64--) {
                                    if (var63 != null && var63[var64] != null) {
                                        byte var65 = 0;
                                        if (var64 == 0) {
                                            var65 = 18;
                                        }
                                        if (var64 == 1) {
                                            var65 = 19;
                                        }
                                        if (var64 == 2) {
                                            var65 = 20;
                                        }
                                        if (var64 == 3) {
                                            var65 = 21;
                                        }
                                        if (var64 == 4) {
                                            var65 = 22;
                                        }
                                        method41(var63[var64], class2.method1661(16748608) + var62.field986, var65, var61.field261, var42, var43);
                                    } else if (var64 == 2) {
                                        method41(class134.field2072, class2.method1661(16748608) + var62.field986, 20, var61.field261, var42, var43);
                                    }
                                }
                                method41(class134.field2256, class2.method1661(16748608) + var62.field986, 1004, var61.field261, var42, var43);
                            } else if ((Statics.field2070 & 0x1) == 1) {
                                method41(field629, field630 + " " + class2.field22 + " " + class2.method1661(16748608) + var62.field986, 17, var61.field261, var42, var43);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.ao(ZI)V")
    public static final void method1368(boolean arg0) {
        if (Statics.field71.field410 >> 7 == field703 && Statics.field71.field407 >> 7 == field704) {
            field703 = 0;
        }
        int var1 = field592;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field71;
                var4 = 33538048;
            } else {
                var3 = field693[field593[var2]];
                var4 = field593[var2] << 14;
            }
            if (var3 != null && var3.method17()) {
                var3.field32 = false;
                if ((field477 && field592 > 50 || field592 > 200) && !arg0 && var3.field452 == var3.field432) {
                    var3.field32 = true;
                }
                int var5 = var3.field410 >> 7;
                int var6 = var3.field407 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field41 == null || field482 < var3.field36 || field482 >= var3.field33) {
                        if ((var3.field410 & 0x7F) == 64 && (var3.field407 & 0x7F) == 64) {
                            if (field575 == field574[var5][var6]) {
                                continue;
                            }
                            field574[var5][var6] = field575;
                        }
                        var3.field35 = method264(var3.field410, var3.field407, Statics.field2386);
                        Statics.field1268.method2028(Statics.field2386, var3.field410, var3.field407, var3.field35, 60, var3, var3.field408, var4, var3.field409);
                    } else {
                        var3.field32 = false;
                        var3.field35 = method264(var3.field410, var3.field407, Statics.field2386);
                        Statics.field1268.method1890(Statics.field2386, var3.field410, var3.field407, var3.field35, 60, var3, var3.field408, var4, var3.field38, var3.field43, var3.field44, var3.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.aj(ZI)V")
    public static final void method129(boolean arg0) {
        for (int var1 = 0; var1 < field509; var1++) {
            class25 var2 = field631[field510[var1]];
            int var3 = (field510[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field383.field792 == arg0 && var2.field383.method609()) {
                int var4 = var2.field410 >> 7;
                int var5 = var2.field407 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field436 == 1 && (var2.field410 & 0x7F) == 64 && (var2.field407 & 0x7F) == 64) {
                        if (field575 == field574[var4][var5]) {
                            continue;
                        }
                        field574[var4][var5] = field575;
                    }
                    if (!var2.field383.field800) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1268.method2028(Statics.field2386, var2.field410, var2.field407, method264(var2.field410 + (var2.field436 * 64 - 64), var2.field407 + (var2.field436 * 64 - 64), Statics.field2386), var2.field436 * 64 - 64 + 60, var2, var2.field408, var3, var2.field409);
                }
            }
        }
    }

    @ObfuscatedName("bp.al(B)V")
    public static final void method1237() {
        for (class20 var0 = (class20) field554.method3326(); var0 != null; var0 = (class20) field554.method3347()) {
            if (Statics.field2386 != var0.field281 || var0.field288) {
                var0.method3359();
            } else if (field482 >= var0.field289) {
                var0.method189(field550);
                if (var0.field288) {
                    var0.method3359();
                } else {
                    Statics.field1268.method2028(var0.field281, var0.field279, var0.field283, var0.field285, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("p.ak(IIIII)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3) {
        field564 = 0;
        for (int var4 = -1; var4 < field592 + field509; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field71;
            } else if (var4 < field592) {
                var5 = field693[field593[var4]];
            } else {
                var5 = field631[field510[var4 - field592]];
            }
            if (var5 != null && var5.method17()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field383;
                    if (var6.field797 != null) {
                        var6 = var6.method608();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field592) {
                    class31 var9 = ((class25) var5).field383;
                    if (var9.field797 != null) {
                        var9 = var9.method608();
                    }
                    if (var9.field795 >= 0 && var9.field795 < Statics.field465.length) {
                        method63(var5, var5.field453 + 15);
                        if (field606 > -1) {
                            Statics.field465[var9.field795].method1684(field606 + arg0 - 12, field577 + arg1 - 30);
                        }
                    }
                    if (field520 == 1 && field491 == field510[var4 - field592] && field482 % 20 < 10) {
                        method63(var5, var5.field453 + 15);
                        if (field606 > -1) {
                            Statics.field1739[0].method1684(field606 + arg0 - 12, field577 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field31 != -1 || var8.field29 != -1) {
                        method63(var5, var5.field453 + 15);
                        if (field606 > -1) {
                            if (var8.field31 != -1) {
                                Statics.field11[var8.field31].method1684(field606 + arg0 - 12, field577 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field29 != -1) {
                                Statics.field465[var8.field29].method1684(field606 + arg0 - 12, field577 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field520 == 10 && field492 == field593[var4]) {
                        method63(var5, var5.field453 + 15);
                        if (field606 > -1) {
                            Statics.field1739[1].method1684(field606 + arg0 - 12, field577 + arg1 - var7);
                        }
                    }
                }
                if (var5.field419 != null && (var4 >= field592 || field528 == 0 || field528 == 3 || field528 == 1 && Statics.method237(((class3) var5).field39))) {
                    method63(var5, var5.field453);
                    if (field606 > -1 && field564 < field565) {
                        field652[field564] = Statics.field2821.method3394(var5.field419) / 2;
                        field624[field564] = Statics.field2821.field2843;
                        field566[field564] = field606;
                        field567[field564] = field577;
                        field570[field564] = var5.field463;
                        field655[field564] = var5.field422;
                        field724[field564] = var5.field446;
                        field720[field564] = var5.field419;
                        field564++;
                    }
                }
                if (var5.field426 > field482) {
                    method63(var5, var5.field453 + 15);
                    if (field606 > -1) {
                        int var10 = var5.field427 * 30 / var5.field428;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class89.method1787(field606 + arg0 - 15, field577 + arg1 - 3, var10, 5, 65280);
                        class89.method1787(field606 + arg0 - 15 + var10, field577 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field425[var11] > field482) {
                        method63(var5, var5.field453 / 2);
                        if (field606 > -1) {
                            if (var11 == 1) {
                                field577 -= 20;
                            }
                            if (var11 == 2) {
                                field606 -= 15;
                                field577 -= 10;
                            }
                            if (var11 == 3) {
                                field606 += 15;
                                field577 -= 10;
                            }
                            Statics.field210[var5.field424[var11]].method1684(field606 + arg0 - 12, field577 + arg1 - 12);
                            Statics.field251.method3411(Integer.toString(var5.field459[var11]), field606 + arg0 - 1, field577 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field564; var12++) {
            int var13 = field566[var12];
            int var14 = field567[var12];
            int var15 = field652[var12];
            int var16 = field624[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field567[var18] - field624[var18] && var14 - var16 < field567[var18] + 2 && var13 - var15 < field652[var18] + field566[var18] && var13 + var15 > field566[var18] - field652[var18] && field567[var18] - field624[var18] < var14) {
                        var14 = field567[var18] - field624[var18];
                        var17 = true;
                    }
                }
            }
            field606 = field566[var12];
            field577 = field567[var12] = var14;
            String var19 = field720[var12];
            if (field633 == 0) {
                int var20 = 16776960;
                if (field570[var12] < 6) {
                    var20 = field687[field570[var12]];
                }
                if (field570[var12] == 6) {
                    var20 = field575 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field570[var12] == 7) {
                    var20 = field575 % 20 < 10 ? 255 : 65535;
                }
                if (field570[var12] == 8) {
                    var20 = field575 % 20 < 10 ? 45056 : 8454016;
                }
                if (field570[var12] == 9) {
                    int var21 = 150 - field724[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field570[var12] == 10) {
                    int var22 = 150 - field724[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field570[var12] == 11) {
                    int var23 = 150 - field724[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field655[var12] == 0) {
                    Statics.field2821.method3411(var19, field606 + arg0, field577 + arg1, var20, 0);
                }
                if (field655[var12] == 1) {
                    Statics.field2821.method3476(var19, field606 + arg0, field577 + arg1, var20, 0, field575);
                }
                if (field655[var12] == 2) {
                    Statics.field2821.method3469(var19, field606 + arg0, field577 + arg1, var20, 0, field575);
                }
                if (field655[var12] == 3) {
                    Statics.field2821.method3457(var19, field606 + arg0, field577 + arg1, var20, 0, field575, 150 - field724[var12]);
                }
                if (field655[var12] == 4) {
                    int var24 = (150 - field724[var12]) * (Statics.field2821.method3394(var19) + 100) / 150;
                    class89.method1782(field606 + arg0 - 50, arg1, field606 + arg0 + 50, arg1 + arg3);
                    Statics.field2821.method3409(var19, field606 + arg0 + 50 - var24, field577 + arg1, var20, 0);
                    class89.method1781(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field655[var12] == 5) {
                    int var25 = 150 - field724[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1782(arg0, field577 + arg1 - Statics.field2821.field2843 - 1, arg0 + arg2, field577 + arg1 + 5);
                    Statics.field2821.method3411(var19, field606 + arg0, field577 + arg1 + var26, var20, 0);
                    class89.method1781(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2821.method3411(var19, field606 + arg0, field577 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("cv.ag(I)V")
    public static final void method2132() {
        field590 = 0;
        int var0 = (Statics.field71.field410 >> 7) + Statics.field54;
        int var1 = (Statics.field71.field407 >> 7) + Statics.field977;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field590 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field590 = 1;
        }
        if (field590 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field590 = 0;
        }
    }

    @ObfuscatedName("x.ah(Lam;II)V")
    public static final void method63(class27 arg0, int arg1) {
        method2217(arg0.field410, arg0.field407, arg1);
    }

    @ObfuscatedName("dm.ay(IIII)V")
    public static final void method2217(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field606 = -1;
            field577 = -1;
            return;
        }
        int var3 = method264(arg0, arg1, Statics.field2386) - arg2;
        int var4 = arg0 - Statics.field2069;
        int var5 = var3 - Statics.field1609;
        int var6 = arg1 - Statics.field1178;
        int var7 = class104.field1749[Statics.field1608];
        int var8 = class104.field1754[Statics.field1608];
        int var9 = class104.field1749[Statics.field2445];
        int var10 = class104.field1754[Statics.field2445];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field606 = (var11 << 9) / var15 + 256;
            field577 = (var14 << 9) / var15 + 167;
        } else {
            field606 = -1;
            field577 = -1;
        }
    }

    @ObfuscatedName("am.an(IIII)I")
    public static final int method264(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field115[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field141[var5][var3][var4] + class9.field141[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field141[var5][var3][var4 + 1] + class9.field141[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bq.aq(IIIIIIB)V")
    public static final void method1369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1749[var6];
            int var12 = class104.field1754[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1749[var7];
            int var15 = class104.field1754[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2069 = arg0 - var8;
        Statics.field1609 = arg1 - var9;
        Statics.field1178 = arg2 - var10;
        Statics.field1608 = arg3;
        Statics.field2445 = arg4;
    }

    @ObfuscatedName("ab.af(ZI)V")
    public static final void method599(boolean arg0) {
        field530 = arg0;
        if (!field530) {
            int var1 = field513.method2473();
            int var2 = field513.method2494();
            int var3 = field513.method2464();
            int var4 = (field514 - field513.field2022) / 16;
            Statics.field2741 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2741[var5][var6] = field513.method2447();
                }
            }
            int var7 = field513.method2609();
            int var8 = field513.method2494();
            Statics.field741 = new int[var4];
            Statics.field373 = new int[var4];
            Statics.field126 = new int[var4];
            Statics.field974 = new byte[var4][];
            Statics.field397 = new byte[var4][];
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
                        Statics.field741[var10] = var13;
                        Statics.field373[var10] = Statics.field348.method2974("m" + var11 + "_" + var12);
                        Statics.field126[var10] = Statics.field348.method2974("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1187(var8, var2, var3, var1, var7);
            return;
        }
        int var14 = field513.method2609();
        field513.method2321();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field513.method2322(1);
                    if (var18 == 1) {
                        field490[var15][var16][var17] = field513.method2322(26);
                    } else {
                        field490[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field513.method2323();
        int var19 = (field514 - field513.field2022) / 16;
        Statics.field2741 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2741[var20][var21] = field513.method2620();
            }
        }
        int var22 = field513.method2494();
        int var23 = field513.method2441();
        int var24 = field513.method2475();
        int var25 = field513.method2494();
        Statics.field741 = new int[var19];
        Statics.field373 = new int[var19];
        Statics.field126 = new int[var19];
        Statics.field974 = new byte[var19][];
        Statics.field397 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field490[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field741[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field741[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field373[var26] = Statics.field348.method2974("m" + var35 + "_" + var36);
                            Statics.field126[var26] = Statics.field348.method2974("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1187(var24, var14, var23, var25, var22);
    }

    @ObfuscatedName("az.aw(IIIIII)V")
    public static final void method1187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field125 == arg0 && Statics.field1266 == arg1 && field523 == arg2 || !field477) {
            return;
        }
        Statics.field125 = arg0;
        Statics.field1266 = arg1;
        field523 = arg2;
        if (!field477) {
            field523 = 0;
        }
        method62(25);
        method1503(class134.field2301, true);
        int var5 = Statics.field54;
        int var6 = Statics.field977;
        Statics.field54 = (arg0 - 6) * 8;
        Statics.field977 = (arg1 - 6) * 8;
        int var7 = Statics.field54 - var5;
        int var8 = Statics.field977 - var6;
        int var9 = Statics.field54;
        int var10 = Statics.field977;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field631[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field458[var13] -= var7;
                    var12.field447[var13] -= var8;
                }
                var12.field410 -= var7 * 128;
                var12.field407 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field693[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field458[var16] -= var7;
                    var15.field447[var16] -= var8;
                }
                var15.field410 -= var7 * 128;
                var15.field407 -= var8 * 128;
            }
        }
        Statics.field2386 = arg2;
        Statics.field71.method253(arg3, arg4, false);
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
                        field605[var27][var23][var24] = field605[var27][var25][var26];
                    } else {
                        field605[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field502.method3326(); var28 != null; var28 = (class22) field502.method3347()) {
            var28.field349 -= var7;
            var28.field338 -= var8;
            if (var28.field349 < 0 || var28.field338 < 0 || var28.field349 >= 104 || var28.field338 >= 104) {
                var28.method3359();
            }
        }
        if (field703 != 0) {
            field703 -= var7;
            field704 -= var8;
        }
        field680 = 0;
        field636 = false;
        field698 = -1;
        field554.method3320();
        field662.method3320();
    }

    @ObfuscatedName("s.at(ZB)V")
    public static final void method243(boolean arg0) {
        method1847();
        field494++;
        if (field494 < 50 && !arg0) {
            return;
        }
        field494 = 0;
        if (field522 || Statics.field137 == null) {
            return;
        }
        field692.method2319(236);
        try {
            Statics.field137.method1380(field692.field2025, 0, field692.field2022);
            field692.field2022 = 0;
        } catch (IOException var2) {
            field522 = true;
        }
    }

    @ObfuscatedName("i.aa(IIIIII)V")
    public static final void method125(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1268.method1997(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1268.method1888(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field469.field1446;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method606(var12);
            if (var13.field837 == -1) {
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
                class87 var14 = Statics.field51[var13.field837];
                if (var14 != null) {
                    int var15 = (var13.field825 * 4 - var14.field1459) / 2;
                    int var16 = (var13.field856 * 4 - var14.field1458) / 2;
                    var14.method1765(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field856) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1268.method1991(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1268.method1888(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method606(var21);
            if (var22.field837 != -1) {
                class87 var23 = Statics.field51[var22.field837];
                if (var23 != null) {
                    int var24 = (var22.field825 * 4 - var23.field1459) / 2;
                    int var25 = (var22.field856 * 4 - var23.field1458) / 2;
                    var23.method1765(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field856) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field469.field1446;
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
        int var29 = Statics.field1268.method2021(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method606(var30);
        if (var31.field837 == -1) {
            return;
        }
        class87 var32 = Statics.field51[var31.field837];
        if (var32 != null) {
            int var33 = (var31.field825 * 4 - var32.field1459) / 2;
            int var34 = (var31.field856 * 4 - var32.field1458) / 2;
            var32.method1765(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field856) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("fe.ai(IIII)Z")
    public static final boolean method3133(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field1268.method1888(Statics.field2386, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method606(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field825;
                var9 = var7.field856;
            } else {
                var8 = var7.field856;
                var9 = var7.field825;
            }
            int var10 = var7.field846;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method2893(Statics.field71.field458[0], Statics.field71.field447[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method2893(Statics.field71.field458[0], Statics.field71.field447[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field596 = class77.field1381;
        field579 = class77.field1373;
        field581 = 2;
        field560 = 0;
        return true;
    }

    @ObfuscatedName("ev.az(IIIIZIIIIIII)Z")
    public static final boolean method2893(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field534[var11][var12] = 0;
                field535[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field534[arg0][arg1] = 99;
        field535[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field536[var15] = arg0;
        int var36 = var15 + 1;
        field537[var15] = arg1;
        boolean var17 = false;
        int var18 = field536.length;
        int[][] var19 = field712[Statics.field2386].field2737;
        while (var36 != var16) {
            var13 = field536[var16];
            var14 = field537[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field712[Statics.field2386].method3210(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field712[Statics.field2386].method3223(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field712[Statics.field2386].method3211(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field535[var13][var14] + 1;
            if (var13 > 0 && field534[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field536[var36] = var13 - 1;
                field537[var36] = var14;
                var36 = (var36 + 1) % var18;
                field534[var13 - 1][var14] = 2;
                field535[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field534[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field536[var36] = var13 + 1;
                field537[var36] = var14;
                var36 = (var36 + 1) % var18;
                field534[var13 + 1][var14] = 8;
                field535[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field534[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field536[var36] = var13;
                field537[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field534[var13][var14 - 1] = 1;
                field535[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field534[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field536[var36] = var13;
                field537[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field534[var13][var14 + 1] = 4;
                field535[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field534[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field536[var36] = var13 - 1;
                field537[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field534[var13 - 1][var14 - 1] = 3;
                field535[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field534[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field536[var36] = var13 + 1;
                field537[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field534[var13 + 1][var14 - 1] = 9;
                field535[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field534[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field536[var36] = var13 - 1;
                field537[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field534[var13 - 1][var14 + 1] = 6;
                field535[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field534[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field536[var36] = var13 + 1;
                field537[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field534[var13 + 1][var14 + 1] = 12;
                field535[var13 + 1][var14 + 1] = var20;
            }
        }
        field612 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field535[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field535[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field535[var24][var25];
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
            field612 = 1;
        }
        byte var29 = 0;
        field536[var29] = var13;
        int var37 = var29 + 1;
        field537[var29] = var14;
        int var30;
        int var31 = var30 = field534[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field536[var37] = var13;
                field537[var37++] = var14;
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
            var31 = field534[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field536[var37];
            int var34 = field537[var37];
            if (arg10 == 0) {
                field692.method2319(127);
                field692.method2482(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field692.method2319(151);
                field692.method2482(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field692.method2319(36);
                field692.method2482(var32 + var32 + 3);
            }
            field692.method2540(class75.field1342[82] ? 1 : 0);
            field692.method2471(Statics.field977 + var34);
            field692.method2581(Statics.field54 + var33);
            field703 = field536[0];
            field704 = field537[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field692.method2482(field536[var37] - var33);
                field692.method2463(field537[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("m.bz(I)V")
    public static final void method224() {
        if (field540 == 240) {
            int var0 = field513.method2473();
            int var1 = field513.method2494();
            int var2 = field513.method2473();
            int var3 = field513.method2464();
            int var4 = (var3 >> 4 & 0x7) + Statics.field1437;
            int var5 = (var3 & 0x7) + Statics.field1275;
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && field597 != var2) {
                class17 var6 = new class17();
                var6.field261 = var0;
                var6.field252 = var1;
                if (field605[Statics.field2386][var4][var5] == null) {
                    field605[Statics.field2386][var4][var5] = new class177();
                }
                field605[Statics.field2386][var4][var5].method3328(var6);
                method167(var4, var5);
            }
        } else if (field540 == 160) {
            int var7 = field513.method2465();
            int var8 = (var7 >> 4 & 0x7) + Statics.field1437;
            int var9 = (var7 & 0x7) + Statics.field1275;
            int var10 = field513.method2473();
            int var11 = field513.method2466();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field532[var12];
            if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                if (var14 == 0) {
                    class96 var15 = Statics.field1268.method1880(Statics.field2386, var8, var9);
                    if (var15 != null) {
                        int var16 = var15.field1606 >> 14 & 0x7FFF;
                        if (var12 == 2) {
                            var15.field1605 = new class14(var16, 2, var13 + 4, Statics.field2386, var8, var9, var10, false, var15.field1605);
                            var15.field1600 = new class14(var16, 2, var13 + 1 & 0x3, Statics.field2386, var8, var9, var10, false, var15.field1600);
                        } else {
                            var15.field1605 = new class14(var16, var12, var13, Statics.field2386, var8, var9, var10, false, var15.field1605);
                        }
                    }
                }
                if (var14 == 1) {
                    class108 var17 = Statics.field1268.method1881(Statics.field2386, var8, var9);
                    if (var17 != null) {
                        int var18 = var17.field1786 >> 14 & 0x7FFF;
                        if (var12 == 4 || var12 == 5) {
                            var17.field1791 = new class14(var18, 4, var13, Statics.field2386, var8, var9, var10, false, var17.field1791);
                        } else if (var12 == 6) {
                            var17.field1791 = new class14(var18, 4, var13 + 4, Statics.field2386, var8, var9, var10, false, var17.field1791);
                        } else if (var12 == 7) {
                            var17.field1791 = new class14(var18, 4, (var13 + 2 & 0x3) + 4, Statics.field2386, var8, var9, var10, false, var17.field1791);
                        } else if (var12 == 8) {
                            var17.field1791 = new class14(var18, 4, var13 + 4, Statics.field2386, var8, var9, var10, false, var17.field1791);
                            var17.field1793 = new class14(var18, 4, (var13 + 2 & 0x3) + 4, Statics.field2386, var8, var9, var10, false, var17.field1793);
                        }
                    }
                }
                if (var14 == 2) {
                    class98 var19 = Statics.field1268.method1882(Statics.field2386, var8, var9);
                    if (var12 == 11) {
                        var12 = 10;
                    }
                    if (var19 != null) {
                        var19.field1637 = new class14(var19.field1630 >> 14 & 0x7FFF, var12, var13, Statics.field2386, var8, var9, var10, false, var19.field1637);
                    }
                }
                if (var14 == 3) {
                    class107 var20 = Statics.field1268.method2037(Statics.field2386, var8, var9);
                    if (var20 != null) {
                        var20.field1773 = new class14(var20.field1777 >> 14 & 0x7FFF, 22, var13, Statics.field2386, var8, var9, var10, false, var20.field1773);
                    }
                }
            }
        } else {
            if (field540 == 138) {
                int var21 = field513.method2441();
                int var22 = (var21 >> 4 & 0x7) + Statics.field1437;
                int var23 = (var21 & 0x7) + Statics.field1275;
                int var24 = field513.method2609();
                int var25 = field513.method2441();
                int var26 = var25 >> 4 & 0xF;
                int var27 = var25 & 0x7;
                int var28 = field513.method2441();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    int var29 = var26 + 1;
                    if (Statics.field71.field458[0] >= var22 - var29 && Statics.field71.field458[0] <= var22 + var29 && Statics.field71.field447[0] >= var23 - var29 && Statics.field71.field447[0] <= var23 + var29 && field710 != 0 && var27 > 0 && field680 < 50) {
                        field561[field680] = var24;
                        field713[field680] = var27;
                        field660[field680] = var28;
                        field676[field680] = null;
                        field715[field680] = (var22 << 16) + (var23 << 8) + var26;
                        field680++;
                    }
                }
            }
            if (field540 == 190) {
                int var30 = field513.method2441();
                int var31 = (var30 >> 4 & 0x7) + Statics.field1437;
                int var32 = (var30 & 0x7) + Statics.field1275;
                int var33 = var31 + field513.method2442();
                int var34 = var32 + field513.method2442();
                int var35 = field513.method2495();
                int var36 = field513.method2609();
                int var37 = field513.method2441() * 4;
                int var38 = field513.method2441() * 4;
                int var39 = field513.method2609();
                int var40 = field513.method2609();
                int var41 = field513.method2441();
                int var42 = field513.method2441();
                if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                    int var43 = var31 * 128 + 64;
                    int var44 = var32 * 128 + 64;
                    int var45 = var33 * 128 + 64;
                    int var46 = var34 * 128 + 64;
                    class10 var47 = new class10(var36, Statics.field2386, var43, var44, method264(var43, var44, Statics.field2386) - var37, field482 + var39, field482 + var40, var41, var42, var35, var38);
                    var47.method122(var45, var46, method264(var45, var46, Statics.field2386) - var38, field482 + var39);
                    field662.method3328(var47);
                }
            } else if (field540 == 77) {
                int var48 = field513.method2494();
                int var49 = field513.method2465();
                int var50 = (var49 >> 4 & 0x7) + Statics.field1437;
                int var51 = (var49 & 0x7) + Statics.field1275;
                int var52 = field513.method2473();
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    class17 var53 = new class17();
                    var53.field261 = var52;
                    var53.field252 = var48;
                    if (field605[Statics.field2386][var50][var51] == null) {
                        field605[Statics.field2386][var50][var51] = new class177();
                    }
                    field605[Statics.field2386][var50][var51].method3328(var53);
                    method167(var50, var51);
                }
            } else {
                if (field540 == 12) {
                    int var54 = field513.method2475();
                    byte var55 = field513.method2468();
                    byte var56 = field513.method2469();
                    byte var57 = field513.method2442();
                    int var58 = field513.method2465();
                    int var59 = (var58 >> 4 & 0x7) + Statics.field1437;
                    int var60 = (var58 & 0x7) + Statics.field1275;
                    int var61 = field513.method2494();
                    int var62 = field513.method2473();
                    byte var63 = field513.method2469();
                    int var64 = field513.method2465();
                    int var65 = var64 >> 2;
                    int var66 = var64 & 0x3;
                    int var67 = field532[var65];
                    int var68 = field513.method2609();
                    class3 var69;
                    if (field597 == var54) {
                        var69 = Statics.field71;
                    } else {
                        var69 = field693[var54];
                    }
                    if (var69 != null) {
                        class32 var70 = class32.method606(var61);
                        int var71;
                        int var72;
                        if (var66 == 1 || var66 == 3) {
                            var71 = var70.field856;
                            var72 = var70.field825;
                        } else {
                            var71 = var70.field825;
                            var72 = var70.field856;
                        }
                        int var73 = (var71 >> 1) + var59;
                        int var74 = (var71 + 1 >> 1) + var59;
                        int var75 = (var72 >> 1) + var60;
                        int var76 = (var72 + 1 >> 1) + var60;
                        int[][] var77 = class9.field141[Statics.field2386];
                        int var78 = var77[var73][var75] + var77[var74][var75] + var77[var73][var76] + var77[var74][var76] >> 2;
                        int var79 = (var59 << 7) + (var71 << 6);
                        int var80 = (var60 << 7) + (var72 << 6);
                        class112 var81 = var70.method666(var65, var66, var77, var79, var78, var80);
                        if (var81 != null) {
                            method216(Statics.field2386, var59, var60, var67, -1, 0, 0, var62 + 1, var68 + 1);
                            var69.field36 = field482 + var62;
                            var69.field33 = field482 + var68;
                            var69.field41 = var81;
                            var69.field42 = var59 * 128 + var71 * 64;
                            var69.field40 = var60 * 128 + var72 * 64;
                            var69.field37 = var78;
                            if (var55 > var56) {
                                byte var82 = var55;
                                var55 = var56;
                                var56 = var82;
                            }
                            if (var57 > var63) {
                                byte var83 = var57;
                                var57 = var63;
                                var63 = var83;
                            }
                            var69.field38 = var55 + var59;
                            var69.field44 = var56 + var59;
                            var69.field43 = var57 + var60;
                            var69.field45 = var60 + var63;
                        }
                    }
                }
                if (field540 == 252) {
                    int var84 = field513.method2441();
                    int var85 = (var84 >> 4 & 0x7) + Statics.field1437;
                    int var86 = (var84 & 0x7) + Statics.field1275;
                    int var87 = field513.method2609();
                    int var88 = field513.method2609();
                    int var89 = field513.method2609();
                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                        class177 var90 = field605[Statics.field2386][var85][var86];
                        if (var90 != null) {
                            for (class17 var91 = (class17) var90.method3326(); var91 != null; var91 = (class17) var90.method3347()) {
                                if ((var87 & 0x7FFF) == var91.field261 && var91.field252 == var88) {
                                    var91.field252 = var89;
                                    break;
                                }
                            }
                            method167(var85, var86);
                        }
                    }
                } else if (field540 == 175) {
                    int var92 = field513.method2441();
                    int var93 = (var92 >> 4 & 0x7) + Statics.field1437;
                    int var94 = (var92 & 0x7) + Statics.field1275;
                    int var95 = field513.method2609();
                    int var96 = field513.method2441();
                    int var97 = field513.method2609();
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        int var98 = var93 * 128 + 64;
                        int var99 = var94 * 128 + 64;
                        class20 var100 = new class20(var95, Statics.field2386, var98, var99, method264(var98, var99, Statics.field2386) - var96, var97, field482);
                        field554.method3328(var100);
                    }
                } else if (field540 == 154) {
                    int var101 = field513.method2464();
                    int var102 = (var101 >> 4 & 0x7) + Statics.field1437;
                    int var103 = (var101 & 0x7) + Statics.field1275;
                    int var104 = field513.method2464();
                    int var105 = var104 >> 2;
                    int var106 = var104 & 0x3;
                    int var107 = field532[var105];
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                        method216(Statics.field2386, var102, var103, var107, -1, var105, var106, 0, -1);
                    }
                } else if (field540 == 6) {
                    int var108 = field513.method2464();
                    int var109 = (var108 >> 4 & 0x7) + Statics.field1437;
                    int var110 = (var108 & 0x7) + Statics.field1275;
                    int var111 = field513.method2475();
                    int var112 = field513.method2441();
                    int var113 = var112 >> 2;
                    int var114 = var112 & 0x3;
                    int var115 = field532[var113];
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        method216(Statics.field2386, var109, var110, var115, var111, var113, var114, 0, -1);
                    }
                } else if (field540 == 20) {
                    int var116 = field513.method2473();
                    int var117 = field513.method2441();
                    int var118 = (var117 >> 4 & 0x7) + Statics.field1437;
                    int var119 = (var117 & 0x7) + Statics.field1275;
                    if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                        class177 var120 = field605[Statics.field2386][var118][var119];
                        if (var120 != null) {
                            for (class17 var121 = (class17) var120.method3326(); var121 != null; var121 = (class17) var120.method3347()) {
                                if ((var116 & 0x7FFF) == var121.field261) {
                                    var121.method3359();
                                    break;
                                }
                            }
                            if (var120.method3326() == null) {
                                field605[Statics.field2386][var118][var119] = null;
                            }
                            method167(var118, var119);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.by(IIIIIIIIII)V")
    public static final void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field502.method3326(); var10 != null; var10 = (class22) field502.method3347()) {
            if (var10.field337 == arg0 && var10.field349 == arg1 && var10.field338 == arg2 && var10.field336 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field337 = arg0;
            var9.field336 = arg3;
            var9.field349 = arg1;
            var9.field338 = arg2;
            method878(var9);
            field502.method3328(var9);
        }
        var9.field342 = arg4;
        var9.field344 = arg5;
        var9.field341 = arg6;
        var9.field345 = arg7;
        var9.field346 = arg8;
    }

    @ObfuscatedName("ag.bp(Lb;I)V")
    public static final void method878(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field336 == 0) {
            var1 = Statics.field1268.method1997(arg0.field337, arg0.field349, arg0.field338);
        }
        if (arg0.field336 == 1) {
            var1 = Statics.field1268.method1953(arg0.field337, arg0.field349, arg0.field338);
        }
        if (arg0.field336 == 2) {
            var1 = Statics.field1268.method1991(arg0.field337, arg0.field349, arg0.field338);
        }
        if (arg0.field336 == 3) {
            var1 = Statics.field1268.method2021(arg0.field337, arg0.field349, arg0.field338);
        }
        if (var1 != 0) {
            int var5 = Statics.field1268.method1888(arg0.field337, arg0.field349, arg0.field338, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field339 = var2;
        arg0.field343 = var3;
        arg0.field340 = var4;
    }

    @ObfuscatedName("al.bg(IIIIIIII)V")
    public static final void method860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field477 && Statics.field2386 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1268.method1997(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1268.method1953(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1268.method1991(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1268.method2021(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1268.method1888(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1268.method1961(arg0, arg2, arg3);
                class32 var15 = class32.method606(var12);
                if (var15.field854 != 0) {
                    field712[arg0].method3206(arg2, arg3, var13, var14, var15.field828);
                }
            }
            if (arg1 == 1) {
                Statics.field1268.method1999(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1268.method1857(arg0, arg2, arg3);
                class32 var16 = class32.method606(var12);
                if (var16.field825 + arg2 > 103 || var16.field825 + arg3 > 103 || var16.field856 + arg2 > 103 || var16.field856 + arg3 > 103) {
                    return;
                }
                if (var16.field854 != 0) {
                    field712[arg0].method3241(arg2, arg3, var16.field825, var16.field856, var14, var16.field828);
                }
            }
            if (arg1 == 3) {
                Statics.field1268.method1983(arg0, arg2, arg3);
                class32 var17 = class32.method606(var12);
                if (var17.field854 == 1) {
                    field712[arg0].method3209(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field115[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class95 var19 = Statics.field1268;
        class164 var20 = field712[arg0];
        class32 var21 = class32.method606(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field856;
            var23 = var21.field825;
        } else {
            var22 = var21.field825;
            var23 = var21.field856;
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
        int[][] var28 = class9.field141[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field829 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field851 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class94 var34;
            if (var21.field833 == -1 && var21.field857 == null) {
                var34 = var21.method666(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1864(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field854 == 1) {
                var20.method3230(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var57;
            if (var21.field833 == -1 && var21.field857 == null) {
                var57 = var21.method666(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            if (var57 != null) {
                var19.method1910(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field854 != 0) {
                var20.method3202(arg2, arg3, var22, var23, var21.field828);
            }
        } else if (arg6 >= 12) {
            class94 var35;
            if (var21.field833 == -1 && var21.field857 == null) {
                var35 = var21.method666(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1910(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field854 != 0) {
                var20.method3202(arg2, arg3, var22, var23, var21.field828);
            }
        } else if (arg6 == 0) {
            class94 var36;
            if (var21.field833 == -1 && var21.field857 == null) {
                var36 = var21.method666(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1866(arg0, arg2, arg3, var29, var36, (class94) null, class9.field136[arg5], 0, var32, var33);
            if (var21.field854 != 0) {
                var20.method3201(arg2, arg3, arg6, arg5, var21.field828);
            }
        } else if (arg6 == 1) {
            class94 var37;
            if (var21.field833 == -1 && var21.field857 == null) {
                var37 = var21.method666(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1866(arg0, arg2, arg3, var29, var37, (class94) null, class9.field127[arg5], 0, var32, var33);
            if (var21.field854 != 0) {
                var20.method3201(arg2, arg3, arg6, arg5, var21.field828);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class94 var39;
            class94 var40;
            if (var21.field833 == -1 && var21.field857 == null) {
                var39 = var21.method666(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method666(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1866(arg0, arg2, arg3, var29, var39, var40, class9.field136[arg5], class9.field136[var38], var32, var33);
            if (var21.field854 != 0) {
                var20.method3201(arg2, arg3, arg6, arg5, var21.field828);
            }
        } else if (arg6 == 3) {
            class94 var41;
            if (var21.field833 == -1 && var21.field857 == null) {
                var41 = var21.method666(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1866(arg0, arg2, arg3, var29, var41, (class94) null, class9.field127[arg5], 0, var32, var33);
            if (var21.field854 != 0) {
                var20.method3201(arg2, arg3, arg6, arg5, var21.field828);
            }
        } else if (arg6 == 9) {
            class94 var42;
            if (var21.field833 == -1 && var21.field857 == null) {
                var42 = var21.method666(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1910(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field854 != 0) {
                var20.method3202(arg2, arg3, var22, var23, var21.field828);
            }
        } else if (arg6 == 4) {
            class94 var43;
            if (var21.field833 == -1 && var21.field857 == null) {
                var43 = var21.method666(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1867(arg0, arg2, arg3, var29, var43, (class94) null, class9.field136[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1997(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class32.method606(var45 >> 14 & 0x7FFF).field848;
            }
            class94 var46;
            if (var21.field833 == -1 && var21.field857 == null) {
                var46 = var21.method666(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1867(arg0, arg2, arg3, var29, var46, (class94) null, class9.field136[arg5], 0, class9.field128[arg5] * var44, class9.field129[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1997(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class32.method606(var48 >> 14 & 0x7FFF).field848 / 2;
            }
            class94 var49;
            if (var21.field833 == -1 && var21.field857 == null) {
                var49 = var21.method666(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1867(arg0, arg2, arg3, var29, var49, (class94) null, 256, arg5, class9.field122[arg5] * var47, class9.field131[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class94 var51;
            if (var21.field833 == -1 && var21.field857 == null) {
                var51 = var21.method666(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1867(arg0, arg2, arg3, var29, var51, (class94) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1997(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class32.method606(var53 >> 14 & 0x7FFF).field848 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class94 var55;
            class94 var56;
            if (var21.field833 == -1 && var21.field857 == null) {
                var55 = var21.method666(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method666(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1867(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field122[arg5] * var52, class9.field131[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("a.bk(IIB)V")
    public static final void method167(int arg0, int arg1) {
        class177 var2 = field605[Statics.field2386][arg0][arg1];
        if (var2 == null) {
            Statics.field1268.method1879(Statics.field2386, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3326(); var5 != null; var5 = (class17) var2.method3347()) {
            class40 var6 = class40.method789(var5.field261);
            int var7 = var6.field998;
            if (var6.field1000 == 1) {
                var7 = (var5.field252 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field1268.method1879(Statics.field2386, arg0, arg1);
            return;
        }
        var2.method3333(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3326(); var10 != null; var10 = (class17) var2.method3347()) {
            if (var4.field261 != var10.field261) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field261 != var10.field261 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1268.method1954(Statics.field2386, arg0, arg1, method264(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2386), var4, var11, var8, var9);
    }

    @ObfuscatedName("bj.be(I)V")
    public static final void method1531() {
        field513.method2321();
        int var0 = field513.method2322(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field513.method2322(2);
        if (var1 == 0) {
            field529[++field706 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field513.method2322(3);
            Statics.field71.method266(var2, false);
            int var3 = field513.method2322(1);
            if (var3 == 1) {
                field529[++field706 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field513.method2322(3);
            Statics.field71.method266(var4, true);
            int var5 = field513.method2322(3);
            Statics.field71.method266(var5, true);
            int var6 = field513.method2322(1);
            if (var6 == 1) {
                field529[++field706 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field513.method2322(7);
            Statics.field2386 = field513.method2322(2);
            int var8 = field513.method2322(7);
            int var9 = field513.method2322(1);
            if (var9 == 1) {
                field529[++field706 - 1] = 2047;
            }
            int var10 = field513.method2322(1);
            Statics.field71.method253(var7, var8, var10 == 1);
        }
    }

    @ObfuscatedName("t.bc(B)V")
    public static final void method84() {
        int var0 = field513.method2322(8);
        if (var0 < field592) {
            for (int var1 = var0; var1 < field592; var1++) {
                field600[++field599 - 1] = field593[var1];
            }
        }
        if (var0 > field592) {
            throw new RuntimeException("");
        }
        field592 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field593[var2];
            class3 var4 = field693[var3];
            int var5 = field513.method2322(1);
            if (var5 == 0) {
                field593[++field592 - 1] = var3;
                var4.field437 = field482;
            } else {
                int var6 = field513.method2322(2);
                if (var6 == 0) {
                    field593[++field592 - 1] = var3;
                    var4.field437 = field482;
                    field529[++field706 - 1] = var3;
                } else if (var6 == 1) {
                    field593[++field592 - 1] = var3;
                    var4.field437 = field482;
                    int var7 = field513.method2322(3);
                    var4.method266(var7, false);
                    int var8 = field513.method2322(1);
                    if (var8 == 1) {
                        field529[++field706 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field593[++field592 - 1] = var3;
                    var4.field437 = field482;
                    int var9 = field513.method2322(3);
                    var4.method266(var9, true);
                    int var10 = field513.method2322(3);
                    var4.method266(var10, true);
                    int var11 = field513.method2322(1);
                    if (var11 == 1) {
                        field529[++field706 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field600[++field599 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("i.bd(I)V")
    public static final void method133() {
        field599 = 0;
        field706 = 0;
        method1571();
        while (field513.method2324(field514) >= 27) {
            int var0 = field513.method2322(15);
            if (var0 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field631[var0] == null) {
                field631[var0] = new class25();
                var16 = true;
            }
            class25 var17 = field631[var0];
            field510[++field509 - 1] = var0;
            var17.field437 = field482;
            var17.field383 = class31.method148(field513.method2322(14));
            int var18 = field513.method2322(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field513.method2322(1);
            if (var19 == 1) {
                field529[++field706 - 1] = var0;
            }
            int var20 = field513.method2322(5);
            if (var20 > 15) {
                var20 -= 32;
            }
            int var21 = field733[field513.method2322(3)];
            if (var16) {
                var17.field454 = var17.field408 = var21;
            }
            int var22 = field513.method2322(1);
            var17.field436 = var17.field383.field773;
            var17.field456 = var17.field383.field801;
            if (var17.field456 == 0) {
                var17.field408 = 0;
            }
            var17.field414 = var17.field383.field803;
            var17.field418 = var17.field383.field796;
            var17.field416 = var17.field383.field767;
            var17.field417 = var17.field383.field782;
            var17.field452 = var17.field383.field776;
            var17.field412 = var17.field383.field802;
            var17.field413 = var17.field383.field778;
            var17.method253(Statics.field71.field458[0] + var20, Statics.field71.field447[0] + var18, var22 == 1);
        }
        field513.method2323();
        for (int var1 = 0; var1 < field706; var1++) {
            int var2 = field529[var1];
            class25 var3 = field631[var2];
            int var4 = field513.method2441();
            if ((var4 & 0x80) != 0) {
                int var5 = field513.method2441();
                int var6 = field513.method2466();
                var3.method257(var5, var6, field482);
                var3.field426 = field482 + 300;
                var3.field427 = field513.method2465();
                var3.field428 = field513.method2465();
            }
            if ((var4 & 0x20) != 0) {
                var3.field430 = field513.method2609();
                var3.field431 = field513.method2473();
            }
            if ((var4 & 0x10) != 0) {
                var3.field455 = field513.method2475();
                int var7 = field513.method2620();
                var3.field444 = var7 >> 16;
                var3.field443 = (var7 & 0xFFFF) + field482;
                var3.field441 = 0;
                var3.field460 = 0;
                if (var3.field443 > field482) {
                    var3.field441 = -1;
                }
                if (var3.field455 == 65535) {
                    var3.field455 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field419 = field513.method2449();
                var3.field446 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field420 = field513.method2473();
                if (var3.field420 == 65535) {
                    var3.field420 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var8 = field513.method2475();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field513.method2465();
                if (var3.field435 == var8 && var8 != -1) {
                    int var10 = class34.method2349(var8).field889;
                    if (var10 == 1) {
                        var3.field421 = 0;
                        var3.field449 = 0;
                        var3.field438 = var9;
                        var3.field439 = 0;
                    }
                    if (var10 == 2) {
                        var3.field439 = 0;
                    }
                } else if (var8 == -1 || var3.field435 == -1 || class34.method2349(var8).field883 >= class34.method2349(var3.field435).field883) {
                    var3.field435 = var8;
                    var3.field421 = 0;
                    var3.field449 = 0;
                    var3.field438 = var9;
                    var3.field439 = 0;
                    var3.field462 = var3.field457;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var11 = field513.method2464();
                int var12 = field513.method2466();
                var3.method257(var11, var12, field482);
                var3.field426 = field482 + 300;
                var3.field427 = field513.method2465();
                var3.field428 = field513.method2465();
            }
            if ((var4 & 0x8) != 0) {
                var3.field383 = class31.method148(field513.method2494());
                var3.field436 = var3.field383.field773;
                var3.field456 = var3.field383.field801;
                var3.field414 = var3.field383.field803;
                var3.field418 = var3.field383.field796;
                var3.field416 = var3.field383.field767;
                var3.field417 = var3.field383.field782;
                var3.field452 = var3.field383.field776;
                var3.field412 = var3.field383.field802;
                var3.field413 = var3.field383.field778;
            }
        }
        for (int var13 = 0; var13 < field599; var13++) {
            int var14 = field600[var13];
            if (field482 != field631[var14].field437) {
                field631[var14].field383 = null;
                field631[var14] = null;
            }
        }
        if (field514 != field513.field2022) {
            throw new RuntimeException(field513.field2022 + class2.field25 + field514);
        }
        for (int var15 = 0; var15 < field509; var15++) {
            if (field631[field510[var15]] == null) {
                throw new RuntimeException(var15 + class2.field25 + field509);
            }
        }
    }

    @ObfuscatedName("cn.bf(I)V")
    public static final void method1571() {
        field513.method2321();
        int var0 = field513.method2322(8);
        if (var0 < field509) {
            for (int var1 = var0; var1 < field509; var1++) {
                field600[++field599 - 1] = field510[var1];
            }
        }
        if (var0 > field509) {
            throw new RuntimeException("");
        }
        field509 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field510[var2];
            class25 var4 = field631[var3];
            int var5 = field513.method2322(1);
            if (var5 == 0) {
                field510[++field509 - 1] = var3;
                var4.field437 = field482;
            } else {
                int var6 = field513.method2322(2);
                if (var6 == 0) {
                    field510[++field509 - 1] = var3;
                    var4.field437 = field482;
                    field529[++field706 - 1] = var3;
                } else if (var6 == 1) {
                    field510[++field509 - 1] = var3;
                    var4.field437 = field482;
                    int var7 = field513.method2322(3);
                    var4.method266(var7, false);
                    int var8 = field513.method2322(1);
                    if (var8 == 1) {
                        field529[++field706 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field510[++field509 - 1] = var3;
                    var4.field437 = field482;
                    int var9 = field513.method2322(3);
                    var4.method266(var9, true);
                    int var10 = field513.method2322(3);
                    var4.method266(var10, true);
                    int var11 = field513.method2322(1);
                    if (var11 == 1) {
                        field529[++field706 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field600[++field599 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dp.bx(IIIII)V")
    public static final void method2666(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field515; var4++) {
            if (field679[var4] + field677[var4] > arg0 && field677[var4] < arg0 + arg2 && field580[var4] + field508[var4] > arg1 && field508[var4] < arg1 + arg3) {
                field674[var4] = true;
            }
        }
    }

    @ObfuscatedName("o.bh(I)V")
    public static final void method139() {
        int var0 = Statics.field2821.method3394(class134.field2215);
        for (int var1 = 0; var1 < field614; var1++) {
            int var2 = Statics.field2821.method3394(method187(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field614 * 15 + 21;
        int var4 = class77.field1381 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1373;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field613 = true;
        Statics.field376 = var4;
        Statics.field770 = var5;
        Statics.field1768 = var0;
        Statics.field931 = field614 * 15 + 22;
    }

    @ObfuscatedName("dl.bu(IB)Z")
    public static final boolean method2315(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field478[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("e.bi(II)V")
    public static final void method43(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field615[arg0];
        int var2 = field616[arg0];
        int var3 = field478[arg0];
        int var4 = field618[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 5) {
            method3133(var1, var2, var4);
            field692.method2319(247);
            field692.method2428(Statics.field54 + var1);
            field692.method2472(var4 >> 14 & 0x7FFF);
            field692.method2581(Statics.field977 + var2);
        }
        if (var3 == 35) {
            field692.method2319(221);
            field692.method2471(var4);
            field692.method2480(var2);
            field692.method2472(var1);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 48) {
            class3 var5 = field693[var4];
            if (var5 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var5.field458[0], var5.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(186);
                field692.method2428(var4);
            }
        }
        if (var3 == 16) {
            boolean var6 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var6) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(177);
            field692.method2581(Statics.field394);
            field692.method2430(Statics.field372);
            field692.method2428(Statics.field54 + var1);
            field692.method2472(var4);
            field692.method2472(Statics.field977 + var2);
            field692.method2472(Statics.field57);
        }
        if (var3 == 1003) {
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            class25 var8 = field631[var4];
            if (var8 != null) {
                class31 var9 = var8.field383;
                if (var9.field797 != null) {
                    var9 = var9.method608();
                }
                if (var9 != null) {
                    field692.method2319(230);
                    field692.method2581(var9.field771);
                }
            }
        }
        if (var3 == 19) {
            boolean var10 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var10) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(235);
            field692.method2428(var4);
            field692.method2472(Statics.field977 + var2);
            field692.method2581(Statics.field54 + var1);
        }
        if (var3 == 42) {
            field692.method2319(76);
            field692.method2480(var2);
            field692.method2471(var4);
            field692.method2472(var1);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 23) {
            Statics.field1268.method2014(Statics.field2386, var1, var2);
        }
        if (var3 == 2 && method3133(var1, var2, var4)) {
            field692.method2319(143);
            field692.method2581(field628);
            field692.method2471(Statics.field54 + var1);
            field692.method2581(Statics.field977 + var2);
            field692.method2479(Statics.field955);
            field692.method2581(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1005) {
            class158 var12 = class158.method3(var2);
            if (var12 == null || var12.field2677[var1] < 100000) {
                field692.method2319(80);
                field692.method2471(var4);
            } else {
                method2379(0, "", var12.field2677[var1] + " x " + class40.method789(var4).field986);
            }
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 33) {
            field692.method2319(139);
            field692.method2430(var2);
            field692.method2428(var4);
            field692.method2471(var1);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 1 && method3133(var1, var2, var4)) {
            field692.method2319(214);
            field692.method2428(Statics.field54 + var1);
            field692.method2581(Statics.field57);
            field692.method2472(Statics.field394);
            field692.method2480(Statics.field372);
            field692.method2471(Statics.field977 + var2);
            field692.method2428(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 40) {
            field692.method2319(81);
            field692.method2481(var2);
            field692.method2428(var1);
            field692.method2428(var4);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 1002) {
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(45);
            field692.method2581(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 45) {
            class3 var13 = field693[var4];
            if (var13 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var13.field458[0], var13.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(5);
                field692.method2471(var4);
            }
        }
        if (var3 == 10) {
            class25 var14 = field631[var4];
            if (var14 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var14.field458[0], var14.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(95);
                field692.method2471(var4);
            }
        }
        if (var3 == 25) {
            class158 var15 = class158.method1(var2, var1);
            if (var15 != null) {
                method159();
                method2822(var2, var1, class162.method2210(method1588(var15)));
                field625 = 0;
                String var16;
                if (class162.method2210(method1588(var15)) == 0) {
                    var16 = null;
                } else if (var15.field2640 == null || var15.field2640.trim().length() == 0) {
                    var16 = null;
                } else {
                    var16 = var15.field2640;
                }
                field629 = var16;
                if (field629 == null) {
                    field629 = "Null";
                }
                if (var15.field2573) {
                    field630 = var15.field2638 + class2.method1661(16777215);
                } else {
                    field630 = class2.method1661(65280) + var15.field2674 + class2.method1661(16777215);
                }
            }
            return;
        }
        if (var3 == 21) {
            boolean var17 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var17) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(157);
            field692.method2428(Statics.field54 + var1);
            field692.method2471(Statics.field977 + var2);
            field692.method2471(var4);
        }
        if (var3 == 13) {
            class25 var19 = field631[var4];
            if (var19 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var19.field458[0], var19.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(194);
                field692.method2428(var4);
            }
        }
        if (var3 == 4) {
            method3133(var1, var2, var4);
            field692.method2319(82);
            field692.method2428(Statics.field54 + var1);
            field692.method2471(Statics.field977 + var2);
            field692.method2428(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 49) {
            class3 var20 = field693[var4];
            if (var20 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var20.field458[0], var20.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(239);
                field692.method2471(var4);
            }
        }
        if (var3 == 6) {
            method3133(var1, var2, var4);
            field692.method2319(119);
            field692.method2581(Statics.field977 + var2);
            field692.method2581(var4 >> 14 & 0x7FFF);
            field692.method2581(Statics.field54 + var1);
        }
        if (var3 == 39) {
            field692.method2319(11);
            field692.method2472(var4);
            field692.method2471(var1);
            field692.method2481(var2);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 1001) {
            method3133(var1, var2, var4);
            field692.method2319(140);
            field692.method2428(var4 >> 14 & 0x7FFF);
            field692.method2428(Statics.field977 + var2);
            field692.method2581(Statics.field54 + var1);
        }
        if (var3 == 34) {
            field692.method2319(166);
            field692.method2430(var2);
            field692.method2581(var1);
            field692.method2472(var4);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 30 && field557 == null) {
            field692.method2319(46);
            field692.method2472(var1);
            field692.method2479(var2);
            field557 = class158.method1(var2, var1);
            method1586(field557);
        }
        if (var3 == 47) {
            class3 var21 = field693[var4];
            if (var21 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var21.field458[0], var21.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(134);
                field692.method2471(var4);
            }
        }
        if (var3 == 8) {
            class25 var22 = field631[var4];
            if (var22 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var22.field458[0], var22.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(102);
                field692.method2581(field628);
                field692.method2428(var4);
                field692.method2480(Statics.field955);
            }
        }
        if (var3 == 15) {
            class3 var23 = field693[var4];
            if (var23 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var23.field458[0], var23.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(192);
                field692.method2428(var4);
                field692.method2480(Statics.field955);
                field692.method2471(field628);
            }
        }
        if (var3 == 26) {
            method1474();
        }
        if (var3 == 1004) {
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(80);
            field692.method2471(var4);
        }
        if (var3 == 51) {
            class3 var24 = field693[var4];
            if (var24 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var24.field458[0], var24.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(38);
                field692.method2471(var4);
            }
        }
        if (var3 == 17) {
            boolean var25 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var25) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(79);
            field692.method2581(Statics.field54 + var1);
            field692.method2428(Statics.field977 + var2);
            field692.method2428(var4);
            field692.method2471(field628);
            field692.method2479(Statics.field955);
        }
        if (var3 == 9) {
            class25 var27 = field631[var4];
            if (var27 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var27.field458[0], var27.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(204);
                field692.method2428(var4);
            }
        }
        if (var3 == 7) {
            class25 var28 = field631[var4];
            if (var28 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var28.field458[0], var28.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(187);
                field692.method2428(var4);
                field692.method2428(Statics.field57);
                field692.method2430(Statics.field372);
                field692.method2472(Statics.field394);
            }
        }
        if (var3 == 46) {
            class3 var29 = field693[var4];
            if (var29 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var29.field458[0], var29.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(23);
                field692.method2581(var4);
            }
        }
        if (var3 == 20) {
            boolean var30 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var30) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(77);
            field692.method2471(Statics.field54 + var1);
            field692.method2471(Statics.field977 + var2);
            field692.method2472(var4);
        }
        if (var3 == 3) {
            method3133(var1, var2, var4);
            field692.method2319(164);
            field692.method2472(Statics.field54 + var1);
            field692.method2581(var4 >> 14 & 0x7FFF);
            field692.method2471(Statics.field977 + var2);
        }
        if (var3 == 44) {
            class3 var32 = field693[var4];
            if (var32 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var32.field458[0], var32.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(251);
                field692.method2428(var4);
            }
        }
        if (var3 == 36) {
            field692.method2319(48);
            field692.method2430(var2);
            field692.method2472(var4);
            field692.method2428(var1);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 32) {
            field692.method2319(85);
            field692.method2471(var1);
            field692.method2479(Statics.field955);
            field692.method2428(field628);
            field692.method2480(var2);
            field692.method2472(var4);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 11) {
            class25 var33 = field631[var4];
            if (var33 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var33.field458[0], var33.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(220);
                field692.method2581(var4);
            }
        }
        if (var3 == 31) {
            field692.method2319(183);
            field692.method2472(var4);
            field692.method2481(Statics.field372);
            field692.method2471(var1);
            field692.method2581(Statics.field57);
            field692.method2581(Statics.field394);
            field692.method2481(var2);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 14) {
            class3 var34 = field693[var4];
            if (var34 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var34.field458[0], var34.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(114);
                field692.method2480(Statics.field372);
                field692.method2581(Statics.field394);
                field692.method2428(Statics.field57);
                field692.method2428(var4);
            }
        }
        if (var3 == 29) {
            field692.method2319(42);
            field692.method2430(var2);
            class158 var35 = class158.method3(var2);
            if (var35.field2644 != null && var35.field2644[0][0] == 5) {
                int var36 = var35.field2644[0][1];
                if (class159.field2693[var36] != var35.field2672[0]) {
                    class159.field2693[var36] = var35.field2672[0];
                    method166(var36);
                }
            }
        }
        if (var3 == 58) {
            field692.method2319(249);
            field692.method2428(var1);
            field692.method2481(var2);
            field692.method2581(field628);
            field692.method2481(Statics.field955);
        }
        if (var3 == 43) {
            field692.method2319(2);
            field692.method2480(var2);
            field692.method2471(var4);
            field692.method2428(var1);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 12) {
            class25 var37 = field631[var4];
            if (var37 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var37.field458[0], var37.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(53);
                field692.method2471(var4);
            }
        }
        if (var3 == 22) {
            boolean var38 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var38) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(212);
            field692.method2581(Statics.field54 + var1);
            field692.method2581(var4);
            field692.method2472(Statics.field977 + var2);
        }
        if (var3 == 38) {
            method159();
            class158 var40 = class158.method3(var2);
            field625 = 1;
            Statics.field394 = var1;
            Statics.field372 = var2;
            Statics.field57 = var4;
            method1586(var40);
            field626 = class2.method1661(16748608) + class40.method789(var4).field986 + class2.method1661(16777215);
            if (field626 == null) {
                field626 = "null";
            }
            return;
        }
        if (var3 == 28) {
            field692.method2319(42);
            field692.method2430(var2);
            class158 var41 = class158.method3(var2);
            if (var41.field2644 != null && var41.field2644[0][0] == 5) {
                int var42 = var41.field2644[0][1];
                class159.field2693[var42] = 1 - class159.field2693[var42];
                method166(var42);
            }
        }
        if (var3 == 41) {
            field692.method2319(89);
            field692.method2471(var4);
            field692.method2471(var1);
            field692.method2481(var2);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (var3 == 50) {
            class3 var43 = field693[var4];
            if (var43 != null) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var43.field458[0], var43.field447[0], false, 0, 0, 1, 1, 0, 2);
                field596 = class77.field1381;
                field579 = class77.field1373;
                field581 = 2;
                field560 = 0;
                field692.method2319(9);
                field692.method2471(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            String var44 = field620[arg0];
            class158 var45 = class158.method1(var2, var1);
            if (var45 != null) {
                if (var45.field2661 != null) {
                    class1 var46 = new class1();
                    var46.field5 = var45;
                    var46.field1 = var4;
                    var46.field7 = var44;
                    var46.field4 = var45.field2661;
                    class26.method2(var46);
                }
                boolean var47 = true;
                if (var45.field2578 > 0) {
                    var47 = method246(var45);
                }
                if (var47 && class162.method1317(method1588(var45), var4 - 1)) {
                    if (var4 == 1) {
                        field692.method2319(100);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 2) {
                        field692.method2319(185);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 3) {
                        field692.method2319(125);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 4) {
                        field692.method2319(154);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 5) {
                        field692.method2319(226);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 6) {
                        field692.method2319(7);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 7) {
                        field692.method2319(43);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 8) {
                        field692.method2319(234);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 9) {
                        field692.method2319(112);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                    if (var4 == 10) {
                        field692.method2319(24);
                        field692.method2430(var2);
                        field692.method2428(var1);
                    }
                }
            }
        }
        if (var3 == 24) {
            class158 var48 = class158.method3(var2);
            boolean var49 = true;
            if (var48.field2578 > 0) {
                var49 = method246(var48);
            }
            if (var49) {
                field692.method2319(42);
                field692.method2430(var2);
            }
        }
        if (var3 == 18) {
            boolean var50 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var50) {
                method2893(Statics.field71.field458[0], Statics.field71.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field596 = class77.field1381;
            field579 = class77.field1373;
            field581 = 2;
            field560 = 0;
            field692.method2319(168);
            field692.method2581(Statics.field977 + var2);
            field692.method2472(Statics.field54 + var1);
            field692.method2428(var4);
        }
        if (var3 == 37) {
            field692.method2319(96);
            field692.method2480(var2);
            field692.method2471(var4);
            field692.method2428(var1);
            field582 = 0;
            Statics.field2520 = class158.method3(var2);
            field583 = var1;
        }
        if (field625 != 0) {
            field625 = 0;
            method1586(class158.method3(Statics.field372));
        }
        if (field627) {
            method159();
        }
        if (Statics.field2520 != null && field582 == 0) {
            method1586(Statics.field2520);
        }
    }

    @ObfuscatedName("eg.bq(IIII)V")
    public static void method2822(int arg0, int arg1, int arg2) {
        class158 var3 = class158.method1(arg0, arg1);
        if (var3 != null && var3.field2632 != null) {
            class1 var4 = new class1();
            var4.field5 = var3;
            var4.field4 = var3.field2632;
            class26.method2(var4);
        }
        field627 = true;
        Statics.field955 = arg0;
        field628 = arg1;
        Statics.field2070 = arg2;
        method1586(var3);
    }

    @ObfuscatedName("q.bs(I)V")
    public static void method159() {
        if (!field627) {
            return;
        }
        class158 var0 = class158.method1(Statics.field955, field628);
        if (var0 != null && var0.field2596 != null) {
            class1 var1 = new class1();
            var1.field5 = var0;
            var1.field4 = var0.field2596;
            class26.method2(var1);
        }
        field627 = false;
        method1586(var0);
    }

    @ObfuscatedName("e.ba(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method41(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field613 || field614 >= 500) {
            return;
        }
        field663[field614] = arg0;
        field620[field614] = arg1;
        field478[field614] = arg2;
        field618[field614] = arg3;
        field615[field614] = arg4;
        field616[field614] = arg5;
        field614++;
    }

    @ObfuscatedName("g.bt(II)Ljava/lang/String;")
    public static String method187(int arg0) {
        return field620[arg0].length() > 0 ? field663[arg0] + class134.field2222 + field620[arg0] : field663[arg0];
    }

    @ObfuscatedName("i.bo(Lae;IIII)V")
    public static final void method123(class31 arg0, int arg1, int arg2, int arg3) {
        if (field614 >= 400) {
            return;
        }
        if (arg0.field797 != null) {
            arg0 = arg0.method608();
        }
        if (arg0 == null || !arg0.field800) {
            return;
        }
        String var4 = arg0.field786;
        if (arg0.field789 != 0) {
            int var6 = arg0.field789;
            int var7 = Statics.field71.field46;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1661(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1661(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1661(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1661(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1661(65280);
            } else if (var8 > 6) {
                var9 = class2.method1661(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1661(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1661(12648192);
            } else {
                var9 = class2.method1661(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class134.field2218 + arg0.field789 + class2.field23;
        }
        if (field625 == 1) {
            method41(class134.field2212, field626 + " " + class2.field22 + " " + class2.method1661(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field627) {
            String[] var10 = arg0.field807;
            if (field641) {
                var10 = method547(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class134.field2214)) {
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
                        method41(var10[var11], class2.method1661(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class134.field2214)) {
                        short var14 = 0;
                        if (arg0.field789 > Statics.field71.field46) {
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
                        method41(var10[var13], class2.method1661(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method41(class134.field2256, class2.method1661(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2070 & 0x2) == 2) {
            method41(field629, field630 + " " + class2.field22 + " " + class2.method1661(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("de.bv(Lv;IIIB)V")
    public static final void method2343(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field71 == arg0 || field614 >= 400) {
            return;
        }
        String var9;
        if (arg0.field34 == 0) {
            String var4 = arg0.field39;
            int var5 = arg0.field46;
            int var6 = Statics.field71.field46;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1661(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1661(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1661(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1661(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1661(65280);
            } else if (var7 > 6) {
                var8 = class2.method1661(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1661(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1661(12648192);
            } else {
                var8 = class2.method1661(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class134.field2218 + arg0.field46 + class2.field23;
        } else {
            var9 = arg0.field39 + " " + class2.field20 + class134.field2219 + arg0.field34 + class2.field23;
        }
        if (field625 == 1) {
            method41(class134.field2212, field626 + " " + class2.field22 + " " + class2.method1661(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field627) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field681[var10] != null) {
                    short var11 = 0;
                    if (field681[var10].equalsIgnoreCase(class134.field2214)) {
                        if (arg0.field46 > Statics.field71.field46) {
                            var11 = 2000;
                        }
                        if (Statics.field71.field47 != 0 && arg0.field47 != 0) {
                            if (Statics.field71.field47 == arg0.field47) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field603[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field684[var10] + var11;
                    method41(field681[var10], class2.method1661(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2070 & 0x8) == 8) {
            method41(field629, field630 + " " + class2.field22 + " " + class2.method1661(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field614; var14++) {
            if (field478[var14] == 23) {
                field620[var14] = class2.method1661(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("av.bw(IIIIIIIII)V")
    public static final void method677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method2675(arg0)) {
            Statics.field382 = null;
            method46(Statics.field2627[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field382 != null) {
                method46(Statics.field382, -1412584499, arg1, arg2, arg3, arg4, Statics.field1983, Statics.field1027, arg7);
                Statics.field382 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field674[var8] = true;
            }
        } else {
            field674[arg7] = true;
        }
    }

    @ObfuscatedName("d.bn([Lfe;IIIIIIIII)V")
    public static final void method46(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1781(arg2, arg3, arg4, arg5);
        class104.method2161();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2585 == arg1 || arg1 == -1412584499 && field642 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field677[field515] = var10.field2690 + arg6;
                    field508[field515] = var10.field2580 + arg7;
                    field679[field515] = var10.field2583;
                    field580[field515] = var10.field2584;
                    var11 = ++field515 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2689 = var11;
                var10.field2617 = field482;
                if (!var10.field2573 || !method14(var10)) {
                    if (var10.field2578 > 0) {
                        int var12 = var10.field2578;
                        if (var12 == 324) {
                            if (field730 == -1) {
                                field730 = var10.field2598;
                                field531 = var10.field2652;
                            }
                            if (field729.field2716) {
                                var10.field2598 = field730;
                            } else {
                                var10.field2598 = field531;
                            }
                        } else if (var12 == 325) {
                            if (field730 == -1) {
                                field730 = var10.field2598;
                                field531 = var10.field2652;
                            }
                            if (field729.field2716) {
                                var10.field2598 = field531;
                            } else {
                                var10.field2598 = field730;
                            }
                        } else if (var12 == 327) {
                            var10.field2614 = 150;
                            var10.field2615 = (int) (Math.sin((double) field482 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2687 = 5;
                            var10.field2607 = 0;
                        } else if (var12 == 328) {
                            var10.field2614 = 150;
                            var10.field2615 = (int) (Math.sin((double) field482 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2687 = 5;
                            var10.field2607 = 1;
                        }
                    }
                    int var13 = var10.field2690 + arg6;
                    int var14 = var10.field2580 + arg7;
                    int var15 = var10.field2568;
                    if (field642 == var10) {
                        if (arg1 != -1412584499 && !var10.field2623) {
                            Statics.field382 = arg0;
                            Statics.field1983 = arg6;
                            Statics.field1027 = arg7;
                            continue;
                        }
                        if (field594 && field542) {
                            int var16 = class77.field1382;
                            int var17 = class77.field1375;
                            int var18 = var16 - field544;
                            int var19 = var17 - field551;
                            if (var18 < field648) {
                                var18 = field648;
                            }
                            if (var10.field2583 + var18 > field648 + field643.field2583) {
                                var18 = field648 + field643.field2583 - var10.field2583;
                            }
                            if (var19 < field649) {
                                var19 = field649;
                            }
                            if (var10.field2584 + var19 > field649 + field643.field2584) {
                                var19 = field649 + field643.field2584 - var10.field2584;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2623) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2586 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2586 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2583 + var13;
                        int var27 = var10.field2584 + var14;
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
                        int var30 = var10.field2583 + var13;
                        int var31 = var10.field2584 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2573 || var20 < var22 && var21 < var23) {
                        if (var10.field2578 != 0) {
                            if (var10.field2578 == 1337) {
                                field621 = var13;
                                field683 = var14;
                                method2042(var13, var14, var10.field2583, var10.field2584);
                                class89.method1781(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2578 == 1338) {
                                method1847();
                                class89.method1781(var13, var14, Statics.field805.field1459 + var13, Statics.field805.field1458 + var14);
                                if (field705 == 2 || field705 == 5) {
                                    class89.method1809(var13 + 25, var14 + 5, 0, Statics.field81, Statics.field68);
                                } else {
                                    int var32 = field558 + field545 & 0x7FF;
                                    int var33 = Statics.field71.field410 / 32 + 48;
                                    int var34 = 464 - Statics.field71.field407 / 32;
                                    Statics.field469.method1692(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field547 + 256, Statics.field81, Statics.field68);
                                    for (int var35 = 0; var35 < field699; var35++) {
                                        int var36 = field569[var35] * 4 + 2 - Statics.field71.field410 / 32;
                                        int var37 = field701[var35] * 4 + 2 - Statics.field71.field407 / 32;
                                        method249(var13, var14, var36, var37, field702[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class177 var40 = field605[Statics.field2386][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field71.field410 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field71.field407 / 32;
                                                method249(var13, var14, var41, var42, Statics.field12[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field509; var43++) {
                                        class25 var44 = field631[field510[var43]];
                                        if (var44 != null && var44.method17()) {
                                            class31 var45 = var44.field383;
                                            if (var45 != null && var45.field797 != null) {
                                                var45 = var45.method608();
                                            }
                                            if (var45 != null && var45.field788 && var45.field800) {
                                                int var46 = var44.field410 / 32 - Statics.field71.field410 / 32;
                                                int var47 = var44.field407 / 32 - Statics.field71.field407 / 32;
                                                method249(var13, var14, var46, var47, Statics.field12[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field592; var48++) {
                                        class3 var49 = field693[field593[var48]];
                                        if (var49 != null && var49.method17()) {
                                            int var50 = var49.field410 / 32 - Statics.field71.field410 / 32;
                                            int var51 = var49.field407 / 32 - Statics.field71.field407 / 32;
                                            boolean var52 = false;
                                            if (Statics.method237(var49.field39)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            if (Statics.field71.field47 != 0 && var49.field47 != 0 && Statics.field71.field47 == var49.field47) {
                                                var53 = true;
                                            }
                                            if (var52) {
                                                method249(var13, var14, var50, var51, Statics.field12[3]);
                                            } else if (var53) {
                                                method249(var13, var14, var50, var51, Statics.field12[4]);
                                            } else {
                                                method249(var13, var14, var50, var51, Statics.field12[2]);
                                            }
                                        }
                                    }
                                    if (field520 != 0 && field482 % 20 < 10) {
                                        if (field520 == 1 && field491 >= 0 && field491 < field631.length) {
                                            class25 var54 = field631[field491];
                                            if (var54 != null) {
                                                int var55 = var54.field410 / 32 - Statics.field71.field410 / 32;
                                                int var56 = var54.field407 / 32 - Statics.field71.field407 / 32;
                                                method888(var13, var14, var55, var56, Statics.field17[1]);
                                            }
                                        }
                                        if (field520 == 2) {
                                            int var57 = field493 * 4 - Statics.field54 * 4 + 2 - Statics.field71.field410 / 32;
                                            int var58 = field678 * 4 - Statics.field977 * 4 + 2 - Statics.field71.field407 / 32;
                                            method888(var13, var14, var57, var58, Statics.field17[1]);
                                        }
                                        if (field520 == 10 && field492 >= 0 && field492 < field693.length) {
                                            class3 var59 = field693[field492];
                                            if (var59 != null) {
                                                int var60 = var59.field410 / 32 - Statics.field71.field410 / 32;
                                                int var61 = var59.field407 / 32 - Statics.field71.field407 / 32;
                                                method888(var13, var14, var60, var61, Statics.field17[1]);
                                            }
                                        }
                                    }
                                    if (field703 != 0) {
                                        int var62 = field703 * 4 + 2 - Statics.field71.field410 / 32;
                                        int var63 = field704 * 4 + 2 - Statics.field71.field407 / 32;
                                        method249(var13, var14, var62, var63, Statics.field17[0]);
                                    }
                                    class89.method1787(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field705 < 3) {
                                    Statics.field401.method1692(var13, var14, 33, 33, 25, 25, field558, 256, Statics.field249, Statics.field374);
                                } else {
                                    class89.method1809(var13, var14, 0, Statics.field249, Statics.field374);
                                }
                                if (field602[var11]) {
                                    Statics.field805.method1765(var13, var14);
                                }
                                field675[var11] = true;
                                class89.method1781(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var64 = class77.field1382;
                        int var65 = class77.field1375;
                        if (!field613 && var64 >= var20 && var65 >= var21 && var64 < var22 && var65 < var23) {
                            method61(var10, var64 - var13, var65 - var14);
                        }
                        if (var10.field2586 == 0) {
                            if (!var10.field2573 && method14(var10) && Statics.field901 != var10) {
                                continue;
                            }
                            if (!var10.field2573) {
                                if (var10.field2588 > var10.field2650 - var10.field2584) {
                                    var10.field2588 = var10.field2650 - var10.field2584;
                                }
                                if (var10.field2588 < 0) {
                                    var10.field2588 = 0;
                                }
                            }
                            method46(arg0, var10.field2574, var20, var21, var22, var23, var13 - var10.field2587, var14 - var10.field2588, var11);
                            if (var10.field2642 != null) {
                                method46(var10.field2642, var10.field2574, var20, var21, var22, var23, var13 - var10.field2587, var14 - var10.field2588, var11);
                            }
                            class4 var66 = (class4) field632.method3302((long) var10.field2574);
                            if (var66 != null) {
                                if (var66.field49 == 0 && class77.field1382 >= var20 && class77.field1375 >= var21 && class77.field1382 < var22 && class77.field1375 < var23 && !field613 && !field640) {
                                    field663[0] = class134.field2285;
                                    field620[0] = "";
                                    field478[0] = 1006;
                                    field614 = 1;
                                }
                                method677(var66.field53, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class89.method1781(arg2, arg3, arg4, arg5);
                            class104.method2161();
                        }
                        if (field602[var11] || field479 > 1) {
                            if (var10.field2586 == 0 && !var10.field2573 && var10.field2650 > var10.field2584) {
                                method147(var10.field2583 + var13, var14, var10.field2588, var10.field2584, var10.field2650);
                            }
                            if (var10.field2586 != 1) {
                                if (var10.field2586 == 2) {
                                    int var67 = 0;
                                    for (int var68 = 0; var68 < var10.field2584; var68++) {
                                        for (int var69 = 0; var69 < var10.field2583; var69++) {
                                            int var70 = (var10.field2563 + 32) * var69 + var13;
                                            int var71 = (var10.field2601 + 32) * var68 + var14;
                                            if (var67 < 20) {
                                                var70 += var10.field2649[var67];
                                                var71 += var10.field2630[var67];
                                            }
                                            if (var10.field2676[var67] > 0) {
                                                boolean var72 = false;
                                                boolean var73 = false;
                                                int var74 = var10.field2676[var67] - 1;
                                                if (var70 + 32 > arg2 && var70 < arg4 && var71 + 32 > arg3 && var71 < arg5 || Statics.field167 == var10 && field651 == var67) {
                                                    class86 var75;
                                                    if (field625 == 1 && Statics.field394 == var67 && Statics.field372 == var10.field2574) {
                                                        var75 = class40.method2942(var74, var10.field2677[var67], 2, 0, false);
                                                    } else {
                                                        var75 = class40.method2942(var74, var10.field2677[var67], 1, 3153952, false);
                                                    }
                                                    if (var75 == null) {
                                                        method1586(var10);
                                                    } else if (Statics.field167 == var10 && field651 == var67) {
                                                        int var76 = class77.field1382 - field585;
                                                        int var77 = class77.field1375 - field591;
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (var77 < 5 && var77 > -5) {
                                                            var77 = 0;
                                                        }
                                                        if (field589 < 5) {
                                                            var76 = 0;
                                                            var77 = 0;
                                                        }
                                                        var75.method1674(var70 + var76, var71 + var77, 128);
                                                        if (arg1 != -1) {
                                                            class158 var78 = arg0[arg1 & 0xFFFF];
                                                            if (var71 + var77 < class89.field1469 && var78.field2588 > 0) {
                                                                int var79 = field550 * (class89.field1469 - var71 - var77) / 3;
                                                                if (var79 > field550 * 10) {
                                                                    var79 = field550 * 10;
                                                                }
                                                                if (var79 > var78.field2588) {
                                                                    var79 = var78.field2588;
                                                                }
                                                                var78.field2588 -= var79;
                                                                field591 += var79;
                                                                method1586(var78);
                                                            }
                                                            if (var71 + var77 + 32 > class89.field1466 && var78.field2588 < var78.field2650 - var78.field2584) {
                                                                int var80 = field550 * (var71 + var77 + 32 - class89.field1466) / 3;
                                                                if (var80 > field550 * 10) {
                                                                    var80 = field550 * 10;
                                                                }
                                                                if (var80 > var78.field2650 - var78.field2584 - var78.field2588) {
                                                                    var80 = var78.field2650 - var78.field2584 - var78.field2588;
                                                                }
                                                                var78.field2588 += var80;
                                                                field591 -= var80;
                                                                method1586(var78);
                                                            }
                                                        }
                                                    } else if (Statics.field2520 == var10 && field583 == var67) {
                                                        var75.method1674(var70, var71, 128);
                                                    } else {
                                                        var75.method1684(var70, var71);
                                                    }
                                                }
                                            } else if (var10.field2581 != null && var67 < 20) {
                                                class86 var81 = var10.method3091(var67);
                                                if (var81 != null) {
                                                    var81.method1684(var70, var71);
                                                } else if (class158.field2579) {
                                                    method1586(var10);
                                                }
                                            }
                                            var67++;
                                        }
                                    }
                                } else if (var10.field2586 == 3) {
                                    int var82;
                                    if (method157(var10)) {
                                        var82 = var10.field2592;
                                        if (Statics.field901 == var10 && var10.field2594 != 0) {
                                            var82 = var10.field2594;
                                        }
                                    } else {
                                        var82 = var10.field2659;
                                        if (Statics.field901 == var10 && var10.field2646 != 0) {
                                            var82 = var10.field2646;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2595) {
                                            class89.method1787(var13, var14, var10.field2583, var10.field2584, var82);
                                        } else {
                                            class89.method1831(var13, var14, var10.field2583, var10.field2584, var82);
                                        }
                                    } else if (var10.field2595) {
                                        class89.method1786(var13, var14, var10.field2583, var10.field2584, var82, 256 - (var15 & 0xFF));
                                    } else {
                                        class89.method1823(var13, var14, var10.field2583, var10.field2584, var82, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2586 == 4) {
                                    class183 var83 = var10.method3090();
                                    if (var83 != null) {
                                        String var84 = var10.field2621;
                                        int var85;
                                        if (method157(var10)) {
                                            var85 = var10.field2592;
                                            if (Statics.field901 == var10 && var10.field2594 != 0) {
                                                var85 = var10.field2594;
                                            }
                                            if (var10.field2622.length() > 0) {
                                                var84 = var10.field2622;
                                            }
                                        } else {
                                            var85 = var10.field2659;
                                            if (Statics.field901 == var10 && var10.field2646 != 0) {
                                                var85 = var10.field2646;
                                            }
                                        }
                                        if (var10.field2573 && var10.field2678 != -1) {
                                            class40 var86 = class40.method789(var10.field2678);
                                            var84 = var86.field986;
                                            if (var84 == null) {
                                                var84 = "null";
                                            }
                                            if ((var86.field1000 == 1 || var10.field2679 != 1) && var10.field2679 != -1) {
                                                var84 = class2.method1661(16748608) + var84 + class2.field24 + " " + 'x' + method1625(var10.field2679);
                                            }
                                        }
                                        if (field557 == var10) {
                                            class134 var10000 = (class134) null;
                                            var84 = class134.field2220;
                                            var85 = var10.field2659;
                                        }
                                        if (!var10.field2573) {
                                            var84 = method2670(var84, var10);
                                        }
                                        var83.method3401(var84, var13, var14, var10.field2583, var10.field2584, var85, var10.field2631 ? 0 : -1, var10.field2624, var10.field2625, var10.field2629);
                                    } else if (class158.field2579) {
                                        method1586(var10);
                                    }
                                } else if (var10.field2586 == 5) {
                                    if (var10.field2573) {
                                        class86 var88;
                                        if (var10.field2678 == -1) {
                                            var88 = var10.method3089(false);
                                        } else {
                                            var88 = class40.method2942(var10.field2678, var10.field2679, var10.field2602, var10.field2604, false);
                                        }
                                        if (var88 != null) {
                                            int var89 = var88.field1450;
                                            int var90 = var88.field1451;
                                            if (var10.field2605) {
                                                class89.method1782(var13, var14, var10.field2583 + var13, var10.field2584 + var14);
                                                int var91 = (var10.field2583 + (var89 - 1)) / var89;
                                                int var92 = (var10.field2584 + (var90 - 1)) / var90;
                                                for (int var93 = 0; var93 < var91; var93++) {
                                                    for (int var94 = 0; var94 < var92; var94++) {
                                                        if (var10.field2564 != 0) {
                                                            var88.method1733(var89 / 2 + var89 * var93 + var13, var90 / 2 + var90 * var94 + var14, var10.field2564, 4096);
                                                        } else if (var15 == 0) {
                                                            var88.method1684(var89 * var93 + var13, var90 * var94 + var14);
                                                        } else {
                                                            var88.method1674(var89 * var93 + var13, var90 * var94 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1781(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var95 = var10.field2583 * 4096 / var89;
                                                if (var10.field2564 != 0) {
                                                    var88.method1733(var10.field2583 / 2 + var13, var10.field2584 / 2 + var14, var10.field2564, var95);
                                                } else if (var15 != 0) {
                                                    var88.method1672(var13, var14, var10.field2583, var10.field2584, 256 - (var15 & 0xFF));
                                                } else if (var10.field2583 == var89 && var10.field2584 == var90) {
                                                    var88.method1684(var13, var14);
                                                } else {
                                                    var88.method1695(var13, var14, var10.field2583, var10.field2584);
                                                }
                                            }
                                        } else if (class158.field2579) {
                                            method1586(var10);
                                        }
                                    } else {
                                        class86 var87 = var10.method3089(method157(var10));
                                        if (var87 != null) {
                                            var87.method1684(var13, var14);
                                        } else if (class158.field2579) {
                                            method1586(var10);
                                        }
                                    }
                                } else if (var10.field2586 == 6) {
                                    boolean var96 = method157(var10);
                                    int var97;
                                    if (var96) {
                                        var97 = var10.field2611;
                                    } else {
                                        var97 = var10.field2610;
                                    }
                                    class112 var98 = null;
                                    int var99 = 0;
                                    if (var10.field2678 != -1) {
                                        class40 var100 = class40.method789(var10.field2678);
                                        if (var100 != null) {
                                            class40 var101 = var100.method820(var10.field2679);
                                            var98 = var101.method819(1);
                                            if (var98 == null) {
                                                method1586(var10);
                                            } else {
                                                var98.method2307();
                                                var99 = var98.field1533 / 2;
                                            }
                                        }
                                    } else if (var10.field2687 == 5) {
                                        if (var10.field2607 == 0) {
                                            var98 = field729.method3175((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var98 = Statics.field71.method18();
                                        }
                                    } else if (var97 == -1) {
                                        var98 = var10.method3092((class34) null, -1, var96, Statics.field71.field30);
                                        if (var98 == null && class158.field2579) {
                                            method1586(var10);
                                        }
                                    } else {
                                        class34 var102 = class34.method2349(var97);
                                        var98 = var10.method3092(var102, var10.field2680, var96, Statics.field71.field30);
                                        if (var98 == null && class158.field2579) {
                                            method1586(var10);
                                        }
                                    }
                                    class104.method2136(var10.field2583 / 2 + var13, var10.field2584 / 2 + var14);
                                    int var103 = var10.field2656 * class104.field1749[var10.field2614] >> 16;
                                    int var104 = var10.field2656 * class104.field1754[var10.field2614] >> 16;
                                    if (var98 != null) {
                                        if (var10.field2573) {
                                            var98.method2307();
                                            if (var10.field2619) {
                                                var98.method2258(0, var10.field2615, var10.field2589, var10.field2614, var10.field2612, var10.field2613 + var99 + var103, var10.field2613 + var104, var10.field2656);
                                            } else {
                                                var98.method2305(0, var10.field2615, var10.field2589, var10.field2614, var10.field2612, var10.field2613 + var99 + var103, var10.field2613 + var104);
                                            }
                                        } else {
                                            var98.method2305(0, var10.field2615, 0, var10.field2614, 0, var103, var104);
                                        }
                                    }
                                    class104.method2148();
                                } else {
                                    if (var10.field2586 == 7) {
                                        class183 var105 = var10.method3090();
                                        if (var105 == null) {
                                            if (class158.field2579) {
                                                method1586(var10);
                                            }
                                            continue;
                                        }
                                        int var106 = 0;
                                        for (int var107 = 0; var107 < var10.field2584; var107++) {
                                            for (int var108 = 0; var108 < var10.field2583; var108++) {
                                                if (var10.field2676[var106] > 0) {
                                                    class40 var109 = class40.method789(var10.field2676[var106] - 1);
                                                    String var110;
                                                    if (var109.field1000 != 1 && var10.field2677[var106] == 1) {
                                                        var110 = class2.method1661(16748608) + var109.field986 + class2.field24;
                                                    } else {
                                                        var110 = class2.method1661(16748608) + var109.field986 + class2.field24 + " " + 'x' + method1625(var10.field2677[var106]);
                                                    }
                                                    int var111 = (var10.field2563 + 115) * var108 + var13;
                                                    int var112 = (var10.field2601 + 12) * var107 + var14;
                                                    if (var10.field2624 == 0) {
                                                        var105.method3409(var110, var111, var112, var10.field2659, var10.field2631 ? 0 : -1);
                                                    } else if (var10.field2624 == 1) {
                                                        var105.method3411(var110, var10.field2583 / 2 + var111, var112, var10.field2659, var10.field2631 ? 0 : -1);
                                                    } else {
                                                        var105.method3400(var110, var10.field2583 + var111 - 1, var112, var10.field2659, var10.field2631 ? 0 : -1);
                                                    }
                                                }
                                                var106++;
                                            }
                                        }
                                    }
                                    if (var10.field2586 == 8 && Statics.field1200 == var10 && field736 == field623) {
                                        int var113 = 0;
                                        int var114 = 0;
                                        class183 var115 = Statics.field1905;
                                        String var116 = var10.field2621;
                                        String var117 = method2670(var116, var10);
                                        while (var117.length() > 0) {
                                            int var118 = var117.indexOf(class2.field21);
                                            String var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = "";
                                            } else {
                                                var119 = var117.substring(0, var118);
                                                var117 = var117.substring(var118 + 4);
                                            }
                                            int var120 = var115.method3394(var119);
                                            if (var120 > var113) {
                                                var113 = var120;
                                            }
                                            var114 += var115.field2843 + 1;
                                        }
                                        var113 += 6;
                                        var114 += 7;
                                        int var121 = var10.field2583 + var13 - 5 - var113;
                                        int var122 = var10.field2584 + var14 + 5;
                                        if (var121 < var13 + 5) {
                                            var121 = var13 + 5;
                                        }
                                        if (var113 + var121 > arg4) {
                                            var121 = arg4 - var113;
                                        }
                                        if (var114 + var122 > arg5) {
                                            var122 = arg5 - var114;
                                        }
                                        class89.method1787(var121, var122, var113, var114, 16777120);
                                        class89.method1831(var121, var122, var113, var114, 0);
                                        String var123 = var10.field2621;
                                        int var124 = var115.field2843 + var122 + 2;
                                        String var125 = method2670(var123, var10);
                                        while (var125.length() > 0) {
                                            int var126 = var125.indexOf(class2.field21);
                                            String var127;
                                            if (var126 == -1) {
                                                var127 = var125;
                                                var125 = "";
                                            } else {
                                                var127 = var125.substring(0, var126);
                                                var125 = var125.substring(var126 + 4);
                                            }
                                            var115.method3409(var127, var121 + 3, var124, 0, -1);
                                            var124 += var115.field2843 + 1;
                                        }
                                    }
                                    if (var10.field2586 == 9) {
                                        if (var10.field2597 == 1) {
                                            class89.method1794(var13, var14, var10.field2583 + var13, var10.field2584 + var14, var10.field2659);
                                        } else {
                                            int var128 = var10.field2583 >= 0 ? var10.field2583 : -var10.field2583;
                                            int var129 = var10.field2584 >= 0 ? var10.field2584 : -var10.field2584;
                                            int var130 = var128;
                                            if (var128 < var129) {
                                                var130 = var129;
                                            }
                                            if (var130 != 0) {
                                                int var131 = (var10.field2583 << 16) / var130;
                                                int var132 = (var10.field2584 << 16) / var130;
                                                if (var132 <= var131) {
                                                    var131 = -var131;
                                                } else {
                                                    var132 = -var132;
                                                }
                                                int var133 = var10.field2597 * var132 >> 17;
                                                int var134 = var10.field2597 * var132 + 1 >> 17;
                                                int var135 = var10.field2597 * var131 >> 17;
                                                int var136 = var10.field2597 * var131 + 1 >> 17;
                                                int var137 = var13 + var133;
                                                int var138 = var13 - var134;
                                                int var139 = var10.field2583 + var13 - var134;
                                                int var140 = var10.field2583 + var13 + var133;
                                                int var141 = var14 + var135;
                                                int var142 = var14 - var136;
                                                int var143 = var10.field2584 + var14 - var136;
                                                int var144 = var10.field2584 + var14 + var135;
                                                class104.method2141(var137, var138, var139);
                                                class104.method2134(var141, var142, var143, var137, var138, var139, var10.field2659);
                                                class104.method2141(var137, var139, var140);
                                                class104.method2134(var141, var143, var144, var137, var139, var140, var10.field2659);
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

    @ObfuscatedName("ek.bj(Ljava/lang/String;Lfe;B)Ljava/lang/String;")
    public static String method2670(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1409(Statics.method731(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1401 != null) {
                    int var6 = Statics.field1401.field1393;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1401.field1391 != null) {
                        var5 = (String) Statics.field1401.field1391;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ca.bm(II)Ljava/lang/String;")
    public static final String method1625(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field25 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1661(65408) + var1.substring(0, var1.length() - 8) + class134.field2223 + " " + class2.field20 + var1 + class2.field23 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method1661(16777215) + var1.substring(0, var1.length() - 4) + class134.field2075 + " " + class2.field20 + var1 + class2.field23 + class2.field24;
        } else {
            return " " + class2.method1661(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("r.br(Lfe;IIIIIIS)V")
    public static final void method11(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field555) {
            field556 = 32;
        } else {
            field556 = 0;
        }
        field555 = false;
        if (class77.field1369 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2588 -= 4;
                method1586(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2588 += 4;
                method1586(arg0);
            } else if (arg5 >= arg1 - field556 && arg5 < field556 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2588 = (arg4 - arg3) * var8 / var9;
                method1586(arg0);
                field555 = true;
            }
        }
        if (field711 == 0) {
            return;
        }
        int var10 = arg0.field2583;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2588 += field711 * 45;
            method1586(arg0);
        }
    }

    @ObfuscatedName("f.cw(IIIIII)V")
    public static final void method147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field877[0].method1765(arg0, arg1);
        Statics.field877[1].method1765(arg0, arg1 + arg3 - 16);
        class89.method1787(arg0, arg1 + 16, 16, arg3 - 32, field504);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1787(arg0, arg1 + 16 + var6, 16, var5, field552);
        class89.method1793(arg0, arg1 + 16 + var6, var5, field619);
        class89.method1793(arg0 + 1, arg1 + 16 + var6, var5, field619);
        class89.method1795(arg0, arg1 + 16 + var6, 16, field619);
        class89.method1795(arg0, arg1 + 17 + var6, 16, field619);
        class89.method1793(arg0 + 15, arg1 + 16 + var6, var5, field553);
        class89.method1793(arg0 + 14, arg1 + 17 + var6, var5 - 1, field553);
        class89.method1795(arg0, arg1 + 15 + var6 + var5, 16, field553);
        class89.method1795(arg0 + 1, arg1 + 14 + var6 + var5, 15, field553);
    }

    @ObfuscatedName("bt.cf(II)Ljava/lang/String;")
    public static final String method1409(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("q.cc(Lfe;B)Z")
    public static final boolean method157(class158 arg0) {
        if (arg0.field2671 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2671.length; var1++) {
            int var2 = Statics.method731(arg0, var1);
            int var3 = arg0.field2672[var1];
            if (arg0.field2671[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2671[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2671[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("y.ca(Lfe;III)V")
    public static final void method61(class158 arg0, int arg1, int arg2) {
        if (arg0.field2577 == 1) {
            method41(arg0.field2675, "", 24, 0, 0, arg0.field2574);
        }
        if (arg0.field2577 == 2 && !field627) {
            String var3;
            if (class162.method2210(method1588(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2640 == null || arg0.field2640.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2640;
            }
            if (var3 != null) {
                method41(var3, class2.method1661(65280) + arg0.field2674, 25, 0, -1, arg0.field2574);
            }
        }
        if (arg0.field2577 == 3) {
            method41(class134.field2237, "", 26, 0, 0, arg0.field2574);
        }
        if (arg0.field2577 == 4) {
            method41(arg0.field2675, "", 28, 0, 0, arg0.field2574);
        }
        if (arg0.field2577 == 5) {
            method41(arg0.field2675, "", 29, 0, 0, arg0.field2574);
        }
        if (arg0.field2577 == 6 && field557 == null) {
            method41(arg0.field2675, "", 30, 0, -1, arg0.field2574);
        }
        if (arg0.field2586 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2584; var6++) {
                for (int var7 = 0; var7 < arg0.field2583; var7++) {
                    int var8 = (arg0.field2563 + 32) * var7;
                    int var9 = (arg0.field2601 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2649[var5];
                        var9 += arg0.field2630[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field587 = var5;
                        Statics.field1979 = arg0;
                        if (arg0.field2676[var5] > 0) {
                            class40 var10 = class40.method789(arg0.field2676[var5] - 1);
                            if (field625 != 1 || !class162.method155(method1588(arg0))) {
                                label364: {
                                    if (field627) {
                                        int var11 = method1588(arg0);
                                        boolean var12 = (var11 >> 30 & 0x1) != 0;
                                        if (var12) {
                                            if ((Statics.field2070 & 0x10) == 16) {
                                                method41(field629, field630 + " " + class2.field22 + " " + class2.method1661(16748608) + var10.field986, 32, var10.field984, var5, arg0.field2574);
                                            }
                                            break label364;
                                        }
                                    }
                                    String[] var13 = var10.field1014;
                                    if (field641) {
                                        var13 = method547(var13);
                                    }
                                    if (class162.method155(method1588(arg0))) {
                                        for (int var14 = 4; var14 >= 3; var14--) {
                                            if (var13 != null && var13[var14] != null) {
                                                byte var15;
                                                if (var14 == 3) {
                                                    var15 = 36;
                                                } else {
                                                    var15 = 37;
                                                }
                                                method41(var13[var14], class2.method1661(16748608) + var10.field986, var15, var10.field984, var5, arg0.field2574);
                                            } else if (var14 == 4) {
                                                method41(class134.field2149, class2.method1661(16748608) + var10.field986, 37, var10.field984, var5, arg0.field2574);
                                            }
                                        }
                                    }
                                    if (class162.method556(method1588(arg0))) {
                                        method41(class134.field2212, class2.method1661(16748608) + var10.field986, 38, var10.field984, var5, arg0.field2574);
                                    }
                                    int var16 = method1588(arg0);
                                    boolean var17 = (var16 >> 30 & 0x1) != 0;
                                    if (var17 && var13 != null) {
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
                                                method41(var13[var18], class2.method1661(16748608) + var10.field986, var19, var10.field984, var5, arg0.field2574);
                                            }
                                        }
                                    }
                                    String[] var20 = arg0.field2591;
                                    if (field641) {
                                        var20 = method547(var20);
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
                                                method41(var20[var21], class2.method1661(16748608) + var10.field986, var22, var10.field984, var5, arg0.field2574);
                                            }
                                        }
                                    }
                                    method41(class134.field2256, class2.method1661(16748608) + var10.field986, 1005, var10.field984, var5, arg0.field2574);
                                }
                            } else if (Statics.field372 != arg0.field2574 || Statics.field394 != var5) {
                                method41(class134.field2212, field626 + " " + class2.field22 + " " + class2.method1661(16748608) + var10.field986, 31, var10.field984, var5, arg0.field2574);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2573) {
            return;
        }
        if (field627) {
            int var23 = method1588(arg0);
            boolean var24 = (var23 >> 21 & 0x1) != 0;
            if (var24 && (Statics.field2070 & 0x20) == 32) {
                method41(field629, field630 + " " + class2.field22 + " " + arg0.field2638, 58, 0, arg0.field2575, arg0.field2574);
            }
            return;
        }
        for (int var25 = 9; var25 >= 5; var25--) {
            String var26;
            if (!class162.method1317(method1588(arg0), var25) && arg0.field2661 == null) {
                var26 = null;
            } else if (arg0.field2635 == null || arg0.field2635.length <= var25 || arg0.field2635[var25] == null || arg0.field2635[var25].trim().length() == 0) {
                var26 = null;
            } else {
                var26 = arg0.field2635[var25];
            }
            if (var26 != null) {
                method41(var26, arg0.field2638, 1007, var25 + 1, arg0.field2575, arg0.field2574);
            }
        }
        String var28;
        if (class162.method2210(method1588(arg0)) == 0) {
            var28 = null;
        } else if (arg0.field2640 == null || arg0.field2640.trim().length() == 0) {
            var28 = null;
        } else {
            var28 = arg0.field2640;
        }
        if (var28 != null) {
            method41(var28, arg0.field2638, 25, 0, arg0.field2575, arg0.field2574);
        }
        for (int var30 = 4; var30 >= 0; var30--) {
            String var31;
            if (!class162.method1317(method1588(arg0), var30) && arg0.field2661 == null) {
                var31 = null;
            } else if (arg0.field2635 == null || arg0.field2635.length <= var30 || arg0.field2635[var30] == null || arg0.field2635[var30].trim().length() == 0) {
                var31 = null;
            } else {
                var31 = arg0.field2635[var30];
            }
            if (var31 != null) {
                method41(var31, arg0.field2638, 57, var30 + 1, arg0.field2575, arg0.field2574);
            }
        }
        int var33 = method1588(arg0);
        boolean var34 = (var33 & 0x1) != 0;
        if (var34) {
            method41(class134.field2077, "", 30, 0, arg0.field2575, arg0.field2574);
        }
    }

    @ObfuscatedName("ap.cb(IIIIIIIB)V")
    public static final void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class158.method2675(arg0)) {
            method2040(Statics.field2627[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cr.cg([Lfe;IIIIIIIB)V")
    public static final void method2040(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2573 || var9.field2586 == 0 || var9.field2639 || method1588(var9) != 0 || field643 == var9) && var9.field2585 == arg1 && (!var9.field2573 || !method14(var9))) {
                int var10 = var9.field2690 + arg6;
                int var11 = var9.field2580 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2586 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2586 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2583 + var10;
                    int var19 = var9.field2584 + var11;
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
                    int var22 = var9.field2583 + var10;
                    int var23 = var9.field2584 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field642 == var9) {
                    field650 = true;
                    field645 = var10;
                    field647 = var11;
                }
                if (!var9.field2573 || var12 < var14 && var13 < var15) {
                    if (var9.field2578 == 1337) {
                        method1586(var9);
                    } else if (var9.field2578 != 1338) {
                        if (var9.field2586 == 0) {
                            if (!var9.field2573 && method14(var9) && Statics.field901 != var9) {
                                continue;
                            }
                            method2040(arg0, var9.field2574, var12, var13, var14, var15, var10 - var9.field2587, var11 - var9.field2588);
                            if (var9.field2642 != null) {
                                method2040(var9.field2642, var9.field2574, var12, var13, var14, var15, var10 - var9.field2587, var11 - var9.field2588);
                            }
                            class4 var36 = (class4) field632.method3302((long) var9.field2574);
                            if (var36 != null) {
                                method549(var36.field53, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2573) {
                            boolean var37;
                            if (class77.field1382 >= var12 && class77.field1375 >= var13 && class77.field1382 < var14 && class77.field1375 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if (class77.field1369 == 1 && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if (class77.field1374 == 1 && class77.field1381 >= var12 && class77.field1373 >= var13 && class77.field1381 < var14 && class77.field1373 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method7(var9, class77.field1381 - var10, class77.field1373 - var11);
                            }
                            if (field642 != null && field642 != var9 && var37 && class162.method552(method1588(var9))) {
                                field517 = var9;
                            }
                            if (field643 == var9) {
                                field542 = true;
                                field648 = var10;
                                field649 = var11;
                            }
                            if (var9.field2639) {
                                if (var37 && field711 != 0 && var9.field2662 != null) {
                                    class1 var40 = new class1();
                                    var40.field5 = var9;
                                    var40.field2 = field711;
                                    var40.field4 = var9.field2662;
                                    field668.method3328(var40);
                                }
                                if (field642 != null || Statics.field167 != null || field613) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2590 && var39) {
                                    var9.field2590 = true;
                                    if (var9.field2643 != null) {
                                        class1 var41 = new class1();
                                        var41.field5 = var9;
                                        var41.field3 = class77.field1381 - var10;
                                        var41.field2 = class77.field1373 - var11;
                                        var41.field4 = var9.field2643;
                                        field668.method3328(var41);
                                    }
                                }
                                if (var9.field2590 && var38 && var9.field2641 != null) {
                                    class1 var42 = new class1();
                                    var42.field5 = var9;
                                    var42.field3 = class77.field1382 - var10;
                                    var42.field2 = class77.field1375 - var11;
                                    var42.field4 = var9.field2641;
                                    field668.method3328(var42);
                                }
                                if (var9.field2590 && !var38) {
                                    var9.field2590 = false;
                                    if (var9.field2645 != null) {
                                        class1 var43 = new class1();
                                        var43.field5 = var9;
                                        var43.field3 = class77.field1382 - var10;
                                        var43.field2 = class77.field1375 - var11;
                                        var43.field4 = var9.field2645;
                                        field670.method3328(var43);
                                    }
                                }
                                if (var38 && var9.field2618 != null) {
                                    class1 var44 = new class1();
                                    var44.field5 = var9;
                                    var44.field3 = class77.field1382 - var10;
                                    var44.field2 = class77.field1375 - var11;
                                    var44.field4 = var9.field2618;
                                    field668.method3328(var44);
                                }
                                if (!var9.field2683 && var37) {
                                    var9.field2683 = true;
                                    if (var9.field2647 != null) {
                                        class1 var45 = new class1();
                                        var45.field5 = var9;
                                        var45.field3 = class77.field1382 - var10;
                                        var45.field2 = class77.field1375 - var11;
                                        var45.field4 = var9.field2647;
                                        field668.method3328(var45);
                                    }
                                }
                                if (var9.field2683 && var37 && var9.field2648 != null) {
                                    class1 var46 = new class1();
                                    var46.field5 = var9;
                                    var46.field3 = class77.field1382 - var10;
                                    var46.field2 = class77.field1375 - var11;
                                    var46.field4 = var9.field2648;
                                    field668.method3328(var46);
                                }
                                if (var9.field2683 && !var37) {
                                    var9.field2683 = false;
                                    if (var9.field2571 != null) {
                                        class1 var47 = new class1();
                                        var47.field5 = var9;
                                        var47.field3 = class77.field1382 - var10;
                                        var47.field2 = class77.field1375 - var11;
                                        var47.field4 = var9.field2571;
                                        field670.method3328(var47);
                                    }
                                }
                                if (var9.field2660 != null) {
                                    class1 var48 = new class1();
                                    var48.field5 = var9;
                                    var48.field4 = var9.field2660;
                                    field669.method3328(var48);
                                }
                                if (var9.field2654 != null && field656 > var9.field2686) {
                                    if (var9.field2655 == null || field656 - var9.field2686 > 32) {
                                        class1 var53 = new class1();
                                        var53.field5 = var9;
                                        var53.field4 = var9.field2654;
                                        field668.method3328(var53);
                                    } else {
                                        label394: for (int var49 = var9.field2686; var49 < field656; var49++) {
                                            int var50 = field495[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2655.length; var51++) {
                                                if (var9.field2655[var51] == var50) {
                                                    class1 var52 = new class1();
                                                    var52.field5 = var9;
                                                    var52.field4 = var9.field2654;
                                                    field668.method3328(var52);
                                                    break label394;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2686 = field656;
                                }
                                if (var9.field2684 != null && field658 > var9.field2600) {
                                    if (var9.field2657 == null || field658 - var9.field2600 > 32) {
                                        class1 var58 = new class1();
                                        var58.field5 = var9;
                                        var58.field4 = var9.field2684;
                                        field668.method3328(var58);
                                    } else {
                                        label374: for (int var54 = var9.field2600; var54 < field658; var54++) {
                                            int var55 = field657[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2657.length; var56++) {
                                                if (var9.field2657[var56] == var55) {
                                                    class1 var57 = new class1();
                                                    var57.field5 = var9;
                                                    var57.field4 = var9.field2684;
                                                    field668.method3328(var57);
                                                    break label374;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2600 = field658;
                                }
                                if (var9.field2658 != null && field646 > var9.field2688) {
                                    if (var9.field2616 == null || field646 - var9.field2688 > 32) {
                                        class1 var63 = new class1();
                                        var63.field5 = var9;
                                        var63.field4 = var9.field2658;
                                        field668.method3328(var63);
                                    } else {
                                        label354: for (int var59 = var9.field2688; var59 < field646; var59++) {
                                            int var60 = field659[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2616.length; var61++) {
                                                if (var9.field2616[var61] == var60) {
                                                    class1 var62 = new class1();
                                                    var62.field5 = var9;
                                                    var62.field4 = var9.field2658;
                                                    field668.method3328(var62);
                                                    break label354;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2688 = field646;
                                }
                                if (field470 > var9.field2685 && var9.field2663 != null) {
                                    class1 var64 = new class1();
                                    var64.field5 = var9;
                                    var64.field4 = var9.field2663;
                                    field668.method3328(var64);
                                }
                                if (field667 > var9.field2685 && var9.field2665 != null) {
                                    class1 var65 = new class1();
                                    var65.field5 = var9;
                                    var65.field4 = var9.field2665;
                                    field668.method3328(var65);
                                }
                                if (field661 > var9.field2685 && var9.field2666 != null) {
                                    class1 var66 = new class1();
                                    var66.field5 = var9;
                                    var66.field4 = var9.field2666;
                                    field668.method3328(var66);
                                }
                                if (field664 > var9.field2685 && var9.field2667 != null) {
                                    class1 var67 = new class1();
                                    var67.field5 = var9;
                                    var67.field4 = var9.field2667;
                                    field668.method3328(var67);
                                }
                                var9.field2685 = field654;
                                if (var9.field2664 != null) {
                                    for (int var68 = 0; var68 < field511; var68++) {
                                        class1 var69 = new class1();
                                        var69.field5 = var9;
                                        var69.field9 = field694[var68];
                                        var69.field8 = field673[var68];
                                        var69.field4 = var9.field2664;
                                        field668.method3328(var69);
                                    }
                                }
                            }
                        }
                        if (!var9.field2573) {
                            if (field642 != null || Statics.field167 != null || field613) {
                                return;
                            }
                            if ((var9.field2673 >= 0 || var9.field2646 != 0) && class77.field1382 >= var12 && class77.field1375 >= var13 && class77.field1382 < var14 && class77.field1375 < var15) {
                                if (var9.field2673 >= 0) {
                                    Statics.field901 = arg0[var9.field2673];
                                } else {
                                    Statics.field901 = var9;
                                }
                            }
                            if (var9.field2586 == 8 && class77.field1382 >= var12 && class77.field1375 >= var13 && class77.field1382 < var14 && class77.field1375 < var15) {
                                Statics.field1200 = var9;
                            }
                            if (var9.field2650 > var9.field2584) {
                                method11(var9, var9.field2583 + var10, var11, var9.field2584, var9.field2650, class77.field1382, class77.field1375);
                            }
                        }
                    } else if ((field705 == 0 || field705 == 3) && class77.field1374 == 1) {
                        int var24 = class77.field1381 - 25 - var10;
                        int var25 = class77.field1373 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field558 + field545 & 0x7FF;
                            int var27 = class104.field1749[var26];
                            int var28 = class104.field1754[var26];
                            int var29 = (field547 + 256) * var27 >> 8;
                            int var30 = (field547 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field71.field410 + var31 >> 7;
                            int var34 = Statics.field71.field407 - var32 >> 7;
                            boolean var35 = method2893(Statics.field71.field458[0], Statics.field71.field447[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field692.method2482(var24);
                                field692.method2482(var25);
                                field692.method2428(field558);
                                field692.method2482(57);
                                field692.method2482(field545);
                                field692.method2482(field547);
                                field692.method2482(89);
                                field692.method2428(Statics.field71.field410);
                                field692.method2428(Statics.field71.field407);
                                field692.method2482(field612);
                                field692.method2482(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.ci([Lfe;II)V")
    public static final void method630(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2586 == 0) {
                    if (var3.field2642 != null) {
                        method630(var3.field2642, arg1);
                    }
                    class4 var4 = (class4) field632.method3302((long) var3.field2574);
                    if (var4 != null) {
                        int var5 = var4.field53;
                        if (class158.method2675(var5)) {
                            method630(Statics.field2627[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2668 != null) {
                    class1 var6 = new class1();
                    var6.field5 = var3;
                    var6.field4 = var3.field2668;
                    class26.method2(var6);
                }
                if (arg1 == 1 && var3.field2669 != null) {
                    if (var3.field2575 >= 0) {
                        class158 var7 = class158.method3(var3.field2574);
                        if (var7 == null || var7.field2642 == null || var3.field2575 >= var7.field2642.length || var7.field2642[var3.field2575] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field5 = var3;
                    var8.field4 = var3.field2669;
                    class26.method2(var8);
                }
            }
        }
    }

    @ObfuscatedName("r.cl(Lfe;III)V")
    public static final void method7(class158 arg0, int arg1, int arg2) {
        if (field642 != null || field613 || arg0 == null || method193(arg0) == null) {
            return;
        }
        field642 = arg0;
        field643 = method193(arg0);
        field544 = arg1;
        field551 = arg2;
        Statics.field183 = 0;
        field594 = false;
    }

    @ObfuscatedName("b.cd(I)V")
    public static final void method227() {
        method1586(field642);
        Statics.field183++;
        if (field650 && field542) {
            int var0 = class77.field1382;
            int var1 = class77.field1375;
            int var2 = var0 - field544;
            int var3 = var1 - field551;
            if (var2 < field648) {
                var2 = field648;
            }
            if (field642.field2583 + var2 > field648 + field643.field2583) {
                var2 = field648 + field643.field2583 - field642.field2583;
            }
            if (var3 < field649) {
                var3 = field649;
            }
            if (field642.field2584 + var3 > field649 + field643.field2584) {
                var3 = field649 + field643.field2584 - field642.field2584;
            }
            int var4 = var2 - field645;
            int var5 = var3 - field647;
            int var6 = field642.field2637;
            if (Statics.field183 > field642.field2682 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field594 = true;
            }
            int var7 = field643.field2587 + (var2 - field648);
            int var8 = field643.field2588 + (var3 - field649);
            if (field642.field2593 != null && field594) {
                class1 var9 = new class1();
                var9.field5 = field642;
                var9.field3 = var7;
                var9.field2 = var8;
                var9.field4 = field642.field2593;
                class26.method2(var9);
            }
            if (class77.field1369 == 0) {
                if (field594) {
                    if (field642.field2651 != null) {
                        class1 var10 = new class1();
                        var10.field5 = field642;
                        var10.field3 = var7;
                        var10.field2 = var8;
                        var10.field6 = field517;
                        var10.field4 = field642.field2651;
                        class26.method2(var10);
                    }
                    if (field517 != null) {
                        class158 var11 = field642;
                        int var12 = class162.method267(method1588(var11));
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
                                var11 = class158.method3(var11.field2585);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field692.method2319(111);
                            field692.method2428(field642.field2575);
                            field692.method2480(field517.field2574);
                            field692.method2480(field642.field2574);
                            field692.method2581(field517.field2575);
                        }
                    }
                } else if ((field519 == 1 || method2315(field614 - 1)) && field614 > 2) {
                    method139();
                } else if (field614 > 0) {
                    method43(field614 - 1);
                }
                field642 = null;
            }
        } else if (Statics.field183 > 1) {
            field642 = null;
        }
    }

    @ObfuscatedName("cn.ct(Lfe;I)V")
    public static void method1586(class158 arg0) {
        if (field635 == arg0.field2617) {
            field674[arg0.field2689] = true;
        }
    }

    @ObfuscatedName("l.cy(I)V")
    public static void method194() {
        for (class4 var0 = (class4) field632.method3316(); var0 != null; var0 = (class4) field632.method3306()) {
            int var1 = var0.field53;
            if (class158.method2675(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2627[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2573;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2809;
                    class158 var6 = class158.method3(var5);
                    if (var6 != null) {
                        method1586(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.ce(Lfe;S)Lfe;")
    public static class158 method193(class158 arg0) {
        class158 var1 = arg0;
        int var2 = class162.method267(method1588(arg0));
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
                var1 = class158.method3(var1.field2585);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class158 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2636;
        }
        return var5;
    }

    @ObfuscatedName("ap.cs([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method547(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("er.cp(II)V")
    public static final void method2955(int arg0) {
        if (!class158.method2675(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2627[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2680 = 0;
                var3.field2653 = 0;
            }
        }
    }

    @ObfuscatedName("d.cj([Lfe;IB)V")
    public static final void method45(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2585 == arg1 && (!var3.field2573 || !method14(var3))) {
                if (var3.field2586 == 0) {
                    if (!var3.field2573 && method14(var3) && Statics.field901 != var3) {
                        continue;
                    }
                    method45(arg0, var3.field2574);
                    if (var3.field2642 != null) {
                        method45(var3.field2642, var3.field2574);
                    }
                    class4 var4 = (class4) field632.method3302((long) var3.field2574);
                    if (var4 != null) {
                        int var5 = var4.field53;
                        if (class158.method2675(var5)) {
                            method45(Statics.field2627[var5], -1);
                        }
                    }
                }
                if (var3.field2586 == 6) {
                    if (var3.field2610 != -1 || var3.field2611 != -1) {
                        boolean var6 = method157(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2611;
                        } else {
                            var7 = var3.field2610;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method2349(var7);
                            var3.field2653 += field550;
                            while (var3.field2653 > var8.field878[var3.field2680]) {
                                var3.field2653 -= var8.field878[var3.field2680];
                                var3.field2680++;
                                if (var3.field2680 >= var8.field876.length) {
                                    var3.field2680 -= var8.field880;
                                    if (var3.field2680 < 0 || var3.field2680 >= var8.field876.length) {
                                        var3.field2680 = 0;
                                    }
                                }
                                method1586(var3);
                            }
                        }
                    }
                    if (var3.field2606 != 0 && !var3.field2573) {
                        int var9 = var3.field2606 >> 16;
                        int var10 = var3.field2606 << 16 >> 16;
                        int var11 = field550 * var9;
                        int var12 = field550 * var10;
                        var3.field2614 = var3.field2614 + var11 & 0x7FF;
                        var3.field2615 = var3.field2615 + var12 & 0x7FF;
                        method1586(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.cx(IB)V")
    public static final void method166(int arg0) {
        method194();
        class7.method154();
        int var1 = class42.method1501(arg0).field1035;
        if (var1 == 0) {
            return;
        }
        int var2 = class159.field2693[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class104.method2138(0.9D);
                ((class110) Statics.field1761).method2224(0.9D);
            }
            if (var2 == 2) {
                class104.method2138(0.8D);
                ((class110) Statics.field1761).method2224(0.8D);
            }
            if (var2 == 3) {
                class104.method2138(0.7D);
                ((class110) Statics.field1761).method2224(0.7D);
            }
            if (var2 == 4) {
                class104.method2138(0.6D);
                ((class110) Statics.field1761).method2224(0.6D);
            }
            class40.method48();
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
            if (field622 != var3) {
                if (field622 == 0 && field573 != -1) {
                    class138.method1408(Statics.field98, field573, 0, var3, false);
                    field708 = false;
                } else if (var3 == 0) {
                    class138.method777();
                    field708 = false;
                } else if (class138.field2329 == 0) {
                    Statics.field2320.method2748(var3);
                } else {
                    Statics.field2326 = var3;
                }
                field622 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field709 = 127;
            }
            if (var2 == 1) {
                field709 = 96;
            }
            if (var2 == 2) {
                field709 = 64;
            }
            if (var2 == 3) {
                field709 = 32;
            }
            if (var2 == 4) {
                field709 = 0;
            }
        }
        if (var1 == 5) {
            field519 = var2;
        }
        if (var1 == 6) {
            field633 = var2;
        }
        if (var1 == 9) {
            field485 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field710 = 127;
        }
        if (var2 == 1) {
            field710 = 96;
        }
        if (var2 == 2) {
            field710 = 64;
        }
        if (var2 == 3) {
            field710 = 32;
        }
        if (var2 == 4) {
            field710 = 0;
        }
    }

    @ObfuscatedName("bv.cr(I)V")
    public static final void method1474() {
        field692.method2319(165);
        for (class4 var0 = (class4) field632.method3316(); var0 != null; var0 = (class4) field632.method3306()) {
            if (var0.field49 == 0 || var0.field49 == 3) {
                method2360(var0, true);
            }
        }
        if (field557 != null) {
            method1586(field557);
            field557 = null;
        }
    }

    @ObfuscatedName("fl.ck(IIII)Lp;")
    public static final class4 method3138(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field53 = arg1;
        var3.field49 = arg2;
        field632.method3318(var3, (long) arg0);
        method2955(arg1);
        class26.method39(arg1);
        class158 var4 = class158.method3(arg0);
        if (var4 != null) {
            method1586(var4);
        }
        if (field557 != null) {
            method1586(field557);
            field557 = null;
        }
        field613 = false;
        field614 = 0;
        method2666(Statics.field376, Statics.field770, Statics.field1768, Statics.field931);
        if (field586 != -1) {
            int var5 = field586;
            if (class158.method2675(var5)) {
                method630(Statics.field2627[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("db.ch(Lp;ZI)V")
    public static final void method2360(class4 arg0, boolean arg1) {
        int var2 = arg0.field53;
        int var3 = (int) arg0.field2809;
        arg0.method3359();
        if (arg1) {
            class158.method2211(var2);
        }
        for (class171 var4 = (class171) field671.method3316(); var4 != null; var4 = (class171) field671.method3306()) {
            if ((long) var2 == (var4.field2809 >> 48 & 0xFFFFL)) {
                var4.method3359();
            }
        }
        class158 var5 = class158.method3(var3);
        if (var5 != null) {
            method1586(var5);
        }
        field613 = false;
        field614 = 0;
        method2666(Statics.field376, Statics.field770, Statics.field1768, Statics.field931);
        if (field586 != -1) {
            int var6 = field586;
            if (class158.method2675(var6)) {
                method630(Statics.field2627[var6], 1);
            }
        }
    }

    @ObfuscatedName("c.cu(Lfe;I)Z")
    public static final boolean method246(class158 arg0) {
        int var1 = arg0.field2578;
        if (var1 == 205) {
            field518 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field729.method3170(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field729.method3171(var4, var5 == 1);
        }
        if (var1 == 324) {
            field729.method3172(false);
        }
        if (var1 == 325) {
            field729.method3172(true);
        }
        if (var1 == 326) {
            field692.method2319(159);
            field729.method3189(field692);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.cq(IIIILci;I)V")
    public static final void method888(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method249(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field558 + field545 & 0x7FF;
        int var7 = class104.field1749[var6];
        int var8 = class104.field1754[var6];
        int var9 = var7 * 256 / (field547 + 256);
        int var10 = var8 * 256 / (field547 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field721.method1693(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("c.co(IIIILci;I)V")
    public static final void method249(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field558 + field545 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1749[var5];
        int var8 = class104.field1754[var5];
        int var9 = var7 * 256 / (field547 + 256);
        int var10 = var8 * 256 / (field547 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1696(Statics.field805, arg0 + 94 + var11 - arg4.field1450 / 2 + 4, arg1 + 83 - var12 - arg4.field1451 / 2 - 4);
        } else {
            arg4.method1684(arg0 + 94 + var11 - arg4.field1450 / 2 + 4, arg1 + 83 - var12 - arg4.field1451 / 2 - 4);
        }
    }

    @ObfuscatedName("do.cm(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2379(int arg0, String arg1, String arg2) {
        method1416(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bo.cv(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method1416(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field682[var4] = field682[var4 - 1];
            field604[var4] = field604[var4 - 1];
            field685[var4] = field685[var4 - 1];
            field717[var4] = field717[var4 - 1];
        }
        field682[0] = arg0;
        field604[0] = arg1;
        field685[0] = arg2;
        field717[0] = arg3;
        field686++;
        field470 = field654;
    }

    @ObfuscatedName("bt.df(Ljava/lang/String;B)Z")
    public static boolean method1403(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method747(arg0, Statics.field204);
        for (int var2 = 0; var2 < field727; var2++) {
            class11 var3 = field728[var2];
            if (var1.equalsIgnoreCase(class148.method747(var3.field174, Statics.field204))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method747(var3.field177, Statics.field204))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("al.di(Ljava/lang/String;ZI)V")
    public static final void method859(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field727 >= 100) {
            method2379(0, "", class134.field2230);
            return;
        }
        String var2 = class148.method747(arg0, Statics.field204);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field727; var3++) {
            class11 var4 = field728[var3];
            String var5 = class148.method747(var4.field174, Statics.field204);
            if (var5 != null && var5.equals(var2)) {
                method2379(0, "", arg0 + class134.field2177);
                return;
            }
            if (var4.field177 != null) {
                String var6 = class148.method747(var4.field177, Statics.field204);
                if (var6 != null && var6.equals(var2)) {
                    method2379(0, "", arg0 + class134.field2177);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field723; var7++) {
            class23 var8 = field725[var7];
            String var9 = class148.method747(var8.field357, Statics.field204);
            if (var9 != null && var9.equals(var2)) {
                method2379(0, "", class134.field2264 + arg0 + class134.field2221);
                return;
            }
            if (var8.field355 != null) {
                String var10 = class148.method747(var8.field355, Statics.field204);
                if (var10 != null && var10.equals(var2)) {
                    method2379(0, "", class134.field2264 + arg0 + class134.field2221);
                    return;
                }
            }
        }
        if (class148.method747(Statics.field71.field39, Statics.field204).equals(var2)) {
            method2379(0, "", class134.field2233);
            return;
        }
        field692.method2319(41);
        class116 var11 = field692;
        int var12 = arg0.length() + 1;
        var11.method2482(var12);
        field692.method2432(arg0);
    }

    @ObfuscatedName("d.dq(Ljava/lang/String;II)V")
    public static final void method47(String arg0, int arg1) {
        field692.method2319(12);
        class116 var2 = field692;
        int var3 = arg0.length() + 1;
        var2.method2482(var3 + 1);
        field692.method2432(arg0);
        field692.method2482(arg1);
    }

    @ObfuscatedName("r.dd(Ljava/lang/String;I)V")
    public static final void method10(String arg0) {
        if (Statics.field1362 == null) {
            return;
        }
        field692.method2319(107);
        class116 var1 = field692;
        int var2 = arg0.length() + 1;
        var1.method2482(var2);
        field692.method2432(arg0);
    }

    @ObfuscatedName("eu.dm(I)V")
    public static final void method2823() {
        field692.method2319(35);
        field692.method2482(0);
    }

    @ObfuscatedName("cn.dw(Lfe;I)I")
    public static int method1588(class158 arg0) {
        class171 var1 = (class171) field671.method3302(((long) arg0.field2574 << 32) + (long) arg0.field2575);
        return var1 == null ? arg0.field2633 : var1.field2792;
    }

    @ObfuscatedName("r.du(Lfe;I)Z")
    public static boolean method14(class158 arg0) {
        if (field640) {
            if (method1588(arg0) != 0) {
                return false;
            }
            if (arg0.field2586 == 0) {
                return false;
            }
        }
        return arg0.field2576;
    }
}

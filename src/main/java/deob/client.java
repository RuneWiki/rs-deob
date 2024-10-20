package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.p")
    public static boolean field470 = true;

    @ObfuscatedName("client.z")
    public static int field471 = 1;

    @ObfuscatedName("client.m")
    public static int field472 = 0;

    @ObfuscatedName("client.v")
    public static int field508 = 0;

    @ObfuscatedName("client.h")
    public static boolean field474 = false;

    @ObfuscatedName("client.b")
    public static boolean field475 = false;

    @ObfuscatedName("client.r")
    public static int field476 = 0;

    @ObfuscatedName("client.u")
    public static int field477 = 0;

    @ObfuscatedName("client.g")
    public static boolean field516 = true;

    @ObfuscatedName("client.e")
    public static int field479 = 0;

    @ObfuscatedName("client.n")
    public static long field480 = 1L;

    @ObfuscatedName("client.a")
    public static int field643 = -1;

    @ObfuscatedName("client.f")
    public static int field482 = -1;

    @ObfuscatedName("client.s")
    public static int field483 = -1;

    @ObfuscatedName("client.w")
    public static class130[] field531 = new class130[4];

    @ObfuscatedName("client.j")
    public static boolean field484 = true;

    @ObfuscatedName("client.i")
    public static boolean field485 = false;

    @ObfuscatedName("client.ap")
    public static int field486 = 0;

    @ObfuscatedName("client.am")
    public static int field657 = 0;

    @ObfuscatedName("client.ao")
    public static int field525 = 0;

    @ObfuscatedName("client.af")
    public static int field489 = 0;

    @ObfuscatedName("client.ae")
    public static int field541 = 0;

    @ObfuscatedName("client.az")
    public static int field491 = 0;

    @ObfuscatedName("client.al")
    public static int field492 = 0;

    @ObfuscatedName("client.ak")
    public static int field677 = 0;

    @ObfuscatedName("client.ac")
    public static int field533 = 0;

    @ObfuscatedName("client.an")
    public static class127 field574 = new class127(new byte[5000]);

    @ObfuscatedName("client.aj")
    public static int field550 = 0;

    @ObfuscatedName("client.ad")
    public static int field498 = 0;

    @ObfuscatedName("client.at")
    public static int field696 = 0;

    @ObfuscatedName("client.by")
    public static int field514 = 0;

    @ObfuscatedName("client.bv")
    public static int field698 = 0;

    @ObfuscatedName("client.bs")
    public static int field505 = 0;

    @ObfuscatedName("client.bj")
    public static int field641 = 0;

    @ObfuscatedName("client.bp")
    public static int field566 = 0;

    @ObfuscatedName("client.bd")
    public static class25[] field509 = new class25[32768];

    @ObfuscatedName("client.bx")
    public static int field661 = 0;

    @ObfuscatedName("client.be")
    public static int[] field607 = new int[32768];

    @ObfuscatedName("client.cp")
    public static class116 field594 = new class116(5000);

    @ObfuscatedName("client.ch")
    public static class116 field500 = new class116(5000);

    @ObfuscatedName("client.co")
    public static class116 field515 = new class116(5000);

    @ObfuscatedName("client.cb")
    public static int field686 = 0;

    @ObfuscatedName("client.cc")
    public static int field517 = 0;

    @ObfuscatedName("client.cf")
    public static int field518 = 0;

    @ObfuscatedName("client.cq")
    public static int field481 = 0;

    @ObfuscatedName("client.cr")
    public static int field520 = 0;

    @ObfuscatedName("client.cl")
    public static int field521 = 0;

    @ObfuscatedName("client.cd")
    public static int field504 = 0;

    @ObfuscatedName("client.cs")
    public static int field660 = 0;

    @ObfuscatedName("client.ck")
    public static boolean field524 = false;

    @ObfuscatedName("client.cw")
    public static int field610 = 0;

    @ObfuscatedName("client.ct")
    public static int field526 = 0;

    @ObfuscatedName("client.cu")
    public static int field527 = 1;

    @ObfuscatedName("client.dr")
    public static int field528 = 0;

    @ObfuscatedName("client.dl")
    public static int field529 = 1;

    @ObfuscatedName("client.ds")
    public static int field506 = 0;

    @ObfuscatedName("client.di")
    public static boolean field532 = false;

    @ObfuscatedName("client.dp")
    public static int[][][] field510 = new int[4][13][13];

    @ObfuscatedName("client.du")
    public static final int[] field534 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field535 = 0;

    @ObfuscatedName("client.dq")
    public static int field536 = 2;

    @ObfuscatedName("client.de")
    public static int field537 = 0;

    @ObfuscatedName("client.dw")
    public static int field538 = 2;

    @ObfuscatedName("client.dx")
    public static int field539 = 0;

    @ObfuscatedName("client.dt")
    public static int field540 = 1;

    @ObfuscatedName("client.dy")
    public static int field623 = 0;

    @ObfuscatedName("client.do")
    public static int field700 = 0;

    @ObfuscatedName("client.dv")
    public static int field543 = 2;

    @ObfuscatedName("client.dh")
    public static int field599 = 0;

    @ObfuscatedName("client.da")
    public static int field545 = 1;

    @ObfuscatedName("client.ef")
    public static int field546 = 0;

    @ObfuscatedName("client.eb")
    public static int field547 = 0;

    @ObfuscatedName("client.eu")
    public static int field548 = 2301979;

    @ObfuscatedName("client.es")
    public static int field714 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field554 = 3353893;

    @ObfuscatedName("client.ew")
    public static int field551 = 7759444;

    @ObfuscatedName("client.er")
    public static boolean field552 = false;

    @ObfuscatedName("client.eo")
    public static int field620 = 0;

    @ObfuscatedName("client.fm")
    public static int field519 = 128;

    @ObfuscatedName("client.fo")
    public static int field555 = 0;

    @ObfuscatedName("client.fe")
    public static int field556 = 0;

    @ObfuscatedName("client.fj")
    public static int field557 = 0;

    @ObfuscatedName("client.fq")
    public static int field478 = 0;

    @ObfuscatedName("client.fw")
    public static int field559 = 0;

    @ObfuscatedName("client.fg")
    public static int field663 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field561 = false;

    @ObfuscatedName("client.fr")
    public static int field558 = 0;

    @ObfuscatedName("client.fk")
    public static int field716 = 0;

    @ObfuscatedName("client.fa")
    public static int field720 = 50;

    @ObfuscatedName("client.fy")
    public static int[] field565 = new int[field720];

    @ObfuscatedName("client.fv")
    public static int[] field488 = new int[field720];

    @ObfuscatedName("client.fi")
    public static int[] field567 = new int[field720];

    @ObfuscatedName("client.fu")
    public static int[] field496 = new int[field720];

    @ObfuscatedName("client.ft")
    public static int[] field569 = new int[field720];

    @ObfuscatedName("client.fp")
    public static int[] field553 = new int[field720];

    @ObfuscatedName("client.fh")
    public static int[] field723 = new int[field720];

    @ObfuscatedName("client.fs")
    public static String[] field572 = new String[field720];

    @ObfuscatedName("client.go")
    public static int[][] field573 = new int[104][104];

    @ObfuscatedName("client.gy")
    public static int field564 = 0;

    @ObfuscatedName("client.gg")
    public static int field575 = -1;

    @ObfuscatedName("client.ga")
    public static int field576 = -1;

    @ObfuscatedName("client.gl")
    public static int field577 = 0;

    @ObfuscatedName("client.gm")
    public static int field544 = 0;

    @ObfuscatedName("client.gh")
    public static int field579 = 0;

    @ObfuscatedName("client.gk")
    public static int field580 = 0;

    @ObfuscatedName("client.gd")
    public static int field495 = 0;

    @ObfuscatedName("client.gn")
    public static int field582 = 0;

    @ObfuscatedName("client.gc")
    public static int field549 = 0;

    @ObfuscatedName("client.gv")
    public static int field584 = 0;

    @ObfuscatedName("client.gs")
    public static int field585 = 0;

    @ObfuscatedName("client.gf")
    public static int field687 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field587 = false;

    @ObfuscatedName("client.ge")
    public static int field588 = 0;

    @ObfuscatedName("client.gp")
    public static int field589 = 0;

    @ObfuscatedName("client.gw")
    public static class3[] field675 = new class3[2048];

    @ObfuscatedName("client.gr")
    public static int field591 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field592 = new int[2048];

    @ObfuscatedName("client.gj")
    public static int field679 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field562 = new int[2048];

    @ObfuscatedName("client.hq")
    public static class127[] field595 = new class127[2048];

    @ObfuscatedName("client.hy")
    public static int field596 = -1;

    @ObfuscatedName("client.he")
    public static int field597 = 0;

    @ObfuscatedName("client.hm")
    public static int field598 = 0;

    @ObfuscatedName("client.hx")
    public static int[] field721 = new int[1000];

    @ObfuscatedName("client.hk")
    public static final int[] field727 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hp")
    public static String[] field601 = new String[8];

    @ObfuscatedName("client.hg")
    public static boolean[] field671 = new boolean[8];

    @ObfuscatedName("client.hs")
    public static int[] field603 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hb")
    public static class177[][][] field604 = new class177[4][104][104];

    @ObfuscatedName("client.ht")
    public static class177 field493 = new class177();

    @ObfuscatedName("client.hw")
    public static class177 field606 = new class177();

    @ObfuscatedName("client.hc")
    public static class177 field494 = new class177();

    @ObfuscatedName("client.hl")
    public static int[] field608 = new int[25];

    @ObfuscatedName("client.ha")
    public static int[] field609 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field649 = new int[25];

    @ObfuscatedName("client.hn")
    public static int field611 = 0;

    @ObfuscatedName("client.hd")
    public static boolean field612 = false;

    @ObfuscatedName("client.ig")
    public static int field613 = 0;

    @ObfuscatedName("client.ib")
    public static int[] field530 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field615 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field616 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field617 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field618 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field619 = new String[500];

    @ObfuscatedName("client.iv")
    public static int field665 = -1;

    @ObfuscatedName("client.ic")
    public static int field621 = -1;

    @ObfuscatedName("client.iu")
    public static int field622 = 0;

    @ObfuscatedName("client.im")
    public static int field614 = 50;

    @ObfuscatedName("client.id")
    public static int field624 = 0;

    @ObfuscatedName("client.it")
    public static String field625 = null;

    @ObfuscatedName("client.in")
    public static boolean field626 = false;

    @ObfuscatedName("client.iw")
    public static int field627 = -1;

    @ObfuscatedName("client.ie")
    public static String field628 = null;

    @ObfuscatedName("client.if")
    public static String field629 = null;

    @ObfuscatedName("client.ir")
    public static int field605 = -1;

    @ObfuscatedName("client.jk")
    public static class175 field631 = new class175(8);

    @ObfuscatedName("client.jp")
    public static int field632 = 0;

    @ObfuscatedName("client.jb")
    public static int field633 = 0;

    @ObfuscatedName("client.jc")
    public static class159 field634 = null;

    @ObfuscatedName("client.jf")
    public static int field635 = 0;

    @ObfuscatedName("client.ja")
    public static int field636 = 0;

    @ObfuscatedName("client.ji")
    public static int field637 = 0;

    @ObfuscatedName("client.jj")
    public static boolean field638 = false;

    @ObfuscatedName("client.jz")
    public static boolean field639 = false;

    @ObfuscatedName("client.jx")
    public static boolean field640 = false;

    @ObfuscatedName("client.jq")
    public static class159 field511 = null;

    @ObfuscatedName("client.jo")
    public static class159 field642 = null;

    @ObfuscatedName("client.jm")
    public static int field473 = 0;

    @ObfuscatedName("client.jd")
    public static int field644 = 0;

    @ObfuscatedName("client.jg")
    public static class159 field645 = null;

    @ObfuscatedName("client.jn")
    public static boolean field646 = false;

    @ObfuscatedName("client.jw")
    public static int field647 = -1;

    @ObfuscatedName("client.js")
    public static int field648 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field593 = false;

    @ObfuscatedName("client.jy")
    public static int field650 = -1;

    @ObfuscatedName("client.jh")
    public static int field497 = -1;

    @ObfuscatedName("client.ju")
    public static boolean field652 = false;

    @ObfuscatedName("client.ke")
    public static int field653 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field654 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field655 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field656 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field600 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field658 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field659 = 0;

    @ObfuscatedName("client.ky")
    public static int field503 = 0;

    @ObfuscatedName("client.kp")
    public static int field468 = 0;

    @ObfuscatedName("client.kf")
    public static int field662 = 0;

    @ObfuscatedName("client.kd")
    public static int field487 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field664 = new int[2000];

    @ObfuscatedName("client.ku")
    public static String[] field571 = new String[1000];

    @ObfuscatedName("client.kv")
    public static int field666 = 0;

    @ObfuscatedName("client.ks")
    public static class177 field667 = new class177();

    @ObfuscatedName("client.km")
    public static class177 field586 = new class177();

    @ObfuscatedName("client.kc")
    public static class177 field669 = new class177();

    @ObfuscatedName("client.kq")
    public static class175 field670 = new class175(512);

    @ObfuscatedName("client.kt")
    public static int field490 = 0;

    @ObfuscatedName("client.kg")
    public static int field672 = -2;

    @ObfuscatedName("client.kw")
    public static boolean[] field707 = new boolean[100];

    @ObfuscatedName("client.kn")
    public static boolean[] field674 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field704 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field676 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field688 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field678 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field563 = new int[100];

    @ObfuscatedName("client.lo")
    public static int field680 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field682 = new int[100];

    @ObfuscatedName("client.li")
    public static String[] field683 = new String[100];

    @ObfuscatedName("client.ld")
    public static String[] field578 = new String[100];

    @ObfuscatedName("client.ll")
    public static String[] field685 = new String[100];

    @ObfuscatedName("client.lg")
    public static int field570 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field630 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lb")
    public static int field731 = 0;

    @ObfuscatedName("client.le")
    public static int field689 = 0;

    @ObfuscatedName("client.lf")
    public static long[] field690 = new long[100];

    @ObfuscatedName("client.lm")
    public static int field691 = 0;

    @ObfuscatedName("client.lv")
    public static int field692 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field668 = new int[128];

    @ObfuscatedName("client.ln")
    public static int[] field694 = new int[128];

    @ObfuscatedName("client.lt")
    public static long field695 = -1L;

    @ObfuscatedName("client.la")
    public static String field712 = null;

    @ObfuscatedName("client.ls")
    public static String field697 = null;

    @ObfuscatedName("client.mg")
    public static int field522 = -1;

    @ObfuscatedName("client.mj")
    public static int field699 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field602 = new int[1000];

    @ObfuscatedName("client.md")
    public static int[] field701 = new int[1000];

    @ObfuscatedName("client.mz")
    public static class86[] field581 = new class86[1000];

    @ObfuscatedName("client.ml")
    public static int field710 = 0;

    @ObfuscatedName("client.mn")
    public static int field583 = 0;

    @ObfuscatedName("client.mh")
    public static int field705 = 0;

    @ObfuscatedName("client.mf")
    public static int field706 = 255;

    @ObfuscatedName("client.mr")
    public static int field684 = -1;

    @ObfuscatedName("client.my")
    public static boolean field708 = false;

    @ObfuscatedName("client.ma")
    public static int field709 = 127;

    @ObfuscatedName("client.me")
    public static int field568 = 127;

    @ObfuscatedName("client.nc")
    public static int field711 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field590 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field713 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field542 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field715 = new int[50];

    @ObfuscatedName("client.np")
    public static class57[] field507 = new class57[50];

    @ObfuscatedName("client.nh")
    public static boolean field717 = false;

    @ObfuscatedName("client.nt")
    public static boolean[] field718 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field719 = new int[5];

    @ObfuscatedName("client.nm")
    public static int[] field513 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field523 = new int[5];

    @ObfuscatedName("client.nl")
    public static int[] field722 = new int[5];

    @ObfuscatedName("client.og")
    public static int field693 = 0;

    @ObfuscatedName("client.on")
    public static int field724 = 0;

    @ObfuscatedName("client.ox")
    public static class23[] field702 = new class23[400];

    @ObfuscatedName("client.op")
    public static class173 field726 = new class173();

    @ObfuscatedName("client.or")
    public static int field730 = 0;

    @ObfuscatedName("client.ou")
    public static class11[] field673 = new class11[400];

    @ObfuscatedName("client.ot")
    public static class164 field729 = new class164();

    @ObfuscatedName("client.oi")
    public static int field651 = -1;

    @ObfuscatedName("client.ol")
    public static int field725 = -1;

    @ObfuscatedName("client.m(I)V")
    public final void method248() {
    }

    public final void init() {
        if (!this.method1496()) {
            return;
        }
        class167[] var1 = class167.method182();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2795);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2795)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field29)) {
                            field474 = true;
                        } else {
                            field474 = false;
                        }
                        break;
                    case 2:
                        field508 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field121 = var4;
                        break;
                    case 4:
                        field476 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field471 = Integer.parseInt(var4);
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field29)) {
                        }
                        break;
                    case 7:
                        class134[] var11 = new class134[] { class134.field2098, class134.field2099, class134.field2100, class134.field2096, class134.field2101, class134.field2095 };
                        Statics.field2028 = (class134) class113.method562(var11, Integer.parseInt(var4));
                        if (Statics.field2028 == class134.field2101) {
                            Statics.field242 = class186.field2870;
                        } else {
                            Statics.field242 = class186.field2873;
                        }
                        break;
                    case 8:
                        field472 = Integer.parseInt(var4);
                        break;
                    case 9:
                        int var5 = Integer.parseInt(var4);
                        class133[] var6 = new class133[] { class133.field2091, class133.field2085, class133.field2086, class133.field2087 };
                        class133[] var7 = var6;
                        int var8 = 0;
                        class133 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class133 var9 = var7[var8];
                            if (var9.field2089 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field2011 = var10;
                }
            }
        }
        method52();
        Statics.field1312 = this.getCodeBase().getHost();
        String var12 = Statics.field2011.field2088;
        byte var13 = 0;
        try {
            class82.method2912("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class80.method2321((String) null, var15);
        }
        Statics.field469 = this;
        this.method1439(765, 503, 41);
    }

    @ObfuscatedName("y.v(S)V")
    public static final void method52() {
        class95.field1568 = false;
        field475 = false;
    }

    @ObfuscatedName("client.y(I)V")
    public final void method251() {
        Statics.field1174 = field508 == 0 ? 43594 : field471 + 40000;
        Statics.field2010 = field508 == 0 ? 443 : field471 + 50000;
        Statics.field1995 = Statics.field1174;
        Statics.field2753 = class162.field2742;
        Statics.field2035 = class162.field2740;
        Statics.field272 = class162.field2738;
        Statics.field257 = class162.field2739;
        if (Statics.field1340.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1373[44] = 71;
            class75.field1373[45] = 26;
            class75.field1373[46] = 72;
            class75.field1373[47] = 73;
            class75.field1373[59] = 57;
            class75.field1373[61] = 27;
            class75.field1373[91] = 42;
            class75.field1373[92] = 74;
            class75.field1373[93] = 43;
            class75.field1373[192] = 28;
            class75.field1373[222] = 58;
            class75.field1373[520] = 59;
        } else {
            class75.field1373[186] = 57;
            class75.field1373[187] = 27;
            class75.field1373[188] = 71;
            class75.field1373[189] = 26;
            class75.field1373[190] = 72;
            class75.field1373[191] = 73;
            class75.field1373[192] = 58;
            class75.field1373[219] = 42;
            class75.field1373[220] = 74;
            class75.field1373[221] = 43;
            class75.field1373[222] = 59;
            class75.field1373[223] = 28;
        }
        class75.method142(Statics.field1408);
        Canvas var1 = Statics.field1408;
        var1.addMouseListener(class77.field1392);
        var1.addMouseMotionListener(class77.field1392);
        var1.addFocusListener(class77.field1392);
        class78 var2;
        try {
            var2 = new class78();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field1175 = var2;
        if (Statics.field1175 != null) {
            Statics.field1175.method1370(Statics.field1408);
        }
        Statics.field298 = new class71(255, class82.field1431, class82.field1434, 500000);
        class29 var4 = null;
        class12 var5 = new class12();
        try {
            var4 = class82.method1339("", Statics.field2028.field2097, false);
            byte[] var6 = new byte[(int) var4.method540()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method538(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class12(new class127(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method539();
            }
        } catch (Exception var12) {
        }
        Statics.field271 = var5;
        Statics.field422 = this.getToolkit().getSystemClipboard();
        if (field508 != 0) {
            field485 = true;
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method252() {
        field479++;
        this.method255();
        class158.method1852();
        try {
            if (class139.field2363 == 1) {
                int var1 = Statics.field2362.method2724();
                if (var1 > 0 && Statics.field2362.method2732()) {
                    int var2 = var1 - Statics.field1671;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2362.method2701(var2);
                } else {
                    Statics.field2362.method2707();
                    Statics.field2362.method2737();
                    if (Statics.field2364 == null) {
                        class139.field2363 = 0;
                    } else {
                        class139.field2363 = 2;
                    }
                    Statics.field258 = null;
                    Statics.field2361 = null;
                }
            }
        } catch (Exception var275) {
            var275.printStackTrace();
            Statics.field2362.method2707();
            class139.field2363 = 0;
            Statics.field258 = null;
            Statics.field2361 = null;
            Statics.field2364 = null;
        }
        method807();
        class75 var4 = class75.field1381;
        synchronized (class75.field1381) {
            class75.field1358++;
            class75.field1377 = class75.field1371;
            class75.field1368 = 0;
            if (class75.field1364 >= 0) {
                while (class75.field1364 != class75.field1363) {
                    int var6 = class75.field1362[class75.field1363];
                    class75.field1363 = class75.field1363 + 1 & 0x7F;
                    if (var6 < 0) {
                        class75.field1361[~var6] = false;
                    } else {
                        if (!class75.field1361[var6] && class75.field1368 < class75.field1355.length - 1) {
                            class75.field1355[++class75.field1368 - 1] = var6;
                        }
                        class75.field1361[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class75.field1361[var5] = false;
                }
                class75.field1364 = class75.field1363;
            }
            class75.field1371 = class75.field1352;
        }
        Statics.method13();
        if (Statics.field1175 != null) {
            int var8 = Statics.field1175.method1372();
            field666 = var8;
        }
        if (field477 == 0) {
            method1647();
            Statics.field1262.method1362();
            for (int var9 = 0; var9 < 32; var9++) {
                field1313[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field1322[var10] = 0L;
            }
            Statics.field1299 = 0;
        } else if (field477 == 5) {
            class21.method2812(this);
            method1647();
            Statics.field1262.method1362();
            for (int var11 = 0; var11 < 32; var11++) {
                field1313[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field1322[var12] = 0L;
            }
            Statics.field1299 = 0;
        } else if (field477 == 10) {
            class21.method2812(this);
        } else if (field477 == 20) {
            class21.method2812(this);
            method128();
        } else if (field477 == 25) {
            method222(false);
            field526 = 0;
            boolean var13 = true;
            for (int var14 = 0; var14 < Statics.field391.length; var14++) {
                if (Statics.field810[var14] != -1 && Statics.field391[var14] == null) {
                    Statics.field391[var14] = Statics.field501.method2952(Statics.field810[var14], 0);
                    if (Statics.field391[var14] == null) {
                        var13 = false;
                        field526++;
                    }
                }
                if (Statics.field864[var14] != -1 && Statics.field1802[var14] == null) {
                    Statics.field1802[var14] = Statics.field501.method2953(Statics.field864[var14], 0, Statics.field2424[var14]);
                    if (Statics.field1802[var14] == null) {
                        var13 = false;
                        field526++;
                    }
                }
            }
            if (var13) {
                field528 = 0;
                boolean var15 = true;
                for (int var16 = 0; var16 < Statics.field391.length; var16++) {
                    byte[] var17 = Statics.field1802[var16];
                    if (var17 != null) {
                        int var18 = (Statics.field265[var16] >> 8) * 64 - Statics.field920;
                        int var19 = (Statics.field265[var16] & 0xFF) * 64 - Statics.field1822;
                        if (field532) {
                            var18 = 10;
                            var19 = 10;
                        }
                        boolean var21 = true;
                        class127 var22 = new class127(var17);
                        int var23 = -1;
                        label1349: while (true) {
                            int var24 = var22.method2596();
                            if (var24 == 0) {
                                var15 &= var21;
                                break;
                            }
                            var23 += var24;
                            int var25 = 0;
                            boolean var26 = false;
                            while (true) {
                                while (!var26) {
                                    int var28 = var22.method2596();
                                    if (var28 == 0) {
                                        continue label1349;
                                    }
                                    var25 += var28 - 1;
                                    int var29 = var25 & 0x3F;
                                    int var30 = var25 >> 6 & 0x3F;
                                    int var31 = var22.method2534() >> 2;
                                    int var32 = var18 + var30;
                                    int var33 = var19 + var29;
                                    if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) {
                                        class32 var34 = class32.method14(var23);
                                        if (var31 != 22 || !field475 || var34.field833 != 0 || var34.field831 == 1 || var34.field852) {
                                            if (!var34.method643()) {
                                                field528++;
                                                var21 = false;
                                            }
                                            var26 = true;
                                        }
                                    }
                                }
                                int var27 = var22.method2596();
                                if (var27 == 0) {
                                    break;
                                }
                                var22.method2534();
                            }
                        }
                    }
                }
                if (var15) {
                    if (field506 != 0) {
                        Statics.method129(class135.field2112 + class2.field25 + class2.field19 + 100 + "%" + class2.field20, true);
                    }
                    method807();
                    method882();
                    method807();
                    Statics.field773.method1976();
                    method807();
                    System.gc();
                    for (int var36 = 0; var36 < 4; var36++) {
                        field531[var36].method2651();
                    }
                    for (int var37 = 0; var37 < 4; var37++) {
                        for (int var38 = 0; var38 < 104; var38++) {
                            for (int var39 = 0; var39 < 104; var39++) {
                                class9.field120[var37][var38][var39] = 0;
                            }
                        }
                    }
                    method807();
                    class9.field132 = 99;
                    Statics.field139 = new byte[4][104][104];
                    Statics.field284 = new byte[4][104][104];
                    Statics.field737 = new byte[4][104][104];
                    Statics.field123 = new byte[4][104][104];
                    Statics.field2072 = new int[4][105][105];
                    Statics.field55 = new byte[4][105][105];
                    Statics.field124 = new int[105][105];
                    Statics.field1978 = new int[104];
                    Statics.field2354 = new int[104];
                    Statics.field1761 = new int[104];
                    Statics.field81 = new int[104];
                    Statics.field1463 = new int[104];
                    int var40 = Statics.field391.length;
                    for (class7 var41 = (class7) class7.field96.method3286(); var41 != null; var41 = (class7) class7.field96.method3302()) {
                        if (var41.field88 != null) {
                            Statics.field1260.method1115(var41.field88);
                            var41.field88 = null;
                        }
                        if (var41.field101 != null) {
                            Statics.field1260.method1115(var41.field101);
                            var41.field101 = null;
                        }
                    }
                    class7.field96.method3275();
                    method222(true);
                    if (!field532) {
                        int var42 = 0;
                        label1281: while (true) {
                            if (var42 >= var40) {
                                for (int var56 = 0; var56 < var40; var56++) {
                                    int var57 = (Statics.field265[var56] >> 8) * 64 - Statics.field920;
                                    int var58 = (Statics.field265[var56] & 0xFF) * 64 - Statics.field1822;
                                    byte[] var59 = Statics.field391[var56];
                                    if (var59 == null && Statics.field351 < 800) {
                                        method807();
                                        class9.method897(var57, var58, 64, 64);
                                    }
                                }
                                method222(true);
                                int var60 = 0;
                                while (true) {
                                    if (var60 >= var40) {
                                        break label1281;
                                    }
                                    byte[] var61 = Statics.field1802[var60];
                                    if (var61 != null) {
                                        int var62 = (Statics.field265[var60] >> 8) * 64 - Statics.field920;
                                        int var63 = (Statics.field265[var60] & 0xFF) * 64 - Statics.field1822;
                                        method807();
                                        class95 var64 = Statics.field773;
                                        class130[] var65 = field531;
                                        class127 var66 = new class127(var61);
                                        int var67 = -1;
                                        while (true) {
                                            int var68 = var66.method2596();
                                            if (var68 == 0) {
                                                break;
                                            }
                                            var67 += var68;
                                            int var69 = 0;
                                            while (true) {
                                                int var70 = var66.method2596();
                                                if (var70 == 0) {
                                                    break;
                                                }
                                                var69 += var70 - 1;
                                                int var71 = var69 & 0x3F;
                                                int var72 = var69 >> 6 & 0x3F;
                                                int var73 = var69 >> 12;
                                                int var74 = var66.method2534();
                                                int var75 = var74 >> 2;
                                                int var76 = var74 & 0x3;
                                                int var77 = var62 + var72;
                                                int var78 = var63 + var71;
                                                if (var77 > 0 && var78 > 0 && var77 < 103 && var78 < 103) {
                                                    int var79 = var73;
                                                    if ((class9.field120[1][var77][var78] & 0x2) == 2) {
                                                        var79 = var73 - 1;
                                                    }
                                                    class130 var80 = null;
                                                    if (var79 >= 0) {
                                                        var80 = var65[var79];
                                                    }
                                                    class9.method45(var73, var77, var78, var67, var76, var75, var64, var80);
                                                }
                                            }
                                        }
                                    }
                                    var60++;
                                }
                            }
                            int var43 = (Statics.field265[var42] >> 8) * 64 - Statics.field920;
                            int var44 = (Statics.field265[var42] & 0xFF) * 64 - Statics.field1822;
                            byte[] var45 = Statics.field391[var42];
                            if (var45 != null) {
                                method807();
                                int var46 = Statics.field1921 * 8 - 48;
                                int var47 = Statics.field351 * 8 - 48;
                                class130[] var48 = field531;
                                int var49 = 0;
                                label1278: while (true) {
                                    if (var49 >= 4) {
                                        class127 var52 = new class127(var45);
                                        int var53 = 0;
                                        while (true) {
                                            if (var53 >= 4) {
                                                break label1278;
                                            }
                                            for (int var54 = 0; var54 < 64; var54++) {
                                                for (int var55 = 0; var55 < 64; var55++) {
                                                    class9.method794(var52, var53, var43 + var54, var44 + var55, var46, var47, 0);
                                                }
                                            }
                                            var53++;
                                        }
                                    }
                                    for (int var50 = 0; var50 < 64; var50++) {
                                        for (int var51 = 0; var51 < 64; var51++) {
                                            if (var43 + var50 > 0 && var43 + var50 < 103 && var44 + var51 > 0 && var44 + var51 < 103) {
                                                var48[var49].field2052[var43 + var50][var44 + var51] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var49++;
                                }
                            }
                            var42++;
                        }
                    }
                    if (field532) {
                        int var81 = 0;
                        label1214: while (true) {
                            if (var81 >= 4) {
                                for (int var120 = 0; var120 < 13; var120++) {
                                    for (int var121 = 0; var121 < 13; var121++) {
                                        int var122 = field510[0][var120][var121];
                                        if (var122 == -1) {
                                            class9.method897(var120 * 8, var121 * 8, 8, 8);
                                        }
                                    }
                                }
                                method222(true);
                                int var123 = 0;
                                while (true) {
                                    if (var123 >= 4) {
                                        break label1214;
                                    }
                                    method807();
                                    for (int var124 = 0; var124 < 13; var124++) {
                                        for (int var125 = 0; var125 < 13; var125++) {
                                            int var126 = field510[var123][var124][var125];
                                            if (var126 != -1) {
                                                int var127 = var126 >> 24 & 0x3;
                                                int var128 = var126 >> 1 & 0x3;
                                                int var129 = var126 >> 14 & 0x3FF;
                                                int var130 = var126 >> 3 & 0x7FF;
                                                int var131 = (var129 / 8 << 8) + var130 / 8;
                                                for (int var132 = 0; var132 < Statics.field265.length; var132++) {
                                                    if (Statics.field265[var132] == var131 && Statics.field1802[var132] != null) {
                                                        class9.method141(Statics.field1802[var132], var123, var124 * 8, var125 * 8, var127, (var129 & 0x7) * 8, (var130 & 0x7) * 8, var128, Statics.field773, field531);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var123++;
                                }
                            }
                            method807();
                            for (int var82 = 0; var82 < 13; var82++) {
                                for (int var83 = 0; var83 < 13; var83++) {
                                    boolean var84 = false;
                                    int var85 = field510[var81][var82][var83];
                                    if (var85 != -1) {
                                        int var86 = var85 >> 24 & 0x3;
                                        int var87 = var85 >> 1 & 0x3;
                                        int var88 = var85 >> 14 & 0x3FF;
                                        int var89 = var85 >> 3 & 0x7FF;
                                        int var90 = (var88 / 8 << 8) + var89 / 8;
                                        for (int var91 = 0; var91 < Statics.field265.length; var91++) {
                                            if (Statics.field265[var91] == var90 && Statics.field391[var91] != null) {
                                                byte[] var92 = Statics.field391[var91];
                                                int var93 = var82 * 8;
                                                int var94 = var83 * 8;
                                                int var95 = (var88 & 0x7) * 8;
                                                int var96 = (var89 & 0x7) * 8;
                                                class130[] var97 = field531;
                                                for (int var98 = 0; var98 < 8; var98++) {
                                                    for (int var99 = 0; var99 < 8; var99++) {
                                                        if (var93 + var98 > 0 && var93 + var98 < 103 && var94 + var99 > 0 && var94 + var99 < 103) {
                                                            var97[var81].field2052[var93 + var98][var94 + var99] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class127 var100 = new class127(var92);
                                                for (int var101 = 0; var101 < 4; var101++) {
                                                    for (int var102 = 0; var102 < 64; var102++) {
                                                        for (int var103 = 0; var103 < 64; var103++) {
                                                            if (var86 == var101 && var102 >= var95 && var102 < var95 + 8 && var103 >= var96 && var103 < var96 + 8) {
                                                                int var106 = var93 + class161.method890(var102 & 0x7, var103 & 0x7, var87);
                                                                int var108 = var102 & 0x7;
                                                                int var109 = var103 & 0x7;
                                                                int var111 = var87 & 0x3;
                                                                int var112;
                                                                if (var111 == 0) {
                                                                    var112 = var109;
                                                                } else if (var111 == 1) {
                                                                    var112 = 7 - var108;
                                                                } else if (var111 == 2) {
                                                                    var112 = 7 - var109;
                                                                } else {
                                                                    var112 = var108;
                                                                }
                                                                class9.method794(var100, var81, var106, var94 + var112, 0, 0, var87);
                                                            } else {
                                                                class9.method794(var100, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var84 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var84) {
                                        int var113 = var81;
                                        int var114 = var82 * 8;
                                        int var115 = var83 * 8;
                                        for (int var116 = 0; var116 < 8; var116++) {
                                            for (int var117 = 0; var117 < 8; var117++) {
                                                class9.field134[var113][var114 + var116][var115 + var117] = 0;
                                            }
                                        }
                                        if (var114 > 0) {
                                            for (int var118 = 1; var118 < 8; var118++) {
                                                class9.field134[var113][var114][var115 + var118] = class9.field134[var113][var114 - 1][var115 + var118];
                                            }
                                        }
                                        if (var115 > 0) {
                                            for (int var119 = 1; var119 < 8; var119++) {
                                                class9.field134[var113][var114 + var119][var115] = class9.field134[var113][var114 + var119][var115 - 1];
                                            }
                                        }
                                        if (var114 > 0 && class9.field134[var113][var114 - 1][var115] != 0) {
                                            class9.field134[var113][var114][var115] = class9.field134[var113][var114 - 1][var115];
                                        } else if (var115 > 0 && class9.field134[var113][var114][var115 - 1] != 0) {
                                            class9.field134[var113][var114][var115] = class9.field134[var113][var114][var115 - 1];
                                        } else if (var114 > 0 && var115 > 0 && class9.field134[var113][var114 - 1][var115 - 1] != 0) {
                                            class9.field134[var113][var114][var115] = class9.field134[var113][var114 - 1][var115 - 1];
                                        }
                                    }
                                }
                            }
                            var81++;
                        }
                    }
                    method222(true);
                    method882();
                    method807();
                    class95 var133 = Statics.field773;
                    class130[] var134 = field531;
                    for (int var135 = 0; var135 < 4; var135++) {
                        for (int var136 = 0; var136 < 104; var136++) {
                            for (int var137 = 0; var137 < 104; var137++) {
                                if ((class9.field120[var135][var136][var137] & 0x1) == 1) {
                                    int var138 = var135;
                                    if ((class9.field120[1][var136][var137] & 0x2) == 2) {
                                        var138 = var135 - 1;
                                    }
                                    if (var138 >= 0) {
                                        var134[var138].method2653(var136, var137);
                                    }
                                }
                            }
                        }
                    }
                    class9.field131 += (int) (Math.random() * 5.0D) - 2;
                    if (class9.field131 < -8) {
                        class9.field131 = -8;
                    }
                    if (class9.field131 > 8) {
                        class9.field131 = 8;
                    }
                    class9.field141 += (int) (Math.random() * 5.0D) - 2;
                    if (class9.field141 < -16) {
                        class9.field141 = -16;
                    }
                    if (class9.field141 > 16) {
                        class9.field141 = 16;
                    }
                    for (int var139 = 0; var139 < 4; var139++) {
                        byte[][] var140 = Statics.field55[var139];
                        int var141 = (int) Math.sqrt(5100.0D);
                        int var142 = var141 * 768 >> 8;
                        for (int var143 = 1; var143 < 103; var143++) {
                            for (int var144 = 1; var144 < 103; var144++) {
                                int var145 = class9.field134[var139][var144 + 1][var143] - class9.field134[var139][var144 - 1][var143];
                                int var146 = class9.field134[var139][var144][var143 + 1] - class9.field134[var139][var144][var143 - 1];
                                int var147 = (int) Math.sqrt((double) (var146 * var146 + var145 * var145 + 65536));
                                int var148 = (var145 << 8) / var147;
                                int var149 = 65536 / var147;
                                int var150 = (var146 << 8) / var147;
                                int var151 = (var150 * -50 + var148 * -50 + var149 * -10) / var142 + 96;
                                int var152 = (var140[var144][var143] >> 1) + (var140[var144][var143 + 1] >> 3) + (var140[var144][var143 - 1] >> 2) + (var140[var144 - 1][var143] >> 2) + (var140[var144 + 1][var143] >> 3);
                                Statics.field124[var144][var143] = var151 - var152;
                            }
                        }
                        for (int var153 = 0; var153 < 104; var153++) {
                            Statics.field1978[var153] = 0;
                            Statics.field2354[var153] = 0;
                            Statics.field1761[var153] = 0;
                            Statics.field81[var153] = 0;
                            Statics.field1463[var153] = 0;
                        }
                        for (int var154 = -5; var154 < 109; var154++) {
                            for (int var155 = 0; var155 < 104; var155++) {
                                int var156 = var154 + 5;
                                int var10002;
                                if (var156 >= 0 && var156 < 104) {
                                    int var157 = Statics.field139[var139][var156][var155] & 0xFF;
                                    if (var157 > 0) {
                                        class33 var158 = class33.method123(var157 - 1);
                                        Statics.field1978[var155] += var158.field873;
                                        Statics.field2354[var155] += var158.field870;
                                        Statics.field1761[var155] += var158.field871;
                                        Statics.field81[var155] += var158.field872;
                                        var10002 = Statics.field1463[var155]++;
                                    }
                                }
                                int var159 = var154 - 5;
                                if (var159 >= 0 && var159 < 104) {
                                    int var160 = Statics.field139[var139][var159][var155] & 0xFF;
                                    if (var160 > 0) {
                                        class33 var161 = class33.method123(var160 - 1);
                                        Statics.field1978[var155] -= var161.field873;
                                        Statics.field2354[var155] -= var161.field870;
                                        Statics.field1761[var155] -= var161.field871;
                                        Statics.field81[var155] -= var161.field872;
                                        var10002 = Statics.field1463[var155]--;
                                    }
                                }
                            }
                            if (var154 >= 1 && var154 < 103) {
                                int var162 = 0;
                                int var163 = 0;
                                int var164 = 0;
                                int var165 = 0;
                                int var166 = 0;
                                for (int var167 = -5; var167 < 109; var167++) {
                                    int var168 = var167 + 5;
                                    if (var168 >= 0 && var168 < 104) {
                                        var162 += Statics.field1978[var168];
                                        var163 += Statics.field2354[var168];
                                        var164 += Statics.field1761[var168];
                                        var165 += Statics.field81[var168];
                                        var166 += Statics.field1463[var168];
                                    }
                                    int var169 = var167 - 5;
                                    if (var169 >= 0 && var169 < 104) {
                                        var162 -= Statics.field1978[var169];
                                        var163 -= Statics.field2354[var169];
                                        var164 -= Statics.field1761[var169];
                                        var165 -= Statics.field81[var169];
                                        var166 -= Statics.field1463[var169];
                                    }
                                    if (var167 >= 1 && var167 < 103) {
                                        if (field475 && (class9.field120[0][var154][var167] & 0x2) == 0) {
                                            if ((class9.field120[var139][var154][var167] & 0x10) != 0) {
                                                continue;
                                            }
                                            int var170;
                                            if ((class9.field120[var139][var154][var167] & 0x8) != 0) {
                                                var170 = 0;
                                            } else if (var139 <= 0 || (class9.field120[1][var154][var167] & 0x2) == 0) {
                                                var170 = var139;
                                            } else {
                                                var170 = var139 - 1;
                                            }
                                            if (field610 != var170) {
                                                continue;
                                            }
                                        }
                                        if (var139 < class9.field132) {
                                            class9.field132 = var139;
                                        }
                                        int var171 = Statics.field139[var139][var154][var167] & 0xFF;
                                        int var172 = Statics.field284[var139][var154][var167] & 0xFF;
                                        if (var171 > 0 || var172 > 0) {
                                            int var173 = class9.field134[var139][var154][var167];
                                            int var174 = class9.field134[var139][var154 + 1][var167];
                                            int var175 = class9.field134[var139][var154 + 1][var167 + 1];
                                            int var176 = class9.field134[var139][var154][var167 + 1];
                                            int var177 = Statics.field124[var154][var167];
                                            int var178 = Statics.field124[var154 + 1][var167];
                                            int var179 = Statics.field124[var154 + 1][var167 + 1];
                                            int var180 = Statics.field124[var154][var167 + 1];
                                            int var181 = -1;
                                            int var182 = -1;
                                            if (var171 > 0) {
                                                int var183 = var162 * 256 / var165;
                                                int var184 = var163 / var166;
                                                int var185 = var164 / var166;
                                                var181 = class9.method356(var183, var184, var185);
                                                int var186 = class9.field131 + var183 & 0xFF;
                                                int var187 = class9.field141 + var185;
                                                if (var187 < 0) {
                                                    var187 = 0;
                                                } else if (var187 > 255) {
                                                    var187 = 255;
                                                }
                                                var182 = class9.method356(var186, var184, var187);
                                            }
                                            if (var139 > 0) {
                                                boolean var188 = true;
                                                if (var171 == 0 && Statics.field737[var139][var154][var167] != 0) {
                                                    var188 = false;
                                                }
                                                if (var172 > 0) {
                                                    int var189 = var172 - 1;
                                                    class37 var190 = (class37) class37.field937.method3215((long) var189);
                                                    class37 var191;
                                                    if (var190 == null) {
                                                        byte[] var192 = Statics.field943.method2952(4, var189);
                                                        class37 var193 = new class37();
                                                        if (var192 != null) {
                                                            var193.method785(new class127(var192), var189);
                                                        }
                                                        var193.method784();
                                                        class37.field937.method3225(var193, (long) var189);
                                                        var191 = var193;
                                                    } else {
                                                        var191 = var190;
                                                    }
                                                    if (!var191.field944) {
                                                        var188 = false;
                                                    }
                                                }
                                                if (var188 && var173 == var174 && var173 == var175 && var173 == var176) {
                                                    Statics.field2072[var139][var154][var167] |= 0x924;
                                                }
                                            }
                                            int var194 = 0;
                                            if (var182 != -1) {
                                                var194 = class104.field1781[class9.method2936(var182, 96)];
                                            }
                                            if (var172 == 0) {
                                                var133.method1865(var139, var154, var167, 0, 0, -1, var173, var174, var175, var176, class9.method2936(var181, var177), class9.method2936(var181, var178), class9.method2936(var181, var179), class9.method2936(var181, var180), 0, 0, 0, 0, var194, 0);
                                            } else {
                                                int var195 = Statics.field737[var139][var154][var167] + 1;
                                                byte var196 = Statics.field123[var139][var154][var167];
                                                int var197 = var172 - 1;
                                                class37 var198 = (class37) class37.field937.method3215((long) var197);
                                                class37 var199;
                                                if (var198 == null) {
                                                    byte[] var200 = Statics.field943.method2952(4, var197);
                                                    class37 var201 = new class37();
                                                    if (var200 != null) {
                                                        var201.method785(new class127(var200), var197);
                                                    }
                                                    var201.method784();
                                                    class37.field937.method3225(var201, (long) var197);
                                                    var199 = var201;
                                                } else {
                                                    var199 = var198;
                                                }
                                                int var203 = var199.field936;
                                                int var204;
                                                int var205;
                                                if (var203 >= 0) {
                                                    var204 = Statics.field1764.method2162(var203);
                                                    var205 = -1;
                                                } else if (var199.field939 == 16711935) {
                                                    var205 = -2;
                                                    var203 = -1;
                                                    var204 = -2;
                                                } else {
                                                    var205 = class9.method356(var199.field933, var199.field940, var199.field941);
                                                    int var206 = class9.field131 + var199.field933 & 0xFF;
                                                    int var207 = class9.field141 + var199.field941;
                                                    if (var207 < 0) {
                                                        var207 = 0;
                                                    } else if (var207 > 255) {
                                                        var207 = 255;
                                                    }
                                                    var204 = class9.method356(var206, var199.field940, var207);
                                                }
                                                int var208 = 0;
                                                if (var204 != -2) {
                                                    var208 = class104.field1781[Statics.method1858(var204, 96)];
                                                }
                                                if (var199.field934 != -1) {
                                                    int var209 = class9.field131 + var199.field942 & 0xFF;
                                                    int var210 = class9.field141 + var199.field938;
                                                    if (var210 < 0) {
                                                        var210 = 0;
                                                    } else if (var210 > 255) {
                                                        var210 = 255;
                                                    }
                                                    int var211 = class9.method356(var209, var199.field935, var210);
                                                    var208 = class104.field1781[Statics.method1858(var211, 96)];
                                                }
                                                var133.method1865(var139, var154, var167, var195, var196, var203, var173, var174, var175, var176, class9.method2936(var181, var177), class9.method2936(var181, var178), class9.method2936(var181, var179), class9.method2936(var181, var180), Statics.method1858(var205, var177), Statics.method1858(var205, var178), Statics.method1858(var205, var179), Statics.method1858(var205, var180), var194, var208);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var212 = 1; var212 < 103; var212++) {
                            for (int var213 = 1; var213 < 103; var213++) {
                                int var218;
                                if ((class9.field120[var139][var213][var212] & 0x8) != 0) {
                                    var218 = 0;
                                } else if (var139 <= 0 || (class9.field120[1][var213][var212] & 0x2) == 0) {
                                    var218 = var139;
                                } else {
                                    var218 = var139 - 1;
                                }
                                var133.method1864(var139, var213, var212, var218);
                            }
                        }
                        Statics.field139[var139] = (byte[][]) null;
                        Statics.field284[var139] = (byte[][]) null;
                        Statics.field737[var139] = (byte[][]) null;
                        Statics.field123[var139] = (byte[][]) null;
                        Statics.field55[var139] = (byte[][]) null;
                    }
                    var133.method1891(-50, -10, -50);
                    for (int var219 = 0; var219 < 104; var219++) {
                        for (int var220 = 0; var220 < 104; var220++) {
                            if ((class9.field120[1][var219][var220] & 0x2) == 2) {
                                var133.method1894(var219, var220);
                            }
                        }
                    }
                    int var221 = 1;
                    int var222 = 2;
                    int var223 = 4;
                    for (int var224 = 0; var224 < 4; var224++) {
                        if (var224 > 0) {
                            var221 <<= 0x3;
                            var222 <<= 0x3;
                            var223 <<= 0x3;
                        }
                        for (int var225 = 0; var225 <= var224; var225++) {
                            for (int var226 = 0; var226 <= 104; var226++) {
                                for (int var227 = 0; var227 <= 104; var227++) {
                                    if ((Statics.field2072[var225][var227][var226] & var221) != 0) {
                                        int var228 = var226;
                                        int var229 = var226;
                                        int var230 = var225;
                                        int var231 = var225;
                                        while (var228 > 0 && (Statics.field2072[var225][var227][var228 - 1] & var221) != 0) {
                                            var228--;
                                        }
                                        while (var229 < 104 && (Statics.field2072[var225][var227][var229 + 1] & var221) != 0) {
                                            var229++;
                                        }
                                        label822: while (var230 > 0) {
                                            for (int var232 = var228; var232 <= var229; var232++) {
                                                if ((Statics.field2072[var230 - 1][var227][var232] & var221) == 0) {
                                                    break label822;
                                                }
                                            }
                                            var230--;
                                        }
                                        label811: while (var231 < var224) {
                                            for (int var233 = var228; var233 <= var229; var233++) {
                                                if ((Statics.field2072[var231 + 1][var227][var233] & var221) == 0) {
                                                    break label811;
                                                }
                                            }
                                            var231++;
                                        }
                                        int var234 = (var231 + 1 - var230) * (var229 - var228 + 1);
                                        if (var234 >= 8) {
                                            short var235 = 240;
                                            int var236 = class9.field134[var231][var227][var228] - var235;
                                            int var237 = class9.field134[var230][var227][var228];
                                            class95.method1890(var224, 1, var227 * 128, var227 * 128, var228 * 128, var229 * 128 + 128, var236, var237);
                                            for (int var238 = var230; var238 <= var231; var238++) {
                                                for (int var239 = var228; var239 <= var229; var239++) {
                                                    Statics.field2072[var238][var227][var239] &= ~var221;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2072[var225][var227][var226] & var222) != 0) {
                                        int var240 = var227;
                                        int var241 = var227;
                                        int var242 = var225;
                                        int var243 = var225;
                                        while (var240 > 0 && (Statics.field2072[var225][var240 - 1][var226] & var222) != 0) {
                                            var240--;
                                        }
                                        while (var241 < 104 && (Statics.field2072[var225][var241 + 1][var226] & var222) != 0) {
                                            var241++;
                                        }
                                        label875: while (var242 > 0) {
                                            for (int var244 = var240; var244 <= var241; var244++) {
                                                if ((Statics.field2072[var242 - 1][var244][var226] & var222) == 0) {
                                                    break label875;
                                                }
                                            }
                                            var242--;
                                        }
                                        label864: while (var243 < var224) {
                                            for (int var245 = var240; var245 <= var241; var245++) {
                                                if ((Statics.field2072[var243 + 1][var245][var226] & var222) == 0) {
                                                    break label864;
                                                }
                                            }
                                            var243++;
                                        }
                                        int var246 = (var243 + 1 - var242) * (var241 - var240 + 1);
                                        if (var246 >= 8) {
                                            short var247 = 240;
                                            int var248 = class9.field134[var243][var240][var226] - var247;
                                            int var249 = class9.field134[var242][var240][var226];
                                            class95.method1890(var224, 2, var240 * 128, var241 * 128 + 128, var226 * 128, var226 * 128, var248, var249);
                                            for (int var250 = var242; var250 <= var243; var250++) {
                                                for (int var251 = var240; var251 <= var241; var251++) {
                                                    Statics.field2072[var250][var251][var226] &= ~var222;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2072[var225][var227][var226] & var223) != 0) {
                                        int var252 = var227;
                                        int var253 = var227;
                                        int var254 = var226;
                                        int var255 = var226;
                                        while (var254 > 0 && (Statics.field2072[var225][var227][var254 - 1] & var223) != 0) {
                                            var254--;
                                        }
                                        while (var255 < 104 && (Statics.field2072[var225][var227][var255 + 1] & var223) != 0) {
                                            var255++;
                                        }
                                        label928: while (var252 > 0) {
                                            for (int var256 = var254; var256 <= var255; var256++) {
                                                if ((Statics.field2072[var225][var252 - 1][var256] & var223) == 0) {
                                                    break label928;
                                                }
                                            }
                                            var252--;
                                        }
                                        label917: while (var253 < 104) {
                                            for (int var257 = var254; var257 <= var255; var257++) {
                                                if ((Statics.field2072[var225][var253 + 1][var257] & var223) == 0) {
                                                    break label917;
                                                }
                                            }
                                            var253++;
                                        }
                                        if ((var253 - var252 + 1) * (var255 - var254 + 1) >= 4) {
                                            int var258 = class9.field134[var225][var252][var254];
                                            class95.method1890(var224, 4, var252 * 128, var253 * 128 + 128, var254 * 128, var255 * 128 + 128, var258, var258);
                                            for (int var259 = var252; var259 <= var253; var259++) {
                                                for (int var260 = var254; var260 <= var255; var260++) {
                                                    Statics.field2072[var225][var259][var260] &= ~var223;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method222(true);
                    int var261 = class9.field132;
                    if (var261 > Statics.field2104) {
                        var261 = Statics.field2104;
                    }
                    if (var261 < Statics.field2104 - 1) {
                        int var262 = Statics.field2104 - 1;
                    }
                    if (field475) {
                        Statics.field773.method1861(class9.field132);
                    } else {
                        Statics.field773.method1861(0);
                    }
                    for (int var263 = 0; var263 < 104; var263++) {
                        for (int var264 = 0; var264 < 104; var264++) {
                            method27(var263, var264);
                        }
                    }
                    method807();
                    for (class22 var265 = (class22) field493.method3286(); var265 != null; var265 = (class22) field493.method3302()) {
                        if (var265.field348 == -1) {
                            var265.field347 = 0;
                            method2361(var265);
                        } else {
                            var265.method3309();
                        }
                    }
                    class32.field844.method3218();
                    if (Statics.field26 != null) {
                        field594.method2300(213);
                        field594.method2414(1057001181);
                    }
                    if (!field532) {
                        int var266 = (Statics.field1921 - 6) / 8;
                        int var267 = (Statics.field1921 + 6) / 8;
                        int var268 = (Statics.field351 - 6) / 8;
                        int var269 = (Statics.field351 + 6) / 8;
                        for (int var270 = var266 - 1; var270 <= var267 + 1; var270++) {
                            for (int var271 = var268 - 1; var271 <= var269 + 1; var271++) {
                                if (var270 < var266 || var270 > var267 || var271 < var268 || var271 > var269) {
                                    Statics.field501.method2969("m" + var270 + "_" + var271);
                                    Statics.field501.method2969("l" + var270 + "_" + var271);
                                }
                            }
                        }
                    }
                    method126(30);
                    method807();
                    Statics.field139 = (byte[][][]) null;
                    Statics.field284 = (byte[][][]) null;
                    Statics.field737 = (byte[][][]) null;
                    Statics.field123 = (byte[][][]) null;
                    Statics.field2072 = (int[][][]) null;
                    Statics.field55 = (byte[][][]) null;
                    Statics.field124 = (int[][]) null;
                    Statics.field1978 = null;
                    Statics.field2354 = null;
                    Statics.field1761 = null;
                    Statics.field81 = null;
                    Statics.field1463 = null;
                    field594.method2300(124);
                    Statics.field1262.method1362();
                    for (int var272 = 0; var272 < 32; var272++) {
                        field1313[var272] = 0L;
                    }
                    for (int var273 = 0; var273 < 32; var273++) {
                        field1322[var273] = 0L;
                    }
                    Statics.field1299 = 0;
                } else {
                    field506 = 2;
                }
            } else {
                field506 = 1;
            }
        }
        if (field477 == 30) {
            method887();
        } else if (field477 == 40 || field477 == 45) {
            method128();
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method320() {
        boolean var1 = class139.method244();
        if (var1 && field708 && Statics.field1651 != null) {
            Statics.field1651.method1177();
        }
        if (field1326) {
            Canvas var2 = Statics.field1408;
            var2.removeKeyListener(class75.field1381);
            var2.removeFocusListener(class75.field1381);
            class75.field1364 = -1;
            Statics.method1(Statics.field1408);
            if (Statics.field1175 != null) {
                Statics.field1175.method1377(Statics.field1408);
            }
            this.method1445();
            class75.method142(Statics.field1408);
            Canvas var3 = Statics.field1408;
            var3.addMouseListener(class77.field1392);
            var3.addMouseMotionListener(class77.field1392);
            var3.addFocusListener(class77.field1392);
            if (Statics.field1175 != null) {
                Statics.field1175.method1370(Statics.field1408);
            }
        }
        if (field477 == 0) {
            int var4 = class21.field319;
            String var5 = class21.field320;
            Color var6 = null;
            try {
                Graphics var7 = Statics.field1408.getGraphics();
                if (Statics.field386 == null) {
                    Statics.field386 = new Font("Helvetica", 1, 13);
                    Statics.field1324 = Statics.field1408.getFontMetrics(Statics.field386);
                }
                if (field1314) {
                    field1314 = false;
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, Statics.field770, Statics.field283);
                }
                if (var6 == null) {
                    var6 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1102 == null) {
                        Statics.field1102 = Statics.field1408.createImage(304, 34);
                    }
                    Graphics var8 = Statics.field1102.getGraphics();
                    var8.setColor(var6);
                    var8.drawRect(0, 0, 303, 33);
                    var8.fillRect(2, 2, var4 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(1, 1, 301, 31);
                    var8.fillRect(var4 * 3 + 2, 2, 300 - var4 * 3, 30);
                    var8.setFont(Statics.field386);
                    var8.setColor(Color.white);
                    var8.drawString(var5, (304 - Statics.field1324.stringWidth(var5)) / 2, 22);
                    var7.drawImage(Statics.field1102, Statics.field770 / 2 - 152, Statics.field283 / 2 - 18, (ImageObserver) null);
                } catch (Exception var41) {
                    int var10 = Statics.field770 / 2 - 152;
                    int var11 = Statics.field283 / 2 - 18;
                    var7.setColor(var6);
                    var7.drawRect(var10, var11, 303, 33);
                    var7.fillRect(var10 + 2, var11 + 2, var4 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var7.fillRect(var4 * 3 + var10 + 2, var11 + 2, 300 - var4 * 3, 30);
                    var7.setFont(Statics.field386);
                    var7.setColor(Color.white);
                    var7.drawString(var5, var10 + (304 - Statics.field1324.stringWidth(var5)) / 2, var11 + 22);
                }
            } catch (Exception var42) {
                Statics.field1408.repaint();
            }
        } else if (field477 == 5) {
            class21.method737(Statics.field1305, Statics.field370);
        } else if (field477 == 10) {
            class21.method737(Statics.field1305, Statics.field370);
        } else if (field477 == 20) {
            class21.method737(Statics.field1305, Statics.field370);
        } else if (field477 == 25) {
            if (field506 == 1) {
                if (field526 > field527) {
                    field527 = field526;
                }
                int var13 = (field527 * 50 - field526 * 50) / field527;
                Statics.method129(class135.field2112 + class2.field25 + class2.field19 + var13 + "%" + class2.field20, false);
            } else if (field506 == 2) {
                if (field528 > field529) {
                    field529 = field528;
                }
                int var14 = (field529 * 50 - field528 * 50) / field529 + 50;
                Statics.method129(class135.field2112 + class2.field25 + class2.field19 + var14 + "%" + class2.field20, false);
            } else {
                Statics.method129(class135.field2112, false);
            }
        } else if (field477 == 30) {
            if (field605 != -1) {
                int var15 = field605;
                if (class159.method2879(var15)) {
                    method535(Statics.field1277[var15], -1);
                }
            }
            for (int var16 = 0; var16 < field490; var16++) {
                if (field707[var16]) {
                    field674[var16] = true;
                }
                field704[var16] = field707[var16];
                field707[var16] = false;
            }
            field672 = field479;
            field665 = -1;
            field621 = -1;
            Statics.field1817 = null;
            if (field605 != -1) {
                field490 = 0;
                method3(field605, 0, 0, 765, 503, 0, 0, -1);
            }
            class89.method1785();
            if (field612) {
                method534();
            } else if (field665 != -1) {
                int var17 = field665;
                int var18 = field621;
                if (field613 >= 2 || field624 != 0 || field626) {
                    String var19;
                    if (field624 == 1 && field613 < 2) {
                        var19 = class135.field2269 + class135.field2256 + field625 + " " + class2.field21;
                    } else if (field626 && field613 < 2) {
                        var19 = field628 + class135.field2256 + field629 + " " + class2.field21;
                    } else {
                        var19 = Statics.method1599(field613 - 1);
                    }
                    if (field613 > 2) {
                        var19 = var19 + class2.method202(16777215) + " " + '/' + " " + (field613 - 2) + class135.field2250;
                    }
                    Statics.field1305.method3354(var19, var17 + 4, var18 + 15, 16777215, 0, field479 / 1000);
                }
            }
            if (field680 == 3) {
                for (int var20 = 0; var20 < field490; var20++) {
                    if (field704[var20]) {
                        class89.method1809(field676[var20], field688[var20], field678[var20], field563[var20], 16711935, 128);
                    } else if (field674[var20]) {
                        class89.method1809(field676[var20], field688[var20], field678[var20], field563[var20], 16711680, 128);
                    }
                }
            }
            int var21 = Statics.field2104;
            int var22 = Statics.field2728.field467;
            int var23 = Statics.field2728.field409;
            int var24 = field547;
            for (class7 var25 = (class7) class7.field96.method3286(); var25 != null; var25 = (class7) class7.field96.method3302()) {
                if (var25.field95 != -1 || var25.field99 != null) {
                    int var26 = 0;
                    if (var22 > var25.field92) {
                        var26 += var22 - var25.field92;
                    } else if (var22 < var25.field90) {
                        var26 += var25.field90 - var22;
                    }
                    if (var23 > var25.field93) {
                        var26 += var23 - var25.field93;
                    } else if (var23 < var25.field91) {
                        var26 += var25.field91 - var23;
                    }
                    if (var26 - 64 > var25.field104 || field568 == 0 || var25.field89 != var21) {
                        if (var25.field88 != null) {
                            Statics.field1260.method1115(var25.field88);
                            var25.field88 = null;
                        }
                        if (var25.field101 != null) {
                            Statics.field1260.method1115(var25.field101);
                            var25.field101 = null;
                        }
                    } else {
                        var26 -= 64;
                        if (var26 < 0) {
                            var26 = 0;
                        }
                        int var27 = field568 * (var25.field104 - var26) / var25.field104;
                        class57 var10000;
                        if (var25.field88 != null) {
                            var25.field88.method962(var27);
                        } else if (var25.field95 >= 0) {
                            var10000 = (class57) null;
                            class57 var28 = class57.method1281(Statics.field512, var25.field95, 0);
                            if (var28 != null) {
                                class63 var29 = var28.method1274().method1343(Statics.field27);
                                class45 var30 = class45.method958(var29, 100, var27);
                                var30.method1108(-1);
                                Statics.field1260.method1116(var30);
                                var25.field88 = var30;
                            }
                        }
                        if (var25.field101 != null) {
                            var25.field101.method962(var27);
                            if (!var25.field101.method3310()) {
                                var25.field101 = null;
                            }
                        } else if (var25.field99 != null && (var25.field100 -= var24) <= 0) {
                            int var31 = (int) (Math.random() * (double) var25.field99.length);
                            var10000 = (class57) null;
                            class57 var32 = class57.method1281(Statics.field512, var25.field99[var31], 0);
                            if (var32 != null) {
                                class63 var33 = var32.method1274().method1343(Statics.field27);
                                class45 var34 = class45.method958(var33, 100, var27);
                                var34.method1108(0);
                                Statics.field1260.method1116(var34);
                                var25.field101 = var34;
                                var25.field100 = var25.field102 + (int) (Math.random() * (double) (var25.field98 - var25.field102));
                            }
                        }
                    }
                }
            }
            field547 = 0;
        } else if (field477 == 40) {
            Statics.method129(class135.field2175 + class2.field25 + class135.field2114, false);
        } else if (field477 == 45) {
            Statics.method129(class135.field2158, false);
        }
        if (field477 == 30 && field680 == 0 && !field1314) {
            try {
                Graphics var35 = Statics.field1408.getGraphics();
                for (int var36 = 0; var36 < field490; var36++) {
                    if (field674[var36]) {
                        Statics.field385.method1618(var35, field676[var36], field688[var36], field678[var36], field563[var36]);
                        field674[var36] = false;
                    }
                }
            } catch (Exception var44) {
                Statics.field1408.repaint();
            }
        } else if (field477 > 0) {
            try {
                Graphics var38 = Statics.field1408.getGraphics();
                Statics.field385.method1645(var38, 0, 0);
                field1314 = false;
                for (int var39 = 0; var39 < field490; var39++) {
                    field674[var39] = false;
                }
            } catch (Exception var43) {
                Statics.field1408.repaint();
            }
        }
    }

    @ObfuscatedName("client.h(I)V")
    public final void method254() {
        if (Statics.field1252 != null) {
            Statics.field1252.field250 = false;
        }
        Statics.field1252 = null;
        if (Statics.field499 != null) {
            Statics.field499.method1400();
            Statics.field499 = null;
        }
        class75.method116();
        if (class77.field1392 != null) {
            class77 var1 = class77.field1392;
            synchronized (class77.field1392) {
                class77.field1392 = null;
            }
        }
        Statics.field1175 = null;
        if (Statics.field1651 != null) {
            Statics.field1651.method1169();
        }
        if (Statics.field1433 != null) {
            Statics.field1433.method1169();
        }
        if (Statics.field2556 != null) {
            Statics.field2556.method1400();
        }
        Object var3 = class158.field2596;
        synchronized (class158.field2596) {
            if (class158.field2598 != 0) {
                class158.field2598 = 1;
                try {
                    class158.field2596.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class82.method805();
    }

    @ObfuscatedName("t.b(II)V")
    public static void method126(int arg0) {
        if (field477 == arg0) {
            return;
        }
        if (field477 == 0) {
            class73.method1373();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field698 = 0;
            field505 = 0;
            field641 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field407 != null) {
            Statics.field407.method1400();
            Statics.field407 = null;
        }
        if (field477 == 25) {
            field506 = 0;
            field526 = 0;
            field527 = 1;
            field528 = 0;
            field529 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1408;
            class155 var2 = Statics.field502;
            class155 var3 = Statics.field1623;
            if (!Statics.field2032) {
                class89.method1790();
                byte[] var4 = var2.method3001("title.jpg", "");
                Statics.field335 = new class86(var4, var1);
                Statics.field307 = Statics.field335.method1735();
                Statics.field334 = class84.method896(var3, "logo", "");
                Statics.field332 = class84.method896(var3, "titlebox", "");
                Statics.field305 = class84.method896(var3, "titlebutton", "");
                Statics.field2586 = class84.method2181(var3, "runes", "");
                Statics.field1799 = class84.method2181(var3, "title_mute", "");
                Statics.field2748 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field2748[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field2748[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field2748[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field2748[var8 + 192] = 16777215;
                }
                Statics.field360 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field360[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field360[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field360[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field360[var12 + 192] = 16777215;
                }
                Statics.field1464 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field1464[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field1464[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field1464[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field1464[var16 + 192] = 16777215;
                }
                Statics.field299 = new int[256];
                Statics.field1986 = new int[32768];
                Statics.field1224 = new int[32768];
                class21.method877((class87) null);
                Statics.field897 = new int[32768];
                Statics.field308 = new int[32768];
                class21.field312 = 0;
                class21.field325 = "";
                class21.field326 = "";
                class21.field329 = false;
                if (Statics.field271.field188) {
                    class139.method2206(2);
                } else {
                    class139.method885(2, Statics.field94, "scape main", "", 255, false);
                }
                class154.method2878(false);
                Statics.field2032 = true;
                Statics.field335.method1690(0, 0);
                Statics.field307.method1690(382, 0);
                Statics.field334.method1771(382 - Statics.field334.field1489 / 2, 18);
            }
        } else if (Statics.field2032) {
            Statics.field332 = null;
            Statics.field305 = null;
            Statics.field2586 = null;
            Statics.field335 = null;
            Statics.field307 = null;
            Statics.field334 = null;
            Statics.field1799 = null;
            Statics.field1980 = null;
            Statics.field70 = null;
            Statics.field84 = null;
            Statics.field107 = null;
            Statics.field266 = null;
            Statics.field2748 = null;
            Statics.field360 = null;
            Statics.field1464 = null;
            Statics.field299 = null;
            Statics.field1986 = null;
            Statics.field1224 = null;
            Statics.field897 = null;
            Statics.field308 = null;
            class139.method2206(2);
            class154.method2878(true);
            Statics.field2032 = false;
        }
        field477 = arg0;
    }

    @ObfuscatedName("client.r(I)V")
    public void method255() {
        if (field477 == 1000) {
            return;
        }
        long var1 = class121.method533();
        int var3 = (int) (var1 - Statics.field2554);
        Statics.field2554 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class154.field2553 += var3;
        boolean var4;
        if (class154.field2563 == 0 && class154.field2565 == 0 && class154.field2566 == 0 && class154.field2562 == 0) {
            var4 = true;
        } else if (Statics.field2556 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class154.field2553 > 30000) {
                        throw new IOException();
                    }
                    while (class154.field2565 < 20 && class154.field2562 > 0) {
                        class156 var5 = (class156) class154.field2555.method3262();
                        class127 var6 = new class127(4);
                        var6.method2411(1);
                        var6.method2413((int) var5.field2830);
                        Statics.field2556.method1403(var6.field2042, 0, 4);
                        class154.field2557.method3261(var5, var5.field2830);
                        class154.field2562--;
                        class154.field2565++;
                    }
                    while (class154.field2563 < 20 && class154.field2566 > 0) {
                        class156 var7 = (class156) class154.field2559.method3229();
                        class127 var8 = new class127(4);
                        var8.method2411(0);
                        var8.method2413((int) var7.field2830);
                        Statics.field2556.method1403(var8.field2042, 0, 4);
                        var7.method3255();
                        class154.field2573.method3261(var7, var7.field2830);
                        class154.field2566--;
                        class154.field2563++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2556.method1399();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class154.field2553 = 0;
                        byte var11 = 0;
                        if (Statics.field2564 == null) {
                            var11 = 8;
                        } else if (class154.field2558 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class154.field2567.field2039;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2556.method1416(class154.field2567.field2042, class154.field2567.field2039, var12);
                            if (class154.field2569 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class154.field2567.field2042[class154.field2567.field2039 + var13] ^= class154.field2569;
                                }
                            }
                            class154.field2567.field2039 += var12;
                            if (class154.field2567.field2039 < var11) {
                                break;
                            }
                            if (Statics.field2564 == null) {
                                class154.field2567.field2039 = 0;
                                int var14 = class154.field2567.method2534();
                                int var15 = class154.field2567.method2427();
                                int var16 = class154.field2567.method2534();
                                int var17 = class154.field2567.method2430();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class154.field2557.method3260(var18);
                                Statics.field174 = true;
                                if (var20 == null) {
                                    var20 = (class156) class154.field2573.method3260(var18);
                                    Statics.field174 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2564 = var20;
                                Statics.field1297 = new class127(var17 + var21 + Statics.field2564.field2589);
                                Statics.field1297.method2411(var16);
                                Statics.field1297.method2414(var17);
                                class154.field2558 = 8;
                                class154.field2567.field2039 = 0;
                            } else if (class154.field2558 == 0) {
                                if (class154.field2567.field2042[0] == -1) {
                                    class154.field2558 = 1;
                                    class154.field2567.field2039 = 0;
                                } else {
                                    Statics.field2564 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1297.field2042.length - Statics.field2564.field2589;
                            int var23 = 512 - class154.field2558;
                            if (var23 > var22 - Statics.field1297.field2039) {
                                var23 = var22 - Statics.field1297.field2039;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2556.method1416(Statics.field1297.field2042, Statics.field1297.field2039, var23);
                            if (class154.field2569 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1297.field2042[Statics.field1297.field2039 + var24] ^= class154.field2569;
                                }
                            }
                            Statics.field1297.field2039 += var23;
                            class154.field2558 += var23;
                            if (Statics.field1297.field2039 == var22) {
                                if (Statics.field2564.field2830 == 16711935L) {
                                    Statics.field260 = Statics.field1297;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class155 var26 = class154.field2568[var25];
                                        if (var26 != null) {
                                            Statics.field260.field2039 = var25 * 8 + 5;
                                            int var27 = Statics.field260.method2430();
                                            int var28 = Statics.field260.method2430();
                                            var26.method3051(var27, var28);
                                        }
                                    }
                                } else {
                                    class154.field2560.reset();
                                    class154.field2560.update(Statics.field1297.field2042, 0, var22);
                                    int var29 = (int) class154.field2560.getValue();
                                    if (Statics.field2564.field2590 != var29) {
                                        try {
                                            Statics.field2556.method1400();
                                        } catch (Exception var35) {
                                        }
                                        class154.field2570++;
                                        Statics.field2556 = null;
                                        class154.field2569 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class154.field2570 = 0;
                                    class154.field2571 = 0;
                                    Statics.field2564.field2587.method3057((int) (Statics.field2564.field2830 & 0xFFFFL), Statics.field1297.field2042, (Statics.field2564.field2830 & 0xFF0000L) == 16711680L, Statics.field174);
                                }
                                Statics.field2564.method3309();
                                if (Statics.field174) {
                                    class154.field2565--;
                                } else {
                                    class154.field2563--;
                                }
                                class154.field2558 = 0;
                                Statics.field2564 = null;
                                Statics.field1297 = null;
                            } else {
                                if (class154.field2558 != 512) {
                                    break;
                                }
                                class154.field2558 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2556.method1400();
                } catch (Exception var34) {
                }
                class154.field2571++;
                Statics.field2556 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method256();
        }
    }

    @ObfuscatedName("client.t(I)V")
    public void method256() {
        if (class154.field2570 >= 4) {
            this.method1447("js5crc");
            field477 = 1000;
            return;
        }
        if (class154.field2571 >= 4) {
            if (field477 <= 5) {
                this.method1447("js5io");
                field477 = 1000;
                return;
            }
            field696 = 3000;
            class154.field2571 = 3;
        }
        if (--field696 + 1 > 0) {
            return;
        }
        try {
            if (field498 == 0) {
                Statics.field172 = Statics.field751.method1509(Statics.field1312, Statics.field1995);
                field498++;
            }
            if (field498 == 1) {
                if (Statics.field172.field1417 == 2) {
                    this.method257(-1);
                    return;
                }
                if (Statics.field172.field1417 == 1) {
                    field498++;
                }
            }
            if (field498 == 2) {
                Statics.field117 = new class70((Socket) Statics.field172.field1419, Statics.field751);
                class127 var1 = new class127(5);
                var1.method2411(15);
                var1.method2414(41);
                Statics.field117.method1403(var1.field2042, 0, 5);
                field498++;
                Statics.field1451 = class121.method533();
            }
            if (field498 == 3) {
                if (field477 <= 5 || Statics.field117.method1399() > 0) {
                    int var2 = Statics.field117.method1401();
                    if (var2 != 0) {
                        this.method257(var2);
                        return;
                    }
                    field498++;
                } else if (class121.method533() - Statics.field1451 > 30000L) {
                    this.method257(-2);
                    return;
                }
            }
            if (field498 == 4) {
                class70 var3 = Statics.field117;
                boolean var4 = field477 > 20;
                if (Statics.field2556 != null) {
                    try {
                        Statics.field2556.method1400();
                    } catch (Exception var14) {
                    }
                    Statics.field2556 = null;
                }
                Statics.field2556 = var3;
                class154.method2878(var4);
                class154.field2567.field2039 = 0;
                Statics.field2564 = null;
                Statics.field1297 = null;
                class154.field2558 = 0;
                while (true) {
                    class156 var6 = (class156) class154.field2557.method3262();
                    if (var6 == null) {
                        while (true) {
                            class156 var7 = (class156) class154.field2573.method3262();
                            if (var7 == null) {
                                if (class154.field2569 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2411(4);
                                        var8.method2411(class154.field2569);
                                        var8.method2424(0);
                                        Statics.field2556.method1403(var8.field2042, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2556.method1400();
                                        } catch (Exception var12) {
                                        }
                                        class154.field2571++;
                                        Statics.field2556 = null;
                                    }
                                }
                                class154.field2553 = 0;
                                Statics.field2554 = class121.method533();
                                Statics.field172 = null;
                                Statics.field117 = null;
                                field498 = 0;
                                field514 = 0;
                                return;
                            }
                            class154.field2559.method3228(var7);
                            class154.field2561.method3261(var7, var7.field2830);
                            class154.field2566++;
                            class154.field2563--;
                        }
                    }
                    class154.field2555.method3261(var6, var6.field2830);
                    class154.field2562++;
                    class154.field2565--;
                }
            }
        } catch (IOException var15) {
            this.method257(-3);
        }
    }

    @ObfuscatedName("client.u(II)V")
    public void method257(int arg0) {
        Statics.field172 = null;
        Statics.field117 = null;
        field498 = 0;
        if (Statics.field1995 == Statics.field1174) {
            Statics.field1995 = Statics.field2010;
        } else {
            Statics.field1995 = Statics.field1174;
        }
        field514++;
        if (field514 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field477 <= 5) {
                this.method1447("js5connect_full");
                field477 = 1000;
            } else {
                field696 = 3000;
            }
        } else if (field514 >= 2 && arg0 == 6) {
            this.method1447("js5connect_outofdate");
            field477 = 1000;
        } else if (field514 >= 4) {
            if (field477 <= 5) {
                this.method1447("js5connect");
                field477 = 1000;
            } else {
                field696 = 3000;
            }
        }
    }

    @ObfuscatedName("co.g(I)V")
    public static void method1647() {
        if (field550 == 0) {
            Statics.field773 = new class95(4, 104, 104, class9.field134);
            for (int var0 = 0; var0 < 4; var0++) {
                field531[var0] = new class130(104, 104);
            }
            Statics.field389 = new class86(512, 512);
            class21.field320 = class135.field2214;
            class21.field319 = 5;
            field550 = 20;
        } else if (field550 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1786[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1919(var1, 500, 800, 512, 334);
            class21.field320 = class135.field2116;
            class21.field319 = 10;
            field550 = 30;
        } else if (field550 == 30) {
            Statics.field85 = method98(0, false, true, true);
            Statics.field2805 = method98(1, false, true, true);
            Statics.field252 = method98(2, true, false, true);
            Statics.field2468 = method98(3, false, true, true);
            Statics.field512 = method98(4, false, true, true);
            Statics.field501 = method98(5, true, true, true);
            Statics.field94 = method98(6, true, true, false);
            Statics.field1981 = method98(7, false, true, true);
            Statics.field1623 = method98(8, false, true, true);
            Statics.field2745 = method98(9, false, true, true);
            Statics.field502 = method98(10, false, true, true);
            Statics.field255 = method98(11, false, true, true);
            Statics.field135 = method98(12, false, true, true);
            Statics.field2534 = method98(13, true, false, true);
            Statics.field346 = method98(14, false, true, false);
            Statics.field186 = method98(15, false, true, true);
            class21.field320 = class135.field2204;
            class21.field319 = 20;
            field550 = 40;
        } else if (field550 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field85.method3049() * 4 / 100;
            int var8 = var7 + Statics.field2805.method3049() * 4 / 100;
            int var9 = var8 + Statics.field252.method3049() * 2 / 100;
            int var10 = var9 + Statics.field2468.method3049() * 2 / 100;
            int var11 = var10 + Statics.field512.method3049() * 6 / 100;
            int var12 = var11 + Statics.field501.method3049() * 4 / 100;
            int var13 = var12 + Statics.field94.method3049() * 2 / 100;
            int var14 = var13 + Statics.field1981.method3049() * 60 / 100;
            int var15 = var14 + Statics.field1623.method3049() * 2 / 100;
            int var16 = var15 + Statics.field2745.method3049() * 2 / 100;
            int var17 = var16 + Statics.field502.method3049() * 2 / 100;
            int var18 = var17 + Statics.field255.method3049() * 2 / 100;
            int var19 = var18 + Statics.field135.method3049() * 2 / 100;
            int var20 = var19 + Statics.field2534.method3049() * 2 / 100;
            int var21 = var20 + Statics.field346.method3049() * 2 / 100;
            int var22 = var21 + Statics.field186.method3049() * 2 / 100;
            if (var22 == 100) {
                class21.field320 = class135.field2119;
                class21.field319 = 30;
                field550 = 45;
            } else {
                if (var22 != 0) {
                    class21.field320 = class135.field2118 + var22 + "%";
                }
                class21.field319 = 30;
            }
        } else if (field550 == 45) {
            class52.method241(22050, !field475, 2);
            class142 var23 = new class142();
            var23.method2728(9, 128);
            Statics.field1651 = class52.method2882(Statics.field751, Statics.field1408, 0, 22050);
            Statics.field1651.method1175(var23);
            class155 var24 = Statics.field186;
            class155 var25 = Statics.field346;
            class155 var26 = Statics.field512;
            Statics.field932 = var24;
            Statics.field2360 = var25;
            Statics.field2367 = var26;
            Statics.field2362 = var23;
            Statics.field1433 = class52.method2882(Statics.field751, Statics.field1408, 1, 2048);
            Statics.field1260 = new class46();
            Statics.field1433.method1175(Statics.field1260);
            Statics.field27 = new class62(22050, Statics.field1097);
            class21.field320 = class135.field2120;
            class21.field319 = 35;
            field550 = 50;
        } else if (field550 == 50) {
            int var27 = 0;
            if (Statics.field370 == null) {
                Statics.field370 = class84.method602(Statics.field1623, Statics.field2534, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field1261 == null) {
                Statics.field1261 = class84.method602(Statics.field1623, Statics.field2534, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field1305 == null) {
                Statics.field1305 = class84.method602(Statics.field1623, Statics.field2534, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field320 = class135.field2121 + var27 * 100 / 3 + "%";
                class21.field319 = 40;
            } else {
                Statics.field732 = new class152(true);
                class21.field320 = class135.field2122;
                class21.field319 = 40;
                field550 = 60;
            }
        } else if (field550 == 60) {
            int var28 = class21.method1554(Statics.field502, Statics.field1623);
            byte var29 = 6;
            if (var28 < var29) {
                class21.field320 = class135.field2247 + var28 * 100 / var29 + "%";
                class21.field319 = 50;
            } else {
                class21.field320 = class135.field2144;
                class21.field319 = 50;
                method126(5);
                field550 = 70;
            }
        } else if (field550 == 70) {
            if (Statics.field252.method2997()) {
                class155 var31 = Statics.field252;
                Statics.field943 = var31;
                class155 var32 = Statics.field252;
                Statics.field868 = var32;
                class36.method532(Statics.field252, Statics.field1981);
                class32.method1437(Statics.field252, Statics.field1981, field475);
                class31.method100(Statics.field252, Statics.field1981);
                class40.method35(Statics.field252, Statics.field1981, field474, Statics.field370);
                class155 var33 = Statics.field252;
                class155 var34 = Statics.field85;
                class155 var35 = Statics.field2805;
                Statics.field898 = var33;
                Statics.field899 = var34;
                Statics.field883 = var35;
                class35.method2401(Statics.field252, Statics.field1981);
                Statics.method147(Statics.field252);
                class155 var36 = Statics.field252;
                Statics.field1038 = var36;
                Statics.field1037 = Statics.field1038.method2962(16);
                class159.method2099(Statics.field2468, Statics.field1981, Statics.field1623, Statics.field2534);
                class155 var37 = Statics.field252;
                Statics.field1021 = var37;
                class39.method1854(Statics.field252);
                class21.field320 = class135.field2246;
                class21.field319 = 60;
                field550 = 80;
            } else {
                class21.field320 = class135.field2125 + Statics.field252.method3064() + "%";
                class21.field319 = 60;
            }
        } else if (field550 == 80) {
            int var38 = 0;
            if (Statics.field1934 == null) {
                class155 var39 = Statics.field1623;
                int var40 = var39.method2967("compass");
                int var41 = var39.method2968(var40, "");
                class86 var42;
                if (class84.method243(var39, var40, var41)) {
                    var42 = Statics.method819();
                } else {
                    var42 = null;
                }
                Statics.field1934 = var42;
            } else {
                var38++;
            }
            if (Statics.field195 == null) {
                class155 var44 = Statics.field1623;
                int var45 = var44.method2967("mapedge");
                int var46 = var44.method2968(var45, "");
                class86 var47;
                if (class84.method243(var44, var45, var46)) {
                    var47 = Statics.method819();
                } else {
                    var47 = null;
                }
                Statics.field195 = var47;
            } else {
                var38++;
            }
            if (Statics.field1437 == null) {
                Statics.field1437 = class84.method2181(Statics.field1623, "mapscene", "");
            } else {
                var38++;
            }
            if (Statics.field247 == null) {
                Statics.field247 = class84.method125(Statics.field1623, "mapfunction", "");
            } else {
                var38++;
            }
            if (Statics.field1460 == null) {
                Statics.field1460 = class84.method125(Statics.field1623, "hitmarks", "");
            } else {
                var38++;
            }
            if (Statics.field2465 == null) {
                Statics.field2465 = class84.method125(Statics.field1623, "headicons_pk", "");
            } else {
                var38++;
            }
            if (Statics.field2487 == null) {
                Statics.field2487 = class84.method125(Statics.field1623, "headicons_prayer", "");
            } else {
                var38++;
            }
            if (Statics.field2062 == null) {
                Statics.field2062 = class84.method125(Statics.field1623, "headicons_hint", "");
            } else {
                var38++;
            }
            if (Statics.field2796 == null) {
                Statics.field2796 = class84.method125(Statics.field1623, "mapmarker", "");
            } else {
                var38++;
            }
            if (Statics.field2077 == null) {
                Statics.field2077 = class84.method125(Statics.field1623, "cross", "");
            } else {
                var38++;
            }
            if (Statics.field1850 == null) {
                Statics.field1850 = class84.method125(Statics.field1623, "mapdots", "");
            } else {
                var38++;
            }
            if (Statics.field1253 == null) {
                Statics.field1253 = class84.method2181(Statics.field1623, "scrollbar", "");
            } else {
                var38++;
            }
            if (Statics.field2485 == null) {
                Statics.field2485 = class84.method2181(Statics.field1623, "mod_icons", "");
            } else {
                var38++;
            }
            if (Statics.field201 == null) {
                Statics.field201 = class84.method896(Statics.field1623, "mapback", "");
            } else {
                var38++;
            }
            if (var38 < 14) {
                class21.field320 = class135.field2127 + var38 * 100 / 14 + "%";
                class21.field319 = 70;
            } else {
                Statics.field2844 = Statics.field2485;
                Statics.field195.method1684();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                for (int var53 = 0; var53 < Statics.field247.length; var53++) {
                    Statics.field247[var53].method1683(var49 + var52, var50 + var52, var51 + var52);
                }
                Statics.field1437[0].method1770(var49 + var52, var50 + var52, var51 + var52);
                Statics.field902 = new int[33];
                Statics.field24 = new int[33];
                Statics.field465 = new int[151];
                Statics.field1989 = new int[151];
                for (int var54 = 0; var54 < 33; var54++) {
                    int var55 = 999;
                    int var56 = 0;
                    for (int var57 = 0; var57 < 34; var57++) {
                        if (Statics.field201.field1492[Statics.field201.field1489 * var54 + var57] == 0) {
                            if (var55 == 999) {
                                var55 = var57;
                            }
                        } else if (var55 != 999) {
                            var56 = var57;
                            break;
                        }
                    }
                    Statics.field902[var54] = var55;
                    Statics.field24[var54] = var56 - var55;
                }
                for (int var58 = 5; var58 < 156; var58++) {
                    int var59 = 999;
                    int var60 = 0;
                    for (int var61 = 25; var61 < 172; var61++) {
                        if (Statics.field201.field1492[Statics.field201.field1489 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                            if (var59 == 999) {
                                var59 = var61;
                            }
                        } else if (var59 != 999) {
                            var60 = var61;
                            break;
                        }
                    }
                    Statics.field465[var58 - 5] = var59 - 25;
                    Statics.field1989[var58 - 5] = var60 - var59;
                }
                class21.field320 = class135.field2128;
                class21.field319 = 70;
                field550 = 90;
            }
        } else if (field550 == 90) {
            if (Statics.field2745.method2997()) {
                class110 var62 = new class110(Statics.field2745, Statics.field1623, 20, 0.8D, field475 ? 64 : 128);
                class104.method2105(var62);
                class104.method2103(0.8D);
                class21.field320 = class135.field2130;
                class21.field319 = 90;
                field550 = 110;
            } else {
                class21.field320 = class135.field2230 + Statics.field2745.method3064() + "%";
                class21.field319 = 90;
            }
        } else if (field550 == 110) {
            Statics.field1252 = new class16();
            Statics.field751.method1512(Statics.field1252, 10);
            class21.field320 = class135.field2131;
            class21.field319 = 94;
            field550 = 120;
        } else if (field550 == 120) {
            if (Statics.field502.method2973("huffman", "")) {
                class120 var63 = new class120(Statics.field502.method3001("huffman", ""));
                class184.method2910(var63);
                class21.field320 = class135.field2308;
                class21.field319 = 96;
                field550 = 130;
            } else {
                class21.field320 = class135.field2132 + "%";
                class21.field319 = 96;
            }
        } else if (field550 == 130) {
            if (!Statics.field2468.method2997()) {
                class21.field320 = class135.field2134 + Statics.field2468.method3064() * 4 / 5 + "%";
                class21.field319 = 100;
            } else if (!Statics.field135.method2997()) {
                class21.field320 = class135.field2134 + (80 + Statics.field135.method3064() / 6) + "%";
                class21.field319 = 100;
            } else if (Statics.field2534.method2997()) {
                class21.field320 = class135.field2140;
                class21.field319 = 100;
                field550 = 140;
            } else {
                class21.field320 = class135.field2134 + (96 + Statics.field2534.method3064() / 20) + "%";
                class21.field319 = 100;
            }
        } else if (field550 == 140) {
            method126(10);
        }
    }

    @ObfuscatedName("l.e(IZZZB)Ler;")
    public static class155 method98(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1431 != null) {
            var4 = new class71(arg0, class82.field1431, Statics.field2428[arg0], 1000000);
        }
        return new class155(var4, Statics.field298, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("u.n(I)V")
    public static final void method128() {
        try {
            if (field698 == 0) {
                if (Statics.field499 != null) {
                    Statics.field499.method1400();
                    Statics.field499 = null;
                }
                Statics.field1440 = null;
                field524 = false;
                field505 = 0;
                field698 = 1;
            }
            if (field698 == 1) {
                if (Statics.field1440 == null) {
                    Statics.field1440 = Statics.field751.method1509(Statics.field1312, Statics.field1995);
                }
                if (Statics.field1440.field1417 == 2) {
                    throw new IOException();
                }
                if (Statics.field1440.field1417 == 1) {
                    Statics.field499 = new class70((Socket) Statics.field1440.field1419, Statics.field751);
                    Statics.field1440 = null;
                    field698 = 2;
                }
            }
            if (field698 == 2) {
                field594.field2039 = 0;
                field594.method2411(14);
                Statics.field499.method1403(field594.field2042, 0, 1);
                field515.field2039 = 0;
                field698 = 3;
            }
            if (field698 == 3) {
                if (Statics.field1651 != null) {
                    Statics.field1651.method1173();
                }
                if (Statics.field1433 != null) {
                    Statics.field1433.method1173();
                }
                int var0 = Statics.field499.method1401();
                if (Statics.field1651 != null) {
                    Statics.field1651.method1173();
                }
                if (Statics.field1433 != null) {
                    Statics.field1433.method1173();
                }
                if (var0 != 0) {
                    method96(var0);
                    return;
                }
                field515.field2039 = 0;
                field698 = 5;
            }
            if (field698 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field594.field2039 = 0;
                field594.method2411(10);
                field594.method2414(var1[0]);
                field594.method2414(var1[1]);
                field594.method2414(var1[2]);
                field594.method2414(var1[3]);
                field594.method2415(0L);
                field594.method2416(class21.field326);
                field594.method2443(class6.field79, class6.field80);
                field500.field2039 = 0;
                if (field477 == 40) {
                    field500.method2411(18);
                } else {
                    field500.method2411(16);
                }
                field500.method2424(0);
                int var2 = field500.field2039;
                field500.method2414(41);
                field500.method2503(field594.field2042, 0, field594.field2039);
                int var3 = field500.field2039;
                field500.method2416(class21.field325);
                field500.method2411(field475 ? 1 : 0);
                class116 var4 = field500;
                byte[] var5 = new byte[24];
                try {
                    class82.field1432.method600(0L);
                    class82.field1432.method566(var5);
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
                var4.method2503(var5, 0, 24);
                class127 var9 = new class127(Statics.field732.method2938());
                Statics.field732.method2939(var9);
                field500.method2503(var9.field2042, 0, var9.field2042.length);
                field500.method2414(Statics.field85.field2545);
                field500.method2414(Statics.field2805.field2545);
                field500.method2414(Statics.field252.field2545);
                field500.method2414(Statics.field2468.field2545);
                field500.method2414(Statics.field512.field2545);
                field500.method2414(Statics.field501.field2545);
                field500.method2414(Statics.field94.field2545);
                field500.method2414(Statics.field1981.field2545);
                field500.method2414(Statics.field1623.field2545);
                field500.method2414(Statics.field2745.field2545);
                field500.method2414(Statics.field502.field2545);
                field500.method2414(Statics.field255.field2545);
                field500.method2414(Statics.field135.field2545);
                field500.method2414(Statics.field2534.field2545);
                field500.method2414(Statics.field346.field2545);
                field500.method2414(Statics.field186.field2545);
                field500.method2441(var1, var3, field500.field2039);
                field500.method2552(field500.field2039 - var2);
                Statics.field499.method1403(field500.field2042, 0, field500.field2039);
                field594.method2293(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field515.method2293(var1);
                field698 = 6;
            }
            if (field698 == 6 && Statics.field499.method1399() > 0) {
                int var11 = Statics.field499.method1401();
                if (var11 == 21 && field477 == 20) {
                    field698 = 7;
                } else if (var11 == 2) {
                    field698 = 9;
                } else if (var11 == 15 && field477 == 40) {
                    Statics.method144();
                    return;
                } else if (var11 == 23 && field641 < 1) {
                    field641++;
                    field698 = 0;
                } else {
                    method96(var11);
                    return;
                }
            }
            if (field698 == 7 && Statics.field499.method1399() > 0) {
                field566 = (Statics.field499.method1401() + 3) * 60;
                field698 = 8;
            }
            if (field698 == 8) {
                field505 = 0;
                class21.method2176(class135.field2136, class135.field2271, field566 / 60 + class135.field2327);
                if (--field566 <= 0) {
                    field698 = 0;
                }
            } else {
                if (field698 == 9 && Statics.field499.method1399() >= 8) {
                    field637 = Statics.field499.method1401();
                    field638 = Statics.field499.method1401() == 1;
                    field596 = Statics.field499.method1401();
                    field596 <<= 0x8;
                    field596 += Statics.field499.method1401();
                    field597 = Statics.field499.method1401();
                    Statics.field499.method1416(field515.field2042, 0, 1);
                    field515.field2039 = 0;
                    field517 = field515.method2302();
                    Statics.field499.method1416(field515.field2042, 0, 2);
                    field515.field2039 = 0;
                    field686 = field515.method2427();
                    if (field597 == 1) {
                        try {
                            class67.method1382(Statics.field469, "zap");
                        } catch (Throwable var16) {
                        }
                    } else {
                        try {
                            class67.method1382(Statics.field469, "unzap");
                        } catch (Throwable var15) {
                        }
                    }
                    field698 = 10;
                }
                if (field698 != 10) {
                    field505++;
                    if (field505 > 2000) {
                        if (field641 < 1) {
                            if (Statics.field1995 == Statics.field1174) {
                                Statics.field1995 = Statics.field2010;
                            } else {
                                Statics.field1995 = Statics.field1174;
                            }
                            field641++;
                            field698 = 0;
                        } else {
                            method96(-3);
                        }
                    }
                } else if (Statics.field499.method1399() >= field686) {
                    field515.field2039 = 0;
                    Statics.field499.method1416(field515.field2042, 0, field686);
                    method122();
                    Statics.field1921 = -1;
                    method2(false);
                    field517 = -1;
                }
            }
        } catch (IOException var18) {
            if (field641 < 1) {
                if (Statics.field1995 == Statics.field1174) {
                    Statics.field1995 = Statics.field2010;
                } else {
                    Statics.field1995 = Statics.field1174;
                }
                field641++;
                field698 = 0;
            } else {
                method96(-2);
            }
        }
    }

    @ObfuscatedName("r.o(I)V")
    public static void method122() {
        field480 = 1L;
        field483 = -1;
        Statics.field1252.field244 = 0;
        Statics.field374 = true;
        field484 = true;
        field695 = -1L;
        class182.method1850();
        field594.field2039 = 0;
        field515.field2039 = 0;
        field517 = -1;
        field521 = -1;
        field504 = -1;
        field660 = -1;
        field518 = 0;
        field486 = 0;
        field520 = 0;
        field657 = 0;
        field613 = 0;
        field612 = false;
        class77.field1391 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field685[var0] = null;
        }
        field570 = 0;
        field624 = 0;
        field626 = false;
        field711 = 0;
        field535 = (int) (Math.random() * 100.0D) - 50;
        field537 = (int) (Math.random() * 110.0D) - 55;
        field539 = (int) (Math.random() * 80.0D) - 40;
        field700 = (int) (Math.random() * 120.0D) - 60;
        field599 = (int) (Math.random() * 30.0D) - 20;
        field555 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field705 = 0;
        field522 = -1;
        field710 = 0;
        field583 = 0;
        field591 = 0;
        field661 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field675[var1] = null;
            field595[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field509[var2] = null;
        }
        Statics.field2728 = field675[2047] = new class3();
        field606.method3275();
        field494.method3275();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field604[var3][var4][var5] = null;
                }
            }
        }
        field493 = new class177();
        field724 = 0;
        field693 = 0;
        field730 = 0;
        for (int var6 = 0; var6 < Statics.field1037; var6++) {
            class42 var7 = (class42) class42.field1031.method3215((long) var6);
            class42 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field1038.method2952(16, var6);
                class42 var10 = new class42();
                if (var9 != null) {
                    var10.method888(new class127(var9));
                }
                class42.field1031.method3225(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null && var8.field1032 == 0) {
                class160.field2730[var6] = 0;
                class160.field2731[var6] = 0;
            }
        }
        for (int var12 = 0; var12 < field664.length; var12++) {
            field664[var12] = -1;
        }
        if (field605 != -1) {
            class159.method171(field605);
        }
        for (class4 var13 = (class4) field631.method3262(); var13 != null; var13 = (class4) field631.method3265()) {
            method560(var13, true);
        }
        field605 = -1;
        field631 = new class175(8);
        field634 = null;
        field612 = false;
        field613 = 0;
        field729.method3165((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var14 = 0; var14 < 8; var14++) {
            field601[var14] = null;
            field671[var14] = false;
        }
        class19.method132();
        field516 = true;
        for (int var15 = 0; var15 < 100; var15++) {
            field707[var15] = true;
        }
        field712 = null;
        Statics.field1983 = 0;
        Statics.field2355 = null;
    }

    @ObfuscatedName("l.f(IS)V")
    public static void method96(int arg0) {
        if (arg0 == -3) {
            class21.method2176(class135.field2139, class135.field2267, class135.field2141);
        } else if (arg0 == -2) {
            class21.method2176(class135.field2288, class135.field2143, class135.field2330);
        } else if (arg0 == -1) {
            class21.method2176(class135.field2145, class135.field2146, class135.field2147);
        } else if (arg0 == 3) {
            class21.method2176(class135.field2148, class135.field2149, class135.field2169);
        } else if (arg0 == 4) {
            class21.method2176(class135.field2151, class135.field2138, class135.field2153);
        } else if (arg0 == 5) {
            class21.method2176(class135.field2154, class135.field2177, class135.field2156);
        } else if (arg0 == 6) {
            class21.method2176(class135.field2254, class135.field2290, class135.field2159);
        } else if (arg0 == 7) {
            class21.method2176(class135.field2160, class135.field2231, class135.field2137);
        } else if (arg0 == 8) {
            class21.method2176(class135.field2163, class135.field2164, class135.field2117);
        } else if (arg0 == 9) {
            class21.method2176(class135.field2124, class135.field2319, class135.field2168);
        } else if (arg0 == 10) {
            class21.method2176(class135.field2105, class135.field2170, class135.field2223);
        } else if (arg0 == 11) {
            class21.method2176(class135.field2172, class135.field2173, class135.field2174);
        } else if (arg0 == 12) {
            class21.method2176(class135.field2301, class135.field2157, class135.field2133);
        } else if (arg0 == 13) {
            class21.method2176(class135.field2178, class135.field2179, class135.field2180);
        } else if (arg0 == 14) {
            class21.method2176(class135.field2181, class135.field2295, class135.field2183);
        } else if (arg0 == 16) {
            class21.method2176(class135.field2309, class135.field2185, class135.field2165);
        } else if (arg0 == 17) {
            class21.method2176(class135.field2187, class135.field2188, class135.field2189);
        } else if (arg0 == 18) {
            class21.method2176(class135.field2307, class135.field2191, class135.field2192);
        } else if (arg0 == 19) {
            class21.method2176(class135.field2193, class135.field2194, class135.field2186);
        } else if (arg0 == 20) {
            class21.method2176(class135.field2196, class135.field2195, class135.field2198);
        } else if (arg0 == 22) {
            class21.method2176(class135.field2199, class135.field2142, class135.field2201);
        } else if (arg0 == 23) {
            class21.method2176(class135.field2202, class135.field2211, class135.field2126);
        } else if (arg0 == 24) {
            class21.method2176(class135.field2331, class135.field2206, class135.field2205);
        } else if (arg0 == 25) {
            class21.method2176(class135.field2208, class135.field2209, class135.field2210);
        } else if (arg0 == 26) {
            class21.method2176(class135.field2226, class135.field2212, class135.field2213);
        } else if (arg0 == 27) {
            class21.method2176(class135.field2229, class135.field2215, class135.field2216);
        } else if (arg0 == 31) {
            class21.method2176(class135.field2306, class135.field2224, class135.field2225);
        } else if (arg0 == 32) {
            class21.method2176(class135.field2287, class135.field2227, class135.field2228);
        } else if (arg0 == 37) {
            class21.method2176(class135.field2296, class135.field2243, class135.field2303);
        } else if (arg0 == 38) {
            class21.method2176(class135.field2203, class135.field2233, class135.field2275);
        } else if (arg0 == 55) {
            class21.method2176(class135.field2235, class135.field2236, class135.field2237);
        } else {
            class21.method2176(class135.field2238, class135.field2219, class135.field2240);
        }
        method126(10);
    }

    @ObfuscatedName("ds.s(I)V")
    public static final void method2177() {
        if (Statics.field499 != null) {
            Statics.field499.method1400();
            Statics.field499 = null;
        }
        method882();
        Statics.field773.method1976();
        for (int var0 = 0; var0 < 4; var0++) {
            field531[var0].method2651();
        }
        System.gc();
        class139.method2206(2);
        field684 = -1;
        field708 = false;
        for (class7 var1 = (class7) class7.field96.method3286(); var1 != null; var1 = (class7) class7.field96.method3302()) {
            if (var1.field88 != null) {
                Statics.field1260.method1115(var1.field88);
                var1.field88 = null;
            }
            if (var1.field101 != null) {
                Statics.field1260.method1115(var1.field101);
                var1.field101 = null;
            }
        }
        class7.field96.method3275();
        method126(10);
    }

    @ObfuscatedName("au.w(I)V")
    public static final void method882() {
        class37.method686();
        class33.method3163();
        class36.field921.method3218();
        class32.field857.method3218();
        class32.field844.method3218();
        class32.field822.method3218();
        class32.field819.method3218();
        class31.method84();
        class40.method103();
        class34.field892.method3218();
        class34.field880.method3218();
        class35.method739();
        class38.field948.method3218();
        class42.field1031.method3218();
        class164.method760();
        class159.method2188();
        ((class110) Statics.field1764).method2190();
        class5.field74.method3218();
        Statics.field85.method2984();
        Statics.field2805.method2984();
        Statics.field2468.method2984();
        Statics.field512.method2984();
        Statics.field501.method2984();
        Statics.field94.method2984();
        Statics.field1981.method2984();
        Statics.field1623.method2984();
        Statics.field2745.method2984();
        Statics.field502.method2984();
        Statics.field255.method2984();
        Statics.field135.method2984();
    }

    @ObfuscatedName("au.x(I)V")
    public static final void method887() {
        if (field486 > 1) {
            field486--;
        }
        if (field520 > 0) {
            field520--;
        }
        if (field524) {
            field524 = false;
            if (field520 > 0) {
                method2177();
            } else {
                method126(40);
                Statics.field407 = Statics.field499;
                Statics.field499 = null;
            }
            return;
        }
        if (!field612) {
            field618[0] = class135.field2329;
            field619[0] = "";
            field616[0] = 1006;
            field613 = 1;
        }
        for (int var0 = 0; var0 < 100 && method1600(); var0++) {
        }
        if (field477 != 30) {
            return;
        }
        class182.method55(field594, 71);
        Object var1 = Statics.field1252.field248;
        synchronized (Statics.field1252.field248) {
            if (!field470) {
                Statics.field1252.field244 = 0;
            } else if (class77.field1402 != 0 || Statics.field1252.field244 >= 40) {
                field594.method2300(144);
                field594.method2411(0);
                int var2 = field594.field2039;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field1252.field244 && field594.field2039 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field1252.field246[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field1252.field243[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field1252.field246[var4] == -1 && Statics.field1252.field243[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field643 != var6 || field482 != var5) {
                        int var8 = var6 - field643;
                        field643 = var6;
                        int var9 = var5 - field482;
                        field482 = var5;
                        if (field483 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field594.method2424((field483 << 12) + (var8 << 6) + var9);
                            field483 = 0;
                        } else if (field483 < 8) {
                            field594.method2413((field483 << 19) + 8388608 + var7);
                            field483 = 0;
                        } else {
                            field594.method2414((field483 << 19) + -1073741824 + var7);
                            field483 = 0;
                        }
                    } else if (field483 < 2047) {
                        field483++;
                    }
                }
                field594.method2422(field594.field2039 - var2);
                if (var3 >= Statics.field1252.field244) {
                    Statics.field1252.field244 = 0;
                } else {
                    Statics.field1252.field244 -= var3;
                    for (int var10 = 0; var10 < Statics.field1252.field244; var10++) {
                        Statics.field1252.field243[var10] = Statics.field1252.field243[var3 + var10];
                        Statics.field1252.field246[var10] = Statics.field1252.field246[var3 + var10];
                    }
                }
            }
        }
        if (class77.field1402 == 1 || !Statics.field752 && class77.field1402 == 4 || class77.field1402 == 2) {
            long var12 = (class77.field1405 - field480 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field480 = class77.field1405 * -1L;
            int var14 = class77.field1407;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class77.field1403;
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
            field594.method2300(135);
            field594.method2414((var17 << 19) + (var18 << 20) + var16);
        }
        if (class75.field1368 > 0) {
            field594.method2300(119);
            field594.method2424(0);
            int var19 = field594.field2039;
            long var20 = class121.method533();
            for (int var22 = 0; var22 < class75.field1368; var22++) {
                long var23 = var20 - field695;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field695 = var20;
                field594.method2411(class75.field1355[var22]);
                field594.method2462((int) var23);
            }
            field594.method2552(field594.field2039 - var19);
        }
        if (field663 > 0) {
            field663--;
        }
        if (class75.field1361[96] || class75.field1361[97] || class75.field1361[98] || class75.field1361[99]) {
            field561 = true;
        }
        if (field561 && field663 <= 0) {
            field663 = 20;
            field561 = false;
            field594.method2300(158);
            field594.method2456(field519);
            field594.method2456(field555);
        }
        if (Statics.field374 && !field484) {
            field484 = true;
            field594.method2300(194);
            field594.method2411(1);
        }
        if (!Statics.field374 && field484) {
            field484 = false;
            field594.method2300(194);
            field594.method2411(0);
        }
        if (field475 && Statics.field2104 != field610) {
            method3071(Statics.field1921, Statics.field351, Statics.field2104, Statics.field2728.field439[0], Statics.field2728.field461[0]);
        } else if (Statics.field2104 != field522) {
            field522 = Statics.field2104;
            int var25 = Statics.field2104;
            int[] var26 = Statics.field389.field1487;
            int var27 = var26.length;
            for (int var28 = 0; var28 < var27; var28++) {
                var26[var28] = 0;
            }
            for (int var29 = 1; var29 < 103; var29++) {
                int var30 = (103 - var29) * 2048 + 24628;
                for (int var31 = 1; var31 < 103; var31++) {
                    if ((class9.field120[var25][var31][var29] & 0x18) == 0) {
                        Statics.field773.method1859(var26, var30, 512, var25, var31, var29);
                    }
                    if (var25 < 3 && (class9.field120[var25 + 1][var31][var29] & 0x8) != 0) {
                        Statics.field773.method1859(var26, var30, 512, var25 + 1, var31, var29);
                    }
                    var30 += 4;
                }
            }
            int var32 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var33 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field389.method1753();
            for (int var34 = 1; var34 < 103; var34++) {
                for (int var35 = 1; var35 < 103; var35++) {
                    if ((class9.field120[var25][var35][var34] & 0x18) == 0) {
                        method38(var25, var35, var34, var32, var33);
                    }
                    if (var25 < 3 && (class9.field120[var25 + 1][var35][var34] & 0x8) != 0) {
                        method38(var25 + 1, var35, var34, var32, var33);
                    }
                }
            }
            field699 = 0;
            for (int var36 = 0; var36 < 104; var36++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    int var38 = Statics.field773.method1889(Statics.field2104, var36, var37);
                    if (var38 != 0) {
                        int var39 = var38 >> 14 & 0x7FFF;
                        int var40 = class32.method14(var39).field842;
                        if (var40 >= 0) {
                            int var41 = var36;
                            int var42 = var37;
                            if (var40 != 22 && var40 != 29 && var40 != 34 && var40 != 36 && var40 != 46 && var40 != 47 && var40 != 48) {
                                int[][] var43 = field531[Statics.field2104].field2052;
                                for (int var44 = 0; var44 < 10; var44++) {
                                    int var45 = (int) (Math.random() * 4.0D);
                                    if (var45 == 0 && var41 > 0 && var41 > var36 - 3 && (var43[var41 - 1][var42] & 0x1240108) == 0) {
                                        var41--;
                                    }
                                    if (var45 == 1 && var41 < 103 && var41 < var36 + 3 && (var43[var41 + 1][var42] & 0x1240180) == 0) {
                                        var41++;
                                    }
                                    if (var45 == 2 && var42 > 0 && var42 > var37 - 3 && (var43[var41][var42 - 1] & 0x1240102) == 0) {
                                        var42--;
                                    }
                                    if (var45 == 3 && var42 < 103 && var42 < var37 + 3 && (var43[var41][var42 + 1] & 0x1240120) == 0) {
                                        var42++;
                                    }
                                }
                            }
                            field581[field699] = Statics.field247[var40];
                            field602[field699] = var41;
                            field701[field699] = var42;
                            field699++;
                        }
                    }
                }
            }
            Statics.field385.method1677();
        }
        if (field477 != 30) {
            return;
        }
        method135();
        method47();
        field518++;
        if (field518 <= 750) {
            method46();
            method39();
            for (int var46 = -1; var46 < field591; var46++) {
                int var47;
                if (var46 == -1) {
                    var47 = 2047;
                } else {
                    var47 = field592[var46];
                }
                class3 var48 = field675[var47];
                if (var48 != null && var48.field460 > 0) {
                    var48.field460--;
                    if (var48.field460 == 0) {
                        var48.field421 = null;
                    }
                }
            }
            for (int var49 = 0; var49 < field661; var49++) {
                int var50 = field607[var49];
                class25 var51 = field509[var50];
                if (var51 != null && var51.field460 > 0) {
                    var51.field460--;
                    if (var51.field460 == 0) {
                        var51.field421 = null;
                    }
                }
            }
            field547++;
            if (field580 != 0) {
                field579 += 20;
                if (field579 >= 400) {
                    field580 = 0;
                }
            }
            if (Statics.field1106 != null) {
                field495++;
                if (field495 >= 15) {
                    method2291(Statics.field1106);
                    Statics.field1106 = null;
                }
            }
            class159 var52 = Statics.field1308;
            class159 var53 = Statics.field53;
            Statics.field1308 = null;
            Statics.field53 = null;
            field645 = null;
            field593 = false;
            field646 = false;
            field692 = 0;
            while (true) {
                class75 var54 = class75.field1381;
                boolean var55;
                synchronized (class75.field1381) {
                    if (class75.field1377 == class75.field1371) {
                        var55 = false;
                    } else {
                        Statics.field1374 = class75.field1369[class75.field1377];
                        Statics.field758 = class75.field1365[class75.field1377];
                        class75.field1377 = class75.field1377 + 1 & 0x7F;
                        var55 = true;
                    }
                }
                if (!var55 || field692 >= 128) {
                    int var59 = field605;
                    if (class159.method2879(var59)) {
                        method1397(Statics.field1277[var59], -1, 0, 0, 765, 503, 0, 0);
                    }
                    field653++;
                    while (true) {
                        class1 var60;
                        class159 var61;
                        class159 var62;
                        do {
                            var60 = (class1) field586.method3279();
                            if (var60 == null) {
                                while (true) {
                                    class1 var63;
                                    class159 var64;
                                    class159 var65;
                                    do {
                                        var63 = (class1) field669.method3279();
                                        if (var63 == null) {
                                            while (true) {
                                                class1 var66;
                                                class159 var67;
                                                class159 var68;
                                                do {
                                                    var66 = (class1) field667.method3279();
                                                    if (var66 == null) {
                                                        method127();
                                                        if (field511 != null) {
                                                            method2291(field511);
                                                            Statics.field1380++;
                                                            if (field593 && field646) {
                                                                int var69 = class77.field1396;
                                                                int var70 = class77.field1397;
                                                                int var71 = var69 - field473;
                                                                int var72 = var70 - field644;
                                                                if (var71 < field647) {
                                                                    var71 = field647;
                                                                }
                                                                if (field511.field2619 + var71 > field647 + field642.field2619) {
                                                                    var71 = field647 + field642.field2619 - field511.field2619;
                                                                }
                                                                if (var72 < field648) {
                                                                    var72 = field648;
                                                                }
                                                                if (field511.field2620 + var72 > field648 + field642.field2620) {
                                                                    var72 = field648 + field642.field2620 - field511.field2620;
                                                                }
                                                                int var73 = var71 - field650;
                                                                int var74 = var72 - field497;
                                                                int var75 = field511.field2673;
                                                                if (Statics.field1380 > field511.field2674 && (var73 > var75 || var73 < -var75 || var74 > var75 || var74 < -var75)) {
                                                                    field652 = true;
                                                                }
                                                                int var76 = field642.field2617 + (var71 - field647);
                                                                int var77 = field642.field2624 + (var72 - field648);
                                                                if (field511.field2690 != null && field652) {
                                                                    class1 var78 = new class1();
                                                                    var78.field3 = field511;
                                                                    var78.field4 = var76;
                                                                    var78.field14 = var77;
                                                                    var78.field9 = field511.field2690;
                                                                    class26.method173(var78);
                                                                }
                                                                if (class77.field1393 == 0) {
                                                                    if (field652) {
                                                                        if (field511.field2713 != null) {
                                                                            class1 var79 = new class1();
                                                                            var79.field3 = field511;
                                                                            var79.field4 = var76;
                                                                            var79.field14 = var77;
                                                                            var79.field8 = field645;
                                                                            var79.field9 = field511.field2713;
                                                                            class26.method173(var79);
                                                                        }
                                                                        if (field645 != null && method83(field511) != null) {
                                                                            field594.method2300(111);
                                                                            field594.method2424(field645.field2611);
                                                                            field594.method2465(field511.field2686);
                                                                            field594.method2456(field511.field2611);
                                                                            field594.method2465(field645.field2686);
                                                                        }
                                                                    } else {
                                                                        label1102: {
                                                                            label805: {
                                                                                if (field611 != 1) {
                                                                                    int var80 = field613 - 1;
                                                                                    boolean var81;
                                                                                    if (var80 < 0) {
                                                                                        var81 = false;
                                                                                    } else {
                                                                                        int var82 = field616[var80];
                                                                                        if (var82 >= 2000) {
                                                                                            var82 -= 2000;
                                                                                        }
                                                                                        if (var82 == 1007) {
                                                                                            var81 = true;
                                                                                        } else {
                                                                                            var81 = false;
                                                                                        }
                                                                                    }
                                                                                    if (!var81) {
                                                                                        break label805;
                                                                                    }
                                                                                }
                                                                                if (field613 > 2) {
                                                                                    method875();
                                                                                    break label1102;
                                                                                }
                                                                            }
                                                                            if (field613 > 0) {
                                                                                method2930(field613 - 1);
                                                                            }
                                                                        }
                                                                    }
                                                                    field511 = null;
                                                                }
                                                            } else if (Statics.field1380 > 1) {
                                                                field511 = null;
                                                            }
                                                        }
                                                        if (Statics.field733 != null) {
                                                            method2291(Statics.field733);
                                                            field588++;
                                                            if (class77.field1393 == 0) {
                                                                if (!field587) {
                                                                    label1105: {
                                                                        label791: {
                                                                            if (field611 != 1) {
                                                                                int var91 = field613 - 1;
                                                                                boolean var92;
                                                                                if (var91 < 0) {
                                                                                    var92 = false;
                                                                                } else {
                                                                                    int var93 = field616[var91];
                                                                                    if (var93 >= 2000) {
                                                                                        var93 -= 2000;
                                                                                    }
                                                                                    if (var93 == 1007) {
                                                                                        var92 = true;
                                                                                    } else {
                                                                                        var92 = false;
                                                                                    }
                                                                                }
                                                                                if (!var92) {
                                                                                    break label791;
                                                                                }
                                                                            }
                                                                            if (field613 > 2) {
                                                                                method875();
                                                                                break label1105;
                                                                            }
                                                                        }
                                                                        if (field613 > 0) {
                                                                            method2930(field613 - 1);
                                                                        }
                                                                    }
                                                                } else if (Statics.field733 == Statics.field1817 && field687 != field549) {
                                                                    class159 var83 = Statics.field733;
                                                                    byte var84 = 0;
                                                                    if (field633 == 1 && var83.field2679 == 206) {
                                                                        var84 = 1;
                                                                    }
                                                                    if (var83.field2614[field687] <= 0) {
                                                                        var84 = 0;
                                                                    }
                                                                    int var85 = method1436(var83);
                                                                    boolean var86 = (var85 >> 29 & 0x1) != 0;
                                                                    if (var86) {
                                                                        int var87 = field549;
                                                                        int var88 = field687;
                                                                        var83.field2614[var88] = var83.field2614[var87];
                                                                        var83.field2715[var88] = var83.field2715[var87];
                                                                        var83.field2614[var87] = -1;
                                                                        var83.field2715[var87] = 0;
                                                                    } else if (var84 == 1) {
                                                                        int var89 = field549;
                                                                        int var90 = field687;
                                                                        while (var89 != var90) {
                                                                            if (var89 > var90) {
                                                                                var83.method3090(var89 - 1, var89);
                                                                                var89--;
                                                                            } else if (var89 < var90) {
                                                                                var83.method3090(var89 + 1, var89);
                                                                                var89++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var83.method3090(field687, field549);
                                                                    }
                                                                    field594.method2300(190);
                                                                    field594.method2454(field687);
                                                                    field594.method2465(Statics.field733.field2686);
                                                                    field594.method2492(var84);
                                                                    field594.method2424(field549);
                                                                }
                                                                field495 = 10;
                                                                class77.field1402 = 0;
                                                                Statics.field733 = null;
                                                            } else if (field588 >= 5 && (class77.field1396 > field584 + 5 || class77.field1396 < field584 - 5 || class77.field1397 > field585 + 5 || class77.field1397 < field585 - 5)) {
                                                                field587 = true;
                                                            }
                                                        }
                                                        if (class95.field1557 != -1) {
                                                            int var94 = class95.field1557;
                                                            int var95 = class95.field1594;
                                                            field594.method2300(244);
                                                            field594.method2411(5);
                                                            field594.method2454(Statics.field1822 + var95);
                                                            field594.method2585(class75.field1361[82] ? (class75.field1361[81] ? 2 : 1) : 0);
                                                            field594.method2456(Statics.field920 + var94);
                                                            class95.field1557 = -1;
                                                            field577 = class77.field1403;
                                                            field544 = class77.field1407;
                                                            field580 = 1;
                                                            field579 = 0;
                                                            field710 = var94;
                                                            field583 = var95;
                                                        }
                                                        if (Statics.field1308 != var52) {
                                                            if (var52 != null) {
                                                                method2291(var52);
                                                            }
                                                            if (Statics.field1308 != null) {
                                                                method2291(Statics.field1308);
                                                            }
                                                        }
                                                        if (Statics.field53 != var53 && field622 == field614) {
                                                            if (var53 != null) {
                                                                method2291(var53);
                                                            }
                                                            if (Statics.field53 != null) {
                                                                method2291(Statics.field53);
                                                            }
                                                        }
                                                        if (Statics.field53 == null) {
                                                            if (field622 > 0) {
                                                                field622--;
                                                            }
                                                        } else if (field622 < field614) {
                                                            field622++;
                                                            if (field622 == field614) {
                                                                method2291(Statics.field53);
                                                            }
                                                        }
                                                        int var96 = field535 + Statics.field2728.field467;
                                                        int var97 = field537 + Statics.field2728.field409;
                                                        if (Statics.field171 - var96 < -500 || Statics.field171 - var96 > 500 || Statics.field896 - var97 < -500 || Statics.field896 - var97 > 500) {
                                                            Statics.field171 = var96;
                                                            Statics.field896 = var97;
                                                        }
                                                        if (Statics.field171 != var96) {
                                                            Statics.field171 += (var96 - Statics.field171) / 16;
                                                        }
                                                        if (Statics.field896 != var97) {
                                                            Statics.field896 += (var97 - Statics.field896) / 16;
                                                        }
                                                        if (class77.field1393 == 4 && Statics.field752) {
                                                            int var98 = class77.field1397 - field559;
                                                            field557 = var98 * 2;
                                                            field559 = var98 == -1 || var98 == 1 ? class77.field1397 : (field559 + class77.field1397) / 2;
                                                            int var99 = field478 - class77.field1396;
                                                            field556 = var99 * 2;
                                                            field478 = var99 == -1 || var99 == 1 ? class77.field1396 : (field478 + class77.field1396) / 2;
                                                        } else {
                                                            if (class75.field1361[96]) {
                                                                field556 += (-24 - field556) / 2;
                                                            } else if (class75.field1361[97]) {
                                                                field556 += (24 - field556) / 2;
                                                            } else {
                                                                field556 /= 2;
                                                            }
                                                            if (class75.field1361[98]) {
                                                                field557 += (12 - field557) / 2;
                                                            } else if (class75.field1361[99]) {
                                                                field557 += (-12 - field557) / 2;
                                                            } else {
                                                                field557 /= 2;
                                                            }
                                                            field559 = class77.field1397;
                                                            field478 = class77.field1396;
                                                        }
                                                        field555 = field556 / 2 + field555 & 0x7FF;
                                                        field519 += field557 / 2;
                                                        if (field519 < 128) {
                                                            field519 = 128;
                                                        }
                                                        if (field519 > 383) {
                                                            field519 = 383;
                                                        }
                                                        int var100 = Statics.field171 >> 7;
                                                        int var101 = Statics.field896 >> 7;
                                                        int var102 = method797(Statics.field171, Statics.field896, Statics.field2104);
                                                        int var103 = 0;
                                                        if (var100 > 3 && var101 > 3 && var100 < 100 && var101 < 100) {
                                                            for (int var104 = var100 - 4; var104 <= var100 + 4; var104++) {
                                                                for (int var105 = var101 - 4; var105 <= var101 + 4; var105++) {
                                                                    int var106 = Statics.field2104;
                                                                    if (var106 < 3 && (class9.field120[1][var104][var105] & 0x2) == 2) {
                                                                        var106++;
                                                                    }
                                                                    int var107 = var102 - class9.field134[var106][var104][var105];
                                                                    if (var107 > var103) {
                                                                        var103 = var107;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var108 = var103 * 192;
                                                        if (var108 > 98048) {
                                                            var108 = 98048;
                                                        }
                                                        if (var108 < 32768) {
                                                            var108 = 32768;
                                                        }
                                                        if (var108 > field558) {
                                                            field558 += (var108 - field558) / 24;
                                                        } else if (var108 < field558) {
                                                            field558 += (var108 - field558) / 80;
                                                        }
                                                        if (field717) {
                                                            method1614();
                                                        }
                                                        for (int var109 = 0; var109 < 5; var109++) {
                                                            int var10002 = field722[var109]++;
                                                        }
                                                        int var110 = ++class77.field1391 - 1;
                                                        int var112 = class75.method164();
                                                        if (var110 > 15000 && var112 > 15000) {
                                                            field520 = 250;
                                                            class77.field1391 = 14500;
                                                            field594.method2300(80);
                                                        }
                                                        field623++;
                                                        if (field623 > 500) {
                                                            field623 = 0;
                                                            int var113 = (int) (Math.random() * 8.0D);
                                                            if ((var113 & 0x1) == 1) {
                                                                field535 += field536;
                                                            }
                                                            if ((var113 & 0x2) == 2) {
                                                                field537 += field538;
                                                            }
                                                            if ((var113 & 0x4) == 4) {
                                                                field539 += field540;
                                                            }
                                                        }
                                                        if (field535 < -50) {
                                                            field536 = 2;
                                                        }
                                                        if (field535 > 50) {
                                                            field536 = -2;
                                                        }
                                                        if (field537 < -55) {
                                                            field538 = 2;
                                                        }
                                                        if (field537 > 55) {
                                                            field538 = -2;
                                                        }
                                                        if (field539 < -40) {
                                                            field540 = 1;
                                                        }
                                                        if (field539 > 40) {
                                                            field540 = -1;
                                                        }
                                                        field546++;
                                                        if (field546 > 500) {
                                                            field546 = 0;
                                                            int var114 = (int) (Math.random() * 8.0D);
                                                            if ((var114 & 0x1) == 1) {
                                                                field700 += field543;
                                                            }
                                                            if ((var114 & 0x2) == 2) {
                                                                field599 += field545;
                                                            }
                                                        }
                                                        if (field700 < -60) {
                                                            field543 = 2;
                                                        }
                                                        if (field700 > 60) {
                                                            field543 = -2;
                                                        }
                                                        if (field599 < -20) {
                                                            field545 = 1;
                                                        }
                                                        if (field599 > 10) {
                                                            field545 = -1;
                                                        }
                                                        for (class28 var115 = (class28) field726.method3251(); var115 != null; var115 = (class28) field726.method3245()) {
                                                            if ((long) var115.field734 < class121.method533() / 1000L - 5L) {
                                                                if (var115.field736 > 0) {
                                                                    method2666(5, "", var115.field735 + class135.field2299);
                                                                }
                                                                if (var115.field736 == 0) {
                                                                    method2666(5, "", var115.field735 + class135.field2291);
                                                                }
                                                                var115.method3305();
                                                            }
                                                        }
                                                        field481++;
                                                        if (field481 > 50) {
                                                            field594.method2300(43);
                                                        }
                                                        try {
                                                            if (Statics.field499 != null && field594.field2039 > 0) {
                                                                Statics.field499.method1403(field594.field2042, 0, field594.field2039);
                                                                field594.field2039 = 0;
                                                                field481 = 0;
                                                            }
                                                        } catch (IOException var118) {
                                                            if (field520 > 0) {
                                                                method2177();
                                                            } else {
                                                                method126(40);
                                                                Statics.field407 = Statics.field499;
                                                                Statics.field499 = null;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    var67 = var66.field3;
                                                    if (var67.field2611 < 0) {
                                                        break;
                                                    }
                                                    var68 = class159.method145(var67.field2670);
                                                } while (var68 == null || var68.field2718 == null || var67.field2611 >= var68.field2718.length || var68.field2718[var67.field2611] != var67);
                                                class26.method173(var66);
                                            }
                                        }
                                        var64 = var63.field3;
                                        if (var64.field2611 < 0) {
                                            break;
                                        }
                                        var65 = class159.method145(var64.field2670);
                                    } while (var65 == null || var65.field2718 == null || var64.field2611 >= var65.field2718.length || var65.field2718[var64.field2611] != var64);
                                    class26.method173(var63);
                                }
                            }
                            var61 = var60.field3;
                            if (var61.field2611 < 0) {
                                break;
                            }
                            var62 = class159.method145(var61.field2670);
                        } while (var62 == null || var62.field2718 == null || var61.field2611 >= var62.field2718.length || var62.field2718[var61.field2611] != var61);
                        class26.method173(var60);
                    }
                }
                if (field637 >= 2 && class75.field1361[82] && Statics.field1374 == 66) {
                    String var57 = "";
                    for (int var58 = 0; var58 < field570 && var58 < 100; var58++) {
                        var57 = var57 + field683[var58] + ':' + field685[var58] + '\n';
                    }
                    Statics.field422.setContents(new StringSelection(var57), (ClipboardOwner) null);
                } else {
                    field694[field692] = Statics.field1374;
                    field668[field692] = Statics.field758;
                    field692++;
                }
            }
        } else if (field520 > 0) {
            method2177();
        } else {
            method126(40);
            Statics.field407 = Statics.field499;
            Statics.field499 = null;
        }
    }

    @ObfuscatedName("aa.j(B)V")
    public static final void method807() {
        if (Statics.field1433 != null) {
            Statics.field1433.method1168();
        }
        if (Statics.field1651 != null) {
            Statics.field1651.method1168();
        }
    }

    @ObfuscatedName("v.i(I)V")
    public static final void method47() {
        for (int var0 = 0; var0 < field711; var0++) {
            int var10002 = field542[var0]--;
            if (field542[var0] >= -10) {
                class57 var2 = field507[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1281(Statics.field512, field590[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field542[var0] += var2.method1275();
                    field507[var0] = var2;
                }
                if (field542[var0] < 0) {
                    int var9;
                    if (field715[var0] == 0) {
                        var9 = field709;
                    } else {
                        int var3 = (field715[var0] & 0xFF) * 128;
                        int var4 = field715[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2728.field467;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field715[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2728.field409;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field542[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field568 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1274().method1343(Statics.field27);
                        class45 var11 = class45.method958(var10, 100, var9);
                        var11.method1108(field713[var0] - 1);
                        Statics.field1260.method1116(var11);
                    }
                    field542[var0] = -100;
                }
            } else {
                field711--;
                for (int var1 = var0; var1 < field711; var1++) {
                    field590[var1] = field590[var1 + 1];
                    field507[var1] = field507[var1 + 1];
                    field713[var1] = field713[var1 + 1];
                    field542[var1] = field542[var1 + 1];
                    field715[var1] = field715[var1 + 1];
                }
                var0--;
            }
        }
        if (!field708) {
            return;
        }
        boolean var12;
        if (class139.field2363 == 0) {
            var12 = Statics.field2362.method2732();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field706 != 0 && field684 != -1) {
                class139.method2160(Statics.field94, field684, 0, field706, false);
            }
            field708 = false;
        }
    }

    @ObfuscatedName("aj.ap(Lak;IIII)V")
    public static void method876(class34 arg0, int arg1, int arg2, int arg3) {
        if (field711 >= 50 || field568 == 0 || arg0.field884 == null || arg1 >= arg0.field884.length) {
            return;
        }
        int var4 = arg0.field884[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field590[field711] = var5;
        field713[field711] = var6;
        field542[field711] = 0;
        field507[field711] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field715[field711] = (var8 << 16) + (var9 << 8) + var7;
        field711++;
    }

    @ObfuscatedName("ev.am(IS)V")
    public static void method2669(int arg0) {
        if (arg0 == -1 && !field708) {
            Statics.field2362.method2707();
            class139.field2363 = 1;
            Statics.field2364 = null;
        } else if (arg0 != -1 && field684 != arg0 && field706 != 0 && !field708) {
            class139.method458(2, Statics.field94, arg0, 0, field706, false);
        }
        field684 = arg0;
    }

    @ObfuscatedName("bf.ao(Ljava/lang/String;I)V")
    public static final void method1255(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field271.field183 = !Statics.field271.field183;
            class29 var1 = null;
            try {
                var1 = class82.method1339("", Statics.field2028.field2097, true);
                class127 var2 = Statics.field271.method105();
                var1.method550(var2.field2042, 0, var2.field2039);
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method539();
                }
            } catch (Exception var5) {
            }
            if (Statics.field271.field183) {
                method2666(0, "", "Roofs are now all hidden");
            } else {
                method2666(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field637 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field485 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field485 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field520 > 0) {
                    method2177();
                } else {
                    method126(40);
                    Statics.field407 = Statics.field499;
                    Statics.field499 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field508 == 2) {
                throw new RuntimeException();
            }
        }
        field594.method2300(83);
        field594.method2411(arg0.length() + 1);
        field594.method2416(arg0);
    }

    @ObfuscatedName("ch.af(I)V")
    public static final void method1614() {
        int var0 = Statics.field316 * 128 + 64;
        int var1 = Statics.field2767 * 128 + 64;
        int var2 = method797(var0, var1, Statics.field2104) - Statics.field1249;
        if (Statics.field384 < var0) {
            Statics.field384 += Statics.field1752 * (var0 - Statics.field384) / 1000 + Statics.field1436;
            if (Statics.field384 > var0) {
                Statics.field384 = var0;
            }
        }
        if (Statics.field384 > var0) {
            Statics.field384 -= Statics.field1752 * (Statics.field384 - var0) / 1000 + Statics.field1436;
            if (Statics.field384 < var0) {
                Statics.field384 = var0;
            }
        }
        if (Statics.field2493 < var2) {
            Statics.field2493 += Statics.field1752 * (var2 - Statics.field2493) / 1000 + Statics.field1436;
            if (Statics.field2493 > var2) {
                Statics.field2493 = var2;
            }
        }
        if (Statics.field2493 > var2) {
            Statics.field2493 -= Statics.field1752 * (Statics.field2493 - var2) / 1000 + Statics.field1436;
            if (Statics.field2493 < var2) {
                Statics.field2493 = var2;
            }
        }
        if (Statics.field1385 < var1) {
            Statics.field1385 += Statics.field1752 * (var1 - Statics.field1385) / 1000 + Statics.field1436;
            if (Statics.field1385 > var1) {
                Statics.field1385 = var1;
            }
        }
        if (Statics.field1385 > var1) {
            Statics.field1385 -= Statics.field1752 * (Statics.field1385 - var1) / 1000 + Statics.field1436;
            if (Statics.field1385 < var1) {
                Statics.field1385 = var1;
            }
        }
        int var3 = Statics.field234 * 128 + 64;
        int var4 = Statics.field2486 * 128 + 64;
        int var5 = method797(var3, var4, Statics.field2104) - Statics.field2499;
        int var6 = var3 - Statics.field384;
        int var7 = var5 - Statics.field2493;
        int var8 = var4 - Statics.field1385;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field417 < var10) {
            Statics.field417 += Statics.field112 * (var10 - Statics.field417) / 1000 + Statics.field140;
            if (Statics.field417 > var10) {
                Statics.field417 = var10;
            }
        }
        if (Statics.field417 > var10) {
            Statics.field417 -= Statics.field112 * (Statics.field417 - var10) / 1000 + Statics.field140;
            if (Statics.field417 < var10) {
                Statics.field417 = var10;
            }
        }
        int var12 = var11 - Statics.field87;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field87 += Statics.field112 * var12 / 1000 + Statics.field140;
            Statics.field87 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field87 -= Statics.field112 * -var12 / 1000 + Statics.field140;
            Statics.field87 &= 0x7FF;
        }
        int var13 = var11 - Statics.field87;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field87 = var11;
        }
    }

    @ObfuscatedName("v.ae(I)V")
    public static final void method46() {
        for (int var0 = -1; var0 < field591; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field592[var0];
            }
            class3 var2 = field675[var1];
            if (var2 != null) {
                method50(var2, 1);
            }
        }
    }

    @ObfuscatedName("k.az(B)V")
    public static final void method39() {
        for (int var0 = 0; var0 < field661; var0++) {
            int var1 = field607[var0];
            class25 var2 = field509[var1];
            if (var2 != null) {
                method50(var2, var2.field387.field781);
            }
        }
    }

    @ObfuscatedName("y.al(Lap;II)V")
    public static final void method50(class27 arg0, int arg1) {
        if (arg0.field451 > field479) {
            method214(arg0);
        } else if (arg0.field458 >= field479) {
            method2025(arg0);
        } else {
            arg0.field452 = arg0.field432;
            if (arg0.field459 == 0) {
                arg0.field424 = 0;
            } else {
                label315: {
                    if (arg0.field437 != -1 && arg0.field440 == 0) {
                        class34 var2 = class34.method2178(arg0.field437);
                        if (arg0.field464 > 0 && var2.field877 == 0) {
                            arg0.field424++;
                            break label315;
                        }
                        if (arg0.field464 <= 0 && var2.field893 == 0) {
                            arg0.field424++;
                            break label315;
                        }
                    }
                    int var3 = arg0.field467;
                    int var4 = arg0.field409;
                    int var5 = arg0.field439[arg0.field459 - 1] * 128 + arg0.field463 * 64;
                    int var6 = arg0.field461[arg0.field459 - 1] * 128 + arg0.field463 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field456 = 1280;
                            } else if (var4 > var6) {
                                arg0.field456 = 1792;
                            } else {
                                arg0.field456 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field456 = 768;
                            } else if (var4 > var6) {
                                arg0.field456 = 256;
                            } else {
                                arg0.field456 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field456 = 1024;
                        } else if (var4 > var6) {
                            arg0.field456 = 0;
                        }
                        int var7 = arg0.field456 - arg0.field410 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field447;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field457;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field419;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field436;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field457;
                        }
                        arg0.field452 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class25) {
                            var10 = ((class25) arg0).field387.field778;
                        }
                        if (var10) {
                            if (arg0.field456 != arg0.field410 && arg0.field431 == -1 && arg0.field416 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field459 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field459 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field424 > 0 && arg0.field459 > 1) {
                                var9 = 8;
                                arg0.field424--;
                            }
                        } else {
                            if (arg0.field459 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field459 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field424 > 0 && arg0.field459 > 1) {
                                var9 = 8;
                                arg0.field424--;
                            }
                        }
                        if (arg0.field462[arg0.field459 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field457 == arg0.field452 && arg0.field420 != -1) {
                            arg0.field452 = arg0.field420;
                        }
                        if (var3 < var5) {
                            arg0.field467 += var9;
                            if (arg0.field467 > var5) {
                                arg0.field467 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field467 -= var9;
                            if (arg0.field467 < var5) {
                                arg0.field467 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field409 += var9;
                            if (arg0.field409 > var6) {
                                arg0.field409 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field409 -= var9;
                            if (arg0.field409 < var6) {
                                arg0.field409 = var6;
                            }
                        }
                        if (arg0.field467 == var5 && arg0.field409 == var6) {
                            arg0.field459--;
                            if (arg0.field464 > 0) {
                                arg0.field464--;
                            }
                        }
                    } else {
                        arg0.field467 = var5;
                        arg0.field409 = var6;
                    }
                }
            }
        }
        if (arg0.field467 < 128 || arg0.field409 < 128 || arg0.field467 >= 13184 || arg0.field409 >= 13184) {
            arg0.field437 = -1;
            arg0.field442 = -1;
            arg0.field451 = 0;
            arg0.field458 = 0;
            arg0.field467 = arg0.field439[0] * 128 + arg0.field463 * 64;
            arg0.field409 = arg0.field461[0] * 128 + arg0.field463 * 64;
            arg0.method246();
        }
        if (Statics.field2728 == arg0 && (arg0.field467 < 1536 || arg0.field409 < 1536 || arg0.field467 >= 11776 || arg0.field409 >= 11776)) {
            arg0.field437 = -1;
            arg0.field442 = -1;
            arg0.field451 = 0;
            arg0.field458 = 0;
            arg0.field467 = arg0.field439[0] * 128 + arg0.field463 * 64;
            arg0.field409 = arg0.field461[0] * 128 + arg0.field463 * 64;
            arg0.method246();
        }
        if (arg0.field416 != 0) {
            if (arg0.field431 != -1 && arg0.field431 < 32768) {
                class25 var11 = field509[arg0.field431];
                if (var11 != null) {
                    int var12 = arg0.field467 - var11.field467;
                    int var13 = arg0.field409 - var11.field409;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field456 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field431 >= 32768) {
                int var14 = arg0.field431 - 32768;
                if (field596 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field675[var14];
                if (var15 != null) {
                    int var16 = arg0.field467 - var15.field467;
                    int var17 = arg0.field409 - var15.field409;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field456 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field448 != 0 || arg0.field433 != 0) && (arg0.field459 == 0 || arg0.field424 > 0)) {
                int var18 = arg0.field467 - (arg0.field448 * 64 - Statics.field920 * 64 - Statics.field920 * 64);
                int var19 = arg0.field409 - (arg0.field433 * 64 - Statics.field1822 * 64 - Statics.field1822 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field456 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field448 = 0;
                arg0.field433 = 0;
            }
            int var20 = arg0.field456 - arg0.field410 & 0x7FF;
            if (var20 == 0) {
                arg0.field445 = 0;
            } else {
                arg0.field445++;
                if (var20 > 1024) {
                    arg0.field410 -= arg0.field416;
                    boolean var21 = true;
                    if (var20 < arg0.field416 || var20 > 2048 - arg0.field416) {
                        arg0.field410 = arg0.field456;
                        var21 = false;
                    }
                    if (arg0.field452 == arg0.field432 && (arg0.field445 > 25 || var21)) {
                        if (arg0.field414 == -1) {
                            arg0.field452 = arg0.field457;
                        } else {
                            arg0.field452 = arg0.field414;
                        }
                    }
                } else {
                    arg0.field410 += arg0.field416;
                    boolean var22 = true;
                    if (var20 < arg0.field416 || var20 > 2048 - arg0.field416) {
                        arg0.field410 = arg0.field456;
                        var22 = false;
                    }
                    if (arg0.field452 == arg0.field432 && (arg0.field445 > 25 || var22)) {
                        if (arg0.field415 == -1) {
                            arg0.field452 = arg0.field457;
                        } else {
                            arg0.field452 = arg0.field415;
                        }
                    }
                }
                arg0.field410 &= 0x7FF;
            }
        }
        method175(arg0);
    }

    @ObfuscatedName("j.ak(Lap;I)V")
    public static final void method214(class27 arg0) {
        int var1 = arg0.field451 - field479;
        int var2 = arg0.field463 * 64 + arg0.field454 * 128;
        int var3 = arg0.field463 * 64 + arg0.field449 * 128;
        arg0.field467 += (var2 - arg0.field467) / var1;
        arg0.field409 += (var3 - arg0.field409) / var1;
        arg0.field424 = 0;
        if (arg0.field453 == 0) {
            arg0.field456 = 1024;
        }
        if (arg0.field453 == 1) {
            arg0.field456 = 1536;
        }
        if (arg0.field453 == 2) {
            arg0.field456 = 0;
        }
        if (arg0.field453 == 3) {
            arg0.field456 = 512;
        }
    }

    @ObfuscatedName("ce.ac(Lap;B)V")
    public static final void method2025(class27 arg0) {
        if (field479 == arg0.field458 || arg0.field437 == -1 || arg0.field440 != 0 || arg0.field425 + 1 > class34.method2178(arg0.field437).field889[arg0.field438]) {
            int var1 = arg0.field458 - arg0.field451;
            int var2 = field479 - arg0.field451;
            int var3 = arg0.field463 * 64 + arg0.field454 * 128;
            int var4 = arg0.field463 * 64 + arg0.field449 * 128;
            int var5 = arg0.field463 * 64 + arg0.field408 * 128;
            int var6 = arg0.field463 * 64 + arg0.field450 * 128;
            arg0.field467 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field409 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field424 = 0;
        if (arg0.field453 == 0) {
            arg0.field456 = 1024;
        }
        if (arg0.field453 == 1) {
            arg0.field456 = 1536;
        }
        if (arg0.field453 == 2) {
            arg0.field456 = 0;
        }
        if (arg0.field453 == 3) {
            arg0.field456 = 512;
        }
        arg0.field410 = arg0.field456;
    }

    @ObfuscatedName("a.an(Lap;I)V")
    public static final void method175(class27 arg0) {
        arg0.field411 = false;
        if (arg0.field452 != -1) {
            class34 var1 = class34.method2178(arg0.field452);
            if (var1 == null || var1.field881 == null) {
                arg0.field452 = -1;
            } else {
                arg0.field413++;
                if (arg0.field435 < var1.field881.length && arg0.field413 > var1.field889[arg0.field435]) {
                    arg0.field413 = 1;
                    arg0.field435++;
                    method876(var1, arg0.field435, arg0.field467, arg0.field409);
                }
                if (arg0.field435 >= var1.field881.length) {
                    arg0.field413 = 0;
                    arg0.field435 = 0;
                    method876(var1, arg0.field435, arg0.field467, arg0.field409);
                }
            }
        }
        if (arg0.field442 != -1 && field479 >= arg0.field418) {
            if (arg0.field466 < 0) {
                arg0.field466 = 0;
            }
            int var2 = class35.method131(arg0.field442).field906;
            if (var2 == -1) {
                arg0.field442 = -1;
            } else {
                class34 var3 = class34.method2178(var2);
                if (var3 == null || var3.field881 == null) {
                    arg0.field442 = -1;
                } else {
                    arg0.field444++;
                    if (arg0.field466 < var3.field881.length && arg0.field444 > var3.field889[arg0.field466]) {
                        arg0.field444 = 1;
                        arg0.field466++;
                        method876(var3, arg0.field466, arg0.field467, arg0.field409);
                    }
                    if (arg0.field466 >= var3.field881.length && (arg0.field466 < 0 || arg0.field466 >= var3.field881.length)) {
                        arg0.field442 = -1;
                    }
                }
            }
        }
        if (arg0.field437 != -1 && arg0.field440 <= 1) {
            class34 var4 = class34.method2178(arg0.field437);
            if (var4.field877 == 1 && arg0.field464 > 0 && arg0.field451 <= field479 && arg0.field458 < field479) {
                arg0.field440 = 1;
                return;
            }
        }
        if (arg0.field437 != -1 && arg0.field440 == 0) {
            class34 var5 = class34.method2178(arg0.field437);
            if (var5 == null || var5.field881 == null) {
                arg0.field437 = -1;
            } else {
                arg0.field425++;
                if (arg0.field438 < var5.field881.length && arg0.field425 > var5.field889[arg0.field438]) {
                    arg0.field425 = 1;
                    arg0.field438++;
                    method876(var5, arg0.field438, arg0.field467, arg0.field409);
                }
                if (arg0.field438 >= var5.field881.length) {
                    arg0.field438 -= var5.field885;
                    arg0.field441++;
                    if (arg0.field441 >= var5.field891) {
                        arg0.field437 = -1;
                    } else if (arg0.field438 >= 0 && arg0.field438 < var5.field881.length) {
                        method876(var5, arg0.field438, arg0.field467, arg0.field409);
                    } else {
                        arg0.field437 = -1;
                    }
                }
                arg0.field411 = var5.field887;
            }
        }
        if (arg0.field440 > 0) {
            arg0.field440--;
        }
    }

    @ObfuscatedName("dy.ai(Lp;IIB)V")
    public static void method2407(class3 arg0, int arg1, int arg2) {
        if (arg0.field437 == arg1 && arg1 != -1) {
            int var3 = class34.method2178(arg1).field894;
            if (var3 == 1) {
                arg0.field438 = 0;
                arg0.field425 = 0;
                arg0.field440 = arg2;
                arg0.field441 = 0;
            }
            if (var3 == 2) {
                arg0.field441 = 0;
            }
        } else if (arg1 == -1 || arg0.field437 == -1 || class34.method2178(arg1).field888 >= class34.method2178(arg0.field437).field888) {
            arg0.field437 = arg1;
            arg0.field438 = 0;
            arg0.field425 = 0;
            arg0.field440 = arg2;
            arg0.field441 = 0;
            arg0.field464 = arg0.field459;
        }
    }

    @ObfuscatedName("p.ab(IIIII)V")
    public static final void method25(int arg0, int arg1, int arg2, int arg3) {
        class89.method1814(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2122();
        field564++;
        method2179(true);
        method2668(true);
        method2179(false);
        method2668(false);
        for (class10 var4 = (class10) field606.method3286(); var4 != null; var4 = (class10) field606.method3302()) {
            if (Statics.field2104 != var4.field147 || field479 > var4.field149) {
                var4.method3309();
            } else if (field479 >= var4.field163) {
                if (var4.field151 > 0) {
                    class25 var5 = field509[var4.field151 - 1];
                    if (var5 != null && var5.field467 >= 0 && var5.field467 < 13312 && var5.field409 >= 0 && var5.field409 < 13312) {
                        var4.method89(var5.field467, var5.field409, method797(var5.field467, var5.field409, var4.field147) - var4.field146, field479);
                    }
                }
                if (var4.field151 < 0) {
                    int var6 = -var4.field151 - 1;
                    class3 var7;
                    if (field596 == var6) {
                        var7 = Statics.field2728;
                    } else {
                        var7 = field675[var6];
                    }
                    if (var7 != null && var7.field467 >= 0 && var7.field467 < 13312 && var7.field409 >= 0 && var7.field409 < 13312) {
                        var4.method89(var7.field467, var7.field409, method797(var7.field467, var7.field409, var4.field147) - var4.field146, field479);
                    }
                }
                var4.method90(field547);
                Statics.field773.method1871(Statics.field2104, (int) var4.field154, (int) var4.field155, (int) var4.field156, 60, var4, var4.field162, -1, false);
            }
        }
        for (class20 var8 = (class20) field494.method3286(); var8 != null; var8 = (class20) field494.method3302()) {
            if (Statics.field2104 != var8.field289 || var8.field296) {
                var8.method3309();
            } else if (field479 >= var8.field297) {
                var8.method167(field547);
                if (var8.field296) {
                    var8.method3309();
                } else {
                    Statics.field773.method1871(var8.field289, var8.field288, var8.field290, var8.field292, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field717) {
            int var9 = field519;
            if (field558 / 256 > var9) {
                var9 = field558 / 256;
            }
            if (field718[4] && field513[4] + 128 > var9) {
                var9 = field513[4] + 128;
            }
            int var10 = field555 + field539 & 0x7FF;
            int var11 = Statics.field171;
            int var12 = method797(Statics.field2728.field467, Statics.field2728.field409, Statics.field2104) - 50;
            int var13 = Statics.field896;
            int var14 = var9 * 3 + 600;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 2048 - var10 & 0x7FF;
            int var17 = 0;
            int var18 = 0;
            int var19 = var14;
            if (var15 != 0) {
                int var20 = class104.field1786[var15];
                int var21 = class104.field1766[var15];
                int var22 = var18 * var21 - var14 * var20 >> 16;
                var19 = var18 * var20 + var14 * var21 >> 16;
                var18 = var22;
            }
            if (var16 != 0) {
                int var23 = class104.field1786[var16];
                int var24 = class104.field1766[var16];
                int var25 = var17 * var24 + var19 * var23 >> 16;
                var19 = var19 * var24 - var17 * var23 >> 16;
                var17 = var25;
            }
            Statics.field384 = var11 - var17;
            Statics.field2493 = var12 - var18;
            Statics.field1385 = var13 - var19;
            Statics.field417 = var9;
            Statics.field87 = var10;
        }
        int var38;
        if (field717) {
            var38 = Statics.method9();
        } else {
            int var26;
            if (Statics.field271.field183) {
                var26 = Statics.field2104;
            } else {
                int var27 = 3;
                if (Statics.field417 < 310) {
                    int var28 = Statics.field384 >> 7;
                    int var29 = Statics.field1385 >> 7;
                    int var30 = Statics.field2728.field467 >> 7;
                    int var31 = Statics.field2728.field409 >> 7;
                    if ((class9.field120[Statics.field2104][var28][var29] & 0x4) != 0) {
                        var27 = Statics.field2104;
                    }
                    int var32;
                    if (var30 > var28) {
                        var32 = var30 - var28;
                    } else {
                        var32 = var28 - var30;
                    }
                    int var33;
                    if (var31 > var29) {
                        var33 = var31 - var29;
                    } else {
                        var33 = var29 - var31;
                    }
                    if (var32 > var33) {
                        int var34 = var33 * 65536 / var32;
                        int var35 = 32768;
                        while (var28 != var30) {
                            if (var28 < var30) {
                                var28++;
                            } else if (var28 > var30) {
                                var28--;
                            }
                            if ((class9.field120[Statics.field2104][var28][var29] & 0x4) != 0) {
                                var27 = Statics.field2104;
                            }
                            var35 += var34;
                            if (var35 >= 65536) {
                                var35 -= 65536;
                                if (var29 < var31) {
                                    var29++;
                                } else if (var29 > var31) {
                                    var29--;
                                }
                                if ((class9.field120[Statics.field2104][var28][var29] & 0x4) != 0) {
                                    var27 = Statics.field2104;
                                }
                            }
                        }
                    } else {
                        int var36 = var32 * 65536 / var33;
                        int var37 = 32768;
                        while (var29 != var31) {
                            if (var29 < var31) {
                                var29++;
                            } else if (var29 > var31) {
                                var29--;
                            }
                            if ((class9.field120[Statics.field2104][var28][var29] & 0x4) != 0) {
                                var27 = Statics.field2104;
                            }
                            var37 += var36;
                            if (var37 >= 65536) {
                                var37 -= 65536;
                                if (var28 < var30) {
                                    var28++;
                                } else if (var28 > var30) {
                                    var28--;
                                }
                                if ((class9.field120[Statics.field2104][var28][var29] & 0x4) != 0) {
                                    var27 = Statics.field2104;
                                }
                            }
                        }
                    }
                }
                if ((class9.field120[Statics.field2104][Statics.field2728.field467 >> 7][Statics.field2728.field409 >> 7] & 0x4) != 0) {
                    var27 = Statics.field2104;
                }
                var26 = var27;
            }
            var38 = var26;
        }
        int var39 = Statics.field384;
        int var40 = Statics.field2493;
        int var41 = Statics.field1385;
        int var42 = Statics.field417;
        int var43 = Statics.field87;
        for (int var44 = 0; var44 < 5; var44++) {
            if (field718[var44]) {
                int var45 = (int) (Math.random() * (double) (field719[var44] * 2 + 1) - (double) field719[var44] + Math.sin((double) field523[var44] / 100.0D * (double) field722[var44]) * (double) field513[var44]);
                if (var44 == 0) {
                    Statics.field384 += var45;
                }
                if (var44 == 1) {
                    Statics.field2493 += var45;
                }
                if (var44 == 2) {
                    Statics.field1385 += var45;
                }
                if (var44 == 3) {
                    Statics.field87 = Statics.field87 + var45 & 0x7FF;
                }
                if (var44 == 4) {
                    Statics.field417 += var45;
                    if (Statics.field417 < 128) {
                        Statics.field417 = 128;
                    }
                    if (Statics.field417 > 383) {
                        Statics.field417 = 383;
                    }
                }
            }
        }
        int var46 = class77.field1396;
        int var47 = class77.field1397;
        if (class77.field1402 != 0) {
            var46 = class77.field1403;
            var47 = class77.field1407;
        }
        if (var46 >= arg0 && var46 < arg0 + arg2 && var47 >= arg1 && var47 < arg1 + arg3) {
            class112.field1909 = true;
            class112.field1912 = 0;
            class112.field1883 = var46 - arg0;
            class112.field1911 = var47 - arg1;
        } else {
            class112.field1909 = false;
            class112.field1912 = 0;
        }
        method807();
        class89.method1817(arg0, arg1, arg2, arg3, 0);
        method807();
        Statics.field773.method1876(Statics.field384, Statics.field2493, Statics.field1385, Statics.field417, Statics.field87, var38);
        method807();
        Statics.field773.method1874();
        method30(arg0, arg1, arg2, arg3);
        if (field657 == 2) {
            method224((field541 - Statics.field920 << 7) + field677, (field491 - Statics.field1822 << 7) + field533, field492 * 2);
            if (field575 > -1 && field479 % 20 < 10) {
                Statics.field2062[0].method1692(field575 + arg0 - 12, field576 + arg1 - 28);
            }
        }
        ((class110) Statics.field1764).method2194(field547);
        if (field580 == 1) {
            Statics.field2077[field579 / 100].method1692(field577 - 8, field544 - 8);
        }
        if (field580 == 2) {
            Statics.field2077[field579 / 100 + 4].method1692(field577 - 8, field544 - 8);
        }
        Statics.method37();
        if (field485) {
            int var48 = arg0 + 512 - 5;
            int var49 = arg1 + 20;
            Statics.field1261.method3351("Fps:" + field1320, var48, var49, 16776960, -1);
            int var53 = var49 + 15;
            Runtime var50 = Runtime.getRuntime();
            int var51 = (int) ((var50.totalMemory() - var50.freeMemory()) / 1024L);
            int var52 = 16776960;
            if (var51 > 32768 && field475) {
                var52 = 16711680;
            }
            if (var51 > 65536 && !field475) {
                var52 = 16711680;
            }
            Statics.field1261.method3351("Mem:" + var51 + "k", var48, var53, var52, -1);
            var49 = var53 + 15;
        }
        Statics.field384 = var39;
        Statics.field2493 = var40;
        Statics.field1385 = var41;
        Statics.field417 = var42;
        Statics.field87 = var43;
        if (field516 && class154.method1557(true, false) == 0) {
            field516 = false;
        }
        if (field516) {
            class89.method1817(arg0, arg1, arg2, arg3, 0);
            Statics.method129(class135.field2112, false);
        }
    }

    @ObfuscatedName("ds.aj(ZI)V")
    public static final void method2179(boolean arg0) {
        if (Statics.field2728.field467 >> 7 == field710 && Statics.field2728.field409 >> 7 == field583) {
            field710 = 0;
        }
        int var1 = field591;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2728;
                var4 = 33538048;
            } else {
                var3 = field675[field592[var2]];
                var4 = field592[var2] << 14;
            }
            if (var3 != null && var3.method21()) {
                var3.field48 = false;
                if ((field475 && field591 > 50 || field591 > 200) && !arg0 && var3.field452 == var3.field432) {
                    var3.field48 = true;
                }
                int var5 = var3.field467 >> 7;
                int var6 = var3.field409 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field43 == null || field479 < var3.field50 || field479 >= var3.field49) {
                        if ((var3.field467 & 0x7F) == 64 && (var3.field409 & 0x7F) == 64) {
                            if (field564 == field573[var5][var6]) {
                                continue;
                            }
                            field573[var5][var6] = field564;
                        }
                        var3.field37 = method797(var3.field467, var3.field409, Statics.field2104);
                        Statics.field773.method1871(Statics.field2104, var3.field467, var3.field409, var3.field37, 60, var3, var3.field410, var4, var3.field411);
                    } else {
                        var3.field48 = false;
                        var3.field37 = method797(var3.field467, var3.field409, Statics.field2104);
                        Statics.field773.method1860(Statics.field2104, var3.field467, var3.field409, var3.field37, 60, var3, var3.field410, var4, var3.field39, var3.field45, var3.field46, var3.field47);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eb.au(ZB)V")
    public static final void method2668(boolean arg0) {
        for (int var1 = 0; var1 < field661; var1++) {
            class25 var2 = field509[field607[var1]];
            int var3 = (field607[var1] << 14) + 536870912;
            if (var2 != null && var2.method21() && var2.field387.field775 == arg0 && var2.field387.method612()) {
                int var4 = var2.field467 >> 7;
                int var5 = var2.field409 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field463 == 1 && (var2.field467 & 0x7F) == 64 && (var2.field409 & 0x7F) == 64) {
                        if (field564 == field573[var4][var5]) {
                            continue;
                        }
                        field573[var4][var5] = field564;
                    }
                    if (!var2.field387.field808) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field773.method1871(Statics.field2104, var2.field467, var2.field409, method797(var2.field467 + (var2.field463 * 64 - 64), var2.field409 + (var2.field463 * 64 - 64), Statics.field2104), var2.field463 * 64 - 64 + 60, var2, var2.field410, var3, var2.field411);
                }
            }
        }
    }

    @ObfuscatedName("z.ad(IIIII)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3) {
        field716 = 0;
        for (int var4 = -1; var4 < field661 + field591; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field2728;
            } else if (var4 < field591) {
                var5 = field675[field592[var4]];
            } else {
                var5 = field509[field607[var4 - field591]];
            }
            if (var5 != null && var5.method21()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field387;
                    if (var6.field805 != null) {
                        var6 = var6.method611();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field591) {
                    class31 var9 = ((class25) var5).field387;
                    if (var9.field805 != null) {
                        var9 = var9.method611();
                    }
                    if (var9.field803 >= 0 && var9.field803 < Statics.field2487.length) {
                        Statics.method121(var5, var5.field455 + 15);
                        if (field575 > -1) {
                            Statics.field2487[var9.field803].method1692(field575 + arg0 - 12, field576 + arg1 - 30);
                        }
                    }
                    if (field657 == 1 && field525 == field607[var4 - field591] && field479 % 20 < 10) {
                        Statics.method121(var5, var5.field455 + 15);
                        if (field575 > -1) {
                            Statics.field2062[0].method1692(field575 + arg0 - 12, field576 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field33 != -1 || var8.field44 != -1) {
                        Statics.method121(var5, var5.field455 + 15);
                        if (field575 > -1) {
                            if (var8.field33 != -1) {
                                Statics.field2465[var8.field33].method1692(field575 + arg0 - 12, field576 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field44 != -1) {
                                Statics.field2487[var8.field44].method1692(field575 + arg0 - 12, field576 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field657 == 10 && field489 == field592[var4]) {
                        Statics.method121(var5, var5.field455 + 15);
                        if (field575 > -1) {
                            Statics.field2062[1].method1692(field575 + arg0 - 12, field576 + arg1 - var7);
                        }
                    }
                }
                if (var5.field421 != null && (var4 >= field591 || field731 == 0 || field731 == 3 || field731 == 1 && method166(((class3) var5).field36))) {
                    Statics.method121(var5, var5.field455);
                    if (field575 > -1 && field716 < field720) {
                        field496[field716] = Statics.field1305.method3345(var5.field421) / 2;
                        field567[field716] = Statics.field1305.field2850;
                        field565[field716] = field575;
                        field488[field716] = field576;
                        field569[field716] = var5.field443;
                        field553[field716] = var5.field412;
                        field723[field716] = var5.field460;
                        field572[field716] = var5.field421;
                        field716++;
                    }
                }
                if (var5.field428 > field479) {
                    Statics.method121(var5, var5.field455 + 15);
                    if (field575 > -1) {
                        int var10 = var5.field429 * 30 / var5.field430;
                        if (var10 > 30) {
                            var10 = 30;
                        } else if (var10 == 0 && var5.field429 > 0) {
                            var10 = 1;
                        }
                        class89.method1817(field575 + arg0 - 15, field576 + arg1 - 3, var10, 5, 65280);
                        class89.method1817(field575 + arg0 - 15 + var10, field576 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field434[var11] > field479) {
                        Statics.method121(var5, var5.field455 / 2);
                        if (field575 > -1) {
                            if (var11 == 1) {
                                field576 -= 20;
                            }
                            if (var11 == 2) {
                                field575 -= 15;
                                field576 -= 10;
                            }
                            if (var11 == 3) {
                                field575 += 15;
                                field576 -= 10;
                            }
                            Statics.field1460[var5.field426[var11]].method1692(field575 + arg0 - 12, field576 + arg1 - 12);
                            Statics.field370.method3384(Integer.toString(var5.field423[var11]), field575 + arg0 - 1, field576 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field716; var12++) {
            int var13 = field565[var12];
            int var14 = field488[var12];
            int var15 = field496[var12];
            int var16 = field567[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field488[var18] - field567[var18] && var14 - var16 < field488[var18] + 2 && var13 - var15 < field565[var18] + field496[var18] && var13 + var15 > field565[var18] - field496[var18] && field488[var18] - field567[var18] < var14) {
                        var14 = field488[var18] - field567[var18];
                        var17 = true;
                    }
                }
            }
            field575 = field565[var12];
            field576 = field488[var12] = var14;
            String var19 = field572[var12];
            if (field632 == 0) {
                int var20 = 16776960;
                if (field569[var12] < 6) {
                    var20 = field630[field569[var12]];
                }
                if (field569[var12] == 6) {
                    var20 = field564 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field569[var12] == 7) {
                    var20 = field564 % 20 < 10 ? 255 : 65535;
                }
                if (field569[var12] == 8) {
                    var20 = field564 % 20 < 10 ? 45056 : 8454016;
                }
                if (field569[var12] == 9) {
                    int var21 = 150 - field723[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field569[var12] == 10) {
                    int var22 = 150 - field723[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field569[var12] == 11) {
                    int var23 = 150 - field723[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field553[var12] == 0) {
                    Statics.field1305.method3384(var19, field575 + arg0, field576 + arg1, var20, 0);
                }
                if (field553[var12] == 1) {
                    Statics.field1305.method3353(var19, field575 + arg0, field576 + arg1, var20, 0, field564);
                }
                if (field553[var12] == 2) {
                    Statics.field1305.method3362(var19, field575 + arg0, field576 + arg1, var20, 0, field564);
                }
                if (field553[var12] == 3) {
                    Statics.field1305.method3379(var19, field575 + arg0, field576 + arg1, var20, 0, field564, 150 - field723[var12]);
                }
                if (field553[var12] == 4) {
                    int var24 = (150 - field723[var12]) * (Statics.field1305.method3345(var19) + 100) / 150;
                    class89.method1804(field575 + arg0 - 50, arg1, field575 + arg0 + 50, arg1 + arg3);
                    Statics.field1305.method3350(var19, field575 + arg0 + 50 - var24, field576 + arg1, var20, 0);
                    class89.method1814(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field553[var12] == 5) {
                    int var25 = 150 - field723[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1804(arg0, field576 + arg1 - Statics.field1305.field2850 - 1, arg0 + arg2, field576 + arg1 + 5);
                    Statics.field1305.method3384(var19, field575 + arg0, field576 + arg1 + var26, var20, 0);
                    class89.method1814(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1305.method3384(var19, field575 + arg0, field576 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("i.ax(IIII)V")
    public static final void method224(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field575 = -1;
            field576 = -1;
            return;
        }
        int var3 = method797(arg0, arg1, Statics.field2104) - arg2;
        int var4 = arg0 - Statics.field384;
        int var5 = var3 - Statics.field2493;
        int var6 = arg1 - Statics.field1385;
        int var7 = class104.field1786[Statics.field417];
        int var8 = class104.field1766[Statics.field417];
        int var9 = class104.field1786[Statics.field87];
        int var10 = class104.field1766[Statics.field87];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field575 = (var11 << 9) / var15 + 256;
            field576 = (var14 << 9) / var15 + 167;
        } else {
            field575 = -1;
            field576 = -1;
        }
    }

    @ObfuscatedName("ai.ah(IIII)I")
    public static final int method797(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field120[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field134[var5][var3][var4] + class9.field134[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field134[var5][var3][var4 + 1] + class9.field134[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("q.av(ZI)V")
    public static final void method2(boolean arg0) {
        field532 = arg0;
        if (!field532) {
            int var1 = field515.method2458();
            int var2 = field515.method2534();
            int var3 = field515.method2427();
            int var4 = field515.method2459();
            int var5 = (field686 - field515.field2039) / 16;
            Statics.field2424 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field2424[var6][var7] = field515.method2466();
                }
            }
            int var8 = field515.method2457();
            Statics.field265 = new int[var5];
            Statics.field810 = new int[var5];
            Statics.field864 = new int[var5];
            Statics.field391 = new byte[var5][];
            Statics.field1802 = new byte[var5][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field265[var10] = var13;
                        Statics.field810[var10] = Statics.field501.method2967("m" + var11 + "_" + var12);
                        Statics.field864[var10] = Statics.field501.method2967("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method3071(var4, var3, var2, var8, var1);
            return;
        }
        int var14 = field515.method2459();
        int var15 = field515.method2458();
        field515.method2296();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field515.method2297(1);
                    if (var19 == 1) {
                        field510[var16][var17][var18] = field515.method2297(26);
                    } else {
                        field510[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field515.method2298();
        int var20 = (field686 - field515.field2039) / 16;
        Statics.field2424 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field2424[var21][var22] = field515.method2466();
            }
        }
        int var23 = field515.method2458();
        int var24 = field515.method2501();
        int var25 = field515.method2457();
        Statics.field265 = new int[var20];
        Statics.field810 = new int[var20];
        Statics.field864 = new int[var20];
        Statics.field391 = new byte[var20][];
        Statics.field1802 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field510[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field265[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field265[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field810[var26] = Statics.field501.method2967("m" + var35 + "_" + var36);
                            Statics.field864[var26] = Statics.field501.method2967("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method3071(var23, var25, var24, var15, var14);
    }

    @ObfuscatedName("fb.as(IIIIII)V")
    public static final void method3071(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1921 == arg0 && Statics.field351 == arg1 && field610 == arg2 || !field475) {
            return;
        }
        Statics.field1921 = arg0;
        Statics.field351 = arg1;
        field610 = arg2;
        if (!field475) {
            field610 = 0;
        }
        method126(25);
        Statics.method129(class135.field2112, true);
        int var5 = Statics.field920;
        int var6 = Statics.field1822;
        Statics.field920 = (arg0 - 6) * 8;
        Statics.field1822 = (arg1 - 6) * 8;
        int var7 = Statics.field920 - var5;
        int var8 = Statics.field1822 - var6;
        int var9 = Statics.field920;
        int var10 = Statics.field1822;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field509[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field439[var13] -= var7;
                    var12.field461[var13] -= var8;
                }
                var12.field467 -= var7 * 128;
                var12.field409 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field675[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field439[var16] -= var7;
                    var15.field461[var16] -= var8;
                }
                var15.field467 -= var7 * 128;
                var15.field409 -= var8 * 128;
            }
        }
        Statics.field2104 = arg2;
        Statics.field2728.method226(arg3, arg4, false);
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
                        field604[var27][var23][var24] = field604[var27][var25][var26];
                    } else {
                        field604[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field493.method3286(); var28 != null; var28 = (class22) field493.method3302()) {
            var28.field339 -= var7;
            var28.field340 -= var8;
            if (var28.field339 < 0 || var28.field340 < 0 || var28.field339 >= 104 || var28.field340 >= 104) {
                var28.method3309();
            }
        }
        if (field710 != 0) {
            field710 -= var7;
            field583 -= var8;
        }
        field711 = 0;
        field717 = false;
        field522 = -1;
        field494.method3275();
        field606.method3275();
    }

    @ObfuscatedName("i.ay(ZI)V")
    public static final void method222(boolean arg0) {
        method807();
        field481++;
        if (field481 < 50 && !arg0) {
            return;
        }
        field481 = 0;
        if (field524 || Statics.field499 == null) {
            return;
        }
        field594.method2300(43);
        try {
            Statics.field499.method1403(field594.field2042, 0, field594.field2039);
            field594.field2039 = 0;
        } catch (IOException var2) {
            field524 = true;
        }
    }

    @ObfuscatedName("k.aq(IIIIII)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field773.method2016(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field773.method1936(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field389.field1487;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method14(var12);
            if (var13.field829 == -1) {
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
                class87 var14 = Statics.field1437[var13.field829];
                if (var14 != null) {
                    int var15 = (var13.field855 * 4 - var14.field1489) / 2;
                    int var16 = (var13.field830 * 4 - var14.field1494) / 2;
                    var14.method1771(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field830) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field773.method1888(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field773.method1936(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method14(var21);
            if (var22.field829 != -1) {
                class87 var23 = Statics.field1437[var22.field829];
                if (var23 != null) {
                    int var24 = (var22.field855 * 4 - var23.field1489) / 2;
                    int var25 = (var22.field830 * 4 - var23.field1494) / 2;
                    var23.method1771(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field830) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field389.field1487;
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
        int var29 = Statics.field773.method1889(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method14(var30);
        if (var31.field829 == -1) {
            return;
        }
        class87 var32 = Statics.field1437[var31.field829];
        if (var32 != null) {
            int var33 = (var31.field855 * 4 - var32.field1489) / 2;
            int var34 = (var31.field830 * 4 - var32.field1494) / 2;
            var32.method1771(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field830) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ch.aw(B)Z")
    public static final boolean method1600() {
        if (Statics.field499 == null) {
            return false;
        }
        try {
            int var0 = Statics.field499.method1399();
            if (var0 == 0) {
                return false;
            }
            if (field517 == -1) {
                Statics.field499.method1416(field515.field2042, 0, 1);
                field515.field2039 = 0;
                field517 = field515.method2302();
                field686 = class165.field2781[field517];
                var0--;
            }
            if (field686 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field499.method1416(field515.field2042, 0, 1);
                field686 = field515.field2042[0] & 0xFF;
                var0--;
            }
            if (field686 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field499.method1416(field515.field2042, 0, 2);
                field515.field2039 = 0;
                field686 = field515.method2427();
                var0 -= 2;
            }
            if (var0 < field686) {
                return false;
            }
            field515.field2039 = 0;
            Statics.field499.method1416(field515.field2042, 0, field686);
            field518 = 0;
            field660 = field504;
            field504 = field521;
            field521 = field517;
            if (field517 == 160) {
                method240();
                field517 = -1;
                return true;
            }
            if (field517 == 169) {
                field515.field2039 += 28;
                if (field515.method2445()) {
                    class82.method112(field515, field515.field2039 - 28);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 6) {
                int var1 = field515.method2534();
                int var2 = field515.method2534();
                int var3 = field515.method2534();
                int var4 = field515.method2534();
                field718[var1] = true;
                field719[var1] = var2;
                field513[var1] = var3;
                field523[var1] = var4;
                field722[var1] = 0;
                field517 = -1;
                return true;
            }
            if (field517 == 8) {
                field657 = field515.method2534();
                if (field657 == 1) {
                    field525 = field515.method2427();
                }
                if (field657 >= 2 && field657 <= 6) {
                    if (field657 == 2) {
                        field677 = 64;
                        field533 = 64;
                    }
                    if (field657 == 3) {
                        field677 = 0;
                        field533 = 64;
                    }
                    if (field657 == 4) {
                        field677 = 128;
                        field533 = 64;
                    }
                    if (field657 == 5) {
                        field677 = 64;
                        field533 = 0;
                    }
                    if (field657 == 6) {
                        field677 = 64;
                        field533 = 128;
                    }
                    field657 = 2;
                    field541 = field515.method2427();
                    field491 = field515.method2427();
                    field492 = field515.method2534();
                }
                if (field657 == 10) {
                    field489 = field515.method2427();
                }
                field517 = -1;
                return true;
            }
            if (field517 == 145) {
                int var5 = field515.method2427();
                Statics.method2354(var5);
                field656[++field600 - 1 & 0x1F] = var5 & 0x7FFF;
                field517 = -1;
                return true;
            }
            if (field517 == 180) {
                class116 var6 = field515;
                int var7 = field686;
                class181 var8 = new class181();
                var8.field2833 = var6.method2534();
                var8.field2836 = var6.method2430();
                var8.field2834 = new int[var8.field2833];
                var8.field2839 = new int[var8.field2833];
                var8.field2832 = new Field[var8.field2833];
                var8.field2835 = new int[var8.field2833];
                var8.field2838 = new Method[var8.field2833];
                var8.field2837 = new byte[var8.field2833][][];
                for (int var9 = 0; var9 < var8.field2833; var9++) {
                    try {
                        int var10 = var6.method2534();
                        if (var10 == 0 || var10 == 1 || var10 == 2) {
                            String var11 = new String(var6.method2460());
                            String var12 = new String(var6.method2460());
                            int var13 = 0;
                            if (var10 == 1) {
                                var13 = var6.method2430();
                            }
                            var8.field2834[var9] = var10;
                            var8.field2835[var9] = var13;
                            var8.field2832[var9] = class182.method2026(var11).getDeclaredField(var12);
                        } else if (var10 == 3 || var10 == 4) {
                            String var14 = new String(var6.method2460());
                            String var15 = new String(var6.method2460());
                            int var16 = var6.method2534();
                            String[] var17 = new String[var16];
                            for (int var18 = 0; var18 < var16; var18++) {
                                var17[var18] = new String(var6.method2460());
                            }
                            byte[][] var19 = new byte[var16][];
                            if (var10 == 3) {
                                for (int var20 = 0; var20 < var16; var20++) {
                                    int var21 = var6.method2430();
                                    var19[var20] = new byte[var21];
                                    var6.method2532(var19[var20], 0, var21);
                                }
                            }
                            var8.field2834[var9] = var10;
                            Class[] var22 = new Class[var16];
                            for (int var23 = 0; var23 < var16; var23++) {
                                var22[var23] = class182.method2026(var17[var23]);
                            }
                            var8.field2838[var9] = class182.method2026(var14).getDeclaredMethod(var15, var22);
                            var8.field2837[var9] = var19;
                        }
                    } catch (ClassNotFoundException var288) {
                        var8.field2839[var9] = -1;
                    } catch (SecurityException var289) {
                        var8.field2839[var9] = -2;
                    } catch (NullPointerException var290) {
                        var8.field2839[var9] = -3;
                    } catch (Exception var291) {
                        var8.field2839[var9] = -4;
                    } catch (Throwable var292) {
                        var8.field2839[var9] = -5;
                    }
                }
                class182.field2841.method3288(var8);
                field517 = -1;
                return true;
            }
            if (field517 == 36) {
                int var29 = field515.method2427();
                int var30 = field515.method2468();
                class159 var31 = class159.method145(var30);
                if (var31.field2721 != 2 || var31.field2643 != var29) {
                    var31.field2721 = 2;
                    var31.field2643 = var29;
                    method2291(var31);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 254) {
                String var32 = field515.method2460();
                String var33 = class185.method3349(class148.method2100(class184.method165(field515)));
                method2666(6, var32, var33);
                field517 = -1;
                return true;
            }
            if (field517 == 207) {
                field710 = field515.method2534();
                if (field710 == 255) {
                    field710 = 0;
                }
                field583 = field515.method2534();
                if (field583 == 255) {
                    field583 = 0;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 86) {
                int var34 = field515.method2467();
                int var35 = field515.method2457();
                class159 var36 = class159.method145(var34);
                if (var36 != null && var36.field2612 == 0) {
                    if (var35 > var36.field2626 - var36.field2620) {
                        var35 = var36.field2626 - var36.field2620;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var36.field2624 != var35) {
                        var36.field2624 = var35;
                        method2291(var36);
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 255) {
                for (int var37 = 0; var37 < Statics.field1037; var37++) {
                    class42 var38 = (class42) class42.field1031.method3215((long) var37);
                    class42 var39;
                    if (var38 == null) {
                        byte[] var40 = Statics.field1038.method2952(16, var37);
                        class42 var41 = new class42();
                        if (var40 != null) {
                            var41.method888(new class127(var40));
                        }
                        class42.field1031.method3225(var41, (long) var37);
                        var39 = var41;
                    } else {
                        var39 = var38;
                    }
                    if (var39 != null && var39.field1032 == 0) {
                        class160.field2730[var37] = 0;
                        class160.field2731[var37] = 0;
                    }
                }
                method174();
                field655 += 32;
                field517 = -1;
                return true;
            }
            if (field517 == 58) {
                while (field515.field2039 < field686) {
                    int var43 = field515.method2534();
                    boolean var44 = (var43 & 0x1) == 1;
                    String var45 = field515.method2460();
                    String var46 = field515.method2460();
                    field515.method2460();
                    for (int var47 = 0; var47 < field730; var47++) {
                        class11 var48 = field673[var47];
                        if (var44) {
                            if (var46.equals(var48.field178)) {
                                var48.field178 = var45;
                                var48.field170 = var46;
                                var45 = null;
                                break;
                            }
                        } else if (var45.equals(var48.field178)) {
                            var48.field178 = var45;
                            var48.field170 = var46;
                            var45 = null;
                            break;
                        }
                    }
                    if (var45 != null && field730 < 400) {
                        class11 var49 = new class11();
                        field673[field730] = var49;
                        var49.field178 = var45;
                        var49.field170 = var46;
                        field730++;
                    }
                }
                field468 = field653;
                field517 = -1;
                return true;
            }
            if (field517 == 97) {
                int var50 = field515.method2430();
                class4 var51 = (class4) field631.method3260((long) var50);
                if (var51 != null) {
                    method560(var51, true);
                }
                if (field634 != null) {
                    method2291(field634);
                    field634 = null;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 153) {
                Statics.field2030 = field515.method2491();
                Statics.field362 = field515.method2489();
                while (field515.field2039 < field686) {
                    field517 = field515.method2534();
                    method1366();
                }
                field517 = -1;
                return true;
            }
            if (field517 == 112) {
                int var52 = field515.method2466();
                class159 var53 = class159.method145(var52);
                for (int var54 = 0; var54 < var53.field2614.length; var54++) {
                    var53.field2614[var54] = -1;
                    var53.field2614[var54] = 0;
                }
                method2291(var53);
                field517 = -1;
                return true;
            }
            if (field517 == 202) {
                if (field605 != -1) {
                    method43(field605, 0);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 138) {
                field717 = true;
                Statics.field234 = field515.method2534();
                Statics.field2486 = field515.method2534();
                Statics.field2499 = field515.method2427();
                Statics.field140 = field515.method2534();
                Statics.field112 = field515.method2534();
                if (Statics.field112 >= 100) {
                    int var55 = Statics.field234 * 128 + 64;
                    int var56 = Statics.field2486 * 128 + 64;
                    int var57 = method797(var55, var56, Statics.field2104) - Statics.field2499;
                    int var58 = var55 - Statics.field384;
                    int var59 = var57 - Statics.field2493;
                    int var60 = var56 - Statics.field1385;
                    int var61 = (int) Math.sqrt((double) (var58 * var58 + var60 * var60));
                    Statics.field417 = (int) (Math.atan2((double) var59, (double) var61) * 325.949D) & 0x7FF;
                    Statics.field87 = (int) (Math.atan2((double) var58, (double) var60) * -325.949D) & 0x7FF;
                    if (Statics.field417 < 128) {
                        Statics.field417 = 128;
                    }
                    if (Statics.field417 > 383) {
                        Statics.field417 = 383;
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 13) {
                while (field515.field2039 < field686) {
                    boolean var62 = field515.method2534() == 1;
                    String var63 = field515.method2460();
                    String var64 = field515.method2460();
                    int var65 = field515.method2427();
                    int var66 = field515.method2534();
                    int var67 = field515.method2534();
                    boolean var68 = (var67 & 0x2) != 0;
                    boolean var69 = (var67 & 0x1) != 0;
                    if (var65 > 0) {
                        field515.method2460();
                        field515.method2534();
                        field515.method2430();
                    }
                    field515.method2460();
                    for (int var70 = 0; var70 < field693; var70++) {
                        class23 var71 = field702[var70];
                        if (var62) {
                            if (var64.equals(var71.field367)) {
                                var71.field367 = var63;
                                var71.field363 = var64;
                                var63 = null;
                                break;
                            }
                        } else if (var63.equals(var71.field367)) {
                            if (var71.field364 != var65) {
                                boolean var72 = true;
                                for (class28 var73 = (class28) field726.method3251(); var73 != null; var73 = (class28) field726.method3245()) {
                                    if (var73.field735.equals(var63)) {
                                        if (var65 != 0 && var73.field736 == 0) {
                                            var73.method3305();
                                            var72 = false;
                                        } else if (var65 == 0 && var73.field736 != 0) {
                                            var73.method3305();
                                            var72 = false;
                                        }
                                    }
                                }
                                if (var72) {
                                    field726.method3243(new class28(var63, var65));
                                }
                                var71.field364 = var65;
                            }
                            var71.field363 = var64;
                            var71.field368 = var66;
                            var71.field366 = var68;
                            var71.field369 = var69;
                            var63 = null;
                            break;
                        }
                    }
                    if (var63 != null && field693 < 400) {
                        class23 var74 = new class23();
                        field702[field693] = var74;
                        var74.field367 = var63;
                        var74.field363 = var64;
                        var74.field364 = var65;
                        var74.field368 = var66;
                        var74.field366 = var68;
                        var74.field369 = var69;
                        field693++;
                    }
                }
                field724 = 2;
                field468 = field653;
                boolean var75 = false;
                int var76 = field693;
                while (var76 > 0) {
                    boolean var77 = true;
                    var76--;
                    for (int var78 = 0; var78 < var76; var78++) {
                        boolean var79 = false;
                        class23 var80 = field702[var78];
                        class23 var81 = field702[var78 + 1];
                        if (field471 != var80.field364 && field471 == var81.field364) {
                            var79 = true;
                        }
                        if (!var79 && var80.field364 == 0 && var81.field364 != 0) {
                            var79 = true;
                        }
                        if (!var79 && !var80.field366 && var81.field366) {
                            var79 = true;
                        }
                        if (!var79 && !var80.field369 && var81.field369) {
                            var79 = true;
                        }
                        if (var79) {
                            class23 var82 = field702[var78];
                            field702[var78] = field702[var78 + 1];
                            field702[var78 + 1] = var82;
                            var77 = false;
                        }
                    }
                    if (var77) {
                        break;
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 212) {
                byte var83 = field515.method2453();
                int var84 = field515.method2459();
                class160.field2730[var84] = var83;
                if (class160.field2731[var84] != var83) {
                    class160.field2731[var84] = var83;
                    method796(var84);
                }
                field654[++field655 - 1 & 0x1F] = var84;
                field517 = -1;
                return true;
            }
            if (field517 == 134) {
                int var85 = field515.method2427();
                int var86 = field515.method2457();
                int var87 = field515.method2466();
                class159 var88 = class159.method145(var87);
                var88.field2654 = (var86 << 16) + var85;
                field517 = -1;
                return true;
            }
            if (field517 == 89) {
                int var89 = field515.method2430();
                class159 var90 = class159.method145(var89);
                var90.field2721 = 3;
                var90.field2643 = Statics.field2728.field34.method3173();
                method2291(var90);
                field517 = -1;
                return true;
            }
            if (field517 == 115) {
                field731 = field515.method2534();
                field689 = field515.method2534();
                field517 = -1;
                return true;
            }
            if (field517 == 236) {
                field724 = 1;
                field468 = field653;
                field517 = -1;
                return true;
            }
            if (field517 == 68) {
                field717 = false;
                for (int var91 = 0; var91 < 5; var91++) {
                    field718[var91] = false;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 173) {
                int var92 = field515.method2430();
                Statics.field728 = Statics.field751.method1511(var92);
                field517 = -1;
                return true;
            }
            if (field517 == 107) {
                int var93 = field515.method2467();
                int var94 = field515.method2459();
                if (var94 == 65535) {
                    var94 = -1;
                }
                int var95 = field515.method2468();
                int var96 = field515.method2457();
                if (var96 == 65535) {
                    var96 = -1;
                }
                for (int var97 = var96; var97 <= var94; var97++) {
                    long var98 = ((long) var95 << 32) + (long) var97;
                    class179 var100 = field670.method3260(var98);
                    if (var100 != null) {
                        var100.method3309();
                    }
                    field670.method3261(new class171(var93), var98);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 10) {
                int var101 = field515.method2459();
                int var102 = field515.method2468();
                int var103 = var101 >> 10 & 0x1F;
                int var104 = var101 >> 5 & 0x1F;
                int var105 = var101 & 0x1F;
                int var106 = (var105 << 3) + (var103 << 19) + (var104 << 11);
                class159 var107 = class159.method145(var102);
                if (var107.field2627 != var106) {
                    var107.field2627 = var106;
                    method2291(var107);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 1) {
                String var108 = field515.method2460();
                long var109 = field515.method2431();
                long var111 = (long) field515.method2427();
                long var113 = (long) field515.method2429();
                int var115 = field515.method2534();
                long var116 = (var111 << 32) + var113;
                boolean var118 = false;
                for (int var119 = 0; var119 < 100; var119++) {
                    if (field690[var119] == var116) {
                        var118 = true;
                        break;
                    }
                }
                if (var115 <= 1 && method2024(var108)) {
                    var118 = true;
                }
                if (!var118 && field589 == 0) {
                    field690[field691] = var116;
                    field691 = (field691 + 1) % 100;
                    String var120 = class185.method3349(class148.method2100(class184.method165(field515)));
                    if (var115 == 2 || var115 == 3) {
                        method69(9, class2.method200(1) + var108, var120, class147.method245(var109));
                    } else if (var115 == 1) {
                        method69(9, class2.method200(0) + var108, var120, class147.method245(var109));
                    } else {
                        method69(9, var108, var120, class147.method245(var109));
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 197) {
                String var121 = field515.method2460();
                int var122 = field515.method2430();
                class159 var123 = class159.method145(var122);
                if (!var121.equals(var123.field2657)) {
                    var123.field2657 = var121;
                    method2291(var123);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 40) {
                class13 var124 = new class13();
                var124.field192 = field515.method2460();
                var124.field196 = field515.method2427();
                int var125 = field515.method2430();
                var124.field190 = var125;
                method126(45);
                Statics.field499.method1400();
                Statics.field499 = null;
                class21.method806(var124);
                field517 = -1;
                return false;
            }
            if (field517 == 75) {
                boolean var126 = field515.method2534() == 1;
                int var127 = field515.method2430();
                class159 var128 = class159.method145(var127);
                if (var128.field2622 != var126) {
                    var128.field2622 = var126;
                    method2291(var128);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 246) {
                String var129 = field515.method2460();
                int var130 = field515.method2427();
                byte var131 = field515.method2426();
                boolean var132 = false;
                if (var131 == -128) {
                    var132 = true;
                }
                if (var132) {
                    if (Statics.field1983 == 0) {
                        field517 = -1;
                        return true;
                    }
                    boolean var133 = false;
                    int var134;
                    for (var134 = 0; var134 < Statics.field1983 && (!Statics.field2355[var134].field110.equals(var129) || Statics.field2355[var134].field113 != var130); var134++) {
                    }
                    if (var134 < Statics.field1983) {
                        while (var134 < Statics.field1983 - 1) {
                            Statics.field2355[var134] = Statics.field2355[var134 + 1];
                            var134++;
                        }
                        Statics.field1983--;
                        Statics.field2355[Statics.field1983] = null;
                    }
                } else {
                    field515.method2460();
                    class8 var135 = new class8();
                    var135.field110 = var129;
                    var135.field108 = class149.method86(var135.field110, Statics.field242);
                    var135.field113 = var130;
                    var135.field111 = var131;
                    int var136;
                    for (var136 = Statics.field1983 - 1; var136 >= 0; var136--) {
                        int var137 = Statics.field2355[var136].field108.compareTo(var135.field110);
                        if (var137 == 0) {
                            Statics.field2355[var136].field113 = var130;
                            Statics.field2355[var136].field111 = var131;
                            if (var129.equals(Statics.field2728.field36)) {
                                Statics.field357 = var131;
                            }
                            field662 = field653;
                            field517 = -1;
                            return true;
                        }
                        if (var137 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1983 >= Statics.field2355.length) {
                        field517 = -1;
                        return true;
                    }
                    for (int var138 = Statics.field1983 - 1; var138 > var136; var138--) {
                        Statics.field2355[var138 + 1] = Statics.field2355[var138];
                    }
                    if (Statics.field1983 == 0) {
                        Statics.field2355 = new class8[100];
                    }
                    Statics.field2355[var136 + 1] = var135;
                    Statics.field1983++;
                    if (var129.equals(Statics.field2728.field36)) {
                        Statics.field357 = var131;
                    }
                }
                field662 = field653;
                field517 = -1;
                return true;
            }
            if (field517 == 209) {
                field598 = 0;
                field679 = 0;
                field515.method2296();
                int var139 = field515.method2297(8);
                if (var139 < field661) {
                    for (int var140 = var139; var140 < field661; var140++) {
                        field721[++field598 - 1] = field607[var140];
                    }
                }
                if (var139 > field661) {
                    throw new RuntimeException("");
                }
                field661 = 0;
                for (int var141 = 0; var141 < var139; var141++) {
                    int var142 = field607[var141];
                    class25 var143 = field509[var142];
                    int var144 = field515.method2297(1);
                    if (var144 == 0) {
                        field607[++field661 - 1] = var142;
                        var143.field427 = field479;
                    } else {
                        int var145 = field515.method2297(2);
                        if (var145 == 0) {
                            field607[++field661 - 1] = var142;
                            var143.field427 = field479;
                            field562[++field679 - 1] = var142;
                        } else if (var145 == 1) {
                            field607[++field661 - 1] = var142;
                            var143.field427 = field479;
                            int var146 = field515.method2297(3);
                            var143.method227(var146, false);
                            int var147 = field515.method2297(1);
                            if (var147 == 1) {
                                field562[++field679 - 1] = var142;
                            }
                        } else if (var145 == 2) {
                            field607[++field661 - 1] = var142;
                            var143.field427 = field479;
                            int var148 = field515.method2297(3);
                            var143.method227(var148, true);
                            int var149 = field515.method2297(3);
                            var143.method227(var149, true);
                            int var150 = field515.method2297(1);
                            if (var150 == 1) {
                                field562[++field679 - 1] = var142;
                            }
                        } else if (var145 == 3) {
                            field721[++field598 - 1] = var142;
                        }
                    }
                }
                method1597();
                method97();
                for (int var151 = 0; var151 < field598; var151++) {
                    int var152 = field721[var151];
                    if (field479 != field509[var152].field427) {
                        field509[var152].field387 = null;
                        field509[var152] = null;
                    }
                }
                if (field686 != field515.field2039) {
                    throw new RuntimeException(field515.field2039 + class2.field17 + field686);
                }
                for (int var153 = 0; var153 < field661; var153++) {
                    if (field509[field607[var153]] == null) {
                        throw new RuntimeException(var153 + class2.field17 + field661);
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 129) {
                int var154 = field515.method2427();
                if (var154 == 65535) {
                    var154 = -1;
                }
                method2669(var154);
                field517 = -1;
                return true;
            }
            if (field517 == 177) {
                int var155 = field515.method2427();
                if (var155 == 65535) {
                    var155 = -1;
                }
                int var156 = field515.method2463();
                if (field706 != 0 && var155 != -1) {
                    class139.method2160(Statics.field255, var155, 0, field706, false);
                    field708 = true;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 205) {
                int var157 = field515.method2430();
                int var158 = field515.method2458();
                int var159 = field515.method2501();
                class4 var160 = (class4) field631.method3260((long) var157);
                if (var160 != null) {
                    method560(var160, var160.field57 != var158);
                }
                class4 var161 = new class4();
                var161.field57 = var158;
                var161.field52 = var159;
                field631.method3261(var161, (long) var157);
                method1338(var158);
                class26.method4(var158);
                class159 var162 = class159.method145(var157);
                if (var162 != null) {
                    method2291(var162);
                }
                if (field634 != null) {
                    method2291(field634);
                    field634 = null;
                }
                method136();
                if (field605 != -1) {
                    method43(field605, 1);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 122) {
                String var163 = field515.method2460();
                long var164 = (long) field515.method2427();
                long var166 = (long) field515.method2429();
                int var168 = field515.method2534();
                long var169 = (var164 << 32) + var166;
                boolean var171 = false;
                for (int var172 = 0; var172 < 100; var172++) {
                    if (field690[var172] == var169) {
                        var171 = true;
                        break;
                    }
                }
                if (method2024(var163)) {
                    var171 = true;
                }
                if (!var171 && field589 == 0) {
                    field690[field691] = var169;
                    field691 = (field691 + 1) % 100;
                    String var173 = class185.method3349(class148.method2100(class184.method165(field515)));
                    if (var168 == 2 || var168 == 3) {
                        method2666(7, class2.method200(1) + var163, var173);
                    } else if (var168 == 1) {
                        method2666(7, class2.method200(0) + var163, var173);
                    } else {
                        method2666(3, var163, var173);
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 80) {
                method2177();
                field517 = -1;
                return false;
            }
            if (field517 == 32) {
                method174();
                field635 = field515.method2534();
                field487 = field653;
                field517 = -1;
                return true;
            }
            if (field517 == 99) {
                int var174 = field515.method2427();
                field605 = var174;
                method1338(var174);
                class26.method4(field605);
                for (int var175 = 0; var175 < 100; var175++) {
                    field707[var175] = true;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 143) {
                int var176 = field515.method2427();
                int var177 = field515.method2534();
                int var178 = field515.method2427();
                if (field709 != 0 && var177 != 0 && field711 < 50) {
                    field590[field711] = var176;
                    field713[field711] = var177;
                    field542[field711] = var178;
                    field507[field711] = null;
                    field715[field711] = 0;
                    field711++;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 190) {
                int var182 = field515.method2430();
                int var183 = field515.method2427();
                if (var182 < -70000) {
                    var183 += 32768;
                }
                class159 var184;
                if (var182 >= 0) {
                    var184 = class159.method145(var182);
                } else {
                    var184 = null;
                }
                if (var184 != null) {
                    for (int var185 = 0; var185 < var184.field2614.length; var185++) {
                        var184.field2614[var185] = 0;
                        var184.field2715[var185] = 0;
                    }
                }
                class19.method2287(var183);
                int var186 = field515.method2427();
                for (int var187 = 0; var187 < var186; var187++) {
                    int var188 = field515.method2457();
                    int var189 = field515.method2534();
                    if (var189 == 255) {
                        var189 = field515.method2466();
                    }
                    if (var184 != null && var187 < var184.field2614.length) {
                        var184.field2614[var187] = var188;
                        var184.field2715[var187] = var189;
                    }
                    class19.method134(var183, var187, var188 - 1, var189);
                }
                if (var184 != null) {
                    method2291(var184);
                }
                method174();
                field656[++field600 - 1 & 0x1F] = var183 & 0x7FFF;
                field517 = -1;
                return true;
            }
            if (field517 == 2) {
                int var190 = field515.method2427();
                int var191 = field515.method2430();
                int var192 = field515.method2459();
                int var193 = field515.method2458();
                class159 var194 = class159.method145(var191);
                if (var194.field2628 != var190 || var194.field2651 != var192 || var194.field2653 != var193) {
                    var194.field2628 = var190;
                    var194.field2651 = var192;
                    var194.field2653 = var193;
                    method2291(var194);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 62) {
                int var195 = field515.method2467();
                int var196 = field515.method2488();
                class159 var197 = class159.method145(var195);
                if (var197.field2726 != var196 || var196 == -1) {
                    var197.field2726 = var196;
                    var197.field2716 = 0;
                    var197.field2710 = 0;
                    method2291(var197);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 154) {
                method174();
                int var198 = field515.method2501();
                int var199 = field515.method2489();
                int var200 = field515.method2466();
                field649[var199] = var200;
                field608[var199] = var198;
                field609[var199] = 1;
                for (int var201 = 0; var201 < 98; var201++) {
                    if (var200 >= class131.field2070[var201]) {
                        field609[var199] = var201 + 2;
                    }
                }
                field658[++field659 - 1 & 0x1F] = var199;
                field517 = -1;
                return true;
            }
            if (field517 == 69) {
                String var202 = field515.method2460();
                if (var202.endsWith(":tradereq:")) {
                    String var203 = var202.substring(0, var202.indexOf(":"));
                    boolean var204 = false;
                    if (method2024(var203)) {
                        var204 = true;
                    }
                    if (!var204 && field589 == 0) {
                        method2666(4, var203, class135.field2241);
                    }
                } else if (var202.endsWith(":duelreq:")) {
                    String var205 = var202.substring(0, var202.indexOf(":"));
                    boolean var206 = false;
                    if (method2024(var205)) {
                        var206 = true;
                    }
                    if (!var206 && field589 == 0) {
                        method2666(8, var205, class135.field2207);
                    }
                } else if (var202.endsWith(":chalreq:")) {
                    String var207 = var202.substring(0, var202.indexOf(":"));
                    boolean var208 = false;
                    if (method2024(var207)) {
                        var208 = true;
                    }
                    if (!var208 && field589 == 0) {
                        String var209 = var202.substring(var202.indexOf(":") + 1, var202.length() - 9);
                        method2666(8, var207, var209);
                    }
                } else if (var202.endsWith(":assistreq:")) {
                    String var210 = var202.substring(0, var202.indexOf(":"));
                    boolean var211 = false;
                    if (method2024(var210)) {
                        var211 = true;
                    }
                    if (!var211 && field589 == 0) {
                        method2666(10, var210, "");
                    }
                } else if (var202.endsWith(":clan:")) {
                    String var212 = var202.substring(0, var202.indexOf(":clan:"));
                    method2666(11, "", var212);
                } else if (var202.endsWith(":trade:")) {
                    String var213 = var202.substring(0, var202.indexOf(":trade:"));
                    if (field589 == 0) {
                        method2666(12, "", var213);
                    }
                } else if (var202.endsWith(":assist:")) {
                    String var214 = var202.substring(0, var202.indexOf(":assist:"));
                    if (field589 == 0) {
                        method2666(13, "", var214);
                    }
                } else if (var202.endsWith(":broadcast:")) {
                    String var215 = var202.substring(0, var202.indexOf(":broadcast:"));
                    if (field589 == 0) {
                        method2666(14, "", var215);
                    }
                } else {
                    method2666(0, "", var202);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 201) {
                method174();
                field636 = field515.method2452();
                field487 = field653;
                field517 = -1;
                return true;
            }
            if (field517 == 15) {
                for (int var216 = 0; var216 < class160.field2731.length; var216++) {
                    if (class160.field2731[var216] != class160.field2730[var216]) {
                        class160.field2731[var216] = class160.field2730[var216];
                        method796(var216);
                        field654[++field655 - 1 & 0x1F] = var216;
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 61) {
                method2(true);
                field517 = -1;
                return true;
            }
            if (field517 == 120) {
                int var217 = field686 + field515.field2039;
                int var218 = field515.method2427();
                int var219 = field515.method2427();
                if (field605 != var218) {
                    field605 = var218;
                    method1338(field605);
                    class26.method4(field605);
                    for (int var220 = 0; var220 < 100; var220++) {
                        field707[var220] = true;
                    }
                }
                while (var219-- > 0) {
                    int var221 = field515.method2430();
                    int var222 = field515.method2427();
                    int var223 = field515.method2534();
                    class4 var224 = (class4) field631.method3260((long) var221);
                    if (var224 != null && var224.field57 != var222) {
                        method560(var224, true);
                        var224 = null;
                    }
                    if (var224 == null) {
                        class4 var225 = new class4();
                        var225.field57 = var222;
                        var225.field52 = var223;
                        field631.method3261(var225, (long) var221);
                        method1338(var222);
                        class26.method4(var222);
                        class159 var226 = class159.method145(var221);
                        if (var226 != null) {
                            method2291(var226);
                        }
                        if (field634 != null) {
                            method2291(field634);
                            field634 = null;
                        }
                        method136();
                        if (field605 != -1) {
                            method43(field605, 1);
                        }
                        var224 = var225;
                    }
                    var224.field58 = true;
                }
                for (class4 var228 = (class4) field631.method3262(); var228 != null; var228 = (class4) field631.method3265()) {
                    if (var228.field58) {
                        var228.field58 = false;
                    } else {
                        method560(var228, true);
                    }
                }
                field670 = new class175(512);
                while (field515.field2039 < var217) {
                    int var229 = field515.method2430();
                    int var230 = field515.method2427();
                    int var231 = field515.method2427();
                    int var232 = field515.method2430();
                    for (int var233 = var230; var233 <= var231; var233++) {
                        long var234 = ((long) var229 << 32) + (long) var233;
                        field670.method3261(new class171(var232), var234);
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 66) {
                int var236 = field515.method2461();
                int var237 = field515.method2452();
                int var238 = field515.method2430();
                class159 var239 = class159.method145(var238);
                int var240 = var239.field2684 + var237;
                int var241 = var239.field2676 + var236;
                if (var239.field2615 != var240 || var239.field2616 != var241) {
                    var239.field2615 = var240;
                    var239.field2616 = var241;
                    method2291(var239);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 242) {
                String var242 = field515.method2460();
                Object[] var243 = new Object[var242.length() + 1];
                for (int var244 = var242.length() - 1; var244 >= 0; var244--) {
                    if (var242.charAt(var244) == 's') {
                        var243[var244 + 1] = field515.method2460();
                    } else {
                        var243[var244 + 1] = Integer.valueOf(field515.method2430());
                    }
                }
                var243[0] = Integer.valueOf(field515.method2430());
                class1 var245 = new class1();
                var245.field9 = var243;
                class26.method173(var245);
                field517 = -1;
                return true;
            }
            if (field517 == 57) {
                field705 = field515.method2534();
                field517 = -1;
                return true;
            }
            if (field517 == 152 || field517 == 128 || field517 == 224 || field517 == 30 || field517 == 125 || field517 == 176 || field517 == 155 || field517 == 251 || field517 == 146 || field517 == 70 || field517 == 123) {
                method1366();
                field517 = -1;
                return true;
            }
            if (field517 == 118) {
                field662 = field653;
                if (field686 == 0) {
                    field712 = null;
                    field697 = null;
                    Statics.field1983 = 0;
                    Statics.field2355 = null;
                    field517 = -1;
                    return true;
                }
                field697 = field515.method2460();
                long var246 = field515.method2431();
                field712 = Statics.method149(var246);
                Statics.field1258 = field515.method2426();
                int var248 = field515.method2534();
                if (var248 == 255) {
                    field517 = -1;
                    return true;
                }
                Statics.field1983 = var248;
                class8[] var249 = new class8[100];
                for (int var250 = 0; var250 < Statics.field1983; var250++) {
                    var249[var250] = new class8();
                    var249[var250].field110 = field515.method2460();
                    var249[var250].field108 = class149.method86(var249[var250].field110, Statics.field242);
                    var249[var250].field113 = field515.method2427();
                    var249[var250].field111 = field515.method2426();
                    field515.method2460();
                    if (var249[var250].field110.equals(Statics.field2728.field36)) {
                        Statics.field357 = var249[var250].field111;
                    }
                }
                boolean var251 = false;
                int var252 = Statics.field1983;
                while (var252 > 0) {
                    boolean var253 = true;
                    var252--;
                    for (int var254 = 0; var254 < var252; var254++) {
                        if (var249[var254].field108.compareTo(var249[var254 + 1].field108) > 0) {
                            class8 var255 = var249[var254];
                            var249[var254] = var249[var254 + 1];
                            var249[var254 + 1] = var255;
                            var253 = false;
                        }
                    }
                    if (var253) {
                        break;
                    }
                }
                Statics.field2355 = var249;
                field517 = -1;
                return true;
            }
            if (field517 == 221) {
                int var256 = field515.method2459();
                int var257 = field515.method2430();
                class159 var258 = class159.method145(var257);
                if (var258.field2721 != 1 || var258.field2643 != var256) {
                    var258.field2721 = 1;
                    var258.field2643 = var256;
                    method2291(var258);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 56) {
                Statics.field222 = class138.method1562(field515.method2534());
                field517 = -1;
                return true;
            }
            if (field517 == 228) {
                int var259 = field515.method2534();
                int var260 = field515.method2491();
                int var261 = field515.method2491();
                Statics.field2104 = var259 >> 1;
                Statics.field2728.method226(var260, var261, (var259 & 0x1) == 1);
                field517 = -1;
                return true;
            }
            if (field517 == 220) {
                Statics.field362 = field515.method2489();
                Statics.field2030 = field515.method2489();
                for (int var262 = Statics.field362; var262 < Statics.field362 + 8; var262++) {
                    for (int var263 = Statics.field2030; var263 < Statics.field2030 + 8; var263++) {
                        if (field604[Statics.field2104][var262][var263] != null) {
                            field604[Statics.field2104][var262][var263] = null;
                            method27(var262, var263);
                        }
                    }
                }
                for (class22 var264 = (class22) field493.method3286(); var264 != null; var264 = (class22) field493.method3302()) {
                    if (var264.field339 >= Statics.field362 && var264.field339 < Statics.field362 + 8 && var264.field340 >= Statics.field2030 && var264.field340 < Statics.field2030 + 8 && Statics.field2104 == var264.field353) {
                        var264.field348 = 0;
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 106) {
                int var265 = field515.method2534();
                int var266 = field515.method2501();
                String var267 = field515.method2460();
                if (var266 >= 1 && var266 <= 8) {
                    if (var267.equalsIgnoreCase("null")) {
                        var267 = null;
                    }
                    field601[var266 - 1] = var267;
                    field671[var266 - 1] = var265 == 0;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 42) {
                int var268 = field515.method2427();
                if (var268 == 65535) {
                    var268 = -1;
                }
                int var269 = field515.method2466();
                int var270 = field515.method2430();
                class159 var271 = class159.method145(var269);
                if (var271.field2694) {
                    var271.field2714 = var268;
                    var271.field2641 = var270;
                    class40 var273 = class40.method782(var268);
                    var271.field2628 = var273.field988;
                    var271.field2651 = var273.field989;
                    var271.field2652 = var273.field990;
                    var271.field2648 = var273.field991;
                    var271.field2649 = var273.field992;
                    var271.field2653 = var273.field1001;
                    if (var271.field2619 > 0) {
                        var271.field2653 = var271.field2653 * 32 / var271.field2619;
                    }
                    method2291(var271);
                } else if (var268 == -1) {
                    var271.field2721 = 0;
                    field517 = -1;
                    return true;
                } else {
                    class40 var272 = class40.method782(var268);
                    var271.field2721 = 4;
                    var271.field2643 = var268;
                    var271.field2628 = var272.field988;
                    var271.field2651 = var272.field989;
                    var271.field2653 = var272.field1001 * 100 / var270;
                    method2291(var271);
                }
                field517 = -1;
                return true;
            }
            if (field517 == 94) {
                int var274 = field515.method2430();
                int var275 = field515.method2427();
                if (var274 < -70000) {
                    var275 += 32768;
                }
                class159 var276;
                if (var274 >= 0) {
                    var276 = class159.method145(var274);
                } else {
                    var276 = null;
                }
                while (field515.field2039 < field686) {
                    int var277 = field515.method2596();
                    int var278 = field515.method2427();
                    int var279 = 0;
                    if (var278 != 0) {
                        var279 = field515.method2534();
                        if (var279 == 255) {
                            var279 = field515.method2430();
                        }
                    }
                    if (var276 != null && var277 >= 0 && var277 < var276.field2614.length) {
                        var276.field2614[var277] = var278;
                        var276.field2715[var277] = var279;
                    }
                    class19.method134(var275, var277, var278 - 1, var279);
                }
                if (var276 != null) {
                    method2291(var276);
                }
                method174();
                field656[++field600 - 1 & 0x1F] = var275 & 0x7FFF;
                field517 = -1;
                return true;
            }
            if (field517 == 244) {
                field486 = field515.method2427() * 30;
                field487 = field653;
                field517 = -1;
                return true;
            }
            if (field517 == 249) {
                field717 = true;
                Statics.field316 = field515.method2534();
                Statics.field2767 = field515.method2534();
                Statics.field1249 = field515.method2427();
                Statics.field1436 = field515.method2534();
                Statics.field1752 = field515.method2534();
                if (Statics.field1752 >= 100) {
                    Statics.field384 = Statics.field316 * 128 + 64;
                    Statics.field1385 = Statics.field2767 * 128 + 64;
                    Statics.field2493 = method797(Statics.field384, Statics.field1385, Statics.field2104) - Statics.field1249;
                }
                field517 = -1;
                return true;
            }
            if (field517 == 77) {
                Statics.field362 = field515.method2534();
                Statics.field2030 = field515.method2491();
                field517 = -1;
                return true;
            }
            if (field517 == 79) {
                for (int var280 = 0; var280 < field675.length; var280++) {
                    if (field675[var280] != null) {
                        field675[var280].field437 = -1;
                    }
                }
                for (int var281 = 0; var281 < field509.length; var281++) {
                    if (field509[var281] != null) {
                        field509[var281].field437 = -1;
                    }
                }
                field517 = -1;
                return true;
            }
            if (field517 == 116) {
                int var282 = field515.method2458();
                int var283 = field515.method2430();
                class160.field2730[var282] = var283;
                if (class160.field2731[var282] != var283) {
                    class160.field2731[var282] = var283;
                    method796(var282);
                }
                field654[++field655 - 1 & 0x1F] = var282;
                field517 = -1;
                return true;
            }
            if (field517 == 88) {
                method2(false);
                field517 = -1;
                return true;
            }
            class80.method2321("" + field517 + class2.field17 + field504 + class2.field17 + field660 + class2.field17 + field686, (Throwable) null);
            method2177();
        } catch (IOException var293) {
            if (field520 > 0) {
                method2177();
            } else {
                method126(40);
                Statics.field407 = Statics.field499;
                Statics.field499 = null;
            }
        } catch (Exception var294) {
            String var286 = "" + field517 + class2.field17 + field504 + class2.field17 + field660 + class2.field17 + field686 + class2.field17 + (Statics.field920 + Statics.field2728.field439[0]) + class2.field17 + (Statics.field1822 + Statics.field2728.field461[0]) + class2.field17;
            for (int var287 = 0; var287 < field686 && var287 < 50; var287++) {
                var286 = var286 + field515.field2042[var287] + class2.field17;
            }
            class80.method2321(var286, var294);
            method2177();
        }
        return true;
    }

    @ObfuscatedName("bs.bc(I)V")
    public static final void method1366() {
        if (field517 == 224) {
            int var0 = field515.method2489();
            int var1 = (var0 >> 4 & 0x7) + Statics.field362;
            int var2 = (var0 & 0x7) + Statics.field2030;
            byte var3 = field515.method2453();
            byte var4 = field515.method2426();
            int var5 = field515.method2459();
            byte var6 = field515.method2428();
            int var7 = field515.method2489();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field534[var8];
            int var11 = field515.method2457();
            int var12 = field515.method2459();
            byte var13 = field515.method2428();
            int var14 = field515.method2427();
            class3 var15;
            if (field596 == var11) {
                var15 = Statics.field2728;
            } else {
                var15 = field675[var11];
            }
            if (var15 != null) {
                class32 var16 = class32.method14(var12);
                int var17;
                int var18;
                if (var9 == 1 || var9 == 3) {
                    var17 = var16.field830;
                    var18 = var16.field855;
                } else {
                    var17 = var16.field855;
                    var18 = var16.field830;
                }
                int var19 = (var17 >> 1) + var1;
                int var20 = (var17 + 1 >> 1) + var1;
                int var21 = (var18 >> 1) + var2;
                int var22 = (var18 + 1 >> 1) + var2;
                int[][] var23 = class9.field134[Statics.field2104];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var1 << 7) + (var17 << 6);
                int var26 = (var2 << 7) + (var18 << 6);
                class112 var27 = var16.method645(var8, var9, var23, var25, var24, var26);
                if (var27 != null) {
                    method2022(Statics.field2104, var1, var2, var10, -1, 0, 0, var5 + 1, var14 + 1);
                    var15.field50 = field479 + var5;
                    var15.field49 = field479 + var14;
                    var15.field43 = var27;
                    var15.field40 = var1 * 128 + var17 * 64;
                    var15.field42 = var2 * 128 + var18 * 64;
                    var15.field41 = var24;
                    if (var3 > var4) {
                        byte var28 = var3;
                        var3 = var4;
                        var4 = var28;
                    }
                    if (var6 > var13) {
                        byte var29 = var6;
                        var6 = var13;
                        var13 = var29;
                    }
                    var15.field39 = var1 + var3;
                    var15.field46 = var1 + var4;
                    var15.field45 = var2 + var6;
                    var15.field47 = var2 + var13;
                }
            }
        }
        if (field517 == 176) {
            int var30 = field515.method2534();
            int var31 = (var30 >> 4 & 0x7) + Statics.field362;
            int var32 = (var30 & 0x7) + Statics.field2030;
            int var33 = var31 + field515.method2426();
            int var34 = var32 + field515.method2426();
            int var35 = field515.method2452();
            int var36 = field515.method2427();
            int var37 = field515.method2534() * 4;
            int var38 = field515.method2534() * 4;
            int var39 = field515.method2427();
            int var40 = field515.method2427();
            int var41 = field515.method2534();
            int var42 = field515.method2534();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class10 var47 = new class10(var36, Statics.field2104, var43, var44, method797(var43, var44, Statics.field2104) - var37, field479 + var39, field479 + var40, var41, var42, var35, var38);
                var47.method89(var45, var46, method797(var45, var46, Statics.field2104) - var38, field479 + var39);
                field606.method3288(var47);
            }
        } else if (field517 == 30) {
            int var48 = field515.method2459();
            int var49 = field515.method2427();
            int var50 = field515.method2501();
            int var51 = (var50 >> 4 & 0x7) + Statics.field362;
            int var52 = (var50 & 0x7) + Statics.field2030;
            int var53 = field515.method2457();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && field596 != var53) {
                class17 var54 = new class17();
                var54.field259 = var49;
                var54.field254 = var48;
                if (field604[Statics.field2104][var51][var52] == null) {
                    field604[Statics.field2104][var51][var52] = new class177();
                }
                field604[Statics.field2104][var51][var52].method3288(var54);
                method27(var51, var52);
            }
        } else if (field517 == 70) {
            int var55 = field515.method2501();
            int var56 = var55 >> 2;
            int var57 = var55 & 0x3;
            int var58 = field534[var56];
            int var59 = field515.method2534();
            int var60 = (var59 >> 4 & 0x7) + Statics.field362;
            int var61 = (var59 & 0x7) + Statics.field2030;
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                method2022(Statics.field2104, var60, var61, var58, -1, var56, var57, 0, -1);
            }
        } else if (field517 == 251) {
            int var62 = field515.method2491();
            int var63 = (var62 >> 4 & 0x7) + Statics.field362;
            int var64 = (var62 & 0x7) + Statics.field2030;
            int var65 = field515.method2427();
            int var66 = field515.method2427();
            if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                class17 var67 = new class17();
                var67.field259 = var66;
                var67.field254 = var65;
                if (field604[Statics.field2104][var63][var64] == null) {
                    field604[Statics.field2104][var63][var64] = new class177();
                }
                field604[Statics.field2104][var63][var64].method3288(var67);
                method27(var63, var64);
            }
        } else {
            if (field517 == 152) {
                int var68 = field515.method2534();
                int var69 = (var68 >> 4 & 0x7) + Statics.field362;
                int var70 = (var68 & 0x7) + Statics.field2030;
                int var71 = field515.method2427();
                int var72 = field515.method2534();
                int var73 = var72 >> 4 & 0xF;
                int var74 = var72 & 0x7;
                int var75 = field515.method2534();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    int var76 = var73 + 1;
                    if (Statics.field2728.field439[0] >= var69 - var76 && Statics.field2728.field439[0] <= var69 + var76 && Statics.field2728.field461[0] >= var70 - var76 && Statics.field2728.field461[0] <= var70 + var76 && field568 != 0 && var74 > 0 && field711 < 50) {
                        field590[field711] = var71;
                        field713[field711] = var74;
                        field542[field711] = var75;
                        field507[field711] = null;
                        field715[field711] = (var69 << 16) + (var70 << 8) + var73;
                        field711++;
                    }
                }
            }
            if (field517 == 146) {
                int var77 = field515.method2457();
                int var78 = field515.method2501();
                int var79 = var78 >> 2;
                int var80 = var78 & 0x3;
                int var81 = field534[var79];
                int var82 = field515.method2489();
                int var83 = (var82 >> 4 & 0x7) + Statics.field362;
                int var84 = (var82 & 0x7) + Statics.field2030;
                if (var83 >= 0 && var84 >= 0 && var83 < 103 && var84 < 103) {
                    if (var81 == 0) {
                        class96 var85 = Statics.field773.method1869(Statics.field2104, var83, var84);
                        if (var85 != null) {
                            int var86 = var85.field1627 >> 14 & 0x7FFF;
                            if (var79 == 2) {
                                var85.field1625 = new class14(var86, 2, var80 + 4, Statics.field2104, var83, var84, var77, false, var85.field1625);
                                var85.field1630 = new class14(var86, 2, var80 + 1 & 0x3, Statics.field2104, var83, var84, var77, false, var85.field1630);
                            } else {
                                var85.field1625 = new class14(var86, var79, var80, Statics.field2104, var83, var84, var77, false, var85.field1625);
                            }
                        }
                    }
                    if (var81 == 1) {
                        class108 var87 = Statics.field773.method1883(Statics.field2104, var83, var84);
                        if (var87 != null) {
                            int var88 = var87.field1813 >> 14 & 0x7FFF;
                            if (var79 == 4 || var79 == 5) {
                                var87.field1811 = new class14(var88, 4, var80, Statics.field2104, var83, var84, var77, false, var87.field1811);
                            } else if (var79 == 6) {
                                var87.field1811 = new class14(var88, 4, var80 + 4, Statics.field2104, var83, var84, var77, false, var87.field1811);
                            } else if (var79 == 7) {
                                var87.field1811 = new class14(var88, 4, (var80 + 2 & 0x3) + 4, Statics.field2104, var83, var84, var77, false, var87.field1811);
                            } else if (var79 == 8) {
                                var87.field1811 = new class14(var88, 4, var80 + 4, Statics.field2104, var83, var84, var77, false, var87.field1811);
                                var87.field1812 = new class14(var88, 4, (var80 + 2 & 0x3) + 4, Statics.field2104, var83, var84, var77, false, var87.field1812);
                            }
                        }
                    }
                    if (var81 == 2) {
                        class98 var89 = Statics.field773.method1884(Statics.field2104, var83, var84);
                        if (var79 == 11) {
                            var79 = 10;
                        }
                        if (var89 != null) {
                            var89.field1646 = new class14(var89.field1648 >> 14 & 0x7FFF, var79, var80, Statics.field2104, var83, var84, var77, false, var89.field1646);
                        }
                    }
                    if (var81 == 3) {
                        class107 var90 = Statics.field773.method2004(Statics.field2104, var83, var84);
                        if (var90 != null) {
                            var90.field1796 = new class14(var90.field1797 >> 14 & 0x7FFF, 22, var80, Statics.field2104, var83, var84, var77, false, var90.field1796);
                        }
                    }
                }
            } else if (field517 == 155) {
                int var91 = field515.method2534();
                int var92 = (var91 >> 4 & 0x7) + Statics.field362;
                int var93 = (var91 & 0x7) + Statics.field2030;
                int var94 = field515.method2457();
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    class177 var95 = field604[Statics.field2104][var92][var93];
                    if (var95 != null) {
                        for (class17 var96 = (class17) var95.method3286(); var96 != null; var96 = (class17) var95.method3302()) {
                            if ((var94 & 0x7FFF) == var96.field259) {
                                var96.method3309();
                                break;
                            }
                        }
                        if (var95.method3286() == null) {
                            field604[Statics.field2104][var92][var93] = null;
                        }
                        method27(var92, var93);
                    }
                }
            } else if (field517 == 123) {
                int var97 = field515.method2491();
                int var98 = var97 >> 2;
                int var99 = var97 & 0x3;
                int var100 = field534[var98];
                int var101 = field515.method2457();
                int var102 = field515.method2489();
                int var103 = (var102 >> 4 & 0x7) + Statics.field362;
                int var104 = (var102 & 0x7) + Statics.field2030;
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                    method2022(Statics.field2104, var103, var104, var100, var101, var98, var99, 0, -1);
                }
            } else if (field517 == 128) {
                int var105 = field515.method2534();
                int var106 = (var105 >> 4 & 0x7) + Statics.field362;
                int var107 = (var105 & 0x7) + Statics.field2030;
                int var108 = field515.method2427();
                int var109 = field515.method2427();
                int var110 = field515.method2427();
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class177 var111 = field604[Statics.field2104][var106][var107];
                    if (var111 != null) {
                        for (class17 var112 = (class17) var111.method3286(); var112 != null; var112 = (class17) var111.method3302()) {
                            if ((var108 & 0x7FFF) == var112.field259 && var112.field254 == var109) {
                                var112.field254 = var110;
                                break;
                            }
                        }
                        method27(var106, var107);
                    }
                }
            } else if (field517 == 125) {
                int var113 = field515.method2534();
                int var114 = (var113 >> 4 & 0x7) + Statics.field362;
                int var115 = (var113 & 0x7) + Statics.field2030;
                int var116 = field515.method2427();
                int var117 = field515.method2534();
                int var118 = field515.method2427();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    int var119 = var114 * 128 + 64;
                    int var120 = var115 * 128 + 64;
                    class20 var121 = new class20(var116, Statics.field2104, var119, var120, method797(var119, var120, Statics.field2104) - var117, var118, field479);
                    field494.method3288(var121);
                }
            }
        }
    }

    @ObfuscatedName("ca.bb(IIIIIIIIIS)V")
    public static final void method2022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field493.method3286(); var10 != null; var10 = (class22) field493.method3302()) {
            if (var10.field353 == arg0 && var10.field339 == arg1 && var10.field340 == arg2 && var10.field342 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field353 = arg0;
            var9.field342 = arg3;
            var9.field339 = arg1;
            var9.field340 = arg2;
            method2361(var9);
            field493.method3288(var9);
        }
        var9.field338 = arg4;
        var9.field344 = arg5;
        var9.field345 = arg6;
        var9.field347 = arg7;
        var9.field348 = arg8;
    }

    @ObfuscatedName("de.bf(Ls;I)V")
    public static final void method2361(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field342 == 0) {
            var1 = Statics.field773.method2016(arg0.field353, arg0.field339, arg0.field340);
        }
        if (arg0.field342 == 1) {
            var1 = Statics.field773.method1887(arg0.field353, arg0.field339, arg0.field340);
        }
        if (arg0.field342 == 2) {
            var1 = Statics.field773.method1888(arg0.field353, arg0.field339, arg0.field340);
        }
        if (arg0.field342 == 3) {
            var1 = Statics.field773.method1889(arg0.field353, arg0.field339, arg0.field340);
        }
        if (var1 != 0) {
            int var5 = Statics.field773.method1936(arg0.field353, arg0.field339, arg0.field340, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field341 = var2;
        arg0.field343 = var3;
        arg0.field349 = var4;
    }

    @ObfuscatedName("u.bn(B)V")
    public static final void method135() {
        for (class22 var0 = (class22) field493.method3286(); var0 != null; var0 = (class22) field493.method3302()) {
            if (var0.field348 > 0) {
                var0.field348--;
            }
            if (var0.field348 != 0) {
                if (var0.field347 > 0) {
                    var0.field347--;
                }
                if (var0.field347 == 0 && var0.field339 >= 1 && var0.field340 >= 1 && var0.field339 <= 102 && var0.field340 <= 102 && (var0.field338 < 0 || class9.method133(var0.field338, var0.field344))) {
                    method178(var0.field353, var0.field342, var0.field339, var0.field340, var0.field338, var0.field345, var0.field344);
                    var0.field347 = -1;
                    if (var0.field341 == var0.field338 && var0.field341 == -1) {
                        var0.method3309();
                    } else if (var0.field341 == var0.field338 && var0.field349 == var0.field345 && var0.field344 == var0.field343) {
                        var0.method3309();
                    }
                }
            } else if (var0.field341 < 0 || class9.method133(var0.field341, var0.field343)) {
                method178(var0.field353, var0.field342, var0.field339, var0.field340, var0.field341, var0.field349, var0.field343);
                var0.method3309();
            }
        }
    }

    @ObfuscatedName("f.bh(IIIIIIII)V")
    public static final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field475 && Statics.field2104 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field773.method2016(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field773.method1887(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field773.method1888(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field773.method1889(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field773.method1936(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field773.method1877(arg0, arg2, arg3);
                class32 var15 = class32.method14(var12);
                if (var15.field831 != 0) {
                    field531[arg0].method2665(arg2, arg3, var13, var14, var15.field832);
                }
            }
            if (arg1 == 1) {
                Statics.field773.method1912(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field773.method1970(arg0, arg2, arg3);
                class32 var16 = class32.method14(var12);
                if (var16.field855 + arg2 > 103 || var16.field855 + arg3 > 103 || var16.field830 + arg2 > 103 || var16.field830 + arg3 > 103) {
                    return;
                }
                if (var16.field831 != 0) {
                    field531[arg0].method2640(arg2, arg3, var16.field855, var16.field830, var14, var16.field832);
                }
            }
            if (arg1 == 3) {
                Statics.field773.method1880(arg0, arg2, arg3);
                class32 var17 = class32.method14(var12);
                if (var17.field831 == 1) {
                    field531[arg0].method2642(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field120[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class95 var19 = Statics.field773;
        class130 var20 = field531[arg0];
        class32 var21 = class32.method14(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field830;
            var23 = var21.field855;
        } else {
            var22 = var21.field855;
            var23 = var21.field830;
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
        int[][] var28 = class9.field134[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field833 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field854 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class94 var34;
            if (var21.field843 == -1 && var21.field851 == null) {
                var34 = var21.method645(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1866(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field831 == 1) {
                var20.method2633(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var57;
            if (var21.field843 == -1 && var21.field851 == null) {
                var57 = var21.method645(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            if (var57 != null) {
                var19.method1870(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field831 != 0) {
                var20.method2636(arg2, arg3, var22, var23, var21.field832);
            }
        } else if (arg6 >= 12) {
            class94 var35;
            if (var21.field843 == -1 && var21.field851 == null) {
                var35 = var21.method645(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1870(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2636(arg2, arg3, var22, var23, var21.field832);
            }
        } else if (arg6 == 0) {
            class94 var36;
            if (var21.field843 == -1 && var21.field851 == null) {
                var36 = var21.method645(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1957(arg0, arg2, arg3, var29, var36, (class94) null, class9.field125[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2635(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 1) {
            class94 var37;
            if (var21.field843 == -1 && var21.field851 == null) {
                var37 = var21.method645(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1957(arg0, arg2, arg3, var29, var37, (class94) null, class9.field126[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2635(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class94 var39;
            class94 var40;
            if (var21.field843 == -1 && var21.field851 == null) {
                var39 = var21.method645(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method645(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field843, true, (class94) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1957(arg0, arg2, arg3, var29, var39, var40, class9.field125[arg5], class9.field125[var38], var32, var33);
            if (var21.field831 != 0) {
                var20.method2635(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 3) {
            class94 var41;
            if (var21.field843 == -1 && var21.field851 == null) {
                var41 = var21.method645(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1957(arg0, arg2, arg3, var29, var41, (class94) null, class9.field126[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2635(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 9) {
            class94 var42;
            if (var21.field843 == -1 && var21.field851 == null) {
                var42 = var21.method645(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1870(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2636(arg2, arg3, var22, var23, var21.field832);
            }
        } else if (arg6 == 4) {
            class94 var43;
            if (var21.field843 == -1 && var21.field851 == null) {
                var43 = var21.method645(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1930(arg0, arg2, arg3, var29, var43, (class94) null, class9.field125[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2016(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class32.method14(var45 >> 14 & 0x7FFF).field838;
            }
            class94 var46;
            if (var21.field843 == -1 && var21.field851 == null) {
                var46 = var21.method645(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1930(arg0, arg2, arg3, var29, var46, (class94) null, class9.field125[arg5], 0, class9.field138[arg5] * var44, class9.field128[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2016(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class32.method14(var48 >> 14 & 0x7FFF).field838 / 2;
            }
            class94 var49;
            if (var21.field843 == -1 && var21.field851 == null) {
                var49 = var21.method645(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1930(arg0, arg2, arg3, var29, var49, (class94) null, 256, arg5, class9.field129[arg5] * var47, class9.field130[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class94 var51;
            if (var21.field843 == -1 && var21.field851 == null) {
                var51 = var21.method645(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1930(arg0, arg2, arg3, var29, var51, (class94) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2016(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class32.method14(var53 >> 14 & 0x7FFF).field838 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class94 var55;
            class94 var56;
            if (var21.field843 == -1 && var21.field851 == null) {
                var55 = var21.method645(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method645(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field843, true, (class94) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field843, true, (class94) null);
            }
            var19.method1930(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field129[arg5] * var52, class9.field130[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("p.bt(IIB)V")
    public static final void method27(int arg0, int arg1) {
        class177 var2 = field604[Statics.field2104][arg0][arg1];
        if (var2 == null) {
            Statics.field773.method1881(Statics.field2104, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3286(); var6 != null; var6 = (class17) var2.method3302()) {
            class40 var7 = class40.method782(var6.field259);
            long var8 = (long) var7.field1020;
            if (var7.field994 == 1) {
                var8 = (long) (var6.field254 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field773.method1881(Statics.field2104, arg0, arg1);
            return;
        }
        var2.method3277(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3286(); var12 != null; var12 = (class17) var2.method3302()) {
            if (var5.field259 != var12.field259) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field259 != var12.field259 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field773.method1867(Statics.field2104, arg0, arg1, method797(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2104), var5, var13, var10, var11);
    }

    @ObfuscatedName("ap.bq(I)V")
    public static final void method240() {
        field598 = 0;
        field679 = 0;
        field515.method2296();
        int var0 = field515.method2297(1);
        if (var0 != 0) {
            int var1 = field515.method2297(2);
            if (var1 == 0) {
                field562[++field679 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field515.method2297(3);
                Statics.field2728.method227(var2, false);
                int var3 = field515.method2297(1);
                if (var3 == 1) {
                    field562[++field679 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field515.method2297(3);
                Statics.field2728.method227(var4, true);
                int var5 = field515.method2297(3);
                Statics.field2728.method227(var5, true);
                int var6 = field515.method2297(1);
                if (var6 == 1) {
                    field562[++field679 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field515.method2297(7);
                Statics.field2104 = field515.method2297(2);
                int var8 = field515.method2297(1);
                int var9 = field515.method2297(1);
                if (var9 == 1) {
                    field562[++field679 - 1] = 2047;
                }
                int var10 = field515.method2297(7);
                Statics.field2728.method226(var7, var10, var8 == 1);
            }
        }
        int var11 = field515.method2297(8);
        if (var11 < field591) {
            for (int var12 = var11; var12 < field591; var12++) {
                field721[++field598 - 1] = field592[var12];
            }
        }
        if (var11 > field591) {
            throw new RuntimeException("");
        }
        field591 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field592[var13];
            class3 var15 = field675[var14];
            int var16 = field515.method2297(1);
            if (var16 == 0) {
                field592[++field591 - 1] = var14;
                var15.field427 = field479;
            } else {
                int var17 = field515.method2297(2);
                if (var17 == 0) {
                    field592[++field591 - 1] = var14;
                    var15.field427 = field479;
                    field562[++field679 - 1] = var14;
                } else if (var17 == 1) {
                    field592[++field591 - 1] = var14;
                    var15.field427 = field479;
                    int var18 = field515.method2297(3);
                    var15.method227(var18, false);
                    int var19 = field515.method2297(1);
                    if (var19 == 1) {
                        field562[++field679 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field592[++field591 - 1] = var14;
                    var15.field427 = field479;
                    int var20 = field515.method2297(3);
                    var15.method227(var20, true);
                    int var21 = field515.method2297(3);
                    var15.method227(var21, true);
                    int var22 = field515.method2297(1);
                    if (var22 == 1) {
                        field562[++field679 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field721[++field598 - 1] = var14;
                }
            }
        }
        while (field515.method2299(field686) >= 11) {
            int var23 = field515.method2297(11);
            if (var23 == 2047) {
                break;
            }
            boolean var47 = false;
            if (field675[var23] == null) {
                field675[var23] = new class3();
                if (field595[var23] != null) {
                    field675[var23].method18(field595[var23]);
                }
                var47 = true;
            }
            field592[++field591 - 1] = var23;
            class3 var48 = field675[var23];
            var48.field427 = field479;
            int var49 = field603[field515.method2297(3)];
            if (var47) {
                var48.field456 = var48.field410 = var49;
            }
            int var50 = field515.method2297(1);
            if (var50 == 1) {
                field562[++field679 - 1] = var23;
            }
            int var51 = field515.method2297(5);
            if (var51 > 15) {
                var51 -= 32;
            }
            int var52 = field515.method2297(5);
            if (var52 > 15) {
                var52 -= 32;
            }
            int var53 = field515.method2297(1);
            var48.method226(Statics.field2728.field439[0] + var52, Statics.field2728.field461[0] + var51, var53 == 1);
        }
        field515.method2298();
        for (int var24 = 0; var24 < field679; var24++) {
            int var25 = field562[var24];
            class3 var26 = field675[var25];
            int var27 = field515.method2534();
            if ((var27 & 0x8) != 0) {
                var27 += field515.method2534() << 8;
            }
            if ((var27 & 0x40) != 0) {
                var26.field421 = field515.method2460();
                if (var26.field421.charAt(0) == '~') {
                    var26.field421 = var26.field421.substring(1);
                    method2666(2, var26.field36, var26.field421);
                } else if (Statics.field2728 == var26) {
                    method2666(2, var26.field36, var26.field421);
                }
                var26.field443 = 0;
                var26.field412 = 0;
                var26.field460 = 150;
            }
            if ((var27 & 0x80) != 0) {
                int var28 = field515.method2501();
                int var29 = field515.method2489();
                var26.method230(var28, var29, field479);
                var26.field428 = field479 + 300;
                var26.field429 = field515.method2491();
                var26.field430 = field515.method2534();
            }
            if ((var27 & 0x1) != 0) {
                int var30 = field515.method2458();
                int var31 = field515.method2491();
                int var32 = field515.method2501();
                int var33 = field515.field2039;
                if (var26.field36 != null && var26.field34 != null) {
                    boolean var34 = false;
                    if (var31 <= 1 && method2024(var26.field36)) {
                        var34 = true;
                    }
                    if (!var34 && field589 == 0) {
                        field574.field2039 = 0;
                        field515.method2436(field574.field2042, 0, var32);
                        field574.field2039 = 0;
                        String var35 = class185.method3349(class148.method2100(class184.method165(field574)));
                        var26.field421 = var35.trim();
                        var26.field443 = var30 >> 8;
                        var26.field412 = var30 & 0xFF;
                        var26.field460 = 150;
                        if (var31 == 2 || var31 == 3) {
                            method2666(1, class2.method200(1) + var26.field36, var35);
                        } else if (var31 == 1) {
                            method2666(1, class2.method200(0) + var26.field36, var35);
                        } else {
                            method2666(2, var26.field36, var35);
                        }
                    }
                }
                field515.field2039 = var32 + var33;
            }
            if ((var27 & 0x400) != 0) {
                int var36 = field515.method2501();
                int var37 = field515.method2501();
                var26.method230(var36, var37, field479);
                var26.field428 = field479 + 300;
                var26.field429 = field515.method2501();
                var26.field430 = field515.method2534();
            }
            if ((var27 & 0x2) != 0) {
                int var38 = field515.method2489();
                byte[] var39 = new byte[var38];
                class127 var40 = new class127(var39);
                field515.method2436(var39, 0, var38);
                field595[var25] = var40;
                var26.method18(var40);
            }
            if ((var27 & 0x100) != 0) {
                var26.field454 = field515.method2489();
                var26.field449 = field515.method2489();
                var26.field408 = field515.method2489();
                var26.field450 = field515.method2491();
                var26.field451 = field515.method2459() + field479;
                var26.field458 = field515.method2458() + field479;
                var26.field453 = field515.method2501();
                var26.field459 = 1;
                var26.field464 = 0;
            }
            if ((var27 & 0x200) != 0) {
                var26.field442 = field515.method2457();
                int var41 = field515.method2430();
                var26.field446 = var41 >> 16;
                var26.field418 = (var41 & 0xFFFF) + field479;
                var26.field466 = 0;
                var26.field444 = 0;
                if (var26.field418 > field479) {
                    var26.field466 = -1;
                }
                if (var26.field442 == 65535) {
                    var26.field442 = -1;
                }
            }
            if ((var27 & 0x20) != 0) {
                int var42 = field515.method2459();
                if (var42 == 65535) {
                    var42 = -1;
                }
                int var43 = field515.method2501();
                method2407(var26, var42, var43);
            }
            if ((var27 & 0x4) != 0) {
                var26.field431 = field515.method2427();
                if (var26.field431 == 65535) {
                    var26.field431 = -1;
                }
            }
            if ((var27 & 0x10) != 0) {
                var26.field448 = field515.method2427();
                var26.field433 = field515.method2457();
            }
        }
        for (int var44 = 0; var44 < field598; var44++) {
            int var45 = field721[var44];
            if (field479 != field675[var45].field427) {
                field675[var45] = null;
            }
        }
        if (field686 != field515.field2039) {
            throw new RuntimeException(field515.field2039 + class2.field17 + field686);
        }
        for (int var46 = 0; var46 < field591; var46++) {
            if (field675[field592[var46]] == null) {
                throw new RuntimeException(var46 + class2.field17 + field591);
            }
        }
    }

    @ObfuscatedName("cm.bk(I)V")
    public static final void method1597() {
        while (true) {
            if (field515.method2299(field686) >= 27) {
                int var0 = field515.method2297(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field509[var0] == null) {
                        field509[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field509[var0];
                    field607[++field661 - 1] = var0;
                    var2.field427 = field479;
                    var2.field387 = class31.method561(field515.method2297(14));
                    int var3 = field515.method2297(1);
                    int var4 = field515.method2297(1);
                    if (var4 == 1) {
                        field562[++field679 - 1] = var0;
                    }
                    int var5 = field515.method2297(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field515.method2297(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field603[field515.method2297(3)];
                    if (var1) {
                        var2.field456 = var2.field410 = var7;
                    }
                    var2.field463 = var2.field387.field781;
                    var2.field416 = var2.field387.field804;
                    if (var2.field416 == 0) {
                        var2.field410 = 0;
                    }
                    var2.field457 = var2.field387.field787;
                    var2.field447 = var2.field387.field788;
                    var2.field436 = var2.field387.field789;
                    var2.field419 = var2.field387.field790;
                    var2.field432 = var2.field387.field809;
                    var2.field414 = var2.field387.field785;
                    var2.field415 = var2.field387.field786;
                    var2.method226(Statics.field2728.field439[0] + var6, Statics.field2728.field461[0] + var5, var3 == 1);
                    continue;
                }
            }
            field515.method2298();
            return;
        }
    }

    @ObfuscatedName("l.bi(B)V")
    public static final void method97() {
        for (int var0 = 0; var0 < field679; var0++) {
            int var1 = field562[var0];
            class25 var2 = field509[var1];
            int var3 = field515.method2534();
            if ((var3 & 0x2) != 0) {
                var2.field442 = field515.method2427();
                int var4 = field515.method2468();
                var2.field446 = var4 >> 16;
                var2.field418 = (var4 & 0xFFFF) + field479;
                var2.field466 = 0;
                var2.field444 = 0;
                if (var2.field418 > field479) {
                    var2.field466 = -1;
                }
                if (var2.field442 == 65535) {
                    var2.field442 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field448 = field515.method2457();
                var2.field433 = field515.method2459();
            }
            if ((var3 & 0x10) != 0) {
                var2.field421 = field515.method2460();
                var2.field460 = 100;
            }
            if ((var3 & 0x80) != 0) {
                var2.field431 = field515.method2457();
                if (var2.field431 == 65535) {
                    var2.field431 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field515.method2501();
                int var6 = field515.method2489();
                var2.method230(var5, var6, field479);
                var2.field428 = field479 + 300;
                var2.field429 = field515.method2491();
                var2.field430 = field515.method2491();
            }
            if ((var3 & 0x40) != 0) {
                int var7 = field515.method2427();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field515.method2491();
                if (var2.field437 == var7 && var7 != -1) {
                    int var9 = class34.method2178(var7).field894;
                    if (var9 == 1) {
                        var2.field438 = 0;
                        var2.field425 = 0;
                        var2.field440 = var8;
                        var2.field441 = 0;
                    }
                    if (var9 == 2) {
                        var2.field441 = 0;
                    }
                } else if (var7 == -1 || var2.field437 == -1 || class34.method2178(var7).field888 >= class34.method2178(var2.field437).field888) {
                    var2.field437 = var7;
                    var2.field438 = 0;
                    var2.field425 = 0;
                    var2.field440 = var8;
                    var2.field441 = 0;
                    var2.field464 = var2.field459;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var10 = field515.method2491();
                int var11 = field515.method2491();
                var2.method230(var10, var11, field479);
                var2.field428 = field479 + 300;
                var2.field429 = field515.method2491();
                var2.field430 = field515.method2501();
            }
            if ((var3 & 0x8) != 0) {
                var2.field387 = class31.method561(field515.method2427());
                var2.field463 = var2.field387.field781;
                var2.field416 = var2.field387.field804;
                var2.field457 = var2.field387.field787;
                var2.field447 = var2.field387.field788;
                var2.field436 = var2.field387.field789;
                var2.field419 = var2.field387.field790;
                var2.field432 = var2.field387.field809;
                var2.field414 = var2.field387.field785;
                var2.field415 = var2.field387.field786;
            }
        }
    }

    @ObfuscatedName("am.br(I)V")
    public static final void method534() {
        int var0 = Statics.field86;
        int var1 = Statics.field136;
        int var2 = Statics.field1662;
        int var3 = Statics.field1272;
        int var4 = 6116423;
        class89.method1817(var0, var1, var2, var3, var4);
        class89.method1817(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class89.method1794(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1305.method3350(class135.field2249, var0 + 3, var1 + 14, var4, -1);
        int var5 = class77.field1396;
        int var6 = class77.field1397;
        for (int var7 = 0; var7 < field613; var7++) {
            int var8 = (field613 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1305.method3350(Statics.method1599(var7), var0 + 3, var8, var9, 0);
        }
        method198(Statics.field86, Statics.field136, Statics.field1662, Statics.field1272);
    }

    @ObfuscatedName("f.bv(IIIII)V")
    public static final void method198(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field490; var4++) {
            if (field678[var4] + field676[var4] > arg0 && field676[var4] < arg0 + arg2 && field688[var4] + field563[var4] > arg1 && field688[var4] < arg1 + arg3) {
                field674[var4] = true;
            }
        }
    }

    @ObfuscatedName("u.bs(I)V")
    public static final void method127() {
        method36();
        if (Statics.field733 != null || field511 != null) {
            return;
        }
        int var0 = class77.field1402;
        if (field612) {
            if (var0 != 1 && (Statics.field752 || var0 != 4)) {
                int var1 = class77.field1396;
                int var2 = class77.field1397;
                if (var1 < Statics.field86 - 10 || var1 > Statics.field86 + Statics.field1662 + 10 || var2 < Statics.field136 - 10 || var2 > Statics.field136 + Statics.field1272 + 10) {
                    field612 = false;
                    Statics.method3209(Statics.field86, Statics.field136, Statics.field1662, Statics.field1272);
                }
            }
            if (var0 == 1 || !Statics.field752 && var0 == 4) {
                int var3 = Statics.field86;
                int var4 = Statics.field136;
                int var5 = Statics.field1662;
                int var6 = class77.field1403;
                int var7 = class77.field1407;
                int var8 = -1;
                for (int var9 = 0; var9 < field613; var9++) {
                    int var10 = (field613 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method2930(var8);
                }
                field612 = false;
                Statics.method3209(Statics.field86, Statics.field136, Statics.field1662, Statics.field1272);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field752 && var0 == 4) && field613 > 0) {
            int var11 = field616[field613 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                label227: {
                    int var12 = field530[field613 - 1];
                    int var13 = field615[field613 - 1];
                    class159 var14 = class159.method145(var13);
                    int var15 = method1436(var14);
                    boolean var16 = (var15 >> 28 & 0x1) != 0;
                    if (!var16) {
                        int var17 = method1436(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (!var18) {
                            break label227;
                        }
                    }
                    if (Statics.field733 != null && !field587 && field611 != 1) {
                        int var19 = field613 - 1;
                        boolean var20;
                        if (var19 < 0) {
                            var20 = false;
                        } else {
                            int var21 = field616[var19];
                            if (var21 >= 2000) {
                                var21 -= 2000;
                            }
                            if (var21 == 1007) {
                                var20 = true;
                            } else {
                                var20 = false;
                            }
                        }
                        if (!var20 && field613 > 0) {
                            method2930(field613 - 1);
                        }
                    }
                    field587 = false;
                    field588 = 0;
                    if (Statics.field733 != null) {
                        method2291(Statics.field733);
                    }
                    Statics.field733 = class159.method145(var13);
                    field549 = var12;
                    field584 = class77.field1403;
                    field585 = class77.field1407;
                    method2291(Statics.field733);
                    return;
                }
            }
        }
        if (var0 == 1 || !Statics.field752 && var0 == 4) {
            label231: {
                if (field611 != 1 || field613 <= 2) {
                    int var22 = field613 - 1;
                    boolean var23;
                    if (var22 < 0) {
                        var23 = false;
                    } else {
                        int var24 = field616[var22];
                        if (var24 >= 2000) {
                            var24 -= 2000;
                        }
                        if (var24 == 1007) {
                            var23 = true;
                        } else {
                            var23 = false;
                        }
                    }
                    if (!var23) {
                        break label231;
                    }
                }
                var0 = 2;
            }
        }
        if ((var0 == 1 || !Statics.field752 && var0 == 4) && field613 > 0) {
            method2930(field613 - 1);
        }
        if (var0 == 2 && field613 > 0) {
            method875();
        }
    }

    @ObfuscatedName("aj.bj(I)V")
    public static final void method875() {
        int var0 = Statics.field1305.method3345(class135.field2249);
        for (int var1 = 0; var1 < field613; var1++) {
            int var2 = Statics.field1305.method3345(Statics.method1599(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field613 * 15 + 21;
        int var4 = class77.field1403 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1407;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field612 = true;
        Statics.field86 = var4;
        Statics.field136 = var5;
        Statics.field1662 = var0;
        Statics.field1272 = field613 * 15 + 22;
    }

    @ObfuscatedName("el.bp(IS)V")
    public static final void method2930(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field530[arg0];
        int var2 = field615[arg0];
        int var3 = field616[arg0];
        int var4 = field617[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 7) {
            class25 var5 = field509[var4];
            if (var5 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(209);
                field594.method2454(Statics.field1831);
                field594.method2465(Statics.field1554);
                field594.method2424(var4);
                field594.method2456(Statics.field205);
            }
        }
        if (var3 == 18) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(110);
            field594.method2455(Statics.field920 + var1);
            field594.method2456(Statics.field1822 + var2);
            field594.method2454(var4);
        }
        if (var3 == 34) {
            field594.method2300(61);
            field594.method2549(var2);
            field594.method2424(var1);
            field594.method2456(var4);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 41) {
            field594.method2300(105);
            field594.method2454(var4);
            field594.method2454(var1);
            field594.method2464(var2);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 6) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(147);
            field594.method2424(var4 >> 14 & 0x7FFF);
            field594.method2424(Statics.field920 + var1);
            field594.method2456(Statics.field1822 + var2);
        }
        if (var3 == 47) {
            class3 var6 = field675[var4];
            if (var6 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(218);
                field594.method2454(var4);
            }
        }
        if (var3 == 9) {
            class25 var7 = field509[var4];
            if (var7 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(109);
                field594.method2424(var4);
            }
        }
        if (var3 == 1003) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            class25 var8 = field509[var4];
            if (var8 != null) {
                class31 var9 = var8.field387;
                if (var9.field805 != null) {
                    var9 = var9.method611();
                }
                if (var9 != null) {
                    field594.method2300(177);
                    field594.method2454(var9.field779);
                }
            }
        }
        if (var3 == 2) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(251);
            field594.method2454(Statics.field920 + var1);
            field594.method2454(field627);
            field594.method2454(Statics.field1822 + var2);
            field594.method2464(Statics.field114);
            field594.method2456(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 36) {
            field594.method2300(73);
            field594.method2424(var1);
            field594.method2424(var4);
            field594.method2414(var2);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            method2202(var4, var2, var1, field619[arg0]);
        }
        if (var3 == 11) {
            class25 var10 = field509[var4];
            if (var10 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(91);
                field594.method2454(var4);
            }
        }
        if (var3 == 28) {
            field594.method2300(176);
            field594.method2414(var2);
            class159 var11 = class159.method145(var2);
            if (var11.field2706 != null && var11.field2706[0][0] == 5) {
                int var12 = var11.field2706[0][1];
                class160.field2731[var12] = 1 - class160.field2731[var12];
                method796(var12);
            }
        }
        if (var3 == 50) {
            class3 var13 = field675[var4];
            if (var13 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(123);
                field594.method2454(var4);
            }
        }
        if (var3 == 10) {
            class25 var14 = field509[var4];
            if (var14 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(79);
                field594.method2456(var4);
            }
        }
        if (var3 == 39) {
            field594.method2300(156);
            field594.method2424(var4);
            field594.method2454(var1);
            field594.method2549(var2);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 40) {
            field594.method2300(82);
            field594.method2454(var1);
            field594.method2454(var4);
            field594.method2465(var2);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 17) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(175);
            field594.method2424(var4);
            field594.method2454(field627);
            field594.method2549(Statics.field114);
            field594.method2456(Statics.field1822 + var2);
            field594.method2454(Statics.field920 + var1);
        }
        if (var3 == 4) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(117);
            field594.method2424(Statics.field920 + var1);
            field594.method2424(var4 >> 14 & 0x7FFF);
            field594.method2456(Statics.field1822 + var2);
        }
        if (var3 == 44) {
            class3 var15 = field675[var4];
            if (var15 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(215);
                field594.method2455(var4);
            }
        }
        if (var3 == 21) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(38);
            field594.method2456(Statics.field1822 + var2);
            field594.method2455(Statics.field920 + var1);
            field594.method2424(var4);
        }
        if (var3 == 14) {
            class3 var16 = field675[var4];
            if (var16 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(42);
                field594.method2455(Statics.field205);
                field594.method2424(Statics.field1831);
                field594.method2464(Statics.field1554);
                field594.method2456(var4);
            }
        }
        if (var3 == 58) {
            field594.method2300(219);
            field594.method2454(field627);
            field594.method2455(var1);
            field594.method2464(Statics.field114);
            field594.method2465(var2);
        }
        if (var3 == 20) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(95);
            field594.method2424(var4);
            field594.method2455(Statics.field920 + var1);
            field594.method2456(Statics.field1822 + var2);
        }
        if (var3 == 38) {
            method2811();
            class159 var17 = class159.method145(var2);
            field624 = 1;
            Statics.field205 = var1;
            Statics.field1554 = var2;
            Statics.field1831 = var4;
            method2291(var17);
            field625 = class2.method202(16748608) + class40.method782(var4).field982 + class2.method202(16777215);
            if (field625 == null) {
                field625 = "null";
            }
            return;
        }
        if (var3 == 19) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(249);
            field594.method2456(Statics.field920 + var1);
            field594.method2456(Statics.field1822 + var2);
            field594.method2424(var4);
        }
        if (var3 == 30 && field634 == null) {
            field594.method2300(235);
            field594.method2454(var1);
            field594.method2464(var2);
            field634 = class159.method32(var2, var1);
            method2291(field634);
        }
        if (var3 == 16) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(232);
            field594.method2465(Statics.field1554);
            field594.method2424(Statics.field1822 + var2);
            field594.method2456(Statics.field1831);
            field594.method2454(Statics.field920 + var1);
            field594.method2424(var4);
            field594.method2454(Statics.field205);
        }
        if (var3 == 51) {
            class3 var18 = field675[var4];
            if (var18 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(25);
                field594.method2454(var4);
            }
        }
        if (var3 == 33) {
            field594.method2300(76);
            field594.method2465(var2);
            field594.method2424(var1);
            field594.method2455(var4);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 5) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(0);
            field594.method2455(Statics.field1822 + var2);
            field594.method2455(Statics.field920 + var1);
            field594.method2455(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 32) {
            field594.method2300(180);
            field594.method2455(field627);
            field594.method2455(var1);
            field594.method2456(var4);
            field594.method2549(var2);
            field594.method2549(Statics.field114);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 8) {
            class25 var19 = field509[var4];
            if (var19 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(200);
                field594.method2414(Statics.field114);
                field594.method2456(var4);
                field594.method2455(field627);
            }
        }
        if (var3 == 29) {
            field594.method2300(176);
            field594.method2414(var2);
            class159 var20 = class159.method145(var2);
            if (var20.field2706 != null && var20.field2706[0][0] == 5) {
                int var21 = var20.field2706[0][1];
                if (class160.field2731[var21] != var20.field2708[0]) {
                    class160.field2731[var21] = var20.field2708[0];
                    method796(var21);
                }
            }
        }
        if (var3 == 35) {
            field594.method2300(187);
            field594.method2456(var4);
            field594.method2455(var1);
            field594.method2414(var2);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 43) {
            field594.method2300(150);
            field594.method2549(var2);
            field594.method2454(var4);
            field594.method2454(var1);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 45) {
            class3 var22 = field675[var4];
            if (var22 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(20);
                field594.method2424(var4);
            }
        }
        if (var3 == 1002) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field594.method2300(74);
            field594.method2454(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1005) {
            class159 var23 = class159.method145(var2);
            if (var23 == null || var23.field2715[var1] < 100000) {
                field594.method2300(122);
                field594.method2424(var4);
            } else {
                method2666(0, "", var23.field2715[var1] + " x " + class40.method782(var4).field982);
            }
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 1001) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(55);
            field594.method2424(Statics.field920 + var1);
            field594.method2454(var4 >> 14 & 0x7FFF);
            field594.method2454(Statics.field1822 + var2);
        }
        if (var3 == 31) {
            field594.method2300(163);
            field594.method2454(Statics.field205);
            field594.method2454(var1);
            field594.method2454(var4);
            field594.method2549(var2);
            field594.method2549(Statics.field1554);
            field594.method2454(Statics.field1831);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 1) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(30);
            field594.method2454(var4 >> 14 & 0x7FFF);
            field594.method2456(Statics.field205);
            field594.method2456(Statics.field1822 + var2);
            field594.method2456(Statics.field1831);
            field594.method2414(Statics.field1554);
            field594.method2454(Statics.field920 + var1);
        }
        if (var3 == 22) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(75);
            field594.method2454(Statics.field1822 + var2);
            field594.method2454(var4);
            field594.method2455(Statics.field920 + var1);
        }
        if (var3 == 15) {
            class3 var24 = field675[var4];
            if (var24 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(160);
                field594.method2455(field627);
                field594.method2455(var4);
                field594.method2549(Statics.field114);
            }
        }
        if (var3 == 46) {
            class3 var25 = field675[var4];
            if (var25 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(101);
                field594.method2455(var4);
            }
        }
        if (var3 == 26) {
            field594.method2300(44);
            for (class4 var26 = (class4) field631.method3262(); var26 != null; var26 = (class4) field631.method3265()) {
                if (var26.field52 == 0 || var26.field52 == 3) {
                    method560(var26, true);
                }
            }
            if (field634 != null) {
                method2291(field634);
                field634 = null;
            }
        }
        if (var3 == 42) {
            field594.method2300(19);
            field594.method2424(var4);
            field594.method2414(var2);
            field594.method2455(var1);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 12) {
            class25 var27 = field509[var4];
            if (var27 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(162);
                field594.method2454(var4);
            }
        }
        if (var3 == 49) {
            class3 var28 = field675[var4];
            if (var28 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(53);
                field594.method2455(var4);
            }
        }
        if (var3 == 48) {
            class3 var29 = field675[var4];
            if (var29 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(217);
                field594.method2456(var4);
            }
        }
        if (var3 == 1004) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field594.method2300(122);
            field594.method2424(var4);
        }
        if (var3 == 25) {
            class159 var30 = class159.method32(var2, var1);
            if (var30 != null) {
                method2811();
                method2877(var2, var1, class163.method759(method1436(var30)));
                field624 = 0;
                field628 = method765(var30);
                if (field628 == null) {
                    field628 = "Null";
                }
                if (var30.field2694) {
                    field629 = var30.field2601 + class2.method202(16777215);
                } else {
                    field629 = class2.method202(65280) + var30.field2604 + class2.method202(16777215);
                }
            }
            return;
        }
        if (var3 == 13) {
            class25 var31 = field509[var4];
            if (var31 != null) {
                field577 = class77.field1403;
                field544 = class77.field1407;
                field580 = 2;
                field579 = 0;
                field710 = var1;
                field583 = var2;
                field594.method2300(13);
                field594.method2456(var4);
            }
        }
        if (var3 == 37) {
            field594.method2300(40);
            field594.method2456(var1);
            field594.method2454(var4);
            field594.method2414(var2);
            field495 = 0;
            Statics.field1106 = class159.method145(var2);
            field582 = var1;
        }
        if (var3 == 23) {
            Statics.field773.method1897(Statics.field2104, var1, var2);
        }
        if (var3 == 3) {
            field577 = class77.field1403;
            field544 = class77.field1407;
            field580 = 2;
            field579 = 0;
            field710 = var1;
            field583 = var2;
            field594.method2300(107);
            field594.method2455(Statics.field1822 + var2);
            field594.method2456(var4 >> 14 & 0x7FFF);
            field594.method2456(Statics.field920 + var1);
        }
        if (var3 == 24) {
            class159 var32 = class159.method145(var2);
            boolean var33 = true;
            if (var32.field2679 > 0) {
                var33 = method54(var32);
            }
            if (var33) {
                field594.method2300(176);
                field594.method2414(var2);
            }
        }
        if (field624 != 0) {
            field624 = 0;
            method2291(class159.method145(Statics.field1554));
        }
        if (field626) {
            method2811();
        }
        if (Statics.field1106 != null && field495 == 0) {
            method2291(Statics.field1106);
        }
    }

    @ObfuscatedName("v.bw(ILjava/lang/String;I)V")
    public static void method49(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field591; var3++) {
            class3 var4 = field675[field592[var3]];
            if (var4 != null && var4.field36 != null && var4.field36.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field594.method2300(215);
                    field594.method2455(field592[var3]);
                } else if (arg0 == 4) {
                    field594.method2300(218);
                    field594.method2454(field592[var3]);
                } else if (arg0 == 6) {
                    field594.method2300(53);
                    field594.method2455(field592[var3]);
                } else if (arg0 == 7) {
                    field594.method2300(123);
                    field594.method2454(field592[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method2666(0, "", class135.field2262 + arg1);
        }
    }

    @ObfuscatedName("eq.bz(IIII)V")
    public static void method2877(int arg0, int arg1, int arg2) {
        class159 var3 = class159.method32(arg0, arg1);
        if (var3 != null && var3.field2688 != null) {
            class1 var4 = new class1();
            var4.field3 = var3;
            var4.field9 = var3.field2688;
            class26.method173(var4);
        }
        field626 = true;
        Statics.field114 = arg0;
        field627 = arg1;
        Statics.field1268 = arg2;
        method2291(var3);
    }

    @ObfuscatedName("en.bo(B)V")
    public static void method2811() {
        if (!field626) {
            return;
        }
        class159 var0 = class159.method32(Statics.field114, field627);
        if (var0 != null && var0.field2689 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2689;
            class26.method173(var1);
        }
        field626 = false;
        method2291(var0);
    }

    @ObfuscatedName("dg.bm(IIILjava/lang/String;B)V")
    public static void method2202(int arg0, int arg1, int arg2, String arg3) {
        class159 var4 = class159.method32(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2697 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field1 = arg0;
            var5.field10 = arg3;
            var5.field9 = var4.field2697;
            class26.method173(var5);
        }
        boolean var6 = true;
        if (var4.field2679 > 0) {
            var6 = method54(var4);
        }
        if (!var6 || !class163.method564(method1436(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field594.method2300(184);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 2) {
            field594.method2300(185);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 3) {
            field594.method2300(139);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 4) {
            field594.method2300(224);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 5) {
            field594.method2300(92);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 6) {
            field594.method2300(103);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 7) {
            field594.method2300(164);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 8) {
            field594.method2300(11);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 9) {
            field594.method2300(212);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
        if (arg0 == 10) {
            field594.method2300(229);
            field594.method2414(arg1);
            field594.method2424(arg2);
        }
    }

    @ObfuscatedName("m.bu(I)V")
    public static final void method36() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field613 - 1; var1++) {
                if (field616[var1] < 1000 && field616[var1 + 1] > 1000) {
                    String var2 = field619[var1];
                    field619[var1] = field619[var1 + 1];
                    field619[var1 + 1] = var2;
                    String var3 = field618[var1];
                    field618[var1] = field618[var1 + 1];
                    field618[var1 + 1] = var3;
                    int var4 = field616[var1];
                    field616[var1] = field616[var1 + 1];
                    field616[var1 + 1] = var4;
                    int var5 = field530[var1];
                    field530[var1] = field530[var1 + 1];
                    field530[var1 + 1] = var5;
                    int var6 = field615[var1];
                    field615[var1] = field615[var1 + 1];
                    field615[var1 + 1] = var6;
                    int var7 = field617[var1];
                    field617[var1] = field617[var1 + 1];
                    field617[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ew.bl(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3048(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field612 || field613 >= 500) {
            return;
        }
        field618[field613] = arg0;
        field619[field613] = arg1;
        field616[field613] = arg2;
        field617[field613] = arg3;
        field530[field613] = arg4;
        field615[field613] = arg5;
        field613++;
    }

    @ObfuscatedName("g.ba(I)V")
    public static void method136() {
        for (int var0 = 0; var0 < field613; var0++) {
            int var1 = field616[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field613 - 1) {
                    for (int var3 = var0; var3 < field613 - 1; var3++) {
                        field618[var3] = field618[var3 + 1];
                        field619[var3] = field619[var3 + 1];
                        field616[var3] = field616[var3 + 1];
                        field617[var3] = field617[var3 + 1];
                        field530[var3] = field530[var3 + 1];
                        field615[var3] = field615[var3 + 1];
                    }
                }
                field613--;
            }
        }
    }

    @ObfuscatedName("u.be(Lae;IIII)V")
    public static final void method130(class31 arg0, int arg1, int arg2, int arg3) {
        if (field613 >= 400) {
            return;
        }
        if (arg0.field805 != null) {
            arg0 = arg0.method611();
        }
        if (arg0 == null || !arg0.field808) {
            return;
        }
        String var4 = arg0.field780;
        if (arg0.field807 != 0) {
            var4 = var4 + method637(arg0.field807, Statics.field2728.field35) + " " + class2.field19 + class135.field2252 + arg0.field807 + class2.field20;
        }
        if (field624 == 1) {
            method3048(class135.field2269, field625 + " " + class2.field21 + " " + class2.method202(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field626) {
            String[] var5 = arg0.field806;
            if (field640) {
                var5 = method111(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class135.field2248)) {
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
                        method3048(var5[var6], class2.method202(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class135.field2248)) {
                        short var9 = 0;
                        if (arg0.field807 > Statics.field2728.field35) {
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
                        method3048(var5[var8], class2.method202(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method3048(class135.field2232, class2.method202(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1268 & 0x2) == 2) {
            method3048(field628, field629 + " " + class2.field21 + " " + class2.method202(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bw.bg(Lp;IIII)V")
    public static final void method1391(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2728 == arg0 || field613 >= 400) {
            return;
        }
        String var4;
        if (arg0.field38 == 0) {
            var4 = arg0.field36 + method637(arg0.field35, Statics.field2728.field35) + " " + class2.field19 + class135.field2252 + arg0.field35 + class2.field20;
        } else {
            var4 = arg0.field36 + " " + class2.field19 + class135.field2253 + arg0.field38 + class2.field20;
        }
        if (field624 == 1) {
            method3048(class135.field2269, field625 + " " + class2.field21 + " " + class2.method202(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field626) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field601[var5] != null) {
                    short var6 = 0;
                    if (field601[var5].equalsIgnoreCase(class135.field2248)) {
                        if (arg0.field35 > Statics.field2728.field35) {
                            var6 = 2000;
                        }
                        if (Statics.field2728.field32 != 0 && arg0.field32 != 0) {
                            if (Statics.field2728.field32 == arg0.field32) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field671[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field727[var5] + var6;
                    method3048(field601[var5], class2.method202(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1268 & 0x8) == 8) {
            method3048(field628, field629 + " " + class2.field21 + " " + class2.method202(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field613; var9++) {
            if (field616[var9] == 23) {
                field619[var9] = class2.method202(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ae.cg(III)Ljava/lang/String;")
    public static final String method637(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method202(16711680);
        } else if (var2 < -6) {
            return class2.method202(16723968);
        } else if (var2 < -3) {
            return class2.method202(16740352);
        } else if (var2 < 0) {
            return class2.method202(16756736);
        } else if (var2 > 9) {
            return class2.method202(65280);
        } else if (var2 > 6) {
            return class2.method202(4259584);
        } else if (var2 > 3) {
            return class2.method202(8453888);
        } else if (var2 > 0) {
            return class2.method202(12648192);
        } else {
            return class2.method202(16776960);
        }
    }

    @ObfuscatedName("q.cm(IIIIIIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class159.method2879(arg0)) {
            Statics.field1172 = null;
            method204(Statics.field1277[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1172 != null) {
                method204(Statics.field1172, -1412584499, arg1, arg2, arg3, arg4, Statics.field203, Statics.field1274, arg7);
                Statics.field1172 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field707[var8] = true;
            }
        } else {
            field707[arg7] = true;
        }
    }

    @ObfuscatedName("w.cp([Lfl;IIIIIIIIB)V")
    public static final void method204(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1814(arg2, arg3, arg4, arg5);
        class104.method2122();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2670 == arg1 || arg1 == -1412584499 && field511 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field676[field490] = var10.field2615 + arg6;
                    field688[field490] = var10.field2616 + arg7;
                    field678[field490] = var10.field2619;
                    field563[field490] = var10.field2620;
                    var11 = ++field490 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2725 = var11;
                var10.field2621 = field479;
                if (!var10.field2694 || !method40(var10)) {
                    if (var10.field2679 > 0) {
                        int var12 = var10.field2679;
                        if (var12 == 324) {
                            if (field651 == -1) {
                                field651 = var10.field2634;
                                field725 = var10.field2623;
                            }
                            if (field729.field2750) {
                                var10.field2634 = field651;
                            } else {
                                var10.field2634 = field725;
                            }
                        } else if (var12 == 325) {
                            if (field651 == -1) {
                                field651 = var10.field2634;
                                field725 = var10.field2623;
                            }
                            if (field729.field2750) {
                                var10.field2634 = field725;
                            } else {
                                var10.field2634 = field651;
                            }
                        } else if (var12 == 327) {
                            var10.field2628 = 150;
                            var10.field2651 = (int) (Math.sin((double) field479 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2721 = 5;
                            var10.field2643 = 0;
                        } else if (var12 == 328) {
                            var10.field2628 = 150;
                            var10.field2651 = (int) (Math.sin((double) field479 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2721 = 5;
                            var10.field2643 = 1;
                        }
                    }
                    int var13 = var10.field2615 + arg6;
                    int var14 = var10.field2616 + arg7;
                    int var15 = var10.field2632;
                    if (field511 == var10) {
                        if (arg1 != -1412584499 && !var10.field2687) {
                            Statics.field1172 = arg0;
                            Statics.field203 = arg6;
                            Statics.field1274 = arg7;
                            continue;
                        }
                        if (field652 && field646) {
                            int var16 = class77.field1396;
                            int var17 = class77.field1397;
                            int var18 = var16 - field473;
                            int var19 = var17 - field644;
                            if (var18 < field647) {
                                var18 = field647;
                            }
                            if (var10.field2619 + var18 > field647 + field642.field2619) {
                                var18 = field647 + field642.field2619 - var10.field2619;
                            }
                            if (var19 < field648) {
                                var19 = field648;
                            }
                            if (var10.field2620 + var19 > field648 + field642.field2620) {
                                var19 = field648 + field642.field2620 - var10.field2620;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2687) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2612 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2612 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2619 + var13;
                        int var27 = var10.field2620 + var14;
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
                        int var30 = var10.field2619 + var13;
                        int var31 = var10.field2620 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2694 || var20 < var22 && var21 < var23) {
                        if (var10.field2679 != 0) {
                            if (var10.field2679 == 1337) {
                                field665 = var13;
                                field621 = var14;
                                method25(var13, var14, var10.field2619, var10.field2620);
                                class89.method1814(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2679 == 1338) {
                                method807();
                                class89.method1814(var13, var14, Statics.field201.field1489 + var13, Statics.field201.field1494 + var14);
                                if (field705 == 2 || field705 == 5) {
                                    class89.method1810(var13 + 25, var14 + 5, 0, Statics.field465, Statics.field1989);
                                } else {
                                    int var32 = field700 + field555 & 0x7FF;
                                    int var33 = Statics.field2728.field467 / 32 + 48;
                                    int var34 = 464 - Statics.field2728.field409 / 32;
                                    Statics.field389.method1702(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field599 + 256, Statics.field465, Statics.field1989);
                                    for (int var35 = 0; var35 < field699; var35++) {
                                        int var36 = field602[var35] * 4 + 2 - Statics.field2728.field467 / 32;
                                        int var37 = field701[var35] * 4 + 2 - Statics.field2728.field409 / 32;
                                        Statics.method85(var13, var14, var36, var37, field581[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class177 var40 = field604[Statics.field2104][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field2728.field467 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field2728.field409 / 32;
                                                Statics.method85(var13, var14, var41, var42, Statics.field1850[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field661; var43++) {
                                        class25 var44 = field509[field607[var43]];
                                        if (var44 != null && var44.method21()) {
                                            class31 var45 = var44.field387;
                                            if (var45 != null && var45.field805 != null) {
                                                var45 = var45.method611();
                                            }
                                            if (var45 != null && var45.field776 && var45.field808) {
                                                int var46 = var44.field467 / 32 - Statics.field2728.field467 / 32;
                                                int var47 = var44.field409 / 32 - Statics.field2728.field409 / 32;
                                                Statics.method85(var13, var14, var46, var47, Statics.field1850[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field591; var48++) {
                                        class3 var49 = field675[field592[var48]];
                                        if (var49 != null && var49.method21()) {
                                            int var50 = var49.field467 / 32 - Statics.field2728.field467 / 32;
                                            int var51 = var49.field409 / 32 - Statics.field2728.field409 / 32;
                                            boolean var52 = false;
                                            if (method166(var49.field36)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            for (int var54 = 0; var54 < Statics.field1983; var54++) {
                                                if (var49.field36.equals(Statics.field2355[var54].field110)) {
                                                    var53 = true;
                                                    break;
                                                }
                                            }
                                            boolean var55 = false;
                                            if (Statics.field2728.field32 != 0 && var49.field32 != 0 && Statics.field2728.field32 == var49.field32) {
                                                var55 = true;
                                            }
                                            if (var52) {
                                                Statics.method85(var13, var14, var50, var51, Statics.field1850[3]);
                                            } else if (var55) {
                                                Statics.method85(var13, var14, var50, var51, Statics.field1850[4]);
                                            } else if (var53) {
                                                Statics.method85(var13, var14, var50, var51, Statics.field1850[5]);
                                            } else {
                                                Statics.method85(var13, var14, var50, var51, Statics.field1850[2]);
                                            }
                                        }
                                    }
                                    if (field657 != 0 && field479 % 20 < 10) {
                                        if (field657 == 1 && field525 >= 0 && field525 < field509.length) {
                                            class25 var56 = field509[field525];
                                            if (var56 != null) {
                                                int var57 = var56.field467 / 32 - Statics.field2728.field467 / 32;
                                                int var58 = var56.field409 / 32 - Statics.field2728.field409 / 32;
                                                method28(var13, var14, var57, var58, Statics.field2796[1]);
                                            }
                                        }
                                        if (field657 == 2) {
                                            int var59 = field541 * 4 - Statics.field920 * 4 + 2 - Statics.field2728.field467 / 32;
                                            int var60 = field491 * 4 - Statics.field1822 * 4 + 2 - Statics.field2728.field409 / 32;
                                            method28(var13, var14, var59, var60, Statics.field2796[1]);
                                        }
                                        if (field657 == 10 && field489 >= 0 && field489 < field675.length) {
                                            class3 var61 = field675[field489];
                                            if (var61 != null) {
                                                int var62 = var61.field467 / 32 - Statics.field2728.field467 / 32;
                                                int var63 = var61.field409 / 32 - Statics.field2728.field409 / 32;
                                                method28(var13, var14, var62, var63, Statics.field2796[1]);
                                            }
                                        }
                                    }
                                    if (field710 != 0) {
                                        int var64 = field710 * 4 + 2 - Statics.field2728.field467 / 32;
                                        int var65 = field583 * 4 + 2 - Statics.field2728.field409 / 32;
                                        Statics.method85(var13, var14, var64, var65, Statics.field2796[0]);
                                    }
                                    class89.method1817(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field705 < 3) {
                                    Statics.field1934.method1702(var13, var14, 33, 33, 25, 25, field555, 256, Statics.field902, Statics.field24);
                                } else {
                                    class89.method1810(var13, var14, 0, Statics.field902, Statics.field24);
                                }
                                if (field704[var11]) {
                                    Statics.field201.method1771(var13, var14);
                                }
                                field674[var11] = true;
                                class89.method1814(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2612 == 0) {
                            if (!var10.field2694 && method40(var10) && Statics.field1308 != var10) {
                                continue;
                            }
                            if (!var10.field2694) {
                                if (var10.field2624 > var10.field2626 - var10.field2620) {
                                    var10.field2624 = var10.field2626 - var10.field2620;
                                }
                                if (var10.field2624 < 0) {
                                    var10.field2624 = 0;
                                }
                            }
                            method204(arg0, var10.field2686, var20, var21, var22, var23, var13 - var10.field2617, var14 - var10.field2624, var11);
                            if (var10.field2718 != null) {
                                method204(var10.field2718, var10.field2686, var20, var21, var22, var23, var13 - var10.field2617, var14 - var10.field2624, var11);
                            }
                            class4 var66 = (class4) field631.method3260((long) var10.field2686);
                            if (var66 != null) {
                                method3(var66.field57, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class89.method1814(arg2, arg3, arg4, arg5);
                            class104.method2122();
                        }
                        if (field704[var11] || field680 > 1) {
                            if (var10.field2612 == 0 && !var10.field2694 && var10.field2626 > var10.field2620) {
                                method1205(var10.field2619 + var13, var14, var10.field2624, var10.field2620, var10.field2626);
                            }
                            if (var10.field2612 != 1) {
                                if (var10.field2612 == 2) {
                                    int var67 = 0;
                                    for (int var68 = 0; var68 < var10.field2620; var68++) {
                                        for (int var69 = 0; var69 < var10.field2619; var69++) {
                                            int var70 = (var10.field2635 + 32) * var69 + var13;
                                            int var71 = (var10.field2664 + 32) * var68 + var14;
                                            if (var67 < 20) {
                                                var70 += var10.field2665[var67];
                                                var71 += var10.field2663[var67];
                                            }
                                            if (var10.field2614[var67] > 0) {
                                                boolean var72 = false;
                                                boolean var73 = false;
                                                int var74 = var10.field2614[var67] - 1;
                                                if (var70 + 32 > arg2 && var70 < arg4 && var71 + 32 > arg3 && var71 < arg5 || Statics.field733 == var10 && field549 == var67) {
                                                    class86 var75;
                                                    if (field624 == 1 && Statics.field205 == var67 && Statics.field1554 == var10.field2686) {
                                                        var75 = class40.method1532(var74, var10.field2715[var67], 2, 0, false);
                                                    } else {
                                                        var75 = class40.method1532(var74, var10.field2715[var67], 1, 3153952, false);
                                                    }
                                                    if (var75 == null) {
                                                        method2291(var10);
                                                    } else if (Statics.field733 == var10 && field549 == var67) {
                                                        int var76 = class77.field1396 - field584;
                                                        int var77 = class77.field1397 - field585;
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (var77 < 5 && var77 > -5) {
                                                            var77 = 0;
                                                        }
                                                        if (field588 < 5) {
                                                            var76 = 0;
                                                            var77 = 0;
                                                        }
                                                        var75.method1698(var70 + var76, var71 + var77, 128);
                                                        if (arg1 != -1) {
                                                            class159 var78 = arg0[arg1 & 0xFFFF];
                                                            if (var71 + var77 < class89.field1500 && var78.field2624 > 0) {
                                                                int var79 = field547 * (class89.field1500 - var71 - var77) / 3;
                                                                if (var79 > field547 * 10) {
                                                                    var79 = field547 * 10;
                                                                }
                                                                if (var79 > var78.field2624) {
                                                                    var79 = var78.field2624;
                                                                }
                                                                var78.field2624 -= var79;
                                                                field585 += var79;
                                                                method2291(var78);
                                                            }
                                                            if (var71 + var77 + 32 > class89.field1501 && var78.field2624 < var78.field2626 - var78.field2620) {
                                                                int var80 = field547 * (var71 + var77 + 32 - class89.field1501) / 3;
                                                                if (var80 > field547 * 10) {
                                                                    var80 = field547 * 10;
                                                                }
                                                                if (var80 > var78.field2626 - var78.field2620 - var78.field2624) {
                                                                    var80 = var78.field2626 - var78.field2620 - var78.field2624;
                                                                }
                                                                var78.field2624 += var80;
                                                                field585 -= var80;
                                                                method2291(var78);
                                                            }
                                                        }
                                                    } else if (Statics.field1106 == var10 && field582 == var67) {
                                                        var75.method1698(var70, var71, 128);
                                                    } else {
                                                        var75.method1692(var70, var71);
                                                    }
                                                }
                                            } else if (var10.field2667 != null && var67 < 20) {
                                                class86 var81 = var10.method3093(var67);
                                                if (var81 != null) {
                                                    var81.method1692(var70, var71);
                                                } else if (class159.field2608) {
                                                    method2291(var10);
                                                }
                                            }
                                            var67++;
                                        }
                                    }
                                } else if (var10.field2612 == 3) {
                                    int var82;
                                    if (method3205(var10)) {
                                        var82 = var10.field2709;
                                        if (Statics.field1308 == var10 && var10.field2630 != 0) {
                                            var82 = var10.field2630;
                                        }
                                    } else {
                                        var82 = var10.field2627;
                                        if (Statics.field1308 == var10 && var10.field2629 != 0) {
                                            var82 = var10.field2629;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2631) {
                                            class89.method1817(var13, var14, var10.field2619, var10.field2620, var82);
                                        } else {
                                            class89.method1794(var13, var14, var10.field2619, var10.field2620, var82);
                                        }
                                    } else if (var10.field2631) {
                                        class89.method1809(var13, var14, var10.field2619, var10.field2620, var82, 256 - (var15 & 0xFF));
                                    } else {
                                        class89.method1792(var13, var14, var10.field2619, var10.field2620, var82, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2612 == 4) {
                                    class183 var83 = var10.method3092();
                                    if (var83 != null) {
                                        String var84 = var10.field2657;
                                        int var85;
                                        if (method3205(var10)) {
                                            var85 = var10.field2709;
                                            if (Statics.field1308 == var10 && var10.field2630 != 0) {
                                                var85 = var10.field2630;
                                            }
                                            if (var10.field2602.length() > 0) {
                                                var84 = var10.field2602;
                                            }
                                        } else {
                                            var85 = var10.field2627;
                                            if (Statics.field1308 == var10 && var10.field2629 != 0) {
                                                var85 = var10.field2629;
                                            }
                                        }
                                        if (var10.field2694 && var10.field2714 != -1) {
                                            class40 var86 = class40.method782(var10.field2714);
                                            var84 = var86.field982;
                                            if (var84 == null) {
                                                var84 = "null";
                                            }
                                            if ((var86.field994 == 1 || var10.field2641 != 1) && var10.field2641 != -1) {
                                                var84 = class2.method202(16748608) + var84 + class2.field23 + " " + 'x' + method1390(var10.field2641);
                                            }
                                        }
                                        if (field634 == var10) {
                                            class135 var10000 = (class135) null;
                                            var84 = class135.field2158;
                                            var85 = var10.field2627;
                                        }
                                        if (!var10.field2694) {
                                            var84 = method209(var84, var10);
                                        }
                                        var83.method3352(var84, var13, var14, var10.field2619, var10.field2620, var85, var10.field2662 ? 0 : -1, var10.field2609, var10.field2661, var10.field2659);
                                    } else if (class159.field2608) {
                                        method2291(var10);
                                    }
                                } else if (var10.field2612 == 5) {
                                    if (var10.field2694) {
                                        class86 var88;
                                        if (var10.field2714 == -1) {
                                            var88 = var10.method3102(false);
                                        } else {
                                            var88 = class40.method1532(var10.field2714, var10.field2641, var10.field2638, var10.field2671, false);
                                        }
                                        if (var88 != null) {
                                            int var89 = var88.field1478;
                                            int var90 = var88.field1482;
                                            if (var10.field2637) {
                                                class89.method1804(var13, var14, var10.field2619 + var13, var10.field2620 + var14);
                                                int var91 = (var10.field2619 + (var89 - 1)) / var89;
                                                int var92 = (var10.field2620 + (var90 - 1)) / var90;
                                                for (int var93 = 0; var93 < var91; var93++) {
                                                    for (int var94 = 0; var94 < var92; var94++) {
                                                        if (var10.field2672 != 0) {
                                                            var88.method1731(var89 / 2 + var89 * var93 + var13, var90 / 2 + var90 * var94 + var14, var10.field2672, 4096);
                                                        } else if (var15 == 0) {
                                                            var88.method1692(var89 * var93 + var13, var90 * var94 + var14);
                                                        } else {
                                                            var88.method1698(var89 * var93 + var13, var90 * var94 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1814(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var95 = var10.field2619 * 4096 / var89;
                                                if (var10.field2672 != 0) {
                                                    var88.method1731(var10.field2619 / 2 + var13, var10.field2620 / 2 + var14, var10.field2672, var95);
                                                } else if (var15 != 0) {
                                                    var88.method1700(var13, var14, var10.field2619, var10.field2620, 256 - (var15 & 0xFF));
                                                } else if (var10.field2619 == var89 && var10.field2620 == var90) {
                                                    var88.method1692(var13, var14);
                                                } else {
                                                    var88.method1704(var13, var14, var10.field2619, var10.field2620);
                                                }
                                            }
                                        } else if (class159.field2608) {
                                            method2291(var10);
                                        }
                                    } else {
                                        class86 var87 = var10.method3102(method3205(var10));
                                        if (var87 != null) {
                                            var87.method1692(var13, var14);
                                        } else if (class159.field2608) {
                                            method2291(var10);
                                        }
                                    }
                                } else if (var10.field2612 == 6) {
                                    boolean var96 = method3205(var10);
                                    int var97;
                                    if (var96) {
                                        var97 = var10.field2636;
                                    } else {
                                        var97 = var10.field2726;
                                    }
                                    class112 var98 = null;
                                    int var99 = 0;
                                    if (var10.field2714 != -1) {
                                        class40 var100 = class40.method782(var10.field2714);
                                        if (var100 != null) {
                                            class40 var101 = var100.method827(var10.field2641);
                                            var98 = var101.method832(1);
                                            if (var98 == null) {
                                                method2291(var10);
                                            } else {
                                                var98.method2213();
                                                var99 = var98.field1555 / 2;
                                            }
                                        }
                                    } else if (var10.field2721 == 5) {
                                        if (var10.field2643 == 0) {
                                            var98 = field729.method3185((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var98 = Statics.field2728.method17();
                                        }
                                    } else if (var97 == -1) {
                                        var98 = var10.method3094((class34) null, -1, var96, Statics.field2728.field34);
                                        if (var98 == null && class159.field2608) {
                                            method2291(var10);
                                        }
                                    } else {
                                        class34 var102 = class34.method2178(var97);
                                        var98 = var10.method3094(var102, var10.field2716, var96, Statics.field2728.field34);
                                        if (var98 == null && class159.field2608) {
                                            method2291(var10);
                                        }
                                    }
                                    class104.method2119(var10.field2619 / 2 + var13, var10.field2620 / 2 + var14);
                                    int var103 = var10.field2653 * class104.field1786[var10.field2628] >> 16;
                                    int var104 = var10.field2653 * class104.field1766[var10.field2628] >> 16;
                                    if (var98 != null) {
                                        if (var10.field2694) {
                                            var98.method2213();
                                            if (var10.field2655) {
                                                var98.method2281(0, var10.field2651, var10.field2652, var10.field2628, var10.field2648, var10.field2649 + var99 + var103, var10.field2649 + var104, var10.field2653);
                                            } else {
                                                var98.method2225(0, var10.field2651, var10.field2652, var10.field2628, var10.field2648, var10.field2649 + var99 + var103, var10.field2649 + var104);
                                            }
                                        } else {
                                            var98.method2225(0, var10.field2651, 0, var10.field2628, 0, var103, var104);
                                        }
                                    }
                                    class104.method2104();
                                } else {
                                    if (var10.field2612 == 7) {
                                        class183 var105 = var10.method3092();
                                        if (var105 == null) {
                                            if (class159.field2608) {
                                                method2291(var10);
                                            }
                                            continue;
                                        }
                                        int var106 = 0;
                                        for (int var107 = 0; var107 < var10.field2620; var107++) {
                                            for (int var108 = 0; var108 < var10.field2619; var108++) {
                                                if (var10.field2614[var106] > 0) {
                                                    class40 var109 = class40.method782(var10.field2614[var106] - 1);
                                                    String var110;
                                                    if (var109.field994 != 1 && var10.field2715[var106] == 1) {
                                                        var110 = class2.method202(16748608) + var109.field982 + class2.field23;
                                                    } else {
                                                        var110 = class2.method202(16748608) + var109.field982 + class2.field23 + " " + 'x' + method1390(var10.field2715[var106]);
                                                    }
                                                    int var111 = (var10.field2635 + 115) * var108 + var13;
                                                    int var112 = (var10.field2664 + 12) * var107 + var14;
                                                    if (var10.field2609 == 0) {
                                                        var105.method3350(var110, var111, var112, var10.field2627, var10.field2662 ? 0 : -1);
                                                    } else if (var10.field2609 == 1) {
                                                        var105.method3384(var110, var10.field2619 / 2 + var111, var112, var10.field2627, var10.field2662 ? 0 : -1);
                                                    } else {
                                                        var105.method3351(var110, var10.field2619 + var111 - 1, var112, var10.field2627, var10.field2662 ? 0 : -1);
                                                    }
                                                }
                                                var106++;
                                            }
                                        }
                                    }
                                    if (var10.field2612 == 8 && Statics.field53 == var10 && field622 == field614) {
                                        int var113 = 0;
                                        int var114 = 0;
                                        class183 var115 = Statics.field1261;
                                        String var116 = var10.field2657;
                                        String var117 = method209(var116, var10);
                                        while (var117.length() > 0) {
                                            int var118 = var117.indexOf(class2.field25);
                                            String var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = "";
                                            } else {
                                                var119 = var117.substring(0, var118);
                                                var117 = var117.substring(var118 + 4);
                                            }
                                            int var120 = var115.method3345(var119);
                                            if (var120 > var113) {
                                                var113 = var120;
                                            }
                                            var114 += var115.field2850 + 1;
                                        }
                                        var113 += 6;
                                        var114 += 7;
                                        int var121 = var10.field2619 + var13 - 5 - var113;
                                        int var122 = var10.field2620 + var14 + 5;
                                        if (var121 < var13 + 5) {
                                            var121 = var13 + 5;
                                        }
                                        if (var113 + var121 > arg4) {
                                            var121 = arg4 - var113;
                                        }
                                        if (var114 + var122 > arg5) {
                                            var122 = arg5 - var114;
                                        }
                                        class89.method1817(var121, var122, var113, var114, 16777120);
                                        class89.method1794(var121, var122, var113, var114, 0);
                                        String var123 = var10.field2657;
                                        int var124 = var115.field2850 + var122 + 2;
                                        String var125 = method209(var123, var10);
                                        while (var125.length() > 0) {
                                            int var126 = var125.indexOf(class2.field25);
                                            String var127;
                                            if (var126 == -1) {
                                                var127 = var125;
                                                var125 = "";
                                            } else {
                                                var127 = var125.substring(0, var126);
                                                var125 = var125.substring(var126 + 4);
                                            }
                                            var115.method3350(var127, var121 + 3, var124, 0, -1);
                                            var124 += var115.field2850 + 1;
                                        }
                                    }
                                    if (var10.field2612 == 9) {
                                        if (var10.field2633 == 1) {
                                            class89.method1800(var13, var14, var10.field2619 + var13, var10.field2620 + var14, var10.field2627);
                                        } else {
                                            int var128 = var10.field2619 >= 0 ? var10.field2619 : -var10.field2619;
                                            int var129 = var10.field2620 >= 0 ? var10.field2620 : -var10.field2620;
                                            int var130 = var128;
                                            if (var128 < var129) {
                                                var130 = var129;
                                            }
                                            if (var130 != 0) {
                                                int var131 = (var10.field2619 << 16) / var130;
                                                int var132 = (var10.field2620 << 16) / var130;
                                                if (var132 <= var131) {
                                                    var131 = -var131;
                                                } else {
                                                    var132 = -var132;
                                                }
                                                int var133 = var10.field2633 * var132 >> 17;
                                                int var134 = var10.field2633 * var132 + 1 >> 17;
                                                int var135 = var10.field2633 * var131 >> 17;
                                                int var136 = var10.field2633 * var131 + 1 >> 17;
                                                int var137 = var13 + var133;
                                                int var138 = var13 - var134;
                                                int var139 = var10.field2619 + var13 - var134;
                                                int var140 = var10.field2619 + var13 + var133;
                                                int var141 = var14 + var135;
                                                int var142 = var14 - var136;
                                                int var143 = var10.field2620 + var14 - var136;
                                                int var144 = var10.field2620 + var14 + var135;
                                                class104.method2109(var137, var138, var139);
                                                class104.method2112(var141, var142, var143, var137, var138, var139, var10.field2627);
                                                class104.method2109(var137, var139, var140);
                                                class104.method2112(var141, var143, var144, var137, var139, var140, var10.field2627);
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

    @ObfuscatedName("x.ch(Ljava/lang/String;Lfl;I)Ljava/lang/String;")
    public static String method209(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method685(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var7 = arg0.indexOf("%dns");
                if (var7 == -1) {
                    break;
                }
                String var8 = "";
                if (Statics.field728 != null) {
                    int var9 = Statics.field728.field1411;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field728.field1419 != null) {
                        var8 = (String) Statics.field728.field1419;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bw.co(II)Ljava/lang/String;")
    public static final String method1390(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method202(65408) + var1.substring(0, var1.length() - 8) + class135.field2270 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method202(16777215) + var1.substring(0, var1.length() - 4) + class135.field2259 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else {
            return " " + class2.method202(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("d.cb(Lfl;IIIIIII)V")
    public static final void method58(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field552) {
            field620 = 32;
        } else {
            field620 = 0;
        }
        field552 = false;
        if (class77.field1393 == 1 || !Statics.field752 && class77.field1393 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2624 -= 4;
                method2291(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2624 += 4;
                method2291(arg0);
            } else if (arg5 >= arg1 - field620 && arg5 < field620 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2624 = (arg4 - arg3) * var8 / var9;
                method2291(arg0);
                field552 = true;
            }
        }
        if (field666 == 0) {
            return;
        }
        int var10 = arg0.field2619;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2624 += field666 * 45;
            method2291(arg0);
        }
    }

    @ObfuscatedName("aw.cc(IIIIII)V")
    public static final void method1205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1253[0].method1771(arg0, arg1);
        Statics.field1253[1].method1771(arg0, arg1 + arg3 - 16);
        class89.method1817(arg0, arg1 + 16, 16, arg3 - 32, field548);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1817(arg0, arg1 + 16 + var6, 16, var5, field714);
        class89.method1798(arg0, arg1 + 16 + var6, var5, field551);
        class89.method1798(arg0 + 1, arg1 + 16 + var6, var5, field551);
        class89.method1796(arg0, arg1 + 16 + var6, 16, field551);
        class89.method1796(arg0, arg1 + 17 + var6, 16, field551);
        class89.method1798(arg0 + 15, arg1 + 16 + var6, var5, field554);
        class89.method1798(arg0 + 14, arg1 + 17 + var6, var5 - 1, field554);
        class89.method1796(arg0, arg1 + 15 + var6 + var5, 16, field554);
        class89.method1796(arg0 + 1, arg1 + 14 + var6 + var5, 15, field554);
    }

    @ObfuscatedName("fe.cf(Lfl;B)Z")
    public static final boolean method3205(class159 arg0) {
        if (arg0.field2707 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2707.length; var1++) {
            int var2 = method685(arg0, var1);
            int var3 = arg0.field2708[var1];
            if (arg0.field2707[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2707[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2707[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("az.cq(Lfl;IB)I")
    public static final int method685(class159 arg0, int arg1) {
        if (arg0.field2706 == null || arg1 >= arg0.field2706.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2706[arg1];
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
                    var7 = field608[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field609[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field649[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method145(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method782(var12).field995 || field474)) {
                        for (int var13 = 0; var13 < var11.field2614.length; var13++) {
                            if (var12 + 1 == var11.field2614[var13]) {
                                var7 += var11.field2715[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2731[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2070[field609[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2731[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2728.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2069[var14]) {
                            var7 += field609[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method145(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method782(var18).field995 || field474)) {
                        for (int var19 = 0; var19 < var17.field2614.length; var19++) {
                            if (var18 + 1 == var17.field2614[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field635;
                }
                if (var6 == 12) {
                    var7 = field636;
                }
                if (var6 == 13) {
                    int var20 = class160.field2731[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method2965(var22);
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
                    var7 = (Statics.field2728.field467 >> 7) + Statics.field920;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2728.field409 >> 7) + Statics.field1822;
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

    @ObfuscatedName("r.cr(Lfl;III)V")
    public static final void method117(class159 arg0, int arg1, int arg2) {
        if (arg0.field2613 == 1) {
            method3048(arg0.field2606, "", 24, 0, 0, arg0.field2686);
        }
        if (arg0.field2613 == 2 && !field626) {
            String var3 = method765(arg0);
            if (var3 != null) {
                method3048(var3, class2.method202(65280) + arg0.field2604, 25, 0, -1, arg0.field2686);
            }
        }
        if (arg0.field2613 == 3) {
            method3048(class135.field2255, "", 26, 0, 0, arg0.field2686);
        }
        if (arg0.field2613 == 4) {
            method3048(arg0.field2606, "", 28, 0, 0, arg0.field2686);
        }
        if (arg0.field2613 == 5) {
            method3048(arg0.field2606, "", 29, 0, 0, arg0.field2686);
        }
        if (arg0.field2613 == 6 && field634 == null) {
            method3048(arg0.field2606, "", 30, 0, -1, arg0.field2686);
        }
        if (arg0.field2612 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2620; var5++) {
                for (int var6 = 0; var6 < arg0.field2619; var6++) {
                    int var7 = (arg0.field2635 + 32) * var6;
                    int var8 = (arg0.field2664 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2665[var4];
                        var8 += arg0.field2663[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field687 = var4;
                        Statics.field1817 = arg0;
                        if (arg0.field2614[var4] > 0) {
                            class40 var9 = class40.method782(arg0.field2614[var4] - 1);
                            if (field624 == 1 && class163.method1648(method1436(arg0))) {
                                if (Statics.field1554 != arg0.field2686 || Statics.field205 != var4) {
                                    method3048(class135.field2269, field625 + " " + class2.field21 + " " + class2.method202(16748608) + var9.field982, 31, var9.field980, var4, arg0.field2686);
                                }
                            } else if (!field626 || !class163.method1648(method1436(arg0))) {
                                String[] var10 = var9.field1006;
                                if (field640) {
                                    var10 = method111(var10);
                                }
                                if (class163.method1648(method1436(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method3048(var10[var11], class2.method202(16748608) + var9.field982, var12, var9.field980, var4, arg0.field2686);
                                        } else if (var11 == 4) {
                                            method3048(class135.field2107, class2.method202(16748608) + var9.field982, 37, var9.field980, var4, arg0.field2686);
                                        }
                                    }
                                }
                                if (class163.method106(method1436(arg0))) {
                                    method3048(class135.field2269, class2.method202(16748608) + var9.field982, 38, var9.field980, var4, arg0.field2686);
                                }
                                if (class163.method1648(method1436(arg0)) && var10 != null) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var10[var13] != null) {
                                            byte var14 = 0;
                                            if (var13 == 0) {
                                                var14 = 33;
                                            }
                                            if (var13 == 1) {
                                                var14 = 34;
                                            }
                                            if (var13 == 2) {
                                                var14 = 35;
                                            }
                                            method3048(var10[var13], class2.method202(16748608) + var9.field982, var14, var9.field980, var4, arg0.field2686);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2695;
                                if (field640) {
                                    var15 = method111(var15);
                                }
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method3048(var15[var16], class2.method202(16748608) + var9.field982, var17, var9.field980, var4, arg0.field2686);
                                        }
                                    }
                                }
                                method3048(class135.field2232, class2.method202(16748608) + var9.field982, 1005, var9.field980, var4, arg0.field2686);
                            } else if ((Statics.field1268 & 0x10) == 16) {
                                method3048(field628, field629 + " " + class2.field21 + " " + class2.method202(16748608) + var9.field982, 32, var9.field980, var4, arg0.field2686);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2694) {
            return;
        }
        if (!field626) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19;
                if (!class163.method564(method1436(arg0), var18) && arg0.field2697 == null) {
                    var19 = null;
                } else if (arg0.field2646 == null || arg0.field2646.length <= var18 || arg0.field2646[var18] == null || arg0.field2646[var18].trim().length() == 0) {
                    var19 = null;
                } else {
                    var19 = arg0.field2646[var18];
                }
                if (var19 != null) {
                    method3048(var19, arg0.field2601, 1007, var18 + 1, arg0.field2611, arg0.field2686);
                }
            }
            String var21 = method765(arg0);
            if (var21 != null) {
                method3048(var21, arg0.field2601, 25, 0, arg0.field2611, arg0.field2686);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                String var23;
                if (!class163.method564(method1436(arg0), var22) && arg0.field2697 == null) {
                    var23 = null;
                } else if (arg0.field2646 == null || arg0.field2646.length <= var22 || arg0.field2646[var22] == null || arg0.field2646[var22].trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = arg0.field2646[var22];
                }
                if (var23 != null) {
                    method3048(var23, arg0.field2601, 57, var22 + 1, arg0.field2611, arg0.field2686);
                }
            }
            if (class163.method3141(method1436(arg0))) {
                method3048(class135.field2111, "", 30, 0, arg0.field2611, arg0.field2686);
            }
        } else if (class163.method143(method1436(arg0)) && (Statics.field1268 & 0x20) == 32) {
            method3048(field628, field629 + " " + class2.field21 + " " + arg0.field2601, 58, 0, arg0.field2611, arg0.field2686);
        }
    }

    @ObfuscatedName("bz.cl([Lfl;IIIIIIII)V")
    public static final void method1397(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2694 || var9.field2612 == 0 || var9.field2677 || method1436(var9) != 0 || field642 == var9) && var9.field2670 == arg1 && (!var9.field2694 || !method40(var9))) {
                int var10 = var9.field2615 + arg6;
                int var11 = var9.field2616 + arg7;
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
                    int var18 = var9.field2619 + var10;
                    int var19 = var9.field2620 + var11;
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
                    int var22 = var9.field2619 + var10;
                    int var23 = var9.field2620 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field511 == var9) {
                    field593 = true;
                    field650 = var10;
                    field497 = var11;
                }
                if (!var9.field2694 || var12 < var14 && var13 < var15) {
                    int var24 = class77.field1396;
                    int var25 = class77.field1397;
                    if (class77.field1402 != 0) {
                        var24 = class77.field1403;
                        var25 = class77.field1407;
                    }
                    if (var9.field2679 == 1337) {
                        method2291(var9);
                        if (!field516 && !field612 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            Statics.method2205(var24, var25, var12, var13);
                        }
                    } else if (var9.field2679 != 1338) {
                        if (!field612 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method117(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2612 == 0) {
                            if (!var9.field2694 && method40(var9) && Statics.field1308 != var9) {
                                continue;
                            }
                            method1397(arg0, var9.field2686, var12, var13, var14, var15, var10 - var9.field2617, var11 - var9.field2624);
                            if (var9.field2718 != null) {
                                method1397(var9.field2718, var9.field2686, var12, var13, var14, var15, var10 - var9.field2617, var11 - var9.field2624);
                            }
                            class4 var37 = (class4) field631.method3260((long) var9.field2686);
                            if (var37 != null) {
                                if (var37.field52 == 0 && class77.field1396 >= var12 && class77.field1397 >= var13 && class77.field1396 < var14 && class77.field1397 < var15 && !field612 && !field639) {
                                    field618[0] = class135.field2329;
                                    field619[0] = "";
                                    field616[0] = 1006;
                                    field613 = 1;
                                }
                                int var38 = var37.field57;
                                if (class159.method2879(var38)) {
                                    method1397(Statics.field1277[var38], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2694) {
                            if (var9.field2727 && class77.field1396 >= var12 && class77.field1397 >= var13 && class77.field1396 < var14 && class77.field1397 < var15) {
                                for (class1 var39 = (class1) field667.method3286(); var39 != null; var39 = (class1) field667.method3302()) {
                                    if (var39.field2) {
                                        var39.method3309();
                                        var39.field3.field2719 = false;
                                    }
                                }
                                if (Statics.field1380 == 0) {
                                    field511 = null;
                                    field642 = null;
                                }
                                if (!field612) {
                                    field618[0] = class135.field2329;
                                    field619[0] = "";
                                    field616[0] = 1006;
                                    field613 = 1;
                                }
                            }
                            boolean var40;
                            if (class77.field1396 >= var12 && class77.field1397 >= var13 && class77.field1396 < var14 && class77.field1397 < var15) {
                                var40 = true;
                            } else {
                                var40 = false;
                            }
                            boolean var41 = false;
                            if ((class77.field1393 == 1 || !Statics.field752 && class77.field1393 == 4) && var40) {
                                var41 = true;
                            }
                            boolean var42 = false;
                            if ((class77.field1402 == 1 || !Statics.field752 && class77.field1402 == 4) && class77.field1403 >= var12 && class77.field1407 >= var13 && class77.field1403 < var14 && class77.field1407 < var15) {
                                var42 = true;
                            }
                            if (var42) {
                                Statics.method215(var9, class77.field1403 - var10, class77.field1407 - var11);
                            }
                            if (field511 != null && field511 != var9 && var40 && class163.method892(method1436(var9))) {
                                field645 = var9;
                            }
                            if (field642 == var9) {
                                field646 = true;
                                field647 = var10;
                                field648 = var11;
                            }
                            if (var9.field2677) {
                                if (var40 && field666 != 0 && var9.field2698 != null) {
                                    class1 var43 = new class1();
                                    var43.field2 = true;
                                    var43.field3 = var9;
                                    var43.field14 = field666;
                                    var43.field9 = var9.field2698;
                                    field667.method3288(var43);
                                }
                                if (field511 != null || Statics.field733 != null || field612) {
                                    var42 = false;
                                    var41 = false;
                                    var40 = false;
                                }
                                if (!var9.field2720 && var42) {
                                    var9.field2720 = true;
                                    if (var9.field2650 != null) {
                                        class1 var44 = new class1();
                                        var44.field2 = true;
                                        var44.field3 = var9;
                                        var44.field4 = class77.field1403 - var10;
                                        var44.field14 = class77.field1407 - var11;
                                        var44.field9 = var9.field2650;
                                        field667.method3288(var44);
                                    }
                                }
                                if (var9.field2720 && var41 && var9.field2680 != null) {
                                    class1 var45 = new class1();
                                    var45.field2 = true;
                                    var45.field3 = var9;
                                    var45.field4 = class77.field1396 - var10;
                                    var45.field14 = class77.field1397 - var11;
                                    var45.field9 = var9.field2680;
                                    field667.method3288(var45);
                                }
                                if (var9.field2720 && !var41) {
                                    var9.field2720 = false;
                                    if (var9.field2681 != null) {
                                        class1 var46 = new class1();
                                        var46.field2 = true;
                                        var46.field3 = var9;
                                        var46.field4 = class77.field1396 - var10;
                                        var46.field14 = class77.field1397 - var11;
                                        var46.field9 = var9.field2681;
                                        field669.method3288(var46);
                                    }
                                }
                                if (var41 && var9.field2682 != null) {
                                    class1 var47 = new class1();
                                    var47.field2 = true;
                                    var47.field3 = var9;
                                    var47.field4 = class77.field1396 - var10;
                                    var47.field14 = class77.field1397 - var11;
                                    var47.field9 = var9.field2682;
                                    field667.method3288(var47);
                                }
                                if (!var9.field2719 && var40) {
                                    var9.field2719 = true;
                                    if (var9.field2683 != null) {
                                        class1 var48 = new class1();
                                        var48.field2 = true;
                                        var48.field3 = var9;
                                        var48.field4 = class77.field1396 - var10;
                                        var48.field14 = class77.field1397 - var11;
                                        var48.field9 = var9.field2683;
                                        field667.method3288(var48);
                                    }
                                }
                                if (var9.field2719 && var40 && var9.field2722 != null) {
                                    class1 var49 = new class1();
                                    var49.field2 = true;
                                    var49.field3 = var9;
                                    var49.field4 = class77.field1396 - var10;
                                    var49.field14 = class77.field1397 - var11;
                                    var49.field9 = var9.field2722;
                                    field667.method3288(var49);
                                }
                                if (var9.field2719 && !var40) {
                                    var9.field2719 = false;
                                    if (var9.field2685 != null) {
                                        class1 var50 = new class1();
                                        var50.field2 = true;
                                        var50.field3 = var9;
                                        var50.field4 = class77.field1396 - var10;
                                        var50.field14 = class77.field1397 - var11;
                                        var50.field9 = var9.field2685;
                                        field669.method3288(var50);
                                    }
                                }
                                if (var9.field2696 != null) {
                                    class1 var51 = new class1();
                                    var51.field3 = var9;
                                    var51.field9 = var9.field2696;
                                    field586.method3288(var51);
                                }
                                if (var9.field2701 != null && field655 > var9.field2711) {
                                    if (var9.field2691 == null || field655 - var9.field2711 > 32) {
                                        class1 var56 = new class1();
                                        var56.field3 = var9;
                                        var56.field9 = var9.field2701;
                                        field667.method3288(var56);
                                    } else {
                                        label516: for (int var52 = var9.field2711; var52 < field655; var52++) {
                                            int var53 = field654[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2691.length; var54++) {
                                                if (var9.field2691[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field3 = var9;
                                                    var55.field9 = var9.field2701;
                                                    field667.method3288(var55);
                                                    break label516;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2711 = field655;
                                }
                                if (var9.field2647 != null && field600 > var9.field2723) {
                                    if (var9.field2693 == null || field600 - var9.field2723 > 32) {
                                        class1 var61 = new class1();
                                        var61.field3 = var9;
                                        var61.field9 = var9.field2647;
                                        field667.method3288(var61);
                                    } else {
                                        label492: for (int var57 = var9.field2723; var57 < field600; var57++) {
                                            int var58 = field656[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2693.length; var59++) {
                                                if (var9.field2693[var59] == var58) {
                                                    class1 var60 = new class1();
                                                    var60.field3 = var9;
                                                    var60.field9 = var9.field2647;
                                                    field667.method3288(var60);
                                                    break label492;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2723 = field600;
                                }
                                if (var9.field2717 != null && field659 > var9.field2724) {
                                    if (var9.field2712 == null || field659 - var9.field2724 > 32) {
                                        class1 var66 = new class1();
                                        var66.field3 = var9;
                                        var66.field9 = var9.field2717;
                                        field667.method3288(var66);
                                    } else {
                                        label468: for (int var62 = var9.field2724; var62 < field659; var62++) {
                                            int var63 = field658[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2712.length; var64++) {
                                                if (var9.field2712[var64] == var63) {
                                                    class1 var65 = new class1();
                                                    var65.field3 = var9;
                                                    var65.field9 = var9.field2717;
                                                    field667.method3288(var65);
                                                    break label468;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2724 = field659;
                                }
                                if (field503 > var9.field2603 && var9.field2699 != null) {
                                    class1 var67 = new class1();
                                    var67.field3 = var9;
                                    var67.field9 = var9.field2699;
                                    field667.method3288(var67);
                                }
                                if (field468 > var9.field2603 && var9.field2639 != null) {
                                    class1 var68 = new class1();
                                    var68.field3 = var9;
                                    var68.field9 = var9.field2639;
                                    field667.method3288(var68);
                                }
                                if (field662 > var9.field2603 && var9.field2702 != null) {
                                    class1 var69 = new class1();
                                    var69.field3 = var9;
                                    var69.field9 = var9.field2702;
                                    field667.method3288(var69);
                                }
                                if (field487 > var9.field2603 && var9.field2642 != null) {
                                    class1 var70 = new class1();
                                    var70.field3 = var9;
                                    var70.field9 = var9.field2642;
                                    field667.method3288(var70);
                                }
                                var9.field2603 = field653;
                                if (var9.field2700 != null) {
                                    for (int var71 = 0; var71 < field692; var71++) {
                                        class1 var72 = new class1();
                                        var72.field3 = var9;
                                        var72.field6 = field694[var71];
                                        var72.field7 = field668[var71];
                                        var72.field9 = var9.field2700;
                                        field667.method3288(var72);
                                    }
                                }
                            }
                        }
                        if (!var9.field2694 && field511 == null && Statics.field733 == null && !field612) {
                            if ((var9.field2660 >= 0 || var9.field2629 != 0) && class77.field1396 >= var12 && class77.field1397 >= var13 && class77.field1396 < var14 && class77.field1397 < var15) {
                                if (var9.field2660 >= 0) {
                                    Statics.field1308 = arg0[var9.field2660];
                                } else {
                                    Statics.field1308 = var9;
                                }
                            }
                            if (var9.field2612 == 8 && class77.field1396 >= var12 && class77.field1397 >= var13 && class77.field1396 < var14 && class77.field1397 < var15) {
                                Statics.field53 = var9;
                            }
                            if (var9.field2626 > var9.field2620) {
                                method58(var9, var9.field2619 + var10, var11, var9.field2620, var9.field2626, class77.field1396, class77.field1397);
                            }
                        }
                    } else if ((field705 == 0 || field705 == 3) && (class77.field1402 == 1 || !Statics.field752 && class77.field1402 == 4)) {
                        int var26 = class77.field1403 - 25 - var10;
                        int var27 = class77.field1407 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field700 + field555 & 0x7FF;
                            int var29 = class104.field1786[var28];
                            int var30 = class104.field1766[var28];
                            int var31 = (field599 + 256) * var29 >> 8;
                            int var32 = (field599 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field2728.field467 + var33 >> 7;
                            int var36 = Statics.field2728.field409 - var34 >> 7;
                            field594.method2300(127);
                            field594.method2411(18);
                            field594.method2454(Statics.field1822 + var36);
                            field594.method2585(class75.field1361[82] ? (class75.field1361[81] ? 2 : 1) : 0);
                            field594.method2456(Statics.field920 + var35);
                            field594.method2411(var26);
                            field594.method2411(var27);
                            field594.method2424(field555);
                            field594.method2411(57);
                            field594.method2411(field700);
                            field594.method2411(field599);
                            field594.method2411(89);
                            field594.method2424(Statics.field2728.field467);
                            field594.method2424(Statics.field2728.field409);
                            field594.method2411(63);
                            field710 = var35;
                            field583 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cd(III)V")
    public static final void method43(int arg0, int arg1) {
        if (class159.method2879(arg0)) {
            method531(Statics.field1277[arg0], arg1);
        }
    }

    @ObfuscatedName("client.cs([Lfl;IS)V")
    public static final void method531(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2612 == 0) {
                    if (var3.field2718 != null) {
                        method531(var3.field2718, arg1);
                    }
                    class4 var4 = (class4) field631.method3260((long) var3.field2686);
                    if (var4 != null) {
                        method43(var4.field57, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2704 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field9 = var3.field2704;
                    class26.method173(var5);
                }
                if (arg1 == 1 && var3.field2705 != null) {
                    if (var3.field2611 >= 0) {
                        class159 var6 = class159.method145(var3.field2686);
                        if (var6 == null || var6.field2718 == null || var3.field2611 >= var6.field2718.length || var6.field2718[var3.field2611] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field9 = var3.field2705;
                    class26.method173(var7);
                }
            }
        }
    }

    @ObfuscatedName("di.ci(Lfl;B)V")
    public static void method2291(class159 arg0) {
        if (field672 == arg0.field2621) {
            field707[arg0.field2725] = true;
        }
    }

    @ObfuscatedName("a.cx(B)V")
    public static void method174() {
        for (class4 var0 = (class4) field631.method3262(); var0 != null; var0 = (class4) field631.method3265()) {
            int var1 = var0.field57;
            if (class159.method2879(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field1277[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2694;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2830;
                    class159 var6 = class159.method145(var5);
                    if (var6 != null) {
                        method2291(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ef.cn(Lfl;B)Lfl;")
    public static class159 method2667(class159 arg0) {
        class159 var1 = method83(arg0);
        if (var1 == null) {
            var1 = arg0.field2658;
        }
        return var1;
    }

    @ObfuscatedName("b.ca([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method111(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("br.cz(II)V")
    public static final void method1338(int arg0) {
        if (!class159.method2879(arg0)) {
            return;
        }
        class159[] var1 = Statics.field1277[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3 != null) {
                var3.field2716 = 0;
                var3.field2710 = 0;
            }
        }
    }

    @ObfuscatedName("am.cv([Lfl;II)V")
    public static final void method535(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2670 == arg1 && (!var3.field2694 || !method40(var3))) {
                if (var3.field2612 == 0) {
                    if (!var3.field2694 && method40(var3) && Statics.field1308 != var3) {
                        continue;
                    }
                    method535(arg0, var3.field2686);
                    if (var3.field2718 != null) {
                        method535(var3.field2718, var3.field2686);
                    }
                    class4 var4 = (class4) field631.method3260((long) var3.field2686);
                    if (var4 != null) {
                        int var5 = var4.field57;
                        if (class159.method2879(var5)) {
                            method535(Statics.field1277[var5], -1);
                        }
                    }
                }
                if (var3.field2612 == 6) {
                    if (var3.field2726 != -1 || var3.field2636 != -1) {
                        boolean var6 = method3205(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2636;
                        } else {
                            var7 = var3.field2726;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method2178(var7);
                            var3.field2710 += field547;
                            while (var3.field2710 > var8.field889[var3.field2716]) {
                                var3.field2710 -= var8.field889[var3.field2716];
                                var3.field2716++;
                                if (var3.field2716 >= var8.field881.length) {
                                    var3.field2716 -= var8.field885;
                                    if (var3.field2716 < 0 || var3.field2716 >= var8.field881.length) {
                                        var3.field2716 = 0;
                                    }
                                }
                                method2291(var3);
                            }
                        }
                    }
                    if (var3.field2654 != 0 && !var3.field2694) {
                        int var9 = var3.field2654 >> 16;
                        int var10 = var3.field2654 << 16 >> 16;
                        int var11 = field547 * var9;
                        int var12 = field547 * var10;
                        var3.field2628 = var3.field2628 + var11 & 0x7FF;
                        var3.field2651 = var3.field2651 + var12 & 0x7FF;
                        method2291(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.ce(IS)V")
    public static final void method796(int arg0) {
        method174();
        class7.method3134();
        class42 var1 = (class42) class42.field1031.method3215((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1038.method2952(16, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method888(new class127(var3));
            }
            class42.field1031.method3225(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1032;
        if (var5 == 0) {
            return;
        }
        int var6 = class160.field2731[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class104.method2103(0.9D);
                ((class110) Statics.field1764).method2189(0.9D);
            }
            if (var6 == 2) {
                class104.method2103(0.8D);
                ((class110) Statics.field1764).method2189(0.8D);
            }
            if (var6 == 3) {
                class104.method2103(0.7D);
                ((class110) Statics.field1764).method2189(0.7D);
            }
            if (var6 == 4) {
                class104.method2103(0.6D);
                ((class110) Statics.field1764).method2189(0.6D);
            }
            class40.field978.method3218();
        }
        if (var5 == 3) {
            short var7 = 0;
            if (var6 == 0) {
                var7 = 255;
            }
            if (var6 == 1) {
                var7 = 192;
            }
            if (var6 == 2) {
                var7 = 128;
            }
            if (var6 == 3) {
                var7 = 64;
            }
            if (var6 == 4) {
                var7 = 0;
            }
            if (field706 != var7) {
                if (field706 == 0 && field684 != -1) {
                    class139.method2160(Statics.field94, field684, 0, var7, false);
                    field708 = false;
                } else if (var7 == 0) {
                    Statics.field2362.method2707();
                    class139.field2363 = 1;
                    Statics.field2364 = null;
                    field708 = false;
                } else if (class139.field2363 == 0) {
                    Statics.field2362.method2701(var7);
                } else {
                    Statics.field2366 = var7;
                }
                field706 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field709 = 127;
            }
            if (var6 == 1) {
                field709 = 96;
            }
            if (var6 == 2) {
                field709 = 64;
            }
            if (var6 == 3) {
                field709 = 32;
            }
            if (var6 == 4) {
                field709 = 0;
            }
        }
        if (var5 == 5) {
            field611 = var6;
        }
        if (var5 == 6) {
            field632 = var6;
        }
        if (var5 == 9) {
            field633 = var6;
        }
        if (var5 != 10) {
            return;
        }
        if (var6 == 0) {
            field568 = 127;
        }
        if (var6 == 1) {
            field568 = 96;
        }
        if (var6 == 2) {
            field568 = 64;
        }
        if (var6 == 3) {
            field568 = 32;
        }
        if (var6 == 4) {
            field568 = 0;
        }
    }

    @ObfuscatedName("ao.cw(Lz;ZI)V")
    public static final void method560(class4 arg0, boolean arg1) {
        int var2 = arg0.field57;
        int var3 = (int) arg0.field2830;
        arg0.method3309();
        if (arg1 && var2 != -1 && Statics.field2666[var2]) {
            Statics.field2610.method3010(var2);
            if (Statics.field1277[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field1277[var2].length; var5++) {
                    if (Statics.field1277[var2][var5] != null) {
                        if (Statics.field1277[var2][var5].field2612 == 2) {
                            var4 = false;
                        } else {
                            Statics.field1277[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field1277[var2] = null;
                }
                Statics.field2666[var2] = false;
            }
        }
        for (class171 var6 = (class171) field670.method3262(); var6 != null; var6 = (class171) field670.method3265()) {
            if ((var6.field2830 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3309();
            }
        }
        class159 var7 = class159.method145(var3);
        if (var7 != null) {
            method2291(var7);
        }
        method136();
        if (field605 != -1) {
            method43(field605, 1);
        }
    }

    @ObfuscatedName("y.cy(Lfl;I)Z")
    public static final boolean method54(class159 arg0) {
        int var1 = arg0.field2679;
        if (var1 == 205) {
            field520 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field729.method3166(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field729.method3167(var4, var5 == 1);
        }
        if (var1 == 324) {
            field729.method3168(false);
        }
        if (var1 == 325) {
            field729.method3168(true);
        }
        if (var1 == 326) {
            field594.method2300(56);
            field729.method3179(field594);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("z.cj(IIIILcf;I)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method85(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field700 + field555 & 0x7FF;
        int var7 = class104.field1786[var6];
        int var8 = class104.field1766[var6];
        int var9 = var7 * 256 / (field599 + 256);
        int var10 = var8 * 256 / (field599 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field195.method1703(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("da.cu(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2666(int arg0, String arg1, String arg2) {
        method69(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("d.dr(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method69(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field682[var4] = field682[var4 - 1];
            field683[var4] = field683[var4 - 1];
            field685[var4] = field685[var4 - 1];
            field578[var4] = field578[var4 - 1];
        }
        field682[0] = arg0;
        field683[0] = arg1;
        field685[0] = arg2;
        field578[0] = arg3;
        field570++;
        field503 = field653;
    }

    @ObfuscatedName("a.dl(Ljava/lang/String;I)Z")
    public static boolean method166(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method86(arg0, Statics.field242);
        for (int var2 = 0; var2 < field693; var2++) {
            if (var1.equalsIgnoreCase(class149.method86(field702[var2].field367, Statics.field242))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method86(Statics.field2728.field36, Statics.field242))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cv.ds(Ljava/lang/String;B)Z")
    public static boolean method2024(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method86(arg0, Statics.field242);
        for (int var2 = 0; var2 < field730; var2++) {
            class11 var3 = field673[var2];
            if (var1.equalsIgnoreCase(class149.method86(var3.field178, Statics.field242))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method86(var3.field170, Statics.field242))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dr.dk(Ljava/lang/String;I)V")
    public static final void method2159(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field693 < 200 || field597 == 1) || field693 >= 400) {
            method2666(0, "", class135.field2184);
            return;
        }
        String var1 = class149.method86(arg0, Statics.field242);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field693; var2++) {
            class23 var3 = field702[var2];
            String var4 = class149.method86(var3.field367, Statics.field242);
            if (var4 != null && var4.equals(var1)) {
                method2666(0, "", arg0 + class135.field2263);
                return;
            }
            if (var3.field363 != null) {
                String var5 = class149.method86(var3.field363, Statics.field242);
                if (var5 != null && var5.equals(var1)) {
                    method2666(0, "", arg0 + class135.field2263);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field730; var6++) {
            class11 var7 = field673[var6];
            String var8 = class149.method86(var7.field178, Statics.field242);
            if (var8 != null && var8.equals(var1)) {
                method2666(0, "", class135.field2268 + arg0 + class135.field2176);
                return;
            }
            if (var7.field170 != null) {
                String var9 = class149.method86(var7.field170, Statics.field242);
                if (var9 != null && var9.equals(var1)) {
                    method2666(0, "", class135.field2268 + arg0 + class135.field2176);
                    return;
                }
            }
        }
        if (class149.method86(Statics.field2728.field36, Statics.field242).equals(var1)) {
            method2666(0, "", class135.field2266);
        } else {
            field594.method2300(94);
            field594.method2411(class127.method1331(arg0));
            field594.method2416(arg0);
        }
    }

    @ObfuscatedName("db.dj(Ljava/lang/String;I)V")
    public static final void method2351(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method86(arg0, Statics.field242);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field693; var2++) {
            class23 var3 = field702[var2];
            String var4 = var3.field367;
            String var5 = class149.method86(var4, Statics.field242);
            if (class137.method206(arg0, var1, var4, var5)) {
                field693--;
                for (int var6 = var2; var6 < field693; var6++) {
                    field702[var6] = field702[var6 + 1];
                }
                field468 = field653;
                field594.method2300(130);
                field594.method2411(class127.method1331(arg0));
                field594.method2416(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("an.dg(Ljava/lang/String;B)V")
    public static final void method780(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method86(arg0, Statics.field242);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field730; var2++) {
            class11 var3 = field673[var2];
            String var4 = var3.field178;
            String var5 = class149.method86(var4, Statics.field242);
            if (class137.method206(arg0, var1, var4, var5)) {
                field730--;
                for (int var6 = var2; var6 < field730; var6++) {
                    field673[var6] = field673[var6 + 1];
                }
                field468 = field653;
                field594.method2300(225);
                field594.method2411(class127.method1331(arg0));
                field594.method2416(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ap.dz(Ljava/lang/String;I)V")
    public static final void method232(String arg0) {
        if (Statics.field2355 != null) {
            field594.method2300(60);
            field594.method2411(class127.method1331(arg0));
            field594.method2416(arg0);
        }
    }

    @ObfuscatedName("bj.dn(Ljava/lang/String;I)V")
    public static final void method1371(String arg0) {
        if (!arg0.equals("")) {
            field594.method2300(65);
            field594.method2411(class127.method1331(arg0));
            field594.method2416(arg0);
        }
    }

    @ObfuscatedName("bw.dm(I)V")
    public static final void method1389() {
        field594.method2300(65);
        field594.method2411(0);
    }

    @ObfuscatedName("bu.dd(Lfl;I)I")
    public static int method1436(class159 arg0) {
        class171 var1 = (class171) field670.method3260(((long) arg0.field2686 << 32) + (long) arg0.field2611);
        return var1 == null ? arg0.field2669 : var1.field2813;
    }

    @ObfuscatedName("d.di(Lfl;S)Lfl;")
    public static class159 method83(class159 arg0) {
        int var1 = class163.method3047(method1436(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class159.method145(arg0.field2670);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("v.dp(Lfl;I)Z")
    public static boolean method40(class159 arg0) {
        if (field639) {
            if (method1436(arg0) != 0) {
                return false;
            }
            if (arg0.field2612 == 0) {
                return false;
            }
        }
        return arg0.field2622;
    }

    @ObfuscatedName("an.du(Lfl;I)Ljava/lang/String;")
    public static String method765(class159 arg0) {
        if (class163.method759(method1436(arg0)) == 0) {
            return null;
        } else if (arg0.field2692 == null || arg0.field2692.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2692;
        }
    }
}

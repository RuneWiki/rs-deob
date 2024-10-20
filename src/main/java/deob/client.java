package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

public final class client extends class72 {

    @ObfuscatedName("client.m")
    public static boolean field729 = true;

    @ObfuscatedName("client.n")
    public static int field467 = 1;

    @ObfuscatedName("client.a")
    public static int field469 = 0;

    @ObfuscatedName("client.l")
    public static boolean field471 = false;

    @ObfuscatedName("client.w")
    public static class163[] field530 = new class163[4];

    @ObfuscatedName("client.z")
    public static boolean field472 = false;

    @ObfuscatedName("client.e")
    public static int field473 = 0;

    @ObfuscatedName("client.b")
    public static int field714 = 1;

    @ObfuscatedName("client.d")
    public static int field475 = 0;

    @ObfuscatedName("client.h")
    public static boolean field476 = true;

    @ObfuscatedName("client.i")
    public static int field477 = 0;

    @ObfuscatedName("client.v")
    public static long field478 = -1L;

    @ObfuscatedName("client.f")
    public static int field479 = -1;

    @ObfuscatedName("client.t")
    public static int field480 = -1;

    @ObfuscatedName("client.r")
    public static int field481 = -1;

    @ObfuscatedName("client.p")
    public static boolean field482 = true;

    @ObfuscatedName("client.o")
    public static boolean field466 = false;

    @ObfuscatedName("client.ax")
    public static int field582 = 0;

    @ObfuscatedName("client.aa")
    public static int field508 = 0;

    @ObfuscatedName("client.af")
    public static int field725 = 0;

    @ObfuscatedName("client.al")
    public static int field487 = 0;

    @ObfuscatedName("client.av")
    public static int field488 = 0;

    @ObfuscatedName("client.ab")
    public static int field489 = 0;

    @ObfuscatedName("client.ad")
    public static int field490 = 0;

    @ObfuscatedName("client.ai")
    public static int field491 = 0;

    @ObfuscatedName("client.ak")
    public static int field636 = 0;

    @ObfuscatedName("client.ao")
    public static class126 field493 = new class126(new byte[5000]);

    @ObfuscatedName("client.ag")
    public static int field580 = 0;

    @ObfuscatedName("client.as")
    public static int field494 = 0;

    @ObfuscatedName("client.au")
    public static int field496 = 0;

    @ObfuscatedName("client.bq")
    public static int field500 = 0;

    @ObfuscatedName("client.bp")
    public static int field702 = 0;

    @ObfuscatedName("client.bb")
    public static int field502 = 0;

    @ObfuscatedName("client.bg")
    public static int field503 = 0;

    @ObfuscatedName("client.br")
    public static int field504 = 0;

    @ObfuscatedName("client.bm")
    public static class24[] field584 = new class24[32768];

    @ObfuscatedName("client.bc")
    public static int field465 = 0;

    @ObfuscatedName("client.bd")
    public static int[] field506 = new int[32768];

    @ObfuscatedName("client.cg")
    public static class115 field499 = new class115(5000);

    @ObfuscatedName("client.cd")
    public static class115 field512 = new class115(5000);

    @ObfuscatedName("client.cw")
    public static class115 field513 = new class115(5000);

    @ObfuscatedName("client.cp")
    public static int field514 = 0;

    @ObfuscatedName("client.cn")
    public static int field515 = 0;

    @ObfuscatedName("client.co")
    public static int field516 = 0;

    @ObfuscatedName("client.cv")
    public static int field517 = 0;

    @ObfuscatedName("client.ci")
    public static int field518 = 0;

    @ObfuscatedName("client.ck")
    public static int field519 = 0;

    @ObfuscatedName("client.ct")
    public static int field614 = 0;

    @ObfuscatedName("client.cs")
    public static int field521 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field522 = false;

    @ObfuscatedName("client.cx")
    public static int field523 = 0;

    @ObfuscatedName("client.cz")
    public static int field687 = 0;

    @ObfuscatedName("client.cu")
    public static int field555 = 1;

    @ObfuscatedName("client.cl")
    public static int field526 = 0;

    @ObfuscatedName("client.dq")
    public static int field527 = 1;

    @ObfuscatedName("client.dt")
    public static int field528 = 0;

    @ObfuscatedName("client.do")
    public static boolean field623 = false;

    @ObfuscatedName("client.dm")
    public static int[][][] field540 = new int[4][13][13];

    @ObfuscatedName("client.dj")
    public static final int[] field533 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dp")
    public static int field534 = 0;

    @ObfuscatedName("client.db")
    public static int[][] field573 = new int[104][104];

    @ObfuscatedName("client.di")
    public static int[][] field709 = new int[104][104];

    @ObfuscatedName("client.dn")
    public static int[] field537 = new int[4000];

    @ObfuscatedName("client.df")
    public static int[] field595 = new int[4000];

    @ObfuscatedName("client.de")
    public static int field539 = 0;

    @ObfuscatedName("client.dk")
    public static int field653 = 2;

    @ObfuscatedName("client.dl")
    public static int field634 = 0;

    @ObfuscatedName("client.dy")
    public static int field542 = 2;

    @ObfuscatedName("client.dv")
    public static int field543 = 0;

    @ObfuscatedName("client.dh")
    public static int field544 = 1;

    @ObfuscatedName("client.dc")
    public static int field545 = 0;

    @ObfuscatedName("client.eh")
    public static int field664 = 0;

    @ObfuscatedName("client.ec")
    public static int field547 = 2;

    @ObfuscatedName("client.ew")
    public static int field511 = 0;

    @ObfuscatedName("client.eq")
    public static int field716 = 1;

    @ObfuscatedName("client.ee")
    public static int field727 = 0;

    @ObfuscatedName("client.er")
    public static int field585 = 0;

    @ObfuscatedName("client.eu")
    public static int field552 = 2301979;

    @ObfuscatedName("client.ey")
    public static int field553 = 5063219;

    @ObfuscatedName("client.fz")
    public static int field554 = 3353893;

    @ObfuscatedName("client.fr")
    public static int field576 = 7759444;

    @ObfuscatedName("client.fi")
    public static boolean field639 = false;

    @ObfuscatedName("client.fu")
    public static int field495 = 0;

    @ObfuscatedName("client.fc")
    public static int field558 = 128;

    @ObfuscatedName("client.ff")
    public static int field559 = 0;

    @ObfuscatedName("client.fo")
    public static int field524 = 0;

    @ObfuscatedName("client.fb")
    public static int field561 = 0;

    @ObfuscatedName("client.fp")
    public static int field562 = 0;

    @ObfuscatedName("client.fs")
    public static boolean field733 = false;

    @ObfuscatedName("client.fm")
    public static int field548 = 0;

    @ObfuscatedName("client.fa")
    public static int field565 = 0;

    @ObfuscatedName("client.fh")
    public static int field566 = 50;

    @ObfuscatedName("client.fd")
    public static int[] field647 = new int[field566];

    @ObfuscatedName("client.fv")
    public static int[] field568 = new int[field566];

    @ObfuscatedName("client.fx")
    public static int[] field569 = new int[field566];

    @ObfuscatedName("client.fn")
    public static int[] field570 = new int[field566];

    @ObfuscatedName("client.fq")
    public static int[] field571 = new int[field566];

    @ObfuscatedName("client.fk")
    public static int[] field633 = new int[field566];

    @ObfuscatedName("client.gr")
    public static int[] field564 = new int[field566];

    @ObfuscatedName("client.gc")
    public static String[] field574 = new String[field566];

    @ObfuscatedName("client.gf")
    public static int[][] field575 = new int[104][104];

    @ObfuscatedName("client.gs")
    public static int field660 = 0;

    @ObfuscatedName("client.gy")
    public static int field577 = -1;

    @ObfuscatedName("client.gk")
    public static int field578 = -1;

    @ObfuscatedName("client.gn")
    public static int field642 = 0;

    @ObfuscatedName("client.gu")
    public static int field693 = 0;

    @ObfuscatedName("client.ga")
    public static int field581 = 0;

    @ObfuscatedName("client.gg")
    public static int field470 = 0;

    @ObfuscatedName("client.gx")
    public static int field583 = 0;

    @ObfuscatedName("client.gd")
    public static int field484 = 0;

    @ObfuscatedName("client.go")
    public static int field572 = 0;

    @ObfuscatedName("client.gp")
    public static int field586 = 0;

    @ObfuscatedName("client.gb")
    public static int field587 = 0;

    @ObfuscatedName("client.gi")
    public static int field708 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field589 = false;

    @ObfuscatedName("client.gw")
    public static int field541 = 0;

    @ObfuscatedName("client.gz")
    public static int field546 = 0;

    @ObfuscatedName("client.gv")
    public static class3[] field592 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field593 = 0;

    @ObfuscatedName("client.he")
    public static int[] field594 = new int[2048];

    @ObfuscatedName("client.ha")
    public static int field613 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field596 = new int[2048];

    @ObfuscatedName("client.hg")
    public static class126[] field597 = new class126[2048];

    @ObfuscatedName("client.hv")
    public static int field635 = -1;

    @ObfuscatedName("client.hq")
    public static int field531 = 0;

    @ObfuscatedName("client.hp")
    public static int field600 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field601 = new int[1000];

    @ObfuscatedName("client.hw")
    public static final int[] field486 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hl")
    public static String[] field603 = new String[8];

    @ObfuscatedName("client.hk")
    public static boolean[] field604 = new boolean[8];

    @ObfuscatedName("client.hh")
    public static int[] field605 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hj")
    public static class176[][][] field590 = new class176[4][104][104];

    @ObfuscatedName("client.hc")
    public static class176 field662 = new class176();

    @ObfuscatedName("client.hx")
    public static class176 field608 = new class176();

    @ObfuscatedName("client.hy")
    public static class176 field667 = new class176();

    @ObfuscatedName("client.hz")
    public static int[] field610 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field611 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field550 = new int[25];

    @ObfuscatedName("client.hb")
    public static int field599 = 0;

    @ObfuscatedName("client.hs")
    public static boolean field628 = false;

    @ObfuscatedName("client.ij")
    public static int field615 = 0;

    @ObfuscatedName("client.ik")
    public static int[] field616 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field617 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field728 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field619 = new int[500];

    @ObfuscatedName("client.ii")
    public static String[] field620 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field645 = new String[500];

    @ObfuscatedName("client.iq")
    public static int field622 = -1;

    @ObfuscatedName("client.ip")
    public static int field707 = -1;

    @ObfuscatedName("client.il")
    public static int field525 = 0;

    @ObfuscatedName("client.ig")
    public static int field625 = 50;

    @ObfuscatedName("client.if")
    public static int field626 = 0;

    @ObfuscatedName("client.it")
    public static String field627 = null;

    @ObfuscatedName("client.ia")
    public static boolean field632 = false;

    @ObfuscatedName("client.ib")
    public static int field629 = -1;

    @ObfuscatedName("client.ix")
    public static String field630 = null;

    @ObfuscatedName("client.jh")
    public static String field631 = null;

    @ObfuscatedName("client.jr")
    public static int field535 = -1;

    @ObfuscatedName("client.jj")
    public static class174 field567 = new class174(8);

    @ObfuscatedName("client.jm")
    public static int field684 = 0;

    @ObfuscatedName("client.jg")
    public static int field588 = 0;

    @ObfuscatedName("client.jf")
    public static class157 field607 = null;

    @ObfuscatedName("client.jn")
    public static int field637 = 0;

    @ObfuscatedName("client.jt")
    public static int field638 = 0;

    @ObfuscatedName("client.jw")
    public static int field682 = 0;

    @ObfuscatedName("client.js")
    public static boolean field640 = false;

    @ObfuscatedName("client.jk")
    public static boolean field641 = false;

    @ObfuscatedName("client.jp")
    public static boolean field507 = false;

    @ObfuscatedName("client.jz")
    public static class157 field464 = null;

    @ObfuscatedName("client.ju")
    public static class157 field644 = null;

    @ObfuscatedName("client.jv")
    public static int field591 = 0;

    @ObfuscatedName("client.je")
    public static int field646 = 0;

    @ObfuscatedName("client.jo")
    public static class157 field538 = null;

    @ObfuscatedName("client.jl")
    public static boolean field648 = false;

    @ObfuscatedName("client.jc")
    public static int field649 = -1;

    @ObfuscatedName("client.ja")
    public static int field650 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field651 = false;

    @ObfuscatedName("client.ji")
    public static int field652 = -1;

    @ObfuscatedName("client.jb")
    public static int field556 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field654 = false;

    @ObfuscatedName("client.km")
    public static int field655 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field656 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field657 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field658 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field659 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field497 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field624 = 0;

    @ObfuscatedName("client.kf")
    public static int field536 = 0;

    @ObfuscatedName("client.kl")
    public static int field663 = 0;

    @ObfuscatedName("client.kr")
    public static int field551 = 0;

    @ObfuscatedName("client.ku")
    public static int field665 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field701 = new int[2000];

    @ObfuscatedName("client.ks")
    public static String[] field661 = new String[1000];

    @ObfuscatedName("client.kj")
    public static int field560 = 0;

    @ObfuscatedName("client.kc")
    public static class176 field669 = new class176();

    @ObfuscatedName("client.kk")
    public static class176 field670 = new class176();

    @ObfuscatedName("client.kt")
    public static class176 field671 = new class176();

    @ObfuscatedName("client.kv")
    public static class174 field672 = new class174(512);

    @ObfuscatedName("client.kx")
    public static int field673 = 0;

    @ObfuscatedName("client.kg")
    public static int field606 = -2;

    @ObfuscatedName("client.lu")
    public static boolean[] field675 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field676 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field677 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static int[] field678 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field679 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field680 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field681 = new int[100];

    @ObfuscatedName("client.lt")
    public static int field532 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field683 = new int[100];

    @ObfuscatedName("client.lb")
    public static String[] field485 = new String[100];

    @ObfuscatedName("client.lr")
    public static String[] field685 = new String[100];

    @ObfuscatedName("client.lj")
    public static String[] field686 = new String[100];

    @ObfuscatedName("client.lq")
    public static int field474 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field688 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field689 = 0;

    @ObfuscatedName("client.la")
    public static int field668 = 0;

    @ObfuscatedName("client.lf")
    public static long[] field691 = new long[100];

    @ObfuscatedName("client.ld")
    public static int field698 = 0;

    @ObfuscatedName("client.lh")
    public static int field483 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field694 = new int[128];

    @ObfuscatedName("client.lz")
    public static int[] field695 = new int[128];

    @ObfuscatedName("client.lk")
    public static long field696 = -1L;

    @ObfuscatedName("client.my")
    public static String field697 = null;

    @ObfuscatedName("client.me")
    public static String field703 = null;

    @ObfuscatedName("client.mm")
    public static int field692 = -1;

    @ObfuscatedName("client.mc")
    public static int field700 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field609 = new int[1000];

    @ObfuscatedName("client.mp")
    public static int[] field501 = new int[1000];

    @ObfuscatedName("client.mi")
    public static class85[] field509 = new class85[1000];

    @ObfuscatedName("client.mx")
    public static int field704 = 0;

    @ObfuscatedName("client.ml")
    public static int field705 = 0;

    @ObfuscatedName("client.mj")
    public static int field706 = 0;

    @ObfuscatedName("client.mf")
    public static int field602 = 255;

    @ObfuscatedName("client.mo")
    public static int field699 = -1;

    @ObfuscatedName("client.mw")
    public static boolean field732 = false;

    @ObfuscatedName("client.mk")
    public static int field710 = 127;

    @ObfuscatedName("client.mb")
    public static int field711 = 127;

    @ObfuscatedName("client.nu")
    public static int field712 = 0;

    @ObfuscatedName("client.ns")
    public static int[] field713 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field674 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field715 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field557 = new int[50];

    @ObfuscatedName("client.ni")
    public static class56[] field717 = new class56[50];

    @ObfuscatedName("client.na")
    public static boolean field718 = false;

    @ObfuscatedName("client.nr")
    public static boolean[] field719 = new boolean[5];

    @ObfuscatedName("client.nq")
    public static int[] field720 = new int[5];

    @ObfuscatedName("client.nl")
    public static int[] field721 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field722 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field723 = new int[5];

    @ObfuscatedName("client.ov")
    public static int field724 = 0;

    @ObfuscatedName("client.od")
    public static int field492 = 0;

    @ObfuscatedName("client.oh")
    public static class22[] field726 = new class22[200];

    @ObfuscatedName("client.oo")
    public static class172 field498 = new class172();

    @ObfuscatedName("client.ol")
    public static int field563 = 0;

    @ObfuscatedName("client.oi")
    public static class11[] field643 = new class11[100];

    @ObfuscatedName("client.ox")
    public static class162 field730 = new class162();

    @ObfuscatedName("client.og")
    public static int field731 = -1;

    @ObfuscatedName("client.oj")
    public static int field612 = -1;

    @ObfuscatedName("client.m(I)V")
    public final void method248() {
    }

    public final void init() {
        if (!this.method1410()) {
            return;
        }
        class166[] var1 = new class166[] { class166.field2766, class166.field2765, class166.field2769, class166.field2767, class166.field2768, class166.field2774, class166.field2771, class166.field2773, class166.field2772 };
        class166[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class166 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2764);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2764)) {
                    case 1:
                        field469 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field468 = class131.method33(Integer.parseInt(var5));
                        break;
                    case 3:
                        field473 = Integer.parseInt(var5);
                        break;
                    case 4:
                        class132[] var6 = new class132[] { class132.field2054, class132.field2052, class132.field2057, class132.field2062, class132.field2056, class132.field2061 };
                        Statics.field305 = (class132) class112.method2040(var6, Integer.parseInt(var5));
                        if (Statics.field305 == class132.field2061) {
                            Statics.field520 = class185.field2853;
                        } else {
                            Statics.field520 = class185.field2857;
                        }
                        break;
                    case 5:
                        Statics.field1289 = var5;
                        break;
                    case 6:
                        field467 = Integer.parseInt(var5);
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field25)) {
                            field714 = 1;
                        } else {
                            field714 = 0;
                        }
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field25)) {
                            field471 = true;
                        } else {
                            field471 = false;
                        }
                }
            }
        }
        method243();
        Statics.field2019 = this.getCodeBase().getHost();
        String var7 = Statics.field468.field2044;
        byte var8 = 0;
        try {
            Statics.field1416 = 16;
            Statics.field1737 = var8;
            try {
                Statics.field1414 = System.getProperty("os.name");
            } catch (Exception var22) {
                Statics.field1414 = "Unknown";
            }
            Statics.field1413 = Statics.field1414.toLowerCase();
            try {
                Statics.field390 = System.getProperty("user.home");
                if (Statics.field390 != null) {
                    Statics.field390 = Statics.field390 + "/";
                }
            } catch (Exception var21) {
            }
            try {
                if (Statics.field1413.startsWith("win")) {
                    if (Statics.field390 == null) {
                        Statics.field390 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field390 == null) {
                    Statics.field390 = System.getenv("HOME");
                }
                if (Statics.field390 != null) {
                    Statics.field390 = Statics.field390 + "/";
                }
            } catch (Exception var20) {
            }
            if (Statics.field390 == null) {
                Statics.field390 = "~/";
            }
            Statics.field401 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field390, "/tmp/", "" };
            Statics.field1412 = new String[] { ".jagex_cache_" + Statics.field1737, ".file_store_" + Statics.field1737 };
            label119: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field1402 = class81.method1172("oldschool", var7, var12);
                if (!Statics.field1402.exists()) {
                    Statics.field1402.mkdirs();
                }
                File[] var13 = Statics.field1402.listFiles();
                if (var13 == null) {
                    break;
                }
                File[] var14 = var13;
                int var15 = 0;
                while (true) {
                    if (var15 >= var14.length) {
                        break label119;
                    }
                    File var16 = var14[var15];
                    if (!class81.method1361(var16, false)) {
                        break;
                    }
                    var15++;
                }
            }
            File var17 = Statics.field1402;
            Statics.field1298 = var17;
            if (!Statics.field1298.exists()) {
                throw new RuntimeException("");
            }
            class71.field1299 = true;
            class81.method15();
            class81.field1410 = new class29(new class28(class71.method2950("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class81.field1411 = new class29(new class28(class71.method2950("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2770 = new class29[Statics.field1416];
            for (int var18 = 0; var18 < Statics.field1416; var18++) {
                Statics.field2770[var18] = new class29(new class28(class71.method2950("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var23) {
            class79.method1474((String) null, var23);
        }
        Statics.field598 = this;
        this.method1459(765, 503, 8);
    }

    @ObfuscatedName("o.q(I)V")
    public static final void method243() {
        class94.field1568 = false;
        field472 = false;
    }

    @ObfuscatedName("client.a(I)V")
    public final void method250() {
        Statics.field119 = field469 == 0 ? 43594 : field467 + 40000;
        Statics.field253 = field469 == 0 ? 443 : field467 + 50000;
        Statics.field2302 = Statics.field119;
        Statics.field2707 = class160.field2697;
        Statics.field2708 = class160.field2692;
        Statics.field1995 = class160.field2694;
        Statics.field2698 = class160.field2691;
        class74.method781();
        class74.method164(Statics.field2431);
        Canvas var1 = Statics.field2431;
        var1.addMouseListener(class76.field1368);
        var1.addMouseMotionListener(class76.field1368);
        var1.addFocusListener(class76.field1368);
        Statics.field1490 = class65.method780();
        if (Statics.field1490 != null) {
            Statics.field1490.method1344(Statics.field2431);
        }
        Statics.field304 = new class70(255, class81.field1410, class81.field1411, 500000);
        if (field469 != 0) {
            field466 = true;
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method251() {
        field477++;
        this.method308();
        class156.method666();
        class137.method1416();
        method168();
        class74.method2643();
        class76.method214();
        if (Statics.field1490 != null) {
            int var1 = Statics.field1490.method1346();
            field560 = var1;
        }
        if (field475 == 0) {
            method125();
            class72.method128();
        } else if (field475 == 5) {
            class20.method2879(this);
            method125();
            class72.method128();
        } else if (field475 == 10) {
            class20.method2879(this);
        } else if (field475 == 20) {
            class20.method2879(this);
            method66();
        } else if (field475 == 25) {
            method107();
        }
        if (field475 == 30) {
            if (field582 > 1) {
                field582--;
            }
            if (field518 > 0) {
                field518--;
            }
            if (field522) {
                field522 = false;
                if (field518 > 0) {
                    method1392();
                } else {
                    method138(40);
                    Statics.field510 = Statics.field579;
                    Statics.field579 = null;
                }
            } else {
                for (int var2 = 0; var2 < 100; var2++) {
                    boolean var3;
                    if (Statics.field579 == null) {
                        var3 = false;
                    } else {
                        label3168: {
                            try {
                                int var4 = Statics.field579.method1387();
                                if (var4 == 0) {
                                    var3 = false;
                                    break label3168;
                                }
                                if (field515 == -1) {
                                    Statics.field579.method1373(field513.field2022, 0, 1);
                                    field513.field2024 = 0;
                                    field515 = field513.method2335();
                                    field514 = class164.field2757[field515];
                                    var4--;
                                }
                                if (field514 == -1) {
                                    if (var4 <= 0) {
                                        var3 = false;
                                        break label3168;
                                    }
                                    Statics.field579.method1373(field513.field2022, 0, 1);
                                    field514 = field513.field2022[0] & 0xFF;
                                    var4--;
                                }
                                if (field514 == -2) {
                                    if (var4 <= 1) {
                                        var3 = false;
                                        break label3168;
                                    }
                                    Statics.field579.method1373(field513.field2022, 0, 2);
                                    field513.field2024 = 0;
                                    field514 = field513.method2450();
                                    var4 -= 2;
                                }
                                if (var4 < field514) {
                                    var3 = false;
                                    break label3168;
                                }
                                field513.field2024 = 0;
                                Statics.field579.method1373(field513.field2022, 0, field514);
                                field516 = 0;
                                field521 = field614;
                                field614 = field519;
                                field519 = field515;
                                if (field515 == 94) {
                                    String var5 = field513.method2630();
                                    Object[] var6 = new Object[var5.length() + 1];
                                    for (int var7 = var5.length() - 1; var7 >= 0; var7--) {
                                        if (var5.charAt(var7) == 's') {
                                            var6[var7 + 1] = field513.method2630();
                                        } else {
                                            var6[var7 + 1] = Integer.valueOf(field513.method2526());
                                        }
                                    }
                                    var6[0] = Integer.valueOf(field513.method2526());
                                    class1 var8 = new class1();
                                    var8.field7 = var6;
                                    class25.method2220(var8);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 74) {
                                    byte var9 = field513.method2474();
                                    int var10 = field513.method2450();
                                    class158.field2686[var10] = var9;
                                    if (class158.field2687[var10] != var9) {
                                        class158.field2687[var10] = var9;
                                        method172(var10);
                                    }
                                    field656[++field657 - 1 & 0x1F] = var10;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 27) {
                                    int var11 = field513.method2480();
                                    if (var11 == 65535) {
                                        var11 = -1;
                                    }
                                    method728(var11);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 53) {
                                    int var12 = field513.method2483();
                                    int var13 = field513.method2479();
                                    if (var13 == 65535) {
                                        var13 = -1;
                                    }
                                    method2369(var13, var12);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 129) {
                                    field492 = 1;
                                    field663 = field655;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 204) {
                                    int var14 = field513.method2602();
                                    int var15 = field513.method2478();
                                    class157 var16 = class157.method2230(var14);
                                    if (var16.field2599 != 1 || var16.field2600 != var15) {
                                        var16.field2599 = 1;
                                        var16.field2600 = var15;
                                        method1523(var16);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 115) {
                                    String var17 = field513.method2630();
                                    long var18 = (long) field513.method2450();
                                    long var20 = (long) field513.method2452();
                                    int var22 = field513.method2559();
                                    long var23 = (var18 << 32) + var20;
                                    boolean var25 = false;
                                    for (int var26 = 0; var26 < 100; var26++) {
                                        if (field691[var26] == var23) {
                                            var25 = true;
                                            break;
                                        }
                                    }
                                    if (method17(var17)) {
                                        var25 = true;
                                    }
                                    if (!var25 && field546 == 0) {
                                        field691[field698] = var23;
                                        field698 = (field698 + 1) % 100;
                                        String var27 = class184.method3404(class146.method2683(class183.method560(field513)));
                                        if (var22 == 2 || var22 == 3) {
                                            method208(7, class2.method533(1) + var17, var27);
                                        } else if (var22 == 1) {
                                            method208(7, class2.method533(0) + var17, var27);
                                        } else {
                                            method208(3, var17, var27);
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 87) {
                                    int var28 = field513.method2559();
                                    int var29 = field513.method2559();
                                    int var30 = field513.method2559();
                                    int var31 = field513.method2559();
                                    field719[var28] = true;
                                    field720[var28] = var29;
                                    field721[var28] = var30;
                                    field722[var28] = var31;
                                    field723[var28] = 0;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 184 || field515 == 218 || field515 == 45 || field515 == 235 || field515 == 67 || field515 == 238 || field515 == 19 || field515 == 31 || field515 == 24 || field515 == 135 || field515 == 28) {
                                    method2674();
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 17) {
                                    for (int var32 = 0; var32 < Statics.field1026; var32++) {
                                        class41 var33 = class41.method2682(var32);
                                        if (var33 != null && var33.field1028 == 0) {
                                            class158.field2686[var32] = 0;
                                            class158.field2687[var32] = 0;
                                        }
                                    }
                                    method121();
                                    field657 += 32;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 177) {
                                    int var34 = field513.method2479();
                                    if (var34 == 65535) {
                                        var34 = -1;
                                    }
                                    int var35 = field513.method2451();
                                    int var36 = field513.method2602();
                                    class157 var37 = class157.method2230(var35);
                                    if (var37.field2565) {
                                        var37.field2608 = var34;
                                        var37.field2672 = var36;
                                        class39 var39 = class39.method525(var34);
                                        var37.field2607 = var39.field966;
                                        var37.field2563 = var39.field976;
                                        var37.field2592 = var39.field977;
                                        var37.field2605 = var39.field978;
                                        var37.field2606 = var39.field965;
                                        var37.field2610 = var39.field974;
                                        if (var37.field2576 > 0) {
                                            var37.field2610 = var37.field2610 * 32 / var37.field2576;
                                        }
                                        method1523(var37);
                                    } else {
                                        if (var34 == -1) {
                                            var37.field2599 = 0;
                                            field515 = -1;
                                            var3 = true;
                                            break label3168;
                                        }
                                        class39 var38 = class39.method525(var34);
                                        var37.field2599 = 4;
                                        var37.field2600 = var34;
                                        var37.field2607 = var38.field966;
                                        var37.field2563 = var38.field976;
                                        var37.field2610 = var38.field974 * 100 / var36;
                                        method1523(var37);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 81) {
                                    method6(false);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 193) {
                                    int var40 = field513.method2478();
                                    field535 = var40;
                                    method2678(var40);
                                    class25.method245(field535);
                                    for (int var41 = 0; var41 < 100; var41++) {
                                        field675[var41] = true;
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 5) {
                                    field706 = field513.method2559();
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 182) {
                                    while (field513.field2024 < field514) {
                                        boolean var42 = field513.method2559() == 1;
                                        String var43 = field513.method2630();
                                        String var44 = field513.method2630();
                                        int var45 = field513.method2450();
                                        int var46 = field513.method2559();
                                        int var47 = field513.method2559();
                                        boolean var48 = (var47 & 0x2) != 0;
                                        boolean var49 = (var47 & 0x1) != 0;
                                        if (var45 > 0) {
                                            field513.method2630();
                                            field513.method2559();
                                            field513.method2526();
                                        }
                                        field513.method2630();
                                        for (int var50 = 0; var50 < field724; var50++) {
                                            class22 var51 = field726[var50];
                                            if (var42) {
                                                if (var44.equals(var51.field367)) {
                                                    var51.field367 = var43;
                                                    var51.field363 = var44;
                                                    var43 = null;
                                                    break;
                                                }
                                            } else if (var43.equals(var51.field367)) {
                                                if (var51.field369 != var45) {
                                                    boolean var52 = true;
                                                    for (class27 var53 = (class27) field498.method3290(); var53 != null; var53 = (class27) field498.method3291()) {
                                                        if (var53.field735.equals(var43)) {
                                                            if (var45 != 0 && var53.field734 == 0) {
                                                                var53.method3356();
                                                                var52 = false;
                                                            } else if (var45 == 0 && var53.field734 != 0) {
                                                                var53.method3356();
                                                                var52 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var52) {
                                                        field498.method3289(new class27(var43, var45));
                                                    }
                                                    var51.field369 = var45;
                                                }
                                                var51.field363 = var44;
                                                var51.field365 = var46;
                                                var51.field368 = var48;
                                                var51.field366 = var49;
                                                var43 = null;
                                                break;
                                            }
                                        }
                                        if (var43 != null && field724 < 200) {
                                            class22 var54 = new class22();
                                            field726[field724] = var54;
                                            var54.field367 = var43;
                                            var54.field363 = var44;
                                            var54.field369 = var45;
                                            var54.field365 = var46;
                                            var54.field368 = var48;
                                            var54.field366 = var49;
                                            field724++;
                                        }
                                    }
                                    field492 = 2;
                                    field663 = field655;
                                    boolean var55 = false;
                                    int var56 = field724;
                                    while (var56 > 0) {
                                        boolean var57 = true;
                                        var56--;
                                        for (int var58 = 0; var58 < var56; var58++) {
                                            boolean var59 = false;
                                            class22 var60 = field726[var58];
                                            class22 var61 = field726[var58 + 1];
                                            if (field467 != var60.field369 && field467 == var61.field369) {
                                                var59 = true;
                                            }
                                            if (!var59 && var60.field369 == 0 && var61.field369 != 0) {
                                                var59 = true;
                                            }
                                            if (!var59 && !var60.field368 && var61.field368) {
                                                var59 = true;
                                            }
                                            if (!var59 && !var60.field366 && var61.field366) {
                                                var59 = true;
                                            }
                                            if (var59) {
                                                class22 var62 = field726[var58];
                                                field726[var58] = field726[var58 + 1];
                                                field726[var58 + 1] = var62;
                                                var57 = false;
                                            }
                                        }
                                        if (var57) {
                                            break;
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 162) {
                                    Statics.field944 = field513.method2559();
                                    Statics.field385 = field513.method2473();
                                    for (int var63 = Statics.field944; var63 < Statics.field944 + 8; var63++) {
                                        for (int var64 = Statics.field385; var64 < Statics.field385 + 8; var64++) {
                                            if (field590[Statics.field2050][var63][var64] != null) {
                                                field590[Statics.field2050][var63][var64] = null;
                                                method13(var63, var64);
                                            }
                                        }
                                    }
                                    for (class21 var65 = (class21) field662.method3326(); var65 != null; var65 = (class21) field662.method3330()) {
                                        if (var65.field346 >= Statics.field944 && var65.field346 < Statics.field944 + 8 && var65.field347 >= Statics.field385 && var65.field347 < Statics.field385 + 8 && Statics.field2050 == var65.field345) {
                                            var65.field355 = 0;
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 151) {
                                    boolean var66 = field513.method2473() == 1;
                                    int var67 = field513.method2619();
                                    class157 var68 = class157.method2230(var67);
                                    if (var68.field2579 != var66) {
                                        var68.field2579 = var66;
                                        method1523(var68);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 211) {
                                    int var69 = field513.method2480();
                                    class18.method2912(var69);
                                    field658[++field659 - 1 & 0x1F] = var69 & 0x7FFF;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 233) {
                                    int var70 = field513.method2526();
                                    int var71 = field513.method2450();
                                    class158.field2686[var71] = var70;
                                    if (class158.field2687[var71] != var70) {
                                        class158.field2687[var71] = var70;
                                        method172(var71);
                                    }
                                    field656[++field657 - 1 & 0x1F] = var71;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 171) {
                                    int var72 = field513.method2559();
                                    class136[] var73 = Statics.method612();
                                    int var74 = 0;
                                    class136 var76;
                                    while (true) {
                                        if (var74 >= var73.length) {
                                            var76 = null;
                                            break;
                                        }
                                        class136 var75 = var73[var74];
                                        if (var75.field2314 == var72) {
                                            var76 = var75;
                                            break;
                                        }
                                        var74++;
                                    }
                                    Statics.field1017 = var76;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 116) {
                                    int var77 = field513.method2450();
                                    int var78 = field513.method2559();
                                    int var79 = field513.method2450();
                                    if (field710 != 0 && var78 != 0 && field712 < 50) {
                                        field713[field712] = var77;
                                        field674[field712] = var78;
                                        field715[field712] = var79;
                                        field717[field712] = null;
                                        field557[field712] = 0;
                                        field712++;
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 38) {
                                    field600 = 0;
                                    field613 = 0;
                                    field513.method2318();
                                    int var83 = field513.method2319(1);
                                    if (var83 != 0) {
                                        int var84 = field513.method2319(2);
                                        if (var84 == 0) {
                                            field596[++field613 - 1] = 2047;
                                        } else if (var84 == 1) {
                                            int var85 = field513.method2319(3);
                                            Statics.field1242.method229(var85, false);
                                            int var86 = field513.method2319(1);
                                            if (var86 == 1) {
                                                field596[++field613 - 1] = 2047;
                                            }
                                        } else if (var84 == 2) {
                                            int var87 = field513.method2319(3);
                                            Statics.field1242.method229(var87, true);
                                            int var88 = field513.method2319(3);
                                            Statics.field1242.method229(var88, true);
                                            int var89 = field513.method2319(1);
                                            if (var89 == 1) {
                                                field596[++field613 - 1] = 2047;
                                            }
                                        } else if (var84 == 3) {
                                            int var90 = field513.method2319(1);
                                            int var91 = field513.method2319(7);
                                            Statics.field2050 = field513.method2319(2);
                                            int var92 = field513.method2319(1);
                                            if (var92 == 1) {
                                                field596[++field613 - 1] = 2047;
                                            }
                                            int var93 = field513.method2319(7);
                                            Statics.field1242.method228(var93, var91, var90 == 1);
                                        }
                                    }
                                    method130();
                                    while (field513.method2321(field514) >= 11) {
                                        int var94 = field513.method2319(11);
                                        if (var94 == 2047) {
                                            break;
                                        }
                                        boolean var95 = false;
                                        if (field592[var94] == null) {
                                            field592[var94] = new class3();
                                            if (field597[var94] != null) {
                                                field592[var94].method22(field597[var94]);
                                            }
                                            var95 = true;
                                        }
                                        field594[++field593 - 1] = var94;
                                        class3 var96 = field592[var94];
                                        var96.field453 = field477;
                                        int var97 = field513.method2319(5);
                                        if (var97 > 15) {
                                            var97 -= 32;
                                        }
                                        int var98 = field513.method2319(5);
                                        if (var98 > 15) {
                                            var98 -= 32;
                                        }
                                        int var99 = field513.method2319(1);
                                        int var100 = field513.method2319(1);
                                        if (var100 == 1) {
                                            field596[++field613 - 1] = var94;
                                        }
                                        int var101 = field605[field513.method2319(3)];
                                        if (var95) {
                                            var96.field454 = var96.field440 = var101;
                                        }
                                        var96.method228(Statics.field1242.field458[0] + var98, Statics.field1242.field421[0] + var97, var99 == 1);
                                    }
                                    field513.method2320();
                                    for (int var102 = 0; var102 < field613; var102++) {
                                        int var103 = field596[var102];
                                        class3 var104 = field592[var103];
                                        int var105 = field513.method2559();
                                        if ((var105 & 0x40) != 0) {
                                            var105 += field513.method2559() << 8;
                                        }
                                        if ((var105 & 0x8) != 0) {
                                            var104.field429 = field513.method2450();
                                            if (var104.field429 == 65535) {
                                                var104.field429 = -1;
                                            }
                                        }
                                        if ((var105 & 0x20) != 0) {
                                            int var106 = field513.method2462();
                                            int var107 = field513.method2471();
                                            var104.method231(var106, var107, field477);
                                            var104.field426 = field477 + 300;
                                            var104.field427 = field513.method2462();
                                            var104.field428 = field513.method2473();
                                        }
                                        if ((var105 & 0x2) != 0) {
                                            var104.field416 = field513.method2478();
                                            var104.field431 = field513.method2450();
                                        }
                                        if ((var105 & 0x4) != 0) {
                                            int var108 = field513.method2479();
                                            int var109 = field513.method2471();
                                            int var110 = field513.method2473();
                                            int var111 = field513.field2024;
                                            if (var104.field41 != null && var104.field40 != null) {
                                                boolean var112 = false;
                                                if (var109 <= 1 && method17(var104.field41)) {
                                                    var112 = true;
                                                }
                                                if (!var112 && field546 == 0) {
                                                    field493.field2024 = 0;
                                                    field513.method2490(field493.field2022, 0, var110);
                                                    field493.field2024 = 0;
                                                    String var113 = class184.method3404(class146.method2683(class183.method560(field493)));
                                                    var104.field419 = var113.trim();
                                                    var104.field420 = var108 >> 8;
                                                    var104.field411 = var108 & 0xFF;
                                                    var104.field423 = 150;
                                                    if (var109 == 2 || var109 == 3) {
                                                        method208(1, class2.method533(1) + var104.field41, var113);
                                                    } else if (var109 == 1) {
                                                        method208(1, class2.method533(0) + var104.field41, var113);
                                                    } else {
                                                        method208(2, var104.field41, var113);
                                                    }
                                                }
                                            }
                                            field513.field2024 = var110 + var111;
                                        }
                                        if ((var105 & 0x200) != 0) {
                                            int var114 = field513.method2471();
                                            int var115 = field513.method2473();
                                            var104.method231(var114, var115, field477);
                                            var104.field426 = field477 + 300;
                                            var104.field427 = field513.method2559();
                                            var104.field428 = field513.method2559();
                                        }
                                        if ((var105 & 0x80) != 0) {
                                            var104.field419 = field513.method2630();
                                            if (var104.field419.charAt(0) == '~') {
                                                var104.field419 = var104.field419.substring(1);
                                                method208(2, var104.field41, var104.field419);
                                            } else if (Statics.field1242 == var104) {
                                                method208(2, var104.field41, var104.field419);
                                            }
                                            var104.field420 = 0;
                                            var104.field411 = 0;
                                            var104.field423 = 150;
                                        }
                                        if ((var105 & 0x400) != 0) {
                                            var104.field422 = field513.method2559();
                                            var104.field447 = field513.method2473();
                                            var104.field446 = field513.method2462();
                                            var104.field448 = field513.method2559();
                                            var104.field449 = field513.method2450() + field477;
                                            var104.field437 = field513.method2478() + field477;
                                            var104.field451 = field513.method2473();
                                            var104.field457 = 1;
                                            var104.field462 = 0;
                                        }
                                        if ((var105 & 0x10) != 0) {
                                            int var116 = field513.method2480();
                                            if (var116 == 65535) {
                                                var116 = -1;
                                            }
                                            int var117 = field513.method2471();
                                            method212(var104, var116, var117);
                                        }
                                        if ((var105 & 0x100) != 0) {
                                            var104.field415 = field513.method2480();
                                            int var118 = field513.method2619();
                                            var104.field450 = var118 >> 16;
                                            var104.field443 = (var118 & 0xFFFF) + field477;
                                            var104.field441 = 0;
                                            var104.field442 = 0;
                                            if (var104.field443 > field477) {
                                                var104.field441 = -1;
                                            }
                                            if (var104.field415 == 65535) {
                                                var104.field415 = -1;
                                            }
                                        }
                                        if ((var105 & 0x1) != 0) {
                                            int var119 = field513.method2462();
                                            byte[] var120 = new byte[var119];
                                            class126 var121 = new class126(var120);
                                            field513.method2490(var120, 0, var119);
                                            field597[var103] = var121;
                                            var104.method22(var121);
                                        }
                                    }
                                    for (int var122 = 0; var122 < field600; var122++) {
                                        int var123 = field601[var122];
                                        if (field477 != field592[var123].field453) {
                                            field592[var123] = null;
                                        }
                                    }
                                    if (field514 != field513.field2024) {
                                        throw new RuntimeException(field513.field2024 + class2.field17 + field514);
                                    }
                                    for (int var124 = 0; var124 < field593; var124++) {
                                        if (field592[field594[var124]] == null) {
                                            throw new RuntimeException(var124 + class2.field17 + field593);
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 82) {
                                    int var125 = field513.method2526();
                                    int var126 = field513.method2478();
                                    int var127 = var126 >> 10 & 0x1F;
                                    int var128 = var126 >> 5 & 0x1F;
                                    int var129 = var126 & 0x1F;
                                    int var130 = (var129 << 3) + (var127 << 19) + (var128 << 11);
                                    class157 var131 = class157.method2230(var125);
                                    if (var131.field2584 != var130) {
                                        var131.field2584 = var130;
                                        method1523(var131);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 111) {
                                    method121();
                                    field638 = field513.method2487();
                                    field665 = field655;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 70) {
                                    int var132 = field513.method2602();
                                    class157 var133 = class157.method2230(var132);
                                    for (int var134 = 0; var134 < var133.field2669.length; var134++) {
                                        var133.field2669[var134] = -1;
                                        var133.field2669[var134] = 0;
                                    }
                                    method1523(var133);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 36) {
                                    int var135 = field513.method2619();
                                    int var136 = field513.method2478();
                                    int var137 = field513.method2480();
                                    class157 var138 = class157.method2230(var135);
                                    var138.field2611 = (var137 << 16) + var136;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 21) {
                                    int var139 = field513.method2457();
                                    int var140 = field513.method2602();
                                    int var141 = field513.method2487();
                                    class157 var142 = class157.method2230(var140);
                                    int var143 = var142.field2596 + var141;
                                    int var144 = var142.field2575 + var139;
                                    if (var142.field2572 != var143 || var142.field2573 != var144) {
                                        var142.field2572 = var143;
                                        var142.field2573 = var144;
                                        method1523(var142);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 16) {
                                    if (field535 != -1) {
                                        int var145 = field535;
                                        if (class157.method1408(var145)) {
                                            method868(Statics.field2580[var145], 0);
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 254) {
                                    Statics.field385 = field513.method2473();
                                    Statics.field944 = field513.method2473();
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 138) {
                                    String var146 = field513.method2630();
                                    String var147 = class184.method3404(class146.method2683(class183.method560(field513)));
                                    method208(6, var146, var147);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 212) {
                                    int var148 = field513.method2526();
                                    int var149 = field513.method2450();
                                    if (var148 < -70000) {
                                        var149 += 32768;
                                    }
                                    class157 var150;
                                    if (var148 >= 0) {
                                        var150 = class157.method2230(var148);
                                    } else {
                                        var150 = null;
                                    }
                                    if (var150 != null) {
                                        for (int var151 = 0; var151 < var150.field2669.length; var151++) {
                                            var150.field2669[var151] = 0;
                                            var150.field2670[var151] = 0;
                                        }
                                    }
                                    class18.method11(var149);
                                    int var152 = field513.method2450();
                                    for (int var153 = 0; var153 < var152; var153++) {
                                        int var154 = field513.method2450();
                                        int var155 = field513.method2559();
                                        if (var155 == 255) {
                                            var155 = field513.method2526();
                                        }
                                        if (var150 != null && var153 < var150.field2669.length) {
                                            var150.field2669[var153] = var154;
                                            var150.field2670[var153] = var155;
                                        }
                                        class18.method4(var149, var153, var154 - 1, var155);
                                    }
                                    if (var150 != null) {
                                        method1523(var150);
                                    }
                                    method121();
                                    field658[++field659 - 1 & 0x1F] = var149 & 0x7FFF;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 133) {
                                    int var156 = field513.method2478();
                                    if (var156 == 65535) {
                                        var156 = -1;
                                    }
                                    int var157 = field513.method2602();
                                    int var158 = field513.method2479();
                                    if (var158 == 65535) {
                                        var158 = -1;
                                    }
                                    int var159 = field513.method2602();
                                    for (int var160 = var156; var160 <= var158; var160++) {
                                        long var161 = ((long) var159 << 32) + (long) var160;
                                        class178 var163 = field672.method3311(var161);
                                        if (var163 != null) {
                                            var163.method3357();
                                        }
                                        field672.method3317(new class170(var157), var161);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 200) {
                                    int var164 = field513.method2602();
                                    int var165 = field513.method2479();
                                    class157 var166 = class157.method2230(var164);
                                    if (var166.field2599 != 2 || var166.field2600 != var165) {
                                        var166.field2599 = 2;
                                        var166.field2600 = var165;
                                        method1523(var166);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 121) {
                                    int var167 = field513.method2478();
                                    int var168 = field513.method2478();
                                    int var169 = field513.method2479();
                                    int var170 = field513.method2526();
                                    class157 var171 = class157.method2230(var170);
                                    if (var171.field2607 != var167 || var171.field2563 != var169 || var171.field2610 != var168) {
                                        var171.field2607 = var167;
                                        var171.field2563 = var169;
                                        var171.field2610 = var168;
                                        method1523(var171);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 33) {
                                    method121();
                                    int var172 = field513.method2602();
                                    int var173 = field513.method2471();
                                    int var174 = field513.method2471();
                                    field550[var173] = var172;
                                    field610[var173] = var174;
                                    field611[var173] = 1;
                                    for (int var175 = 0; var175 < 98; var175++) {
                                        if (var172 >= class129.field2030[var175]) {
                                            field611[var173] = var175 + 2;
                                        }
                                    }
                                    field497[++field624 - 1 & 0x1F] = var173;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 201) {
                                    field718 = true;
                                    Statics.field1833 = field513.method2559();
                                    Statics.field2809 = field513.method2559();
                                    Statics.field361 = field513.method2450();
                                    Statics.field901 = field513.method2559();
                                    Statics.field302 = field513.method2559();
                                    if (Statics.field302 >= 100) {
                                        Statics.field2346 = Statics.field1833 * 128 + 64;
                                        Statics.field1359 = Statics.field2809 * 128 + 64;
                                        Statics.field2319 = method5(Statics.field2346, Statics.field1359, Statics.field2050) - Statics.field361;
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 13) {
                                    field718 = false;
                                    for (int var176 = 0; var176 < 5; var176++) {
                                        field719[var176] = false;
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 173) {
                                    method1392();
                                    field515 = -1;
                                    var3 = false;
                                    break label3168;
                                }
                                if (field515 == 170) {
                                    int var177 = field513.method2559();
                                    int var178 = field513.method2559();
                                    int var179 = field513.method2471();
                                    Statics.field2050 = var178 >> 1;
                                    Statics.field1242.method228(var177, var179, (var178 & 0x1) == 1);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 105) {
                                    String var180 = field513.method2630();
                                    if (var180.endsWith(":tradereq:")) {
                                        String var181 = var180.substring(0, var180.indexOf(":"));
                                        boolean var182 = false;
                                        if (method17(var181)) {
                                            var182 = true;
                                        }
                                        if (!var182 && field546 == 0) {
                                            method208(4, var181, class133.field2092);
                                        }
                                    } else if (var180.endsWith(":duelreq:")) {
                                        String var183 = var180.substring(0, var180.indexOf(":"));
                                        boolean var184 = false;
                                        if (method17(var183)) {
                                            var184 = true;
                                        }
                                        if (!var184 && field546 == 0) {
                                            method208(8, var183, class133.field2214);
                                        }
                                    } else if (var180.endsWith(":chalreq:")) {
                                        String var185 = var180.substring(0, var180.indexOf(":"));
                                        boolean var186 = false;
                                        if (method17(var185)) {
                                            var186 = true;
                                        }
                                        if (!var186 && field546 == 0) {
                                            String var187 = var180.substring(var180.indexOf(":") + 1, var180.length() - 9);
                                            method208(8, var185, var187);
                                        }
                                    } else if (var180.endsWith(":assistreq:")) {
                                        String var188 = var180.substring(0, var180.indexOf(":"));
                                        boolean var189 = false;
                                        if (method17(var188)) {
                                            var189 = true;
                                        }
                                        if (!var189 && field546 == 0) {
                                            method208(10, var188, "");
                                        }
                                    } else if (var180.endsWith(":clan:")) {
                                        String var190 = var180.substring(0, var180.indexOf(":clan:"));
                                        method208(11, "", var190);
                                    } else if (var180.endsWith(":trade:")) {
                                        String var191 = var180.substring(0, var180.indexOf(":trade:"));
                                        if (field546 == 0) {
                                            method208(12, "", var191);
                                        }
                                    } else if (var180.endsWith(":assist:")) {
                                        String var192 = var180.substring(0, var180.indexOf(":assist:"));
                                        if (field546 == 0) {
                                            method208(13, "", var192);
                                        }
                                    } else {
                                        method208(0, "", var180);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 190) {
                                    int var193 = field513.method2526();
                                    class4 var194 = (class4) field567.method3311((long) var193);
                                    if (var194 != null) {
                                        method2212(var194, true);
                                    }
                                    if (field607 != null) {
                                        method1523(field607);
                                        field607 = null;
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 18) {
                                    field689 = field513.method2559();
                                    field668 = field513.method2559();
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 8) {
                                    class181.method3002(field513, field514);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 10) {
                                    Statics.field944 = field513.method2473();
                                    Statics.field385 = field513.method2471();
                                    while (field513.field2024 < field514) {
                                        field515 = field513.method2559();
                                        method2674();
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 168) {
                                    int var195 = field513.method2457();
                                    int var196 = field513.method2451();
                                    class157 var197 = class157.method2230(var196);
                                    if (var197.field2603 != var195 || var195 == -1) {
                                        var197.field2603 = var195;
                                        var197.field2673 = 0;
                                        var197.field2615 = 0;
                                        method1523(var197);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 172) {
                                    while (field513.field2024 < field514) {
                                        int var198 = field513.method2559();
                                        boolean var199 = (var198 & 0x1) == 1;
                                        String var200 = field513.method2630();
                                        String var201 = field513.method2630();
                                        field513.method2630();
                                        for (int var202 = 0; var202 < field563; var202++) {
                                            class11 var203 = field643[var202];
                                            if (var199) {
                                                if (var201.equals(var203.field189)) {
                                                    var203.field189 = var200;
                                                    var203.field191 = var201;
                                                    var200 = null;
                                                    break;
                                                }
                                            } else if (var200.equals(var203.field189)) {
                                                var203.field189 = var200;
                                                var203.field191 = var201;
                                                var200 = null;
                                                break;
                                            }
                                        }
                                        if (var200 != null && field563 < 100) {
                                            class11 var204 = new class11();
                                            field643[field563] = var204;
                                            var204.field189 = var200;
                                            var204.field191 = var201;
                                            field563++;
                                        }
                                    }
                                    field663 = field655;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 7) {
                                    field582 = field513.method2479() * 30;
                                    field665 = field655;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 210) {
                                    field704 = 0;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 163) {
                                    field508 = field513.method2559();
                                    if (field508 == 1) {
                                        field725 = field513.method2450();
                                    }
                                    if (field508 >= 2 && field508 <= 6) {
                                        if (field508 == 2) {
                                            field491 = 64;
                                            field636 = 64;
                                        }
                                        if (field508 == 3) {
                                            field491 = 0;
                                            field636 = 64;
                                        }
                                        if (field508 == 4) {
                                            field491 = 128;
                                            field636 = 64;
                                        }
                                        if (field508 == 5) {
                                            field491 = 64;
                                            field636 = 0;
                                        }
                                        if (field508 == 6) {
                                            field491 = 64;
                                            field636 = 128;
                                        }
                                        field508 = 2;
                                        field488 = field513.method2450();
                                        field489 = field513.method2450();
                                        field490 = field513.method2559();
                                    }
                                    if (field508 == 10) {
                                        field487 = field513.method2450();
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 127) {
                                    for (int var205 = 0; var205 < field592.length; var205++) {
                                        if (field592[var205] != null) {
                                            field592[var205].field456 = -1;
                                        }
                                    }
                                    for (int var206 = 0; var206 < field584.length; var206++) {
                                        if (field584[var206] != null) {
                                            field584[var206].field456 = -1;
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 14) {
                                    field551 = field655;
                                    if (field514 == 0) {
                                        field697 = null;
                                        field703 = null;
                                        Statics.field1195 = 0;
                                        Statics.field1421 = null;
                                        field515 = -1;
                                        var3 = true;
                                        break label3168;
                                    }
                                    field703 = field513.method2630();
                                    long var207 = field513.method2454();
                                    field697 = class145.method2209(var207);
                                    Statics.field190 = field513.method2449();
                                    int var209 = field513.method2559();
                                    if (var209 == 255) {
                                        field515 = -1;
                                        var3 = true;
                                        break label3168;
                                    }
                                    Statics.field1195 = var209;
                                    class8[] var210 = new class8[100];
                                    for (int var211 = 0; var211 < Statics.field1195; var211++) {
                                        var210[var211] = new class8();
                                        var210[var211].field116 = field513.method2630();
                                        var210[var211].field113 = class147.method2681(var210[var211].field116, Statics.field520);
                                        var210[var211].field114 = field513.method2450();
                                        var210[var211].field115 = field513.method2449();
                                        field513.method2630();
                                        if (var210[var211].field116.equals(Statics.field1242.field41)) {
                                            Statics.field1023 = var210[var211].field115;
                                        }
                                    }
                                    boolean var212 = false;
                                    int var213 = Statics.field1195;
                                    while (var213 > 0) {
                                        boolean var214 = true;
                                        var213--;
                                        for (int var215 = 0; var215 < var213; var215++) {
                                            if (var210[var215].field113.compareTo(var210[var215 + 1].field113) > 0) {
                                                class8 var216 = var210[var215];
                                                var210[var215] = var210[var215 + 1];
                                                var210[var215 + 1] = var216;
                                                var214 = false;
                                            }
                                        }
                                        if (var214) {
                                            break;
                                        }
                                    }
                                    Statics.field1421 = var210;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 41) {
                                    int var217 = field513.method2451();
                                    class157 var218 = class157.method2230(var217);
                                    var218.field2599 = 3;
                                    var218.field2600 = Statics.field1242.field40.method3203();
                                    method1523(var218);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 68) {
                                    String var219 = field513.method2630();
                                    long var220 = field513.method2454();
                                    long var222 = (long) field513.method2450();
                                    long var224 = (long) field513.method2452();
                                    int var226 = field513.method2559();
                                    long var227 = (var222 << 32) + var224;
                                    boolean var229 = false;
                                    for (int var230 = 0; var230 < 100; var230++) {
                                        if (field691[var230] == var227) {
                                            var229 = true;
                                            break;
                                        }
                                    }
                                    if (var226 <= 1 && method17(var219)) {
                                        var229 = true;
                                    }
                                    if (!var229 && field546 == 0) {
                                        field691[field698] = var227;
                                        field698 = (field698 + 1) % 100;
                                        String var231 = class184.method3404(class146.method2683(class183.method560(field513)));
                                        if (var226 == 2 || var226 == 3) {
                                            method34(9, class2.method533(1) + var219, var231, class145.method2211(var220));
                                        } else if (var226 == 1) {
                                            method34(9, class2.method533(0) + var219, var231, class145.method2211(var220));
                                        } else {
                                            method34(9, var219, var231, class145.method2211(var220));
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 155) {
                                    field600 = 0;
                                    field613 = 0;
                                    field513.method2318();
                                    int var232 = field513.method2319(8);
                                    if (var232 < field465) {
                                        for (int var233 = var232; var233 < field465; var233++) {
                                            field601[++field600 - 1] = field506[var233];
                                        }
                                    }
                                    if (var232 > field465) {
                                        throw new RuntimeException("");
                                    }
                                    field465 = 0;
                                    for (int var234 = 0; var234 < var232; var234++) {
                                        int var235 = field506[var234];
                                        class24 var236 = field584[var235];
                                        int var237 = field513.method2319(1);
                                        if (var237 == 0) {
                                            field506[++field465 - 1] = var235;
                                            var236.field453 = field477;
                                        } else {
                                            int var238 = field513.method2319(2);
                                            if (var238 == 0) {
                                                field506[++field465 - 1] = var235;
                                                var236.field453 = field477;
                                                field596[++field613 - 1] = var235;
                                            } else if (var238 == 1) {
                                                field506[++field465 - 1] = var235;
                                                var236.field453 = field477;
                                                int var239 = field513.method2319(3);
                                                var236.method229(var239, false);
                                                int var240 = field513.method2319(1);
                                                if (var240 == 1) {
                                                    field596[++field613 - 1] = var235;
                                                }
                                            } else if (var238 == 2) {
                                                field506[++field465 - 1] = var235;
                                                var236.field453 = field477;
                                                int var241 = field513.method2319(3);
                                                var236.method229(var241, true);
                                                int var242 = field513.method2319(3);
                                                var236.method229(var242, true);
                                                int var243 = field513.method2319(1);
                                                if (var243 == 1) {
                                                    field596[++field613 - 1] = var235;
                                                }
                                            } else if (var238 == 3) {
                                                field601[++field600 - 1] = var235;
                                            }
                                        }
                                    }
                                    while (field513.method2321(field514) >= 27) {
                                        int var244 = field513.method2319(15);
                                        if (var244 == 32767) {
                                            break;
                                        }
                                        boolean var245 = false;
                                        if (field584[var244] == null) {
                                            field584[var244] = new class24();
                                            var245 = true;
                                        }
                                        class24 var246 = field584[var244];
                                        field506[++field465 - 1] = var244;
                                        var246.field453 = field477;
                                        int var247 = field513.method2319(5);
                                        if (var247 > 15) {
                                            var247 -= 32;
                                        }
                                        int var248 = field513.method2319(5);
                                        if (var248 > 15) {
                                            var248 -= 32;
                                        }
                                        int var249 = field513.method2319(1);
                                        int var250 = field605[field513.method2319(3)];
                                        if (var245) {
                                            var246.field454 = var246.field440 = var250;
                                        }
                                        var246.field384 = Statics.method202(field513.method2319(14));
                                        int var251 = field513.method2319(1);
                                        if (var251 == 1) {
                                            field596[++field613 - 1] = var244;
                                        }
                                        var246.field410 = var246.field384.field772;
                                        var246.field463 = var246.field384.field795;
                                        if (var246.field463 == 0) {
                                            var246.field440 = 0;
                                        }
                                        var246.field414 = var246.field384.field776;
                                        var246.field459 = var246.field384.field779;
                                        var246.field452 = var246.field384.field780;
                                        var246.field406 = var246.field384.field781;
                                        var246.field445 = var246.field384.field768;
                                        var246.field412 = var246.field384.field775;
                                        var246.field413 = var246.field384.field777;
                                        var246.method228(Statics.field1242.field458[0] + var248, Statics.field1242.field421[0] + var247, var249 == 1);
                                    }
                                    field513.method2320();
                                    method2430();
                                    for (int var252 = 0; var252 < field600; var252++) {
                                        int var253 = field601[var252];
                                        if (field477 != field584[var253].field453) {
                                            field584[var253].field384 = null;
                                            field584[var253] = null;
                                        }
                                    }
                                    if (field514 != field513.field2024) {
                                        throw new RuntimeException(field513.field2024 + class2.field17 + field514);
                                    }
                                    for (int var254 = 0; var254 < field465; var254++) {
                                        if (field584[field506[var254]] == null) {
                                            throw new RuntimeException(var254 + class2.field17 + field465);
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 158) {
                                    int var255 = field513.method2619();
                                    Statics.field1198 = Statics.field108.method1484(var255);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 241) {
                                    int var256 = field513.method2526();
                                    int var257 = field513.method2480();
                                    class157 var258 = class157.method2230(var256);
                                    if (var258 != null && var258.field2620 == 0) {
                                        if (var257 > var258.field2583 - var258.field2577) {
                                            var257 = var258.field2583 - var258.field2577;
                                        }
                                        if (var257 < 0) {
                                            var257 = 0;
                                        }
                                        if (var258.field2588 != var257) {
                                            var258.field2588 = var257;
                                            method1523(var258);
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 78) {
                                    int var259 = field514 + field513.field2024;
                                    int var260 = field513.method2450();
                                    int var261 = field513.method2450();
                                    if (field535 != var260) {
                                        field535 = var260;
                                        method2678(field535);
                                        class25.method245(field535);
                                        for (int var262 = 0; var262 < 100; var262++) {
                                            field675[var262] = true;
                                        }
                                    }
                                    while (var261-- > 0) {
                                        int var263 = field513.method2526();
                                        int var264 = field513.method2450();
                                        int var265 = field513.method2559();
                                        class4 var266 = (class4) field567.method3311((long) var263);
                                        if (var266 != null && var266.field60 != var264) {
                                            method2212(var266, true);
                                            var266 = null;
                                        }
                                        if (var266 == null) {
                                            var266 = method122(var263, var264, var265);
                                        }
                                        var266.field63 = true;
                                    }
                                    for (class4 var267 = (class4) field567.method3308(); var267 != null; var267 = (class4) field567.method3309()) {
                                        if (var267.field63) {
                                            var267.field63 = false;
                                        } else {
                                            method2212(var267, true);
                                        }
                                    }
                                    field672 = new class174(512);
                                    while (field513.field2024 < var259) {
                                        int var268 = field513.method2526();
                                        int var269 = field513.method2450();
                                        int var270 = field513.method2450();
                                        int var271 = field513.method2526();
                                        for (int var272 = var269; var272 <= var270; var272++) {
                                            long var273 = ((long) var268 << 32) + (long) var272;
                                            field672.method3317(new class170(var271), var273);
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 242) {
                                    field718 = true;
                                    Statics.field430 = field513.method2559();
                                    Statics.field185 = field513.method2559();
                                    Statics.field278 = field513.method2450();
                                    Statics.field239 = field513.method2559();
                                    Statics.field172 = field513.method2559();
                                    if (Statics.field172 >= 100) {
                                        int var275 = Statics.field430 * 128 + 64;
                                        int var276 = Statics.field185 * 128 + 64;
                                        int var277 = method5(var275, var276, Statics.field2050) - Statics.field278;
                                        int var278 = var275 - Statics.field2346;
                                        int var279 = var277 - Statics.field2319;
                                        int var280 = var276 - Statics.field1359;
                                        int var281 = (int) Math.sqrt((double) (var278 * var278 + var280 * var280));
                                        Statics.field298 = (int) (Math.atan2((double) var279, (double) var281) * 325.949D) & 0x7FF;
                                        Statics.field255 = (int) (Math.atan2((double) var278, (double) var280) * -325.949D) & 0x7FF;
                                        if (Statics.field298 < 128) {
                                            Statics.field298 = 128;
                                        }
                                        if (Statics.field298 > 383) {
                                            Statics.field298 = 383;
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 6) {
                                    String var282 = field513.method2630();
                                    int var283 = field513.method2526();
                                    class157 var284 = class157.method2230(var283);
                                    if (!var282.equals(var284.field2614)) {
                                        var284.field2614 = var282;
                                        method1523(var284);
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 86) {
                                    int var285 = field513.method2559();
                                    String var286 = field513.method2630();
                                    int var287 = field513.method2462();
                                    if (var285 >= 1 && var285 <= 8) {
                                        if (var286.equalsIgnoreCase("null")) {
                                            var286 = null;
                                        }
                                        field603[var285 - 1] = var286;
                                        field604[var285 - 1] = var287 == 0;
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 216) {
                                    String var288 = field513.method2630();
                                    int var289 = field513.method2450();
                                    byte var290 = field513.method2449();
                                    boolean var291 = false;
                                    if (var290 == -128) {
                                        var291 = true;
                                    }
                                    if (var291) {
                                        if (Statics.field1195 == 0) {
                                            field515 = -1;
                                            var3 = true;
                                            break label3168;
                                        }
                                        boolean var292 = false;
                                        int var293;
                                        for (var293 = 0; var293 < Statics.field1195 && (!Statics.field1421[var293].field116.equals(var288) || Statics.field1421[var293].field114 != var289); var293++) {
                                        }
                                        if (var293 < Statics.field1195) {
                                            while (var293 < Statics.field1195 - 1) {
                                                Statics.field1421[var293] = Statics.field1421[var293 + 1];
                                                var293++;
                                            }
                                            Statics.field1195--;
                                            Statics.field1421[Statics.field1195] = null;
                                        }
                                    } else {
                                        field513.method2630();
                                        class8 var294 = new class8();
                                        var294.field116 = var288;
                                        var294.field113 = class147.method2681(var294.field116, Statics.field520);
                                        var294.field114 = var289;
                                        var294.field115 = var290;
                                        int var295;
                                        for (var295 = Statics.field1195 - 1; var295 >= 0; var295--) {
                                            int var296 = Statics.field1421[var295].field113.compareTo(var294.field116);
                                            if (var296 == 0) {
                                                Statics.field1421[var295].field114 = var289;
                                                Statics.field1421[var295].field115 = var290;
                                                if (var288.equals(Statics.field1242.field41)) {
                                                    Statics.field1023 = var290;
                                                }
                                                field551 = field655;
                                                field515 = -1;
                                                var3 = true;
                                                break label3168;
                                            }
                                            if (var296 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field1195 >= Statics.field1421.length) {
                                            field515 = -1;
                                            var3 = true;
                                            break label3168;
                                        }
                                        for (int var297 = Statics.field1195 - 1; var297 > var295; var297--) {
                                            Statics.field1421[var297 + 1] = Statics.field1421[var297];
                                        }
                                        if (Statics.field1195 == 0) {
                                            Statics.field1421 = new class8[100];
                                        }
                                        Statics.field1421[var295 + 1] = var294;
                                        Statics.field1195++;
                                        if (var288.equals(Statics.field1242.field41)) {
                                            Statics.field1023 = var290;
                                        }
                                    }
                                    field551 = field655;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 63) {
                                    method121();
                                    field637 = field513.method2559();
                                    field665 = field655;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 248) {
                                    field513.field2024 += 28;
                                    if (field513.method2468()) {
                                        class115 var298 = field513;
                                        int var299 = field513.field2024 - 28;
                                        if (class81.field1409 != null) {
                                            try {
                                                class81.field1409.method575(0L);
                                                class81.field1409.method557(var298.field2022, var299, 24);
                                            } catch (Exception var448) {
                                            }
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 181) {
                                    for (int var301 = 0; var301 < class158.field2687.length; var301++) {
                                        if (class158.field2687[var301] != class158.field2686[var301]) {
                                            class158.field2687[var301] = class158.field2686[var301];
                                            method172(var301);
                                            field656[++field657 - 1 & 0x1F] = var301;
                                        }
                                    }
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 91) {
                                    int var302 = field513.method2526();
                                    int var303 = field513.method2450();
                                    if (var302 < -70000) {
                                        var303 += 32768;
                                    }
                                    class157 var304;
                                    if (var302 >= 0) {
                                        var304 = class157.method2230(var302);
                                    } else {
                                        var304 = null;
                                    }
                                    while (field513.field2024 < field514) {
                                        int var305 = field513.method2580();
                                        int var306 = field513.method2450();
                                        int var307 = 0;
                                        if (var306 != 0) {
                                            var307 = field513.method2559();
                                            if (var307 == 255) {
                                                var307 = field513.method2526();
                                            }
                                        }
                                        if (var304 != null && var305 >= 0 && var305 < var304.field2669.length) {
                                            var304.field2669[var305] = var306;
                                            var304.field2670[var305] = var307;
                                        }
                                        class18.method4(var303, var305, var306 - 1, var307);
                                    }
                                    if (var304 != null) {
                                        method1523(var304);
                                    }
                                    method121();
                                    field658[++field659 - 1 & 0x1F] = var303 & 0x7FFF;
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 208) {
                                    int var308 = field513.method2479();
                                    int var309 = field513.method2451();
                                    int var310 = field513.method2462();
                                    class4 var311 = (class4) field567.method3311((long) var309);
                                    if (var311 != null) {
                                        method2212(var311, var311.field60 != var308);
                                    }
                                    method122(var309, var308, var310);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                if (field515 == 140) {
                                    method6(true);
                                    field515 = -1;
                                    var3 = true;
                                    break label3168;
                                }
                                class79.method1474("" + field515 + class2.field17 + field614 + class2.field17 + field521 + class2.field17 + field514, (Throwable) null);
                                method1392();
                            } catch (IOException var451) {
                                if (field518 > 0) {
                                    method1392();
                                } else {
                                    method138(40);
                                    Statics.field510 = Statics.field579;
                                    Statics.field579 = null;
                                }
                            } catch (Exception var452) {
                                String var314 = "" + field515 + class2.field17 + field614 + class2.field17 + field521 + class2.field17 + field514 + class2.field17 + (Statics.field176 + Statics.field1242.field458[0]) + class2.field17 + (Statics.field1999 + Statics.field1242.field421[0]) + class2.field17;
                                for (int var315 = 0; var315 < field514 && var315 < 50; var315++) {
                                    var314 = var314 + field513.field2022[var315] + class2.field17;
                                }
                                class79.method1474(var314, var452);
                                method1392();
                            }
                            var3 = true;
                        }
                    }
                    if (!var3) {
                        break;
                    }
                }
                if (field475 == 30) {
                    class181.method1582(field499, 2);
                    Object var316 = Statics.field1168.field242;
                    synchronized (Statics.field1168.field242) {
                        if (!field729) {
                            Statics.field1168.field250 = 0;
                        } else if (class76.field1373 != 0 || Statics.field1168.field250 >= 40) {
                            field499.method2322(221);
                            field499.method2554(0);
                            int var317 = field499.field2024;
                            int var318 = 0;
                            for (int var319 = 0; var319 < Statics.field1168.field250 && field499.field2024 - var317 < 240; var319++) {
                                var318++;
                                int var320 = Statics.field1168.field241[var319];
                                if (var320 < 0) {
                                    var320 = 0;
                                } else if (var320 > 502) {
                                    var320 = 502;
                                }
                                int var321 = Statics.field1168.field244[var319];
                                if (var321 < 0) {
                                    var321 = 0;
                                } else if (var321 > 764) {
                                    var321 = 764;
                                }
                                int var322 = var320 * 765 + var321;
                                if (Statics.field1168.field241[var319] == -1 && Statics.field1168.field244[var319] == -1) {
                                    var321 = -1;
                                    var320 = -1;
                                    var322 = 524287;
                                }
                                if (field479 != var321 || field480 != var320) {
                                    int var323 = var321 - field479;
                                    field479 = var321;
                                    int var324 = var320 - field480;
                                    field480 = var320;
                                    if (field481 < 8 && var323 >= -32 && var323 <= 31 && var324 >= -32 && var324 <= 31) {
                                        var323 += 32;
                                        var324 += 32;
                                        field499.method2435((field481 << 12) + (var323 << 6) + var324);
                                        field481 = 0;
                                    } else if (field481 < 8) {
                                        field499.method2436((field481 << 19) + 8388608 + var322);
                                        field481 = 0;
                                    } else {
                                        field499.method2551((field481 << 19) + -1073741824 + var322);
                                        field481 = 0;
                                    }
                                } else if (field481 < 2047) {
                                    field481++;
                                }
                            }
                            field499.method2528(field499.field2024 - var317);
                            if (var318 >= Statics.field1168.field250) {
                                Statics.field1168.field250 = 0;
                            } else {
                                Statics.field1168.field250 -= var318;
                                for (int var325 = 0; var325 < Statics.field1168.field250; var325++) {
                                    Statics.field1168.field244[var325] = Statics.field1168.field244[var318 + var325];
                                    Statics.field1168.field241[var325] = Statics.field1168.field241[var318 + var325];
                                }
                            }
                        }
                    }
                    if (class76.field1373 != 0) {
                        long var327 = (class76.field1376 - field478) / 50L;
                        if (var327 > 4095L) {
                            var327 = 4095L;
                        }
                        field478 = class76.field1376;
                        int var329 = class76.field1377;
                        if (var329 < 0) {
                            var329 = 0;
                        } else if (var329 > 502) {
                            var329 = 502;
                        }
                        int var330 = class76.field1374;
                        if (var330 < 0) {
                            var330 = 0;
                        } else if (var330 > 764) {
                            var330 = 764;
                        }
                        int var331 = var329 * 765 + var330;
                        byte var332 = 0;
                        if (class76.field1373 == 2) {
                            var332 = 1;
                        }
                        int var333 = (int) var327;
                        field499.method2322(148);
                        field499.method2551((var332 << 19) + (var333 << 20) + var331);
                    }
                    if (field483 > 0) {
                        field499.method2322(157);
                        field499.method2435(0);
                        int var334 = field499.field2024;
                        long var335 = class120.method2609();
                        for (int var337 = 0; var337 < field483; var337++) {
                            if (field695[var337] != -1) {
                                long var338 = var335 - field696;
                                if (var338 > 16777215L) {
                                    var338 = 16777215L;
                                }
                                field696 = var335;
                                field499.method2469(field695[var337]);
                                field499.method2482((int) var338);
                            }
                        }
                        field499.method2444(field499.field2024 - var334);
                    }
                    if (field562 > 0) {
                        field562--;
                    }
                    if (class74.field1356[96] || class74.field1356[97] || class74.field1356[98] || class74.field1356[99]) {
                        field733 = true;
                    }
                    if (field733 && field562 <= 0) {
                        field562 = 20;
                        field733 = false;
                        field499.method2322(182);
                        field499.method2477(field559);
                        field499.method2460(field558);
                    }
                    if (Statics.field1021 && !field482) {
                        field482 = true;
                        field499.method2322(147);
                        field499.method2554(1);
                    }
                    if (!Statics.field1021 && field482) {
                        field482 = false;
                        field499.method2322(147);
                        field499.method2554(0);
                    }
                    if (field472 && Statics.field2050 != field523) {
                        method1506(Statics.field917, Statics.field300, Statics.field2050, Statics.field1242.field458[0], Statics.field1242.field421[0]);
                    } else if (Statics.field2050 != field692) {
                        field692 = Statics.field2050;
                        int var340 = Statics.field2050;
                        int[] var341 = Statics.field56.field1446;
                        int var342 = var341.length;
                        for (int var343 = 0; var343 < var342; var343++) {
                            var341[var343] = 0;
                        }
                        int var344 = 1;
                        while (true) {
                            if (var344 >= 103) {
                                int var347 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                int var348 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                Statics.field56.method1739();
                                for (int var349 = 1; var349 < 103; var349++) {
                                    for (int var350 = 1; var350 < 103; var350++) {
                                        if ((class9.field135[var340][var350][var349] & 0x18) == 0) {
                                            method806(var340, var350, var349, var347, var348);
                                        }
                                        if (var340 < 3 && (class9.field135[var340 + 1][var350][var349] & 0x8) != 0) {
                                            method806(var340 + 1, var350, var349, var347, var348);
                                        }
                                    }
                                }
                                field700 = 0;
                                for (int var351 = 0; var351 < 104; var351++) {
                                    for (int var352 = 0; var352 < 104; var352++) {
                                        int var353 = Statics.field529.method1910(Statics.field2050, var351, var352);
                                        if (var353 != 0) {
                                            int var354 = var353 >> 14 & 0x7FFF;
                                            int var355 = class31.method132(var354).field837;
                                            if (var355 >= 0) {
                                                int var356 = var351;
                                                int var357 = var352;
                                                if (var355 != 22 && var355 != 29 && var355 != 34 && var355 != 36 && var355 != 46 && var355 != 47 && var355 != 48) {
                                                    int[][] var358 = field530[Statics.field2050].field2729;
                                                    for (int var359 = 0; var359 < 10; var359++) {
                                                        int var360 = (int) (Math.random() * 4.0D);
                                                        if (var360 == 0 && var356 > 0 && var356 > var351 - 3 && (var358[var356 - 1][var357] & 0x12C0108) == 0) {
                                                            var356--;
                                                        }
                                                        if (var360 == 1 && var356 < 103 && var356 < var351 + 3 && (var358[var356 + 1][var357] & 0x12C0180) == 0) {
                                                            var356++;
                                                        }
                                                        if (var360 == 2 && var357 > 0 && var357 > var352 - 3 && (var358[var356][var357 - 1] & 0x12C0102) == 0) {
                                                            var357--;
                                                        }
                                                        if (var360 == 3 && var357 < 103 && var357 < var352 + 3 && (var358[var356][var357 + 1] & 0x12C0120) == 0) {
                                                            var357++;
                                                        }
                                                    }
                                                }
                                                field509[field700] = Statics.field1283[var355];
                                                field609[field700] = var356;
                                                field501[field700] = var357;
                                                field700++;
                                            }
                                        }
                                    }
                                }
                                Statics.field1415.method1666();
                                break;
                            }
                            int var345 = (103 - var344) * 2048 + 24628;
                            for (int var346 = 1; var346 < 103; var346++) {
                                if ((class9.field135[var340][var346][var344] & 0x18) == 0) {
                                    Statics.field529.method1890(var341, var345, 512, var340, var346, var344);
                                }
                                if (var340 < 3 && (class9.field135[var340 + 1][var346][var344] & 0x8) != 0) {
                                    Statics.field529.method1890(var341, var345, 512, var340 + 1, var346, var344);
                                }
                                var345 += 4;
                            }
                            var344++;
                        }
                    }
                    if (field475 == 30) {
                        method2207();
                        method244();
                        field516++;
                        if (field516 <= 750) {
                            method611();
                            method2039();
                            for (int var361 = -1; var361 < field593; var361++) {
                                int var362;
                                if (var361 == -1) {
                                    var362 = 2047;
                                } else {
                                    var362 = field594[var361];
                                }
                                class3 var363 = field592[var362];
                                if (var363 != null && var363.field423 > 0) {
                                    var363.field423--;
                                    if (var363.field423 == 0) {
                                        var363.field419 = null;
                                    }
                                }
                            }
                            for (int var364 = 0; var364 < field465; var364++) {
                                int var365 = field506[var364];
                                class24 var366 = field584[var365];
                                if (var366 != null && var366.field423 > 0) {
                                    var366.field423--;
                                    if (var366.field423 == 0) {
                                        var366.field419 = null;
                                    }
                                }
                            }
                            field585++;
                            if (field470 != 0) {
                                field581 += 20;
                                if (field581 >= 400) {
                                    field470 = 0;
                                }
                            }
                            if (Statics.field1016 != null) {
                                field583++;
                                if (field583 >= 15) {
                                    method1523(Statics.field1016);
                                    Statics.field1016 = null;
                                }
                            }
                            if (Statics.field1953 != null) {
                                method1523(Statics.field1953);
                                field541++;
                                if (class76.field1367 > field586 + 5 || class76.field1367 < field586 - 5 || class76.field1378 > field587 + 5 || class76.field1378 < field587 - 5) {
                                    field589 = true;
                                }
                                if (class76.field1366 == 0) {
                                    if (!field589 || field541 < 5) {
                                        label3248: {
                                            label2266: {
                                                if (field599 != 1) {
                                                    int var373 = field615 - 1;
                                                    boolean var374;
                                                    if (var373 < 0) {
                                                        var374 = false;
                                                    } else {
                                                        int var375 = field728[var373];
                                                        if (var375 >= 2000) {
                                                            var375 -= 2000;
                                                        }
                                                        if (var375 == 1007) {
                                                            var374 = true;
                                                        } else {
                                                            var374 = false;
                                                        }
                                                    }
                                                    if (!var374) {
                                                        break label2266;
                                                    }
                                                }
                                                if (field615 > 2) {
                                                    method173();
                                                    break label3248;
                                                }
                                            }
                                            if (field615 > 0) {
                                                method223(field615 - 1);
                                            }
                                        }
                                    } else if (Statics.field96 == Statics.field1953 && field708 != field572) {
                                        class157 var367 = Statics.field1953;
                                        byte var368 = 0;
                                        if (field588 == 1 && var367.field2675 == 206) {
                                            var368 = 1;
                                        }
                                        if (var367.field2669[field708] <= 0) {
                                            var368 = 0;
                                        }
                                        if (class161.method2923(method1599(var367))) {
                                            int var369 = field572;
                                            int var370 = field708;
                                            var367.field2669[var370] = var367.field2669[var369];
                                            var367.field2670[var370] = var367.field2670[var369];
                                            var367.field2669[var369] = -1;
                                            var367.field2670[var369] = 0;
                                        } else if (var368 == 1) {
                                            int var371 = field572;
                                            int var372 = field708;
                                            while (var371 != var372) {
                                                if (var371 > var372) {
                                                    var367.method3100(var371 - 1, var371);
                                                    var371--;
                                                } else if (var371 < var372) {
                                                    var367.method3100(var371 + 1, var371);
                                                    var371++;
                                                }
                                            }
                                        } else {
                                            var367.method3100(field708, field572);
                                        }
                                        field499.method2322(138);
                                        field499.method2460(field572);
                                        field499.method2460(field708);
                                        field499.method2555(Statics.field1953.field2558);
                                        field499.method2470(var368);
                                    }
                                    field583 = 10;
                                    class76.field1373 = 0;
                                    Statics.field1953 = null;
                                }
                            }
                            class157 var376 = Statics.field78;
                            class157 var377 = Statics.field374;
                            Statics.field78 = null;
                            Statics.field374 = null;
                            field538 = null;
                            field651 = false;
                            field648 = false;
                            field483 = 0;
                            while (true) {
                                class74 var378 = class74.field1335;
                                boolean var379;
                                synchronized (class74.field1335) {
                                    if (class74.field1352 == class74.field1350) {
                                        var379 = false;
                                    } else {
                                        Statics.field249 = class74.field1349[class74.field1350];
                                        Statics.field266 = class74.field1331[class74.field1350];
                                        class74.field1350 = class74.field1350 + 1 & 0x7F;
                                        var379 = true;
                                    }
                                }
                                if (!var379 || field483 >= 128) {
                                    method2129(field535, 0, 0, 765, 503, 0, 0);
                                    field655++;
                                    while (true) {
                                        class1 var381;
                                        class157 var382;
                                        class157 var383;
                                        do {
                                            var381 = (class1) field670.method3325();
                                            if (var381 == null) {
                                                while (true) {
                                                    class1 var384;
                                                    class157 var385;
                                                    class157 var386;
                                                    do {
                                                        var384 = (class1) field671.method3325();
                                                        if (var384 == null) {
                                                            while (true) {
                                                                class1 var387;
                                                                class157 var388;
                                                                class157 var389;
                                                                do {
                                                                    var387 = (class1) field669.method3325();
                                                                    if (var387 == null) {
                                                                        if (field464 != null) {
                                                                            method120();
                                                                        }
                                                                        if (class94.field1530 != -1) {
                                                                            int var390 = class94.field1530;
                                                                            int var391 = class94.field1548;
                                                                            boolean var392 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var390, var391, true, 0, 0, 0, 0, 0, 0);
                                                                            class94.field1530 = -1;
                                                                            if (var392) {
                                                                                field642 = class76.field1374;
                                                                                field693 = class76.field1377;
                                                                                field470 = 1;
                                                                                field581 = 0;
                                                                            }
                                                                        }
                                                                        if (Statics.field1953 == null && field464 == null) {
                                                                            int var393 = class76.field1373;
                                                                            if (field628) {
                                                                                if (var393 != 1) {
                                                                                    int var394 = class76.field1367;
                                                                                    int var395 = class76.field1378;
                                                                                    if (var394 < Statics.field177 - 10 || var394 > Statics.field177 + Statics.field1279 + 10 || var395 < Statics.field1250 - 10 || var395 > Statics.field251 + Statics.field1250 + 10) {
                                                                                        field628 = false;
                                                                                        method1229(Statics.field177, Statics.field1250, Statics.field1279, Statics.field251);
                                                                                    }
                                                                                }
                                                                                if (var393 == 1) {
                                                                                    int var396 = Statics.field177;
                                                                                    int var397 = Statics.field1250;
                                                                                    int var398 = Statics.field1279;
                                                                                    int var399 = class76.field1374;
                                                                                    int var400 = class76.field1377;
                                                                                    int var401 = -1;
                                                                                    for (int var402 = 0; var402 < field615; var402++) {
                                                                                        int var403 = (field615 - 1 - var402) * 15 + var397 + 31;
                                                                                        if (var399 > var396 && var399 < var396 + var398 && var400 > var403 - 13 && var400 < var403 + 3) {
                                                                                            var401 = var402;
                                                                                        }
                                                                                    }
                                                                                    if (var401 != -1) {
                                                                                        method223(var401);
                                                                                    }
                                                                                    field628 = false;
                                                                                    method1229(Statics.field177, Statics.field1250, Statics.field1279, Statics.field251);
                                                                                }
                                                                            } else {
                                                                                label3219: {
                                                                                    int var405;
                                                                                    int var406;
                                                                                    label3245: {
                                                                                        if (var393 == 1 && field615 > 0) {
                                                                                            int var404 = field728[field615 - 1];
                                                                                            if (var404 == 39 || var404 == 40 || var404 == 41 || var404 == 42 || var404 == 43 || var404 == 33 || var404 == 34 || var404 == 35 || var404 == 36 || var404 == 37 || var404 == 38 || var404 == 1005) {
                                                                                                var405 = field616[field615 - 1];
                                                                                                var406 = field617[field615 - 1];
                                                                                                class157 var407 = class157.method2230(var406);
                                                                                                int var408 = method1599(var407);
                                                                                                boolean var409 = (var408 >> 28 & 0x1) != 0;
                                                                                                if (var409) {
                                                                                                    break label3245;
                                                                                                }
                                                                                                class161 var453 = (class161) null;
                                                                                                if (class161.method2923(method1599(var407))) {
                                                                                                    break label3245;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (var393 == 1) {
                                                                                            label3262: {
                                                                                                if (field599 != 1 || field615 <= 2) {
                                                                                                    int var410 = field615 - 1;
                                                                                                    boolean var411;
                                                                                                    if (var410 < 0) {
                                                                                                        var411 = false;
                                                                                                    } else {
                                                                                                        int var412 = field728[var410];
                                                                                                        if (var412 >= 2000) {
                                                                                                            var412 -= 2000;
                                                                                                        }
                                                                                                        if (var412 == 1007) {
                                                                                                            var411 = true;
                                                                                                        } else {
                                                                                                            var411 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var411) {
                                                                                                        break label3262;
                                                                                                    }
                                                                                                }
                                                                                                var393 = 2;
                                                                                            }
                                                                                        }
                                                                                        if (var393 == 1 && field615 > 0) {
                                                                                            method223(field615 - 1);
                                                                                        }
                                                                                        if (var393 == 2 && field615 > 0) {
                                                                                            method173();
                                                                                        }
                                                                                        break label3219;
                                                                                    }
                                                                                    field589 = false;
                                                                                    field541 = 0;
                                                                                    if (Statics.field1953 != null) {
                                                                                        method1523(Statics.field1953);
                                                                                    }
                                                                                    Statics.field1953 = class157.method2230(var406);
                                                                                    field572 = var405;
                                                                                    field586 = class76.field1374;
                                                                                    field587 = class76.field1377;
                                                                                    method1523(Statics.field1953);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (Statics.field78 != var376) {
                                                                            if (var376 != null) {
                                                                                method1523(var376);
                                                                            }
                                                                            if (Statics.field78 != null) {
                                                                                method1523(Statics.field78);
                                                                            }
                                                                        }
                                                                        if (Statics.field374 != var377 && field625 == field525) {
                                                                            if (var377 != null) {
                                                                                method1523(var377);
                                                                            }
                                                                            if (Statics.field374 != null) {
                                                                                method1523(Statics.field374);
                                                                            }
                                                                        }
                                                                        if (Statics.field374 == null) {
                                                                            if (field525 > 0) {
                                                                                field525--;
                                                                            }
                                                                        } else if (field525 < field625) {
                                                                            field525++;
                                                                            if (field625 == field525) {
                                                                                method1523(Statics.field374);
                                                                            }
                                                                        }
                                                                        int var413 = field539 + Statics.field1242.field433;
                                                                        int var414 = field634 + Statics.field1242.field407;
                                                                        if (Statics.field1312 - var413 < -500 || Statics.field1312 - var413 > 500 || Statics.field2811 - var414 < -500 || Statics.field2811 - var414 > 500) {
                                                                            Statics.field1312 = var413;
                                                                            Statics.field2811 = var414;
                                                                        }
                                                                        if (Statics.field1312 != var413) {
                                                                            Statics.field1312 += (var413 - Statics.field1312) / 16;
                                                                        }
                                                                        if (Statics.field2811 != var414) {
                                                                            Statics.field2811 += (var414 - Statics.field2811) / 16;
                                                                        }
                                                                        if (class74.field1356[96]) {
                                                                            field524 += (-24 - field524) / 2;
                                                                        } else if (class74.field1356[97]) {
                                                                            field524 += (24 - field524) / 2;
                                                                        } else {
                                                                            field524 /= 2;
                                                                        }
                                                                        if (class74.field1356[98]) {
                                                                            field561 += (12 - field561) / 2;
                                                                        } else if (class74.field1356[99]) {
                                                                            field561 += (-12 - field561) / 2;
                                                                        } else {
                                                                            field561 /= 2;
                                                                        }
                                                                        field559 = field524 / 2 + field559 & 0x7FF;
                                                                        field558 += field561 / 2;
                                                                        if (field558 < 128) {
                                                                            field558 = 128;
                                                                        }
                                                                        if (field558 > 383) {
                                                                            field558 = 383;
                                                                        }
                                                                        int var415 = Statics.field1312 >> 7;
                                                                        int var416 = Statics.field2811 >> 7;
                                                                        int var417 = method5(Statics.field1312, Statics.field2811, Statics.field2050);
                                                                        int var418 = 0;
                                                                        if (var415 > 3 && var416 > 3 && var415 < 100 && var416 < 100) {
                                                                            for (int var419 = var415 - 4; var419 <= var415 + 4; var419++) {
                                                                                for (int var420 = var416 - 4; var420 <= var416 + 4; var420++) {
                                                                                    int var421 = Statics.field2050;
                                                                                    if (var421 < 3 && (class9.field135[1][var419][var420] & 0x2) == 2) {
                                                                                        var421++;
                                                                                    }
                                                                                    int var422 = var417 - class9.field137[var421][var419][var420];
                                                                                    if (var422 > var418) {
                                                                                        var418 = var422;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        int var423 = var418 * 192;
                                                                        if (var423 > 98048) {
                                                                            var423 = 98048;
                                                                        }
                                                                        if (var423 < 32768) {
                                                                            var423 = 32768;
                                                                        }
                                                                        if (var423 > field548) {
                                                                            field548 += (var423 - field548) / 24;
                                                                        } else if (var423 < field548) {
                                                                            field548 += (var423 - field548) / 80;
                                                                        }
                                                                        if (field718) {
                                                                            int var424 = Statics.field1833 * 128 + 64;
                                                                            int var425 = Statics.field2809 * 128 + 64;
                                                                            int var426 = method5(var424, var425, Statics.field2050) - Statics.field361;
                                                                            if (Statics.field2346 < var424) {
                                                                                Statics.field2346 += Statics.field302 * (var424 - Statics.field2346) / 1000 + Statics.field901;
                                                                                if (Statics.field2346 > var424) {
                                                                                    Statics.field2346 = var424;
                                                                                }
                                                                            }
                                                                            if (Statics.field2346 > var424) {
                                                                                Statics.field2346 -= Statics.field302 * (Statics.field2346 - var424) / 1000 + Statics.field901;
                                                                                if (Statics.field2346 < var424) {
                                                                                    Statics.field2346 = var424;
                                                                                }
                                                                            }
                                                                            if (Statics.field2319 < var426) {
                                                                                Statics.field2319 += Statics.field302 * (var426 - Statics.field2319) / 1000 + Statics.field901;
                                                                                if (Statics.field2319 > var426) {
                                                                                    Statics.field2319 = var426;
                                                                                }
                                                                            }
                                                                            if (Statics.field2319 > var426) {
                                                                                Statics.field2319 -= Statics.field302 * (Statics.field2319 - var426) / 1000 + Statics.field901;
                                                                                if (Statics.field2319 < var426) {
                                                                                    Statics.field2319 = var426;
                                                                                }
                                                                            }
                                                                            if (Statics.field1359 < var425) {
                                                                                Statics.field1359 += Statics.field302 * (var425 - Statics.field1359) / 1000 + Statics.field901;
                                                                                if (Statics.field1359 > var425) {
                                                                                    Statics.field1359 = var425;
                                                                                }
                                                                            }
                                                                            if (Statics.field1359 > var425) {
                                                                                Statics.field1359 -= Statics.field302 * (Statics.field1359 - var425) / 1000 + Statics.field901;
                                                                                if (Statics.field1359 < var425) {
                                                                                    Statics.field1359 = var425;
                                                                                }
                                                                            }
                                                                            int var427 = Statics.field430 * 128 + 64;
                                                                            int var428 = Statics.field185 * 128 + 64;
                                                                            int var429 = method5(var427, var428, Statics.field2050) - Statics.field278;
                                                                            int var430 = var427 - Statics.field2346;
                                                                            int var431 = var429 - Statics.field2319;
                                                                            int var432 = var428 - Statics.field1359;
                                                                            int var433 = (int) Math.sqrt((double) (var430 * var430 + var432 * var432));
                                                                            int var434 = (int) (Math.atan2((double) var431, (double) var433) * 325.949D) & 0x7FF;
                                                                            int var435 = (int) (Math.atan2((double) var430, (double) var432) * -325.949D) & 0x7FF;
                                                                            if (var434 < 128) {
                                                                                var434 = 128;
                                                                            }
                                                                            if (var434 > 383) {
                                                                                var434 = 383;
                                                                            }
                                                                            if (Statics.field298 < var434) {
                                                                                Statics.field298 += Statics.field172 * (var434 - Statics.field298) / 1000 + Statics.field239;
                                                                                if (Statics.field298 > var434) {
                                                                                    Statics.field298 = var434;
                                                                                }
                                                                            }
                                                                            if (Statics.field298 > var434) {
                                                                                Statics.field298 -= Statics.field172 * (Statics.field298 - var434) / 1000 + Statics.field239;
                                                                                if (Statics.field298 < var434) {
                                                                                    Statics.field298 = var434;
                                                                                }
                                                                            }
                                                                            int var436 = var435 - Statics.field255;
                                                                            if (var436 > 1024) {
                                                                                var436 -= 2048;
                                                                            }
                                                                            if (var436 < -1024) {
                                                                                var436 += 2048;
                                                                            }
                                                                            if (var436 > 0) {
                                                                                Statics.field255 += Statics.field172 * var436 / 1000 + Statics.field239;
                                                                                Statics.field255 &= 0x7FF;
                                                                            }
                                                                            if (var436 < 0) {
                                                                                Statics.field255 -= Statics.field172 * -var436 / 1000 + Statics.field239;
                                                                                Statics.field255 &= 0x7FF;
                                                                            }
                                                                            int var437 = var435 - Statics.field255;
                                                                            if (var437 > 1024) {
                                                                                var437 -= 2048;
                                                                            }
                                                                            if (var437 < -1024) {
                                                                                var437 += 2048;
                                                                            }
                                                                            if (var437 < 0 && var436 > 0 || var437 > 0 && var436 < 0) {
                                                                                Statics.field255 = var435;
                                                                            }
                                                                        }
                                                                        for (int var438 = 0; var438 < 5; var438++) {
                                                                            int var10002 = field723[var438]++;
                                                                        }
                                                                        int var439 = ++class76.field1362 - 1;
                                                                        int var441 = class74.field1333;
                                                                        if (var439 > 15000 && var441 > 15000) {
                                                                            field518 = 250;
                                                                            class76.method2034(14500);
                                                                            field499.method2322(167);
                                                                        }
                                                                        field545++;
                                                                        if (field545 > 500) {
                                                                            field545 = 0;
                                                                            int var443 = (int) (Math.random() * 8.0D);
                                                                            if ((var443 & 0x1) == 1) {
                                                                                field539 += field653;
                                                                            }
                                                                            if ((var443 & 0x2) == 2) {
                                                                                field634 += field542;
                                                                            }
                                                                            if ((var443 & 0x4) == 4) {
                                                                                field543 += field544;
                                                                            }
                                                                        }
                                                                        if (field539 < -50) {
                                                                            field653 = 2;
                                                                        }
                                                                        if (field539 > 50) {
                                                                            field653 = -2;
                                                                        }
                                                                        if (field634 < -55) {
                                                                            field542 = 2;
                                                                        }
                                                                        if (field634 > 55) {
                                                                            field542 = -2;
                                                                        }
                                                                        if (field543 < -40) {
                                                                            field544 = 1;
                                                                        }
                                                                        if (field543 > 40) {
                                                                            field544 = -1;
                                                                        }
                                                                        field727++;
                                                                        if (field727 > 500) {
                                                                            field727 = 0;
                                                                            int var444 = (int) (Math.random() * 8.0D);
                                                                            if ((var444 & 0x1) == 1) {
                                                                                field664 += field547;
                                                                            }
                                                                            if ((var444 & 0x2) == 2) {
                                                                                field511 += field716;
                                                                            }
                                                                        }
                                                                        if (field664 < -60) {
                                                                            field547 = 2;
                                                                        }
                                                                        if (field664 > 60) {
                                                                            field547 = -2;
                                                                        }
                                                                        if (field511 < -20) {
                                                                            field716 = 1;
                                                                        }
                                                                        if (field511 > 10) {
                                                                            field716 = -1;
                                                                        }
                                                                        for (class27 var445 = (class27) field498.method3290(); var445 != null; var445 = (class27) field498.method3291()) {
                                                                            if ((long) var445.field736 < class120.method2609() / 1000L - 5L) {
                                                                                if (var445.field734 > 0) {
                                                                                    method208(5, "", var445.field735 + class133.field2203);
                                                                                }
                                                                                if (var445.field734 == 0) {
                                                                                    method208(5, "", var445.field735 + class133.field2180);
                                                                                }
                                                                                var445.method3356();
                                                                            }
                                                                        }
                                                                        field517++;
                                                                        if (field517 > 50) {
                                                                            field499.method2322(223);
                                                                        }
                                                                        try {
                                                                            if (Statics.field579 != null && field499.field2024 > 0) {
                                                                                Statics.field579.method1374(field499.field2022, 0, field499.field2024);
                                                                                field499.field2024 = 0;
                                                                                field517 = 0;
                                                                                return;
                                                                            }
                                                                        } catch (IOException var449) {
                                                                            if (field518 > 0) {
                                                                                method1392();
                                                                            } else {
                                                                                method138(40);
                                                                                Statics.field510 = Statics.field579;
                                                                                Statics.field579 = null;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    var388 = var387.field15;
                                                                    if (var388.field2568 < 0) {
                                                                        break;
                                                                    }
                                                                    var389 = class157.method2230(var388.field2578);
                                                                } while (var389 == null || var389.field2571 == null || var388.field2568 >= var389.field2571.length || var389.field2571[var388.field2568] != var388);
                                                                class25.method2220(var387);
                                                            }
                                                        }
                                                        var385 = var384.field15;
                                                        if (var385.field2568 < 0) {
                                                            break;
                                                        }
                                                        var386 = class157.method2230(var385.field2578);
                                                    } while (var386 == null || var386.field2571 == null || var385.field2568 >= var386.field2571.length || var386.field2571[var385.field2568] != var385);
                                                    class25.method2220(var384);
                                                }
                                            }
                                            var382 = var381.field15;
                                            if (var382.field2568 < 0) {
                                                break;
                                            }
                                            var383 = class157.method2230(var382.field2578);
                                        } while (var383 == null || var383.field2571 == null || var382.field2568 >= var383.field2571.length || var383.field2571[var382.field2568] != var382);
                                        class25.method2220(var381);
                                    }
                                }
                                field695[field483] = Statics.field249;
                                field694[field483] = Statics.field266;
                                field483++;
                            }
                        } else if (field518 > 0) {
                            method1392();
                        } else {
                            method138(40);
                            Statics.field510 = Statics.field579;
                            Statics.field579 = null;
                        }
                    }
                }
            }
        } else if (field475 == 40) {
            method66();
        }
    }

    @ObfuscatedName("client.j(I)V")
    public final void method324() {
        boolean var1;
        label150: {
            try {
                if (class137.field2324 == 2) {
                    if (Statics.field2328 == null) {
                        Statics.field2328 = class138.method2699(Statics.field2554, Statics.field2325, Statics.field2321);
                        if (Statics.field2328 == null) {
                            var1 = false;
                            break label150;
                        }
                    }
                    if (Statics.field737 == null) {
                        Statics.field737 = new class57(Statics.field2331, Statics.field2320);
                    }
                    if (Statics.field2323.method2720(Statics.field2328, Statics.field2330, Statics.field737, 22050)) {
                        Statics.field2323.method2719();
                        Statics.field2323.method2718(Statics.field2322);
                        Statics.field2323.method2724(Statics.field2328, Statics.field1263);
                        class137.field2324 = 0;
                        Statics.field2328 = null;
                        Statics.field737 = null;
                        Statics.field2554 = null;
                        var1 = true;
                        break label150;
                    }
                }
            } catch (Exception var25) {
                var25.printStackTrace();
                Statics.field2323.method2723();
                class137.field2324 = 0;
                Statics.field2328 = null;
                Statics.field737 = null;
                Statics.field2554 = null;
            }
            var1 = false;
        }
        if (var1 && field732 && Statics.field1286 != null) {
            Statics.field1286.method1139();
        }
        if (field1304) {
            class74.method1473(Statics.field2431);
            class76.method841(Statics.field2431);
            if (Statics.field1490 != null) {
                Statics.field1490.method1345(Statics.field2431);
            }
            this.method1438();
            class74.method164(Statics.field2431);
            class76.method151(Statics.field2431);
            if (Statics.field1490 != null) {
                Statics.field1490.method1344(Statics.field2431);
            }
        }
        if (field475 == 0) {
            int var4 = class20.field320;
            String var5 = class20.field317;
            Color var6 = null;
            try {
                Graphics var7 = Statics.field2431.getGraphics();
                if (Statics.field1793 == null) {
                    Statics.field1793 = new Font("Helvetica", 1, 13);
                    Statics.field85 = Statics.field2431.getFontMetrics(Statics.field1793);
                }
                if (field1319) {
                    field1319 = false;
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, Statics.field1294, Statics.field338);
                }
                if (var6 == null) {
                    var6 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field66 == null) {
                        Statics.field66 = Statics.field2431.createImage(304, 34);
                    }
                    Graphics var8 = Statics.field66.getGraphics();
                    var8.setColor(var6);
                    var8.drawRect(0, 0, 303, 33);
                    var8.fillRect(2, 2, var4 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(1, 1, 301, 31);
                    var8.fillRect(var4 * 3 + 2, 2, 300 - var4 * 3, 30);
                    var8.setFont(Statics.field1793);
                    var8.setColor(Color.white);
                    var8.drawString(var5, (304 - Statics.field85.stringWidth(var5)) / 2, 22);
                    var7.drawImage(Statics.field66, Statics.field1294 / 2 - 152, Statics.field338 / 2 - 18, (ImageObserver) null);
                } catch (Exception var21) {
                    int var10 = Statics.field1294 / 2 - 152;
                    int var11 = Statics.field338 / 2 - 18;
                    var7.setColor(var6);
                    var7.drawRect(var10, var11, 303, 33);
                    var7.fillRect(var10 + 2, var11 + 2, var4 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var7.fillRect(var4 * 3 + var10 + 2, var11 + 2, 300 - var4 * 3, 30);
                    var7.setFont(Statics.field1793);
                    var7.setColor(Color.white);
                    var7.drawString(var5, var10 + (304 - Statics.field85.stringWidth(var5)) / 2, var11 + 22);
                }
            } catch (Exception var22) {
                Statics.field2431.repaint();
            }
        } else if (field475 == 5) {
            class20.method2035(Statics.field106, Statics.field1278);
        } else if (field475 == 10) {
            class20.method2035(Statics.field106, Statics.field1278);
        } else if (field475 == 20) {
            class20.method2035(Statics.field106, Statics.field1278);
        } else if (field475 == 25) {
            if (field528 == 1) {
                if (field687 > field555) {
                    field555 = field687;
                }
                int var13 = (field555 * 50 - field687 * 50) / field555;
                method550(class133.field2072 + class2.field20 + class2.field29 + var13 + "%" + class2.field21, false);
            } else if (field528 == 2) {
                if (field526 > field527) {
                    field527 = field526;
                }
                int var14 = (field527 * 50 - field526 * 50) / field527 + 50;
                method550(class133.field2072 + class2.field20 + class2.field29 + var14 + "%" + class2.field21, false);
            } else {
                method550(class133.field2072, false);
            }
        } else if (field475 == 30) {
            method141();
        } else if (field475 == 40) {
            method550(class133.field2261 + class2.field20 + class133.field2074, false);
        }
        if (field475 == 30 && field532 == 0 && !field1319) {
            try {
                Graphics var15 = Statics.field2431.getGraphics();
                for (int var16 = 0; var16 < field673; var16++) {
                    if (field676[var16]) {
                        Statics.field1415.method1621(var15, field678[var16], field679[var16], field680[var16], field681[var16]);
                        field676[var16] = false;
                    }
                }
            } catch (Exception var24) {
                Statics.field2431.repaint();
            }
        } else if (field475 > 0) {
            try {
                Graphics var18 = Statics.field2431.getGraphics();
                Statics.field1415.method1603(var18, 0, 0);
                field1319 = false;
                for (int var19 = 0; var19 < field673; var19++) {
                    field676[var19] = false;
                }
            } catch (Exception var23) {
                Statics.field2431.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method253() {
        if (Statics.field1168 != null) {
            Statics.field1168.field248 = false;
        }
        Statics.field1168 = null;
        if (Statics.field579 != null) {
            Statics.field579.method1369();
            Statics.field579 = null;
        }
        class74.method2036();
        class76.method547();
        Statics.field1490 = null;
        if (Statics.field1286 != null) {
            Statics.field1286.method1148();
        }
        if (Statics.field226 != null) {
            Statics.field226.method1148();
        }
        class152.method1367();
        class156.method527();
        class81.method1488();
    }

    @ObfuscatedName("e.w(II)V")
    public static void method138(int arg0) {
        if (field475 == arg0) {
            return;
        }
        if (field475 == 0) {
            Statics.field66 = null;
            Statics.field1793 = null;
            Statics.field85 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field702 = 0;
            field502 = 0;
            field503 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field510 != null) {
            Statics.field510.method1369();
            Statics.field510 = null;
        }
        if (field475 == 25) {
            field528 = 0;
            field687 = 0;
            field555 = 1;
            field526 = 0;
            field527 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field2431;
            class153 var2 = Statics.field14;
            class153 var3 = Statics.field2013;
            if (!Statics.field325) {
                class88.method1788();
                byte[] var4 = var2.method2970("title.jpg", "");
                Statics.field2536 = new class85(var4, var1);
                Statics.field308 = Statics.field2536.method1675();
                Statics.field335 = class83.method1627(var3, "logo", "");
                Statics.field1904 = class83.method1627(var3, "titlebox", "");
                Statics.field327 = class83.method1627(var3, "titlebutton", "");
                Statics.field307 = class83.method1570(var3, "runes", "");
                Statics.field1320 = class83.method1570(var3, "title_mute", "");
                Statics.field57 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field57[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field57[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field57[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field57[var8 + 192] = 16777215;
                }
                Statics.field30 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field30[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field30[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field30[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field30[var12 + 192] = 16777215;
                }
                Statics.field313 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field313[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field313[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field313[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field313[var16 + 192] = 16777215;
                }
                Statics.field1791 = new int[256];
                Statics.field1796 = new int[32768];
                Statics.field1783 = new int[32768];
                class20.method2386((class86) null);
                Statics.field1798 = new int[32768];
                Statics.field1973 = new int[32768];
                class20.field314 = 0;
                class20.field322 = "";
                class20.field343 = "";
                class20.field330 = false;
                if (field602 == 0) {
                    class20.field310 = true;
                } else {
                    class20.field310 = false;
                }
                if (class20.field310) {
                    class137.field2324 = 1;
                    Statics.field2554 = null;
                    Statics.field2325 = -1;
                    Statics.field2321 = -1;
                    Statics.field2322 = 0;
                    Statics.field1263 = false;
                    Statics.field76 = 2;
                } else {
                    class153 var17 = Statics.field618;
                    int var18 = var17.method2980("scape main");
                    int var19 = var17.method3014(var18, "");
                    class137.field2324 = 1;
                    Statics.field2554 = var17;
                    Statics.field2325 = var18;
                    Statics.field2321 = var19;
                    Statics.field2322 = 255;
                    Statics.field1263 = false;
                    Statics.field76 = 2;
                }
                class152.method2712(false);
                Statics.field325 = true;
                Statics.field2536.method1684(0, 0);
                Statics.field308.method1684(382, 0);
                Statics.field335.method1777(382 - Statics.field335.field1456 / 2, 18);
            }
        } else {
            class20.method2426();
        }
        field475 = arg0;
    }

    @ObfuscatedName("client.z(I)V")
    public void method308() {
        if (field475 != 1000) {
            boolean var1 = class152.method45();
            if (!var1) {
                this.method255();
            }
        }
    }

    @ObfuscatedName("client.e(I)V")
    public void method255() {
        if (class152.field2520 >= 4) {
            this.method1465("js5crc");
            field475 = 1000;
            return;
        }
        if (class152.field2521 >= 4) {
            if (field475 <= 5) {
                this.method1465("js5io");
                field475 = 1000;
                return;
            }
            field496 = 3000;
            class152.field2521 = 3;
        }
        if (--field496 + 1 > 0) {
            return;
        }
        try {
            if (field494 == 0) {
                Statics.field87 = Statics.field108.method1482(Statics.field2019, Statics.field2302);
                field494++;
            }
            if (field494 == 1) {
                if (Statics.field87.field1386 == 2) {
                    this.method256(-1);
                    return;
                }
                if (Statics.field87.field1386 == 1) {
                    field494++;
                }
            }
            if (field494 == 2) {
                Statics.field2447 = new class69((Socket) Statics.field87.field1391, Statics.field108);
                class126 var1 = new class126(5);
                var1.method2554(15);
                var1.method2551(8);
                Statics.field2447.method1374(var1.field2022, 0, 5);
                field494++;
                Statics.field1261 = class120.method2609();
            }
            if (field494 == 3) {
                if (field475 <= 5 || Statics.field2447.method1387() > 0) {
                    int var2 = Statics.field2447.method1371();
                    if (var2 != 0) {
                        this.method256(var2);
                        return;
                    }
                    field494++;
                } else if (class120.method2609() - Statics.field1261 > 30000L) {
                    this.method256(-2);
                    return;
                }
            }
            if (field494 == 4) {
                class69 var3 = Statics.field2447;
                boolean var4 = field475 > 20;
                if (Statics.field2519 != null) {
                    try {
                        Statics.field2519.method1369();
                    } catch (Exception var14) {
                    }
                    Statics.field2519 = null;
                }
                Statics.field2519 = var3;
                class152.method2712(var4);
                class152.field2515.field2024 = 0;
                Statics.field1905 = null;
                Statics.field2326 = null;
                class152.field2504 = 0;
                while (true) {
                    class154 var6 = (class154) class152.field2505.method3308();
                    if (var6 == null) {
                        while (true) {
                            class154 var7 = (class154) class152.field2513.method3308();
                            if (var7 == null) {
                                if (class152.field2514 != 0) {
                                    try {
                                        class126 var8 = new class126(4);
                                        var8.method2554(4);
                                        var8.method2554(class152.field2514);
                                        var8.method2435(0);
                                        Statics.field2519.method1374(var8.field2022, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2519.method1369();
                                        } catch (Exception var12) {
                                        }
                                        class152.field2521++;
                                        Statics.field2519 = null;
                                    }
                                }
                                class152.field2512 = 0;
                                Statics.field2508 = class120.method2609();
                                Statics.field87 = null;
                                Statics.field2447 = null;
                                field494 = 0;
                                field500 = 0;
                                return;
                            }
                            class152.field2510.method3272(var7);
                            class152.field2511.method3317(var7, var7.field2808);
                            class152.field2518++;
                            class152.field2503--;
                        }
                    }
                    class152.field2506.method3317(var6, var6.field2808);
                    class152.field2507++;
                    class152.field2509--;
                }
            }
        } catch (IOException var15) {
            this.method256(-3);
        }
    }

    @ObfuscatedName("client.b(IB)V")
    public void method256(int arg0) {
        Statics.field87 = null;
        Statics.field2447 = null;
        field494 = 0;
        if (Statics.field2302 == Statics.field119) {
            Statics.field2302 = Statics.field253;
        } else {
            Statics.field2302 = Statics.field119;
        }
        field500++;
        if (field500 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field475 <= 5) {
                this.method1465("js5connect_full");
                field475 = 1000;
            } else {
                field496 = 3000;
            }
        } else if (field500 >= 2 && arg0 == 6) {
            this.method1465("js5connect_outofdate");
            field475 = 1000;
        } else if (field500 >= 4) {
            if (field475 <= 5) {
                this.method1465("js5connect");
                field475 = 1000;
            } else {
                field496 = 3000;
            }
        }
    }

    @ObfuscatedName("w.c(B)V")
    public static void method125() {
        if (field580 == 0) {
            Statics.field529 = new class94(4, 104, 104, class9.field137);
            for (int var0 = 0; var0 < 4; var0++) {
                field530[var0] = new class163(104, 104);
            }
            Statics.field56 = new class85(512, 512);
            class20.field317 = class133.field2075;
            class20.field320 = 5;
            field580 = 20;
        } else if (field580 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class103.field1761[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class94.method1891(var1, 500, 800, 512, 334);
            class20.field317 = class133.field2076;
            class20.field320 = 10;
            field580 = 30;
        } else if (field580 == 30) {
            Statics.field959 = method37(0, false, true, true);
            Statics.field2032 = method37(1, false, true, true);
            Statics.field337 = method37(2, true, false, true);
            Statics.field1997 = method37(3, false, true, true);
            Statics.field690 = method37(4, false, true, true);
            Statics.field549 = method37(5, true, true, true);
            Statics.field618 = method37(6, true, true, false);
            Statics.field1423 = method37(7, false, true, true);
            Statics.field2013 = method37(8, false, true, true);
            Statics.field399 = method37(9, false, true, true);
            Statics.field14 = method37(10, false, true, true);
            Statics.field1647 = method37(11, false, true, true);
            Statics.field1803 = method37(12, false, true, true);
            Statics.field1404 = method37(13, true, false, true);
            Statics.field2540 = method37(14, false, true, false);
            Statics.field28 = method37(15, false, true, true);
            class20.field317 = class133.field2077;
            class20.field320 = 20;
            field580 = 40;
        } else if (field580 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field959.method3076() * 4 / 100;
            int var8 = var7 + Statics.field2032.method3076() * 4 / 100;
            int var9 = var8 + Statics.field337.method3076() * 2 / 100;
            int var10 = var9 + Statics.field1997.method3076() * 2 / 100;
            int var11 = var10 + Statics.field690.method3076() * 6 / 100;
            int var12 = var11 + Statics.field549.method3076() * 4 / 100;
            int var13 = var12 + Statics.field618.method3076() * 2 / 100;
            int var14 = var13 + Statics.field1423.method3076() * 60 / 100;
            int var15 = var14 + Statics.field2013.method3076() * 2 / 100;
            int var16 = var15 + Statics.field399.method3076() * 2 / 100;
            int var17 = var16 + Statics.field14.method3076() * 2 / 100;
            int var18 = var17 + Statics.field1647.method3076() * 2 / 100;
            int var19 = var18 + Statics.field1803.method3076() * 2 / 100;
            int var20 = var19 + Statics.field1404.method3076() * 2 / 100;
            int var21 = var20 + Statics.field2540.method3076() * 2 / 100;
            int var22 = var21 + Statics.field28.method3076() * 2 / 100;
            if (var22 == 100) {
                class20.field317 = class133.field2079;
                class20.field320 = 30;
                field580 = 45;
            } else {
                if (var22 != 0) {
                    class20.field317 = class133.field2078 + var22 + "%";
                }
                class20.field320 = 30;
            }
        } else if (field580 == 45) {
            boolean var23 = !field472;
            Statics.field1083 = 22050;
            Statics.field1091 = var23;
            Statics.field1102 = 2;
            class140 var24 = new class140();
            var24.method2725(9, 128);
            Statics.field1286 = class51.method1629(Statics.field108, Statics.field2431, 0, 22050);
            Statics.field1286.method1136(var24);
            class153 var25 = Statics.field28;
            class153 var26 = Statics.field2540;
            class153 var27 = Statics.field690;
            Statics.field2330 = var25;
            Statics.field2320 = var26;
            Statics.field2331 = var27;
            Statics.field2323 = var24;
            Statics.field226 = class51.method1629(Statics.field108, Statics.field2431, 1, 2048);
            Statics.field778 = new class45();
            Statics.field226.method1136(Statics.field778);
            Statics.field1260 = new class61(22050, Statics.field1083);
            class20.field317 = class133.field2080;
            class20.field320 = 35;
            field580 = 50;
        } else if (field580 == 50) {
            int var28 = 0;
            if (Statics.field1278 == null) {
                Statics.field1278 = class83.method1360(Statics.field2013, Statics.field1404, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field218 == null) {
                Statics.field218 = class83.method1360(Statics.field2013, Statics.field1404, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field106 == null) {
                Statics.field106 = class83.method1360(Statics.field2013, Statics.field1404, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class20.field317 = class133.field2157 + var28 * 100 / 3 + "%";
                class20.field320 = 40;
            } else {
                Statics.field1779 = new class150(true);
                class20.field317 = class133.field2082;
                class20.field320 = 40;
                field580 = 60;
            }
        } else if (field580 == 60) {
            int var29 = class20.method10(Statics.field14, Statics.field2013);
            byte var30 = 6;
            if (var29 < var30) {
                class20.field317 = class133.field2207 + var29 * 100 / var30 + "%";
                class20.field320 = 50;
            } else {
                class20.field317 = class133.field2084;
                class20.field320 = 50;
                method138(5);
                field580 = 70;
            }
        } else if (field580 == 70) {
            if (Statics.field337.method2969()) {
                class153 var32 = Statics.field337;
                Statics.field1262 = var32;
                class153 var33 = Statics.field337;
                Statics.field867 = var33;
                class35.method526(Statics.field337, Statics.field1423);
                class153 var34 = Statics.field337;
                class153 var35 = Statics.field1423;
                boolean var36 = field472;
                Statics.field809 = var34;
                Statics.field849 = var35;
                class31.field845 = var36;
                class30.method1851(Statics.field337, Statics.field1423);
                class39.method797(Statics.field337, Statics.field1423, field471, Statics.field1278);
                class153 var37 = Statics.field337;
                class153 var38 = Statics.field959;
                class153 var39 = Statics.field2032;
                Statics.field883 = var37;
                Statics.field2826 = var38;
                Statics.field872 = var39;
                class34.method2949(Statics.field337, Statics.field1423);
                class37.method524(Statics.field337);
                class153 var40 = Statics.field337;
                Statics.field1033 = var40;
                Statics.field1026 = Statics.field1033.method2975(16);
                class157.method2673(Statics.field1997, Statics.field1423, Statics.field2013, Statics.field1404);
                class153 var41 = Statics.field337;
                Statics.field1015 = var41;
                class38.method1366(Statics.field337);
                class20.field317 = class133.field2086;
                class20.field320 = 60;
                field580 = 80;
            } else {
                class20.field317 = class133.field2085 + Statics.field337.method3069() + "%";
                class20.field320 = 60;
            }
        } else if (field580 == 80) {
            int var42 = 0;
            if (Statics.field1379 == null) {
                class153 var43 = Statics.field2013;
                int var44 = var43.method2980("compass");
                int var45 = var43.method3014(var44, "");
                class85 var46 = class83.method140(var43, var44, var45);
                Statics.field1379 = var46;
            } else {
                var42++;
            }
            if (Statics.field746 == null) {
                class153 var47 = Statics.field2013;
                int var48 = var47.method2980("mapedge");
                int var49 = var47.method3014(var48, "");
                class85 var50 = class83.method140(var47, var48, var49);
                Statics.field746 = var50;
            } else {
                var42++;
            }
            if (Statics.field247 == null) {
                Statics.field247 = class83.method1570(Statics.field2013, "mapscene", "");
            } else {
                var42++;
            }
            if (Statics.field1283 == null) {
                Statics.field1283 = class83.method114(Statics.field2013, "mapfunction", "");
            } else {
                var42++;
            }
            if (Statics.field283 == null) {
                Statics.field283 = class83.method114(Statics.field2013, "hitmarks", "");
            } else {
                var42++;
            }
            if (Statics.field1993 == null) {
                Statics.field1993 = class83.method114(Statics.field2013, "headicons_pk", "");
            } else {
                var42++;
            }
            if (Statics.field1193 == null) {
                Statics.field1193 = class83.method114(Statics.field2013, "headicons_prayer", "");
            } else {
                var42++;
            }
            if (Statics.field1293 == null) {
                Statics.field1293 = class83.method114(Statics.field2013, "headicons_hint", "");
            } else {
                var42++;
            }
            if (Statics.field142 == null) {
                Statics.field142 = class83.method114(Statics.field2013, "mapmarker", "");
            } else {
                var42++;
            }
            if (Statics.field1253 == null) {
                Statics.field1253 = class83.method114(Statics.field2013, "cross", "");
            } else {
                var42++;
            }
            if (Statics.field356 == null) {
                Statics.field356 = class83.method114(Statics.field2013, "mapdots", "");
            } else {
                var42++;
            }
            if (Statics.field1254 == null) {
                Statics.field1254 = class83.method1570(Statics.field2013, "scrollbar", "");
            } else {
                var42++;
            }
            if (Statics.field909 == null) {
                Statics.field909 = class83.method1570(Statics.field2013, "mod_icons", "");
            } else {
                var42++;
            }
            if (Statics.field1523 == null) {
                Statics.field1523 = class83.method1627(Statics.field2013, "mapback", "");
            } else {
                var42++;
            }
            if (var42 < 14) {
                class20.field317 = class133.field2188 + var42 * 100 / 14 + "%";
                class20.field320 = 70;
            } else {
                Statics.field2837 = Statics.field909;
                Statics.field746.method1678();
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 41.0D) - 20;
                for (int var55 = 0; var55 < Statics.field1283.length; var55++) {
                    Statics.field1283[var55].method1677(var51 + var54, var52 + var54, var53 + var54);
                }
                Statics.field247[0].method1785(var51 + var54, var52 + var54, var53 + var54);
                Statics.field1959 = new int[33];
                Statics.field321 = new int[33];
                Statics.field215 = new int[151];
                Statics.field109 = new int[151];
                for (int var56 = 0; var56 < 33; var56++) {
                    int var57 = 999;
                    int var58 = 0;
                    for (int var59 = 0; var59 < 34; var59++) {
                        if (Statics.field1523.field1455[Statics.field1523.field1456 * var56 + var59] == 0) {
                            if (var57 == 999) {
                                var57 = var59;
                            }
                        } else if (var57 != 999) {
                            var58 = var59;
                            break;
                        }
                    }
                    Statics.field1959[var56] = var57;
                    Statics.field321[var56] = var58 - var57;
                }
                for (int var60 = 5; var60 < 156; var60++) {
                    int var61 = 999;
                    int var62 = 0;
                    for (int var63 = 25; var63 < 172; var63++) {
                        if (Statics.field1523.field1455[Statics.field1523.field1456 * var60 + var63] == 0 && var63 > 34 || var60 > 34) {
                            if (var61 == 999) {
                                var61 = var63;
                            }
                        } else if (var61 != 999) {
                            var62 = var63;
                            break;
                        }
                    }
                    Statics.field215[var60 - 5] = var61 - 25;
                    Statics.field109[var60 - 5] = var62 - var61;
                }
                class20.field317 = class133.field2171;
                class20.field320 = 70;
                field580 = 90;
            }
        } else if (field580 == 90) {
            if (Statics.field399.method2969()) {
                class109 var64 = new class109(Statics.field399, Statics.field2013, 20, 0.8D, field472 ? 64 : 128);
                class103.method2136(var64);
                class103.method2192(0.8D);
                class20.field317 = class133.field2090;
                class20.field320 = 90;
                field580 = 110;
            } else {
                class20.field317 = class133.field2089 + Statics.field399.method3069() + "%";
                class20.field320 = 90;
            }
        } else if (field580 == 110) {
            Statics.field1168 = new class15();
            Statics.field108.method1483(Statics.field1168, 10);
            class20.field317 = class133.field2091;
            class20.field320 = 94;
            field580 = 120;
        } else if (field580 == 120) {
            if (Statics.field14.method3011("huffman", "")) {
                class119 var65 = new class119(Statics.field14.method2970("huffman", ""));
                Statics.field2827 = var65;
                class20.field317 = class133.field2093;
                class20.field320 = 96;
                field580 = 130;
            } else {
                class20.field317 = class133.field2257 + "%";
                class20.field320 = 96;
            }
        } else if (field580 == 130) {
            if (!Statics.field1997.method2969()) {
                class20.field317 = class133.field2228 + Statics.field1997.method3069() * 4 / 5 + "%";
                class20.field320 = 100;
            } else if (!Statics.field1803.method2969()) {
                class20.field317 = class133.field2228 + (80 + Statics.field1803.method3069() / 6) + "%";
                class20.field320 = 100;
            } else if (Statics.field1404.method2969()) {
                class20.field317 = class133.field2095;
                class20.field320 = 100;
                field580 = 140;
            } else {
                class20.field317 = class133.field2228 + (96 + Statics.field1404.method3069() / 20) + "%";
                class20.field320 = 100;
            }
        } else if (field580 == 140) {
            method138(10);
        }
    }

    @ObfuscatedName("n.d(IZZZB)Lef;")
    public static class153 method37(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class70 var4 = null;
        if (class81.field1410 != null) {
            var4 = new class70(arg0, class81.field1410, Statics.field2770[arg0], 1000000);
        }
        return new class153(var4, Statics.field304, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("g.h(I)V")
    public static final void method66() {
        try {
            if (field702 == 0) {
                if (Statics.field579 != null) {
                    Statics.field579.method1369();
                    Statics.field579 = null;
                }
                Statics.field379 = null;
                field522 = false;
                field502 = 0;
                field702 = 1;
            }
            if (field702 == 1) {
                if (Statics.field379 == null) {
                    Statics.field379 = Statics.field108.method1482(Statics.field2019, Statics.field2302);
                }
                if (Statics.field379.field1386 == 2) {
                    throw new IOException();
                }
                if (Statics.field379.field1386 == 1) {
                    Statics.field579 = new class69((Socket) Statics.field379.field1391, Statics.field108);
                    Statics.field379 = null;
                    field702 = 2;
                }
            }
            if (field702 == 2) {
                field499.field2024 = 0;
                field499.method2554(14);
                Statics.field579.method1374(field499.field2022, 0, 1);
                field513.field2024 = 0;
                field702 = 3;
            }
            if (field702 == 3) {
                if (Statics.field1286 != null) {
                    Statics.field1286.method1138();
                }
                if (Statics.field226 != null) {
                    Statics.field226.method1138();
                }
                int var0 = Statics.field579.method1371();
                if (Statics.field1286 != null) {
                    Statics.field1286.method1138();
                }
                if (Statics.field226 != null) {
                    Statics.field226.method1138();
                }
                if (var0 != 0) {
                    method869(var0);
                    return;
                }
                field513.field2024 = 0;
                field702 = 5;
            }
            if (field702 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field499.field2024 = 0;
                field499.method2554(10);
                field499.method2551(var1[0]);
                field499.method2551(var1[1]);
                field499.method2551(var1[2]);
                field499.method2551(var1[3]);
                field499.method2438(0L);
                field499.method2439(class20.field343);
                field499.method2560(class6.field84, class6.field83);
                field512.field2024 = 0;
                if (field475 == 40) {
                    field512.method2554(18);
                } else {
                    field512.method2554(16);
                }
                field512.method2435(0);
                int var2 = field512.field2024;
                field512.method2551(8);
                field512.method2442(field499.field2022, 0, field499.field2024);
                int var3 = field512.field2024;
                field512.method2439(class20.field322);
                field512.method2554(field472 ? 1 : 0);
                class81.method574(field512);
                class126 var4 = new class126(Statics.field1779.method2956());
                Statics.field1779.method2959(var4);
                field512.method2442(var4.field2022, 0, var4.field2022.length);
                field512.method2551(Statics.field959.field2498);
                field512.method2551(Statics.field2032.field2498);
                field512.method2551(Statics.field337.field2498);
                field512.method2551(Statics.field1997.field2498);
                field512.method2551(Statics.field690.field2498);
                field512.method2551(Statics.field549.field2498);
                field512.method2551(Statics.field618.field2498);
                field512.method2551(Statics.field1423.field2498);
                field512.method2551(Statics.field2013.field2498);
                field512.method2551(Statics.field399.field2498);
                field512.method2551(Statics.field14.field2498);
                field512.method2551(Statics.field1647.field2498);
                field512.method2551(Statics.field1803.field2498);
                field512.method2551(Statics.field1404.field2498);
                field512.method2551(Statics.field2540.field2498);
                field512.method2551(Statics.field28.field2498);
                field512.method2547(var1, var3, field512.field2024);
                field512.method2444(field512.field2024 - var2);
                Statics.field579.method1374(field512.field2022, 0, field512.field2024);
                field499.method2316(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field513.method2316(var1);
                field702 = 6;
            }
            if (field702 == 6 && Statics.field579.method1387() > 0) {
                int var6 = Statics.field579.method1371();
                if (var6 == 21 && field475 == 20) {
                    field702 = 7;
                } else if (var6 == 2) {
                    field702 = 9;
                } else if (var6 == 15 && field475 == 40) {
                    field499.field2024 = 0;
                    field513.field2024 = 0;
                    field515 = -1;
                    field519 = -1;
                    field614 = -1;
                    field521 = -1;
                    field514 = 0;
                    field516 = 0;
                    field582 = 0;
                    field615 = 0;
                    field628 = false;
                    field706 = 0;
                    field704 = 0;
                    for (int var7 = 0; var7 < field592.length; var7++) {
                        if (field592[var7] != null) {
                            field592[var7].field429 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field584.length; var8++) {
                        if (field584[var8] != null) {
                            field584[var8].field429 = -1;
                        }
                    }
                    class18.method41();
                    method138(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field675[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field503 < 1) {
                    field503++;
                    field702 = 0;
                } else {
                    method869(var6);
                    return;
                }
            }
            if (field702 == 7 && Statics.field579.method1387() > 0) {
                field504 = (Statics.field579.method1371() + 3) * 60;
                field702 = 8;
            }
            if (field702 == 8) {
                field502 = 0;
                class20.method44(class133.field2096, class133.field2258, field504 / 60 + class133.field2098);
                if (--field504 <= 0) {
                    field702 = 0;
                }
            } else {
                if (field702 == 9 && Statics.field579.method1387() >= 8) {
                    field682 = Statics.field579.method1371();
                    field640 = Statics.field579.method1371() == 1;
                    field635 = Statics.field579.method1371();
                    field635 <<= 0x8;
                    field635 += Statics.field579.method1371();
                    field531 = Statics.field579.method1371();
                    Statics.field579.method1373(field513.field2022, 0, 1);
                    field513.field2024 = 0;
                    field515 = field513.method2335();
                    Statics.field579.method1373(field513.field2022, 0, 2);
                    field513.field2024 = 0;
                    field514 = field513.method2450();
                    if (field531 == 1) {
                        try {
                            class66.method1364(Statics.field598, "zap");
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class66.method1364(Statics.field598, "unzap");
                        } catch (Throwable var13) {
                        }
                    }
                    field702 = 10;
                }
                if (field702 != 10) {
                    field502++;
                    if (field502 > 2000) {
                        if (field503 < 1) {
                            if (Statics.field2302 == Statics.field119) {
                                Statics.field2302 = Statics.field253;
                            } else {
                                Statics.field2302 = Statics.field119;
                            }
                            field503++;
                            field702 = 0;
                        } else {
                            method869(-3);
                        }
                    }
                } else if (Statics.field579.method1387() >= field514) {
                    field513.field2024 = 0;
                    Statics.field579.method1373(field513.field2022, 0, field514);
                    method2();
                    Statics.field917 = -1;
                    method6(false);
                    field515 = -1;
                }
            }
        } catch (IOException var15) {
            if (field503 < 1) {
                if (Statics.field2302 == Statics.field119) {
                    Statics.field2302 = Statics.field253;
                } else {
                    Statics.field2302 = Statics.field119;
                }
                field503++;
                field702 = 0;
            } else {
                method869(-2);
            }
        }
    }

    @ObfuscatedName("u.i(B)V")
    public static void method2() {
        field478 = -1L;
        field481 = -1;
        Statics.field1168.field250 = 0;
        Statics.field1021 = true;
        field482 = true;
        field696 = -1L;
        class181.field2823 = new class176();
        field499.field2024 = 0;
        field513.field2024 = 0;
        field515 = -1;
        field519 = -1;
        field614 = -1;
        field521 = -1;
        field516 = 0;
        field582 = 0;
        field518 = 0;
        field508 = 0;
        field615 = 0;
        field628 = false;
        class76.method2034(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field686[var0] = null;
        }
        field474 = 0;
        field626 = 0;
        field632 = false;
        field712 = 0;
        field539 = (int) (Math.random() * 100.0D) - 50;
        field634 = (int) (Math.random() * 110.0D) - 55;
        field543 = (int) (Math.random() * 80.0D) - 40;
        field664 = (int) (Math.random() * 120.0D) - 60;
        field511 = (int) (Math.random() * 30.0D) - 20;
        field559 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field706 = 0;
        field692 = -1;
        field704 = 0;
        field705 = 0;
        field593 = 0;
        field465 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field592[var1] = null;
            field597[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field584[var2] = null;
        }
        Statics.field1242 = field592[2047] = new class3();
        field608.method3322();
        field667.method3322();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field590[var3][var4][var5] = null;
                }
            }
        }
        field662 = new class176();
        field492 = 0;
        field724 = 0;
        for (int var6 = 0; var6 < Statics.field1026; var6++) {
            class41 var7 = class41.method2682(var6);
            if (var7 != null && var7.field1028 == 0) {
                class158.field2686[var6] = 0;
                class158.field2687[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field701.length; var8++) {
            field701[var8] = -1;
        }
        if (field535 != -1) {
            int var9 = field535;
            if (var9 != -1 && Statics.field1330[var9]) {
                Statics.field2643.method2977(var9);
                if (Statics.field2580[var9] != null) {
                    boolean var10 = true;
                    for (int var11 = 0; var11 < Statics.field2580[var9].length; var11++) {
                        if (Statics.field2580[var9][var11] != null) {
                            if (Statics.field2580[var9][var11].field2620 == 2) {
                                var10 = false;
                            } else {
                                Statics.field2580[var9][var11] = null;
                            }
                        }
                    }
                    if (var10) {
                        Statics.field2580[var9] = null;
                    }
                    Statics.field1330[var9] = false;
                }
            }
        }
        for (class4 var12 = (class4) field567.method3308(); var12 != null; var12 = (class4) field567.method3309()) {
            method2212(var12, true);
        }
        field535 = -1;
        field567 = new class174(8);
        field607 = null;
        field628 = false;
        field615 = 0;
        field730.method3184((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var13 = 0; var13 < 8; var13++) {
            field603[var13] = null;
            field604[var13] = false;
        }
        class18.method41();
        field476 = true;
        for (int var14 = 0; var14 < 100; var14++) {
            field675[var14] = true;
        }
        field697 = null;
        Statics.field1195 = 0;
        Statics.field1421 = null;
    }

    @ObfuscatedName("ag.v(IB)V")
    public static void method869(int arg0) {
        if (arg0 == -3) {
            class20.method44(class133.field2099, class133.field2097, class133.field2101);
        } else if (arg0 == -2) {
            class20.method44(class133.field2102, class133.field2103, class133.field2104);
        } else if (arg0 == -1) {
            class20.method44(class133.field2105, class133.field2106, class133.field2107);
        } else if (arg0 == 3) {
            class20.method44(class133.field2108, class133.field2109, class133.field2110);
        } else if (arg0 == 4) {
            class20.method44(class133.field2111, class133.field2112, class133.field2113);
        } else if (arg0 == 5) {
            class20.method44(class133.field2266, class133.field2115, class133.field2286);
        } else if (arg0 == 6) {
            class20.method44(class133.field2117, class133.field2118, class133.field2205);
        } else if (arg0 == 7) {
            class20.method44(class133.field2120, class133.field2114, class133.field2191);
        } else if (arg0 == 8) {
            class20.method44(class133.field2198, class133.field2124, class133.field2125);
        } else if (arg0 == 9) {
            class20.method44(class133.field2126, class133.field2127, class133.field2287);
        } else if (arg0 == 10) {
            class20.method44(class133.field2256, class133.field2130, class133.field2131);
        } else if (arg0 == 11) {
            class20.method44(class133.field2285, class133.field2133, class133.field2134);
        } else if (arg0 == 12) {
            class20.method44(class133.field2135, class133.field2136, class133.field2137);
        } else if (arg0 == 13) {
            class20.method44(class133.field2156, class133.field2165, class133.field2140);
        } else if (arg0 == 14) {
            class20.method44(class133.field2141, class133.field2260, class133.field2143);
        } else if (arg0 == 16) {
            class20.method44(class133.field2144, class133.field2073, class133.field2146);
        } else if (arg0 == 17) {
            class20.method44(class133.field2121, class133.field2148, class133.field2149);
        } else if (arg0 == 18) {
            class20.method44(class133.field2150, class133.field2151, class133.field2201);
        } else if (arg0 == 19) {
            class20.method44(class133.field2153, class133.field2190, class133.field2155);
        } else if (arg0 == 20) {
            class20.method44(class133.field2242, class133.field2247, class133.field2068);
        } else if (arg0 == 22) {
            class20.method44(class133.field2159, class133.field2160, class133.field2236);
        } else if (arg0 == 23) {
            class20.method44(class133.field2162, class133.field2164, class133.field2088);
        } else if (arg0 == 24) {
            class20.method44(class133.field2251, class133.field2166, class133.field2145);
        } else if (arg0 == 25) {
            class20.method44(class133.field2233, class133.field2169, class133.field2170);
        } else if (arg0 == 26) {
            class20.method44(class133.field2161, class133.field2262, class133.field2158);
        } else if (arg0 == 27) {
            class20.method44(class133.field2174, class133.field2175, class133.field2176);
        } else if (arg0 == 31) {
            class20.method44(class133.field2208, class133.field2184, class133.field2185);
        } else if (arg0 == 32) {
            class20.method44(class133.field2186, class133.field2187, class133.field2276);
        } else if (arg0 == 37) {
            class20.method44(class133.field2189, class133.field2119, class133.field2123);
        } else if (arg0 == 38) {
            class20.method44(class133.field2192, class133.field2142, class133.field2288);
        } else if (arg0 == 55) {
            class20.method44(class133.field2195, class133.field2178, class133.field2197);
        } else {
            class20.method44(class133.field2168, class133.field2199, class133.field2194);
        }
        method138(10);
    }

    @ObfuscatedName("bf.s(B)V")
    public static final void method1392() {
        if (Statics.field579 != null) {
            Statics.field579.method1369();
            Statics.field579 = null;
        }
        method718();
        Statics.field529.method1857();
        for (int var0 = 0; var0 < 4; var0++) {
            field530[var0].method3209();
        }
        System.gc();
        class137.field2324 = 1;
        Statics.field2554 = null;
        Statics.field2325 = -1;
        Statics.field2321 = -1;
        Statics.field2322 = 0;
        Statics.field1263 = false;
        Statics.field76 = 2;
        field699 = -1;
        field732 = false;
        class7.method2884();
        method138(10);
    }

    @ObfuscatedName("ai.f(B)V")
    public static final void method718() {
        class36.field927.method3261();
        class32.method209();
        class35.method14();
        class31.field842.method3261();
        class31.field812.method3261();
        class31.field813.method3261();
        class31.field814.method3261();
        class30.method782();
        class39.field964.method3261();
        class39.field1002.method3261();
        class39.field962.method3261();
        class33.field874.method3261();
        class33.field875.method3261();
        class34.method1365();
        class37.method606();
        class41.field1027.method3261();
        class162.method150();
        class157.field2562.method3261();
        class157.field2634.method3261();
        class157.field2564.method3261();
        ((class109) Statics.field1758).method2225();
        class5.field73.method3261();
        Statics.field959.method2978();
        Statics.field2032.method2978();
        Statics.field1997.method2978();
        Statics.field690.method2978();
        Statics.field549.method2978();
        Statics.field618.method2978();
        Statics.field1423.method2978();
        Statics.field2013.method2978();
        Statics.field399.method2978();
        Statics.field14.method2978();
        Statics.field1647.method2978();
        Statics.field1803.method2978();
    }

    @ObfuscatedName("v.y(I)V")
    public static final void method168() {
        if (Statics.field226 != null) {
            Statics.field226.method1137();
        }
        if (Statics.field1286 != null) {
            Statics.field1286.method1137();
        }
    }

    @ObfuscatedName("o.t(B)V")
    public static final void method244() {
        for (int var0 = 0; var0 < field712; var0++) {
            int var10002 = field715[var0]--;
            if (field715[var0] >= -10) {
                class56 var2 = field717[var0];
                if (var2 == null) {
                    class56 var10000 = (class56) null;
                    var2 = class56.method1248(Statics.field690, field713[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field715[var0] += var2.method1260();
                    field717[var0] = var2;
                }
                if (field715[var0] < 0) {
                    int var9;
                    if (field557[var0] == 0) {
                        var9 = field710;
                    } else {
                        int var3 = (field557[var0] & 0xFF) * 128;
                        int var4 = field557[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1242.field433;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field557[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1242.field407;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field715[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field711 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class62 var10 = var2.method1256().method1311(Statics.field1260);
                        class44 var11 = class44.method945(var10, 100, var9);
                        var11.method948(field674[var0] - 1);
                        Statics.field778.method1095(var11);
                    }
                    field715[var0] = -100;
                }
            } else {
                field712--;
                for (int var1 = var0; var1 < field712; var1++) {
                    field713[var1] = field713[var1 + 1];
                    field717[var1] = field717[var1 + 1];
                    field674[var1] = field674[var1 + 1];
                    field715[var1] = field715[var1 + 1];
                    field557[var1] = field557[var1 + 1];
                }
                var0--;
            }
        }
        if (field732 && !class137.method1643()) {
            if (field602 != 0 && field699 != -1) {
                class137.method2042(Statics.field618, field699, 0, field602, false);
            }
            field732 = false;
        }
    }

    @ObfuscatedName("av.r(Lad;IIII)V")
    public static void method633(class33 arg0, int arg1, int arg2, int arg3) {
        if (field712 >= 50 || field711 == 0 || arg0.field879 == null || arg1 >= arg0.field879.length) {
            return;
        }
        int var4 = arg0.field879[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field713[field712] = var5;
        field674[field712] = var6;
        field715[field712] = 0;
        field717[field712] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field557[field712] = (var8 << 16) + (var9 << 8) + var7;
        field712++;
    }

    @ObfuscatedName("ai.p(II)V")
    public static void method728(int arg0) {
        if (arg0 == -1 && !field732) {
            Statics.field2323.method2723();
            class137.field2324 = 1;
            Statics.field2554 = null;
        } else if (arg0 != -1 && field699 != arg0 && field602 != 0 && !field732) {
            class153 var1 = Statics.field618;
            int var2 = field602;
            class137.field2324 = 1;
            Statics.field2554 = var1;
            Statics.field2325 = arg0;
            Statics.field2321 = 0;
            Statics.field2322 = var2;
            Statics.field1263 = false;
            Statics.field76 = 2;
        }
        field699 = arg0;
    }

    @ObfuscatedName("ds.o(III)V")
    public static void method2369(int arg0, int arg1) {
        if (field602 != 0 && arg0 != -1) {
            class137.method2042(Statics.field1647, arg0, 0, field602, false);
            field732 = true;
        }
    }

    @ObfuscatedName("al.ax(B)V")
    public static final void method611() {
        for (int var0 = -1; var0 < field593; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field594[var0];
            }
            class3 var2 = field592[var1];
            if (var2 != null) {
                method2347(var2, 1);
            }
        }
    }

    @ObfuscatedName("cy.aa(B)V")
    public static final void method2039() {
        for (int var0 = 0; var0 < field465; var0++) {
            int var1 = field506[var0];
            class24 var2 = field584[var1];
            if (var2 != null) {
                method2347(var2, var2.field384.field772);
            }
        }
    }

    @ObfuscatedName("dj.af(Lo;II)V")
    public static final void method2347(class26 arg0, int arg1) {
        if (arg0.field449 > field477) {
            method46(arg0);
        } else if (arg0.field437 >= field477) {
            if (field477 == arg0.field437 || arg0.field456 == -1 || arg0.field438 != 0 || arg0.field435 + 1 > Statics.method147(arg0.field456).field878[arg0.field436]) {
                int var2 = arg0.field437 - arg0.field449;
                int var3 = field477 - arg0.field449;
                int var4 = arg0.field422 * 128 + arg0.field410 * 64;
                int var5 = arg0.field447 * 128 + arg0.field410 * 64;
                int var6 = arg0.field446 * 128 + arg0.field410 * 64;
                int var7 = arg0.field448 * 128 + arg0.field410 * 64;
                arg0.field433 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field407 = ((var2 - var3) * var5 + var3 * var7) / var2;
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
            arg0.field440 = arg0.field454;
        } else {
            method3254(arg0);
        }
        if (arg0.field433 < 128 || arg0.field407 < 128 || arg0.field433 >= 13184 || arg0.field407 >= 13184) {
            arg0.field456 = -1;
            arg0.field415 = -1;
            arg0.field449 = 0;
            arg0.field437 = 0;
            arg0.field433 = arg0.field458[0] * 128 + arg0.field410 * 64;
            arg0.field407 = arg0.field421[0] * 128 + arg0.field410 * 64;
            arg0.method227();
        }
        if (Statics.field1242 == arg0 && (arg0.field433 < 1536 || arg0.field407 < 1536 || arg0.field433 >= 11776 || arg0.field407 >= 11776)) {
            arg0.field456 = -1;
            arg0.field415 = -1;
            arg0.field449 = 0;
            arg0.field437 = 0;
            arg0.field433 = arg0.field458[0] * 128 + arg0.field410 * 64;
            arg0.field407 = arg0.field421[0] * 128 + arg0.field410 * 64;
            arg0.method227();
        }
        method783(arg0);
        arg0.field409 = false;
        if (arg0.field432 != -1) {
            class33 var8 = Statics.method147(arg0.field432);
            if (var8 == null || var8.field884 == null) {
                arg0.field432 = -1;
            } else {
                arg0.field434++;
                if (arg0.field444 < var8.field884.length && arg0.field434 > var8.field878[arg0.field444]) {
                    arg0.field434 = 1;
                    arg0.field444++;
                    method633(var8, arg0.field444, arg0.field433, arg0.field407);
                }
                if (arg0.field444 >= var8.field884.length) {
                    arg0.field434 = 0;
                    arg0.field444 = 0;
                    method633(var8, arg0.field444, arg0.field433, arg0.field407);
                }
            }
        }
        if (arg0.field415 != -1 && field477 >= arg0.field443) {
            if (arg0.field441 < 0) {
                arg0.field441 = 0;
            }
            int var9 = class34.method203(arg0.field415).field904;
            if (var9 == -1) {
                arg0.field415 = -1;
            } else {
                class33 var10 = Statics.method147(var9);
                if (var10 == null || var10.field884 == null) {
                    arg0.field415 = -1;
                } else {
                    arg0.field442++;
                    if (arg0.field441 < var10.field884.length && arg0.field442 > var10.field878[arg0.field441]) {
                        arg0.field442 = 1;
                        arg0.field441++;
                        method633(var10, arg0.field441, arg0.field433, arg0.field407);
                    }
                    if (arg0.field441 >= var10.field884.length && (arg0.field441 < 0 || arg0.field441 >= var10.field884.length)) {
                        arg0.field415 = -1;
                    }
                }
            }
        }
        if (arg0.field456 != -1 && arg0.field438 <= 1) {
            class33 var11 = Statics.method147(arg0.field456);
            if (var11.field887 == 1 && arg0.field462 > 0 && arg0.field449 <= field477 && arg0.field437 < field477) {
                arg0.field438 = 1;
                return;
            }
        }
        if (arg0.field456 != -1 && arg0.field438 == 0) {
            class33 var12 = Statics.method147(arg0.field456);
            if (var12 == null || var12.field884 == null) {
                arg0.field456 = -1;
            } else {
                arg0.field435++;
                if (arg0.field436 < var12.field884.length && arg0.field435 > var12.field878[arg0.field436]) {
                    arg0.field435 = 1;
                    arg0.field436++;
                    method633(var12, arg0.field436, arg0.field433, arg0.field407);
                }
                if (arg0.field436 >= var12.field884.length) {
                    arg0.field436 -= var12.field880;
                    arg0.field424++;
                    if (arg0.field424 >= var12.field889) {
                        arg0.field456 = -1;
                    } else if (arg0.field436 >= 0 && arg0.field436 < var12.field884.length) {
                        method633(var12, arg0.field436, arg0.field433, arg0.field407);
                    } else {
                        arg0.field456 = -1;
                    }
                }
                arg0.field409 = var12.field882;
            }
        }
        if (arg0.field438 > 0) {
            arg0.field438--;
        }
    }

    @ObfuscatedName("q.al(Lo;I)V")
    public static final void method46(class26 arg0) {
        int var1 = arg0.field449 - field477;
        int var2 = arg0.field422 * 128 + arg0.field410 * 64;
        int var3 = arg0.field447 * 128 + arg0.field410 * 64;
        arg0.field433 += (var2 - arg0.field433) / var1;
        arg0.field407 += (var3 - arg0.field407) / var1;
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
    }

    @ObfuscatedName("ff.av(Lo;I)V")
    public static final void method3254(class26 arg0) {
        arg0.field432 = arg0.field445;
        if (arg0.field457 == 0) {
            arg0.field461 = 0;
            return;
        }
        if (arg0.field456 != -1 && arg0.field438 == 0) {
            class33 var1 = Statics.method147(arg0.field456);
            if (arg0.field462 > 0 && var1.field887 == 0) {
                arg0.field461++;
                return;
            }
            if (arg0.field462 <= 0 && var1.field888 == 0) {
                arg0.field461++;
                return;
            }
        }
        int var2 = arg0.field433;
        int var3 = arg0.field407;
        int var4 = arg0.field458[arg0.field457 - 1] * 128 + arg0.field410 * 64;
        int var5 = arg0.field421[arg0.field457 - 1] * 128 + arg0.field410 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field433 = var4;
            arg0.field407 = var5;
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
        int var6 = arg0.field454 - arg0.field440 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field459;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field414;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field406;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field452;
        }
        if (var7 == -1) {
            var7 = arg0.field414;
        }
        arg0.field432 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class24) {
            var9 = ((class24) arg0).field384.field770;
        }
        if (var9) {
            if (arg0.field454 != arg0.field440 && arg0.field429 == -1 && arg0.field463 != 0) {
                var8 = 2;
            }
            if (arg0.field457 > 2) {
                var8 = 6;
            }
            if (arg0.field457 > 3) {
                var8 = 8;
            }
            if (arg0.field461 > 0 && arg0.field457 > 1) {
                var8 = 8;
                arg0.field461--;
            }
        } else {
            if (arg0.field457 > 1) {
                var8 = 6;
            }
            if (arg0.field457 > 2) {
                var8 = 8;
            }
            if (arg0.field461 > 0 && arg0.field457 > 1) {
                var8 = 8;
                arg0.field461--;
            }
        }
        if (arg0.field460[arg0.field457 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field432 == arg0.field414 && arg0.field418 != -1) {
            arg0.field432 = arg0.field418;
        }
        if (var2 < var4) {
            arg0.field433 += var8;
            if (arg0.field433 > var4) {
                arg0.field433 = var4;
            }
        } else if (var2 > var4) {
            arg0.field433 -= var8;
            if (arg0.field433 < var4) {
                arg0.field433 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field407 += var8;
            if (arg0.field407 > var5) {
                arg0.field407 = var5;
            }
        } else if (var3 > var5) {
            arg0.field407 -= var8;
            if (arg0.field407 < var5) {
                arg0.field407 = var5;
            }
        }
        if (arg0.field433 == var4 && arg0.field407 == var5) {
            arg0.field457--;
            if (arg0.field462 > 0) {
                arg0.field462--;
            }
        }
    }

    @ObfuscatedName("ao.ab(Lo;I)V")
    public static final void method783(class26 arg0) {
        if (arg0.field463 == 0) {
            return;
        }
        if (arg0.field429 != -1 && arg0.field429 < 32768) {
            class24 var1 = field584[arg0.field429];
            if (var1 != null) {
                int var2 = arg0.field433 - var1.field433;
                int var3 = arg0.field407 - var1.field407;
                if (var2 != 0 || var3 != 0) {
                    arg0.field454 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field429 >= 32768) {
            int var4 = arg0.field429 - 32768;
            if (field635 == var4) {
                var4 = 2047;
            }
            class3 var5 = field592[var4];
            if (var5 != null) {
                int var6 = arg0.field433 - var5.field433;
                int var7 = arg0.field407 - var5.field407;
                if (var6 != 0 || var7 != 0) {
                    arg0.field454 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field416 != 0 || arg0.field431 != 0) && (arg0.field457 == 0 || arg0.field461 > 0)) {
            int var8 = arg0.field433 - (arg0.field416 * 64 - Statics.field176 * 64 - Statics.field176 * 64);
            int var9 = arg0.field407 - (arg0.field431 * 64 - Statics.field1999 * 64 - Statics.field1999 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field454 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field416 = 0;
            arg0.field431 = 0;
        }
        int var10 = arg0.field454 - arg0.field440 & 0x7FF;
        if (var10 == 0) {
            arg0.field455 = 0;
            return;
        }
        arg0.field455++;
        if (var10 > 1024) {
            arg0.field440 -= arg0.field463;
            boolean var11 = true;
            if (var10 < arg0.field463 || var10 > 2048 - arg0.field463) {
                arg0.field440 = arg0.field454;
                var11 = false;
            }
            if (arg0.field445 == arg0.field432 && (arg0.field455 > 25 || var11)) {
                if (arg0.field412 == -1) {
                    arg0.field432 = arg0.field414;
                } else {
                    arg0.field432 = arg0.field412;
                }
            }
        } else {
            arg0.field440 += arg0.field463;
            boolean var12 = true;
            if (var10 < arg0.field463 || var10 > 2048 - arg0.field463) {
                arg0.field440 = arg0.field454;
                var12 = false;
            }
            if (arg0.field445 == arg0.field432 && (arg0.field455 > 25 || var12)) {
                if (arg0.field413 == -1) {
                    arg0.field432 = arg0.field414;
                } else {
                    arg0.field432 = arg0.field413;
                }
            }
        }
        arg0.field440 &= 0x7FF;
    }

    @ObfuscatedName("r.ad(Lx;III)V")
    public static void method212(class3 arg0, int arg1, int arg2) {
        if (arg0.field456 == arg1 && arg1 != -1) {
            int var3 = Statics.method147(arg1).field886;
            if (var3 == 1) {
                arg0.field436 = 0;
                arg0.field435 = 0;
                arg0.field438 = arg2;
                arg0.field424 = 0;
            }
            if (var3 == 2) {
                arg0.field424 = 0;
            }
        } else if (arg1 == -1 || arg0.field456 == -1 || Statics.method147(arg1).field873 >= Statics.method147(arg0.field456).field873) {
            arg0.field456 = arg1;
            arg0.field436 = 0;
            arg0.field435 = 0;
            arg0.field438 = arg2;
            arg0.field424 = 0;
            arg0.field462 = arg0.field457;
        }
    }

    @ObfuscatedName("b.ai(B)V")
    public static final void method141() {
        if (!field628) {
            field620[0] = class133.field2279;
            field645[0] = "";
            field728[0] = 1006;
            field615 = 1;
        }
        if (field535 != -1) {
            method754(field535);
        }
        for (int var0 = 0; var0 < field673; var0++) {
            if (field675[var0]) {
                field676[var0] = true;
            }
            field677[var0] = field675[var0];
            field675[var0] = false;
        }
        field606 = field477;
        field622 = -1;
        field707 = -1;
        Statics.field96 = null;
        if (field535 != -1) {
            field673 = 0;
            int var1 = field535;
            if (class157.method1408(var1)) {
                Statics.field2295 = null;
                method1849(Statics.field2580[var1], -1, 0, 0, 765, 503, 0, 0, -1);
                if (Statics.field2295 != null) {
                    method1849(Statics.field2295, -1412584499, 0, 0, 765, 503, Statics.field198, Statics.field743, -1);
                    Statics.field2295 = null;
                }
            } else {
                for (int var2 = 0; var2 < 100; var2++) {
                    field675[var2] = true;
                }
            }
        }
        class88.method1790();
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < field615 - 1; var4++) {
                if (field728[var4] < 1000 && field728[var4 + 1] > 1000) {
                    String var5 = field645[var4];
                    field645[var4] = field645[var4 + 1];
                    field645[var4 + 1] = var5;
                    String var6 = field620[var4];
                    field620[var4] = field620[var4 + 1];
                    field620[var4 + 1] = var6;
                    int var7 = field728[var4];
                    field728[var4] = field728[var4 + 1];
                    field728[var4 + 1] = var7;
                    int var8 = field616[var4];
                    field616[var4] = field616[var4 + 1];
                    field616[var4 + 1] = var8;
                    int var9 = field617[var4];
                    field617[var4] = field617[var4 + 1];
                    field617[var4 + 1] = var9;
                    int var10 = field619[var4];
                    field619[var4] = field619[var4 + 1];
                    field619[var4 + 1] = var10;
                    var3 = false;
                }
            }
        }
        if (field628) {
            int var11 = Statics.field177;
            int var12 = Statics.field1250;
            int var13 = Statics.field1279;
            int var14 = Statics.field251;
            int var15 = 6116423;
            class88.method1797(var11, var12, var13, var14, var15);
            class88.method1797(var11 + 1, var12 + 1, var13 - 2, 16, 0);
            class88.method1807(var11 + 1, var12 + 18, var13 - 2, var14 - 19, 0);
            Statics.field106.method3438(class133.field2209, var11 + 3, var12 + 14, var15, -1);
            int var16 = class76.field1367;
            int var17 = class76.field1378;
            for (int var18 = 0; var18 < field615; var18++) {
                int var19 = (field615 - 1 - var18) * 15 + var12 + 31;
                int var20 = 16777215;
                if (var16 > var11 && var16 < var11 + var13 && var17 > var19 - 13 && var17 < var19 + 3) {
                    var20 = 16776960;
                }
                Statics.field106.method3438(method1477(var18), var11 + 3, var19, var20, 0);
            }
            method1150(Statics.field177, Statics.field1250, Statics.field1279, Statics.field251);
        } else if (field622 != -1) {
            Statics.method211(field622, field707);
        }
        if (field532 == 3) {
            for (int var21 = 0; var21 < field673; var21++) {
                if (field677[var21]) {
                    class88.method1801(field678[var21], field679[var21], field680[var21], field681[var21], 16711935, 128);
                } else if (field676[var21]) {
                    class88.method1801(field678[var21], field679[var21], field680[var21], field681[var21], 16711680, 128);
                }
            }
        }
        class7.method1485(Statics.field2050, Statics.field1242.field433, Statics.field1242.field407, field585);
        field585 = 0;
    }

    @ObfuscatedName("aa.ak(Ljava/lang/String;ZI)V")
    public static final void method550(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field218.method3391(arg0, 250);
        int var6 = Statics.field218.method3392(arg0, 250) * 13;
        class88.method1797(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class88.method1807(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field218.method3397(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1229(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1150(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2431.getGraphics();
            Statics.field1415.method1603(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2431.repaint();
        }
    }

    @ObfuscatedName("ds.ao(IIIIS)V")
    public static final void method2368(int arg0, int arg1, int arg2, int arg3) {
        class88.method1791(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class103.method2133();
        field660++;
        method9(true);
        method224(true);
        method9(false);
        method224(false);
        for (class10 var4 = (class10) field608.method3326(); var4 != null; var4 = (class10) field608.method3330()) {
            if (Statics.field2050 != var4.field149 || field477 > var4.field155) {
                var4.method3357();
            } else if (field477 >= var4.field154) {
                if (var4.field158 > 0) {
                    class24 var5 = field584[var4.field158 - 1];
                    if (var5 != null && var5.field433 >= 0 && var5.field433 < 13312 && var5.field407 >= 0 && var5.field407 < 13312) {
                        var4.method109(var5.field433, var5.field407, method5(var5.field433, var5.field407, var4.field149) - var4.field148, field477);
                    }
                }
                if (var4.field158 < 0) {
                    int var6 = -var4.field158 - 1;
                    class3 var7;
                    if (field635 == var6) {
                        var7 = Statics.field1242;
                    } else {
                        var7 = field592[var6];
                    }
                    if (var7 != null && var7.field433 >= 0 && var7.field433 < 13312 && var7.field407 >= 0 && var7.field407 < 13312) {
                        var4.method109(var7.field433, var7.field407, method5(var7.field433, var7.field407, var4.field149) - var4.field148, field477);
                    }
                }
                var4.method110(field585);
                Statics.field529.method1919(Statics.field2050, (int) var4.field173, (int) var4.field168, (int) var4.field162, 60, var4, var4.field157, -1, false);
            }
        }
        method3095();
        if (!field718) {
            int var8 = field558;
            if (field548 / 256 > var8) {
                var8 = field548 / 256;
            }
            if (field719[4] && field721[4] + 128 > var8) {
                var8 = field721[4] + 128;
            }
            int var9 = field559 + field543 & 0x7FF;
            method153(Statics.field1312, method5(Statics.field1242.field433, Statics.field1242.field407, Statics.field2050) - 50, Statics.field2811, var8, var9, var8 * 3 + 600);
        }
        int var22;
        if (field718) {
            var22 = method111();
        } else {
            int var10 = 3;
            if (Statics.field298 < 310) {
                int var11 = Statics.field2346 >> 7;
                int var12 = Statics.field1359 >> 7;
                int var13 = Statics.field1242.field433 >> 7;
                int var14 = Statics.field1242.field407 >> 7;
                if ((class9.field135[Statics.field2050][var11][var12] & 0x4) != 0) {
                    var10 = Statics.field2050;
                }
                int var15;
                if (var13 > var11) {
                    var15 = var13 - var11;
                } else {
                    var15 = var11 - var13;
                }
                int var16;
                if (var14 > var12) {
                    var16 = var14 - var12;
                } else {
                    var16 = var12 - var14;
                }
                if (var15 > var16) {
                    int var17 = var16 * 65536 / var15;
                    int var18 = 32768;
                    while (var11 != var13) {
                        if (var11 < var13) {
                            var11++;
                        } else if (var11 > var13) {
                            var11--;
                        }
                        if ((class9.field135[Statics.field2050][var11][var12] & 0x4) != 0) {
                            var10 = Statics.field2050;
                        }
                        var18 += var17;
                        if (var18 >= 65536) {
                            var18 -= 65536;
                            if (var12 < var14) {
                                var12++;
                            } else if (var12 > var14) {
                                var12--;
                            }
                            if ((class9.field135[Statics.field2050][var11][var12] & 0x4) != 0) {
                                var10 = Statics.field2050;
                            }
                        }
                    }
                } else {
                    int var19 = var15 * 65536 / var16;
                    int var20 = 32768;
                    while (var12 != var14) {
                        if (var12 < var14) {
                            var12++;
                        } else if (var12 > var14) {
                            var12--;
                        }
                        if ((class9.field135[Statics.field2050][var11][var12] & 0x4) != 0) {
                            var10 = Statics.field2050;
                        }
                        var20 += var19;
                        if (var20 >= 65536) {
                            var20 -= 65536;
                            if (var11 < var13) {
                                var11++;
                            } else if (var11 > var13) {
                                var11--;
                            }
                            if ((class9.field135[Statics.field2050][var11][var12] & 0x4) != 0) {
                                var10 = Statics.field2050;
                            }
                        }
                    }
                }
            }
            if ((class9.field135[Statics.field2050][Statics.field1242.field433 >> 7][Statics.field1242.field407 >> 7] & 0x4) != 0) {
                var10 = Statics.field2050;
            }
            var22 = var10;
        }
        int var23 = Statics.field2346;
        int var24 = Statics.field2319;
        int var25 = Statics.field1359;
        int var26 = Statics.field298;
        int var27 = Statics.field255;
        for (int var28 = 0; var28 < 5; var28++) {
            if (field719[var28]) {
                int var29 = (int) (Math.random() * (double) (field720[var28] * 2 + 1) - (double) field720[var28] + Math.sin((double) field722[var28] / 100.0D * (double) field723[var28]) * (double) field721[var28]);
                if (var28 == 0) {
                    Statics.field2346 += var29;
                }
                if (var28 == 1) {
                    Statics.field2319 += var29;
                }
                if (var28 == 2) {
                    Statics.field1359 += var29;
                }
                if (var28 == 3) {
                    Statics.field255 = Statics.field255 + var29 & 0x7FF;
                }
                if (var28 == 4) {
                    Statics.field298 += var29;
                    if (Statics.field298 < 128) {
                        Statics.field298 = 128;
                    }
                    if (Statics.field298 > 383) {
                        Statics.field298 = 383;
                    }
                }
            }
        }
        int var30 = class76.field1367;
        int var31 = class76.field1378;
        if (var30 >= arg0 && var30 < arg0 + arg2 && var31 >= arg1 && var31 < arg1 + arg3) {
            class111.field1892 = true;
            class111.field1890 = 0;
            class111.field1893 = class76.field1367 - arg0;
            class111.field1894 = class76.field1378 - arg1;
        } else {
            class111.field1892 = false;
            class111.field1890 = 0;
        }
        method168();
        class88.method1797(arg0, arg1, arg2, arg3, 0);
        method168();
        Statics.field529.method2009(Statics.field2346, Statics.field2319, Statics.field1359, Statics.field298, Statics.field255, var22);
        method168();
        Statics.field529.method1944();
        field565 = 0;
        for (int var32 = -1; var32 < field593 + field465; var32++) {
            class26 var33;
            if (var32 == -1) {
                var33 = Statics.field1242;
            } else if (var32 < field593) {
                var33 = field592[field594[var32]];
            } else {
                var33 = field584[field506[var32 - field593]];
            }
            if (var33 != null && var33.method26()) {
                if (var33 instanceof class24) {
                    class30 var34 = ((class24) var33).field384;
                    if (var34.field796 != null) {
                        var34 = var34.method582();
                    }
                    if (var34 == null) {
                        continue;
                    }
                }
                if (var32 >= field593) {
                    class30 var37 = ((class24) var33).field384;
                    if (var37.field796 != null) {
                        var37 = var37.method582();
                    }
                    if (var37.field794 >= 0 && var37.field794 < Statics.field1193.length) {
                        method175(var33, var33.field408 + 15);
                        if (field577 > -1) {
                            Statics.field1193[var37.field794].method1686(field577 + arg0 - 12, field578 + arg1 - 30);
                        }
                    }
                    if (field508 == 1 && field725 == field506[var32 - field593] && field477 % 20 < 10) {
                        method175(var33, var33.field408 + 15);
                        if (field577 > -1) {
                            Statics.field1293[0].method1686(field577 + arg0 - 12, field578 + arg1 - 28);
                        }
                    }
                } else {
                    int var35 = 30;
                    class3 var36 = (class3) var33;
                    if (var36.field35 != -1 || var36.field36 != -1) {
                        method175(var33, var33.field408 + 15);
                        if (field577 > -1) {
                            if (var36.field35 != -1) {
                                Statics.field1993[var36.field35].method1686(field577 + arg0 - 12, field578 + arg1 - var35);
                                var35 += 25;
                            }
                            if (var36.field36 != -1) {
                                Statics.field1193[var36.field36].method1686(field577 + arg0 - 12, field578 + arg1 - var35);
                                var35 += 25;
                            }
                        }
                    }
                    if (var32 >= 0 && field508 == 10 && field487 == field594[var32]) {
                        method175(var33, var33.field408 + 15);
                        if (field577 > -1) {
                            Statics.field1293[1].method1686(field577 + arg0 - 12, field578 + arg1 - var35);
                        }
                    }
                }
                if (var33.field419 != null && (var32 >= field593 || field689 == 0 || field689 == 3 || field689 == 1 && method1529(((class3) var33).field41))) {
                    method175(var33, var33.field408);
                    if (field577 > -1 && field565 < field566) {
                        field570[field565] = Statics.field106.method3389(var33.field419) / 2;
                        field569[field565] = Statics.field106.field2847;
                        field647[field565] = field577;
                        field568[field565] = field578;
                        field571[field565] = var33.field420;
                        field633[field565] = var33.field411;
                        field564[field565] = var33.field423;
                        field574[field565] = var33.field419;
                        field565++;
                    }
                }
                if (var33.field426 > field477) {
                    method175(var33, var33.field408 + 15);
                    if (field577 > -1) {
                        int var38 = var33.field427 * 30 / var33.field428;
                        if (var38 > 30) {
                            var38 = 30;
                        }
                        class88.method1797(field577 + arg0 - 15, field578 + arg1 - 3, var38, 5, 65280);
                        class88.method1797(field577 + arg0 - 15 + var38, field578 + arg1 - 3, 30 - var38, 5, 16711680);
                    }
                }
                for (int var39 = 0; var39 < 4; var39++) {
                    if (var33.field425[var39] > field477) {
                        method175(var33, var33.field408 / 2);
                        if (field577 > -1) {
                            if (var39 == 1) {
                                field578 -= 20;
                            }
                            if (var39 == 2) {
                                field577 -= 15;
                                field578 -= 10;
                            }
                            if (var39 == 3) {
                                field577 += 15;
                                field578 -= 10;
                            }
                            Statics.field283[var33.field417[var39]].method1686(field577 + arg0 - 12, field578 + arg1 - 12);
                            Statics.field1278.method3433(Integer.toString(var33.field439[var39]), field577 + arg0 - 1, field578 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var40 = 0; var40 < field565; var40++) {
            int var41 = field647[var40];
            int var42 = field568[var40];
            int var43 = field570[var40];
            int var44 = field569[var40];
            boolean var45 = true;
            while (var45) {
                var45 = false;
                for (int var46 = 0; var46 < var40; var46++) {
                    if (var42 + 2 > field568[var46] - field569[var46] && var42 - var44 < field568[var46] + 2 && var41 - var43 < field647[var46] + field570[var46] && var41 + var43 > field647[var46] - field570[var46] && field568[var46] - field569[var46] < var42) {
                        var42 = field568[var46] - field569[var46];
                        var45 = true;
                    }
                }
            }
            field577 = field647[var40];
            field578 = field568[var40] = var42;
            String var47 = field574[var40];
            if (field684 == 0) {
                int var48 = 16776960;
                if (field571[var40] < 6) {
                    var48 = field688[field571[var40]];
                }
                if (field571[var40] == 6) {
                    var48 = field660 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field571[var40] == 7) {
                    var48 = field660 % 20 < 10 ? 255 : 65535;
                }
                if (field571[var40] == 8) {
                    var48 = field660 % 20 < 10 ? 45056 : 8454016;
                }
                if (field571[var40] == 9) {
                    int var49 = 150 - field564[var40];
                    if (var49 < 50) {
                        var48 = var49 * 1280 + 16711680;
                    } else if (var49 < 100) {
                        var48 = 16776960 - (var49 - 50) * 327680;
                    } else if (var49 < 150) {
                        var48 = (var49 - 100) * 5 + 65280;
                    }
                }
                if (field571[var40] == 10) {
                    int var50 = 150 - field564[var40];
                    if (var50 < 50) {
                        var48 = var50 * 5 + 16711680;
                    } else if (var50 < 100) {
                        var48 = 16711935 - (var50 - 50) * 327680;
                    } else if (var50 < 150) {
                        var48 = (var50 - 100) * 327680 + 255 - (var50 - 100) * 5;
                    }
                }
                if (field571[var40] == 11) {
                    int var51 = 150 - field564[var40];
                    if (var51 < 50) {
                        var48 = 16777215 - var51 * 327685;
                    } else if (var51 < 100) {
                        var48 = (var51 - 50) * 327685 + 65280;
                    } else if (var51 < 150) {
                        var48 = 16777215 - (var51 - 100) * 327680;
                    }
                }
                if (field633[var40] == 0) {
                    Statics.field106.method3433(var47, field577 + arg0, field578 + arg1, var48, 0);
                }
                if (field633[var40] == 1) {
                    Statics.field106.method3398(var47, field577 + arg0, field578 + arg1, var48, 0, field660);
                }
                if (field633[var40] == 2) {
                    Statics.field106.method3399(var47, field577 + arg0, field578 + arg1, var48, 0, field660);
                }
                if (field633[var40] == 3) {
                    Statics.field106.method3400(var47, field577 + arg0, field578 + arg1, var48, 0, field660, 150 - field564[var40]);
                }
                if (field633[var40] == 4) {
                    int var52 = (150 - field564[var40]) * (Statics.field106.method3389(var47) + 100) / 150;
                    class88.method1792(field577 + arg0 - 50, arg1, field577 + arg0 + 50, arg1 + arg3);
                    Statics.field106.method3438(var47, field577 + arg0 + 50 - var52, field578 + arg1, var48, 0);
                    class88.method1791(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field633[var40] == 5) {
                    int var53 = 150 - field564[var40];
                    int var54 = 0;
                    if (var53 < 25) {
                        var54 = var53 - 25;
                    } else if (var53 > 125) {
                        var54 = var53 - 125;
                    }
                    class88.method1792(arg0, field578 + arg1 - Statics.field106.field2847 - 1, arg0 + arg2, field578 + arg1 + 5);
                    Statics.field106.method3433(var47, field577 + arg0, field578 + arg1 + var54, var48, 0);
                    class88.method1791(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field106.method3433(var47, field577 + arg0, field578 + arg1, 16776960, 0);
            }
        }
        if (field508 == 2) {
            method2383((field488 - Statics.field176 << 7) + field491, (field489 - Statics.field1999 << 7) + field636, field490 * 2);
            if (field577 > -1 && field477 % 20 < 10) {
                Statics.field1293[0].method1686(field577 + arg0 - 12, field578 + arg1 - 28);
            }
        }
        ((class109) Statics.field1758).method2219(field585);
        if (field470 == 1) {
            Statics.field1253[field581 / 100].method1686(field642 - 8, field693 - 8);
        }
        if (field470 == 2) {
            Statics.field1253[field581 / 100 + 4].method1686(field642 - 8, field693 - 8);
        }
        field546 = 0;
        int var55 = (Statics.field1242.field433 >> 7) + Statics.field176;
        int var56 = (Statics.field1242.field407 >> 7) + Statics.field1999;
        if (var55 >= 3053 && var55 <= 3156 && var56 >= 3056 && var56 <= 3136) {
            field546 = 1;
        }
        if (var55 >= 3072 && var55 <= 3118 && var56 >= 9492 && var56 <= 9535) {
            field546 = 1;
        }
        if (field546 == 1 && var55 >= 3139 && var55 <= 3199 && var56 >= 3008 && var56 <= 3062) {
            field546 = 0;
        }
        if (field466) {
            int var57 = arg0 + 512 - 5;
            int var58 = arg1 + 20;
            Statics.field218.method3395("Fps:" + field1310, var57, var58, 16776960, -1);
            int var65 = var58 + 15;
            Runtime var59 = Runtime.getRuntime();
            int var60 = (int) ((var59.totalMemory() - var59.freeMemory()) / 1024L);
            int var61 = 16776960;
            if (var60 > 32768 && field472) {
                var61 = 16711680;
            }
            if (var60 > 65536 && !field472) {
                var61 = 16711680;
            }
            Statics.field218.method3395("Mem:" + var60 + "k", var57, var65, var61, -1);
            var58 = var65 + 15;
        }
        Statics.field2346 = var23;
        Statics.field2319 = var24;
        Statics.field1359 = var25;
        Statics.field298 = var26;
        Statics.field255 = var27;
        if (field476) {
            byte var62 = 0;
            int var63 = class152.field2509 + class152.field2507 + var62;
            if (var63 == 0) {
                field476 = false;
            }
        }
        if (field476) {
            class88.method1797(arg0, arg1, arg2, arg3, 0);
            method550(class133.field2072, false);
        }
        if (!field476 && !field628 && var30 >= arg0 && var30 < arg0 + arg2 && var31 >= arg1 && var31 < arg1 + arg3) {
            method3173(var30, var31, arg0, arg1);
        }
    }

    @ObfuscatedName("k.aq(ZI)V")
    public static final void method9(boolean arg0) {
        if (Statics.field1242.field433 >> 7 == field704 && Statics.field1242.field407 >> 7 == field705) {
            field704 = 0;
        }
        int var1 = field593;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1242;
                var4 = 33538048;
            } else {
                var3 = field592[field594[var2]];
                var4 = field594[var2] << 14;
            }
            if (var3 != null && var3.method26()) {
                var3.field34 = false;
                if ((field472 && field593 > 50 || field593 > 200) && !arg0 && var3.field445 == var3.field432) {
                    var3.field34 = true;
                }
                int var5 = var3.field433 >> 7;
                int var6 = var3.field407 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field45 == null || field477 < var3.field51 || field477 >= var3.field33) {
                        if ((var3.field433 & 0x7F) == 64 && (var3.field407 & 0x7F) == 64) {
                            if (field660 == field575[var5][var6]) {
                                continue;
                            }
                            field575[var5][var6] = field660;
                        }
                        var3.field39 = method5(var3.field433, var3.field407, Statics.field2050);
                        Statics.field529.method1919(Statics.field2050, var3.field433, var3.field407, var3.field39, 60, var3, var3.field440, var4, var3.field409);
                    } else {
                        var3.field34 = false;
                        var3.field39 = method5(var3.field433, var3.field407, Statics.field2050);
                        Statics.field529.method1868(Statics.field2050, var3.field433, var3.field407, var3.field39, 60, var3, var3.field440, var4, var3.field46, var3.field47, var3.field48, var3.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.aj(ZI)V")
    public static final void method224(boolean arg0) {
        for (int var1 = 0; var1 < field465; var1++) {
            class24 var2 = field584[field506[var1]];
            int var3 = (field506[var1] << 14) + 536870912;
            if (var2 != null && var2.method26() && var2.field384.field767 == arg0 && var2.field384.method583()) {
                int var4 = var2.field433 >> 7;
                int var5 = var2.field407 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field410 == 1 && (var2.field433 & 0x7F) == 64 && (var2.field407 & 0x7F) == 64) {
                        if (field660 == field575[var4][var5]) {
                            continue;
                        }
                        field575[var4][var5] = field660;
                    }
                    if (!var2.field384.field799) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field529.method1919(Statics.field2050, var2.field433, var2.field407, method5(var2.field433 + (var2.field410 * 64 - 64), var2.field407 + (var2.field410 * 64 - 64), Statics.field2050), var2.field410 * 64 - 64 + 60, var2, var2.field440, var3, var2.field409);
                }
            }
        }
    }

    @ObfuscatedName("ey.ag(I)V")
    public static final void method3095() {
        for (class19 var0 = (class19) field667.method3326(); var0 != null; var0 = (class19) field667.method3330()) {
            if (Statics.field2050 != var0.field289 || var0.field296) {
                var0.method3357();
            } else if (field477 >= var0.field287) {
                var0.method167(field585);
                if (var0.field296) {
                    var0.method3357();
                } else {
                    Statics.field529.method1919(var0.field289, var0.field292, var0.field291, var0.field295, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("l.ap(I)I")
    public static final int method111() {
        int var0 = method5(Statics.field2346, Statics.field1359, Statics.field2050);
        return var0 - Statics.field2319 >= 800 || (class9.field135[Statics.field2050][Statics.field2346 >> 7][Statics.field1359 >> 7] & 0x4) == 0 ? 3 : Statics.field2050;
    }

    @ObfuscatedName("s.an(Lo;IB)V")
    public static final void method175(class26 arg0, int arg1) {
        method2383(arg0.field433, arg0.field407, arg1);
    }

    @ObfuscatedName("db.as(IIII)V")
    public static final void method2383(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field577 = -1;
            field578 = -1;
            return;
        }
        int var3 = method5(arg0, arg1, Statics.field2050) - arg2;
        int var4 = arg0 - Statics.field2346;
        int var5 = var3 - Statics.field2319;
        int var6 = arg1 - Statics.field1359;
        int var7 = class103.field1761[Statics.field298];
        int var8 = class103.field1747[Statics.field298];
        int var9 = class103.field1761[Statics.field255];
        int var10 = class103.field1747[Statics.field255];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field577 = (var11 << 9) / var15 + 256;
            field578 = (var14 << 9) / var15 + 167;
        } else {
            field577 = -1;
            field578 = -1;
        }
    }

    @ObfuscatedName("k.au(IIII)I")
    public static final int method5(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class9.field137[var5][var3][var4] + class9.field137[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field137[var5][var3][var4 + 1] + class9.field137[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("h.ay(IIIIIIB)V")
    public static final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class103.field1761[var6];
            int var12 = class103.field1747[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class103.field1761[var7];
            int var15 = class103.field1747[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2346 = arg0 - var8;
        Statics.field2319 = arg1 - var9;
        Statics.field1359 = arg2 - var10;
        Statics.field298 = arg3;
        Statics.field255 = arg4;
    }

    @ObfuscatedName("k.ah(ZI)V")
    public static final void method6(boolean arg0) {
        field623 = arg0;
        if (!field623) {
            int var1 = field513.method2478();
            int var2 = field513.method2559();
            int var3 = field513.method2450();
            int var4 = (field514 - field513.field2024) / 16;
            Statics.field1615 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1615[var5][var6] = field513.method2602();
                }
            }
            int var7 = field513.method2478();
            int var8 = field513.method2479();
            Statics.field2733 = new int[var4];
            Statics.field1733 = new int[var4];
            Statics.field1313 = new int[var4];
            Statics.field183 = new byte[var4][];
            Statics.field1655 = new byte[var4][];
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2733[var10] = var13;
                        Statics.field1733[var10] = Statics.field549.method2980("m" + var11 + "_" + var12);
                        Statics.field1313[var10] = Statics.field549.method2980("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1506(var3, var7, var2, var8, var1);
            return;
        }
        int var14 = field513.method2480();
        int var15 = field513.method2480();
        int var16 = field513.method2478();
        int var17 = field513.method2471();
        int var18 = field513.method2479();
        field513.method2318();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field513.method2319(1);
                    if (var22 == 1) {
                        field540[var19][var20][var21] = field513.method2319(26);
                    } else {
                        field540[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field513.method2320();
        int var23 = (field514 - field513.field2024) / 16;
        Statics.field1615 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field1615[var24][var25] = field513.method2619();
            }
        }
        Statics.field2733 = new int[var23];
        Statics.field1733 = new int[var23];
        Statics.field1313 = new int[var23];
        Statics.field183 = new byte[var23][];
        Statics.field1655 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field540[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2733[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2733[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1733[var26] = Statics.field549.method2980("m" + var35 + "_" + var36);
                            Statics.field1313[var26] = Statics.field549.method2980("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1506(var18, var16, var17, var15, var14);
    }

    @ObfuscatedName("bz.aw(IIIIII)V")
    public static final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field917 == arg0 && Statics.field300 == arg1 && field523 == arg2 || !field472) {
            return;
        }
        Statics.field917 = arg0;
        Statics.field300 = arg1;
        field523 = arg2;
        if (!field472) {
            field523 = 0;
        }
        method138(25);
        method550(class133.field2072, true);
        int var5 = Statics.field176;
        int var6 = Statics.field1999;
        Statics.field176 = (arg0 - 6) * 8;
        Statics.field1999 = (arg1 - 6) * 8;
        int var7 = Statics.field176 - var5;
        int var8 = Statics.field1999 - var6;
        int var9 = Statics.field176;
        int var10 = Statics.field1999;
        for (int var11 = 0; var11 < 32768; var11++) {
            class24 var12 = field584[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field458[var13] -= var7;
                    var12.field421[var13] -= var8;
                }
                var12.field433 -= var7 * 128;
                var12.field407 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field592[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field458[var16] -= var7;
                    var15.field421[var16] -= var8;
                }
                var15.field433 -= var7 * 128;
                var15.field407 -= var8 * 128;
            }
        }
        Statics.field2050 = arg2;
        Statics.field1242.method228(arg3, arg4, false);
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
                        field590[var27][var23][var24] = field590[var27][var25][var26];
                    } else {
                        field590[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class21 var28 = (class21) field662.method3326(); var28 != null; var28 = (class21) field662.method3330()) {
            var28.field346 -= var7;
            var28.field347 -= var8;
            if (var28.field346 < 0 || var28.field347 < 0 || var28.field346 >= 104 || var28.field347 >= 104) {
                var28.method3357();
            }
        }
        if (field704 != 0) {
            field704 -= var7;
            field705 -= var8;
        }
        field712 = 0;
        field718 = false;
        field692 = -1;
        field667.method3322();
        field608.method3322();
    }

    @ObfuscatedName("a.ac(ZI)V")
    public static final void method64(boolean arg0) {
        method168();
        field517++;
        if (field517 < 50 && !arg0) {
            return;
        }
        field517 = 0;
        if (field522 || Statics.field579 == null) {
            return;
        }
        field499.method2322(223);
        try {
            Statics.field579.method1374(field499.field2022, 0, field499.field2024);
            field499.field2024 = 0;
        } catch (IOException var2) {
            field522 = true;
        }
    }

    @ObfuscatedName("j.az(I)V")
    public static final void method107() {
        method64(false);
        field687 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field183.length; var1++) {
            if (Statics.field1733[var1] != -1 && Statics.field183[var1] == null) {
                Statics.field183[var1] = Statics.field549.method2965(Statics.field1733[var1], 0);
                if (Statics.field183[var1] == null) {
                    var0 = false;
                    field687++;
                }
            }
            if (Statics.field1313[var1] != -1 && Statics.field1655[var1] == null) {
                Statics.field1655[var1] = Statics.field549.method2966(Statics.field1313[var1], 0, Statics.field1615[var1]);
                if (Statics.field1655[var1] == null) {
                    var0 = false;
                    field687++;
                }
            }
        }
        if (!var0) {
            field528 = 1;
            return;
        }
        field526 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field183.length; var3++) {
            byte[] var4 = Statics.field1655[var3];
            if (var4 != null) {
                int var5 = (Statics.field2733[var3] >> 8) * 64 - Statics.field176;
                int var6 = (Statics.field2733[var3] & 0xFF) * 64 - Statics.field1999;
                if (field623) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class126 var9 = new class126(var4);
                int var10 = -1;
                label1060: while (true) {
                    int var11 = var9.method2580();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2580();
                            if (var16 == 0) {
                                continue label1060;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2559() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class31 var22 = class31.method132(var10);
                                if (var19 != 22 || !field472 || var22.field811 != 0 || var22.field826 == 1 || var22.field848) {
                                    if (!var22.method617()) {
                                        field526++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2580();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2559();
                    }
                }
            }
        }
        if (!var2) {
            field528 = 2;
            return;
        }
        if (field528 != 0) {
            method550(class133.field2072 + class2.field20 + class2.field29 + 100 + "%" + class2.field21, true);
        }
        method168();
        method718();
        method168();
        Statics.field529.method1857();
        method168();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field530[var23].method3209();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field135[var24][var25][var26] = 0;
                }
            }
        }
        method168();
        class9.field126 = 99;
        Statics.field127 = new byte[4][104][104];
        Statics.field128 = new byte[4][104][104];
        Statics.field129 = new byte[4][104][104];
        Statics.field147 = new byte[4][104][104];
        Statics.field2329 = new int[4][105][105];
        Statics.field280 = new byte[4][105][105];
        Statics.field131 = new int[105][105];
        Statics.field386 = new int[104];
        Statics.field2759 = new int[104];
        Statics.field1487 = new int[104];
        Statics.field134 = new int[104];
        Statics.field1433 = new int[104];
        int var27 = Statics.field183.length;
        class7.method2884();
        method64(true);
        if (!field623) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field2733[var28] >> 8) * 64 - Statics.field176;
                int var30 = (Statics.field2733[var28] & 0xFF) * 64 - Statics.field1999;
                byte[] var31 = Statics.field183[var28];
                if (var31 != null) {
                    method168();
                    class9.method3094(var31, var29, var30, Statics.field917 * 8 - 48, Statics.field300 * 8 - 48, field530);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field2733[var32] >> 8) * 64 - Statics.field176;
                int var34 = (Statics.field2733[var32] & 0xFF) * 64 - Statics.field1999;
                byte[] var35 = Statics.field183[var32];
                if (var35 == null && Statics.field300 < 800) {
                    method168();
                    class9.method129(var33, var34, 64, 64);
                }
            }
            method64(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field1655[var36];
                if (var37 != null) {
                    int var38 = (Statics.field2733[var36] >> 8) * 64 - Statics.field176;
                    int var39 = (Statics.field2733[var36] & 0xFF) * 64 - Statics.field1999;
                    method168();
                    class9.method136(var37, var38, var39, Statics.field529, field530);
                }
            }
        }
        if (field623) {
            for (int var40 = 0; var40 < 4; var40++) {
                method168();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field540[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field2733.length; var50++) {
                                if (Statics.field2733[var50] == var49 && Statics.field183[var50] != null) {
                                    byte[] var51 = Statics.field183[var50];
                                    int var52 = var41 * 8;
                                    int var53 = var42 * 8;
                                    int var54 = (var47 & 0x7) * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    class163[] var56 = field530;
                                    for (int var57 = 0; var57 < 8; var57++) {
                                        for (int var58 = 0; var58 < 8; var58++) {
                                            if (var52 + var57 > 0 && var52 + var57 < 103 && var53 + var58 > 0 && var53 + var58 < 103) {
                                                var56[var40].field2729[var52 + var57][var53 + var58] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class126 var59 = new class126(var51);
                                    for (int var60 = 0; var60 < 4; var60++) {
                                        for (int var61 = 0; var61 < 64; var61++) {
                                            for (int var62 = 0; var62 < 64; var62++) {
                                                if (var45 == var60 && var61 >= var54 && var61 < var54 + 8 && var62 >= var55 && var62 < var55 + 8) {
                                                    class9.method573(var59, var40, var52 + class159.method2428(var61 & 0x7, var62 & 0x7, var46), var53 + class159.method1409(var61 & 0x7, var62 & 0x7, var46), 0, 0, var46);
                                                } else {
                                                    class9.method573(var59, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43) {
                            int var63 = var40;
                            int var64 = var41 * 8;
                            int var65 = var42 * 8;
                            for (int var66 = 0; var66 < 8; var66++) {
                                for (int var67 = 0; var67 < 8; var67++) {
                                    class9.field137[var63][var64 + var66][var65 + var67] = 0;
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class9.field137[var63][var64][var65 + var68] = class9.field137[var63][var64 - 1][var65 + var68];
                                }
                            }
                            if (var65 > 0) {
                                for (int var69 = 1; var69 < 8; var69++) {
                                    class9.field137[var63][var64 + var69][var65] = class9.field137[var63][var64 + var69][var65 - 1];
                                }
                            }
                            if (var64 > 0 && class9.field137[var63][var64 - 1][var65] != 0) {
                                class9.field137[var63][var64][var65] = class9.field137[var63][var64 - 1][var65];
                            } else if (var65 > 0 && class9.field137[var63][var64][var65 - 1] != 0) {
                                class9.field137[var63][var64][var65] = class9.field137[var63][var64][var65 - 1];
                            } else if (var64 > 0 && var65 > 0 && class9.field137[var63][var64 - 1][var65 - 1] != 0) {
                                class9.field137[var63][var64][var65] = class9.field137[var63][var64 - 1][var65 - 1];
                            }
                        }
                    }
                }
            }
            for (int var70 = 0; var70 < 13; var70++) {
                for (int var71 = 0; var71 < 13; var71++) {
                    int var72 = field540[0][var70][var71];
                    if (var72 == -1) {
                        class9.method129(var70 * 8, var71 * 8, 8, 8);
                    }
                }
            }
            method64(true);
            for (int var73 = 0; var73 < 4; var73++) {
                method168();
                for (int var74 = 0; var74 < 13; var74++) {
                    for (int var75 = 0; var75 < 13; var75++) {
                        int var76 = field540[var73][var74][var75];
                        if (var76 != -1) {
                            int var77 = var76 >> 24 & 0x3;
                            int var78 = var76 >> 1 & 0x3;
                            int var79 = var76 >> 14 & 0x3FF;
                            int var80 = var76 >> 3 & 0x7FF;
                            int var81 = (var79 / 8 << 8) + var80 / 8;
                            for (int var82 = 0; var82 < Statics.field2733.length; var82++) {
                                if (Statics.field2733[var82] == var81 && Statics.field1655[var82] != null) {
                                    class9.method1531(Statics.field1655[var82], var73, var74 * 8, var75 * 8, var77, (var79 & 0x7) * 8, (var80 & 0x7) * 8, var78, Statics.field529, field530);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method64(true);
        method718();
        method168();
        class94 var83 = Statics.field529;
        class163[] var84 = field530;
        for (int var85 = 0; var85 < 4; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                for (int var87 = 0; var87 < 104; var87++) {
                    if ((class9.field135[var85][var86][var87] & 0x1) == 1) {
                        int var88 = var85;
                        if ((class9.field135[1][var86][var87] & 0x2) == 2) {
                            var88 = var85 - 1;
                        }
                        if (var88 >= 0) {
                            var84[var88].method3212(var86, var87);
                        }
                    }
                }
            }
        }
        class9.field140 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field140 < -8) {
            class9.field140 = -8;
        }
        if (class9.field140 > 8) {
            class9.field140 = 8;
        }
        class9.field141 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field141 < -16) {
            class9.field141 = -16;
        }
        if (class9.field141 > 16) {
            class9.field141 = 16;
        }
        for (int var89 = 0; var89 < 4; var89++) {
            byte[][] var90 = Statics.field280[var89];
            int var91 = (int) Math.sqrt(5100.0D);
            int var92 = var91 * 768 >> 8;
            for (int var93 = 1; var93 < 103; var93++) {
                for (int var94 = 1; var94 < 103; var94++) {
                    int var95 = class9.field137[var89][var94 + 1][var93] - class9.field137[var89][var94 - 1][var93];
                    int var96 = class9.field137[var89][var94][var93 + 1] - class9.field137[var89][var94][var93 - 1];
                    int var97 = (int) Math.sqrt((double) (var96 * var96 + var95 * var95 + 65536));
                    int var98 = (var95 << 8) / var97;
                    int var99 = 65536 / var97;
                    int var100 = (var96 << 8) / var97;
                    int var101 = (var100 * -50 + var98 * -50 + var99 * -10) / var92 + 96;
                    int var102 = (var90[var94][var93] >> 1) + (var90[var94][var93 + 1] >> 3) + (var90[var94][var93 - 1] >> 2) + (var90[var94 - 1][var93] >> 2) + (var90[var94 + 1][var93] >> 3);
                    Statics.field131[var94][var93] = var101 - var102;
                }
            }
            for (int var103 = 0; var103 < 104; var103++) {
                Statics.field386[var103] = 0;
                Statics.field2759[var103] = 0;
                Statics.field1487[var103] = 0;
                Statics.field134[var103] = 0;
                Statics.field1433[var103] = 0;
            }
            for (int var104 = -5; var104 < 109; var104++) {
                for (int var105 = 0; var105 < 104; var105++) {
                    int var106 = var104 + 5;
                    int var10002;
                    if (var106 >= 0 && var106 < 104) {
                        int var107 = Statics.field127[var89][var106][var105] & 0xFF;
                        if (var107 > 0) {
                            class32 var108 = class32.method2341(var107 - 1);
                            Statics.field386[var105] += var108.field866;
                            Statics.field2759[var105] += var108.field865;
                            Statics.field1487[var105] += var108.field861;
                            Statics.field134[var105] += var108.field864;
                            var10002 = Statics.field1433[var105]++;
                        }
                    }
                    int var109 = var104 - 5;
                    if (var109 >= 0 && var109 < 104) {
                        int var110 = Statics.field127[var89][var109][var105] & 0xFF;
                        if (var110 > 0) {
                            class32 var111 = class32.method2341(var110 - 1);
                            Statics.field386[var105] -= var111.field866;
                            Statics.field2759[var105] -= var111.field865;
                            Statics.field1487[var105] -= var111.field861;
                            Statics.field134[var105] -= var111.field864;
                            var10002 = Statics.field1433[var105]--;
                        }
                    }
                }
                if (var104 >= 1 && var104 < 103) {
                    int var112 = 0;
                    int var113 = 0;
                    int var114 = 0;
                    int var115 = 0;
                    int var116 = 0;
                    for (int var117 = -5; var117 < 109; var117++) {
                        int var118 = var117 + 5;
                        if (var118 >= 0 && var118 < 104) {
                            var112 += Statics.field386[var118];
                            var113 += Statics.field2759[var118];
                            var114 += Statics.field1487[var118];
                            var115 += Statics.field134[var118];
                            var116 += Statics.field1433[var118];
                        }
                        int var119 = var117 - 5;
                        if (var119 >= 0 && var119 < 104) {
                            var112 -= Statics.field386[var119];
                            var113 -= Statics.field2759[var119];
                            var114 -= Statics.field1487[var119];
                            var115 -= Statics.field134[var119];
                            var116 -= Statics.field1433[var119];
                        }
                        if (var117 >= 1 && var117 < 103 && (!field472 || (class9.field135[0][var104][var117] & 0x2) != 0 || (class9.field135[var89][var104][var117] & 0x10) == 0 && class9.method126(var89, var104, var117) == field523)) {
                            if (var89 < class9.field126) {
                                class9.field126 = var89;
                            }
                            int var120 = Statics.field127[var89][var104][var117] & 0xFF;
                            int var121 = Statics.field128[var89][var104][var117] & 0xFF;
                            if (var120 > 0 || var121 > 0) {
                                int var122 = class9.field137[var89][var104][var117];
                                int var123 = class9.field137[var89][var104 + 1][var117];
                                int var124 = class9.field137[var89][var104 + 1][var117 + 1];
                                int var125 = class9.field137[var89][var104][var117 + 1];
                                int var126 = Statics.field131[var104][var117];
                                int var127 = Statics.field131[var104 + 1][var117];
                                int var128 = Statics.field131[var104 + 1][var117 + 1];
                                int var129 = Statics.field131[var104][var117 + 1];
                                int var130 = -1;
                                int var131 = -1;
                                if (var120 > 0) {
                                    int var132 = var112 * 256 / var115;
                                    int var133 = var113 / var116;
                                    int var134 = var114 / var116;
                                    var130 = class9.method807(var132, var133, var134);
                                    int var135 = class9.field140 + var132 & 0xFF;
                                    int var136 = class9.field141 + var134;
                                    if (var136 < 0) {
                                        var136 = 0;
                                    } else if (var136 > 255) {
                                        var136 = 255;
                                    }
                                    var131 = class9.method807(var135, var133, var136);
                                }
                                if (var89 > 0) {
                                    boolean var137 = true;
                                    if (var120 == 0 && Statics.field129[var89][var104][var117] != 0) {
                                        var137 = false;
                                    }
                                    if (var121 > 0 && !class36.method2208(var121 - 1).field929) {
                                        var137 = false;
                                    }
                                    if (var137 && var122 == var123 && var122 == var124 && var122 == var125) {
                                        Statics.field2329[var89][var104][var117] |= 0x924;
                                    }
                                }
                                int var138 = 0;
                                if (var131 != -1) {
                                    var138 = class103.field1746[class9.method2952(var131, 96)];
                                }
                                if (var121 == 0) {
                                    var83.method1862(var89, var104, var117, 0, 0, -1, var122, var123, var124, var125, class9.method2952(var130, var126), class9.method2952(var130, var127), class9.method2952(var130, var128), class9.method2952(var130, var129), 0, 0, 0, 0, var138, 0);
                                } else {
                                    int var139 = Statics.field129[var89][var104][var117] + 1;
                                    byte var140 = Statics.field147[var89][var104][var117];
                                    class36 var141 = class36.method2208(var121 - 1);
                                    int var142 = var141.field928;
                                    int var143;
                                    int var144;
                                    if (var142 >= 0) {
                                        var143 = Statics.field1758.method2197(var142);
                                        var144 = -1;
                                    } else if (var141.field930 == 16711935) {
                                        var144 = -2;
                                        var142 = -1;
                                        var143 = -2;
                                    } else {
                                        var144 = class9.method807(var141.field926, var141.field933, var141.field937);
                                        int var145 = class9.field140 + var141.field926 & 0xFF;
                                        int var146 = class9.field141 + var141.field937;
                                        if (var146 < 0) {
                                            var146 = 0;
                                        } else if (var146 > 255) {
                                            var146 = 255;
                                        }
                                        var143 = class9.method807(var145, var141.field933, var146);
                                    }
                                    int var147 = 0;
                                    if (var143 != -2) {
                                        var147 = class103.field1746[class9.method43(var143, 96)];
                                    }
                                    if (var141.field939 != -1) {
                                        int var148 = class9.field140 + var141.field934 & 0xFF;
                                        int var149 = class9.field141 + var141.field936;
                                        if (var149 < 0) {
                                            var149 = 0;
                                        } else if (var149 > 255) {
                                            var149 = 255;
                                        }
                                        int var150 = class9.method807(var148, var141.field935, var149);
                                        var147 = class103.field1746[class9.method43(var150, 96)];
                                    }
                                    var83.method1862(var89, var104, var117, var139, var140, var142, var122, var123, var124, var125, class9.method2952(var130, var126), class9.method2952(var130, var127), class9.method2952(var130, var128), class9.method2952(var130, var129), class9.method43(var144, var126), class9.method43(var144, var127), class9.method43(var144, var128), class9.method43(var144, var129), var138, var147);
                                }
                            }
                        }
                    }
                }
            }
            for (int var151 = 1; var151 < 103; var151++) {
                for (int var152 = 1; var152 < 103; var152++) {
                    var83.method1920(var89, var152, var151, class9.method126(var89, var152, var151));
                }
            }
            Statics.field127[var89] = (byte[][]) null;
            Statics.field128[var89] = (byte[][]) null;
            Statics.field129[var89] = (byte[][]) null;
            Statics.field147[var89] = (byte[][]) null;
            Statics.field280[var89] = (byte[][]) null;
        }
        var83.method1887(-50, -10, -50);
        for (int var153 = 0; var153 < 104; var153++) {
            for (int var154 = 0; var154 < 104; var154++) {
                if ((class9.field135[1][var153][var154] & 0x2) == 2) {
                    var83.method1924(var153, var154);
                }
            }
        }
        int var155 = 1;
        int var156 = 2;
        int var157 = 4;
        for (int var158 = 0; var158 < 4; var158++) {
            if (var158 > 0) {
                var155 <<= 0x3;
                var156 <<= 0x3;
                var157 <<= 0x3;
            }
            for (int var159 = 0; var159 <= var158; var159++) {
                for (int var160 = 0; var160 <= 104; var160++) {
                    for (int var161 = 0; var161 <= 104; var161++) {
                        if ((Statics.field2329[var159][var161][var160] & var155) != 0) {
                            int var162 = var160;
                            int var163 = var160;
                            int var164 = var159;
                            int var165 = var159;
                            while (var162 > 0 && (Statics.field2329[var159][var161][var162 - 1] & var155) != 0) {
                                var162--;
                            }
                            while (var163 < 104 && (Statics.field2329[var159][var161][var163 + 1] & var155) != 0) {
                                var163++;
                            }
                            label609: while (var164 > 0) {
                                for (int var166 = var162; var166 <= var163; var166++) {
                                    if ((Statics.field2329[var164 - 1][var161][var166] & var155) == 0) {
                                        break label609;
                                    }
                                }
                                var164--;
                            }
                            label598: while (var165 < var158) {
                                for (int var167 = var162; var167 <= var163; var167++) {
                                    if ((Statics.field2329[var165 + 1][var161][var167] & var155) == 0) {
                                        break label598;
                                    }
                                }
                                var165++;
                            }
                            int var168 = (var165 + 1 - var164) * (var163 - var162 + 1);
                            if (var168 >= 8) {
                                short var169 = 240;
                                int var170 = class9.field137[var165][var161][var162] - var169;
                                int var171 = class9.field137[var164][var161][var162];
                                class94.method1860(var158, 1, var161 * 128, var161 * 128, var162 * 128, var163 * 128 + 128, var170, var171);
                                for (int var172 = var164; var172 <= var165; var172++) {
                                    for (int var173 = var162; var173 <= var163; var173++) {
                                        Statics.field2329[var172][var161][var173] &= ~var155;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2329[var159][var161][var160] & var156) != 0) {
                            int var174 = var161;
                            int var175 = var161;
                            int var176 = var159;
                            int var177 = var159;
                            while (var174 > 0 && (Statics.field2329[var159][var174 - 1][var160] & var156) != 0) {
                                var174--;
                            }
                            while (var175 < 104 && (Statics.field2329[var159][var175 + 1][var160] & var156) != 0) {
                                var175++;
                            }
                            label662: while (var176 > 0) {
                                for (int var178 = var174; var178 <= var175; var178++) {
                                    if ((Statics.field2329[var176 - 1][var178][var160] & var156) == 0) {
                                        break label662;
                                    }
                                }
                                var176--;
                            }
                            label651: while (var177 < var158) {
                                for (int var179 = var174; var179 <= var175; var179++) {
                                    if ((Statics.field2329[var177 + 1][var179][var160] & var156) == 0) {
                                        break label651;
                                    }
                                }
                                var177++;
                            }
                            int var180 = (var177 + 1 - var176) * (var175 - var174 + 1);
                            if (var180 >= 8) {
                                short var181 = 240;
                                int var182 = class9.field137[var177][var174][var160] - var181;
                                int var183 = class9.field137[var176][var174][var160];
                                class94.method1860(var158, 2, var174 * 128, var175 * 128 + 128, var160 * 128, var160 * 128, var182, var183);
                                for (int var184 = var176; var184 <= var177; var184++) {
                                    for (int var185 = var174; var185 <= var175; var185++) {
                                        Statics.field2329[var184][var185][var160] &= ~var156;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2329[var159][var161][var160] & var157) != 0) {
                            int var186 = var161;
                            int var187 = var161;
                            int var188 = var160;
                            int var189 = var160;
                            while (var188 > 0 && (Statics.field2329[var159][var161][var188 - 1] & var157) != 0) {
                                var188--;
                            }
                            while (var189 < 104 && (Statics.field2329[var159][var161][var189 + 1] & var157) != 0) {
                                var189++;
                            }
                            label715: while (var186 > 0) {
                                for (int var190 = var188; var190 <= var189; var190++) {
                                    if ((Statics.field2329[var159][var186 - 1][var190] & var157) == 0) {
                                        break label715;
                                    }
                                }
                                var186--;
                            }
                            label704: while (var187 < 104) {
                                for (int var191 = var188; var191 <= var189; var191++) {
                                    if ((Statics.field2329[var159][var187 + 1][var191] & var157) == 0) {
                                        break label704;
                                    }
                                }
                                var187++;
                            }
                            if ((var187 - var186 + 1) * (var189 - var188 + 1) >= 4) {
                                int var192 = class9.field137[var159][var186][var188];
                                class94.method1860(var158, 4, var186 * 128, var187 * 128 + 128, var188 * 128, var189 * 128 + 128, var192, var192);
                                for (int var193 = var186; var193 <= var187; var193++) {
                                    for (int var194 = var188; var194 <= var189; var194++) {
                                        Statics.field2329[var159][var193][var194] &= ~var157;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method64(true);
        int var195 = class9.field126;
        if (var195 > Statics.field2050) {
            var195 = Statics.field2050;
        }
        if (var195 < Statics.field2050 - 1) {
            int var196 = Statics.field2050 - 1;
        }
        if (field472) {
            Statics.field529.method1858(class9.field126);
        } else {
            Statics.field529.method1858(0);
        }
        for (int var197 = 0; var197 < 104; var197++) {
            for (int var198 = 0; var198 < 104; var198++) {
                method13(var197, var198);
            }
        }
        method168();
        method119();
        class31.field812.method3261();
        if (Statics.field938 != null) {
            field499.method2322(191);
            field499.method2551(1057001181);
        }
        if (!field623) {
            int var199 = (Statics.field917 - 6) / 8;
            int var200 = (Statics.field917 + 6) / 8;
            int var201 = (Statics.field300 - 6) / 8;
            int var202 = (Statics.field300 + 6) / 8;
            for (int var203 = var199 - 1; var203 <= var200 + 1; var203++) {
                for (int var204 = var201 - 1; var204 <= var202 + 1; var204++) {
                    if (var203 < var199 || var203 > var200 || var204 < var201 || var204 > var202) {
                        Statics.field549.method2984("m" + var203 + "_" + var204);
                        Statics.field549.method2984("l" + var203 + "_" + var204);
                    }
                }
            }
        }
        method138(30);
        method168();
        class9.method2680();
        field499.method2322(200);
        class72.method128();
    }

    @ObfuscatedName("aj.am(IIIIII)V")
    public static final void method806(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field529.method1896(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field529.method1876(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field56.field1446;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class31 var13 = class31.method132(var12);
            if (var13.field808 == -1) {
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
                class86 var14 = Statics.field247[var13.field808];
                if (var14 != null) {
                    int var15 = (var13.field852 * 4 - var14.field1456) / 2;
                    int var16 = (var13.field840 * 4 - var14.field1457) / 2;
                    var14.method1777(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field840) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field529.method1884(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field529.method1876(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class31 var22 = class31.method132(var21);
            if (var22.field808 != -1) {
                class86 var23 = Statics.field247[var22.field808];
                if (var23 != null) {
                    int var24 = (var22.field852 * 4 - var23.field1456) / 2;
                    int var25 = (var22.field840 * 4 - var23.field1457) / 2;
                    var23.method1777(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field840) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field56.field1446;
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
        int var29 = Statics.field529.method1910(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class31 var31 = class31.method132(var30);
        if (var31.field808 == -1) {
            return;
        }
        class86 var32 = Statics.field247[var31.field808];
        if (var32 != null) {
            int var33 = (var31.field852 * 4 - var32.field1456) / 2;
            int var34 = (var31.field840 * 4 - var32.field1457) / 2;
            var32.method1777(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field840) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bq.ae(IIII)Z")
    public static final boolean method1309(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field529.method1876(Statics.field2050, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class31 var7 = class31.method132(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field852;
                var9 = var7.field840;
            } else {
                var8 = var7.field840;
                var9 = var7.field852;
            }
            int var10 = var7.field847;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field642 = class76.field1374;
        field693 = class76.field1377;
        field470 = 2;
        field581 = 0;
        return true;
    }

    @ObfuscatedName("bq.at(IIIIZIIIIIII)Z")
    public static final boolean method1307(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field573[var11][var12] = 0;
                field709[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field573[arg0][arg1] = 99;
        field709[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field537[var15] = arg0;
        int var36 = var15 + 1;
        field595[var15] = arg1;
        boolean var17 = false;
        int var18 = field537.length;
        int[][] var19 = field530[Statics.field2050].field2729;
        while (var36 != var16) {
            var13 = field537[var16];
            var14 = field595[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field530[Statics.field2050].method3249(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field530[Statics.field2050].method3219(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field530[Statics.field2050].method3221(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field709[var13][var14] + 1;
            if (var13 > 0 && field573[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field537[var36] = var13 - 1;
                field595[var36] = var14;
                var36 = (var36 + 1) % var18;
                field573[var13 - 1][var14] = 2;
                field709[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field573[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field537[var36] = var13 + 1;
                field595[var36] = var14;
                var36 = (var36 + 1) % var18;
                field573[var13 + 1][var14] = 8;
                field709[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field573[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field537[var36] = var13;
                field595[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field573[var13][var14 - 1] = 1;
                field709[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field573[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field537[var36] = var13;
                field595[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field573[var13][var14 + 1] = 4;
                field709[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field573[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field537[var36] = var13 - 1;
                field595[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field573[var13 - 1][var14 - 1] = 3;
                field709[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field573[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field537[var36] = var13 + 1;
                field595[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field573[var13 + 1][var14 - 1] = 9;
                field709[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field573[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field537[var36] = var13 - 1;
                field595[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field573[var13 - 1][var14 + 1] = 6;
                field709[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field573[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field537[var36] = var13 + 1;
                field595[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field573[var13 + 1][var14 + 1] = 12;
                field709[var13 + 1][var14 + 1] = var20;
            }
        }
        field534 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field709[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field709[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field709[var24][var25];
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
            field534 = 1;
        }
        byte var29 = 0;
        field537[var29] = var13;
        int var37 = var29 + 1;
        field595[var29] = var14;
        int var30;
        int var31 = var30 = field573[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field537[var37] = var13;
                field595[var37++] = var14;
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
            var31 = field573[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field537[var37];
            int var34 = field595[var37];
            if (arg10 == 0) {
                field499.method2322(189);
                field499.method2554(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field499.method2322(224);
                field499.method2554(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field499.method2322(72);
                field499.method2554(var32 + var32 + 3);
            }
            field499.method2477(Statics.field176 + var33);
            field499.method2554(class74.field1356[82] ? 1 : 0);
            field499.method2477(Statics.field1999 + var34);
            field704 = field537[0];
            field705 = field595[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field499.method2469(field537[var37] - var33);
                field499.method2554(field595[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dc.ar(B)V")
    public static final void method2674() {
        if (field515 == 28) {
            int var0 = field513.method2462();
            int var1 = (var0 >> 4 & 0x7) + Statics.field944;
            int var2 = (var0 & 0x7) + Statics.field385;
            int var3 = field513.method2480();
            int var4 = field513.method2473();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field533[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method759(Statics.field2050, var1, var2, var7, var3, var5, var6, 0, -1);
            }
        } else if (field515 == 218) {
            int var8 = field513.method2559();
            int var9 = (var8 >> 4 & 0x7) + Statics.field944;
            int var10 = (var8 & 0x7) + Statics.field385;
            int var11 = field513.method2450();
            int var12 = field513.method2450();
            int var13 = field513.method2450();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                class176 var14 = field590[Statics.field2050][var9][var10];
                if (var14 != null) {
                    for (class16 var15 = (class16) var14.method3326(); var15 != null; var15 = (class16) var14.method3330()) {
                        if ((var11 & 0x7FFF) == var15.field260 && var15.field254 == var12) {
                            var15.field254 = var13;
                            break;
                        }
                    }
                    method13(var9, var10);
                }
            }
        } else if (field515 == 19) {
            int var16 = field513.method2559();
            int var17 = (var16 >> 4 & 0x7) + Statics.field944;
            int var18 = (var16 & 0x7) + Statics.field385;
            int var19 = field513.method2479();
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class176 var20 = field590[Statics.field2050][var17][var18];
                if (var20 != null) {
                    for (class16 var21 = (class16) var20.method3326(); var21 != null; var21 = (class16) var20.method3330()) {
                        if ((var19 & 0x7FFF) == var21.field260) {
                            var21.method3357();
                            break;
                        }
                    }
                    if (var20.method3326() == null) {
                        field590[Statics.field2050][var17][var18] = null;
                    }
                    method13(var17, var18);
                }
            }
        } else if (field515 == 31) {
            int var22 = field513.method2479();
            int var23 = field513.method2559();
            int var24 = (var23 >> 4 & 0x7) + Statics.field944;
            int var25 = (var23 & 0x7) + Statics.field385;
            int var26 = field513.method2479();
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                class16 var27 = new class16();
                var27.field260 = var22;
                var27.field254 = var26;
                if (field590[Statics.field2050][var24][var25] == null) {
                    field590[Statics.field2050][var24][var25] = new class176();
                }
                field590[Statics.field2050][var24][var25].method3323(var27);
                method13(var24, var25);
            }
        } else if (field515 == 67) {
            int var28 = field513.method2559();
            int var29 = (var28 >> 4 & 0x7) + Statics.field944;
            int var30 = (var28 & 0x7) + Statics.field385;
            int var31 = field513.method2450();
            int var32 = field513.method2559();
            int var33 = field513.method2450();
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                int var34 = var29 * 128 + 64;
                int var35 = var30 * 128 + 64;
                class19 var36 = new class19(var31, Statics.field2050, var34, var35, method5(var34, var35, Statics.field2050) - var32, var33, field477);
                field667.method3323(var36);
            }
        } else if (field515 == 24) {
            int var37 = field513.method2450();
            int var38 = field513.method2559();
            int var39 = var38 >> 2;
            int var40 = var38 & 0x3;
            int var41 = field533[var39];
            int var42 = field513.method2559();
            int var43 = (var42 >> 4 & 0x7) + Statics.field944;
            int var44 = (var42 & 0x7) + Statics.field385;
            if (var43 >= 0 && var44 >= 0 && var43 < 103 && var44 < 103) {
                if (var41 == 0) {
                    class95 var45 = Statics.field529.method1878(Statics.field2050, var43, var44);
                    if (var45 != null) {
                        int var46 = var45.field1596 >> 14 & 0x7FFF;
                        if (var39 == 2) {
                            var45.field1594 = new class13(var46, 2, var40 + 4, Statics.field2050, var43, var44, var37, false, var45.field1594);
                            var45.field1595 = new class13(var46, 2, var40 + 1 & 0x3, Statics.field2050, var43, var44, var37, false, var45.field1595);
                        } else {
                            var45.field1594 = new class13(var46, var39, var40, Statics.field2050, var43, var44, var37, false, var45.field1594);
                        }
                    }
                }
                if (var41 == 1) {
                    class107 var47 = Statics.field529.method1879(Statics.field2050, var43, var44);
                    if (var47 != null) {
                        int var48 = var47.field1788 >> 14 & 0x7FFF;
                        if (var39 == 4 || var39 == 5) {
                            var47.field1787 = new class13(var48, 4, var40, Statics.field2050, var43, var44, var37, false, var47.field1787);
                        } else if (var39 == 6) {
                            var47.field1787 = new class13(var48, 4, var40 + 4, Statics.field2050, var43, var44, var37, false, var47.field1787);
                        } else if (var39 == 7) {
                            var47.field1787 = new class13(var48, 4, (var40 + 2 & 0x3) + 4, Statics.field2050, var43, var44, var37, false, var47.field1787);
                        } else if (var39 == 8) {
                            var47.field1787 = new class13(var48, 4, var40 + 4, Statics.field2050, var43, var44, var37, false, var47.field1787);
                            var47.field1786 = new class13(var48, 4, (var40 + 2 & 0x3) + 4, Statics.field2050, var43, var44, var37, false, var47.field1786);
                        }
                    }
                }
                if (var41 == 2) {
                    class97 var49 = Statics.field529.method1880(Statics.field2050, var43, var44);
                    if (var39 == 11) {
                        var39 = 10;
                    }
                    if (var49 != null) {
                        var49.field1613 = new class13(var49.field1623 >> 14 & 0x7FFF, var39, var40, Statics.field2050, var43, var44, var37, false, var49.field1613);
                    }
                }
                if (var41 == 3) {
                    class106 var50 = Statics.field529.method1875(Statics.field2050, var43, var44);
                    if (var50 != null) {
                        var50.field1778 = new class13(var50.field1773 >> 14 & 0x7FFF, 22, var40, Statics.field2050, var43, var44, var37, false, var50.field1778);
                    }
                }
            }
        } else if (field515 == 238) {
            int var51 = field513.method2559();
            int var52 = (var51 >> 4 & 0x7) + Statics.field944;
            int var53 = (var51 & 0x7) + Statics.field385;
            int var54 = var52 + field513.method2449();
            int var55 = var53 + field513.method2449();
            int var56 = field513.method2487();
            int var57 = field513.method2450();
            int var58 = field513.method2559() * 4;
            int var59 = field513.method2559() * 4;
            int var60 = field513.method2450();
            int var61 = field513.method2450();
            int var62 = field513.method2559();
            int var63 = field513.method2559();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var57 != 65535) {
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                int var67 = var55 * 128 + 64;
                class10 var68 = new class10(var57, Statics.field2050, var64, var65, method5(var64, var65, Statics.field2050) - var58, field477 + var60, field477 + var61, var62, var63, var56, var59);
                var68.method109(var66, var67, method5(var66, var67, Statics.field2050) - var59, field477 + var60);
                field608.method3323(var68);
            }
        } else {
            if (field515 == 45) {
                int var69 = field513.method2480();
                int var70 = field513.method2478();
                byte var71 = field513.method2449();
                byte var72 = field513.method2449();
                byte var73 = field513.method2474();
                byte var74 = field513.method2449();
                int var75 = field513.method2473();
                int var76 = var75 >> 2;
                int var77 = var75 & 0x3;
                int var78 = field533[var76];
                int var79 = field513.method2478();
                int var80 = field513.method2450();
                int var81 = field513.method2473();
                int var82 = (var81 >> 4 & 0x7) + Statics.field944;
                int var83 = (var81 & 0x7) + Statics.field385;
                class3 var84;
                if (field635 == var70) {
                    var84 = Statics.field1242;
                } else {
                    var84 = field592[var70];
                }
                if (var84 != null) {
                    class31 var85 = class31.method132(var79);
                    int var86;
                    int var87;
                    if (var77 == 1 || var77 == 3) {
                        var86 = var85.field840;
                        var87 = var85.field852;
                    } else {
                        var86 = var85.field852;
                        var87 = var85.field840;
                    }
                    int var88 = (var86 >> 1) + var82;
                    int var89 = (var86 + 1 >> 1) + var82;
                    int var90 = (var87 >> 1) + var83;
                    int var91 = (var87 + 1 >> 1) + var83;
                    int[][] var92 = class9.field137[Statics.field2050];
                    int var93 = var92[var88][var90] + var92[var89][var90] + var92[var88][var91] + var92[var89][var91] >> 2;
                    int var94 = (var82 << 7) + (var86 << 6);
                    int var95 = (var83 << 7) + (var87 << 6);
                    class111 var96 = var85.method638(var76, var77, var92, var94, var93, var95);
                    if (var96 != null) {
                        method759(Statics.field2050, var82, var83, var78, -1, 0, 0, var69 + 1, var80 + 1);
                        var84.field51 = field477 + var69;
                        var84.field33 = field477 + var80;
                        var84.field45 = var96;
                        var84.field43 = var82 * 128 + var86 * 64;
                        var84.field44 = var83 * 128 + var87 * 64;
                        var84.field50 = var93;
                        if (var71 > var72) {
                            byte var97 = var71;
                            var71 = var72;
                            var72 = var97;
                        }
                        if (var74 > var73) {
                            byte var98 = var74;
                            var74 = var73;
                            var73 = var98;
                        }
                        var84.field46 = var71 + var82;
                        var84.field48 = var72 + var82;
                        var84.field47 = var74 + var83;
                        var84.field52 = var73 + var83;
                    }
                }
            }
            if (field515 == 135) {
                int var99 = field513.method2471();
                int var100 = var99 >> 2;
                int var101 = var99 & 0x3;
                int var102 = field533[var100];
                int var103 = field513.method2473();
                int var104 = (var103 >> 4 & 0x7) + Statics.field944;
                int var105 = (var103 & 0x7) + Statics.field385;
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    method759(Statics.field2050, var104, var105, var102, -1, var100, var101, 0, -1);
                }
            } else {
                if (field515 == 184) {
                    int var106 = field513.method2559();
                    int var107 = (var106 >> 4 & 0x7) + Statics.field944;
                    int var108 = (var106 & 0x7) + Statics.field385;
                    int var109 = field513.method2450();
                    int var110 = field513.method2559();
                    int var111 = var110 >> 4 & 0xF;
                    int var112 = var110 & 0x7;
                    int var113 = field513.method2559();
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                        int var114 = var111 + 1;
                        if (Statics.field1242.field458[0] >= var107 - var114 && Statics.field1242.field458[0] <= var107 + var114 && Statics.field1242.field421[0] >= var108 - var114 && Statics.field1242.field421[0] <= var108 + var114 && field711 != 0 && var112 > 0 && field712 < 50) {
                            field713[field712] = var109;
                            field674[field712] = var112;
                            field715[field712] = var113;
                            field717[field712] = null;
                            field557[field712] = (var107 << 16) + (var108 << 8) + var111;
                            field712++;
                        }
                    }
                }
                if (field515 == 235) {
                    int var115 = field513.method2480();
                    int var116 = field513.method2559();
                    int var117 = (var116 >> 4 & 0x7) + Statics.field944;
                    int var118 = (var116 & 0x7) + Statics.field385;
                    int var119 = field513.method2480();
                    int var120 = field513.method2479();
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && field635 != var120) {
                        class16 var121 = new class16();
                        var121.field260 = var115;
                        var121.field254 = var119;
                        if (field590[Statics.field2050][var117][var118] == null) {
                            field590[Statics.field2050][var117][var118] = new class176();
                        }
                        field590[Statics.field2050][var117][var118].method3323(var121);
                        method13(var117, var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.bj(IIIIIIIIII)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var9 = null;
        for (class21 var10 = (class21) field662.method3326(); var10 != null; var10 = (class21) field662.method3330()) {
            if (var10.field345 == arg0 && var10.field346 == arg1 && var10.field347 == arg2 && var10.field349 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class21();
            var9.field345 = arg0;
            var9.field349 = arg3;
            var9.field346 = arg1;
            var9.field347 = arg2;
            method127(var9);
            field662.method3323(var9);
        }
        var9.field358 = arg4;
        var9.field353 = arg5;
        var9.field352 = arg6;
        var9.field357 = arg7;
        var9.field355 = arg8;
    }

    @ObfuscatedName("l.bu(B)V")
    public static final void method119() {
        for (class21 var0 = (class21) field662.method3326(); var0 != null; var0 = (class21) field662.method3330()) {
            if (var0.field355 == -1) {
                var0.field357 = 0;
                method127(var0);
            } else {
                var0.method3357();
            }
        }
    }

    @ObfuscatedName("z.bh(Lf;B)V")
    public static final void method127(class21 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field349 == 0) {
            var1 = Statics.field529.method1896(arg0.field345, arg0.field346, arg0.field347);
        }
        if (arg0.field349 == 1) {
            var1 = Statics.field529.method1883(arg0.field345, arg0.field346, arg0.field347);
        }
        if (arg0.field349 == 2) {
            var1 = Statics.field529.method1884(arg0.field345, arg0.field346, arg0.field347);
        }
        if (arg0.field349 == 3) {
            var1 = Statics.field529.method1910(arg0.field345, arg0.field346, arg0.field347);
        }
        if (var1 != 0) {
            int var5 = Statics.field529.method1876(arg0.field345, arg0.field346, arg0.field347, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field354 = var2;
        arg0.field350 = var3;
        arg0.field348 = var4;
    }

    @ObfuscatedName("dt.bt(B)V")
    public static final void method2207() {
        for (class21 var0 = (class21) field662.method3326(); var0 != null; var0 = (class21) field662.method3330()) {
            if (var0.field355 > 0) {
                var0.field355--;
            }
            if (var0.field355 != 0) {
                if (var0.field357 > 0) {
                    var0.field357--;
                }
                if (var0.field357 == 0 && var0.field346 >= 1 && var0.field347 >= 1 && var0.field346 <= 102 && var0.field347 <= 102 && (var0.field358 < 0 || class9.method2379(var0.field358, var0.field353))) {
                    method3141(var0.field345, var0.field349, var0.field346, var0.field347, var0.field358, var0.field352, var0.field353);
                    var0.field357 = -1;
                    if (var0.field358 == var0.field354 && var0.field354 == -1) {
                        var0.method3357();
                    } else if (var0.field358 == var0.field354 && var0.field352 == var0.field348 && var0.field353 == var0.field350) {
                        var0.method3357();
                    }
                }
            } else if (var0.field354 < 0 || class9.method2379(var0.field354, var0.field350)) {
                method3141(var0.field345, var0.field349, var0.field346, var0.field347, var0.field354, var0.field348, var0.field350);
                var0.method3357();
            }
        }
    }

    @ObfuscatedName("fz.bl(IIIIIIII)V")
    public static final void method3141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field472 && Statics.field2050 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field529.method1896(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field529.method1883(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field529.method1884(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field529.method1910(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field529.method1876(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field529.method1873(arg0, arg2, arg3);
                class31 var15 = class31.method132(var12);
                if (var15.field826 != 0) {
                    field530[arg0].method3215(arg2, arg3, var13, var14, var15.field827);
                }
            }
            if (arg1 == 1) {
                Statics.field529.method1874(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field529.method2014(arg0, arg2, arg3);
                class31 var16 = class31.method132(var12);
                if (var16.field852 + arg2 > 103 || var16.field852 + arg3 > 103 || var16.field840 + arg2 > 103 || var16.field840 + arg3 > 103) {
                    return;
                }
                if (var16.field826 != 0) {
                    field530[arg0].method3216(arg2, arg3, var16.field852, var16.field840, var14, var16.field827);
                }
            }
            if (arg1 == 3) {
                Statics.field529.method1991(arg0, arg2, arg3);
                class31 var17 = class31.method132(var12);
                if (var17.field826 == 1) {
                    field530[arg0].method3239(arg2, arg3);
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
        class9.method116(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field529, field530[arg0]);
    }

    @ObfuscatedName("k.bw(III)V")
    public static final void method13(int arg0, int arg1) {
        class176 var2 = field590[Statics.field2050][arg0][arg1];
        if (var2 == null) {
            Statics.field529.method1882(Statics.field2050, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class16 var4 = null;
        for (class16 var5 = (class16) var2.method3326(); var5 != null; var5 = (class16) var2.method3330()) {
            class39 var6 = class39.method525(var5.field260);
            int var7 = var6.field982;
            if (var6.field975 == 1) {
                var7 = (var5.field254 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field529.method1882(Statics.field2050, arg0, arg1);
            return;
        }
        var2.method3324(var4);
        class16 var8 = null;
        class16 var9 = null;
        for (class16 var10 = (class16) var2.method3326(); var10 != null; var10 = (class16) var2.method3330()) {
            if (var4.field260 != var10.field260) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field260 != var10.field260 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field529.method1864(Statics.field2050, arg0, arg1, method5(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2050), var4, var11, var8, var9);
    }

    @ObfuscatedName("z.bi(I)V")
    public static final void method130() {
        int var0 = field513.method2319(8);
        if (var0 < field593) {
            for (int var1 = var0; var1 < field593; var1++) {
                field601[++field600 - 1] = field594[var1];
            }
        }
        if (var0 > field593) {
            throw new RuntimeException("");
        }
        field593 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field594[var2];
            class3 var4 = field592[var3];
            int var5 = field513.method2319(1);
            if (var5 == 0) {
                field594[++field593 - 1] = var3;
                var4.field453 = field477;
            } else {
                int var6 = field513.method2319(2);
                if (var6 == 0) {
                    field594[++field593 - 1] = var3;
                    var4.field453 = field477;
                    field596[++field613 - 1] = var3;
                } else if (var6 == 1) {
                    field594[++field593 - 1] = var3;
                    var4.field453 = field477;
                    int var7 = field513.method2319(3);
                    var4.method229(var7, false);
                    int var8 = field513.method2319(1);
                    if (var8 == 1) {
                        field596[++field613 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field594[++field593 - 1] = var3;
                    var4.field453 = field477;
                    int var9 = field513.method2319(3);
                    var4.method229(var9, true);
                    int var10 = field513.method2319(3);
                    var4.method229(var10, true);
                    int var11 = field513.method2319(1);
                    if (var11 == 1) {
                        field596[++field613 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field601[++field600 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dk.bn(B)V")
    public static final void method2430() {
        for (int var0 = 0; var0 < field613; var0++) {
            int var1 = field596[var0];
            class24 var2 = field584[var1];
            int var3 = field513.method2559();
            if ((var3 & 0x1) != 0) {
                int var4 = field513.method2462();
                int var5 = field513.method2559();
                var2.method231(var4, var5, field477);
                var2.field426 = field477 + 300;
                var2.field427 = field513.method2462();
                var2.field428 = field513.method2462();
            }
            if ((var3 & 0x80) != 0) {
                int var6 = field513.method2480();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field513.method2462();
                if (var2.field456 == var6 && var6 != -1) {
                    int var8 = Statics.method147(var6).field886;
                    if (var8 == 1) {
                        var2.field436 = 0;
                        var2.field435 = 0;
                        var2.field438 = var7;
                        var2.field424 = 0;
                    }
                    if (var8 == 2) {
                        var2.field424 = 0;
                    }
                } else if (var6 == -1 || var2.field456 == -1 || Statics.method147(var6).field873 >= Statics.method147(var2.field456).field873) {
                    var2.field456 = var6;
                    var2.field436 = 0;
                    var2.field435 = 0;
                    var2.field438 = var7;
                    var2.field424 = 0;
                    var2.field462 = var2.field457;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field416 = field513.method2478();
                var2.field431 = field513.method2480();
            }
            if ((var3 & 0x10) != 0) {
                var2.field429 = field513.method2480();
                if (var2.field429 == 65535) {
                    var2.field429 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field415 = field513.method2478();
                int var9 = field513.method2451();
                var2.field450 = var9 >> 16;
                var2.field443 = (var9 & 0xFFFF) + field477;
                var2.field441 = 0;
                var2.field442 = 0;
                if (var2.field443 > field477) {
                    var2.field441 = -1;
                }
                if (var2.field415 == 65535) {
                    var2.field415 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field419 = field513.method2630();
                var2.field423 = 100;
            }
            if ((var3 & 0x8) != 0) {
                var2.field384 = Statics.method202(field513.method2478());
                var2.field410 = var2.field384.field772;
                var2.field463 = var2.field384.field795;
                var2.field414 = var2.field384.field776;
                var2.field459 = var2.field384.field779;
                var2.field452 = var2.field384.field780;
                var2.field406 = var2.field384.field781;
                var2.field445 = var2.field384.field768;
                var2.field412 = var2.field384.field775;
                var2.field413 = var2.field384.field777;
            }
            if ((var3 & 0x40) != 0) {
                int var10 = field513.method2559();
                int var11 = field513.method2473();
                var2.method231(var10, var11, field477);
                var2.field426 = field477 + 300;
                var2.field427 = field513.method2462();
                var2.field428 = field513.method2462();
            }
        }
    }

    @ObfuscatedName("bu.bp(IIIII)V")
    public static final void method1229(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field673; var4++) {
            if (field680[var4] + field678[var4] > arg0 && field678[var4] < arg0 + arg2 && field681[var4] + field679[var4] > arg1 && field679[var4] < arg1 + arg3) {
                field675[var4] = true;
            }
        }
    }

    @ObfuscatedName("at.bb(IIIIB)V")
    public static final void method1150(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field673; var4++) {
            if (field680[var4] + field678[var4] > arg0 && field678[var4] < arg0 + arg2 && field681[var4] + field679[var4] > arg1 && field679[var4] < arg1 + arg3) {
                field676[var4] = true;
            }
        }
    }

    @ObfuscatedName("v.bg(S)V")
    public static final void method173() {
        int var0 = Statics.field106.method3389(class133.field2209);
        for (int var1 = 0; var1 < field615; var1++) {
            int var2 = Statics.field106.method3389(method1477(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field615 * 15 + 21;
        int var4 = class76.field1374 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class76.field1377;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field628 = true;
        Statics.field177 = var4;
        Statics.field1250 = var5;
        Statics.field1279 = var0;
        Statics.field251 = field615 * 15 + 22;
    }

    @ObfuscatedName("p.br(II)V")
    public static final void method223(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field616[arg0];
        int var2 = field617[arg0];
        int var3 = field728[arg0];
        int var4 = field619[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 42) {
            field499.method2322(145);
            field499.method2448(var2);
            field499.method2477(var4);
            field499.method2533(var1);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 48) {
            class3 var5 = field592[var4];
            if (var5 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var5.field458[0], var5.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(43);
                field499.method2533(var4);
            }
        }
        if (var3 == 34) {
            field499.method2322(0);
            field499.method2448(var2);
            field499.method2460(var4);
            field499.method2533(var1);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 18) {
            boolean var6 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var6) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(177);
            field499.method2460(Statics.field1999 + var2);
            field499.method2435(var4);
            field499.method2533(Statics.field176 + var1);
        }
        if (var3 == 12) {
            class24 var8 = field584[var4];
            if (var8 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var8.field458[0], var8.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(53);
                field499.method2533(var4);
            }
        }
        if (var3 == 32) {
            field499.method2322(108);
            field499.method2551(var2);
            field499.method2435(var1);
            field499.method2448(Statics.field2317);
            field499.method2533(field629);
            field499.method2477(var4);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 1002) {
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(60);
            field499.method2435(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 23) {
            Statics.field529.method1893(Statics.field2050, var1, var2);
        }
        if (var3 == 11) {
            class24 var9 = field584[var4];
            if (var9 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var9.field458[0], var9.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(12);
                field499.method2435(var4);
            }
        }
        if (var3 == 38) {
            method3();
            class157 var10 = class157.method2230(var2);
            field626 = 1;
            Statics.field301 = var1;
            Statics.field748 = var2;
            Statics.field299 = var4;
            method1523(var10);
            field627 = class2.method877(16748608) + class39.method525(var4).field969 + class2.method877(16777215);
            if (field627 == null) {
                field627 = "null";
            }
            return;
        }
        if (var3 == 24) {
            class157 var11 = class157.method2230(var2);
            boolean var12 = true;
            if (var11.field2675 > 0) {
                var12 = method2131(var11);
            }
            if (var12) {
                field499.method2322(153);
                field499.method2551(var2);
            }
        }
        if (var3 == 14) {
            class3 var13 = field592[var4];
            if (var13 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var13.field458[0], var13.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(77);
                field499.method2435(Statics.field301);
                field499.method2448(Statics.field748);
                field499.method2460(Statics.field299);
                field499.method2477(var4);
            }
        }
        if (var3 == 20) {
            boolean var14 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var14) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(124);
            field499.method2435(Statics.field176 + var1);
            field499.method2533(Statics.field1999 + var2);
            field499.method2533(var4);
        }
        if (var3 == 21) {
            boolean var16 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var16) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(39);
            field499.method2460(Statics.field1999 + var2);
            field499.method2435(Statics.field176 + var1);
            field499.method2435(var4);
        }
        if (var3 == 5) {
            method1309(var1, var2, var4);
            field499.method2322(52);
            field499.method2533(Statics.field1999 + var2);
            field499.method2460(Statics.field176 + var1);
            field499.method2477(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 28) {
            field499.method2322(153);
            field499.method2551(var2);
            class157 var18 = class157.method2230(var2);
            if (var18.field2679 != null && var18.field2679[0][0] == 5) {
                int var19 = var18.field2679[0][1];
                class158.field2687[var19] = 1 - class158.field2687[var19];
                method172(var19);
            }
        }
        if (var3 == 46) {
            class3 var20 = field592[var4];
            if (var20 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var20.field458[0], var20.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(119);
                field499.method2435(var4);
            }
        }
        if (var3 == 43) {
            field499.method2322(144);
            field499.method2477(var4);
            field499.method2460(var1);
            field499.method2448(var2);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 30 && field607 == null) {
            field499.method2322(214);
            field499.method2435(var1);
            field499.method2448(var2);
            field607 = class157.method2813(var2, var1);
            method1523(field607);
        }
        if (var3 == 51) {
            class3 var21 = field592[var4];
            if (var21 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var21.field458[0], var21.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(99);
                field499.method2477(var4);
            }
        }
        if (var3 == 47) {
            class3 var22 = field592[var4];
            if (var22 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var22.field458[0], var22.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(243);
                field499.method2477(var4);
            }
        }
        if (var3 == 2 && method1309(var1, var2, var4)) {
            field499.method2322(249);
            field499.method2477(Statics.field176 + var1);
            field499.method2485(Statics.field2317);
            field499.method2477(var4 >> 14 & 0x7FFF);
            field499.method2460(field629);
            field499.method2435(Statics.field1999 + var2);
        }
        if (var3 == 19) {
            boolean var23 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var23) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(61);
            field499.method2435(Statics.field1999 + var2);
            field499.method2533(Statics.field176 + var1);
            field499.method2533(var4);
        }
        if (var3 == 7) {
            class24 var25 = field584[var4];
            if (var25 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var25.field458[0], var25.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(173);
                field499.method2435(var4);
                field499.method2477(Statics.field301);
                field499.method2477(Statics.field299);
                field499.method2485(Statics.field748);
            }
        }
        if (var3 == 26) {
            method145();
        }
        if (var3 == 1005) {
            class157 var26 = class157.method2230(var2);
            if (var26 == null || var26.field2670[var1] < 100000) {
                field499.method2322(152);
                field499.method2460(var4);
            } else {
                method208(0, "", var26.field2670[var1] + " x " + class39.method525(var4).field969);
            }
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 13) {
            class24 var27 = field584[var4];
            if (var27 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var27.field458[0], var27.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(34);
                field499.method2533(var4);
            }
        }
        if (var3 == 39) {
            field499.method2322(150);
            field499.method2485(var2);
            field499.method2435(var1);
            field499.method2435(var4);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 10) {
            class24 var28 = field584[var4];
            if (var28 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var28.field458[0], var28.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(196);
                field499.method2460(var4);
            }
        }
        if (var3 == 25) {
            class157 var29 = class157.method2813(var2, var1);
            if (var29 != null) {
                method3();
                int var32 = method1599(var29);
                int var33 = var32 >> 11 & 0x3F;
                method2218(var2, var1, var33);
                field626 = 0;
                field630 = method670(var29);
                if (field630 == null) {
                    field630 = "Null";
                }
                if (var29.field2565) {
                    field631 = var29.field2627 + class2.method877(16777215);
                } else {
                    field631 = class2.method877(65280) + var29.field2667 + class2.method877(16777215);
                }
            }
            return;
        }
        if (var3 == 16) {
            boolean var34 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var34) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(57);
            field499.method2533(Statics.field301);
            field499.method2460(Statics.field1999 + var2);
            field499.method2460(Statics.field176 + var1);
            field499.method2460(var4);
            field499.method2435(Statics.field299);
            field499.method2448(Statics.field748);
        }
        if (var3 == 57 || var3 == 1007) {
            String var36 = field645[arg0];
            class157 var37 = class157.method2813(var2, var1);
            if (var37 != null) {
                if (var37.field2680 != null) {
                    class1 var38 = new class1();
                    var38.field15 = var37;
                    var38.field5 = var4;
                    var38.field9 = var36;
                    var38.field7 = var37.field2680;
                    class25.method2220(var38);
                }
                boolean var39 = true;
                if (var37.field2675 > 0) {
                    var39 = method2131(var37);
                }
                if (var39) {
                    int var40 = method1599(var37);
                    int var41 = var4 - 1;
                    boolean var42 = (var40 >> var41 + 1 & 0x1) != 0;
                    if (var42) {
                        if (var4 == 1) {
                            field499.method2322(9);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 2) {
                            field499.method2322(186);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 3) {
                            field499.method2322(128);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 4) {
                            field499.method2322(232);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 5) {
                            field499.method2322(58);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 6) {
                            field499.method2322(95);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 7) {
                            field499.method2322(225);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 8) {
                            field499.method2322(179);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 9) {
                            field499.method2322(25);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                        if (var4 == 10) {
                            field499.method2322(164);
                            field499.method2551(var2);
                            field499.method2435(var1);
                        }
                    }
                }
            }
        }
        if (var3 == 8) {
            class24 var43 = field584[var4];
            if (var43 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var43.field458[0], var43.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(51);
                field499.method2460(field629);
                field499.method2533(var4);
                field499.method2448(Statics.field2317);
            }
        }
        if (var3 == 31) {
            field499.method2322(121);
            field499.method2533(var1);
            field499.method2460(Statics.field299);
            field499.method2477(Statics.field301);
            field499.method2477(var4);
            field499.method2485(var2);
            field499.method2551(Statics.field748);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 37) {
            field499.method2322(143);
            field499.method2555(var2);
            field499.method2460(var4);
            field499.method2533(var1);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 40) {
            field499.method2322(212);
            field499.method2435(var1);
            field499.method2551(var2);
            field499.method2460(var4);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 1004) {
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(152);
            field499.method2460(var4);
        }
        if (var3 == 17) {
            boolean var44 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var44) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(81);
            field499.method2477(Statics.field1999 + var2);
            field499.method2533(Statics.field176 + var1);
            field499.method2555(Statics.field2317);
            field499.method2460(var4);
            field499.method2533(field629);
        }
        if (var3 == 1001) {
            method1309(var1, var2, var4);
            field499.method2322(170);
            field499.method2460(Statics.field176 + var1);
            field499.method2533(var4 >> 14 & 0x7FFF);
            field499.method2435(Statics.field1999 + var2);
        }
        if (var3 == 1003) {
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            class24 var46 = field584[var4];
            if (var46 != null) {
                class30 var47 = var46.field384;
                if (var47.field796 != null) {
                    var47 = var47.method582();
                }
                if (var47 != null) {
                    field499.method2322(190);
                    field499.method2435(var47.field791);
                }
            }
        }
        if (var3 == 36) {
            field499.method2322(236);
            field499.method2533(var4);
            field499.method2485(var2);
            field499.method2435(var1);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 33) {
            field499.method2322(97);
            field499.method2477(var4);
            field499.method2460(var1);
            field499.method2555(var2);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 35) {
            field499.method2322(113);
            field499.method2460(var1);
            field499.method2477(var4);
            field499.method2551(var2);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 49) {
            class3 var48 = field592[var4];
            if (var48 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var48.field458[0], var48.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(159);
                field499.method2477(var4);
            }
        }
        if (var3 == 41) {
            field499.method2322(100);
            field499.method2533(var1);
            field499.method2448(var2);
            field499.method2435(var4);
            field583 = 0;
            Statics.field1016 = class157.method2230(var2);
            field484 = var1;
        }
        if (var3 == 29) {
            field499.method2322(153);
            field499.method2551(var2);
            class157 var49 = class157.method2230(var2);
            if (var49.field2679 != null && var49.field2679[0][0] == 5) {
                int var50 = var49.field2679[0][1];
                if (class158.field2687[var50] != var49.field2574[0]) {
                    class158.field2687[var50] = var49.field2574[0];
                    method172(var50);
                }
            }
        }
        if (var3 == 6) {
            method1309(var1, var2, var4);
            field499.method2322(94);
            field499.method2477(var4 >> 14 & 0x7FFF);
            field499.method2533(Statics.field1999 + var2);
            field499.method2435(Statics.field176 + var1);
        }
        if (var3 == 9) {
            class24 var51 = field584[var4];
            if (var51 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var51.field458[0], var51.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(129);
                field499.method2477(var4);
            }
        }
        if (var3 == 50) {
            class3 var52 = field592[var4];
            if (var52 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var52.field458[0], var52.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(248);
                field499.method2435(var4);
            }
        }
        if (var3 == 22) {
            boolean var53 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var53) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field642 = class76.field1374;
            field693 = class76.field1377;
            field470 = 2;
            field581 = 0;
            field499.method2322(169);
            field499.method2435(var4);
            field499.method2533(Statics.field1999 + var2);
            field499.method2460(Statics.field176 + var1);
        }
        if (var3 == 45) {
            class3 var55 = field592[var4];
            if (var55 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var55.field458[0], var55.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(48);
                field499.method2477(var4);
            }
        }
        if (var3 == 4) {
            method1309(var1, var2, var4);
            field499.method2322(66);
            field499.method2460(Statics.field176 + var1);
            field499.method2435(var4 >> 14 & 0x7FFF);
            field499.method2460(Statics.field1999 + var2);
        }
        if (var3 == 3) {
            method1309(var1, var2, var4);
            field499.method2322(82);
            field499.method2533(Statics.field176 + var1);
            field499.method2477(var4 >> 14 & 0x7FFF);
            field499.method2460(Statics.field1999 + var2);
        }
        if (var3 == 1 && method1309(var1, var2, var4)) {
            field499.method2322(227);
            field499.method2533(Statics.field299);
            field499.method2477(Statics.field301);
            field499.method2533(Statics.field176 + var1);
            field499.method2533(var4 >> 14 & 0x7FFF);
            field499.method2551(Statics.field748);
            field499.method2435(Statics.field1999 + var2);
        }
        if (var3 == 58) {
            field499.method2322(10);
            field499.method2460(field629);
            field499.method2533(var1);
            field499.method2448(Statics.field2317);
            field499.method2555(var2);
        }
        if (var3 == 15) {
            class3 var56 = field592[var4];
            if (var56 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var56.field458[0], var56.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(247);
                field499.method2485(Statics.field2317);
                field499.method2435(field629);
                field499.method2435(var4);
            }
        }
        if (var3 == 44) {
            class3 var57 = field592[var4];
            if (var57 != null) {
                method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var57.field458[0], var57.field421[0], false, 0, 0, 1, 1, 0, 2);
                field642 = class76.field1374;
                field693 = class76.field1377;
                field470 = 2;
                field581 = 0;
                field499.method2322(168);
                field499.method2477(var4);
            }
        }
        if (field626 != 0) {
            field626 = 0;
            method1523(class157.method2230(Statics.field748));
        }
        if (field632) {
            method3();
        }
        if (Statics.field1016 != null && field583 == 0) {
            method1523(Statics.field1016);
        }
    }

    @ObfuscatedName("dx.by(IIIB)V")
    public static void method2218(int arg0, int arg1, int arg2) {
        class157 var3 = class157.method2813(arg0, arg1);
        if (var3 != null && var3.field2645 != null) {
            class1 var4 = new class1();
            var4.field15 = var3;
            var4.field7 = var3.field2645;
            class25.method2220(var4);
        }
        field632 = true;
        Statics.field2317 = arg0;
        field629 = arg1;
        Statics.field958 = arg2;
        method1523(var3);
    }

    @ObfuscatedName("u.ba(I)V")
    public static void method3() {
        if (!field632) {
            return;
        }
        class157 var0 = class157.method2813(Statics.field2317, field629);
        if (var0 != null && var0.field2590 != null) {
            class1 var1 = new class1();
            var1.field15 = var0;
            var1.field7 = var0.field2590;
            class25.method2220(var1);
        }
        field632 = false;
        method1523(var0);
    }

    @ObfuscatedName("e.bs(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method134(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field628 || field615 >= 500) {
            return;
        }
        field620[field615] = arg0;
        field645[field615] = arg1;
        field728[field615] = arg2;
        field619[field615] = arg3;
        field616[field615] = arg4;
        field617[field615] = arg5;
        field615++;
    }

    @ObfuscatedName("bx.bf(II)Ljava/lang/String;")
    public static String method1477(int arg0) {
        return field645[arg0].length() > 0 ? field620[arg0] + class133.field2216 + field645[arg0] : field620[arg0];
    }

    @ObfuscatedName("fg.bk(IIIIB)V")
    public static final void method3173(int arg0, int arg1, int arg2, int arg3) {
        if (field626 == 0 && !field632) {
            method134(class133.field2211, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class111.field1890; var5++) {
            int var6 = class111.field1902[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field529.method1876(Statics.field2050, var7, var8, var6) >= 0) {
                    class31 var11 = class31.method132(var10);
                    if (var11.field851 != null) {
                        var11 = var11.method622();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field626 == 1) {
                        method134(class133.field2246, field627 + " " + class2.field18 + " " + class2.method877(65535) + var11.field819, 1, var6, var7, var8);
                    } else if (!field632) {
                        String[] var12 = var11.field823;
                        if (field507) {
                            var12 = method2955(var12);
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
                                    method134(var12[var13], class2.method877(65535) + var11.field819, var14, var6, var7, var8);
                                }
                            }
                        }
                        method134(class133.field2070, class2.method877(65535) + var11.field819, 1002, var11.field816 << 14, var7, var8);
                    } else if ((Statics.field958 & 0x4) == 4) {
                        method134(field630, field631 + " " + class2.field18 + " " + class2.method877(65535) + var11.field819, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class24 var15 = field584[var10];
                    if (var15.field384.field772 == 1 && (var15.field433 & 0x7F) == 64 && (var15.field407 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field465; var16++) {
                            class24 var17 = field584[field506[var16]];
                            if (var17 != null && var15 != var17 && var17.field384.field772 == 1 && var15.field433 == var17.field433 && var15.field407 == var17.field407) {
                                method1171(var17.field384, field506[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field593; var18++) {
                            class3 var19 = field592[field594[var18]];
                            if (var19 != null && var15.field433 == var19.field433 && var15.field407 == var19.field407) {
                                method20(var19, field594[var18], var7, var8);
                            }
                        }
                    }
                    method1171(var15.field384, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field592[var10];
                    if ((var20.field433 & 0x7F) == 64 && (var20.field407 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field465; var21++) {
                            class24 var22 = field584[field506[var21]];
                            if (var22 != null && var22.field384.field772 == 1 && var20.field433 == var22.field433 && var20.field407 == var22.field407) {
                                method1171(var22.field384, field506[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field593; var23++) {
                            class3 var24 = field592[field594[var23]];
                            if (var24 != null && var20 != var24 && var20.field433 == var24.field433 && var20.field407 == var24.field407) {
                                method20(var24, field594[var23], var7, var8);
                            }
                        }
                    }
                    method20(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class176 var25 = field590[Statics.field2050][var7][var8];
                    if (var25 != null) {
                        for (class16 var26 = (class16) var25.method3354(); var26 != null; var26 = (class16) var25.method3331()) {
                            class39 var27 = class39.method525(var26.field260);
                            if (field626 == 1) {
                                method134(class133.field2246, field627 + " " + class2.field18 + " " + class2.method877(16748608) + var27.field969, 16, var26.field260, var7, var8);
                            } else if (!field632) {
                                String[] var28 = var27.field983;
                                if (field507) {
                                    var28 = method2955(var28);
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
                                        method134(var28[var29], class2.method877(16748608) + var27.field969, var30, var26.field260, var7, var8);
                                    } else if (var29 == 2) {
                                        method134(class133.field2067, class2.method877(16748608) + var27.field969, 20, var26.field260, var7, var8);
                                    }
                                }
                                method134(class133.field2070, class2.method877(16748608) + var27.field969, 1004, var26.field260, var7, var8);
                            } else if ((Statics.field958 & 0x1) == 1) {
                                method134(field630, field631 + " " + class2.field18 + " " + class2.method877(16748608) + var27.field969, 17, var26.field260, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.bv(Lal;IIII)V")
    public static final void method1171(class30 arg0, int arg1, int arg2, int arg3) {
        if (field615 >= 400) {
            return;
        }
        if (arg0.field796 != null) {
            arg0 = arg0.method582();
        }
        if (arg0 == null || !arg0.field799) {
            return;
        }
        String var4 = arg0.field771;
        if (arg0.field788 != 0) {
            int var6 = arg0.field788;
            int var7 = Statics.field1242.field42;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method877(16711680);
            } else if (var8 < -6) {
                var9 = class2.method877(16723968);
            } else if (var8 < -3) {
                var9 = class2.method877(16740352);
            } else if (var8 < 0) {
                var9 = class2.method877(16756736);
            } else if (var8 > 9) {
                var9 = class2.method877(65280);
            } else if (var8 > 6) {
                var9 = class2.method877(4259584);
            } else if (var8 > 3) {
                var9 = class2.method877(8453888);
            } else if (var8 > 0) {
                var9 = class2.method877(12648192);
            } else {
                var9 = class2.method877(16776960);
            }
            var4 = var4 + var9 + " " + class2.field29 + class133.field2212 + arg0.field788 + class2.field21;
        }
        if (field626 == 1) {
            method134(class133.field2246, field627 + " " + class2.field18 + " " + class2.method877(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field632) {
            String[] var10 = arg0.field800;
            if (field507) {
                var10 = method2955(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class133.field2122)) {
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
                        method134(var10[var11], class2.method877(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class133.field2122)) {
                        short var14 = 0;
                        if (arg0.field788 > Statics.field1242.field42) {
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
                        method134(var10[var13], class2.method877(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method134(class133.field2070, class2.method877(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field958 & 0x2) == 2) {
            method134(field630, field631 + " " + class2.field18 + " " + class2.method877(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("x.bx(Lx;IIII)V")
    public static final void method20(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1242 == arg0 || field615 >= 400) {
            return;
        }
        String var9;
        if (arg0.field38 == 0) {
            String var4 = arg0.field41;
            int var5 = arg0.field42;
            int var6 = Statics.field1242.field42;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method877(16711680);
            } else if (var7 < -6) {
                var8 = class2.method877(16723968);
            } else if (var7 < -3) {
                var8 = class2.method877(16740352);
            } else if (var7 < 0) {
                var8 = class2.method877(16756736);
            } else if (var7 > 9) {
                var8 = class2.method877(65280);
            } else if (var7 > 6) {
                var8 = class2.method877(4259584);
            } else if (var7 > 3) {
                var8 = class2.method877(8453888);
            } else if (var7 > 0) {
                var8 = class2.method877(12648192);
            } else {
                var8 = class2.method877(16776960);
            }
            var9 = var4 + var8 + " " + class2.field29 + class133.field2212 + arg0.field42 + class2.field21;
        } else {
            var9 = arg0.field41 + " " + class2.field29 + class133.field2213 + arg0.field38 + class2.field21;
        }
        if (field626 == 1) {
            method134(class133.field2246, field627 + " " + class2.field18 + " " + class2.method877(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field632) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field603[var10] != null) {
                    short var11 = 0;
                    if (field603[var10].equalsIgnoreCase(class133.field2122)) {
                        if (arg0.field42 > Statics.field1242.field42) {
                            var11 = 2000;
                        }
                        if (Statics.field1242.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field1242.field49 == arg0.field49) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field604[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field486[var10] + var11;
                    method134(field603[var10], class2.method877(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field958 & 0x8) == 8) {
            method134(field630, field631 + " " + class2.field18 + " " + class2.method877(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field615; var14++) {
            if (field728[var14] == 23) {
                field645[var14] = class2.method877(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cs.bz([Lfz;IIIIIIIII)V")
    public static final void method1849(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class88.method1791(arg2, arg3, arg4, arg5);
        class103.method2133();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null && (var10.field2578 == arg1 || arg1 == -1412584499 && field464 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field678[field673] = var10.field2572 + arg6;
                    field679[field673] = var10.field2573 + arg7;
                    field680[field673] = var10.field2576;
                    field681[field673] = var10.field2577;
                    var11 = ++field673 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2682 = var11;
                var10.field2683 = field477;
                if (!var10.field2565 || !method1665(var10)) {
                    if (var10.field2675 > 0) {
                        method135(var10);
                    }
                    int var12 = var10.field2572 + arg6;
                    int var13 = var10.field2573 + arg7;
                    int var14 = var10.field2594;
                    if (field464 == var10) {
                        if (arg1 != -1412584499 && !var10.field2632) {
                            Statics.field2295 = arg0;
                            Statics.field198 = arg6;
                            Statics.field743 = arg7;
                            continue;
                        }
                        if (field654 && field648) {
                            int var15 = class76.field1367;
                            int var16 = class76.field1378;
                            int var17 = var15 - field591;
                            int var18 = var16 - field646;
                            if (var17 < field649) {
                                var17 = field649;
                            }
                            if (var10.field2576 + var17 > field649 + field644.field2576) {
                                var17 = field649 + field644.field2576 - var10.field2576;
                            }
                            if (var18 < field650) {
                                var18 = field650;
                            }
                            if (var10.field2577 + var18 > field650 + field644.field2577) {
                                var18 = field650 + field644.field2577 - var10.field2577;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2632) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2620 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2620 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2576 + var12;
                        int var26 = var10.field2577 + var13;
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
                        int var29 = var10.field2576 + var12;
                        int var30 = var10.field2577 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2565 || var19 < var21 && var20 < var22) {
                        if (var10.field2675 != 0) {
                            if (var10.field2675 == 1337) {
                                field622 = var12;
                                field707 = var13;
                                method2368(var12, var13, var10.field2576, var10.field2577);
                                class88.method1791(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2675 == 1338) {
                                method1350(var12, var13, var11);
                                class88.method1791(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var31 = class76.field1367;
                        int var32 = class76.field1378;
                        if (!field628 && var31 >= var19 && var32 >= var20 && var31 < var21 && var32 < var22) {
                            method2130(var10, var31 - var12, var32 - var13);
                        }
                        if (var10.field2620 == 0) {
                            if (!var10.field2565 && method1665(var10) && Statics.field78 != var10) {
                                continue;
                            }
                            if (!var10.field2565) {
                                if (var10.field2588 > var10.field2583 - var10.field2577) {
                                    var10.field2588 = var10.field2583 - var10.field2577;
                                }
                                if (var10.field2588 < 0) {
                                    var10.field2588 = 0;
                                }
                            }
                            method1849(arg0, var10.field2558, var19, var20, var21, var22, var12 - var10.field2598, var13 - var10.field2588, var11);
                            if (var10.field2571 != null) {
                                method1849(var10.field2571, var10.field2558, var19, var20, var21, var22, var12 - var10.field2598, var13 - var10.field2588, var11);
                            }
                            class4 var33 = (class4) field567.method3311((long) var10.field2558);
                            if (var33 != null) {
                                if (var33.field55 == 0 && class76.field1367 >= var19 && class76.field1378 >= var20 && class76.field1367 < var21 && class76.field1378 < var22 && !field628 && !field641) {
                                    field620[0] = class133.field2279;
                                    field645[0] = "";
                                    field728[0] = 1006;
                                    field615 = 1;
                                }
                                int var34 = var33.field60;
                                if (class157.method1408(var34)) {
                                    Statics.field2295 = null;
                                    method1849(Statics.field2580[var34], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field2295 != null) {
                                        method1849(Statics.field2295, -1412584499, var19, var20, var21, var22, Statics.field198, Statics.field743, var11);
                                        Statics.field2295 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var35 = 0; var35 < 100; var35++) {
                                        field675[var35] = true;
                                    }
                                } else {
                                    field675[var11] = true;
                                }
                            }
                            class88.method1791(arg2, arg3, arg4, arg5);
                            class103.method2133();
                        }
                        if (field677[var11] || field532 > 1) {
                            if (var10.field2620 == 0 && !var10.field2565 && var10.field2583 > var10.field2577) {
                                int var36 = var10.field2576 + var12;
                                int var37 = var10.field2588;
                                int var38 = var10.field2577;
                                int var39 = var10.field2583;
                                Statics.field1254[0].method1777(var36, var13);
                                Statics.field1254[1].method1777(var36, var13 + var38 - 16);
                                class88.method1797(var36, var13 + 16, 16, var38 - 32, field552);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class88.method1797(var36, var13 + 16 + var41, 16, var40, field553);
                                class88.method1789(var36, var13 + 16 + var41, var40, field576);
                                class88.method1789(var36 + 1, var13 + 16 + var41, var40, field576);
                                class88.method1834(var36, var13 + 16 + var41, 16, field576);
                                class88.method1834(var36, var13 + 17 + var41, 16, field576);
                                class88.method1789(var36 + 15, var13 + 16 + var41, var40, field554);
                                class88.method1789(var36 + 14, var13 + 17 + var41, var40 - 1, field554);
                                class88.method1834(var36, var13 + 15 + var41 + var40, 16, field554);
                                class88.method1834(var36 + 1, var13 + 14 + var41 + var40, 15, field554);
                            }
                            if (var10.field2620 != 1) {
                                if (var10.field2620 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2577; var43++) {
                                        for (int var44 = 0; var44 < var10.field2576; var44++) {
                                            int var45 = (var10.field2647 + 32) * var44 + var12;
                                            int var46 = (var10.field2612 + 32) * var43 + var13;
                                            if (var42 < 20) {
                                                var45 += var10.field2622[var42];
                                                var46 += var10.field2623[var42];
                                            }
                                            if (var10.field2669[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2669[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field1953 == var10 && field572 == var42) {
                                                    class85 var50;
                                                    if (field626 == 1 && Statics.field301 == var42 && Statics.field748 == var10.field2558) {
                                                        var50 = class39.method760(var49, var10.field2670[var42], 2, 0, false);
                                                    } else {
                                                        var50 = class39.method760(var49, var10.field2670[var42], 1, 3153952, false);
                                                    }
                                                    if (var50 == null) {
                                                        method1523(var10);
                                                    } else if (Statics.field1953 == var10 && field572 == var42) {
                                                        int var51 = class76.field1367 - field586;
                                                        int var52 = class76.field1378 - field587;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field541 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method1692(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class157 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class88.field1463 && var53.field2588 > 0) {
                                                                int var54 = field585 * (class88.field1463 - var46 - var52) / 3;
                                                                if (var54 > field585 * 10) {
                                                                    var54 = field585 * 10;
                                                                }
                                                                if (var54 > var53.field2588) {
                                                                    var54 = var53.field2588;
                                                                }
                                                                var53.field2588 -= var54;
                                                                field587 += var54;
                                                                method1523(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class88.field1465 && var53.field2588 < var53.field2583 - var53.field2577) {
                                                                int var55 = field585 * (var46 + var52 + 32 - class88.field1465) / 3;
                                                                if (var55 > field585 * 10) {
                                                                    var55 = field585 * 10;
                                                                }
                                                                if (var55 > var53.field2583 - var53.field2577 - var53.field2588) {
                                                                    var55 = var53.field2583 - var53.field2577 - var53.field2588;
                                                                }
                                                                var53.field2588 += var55;
                                                                field587 -= var55;
                                                                method1523(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field1016 == var10 && field484 == var42) {
                                                        var50.method1692(var45, var46, 128);
                                                    } else {
                                                        var50.method1686(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2663 != null && var42 < 20) {
                                                class85 var56 = var10.method3103(var42);
                                                if (var56 != null) {
                                                    var56.method1686(var45, var46);
                                                } else if (class157.field2646) {
                                                    method1523(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2620 == 3) {
                                    int var57;
                                    if (method609(var10)) {
                                        var57 = var10.field2652;
                                        if (Statics.field78 == var10 && var10.field2587 != 0) {
                                            var57 = var10.field2587;
                                        }
                                    } else {
                                        var57 = var10.field2584;
                                        if (Statics.field78 == var10 && var10.field2582 != 0) {
                                            var57 = var10.field2582;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2639) {
                                            class88.method1797(var12, var13, var10.field2576, var10.field2577, var57);
                                        } else {
                                            class88.method1807(var12, var13, var10.field2576, var10.field2577, var57);
                                        }
                                    } else if (var10.field2639) {
                                        class88.method1801(var12, var13, var10.field2576, var10.field2577, var57, 256 - (var14 & 0xFF));
                                    } else {
                                        class88.method1800(var12, var13, var10.field2576, var10.field2577, var57, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2620 == 4) {
                                    class182 var58 = var10.method3118();
                                    if (var58 != null) {
                                        String var59 = var10.field2614;
                                        int var60;
                                        if (method609(var10)) {
                                            var60 = var10.field2652;
                                            if (Statics.field78 == var10 && var10.field2587 != 0) {
                                                var60 = var10.field2587;
                                            }
                                            if (var10.field2559.length() > 0) {
                                                var59 = var10.field2559;
                                            }
                                        } else {
                                            var60 = var10.field2584;
                                            if (Statics.field78 == var10 && var10.field2582 != 0) {
                                                var60 = var10.field2582;
                                            }
                                        }
                                        if (var10.field2565 && var10.field2608 != -1) {
                                            class39 var61 = class39.method525(var10.field2608);
                                            var59 = var61.field969;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field975 == 1 || var10.field2672 != 1) && var10.field2672 != -1) {
                                                var59 = class2.method877(16748608) + var59 + class2.field23 + " " + 'x' + method1276(var10.field2672);
                                            }
                                        }
                                        if (field607 == var10) {
                                            class133 var10000 = (class133) null;
                                            var59 = class133.field2147;
                                            var60 = var10.field2584;
                                        }
                                        if (!var10.field2565) {
                                            var59 = method2878(var59, var10);
                                        }
                                        var58.method3397(var59, var12, var13, var10.field2576, var10.field2577, var60, var10.field2616 ? 0 : -1, var10.field2617, var10.field2618, var10.field2609);
                                    } else if (class157.field2646) {
                                        method1523(var10);
                                    }
                                } else if (var10.field2620 == 5) {
                                    if (var10.field2565) {
                                        class85 var63;
                                        if (var10.field2608 == -1) {
                                            var63 = var10.method3102(false);
                                        } else {
                                            var63 = class39.method760(var10.field2608, var10.field2672, var10.field2595, var10.field2601, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1449;
                                            int var65 = var63.field1448;
                                            if (var10.field2629) {
                                                class88.method1792(var12, var13, var10.field2576 + var12, var10.field2577 + var13);
                                                int var66 = (var10.field2576 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2577 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2593 != 0) {
                                                            var63.method1698(var64 / 2 + var64 * var68 + var12, var65 / 2 + var65 * var69 + var13, var10.field2593, 4096);
                                                        } else if (var14 == 0) {
                                                            var63.method1686(var64 * var68 + var12, var65 * var69 + var13);
                                                        } else {
                                                            var63.method1692(var64 * var68 + var12, var65 * var69 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class88.method1791(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2576 * 4096 / var64;
                                                if (var10.field2593 != 0) {
                                                    var63.method1698(var10.field2576 / 2 + var12, var10.field2577 / 2 + var13, var10.field2593, var70);
                                                } else if (var14 != 0) {
                                                    var63.method1694(var12, var13, var10.field2576, var10.field2577, 256 - (var14 & 0xFF));
                                                } else if (var10.field2576 == var64 && var10.field2577 == var65) {
                                                    var63.method1686(var12, var13);
                                                } else {
                                                    var63.method1685(var12, var13, var10.field2576, var10.field2577);
                                                }
                                            }
                                        } else if (class157.field2646) {
                                            method1523(var10);
                                        }
                                    } else {
                                        class85 var62 = var10.method3102(method609(var10));
                                        if (var62 != null) {
                                            var62.method1686(var12, var13);
                                        } else if (class157.field2646) {
                                            method1523(var10);
                                        }
                                    }
                                } else if (var10.field2620 == 6) {
                                    boolean var71 = method609(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2567;
                                    } else {
                                        var72 = var10.field2603;
                                    }
                                    class111 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2608 != -1) {
                                        class39 var75 = class39.method525(var10.field2608);
                                        if (var75 != null) {
                                            class39 var76 = var75.method818(var10.field2672);
                                            var73 = var76.method828(1);
                                            if (var73 == null) {
                                                method1523(var10);
                                            } else {
                                                var73.method2281();
                                                var74 = var73.field1525 / 2;
                                            }
                                        }
                                    } else if (var10.field2599 == 5) {
                                        if (var10.field2600 == 0) {
                                            var73 = field730.method3201((class33) null, -1, (class33) null, -1);
                                        } else {
                                            var73 = Statics.field1242.method30();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3105((class33) null, -1, var71, Statics.field1242.field40);
                                        if (var73 == null && class157.field2646) {
                                            method1523(var10);
                                        }
                                    } else {
                                        class33 var77 = Statics.method147(var72);
                                        var73 = var10.method3105(var77, var10.field2673, var71, Statics.field1242.field40);
                                        if (var73 == null && class157.field2646) {
                                            method1523(var10);
                                        }
                                    }
                                    class103.method2135(var10.field2576 / 2 + var12, var10.field2577 / 2 + var13);
                                    int var78 = var10.field2610 * class103.field1761[var10.field2607] >> 16;
                                    int var79 = var10.field2610 * class103.field1747[var10.field2607] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2565) {
                                            var73.method2281();
                                            if (var10.field2636) {
                                                var73.method2272(0, var10.field2563, var10.field2592, var10.field2607, var10.field2605, var10.field2606 + var74 + var78, var10.field2606 + var79, var10.field2610);
                                            } else {
                                                var73.method2249(0, var10.field2563, var10.field2592, var10.field2607, var10.field2605, var10.field2606 + var74 + var78, var10.field2606 + var79);
                                            }
                                        } else {
                                            var73.method2249(0, var10.field2563, 0, var10.field2607, 0, var78, var79);
                                        }
                                    }
                                    class103.method2172();
                                } else {
                                    if (var10.field2620 == 7) {
                                        class182 var80 = var10.method3118();
                                        if (var80 == null) {
                                            if (class157.field2646) {
                                                method1523(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2577; var82++) {
                                            for (int var83 = 0; var83 < var10.field2576; var83++) {
                                                if (var10.field2669[var81] > 0) {
                                                    class39 var84 = class39.method525(var10.field2669[var81] - 1);
                                                    String var85;
                                                    if (var84.field975 != 1 && var10.field2670[var81] == 1) {
                                                        var85 = class2.method877(16748608) + var84.field969 + class2.field23;
                                                    } else {
                                                        var85 = class2.method877(16748608) + var84.field969 + class2.field23 + " " + 'x' + method1276(var10.field2670[var81]);
                                                    }
                                                    int var86 = (var10.field2647 + 115) * var83 + var12;
                                                    int var87 = (var10.field2612 + 12) * var82 + var13;
                                                    if (var10.field2617 == 0) {
                                                        var80.method3438(var85, var86, var87, var10.field2584, var10.field2616 ? 0 : -1);
                                                    } else if (var10.field2617 == 1) {
                                                        var80.method3433(var85, var10.field2576 / 2 + var86, var87, var10.field2584, var10.field2616 ? 0 : -1);
                                                    } else {
                                                        var80.method3395(var85, var10.field2576 + var86 - 1, var87, var10.field2584, var10.field2616 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2620 == 8 && Statics.field374 == var10 && field625 == field525) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class182 var90 = Statics.field218;
                                        String var91 = var10.field2614;
                                        String var92 = method2878(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class2.field20);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method3389(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field2847 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2576 + var12 - 5 - var88;
                                        int var97 = var10.field2577 + var13 + 5;
                                        if (var96 < var12 + 5) {
                                            var96 = var12 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class88.method1797(var96, var97, var88, var89, 16777120);
                                        class88.method1807(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2614;
                                        int var99 = var90.field2847 + var97 + 2;
                                        String var100 = method2878(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class2.field20);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method3438(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field2847 + 1;
                                        }
                                    }
                                    if (var10.field2620 == 9) {
                                        if (var10.field2624 == 1) {
                                            class88.method1813(var12, var13, var10.field2576 + var12, var10.field2577 + var13, var10.field2584);
                                        } else {
                                            int var103 = var10.field2576 >= 0 ? var10.field2576 : -var10.field2576;
                                            int var104 = var10.field2577 >= 0 ? var10.field2577 : -var10.field2577;
                                            int var105 = var103;
                                            if (var103 < var104) {
                                                var105 = var104;
                                            }
                                            if (var105 != 0) {
                                                int var106 = (var10.field2576 << 16) / var105;
                                                int var107 = (var10.field2577 << 16) / var105;
                                                if (var107 <= var106) {
                                                    var106 = -var106;
                                                } else {
                                                    var107 = -var107;
                                                }
                                                int var108 = var10.field2624 * var107 >> 17;
                                                int var109 = var10.field2624 * var107 + 1 >> 17;
                                                int var110 = var10.field2624 * var106 >> 17;
                                                int var111 = var10.field2624 * var106 + 1 >> 17;
                                                int var112 = var12 + var108;
                                                int var113 = var12 - var109;
                                                int var114 = var10.field2576 + var12 - var109;
                                                int var115 = var10.field2576 + var12 + var108;
                                                int var116 = var13 + var110;
                                                int var117 = var13 - var111;
                                                int var118 = var10.field2577 + var13 - var111;
                                                int var119 = var10.field2577 + var13 + var110;
                                                class103.method2139(var112, var113, var114);
                                                class103.method2164(var116, var117, var118, var112, var113, var114, var10.field2584);
                                                class103.method2139(var112, var114, var115);
                                                class103.method2164(var116, var118, var119, var112, var114, var115, var10.field2584);
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

    @ObfuscatedName("ex.bm(Ljava/lang/String;Lfz;I)Ljava/lang/String;")
    public static String method2878(String arg0, class157 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2911(method1(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1198 != null) {
                    int var6 = Statics.field1198.field1389;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1198.field1391 != null) {
                        var5 = (String) Statics.field1198.field1391;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bl.bc(II)Ljava/lang/String;")
    public static final String method1276(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method877(65408) + var1.substring(0, var1.length() - 8) + class133.field2217 + " " + class2.field29 + var1 + class2.field21 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method877(16777215) + var1.substring(0, var1.length() - 4) + class133.field2219 + " " + class2.field29 + var1 + class2.field21 + class2.field23;
        } else {
            return " " + class2.method877(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("eg.bd(II)Ljava/lang/String;")
    public static final String method2911(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("al.be(Lfz;I)Z")
    public static final boolean method609(class157 arg0) {
        if (arg0.field2664 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2664.length; var1++) {
            int var2 = method1(arg0, var1);
            int var3 = arg0.field2574[var1];
            if (arg0.field2664[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2664[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2664[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("u.bo(Lfz;II)I")
    public static final int method1(class157 arg0, int arg1) {
        if (arg0.field2679 == null || arg1 >= arg0.field2679.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2679[arg1];
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
                    var7 = field610[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field611[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field550[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class157 var11 = class157.method2230(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class39.method525(var12).field1001 || field471)) {
                        for (int var13 = 0; var13 < var11.field2669.length; var13++) {
                            if (var12 + 1 == var11.field2669[var13]) {
                                var7 += var11.field2670[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class158.field2687[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class129.field2030[field611[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class158.field2687[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1242.field42;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class129.field2034[var14]) {
                            var7 += field611[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class157 var17 = class157.method2230(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class39.method525(var18).field1001 || field471)) {
                        for (int var19 = 0; var19 < var17.field2669.length; var19++) {
                            if (var18 + 1 == var17.field2669[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field637;
                }
                if (var6 == 12) {
                    var7 = field638;
                }
                if (var6 == 13) {
                    int var20 = class158.field2687[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class158.method3077(var22);
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
                    var7 = (Statics.field1242.field433 >> 7) + Statics.field176;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1242.field407 >> 7) + Statics.field1999;
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

    @ObfuscatedName("cz.cc(Lfz;IIB)V")
    public static final void method2130(class157 arg0, int arg1, int arg2) {
        if (arg0.field2570 == 1) {
            method134(arg0.field2668, "", 24, 0, 0, arg0.field2558);
        }
        if (arg0.field2570 == 2 && !field632) {
            String var3 = method670(arg0);
            if (var3 != null) {
                method134(var3, class2.method877(65280) + arg0.field2667, 25, 0, -1, arg0.field2558);
            }
        }
        if (arg0.field2570 == 3) {
            method134(class133.field2215, "", 26, 0, 0, arg0.field2558);
        }
        if (arg0.field2570 == 4) {
            method134(arg0.field2668, "", 28, 0, 0, arg0.field2558);
        }
        if (arg0.field2570 == 5) {
            method134(arg0.field2668, "", 29, 0, 0, arg0.field2558);
        }
        if (arg0.field2570 == 6 && field607 == null) {
            method134(arg0.field2668, "", 30, 0, -1, arg0.field2558);
        }
        if (arg0.field2620 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2577; var5++) {
                for (int var6 = 0; var6 < arg0.field2576; var6++) {
                    int var7 = (arg0.field2647 + 32) * var6;
                    int var8 = (arg0.field2612 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2622[var4];
                        var8 += arg0.field2623[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field708 = var4;
                        Statics.field96 = arg0;
                        if (arg0.field2669[var4] > 0) {
                            class39 var9 = class39.method525(arg0.field2669[var4] - 1);
                            if (field626 == 1 && class161.method2384(method1599(arg0))) {
                                if (Statics.field748 != arg0.field2558 || Statics.field301 != var4) {
                                    method134(class133.field2246, field627 + " " + class2.field18 + " " + class2.method877(16748608) + var9.field969, 31, var9.field967, var4, arg0.field2558);
                                }
                            } else if (!field632 || !class161.method2384(method1599(arg0))) {
                                String[] var10 = var9.field984;
                                if (field507) {
                                    var10 = method2955(var10);
                                }
                                if (class161.method2384(method1599(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method134(var10[var11], class2.method877(16748608) + var9.field969, var12, var9.field967, var4, arg0.field2558);
                                        } else if (var11 == 4) {
                                            method134(class133.field2275, class2.method877(16748608) + var9.field969, 37, var9.field967, var4, arg0.field2558);
                                        }
                                    }
                                }
                                if (class161.method1225(method1599(arg0))) {
                                    method134(class133.field2246, class2.method877(16748608) + var9.field969, 38, var9.field967, var4, arg0.field2558);
                                }
                                if (class161.method2384(method1599(arg0)) && var10 != null) {
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
                                            method134(var10[var13], class2.method877(16748608) + var9.field969, var14, var9.field967, var4, arg0.field2558);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2625;
                                if (field507) {
                                    var15 = method2955(var15);
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
                                            method134(var15[var16], class2.method877(16748608) + var9.field969, var17, var9.field967, var4, arg0.field2558);
                                        }
                                    }
                                }
                                method134(class133.field2070, class2.method877(16748608) + var9.field969, 1005, var9.field967, var4, arg0.field2558);
                            } else if ((Statics.field958 & 0x10) == 16) {
                                method134(field630, field631 + " " + class2.field18 + " " + class2.method877(16748608) + var9.field969, 32, var9.field967, var4, arg0.field2558);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2565) {
            return;
        }
        if (!field632) {
            for (int var18 = 9; var18 >= 5; var18--) {
                int var19 = method1599(arg0);
                boolean var20 = (var19 >> var18 + 1 & 0x1) != 0;
                String var21;
                if (!var20 && arg0.field2680 == null) {
                    var21 = null;
                } else if (arg0.field2628 == null || arg0.field2628.length <= var18 || arg0.field2628[var18] == null || arg0.field2628[var18].trim().length() == 0) {
                    var21 = null;
                } else {
                    var21 = arg0.field2628[var18];
                }
                if (var21 != null) {
                    method134(var21, arg0.field2627, 1007, var18 + 1, arg0.field2568, arg0.field2558);
                }
            }
            String var23 = method670(arg0);
            if (var23 != null) {
                method134(var23, arg0.field2627, 25, 0, arg0.field2568, arg0.field2558);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                int var25 = method1599(arg0);
                boolean var26 = (var25 >> var24 + 1 & 0x1) != 0;
                String var27;
                if (!var26 && arg0.field2680 == null) {
                    var27 = null;
                } else if (arg0.field2628 == null || arg0.field2628.length <= var24 || arg0.field2628[var24] == null || arg0.field2628[var24].trim().length() == 0) {
                    var27 = null;
                } else {
                    var27 = arg0.field2628[var24];
                }
                if (var27 != null) {
                    method134(var27, arg0.field2627, 57, var24 + 1, arg0.field2568, arg0.field2558);
                }
            }
            int var29 = method1599(arg0);
            boolean var30 = (var29 & 0x1) != 0;
            if (var30) {
                method134(class133.field2129, "", 30, 0, arg0.field2568, arg0.field2558);
            }
        } else if (class161.method2686(method1599(arg0)) && (Statics.field958 & 0x20) == 32) {
            method134(field630, field631 + " " + class2.field18 + " " + arg0.field2627, 58, 0, arg0.field2568, arg0.field2558);
        }
    }

    @ObfuscatedName("cm.cg(IIIIIIII)V")
    public static final void method2129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class157.method1408(arg0)) {
            method210(Statics.field2580[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("t.cd([Lfz;IIIIIIIB)V")
    public static final void method210(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && (!var9.field2565 || var9.field2620 == 0 || var9.field2586 || method1599(var9) != 0 || field644 == var9) && var9.field2578 == arg1 && (!var9.field2565 || !method1665(var9))) {
                int var10 = var9.field2572 + arg6;
                int var11 = var9.field2573 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2620 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2620 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2576 + var10;
                    int var19 = var9.field2577 + var11;
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
                    int var22 = var9.field2576 + var10;
                    int var23 = var9.field2577 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field464 == var9) {
                    field651 = true;
                    field652 = var10;
                    field556 = var11;
                }
                if (!var9.field2565 || var12 < var14 && var13 < var15) {
                    if (var9.field2675 == 1337) {
                        method1523(var9);
                    } else if (var9.field2675 != 1338) {
                        if (var9.field2620 == 0) {
                            if (!var9.field2565 && method1665(var9) && Statics.field78 != var9) {
                                continue;
                            }
                            method210(arg0, var9.field2558, var12, var13, var14, var15, var10 - var9.field2598, var11 - var9.field2588);
                            if (var9.field2571 != null) {
                                method210(var9.field2571, var9.field2558, var12, var13, var14, var15, var10 - var9.field2598, var11 - var9.field2588);
                            }
                            class4 var36 = (class4) field567.method3311((long) var9.field2558);
                            if (var36 != null) {
                                method2129(var36.field60, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2565) {
                            boolean var37;
                            if (class76.field1367 >= var12 && class76.field1378 >= var13 && class76.field1367 < var14 && class76.field1378 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if (class76.field1366 == 1 && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if (class76.field1373 == 1 && class76.field1374 >= var12 && class76.field1377 >= var13 && class76.field1374 < var14 && class76.field1377 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method213(var9, class76.field1374 - var10, class76.field1377 - var11);
                            }
                            if (field464 != null && field464 != var9 && var37 && class161.method1230(method1599(var9))) {
                                field538 = var9;
                            }
                            if (field644 == var9) {
                                field648 = true;
                                field649 = var10;
                                field650 = var11;
                            }
                            if (var9.field2586) {
                                if (var37 && field560 != 0 && var9.field2655 != null) {
                                    class1 var40 = new class1();
                                    var40.field15 = var9;
                                    var40.field4 = field560;
                                    var40.field7 = var9.field2655;
                                    field669.method3323(var40);
                                }
                                if (field464 != null || Statics.field1953 != null || field628) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2677 && var39) {
                                    var9.field2677 = true;
                                    if (var9.field2638 != null) {
                                        class1 var41 = new class1();
                                        var41.field15 = var9;
                                        var41.field3 = class76.field1374 - var10;
                                        var41.field4 = class76.field1377 - var11;
                                        var41.field7 = var9.field2638;
                                        field669.method3323(var41);
                                    }
                                }
                                if (var9.field2677 && var38 && var9.field2621 != null) {
                                    class1 var42 = new class1();
                                    var42.field15 = var9;
                                    var42.field3 = class76.field1367 - var10;
                                    var42.field4 = class76.field1378 - var11;
                                    var42.field7 = var9.field2621;
                                    field669.method3323(var42);
                                }
                                if (var9.field2677 && !var38) {
                                    var9.field2677 = false;
                                    if (var9.field2566 != null) {
                                        class1 var43 = new class1();
                                        var43.field15 = var9;
                                        var43.field3 = class76.field1367 - var10;
                                        var43.field4 = class76.field1378 - var11;
                                        var43.field7 = var9.field2566;
                                        field671.method3323(var43);
                                    }
                                }
                                if (var38 && var9.field2604 != null) {
                                    class1 var44 = new class1();
                                    var44.field15 = var9;
                                    var44.field3 = class76.field1367 - var10;
                                    var44.field4 = class76.field1378 - var11;
                                    var44.field7 = var9.field2604;
                                    field669.method3323(var44);
                                }
                                if (!var9.field2676 && var37) {
                                    var9.field2676 = true;
                                    if (var9.field2640 != null) {
                                        class1 var45 = new class1();
                                        var45.field15 = var9;
                                        var45.field3 = class76.field1367 - var10;
                                        var45.field4 = class76.field1378 - var11;
                                        var45.field7 = var9.field2640;
                                        field669.method3323(var45);
                                    }
                                }
                                if (var9.field2676 && var37 && var9.field2641 != null) {
                                    class1 var46 = new class1();
                                    var46.field15 = var9;
                                    var46.field3 = class76.field1367 - var10;
                                    var46.field4 = class76.field1378 - var11;
                                    var46.field7 = var9.field2641;
                                    field669.method3323(var46);
                                }
                                if (var9.field2676 && !var37) {
                                    var9.field2676 = false;
                                    if (var9.field2642 != null) {
                                        class1 var47 = new class1();
                                        var47.field15 = var9;
                                        var47.field3 = class76.field1367 - var10;
                                        var47.field4 = class76.field1378 - var11;
                                        var47.field7 = var9.field2642;
                                        field671.method3323(var47);
                                    }
                                }
                                if (var9.field2653 != null) {
                                    class1 var48 = new class1();
                                    var48.field15 = var9;
                                    var48.field7 = var9.field2653;
                                    field670.method3323(var48);
                                }
                                if (var9.field2637 != null && field657 > var9.field2633) {
                                    if (var9.field2648 == null || field657 - var9.field2633 > 32) {
                                        class1 var53 = new class1();
                                        var53.field15 = var9;
                                        var53.field7 = var9.field2637;
                                        field669.method3323(var53);
                                    } else {
                                        label447: for (int var49 = var9.field2633; var49 < field657; var49++) {
                                            int var50 = field656[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2648.length; var51++) {
                                                if (var9.field2648[var51] == var50) {
                                                    class1 var52 = new class1();
                                                    var52.field15 = var9;
                                                    var52.field7 = var9.field2637;
                                                    field669.method3323(var52);
                                                    break label447;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2633 = field657;
                                }
                                if (var9.field2649 != null && field659 > var9.field2631) {
                                    if (var9.field2650 == null || field659 - var9.field2631 > 32) {
                                        class1 var58 = new class1();
                                        var58.field15 = var9;
                                        var58.field7 = var9.field2649;
                                        field669.method3323(var58);
                                    } else {
                                        label427: for (int var54 = var9.field2631; var54 < field659; var54++) {
                                            int var55 = field658[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2650.length; var56++) {
                                                if (var9.field2650[var56] == var55) {
                                                    class1 var57 = new class1();
                                                    var57.field15 = var9;
                                                    var57.field7 = var9.field2649;
                                                    field669.method3323(var57);
                                                    break label427;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2631 = field659;
                                }
                                if (var9.field2651 != null && field624 > var9.field2681) {
                                    if (var9.field2589 == null || field624 - var9.field2681 > 32) {
                                        class1 var63 = new class1();
                                        var63.field15 = var9;
                                        var63.field7 = var9.field2651;
                                        field669.method3323(var63);
                                    } else {
                                        label407: for (int var59 = var9.field2681; var59 < field624; var59++) {
                                            int var60 = field497[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2589.length; var61++) {
                                                if (var9.field2589[var61] == var60) {
                                                    class1 var62 = new class1();
                                                    var62.field15 = var9;
                                                    var62.field7 = var9.field2651;
                                                    field669.method3323(var62);
                                                    break label407;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2681 = field624;
                                }
                                if (field536 > var9.field2678 && var9.field2656 != null) {
                                    class1 var64 = new class1();
                                    var64.field15 = var9;
                                    var64.field7 = var9.field2656;
                                    field669.method3323(var64);
                                }
                                if (field663 > var9.field2678 && var9.field2658 != null) {
                                    class1 var65 = new class1();
                                    var65.field15 = var9;
                                    var65.field7 = var9.field2658;
                                    field669.method3323(var65);
                                }
                                if (field551 > var9.field2678 && var9.field2659 != null) {
                                    class1 var66 = new class1();
                                    var66.field15 = var9;
                                    var66.field7 = var9.field2659;
                                    field669.method3323(var66);
                                }
                                if (field665 > var9.field2678 && var9.field2660 != null) {
                                    class1 var67 = new class1();
                                    var67.field15 = var9;
                                    var67.field7 = var9.field2660;
                                    field669.method3323(var67);
                                }
                                var9.field2678 = field655;
                                if (var9.field2585 != null) {
                                    for (int var68 = 0; var68 < field483; var68++) {
                                        class1 var69 = new class1();
                                        var69.field15 = var9;
                                        var69.field10 = field695[var68];
                                        var69.field8 = field694[var68];
                                        var69.field7 = var9.field2585;
                                        field669.method3323(var69);
                                    }
                                }
                            }
                        }
                        if (!var9.field2565) {
                            if (field464 != null || Statics.field1953 != null || field628) {
                                return;
                            }
                            if ((var9.field2666 >= 0 || var9.field2582 != 0) && class76.field1367 >= var12 && class76.field1378 >= var13 && class76.field1367 < var14 && class76.field1378 < var15) {
                                if (var9.field2666 >= 0) {
                                    Statics.field78 = arg0[var9.field2666];
                                } else {
                                    Statics.field78 = var9;
                                }
                            }
                            if (var9.field2620 == 8 && class76.field1367 >= var12 && class76.field1378 >= var13 && class76.field1367 < var14 && class76.field1378 < var15) {
                                Statics.field374 = var9;
                            }
                            if (var9.field2583 > var9.field2577) {
                                int var70 = var9.field2576 + var10;
                                int var71 = var9.field2577;
                                int var72 = var9.field2583;
                                int var73 = class76.field1367;
                                int var74 = class76.field1378;
                                if (field639) {
                                    field495 = 32;
                                } else {
                                    field495 = 0;
                                }
                                field639 = false;
                                if (class76.field1366 != 0) {
                                    if (var73 >= var70 && var73 < var70 + 16 && var74 >= var11 && var74 < var11 + 16) {
                                        var9.field2588 -= 4;
                                        method1523(var9);
                                    } else if (var73 >= var70 && var73 < var70 + 16 && var74 >= var11 + var71 - 16 && var74 < var11 + var71) {
                                        var9.field2588 += 4;
                                        method1523(var9);
                                    } else if (var73 >= var70 - field495 && var73 < field495 + var70 + 16 && var74 >= var11 + 16 && var74 < var11 + var71 - 16) {
                                        int var75 = (var71 - 32) * var71 / var72;
                                        if (var75 < 8) {
                                            var75 = 8;
                                        }
                                        int var76 = var74 - var11 - 16 - var75 / 2;
                                        int var77 = var71 - 32 - var75;
                                        var9.field2588 = (var72 - var71) * var76 / var77;
                                        method1523(var9);
                                        field639 = true;
                                    }
                                }
                                if (field560 != 0) {
                                    int var78 = var9.field2576;
                                    if (var73 >= var70 - var78 && var74 >= var11 && var73 < var70 + 16 && var74 <= var11 + var71) {
                                        var9.field2588 += field560 * 45;
                                        method1523(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field706 == 0 || field706 == 3) && class76.field1373 == 1) {
                        int var24 = class76.field1374 - 25 - var10;
                        int var25 = class76.field1377 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field664 + field559 & 0x7FF;
                            int var27 = class103.field1761[var26];
                            int var28 = class103.field1747[var26];
                            int var29 = (field511 + 256) * var27 >> 8;
                            int var30 = (field511 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field1242.field433 + var31 >> 7;
                            int var34 = Statics.field1242.field407 - var32 >> 7;
                            boolean var35 = method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field499.method2554(var24);
                                field499.method2554(var25);
                                field499.method2435(field559);
                                field499.method2554(57);
                                field499.method2554(field664);
                                field499.method2554(field511);
                                field499.method2554(89);
                                field499.method2435(Statics.field1242.field433);
                                field499.method2435(Statics.field1242.field407);
                                field499.method2554(field534);
                                field499.method2554(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.cw([Lfz;II)V")
    public static final void method868(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2620 == 0) {
                    if (var3.field2571 != null) {
                        method868(var3.field2571, arg1);
                    }
                    class4 var4 = (class4) field567.method3311((long) var3.field2558);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class157.method1408(var5)) {
                            method868(Statics.field2580[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2661 != null) {
                    class1 var6 = new class1();
                    var6.field15 = var3;
                    var6.field7 = var3.field2661;
                    class25.method2220(var6);
                }
                if (arg1 == 1 && var3.field2662 != null) {
                    if (var3.field2568 >= 0) {
                        class157 var7 = class157.method2230(var3.field2558);
                        if (var7 == null || var7.field2571 == null || var3.field2568 >= var7.field2571.length || var7.field2571[var3.field2568] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field15 = var3;
                    var8.field7 = var3.field2662;
                    class25.method2220(var8);
                }
            }
        }
    }

    @ObfuscatedName("r.cp(Lfz;IIB)V")
    public static final void method213(class157 arg0, int arg1, int arg2) {
        if (field464 != null || field628 || arg0 == null) {
            return;
        }
        class157 var3 = arg0;
        int var4 = method1599(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class157 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class157.method2230(var3.field2578);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class157 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2635;
        }
        if (var9 == null) {
            return;
        }
        field464 = arg0;
        class157 var11 = arg0;
        int var12 = method1599(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class157 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class157.method2230(var11.field2578);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class157 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2635;
        }
        field644 = var17;
        field591 = arg1;
        field646 = arg2;
        Statics.field265 = 0;
        field654 = false;
        return;
    }

    @ObfuscatedName("l.cn(I)V")
    public static final void method120() {
        method1523(field464);
        Statics.field265++;
        if (field651 && field648) {
            int var0 = class76.field1367;
            int var1 = class76.field1378;
            int var2 = var0 - field591;
            int var3 = var1 - field646;
            if (var2 < field649) {
                var2 = field649;
            }
            if (field464.field2576 + var2 > field649 + field644.field2576) {
                var2 = field649 + field644.field2576 - field464.field2576;
            }
            if (var3 < field650) {
                var3 = field650;
            }
            if (field464.field2577 + var3 > field650 + field644.field2577) {
                var3 = field650 + field644.field2577 - field464.field2577;
            }
            int var4 = var2 - field652;
            int var5 = var3 - field556;
            int var6 = field464.field2630;
            if (Statics.field265 > field464.field2665 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field654 = true;
            }
            int var7 = field644.field2598 + (var2 - field649);
            int var8 = field644.field2588 + (var3 - field650);
            if (field464.field2654 != null && field654) {
                class1 var9 = new class1();
                var9.field15 = field464;
                var9.field3 = var7;
                var9.field4 = var8;
                var9.field7 = field464.field2654;
                class25.method2220(var9);
            }
            if (class76.field1366 == 0) {
                if (field654) {
                    if (field464.field2644 != null) {
                        class1 var10 = new class1();
                        var10.field15 = field464;
                        var10.field3 = var7;
                        var10.field4 = var8;
                        var10.field1 = field538;
                        var10.field7 = field464.field2644;
                        class25.method2220(var10);
                    }
                    if (field538 != null) {
                        class157 var11 = field464;
                        int var12 = method1599(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class157 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class157.method2230(var11.field2578);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field499.method2322(250);
                            field499.method2533(field464.field2568);
                            field499.method2448(field464.field2558);
                            field499.method2485(field538.field2558);
                            field499.method2477(field538.field2568);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field599 != 1) {
                                int var17 = field615 - 1;
                                boolean var18;
                                if (var17 < 0) {
                                    var18 = false;
                                } else {
                                    int var19 = field728[var17];
                                    if (var19 >= 2000) {
                                        var19 -= 2000;
                                    }
                                    if (var19 == 1007) {
                                        var18 = true;
                                    } else {
                                        var18 = false;
                                    }
                                }
                                if (!var18) {
                                    break label91;
                                }
                            }
                            if (field615 > 2) {
                                method173();
                                break label120;
                            }
                        }
                        if (field615 > 0) {
                            method223(field615 - 1);
                        }
                    }
                }
                field464 = null;
            }
        } else if (Statics.field265 > 1) {
            field464 = null;
        }
    }

    @ObfuscatedName("bm.co(Lfz;I)V")
    public static void method1523(class157 arg0) {
        if (field606 == arg0.field2683) {
            field675[arg0.field2682] = true;
        }
    }

    @ObfuscatedName("l.cv(S)V")
    public static void method121() {
        for (class4 var0 = (class4) field567.method3308(); var0 != null; var0 = (class4) field567.method3309()) {
            int var1 = var0.field60;
            if (class157.method1408(var1)) {
                boolean var2 = true;
                class157[] var3 = Statics.field2580[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2565;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2808;
                    class157 var6 = class157.method2230(var5);
                    if (var6 != null) {
                        method1523(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.ci([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2955(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ec.ck(II)V")
    public static final void method2678(int arg0) {
        if (!class157.method1408(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2580[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3 != null) {
                var3.field2673 = 0;
                var3.field2615 = 0;
            }
        }
    }

    @ObfuscatedName("ak.ct(II)V")
    public static final void method754(int arg0) {
        if (class157.method1408(arg0)) {
            method152(Statics.field2580[arg0], -1);
        }
    }

    @ObfuscatedName("h.cs([Lfz;II)V")
    public static final void method152(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null && var3.field2578 == arg1 && (!var3.field2565 || !method1665(var3))) {
                if (var3.field2620 == 0) {
                    if (!var3.field2565 && method1665(var3) && Statics.field78 != var3) {
                        continue;
                    }
                    method152(arg0, var3.field2558);
                    if (var3.field2571 != null) {
                        method152(var3.field2571, var3.field2558);
                    }
                    class4 var4 = (class4) field567.method3311((long) var3.field2558);
                    if (var4 != null) {
                        method754(var4.field60);
                    }
                }
                if (var3.field2620 == 6) {
                    if (var3.field2603 != -1 || var3.field2567 != -1) {
                        boolean var5 = method609(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2567;
                        } else {
                            var6 = var3.field2603;
                        }
                        if (var6 != -1) {
                            class33 var7 = Statics.method147(var6);
                            var3.field2615 += field585;
                            while (var3.field2615 > var7.field878[var3.field2673]) {
                                var3.field2615 -= var7.field878[var3.field2673];
                                var3.field2673++;
                                if (var3.field2673 >= var7.field884.length) {
                                    var3.field2673 -= var7.field880;
                                    if (var3.field2673 < 0 || var3.field2673 >= var7.field884.length) {
                                        var3.field2673 = 0;
                                    }
                                }
                                method1523(var3);
                            }
                        }
                    }
                    if (var3.field2611 != 0 && !var3.field2565) {
                        int var8 = var3.field2611 >> 16;
                        int var9 = var3.field2611 << 16 >> 16;
                        int var10 = field585 * var8;
                        int var11 = field585 * var9;
                        var3.field2607 = var3.field2607 + var10 & 0x7FF;
                        var3.field2563 = var3.field2563 + var11 & 0x7FF;
                        method1523(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cf(II)V")
    public static final void method172(int arg0) {
        method121();
        class7.method892();
        int var1 = class41.method2682(arg0).field1028;
        if (var1 == 0) {
            return;
        }
        int var2 = class158.field2687[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class103.method2192(0.9D);
                ((class109) Statics.field1758).method2216(0.9D);
            }
            if (var2 == 2) {
                class103.method2192(0.8D);
                ((class109) Statics.field1758).method2216(0.8D);
            }
            if (var2 == 3) {
                class103.method2192(0.7D);
                ((class109) Statics.field1758).method2216(0.7D);
            }
            if (var2 == 4) {
                class103.method2192(0.6D);
                ((class109) Statics.field1758).method2216(0.6D);
            }
            class39.method881();
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
            if (field602 != var3) {
                if (field602 == 0 && field699 != -1) {
                    class137.method2042(Statics.field618, field699, 0, var3, false);
                    field732 = false;
                } else if (var3 == 0) {
                    Statics.field2323.method2723();
                    class137.field2324 = 1;
                    Statics.field2554 = null;
                    field732 = false;
                } else if (class137.field2324 == 0) {
                    Statics.field2323.method2718(var3);
                } else {
                    Statics.field2322 = var3;
                }
                field602 = var3;
            }
        }
        if (var1 == 4) {
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
        if (var1 == 5) {
            field599 = var2;
        }
        if (var1 == 6) {
            field684 = var2;
        }
        if (var1 == 9) {
            field588 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field711 = 127;
        }
        if (var2 == 1) {
            field711 = 96;
        }
        if (var2 == 2) {
            field711 = 64;
        }
        if (var2 == 3) {
            field711 = 32;
        }
        if (var2 == 4) {
            field711 = 0;
        }
    }

    @ObfuscatedName("e.cr(Lfz;I)V")
    public static final void method135(class157 arg0) {
        int var1 = arg0.field2675;
        if (var1 == 324) {
            if (field731 == -1) {
                field731 = arg0.field2591;
                field612 = arg0.field2581;
            }
            if (field730.field2703) {
                arg0.field2591 = field731;
            } else {
                arg0.field2591 = field612;
            }
        } else if (var1 == 325) {
            if (field731 == -1) {
                field731 = arg0.field2591;
                field612 = arg0.field2581;
            }
            if (field730.field2703) {
                arg0.field2591 = field612;
            } else {
                arg0.field2591 = field731;
            }
        } else if (var1 == 327) {
            arg0.field2607 = 150;
            arg0.field2563 = (int) (Math.sin((double) field477 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2599 = 5;
            arg0.field2600 = 0;
        } else if (var1 == 328) {
            arg0.field2607 = 150;
            arg0.field2563 = (int) (Math.sin((double) field477 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2599 = 5;
            arg0.field2600 = 1;
        }
    }

    @ObfuscatedName("c.ch(I)V")
    public static final void method145() {
        field499.method2322(174);
        for (class4 var0 = (class4) field567.method3308(); var0 != null; var0 = (class4) field567.method3309()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method2212(var0, true);
            }
        }
        if (field607 != null) {
            method1523(field607);
            field607 = null;
        }
    }

    @ObfuscatedName("l.ca(IIII)Lm;")
    public static final class4 method122(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field60 = arg1;
        var3.field55 = arg2;
        field567.method3317(var3, (long) arg0);
        method2678(arg1);
        class25.method245(arg1);
        class157 var4 = class157.method2230(arg0);
        if (var4 != null) {
            method1523(var4);
        }
        if (field607 != null) {
            method1523(field607);
            field607 = null;
        }
        field628 = false;
        field615 = 0;
        method1229(Statics.field177, Statics.field1250, Statics.field1279, Statics.field251);
        if (field535 != -1) {
            int var5 = field535;
            if (class157.method1408(var5)) {
                method868(Statics.field2580[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("da.ce(Lm;ZI)V")
    public static final void method2212(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2808;
        arg0.method3357();
        if (arg1) {
            Statics.method123(var2);
        }
        method148(var2);
        class157 var4 = class157.method2230(var3);
        if (var4 != null) {
            method1523(var4);
        }
        field628 = false;
        field615 = 0;
        method1229(Statics.field177, Statics.field1250, Statics.field1279, Statics.field251);
        if (field535 != -1) {
            int var5 = field535;
            if (class157.method1408(var5)) {
                method868(Statics.field2580[var5], 1);
            }
        }
    }

    @ObfuscatedName("cz.cb(Lfz;I)Z")
    public static final boolean method2131(class157 arg0) {
        int var1 = arg0.field2675;
        if (var1 == 205) {
            field518 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field730.method3176(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field730.method3177(var4, var5 == 1);
        }
        if (var1 == 324) {
            field730.method3178(false);
        }
        if (var1 == 325) {
            field730.method3178(true);
        }
        if (var1 == 326) {
            field499.method2322(6);
            field730.method3179(field499);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("br.cq(IIIB)V")
    public static final void method1350(int arg0, int arg1, int arg2) {
        method168();
        class88.method1791(arg0, arg1, Statics.field1523.field1456 + arg0, Statics.field1523.field1457 + arg1);
        if (field706 == 2 || field706 == 5) {
            class88.method1806(arg0 + 25, arg1 + 5, 0, Statics.field215, Statics.field109);
        } else {
            int var3 = field664 + field559 & 0x7FF;
            int var4 = Statics.field1242.field433 / 32 + 48;
            int var5 = 464 - Statics.field1242.field407 / 32;
            Statics.field56.method1696(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field511 + 256, Statics.field215, Statics.field109);
            for (int var6 = 0; var6 < field700; var6++) {
                int var7 = field609[var6] * 4 + 2 - Statics.field1242.field433 / 32;
                int var8 = field501[var6] * 4 + 2 - Statics.field1242.field407 / 32;
                method2821(arg0, arg1, var7, var8, field509[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class176 var11 = field590[Statics.field2050][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1242.field433 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1242.field407 / 32;
                        method2821(arg0, arg1, var12, var13, Statics.field356[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field465; var14++) {
                class24 var15 = field584[field506[var14]];
                if (var15 != null && var15.method26()) {
                    class30 var16 = var15.field384;
                    if (var16 != null && var16.field796 != null) {
                        var16 = var16.method582();
                    }
                    if (var16 != null && var16.field789 && var16.field799) {
                        int var17 = var15.field433 / 32 - Statics.field1242.field433 / 32;
                        int var18 = var15.field407 / 32 - Statics.field1242.field407 / 32;
                        method2821(arg0, arg1, var17, var18, Statics.field356[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field593; var19++) {
                class3 var20 = field592[field594[var19]];
                if (var20 != null && var20.method26()) {
                    int var21 = var20.field433 / 32 - Statics.field1242.field433 / 32;
                    int var22 = var20.field407 / 32 - Statics.field1242.field407 / 32;
                    boolean var23 = false;
                    if (method1529(var20.field41)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field1242.field49 != 0 && var20.field49 != 0 && Statics.field1242.field49 == var20.field49) {
                        var24 = true;
                    }
                    if (var23) {
                        method2821(arg0, arg1, var21, var22, Statics.field356[3]);
                    } else if (var24) {
                        method2821(arg0, arg1, var21, var22, Statics.field356[4]);
                    } else {
                        method2821(arg0, arg1, var21, var22, Statics.field356[2]);
                    }
                }
            }
            if (field508 != 0 && field477 % 20 < 10) {
                if (field508 == 1 && field725 >= 0 && field725 < field584.length) {
                    class24 var25 = field584[field725];
                    if (var25 != null) {
                        int var26 = var25.field433 / 32 - Statics.field1242.field433 / 32;
                        int var27 = var25.field407 / 32 - Statics.field1242.field407 / 32;
                        method2195(arg0, arg1, var26, var27, Statics.field142[1]);
                    }
                }
                if (field508 == 2) {
                    int var28 = field488 * 4 - Statics.field176 * 4 + 2 - Statics.field1242.field433 / 32;
                    int var29 = field489 * 4 - Statics.field1999 * 4 + 2 - Statics.field1242.field407 / 32;
                    method2195(arg0, arg1, var28, var29, Statics.field142[1]);
                }
                if (field508 == 10 && field487 >= 0 && field487 < field592.length) {
                    class3 var30 = field592[field487];
                    if (var30 != null) {
                        int var31 = var30.field433 / 32 - Statics.field1242.field433 / 32;
                        int var32 = var30.field407 / 32 - Statics.field1242.field407 / 32;
                        method2195(arg0, arg1, var31, var32, Statics.field142[1]);
                    }
                }
            }
            if (field704 != 0) {
                int var33 = field704 * 4 + 2 - Statics.field1242.field433 / 32;
                int var34 = field705 * 4 + 2 - Statics.field1242.field407 / 32;
                method2821(arg0, arg1, var33, var34, Statics.field142[0]);
            }
            class88.method1797(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field706 < 3) {
            Statics.field1379.method1696(arg0, arg1, 33, 33, 25, 25, field559, 256, Statics.field1959, Statics.field321);
        } else {
            class88.method1806(arg0, arg1, 0, Statics.field1959, Statics.field321);
        }
        if (field677[arg2]) {
            Statics.field1523.method1777(arg0, arg1);
        }
        field676[arg2] = true;
    }

    @ObfuscatedName("cl.cy(IIIILco;I)V")
    public static final void method2195(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2821(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field664 + field559 & 0x7FF;
        int var7 = class103.field1761[var6];
        int var8 = class103.field1747[var6];
        int var9 = var7 * 256 / (field511 + 256);
        int var10 = var8 * 256 / (field511 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field746.method1744(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("ek.cx(IIIILco;I)V")
    public static final void method2821(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field664 + field559 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class103.field1761[var5];
        int var8 = class103.field1747[var5];
        int var9 = var7 * 256 / (field511 + 256);
        int var10 = var8 * 256 / (field511 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1688(Statics.field1523, arg0 + 94 + var11 - arg4.field1449 / 2 + 4, arg1 + 83 - var12 - arg4.field1448 / 2 - 4);
        } else {
            arg4.method1686(arg0 + 94 + var11 - arg4.field1449 / 2 + 4, arg1 + 83 - var12 - arg4.field1448 / 2 - 4);
        }
    }

    @ObfuscatedName("t.cj(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method208(int arg0, String arg1, String arg2) {
        method34(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("m.cm(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method34(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field683[var4] = field683[var4 - 1];
            field485[var4] = field485[var4 - 1];
            field686[var4] = field686[var4 - 1];
            field685[var4] = field685[var4 - 1];
        }
        field683[0] = arg0;
        field485[0] = arg1;
        field686[0] = arg2;
        field685[0] = arg3;
        field474++;
        field536 = field655;
    }

    @ObfuscatedName("bm.cz(Ljava/lang/String;B)Z")
    public static boolean method1529(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method2681(arg0, Statics.field520);
        for (int var2 = 0; var2 < field724; var2++) {
            if (var1.equalsIgnoreCase(class147.method2681(field726[var2].field367, Statics.field520))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class147.method2681(Statics.field1242.field41, Statics.field520))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("x.cu(Ljava/lang/String;S)Z")
    public static boolean method17(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method2681(arg0, Statics.field520);
        for (int var2 = 0; var2 < field563; var2++) {
            class11 var3 = field643[var2];
            if (var1.equalsIgnoreCase(class147.method2681(var3.field189, Statics.field520))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class147.method2681(var3.field191, Statics.field520))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("x.cl(Ljava/lang/String;ZB)V")
    public static final void method31(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field563 >= 100) {
            method208(0, "", class133.field2248);
            return;
        }
        String var2 = class147.method2681(arg0, Statics.field520);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field563; var3++) {
            class11 var4 = field643[var3];
            String var5 = class147.method2681(var4.field189, Statics.field520);
            if (var5 != null && var5.equals(var2)) {
                method208(0, "", arg0 + class133.field2225);
                return;
            }
            if (var4.field191 != null) {
                String var6 = class147.method2681(var4.field191, Statics.field520);
                if (var6 != null && var6.equals(var2)) {
                    method208(0, "", arg0 + class133.field2225);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field724; var7++) {
            class22 var8 = field726[var7];
            String var9 = class147.method2681(var8.field367, Statics.field520);
            if (var9 != null && var9.equals(var2)) {
                method208(0, "", class133.field2224 + arg0 + class133.field2231);
                return;
            }
            if (var8.field363 != null) {
                String var10 = class147.method2681(var8.field363, Statics.field520);
                if (var10 != null && var10.equals(var2)) {
                    method208(0, "", class133.field2224 + arg0 + class133.field2231);
                    return;
                }
            }
        }
        if (class147.method2681(Statics.field1242.field41, Statics.field520).equals(var2)) {
            method208(0, "", class133.field2100);
            return;
        }
        field499.method2322(26);
        class115 var11 = field499;
        int var12 = arg0.length() + 1;
        var11.method2554(var12);
        field499.method2439(arg0);
    }

    @ObfuscatedName("fu.dq(Ljava/lang/String;B)V")
    public static final void method3156(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class147.method2681(arg0, Statics.field520);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field724; var2++) {
            class22 var3 = field726[var2];
            String var4 = var3.field367;
            String var5 = class147.method2681(var4, Statics.field520);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field724--;
                for (int var7 = var2; var7 < field724; var7++) {
                    field726[var7] = field726[var7 + 1];
                }
                field663 = field655;
                field499.method2322(46);
                class115 var8 = field499;
                int var9 = arg0.length() + 1;
                var8.method2554(var9);
                field499.method2439(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cx.dt(Ljava/lang/String;IB)V")
    public static final void method2041(String arg0, int arg1) {
        field499.method2322(7);
        class115 var2 = field499;
        int var3 = arg0.length() + 1;
        var2.method2554(var3 + 1);
        field499.method2439(arg0);
        field499.method2469(arg1);
    }

    @ObfuscatedName("ai.da(I)V")
    public static final void method729() {
        field499.method2322(188);
        field499.method2554(0);
    }

    @ObfuscatedName("c.dw(II)V")
    public static void method148(int arg0) {
        for (class170 var1 = (class170) field672.method3308(); var1 != null; var1 = (class170) field672.method3309()) {
            if ((long) arg0 == (var1.field2808 >> 48 & 0xFFFFL)) {
                var1.method3357();
            }
        }
    }

    @ObfuscatedName("cd.dx(Lfz;I)I")
    public static int method1599(class157 arg0) {
        class170 var1 = (class170) field672.method3311(((long) arg0.field2558 << 32) + (long) arg0.field2568);
        return var1 == null ? arg0.field2626 : var1.field2790;
    }

    @ObfuscatedName("cp.dr(Lfz;I)Z")
    public static boolean method1665(class157 arg0) {
        if (field641) {
            if (method1599(arg0) != 0) {
                return false;
            }
            if (arg0.field2620 == 0) {
                return false;
            }
        }
        return arg0.field2579;
    }

    @ObfuscatedName("ab.dd(Lfz;I)Ljava/lang/String;")
    public static String method670(class157 arg0) {
        int var1 = method1599(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2674 == null || arg0.field2674.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2674;
        }
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.o")
    public static boolean field472 = true;

    @ObfuscatedName("client.n")
    public static int field563 = 1;

    @ObfuscatedName("client.v")
    public static int field669 = 0;

    @ObfuscatedName("client.f")
    public static boolean field476 = false;

    @ObfuscatedName("client.r")
    public static boolean field477 = false;

    @ObfuscatedName("client.d")
    public static int field478 = 0;

    @ObfuscatedName("client.q")
    public static int field479 = 0;

    @ObfuscatedName("client.u")
    public static boolean field632 = true;

    @ObfuscatedName("client.w")
    public static class164[] field531 = new class164[4];

    @ObfuscatedName("client.s")
    public static int field481 = 0;

    @ObfuscatedName("client.e")
    public static long field482 = 1L;

    @ObfuscatedName("client.j")
    public static int field484 = -1;

    @ObfuscatedName("client.h")
    public static int field644 = -1;

    @ObfuscatedName("client.m")
    public static int field486 = -1;

    @ObfuscatedName("client.t")
    public static boolean field487 = true;

    @ObfuscatedName("client.k")
    public static boolean field651 = false;

    @ObfuscatedName("client.z")
    public static int field489 = 0;

    @ObfuscatedName("client.at")
    public static int field490 = 0;

    @ObfuscatedName("client.ay")
    public static int field491 = 0;

    @ObfuscatedName("client.ae")
    public static int field555 = 0;

    @ObfuscatedName("client.af")
    public static int field595 = 0;

    @ObfuscatedName("client.ao")
    public static int field494 = 0;

    @ObfuscatedName("client.ad")
    public static int field505 = 0;

    @ObfuscatedName("client.aj")
    public static int field649 = 0;

    @ObfuscatedName("client.ah")
    public static int field497 = 0;

    @ObfuscatedName("client.aq")
    public static class127 field498 = new class127(new byte[5000]);

    @ObfuscatedName("client.an")
    public static int field499 = 0;

    @ObfuscatedName("client.ac")
    public static int field500 = 0;

    @ObfuscatedName("client.ak")
    public static int field501 = 0;

    @ObfuscatedName("client.bx")
    public static int field698 = 0;

    @ObfuscatedName("client.bv")
    public static int field712 = 0;

    @ObfuscatedName("client.bq")
    public static int field506 = 0;

    @ObfuscatedName("client.bj")
    public static int field507 = 0;

    @ObfuscatedName("client.bg")
    public static int field618 = 0;

    @ObfuscatedName("client.bt")
    public static class25[] field509 = new class25[32768];

    @ObfuscatedName("client.bl")
    public static int field510 = 0;

    @ObfuscatedName("client.bo")
    public static int[] field657 = new int[32768];

    @ObfuscatedName("client.ce")
    public static class116 field512 = new class116(5000);

    @ObfuscatedName("client.cd")
    public static class116 field513 = new class116(5000);

    @ObfuscatedName("client.cg")
    public static class116 field514 = new class116(5000);

    @ObfuscatedName("client.cl")
    public static int field496 = 0;

    @ObfuscatedName("client.cw")
    public static int field610 = 0;

    @ObfuscatedName("client.ch")
    public static int field517 = 0;

    @ObfuscatedName("client.ci")
    public static int field518 = 0;

    @ObfuscatedName("client.cj")
    public static int field519 = 0;

    @ObfuscatedName("client.cu")
    public static int field520 = 0;

    @ObfuscatedName("client.co")
    public static int field521 = 0;

    @ObfuscatedName("client.cc")
    public static int field522 = 0;

    @ObfuscatedName("client.cs")
    public static boolean field523 = false;

    @ObfuscatedName("client.ck")
    public static int field524 = 0;

    @ObfuscatedName("client.cf")
    public static int field619 = 0;

    @ObfuscatedName("client.cp")
    public static int field526 = 1;

    @ObfuscatedName("client.cn")
    public static int field586 = 0;

    @ObfuscatedName("client.cv")
    public static int field528 = 1;

    @ObfuscatedName("client.dr")
    public static int field671 = 0;

    @ObfuscatedName("client.df")
    public static boolean field579 = false;

    @ObfuscatedName("client.dy")
    public static int[][][] field533 = new int[4][13][13];

    @ObfuscatedName("client.da")
    public static final int[] field544 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dn")
    public static int field535 = 0;

    @ObfuscatedName("client.dg")
    public static int[][] field536 = new int[104][104];

    @ObfuscatedName("client.de")
    public static int[][] field608 = new int[104][104];

    @ObfuscatedName("client.dz")
    public static int[] field538 = new int[4000];

    @ObfuscatedName("client.dm")
    public static int[] field589 = new int[4000];

    @ObfuscatedName("client.dx")
    public static int field597 = 0;

    @ObfuscatedName("client.dv")
    public static int field541 = 2;

    @ObfuscatedName("client.dc")
    public static int field495 = 0;

    @ObfuscatedName("client.du")
    public static int field537 = 2;

    @ObfuscatedName("client.dt")
    public static int field504 = 0;

    @ObfuscatedName("client.dh")
    public static int field672 = 1;

    @ObfuscatedName("client.dw")
    public static int field547 = 0;

    @ObfuscatedName("client.db")
    public static int field660 = 0;

    @ObfuscatedName("client.em")
    public static int field548 = 2;

    @ObfuscatedName("client.ec")
    public static int field511 = 0;

    @ObfuscatedName("client.ex")
    public static int field550 = 1;

    @ObfuscatedName("client.eg")
    public static int field551 = 0;

    @ObfuscatedName("client.ez")
    public static int field601 = 0;

    @ObfuscatedName("client.eo")
    public static int field554 = 2301979;

    @ObfuscatedName("client.ea")
    public static int field542 = 5063219;

    @ObfuscatedName("client.es")
    public static int field556 = 3353893;

    @ObfuscatedName("client.fj")
    public static int field605 = 7759444;

    @ObfuscatedName("client.fr")
    public static boolean field525 = false;

    @ObfuscatedName("client.fb")
    public static int field559 = 0;

    @ObfuscatedName("client.fe")
    public static int field560 = 128;

    @ObfuscatedName("client.fc")
    public static int field561 = 0;

    @ObfuscatedName("client.fz")
    public static int field562 = 0;

    @ObfuscatedName("client.fa")
    public static int field585 = 0;

    @ObfuscatedName("client.fs")
    public static int field564 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field565 = false;

    @ObfuscatedName("client.fx")
    public static int field566 = 0;

    @ObfuscatedName("client.fd")
    public static int field732 = 0;

    @ObfuscatedName("client.fq")
    public static int field568 = 50;

    @ObfuscatedName("client.fg")
    public static int[] field656 = new int[field568];

    @ObfuscatedName("client.fk")
    public static int[] field553 = new int[field568];

    @ObfuscatedName("client.fh")
    public static int[] field598 = new int[field568];

    @ObfuscatedName("client.fi")
    public static int[] field572 = new int[field568];

    @ObfuscatedName("client.fw")
    public static int[] field730 = new int[field568];

    @ObfuscatedName("client.fl")
    public static int[] field574 = new int[field568];

    @ObfuscatedName("client.fm")
    public static int[] field546 = new int[field568];

    @ObfuscatedName("client.gm")
    public static String[] field576 = new String[field568];

    @ObfuscatedName("client.gj")
    public static int[][] field577 = new int[104][104];

    @ObfuscatedName("client.gy")
    public static int field578 = 0;

    @ObfuscatedName("client.gg")
    public static int field488 = -1;

    @ObfuscatedName("client.gi")
    public static int field580 = -1;

    @ObfuscatedName("client.gl")
    public static int field581 = 0;

    @ObfuscatedName("client.gs")
    public static int field582 = 0;

    @ObfuscatedName("client.ga")
    public static int field583 = 0;

    @ObfuscatedName("client.gw")
    public static int field731 = 0;

    @ObfuscatedName("client.gk")
    public static int field529 = 0;

    @ObfuscatedName("client.gh")
    public static int field539 = 0;

    @ObfuscatedName("client.gt")
    public static int field587 = 0;

    @ObfuscatedName("client.gq")
    public static int field588 = 0;

    @ObfuscatedName("client.gf")
    public static int field659 = 0;

    @ObfuscatedName("client.gz")
    public static int field590 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field591 = false;

    @ObfuscatedName("client.gn")
    public static int field668 = 0;

    @ObfuscatedName("client.gb")
    public static int field737 = 0;

    @ObfuscatedName("client.gd")
    public static class3[] field594 = new class3[2048];

    @ObfuscatedName("client.gp")
    public static int field630 = 0;

    @ObfuscatedName("client.go")
    public static int[] field596 = new int[2048];

    @ObfuscatedName("client.hx")
    public static int field592 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field717 = new int[2048];

    @ObfuscatedName("client.hm")
    public static class127[] field599 = new class127[2048];

    @ObfuscatedName("client.hd")
    public static int field690 = -1;

    @ObfuscatedName("client.hk")
    public static int field543 = 0;

    @ObfuscatedName("client.hf")
    public static int field602 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field603 = new int[1000];

    @ObfuscatedName("client.hp")
    public static final int[] field604 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field616 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field606 = new boolean[8];

    @ObfuscatedName("client.ha")
    public static int[] field607 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hh")
    public static class177[][][] field534 = new class177[4][104][104];

    @ObfuscatedName("client.he")
    public static class177 field609 = new class177();

    @ObfuscatedName("client.hz")
    public static class177 field540 = new class177();

    @ObfuscatedName("client.hj")
    public static class177 field611 = new class177();

    @ObfuscatedName("client.hi")
    public static int[] field492 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field613 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field614 = new int[25];

    @ObfuscatedName("client.hg")
    public static int field655 = 0;

    @ObfuscatedName("client.hr")
    public static boolean field652 = false;

    @ObfuscatedName("client.in")
    public static int field558 = 0;

    @ObfuscatedName("client.ie")
    public static int[] field503 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field527 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field620 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field621 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field515 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field623 = new String[500];

    @ObfuscatedName("client.ip")
    public static int field715 = -1;

    @ObfuscatedName("client.iv")
    public static int field625 = -1;

    @ObfuscatedName("client.ib")
    public static int field626 = 0;

    @ObfuscatedName("client.iy")
    public static int field627 = 50;

    @ObfuscatedName("client.ir")
    public static int field628 = 0;

    @ObfuscatedName("client.it")
    public static String field629 = null;

    @ObfuscatedName("client.if")
    public static boolean field679 = false;

    @ObfuscatedName("client.ih")
    public static int field631 = -1;

    @ObfuscatedName("client.ik")
    public static String field706 = null;

    @ObfuscatedName("client.ic")
    public static String field633 = null;

    @ObfuscatedName("client.jm")
    public static int field634 = -1;

    @ObfuscatedName("client.jn")
    public static class175 field635 = new class175(8);

    @ObfuscatedName("client.jp")
    public static int field636 = 0;

    @ObfuscatedName("client.jc")
    public static int field637 = 0;

    @ObfuscatedName("client.ja")
    public static class158 field638 = null;

    @ObfuscatedName("client.ju")
    public static int field480 = 0;

    @ObfuscatedName("client.ji")
    public static int field640 = 0;

    @ObfuscatedName("client.jh")
    public static int field641 = 0;

    @ObfuscatedName("client.jo")
    public static boolean field642 = false;

    @ObfuscatedName("client.jq")
    public static boolean field643 = false;

    @ObfuscatedName("client.jr")
    public static boolean field701 = false;

    @ObfuscatedName("client.jj")
    public static class158 field645 = null;

    @ObfuscatedName("client.je")
    public static class158 field646 = null;

    @ObfuscatedName("client.jy")
    public static int field575 = 0;

    @ObfuscatedName("client.jl")
    public static int field648 = 0;

    @ObfuscatedName("client.jb")
    public static class158 field493 = null;

    @ObfuscatedName("client.jk")
    public static boolean field600 = false;

    @ObfuscatedName("client.jd")
    public static int field615 = -1;

    @ObfuscatedName("client.jt")
    public static int field475 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field653 = false;

    @ObfuscatedName("client.jf")
    public static int field552 = -1;

    @ObfuscatedName("client.jw")
    public static int field549 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field508 = false;

    @ObfuscatedName("client.ky")
    public static int field474 = 1;

    @ObfuscatedName("client.kk")
    public static int[] field658 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field711 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field567 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field661 = 0;

    @ObfuscatedName("client.km")
    public static int[] field662 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field545 = 0;

    @ObfuscatedName("client.kw")
    public static int field664 = 0;

    @ObfuscatedName("client.kq")
    public static int field665 = 0;

    @ObfuscatedName("client.ka")
    public static int field666 = 0;

    @ObfuscatedName("client.kb")
    public static int field716 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field684 = new int[2000];

    @ObfuscatedName("client.ki")
    public static String[] field532 = new String[1000];

    @ObfuscatedName("client.kx")
    public static int field670 = 0;

    @ObfuscatedName("client.kh")
    public static class177 field593 = new class177();

    @ObfuscatedName("client.kd")
    public static class177 field557 = new class177();

    @ObfuscatedName("client.kg")
    public static class177 field673 = new class177();

    @ObfuscatedName("client.ke")
    public static class175 field674 = new class175(512);

    @ObfuscatedName("client.kn")
    public static int field676 = 0;

    @ObfuscatedName("client.kj")
    public static int field677 = -2;

    @ObfuscatedName("client.ks")
    public static boolean[] field678 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field584 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field680 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static int[] field681 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field682 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field683 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field624 = new int[100];

    @ObfuscatedName("client.ls")
    public static int field639 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field686 = new int[100];

    @ObfuscatedName("client.lm")
    public static String[] field687 = new String[100];

    @ObfuscatedName("client.le")
    public static String[] field688 = new String[100];

    @ObfuscatedName("client.lj")
    public static String[] field689 = new String[100];

    @ObfuscatedName("client.ln")
    public static int field485 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field691 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ly")
    public static int field692 = 0;

    @ObfuscatedName("client.lw")
    public static int field693 = 0;

    @ObfuscatedName("client.lh")
    public static long[] field694 = new long[100];

    @ObfuscatedName("client.lp")
    public static int field710 = 0;

    @ObfuscatedName("client.lr")
    public static int field696 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field697 = new int[128];

    @ObfuscatedName("client.lk")
    public static int[] field722 = new int[128];

    @ObfuscatedName("client.lv")
    public static long field699 = -1L;

    @ObfuscatedName("client.lt")
    public static String field700 = null;

    @ObfuscatedName("client.ms")
    public static String field573 = null;

    @ObfuscatedName("client.mh")
    public static int field702 = -1;

    @ObfuscatedName("client.mf")
    public static int field703 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field704 = new int[1000];

    @ObfuscatedName("client.mu")
    public static int[] field705 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class86[] field654 = new class86[1000];

    @ObfuscatedName("client.mt")
    public static int field707 = 0;

    @ObfuscatedName("client.ml")
    public static int field708 = 0;

    @ObfuscatedName("client.mq")
    public static int field709 = 0;

    @ObfuscatedName("client.mn")
    public static int field617 = 255;

    @ObfuscatedName("client.mc")
    public static int field663 = -1;

    @ObfuscatedName("client.mi")
    public static boolean field569 = false;

    @ObfuscatedName("client.mz")
    public static int field713 = 127;

    @ObfuscatedName("client.mm")
    public static int field714 = 127;

    @ObfuscatedName("client.nd")
    public static int field685 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field647 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field570 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field718 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field719 = new int[50];

    @ObfuscatedName("client.ne")
    public static class57[] field720 = new class57[50];

    @ObfuscatedName("client.nj")
    public static boolean field516 = false;

    @ObfuscatedName("client.np")
    public static boolean[] field650 = new boolean[5];

    @ObfuscatedName("client.nz")
    public static int[] field723 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field724 = new int[5];

    @ObfuscatedName("client.nx")
    public static int[] field725 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field726 = new int[5];

    @ObfuscatedName("client.og")
    public static int field727 = 0;

    @ObfuscatedName("client.ou")
    public static int field728 = 0;

    @ObfuscatedName("client.oq")
    public static class23[] field729 = new class23[200];

    @ObfuscatedName("client.ol")
    public static class173 field470 = new class173();

    @ObfuscatedName("client.ot")
    public static int field667 = 0;

    @ObfuscatedName("client.ok")
    public static class11[] field695 = new class11[100];

    @ObfuscatedName("client.ob")
    public static class163 field733 = new class163();

    @ObfuscatedName("client.oe")
    public static int field734 = -1;

    @ObfuscatedName("client.oz")
    public static int field735 = -1;

    @ObfuscatedName("client.o(I)V")
    public final void method244() {
    }

    public final void init() {
        if (!this.method1453()) {
            return;
        }
        class167[] var1 = class167.method30();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2788);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2788)) {
                    case 1:
                        int var6 = Integer.parseInt(var4);
                        class132[] var7 = new class132[] { class132.field2065, class132.field2070, class132.field2066, class132.field2069 };
                        class132[] var8 = var7;
                        int var9 = 0;
                        class132 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class132 var10 = var8[var9];
                            if (var10.field2072 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field473 = var11;
                        break;
                    case 2:
                        class133[] var5 = new class133[] { class133.field2087, class133.field2076, class133.field2086, class133.field2079, class133.field2074, class133.field2077 };
                        Statics.field261 = (class133) Statics.method2264(var5, Integer.parseInt(var4));
                        if (Statics.field261 == class133.field2079) {
                            Statics.field2049 = class186.field2866;
                        } else {
                            Statics.field2049 = class186.field2864;
                        }
                        break;
                    case 3:
                        field669 = Integer.parseInt(var4);
                        break;
                    case 4:
                        Statics.field13 = var4;
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                            field476 = true;
                        } else {
                            field476 = false;
                        }
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 7:
                        field478 = Integer.parseInt(var4);
                    case 8:
                    default:
                        break;
                    case 9:
                        field563 = Integer.parseInt(var4);
                }
            }
        }
        class95.field1601 = false;
        field477 = false;
        Statics.field1238 = this.getCodeBase().getHost();
        String var12 = Statics.field473.field2068;
        byte var13 = 0;
        try {
            Statics.field1435 = 16;
            Statics.field1442 = var13;
            try {
                Statics.field222 = System.getProperty("os.name");
            } catch (Exception var64) {
                Statics.field222 = "Unknown";
            }
            Statics.field267 = Statics.field222.toLowerCase();
            try {
                Statics.field1516 = System.getProperty("user.home");
                if (Statics.field1516 != null) {
                    Statics.field1516 = Statics.field1516 + "/";
                }
            } catch (Exception var63) {
            }
            try {
                if (Statics.field267.startsWith("win")) {
                    if (Statics.field1516 == null) {
                        Statics.field1516 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1516 == null) {
                    Statics.field1516 = System.getenv("HOME");
                }
                if (Statics.field1516 != null) {
                    Statics.field1516 = Statics.field1516 + "/";
                }
            } catch (Exception var62) {
            }
            if (Statics.field1516 == null) {
                Statics.field1516 = "~/";
            }
            Statics.field1445 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1516, "/tmp/", "" };
            Statics.field1685 = new String[] { ".jagex_cache_" + Statics.field1442, ".file_store_" + Statics.field1442 };
            int var17 = 0;
            label292: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field1446 = new File(Statics.field1516, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field1446.exists()) {
                    try {
                        class29 var22 = new class29(Statics.field1446, "rw", 10000L);
                        class127 var23 = new class127((int) var22.method581());
                        while (var23.field2038 < var23.field2037.length) {
                            int var24 = var22.method582(var23.field2037, var23.field2038, var23.field2037.length - var23.field2038);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field2038 += var24;
                        }
                        var23.field2038 = 0;
                        int var25 = var23.method2659();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2659();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2497();
                            if (var26 == 1) {
                                var20 = var23.method2497();
                            }
                        } else {
                            var19 = var23.method2528();
                            if (var26 == 1) {
                                var20 = var23.method2528();
                            }
                        }
                        var22.method594();
                    } catch (IOException var67) {
                        var67.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class82.method1428(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label267: for (int var30 = 0; var30 < Statics.field1685.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field1445.length; var31++) {
                            File var32 = new File(Statics.field1445[var31] + Statics.field1685[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class82.method1428(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label267;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field1516 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
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
                    } catch (Exception var66) {
                        var66.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    File var42 = new File(var19);
                    Object var43 = null;
                    try {
                        class29 var44 = new class29(Statics.field1446, "rw", 10000L);
                        class127 var45 = new class127(500);
                        var45.method2474(3);
                        var45.method2474(var43 == null ? 0 : 1);
                        var45.method2481(var42.getPath());
                        if (var43 != null) {
                            var45.method2481(((File) var43).getPath());
                        }
                        var44.method579(var45.field2037, 0, var45.field2038);
                        var44.method594();
                    } catch (IOException var61) {
                        var61.printStackTrace();
                    }
                }
                File var47 = new File(var19);
                Statics.field1313 = var47;
                if (!Statics.field1313.exists()) {
                    Statics.field1313.mkdirs();
                }
                File[] var48 = Statics.field1313.listFiles();
                if (var48 != null) {
                    File[] var49 = var48;
                    for (int var50 = 0; var50 < var49.length; var50++) {
                        File var51 = var49[var50];
                        if (!class82.method1428(var51, false)) {
                            var17++;
                            continue label292;
                        }
                    }
                }
                break;
            }
            class72.method2405(Statics.field1313);
            try {
                File var52 = new File(Statics.field1516, "random.dat");
                if (var52.exists()) {
                    class82.field1439 = new class30(new class29(var52, "rw", 25L), 24, 0);
                } else {
                    label218: for (int var53 = 0; var53 < Statics.field1685.length; var53++) {
                        for (int var54 = 0; var54 < Statics.field1445.length; var54++) {
                            File var55 = new File(Statics.field1445[var54] + Statics.field1685[var53] + File.separatorChar + "random.dat");
                            if (var55.exists()) {
                                class82.field1439 = new class30(new class29(var55, "rw", 25L), 24, 0);
                                break label218;
                            }
                        }
                    }
                }
                if (class82.field1439 == null) {
                    RandomAccessFile var56 = new RandomAccessFile(var52, "rw");
                    int var57 = var56.read();
                    var56.seek(0L);
                    var56.write(var57);
                    var56.seek(0L);
                    var56.close();
                    class82.field1439 = new class30(new class29(var52, "rw", 25L), 24, 0);
                }
            } catch (IOException var65) {
            }
            class82.field1440 = new class30(new class29(class72.method1400("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1443 = new class30(new class29(class72.method1400("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field113 = new class30[Statics.field1435];
            for (int var59 = 0; var59 < Statics.field1435; var59++) {
                Statics.field113[var59] = new class30(new class29(class72.method1400("main_file_cache.idx" + var59), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var68) {
            class80.method1379((String) null, var68);
        }
        Statics.field471 = this;
        this.method1483(765, 503, 17);
    }

    @ObfuscatedName("client.l(I)V")
    public final void method246() {
        Statics.field1424 = field669 == 0 ? 43594 : field563 + 40000;
        Statics.field408 = field669 == 0 ? 443 : field563 + 50000;
        Statics.field1797 = Statics.field1424;
        Statics.field2018 = class161.field2714;
        Statics.field2733 = class161.field2719;
        Statics.field2731 = class161.field2713;
        Statics.field385 = class161.field2716;
        if (Statics.field1340.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1375[44] = 71;
            class75.field1375[45] = 26;
            class75.field1375[46] = 72;
            class75.field1375[47] = 73;
            class75.field1375[59] = 57;
            class75.field1375[61] = 27;
            class75.field1375[91] = 42;
            class75.field1375[92] = 74;
            class75.field1375[93] = 43;
            class75.field1375[192] = 28;
            class75.field1375[222] = 58;
            class75.field1375[520] = 59;
        } else {
            class75.field1375[186] = 57;
            class75.field1375[187] = 27;
            class75.field1375[188] = 71;
            class75.field1375[189] = 26;
            class75.field1375[190] = 72;
            class75.field1375[191] = 73;
            class75.field1375[192] = 58;
            class75.field1375[219] = 42;
            class75.field1375[220] = 74;
            class75.field1375[221] = 43;
            class75.field1375[222] = 59;
            class75.field1375[223] = 28;
        }
        class75.method1613(Statics.field14);
        Canvas var1 = Statics.field14;
        var1.addMouseListener(class77.field1401);
        var1.addMouseMotionListener(class77.field1401);
        var1.addFocusListener(class77.field1401);
        class78 var2;
        try {
            var2 = new class78();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field940 = var2;
        if (Statics.field940 != null) {
            Statics.field940.method1380(Statics.field14);
        }
        Statics.field1631 = new class71(255, class82.field1440, class82.field1443, 500000);
        class29 var4 = null;
        class12 var5 = new class12();
        try {
            var4 = class82.method228("", Statics.field261.field2080, false);
            byte[] var6 = new byte[(int) var4.method581()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method582(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class12(new class127(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method594();
            }
        } catch (Exception var12) {
        }
        Statics.field380 = var5;
        if (field669 != 0) {
            field651 = true;
        }
    }

    @ObfuscatedName("client.v(I)V")
    public final void method247() {
        field481++;
        this.method250();
        class157.method62();
        try {
            if (class138.field2347 == 1) {
                int var1 = Statics.field2341.method2768();
                if (var1 > 0 && Statics.field2341.method2774()) {
                    int var2 = var1 - Statics.field874;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2341.method2766(var2);
                } else {
                    Statics.field2341.method2773();
                    Statics.field2341.method2862();
                    if (Statics.field746 == null) {
                        class138.field2347 = 0;
                    } else {
                        class138.field2347 = 2;
                    }
                    Statics.field1309 = null;
                    Statics.field1377 = null;
                }
            }
        } catch (Exception var12) {
            var12.printStackTrace();
            Statics.field2341.method2773();
            class138.field2347 = 0;
            Statics.field1309 = null;
            Statics.field1377 = null;
            Statics.field746 = null;
        }
        method2340();
        class75.method663();
        class77 var4 = class77.field1401;
        synchronized (class77.field1401) {
            class77.field1390 = class77.field1392;
            class77.field1397 = class77.field1393;
            class77.field1391 = class77.field1394;
            class77.field1402 = class77.field1398;
            class77.field1395 = class77.field1399;
            class77.field1404 = class77.field1400;
            class77.field1396 = class77.field1406;
            class77.field1398 = 0;
        }
        if (Statics.field940 != null) {
            int var6 = Statics.field940.method1382();
            field670 = var6;
        }
        if (field479 == 0) {
            method122();
            Statics.field1237.method1376();
            for (int var7 = 0; var7 < 32; var7++) {
                field1324[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field1316[var8] = 0L;
            }
            Statics.field141 = 0;
        } else if (field479 == 5) {
            class21.method2350(this);
            method122();
            Statics.field1237.method1376();
            for (int var9 = 0; var9 < 32; var9++) {
                field1324[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field1316[var10] = 0L;
            }
            Statics.field141 = 0;
        } else if (field479 == 10) {
            class21.method2350(this);
        } else if (field479 == 20) {
            class21.method2350(this);
            method55();
        } else if (field479 == 25) {
            method4();
        }
        if (field479 == 30) {
            method1589();
        } else if (field479 == 40) {
            method55();
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method379() {
        boolean var1 = class138.method1265();
        if (var1 && field569 && Statics.field169 != null) {
            Statics.field169.method1194();
        }
        if (field1328) {
            class75.method215(Statics.field14);
            Canvas var2 = Statics.field14;
            var2.removeMouseListener(class77.field1401);
            var2.removeMouseMotionListener(class77.field1401);
            var2.removeFocusListener(class77.field1401);
            class77.field1392 = 0;
            if (Statics.field940 != null) {
                Statics.field940.method1389(Statics.field14);
            }
            this.method1452();
            class75.method1613(Statics.field14);
            Canvas var3 = Statics.field14;
            var3.addMouseListener(class77.field1401);
            var3.addMouseMotionListener(class77.field1401);
            var3.addFocusListener(class77.field1401);
            if (Statics.field940 != null) {
                Statics.field940.method1380(Statics.field14);
            }
        }
        if (field479 == 0) {
            class73.method1406(class21.field316, class21.field317, (Color) null);
        } else if (field479 == 5) {
            Statics.method210(Statics.field196, Statics.field1554);
        } else if (field479 == 10) {
            Statics.method210(Statics.field196, Statics.field1554);
        } else if (field479 == 20) {
            Statics.method210(Statics.field196, Statics.field1554);
        } else if (field479 == 25) {
            if (field671 == 1) {
                if (field619 > field526) {
                    field526 = field619;
                }
                int var4 = (field526 * 50 - field619 * 50) / field526;
                method3173(class134.field2095 + class2.field30 + class2.field28 + var4 + "%" + class2.field22, false);
            } else if (field671 == 2) {
                if (field586 > field528) {
                    field528 = field586;
                }
                int var5 = (field528 * 50 - field586 * 50) / field528 + 50;
                method3173(class134.field2095 + class2.field30 + class2.field28 + var5 + "%" + class2.field22, false);
            } else {
                method3173(class134.field2095, false);
            }
        } else if (field479 == 30) {
            method60();
        } else if (field479 == 40) {
            method3173(class134.field2096 + class2.field30 + class134.field2141, false);
        }
        if (field479 == 30 && field639 == 0 && !field1326) {
            try {
                Graphics var6 = Statics.field14.getGraphics();
                for (int var7 = 0; var7 < field676; var7++) {
                    if (field584[var7]) {
                        Statics.field1381.method1643(var6, field681[var7], field682[var7], field683[var7], field624[var7]);
                        field584[var7] = false;
                    }
                }
            } catch (Exception var13) {
                Statics.field14.repaint();
            }
        } else if (field479 > 0) {
            try {
                Graphics var9 = Statics.field14.getGraphics();
                Statics.field1381.method1661(var9, 0, 0);
                field1326 = false;
                for (int var10 = 0; var10 < field676; var10++) {
                    field584[var10] = false;
                }
            } catch (Exception var12) {
                Statics.field14.repaint();
            }
        }
    }

    @ObfuscatedName("client.x(B)V")
    public final void method249() {
        if (Statics.field483 != null) {
            Statics.field483.field244 = false;
        }
        Statics.field483 = null;
        if (Statics.field77 != null) {
            Statics.field77.method1410();
            Statics.field77 = null;
        }
        class75.method146();
        class77.method2226();
        Statics.field940 = null;
        if (Statics.field169 != null) {
            Statics.field169.method1200();
        }
        if (Statics.field287 != null) {
            Statics.field287.method1200();
        }
        if (Statics.field2526 != null) {
            Statics.field2526.method1410();
        }
        class157.method665();
        class82.method119();
    }

    @ObfuscatedName("o.c(II)V")
    public static void method22(int arg0) {
        if (field479 == arg0) {
            return;
        }
        if (field479 == 0) {
            Statics.method222();
        }
        if (arg0 == 20 || arg0 == 40) {
            field712 = 0;
            field506 = 0;
            field507 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field334 != null) {
            Statics.field334.method1410();
            Statics.field334 = null;
        }
        if (field479 == 25) {
            field671 = 0;
            field619 = 0;
            field526 = 1;
            field586 = 0;
            field528 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method241(Statics.field14, Statics.field11, Statics.field956);
        } else {
            class21.method854();
        }
        field479 = arg0;
    }

    @ObfuscatedName("client.f(B)V")
    public void method250() {
        if (field479 != 1000) {
            boolean var1 = class153.method1291();
            if (!var1) {
                this.method251();
            }
        }
    }

    @ObfuscatedName("client.r(B)V")
    public void method251() {
        if (class153.field2540 >= 4) {
            this.method1461("js5crc");
            field479 = 1000;
            return;
        }
        if (class153.field2525 >= 4) {
            if (field479 <= 5) {
                this.method1461("js5io");
                field479 = 1000;
                return;
            }
            field501 = 3000;
            class153.field2525 = 3;
        }
        if (--field501 + 1 > 0) {
            return;
        }
        try {
            if (field500 == 0) {
                Statics.field1383 = Statics.field895.method1519(Statics.field1238, Statics.field1797);
                field500++;
            }
            if (field500 == 1) {
                if (Statics.field1383.field1413 == 2) {
                    this.method282(-1);
                    return;
                }
                if (Statics.field1383.field1413 == 1) {
                    field500++;
                }
            }
            if (field500 == 2) {
                Statics.field774 = new class70((Socket) Statics.field1383.field1412, Statics.field895);
                class127 var1 = new class127(5);
                var1.method2474(15);
                var1.method2606(17);
                Statics.field774.method1414(var1.field2037, 0, 5);
                field500++;
                Statics.field122 = class121.method711();
            }
            if (field500 == 3) {
                if (field479 <= 5 || Statics.field774.method1409() > 0) {
                    int var2 = Statics.field774.method1411();
                    if (var2 != 0) {
                        this.method282(var2);
                        return;
                    }
                    field500++;
                } else if (class121.method711() - Statics.field122 > 30000L) {
                    this.method282(-2);
                    return;
                }
            }
            if (field500 == 4) {
                class153.method2344(Statics.field774, field479 > 20);
                Statics.field1383 = null;
                Statics.field774 = null;
                field500 = 0;
                field698 = 0;
            }
        } catch (IOException var4) {
            this.method282(-3);
        }
    }

    @ObfuscatedName("client.d(II)V")
    public void method282(int arg0) {
        Statics.field1383 = null;
        Statics.field774 = null;
        field500 = 0;
        if (Statics.field1797 == Statics.field1424) {
            Statics.field1797 = Statics.field408;
        } else {
            Statics.field1797 = Statics.field1424;
        }
        field698++;
        if (field698 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field479 <= 5) {
                this.method1461("js5connect_full");
                field479 = 1000;
            } else {
                field501 = 3000;
            }
        } else if (field698 >= 2 && arg0 == 6) {
            this.method1461("js5connect_outofdate");
            field479 = 1000;
        } else if (field698 >= 4) {
            if (field479 <= 5) {
                this.method1461("js5connect");
                field479 = 1000;
            } else {
                field501 = 3000;
            }
        }
    }

    @ObfuscatedName("f.a(I)V")
    public static void method122() {
        if (field499 == 0) {
            Statics.field53 = new class95(4, 104, 104, class9.field136);
            for (int var0 = 0; var0 < 4; var0++) {
                field531[var0] = new class164(104, 104);
            }
            Statics.field248 = new class86(512, 512);
            class21.field317 = class134.field2099;
            class21.field316 = 5;
            field499 = 20;
        } else if (field499 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1790[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method2021(var1, 500, 800, 512, 334);
            class21.field317 = class134.field2102;
            class21.field316 = 10;
            field499 = 30;
        } else if (field499 == 30) {
            Statics.field1419 = method1595(0, false, true, true);
            Statics.field502 = method1595(1, false, true, true);
            Statics.field1292 = method1595(2, true, false, true);
            Statics.field2001 = method1595(3, false, true, true);
            Statics.field197 = method1595(4, false, true, true);
            Statics.field1032 = method1595(5, true, true, true);
            Statics.field1211 = method1595(6, true, true, false);
            Statics.field407 = method1595(7, false, true, true);
            Statics.field956 = method1595(8, false, true, true);
            Statics.field33 = method1595(9, false, true, true);
            Statics.field11 = method1595(10, false, true, true);
            Statics.field1859 = method1595(11, false, true, true);
            Statics.field1837 = method1595(12, false, true, true);
            Statics.field198 = method1595(13, true, false, true);
            Statics.field622 = method1595(14, false, true, false);
            Statics.field1763 = method1595(15, false, true, true);
            class21.field317 = class134.field2294;
            class21.field316 = 20;
            field499 = 40;
        } else if (field499 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1419.method3085() * 4 / 100;
            int var8 = var7 + Statics.field502.method3085() * 4 / 100;
            int var9 = var8 + Statics.field1292.method3085() * 2 / 100;
            int var10 = var9 + Statics.field2001.method3085() * 2 / 100;
            int var11 = var10 + Statics.field197.method3085() * 6 / 100;
            int var12 = var11 + Statics.field1032.method3085() * 4 / 100;
            int var13 = var12 + Statics.field1211.method3085() * 2 / 100;
            int var14 = var13 + Statics.field407.method3085() * 60 / 100;
            int var15 = var14 + Statics.field956.method3085() * 2 / 100;
            int var16 = var15 + Statics.field33.method3085() * 2 / 100;
            int var17 = var16 + Statics.field11.method3085() * 2 / 100;
            int var18 = var17 + Statics.field1859.method3085() * 2 / 100;
            int var19 = var18 + Statics.field1837.method3085() * 2 / 100;
            int var20 = var19 + Statics.field198.method3085() * 2 / 100;
            int var21 = var20 + Statics.field622.method3085() * 2 / 100;
            int var22 = var21 + Statics.field1763.method3085() * 2 / 100;
            if (var22 == 100) {
                class21.field317 = class134.field2131;
                class21.field316 = 30;
                field499 = 45;
            } else {
                if (var22 != 0) {
                    class21.field317 = class134.field2111 + var22 + "%";
                }
                class21.field316 = 30;
            }
        } else if (field499 == 45) {
            class52.method2728(22050, !field477, 2);
            class141 var23 = new class141();
            var23.method2775(9, 128);
            Statics.field169 = class52.method576(Statics.field895, Statics.field14, 0, 22050);
            Statics.field169.method1209(var23);
            class138.method840(Statics.field1763, Statics.field622, Statics.field197, var23);
            Statics.field287 = class52.method576(Statics.field895, Statics.field14, 1, 2048);
            Statics.field119 = new class46();
            Statics.field287.method1209(Statics.field119);
            Statics.field967 = new class62(22050, Statics.field1112);
            class21.field317 = class134.field2103;
            class21.field316 = 35;
            field499 = 50;
        } else if (field499 == 50) {
            int var24 = 0;
            if (Statics.field1554 == null) {
                Statics.field1554 = class84.method213(Statics.field956, Statics.field198, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field921 == null) {
                Statics.field921 = class84.method213(Statics.field956, Statics.field198, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field196 == null) {
                Statics.field196 = class84.method213(Statics.field956, Statics.field198, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class21.field317 = class134.field2104 + var24 * 100 / 3 + "%";
                class21.field316 = 40;
            } else {
                Statics.field1458 = new class151(true);
                class21.field317 = class134.field2165;
                class21.field316 = 40;
                field499 = 60;
            }
        } else if (field499 == 60) {
            class154 var25 = Statics.field11;
            class154 var26 = Statics.field956;
            int var27 = 0;
            if (var25.method3016("title.jpg", "")) {
                var27++;
            }
            if (var26.method3016("logo", "")) {
                var27++;
            }
            if (var26.method3016("titlebox", "")) {
                var27++;
            }
            if (var26.method3016("titlebutton", "")) {
                var27++;
            }
            if (var26.method3016("runes", "")) {
                var27++;
            }
            if (var26.method3016("title_mute", "")) {
                var27++;
            }
            var26.method3016("sl_back", "");
            var26.method3016("sl_flags", "");
            var26.method3016("sl_arrows", "");
            var26.method3016("sl_stars", "");
            var26.method3016("sl_button", "");
            byte var30 = 6;
            if (var27 < var30) {
                class21.field317 = class134.field2106 + var27 * 100 / var30 + "%";
                class21.field316 = 50;
            } else {
                class21.field317 = class134.field2107;
                class21.field316 = 50;
                method22(5);
                field499 = 70;
            }
        } else if (field499 == 70) {
            if (Statics.field1292.method3002()) {
                class37.method2248(Statics.field1292);
                class33.method223(Statics.field1292);
                class154 var32 = Statics.field1292;
                class154 var33 = Statics.field407;
                Statics.field939 = var32;
                Statics.field1928 = var33;
                Statics.field934 = Statics.field939.method3008(3);
                class32.method574(Statics.field1292, Statics.field407, field477);
                class31.method1682(Statics.field1292, Statics.field407);
                class154 var34 = Statics.field1292;
                class154 var35 = Statics.field407;
                boolean var36 = field476;
                class183 var37 = Statics.field1554;
                Statics.field985 = var34;
                Statics.field986 = var35;
                Statics.field987 = var36;
                Statics.field985.method3008(10);
                Statics.field991 = var37;
                class154 var38 = Statics.field1292;
                class154 var39 = Statics.field1419;
                class154 var40 = Statics.field502;
                Statics.field883 = var38;
                Statics.field900 = var39;
                Statics.field878 = var40;
                class35.method3103(Statics.field1292, Statics.field407);
                class154 var41 = Statics.field1292;
                Statics.field961 = var41;
                class42.method815(Statics.field1292);
                class154 var42 = Statics.field2001;
                class154 var43 = Statics.field407;
                class154 var44 = Statics.field956;
                class154 var45 = Statics.field198;
                Statics.field2576 = var42;
                Statics.field2577 = var43;
                Statics.field2578 = var44;
                Statics.field1185 = var45;
                Statics.field2608 = new class158[Statics.field2576.method3009()][];
                Statics.field2575 = new boolean[Statics.field2576.method3009()];
                class154 var46 = Statics.field1292;
                Statics.field1036 = var46;
                class154 var47 = Statics.field1292;
                Statics.field972 = var47;
                class21.field317 = class134.field2109;
                class21.field316 = 60;
                field499 = 80;
            } else {
                class21.field317 = class134.field2187 + Statics.field1292.method3087() + "%";
                class21.field316 = 60;
            }
        } else if (field499 == 80) {
            int var48 = 0;
            if (Statics.field240 == null) {
                Statics.field240 = class84.method136(Statics.field956, "compass", "");
            } else {
                var48++;
            }
            if (Statics.field245 == null) {
                Statics.field245 = class84.method136(Statics.field956, "mapedge", "");
            } else {
                var48++;
            }
            if (Statics.field247 == null) {
                Statics.field247 = class84.method300(Statics.field956, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field721 == null) {
                Statics.field721 = class84.method782(Statics.field956, "mapfunction", "");
            } else {
                var48++;
            }
            if (Statics.field262 == null) {
                Statics.field262 = class84.method782(Statics.field956, "hitmarks", "");
            } else {
                var48++;
            }
            if (Statics.field413 == null) {
                Statics.field413 = class84.method782(Statics.field956, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field369 == null) {
                Statics.field369 = class84.method782(Statics.field956, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field117 == null) {
                Statics.field117 = class84.method782(Statics.field956, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field2456 == null) {
                Statics.field2456 = class84.method782(Statics.field956, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field754 == null) {
                Statics.field754 = class84.method782(Statics.field956, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field1468 == null) {
                Statics.field1468 = class84.method782(Statics.field956, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field291 == null) {
                Statics.field291 = class84.method300(Statics.field956, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field1551 == null) {
                Statics.field1551 = class84.method300(Statics.field956, "mod_icons", "");
            } else {
                var48++;
            }
            if (Statics.field24 == null) {
                Statics.field24 = class84.method206(Statics.field956, "mapback", "");
            } else {
                var48++;
            }
            if (var48 < 14) {
                class21.field317 = class134.field2110 + var48 * 100 / 14 + "%";
                class21.field316 = 70;
            } else {
                Statics.field2844 = Statics.field1551;
                Statics.field245.method1804();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                for (int var53 = 0; var53 < Statics.field721.length; var53++) {
                    Statics.field721[var53].method1722(var49 + var52, var50 + var52, var51 + var52);
                }
                Statics.field247[0].method1821(var49 + var52, var50 + var52, var51 + var52);
                Statics.field2033 = new int[33];
                Statics.field612 = new int[33];
                Statics.field1384 = new int[151];
                Statics.field2015 = new int[151];
                for (int var54 = 0; var54 < 33; var54++) {
                    int var55 = 999;
                    int var56 = 0;
                    for (int var57 = 0; var57 < 34; var57++) {
                        if (Statics.field24.field1487[Statics.field24.field1485 * var54 + var57] == 0) {
                            if (var55 == 999) {
                                var55 = var57;
                            }
                        } else if (var55 != 999) {
                            var56 = var57;
                            break;
                        }
                    }
                    Statics.field2033[var54] = var55;
                    Statics.field612[var54] = var56 - var55;
                }
                for (int var58 = 5; var58 < 156; var58++) {
                    int var59 = 999;
                    int var60 = 0;
                    for (int var61 = 25; var61 < 172; var61++) {
                        if (Statics.field24.field1487[Statics.field24.field1485 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                            if (var59 == 999) {
                                var59 = var61;
                            }
                        } else if (var59 != 999) {
                            var60 = var61;
                            break;
                        }
                    }
                    Statics.field1384[var58 - 5] = var59 - 25;
                    Statics.field2015[var58 - 5] = var60 - var59;
                }
                class21.field317 = class134.field2140;
                class21.field316 = 70;
                field499 = 90;
            }
        } else if (field499 == 90) {
            if (Statics.field33.method3002()) {
                class110 var62 = new class110(Statics.field33, Statics.field956, 20, 0.8D, field477 ? 64 : 128);
                class104.method2209(var62);
                class104.method2169(0.8D);
                class21.field317 = class134.field2113;
                class21.field316 = 90;
                field499 = 110;
            } else {
                class21.field317 = class134.field2297 + Statics.field33.method3087() + "%";
                class21.field316 = 90;
            }
        } else if (field499 == 110) {
            Statics.field483 = new class16();
            Statics.field895.method1521(Statics.field483, 10);
            class21.field317 = class134.field2215;
            class21.field316 = 94;
            field499 = 120;
        } else if (field499 == 120) {
            if (Statics.field11.method3016("huffman", "")) {
                class120 var63 = new class120(Statics.field11.method3015("huffman", ""));
                class184.method712(var63);
                class21.field317 = class134.field2116;
                class21.field316 = 96;
                field499 = 130;
            } else {
                class21.field317 = class134.field2115 + "%";
                class21.field316 = 96;
            }
        } else if (field499 == 130) {
            if (!Statics.field2001.method3002()) {
                class21.field317 = class134.field2117 + Statics.field2001.method3087() * 4 / 5 + "%";
                class21.field316 = 100;
            } else if (!Statics.field1837.method3002()) {
                class21.field317 = class134.field2117 + (80 + Statics.field1837.method3087() / 6) + "%";
                class21.field316 = 100;
            } else if (Statics.field198.method3002()) {
                class21.field317 = class134.field2118;
                class21.field316 = 100;
                field499 = 140;
            } else {
                class21.field317 = class134.field2117 + (96 + Statics.field198.method3087() / 20) + "%";
                class21.field316 = 100;
            }
        } else if (field499 == 140) {
            method22(10);
        }
    }

    @ObfuscatedName("bz.q(IZZZI)Leo;")
    public static class154 method1595(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1440 != null) {
            var4 = new class71(arg0, class82.field1440, Statics.field113[arg0], 1000000);
        }
        return new class154(var4, Statics.field1631, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("g.u(I)V")
    public static final void method55() {
        try {
            if (field712 == 0) {
                if (Statics.field77 != null) {
                    Statics.field77.method1410();
                    Statics.field77 = null;
                }
                Statics.field918 = null;
                field523 = false;
                field506 = 0;
                field712 = 1;
            }
            if (field712 == 1) {
                if (Statics.field918 == null) {
                    Statics.field918 = Statics.field895.method1519(Statics.field1238, Statics.field1797);
                }
                if (Statics.field918.field1413 == 2) {
                    throw new IOException();
                }
                if (Statics.field918.field1413 == 1) {
                    Statics.field77 = new class70((Socket) Statics.field918.field1412, Statics.field895);
                    Statics.field918 = null;
                    field712 = 2;
                }
            }
            if (field712 == 2) {
                field512.field2038 = 0;
                field512.method2474(14);
                Statics.field77.method1414(field512.field2037, 0, 1);
                field514.field2038 = 0;
                field712 = 3;
            }
            if (field712 == 3) {
                if (Statics.field169 != null) {
                    Statics.field169.method1193();
                }
                if (Statics.field287 != null) {
                    Statics.field287.method1193();
                }
                int var0 = Statics.field77.method1411();
                if (Statics.field169 != null) {
                    Statics.field169.method1193();
                }
                if (Statics.field287 != null) {
                    Statics.field287.method1193();
                }
                if (var0 != 0) {
                    method1262(var0);
                    return;
                }
                field514.field2038 = 0;
                field712 = 5;
            }
            if (field712 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field512.field2038 = 0;
                field512.method2474(10);
                field512.method2606(var1[0]);
                field512.method2606(var1[1]);
                field512.method2606(var1[2]);
                field512.method2606(var1[3]);
                field512.method2568(0L);
                field512.method2479(class21.field323);
                field512.method2506(class6.field83, class6.field81);
                field513.field2038 = 0;
                if (field479 == 40) {
                    field513.method2474(18);
                } else {
                    field513.method2474(16);
                }
                field513.method2475(0);
                int var2 = field513.field2038;
                field513.method2606(17);
                field513.method2482(field512.field2037, 0, field512.field2038);
                int var3 = field513.field2038;
                field513.method2479(class21.field333);
                field513.method2474(field477 ? 1 : 0);
                class82.method2969(field513);
                class127 var4 = new class127(Statics.field1458.method2987());
                Statics.field1458.method2986(var4);
                field513.method2482(var4.field2037, 0, var4.field2037.length);
                field513.method2606(Statics.field1419.field2517);
                field513.method2606(Statics.field502.field2517);
                field513.method2606(Statics.field1292.field2517);
                field513.method2606(Statics.field2001.field2517);
                field513.method2606(Statics.field197.field2517);
                field513.method2606(Statics.field1032.field2517);
                field513.method2606(Statics.field1211.field2517);
                field513.method2606(Statics.field407.field2517);
                field513.method2606(Statics.field956.field2517);
                field513.method2606(Statics.field33.field2517);
                field513.method2606(Statics.field11.field2517);
                field513.method2606(Statics.field1859.field2517);
                field513.method2606(Statics.field1837.field2517);
                field513.method2606(Statics.field198.field2517);
                field513.method2606(Statics.field622.field2517);
                field513.method2606(Statics.field1763.field2517);
                field513.method2504(var1, var3, field513.field2038);
                field513.method2484(field513.field2038 - var2);
                Statics.field77.method1414(field513.field2037, 0, field513.field2038);
                field512.method2355(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field514.method2355(var1);
                field712 = 6;
            }
            if (field712 == 6 && Statics.field77.method1409() > 0) {
                int var6 = Statics.field77.method1411();
                if (var6 == 21 && field479 == 20) {
                    field712 = 7;
                } else if (var6 == 2) {
                    field712 = 9;
                } else if (var6 == 15 && field479 == 40) {
                    method575();
                    return;
                } else if (var6 == 23 && field507 < 1) {
                    field507++;
                    field712 = 0;
                } else {
                    method1262(var6);
                    return;
                }
            }
            if (field712 == 7 && Statics.field77.method1409() > 0) {
                field618 = (Statics.field77.method1411() + 3) * 60;
                field712 = 8;
            }
            if (field712 == 8) {
                field506 = 0;
                class21.method2263(class134.field2119, class134.field2120, field618 / 60 + class134.field2191);
                if (--field618 <= 0) {
                    field712 = 0;
                }
            } else {
                if (field712 == 9 && Statics.field77.method1409() >= 8) {
                    field641 = Statics.field77.method1411();
                    field642 = Statics.field77.method1411() == 1;
                    field690 = Statics.field77.method1411();
                    field690 <<= 0x8;
                    field690 += Statics.field77.method1411();
                    field543 = Statics.field77.method1411();
                    Statics.field77.method1430(field514.field2037, 0, 1);
                    field514.field2038 = 0;
                    field610 = field514.method2357();
                    Statics.field77.method1430(field514.field2037, 0, 2);
                    field514.field2038 = 0;
                    field496 = field514.method2652();
                    if (field543 == 1) {
                        try {
                            class67.method1392(Statics.field471, "zap");
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class67.method1392(Statics.field471, "unzap");
                        } catch (Throwable var10) {
                        }
                    }
                    field712 = 10;
                }
                if (field712 != 10) {
                    field506++;
                    if (field506 > 2000) {
                        if (field507 < 1) {
                            if (Statics.field1797 == Statics.field1424) {
                                Statics.field1797 = Statics.field408;
                            } else {
                                Statics.field1797 = Statics.field1424;
                            }
                            field507++;
                            field712 = 0;
                        } else {
                            method1262(-3);
                        }
                    }
                } else if (Statics.field77.method1409() >= field496) {
                    field514.field2038 = 0;
                    Statics.field77.method1430(field514.field2037, 0, field496);
                    method2246();
                    Statics.field251 = -1;
                    method134(false);
                    field610 = -1;
                }
            }
        } catch (IOException var12) {
            if (field507 < 1) {
                if (Statics.field1797 == Statics.field1424) {
                    Statics.field1797 = Statics.field408;
                } else {
                    Statics.field1797 = Statics.field1424;
                }
                field507++;
                field712 = 0;
            } else {
                method1262(-2);
            }
        }
    }

    @ObfuscatedName("ds.w(I)V")
    public static void method2246() {
        field482 = 1L;
        field486 = -1;
        Statics.field483.field236 = 0;
        Statics.field393 = true;
        field487 = true;
        field699 = -1L;
        class182.method3253();
        field512.field2038 = 0;
        field514.field2038 = 0;
        field610 = -1;
        field520 = -1;
        field521 = -1;
        field522 = -1;
        field517 = 0;
        field489 = 0;
        field519 = 0;
        field490 = 0;
        field558 = 0;
        field652 = false;
        class77.field1403 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field689[var0] = null;
        }
        field485 = 0;
        field628 = 0;
        field679 = false;
        field685 = 0;
        field597 = (int) (Math.random() * 100.0D) - 50;
        field495 = (int) (Math.random() * 110.0D) - 55;
        field504 = (int) (Math.random() * 80.0D) - 40;
        field660 = (int) (Math.random() * 120.0D) - 60;
        field511 = (int) (Math.random() * 30.0D) - 20;
        field561 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field709 = 0;
        field702 = -1;
        field707 = 0;
        field708 = 0;
        field630 = 0;
        field510 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field594[var1] = null;
            field599[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field509[var2] = null;
        }
        Statics.field2006 = field594[2047] = new class3();
        field540.method3352();
        field611.method3352();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field534[var3][var4][var5] = null;
                }
            }
        }
        field609 = new class177();
        field728 = 0;
        field727 = 0;
        for (int var6 = 0; var6 < Statics.field1040; var6++) {
            class42 var7 = class42.method1439(var6);
            if (var7 != null && var7.field1042 == 0) {
                class159.field2702[var6] = 0;
                class159.field2703[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field684.length; var8++) {
            field684[var8] = -1;
        }
        if (field634 != -1) {
            class158.method209(field634);
        }
        for (class4 var9 = (class4) field635.method3326(); var9 != null; var9 = (class4) field635.method3316()) {
            method1402(var9, true);
        }
        field634 = -1;
        field635 = new class175(8);
        field638 = null;
        field652 = false;
        field558 = 0;
        field733.method3203((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field616[var10] = null;
            field606[var10] = false;
        }
        class19.field272 = new class175(32);
        field632 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field678[var11] = true;
        }
        field700 = null;
        Statics.field2461 = 0;
        Statics.field2012 = null;
    }

    @ObfuscatedName("client.s(I)V")
    public static void method575() {
        field512.field2038 = 0;
        field514.field2038 = 0;
        field610 = -1;
        field520 = -1;
        field521 = -1;
        field522 = -1;
        field496 = 0;
        field517 = 0;
        field489 = 0;
        field558 = 0;
        field652 = false;
        field709 = 0;
        field707 = 0;
        for (int var0 = 0; var0 < field594.length; var0++) {
            if (field594[var0] != null) {
                field594[var0].field433 = -1;
            }
        }
        for (int var1 = 0; var1 < field509.length; var1++) {
            if (field509[var1] != null) {
                field509[var1].field433 = -1;
            }
        }
        class19.field272 = new class175(32);
        method22(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field678[var2] = true;
        }
    }

    @ObfuscatedName("be.e(II)V")
    public static void method1262(int arg0) {
        if (arg0 == -3) {
            class21.method2263(class134.field2122, class134.field2123, class134.field2272);
        } else if (arg0 == -2) {
            class21.method2263(class134.field2268, class134.field2259, class134.field2275);
        } else if (arg0 == -1) {
            class21.method2263(class134.field2223, class134.field2144, class134.field2130);
        } else if (arg0 == 3) {
            class21.method2263(class134.field2178, class134.field2193, class134.field2133);
        } else if (arg0 == 4) {
            class21.method2263(class134.field2134, class134.field2135, class134.field2213);
        } else if (arg0 == 5) {
            class21.method2263(class134.field2227, class134.field2253, class134.field2139);
        } else if (arg0 == 6) {
            class21.method2263(class134.field2292, class134.field2151, class134.field2142);
        } else if (arg0 == 7) {
            class21.method2263(class134.field2143, class134.field2206, class134.field2145);
        } else if (arg0 == 8) {
            class21.method2263(class134.field2265, class134.field2146, class134.field2148);
        } else if (arg0 == 9) {
            class21.method2263(class134.field2149, class134.field2150, class134.field2176);
        } else if (arg0 == 10) {
            class21.method2263(class134.field2152, class134.field2153, class134.field2154);
        } else if (arg0 == 11) {
            class21.method2263(class134.field2186, class134.field2156, class134.field2157);
        } else if (arg0 == 12) {
            class21.method2263(class134.field2158, class134.field2159, class134.field2301);
        } else if (arg0 == 13) {
            class21.method2263(class134.field2245, class134.field2162, class134.field2163);
        } else if (arg0 == 14) {
            class21.method2263(class134.field2164, class134.field2277, class134.field2166);
        } else if (arg0 == 16) {
            class21.method2263(class134.field2167, class134.field2168, class134.field2179);
        } else if (arg0 == 17) {
            class21.method2263(class134.field2270, class134.field2155, class134.field2172);
        } else if (arg0 == 18) {
            class21.method2263(class134.field2173, class134.field2174, class134.field2124);
        } else if (arg0 == 19) {
            class21.method2263(class134.field2147, class134.field2177, class134.field2114);
        } else if (arg0 == 20) {
            class21.method2263(class134.field2298, class134.field2108, class134.field2126);
        } else if (arg0 == 22) {
            class21.method2263(class134.field2129, class134.field2183, class134.field2184);
        } else if (arg0 == 23) {
            class21.method2263(class134.field2185, class134.field2097, class134.field2127);
        } else if (arg0 == 24) {
            class21.method2263(class134.field2188, class134.field2189, class134.field2190);
        } else if (arg0 == 25) {
            class21.method2263(class134.field2105, class134.field2192, class134.field2138);
        } else if (arg0 == 26) {
            class21.method2263(class134.field2194, class134.field2195, class134.field2196);
        } else if (arg0 == 27) {
            class21.method2263(class134.field2197, class134.field2198, class134.field2199);
        } else if (arg0 == 31) {
            class21.method2263(class134.field2088, class134.field2307, class134.field2098);
        } else if (arg0 == 32) {
            class21.method2263(class134.field2209, class134.field2210, class134.field2211);
        } else if (arg0 == 37) {
            class21.method2263(class134.field2212, class134.field2169, class134.field2214);
        } else if (arg0 == 38) {
            class21.method2263(class134.field2181, class134.field2121, class134.field2100);
        } else if (arg0 == 55) {
            class21.method2263(class134.field2218, class134.field2219, class134.field2220);
        } else {
            class21.method2263(class134.field2208, class134.field2182, class134.field2222);
        }
        method22(10);
    }

    @ObfuscatedName("p.b(I)V")
    public static final void method1() {
        if (Statics.field77 != null) {
            Statics.field77.method1410();
            Statics.field77 = null;
        }
        method2252();
        Statics.field53.method1928();
        for (int var0 = 0; var0 < 4; var0++) {
            field531[var0].method3227();
        }
        System.gc();
        class138.field2347 = 1;
        Statics.field746 = null;
        Statics.field108 = -1;
        Statics.field264 = -1;
        Statics.field2346 = 0;
        Statics.field1628 = false;
        Statics.field874 = 2;
        field663 = -1;
        field569 = false;
        class7.method2();
        method22(10);
    }

    @ObfuscatedName("do.j(I)V")
    public static final void method2252() {
        Statics.method2429();
        class33.method1679();
        class36.method170();
        class32.method153();
        class31.method221();
        class40.field1012.method3265();
        class40.field989.method3265();
        class40.field990.method3265();
        class34.method1915();
        class35.field903.method3265();
        class35.field920.method3265();
        Statics.method1912();
        class42.method1441();
        class163.method2349();
        class158.field2591.method3265();
        class158.field2651.method3265();
        class158.field2630.method3265();
        ((class110) Statics.field1787).method2254();
        class5.field78.method3265();
        Statics.field1419.method3011();
        Statics.field502.method3011();
        Statics.field2001.method3011();
        Statics.field197.method3011();
        Statics.field1032.method3011();
        Statics.field1211.method3011();
        Statics.field407.method3011();
        Statics.field956.method3011();
        Statics.field33.method3011();
        Statics.field11.method3011();
        Statics.field1859.method3011();
        Statics.field1837.method3011();
    }

    @ObfuscatedName("bw.h(B)V")
    public static final void method1589() {
        if (field489 > 1) {
            field489--;
        }
        if (field519 > 0) {
            field519--;
        }
        if (field523) {
            field523 = false;
            if (field519 > 0) {
                method1();
            } else {
                method22(40);
                Statics.field334 = Statics.field77;
                Statics.field77 = null;
            }
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field77 == null) {
                var1 = false;
            } else {
                label2692: {
                    try {
                        int var2 = Statics.field77.method1409();
                        if (var2 == 0) {
                            var1 = false;
                            break label2692;
                        }
                        if (field610 == -1) {
                            Statics.field77.method1430(field514.field2037, 0, 1);
                            field514.field2038 = 0;
                            field610 = field514.method2357();
                            field496 = class165.field2776[field610];
                            var2--;
                        }
                        if (field496 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2692;
                            }
                            Statics.field77.method1430(field514.field2037, 0, 1);
                            field496 = field514.field2037[0] & 0xFF;
                            var2--;
                        }
                        if (field496 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2692;
                            }
                            Statics.field77.method1430(field514.field2037, 0, 2);
                            field514.field2038 = 0;
                            field496 = field514.method2652();
                            var2 -= 2;
                        }
                        if (var2 < field496) {
                            var1 = false;
                            break label2692;
                        }
                        field514.field2038 = 0;
                        Statics.field77.method1430(field514.field2037, 0, field496);
                        field517 = 0;
                        field522 = field521;
                        field521 = field520;
                        field520 = field610;
                        if (field610 == 226) {
                            method1();
                            field610 = -1;
                            var1 = false;
                            break label2692;
                        }
                        if (field610 == 88) {
                            int var3 = field514.method2524();
                            int var4 = field514.method2605();
                            class158 var5 = class158.method667(var4);
                            if (var5.field2620 != var3 || var3 == -1) {
                                var5.field2620 = var3;
                                var5.field2690 = 0;
                                var5.field2613 = 0;
                                method42(var5);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 60) {
                            field707 = 0;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 155) {
                            String var6 = field514.method2490();
                            Object[] var7 = new Object[var6.length() + 1];
                            for (int var8 = var6.length() - 1; var8 >= 0; var8--) {
                                if (var6.charAt(var8) == 's') {
                                    var7[var8 + 1] = field514.method2490();
                                } else {
                                    var7[var8 + 1] = Integer.valueOf(field514.method2551());
                                }
                            }
                            var7[0] = Integer.valueOf(field514.method2551());
                            class1 var9 = new class1();
                            var9.field1 = var7;
                            class26.method916(var9);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 154) {
                            Statics.field17 = field514.method2671();
                            Statics.field468 = field514.method2513();
                            while (field514.field2038 < field496) {
                                field610 = field514.method2659();
                                method155();
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 213) {
                            String var10 = field514.method2490();
                            class116 var11 = field514;
                            String var12 = class184.method1425(var11, 32767);
                            String var13 = class185.method3401(class147.method1548(var12));
                            method2724(6, var10, var13);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 245) {
                            Statics.field468 = field514.method2659();
                            Statics.field17 = field514.method2659();
                            for (int var14 = Statics.field468; var14 < Statics.field468 + 8; var14++) {
                                for (int var15 = Statics.field17; var15 < Statics.field17 + 8; var15++) {
                                    if (field534[Statics.field231][var14][var15] != null) {
                                        field534[Statics.field231][var14][var15] = null;
                                        method2409(var14, var15);
                                    }
                                }
                            }
                            for (class22 var16 = (class22) field609.method3334(); var16 != null; var16 = (class22) field609.method3355()) {
                                if (var16.field336 >= Statics.field468 && var16.field336 < Statics.field468 + 8 && var16.field337 >= Statics.field17 && var16.field337 < Statics.field17 + 8 && Statics.field231 == var16.field347) {
                                    var16.field340 = 0;
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 74) {
                            int var17 = field514.method2522();
                            int var18 = field514.method2605();
                            int var19 = field514.method2511();
                            class4 var20 = (class4) field635.method3312((long) var18);
                            if (var20 != null) {
                                method1402(var20, var20.field67 != var17);
                            }
                            class4 var21 = new class4();
                            var21.field67 = var17;
                            var21.field58 = var19;
                            field635.method3313(var21, (long) var18);
                            if (class158.method2227(var17)) {
                                class158[] var22 = Statics.field2608[var17];
                                for (int var23 = 0; var23 < var22.length; var23++) {
                                    class158 var24 = var22[var23];
                                    if (var24 != null) {
                                        var24.field2690 = 0;
                                        var24.field2613 = 0;
                                    }
                                }
                            }
                            class26.method683(var17);
                            class158 var25 = class158.method667(var18);
                            if (var25 != null) {
                                method42(var25);
                            }
                            if (field638 != null) {
                                method42(field638);
                                field638 = null;
                            }
                            field652 = false;
                            field558 = 0;
                            method596(Statics.field2467, Statics.field29, Statics.field1115, Statics.field1629);
                            if (field634 != -1) {
                                int var26 = field634;
                                if (class158.method2227(var26)) {
                                    method853(Statics.field2608[var26], 1);
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 205) {
                            method226();
                            int var27 = field514.method2511();
                            int var28 = field514.method2530();
                            int var29 = field514.method2511();
                            field614[var29] = var28;
                            field492[var29] = var27;
                            field613[var29] = 1;
                            for (int var30 = 0; var30 < 98; var30++) {
                                if (var28 >= class130.field2051[var30]) {
                                    field613[var29] = var30 + 2;
                                }
                            }
                            field662[++field545 - 1 & 0x1F] = var29;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 106) {
                            field516 = true;
                            Statics.field1660 = field514.method2659();
                            Statics.field1967 = field514.method2659();
                            Statics.field391 = field514.method2652();
                            Statics.field1209 = field514.method2659();
                            Statics.field741 = field514.method2659();
                            if (Statics.field741 >= 100) {
                                int var31 = Statics.field1660 * 128 + 64;
                                int var32 = Statics.field1967 * 128 + 64;
                                int var33 = method49(var31, var32, Statics.field231) - Statics.field391;
                                int var34 = var31 - Statics.field378;
                                int var35 = var33 - Statics.field1380;
                                int var36 = var32 - Statics.field2323;
                                int var37 = (int) Math.sqrt((double) (var34 * var34 + var36 * var36));
                                Statics.field1620 = (int) (Math.atan2((double) var35, (double) var37) * 325.949D) & 0x7FF;
                                Statics.field1757 = (int) (Math.atan2((double) var34, (double) var36) * -325.949D) & 0x7FF;
                                if (Statics.field1620 < 128) {
                                    Statics.field1620 = 128;
                                }
                                if (Statics.field1620 > 383) {
                                    Statics.field1620 = 383;
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 79) {
                            int var38 = field514.method2551();
                            int var39 = field514.method2652();
                            if (var38 < -70000) {
                                var39 += 32768;
                            }
                            class158 var40;
                            if (var38 >= 0) {
                                var40 = class158.method667(var38);
                            } else {
                                var40 = null;
                            }
                            if (var40 != null) {
                                for (int var41 = 0; var41 < var40.field2686.length; var41++) {
                                    var40.field2686[var41] = 0;
                                    var40.field2687[var41] = 0;
                                }
                            }
                            class19 var42 = (class19) class19.field272.method3312((long) var39);
                            if (var42 != null) {
                                for (int var43 = 0; var43 < var42.field269.length; var43++) {
                                    var42.field269[var43] = -1;
                                    var42.field270[var43] = 0;
                                }
                            }
                            int var44 = field514.method2652();
                            for (int var45 = 0; var45 < var44; var45++) {
                                int var46 = field514.method2520();
                                int var47 = field514.method2511();
                                if (var47 == 255) {
                                    var47 = field514.method2605();
                                }
                                if (var40 != null && var45 < var40.field2686.length) {
                                    var40.field2686[var45] = var46;
                                    var40.field2687[var45] = var47;
                                }
                                class19.method1266(var39, var45, var46 - 1, var47);
                            }
                            if (var40 != null) {
                                method42(var40);
                            }
                            method226();
                            field567[++field661 - 1 & 0x1F] = var39 & 0x7FFF;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 25) {
                            for (int var48 = 0; var48 < field594.length; var48++) {
                                if (field594[var48] != null) {
                                    field594[var48].field439 = -1;
                                }
                            }
                            for (int var49 = 0; var49 < field509.length; var49++) {
                                if (field509[var49] != null) {
                                    field509[var49].field439 = -1;
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 251) {
                            method226();
                            field640 = field514.method2588();
                            field716 = field474;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 30) {
                            while (field514.field2038 < field496) {
                                int var50 = field514.method2659();
                                boolean var51 = (var50 & 0x1) == 1;
                                String var52 = field514.method2490();
                                String var53 = field514.method2490();
                                field514.method2490();
                                for (int var54 = 0; var54 < field667; var54++) {
                                    class11 var55 = field695[var54];
                                    if (var51) {
                                        if (var53.equals(var55.field175)) {
                                            var55.field175 = var52;
                                            var55.field174 = var53;
                                            var52 = null;
                                            break;
                                        }
                                    } else if (var52.equals(var55.field175)) {
                                        var55.field175 = var52;
                                        var55.field174 = var53;
                                        var52 = null;
                                        break;
                                    }
                                }
                                if (var52 != null && field667 < 100) {
                                    class11 var56 = new class11();
                                    field695[field667] = var56;
                                    var56.field175 = var52;
                                    var56.field174 = var53;
                                    field667++;
                                }
                            }
                            field665 = field474;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 78) {
                            field666 = field474;
                            if (field496 == 0) {
                                field700 = null;
                                field573 = null;
                                Statics.field2461 = 0;
                                Statics.field2012 = null;
                                field610 = -1;
                                var1 = true;
                            } else {
                                field573 = field514.method2490();
                                long var57 = field514.method2494();
                                long var59 = var57;
                                String var61;
                                if (var57 <= 0L || var57 >= 6582952005840035281L) {
                                    var61 = null;
                                } else if (var57 % 37L == 0L) {
                                    var61 = null;
                                } else {
                                    int var62 = 0;
                                    for (long var63 = var57; var63 != 0L; var63 /= 37L) {
                                        var62++;
                                    }
                                    StringBuilder var65 = new StringBuilder(var62);
                                    while (var59 != 0L) {
                                        long var66 = var59;
                                        var59 /= 37L;
                                        var65.append(class146.field2451[(int) (var66 - var59 * 37L)]);
                                    }
                                    var61 = var65.reverse().toString();
                                }
                                field700 = var61;
                                Statics.field1351 = field514.method2656();
                                int var68 = field514.method2659();
                                if (var68 == 255) {
                                    field610 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field2461 = var68;
                                    class8[] var69 = new class8[100];
                                    for (int var70 = 0; var70 < Statics.field2461; var70++) {
                                        var69[var70] = new class8();
                                        var69[var70].field110 = field514.method2490();
                                        var69[var70].field109 = class148.method2960(var69[var70].field110, Statics.field2049);
                                        var69[var70].field116 = field514.method2652();
                                        var69[var70].field111 = field514.method2656();
                                        field514.method2490();
                                        if (var69[var70].field110.equals(Statics.field2006.field40)) {
                                            Statics.field2333 = var69[var70].field111;
                                        }
                                    }
                                    boolean var71 = false;
                                    int var72 = Statics.field2461;
                                    while (var72 > 0) {
                                        boolean var73 = true;
                                        var72--;
                                        for (int var74 = 0; var74 < var72; var74++) {
                                            if (var69[var74].field109.compareTo(var69[var74 + 1].field109) > 0) {
                                                class8 var75 = var69[var74];
                                                var69[var74] = var69[var74 + 1];
                                                var69[var74 + 1] = var75;
                                                var73 = false;
                                            }
                                        }
                                        if (var73) {
                                            break;
                                        }
                                    }
                                    Statics.field2012 = var69;
                                    field610 = -1;
                                    var1 = true;
                                }
                            }
                            break label2692;
                        }
                        if (field610 == 133) {
                            Statics.field17 = field514.method2671();
                            Statics.field468 = field514.method2513();
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 236) {
                            field516 = true;
                            Statics.field285 = field514.method2659();
                            Statics.field354 = field514.method2659();
                            Statics.field112 = field514.method2652();
                            Statics.field1382 = field514.method2659();
                            Statics.field1449 = field514.method2659();
                            if (Statics.field1449 >= 100) {
                                Statics.field378 = Statics.field285 * 128 + 64;
                                Statics.field2323 = Statics.field354 * 128 + 64;
                                Statics.field1380 = method49(Statics.field378, Statics.field2323, Statics.field231) - Statics.field112;
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 96) {
                            if (field634 != -1) {
                                int var76 = field634;
                                if (class158.method2227(var76)) {
                                    method853(Statics.field2608[var76], 0);
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 29) {
                            int var77 = field514.method2551();
                            class158 var78 = class158.method667(var77);
                            for (int var79 = 0; var79 < var78.field2686.length; var79++) {
                                var78.field2686[var79] = -1;
                                var78.field2686[var79] = 0;
                            }
                            method42(var78);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 187) {
                            int var80 = field514.method2605();
                            int var81 = field514.method2605();
                            int var82 = field514.method2571();
                            if (var82 == 65535) {
                                var82 = -1;
                            }
                            class158 var83 = class158.method667(var80);
                            if (var83.field2583) {
                                var83.field2688 = var82;
                                var83.field2689 = var81;
                                class40 var85 = class40.method730(var82);
                                var83.field2615 = var85.field1000;
                                var83.field2625 = var85.field1001;
                                var83.field2626 = var85.field1002;
                                var83.field2580 = var85.field1003;
                                var83.field2623 = var85.field1018;
                                var83.field2652 = var85.field999;
                                if (var83.field2585 > 0) {
                                    var83.field2652 = var83.field2652 * 32 / var83.field2585;
                                }
                                method42(var83);
                            } else {
                                if (var82 == -1) {
                                    var83.field2593 = 0;
                                    field610 = -1;
                                    var1 = true;
                                    break label2692;
                                }
                                class40 var84 = class40.method730(var82);
                                var83.field2593 = 4;
                                var83.field2617 = var82;
                                var83.field2615 = var84.field1000;
                                var83.field2625 = var84.field1001;
                                var83.field2652 = var84.field999 * 100 / var81;
                                method42(var83);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 40) {
                            method134(false);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 112) {
                            int var86 = field514.method2659();
                            int var87 = field514.method2513();
                            String var88 = field514.method2490();
                            if (var86 >= 1 && var86 <= 8) {
                                if (var88.equalsIgnoreCase("null")) {
                                    var88 = null;
                                }
                                field616[var86 - 1] = var88;
                                field606[var86 - 1] = var87 == 0;
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 227) {
                            field489 = field514.method2652() * 30;
                            field716 = field474;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 172) {
                            int var89 = field514.method2652();
                            int var90 = field514.method2659();
                            int var91 = field514.method2652();
                            method138(var89, var90, var91);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 70) {
                            int var92 = field514.method2652();
                            class19.method171(var92);
                            field567[++field661 - 1 & 0x1F] = var92 & 0x7FFF;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 98) {
                            int var93 = field514.method2551();
                            class4 var94 = (class4) field635.method3312((long) var93);
                            if (var94 != null) {
                                method1402(var94, true);
                            }
                            if (field638 != null) {
                                method42(field638);
                                field638 = null;
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 249) {
                            int var95 = field514.method2551();
                            Statics.field1441 = Statics.field895.method1522(var95);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 237) {
                            int var96 = field514.method2605();
                            int var97 = field514.method2522();
                            int var98 = field514.method2520();
                            int var99 = field514.method2520();
                            class158 var100 = class158.method667(var96);
                            if (var100.field2615 != var98 || var100.field2625 != var99 || var100.field2652 != var97) {
                                var100.field2615 = var98;
                                var100.field2625 = var99;
                                var100.field2652 = var97;
                                method42(var100);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 109) {
                            int var101 = field514.method2605();
                            int var102 = field514.method2605();
                            int var103 = field514.method2522();
                            if (var103 == 65535) {
                                var103 = -1;
                            }
                            int var104 = field514.method2520();
                            if (var104 == 65535) {
                                var104 = -1;
                            }
                            for (int var105 = var104; var105 <= var103; var105++) {
                                long var106 = ((long) var102 << 32) + (long) var105;
                                class179 var108 = field674.method3312(var106);
                                if (var108 != null) {
                                    var108.method3360();
                                }
                                field674.method3313(new class171(var101), var106);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 166) {
                            int var109 = field514.method2571();
                            int var110 = field514.method2551();
                            int var111 = field514.method2522();
                            class158 var112 = class158.method667(var110);
                            var112.field2628 = (var111 << 16) + var109;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 152) {
                            while (field514.field2038 < field496) {
                                boolean var113 = field514.method2659() == 1;
                                String var114 = field514.method2490();
                                String var115 = field514.method2490();
                                int var116 = field514.method2652();
                                int var117 = field514.method2659();
                                int var118 = field514.method2659();
                                boolean var119 = (var118 & 0x2) != 0;
                                boolean var120 = (var118 & 0x1) != 0;
                                if (var116 > 0) {
                                    field514.method2490();
                                    field514.method2659();
                                    field514.method2551();
                                }
                                field514.method2490();
                                for (int var121 = 0; var121 < field727; var121++) {
                                    class23 var122 = field729[var121];
                                    if (var113) {
                                        if (var115.equals(var122.field358)) {
                                            var122.field358 = var114;
                                            var122.field355 = var115;
                                            var114 = null;
                                            break;
                                        }
                                    } else if (var114.equals(var122.field358)) {
                                        if (var122.field362 != var116) {
                                            boolean var123 = true;
                                            for (class28 var124 = (class28) field470.method3302(); var124 != null; var124 = (class28) field470.method3303()) {
                                                if (var124.field738.equals(var114)) {
                                                    if (var116 != 0 && var124.field740 == 0) {
                                                        var124.method3356();
                                                        var123 = false;
                                                    } else if (var116 == 0 && var124.field740 != 0) {
                                                        var124.method3356();
                                                        var123 = false;
                                                    }
                                                }
                                            }
                                            if (var123) {
                                                field470.method3301(new class28(var114, var116));
                                            }
                                            var122.field362 = var116;
                                        }
                                        var122.field355 = var115;
                                        var122.field357 = var117;
                                        var122.field361 = var119;
                                        var122.field359 = var120;
                                        var114 = null;
                                        break;
                                    }
                                }
                                if (var114 != null && field727 < 200) {
                                    class23 var125 = new class23();
                                    field729[field727] = var125;
                                    var125.field358 = var114;
                                    var125.field355 = var115;
                                    var125.field362 = var116;
                                    var125.field357 = var117;
                                    var125.field361 = var119;
                                    var125.field359 = var120;
                                    field727++;
                                }
                            }
                            field728 = 2;
                            field665 = field474;
                            boolean var126 = false;
                            int var127 = field727;
                            while (var127 > 0) {
                                boolean var128 = true;
                                var127--;
                                for (int var129 = 0; var129 < var127; var129++) {
                                    boolean var130 = false;
                                    class23 var131 = field729[var129];
                                    class23 var132 = field729[var129 + 1];
                                    if (field563 != var131.field362 && field563 == var132.field362) {
                                        var130 = true;
                                    }
                                    if (!var130 && var131.field362 == 0 && var132.field362 != 0) {
                                        var130 = true;
                                    }
                                    if (!var130 && !var131.field361 && var132.field361) {
                                        var130 = true;
                                    }
                                    if (!var130 && !var131.field359 && var132.field359) {
                                        var130 = true;
                                    }
                                    if (var130) {
                                        class23 var133 = field729[var129];
                                        field729[var129] = field729[var129 + 1];
                                        field729[var129 + 1] = var133;
                                        var128 = false;
                                    }
                                }
                                if (var128) {
                                    break;
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 111) {
                            method134(true);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 72) {
                            int var134 = field496 + field514.field2038;
                            int var135 = field514.method2652();
                            int var136 = field514.method2652();
                            if (field634 != var135) {
                                field634 = var135;
                                int var137 = field634;
                                if (class158.method2227(var137)) {
                                    class158[] var138 = Statics.field2608[var137];
                                    for (int var139 = 0; var139 < var138.length; var139++) {
                                        class158 var140 = var138[var139];
                                        if (var140 != null) {
                                            var140.field2690 = 0;
                                            var140.field2613 = 0;
                                        }
                                    }
                                }
                                class26.method683(field634);
                                for (int var141 = 0; var141 < 100; var141++) {
                                    field678[var141] = true;
                                }
                            }
                            while (var136-- > 0) {
                                int var142 = field514.method2551();
                                int var143 = field514.method2652();
                                int var144 = field514.method2659();
                                class4 var145 = (class4) field635.method3312((long) var142);
                                if (var145 != null && var145.field67 != var143) {
                                    method1402(var145, true);
                                    var145 = null;
                                }
                                if (var145 == null) {
                                    class4 var146 = new class4();
                                    var146.field67 = var143;
                                    var146.field58 = var144;
                                    field635.method3313(var146, (long) var142);
                                    if (class158.method2227(var143)) {
                                        class158[] var147 = Statics.field2608[var143];
                                        for (int var148 = 0; var148 < var147.length; var148++) {
                                            class158 var149 = var147[var148];
                                            if (var149 != null) {
                                                var149.field2690 = 0;
                                                var149.field2613 = 0;
                                            }
                                        }
                                    }
                                    class26.method683(var143);
                                    class158 var150 = class158.method667(var142);
                                    if (var150 != null) {
                                        method42(var150);
                                    }
                                    if (field638 != null) {
                                        method42(field638);
                                        field638 = null;
                                    }
                                    field652 = false;
                                    field558 = 0;
                                    method596(Statics.field2467, Statics.field29, Statics.field1115, Statics.field1629);
                                    if (field634 != -1) {
                                        int var151 = field634;
                                        if (class158.method2227(var151)) {
                                            method853(Statics.field2608[var151], 1);
                                        }
                                    }
                                    var145 = var146;
                                }
                                var145.field59 = true;
                            }
                            for (class4 var153 = (class4) field635.method3326(); var153 != null; var153 = (class4) field635.method3316()) {
                                if (var153.field59) {
                                    var153.field59 = false;
                                } else {
                                    method1402(var153, true);
                                }
                            }
                            field674 = new class175(512);
                            while (field514.field2038 < var134) {
                                int var154 = field514.method2551();
                                int var155 = field514.method2652();
                                int var156 = field514.method2652();
                                int var157 = field514.method2551();
                                for (int var158 = var155; var158 <= var156; var158++) {
                                    long var159 = ((long) var154 << 32) + (long) var158;
                                    field674.method3313(new class171(var157), var159);
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 73) {
                            String var161 = field514.method2490();
                            long var162 = (long) field514.method2652();
                            long var164 = (long) field514.method2595();
                            int var166 = field514.method2659();
                            long var167 = (var162 << 32) + var164;
                            boolean var169 = false;
                            for (int var170 = 0; var170 < 100; var170++) {
                                if (field694[var170] == var167) {
                                    var169 = true;
                                    break;
                                }
                            }
                            if (method150(var161)) {
                                var169 = true;
                            }
                            if (!var169 && field737 == 0) {
                                field694[field710] = var167;
                                field710 = (field710 + 1) % 100;
                                class116 var171 = field514;
                                String var172 = class184.method1425(var171, 32767);
                                String var173 = class185.method3401(class147.method1548(var172));
                                if (var166 == 2 || var166 == 3) {
                                    method2724(7, Statics.method625(1) + var161, var173);
                                } else if (var166 == 1) {
                                    method2724(7, Statics.method625(0) + var161, var173);
                                } else {
                                    method2724(3, var161, var173);
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 51) {
                            class116 var174 = field514;
                            int var175 = field496;
                            class181 var176 = new class181();
                            var176.field2826 = var174.method2659();
                            var176.field2823 = var174.method2551();
                            var176.field2824 = new int[var176.field2826];
                            var176.field2825 = new int[var176.field2826];
                            var176.field2827 = new Field[var176.field2826];
                            var176.field2822 = new int[var176.field2826];
                            var176.field2828 = new Method[var176.field2826];
                            var176.field2829 = new byte[var176.field2826][][];
                            for (int var177 = 0; var177 < var176.field2826; var177++) {
                                try {
                                    int var178 = var174.method2659();
                                    if (var178 == 0 || var178 == 1 || var178 == 2) {
                                        String var179 = new String(var174.method2490());
                                        String var180 = new String(var174.method2490());
                                        int var181 = 0;
                                        if (var178 == 1) {
                                            var181 = var174.method2551();
                                        }
                                        var176.field2824[var177] = var178;
                                        var176.field2822[var177] = var181;
                                        var176.field2827[var177] = class182.method200(var179).getDeclaredField(var180);
                                    } else if (var178 == 3 || var178 == 4) {
                                        String var182 = new String(var174.method2490());
                                        String var183 = new String(var174.method2490());
                                        int var184 = var174.method2659();
                                        String[] var185 = new String[var184];
                                        for (int var186 = 0; var186 < var184; var186++) {
                                            var185[var186] = new String(var174.method2490());
                                        }
                                        byte[][] var187 = new byte[var184][];
                                        if (var178 == 3) {
                                            for (int var188 = 0; var188 < var184; var188++) {
                                                int var189 = var174.method2551();
                                                var187[var188] = new byte[var189];
                                                var174.method2637(var187[var188], 0, var189);
                                            }
                                        }
                                        var176.field2824[var177] = var178;
                                        Class[] var190 = new Class[var184];
                                        for (int var191 = 0; var191 < var184; var191++) {
                                            var190[var191] = class182.method200(var185[var191]);
                                        }
                                        var176.field2828[var177] = class182.method200(var182).getDeclaredMethod(var183, var190);
                                        var176.field2829[var177] = var187;
                                    }
                                } catch (ClassNotFoundException var402) {
                                    var176.field2825[var177] = -1;
                                } catch (SecurityException var403) {
                                    var176.field2825[var177] = -2;
                                } catch (NullPointerException var404) {
                                    var176.field2825[var177] = -3;
                                } catch (Exception var405) {
                                    var176.field2825[var177] = -4;
                                } catch (Throwable var406) {
                                    var176.field2825[var177] = -5;
                                }
                            }
                            class182.field2830.method3328(var176);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 86) {
                            int var197 = field514.method2531();
                            int var198 = field514.method2571();
                            class159.field2702[var198] = var197;
                            if (class159.field2703[var198] != var197) {
                                class159.field2703[var198] = var197;
                                method144(var198);
                            }
                            field658[++field711 - 1 & 0x1F] = var198;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 49) {
                            int var199 = field514.method2551();
                            int var200 = field514.method2522();
                            class158 var201 = class158.method667(var199);
                            if (var201 != null && var201.field2586 == 0) {
                                if (var200 > var201.field2600 - var201.field2594) {
                                    var200 = var201.field2600 - var201.field2594;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                }
                                if (var201.field2598 != var200) {
                                    var201.field2598 = var200;
                                    method42(var201);
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 189) {
                            for (int var202 = 0; var202 < Statics.field1040; var202++) {
                                class42 var203 = class42.method1439(var202);
                                if (var203 != null && var203.field1042 == 0) {
                                    class159.field2702[var202] = 0;
                                    class159.field2703[var202] = 0;
                                }
                            }
                            method226();
                            field711 += 32;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 28) {
                            int var204 = field514.method2531();
                            int var205 = field514.method2652();
                            class158 var206 = class158.method667(var204);
                            if (var206.field2593 != 1 || var206.field2617 != var205) {
                                var206.field2593 = 1;
                                var206.field2617 = var205;
                                method42(var206);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 183) {
                            field516 = false;
                            for (int var207 = 0; var207 < 5; var207++) {
                                field650[var207] = false;
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 68) {
                            method226();
                            field480 = field514.method2659();
                            field716 = field474;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 105) {
                            int var208 = field514.method2551();
                            int var209 = field514.method2652();
                            if (var208 < -70000) {
                                var209 += 32768;
                            }
                            class158 var210;
                            if (var208 >= 0) {
                                var210 = class158.method667(var208);
                            } else {
                                var210 = null;
                            }
                            while (field514.field2038 < field496) {
                                int var211 = field514.method2501();
                                int var212 = field514.method2652();
                                int var213 = 0;
                                if (var212 != 0) {
                                    var213 = field514.method2659();
                                    if (var213 == 255) {
                                        var213 = field514.method2551();
                                    }
                                }
                                if (var210 != null && var211 >= 0 && var211 < var210.field2686.length) {
                                    var210.field2686[var211] = var212;
                                    var210.field2687[var211] = var213;
                                }
                                class19.method1266(var209, var211, var212 - 1, var213);
                            }
                            if (var210 != null) {
                                method42(var210);
                            }
                            method226();
                            field567[++field661 - 1 & 0x1F] = var209 & 0x7FFF;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 102) {
                            field490 = field514.method2659();
                            if (field490 == 1) {
                                field491 = field514.method2652();
                            }
                            if (field490 >= 2 && field490 <= 6) {
                                if (field490 == 2) {
                                    field649 = 64;
                                    field497 = 64;
                                }
                                if (field490 == 3) {
                                    field649 = 0;
                                    field497 = 64;
                                }
                                if (field490 == 4) {
                                    field649 = 128;
                                    field497 = 64;
                                }
                                if (field490 == 5) {
                                    field649 = 64;
                                    field497 = 0;
                                }
                                if (field490 == 6) {
                                    field649 = 64;
                                    field497 = 128;
                                }
                                field490 = 2;
                                field595 = field514.method2652();
                                field494 = field514.method2652();
                                field505 = field514.method2659();
                            }
                            if (field490 == 10) {
                                field555 = field514.method2652();
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 90) {
                            int var214 = field514.method2659();
                            class137[] var215 = class137.method45();
                            int var216 = 0;
                            class137 var218;
                            while (true) {
                                if (var216 >= var215.length) {
                                    var218 = null;
                                    break;
                                }
                                class137 var217 = var215[var216];
                                if (var217.field2336 == var214) {
                                    var218 = var217;
                                    break;
                                }
                                var216++;
                            }
                            Statics.field234 = var218;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 197) {
                            boolean var219 = field514.method2513() == 1;
                            int var220 = field514.method2531();
                            class158 var221 = class158.method667(var220);
                            if (var221.field2596 != var219) {
                                var221.field2596 = var219;
                                method42(var221);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 77) {
                            int var222 = field514.method2531();
                            String var223 = field514.method2490();
                            class158 var224 = class158.method667(var222);
                            if (!var223.equals(var224.field2691)) {
                                var224.field2691 = var223;
                                method42(var224);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 159) {
                            int var225 = field514.method2511();
                            int var226 = field514.method2511();
                            int var227 = field514.method2513();
                            Statics.field231 = var227 >> 1;
                            Statics.field2006.method230(var225, var226, (var227 & 0x1) == 1);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 167) {
                            field602 = 0;
                            field592 = 0;
                            method5();
                            method1626();
                            method1386();
                            for (int var228 = 0; var228 < field602; var228++) {
                                int var229 = field603[var228];
                                if (field481 != field509[var229].field459) {
                                    field509[var229].field388 = null;
                                    field509[var229] = null;
                                }
                            }
                            if (field496 != field514.field2038) {
                                throw new RuntimeException(field514.field2038 + class2.field19 + field496);
                            }
                            for (int var230 = 0; var230 < field510; var230++) {
                                if (field509[field657[var230]] == null) {
                                    throw new RuntimeException(var230 + class2.field19 + field510);
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 15) {
                            byte var231 = field514.method2663();
                            int var232 = field514.method2520();
                            class159.field2702[var232] = var231;
                            if (class159.field2703[var232] != var231) {
                                class159.field2703[var232] = var231;
                                method144(var232);
                            }
                            field658[++field711 - 1 & 0x1F] = var232;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 190) {
                            field709 = field514.method2659();
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 222) {
                            for (int var233 = 0; var233 < class159.field2703.length; var233++) {
                                if (class159.field2703[var233] != class159.field2702[var233]) {
                                    class159.field2703[var233] = class159.field2702[var233];
                                    method144(var233);
                                    field658[++field711 - 1 & 0x1F] = var233;
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 137) {
                            int var234 = field514.method2605();
                            int var235 = field514.method2652();
                            int var236 = var235 >> 10 & 0x1F;
                            int var237 = var235 >> 5 & 0x1F;
                            int var238 = var235 & 0x1F;
                            int var239 = (var238 << 3) + (var236 << 19) + (var237 << 11);
                            class158 var240 = class158.method667(var234);
                            if (var240.field2672 != var239) {
                                var240.field2672 = var239;
                                method42(var240);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 10 || field610 == 115 || field610 == 162 || field610 == 34 || field610 == 142 || field610 == 163 || field610 == 124 || field610 == 188 || field610 == 129 || field610 == 195 || field610 == 232) {
                            method155();
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 16) {
                            field514.field2038 += 28;
                            if (field514.method2508()) {
                                class82.method224(field514, field514.field2038 - 28);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 50) {
                            String var241 = field514.method2490();
                            int var242 = field514.method2652();
                            byte var243 = field514.method2656();
                            boolean var244 = false;
                            if (var243 == -128) {
                                var244 = true;
                            }
                            if (var244) {
                                if (Statics.field2461 == 0) {
                                    field610 = -1;
                                    var1 = true;
                                    break label2692;
                                }
                                boolean var245 = false;
                                int var246;
                                for (var246 = 0; var246 < Statics.field2461 && (!Statics.field2012[var246].field110.equals(var241) || Statics.field2012[var246].field116 != var242); var246++) {
                                }
                                if (var246 < Statics.field2461) {
                                    while (var246 < Statics.field2461 - 1) {
                                        Statics.field2012[var246] = Statics.field2012[var246 + 1];
                                        var246++;
                                    }
                                    Statics.field2461--;
                                    Statics.field2012[Statics.field2461] = null;
                                }
                            } else {
                                field514.method2490();
                                class8 var247 = new class8();
                                var247.field110 = var241;
                                var247.field109 = class148.method2960(var247.field110, Statics.field2049);
                                var247.field116 = var242;
                                var247.field111 = var243;
                                int var248;
                                for (var248 = Statics.field2461 - 1; var248 >= 0; var248--) {
                                    int var249 = Statics.field2012[var248].field109.compareTo(var247.field110);
                                    if (var249 == 0) {
                                        Statics.field2012[var248].field116 = var242;
                                        Statics.field2012[var248].field111 = var243;
                                        if (var241.equals(Statics.field2006.field40)) {
                                            Statics.field2333 = var243;
                                        }
                                        field666 = field474;
                                        field610 = -1;
                                        var1 = true;
                                        break label2692;
                                    }
                                    if (var249 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field2461 >= Statics.field2012.length) {
                                    field610 = -1;
                                    var1 = true;
                                    break label2692;
                                }
                                for (int var250 = Statics.field2461 - 1; var250 > var248; var250--) {
                                    Statics.field2012[var250 + 1] = Statics.field2012[var250];
                                }
                                if (Statics.field2461 == 0) {
                                    Statics.field2012 = new class8[100];
                                }
                                Statics.field2012[var248 + 1] = var247;
                                Statics.field2461++;
                                if (var241.equals(Statics.field2006.field40)) {
                                    Statics.field2333 = var243;
                                }
                            }
                            field666 = field474;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 19) {
                            int var251 = field514.method2571();
                            field634 = var251;
                            if (class158.method2227(var251)) {
                                class158[] var252 = Statics.field2608[var251];
                                for (int var253 = 0; var253 < var252.length; var253++) {
                                    class158 var254 = var252[var253];
                                    if (var254 != null) {
                                        var254.field2690 = 0;
                                        var254.field2613 = 0;
                                    }
                                }
                            }
                            class26.method683(field634);
                            for (int var255 = 0; var255 < 100; var255++) {
                                field678[var255] = true;
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 128) {
                            int var256 = field514.method2523();
                            int var257 = field514.method2588();
                            int var258 = field514.method2551();
                            class158 var259 = class158.method667(var258);
                            int var260 = var259.field2634 + var257;
                            int var261 = var259.field2592 + var256;
                            if (var259.field2589 != var260 || var259.field2590 != var261) {
                                var259.field2589 = var260;
                                var259.field2590 = var261;
                                method42(var259);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 64) {
                            String var262 = field514.method2490();
                            long var263 = field514.method2494();
                            long var265 = (long) field514.method2652();
                            long var267 = (long) field514.method2595();
                            int var269 = field514.method2659();
                            long var270 = (var265 << 32) + var267;
                            boolean var272 = false;
                            for (int var273 = 0; var273 < 100; var273++) {
                                if (field694[var273] == var270) {
                                    var272 = true;
                                    break;
                                }
                            }
                            if (var269 <= 1 && method150(var262)) {
                                var272 = true;
                            }
                            if (!var272 && field737 == 0) {
                                field694[field710] = var270;
                                field710 = (field710 + 1) % 100;
                                class116 var274 = field514;
                                String var275 = class184.method1425(var274, 32767);
                                String var276 = class185.method3401(class147.method1548(var275));
                                if (var269 == 2 || var269 == 3) {
                                    method163(9, Statics.method625(1) + var262, var276, class146.method2072(var263));
                                } else if (var269 == 1) {
                                    method163(9, Statics.method625(0) + var262, var276, class146.method2072(var263));
                                } else {
                                    method163(9, var262, var276, class146.method2072(var263));
                                }
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 136) {
                            method833();
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 175) {
                            String var277 = field514.method2490();
                            if (var277.endsWith(":tradereq:")) {
                                String var278 = var277.substring(0, var277.indexOf(":"));
                                boolean var279 = false;
                                if (method150(var278)) {
                                    var279 = true;
                                }
                                if (!var279 && field737 == 0) {
                                    method2724(4, var278, class134.field2224);
                                }
                            } else if (var277.endsWith(":duelreq:")) {
                                String var280 = var277.substring(0, var277.indexOf(":"));
                                boolean var281 = false;
                                if (method150(var280)) {
                                    var281 = true;
                                }
                                if (!var281 && field737 == 0) {
                                    method2724(8, var280, class134.field2225);
                                }
                            } else if (var277.endsWith(":chalreq:")) {
                                String var282 = var277.substring(0, var277.indexOf(":"));
                                boolean var283 = false;
                                if (method150(var282)) {
                                    var283 = true;
                                }
                                if (!var283 && field737 == 0) {
                                    String var284 = var277.substring(var277.indexOf(":") + 1, var277.length() - 9);
                                    method2724(8, var282, var284);
                                }
                            } else if (var277.endsWith(":assistreq:")) {
                                String var285 = var277.substring(0, var277.indexOf(":"));
                                boolean var286 = false;
                                if (method150(var285)) {
                                    var286 = true;
                                }
                                if (!var286 && field737 == 0) {
                                    method2724(10, var285, "");
                                }
                            } else if (var277.endsWith(":clan:")) {
                                String var287 = var277.substring(0, var277.indexOf(":clan:"));
                                method2724(11, "", var287);
                            } else if (var277.endsWith(":trade:")) {
                                String var288 = var277.substring(0, var277.indexOf(":trade:"));
                                if (field737 == 0) {
                                    method2724(12, "", var288);
                                }
                            } else if (var277.endsWith(":assist:")) {
                                String var289 = var277.substring(0, var277.indexOf(":assist:"));
                                if (field737 == 0) {
                                    method2724(13, "", var289);
                                }
                            } else {
                                method2724(0, "", var277);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 66) {
                            int var290 = field514.method2520();
                            if (var290 == 65535) {
                                var290 = -1;
                            }
                            Statics.method2341(var290);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 140) {
                            int var291 = field514.method2526();
                            int var292 = field514.method2652();
                            if (var292 == 65535) {
                                var292 = -1;
                            }
                            method123(var292, var291);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 225) {
                            int var293 = field514.method2659();
                            int var294 = field514.method2659();
                            int var295 = field514.method2659();
                            int var296 = field514.method2659();
                            field650[var293] = true;
                            field723[var293] = var294;
                            field724[var293] = var295;
                            field725[var293] = var296;
                            field726[var293] = 0;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 13) {
                            field692 = field514.method2659();
                            field693 = field514.method2659();
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 207) {
                            int var297 = field514.method2531();
                            int var298 = field514.method2652();
                            class158 var299 = class158.method667(var297);
                            if (var299.field2593 != 2 || var299.field2617 != var298) {
                                var299.field2593 = 2;
                                var299.field2617 = var298;
                                method42(var299);
                            }
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 139) {
                            int var300 = field514.method2531();
                            class158 var301 = class158.method667(var300);
                            var301.field2593 = 3;
                            var301.field2617 = Statics.field2006.field35.method3189();
                            method42(var301);
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        if (field610 == 229) {
                            field728 = 1;
                            field665 = field474;
                            field610 = -1;
                            var1 = true;
                            break label2692;
                        }
                        class80.method1379("" + field610 + class2.field19 + field521 + class2.field19 + field522 + class2.field19 + field496, (Throwable) null);
                        method1();
                    } catch (IOException var407) {
                        if (field519 > 0) {
                            method1();
                        } else {
                            method22(40);
                            Statics.field334 = Statics.field77;
                            Statics.field77 = null;
                        }
                    } catch (Exception var408) {
                        String var304 = "" + field610 + class2.field19 + field521 + class2.field19 + field522 + class2.field19 + field496 + class2.field19 + (Statics.field85 + Statics.field2006.field430[0]) + class2.field19 + (Statics.field1552 + Statics.field2006.field463[0]) + class2.field19;
                        for (int var305 = 0; var305 < field496 && var305 < 50; var305++) {
                            var304 = var304 + field514.field2037[var305] + class2.field19;
                        }
                        class80.method1379(var304, var408);
                        method1();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field479 != 30) {
            return;
        }
        class182.method627(field512, 120);
        Object var306 = Statics.field483.field235;
        synchronized (Statics.field483.field235) {
            if (!field472) {
                Statics.field483.field236 = 0;
            } else if (class77.field1402 != 0 || Statics.field483.field236 >= 40) {
                field512.method2356(37);
                field512.method2474(0);
                int var307 = field512.field2038;
                int var308 = 0;
                for (int var309 = 0; var309 < Statics.field483.field236 && field512.field2038 - var307 < 240; var309++) {
                    var308++;
                    int var310 = Statics.field483.field238[var309];
                    if (var310 < 0) {
                        var310 = 0;
                    } else if (var310 > 502) {
                        var310 = 502;
                    }
                    int var311 = Statics.field483.field237[var309];
                    if (var311 < 0) {
                        var311 = 0;
                    } else if (var311 > 764) {
                        var311 = 764;
                    }
                    int var312 = var310 * 765 + var311;
                    if (Statics.field483.field238[var309] == -1 && Statics.field483.field237[var309] == -1) {
                        var311 = -1;
                        var310 = -1;
                        var312 = 524287;
                    }
                    if (field484 != var311 || field644 != var310) {
                        int var313 = var311 - field484;
                        field484 = var311;
                        int var314 = var310 - field644;
                        field644 = var310;
                        if (field486 < 8 && var313 >= -32 && var313 <= 31 && var314 >= -32 && var314 <= 31) {
                            var313 += 32;
                            var314 += 32;
                            field512.method2475((field486 << 12) + (var313 << 6) + var314);
                            field486 = 0;
                        } else if (field486 < 8) {
                            field512.method2476((field486 << 19) + 8388608 + var312);
                            field486 = 0;
                        } else {
                            field512.method2606((field486 << 19) + -1073741824 + var312);
                            field486 = 0;
                        }
                    } else if (field486 < 2047) {
                        field486++;
                    }
                }
                field512.method2485(field512.field2038 - var307);
                if (var308 >= Statics.field483.field236) {
                    Statics.field483.field236 = 0;
                } else {
                    Statics.field483.field236 -= var308;
                    for (int var315 = 0; var315 < Statics.field483.field236; var315++) {
                        Statics.field483.field237[var315] = Statics.field483.field237[var308 + var315];
                        Statics.field483.field238[var315] = Statics.field483.field238[var308 + var315];
                    }
                }
            }
        }
        if (class77.field1402 != 0) {
            long var317 = (class77.field1396 - field482 * -1L) / 50L;
            if (var317 > 4095L) {
                var317 = 4095L;
            }
            field482 = class77.field1396 * -1L;
            int var319 = class77.field1404;
            if (var319 < 0) {
                var319 = 0;
            } else if (var319 > 502) {
                var319 = 502;
            }
            int var320 = class77.field1395;
            if (var320 < 0) {
                var320 = 0;
            } else if (var320 > 764) {
                var320 = 764;
            }
            int var321 = var319 * 765 + var320;
            byte var322 = 0;
            if (class77.field1402 == 2) {
                var322 = 1;
            }
            int var323 = (int) var317;
            field512.method2356(97);
            field512.method2606((var322 << 19) + (var323 << 20) + var321);
        }
        if (class75.field1370 > 0) {
            field512.method2356(159);
            field512.method2475(0);
            int var324 = field512.field2038;
            long var325 = class121.method711();
            for (int var327 = 0; var327 < class75.field1370; var327++) {
                long var328 = var325 - field699;
                if (var328 > 16777215L) {
                    var328 = 16777215L;
                }
                field699 = var325;
                field512.method2525((int) var328);
                field512.method2509(class75.field1376[var327]);
            }
            field512.method2484(field512.field2038 - var324);
        }
        if (field564 > 0) {
            field564--;
        }
        if (class75.field1363[96] || class75.field1363[97] || class75.field1363[98] || class75.field1363[99]) {
            field565 = true;
        }
        if (field565 && field564 <= 0) {
            field564 = 20;
            field565 = false;
            field512.method2356(117);
            field512.method2475(field560);
            field512.method2475(field561);
        }
        if (Statics.field393 && !field487) {
            field487 = true;
            field512.method2356(145);
            field512.method2474(1);
        }
        if (!Statics.field393 && field487) {
            field487 = false;
            field512.method2356(145);
            field512.method2474(0);
        }
        method2727();
        if (field479 != 30) {
            return;
        }
        for (class22 var330 = (class22) field609.method3334(); var330 != null; var330 = (class22) field609.method3355()) {
            if (var330.field340 > 0) {
                var330.field340--;
            }
            if (var330.field340 != 0) {
                if (var330.field342 > 0) {
                    var330.field342--;
                }
                if (var330.field342 == 0 && var330.field336 >= 1 && var330.field337 >= 1 && var330.field336 <= 102 && var330.field337 <= 102 && (var330.field351 < 0 || class9.method12(var330.field351, var330.field345))) {
                    method2353(var330.field347, var330.field335, var330.field336, var330.field337, var330.field351, var330.field343, var330.field345);
                    var330.field342 = -1;
                    if (var330.field351 == var330.field338 && var330.field338 == -1) {
                        var330.method3360();
                    } else if (var330.field351 == var330.field338 && var330.field343 == var330.field339 && var330.field346 == var330.field345) {
                        var330.method3360();
                    }
                }
            } else if (var330.field338 < 0 || class9.method12(var330.field338, var330.field346)) {
                method2353(var330.field347, var330.field335, var330.field336, var330.field337, var330.field338, var330.field339, var330.field346);
                var330.method3360();
            }
        }
        method177();
        field517++;
        if (field517 <= 750) {
            method2076();
            method38();
            method1401();
            field601++;
            if (field731 != 0) {
                field583 += 20;
                if (field583 >= 400) {
                    field731 = 0;
                }
            }
            if (Statics.field1662 != null) {
                field529++;
                if (field529 >= 15) {
                    method42(Statics.field1662);
                    Statics.field1662 = null;
                }
            }
            if (Statics.field752 != null) {
                method42(Statics.field752);
                field668++;
                if (class77.field1397 > field588 + 5 || class77.field1397 < field588 - 5 || class77.field1391 > field659 + 5 || class77.field1391 < field659 - 5) {
                    field591 = true;
                }
                if (class77.field1390 == 0) {
                    if (field591 && field668 >= 5) {
                        if (Statics.field752 == Statics.field276 && field590 != field587) {
                            class158 var331 = Statics.field752;
                            byte var332 = 0;
                            if (field637 == 1 && var331.field2614 == 206) {
                                var332 = 1;
                            }
                            if (var331.field2686[field590] <= 0) {
                                var332 = 0;
                            }
                            int var333 = method242(var331);
                            boolean var334 = (var333 >> 29 & 0x1) != 0;
                            if (var334) {
                                int var335 = field587;
                                int var336 = field590;
                                var331.field2686[var336] = var331.field2686[var335];
                                var331.field2687[var336] = var331.field2687[var335];
                                var331.field2686[var335] = -1;
                                var331.field2687[var335] = 0;
                            } else if (var332 == 1) {
                                int var337 = field587;
                                int var338 = field590;
                                while (var337 != var338) {
                                    if (var337 > var338) {
                                        var331.method3130(var337 - 1, var337);
                                        var337--;
                                    } else if (var337 < var338) {
                                        var331.method3130(var337 + 1, var337);
                                        var337++;
                                    }
                                }
                            } else {
                                var331.method3130(field590, field587);
                            }
                            field512.method2356(250);
                            field512.method2527(Statics.field752.field2584);
                            field512.method2474(var332);
                            field512.method2518(field587);
                            field512.method2519(field590);
                        }
                    } else if ((field655 == 1 || method3071(field558 - 1)) && field558 > 2) {
                        method2424();
                    } else if (field558 > 0) {
                        method3110(field558 - 1);
                    }
                    field529 = 10;
                    class77.field1402 = 0;
                    Statics.field752 = null;
                }
            }
            class158 var339 = Statics.field183;
            class158 var340 = Statics.field1758;
            Statics.field183 = null;
            Statics.field1758 = null;
            field493 = null;
            field653 = false;
            field600 = false;
            for (field696 = 0; class75.method2730() && field696 < 128; field696++) {
                field722[field696] = Statics.field1178;
                field697[field696] = Statics.field384;
            }
            method165(field634, 0, 0, 765, 503, 0, 0);
            field474++;
            while (true) {
                class1 var341;
                class158 var342;
                class158 var343;
                do {
                    var341 = (class1) field557.method3353();
                    if (var341 == null) {
                        while (true) {
                            class1 var344;
                            class158 var345;
                            class158 var346;
                            do {
                                var344 = (class1) field673.method3353();
                                if (var344 == null) {
                                    while (true) {
                                        class1 var347;
                                        class158 var348;
                                        class158 var349;
                                        do {
                                            var347 = (class1) field593.method3353();
                                            if (var347 == null) {
                                                if (field645 != null) {
                                                    method42(field645);
                                                    Statics.field2389++;
                                                    if (field653 && field600) {
                                                        int var350 = class77.field1397;
                                                        int var351 = class77.field1391;
                                                        int var352 = var350 - field575;
                                                        int var353 = var351 - field648;
                                                        if (var352 < field615) {
                                                            var352 = field615;
                                                        }
                                                        if (field645.field2585 + var352 > field615 + field646.field2585) {
                                                            var352 = field615 + field646.field2585 - field645.field2585;
                                                        }
                                                        if (var353 < field475) {
                                                            var353 = field475;
                                                        }
                                                        if (field645.field2594 + var353 > field475 + field646.field2594) {
                                                            var353 = field475 + field646.field2594 - field645.field2594;
                                                        }
                                                        int var354 = var352 - field552;
                                                        int var355 = var353 - field549;
                                                        int var356 = field645.field2647;
                                                        if (Statics.field2389 > field645.field2648 && (var354 > var356 || var354 < -var356 || var355 > var356 || var355 < -var356)) {
                                                            field508 = true;
                                                        }
                                                        int var357 = field646.field2597 + (var352 - field615);
                                                        int var358 = field646.field2598 + (var353 - field475);
                                                        if (field645.field2660 != null && field508) {
                                                            class1 var359 = new class1();
                                                            var359.field2 = field645;
                                                            var359.field6 = var357;
                                                            var359.field4 = var358;
                                                            var359.field1 = field645.field2660;
                                                            class26.method916(var359);
                                                        }
                                                        if (class77.field1390 == 0) {
                                                            if (field508) {
                                                                if (field645.field2661 != null) {
                                                                    class1 var360 = new class1();
                                                                    var360.field2 = field645;
                                                                    var360.field6 = var357;
                                                                    var360.field4 = var358;
                                                                    var360.field5 = field493;
                                                                    var360.field1 = field645.field2661;
                                                                    class26.method916(var360);
                                                                }
                                                                if (field493 != null) {
                                                                    class158 var361 = field645;
                                                                    int var362 = Statics.method817(method242(var361));
                                                                    class158 var363;
                                                                    if (var362 == 0) {
                                                                        var363 = null;
                                                                    } else {
                                                                        int var364 = 0;
                                                                        while (true) {
                                                                            if (var364 >= var362) {
                                                                                var363 = var361;
                                                                                break;
                                                                            }
                                                                            var361 = class158.method667(var361.field2696);
                                                                            if (var361 == null) {
                                                                                var363 = null;
                                                                                break;
                                                                            }
                                                                            var364++;
                                                                        }
                                                                    }
                                                                    if (var363 != null) {
                                                                        field512.method2356(211);
                                                                        field512.method2518(field493.field2678);
                                                                        field512.method2475(field645.field2678);
                                                                        field512.method2527(field645.field2584);
                                                                        field512.method2529(field493.field2584);
                                                                    }
                                                                }
                                                            } else if ((field655 == 1 || method3071(field558 - 1)) && field558 > 2) {
                                                                method2424();
                                                            } else if (field558 > 0) {
                                                                method3110(field558 - 1);
                                                            }
                                                            field645 = null;
                                                        }
                                                    } else if (Statics.field2389 > 1) {
                                                        field645 = null;
                                                    }
                                                }
                                                if (class95.field1609 != -1) {
                                                    int var365 = class95.field1609;
                                                    int var366 = class95.field1595;
                                                    boolean var367 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var365, var366, true, 0, 0, 0, 0, 0, 0);
                                                    class95.field1609 = -1;
                                                    if (var367) {
                                                        field581 = class77.field1395;
                                                        field582 = class77.field1404;
                                                        field731 = 1;
                                                        field583 = 0;
                                                    }
                                                }
                                                method14();
                                                if (Statics.field183 != var339) {
                                                    if (var339 != null) {
                                                        method42(var339);
                                                    }
                                                    if (Statics.field183 != null) {
                                                        method42(Statics.field183);
                                                    }
                                                }
                                                if (Statics.field1758 != var340 && field627 == field626) {
                                                    if (var340 != null) {
                                                        method42(var340);
                                                    }
                                                    if (Statics.field1758 != null) {
                                                        method42(Statics.field1758);
                                                    }
                                                }
                                                if (Statics.field1758 == null) {
                                                    if (field626 > 0) {
                                                        field626--;
                                                    }
                                                } else if (field626 < field627) {
                                                    field626++;
                                                    if (field627 == field626) {
                                                        method42(Statics.field1758);
                                                    }
                                                }
                                                int var368 = field597 + Statics.field2006.field455;
                                                int var369 = field495 + Statics.field2006.field411;
                                                if (Statics.field392 - var368 < -500 || Statics.field392 - var368 > 500 || Statics.field937 - var369 < -500 || Statics.field937 - var369 > 500) {
                                                    Statics.field392 = var368;
                                                    Statics.field937 = var369;
                                                }
                                                if (Statics.field392 != var368) {
                                                    Statics.field392 += (var368 - Statics.field392) / 16;
                                                }
                                                if (Statics.field937 != var369) {
                                                    Statics.field937 += (var369 - Statics.field937) / 16;
                                                }
                                                if (class75.field1363[96]) {
                                                    field562 += (-24 - field562) / 2;
                                                } else if (class75.field1363[97]) {
                                                    field562 += (24 - field562) / 2;
                                                } else {
                                                    field562 /= 2;
                                                }
                                                if (class75.field1363[98]) {
                                                    field585 += (12 - field585) / 2;
                                                } else if (class75.field1363[99]) {
                                                    field585 += (-12 - field585) / 2;
                                                } else {
                                                    field585 /= 2;
                                                }
                                                field561 = field562 / 2 + field561 & 0x7FF;
                                                field560 += field585 / 2;
                                                if (field560 < 128) {
                                                    field560 = 128;
                                                }
                                                if (field560 > 383) {
                                                    field560 = 383;
                                                }
                                                int var370 = Statics.field392 >> 7;
                                                int var371 = Statics.field937 >> 7;
                                                int var372 = method49(Statics.field392, Statics.field937, Statics.field231);
                                                int var373 = 0;
                                                if (var370 > 3 && var371 > 3 && var370 < 100 && var371 < 100) {
                                                    for (int var374 = var370 - 4; var374 <= var370 + 4; var374++) {
                                                        for (int var375 = var371 - 4; var375 <= var371 + 4; var375++) {
                                                            int var376 = Statics.field231;
                                                            if (var376 < 3 && (class9.field120[1][var374][var375] & 0x2) == 2) {
                                                                var376++;
                                                            }
                                                            int var377 = var372 - class9.field136[var376][var374][var375];
                                                            if (var377 > var373) {
                                                                var373 = var377;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var378 = var373 * 192;
                                                if (var378 > 98048) {
                                                    var378 = 98048;
                                                }
                                                if (var378 < 32768) {
                                                    var378 = 32768;
                                                }
                                                if (var378 > field566) {
                                                    field566 += (var378 - field566) / 24;
                                                } else if (var378 < field566) {
                                                    field566 += (var378 - field566) / 80;
                                                }
                                                if (field516) {
                                                    int var379 = Statics.field285 * 128 + 64;
                                                    int var380 = Statics.field354 * 128 + 64;
                                                    int var381 = method49(var379, var380, Statics.field231) - Statics.field112;
                                                    if (Statics.field378 < var379) {
                                                        Statics.field378 += Statics.field1449 * (var379 - Statics.field378) / 1000 + Statics.field1382;
                                                        if (Statics.field378 > var379) {
                                                            Statics.field378 = var379;
                                                        }
                                                    }
                                                    if (Statics.field378 > var379) {
                                                        Statics.field378 -= Statics.field1449 * (Statics.field378 - var379) / 1000 + Statics.field1382;
                                                        if (Statics.field378 < var379) {
                                                            Statics.field378 = var379;
                                                        }
                                                    }
                                                    if (Statics.field1380 < var381) {
                                                        Statics.field1380 += Statics.field1449 * (var381 - Statics.field1380) / 1000 + Statics.field1382;
                                                        if (Statics.field1380 > var381) {
                                                            Statics.field1380 = var381;
                                                        }
                                                    }
                                                    if (Statics.field1380 > var381) {
                                                        Statics.field1380 -= Statics.field1449 * (Statics.field1380 - var381) / 1000 + Statics.field1382;
                                                        if (Statics.field1380 < var381) {
                                                            Statics.field1380 = var381;
                                                        }
                                                    }
                                                    if (Statics.field2323 < var380) {
                                                        Statics.field2323 += Statics.field1449 * (var380 - Statics.field2323) / 1000 + Statics.field1382;
                                                        if (Statics.field2323 > var380) {
                                                            Statics.field2323 = var380;
                                                        }
                                                    }
                                                    if (Statics.field2323 > var380) {
                                                        Statics.field2323 -= Statics.field1449 * (Statics.field2323 - var380) / 1000 + Statics.field1382;
                                                        if (Statics.field2323 < var380) {
                                                            Statics.field2323 = var380;
                                                        }
                                                    }
                                                    int var382 = Statics.field1660 * 128 + 64;
                                                    int var383 = Statics.field1967 * 128 + 64;
                                                    int var384 = method49(var382, var383, Statics.field231) - Statics.field391;
                                                    int var385 = var382 - Statics.field378;
                                                    int var386 = var384 - Statics.field1380;
                                                    int var387 = var383 - Statics.field2323;
                                                    int var388 = (int) Math.sqrt((double) (var385 * var385 + var387 * var387));
                                                    int var389 = (int) (Math.atan2((double) var386, (double) var388) * 325.949D) & 0x7FF;
                                                    int var390 = (int) (Math.atan2((double) var385, (double) var387) * -325.949D) & 0x7FF;
                                                    if (var389 < 128) {
                                                        var389 = 128;
                                                    }
                                                    if (var389 > 383) {
                                                        var389 = 383;
                                                    }
                                                    if (Statics.field1620 < var389) {
                                                        Statics.field1620 += Statics.field741 * (var389 - Statics.field1620) / 1000 + Statics.field1209;
                                                        if (Statics.field1620 > var389) {
                                                            Statics.field1620 = var389;
                                                        }
                                                    }
                                                    if (Statics.field1620 > var389) {
                                                        Statics.field1620 -= Statics.field741 * (Statics.field1620 - var389) / 1000 + Statics.field1209;
                                                        if (Statics.field1620 < var389) {
                                                            Statics.field1620 = var389;
                                                        }
                                                    }
                                                    int var391 = var390 - Statics.field1757;
                                                    if (var391 > 1024) {
                                                        var391 -= 2048;
                                                    }
                                                    if (var391 < -1024) {
                                                        var391 += 2048;
                                                    }
                                                    if (var391 > 0) {
                                                        Statics.field1757 += Statics.field741 * var391 / 1000 + Statics.field1209;
                                                        Statics.field1757 &= 0x7FF;
                                                    }
                                                    if (var391 < 0) {
                                                        Statics.field1757 -= Statics.field741 * -var391 / 1000 + Statics.field1209;
                                                        Statics.field1757 &= 0x7FF;
                                                    }
                                                    int var392 = var390 - Statics.field1757;
                                                    if (var392 > 1024) {
                                                        var392 -= 2048;
                                                    }
                                                    if (var392 < -1024) {
                                                        var392 += 2048;
                                                    }
                                                    if (var392 < 0 && var391 > 0 || var392 > 0 && var391 < 0) {
                                                        Statics.field1757 = var390;
                                                    }
                                                }
                                                for (int var393 = 0; var393 < 5; var393++) {
                                                    int var10002 = field726[var393]++;
                                                }
                                                int var394 = class77.method120();
                                                int var395 = class75.method128();
                                                if (var394 > 15000 && var395 > 15000) {
                                                    field519 = 250;
                                                    class77.field1403 = 14500;
                                                    field512.method2356(121);
                                                }
                                                field547++;
                                                if (field547 > 500) {
                                                    field547 = 0;
                                                    int var396 = (int) (Math.random() * 8.0D);
                                                    if ((var396 & 0x1) == 1) {
                                                        field597 += field541;
                                                    }
                                                    if ((var396 & 0x2) == 2) {
                                                        field495 += field537;
                                                    }
                                                    if ((var396 & 0x4) == 4) {
                                                        field504 += field672;
                                                    }
                                                }
                                                if (field597 < -50) {
                                                    field541 = 2;
                                                }
                                                if (field597 > 50) {
                                                    field541 = -2;
                                                }
                                                if (field495 < -55) {
                                                    field537 = 2;
                                                }
                                                if (field495 > 55) {
                                                    field537 = -2;
                                                }
                                                if (field504 < -40) {
                                                    field672 = 1;
                                                }
                                                if (field504 > 40) {
                                                    field672 = -1;
                                                }
                                                field551++;
                                                if (field551 > 500) {
                                                    field551 = 0;
                                                    int var397 = (int) (Math.random() * 8.0D);
                                                    if ((var397 & 0x1) == 1) {
                                                        field660 += field548;
                                                    }
                                                    if ((var397 & 0x2) == 2) {
                                                        field511 += field550;
                                                    }
                                                }
                                                if (field660 < -60) {
                                                    field548 = 2;
                                                }
                                                if (field660 > 60) {
                                                    field548 = -2;
                                                }
                                                if (field511 < -20) {
                                                    field550 = 1;
                                                }
                                                if (field511 > 10) {
                                                    field550 = -1;
                                                }
                                                for (class28 var398 = (class28) field470.method3302(); var398 != null; var398 = (class28) field470.method3303()) {
                                                    if ((long) var398.field745 < class121.method711() / 1000L - 5L) {
                                                        if (var398.field740 > 0) {
                                                            method2724(5, "", var398.field738 + class134.field2161);
                                                        }
                                                        if (var398.field740 == 0) {
                                                            method2724(5, "", var398.field738 + class134.field2128);
                                                        }
                                                        var398.method3356();
                                                    }
                                                }
                                                field518++;
                                                if (field518 > 50) {
                                                    field512.method2356(95);
                                                }
                                                try {
                                                    if (Statics.field77 != null && field512.field2038 > 0) {
                                                        Statics.field77.method1414(field512.field2037, 0, field512.field2038);
                                                        field512.field2038 = 0;
                                                        field518 = 0;
                                                    }
                                                } catch (IOException var400) {
                                                    if (field519 > 0) {
                                                        method1();
                                                    } else {
                                                        method22(40);
                                                        Statics.field334 = Statics.field77;
                                                        Statics.field77 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var348 = var347.field2;
                                            if (var348.field2678 < 0) {
                                                break;
                                            }
                                            var349 = class158.method667(var348.field2696);
                                        } while (var349 == null || var349.field2692 == null || var348.field2678 >= var349.field2692.length || var349.field2692[var348.field2678] != var348);
                                        class26.method916(var347);
                                    }
                                }
                                var345 = var344.field2;
                                if (var345.field2678 < 0) {
                                    break;
                                }
                                var346 = class158.method667(var345.field2696);
                            } while (var346 == null || var346.field2692 == null || var345.field2678 >= var346.field2692.length || var346.field2692[var345.field2678] != var345);
                            class26.method916(var344);
                        }
                    }
                    var342 = var341.field2;
                    if (var342.field2678 < 0) {
                        break;
                    }
                    var343 = class158.method667(var342.field2696);
                } while (var343 == null || var343.field2692 == null || var342.field2678 >= var343.field2692.length || var343.field2692[var342.field2678] != var342);
                class26.method916(var341);
            }
        } else if (field519 > 0) {
            method1();
        } else {
            method22(40);
            Statics.field334 = Statics.field77;
            Statics.field77 = null;
        }
    }

    @ObfuscatedName("df.m(I)V")
    public static final void method2340() {
        if (Statics.field287 != null) {
            Statics.field287.method1192();
        }
        if (Statics.field169 != null) {
            Statics.field169.method1192();
        }
    }

    @ObfuscatedName("j.y(B)V")
    public static final void method177() {
        for (int var0 = 0; var0 < field685; var0++) {
            int var10002 = field718[var0]--;
            if (field718[var0] >= -10) {
                class57 var2 = field720[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1279(Statics.field197, field647[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field718[var0] += var2.method1288();
                    field720[var0] = var2;
                }
                if (field718[var0] < 0) {
                    int var9;
                    if (field719[var0] == 0) {
                        var9 = field713;
                    } else {
                        int var3 = (field719[var0] & 0xFF) * 128;
                        int var4 = field719[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2006.field455;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field719[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2006.field411;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field718[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field714 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1280().method1350(Statics.field967);
                        class45 var11 = class45.method1130(var10, 100, var9);
                        var11.method974(field570[var0] - 1);
                        Statics.field119.method1134(var11);
                    }
                    field718[var0] = -100;
                }
            } else {
                field685--;
                for (int var1 = var0; var1 < field685; var1++) {
                    field647[var1] = field647[var1 + 1];
                    field720[var1] = field720[var1 + 1];
                    field570[var1] = field570[var1 + 1];
                    field718[var1] = field718[var1 + 1];
                    field719[var1] = field719[var1 + 1];
                }
                var0--;
            }
        }
        if (!field569) {
            return;
        }
        boolean var12;
        if (class138.field2347 == 0) {
            var12 = Statics.field2341.method2774();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field617 != 0 && field663 != -1) {
                Statics.method1407(Statics.field1211, field663, 0, field617, false);
            }
            field569 = false;
        }
    }

    @ObfuscatedName("j.t(Lah;IIIB)V")
    public static void method178(class34 arg0, int arg1, int arg2, int arg3) {
        if (field685 >= 50 || field714 == 0 || arg0.field884 == null || arg1 >= arg0.field884.length) {
            return;
        }
        int var4 = arg0.field884[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field647[field685] = var5;
        field570[field685] = var6;
        field718[field685] = 0;
        field720[field685] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field719[field685] = (var8 << 16) + (var9 << 8) + var7;
        field685++;
    }

    @ObfuscatedName("a.k(IIII)V")
    public static void method138(int arg0, int arg1, int arg2) {
        if (field713 == 0 || arg1 == 0 || field685 >= 50) {
            return;
        }
        field647[field685] = arg0;
        field570[field685] = arg1;
        field718[field685] = arg2;
        field720[field685] = null;
        field719[field685] = 0;
        field685++;
    }

    @ObfuscatedName("r.at(III)V")
    public static void method123(int arg0, int arg1) {
        if (field617 != 0 && arg0 != -1) {
            Statics.method1407(Statics.field1859, arg0, 0, field617, false);
            field569 = true;
        }
    }

    @ObfuscatedName("ex.ay(B)V")
    public static final void method2727() {
        if (field477 && Statics.field231 != field524) {
            method34(Statics.field251, Statics.field808, Statics.field231, Statics.field2006.field430[0], Statics.field2006.field463[0]);
        } else if (Statics.field231 != field702) {
            field702 = Statics.field231;
            int var0 = Statics.field231;
            int[] var1 = Statics.field248.field1476;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field120[var0][var6][var4] & 0x18) == 0) {
                        Statics.field53.method1953(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field120[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field53.method1953(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field248.method1721();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field120[var0][var10][var9] & 0x18) == 0) {
                        method173(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field120[var0 + 1][var10][var9] & 0x8) != 0) {
                        method173(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field703 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field53.method1948(Statics.field231, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class32.method3258(var14).field841;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field531[Statics.field231].field2752;
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
                            field654[field703] = Statics.field721[var15];
                            field704[field703] = var16;
                            field705[field703] = var17;
                            field703++;
                        }
                    }
                }
            }
            Statics.field1381.method1717();
        }
    }

    @ObfuscatedName("by.ae(B)V")
    public static final void method1401() {
        for (int var0 = -1; var0 < field630; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field596[var0];
            }
            class3 var2 = field594[var1];
            if (var2 != null && var2.field424 > 0) {
                var2.field424--;
                if (var2.field424 == 0) {
                    var2.field410 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field510; var3++) {
            int var4 = field657[var3];
            class25 var5 = field509[var4];
            if (var5 != null && var5.field424 > 0) {
                var5.field424--;
                if (var5.field424 == 0) {
                    var5.field410 = null;
                }
            }
        }
    }

    @ObfuscatedName("ck.af(Ljava/lang/String;I)V")
    public static final void method2074(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field380.field180 = !Statics.field380.field180;
            class12.method1677();
            if (Statics.field380.field180) {
                method2724(0, "", "Roofs are now all hidden");
            } else {
                method2724(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field641 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                if (field519 > 0) {
                    method1();
                } else {
                    method22(40);
                    Statics.field334 = Statics.field77;
                    Statics.field77 = null;
                }
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field651 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field651 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field531[var1].field2752[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field669 == 2) {
                throw new RuntimeException();
            }
        }
        field512.method2356(245);
        field512.method2474(arg0.length() - 1);
        field512.method2479(arg0.substring(2));
    }

    @ObfuscatedName("ca.ao(I)V")
    public static final void method2076() {
        for (int var0 = -1; var0 < field630; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field596[var0];
            }
            class3 var2 = field594[var1];
            if (var2 != null) {
                method48(var2, 1);
            }
        }
    }

    @ObfuscatedName("n.ad(B)V")
    public static final void method38() {
        for (int var0 = 0; var0 < field510; var0++) {
            int var1 = field657[var0];
            class25 var2 = field509[var1];
            if (var2 != null) {
                method48(var2, var2.field388.field779);
            }
        }
    }

    @ObfuscatedName("v.aj(Lat;IB)V")
    public static final void method48(class27 arg0, int arg1) {
        if (arg0.field453 > field481) {
            method6(arg0);
        } else if (arg0.field454 >= field481) {
            method1582(arg0);
        } else {
            arg0.field436 = arg0.field449;
            if (arg0.field461 == 0) {
                arg0.field445 = 0;
            } else {
                label315: {
                    if (arg0.field439 != -1 && arg0.field414 == 0) {
                        class34 var2 = class34.method160(arg0.field439);
                        if (arg0.field466 > 0 && var2.field877 == 0) {
                            arg0.field445++;
                            break label315;
                        }
                        if (arg0.field466 <= 0 && var2.field893 == 0) {
                            arg0.field445++;
                            break label315;
                        }
                    }
                    int var3 = arg0.field455;
                    int var4 = arg0.field411;
                    int var5 = arg0.field430[arg0.field461 - 1] * 128 + arg0.field443 * 64;
                    int var6 = arg0.field463[arg0.field461 - 1] * 128 + arg0.field443 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field458 = 1280;
                            } else if (var4 > var6) {
                                arg0.field458 = 1792;
                            } else {
                                arg0.field458 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field458 = 768;
                            } else if (var4 > var6) {
                                arg0.field458 = 256;
                            } else {
                                arg0.field458 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field458 = 1024;
                        } else if (var4 > var6) {
                            arg0.field458 = 0;
                        }
                        int var7 = arg0.field458 - arg0.field429 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field419;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field418;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field421;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field420;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field418;
                        }
                        arg0.field436 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class25) {
                            var10 = ((class25) arg0).field388.field807;
                        }
                        if (var10) {
                            if (arg0.field458 != arg0.field429 && arg0.field433 == -1 && arg0.field460 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field461 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field461 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field445 > 0 && arg0.field461 > 1) {
                                var9 = 8;
                                arg0.field445--;
                            }
                        } else {
                            if (arg0.field461 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field461 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field445 > 0 && arg0.field461 > 1) {
                                var9 = 8;
                                arg0.field445--;
                            }
                        }
                        if (arg0.field464[arg0.field461 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field436 == arg0.field418 && arg0.field422 != -1) {
                            arg0.field436 = arg0.field422;
                        }
                        if (var3 < var5) {
                            arg0.field455 += var9;
                            if (arg0.field455 > var5) {
                                arg0.field455 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field455 -= var9;
                            if (arg0.field455 < var5) {
                                arg0.field455 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field411 += var9;
                            if (arg0.field411 > var6) {
                                arg0.field411 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field411 -= var9;
                            if (arg0.field411 < var6) {
                                arg0.field411 = var6;
                            }
                        }
                        if (arg0.field455 == var5 && arg0.field411 == var6) {
                            arg0.field461--;
                            if (arg0.field466 > 0) {
                                arg0.field466--;
                            }
                        }
                    } else {
                        arg0.field455 = var5;
                        arg0.field411 = var6;
                    }
                }
            }
        }
        if (arg0.field455 < 128 || arg0.field411 < 128 || arg0.field455 >= 13184 || arg0.field411 >= 13184) {
            arg0.field439 = -1;
            arg0.field444 = -1;
            arg0.field453 = 0;
            arg0.field454 = 0;
            arg0.field455 = arg0.field430[0] * 128 + arg0.field443 * 64;
            arg0.field411 = arg0.field463[0] * 128 + arg0.field443 * 64;
            arg0.method234();
        }
        if (Statics.field2006 == arg0 && (arg0.field455 < 1536 || arg0.field411 < 1536 || arg0.field455 >= 11776 || arg0.field411 >= 11776)) {
            arg0.field439 = -1;
            arg0.field444 = -1;
            arg0.field453 = 0;
            arg0.field454 = 0;
            arg0.field455 = arg0.field430[0] * 128 + arg0.field443 * 64;
            arg0.field411 = arg0.field463[0] * 128 + arg0.field443 * 64;
            arg0.method234();
        }
        if (arg0.field460 != 0) {
            if (arg0.field433 != -1 && arg0.field433 < 32768) {
                class25 var11 = field509[arg0.field433];
                if (var11 != null) {
                    int var12 = arg0.field455 - var11.field455;
                    int var13 = arg0.field411 - var11.field411;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field458 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field433 >= 32768) {
                int var14 = arg0.field433 - 32768;
                if (field690 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field594[var14];
                if (var15 != null) {
                    int var16 = arg0.field455 - var15.field455;
                    int var17 = arg0.field411 - var15.field411;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field458 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field450 != 0 || arg0.field467 != 0) && (arg0.field461 == 0 || arg0.field445 > 0)) {
                int var18 = arg0.field455 - (arg0.field450 * 64 - Statics.field85 * 64 - Statics.field85 * 64);
                int var19 = arg0.field411 - (arg0.field467 * 64 - Statics.field1552 * 64 - Statics.field1552 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field458 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field450 = 0;
                arg0.field467 = 0;
            }
            int var20 = arg0.field458 - arg0.field429 & 0x7FF;
            if (var20 == 0) {
                arg0.field441 = 0;
            } else {
                arg0.field441++;
                if (var20 > 1024) {
                    arg0.field429 -= arg0.field460;
                    boolean var21 = true;
                    if (var20 < arg0.field460 || var20 > 2048 - arg0.field460) {
                        arg0.field429 = arg0.field458;
                        var21 = false;
                    }
                    if (arg0.field449 == arg0.field436 && (arg0.field441 > 25 || var21)) {
                        if (arg0.field416 == -1) {
                            arg0.field436 = arg0.field418;
                        } else {
                            arg0.field436 = arg0.field416;
                        }
                    }
                } else {
                    arg0.field429 += arg0.field460;
                    boolean var22 = true;
                    if (var20 < arg0.field460 || var20 > 2048 - arg0.field460) {
                        arg0.field429 = arg0.field458;
                        var22 = false;
                    }
                    if (arg0.field449 == arg0.field436 && (arg0.field441 > 25 || var22)) {
                        if (arg0.field417 == -1) {
                            arg0.field436 = arg0.field418;
                        } else {
                            arg0.field436 = arg0.field417;
                        }
                    }
                }
                arg0.field429 &= 0x7FF;
            }
        }
        method2465(arg0);
    }

    @ObfuscatedName("p.ah(Lat;I)V")
    public static final void method6(class27 arg0) {
        int var1 = arg0.field453 - field481;
        int var2 = arg0.field456 * 128 + arg0.field443 * 64;
        int var3 = arg0.field451 * 128 + arg0.field443 * 64;
        arg0.field455 += (var2 - arg0.field455) / var1;
        arg0.field411 += (var3 - arg0.field411) / var1;
        arg0.field445 = 0;
        if (arg0.field427 == 0) {
            arg0.field458 = 1024;
        }
        if (arg0.field427 == 1) {
            arg0.field458 = 1536;
        }
        if (arg0.field427 == 2) {
            arg0.field458 = 0;
        }
        if (arg0.field427 == 3) {
            arg0.field458 = 512;
        }
    }

    @ObfuscatedName("bo.aq(Lat;I)V")
    public static final void method1582(class27 arg0) {
        if (field481 == arg0.field454 || arg0.field439 == -1 || arg0.field414 != 0 || arg0.field412 + 1 > class34.method160(arg0.field439).field882[arg0.field440]) {
            int var1 = arg0.field454 - arg0.field453;
            int var2 = field481 - arg0.field453;
            int var3 = arg0.field456 * 128 + arg0.field443 * 64;
            int var4 = arg0.field451 * 128 + arg0.field443 * 64;
            int var5 = arg0.field469 * 128 + arg0.field443 * 64;
            int var6 = arg0.field452 * 128 + arg0.field443 * 64;
            arg0.field455 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field411 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field445 = 0;
        if (arg0.field427 == 0) {
            arg0.field458 = 1024;
        }
        if (arg0.field427 == 1) {
            arg0.field458 = 1536;
        }
        if (arg0.field427 == 2) {
            arg0.field458 = 0;
        }
        if (arg0.field427 == 3) {
            arg0.field458 = 512;
        }
        arg0.field429 = arg0.field458;
    }

    @ObfuscatedName("dv.ar(Lat;I)V")
    public static final void method2465(class27 arg0) {
        arg0.field423 = false;
        if (arg0.field436 != -1) {
            class34 var1 = class34.method160(arg0.field436);
            if (var1 == null || var1.field881 == null) {
                arg0.field436 = -1;
            } else {
                arg0.field435++;
                if (arg0.field437 < var1.field881.length && arg0.field435 > var1.field882[arg0.field437]) {
                    arg0.field435 = 1;
                    arg0.field437++;
                    method178(var1, arg0.field437, arg0.field455, arg0.field411);
                }
                if (arg0.field437 >= var1.field881.length) {
                    arg0.field435 = 0;
                    arg0.field437 = 0;
                    method178(var1, arg0.field437, arg0.field455, arg0.field411);
                }
            }
        }
        if (arg0.field444 != -1 && field481 >= arg0.field447) {
            if (arg0.field465 < 0) {
                arg0.field465 = 0;
            }
            int var2 = class35.method2756(arg0.field444).field908;
            if (var2 == -1) {
                arg0.field444 = -1;
            } else {
                class34 var3 = class34.method160(var2);
                if (var3 == null || var3.field881 == null) {
                    arg0.field444 = -1;
                } else {
                    arg0.field446++;
                    if (arg0.field465 < var3.field881.length && arg0.field446 > var3.field882[arg0.field465]) {
                        arg0.field446 = 1;
                        arg0.field465++;
                        method178(var3, arg0.field465, arg0.field455, arg0.field411);
                    }
                    if (arg0.field465 >= var3.field881.length && (arg0.field465 < 0 || arg0.field465 >= var3.field881.length)) {
                        arg0.field444 = -1;
                    }
                }
            }
        }
        if (arg0.field439 != -1 && arg0.field414 <= 1) {
            class34 var4 = class34.method160(arg0.field439);
            if (var4.field877 == 1 && arg0.field466 > 0 && arg0.field453 <= field481 && arg0.field454 < field481) {
                arg0.field414 = 1;
                return;
            }
        }
        if (arg0.field439 != -1 && arg0.field414 == 0) {
            class34 var5 = class34.method160(arg0.field439);
            if (var5 == null || var5.field881 == null) {
                arg0.field439 = -1;
            } else {
                arg0.field412++;
                if (arg0.field440 < var5.field881.length && arg0.field412 > var5.field882[arg0.field440]) {
                    arg0.field412 = 1;
                    arg0.field440++;
                    method178(var5, arg0.field440, arg0.field455, arg0.field411);
                }
                if (arg0.field440 >= var5.field881.length) {
                    arg0.field440 -= var5.field885;
                    arg0.field462++;
                    if (arg0.field462 >= var5.field891) {
                        arg0.field439 = -1;
                    } else if (arg0.field440 >= 0 && arg0.field440 < var5.field881.length) {
                        method178(var5, arg0.field440, arg0.field455, arg0.field411);
                    } else {
                        arg0.field439 = -1;
                    }
                }
                arg0.field423 = var5.field887;
            }
        }
        if (arg0.field414 > 0) {
            arg0.field414--;
        }
    }

    @ObfuscatedName("bm.aa(Lo;III)V")
    public static void method1431(class3 arg0, int arg1, int arg2) {
        if (arg0.field439 == arg1 && arg1 != -1) {
            int var3 = class34.method160(arg1).field894;
            if (var3 == 1) {
                arg0.field440 = 0;
                arg0.field412 = 0;
                arg0.field414 = arg2;
                arg0.field462 = 0;
            }
            if (var3 == 2) {
                arg0.field462 = 0;
            }
        } else if (arg1 == -1 || arg0.field439 == -1 || class34.method160(arg1).field889 >= class34.method160(arg0.field439).field889) {
            arg0.field439 = arg1;
            arg0.field440 = 0;
            arg0.field412 = 0;
            arg0.field414 = arg2;
            arg0.field462 = 0;
            arg0.field466 = arg0.field461;
        }
    }

    @ObfuscatedName("g.an(B)V")
    public static final void method60() {
        if (!field652) {
            field515[0] = class134.field2226;
            field623[0] = "";
            field620[0] = 1006;
            field558 = 1;
        }
        if (field634 != -1) {
            method208(field634);
        }
        for (int var0 = 0; var0 < field676; var0++) {
            if (field678[var0]) {
                field584[var0] = true;
            }
            field680[var0] = field678[var0];
            field678[var0] = false;
        }
        field677 = field481;
        field715 = -1;
        field625 = -1;
        Statics.field276 = null;
        if (field634 != -1) {
            field676 = 0;
            method2722(field634, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1838();
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field558 - 1; var2++) {
                if (field620[var2] < 1000 && field620[var2 + 1] > 1000) {
                    String var3 = field623[var2];
                    field623[var2] = field623[var2 + 1];
                    field623[var2 + 1] = var3;
                    String var4 = field515[var2];
                    field515[var2] = field515[var2 + 1];
                    field515[var2 + 1] = var4;
                    int var5 = field620[var2];
                    field620[var2] = field620[var2 + 1];
                    field620[var2 + 1] = var5;
                    int var6 = field503[var2];
                    field503[var2] = field503[var2 + 1];
                    field503[var2 + 1] = var6;
                    int var7 = field527[var2];
                    field527[var2] = field527[var2 + 1];
                    field527[var2 + 1] = var7;
                    int var8 = field621[var2];
                    field621[var2] = field621[var2 + 1];
                    field621[var2 + 1] = var8;
                    var1 = false;
                }
            }
        }
        if (field652) {
            int var14 = Statics.field2467;
            int var15 = Statics.field29;
            int var16 = Statics.field1115;
            int var17 = Statics.field1629;
            int var18 = 6116423;
            class89.method1847(var14, var15, var16, var17, var18);
            class89.method1847(var14 + 1, var15 + 1, var16 - 2, 16, 0);
            class89.method1849(var14 + 1, var15 + 18, var16 - 2, var17 - 19, 0);
            Statics.field196.method3402(class134.field2232, var14 + 3, var15 + 14, var18, -1);
            int var19 = class77.field1397;
            int var20 = class77.field1391;
            for (int var21 = 0; var21 < field558; var21++) {
                int var22 = (field558 - 1 - var21) * 15 + var15 + 31;
                int var23 = 16777215;
                if (var19 > var14 && var19 < var14 + var16 && var20 > var22 - 13 && var20 < var22 + 3) {
                    var23 = 16776960;
                }
                class183 var24 = Statics.field196;
                String var25;
                if (field623[var21].length() > 0) {
                    var25 = field515[var21] + class134.field2239 + field623[var21];
                } else {
                    var25 = field515[var21];
                }
                var24.method3402(var25, var14 + 3, var22, var23, 0);
            }
            int var26 = Statics.field2467;
            int var27 = Statics.field29;
            int var28 = Statics.field1115;
            int var29 = Statics.field1629;
            for (int var30 = 0; var30 < field676; var30++) {
                if (field683[var30] + field681[var30] > var26 && field681[var30] < var26 + var28 && field682[var30] + field624[var30] > var27 && field682[var30] < var27 + var29) {
                    field584[var30] = true;
                }
            }
        } else if (field715 != -1) {
            int var9 = field715;
            int var10 = field625;
            if (field558 >= 2 || field628 != 0 || field679) {
                String var11;
                if (field628 == 1 && field558 < 2) {
                    var11 = class134.field2229 + class134.field2239 + field629 + " " + class2.field26;
                } else if (field679 && field558 < 2) {
                    var11 = field706 + class134.field2239 + field633 + " " + class2.field26;
                } else {
                    int var12 = field558 - 1;
                    String var13;
                    if (field623[var12].length() > 0) {
                        var13 = field515[var12] + class134.field2239 + field623[var12];
                    } else {
                        var13 = field515[var12];
                    }
                    var11 = var13;
                }
                if (field558 > 2) {
                    var11 = var11 + class2.method3257(16777215) + " " + '/' + " " + (field558 - 2) + class134.field2233;
                }
                Statics.field196.method3409(var11, var9 + 4, var10 + 15, 16777215, 0, field481 / 1000);
            }
        }
        if (field639 == 3) {
            for (int var31 = 0; var31 < field676; var31++) {
                if (field680[var31]) {
                    class89.method1874(field681[var31], field682[var31], field683[var31], field624[var31], 16711935, 128);
                } else if (field584[var31]) {
                    class89.method1874(field681[var31], field682[var31], field683[var31], field624[var31], 16711680, 128);
                }
            }
        }
        class7.method142(Statics.field231, Statics.field2006.field455, Statics.field2006.field411, field601);
        field601 = 0;
    }

    @ObfuscatedName("fy.ab(Ljava/lang/String;ZI)V")
    public static final void method3173(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field921.method3399(arg0, 250);
        int var6 = Statics.field921.method3468(arg0, 250) * 13;
        class89.method1847(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1849(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field921.method3405(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method596(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method10(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field14.getGraphics();
            Statics.field1381.method1661(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field14.repaint();
        }
    }

    @ObfuscatedName("q.ai(IIIIB)V")
    public static final void method141(int arg0, int arg1, int arg2, int arg3) {
        class89.method1841(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2177();
        field578++;
        method214(true);
        method152(true);
        method214(false);
        method152(false);
        for (class10 var4 = (class10) field540.method3334(); var4 != null; var4 = (class10) field540.method3355()) {
            if (Statics.field231 != var4.field162 || field481 > var4.field151) {
                var4.method3360();
            } else if (field481 >= var4.field150) {
                if (var4.field154 > 0) {
                    class25 var5 = field509[var4.field154 - 1];
                    if (var5 != null && var5.field455 >= 0 && var5.field455 < 13312 && var5.field411 >= 0 && var5.field411 < 13312) {
                        var4.method107(var5.field455, var5.field411, method49(var5.field455, var5.field411, var4.field162) - var4.field149, field481);
                    }
                }
                if (var4.field154 < 0) {
                    int var6 = -var4.field154 - 1;
                    class3 var7;
                    if (field690 == var6) {
                        var7 = Statics.field2006;
                    } else {
                        var7 = field594[var6];
                    }
                    if (var7 != null && var7.field455 >= 0 && var7.field455 < 13312 && var7.field411 >= 0 && var7.field411 < 13312) {
                        var4.method107(var7.field455, var7.field411, method49(var7.field455, var7.field411, var4.field162) - var4.field149, field481);
                    }
                }
                var4.method108(field601);
                Statics.field53.method1930(Statics.field231, (int) var4.field156, (int) var4.field161, (int) var4.field158, 60, var4, var4.field164, -1, false);
            }
        }
        method145();
        if (!field516) {
            int var8 = field560;
            if (field566 / 256 > var8) {
                var8 = field566 / 256;
            }
            if (field650[4] && field724[4] + 128 > var8) {
                var8 = field724[4] + 128;
            }
            int var9 = field561 + field504 & 0x7FF;
            int var10 = Statics.field392;
            int var11 = method49(Statics.field2006.field455, Statics.field2006.field411, Statics.field231) - 50;
            int var12 = Statics.field937;
            int var13 = var8 * 3 + 600;
            int var14 = 2048 - var8 & 0x7FF;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 0;
            int var17 = 0;
            int var18 = var13;
            if (var14 != 0) {
                int var19 = class104.field1790[var14];
                int var20 = class104.field1791[var14];
                int var21 = var17 * var20 - var13 * var19 >> 16;
                var18 = var17 * var19 + var13 * var20 >> 16;
                var17 = var21;
            }
            if (var15 != 0) {
                int var22 = class104.field1790[var15];
                int var23 = class104.field1791[var15];
                int var24 = var16 * var23 + var18 * var22 >> 16;
                var18 = var18 * var23 - var16 * var22 >> 16;
                var16 = var24;
            }
            Statics.field378 = var10 - var16;
            Statics.field1380 = var11 - var17;
            Statics.field2323 = var12 - var18;
            Statics.field1620 = var8;
            Statics.field1757 = var9;
        }
        int var37;
        if (field516) {
            int var38;
            if (Statics.field380.field180) {
                var38 = Statics.field231;
            } else {
                int var39 = method49(Statics.field378, Statics.field2323, Statics.field231);
                if (var39 - Statics.field1380 >= 800 || (class9.field120[Statics.field231][Statics.field378 >> 7][Statics.field2323 >> 7] & 0x4) == 0) {
                    var38 = 3;
                } else {
                    var38 = Statics.field231;
                }
            }
            var37 = var38;
        } else {
            int var25;
            if (Statics.field380.field180) {
                var25 = Statics.field231;
            } else {
                int var26 = 3;
                if (Statics.field1620 < 310) {
                    int var27 = Statics.field378 >> 7;
                    int var28 = Statics.field2323 >> 7;
                    int var29 = Statics.field2006.field455 >> 7;
                    int var30 = Statics.field2006.field411 >> 7;
                    if ((class9.field120[Statics.field231][var27][var28] & 0x4) != 0) {
                        var26 = Statics.field231;
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
                            if ((class9.field120[Statics.field231][var27][var28] & 0x4) != 0) {
                                var26 = Statics.field231;
                            }
                            var34 += var33;
                            if (var34 >= 65536) {
                                var34 -= 65536;
                                if (var28 < var30) {
                                    var28++;
                                } else if (var28 > var30) {
                                    var28--;
                                }
                                if ((class9.field120[Statics.field231][var27][var28] & 0x4) != 0) {
                                    var26 = Statics.field231;
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
                            if ((class9.field120[Statics.field231][var27][var28] & 0x4) != 0) {
                                var26 = Statics.field231;
                            }
                            var36 += var35;
                            if (var36 >= 65536) {
                                var36 -= 65536;
                                if (var27 < var29) {
                                    var27++;
                                } else if (var27 > var29) {
                                    var27--;
                                }
                                if ((class9.field120[Statics.field231][var27][var28] & 0x4) != 0) {
                                    var26 = Statics.field231;
                                }
                            }
                        }
                    }
                }
                if ((class9.field120[Statics.field231][Statics.field2006.field455 >> 7][Statics.field2006.field411 >> 7] & 0x4) != 0) {
                    var26 = Statics.field231;
                }
                var25 = var26;
            }
            var37 = var25;
        }
        int var40 = Statics.field378;
        int var41 = Statics.field1380;
        int var42 = Statics.field2323;
        int var43 = Statics.field1620;
        int var44 = Statics.field1757;
        for (int var45 = 0; var45 < 5; var45++) {
            if (field650[var45]) {
                int var46 = (int) (Math.random() * (double) (field723[var45] * 2 + 1) - (double) field723[var45] + Math.sin((double) field725[var45] / 100.0D * (double) field726[var45]) * (double) field724[var45]);
                if (var45 == 0) {
                    Statics.field378 += var46;
                }
                if (var45 == 1) {
                    Statics.field1380 += var46;
                }
                if (var45 == 2) {
                    Statics.field2323 += var46;
                }
                if (var45 == 3) {
                    Statics.field1757 = Statics.field1757 + var46 & 0x7FF;
                }
                if (var45 == 4) {
                    Statics.field1620 += var46;
                    if (Statics.field1620 < 128) {
                        Statics.field1620 = 128;
                    }
                    if (Statics.field1620 > 383) {
                        Statics.field1620 = 383;
                    }
                }
            }
        }
        int var47 = class77.field1397;
        int var48 = class77.field1391;
        if (var47 >= arg0 && var47 < arg0 + arg2 && var48 >= arg1 && var48 < arg1 + arg3) {
            class112.field1868 = true;
            class112.field1916 = 0;
            class112.field1884 = class77.field1397 - arg0;
            class112.field1917 = class77.field1391 - arg1;
        } else {
            class112.field1868 = false;
            class112.field1916 = 0;
        }
        method2340();
        class89.method1847(arg0, arg1, arg2, arg3, 0);
        method2340();
        Statics.field53.method1957(Statics.field378, Statics.field1380, Statics.field2323, Statics.field1620, Statics.field1757, var37);
        method2340();
        Statics.field53.method1974();
        method1590(arg0, arg1, arg2, arg3);
        if (field490 == 2) {
            Statics.method117((field595 - Statics.field85 << 7) + field649, (field494 - Statics.field1552 << 7) + field497, field505 * 2);
            if (field488 > -1 && field481 % 20 < 10) {
                Statics.field117[0].method1780(field488 + arg0 - 12, field580 + arg1 - 28);
            }
        }
        ((class110) Statics.field1787).method2255(field601);
        method1581(arg0, arg1, arg2, arg3);
        Statics.field378 = var40;
        Statics.field1380 = var41;
        Statics.field2323 = var42;
        Statics.field1620 = var43;
        Statics.field1757 = var44;
        if (field632 && Statics.method2243(true, false) == 0) {
            field632 = false;
        }
        if (field632) {
            class89.method1847(arg0, arg1, arg2, arg3, 0);
            method3173(class134.field2095, false);
        }
        if (field632 || field652 || var47 < arg0 || var47 >= arg0 + arg2 || var48 < arg1 || var48 >= arg1 + arg3) {
            return;
        }
        if (field628 == 0 && !field679) {
            method162(class134.field2201, "", 23, 0, var47 - arg0, var48 - arg1);
        }
        int var49 = -1;
        for (int var50 = 0; var50 < class112.field1916; var50++) {
            int var51 = class112.field1867[var50];
            int var52 = var51 & 0x7F;
            int var53 = var51 >> 7 & 0x7F;
            int var54 = var51 >> 29 & 0x3;
            int var55 = var51 >> 14 & 0x7FFF;
            if (var49 != var51) {
                var49 = var51;
                if (var54 == 2 && Statics.field53.method1949(Statics.field231, var52, var53, var51) >= 0) {
                    class32 var56 = class32.method3258(var55);
                    if (var56.field855 != null) {
                        var56 = var56.method677();
                    }
                    if (var56 == null) {
                        continue;
                    }
                    if (field628 == 1) {
                        method162(class134.field2229, field629 + " " + class2.field26 + " " + class2.method3257(65535) + var56.field815, 1, var51, var52, var53);
                    } else if (!field679) {
                        String[] var57 = var56.field840;
                        if (field701) {
                            var57 = method2581(var57);
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
                                    method162(var57[var58], class2.method3257(65535) + var56.field815, var59, var51, var52, var53);
                                }
                            }
                        }
                        method162(class134.field2230, class2.method3257(65535) + var56.field815, 1002, var56.field813 << 14, var52, var53);
                    } else if ((Statics.field201 & 0x4) == 4) {
                        method162(field706, field633 + " " + class2.field26 + " " + class2.method3257(65535) + var56.field815, 2, var51, var52, var53);
                    }
                }
                if (var54 == 1) {
                    class25 var60 = field509[var55];
                    if (var60.field388.field779 == 1 && (var60.field455 & 0x7F) == 64 && (var60.field411 & 0x7F) == 64) {
                        for (int var61 = 0; var61 < field510; var61++) {
                            class25 var62 = field509[field657[var61]];
                            if (var62 != null && var60 != var62 && var62.field388.field779 == 1 && var60.field455 == var62.field455 && var60.field411 == var62.field411) {
                                method217(var62.field388, field657[var61], var52, var53);
                            }
                        }
                        for (int var63 = 0; var63 < field630; var63++) {
                            class3 var64 = field594[field596[var63]];
                            if (var64 != null && var60.field455 == var64.field455 && var60.field411 == var64.field411) {
                                method2729(var64, field596[var63], var52, var53);
                            }
                        }
                    }
                    method217(var60.field388, var55, var52, var53);
                }
                if (var54 == 0) {
                    class3 var65 = field594[var55];
                    if ((var65.field455 & 0x7F) == 64 && (var65.field411 & 0x7F) == 64) {
                        for (int var66 = 0; var66 < field510; var66++) {
                            class25 var67 = field509[field657[var66]];
                            if (var67 != null && var67.field388.field779 == 1 && var65.field455 == var67.field455 && var65.field411 == var67.field411) {
                                method217(var67.field388, field657[var66], var52, var53);
                            }
                        }
                        for (int var68 = 0; var68 < field630; var68++) {
                            class3 var69 = field594[field596[var68]];
                            if (var69 != null && var65 != var69 && var65.field455 == var69.field455 && var65.field411 == var69.field411) {
                                method2729(var69, field596[var68], var52, var53);
                            }
                        }
                    }
                    method2729(var65, var55, var52, var53);
                }
                if (var54 == 3) {
                    class177 var70 = field534[Statics.field231][var52][var53];
                    if (var70 != null) {
                        for (class17 var71 = (class17) var70.method3335(); var71 != null; var71 = (class17) var70.method3336()) {
                            class40 var72 = class40.method730(var71.field254);
                            if (field628 == 1) {
                                method162(class134.field2229, field629 + " " + class2.field26 + " " + class2.method3257(16748608) + var72.field994, 16, var71.field254, var52, var53);
                            } else if (!field679) {
                                String[] var73 = var72.field1008;
                                if (field701) {
                                    var73 = method2581(var73);
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
                                        method162(var73[var74], class2.method3257(16748608) + var72.field994, var75, var71.field254, var52, var53);
                                    } else if (var74 == 2) {
                                        method162(class134.field2089, class2.method3257(16748608) + var72.field994, 20, var71.field254, var52, var53);
                                    }
                                }
                                method162(class134.field2230, class2.method3257(16748608) + var72.field994, 1004, var71.field254, var52, var53);
                            } else if ((Statics.field201 & 0x1) == 1) {
                                method162(field706, field633 + " " + class2.field26 + " " + class2.method3257(16748608) + var72.field994, 17, var71.field254, var52, var53);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.ac(ZI)V")
    public static final void method214(boolean arg0) {
        if (Statics.field2006.field455 >> 7 == field707 && Statics.field2006.field411 >> 7 == field708) {
            field707 = 0;
        }
        int var1 = field630;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2006;
                var4 = 33538048;
            } else {
                var3 = field594[field596[var2]];
                var4 = field596[var2] << 14;
            }
            if (var3 != null && var3.method36()) {
                var3.field51 = false;
                if ((field477 && field630 > 50 || field630 > 200) && !arg0 && var3.field449 == var3.field436) {
                    var3.field51 = true;
                }
                int var5 = var3.field455 >> 7;
                int var6 = var3.field411 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field481 < var3.field41 || field481 >= var3.field36) {
                        if ((var3.field455 & 0x7F) == 64 && (var3.field411 & 0x7F) == 64) {
                            if (field578 == field577[var5][var6]) {
                                continue;
                            }
                            field577[var5][var6] = field578;
                        }
                        var3.field45 = method49(var3.field455, var3.field411, Statics.field231);
                        Statics.field53.method1930(Statics.field231, var3.field455, var3.field411, var3.field45, 60, var3, var3.field429, var4, var3.field423);
                    } else {
                        var3.field51 = false;
                        var3.field45 = method49(var3.field455, var3.field411, Statics.field231);
                        Statics.field53.method1931(Statics.field231, var3.field455, var3.field411, var3.field45, 60, var3, var3.field429, var4, var3.field47, var3.field48, var3.field34, var3.field50);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.ak(ZB)V")
    public static final void method152(boolean arg0) {
        for (int var1 = 0; var1 < field510; var1++) {
            class25 var2 = field509[field657[var1]];
            int var3 = (field657[var1] << 14) + 536870912;
            if (var2 != null && var2.method36() && var2.field388.field798 == arg0 && var2.field388.method661()) {
                int var4 = var2.field455 >> 7;
                int var5 = var2.field411 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field443 == 1 && (var2.field455 & 0x7F) == 64 && (var2.field411 & 0x7F) == 64) {
                        if (field578 == field577[var4][var5]) {
                            continue;
                        }
                        field577[var4][var5] = field578;
                    }
                    if (!var2.field388.field806) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field53.method1930(Statics.field231, var2.field455, var2.field411, method49(var2.field455 + (var2.field443 * 64 - 64), var2.field411 + (var2.field443 * 64 - 64), Statics.field231), var2.field443 * 64 - 64 + 60, var2, var2.field429, var3, var2.field423);
                }
            }
        }
    }

    @ObfuscatedName("q.au(I)V")
    public static final void method145() {
        for (class20 var0 = (class20) field611.method3334(); var0 != null; var0 = (class20) field611.method3355()) {
            if (Statics.field231 != var0.field278 || var0.field288) {
                var0.method3360();
            } else if (field481 >= var0.field286) {
                var0.method179(field601);
                if (var0.field288) {
                    var0.method3360();
                } else {
                    Statics.field53.method1930(var0.field278, var0.field279, var0.field280, var0.field281, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("bw.am(IIIIB)V")
    public static final void method1590(int arg0, int arg1, int arg2, int arg3) {
        field732 = 0;
        for (int var4 = -1; var4 < field630 + field510; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field2006;
            } else if (var4 < field630) {
                var5 = field594[field596[var4]];
            } else {
                var5 = field509[field657[var4 - field630]];
            }
            if (var5 != null && var5.method36()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field388;
                    if (var6.field803 != null) {
                        var6 = var6.method634();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field630) {
                    class31 var9 = ((class25) var5).field388;
                    if (var9.field803 != null) {
                        var9 = var9.method634();
                    }
                    if (var9.field804 >= 0 && var9.field804 < Statics.field369.length) {
                        method8(var5, var5.field457 + 15);
                        if (field488 > -1) {
                            Statics.field369[var9.field804].method1780(field488 + arg0 - 12, field580 + arg1 - 30);
                        }
                    }
                    if (field490 == 1 && field491 == field657[var4 - field630] && field481 % 20 < 10) {
                        method8(var5, var5.field457 + 15);
                        if (field488 > -1) {
                            Statics.field117[0].method1780(field488 + arg0 - 12, field580 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field52 != -1 || var8.field38 != -1) {
                        method8(var5, var5.field457 + 15);
                        if (field488 > -1) {
                            if (var8.field52 != -1) {
                                Statics.field413[var8.field52].method1780(field488 + arg0 - 12, field580 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field38 != -1) {
                                Statics.field369[var8.field38].method1780(field488 + arg0 - 12, field580 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field490 == 10 && field555 == field596[var4]) {
                        method8(var5, var5.field457 + 15);
                        if (field488 > -1) {
                            Statics.field117[1].method1780(field488 + arg0 - 12, field580 + arg1 - var7);
                        }
                    }
                }
                if (var5.field410 != null && (var4 >= field630 || field692 == 0 || field692 == 3 || field692 == 1 && method1614(((class3) var5).field40))) {
                    method8(var5, var5.field457);
                    if (field488 > -1 && field732 < field568) {
                        field572[field732] = Statics.field196.method3397(var5.field410) / 2;
                        field598[field732] = Statics.field196.field2841;
                        field656[field732] = field488;
                        field553[field732] = field580;
                        field730[field732] = var5.field425;
                        field574[field732] = var5.field426;
                        field546[field732] = var5.field424;
                        field576[field732] = var5.field410;
                        field732++;
                    }
                }
                if (var5.field431 > field481) {
                    method8(var5, var5.field457 + 15);
                    if (field488 > -1) {
                        int var10 = var5.field415 * 30 / var5.field432;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class89.method1847(field488 + arg0 - 15, field580 + arg1 - 3, var10, 5, 65280);
                        class89.method1847(field488 + arg0 - 15 + var10, field580 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field438[var11] > field481) {
                        method8(var5, var5.field457 / 2);
                        if (field488 > -1) {
                            if (var11 == 1) {
                                field580 -= 20;
                            }
                            if (var11 == 2) {
                                field488 -= 15;
                                field580 -= 10;
                            }
                            if (var11 == 3) {
                                field488 += 15;
                                field580 -= 10;
                            }
                            Statics.field262[var5.field428[var11]].method1780(field488 + arg0 - 12, field580 + arg1 - 12);
                            Statics.field1554.method3404(Integer.toString(var5.field434[var11]), field488 + arg0 - 1, field580 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field732; var12++) {
            int var13 = field656[var12];
            int var14 = field553[var12];
            int var15 = field572[var12];
            int var16 = field598[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field553[var18] - field598[var18] && var14 - var16 < field553[var18] + 2 && var13 - var15 < field656[var18] + field572[var18] && var13 + var15 > field656[var18] - field572[var18] && field553[var18] - field598[var18] < var14) {
                        var14 = field553[var18] - field598[var18];
                        var17 = true;
                    }
                }
            }
            field488 = field656[var12];
            field580 = field553[var12] = var14;
            String var19 = field576[var12];
            if (field636 == 0) {
                int var20 = 16776960;
                if (field730[var12] < 6) {
                    var20 = field691[field730[var12]];
                }
                if (field730[var12] == 6) {
                    var20 = field578 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field730[var12] == 7) {
                    var20 = field578 % 20 < 10 ? 255 : 65535;
                }
                if (field730[var12] == 8) {
                    var20 = field578 % 20 < 10 ? 45056 : 8454016;
                }
                if (field730[var12] == 9) {
                    int var21 = 150 - field546[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field730[var12] == 10) {
                    int var22 = 150 - field546[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field730[var12] == 11) {
                    int var23 = 150 - field546[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field574[var12] == 0) {
                    Statics.field196.method3404(var19, field488 + arg0, field580 + arg1, var20, 0);
                }
                if (field574[var12] == 1) {
                    Statics.field196.method3463(var19, field488 + arg0, field580 + arg1, var20, 0, field578);
                }
                if (field574[var12] == 2) {
                    Statics.field196.method3407(var19, field488 + arg0, field580 + arg1, var20, 0, field578);
                }
                if (field574[var12] == 3) {
                    Statics.field196.method3408(var19, field488 + arg0, field580 + arg1, var20, 0, field578, 150 - field546[var12]);
                }
                if (field574[var12] == 4) {
                    int var24 = (150 - field546[var12]) * (Statics.field196.method3397(var19) + 100) / 150;
                    class89.method1842(field488 + arg0 - 50, arg1, field488 + arg0 + 50, arg1 + arg3);
                    Statics.field196.method3402(var19, field488 + arg0 + 50 - var24, field580 + arg1, var20, 0);
                    class89.method1841(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field574[var12] == 5) {
                    int var25 = 150 - field546[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1842(arg0, field580 + arg1 - Statics.field196.field2841 - 1, arg0 + arg2, field580 + arg1 + 5);
                    Statics.field196.method3404(var19, field488 + arg0, field580 + arg1 + var26, var20, 0);
                    class89.method1841(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field196.method3404(var19, field488 + arg0, field580 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("dz.ag(I)V")
    public static final void method2421() {
        field737 = 0;
        int var0 = (Statics.field2006.field455 >> 7) + Statics.field85;
        int var1 = (Statics.field2006.field411 >> 7) + Statics.field1552;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field737 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field737 = 1;
        }
        if (field737 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field737 = 0;
        }
    }

    @ObfuscatedName("bo.al(IIIIB)V")
    public static final void method1581(int arg0, int arg1, int arg2, int arg3) {
        if (field731 == 1) {
            Statics.field754[field583 / 100].method1780(field581 - 8, field582 - 8);
        }
        if (field731 == 2) {
            Statics.field754[field583 / 100 + 4].method1780(field581 - 8, field582 - 8);
        }
        method2421();
        if (!field651) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field921.method3470("Fps:" + field1333, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field477) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field477) {
            var8 = 16711680;
        }
        Statics.field921.method3470("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("p.av(Lat;IB)V")
    public static final void method8(class27 arg0, int arg1) {
        Statics.method117(arg0.field455, arg0.field411, arg1);
    }

    @ObfuscatedName("v.ax(IIII)I")
    public static final int method49(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class9.field136[var5][var3][var4] + class9.field136[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field136[var5][var3][var4 + 1] + class9.field136[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("d.az(ZI)V")
    public static final void method134(boolean arg0) {
        field579 = arg0;
        if (!field579) {
            int var1 = field514.method2522();
            int var2 = field514.method2571();
            int var3 = field514.method2652();
            int var4 = field514.method2511();
            int var5 = field514.method2520();
            int var6 = (field496 - field514.field2038) / 16;
            Statics.field344 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field344[var7][var8] = field514.method2531();
                }
            }
            Statics.field62 = new int[var6];
            Statics.field530 = new int[var6];
            Statics.field348 = new int[var6];
            Statics.field1553 = new byte[var6][];
            Statics.field739 = new byte[var6][];
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field62[var10] = var13;
                        Statics.field530[var10] = Statics.field1032.method3013("m" + var11 + "_" + var12);
                        Statics.field348[var10] = Statics.field1032.method3013("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method34(var3, var2, var4, var5, var1);
            return;
        }
        int var14 = field514.method2511();
        int var15 = field514.method2520();
        int var16 = field514.method2522();
        int var17 = field514.method2571();
        int var18 = field514.method2520();
        field514.method2358();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field514.method2359(1);
                    if (var22 == 1) {
                        field533[var19][var20][var21] = field514.method2359(26);
                    } else {
                        field533[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field514.method2360();
        int var23 = (field496 - field514.field2038) / 16;
        Statics.field344 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field344[var24][var25] = field514.method2530();
            }
        }
        Statics.field62 = new int[var23];
        Statics.field530 = new int[var23];
        Statics.field348 = new int[var23];
        Statics.field1553 = new byte[var23][];
        Statics.field739 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field533[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field62[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field62[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field530[var26] = Statics.field1032.method3013("m" + var35 + "_" + var36);
                            Statics.field348[var26] = Statics.field1032.method3013("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method34(var16, var15, var14, var18, var17);
    }

    @ObfuscatedName("o.ap(IIIIII)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field251 == arg0 && Statics.field808 == arg1 && field524 == arg2 || !field477) {
            return;
        }
        Statics.field251 = arg0;
        Statics.field808 = arg1;
        field524 = arg2;
        if (!field477) {
            field524 = 0;
        }
        method22(25);
        method3173(class134.field2095, true);
        int var5 = Statics.field85;
        int var6 = Statics.field1552;
        Statics.field85 = (arg0 - 6) * 8;
        Statics.field1552 = (arg1 - 6) * 8;
        int var7 = Statics.field85 - var5;
        int var8 = Statics.field1552 - var6;
        int var9 = Statics.field85;
        int var10 = Statics.field1552;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field509[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field430[var13] -= var7;
                    var12.field463[var13] -= var8;
                }
                var12.field455 -= var7 * 128;
                var12.field411 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field594[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field430[var16] -= var7;
                    var15.field463[var16] -= var8;
                }
                var15.field455 -= var7 * 128;
                var15.field411 -= var8 * 128;
            }
        }
        Statics.field231 = arg2;
        Statics.field2006.method230(arg3, arg4, false);
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
                        field534[var27][var23][var24] = field534[var27][var25][var26];
                    } else {
                        field534[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field609.method3334(); var28 != null; var28 = (class22) field609.method3355()) {
            var28.field336 -= var7;
            var28.field337 -= var8;
            if (var28.field336 < 0 || var28.field337 < 0 || var28.field336 >= 104 || var28.field337 >= 104) {
                var28.method3360();
            }
        }
        if (field707 != 0) {
            field707 -= var7;
            field708 -= var8;
        }
        field685 = 0;
        field516 = false;
        field702 = -1;
        field611.method3352();
        field540.method3352();
    }

    @ObfuscatedName("as.as(ZB)V")
    public static final void method1203(boolean arg0) {
        method2340();
        field518++;
        if (field518 < 50 && !arg0) {
            return;
        }
        field518 = 0;
        if (field523 || Statics.field77 == null) {
            return;
        }
        field512.method2356(95);
        try {
            Statics.field77.method1414(field512.field2037, 0, field512.field2038);
            field512.field2038 = 0;
        } catch (IOException var2) {
            field523 = true;
        }
    }

    @ObfuscatedName("p.bp(B)V")
    public static final void method4() {
        method1203(false);
        field619 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1553.length; var1++) {
            if (Statics.field530[var1] != -1 && Statics.field1553[var1] == null) {
                Statics.field1553[var1] = Statics.field1032.method3049(Statics.field530[var1], 0);
                if (Statics.field1553[var1] == null) {
                    var0 = false;
                    field619++;
                }
            }
            if (Statics.field348[var1] != -1 && Statics.field739[var1] == null) {
                Statics.field739[var1] = Statics.field1032.method3000(Statics.field348[var1], 0, Statics.field344[var1]);
                if (Statics.field739[var1] == null) {
                    var0 = false;
                    field619++;
                }
            }
        }
        if (!var0) {
            field671 = 1;
            return;
        }
        field586 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1553.length; var3++) {
            byte[] var4 = Statics.field739[var3];
            if (var4 != null) {
                int var5 = (Statics.field62[var3] >> 8) * 64 - Statics.field85;
                int var6 = (Statics.field62[var3] & 0xFF) * 64 - Statics.field1552;
                if (field579) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class127 var9 = new class127(var4);
                int var10 = -1;
                label485: while (true) {
                    int var11 = var9.method2501();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2501();
                            if (var16 == 0) {
                                continue label485;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2659() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class32 var22 = class32.method3258(var10);
                                if (var19 != 22 || !field477 || var22.field832 != 0 || var22.field816 == 1 || var22.field852) {
                                    if (!var22.method672()) {
                                        field586++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2501();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2659();
                    }
                }
            }
        }
        if (!var2) {
            field671 = 2;
            return;
        }
        if (field671 != 0) {
            method3173(class134.field2095 + class2.field30 + class2.field28 + 100 + "%" + class2.field22, true);
        }
        method2340();
        method2252();
        method2340();
        Statics.field53.method1928();
        method2340();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field531[var23].method3227();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field120[var24][var25][var26] = 0;
                }
            }
        }
        method2340();
        class9.method1387();
        int var27 = Statics.field1553.length;
        class7.method2();
        method1203(true);
        if (!field579) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field62[var28] >> 8) * 64 - Statics.field85;
                int var30 = (Statics.field62[var28] & 0xFF) * 64 - Statics.field1552;
                byte[] var31 = Statics.field1553[var28];
                if (var31 != null) {
                    method2340();
                    int var32 = Statics.field251 * 8 - 48;
                    int var33 = Statics.field808 * 8 - 48;
                    class164[] var34 = field531;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2752[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class127 var38 = new class127(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class9.method1308(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field62[var42] >> 8) * 64 - Statics.field85;
                int var44 = (Statics.field62[var42] & 0xFF) * 64 - Statics.field1552;
                byte[] var45 = Statics.field1553[var42];
                if (var45 == null && Statics.field808 < 800) {
                    method2340();
                    Statics.method1591(var43, var44, 64, 64);
                }
            }
            method1203(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field739[var46];
                if (var47 != null) {
                    int var48 = (Statics.field62[var46] >> 8) * 64 - Statics.field85;
                    int var49 = (Statics.field62[var46] & 0xFF) * 64 - Statics.field1552;
                    method2340();
                    class9.method31(var47, var48, var49, Statics.field53, field531);
                }
            }
        }
        if (field579) {
            for (int var50 = 0; var50 < 4; var50++) {
                method2340();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field533[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field62.length; var60++) {
                                if (Statics.field62[var60] == var59 && Statics.field1553[var60] != null) {
                                    class9.method2428(Statics.field1553[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field531);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class9.method829(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = field533[0][var61][var62];
                    if (var63 == -1) {
                        Statics.method1591(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            method1203(true);
            for (int var64 = 0; var64 < 4; var64++) {
                method2340();
                for (int var65 = 0; var65 < 13; var65++) {
                    label324: for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = field533[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < Statics.field62.length; var73++) {
                                if (Statics.field62[var73] == var72 && Statics.field739[var73] != null) {
                                    byte[] var74 = Statics.field739[var73];
                                    int var75 = var65 * 8;
                                    int var76 = var66 * 8;
                                    int var77 = (var70 & 0x7) * 8;
                                    int var78 = (var71 & 0x7) * 8;
                                    class95 var79 = Statics.field53;
                                    class164[] var80 = field531;
                                    class127 var81 = new class127(var74);
                                    int var82 = -1;
                                    while (true) {
                                        int var83 = var81.method2501();
                                        if (var83 == 0) {
                                            continue label324;
                                        }
                                        var82 += var83;
                                        int var84 = 0;
                                        while (true) {
                                            int var85 = var81.method2501();
                                            if (var85 == 0) {
                                                break;
                                            }
                                            var84 += var85 - 1;
                                            int var86 = var84 & 0x3F;
                                            int var87 = var84 >> 6 & 0x3F;
                                            int var88 = var84 >> 12;
                                            int var89 = var81.method2659();
                                            int var90 = var89 >> 2;
                                            int var91 = var89 & 0x3;
                                            if (var68 == var88 && var87 >= var77 && var87 < var77 + 8 && var86 >= var78 && var86 < var78 + 8) {
                                                class32 var92 = class32.method3258(var82);
                                                int var93 = var75 + class160.method1639(var87 & 0x7, var86 & 0x7, var69, var92.field829, var92.field854, var91);
                                                int var94 = var76 + class160.method106(var87 & 0x7, var86 & 0x7, var69, var92.field829, var92.field854, var91);
                                                if (var93 > 0 && var94 > 0 && var93 < 103 && var94 < 103) {
                                                    int var95 = var64;
                                                    if ((class9.field120[1][var93][var94] & 0x2) == 2) {
                                                        var95 = var64 - 1;
                                                    }
                                                    class164 var96 = null;
                                                    if (var95 >= 0) {
                                                        var96 = var80[var95];
                                                    }
                                                    class9.method1434(var64, var93, var94, var82, var69 + var91 & 0x3, var90, var79, var96);
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
        method1203(true);
        method2252();
        method2340();
        class9.method156(Statics.field53, field531);
        method1203(true);
        int var97 = class9.field143;
        if (var97 > Statics.field231) {
            var97 = Statics.field231;
        }
        if (var97 < Statics.field231 - 1) {
            int var98 = Statics.field231 - 1;
        }
        if (field477) {
            Statics.field53.method1920(class9.field143);
        } else {
            Statics.field53.method1920(0);
        }
        for (int var99 = 0; var99 < 104; var99++) {
            for (int var100 = 0; var100 < 104; var100++) {
                method2409(var99, var100);
            }
        }
        method2340();
        method43();
        class32.field828.method3265();
        if (Statics.field228 != null) {
            field512.method2356(146);
            field512.method2606(1057001181);
        }
        if (!field579) {
            int var101 = (Statics.field251 - 6) / 8;
            int var102 = (Statics.field251 + 6) / 8;
            int var103 = (Statics.field808 - 6) / 8;
            int var104 = (Statics.field808 + 6) / 8;
            for (int var105 = var101 - 1; var105 <= var102 + 1; var105++) {
                for (int var106 = var103 - 1; var106 <= var104 + 1; var106++) {
                    if (var105 < var101 || var105 > var102 || var106 < var103 || var106 > var104) {
                        Statics.field1032.method3017("m" + var105 + "_" + var106);
                        Statics.field1032.method3017("l" + var105 + "_" + var106);
                    }
                }
            }
        }
        method22(30);
        method2340();
        class9.method1397();
        field512.method2356(206);
        Statics.field1237.method1376();
        for (int var107 = 0; var107 < 32; var107++) {
            field1324[var107] = 0L;
        }
        for (int var108 = 0; var108 < 32; var108++) {
            field1316[var108] = 0L;
        }
        Statics.field141 = 0;
    }

    @ObfuscatedName("j.bs(IIIIIS)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field53.method1945(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field53.method1949(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field248.field1476;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method3258(var12);
            if (var13.field842 == -1) {
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
                class87 var14 = Statics.field247[var13.field842];
                if (var14 != null) {
                    int var15 = (var13.field829 * 4 - var14.field1485) / 2;
                    int var16 = (var13.field854 * 4 - var14.field1481) / 2;
                    var14.method1830(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field854) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field53.method1947(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field53.method1949(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method3258(var21);
            if (var22.field842 != -1) {
                class87 var23 = Statics.field247[var22.field842];
                if (var23 != null) {
                    int var24 = (var22.field829 * 4 - var23.field1485) / 2;
                    int var25 = (var22.field854 * 4 - var23.field1481) / 2;
                    var23.method1830(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field854) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field248.field1476;
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
        int var29 = Statics.field53.method1948(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method3258(var30);
        if (var31.field842 == -1) {
            return;
        }
        class87 var32 = Statics.field247[var31.field842];
        if (var32 != null) {
            int var33 = (var31.field829 * 4 - var32.field1485) / 2;
            int var34 = (var31.field854 * 4 - var32.field1481) / 2;
            var32.method1830(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field854) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ah.be(IIIB)Z")
    public static final boolean method751(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field53.method1949(Statics.field231, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method3258(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field829;
                var9 = var7.field854;
            } else {
                var8 = var7.field854;
                var9 = var7.field829;
            }
            int var10 = var7.field851;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field581 = class77.field1395;
        field582 = class77.field1404;
        field731 = 2;
        field583 = 0;
        return true;
    }

    @ObfuscatedName("dr.ba(IIIIZIIIIIII)Z")
    public static final boolean method2225(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field536[var11][var12] = 0;
                field608[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field536[arg0][arg1] = 99;
        field608[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field538[var15] = arg0;
        int var36 = var15 + 1;
        field589[var15] = arg1;
        boolean var17 = false;
        int var18 = field538.length;
        int[][] var19 = field531[Statics.field231].field2752;
        while (var36 != var16) {
            var13 = field538[var16];
            var14 = field589[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field531[Statics.field231].method3217(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field531[Statics.field231].method3223(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field531[Statics.field231].method3228(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field608[var13][var14] + 1;
            if (var13 > 0 && field536[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field538[var36] = var13 - 1;
                field589[var36] = var14;
                var36 = (var36 + 1) % var18;
                field536[var13 - 1][var14] = 2;
                field608[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field536[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field538[var36] = var13 + 1;
                field589[var36] = var14;
                var36 = (var36 + 1) % var18;
                field536[var13 + 1][var14] = 8;
                field608[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field536[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field538[var36] = var13;
                field589[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field536[var13][var14 - 1] = 1;
                field608[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field536[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field538[var36] = var13;
                field589[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field536[var13][var14 + 1] = 4;
                field608[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field536[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field538[var36] = var13 - 1;
                field589[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field536[var13 - 1][var14 - 1] = 3;
                field608[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field536[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field538[var36] = var13 + 1;
                field589[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field536[var13 + 1][var14 - 1] = 9;
                field608[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field536[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field538[var36] = var13 - 1;
                field589[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field536[var13 - 1][var14 + 1] = 6;
                field608[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field536[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field538[var36] = var13 + 1;
                field589[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field536[var13 + 1][var14 + 1] = 12;
                field608[var13 + 1][var14 + 1] = var20;
            }
        }
        field535 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field608[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field608[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field608[var24][var25];
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
            field535 = 1;
        }
        byte var29 = 0;
        field538[var29] = var13;
        int var37 = var29 + 1;
        field589[var29] = var14;
        int var30;
        int var31 = var30 = field536[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field538[var37] = var13;
                field589[var37++] = var14;
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
            var31 = field536[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field538[var37];
            int var34 = field589[var37];
            if (arg10 == 0) {
                field512.method2356(129);
                field512.method2474(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field512.method2356(126);
                field512.method2474(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field512.method2356(222);
                field512.method2474(var32 + var32 + 3);
            }
            field512.method2553(Statics.field1552 + var34);
            field707 = field538[0];
            field708 = field589[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field512.method2509(field538[var37] - var33);
                field512.method2474(field589[var37] - var34);
            }
            field512.method2518(Statics.field85 + var33);
            field512.method2474(class75.field1363[82] ? 1 : 0);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("w.bd(B)V")
    public static final void method155() {
        if (field610 == 142) {
            int var0 = field514.method2659();
            int var1 = (var0 >> 4 & 0x7) + Statics.field468;
            int var2 = (var0 & 0x7) + Statics.field17;
            int var3 = field514.method2652();
            int var4 = field514.method2659();
            int var5 = field514.method2652();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class20 var8 = new class20(var3, Statics.field231, var6, var7, method49(var6, var7, Statics.field231) - var4, var5, field481);
                field611.method3328(var8);
            }
        } else if (field610 == 34) {
            int var9 = field514.method2659();
            int var10 = (var9 >> 4 & 0x7) + Statics.field468;
            int var11 = (var9 & 0x7) + Statics.field17;
            int var12 = field514.method2520();
            int var13 = field514.method2652();
            int var14 = field514.method2520();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && field690 != var14) {
                class17 var15 = new class17();
                var15.field254 = var13;
                var15.field250 = var12;
                if (field534[Statics.field231][var10][var11] == null) {
                    field534[Statics.field231][var10][var11] = new class177();
                }
                field534[Statics.field231][var10][var11].method3328(var15);
                method2409(var10, var11);
            }
        } else if (field610 == 163) {
            int var16 = field514.method2659();
            int var17 = (var16 >> 4 & 0x7) + Statics.field468;
            int var18 = (var16 & 0x7) + Statics.field17;
            int var19 = var17 + field514.method2656();
            int var20 = var18 + field514.method2656();
            int var21 = field514.method2588();
            int var22 = field514.method2652();
            int var23 = field514.method2659() * 4;
            int var24 = field514.method2659() * 4;
            int var25 = field514.method2652();
            int var26 = field514.method2652();
            int var27 = field514.method2659();
            int var28 = field514.method2659();
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && var22 != 65535) {
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                int var31 = var19 * 128 + 64;
                int var32 = var20 * 128 + 64;
                class10 var33 = new class10(var22, Statics.field231, var29, var30, method49(var29, var30, Statics.field231) - var23, field481 + var25, field481 + var26, var27, var28, var21, var24);
                var33.method107(var31, var32, method49(var31, var32, Statics.field231) - var24, field481 + var25);
                field540.method3328(var33);
            }
        } else if (field610 == 195) {
            int var34 = field514.method2671();
            int var35 = (var34 >> 4 & 0x7) + Statics.field468;
            int var36 = (var34 & 0x7) + Statics.field17;
            int var37 = field514.method2671();
            int var38 = var37 >> 2;
            int var39 = var37 & 0x3;
            int var40 = field544[var38];
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                method50(Statics.field231, var35, var36, var40, -1, var38, var39, 0, -1);
            }
        } else {
            if (field610 == 162) {
                byte var41 = field514.method2663();
                byte var42 = field514.method2514();
                int var43 = field514.method2659();
                int var44 = var43 >> 2;
                int var45 = var43 & 0x3;
                int var46 = field544[var44];
                int var47 = field514.method2513();
                int var48 = (var47 >> 4 & 0x7) + Statics.field468;
                int var49 = (var47 & 0x7) + Statics.field17;
                int var50 = field514.method2571();
                int var51 = field514.method2520();
                byte var52 = field514.method2514();
                int var53 = field514.method2571();
                byte var54 = field514.method2672();
                int var55 = field514.method2522();
                class3 var56;
                if (field690 == var51) {
                    var56 = Statics.field2006;
                } else {
                    var56 = field594[var51];
                }
                if (var56 != null) {
                    class32 var57 = class32.method3258(var55);
                    int var58;
                    int var59;
                    if (var45 == 1 || var45 == 3) {
                        var58 = var57.field854;
                        var59 = var57.field829;
                    } else {
                        var58 = var57.field829;
                        var59 = var57.field854;
                    }
                    int var60 = (var58 >> 1) + var48;
                    int var61 = (var58 + 1 >> 1) + var48;
                    int var62 = (var59 >> 1) + var49;
                    int var63 = (var59 + 1 >> 1) + var49;
                    int[][] var64 = class9.field136[Statics.field231];
                    int var65 = var64[var60][var62] + var64[var61][var62] + var64[var60][var63] + var64[var61][var63] >> 2;
                    int var66 = (var48 << 7) + (var58 << 6);
                    int var67 = (var49 << 7) + (var59 << 6);
                    class112 var68 = var57.method707(var44, var45, var64, var66, var65, var67);
                    if (var68 != null) {
                        method50(Statics.field231, var48, var49, var46, -1, 0, 0, var53 + 1, var50 + 1);
                        var56.field41 = field481 + var53;
                        var56.field36 = field481 + var50;
                        var56.field44 = var68;
                        var56.field43 = var48 * 128 + var58 * 64;
                        var56.field54 = var49 * 128 + var59 * 64;
                        var56.field46 = var65;
                        if (var54 > var52) {
                            byte var69 = var54;
                            var54 = var52;
                            var52 = var69;
                        }
                        if (var42 > var41) {
                            byte var70 = var42;
                            var42 = var41;
                            var41 = var70;
                        }
                        var56.field47 = var48 + var54;
                        var56.field34 = var48 + var52;
                        var56.field48 = var42 + var49;
                        var56.field50 = var41 + var49;
                    }
                }
            }
            if (field610 == 10) {
                int var71 = field514.method2659();
                int var72 = (var71 >> 4 & 0x7) + Statics.field468;
                int var73 = (var71 & 0x7) + Statics.field17;
                int var74 = field514.method2652();
                int var75 = field514.method2659();
                int var76 = var75 >> 4 & 0xF;
                int var77 = var75 & 0x7;
                int var78 = field514.method2659();
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                    int var79 = var76 + 1;
                    if (Statics.field2006.field430[0] >= var72 - var79 && Statics.field2006.field430[0] <= var72 + var79 && Statics.field2006.field463[0] >= var73 - var79 && Statics.field2006.field463[0] <= var73 + var79 && field714 != 0 && var77 > 0 && field685 < 50) {
                        field647[field685] = var74;
                        field570[field685] = var77;
                        field718[field685] = var78;
                        field720[field685] = null;
                        field719[field685] = (var72 << 16) + (var73 << 8) + var76;
                        field685++;
                    }
                }
            }
            if (field610 == 232) {
                int var80 = field514.method2659();
                int var81 = (var80 >> 4 & 0x7) + Statics.field468;
                int var82 = (var80 & 0x7) + Statics.field17;
                int var83 = field514.method2513();
                int var84 = var83 >> 2;
                int var85 = var83 & 0x3;
                int var86 = field544[var84];
                int var87 = field514.method2522();
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    method50(Statics.field231, var81, var82, var86, var87, var84, var85, 0, -1);
                }
            } else if (field610 == 115) {
                int var88 = field514.method2659();
                int var89 = (var88 >> 4 & 0x7) + Statics.field468;
                int var90 = (var88 & 0x7) + Statics.field17;
                int var91 = field514.method2652();
                int var92 = field514.method2652();
                int var93 = field514.method2652();
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    class177 var94 = field534[Statics.field231][var89][var90];
                    if (var94 != null) {
                        for (class17 var95 = (class17) var94.method3334(); var95 != null; var95 = (class17) var94.method3355()) {
                            if ((var91 & 0x7FFF) == var95.field254 && var95.field250 == var92) {
                                var95.field250 = var93;
                                break;
                            }
                        }
                        method2409(var89, var90);
                    }
                }
            } else if (field610 == 129) {
                int var96 = field514.method2671();
                int var97 = (var96 >> 4 & 0x7) + Statics.field468;
                int var98 = (var96 & 0x7) + Statics.field17;
                int var99 = field514.method2652();
                int var100 = field514.method2659();
                int var101 = var100 >> 2;
                int var102 = var100 & 0x3;
                int var103 = field544[var101];
                if (var97 >= 0 && var98 >= 0 && var97 < 103 && var98 < 103) {
                    if (var103 == 0) {
                        class96 var104 = Statics.field53.method1941(Statics.field231, var97, var98);
                        if (var104 != null) {
                            int var105 = var104.field1619 >> 14 & 0x7FFF;
                            if (var101 == 2) {
                                var104.field1623 = new class14(var105, 2, var102 + 4, Statics.field231, var97, var98, var99, false, var104.field1623);
                                var104.field1624 = new class14(var105, 2, var102 + 1 & 0x3, Statics.field231, var97, var98, var99, false, var104.field1624);
                            } else {
                                var104.field1623 = new class14(var105, var101, var102, Statics.field231, var97, var98, var99, false, var104.field1623);
                            }
                        }
                    }
                    if (var103 == 1) {
                        class108 var106 = Statics.field53.method1942(Statics.field231, var97, var98);
                        if (var106 != null) {
                            int var107 = var106.field1820 >> 14 & 0x7FFF;
                            if (var101 == 4 || var101 == 5) {
                                var106.field1817 = new class14(var107, 4, var102, Statics.field231, var97, var98, var99, false, var106.field1817);
                            } else if (var101 == 6) {
                                var106.field1817 = new class14(var107, 4, var102 + 4, Statics.field231, var97, var98, var99, false, var106.field1817);
                            } else if (var101 == 7) {
                                var106.field1817 = new class14(var107, 4, (var102 + 2 & 0x3) + 4, Statics.field231, var97, var98, var99, false, var106.field1817);
                            } else if (var101 == 8) {
                                var106.field1817 = new class14(var107, 4, var102 + 4, Statics.field231, var97, var98, var99, false, var106.field1817);
                                var106.field1813 = new class14(var107, 4, (var102 + 2 & 0x3) + 4, Statics.field231, var97, var98, var99, false, var106.field1813);
                            }
                        }
                    }
                    if (var103 == 2) {
                        class98 var108 = Statics.field53.method1982(Statics.field231, var97, var98);
                        if (var101 == 11) {
                            var101 = 10;
                        }
                        if (var108 != null) {
                            var108.field1650 = new class14(var108.field1649 >> 14 & 0x7FFF, var101, var102, Statics.field231, var97, var98, var99, false, var108.field1650);
                        }
                    }
                    if (var103 == 3) {
                        class107 var109 = Statics.field53.method1944(Statics.field231, var97, var98);
                        if (var109 != null) {
                            var109.field1803 = new class14(var109.field1806 >> 14 & 0x7FFF, 22, var102, Statics.field231, var97, var98, var99, false, var109.field1803);
                        }
                    }
                }
            } else if (field610 == 124) {
                int var110 = field514.method2652();
                int var111 = field514.method2511();
                int var112 = (var111 >> 4 & 0x7) + Statics.field468;
                int var113 = (var111 & 0x7) + Statics.field17;
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                    class177 var114 = field534[Statics.field231][var112][var113];
                    if (var114 != null) {
                        for (class17 var115 = (class17) var114.method3334(); var115 != null; var115 = (class17) var114.method3355()) {
                            if ((var110 & 0x7FFF) == var115.field254) {
                                var115.method3360();
                                break;
                            }
                        }
                        if (var114.method3334() == null) {
                            field534[Statics.field231][var112][var113] = null;
                        }
                        method2409(var112, var113);
                    }
                }
            } else if (field610 == 188) {
                int var116 = field514.method2520();
                int var117 = field514.method2520();
                int var118 = field514.method2511();
                int var119 = (var118 >> 4 & 0x7) + Statics.field468;
                int var120 = (var118 & 0x7) + Statics.field17;
                if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                    class17 var121 = new class17();
                    var121.field254 = var117;
                    var121.field250 = var116;
                    if (field534[Statics.field231][var119][var120] == null) {
                        field534[Statics.field231][var119][var120] = new class177();
                    }
                    field534[Statics.field231][var119][var120].method3328(var121);
                    method2409(var119, var120);
                }
            }
        }
    }

    @ObfuscatedName("v.bb(IIIIIIIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field609.method3334(); var10 != null; var10 = (class22) field609.method3355()) {
            if (var10.field347 == arg0 && var10.field336 == arg1 && var10.field337 == arg2 && var10.field335 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field347 = arg0;
            var9.field335 = arg3;
            var9.field336 = arg1;
            var9.field337 = arg2;
            method37(var9);
            field609.method3328(var9);
        }
        var9.field351 = arg4;
        var9.field345 = arg5;
        var9.field343 = arg6;
        var9.field342 = arg7;
        var9.field340 = arg8;
    }

    @ObfuscatedName("l.bk(I)V")
    public static final void method43() {
        for (class22 var0 = (class22) field609.method3334(); var0 != null; var0 = (class22) field609.method3355()) {
            if (var0.field340 == -1) {
                var0.field342 = 0;
                method37(var0);
            } else {
                var0.method3360();
            }
        }
    }

    @ObfuscatedName("n.bx(Lm;I)V")
    public static final void method37(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field335 == 0) {
            var1 = Statics.field53.method1945(arg0.field347, arg0.field336, arg0.field337);
        }
        if (arg0.field335 == 1) {
            var1 = Statics.field53.method1946(arg0.field347, arg0.field336, arg0.field337);
        }
        if (arg0.field335 == 2) {
            var1 = Statics.field53.method1947(arg0.field347, arg0.field336, arg0.field337);
        }
        if (arg0.field335 == 3) {
            var1 = Statics.field53.method1948(arg0.field347, arg0.field336, arg0.field337);
        }
        if (var1 != 0) {
            int var5 = Statics.field53.method1949(arg0.field347, arg0.field336, arg0.field337, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field338 = var2;
        arg0.field346 = var3;
        arg0.field339 = var4;
    }

    @ObfuscatedName("da.bv(IIIIIIII)V")
    public static final void method2353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field477 && Statics.field231 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field53.method1945(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field53.method1946(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field53.method1947(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field53.method1948(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field53.method1949(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field53.method2033(arg0, arg2, arg3);
                class32 var15 = class32.method3258(var12);
                if (var15.field816 != 0) {
                    field531[arg0].method3241(arg2, arg3, var13, var14, var15.field831);
                }
            }
            if (arg1 == 1) {
                Statics.field53.method1959(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field53.method1969(arg0, arg2, arg3);
                class32 var16 = class32.method3258(var12);
                if (var16.field829 + arg2 > 103 || var16.field829 + arg3 > 103 || var16.field854 + arg2 > 103 || var16.field854 + arg3 > 103) {
                    return;
                }
                if (var16.field816 != 0) {
                    field531[arg0].method3224(arg2, arg3, var16.field829, var16.field854, var14, var16.field831);
                }
            }
            if (arg1 == 3) {
                Statics.field53.method1939(arg0, arg2, arg3);
                class32 var17 = class32.method3258(var12);
                if (var17.field816 == 1) {
                    field531[arg0].method3225(arg2, arg3);
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
        class9.method32(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field53, field531[arg0]);
    }

    @ObfuscatedName("dg.bq(III)V")
    public static final void method2409(int arg0, int arg1) {
        class177 var2 = field534[Statics.field231][arg0][arg1];
        if (var2 == null) {
            Statics.field53.method1940(Statics.field231, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3334(); var5 != null; var5 = (class17) var2.method3355()) {
            class40 var6 = class40.method730(var5.field254);
            int var7 = var6.field1006;
            if (var6.field1005 == 1) {
                var7 = (var5.field250 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field53.method1940(Statics.field231, arg0, arg1);
            return;
        }
        var2.method3332(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3334(); var10 != null; var10 = (class17) var2.method3355()) {
            if (var4.field254 != var10.field254) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field254 != var10.field254 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field53.method2068(Statics.field231, arg0, arg1, method49(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field231), var4, var11, var8, var9);
    }

    @ObfuscatedName("aa.bj(I)V")
    public static final void method833() {
        field602 = 0;
        field592 = 0;
        method154();
        method143();
        method139();
        method1399();
        for (int var0 = 0; var0 < field602; var0++) {
            int var1 = field603[var0];
            if (field481 != field594[var1].field459) {
                field594[var1] = null;
            }
        }
        if (field496 != field514.field2038) {
            throw new RuntimeException(field514.field2038 + class2.field19 + field496);
        }
        for (int var2 = 0; var2 < field630; var2++) {
            if (field594[field596[var2]] == null) {
                throw new RuntimeException(var2 + class2.field19 + field630);
            }
        }
    }

    @ObfuscatedName("u.bg(I)V")
    public static final void method154() {
        field514.method2358();
        int var0 = field514.method2359(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field514.method2359(2);
        if (var1 == 0) {
            field717[++field592 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field514.method2359(3);
            Statics.field2006.method231(var2, false);
            int var3 = field514.method2359(1);
            if (var3 == 1) {
                field717[++field592 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field514.method2359(3);
            Statics.field2006.method231(var4, true);
            int var5 = field514.method2359(3);
            Statics.field2006.method231(var5, true);
            int var6 = field514.method2359(1);
            if (var6 == 1) {
                field717[++field592 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field231 = field514.method2359(2);
            int var7 = field514.method2359(7);
            int var8 = field514.method2359(7);
            int var9 = field514.method2359(1);
            int var10 = field514.method2359(1);
            if (var10 == 1) {
                field717[++field592 - 1] = 2047;
            }
            Statics.field2006.method230(var8, var7, var9 == 1);
        }
    }

    @ObfuscatedName("q.bf(B)V")
    public static final void method143() {
        int var0 = field514.method2359(8);
        if (var0 < field630) {
            for (int var1 = var0; var1 < field630; var1++) {
                field603[++field602 - 1] = field596[var1];
            }
        }
        if (var0 > field630) {
            throw new RuntimeException("");
        }
        field630 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field596[var2];
            class3 var4 = field594[var3];
            int var5 = field514.method2359(1);
            if (var5 == 0) {
                field596[++field630 - 1] = var3;
                var4.field459 = field481;
            } else {
                int var6 = field514.method2359(2);
                if (var6 == 0) {
                    field596[++field630 - 1] = var3;
                    var4.field459 = field481;
                    field717[++field592 - 1] = var3;
                } else if (var6 == 1) {
                    field596[++field630 - 1] = var3;
                    var4.field459 = field481;
                    int var7 = field514.method2359(3);
                    var4.method231(var7, false);
                    int var8 = field514.method2359(1);
                    if (var8 == 1) {
                        field717[++field592 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field596[++field630 - 1] = var3;
                    var4.field459 = field481;
                    int var9 = field514.method2359(3);
                    var4.method231(var9, true);
                    int var10 = field514.method2359(3);
                    var4.method231(var10, true);
                    int var11 = field514.method2359(1);
                    if (var11 == 1) {
                        field717[++field592 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field603[++field602 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("a.bi(I)V")
    public static final void method139() {
        while (true) {
            if (field514.method2363(field496) >= 11) {
                int var0 = field514.method2359(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field594[var0] == null) {
                        field594[var0] = new class3();
                        if (field599[var0] != null) {
                            field594[var0].method20(field599[var0]);
                        }
                        var1 = true;
                    }
                    field596[++field630 - 1] = var0;
                    class3 var2 = field594[var0];
                    var2.field459 = field481;
                    int var3 = field514.method2359(1);
                    if (var3 == 1) {
                        field717[++field592 - 1] = var0;
                    }
                    int var4 = field514.method2359(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field607[field514.method2359(3)];
                    if (var1) {
                        var2.field458 = var2.field429 = var5;
                    }
                    int var6 = field514.method2359(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field514.method2359(1);
                    var2.method230(Statics.field2006.field430[0] + var6, Statics.field2006.field463[0] + var4, var7 == 1);
                    continue;
                }
            }
            field514.method2360();
            return;
        }
    }

    @ObfuscatedName("by.br(B)V")
    public static final void method1399() {
        for (int var0 = 0; var0 < field592; var0++) {
            int var1 = field717[var0];
            class3 var2 = field594[var1];
            int var3 = field514.method2659();
            if ((var3 & 0x2) != 0) {
                var3 += field514.method2659() << 8;
            }
            method1662(var1, var2, var3);
        }
    }

    @ObfuscatedName("cw.by(ILo;II)V")
    public static final void method1662(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x40) != 0) {
            int var3 = field514.method2522();
            int var4 = field514.method2513();
            int var5 = field514.method2511();
            int var6 = field514.field2038;
            if (arg1.field40 != null && arg1.field35 != null) {
                boolean var7 = false;
                if (var4 <= 1 && method150(arg1.field40)) {
                    var7 = true;
                }
                if (!var7 && field737 == 0) {
                    field498.field2038 = 0;
                    field514.method2533(field498.field2037, 0, var5);
                    field498.field2038 = 0;
                    class127 var8 = field498;
                    String var9 = class184.method1425(var8, 32767);
                    String var10 = class185.method3401(class147.method1548(var9));
                    arg1.field410 = var10.trim();
                    arg1.field425 = var3 >> 8;
                    arg1.field426 = var3 & 0xFF;
                    arg1.field424 = 150;
                    if (var4 == 2 || var4 == 3) {
                        method2724(1, Statics.method625(1) + arg1.field40, var10);
                    } else if (var4 == 1) {
                        method2724(1, Statics.method625(0) + arg1.field40, var10);
                    } else {
                        method2724(2, arg1.field40, var10);
                    }
                }
            }
            field514.field2038 = var5 + var6;
        }
        if ((arg2 & 0x4) != 0) {
            int var11 = field514.method2513();
            int var12 = field514.method2671();
            arg1.method232(var11, var12, field481);
            arg1.field431 = field481 + 300;
            arg1.field415 = field514.method2671();
            arg1.field432 = field514.method2671();
        }
        if ((arg2 & 0x8) != 0) {
            int var13 = field514.method2671();
            byte[] var14 = new byte[var13];
            class127 var15 = new class127(var14);
            field514.method2534(var14, 0, var13);
            field599[arg0] = var15;
            arg1.method20(var15);
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field433 = field514.method2571();
            if (arg1.field433 == 65535) {
                arg1.field433 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var16 = field514.method2571();
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = field514.method2511();
            method1431(arg1, var16, var17);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field444 = field514.method2520();
            int var18 = field514.method2605();
            arg1.field448 = var18 >> 16;
            arg1.field447 = (var18 & 0xFFFF) + field481;
            arg1.field465 = 0;
            arg1.field446 = 0;
            if (arg1.field447 > field481) {
                arg1.field465 = -1;
            }
            if (arg1.field444 == 65535) {
                arg1.field444 = -1;
            }
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field456 = field514.method2513();
            arg1.field451 = field514.method2659();
            arg1.field469 = field514.method2671();
            arg1.field452 = field514.method2511();
            arg1.field453 = field514.method2571() + field481;
            arg1.field454 = field514.method2571() + field481;
            arg1.field427 = field514.method2671();
            arg1.field461 = 1;
            arg1.field466 = 0;
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field410 = field514.method2490();
            if (arg1.field410.charAt(0) == '~') {
                arg1.field410 = arg1.field410.substring(1);
                method2724(2, arg1.field40, arg1.field410);
            } else if (Statics.field2006 == arg1) {
                method2724(2, arg1.field40, arg1.field410);
            }
            arg1.field425 = 0;
            arg1.field426 = 0;
            arg1.field424 = 150;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field450 = field514.method2652();
            arg1.field467 = field514.method2571();
        }
        if ((arg2 & 0x100) == 0) {
            return;
        }
        int var19 = field514.method2511();
        int var20 = field514.method2511();
        arg1.method232(var19, var20, field481);
        arg1.field431 = field481 + 300;
        arg1.field415 = field514.method2671();
        arg1.field432 = field514.method2513();
    }

    @ObfuscatedName("p.bh(I)V")
    public static final void method5() {
        field514.method2358();
        int var0 = field514.method2359(8);
        if (var0 < field510) {
            for (int var1 = var0; var1 < field510; var1++) {
                field603[++field602 - 1] = field657[var1];
            }
        }
        if (var0 > field510) {
            throw new RuntimeException("");
        }
        field510 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field657[var2];
            class25 var4 = field509[var3];
            int var5 = field514.method2359(1);
            if (var5 == 0) {
                field657[++field510 - 1] = var3;
                var4.field459 = field481;
            } else {
                int var6 = field514.method2359(2);
                if (var6 == 0) {
                    field657[++field510 - 1] = var3;
                    var4.field459 = field481;
                    field717[++field592 - 1] = var3;
                } else if (var6 == 1) {
                    field657[++field510 - 1] = var3;
                    var4.field459 = field481;
                    int var7 = field514.method2359(3);
                    var4.method231(var7, false);
                    int var8 = field514.method2359(1);
                    if (var8 == 1) {
                        field717[++field592 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field657[++field510 - 1] = var3;
                    var4.field459 = field481;
                    int var9 = field514.method2359(3);
                    var4.method231(var9, true);
                    int var10 = field514.method2359(3);
                    var4.method231(var10, true);
                    int var11 = field514.method2359(1);
                    if (var11 == 1) {
                        field717[++field592 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field603[++field602 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("cd.bm(B)V")
    public static final void method1626() {
        while (true) {
            if (field514.method2363(field496) >= 27) {
                int var0 = field514.method2359(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field509[var0] == null) {
                        field509[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field509[var0];
                    field657[++field510 - 1] = var0;
                    var2.field459 = field481;
                    var2.field388 = class31.method2723(field514.method2359(14));
                    int var3 = field607[field514.method2359(3)];
                    if (var1) {
                        var2.field458 = var2.field429 = var3;
                    }
                    int var4 = field514.method2359(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field514.method2359(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field514.method2359(1);
                    if (var6 == 1) {
                        field717[++field592 - 1] = var0;
                    }
                    int var7 = field514.method2359(1);
                    var2.field443 = var2.field388.field779;
                    var2.field460 = var2.field388.field802;
                    if (var2.field460 == 0) {
                        var2.field429 = 0;
                    }
                    var2.field418 = var2.field388.field789;
                    var2.field419 = var2.field388.field786;
                    var2.field420 = var2.field388.field793;
                    var2.field421 = var2.field388.field788;
                    var2.field449 = var2.field388.field782;
                    var2.field416 = var2.field388.field809;
                    var2.field417 = var2.field388.field784;
                    var2.method230(Statics.field2006.field430[0] + var4, Statics.field2006.field463[0] + var5, var7 == 1);
                    continue;
                }
            }
            field514.method2360();
            return;
        }
    }

    @ObfuscatedName("bi.bu(I)V")
    public static final void method1386() {
        for (int var0 = 0; var0 < field592; var0++) {
            int var1 = field717[var0];
            class25 var2 = field509[var1];
            int var3 = field514.method2659();
            if ((var3 & 0x8) != 0) {
                int var4 = field514.method2513();
                int var5 = field514.method2511();
                var2.method232(var4, var5, field481);
                var2.field431 = field481 + 300;
                var2.field415 = field514.method2511();
                var2.field432 = field514.method2511();
            }
            if ((var3 & 0x1) != 0) {
                int var6 = field514.method2513();
                int var7 = field514.method2511();
                var2.method232(var6, var7, field481);
                var2.field431 = field481 + 300;
                var2.field415 = field514.method2511();
                var2.field432 = field514.method2511();
            }
            if ((var3 & 0x10) != 0) {
                var2.field410 = field514.method2490();
                var2.field424 = 100;
            }
            if ((var3 & 0x40) != 0) {
                var2.field433 = field514.method2522();
                if (var2.field433 == 65535) {
                    var2.field433 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field444 = field514.method2571();
                int var8 = field514.method2551();
                var2.field448 = var8 >> 16;
                var2.field447 = (var8 & 0xFFFF) + field481;
                var2.field465 = 0;
                var2.field446 = 0;
                if (var2.field447 > field481) {
                    var2.field465 = -1;
                }
                if (var2.field444 == 65535) {
                    var2.field444 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field388 = class31.method2723(field514.method2571());
                var2.field443 = var2.field388.field779;
                var2.field460 = var2.field388.field802;
                var2.field418 = var2.field388.field789;
                var2.field419 = var2.field388.field786;
                var2.field420 = var2.field388.field793;
                var2.field421 = var2.field388.field788;
                var2.field449 = var2.field388.field782;
                var2.field416 = var2.field388.field809;
                var2.field417 = var2.field388.field784;
            }
            if ((var3 & 0x20) != 0) {
                int var9 = field514.method2522();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field514.method2513();
                if (var2.field439 == var9 && var9 != -1) {
                    int var11 = class34.method160(var9).field894;
                    if (var11 == 1) {
                        var2.field440 = 0;
                        var2.field412 = 0;
                        var2.field414 = var10;
                        var2.field462 = 0;
                    }
                    if (var11 == 2) {
                        var2.field462 = 0;
                    }
                } else if (var9 == -1 || var2.field439 == -1 || class34.method160(var9).field889 >= class34.method160(var2.field439).field889) {
                    var2.field439 = var9;
                    var2.field440 = 0;
                    var2.field412 = 0;
                    var2.field414 = var10;
                    var2.field462 = 0;
                    var2.field466 = var2.field461;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field450 = field514.method2522();
                var2.field467 = field514.method2520();
            }
        }
    }

    @ObfuscatedName("ae.bn(IIIII)V")
    public static final void method596(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field676; var4++) {
            if (field683[var4] + field681[var4] > arg0 && field681[var4] < arg0 + arg2 && field682[var4] + field624[var4] > arg1 && field682[var4] < arg1 + arg3) {
                field678[var4] = true;
            }
        }
    }

    @ObfuscatedName("i.bt(IIIIB)V")
    public static final void method10(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field676; var4++) {
            if (field683[var4] + field681[var4] > arg0 && field681[var4] < arg0 + arg2 && field682[var4] + field624[var4] > arg1 && field682[var4] < arg1 + arg3) {
                field584[var4] = true;
            }
        }
    }

    @ObfuscatedName("i.bl(I)V")
    public static final void method14() {
        if (Statics.field752 != null || field645 != null) {
            return;
        }
        int var12;
        int var13;
        label157: {
            int var0 = class77.field1402;
            if (field652) {
                if (var0 != 1) {
                    int var1 = class77.field1397;
                    int var2 = class77.field1391;
                    if (var1 < Statics.field2467 - 10 || var1 > Statics.field2467 + Statics.field1115 + 10 || var2 < Statics.field29 - 10 || var2 > Statics.field29 + Statics.field1629 + 10) {
                        field652 = false;
                        method596(Statics.field2467, Statics.field29, Statics.field1115, Statics.field1629);
                    }
                }
                if (var0 == 1) {
                    int var3 = Statics.field2467;
                    int var4 = Statics.field29;
                    int var5 = Statics.field1115;
                    int var6 = class77.field1395;
                    int var7 = class77.field1404;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field558; var9++) {
                        int var10 = (field558 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method3110(var8);
                    }
                    field652 = false;
                    method596(Statics.field2467, Statics.field29, Statics.field1115, Statics.field1629);
                }
            } else {
                if (var0 == 1 && field558 > 0) {
                    int var11 = field620[field558 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field503[field558 - 1];
                        var13 = field527[field558 - 1];
                        class158 var14 = class158.method667(var13);
                        int var15 = method242(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label157;
                        }
                        int var17 = method242(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label157;
                        }
                    }
                }
                if (var0 == 1 && (field655 == 1 && field558 > 2 || method3071(field558 - 1))) {
                    var0 = 2;
                }
                if (var0 == 1 && field558 > 0) {
                    method3110(field558 - 1);
                }
                if (var0 == 2 && field558 > 0) {
                    method2424();
                }
            }
            return;
        }
        field591 = false;
        field668 = 0;
        if (Statics.field752 != null) {
            method42(Statics.field752);
        }
        Statics.field752 = class158.method667(var13);
        field587 = var12;
        field588 = class77.field1395;
        field659 = class77.field1404;
        method42(Statics.field752);
    }

    @ObfuscatedName("dm.bo(I)V")
    public static final void method2424() {
        int var0 = Statics.field196.method3397(class134.field2232);
        for (int var1 = 0; var1 < field558; var1++) {
            class183 var2 = Statics.field196;
            String var3;
            if (field623[var1].length() > 0) {
                var3 = field515[var1] + class134.field2239 + field623[var1];
            } else {
                var3 = field515[var1];
            }
            int var4 = var2.method3397(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field558 * 15 + 21;
        int var6 = class77.field1395 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1404;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field652 = true;
        Statics.field2467 = var6;
        Statics.field29 = var7;
        Statics.field1115 = var0;
        Statics.field1629 = field558 * 15 + 22;
    }

    @ObfuscatedName("ee.bw(II)Z")
    public static final boolean method3071(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field620[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fj.bz(IB)V")
    public static final void method3110(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field503[arg0];
        int var2 = field527[arg0];
        int var3 = field620[arg0];
        int var4 = field621[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 18) {
            boolean var5 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var5) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(246);
            field512.method2519(Statics.field85 + var1);
            field512.method2475(var4);
            field512.method2475(Statics.field1552 + var2);
        }
        if (var3 == 43) {
            field512.method2356(197);
            field512.method2606(var2);
            field512.method2519(var1);
            field512.method2519(var4);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 31) {
            field512.method2356(83);
            field512.method2475(Statics.field8);
            field512.method2553(var1);
            field512.method2606(var2);
            field512.method2507(Statics.field1266);
            field512.method2475(Statics.field2059);
            field512.method2475(var4);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 8) {
            class25 var7 = field509[var4];
            if (var7 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var7.field430[0], var7.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(39);
                field512.method2518(field631);
                field512.method2507(Statics.field241);
                field512.method2475(var4);
            }
        }
        if (var3 == 10) {
            class25 var8 = field509[var4];
            if (var8 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var8.field430[0], var8.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(142);
                field512.method2553(var4);
            }
        }
        if (var3 == 23) {
            Statics.field53.method1956(Statics.field231, var1, var2);
        }
        if (var3 == 49) {
            class3 var9 = field594[var4];
            if (var9 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var9.field430[0], var9.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(252);
                field512.method2475(var4);
            }
        }
        if (var3 == 32) {
            field512.method2356(34);
            field512.method2527(Statics.field241);
            field512.method2606(var2);
            field512.method2553(field631);
            field512.method2518(var4);
            field512.method2519(var1);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 30 && field638 == null) {
            field512.method2356(19);
            field512.method2527(var2);
            field512.method2553(var1);
            field638 = class158.method3104(var2, var1);
            method42(field638);
        }
        if (var3 == 1001) {
            method751(var1, var2, var4);
            field512.method2356(136);
            field512.method2475(Statics.field85 + var1);
            field512.method2518(Statics.field1552 + var2);
            field512.method2553(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 21) {
            boolean var10 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var10) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(65);
            field512.method2519(Statics.field1552 + var2);
            field512.method2519(Statics.field85 + var1);
            field512.method2519(var4);
        }
        if (var3 == 40) {
            field512.method2356(155);
            field512.method2529(var2);
            field512.method2518(var1);
            field512.method2518(var4);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 51) {
            class3 var12 = field594[var4];
            if (var12 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var12.field430[0], var12.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(113);
                field512.method2518(var4);
            }
        }
        if (var3 == 25) {
            class158 var13 = class158.method3104(var2, var1);
            if (var13 != null) {
                Statics.method921();
                int var16 = method242(var13);
                int var17 = var16 >> 11 & 0x3F;
                method791(var2, var1, var17);
                field628 = 0;
                field706 = method47(var13);
                if (field706 == null) {
                    field706 = "Null";
                }
                if (var13.field2583) {
                    field633 = var13.field2644 + class2.method3257(16777215);
                } else {
                    field633 = class2.method3257(65280) + var13.field2684 + class2.method3257(16777215);
                }
            }
            return;
        }
        if (var3 == 4) {
            method751(var1, var2, var4);
            field512.method2356(21);
            field512.method2475(Statics.field85 + var1);
            field512.method2475(var4 >> 14 & 0x7FFF);
            field512.method2475(Statics.field1552 + var2);
        }
        if (var3 == 24) {
            class158 var18 = class158.method667(var2);
            boolean var19 = true;
            if (var18.field2614 > 0) {
                var19 = Statics.method51(var18);
            }
            if (var19) {
                field512.method2356(88);
                field512.method2606(var2);
            }
        }
        if (var3 == 42) {
            field512.method2356(232);
            field512.method2475(var4);
            field512.method2475(var1);
            field512.method2527(var2);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 19) {
            boolean var20 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var20) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(151);
            field512.method2475(Statics.field85 + var1);
            field512.method2519(Statics.field1552 + var2);
            field512.method2553(var4);
        }
        if (var3 == 1002) {
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(133);
            field512.method2475(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 26) {
            field512.method2356(178);
            for (class4 var22 = (class4) field635.method3326(); var22 != null; var22 = (class4) field635.method3316()) {
                if (var22.field58 == 0 || var22.field58 == 3) {
                    method1402(var22, true);
                }
            }
            if (field638 != null) {
                method42(field638);
                field638 = null;
            }
        }
        if (var3 == 16) {
            boolean var23 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var23) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(183);
            field512.method2518(Statics.field1552 + var2);
            field512.method2606(Statics.field1266);
            field512.method2475(var4);
            field512.method2553(Statics.field8);
            field512.method2519(Statics.field2059);
            field512.method2519(Statics.field85 + var1);
        }
        if (var3 == 35) {
            field512.method2356(156);
            field512.method2518(var4);
            field512.method2507(var2);
            field512.method2475(var1);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 45) {
            class3 var25 = field594[var4];
            if (var25 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var25.field430[0], var25.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(227);
                field512.method2475(var4);
            }
        }
        if (var3 == 2 && method751(var1, var2, var4)) {
            field512.method2356(143);
            field512.method2518(var4 >> 14 & 0x7FFF);
            field512.method2553(field631);
            field512.method2606(Statics.field241);
            field512.method2518(Statics.field85 + var1);
            field512.method2475(Statics.field1552 + var2);
        }
        if (var3 == 13) {
            class25 var26 = field509[var4];
            if (var26 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var26.field430[0], var26.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(150);
                field512.method2475(var4);
            }
        }
        if (var3 == 20) {
            boolean var27 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var27) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(200);
            field512.method2475(Statics.field85 + var1);
            field512.method2553(var4);
            field512.method2553(Statics.field1552 + var2);
        }
        if (var3 == 34) {
            field512.method2356(41);
            field512.method2475(var1);
            field512.method2518(var4);
            field512.method2507(var2);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 48) {
            class3 var29 = field594[var4];
            if (var29 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var29.field430[0], var29.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(78);
                field512.method2518(var4);
            }
        }
        if (var3 == 6) {
            method751(var1, var2, var4);
            field512.method2356(38);
            field512.method2475(Statics.field85 + var1);
            field512.method2519(Statics.field1552 + var2);
            field512.method2518(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 28) {
            field512.method2356(88);
            field512.method2606(var2);
            class158 var30 = class158.method667(var2);
            if (var30.field2680 != null && var30.field2680[0][0] == 5) {
                int var31 = var30.field2680[0][1];
                class159.field2703[var31] = 1 - class159.field2703[var31];
                method144(var31);
            }
        }
        if (var3 == 47) {
            class3 var32 = field594[var4];
            if (var32 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var32.field430[0], var32.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(111);
                field512.method2475(var4);
            }
        }
        if (var3 == 37) {
            field512.method2356(70);
            field512.method2553(var1);
            field512.method2518(var4);
            field512.method2529(var2);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 11) {
            class25 var33 = field509[var4];
            if (var33 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var33.field430[0], var33.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(244);
                field512.method2475(var4);
            }
        }
        if (var3 == 33) {
            field512.method2356(134);
            field512.method2475(var1);
            field512.method2553(var4);
            field512.method2527(var2);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 44) {
            class3 var34 = field594[var4];
            if (var34 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var34.field430[0], var34.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(203);
                field512.method2519(var4);
            }
        }
        if (var3 == 36) {
            field512.method2356(76);
            field512.method2475(var4);
            field512.method2606(var2);
            field512.method2475(var1);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 1005) {
            class158 var35 = class158.method667(var2);
            if (var35 == null || var35.field2687[var1] < 100000) {
                field512.method2356(160);
                field512.method2553(var4);
            } else {
                method2724(0, "", var35.field2687[var1] + " x " + class40.method730(var4).field994);
            }
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 5) {
            method751(var1, var2, var4);
            field512.method2356(186);
            field512.method2519(var4 >> 14 & 0x7FFF);
            field512.method2475(Statics.field1552 + var2);
            field512.method2519(Statics.field85 + var1);
        }
        if (var3 == 22) {
            boolean var36 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var36) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(241);
            field512.method2519(Statics.field1552 + var2);
            field512.method2519(Statics.field85 + var1);
            field512.method2475(var4);
        }
        if (var3 == 41) {
            field512.method2356(98);
            field512.method2606(var2);
            field512.method2553(var1);
            field512.method2475(var4);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 1003) {
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            class25 var38 = field509[var4];
            if (var38 != null) {
                class31 var39 = var38.field388;
                if (var39.field803 != null) {
                    var39 = var39.method634();
                }
                if (var39 != null) {
                    field512.method2356(194);
                    field512.method2553(var39.field811);
                }
            }
        }
        if (var3 == 17) {
            boolean var40 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var40) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(234);
            field512.method2518(var4);
            field512.method2553(Statics.field1552 + var2);
            field512.method2519(field631);
            field512.method2518(Statics.field85 + var1);
            field512.method2527(Statics.field241);
        }
        if (var3 == 1004) {
            field581 = class77.field1395;
            field582 = class77.field1404;
            field731 = 2;
            field583 = 0;
            field512.method2356(160);
            field512.method2553(var4);
        }
        if (var3 == 1 && method751(var1, var2, var4)) {
            field512.method2356(170);
            field512.method2475(Statics.field1552 + var2);
            field512.method2519(Statics.field8);
            field512.method2553(Statics.field2059);
            field512.method2606(Statics.field1266);
            field512.method2553(Statics.field85 + var1);
            field512.method2518(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 15) {
            class3 var42 = field594[var4];
            if (var42 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var42.field430[0], var42.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(163);
                field512.method2606(Statics.field241);
                field512.method2518(var4);
                field512.method2475(field631);
            }
        }
        if (var3 == 39) {
            field512.method2356(239);
            field512.method2553(var1);
            field512.method2507(var2);
            field512.method2475(var4);
            field529 = 0;
            Statics.field1662 = class158.method667(var2);
            field539 = var1;
        }
        if (var3 == 58) {
            field512.method2356(2);
            field512.method2553(field631);
            field512.method2529(Statics.field241);
            field512.method2606(var2);
            field512.method2518(var1);
        }
        if (var3 == 9) {
            class25 var43 = field509[var4];
            if (var43 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var43.field430[0], var43.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(93);
                field512.method2553(var4);
            }
        }
        if (var3 == 46) {
            class3 var44 = field594[var4];
            if (var44 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var44.field430[0], var44.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(30);
                field512.method2475(var4);
            }
        }
        if (var3 == 38) {
            Statics.method921();
            class158 var45 = class158.method667(var2);
            field628 = 1;
            Statics.field2059 = var1;
            Statics.field1266 = var2;
            Statics.field8 = var4;
            method42(var45);
            field629 = class2.method3257(16748608) + class40.method730(var4).field994 + class2.method3257(16777215);
            if (field629 == null) {
                field629 = "null";
            }
            return;
        }
        if (var3 == 50) {
            class3 var46 = field594[var4];
            if (var46 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var46.field430[0], var46.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(66);
                field512.method2553(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            String var47 = field623[arg0];
            class158 var48 = class158.method3104(var2, var1);
            if (var48 != null) {
                if (var48.field2671 != null) {
                    class1 var49 = new class1();
                    var49.field2 = var48;
                    var49.field16 = var4;
                    var49.field9 = var47;
                    var49.field1 = var48.field2671;
                    class26.method916(var49);
                }
                boolean var50 = true;
                if (var48.field2614 > 0) {
                    var50 = Statics.method51(var48);
                }
                if (var50) {
                    int var51 = method242(var48);
                    int var52 = var4 - 1;
                    boolean var53 = (var51 >> var52 + 1 & 0x1) != 0;
                    if (var53) {
                        if (var4 == 1) {
                            field512.method2356(49);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 2) {
                            field512.method2356(48);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 3) {
                            field512.method2356(32);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 4) {
                            field512.method2356(50);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 5) {
                            field512.method2356(216);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 6) {
                            field512.method2356(189);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 7) {
                            field512.method2356(40);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 8) {
                            field512.method2356(130);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 9) {
                            field512.method2356(105);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                        if (var4 == 10) {
                            field512.method2356(31);
                            field512.method2606(var2);
                            field512.method2475(var1);
                        }
                    }
                }
            }
        }
        if (var3 == 7) {
            class25 var54 = field509[var4];
            if (var54 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var54.field430[0], var54.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(191);
                field512.method2529(Statics.field1266);
                field512.method2518(Statics.field2059);
                field512.method2475(Statics.field8);
                field512.method2553(var4);
            }
        }
        if (var3 == 12) {
            class25 var55 = field509[var4];
            if (var55 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var55.field430[0], var55.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(108);
                field512.method2518(var4);
            }
        }
        if (var3 == 14) {
            class3 var56 = field594[var4];
            if (var56 != null) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var56.field430[0], var56.field463[0], false, 0, 0, 1, 1, 0, 2);
                field581 = class77.field1395;
                field582 = class77.field1404;
                field731 = 2;
                field583 = 0;
                field512.method2356(168);
                field512.method2606(Statics.field1266);
                field512.method2475(Statics.field8);
                field512.method2518(var4);
                field512.method2519(Statics.field2059);
            }
        }
        if (var3 == 3) {
            method751(var1, var2, var4);
            field512.method2356(218);
            field512.method2518(var4 >> 14 & 0x7FFF);
            field512.method2518(Statics.field85 + var1);
            field512.method2519(Statics.field1552 + var2);
        }
        if (var3 == 29) {
            field512.method2356(88);
            field512.method2606(var2);
            class158 var57 = class158.method667(var2);
            if (var57.field2680 != null && var57.field2680[0][0] == 5) {
                int var58 = var57.field2680[0][1];
                if (class159.field2703[var58] != var57.field2682[0]) {
                    class159.field2703[var58] = var57.field2682[0];
                    method144(var58);
                }
            }
        }
        if (field628 != 0) {
            field628 = 0;
            method42(class158.method667(Statics.field1266));
        }
        if (field679) {
            Statics.method921();
        }
        if (Statics.field1662 != null && field529 == 0) {
            method42(Statics.field1662);
        }
    }

    @ObfuscatedName("f.bc(ILjava/lang/String;I)V")
    public static void method114(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field630; var3++) {
            class3 var4 = field594[field596[var3]];
            if (var4 != null && var4.field40 != null && var4.field40.equalsIgnoreCase(arg1)) {
                method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var4.field430[0], var4.field463[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field512.method2356(203);
                    field512.method2519(field596[var3]);
                } else if (arg0 == 4) {
                    field512.method2356(111);
                    field512.method2475(field596[var3]);
                } else if (arg0 == 6) {
                    field512.method2356(252);
                    field512.method2475(field596[var3]);
                } else if (arg0 == 7) {
                    field512.method2356(66);
                    field512.method2553(field596[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method2724(0, "", class134.field2228 + arg1);
        }
    }

    @ObfuscatedName("aq.ce(IIII)V")
    public static void method791(int arg0, int arg1, int arg2) {
        class158 var3 = class158.method3104(arg0, arg1);
        if (var3 != null && var3.field2662 != null) {
            class1 var4 = new class1();
            var4.field2 = var3;
            var4.field1 = var3.field2662;
            class26.method916(var4);
        }
        field679 = true;
        Statics.field241 = arg0;
        field631 = arg1;
        Statics.field201 = arg2;
        method42(var3);
    }

    @ObfuscatedName("s.cg(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method162(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field652 || field558 >= 500) {
            return;
        }
        field515[field558] = arg0;
        field623[field558] = arg1;
        field620[field558] = arg2;
        field621[field558] = arg3;
        field503[field558] = arg4;
        field527[field558] = arg5;
        field558++;
    }

    @ObfuscatedName("t.cl(Lao;IIIS)V")
    public static final void method217(class31 arg0, int arg1, int arg2, int arg3) {
        if (field558 >= 400) {
            return;
        }
        if (arg0.field803 != null) {
            arg0 = arg0.method634();
        }
        if (arg0 == null || !arg0.field806) {
            return;
        }
        String var4 = arg0.field797;
        if (arg0.field790 != 0) {
            var4 = var4 + Statics.method164(arg0.field790, Statics.field2006.field42) + " " + class2.field28 + class134.field2235 + arg0.field790 + class2.field22;
        }
        if (field628 == 1) {
            method162(class134.field2229, field629 + " " + class2.field26 + " " + class2.method3257(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field679) {
            String[] var5 = arg0.field783;
            if (field701) {
                var5 = method2581(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class134.field2231)) {
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
                        method162(var5[var6], class2.method3257(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class134.field2231)) {
                        short var9 = 0;
                        if (arg0.field790 > Statics.field2006.field42) {
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
                        method162(var5[var8], class2.method3257(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method162(class134.field2230, class2.method3257(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field201 & 0x2) == 2) {
            method162(field706, field633 + " " + class2.field26 + " " + class2.method3257(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ez.cw(Lo;IIII)V")
    public static final void method2729(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2006 == arg0 || field558 >= 400) {
            return;
        }
        String var4;
        if (arg0.field39 == 0) {
            var4 = arg0.field40 + Statics.method164(arg0.field42, Statics.field2006.field42) + " " + class2.field28 + class134.field2235 + arg0.field42 + class2.field22;
        } else {
            var4 = arg0.field40 + " " + class2.field28 + class134.field2315 + arg0.field39 + class2.field22;
        }
        if (field628 == 1) {
            method162(class134.field2229, field629 + " " + class2.field26 + " " + class2.method3257(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field679) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field616[var5] != null) {
                    short var6 = 0;
                    if (field616[var5].equalsIgnoreCase(class134.field2231)) {
                        if (arg0.field42 > Statics.field2006.field42) {
                            var6 = 2000;
                        }
                        if (Statics.field2006.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field2006.field49 == arg0.field49) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field606[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field604[var5] + var6;
                    method162(field616[var5], class2.method3257(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field201 & 0x8) == 8) {
            method162(field706, field633 + " " + class2.field26 + " " + class2.method3257(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field558; var9++) {
            if (field620[var9] == 23) {
                field623[var9] = class2.method3257(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("db.ci(IIIIIIIIB)V")
    public static final void method2722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method2227(arg0)) {
            Statics.field1936 = null;
            method709(Statics.field2608[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1936 != null) {
                method709(Statics.field1936, -1412584499, arg1, arg2, arg3, arg4, Statics.field341, Statics.field95, arg7);
                Statics.field1936 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field678[var8] = true;
            }
        } else {
            field678[arg7] = true;
        }
    }

    @ObfuscatedName("ad.cj([Lfr;IIIIIIIII)V")
    public static final void method709(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1841(arg2, arg3, arg4, arg5);
        class104.method2177();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2696 == arg1 || arg1 == -1412584499 && field645 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field681[field676] = var10.field2589 + arg6;
                    field682[field676] = var10.field2590 + arg7;
                    field683[field676] = var10.field2585;
                    field624[field676] = var10.field2594;
                    var11 = ++field676 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2699 = var11;
                var10.field2700 = field481;
                if (!var10.field2583 || !method172(var10)) {
                    if (var10.field2614 > 0) {
                        int var12 = var10.field2614;
                        if (var12 == 324) {
                            if (field734 == -1) {
                                field734 = var10.field2603;
                                field735 = var10.field2609;
                            }
                            if (field733.field2726) {
                                var10.field2603 = field734;
                            } else {
                                var10.field2603 = field735;
                            }
                        } else if (var12 == 325) {
                            if (field734 == -1) {
                                field734 = var10.field2603;
                                field735 = var10.field2609;
                            }
                            if (field733.field2726) {
                                var10.field2603 = field735;
                            } else {
                                var10.field2603 = field734;
                            }
                        } else if (var12 == 327) {
                            var10.field2615 = 150;
                            var10.field2625 = (int) (Math.sin((double) field481 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2593 = 5;
                            var10.field2617 = 0;
                        } else if (var12 == 328) {
                            var10.field2615 = 150;
                            var10.field2625 = (int) (Math.sin((double) field481 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2593 = 5;
                            var10.field2617 = 1;
                        }
                    }
                    int var13 = var10.field2589 + arg6;
                    int var14 = var10.field2590 + arg7;
                    int var15 = var10.field2624;
                    if (field645 == var10) {
                        if (arg1 != -1412584499 && !var10.field2649) {
                            Statics.field1936 = arg0;
                            Statics.field341 = arg6;
                            Statics.field95 = arg7;
                            continue;
                        }
                        if (field508 && field600) {
                            int var16 = class77.field1397;
                            int var17 = class77.field1391;
                            int var18 = var16 - field575;
                            int var19 = var17 - field648;
                            if (var18 < field615) {
                                var18 = field615;
                            }
                            if (var10.field2585 + var18 > field615 + field646.field2585) {
                                var18 = field615 + field646.field2585 - var10.field2585;
                            }
                            if (var19 < field475) {
                                var19 = field475;
                            }
                            if (var10.field2594 + var19 > field475 + field646.field2594) {
                                var19 = field475 + field646.field2594 - var10.field2594;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2649) {
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
                        int var26 = var10.field2585 + var13;
                        int var27 = var10.field2594 + var14;
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
                        int var30 = var10.field2585 + var13;
                        int var31 = var10.field2594 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2583 || var20 < var22 && var21 < var23) {
                        if (var10.field2614 != 0) {
                            if (var10.field2614 == 1337) {
                                field715 = var13;
                                field625 = var14;
                                method141(var13, var14, var10.field2585, var10.field2594);
                                class89.method1841(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2614 == 1338) {
                                method2340();
                                class89.method1841(var13, var14, Statics.field24.field1485 + var13, Statics.field24.field1481 + var14);
                                if (field709 == 2 || field709 == 5) {
                                    class89.method1858(var13 + 25, var14 + 5, 0, Statics.field1384, Statics.field2015);
                                } else {
                                    int var32 = field660 + field561 & 0x7FF;
                                    int var33 = Statics.field2006.field455 / 32 + 48;
                                    int var34 = 464 - Statics.field2006.field411 / 32;
                                    Statics.field248.method1741(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field511 + 256, Statics.field1384, Statics.field2015);
                                    for (int var35 = 0; var35 < field703; var35++) {
                                        int var36 = field704[var35] * 4 + 2 - Statics.field2006.field455 / 32;
                                        int var37 = field705[var35] * 4 + 2 - Statics.field2006.field411 / 32;
                                        method1292(var13, var14, var36, var37, field654[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class177 var40 = field534[Statics.field231][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field2006.field455 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field2006.field411 / 32;
                                                method1292(var13, var14, var41, var42, Statics.field1468[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field510; var43++) {
                                        class25 var44 = field509[field657[var43]];
                                        if (var44 != null && var44.method36()) {
                                            class31 var45 = var44.field388;
                                            if (var45 != null && var45.field803 != null) {
                                                var45 = var45.method634();
                                            }
                                            if (var45 != null && var45.field794 && var45.field806) {
                                                int var46 = var44.field455 / 32 - Statics.field2006.field455 / 32;
                                                int var47 = var44.field411 / 32 - Statics.field2006.field411 / 32;
                                                method1292(var13, var14, var46, var47, Statics.field1468[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field630; var48++) {
                                        class3 var49 = field594[field596[var48]];
                                        if (var49 != null && var49.method36()) {
                                            int var50 = var49.field455 / 32 - Statics.field2006.field455 / 32;
                                            int var51 = var49.field411 / 32 - Statics.field2006.field411 / 32;
                                            boolean var52 = false;
                                            if (method1614(var49.field40)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            if (Statics.field2006.field49 != 0 && var49.field49 != 0 && Statics.field2006.field49 == var49.field49) {
                                                var53 = true;
                                            }
                                            if (var52) {
                                                method1292(var13, var14, var50, var51, Statics.field1468[3]);
                                            } else if (var53) {
                                                method1292(var13, var14, var50, var51, Statics.field1468[4]);
                                            } else {
                                                method1292(var13, var14, var50, var51, Statics.field1468[2]);
                                            }
                                        }
                                    }
                                    if (field490 != 0 && field481 % 20 < 10) {
                                        if (field490 == 1 && field491 >= 0 && field491 < field509.length) {
                                            class25 var54 = field509[field491];
                                            if (var54 != null) {
                                                int var55 = var54.field455 / 32 - Statics.field2006.field455 / 32;
                                                int var56 = var54.field411 / 32 - Statics.field2006.field411 / 32;
                                                method1624(var13, var14, var55, var56, Statics.field2456[1]);
                                            }
                                        }
                                        if (field490 == 2) {
                                            int var57 = field595 * 4 - Statics.field85 * 4 + 2 - Statics.field2006.field455 / 32;
                                            int var58 = field494 * 4 - Statics.field1552 * 4 + 2 - Statics.field2006.field411 / 32;
                                            method1624(var13, var14, var57, var58, Statics.field2456[1]);
                                        }
                                        if (field490 == 10 && field555 >= 0 && field555 < field594.length) {
                                            class3 var59 = field594[field555];
                                            if (var59 != null) {
                                                int var60 = var59.field455 / 32 - Statics.field2006.field455 / 32;
                                                int var61 = var59.field411 / 32 - Statics.field2006.field411 / 32;
                                                method1624(var13, var14, var60, var61, Statics.field2456[1]);
                                            }
                                        }
                                    }
                                    if (field707 != 0) {
                                        int var62 = field707 * 4 + 2 - Statics.field2006.field455 / 32;
                                        int var63 = field708 * 4 + 2 - Statics.field2006.field411 / 32;
                                        method1292(var13, var14, var62, var63, Statics.field2456[0]);
                                    }
                                    class89.method1847(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field709 < 3) {
                                    Statics.field240.method1741(var13, var14, 33, 33, 25, 25, field561, 256, Statics.field2033, Statics.field612);
                                } else {
                                    class89.method1858(var13, var14, 0, Statics.field2033, Statics.field612);
                                }
                                if (field680[var11]) {
                                    Statics.field24.method1830(var13, var14);
                                }
                                field584[var11] = true;
                                class89.method1841(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var64 = class77.field1397;
                        int var65 = class77.field1391;
                        if (!field652 && var64 >= var20 && var65 >= var21 && var64 < var22 && var65 < var23) {
                            int var66 = var64 - var13;
                            int var67 = var65 - var14;
                            if (var10.field2587 == 1) {
                                method162(var10.field2606, "", 24, 0, 0, var10.field2584);
                            }
                            if (var10.field2587 == 2 && !field679) {
                                String var68 = method47(var10);
                                if (var68 != null) {
                                    method162(var68, class2.method3257(65280) + var10.field2684, 25, 0, -1, var10.field2584);
                                }
                            }
                            if (var10.field2587 == 3) {
                                method162(class134.field2254, "", 26, 0, 0, var10.field2584);
                            }
                            if (var10.field2587 == 4) {
                                method162(var10.field2606, "", 28, 0, 0, var10.field2584);
                            }
                            if (var10.field2587 == 5) {
                                method162(var10.field2606, "", 29, 0, 0, var10.field2584);
                            }
                            if (var10.field2587 == 6 && field638 == null) {
                                method162(var10.field2606, "", 30, 0, -1, var10.field2584);
                            }
                            if (var10.field2586 == 2) {
                                int var69 = 0;
                                for (int var70 = 0; var70 < var10.field2594; var70++) {
                                    for (int var71 = 0; var71 < var10.field2585; var71++) {
                                        int var72 = (var10.field2579 + 32) * var71;
                                        int var73 = (var10.field2638 + 32) * var70;
                                        if (var69 < 20) {
                                            var72 += var10.field2639[var69];
                                            var73 += var10.field2640[var69];
                                        }
                                        if (var66 >= var72 && var67 >= var73 && var66 < var72 + 32 && var67 < var73 + 32) {
                                            field590 = var69;
                                            Statics.field276 = var10;
                                            if (var10.field2686[var69] > 0) {
                                                class40 var74 = class40.method730(var10.field2686[var69] - 1);
                                                if (field628 == 1 && class162.method2968(method242(var10))) {
                                                    if (Statics.field1266 != var10.field2584 || Statics.field2059 != var69) {
                                                        method162(class134.field2229, field629 + " " + class2.field26 + " " + class2.method3257(16748608) + var74.field994, 31, var74.field1027, var69, var10.field2584);
                                                    }
                                                } else if (!field679 || !class162.method2968(method242(var10))) {
                                                    String[] var75 = var74.field988;
                                                    if (field701) {
                                                        var75 = method2581(var75);
                                                    }
                                                    if (class162.method2968(method242(var10))) {
                                                        for (int var76 = 4; var76 >= 3; var76--) {
                                                            if (var75 != null && var75[var76] != null) {
                                                                byte var77;
                                                                if (var76 == 3) {
                                                                    var77 = 36;
                                                                } else {
                                                                    var77 = 37;
                                                                }
                                                                method162(var75[var76], class2.method3257(16748608) + var74.field994, var77, var74.field1027, var69, var10.field2584);
                                                            } else if (var76 == 4) {
                                                                method162(class134.field2092, class2.method3257(16748608) + var74.field994, 37, var74.field1027, var69, var10.field2584);
                                                            }
                                                        }
                                                    }
                                                    int var78 = method242(var10);
                                                    boolean var79 = (var78 >> 31 & 0x1) != 0;
                                                    if (var79) {
                                                        method162(class134.field2229, class2.method3257(16748608) + var74.field994, 38, var74.field1027, var69, var10.field2584);
                                                    }
                                                    class162 var10000 = (class162) null;
                                                    if (class162.method2968(method242(var10)) && var75 != null) {
                                                        for (int var80 = 2; var80 >= 0; var80--) {
                                                            if (var75[var80] != null) {
                                                                byte var81 = 0;
                                                                if (var80 == 0) {
                                                                    var81 = 33;
                                                                }
                                                                if (var80 == 1) {
                                                                    var81 = 34;
                                                                }
                                                                if (var80 == 2) {
                                                                    var81 = 35;
                                                                }
                                                                method162(var75[var80], class2.method3257(16748608) + var74.field994, var81, var74.field1027, var69, var10.field2584);
                                                            }
                                                        }
                                                    }
                                                    String[] var82 = var10.field2642;
                                                    if (field701) {
                                                        var82 = method2581(var82);
                                                    }
                                                    if (var82 != null) {
                                                        for (int var83 = 4; var83 >= 0; var83--) {
                                                            if (var82[var83] != null) {
                                                                byte var84 = 0;
                                                                if (var83 == 0) {
                                                                    var84 = 39;
                                                                }
                                                                if (var83 == 1) {
                                                                    var84 = 40;
                                                                }
                                                                if (var83 == 2) {
                                                                    var84 = 41;
                                                                }
                                                                if (var83 == 3) {
                                                                    var84 = 42;
                                                                }
                                                                if (var83 == 4) {
                                                                    var84 = 43;
                                                                }
                                                                method162(var82[var83], class2.method3257(16748608) + var74.field994, var84, var74.field1027, var69, var10.field2584);
                                                            }
                                                        }
                                                    }
                                                    method162(class134.field2230, class2.method3257(16748608) + var74.field994, 1005, var74.field1027, var69, var10.field2584);
                                                } else if ((Statics.field201 & 0x10) == 16) {
                                                    method162(field706, field633 + " " + class2.field26 + " " + class2.method3257(16748608) + var74.field994, 32, var74.field1027, var69, var10.field2584);
                                                }
                                            }
                                        }
                                        var69++;
                                    }
                                }
                            }
                            if (var10.field2583) {
                                if (field679) {
                                    int var85 = method242(var10);
                                    boolean var86 = (var85 >> 21 & 0x1) != 0;
                                    if (var86 && (Statics.field201 & 0x20) == 32) {
                                        method162(field706, field633 + " " + class2.field26 + " " + var10.field2644, 58, 0, var10.field2678, var10.field2584);
                                    }
                                } else {
                                    for (int var87 = 9; var87 >= 5; var87--) {
                                        String var88 = method7(var10, var87);
                                        if (var88 != null) {
                                            method162(var88, var10.field2644, 1007, var87 + 1, var10.field2678, var10.field2584);
                                        }
                                    }
                                    String var89 = method47(var10);
                                    if (var89 != null) {
                                        method162(var89, var10.field2644, 25, 0, var10.field2678, var10.field2584);
                                    }
                                    for (int var90 = 4; var90 >= 0; var90--) {
                                        String var91 = method7(var10, var90);
                                        if (var91 != null) {
                                            method162(var91, var10.field2644, 57, var90 + 1, var10.field2678, var10.field2584);
                                        }
                                    }
                                    if (class162.method666(method242(var10))) {
                                        method162(class134.field2094, "", 30, 0, var10.field2678, var10.field2584);
                                    }
                                }
                            }
                        }
                        if (var10.field2586 == 0) {
                            if (!var10.field2583 && method172(var10) && Statics.field183 != var10) {
                                continue;
                            }
                            if (!var10.field2583) {
                                if (var10.field2598 > var10.field2600 - var10.field2594) {
                                    var10.field2598 = var10.field2600 - var10.field2594;
                                }
                                if (var10.field2598 < 0) {
                                    var10.field2598 = 0;
                                }
                            }
                            method709(arg0, var10.field2584, var20, var21, var22, var23, var13 - var10.field2597, var14 - var10.field2598, var11);
                            if (var10.field2692 != null) {
                                method709(var10.field2692, var10.field2584, var20, var21, var22, var23, var13 - var10.field2597, var14 - var10.field2598, var11);
                            }
                            class4 var92 = (class4) field635.method3312((long) var10.field2584);
                            if (var92 != null) {
                                if (var92.field58 == 0 && class77.field1397 >= var20 && class77.field1391 >= var21 && class77.field1397 < var22 && class77.field1391 < var23 && !field652 && !field643) {
                                    field515[0] = class134.field2226;
                                    field623[0] = "";
                                    field620[0] = 1006;
                                    field558 = 1;
                                }
                                method2722(var92.field67, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class89.method1841(arg2, arg3, arg4, arg5);
                            class104.method2177();
                        }
                        if (field680[var11] || field639 > 1) {
                            if (var10.field2586 == 0 && !var10.field2583 && var10.field2600 > var10.field2594) {
                                int var93 = var10.field2585 + var13;
                                int var94 = var10.field2598;
                                int var95 = var10.field2594;
                                int var96 = var10.field2600;
                                Statics.field291[0].method1830(var93, var14);
                                Statics.field291[1].method1830(var93, var14 + var95 - 16);
                                class89.method1847(var93, var14 + 16, 16, var95 - 32, field554);
                                int var97 = (var95 - 32) * var95 / var96;
                                if (var97 < 8) {
                                    var97 = 8;
                                }
                                int var98 = (var95 - 32 - var97) * var94 / (var96 - var95);
                                class89.method1847(var93, var14 + 16 + var98, 16, var97, field542);
                                class89.method1853(var93, var14 + 16 + var98, var97, field605);
                                class89.method1853(var93 + 1, var14 + 16 + var98, var97, field605);
                                class89.method1851(var93, var14 + 16 + var98, 16, field605);
                                class89.method1851(var93, var14 + 17 + var98, 16, field605);
                                class89.method1853(var93 + 15, var14 + 16 + var98, var97, field556);
                                class89.method1853(var93 + 14, var14 + 17 + var98, var97 - 1, field556);
                                class89.method1851(var93, var14 + 15 + var98 + var97, 16, field556);
                                class89.method1851(var93 + 1, var14 + 14 + var98 + var97, 15, field556);
                            }
                            if (var10.field2586 != 1) {
                                if (var10.field2586 == 2) {
                                    int var99 = 0;
                                    for (int var100 = 0; var100 < var10.field2594; var100++) {
                                        for (int var101 = 0; var101 < var10.field2585; var101++) {
                                            int var102 = (var10.field2579 + 32) * var101 + var13;
                                            int var103 = (var10.field2638 + 32) * var100 + var14;
                                            if (var99 < 20) {
                                                var102 += var10.field2639[var99];
                                                var103 += var10.field2640[var99];
                                            }
                                            if (var10.field2686[var99] > 0) {
                                                boolean var104 = false;
                                                boolean var105 = false;
                                                int var106 = var10.field2686[var99] - 1;
                                                if (var102 + 32 > arg2 && var102 < arg4 && var103 + 32 > arg3 && var103 < arg5 || Statics.field752 == var10 && field587 == var99) {
                                                    class86 var107;
                                                    if (field628 == 1 && Statics.field2059 == var99 && Statics.field1266 == var10.field2584) {
                                                        var107 = class40.method9(var106, var10.field2687[var99], 2, 0, false);
                                                    } else {
                                                        var107 = class40.method9(var106, var10.field2687[var99], 1, 3153952, false);
                                                    }
                                                    if (var107 == null) {
                                                        method42(var10);
                                                    } else if (Statics.field752 == var10 && field587 == var99) {
                                                        int var108 = class77.field1397 - field588;
                                                        int var109 = class77.field1391 - field659;
                                                        if (var108 < 5 && var108 > -5) {
                                                            var108 = 0;
                                                        }
                                                        if (var109 < 5 && var109 > -5) {
                                                            var109 = 0;
                                                        }
                                                        if (field668 < 5) {
                                                            var108 = 0;
                                                            var109 = 0;
                                                        }
                                                        var107.method1737(var102 + var108, var103 + var109, 128);
                                                        if (arg1 != -1) {
                                                            class158 var110 = arg0[arg1 & 0xFFFF];
                                                            if (var103 + var109 < class89.field1492 && var110.field2598 > 0) {
                                                                int var111 = field601 * (class89.field1492 - var103 - var109) / 3;
                                                                if (var111 > field601 * 10) {
                                                                    var111 = field601 * 10;
                                                                }
                                                                if (var111 > var110.field2598) {
                                                                    var111 = var110.field2598;
                                                                }
                                                                var110.field2598 -= var111;
                                                                field659 += var111;
                                                                method42(var110);
                                                            }
                                                            if (var103 + var109 + 32 > class89.field1495 && var110.field2598 < var110.field2600 - var110.field2594) {
                                                                int var112 = field601 * (var103 + var109 + 32 - class89.field1495) / 3;
                                                                if (var112 > field601 * 10) {
                                                                    var112 = field601 * 10;
                                                                }
                                                                if (var112 > var110.field2600 - var110.field2594 - var110.field2598) {
                                                                    var112 = var110.field2600 - var110.field2594 - var110.field2598;
                                                                }
                                                                var110.field2598 += var112;
                                                                field659 -= var112;
                                                                method42(var110);
                                                            }
                                                        }
                                                    } else if (Statics.field1662 == var10 && field539 == var99) {
                                                        var107.method1737(var102, var103, 128);
                                                    } else {
                                                        var107.method1780(var102, var103);
                                                    }
                                                }
                                            } else if (var10.field2619 != null && var99 < 20) {
                                                class86 var113 = var10.method3123(var99);
                                                if (var113 != null) {
                                                    var113.method1780(var102, var103);
                                                } else if (class158.field2588) {
                                                    method42(var10);
                                                }
                                            }
                                            var99++;
                                        }
                                    }
                                } else if (var10.field2586 == 3) {
                                    int var114;
                                    if (method212(var10)) {
                                        var114 = var10.field2602;
                                        if (Statics.field183 == var10 && var10.field2604 != 0) {
                                            var114 = var10.field2604;
                                        }
                                    } else {
                                        var114 = var10.field2672;
                                        if (Statics.field183 == var10 && var10.field2635 != 0) {
                                            var114 = var10.field2635;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2622) {
                                            class89.method1847(var13, var14, var10.field2585, var10.field2594, var114);
                                        } else {
                                            class89.method1849(var13, var14, var10.field2585, var10.field2594, var114);
                                        }
                                    } else if (var10.field2622) {
                                        class89.method1874(var13, var14, var10.field2585, var10.field2594, var114, 256 - (var15 & 0xFF));
                                    } else {
                                        class89.method1850(var13, var14, var10.field2585, var10.field2594, var114, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2586 == 4) {
                                    class183 var115 = var10.method3122();
                                    if (var115 != null) {
                                        String var116 = var10.field2691;
                                        int var117;
                                        if (method212(var10)) {
                                            var117 = var10.field2602;
                                            if (Statics.field183 == var10 && var10.field2604 != 0) {
                                                var117 = var10.field2604;
                                            }
                                            if (var10.field2665.length() > 0) {
                                                var116 = var10.field2665;
                                            }
                                        } else {
                                            var117 = var10.field2672;
                                            if (Statics.field183 == var10 && var10.field2635 != 0) {
                                                var117 = var10.field2635;
                                            }
                                        }
                                        if (var10.field2583 && var10.field2688 != -1) {
                                            class40 var118 = class40.method730(var10.field2688);
                                            var116 = var118.field994;
                                            if (var116 == null) {
                                                var116 = "null";
                                            }
                                            if ((var118.field1005 == 1 || var10.field2689 != 1) && var10.field2689 != -1) {
                                                var116 = class2.method3257(16748608) + var116 + class2.field25 + " " + 'x' + method140(var10.field2689);
                                            }
                                        }
                                        if (field638 == var10) {
                                            class134 var177 = (class134) null;
                                            var116 = class134.field2237;
                                            var117 = var10.field2672;
                                        }
                                        if (!var10.field2583) {
                                            var116 = method2869(var116, var10);
                                        }
                                        var115.method3405(var116, var13, var14, var10.field2585, var10.field2594, var117, var10.field2636 ? 0 : -1, var10.field2631, var10.field2581, var10.field2637);
                                    } else if (class158.field2588) {
                                        method42(var10);
                                    }
                                } else if (var10.field2586 == 5) {
                                    if (var10.field2583) {
                                        class86 var120;
                                        if (var10.field2688 == -1) {
                                            var120 = var10.method3121(false);
                                        } else {
                                            var120 = class40.method9(var10.field2688, var10.field2689, var10.field2632, var10.field2685, false);
                                        }
                                        if (var120 != null) {
                                            int var121 = var120.field1478;
                                            int var122 = var120.field1474;
                                            if (var10.field2611) {
                                                class89.method1842(var13, var14, var10.field2585 + var13, var10.field2594 + var14);
                                                int var123 = (var10.field2585 + (var121 - 1)) / var121;
                                                int var124 = (var10.field2594 + (var122 - 1)) / var122;
                                                for (int var125 = 0; var125 < var123; var125++) {
                                                    for (int var126 = 0; var126 < var124; var126++) {
                                                        if (var10.field2610 != 0) {
                                                            var120.method1743(var121 / 2 + var121 * var125 + var13, var122 / 2 + var122 * var126 + var14, var10.field2610, 4096);
                                                        } else if (var15 == 0) {
                                                            var120.method1780(var121 * var125 + var13, var122 * var126 + var14);
                                                        } else {
                                                            var120.method1737(var121 * var125 + var13, var122 * var126 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1841(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var127 = var10.field2585 * 4096 / var121;
                                                if (var10.field2610 != 0) {
                                                    var120.method1743(var10.field2585 / 2 + var13, var10.field2594 / 2 + var14, var10.field2610, var127);
                                                } else if (var15 != 0) {
                                                    var120.method1739(var13, var14, var10.field2585, var10.field2594, 256 - (var15 & 0xFF));
                                                } else if (var10.field2585 == var121 && var10.field2594 == var122) {
                                                    var120.method1780(var13, var14);
                                                } else {
                                                    var120.method1733(var13, var14, var10.field2585, var10.field2594);
                                                }
                                            }
                                        } else if (class158.field2588) {
                                            method42(var10);
                                        }
                                    } else {
                                        class86 var119 = var10.method3121(method212(var10));
                                        if (var119 != null) {
                                            var119.method1780(var13, var14);
                                        } else if (class158.field2588) {
                                            method42(var10);
                                        }
                                    }
                                } else if (var10.field2586 == 6) {
                                    boolean var128 = method212(var10);
                                    int var129;
                                    if (var128) {
                                        var129 = var10.field2621;
                                    } else {
                                        var129 = var10.field2620;
                                    }
                                    class112 var130 = null;
                                    int var131 = 0;
                                    if (var10.field2688 != -1) {
                                        class40 var132 = class40.method730(var10.field2688);
                                        if (var132 != null) {
                                            class40 var133 = var132.method862(var10.field2689);
                                            var130 = var133.method873(1);
                                            if (var130 == null) {
                                                method42(var10);
                                            } else {
                                                var130.method2317();
                                                var131 = var130.field1550 / 2;
                                            }
                                        }
                                    } else if (var10.field2593 == 5) {
                                        if (var10.field2617 == 0) {
                                            var130 = field733.method3187((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var130 = Statics.field2006.method21();
                                        }
                                    } else if (var129 == -1) {
                                        var130 = var10.method3138((class34) null, -1, var128, Statics.field2006.field35);
                                        if (var130 == null && class158.field2588) {
                                            method42(var10);
                                        }
                                    } else {
                                        class34 var134 = class34.method160(var129);
                                        var130 = var10.method3138(var134, var10.field2690, var128, Statics.field2006.field35);
                                        if (var130 == null && class158.field2588) {
                                            method42(var10);
                                        }
                                    }
                                    class104.method2164(var10.field2585 / 2 + var13, var10.field2594 / 2 + var14);
                                    int var135 = var10.field2652 * class104.field1790[var10.field2615] >> 16;
                                    int var136 = var10.field2652 * class104.field1791[var10.field2615] >> 16;
                                    if (var130 != null) {
                                        if (var10.field2583) {
                                            var130.method2317();
                                            if (var10.field2629) {
                                                var130.method2283(0, var10.field2625, var10.field2626, var10.field2615, var10.field2580, var10.field2623 + var131 + var135, var10.field2623 + var136, var10.field2652);
                                            } else {
                                                var130.method2267(0, var10.field2625, var10.field2626, var10.field2615, var10.field2580, var10.field2623 + var131 + var135, var10.field2623 + var136);
                                            }
                                        } else {
                                            var130.method2267(0, var10.field2625, 0, var10.field2615, 0, var135, var136);
                                        }
                                    }
                                    class104.method2217();
                                } else {
                                    if (var10.field2586 == 7) {
                                        class183 var137 = var10.method3122();
                                        if (var137 == null) {
                                            if (class158.field2588) {
                                                method42(var10);
                                            }
                                            continue;
                                        }
                                        int var138 = 0;
                                        for (int var139 = 0; var139 < var10.field2594; var139++) {
                                            for (int var140 = 0; var140 < var10.field2585; var140++) {
                                                if (var10.field2686[var138] > 0) {
                                                    class40 var141 = class40.method730(var10.field2686[var138] - 1);
                                                    String var142;
                                                    if (var141.field1005 != 1 && var10.field2687[var138] == 1) {
                                                        var142 = class2.method3257(16748608) + var141.field994 + class2.field25;
                                                    } else {
                                                        var142 = class2.method3257(16748608) + var141.field994 + class2.field25 + " " + 'x' + method140(var10.field2687[var138]);
                                                    }
                                                    int var143 = (var10.field2579 + 115) * var140 + var13;
                                                    int var144 = (var10.field2638 + 12) * var139 + var14;
                                                    if (var10.field2631 == 0) {
                                                        var137.method3402(var142, var143, var144, var10.field2672, var10.field2636 ? 0 : -1);
                                                    } else if (var10.field2631 == 1) {
                                                        var137.method3404(var142, var10.field2585 / 2 + var143, var144, var10.field2672, var10.field2636 ? 0 : -1);
                                                    } else {
                                                        var137.method3470(var142, var10.field2585 + var143 - 1, var144, var10.field2672, var10.field2636 ? 0 : -1);
                                                    }
                                                }
                                                var138++;
                                            }
                                        }
                                    }
                                    if (var10.field2586 == 8 && Statics.field1758 == var10 && field627 == field626) {
                                        int var145 = 0;
                                        int var146 = 0;
                                        class183 var147 = Statics.field921;
                                        String var148 = var10.field2691;
                                        String var149 = method2869(var148, var10);
                                        while (var149.length() > 0) {
                                            int var150 = var149.indexOf(class2.field30);
                                            String var151;
                                            if (var150 == -1) {
                                                var151 = var149;
                                                var149 = "";
                                            } else {
                                                var151 = var149.substring(0, var150);
                                                var149 = var149.substring(var150 + 4);
                                            }
                                            int var152 = var147.method3397(var151);
                                            if (var152 > var145) {
                                                var145 = var152;
                                            }
                                            var146 += var147.field2841 + 1;
                                        }
                                        var145 += 6;
                                        var146 += 7;
                                        int var153 = var10.field2585 + var13 - 5 - var145;
                                        int var154 = var10.field2594 + var14 + 5;
                                        if (var153 < var13 + 5) {
                                            var153 = var13 + 5;
                                        }
                                        if (var145 + var153 > arg4) {
                                            var153 = arg4 - var145;
                                        }
                                        if (var146 + var154 > arg5) {
                                            var154 = arg5 - var146;
                                        }
                                        class89.method1847(var153, var154, var145, var146, 16777120);
                                        class89.method1849(var153, var154, var145, var146, 0);
                                        String var155 = var10.field2691;
                                        int var156 = var147.field2841 + var154 + 2;
                                        String var157 = method2869(var155, var10);
                                        while (var157.length() > 0) {
                                            int var158 = var157.indexOf(class2.field30);
                                            String var159;
                                            if (var158 == -1) {
                                                var159 = var157;
                                                var157 = "";
                                            } else {
                                                var159 = var157.substring(0, var158);
                                                var157 = var157.substring(var158 + 4);
                                            }
                                            var147.method3402(var159, var153 + 3, var156, 0, -1);
                                            var156 += var147.field2841 + 1;
                                        }
                                    }
                                    if (var10.field2586 == 9) {
                                        if (var10.field2582 == 1) {
                                            class89.method1846(var13, var14, var10.field2585 + var13, var10.field2594 + var14, var10.field2672);
                                        } else {
                                            int var160 = var10.field2585 >= 0 ? var10.field2585 : -var10.field2585;
                                            int var161 = var10.field2594 >= 0 ? var10.field2594 : -var10.field2594;
                                            int var162 = var160;
                                            if (var160 < var161) {
                                                var162 = var161;
                                            }
                                            if (var162 != 0) {
                                                int var163 = (var10.field2585 << 16) / var162;
                                                int var164 = (var10.field2594 << 16) / var162;
                                                if (var164 <= var163) {
                                                    var163 = -var163;
                                                } else {
                                                    var164 = -var164;
                                                }
                                                int var165 = var10.field2582 * var164 >> 17;
                                                int var166 = var10.field2582 * var164 + 1 >> 17;
                                                int var167 = var10.field2582 * var163 >> 17;
                                                int var168 = var10.field2582 * var163 + 1 >> 17;
                                                int var169 = var13 + var165;
                                                int var170 = var13 - var166;
                                                int var171 = var10.field2585 + var13 - var166;
                                                int var172 = var10.field2585 + var13 + var165;
                                                int var173 = var14 + var167;
                                                int var174 = var14 - var168;
                                                int var175 = var10.field2594 + var14 - var168;
                                                int var176 = var10.field2594 + var14 + var167;
                                                class104.method2172(var169, var170, var171);
                                                class104.method2192(var173, var174, var175, var169, var170, var171, var10.field2672);
                                                class104.method2172(var169, var171, var172);
                                                class104.method2192(var173, var175, var176, var169, var171, var172, var10.field2672);
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

    @ObfuscatedName("ej.cu(Ljava/lang/String;Lfr;I)Ljava/lang/String;")
    public static String method2869(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method126(arg1, var2 - 1);
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
                if (Statics.field1441 != null) {
                    var8 = class147.method2351(Statics.field1441.field1415);
                    if (Statics.field1441.field1412 != null) {
                        var8 = (String) Statics.field1441.field1412;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.co(IB)Ljava/lang/String;")
    public static final String method140(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3257(65408) + var1.substring(0, var1.length() - 8) + class134.field2240 + " " + class2.field28 + var1 + class2.field22 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method3257(16777215) + var1.substring(0, var1.length() - 4) + class134.field2242 + " " + class2.field28 + var1 + class2.field22 + class2.field25;
        } else {
            return " " + class2.method3257(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("y.cc(Lfr;B)Z")
    public static final boolean method212(class158 arg0) {
        if (arg0.field2681 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2681.length; var1++) {
            int var2 = method126(arg0, var1);
            int var3 = arg0.field2682[var1];
            if (arg0.field2681[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2681[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2681[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.cs(Lfr;II)I")
    public static final int method126(class158 arg0, int arg1) {
        if (arg0.field2680 == null || arg1 >= arg0.field2680.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2680[arg1];
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
                    var7 = field492[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field613[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field614[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method667(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method730(var12).field1007 || field476)) {
                        for (int var13 = 0; var13 < var11.field2686.length; var13++) {
                            if (var12 + 1 == var11.field2686[var13]) {
                                var7 += var11.field2687[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2703[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2051[field613[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2703[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2006.field42;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2047[var14]) {
                            var7 += field613[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method667(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method730(var18).field1007 || field476)) {
                        for (int var19 = 0; var19 < var17.field2686.length; var19++) {
                            if (var18 + 1 == var17.field2686[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field480;
                }
                if (var6 == 12) {
                    var7 = field640;
                }
                if (var6 == 13) {
                    int var20 = class159.field2703[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method1349(var22);
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
                    var7 = (Statics.field2006.field455 >> 7) + Statics.field85;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2006.field411 >> 7) + Statics.field1552;
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

    @ObfuscatedName("e.cb(IIIIIIII)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class158.method2227(arg0)) {
            method166(Statics.field2608[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("e.cy([Lfr;IIIIIIII)V")
    public static final void method166(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2583 || var9.field2586 == 0 || var9.field2595 || method242(var9) != 0 || field646 == var9) && var9.field2696 == arg1 && (!var9.field2583 || !method172(var9))) {
                int var10 = var9.field2589 + arg6;
                int var11 = var9.field2590 + arg7;
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
                    int var18 = var9.field2585 + var10;
                    int var19 = var9.field2594 + var11;
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
                    int var22 = var9.field2585 + var10;
                    int var23 = var9.field2594 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field645 == var9) {
                    field653 = true;
                    field552 = var10;
                    field549 = var11;
                }
                if (!var9.field2583 || var12 < var14 && var13 < var15) {
                    if (var9.field2614 == 1337) {
                        method42(var9);
                    } else if (var9.field2614 != 1338) {
                        if (var9.field2586 == 0) {
                            if (!var9.field2583 && method172(var9) && Statics.field183 != var9) {
                                continue;
                            }
                            method166(arg0, var9.field2584, var12, var13, var14, var15, var10 - var9.field2597, var11 - var9.field2598);
                            if (var9.field2692 != null) {
                                method166(var9.field2692, var9.field2584, var12, var13, var14, var15, var10 - var9.field2597, var11 - var9.field2598);
                            }
                            class4 var36 = (class4) field635.method3312((long) var9.field2584);
                            if (var36 != null) {
                                method165(var36.field67, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2583) {
                            boolean var37;
                            if (class77.field1397 >= var12 && class77.field1391 >= var13 && class77.field1397 < var14 && class77.field1391 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if (class77.field1390 == 1 && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if (class77.field1402 == 1 && class77.field1395 >= var12 && class77.field1404 >= var13 && class77.field1395 < var14 && class77.field1404 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                int var40 = class77.field1395 - var10;
                                int var41 = class77.field1404 - var11;
                                if (field645 == null && !field652 && var9 != null && method1540(var9) != null) {
                                    field645 = var9;
                                    field646 = method1540(var9);
                                    field575 = var40;
                                    field648 = var41;
                                    Statics.field2389 = 0;
                                    field508 = false;
                                }
                            }
                            if (field645 != null && field645 != var9 && var37 && class162.method1304(method242(var9))) {
                                field493 = var9;
                            }
                            if (field646 == var9) {
                                field600 = true;
                                field615 = var10;
                                field475 = var11;
                            }
                            if (var9.field2595) {
                                if (var37 && field670 != 0 && var9.field2645 != null) {
                                    class1 var42 = new class1();
                                    var42.field2 = var9;
                                    var42.field4 = field670;
                                    var42.field1 = var9.field2645;
                                    field593.method3328(var42);
                                }
                                if (field645 != null || Statics.field752 != null || field652) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2694 && var39) {
                                    var9.field2694 = true;
                                    if (var9.field2653 != null) {
                                        class1 var43 = new class1();
                                        var43.field2 = var9;
                                        var43.field6 = class77.field1395 - var10;
                                        var43.field4 = class77.field1404 - var11;
                                        var43.field1 = var9.field2653;
                                        field593.method3328(var43);
                                    }
                                }
                                if (var9.field2694 && var38 && var9.field2654 != null) {
                                    class1 var44 = new class1();
                                    var44.field2 = var9;
                                    var44.field6 = class77.field1397 - var10;
                                    var44.field4 = class77.field1391 - var11;
                                    var44.field1 = var9.field2654;
                                    field593.method3328(var44);
                                }
                                if (var9.field2694 && !var38) {
                                    var9.field2694 = false;
                                    if (var9.field2655 != null) {
                                        class1 var45 = new class1();
                                        var45.field2 = var9;
                                        var45.field6 = class77.field1397 - var10;
                                        var45.field4 = class77.field1391 - var11;
                                        var45.field1 = var9.field2655;
                                        field673.method3328(var45);
                                    }
                                }
                                if (var38 && var9.field2656 != null) {
                                    class1 var46 = new class1();
                                    var46.field2 = var9;
                                    var46.field6 = class77.field1397 - var10;
                                    var46.field4 = class77.field1391 - var11;
                                    var46.field1 = var9.field2656;
                                    field593.method3328(var46);
                                }
                                if (!var9.field2693 && var37) {
                                    var9.field2693 = true;
                                    if (var9.field2657 != null) {
                                        class1 var47 = new class1();
                                        var47.field2 = var9;
                                        var47.field6 = class77.field1397 - var10;
                                        var47.field4 = class77.field1391 - var11;
                                        var47.field1 = var9.field2657;
                                        field593.method3328(var47);
                                    }
                                }
                                if (var9.field2693 && var37 && var9.field2658 != null) {
                                    class1 var48 = new class1();
                                    var48.field2 = var9;
                                    var48.field6 = class77.field1397 - var10;
                                    var48.field4 = class77.field1391 - var11;
                                    var48.field1 = var9.field2658;
                                    field593.method3328(var48);
                                }
                                if (var9.field2693 && !var37) {
                                    var9.field2693 = false;
                                    if (var9.field2659 != null) {
                                        class1 var49 = new class1();
                                        var49.field2 = var9;
                                        var49.field6 = class77.field1397 - var10;
                                        var49.field4 = class77.field1391 - var11;
                                        var49.field1 = var9.field2659;
                                        field673.method3328(var49);
                                    }
                                }
                                if (var9.field2670 != null) {
                                    class1 var50 = new class1();
                                    var50.field2 = var9;
                                    var50.field1 = var9.field2670;
                                    field557.method3328(var50);
                                }
                                if (var9.field2601 != null && field711 > var9.field2676) {
                                    if (var9.field2669 == null || field711 - var9.field2676 > 32) {
                                        class1 var55 = new class1();
                                        var55.field2 = var9;
                                        var55.field1 = var9.field2601;
                                        field593.method3328(var55);
                                    } else {
                                        label457: for (int var51 = var9.field2676; var51 < field711; var51++) {
                                            int var52 = field658[var51 & 0x1F];
                                            for (int var53 = 0; var53 < var9.field2669.length; var53++) {
                                                if (var9.field2669[var53] == var52) {
                                                    class1 var54 = new class1();
                                                    var54.field2 = var9;
                                                    var54.field1 = var9.field2601;
                                                    field593.method3328(var54);
                                                    break label457;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2676 = field711;
                                }
                                if (var9.field2666 != null && field661 > var9.field2697) {
                                    if (var9.field2667 == null || field661 - var9.field2697 > 32) {
                                        class1 var60 = new class1();
                                        var60.field2 = var9;
                                        var60.field1 = var9.field2666;
                                        field593.method3328(var60);
                                    } else {
                                        label437: for (int var56 = var9.field2697; var56 < field661; var56++) {
                                            int var57 = field567[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2667.length; var58++) {
                                                if (var9.field2667[var58] == var57) {
                                                    class1 var59 = new class1();
                                                    var59.field2 = var9;
                                                    var59.field1 = var9.field2666;
                                                    field593.method3328(var59);
                                                    break label437;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2697 = field661;
                                }
                                if (var9.field2668 != null && field545 > var9.field2698) {
                                    if (var9.field2574 == null || field545 - var9.field2698 > 32) {
                                        class1 var65 = new class1();
                                        var65.field2 = var9;
                                        var65.field1 = var9.field2668;
                                        field593.method3328(var65);
                                    } else {
                                        label417: for (int var61 = var9.field2698; var61 < field545; var61++) {
                                            int var62 = field662[var61 & 0x1F];
                                            for (int var63 = 0; var63 < var9.field2574.length; var63++) {
                                                if (var9.field2574[var63] == var62) {
                                                    class1 var64 = new class1();
                                                    var64.field2 = var9;
                                                    var64.field1 = var9.field2668;
                                                    field593.method3328(var64);
                                                    break label417;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2698 = field545;
                                }
                                if (field664 > var9.field2612 && var9.field2673 != null) {
                                    class1 var66 = new class1();
                                    var66.field2 = var9;
                                    var66.field1 = var9.field2673;
                                    field593.method3328(var66);
                                }
                                if (field665 > var9.field2612 && var9.field2664 != null) {
                                    class1 var67 = new class1();
                                    var67.field2 = var9;
                                    var67.field1 = var9.field2664;
                                    field593.method3328(var67);
                                }
                                if (field666 > var9.field2612 && var9.field2607 != null) {
                                    class1 var68 = new class1();
                                    var68.field2 = var9;
                                    var68.field1 = var9.field2607;
                                    field593.method3328(var68);
                                }
                                if (field716 > var9.field2612 && var9.field2677 != null) {
                                    class1 var69 = new class1();
                                    var69.field2 = var9;
                                    var69.field1 = var9.field2677;
                                    field593.method3328(var69);
                                }
                                var9.field2612 = field474;
                                if (var9.field2674 != null) {
                                    for (int var70 = 0; var70 < field696; var70++) {
                                        class1 var71 = new class1();
                                        var71.field2 = var9;
                                        var71.field7 = field722[var70];
                                        var71.field3 = field697[var70];
                                        var71.field1 = var9.field2674;
                                        field593.method3328(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2583) {
                            if (field645 != null || Statics.field752 != null || field652) {
                                return;
                            }
                            if ((var9.field2683 >= 0 || var9.field2635 != 0) && class77.field1397 >= var12 && class77.field1391 >= var13 && class77.field1397 < var14 && class77.field1391 < var15) {
                                if (var9.field2683 >= 0) {
                                    Statics.field183 = arg0[var9.field2683];
                                } else {
                                    Statics.field183 = var9;
                                }
                            }
                            if (var9.field2586 == 8 && class77.field1397 >= var12 && class77.field1391 >= var13 && class77.field1397 < var14 && class77.field1391 < var15) {
                                Statics.field1758 = var9;
                            }
                            if (var9.field2600 > var9.field2594) {
                                int var72 = var9.field2585 + var10;
                                int var73 = var9.field2594;
                                int var74 = var9.field2600;
                                int var75 = class77.field1397;
                                int var76 = class77.field1391;
                                if (field525) {
                                    field559 = 32;
                                } else {
                                    field559 = 0;
                                }
                                field525 = false;
                                if (class77.field1390 != 0) {
                                    if (var75 >= var72 && var75 < var72 + 16 && var76 >= var11 && var76 < var11 + 16) {
                                        var9.field2598 -= 4;
                                        method42(var9);
                                    } else if (var75 >= var72 && var75 < var72 + 16 && var76 >= var11 + var73 - 16 && var76 < var11 + var73) {
                                        var9.field2598 += 4;
                                        method42(var9);
                                    } else if (var75 >= var72 - field559 && var75 < field559 + var72 + 16 && var76 >= var11 + 16 && var76 < var11 + var73 - 16) {
                                        int var77 = (var73 - 32) * var73 / var74;
                                        if (var77 < 8) {
                                            var77 = 8;
                                        }
                                        int var78 = var76 - var11 - 16 - var77 / 2;
                                        int var79 = var73 - 32 - var77;
                                        var9.field2598 = (var74 - var73) * var78 / var79;
                                        method42(var9);
                                        field525 = true;
                                    }
                                }
                                if (field670 != 0) {
                                    int var80 = var9.field2585;
                                    if (var75 >= var72 - var80 && var76 >= var11 && var75 < var72 + 16 && var76 <= var11 + var73) {
                                        var9.field2598 += field670 * 45;
                                        method42(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field709 == 0 || field709 == 3) && class77.field1402 == 1) {
                        int var24 = class77.field1395 - 25 - var10;
                        int var25 = class77.field1404 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field660 + field561 & 0x7FF;
                            int var27 = class104.field1790[var26];
                            int var28 = class104.field1791[var26];
                            int var29 = (field511 + 256) * var27 >> 8;
                            int var30 = (field511 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field2006.field455 + var31 >> 7;
                            int var34 = Statics.field2006.field411 - var32 >> 7;
                            boolean var35 = method2225(Statics.field2006.field430[0], Statics.field2006.field463[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field512.method2474(var24);
                                field512.method2474(var25);
                                field512.method2475(field561);
                                field512.method2474(57);
                                field512.method2474(field660);
                                field512.method2474(field511);
                                field512.method2474(89);
                                field512.method2475(Statics.field2006.field455);
                                field512.method2475(Statics.field2006.field411);
                                field512.method2474(field535);
                                field512.method2474(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.cm([Lfr;IB)V")
    public static final void method853(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2586 == 0) {
                    if (var3.field2692 != null) {
                        method853(var3.field2692, arg1);
                    }
                    class4 var4 = (class4) field635.method3312((long) var3.field2584);
                    if (var4 != null) {
                        int var5 = var4.field67;
                        if (class158.method2227(var5)) {
                            method853(Statics.field2608[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2627 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field1 = var3.field2627;
                    class26.method916(var6);
                }
                if (arg1 == 1 && var3.field2679 != null) {
                    if (var3.field2678 >= 0) {
                        class158 var7 = class158.method667(var3.field2584);
                        if (var7 == null || var7.field2692 == null || var3.field2678 >= var7.field2692.length || var7.field2692[var3.field2678] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field1 = var3.field2679;
                    class26.method916(var8);
                }
            }
        }
    }

    @ObfuscatedName("l.cx(Lfr;B)V")
    public static void method42(class158 arg0) {
        if (field677 == arg0.field2700) {
            field678[arg0.field2699] = true;
        }
    }

    @ObfuscatedName("z.cq(I)V")
    public static void method226() {
        for (class4 var0 = (class4) field635.method3326(); var0 != null; var0 = (class4) field635.method3316()) {
            int var1 = var0.field67;
            if (class158.method2227(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2608[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2583;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2820;
                    class158 var6 = class158.method667(var5);
                    if (var6 != null) {
                        method42(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bl.cz(Lfr;I)Lfr;")
    public static class158 method1540(class158 arg0) {
        class158 var1 = arg0;
        int var2 = Statics.method817(method242(arg0));
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
                var1 = class158.method667(var1.field2696);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class158 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2646;
        }
        return var5;
    }

    @ObfuscatedName("dt.ct([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2581(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("m.ck(IB)V")
    public static final void method208(int arg0) {
        if (class158.method2227(arg0)) {
            method637(Statics.field2608[arg0], -1);
        }
    }

    @ObfuscatedName("ao.cr([Lfr;II)V")
    public static final void method637(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2696 == arg1 && (!var3.field2583 || !method172(var3))) {
                if (var3.field2586 == 0) {
                    if (!var3.field2583 && method172(var3) && Statics.field183 != var3) {
                        continue;
                    }
                    method637(arg0, var3.field2584);
                    if (var3.field2692 != null) {
                        method637(var3.field2692, var3.field2584);
                    }
                    class4 var4 = (class4) field635.method3312((long) var3.field2584);
                    if (var4 != null) {
                        method208(var4.field67);
                    }
                }
                if (var3.field2586 == 6) {
                    if (var3.field2620 != -1 || var3.field2621 != -1) {
                        boolean var5 = method212(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2621;
                        } else {
                            var6 = var3.field2620;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method160(var6);
                            var3.field2613 += field601;
                            while (var3.field2613 > var7.field882[var3.field2690]) {
                                var3.field2613 -= var7.field882[var3.field2690];
                                var3.field2690++;
                                if (var3.field2690 >= var7.field881.length) {
                                    var3.field2690 -= var7.field885;
                                    if (var3.field2690 < 0 || var3.field2690 >= var7.field881.length) {
                                        var3.field2690 = 0;
                                    }
                                }
                                method42(var3);
                            }
                        }
                    }
                    if (var3.field2628 != 0 && !var3.field2583) {
                        int var8 = var3.field2628 >> 16;
                        int var9 = var3.field2628 << 16 >> 16;
                        int var10 = field601 * var8;
                        int var11 = field601 * var9;
                        var3.field2615 = var3.field2615 + var10 & 0x7FF;
                        var3.field2625 = var3.field2625 + var11 & 0x7FF;
                        method42(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.ca(II)V")
    public static final void method144(int arg0) {
        method226();
        for (class7 var1 = (class7) class7.field106.method3334(); var1 != null; var1 = (class7) class7.field106.method3355()) {
            if (var1.field104 != null) {
                var1.method53();
            }
        }
        int var2 = class42.method1439(arg0).field1042;
        if (var2 == 0) {
            return;
        }
        int var3 = class159.field2703[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2169(0.9D);
                ((class110) Statics.field1787).method2253(0.9D);
            }
            if (var3 == 2) {
                class104.method2169(0.8D);
                ((class110) Statics.field1787).method2253(0.8D);
            }
            if (var3 == 3) {
                class104.method2169(0.7D);
                ((class110) Statics.field1787).method2253(0.7D);
            }
            if (var3 == 4) {
                class104.method2169(0.6D);
                ((class110) Statics.field1787).method2253(0.6D);
            }
            class40.method843();
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
            if (field617 != var4) {
                if (field617 == 0 && field663 != -1) {
                    Statics.method1407(Statics.field1211, field663, 0, var4, false);
                    field569 = false;
                } else if (var4 == 0) {
                    Statics.field2341.method2773();
                    class138.field2347 = 1;
                    Statics.field746 = null;
                    field569 = false;
                } else if (class138.field2347 == 0) {
                    Statics.field2341.method2766(var4);
                } else {
                    Statics.field2346 = var4;
                }
                field617 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field713 = 127;
            }
            if (var3 == 1) {
                field713 = 96;
            }
            if (var3 == 2) {
                field713 = 64;
            }
            if (var3 == 3) {
                field713 = 32;
            }
            if (var3 == 4) {
                field713 = 0;
            }
        }
        if (var2 == 5) {
            field655 = var3;
        }
        if (var2 == 6) {
            field636 = var3;
        }
        if (var2 == 9) {
            field637 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field714 = 127;
        }
        if (var3 == 1) {
            field714 = 96;
        }
        if (var3 == 2) {
            field714 = 64;
        }
        if (var3 == 3) {
            field714 = 32;
        }
        if (var3 == 4) {
            field714 = 0;
        }
    }

    @ObfuscatedName("by.cf(Ln;ZB)V")
    public static final void method1402(class4 arg0, boolean arg1) {
        int var2 = arg0.field67;
        int var3 = (int) arg0.field2820;
        arg0.method3360();
        if (arg1) {
            class158.method209(var2);
        }
        method124(var2);
        class158 var4 = class158.method667(var3);
        if (var4 != null) {
            method42(var4);
        }
        field652 = false;
        field558 = 0;
        method596(Statics.field2467, Statics.field29, Statics.field1115, Statics.field1629);
        if (field634 != -1) {
            int var5 = field634;
            if (class158.method2227(var5)) {
                method853(Statics.field2608[var5], 1);
            }
        }
    }

    @ObfuscatedName("cd.cn(IIIILcj;I)V")
    public static final void method1624(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1292(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field660 + field561 & 0x7FF;
        int var7 = class104.field1790[var6];
        int var8 = class104.field1791[var6];
        int var9 = var7 * 256 / (field511 + 256);
        int var10 = var8 * 256 / (field511 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field245.method1742(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("bb.cv(IIIILcj;I)V")
    public static final void method1292(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field660 + field561 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1790[var5];
        int var8 = class104.field1791[var5];
        int var9 = var7 * 256 / (field511 + 256);
        int var10 = var8 * 256 / (field511 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1745(Statics.field24, arg0 + 94 + var11 - arg4.field1478 / 2 + 4, arg1 + 83 - var12 - arg4.field1474 / 2 - 4);
        } else {
            arg4.method1780(arg0 + 94 + var11 - arg4.field1478 / 2 + 4, arg1 + 83 - var12 - arg4.field1474 / 2 - 4);
        }
    }

    @ObfuscatedName("em.dr(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method2724(int arg0, String arg1, String arg2) {
        method163(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("s.dp(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method163(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field686[var4] = field686[var4 - 1];
            field687[var4] = field687[var4 - 1];
            field689[var4] = field689[var4 - 1];
            field688[var4] = field688[var4 - 1];
        }
        field686[0] = arg0;
        field687[0] = arg1;
        field689[0] = arg2;
        field688[0] = arg3;
        field485++;
        field664 = field474;
    }

    @ObfuscatedName("bz.dk(Ljava/lang/String;I)Z")
    public static boolean method1614(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method2960(arg0, Statics.field2049);
        for (int var2 = 0; var2 < field727; var2++) {
            if (var1.equalsIgnoreCase(class148.method2960(field729[var2].field358, Statics.field2049))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class148.method2960(Statics.field2006.field40, Statics.field2049))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.ds(Ljava/lang/String;I)Z")
    public static boolean method150(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method2960(arg0, Statics.field2049);
        for (int var2 = 0; var2 < field667; var2++) {
            class11 var3 = field695[var2];
            if (var1.equalsIgnoreCase(class148.method2960(var3.field175, Statics.field2049))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method2960(var3.field174, Statics.field2049))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dz.di(Ljava/lang/String;ZI)V")
    public static final void method2422(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field667 >= 100) {
            method2724(0, "", class134.field2247);
            return;
        }
        String var2 = class148.method2960(arg0, Statics.field2049);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field667; var3++) {
            class11 var4 = field695[var3];
            String var5 = class148.method2960(var4.field175, Statics.field2049);
            if (var5 != null && var5.equals(var2)) {
                method2724(0, "", arg0 + class134.field2248);
                return;
            }
            if (var4.field174 != null) {
                String var6 = class148.method2960(var4.field174, Statics.field2049);
                if (var6 != null && var6.equals(var2)) {
                    method2724(0, "", arg0 + class134.field2248);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field727; var7++) {
            class23 var8 = field729[var7];
            String var9 = class148.method2960(var8.field358, Statics.field2049);
            if (var9 != null && var9.equals(var2)) {
                method2724(0, "", class134.field2318 + arg0 + class134.field2137);
                return;
            }
            if (var8.field355 != null) {
                String var10 = class148.method2960(var8.field355, Statics.field2049);
                if (var10 != null && var10.equals(var2)) {
                    method2724(0, "", class134.field2318 + arg0 + class134.field2137);
                    return;
                }
            }
        }
        if (class148.method2960(Statics.field2006.field40, Statics.field2049).equals(var2)) {
            method2724(0, "", class134.field2250);
        } else {
            field512.method2356(229);
            field512.method2474(class127.method1638(arg0));
            field512.method2479(arg0);
        }
    }

    @ObfuscatedName("ch.do(Ljava/lang/String;IS)V")
    public static final void method1715(String arg0, int arg1) {
        field512.method2356(44);
        class116 var2 = field512;
        int var3 = arg0.length() + 1;
        var2.method2474(var3 + 1);
        field512.method2634(arg1);
        field512.method2479(arg0);
    }

    @ObfuscatedName("bq.dl(Ljava/lang/String;I)V")
    public static final void method1348(String arg0) {
        if (Statics.field2012 == null) {
            return;
        }
        field512.method2356(94);
        class116 var1 = field512;
        int var2 = arg0.length() + 1;
        var1.method2474(var2);
        field512.method2479(arg0);
    }

    @ObfuscatedName("ca.dj(B)V")
    public static final void method2075() {
        field512.method2356(185);
        field512.method2474(0);
    }

    @ObfuscatedName("r.df(II)V")
    public static void method124(int arg0) {
        for (class171 var1 = (class171) field674.method3326(); var1 != null; var1 = (class171) field674.method3316()) {
            if ((long) arg0 == (var1.field2820 >> 48 & 0xFFFFL)) {
                var1.method3360();
            }
        }
    }

    @ObfuscatedName("at.dy(Lfr;B)I")
    public static int method242(class158 arg0) {
        class171 var1 = (class171) field674.method3312(((long) arg0.field2584 << 32) + (long) arg0.field2678);
        return var1 == null ? arg0.field2605 : var1.field2803;
    }

    @ObfuscatedName("b.da(Lfr;I)Z")
    public static boolean method172(class158 arg0) {
        if (field643) {
            if (method242(arg0) != 0) {
                return false;
            }
            if (arg0.field2586 == 0) {
                return false;
            }
        }
        return arg0.field2596;
    }

    @ObfuscatedName("p.dd(Lfr;II)Ljava/lang/String;")
    public static String method7(class158 arg0, int arg1) {
        int var2 = method242(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2671 == null) {
            return null;
        } else if (arg0.field2641 == null || arg0.field2641.length <= arg1 || arg0.field2641[arg1] == null || arg0.field2641[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2641[arg1];
        }
    }

    @ObfuscatedName("v.dq(Lfr;I)Ljava/lang/String;")
    public static String method47(class158 arg0) {
        int var1 = method242(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2650 == null || arg0.field2650.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2650;
        }
    }
}

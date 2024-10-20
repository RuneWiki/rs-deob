package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.r")
    public static boolean field479 = true;

    @ObfuscatedName("client.p")
    public static int field545 = 1;

    @ObfuscatedName("client.o")
    public static int field525 = 0;

    @ObfuscatedName("client.q")
    public static boolean field484 = false;

    @ObfuscatedName("client.c")
    public static boolean field710 = false;

    @ObfuscatedName("client.z")
    public static int field486 = 0;

    @ObfuscatedName("client.h")
    public static int field530 = 0;

    @ObfuscatedName("client.f")
    public static boolean field488 = true;

    @ObfuscatedName("client.w")
    public static class164[] field555 = new class164[4];

    @ObfuscatedName("client.d")
    public static int field658 = 0;

    @ObfuscatedName("client.g")
    public static long field490 = -1L;

    @ObfuscatedName("client.b")
    public static int field491 = -1;

    @ObfuscatedName("client.j")
    public static int field489 = -1;

    @ObfuscatedName("client.m")
    public static int field493 = -1;

    @ObfuscatedName("client.k")
    public static boolean field668 = true;

    @ObfuscatedName("client.u")
    public static boolean field495 = false;

    @ObfuscatedName("client.i")
    public static int field548 = 0;

    @ObfuscatedName("client.ah")
    public static int field686 = 0;

    @ObfuscatedName("client.ag")
    public static int field498 = 0;

    @ObfuscatedName("client.ay")
    public static int field556 = 0;

    @ObfuscatedName("client.as")
    public static int field500 = 0;

    @ObfuscatedName("client.aq")
    public static int field501 = 0;

    @ObfuscatedName("client.am")
    public static int field502 = 0;

    @ObfuscatedName("client.an")
    public static int field535 = 0;

    @ObfuscatedName("client.av")
    public static int field709 = 0;

    @ObfuscatedName("client.at")
    public static class127 field505 = new class127(new byte[5000]);

    @ObfuscatedName("client.af")
    public static int field507 = 0;

    @ObfuscatedName("client.ax")
    public static int field508 = 0;

    @ObfuscatedName("client.ak")
    public static int field509 = 0;

    @ObfuscatedName("client.by")
    public static int field514 = 0;

    @ObfuscatedName("client.bo")
    public static int field497 = 0;

    @ObfuscatedName("client.bu")
    public static int field721 = 0;

    @ObfuscatedName("client.bw")
    public static int field517 = 0;

    @ObfuscatedName("client.bs")
    public static int field518 = 0;

    @ObfuscatedName("client.bl")
    public static class25[] field670 = new class25[32768];

    @ObfuscatedName("client.bh")
    public static int field527 = 0;

    @ObfuscatedName("client.bv")
    public static int[] field521 = new int[32768];

    @ObfuscatedName("client.cw")
    public static class116 field540 = new class116(5000);

    @ObfuscatedName("client.ct")
    public static class116 field523 = new class116(5000);

    @ObfuscatedName("client.ce")
    public static class116 field524 = new class116(5000);

    @ObfuscatedName("client.cd")
    public static int field603 = 0;

    @ObfuscatedName("client.cv")
    public static int field526 = 0;

    @ObfuscatedName("client.cm")
    public static int field579 = 0;

    @ObfuscatedName("client.cl")
    public static int field528 = 0;

    @ObfuscatedName("client.cj")
    public static int field529 = 0;

    @ObfuscatedName("client.cf")
    public static int field624 = 0;

    @ObfuscatedName("client.cq")
    public static int field584 = 0;

    @ObfuscatedName("client.co")
    public static int field736 = 0;

    @ObfuscatedName("client.cu")
    public static boolean field533 = false;

    @ObfuscatedName("client.cn")
    public static int field534 = 0;

    @ObfuscatedName("client.cc")
    public static int field598 = 0;

    @ObfuscatedName("client.cr")
    public static int field536 = 1;

    @ObfuscatedName("client.ch")
    public static int field610 = 0;

    @ObfuscatedName("client.ck")
    public static int field538 = 1;

    @ObfuscatedName("client.di")
    public static int field539 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field541 = false;

    @ObfuscatedName("client.dq")
    public static int[][][] field542 = new int[4][13][13];

    @ObfuscatedName("client.ds")
    public static final int[] field592 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dc")
    public static int field544 = 0;

    @ObfuscatedName("client.dg")
    public static int[][] field615 = new int[104][104];

    @ObfuscatedName("client.dk")
    public static int[][] field546 = new int[104][104];

    @ObfuscatedName("client.dr")
    public static int[] field547 = new int[4000];

    @ObfuscatedName("client.dw")
    public static int[] field732 = new int[4000];

    @ObfuscatedName("client.db")
    public static int field715 = 0;

    @ObfuscatedName("client.dz")
    public static int field550 = 2;

    @ObfuscatedName("client.dx")
    public static int field635 = 0;

    @ObfuscatedName("client.df")
    public static int field552 = 2;

    @ObfuscatedName("client.dy")
    public static int field553 = 0;

    @ObfuscatedName("client.dl")
    public static int field554 = 1;

    @ObfuscatedName("client.dp")
    public static int field740 = 0;

    @ObfuscatedName("client.du")
    public static int field606 = 0;

    @ObfuscatedName("client.ez")
    public static int field557 = 2;

    @ObfuscatedName("client.eg")
    public static int field558 = 0;

    @ObfuscatedName("client.et")
    public static int field559 = 1;

    @ObfuscatedName("client.ev")
    public static int field703 = 0;

    @ObfuscatedName("client.ei")
    public static int field561 = 0;

    @ObfuscatedName("client.er")
    public static int field564 = 2301979;

    @ObfuscatedName("client.ek")
    public static int field565 = 5063219;

    @ObfuscatedName("client.ew")
    public static int field566 = 3353893;

    @ObfuscatedName("client.fn")
    public static int field567 = 7759444;

    @ObfuscatedName("client.fl")
    public static boolean field494 = false;

    @ObfuscatedName("client.fq")
    public static int field569 = 0;

    @ObfuscatedName("client.fv")
    public static int field737 = 128;

    @ObfuscatedName("client.fw")
    public static int field571 = 0;

    @ObfuscatedName("client.fj")
    public static int field645 = 0;

    @ObfuscatedName("client.fb")
    public static int field573 = 0;

    @ObfuscatedName("client.ft")
    public static int field522 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field575 = false;

    @ObfuscatedName("client.fa")
    public static int field576 = 0;

    @ObfuscatedName("client.fd")
    public static int field577 = 0;

    @ObfuscatedName("client.fg")
    public static int field677 = 50;

    @ObfuscatedName("client.fu")
    public static int[] field520 = new int[field677];

    @ObfuscatedName("client.fk")
    public static int[] field560 = new int[field677];

    @ObfuscatedName("client.fy")
    public static int[] field581 = new int[field677];

    @ObfuscatedName("client.fp")
    public static int[] field582 = new int[field677];

    @ObfuscatedName("client.fz")
    public static int[] field583 = new int[field677];

    @ObfuscatedName("client.fx")
    public static int[] field543 = new int[field677];

    @ObfuscatedName("client.fs")
    public static int[] field585 = new int[field677];

    @ObfuscatedName("client.gd")
    public static String[] field733 = new String[field677];

    @ObfuscatedName("client.gy")
    public static int[][] field572 = new int[104][104];

    @ObfuscatedName("client.gt")
    public static int field588 = 0;

    @ObfuscatedName("client.gj")
    public static int field589 = -1;

    @ObfuscatedName("client.gp")
    public static int field590 = -1;

    @ObfuscatedName("client.ge")
    public static int field591 = 0;

    @ObfuscatedName("client.gs")
    public static int field477 = 0;

    @ObfuscatedName("client.gw")
    public static int field660 = 0;

    @ObfuscatedName("client.gg")
    public static int field594 = 0;

    @ObfuscatedName("client.gf")
    public static int field595 = 0;

    @ObfuscatedName("client.gu")
    public static int field596 = 0;

    @ObfuscatedName("client.gm")
    public static int field713 = 0;

    @ObfuscatedName("client.gl")
    public static int field531 = 0;

    @ObfuscatedName("client.gb")
    public static int field599 = 0;

    @ObfuscatedName("client.gq")
    public static int field600 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field601 = false;

    @ObfuscatedName("client.gn")
    public static int field602 = 0;

    @ObfuscatedName("client.gh")
    public static int field568 = 0;

    @ObfuscatedName("client.gc")
    public static class3[] field604 = new class3[2048];

    @ObfuscatedName("client.ga")
    public static int field503 = 0;

    @ObfuscatedName("client.gi")
    public static int[] field701 = new int[2048];

    @ObfuscatedName("client.hi")
    public static int field607 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field608 = new int[2048];

    @ObfuscatedName("client.hk")
    public static class127[] field609 = new class127[2048];

    @ObfuscatedName("client.ha")
    public static int field689 = -1;

    @ObfuscatedName("client.hy")
    public static int field707 = 0;

    @ObfuscatedName("client.hj")
    public static int field612 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field613 = new int[1000];

    @ObfuscatedName("client.hm")
    public static final int[] field614 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hn")
    public static String[] field650 = new String[8];

    @ObfuscatedName("client.hr")
    public static boolean[] field616 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field617 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static class177[][][] field618 = new class177[4][104][104];

    @ObfuscatedName("client.hb")
    public static class177 field619 = new class177();

    @ObfuscatedName("client.hp")
    public static class177 field620 = new class177();

    @ObfuscatedName("client.ht")
    public static class177 field621 = new class177();

    @ObfuscatedName("client.hv")
    public static int[] field622 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field623 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field519 = new int[25];

    @ObfuscatedName("client.hx")
    public static int field625 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field649 = false;

    @ObfuscatedName("client.ij")
    public static int field506 = 0;

    @ObfuscatedName("client.ik")
    public static int[] field628 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field629 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field664 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field631 = new int[500];

    @ObfuscatedName("client.ic")
    public static String[] field632 = new String[500];

    @ObfuscatedName("client.ie")
    public static String[] field580 = new String[500];

    @ObfuscatedName("client.is")
    public static int field634 = -1;

    @ObfuscatedName("client.ir")
    public static int field725 = -1;

    @ObfuscatedName("client.ia")
    public static int field636 = 0;

    @ObfuscatedName("client.il")
    public static int field496 = 50;

    @ObfuscatedName("client.if")
    public static int field638 = 0;

    @ObfuscatedName("client.it")
    public static String field639 = null;

    @ObfuscatedName("client.ip")
    public static boolean field549 = false;

    @ObfuscatedName("client.ig")
    public static int field641 = -1;

    @ObfuscatedName("client.id")
    public static String field642 = null;

    @ObfuscatedName("client.in")
    public static String field643 = null;

    @ObfuscatedName("client.jz")
    public static int field644 = -1;

    @ObfuscatedName("client.jb")
    public static class175 field694 = new class175(8);

    @ObfuscatedName("client.jq")
    public static int field646 = 0;

    @ObfuscatedName("client.ji")
    public static int field516 = 0;

    @ObfuscatedName("client.jt")
    public static class158 field648 = null;

    @ObfuscatedName("client.jj")
    public static int field663 = 0;

    @ObfuscatedName("client.jc")
    public static int field647 = 0;

    @ObfuscatedName("client.jw")
    public static int field651 = 0;

    @ObfuscatedName("client.ja")
    public static boolean field652 = false;

    @ObfuscatedName("client.jp")
    public static boolean field653 = false;

    @ObfuscatedName("client.jd")
    public static boolean field654 = false;

    @ObfuscatedName("client.jy")
    public static class158 field655 = null;

    @ObfuscatedName("client.jv")
    public static class158 field656 = null;

    @ObfuscatedName("client.je")
    public static int field657 = 0;

    @ObfuscatedName("client.jl")
    public static int field586 = 0;

    @ObfuscatedName("client.ju")
    public static class158 field659 = null;

    @ObfuscatedName("client.jh")
    public static boolean field746 = false;

    @ObfuscatedName("client.jo")
    public static int field661 = -1;

    @ObfuscatedName("client.jr")
    public static int field662 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field626 = false;

    @ObfuscatedName("client.jn")
    public static int field676 = -1;

    @ObfuscatedName("client.jm")
    public static int field665 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field743 = false;

    @ObfuscatedName("client.ko")
    public static int field667 = 1;

    @ObfuscatedName("client.ky")
    public static int[] field722 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field669 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field717 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field671 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field672 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field692 = 0;

    @ObfuscatedName("client.kt")
    public static int field674 = 0;

    @ObfuscatedName("client.ka")
    public static int field551 = 0;

    @ObfuscatedName("client.kx")
    public static int field499 = 0;

    @ObfuscatedName("client.kr")
    public static int field587 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field678 = new int[2000];

    @ObfuscatedName("client.kw")
    public static String[] field679 = new String[1000];

    @ObfuscatedName("client.km")
    public static int field680 = 0;

    @ObfuscatedName("client.kv")
    public static class177 field681 = new class177();

    @ObfuscatedName("client.kq")
    public static class177 field682 = new class177();

    @ObfuscatedName("client.kb")
    public static class177 field683 = new class177();

    @ObfuscatedName("client.kg")
    public static class175 field684 = new class175(512);

    @ObfuscatedName("client.ku")
    public static int field685 = 0;

    @ObfuscatedName("client.kd")
    public static int field593 = -2;

    @ObfuscatedName("client.kz")
    public static boolean[] field687 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field688 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field673 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field690 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field691 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field504 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field693 = new int[100];

    @ObfuscatedName("client.ld")
    public static int field480 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field695 = new int[100];

    @ObfuscatedName("client.lh")
    public static String[] field696 = new String[100];

    @ObfuscatedName("client.ly")
    public static String[] field697 = new String[100];

    @ObfuscatedName("client.lq")
    public static String[] field698 = new String[100];

    @ObfuscatedName("client.lo")
    public static int field699 = 0;

    @ObfuscatedName("client.lb")
    public static int[] field739 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lg")
    public static int field570 = 0;

    @ObfuscatedName("client.lj")
    public static int field702 = 0;

    @ObfuscatedName("client.lm")
    public static long[] field729 = new long[100];

    @ObfuscatedName("client.lt")
    public static int field704 = 0;

    @ObfuscatedName("client.lx")
    public static int field705 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field706 = new int[128];

    @ObfuscatedName("client.lf")
    public static int[] field633 = new int[128];

    @ObfuscatedName("client.lr")
    public static long field708 = -1L;

    @ObfuscatedName("client.lp")
    public static String field515 = null;

    @ObfuscatedName("client.mg")
    public static String field597 = null;

    @ObfuscatedName("client.mk")
    public static int field711 = -1;

    @ObfuscatedName("client.md")
    public static int field712 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field730 = new int[1000];

    @ObfuscatedName("client.mc")
    public static int[] field485 = new int[1000];

    @ObfuscatedName("client.mz")
    public static class86[] field611 = new class86[1000];

    @ObfuscatedName("client.ms")
    public static int field716 = 0;

    @ObfuscatedName("client.mt")
    public static int field714 = 0;

    @ObfuscatedName("client.my")
    public static int field718 = 0;

    @ObfuscatedName("client.mi")
    public static int field719 = 255;

    @ObfuscatedName("client.mq")
    public static int field720 = -1;

    @ObfuscatedName("client.mv")
    public static boolean field700 = false;

    @ObfuscatedName("client.mr")
    public static int field574 = 127;

    @ObfuscatedName("client.ma")
    public static int field723 = 127;

    @ObfuscatedName("client.nn")
    public static int field724 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field578 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field726 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field727 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field728 = new int[50];

    @ObfuscatedName("client.nz")
    public static class57[] field532 = new class57[50];

    @ObfuscatedName("client.nh")
    public static boolean field482 = false;

    @ObfuscatedName("client.ne")
    public static boolean[] field731 = new boolean[5];

    @ObfuscatedName("client.na")
    public static int[] field637 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field510 = new int[5];

    @ObfuscatedName("client.nl")
    public static int[] field734 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field735 = new int[5];

    @ObfuscatedName("client.om")
    public static int field666 = 0;

    @ObfuscatedName("client.oq")
    public static int field630 = 0;

    @ObfuscatedName("client.op")
    public static class23[] field738 = new class23[200];

    @ObfuscatedName("client.os")
    public static class173 field492 = new class173();

    @ObfuscatedName("client.oi")
    public static int field537 = 0;

    @ObfuscatedName("client.oe")
    public static class11[] field741 = new class11[100];

    @ObfuscatedName("client.ob")
    public static class163 field742 = new class163();

    @ObfuscatedName("client.oa")
    public static int field640 = -1;

    @ObfuscatedName("client.of")
    public static int field744 = -1;

    @ObfuscatedName("client.r(I)V")
    public final void method448() {
    }

    public final void init() {
        if (!this.method1390()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2775, class167.field2777, class167.field2782, class167.field2774, class167.field2772, class167.field2771, class167.field2773, class167.field2776, class167.field2779 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2780);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2780)) {
                    case 1:
                        field545 = Integer.parseInt(var5);
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field29)) {
                        }
                        break;
                    case 3:
                        Statics.field481 = class132.method1984(Integer.parseInt(var5));
                        break;
                    case 4:
                        Statics.field1195 = var5;
                        break;
                    case 5:
                        Statics.field2453 = (class133) class113.method641(class133.method902(), Integer.parseInt(var5));
                        if (Statics.field2453 == class133.field2068) {
                            Statics.field483 = class186.field2859;
                        } else {
                            Statics.field483 = class186.field2864;
                        }
                        break;
                    case 6:
                        field525 = Integer.parseInt(var5);
                    case 7:
                    default:
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field29)) {
                            field484 = true;
                        } else {
                            field484 = false;
                        }
                        break;
                    case 9:
                        field486 = Integer.parseInt(var5);
                }
            }
        }
        method1980();
        Statics.field991 = this.getCodeBase().getHost();
        String var6 = Statics.field481.field2056;
        byte var7 = 0;
        try {
            Statics.field2316 = 16;
            Statics.field2053 = var7;
            try {
                Statics.field240 = System.getProperty("os.name");
            } catch (Exception var62) {
                Statics.field240 = "Unknown";
            }
            Statics.field2389 = Statics.field240.toLowerCase();
            try {
                Statics.field282 = System.getProperty("user.home");
                if (Statics.field282 != null) {
                    Statics.field282 = Statics.field282 + "/";
                }
            } catch (Exception var61) {
            }
            try {
                if (Statics.field2389.startsWith("win")) {
                    if (Statics.field282 == null) {
                        Statics.field282 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field282 == null) {
                    Statics.field282 = System.getenv("HOME");
                }
                if (Statics.field282 != null) {
                    Statics.field282 = Statics.field282 + "/";
                }
            } catch (Exception var60) {
            }
            if (Statics.field282 == null) {
                Statics.field282 = "~/";
            }
            Statics.field123 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field282, "/tmp/", "" };
            Statics.field1435 = new String[] { ".jagex_cache_" + Statics.field2053, ".file_store_" + Statics.field2053 };
            int var11 = 0;
            label264: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field1433 = new File(Statics.field282, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field1433.exists()) {
                    try {
                        class29 var16 = new class29(Statics.field1433, "rw", 10000L);
                        class127 var17 = new class127((int) var16.method553());
                        while (var17.field2035 < var17.field2036.length) {
                            int var18 = var16.method549(var17.field2036, var17.field2035, var17.field2036.length - var17.field2035);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field2035 += var18;
                        }
                        var17.field2035 = 0;
                        int var19 = var17.method2411();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2411();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2555();
                            if (var20 == 1) {
                                var14 = var17.method2555();
                            }
                        } else {
                            var13 = var17.method2421();
                            if (var20 == 1) {
                                var14 = var17.method2421();
                            }
                        }
                        var16.method552();
                    } catch (IOException var64) {
                        var64.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        boolean var26;
                        try {
                            RandomAccessFile var24 = new RandomAccessFile(var23, "rw");
                            int var25 = var24.read();
                            var24.seek(0L);
                            var24.write(var25);
                            var24.seek(0L);
                            var24.close();
                            var23.delete();
                            var26 = true;
                        } catch (Exception var59) {
                            var26 = false;
                        }
                        if (!var26) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label239: for (int var28 = 0; var28 < Statics.field1435.length; var28++) {
                        for (int var29 = 0; var29 < Statics.field123.length; var29++) {
                            File var30 = new File(Statics.field123[var29] + Statics.field1435[var28] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var30.exists()) {
                                File var31 = new File(var30, "test.dat");
                                boolean var34;
                                try {
                                    RandomAccessFile var32 = new RandomAccessFile(var31, "rw");
                                    int var33 = var32.read();
                                    var32.seek(0L);
                                    var32.write(var33);
                                    var32.seek(0L);
                                    var32.close();
                                    var31.delete();
                                    var34 = true;
                                } catch (Exception var58) {
                                    var34 = false;
                                }
                                if (var34) {
                                    var13 = var30.toString();
                                    var15 = true;
                                    break label239;
                                }
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field282 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var36 = new File(var14);
                    File var37 = new File(var13);
                    try {
                        File[] var38 = var36.listFiles();
                        File[] var39 = var38;
                        for (int var40 = 0; var40 < var39.length; var40++) {
                            File var41 = var39[var40];
                            File var42 = new File(var37, var41.getName());
                            boolean var43 = var41.renameTo(var42);
                            if (!var43) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var63) {
                        var63.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    class82.method44(new File(var13), (File) null);
                }
                File var45 = new File(var13);
                Statics.field1430 = var45;
                if (!Statics.field1430.exists()) {
                    Statics.field1430.mkdirs();
                }
                File[] var46 = Statics.field1430.listFiles();
                if (var46 == null) {
                    break;
                }
                File[] var47 = var46;
                int var48 = 0;
                while (true) {
                    if (var48 >= var47.length) {
                        break label264;
                    }
                    File var49 = var47[var48];
                    boolean var52;
                    try {
                        RandomAccessFile var50 = new RandomAccessFile(var49, "rw");
                        int var51 = var50.read();
                        var50.seek(0L);
                        var50.write(var51);
                        var50.seek(0L);
                        var50.close();
                        var52 = true;
                    } catch (Exception var57) {
                        var52 = false;
                    }
                    if (!var52) {
                        var11++;
                        break;
                    }
                    var48++;
                }
            }
            File var54 = Statics.field1430;
            Statics.field1307 = var54;
            if (!Statics.field1307.exists()) {
                throw new RuntimeException("");
            }
            class72.field1309 = true;
            Statics.method818();
            class82.field1438 = new class30(new class29(class72.method160("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1446 = new class30(new class29(class72.method160("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1440 = new class30[Statics.field2316];
            for (int var55 = 0; var55 < Statics.field2316; var55++) {
                Statics.field1440[var55] = new class30(new class29(class72.method160("main_file_cache.idx" + var55), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var65) {
            class80.method1333((String) null, var65);
        }
        Statics.field478 = this;
        this.method1407(765, 503, 18);
    }

    @ObfuscatedName("cn.n(B)V")
    public static final void method1980() {
        class95.field1600 = false;
        field710 = false;
    }

    @ObfuscatedName("client.o(B)V")
    public final void method280() {
        Statics.field302 = field525 == 0 ? 43594 : field545 + 40000;
        Statics.field2447 = field525 == 0 ? 443 : field545 + 50000;
        Statics.field17 = Statics.field302;
        Statics.field2725 = class161.field2710;
        Statics.field2730 = class161.field2712;
        Statics.field1923 = class161.field2711;
        Statics.field2785 = class161.field2713;
        class75.method748();
        Canvas var1 = Statics.field13;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class75.field1368);
        var1.addFocusListener(class75.field1368);
        Canvas var2 = Statics.field13;
        var2.addMouseListener(class77.field1405);
        var2.addMouseMotionListener(class77.field1405);
        var2.addFocusListener(class77.field1405);
        class78 var3;
        try {
            var3 = new class78();
        } catch (Throwable var14) {
            var3 = null;
        }
        Statics.field941 = var3;
        if (Statics.field941 != null) {
            Statics.field941.method1344(Statics.field13);
        }
        Statics.field1050 = new class71(255, class82.field1438, class82.field1446, 500000);
        class29 var5 = null;
        class12 var6 = new class12();
        try {
            var5 = class82.method149("", Statics.field2453.field2064, false);
            byte[] var7 = new byte[(int) var5.method553()];
            int var9;
            for (int var8 = 0; var8 < var7.length; var8 += var9) {
                var9 = var5.method549(var7, var8, var7.length - var8);
                if (var9 == -1) {
                    throw new IOException();
                }
            }
            var6 = new class12(new class127(var7));
        } catch (Exception var15) {
        }
        try {
            if (var5 != null) {
                var5.method552();
            }
        } catch (Exception var13) {
        }
        Statics.field1289 = var6;
        if (field525 != 0) {
            field495 = true;
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method480() {
        field658++;
        this.method284();
        class157.method1353();
        class138.method1477();
        method2065();
        class75.method1334();
        class77 var1 = class77.field1405;
        synchronized (class77.field1405) {
            class77.field1397 = class77.field1394;
            class77.field1398 = class77.field1392;
            class77.field1395 = class77.field1396;
            class77.field1410 = class77.field1404;
            class77.field1399 = class77.field1401;
            class77.field1400 = class77.field1402;
            class77.field1407 = class77.field1403;
            class77.field1404 = 0;
        }
        if (Statics.field941 != null) {
            int var3 = Statics.field941.method1337();
            field680 = var3;
        }
        if (field530 == 0) {
            method238();
            class73.method256();
        } else if (field530 == 5) {
            class21.method2805(this);
            method238();
            class73.method256();
        } else if (field530 == 10) {
            class21.method2805(this);
        } else if (field530 == 20) {
            class21.method2805(this);
            Statics.method1355();
        } else if (field530 == 25) {
            method1259(false);
            field598 = 0;
            boolean var4 = true;
            for (int var5 = 0; var5 < Statics.field2314.length; var5++) {
                if (Statics.field1661[var5] != -1 && Statics.field2314[var5] == null) {
                    Statics.field2314[var5] = Statics.field281.method2961(Statics.field1661[var5], 0);
                    if (Statics.field2314[var5] == null) {
                        var4 = false;
                        field598++;
                    }
                }
                if (Statics.field387[var5] != -1 && Statics.field361[var5] == null) {
                    Statics.field361[var5] = Statics.field281.method2938(Statics.field387[var5], 0, Statics.field196[var5]);
                    if (Statics.field361[var5] == null) {
                        var4 = false;
                        field598++;
                    }
                }
            }
            if (var4) {
                field610 = 0;
                boolean var6 = true;
                for (int var7 = 0; var7 < Statics.field2314.length; var7++) {
                    byte[] var8 = Statics.field361[var7];
                    if (var8 != null) {
                        int var9 = (Statics.field2560[var7] >> 8) * 64 - Statics.field374;
                        int var10 = (Statics.field2560[var7] & 0xFF) * 64 - Statics.field872;
                        if (field541) {
                            var9 = 10;
                            var10 = 10;
                        }
                        var6 &= class9.method237(var8, var9, var10);
                    }
                }
                if (var6) {
                    if (field539 != 0) {
                        method2(class134.field2303 + class2.field21 + class2.field27 + 100 + "%" + class2.field26, true);
                    }
                    method2065();
                    method1805();
                    method2065();
                    Statics.field178.method1875();
                    method2065();
                    System.gc();
                    for (int var11 = 0; var11 < 4; var11++) {
                        field555[var11].method3151();
                    }
                    for (int var12 = 0; var12 < 4; var12++) {
                        for (int var13 = 0; var13 < 104; var13++) {
                            for (int var14 = 0; var14 < 104; var14++) {
                                class9.field118[var12][var13][var14] = 0;
                            }
                        }
                    }
                    method2065();
                    class9.field119 = 99;
                    Statics.field120 = new byte[4][104][104];
                    Statics.field121 = new byte[4][104][104];
                    Statics.field252 = new byte[4][104][104];
                    Statics.field117 = new byte[4][104][104];
                    Statics.field1273 = new int[4][105][105];
                    Statics.field1390 = new byte[4][105][105];
                    Statics.field122 = new int[105][105];
                    Statics.field1625 = new int[104];
                    Statics.field127 = new int[104];
                    Statics.field169 = new int[104];
                    Statics.field62 = new int[104];
                    Statics.field979 = new int[104];
                    int var15 = Statics.field2314.length;
                    class7.method572();
                    method1259(true);
                    if (!field541) {
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = (Statics.field2560[var16] >> 8) * 64 - Statics.field374;
                            int var18 = (Statics.field2560[var16] & 0xFF) * 64 - Statics.field872;
                            byte[] var19 = Statics.field2314[var16];
                            if (var19 != null) {
                                method2065();
                                class9.method162(var19, var17, var18, Statics.field1456 * 8 - 48, Statics.field410 * 8 - 48, field555);
                            }
                        }
                        for (int var20 = 0; var20 < var15; var20++) {
                            int var21 = (Statics.field2560[var20] >> 8) * 64 - Statics.field374;
                            int var22 = (Statics.field2560[var20] & 0xFF) * 64 - Statics.field872;
                            byte[] var23 = Statics.field2314[var20];
                            if (var23 == null && Statics.field410 < 800) {
                                method2065();
                                class9.method2658(var21, var22, 64, 64);
                            }
                        }
                        method1259(true);
                        for (int var24 = 0; var24 < var15; var24++) {
                            byte[] var25 = Statics.field361[var24];
                            if (var25 != null) {
                                int var26 = (Statics.field2560[var24] >> 8) * 64 - Statics.field374;
                                int var27 = (Statics.field2560[var24] & 0xFF) * 64 - Statics.field872;
                                method2065();
                                class9.method56(var25, var26, var27, Statics.field178, field555);
                            }
                        }
                    }
                    if (field541) {
                        int var28 = 0;
                        label334: while (true) {
                            if (var28 >= 4) {
                                for (int var39 = 0; var39 < 13; var39++) {
                                    for (int var40 = 0; var40 < 13; var40++) {
                                        int var41 = field542[0][var39][var40];
                                        if (var41 == -1) {
                                            class9.method2658(var39 * 8, var40 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1259(true);
                                int var42 = 0;
                                while (true) {
                                    if (var42 >= 4) {
                                        break label334;
                                    }
                                    method2065();
                                    for (int var43 = 0; var43 < 13; var43++) {
                                        label291: for (int var44 = 0; var44 < 13; var44++) {
                                            int var45 = field542[var42][var43][var44];
                                            if (var45 != -1) {
                                                int var46 = var45 >> 24 & 0x3;
                                                int var47 = var45 >> 1 & 0x3;
                                                int var48 = var45 >> 14 & 0x3FF;
                                                int var49 = var45 >> 3 & 0x7FF;
                                                int var50 = (var48 / 8 << 8) + var49 / 8;
                                                for (int var51 = 0; var51 < Statics.field2560.length; var51++) {
                                                    if (Statics.field2560[var51] == var50 && Statics.field361[var51] != null) {
                                                        byte[] var52 = Statics.field361[var51];
                                                        int var53 = var43 * 8;
                                                        int var54 = var44 * 8;
                                                        int var55 = (var48 & 0x7) * 8;
                                                        int var56 = (var49 & 0x7) * 8;
                                                        class95 var57 = Statics.field178;
                                                        class164[] var58 = field555;
                                                        class127 var59 = new class127(var52);
                                                        int var60 = -1;
                                                        while (true) {
                                                            int var61 = var59.method2581();
                                                            if (var61 == 0) {
                                                                continue label291;
                                                            }
                                                            var60 += var61;
                                                            int var62 = 0;
                                                            while (true) {
                                                                int var63 = var59.method2581();
                                                                if (var63 == 0) {
                                                                    break;
                                                                }
                                                                var62 += var63 - 1;
                                                                int var64 = var62 & 0x3F;
                                                                int var65 = var62 >> 6 & 0x3F;
                                                                int var66 = var62 >> 12;
                                                                int var67 = var59.method2411();
                                                                int var68 = var67 >> 2;
                                                                int var69 = var67 & 0x3;
                                                                if (var46 == var66 && var65 >= var55 && var65 < var55 + 8 && var64 >= var56 && var64 < var56 + 8) {
                                                                    class32 var70 = class32.method1806(var60);
                                                                    int var71 = var53 + class160.method3187(var65 & 0x7, var64 & 0x7, var47, var70.field835, var70.field836, var69);
                                                                    int var72 = var54 + class160.method2943(var65 & 0x7, var64 & 0x7, var47, var70.field835, var70.field836, var69);
                                                                    if (var71 > 0 && var72 > 0 && var71 < 103 && var72 < 103) {
                                                                        int var73 = var42;
                                                                        if ((class9.field118[1][var71][var72] & 0x2) == 2) {
                                                                            var73 = var42 - 1;
                                                                        }
                                                                        class164 var74 = null;
                                                                        if (var73 >= 0) {
                                                                            var74 = var58[var73];
                                                                        }
                                                                        class9.method2066(var42, var71, var72, var60, var47 + var69 & 0x3, var68, var57, var74);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var42++;
                                }
                            }
                            method2065();
                            for (int var29 = 0; var29 < 13; var29++) {
                                for (int var30 = 0; var30 < 13; var30++) {
                                    boolean var31 = false;
                                    int var32 = field542[var28][var29][var30];
                                    if (var32 != -1) {
                                        int var33 = var32 >> 24 & 0x3;
                                        int var34 = var32 >> 1 & 0x3;
                                        int var35 = var32 >> 14 & 0x3FF;
                                        int var36 = var32 >> 3 & 0x7FF;
                                        int var37 = (var35 / 8 << 8) + var36 / 8;
                                        for (int var38 = 0; var38 < Statics.field2560.length; var38++) {
                                            if (Statics.field2560[var38] == var37 && Statics.field2314[var38] != null) {
                                                class9.method59(Statics.field2314[var38], var28, var29 * 8, var30 * 8, var33, (var35 & 0x7) * 8, (var36 & 0x7) * 8, var34, field555);
                                                var31 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var31) {
                                        class9.method33(var28, var29 * 8, var30 * 8);
                                    }
                                }
                            }
                            var28++;
                        }
                    }
                    method1259(true);
                    method1805();
                    method2065();
                    class9.method1478(Statics.field178, field555);
                    method1259(true);
                    int var75 = class9.field119;
                    if (var75 > Statics.field54) {
                        var75 = Statics.field54;
                    }
                    if (var75 < Statics.field54 - 1) {
                        int var76 = Statics.field54 - 1;
                    }
                    if (field710) {
                        Statics.field178.method1815(class9.field119);
                    } else {
                        Statics.field178.method1815(0);
                    }
                    for (int var77 = 0; var77 < 104; var77++) {
                        for (int var78 = 0; var78 < 104; var78++) {
                            method2671(var77, var78);
                        }
                    }
                    method2065();
                    method2916();
                    class32.field823.method3192();
                    if (Statics.field1057 != null) {
                        field540.method2272(139);
                        field540.method2400(1057001181);
                    }
                    if (!field541) {
                        int var79 = (Statics.field1456 - 6) / 8;
                        int var80 = (Statics.field1456 + 6) / 8;
                        int var81 = (Statics.field410 - 6) / 8;
                        int var82 = (Statics.field410 + 6) / 8;
                        for (int var83 = var79 - 1; var83 <= var80 + 1; var83++) {
                            for (int var84 = var81 - 1; var84 <= var82 + 1; var84++) {
                                if (var83 < var79 || var83 > var80 || var84 < var81 || var84 > var82) {
                                    Statics.field281.method2954("m" + var83 + "_" + var84);
                                    Statics.field281.method2954("l" + var83 + "_" + var84);
                                }
                            }
                        }
                    }
                    method143(30);
                    method2065();
                    Statics.field120 = (byte[][][]) null;
                    Statics.field121 = (byte[][][]) null;
                    Statics.field252 = (byte[][][]) null;
                    Statics.field117 = (byte[][][]) null;
                    Statics.field1273 = (int[][][]) null;
                    Statics.field1390 = (byte[][][]) null;
                    Statics.field122 = (int[][]) null;
                    Statics.field1625 = null;
                    Statics.field127 = null;
                    Statics.field169 = null;
                    Statics.field62 = null;
                    Statics.field979 = null;
                    field540.method2272(85);
                    class73.method256();
                } else {
                    field539 = 2;
                }
            } else {
                field539 = 1;
            }
        }
        if (field530 == 30) {
            method2159();
        } else if (field530 == 40) {
            Statics.method1355();
        }
    }

    @ObfuscatedName("client.t(I)V")
    public final void method282() {
        boolean var1 = Statics.method1985();
        if (var1 && field700 && Statics.field939 != null) {
            Statics.field939.method1153();
        }
        if (field1323) {
            Canvas var2 = Statics.field13;
            var2.removeKeyListener(class75.field1368);
            var2.removeFocusListener(class75.field1368);
            class75.field1384 = -1;
            Canvas var3 = Statics.field13;
            var3.removeMouseListener(class77.field1405);
            var3.removeMouseMotionListener(class77.field1405);
            var3.removeFocusListener(class77.field1405);
            class77.field1394 = 0;
            if (Statics.field941 != null) {
                Statics.field941.method1336(Statics.field13);
            }
            this.method1445();
            Canvas var4 = Statics.field13;
            var4.setFocusTraversalKeysEnabled(false);
            var4.addKeyListener(class75.field1368);
            var4.addFocusListener(class75.field1368);
            Canvas var5 = Statics.field13;
            var5.addMouseListener(class77.field1405);
            var5.addMouseMotionListener(class77.field1405);
            var5.addFocusListener(class77.field1405);
            if (Statics.field941 != null) {
                Statics.field941.method1344(Statics.field13);
            }
        }
        if (field530 == 0) {
            int var6 = class21.field322;
            String var7 = class21.field337;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field13.getGraphics();
                if (Statics.field36 == null) {
                    Statics.field36 = new Font("Helvetica", 1, 13);
                    Statics.field2729 = Statics.field13.getFontMetrics(Statics.field36);
                }
                if (field1328) {
                    field1328 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field183, Statics.field780);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1669 == null) {
                        Statics.field1669 = Statics.field13.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field1669.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field36);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field2729.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field1669, Statics.field183 / 2 - 152, Statics.field780 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field183 / 2 - 152;
                    int var13 = Statics.field780 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field36);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field2729.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field13.repaint();
            }
        } else if (field530 == 5) {
            class21.method769(Statics.field1333, Statics.field253);
        } else if (field530 == 10) {
            class21.method769(Statics.field1333, Statics.field253);
        } else if (field530 == 20) {
            class21.method769(Statics.field1333, Statics.field253);
        } else if (field530 == 25) {
            if (field539 == 1) {
                if (field598 > field536) {
                    field536 = field598;
                }
                int var15 = (field536 * 50 - field598 * 50) / field536;
                method2(class134.field2303 + class2.field21 + class2.field27 + var15 + "%" + class2.field26, false);
            } else if (field539 == 2) {
                if (field610 > field538) {
                    field538 = field610;
                }
                int var16 = (field538 * 50 - field610 * 50) / field538 + 50;
                method2(class134.field2303 + class2.field21 + class2.field27 + var16 + "%" + class2.field26, false);
            } else {
                method2(class134.field2303, false);
            }
        } else if (field530 == 30) {
            method255();
        } else if (field530 == 40) {
            method2(class134.field2081 + class2.field21 + class134.field2082, false);
        }
        if (field530 == 30 && field480 == 0 && !field1328) {
            try {
                Graphics var17 = Statics.field13.getGraphics();
                for (int var18 = 0; var18 < field685; var18++) {
                    if (field688[var18]) {
                        Statics.field1552.method1580(var17, field690[var18], field691[var18], field504[var18], field693[var18]);
                        field688[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field13.repaint();
            }
        } else if (field530 > 0) {
            try {
                Graphics var20 = Statics.field13.getGraphics();
                Statics.field1552.method1563(var20, 0, 0);
                field1328 = false;
                for (int var21 = 0; var21 < field685; var21++) {
                    field688[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field13.repaint();
            }
        }
    }

    @ObfuscatedName("client.q(I)V")
    public final void method283() {
        if (Statics.field1759 != null) {
            Statics.field1759.field247 = false;
        }
        Statics.field1759 = null;
        if (Statics.field1423 != null) {
            Statics.field1423.method1357();
            Statics.field1423 = null;
        }
        class75.method180();
        class77.method571();
        Statics.field941 = null;
        if (Statics.field939 != null) {
            Statics.field939.method1157();
        }
        if (Statics.field748 != null) {
            Statics.field748.method1157();
        }
        if (Statics.field2521 != null) {
            Statics.field2521.method1357();
        }
        class157.method2858();
        class82.method172();
    }

    @ObfuscatedName("c.c(II)V")
    public static void method143(int arg0) {
        if (field530 == arg0) {
            return;
        }
        if (field530 == 0) {
            Statics.method165();
        }
        if (arg0 == 20 || arg0 == 40) {
            field497 = 0;
            field721 = 0;
            field517 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field274 != null) {
            Statics.field274.method1357();
            Statics.field274 = null;
        }
        if (field530 == 25) {
            field539 = 0;
            field598 = 0;
            field536 = 1;
            field610 = 0;
            field538 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method39(Statics.field13, Statics.field187, Statics.field60);
        } else {
            Statics.method613();
        }
        field530 = arg0;
    }

    @ObfuscatedName("client.z(I)V")
    public void method284() {
        if (field530 != 1000) {
            boolean var1 = class153.method2895();
            if (!var1) {
                this.method285();
            }
        }
    }

    @ObfuscatedName("client.s(S)V")
    public void method285() {
        if (class153.field2533 >= 4) {
            this.method1399("js5crc");
            field530 = 1000;
            return;
        }
        if (class153.field2525 >= 4) {
            if (field530 <= 5) {
                this.method1399("js5io");
                field530 = 1000;
                return;
            }
            field509 = 3000;
            class153.field2525 = 3;
        }
        if (--field509 + 1 > 0) {
            return;
        }
        try {
            if (field508 == 0) {
                Statics.field24 = Statics.field2703.method1452(Statics.field991, Statics.field17);
                field508++;
            }
            if (field508 == 1) {
                if (Statics.field24.field1414 == 2) {
                    this.method298(-1);
                    return;
                }
                if (Statics.field24.field1414 == 1) {
                    field508++;
                }
            }
            if (field508 == 2) {
                Statics.field745 = new class70((Socket) Statics.field24.field1420, Statics.field2703);
                class127 var1 = new class127(5);
                var1.method2455(15);
                var1.method2400(18);
                Statics.field745.method1362(var1.field2036, 0, 5);
                field508++;
                Statics.field2070 = class121.method245();
            }
            if (field508 == 3) {
                if (field530 <= 5 || Statics.field745.method1360() > 0) {
                    int var2 = Statics.field745.method1359();
                    if (var2 != 0) {
                        this.method298(var2);
                        return;
                    }
                    field508++;
                } else if (class121.method245() - Statics.field2070 > 30000L) {
                    this.method298(-2);
                    return;
                }
            }
            if (field508 == 4) {
                class70 var3 = Statics.field745;
                boolean var4 = field530 > 20;
                if (Statics.field2521 != null) {
                    try {
                        Statics.field2521.method1357();
                    } catch (Exception var14) {
                    }
                    Statics.field2521 = null;
                }
                Statics.field2521 = var3;
                class153.method2267(var4);
                class153.field2528.field2035 = 0;
                Statics.field2527 = null;
                Statics.field199 = null;
                class153.field2534 = 0;
                while (true) {
                    class155 var6 = (class155) class153.field2516.method3232();
                    if (var6 == null) {
                        while (true) {
                            class155 var7 = (class155) class153.field2515.method3232();
                            if (var7 == null) {
                                if (class153.field2520 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2455(4);
                                        var8.method2455(class153.field2520);
                                        var8.method2398(0);
                                        Statics.field2521.method1362(var8.field2036, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2521.method1357();
                                        } catch (Exception var12) {
                                        }
                                        class153.field2525++;
                                        Statics.field2521 = null;
                                    }
                                }
                                class153.field2523 = 0;
                                Statics.field2517 = class121.method245();
                                Statics.field24 = null;
                                Statics.field745 = null;
                                field508 = 0;
                                field514 = 0;
                                return;
                            }
                            class153.field2522.method3205(var7);
                            class153.field2524.method3234(var7, var7.field2816);
                            class153.field2529++;
                            class153.field2526--;
                        }
                    }
                    class153.field2518.method3234(var6, var6.field2816);
                    class153.field2519++;
                    class153.field2532--;
                }
            }
        } catch (IOException var15) {
            this.method298(-3);
        }
    }

    @ObfuscatedName("client.h(II)V")
    public void method298(int arg0) {
        Statics.field24 = null;
        Statics.field745 = null;
        field508 = 0;
        if (Statics.field302 == Statics.field17) {
            Statics.field17 = Statics.field2447;
        } else {
            Statics.field17 = Statics.field302;
        }
        field514++;
        if (field514 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field530 <= 5) {
                this.method1399("js5connect_full");
                field530 = 1000;
            } else {
                field509 = 3000;
            }
        } else if (field514 >= 2 && arg0 == 6) {
            this.method1399("js5connect_outofdate");
            field530 = 1000;
        } else if (field514 >= 4) {
            if (field530 <= 5) {
                this.method1399("js5connect");
                field530 = 1000;
            } else {
                field509 = 3000;
            }
        }
    }

    @ObfuscatedName("m.f(I)V")
    public static void method238() {
        if (field507 == 0) {
            Statics.field178 = new class95(4, 104, 104, class9.field135);
            for (int var0 = 0; var0 < 4; var0++) {
                field555[var0] = new class164(104, 104);
            }
            Statics.field1551 = new class86(512, 512);
            class21.field337 = class134.field2250;
            class21.field322 = 5;
            field507 = 20;
        } else if (field507 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1785[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1849(var1, 500, 800, 512, 334);
            class21.field337 = class134.field2084;
            class21.field322 = 10;
            field507 = 30;
        } else if (field507 == 30) {
            Statics.field401 = Statics.method765(0, false, true, true);
            Statics.field1755 = Statics.method765(1, false, true, true);
            Statics.field1386 = Statics.method765(2, true, false, true);
            Statics.field1451 = Statics.method765(3, false, true, true);
            Statics.field487 = Statics.method765(4, false, true, true);
            Statics.field281 = Statics.method765(5, true, true, true);
            Statics.field2320 = Statics.method765(6, true, true, false);
            Statics.field1444 = Statics.method765(7, false, true, true);
            Statics.field60 = Statics.method765(8, false, true, true);
            Statics.field297 = Statics.method765(9, false, true, true);
            Statics.field187 = Statics.method765(10, false, true, true);
            Statics.field1346 = Statics.method765(11, false, true, true);
            Statics.field511 = Statics.method765(12, false, true, true);
            Statics.field975 = Statics.method765(13, true, false, true);
            Statics.field512 = Statics.method765(14, false, true, false);
            Statics.field513 = Statics.method765(15, false, true, true);
            class21.field337 = class134.field2085;
            class21.field322 = 20;
            field507 = 40;
        } else if (field507 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field401.method3027() * 4 / 100;
            int var8 = var7 + Statics.field1755.method3027() * 4 / 100;
            int var9 = var8 + Statics.field1386.method3027() * 2 / 100;
            int var10 = var9 + Statics.field1451.method3027() * 2 / 100;
            int var11 = var10 + Statics.field487.method3027() * 6 / 100;
            int var12 = var11 + Statics.field281.method3027() * 4 / 100;
            int var13 = var12 + Statics.field2320.method3027() * 2 / 100;
            int var14 = var13 + Statics.field1444.method3027() * 60 / 100;
            int var15 = var14 + Statics.field60.method3027() * 2 / 100;
            int var16 = var15 + Statics.field297.method3027() * 2 / 100;
            int var17 = var16 + Statics.field187.method3027() * 2 / 100;
            int var18 = var17 + Statics.field1346.method3027() * 2 / 100;
            int var19 = var18 + Statics.field511.method3027() * 2 / 100;
            int var20 = var19 + Statics.field975.method3027() * 2 / 100;
            int var21 = var20 + Statics.field512.method3027() * 2 / 100;
            int var22 = var21 + Statics.field513.method3027() * 2 / 100;
            if (var22 == 100) {
                class21.field337 = class134.field2237;
                class21.field322 = 30;
                field507 = 45;
            } else {
                if (var22 != 0) {
                    class21.field337 = class134.field2294 + var22 + "%";
                }
                class21.field322 = 30;
            }
        } else if (field507 == 45) {
            boolean var23 = !field710;
            Statics.field1989 = 22050;
            Statics.field1125 = var23;
            Statics.field1108 = 2;
            class141 var24 = new class141();
            var24.method2776(9, 128);
            Statics.field939 = class52.method28(Statics.field2703, Statics.field13, 0, 22050);
            Statics.field939.method1159(var24);
            class154 var25 = Statics.field513;
            class154 var26 = Statics.field512;
            class154 var27 = Statics.field487;
            Statics.field2329 = var25;
            Statics.field2326 = var26;
            Statics.field1822 = var27;
            Statics.field174 = var24;
            Statics.field748 = class52.method28(Statics.field2703, Statics.field13, 1, 2048);
            Statics.field258 = new class46();
            Statics.field748.method1159(Statics.field258);
            Statics.field749 = new class62(22050, Statics.field1989);
            class21.field337 = class134.field2259;
            class21.field322 = 35;
            field507 = 50;
        } else if (field507 == 50) {
            int var28 = 0;
            if (Statics.field253 == null) {
                Statics.field253 = class84.method239(Statics.field60, Statics.field975, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1758 == null) {
                Statics.field1758 = class84.method239(Statics.field60, Statics.field975, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1333 == null) {
                Statics.field1333 = class84.method239(Statics.field60, Statics.field975, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class21.field337 = class134.field2089 + var28 * 100 / 3 + "%";
                class21.field322 = 40;
            } else {
                Statics.field1453 = new class151(true);
                class21.field337 = class134.field2090;
                class21.field322 = 40;
                field507 = 60;
            }
        } else if (field507 == 60) {
            class154 var29 = Statics.field187;
            class154 var30 = Statics.field60;
            int var31 = 0;
            if (var29.method2955("title.jpg", "")) {
                var31++;
            }
            if (var30.method2955("logo", "")) {
                var31++;
            }
            if (var30.method2955("titlebox", "")) {
                var31++;
            }
            if (var30.method2955("titlebutton", "")) {
                var31++;
            }
            if (var30.method2955("runes", "")) {
                var31++;
            }
            if (var30.method2955("title_mute", "")) {
                var31++;
            }
            var30.method2955("sl_back", "");
            var30.method2955("sl_flags", "");
            var30.method2955("sl_arrows", "");
            var30.method2955("sl_stars", "");
            var30.method2955("sl_button", "");
            byte var34 = 6;
            if (var31 < var34) {
                class21.field337 = class134.field2091 + var31 * 100 / var34 + "%";
                class21.field322 = 50;
            } else {
                class21.field337 = class134.field2092;
                class21.field322 = 50;
                method143(5);
                field507 = 70;
            }
        } else if (field507 == 70) {
            if (Statics.field1386.method2941()) {
                class154 var36 = Statics.field1386;
                Statics.field967 = var36;
                class33.method159(Statics.field1386);
                class154 var37 = Statics.field1386;
                class154 var38 = Statics.field1444;
                Statics.field947 = var37;
                Statics.field934 = var38;
                Statics.field935 = Statics.field947.method2947(3);
                class32.method639(Statics.field1386, Statics.field1444, field710);
                class31.method1978(Statics.field1386, Statics.field1444);
                class154 var39 = Statics.field1386;
                class154 var40 = Statics.field1444;
                boolean var41 = field484;
                class183 var42 = Statics.field253;
                Statics.field1011 = var39;
                Statics.field999 = var40;
                Statics.field1043 = var41;
                Statics.field1011.method2947(10);
                Statics.field1004 = var42;
                class34.method246(Statics.field1386, Statics.field401, Statics.field1755);
                class154 var43 = Statics.field1386;
                class154 var44 = Statics.field1444;
                Statics.field926 = var43;
                Statics.field915 = var44;
                class154 var45 = Statics.field1386;
                Statics.field971 = var45;
                class154 var46 = Statics.field1386;
                Statics.field1058 = var46;
                Statics.field1053 = Statics.field1058.method2947(16);
                class158.method210(Statics.field1451, Statics.field1444, Statics.field60, Statics.field975);
                class41.method811(Statics.field1386);
                class154 var47 = Statics.field1386;
                Statics.field980 = var47;
                class21.field337 = class134.field2226;
                class21.field322 = 60;
                field507 = 80;
            } else {
                class21.field337 = class134.field2093 + Statics.field1386.method3034() + "%";
                class21.field322 = 60;
            }
        } else if (field507 == 80) {
            int var48 = 0;
            if (Statics.field1981 == null) {
                Statics.field1981 = class84.method830(Statics.field60, "compass", "");
            } else {
                var48++;
            }
            if (Statics.field260 == null) {
                Statics.field260 = class84.method830(Statics.field60, "mapedge", "");
            } else {
                var48++;
            }
            if (Statics.field1842 == null) {
                Statics.field1842 = class84.method29(Statics.field60, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field395 == null) {
                Statics.field395 = class84.method812(Statics.field60, "mapfunction", "");
            } else {
                var48++;
            }
            if (Statics.field562 == null) {
                Statics.field562 = class84.method812(Statics.field60, "hitmarks", "");
            } else {
                var48++;
            }
            if (Statics.field2455 == null) {
                Statics.field2455 = class84.method812(Statics.field60, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field2433 == null) {
                Statics.field2433 = class84.method812(Statics.field60, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field84 == null) {
                Statics.field84 = class84.method812(Statics.field60, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field750 == null) {
                Statics.field750 = class84.method812(Statics.field60, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field238 == null) {
                Statics.field238 = class84.method812(Statics.field60, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field1372 == null) {
                Statics.field1372 = class84.method812(Statics.field60, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field1341 == null) {
                Statics.field1341 = class84.method29(Statics.field60, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field938 == null) {
                Statics.field938 = class84.method29(Statics.field60, "mod_icons", "");
            } else {
                var48++;
            }
            if (Statics.field1550 == null) {
                Statics.field1550 = class84.method170(Statics.field60, "mapback", "");
            } else {
                var48++;
            }
            if (var48 < 14) {
                class21.field337 = class134.field2227 + var48 * 100 / 14 + "%";
                class21.field322 = 70;
            } else {
                Statics.field2844 = Statics.field938;
                Statics.field260.method1637();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                for (int var53 = 0; var53 < Statics.field395.length; var53++) {
                    Statics.field395[var53].method1636(var49 + var52, var50 + var52, var51 + var52);
                }
                Statics.field1842[0].method1724(var49 + var52, var50 + var52, var51 + var52);
                Statics.field1197 = new int[33];
                Statics.field371 = new int[33];
                Statics.field563 = new int[151];
                Statics.field753 = new int[151];
                for (int var54 = 0; var54 < 33; var54++) {
                    int var55 = 999;
                    int var56 = 0;
                    for (int var57 = 0; var57 < 34; var57++) {
                        if (Statics.field1550.field1485[Statics.field1550.field1484 * var54 + var57] == 0) {
                            if (var55 == 999) {
                                var55 = var57;
                            }
                        } else if (var55 != 999) {
                            var56 = var57;
                            break;
                        }
                    }
                    Statics.field1197[var54] = var55;
                    Statics.field371[var54] = var56 - var55;
                }
                for (int var58 = 5; var58 < 156; var58++) {
                    int var59 = 999;
                    int var60 = 0;
                    for (int var61 = 25; var61 < 172; var61++) {
                        if (Statics.field1550.field1485[Statics.field1550.field1484 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                            if (var59 == 999) {
                                var59 = var61;
                            }
                        } else if (var59 != 999) {
                            var60 = var61;
                            break;
                        }
                    }
                    Statics.field563[var58 - 5] = var59 - 25;
                    Statics.field753[var58 - 5] = var60 - var59;
                }
                class21.field337 = class134.field2097;
                class21.field322 = 70;
                field507 = 90;
            }
        } else if (field507 == 90) {
            if (Statics.field297.method2941()) {
                class110 var62 = new class110(Statics.field297, Statics.field60, 20, 0.8D, field710 ? 64 : 128);
                class104.method2097(var62);
                class104.method2073(0.8D);
                class21.field337 = class134.field2096;
                class21.field322 = 90;
                field507 = 110;
            } else {
                class21.field337 = class134.field2260 + Statics.field297.method3034() + "%";
                class21.field322 = 90;
            }
        } else if (field507 == 110) {
            Statics.field1759 = new class16();
            Statics.field2703.method1454(Statics.field1759, 10);
            class21.field337 = class134.field2282;
            class21.field322 = 94;
            field507 = 120;
        } else if (field507 == 120) {
            if (Statics.field187.method2955("huffman", "")) {
                class120 var63 = new class120(Statics.field187.method2972("huffman", ""));
                Statics.field2834 = var63;
                class21.field337 = class134.field2101;
                class21.field322 = 96;
                field507 = 130;
            } else {
                class21.field337 = class134.field2083 + "%";
                class21.field322 = 96;
            }
        } else if (field507 == 130) {
            if (!Statics.field1451.method2941()) {
                class21.field337 = class134.field2199 + Statics.field1451.method3034() * 4 / 5 + "%";
                class21.field322 = 100;
            } else if (!Statics.field511.method2941()) {
                class21.field337 = class134.field2199 + (80 + Statics.field511.method3034() / 6) + "%";
                class21.field322 = 100;
            } else if (Statics.field975.method2941()) {
                class21.field337 = class134.field2150;
                class21.field322 = 100;
                field507 = 140;
            } else {
                class21.field337 = class134.field2199 + (96 + Statics.field975.method3034() / 20) + "%";
                class21.field322 = 100;
            }
        } else if (field507 == 140) {
            method143(10);
        }
    }

    @ObfuscatedName("h.y(I)V")
    public static void method167() {
        field490 = -1L;
        field493 = -1;
        Statics.field1759.field234 = 0;
        Statics.field185 = true;
        field668 = true;
        field708 = -1L;
        class182.field2830 = new class177();
        field540.field2035 = 0;
        field524.field2035 = 0;
        field526 = -1;
        field624 = -1;
        field584 = -1;
        field736 = -1;
        field579 = 0;
        field548 = 0;
        field529 = 0;
        field686 = 0;
        field506 = 0;
        field649 = false;
        class77.method1350(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field698[var0] = null;
        }
        field699 = 0;
        field638 = 0;
        field549 = false;
        field724 = 0;
        field715 = (int) (Math.random() * 100.0D) - 50;
        field635 = (int) (Math.random() * 110.0D) - 55;
        field553 = (int) (Math.random() * 80.0D) - 40;
        field606 = (int) (Math.random() * 120.0D) - 60;
        field558 = (int) (Math.random() * 30.0D) - 20;
        field571 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field718 = 0;
        field711 = -1;
        field716 = 0;
        field714 = 0;
        field503 = 0;
        field527 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field604[var1] = null;
            field609[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field670[var2] = null;
        }
        Statics.field2370 = field604[2047] = new class3();
        field620.method3266();
        field621.method3266();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field618[var3][var4][var5] = null;
                }
            }
        }
        field619 = new class177();
        field630 = 0;
        field666 = 0;
        for (int var6 = 0; var6 < Statics.field1053; var6++) {
            class42 var7 = class42.method1347(var6);
            if (var7 != null && var7.field1054 == 0) {
                class159.field2702[var6] = 0;
                class159.field2701[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field678.length; var8++) {
            field678[var8] = -1;
        }
        if (field644 != -1) {
            class158.method826(field644);
        }
        for (class4 var9 = (class4) field694.method3232(); var9 != null; var9 = (class4) field694.method3233()) {
            method2804(var9, true);
        }
        field644 = -1;
        field694 = new class175(8);
        field648 = null;
        field649 = false;
        field506 = 0;
        field742.method3149((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field650[var10] = null;
            field616[var10] = false;
        }
        class19.field285 = new class175(32);
        field488 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field687[var11] = true;
        }
        field515 = null;
        Statics.field251 = 0;
        Statics.field339 = null;
    }

    @ObfuscatedName("f.g(IB)V")
    public static void method169(int arg0) {
        if (arg0 == -3) {
            class21.method42(class134.field2107, class134.field2108, class134.field2109);
        } else if (arg0 == -2) {
            class21.method42(class134.field2073, class134.field2111, class134.field2159);
        } else if (arg0 == -1) {
            class21.method42(class134.field2113, class134.field2114, class134.field2115);
        } else if (arg0 == 3) {
            class21.method42(class134.field2128, class134.field2162, class134.field2118);
        } else if (arg0 == 4) {
            class21.method42(class134.field2119, class134.field2120, class134.field2121);
        } else if (arg0 == 5) {
            class21.method42(class134.field2122, class134.field2095, class134.field2124);
        } else if (arg0 == 6) {
            class21.method42(class134.field2105, class134.field2126, class134.field2086);
        } else if (arg0 == 7) {
            class21.method42(class134.field2240, class134.field2127, class134.field2130);
        } else if (arg0 == 8) {
            class21.method42(class134.field2131, class134.field2132, class134.field2133);
        } else if (arg0 == 9) {
            class21.method42(class134.field2134, class134.field2135, class134.field2136);
        } else if (arg0 == 10) {
            class21.method42(class134.field2104, class134.field2138, class134.field2116);
        } else if (arg0 == 11) {
            class21.method42(class134.field2140, class134.field2141, class134.field2142);
        } else if (arg0 == 12) {
            class21.method42(class134.field2143, class134.field2144, class134.field2145);
        } else if (arg0 == 13) {
            class21.method42(class134.field2079, class134.field2147, class134.field2148);
        } else if (arg0 == 14) {
            class21.method42(class134.field2149, class134.field2180, class134.field2151);
        } else if (arg0 == 16) {
            class21.method42(class134.field2152, class134.field2225, class134.field2146);
        } else if (arg0 == 17) {
            class21.method42(class134.field2155, class134.field2215, class134.field2157);
        } else if (arg0 == 18) {
            class21.method42(class134.field2158, class134.field2219, class134.field2099);
        } else if (arg0 == 19) {
            class21.method42(class134.field2161, class134.field2110, class134.field2230);
        } else if (arg0 == 20) {
            class21.method42(class134.field2164, class134.field2165, class134.field2160);
        } else if (arg0 == 22) {
            class21.method42(class134.field2167, class134.field2168, class134.field2169);
        } else if (arg0 == 23) {
            class21.method42(class134.field2170, class134.field2171, class134.field2266);
        } else if (arg0 == 24) {
            class21.method42(class134.field2173, class134.field2174, class134.field2175);
        } else if (arg0 == 25) {
            class21.method42(class134.field2176, class134.field2123, class134.field2178);
        } else if (arg0 == 26) {
            class21.method42(class134.field2179, class134.field2301, class134.field2181);
        } else if (arg0 == 27) {
            class21.method42(class134.field2182, class134.field2183, class134.field2184);
        } else if (arg0 == 31) {
            class21.method42(class134.field2194, class134.field2192, class134.field2193);
        } else if (arg0 == 32) {
            class21.method42(class134.field2074, class134.field2195, class134.field2100);
        } else if (arg0 == 37) {
            class21.method42(class134.field2197, class134.field2198, class134.field2275);
        } else if (arg0 == 38) {
            class21.method42(class134.field2200, class134.field2098, class134.field2202);
        } else if (arg0 == 55) {
            class21.method42(class134.field2203, class134.field2204, class134.field2205);
        } else {
            class21.method42(class134.field2206, class134.field2222, class134.field2208);
        }
        method143(10);
    }

    @ObfuscatedName("ba.v(I)V")
    public static final void method1271() {
        if (Statics.field1423 != null) {
            Statics.field1423.method1357();
            Statics.field1423 = null;
        }
        method1805();
        Statics.field178.method1875();
        for (int var0 = 0; var0 < 4; var0++) {
            field555[var0].method3151();
        }
        System.gc();
        class138.field2328 = 1;
        Statics.field2325 = null;
        Statics.field2327 = -1;
        Statics.field2716 = -1;
        Statics.field2330 = 0;
        Statics.field2024 = false;
        Statics.field2331 = 2;
        field720 = -1;
        field700 = false;
        class7.method572();
        method143(10);
    }

    @ObfuscatedName("cb.b(I)V")
    public static final void method1805() {
        class37.field952.method3192();
        class33.field874.method3192();
        class36.field936.method3192();
        class32.field822.method3192();
        class32.field823.method3192();
        class32.field859.method3192();
        class32.field865.method3192();
        class31.method603();
        class40.field1001.method3192();
        class40.field1023.method3192();
        class40.field1003.method3192();
        class34.method30();
        class35.field916.method3192();
        class35.field917.method3192();
        class38.field972.method3192();
        class42.field1056.method3192();
        class163.field2728.method3192();
        class158.field2688.method3192();
        class158.field2579.method3192();
        class158.field2580.method3192();
        ((class110) Statics.field1782).method2164();
        class5.field72.method3192();
        Statics.field401.method2950();
        Statics.field1755.method2950();
        Statics.field1451.method2950();
        Statics.field487.method2950();
        Statics.field281.method2950();
        Statics.field2320.method2950();
        Statics.field1444.method2950();
        Statics.field60.method2950();
        Statics.field297.method2950();
        Statics.field187.method2950();
        Statics.field1346.method2950();
        Statics.field511.method2950();
    }

    @ObfuscatedName("ah.j(B)V")
    public static final void method275() {
        if (field529 > 0) {
            method1271();
        } else {
            method143(40);
            Statics.field274 = Statics.field1423;
            Statics.field1423 = null;
        }
    }

    @ObfuscatedName("dv.m(I)V")
    public static final void method2159() {
        if (field548 > 1) {
            field548--;
        }
        if (field529 > 0) {
            field529--;
        }
        if (field533) {
            field533 = false;
            method275();
            return;
        }
        for (int var0 = 0; var0 < 100 && method41(); var0++) {
        }
        if (field530 != 30) {
            return;
        }
        class182.method2989(field540, 189);
        Object var1 = Statics.field1759.field244;
        synchronized (Statics.field1759.field244) {
            if (!field479) {
                Statics.field1759.field234 = 0;
            } else if (class77.field1410 != 0 || Statics.field1759.field234 >= 40) {
                field540.method2272(254);
                field540.method2455(0);
                int var2 = field540.field2035;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field1759.field234 && field540.field2035 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field1759.field236[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field1759.field235[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field1759.field236[var4] == -1 && Statics.field1759.field235[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field491 != var6 || field489 != var5) {
                        int var8 = var6 - field491;
                        field491 = var6;
                        int var9 = var5 - field489;
                        field489 = var5;
                        if (field493 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field540.method2398((field493 << 12) + (var8 << 6) + var9);
                            field493 = 0;
                        } else if (field493 < 8) {
                            field540.method2399((field493 << 19) + 8388608 + var7);
                            field493 = 0;
                        } else {
                            field540.method2400((field493 << 19) + -1073741824 + var7);
                            field493 = 0;
                        }
                    } else if (field493 < 2047) {
                        field493++;
                    }
                }
                field540.method2408(field540.field2035 - var2);
                if (var3 >= Statics.field1759.field234) {
                    Statics.field1759.field234 = 0;
                } else {
                    Statics.field1759.field234 -= var3;
                    for (int var10 = 0; var10 < Statics.field1759.field234; var10++) {
                        Statics.field1759.field235[var10] = Statics.field1759.field235[var3 + var10];
                        Statics.field1759.field236[var10] = Statics.field1759.field236[var3 + var10];
                    }
                }
            }
        }
        if (class77.field1410 != 0) {
            long var12 = (class77.field1407 - field490) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field490 = class77.field1407;
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
            if (class77.field1410 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field540.method2272(117);
            field540.method2400((var17 << 19) + (var18 << 20) + var16);
        }
        if (class75.field1376 > 0) {
            field540.method2272(25);
            field540.method2398(0);
            int var19 = field540.field2035;
            long var20 = class121.method245();
            for (int var22 = 0; var22 < class75.field1376; var22++) {
                long var23 = var20 - field708;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field708 = var20;
                field540.method2448((int) var23);
                field540.method2433(class75.field1382[var22]);
            }
            field540.method2407(field540.field2035 - var19);
        }
        if (field522 > 0) {
            field522--;
        }
        if (class75.field1364[96] || class75.field1364[97] || class75.field1364[98] || class75.field1364[99]) {
            field575 = true;
        }
        if (field575 && field522 <= 0) {
            field522 = 20;
            field575 = false;
            field540.method2272(50);
            field540.method2398(field737);
            field540.method2398(field571);
        }
        if (Statics.field185 && !field668) {
            field668 = true;
            field540.method2272(127);
            field540.method2455(1);
        }
        if (!Statics.field185 && field668) {
            field668 = false;
            field540.method2272(127);
            field540.method2455(0);
        }
        if (field710 && Statics.field54 != field534) {
            method177(Statics.field1456, Statics.field410, Statics.field54, Statics.field2370.field470[0], Statics.field2370.field471[0]);
        } else if (Statics.field54 != field711) {
            field711 = Statics.field54;
            int var25 = Statics.field54;
            int[] var26 = Statics.field1551.field1479;
            int var27 = var26.length;
            for (int var28 = 0; var28 < var27; var28++) {
                var26[var28] = 0;
            }
            for (int var29 = 1; var29 < 103; var29++) {
                int var30 = (103 - var29) * 2048 + 24628;
                for (int var31 = 1; var31 < 103; var31++) {
                    if ((class9.field118[var25][var31][var29] & 0x18) == 0) {
                        Statics.field178.method1848(var26, var30, 512, var25, var31, var29);
                    }
                    if (var25 < 3 && (class9.field118[var25 + 1][var31][var29] & 0x8) != 0) {
                        Statics.field178.method1848(var26, var30, 512, var25 + 1, var31, var29);
                    }
                    var30 += 4;
                }
            }
            int var32 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var33 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1551.method1635();
            for (int var34 = 1; var34 < 103; var34++) {
                for (int var35 = 1; var35 < 103; var35++) {
                    if ((class9.field118[var25][var35][var34] & 0x18) == 0) {
                        method46(var25, var35, var34, var32, var33);
                    }
                    if (var25 < 3 && (class9.field118[var25 + 1][var35][var34] & 0x8) != 0) {
                        method46(var25 + 1, var35, var34, var32, var33);
                    }
                }
            }
            field712 = 0;
            for (int var36 = 0; var36 < 104; var36++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    int var38 = Statics.field178.method1899(Statics.field54, var36, var37);
                    if (var38 != 0) {
                        int var39 = var38 >> 14 & 0x7FFF;
                        int var40 = class32.method1806(var39).field848;
                        if (var40 >= 0) {
                            int var41 = var36;
                            int var42 = var37;
                            if (var40 != 22 && var40 != 29 && var40 != 34 && var40 != 36 && var40 != 46 && var40 != 47 && var40 != 48) {
                                int[][] var43 = field555[Statics.field54].field2745;
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
                            field611[field712] = Statics.field395[var40];
                            field730[field712] = var41;
                            field485[field712] = var42;
                            field712++;
                        }
                    }
                }
            }
            Statics.field1552.method1627();
        }
        if (field530 != 30) {
            return;
        }
        method36();
        method2661();
        field579++;
        if (field579 <= 750) {
            for (int var46 = -1; var46 < field503; var46++) {
                int var47;
                if (var46 == -1) {
                    var47 = 2047;
                } else {
                    var47 = field701[var46];
                }
                class3 var48 = field604[var47];
                if (var48 != null) {
                    method1982(var48, 1);
                }
            }
            for (int var49 = 0; var49 < field527; var49++) {
                int var50 = field521[var49];
                class25 var51 = field670[var50];
                if (var51 != null) {
                    method1982(var51, var51.field397.field793);
                }
            }
            for (int var52 = -1; var52 < field503; var52++) {
                int var53;
                if (var52 == -1) {
                    var53 = 2047;
                } else {
                    var53 = field701[var52];
                }
                class3 var54 = field604[var53];
                if (var54 != null && var54.field445 > 0) {
                    var54.field445--;
                    if (var54.field445 == 0) {
                        var54.field430 = null;
                    }
                }
            }
            for (int var55 = 0; var55 < field527; var55++) {
                int var56 = field521[var55];
                class25 var57 = field670[var56];
                if (var57 != null && var57.field445 > 0) {
                    var57.field445--;
                    if (var57.field445 == 0) {
                        var57.field430 = null;
                    }
                }
            }
            field561++;
            if (field594 != 0) {
                field660 += 20;
                if (field660 >= 400) {
                    field594 = 0;
                }
            }
            if (Statics.field2450 != null) {
                field595++;
                if (field595 >= 15) {
                    Statics.method26(Statics.field2450);
                    Statics.field2450 = null;
                }
            }
            if (Statics.field1457 != null) {
                Statics.method26(Statics.field1457);
                field602++;
                if (class77.field1398 > field531 + 5 || class77.field1398 < field531 - 5 || class77.field1395 > field599 + 5 || class77.field1395 < field599 - 5) {
                    field601 = true;
                }
                if (class77.field1397 == 0) {
                    if (!field601 || field602 < 5) {
                        label1041: {
                            label811: {
                                if (field625 != 1) {
                                    int var64 = field506 - 1;
                                    boolean var65;
                                    if (var64 < 0) {
                                        var65 = false;
                                    } else {
                                        int var66 = field664[var64];
                                        if (var66 >= 2000) {
                                            var66 -= 2000;
                                        }
                                        if (var66 == 1007) {
                                            var65 = true;
                                        } else {
                                            var65 = false;
                                        }
                                    }
                                    if (!var65) {
                                        break label811;
                                    }
                                }
                                if (field506 > 2) {
                                    method2656();
                                    break label1041;
                                }
                            }
                            if (field506 > 0) {
                                method129(field506 - 1);
                            }
                        }
                    } else if (Statics.field255 == Statics.field1457 && field713 != field600) {
                        class158 var58 = Statics.field1457;
                        byte var59 = 0;
                        if (field516 == 1 && var58.field2694 == 206) {
                            var59 = 1;
                        }
                        if (var58.field2609[field600] <= 0) {
                            var59 = 0;
                        }
                        if (class162.method2644(method2857(var58))) {
                            int var60 = field713;
                            int var61 = field600;
                            var58.field2609[var61] = var58.field2609[var60];
                            var58.field2603[var61] = var58.field2603[var60];
                            var58.field2609[var60] = -1;
                            var58.field2603[var60] = 0;
                        } else if (var59 == 1) {
                            int var62 = field713;
                            int var63 = field600;
                            while (var62 != var63) {
                                if (var62 > var63) {
                                    var58.method3060(var62 - 1, var62);
                                    var62--;
                                } else if (var62 < var63) {
                                    var58.method3060(var62 + 1, var62);
                                    var62++;
                                }
                            }
                        } else {
                            var58.method3060(field600, field713);
                        }
                        field540.method2272(72);
                        field540.method2455(var59);
                        field540.method2442(field713);
                        field540.method2527(field600);
                        field540.method2400(Statics.field1457.field2583);
                    }
                    field595 = 10;
                    class77.field1410 = 0;
                    Statics.field1457 = null;
                }
            }
            class158 var67 = Statics.field277;
            class158 var68 = Statics.field411;
            Statics.field277 = null;
            Statics.field411 = null;
            field659 = null;
            field626 = false;
            field746 = false;
            for (field705 = 0; class75.method1331() && field705 < 128; field705++) {
                field633[field705] = Statics.field1369;
                field706[field705] = Statics.field271;
            }
            method375(field644, 0, 0, 765, 503, 0, 0);
            field667++;
            while (true) {
                class1 var69;
                class158 var70;
                class158 var71;
                do {
                    var69 = (class1) field682.method3274();
                    if (var69 == null) {
                        while (true) {
                            class1 var72;
                            class158 var73;
                            class158 var74;
                            do {
                                var72 = (class1) field683.method3274();
                                if (var72 == null) {
                                    while (true) {
                                        class1 var75;
                                        class158 var76;
                                        class158 var77;
                                        do {
                                            var75 = (class1) field681.method3274();
                                            if (var75 == null) {
                                                if (field655 != null) {
                                                    method144();
                                                }
                                                if (class95.field1589 != -1) {
                                                    int var78 = class95.field1589;
                                                    int var79 = class95.field1590;
                                                    boolean var80 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var78, var79, true, 0, 0, 0, 0, 0, 0);
                                                    class95.field1589 = -1;
                                                    if (var80) {
                                                        field591 = class77.field1399;
                                                        field477 = class77.field1400;
                                                        field594 = 1;
                                                        field660 = 0;
                                                    }
                                                }
                                                method61();
                                                if (Statics.field277 != var67) {
                                                    if (var67 != null) {
                                                        Statics.method26(var67);
                                                    }
                                                    if (Statics.field277 != null) {
                                                        Statics.method26(Statics.field277);
                                                    }
                                                }
                                                if (Statics.field411 != var68 && field636 == field496) {
                                                    if (var68 != null) {
                                                        Statics.method26(var68);
                                                    }
                                                    if (Statics.field411 != null) {
                                                        Statics.method26(Statics.field411);
                                                    }
                                                }
                                                if (Statics.field411 == null) {
                                                    if (field636 > 0) {
                                                        field636--;
                                                    }
                                                } else if (field636 < field496) {
                                                    field636++;
                                                    if (field636 == field496) {
                                                        Statics.method26(Statics.field411);
                                                    }
                                                }
                                                int var81 = field715 + Statics.field2370.field473;
                                                int var82 = field635 + Statics.field2370.field442;
                                                if (Statics.field2030 - var81 < -500 || Statics.field2030 - var81 > 500 || Statics.field1055 - var82 < -500 || Statics.field1055 - var82 > 500) {
                                                    Statics.field2030 = var81;
                                                    Statics.field1055 = var82;
                                                }
                                                if (Statics.field2030 != var81) {
                                                    Statics.field2030 += (var81 - Statics.field2030) / 16;
                                                }
                                                if (Statics.field1055 != var82) {
                                                    Statics.field1055 += (var82 - Statics.field1055) / 16;
                                                }
                                                if (class75.field1364[96]) {
                                                    field645 += (-24 - field645) / 2;
                                                } else if (class75.field1364[97]) {
                                                    field645 += (24 - field645) / 2;
                                                } else {
                                                    field645 /= 2;
                                                }
                                                if (class75.field1364[98]) {
                                                    field573 += (12 - field573) / 2;
                                                } else if (class75.field1364[99]) {
                                                    field573 += (-12 - field573) / 2;
                                                } else {
                                                    field573 /= 2;
                                                }
                                                field571 = field645 / 2 + field571 & 0x7FF;
                                                field737 += field573 / 2;
                                                if (field737 < 128) {
                                                    field737 = 128;
                                                }
                                                if (field737 > 383) {
                                                    field737 = 383;
                                                }
                                                int var83 = Statics.field2030 >> 7;
                                                int var84 = Statics.field1055 >> 7;
                                                int var85 = method13(Statics.field2030, Statics.field1055, Statics.field54);
                                                int var86 = 0;
                                                if (var83 > 3 && var84 > 3 && var83 < 100 && var84 < 100) {
                                                    for (int var87 = var83 - 4; var87 <= var83 + 4; var87++) {
                                                        for (int var88 = var84 - 4; var88 <= var84 + 4; var88++) {
                                                            int var89 = Statics.field54;
                                                            if (var89 < 3 && (class9.field118[1][var87][var88] & 0x2) == 2) {
                                                                var89++;
                                                            }
                                                            int var90 = var85 - class9.field135[var89][var87][var88];
                                                            if (var90 > var86) {
                                                                var86 = var90;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var91 = var86 * 192;
                                                if (var91 > 98048) {
                                                    var91 = 98048;
                                                }
                                                if (var91 < 32768) {
                                                    var91 = 32768;
                                                }
                                                if (var91 > field576) {
                                                    field576 += (var91 - field576) / 24;
                                                } else if (var91 < field576) {
                                                    field576 += (var91 - field576) / 80;
                                                }
                                                if (field482) {
                                                    int var92 = Statics.field883 * 128 + 64;
                                                    int var93 = Statics.field1616 * 128 + 64;
                                                    int var94 = method13(var92, var93, Statics.field54) - Statics.field2709;
                                                    if (Statics.field396 < var92) {
                                                        Statics.field396 += Statics.field1312 * (var92 - Statics.field396) / 1000 + Statics.field241;
                                                        if (Statics.field396 > var92) {
                                                            Statics.field396 = var92;
                                                        }
                                                    }
                                                    if (Statics.field396 > var92) {
                                                        Statics.field396 -= Statics.field1312 * (Statics.field396 - var92) / 1000 + Statics.field241;
                                                        if (Statics.field396 < var92) {
                                                            Statics.field396 = var92;
                                                        }
                                                    }
                                                    if (Statics.field767 < var94) {
                                                        Statics.field767 += Statics.field1312 * (var94 - Statics.field767) / 1000 + Statics.field241;
                                                        if (Statics.field767 > var94) {
                                                            Statics.field767 = var94;
                                                        }
                                                    }
                                                    if (Statics.field767 > var94) {
                                                        Statics.field767 -= Statics.field1312 * (Statics.field767 - var94) / 1000 + Statics.field241;
                                                        if (Statics.field767 < var94) {
                                                            Statics.field767 = var94;
                                                        }
                                                    }
                                                    if (Statics.field1791 < var93) {
                                                        Statics.field1791 += Statics.field1312 * (var93 - Statics.field1791) / 1000 + Statics.field241;
                                                        if (Statics.field1791 > var93) {
                                                            Statics.field1791 = var93;
                                                        }
                                                    }
                                                    if (Statics.field1791 > var93) {
                                                        Statics.field1791 -= Statics.field1312 * (Statics.field1791 - var93) / 1000 + Statics.field241;
                                                        if (Statics.field1791 < var93) {
                                                            Statics.field1791 = var93;
                                                        }
                                                    }
                                                    int var95 = Statics.field1274 * 128 + 64;
                                                    int var96 = Statics.field2032 * 128 + 64;
                                                    int var97 = method13(var95, var96, Statics.field54) - Statics.field2310;
                                                    int var98 = var95 - Statics.field396;
                                                    int var99 = var97 - Statics.field767;
                                                    int var100 = var96 - Statics.field1791;
                                                    int var101 = (int) Math.sqrt((double) (var98 * var98 + var100 * var100));
                                                    int var102 = (int) (Math.atan2((double) var99, (double) var101) * 325.949D) & 0x7FF;
                                                    int var103 = (int) (Math.atan2((double) var98, (double) var100) * -325.949D) & 0x7FF;
                                                    if (var102 < 128) {
                                                        var102 = 128;
                                                    }
                                                    if (var102 > 383) {
                                                        var102 = 383;
                                                    }
                                                    if (Statics.field413 < var102) {
                                                        Statics.field413 += Statics.field1654 * (var102 - Statics.field413) / 1000 + Statics.field343;
                                                        if (Statics.field413 > var102) {
                                                            Statics.field413 = var102;
                                                        }
                                                    }
                                                    if (Statics.field413 > var102) {
                                                        Statics.field413 -= Statics.field1654 * (Statics.field413 - var102) / 1000 + Statics.field343;
                                                        if (Statics.field413 < var102) {
                                                            Statics.field413 = var102;
                                                        }
                                                    }
                                                    int var104 = var103 - Statics.field1671;
                                                    if (var104 > 1024) {
                                                        var104 -= 2048;
                                                    }
                                                    if (var104 < -1024) {
                                                        var104 += 2048;
                                                    }
                                                    if (var104 > 0) {
                                                        Statics.field1671 += Statics.field1654 * var104 / 1000 + Statics.field343;
                                                        Statics.field1671 &= 0x7FF;
                                                    }
                                                    if (var104 < 0) {
                                                        Statics.field1671 -= Statics.field1654 * -var104 / 1000 + Statics.field343;
                                                        Statics.field1671 &= 0x7FF;
                                                    }
                                                    int var105 = var103 - Statics.field1671;
                                                    if (var105 > 1024) {
                                                        var105 -= 2048;
                                                    }
                                                    if (var105 < -1024) {
                                                        var105 += 2048;
                                                    }
                                                    if (var105 < 0 && var104 > 0 || var105 > 0 && var104 < 0) {
                                                        Statics.field1671 = var103;
                                                    }
                                                }
                                                for (int var106 = 0; var106 < 5; var106++) {
                                                    int var10002 = field735[var106]++;
                                                }
                                                int var107 = ++class77.field1393 - 1;
                                                int var109 = class75.field1357;
                                                if (var107 > 15000 && var109 > 15000) {
                                                    field529 = 250;
                                                    class77.method1350(14500);
                                                    field540.method2272(209);
                                                }
                                                field740++;
                                                if (field740 > 500) {
                                                    field740 = 0;
                                                    int var111 = (int) (Math.random() * 8.0D);
                                                    if ((var111 & 0x1) == 1) {
                                                        field715 += field550;
                                                    }
                                                    if ((var111 & 0x2) == 2) {
                                                        field635 += field552;
                                                    }
                                                    if ((var111 & 0x4) == 4) {
                                                        field553 += field554;
                                                    }
                                                }
                                                if (field715 < -50) {
                                                    field550 = 2;
                                                }
                                                if (field715 > 50) {
                                                    field550 = -2;
                                                }
                                                if (field635 < -55) {
                                                    field552 = 2;
                                                }
                                                if (field635 > 55) {
                                                    field552 = -2;
                                                }
                                                if (field553 < -40) {
                                                    field554 = 1;
                                                }
                                                if (field553 > 40) {
                                                    field554 = -1;
                                                }
                                                field703++;
                                                if (field703 > 500) {
                                                    field703 = 0;
                                                    int var112 = (int) (Math.random() * 8.0D);
                                                    if ((var112 & 0x1) == 1) {
                                                        field606 += field557;
                                                    }
                                                    if ((var112 & 0x2) == 2) {
                                                        field558 += field559;
                                                    }
                                                }
                                                if (field606 < -60) {
                                                    field557 = 2;
                                                }
                                                if (field606 > 60) {
                                                    field557 = -2;
                                                }
                                                if (field558 < -20) {
                                                    field559 = 1;
                                                }
                                                if (field558 > 10) {
                                                    field559 = -1;
                                                }
                                                for (class28 var113 = (class28) field492.method3215(); var113 != null; var113 = (class28) field492.method3223()) {
                                                    if ((long) var113.field754 < class121.method245() / 1000L - 5L) {
                                                        if (var113.field751 > 0) {
                                                            method128(5, "", var113.field757 + class134.field2211);
                                                        }
                                                        if (var113.field751 == 0) {
                                                            method128(5, "", var113.field757 + class134.field2212);
                                                        }
                                                        var113.method3287();
                                                    }
                                                }
                                                field528++;
                                                if (field528 > 50) {
                                                    field540.method2272(26);
                                                }
                                                try {
                                                    if (Statics.field1423 != null && field540.field2035 > 0) {
                                                        Statics.field1423.method1362(field540.field2036, 0, field540.field2035);
                                                        field540.field2035 = 0;
                                                        field528 = 0;
                                                    }
                                                } catch (IOException var115) {
                                                    method275();
                                                }
                                                return;
                                            }
                                            var76 = var75.field2;
                                            if (var76.field2584 < 0) {
                                                break;
                                            }
                                            var77 = class158.method2064(var76.field2697);
                                        } while (var77 == null || var77.field2691 == null || var76.field2584 >= var77.field2691.length || var77.field2691[var76.field2584] != var76);
                                        class26.method22(var75);
                                    }
                                }
                                var73 = var72.field2;
                                if (var73.field2584 < 0) {
                                    break;
                                }
                                var74 = class158.method2064(var73.field2697);
                            } while (var74 == null || var74.field2691 == null || var73.field2584 >= var74.field2691.length || var74.field2691[var73.field2584] != var73);
                            class26.method22(var72);
                        }
                    }
                    var70 = var69.field2;
                    if (var70.field2584 < 0) {
                        break;
                    }
                    var71 = class158.method2064(var70.field2697);
                } while (var71 == null || var71.field2691 == null || var70.field2584 >= var71.field2691.length || var71.field2691[var70.field2584] != var70);
                class26.method22(var69);
            }
        } else if (field529 > 0) {
            method1271();
        } else {
            method143(40);
            Statics.field274 = Statics.field1423;
            Statics.field1423 = null;
        }
    }

    @ObfuscatedName("ch.k(I)V")
    public static final void method2065() {
        if (Statics.field748 != null) {
            Statics.field748.method1158();
        }
        if (Statics.field939 != null) {
            Statics.field939.method1158();
        }
    }

    @ObfuscatedName("ey.u(B)V")
    public static final void method2661() {
        for (int var0 = 0; var0 < field724; var0++) {
            int var10002 = field727[var0]--;
            if (field727[var0] >= -10) {
                class57 var2 = field532[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1243(Statics.field487, field578[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field727[var0] += var2.method1245();
                    field532[var0] = var2;
                }
                if (field727[var0] < 0) {
                    int var9;
                    if (field728[var0] == 0) {
                        var9 = field574;
                    } else {
                        int var3 = (field728[var0] & 0xFF) * 128;
                        int var4 = field728[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2370.field473;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field728[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2370.field442;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field727[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field723 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1244().method1302(Statics.field749);
                        class45 var11 = class45.method953(var10, 100, var9);
                        var11.method956(field726[var0] - 1);
                        Statics.field258.method1094(var11);
                    }
                    field727[var0] = -100;
                }
            } else {
                field724--;
                for (int var1 = var0; var1 < field724; var1++) {
                    field578[var1] = field578[var1 + 1];
                    field532[var1] = field532[var1 + 1];
                    field726[var1] = field726[var1 + 1];
                    field727[var1] = field727[var1 + 1];
                    field728[var1] = field728[var1 + 1];
                }
                var0--;
            }
        }
        if (field700 && !class138.method201()) {
            if (field719 != 0 && field720 != -1) {
                class138.method2147(Statics.field2320, field720, 0, field719, false);
            }
            field700 = false;
        }
    }

    @ObfuscatedName("cm.i(Lav;IIII)V")
    public static void method1601(class34 arg0, int arg1, int arg2, int arg3) {
        if (field724 >= 50 || field723 == 0 || arg0.field901 == null || arg1 >= arg0.field901.length) {
            return;
        }
        int var4 = arg0.field901[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field578[field724] = var5;
        field726[field724] = var6;
        field727[field724] = 0;
        field532[field724] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field728[field724] = (var8 << 16) + (var9 << 8) + var7;
        field724++;
    }

    @ObfuscatedName("ag.ah(II)V")
    public static void method548(int arg0) {
        if (arg0 == -1 && !field700) {
            Statics.field174.method2712();
            class138.field2328 = 1;
            Statics.field2325 = null;
        } else if (arg0 != -1 && field720 != arg0 && field719 != 0 && !field700) {
            class154 var1 = Statics.field2320;
            int var2 = field719;
            class138.field2328 = 1;
            Statics.field2325 = var1;
            Statics.field2327 = arg0;
            Statics.field2716 = 0;
            Statics.field2330 = var2;
            Statics.field2024 = false;
            Statics.field2331 = 2;
        }
        field720 = arg0;
    }

    @ObfuscatedName("t.ag(III)V")
    public static void method124(int arg0, int arg1) {
        if (field719 != 0 && arg0 != -1) {
            class138.method2147(Statics.field1346, arg0, 0, field719, false);
            field700 = true;
        }
    }

    @ObfuscatedName("v.ay(IIB)V")
    public static final void method200(int arg0, int arg1) {
        if (field718 != 0 && field718 != 3 || class77.field1410 != 1) {
            return;
        }
        int var2 = class77.field1399 - 25 - arg0;
        int var3 = class77.field1400 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field606 + field571 & 0x7FF;
        int var5 = class104.field1785[var4];
        int var6 = class104.field1786[var4];
        int var7 = (field558 + 256) * var5 >> 8;
        int var8 = (field558 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field2370.field473 + var9 >> 7;
        int var12 = Statics.field2370.field442 - var10 >> 7;
        boolean var13 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field540.method2455(var2);
        field540.method2455(var3);
        field540.method2398(field571);
        field540.method2455(57);
        field540.method2455(field606);
        field540.method2455(field558);
        field540.method2455(89);
        field540.method2398(Statics.field2370.field473);
        field540.method2398(Statics.field2370.field442);
        field540.method2455(field544);
        field540.method2455(63);
    }

    @ObfuscatedName("cs.as(Lah;II)V")
    public static final void method1982(class27 arg0, int arg1) {
        if (arg0.field461 > field658) {
            int var2 = arg0.field461 - field658;
            int var3 = arg0.field469 * 128 + arg0.field463 * 64;
            int var4 = arg0.field463 * 64 + arg0.field417 * 128;
            arg0.field473 += (var3 - arg0.field473) / var2;
            arg0.field442 += (var4 - arg0.field442) / var2;
            arg0.field436 = 0;
            if (arg0.field459 == 0) {
                arg0.field466 = 1024;
            }
            if (arg0.field459 == 1) {
                arg0.field466 = 1536;
            }
            if (arg0.field459 == 2) {
                arg0.field466 = 0;
            }
            if (arg0.field459 == 3) {
                arg0.field466 = 512;
            }
        } else if (arg0.field462 >= field658) {
            if (field658 == arg0.field462 || arg0.field447 == -1 || arg0.field418 != 0 || arg0.field449 + 1 > class34.method57(arg0.field447).field900[arg0.field448]) {
                int var5 = arg0.field462 - arg0.field461;
                int var6 = field658 - arg0.field461;
                int var7 = arg0.field469 * 128 + arg0.field463 * 64;
                int var8 = arg0.field463 * 64 + arg0.field417 * 128;
                int var9 = arg0.field463 * 64 + arg0.field458 * 128;
                int var10 = arg0.field463 * 64 + arg0.field460 * 128;
                arg0.field473 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field442 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field436 = 0;
            if (arg0.field459 == 0) {
                arg0.field466 = 1024;
            }
            if (arg0.field459 == 1) {
                arg0.field466 = 1536;
            }
            if (arg0.field459 == 2) {
                arg0.field466 = 0;
            }
            if (arg0.field459 == 3) {
                arg0.field466 = 512;
            }
            arg0.field419 = arg0.field466;
        } else {
            method2268(arg0);
        }
        if (arg0.field473 < 128 || arg0.field442 < 128 || arg0.field473 >= 13184 || arg0.field442 >= 13184) {
            arg0.field447 = -1;
            arg0.field433 = -1;
            arg0.field461 = 0;
            arg0.field462 = 0;
            arg0.field473 = arg0.field470[0] * 128 + arg0.field463 * 64;
            arg0.field442 = arg0.field471[0] * 128 + arg0.field463 * 64;
            arg0.method270();
        }
        if (Statics.field2370 == arg0 && (arg0.field473 < 1536 || arg0.field442 < 1536 || arg0.field473 >= 11776 || arg0.field442 >= 11776)) {
            arg0.field447 = -1;
            arg0.field433 = -1;
            arg0.field461 = 0;
            arg0.field462 = 0;
            arg0.field473 = arg0.field470[0] * 128 + arg0.field463 * 64;
            arg0.field442 = arg0.field471[0] * 128 + arg0.field463 * 64;
            arg0.method270();
        }
        if (arg0.field468 != 0) {
            if (arg0.field421 != -1 && arg0.field421 < 32768) {
                class25 var11 = field670[arg0.field421];
                if (var11 != null) {
                    int var12 = arg0.field473 - var11.field473;
                    int var13 = arg0.field442 - var11.field442;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field466 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field421 >= 32768) {
                int var14 = arg0.field421 - 32768;
                if (field689 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field604[var14];
                if (var15 != null) {
                    int var16 = arg0.field473 - var15.field473;
                    int var17 = arg0.field442 - var15.field442;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field466 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field429 != 0 || arg0.field443 != 0) && (arg0.field455 == 0 || arg0.field436 > 0)) {
                int var18 = arg0.field473 - (arg0.field429 * 64 - Statics.field374 * 64 - Statics.field374 * 64);
                int var19 = arg0.field442 - (arg0.field443 * 64 - Statics.field872 * 64 - Statics.field872 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field466 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field429 = 0;
                arg0.field443 = 0;
            }
            int var20 = arg0.field466 - arg0.field419 & 0x7FF;
            if (var20 == 0) {
                arg0.field467 = 0;
            } else {
                arg0.field467++;
                if (var20 > 1024) {
                    arg0.field419 -= arg0.field468;
                    boolean var21 = true;
                    if (var20 < arg0.field468 || var20 > 2048 - arg0.field468) {
                        arg0.field419 = arg0.field466;
                        var21 = false;
                    }
                    if (arg0.field444 == arg0.field422 && (arg0.field467 > 25 || var21)) {
                        if (arg0.field423 == -1) {
                            arg0.field444 = arg0.field434;
                        } else {
                            arg0.field444 = arg0.field423;
                        }
                    }
                } else {
                    arg0.field419 += arg0.field468;
                    boolean var22 = true;
                    if (var20 < arg0.field468 || var20 > 2048 - arg0.field468) {
                        arg0.field419 = arg0.field466;
                        var22 = false;
                    }
                    if (arg0.field444 == arg0.field422 && (arg0.field467 > 25 || var22)) {
                        if (arg0.field424 == -1) {
                            arg0.field444 = arg0.field434;
                        } else {
                            arg0.field444 = arg0.field424;
                        }
                    }
                }
                arg0.field419 &= 0x7FF;
            }
        }
        method1348(arg0);
    }

    @ObfuscatedName("ds.aq(Lah;I)V")
    public static final void method2268(class27 arg0) {
        arg0.field444 = arg0.field422;
        if (arg0.field455 == 0) {
            arg0.field436 = 0;
            return;
        }
        if (arg0.field447 != -1 && arg0.field418 == 0) {
            class34 var1 = class34.method57(arg0.field447);
            if (arg0.field472 > 0 && var1.field909 == 0) {
                arg0.field436++;
                return;
            }
            if (arg0.field472 <= 0 && var1.field910 == 0) {
                arg0.field436++;
                return;
            }
        }
        int var2 = arg0.field473;
        int var3 = arg0.field442;
        int var4 = arg0.field470[arg0.field455 - 1] * 128 + arg0.field463 * 64;
        int var5 = arg0.field471[arg0.field455 - 1] * 128 + arg0.field463 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field473 = var4;
            arg0.field442 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field466 = 1280;
            } else if (var3 > var5) {
                arg0.field466 = 1792;
            } else {
                arg0.field466 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field466 = 768;
            } else if (var3 > var5) {
                arg0.field466 = 256;
            } else {
                arg0.field466 = 512;
            }
        } else if (var3 < var5) {
            arg0.field466 = 1024;
        } else if (var3 > var5) {
            arg0.field466 = 0;
        }
        int var6 = arg0.field466 - arg0.field419 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field426;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field434;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field428;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field427;
        }
        if (var7 == -1) {
            var7 = arg0.field434;
        }
        arg0.field444 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field397.field813;
        }
        if (var9) {
            if (arg0.field466 != arg0.field419 && arg0.field421 == -1 && arg0.field468 != 0) {
                var8 = 2;
            }
            if (arg0.field455 > 2) {
                var8 = 6;
            }
            if (arg0.field455 > 3) {
                var8 = 8;
            }
            if (arg0.field436 > 0 && arg0.field455 > 1) {
                var8 = 8;
                arg0.field436--;
            }
        } else {
            if (arg0.field455 > 1) {
                var8 = 6;
            }
            if (arg0.field455 > 2) {
                var8 = 8;
            }
            if (arg0.field436 > 0 && arg0.field455 > 1) {
                var8 = 8;
                arg0.field436--;
            }
        }
        if (arg0.field439[arg0.field455 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field444 == arg0.field434 && arg0.field431 != -1) {
            arg0.field444 = arg0.field431;
        }
        if (var2 < var4) {
            arg0.field473 += var8;
            if (arg0.field473 > var4) {
                arg0.field473 = var4;
            }
        } else if (var2 > var4) {
            arg0.field473 -= var8;
            if (arg0.field473 < var4) {
                arg0.field473 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field442 += var8;
            if (arg0.field442 > var5) {
                arg0.field442 = var5;
            }
        } else if (var3 > var5) {
            arg0.field442 -= var8;
            if (arg0.field442 < var5) {
                arg0.field442 = var5;
            }
        }
        if (arg0.field473 == var4 && arg0.field442 == var5) {
            arg0.field455--;
            if (arg0.field472 > 0) {
                arg0.field472--;
            }
        }
    }

    @ObfuscatedName("bc.am(Lah;B)V")
    public static final void method1348(class27 arg0) {
        arg0.field420 = false;
        if (arg0.field444 != -1) {
            class34 var1 = class34.method57(arg0.field444);
            if (var1 == null || var1.field898 == null) {
                arg0.field444 = -1;
            } else {
                arg0.field446++;
                if (arg0.field425 < var1.field898.length && arg0.field446 > var1.field900[arg0.field425]) {
                    arg0.field446 = 1;
                    arg0.field425++;
                    method1601(var1, arg0.field425, arg0.field473, arg0.field442);
                }
                if (arg0.field425 >= var1.field898.length) {
                    arg0.field446 = 0;
                    arg0.field425 = 0;
                    method1601(var1, arg0.field425, arg0.field473, arg0.field442);
                }
            }
        }
        if (arg0.field433 != -1 && field658 >= arg0.field435) {
            if (arg0.field453 < 0) {
                arg0.field453 = 0;
            }
            int var2 = class35.method2175(arg0.field433).field920;
            if (var2 == -1) {
                arg0.field433 = -1;
            } else {
                class34 var3 = class34.method57(var2);
                if (var3 == null || var3.field898 == null) {
                    arg0.field433 = -1;
                } else {
                    arg0.field454++;
                    if (arg0.field453 < var3.field898.length && arg0.field454 > var3.field900[arg0.field453]) {
                        arg0.field454 = 1;
                        arg0.field453++;
                        method1601(var3, arg0.field453, arg0.field473, arg0.field442);
                    }
                    if (arg0.field453 >= var3.field898.length && (arg0.field453 < 0 || arg0.field453 >= var3.field898.length)) {
                        arg0.field433 = -1;
                    }
                }
            }
        }
        if (arg0.field447 != -1 && arg0.field418 <= 1) {
            class34 var4 = class34.method57(arg0.field447);
            if (var4.field909 == 1 && arg0.field472 > 0 && arg0.field461 <= field658 && arg0.field462 < field658) {
                arg0.field418 = 1;
                return;
            }
        }
        if (arg0.field447 != -1 && arg0.field418 == 0) {
            class34 var5 = class34.method57(arg0.field447);
            if (var5 == null || var5.field898 == null) {
                arg0.field447 = -1;
            } else {
                arg0.field449++;
                if (arg0.field448 < var5.field898.length && arg0.field449 > var5.field900[arg0.field448]) {
                    arg0.field449 = 1;
                    arg0.field448++;
                    method1601(var5, arg0.field448, arg0.field473, arg0.field442);
                }
                if (arg0.field448 >= var5.field898.length) {
                    arg0.field448 -= var5.field897;
                    arg0.field451++;
                    if (arg0.field451 >= var5.field911) {
                        arg0.field447 = -1;
                    } else if (arg0.field448 >= 0 && arg0.field448 < var5.field898.length) {
                        method1601(var5, arg0.field448, arg0.field473, arg0.field442);
                    } else {
                        arg0.field447 = -1;
                    }
                }
                arg0.field420 = var5.field904;
            }
        }
        if (arg0.field418 > 0) {
            arg0.field418--;
        }
    }

    @ObfuscatedName("i.av(B)V")
    public static final void method255() {
        if (!field649) {
            field632[0] = class134.field2265;
            field580[0] = "";
            field664[0] = 1006;
            field506 = 1;
        }
        if (field644 != -1) {
            method48(field644);
        }
        for (int var0 = 0; var0 < field685; var0++) {
            if (field687[var0]) {
                field688[var0] = true;
            }
            field673[var0] = field687[var0];
            field687[var0] = false;
        }
        field593 = field658;
        field634 = -1;
        field725 = -1;
        Statics.field255 = null;
        if (field644 != -1) {
            field685 = 0;
            method1351(field644, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1739();
        method1345();
        if (field649) {
            int var1 = Statics.field1315;
            int var2 = Statics.field32;
            int var3 = Statics.field762;
            int var4 = Statics.field1409;
            int var5 = 6116423;
            class89.method1746(var1, var2, var3, var4, var5);
            class89.method1746(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class89.method1766(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            Statics.field1333.method3378(class134.field2217, var1 + 3, var2 + 14, var5, -1);
            int var6 = class77.field1398;
            int var7 = class77.field1395;
            for (int var8 = 0; var8 < field506; var8++) {
                int var9 = (field506 - 1 - var8) * 15 + var2 + 31;
                int var10 = 16777215;
                if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                    var10 = 16776960;
                }
                class183 var11 = Statics.field1333;
                String var12;
                if (field580[var8].length() > 0) {
                    var12 = field632[var8] + class134.field2224 + field580[var8];
                } else {
                    var12 = field632[var8];
                }
                var11.method3378(var12, var1 + 3, var9, var10, 0);
            }
            int var13 = Statics.field1315;
            int var14 = Statics.field32;
            int var15 = Statics.field762;
            int var16 = Statics.field1409;
            for (int var17 = 0; var17 < field685; var17++) {
                if (field690[var17] + field504[var17] > var13 && field690[var17] < var13 + var15 && field693[var17] + field691[var17] > var14 && field691[var17] < var14 + var16) {
                    field688[var17] = true;
                }
            }
        } else if (field634 != -1) {
            Statics.method1504(field634, field725);
        }
        if (field480 == 3) {
            for (int var18 = 0; var18 < field685; var18++) {
                if (field673[var18]) {
                    class89.method1737(field690[var18], field691[var18], field504[var18], field693[var18], 16711935, 128);
                } else if (field688[var18]) {
                    class89.method1737(field690[var18], field691[var18], field504[var18], field693[var18], 16711680, 128);
                }
            }
        }
        int var19 = Statics.field54;
        int var20 = Statics.field2370.field473;
        int var21 = Statics.field2370.field442;
        int var22 = field561;
        for (class7 var23 = (class7) class7.field86.method3252(); var23 != null; var23 = (class7) class7.field86.method3268()) {
            if (var23.field91 != -1 || var23.field95 != null) {
                int var24 = 0;
                if (var20 > var23.field88) {
                    var24 += var20 - var23.field88;
                } else if (var20 < var23.field106) {
                    var24 += var23.field106 - var20;
                }
                if (var21 > var23.field89) {
                    var24 += var21 - var23.field89;
                } else if (var21 < var23.field87) {
                    var24 += var23.field87 - var21;
                }
                if (var24 - 64 > var23.field107 || field723 == 0 || var23.field85 != var19) {
                    if (var23.field92 != null) {
                        Statics.field258.method1095(var23.field92);
                        var23.field92 = null;
                    }
                    if (var23.field97 != null) {
                        Statics.field258.method1095(var23.field97);
                        var23.field97 = null;
                    }
                } else {
                    var24 -= 64;
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    int var25 = field723 * (var23.field107 - var24) / var23.field107;
                    class57 var10000;
                    if (var23.field92 != null) {
                        var23.field92.method981(var25);
                    } else if (var23.field91 >= 0) {
                        var10000 = (class57) null;
                        class57 var26 = class57.method1243(Statics.field487, var23.field91, 0);
                        if (var26 != null) {
                            class63 var27 = var26.method1244().method1302(Statics.field749);
                            class45 var28 = class45.method953(var27, 100, var25);
                            var28.method956(-1);
                            Statics.field258.method1094(var28);
                            var23.field92 = var28;
                        }
                    }
                    if (var23.field97 != null) {
                        var23.field97.method981(var25);
                        if (!var23.field97.method3289()) {
                            var23.field97 = null;
                        }
                    } else if (var23.field95 != null && (var23.field96 -= var22) <= 0) {
                        int var29 = (int) (Math.random() * (double) var23.field95.length);
                        var10000 = (class57) null;
                        class57 var30 = class57.method1243(Statics.field487, var23.field95[var29], 0);
                        if (var30 != null) {
                            class63 var31 = var30.method1244().method1302(Statics.field749);
                            class45 var32 = class45.method953(var31, 100, var25);
                            var32.method956(0);
                            Statics.field258.method1094(var32);
                            var23.field97 = var32;
                            var23.field96 = var23.field93 + (int) (Math.random() * (double) (var23.field94 - var23.field93));
                        }
                    }
                }
            }
        }
        field561 = 0;
    }

    @ObfuscatedName("a.at(Ljava/lang/String;ZS)V")
    public static final void method2(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1758.method3315(arg0, 250);
        int var6 = Statics.field1758.method3316(arg0, 250) * 13;
        class89.method1746(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1766(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1758.method3329(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method145(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field13.getGraphics();
                Statics.field1552.method1563(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field13.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field685; var13++) {
            if (field690[var13] + field504[var13] > var9 && field690[var13] < var9 + var11 && field693[var13] + field691[var13] > var10 && field691[var13] < var10 + var12) {
                field688[var13] = true;
            }
        }
    }

    @ObfuscatedName("bv.ap(IIIII)V")
    public static final void method1502(int arg0, int arg1, int arg2, int arg3) {
        class89.method1740(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2069();
        field588++;
        method229(true);
        method1374(true);
        method229(false);
        method1374(false);
        for (class10 var4 = (class10) field620.method3252(); var4 != null; var4 = (class10) field620.method3268()) {
            if (Statics.field54 != var4.field149 || field658 > var4.field143) {
                var4.method3288();
            } else if (field658 >= var4.field166) {
                if (var4.field146 > 0) {
                    class25 var5 = field670[var4.field146 - 1];
                    if (var5 != null && var5.field473 >= 0 && var5.field473 < 13312 && var5.field442 >= 0 && var5.field442 < 13312) {
                        var4.method127(var5.field473, var5.field442, method13(var5.field473, var5.field442, var4.field149) - var4.field141, field658);
                    }
                }
                if (var4.field146 < 0) {
                    int var6 = -var4.field146 - 1;
                    class3 var7;
                    if (field689 == var6) {
                        var7 = Statics.field2370;
                    } else {
                        var7 = field604[var6];
                    }
                    if (var7 != null && var7.field473 >= 0 && var7.field473 < 13312 && var7.field442 >= 0 && var7.field442 < 13312) {
                        var4.method127(var7.field473, var7.field442, method13(var7.field473, var7.field442, var4.field149) - var4.field141, field658);
                    }
                }
                var4.method130(field561);
                Statics.field178.method1844(Statics.field54, (int) var4.field148, (int) var4.field151, (int) var4.field150, 60, var4, var4.field138, -1, false);
            }
        }
        for (class20 var8 = (class20) field621.method3252(); var8 != null; var8 = (class20) field621.method3268()) {
            if (Statics.field54 != var8.field304 || var8.field296) {
                var8.method3288();
            } else if (field658 >= var8.field293) {
                var8.method197(field561);
                if (var8.field296) {
                    var8.method3288();
                } else {
                    Statics.field178.method1844(var8.field304, var8.field288, var8.field291, var8.field292, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field482) {
            int var9 = field737;
            if (field576 / 256 > var9) {
                var9 = field576 / 256;
            }
            if (field731[4] && field510[4] + 128 > var9) {
                var9 = field510[4] + 128;
            }
            int var10 = field571 + field553 & 0x7FF;
            int var11 = Statics.field2030;
            int var12 = method13(Statics.field2370.field473, Statics.field2370.field442, Statics.field54) - 50;
            int var13 = Statics.field1055;
            int var14 = var9 * 3 + 600;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 2048 - var10 & 0x7FF;
            int var17 = 0;
            int var18 = 0;
            int var19 = var14;
            if (var15 != 0) {
                int var20 = class104.field1785[var15];
                int var21 = class104.field1786[var15];
                int var22 = var18 * var21 - var14 * var20 >> 16;
                var19 = var18 * var20 + var14 * var21 >> 16;
                var18 = var22;
            }
            if (var16 != 0) {
                int var23 = class104.field1785[var16];
                int var24 = class104.field1786[var16];
                int var25 = var17 * var24 + var19 * var23 >> 16;
                var19 = var19 * var24 - var17 * var23 >> 16;
                var17 = var25;
            }
            Statics.field396 = var11 - var17;
            Statics.field767 = var12 - var18;
            Statics.field1791 = var13 - var19;
            Statics.field413 = var9;
            Statics.field1671 = var10;
        }
        int var38;
        if (field482) {
            int var39;
            if (Statics.field1289.field181) {
                var39 = Statics.field54;
            } else {
                int var40 = method13(Statics.field396, Statics.field1791, Statics.field54);
                if (var40 - Statics.field767 >= 800 || (class9.field118[Statics.field54][Statics.field396 >> 7][Statics.field1791 >> 7] & 0x4) == 0) {
                    var39 = 3;
                } else {
                    var39 = Statics.field54;
                }
            }
            var38 = var39;
        } else {
            int var26;
            if (Statics.field1289.field181) {
                var26 = Statics.field54;
            } else {
                int var27 = 3;
                if (Statics.field413 < 310) {
                    int var28 = Statics.field396 >> 7;
                    int var29 = Statics.field1791 >> 7;
                    int var30 = Statics.field2370.field473 >> 7;
                    int var31 = Statics.field2370.field442 >> 7;
                    if ((class9.field118[Statics.field54][var28][var29] & 0x4) != 0) {
                        var27 = Statics.field54;
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
                            if ((class9.field118[Statics.field54][var28][var29] & 0x4) != 0) {
                                var27 = Statics.field54;
                            }
                            var35 += var34;
                            if (var35 >= 65536) {
                                var35 -= 65536;
                                if (var29 < var31) {
                                    var29++;
                                } else if (var29 > var31) {
                                    var29--;
                                }
                                if ((class9.field118[Statics.field54][var28][var29] & 0x4) != 0) {
                                    var27 = Statics.field54;
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
                            if ((class9.field118[Statics.field54][var28][var29] & 0x4) != 0) {
                                var27 = Statics.field54;
                            }
                            var37 += var36;
                            if (var37 >= 65536) {
                                var37 -= 65536;
                                if (var28 < var30) {
                                    var28++;
                                } else if (var28 > var30) {
                                    var28--;
                                }
                                if ((class9.field118[Statics.field54][var28][var29] & 0x4) != 0) {
                                    var27 = Statics.field54;
                                }
                            }
                        }
                    }
                }
                if ((class9.field118[Statics.field54][Statics.field2370.field473 >> 7][Statics.field2370.field442 >> 7] & 0x4) != 0) {
                    var27 = Statics.field54;
                }
                var26 = var27;
            }
            var38 = var26;
        }
        int var41 = Statics.field396;
        int var42 = Statics.field767;
        int var43 = Statics.field1791;
        int var44 = Statics.field413;
        int var45 = Statics.field1671;
        for (int var46 = 0; var46 < 5; var46++) {
            if (field731[var46]) {
                int var47 = (int) (Math.random() * (double) (field637[var46] * 2 + 1) - (double) field637[var46] + Math.sin((double) field734[var46] / 100.0D * (double) field735[var46]) * (double) field510[var46]);
                if (var46 == 0) {
                    Statics.field396 += var47;
                }
                if (var46 == 1) {
                    Statics.field767 += var47;
                }
                if (var46 == 2) {
                    Statics.field1791 += var47;
                }
                if (var46 == 3) {
                    Statics.field1671 = Statics.field1671 + var47 & 0x7FF;
                }
                if (var46 == 4) {
                    Statics.field413 += var47;
                    if (Statics.field413 < 128) {
                        Statics.field413 = 128;
                    }
                    if (Statics.field413 > 383) {
                        Statics.field413 = 383;
                    }
                }
            }
        }
        int var48 = class77.field1398;
        int var49 = class77.field1395;
        if (var48 >= arg0 && var48 < arg0 + arg2 && var49 >= arg1 && var49 < arg1 + arg3) {
            class112.field1908 = true;
            class112.field1867 = 0;
            class112.field1909 = class77.field1398 - arg0;
            class112.field1858 = class77.field1395 - arg1;
        } else {
            class112.field1908 = false;
            class112.field1867 = 0;
        }
        method2065();
        class89.method1746(arg0, arg1, arg2, arg3, 0);
        method2065();
        Statics.field178.method1864(Statics.field396, Statics.field767, Statics.field1791, Statics.field413, Statics.field1671, var38);
        method2065();
        Statics.field178.method1937();
        method1981(arg0, arg1, arg2, arg3);
        if (field686 == 2) {
            Statics.method217((field500 - Statics.field374 << 7) + field535, (field501 - Statics.field872 << 7) + field709, field502 * 2);
            if (field589 > -1 && field658 % 20 < 10) {
                Statics.field84[0].method1645(field589 + arg0 - 12, field590 + arg1 - 28);
            }
        }
        ((class110) Statics.field1782).method2163(field561);
        if (field594 == 1) {
            Statics.field238[field660 / 100].method1645(field591 - 8, field477 - 8);
        }
        if (field594 == 2) {
            Statics.field238[field660 / 100 + 4].method1645(field591 - 8, field477 - 8);
        }
        method833();
        if (field495) {
            int var50 = arg0 + 512 - 5;
            int var51 = arg1 + 20;
            Statics.field1758.method3318("Fps:" + field1318, var50, var51, 16776960, -1);
            int var55 = var51 + 15;
            Runtime var52 = Runtime.getRuntime();
            int var53 = (int) ((var52.totalMemory() - var52.freeMemory()) / 1024L);
            int var54 = 16776960;
            if (var53 > 32768 && field710) {
                var54 = 16711680;
            }
            if (var53 > 65536 && !field710) {
                var54 = 16711680;
            }
            Statics.field1758.method3318("Mem:" + var53 + "k", var50, var55, var54, -1);
            var51 = var55 + 15;
        }
        Statics.field396 = var41;
        Statics.field767 = var42;
        Statics.field1791 = var43;
        Statics.field413 = var44;
        Statics.field1671 = var45;
        if (field488 && class153.method1511(true, false) == 0) {
            field488 = false;
        }
        if (field488) {
            class89.method1746(arg0, arg1, arg2, arg3, 0);
            method2(class134.field2303, false);
        }
        if (!field488 && !field649 && var48 >= arg0 && var48 < arg0 + arg2 && var49 >= arg1 && var49 < arg1 + arg3) {
            method156(var48, var49, arg0, arg1);
        }
    }

    @ObfuscatedName("b.ae(ZI)V")
    public static final void method229(boolean arg0) {
        if (Statics.field2370.field473 >> 7 == field716 && Statics.field2370.field442 >> 7 == field714) {
            field716 = 0;
        }
        int var1 = field503;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2370;
                var4 = 33538048;
            } else {
                var3 = field604[field701[var2]];
                var4 = field701[var2] << 14;
            }
            if (var3 != null && var3.method24()) {
                var3.field50 = false;
                if ((field710 && field503 > 50 || field503 > 200) && !arg0 && var3.field444 == var3.field422) {
                    var3.field50 = true;
                }
                int var5 = var3.field473 >> 7;
                int var6 = var3.field442 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field45 == null || field658 < var3.field52 || field658 >= var3.field42) {
                        if ((var3.field473 & 0x7F) == 64 && (var3.field442 & 0x7F) == 64) {
                            if (field588 == field572[var5][var6]) {
                                continue;
                            }
                            field572[var5][var6] = field588;
                        }
                        var3.field39 = method13(var3.field473, var3.field442, Statics.field54);
                        Statics.field178.method1844(Statics.field54, var3.field473, var3.field442, var3.field39, 60, var3, var3.field419, var4, var3.field420);
                    } else {
                        var3.field50 = false;
                        var3.field39 = method13(var3.field473, var3.field442, Statics.field54);
                        Statics.field178.method1826(Statics.field54, var3.field473, var3.field442, var3.field39, 60, var3, var3.field419, var4, var3.field46, var3.field47, var3.field48, var3.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("be.af(ZB)V")
    public static final void method1374(boolean arg0) {
        for (int var1 = 0; var1 < field527; var1++) {
            class25 var2 = field670[field521[var1]];
            int var3 = (field521[var1] << 14) + 536870912;
            if (var2 != null && var2.method24() && var2.field397.field806 == arg0 && var2.field397.method621()) {
                int var4 = var2.field473 >> 7;
                int var5 = var2.field442 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field463 == 1 && (var2.field473 & 0x7F) == 64 && (var2.field442 & 0x7F) == 64) {
                        if (field588 == field572[var4][var5]) {
                            continue;
                        }
                        field572[var4][var5] = field588;
                    }
                    if (!var2.field397.field814) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field178.method1844(Statics.field54, var2.field473, var2.field442, method13(var2.field473 + (var2.field463 * 64 - 64), var2.field442 + (var2.field463 * 64 - 64), Statics.field54), var2.field463 * 64 - 64 + 60, var2, var2.field419, var3, var2.field420);
                }
            }
        }
    }

    @ObfuscatedName("cs.ai(IIIII)V")
    public static final void method1981(int arg0, int arg1, int arg2, int arg3) {
        field577 = 0;
        for (int var4 = -1; var4 < field527 + field503; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field2370;
            } else if (var4 < field503) {
                var5 = field604[field701[var4]];
            } else {
                var5 = field670[field521[var4 - field503]];
            }
            if (var5 != null && var5.method24()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field397;
                    if (var6.field811 != null) {
                        var6 = var6.method611();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field503) {
                    class31 var10 = ((class25) var5).field397;
                    if (var10.field811 != null) {
                        var10 = var10.method611();
                    }
                    if (var10.field809 >= 0 && var10.field809 < Statics.field2433.length) {
                        method140(var5, var5.field465 + 15);
                        if (field589 > -1) {
                            Statics.field2433[var10.field809].method1645(field589 + arg0 - 12, field590 + arg1 - 30);
                        }
                    }
                    if (field686 == 1 && field498 == field521[var4 - field503] && field658 % 20 < 10) {
                        method140(var5, var5.field465 + 15);
                        if (field589 > -1) {
                            Statics.field84[0].method1645(field589 + arg0 - 12, field590 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field35 != -1 || var8.field38 != -1) {
                        int var9 = var5.field465 + 15;
                        Statics.method217(var5.field473, var5.field442, var9);
                        if (field589 > -1) {
                            if (var8.field35 != -1) {
                                Statics.field2455[var8.field35].method1645(field589 + arg0 - 12, field590 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field38 != -1) {
                                Statics.field2433[var8.field38].method1645(field589 + arg0 - 12, field590 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field686 == 10 && field556 == field701[var4]) {
                        method140(var5, var5.field465 + 15);
                        if (field589 > -1) {
                            Statics.field84[1].method1645(field589 + arg0 - 12, field590 + arg1 - var7);
                        }
                    }
                }
                if (var5.field430 != null && (var4 >= field503 || field570 == 0 || field570 == 3 || field570 == 1 && method3025(((class3) var5).field51))) {
                    method140(var5, var5.field465);
                    if (field589 > -1 && field577 < field677) {
                        field582[field577] = Statics.field1333.method3313(var5.field430) / 2;
                        field581[field577] = Statics.field1333.field2841;
                        field520[field577] = field589;
                        field560[field577] = field590;
                        field583[field577] = var5.field432;
                        field543[field577] = var5.field441;
                        field585[field577] = var5.field445;
                        field733[field577] = var5.field430;
                        field577++;
                    }
                }
                if (var5.field438 > field658) {
                    int var11 = var5.field465 + 15;
                    Statics.method217(var5.field473, var5.field442, var11);
                    if (field589 > -1) {
                        int var12 = var5.field464 * 30 / var5.field440;
                        if (var12 > 30) {
                            var12 = 30;
                        }
                        class89.method1746(field589 + arg0 - 15, field590 + arg1 - 3, var12, 5, 65280);
                        class89.method1746(field589 + arg0 - 15 + var12, field590 + arg1 - 3, 30 - var12, 5, 16711680);
                    }
                }
                for (int var13 = 0; var13 < 4; var13++) {
                    if (var5.field437[var13] > field658) {
                        method140(var5, var5.field465 / 2);
                        if (field589 > -1) {
                            if (var13 == 1) {
                                field590 -= 20;
                            }
                            if (var13 == 2) {
                                field589 -= 15;
                                field590 -= 10;
                            }
                            if (var13 == 3) {
                                field589 += 15;
                                field590 -= 10;
                            }
                            Statics.field562[var5.field474[var13]].method1645(field589 + arg0 - 12, field590 + arg1 - 12);
                            Statics.field253.method3359(Integer.toString(var5.field475[var13]), field589 + arg0 - 1, field590 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var14 = 0; var14 < field577; var14++) {
            int var15 = field520[var14];
            int var16 = field560[var14];
            int var17 = field582[var14];
            int var18 = field581[var14];
            boolean var19 = true;
            while (var19) {
                var19 = false;
                for (int var20 = 0; var20 < var14; var20++) {
                    if (var16 + 2 > field560[var20] - field581[var20] && var16 - var18 < field560[var20] + 2 && var15 - var17 < field582[var20] + field520[var20] && var15 + var17 > field520[var20] - field582[var20] && field560[var20] - field581[var20] < var16) {
                        var16 = field560[var20] - field581[var20];
                        var19 = true;
                    }
                }
            }
            field589 = field520[var14];
            field590 = field560[var14] = var16;
            String var21 = field733[var14];
            if (field646 == 0) {
                int var22 = 16776960;
                if (field583[var14] < 6) {
                    var22 = field739[field583[var14]];
                }
                if (field583[var14] == 6) {
                    var22 = field588 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field583[var14] == 7) {
                    var22 = field588 % 20 < 10 ? 255 : 65535;
                }
                if (field583[var14] == 8) {
                    var22 = field588 % 20 < 10 ? 45056 : 8454016;
                }
                if (field583[var14] == 9) {
                    int var23 = 150 - field585[var14];
                    if (var23 < 50) {
                        var22 = var23 * 1280 + 16711680;
                    } else if (var23 < 100) {
                        var22 = 16776960 - (var23 - 50) * 327680;
                    } else if (var23 < 150) {
                        var22 = (var23 - 100) * 5 + 65280;
                    }
                }
                if (field583[var14] == 10) {
                    int var24 = 150 - field585[var14];
                    if (var24 < 50) {
                        var22 = var24 * 5 + 16711680;
                    } else if (var24 < 100) {
                        var22 = 16711935 - (var24 - 50) * 327680;
                    } else if (var24 < 150) {
                        var22 = (var24 - 100) * 327680 + 255 - (var24 - 100) * 5;
                    }
                }
                if (field583[var14] == 11) {
                    int var25 = 150 - field585[var14];
                    if (var25 < 50) {
                        var22 = 16777215 - var25 * 327685;
                    } else if (var25 < 100) {
                        var22 = (var25 - 50) * 327685 + 65280;
                    } else if (var25 < 150) {
                        var22 = 16777215 - (var25 - 100) * 327680;
                    }
                }
                if (field543[var14] == 0) {
                    Statics.field1333.method3359(var21, field589 + arg0, field590 + arg1, var22, 0);
                }
                if (field543[var14] == 1) {
                    Statics.field1333.method3320(var21, field589 + arg0, field590 + arg1, var22, 0, field588);
                }
                if (field543[var14] == 2) {
                    Statics.field1333.method3321(var21, field589 + arg0, field590 + arg1, var22, 0, field588);
                }
                if (field543[var14] == 3) {
                    Statics.field1333.method3322(var21, field589 + arg0, field590 + arg1, var22, 0, field588, 150 - field585[var14]);
                }
                if (field543[var14] == 4) {
                    int var26 = (150 - field585[var14]) * (Statics.field1333.method3313(var21) + 100) / 150;
                    class89.method1741(field589 + arg0 - 50, arg1, field589 + arg0 + 50, arg1 + arg3);
                    Statics.field1333.method3378(var21, field589 + arg0 + 50 - var26, field590 + arg1, var22, 0);
                    class89.method1740(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field543[var14] == 5) {
                    int var27 = 150 - field585[var14];
                    int var28 = 0;
                    if (var27 < 25) {
                        var28 = var27 - 25;
                    } else if (var27 > 125) {
                        var28 = var27 - 125;
                    }
                    class89.method1741(arg0, field590 + arg1 - Statics.field1333.field2841 - 1, arg0 + arg2, field590 + arg1 + 5);
                    Statics.field1333.method3359(var21, field589 + arg0, field590 + arg1 + var28, var22, 0);
                    class89.method1740(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1333.method3359(var21, field589 + arg0, field590 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("aj.aj(B)V")
    public static final void method833() {
        field568 = 0;
        int var0 = (Statics.field2370.field473 >> 7) + Statics.field374;
        int var1 = (Statics.field2370.field442 >> 7) + Statics.field872;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field568 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field568 = 1;
        }
        if (field568 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field568 = 0;
        }
    }

    @ObfuscatedName("q.ax(Lah;II)V")
    public static final void method140(class27 arg0, int arg1) {
        Statics.method217(arg0.field473, arg0.field442, arg1);
    }

    @ObfuscatedName("e.az(IIIS)I")
    public static final int method13(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field118[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field135[var5][var3][var4] + class9.field135[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field135[var5][var3][var4 + 1] + class9.field135[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("c.aa(ZB)V")
    public static final void method146(boolean arg0) {
        field541 = arg0;
        if (!field541) {
            int var1 = field524.method2445();
            int var2 = field524.method2444();
            int var3 = field524.method2443();
            int var4 = field524.method2444();
            int var5 = (field603 - field524.field2035) / 16;
            Statics.field196 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field196[var6][var7] = field524.method2416();
                }
            }
            int var8 = field524.method2411();
            Statics.field2560 = new int[var5];
            Statics.field1661 = new int[var5];
            Statics.field387 = new int[var5];
            Statics.field2314 = new byte[var5][];
            Statics.field361 = new byte[var5][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2560[var10] = var13;
                        Statics.field1661[var10] = Statics.field281.method3003("m" + var11 + "_" + var12);
                        Statics.field387[var10] = Statics.field281.method3003("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method177(var1, var3, var8, var4, var2);
            return;
        }
        int var14 = field524.method2443();
        int var15 = field524.method2436();
        int var16 = field524.method2444();
        int var17 = field524.method2445();
        int var18 = field524.method2445();
        field524.method2277();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field524.method2274(1);
                    if (var22 == 1) {
                        field542[var19][var20][var21] = field524.method2274(26);
                    } else {
                        field542[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field524.method2275();
        int var23 = (field603 - field524.field2035) / 16;
        Statics.field196 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field196[var24][var25] = field524.method2454();
            }
        }
        Statics.field2560 = new int[var23];
        Statics.field1661 = new int[var23];
        Statics.field387 = new int[var23];
        Statics.field2314 = new byte[var23][];
        Statics.field361 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field542[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2560[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2560[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1661[var26] = Statics.field281.method3003("m" + var35 + "_" + var36);
                            Statics.field387[var26] = Statics.field281.method3003("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method177(var14, var17, var15, var16, var18);
    }

    @ObfuscatedName("w.au(IIIIII)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1456 == arg0 && Statics.field410 == arg1 && field534 == arg2 || !field710) {
            return;
        }
        Statics.field1456 = arg0;
        Statics.field410 = arg1;
        field534 = arg2;
        if (!field710) {
            field534 = 0;
        }
        method143(25);
        method2(class134.field2303, true);
        int var5 = Statics.field374;
        int var6 = Statics.field872;
        Statics.field374 = (arg0 - 6) * 8;
        Statics.field872 = (arg1 - 6) * 8;
        int var7 = Statics.field374 - var5;
        int var8 = Statics.field872 - var6;
        int var9 = Statics.field374;
        int var10 = Statics.field872;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field670[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field470[var13] -= var7;
                    var12.field471[var13] -= var8;
                }
                var12.field473 -= var7 * 128;
                var12.field442 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field604[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field470[var16] -= var7;
                    var15.field471[var16] -= var8;
                }
                var15.field473 -= var7 * 128;
                var15.field442 -= var8 * 128;
            }
        }
        Statics.field54 = arg2;
        Statics.field2370.method267(arg3, arg4, false);
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
                        field618[var27][var23][var24] = field618[var27][var25][var26];
                    } else {
                        field618[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field619.method3252(); var28 != null; var28 = (class22) field619.method3268()) {
            var28.field349 -= var7;
            var28.field356 -= var8;
            if (var28.field349 < 0 || var28.field356 < 0 || var28.field349 >= 104 || var28.field356 >= 104) {
                var28.method3288();
            }
        }
        if (field716 != 0) {
            field716 -= var7;
            field714 -= var8;
        }
        field724 = 0;
        field482 = false;
        field711 = -1;
        field621.method3266();
        field620.method3266();
    }

    @ObfuscatedName("ba.ar(ZI)V")
    public static final void method1259(boolean arg0) {
        method2065();
        field528++;
        if (field528 < 50 && !arg0) {
            return;
        }
        field528 = 0;
        if (field533 || Statics.field1423 == null) {
            return;
        }
        field540.method2272(26);
        try {
            Statics.field1423.method1362(field540.field2036, 0, field540.field2035);
            field540.field2035 = 0;
        } catch (IOException var2) {
            field533 = true;
        }
    }

    @ObfuscatedName("n.ao(IIIIII)V")
    public static final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field178.method1840(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field178.method1924(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1551.field1479;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method1806(var12);
            if (var13.field849 == -1) {
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
                class87 var14 = Statics.field1842[var13.field849];
                if (var14 != null) {
                    int var15 = (var13.field835 * 4 - var14.field1484) / 2;
                    int var16 = (var13.field836 * 4 - var14.field1483) / 2;
                    var14.method1723(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field836) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field178.method1947(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field178.method1924(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method1806(var21);
            if (var22.field849 != -1) {
                class87 var23 = Statics.field1842[var22.field849];
                if (var23 != null) {
                    int var24 = (var22.field835 * 4 - var23.field1484) / 2;
                    int var25 = (var22.field836 * 4 - var23.field1483) / 2;
                    var23.method1723(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field836) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1551.field1479;
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
        int var29 = Statics.field178.method1899(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method1806(var30);
        if (var31.field849 == -1) {
            return;
        }
        class87 var32 = Statics.field1842[var31.field849];
        if (var32 != null) {
            int var33 = (var31.field835 * 4 - var32.field1484) / 2;
            int var34 = (var31.field836 * 4 - var32.field1483) / 2;
            var32.method1723(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field836) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.aw(IIII)Z")
    public static final boolean method543(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field178.method1924(Statics.field54, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method1806(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field835;
                var9 = var7.field836;
            } else {
                var8 = var7.field836;
                var9 = var7.field835;
            }
            int var10 = var7.field825;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method181(Statics.field2370.field470[0], Statics.field2370.field471[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method181(Statics.field2370.field470[0], Statics.field2370.field471[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field591 = class77.field1399;
        field477 = class77.field1400;
        field594 = 2;
        field660 = 0;
        return true;
    }

    @ObfuscatedName("d.ab(IIIIZIIIIIIB)Z")
    public static final boolean method181(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field615[var11][var12] = 0;
                field546[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field615[arg0][arg1] = 99;
        field546[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field547[var15] = arg0;
        int var36 = var15 + 1;
        field732[var15] = arg1;
        boolean var17 = false;
        int var18 = field547.length;
        int[][] var19 = field555[Statics.field54].field2745;
        while (var36 != var16) {
            var13 = field547[var16];
            var14 = field732[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field555[Statics.field54].method3161(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field555[Statics.field54].method3162(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field555[Statics.field54].method3163(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field546[var13][var14] + 1;
            if (var13 > 0 && field615[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field547[var36] = var13 - 1;
                field732[var36] = var14;
                var36 = (var36 + 1) % var18;
                field615[var13 - 1][var14] = 2;
                field546[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field615[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field547[var36] = var13 + 1;
                field732[var36] = var14;
                var36 = (var36 + 1) % var18;
                field615[var13 + 1][var14] = 8;
                field546[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field615[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field547[var36] = var13;
                field732[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field615[var13][var14 - 1] = 1;
                field546[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field615[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field547[var36] = var13;
                field732[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field615[var13][var14 + 1] = 4;
                field546[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field615[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field547[var36] = var13 - 1;
                field732[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field615[var13 - 1][var14 - 1] = 3;
                field546[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field615[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field547[var36] = var13 + 1;
                field732[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field615[var13 + 1][var14 - 1] = 9;
                field546[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field615[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field547[var36] = var13 - 1;
                field732[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field615[var13 - 1][var14 + 1] = 6;
                field546[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field615[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field547[var36] = var13 + 1;
                field732[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field615[var13 + 1][var14 + 1] = 12;
                field546[var13 + 1][var14 + 1] = var20;
            }
        }
        field544 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field546[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field546[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field546[var24][var25];
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
            field544 = 1;
        }
        byte var29 = 0;
        field547[var29] = var13;
        int var37 = var29 + 1;
        field732[var29] = var14;
        int var30;
        int var31 = var30 = field615[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field547[var37] = var13;
                field732[var37++] = var14;
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
            var31 = field615[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field547[var37];
            int var34 = field732[var37];
            if (arg10 == 0) {
                field540.method2272(170);
                field540.method2455(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field540.method2272(198);
                field540.method2455(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field540.method2272(31);
                field540.method2455(var32 + var32 + 3);
            }
            field540.method2556(Statics.field872 + var34);
            field540.method2434(class75.field1364[82] ? 1 : 0);
            field716 = field547[0];
            field714 = field732[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field540.method2526(field547[var37] - var33);
                field540.method2526(field732[var37] - var34);
            }
            field540.method2527(Statics.field374 + var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("n.ac(B)Z")
    public static final boolean method41() {
        if (Statics.field1423 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1423.method1360();
            if (var0 == 0) {
                return false;
            }
            if (field526 == -1) {
                Statics.field1423.method1361(field524.field2036, 0, 1);
                field524.field2035 = 0;
                field526 = field524.method2273();
                field603 = class165.field2761[field526];
                var0--;
            }
            if (field603 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1423.method1361(field524.field2036, 0, 1);
                field603 = field524.field2036[0] & 0xFF;
                var0--;
            }
            if (field603 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1423.method1361(field524.field2036, 0, 2);
                field524.field2035 = 0;
                field603 = field524.method2413();
                var0 -= 2;
            }
            if (var0 < field603) {
                return false;
            }
            field524.field2035 = 0;
            Statics.field1423.method1361(field524.field2036, 0, field603);
            field579 = 0;
            field736 = field584;
            field584 = field624;
            field624 = field526;
            if (field526 == 210) {
                class182.method2300(field524, field603);
                field526 = -1;
                return true;
            }
            if (field526 == 249) {
                int var1 = field524.method2454();
                int var2 = field524.method2443();
                class159.field2702[var2] = var1;
                if (class159.field2701[var2] != var1) {
                    class159.field2701[var2] = var1;
                    method27(var2);
                }
                field722[++field669 - 1 & 0x1F] = var2;
                field526 = -1;
                return true;
            }
            if (field526 == 29 || field526 == 67 || field526 == 110 || field526 == 162 || field526 == 28 || field526 == 64 || field526 == 130 || field526 == 4 || field526 == 35 || field526 == 10 || field526 == 219) {
                method182();
                field526 = -1;
                return true;
            }
            if (field526 == 160) {
                field630 = 1;
                field551 = field667;
                field526 = -1;
                return true;
            }
            if (field526 == 246) {
                Statics.field1406 = field524.method2435();
                Statics.field1389 = field524.method2411();
                while (field524.field2035 < field603) {
                    field526 = field524.method2411();
                    method182();
                }
                field526 = -1;
                return true;
            }
            if (field526 == 5) {
                while (field524.field2035 < field603) {
                    boolean var3 = field524.method2411() == 1;
                    String var4 = field524.method2564();
                    String var5 = field524.method2564();
                    int var6 = field524.method2413();
                    int var7 = field524.method2411();
                    int var8 = field524.method2411();
                    boolean var9 = (var8 & 0x2) != 0;
                    boolean var10 = (var8 & 0x1) != 0;
                    if (var6 > 0) {
                        field524.method2564();
                        field524.method2411();
                        field524.method2416();
                    }
                    field524.method2564();
                    for (int var11 = 0; var11 < field666; var11++) {
                        class23 var12 = field738[var11];
                        if (var3) {
                            if (var5.equals(var12.field365)) {
                                var12.field365 = var4;
                                var12.field366 = var5;
                                var4 = null;
                                break;
                            }
                        } else if (var4.equals(var12.field365)) {
                            if (var12.field367 != var6) {
                                boolean var13 = true;
                                for (class28 var14 = (class28) field492.method3215(); var14 != null; var14 = (class28) field492.method3223()) {
                                    if (var14.field757.equals(var4)) {
                                        if (var6 != 0 && var14.field751 == 0) {
                                            var14.method3287();
                                            var13 = false;
                                        } else if (var6 == 0 && var14.field751 != 0) {
                                            var14.method3287();
                                            var13 = false;
                                        }
                                    }
                                }
                                if (var13) {
                                    field492.method3214(new class28(var4, var6));
                                }
                                var12.field367 = var6;
                            }
                            var12.field366 = var5;
                            var12.field375 = var7;
                            var12.field369 = var9;
                            var12.field368 = var10;
                            var4 = null;
                            break;
                        }
                    }
                    if (var4 != null && field666 < 200) {
                        class23 var15 = new class23();
                        field738[field666] = var15;
                        var15.field365 = var4;
                        var15.field366 = var5;
                        var15.field367 = var6;
                        var15.field375 = var7;
                        var15.field369 = var9;
                        var15.field368 = var10;
                        field666++;
                    }
                }
                field630 = 2;
                field551 = field667;
                boolean var16 = false;
                int var17 = field666;
                while (var17 > 0) {
                    boolean var18 = true;
                    var17--;
                    for (int var19 = 0; var19 < var17; var19++) {
                        boolean var20 = false;
                        class23 var21 = field738[var19];
                        class23 var22 = field738[var19 + 1];
                        if (field545 != var21.field367 && field545 == var22.field367) {
                            var20 = true;
                        }
                        if (!var20 && var21.field367 == 0 && var22.field367 != 0) {
                            var20 = true;
                        }
                        if (!var20 && !var21.field369 && var22.field369) {
                            var20 = true;
                        }
                        if (!var20 && !var21.field368 && var22.field368) {
                            var20 = true;
                        }
                        if (var20) {
                            class23 var23 = field738[var19];
                            field738[var19] = field738[var19 + 1];
                            field738[var19 + 1] = var23;
                            var18 = false;
                        }
                    }
                    if (var18) {
                        break;
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 136) {
                field716 = 0;
                field526 = -1;
                return true;
            }
            if (field526 == 204) {
                int var24 = field524.method2413();
                int var25 = field524.method2411();
                int var26 = field524.method2413();
                if (field574 != 0 && var25 != 0 && field724 < 50) {
                    field578[field724] = var24;
                    field726[field724] = var25;
                    field727[field724] = var26;
                    field532[field724] = null;
                    field728[field724] = 0;
                    field724++;
                }
                field526 = -1;
                return true;
            }
            if (field526 == 115) {
                int var30 = field524.method2453();
                int var31 = field524.method2452();
                int var32 = field524.method2447();
                class158 var33 = class158.method2064(var30);
                int var34 = var33.field2590 + var32;
                int var35 = var33.field2591 + var31;
                if (var33.field2588 != var34 || var33.field2679 != var35) {
                    var33.field2588 = var34;
                    var33.field2679 = var35;
                    Statics.method26(var33);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 178) {
                int var36 = field524.method2435();
                int var37 = field524.method2476();
                int var38 = field524.method2444();
                class4 var39 = (class4) field694.method3242((long) var37);
                if (var39 != null) {
                    method2804(var39, var39.field59 != var38);
                }
                class4 var40 = new class4();
                var40.field59 = var38;
                var40.field56 = var36;
                field694.method3234(var40, (long) var37);
                method189(var38);
                class26.method244(var38);
                class158 var41 = class158.method2064(var37);
                if (var41 != null) {
                    Statics.method26(var41);
                }
                if (field648 != null) {
                    Statics.method26(field648);
                    field648 = null;
                }
                field649 = false;
                field506 = 0;
                method145(Statics.field1315, Statics.field32, Statics.field762, Statics.field1409);
                if (field644 != -1) {
                    int var42 = field644;
                    if (class158.method2312(var42)) {
                        method137(Statics.field2608[var42], 1);
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 128) {
                String var43 = field524.method2564();
                Object[] var44 = new Object[var43.length() + 1];
                for (int var45 = var43.length() - 1; var45 >= 0; var45--) {
                    if (var43.charAt(var45) == 's') {
                        var44[var45 + 1] = field524.method2564();
                    } else {
                        var44[var45 + 1] = Integer.valueOf(field524.method2416());
                    }
                }
                var44[0] = Integer.valueOf(field524.method2416());
                class1 var46 = new class1();
                var46.field4 = var44;
                class26.method22(var46);
                field526 = -1;
                return true;
            }
            if (field526 == 135) {
                Statics.field2333 = class137.method2177(field524.method2411());
                field526 = -1;
                return true;
            }
            if (field526 == 87) {
                Statics.field1389 = field524.method2437();
                Statics.field1406 = field524.method2411();
                field526 = -1;
                return true;
            }
            if (field526 == 7) {
                field570 = field524.method2411();
                field702 = field524.method2411();
                field526 = -1;
                return true;
            }
            if (field526 == 195) {
                field482 = true;
                Statics.field1274 = field524.method2411();
                Statics.field2032 = field524.method2411();
                Statics.field2310 = field524.method2413();
                Statics.field343 = field524.method2411();
                Statics.field1654 = field524.method2411();
                if (Statics.field1654 >= 100) {
                    int var47 = Statics.field1274 * 128 + 64;
                    int var48 = Statics.field2032 * 128 + 64;
                    int var49 = method13(var47, var48, Statics.field54) - Statics.field2310;
                    int var50 = var47 - Statics.field396;
                    int var51 = var49 - Statics.field767;
                    int var52 = var48 - Statics.field1791;
                    int var53 = (int) Math.sqrt((double) (var50 * var50 + var52 * var52));
                    Statics.field413 = (int) (Math.atan2((double) var51, (double) var53) * 325.949D) & 0x7FF;
                    Statics.field1671 = (int) (Math.atan2((double) var50, (double) var52) * -325.949D) & 0x7FF;
                    if (Statics.field413 < 128) {
                        Statics.field413 = 128;
                    }
                    if (Statics.field413 > 383) {
                        Statics.field413 = 383;
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 53) {
                int var54 = field524.method2416();
                int var55 = field524.method2413();
                if (var54 < -70000) {
                    var55 += 32768;
                }
                class158 var56;
                if (var54 >= 0) {
                    var56 = class158.method2064(var54);
                } else {
                    var56 = null;
                }
                if (var56 != null) {
                    for (int var57 = 0; var57 < var56.field2609.length; var57++) {
                        var56.field2609[var57] = 0;
                        var56.field2603[var57] = 0;
                    }
                }
                class19.method1349(var55);
                int var58 = field524.method2413();
                for (int var59 = 0; var59 < var58; var59++) {
                    int var60 = field524.method2411();
                    if (var60 == 255) {
                        var60 = field524.method2416();
                    }
                    int var61 = field524.method2444();
                    if (var56 != null && var59 < var56.field2609.length) {
                        var56.field2609[var59] = var61;
                        var56.field2603[var59] = var60;
                    }
                    class19.method629(var55, var59, var61 - 1, var60);
                }
                if (var56 != null) {
                    Statics.method26(var56);
                }
                method1630();
                field717[++field671 - 1 & 0x1F] = var55 & 0x7FFF;
                field526 = -1;
                return true;
            }
            if (field526 == 192) {
                String var62 = field524.method2564();
                long var63 = field524.method2566();
                long var65 = (long) field524.method2413();
                long var67 = (long) field524.method2415();
                int var69 = field524.method2411();
                long var70 = (var65 << 32) + var67;
                boolean var72 = false;
                for (int var73 = 0; var73 < 100; var73++) {
                    if (field729[var73] == var70) {
                        var72 = true;
                        break;
                    }
                }
                if (var69 <= 1 && method2174(var62)) {
                    var72 = true;
                }
                if (!var72 && field568 == 0) {
                    field729[field704] = var70;
                    field704 = (field704 + 1) % 100;
                    class116 var74 = field524;
                    String var78;
                    try {
                        int var75 = var74.method2581();
                        if (var75 > 32767) {
                            var75 = 32767;
                        }
                        byte[] var76 = new byte[var75];
                        var74.field2035 += Statics.field2834.method2333(var74.field2036, var74.field2035, var76, 0, var75);
                        String var77 = class149.method1510(var76, 0, var75);
                        var78 = var77;
                    } catch (Exception var282) {
                        var78 = "Cabbage";
                    }
                    String var81 = class185.method3349(class147.method2130(var78));
                    if (var69 == 2 || var69 == 3) {
                        method250(9, class2.method1(1) + var62, var81, class146.method2655(var63));
                    } else if (var69 == 1) {
                        method250(9, class2.method1(0) + var62, var81, class146.method2655(var63));
                    } else {
                        method250(9, var62, var81, class146.method2655(var63));
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 190) {
                field524.field2035 += 28;
                if (field524.method2431()) {
                    class116 var82 = field524;
                    int var83 = field524.field2035 - 28;
                    if (class82.field1437 != null) {
                        try {
                            class82.field1437.method588(0L);
                            class82.field1437.method582(var82.field2036, var83, 24);
                        } catch (Exception var281) {
                        }
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 76) {
                field482 = false;
                for (int var85 = 0; var85 < 5; var85++) {
                    field731[var85] = false;
                }
                field526 = -1;
                return true;
            }
            if (field526 == 212) {
                int var86 = field524.method2445();
                byte var87 = field524.method2575();
                class159.field2702[var86] = var87;
                if (class159.field2701[var86] != var87) {
                    class159.field2701[var86] = var87;
                    method27(var86);
                }
                field722[++field669 - 1 & 0x1F] = var86;
                field526 = -1;
                return true;
            }
            if (field526 == 104) {
                String var88 = field524.method2564();
                long var89 = (long) field524.method2413();
                long var91 = (long) field524.method2415();
                int var93 = field524.method2411();
                long var94 = (var89 << 32) + var91;
                boolean var96 = false;
                for (int var97 = 0; var97 < 100; var97++) {
                    if (field729[var97] == var94) {
                        var96 = true;
                        break;
                    }
                }
                if (method2174(var88)) {
                    var96 = true;
                }
                if (!var96 && field568 == 0) {
                    field729[field704] = var94;
                    field704 = (field704 + 1) % 100;
                    class116 var98 = field524;
                    String var102;
                    try {
                        int var99 = var98.method2581();
                        if (var99 > 32767) {
                            var99 = 32767;
                        }
                        byte[] var100 = new byte[var99];
                        var98.field2035 += Statics.field2834.method2333(var98.field2036, var98.field2035, var100, 0, var99);
                        String var101 = class149.method1510(var100, 0, var99);
                        var102 = var101;
                    } catch (Exception var280) {
                        var102 = "Cabbage";
                    }
                    String var105 = class185.method3349(class147.method2130(var102));
                    if (var93 == 2 || var93 == 3) {
                        method128(7, class2.method1(1) + var88, var105);
                    } else if (var93 == 1) {
                        method128(7, class2.method1(0) + var88, var105);
                    } else {
                        method128(3, var88, var105);
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 168) {
                field548 = field524.method2444() * 30;
                field587 = field667;
                field526 = -1;
                return true;
            }
            if (field526 == 175) {
                int var106 = field524.method2528();
                int var107 = field524.method2476();
                class158 var108 = class158.method2064(var107);
                if (var108.field2619 != var106 || var106 == -1) {
                    var108.field2619 = var106;
                    var108.field2578 = 0;
                    var108.field2690 = 0;
                    Statics.method26(var108);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 170) {
                int var109 = field524.method2476();
                int var110 = field524.method2445();
                int var111 = field524.method2444();
                int var112 = field524.method2445();
                class158 var113 = class158.method2064(var109);
                if (var113.field2623 != var110 || var113.field2624 != var111 || var113.field2626 != var112) {
                    var113.field2623 = var110;
                    var113.field2624 = var111;
                    var113.field2626 = var112;
                    Statics.method26(var113);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 189) {
                while (field524.field2035 < field603) {
                    int var114 = field524.method2411();
                    boolean var115 = (var114 & 0x1) == 1;
                    String var116 = field524.method2564();
                    String var117 = field524.method2564();
                    field524.method2564();
                    for (int var118 = 0; var118 < field537; var118++) {
                        class11 var119 = field741[var118];
                        if (var115) {
                            if (var117.equals(var119.field170)) {
                                var119.field170 = var116;
                                var119.field168 = var117;
                                var116 = null;
                                break;
                            }
                        } else if (var116.equals(var119.field170)) {
                            var119.field170 = var116;
                            var119.field168 = var117;
                            var116 = null;
                            break;
                        }
                    }
                    if (var116 != null && field537 < 100) {
                        class11 var120 = new class11();
                        field741[field537] = var120;
                        var120.field170 = var116;
                        var120.field168 = var117;
                        field537++;
                    }
                }
                field551 = field667;
                field526 = -1;
                return true;
            }
            if (field526 == 69) {
                method146(true);
                field526 = -1;
                return true;
            }
            if (field526 == 132) {
                method1630();
                field647 = field524.method2452();
                field587 = field667;
                field526 = -1;
                return true;
            }
            if (field526 == 16) {
                for (int var121 = 0; var121 < class159.field2701.length; var121++) {
                    if (class159.field2702[var121] != class159.field2701[var121]) {
                        class159.field2701[var121] = class159.field2702[var121];
                        method27(var121);
                        field722[++field669 - 1 & 0x1F] = var121;
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 172) {
                method146(false);
                field526 = -1;
                return true;
            }
            if (field526 == 95) {
                field499 = field667;
                if (field603 == 0) {
                    field515 = null;
                    field597 = null;
                    Statics.field251 = 0;
                    Statics.field339 = null;
                    field526 = -1;
                    return true;
                }
                field597 = field524.method2564();
                long var122 = field524.method2566();
                long var124 = var122;
                String var126;
                if (var122 <= 0L || var122 >= 6582952005840035281L) {
                    var126 = null;
                } else if (var122 % 37L == 0L) {
                    var126 = null;
                } else {
                    int var127 = 0;
                    for (long var128 = var122; var128 != 0L; var128 /= 37L) {
                        var127++;
                    }
                    StringBuilder var130 = new StringBuilder(var127);
                    while (var124 != 0L) {
                        long var131 = var124;
                        var124 /= 37L;
                        var130.append(class146.field2434[(int) (var131 - var124 * 37L)]);
                    }
                    var126 = var130.reverse().toString();
                }
                field515 = var126;
                Statics.field989 = field524.method2412();
                int var133 = field524.method2411();
                if (var133 == 255) {
                    field526 = -1;
                    return true;
                }
                Statics.field251 = var133;
                class8[] var134 = new class8[100];
                for (int var135 = 0; var135 < Statics.field251; var135++) {
                    var134[var135] = new class8();
                    var134[var135].field115 = field524.method2564();
                    var134[var135].field109 = class148.method2803(var134[var135].field115, Statics.field483);
                    var134[var135].field110 = field524.method2413();
                    var134[var135].field116 = field524.method2412();
                    field524.method2564();
                    if (var134[var135].field115.equals(Statics.field2370.field51)) {
                        Statics.field1387 = var134[var135].field116;
                    }
                }
                boolean var136 = false;
                int var137 = Statics.field251;
                while (var137 > 0) {
                    boolean var138 = true;
                    var137--;
                    for (int var139 = 0; var139 < var137; var139++) {
                        if (var134[var139].field109.compareTo(var134[var139 + 1].field109) > 0) {
                            class8 var140 = var134[var139];
                            var134[var139] = var134[var139 + 1];
                            var134[var139 + 1] = var140;
                            var138 = false;
                        }
                    }
                    if (var138) {
                        break;
                    }
                }
                Statics.field339 = var134;
                field526 = -1;
                return true;
            }
            if (field526 == 206) {
                int var141 = field524.method2445();
                int var142 = field524.method2476();
                int var143 = var141 >> 10 & 0x1F;
                int var144 = var141 >> 5 & 0x1F;
                int var145 = var141 & 0x1F;
                int var146 = (var145 << 3) + (var143 << 19) + (var144 << 11);
                class158 var147 = class158.method2064(var142);
                if (var147.field2600 != var146) {
                    var147.field2600 = var146;
                    Statics.method26(var147);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 200) {
                int var148 = field524.method2437();
                int var149 = field524.method2435();
                int var150 = field524.method2437();
                Statics.field54 = var150 >> 1;
                Statics.field2370.method267(var149, var148, (var150 & 0x1) == 1);
                field526 = -1;
                return true;
            }
            if (field526 == 82) {
                int var151 = field524.method2454();
                class158 var152 = class158.method2064(var151);
                for (int var153 = 0; var153 < var152.field2609.length; var153++) {
                    var152.field2609[var153] = -1;
                    var152.field2609[var153] = 0;
                }
                Statics.method26(var152);
                field526 = -1;
                return true;
            }
            if (field526 == 102) {
                for (int var154 = 0; var154 < Statics.field1053; var154++) {
                    class42 var155 = class42.method1347(var154);
                    if (var155 != null && var155.field1054 == 0) {
                        class159.field2702[var154] = 0;
                        class159.field2701[var154] = 0;
                    }
                }
                method1630();
                field669 += 32;
                field526 = -1;
                return true;
            }
            if (field526 == 103) {
                int var156 = field524.method2416();
                int var157 = field524.method2413();
                class158 var158 = class158.method2064(var156);
                if (var158 != null && var158.field2604 == 0) {
                    if (var157 > var158.field2599 - var158.field2593) {
                        var157 = var158.field2599 - var158.field2593;
                    }
                    if (var157 < 0) {
                        var157 = 0;
                    }
                    if (var158.field2597 != var157) {
                        var158.field2597 = var157;
                        Statics.method26(var158);
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 54) {
                int var159 = field524.method2443();
                field644 = var159;
                method189(var159);
                class26.method244(field644);
                for (int var160 = 0; var160 < 100; var160++) {
                    field687[var160] = true;
                }
                field526 = -1;
                return true;
            }
            if (field526 == 138) {
                int var161 = field524.method2411();
                String var162 = field524.method2564();
                int var163 = field524.method2411();
                if (var161 >= 1 && var161 <= 8) {
                    if (var162.equalsIgnoreCase("null")) {
                        var162 = null;
                    }
                    field650[var161 - 1] = var162;
                    field616[var161 - 1] = var163 == 0;
                }
                field526 = -1;
                return true;
            }
            if (field526 == 224) {
                int var164 = field524.method2411();
                int var165 = field524.method2411();
                int var166 = field524.method2411();
                int var167 = field524.method2411();
                field731[var164] = true;
                field637[var164] = var165;
                field510[var164] = var166;
                field734[var164] = var167;
                field735[var164] = 0;
                field526 = -1;
                return true;
            }
            if (field526 == 52) {
                Statics.field1389 = field524.method2437();
                Statics.field1406 = field524.method2435();
                for (int var168 = Statics.field1406; var168 < Statics.field1406 + 8; var168++) {
                    for (int var169 = Statics.field1389; var169 < Statics.field1389 + 8; var169++) {
                        if (field618[Statics.field54][var168][var169] != null) {
                            field618[Statics.field54][var168][var169] = null;
                            method2671(var168, var169);
                        }
                    }
                }
                for (class22 var170 = (class22) field619.method3252(); var170 != null; var170 = (class22) field619.method3268()) {
                    if (var170.field349 >= Statics.field1406 && var170.field349 < Statics.field1406 + 8 && var170.field356 >= Statics.field1389 && var170.field356 < Statics.field1389 + 8 && Statics.field54 == var170.field362) {
                        var170.field358 = 0;
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 108) {
                boolean var171 = field524.method2435() == 1;
                int var172 = field524.method2453();
                class158 var173 = class158.method2064(var172);
                if (var173.field2595 != var171) {
                    var173.field2595 = var171;
                    Statics.method26(var173);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 205) {
                field718 = field524.method2411();
                field526 = -1;
                return true;
            }
            if (field526 == 140) {
                for (int var174 = 0; var174 < field604.length; var174++) {
                    if (field604[var174] != null) {
                        field604[var174].field447 = -1;
                    }
                }
                for (int var175 = 0; var175 < field670.length; var175++) {
                    if (field670[var175] != null) {
                        field670[var175].field447 = -1;
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 11) {
                int var176 = field524.method2444();
                Statics.method161(var176);
                field717[++field671 - 1 & 0x1F] = var176 & 0x7FFF;
                field526 = -1;
                return true;
            }
            if (field526 == 250) {
                int var177 = field524.method2416();
                int var178 = field524.method2413();
                if (var177 < -70000) {
                    var178 += 32768;
                }
                class158 var179;
                if (var177 >= 0) {
                    var179 = class158.method2064(var177);
                } else {
                    var179 = null;
                }
                while (field524.field2035 < field603) {
                    int var180 = field524.method2581();
                    int var181 = field524.method2413();
                    int var182 = 0;
                    if (var181 != 0) {
                        var182 = field524.method2411();
                        if (var182 == 255) {
                            var182 = field524.method2416();
                        }
                    }
                    if (var179 != null && var180 >= 0 && var180 < var179.field2609.length) {
                        var179.field2609[var180] = var181;
                        var179.field2603[var180] = var182;
                    }
                    class19.method629(var178, var180, var181 - 1, var182);
                }
                if (var179 != null) {
                    Statics.method26(var179);
                }
                method1630();
                field717[++field671 - 1 & 0x1F] = var178 & 0x7FFF;
                field526 = -1;
                return true;
            }
            if (field526 == 124) {
                int var183 = field524.method2453();
                int var184 = field524.method2416();
                int var185 = field524.method2445();
                if (var185 == 65535) {
                    var185 = -1;
                }
                int var186 = field524.method2443();
                if (var186 == 65535) {
                    var186 = -1;
                }
                for (int var187 = var186; var187 <= var185; var187++) {
                    long var188 = ((long) var183 << 32) + (long) var187;
                    class179 var190 = field684.method3242(var188);
                    if (var190 != null) {
                        var190.method3288();
                    }
                    field684.method3234(new class171(var184), var188);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 59) {
                int var191 = field524.method2444();
                if (var191 == 65535) {
                    var191 = -1;
                }
                method548(var191);
                field526 = -1;
                return true;
            }
            if (field526 == 2) {
                int var192 = field524.method2444();
                if (var192 == 65535) {
                    var192 = -1;
                }
                int var193 = field524.method2415();
                method124(var192, var193);
                field526 = -1;
                return true;
            }
            if (field526 == 131) {
                String var194 = field524.method2564();
                if (var194.endsWith(":tradereq:")) {
                    String var195 = var194.substring(0, var194.indexOf(":"));
                    boolean var196 = false;
                    if (method2174(var195)) {
                        var196 = true;
                    }
                    if (!var196 && field568 == 0) {
                        method128(4, var195, class134.field2209);
                    }
                } else if (var194.endsWith(":duelreq:")) {
                    String var197 = var194.substring(0, var194.indexOf(":"));
                    boolean var198 = false;
                    if (method2174(var197)) {
                        var198 = true;
                    }
                    if (!var198 && field568 == 0) {
                        method128(8, var197, class134.field2210);
                    }
                } else if (var194.endsWith(":chalreq:")) {
                    String var199 = var194.substring(0, var194.indexOf(":"));
                    boolean var200 = false;
                    if (method2174(var199)) {
                        var200 = true;
                    }
                    if (!var200 && field568 == 0) {
                        String var201 = var194.substring(var194.indexOf(":") + 1, var194.length() - 9);
                        method128(8, var199, var201);
                    }
                } else if (var194.endsWith(":assistreq:")) {
                    String var202 = var194.substring(0, var194.indexOf(":"));
                    boolean var203 = false;
                    if (method2174(var202)) {
                        var203 = true;
                    }
                    if (!var203 && field568 == 0) {
                        method128(10, var202, "");
                    }
                } else if (var194.endsWith(":clan:")) {
                    String var204 = var194.substring(0, var194.indexOf(":clan:"));
                    method128(11, "", var204);
                } else if (var194.endsWith(":trade:")) {
                    String var205 = var194.substring(0, var194.indexOf(":trade:"));
                    if (field568 == 0) {
                        method128(12, "", var205);
                    }
                } else if (var194.endsWith(":assist:")) {
                    String var206 = var194.substring(0, var194.indexOf(":assist:"));
                    if (field568 == 0) {
                        method128(13, "", var206);
                    }
                } else {
                    method128(0, "", var194);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 20) {
                method1630();
                int var207 = field524.method2436();
                int var208 = field524.method2476();
                int var209 = field524.method2437();
                field519[var207] = var208;
                field622[var207] = var209;
                field623[var207] = 1;
                for (int var210 = 0; var210 < 98; var210++) {
                    if (var208 >= class130.field2045[var210]) {
                        field623[var207] = var210 + 2;
                    }
                }
                field672[++field692 - 1 & 0x1F] = var207;
                field526 = -1;
                return true;
            }
            if (field526 == 201) {
                int var211 = field603 + field524.field2035;
                int var212 = field524.method2413();
                int var213 = field524.method2413();
                if (field644 != var212) {
                    field644 = var212;
                    method189(field644);
                    class26.method244(field644);
                    for (int var214 = 0; var214 < 100; var214++) {
                        field687[var214] = true;
                    }
                }
                while (var213-- > 0) {
                    int var215 = field524.method2416();
                    int var216 = field524.method2413();
                    int var217 = field524.method2411();
                    class4 var218 = (class4) field694.method3242((long) var215);
                    if (var218 != null && var218.field59 != var216) {
                        method2804(var218, true);
                        var218 = null;
                    }
                    if (var218 == null) {
                        class4 var219 = new class4();
                        var219.field59 = var216;
                        var219.field56 = var217;
                        field694.method3234(var219, (long) var215);
                        method189(var216);
                        class26.method244(var216);
                        class158 var220 = class158.method2064(var215);
                        if (var220 != null) {
                            Statics.method26(var220);
                        }
                        if (field648 != null) {
                            Statics.method26(field648);
                            field648 = null;
                        }
                        field649 = false;
                        field506 = 0;
                        method145(Statics.field1315, Statics.field32, Statics.field762, Statics.field1409);
                        if (field644 != -1) {
                            int var221 = field644;
                            if (class158.method2312(var221)) {
                                method137(Statics.field2608[var221], 1);
                            }
                        }
                        var218 = var219;
                    }
                    var218.field55 = true;
                }
                for (class4 var223 = (class4) field694.method3232(); var223 != null; var223 = (class4) field694.method3233()) {
                    if (var223.field55) {
                        var223.field55 = false;
                    } else {
                        method2804(var223, true);
                    }
                }
                field684 = new class175(512);
                while (field524.field2035 < var211) {
                    int var224 = field524.method2416();
                    int var225 = field524.method2413();
                    int var226 = field524.method2413();
                    int var227 = field524.method2416();
                    for (int var228 = var225; var228 <= var226; var228++) {
                        long var229 = ((long) var224 << 32) + (long) var228;
                        field684.method3234(new class171(var227), var229);
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 3) {
                if (field644 != -1) {
                    int var231 = field644;
                    if (class158.method2312(var231)) {
                        method137(Statics.field2608[var231], 0);
                    }
                }
                field526 = -1;
                return true;
            }
            if (field526 == 125) {
                String var232 = field524.method2564();
                class116 var233 = field524;
                String var237;
                try {
                    int var234 = var233.method2581();
                    if (var234 > 32767) {
                        var234 = 32767;
                    }
                    byte[] var235 = new byte[var234];
                    var233.field2035 += Statics.field2834.method2333(var233.field2036, var233.field2035, var235, 0, var234);
                    String var236 = class149.method1510(var235, 0, var234);
                    var237 = var236;
                } catch (Exception var279) {
                    var237 = "Cabbage";
                }
                String var240 = class185.method3349(class147.method2130(var237));
                method128(6, var232, var240);
                field526 = -1;
                return true;
            }
            if (field526 == 99) {
                method1630();
                field663 = field524.method2411();
                field587 = field667;
                field526 = -1;
                return true;
            }
            if (field526 == 231) {
                int var241 = field524.method2445();
                int var242 = field524.method2445();
                int var243 = field524.method2453();
                class158 var244 = class158.method2064(var243);
                var244.field2627 = (var242 << 16) + var241;
                field526 = -1;
                return true;
            }
            if (field526 == 106) {
                String var245 = field524.method2564();
                int var246 = field524.method2413();
                byte var247 = field524.method2412();
                boolean var248 = false;
                if (var247 == -128) {
                    var248 = true;
                }
                if (var248) {
                    if (Statics.field251 == 0) {
                        field526 = -1;
                        return true;
                    }
                    boolean var249 = false;
                    int var250;
                    for (var250 = 0; var250 < Statics.field251 && (!Statics.field339[var250].field115.equals(var245) || Statics.field339[var250].field110 != var246); var250++) {
                    }
                    if (var250 < Statics.field251) {
                        while (var250 < Statics.field251 - 1) {
                            Statics.field339[var250] = Statics.field339[var250 + 1];
                            var250++;
                        }
                        Statics.field251--;
                        Statics.field339[Statics.field251] = null;
                    }
                } else {
                    field524.method2564();
                    class8 var251 = new class8();
                    var251.field115 = var245;
                    var251.field109 = class148.method2803(var251.field115, Statics.field483);
                    var251.field110 = var246;
                    var251.field116 = var247;
                    int var252;
                    for (var252 = Statics.field251 - 1; var252 >= 0; var252--) {
                        int var253 = Statics.field339[var252].field109.compareTo(var251.field115);
                        if (var253 == 0) {
                            Statics.field339[var252].field110 = var246;
                            Statics.field339[var252].field116 = var247;
                            if (var245.equals(Statics.field2370.field51)) {
                                Statics.field1387 = var247;
                            }
                            field499 = field667;
                            field526 = -1;
                            return true;
                        }
                        if (var253 < 0) {
                            break;
                        }
                    }
                    if (Statics.field251 >= Statics.field339.length) {
                        field526 = -1;
                        return true;
                    }
                    for (int var254 = Statics.field251 - 1; var254 > var252; var254--) {
                        Statics.field339[var254 + 1] = Statics.field339[var254];
                    }
                    if (Statics.field251 == 0) {
                        Statics.field339 = new class8[100];
                    }
                    Statics.field339[var252 + 1] = var251;
                    Statics.field251++;
                    if (var245.equals(Statics.field2370.field51)) {
                        Statics.field1387 = var247;
                    }
                }
                field499 = field667;
                field526 = -1;
                return true;
            }
            if (field526 == 24) {
                method1271();
                field526 = -1;
                return false;
            }
            if (field526 == 161) {
                int var255 = field524.method2416();
                class4 var256 = (class4) field694.method3242((long) var255);
                if (var256 != null) {
                    method2804(var256, true);
                }
                if (field648 != null) {
                    Statics.method26(field648);
                    field648 = null;
                }
                field526 = -1;
                return true;
            }
            if (field526 == 234) {
                int var257 = field524.method2416();
                int var258 = field524.method2443();
                class158 var259 = class158.method2064(var257);
                if (var259.field2615 != 2 || var259.field2616 != var258) {
                    var259.field2615 = 2;
                    var259.field2616 = var258;
                    Statics.method26(var259);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 166) {
                field482 = true;
                Statics.field883 = field524.method2411();
                Statics.field1616 = field524.method2411();
                Statics.field2709 = field524.method2413();
                Statics.field241 = field524.method2411();
                Statics.field1312 = field524.method2411();
                if (Statics.field1312 >= 100) {
                    Statics.field396 = Statics.field883 * 128 + 64;
                    Statics.field1791 = Statics.field1616 * 128 + 64;
                    Statics.field767 = method13(Statics.field396, Statics.field1791, Statics.field54) - Statics.field2709;
                }
                field526 = -1;
                return true;
            }
            if (field526 == 14) {
                method1352();
                field526 = -1;
                return true;
            }
            if (field526 == 188) {
                int var260 = field524.method2454();
                Statics.field605 = Statics.field2703.method1455(var260);
                field526 = -1;
                return true;
            }
            if (field526 == 143) {
                method688();
                field526 = -1;
                return true;
            }
            if (field526 == 88) {
                field686 = field524.method2411();
                if (field686 == 1) {
                    field498 = field524.method2413();
                }
                if (field686 >= 2 && field686 <= 6) {
                    if (field686 == 2) {
                        field535 = 64;
                        field709 = 64;
                    }
                    if (field686 == 3) {
                        field535 = 0;
                        field709 = 64;
                    }
                    if (field686 == 4) {
                        field535 = 128;
                        field709 = 64;
                    }
                    if (field686 == 5) {
                        field535 = 64;
                        field709 = 0;
                    }
                    if (field686 == 6) {
                        field535 = 64;
                        field709 = 128;
                    }
                    field686 = 2;
                    field500 = field524.method2413();
                    field501 = field524.method2413();
                    field502 = field524.method2411();
                }
                if (field686 == 10) {
                    field556 = field524.method2413();
                }
                field526 = -1;
                return true;
            }
            if (field526 == 218) {
                int var261 = field524.method2476();
                String var262 = field524.method2564();
                class158 var263 = class158.method2064(var261);
                if (!var262.equals(var263.field2630)) {
                    var263.field2630 = var262;
                    Statics.method26(var263);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 184) {
                int var264 = field524.method2416();
                int var265 = field524.method2445();
                if (var265 == 65535) {
                    var265 = -1;
                }
                int var266 = field524.method2453();
                class158 var267 = class158.method2064(var264);
                if (var267.field2598) {
                    var267.field2687 = var265;
                    var267.field2576 = var266;
                    class40 var269 = class40.method248(var265);
                    var267.field2623 = var269.field1020;
                    var267.field2624 = var269.field1014;
                    var267.field2625 = var269.field1027;
                    var267.field2621 = var269.field1016;
                    var267.field2622 = var269.field1017;
                    var267.field2626 = var269.field1012;
                    if (var267.field2592 > 0) {
                        var267.field2626 = var267.field2626 * 32 / var267.field2592;
                    }
                    Statics.method26(var267);
                } else if (var265 == -1) {
                    var267.field2615 = 0;
                    field526 = -1;
                    return true;
                } else {
                    class40 var268 = class40.method248(var265);
                    var267.field2615 = 4;
                    var267.field2616 = var265;
                    var267.field2623 = var268.field1020;
                    var267.field2624 = var268.field1014;
                    var267.field2626 = var268.field1012 * 100 / var266;
                    Statics.method26(var267);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 112) {
                int var270 = field524.method2413();
                int var271 = field524.method2453();
                class158 var272 = class158.method2064(var271);
                if (var272.field2615 != 1 || var272.field2616 != var270) {
                    var272.field2615 = 1;
                    var272.field2616 = var270;
                    Statics.method26(var272);
                }
                field526 = -1;
                return true;
            }
            if (field526 == 196) {
                int var273 = field524.method2416();
                class158 var274 = class158.method2064(var273);
                var274.field2615 = 3;
                var274.field2616 = Statics.field2370.field34.method3132();
                Statics.method26(var274);
                field526 = -1;
                return true;
            }
            class80.method1333("" + field526 + class2.field16 + field584 + class2.field16 + field736 + class2.field16 + field603, (Throwable) null);
            method1271();
        } catch (IOException var283) {
            if (field529 > 0) {
                method1271();
            } else {
                method143(40);
                Statics.field274 = Statics.field1423;
                Statics.field1423 = null;
            }
        } catch (Exception var284) {
            String var277 = "" + field526 + class2.field16 + field584 + class2.field16 + field736 + class2.field16 + field603 + class2.field16 + (Statics.field374 + Statics.field2370.field470[0]) + class2.field16 + (Statics.field872 + Statics.field2370.field471[0]) + class2.field16;
            for (int var278 = 0; var278 < field603 && var278 < 50; var278++) {
                var277 = var277 + field524.field2036[var278] + class2.field16;
            }
            class80.method1333(var277, var284);
            method1271();
        }
        return true;
    }

    @ObfuscatedName("y.ad(I)V")
    public static final void method182() {
        if (field526 == 64) {
            int var0 = field524.method2411();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1406;
            int var2 = (var0 & 0x7) + Statics.field1389;
            int var3 = var1 + field524.method2412();
            int var4 = var2 + field524.method2412();
            int var5 = field524.method2452();
            int var6 = field524.method2413();
            int var7 = field524.method2411() * 4;
            int var8 = field524.method2411() * 4;
            int var9 = field524.method2413();
            int var10 = field524.method2413();
            int var11 = field524.method2411();
            int var12 = field524.method2411();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class10 var17 = new class10(var6, Statics.field54, var13, var14, method13(var13, var14, Statics.field54) - var7, field658 + var9, field658 + var10, var11, var12, var5, var8);
                var17.method127(var15, var16, method13(var15, var16, Statics.field54) - var8, field658 + var9);
                field620.method3247(var17);
            }
        } else if (field526 == 130) {
            int var18 = field524.method2435();
            int var19 = (var18 >> 4 & 0x7) + Statics.field1406;
            int var20 = (var18 & 0x7) + Statics.field1389;
            int var21 = field524.method2413();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class177 var22 = field618[Statics.field54][var19][var20];
                if (var22 != null) {
                    for (class17 var23 = (class17) var22.method3252(); var23 != null; var23 = (class17) var22.method3268()) {
                        if ((var21 & 0x7FFF) == var23.field257) {
                            var23.method3288();
                            break;
                        }
                    }
                    if (var22.method3252() == null) {
                        field618[Statics.field54][var19][var20] = null;
                    }
                    method2671(var19, var20);
                }
            }
        } else if (field526 == 67) {
            int var24 = field524.method2411();
            int var25 = (var24 >> 4 & 0x7) + Statics.field1406;
            int var26 = (var24 & 0x7) + Statics.field1389;
            int var27 = field524.method2413();
            int var28 = field524.method2413();
            int var29 = field524.method2413();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                class177 var30 = field618[Statics.field54][var25][var26];
                if (var30 != null) {
                    for (class17 var31 = (class17) var30.method3252(); var31 != null; var31 = (class17) var30.method3268()) {
                        if ((var27 & 0x7FFF) == var31.field257 && var31.field250 == var28) {
                            var31.field250 = var29;
                            break;
                        }
                    }
                    method2671(var25, var26);
                }
            }
        } else {
            if (field526 == 29) {
                int var32 = field524.method2411();
                int var33 = (var32 >> 4 & 0x7) + Statics.field1406;
                int var34 = (var32 & 0x7) + Statics.field1389;
                int var35 = field524.method2413();
                int var36 = field524.method2411();
                int var37 = var36 >> 4 & 0xF;
                int var38 = var36 & 0x7;
                int var39 = field524.method2411();
                if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                    int var40 = var37 + 1;
                    if (Statics.field2370.field470[0] >= var33 - var40 && Statics.field2370.field470[0] <= var33 + var40 && Statics.field2370.field471[0] >= var34 - var40 && Statics.field2370.field471[0] <= var34 + var40 && field723 != 0 && var38 > 0 && field724 < 50) {
                        field578[field724] = var35;
                        field726[field724] = var38;
                        field727[field724] = var39;
                        field532[field724] = null;
                        field728[field724] = (var33 << 16) + (var34 << 8) + var37;
                        field724++;
                    }
                }
            }
            if (field526 == 35) {
                int var41 = field524.method2437();
                int var42 = (var41 >> 4 & 0x7) + Statics.field1406;
                int var43 = (var41 & 0x7) + Statics.field1389;
                int var44 = field524.method2445();
                int var45 = field524.method2411();
                int var46 = var45 >> 2;
                int var47 = var45 & 0x3;
                int var48 = field592[var46];
                if (var42 >= 0 && var43 >= 0 && var42 < 103 && var43 < 103) {
                    if (var48 == 0) {
                        class96 var49 = Statics.field178.method1836(Statics.field54, var42, var43);
                        if (var49 != null) {
                            int var50 = var49.field1626 >> 14 & 0x7FFF;
                            if (var46 == 2) {
                                var49.field1621 = new class14(var50, 2, var47 + 4, Statics.field54, var42, var43, var44, false, var49.field1621);
                                var49.field1624 = new class14(var50, 2, var47 + 1 & 0x3, Statics.field54, var42, var43, var44, false, var49.field1624);
                            } else {
                                var49.field1621 = new class14(var50, var46, var47, Statics.field54, var42, var43, var44, false, var49.field1621);
                            }
                        }
                    }
                    if (var48 == 1) {
                        class108 var51 = Statics.field178.method1837(Statics.field54, var42, var43);
                        if (var51 != null) {
                            int var52 = var51.field1815 >> 14 & 0x7FFF;
                            if (var46 == 4 || var46 == 5) {
                                var51.field1813 = new class14(var52, 4, var47, Statics.field54, var42, var43, var44, false, var51.field1813);
                            } else if (var46 == 6) {
                                var51.field1813 = new class14(var52, 4, var47 + 4, Statics.field54, var42, var43, var44, false, var51.field1813);
                            } else if (var46 == 7) {
                                var51.field1813 = new class14(var52, 4, (var47 + 2 & 0x3) + 4, Statics.field54, var42, var43, var44, false, var51.field1813);
                            } else if (var46 == 8) {
                                var51.field1813 = new class14(var52, 4, var47 + 4, Statics.field54, var42, var43, var44, false, var51.field1813);
                                var51.field1814 = new class14(var52, 4, (var47 + 2 & 0x3) + 4, Statics.field54, var42, var43, var44, false, var51.field1814);
                            }
                        }
                    }
                    if (var48 == 2) {
                        class98 var53 = Statics.field178.method1838(Statics.field54, var42, var43);
                        if (var46 == 11) {
                            var46 = 10;
                        }
                        if (var53 != null) {
                            var53.field1643 = new class14(var53.field1651 >> 14 & 0x7FFF, var46, var47, Statics.field54, var42, var43, var44, false, var53.field1643);
                        }
                    }
                    if (var48 == 3) {
                        class107 var54 = Statics.field178.method1839(Statics.field54, var42, var43);
                        if (var54 != null) {
                            var54.field1798 = new class14(var54.field1799 >> 14 & 0x7FFF, 22, var47, Statics.field54, var42, var43, var44, false, var54.field1798);
                        }
                    }
                }
            } else if (field526 == 162) {
                int var55 = field524.method2443();
                int var56 = field524.method2445();
                int var57 = field524.method2437();
                int var58 = (var57 >> 4 & 0x7) + Statics.field1406;
                int var59 = (var57 & 0x7) + Statics.field1389;
                int var60 = field524.method2443();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104 && field689 != var56) {
                    class17 var61 = new class17();
                    var61.field257 = var60;
                    var61.field250 = var55;
                    if (field618[Statics.field54][var58][var59] == null) {
                        field618[Statics.field54][var58][var59] = new class177();
                    }
                    field618[Statics.field54][var58][var59].method3247(var61);
                    method2671(var58, var59);
                }
            } else if (field526 == 10) {
                int var62 = field524.method2435();
                int var63 = (var62 >> 4 & 0x7) + Statics.field1406;
                int var64 = (var62 & 0x7) + Statics.field1389;
                int var65 = field524.method2436();
                int var66 = var65 >> 2;
                int var67 = var65 & 0x3;
                int var68 = field592[var66];
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    Statics.method542(Statics.field54, var63, var64, var68, -1, var66, var67, 0, -1);
                }
            } else {
                if (field526 == 110) {
                    byte var69 = field524.method2438();
                    byte var70 = field524.method2478();
                    byte var71 = field524.method2412();
                    int var72 = field524.method2444();
                    int var73 = field524.method2413();
                    int var74 = field524.method2444();
                    int var75 = field524.method2443();
                    int var76 = field524.method2437();
                    int var77 = var76 >> 2;
                    int var78 = var76 & 0x3;
                    int var79 = field592[var77];
                    int var80 = field524.method2411();
                    int var81 = (var80 >> 4 & 0x7) + Statics.field1406;
                    int var82 = (var80 & 0x7) + Statics.field1389;
                    byte var83 = field524.method2412();
                    class3 var84;
                    if (field689 == var74) {
                        var84 = Statics.field2370;
                    } else {
                        var84 = field604[var74];
                    }
                    if (var84 != null) {
                        class32 var85 = class32.method1806(var75);
                        int var86;
                        int var87;
                        if (var78 == 1 || var78 == 3) {
                            var86 = var85.field836;
                            var87 = var85.field835;
                        } else {
                            var86 = var85.field835;
                            var87 = var85.field836;
                        }
                        int var88 = (var86 >> 1) + var81;
                        int var89 = (var86 + 1 >> 1) + var81;
                        int var90 = (var87 >> 1) + var82;
                        int var91 = (var87 + 1 >> 1) + var82;
                        int[][] var92 = class9.field135[Statics.field54];
                        int var93 = var92[var88][var90] + var92[var89][var90] + var92[var88][var91] + var92[var89][var91] >> 2;
                        int var94 = (var81 << 7) + (var86 << 6);
                        int var95 = (var82 << 7) + (var87 << 6);
                        class112 var96 = var85.method662(var77, var78, var92, var94, var93, var95);
                        if (var96 != null) {
                            Statics.method542(Statics.field54, var81, var82, var79, -1, 0, 0, var72 + 1, var73 + 1);
                            var84.field52 = field658 + var72;
                            var84.field42 = field658 + var73;
                            var84.field45 = var96;
                            var84.field40 = var81 * 128 + var86 * 64;
                            var84.field44 = var82 * 128 + var87 * 64;
                            var84.field43 = var93;
                            if (var69 > var71) {
                                byte var97 = var69;
                                var69 = var71;
                                var71 = var97;
                            }
                            if (var70 > var83) {
                                byte var98 = var70;
                                var70 = var83;
                                var83 = var98;
                            }
                            var84.field46 = var69 + var81;
                            var84.field48 = var71 + var81;
                            var84.field47 = var70 + var82;
                            var84.field49 = var82 + var83;
                        }
                    }
                }
                if (field526 == 219) {
                    int var99 = field524.method2435();
                    int var100 = var99 >> 2;
                    int var101 = var99 & 0x3;
                    int var102 = field592[var100];
                    int var103 = field524.method2437();
                    int var104 = (var103 >> 4 & 0x7) + Statics.field1406;
                    int var105 = (var103 & 0x7) + Statics.field1389;
                    int var106 = field524.method2444();
                    if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                        Statics.method542(Statics.field54, var104, var105, var102, var106, var100, var101, 0, -1);
                    }
                } else if (field526 == 4) {
                    int var107 = field524.method2443();
                    int var108 = field524.method2435();
                    int var109 = (var108 >> 4 & 0x7) + Statics.field1406;
                    int var110 = (var108 & 0x7) + Statics.field1389;
                    int var111 = field524.method2445();
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        class17 var112 = new class17();
                        var112.field257 = var107;
                        var112.field250 = var111;
                        if (field618[Statics.field54][var109][var110] == null) {
                            field618[Statics.field54][var109][var110] = new class177();
                        }
                        field618[Statics.field54][var109][var110].method3247(var112);
                        method2671(var109, var110);
                    }
                } else if (field526 == 28) {
                    int var113 = field524.method2411();
                    int var114 = (var113 >> 4 & 0x7) + Statics.field1406;
                    int var115 = (var113 & 0x7) + Statics.field1389;
                    int var116 = field524.method2413();
                    int var117 = field524.method2411();
                    int var118 = field524.method2413();
                    if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                        int var119 = var114 * 128 + 64;
                        int var120 = var115 * 128 + 64;
                        class20 var121 = new class20(var116, Statics.field54, var119, var120, method13(var119, var120, Statics.field54) - var117, var118, field658);
                        field621.method3247(var121);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ef.bg(B)V")
    public static final void method2916() {
        for (class22 var0 = (class22) field619.method3252(); var0 != null; var0 = (class22) field619.method3268()) {
            if (var0.field358 == -1) {
                var0.field363 = 0;
                method2263(var0);
            } else {
                var0.method3288();
            }
        }
    }

    @ObfuscatedName("dj.bt(Lj;I)V")
    public static final void method2263(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field348 == 0) {
            var1 = Statics.field178.method1840(arg0.field362, arg0.field349, arg0.field356);
        }
        if (arg0.field348 == 1) {
            var1 = Statics.field178.method1829(arg0.field362, arg0.field349, arg0.field356);
        }
        if (arg0.field348 == 2) {
            var1 = Statics.field178.method1947(arg0.field362, arg0.field349, arg0.field356);
        }
        if (arg0.field348 == 3) {
            var1 = Statics.field178.method1899(arg0.field362, arg0.field349, arg0.field356);
        }
        if (var1 != 0) {
            int var5 = Statics.field178.method1924(arg0.field362, arg0.field349, arg0.field356, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field351 = var2;
        arg0.field353 = var3;
        arg0.field357 = var4;
    }

    @ObfuscatedName("p.bz(I)V")
    public static final void method36() {
        for (class22 var0 = (class22) field619.method3252(); var0 != null; var0 = (class22) field619.method3268()) {
            if (var0.field358 > 0) {
                var0.field358--;
            }
            if (var0.field358 == 0) {
                if (var0.field351 >= 0) {
                    int var1 = var0.field351;
                    int var2 = var0.field353;
                    class32 var3 = class32.method1806(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method646(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method3119(var0.field362, var0.field348, var0.field349, var0.field356, var0.field351, var0.field357, var0.field353);
                var0.method3288();
            } else {
                if (var0.field363 > 0) {
                    var0.field363--;
                }
                if (var0.field363 == 0 && var0.field349 >= 1 && var0.field356 >= 1 && var0.field349 <= 102 && var0.field356 <= 102) {
                    if (var0.field347 >= 0) {
                        int var5 = var0.field347;
                        int var6 = var0.field354;
                        class32 var7 = class32.method1806(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method646(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method3119(var0.field362, var0.field348, var0.field349, var0.field356, var0.field347, var0.field350, var0.field354);
                    var0.field363 = -1;
                    if (var0.field351 == var0.field347 && var0.field351 == -1) {
                        var0.method3288();
                    } else if (var0.field351 == var0.field347 && var0.field357 == var0.field350 && var0.field354 == var0.field353) {
                        var0.method3288();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.bn(IIIIIIII)V")
    public static final void method3119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field710 && Statics.field54 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field178.method1840(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field178.method1829(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field178.method1947(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field178.method1899(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field178.method1924(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field178.method1831(arg0, arg2, arg3);
                class32 var15 = class32.method1806(var12);
                if (var15.field837 != 0) {
                    field555[arg0].method3154(arg2, arg3, var13, var14, var15.field838);
                }
            }
            if (arg1 == 1) {
                Statics.field178.method1832(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field178.method1833(arg0, arg2, arg3);
                class32 var16 = class32.method1806(var12);
                if (var16.field835 + arg2 > 103 || var16.field835 + arg3 > 103 || var16.field836 + arg2 > 103 || var16.field836 + arg3 > 103) {
                    return;
                }
                if (var16.field837 != 0) {
                    field555[arg0].method3158(arg2, arg3, var16.field835, var16.field836, var14, var16.field838);
                }
            }
            if (arg1 == 3) {
                Statics.field178.method1834(arg0, arg2, arg3);
                class32 var17 = class32.method1806(var12);
                if (var17.field837 == 1) {
                    field555[arg0].method3170(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field118[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method2670(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field178, field555[arg0]);
    }

    @ObfuscatedName("ej.bd(III)V")
    public static final void method2671(int arg0, int arg1) {
        class177 var2 = field618[Statics.field54][arg0][arg1];
        if (var2 == null) {
            Statics.field178.method1835(Statics.field54, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3252(); var5 != null; var5 = (class17) var2.method3268()) {
            class40 var6 = class40.method248(var5.field257);
            int var7 = var6.field1036;
            if (var6.field1018 == 1) {
                var7 = (var5.field250 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field178.method1835(Statics.field54, arg0, arg1);
            return;
        }
        var2.method3248(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3252(); var10 != null; var10 = (class17) var2.method3268()) {
            if (var4.field257 != var10.field257) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field257 != var10.field257 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field178.method1966(Statics.field54, arg0, arg1, method13(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field54), var4, var11, var8, var9);
    }

    @ObfuscatedName("am.ba(B)V")
    public static final void method688() {
        field612 = 0;
        field607 = 0;
        field524.method2277();
        int var0 = field524.method2274(1);
        if (var0 != 0) {
            int var1 = field524.method2274(2);
            if (var1 == 0) {
                field608[++field607 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field524.method2274(3);
                Statics.field2370.method259(var2, false);
                int var3 = field524.method2274(1);
                if (var3 == 1) {
                    field608[++field607 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field524.method2274(3);
                Statics.field2370.method259(var4, true);
                int var5 = field524.method2274(3);
                Statics.field2370.method259(var5, true);
                int var6 = field524.method2274(1);
                if (var6 == 1) {
                    field608[++field607 - 1] = 2047;
                }
            } else if (var1 == 3) {
                Statics.field54 = field524.method2274(2);
                int var7 = field524.method2274(7);
                int var8 = field524.method2274(1);
                if (var8 == 1) {
                    field608[++field607 - 1] = 2047;
                }
                int var9 = field524.method2274(7);
                int var10 = field524.method2274(1);
                Statics.field2370.method267(var7, var9, var10 == 1);
            }
        }
        method1356();
        while (field524.method2283(field603) >= 11) {
            int var11 = field524.method2274(11);
            if (var11 == 2047) {
                break;
            }
            boolean var15 = false;
            if (field604[var11] == null) {
                field604[var11] = new class3();
                if (field609[var11] != null) {
                    field604[var11].method14(field609[var11]);
                }
                var15 = true;
            }
            field701[++field503 - 1] = var11;
            class3 var16 = field604[var11];
            var16.field456 = field658;
            int var17 = field524.method2274(5);
            if (var17 > 15) {
                var17 -= 32;
            }
            int var18 = field524.method2274(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field524.method2274(1);
            if (var19 == 1) {
                field608[++field607 - 1] = var11;
            }
            int var20 = field524.method2274(1);
            int var21 = field617[field524.method2274(3)];
            if (var15) {
                var16.field466 = var16.field419 = var21;
            }
            var16.method267(Statics.field2370.field470[0] + var17, Statics.field2370.field471[0] + var18, var20 == 1);
        }
        field524.method2275();
        method82();
        for (int var12 = 0; var12 < field612; var12++) {
            int var13 = field613[var12];
            if (field658 != field604[var13].field456) {
                field604[var13] = null;
            }
        }
        if (field603 != field524.field2035) {
            throw new RuntimeException(field524.field2035 + class2.field16 + field603);
        }
        for (int var14 = 0; var14 < field503; var14++) {
            if (field604[field701[var14]] == null) {
                throw new RuntimeException(var14 + class2.field16 + field503);
            }
        }
    }

    @ObfuscatedName("bx.bk(I)V")
    public static final void method1356() {
        int var0 = field524.method2274(8);
        if (var0 < field503) {
            for (int var1 = var0; var1 < field503; var1++) {
                field613[++field612 - 1] = field701[var1];
            }
        }
        if (var0 > field503) {
            throw new RuntimeException("");
        }
        field503 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field701[var2];
            class3 var4 = field604[var3];
            int var5 = field524.method2274(1);
            if (var5 == 0) {
                field701[++field503 - 1] = var3;
                var4.field456 = field658;
            } else {
                int var6 = field524.method2274(2);
                if (var6 == 0) {
                    field701[++field503 - 1] = var3;
                    var4.field456 = field658;
                    field608[++field607 - 1] = var3;
                } else if (var6 == 1) {
                    field701[++field503 - 1] = var3;
                    var4.field456 = field658;
                    int var7 = field524.method2274(3);
                    var4.method259(var7, false);
                    int var8 = field524.method2274(1);
                    if (var8 == 1) {
                        field608[++field607 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field701[++field503 - 1] = var3;
                    var4.field456 = field658;
                    int var9 = field524.method2274(3);
                    var4.method259(var9, true);
                    int var10 = field524.method2274(3);
                    var4.method259(var10, true);
                    int var11 = field524.method2274(1);
                    if (var11 == 1) {
                        field608[++field607 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field613[++field612 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("t.by(B)V")
    public static final void method82() {
        for (int var0 = 0; var0 < field607; var0++) {
            int var1 = field608[var0];
            class3 var2 = field604[var1];
            int var3 = field524.method2411();
            if ((var3 & 0x40) != 0) {
                var3 += field524.method2411() << 8;
            }
            method233(var1, var2, var3);
        }
    }

    @ObfuscatedName("j.bf(ILe;II)V")
    public static final void method233(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x20) != 0) {
            int var3 = field524.method2411();
            int var4 = field524.method2437();
            arg1.method261(var3, var4, field658);
            arg1.field438 = field658 + 300;
            arg1.field464 = field524.method2436();
            arg1.field440 = field524.method2435();
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field429 = field524.method2413();
            arg1.field443 = field524.method2445();
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field469 = field524.method2436();
            arg1.field417 = field524.method2435();
            arg1.field458 = field524.method2435();
            arg1.field460 = field524.method2436();
            arg1.field461 = field524.method2444() + field658;
            arg1.field462 = field524.method2445() + field658;
            arg1.field459 = field524.method2437();
            arg1.field455 = 1;
            arg1.field472 = 0;
        }
        if ((arg2 & 0x8) != 0) {
            int var5 = field524.method2435();
            byte[] var6 = new byte[var5];
            class127 var7 = new class127(var6);
            field524.method2580(var6, 0, var5);
            field609[arg0] = var7;
            arg1.method14(var7);
        }
        if ((arg2 & 0x2) != 0) {
            int var8 = field524.method2445();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = field524.method2436();
            Statics.method2649(arg1, var8, var9);
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field430 = field524.method2564();
            if (arg1.field430.charAt(0) == '~') {
                arg1.field430 = arg1.field430.substring(1);
                method128(2, arg1.field51, arg1.field430);
            } else if (Statics.field2370 == arg1) {
                method128(2, arg1.field51, arg1.field430);
            }
            arg1.field432 = 0;
            arg1.field441 = 0;
            arg1.field445 = 150;
        }
        if ((arg2 & 0x400) != 0) {
            int var10 = field524.method2411();
            int var11 = field524.method2411();
            arg1.method261(var10, var11, field658);
            arg1.field438 = field658 + 300;
            arg1.field464 = field524.method2411();
            arg1.field440 = field524.method2435();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field433 = field524.method2445();
            int var12 = field524.method2453();
            arg1.field450 = var12 >> 16;
            arg1.field435 = (var12 & 0xFFFF) + field658;
            arg1.field453 = 0;
            arg1.field454 = 0;
            if (arg1.field435 > field658) {
                arg1.field453 = -1;
            }
            if (arg1.field433 == 65535) {
                arg1.field433 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var13 = field524.method2443();
            int var14 = field524.method2411();
            int var15 = field524.method2437();
            int var16 = field524.field2035;
            if (arg1.field51 != null && arg1.field34 != null) {
                boolean var17 = false;
                if (var14 <= 1 && method2174(arg1.field51)) {
                    var17 = true;
                }
                if (!var17 && field568 == 0) {
                    field505.field2035 = 0;
                    field524.method2422(field505.field2036, 0, var15);
                    field505.field2035 = 0;
                    class127 var18 = field505;
                    String var22;
                    try {
                        int var19 = var18.method2581();
                        if (var19 > 32767) {
                            var19 = 32767;
                        }
                        byte[] var20 = new byte[var19];
                        var18.field2035 += Statics.field2834.method2333(var18.field2036, var18.field2035, var20, 0, var19);
                        String var21 = class149.method1510(var20, 0, var19);
                        var22 = var21;
                    } catch (Exception var26) {
                        var22 = "Cabbage";
                    }
                    String var25 = class185.method3349(class147.method2130(var22));
                    arg1.field430 = var25.trim();
                    arg1.field432 = var13 >> 8;
                    arg1.field441 = var13 & 0xFF;
                    arg1.field445 = 150;
                    if (var14 == 2 || var14 == 3) {
                        method128(1, class2.method1(1) + arg1.field51, var25);
                    } else if (var14 == 1) {
                        method128(1, class2.method1(0) + arg1.field51, var25);
                    } else {
                        method128(2, arg1.field51, var25);
                    }
                }
            }
            field524.field2035 = var15 + var16;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field421 = field524.method2413();
            if (arg1.field421 == 65535) {
                arg1.field421 = -1;
            }
        }
    }

    @ObfuscatedName("bx.bo(I)V")
    public static final void method1352() {
        field612 = 0;
        field607 = 0;
        method37();
        method764();
        method166();
        for (int var0 = 0; var0 < field612; var0++) {
            int var1 = field613[var0];
            if (field658 != field670[var1].field456) {
                field670[var1].field397 = null;
                field670[var1] = null;
            }
        }
        if (field603 != field524.field2035) {
            throw new RuntimeException(field524.field2035 + class2.field16 + field603);
        }
        for (int var2 = 0; var2 < field527; var2++) {
            if (field670[field521[var2]] == null) {
                throw new RuntimeException(var2 + class2.field16 + field527);
            }
        }
    }

    @ObfuscatedName("p.bu(I)V")
    public static final void method37() {
        field524.method2277();
        int var0 = field524.method2274(8);
        if (var0 < field527) {
            for (int var1 = var0; var1 < field527; var1++) {
                field613[++field612 - 1] = field521[var1];
            }
        }
        if (var0 > field527) {
            throw new RuntimeException("");
        }
        field527 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field521[var2];
            class25 var4 = field670[var3];
            int var5 = field524.method2274(1);
            if (var5 == 0) {
                field521[++field527 - 1] = var3;
                var4.field456 = field658;
            } else {
                int var6 = field524.method2274(2);
                if (var6 == 0) {
                    field521[++field527 - 1] = var3;
                    var4.field456 = field658;
                    field608[++field607 - 1] = var3;
                } else if (var6 == 1) {
                    field521[++field527 - 1] = var3;
                    var4.field456 = field658;
                    int var7 = field524.method2274(3);
                    var4.method259(var7, false);
                    int var8 = field524.method2274(1);
                    if (var8 == 1) {
                        field608[++field607 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field521[++field527 - 1] = var3;
                    var4.field456 = field658;
                    int var9 = field524.method2274(3);
                    var4.method259(var9, true);
                    int var10 = field524.method2274(3);
                    var4.method259(var10, true);
                    int var11 = field524.method2274(1);
                    if (var11 == 1) {
                        field608[++field607 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field613[++field612 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("at.bw(I)V")
    public static final void method764() {
        while (true) {
            if (field524.method2283(field603) >= 27) {
                int var0 = field524.method2274(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field670[var0] == null) {
                        field670[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field670[var0];
                    field521[++field527 - 1] = var0;
                    var2.field456 = field658;
                    int var3 = field617[field524.method2274(3)];
                    if (var1) {
                        var2.field466 = var2.field419 = var3;
                    }
                    int var4 = field524.method2274(1);
                    var2.field397 = class31.method3064(field524.method2274(14));
                    int var5 = field524.method2274(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field524.method2274(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field524.method2274(1);
                    if (var7 == 1) {
                        field608[++field607 - 1] = var0;
                    }
                    var2.field463 = var2.field397.field793;
                    var2.field468 = var2.field397.field801;
                    if (var2.field468 == 0) {
                        var2.field419 = 0;
                    }
                    var2.field434 = var2.field397.field783;
                    var2.field426 = var2.field397.field794;
                    var2.field427 = var2.field397.field795;
                    var2.field428 = var2.field397.field798;
                    var2.field422 = var2.field397.field787;
                    var2.field423 = var2.field397.field791;
                    var2.field424 = var2.field397.field792;
                    var2.method267(Statics.field2370.field470[0] + var6, Statics.field2370.field471[0] + var5, var4 == 1);
                    continue;
                }
            }
            field524.method2275();
            return;
        }
    }

    @ObfuscatedName("h.bs(I)V")
    public static final void method166() {
        for (int var0 = 0; var0 < field607; var0++) {
            int var1 = field608[var0];
            class25 var2 = field670[var1];
            int var3 = field524.method2411();
            if ((var3 & 0x2) != 0) {
                var2.field397 = class31.method3064(field524.method2444());
                var2.field463 = var2.field397.field793;
                var2.field468 = var2.field397.field801;
                var2.field434 = var2.field397.field783;
                var2.field426 = var2.field397.field794;
                var2.field427 = var2.field397.field795;
                var2.field428 = var2.field397.field798;
                var2.field422 = var2.field397.field787;
                var2.field423 = var2.field397.field791;
                var2.field424 = var2.field397.field792;
            }
            if ((var3 & 0x1) != 0) {
                var2.field429 = field524.method2445();
                var2.field443 = field524.method2444();
            }
            if ((var3 & 0x8) != 0) {
                int var4 = field524.method2436();
                int var5 = field524.method2436();
                var2.method261(var4, var5, field658);
                var2.field438 = field658 + 300;
                var2.field464 = field524.method2436();
                var2.field440 = field524.method2435();
            }
            if ((var3 & 0x4) != 0) {
                var2.field430 = field524.method2564();
                var2.field445 = 100;
            }
            if ((var3 & 0x10) != 0) {
                int var6 = field524.method2443();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field524.method2435();
                if (var2.field447 == var6 && var6 != -1) {
                    int var8 = class34.method57(var6).field895;
                    if (var8 == 1) {
                        var2.field448 = 0;
                        var2.field449 = 0;
                        var2.field418 = var7;
                        var2.field451 = 0;
                    }
                    if (var8 == 2) {
                        var2.field451 = 0;
                    }
                } else if (var6 == -1 || var2.field447 == -1 || class34.method57(var6).field905 >= class34.method57(var2.field447).field905) {
                    var2.field447 = var6;
                    var2.field448 = 0;
                    var2.field449 = 0;
                    var2.field418 = var7;
                    var2.field451 = 0;
                    var2.field472 = var2.field455;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field421 = field524.method2445();
                if (var2.field421 == 65535) {
                    var2.field421 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field433 = field524.method2443();
                int var9 = field524.method2416();
                var2.field450 = var9 >> 16;
                var2.field435 = (var9 & 0xFFFF) + field658;
                var2.field453 = 0;
                var2.field454 = 0;
                if (var2.field435 > field658) {
                    var2.field453 = -1;
                }
                if (var2.field433 == 65535) {
                    var2.field433 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var10 = field524.method2435();
                int var11 = field524.method2435();
                var2.method261(var10, var11, field658);
                var2.field438 = field658 + 300;
                var2.field464 = field524.method2411();
                var2.field440 = field524.method2436();
            }
        }
    }

    @ObfuscatedName("c.bj(IIIIB)V")
    public static final void method145(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field685; var4++) {
            if (field690[var4] + field504[var4] > arg0 && field690[var4] < arg0 + arg2 && field693[var4] + field691[var4] > arg1 && field691[var4] < arg1 + arg3) {
                field687[var4] = true;
            }
        }
    }

    @ObfuscatedName("l.bb(I)V")
    public static final void method61() {
        if (Statics.field1457 != null || field655 != null) {
            return;
        }
        int var0 = class77.field1410;
        if (field649) {
            if (var0 != 1) {
                int var1 = class77.field1398;
                int var2 = class77.field1395;
                if (var1 < Statics.field1315 - 10 || var1 > Statics.field762 + Statics.field1315 + 10 || var2 < Statics.field32 - 10 || var2 > Statics.field32 + Statics.field1409 + 10) {
                    field649 = false;
                    method145(Statics.field1315, Statics.field32, Statics.field762, Statics.field1409);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field1315;
                int var4 = Statics.field32;
                int var5 = Statics.field762;
                int var6 = class77.field1399;
                int var7 = class77.field1400;
                int var8 = -1;
                for (int var9 = 0; var9 < field506; var9++) {
                    int var10 = (field506 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method129(var8);
                }
                field649 = false;
                method145(Statics.field1315, Statics.field32, Statics.field762, Statics.field1409);
            }
            return;
        }
        if (var0 == 1 && field506 > 0) {
            int var11 = field664[field506 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                label168: {
                    int var12 = field628[field506 - 1];
                    int var13 = field629[field506 - 1];
                    class158 var14 = class158.method2064(var13);
                    int var15 = method2857(var14);
                    boolean var16 = (var15 >> 28 & 0x1) != 0;
                    if (!var16) {
                        class162 var10000 = (class162) null;
                        if (!class162.method2644(method2857(var14))) {
                            break label168;
                        }
                    }
                    field601 = false;
                    field602 = 0;
                    if (Statics.field1457 != null) {
                        Statics.method26(Statics.field1457);
                    }
                    Statics.field1457 = class158.method2064(var13);
                    field713 = var12;
                    field531 = class77.field1399;
                    field599 = class77.field1400;
                    Statics.method26(Statics.field1457);
                    return;
                }
            }
        }
        if (var0 == 1) {
            label170: {
                if (field625 != 1 || field506 <= 2) {
                    int var17 = field506 - 1;
                    boolean var18;
                    if (var17 < 0) {
                        var18 = false;
                    } else {
                        int var19 = field664[var17];
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
                        break label170;
                    }
                }
                var0 = 2;
            }
        }
        if (var0 == 1 && field506 > 0) {
            method129(field506 - 1);
        }
        if (var0 == 2 && field506 > 0) {
            method2656();
        }
    }

    @ObfuscatedName("ev.bx(I)V")
    public static final void method2656() {
        int var0 = Statics.field1333.method3313(class134.field2217);
        for (int var1 = 0; var1 < field506; var1++) {
            class183 var2 = Statics.field1333;
            String var3;
            if (field580[var1].length() > 0) {
                var3 = field632[var1] + class134.field2224 + field580[var1];
            } else {
                var3 = field632[var1];
            }
            int var4 = var2.method3313(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field506 * 15 + 21;
        int var6 = class77.field1399 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1400;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field649 = true;
        Statics.field1315 = var6;
        Statics.field32 = var7;
        Statics.field762 = var0;
        Statics.field1409 = field506 * 15 + 22;
    }

    @ObfuscatedName("q.be(II)V")
    public static final void method129(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field628[arg0];
        int var2 = field629[arg0];
        int var3 = field664[arg0];
        int var4 = field631[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 1004) {
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(151);
            field540.method2398(var4);
        }
        if (var3 == 10) {
            class25 var5 = field670[var4];
            if (var5 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var5.field470[0], var5.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(242);
                field540.method2527(var4);
            }
        }
        if (var3 == 28) {
            field540.method2272(155);
            field540.method2400(var2);
            class158 var6 = class158.method2064(var2);
            if (var6.field2582 != null && var6.field2582[0][0] == 5) {
                int var7 = var6.field2582[0][1];
                class159.field2701[var7] = 1 - class159.field2701[var7];
                method27(var7);
            }
        }
        if (var3 == 47) {
            class3 var8 = field604[var4];
            if (var8 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var8.field470[0], var8.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(28);
                field540.method2442(var4);
            }
        }
        if (var3 == 21) {
            boolean var9 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var9) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(206);
            field540.method2398(Statics.field872 + var2);
            field540.method2527(var4);
            field540.method2442(Statics.field374 + var1);
        }
        if (var3 == 9) {
            class25 var11 = field670[var4];
            if (var11 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var11.field470[0], var11.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(166);
                field540.method2442(var4);
            }
        }
        if (var3 == 1001) {
            method543(var1, var2, var4);
            field540.method2272(239);
            field540.method2442(Statics.field374 + var1);
            field540.method2527(var4 >> 14 & 0x7FFF);
            field540.method2556(Statics.field872 + var2);
        }
        if (var3 == 5) {
            method543(var1, var2, var4);
            field540.method2272(10);
            field540.method2398(var4 >> 14 & 0x7FFF);
            field540.method2398(Statics.field872 + var2);
            field540.method2442(Statics.field374 + var1);
        }
        if (var3 == 25) {
            class158 var12 = class158.method2806(var2, var1);
            if (var12 != null) {
                method2608();
                int var13 = method2857(var12);
                int var14 = var13 >> 11 & 0x3F;
                class158 var16 = class158.method2806(var2, var1);
                if (var16 != null && var16.field2661 != null) {
                    class1 var17 = new class1();
                    var17.field2 = var16;
                    var17.field4 = var16.field2661;
                    class26.method22(var17);
                }
                field549 = true;
                Statics.field278 = var2;
                field641 = var1;
                Statics.field2718 = var14;
                Statics.method26(var16);
                field638 = 0;
                int var18 = method2857(var12);
                int var19 = var18 >> 11 & 0x3F;
                String var20;
                if (var19 == 0) {
                    var20 = null;
                } else if (var12.field2649 == null || var12.field2649.trim().length() == 0) {
                    var20 = null;
                } else {
                    var20 = var12.field2649;
                }
                field642 = var20;
                if (field642 == null) {
                    field642 = "Null";
                }
                if (var12.field2598) {
                    field643 = var12.field2643 + class2.method157(16777215);
                } else {
                    field643 = class2.method157(65280) + var12.field2671 + class2.method157(16777215);
                }
            }
            return;
        }
        if (var3 == 18) {
            boolean var21 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var21) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(22);
            field540.method2556(var4);
            field540.method2398(Statics.field374 + var1);
            field540.method2442(Statics.field872 + var2);
        }
        if (var3 == 4) {
            method543(var1, var2, var4);
            field540.method2272(134);
            field540.method2398(Statics.field872 + var2);
            field540.method2527(var4 >> 14 & 0x7FFF);
            field540.method2556(Statics.field374 + var1);
        }
        if (var3 == 2 && method543(var1, var2, var4)) {
            field540.method2272(52);
            field540.method2527(Statics.field374 + var1);
            field540.method2398(field641);
            field540.method2527(Statics.field872 + var2);
            field540.method2556(var4 >> 14 & 0x7FFF);
            field540.method2400(Statics.field278);
        }
        if (var3 == 58) {
            field540.method2272(73);
            field540.method2527(var1);
            field540.method2398(field641);
            field540.method2451(Statics.field278);
            field540.method2546(var2);
        }
        if (var3 == 1002) {
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(60);
            field540.method2398(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 51) {
            class3 var23 = field604[var4];
            if (var23 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var23.field470[0], var23.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(3);
                field540.method2398(var4);
            }
        }
        if (var3 == 20) {
            boolean var24 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var24) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(165);
            field540.method2398(Statics.field374 + var1);
            field540.method2527(Statics.field872 + var2);
            field540.method2527(var4);
        }
        if (var3 == 46) {
            class3 var26 = field604[var4];
            if (var26 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var26.field470[0], var26.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(220);
                field540.method2398(var4);
            }
        }
        if (var3 == 8) {
            class25 var27 = field670[var4];
            if (var27 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var27.field470[0], var27.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(240);
                field540.method2442(field641);
                field540.method2450(Statics.field278);
                field540.method2527(var4);
            }
        }
        if (var3 == 43) {
            field540.method2272(30);
            field540.method2527(var1);
            field540.method2400(var2);
            field540.method2442(var4);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 22) {
            boolean var28 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var28) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(94);
            field540.method2556(var4);
            field540.method2398(Statics.field374 + var1);
            field540.method2442(Statics.field872 + var2);
        }
        if (var3 == 17) {
            boolean var30 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var30) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(172);
            field540.method2451(Statics.field278);
            field540.method2556(Statics.field872 + var2);
            field540.method2398(Statics.field374 + var1);
            field540.method2527(var4);
            field540.method2398(field641);
        }
        if (var3 == 11) {
            class25 var32 = field670[var4];
            if (var32 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var32.field470[0], var32.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(34);
                field540.method2442(var4);
            }
        }
        if (var3 == 30 && field648 == null) {
            field540.method2272(149);
            field540.method2556(var1);
            field540.method2450(var2);
            field648 = class158.method2806(var2, var1);
            Statics.method26(field648);
        }
        if (var3 == 24) {
            class158 var33 = class158.method2064(var2);
            boolean var34 = true;
            if (var33.field2694 > 0) {
                var34 = method2657(var33);
            }
            if (var34) {
                field540.method2272(155);
                field540.method2400(var2);
            }
        }
        if (var3 == 42) {
            field540.method2272(179);
            field540.method2527(var4);
            field540.method2451(var2);
            field540.method2527(var1);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 39) {
            field540.method2272(128);
            field540.method2398(var4);
            field540.method2546(var2);
            field540.method2398(var1);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 13) {
            class25 var35 = field670[var4];
            if (var35 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var35.field470[0], var35.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(40);
                field540.method2527(var4);
            }
        }
        if (var3 == 35) {
            field540.method2272(192);
            field540.method2546(var2);
            field540.method2442(var1);
            field540.method2527(var4);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 23) {
            Statics.field178.method1851(Statics.field54, var1, var2);
        }
        if (var3 == 16) {
            boolean var36 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var36) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(23);
            field540.method2450(Statics.field2390);
            field540.method2556(Statics.field25);
            field540.method2527(Statics.field872 + var2);
            field540.method2442(Statics.field1128);
            field540.method2442(var4);
            field540.method2556(Statics.field374 + var1);
        }
        if (var3 == 29) {
            field540.method2272(155);
            field540.method2400(var2);
            class158 var38 = class158.method2064(var2);
            if (var38.field2582 != null && var38.field2582[0][0] == 5) {
                int var39 = var38.field2582[0][1];
                if (class159.field2701[var39] != var38.field2681[0]) {
                    class159.field2701[var39] = var38.field2681[0];
                    method27(var39);
                }
            }
        }
        if (var3 == 12) {
            class25 var40 = field670[var4];
            if (var40 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var40.field470[0], var40.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(68);
                field540.method2527(var4);
            }
        }
        if (var3 == 49) {
            class3 var41 = field604[var4];
            if (var41 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var41.field470[0], var41.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(131);
                field540.method2442(var4);
            }
        }
        if (var3 == 14) {
            class3 var42 = field604[var4];
            if (var42 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var42.field470[0], var42.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(125);
                field540.method2527(Statics.field1128);
                field540.method2556(var4);
                field540.method2556(Statics.field25);
                field540.method2546(Statics.field2390);
            }
        }
        if (var3 == 1 && method543(var1, var2, var4)) {
            field540.method2272(62);
            field540.method2527(Statics.field25);
            field540.method2527(Statics.field1128);
            field540.method2527(Statics.field374 + var1);
            field540.method2442(var4 >> 14 & 0x7FFF);
            field540.method2450(Statics.field2390);
            field540.method2556(Statics.field872 + var2);
        }
        if (var3 == 3) {
            method543(var1, var2, var4);
            field540.method2272(84);
            field540.method2527(var4 >> 14 & 0x7FFF);
            field540.method2442(Statics.field374 + var1);
            field540.method2398(Statics.field872 + var2);
        }
        if (var3 == 50) {
            class3 var43 = field604[var4];
            if (var43 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var43.field470[0], var43.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(64);
                field540.method2527(var4);
            }
        }
        if (var3 == 45) {
            class3 var44 = field604[var4];
            if (var44 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var44.field470[0], var44.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(98);
                field540.method2442(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            String var45 = field580[arg0];
            class158 var46 = class158.method2806(var2, var1);
            if (var46 != null) {
                if (var46.field2670 != null) {
                    class1 var47 = new class1();
                    var47.field2 = var46;
                    var47.field5 = var4;
                    var47.field11 = var45;
                    var47.field4 = var46.field2670;
                    class26.method22(var47);
                }
                boolean var48 = true;
                if (var46.field2694 > 0) {
                    var48 = method2657(var46);
                }
                if (var48 && class162.method2155(method2857(var46), var4 - 1)) {
                    if (var4 == 1) {
                        field540.method2272(219);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 2) {
                        field540.method2272(153);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 3) {
                        field540.method2272(110);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 4) {
                        field540.method2272(21);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 5) {
                        field540.method2272(82);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 6) {
                        field540.method2272(97);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 7) {
                        field540.method2272(46);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 8) {
                        field540.method2272(12);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 9) {
                        field540.method2272(191);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                    if (var4 == 10) {
                        field540.method2272(6);
                        field540.method2400(var2);
                        field540.method2398(var1);
                    }
                }
            }
        }
        if (var3 == 48) {
            class3 var49 = field604[var4];
            if (var49 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var49.field470[0], var49.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(5);
                field540.method2398(var4);
            }
        }
        if (var3 == 15) {
            class3 var50 = field604[var4];
            if (var50 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var50.field470[0], var50.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(202);
                field540.method2556(var4);
                field540.method2546(Statics.field278);
                field540.method2556(field641);
            }
        }
        if (var3 == 34) {
            field540.method2272(211);
            field540.method2442(var4);
            field540.method2450(var2);
            field540.method2442(var1);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 32) {
            field540.method2272(214);
            field540.method2451(var2);
            field540.method2400(Statics.field278);
            field540.method2527(var1);
            field540.method2527(var4);
            field540.method2527(field641);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 33) {
            field540.method2272(122);
            field540.method2556(var4);
            field540.method2546(var2);
            field540.method2556(var1);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 7) {
            class25 var51 = field670[var4];
            if (var51 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var51.field470[0], var51.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(53);
                field540.method2398(var4);
                field540.method2451(Statics.field2390);
                field540.method2556(Statics.field25);
                field540.method2442(Statics.field1128);
            }
        }
        if (var3 == 44) {
            class3 var52 = field604[var4];
            if (var52 != null) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var52.field470[0], var52.field471[0], false, 0, 0, 1, 1, 0, 2);
                field591 = class77.field1399;
                field477 = class77.field1400;
                field594 = 2;
                field660 = 0;
                field540.method2272(177);
                field540.method2556(var4);
            }
        }
        if (var3 == 6) {
            method543(var1, var2, var4);
            field540.method2272(163);
            field540.method2442(var4 >> 14 & 0x7FFF);
            field540.method2442(Statics.field374 + var1);
            field540.method2556(Statics.field872 + var2);
        }
        if (var3 == 40) {
            field540.method2272(105);
            field540.method2556(var1);
            field540.method2400(var2);
            field540.method2527(var4);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 36) {
            field540.method2272(199);
            field540.method2546(var2);
            field540.method2527(var1);
            field540.method2527(var4);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 19) {
            boolean var53 = method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var53) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            field540.method2272(101);
            field540.method2442(Statics.field872 + var2);
            field540.method2556(Statics.field374 + var1);
            field540.method2527(var4);
        }
        if (var3 == 41) {
            field540.method2272(109);
            field540.method2556(var1);
            field540.method2400(var2);
            field540.method2527(var4);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 37) {
            field540.method2272(217);
            field540.method2556(var4);
            field540.method2442(var1);
            field540.method2400(var2);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 38) {
            method2608();
            class158 var55 = class158.method2064(var2);
            field638 = 1;
            Statics.field1128 = var1;
            Statics.field2390 = var2;
            Statics.field25 = var4;
            Statics.method26(var55);
            field639 = class2.method157(16748608) + class40.method248(var4).field1007 + class2.method157(16777215);
            if (field639 == null) {
                field639 = "null";
            }
            return;
        }
        if (var3 == 1003) {
            field591 = class77.field1399;
            field477 = class77.field1400;
            field594 = 2;
            field660 = 0;
            class25 var56 = field670[var4];
            if (var56 != null) {
                class31 var57 = var56.field397;
                if (var57.field811 != null) {
                    var57 = var57.method611();
                }
                if (var57 != null) {
                    field540.method2272(32);
                    field540.method2527(var57.field788);
                }
            }
        }
        if (var3 == 26) {
            method2172();
        }
        if (var3 == 31) {
            field540.method2272(113);
            field540.method2450(Statics.field2390);
            field540.method2451(var2);
            field540.method2398(Statics.field1128);
            field540.method2398(var4);
            field540.method2442(var1);
            field540.method2556(Statics.field25);
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (var3 == 1005) {
            class158 var58 = class158.method2064(var2);
            if (var58 == null || var58.field2603[var1] < 100000) {
                field540.method2272(151);
                field540.method2398(var4);
            } else {
                method128(0, "", var58.field2603[var1] + " x " + class40.method248(var4).field1007);
            }
            field595 = 0;
            Statics.field2450 = class158.method2064(var2);
            field596 = var1;
        }
        if (field638 != 0) {
            field638 = 0;
            Statics.method26(class158.method2064(Statics.field2390));
        }
        if (field549) {
            method2608();
        }
        if (Statics.field2450 != null && field595 == 0) {
            Statics.method26(Statics.field2450);
        }
    }

    @ObfuscatedName("j.bq(ILjava/lang/String;S)V")
    public static void method232(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field503; var3++) {
            class3 var4 = field604[field701[var3]];
            if (var4 != null && var4.field51 != null && var4.field51.equalsIgnoreCase(arg1)) {
                method181(Statics.field2370.field470[0], Statics.field2370.field471[0], var4.field470[0], var4.field471[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field540.method2272(177);
                    field540.method2556(field701[var3]);
                } else if (arg0 == 4) {
                    field540.method2272(28);
                    field540.method2442(field701[var3]);
                } else if (arg0 == 6) {
                    field540.method2272(131);
                    field540.method2442(field701[var3]);
                } else if (arg0 == 7) {
                    field540.method2272(64);
                    field540.method2527(field701[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method128(0, "", class134.field2213 + arg1);
        }
    }

    @ObfuscatedName("dy.bi(I)V")
    public static void method2608() {
        if (!field549) {
            return;
        }
        class158 var0 = class158.method2806(Statics.field278, field641);
        if (var0 != null && var0.field2662 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field4 = var0.field2662;
            class26.method22(var1);
        }
        field549 = false;
        Statics.method26(var0);
    }

    @ObfuscatedName("bc.bl(I)V")
    public static final void method1345() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field506 - 1; var1++) {
                if (field664[var1] < 1000 && field664[var1 + 1] > 1000) {
                    String var2 = field580[var1];
                    field580[var1] = field580[var1 + 1];
                    field580[var1 + 1] = var2;
                    String var3 = field632[var1];
                    field632[var1] = field632[var1 + 1];
                    field632[var1 + 1] = var3;
                    int var4 = field664[var1];
                    field664[var1] = field664[var1 + 1];
                    field664[var1 + 1] = var4;
                    int var5 = field628[var1];
                    field628[var1] = field628[var1 + 1];
                    field628[var1 + 1] = var5;
                    int var6 = field629[var1];
                    field629[var1] = field629[var1 + 1];
                    field629[var1 + 1] = var6;
                    int var7 = field631[var1];
                    field631[var1] = field631[var1 + 1];
                    field631[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("b.bh(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method220(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field649 || field506 >= 500) {
            return;
        }
        field632[field506] = arg0;
        field580[field506] = arg1;
        field664[field506] = arg2;
        field631[field506] = arg3;
        field628[field506] = arg4;
        field629[field506] = arg5;
        field506++;
    }

    @ObfuscatedName("z.bv(IIIII)V")
    public static final void method156(int arg0, int arg1, int arg2, int arg3) {
        if (field638 == 0 && !field549) {
            method220(class134.field2233, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1867; var5++) {
            int var6 = class112.field1912[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field178.method1924(Statics.field54, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method1806(var10);
                    if (var11.field821 != null) {
                        var11 = var11.method652();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field638 == 1) {
                        method220(class134.field2214, field639 + " " + class2.field20 + " " + class2.method157(65535) + var11.field830, 1, var6, var7, var8);
                    } else if (!field549) {
                        String[] var12 = var11.field858;
                        if (field654) {
                            var12 = method2153(var12);
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
                                    method220(var12[var13], class2.method157(65535) + var11.field830, var14, var6, var7, var8);
                                }
                            }
                        }
                        method220(class134.field2231, class2.method157(65535) + var11.field830, 1002, var11.field827 << 14, var7, var8);
                    } else if ((Statics.field2718 & 0x4) == 4) {
                        method220(field642, field643 + " " + class2.field20 + " " + class2.method157(65535) + var11.field830, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field670[var10];
                    if (var15.field397.field793 == 1 && (var15.field473 & 0x7F) == 64 && (var15.field442 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field527; var16++) {
                            class25 var17 = field670[field521[var16]];
                            if (var17 != null && var15 != var17 && var17.field397.field793 == 1 && var15.field473 == var17.field473 && var15.field442 == var17.field442) {
                                method175(var17.field397, field521[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field503; var18++) {
                            class3 var19 = field604[field701[var18]];
                            if (var19 != null && var15.field473 == var19.field473 && var15.field442 == var19.field442) {
                                method21(var19, field701[var18], var7, var8);
                            }
                        }
                    }
                    method175(var15.field397, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field604[var10];
                    if ((var20.field473 & 0x7F) == 64 && (var20.field442 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field527; var21++) {
                            class25 var22 = field670[field521[var21]];
                            if (var22 != null && var22.field397.field793 == 1 && var20.field473 == var22.field473 && var20.field442 == var22.field442) {
                                method175(var22.field397, field521[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field503; var23++) {
                            class3 var24 = field604[field701[var23]];
                            if (var24 != null && var20 != var24 && var20.field473 == var24.field473 && var20.field442 == var24.field442) {
                                method21(var24, field701[var23], var7, var8);
                            }
                        }
                    }
                    method21(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field618[Statics.field54][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3253(); var26 != null; var26 = (class17) var25.method3255()) {
                            class40 var27 = class40.method248(var26.field257);
                            if (field638 == 1) {
                                method220(class134.field2214, field639 + " " + class2.field20 + " " + class2.method157(16748608) + var27.field1007, 16, var26.field257, var7, var8);
                            } else if (!field549) {
                                String[] var28 = var27.field1021;
                                if (field654) {
                                    var28 = method2153(var28);
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
                                        method220(var28[var29], class2.method157(16748608) + var27.field1007, var30, var26.field257, var7, var8);
                                    } else if (var29 == 2) {
                                        method220(class134.field2102, class2.method157(16748608) + var27.field1007, 20, var26.field257, var7, var8);
                                    }
                                }
                                method220(class134.field2231, class2.method157(16748608) + var27.field1007, 1004, var26.field257, var7, var8);
                            } else if ((Statics.field2718 & 0x1) == 1) {
                                method220(field642, field643 + " " + class2.field20 + " " + class2.method157(16748608) + var27.field1007, 17, var26.field257, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.bm(Laq;IIII)V")
    public static final void method175(class31 arg0, int arg1, int arg2, int arg3) {
        if (field506 >= 400) {
            return;
        }
        if (arg0.field811 != null) {
            arg0 = arg0.method611();
        }
        if (arg0 == null || !arg0.field814) {
            return;
        }
        String var4 = arg0.field786;
        if (arg0.field803 != 0) {
            var4 = var4 + method706(arg0.field803, Statics.field2370.field37) + " " + class2.field27 + class134.field2220 + arg0.field803 + class2.field26;
        }
        if (field638 == 1) {
            method220(class134.field2214, field639 + " " + class2.field20 + " " + class2.method157(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field549) {
            String[] var5 = arg0.field820;
            if (field654) {
                var5 = method2153(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class134.field2216)) {
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
                        method220(var5[var6], class2.method157(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class134.field2216)) {
                        short var9 = 0;
                        if (arg0.field803 > Statics.field2370.field37) {
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
                        method220(var5[var8], class2.method157(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method220(class134.field2231, class2.method157(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2718 & 0x2) == 2) {
            method220(field642, field643 + " " + class2.field20 + " " + class2.method157(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.bp(Le;IIII)V")
    public static final void method21(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2370 == arg0 || field506 >= 400) {
            return;
        }
        String var4;
        if (arg0.field33 == 0) {
            var4 = arg0.field51 + method706(arg0.field37, Statics.field2370.field37) + " " + class2.field27 + class134.field2220 + arg0.field37 + class2.field26;
        } else {
            var4 = arg0.field51 + " " + class2.field27 + class134.field2221 + arg0.field33 + class2.field26;
        }
        if (field638 == 1) {
            method220(class134.field2214, field639 + " " + class2.field20 + " " + class2.method157(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field549) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field650[var5] != null) {
                    short var6 = 0;
                    if (field650[var5].equalsIgnoreCase(class134.field2216)) {
                        if (arg0.field37 > Statics.field2370.field37) {
                            var6 = 2000;
                        }
                        if (Statics.field2370.field41 != 0 && arg0.field41 != 0) {
                            if (Statics.field2370.field41 == arg0.field41) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field616[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field614[var5] + var6;
                    method220(field650[var5], class2.method157(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2718 & 0x8) == 8) {
            method220(field642, field643 + " " + class2.field20 + " " + class2.method157(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field506; var9++) {
            if (field664[var9] == 23) {
                field580[var9] = class2.method157(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("an.br(III)Ljava/lang/String;")
    public static final String method706(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method157(16711680);
        } else if (var2 < -6) {
            return class2.method157(16723968);
        } else if (var2 < -3) {
            return class2.method157(16740352);
        } else if (var2 < 0) {
            return class2.method157(16756736);
        } else if (var2 > 9) {
            return class2.method157(65280);
        } else if (var2 > 6) {
            return class2.method157(4259584);
        } else if (var2 > 3) {
            return class2.method157(8453888);
        } else if (var2 > 0) {
            return class2.method157(12648192);
        } else {
            return class2.method157(16776960);
        }
    }

    @ObfuscatedName("bb.cw(IIIIIIIIB)V")
    public static final void method1351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method2312(arg0)) {
            Statics.field210 = null;
            method2148(Statics.field2608[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field210 != null) {
                method2148(Statics.field210, -1412584499, arg1, arg2, arg3, arg4, Statics.field1655, Statics.field392, arg7);
                Statics.field210 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field687[var8] = true;
            }
        } else {
            field687[arg7] = true;
        }
    }

    @ObfuscatedName("de.ct([Lfl;IIIIIIIII)V")
    public static final void method2148(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1740(arg2, arg3, arg4, arg5);
        class104.method2069();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2697 == arg1 || arg1 == -1412584499 && field655 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field690[field685] = var10.field2588 + arg6;
                    field691[field685] = var10.field2679 + arg7;
                    field504[field685] = var10.field2592;
                    field693[field685] = var10.field2593;
                    var11 = ++field685 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2610 = var11;
                var10.field2699 = field658;
                if (!var10.field2598 || !method1381(var10)) {
                    if (var10.field2694 > 0) {
                        int var12 = var10.field2694;
                        if (var12 == 324) {
                            if (field640 == -1) {
                                field640 = var10.field2631;
                                field744 = var10.field2585;
                            }
                            if (field742.field2721) {
                                var10.field2631 = field640;
                            } else {
                                var10.field2631 = field744;
                            }
                        } else if (var12 == 325) {
                            if (field640 == -1) {
                                field640 = var10.field2631;
                                field744 = var10.field2585;
                            }
                            if (field742.field2721) {
                                var10.field2631 = field744;
                            } else {
                                var10.field2631 = field640;
                            }
                        } else if (var12 == 327) {
                            var10.field2623 = 150;
                            var10.field2624 = (int) (Math.sin((double) field658 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2615 = 5;
                            var10.field2616 = 0;
                        } else if (var12 == 328) {
                            var10.field2623 = 150;
                            var10.field2624 = (int) (Math.sin((double) field658 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2615 = 5;
                            var10.field2616 = 1;
                        }
                    }
                    int var13 = var10.field2588 + arg6;
                    int var14 = var10.field2679 + arg7;
                    int var15 = var10.field2605;
                    if (field655 == var10) {
                        if (arg1 != -1412584499 && !var10.field2648) {
                            Statics.field210 = arg0;
                            Statics.field1655 = arg6;
                            Statics.field392 = arg7;
                            continue;
                        }
                        if (field743 && field746) {
                            int var16 = class77.field1398;
                            int var17 = class77.field1395;
                            int var18 = var16 - field657;
                            int var19 = var17 - field586;
                            if (var18 < field661) {
                                var18 = field661;
                            }
                            if (var10.field2592 + var18 > field661 + field656.field2592) {
                                var18 = field661 + field656.field2592 - var10.field2592;
                            }
                            if (var19 < field662) {
                                var19 = field662;
                            }
                            if (var10.field2593 + var19 > field662 + field656.field2593) {
                                var19 = field662 + field656.field2593 - var10.field2593;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2648) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2604 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2604 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2592 + var13;
                        int var27 = var10.field2593 + var14;
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
                        int var30 = var10.field2592 + var13;
                        int var31 = var10.field2593 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2598 || var20 < var22 && var21 < var23) {
                        if (var10.field2694 != 0) {
                            if (var10.field2694 == 1337) {
                                field634 = var13;
                                field725 = var14;
                                method1502(var13, var14, var10.field2592, var10.field2593);
                                class89.method1740(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2694 == 1338) {
                                method2065();
                                class89.method1740(var13, var14, Statics.field1550.field1484 + var13, Statics.field1550.field1483 + var14);
                                if (field718 == 2 || field718 == 5) {
                                    class89.method1755(var13 + 25, var14 + 5, 0, Statics.field563, Statics.field753);
                                } else {
                                    int var32 = field606 + field571 & 0x7FF;
                                    int var33 = Statics.field2370.field473 / 32 + 48;
                                    int var34 = 464 - Statics.field2370.field442 / 32;
                                    Statics.field1551.method1655(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field558 + 256, Statics.field563, Statics.field753);
                                    for (int var35 = 0; var35 < field712; var35++) {
                                        int var36 = field730[var35] * 4 + 2 - Statics.field2370.field473 / 32;
                                        int var37 = field485[var35] * 4 + 2 - Statics.field2370.field442 / 32;
                                        method759(var13, var14, var36, var37, field611[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class177 var40 = field618[Statics.field54][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field2370.field473 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field2370.field442 / 32;
                                                method759(var13, var14, var41, var42, Statics.field1372[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field527; var43++) {
                                        class25 var44 = field670[field521[var43]];
                                        if (var44 != null && var44.method24()) {
                                            class31 var45 = var44.field397;
                                            if (var45 != null && var45.field811 != null) {
                                                var45 = var45.method611();
                                            }
                                            if (var45 != null && var45.field802 && var45.field814) {
                                                int var46 = var44.field473 / 32 - Statics.field2370.field473 / 32;
                                                int var47 = var44.field442 / 32 - Statics.field2370.field442 / 32;
                                                method759(var13, var14, var46, var47, Statics.field1372[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field503; var48++) {
                                        class3 var49 = field604[field701[var48]];
                                        if (var49 != null && var49.method24()) {
                                            int var50 = var49.field473 / 32 - Statics.field2370.field473 / 32;
                                            int var51 = var49.field442 / 32 - Statics.field2370.field442 / 32;
                                            boolean var52 = false;
                                            if (method3025(var49.field51)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            if (Statics.field2370.field41 != 0 && var49.field41 != 0 && Statics.field2370.field41 == var49.field41) {
                                                var53 = true;
                                            }
                                            if (var52) {
                                                method759(var13, var14, var50, var51, Statics.field1372[3]);
                                            } else if (var53) {
                                                method759(var13, var14, var50, var51, Statics.field1372[4]);
                                            } else {
                                                method759(var13, var14, var50, var51, Statics.field1372[2]);
                                            }
                                        }
                                    }
                                    if (field686 != 0 && field658 % 20 < 10) {
                                        if (field686 == 1 && field498 >= 0 && field498 < field670.length) {
                                            class25 var54 = field670[field498];
                                            if (var54 != null) {
                                                int var55 = var54.field473 / 32 - Statics.field2370.field473 / 32;
                                                int var56 = var54.field442 / 32 - Statics.field2370.field442 / 32;
                                                method3046(var13, var14, var55, var56, Statics.field750[1]);
                                            }
                                        }
                                        if (field686 == 2) {
                                            int var57 = field500 * 4 - Statics.field374 * 4 + 2 - Statics.field2370.field473 / 32;
                                            int var58 = field501 * 4 - Statics.field872 * 4 + 2 - Statics.field2370.field442 / 32;
                                            method3046(var13, var14, var57, var58, Statics.field750[1]);
                                        }
                                        if (field686 == 10 && field556 >= 0 && field556 < field604.length) {
                                            class3 var59 = field604[field556];
                                            if (var59 != null) {
                                                int var60 = var59.field473 / 32 - Statics.field2370.field473 / 32;
                                                int var61 = var59.field442 / 32 - Statics.field2370.field442 / 32;
                                                method3046(var13, var14, var60, var61, Statics.field750[1]);
                                            }
                                        }
                                    }
                                    if (field716 != 0) {
                                        int var62 = field716 * 4 + 2 - Statics.field2370.field473 / 32;
                                        int var63 = field714 * 4 + 2 - Statics.field2370.field442 / 32;
                                        method759(var13, var14, var62, var63, Statics.field750[0]);
                                    }
                                    class89.method1746(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field718 < 3) {
                                    Statics.field1981.method1655(var13, var14, 33, 33, 25, 25, field571, 256, Statics.field1197, Statics.field371);
                                } else {
                                    class89.method1755(var13, var14, 0, Statics.field1197, Statics.field371);
                                }
                                if (field673[var11]) {
                                    Statics.field1550.method1723(var13, var14);
                                }
                                field688[var11] = true;
                                class89.method1740(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var64 = class77.field1398;
                        int var65 = class77.field1395;
                        if (!field649 && var64 >= var20 && var65 >= var21 && var64 < var22 && var65 < var23) {
                            int var66 = var64 - var13;
                            int var67 = var65 - var14;
                            if (var10.field2586 == 1) {
                                method220(var10.field2683, "", 24, 0, 0, var10.field2583);
                            }
                            if (var10.field2586 == 2 && !field549) {
                                int var68 = method2857(var10);
                                int var69 = var68 >> 11 & 0x3F;
                                String var70;
                                if (var69 == 0) {
                                    var70 = null;
                                } else if (var10.field2649 == null || var10.field2649.trim().length() == 0) {
                                    var70 = null;
                                } else {
                                    var70 = var10.field2649;
                                }
                                if (var70 != null) {
                                    method220(var70, class2.method157(65280) + var10.field2671, 25, 0, -1, var10.field2583);
                                }
                            }
                            if (var10.field2586 == 3) {
                                method220(class134.field2223, "", 26, 0, 0, var10.field2583);
                            }
                            if (var10.field2586 == 4) {
                                method220(var10.field2683, "", 28, 0, 0, var10.field2583);
                            }
                            if (var10.field2586 == 5) {
                                method220(var10.field2683, "", 29, 0, 0, var10.field2583);
                            }
                            if (var10.field2586 == 6 && field648 == null) {
                                method220(var10.field2683, "", 30, 0, -1, var10.field2583);
                            }
                            if (var10.field2604 == 2) {
                                int var72 = 0;
                                for (int var73 = 0; var73 < var10.field2593; var73++) {
                                    for (int var74 = 0; var74 < var10.field2592; var74++) {
                                        int var75 = (var10.field2636 + 32) * var74;
                                        int var76 = (var10.field2637 + 32) * var73;
                                        if (var72 < 20) {
                                            var75 += var10.field2685[var72];
                                            var76 += var10.field2639[var72];
                                        }
                                        if (var66 >= var75 && var67 >= var76 && var66 < var75 + 32 && var67 < var76 + 32) {
                                            field600 = var72;
                                            Statics.field255 = var10;
                                            if (var10.field2609[var72] > 0) {
                                                class40 var77 = class40.method248(var10.field2609[var72] - 1);
                                                if (field638 == 1 && class162.method2347(method2857(var10))) {
                                                    if (Statics.field2390 != var10.field2583 || Statics.field1128 != var72) {
                                                        method220(class134.field2214, field639 + " " + class2.field20 + " " + class2.method157(16748608) + var77.field1007, 31, var77.field1005, var72, var10.field2583);
                                                    }
                                                } else if (!field549 || !class162.method2347(method2857(var10))) {
                                                    String[] var78 = var77.field1010;
                                                    if (field654) {
                                                        var78 = method2153(var78);
                                                    }
                                                    if (class162.method2347(method2857(var10))) {
                                                        for (int var79 = 4; var79 >= 3; var79--) {
                                                            if (var78 != null && var78[var79] != null) {
                                                                byte var80;
                                                                if (var79 == 3) {
                                                                    var80 = 36;
                                                                } else {
                                                                    var80 = 37;
                                                                }
                                                                method220(var78[var79], class2.method157(16748608) + var77.field1007, var80, var77.field1005, var72, var10.field2583);
                                                            } else if (var79 == 4) {
                                                                method220(class134.field2075, class2.method157(16748608) + var77.field1007, 37, var77.field1005, var72, var10.field2583);
                                                            }
                                                        }
                                                    }
                                                    int var81 = method2857(var10);
                                                    boolean var82 = (var81 >> 31 & 0x1) != 0;
                                                    if (var82) {
                                                        method220(class134.field2214, class2.method157(16748608) + var77.field1007, 38, var77.field1005, var72, var10.field2583);
                                                    }
                                                    class162 var10000 = (class162) null;
                                                    if (class162.method2347(method2857(var10)) && var78 != null) {
                                                        for (int var83 = 2; var83 >= 0; var83--) {
                                                            if (var78[var83] != null) {
                                                                byte var84 = 0;
                                                                if (var83 == 0) {
                                                                    var84 = 33;
                                                                }
                                                                if (var83 == 1) {
                                                                    var84 = 34;
                                                                }
                                                                if (var83 == 2) {
                                                                    var84 = 35;
                                                                }
                                                                method220(var78[var83], class2.method157(16748608) + var77.field1007, var84, var77.field1005, var72, var10.field2583);
                                                            }
                                                        }
                                                    }
                                                    String[] var85 = var10.field2677;
                                                    if (field654) {
                                                        var85 = method2153(var85);
                                                    }
                                                    if (var85 != null) {
                                                        for (int var86 = 4; var86 >= 0; var86--) {
                                                            if (var85[var86] != null) {
                                                                byte var87 = 0;
                                                                if (var86 == 0) {
                                                                    var87 = 39;
                                                                }
                                                                if (var86 == 1) {
                                                                    var87 = 40;
                                                                }
                                                                if (var86 == 2) {
                                                                    var87 = 41;
                                                                }
                                                                if (var86 == 3) {
                                                                    var87 = 42;
                                                                }
                                                                if (var86 == 4) {
                                                                    var87 = 43;
                                                                }
                                                                method220(var85[var86], class2.method157(16748608) + var77.field1007, var87, var77.field1005, var72, var10.field2583);
                                                            }
                                                        }
                                                    }
                                                    method220(class134.field2231, class2.method157(16748608) + var77.field1007, 1005, var77.field1005, var72, var10.field2583);
                                                } else if ((Statics.field2718 & 0x10) == 16) {
                                                    method220(field642, field643 + " " + class2.field20 + " " + class2.method157(16748608) + var77.field1007, 32, var77.field1005, var72, var10.field2583);
                                                }
                                            }
                                        }
                                        var72++;
                                    }
                                }
                            }
                            if (var10.field2598) {
                                if (!field549) {
                                    for (int var88 = 9; var88 >= 5; var88--) {
                                        String var89;
                                        if (!class162.method2155(method2857(var10), var88) && var10.field2670 == null) {
                                            var89 = null;
                                        } else if (var10.field2644 == null || var10.field2644.length <= var88 || var10.field2644[var88] == null || var10.field2644[var88].trim().length() == 0) {
                                            var89 = null;
                                        } else {
                                            var89 = var10.field2644[var88];
                                        }
                                        if (var89 != null) {
                                            method220(var89, var10.field2643, 1007, var88 + 1, var10.field2584, var10.field2583);
                                        }
                                    }
                                    int var91 = method2857(var10);
                                    int var92 = var91 >> 11 & 0x3F;
                                    String var93;
                                    if (var92 == 0) {
                                        var93 = null;
                                    } else if (var10.field2649 == null || var10.field2649.trim().length() == 0) {
                                        var93 = null;
                                    } else {
                                        var93 = var10.field2649;
                                    }
                                    if (var93 != null) {
                                        method220(var93, var10.field2643, 25, 0, var10.field2584, var10.field2583);
                                    }
                                    for (int var95 = 4; var95 >= 0; var95--) {
                                        String var96;
                                        if (!class162.method2155(method2857(var10), var95) && var10.field2670 == null) {
                                            var96 = null;
                                        } else if (var10.field2644 == null || var10.field2644.length <= var95 || var10.field2644[var95] == null || var10.field2644[var95].trim().length() == 0) {
                                            var96 = null;
                                        } else {
                                            var96 = var10.field2644[var95];
                                        }
                                        if (var96 != null) {
                                            method220(var96, var10.field2643, 57, var95 + 1, var10.field2584, var10.field2583);
                                        }
                                    }
                                    int var98 = method2857(var10);
                                    boolean var99 = (var98 & 0x1) != 0;
                                    if (var99) {
                                        method220(class134.field2281, "", 30, 0, var10.field2584, var10.field2583);
                                    }
                                } else if (class162.method2067(method2857(var10)) && (Statics.field2718 & 0x20) == 32) {
                                    method220(field642, field643 + " " + class2.field20 + " " + var10.field2643, 58, 0, var10.field2584, var10.field2583);
                                }
                            }
                        }
                        if (var10.field2604 == 0) {
                            if (!var10.field2598 && method1381(var10) && Statics.field277 != var10) {
                                continue;
                            }
                            if (!var10.field2598) {
                                if (var10.field2597 > var10.field2599 - var10.field2593) {
                                    var10.field2597 = var10.field2599 - var10.field2593;
                                }
                                if (var10.field2597 < 0) {
                                    var10.field2597 = 0;
                                }
                            }
                            method2148(arg0, var10.field2583, var20, var21, var22, var23, var13 - var10.field2654, var14 - var10.field2597, var11);
                            if (var10.field2691 != null) {
                                method2148(var10.field2691, var10.field2583, var20, var21, var22, var23, var13 - var10.field2654, var14 - var10.field2597, var11);
                            }
                            class4 var100 = (class4) field694.method3242((long) var10.field2583);
                            if (var100 != null) {
                                if (var100.field56 == 0 && class77.field1398 >= var20 && class77.field1395 >= var21 && class77.field1398 < var22 && class77.field1395 < var23 && !field649 && !field653) {
                                    field632[0] = class134.field2265;
                                    field580[0] = "";
                                    field664[0] = 1006;
                                    field506 = 1;
                                }
                                method1351(var100.field59, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class89.method1740(arg2, arg3, arg4, arg5);
                            class104.method2069();
                        }
                        if (field673[var11] || field480 > 1) {
                            if (var10.field2604 == 0 && !var10.field2598 && var10.field2599 > var10.field2593) {
                                int var101 = var10.field2592 + var13;
                                int var102 = var10.field2597;
                                int var103 = var10.field2593;
                                int var104 = var10.field2599;
                                Statics.field1341[0].method1723(var101, var14);
                                Statics.field1341[1].method1723(var101, var14 + var103 - 16);
                                class89.method1746(var101, var14 + 16, 16, var103 - 32, field564);
                                int var105 = (var103 - 32) * var103 / var104;
                                if (var105 < 8) {
                                    var105 = 8;
                                }
                                int var106 = (var103 - 32 - var105) * var102 / (var104 - var103);
                                class89.method1746(var101, var14 + 16 + var106, 16, var105, field565);
                                class89.method1763(var101, var14 + 16 + var106, var105, field567);
                                class89.method1763(var101 + 1, var14 + 16 + var106, var105, field567);
                                class89.method1769(var101, var14 + 16 + var106, 16, field567);
                                class89.method1769(var101, var14 + 17 + var106, 16, field567);
                                class89.method1763(var101 + 15, var14 + 16 + var106, var105, field566);
                                class89.method1763(var101 + 14, var14 + 17 + var106, var105 - 1, field566);
                                class89.method1769(var101, var14 + 15 + var106 + var105, 16, field566);
                                class89.method1769(var101 + 1, var14 + 14 + var106 + var105, 15, field566);
                            }
                            if (var10.field2604 != 1) {
                                if (var10.field2604 == 2) {
                                    int var107 = 0;
                                    for (int var108 = 0; var108 < var10.field2593; var108++) {
                                        for (int var109 = 0; var109 < var10.field2592; var109++) {
                                            int var110 = (var10.field2636 + 32) * var109 + var13;
                                            int var111 = (var10.field2637 + 32) * var108 + var14;
                                            if (var107 < 20) {
                                                var110 += var10.field2685[var107];
                                                var111 += var10.field2639[var107];
                                            }
                                            if (var10.field2609[var107] > 0) {
                                                boolean var112 = false;
                                                boolean var113 = false;
                                                int var114 = var10.field2609[var107] - 1;
                                                if (var110 + 32 > arg2 && var110 < arg4 && var111 + 32 > arg3 && var111 < arg5 || Statics.field1457 == var10 && field713 == var107) {
                                                    class86 var115;
                                                    if (field638 == 1 && Statics.field1128 == var107 && Statics.field2390 == var10.field2583) {
                                                        var115 = class40.method23(var114, var10.field2603[var107], 2, 0, false);
                                                    } else {
                                                        var115 = class40.method23(var114, var10.field2603[var107], 1, 3153952, false);
                                                    }
                                                    if (var115 == null) {
                                                        Statics.method26(var10);
                                                    } else if (Statics.field1457 == var10 && field713 == var107) {
                                                        int var116 = class77.field1398 - field531;
                                                        int var117 = class77.field1395 - field599;
                                                        if (var116 < 5 && var116 > -5) {
                                                            var116 = 0;
                                                        }
                                                        if (var117 < 5 && var117 > -5) {
                                                            var117 = 0;
                                                        }
                                                        if (field602 < 5) {
                                                            var116 = 0;
                                                            var117 = 0;
                                                        }
                                                        var115.method1675(var110 + var116, var111 + var117, 128);
                                                        if (arg1 != -1) {
                                                            class158 var118 = arg0[arg1 & 0xFFFF];
                                                            if (var111 + var117 < class89.field1495 && var118.field2597 > 0) {
                                                                int var119 = field561 * (class89.field1495 - var111 - var117) / 3;
                                                                if (var119 > field561 * 10) {
                                                                    var119 = field561 * 10;
                                                                }
                                                                if (var119 > var118.field2597) {
                                                                    var119 = var118.field2597;
                                                                }
                                                                var118.field2597 -= var119;
                                                                field599 += var119;
                                                                Statics.method26(var118);
                                                            }
                                                            if (var111 + var117 + 32 > class89.field1497 && var118.field2597 < var118.field2599 - var118.field2593) {
                                                                int var120 = field561 * (var111 + var117 + 32 - class89.field1497) / 3;
                                                                if (var120 > field561 * 10) {
                                                                    var120 = field561 * 10;
                                                                }
                                                                if (var120 > var118.field2599 - var118.field2593 - var118.field2597) {
                                                                    var120 = var118.field2599 - var118.field2593 - var118.field2597;
                                                                }
                                                                var118.field2597 += var120;
                                                                field599 -= var120;
                                                                Statics.method26(var118);
                                                            }
                                                        }
                                                    } else if (Statics.field2450 == var10 && field596 == var107) {
                                                        var115.method1675(var110, var111, 128);
                                                    } else {
                                                        var115.method1645(var110, var111);
                                                    }
                                                }
                                            } else if (var10.field2640 != null && var107 < 20) {
                                                class86 var121 = var10.method3063(var107);
                                                if (var121 != null) {
                                                    var121.method1645(var110, var111);
                                                } else if (class158.field2581) {
                                                    Statics.method26(var10);
                                                }
                                            }
                                            var107++;
                                        }
                                    }
                                } else if (var10.field2604 == 3) {
                                    int var122;
                                    if (method1377(var10)) {
                                        var122 = var10.field2601;
                                        if (Statics.field277 == var10 && var10.field2695 != 0) {
                                            var122 = var10.field2695;
                                        }
                                    } else {
                                        var122 = var10.field2600;
                                        if (Statics.field277 == var10 && var10.field2602 != 0) {
                                            var122 = var10.field2602;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2664) {
                                            class89.method1746(var13, var14, var10.field2592, var10.field2593, var122);
                                        } else {
                                            class89.method1766(var13, var14, var10.field2592, var10.field2593, var122);
                                        }
                                    } else if (var10.field2664) {
                                        class89.method1737(var13, var14, var10.field2592, var10.field2593, var122, 256 - (var15 & 0xFF));
                                    } else {
                                        class89.method1749(var13, var14, var10.field2592, var10.field2593, var122, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2604 == 4) {
                                    class183 var123 = var10.method3062();
                                    if (var123 != null) {
                                        String var124 = var10.field2630;
                                        int var125;
                                        if (method1377(var10)) {
                                            var125 = var10.field2601;
                                            if (Statics.field277 == var10 && var10.field2695 != 0) {
                                                var125 = var10.field2695;
                                            }
                                            if (var10.field2653.length() > 0) {
                                                var124 = var10.field2653;
                                            }
                                        } else {
                                            var125 = var10.field2600;
                                            if (Statics.field277 == var10 && var10.field2602 != 0) {
                                                var125 = var10.field2602;
                                            }
                                        }
                                        if (var10.field2598 && var10.field2687 != -1) {
                                            class40 var126 = class40.method248(var10.field2687);
                                            var124 = var126.field1007;
                                            if (var124 == null) {
                                                var124 = "null";
                                            }
                                            if ((var126.field1018 == 1 || var10.field2576 != 1) && var10.field2576 != -1) {
                                                var124 = class2.method157(16748608) + var124 + class2.field22 + " " + 'x' + method1479(var10.field2576);
                                            }
                                        }
                                        if (field648 == var10) {
                                            class134 var185 = (class134) null;
                                            var124 = class134.field2273;
                                            var125 = var10.field2600;
                                        }
                                        if (!var10.field2598) {
                                            var124 = method31(var124, var10);
                                        }
                                        var123.method3329(var124, var13, var14, var10.field2592, var10.field2593, var125, var10.field2628 ? 0 : -1, var10.field2633, var10.field2634, var10.field2693);
                                    } else if (class158.field2581) {
                                        Statics.method26(var10);
                                    }
                                } else if (var10.field2604 == 5) {
                                    if (var10.field2598) {
                                        class86 var128;
                                        if (var10.field2687 == -1) {
                                            var128 = var10.method3068(false);
                                        } else {
                                            var128 = class40.method23(var10.field2687, var10.field2576, var10.field2611, var10.field2612, false);
                                        }
                                        if (var128 != null) {
                                            int var129 = var128.field1475;
                                            int var130 = var128.field1476;
                                            if (var10.field2686) {
                                                class89.method1741(var13, var14, var10.field2592 + var13, var10.field2593 + var14);
                                                int var131 = (var10.field2592 + (var129 - 1)) / var129;
                                                int var132 = (var10.field2593 + (var130 - 1)) / var130;
                                                for (int var133 = 0; var133 < var131; var133++) {
                                                    for (int var134 = 0; var134 < var132; var134++) {
                                                        if (var10.field2672 != 0) {
                                                            var128.method1657(var129 / 2 + var129 * var133 + var13, var130 / 2 + var130 * var134 + var14, var10.field2672, 4096);
                                                        } else if (var15 == 0) {
                                                            var128.method1645(var129 * var133 + var13, var130 * var134 + var14);
                                                        } else {
                                                            var128.method1675(var129 * var133 + var13, var130 * var134 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1740(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var135 = var10.field2592 * 4096 / var129;
                                                if (var10.field2672 != 0) {
                                                    var128.method1657(var10.field2592 / 2 + var13, var10.field2593 / 2 + var14, var10.field2672, var135);
                                                } else if (var15 != 0) {
                                                    var128.method1653(var13, var14, var10.field2592, var10.field2593, 256 - (var15 & 0xFF));
                                                } else if (var10.field2592 == var129 && var10.field2593 == var130) {
                                                    var128.method1645(var13, var14);
                                                } else {
                                                    var128.method1680(var13, var14, var10.field2592, var10.field2593);
                                                }
                                            }
                                        } else if (class158.field2581) {
                                            Statics.method26(var10);
                                        }
                                    } else {
                                        class86 var127 = var10.method3068(method1377(var10));
                                        if (var127 != null) {
                                            var127.method1645(var13, var14);
                                        } else if (class158.field2581) {
                                            Statics.method26(var10);
                                        }
                                    }
                                } else if (var10.field2604 == 6) {
                                    boolean var136 = method1377(var10);
                                    int var137;
                                    if (var136) {
                                        var137 = var10.field2658;
                                    } else {
                                        var137 = var10.field2619;
                                    }
                                    class112 var138 = null;
                                    int var139 = 0;
                                    if (var10.field2687 != -1) {
                                        class40 var140 = class40.method248(var10.field2687);
                                        if (var140 != null) {
                                            class40 var141 = var140.method855(var10.field2576);
                                            var138 = var141.method839(1);
                                            if (var138 == null) {
                                                Statics.method26(var10);
                                            } else {
                                                var138.method2184();
                                                var139 = var138.field1549 / 2;
                                            }
                                        }
                                    } else if (var10.field2615 == 5) {
                                        if (var10.field2616 == 0) {
                                            var138 = field742.method3130((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var138 = Statics.field2370.method15();
                                        }
                                    } else if (var137 == -1) {
                                        var138 = var10.method3078((class34) null, -1, var136, Statics.field2370.field34);
                                        if (var138 == null && class158.field2581) {
                                            Statics.method26(var10);
                                        }
                                    } else {
                                        class34 var142 = class34.method57(var137);
                                        var138 = var10.method3078(var142, var10.field2578, var136, Statics.field2370.field34);
                                        if (var138 == null && class158.field2581) {
                                            Statics.method26(var10);
                                        }
                                    }
                                    class104.method2068(var10.field2592 / 2 + var13, var10.field2593 / 2 + var14);
                                    int var143 = var10.field2626 * class104.field1785[var10.field2623] >> 16;
                                    int var144 = var10.field2626 * class104.field1786[var10.field2623] >> 16;
                                    if (var138 != null) {
                                        if (var10.field2598) {
                                            var138.method2184();
                                            if (var10.field2675) {
                                                var138.method2196(0, var10.field2624, var10.field2625, var10.field2623, var10.field2621, var10.field2622 + var139 + var143, var10.field2622 + var144, var10.field2626);
                                            } else {
                                                var138.method2195(0, var10.field2624, var10.field2625, var10.field2623, var10.field2621, var10.field2622 + var139 + var143, var10.field2622 + var144);
                                            }
                                        } else {
                                            var138.method2195(0, var10.field2624, 0, var10.field2623, 0, var143, var144);
                                        }
                                    }
                                    class104.method2071();
                                } else {
                                    if (var10.field2604 == 7) {
                                        class183 var145 = var10.method3062();
                                        if (var145 == null) {
                                            if (class158.field2581) {
                                                Statics.method26(var10);
                                            }
                                            continue;
                                        }
                                        int var146 = 0;
                                        for (int var147 = 0; var147 < var10.field2593; var147++) {
                                            for (int var148 = 0; var148 < var10.field2592; var148++) {
                                                if (var10.field2609[var146] > 0) {
                                                    class40 var149 = class40.method248(var10.field2609[var146] - 1);
                                                    String var150;
                                                    if (var149.field1018 != 1 && var10.field2603[var146] == 1) {
                                                        var150 = class2.method157(16748608) + var149.field1007 + class2.field22;
                                                    } else {
                                                        var150 = class2.method157(16748608) + var149.field1007 + class2.field22 + " " + 'x' + method1479(var10.field2603[var146]);
                                                    }
                                                    int var151 = (var10.field2636 + 115) * var148 + var13;
                                                    int var152 = (var10.field2637 + 12) * var147 + var14;
                                                    if (var10.field2633 == 0) {
                                                        var145.method3378(var150, var151, var152, var10.field2600, var10.field2628 ? 0 : -1);
                                                    } else if (var10.field2633 == 1) {
                                                        var145.method3359(var150, var10.field2592 / 2 + var151, var152, var10.field2600, var10.field2628 ? 0 : -1);
                                                    } else {
                                                        var145.method3318(var150, var10.field2592 + var151 - 1, var152, var10.field2600, var10.field2628 ? 0 : -1);
                                                    }
                                                }
                                                var146++;
                                            }
                                        }
                                    }
                                    if (var10.field2604 == 8 && Statics.field411 == var10 && field636 == field496) {
                                        int var153 = 0;
                                        int var154 = 0;
                                        class183 var155 = Statics.field1758;
                                        String var156 = var10.field2630;
                                        String var157 = method31(var156, var10);
                                        while (var157.length() > 0) {
                                            int var158 = var157.indexOf(class2.field21);
                                            String var159;
                                            if (var158 == -1) {
                                                var159 = var157;
                                                var157 = "";
                                            } else {
                                                var159 = var157.substring(0, var158);
                                                var157 = var157.substring(var158 + 4);
                                            }
                                            int var160 = var155.method3313(var159);
                                            if (var160 > var153) {
                                                var153 = var160;
                                            }
                                            var154 += var155.field2841 + 1;
                                        }
                                        var153 += 6;
                                        var154 += 7;
                                        int var161 = var10.field2592 + var13 - 5 - var153;
                                        int var162 = var10.field2593 + var14 + 5;
                                        if (var161 < var13 + 5) {
                                            var161 = var13 + 5;
                                        }
                                        if (var153 + var161 > arg4) {
                                            var161 = arg4 - var153;
                                        }
                                        if (var154 + var162 > arg5) {
                                            var162 = arg5 - var154;
                                        }
                                        class89.method1746(var161, var162, var153, var154, 16777120);
                                        class89.method1766(var161, var162, var153, var154, 0);
                                        String var163 = var10.field2630;
                                        int var164 = var155.field2841 + var162 + 2;
                                        String var165 = method31(var163, var10);
                                        while (var165.length() > 0) {
                                            int var166 = var165.indexOf(class2.field21);
                                            String var167;
                                            if (var166 == -1) {
                                                var167 = var165;
                                                var165 = "";
                                            } else {
                                                var167 = var165.substring(0, var166);
                                                var165 = var165.substring(var166 + 4);
                                            }
                                            var155.method3378(var167, var161 + 3, var164, 0, -1);
                                            var164 += var155.field2841 + 1;
                                        }
                                    }
                                    if (var10.field2604 == 9) {
                                        if (var10.field2606 == 1) {
                                            class89.method1771(var13, var14, var10.field2592 + var13, var10.field2593 + var14, var10.field2600);
                                        } else {
                                            int var168 = var10.field2592 >= 0 ? var10.field2592 : -var10.field2592;
                                            int var169 = var10.field2593 >= 0 ? var10.field2593 : -var10.field2593;
                                            int var170 = var168;
                                            if (var168 < var169) {
                                                var170 = var169;
                                            }
                                            if (var170 != 0) {
                                                int var171 = (var10.field2592 << 16) / var170;
                                                int var172 = (var10.field2593 << 16) / var170;
                                                if (var172 <= var171) {
                                                    var171 = -var171;
                                                } else {
                                                    var172 = -var172;
                                                }
                                                int var173 = var10.field2606 * var172 >> 17;
                                                int var174 = var10.field2606 * var172 + 1 >> 17;
                                                int var175 = var10.field2606 * var171 >> 17;
                                                int var176 = var10.field2606 * var171 + 1 >> 17;
                                                int var177 = var13 + var173;
                                                int var178 = var13 - var174;
                                                int var179 = var10.field2592 + var13 - var174;
                                                int var180 = var10.field2592 + var13 + var173;
                                                int var181 = var14 + var175;
                                                int var182 = var14 - var176;
                                                int var183 = var10.field2593 + var14 - var176;
                                                int var184 = var10.field2593 + var14 + var175;
                                                class104.method2126(var177, var178, var179);
                                                class104.method2079(var181, var182, var183, var177, var178, var179, var10.field2600);
                                                class104.method2126(var177, var179, var180);
                                                class104.method2079(var181, var183, var184, var177, var179, var180, var10.field2600);
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

    @ObfuscatedName("r.ce(Ljava/lang/String;Lfl;I)Ljava/lang/String;")
    public static String method31(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method254(arg1, var2 - 1);
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
                if (Statics.field605 != null) {
                    int var9 = Statics.field605.field1418;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field605.field1420 != null) {
                        var8 = (String) Statics.field605.field1420;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bh.cd(II)Ljava/lang/String;")
    public static final String method1479(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field16 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method157(65408) + var1.substring(0, var1.length() - 8) + class134.field2229 + " " + class2.field27 + var1 + class2.field26 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method157(16777215) + var1.substring(0, var1.length() - 4) + class134.field2196 + " " + class2.field27 + var1 + class2.field26 + class2.field22;
        } else {
            return " " + class2.method157(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("bq.cv(Lfl;I)Z")
    public static final boolean method1377(class158 arg0) {
        if (arg0.field2673 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2673.length; var1++) {
            int var2 = method254(arg0, var1);
            int var3 = arg0.field2681[var1];
            if (arg0.field2673[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2673[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2673[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("i.cm(Lfl;IB)I")
    public static final int method254(class158 arg0, int arg1) {
        if (arg0.field2582 == null || arg1 >= arg0.field2582.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2582[arg1];
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
                    var7 = field519[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method2064(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method248(var12).field1037 || field484)) {
                        for (int var13 = 0; var13 < var11.field2609.length; var13++) {
                            if (var12 + 1 == var11.field2609[var13]) {
                                var7 += var11.field2603[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2701[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2045[field623[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2701[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2370.field37;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2043[var14]) {
                            var7 += field623[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method2064(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method248(var18).field1037 || field484)) {
                        for (int var19 = 0; var19 < var17.field2609.length; var19++) {
                            if (var18 + 1 == var17.field2609[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field663;
                }
                if (var6 == 12) {
                    var7 = field647;
                }
                if (var6 == 13) {
                    int var20 = class159.field2701[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2341(var22);
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
                    var7 = (Statics.field2370.field473 >> 7) + Statics.field374;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2370.field442 >> 7) + Statics.field872;
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

    @ObfuscatedName("client.cl(IIIIIIIB)V")
    public static final void method375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class158.method2312(arg0)) {
            method708(Statics.field2608[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("an.cj([Lfl;IIIIIIII)V")
    public static final void method708(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2598 || var9.field2604 == 0 || var9.field2674 || method2857(var9) != 0 || field656 == var9) && var9.field2697 == arg1 && (!var9.field2598 || !method1381(var9))) {
                int var10 = var9.field2588 + arg6;
                int var11 = var9.field2679 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2604 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2604 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2592 + var10;
                    int var19 = var9.field2593 + var11;
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
                    int var22 = var9.field2592 + var10;
                    int var23 = var9.field2593 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field655 == var9) {
                    field626 = true;
                    field676 = var10;
                    field665 = var11;
                }
                if (!var9.field2598 || var12 < var14 && var13 < var15) {
                    if (var9.field2694 == 1337) {
                        Statics.method26(var9);
                    } else if (var9.field2694 == 1338) {
                        method200(var10, var11);
                    } else {
                        if (var9.field2604 == 0) {
                            if (!var9.field2598 && method1381(var9) && Statics.field277 != var9) {
                                continue;
                            }
                            method708(arg0, var9.field2583, var12, var13, var14, var15, var10 - var9.field2654, var11 - var9.field2597);
                            if (var9.field2691 != null) {
                                method708(var9.field2691, var9.field2583, var12, var13, var14, var15, var10 - var9.field2654, var11 - var9.field2597);
                            }
                            class4 var24 = (class4) field694.method3242((long) var9.field2583);
                            if (var24 != null) {
                                method375(var24.field59, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2598) {
                            boolean var25;
                            if (class77.field1398 >= var12 && class77.field1395 >= var13 && class77.field1398 < var14 && class77.field1395 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class77.field1397 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class77.field1410 == 1 && class77.field1399 >= var12 && class77.field1400 >= var13 && class77.field1399 < var14 && class77.field1400 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                method178(var9, class77.field1399 - var10, class77.field1400 - var11);
                            }
                            if (field655 != null && field655 != var9 && var25) {
                                int var28 = method2857(var9);
                                boolean var29 = (var28 >> 20 & 0x1) != 0;
                                if (var29) {
                                    field659 = var9;
                                }
                            }
                            if (field656 == var9) {
                                field746 = true;
                                field661 = var10;
                                field662 = var11;
                            }
                            if (var9.field2674) {
                                if (var25 && field680 != 0 && var9.field2689 != null) {
                                    class1 var30 = new class1();
                                    var30.field2 = var9;
                                    var30.field9 = field680;
                                    var30.field4 = var9.field2689;
                                    field681.method3247(var30);
                                }
                                if (field655 != null || Statics.field1457 != null || field649) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2680 && var27) {
                                    var9.field2680 = true;
                                    if (var9.field2652 != null) {
                                        class1 var31 = new class1();
                                        var31.field2 = var9;
                                        var31.field3 = class77.field1399 - var10;
                                        var31.field9 = class77.field1400 - var11;
                                        var31.field4 = var9.field2652;
                                        field681.method3247(var31);
                                    }
                                }
                                if (var9.field2680 && var26 && var9.field2668 != null) {
                                    class1 var32 = new class1();
                                    var32.field2 = var9;
                                    var32.field3 = class77.field1398 - var10;
                                    var32.field9 = class77.field1395 - var11;
                                    var32.field4 = var9.field2668;
                                    field681.method3247(var32);
                                }
                                if (var9.field2680 && !var26) {
                                    var9.field2680 = false;
                                    if (var9.field2669 != null) {
                                        class1 var33 = new class1();
                                        var33.field2 = var9;
                                        var33.field3 = class77.field1398 - var10;
                                        var33.field9 = class77.field1395 - var11;
                                        var33.field4 = var9.field2669;
                                        field683.method3247(var33);
                                    }
                                }
                                if (var26 && var9.field2655 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = var9;
                                    var34.field3 = class77.field1398 - var10;
                                    var34.field9 = class77.field1395 - var11;
                                    var34.field4 = var9.field2655;
                                    field681.method3247(var34);
                                }
                                if (!var9.field2692 && var25) {
                                    var9.field2692 = true;
                                    if (var9.field2656 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = var9;
                                        var35.field3 = class77.field1398 - var10;
                                        var35.field9 = class77.field1395 - var11;
                                        var35.field4 = var9.field2656;
                                        field681.method3247(var35);
                                    }
                                }
                                if (var9.field2692 && var25 && var9.field2657 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field3 = class77.field1398 - var10;
                                    var36.field9 = class77.field1395 - var11;
                                    var36.field4 = var9.field2657;
                                    field681.method3247(var36);
                                }
                                if (var9.field2692 && !var25) {
                                    var9.field2692 = false;
                                    if (var9.field2613 != null) {
                                        class1 var37 = new class1();
                                        var37.field2 = var9;
                                        var37.field3 = class77.field1398 - var10;
                                        var37.field9 = class77.field1395 - var11;
                                        var37.field4 = var9.field2613;
                                        field683.method3247(var37);
                                    }
                                }
                                if (var9.field2607 != null) {
                                    class1 var38 = new class1();
                                    var38.field2 = var9;
                                    var38.field4 = var9.field2607;
                                    field682.method3247(var38);
                                }
                                if (var9.field2663 != null && field669 > var9.field2638) {
                                    if (var9.field2635 == null || field669 - var9.field2638 > 32) {
                                        class1 var43 = new class1();
                                        var43.field2 = var9;
                                        var43.field4 = var9.field2663;
                                        field681.method3247(var43);
                                    } else {
                                        label436: for (int var39 = var9.field2638; var39 < field669; var39++) {
                                            int var40 = field722[var39 & 0x1F];
                                            for (int var41 = 0; var41 < var9.field2635.length; var41++) {
                                                if (var9.field2635[var41] == var40) {
                                                    class1 var42 = new class1();
                                                    var42.field2 = var9;
                                                    var42.field4 = var9.field2663;
                                                    field681.method3247(var42);
                                                    break label436;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2638 = field669;
                                }
                                if (var9.field2665 != null && field671 > var9.field2696) {
                                    if (var9.field2666 == null || field671 - var9.field2696 > 32) {
                                        class1 var48 = new class1();
                                        var48.field2 = var9;
                                        var48.field4 = var9.field2665;
                                        field681.method3247(var48);
                                    } else {
                                        label416: for (int var44 = var9.field2696; var44 < field671; var44++) {
                                            int var45 = field717[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var9.field2666.length; var46++) {
                                                if (var9.field2666[var46] == var45) {
                                                    class1 var47 = new class1();
                                                    var47.field2 = var9;
                                                    var47.field4 = var9.field2665;
                                                    field681.method3247(var47);
                                                    break label416;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2696 = field671;
                                }
                                if (var9.field2667 != null && field692 > var9.field2650) {
                                    if (var9.field2641 == null || field692 - var9.field2650 > 32) {
                                        class1 var53 = new class1();
                                        var53.field2 = var9;
                                        var53.field4 = var9.field2667;
                                        field681.method3247(var53);
                                    } else {
                                        label396: for (int var49 = var9.field2650; var49 < field692; var49++) {
                                            int var50 = field672[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2641.length; var51++) {
                                                if (var9.field2641[var51] == var50) {
                                                    class1 var52 = new class1();
                                                    var52.field2 = var9;
                                                    var52.field4 = var9.field2667;
                                                    field681.method3247(var52);
                                                    break label396;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2650 = field692;
                                }
                                if (field674 > var9.field2684 && var9.field2614 != null) {
                                    class1 var54 = new class1();
                                    var54.field2 = var9;
                                    var54.field4 = var9.field2614;
                                    field681.method3247(var54);
                                }
                                if (field551 > var9.field2684 && var9.field2632 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = var9;
                                    var55.field4 = var9.field2632;
                                    field681.method3247(var55);
                                }
                                if (field499 > var9.field2684 && var9.field2587 != null) {
                                    class1 var56 = new class1();
                                    var56.field2 = var9;
                                    var56.field4 = var9.field2587;
                                    field681.method3247(var56);
                                }
                                if (field587 > var9.field2684 && var9.field2676 != null) {
                                    class1 var57 = new class1();
                                    var57.field2 = var9;
                                    var57.field4 = var9.field2676;
                                    field681.method3247(var57);
                                }
                                var9.field2684 = field667;
                                if (var9.field2642 != null) {
                                    for (int var58 = 0; var58 < field705; var58++) {
                                        class1 var59 = new class1();
                                        var59.field2 = var9;
                                        var59.field7 = field633[var58];
                                        var59.field8 = field706[var58];
                                        var59.field4 = var9.field2642;
                                        field681.method3247(var59);
                                    }
                                }
                            }
                        }
                        if (!var9.field2598) {
                            if (field655 != null || Statics.field1457 != null || field649) {
                                return;
                            }
                            if ((var9.field2682 >= 0 || var9.field2602 != 0) && class77.field1398 >= var12 && class77.field1395 >= var13 && class77.field1398 < var14 && class77.field1395 < var15) {
                                if (var9.field2682 >= 0) {
                                    Statics.field277 = arg0[var9.field2682];
                                } else {
                                    Statics.field277 = var9;
                                }
                            }
                            if (var9.field2604 == 8 && class77.field1398 >= var12 && class77.field1395 >= var13 && class77.field1398 < var14 && class77.field1395 < var15) {
                                Statics.field411 = var9;
                            }
                            if (var9.field2599 > var9.field2593) {
                                int var60 = var9.field2592 + var10;
                                int var61 = var9.field2593;
                                int var62 = var9.field2599;
                                int var63 = class77.field1398;
                                int var64 = class77.field1395;
                                if (field494) {
                                    field569 = 32;
                                } else {
                                    field569 = 0;
                                }
                                field494 = false;
                                if (class77.field1397 != 0) {
                                    if (var63 >= var60 && var63 < var60 + 16 && var64 >= var11 && var64 < var11 + 16) {
                                        var9.field2597 -= 4;
                                        Statics.method26(var9);
                                    } else if (var63 >= var60 && var63 < var60 + 16 && var64 >= var11 + var61 - 16 && var64 < var11 + var61) {
                                        var9.field2597 += 4;
                                        Statics.method26(var9);
                                    } else if (var63 >= var60 - field569 && var63 < field569 + var60 + 16 && var64 >= var11 + 16 && var64 < var11 + var61 - 16) {
                                        int var65 = (var61 - 32) * var61 / var62;
                                        if (var65 < 8) {
                                            var65 = 8;
                                        }
                                        int var66 = var64 - var11 - 16 - var65 / 2;
                                        int var67 = var61 - 32 - var65;
                                        var9.field2597 = (var62 - var61) * var66 / var67;
                                        Statics.method26(var9);
                                        field494 = true;
                                    }
                                }
                                if (field680 != 0) {
                                    int var68 = var9.field2592;
                                    if (var63 >= var60 - var68 && var64 >= var11 && var63 < var60 + 16 && var64 <= var11 + var61) {
                                        var9.field2597 += field680 * 45;
                                        Statics.method26(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.cf([Lfl;II)V")
    public static final void method137(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2604 == 0) {
                    if (var3.field2691 != null) {
                        method137(var3.field2691, arg1);
                    }
                    class4 var4 = (class4) field694.method3242((long) var3.field2583);
                    if (var4 != null) {
                        int var5 = var4.field59;
                        if (class158.method2312(var5)) {
                            method137(Statics.field2608[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2698 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field4 = var3.field2698;
                    class26.method22(var6);
                }
                if (arg1 == 1 && var3.field2678 != null) {
                    if (var3.field2584 >= 0) {
                        class158 var7 = class158.method2064(var3.field2583);
                        if (var7 == null || var7.field2691 == null || var3.field2584 >= var7.field2691.length || var7.field2691[var3.field2584] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field4 = var3.field2678;
                    class26.method22(var8);
                }
            }
        }
    }

    @ObfuscatedName("d.cq(Lfl;III)V")
    public static final void method178(class158 arg0, int arg1, int arg2) {
        if (field655 != null || field649 || arg0 == null || method236(arg0) == null) {
            return;
        }
        field655 = arg0;
        field656 = method236(arg0);
        field657 = arg1;
        field586 = arg2;
        Statics.field80 = 0;
        field743 = false;
    }

    @ObfuscatedName("c.co(I)V")
    public static final void method144() {
        Statics.method26(field655);
        Statics.field80++;
        if (field626 && field746) {
            int var0 = class77.field1398;
            int var1 = class77.field1395;
            int var2 = var0 - field657;
            int var3 = var1 - field586;
            if (var2 < field661) {
                var2 = field661;
            }
            if (field655.field2592 + var2 > field661 + field656.field2592) {
                var2 = field661 + field656.field2592 - field655.field2592;
            }
            if (var3 < field662) {
                var3 = field662;
            }
            if (field655.field2593 + var3 > field662 + field656.field2593) {
                var3 = field662 + field656.field2593 - field655.field2593;
            }
            int var4 = var2 - field676;
            int var5 = var3 - field665;
            int var6 = field655.field2646;
            if (Statics.field80 > field655.field2647 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field743 = true;
            }
            int var7 = field656.field2654 + (var2 - field661);
            int var8 = field656.field2597 + (var3 - field662);
            if (field655.field2659 != null && field743) {
                class1 var9 = new class1();
                var9.field2 = field655;
                var9.field3 = var7;
                var9.field9 = var8;
                var9.field4 = field655.field2659;
                class26.method22(var9);
            }
            if (class77.field1397 == 0) {
                if (field743) {
                    if (field655.field2660 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field655;
                        var10.field3 = var7;
                        var10.field9 = var8;
                        var10.field6 = field659;
                        var10.field4 = field655.field2660;
                        class26.method22(var10);
                    }
                    if (field659 != null && method1185(field655) != null) {
                        field540.method2272(222);
                        field540.method2398(field659.field2584);
                        field540.method2556(field655.field2584);
                        field540.method2451(field659.field2583);
                        field540.method2450(field655.field2583);
                    }
                } else {
                    label99: {
                        label72: {
                            if (field625 != 1) {
                                int var11 = field506 - 1;
                                boolean var12;
                                if (var11 < 0) {
                                    var12 = false;
                                } else {
                                    int var13 = field664[var11];
                                    if (var13 >= 2000) {
                                        var13 -= 2000;
                                    }
                                    if (var13 == 1007) {
                                        var12 = true;
                                    } else {
                                        var12 = false;
                                    }
                                }
                                if (!var12) {
                                    break label72;
                                }
                            }
                            if (field506 > 2) {
                                method2656();
                                break label99;
                            }
                        }
                        if (field506 > 0) {
                            method129(field506 - 1);
                        }
                    }
                }
                field655 = null;
            }
        } else if (Statics.field80 > 1) {
            field655 = null;
        }
    }

    @ObfuscatedName("cl.cp(I)V")
    public static void method1630() {
        for (class4 var0 = (class4) field694.method3232(); var0 != null; var0 = (class4) field694.method3233()) {
            int var1 = var0.field59;
            if (class158.method2312(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2608[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2598;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2816;
                    class158 var6 = class158.method2064(var5);
                    if (var6 != null) {
                        Statics.method26(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cb(Lfl;I)Lfl;")
    public static class158 method236(class158 arg0) {
        class158 var1 = method1185(arg0);
        if (var1 == null) {
            var1 = arg0.field2645;
        }
        return var1;
    }

    @ObfuscatedName("dv.cy([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2153(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("g.ci(II)V")
    public static final void method189(int arg0) {
        if (!class158.method2312(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2608[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2578 = 0;
                var3.field2690 = 0;
            }
        }
    }

    @ObfuscatedName("o.cx(II)V")
    public static final void method48(int arg0) {
        if (class158.method2312(arg0)) {
            Statics.method2859(Statics.field2608[arg0], -1);
        }
    }

    @ObfuscatedName("r.ca(II)V")
    public static final void method27(int arg0) {
        method1630();
        for (class7 var1 = (class7) class7.field86.method3252(); var1 != null; var1 = (class7) class7.field86.method3268()) {
            if (var1.field102 != null) {
                var1.method47();
            }
        }
        int var2 = class42.method1347(arg0).field1054;
        if (var2 == 0) {
            return;
        }
        int var3 = class159.field2701[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2073(0.9D);
                ((class110) Statics.field1782).method2161(0.9D);
            }
            if (var3 == 2) {
                class104.method2073(0.8D);
                ((class110) Statics.field1782).method2161(0.8D);
            }
            if (var3 == 3) {
                class104.method2073(0.7D);
                ((class110) Statics.field1782).method2161(0.7D);
            }
            if (var3 == 4) {
                class104.method2073(0.6D);
                ((class110) Statics.field1782).method2161(0.6D);
            }
            class40.method1813();
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
                    class138.method2147(Statics.field2320, field720, 0, var4, false);
                    field700 = false;
                } else if (var4 == 0) {
                    Statics.field174.method2712();
                    class138.field2328 = 1;
                    Statics.field2325 = null;
                    field700 = false;
                } else {
                    class138.method2660(var4);
                }
                field719 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field574 = 127;
            }
            if (var3 == 1) {
                field574 = 96;
            }
            if (var3 == 2) {
                field574 = 64;
            }
            if (var3 == 3) {
                field574 = 32;
            }
            if (var3 == 4) {
                field574 = 0;
            }
        }
        if (var2 == 5) {
            field625 = var3;
        }
        if (var2 == 6) {
            field646 = var3;
        }
        if (var2 == 9) {
            field516 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field723 = 127;
        }
        if (var3 == 1) {
            field723 = 96;
        }
        if (var3 == 2) {
            field723 = 64;
        }
        if (var3 == 3) {
            field723 = 32;
        }
        if (var3 == 4) {
            field723 = 0;
        }
    }

    @ObfuscatedName("dm.cn(I)V")
    public static final void method2172() {
        field540.method2272(2);
        for (class4 var0 = (class4) field694.method3232(); var0 != null; var0 = (class4) field694.method3233()) {
            if (var0.field56 == 0 || var0.field56 == 3) {
                method2804(var0, true);
            }
        }
        if (field648 != null) {
            Statics.method26(field648);
            field648 = null;
        }
    }

    @ObfuscatedName("eo.cs(Lr;ZI)V")
    public static final void method2804(class4 arg0, boolean arg1) {
        int var2 = arg0.field59;
        int var3 = (int) arg0.field2816;
        arg0.method3288();
        if (arg1) {
            class158.method826(var2);
        }
        method3102(var2);
        class158 var4 = class158.method2064(var3);
        if (var4 != null) {
            Statics.method26(var4);
        }
        field649 = false;
        field506 = 0;
        method145(Statics.field1315, Statics.field32, Statics.field762, Statics.field1409);
        if (field644 != -1) {
            int var5 = field644;
            if (class158.method2312(var5)) {
                method137(Statics.field2608[var5], 1);
            }
        }
    }

    @ObfuscatedName("ev.cg(Lfl;I)Z")
    public static final boolean method2657(class158 arg0) {
        int var1 = arg0.field2694;
        if (var1 == 205) {
            field529 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field742.method3118(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field742.method3129(var4, var5 == 1);
        }
        if (var1 == 324) {
            field742.method3123(false);
        }
        if (var1 == 325) {
            field742.method3123(true);
        }
        if (var1 == 326) {
            field540.method2272(103);
            field742.method3121(field540);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ew.cc(IIIILcj;I)V")
    public static final void method3046(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method759(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field606 + field571 & 0x7FF;
        int var7 = class104.field1785[var6];
        int var8 = class104.field1786[var6];
        int var9 = var7 * 256 / (field558 + 256);
        int var10 = var8 * 256 / (field558 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field260.method1685(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("at.cr(IIIILcj;S)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field606 + field571 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1785[var5];
        int var8 = class104.field1786[var5];
        int var9 = var7 * 256 / (field558 + 256);
        int var10 = var8 * 256 / (field558 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1673(Statics.field1550, arg0 + 94 + var11 - arg4.field1475 / 2 + 4, arg1 + 83 - var12 - arg4.field1476 / 2 - 4);
        } else {
            arg4.method1645(arg0 + 94 + var11 - arg4.field1475 / 2 + 4, arg1 + 83 - var12 - arg4.field1476 / 2 - 4);
        }
    }

    @ObfuscatedName("q.ch(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method128(int arg0, String arg1, String arg2) {
        method250(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("i.ck(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method250(int arg0, String arg1, String arg2, String arg3) {
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
        field699++;
        field674 = field667;
    }

    @ObfuscatedName("ep.di(Ljava/lang/String;I)Z")
    public static boolean method3025(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method2803(arg0, Statics.field483);
        for (int var2 = 0; var2 < field666; var2++) {
            if (var1.equalsIgnoreCase(class148.method2803(field738[var2].field365, Statics.field483))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class148.method2803(Statics.field2370.field51, Statics.field483))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dm.do(Ljava/lang/String;B)Z")
    public static boolean method2174(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method2803(arg0, Statics.field483);
        for (int var2 = 0; var2 < field537; var2++) {
            class11 var3 = field741[var2];
            if (var1.equalsIgnoreCase(class148.method2803(var3.field170, Statics.field483))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method2803(var3.field168, Statics.field483))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("x.dt(Ljava/lang/String;B)V")
    public static final void method12(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field666 < 200 || field707 == 1) || field666 >= 200) {
            method128(0, "", class134.field2117);
            return;
        }
        String var1 = class148.method2803(arg0, Statics.field483);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field666; var2++) {
            class23 var3 = field738[var2];
            String var4 = class148.method2803(var3.field365, Statics.field483);
            if (var4 != null && var4.equals(var1)) {
                method128(0, "", arg0 + class134.field2080);
                return;
            }
            if (var3.field366 != null) {
                String var5 = class148.method2803(var3.field366, Statics.field483);
                if (var5 != null && var5.equals(var1)) {
                    method128(0, "", arg0 + class134.field2080);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field537; var6++) {
            class11 var7 = field741[var6];
            String var8 = class148.method2803(var7.field170, Statics.field483);
            if (var8 != null && var8.equals(var1)) {
                method128(0, "", class134.field2236 + arg0 + class134.field2103);
                return;
            }
            if (var7.field168 != null) {
                String var9 = class148.method2803(var7.field168, Statics.field483);
                if (var9 != null && var9.equals(var1)) {
                    method128(0, "", class134.field2236 + arg0 + class134.field2103);
                    return;
                }
            }
        }
        if (class148.method2803(Statics.field2370.field51, Statics.field483).equals(var1)) {
            method128(0, "", class134.field2234);
            return;
        }
        field540.method2272(115);
        class116 var10 = field540;
        int var11 = arg0.length() + 1;
        var10.method2455(var11);
        field540.method2402(arg0);
    }

    @ObfuscatedName("q.de(Ljava/lang/String;B)V")
    public static final void method139(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method2803(arg0, Statics.field483);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field537; var2++) {
            class11 var3 = field741[var2];
            String var4 = var3.field170;
            String var5 = class148.method2803(var4, Statics.field483);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field537--;
                for (int var7 = var2; var7 < field537; var7++) {
                    field741[var7] = field741[var7 + 1];
                }
                field551 = field667;
                field540.method2272(92);
                class116 var8 = field540;
                int var9 = arg0.length() + 1;
                var8.method2455(var9);
                field540.method2402(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("l.dv(Ljava/lang/String;II)V")
    public static final void method58(String arg0, int arg1) {
        field540.method2272(233);
        class116 var2 = field540;
        int var3 = arg0.length() + 1;
        var2.method2455(var3 + 1);
        field540.method2455(arg1);
        field540.method2402(arg0);
    }

    @ObfuscatedName("bm.dm(Ljava/lang/String;I)V")
    public static final void method1509(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field540.method2272(74);
        class116 var1 = field540;
        int var2 = arg0.length() + 1;
        var1.method2455(var2);
        field540.method2402(arg0);
    }

    @ObfuscatedName("z.da(I)V")
    public static final void method158() {
        field540.method2272(74);
        field540.method2455(0);
    }

    @ObfuscatedName("fo.dd(IB)V")
    public static void method3102(int arg0) {
        for (class171 var1 = (class171) field684.method3232(); var1 != null; var1 = (class171) field684.method3233()) {
            if ((var1.field2816 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3288();
            }
        }
    }

    @ObfuscatedName("ea.dj(Lfl;I)I")
    public static int method2857(class158 arg0) {
        class171 var1 = (class171) field684.method3242(((long) arg0.field2583 << 32) + (long) arg0.field2584);
        return var1 == null ? arg0.field2620 : var1.field2799;
    }

    @ObfuscatedName("al.dq(Lfl;I)Lfl;")
    public static class158 method1185(class158 arg0) {
        int var1 = class162.method147(method2857(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class158.method2064(arg0.field2697);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bq.ds(Lfl;I)Z")
    public static boolean method1381(class158 arg0) {
        if (field653) {
            if (method2857(arg0) != 0) {
                return false;
            }
            if (arg0.field2604 == 0) {
                return false;
            }
        }
        return arg0.field2595;
    }
}

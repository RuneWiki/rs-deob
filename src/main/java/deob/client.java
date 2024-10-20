package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.n")
    public static boolean field457 = true;

    @ObfuscatedName("client.e")
    public static int field638 = 1;

    @ObfuscatedName("client.l")
    public static int field459 = 0;

    @ObfuscatedName("client.r")
    public static int field522 = 0;

    @ObfuscatedName("client.o")
    public static boolean field618 = false;

    @ObfuscatedName("client.g")
    public static boolean field596 = false;

    @ObfuscatedName("client.s")
    public static int field464 = 0;

    @ObfuscatedName("client.v")
    public static int field466 = 0;

    @ObfuscatedName("client.j")
    public static boolean field467 = true;

    @ObfuscatedName("client.q")
    public static int field484 = 0;

    @ObfuscatedName("client.a")
    public static long field469 = -1L;

    @ObfuscatedName("client.m")
    public static int field470 = -1;

    @ObfuscatedName("client.z")
    public static int field471 = -1;

    @ObfuscatedName("client.w")
    public static class130[] field680 = new class130[4];

    @ObfuscatedName("client.h")
    public static int field472 = -1;

    @ObfuscatedName("client.p")
    public static boolean field494 = true;

    @ObfuscatedName("client.i")
    public static boolean field592 = false;

    @ObfuscatedName("client.aa")
    public static int field567 = 0;

    @ObfuscatedName("client.ax")
    public static int field476 = 0;

    @ObfuscatedName("client.ad")
    public static int field477 = 0;

    @ObfuscatedName("client.af")
    public static int field498 = 0;

    @ObfuscatedName("client.ai")
    public static int field479 = 0;

    @ObfuscatedName("client.ag")
    public static int field693 = 0;

    @ObfuscatedName("client.an")
    public static int field481 = 0;

    @ObfuscatedName("client.ac")
    public static int field482 = 0;

    @ObfuscatedName("client.al")
    public static int field630 = 0;

    @ObfuscatedName("client.at")
    public static class127 field707 = new class127(new byte[5000]);

    @ObfuscatedName("client.ab")
    public static int field696 = 0;

    @ObfuscatedName("client.ar")
    public static int field486 = 0;

    @ObfuscatedName("client.as")
    public static int field487 = 0;

    @ObfuscatedName("client.bk")
    public static int field490 = 0;

    @ObfuscatedName("client.ba")
    public static int field627 = 0;

    @ObfuscatedName("client.bt")
    public static int field507 = 0;

    @ObfuscatedName("client.bs")
    public static int field493 = 0;

    @ObfuscatedName("client.bd")
    public static int field574 = 0;

    @ObfuscatedName("client.bm")
    public static class25[] field495 = new class25[32768];

    @ObfuscatedName("client.bj")
    public static int field496 = 0;

    @ObfuscatedName("client.bq")
    public static int[] field497 = new int[32768];

    @ObfuscatedName("client.cj")
    public static class116 field694 = new class116(5000);

    @ObfuscatedName("client.ce")
    public static class116 field648 = new class116(5000);

    @ObfuscatedName("client.ca")
    public static class116 field468 = new class116(5000);

    @ObfuscatedName("client.cp")
    public static int field678 = 0;

    @ObfuscatedName("client.cu")
    public static int field502 = 0;

    @ObfuscatedName("client.cn")
    public static int field503 = 0;

    @ObfuscatedName("client.ci")
    public static int field504 = 0;

    @ObfuscatedName("client.cy")
    public static int field505 = 0;

    @ObfuscatedName("client.cv")
    public static int field506 = 0;

    @ObfuscatedName("client.cc")
    public static int field478 = 0;

    @ObfuscatedName("client.cx")
    public static int field508 = 0;

    @ObfuscatedName("client.co")
    public static boolean field509 = false;

    @ObfuscatedName("client.ch")
    public static int field511 = 0;

    @ObfuscatedName("client.cb")
    public static int field512 = 0;

    @ObfuscatedName("client.cm")
    public static int field513 = 1;

    @ObfuscatedName("client.ct")
    public static int field606 = 0;

    @ObfuscatedName("client.dx")
    public static int field515 = 1;

    @ObfuscatedName("client.dk")
    public static int field516 = 0;

    @ObfuscatedName("client.dh")
    public static boolean field587 = false;

    @ObfuscatedName("client.df")
    public static int[][][] field520 = new int[4][13][13];

    @ObfuscatedName("client.dj")
    public static final int[] field593 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field518 = 0;

    @ObfuscatedName("client.dv")
    public static int field523 = 2;

    @ObfuscatedName("client.dy")
    public static int field524 = 0;

    @ObfuscatedName("client.dd")
    public static int field676 = 2;

    @ObfuscatedName("client.dg")
    public static int field526 = 0;

    @ObfuscatedName("client.ds")
    public static int field455 = 1;

    @ObfuscatedName("client.do")
    public static int field528 = 0;

    @ObfuscatedName("client.de")
    public static int field473 = 0;

    @ObfuscatedName("client.dq")
    public static int field530 = 2;

    @ObfuscatedName("client.dm")
    public static int field616 = 0;

    @ObfuscatedName("client.di")
    public static int field532 = 1;

    @ObfuscatedName("client.dz")
    public static int field571 = 0;

    @ObfuscatedName("client.ee")
    public static int field534 = 0;

    @ObfuscatedName("client.ed")
    public static int field537 = 2301979;

    @ObfuscatedName("client.ef")
    public static int field538 = 5063219;

    @ObfuscatedName("client.ei")
    public static int field539 = 3353893;

    @ObfuscatedName("client.eo")
    public static int field540 = 7759444;

    @ObfuscatedName("client.eq")
    public static boolean field541 = false;

    @ObfuscatedName("client.ep")
    public static int field628 = 0;

    @ObfuscatedName("client.fi")
    public static int field562 = 128;

    @ObfuscatedName("client.fe")
    public static int field544 = 0;

    @ObfuscatedName("client.fm")
    public static int field545 = 0;

    @ObfuscatedName("client.fl")
    public static int field613 = 0;

    @ObfuscatedName("client.fx")
    public static int field573 = 0;

    @ObfuscatedName("client.fb")
    public static int field666 = 0;

    @ObfuscatedName("client.fq")
    public static int field549 = 0;

    @ObfuscatedName("client.fp")
    public static boolean field550 = false;

    @ObfuscatedName("client.fd")
    public static int field551 = 0;

    @ObfuscatedName("client.fs")
    public static int field552 = 0;

    @ObfuscatedName("client.fk")
    public static int field622 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field554 = new int[field622];

    @ObfuscatedName("client.fw")
    public static int[] field577 = new int[field622];

    @ObfuscatedName("client.fo")
    public static int[] field556 = new int[field622];

    @ObfuscatedName("client.fv")
    public static int[] field598 = new int[field622];

    @ObfuscatedName("client.fz")
    public static int[] field558 = new int[field622];

    @ObfuscatedName("client.fy")
    public static int[] field559 = new int[field622];

    @ObfuscatedName("client.fg")
    public static int[] field560 = new int[field622];

    @ObfuscatedName("client.ft")
    public static String[] field536 = new String[field622];

    @ObfuscatedName("client.fc")
    public static int[][] field462 = new int[104][104];

    @ObfuscatedName("client.gn")
    public static int field563 = 0;

    @ObfuscatedName("client.gs")
    public static int field564 = -1;

    @ObfuscatedName("client.gf")
    public static int field565 = -1;

    @ObfuscatedName("client.gq")
    public static int field501 = 0;

    @ObfuscatedName("client.gg")
    public static int field531 = 0;

    @ObfuscatedName("client.gh")
    public static int field568 = 0;

    @ObfuscatedName("client.gb")
    public static int field569 = 0;

    @ObfuscatedName("client.gz")
    public static int field570 = 0;

    @ObfuscatedName("client.gl")
    public static int field601 = 0;

    @ObfuscatedName("client.gi")
    public static int field572 = 0;

    @ObfuscatedName("client.gk")
    public static int field485 = 0;

    @ObfuscatedName("client.gp")
    public static int field543 = 0;

    @ObfuscatedName("client.go")
    public static int field586 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field576 = false;

    @ObfuscatedName("client.gv")
    public static int field625 = 0;

    @ObfuscatedName("client.gm")
    public static int field578 = 0;

    @ObfuscatedName("client.gy")
    public static class3[] field499 = new class3[2048];

    @ObfuscatedName("client.ga")
    public static int field483 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field514 = new int[2048];

    @ObfuscatedName("client.gr")
    public static int field677 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field583 = new int[2048];

    @ObfuscatedName("client.hb")
    public static class127[] field555 = new class127[2048];

    @ObfuscatedName("client.hz")
    public static int field585 = -1;

    @ObfuscatedName("client.hq")
    public static int field491 = 0;

    @ObfuscatedName("client.hk")
    public static int field658 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field588 = new int[1000];

    @ObfuscatedName("client.ht")
    public static final int[] field589 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.he")
    public static String[] field590 = new String[8];

    @ObfuscatedName("client.ho")
    public static boolean[] field591 = new boolean[8];

    @ObfuscatedName("client.hy")
    public static int[] field584 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hw")
    public static class177[][][] field645 = new class177[4][104][104];

    @ObfuscatedName("client.hd")
    public static class177 field674 = new class177();

    @ObfuscatedName("client.hr")
    public static class177 field595 = new class177();

    @ObfuscatedName("client.hj")
    public static class177 field647 = new class177();

    @ObfuscatedName("client.hn")
    public static int[] field597 = new int[25];

    @ObfuscatedName("client.hh")
    public static int[] field492 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field599 = new int[25];

    @ObfuscatedName("client.hi")
    public static int field600 = 0;

    @ObfuscatedName("client.ha")
    public static boolean field535 = false;

    @ObfuscatedName("client.ie")
    public static int field602 = 0;

    @ObfuscatedName("client.il")
    public static int[] field603 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field604 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field605 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field500 = new int[500];

    @ObfuscatedName("client.ij")
    public static String[] field525 = new String[500];

    @ObfuscatedName("client.ic")
    public static String[] field608 = new String[500];

    @ObfuscatedName("client.iy")
    public static int field609 = -1;

    @ObfuscatedName("client.in")
    public static int field610 = -1;

    @ObfuscatedName("client.ip")
    public static int field611 = 0;

    @ObfuscatedName("client.ik")
    public static int field612 = 50;

    @ObfuscatedName("client.ih")
    public static int field631 = 0;

    @ObfuscatedName("client.it")
    public static String field614 = null;

    @ObfuscatedName("client.iv")
    public static boolean field615 = false;

    @ObfuscatedName("client.im")
    public static int field581 = -1;

    @ObfuscatedName("client.iu")
    public static String field517 = null;

    @ObfuscatedName("client.ii")
    public static String field575 = null;

    @ObfuscatedName("client.iz")
    public static int field619 = -1;

    @ObfuscatedName("client.ia")
    public static class175 field620 = new class175(8);

    @ObfuscatedName("client.jo")
    public static int field641 = 0;

    @ObfuscatedName("client.jr")
    public static int field617 = 0;

    @ObfuscatedName("client.jw")
    public static class159 field712 = null;

    @ObfuscatedName("client.ja")
    public static int field624 = 0;

    @ObfuscatedName("client.jj")
    public static int field474 = 0;

    @ObfuscatedName("client.jk")
    public static int field626 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field553 = false;

    @ObfuscatedName("client.js")
    public static boolean field703 = false;

    @ObfuscatedName("client.jf")
    public static boolean field629 = false;

    @ObfuscatedName("client.jl")
    public static class159 field594 = null;

    @ObfuscatedName("client.je")
    public static class159 field460 = null;

    @ObfuscatedName("client.jz")
    public static int field632 = 0;

    @ObfuscatedName("client.jd")
    public static int field633 = 0;

    @ObfuscatedName("client.ji")
    public static class159 field634 = null;

    @ObfuscatedName("client.jh")
    public static boolean field635 = false;

    @ObfuscatedName("client.jx")
    public static int field636 = -1;

    @ObfuscatedName("client.jp")
    public static int field637 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field547 = false;

    @ObfuscatedName("client.jm")
    public static int field639 = -1;

    @ObfuscatedName("client.jq")
    public static int field640 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field529 = false;

    @ObfuscatedName("client.ju")
    public static int field642 = 1;

    @ObfuscatedName("client.kp")
    public static int[] field643 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field644 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field671 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field646 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field649 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field699 = 0;

    @ObfuscatedName("client.kl")
    public static int field682 = 0;

    @ObfuscatedName("client.kb")
    public static int field685 = 0;

    @ObfuscatedName("client.km")
    public static int field651 = 0;

    @ObfuscatedName("client.kk")
    public static int field652 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field653 = new int[2000];

    @ObfuscatedName("client.kv")
    public static String[] field654 = new String[1000];

    @ObfuscatedName("client.ku")
    public static int field655 = 0;

    @ObfuscatedName("client.kr")
    public static class177 field656 = new class177();

    @ObfuscatedName("client.kq")
    public static class177 field657 = new class177();

    @ObfuscatedName("client.kt")
    public static class177 field475 = new class177();

    @ObfuscatedName("client.kc")
    public static class175 field659 = new class175(512);

    @ObfuscatedName("client.kh")
    public static int field673 = 0;

    @ObfuscatedName("client.kg")
    public static int field557 = -2;

    @ObfuscatedName("client.kx")
    public static boolean[] field662 = new boolean[100];

    @ObfuscatedName("client.kd")
    public static boolean[] field663 = new boolean[100];

    @ObfuscatedName("client.ki")
    public static boolean[] field458 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static int[] field665 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field621 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field667 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field668 = new int[100];

    @ObfuscatedName("client.lx")
    public static int field463 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field670 = new int[100];

    @ObfuscatedName("client.lc")
    public static String[] field519 = new String[100];

    @ObfuscatedName("client.lo")
    public static String[] field672 = new String[100];

    @ObfuscatedName("client.lk")
    public static String[] field623 = new String[100];

    @ObfuscatedName("client.lu")
    public static int field695 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field675 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field660 = 0;

    @ObfuscatedName("client.li")
    public static int field542 = 0;

    @ObfuscatedName("client.ls")
    public static long[] field561 = new long[100];

    @ObfuscatedName("client.lh")
    public static int field679 = 0;

    @ObfuscatedName("client.le")
    public static int field661 = 0;

    @ObfuscatedName("client.lb")
    public static int[] field681 = new int[128];

    @ObfuscatedName("client.ln")
    public static int[] field527 = new int[128];

    @ObfuscatedName("client.lw")
    public static long field683 = -1L;

    @ObfuscatedName("client.lz")
    public static String field684 = null;

    @ObfuscatedName("client.ly")
    public static String field708 = null;

    @ObfuscatedName("client.ml")
    public static int field686 = -1;

    @ObfuscatedName("client.mn")
    public static int field687 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field650 = new int[1000];

    @ObfuscatedName("client.mv")
    public static int[] field689 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class86[] field690 = new class86[1000];

    @ObfuscatedName("client.mj")
    public static int field691 = 0;

    @ObfuscatedName("client.mg")
    public static int field480 = 0;

    @ObfuscatedName("client.me")
    public static int field580 = 0;

    @ObfuscatedName("client.ma")
    public static int field566 = 255;

    @ObfuscatedName("client.mz")
    public static int field548 = -1;

    @ObfuscatedName("client.mh")
    public static boolean field664 = false;

    @ObfuscatedName("client.mc")
    public static int field697 = 127;

    @ObfuscatedName("client.mw")
    public static int field698 = 127;

    @ObfuscatedName("client.nd")
    public static int field521 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field700 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field701 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field702 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field546 = new int[50];

    @ObfuscatedName("client.nq")
    public static class57[] field704 = new class57[50];

    @ObfuscatedName("client.nf")
    public static boolean field705 = false;

    @ObfuscatedName("client.ni")
    public static boolean[] field706 = new boolean[5];

    @ObfuscatedName("client.nw")
    public static int[] field579 = new int[5];

    @ObfuscatedName("client.nj")
    public static int[] field692 = new int[5];

    @ObfuscatedName("client.ne")
    public static int[] field709 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field710 = new int[5];

    @ObfuscatedName("client.no")
    public static int field711 = 0;

    @ObfuscatedName("client.ov")
    public static int field607 = 0;

    @ObfuscatedName("client.oc")
    public static class23[] field713 = new class23[400];

    @ObfuscatedName("client.oo")
    public static class173 field714 = new class173();

    @ObfuscatedName("client.ol")
    public static int field715 = 0;

    @ObfuscatedName("client.or")
    public static class11[] field716 = new class11[400];

    @ObfuscatedName("client.oa")
    public static class164 field717 = new class164();

    @ObfuscatedName("client.on")
    public static int field718 = -1;

    @ObfuscatedName("client.ok")
    public static int field719 = -1;

    @ObfuscatedName("client.l(I)V")
    public final void method422() {
    }

    public final void init() {
        if (!this.method1438()) {
            return;
        }
        class167[] var1 = class167.method2725();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2780);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2780)) {
                    case 1:
                        Statics.field465 = var4;
                        break;
                    case 2:
                        field638 = Integer.parseInt(var4);
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                        }
                        break;
                    case 4:
                        field464 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field459 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field522 = Integer.parseInt(var4);
                    case 7:
                    default:
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                            field618 = true;
                        } else {
                            field618 = false;
                        }
                        break;
                    case 9:
                        class134[] var5 = class134.method783();
                        int var6 = Integer.parseInt(var4);
                        class134[] var7 = var5;
                        int var8 = 0;
                        class134 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class134 var9 = var7[var8];
                            if (var6 == var9.method2346()) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field461 = (class134) var10;
                        if (Statics.field461 == class134.field2083) {
                            Statics.field2474 = class186.field2867;
                        } else {
                            Statics.field2474 = class186.field2864;
                        }
                        break;
                    case 10:
                        Statics.field1317 = class133.method2308(Integer.parseInt(var4));
                }
            }
        }
        class95.field1585 = false;
        field596 = false;
        Statics.field290 = this.getCodeBase().getHost();
        String var11 = Statics.field1317.field2070;
        byte var12 = 0;
        try {
            Statics.field1415 = 16;
            Statics.field2868 = var12;
            try {
                Statics.field12 = System.getProperty("os.name");
            } catch (Exception var62) {
                Statics.field12 = "Unknown";
            }
            Statics.field2833 = Statics.field12.toLowerCase();
            try {
                Statics.field2455 = System.getProperty("user.home");
                if (Statics.field2455 != null) {
                    Statics.field2455 = Statics.field2455 + "/";
                }
            } catch (Exception var61) {
            }
            try {
                if (Statics.field2833.startsWith("win")) {
                    if (Statics.field2455 == null) {
                        Statics.field2455 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2455 == null) {
                    Statics.field2455 = System.getenv("HOME");
                }
                if (Statics.field2455 != null) {
                    Statics.field2455 = Statics.field2455 + "/";
                }
            } catch (Exception var60) {
            }
            if (Statics.field2455 == null) {
                Statics.field2455 = "~/";
            }
            Statics.field179 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2455, "/tmp/", "" };
            Statics.field1421 = new String[] { ".jagex_cache_" + Statics.field2868, ".file_store_" + Statics.field2868 };
            int var16 = 0;
            label281: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field329 = new File(Statics.field2455, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field329.exists()) {
                    try {
                        class29 var21 = new class29(Statics.field329, "rw", 10000L);
                        class127 var22 = new class127((int) var21.method556());
                        while (var22.field2033 < var22.field2030.length) {
                            int var23 = var21.method557(var22.field2030, var22.field2033, var22.field2030.length - var22.field2033);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2033 += var23;
                        }
                        var22.field2033 = 0;
                        int var24 = var22.method2458();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2458();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2467();
                            if (var25 == 1) {
                                var19 = var22.method2467();
                            }
                        } else {
                            var18 = var22.method2550();
                            if (var25 == 1) {
                                var19 = var22.method2550();
                            }
                        }
                        var21.method555();
                    } catch (IOException var65) {
                        var65.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class82.method2952(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label257: for (int var29 = 0; var29 < Statics.field1421.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field179.length; var30++) {
                            File var31 = new File(Statics.field179[var30] + Statics.field1421[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class82.method2952(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label257;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field2455 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var64) {
                        var64.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class82.method151(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field1427 = var41;
                if (!Statics.field1427.exists()) {
                    Statics.field1427.mkdirs();
                }
                File[] var42 = Statics.field1427.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label281;
                    }
                    File var45 = var43[var44];
                    boolean var48;
                    try {
                        RandomAccessFile var46 = new RandomAccessFile(var45, "rw");
                        int var47 = var46.read();
                        var46.seek(0L);
                        var46.write(var47);
                        var46.seek(0L);
                        var46.close();
                        var48 = true;
                    } catch (Exception var59) {
                        var48 = false;
                    }
                    if (!var48) {
                        var16++;
                        break;
                    }
                    var44++;
                }
            }
            class72.method1417(Statics.field1427);
            try {
                File var50 = new File(Statics.field2455, "random.dat");
                if (var50.exists()) {
                    class82.field1418 = new class30(new class29(var50, "rw", 25L), 24, 0);
                } else {
                    label211: for (int var51 = 0; var51 < Statics.field1421.length; var51++) {
                        for (int var52 = 0; var52 < Statics.field179.length; var52++) {
                            File var53 = new File(Statics.field179[var52] + Statics.field1421[var51] + File.separatorChar + "random.dat");
                            if (var53.exists()) {
                                class82.field1418 = new class30(new class29(var53, "rw", 25L), 24, 0);
                                break label211;
                            }
                        }
                    }
                }
                if (class82.field1418 == null) {
                    RandomAccessFile var54 = new RandomAccessFile(var50, "rw");
                    int var55 = var54.read();
                    var54.seek(0L);
                    var54.write(var55);
                    var54.seek(0L);
                    var54.close();
                    class82.field1418 = new class30(new class29(var50, "rw", 25L), 24, 0);
                }
            } catch (IOException var63) {
            }
            class82.field1419 = new class30(new class29(Statics.method57("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1420 = new class30(new class29(Statics.method57("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1820 = new class30[Statics.field1415];
            for (int var57 = 0; var57 < Statics.field1415; var57++) {
                Statics.field1820[var57] = new class30(new class29(Statics.method57("main_file_cache.idx" + var57), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var66) {
            class80.method802((String) null, var66);
        }
        Statics.field456 = this;
        this.method1436(765, 503, 36);
    }

    @ObfuscatedName("client.r(I)V")
    public final void method264() {
        Statics.field266 = field522 == 0 ? 43594 : field638 + 40000;
        Statics.field278 = field522 == 0 ? 443 : field638 + 50000;
        Statics.field736 = Statics.field266;
        Statics.field2751 = class162.field2726;
        Statics.field2748 = class162.field2727;
        Statics.field1236 = class162.field2730;
        Statics.field2747 = class162.field2729;
        class75.method1174();
        Canvas var1 = Statics.field268;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class75.field1346);
        var1.addFocusListener(class75.field1346);
        Canvas var2 = Statics.field268;
        var2.addMouseListener(class77.field1386);
        var2.addMouseMotionListener(class77.field1386);
        var2.addFocusListener(class77.field1386);
        Statics.field1744 = Statics.method59();
        if (Statics.field1744 != null) {
            Statics.field1744.method1385(Statics.field268);
        }
        Statics.field2732 = new class71(255, class82.field1419, class82.field1420, 500000);
        Statics.field65 = class12.method1430();
        if (field522 != 0) {
            field592 = true;
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method386() {
        field484++;
        this.method268();
        class158.method2892();
        Statics.method2737();
        method2342();
        class75.method2368();
        class77 var1 = class77.field1386;
        synchronized (class77.field1386) {
            class77.field1387 = class77.field1373;
            class77.field1376 = class77.field1374;
            class77.field1375 = class77.field1371;
            class77.field1383 = class77.field1379;
            class77.field1384 = class77.field1380;
            class77.field1385 = class77.field1381;
            class77.field1377 = class77.field1382;
            class77.field1379 = 0;
        }
        if (Statics.field1744 != null) {
            int var3 = Statics.field1744.method1377();
            field655 = var3;
        }
        if (field466 == 0) {
            method2381();
            Statics.method163();
        } else if (field466 == 5) {
            class21.method2437(this);
            method2381();
            Statics.method163();
        } else if (field466 == 10) {
            class21.method2437(this);
        } else if (field466 == 20) {
            class21.method2437(this);
            method1527();
        } else if (field466 == 25) {
            method37();
        }
        if (field466 == 30) {
            method608();
        } else if (field466 == 40) {
            method1527();
        }
    }

    @ObfuscatedName("client.u(B)V")
    public final void method266() {
        boolean var1;
        label238: {
            try {
                if (class139.field2350 == 2) {
                    if (Statics.field1657 == null) {
                        Statics.field1657 = class140.method2770(Statics.field1292, Statics.field2719, Statics.field2576);
                        if (Statics.field1657 == null) {
                            var1 = false;
                            break label238;
                        }
                    }
                    if (Statics.field1998 == null) {
                        Statics.field1998 = new class58(Statics.field2348, Statics.field370);
                    }
                    if (Statics.field2347.method2870(Statics.field1657, Statics.field2349, Statics.field1998, 22050)) {
                        Statics.field2347.method2860();
                        Statics.field2347.method2790(Statics.field2351);
                        Statics.field2347.method2795(Statics.field1657, Statics.field2029);
                        class139.field2350 = 0;
                        Statics.field1657 = null;
                        Statics.field1998 = null;
                        Statics.field1292 = null;
                        var1 = true;
                        break label238;
                    }
                }
            } catch (Exception var34) {
                var34.printStackTrace();
                Statics.field2347.method2796();
                class139.field2350 = 0;
                Statics.field1657 = null;
                Statics.field1998 = null;
                Statics.field1292 = null;
            }
            var1 = false;
        }
        if (var1 && field664 && Statics.field368 != null) {
            Statics.field368.method1152();
        }
        if (field1318) {
            class75.method142(Statics.field268);
            class77.method1870(Statics.field268);
            if (Statics.field1744 != null) {
                Statics.field1744.method1376(Statics.field268);
            }
            this.method1437();
            Canvas var4 = Statics.field268;
            var4.setFocusTraversalKeysEnabled(false);
            var4.addKeyListener(class75.field1346);
            var4.addFocusListener(class75.field1346);
            Canvas var5 = Statics.field268;
            var5.addMouseListener(class77.field1386);
            var5.addMouseMotionListener(class77.field1386);
            var5.addFocusListener(class77.field1386);
            if (Statics.field1744 != null) {
                Statics.field1744.method1385(Statics.field268);
            }
        }
        if (field466 == 0) {
            int var6 = class21.field312;
            String var7 = class21.field313;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field268.getGraphics();
                if (Statics.field2355 == null) {
                    Statics.field2355 = new Font("Helvetica", 1, 13);
                    Statics.field1506 = Statics.field268.getFontMetrics(Statics.field2355);
                }
                if (field1312) {
                    field1312 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field272, Statics.field2449);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field235 == null) {
                        Statics.field235 = Statics.field268.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field235.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field2355);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1506.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field235, Statics.field272 / 2 - 152, Statics.field2449 / 2 - 18, (ImageObserver) null);
                } catch (Exception var30) {
                    int var12 = Statics.field272 / 2 - 152;
                    int var13 = Statics.field2449 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field2355);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1506.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var31) {
                Statics.field268.repaint();
            }
        } else if (field466 == 5) {
            class21.method148(Statics.field510, Statics.field330);
        } else if (field466 == 10) {
            class21.method148(Statics.field510, Statics.field330);
        } else if (field466 == 20) {
            class21.method148(Statics.field510, Statics.field330);
        } else if (field466 == 25) {
            if (field516 == 1) {
                if (field512 > field513) {
                    field513 = field512;
                }
                int var15 = (field513 * 50 - field512 * 50) / field513;
                method255(class135.field2097 + class2.field22 + class2.field33 + var15 + "%" + class2.field16, false);
            } else if (field516 == 2) {
                if (field606 > field515) {
                    field515 = field606;
                }
                int var16 = (field515 * 50 - field606 * 50) / field515 + 50;
                method255(class135.field2097 + class2.field22 + class2.field33 + var16 + "%" + class2.field16, false);
            } else {
                method255(class135.field2097, false);
            }
        } else if (field466 == 30) {
            if (!field535) {
                field525[0] = class135.field2102;
                field608[0] = "";
                field605[0] = 1006;
                field602 = 1;
            }
            if (field619 != -1) {
                method1603(field619);
            }
            for (int var17 = 0; var17 < field673; var17++) {
                if (field662[var17]) {
                    field663[var17] = true;
                }
                field458[var17] = field662[var17];
                field662[var17] = false;
            }
            field557 = field484;
            field609 = -1;
            field610 = -1;
            Statics.field448 = null;
            if (field619 != -1) {
                field673 = 0;
                method2312(field619, 0, 0, 765, 503, 0, 0, -1);
            }
            class89.method1799();
            method129();
            if (field535) {
                method185();
            } else if (field609 != -1) {
                int var18 = field609;
                int var19 = field610;
                if (field602 >= 2 || field631 != 0 || field615) {
                    String var20;
                    if (field631 == 1 && field602 < 2) {
                        var20 = class135.field2231 + class135.field2241 + field614 + " " + class2.field21;
                    } else if (field615 && field602 < 2) {
                        var20 = field517 + class135.field2241 + field575 + " " + class2.field21;
                    } else {
                        int var21 = field602 - 1;
                        String var22;
                        if (field608[var21].length() > 0) {
                            var22 = field525[var21] + class135.field2241 + field608[var21];
                        } else {
                            var22 = field525[var21];
                        }
                        var20 = var22;
                    }
                    if (field602 > 2) {
                        var20 = var20 + class2.method1391(16777215) + " " + '/' + " " + (field602 - 2) + class135.field2145;
                    }
                    Statics.field510.method3411(var20, var18 + 4, var19 + 15, 16777215, 0, field484 / 1000);
                }
            }
            if (field463 == 3) {
                for (int var23 = 0; var23 < field673; var23++) {
                    if (field458[var23]) {
                        class89.method1837(field665[var23], field621[var23], field667[var23], field668[var23], 16711935, 128);
                    } else if (field663[var23]) {
                        class89.method1837(field665[var23], field621[var23], field667[var23], field668[var23], 16711680, 128);
                    }
                }
            }
            class7.method1871(Statics.field363, Statics.field1424.field401, Statics.field1424.field414, field534);
            field534 = 0;
        } else if (field466 == 40) {
            method255(class135.field2098 + class2.field22 + class135.field2278, false);
        }
        if (field466 == 30 && field463 == 0 && !field1312) {
            try {
                Graphics var24 = Statics.field268.getGraphics();
                for (int var25 = 0; var25 < field673; var25++) {
                    if (field663[var25]) {
                        Statics.field1289.method1628(var24, field665[var25], field621[var25], field667[var25], field668[var25]);
                        field663[var25] = false;
                    }
                }
            } catch (Exception var33) {
                Statics.field268.repaint();
            }
        } else if (field466 > 0) {
            try {
                Graphics var27 = Statics.field268.getGraphics();
                Statics.field1289.method1626(var27, 0, 0);
                field1312 = false;
                for (int var28 = 0; var28 < field673; var28++) {
                    field663[var28] = false;
                }
            } catch (Exception var32) {
                Statics.field268.repaint();
            }
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method267() {
        if (Statics.field256 != null) {
            Statics.field256.field249 = false;
        }
        Statics.field256 = null;
        if (Statics.field172 != null) {
            Statics.field172.method1397();
            Statics.field172 = null;
        }
        if (class75.field1346 != null) {
            class75 var1 = class75.field1346;
            synchronized (class75.field1346) {
                class75.field1346 = null;
            }
        }
        class77.method1566();
        Statics.field1744 = null;
        if (Statics.field368 != null) {
            Statics.field368.method1145();
        }
        if (Statics.field2466 != null) {
            Statics.field2466.method1145();
        }
        if (Statics.field2534 != null) {
            Statics.field2534.method1397();
        }
        class158.method134();
        class82.method751();
    }

    @ObfuscatedName("at.g(IB)V")
    public static void method766(int arg0) {
        if (field466 == arg0) {
            return;
        }
        if (field466 == 0) {
            Statics.field235 = null;
            Statics.field2355 = null;
            Statics.field1506 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field627 = 0;
            field507 = 0;
            field493 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1999 != null) {
            Statics.field1999.method1397();
            Statics.field1999 = null;
        }
        if (field466 == 25) {
            field516 = 0;
            field512 = 0;
            field513 = 1;
            field606 = 0;
            field515 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field268;
            class155 var2 = Statics.field189;
            class155 var3 = Statics.field130;
            if (!Statics.field300) {
                class89.method1800();
                byte[] var4 = var2.method3051("title.jpg", "");
                Statics.field299 = new class86(var4, var1);
                Statics.field296 = Statics.field299.method1698();
                Statics.field1503 = class84.method1875(var3, "logo", "");
                Statics.field308 = class84.method1875(var3, "titlebox", "");
                Statics.field298 = class84.method1875(var3, "titlebutton", "");
                Statics.field62 = class84.method23(var3, "runes", "");
                Statics.field190 = class84.method23(var3, "title_mute", "");
                Statics.field320 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field320[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field320[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field320[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field320[var8 + 192] = 16777215;
                }
                Statics.field1430 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field1430[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field1430[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field1430[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field1430[var12 + 192] = 16777215;
                }
                Statics.field1986 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field1986[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field1986[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field1986[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field1986[var16 + 192] = 16777215;
                }
                Statics.field1258 = new int[256];
                Statics.field2468 = new int[32768];
                Statics.field61 = new int[32768];
                class21.method805((class87) null);
                Statics.field307 = new int[32768];
                Statics.field1378 = new int[32768];
                class21.field314 = 0;
                class21.field318 = "";
                class21.field319 = "";
                class21.field315 = false;
                if (Statics.field65.field178) {
                    class139.method2345(2);
                } else {
                    class139.method25(2, Statics.field2871, "scape main", "", 255, false);
                }
                class154.method36(false);
                Statics.field300 = true;
                Statics.field299.method1707(0, 0);
                Statics.field296.method1707(382, 0);
                Statics.field1503.method1788(382 - Statics.field1503.field1471 / 2, 18);
            }
        } else {
            class21.method131();
        }
        field466 = arg0;
    }

    @ObfuscatedName("client.s(I)V")
    public void method268() {
        if (field466 == 1000) {
            return;
        }
        long var1 = class121.method133();
        int var3 = (int) (var1 - Statics.field2550);
        Statics.field2550 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class154.field2531 += var3;
        boolean var4;
        if (class154.field2540 == 0 && class154.field2542 == 0 && class154.field2538 == 0 && class154.field2529 == 0) {
            var4 = true;
        } else if (Statics.field2534 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class154.field2531 > 30000) {
                        throw new IOException();
                    }
                    while (class154.field2542 < 20 && class154.field2529 > 0) {
                        class156 var5 = (class156) class154.field2532.method3315();
                        class127 var6 = new class127(4);
                        var6.method2536(1);
                        var6.method2446((int) var5.field2812);
                        Statics.field2534.method1396(var6.field2030, 0, 4);
                        class154.field2539.method3329(var5, var5.field2812);
                        class154.field2529--;
                        class154.field2542++;
                    }
                    while (class154.field2540 < 20 && class154.field2538 > 0) {
                        class156 var7 = (class156) class154.field2536.method3284();
                        class127 var8 = new class127(4);
                        var8.method2536(0);
                        var8.method2446((int) var7.field2812);
                        Statics.field2534.method1396(var8.field2030, 0, 4);
                        var7.method3309();
                        class154.field2543.method3329(var7, var7.field2812);
                        class154.field2538--;
                        class154.field2540++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2534.method1394();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class154.field2531 = 0;
                        byte var11 = 0;
                        if (Statics.field2541 == null) {
                            var11 = 8;
                        } else if (class154.field2530 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class154.field2535.field2033;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2534.method1410(class154.field2535.field2030, class154.field2535.field2033, var12);
                            if (class154.field2546 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class154.field2535.field2030[class154.field2535.field2033 + var13] ^= class154.field2546;
                                }
                            }
                            class154.field2535.field2033 += var12;
                            if (class154.field2535.field2033 < var11) {
                                break;
                            }
                            if (Statics.field2541 == null) {
                                class154.field2535.field2033 = 0;
                                int var14 = class154.field2535.method2458();
                                int var15 = class154.field2535.method2460();
                                int var16 = class154.field2535.method2458();
                                int var17 = class154.field2535.method2463();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class154.field2539.method3312(var18);
                                Statics.field1819 = true;
                                if (var20 == null) {
                                    var20 = (class156) class154.field2543.method3312(var18);
                                    Statics.field1819 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2541 = var20;
                                Statics.field2335 = new class127(var17 + var21 + Statics.field2541.field2567);
                                Statics.field2335.method2536(var16);
                                Statics.field2335.method2447(var17);
                                class154.field2530 = 8;
                                class154.field2535.field2033 = 0;
                            } else if (class154.field2530 == 0) {
                                if (class154.field2535.field2030[0] == -1) {
                                    class154.field2530 = 1;
                                    class154.field2535.field2033 = 0;
                                } else {
                                    Statics.field2541 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2335.field2030.length - Statics.field2541.field2567;
                            int var23 = 512 - class154.field2530;
                            if (var23 > var22 - Statics.field2335.field2033) {
                                var23 = var22 - Statics.field2335.field2033;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2534.method1410(Statics.field2335.field2030, Statics.field2335.field2033, var23);
                            if (class154.field2546 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2335.field2030[Statics.field2335.field2033 + var24] ^= class154.field2546;
                                }
                            }
                            Statics.field2335.field2033 += var23;
                            class154.field2530 += var23;
                            if (Statics.field2335.field2033 == var22) {
                                if (Statics.field2541.field2812 == 16711935L) {
                                    Statics.field2830 = Statics.field2335;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class155 var26 = class154.field2545[var25];
                                        if (var26 != null) {
                                            Statics.field2830.field2033 = var25 * 8 + 5;
                                            int var27 = Statics.field2830.method2463();
                                            int var28 = Statics.field2830.method2463();
                                            var26.method3138(var27, var28);
                                        }
                                    }
                                } else {
                                    class154.field2544.reset();
                                    class154.field2544.update(Statics.field2335.field2030, 0, var22);
                                    int var29 = (int) class154.field2544.getValue();
                                    if (Statics.field2541.field2565 != var29) {
                                        try {
                                            Statics.field2534.method1397();
                                        } catch (Exception var35) {
                                        }
                                        class154.field2547++;
                                        Statics.field2534 = null;
                                        class154.field2546 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class154.field2547 = 0;
                                    class154.field2548 = 0;
                                    Statics.field2541.field2570.method3137((int) (Statics.field2541.field2812 & 0xFFFFL), Statics.field2335.field2030, (Statics.field2541.field2812 & 0xFF0000L) == 16711680L, Statics.field1819);
                                }
                                Statics.field2541.method3374();
                                if (Statics.field1819) {
                                    class154.field2542--;
                                } else {
                                    class154.field2540--;
                                }
                                class154.field2530 = 0;
                                Statics.field2541 = null;
                                Statics.field2335 = null;
                            } else {
                                if (class154.field2530 != 512) {
                                    break;
                                }
                                class154.field2530 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2534.method1397();
                } catch (Exception var34) {
                }
                class154.field2548++;
                Statics.field2534 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method269();
        }
    }

    @ObfuscatedName("client.b(I)V")
    public void method269() {
        if (class154.field2547 >= 4) {
            this.method1447("js5crc");
            field466 = 1000;
            return;
        }
        if (class154.field2548 >= 4) {
            if (field466 <= 5) {
                this.method1447("js5io");
                field466 = 1000;
                return;
            }
            field487 = 3000;
            class154.field2548 = 3;
        }
        if (--field487 + 1 > 0) {
            return;
        }
        try {
            if (field486 == 0) {
                Statics.field78 = Statics.field1214.method1506(Statics.field290, Statics.field736);
                field486++;
            }
            if (field486 == 1) {
                if (Statics.field78.field1392 == 2) {
                    this.method345(-1);
                    return;
                }
                if (Statics.field78.field1392 == 1) {
                    field486++;
                }
            }
            if (field486 == 2) {
                Statics.field169 = new class70((Socket) Statics.field78.field1399, Statics.field1214);
                class127 var1 = new class127(5);
                var1.method2536(15);
                var1.method2447(36);
                Statics.field169.method1396(var1.field2030, 0, 5);
                field486++;
                Statics.field1504 = class121.method133();
            }
            if (field486 == 3) {
                if (field466 <= 5 || Statics.field169.method1394() > 0) {
                    int var2 = Statics.field169.method1403();
                    if (var2 != 0) {
                        this.method345(var2);
                        return;
                    }
                    field486++;
                } else if (class121.method133() - Statics.field1504 > 30000L) {
                    this.method345(-2);
                    return;
                }
            }
            if (field486 == 4) {
                class70 var3 = Statics.field169;
                boolean var4 = field466 > 20;
                if (Statics.field2534 != null) {
                    try {
                        Statics.field2534.method1397();
                    } catch (Exception var14) {
                    }
                    Statics.field2534 = null;
                }
                Statics.field2534 = var3;
                class154.method36(var4);
                class154.field2535.field2033 = 0;
                Statics.field2541 = null;
                Statics.field2335 = null;
                class154.field2530 = 0;
                while (true) {
                    class156 var6 = (class156) class154.field2539.method3315();
                    if (var6 == null) {
                        while (true) {
                            class156 var7 = (class156) class154.field2543.method3315();
                            if (var7 == null) {
                                if (class154.field2546 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2536(4);
                                        var8.method2536(class154.field2546);
                                        var8.method2563(0);
                                        Statics.field2534.method1396(var8.field2030, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2534.method1397();
                                        } catch (Exception var12) {
                                        }
                                        class154.field2548++;
                                        Statics.field2534 = null;
                                    }
                                }
                                class154.field2531 = 0;
                                Statics.field2550 = class121.method133();
                                Statics.field78 = null;
                                Statics.field169 = null;
                                field486 = 0;
                                field490 = 0;
                                return;
                            }
                            class154.field2536.method3281(var7);
                            class154.field2537.method3329(var7, var7.field2812);
                            class154.field2538++;
                            class154.field2540--;
                        }
                    }
                    class154.field2532.method3329(var6, var6.field2812);
                    class154.field2529++;
                    class154.field2542--;
                }
            }
        } catch (IOException var15) {
            this.method345(-3);
        }
    }

    @ObfuscatedName("client.v(IB)V")
    public void method345(int arg0) {
        Statics.field78 = null;
        Statics.field169 = null;
        field486 = 0;
        if (Statics.field736 == Statics.field266) {
            Statics.field736 = Statics.field278;
        } else {
            Statics.field736 = Statics.field266;
        }
        field490++;
        if (field490 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field466 <= 5) {
                this.method1447("js5connect_full");
                field466 = 1000;
            } else {
                field487 = 3000;
            }
        } else if (field490 >= 2 && arg0 == 6) {
            this.method1447("js5connect_outofdate");
            field466 = 1000;
        } else if (field490 >= 4) {
            if (field466 <= 5) {
                this.method1447("js5connect");
                field466 = 1000;
            } else {
                field487 = 3000;
            }
        }
    }

    @ObfuscatedName("dy.j(I)V")
    public static void method2381() {
        if (field696 == 0) {
            Statics.field199 = new class95(4, 104, 104, class9.field129);
            for (int var0 = 0; var0 < 4; var0++) {
                field680[var0] = new class130(104, 104);
            }
            Statics.field100 = new class86(512, 512);
            class21.field313 = class135.field2324;
            class21.field312 = 5;
            field696 = 20;
        } else if (field696 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1774[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method2037(var1, 500, 800, 512, 334);
            class21.field313 = class135.field2101;
            class21.field312 = 10;
            field696 = 30;
        } else if (field696 == 30) {
            Statics.field102 = method152(0, false, true, true);
            Statics.field262 = method152(1, false, true, true);
            Statics.field389 = method152(2, true, false, true);
            Statics.field1413 = method152(3, false, true, true);
            Statics.field488 = method152(4, false, true, true);
            Statics.field2453 = method152(5, true, true, true);
            Statics.field2871 = method152(6, true, true, false);
            Statics.field2832 = method152(7, false, true, true);
            Statics.field130 = method152(8, false, true, true);
            Statics.field250 = method152(9, false, true, true);
            Statics.field189 = method152(10, false, true, true);
            Statics.field345 = method152(11, false, true, true);
            Statics.field198 = method152(12, false, true, true);
            Statics.field889 = method152(13, true, false, true);
            Statics.field489 = method152(14, false, true, false);
            Statics.field1400 = method152(15, false, true, true);
            class21.field313 = class135.field2317;
            class21.field312 = 20;
            field696 = 40;
        } else if (field696 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field102.method3116() * 4 / 100;
            int var8 = var7 + Statics.field262.method3116() * 4 / 100;
            int var9 = var8 + Statics.field389.method3116() * 2 / 100;
            int var10 = var9 + Statics.field1413.method3116() * 2 / 100;
            int var11 = var10 + Statics.field488.method3116() * 6 / 100;
            int var12 = var11 + Statics.field2453.method3116() * 4 / 100;
            int var13 = var12 + Statics.field2871.method3116() * 2 / 100;
            int var14 = var13 + Statics.field2832.method3116() * 60 / 100;
            int var15 = var14 + Statics.field130.method3116() * 2 / 100;
            int var16 = var15 + Statics.field250.method3116() * 2 / 100;
            int var17 = var16 + Statics.field189.method3116() * 2 / 100;
            int var18 = var17 + Statics.field345.method3116() * 2 / 100;
            int var19 = var18 + Statics.field198.method3116() * 2 / 100;
            int var20 = var19 + Statics.field889.method3116() * 2 / 100;
            int var21 = var20 + Statics.field489.method3116() * 2 / 100;
            int var22 = var21 + Statics.field1400.method3116() * 2 / 100;
            if (var22 == 100) {
                class21.field313 = class135.field2104;
                class21.field312 = 30;
                field696 = 45;
            } else {
                if (var22 != 0) {
                    class21.field313 = class135.field2103 + var22 + "%";
                }
                class21.field312 = 30;
            }
        } else if (field696 == 45) {
            class52.method573(22050, !field596, 2);
            class142 var23 = new class142();
            var23.method2807(9, 128);
            Statics.field368 = class52.method2049(Statics.field1214, Statics.field268, 0, 22050);
            Statics.field368.method1142(var23);
            class155 var24 = Statics.field1400;
            class155 var25 = Statics.field489;
            class155 var26 = Statics.field488;
            Statics.field2349 = var24;
            Statics.field370 = var25;
            Statics.field2348 = var26;
            Statics.field2347 = var23;
            Statics.field2466 = class52.method2049(Statics.field1214, Statics.field268, 1, 2048);
            Statics.field1909 = new class46();
            Statics.field2466.method1142(Statics.field1909);
            Statics.field253 = new class62(22050, Statics.field1089);
            class21.field313 = class135.field2105;
            class21.field312 = 35;
            field696 = 50;
        } else if (field696 == 50) {
            int var27 = 0;
            if (Statics.field330 == null) {
                class155 var28 = Statics.field130;
                class155 var29 = Statics.field889;
                int var30 = var28.method3034("p11_full");
                int var31 = var28.method3050(var30, "");
                class183 var32 = class84.method1623(var28, var29, var30, var31);
                Statics.field330 = var32;
            } else {
                var27++;
            }
            if (Statics.field1818 == null) {
                class155 var33 = Statics.field130;
                class155 var34 = Statics.field889;
                int var35 = var33.method3034("p12_full");
                int var36 = var33.method3050(var35, "");
                class183 var37 = class84.method1623(var33, var34, var35, var36);
                Statics.field1818 = var37;
            } else {
                var27++;
            }
            if (Statics.field510 == null) {
                class155 var38 = Statics.field130;
                class155 var39 = Statics.field889;
                int var40 = var38.method3034("b12_full");
                int var41 = var38.method3050(var40, "");
                class183 var42 = class84.method1623(var38, var39, var40, var41);
                Statics.field510 = var42;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field313 = class135.field2106 + var27 * 100 / 3 + "%";
                class21.field312 = 40;
            } else {
                Statics.field183 = new class152(true);
                class21.field313 = class135.field2107;
                class21.field312 = 40;
                field696 = 60;
            }
        } else if (field696 == 60) {
            int var43 = class21.method1567(Statics.field189, Statics.field130);
            int var44 = class21.method2052();
            if (var43 < var44) {
                class21.field313 = class135.field2108 + var43 * 100 / var44 + "%";
                class21.field312 = 50;
            } else {
                class21.field313 = class135.field2194;
                class21.field312 = 50;
                method766(5);
                field696 = 70;
            }
        } else if (field696 == 70) {
            if (Statics.field389.method3072()) {
                class155 var45 = Statics.field389;
                Statics.field931 = var45;
                class33.method550(Statics.field389);
                class36.method161(Statics.field389, Statics.field2832);
                class155 var46 = Statics.field389;
                class155 var47 = Statics.field2832;
                boolean var48 = field596;
                Statics.field837 = var46;
                Statics.field2005 = var47;
                class32.field815 = var48;
                class155 var49 = Statics.field389;
                class155 var50 = Statics.field2832;
                Statics.field796 = var49;
                Statics.field800 = var50;
                class155 var51 = Statics.field389;
                class155 var52 = Statics.field2832;
                boolean var53 = field618;
                class183 var54 = Statics.field330;
                Statics.field1009 = var51;
                Statics.field982 = var52;
                Statics.field968 = var53;
                Statics.field1009.method3056(10);
                Statics.field316 = var54;
                class34.method230(Statics.field389, Statics.field102, Statics.field262);
                class155 var55 = Statics.field389;
                class155 var56 = Statics.field2832;
                Statics.field910 = var55;
                Statics.field895 = var56;
                class155 var57 = Statics.field389;
                Statics.field951 = var57;
                class42.method790(Statics.field389);
                class155 var58 = Statics.field1413;
                class155 var59 = Statics.field2832;
                class155 var60 = Statics.field130;
                class155 var61 = Statics.field889;
                Statics.field2711 = var58;
                Statics.field2590 = var59;
                Statics.field2681 = var60;
                Statics.field2592 = var61;
                Statics.field2693 = new class159[Statics.field2711.method3045()][];
                Statics.field2588 = new boolean[Statics.field2711.method3045()];
                class41.method238(Statics.field389);
                class39.method231(Statics.field389);
                class21.field313 = class135.field2111;
                class21.field312 = 60;
                field696 = 80;
            } else {
                class21.field313 = class135.field2167 + Statics.field389.method3122() + "%";
                class21.field312 = 60;
            }
        } else if (field696 == 80) {
            int var62 = 0;
            if (Statics.field2345 == null) {
                class155 var63 = Statics.field130;
                int var64 = var63.method3034("compass");
                int var65 = var63.method3050(var64, "");
                class86 var66 = class84.method241(var63, var64, var65);
                Statics.field2345 = var66;
            } else {
                var62++;
            }
            if (Statics.field669 == null) {
                class155 var67 = Statics.field130;
                int var68 = var67.method3034("mapedge");
                int var69 = var67.method3050(var68, "");
                class86 var70 = class84.method241(var67, var68, var69);
                Statics.field669 = var70;
            } else {
                var62++;
            }
            if (Statics.field533 == null) {
                Statics.field533 = class84.method23(Statics.field130, "mapscene", "");
            } else {
                var62++;
            }
            if (Statics.field1807 == null) {
                Statics.field1807 = class84.method1601(Statics.field130, "mapfunction", "");
            } else {
                var62++;
            }
            if (Statics.field1749 == null) {
                Statics.field1749 = class84.method1601(Statics.field130, "hitmarks", "");
            } else {
                var62++;
            }
            if (Statics.field950 == null) {
                Statics.field950 = class84.method1601(Statics.field130, "headicons_pk", "");
            } else {
                var62++;
            }
            if (Statics.field1982 == null) {
                Statics.field1982 = class84.method1601(Statics.field130, "headicons_prayer", "");
            } else {
                var62++;
            }
            if (Statics.field851 == null) {
                Statics.field851 = class84.method1601(Statics.field130, "headicons_hint", "");
            } else {
                var62++;
            }
            if (Statics.field1281 == null) {
                Statics.field1281 = class84.method1601(Statics.field130, "mapmarker", "");
            } else {
                var62++;
            }
            if (Statics.field1319 == null) {
                Statics.field1319 = class84.method1601(Statics.field130, "cross", "");
            } else {
                var62++;
            }
            if (Statics.field1919 == null) {
                Statics.field1919 = class84.method1601(Statics.field130, "mapdots", "");
            } else {
                var62++;
            }
            if (Statics.field1443 == null) {
                Statics.field1443 = class84.method23(Statics.field130, "scrollbar", "");
            } else {
                var62++;
            }
            if (Statics.field106 == null) {
                Statics.field106 = class84.method23(Statics.field130, "mod_icons", "");
            } else {
                var62++;
            }
            if (Statics.field1983 == null) {
                Statics.field1983 = class84.method1875(Statics.field130, "mapback", "");
            } else {
                var62++;
            }
            if (var62 < 14) {
                class21.field313 = class135.field2306 + var62 * 100 / 14 + "%";
                class21.field312 = 70;
            } else {
                Statics.field2843 = Statics.field106;
                Statics.field669.method1701();
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 41.0D) - 20;
                for (int var75 = 0; var75 < Statics.field1807.length; var75++) {
                    Statics.field1807[var75].method1717(var71 + var74, var72 + var74, var73 + var74);
                }
                Statics.field533[0].method1790(var71 + var74, var72 + var74, var73 + var74);
                method1414();
                class21.field313 = class135.field2096;
                class21.field312 = 70;
                field696 = 90;
            }
        } else if (field696 == 90) {
            if (Statics.field250.method3072()) {
                class110 var76 = new class110(Statics.field250, Statics.field130, 20, 0.8D, field596 ? 64 : 128);
                class104.method2146(var76);
                class104.method2147(0.8D);
                class21.field313 = class135.field2115;
                class21.field312 = 90;
                field696 = 110;
            } else {
                class21.field313 = class135.field2114 + Statics.field250.method3122() + "%";
                class21.field312 = 90;
            }
        } else if (field696 == 110) {
            Statics.field256 = new class16();
            Statics.field1214.method1507(Statics.field256, 10);
            class21.field313 = class135.field2116;
            class21.field312 = 94;
            field696 = 120;
        } else if (field696 == 120) {
            if (Statics.field189.method3052("huffman", "")) {
                class120 var77 = new class120(Statics.field189.method3051("huffman", ""));
                Statics.field2831 = var77;
                class21.field313 = class135.field2118;
                class21.field312 = 96;
                field696 = 130;
            } else {
                class21.field313 = class135.field2117 + "%";
                class21.field312 = 96;
            }
        } else if (field696 == 130) {
            if (!Statics.field1413.method3072()) {
                class21.field313 = class135.field2206 + Statics.field1413.method3122() * 4 / 5 + "%";
                class21.field312 = 100;
            } else if (!Statics.field198.method3072()) {
                class21.field313 = class135.field2206 + (80 + Statics.field198.method3122() / 6) + "%";
                class21.field312 = 100;
            } else if (Statics.field889.method3072()) {
                class21.field313 = class135.field2120;
                class21.field312 = 100;
                field696 = 140;
            } else {
                class21.field313 = class135.field2206 + (96 + Statics.field889.method3122() / 20) + "%";
                class21.field312 = 100;
            }
        } else if (field696 == 140) {
            method766(10);
        }
    }

    @ObfuscatedName("j.q(IZZZI)Lep;")
    public static class155 method152(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1419 != null) {
            var4 = new class71(arg0, class82.field1419, Statics.field1820[arg0], 1000000);
        }
        return new class155(var4, Statics.field2732, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bz.a(I)V")
    public static void method1414() {
        Statics.field347 = new int[33];
        Statics.field383 = new int[33];
        Statics.field231 = new int[151];
        Statics.field2789 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field1983.field1470[Statics.field1983.field1471 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field347[var0] = var1;
            Statics.field383[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field1983.field1470[Statics.field1983.field1471 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field231[var4 - 5] = var5 - 25;
            Statics.field2789[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("bj.c(I)V")
    public static final void method1527() {
        try {
            if (field627 == 0) {
                if (Statics.field172 != null) {
                    Statics.field172.method1397();
                    Statics.field172 = null;
                }
                Statics.field18 = null;
                field509 = false;
                field507 = 0;
                field627 = 1;
            }
            if (field627 == 1) {
                if (Statics.field18 == null) {
                    Statics.field18 = Statics.field1214.method1506(Statics.field290, Statics.field736);
                }
                if (Statics.field18.field1392 == 2) {
                    throw new IOException();
                }
                if (Statics.field18.field1392 == 1) {
                    Statics.field172 = new class70((Socket) Statics.field18.field1399, Statics.field1214);
                    Statics.field18 = null;
                    field627 = 2;
                }
            }
            if (field627 == 2) {
                field694.field2033 = 0;
                field694.method2536(14);
                Statics.field172.method1396(field694.field2030, 0, 1);
                field468.field2033 = 0;
                field627 = 3;
            }
            if (field627 == 3) {
                if (Statics.field368 != null) {
                    Statics.field368.method1173();
                }
                if (Statics.field2466 != null) {
                    Statics.field2466.method1173();
                }
                int var0 = Statics.field172.method1403();
                if (Statics.field368 != null) {
                    Statics.field368.method1173();
                }
                if (Statics.field2466 != null) {
                    Statics.field2466.method1173();
                }
                if (var0 != 0) {
                    method3172(var0);
                    return;
                }
                field468.field2033 = 0;
                field627 = 5;
            }
            if (field627 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field694.field2033 = 0;
                field694.method2536(10);
                field694.method2447(var1[0]);
                field694.method2447(var1[1]);
                field694.method2447(var1[2]);
                field694.method2447(var1[3]);
                field694.method2448(0L);
                field694.method2449(class21.field319);
                field694.method2476(class6.field80, class6.field77);
                field648.field2033 = 0;
                if (field466 == 40) {
                    field648.method2536(18);
                } else {
                    field648.method2536(16);
                }
                field648.method2563(0);
                int var2 = field648.field2033;
                field648.method2447(36);
                field648.method2452(field694.field2030, 0, field694.field2033);
                int var3 = field648.field2033;
                field648.method2449(class21.field318);
                field648.method2536(field596 ? 1 : 0);
                class116 var4 = field648;
                byte[] var5 = new byte[24];
                try {
                    class82.field1418.method591(0L);
                    class82.field1418.method590(var5);
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
                class127 var9 = new class127(Statics.field183.method3026());
                Statics.field183.method3025(var9);
                field648.method2452(var9.field2030, 0, var9.field2030.length);
                field648.method2447(Statics.field102.field2512);
                field648.method2447(Statics.field262.field2512);
                field648.method2447(Statics.field389.field2512);
                field648.method2447(Statics.field1413.field2512);
                field648.method2447(Statics.field488.field2512);
                field648.method2447(Statics.field2453.field2512);
                field648.method2447(Statics.field2871.field2512);
                field648.method2447(Statics.field2832.field2512);
                field648.method2447(Statics.field130.field2512);
                field648.method2447(Statics.field250.field2512);
                field648.method2447(Statics.field189.field2512);
                field648.method2447(Statics.field345.field2512);
                field648.method2447(Statics.field198.field2512);
                field648.method2447(Statics.field889.field2512);
                field648.method2447(Statics.field489.field2512);
                field648.method2447(Statics.field1400.field2512);
                field648.method2474(var1, var3, field648.field2033);
                field648.method2470(field648.field2033 - var2);
                Statics.field172.method1396(field648.field2030, 0, field648.field2033);
                field694.method2327(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field468.method2327(var1);
                field627 = 6;
            }
            if (field627 == 6 && Statics.field172.method1394() > 0) {
                int var11 = Statics.field172.method1403();
                if (var11 == 21 && field466 == 20) {
                    field627 = 7;
                } else if (var11 == 2) {
                    field627 = 9;
                } else if (var11 == 15 && field466 == 40) {
                    field694.field2033 = 0;
                    field468.field2033 = 0;
                    field502 = -1;
                    field506 = -1;
                    field478 = -1;
                    field508 = -1;
                    field678 = 0;
                    field503 = 0;
                    field567 = 0;
                    field602 = 0;
                    field535 = false;
                    field580 = 0;
                    field691 = 0;
                    for (int var12 = 0; var12 < field499.length; var12++) {
                        if (field499[var12] != null) {
                            field499[var12].field419 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field495.length; var13++) {
                        if (field495[var13] != null) {
                            field495[var13].field419 = -1;
                        }
                    }
                    class19.method155();
                    method766(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field662[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field493 < 1) {
                    field493++;
                    field627 = 0;
                } else {
                    method3172(var11);
                    return;
                }
            }
            if (field627 == 7 && Statics.field172.method1394() > 0) {
                field574 = (Statics.field172.method1403() + 3) * 60;
                field627 = 8;
            }
            if (field627 == 8) {
                field507 = 0;
                class21.method147(class135.field2121, class135.field2267, field574 / 60 + class135.field2173);
                if (--field574 <= 0) {
                    field627 = 0;
                }
            } else {
                if (field627 == 9 && Statics.field172.method1394() >= 8) {
                    field626 = Statics.field172.method1403();
                    field553 = Statics.field172.method1403() == 1;
                    field585 = Statics.field172.method1403();
                    field585 <<= 0x8;
                    field585 += Statics.field172.method1403();
                    field491 = Statics.field172.method1403();
                    Statics.field172.method1410(field468.field2030, 0, 1);
                    field468.field2033 = 0;
                    field502 = field468.method2315();
                    Statics.field172.method1410(field468.field2030, 0, 2);
                    field468.field2033 = 0;
                    field678 = field468.method2460();
                    if (field491 == 1) {
                        try {
                            class67.method1387(Statics.field456, "zap");
                        } catch (Throwable var19) {
                        }
                    } else {
                        try {
                            class67.method1387(Statics.field456, "unzap");
                        } catch (Throwable var18) {
                        }
                    }
                    field627 = 10;
                }
                if (field627 != 10) {
                    field507++;
                    if (field507 > 2000) {
                        if (field493 < 1) {
                            if (Statics.field736 == Statics.field266) {
                                Statics.field736 = Statics.field278;
                            } else {
                                Statics.field736 = Statics.field266;
                            }
                            field493++;
                            field627 = 0;
                        } else {
                            method3172(-3);
                        }
                    }
                } else if (Statics.field172.method1394() >= field678) {
                    field468.field2033 = 0;
                    Statics.field172.method1410(field468.field2030, 0, field678);
                    method2891();
                    Statics.field1650 = -1;
                    method2900(false);
                    field502 = -1;
                }
            }
        } catch (IOException var21) {
            if (field493 < 1) {
                if (Statics.field736 == Statics.field266) {
                    Statics.field736 = Statics.field278;
                } else {
                    Statics.field736 = Statics.field266;
                }
                field493++;
                field627 = 0;
            } else {
                method3172(-2);
            }
        }
    }

    @ObfuscatedName("er.m(I)V")
    public static void method2891() {
        field469 = -1L;
        field472 = -1;
        Statics.field256.field240 = 0;
        Statics.field1017 = true;
        field494 = true;
        field683 = -1L;
        class182.method3040();
        field694.field2033 = 0;
        field468.field2033 = 0;
        field502 = -1;
        field506 = -1;
        field478 = -1;
        field508 = -1;
        field503 = 0;
        field567 = 0;
        field505 = 0;
        field476 = 0;
        field602 = 0;
        field535 = false;
        class77.field1372 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field623[var0] = null;
        }
        field695 = 0;
        field631 = 0;
        field615 = false;
        field521 = 0;
        field518 = (int) (Math.random() * 100.0D) - 50;
        field524 = (int) (Math.random() * 110.0D) - 55;
        field526 = (int) (Math.random() * 80.0D) - 40;
        field473 = (int) (Math.random() * 120.0D) - 60;
        field616 = (int) (Math.random() * 30.0D) - 20;
        field544 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field580 = 0;
        field686 = -1;
        field691 = 0;
        field480 = 0;
        field483 = 0;
        field496 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field499[var1] = null;
            field555[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field495[var2] = null;
        }
        Statics.field1424 = field499[2047] = new class3();
        field595.method3336();
        field647.method3336();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field645[var3][var4][var5] = null;
                }
            }
        }
        field674 = new class177();
        field607 = 0;
        field711 = 0;
        field715 = 0;
        for (int var6 = 0; var6 < Statics.field1267; var6++) {
            class42 var7 = class42.method111(var6);
            if (var7 != null && var7.field1021 == 0) {
                class160.field2716[var6] = 0;
                class160.field2717[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field653.length; var8++) {
            field653[var8] = -1;
        }
        if (field619 != -1) {
            int var9 = field619;
            if (var9 != -1 && Statics.field2588[var9]) {
                Statics.field2711.method3057(var9);
                if (Statics.field2693[var9] != null) {
                    boolean var10 = true;
                    for (int var11 = 0; var11 < Statics.field2693[var9].length; var11++) {
                        if (Statics.field2693[var9][var11] != null) {
                            if (Statics.field2693[var9][var11].field2600 == 2) {
                                var10 = false;
                            } else {
                                Statics.field2693[var9][var11] = null;
                            }
                        }
                    }
                    if (var10) {
                        Statics.field2693[var9] = null;
                    }
                    Statics.field2588[var9] = false;
                }
            }
        }
        for (class4 var12 = (class4) field620.method3315(); var12 != null; var12 = (class4) field620.method3316()) {
            method2218(var12, true);
        }
        field619 = -1;
        field620 = new class175(8);
        field712 = null;
        field535 = false;
        field602 = 0;
        field717.method3228((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var13 = 0; var13 < 8; var13++) {
            field590[var13] = null;
            field591[var13] = false;
        }
        class19.method155();
        field467 = true;
        for (int var14 = 0; var14 < 100; var14++) {
            field662[var14] = true;
        }
        field684 = null;
        Statics.field244 = 0;
        Statics.field1280 = null;
    }

    @ObfuscatedName("fn.z(II)V")
    public static void method3172(int arg0) {
        if (arg0 == -3) {
            class21.method147(class135.field2124, class135.field2125, class135.field2188);
        } else if (arg0 == -2) {
            class21.method147(class135.field2127, class135.field2128, class135.field2129);
        } else if (arg0 == -1) {
            class21.method147(class135.field2130, class135.field2277, class135.field2132);
        } else if (arg0 == 3) {
            class21.method147(class135.field2133, class135.field2134, class135.field2135);
        } else if (arg0 == 4) {
            class21.method147(class135.field2136, class135.field2137, class135.field2138);
        } else if (arg0 == 5) {
            class21.method147(class135.field2170, class135.field2140, class135.field2281);
        } else if (arg0 == 6) {
            class21.method147(class135.field2142, class135.field2143, class135.field2308);
        } else if (arg0 == 7) {
            class21.method147(class135.field2209, class135.field2146, class135.field2091);
        } else if (arg0 == 8) {
            class21.method147(class135.field2148, class135.field2149, class135.field2150);
        } else if (arg0 == 9) {
            class21.method147(class135.field2245, class135.field2159, class135.field2153);
        } else if (arg0 == 10) {
            class21.method147(class135.field2314, class135.field2155, class135.field2275);
        } else if (arg0 == 11) {
            class21.method147(class135.field2157, class135.field2158, class135.field2257);
        } else if (arg0 == 12) {
            class21.method147(class135.field2131, class135.field2193, class135.field2162);
        } else if (arg0 == 13) {
            class21.method147(class135.field2163, class135.field2164, class135.field2165);
        } else if (arg0 == 14) {
            class21.method147(class135.field2166, class135.field2272, class135.field2203);
        } else if (arg0 == 16) {
            class21.method147(class135.field2152, class135.field2099, class135.field2325);
        } else if (arg0 == 17) {
            class21.method147(class135.field2161, class135.field2156, class135.field2196);
        } else if (arg0 == 18) {
            class21.method147(class135.field2175, class135.field2176, class135.field2172);
        } else if (arg0 == 19) {
            class21.method147(class135.field2178, class135.field2204, class135.field2264);
        } else if (arg0 == 20) {
            class21.method147(class135.field2181, class135.field2182, class135.field2183);
        } else if (arg0 == 22) {
            class21.method147(class135.field2184, class135.field2185, class135.field2186);
        } else if (arg0 == 23) {
            class21.method147(class135.field2122, class135.field2227, class135.field2189);
        } else if (arg0 == 24) {
            class21.method147(class135.field2190, class135.field2302, class135.field2192);
        } else if (arg0 == 25) {
            class21.method147(class135.field2126, class135.field2246, class135.field2195);
        } else if (arg0 == 26) {
            class21.method147(class135.field2318, class135.field2197, class135.field2198);
        } else if (arg0 == 27) {
            class21.method147(class135.field2199, class135.field2141, class135.field2151);
        } else if (arg0 == 31) {
            class21.method147(class135.field2180, class135.field2283, class135.field2210);
        } else if (arg0 == 32) {
            class21.method147(class135.field2286, class135.field2212, class135.field2213);
        } else if (arg0 == 37) {
            class21.method147(class135.field2214, class135.field2215, class135.field2216);
        } else if (arg0 == 38) {
            class21.method147(class135.field2217, class135.field2218, class135.field2219);
        } else if (arg0 == 55) {
            class21.method147(class135.field2220, class135.field2312, class135.field2265);
        } else {
            class21.method147(class135.field2223, class135.field2224, class135.field2225);
        }
        method766(10);
    }

    @ObfuscatedName("db.w(I)V")
    public static final void method2352() {
        if (Statics.field172 != null) {
            Statics.field172.method1397();
            Statics.field172 = null;
        }
        method774();
        Statics.field199.method2044();
        for (int var0 = 0; var0 < 4; var0++) {
            field680[var0].method2720();
        }
        System.gc();
        class139.method2345(2);
        field548 = -1;
        field664 = false;
        class7.method1559();
        method766(10);
    }

    @ObfuscatedName("at.h(I)V")
    public static final void method774() {
        class37.field938.method3271();
        class33.method1378();
        class36.field919.method3271();
        Statics.method624();
        class31.method1602();
        class40.field994.method3271();
        class40.field970.method3271();
        class40.field971.method3271();
        class34.field872.method3271();
        class34.field873.method3271();
        class35.method200();
        class38.field944.method3271();
        class42.method178();
        class164.field2741.method3271();
        class159.method574();
        ((class110) Statics.field1771).method2225();
        class5.field72.method3271();
        Statics.field102.method3032();
        Statics.field262.method3032();
        Statics.field1413.method3032();
        Statics.field488.method3032();
        Statics.field2453.method3032();
        Statics.field2871.method3032();
        Statics.field2832.method3032();
        Statics.field130.method3032();
        Statics.field250.method3032();
        Statics.field189.method3032();
        Statics.field345.method3032();
        Statics.field198.method3032();
    }

    @ObfuscatedName("bl.y(B)V")
    public static final void method1428() {
        if (field505 > 0) {
            method2352();
        } else {
            method766(40);
            Statics.field1999 = Statics.field172;
            Statics.field172 = null;
        }
    }

    @ObfuscatedName("ai.x(I)V")
    public static final void method608() {
        if (field567 > 1) {
            field567--;
        }
        if (field505 > 0) {
            field505--;
        }
        if (field509) {
            field509 = false;
            method1428();
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field172 == null) {
                var1 = false;
            } else {
                label2845: {
                    try {
                        int var2 = Statics.field172.method1394();
                        if (var2 == 0) {
                            var1 = false;
                            break label2845;
                        }
                        if (field502 == -1) {
                            Statics.field172.method1410(field468.field2030, 0, 1);
                            field468.field2033 = 0;
                            field502 = field468.method2315();
                            field678 = class165.field2772[field502];
                            var2--;
                        }
                        if (field678 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2845;
                            }
                            Statics.field172.method1410(field468.field2030, 0, 1);
                            field678 = field468.field2030[0] & 0xFF;
                            var2--;
                        }
                        if (field678 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2845;
                            }
                            Statics.field172.method1410(field468.field2030, 0, 2);
                            field468.field2033 = 0;
                            field678 = field468.method2460();
                            var2 -= 2;
                        }
                        if (var2 < field678) {
                            var1 = false;
                            break label2845;
                        }
                        field468.field2033 = 0;
                        Statics.field172.method1410(field468.field2030, 0, field678);
                        field503 = 0;
                        field508 = field478;
                        field478 = field506;
                        field506 = field502;
                        if (field502 == 67) {
                            Statics.field1013 = field468.method2647();
                            Statics.field2088 = field468.method2647();
                            while (field468.field2033 < field678) {
                                field502 = field468.method2458();
                                method33();
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 12) {
                            int var3 = field468.method2461();
                            int var4 = field468.method2500();
                            int var5 = field468.method2493();
                            class159 var6 = class159.method2754(var4);
                            int var7 = var6.field2605 + var3;
                            int var8 = var6.field2629 + var5;
                            if (var6.field2667 != var7 || var6.field2668 != var8) {
                                var6.field2667 = var7;
                                var6.field2668 = var8;
                                method640(var6);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 216) {
                            String var9 = field468.method2636();
                            long var10 = (long) field468.method2460();
                            long var12 = (long) field468.method2554();
                            int var14 = field468.method2458();
                            long var15 = (var10 << 32) + var12;
                            boolean var17 = false;
                            for (int var18 = 0; var18 < 100; var18++) {
                                if (field561[var18] == var15) {
                                    var17 = true;
                                    break;
                                }
                            }
                            if (method1401(var9)) {
                                var17 = true;
                            }
                            if (!var17 && field578 == 0) {
                                field561[field679] = var15;
                                field679 = (field679 + 1) % 100;
                                class116 var19 = field468;
                                String var20 = class184.method2382(var19, 32767);
                                String var21 = class185.method3403(class148.method2306(var20));
                                if (var14 == 2 || var14 == 3) {
                                    method731(7, class2.method692(1) + var9, var21);
                                } else if (var14 == 1) {
                                    method731(7, class2.method692(0) + var9, var21);
                                } else {
                                    method731(3, var9, var21);
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 59) {
                            while (field468.field2033 < field678) {
                                boolean var22 = field468.method2458() == 1;
                                String var23 = field468.method2636();
                                String var24 = field468.method2636();
                                int var25 = field468.method2460();
                                int var26 = field468.method2458();
                                int var27 = field468.method2458();
                                boolean var28 = (var27 & 0x2) != 0;
                                boolean var29 = (var27 & 0x1) != 0;
                                if (var25 > 0) {
                                    field468.method2636();
                                    field468.method2458();
                                    field468.method2463();
                                }
                                field468.method2636();
                                for (int var30 = 0; var30 < field711; var30++) {
                                    class23 var31 = field713[var30];
                                    if (var22) {
                                        if (var24.equals(var31.field350)) {
                                            var31.field350 = var23;
                                            var31.field349 = var24;
                                            var23 = null;
                                            break;
                                        }
                                    } else if (var23.equals(var31.field350)) {
                                        if (var31.field352 != var25) {
                                            boolean var32 = true;
                                            for (class28 var33 = (class28) field714.method3298(); var33 != null; var33 = (class28) field714.method3299()) {
                                                if (var33.field726.equals(var23)) {
                                                    if (var25 != 0 && var33.field730 == 0) {
                                                        var33.method3365();
                                                        var32 = false;
                                                    } else if (var25 == 0 && var33.field730 != 0) {
                                                        var33.method3365();
                                                        var32 = false;
                                                    }
                                                }
                                            }
                                            if (var32) {
                                                field714.method3297(new class28(var23, var25));
                                            }
                                            var31.field352 = var25;
                                        }
                                        var31.field349 = var24;
                                        var31.field351 = var26;
                                        var31.field348 = var28;
                                        var31.field353 = var29;
                                        var23 = null;
                                        break;
                                    }
                                }
                                if (var23 != null && field711 < 400) {
                                    class23 var34 = new class23();
                                    field713[field711] = var34;
                                    var34.field350 = var23;
                                    var34.field349 = var24;
                                    var34.field352 = var25;
                                    var34.field351 = var26;
                                    var34.field348 = var28;
                                    var34.field353 = var29;
                                    field711++;
                                }
                            }
                            field607 = 2;
                            field685 = field642;
                            boolean var35 = false;
                            int var36 = field711;
                            while (var36 > 0) {
                                boolean var37 = true;
                                var36--;
                                for (int var38 = 0; var38 < var36; var38++) {
                                    boolean var39 = false;
                                    class23 var40 = field713[var38];
                                    class23 var41 = field713[var38 + 1];
                                    if (field638 != var40.field352 && field638 == var41.field352) {
                                        var39 = true;
                                    }
                                    if (!var39 && var40.field352 == 0 && var41.field352 != 0) {
                                        var39 = true;
                                    }
                                    if (!var39 && !var40.field348 && var41.field348) {
                                        var39 = true;
                                    }
                                    if (!var39 && !var40.field353 && var41.field353) {
                                        var39 = true;
                                    }
                                    if (var39) {
                                        class23 var42 = field713[var38];
                                        field713[var38] = field713[var38 + 1];
                                        field713[var38 + 1] = var42;
                                        var37 = false;
                                    }
                                }
                                if (var37) {
                                    break;
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 99) {
                            int var43 = field468.method2525();
                            class159 var44 = class159.method2754(var43);
                            for (int var45 = 0; var45 < var44.field2700.length; var45++) {
                                var44.field2700[var45] = -1;
                                var44.field2700[var45] = 0;
                            }
                            method640(var44);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 61) {
                            int var46 = field468.method2463();
                            int var47 = field468.method2500();
                            int var48 = field468.method2491();
                            if (var48 == 65535) {
                                var48 = -1;
                            }
                            class159 var49 = class159.method2754(var46);
                            if (var49.field2597) {
                                var49.field2702 = var48;
                                var49.field2703 = var47;
                                class40 var51 = class40.method1433(var48);
                                var49.field2638 = var51.field983;
                                var49.field2639 = var51.field981;
                                var49.field2640 = var51.field1003;
                                var49.field2636 = var51.field1012;
                                var49.field2637 = var51.field984;
                                var49.field2641 = var51.field979;
                                if (var49.field2607 > 0) {
                                    var49.field2641 = var49.field2641 * 32 / var49.field2607;
                                }
                                method640(var49);
                            } else {
                                if (var48 == -1) {
                                    var49.field2610 = 0;
                                    field502 = -1;
                                    var1 = true;
                                    break label2845;
                                }
                                class40 var50 = class40.method1433(var48);
                                var49.field2610 = 4;
                                var49.field2631 = var48;
                                var49.field2638 = var50.field983;
                                var49.field2639 = var50.field981;
                                var49.field2641 = var50.field979 * 100 / var47;
                                method640(var49);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 22) {
                            if (field619 != -1) {
                                int var52 = field619;
                                if (class159.method239(var52)) {
                                    method144(Statics.field2693[var52], 0);
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 169) {
                            int var53 = field468.method2491();
                            byte var54 = field468.method2486();
                            class160.field2716[var53] = var54;
                            if (class160.field2717[var53] != var54) {
                                class160.field2717[var53] = var54;
                                method5(var53);
                            }
                            field643[++field644 - 1 & 0x1F] = var53;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 195) {
                            class116 var55 = field468;
                            int var56 = field678;
                            class181 var57 = new class181();
                            var57.field2818 = var55.method2458();
                            var57.field2822 = var55.method2463();
                            var57.field2819 = new int[var57.field2818];
                            var57.field2820 = new int[var57.field2818];
                            var57.field2821 = new Field[var57.field2818];
                            var57.field2826 = new int[var57.field2818];
                            var57.field2823 = new Method[var57.field2818];
                            var57.field2824 = new byte[var57.field2818][][];
                            for (int var58 = 0; var58 < var57.field2818; var58++) {
                                try {
                                    int var59 = var55.method2458();
                                    if (var59 == 0 || var59 == 1 || var59 == 2) {
                                        String var60 = new String(var55.method2636());
                                        String var61 = new String(var55.method2636());
                                        int var62 = 0;
                                        if (var59 == 1) {
                                            var62 = var55.method2463();
                                        }
                                        var57.field2819[var58] = var59;
                                        var57.field2826[var58] = var62;
                                        var57.field2821[var58] = class182.method2726(var60).getDeclaredField(var61);
                                    } else if (var59 == 3 || var59 == 4) {
                                        String var63 = new String(var55.method2636());
                                        String var64 = new String(var55.method2636());
                                        int var65 = var55.method2458();
                                        String[] var66 = new String[var65];
                                        for (int var67 = 0; var67 < var65; var67++) {
                                            var66[var67] = new String(var55.method2636());
                                        }
                                        byte[][] var68 = new byte[var65][];
                                        if (var59 == 3) {
                                            for (int var69 = 0; var69 < var65; var69++) {
                                                int var70 = var55.method2463();
                                                var68[var69] = new byte[var70];
                                                var55.method2609(var68[var69], 0, var70);
                                            }
                                        }
                                        var57.field2819[var58] = var59;
                                        Class[] var71 = new Class[var65];
                                        for (int var72 = 0; var72 < var65; var72++) {
                                            var71[var72] = class182.method2726(var66[var72]);
                                        }
                                        var57.field2823[var58] = class182.method2726(var63).getDeclaredMethod(var64, var71);
                                        var57.field2824[var58] = var68;
                                    }
                                } catch (ClassNotFoundException var424) {
                                    var57.field2820[var58] = -1;
                                } catch (SecurityException var425) {
                                    var57.field2820[var58] = -2;
                                } catch (NullPointerException var426) {
                                    var57.field2820[var58] = -3;
                                } catch (Exception var427) {
                                    var57.field2820[var58] = -4;
                                } catch (Throwable var428) {
                                    var57.field2820[var58] = -5;
                                }
                            }
                            class182.field2829.method3333(var57);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 175) {
                            field468.field2033 += 28;
                            if (field468.method2478()) {
                                class116 var78 = field468;
                                int var79 = field468.field2033 - 28;
                                if (class82.field1418 != null) {
                                    try {
                                        class82.field1418.method591(0L);
                                        class82.field1418.method585(var78.field2030, var79, 24);
                                    } catch (Exception var422) {
                                    }
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 134) {
                            method791();
                            field474 = field468.method2461();
                            field652 = field642;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 127) {
                            int var81 = field468.method2500();
                            int var82 = field468.method2539();
                            class159 var83 = class159.method2754(var81);
                            if (var83.field2610 != 1 || var83.field2631 != var82) {
                                var83.field2610 = 1;
                                var83.field2631 = var82;
                                method640(var83);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 106) {
                            String var84 = field468.method2636();
                            class116 var85 = field468;
                            String var86 = class184.method2382(var85, 32767);
                            String var87 = class185.method3403(class148.method2306(var86));
                            method731(6, var84, var87);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 238) {
                            int var88 = field468.method2500();
                            Statics.field2008 = Statics.field1214.method1532(var88);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 249) {
                            String var89 = field468.method2636();
                            if (var89.endsWith(":tradereq:")) {
                                String var90 = var89.substring(0, var89.indexOf(":"));
                                boolean var91 = false;
                                if (method1401(var90)) {
                                    var91 = true;
                                }
                                if (!var91 && field578 == 0) {
                                    method731(4, var90, class135.field2226);
                                }
                            } else if (var89.endsWith(":duelreq:")) {
                                String var92 = var89.substring(0, var89.indexOf(":"));
                                boolean var93 = false;
                                if (method1401(var92)) {
                                    var93 = true;
                                }
                                if (!var93 && field578 == 0) {
                                    method731(8, var92, class135.field2316);
                                }
                            } else if (var89.endsWith(":chalreq:")) {
                                String var94 = var89.substring(0, var89.indexOf(":"));
                                boolean var95 = false;
                                if (method1401(var94)) {
                                    var95 = true;
                                }
                                if (!var95 && field578 == 0) {
                                    String var96 = var89.substring(var89.indexOf(":") + 1, var89.length() - 9);
                                    method731(8, var94, var96);
                                }
                            } else if (var89.endsWith(":assistreq:")) {
                                String var97 = var89.substring(0, var89.indexOf(":"));
                                boolean var98 = false;
                                if (method1401(var97)) {
                                    var98 = true;
                                }
                                if (!var98 && field578 == 0) {
                                    method731(10, var97, "");
                                }
                            } else if (var89.endsWith(":clan:")) {
                                String var99 = var89.substring(0, var89.indexOf(":clan:"));
                                method731(11, "", var99);
                            } else if (var89.endsWith(":trade:")) {
                                String var100 = var89.substring(0, var89.indexOf(":trade:"));
                                if (field578 == 0) {
                                    method731(12, "", var100);
                                }
                            } else if (var89.endsWith(":assist:")) {
                                String var101 = var89.substring(0, var89.indexOf(":assist:"));
                                if (field578 == 0) {
                                    method731(13, "", var101);
                                }
                            } else {
                                method731(0, "", var89);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 55) {
                            method2352();
                            field502 = -1;
                            var1 = false;
                            break label2845;
                        }
                        if (field502 == 129) {
                            int var102 = field468.method2458();
                            int var103 = field468.method2458();
                            int var104 = field468.method2458();
                            int var105 = field468.method2458();
                            field706[var102] = true;
                            field579[var102] = var103;
                            field692[var102] = var104;
                            field709[var102] = var105;
                            field710[var102] = 0;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 73) {
                            int var106 = field468.method2501();
                            int var107 = field468.method2491();
                            class159 var108 = class159.method2754(var106);
                            if (var108.field2610 != 2 || var108.field2631 != var107) {
                                var108.field2610 = 2;
                                var108.field2631 = var107;
                                method640(var108);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 25) {
                            field660 = field468.method2458();
                            field542 = field468.method2458();
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 214) {
                            field658 = 0;
                            field677 = 0;
                            method2343();
                            int var109 = field468.method2319(8);
                            if (var109 < field483) {
                                for (int var110 = var109; var110 < field483; var110++) {
                                    field588[++field658 - 1] = field514[var110];
                                }
                            }
                            if (var109 > field483) {
                                throw new RuntimeException("");
                            }
                            field483 = 0;
                            for (int var111 = 0; var111 < var109; var111++) {
                                int var112 = field514[var111];
                                class3 var113 = field499[var112];
                                int var114 = field468.method2319(1);
                                if (var114 == 0) {
                                    field514[++field483 - 1] = var112;
                                    var113.field442 = field484;
                                } else {
                                    int var115 = field468.method2319(2);
                                    if (var115 == 0) {
                                        field514[++field483 - 1] = var112;
                                        var113.field442 = field484;
                                        field583[++field677 - 1] = var112;
                                    } else if (var115 == 1) {
                                        field514[++field483 - 1] = var112;
                                        var113.field442 = field484;
                                        int var116 = field468.method2319(3);
                                        var113.method243(var116, false);
                                        int var117 = field468.method2319(1);
                                        if (var117 == 1) {
                                            field583[++field677 - 1] = var112;
                                        }
                                    } else if (var115 == 2) {
                                        field514[++field483 - 1] = var112;
                                        var113.field442 = field484;
                                        int var118 = field468.method2319(3);
                                        var113.method243(var118, true);
                                        int var119 = field468.method2319(3);
                                        var113.method243(var119, true);
                                        int var120 = field468.method2319(1);
                                        if (var120 == 1) {
                                            field583[++field677 - 1] = var112;
                                        }
                                    } else if (var115 == 3) {
                                        field588[++field658 - 1] = var112;
                                    }
                                }
                            }
                            method171();
                            method1564();
                            for (int var121 = 0; var121 < field658; var121++) {
                                int var122 = field588[var121];
                                if (field484 != field499[var122].field442) {
                                    field499[var122] = null;
                                }
                            }
                            if (field678 != field468.field2033) {
                                throw new RuntimeException(field468.field2033 + class2.field17 + field678);
                            }
                            for (int var123 = 0; var123 < field483; var123++) {
                                if (field499[field514[var123]] == null) {
                                    throw new RuntimeException(var123 + class2.field17 + field483);
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 232) {
                            field580 = field468.method2458();
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 63) {
                            while (field468.field2033 < field678) {
                                int var124 = field468.method2458();
                                boolean var125 = (var124 & 0x1) == 1;
                                String var126 = field468.method2636();
                                String var127 = field468.method2636();
                                field468.method2636();
                                for (int var128 = 0; var128 < field715; var128++) {
                                    class11 var129 = field716[var128];
                                    if (var125) {
                                        if (var127.equals(var129.field174)) {
                                            var129.field174 = var126;
                                            var129.field168 = var127;
                                            var126 = null;
                                            break;
                                        }
                                    } else if (var126.equals(var129.field174)) {
                                        var129.field174 = var126;
                                        var129.field168 = var127;
                                        var126 = null;
                                        break;
                                    }
                                }
                                if (var126 != null && field715 < 400) {
                                    class11 var130 = new class11();
                                    field716[field715] = var130;
                                    var130.field174 = var126;
                                    var130.field168 = var127;
                                    field715++;
                                }
                            }
                            field685 = field642;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 6) {
                            String var131 = field468.method2636();
                            int var132 = field468.method2525();
                            class159 var133 = class159.method2754(var132);
                            if (!var131.equals(var133.field2645)) {
                                var133.field2645 = var131;
                                method640(var133);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 79) {
                            int var134 = field468.method2463();
                            int var135 = field468.method2460();
                            if (var134 < -70000) {
                                var135 += 32768;
                            }
                            class159 var136;
                            if (var134 >= 0) {
                                var136 = class159.method2754(var134);
                            } else {
                                var136 = null;
                            }
                            if (var136 != null) {
                                for (int var137 = 0; var137 < var136.field2700.length; var137++) {
                                    var136.field2700[var137] = 0;
                                    var136.field2701[var137] = 0;
                                }
                            }
                            class19.method220(var135);
                            int var138 = field468.method2460();
                            for (int var139 = 0; var139 < var138; var139++) {
                                int var140 = field468.method2492();
                                int var141 = field468.method2481();
                                if (var141 == 255) {
                                    var141 = field468.method2501();
                                }
                                if (var136 != null && var139 < var136.field2700.length) {
                                    var136.field2700[var139] = var140;
                                    var136.field2701[var139] = var141;
                                }
                                class19.method817(var135, var139, var140 - 1, var141);
                            }
                            if (var136 != null) {
                                method640(var136);
                            }
                            method791();
                            field671[++field646 - 1 & 0x1F] = var135 & 0x7FFF;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 187) {
                            int var142 = field468.method2539();
                            field619 = var142;
                            if (class159.method239(var142)) {
                                class159[] var143 = Statics.field2693[var142];
                                for (int var144 = 0; var144 < var143.length; var144++) {
                                    class159 var145 = var143[var144];
                                    if (var145 != null) {
                                        var145.field2591 = 0;
                                        var145.field2628 = 0;
                                    }
                                }
                            }
                            class26.method2365(field619);
                            for (int var146 = 0; var146 < 100; var146++) {
                                field662[var146] = true;
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 53) {
                            int var147 = field468.method2458();
                            class138[] var148 = class138.method1652();
                            int var149 = 0;
                            class138 var151;
                            while (true) {
                                if (var149 >= var148.length) {
                                    var151 = null;
                                    break;
                                }
                                class138 var150 = var148[var149];
                                if (var150.field2343 == var147) {
                                    var151 = var150;
                                    break;
                                }
                                var149++;
                            }
                            Statics.field133 = var151;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 23) {
                            String var152 = field468.method2636();
                            Object[] var153 = new Object[var152.length() + 1];
                            for (int var154 = var152.length() - 1; var154 >= 0; var154--) {
                                if (var152.charAt(var154) == 's') {
                                    var153[var154 + 1] = field468.method2636();
                                } else {
                                    var153[var154 + 1] = Integer.valueOf(field468.method2463());
                                }
                            }
                            var153[0] = Integer.valueOf(field468.method2463());
                            class1 var155 = new class1();
                            var155.field8 = var153;
                            class26.method2441(var155);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 250) {
                            int var156 = field468.method2539();
                            int var157 = field468.method2525();
                            class160.field2716[var156] = var157;
                            if (class160.field2717[var156] != var157) {
                                class160.field2717[var156] = var157;
                                method5(var156);
                            }
                            field643[++field644 - 1 & 0x1F] = var156;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 205) {
                            int var158 = field678 + field468.field2033;
                            int var159 = field468.method2460();
                            int var160 = field468.method2460();
                            if (field619 != var159) {
                                field619 = var159;
                                int var161 = field619;
                                if (class159.method239(var161)) {
                                    class159[] var162 = Statics.field2693[var161];
                                    for (int var163 = 0; var163 < var162.length; var163++) {
                                        class159 var164 = var162[var163];
                                        if (var164 != null) {
                                            var164.field2591 = 0;
                                            var164.field2628 = 0;
                                        }
                                    }
                                }
                                class26.method2365(field619);
                                for (int var165 = 0; var165 < 100; var165++) {
                                    field662[var165] = true;
                                }
                            }
                            while (var160-- > 0) {
                                int var166 = field468.method2463();
                                int var167 = field468.method2460();
                                int var168 = field468.method2458();
                                class4 var169 = (class4) field620.method3312((long) var166);
                                if (var169 != null && var169.field64 != var167) {
                                    method2218(var169, true);
                                    var169 = null;
                                }
                                if (var169 == null) {
                                    var169 = method126(var166, var167, var168);
                                }
                                var169.field59 = true;
                            }
                            for (class4 var170 = (class4) field620.method3315(); var170 != null; var170 = (class4) field620.method3316()) {
                                if (var170.field59) {
                                    var170.field59 = false;
                                } else {
                                    method2218(var170, true);
                                }
                            }
                            field659 = new class175(512);
                            while (field468.field2033 < var158) {
                                int var171 = field468.method2463();
                                int var172 = field468.method2460();
                                int var173 = field468.method2460();
                                int var174 = field468.method2463();
                                for (int var175 = var172; var175 <= var173; var175++) {
                                    long var176 = ((long) var171 << 32) + (long) var175;
                                    field659.method3329(new class171(var174), var176);
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 160) {
                            field705 = false;
                            for (int var178 = 0; var178 < 5; var178++) {
                                field706[var178] = false;
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 174) {
                            Statics.field2088 = field468.method2590();
                            Statics.field1013 = field468.method2481();
                            for (int var179 = Statics.field1013; var179 < Statics.field1013 + 8; var179++) {
                                for (int var180 = Statics.field2088; var180 < Statics.field2088 + 8; var180++) {
                                    if (field645[Statics.field363][var179][var180] != null) {
                                        field645[Statics.field363][var179][var180] = null;
                                        method29(var179, var180);
                                    }
                                }
                            }
                            for (class22 var181 = (class22) field674.method3362(); var181 != null; var181 = (class22) field674.method3350()) {
                                if (var181.field342 >= Statics.field1013 && var181.field342 < Statics.field1013 + 8 && var181.field333 >= Statics.field2088 && var181.field333 < Statics.field2088 + 8 && Statics.field363 == var181.field334) {
                                    var181.field332 = 0;
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 165) {
                            Statics.field1013 = field468.method2458();
                            Statics.field2088 = field468.method2590();
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 212) {
                            method791();
                            field624 = field468.method2458();
                            field652 = field642;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 10) {
                            method2900(true);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 75) {
                            int var182 = field468.method2539();
                            if (var182 == 65535) {
                                var182 = -1;
                            }
                            method2219(var182);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 9) {
                            int var183 = field468.method2460();
                            if (var183 == 65535) {
                                var183 = -1;
                            }
                            int var184 = field468.method2495();
                            method2427(var183, var184);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 85) {
                            field651 = field642;
                            if (field678 == 0) {
                                field684 = null;
                                field708 = null;
                                Statics.field244 = 0;
                                Statics.field1280 = null;
                                field502 = -1;
                                var1 = true;
                            } else {
                                field708 = field468.method2636();
                                long var185 = field468.method2464();
                                field684 = class147.method39(var185);
                                Statics.field31 = field468.method2459();
                                int var187 = field468.method2458();
                                if (var187 == 255) {
                                    field502 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field244 = var187;
                                    class8[] var188 = new class8[100];
                                    for (int var189 = 0; var189 < Statics.field244; var189++) {
                                        var188[var189] = new class8();
                                        var188[var189].field108 = field468.method2636();
                                        var188[var189].field105 = class149.method2738(var188[var189].field108, Statics.field2474);
                                        var188[var189].field104 = field468.method2460();
                                        var188[var189].field110 = field468.method2459();
                                        field468.method2636();
                                        if (var188[var189].field108.equals(Statics.field1424.field45)) {
                                            Statics.field1251 = var188[var189].field110;
                                        }
                                    }
                                    boolean var190 = false;
                                    int var191 = Statics.field244;
                                    while (var191 > 0) {
                                        boolean var192 = true;
                                        var191--;
                                        for (int var193 = 0; var193 < var191; var193++) {
                                            if (var188[var193].field105.compareTo(var188[var193 + 1].field105) > 0) {
                                                class8 var194 = var188[var193];
                                                var188[var193] = var188[var193 + 1];
                                                var188[var193 + 1] = var194;
                                                var192 = false;
                                            }
                                        }
                                        if (var192) {
                                            break;
                                        }
                                    }
                                    Statics.field1280 = var188;
                                    field502 = -1;
                                    var1 = true;
                                }
                            }
                            break label2845;
                        }
                        if (field502 == 19) {
                            String var195 = field468.method2636();
                            long var196 = field468.method2464();
                            long var198 = (long) field468.method2460();
                            long var200 = (long) field468.method2554();
                            int var202 = field468.method2458();
                            long var203 = (var198 << 32) + var200;
                            boolean var205 = false;
                            for (int var206 = 0; var206 < 100; var206++) {
                                if (field561[var206] == var203) {
                                    var205 = true;
                                    break;
                                }
                            }
                            if (var202 <= 1 && method1401(var195)) {
                                var205 = true;
                            }
                            if (!var205 && field578 == 0) {
                                field561[field679] = var203;
                                field679 = (field679 + 1) % 100;
                                class116 var207 = field468;
                                String var208 = class184.method2382(var207, 32767);
                                String var209 = class185.method3403(class148.method2306(var208));
                                if (var202 == 2 || var202 == 3) {
                                    method225(9, class2.method692(1) + var195, var209, class147.method2739(var196));
                                } else if (var202 == 1) {
                                    method225(9, class2.method692(0) + var195, var209, class147.method2739(var196));
                                } else {
                                    method225(9, var195, var209, class147.method2739(var196));
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 227) {
                            method2900(false);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 154) {
                            field567 = field468.method2460() * 30;
                            field652 = field642;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 95) {
                            field476 = field468.method2458();
                            if (field476 == 1) {
                                field477 = field468.method2460();
                            }
                            if (field476 >= 2 && field476 <= 6) {
                                if (field476 == 2) {
                                    field482 = 64;
                                    field630 = 64;
                                }
                                if (field476 == 3) {
                                    field482 = 0;
                                    field630 = 64;
                                }
                                if (field476 == 4) {
                                    field482 = 128;
                                    field630 = 64;
                                }
                                if (field476 == 5) {
                                    field482 = 64;
                                    field630 = 0;
                                }
                                if (field476 == 6) {
                                    field482 = 64;
                                    field630 = 128;
                                }
                                field476 = 2;
                                field479 = field468.method2460();
                                field693 = field468.method2460();
                                field481 = field468.method2458();
                            }
                            if (field476 == 10) {
                                field498 = field468.method2460();
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 118) {
                            for (int var210 = 0; var210 < Statics.field1267; var210++) {
                                class42 var211 = class42.method111(var210);
                                if (var211 != null && var211.field1021 == 0) {
                                    class160.field2716[var210] = 0;
                                    class160.field2717[var210] = 0;
                                }
                            }
                            method791();
                            field644 += 32;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 116) {
                            field705 = true;
                            Statics.field392 = field468.method2458();
                            Statics.field1295 = field468.method2458();
                            Statics.field866 = field468.method2460();
                            Statics.field1022 = field468.method2458();
                            Statics.field2074 = field468.method2458();
                            if (Statics.field2074 >= 100) {
                                Statics.field261 = Statics.field392 * 128 + 64;
                                Statics.field188 = Statics.field1295 * 128 + 64;
                                Statics.field1389 = method845(Statics.field261, Statics.field188, Statics.field363) - Statics.field866;
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 183) {
                            int var212 = field468.method2463();
                            int var213 = field468.method2460();
                            if (var212 < -70000) {
                                var213 += 32768;
                            }
                            class159 var214;
                            if (var212 >= 0) {
                                var214 = class159.method2754(var212);
                            } else {
                                var214 = null;
                            }
                            while (field468.field2033 < field678) {
                                int var215 = field468.method2471();
                                int var216 = field468.method2460();
                                int var217 = 0;
                                if (var216 != 0) {
                                    var217 = field468.method2458();
                                    if (var217 == 255) {
                                        var217 = field468.method2463();
                                    }
                                }
                                if (var214 != null && var215 >= 0 && var215 < var214.field2700.length) {
                                    var214.field2700[var215] = var216;
                                    var214.field2701[var215] = var217;
                                }
                                class19.method817(var213, var215, var216 - 1, var217);
                            }
                            if (var214 != null) {
                                method640(var214);
                            }
                            method791();
                            field671[++field646 - 1 & 0x1F] = var213 & 0x7FFF;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 83) {
                            int var218 = field468.method2463();
                            class4 var219 = (class4) field620.method3312((long) var218);
                            if (var219 != null) {
                                method2218(var219, true);
                            }
                            if (field712 != null) {
                                method640(field712);
                                field712 = null;
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 40) {
                            int var220 = field468.method2539();
                            class19 var221 = (class19) class19.field270.method3312((long) var220);
                            if (var221 != null) {
                                var221.method3374();
                            }
                            field671[++field646 - 1 & 0x1F] = var220 & 0x7FFF;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 56) {
                            int var222 = field468.method2500();
                            boolean var223 = field468.method2590() == 1;
                            class159 var224 = class159.method2754(var222);
                            if (var224.field2705 != var223) {
                                var224.field2705 = var223;
                                method640(var224);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 193) {
                            field658 = 0;
                            field677 = 0;
                            method153();
                            method56();
                            for (int var225 = 0; var225 < field677; var225++) {
                                int var226 = field583[var225];
                                class25 var227 = field495[var226];
                                int var228 = field468.method2458();
                                if ((var228 & 0x10) != 0) {
                                    var227.field371 = class31.method2320(field468.method2492());
                                    var227.field400 = var227.field371.field766;
                                    var227.field446 = var227.field371.field761;
                                    var227.field404 = var227.field371.field772;
                                    var227.field405 = var227.field371.field775;
                                    var227.field406 = var227.field371.field789;
                                    var227.field396 = var227.field371.field780;
                                    var227.field417 = var227.field371.field769;
                                    var227.field407 = var227.field371.field770;
                                    var227.field403 = var227.field371.field771;
                                }
                                if ((var228 & 0x8) != 0) {
                                    int var229 = field468.method2481();
                                    int var230 = field468.method2481();
                                    var227.method252(var229, var230, field484);
                                    var227.field430 = field484 + 300;
                                    var227.field409 = field468.method2481();
                                    var227.field418 = field468.method2590();
                                }
                                if ((var228 & 0x40) != 0) {
                                    int var231 = field468.method2590();
                                    int var232 = field468.method2590();
                                    var227.method252(var231, var232, field484);
                                    var227.field430 = field484 + 300;
                                    var227.field409 = field468.method2590();
                                    var227.field418 = field468.method2647();
                                }
                                if ((var228 & 0x2) != 0) {
                                    var227.field413 = field468.method2491();
                                    int var233 = field468.method2500();
                                    var227.field434 = var233 >> 16;
                                    var227.field433 = (var233 & 0xFFFF) + field484;
                                    var227.field398 = 0;
                                    var227.field432 = 0;
                                    if (var227.field433 > field484) {
                                        var227.field398 = -1;
                                    }
                                    if (var227.field413 == 65535) {
                                        var227.field413 = -1;
                                    }
                                }
                                if ((var228 & 0x1) != 0) {
                                    var227.field410 = field468.method2636();
                                    var227.field449 = 100;
                                }
                                if ((var228 & 0x4) != 0) {
                                    var227.field453 = field468.method2539();
                                    var227.field421 = field468.method2491();
                                }
                                if ((var228 & 0x80) != 0) {
                                    var227.field419 = field468.method2492();
                                    if (var227.field419 == 65535) {
                                        var227.field419 = -1;
                                    }
                                }
                                if ((var228 & 0x20) != 0) {
                                    int var234 = field468.method2492();
                                    if (var234 == 65535) {
                                        var234 = -1;
                                    }
                                    int var235 = field468.method2481();
                                    if (var227.field425 == var234 && var234 != -1) {
                                        int var236 = class34.method572(var234).field893;
                                        if (var236 == 1) {
                                            var227.field426 = 0;
                                            var227.field427 = 0;
                                            var227.field428 = var235;
                                            var227.field411 = 0;
                                        }
                                        if (var236 == 2) {
                                            var227.field411 = 0;
                                        }
                                    } else if (var234 == -1 || var227.field425 == -1 || class34.method572(var234).field881 >= class34.method572(var227.field425).field881) {
                                        var227.field425 = var234;
                                        var227.field426 = 0;
                                        var227.field427 = 0;
                                        var227.field428 = var235;
                                        var227.field411 = 0;
                                        var227.field452 = var227.field447;
                                    }
                                }
                            }
                            for (int var237 = 0; var237 < field658; var237++) {
                                int var238 = field588[var237];
                                if (field484 != field495[var238].field442) {
                                    field495[var238].field371 = null;
                                    field495[var238] = null;
                                }
                            }
                            if (field678 != field468.field2033) {
                                throw new RuntimeException(field468.field2033 + class2.field17 + field678);
                            }
                            for (int var239 = 0; var239 < field496; var239++) {
                                if (field495[field497[var239]] == null) {
                                    throw new RuntimeException(var239 + class2.field17 + field496);
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 89) {
                            int var240 = field468.method2493();
                            int var241 = field468.method2500();
                            class159 var242 = class159.method2754(var241);
                            if (var242.field2634 != var240 || var240 == -1) {
                                var242.field2634 = var240;
                                var242.field2591 = 0;
                                var242.field2628 = 0;
                                method640(var242);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 21) {
                            field705 = true;
                            Statics.field97 = field468.method2458();
                            Statics.field1247 = field468.method2458();
                            Statics.field2725 = field468.method2460();
                            Statics.field2469 = field468.method2458();
                            Statics.field795 = field468.method2458();
                            if (Statics.field795 >= 100) {
                                int var243 = Statics.field97 * 128 + 64;
                                int var244 = Statics.field1247 * 128 + 64;
                                int var245 = method845(var243, var244, Statics.field363) - Statics.field2725;
                                int var246 = var243 - Statics.field261;
                                int var247 = var245 - Statics.field1389;
                                int var248 = var244 - Statics.field188;
                                int var249 = (int) Math.sqrt((double) (var246 * var246 + var248 * var248));
                                Statics.field1646 = (int) (Math.atan2((double) var247, (double) var249) * 325.949D) & 0x7FF;
                                Statics.field2333 = (int) (Math.atan2((double) var246, (double) var248) * -325.949D) & 0x7FF;
                                if (Statics.field1646 < 128) {
                                    Statics.field1646 = 128;
                                }
                                if (Statics.field1646 > 383) {
                                    Statics.field1646 = 383;
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 236) {
                            int var250 = field468.method2525();
                            int var251 = field468.method2647();
                            int var252 = field468.method2460();
                            class4 var253 = (class4) field620.method3312((long) var250);
                            if (var253 != null) {
                                method2218(var253, var253.field64 != var252);
                            }
                            method126(var250, var252, var251);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 93) {
                            method791();
                            int var254 = field468.method2501();
                            int var255 = field468.method2647();
                            int var256 = field468.method2481();
                            field599[var255] = var254;
                            field597[var255] = var256;
                            field492[var255] = 1;
                            for (int var257 = 0; var257 < 98; var257++) {
                                if (var254 >= class131.field2057[var257]) {
                                    field492[var255] = var257 + 2;
                                }
                            }
                            field649[++field699 - 1 & 0x1F] = var255;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 198 || field502 == 167 || field502 == 86 || field502 == 138 || field502 == 172 || field502 == 126 || field502 == 161 || field502 == 242 || field502 == 173 || field502 == 14 || field502 == 38) {
                            method33();
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 141) {
                            int var258 = field468.method2647();
                            int var259 = field468.method2590();
                            String var260 = field468.method2636();
                            if (var259 >= 1 && var259 <= 8) {
                                if (var260.equalsIgnoreCase("null")) {
                                    var260 = null;
                                }
                                field590[var259 - 1] = var260;
                                field591[var259 - 1] = var258 == 0;
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 163) {
                            field691 = field468.method2458();
                            if (field691 == 255) {
                                field691 = 0;
                            }
                            field480 = field468.method2458();
                            if (field480 == 255) {
                                field480 = 0;
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 162) {
                            int var261 = field468.method2501();
                            int var262 = field468.method2460();
                            if (var262 == 65535) {
                                var262 = -1;
                            }
                            int var263 = field468.method2491();
                            if (var263 == 65535) {
                                var263 = -1;
                            }
                            int var264 = field468.method2501();
                            for (int var265 = var262; var265 <= var263; var265++) {
                                long var266 = ((long) var261 << 32) + (long) var265;
                                class179 var268 = field659.method3312(var266);
                                if (var268 != null) {
                                    var268.method3374();
                                }
                                field659.method3329(new class171(var264), var266);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 168) {
                            field607 = 1;
                            field685 = field642;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 74) {
                            for (int var269 = 0; var269 < class160.field2717.length; var269++) {
                                if (class160.field2717[var269] != class160.field2716[var269]) {
                                    class160.field2717[var269] = class160.field2716[var269];
                                    method5(var269);
                                    field643[++field644 - 1 & 0x1F] = var269;
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 52) {
                            String var270 = field468.method2636();
                            int var271 = field468.method2460();
                            byte var272 = field468.method2459();
                            boolean var273 = false;
                            if (var272 == -128) {
                                var273 = true;
                            }
                            if (var273) {
                                if (Statics.field244 == 0) {
                                    field502 = -1;
                                    var1 = true;
                                    break label2845;
                                }
                                boolean var274 = false;
                                int var275;
                                for (var275 = 0; var275 < Statics.field244 && (!Statics.field1280[var275].field108.equals(var270) || Statics.field1280[var275].field104 != var271); var275++) {
                                }
                                if (var275 < Statics.field244) {
                                    while (var275 < Statics.field244 - 1) {
                                        Statics.field1280[var275] = Statics.field1280[var275 + 1];
                                        var275++;
                                    }
                                    Statics.field244--;
                                    Statics.field1280[Statics.field244] = null;
                                }
                            } else {
                                field468.method2636();
                                class8 var276 = new class8();
                                var276.field108 = var270;
                                var276.field105 = class149.method2738(var276.field108, Statics.field2474);
                                var276.field104 = var271;
                                var276.field110 = var272;
                                int var277;
                                for (var277 = Statics.field244 - 1; var277 >= 0; var277--) {
                                    int var278 = Statics.field1280[var277].field105.compareTo(var276.field108);
                                    if (var278 == 0) {
                                        Statics.field1280[var277].field104 = var271;
                                        Statics.field1280[var277].field110 = var272;
                                        if (var270.equals(Statics.field1424.field45)) {
                                            Statics.field1251 = var272;
                                        }
                                        field651 = field642;
                                        field502 = -1;
                                        var1 = true;
                                        break label2845;
                                    }
                                    if (var278 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field244 >= Statics.field1280.length) {
                                    field502 = -1;
                                    var1 = true;
                                    break label2845;
                                }
                                for (int var279 = Statics.field244 - 1; var279 > var277; var279--) {
                                    Statics.field1280[var279 + 1] = Statics.field1280[var279];
                                }
                                if (Statics.field244 == 0) {
                                    Statics.field1280 = new class8[100];
                                }
                                Statics.field1280[var277 + 1] = var276;
                                Statics.field244++;
                                if (var270.equals(Statics.field1424.field45)) {
                                    Statics.field1251 = var272;
                                }
                            }
                            field651 = field642;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 191) {
                            int var280 = field468.method2501();
                            int var281 = field468.method2539();
                            class159 var282 = class159.method2754(var280);
                            if (var282 != null && var282.field2600 == 0) {
                                if (var281 > var282.field2614 - var282.field2608) {
                                    var281 = var282.field2614 - var282.field2608;
                                }
                                if (var281 < 0) {
                                    var281 = 0;
                                }
                                if (var282.field2612 != var281) {
                                    var282.field2612 = var281;
                                    method640(var282);
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 246) {
                            int var283 = field468.method2481();
                            int var284 = field468.method2647();
                            int var285 = field468.method2590();
                            Statics.field363 = var284 >> 1;
                            Statics.field1424.method242(var285, var283, (var284 & 0x1) == 1);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 11) {
                            int var286 = field468.method2463();
                            int var287 = field468.method2492();
                            int var288 = field468.method2539();
                            class159 var289 = class159.method2754(var286);
                            var289.field2609 = (var287 << 16) + var288;
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 218) {
                            int var290 = field468.method2460();
                            int var291 = field468.method2458();
                            int var292 = field468.method2460();
                            method2055(var290, var291, var292);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 206) {
                            for (int var293 = 0; var293 < field499.length; var293++) {
                                if (field499[var293] != null) {
                                    field499[var293].field425 = -1;
                                }
                            }
                            for (int var294 = 0; var294 < field495.length; var294++) {
                                if (field495[var294] != null) {
                                    field495[var294].field425 = -1;
                                }
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 33) {
                            int var295 = field468.method2501();
                            class159 var296 = class159.method2754(var295);
                            var296.field2610 = 3;
                            var296.field2631 = Statics.field1424.field48.method3236();
                            method640(var296);
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 137) {
                            int var297 = field468.method2501();
                            int var298 = field468.method2492();
                            int var299 = field468.method2491();
                            int var300 = field468.method2460();
                            class159 var301 = class159.method2754(var297);
                            if (var301.field2638 != var300 || var301.field2639 != var299 || var301.field2641 != var298) {
                                var301.field2638 = var300;
                                var301.field2639 = var299;
                                var301.field2641 = var298;
                                method640(var301);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        if (field502 == 132) {
                            int var302 = field468.method2492();
                            int var303 = field468.method2501();
                            int var304 = var302 >> 10 & 0x1F;
                            int var305 = var302 >> 5 & 0x1F;
                            int var306 = var302 & 0x1F;
                            int var307 = (var306 << 3) + (var304 << 19) + (var305 << 11);
                            class159 var308 = class159.method2754(var303);
                            if (var308.field2615 != var307) {
                                var308.field2615 = var307;
                                method640(var308);
                            }
                            field502 = -1;
                            var1 = true;
                            break label2845;
                        }
                        class80.method802("" + field502 + class2.field17 + field478 + class2.field17 + field508 + class2.field17 + field678, (Throwable) null);
                        method2352();
                    } catch (IOException var429) {
                        method1428();
                    } catch (Exception var430) {
                        String var311 = "" + field502 + class2.field17 + field478 + class2.field17 + field508 + class2.field17 + field678 + class2.field17 + (Statics.field10 + Statics.field1424.field443[0]) + class2.field17 + (Statics.field289 + Statics.field1424.field420[0]) + class2.field17;
                        for (int var312 = 0; var312 < field678 && var312 < 50; var312++) {
                            var311 = var311 + field468.field2030[var312] + class2.field17;
                        }
                        class80.method802(var311, var430);
                        method2352();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field466 != 30) {
            return;
        }
        Statics.method549(field694, 189);
        Object var313 = Statics.field256.field242;
        synchronized (Statics.field256.field242) {
            if (!field457) {
                Statics.field256.field240 = 0;
            } else if (class77.field1383 != 0 || Statics.field256.field240 >= 40) {
                field694.method2316(202);
                field694.method2536(0);
                int var314 = field694.field2033;
                int var315 = 0;
                for (int var316 = 0; var316 < Statics.field256.field240 && field694.field2033 - var314 < 240; var316++) {
                    var315++;
                    int var317 = Statics.field256.field238[var316];
                    if (var317 < 0) {
                        var317 = 0;
                    } else if (var317 > 502) {
                        var317 = 502;
                    }
                    int var318 = Statics.field256.field241[var316];
                    if (var318 < 0) {
                        var318 = 0;
                    } else if (var318 > 764) {
                        var318 = 764;
                    }
                    int var319 = var317 * 765 + var318;
                    if (Statics.field256.field238[var316] == -1 && Statics.field256.field241[var316] == -1) {
                        var318 = -1;
                        var317 = -1;
                        var319 = 524287;
                    }
                    if (field470 != var318 || field471 != var317) {
                        int var320 = var318 - field470;
                        field470 = var318;
                        int var321 = var317 - field471;
                        field471 = var317;
                        if (field472 < 8 && var320 >= -32 && var320 <= 31 && var321 >= -32 && var321 <= 31) {
                            var320 += 32;
                            var321 += 32;
                            field694.method2563((field472 << 12) + (var320 << 6) + var321);
                            field472 = 0;
                        } else if (field472 < 8) {
                            field694.method2446((field472 << 19) + 8388608 + var319);
                            field472 = 0;
                        } else {
                            field694.method2447((field472 << 19) + -1073741824 + var319);
                            field472 = 0;
                        }
                    } else if (field472 < 2047) {
                        field472++;
                    }
                }
                field694.method2571(field694.field2033 - var314);
                if (var315 >= Statics.field256.field240) {
                    Statics.field256.field240 = 0;
                } else {
                    Statics.field256.field240 -= var315;
                    for (int var322 = 0; var322 < Statics.field256.field240; var322++) {
                        Statics.field256.field241[var322] = Statics.field256.field241[var315 + var322];
                        Statics.field256.field238[var322] = Statics.field256.field238[var315 + var322];
                    }
                }
            }
        }
        if (class77.field1383 == 1 || class77.field1383 == 2) {
            long var324 = (class77.field1377 - field469) / 50L;
            if (var324 > 4095L) {
                var324 = 4095L;
            }
            field469 = class77.field1377;
            int var326 = class77.field1385;
            if (var326 < 0) {
                var326 = 0;
            } else if (var326 > 502) {
                var326 = 502;
            }
            int var327 = class77.field1384;
            if (var327 < 0) {
                var327 = 0;
            } else if (var327 > 764) {
                var327 = 764;
            }
            int var328 = var326 * 765 + var327;
            byte var329 = 0;
            if (class77.field1383 == 2) {
                var329 = 1;
            }
            int var330 = (int) var324;
            field694.method2316(143);
            field694.method2447((var329 << 19) + (var330 << 20) + var328);
        }
        if (class75.field1354 > 0) {
            field694.method2316(52);
            field694.method2563(0);
            int var331 = field694.field2033;
            long var332 = class121.method133();
            for (int var334 = 0; var334 < class75.field1354; var334++) {
                long var335 = var332 - field683;
                if (var335 > 16777215L) {
                    var335 = 16777215L;
                }
                field683 = var332;
                field694.method2479(class75.field1359[var334]);
                field694.method2494((int) var335);
            }
            field694.method2470(field694.field2033 - var331);
        }
        if (field549 > 0) {
            field549--;
        }
        if (class75.field1347[96] || class75.field1347[97] || class75.field1347[98] || class75.field1347[99]) {
            field550 = true;
        }
        if (field550 && field549 <= 0) {
            field549 = 20;
            field550 = false;
            field694.method2316(205);
            field694.method2563(field544);
            field694.method2489(field562);
        }
        if (Statics.field1017 && !field494) {
            field494 = true;
            field694.method2316(49);
            field694.method2536(1);
        }
        if (!Statics.field1017 && field494) {
            field494 = false;
            field694.method2316(49);
            field694.method2536(0);
        }
        method1250();
        if (field466 != 30) {
            return;
        }
        for (class22 var337 = (class22) field674.method3362(); var337 != null; var337 = (class22) field674.method3350()) {
            if (var337.field332 > 0) {
                var337.field332--;
            }
            if (var337.field332 != 0) {
                if (var337.field335 > 0) {
                    var337.field335--;
                }
                if (var337.field335 == 0 && var337.field342 >= 1 && var337.field333 >= 1 && var337.field342 <= 102 && var337.field333 <= 102 && (var337.field339 < 0 || class9.method30(var337.field339, var337.field343))) {
                    method166(var337.field334, var337.field338, var337.field342, var337.field333, var337.field339, var337.field340, var337.field343);
                    var337.field335 = -1;
                    if (var337.field339 == var337.field336 && var337.field336 == -1) {
                        var337.method3374();
                    } else if (var337.field339 == var337.field336 && var337.field340 == var337.field337 && var337.field343 == var337.field341) {
                        var337.method3374();
                    }
                }
            } else if (var337.field336 < 0 || class9.method30(var337.field336, var337.field341)) {
                method166(var337.field334, var337.field338, var337.field342, var337.field333, var337.field336, var337.field337, var337.field341);
                var337.method3374();
            }
        }
        int var10002;
        for (int var338 = 0; var338 < field521; var338++) {
            var10002 = field702[var338]--;
            if (field702[var338] >= -10) {
                class57 var340 = field704[var338];
                if (var340 == null) {
                    class57 var431 = (class57) null;
                    var340 = class57.method1274(Statics.field488, field700[var338], 0);
                    if (var340 == null) {
                        continue;
                    }
                    field702[var338] += var340.method1270();
                    field704[var338] = var340;
                }
                if (field702[var338] < 0) {
                    int var347;
                    if (field546[var338] == 0) {
                        var347 = field697;
                    } else {
                        int var341 = (field546[var338] & 0xFF) * 128;
                        int var342 = field546[var338] >> 16 & 0xFF;
                        int var343 = var342 * 128 + 64 - Statics.field1424.field401;
                        if (var343 < 0) {
                            var343 = -var343;
                        }
                        int var344 = field546[var338] >> 8 & 0xFF;
                        int var345 = var344 * 128 + 64 - Statics.field1424.field414;
                        if (var345 < 0) {
                            var345 = -var345;
                        }
                        int var346 = var343 + var345 - 128;
                        if (var346 > var341) {
                            field702[var338] = -100;
                            continue;
                        }
                        if (var346 < 0) {
                            var346 = 0;
                        }
                        var347 = field698 * (var341 - var346) / var341;
                    }
                    if (var347 > 0) {
                        class63 var348 = var340.method1269().method1344(Statics.field253);
                        class45 var349 = class45.method944(var348, 100, var347);
                        var349.method947(field701[var338] - 1);
                        Statics.field1909.method1096(var349);
                    }
                    field702[var338] = -100;
                }
            } else {
                field521--;
                for (int var339 = var338; var339 < field521; var339++) {
                    field700[var339] = field700[var339 + 1];
                    field704[var339] = field704[var339 + 1];
                    field701[var339] = field701[var339 + 1];
                    field702[var339] = field702[var339 + 1];
                    field546[var339] = field546[var339 + 1];
                }
                var338--;
            }
        }
        if (field664 && !class139.method2215()) {
            if (field566 != 0 && field548 != -1) {
                class139.method1421(Statics.field2871, field548, 0, field566, false);
            }
            field664 = false;
        }
        field503++;
        if (field503 > 750) {
            method1428();
            return;
        }
        for (int var350 = -1; var350 < field483; var350++) {
            int var351;
            if (var350 == -1) {
                var351 = 2047;
            } else {
                var351 = field514[var350];
            }
            class3 var352 = field499[var351];
            if (var352 != null) {
                method160(var352, 1);
            }
        }
        method117();
        method2723();
        field534++;
        if (field569 != 0) {
            field568 += 20;
            if (field568 >= 400) {
                field569 = 0;
            }
        }
        if (Statics.field354 != null) {
            field570++;
            if (field570 >= 15) {
                method640(Statics.field354);
                Statics.field354 = null;
            }
        }
        if (Statics.field293 != null) {
            method640(Statics.field293);
            field625++;
            if (class77.field1376 > field485 + 5 || class77.field1376 < field485 - 5 || class77.field1375 > field543 + 5 || class77.field1375 < field543 - 5) {
                field576 = true;
            }
            if (class77.field1387 == 0) {
                if (!field576 || field625 < 5) {
                    label3050: {
                        label2081: {
                            if (field600 != 1) {
                                int var361 = field602 - 1;
                                boolean var362;
                                if (var361 < 0) {
                                    var362 = false;
                                } else {
                                    int var363 = field605[var361];
                                    if (var363 >= 2000) {
                                        var363 -= 2000;
                                    }
                                    if (var363 == 1007) {
                                        var362 = true;
                                    } else {
                                        var362 = false;
                                    }
                                }
                                if (!var362) {
                                    break label2081;
                                }
                            }
                            if (field602 > 2) {
                                method114();
                                break label3050;
                            }
                        }
                        if (field602 > 0) {
                            method179(field602 - 1);
                        }
                    }
                } else if (Statics.field448 == Statics.field293 && field586 != field572) {
                    class159 var353 = Statics.field293;
                    byte var354 = 0;
                    if (field617 == 1 && var353.field2653 == 206) {
                        var354 = 1;
                    }
                    if (var353.field2700[field586] <= 0) {
                        var354 = 0;
                    }
                    int var355 = method544(var353);
                    boolean var356 = (var355 >> 29 & 0x1) != 0;
                    if (var356) {
                        int var357 = field572;
                        int var358 = field586;
                        var353.field2700[var358] = var353.field2700[var357];
                        var353.field2701[var358] = var353.field2701[var357];
                        var353.field2700[var357] = -1;
                        var353.field2701[var357] = 0;
                    } else if (var354 == 1) {
                        int var359 = field572;
                        int var360 = field586;
                        while (var359 != var360) {
                            if (var359 > var360) {
                                var353.method3159(var359 - 1, var359);
                                var359--;
                            } else if (var359 < var360) {
                                var353.method3159(var359 + 1, var359);
                                var359++;
                            }
                        }
                    } else {
                        var353.method3159(field586, field572);
                    }
                    field694.method2316(90);
                    field694.method2487(field572);
                    field694.method2498(Statics.field293.field2596);
                    field694.method2503(var354);
                    field694.method2499(field586);
                }
                field570 = 10;
                class77.field1383 = 0;
                Statics.field293 = null;
            }
        }
        class159 var364 = Statics.field375;
        class159 var365 = Statics.field928;
        Statics.field375 = null;
        Statics.field928 = null;
        field634 = null;
        field547 = false;
        field635 = false;
        field661 = 0;
        while (true) {
            class75 var366 = class75.field1346;
            boolean var367;
            synchronized (class75.field1346) {
                if (class75.field1355 == class75.field1338) {
                    var367 = false;
                } else {
                    Statics.field346 = class75.field1352[class75.field1355];
                    Statics.field1301 = class75.field1351[class75.field1355];
                    class75.field1355 = class75.field1355 + 1 & 0x7F;
                    var367 = true;
                }
            }
            if (!var367 || field661 >= 128) {
                method224(field619, 0, 0, 765, 503, 0, 0);
                field642++;
                while (true) {
                    class1 var369;
                    class159 var370;
                    class159 var371;
                    do {
                        var369 = (class1) field657.method3358();
                        if (var369 == null) {
                            while (true) {
                                class1 var372;
                                class159 var373;
                                class159 var374;
                                do {
                                    var372 = (class1) field475.method3358();
                                    if (var372 == null) {
                                        while (true) {
                                            class1 var375;
                                            class159 var376;
                                            class159 var377;
                                            do {
                                                var375 = (class1) field656.method3358();
                                                if (var375 == null) {
                                                    if (field594 != null) {
                                                        Statics.method1691();
                                                    }
                                                    if (class95.field1574 != -1) {
                                                        int var378 = class95.field1574;
                                                        int var379 = class95.field1582;
                                                        field694.method2316(72);
                                                        field694.method2536(5);
                                                        field694.method2489(Statics.field289 + var379);
                                                        field694.method2487(Statics.field10 + var378);
                                                        field694.method2475(class75.field1347[82] ? (class75.field1347[81] ? 2 : 1) : 0);
                                                        class95.field1574 = -1;
                                                        field501 = class77.field1384;
                                                        field531 = class77.field1385;
                                                        field569 = 1;
                                                        field568 = 0;
                                                        field691 = var378;
                                                        field480 = var379;
                                                    }
                                                    if (Statics.field293 == null && field594 == null) {
                                                        int var380 = class77.field1383;
                                                        if (field535) {
                                                            if (var380 != 1) {
                                                                int var381 = class77.field1376;
                                                                int var382 = class77.field1375;
                                                                if (var381 < Statics.field2086 - 10 || var381 > Statics.field454 + Statics.field2086 + 10 || var382 < Statics.field1092 - 10 || var382 > Statics.field1171 + Statics.field1092 + 10) {
                                                                    field535 = false;
                                                                    method146(Statics.field2086, Statics.field1092, Statics.field454, Statics.field1171);
                                                                }
                                                            }
                                                            if (var380 == 1) {
                                                                int var383 = Statics.field2086;
                                                                int var384 = Statics.field1092;
                                                                int var385 = Statics.field454;
                                                                int var386 = class77.field1384;
                                                                int var387 = class77.field1385;
                                                                int var388 = -1;
                                                                for (int var389 = 0; var389 < field602; var389++) {
                                                                    int var390 = (field602 - 1 - var389) * 15 + var384 + 31;
                                                                    if (var386 > var383 && var386 < var383 + var385 && var387 > var390 - 13 && var387 < var390 + 3) {
                                                                        var388 = var389;
                                                                    }
                                                                }
                                                                if (var388 != -1) {
                                                                    method179(var388);
                                                                }
                                                                field535 = false;
                                                                method146(Statics.field2086, Statics.field1092, Statics.field454, Statics.field1171);
                                                            }
                                                        } else {
                                                            label2962: {
                                                                int var392;
                                                                int var393;
                                                                label3042: {
                                                                    if (var380 == 1 && field602 > 0) {
                                                                        int var391 = field605[field602 - 1];
                                                                        if (var391 == 39 || var391 == 40 || var391 == 41 || var391 == 42 || var391 == 43 || var391 == 33 || var391 == 34 || var391 == 35 || var391 == 36 || var391 == 37 || var391 == 38 || var391 == 1005) {
                                                                            var392 = field603[field602 - 1];
                                                                            var393 = field604[field602 - 1];
                                                                            class159 var394 = class159.method2754(var393);
                                                                            int var395 = method544(var394);
                                                                            boolean var396 = (var395 >> 28 & 0x1) != 0;
                                                                            if (var396) {
                                                                                break label3042;
                                                                            }
                                                                            int var397 = method544(var394);
                                                                            boolean var398 = (var397 >> 29 & 0x1) != 0;
                                                                            if (var398) {
                                                                                break label3042;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (var380 == 1 && (field600 == 1 && field602 > 2 || method167(field602 - 1))) {
                                                                        var380 = 2;
                                                                    }
                                                                    if (var380 == 1 && field602 > 0) {
                                                                        method179(field602 - 1);
                                                                    }
                                                                    if (var380 == 2 && field602 > 0) {
                                                                        method114();
                                                                    }
                                                                    break label2962;
                                                                }
                                                                if (Statics.field293 != null && !field576 && field600 != 1 && !method167(field602 - 1) && field602 > 0) {
                                                                    method179(field602 - 1);
                                                                }
                                                                field576 = false;
                                                                field625 = 0;
                                                                if (Statics.field293 != null) {
                                                                    method640(Statics.field293);
                                                                }
                                                                Statics.field293 = class159.method2754(var393);
                                                                field572 = var392;
                                                                field485 = class77.field1384;
                                                                field543 = class77.field1385;
                                                                method640(Statics.field293);
                                                            }
                                                        }
                                                    }
                                                    if (Statics.field375 != var364) {
                                                        if (var364 != null) {
                                                            method640(var364);
                                                        }
                                                        if (Statics.field375 != null) {
                                                            method640(Statics.field375);
                                                        }
                                                    }
                                                    if (Statics.field928 != var365 && field612 == field611) {
                                                        if (var365 != null) {
                                                            method640(var365);
                                                        }
                                                        if (Statics.field928 != null) {
                                                            method640(Statics.field928);
                                                        }
                                                    }
                                                    if (Statics.field928 == null) {
                                                        if (field611 > 0) {
                                                            field611--;
                                                        }
                                                    } else if (field611 < field612) {
                                                        field611++;
                                                        if (field612 == field611) {
                                                            method640(Statics.field928);
                                                        }
                                                    }
                                                    int var399 = field518 + Statics.field1424.field401;
                                                    int var400 = field524 + Statics.field1424.field414;
                                                    if (Statics.field860 - var399 < -500 || Statics.field860 - var399 > 500 || Statics.field1971 - var400 < -500 || Statics.field1971 - var400 > 500) {
                                                        Statics.field860 = var399;
                                                        Statics.field1971 = var400;
                                                    }
                                                    if (Statics.field860 != var399) {
                                                        Statics.field860 += (var399 - Statics.field860) / 16;
                                                    }
                                                    if (Statics.field1971 != var400) {
                                                        Statics.field1971 += (var400 - Statics.field1971) / 16;
                                                    }
                                                    if (class77.field1387 == 4 && field626 >= 2) {
                                                        int var401 = class77.field1375 - field666;
                                                        field613 = var401 * 2;
                                                        field666 = var401 == -1 || var401 == 1 ? class77.field1375 : (field666 + class77.field1375) / 2;
                                                        int var402 = field573 - class77.field1376;
                                                        field545 = var402 * 2;
                                                        field573 = var402 == -1 || var402 == 1 ? class77.field1376 : (field573 + class77.field1376) / 2;
                                                    } else {
                                                        if (class75.field1347[96]) {
                                                            field545 += (-24 - field545) / 2;
                                                        } else if (class75.field1347[97]) {
                                                            field545 += (24 - field545) / 2;
                                                        } else {
                                                            field545 /= 2;
                                                        }
                                                        if (class75.field1347[98]) {
                                                            field613 += (12 - field613) / 2;
                                                        } else if (class75.field1347[99]) {
                                                            field613 += (-12 - field613) / 2;
                                                        } else {
                                                            field613 /= 2;
                                                        }
                                                        field666 = class77.field1375;
                                                        field573 = class77.field1376;
                                                    }
                                                    field544 = field545 / 2 + field544 & 0x7FF;
                                                    field562 += field613 / 2;
                                                    if (field562 < 128) {
                                                        field562 = 128;
                                                    }
                                                    if (field562 > 383) {
                                                        field562 = 383;
                                                    }
                                                    int var403 = Statics.field860 >> 7;
                                                    int var404 = Statics.field1971 >> 7;
                                                    int var405 = method845(Statics.field860, Statics.field1971, Statics.field363);
                                                    int var406 = 0;
                                                    if (var403 > 3 && var404 > 3 && var403 < 100 && var404 < 100) {
                                                        for (int var407 = var403 - 4; var407 <= var403 + 4; var407++) {
                                                            for (int var408 = var404 - 4; var408 <= var404 + 4; var408++) {
                                                                int var409 = Statics.field363;
                                                                if (var409 < 3 && (class9.field115[1][var407][var408] & 0x2) == 2) {
                                                                    var409++;
                                                                }
                                                                int var410 = var405 - class9.field129[var409][var407][var408];
                                                                if (var410 > var406) {
                                                                    var406 = var410;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var411 = var406 * 192;
                                                    if (var411 > 98048) {
                                                        var411 = 98048;
                                                    }
                                                    if (var411 < 32768) {
                                                        var411 = 32768;
                                                    }
                                                    if (var411 > field551) {
                                                        field551 += (var411 - field551) / 24;
                                                    } else if (var411 < field551) {
                                                        field551 += (var411 - field551) / 80;
                                                    }
                                                    if (field705) {
                                                        method545();
                                                    }
                                                    for (int var412 = 0; var412 < 5; var412++) {
                                                        var10002 = field710[var412]++;
                                                    }
                                                    int var413 = ++class77.field1372 - 1;
                                                    int var415 = class75.method2650();
                                                    if (var413 > 15000 && var415 > 15000) {
                                                        field505 = 250;
                                                        class77.field1372 = 14500;
                                                        field694.method2316(45);
                                                    }
                                                    field528++;
                                                    if (field528 > 500) {
                                                        field528 = 0;
                                                        int var416 = (int) (Math.random() * 8.0D);
                                                        if ((var416 & 0x1) == 1) {
                                                            field518 += field523;
                                                        }
                                                        if ((var416 & 0x2) == 2) {
                                                            field524 += field676;
                                                        }
                                                        if ((var416 & 0x4) == 4) {
                                                            field526 += field455;
                                                        }
                                                    }
                                                    if (field518 < -50) {
                                                        field523 = 2;
                                                    }
                                                    if (field518 > 50) {
                                                        field523 = -2;
                                                    }
                                                    if (field524 < -55) {
                                                        field676 = 2;
                                                    }
                                                    if (field524 > 55) {
                                                        field676 = -2;
                                                    }
                                                    if (field526 < -40) {
                                                        field455 = 1;
                                                    }
                                                    if (field526 > 40) {
                                                        field455 = -1;
                                                    }
                                                    field571++;
                                                    if (field571 > 500) {
                                                        field571 = 0;
                                                        int var417 = (int) (Math.random() * 8.0D);
                                                        if ((var417 & 0x1) == 1) {
                                                            field473 += field530;
                                                        }
                                                        if ((var417 & 0x2) == 2) {
                                                            field616 += field532;
                                                        }
                                                    }
                                                    if (field473 < -60) {
                                                        field530 = 2;
                                                    }
                                                    if (field473 > 60) {
                                                        field530 = -2;
                                                    }
                                                    if (field616 < -20) {
                                                        field532 = 1;
                                                    }
                                                    if (field616 > 10) {
                                                        field532 = -1;
                                                    }
                                                    for (class28 var418 = (class28) field714.method3298(); var418 != null; var418 = (class28) field714.method3299()) {
                                                        if ((long) var418.field732 < class121.method133() / 1000L - 5L) {
                                                            if (var418.field730 > 0) {
                                                                method731(5, "", var418.field726 + class135.field2154);
                                                            }
                                                            if (var418.field730 == 0) {
                                                                method731(5, "", var418.field726 + class135.field2168);
                                                            }
                                                            var418.method3365();
                                                        }
                                                    }
                                                    field504++;
                                                    if (field504 > 50) {
                                                        field694.method2316(153);
                                                    }
                                                    try {
                                                        if (Statics.field172 != null && field694.field2033 > 0) {
                                                            Statics.field172.method1396(field694.field2030, 0, field694.field2033);
                                                            field694.field2033 = 0;
                                                            field504 = 0;
                                                        }
                                                    } catch (IOException var420) {
                                                        method1428();
                                                    }
                                                    return;
                                                }
                                                var376 = var375.field9;
                                                if (var376.field2599 < 0) {
                                                    break;
                                                }
                                                var377 = class159.method2754(var376.field2704);
                                            } while (var377 == null || var377.field2633 == null || var376.field2599 >= var377.field2633.length || var377.field2633[var376.field2599] != var376);
                                            class26.method2441(var375);
                                        }
                                    }
                                    var373 = var372.field9;
                                    if (var373.field2599 < 0) {
                                        break;
                                    }
                                    var374 = class159.method2754(var373.field2704);
                                } while (var374 == null || var374.field2633 == null || var373.field2599 >= var374.field2633.length || var374.field2633[var373.field2599] != var373);
                                class26.method2441(var372);
                            }
                        }
                        var370 = var369.field9;
                        if (var370.field2599 < 0) {
                            break;
                        }
                        var371 = class159.method2754(var370.field2704);
                    } while (var371 == null || var371.field2633 == null || var370.field2599 >= var371.field2633.length || var371.field2633[var370.field2599] != var370);
                    class26.method2441(var369);
                }
            }
            field527[field661] = Statics.field346;
            field681[field661] = Statics.field1301;
            field661++;
        }
    }

    @ObfuscatedName("dt.p(I)V")
    public static final void method2342() {
        if (Statics.field2466 != null) {
            Statics.field2466.method1143();
        }
        if (Statics.field368 != null) {
            Statics.field368.method1143();
        }
    }

    @ObfuscatedName("cd.i(Lac;IIII)V")
    public static void method1882(class34 arg0, int arg1, int arg2, int arg3) {
        if (field521 >= 50 || field698 == 0 || arg0.field886 == null || arg1 >= arg0.field886.length) {
            return;
        }
        int var4 = arg0.field886[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field700[field521] = var5;
        field701[field521] = var6;
        field702[field521] = 0;
        field704[field521] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field546[field521] = (var8 << 16) + (var9 << 8) + var7;
        field521++;
    }

    @ObfuscatedName("cs.aa(IIII)V")
    public static void method2055(int arg0, int arg1, int arg2) {
        if (field697 == 0 || arg1 == 0 || field521 >= 50) {
            return;
        }
        field700[field521] = arg0;
        field701[field521] = arg1;
        field702[field521] = arg2;
        field704[field521] = null;
        field546[field521] = 0;
        field521++;
    }

    @ObfuscatedName("dc.ax(II)V")
    public static void method2219(int arg0) {
        if (arg0 == -1 && !field664) {
            class139.method840();
        } else if (arg0 != -1 && field548 != arg0 && field566 != 0 && !field664) {
            class139.method2386(2, Statics.field2871, arg0, 0, field566, false);
        }
        field548 = arg0;
    }

    @ObfuscatedName("ds.ad(IIB)V")
    public static void method2427(int arg0, int arg1) {
        if (field566 != 0 && arg0 != -1) {
            class139.method1421(Statics.field345, arg0, 0, field566, false);
            field664 = true;
        }
    }

    @ObfuscatedName("bw.af(B)V")
    public static final void method1250() {
        if (field596 && Statics.field363 != field511) {
            method10(Statics.field1650, Statics.field1414, Statics.field363, Statics.field1424.field443[0], Statics.field1424.field420[0]);
        } else if (Statics.field363 != field686) {
            field686 = Statics.field363;
            method1445(Statics.field363);
        }
    }

    @ObfuscatedName("dz.ai(I)V")
    public static final void method2723() {
        for (int var0 = -1; var0 < field483; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field514[var0];
            }
            class3 var2 = field499[var1];
            if (var2 != null && var2.field449 > 0) {
                var2.field449--;
                if (var2.field449 == 0) {
                    var2.field410 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field496; var3++) {
            int var4 = field497[var3];
            class25 var5 = field495[var4];
            if (var5 != null && var5.field449 > 0) {
                var5.field449--;
                if (var5.field449 == 0) {
                    var5.field410 = null;
                }
            }
        }
    }

    @ObfuscatedName("client.ag(I)V")
    public static final void method545() {
        int var0 = Statics.field392 * 128 + 64;
        int var1 = Statics.field1295 * 128 + 64;
        int var2 = method845(var0, var1, Statics.field363) - Statics.field866;
        if (Statics.field261 < var0) {
            Statics.field261 += Statics.field2074 * (var0 - Statics.field261) / 1000 + Statics.field1022;
            if (Statics.field261 > var0) {
                Statics.field261 = var0;
            }
        }
        if (Statics.field261 > var0) {
            Statics.field261 -= Statics.field2074 * (Statics.field261 - var0) / 1000 + Statics.field1022;
            if (Statics.field261 < var0) {
                Statics.field261 = var0;
            }
        }
        if (Statics.field1389 < var2) {
            Statics.field1389 += Statics.field2074 * (var2 - Statics.field1389) / 1000 + Statics.field1022;
            if (Statics.field1389 > var2) {
                Statics.field1389 = var2;
            }
        }
        if (Statics.field1389 > var2) {
            Statics.field1389 -= Statics.field2074 * (Statics.field1389 - var2) / 1000 + Statics.field1022;
            if (Statics.field1389 < var2) {
                Statics.field1389 = var2;
            }
        }
        if (Statics.field188 < var1) {
            Statics.field188 += Statics.field2074 * (var1 - Statics.field188) / 1000 + Statics.field1022;
            if (Statics.field188 > var1) {
                Statics.field188 = var1;
            }
        }
        if (Statics.field188 > var1) {
            Statics.field188 -= Statics.field2074 * (Statics.field188 - var1) / 1000 + Statics.field1022;
            if (Statics.field188 < var1) {
                Statics.field188 = var1;
            }
        }
        int var3 = Statics.field97 * 128 + 64;
        int var4 = Statics.field1247 * 128 + 64;
        int var5 = method845(var3, var4, Statics.field363) - Statics.field2725;
        int var6 = var3 - Statics.field261;
        int var7 = var5 - Statics.field1389;
        int var8 = var4 - Statics.field188;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1646 < var10) {
            Statics.field1646 += Statics.field795 * (var10 - Statics.field1646) / 1000 + Statics.field2469;
            if (Statics.field1646 > var10) {
                Statics.field1646 = var10;
            }
        }
        if (Statics.field1646 > var10) {
            Statics.field1646 -= Statics.field795 * (Statics.field1646 - var10) / 1000 + Statics.field2469;
            if (Statics.field1646 < var10) {
                Statics.field1646 = var10;
            }
        }
        int var12 = var11 - Statics.field2333;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2333 += Statics.field795 * var12 / 1000 + Statics.field2469;
            Statics.field2333 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2333 -= Statics.field795 * -var12 / 1000 + Statics.field2469;
            Statics.field2333 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2333;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2333 = var11;
        }
    }

    @ObfuscatedName("g.an(S)V")
    public static final void method117() {
        for (int var0 = 0; var0 < field496; var0++) {
            int var1 = field497[var0];
            class25 var2 = field495[var1];
            if (var2 != null) {
                method160(var2, var2.field371.field766);
            }
        }
    }

    @ObfuscatedName("q.ac(Laa;II)V")
    public static final void method160(class27 arg0, int arg1) {
        if (arg0.field439 > field484) {
            method1341(arg0);
        } else if (arg0.field431 >= field484) {
            if (field484 == arg0.field431 || arg0.field425 == -1 || arg0.field428 != 0 || arg0.field427 + 1 > class34.method572(arg0.field425).field887[arg0.field426]) {
                int var2 = arg0.field431 - arg0.field439;
                int var3 = field484 - arg0.field439;
                int var4 = arg0.field435 * 128 + arg0.field400 * 64;
                int var5 = arg0.field437 * 128 + arg0.field400 * 64;
                int var6 = arg0.field400 * 64 + arg0.field397 * 128;
                int var7 = arg0.field438 * 128 + arg0.field400 * 64;
                arg0.field401 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field414 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field440 = 0;
            if (arg0.field441 == 0) {
                arg0.field424 = 1024;
            }
            if (arg0.field441 == 1) {
                arg0.field424 = 1536;
            }
            if (arg0.field441 == 2) {
                arg0.field424 = 0;
            }
            if (arg0.field441 == 3) {
                arg0.field424 = 512;
            }
            arg0.field416 = arg0.field424;
        } else {
            arg0.field422 = arg0.field417;
            if (arg0.field447 == 0) {
                arg0.field440 = 0;
            } else {
                label343: {
                    if (arg0.field425 != -1 && arg0.field428 == 0) {
                        class34 var8 = class34.method572(arg0.field425);
                        if (arg0.field452 > 0 && var8.field885 == 0) {
                            arg0.field440++;
                            break label343;
                        }
                        if (arg0.field452 <= 0 && var8.field880 == 0) {
                            arg0.field440++;
                            break label343;
                        }
                    }
                    int var9 = arg0.field401;
                    int var10 = arg0.field414;
                    int var11 = arg0.field443[arg0.field447 - 1] * 128 + arg0.field400 * 64;
                    int var12 = arg0.field420[arg0.field447 - 1] * 128 + arg0.field400 * 64;
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        if (var9 < var11) {
                            if (var10 < var12) {
                                arg0.field424 = 1280;
                            } else if (var10 > var12) {
                                arg0.field424 = 1792;
                            } else {
                                arg0.field424 = 1536;
                            }
                        } else if (var9 > var11) {
                            if (var10 < var12) {
                                arg0.field424 = 768;
                            } else if (var10 > var12) {
                                arg0.field424 = 256;
                            } else {
                                arg0.field424 = 512;
                            }
                        } else if (var10 < var12) {
                            arg0.field424 = 1024;
                        } else if (var10 > var12) {
                            arg0.field424 = 0;
                        }
                        int var13 = arg0.field424 - arg0.field416 & 0x7FF;
                        if (var13 > 1024) {
                            var13 -= 2048;
                        }
                        int var14 = arg0.field405;
                        if (var13 >= -256 && var13 <= 256) {
                            var14 = arg0.field404;
                        } else if (var13 >= 256 && var13 < 768) {
                            var14 = arg0.field396;
                        } else if (var13 >= -768 && var13 <= -256) {
                            var14 = arg0.field406;
                        }
                        if (var14 == -1) {
                            var14 = arg0.field404;
                        }
                        arg0.field422 = var14;
                        int var15 = 4;
                        boolean var16 = true;
                        if (arg0 instanceof class25) {
                            var16 = ((class25) arg0).field371.field784;
                        }
                        if (var16) {
                            if (arg0.field424 != arg0.field416 && arg0.field419 == -1 && arg0.field446 != 0) {
                                var15 = 2;
                            }
                            if (arg0.field447 > 2) {
                                var15 = 6;
                            }
                            if (arg0.field447 > 3) {
                                var15 = 8;
                            }
                            if (arg0.field440 > 0 && arg0.field447 > 1) {
                                var15 = 8;
                                arg0.field440--;
                            }
                        } else {
                            if (arg0.field447 > 1) {
                                var15 = 6;
                            }
                            if (arg0.field447 > 2) {
                                var15 = 8;
                            }
                            if (arg0.field440 > 0 && arg0.field447 > 1) {
                                var15 = 8;
                                arg0.field440--;
                            }
                        }
                        if (arg0.field450[arg0.field447 - 1]) {
                            var15 <<= 0x1;
                        }
                        if (var15 >= 8 && arg0.field422 == arg0.field404 && arg0.field408 != -1) {
                            arg0.field422 = arg0.field408;
                        }
                        if (var9 < var11) {
                            arg0.field401 += var15;
                            if (arg0.field401 > var11) {
                                arg0.field401 = var11;
                            }
                        } else if (var9 > var11) {
                            arg0.field401 -= var15;
                            if (arg0.field401 < var11) {
                                arg0.field401 = var11;
                            }
                        }
                        if (var10 < var12) {
                            arg0.field414 += var15;
                            if (arg0.field414 > var12) {
                                arg0.field414 = var12;
                            }
                        } else if (var10 > var12) {
                            arg0.field414 -= var15;
                            if (arg0.field414 < var12) {
                                arg0.field414 = var12;
                            }
                        }
                        if (arg0.field401 == var11 && arg0.field414 == var12) {
                            arg0.field447--;
                            if (arg0.field452 > 0) {
                                arg0.field452--;
                            }
                        }
                    } else {
                        arg0.field401 = var11;
                        arg0.field414 = var12;
                    }
                }
            }
        }
        if (arg0.field401 < 128 || arg0.field414 < 128 || arg0.field401 >= 13184 || arg0.field414 >= 13184) {
            arg0.field425 = -1;
            arg0.field413 = -1;
            arg0.field439 = 0;
            arg0.field431 = 0;
            arg0.field401 = arg0.field443[0] * 128 + arg0.field400 * 64;
            arg0.field414 = arg0.field420[0] * 128 + arg0.field400 * 64;
            arg0.method244();
        }
        if (Statics.field1424 == arg0 && (arg0.field401 < 1536 || arg0.field414 < 1536 || arg0.field401 >= 11776 || arg0.field414 >= 11776)) {
            arg0.field425 = -1;
            arg0.field413 = -1;
            arg0.field439 = 0;
            arg0.field431 = 0;
            arg0.field401 = arg0.field443[0] * 128 + arg0.field400 * 64;
            arg0.field414 = arg0.field420[0] * 128 + arg0.field400 * 64;
            arg0.method244();
        }
        Statics.method1543(arg0);
        arg0.field399 = false;
        if (arg0.field422 != -1) {
            class34 var17 = class34.method572(arg0.field422);
            if (var17 == null || var17.field890 == null) {
                arg0.field422 = -1;
            } else {
                arg0.field402++;
                if (arg0.field423 < var17.field890.length && arg0.field402 > var17.field887[arg0.field423]) {
                    arg0.field402 = 1;
                    arg0.field423++;
                    method1882(var17, arg0.field423, arg0.field401, arg0.field414);
                }
                if (arg0.field423 >= var17.field890.length) {
                    arg0.field402 = 0;
                    arg0.field423 = 0;
                    method1882(var17, arg0.field423, arg0.field401, arg0.field414);
                }
            }
        }
        if (arg0.field413 != -1 && field484 >= arg0.field433) {
            if (arg0.field398 < 0) {
                arg0.field398 = 0;
            }
            int var18 = class35.method115(arg0.field413).field900;
            if (var18 == -1) {
                arg0.field413 = -1;
            } else {
                class34 var19 = class34.method572(var18);
                if (var19 == null || var19.field890 == null) {
                    arg0.field413 = -1;
                } else {
                    arg0.field432++;
                    if (arg0.field398 < var19.field890.length && arg0.field432 > var19.field887[arg0.field398]) {
                        arg0.field432 = 1;
                        arg0.field398++;
                        method1882(var19, arg0.field398, arg0.field401, arg0.field414);
                    }
                    if (arg0.field398 >= var19.field890.length && (arg0.field398 < 0 || arg0.field398 >= var19.field890.length)) {
                        arg0.field413 = -1;
                    }
                }
            }
        }
        if (arg0.field425 != -1 && arg0.field428 <= 1) {
            class34 var20 = class34.method572(arg0.field425);
            if (var20.field885 == 1 && arg0.field452 > 0 && arg0.field439 <= field484 && arg0.field431 < field484) {
                arg0.field428 = 1;
                return;
            }
        }
        if (arg0.field425 != -1 && arg0.field428 == 0) {
            class34 var21 = class34.method572(arg0.field425);
            if (var21 == null || var21.field890 == null) {
                arg0.field425 = -1;
            } else {
                arg0.field427++;
                if (arg0.field426 < var21.field890.length && arg0.field427 > var21.field887[arg0.field426]) {
                    arg0.field427 = 1;
                    arg0.field426++;
                    method1882(var21, arg0.field426, arg0.field401, arg0.field414);
                }
                if (arg0.field426 >= var21.field890.length) {
                    arg0.field426 -= var21.field877;
                    arg0.field411++;
                    if (arg0.field411 >= var21.field884) {
                        arg0.field425 = -1;
                    } else if (arg0.field426 >= 0 && arg0.field426 < var21.field890.length) {
                        method1882(var21, arg0.field426, arg0.field401, arg0.field414);
                    } else {
                        arg0.field425 = -1;
                    }
                }
                arg0.field399 = var21.field869;
            }
        }
        if (arg0.field428 > 0) {
            arg0.field428--;
        }
    }

    @ObfuscatedName("ba.al(Laa;I)V")
    public static final void method1341(class27 arg0) {
        int var1 = arg0.field439 - field484;
        int var2 = arg0.field435 * 128 + arg0.field400 * 64;
        int var3 = arg0.field437 * 128 + arg0.field400 * 64;
        arg0.field401 += (var2 - arg0.field401) / var1;
        arg0.field414 += (var3 - arg0.field414) / var1;
        arg0.field440 = 0;
        if (arg0.field441 == 0) {
            arg0.field424 = 1024;
        }
        if (arg0.field441 == 1) {
            arg0.field424 = 1536;
        }
        if (arg0.field441 == 2) {
            arg0.field424 = 0;
        }
        if (arg0.field441 == 3) {
            arg0.field424 = 512;
        }
    }

    @ObfuscatedName("ck.ah(Ln;III)V")
    public static void method1873(class3 arg0, int arg1, int arg2) {
        if (arg0.field425 == arg1 && arg1 != -1) {
            int var3 = class34.method572(arg1).field893;
            if (var3 == 1) {
                arg0.field426 = 0;
                arg0.field427 = 0;
                arg0.field428 = arg2;
                arg0.field411 = 0;
            }
            if (var3 == 2) {
                arg0.field411 = 0;
            }
        } else if (arg1 == -1 || arg0.field425 == -1 || class34.method572(arg1).field881 >= class34.method572(arg0.field425).field881) {
            arg0.field425 = arg1;
            arg0.field426 = 0;
            arg0.field427 = 0;
            arg0.field428 = arg2;
            arg0.field411 = 0;
            arg0.field452 = arg0.field447;
        }
    }

    @ObfuscatedName("aa.am(Ljava/lang/String;ZB)V")
    public static final void method255(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1818.method3438(arg0, 250);
        int var6 = Statics.field1818.method3402(arg0, 250) * 13;
        class89.method1801(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1808(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1818.method3464(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method146(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field268.getGraphics();
                Statics.field1289.method1626(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field268.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field673; var13++) {
            if (field667[var13] + field665[var13] > var9 && field665[var13] < var9 + var11 && field668[var13] + field621[var13] > var10 && field621[var13] < var10 + var12) {
                field663[var13] = true;
            }
        }
    }

    @ObfuscatedName("j.ab(ZI)V")
    public static final void method149(boolean arg0) {
        if (Statics.field1424.field401 >> 7 == field691 && Statics.field1424.field414 >> 7 == field480) {
            field691 = 0;
        }
        int var1 = field483;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1424;
                var4 = 33538048;
            } else {
                var3 = field499[field514[var2]];
                var4 = field514[var2] << 14;
            }
            if (var3 != null && var3.method22()) {
                var3.field51 = false;
                if ((field596 && field483 > 50 || field483 > 200) && !arg0 && var3.field422 == var3.field417) {
                    var3.field51 = true;
                }
                int var5 = var3.field401 >> 7;
                int var6 = var3.field414 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field46 == null || field484 < var3.field41 || field484 >= var3.field42) {
                        if ((var3.field401 & 0x7F) == 64 && (var3.field414 & 0x7F) == 64) {
                            if (field563 == field462[var5][var6]) {
                                continue;
                            }
                            field462[var5][var6] = field563;
                        }
                        var3.field40 = method845(var3.field401, var3.field414, Statics.field363);
                        Statics.field199.method1984(Statics.field363, var3.field401, var3.field414, var3.field40, 60, var3, var3.field416, var4, var3.field399);
                    } else {
                        var3.field51 = false;
                        var3.field40 = method845(var3.field401, var3.field414, Statics.field363);
                        Statics.field199.method1946(Statics.field363, var3.field401, var3.field414, var3.field40, 60, var3, var3.field416, var4, var3.field35, var3.field43, var3.field44, var3.field50);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ef.aq(ZI)V")
    public static final void method3022(boolean arg0) {
        for (int var1 = 0; var1 < field496; var1++) {
            class25 var2 = field495[field497[var1]];
            int var3 = (field497[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field371.field785 == arg0 && var2.field371.method603()) {
                int var4 = var2.field401 >> 7;
                int var5 = var2.field414 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field400 == 1 && (var2.field401 & 0x7F) == 64 && (var2.field414 & 0x7F) == 64) {
                        if (field563 == field462[var4][var5]) {
                            continue;
                        }
                        field462[var4][var5] = field563;
                    }
                    if (!var2.field371.field793) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field199.method1984(Statics.field363, var2.field401, var2.field414, method845(var2.field401 + (var2.field400 * 64 - 64), var2.field414 + (var2.field400 * 64 - 64), Statics.field363), var2.field400 * 64 - 64 + 60, var2, var2.field416, var3, var2.field399);
                }
            }
        }
    }

    @ObfuscatedName("p.ap(B)V")
    public static final void method232() {
        for (class20 var0 = (class20) field647.method3362(); var0 != null; var0 = (class20) field647.method3350()) {
            if (Statics.field363 != var0.field282 || var0.field285) {
                var0.method3374();
            } else if (field484 >= var0.field281) {
                var0.method182(field534);
                if (var0.field285) {
                    var0.method3374();
                } else {
                    Statics.field199.method1984(var0.field282, var0.field283, var0.field280, var0.field287, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("j.ar(I)I")
    public static final int method150() {
        if (Statics.field65.field177) {
            return Statics.field363;
        }
        int var0 = 3;
        if (Statics.field1646 < 310) {
            int var1 = Statics.field261 >> 7;
            int var2 = Statics.field188 >> 7;
            int var3 = Statics.field1424.field401 >> 7;
            int var4 = Statics.field1424.field414 >> 7;
            if ((class9.field115[Statics.field363][var1][var2] & 0x4) != 0) {
                var0 = Statics.field363;
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
                    if ((class9.field115[Statics.field363][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field363;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field115[Statics.field363][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field363;
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
                    if ((class9.field115[Statics.field363][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field363;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field115[Statics.field363][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field363;
                        }
                    }
                }
            }
        }
        if ((class9.field115[Statics.field363][Statics.field1424.field401 >> 7][Statics.field1424.field414 >> 7] & 0x4) != 0) {
            var0 = Statics.field363;
        }
        return var0;
    }

    @ObfuscatedName("am.as(III)V")
    public static final void method800(int arg0, int arg1) {
        if (field476 == 2) {
            method778((field479 - Statics.field10 << 7) + field482, (field693 - Statics.field289 << 7) + field630, field481 * 2);
            if (field564 > -1 && field484 % 20 < 10) {
                Statics.field851[0].method1709(field564 + arg0 - 12, field565 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bd.az(I)V")
    public static final void method1374() {
        field578 = 0;
        int var0 = (Statics.field1424.field401 >> 7) + Statics.field10;
        int var1 = (Statics.field1424.field414 >> 7) + Statics.field289;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field578 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field578 = 1;
        }
        if (field578 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field578 = 0;
        }
    }

    @ObfuscatedName("ek.aw(IIIIB)V")
    public static final void method2954(int arg0, int arg1, int arg2, int arg3) {
        if (field569 == 1) {
            Statics.field1319[field568 / 100].method1709(field501 - 8, field531 - 8);
        }
        if (field569 == 2) {
            Statics.field1319[field568 / 100 + 4].method1709(field501 - 8, field531 - 8);
        }
        method1374();
        if (!field592) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1818.method3405("Fps:" + field1302, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field596) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field596) {
            var8 = 16711680;
        }
        Statics.field1818.method3405("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("ah.av(IIIB)V")
    public static final void method778(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field564 = -1;
            field565 = -1;
            return;
        }
        int var3 = method845(arg0, arg1, Statics.field363) - arg2;
        int var4 = arg0 - Statics.field261;
        int var5 = var3 - Statics.field1389;
        int var6 = arg1 - Statics.field188;
        int var7 = class104.field1774[Statics.field1646];
        int var8 = class104.field1775[Statics.field1646];
        int var9 = class104.field1774[Statics.field2333];
        int var10 = class104.field1775[Statics.field2333];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field564 = (var11 << 9) / var15 + 256;
            field565 = (var14 << 9) / var15 + 167;
        } else {
            field564 = -1;
            field565 = -1;
        }
    }

    @ObfuscatedName("aq.ay(IIII)I")
    public static final int method845(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class9.field129[var5][var3][var4] + class9.field129[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field129[var5][var3][var4 + 1] + class9.field129[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ez.aj(ZI)V")
    public static final void method2900(boolean arg0) {
        field587 = arg0;
        if (!field587) {
            int var1 = field468.method2539();
            int var2 = field468.method2539();
            int var3 = field468.method2481();
            int var4 = field468.method2492();
            int var5 = field468.method2460();
            int var6 = (field678 - field468.field2033) / 16;
            Statics.field582 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field582[var7][var8] = field468.method2525();
                }
            }
            Statics.field1264 = new int[var6];
            Statics.field1239 = new int[var6];
            Statics.field799 = new int[var6];
            Statics.field759 = new byte[var6][];
            Statics.field854 = new byte[var6][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var5 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var5 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1264[var10] = var13;
                        Statics.field1239[var10] = Statics.field2453.method3034("m" + var11 + "_" + var12);
                        Statics.field799[var10] = Statics.field2453.method3034("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method10(var2, var5, var3, var1, var4);
            return;
        }
        int var14 = field468.method2492();
        int var15 = field468.method2491();
        int var16 = field468.method2590();
        int var17 = field468.method2492();
        field468.method2318();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field468.method2319(1);
                    if (var21 == 1) {
                        field520[var18][var19][var20] = field468.method2319(26);
                    } else {
                        field520[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field468.method2332();
        int var22 = (field678 - field468.field2033) / 16;
        Statics.field582 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field582[var23][var24] = field468.method2500();
            }
        }
        int var25 = field468.method2460();
        Statics.field1264 = new int[var22];
        Statics.field1239 = new int[var22];
        Statics.field799 = new int[var22];
        Statics.field759 = new byte[var22][];
        Statics.field854 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field520[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1264[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1264[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1239[var26] = Statics.field2453.method3034("m" + var35 + "_" + var36);
                            Statics.field799[var26] = Statics.field2453.method3034("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method10(var14, var17, var16, var15, var25);
    }

    @ObfuscatedName("t.ae(IIIIIB)V")
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1650 == arg0 && Statics.field1414 == arg1 && field511 == arg2 || !field596) {
            return;
        }
        Statics.field1650 = arg0;
        Statics.field1414 = arg1;
        field511 = arg2;
        if (!field596) {
            field511 = 0;
        }
        method766(25);
        method255(class135.field2097, true);
        int var5 = Statics.field10;
        int var6 = Statics.field289;
        Statics.field10 = (arg0 - 6) * 8;
        Statics.field289 = (arg1 - 6) * 8;
        int var7 = Statics.field10 - var5;
        int var8 = Statics.field289 - var6;
        int var9 = Statics.field10;
        int var10 = Statics.field289;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field495[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field443[var13] -= var7;
                    var12.field420[var13] -= var8;
                }
                var12.field401 -= var7 * 128;
                var12.field414 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field499[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field443[var16] -= var7;
                    var15.field420[var16] -= var8;
                }
                var15.field401 -= var7 * 128;
                var15.field414 -= var8 * 128;
            }
        }
        Statics.field363 = arg2;
        Statics.field1424.method242(arg3, arg4, false);
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
                        field645[var27][var23][var24] = field645[var27][var25][var26];
                    } else {
                        field645[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field674.method3362(); var28 != null; var28 = (class22) field674.method3350()) {
            var28.field342 -= var7;
            var28.field333 -= var8;
            if (var28.field342 < 0 || var28.field333 < 0 || var28.field342 >= 104 || var28.field333 >= 104) {
                var28.method3374();
            }
        }
        if (field691 != 0) {
            field691 -= var7;
            field480 -= var8;
        }
        field521 = 0;
        field705 = false;
        field686 = -1;
        field647.method3336();
        field595.method3336();
    }

    @ObfuscatedName("aa.au(ZI)V")
    public static final void method253(boolean arg0) {
        method2342();
        field504++;
        if (field504 < 50 && !arg0) {
            return;
        }
        field504 = 0;
        if (field509 || Statics.field172 == null) {
            return;
        }
        field694.method2316(153);
        try {
            Statics.field172.method1396(field694.field2030, 0, field694.field2033);
            field694.field2033 = 0;
        } catch (IOException var2) {
            field509 = true;
        }
    }

    @ObfuscatedName("l.ao(B)V")
    public static final void method37() {
        method253(false);
        field512 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field759.length; var1++) {
            if (Statics.field1239[var1] != -1 && Statics.field759[var1] == null) {
                Statics.field759[var1] = Statics.field2453.method3035(Statics.field1239[var1], 0);
                if (Statics.field759[var1] == null) {
                    var0 = false;
                    field512++;
                }
            }
            if (Statics.field799[var1] != -1 && Statics.field854[var1] == null) {
                Statics.field854[var1] = Statics.field2453.method3036(Statics.field799[var1], 0, Statics.field582[var1]);
                if (Statics.field854[var1] == null) {
                    var0 = false;
                    field512++;
                }
            }
        }
        if (!var0) {
            field516 = 1;
            return;
        }
        field606 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field759.length; var3++) {
            byte[] var4 = Statics.field854[var3];
            if (var4 != null) {
                int var5 = (Statics.field1264[var3] >> 8) * 64 - Statics.field10;
                int var6 = (Statics.field1264[var3] & 0xFF) * 64 - Statics.field289;
                if (field587) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class127 var9 = new class127(var4);
                int var10 = -1;
                label425: while (true) {
                    int var11 = var9.method2471();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2471();
                            if (var16 == 0) {
                                continue label425;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2458() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class32 var22 = class32.method874(var10);
                                if (var19 != 22 || !field596 || var22.field821 != 0 || var22.field819 == 1 || var22.field849) {
                                    if (!var22.method633()) {
                                        field606++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2471();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2458();
                    }
                }
            }
        }
        if (!var2) {
            field516 = 2;
            return;
        }
        if (field516 != 0) {
            method255(class135.field2097 + class2.field22 + class2.field33 + 100 + "%" + class2.field16, true);
        }
        method2342();
        method774();
        method2342();
        Statics.field199.method2044();
        method2342();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field680[var23].method2720();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field115[var24][var25][var26] = 0;
                }
            }
        }
        method2342();
        class9.method240();
        int var27 = Statics.field759.length;
        class7.method1559();
        method253(true);
        if (!field587) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1264[var28] >> 8) * 64 - Statics.field10;
                int var30 = (Statics.field1264[var28] & 0xFF) * 64 - Statics.field289;
                byte[] var31 = Statics.field759[var28];
                if (var31 != null) {
                    method2342();
                    int var32 = Statics.field1650 * 8 - 48;
                    int var33 = Statics.field1414 * 8 - 48;
                    class130[] var34 = field680;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2036[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class127 var38 = new class127(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class9.method876(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field1264[var42] >> 8) * 64 - Statics.field10;
                int var44 = (Statics.field1264[var42] & 0xFF) * 64 - Statics.field289;
                byte[] var45 = Statics.field759[var42];
                if (var45 == null && Statics.field1414 < 800) {
                    method2342();
                    class9.method43(var43, var44, 64, 64);
                }
            }
            method253(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field854[var46];
                if (var47 != null) {
                    int var48 = (Statics.field1264[var46] >> 8) * 64 - Statics.field10;
                    int var49 = (Statics.field1264[var46] & 0xFF) * 64 - Statics.field289;
                    method2342();
                    class9.method46(var47, var48, var49, Statics.field199, field680);
                }
            }
        }
        if (field587) {
            for (int var50 = 0; var50 < 4; var50++) {
                method2342();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field520[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field1264.length; var60++) {
                                if (Statics.field1264[var60] == var59 && Statics.field759[var60] != null) {
                                    class9.method229(Statics.field759[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field680);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class9.method793(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = field520[0][var61][var62];
                    if (var63 == -1) {
                        class9.method43(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            method253(true);
            for (int var64 = 0; var64 < 4; var64++) {
                method2342();
                for (int var65 = 0; var65 < 13; var65++) {
                    for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = field520[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < Statics.field1264.length; var73++) {
                                if (Statics.field1264[var73] == var72 && Statics.field854[var73] != null) {
                                    class9.method140(Statics.field854[var73], var64, var65 * 8, var66 * 8, var68, (var70 & 0x7) * 8, (var71 & 0x7) * 8, var69, Statics.field199, field680);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method253(true);
        method774();
        method2342();
        class9.method2740(Statics.field199, field680);
        method253(true);
        int var74 = class9.field116;
        if (var74 > Statics.field363) {
            var74 = Statics.field363;
        }
        if (var74 < Statics.field363 - 1) {
            int var75 = Statics.field363 - 1;
        }
        if (field596) {
            Statics.field199.method1885(class9.field116);
        } else {
            Statics.field199.method1885(0);
        }
        for (int var76 = 0; var76 < 104; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                method29(var76, var77);
            }
        }
        method2342();
        method2053();
        class32.field805.method3271();
        if (Statics.field740 != null) {
            field694.method2316(109);
            field694.method2447(1057001181);
        }
        if (!field587) {
            int var78 = (Statics.field1650 - 6) / 8;
            int var79 = (Statics.field1650 + 6) / 8;
            int var80 = (Statics.field1414 - 6) / 8;
            int var81 = (Statics.field1414 + 6) / 8;
            for (int var82 = var78 - 1; var82 <= var79 + 1; var82++) {
                for (int var83 = var80 - 1; var83 <= var81 + 1; var83++) {
                    if (var82 < var78 || var82 > var79 || var83 < var80 || var83 > var81) {
                        Statics.field2453.method3053("m" + var82 + "_" + var83);
                        Statics.field2453.method3053("l" + var82 + "_" + var83);
                    }
                }
            }
        }
        method766(30);
        method2342();
        class9.method2958();
        field694.method2316(33);
        Statics.method163();
    }

    @ObfuscatedName("bm.ak(II)V")
    public static final void method1445(int arg0) {
        int[] var1 = Statics.field100.field1457;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field115[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field199.method1982(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field115[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field199.method1982(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field100.method1784();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field115[arg0][var10][var9] & 0x18) == 0) {
                    method164(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field115[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method164(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field687 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field199.method1913(Statics.field363, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method874(var14).field830;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field680[Statics.field363].field2036;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x1240108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x1240180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x1240102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x1240120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        field690[field687] = Statics.field1807[var15];
                        field650[field687] = var16;
                        field689[field687] = var17;
                        field687++;
                    }
                }
            }
        }
        Statics.field1289.method1693();
    }

    @ObfuscatedName("a.bg(IIIIII)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field199.method1910(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field199.method1914(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field100.field1457;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method874(var12);
            if (var13.field831 == -1) {
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
                class87 var14 = Statics.field533[var13.field831];
                if (var14 != null) {
                    int var15 = (var13.field812 * 4 - var14.field1471) / 2;
                    int var16 = (var13.field818 * 4 - var14.field1472) / 2;
                    var14.method1788(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field818) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field199.method1912(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field199.method1914(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method874(var21);
            if (var22.field831 != -1) {
                class87 var23 = Statics.field533[var22.field831];
                if (var23 != null) {
                    int var24 = (var22.field812 * 4 - var23.field1471) / 2;
                    int var25 = (var22.field818 * 4 - var23.field1472) / 2;
                    var23.method1788(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field818) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field100.field1457;
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
        int var29 = Statics.field199.method1913(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method874(var30);
        if (var31.field831 == -1) {
            return;
        }
        class87 var32 = Statics.field533[var31.field831];
        if (var32 != null) {
            int var33 = (var31.field812 * 4 - var32.field1471) / 2;
            int var34 = (var31.field818 * 4 - var32.field1472) / 2;
            var32.method1788(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field818) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("l.br(B)V")
    public static final void method33() {
        if (field502 == 173) {
            int var0 = field468.method2539();
            int var1 = field468.method2647();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1013;
            int var3 = (var1 & 0x7) + Statics.field2088;
            int var4 = field468.method2458();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field593[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 103 && var3 < 103) {
                if (var7 == 0) {
                    class96 var8 = Statics.field199.method1906(Statics.field363, var2, var3);
                    if (var8 != null) {
                        int var9 = var8.field1615 >> 14 & 0x7FFF;
                        if (var5 == 2) {
                            var8.field1613 = new class14(var9, 2, var6 + 4, Statics.field363, var2, var3, var0, false, var8.field1613);
                            var8.field1614 = new class14(var9, 2, var6 + 1 & 0x3, Statics.field363, var2, var3, var0, false, var8.field1614);
                        } else {
                            var8.field1613 = new class14(var9, var5, var6, Statics.field363, var2, var3, var0, false, var8.field1613);
                        }
                    }
                }
                if (var7 == 1) {
                    class108 var10 = Statics.field199.method1907(Statics.field363, var2, var3);
                    if (var10 != null) {
                        int var11 = var10.field1799 >> 14 & 0x7FFF;
                        if (var5 == 4 || var5 == 5) {
                            var10.field1800 = new class14(var11, 4, var6, Statics.field363, var2, var3, var0, false, var10.field1800);
                        } else if (var5 == 6) {
                            var10.field1800 = new class14(var11, 4, var6 + 4, Statics.field363, var2, var3, var0, false, var10.field1800);
                        } else if (var5 == 7) {
                            var10.field1800 = new class14(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field363, var2, var3, var0, false, var10.field1800);
                        } else if (var5 == 8) {
                            var10.field1800 = new class14(var11, 4, var6 + 4, Statics.field363, var2, var3, var0, false, var10.field1800);
                            var10.field1790 = new class14(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field363, var2, var3, var0, false, var10.field1790);
                        }
                    }
                }
                if (var7 == 2) {
                    class98 var12 = Statics.field199.method1908(Statics.field363, var2, var3);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var12 != null) {
                        var12.field1640 = new class14(var12.field1642 >> 14 & 0x7FFF, var5, var6, Statics.field363, var2, var3, var0, false, var12.field1640);
                    }
                }
                if (var7 == 3) {
                    class107 var13 = Statics.field199.method1957(Statics.field363, var2, var3);
                    if (var13 != null) {
                        var13.field1787 = new class14(var13.field1784 >> 14 & 0x7FFF, 22, var6, Statics.field363, var2, var3, var0, false, var13.field1787);
                    }
                }
            }
        } else if (field502 == 38) {
            int var14 = field468.method2481();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field593[var15];
            int var18 = field468.method2460();
            int var19 = field468.method2647();
            int var20 = (var19 >> 4 & 0x7) + Statics.field1013;
            int var21 = (var19 & 0x7) + Statics.field2088;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                method729(Statics.field363, var20, var21, var17, var18, var15, var16, 0, -1);
            }
        } else if (field502 == 14) {
            int var22 = field468.method2458();
            int var23 = (var22 >> 4 & 0x7) + Statics.field1013;
            int var24 = (var22 & 0x7) + Statics.field2088;
            int var25 = field468.method2647();
            int var26 = var25 >> 2;
            int var27 = var25 & 0x3;
            int var28 = field593[var26];
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                method729(Statics.field363, var23, var24, var28, -1, var26, var27, 0, -1);
            }
        } else {
            if (field502 == 86) {
                byte var29 = field468.method2564();
                byte var30 = field468.method2486();
                int var31 = field468.method2492();
                byte var32 = field468.method2484();
                int var33 = field468.method2492();
                byte var34 = field468.method2459();
                int var35 = field468.method2491();
                int var36 = field468.method2647();
                int var37 = var36 >> 2;
                int var38 = var36 & 0x3;
                int var39 = field593[var37];
                int var40 = field468.method2492();
                int var41 = field468.method2647();
                int var42 = (var41 >> 4 & 0x7) + Statics.field1013;
                int var43 = (var41 & 0x7) + Statics.field2088;
                class3 var44;
                if (field585 == var35) {
                    var44 = Statics.field1424;
                } else {
                    var44 = field499[var35];
                }
                if (var44 != null) {
                    class32 var45 = class32.method874(var33);
                    int var46;
                    int var47;
                    if (var38 == 1 || var38 == 3) {
                        var46 = var45.field818;
                        var47 = var45.field812;
                    } else {
                        var46 = var45.field812;
                        var47 = var45.field818;
                    }
                    int var48 = (var46 >> 1) + var42;
                    int var49 = (var46 + 1 >> 1) + var42;
                    int var50 = (var47 >> 1) + var43;
                    int var51 = (var47 + 1 >> 1) + var43;
                    int[][] var52 = class9.field129[Statics.field363];
                    int var53 = var52[var48][var50] + var52[var49][var50] + var52[var48][var51] + var52[var49][var51] >> 2;
                    int var54 = (var42 << 7) + (var46 << 6);
                    int var55 = (var43 << 7) + (var47 << 6);
                    class112 var56 = var45.method635(var37, var38, var52, var54, var53, var55);
                    if (var56 != null) {
                        method729(Statics.field363, var42, var43, var39, -1, 0, 0, var31 + 1, var40 + 1);
                        var44.field41 = field484 + var31;
                        var44.field42 = field484 + var40;
                        var44.field46 = var56;
                        var44.field53 = var42 * 128 + var46 * 64;
                        var44.field36 = var43 * 128 + var47 * 64;
                        var44.field47 = var53;
                        if (var32 > var34) {
                            byte var57 = var32;
                            var32 = var34;
                            var34 = var57;
                        }
                        if (var29 > var30) {
                            byte var58 = var29;
                            var29 = var30;
                            var30 = var58;
                        }
                        var44.field35 = var32 + var42;
                        var44.field44 = var34 + var42;
                        var44.field43 = var29 + var43;
                        var44.field50 = var30 + var43;
                    }
                }
            }
            if (field502 == 161) {
                int var59 = field468.method2647();
                int var60 = (var59 >> 4 & 0x7) + Statics.field1013;
                int var61 = (var59 & 0x7) + Statics.field2088;
                int var62 = field468.method2491();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    class177 var63 = field645[Statics.field363][var60][var61];
                    if (var63 != null) {
                        for (class17 var64 = (class17) var63.method3362(); var64 != null; var64 = (class17) var63.method3350()) {
                            if ((var62 & 0x7FFF) == var64.field251) {
                                var64.method3374();
                                break;
                            }
                        }
                        if (var63.method3362() == null) {
                            field645[Statics.field363][var60][var61] = null;
                        }
                        method29(var60, var61);
                    }
                }
            } else if (field502 == 126) {
                int var65 = field468.method2458();
                int var66 = (var65 >> 4 & 0x7) + Statics.field1013;
                int var67 = (var65 & 0x7) + Statics.field2088;
                int var68 = var66 + field468.method2459();
                int var69 = var67 + field468.method2459();
                int var70 = field468.method2461();
                int var71 = field468.method2460();
                int var72 = field468.method2458() * 4;
                int var73 = field468.method2458() * 4;
                int var74 = field468.method2460();
                int var75 = field468.method2460();
                int var76 = field468.method2458();
                int var77 = field468.method2458();
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104 && var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var71 != 65535) {
                    int var78 = var66 * 128 + 64;
                    int var79 = var67 * 128 + 64;
                    int var80 = var68 * 128 + 64;
                    int var81 = var69 * 128 + 64;
                    class10 var82 = new class10(var71, Statics.field363, var78, var79, method845(var78, var79, Statics.field363) - var72, field484 + var74, field484 + var75, var76, var77, var70, var73);
                    var82.method110(var80, var81, method845(var80, var81, Statics.field363) - var73, field484 + var74);
                    field595.method3333(var82);
                }
            } else if (field502 == 172) {
                int var83 = field468.method2458();
                int var84 = (var83 >> 4 & 0x7) + Statics.field1013;
                int var85 = (var83 & 0x7) + Statics.field2088;
                int var86 = field468.method2460();
                int var87 = field468.method2458();
                int var88 = field468.method2460();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    int var89 = var84 * 128 + 64;
                    int var90 = var85 * 128 + 64;
                    class20 var91 = new class20(var86, Statics.field363, var89, var90, method845(var89, var90, Statics.field363) - var87, var88, field484);
                    field647.method3333(var91);
                }
            } else if (field502 == 242) {
                int var92 = field468.method2539();
                int var93 = field468.method2492();
                int var94 = field468.method2647();
                int var95 = (var94 >> 4 & 0x7) + Statics.field1013;
                int var96 = (var94 & 0x7) + Statics.field2088;
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class17 var97 = new class17();
                    var97.field251 = var92;
                    var97.field252 = var93;
                    if (field645[Statics.field363][var95][var96] == null) {
                        field645[Statics.field363][var95][var96] = new class177();
                    }
                    field645[Statics.field363][var95][var96].method3333(var97);
                    method29(var95, var96);
                }
            } else {
                if (field502 == 198) {
                    int var98 = field468.method2458();
                    int var99 = (var98 >> 4 & 0x7) + Statics.field1013;
                    int var100 = (var98 & 0x7) + Statics.field2088;
                    int var101 = field468.method2460();
                    int var102 = field468.method2458();
                    int var103 = var102 >> 4 & 0xF;
                    int var104 = var102 & 0x7;
                    int var105 = field468.method2458();
                    if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                        int var106 = var103 + 1;
                        if (Statics.field1424.field443[0] >= var99 - var106 && Statics.field1424.field443[0] <= var99 + var106 && Statics.field1424.field420[0] >= var100 - var106 && Statics.field1424.field420[0] <= var100 + var106 && field698 != 0 && var104 > 0 && field521 < 50) {
                            field700[field521] = var101;
                            field701[field521] = var104;
                            field702[field521] = var105;
                            field704[field521] = null;
                            field546[field521] = (var99 << 16) + (var100 << 8) + var103;
                            field521++;
                        }
                    }
                }
                if (field502 == 167) {
                    int var107 = field468.method2458();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1013;
                    int var109 = (var107 & 0x7) + Statics.field2088;
                    int var110 = field468.method2460();
                    int var111 = field468.method2460();
                    int var112 = field468.method2460();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class177 var113 = field645[Statics.field363][var108][var109];
                        if (var113 != null) {
                            for (class17 var114 = (class17) var113.method3362(); var114 != null; var114 = (class17) var113.method3350()) {
                                if ((var110 & 0x7FFF) == var114.field251 && var114.field252 == var111) {
                                    var114.field252 = var112;
                                    break;
                                }
                            }
                            method29(var108, var109);
                        }
                    }
                } else if (field502 == 138) {
                    int var115 = field468.method2458();
                    int var116 = (var115 >> 4 & 0x7) + Statics.field1013;
                    int var117 = (var115 & 0x7) + Statics.field2088;
                    int var118 = field468.method2539();
                    int var119 = field468.method2460();
                    int var120 = field468.method2491();
                    if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104 && field585 != var118) {
                        class17 var121 = new class17();
                        var121.field251 = var120;
                        var121.field252 = var119;
                        if (field645[Statics.field363][var116][var117] == null) {
                            field645[Statics.field363][var116][var117] = new class177();
                        }
                        field645[Statics.field363][var116][var117].method3333(var121);
                        method29(var116, var117);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.bw(IIIIIIIIIB)V")
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field674.method3362(); var10 != null; var10 = (class22) field674.method3350()) {
            if (var10.field334 == arg0 && var10.field342 == arg1 && var10.field333 == arg2 && var10.field338 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field334 = arg0;
            var9.field338 = arg3;
            var9.field342 = arg1;
            var9.field333 = arg2;
            method154(var9);
            field674.method3333(var9);
        }
        var9.field339 = arg4;
        var9.field343 = arg5;
        var9.field340 = arg6;
        var9.field335 = arg7;
        var9.field332 = arg8;
    }

    @ObfuscatedName("ch.bc(B)V")
    public static final void method2053() {
        for (class22 var0 = (class22) field674.method3362(); var0 != null; var0 = (class22) field674.method3350()) {
            if (var0.field332 == -1) {
                var0.field335 = 0;
                method154(var0);
            } else {
                var0.method3374();
            }
        }
    }

    @ObfuscatedName("j.bn(Lh;B)V")
    public static final void method154(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field338 == 0) {
            var1 = Statics.field199.method1910(arg0.field334, arg0.field342, arg0.field333);
        }
        if (arg0.field338 == 1) {
            var1 = Statics.field199.method1977(arg0.field334, arg0.field342, arg0.field333);
        }
        if (arg0.field338 == 2) {
            var1 = Statics.field199.method1912(arg0.field334, arg0.field342, arg0.field333);
        }
        if (arg0.field338 == 3) {
            var1 = Statics.field199.method1913(arg0.field334, arg0.field342, arg0.field333);
        }
        if (var1 != 0) {
            int var5 = Statics.field199.method1914(arg0.field334, arg0.field342, arg0.field333, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field336 = var2;
        arg0.field341 = var3;
        arg0.field337 = var4;
    }

    @ObfuscatedName("a.bo(IIIIIIII)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field596 && Statics.field363 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field199.method1910(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field199.method1977(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field199.method1912(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field199.method1913(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field199.method1914(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field199.method1901(arg0, arg2, arg3);
                class32 var15 = class32.method874(var12);
                if (var15.field819 != 0) {
                    field680[arg0].method2692(arg2, arg3, var13, var14, var15.field820);
                }
            }
            if (arg1 == 1) {
                Statics.field199.method1951(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field199.method1911(arg0, arg2, arg3);
                class32 var16 = class32.method874(var12);
                if (var16.field812 + arg2 > 103 || var16.field812 + arg3 > 103 || var16.field818 + arg2 > 103 || var16.field818 + arg3 > 103) {
                    return;
                }
                if (var16.field819 != 0) {
                    field680[arg0].method2685(arg2, arg3, var16.field812, var16.field818, var14, var16.field820);
                }
            }
            if (arg1 == 3) {
                Statics.field199.method1904(arg0, arg2, arg3);
                class32 var17 = class32.method874(var12);
                if (var17.field819 == 1) {
                    field680[arg0].method2695(arg2, arg3);
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
        class9.method1558(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field199, field680[arg0]);
    }

    @ObfuscatedName("e.by(III)V")
    public static final void method29(int arg0, int arg1) {
        class177 var2 = field645[Statics.field363][arg0][arg1];
        if (var2 == null) {
            Statics.field199.method1928(Statics.field363, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3362(); var6 != null; var6 = (class17) var2.method3350()) {
            class40 var7 = class40.method1433(var6.field251);
            long var8 = (long) var7.field966;
            if (var7.field985 == 1) {
                var8 = (long) (var6.field252 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field199.method1928(Statics.field363, arg0, arg1);
            return;
        }
        var2.method3334(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3362(); var12 != null; var12 = (class17) var2.method3350()) {
            if (var5.field251 != var12.field251) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field251 != var12.field251 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field199.method1891(Statics.field363, arg0, arg1, method845(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field363), var5, var13, var10, var11);
    }

    @ObfuscatedName("dt.bi(I)V")
    public static final void method2343() {
        field468.method2318();
        int var0 = field468.method2319(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field468.method2319(2);
        if (var1 == 0) {
            field583[++field677 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field468.method2319(3);
            Statics.field1424.method243(var2, false);
            int var3 = field468.method2319(1);
            if (var3 == 1) {
                field583[++field677 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field468.method2319(3);
            Statics.field1424.method243(var4, true);
            int var5 = field468.method2319(3);
            Statics.field1424.method243(var5, true);
            int var6 = field468.method2319(1);
            if (var6 == 1) {
                field583[++field677 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field468.method2319(7);
            int var8 = field468.method2319(7);
            Statics.field363 = field468.method2319(2);
            int var9 = field468.method2319(1);
            int var10 = field468.method2319(1);
            if (var10 == 1) {
                field583[++field677 - 1] = 2047;
            }
            Statics.field1424.method242(var7, var8, var9 == 1);
        }
    }

    @ObfuscatedName("m.bk(B)V")
    public static final void method171() {
        while (true) {
            if (field468.method2328(field678) >= 11) {
                int var0 = field468.method2319(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field499[var0] == null) {
                        field499[var0] = new class3();
                        if (field555[var0] != null) {
                            field499[var0].method12(field555[var0]);
                        }
                        var1 = true;
                    }
                    field514[++field483 - 1] = var0;
                    class3 var2 = field499[var0];
                    var2.field442 = field484;
                    int var3 = field468.method2319(1);
                    int var4 = field468.method2319(1);
                    if (var4 == 1) {
                        field583[++field677 - 1] = var0;
                    }
                    int var5 = field468.method2319(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field468.method2319(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field584[field468.method2319(3)];
                    if (var1) {
                        var2.field424 = var2.field416 = var7;
                    }
                    var2.method242(Statics.field1424.field443[0] + var5, Statics.field1424.field420[0] + var6, var3 == 1);
                    continue;
                }
            }
            field468.method2332();
            return;
        }
    }

    @ObfuscatedName("bq.ba(I)V")
    public static final void method1564() {
        for (int var0 = 0; var0 < field677; var0++) {
            int var1 = field583[var0];
            class3 var2 = field499[var1];
            int var3 = field468.method2458();
            if ((var3 & 0x80) != 0) {
                var3 += field468.method2458() << 8;
            }
            Statics.method1560(var1, var2, var3);
        }
    }

    @ObfuscatedName("j.bs(I)V")
    public static final void method153() {
        field468.method2318();
        int var0 = field468.method2319(8);
        if (var0 < field496) {
            for (int var1 = var0; var1 < field496; var1++) {
                field588[++field658 - 1] = field497[var1];
            }
        }
        if (var0 > field496) {
            throw new RuntimeException("");
        }
        field496 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field497[var2];
            class25 var4 = field495[var3];
            int var5 = field468.method2319(1);
            if (var5 == 0) {
                field497[++field496 - 1] = var3;
                var4.field442 = field484;
            } else {
                int var6 = field468.method2319(2);
                if (var6 == 0) {
                    field497[++field496 - 1] = var3;
                    var4.field442 = field484;
                    field583[++field677 - 1] = var3;
                } else if (var6 == 1) {
                    field497[++field496 - 1] = var3;
                    var4.field442 = field484;
                    int var7 = field468.method2319(3);
                    var4.method243(var7, false);
                    int var8 = field468.method2319(1);
                    if (var8 == 1) {
                        field583[++field677 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field497[++field496 - 1] = var3;
                    var4.field442 = field484;
                    int var9 = field468.method2319(3);
                    var4.method243(var9, true);
                    int var10 = field468.method2319(3);
                    var4.method243(var10, true);
                    int var11 = field468.method2319(1);
                    if (var11 == 1) {
                        field583[++field677 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field588[++field658 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("r.bd(B)V")
    public static final void method56() {
        while (true) {
            if (field468.method2328(field678) >= 27) {
                int var0 = field468.method2319(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field495[var0] == null) {
                        field495[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field495[var0];
                    field497[++field496 - 1] = var0;
                    var2.field442 = field484;
                    int var3 = field468.method2319(1);
                    if (var3 == 1) {
                        field583[++field677 - 1] = var0;
                    }
                    int var4 = field468.method2319(1);
                    var2.field371 = class31.method2320(field468.method2319(14));
                    int var5 = field584[field468.method2319(3)];
                    if (var1) {
                        var2.field424 = var2.field416 = var5;
                    }
                    int var6 = field468.method2319(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field468.method2319(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field400 = var2.field371.field766;
                    var2.field446 = var2.field371.field761;
                    if (var2.field446 == 0) {
                        var2.field416 = 0;
                    }
                    var2.field404 = var2.field371.field772;
                    var2.field405 = var2.field371.field775;
                    var2.field406 = var2.field371.field789;
                    var2.field396 = var2.field371.field780;
                    var2.field417 = var2.field371.field769;
                    var2.field407 = var2.field371.field770;
                    var2.field403 = var2.field371.field771;
                    var2.method242(Statics.field1424.field443[0] + var6, Statics.field1424.field420[0] + var7, var4 == 1);
                    continue;
                }
            }
            field468.method2332();
            return;
        }
    }

    @ObfuscatedName("z.bh(B)V")
    public static final void method185() {
        int var0 = Statics.field2086;
        int var1 = Statics.field1092;
        int var2 = Statics.field454;
        int var3 = Statics.field1171;
        int var4 = 6116423;
        class89.method1801(var0, var1, var2, var3, var4);
        class89.method1801(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class89.method1808(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field510.method3404(class135.field2234, var0 + 3, var1 + 14, var4, -1);
        int var5 = class77.field1376;
        int var6 = class77.field1375;
        for (int var7 = 0; var7 < field602; var7++) {
            int var8 = (field602 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class183 var10 = Statics.field510;
            String var11;
            if (field608[var7].length() > 0) {
                var11 = field525[var7] + class135.field2241 + field608[var7];
            } else {
                var11 = field525[var7];
            }
            var10.method3404(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field2086;
        int var13 = Statics.field1092;
        int var14 = Statics.field454;
        int var15 = Statics.field1171;
        for (int var16 = 0; var16 < field673; var16++) {
            if (field667[var16] + field665[var16] > var12 && field665[var16] < var12 + var14 && field668[var16] + field621[var16] > var13 && field621[var16] < var13 + var15) {
                field663[var16] = true;
            }
        }
    }

    @ObfuscatedName("v.bp(IIIII)V")
    public static final void method146(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field673; var4++) {
            if (field667[var4] + field665[var4] > arg0 && field665[var4] < arg0 + arg2 && field668[var4] + field621[var4] > arg1 && field621[var4] < arg1 + arg3) {
                field662[var4] = true;
            }
        }
    }

    @ObfuscatedName("g.bb(B)V")
    public static final void method114() {
        int var0 = Statics.field510.method3400(class135.field2234);
        for (int var1 = 0; var1 < field602; var1++) {
            class183 var2 = Statics.field510;
            String var3;
            if (field608[var1].length() > 0) {
                var3 = field525[var1] + class135.field2241 + field608[var1];
            } else {
                var3 = field525[var1];
            }
            int var4 = var2.method3400(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field602 * 15 + 21;
        int var6 = class77.field1384 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1385;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field535 = true;
        Statics.field2086 = var6;
        Statics.field1092 = var7;
        Statics.field454 = var0;
        Statics.field1171 = field602 * 15 + 22;
    }

    @ObfuscatedName("c.bv(IB)Z")
    public static final boolean method167(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field605[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("m.bz(II)V")
    public static final void method179(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field603[arg0];
        int var2 = field604[arg0];
        int var3 = field605[arg0];
        int var4 = field500[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 1003) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            class25 var5 = field495[var4];
            if (var5 != null) {
                class31 var6 = var5.field371;
                if (var6.field762 != null) {
                    var6 = var6.method619();
                }
                if (var6 != null) {
                    field694.method2316(4);
                    field694.method2499(var6.field776);
                }
            }
        }
        if (var3 == 42) {
            field694.method2316(91);
            field694.method2499(var4);
            field694.method2447(var2);
            field694.method2499(var1);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 47) {
            class3 var7 = field499[var4];
            if (var7 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(88);
                field694.method2487(var4);
            }
        }
        if (var3 == 21) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(64);
            field694.method2499(Statics.field10 + var1);
            field694.method2487(Statics.field289 + var2);
            field694.method2487(var4);
        }
        if (var3 == 12) {
            class25 var8 = field495[var4];
            if (var8 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(171);
                field694.method2487(var4);
            }
        }
        if (var3 == 1002) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field694.method2316(244);
            field694.method2563(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 9) {
            class25 var9 = field495[var4];
            if (var9 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(46);
                field694.method2487(var4);
            }
        }
        if (var3 == 28) {
            field694.method2316(20);
            field694.method2447(var2);
            class159 var10 = class159.method2754(var2);
            if (var10.field2694 != null && var10.field2694[0][0] == 5) {
                int var11 = var10.field2694[0][1];
                class160.field2717[var11] = 1 - class160.field2717[var11];
                method5(var11);
            }
        }
        if (var3 == 38) {
            if (field615) {
                class159 var12 = Statics.method606(Statics.field1914, field581);
                if (var12 != null && var12.field2677 != null) {
                    class1 var13 = new class1();
                    var13.field9 = var12;
                    var13.field8 = var12.field2677;
                    class26.method2441(var13);
                }
                field615 = false;
                method640(var12);
            }
            class159 var14 = class159.method2754(var2);
            field631 = 1;
            Statics.field1257 = var1;
            Statics.field186 = var2;
            Statics.field248 = var4;
            method640(var14);
            field614 = class2.method1391(16748608) + class40.method1433(var4).field974 + class2.method1391(16777215);
            if (field614 == null) {
                field614 = "null";
            }
            return;
        }
        if (var3 == 41) {
            field694.method2316(5);
            field694.method2489(var4);
            field694.method2496(var2);
            field694.method2487(var1);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 49) {
            class3 var15 = field499[var4];
            if (var15 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(209);
                field694.method2563(var4);
            }
        }
        if (var3 == 19) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(238);
            field694.method2487(Statics.field289 + var2);
            field694.method2563(Statics.field10 + var1);
            field694.method2499(var4);
        }
        if (var3 == 3) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(175);
            field694.method2563(Statics.field10 + var1);
            field694.method2563(var4 >> 14 & 0x7FFF);
            field694.method2563(Statics.field289 + var2);
        }
        if (var3 == 1001) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(41);
            field694.method2489(Statics.field10 + var1);
            field694.method2563(Statics.field289 + var2);
            field694.method2563(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 43) {
            field694.method2316(200);
            field694.method2496(var2);
            field694.method2499(var4);
            field694.method2489(var1);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 58) {
            field694.method2316(231);
            field694.method2487(var1);
            field694.method2447(Statics.field1914);
            field694.method2499(field581);
            field694.method2496(var2);
        }
        if (var3 == 24) {
            class159 var16 = class159.method2754(var2);
            boolean var17 = true;
            if (var16.field2653 > 0) {
                var17 = method887(var16);
            }
            if (var17) {
                field694.method2316(20);
                field694.method2447(var2);
            }
        }
        if (var3 == 23) {
            Statics.field199.method1921(Statics.field363, var1, var2);
        }
        if (var3 == 6) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(196);
            field694.method2487(Statics.field289 + var2);
            field694.method2499(Statics.field10 + var1);
            field694.method2563(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 7) {
            class25 var18 = field495[var4];
            if (var18 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(240);
                field694.method2563(var4);
                field694.method2447(Statics.field186);
                field694.method2563(Statics.field248);
                field694.method2499(Statics.field1257);
            }
        }
        if (var3 == 33) {
            field694.method2316(164);
            field694.method2447(var2);
            field694.method2489(var1);
            field694.method2499(var4);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 39) {
            field694.method2316(217);
            field694.method2496(var2);
            field694.method2499(var1);
            field694.method2489(var4);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 1004) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field694.method2316(158);
            field694.method2499(var4);
        }
        if (var3 == 22) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(155);
            field694.method2563(Statics.field10 + var1);
            field694.method2563(var4);
            field694.method2563(Statics.field289 + var2);
        }
        if (var3 == 18) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(83);
            field694.method2489(Statics.field10 + var1);
            field694.method2563(var4);
            field694.method2489(Statics.field289 + var2);
        }
        if (var3 == 31) {
            field694.method2316(251);
            field694.method2499(var1);
            field694.method2563(var4);
            field694.method2568(var2);
            field694.method2499(Statics.field1257);
            field694.method2499(Statics.field248);
            field694.method2447(Statics.field186);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 48) {
            class3 var19 = field499[var4];
            if (var19 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(29);
                field694.method2489(var4);
            }
        }
        if (var3 == 4) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(60);
            field694.method2487(var4 >> 14 & 0x7FFF);
            field694.method2563(Statics.field289 + var2);
            field694.method2499(Statics.field10 + var1);
        }
        if (var3 == 25) {
            class159 var20 = Statics.method606(var2, var1);
            if (var20 != null) {
                if (field615) {
                    class159 var21 = Statics.method606(Statics.field1914, field581);
                    if (var21 != null && var21.field2677 != null) {
                        class1 var22 = new class1();
                        var22.field9 = var21;
                        var22.field8 = var21.field2677;
                        class26.method2441(var22);
                    }
                    field615 = false;
                    method640(var21);
                }
                int var23 = class163.method168(method544(var20));
                class159 var24 = Statics.method606(var2, var1);
                if (var24 != null && var24.field2676 != null) {
                    class1 var25 = new class1();
                    var25.field9 = var24;
                    var25.field8 = var24.field2676;
                    class26.method2441(var25);
                }
                field615 = true;
                Statics.field1914 = var2;
                field581 = var1;
                Statics.field1245 = var23;
                method640(var24);
                field631 = 0;
                field517 = method2234(var20);
                if (field517 == null) {
                    field517 = "Null";
                }
                if (var20.field2597) {
                    field575 = var20.field2658 + class2.method1391(16777215);
                } else {
                    field575 = class2.method1391(65280) + var20.field2621 + class2.method1391(16777215);
                }
            }
            return;
        }
        if (var3 == 8) {
            class25 var26 = field495[var4];
            if (var26 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(78);
                field694.method2568(Statics.field1914);
                field694.method2487(field581);
                field694.method2489(var4);
            }
        }
        if (var3 == 30 && field712 == null) {
            field694.method2316(85);
            field694.method2568(var2);
            field694.method2499(var1);
            field712 = Statics.method606(var2, var1);
            method640(field712);
        }
        if (var3 == 45) {
            class3 var27 = field499[var4];
            if (var27 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(201);
                field694.method2499(var4);
            }
        }
        if (var3 == 32) {
            field694.method2316(163);
            field694.method2496(Statics.field1914);
            field694.method2489(var4);
            field694.method2496(var2);
            field694.method2563(var1);
            field694.method2563(field581);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 40) {
            field694.method2316(44);
            field694.method2487(var1);
            field694.method2496(var2);
            field694.method2489(var4);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 29) {
            field694.method2316(20);
            field694.method2447(var2);
            class159 var28 = class159.method2754(var2);
            if (var28.field2694 != null && var28.field2694[0][0] == 5) {
                int var29 = var28.field2694[0][1];
                if (class160.field2717[var29] != var28.field2696[0]) {
                    class160.field2717[var29] = var28.field2696[0];
                    method5(var29);
                }
            }
        }
        if (var3 == 11) {
            class25 var30 = field495[var4];
            if (var30 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(146);
                field694.method2487(var4);
            }
        }
        if (var3 == 36) {
            field694.method2316(54);
            field694.method2489(var4);
            field694.method2498(var2);
            field694.method2487(var1);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 17) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(100);
            field694.method2498(Statics.field1914);
            field694.method2563(field581);
            field694.method2499(Statics.field289 + var2);
            field694.method2487(Statics.field10 + var1);
            field694.method2489(var4);
        }
        if (var3 == 13) {
            class25 var31 = field495[var4];
            if (var31 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(0);
                field694.method2489(var4);
            }
        }
        if (var3 == 1) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(57);
            field694.method2563(Statics.field289 + var2);
            field694.method2563(var4 >> 14 & 0x7FFF);
            field694.method2489(Statics.field10 + var1);
            field694.method2499(Statics.field248);
            field694.method2563(Statics.field1257);
            field694.method2447(Statics.field186);
        }
        if (var3 == 44) {
            class3 var32 = field499[var4];
            if (var32 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(99);
                field694.method2499(var4);
            }
        }
        if (var3 == 35) {
            field694.method2316(28);
            field694.method2447(var2);
            field694.method2563(var4);
            field694.method2563(var1);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 16) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(253);
            field694.method2489(var4);
            field694.method2563(Statics.field1257);
            field694.method2499(Statics.field289 + var2);
            field694.method2447(Statics.field186);
            field694.method2487(Statics.field10 + var1);
            field694.method2487(Statics.field248);
        }
        if (var3 == 34) {
            field694.method2316(130);
            field694.method2447(var2);
            field694.method2487(var1);
            field694.method2489(var4);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 15) {
            class3 var33 = field499[var4];
            if (var33 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(82);
                field694.method2489(var4);
                field694.method2496(Statics.field1914);
                field694.method2489(field581);
            }
        }
        if (var3 == 10) {
            class25 var34 = field495[var4];
            if (var34 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(151);
                field694.method2499(var4);
            }
        }
        if (var3 == 50) {
            class3 var35 = field499[var4];
            if (var35 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(198);
                field694.method2499(var4);
            }
        }
        if (var3 == 5) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(242);
            field694.method2499(Statics.field289 + var2);
            field694.method2563(Statics.field10 + var1);
            field694.method2499(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 57 || var3 == 1007) {
            method233(var4, var2, var1, field608[arg0]);
        }
        if (var3 == 20) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(237);
            field694.method2487(Statics.field10 + var1);
            field694.method2499(var4);
            field694.method2499(Statics.field289 + var2);
        }
        if (var3 == 1005) {
            class159 var36 = class159.method2754(var2);
            if (var36 == null || var36.field2701[var1] < 100000) {
                field694.method2316(158);
                field694.method2499(var4);
            } else {
                method731(0, "", var36.field2701[var1] + " x " + class40.method1433(var4).field974);
            }
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 26) {
            field694.method2316(206);
            for (class4 var37 = (class4) field620.method3315(); var37 != null; var37 = (class4) field620.method3316()) {
                if (var37.field57 == 0 || var37.field57 == 3) {
                    method2218(var37, true);
                }
            }
            if (field712 != null) {
                method640(field712);
                field712 = null;
            }
        }
        if (var3 == 14) {
            class3 var38 = field499[var4];
            if (var38 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(144);
                field694.method2489(Statics.field248);
                field694.method2563(Statics.field1257);
                field694.method2447(Statics.field186);
                field694.method2499(var4);
            }
        }
        if (var3 == 51) {
            class3 var39 = field499[var4];
            if (var39 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(126);
                field694.method2489(var4);
            }
        }
        if (var3 == 2) {
            field501 = class77.field1384;
            field531 = class77.field1385;
            field569 = 2;
            field568 = 0;
            field691 = var1;
            field480 = var2;
            field694.method2316(145);
            field694.method2489(Statics.field10 + var1);
            field694.method2498(Statics.field1914);
            field694.method2499(field581);
            field694.method2499(var4 >> 14 & 0x7FFF);
            field694.method2487(Statics.field289 + var2);
        }
        if (var3 == 37) {
            field694.method2316(229);
            field694.method2498(var2);
            field694.method2489(var1);
            field694.method2487(var4);
            field570 = 0;
            Statics.field354 = class159.method2754(var2);
            field601 = var1;
        }
        if (var3 == 46) {
            class3 var40 = field499[var4];
            if (var40 != null) {
                field501 = class77.field1384;
                field531 = class77.field1385;
                field569 = 2;
                field568 = 0;
                field691 = var1;
                field480 = var2;
                field694.method2316(47);
                field694.method2499(var4);
            }
        }
        if (field631 != 0) {
            field631 = 0;
            method640(class159.method2754(Statics.field186));
        }
        if (field615 && field615) {
            class159 var41 = Statics.method606(Statics.field1914, field581);
            if (var41 != null && var41.field2677 != null) {
                class1 var42 = new class1();
                var42.field9 = var41;
                var42.field8 = var41.field2677;
                class26.method2441(var42);
            }
            field615 = false;
            method640(var41);
        }
        if (Statics.field354 != null && field570 == 0) {
            method640(Statics.field354);
        }
    }

    @ObfuscatedName("p.bl(IIILjava/lang/String;I)V")
    public static void method233(int arg0, int arg1, int arg2, String arg3) {
        class159 var4 = Statics.method606(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2685 != null) {
            class1 var5 = new class1();
            var5.field9 = var4;
            var5.field5 = arg0;
            var5.field4 = arg3;
            var5.field8 = var4.field2685;
            class26.method2441(var5);
        }
        boolean var6 = true;
        if (var4.field2653 > 0) {
            var6 = method887(var4);
        }
        if (!var6 || !Statics.method661(method544(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field694.method2316(250);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 2) {
            field694.method2316(55);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 3) {
            field694.method2316(8);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 4) {
            field694.method2316(40);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 5) {
            field694.method2316(211);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 6) {
            field694.method2316(58);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 7) {
            field694.method2316(115);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 8) {
            field694.method2316(207);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 9) {
            field694.method2316(63);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
        if (arg0 == 10) {
            field694.method2316(76);
            field694.method2447(arg1);
            field694.method2563(arg2);
        }
    }

    @ObfuscatedName("s.bu(I)V")
    public static final void method129() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field602 - 1; var1++) {
                if (field605[var1] < 1000 && field605[var1 + 1] > 1000) {
                    String var2 = field608[var1];
                    field608[var1] = field608[var1 + 1];
                    field608[var1 + 1] = var2;
                    String var3 = field525[var1];
                    field525[var1] = field525[var1 + 1];
                    field525[var1 + 1] = var3;
                    int var4 = field605[var1];
                    field605[var1] = field605[var1 + 1];
                    field605[var1 + 1] = var4;
                    int var5 = field603[var1];
                    field603[var1] = field603[var1 + 1];
                    field603[var1 + 1] = var5;
                    int var6 = field604[var1];
                    field604[var1] = field604[var1 + 1];
                    field604[var1 + 1] = var6;
                    int var7 = field500[var1];
                    field500[var1] = field500[var1 + 1];
                    field500[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("b.bj(B)V")
    public static void method143() {
        for (int var0 = 0; var0 < field602; var0++) {
            if (method2969(field605[var0])) {
                if (var0 < field602 - 1) {
                    for (int var1 = var0; var1 < field602 - 1; var1++) {
                        field525[var1] = field525[var1 + 1];
                        field608[var1] = field608[var1 + 1];
                        field605[var1] = field605[var1 + 1];
                        field500[var1] = field500[var1 + 1];
                        field603[var1] = field603[var1 + 1];
                        field604[var1] = field604[var1 + 1];
                    }
                }
                field602--;
            }
        }
    }

    @ObfuscatedName("en.bf(IB)Z")
    public static boolean method2969(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("z.bq(Lai;IIIB)V")
    public static final void method188(class31 arg0, int arg1, int arg2, int arg3) {
        if (field602 >= 400) {
            return;
        }
        if (arg0.field762 != null) {
            arg0 = arg0.method619();
        }
        if (arg0 == null || !arg0.field793) {
            return;
        }
        String var4 = arg0.field765;
        if (arg0.field782 != 0) {
            var4 = var4 + method3206(arg0.field782, Statics.field1424.field38) + " " + class2.field33 + class135.field2237 + arg0.field782 + class2.field16;
        }
        if (field631 == 1) {
            Statics.method145(class135.field2231, field614 + " " + class2.field21 + " " + class2.method1391(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field615) {
            String[] var5 = arg0.field801;
            if (field629) {
                var5 = method223(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class135.field2233)) {
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
                        Statics.method145(var5[var6], class2.method1391(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class135.field2233)) {
                        short var9 = 0;
                        if (arg0.field782 > Statics.field1424.field38) {
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
                        Statics.method145(var5[var8], class2.method1391(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            Statics.method145(class135.field2232, class2.method1391(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1245 & 0x2) == 2) {
            Statics.method145(field517, field575 + " " + class2.field21 + " " + class2.method1391(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("w.be(Ln;IIII)V")
    public static final void method222(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1424 == arg0 || field602 >= 400) {
            return;
        }
        String var4;
        if (arg0.field39 == 0) {
            var4 = arg0.field45 + method3206(arg0.field38, Statics.field1424.field38) + " " + class2.field33 + class135.field2237 + arg0.field38 + class2.field16;
        } else {
            var4 = arg0.field45 + " " + class2.field33 + class135.field2263 + arg0.field39 + class2.field16;
        }
        if (field631 == 1) {
            Statics.method145(class135.field2231, field614 + " " + class2.field21 + " " + class2.method1391(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field615) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field590[var5] != null) {
                    short var6 = 0;
                    if (field590[var5].equalsIgnoreCase(class135.field2233)) {
                        if (arg0.field38 > Statics.field1424.field38) {
                            var6 = 2000;
                        }
                        if (Statics.field1424.field52 != 0 && arg0.field52 != 0) {
                            if (Statics.field1424.field52 == arg0.field52) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field591[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field589[var5] + var6;
                    Statics.method145(field590[var5], class2.method1391(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1245 & 0x8) == 8) {
            Statics.method145(field517, field575 + " " + class2.field21 + " " + class2.method1391(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field602; var9++) {
            if (field605[var9] == 23) {
                field608[var9] = class2.method1391(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("fn.bx(III)Ljava/lang/String;")
    public static final String method3206(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1391(16711680);
        } else if (var2 < -6) {
            return class2.method1391(16723968);
        } else if (var2 < -3) {
            return class2.method1391(16740352);
        } else if (var2 < 0) {
            return class2.method1391(16756736);
        } else if (var2 > 9) {
            return class2.method1391(65280);
        } else if (var2 > 6) {
            return class2.method1391(4259584);
        } else if (var2 > 3) {
            return class2.method1391(8453888);
        } else if (var2 > 0) {
            return class2.method1391(12648192);
        } else {
            return class2.method1391(16776960);
        }
    }

    @ObfuscatedName("df.cf(IIIIIIIIB)V")
    public static final void method2312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class159.method239(arg0)) {
            Statics.field888 = null;
            method3023(Statics.field2693[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field888 != null) {
                method3023(Statics.field888, -1412584499, arg1, arg2, arg3, arg4, Statics.field49, Statics.field275, arg7);
                Statics.field888 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field662[var8] = true;
            }
        } else {
            field662[arg7] = true;
        }
    }

    @ObfuscatedName("ei.cj([Lfn;IIIIIIIII)V")
    public static final void method3023(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1825(arg2, arg3, arg4, arg5);
        class104.method2149();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2704 == arg1 || arg1 == -1412584499 && field594 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field665[field673] = var10.field2667 + arg6;
                    field621[field673] = var10.field2668 + arg7;
                    field667[field673] = var10.field2607;
                    field668[field673] = var10.field2608;
                    var11 = ++field673 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2713 = var11;
                var10.field2714 = field484;
                if (!var10.field2597 || !method898(var10)) {
                    if (var10.field2653 > 0) {
                        method1629(var10);
                    }
                    int var12 = var10.field2667 + arg6;
                    int var13 = var10.field2668 + arg7;
                    int var14 = var10.field2620;
                    if (field594 == var10) {
                        if (arg1 != -1412584499 && !var10.field2663) {
                            Statics.field888 = arg0;
                            Statics.field49 = arg6;
                            Statics.field275 = arg7;
                            continue;
                        }
                        if (field529 && field635) {
                            int var15 = class77.field1376;
                            int var16 = class77.field1375;
                            int var17 = var15 - field632;
                            int var18 = var16 - field633;
                            if (var17 < field636) {
                                var17 = field636;
                            }
                            if (var10.field2607 + var17 > field636 + field460.field2607) {
                                var17 = field636 + field460.field2607 - var10.field2607;
                            }
                            if (var18 < field637) {
                                var18 = field637;
                            }
                            if (var10.field2608 + var18 > field637 + field460.field2608) {
                                var18 = field637 + field460.field2608 - var10.field2608;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2663) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2600 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2600 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2607 + var12;
                        int var26 = var10.field2608 + var13;
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
                        int var29 = var10.field2607 + var12;
                        int var30 = var10.field2608 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2597 || var19 < var21 && var20 < var22) {
                        if (var10.field2653 != 0) {
                            if (var10.field2653 == 1337) {
                                field609 = var12;
                                field610 = var13;
                                int var31 = var10.field2607;
                                int var32 = var10.field2608;
                                class89.method1825(var12, var13, var12 + var31, var13 + var32);
                                class104.method2149();
                                field563++;
                                method149(true);
                                method3022(true);
                                method149(false);
                                method3022(false);
                                for (class10 var33 = (class10) field595.method3362(); var33 != null; var33 = (class10) field595.method3350()) {
                                    if (Statics.field363 != var33.field144 || field484 > var33.field146) {
                                        var33.method3374();
                                    } else if (field484 >= var33.field145) {
                                        if (var33.field149 > 0) {
                                            class25 var34 = field495[var33.field149 - 1];
                                            if (var34 != null && var34.field401 >= 0 && var34.field401 < 13312 && var34.field414 >= 0 && var34.field414 < 13312) {
                                                var33.method110(var34.field401, var34.field414, method845(var34.field401, var34.field414, var33.field144) - var33.field147, field484);
                                            }
                                        }
                                        if (var33.field149 < 0) {
                                            int var35 = -var33.field149 - 1;
                                            class3 var36;
                                            if (field585 == var35) {
                                                var36 = Statics.field1424;
                                            } else {
                                                var36 = field499[var35];
                                            }
                                            if (var36 != null && var36.field401 >= 0 && var36.field401 < 13312 && var36.field414 >= 0 && var36.field414 < 13312) {
                                                var33.method110(var36.field401, var36.field414, method845(var36.field401, var36.field414, var33.field144) - var33.field147, field484);
                                            }
                                        }
                                        var33.method109(field534);
                                        Statics.field199.method1984(Statics.field363, (int) var33.field161, (int) var33.field158, (int) var33.field153, 60, var33, var33.field159, -1, false);
                                    }
                                }
                                method232();
                                if (!field705) {
                                    int var37 = field562;
                                    if (field551 / 256 > var37) {
                                        var37 = field551 / 256;
                                    }
                                    if (field706[4] && field692[4] + 128 > var37) {
                                        var37 = field692[4] + 128;
                                    }
                                    int var38 = field544 + field526 & 0x7FF;
                                    int var39 = Statics.field860;
                                    int var40 = method845(Statics.field1424.field401, Statics.field1424.field414, Statics.field363) - 50;
                                    int var41 = Statics.field1971;
                                    int var42 = var37 * 3 + 600;
                                    int var43 = 2048 - var37 & 0x7FF;
                                    int var44 = 2048 - var38 & 0x7FF;
                                    int var45 = 0;
                                    int var46 = 0;
                                    int var47 = var42;
                                    if (var43 != 0) {
                                        int var48 = class104.field1774[var43];
                                        int var49 = class104.field1775[var43];
                                        int var50 = var46 * var49 - var42 * var48 >> 16;
                                        var47 = var46 * var48 + var42 * var49 >> 16;
                                        var46 = var50;
                                    }
                                    if (var44 != 0) {
                                        int var51 = class104.field1774[var44];
                                        int var52 = class104.field1775[var44];
                                        int var53 = var45 * var52 + var47 * var51 >> 16;
                                        var47 = var47 * var52 - var45 * var51 >> 16;
                                        var45 = var53;
                                    }
                                    Statics.field261 = var39 - var45;
                                    Statics.field1389 = var40 - var46;
                                    Statics.field188 = var41 - var47;
                                    Statics.field1646 = var37;
                                    Statics.field2333 = var38;
                                }
                                int var54;
                                if (field705) {
                                    int var55;
                                    if (Statics.field65.field177) {
                                        var55 = Statics.field363;
                                    } else {
                                        int var56 = method845(Statics.field261, Statics.field188, Statics.field363);
                                        if (var56 - Statics.field1389 >= 800 || (class9.field115[Statics.field363][Statics.field261 >> 7][Statics.field188 >> 7] & 0x4) == 0) {
                                            var55 = 3;
                                        } else {
                                            var55 = Statics.field363;
                                        }
                                    }
                                    var54 = var55;
                                } else {
                                    var54 = method150();
                                }
                                int var57 = Statics.field261;
                                int var58 = Statics.field1389;
                                int var59 = Statics.field188;
                                int var60 = Statics.field1646;
                                int var61 = Statics.field2333;
                                for (int var62 = 0; var62 < 5; var62++) {
                                    if (field706[var62]) {
                                        int var63 = (int) (Math.random() * (double) (field579[var62] * 2 + 1) - (double) field579[var62] + Math.sin((double) field709[var62] / 100.0D * (double) field710[var62]) * (double) field692[var62]);
                                        if (var62 == 0) {
                                            Statics.field261 += var63;
                                        }
                                        if (var62 == 1) {
                                            Statics.field1389 += var63;
                                        }
                                        if (var62 == 2) {
                                            Statics.field188 += var63;
                                        }
                                        if (var62 == 3) {
                                            Statics.field2333 = Statics.field2333 + var63 & 0x7FF;
                                        }
                                        if (var62 == 4) {
                                            Statics.field1646 += var63;
                                            if (Statics.field1646 < 128) {
                                                Statics.field1646 = 128;
                                            }
                                            if (Statics.field1646 > 383) {
                                                Statics.field1646 = 383;
                                            }
                                        }
                                    }
                                }
                                int var64 = class77.field1376;
                                int var65 = class77.field1375;
                                if (var64 >= var12 && var64 < var12 + var31 && var65 >= var13 && var65 < var13 + var32) {
                                    class112.field1866 = true;
                                    class112.field1900 = 0;
                                    class112.field1898 = class77.field1376 - var12;
                                    class112.field1899 = class77.field1375 - var13;
                                } else {
                                    class112.field1866 = false;
                                    class112.field1900 = 0;
                                }
                                method2342();
                                class89.method1801(var12, var13, var31, var32, 0);
                                method2342();
                                Statics.field199.method1978(Statics.field261, Statics.field1389, Statics.field188, Statics.field1646, Statics.field2333, var54);
                                method2342();
                                Statics.field199.method1898();
                                field552 = 0;
                                for (int var66 = -1; var66 < field496 + field483; var66++) {
                                    class27 var67;
                                    if (var66 == -1) {
                                        var67 = Statics.field1424;
                                    } else if (var66 < field483) {
                                        var67 = field499[field514[var66]];
                                    } else {
                                        var67 = field495[field497[var66 - field483]];
                                    }
                                    if (var67 != null && var67.method22()) {
                                        if (var67 instanceof class25) {
                                            class31 var68 = ((class25) var67).field371;
                                            if (var68.field762 != null) {
                                                var68 = var68.method619();
                                            }
                                            if (var68 == null) {
                                                continue;
                                            }
                                        }
                                        if (var66 >= field483) {
                                            class31 var73 = ((class25) var67).field371;
                                            if (var73.field762 != null) {
                                                var73 = var73.method619();
                                            }
                                            if (var73.field788 >= 0 && var73.field788 < Statics.field1982.length) {
                                                int var74 = var67.field451 + 15;
                                                method778(var67.field401, var67.field414, var74);
                                                if (field564 > -1) {
                                                    Statics.field1982[var73.field788].method1709(field564 + var12 - 12, field565 + var13 - 30);
                                                }
                                            }
                                            if (field476 == 1 && field477 == field497[var66 - field483] && field484 % 20 < 10) {
                                                int var75 = var67.field451 + 15;
                                                method778(var67.field401, var67.field414, var75);
                                                if (field564 > -1) {
                                                    Statics.field851[0].method1709(field564 + var12 - 12, field565 + var13 - 28);
                                                }
                                            }
                                        } else {
                                            int var69 = 30;
                                            class3 var70 = (class3) var67;
                                            if (var70.field34 != -1 || var70.field37 != -1) {
                                                int var71 = var67.field451 + 15;
                                                method778(var67.field401, var67.field414, var71);
                                                if (field564 > -1) {
                                                    if (var70.field34 != -1) {
                                                        Statics.field950[var70.field34].method1709(field564 + var12 - 12, field565 + var13 - var69);
                                                        var69 += 25;
                                                    }
                                                    if (var70.field37 != -1) {
                                                        Statics.field1982[var70.field37].method1709(field564 + var12 - 12, field565 + var13 - var69);
                                                        var69 += 25;
                                                    }
                                                }
                                            }
                                            if (var66 >= 0 && field476 == 10 && field498 == field514[var66]) {
                                                int var72 = var67.field451 + 15;
                                                method778(var67.field401, var67.field414, var72);
                                                if (field564 > -1) {
                                                    Statics.field851[1].method1709(field564 + var12 - 12, field565 + var13 - var69);
                                                }
                                            }
                                        }
                                        if (var67.field410 != null) {
                                            label1699: {
                                                if (var66 < field483 && field660 != 0 && field660 != 3) {
                                                    if (field660 != 1) {
                                                        break label1699;
                                                    }
                                                    String var76 = ((class3) var67).field45;
                                                    boolean var77;
                                                    if (var76 == null) {
                                                        var77 = false;
                                                    } else {
                                                        String var78 = class149.method2738(var76, Statics.field2474);
                                                        int var79 = 0;
                                                        while (true) {
                                                            if (var79 >= field711) {
                                                                if (var76.equalsIgnoreCase(class149.method2738(Statics.field1424.field45, Statics.field2474))) {
                                                                    var77 = true;
                                                                } else {
                                                                    var77 = false;
                                                                }
                                                                break;
                                                            }
                                                            if (var78.equalsIgnoreCase(class149.method2738(field713[var79].field350, Statics.field2474))) {
                                                                var77 = true;
                                                                break;
                                                            }
                                                            var79++;
                                                        }
                                                    }
                                                    if (!var77) {
                                                        break label1699;
                                                    }
                                                }
                                                int var80 = var67.field451;
                                                method778(var67.field401, var67.field414, var80);
                                                if (field564 > -1 && field552 < field622) {
                                                    field598[field552] = Statics.field510.method3400(var67.field410) / 2;
                                                    field556[field552] = Statics.field510.field2845;
                                                    field554[field552] = field564;
                                                    field577[field552] = field565;
                                                    field558[field552] = var67.field429;
                                                    field559[field552] = var67.field412;
                                                    field560[field552] = var67.field449;
                                                    field536[field552] = var67.field410;
                                                    field552++;
                                                }
                                            }
                                        }
                                        if (var67.field430 > field484) {
                                            int var81 = var67.field451 + 15;
                                            method778(var67.field401, var67.field414, var81);
                                            if (field564 > -1) {
                                                int var82 = var67.field409 * 30 / var67.field418;
                                                if (var82 > 30) {
                                                    var82 = 30;
                                                } else if (var82 == 0 && var67.field409 > 0) {
                                                    var82 = 1;
                                                }
                                                class89.method1801(field564 + var12 - 15, field565 + var13 - 3, var82, 5, 65280);
                                                class89.method1801(field564 + var12 - 15 + var82, field565 + var13 - 3, 30 - var82, 5, 16711680);
                                            }
                                        }
                                        for (int var83 = 0; var83 < 4; var83++) {
                                            if (var67.field415[var83] > field484) {
                                                int var84 = var67.field451 / 2;
                                                method778(var67.field401, var67.field414, var84);
                                                if (field564 > -1) {
                                                    if (var83 == 1) {
                                                        field565 -= 20;
                                                    }
                                                    if (var83 == 2) {
                                                        field564 -= 15;
                                                        field565 -= 10;
                                                    }
                                                    if (var83 == 3) {
                                                        field564 += 15;
                                                        field565 -= 10;
                                                    }
                                                    Statics.field1749[var67.field444[var83]].method1709(field564 + var12 - 12, field565 + var13 - 12);
                                                    Statics.field330.method3406(Integer.toString(var67.field436[var83]), field564 + var12 - 1, field565 + var13 + 3, 16777215, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var85 = 0; var85 < field552; var85++) {
                                    int var86 = field554[var85];
                                    int var87 = field577[var85];
                                    int var88 = field598[var85];
                                    int var89 = field556[var85];
                                    boolean var90 = true;
                                    while (var90) {
                                        var90 = false;
                                        for (int var91 = 0; var91 < var85; var91++) {
                                            if (var87 + 2 > field577[var91] - field556[var91] && var87 - var89 < field577[var91] + 2 && var86 - var88 < field598[var91] + field554[var91] && var86 + var88 > field554[var91] - field598[var91] && field577[var91] - field556[var91] < var87) {
                                                var87 = field577[var91] - field556[var91];
                                                var90 = true;
                                            }
                                        }
                                    }
                                    field564 = field554[var85];
                                    field565 = field577[var85] = var87;
                                    String var92 = field536[var85];
                                    if (field641 == 0) {
                                        int var93 = 16776960;
                                        if (field558[var85] < 6) {
                                            var93 = field675[field558[var85]];
                                        }
                                        if (field558[var85] == 6) {
                                            var93 = field563 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field558[var85] == 7) {
                                            var93 = field563 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field558[var85] == 8) {
                                            var93 = field563 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field558[var85] == 9) {
                                            int var94 = 150 - field560[var85];
                                            if (var94 < 50) {
                                                var93 = var94 * 1280 + 16711680;
                                            } else if (var94 < 100) {
                                                var93 = 16776960 - (var94 - 50) * 327680;
                                            } else if (var94 < 150) {
                                                var93 = (var94 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field558[var85] == 10) {
                                            int var95 = 150 - field560[var85];
                                            if (var95 < 50) {
                                                var93 = var95 * 5 + 16711680;
                                            } else if (var95 < 100) {
                                                var93 = 16711935 - (var95 - 50) * 327680;
                                            } else if (var95 < 150) {
                                                var93 = (var95 - 100) * 327680 + 255 - (var95 - 100) * 5;
                                            }
                                        }
                                        if (field558[var85] == 11) {
                                            int var96 = 150 - field560[var85];
                                            if (var96 < 50) {
                                                var93 = 16777215 - var96 * 327685;
                                            } else if (var96 < 100) {
                                                var93 = (var96 - 50) * 327685 + 65280;
                                            } else if (var96 < 150) {
                                                var93 = 16777215 - (var96 - 100) * 327680;
                                            }
                                        }
                                        if (field559[var85] == 0) {
                                            Statics.field510.method3406(var92, field564 + var12, field565 + var13, var93, 0);
                                        }
                                        if (field559[var85] == 1) {
                                            Statics.field510.method3454(var92, field564 + var12, field565 + var13, var93, 0, field563);
                                        }
                                        if (field559[var85] == 2) {
                                            Statics.field510.method3409(var92, field564 + var12, field565 + var13, var93, 0, field563);
                                        }
                                        if (field559[var85] == 3) {
                                            Statics.field510.method3410(var92, field564 + var12, field565 + var13, var93, 0, field563, 150 - field560[var85]);
                                        }
                                        if (field559[var85] == 4) {
                                            int var97 = (150 - field560[var85]) * (Statics.field510.method3400(var92) + 100) / 150;
                                            class89.method1850(field564 + var12 - 50, var13, field564 + var12 + 50, var13 + var32);
                                            Statics.field510.method3404(var92, field564 + var12 + 50 - var97, field565 + var13, var93, 0);
                                            class89.method1825(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field559[var85] == 5) {
                                            int var98 = 150 - field560[var85];
                                            int var99 = 0;
                                            if (var98 < 25) {
                                                var99 = var98 - 25;
                                            } else if (var98 > 125) {
                                                var99 = var98 - 125;
                                            }
                                            class89.method1850(var12, field565 + var13 - Statics.field510.field2845 - 1, var12 + var31, field565 + var13 + 5);
                                            Statics.field510.method3406(var92, field564 + var12, field565 + var13 + var99, var93, 0);
                                            class89.method1825(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field510.method3406(var92, field564 + var12, field565 + var13, 16776960, 0);
                                    }
                                }
                                method800(var12, var13);
                                ((class110) Statics.field1771).method2227(field534);
                                method2954(var12, var13, var31, var32);
                                Statics.field261 = var57;
                                Statics.field1389 = var58;
                                Statics.field188 = var59;
                                Statics.field1646 = var60;
                                Statics.field2333 = var61;
                                if (field467) {
                                    byte var100 = 0;
                                    int var101 = class154.field2542 + class154.field2529 + var100;
                                    if (var101 == 0) {
                                        field467 = false;
                                    }
                                }
                                if (field467) {
                                    class89.method1801(var12, var13, var31, var32, 0);
                                    method255(class135.field2097, false);
                                }
                                if (!field467 && !field535 && var64 >= var12 && var64 < var12 + var31 && var65 >= var13 && var65 < var13 + var32) {
                                    if (field631 == 0 && !field615) {
                                        Statics.method145(class135.field2236, "", 23, 0, var64 - var12, var65 - var13);
                                    }
                                    int var103 = -1;
                                    for (int var104 = 0; var104 < class112.field1900; var104++) {
                                        int var105 = class112.field1874[var104];
                                        int var106 = var105 & 0x7F;
                                        int var107 = var105 >> 7 & 0x7F;
                                        int var108 = var105 >> 29 & 0x3;
                                        int var109 = var105 >> 14 & 0x7FFF;
                                        if (var103 != var105) {
                                            var103 = var105;
                                            if (var108 == 2 && Statics.field199.method1914(Statics.field363, var106, var107, var105) >= 0) {
                                                class32 var110 = class32.method874(var109);
                                                if (var110.field827 != null) {
                                                    var110 = var110.method638();
                                                }
                                                if (var110 == null) {
                                                    continue;
                                                }
                                                if (field631 == 1) {
                                                    Statics.method145(class135.field2231, field614 + " " + class2.field21 + " " + class2.method1391(65535) + var110.field823, 1, var105, var106, var107);
                                                } else if (!field615) {
                                                    String[] var111 = var110.field836;
                                                    if (field629) {
                                                        var111 = method223(var111);
                                                    }
                                                    if (var111 != null) {
                                                        for (int var112 = 4; var112 >= 0; var112--) {
                                                            if (var111[var112] != null) {
                                                                short var113 = 0;
                                                                if (var112 == 0) {
                                                                    var113 = 3;
                                                                }
                                                                if (var112 == 1) {
                                                                    var113 = 4;
                                                                }
                                                                if (var112 == 2) {
                                                                    var113 = 5;
                                                                }
                                                                if (var112 == 3) {
                                                                    var113 = 6;
                                                                }
                                                                if (var112 == 4) {
                                                                    var113 = 1001;
                                                                }
                                                                Statics.method145(var111[var112], class2.method1391(65535) + var110.field823, var113, var105, var106, var107);
                                                            }
                                                        }
                                                    }
                                                    Statics.method145(class135.field2232, class2.method1391(65535) + var110.field823, 1002, var110.field806 << 14, var106, var107);
                                                } else if ((Statics.field1245 & 0x4) == 4) {
                                                    Statics.method145(field517, field575 + " " + class2.field21 + " " + class2.method1391(65535) + var110.field823, 2, var105, var106, var107);
                                                }
                                            }
                                            if (var108 == 1) {
                                                class25 var114 = field495[var109];
                                                if (var114.field371.field766 == 1 && (var114.field401 & 0x7F) == 64 && (var114.field414 & 0x7F) == 64) {
                                                    for (int var115 = 0; var115 < field496; var115++) {
                                                        class25 var116 = field495[field497[var115]];
                                                        if (var116 != null && var114 != var116 && var116.field371.field766 == 1 && var114.field401 == var116.field401 && var114.field414 == var116.field414) {
                                                            method188(var116.field371, field497[var115], var106, var107);
                                                        }
                                                    }
                                                    for (int var117 = 0; var117 < field483; var117++) {
                                                        class3 var118 = field499[field514[var117]];
                                                        if (var118 != null && var114.field401 == var118.field401 && var114.field414 == var118.field414) {
                                                            method222(var118, field514[var117], var106, var107);
                                                        }
                                                    }
                                                }
                                                method188(var114.field371, var109, var106, var107);
                                            }
                                            if (var108 == 0) {
                                                class3 var119 = field499[var109];
                                                if ((var119.field401 & 0x7F) == 64 && (var119.field414 & 0x7F) == 64) {
                                                    for (int var120 = 0; var120 < field496; var120++) {
                                                        class25 var121 = field495[field497[var120]];
                                                        if (var121 != null && var121.field371.field766 == 1 && var119.field401 == var121.field401 && var119.field414 == var121.field414) {
                                                            method188(var121.field371, field497[var120], var106, var107);
                                                        }
                                                    }
                                                    for (int var122 = 0; var122 < field483; var122++) {
                                                        class3 var123 = field499[field514[var122]];
                                                        if (var123 != null && var119 != var123 && var119.field401 == var123.field401 && var119.field414 == var123.field414) {
                                                            method222(var123, field514[var122], var106, var107);
                                                        }
                                                    }
                                                }
                                                method222(var119, var109, var106, var107);
                                            }
                                            if (var108 == 3) {
                                                class177 var124 = field645[Statics.field363][var106][var107];
                                                if (var124 != null) {
                                                    for (class17 var125 = (class17) var124.method3339(); var125 != null; var125 = (class17) var124.method3341()) {
                                                        class40 var126 = class40.method1433(var125.field251);
                                                        if (field631 == 1) {
                                                            Statics.method145(class135.field2231, field614 + " " + class2.field21 + " " + class2.method1391(16748608) + var126.field974, 16, var125.field251, var106, var107);
                                                        } else if (!field615) {
                                                            String[] var127 = var126.field969;
                                                            if (field629) {
                                                                var127 = method223(var127);
                                                            }
                                                            for (int var128 = 4; var128 >= 0; var128--) {
                                                                if (var127 != null && var127[var128] != null) {
                                                                    byte var129 = 0;
                                                                    if (var128 == 0) {
                                                                        var129 = 18;
                                                                    }
                                                                    if (var128 == 1) {
                                                                        var129 = 19;
                                                                    }
                                                                    if (var128 == 2) {
                                                                        var129 = 20;
                                                                    }
                                                                    if (var128 == 3) {
                                                                        var129 = 21;
                                                                    }
                                                                    if (var128 == 4) {
                                                                        var129 = 22;
                                                                    }
                                                                    Statics.method145(var127[var128], class2.method1391(16748608) + var126.field974, var129, var125.field251, var106, var107);
                                                                } else if (var128 == 2) {
                                                                    Statics.method145(class135.field2304, class2.method1391(16748608) + var126.field974, 20, var125.field251, var106, var107);
                                                                }
                                                            }
                                                            Statics.method145(class135.field2232, class2.method1391(16748608) + var126.field974, 1004, var125.field251, var106, var107);
                                                        } else if ((Statics.field1245 & 0x1) == 1) {
                                                            Statics.method145(field517, field575 + " " + class2.field21 + " " + class2.method1391(16748608) + var126.field974, 17, var125.field251, var106, var107);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class89.method1825(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2653 == 1338) {
                                method2342();
                                class89.method1825(var12, var13, Statics.field1983.field1471 + var12, Statics.field1983.field1472 + var13);
                                if (field580 == 2 || field580 == 5) {
                                    class89.method1815(var12 + 25, var13 + 5, 0, Statics.field231, Statics.field2789);
                                } else {
                                    int var130 = field544 + field473 & 0x7FF;
                                    int var131 = Statics.field1424.field401 / 32 + 48;
                                    int var132 = 464 - Statics.field1424.field414 / 32;
                                    Statics.field100.method1719(var12 + 25, var13 + 5, 146, 151, var131, var132, var130, field616 + 256, Statics.field231, Statics.field2789);
                                    for (int var133 = 0; var133 < field687; var133++) {
                                        int var134 = field650[var133] * 4 + 2 - Statics.field1424.field401 / 32;
                                        int var135 = field689[var133] * 4 + 2 - Statics.field1424.field414 / 32;
                                        method165(var12, var13, var134, var135, field690[var133]);
                                    }
                                    for (int var136 = 0; var136 < 104; var136++) {
                                        for (int var137 = 0; var137 < 104; var137++) {
                                            class177 var138 = field645[Statics.field363][var136][var137];
                                            if (var138 != null) {
                                                int var139 = var136 * 4 + 2 - Statics.field1424.field401 / 32;
                                                int var140 = var137 * 4 + 2 - Statics.field1424.field414 / 32;
                                                method165(var12, var13, var139, var140, Statics.field1919[0]);
                                            }
                                        }
                                    }
                                    for (int var141 = 0; var141 < field496; var141++) {
                                        class25 var142 = field495[field497[var141]];
                                        if (var142 != null && var142.method22()) {
                                            class31 var143 = var142.field371;
                                            if (var143 != null && var143.field762 != null) {
                                                var143 = var143.method619();
                                            }
                                            if (var143 != null && var143.field781 && var143.field793) {
                                                int var144 = var142.field401 / 32 - Statics.field1424.field401 / 32;
                                                int var145 = var142.field414 / 32 - Statics.field1424.field414 / 32;
                                                method165(var12, var13, var144, var145, Statics.field1919[1]);
                                            }
                                        }
                                    }
                                    for (int var146 = 0; var146 < field483; var146++) {
                                        class3 var147 = field499[field514[var146]];
                                        if (var147 != null && var147.method22()) {
                                            int var148 = var147.field401 / 32 - Statics.field1424.field401 / 32;
                                            int var149 = var147.field414 / 32 - Statics.field1424.field414 / 32;
                                            boolean var150 = false;
                                            String var151 = var147.field45;
                                            boolean var152;
                                            if (var151 == null) {
                                                var152 = false;
                                            } else {
                                                String var153 = class149.method2738(var151, Statics.field2474);
                                                int var154 = 0;
                                                while (true) {
                                                    if (var154 >= field711) {
                                                        if (var151.equalsIgnoreCase(class149.method2738(Statics.field1424.field45, Statics.field2474))) {
                                                            var152 = true;
                                                        } else {
                                                            var152 = false;
                                                        }
                                                        break;
                                                    }
                                                    if (var153.equalsIgnoreCase(class149.method2738(field713[var154].field350, Statics.field2474))) {
                                                        var152 = true;
                                                        break;
                                                    }
                                                    var154++;
                                                }
                                            }
                                            if (var152) {
                                                var150 = true;
                                            }
                                            boolean var155 = false;
                                            for (int var156 = 0; var156 < Statics.field244; var156++) {
                                                if (var147.field45.equals(Statics.field1280[var156].field108)) {
                                                    var155 = true;
                                                    break;
                                                }
                                            }
                                            boolean var157 = false;
                                            if (Statics.field1424.field52 != 0 && var147.field52 != 0 && Statics.field1424.field52 == var147.field52) {
                                                var157 = true;
                                            }
                                            if (var150) {
                                                method165(var12, var13, var148, var149, Statics.field1919[3]);
                                            } else if (var157) {
                                                method165(var12, var13, var148, var149, Statics.field1919[4]);
                                            } else if (var155) {
                                                method165(var12, var13, var148, var149, Statics.field1919[5]);
                                            } else {
                                                method165(var12, var13, var148, var149, Statics.field1919[2]);
                                            }
                                        }
                                    }
                                    if (field476 != 0 && field484 % 20 < 10) {
                                        if (field476 == 1 && field477 >= 0 && field477 < field495.length) {
                                            class25 var158 = field495[field477];
                                            if (var158 != null) {
                                                int var159 = var158.field401 / 32 - Statics.field1424.field401 / 32;
                                                int var160 = var158.field414 / 32 - Statics.field1424.field414 / 32;
                                                Statics.method1874(var12, var13, var159, var160, Statics.field1281[1]);
                                            }
                                        }
                                        if (field476 == 2) {
                                            int var161 = field479 * 4 - Statics.field10 * 4 + 2 - Statics.field1424.field401 / 32;
                                            int var162 = field693 * 4 - Statics.field289 * 4 + 2 - Statics.field1424.field414 / 32;
                                            Statics.method1874(var12, var13, var161, var162, Statics.field1281[1]);
                                        }
                                        if (field476 == 10 && field498 >= 0 && field498 < field499.length) {
                                            class3 var163 = field499[field498];
                                            if (var163 != null) {
                                                int var164 = var163.field401 / 32 - Statics.field1424.field401 / 32;
                                                int var165 = var163.field414 / 32 - Statics.field1424.field414 / 32;
                                                Statics.method1874(var12, var13, var164, var165, Statics.field1281[1]);
                                            }
                                        }
                                    }
                                    if (field691 != 0) {
                                        int var166 = field691 * 4 + 2 - Statics.field1424.field401 / 32;
                                        int var167 = field480 * 4 + 2 - Statics.field1424.field414 / 32;
                                        method165(var12, var13, var166, var167, Statics.field1281[0]);
                                    }
                                    class89.method1801(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field580 < 3) {
                                    Statics.field2345.method1719(var12, var13, 33, 33, 25, 25, field544, 256, Statics.field347, Statics.field383);
                                } else {
                                    class89.method1815(var12, var13, 0, Statics.field347, Statics.field383);
                                }
                                if (field458[var11]) {
                                    Statics.field1983.method1788(var12, var13);
                                }
                                field663[var11] = true;
                                class89.method1825(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var168 = class77.field1376;
                        int var169 = class77.field1375;
                        if (!field535 && var168 >= var19 && var169 >= var20 && var168 < var21 && var169 < var22) {
                            method3387(var10, var168 - var12, var169 - var13);
                        }
                        if (var10.field2600 == 0) {
                            if (!var10.field2597 && method898(var10) && Statics.field375 != var10) {
                                continue;
                            }
                            if (!var10.field2597) {
                                if (var10.field2612 > var10.field2614 - var10.field2608) {
                                    var10.field2612 = var10.field2614 - var10.field2608;
                                }
                                if (var10.field2612 < 0) {
                                    var10.field2612 = 0;
                                }
                            }
                            method3023(arg0, var10.field2596, var19, var20, var21, var22, var12 - var10.field2611, var13 - var10.field2612, var11);
                            if (var10.field2633 != null) {
                                method3023(var10.field2633, var10.field2596, var19, var20, var21, var22, var12 - var10.field2611, var13 - var10.field2612, var11);
                            }
                            class4 var170 = (class4) field620.method3312((long) var10.field2596);
                            if (var170 != null) {
                                if (var170.field57 == 0 && class77.field1376 >= var19 && class77.field1375 >= var20 && class77.field1376 < var21 && class77.field1375 < var22 && !field535 && !field703) {
                                    field525[0] = class135.field2102;
                                    field608[0] = "";
                                    field605[0] = 1006;
                                    field602 = 1;
                                }
                                method2312(var170.field64, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1825(arg2, arg3, arg4, arg5);
                            class104.method2149();
                        }
                        if (field458[var11] || field463 > 1) {
                            if (var10.field2600 == 0 && !var10.field2597 && var10.field2614 > var10.field2608) {
                                int var171 = var10.field2607 + var12;
                                int var172 = var10.field2612;
                                int var173 = var10.field2608;
                                int var174 = var10.field2614;
                                Statics.field1443[0].method1788(var171, var13);
                                Statics.field1443[1].method1788(var171, var13 + var173 - 16);
                                class89.method1801(var171, var13 + 16, 16, var173 - 32, field537);
                                int var175 = (var173 - 32) * var173 / var174;
                                if (var175 < 8) {
                                    var175 = 8;
                                }
                                int var176 = (var173 - 32 - var175) * var172 / (var174 - var173);
                                class89.method1801(var171, var13 + 16 + var176, 16, var175, field538);
                                class89.method1812(var171, var13 + 16 + var176, var175, field540);
                                class89.method1812(var171 + 1, var13 + 16 + var176, var175, field540);
                                class89.method1810(var171, var13 + 16 + var176, 16, field540);
                                class89.method1810(var171, var13 + 17 + var176, 16, field540);
                                class89.method1812(var171 + 15, var13 + 16 + var176, var175, field539);
                                class89.method1812(var171 + 14, var13 + 17 + var176, var175 - 1, field539);
                                class89.method1810(var171, var13 + 15 + var176 + var175, 16, field539);
                                class89.method1810(var171 + 1, var13 + 14 + var176 + var175, 15, field539);
                            }
                            if (var10.field2600 != 1) {
                                if (var10.field2600 == 2) {
                                    int var177 = 0;
                                    for (int var178 = 0; var178 < var10.field2608; var178++) {
                                        for (int var179 = 0; var179 < var10.field2607; var179++) {
                                            int var180 = (var10.field2601 + 32) * var179 + var12;
                                            int var181 = (var10.field2652 + 32) * var178 + var13;
                                            if (var177 < 20) {
                                                var180 += var10.field2695[var177];
                                                var181 += var10.field2654[var177];
                                            }
                                            if (var10.field2700[var177] > 0) {
                                                boolean var182 = false;
                                                boolean var183 = false;
                                                int var184 = var10.field2700[var177] - 1;
                                                if (var180 + 32 > arg2 && var180 < arg4 && var181 + 32 > arg3 && var181 < arg5 || Statics.field293 == var10 && field572 == var177) {
                                                    class86 var185;
                                                    if (field631 == 1 && Statics.field1257 == var177 && Statics.field186 == var10.field2596) {
                                                        var185 = class40.method7(var184, var10.field2701[var177], 2, 0, false);
                                                    } else {
                                                        var185 = class40.method7(var184, var10.field2701[var177], 1, 3153952, false);
                                                    }
                                                    if (var185 == null) {
                                                        method640(var10);
                                                    } else if (Statics.field293 == var10 && field572 == var177) {
                                                        int var186 = class77.field1376 - field485;
                                                        int var187 = class77.field1375 - field543;
                                                        if (var186 < 5 && var186 > -5) {
                                                            var186 = 0;
                                                        }
                                                        if (var187 < 5 && var187 > -5) {
                                                            var187 = 0;
                                                        }
                                                        if (field625 < 5) {
                                                            var186 = 0;
                                                            var187 = 0;
                                                        }
                                                        var185.method1715(var180 + var186, var181 + var187, 128);
                                                        if (arg1 != -1) {
                                                            class159 var188 = arg0[arg1 & 0xFFFF];
                                                            if (var181 + var187 < class89.field1481 && var188.field2612 > 0) {
                                                                int var189 = field534 * (class89.field1481 - var181 - var187) / 3;
                                                                if (var189 > field534 * 10) {
                                                                    var189 = field534 * 10;
                                                                }
                                                                if (var189 > var188.field2612) {
                                                                    var189 = var188.field2612;
                                                                }
                                                                var188.field2612 -= var189;
                                                                field543 += var189;
                                                                method640(var188);
                                                            }
                                                            if (var181 + var187 + 32 > class89.field1480 && var188.field2612 < var188.field2614 - var188.field2608) {
                                                                int var190 = field534 * (var181 + var187 + 32 - class89.field1480) / 3;
                                                                if (var190 > field534 * 10) {
                                                                    var190 = field534 * 10;
                                                                }
                                                                if (var190 > var188.field2614 - var188.field2608 - var188.field2612) {
                                                                    var190 = var188.field2614 - var188.field2608 - var188.field2612;
                                                                }
                                                                var188.field2612 += var190;
                                                                field543 -= var190;
                                                                method640(var188);
                                                            }
                                                        }
                                                    } else if (Statics.field354 == var10 && field601 == var177) {
                                                        var185.method1715(var180, var181, 128);
                                                    } else {
                                                        var185.method1709(var180, var181);
                                                    }
                                                }
                                            } else if (var10.field2706 != null && var177 < 20) {
                                                class86 var191 = var10.method3167(var177);
                                                if (var191 != null) {
                                                    var191.method1709(var180, var181);
                                                } else if (class159.field2692) {
                                                    method640(var10);
                                                }
                                            }
                                            var177++;
                                        }
                                    }
                                } else if (var10.field2600 == 3) {
                                    int var192;
                                    if (method2231(var10)) {
                                        var192 = var10.field2616;
                                        if (Statics.field375 == var10 && var10.field2698 != 0) {
                                            var192 = var10.field2698;
                                        }
                                    } else {
                                        var192 = var10.field2615;
                                        if (Statics.field375 == var10 && var10.field2617 != 0) {
                                            var192 = var10.field2617;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2619) {
                                            class89.method1801(var12, var13, var10.field2607, var10.field2608, var192);
                                        } else {
                                            class89.method1808(var12, var13, var10.field2607, var10.field2608, var192);
                                        }
                                    } else if (var10.field2619) {
                                        class89.method1837(var12, var13, var10.field2607, var10.field2608, var192, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1809(var12, var13, var10.field2607, var10.field2608, var192, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2600 == 4) {
                                    class183 var193 = var10.method3166();
                                    if (var193 != null) {
                                        String var194 = var10.field2645;
                                        int var195;
                                        if (method2231(var10)) {
                                            var195 = var10.field2616;
                                            if (Statics.field375 == var10 && var10.field2698 != 0) {
                                                var195 = var10.field2698;
                                            }
                                            if (var10.field2646.length() > 0) {
                                                var194 = var10.field2646;
                                            }
                                        } else {
                                            var195 = var10.field2615;
                                            if (Statics.field375 == var10 && var10.field2617 != 0) {
                                                var195 = var10.field2617;
                                            }
                                        }
                                        if (var10.field2597 && var10.field2702 != -1) {
                                            class40 var196 = class40.method1433(var10.field2702);
                                            var194 = var196.field974;
                                            if (var194 == null) {
                                                var194 = "null";
                                            }
                                            if ((var196.field985 == 1 || var10.field2703 != 1) && var10.field2703 != -1) {
                                                var194 = class2.method1391(16748608) + var194 + class2.field23 + " " + 'x' + method116(var10.field2703);
                                            }
                                        }
                                        if (field712 == var10) {
                                            class135 var10000 = (class135) null;
                                            var194 = class135.field2239;
                                            var195 = var10.field2615;
                                        }
                                        if (!var10.field2597) {
                                            var194 = method1556(var194, var10);
                                        }
                                        var193.method3464(var194, var12, var13, var10.field2607, var10.field2608, var195, var10.field2650 ? 0 : -1, var10.field2648, var10.field2649, var10.field2647);
                                    } else if (class159.field2692) {
                                        method640(var10);
                                    }
                                } else if (var10.field2600 == 5) {
                                    if (var10.field2597) {
                                        class86 var198;
                                        if (var10.field2702 == -1) {
                                            var198 = var10.method3209(false);
                                        } else {
                                            var198 = class40.method7(var10.field2702, var10.field2703, var10.field2626, var10.field2627, false);
                                        }
                                        if (var198 != null) {
                                            int var199 = var198.field1462;
                                            int var200 = var198.field1463;
                                            if (var10.field2625) {
                                                class89.method1850(var12, var13, var10.field2607 + var12, var10.field2608 + var13);
                                                int var201 = (var10.field2607 + (var199 - 1)) / var199;
                                                int var202 = (var10.field2608 + (var200 - 1)) / var200;
                                                for (int var203 = 0; var203 < var201; var203++) {
                                                    for (int var204 = 0; var204 < var202; var204++) {
                                                        if (var10.field2624 != 0) {
                                                            var198.method1721(var199 / 2 + var199 * var203 + var12, var200 / 2 + var200 * var204 + var13, var10.field2624, 4096);
                                                        } else if (var14 == 0) {
                                                            var198.method1709(var199 * var203 + var12, var200 * var204 + var13);
                                                        } else {
                                                            var198.method1715(var199 * var203 + var12, var200 * var204 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1825(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var205 = var10.field2607 * 4096 / var199;
                                                if (var10.field2624 != 0) {
                                                    var198.method1721(var10.field2607 / 2 + var12, var10.field2608 / 2 + var13, var10.field2624, var205);
                                                } else if (var14 != 0) {
                                                    var198.method1737(var12, var13, var10.field2607, var10.field2608, 256 - (var14 & 0xFF));
                                                } else if (var10.field2607 == var199 && var10.field2608 == var200) {
                                                    var198.method1709(var12, var13);
                                                } else {
                                                    var198.method1711(var12, var13, var10.field2607, var10.field2608);
                                                }
                                            }
                                        } else if (class159.field2692) {
                                            method640(var10);
                                        }
                                    } else {
                                        class86 var197 = var10.method3209(method2231(var10));
                                        if (var197 != null) {
                                            var197.method1709(var12, var13);
                                        } else if (class159.field2692) {
                                            method640(var10);
                                        }
                                    }
                                } else if (var10.field2600 == 6) {
                                    boolean var206 = method2231(var10);
                                    int var207;
                                    if (var206) {
                                        var207 = var10.field2635;
                                    } else {
                                        var207 = var10.field2634;
                                    }
                                    class112 var208 = null;
                                    int var209 = 0;
                                    if (var10.field2702 != -1) {
                                        class40 var210 = class40.method1433(var10.field2702);
                                        if (var210 != null) {
                                            class40 var211 = var210.method827(var10.field2703);
                                            var208 = var211.method850(1);
                                            if (var208 == null) {
                                                method640(var10);
                                            } else {
                                                var208.method2240();
                                                var209 = var208.field1542 / 2;
                                            }
                                        }
                                    } else if (var10.field2610 == 5) {
                                        if (var10.field2631 == 0) {
                                            var208 = field717.method3234((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var208 = Statics.field1424.method13();
                                        }
                                    } else if (var207 == -1) {
                                        var208 = var10.method3168((class34) null, -1, var206, Statics.field1424.field48);
                                        if (var208 == null && class159.field2692) {
                                            method640(var10);
                                        }
                                    } else {
                                        class34 var212 = class34.method572(var207);
                                        var208 = var10.method3168(var212, var10.field2591, var206, Statics.field1424.field48);
                                        if (var208 == null && class159.field2692) {
                                            method640(var10);
                                        }
                                    }
                                    class104.method2145(var10.field2607 / 2 + var12, var10.field2608 / 2 + var13);
                                    int var213 = var10.field2641 * class104.field1774[var10.field2638] >> 16;
                                    int var214 = var10.field2641 * class104.field1775[var10.field2638] >> 16;
                                    if (var208 != null) {
                                        if (var10.field2597) {
                                            var208.method2240();
                                            if (var10.field2643) {
                                                var208.method2245(0, var10.field2639, var10.field2640, var10.field2638, var10.field2636, var10.field2637 + var209 + var213, var10.field2637 + var214, var10.field2641);
                                            } else {
                                                var208.method2251(0, var10.field2639, var10.field2640, var10.field2638, var10.field2636, var10.field2637 + var209 + var213, var10.field2637 + var214);
                                            }
                                        } else {
                                            var208.method2251(0, var10.field2639, 0, var10.field2638, 0, var213, var214);
                                        }
                                    }
                                    class104.method2144();
                                } else {
                                    if (var10.field2600 == 7) {
                                        class183 var215 = var10.method3166();
                                        if (var215 == null) {
                                            if (class159.field2692) {
                                                method640(var10);
                                            }
                                            continue;
                                        }
                                        int var216 = 0;
                                        for (int var217 = 0; var217 < var10.field2608; var217++) {
                                            for (int var218 = 0; var218 < var10.field2607; var218++) {
                                                if (var10.field2700[var216] > 0) {
                                                    class40 var219 = class40.method1433(var10.field2700[var216] - 1);
                                                    String var220;
                                                    if (var219.field985 != 1 && var10.field2701[var216] == 1) {
                                                        var220 = class2.method1391(16748608) + var219.field974 + class2.field23;
                                                    } else {
                                                        var220 = class2.method1391(16748608) + var219.field974 + class2.field23 + " " + 'x' + method116(var10.field2701[var216]);
                                                    }
                                                    int var221 = (var10.field2601 + 115) * var218 + var12;
                                                    int var222 = (var10.field2652 + 12) * var217 + var13;
                                                    if (var10.field2648 == 0) {
                                                        var215.method3404(var220, var221, var222, var10.field2615, var10.field2650 ? 0 : -1);
                                                    } else if (var10.field2648 == 1) {
                                                        var215.method3406(var220, var10.field2607 / 2 + var221, var222, var10.field2615, var10.field2650 ? 0 : -1);
                                                    } else {
                                                        var215.method3405(var220, var10.field2607 + var221 - 1, var222, var10.field2615, var10.field2650 ? 0 : -1);
                                                    }
                                                }
                                                var216++;
                                            }
                                        }
                                    }
                                    if (var10.field2600 == 8 && Statics.field928 == var10 && field612 == field611) {
                                        int var223 = 0;
                                        int var224 = 0;
                                        class183 var225 = Statics.field1818;
                                        String var226 = var10.field2645;
                                        String var227 = method1556(var226, var10);
                                        while (var227.length() > 0) {
                                            int var228 = var227.indexOf(class2.field22);
                                            String var229;
                                            if (var228 == -1) {
                                                var229 = var227;
                                                var227 = "";
                                            } else {
                                                var229 = var227.substring(0, var228);
                                                var227 = var227.substring(var228 + 4);
                                            }
                                            int var230 = var225.method3400(var229);
                                            if (var230 > var223) {
                                                var223 = var230;
                                            }
                                            var224 += var225.field2845 + 1;
                                        }
                                        var223 += 6;
                                        var224 += 7;
                                        int var231 = var10.field2607 + var12 - 5 - var223;
                                        int var232 = var10.field2608 + var13 + 5;
                                        if (var231 < var12 + 5) {
                                            var231 = var12 + 5;
                                        }
                                        if (var223 + var231 > arg4) {
                                            var231 = arg4 - var223;
                                        }
                                        if (var224 + var232 > arg5) {
                                            var232 = arg5 - var224;
                                        }
                                        class89.method1801(var231, var232, var223, var224, 16777120);
                                        class89.method1808(var231, var232, var223, var224, 0);
                                        String var233 = var10.field2645;
                                        int var234 = var225.field2845 + var232 + 2;
                                        String var235 = method1556(var233, var10);
                                        while (var235.length() > 0) {
                                            int var236 = var235.indexOf(class2.field22);
                                            String var237;
                                            if (var236 == -1) {
                                                var237 = var235;
                                                var235 = "";
                                            } else {
                                                var237 = var235.substring(0, var236);
                                                var235 = var235.substring(var236 + 4);
                                            }
                                            var225.method3404(var237, var231 + 3, var234, 0, -1);
                                            var234 += var225.field2845 + 1;
                                        }
                                    }
                                    if (var10.field2600 == 9) {
                                        if (var10.field2651 == 1) {
                                            class89.method1814(var12, var13, var10.field2607 + var12, var10.field2608 + var13, var10.field2615);
                                        } else {
                                            int var238 = var10.field2607 >= 0 ? var10.field2607 : -var10.field2607;
                                            int var239 = var10.field2608 >= 0 ? var10.field2608 : -var10.field2608;
                                            int var240 = var238;
                                            if (var238 < var239) {
                                                var240 = var239;
                                            }
                                            if (var240 != 0) {
                                                int var241 = (var10.field2607 << 16) / var240;
                                                int var242 = (var10.field2608 << 16) / var240;
                                                if (var242 <= var241) {
                                                    var241 = -var241;
                                                } else {
                                                    var242 = -var242;
                                                }
                                                int var243 = var10.field2651 * var242 >> 17;
                                                int var244 = var10.field2651 * var242 + 1 >> 17;
                                                int var245 = var10.field2651 * var241 >> 17;
                                                int var246 = var10.field2651 * var241 + 1 >> 17;
                                                int var247 = var12 + var243;
                                                int var248 = var12 - var244;
                                                int var249 = var10.field2607 + var12 - var244;
                                                int var250 = var10.field2607 + var12 + var243;
                                                int var251 = var13 + var245;
                                                int var252 = var13 - var246;
                                                int var253 = var10.field2608 + var13 - var246;
                                                int var254 = var10.field2608 + var13 + var245;
                                                class104.method2168(var247, var248, var249);
                                                class104.method2142(var251, var252, var253, var247, var248, var249, var10.field2615);
                                                class104.method2168(var247, var249, var250);
                                                class104.method2142(var251, var253, var254, var247, var249, var250, var10.field2615);
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

    @ObfuscatedName("bf.ce(Ljava/lang/String;Lfn;I)Ljava/lang/String;")
    public static String method1556(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method596(arg1, var2 - 1);
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
                if (Statics.field2008 != null) {
                    var8 = class148.method2307(Statics.field2008.field1397);
                    if (Statics.field2008.field1399 != null) {
                        var8 = (String) Statics.field2008.field1399;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("g.ca(IB)Ljava/lang/String;")
    public static final String method116(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1391(65408) + var1.substring(0, var1.length() - 8) + class135.field2242 + " " + class2.field33 + var1 + class2.field16 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method1391(16777215) + var1.substring(0, var1.length() - 4) + class135.field2244 + " " + class2.field33 + var1 + class2.field16 + class2.field23;
        } else {
            return " " + class2.method1391(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("dx.cp(Lfn;IIIIIIS)V")
    public static final void method2197(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field541) {
            field628 = 32;
        } else {
            field628 = 0;
        }
        field541 = false;
        if (class77.field1387 == 1) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2612 -= 4;
                method640(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2612 += 4;
                method640(arg0);
            } else if (arg5 >= arg1 - field628 && arg5 < field628 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2612 = (arg4 - arg3) * var8 / var9;
                method640(arg0);
                field541 = true;
            }
        }
        if (field655 == 0) {
            return;
        }
        int var10 = arg0.field2607;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2612 += field655 * 45;
            method640(arg0);
        }
    }

    @ObfuscatedName("dr.cu(Lfn;B)Z")
    public static final boolean method2231(class159 arg0) {
        if (arg0.field2687 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2687.length; var1++) {
            int var2 = method596(arg0, var1);
            int var3 = arg0.field2696[var1];
            if (arg0.field2687[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2687[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2687[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("af.cn(Lfn;II)I")
    public static final int method596(class159 arg0, int arg1) {
        if (arg0.field2694 == null || arg1 >= arg0.field2694.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2694[arg1];
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
                    var7 = field597[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field492[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field599[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method2754(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method1433(var12).field987 || field618)) {
                        for (int var13 = 0; var13 < var11.field2700.length; var13++) {
                            if (var12 + 1 == var11.field2700[var13]) {
                                var7 += var11.field2701[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2717[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2057[field492[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2717[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1424.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2056[var14]) {
                            var7 += field492[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method2754(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method1433(var18).field987 || field618)) {
                        for (int var19 = 0; var19 < var17.field2700.length; var19++) {
                            if (var18 + 1 == var17.field2700[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field624;
                }
                if (var6 == 12) {
                    var7 = field474;
                }
                if (var6 == 13) {
                    int var20 = class160.field2717[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method315(var22);
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
                    var7 = (Statics.field1424.field401 >> 7) + Statics.field10;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1424.field414 >> 7) + Statics.field289;
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

    @ObfuscatedName("fc.ci(Lfn;IIB)V")
    public static final void method3387(class159 arg0, int arg1, int arg2) {
        if (arg0.field2655 == 1) {
            Statics.method145(arg0.field2699, "", 24, 0, 0, arg0.field2596);
        }
        if (arg0.field2655 == 2 && !field615) {
            String var3 = method2234(arg0);
            if (var3 != null) {
                Statics.method145(var3, class2.method1391(65280) + arg0.field2621, 25, 0, -1, arg0.field2596);
            }
        }
        if (arg0.field2655 == 3) {
            Statics.method145(class135.field2240, "", 26, 0, 0, arg0.field2596);
        }
        if (arg0.field2655 == 4) {
            Statics.method145(arg0.field2699, "", 28, 0, 0, arg0.field2596);
        }
        if (arg0.field2655 == 5) {
            Statics.method145(arg0.field2699, "", 29, 0, 0, arg0.field2596);
        }
        if (arg0.field2655 == 6 && field712 == null) {
            Statics.method145(arg0.field2699, "", 30, 0, -1, arg0.field2596);
        }
        if (arg0.field2600 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2608; var5++) {
                for (int var6 = 0; var6 < arg0.field2607; var6++) {
                    int var7 = (arg0.field2601 + 32) * var6;
                    int var8 = (arg0.field2652 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2695[var4];
                        var8 += arg0.field2654[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field586 = var4;
                        Statics.field448 = arg0;
                        if (arg0.field2700[var4] > 0) {
                            label288: {
                                class40 var9 = class40.method1433(arg0.field2700[var4] - 1);
                                if (field631 == 1) {
                                    int var10 = method544(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field186 != arg0.field2596 || Statics.field1257 != var4) {
                                            Statics.method145(class135.field2231, field614 + " " + class2.field21 + " " + class2.method1391(16748608) + var9.field974, 31, var9.field972, var4, arg0.field2596);
                                        }
                                        break label288;
                                    }
                                }
                                if (field615) {
                                    int var12 = method544(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1245 & 0x10) == 16) {
                                            Statics.method145(field517, field575 + " " + class2.field21 + " " + class2.method1391(16748608) + var9.field974, 32, var9.field972, var4, arg0.field2596);
                                        }
                                        break label288;
                                    }
                                }
                                String[] var14 = var9.field989;
                                if (field629) {
                                    var14 = method223(var14);
                                }
                                int var15 = method544(arg0);
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
                                            Statics.method145(var14[var17], class2.method1391(16748608) + var9.field974, var18, var9.field972, var4, arg0.field2596);
                                        } else if (var17 == 4) {
                                            Statics.method145(class135.field2092, class2.method1391(16748608) + var9.field974, 37, var9.field972, var4, arg0.field2596);
                                        }
                                    }
                                }
                                int var19 = method544(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    Statics.method145(class135.field2231, class2.method1391(16748608) + var9.field974, 38, var9.field972, var4, arg0.field2596);
                                }
                                int var21 = method544(arg0);
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
                                            Statics.method145(var14[var23], class2.method1391(16748608) + var9.field974, var24, var9.field972, var4, arg0.field2596);
                                        }
                                    }
                                }
                                String[] var25 = arg0.field2661;
                                if (field629) {
                                    var25 = method223(var25);
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
                                            Statics.method145(var25[var26], class2.method1391(16748608) + var9.field974, var27, var9.field972, var4, arg0.field2596);
                                        }
                                    }
                                }
                                Statics.method145(class135.field2232, class2.method1391(16748608) + var9.field974, 1005, var9.field972, var4, arg0.field2596);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2597) {
            return;
        }
        if (field615) {
            int var28 = method544(arg0);
            boolean var29 = (var28 >> 21 & 0x1) != 0;
            if (var29 && (Statics.field1245 & 0x20) == 32) {
                Statics.method145(field517, field575 + " " + class2.field21 + " " + arg0.field2658, 58, 0, arg0.field2599, arg0.field2596);
            }
            return;
        }
        for (int var30 = 9; var30 >= 5; var30--) {
            String var31 = method1876(arg0, var30);
            if (var31 != null) {
                Statics.method145(var31, arg0.field2658, 1007, var30 + 1, arg0.field2599, arg0.field2596);
            }
        }
        String var32 = method2234(arg0);
        if (var32 != null) {
            Statics.method145(var32, arg0.field2658, 25, 0, arg0.field2599, arg0.field2596);
        }
        for (int var33 = 4; var33 >= 0; var33--) {
            String var34 = method1876(arg0, var33);
            if (var34 != null) {
                Statics.method145(var34, arg0.field2658, 57, var33 + 1, arg0.field2599, arg0.field2596);
            }
        }
        if (class163.method226(method544(arg0))) {
            Statics.method145(class135.field2109, "", 30, 0, arg0.field2599, arg0.field2596);
        }
    }

    @ObfuscatedName("w.cy(IIIIIIII)V")
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class159.method239(arg0)) {
            method2344(Statics.field2693[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dt.cv([Lfn;IIIIIIII)V")
    public static final void method2344(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2597 || var9.field2600 == 0 || var9.field2665 || method544(var9) != 0 || field460 == var9) && var9.field2704 == arg1 && (!var9.field2597 || !method898(var9))) {
                int var10 = var9.field2667 + arg6;
                int var11 = var9.field2668 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2600 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2600 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2607 + var10;
                    int var19 = var9.field2608 + var11;
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
                    int var22 = var9.field2607 + var10;
                    int var23 = var9.field2608 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field594 == var9) {
                    field547 = true;
                    field639 = var10;
                    field640 = var11;
                }
                if (!var9.field2597 || var12 < var14 && var13 < var15) {
                    if (var9.field2653 == 1337) {
                        method640(var9);
                    } else if (var9.field2653 != 1338) {
                        if (var9.field2600 == 0) {
                            if (!var9.field2597 && method898(var9) && Statics.field375 != var9) {
                                continue;
                            }
                            method2344(arg0, var9.field2596, var12, var13, var14, var15, var10 - var9.field2611, var11 - var9.field2612);
                            if (var9.field2633 != null) {
                                method2344(var9.field2633, var9.field2596, var12, var13, var14, var15, var10 - var9.field2611, var11 - var9.field2612);
                            }
                            class4 var35 = (class4) field620.method3312((long) var9.field2596);
                            if (var35 != null) {
                                method224(var35.field64, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2597) {
                            boolean var36;
                            if (class77.field1376 >= var12 && class77.field1375 >= var13 && class77.field1376 < var14 && class77.field1375 < var15) {
                                var36 = true;
                            } else {
                                var36 = false;
                            }
                            boolean var37 = false;
                            if (class77.field1387 == 1 && var36) {
                                var37 = true;
                            }
                            boolean var38 = false;
                            if (class77.field1383 == 1 && class77.field1384 >= var12 && class77.field1385 >= var13 && class77.field1384 < var14 && class77.field1385 < var15) {
                                var38 = true;
                            }
                            if (var38) {
                                method130(var9, class77.field1384 - var10, class77.field1385 - var11);
                            }
                            if (field594 != null && field594 != var9 && var36) {
                                int var39 = method544(var9);
                                boolean var40 = (var39 >> 20 & 0x1) != 0;
                                if (var40) {
                                    field634 = var9;
                                }
                            }
                            if (field460 == var9) {
                                field635 = true;
                                field636 = var10;
                                field637 = var11;
                            }
                            if (var9.field2665) {
                                if (var36 && field655 != 0 && var9.field2587 != null) {
                                    class1 var41 = new class1();
                                    var41.field9 = var9;
                                    var41.field1 = field655;
                                    var41.field8 = var9.field2587;
                                    field656.method3333(var41);
                                }
                                if (field594 != null || Statics.field293 != null || field535) {
                                    var38 = false;
                                    var37 = false;
                                    var36 = false;
                                }
                                if (!var9.field2708 && var38) {
                                    var9.field2708 = true;
                                    if (var9.field2669 != null) {
                                        class1 var42 = new class1();
                                        var42.field9 = var9;
                                        var42.field3 = class77.field1384 - var10;
                                        var42.field1 = class77.field1385 - var11;
                                        var42.field8 = var9.field2669;
                                        field656.method3333(var42);
                                    }
                                }
                                if (var9.field2708 && var37 && var9.field2598 != null) {
                                    class1 var43 = new class1();
                                    var43.field9 = var9;
                                    var43.field3 = class77.field1376 - var10;
                                    var43.field1 = class77.field1375 - var11;
                                    var43.field8 = var9.field2598;
                                    field656.method3333(var43);
                                }
                                if (var9.field2708 && !var37) {
                                    var9.field2708 = false;
                                    if (var9.field2682 != null) {
                                        class1 var44 = new class1();
                                        var44.field9 = var9;
                                        var44.field3 = class77.field1376 - var10;
                                        var44.field1 = class77.field1375 - var11;
                                        var44.field8 = var9.field2682;
                                        field475.method3333(var44);
                                    }
                                }
                                if (var37 && var9.field2710 != null) {
                                    class1 var45 = new class1();
                                    var45.field9 = var9;
                                    var45.field3 = class77.field1376 - var10;
                                    var45.field1 = class77.field1375 - var11;
                                    var45.field8 = var9.field2710;
                                    field656.method3333(var45);
                                }
                                if (!var9.field2656 && var36) {
                                    var9.field2656 = true;
                                    if (var9.field2671 != null) {
                                        class1 var46 = new class1();
                                        var46.field9 = var9;
                                        var46.field3 = class77.field1376 - var10;
                                        var46.field1 = class77.field1375 - var11;
                                        var46.field8 = var9.field2671;
                                        field656.method3333(var46);
                                    }
                                }
                                if (var9.field2656 && var36 && var9.field2672 != null) {
                                    class1 var47 = new class1();
                                    var47.field9 = var9;
                                    var47.field3 = class77.field1376 - var10;
                                    var47.field1 = class77.field1375 - var11;
                                    var47.field8 = var9.field2672;
                                    field656.method3333(var47);
                                }
                                if (var9.field2656 && !var36) {
                                    var9.field2656 = false;
                                    if (var9.field2673 != null) {
                                        class1 var48 = new class1();
                                        var48.field9 = var9;
                                        var48.field3 = class77.field1376 - var10;
                                        var48.field1 = class77.field1375 - var11;
                                        var48.field8 = var9.field2673;
                                        field475.method3333(var48);
                                    }
                                }
                                if (var9.field2684 != null) {
                                    class1 var49 = new class1();
                                    var49.field9 = var9;
                                    var49.field8 = var9.field2684;
                                    field657.method3333(var49);
                                }
                                if (var9.field2678 != null && field644 > var9.field2660) {
                                    if (var9.field2679 == null || field644 - var9.field2660 > 32) {
                                        class1 var54 = new class1();
                                        var54.field9 = var9;
                                        var54.field8 = var9.field2678;
                                        field656.method3333(var54);
                                    } else {
                                        label405: for (int var50 = var9.field2660; var50 < field644; var50++) {
                                            int var51 = field643[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2679.length; var52++) {
                                                if (var9.field2679[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field9 = var9;
                                                    var53.field8 = var9.field2678;
                                                    field656.method3333(var53);
                                                    break label405;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2660 = field644;
                                }
                                if (var9.field2680 != null && field646 > var9.field2630) {
                                    if (var9.field2589 == null || field646 - var9.field2630 > 32) {
                                        class1 var59 = new class1();
                                        var59.field9 = var9;
                                        var59.field8 = var9.field2680;
                                        field656.method3333(var59);
                                    } else {
                                        label385: for (int var55 = var9.field2630; var55 < field646; var55++) {
                                            int var56 = field671[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2589.length; var57++) {
                                                if (var9.field2589[var57] == var56) {
                                                    class1 var58 = new class1();
                                                    var58.field9 = var9;
                                                    var58.field8 = var9.field2680;
                                                    field656.method3333(var58);
                                                    break label385;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2630 = field646;
                                }
                                if (var9.field2604 != null && field699 > var9.field2712) {
                                    if (var9.field2683 == null || field699 - var9.field2712 > 32) {
                                        class1 var64 = new class1();
                                        var64.field9 = var9;
                                        var64.field8 = var9.field2604;
                                        field656.method3333(var64);
                                    } else {
                                        label365: for (int var60 = var9.field2712; var60 < field699; var60++) {
                                            int var61 = field649[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field2683.length; var62++) {
                                                if (var9.field2683[var62] == var61) {
                                                    class1 var63 = new class1();
                                                    var63.field9 = var9;
                                                    var63.field8 = var9.field2604;
                                                    field656.method3333(var63);
                                                    break label365;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2712 = field699;
                                }
                                if (field682 > var9.field2709 && var9.field2644 != null) {
                                    class1 var65 = new class1();
                                    var65.field9 = var9;
                                    var65.field8 = var9.field2644;
                                    field656.method3333(var65);
                                }
                                if (field685 > var9.field2709 && var9.field2689 != null) {
                                    class1 var66 = new class1();
                                    var66.field9 = var9;
                                    var66.field8 = var9.field2689;
                                    field656.method3333(var66);
                                }
                                if (field651 > var9.field2709 && var9.field2690 != null) {
                                    class1 var67 = new class1();
                                    var67.field9 = var9;
                                    var67.field8 = var9.field2690;
                                    field656.method3333(var67);
                                }
                                if (field652 > var9.field2709 && var9.field2691 != null) {
                                    class1 var68 = new class1();
                                    var68.field9 = var9;
                                    var68.field8 = var9.field2691;
                                    field656.method3333(var68);
                                }
                                var9.field2709 = field642;
                                if (var9.field2688 != null) {
                                    for (int var69 = 0; var69 < field661; var69++) {
                                        class1 var70 = new class1();
                                        var70.field9 = var9;
                                        var70.field7 = field527[var69];
                                        var70.field2 = field681[var69];
                                        var70.field8 = var9.field2688;
                                        field656.method3333(var70);
                                    }
                                }
                            }
                        }
                        if (!var9.field2597) {
                            if (field594 != null || Statics.field293 != null || field535) {
                                return;
                            }
                            if ((var9.field2697 >= 0 || var9.field2617 != 0) && class77.field1376 >= var12 && class77.field1375 >= var13 && class77.field1376 < var14 && class77.field1375 < var15) {
                                if (var9.field2697 >= 0) {
                                    Statics.field375 = arg0[var9.field2697];
                                } else {
                                    Statics.field375 = var9;
                                }
                            }
                            if (var9.field2600 == 8 && class77.field1376 >= var12 && class77.field1375 >= var13 && class77.field1376 < var14 && class77.field1375 < var15) {
                                Statics.field928 = var9;
                            }
                            if (var9.field2614 > var9.field2608) {
                                method2197(var9, var9.field2607 + var10, var11, var9.field2608, var9.field2614, class77.field1376, class77.field1375);
                            }
                        }
                    } else if ((field580 == 0 || field580 == 3) && class77.field1383 == 1) {
                        int var24 = class77.field1384 - 25 - var10;
                        int var25 = class77.field1385 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field544 + field473 & 0x7FF;
                            int var27 = class104.field1774[var26];
                            int var28 = class104.field1775[var26];
                            int var29 = (field616 + 256) * var27 >> 8;
                            int var30 = (field616 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field1424.field401 + var31 >> 7;
                            int var34 = Statics.field1424.field414 - var32 >> 7;
                            field694.method2316(243);
                            field694.method2536(18);
                            field694.method2489(Statics.field289 + var34);
                            field694.method2487(Statics.field10 + var33);
                            field694.method2475(class75.field1347[82] ? (class75.field1347[81] ? 2 : 1) : 0);
                            field694.method2536(var24);
                            field694.method2536(var25);
                            field694.method2563(field544);
                            field694.method2536(57);
                            field694.method2536(field473);
                            field694.method2536(field616);
                            field694.method2536(89);
                            field694.method2563(Statics.field1424.field401);
                            field694.method2563(Statics.field1424.field414);
                            field694.method2536(63);
                            field691 = var33;
                            field480 = var34;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.cc(III)V")
    public static final void method2313(int arg0, int arg1) {
        if (class159.method239(arg0)) {
            method144(Statics.field2693[arg0], arg1);
        }
    }

    @ObfuscatedName("v.cx([Lfn;II)V")
    public static final void method144(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2600 == 0) {
                    if (var3.field2633 != null) {
                        method144(var3.field2633, arg1);
                    }
                    class4 var4 = (class4) field620.method3312((long) var3.field2596);
                    if (var4 != null) {
                        int var5 = var4.field64;
                        if (class159.method239(var5)) {
                            method144(Statics.field2693[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2686 != null) {
                    class1 var6 = new class1();
                    var6.field9 = var3;
                    var6.field8 = var3.field2686;
                    class26.method2441(var6);
                }
                if (arg1 == 1 && var3.field2606 != null) {
                    if (var3.field2599 >= 0) {
                        class159 var7 = class159.method2754(var3.field2596);
                        if (var7 == null || var7.field2633 == null || var3.field2599 >= var7.field2633.length || var7.field2633[var3.field2599] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field9 = var3;
                    var8.field8 = var3.field2606;
                    class26.method2441(var8);
                }
            }
        }
    }

    @ObfuscatedName("s.co(Lfn;III)V")
    public static final void method130(class159 arg0, int arg1, int arg2) {
        if (field594 != null || field535 || arg0 == null) {
            return;
        }
        class159 var3 = method2054(arg0);
        if (var3 == null) {
            var3 = arg0.field2593;
        }
        if (var3 == null) {
            return;
        }
        field594 = arg0;
        class159 var5 = arg0;
        int var6 = method544(arg0);
        int var7 = var6 >> 17 & 0x7;
        int var8 = var7;
        class159 var9;
        if (var7 == 0) {
            var9 = null;
        } else {
            int var10 = 0;
            while (true) {
                if (var10 >= var8) {
                    var9 = var5;
                    break;
                }
                var5 = class159.method2754(var5.field2704);
                if (var5 == null) {
                    var9 = null;
                    break;
                }
                var10++;
            }
        }
        class159 var11 = var9;
        if (var9 == null) {
            var11 = arg0.field2593;
        }
        field460 = var11;
        field632 = arg1;
        field633 = arg2;
        Statics.field1746 = 0;
        field529 = false;
        return;
    }

    @ObfuscatedName("ag.cq(Lfn;B)V")
    public static void method640(class159 arg0) {
        if (field557 == arg0.field2714) {
            field662[arg0.field2713] = true;
        }
    }

    @ObfuscatedName("ah.cd(I)V")
    public static void method791() {
        for (class4 var0 = (class4) field620.method3315(); var0 != null; var0 = (class4) field620.method3316()) {
            int var1 = var0.field64;
            if (class159.method239(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field2693[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2597;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2812;
                    class159 var6 = class159.method2754(var5);
                    if (var6 != null) {
                        method640(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.cr([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method223(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cj.cg(IB)V")
    public static final void method1603(int arg0) {
        if (class159.method239(arg0)) {
            method257(Statics.field2693[arg0], -1);
        }
    }

    @ObfuscatedName("aa.cw([Lfn;II)V")
    public static final void method257(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2704 == arg1 && (!var3.field2597 || !method898(var3))) {
                if (var3.field2600 == 0) {
                    if (!var3.field2597 && method898(var3) && Statics.field375 != var3) {
                        continue;
                    }
                    method257(arg0, var3.field2596);
                    if (var3.field2633 != null) {
                        method257(var3.field2633, var3.field2596);
                    }
                    class4 var4 = (class4) field620.method3312((long) var3.field2596);
                    if (var4 != null) {
                        method1603(var4.field64);
                    }
                }
                if (var3.field2600 == 6) {
                    if (var3.field2634 != -1 || var3.field2635 != -1) {
                        boolean var5 = method2231(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2635;
                        } else {
                            var6 = var3.field2634;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method572(var6);
                            var3.field2628 += field534;
                            while (var3.field2628 > var7.field887[var3.field2591]) {
                                var3.field2628 -= var7.field887[var3.field2591];
                                var3.field2591++;
                                if (var3.field2591 >= var7.field890.length) {
                                    var3.field2591 -= var7.field877;
                                    if (var3.field2591 < 0 || var3.field2591 >= var7.field890.length) {
                                        var3.field2591 = 0;
                                    }
                                }
                                method640(var3);
                            }
                        }
                    }
                    if (var3.field2609 != 0 && !var3.field2597) {
                        int var8 = var3.field2609 >> 16;
                        int var9 = var3.field2609 << 16 >> 16;
                        int var10 = field534 * var8;
                        int var11 = field534 * var9;
                        var3.field2638 = var3.field2638 + var10 & 0x7FF;
                        var3.field2639 = var3.field2639 + var11 & 0x7FF;
                        method640(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.cl(II)V")
    public static final void method5(int arg0) {
        method791();
        class7.method1518();
        int var1 = class42.method111(arg0).field1021;
        if (var1 == 0) {
            return;
        }
        int var2 = class160.field2717[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class104.method2147(0.9D);
                ((class110) Statics.field1771).method2224(0.9D);
            }
            if (var2 == 2) {
                class104.method2147(0.8D);
                ((class110) Statics.field1771).method2224(0.8D);
            }
            if (var2 == 3) {
                class104.method2147(0.7D);
                ((class110) Statics.field1771).method2224(0.7D);
            }
            if (var2 == 4) {
                class104.method2147(0.6D);
                ((class110) Statics.field1771).method2224(0.6D);
            }
            class40.method41();
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
            if (field566 != var3) {
                if (field566 == 0 && field548 != -1) {
                    class139.method1421(Statics.field2871, field548, 0, var3, false);
                    field664 = false;
                } else if (var3 == 0) {
                    class139.method840();
                    field664 = false;
                } else if (class139.field2350 == 0) {
                    Statics.field2347.method2790(var3);
                } else {
                    Statics.field2351 = var3;
                }
                field566 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field697 = 127;
            }
            if (var2 == 1) {
                field697 = 96;
            }
            if (var2 == 2) {
                field697 = 64;
            }
            if (var2 == 3) {
                field697 = 32;
            }
            if (var2 == 4) {
                field697 = 0;
            }
        }
        if (var1 == 5) {
            field600 = var2;
        }
        if (var1 == 6) {
            field641 = var2;
        }
        if (var1 == 9) {
            field617 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field698 = 127;
        }
        if (var2 == 1) {
            field698 = 96;
        }
        if (var2 == 2) {
            field698 = 64;
        }
        if (var2 == 3) {
            field698 = 32;
        }
        if (var2 == 4) {
            field698 = 0;
        }
    }

    @ObfuscatedName("cp.ch(Lfn;I)V")
    public static final void method1629(class159 arg0) {
        int var1 = arg0.field2653;
        if (var1 == 324) {
            if (field718 == -1) {
                field718 = arg0.field2622;
                field719 = arg0.field2623;
            }
            if (field717.field2743) {
                arg0.field2622 = field718;
            } else {
                arg0.field2622 = field719;
            }
        } else if (var1 == 325) {
            if (field718 == -1) {
                field718 = arg0.field2622;
                field719 = arg0.field2623;
            }
            if (field717.field2743) {
                arg0.field2622 = field719;
            } else {
                arg0.field2622 = field718;
            }
        } else if (var1 == 327) {
            arg0.field2638 = 150;
            arg0.field2639 = (int) (Math.sin((double) field484 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2610 = 5;
            arg0.field2631 = 0;
        } else if (var1 == 328) {
            arg0.field2638 = 150;
            arg0.field2639 = (int) (Math.sin((double) field484 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2610 = 5;
            arg0.field2631 = 1;
        }
    }

    @ObfuscatedName("s.cs(IIII)Le;")
    public static final class4 method126(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field64 = arg1;
        var3.field57 = arg2;
        field620.method3329(var3, (long) arg0);
        if (class159.method239(arg1)) {
            class159[] var4 = Statics.field2693[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class159 var6 = var4[var5];
                if (var6 != null) {
                    var6.field2591 = 0;
                    var6.field2628 = 0;
                }
            }
        }
        class26.method2365(arg1);
        class159 var7 = class159.method2754(arg0);
        if (var7 != null) {
            method640(var7);
        }
        if (field712 != null) {
            method640(field712);
            field712 = null;
        }
        method143();
        if (field619 != -1) {
            int var8 = field619;
            if (class159.method239(var8)) {
                method144(Statics.field2693[var8], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("du.cz(Le;ZI)V")
    public static final void method2218(class4 arg0, boolean arg1) {
        int var2 = arg0.field64;
        int var3 = (int) arg0.field2812;
        arg0.method3374();
        if (arg1 && var2 != -1 && Statics.field2588[var2]) {
            Statics.field2711.method3057(var2);
            if (Statics.field2693[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2693[var2].length; var5++) {
                    if (Statics.field2693[var2][var5] != null) {
                        if (Statics.field2693[var2][var5].field2600 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2693[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2693[var2] = null;
                }
                Statics.field2588[var2] = false;
            }
        }
        for (class171 var6 = (class171) field659.method3315(); var6 != null; var6 = (class171) field659.method3316()) {
            if ((long) var2 == (var6.field2812 >> 48 & 0xFFFFL)) {
                var6.method3374();
            }
        }
        class159 var7 = class159.method2754(var3);
        if (var7 != null) {
            method640(var7);
        }
        method143();
        if (field619 != -1) {
            method2313(field619, 1);
        }
    }

    @ObfuscatedName("ar.cb(Lfn;I)Z")
    public static final boolean method887(class159 arg0) {
        int var1 = arg0.field2653;
        if (var1 == 205) {
            field505 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field717.method3229(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field717.method3230(var4, var5 == 1);
        }
        if (var1 == 324) {
            field717.method3231(false);
        }
        if (var1 == 325) {
            field717.method3231(true);
        }
        if (var1 == 326) {
            field694.method2316(124);
            field717.method3250(field694);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.ct(IIIILci;B)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field544 + field473 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1774[var5];
        int var8 = class104.field1775[var5];
        int var9 = var7 * 256 / (field616 + 256);
        int var10 = var8 * 256 / (field616 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1722(Statics.field1983, arg0 + 94 + var11 - arg4.field1462 / 2 + 4, arg1 + 83 - var12 - arg4.field1463 / 2 - 4);
        } else {
            arg4.method1709(arg0 + 94 + var11 - arg4.field1462 / 2 + 4, arg1 + 83 - var12 - arg4.field1463 / 2 - 4);
        }
    }

    @ObfuscatedName("ac.dx(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method731(int arg0, String arg1, String arg2) {
        method225(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("h.dk(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method225(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field670[var4] = field670[var4 - 1];
            field519[var4] = field519[var4 - 1];
            field623[var4] = field623[var4 - 1];
            field672[var4] = field672[var4 - 1];
        }
        field670[0] = arg0;
        field519[0] = arg1;
        field623[0] = arg2;
        field672[0] = arg3;
        field695++;
        field682 = field642;
    }

    @ObfuscatedName("bz.dw(Ljava/lang/String;I)Z")
    public static boolean method1401(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method2738(arg0, Statics.field2474);
        for (int var2 = 0; var2 < field715; var2++) {
            class11 var3 = field716[var2];
            if (var1.equalsIgnoreCase(class149.method2738(var3.field174, Statics.field2474))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method2738(var3.field168, Statics.field2474))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("s.du(Ljava/lang/String;I)V")
    public static final void method127(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field711 < 200 || field491 == 1) || field711 >= 400) {
            method731(0, "", class135.field2247);
            return;
        }
        String var1 = class149.method2738(arg0, Statics.field2474);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field711; var2++) {
            class23 var3 = field713[var2];
            String var4 = class149.method2738(var3.field350, Statics.field2474);
            if (var4 != null && var4.equals(var1)) {
                method731(0, "", arg0 + class135.field2248);
                return;
            }
            if (var3.field349 != null) {
                String var5 = class149.method2738(var3.field349, Statics.field2474);
                if (var5 != null && var5.equals(var1)) {
                    method731(0, "", arg0 + class135.field2248);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field715; var6++) {
            class11 var7 = field716[var6];
            String var8 = class149.method2738(var7.field174, Statics.field2474);
            if (var8 != null && var8.equals(var1)) {
                method731(0, "", class135.field2253 + arg0 + class135.field2254);
                return;
            }
            if (var7.field168 != null) {
                String var9 = class149.method2738(var7.field168, Statics.field2474);
                if (var9 != null && var9.equals(var1)) {
                    method731(0, "", class135.field2253 + arg0 + class135.field2254);
                    return;
                }
            }
        }
        if (class149.method2738(Statics.field1424.field45, Statics.field2474).equals(var1)) {
            method731(0, "", class135.field2251);
            return;
        }
        field694.method2316(149);
        class116 var10 = field694;
        int var11 = arg0.length() + 1;
        var10.method2536(var11);
        field694.method2449(arg0);
    }

    @ObfuscatedName("n.dc(Ljava/lang/String;B)V")
    public static final void method20(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method2738(arg0, Statics.field2474);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field715; var2++) {
            class11 var3 = field716[var2];
            String var4 = var3.field174;
            String var5 = class149.method2738(var4, Statics.field2474);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field715--;
                for (int var7 = var2; var7 < field715; var7++) {
                    field716[var7] = field716[var7 + 1];
                }
                field685 = field642;
                field694.method2316(26);
                class116 var8 = field694;
                int var9 = arg0.length() + 1;
                var8.method2536(var9);
                field694.method2449(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ai.dr(Ljava/lang/String;IB)V")
    public static final void method597(String arg0, int arg1) {
        field694.method2316(128);
        class116 var2 = field694;
        int var3 = arg0.length() + 1;
        var2.method2536(var3 + 1);
        field694.method2475(arg1);
        field694.method2449(arg0);
    }

    @ObfuscatedName("dw.dn(Ljava/lang/String;S)V")
    public static final void method2216(String arg0) {
        if (Statics.field1280 == null) {
            return;
        }
        field694.method2316(141);
        class116 var1 = field694;
        int var2 = arg0.length() + 1;
        var1.method2536(var2);
        field694.method2449(arg0);
    }

    @ObfuscatedName("co.dp(I)V")
    public static final void method1872() {
        field694.method2316(36);
        field694.method2536(0);
    }

    @ObfuscatedName("client.dl(Lfn;I)I")
    public static int method544(class159 arg0) {
        class171 var1 = (class171) field659.method3312(((long) arg0.field2596 << 32) + (long) arg0.field2599);
        return var1 == null ? arg0.field2657 : var1.field2796;
    }

    @ObfuscatedName("ch.dh(Lfn;I)Lfn;")
    public static class159 method2054(class159 arg0) {
        int var1 = method544(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class159.method2754(arg0.field2704);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ar.df(Lfn;B)Z")
    public static boolean method898(class159 arg0) {
        if (field703) {
            if (method544(arg0) != 0) {
                return false;
            }
            if (arg0.field2600 == 0) {
                return false;
            }
        }
        return arg0.field2705;
    }

    @ObfuscatedName("ck.dj(Lfn;II)Ljava/lang/String;")
    public static String method1876(class159 arg0, int arg1) {
        if (!Statics.method661(method544(arg0), arg1) && arg0.field2685 == null) {
            return null;
        } else if (arg0.field2659 == null || arg0.field2659.length <= arg1 || arg0.field2659[arg1] == null || arg0.field2659[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2659[arg1];
        }
    }

    @ObfuscatedName("dr.dt(Lfn;I)Ljava/lang/String;")
    public static String method2234(class159 arg0) {
        if (class163.method168(method544(arg0)) == 0) {
            return null;
        } else if (arg0.field2664 == null || arg0.field2664.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2664;
        }
    }
}

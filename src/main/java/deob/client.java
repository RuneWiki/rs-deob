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

    @ObfuscatedName("client.u")
    public static boolean field456 = true;

    @ObfuscatedName("client.t")
    public static int field457 = 1;

    @ObfuscatedName("client.v")
    public static int field458 = 0;

    @ObfuscatedName("client.q")
    public static boolean field460 = false;

    @ObfuscatedName("client.i")
    public static boolean field597 = false;

    @ObfuscatedName("client.p")
    public static int field462 = 0;

    @ObfuscatedName("client.o")
    public static int field605 = 0;

    @ObfuscatedName("client.j")
    public static boolean field464 = true;

    @ObfuscatedName("client.s")
    public static int field465 = 0;

    @ObfuscatedName("client.b")
    public static long field466 = 1L;

    @ObfuscatedName("client.m")
    public static int field467 = -1;

    @ObfuscatedName("client.z")
    public static int field468 = -1;

    @ObfuscatedName("client.h")
    public static int field469 = -1;

    @ObfuscatedName("client.f")
    public static boolean field470 = true;

    @ObfuscatedName("client.w")
    public static class164[] field511 = new class164[4];

    @ObfuscatedName("client.l")
    public static boolean field471 = false;

    @ObfuscatedName("client.d")
    public static int field459 = 0;

    @ObfuscatedName("client.ah")
    public static int field639 = 0;

    @ObfuscatedName("client.ad")
    public static int field474 = 0;

    @ObfuscatedName("client.au")
    public static int field489 = 0;

    @ObfuscatedName("client.as")
    public static int field541 = 0;

    @ObfuscatedName("client.ag")
    public static int field536 = 0;

    @ObfuscatedName("client.ab")
    public static int field586 = 0;

    @ObfuscatedName("client.aq")
    public static int field455 = 0;

    @ObfuscatedName("client.af")
    public static int field480 = 0;

    @ObfuscatedName("client.ay")
    public static class126 field481 = new class126(new byte[5000]);

    @ObfuscatedName("client.ak")
    public static int field529 = 0;

    @ObfuscatedName("client.av")
    public static int field528 = 0;

    @ObfuscatedName("client.al")
    public static int field454 = 0;

    @ObfuscatedName("client.bl")
    public static int field485 = 0;

    @ObfuscatedName("client.ba")
    public static int field627 = 0;

    @ObfuscatedName("client.bx")
    public static int field637 = 0;

    @ObfuscatedName("client.bq")
    public static int field646 = 0;

    @ObfuscatedName("client.bu")
    public static int field478 = 0;

    @ObfuscatedName("client.bs")
    public static class25[] field490 = new class25[32768];

    @ObfuscatedName("client.bn")
    public static int field484 = 0;

    @ObfuscatedName("client.bm")
    public static int[] field492 = new int[32768];

    @ObfuscatedName("client.cl")
    public static class116 field493 = new class116(5000);

    @ObfuscatedName("client.ce")
    public static class116 field494 = new class116(5000);

    @ObfuscatedName("client.ci")
    public static class116 field514 = new class116(5000);

    @ObfuscatedName("client.cr")
    public static int field496 = 0;

    @ObfuscatedName("client.cy")
    public static int field497 = 0;

    @ObfuscatedName("client.cm")
    public static int field523 = 0;

    @ObfuscatedName("client.co")
    public static int field542 = 0;

    @ObfuscatedName("client.ct")
    public static int field653 = 0;

    @ObfuscatedName("client.cb")
    public static int field501 = 0;

    @ObfuscatedName("client.cw")
    public static int field502 = 0;

    @ObfuscatedName("client.cj")
    public static int field503 = 0;

    @ObfuscatedName("client.cq")
    public static boolean field482 = false;

    @ObfuscatedName("client.cs")
    public static int field574 = 0;

    @ObfuscatedName("client.ck")
    public static int field506 = 0;

    @ObfuscatedName("client.cp")
    public static int field507 = 1;

    @ObfuscatedName("client.cn")
    public static int field508 = 0;

    @ObfuscatedName("client.ca")
    public static int field622 = 1;

    @ObfuscatedName("client.de")
    public static int field476 = 0;

    @ObfuscatedName("client.dd")
    public static boolean field512 = false;

    @ObfuscatedName("client.dc")
    public static int[][][] field513 = new int[4][13][13];

    @ObfuscatedName("client.dz")
    public static final int[] field509 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ds")
    public static int field515 = 0;

    @ObfuscatedName("client.dn")
    public static int[][] field629 = new int[104][104];

    @ObfuscatedName("client.di")
    public static int[][] field491 = new int[104][104];

    @ObfuscatedName("client.dg")
    public static int[] field518 = new int[4000];

    @ObfuscatedName("client.dl")
    public static int[] field519 = new int[4000];

    @ObfuscatedName("client.dx")
    public static int field520 = 0;

    @ObfuscatedName("client.dv")
    public static int field521 = 2;

    @ObfuscatedName("client.dt")
    public static int field522 = 0;

    @ObfuscatedName("client.df")
    public static int field684 = 2;

    @ObfuscatedName("client.db")
    public static int field524 = 0;

    @ObfuscatedName("client.dp")
    public static int field525 = 1;

    @ObfuscatedName("client.dr")
    public static int field526 = 0;

    @ObfuscatedName("client.dm")
    public static int field527 = 0;

    @ObfuscatedName("client.ee")
    public static int field664 = 2;

    @ObfuscatedName("client.eh")
    public static int field488 = 0;

    @ObfuscatedName("client.en")
    public static int field691 = 1;

    @ObfuscatedName("client.ea")
    public static int field531 = 0;

    @ObfuscatedName("client.ef")
    public static int field532 = 0;

    @ObfuscatedName("client.ed")
    public static int field505 = 2301979;

    @ObfuscatedName("client.eb")
    public static int field534 = 5063219;

    @ObfuscatedName("client.es")
    public static int field535 = 3353893;

    @ObfuscatedName("client.fx")
    public static int field678 = 7759444;

    @ObfuscatedName("client.fh")
    public static boolean field537 = false;

    @ObfuscatedName("client.fp")
    public static int field538 = 0;

    @ObfuscatedName("client.fo")
    public static int field483 = 128;

    @ObfuscatedName("client.fz")
    public static int field581 = 0;

    @ObfuscatedName("client.fr")
    public static int field572 = 0;

    @ObfuscatedName("client.ff")
    public static int field668 = 0;

    @ObfuscatedName("client.fg")
    public static int field544 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field570 = false;

    @ObfuscatedName("client.fn")
    public static int field546 = 0;

    @ObfuscatedName("client.fw")
    public static int field547 = 0;

    @ObfuscatedName("client.fk")
    public static int field628 = 50;

    @ObfuscatedName("client.fl")
    public static int[] field577 = new int[field628];

    @ObfuscatedName("client.fe")
    public static int[] field550 = new int[field628];

    @ObfuscatedName("client.ft")
    public static int[] field551 = new int[field628];

    @ObfuscatedName("client.fs")
    public static int[] field647 = new int[field628];

    @ObfuscatedName("client.fa")
    public static int[] field549 = new int[field628];

    @ObfuscatedName("client.fm")
    public static int[] field554 = new int[field628];

    @ObfuscatedName("client.fb")
    public static int[] field555 = new int[field628];

    @ObfuscatedName("client.gd")
    public static String[] field499 = new String[field628];

    @ObfuscatedName("client.gq")
    public static int[][] field557 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field558 = 0;

    @ObfuscatedName("client.gv")
    public static int field559 = -1;

    @ObfuscatedName("client.gj")
    public static int field560 = -1;

    @ObfuscatedName("client.gs")
    public static int field548 = 0;

    @ObfuscatedName("client.gm")
    public static int field562 = 0;

    @ObfuscatedName("client.gy")
    public static int field563 = 0;

    @ObfuscatedName("client.gr")
    public static int field564 = 0;

    @ObfuscatedName("client.ge")
    public static int field510 = 0;

    @ObfuscatedName("client.gg")
    public static int field566 = 0;

    @ObfuscatedName("client.gb")
    public static int field695 = 0;

    @ObfuscatedName("client.gf")
    public static int field568 = 0;

    @ObfuscatedName("client.gt")
    public static int field543 = 0;

    @ObfuscatedName("client.gi")
    public static int field641 = 0;

    @ObfuscatedName("client.gk")
    public static boolean field624 = false;

    @ObfuscatedName("client.gu")
    public static int field556 = 0;

    @ObfuscatedName("client.gh")
    public static int field573 = 0;

    @ObfuscatedName("client.gw")
    public static class3[] field486 = new class3[2048];

    @ObfuscatedName("client.gz")
    public static int field575 = 0;

    @ObfuscatedName("client.ga")
    public static int[] field576 = new int[2048];

    @ObfuscatedName("client.hf")
    public static int field545 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field578 = new int[2048];

    @ObfuscatedName("client.hk")
    public static class126[] field579 = new class126[2048];

    @ObfuscatedName("client.ha")
    public static int field580 = -1;

    @ObfuscatedName("client.hj")
    public static int field596 = 0;

    @ObfuscatedName("client.hn")
    public static int field582 = 0;

    @ObfuscatedName("client.hl")
    public static int[] field583 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field584 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ht")
    public static String[] field585 = new String[8];

    @ObfuscatedName("client.hx")
    public static boolean[] field498 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field587 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static class177[][][] field588 = new class177[4][104][104];

    @ObfuscatedName("client.hr")
    public static class177 field473 = new class177();

    @ObfuscatedName("client.hm")
    public static class177 field681 = new class177();

    @ObfuscatedName("client.he")
    public static class177 field591 = new class177();

    @ObfuscatedName("client.hz")
    public static int[] field592 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field593 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field594 = new int[25];

    @ObfuscatedName("client.hu")
    public static int field487 = 0;

    @ObfuscatedName("client.hg")
    public static boolean field613 = false;

    @ObfuscatedName("client.iu")
    public static int field590 = 0;

    @ObfuscatedName("client.il")
    public static int[] field598 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field599 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field600 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field601 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field602 = new String[500];

    @ObfuscatedName("client.if")
    public static String[] field603 = new String[500];

    @ObfuscatedName("client.iy")
    public static int field604 = -1;

    @ObfuscatedName("client.iq")
    public static int field540 = -1;

    @ObfuscatedName("client.im")
    public static int field669 = 0;

    @ObfuscatedName("client.ih")
    public static int field683 = 50;

    @ObfuscatedName("client.io")
    public static int field608 = 0;

    @ObfuscatedName("client.ip")
    public static String field609 = null;

    @ObfuscatedName("client.it")
    public static boolean field610 = false;

    @ObfuscatedName("client.iw")
    public static int field611 = -1;

    @ObfuscatedName("client.ij")
    public static String field612 = null;

    @ObfuscatedName("client.ir")
    public static String field567 = null;

    @ObfuscatedName("client.jf")
    public static int field614 = -1;

    @ObfuscatedName("client.jg")
    public static class175 field615 = new class175(8);

    @ObfuscatedName("client.jk")
    public static int field616 = 0;

    @ObfuscatedName("client.jd")
    public static int field617 = 0;

    @ObfuscatedName("client.jj")
    public static class158 field618 = null;

    @ObfuscatedName("client.ju")
    public static int field619 = 0;

    @ObfuscatedName("client.jl")
    public static int field697 = 0;

    @ObfuscatedName("client.jo")
    public static int field621 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field500 = false;

    @ObfuscatedName("client.jw")
    public static boolean field623 = false;

    @ObfuscatedName("client.jq")
    public static boolean field632 = false;

    @ObfuscatedName("client.jb")
    public static class158 field625 = null;

    @ObfuscatedName("client.jr")
    public static class158 field569 = null;

    @ObfuscatedName("client.jz")
    public static int field718 = 0;

    @ObfuscatedName("client.jc")
    public static int field710 = 0;

    @ObfuscatedName("client.jx")
    public static class158 field517 = null;

    @ObfuscatedName("client.ja")
    public static boolean field630 = false;

    @ObfuscatedName("client.jv")
    public static int field631 = -1;

    @ObfuscatedName("client.jp")
    public static int field539 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field633 = false;

    @ObfuscatedName("client.jh")
    public static int field634 = -1;

    @ObfuscatedName("client.ji")
    public static int field635 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field636 = false;

    @ObfuscatedName("client.kt")
    public static int field504 = 1;

    @ObfuscatedName("client.kc")
    public static int[] field638 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field712 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field640 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field679 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field642 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field643 = 0;

    @ObfuscatedName("client.kx")
    public static int field644 = 0;

    @ObfuscatedName("client.kv")
    public static int field698 = 0;

    @ObfuscatedName("client.ke")
    public static int field561 = 0;

    @ObfuscatedName("client.ko")
    public static int field649 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field652 = new int[2000];

    @ObfuscatedName("client.km")
    public static String[] field472 = new String[1000];

    @ObfuscatedName("client.ks")
    public static int field650 = 0;

    @ObfuscatedName("client.kr")
    public static class177 field651 = new class177();

    @ObfuscatedName("client.kp")
    public static class177 field475 = new class177();

    @ObfuscatedName("client.kl")
    public static class177 field717 = new class177();

    @ObfuscatedName("client.kg")
    public static class175 field654 = new class175(512);

    @ObfuscatedName("client.ky")
    public static int field655 = 0;

    @ObfuscatedName("client.kd")
    public static int field656 = -2;

    @ObfuscatedName("client.kn")
    public static boolean[] field657 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field648 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static boolean[] field659 = new boolean[100];

    @ObfuscatedName("client.le")
    public static int[] field660 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field661 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field662 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field663 = new int[100];

    @ObfuscatedName("client.lu")
    public static int field620 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field665 = new int[100];

    @ObfuscatedName("client.ld")
    public static String[] field666 = new String[100];

    @ObfuscatedName("client.ls")
    public static String[] field667 = new String[100];

    @ObfuscatedName("client.ll")
    public static String[] field495 = new String[100];

    @ObfuscatedName("client.lw")
    public static int field589 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field670 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lr")
    public static int field671 = 0;

    @ObfuscatedName("client.ln")
    public static int field672 = 0;

    @ObfuscatedName("client.lc")
    public static long[] field673 = new long[100];

    @ObfuscatedName("client.lo")
    public static int field674 = 0;

    @ObfuscatedName("client.lp")
    public static int field675 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field676 = new int[128];

    @ObfuscatedName("client.li")
    public static int[] field606 = new int[128];

    @ObfuscatedName("client.lh")
    public static long field461 = -1L;

    @ObfuscatedName("client.lz")
    public static String field658 = null;

    @ObfuscatedName("client.mt")
    public static String field677 = null;

    @ObfuscatedName("client.mj")
    public static int field479 = -1;

    @ObfuscatedName("client.mo")
    public static int field595 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field571 = new int[1000];

    @ObfuscatedName("client.mc")
    public static int[] field552 = new int[1000];

    @ObfuscatedName("client.md")
    public static class86[] field685 = new class86[1000];

    @ObfuscatedName("client.mg")
    public static int field553 = 0;

    @ObfuscatedName("client.ms")
    public static int field687 = 0;

    @ObfuscatedName("client.mz")
    public static int field607 = 0;

    @ObfuscatedName("client.mx")
    public static int field689 = 255;

    @ObfuscatedName("client.mv")
    public static int field690 = -1;

    @ObfuscatedName("client.mm")
    public static boolean field699 = false;

    @ObfuscatedName("client.mu")
    public static int field692 = 127;

    @ObfuscatedName("client.mk")
    public static int field693 = 127;

    @ObfuscatedName("client.np")
    public static int field694 = 0;

    @ObfuscatedName("client.ns")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field696 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field463 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field626 = new int[50];

    @ObfuscatedName("client.nj")
    public static class57[] field565 = new class57[50];

    @ObfuscatedName("client.nn")
    public static boolean field700 = false;

    @ObfuscatedName("client.nt")
    public static boolean[] field686 = new boolean[5];

    @ObfuscatedName("client.ne")
    public static int[] field702 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field703 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field704 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field705 = new int[5];

    @ObfuscatedName("client.oq")
    public static int field706 = 0;

    @ObfuscatedName("client.ou")
    public static int field707 = 0;

    @ObfuscatedName("client.od")
    public static class23[] field708 = new class23[400];

    @ObfuscatedName("client.oj")
    public static class173 field709 = new class173();

    @ObfuscatedName("client.ok")
    public static int field701 = 0;

    @ObfuscatedName("client.of")
    public static class11[] field711 = new class11[400];

    @ObfuscatedName("client.oz")
    public static class163 field516 = new class163();

    @ObfuscatedName("client.om")
    public static int field713 = -1;

    @ObfuscatedName("client.oo")
    public static int field714 = -1;

    @ObfuscatedName("client.r(B)V")
    public final void method276() {
    }

    public final void init() {
        if (!this.method1359()) {
            return;
        }
        class167[] var1 = class167.method2785();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2785);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2785)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field25)) {
                            field460 = true;
                        } else {
                            field460 = false;
                        }
                        break;
                    case 2:
                        field458 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field2716 = var4;
                        break;
                    case 4:
                        int var5 = Integer.parseInt(var4);
                        class132[] var6 = new class132[] { class132.field2055, class132.field2050, class132.field2053, class132.field2049 };
                        class132[] var7 = var6;
                        int var8 = 0;
                        class132 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class132 var9 = var7[var8];
                            if (var9.field2052 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field2319 = var10;
                        break;
                    case 5:
                        field457 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field462 = Integer.parseInt(var4);
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field25)) {
                        }
                    case 8:
                    default:
                        break;
                    case 9:
                        Statics.field2307 = (class133) class113.method1530(class133.method2618(), Integer.parseInt(var4));
                        if (Statics.field2307 == class133.field2062) {
                            Statics.field645 = class186.field2864;
                        } else {
                            Statics.field645 = class186.field2861;
                        }
                }
            }
        }
        method2927();
        Statics.field1958 = this.getCodeBase().getHost();
        String var11 = Statics.field2319.field2051;
        byte var12 = 0;
        try {
            Statics.field1993 = 16;
            Statics.field1407 = var12;
            try {
                Statics.field2020 = System.getProperty("os.name");
            } catch (Exception var33) {
                Statics.field2020 = "Unknown";
            }
            Statics.field229 = Statics.field2020.toLowerCase();
            try {
                Statics.field1416 = System.getProperty("user.home");
                if (Statics.field1416 != null) {
                    Statics.field1416 = Statics.field1416 + "/";
                }
            } catch (Exception var32) {
            }
            try {
                if (Statics.field229.startsWith("win")) {
                    if (Statics.field1416 == null) {
                        Statics.field1416 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1416 == null) {
                    Statics.field1416 = System.getenv("HOME");
                }
                if (Statics.field1416 != null) {
                    Statics.field1416 = Statics.field1416 + "/";
                }
            } catch (Exception var31) {
            }
            if (Statics.field1416 == null) {
                Statics.field1416 = "~/";
            }
            Statics.field381 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1416, "/tmp/", "" };
            Statics.field79 = new String[] { ".jagex_cache_" + Statics.field1407, ".file_store_" + Statics.field1407 };
            label155: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field1403 = class82.method5("oldschool", var11, var16);
                if (!Statics.field1403.exists()) {
                    Statics.field1403.mkdirs();
                }
                File[] var17 = Statics.field1403.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label155;
                    }
                    File var20 = var18[var19];
                    if (!class82.method2525(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            File var21 = Statics.field1403;
            Statics.field1292 = var21;
            if (!Statics.field1292.exists()) {
                throw new RuntimeException("");
            }
            class72.field1285 = true;
            try {
                File var22 = new File(Statics.field1416, "random.dat");
                if (var22.exists()) {
                    class82.field1404 = new class30(new class29(var22, "rw", 25L), 24, 0);
                } else {
                    label133: for (int var23 = 0; var23 < Statics.field79.length; var23++) {
                        for (int var24 = 0; var24 < Statics.field381.length; var24++) {
                            File var25 = new File(Statics.field381[var24] + Statics.field79[var23] + File.separatorChar + "random.dat");
                            if (var25.exists()) {
                                class82.field1404 = new class30(new class29(var25, "rw", 25L), 24, 0);
                                break label133;
                            }
                        }
                    }
                }
                if (class82.field1404 == null) {
                    RandomAccessFile var26 = new RandomAccessFile(var22, "rw");
                    int var27 = var26.read();
                    var26.seek(0L);
                    var26.write(var27);
                    var26.seek(0L);
                    var26.close();
                    class82.field1404 = new class30(new class29(var22, "rw", 25L), 24, 0);
                }
            } catch (IOException var34) {
            }
            class82.field1405 = new class30(new class29(class72.method2323("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1406 = new class30(new class29(class72.method2323("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field120 = new class30[Statics.field1993];
            for (int var29 = 0; var29 < Statics.field1993; var29++) {
                Statics.field120[var29] = new class30(new class29(class72.method2323("main_file_cache.idx" + var29), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var35) {
            class80.method184((String) null, var35);
        }
        Statics.field477 = this;
        this.method1357(765, 503, 24);
    }

    @ObfuscatedName("er.t(I)V")
    public static final void method2927() {
        class95.field1575 = false;
        field597 = false;
    }

    @ObfuscatedName("client.k(I)V")
    public final void method479() {
        Statics.field1388 = field458 == 0 ? 43594 : field457 + 40000;
        Statics.field2443 = field458 == 0 ? 443 : field457 + 50000;
        Statics.field1795 = Statics.field1388;
        Statics.field2718 = class161.field2712;
        Statics.field2554 = class161.field2709;
        Statics.field2720 = class161.field2708;
        Statics.field725 = class161.field2707;
        if (Statics.field1317.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1351[44] = 71;
            class75.field1351[45] = 26;
            class75.field1351[46] = 72;
            class75.field1351[47] = 73;
            class75.field1351[59] = 57;
            class75.field1351[61] = 27;
            class75.field1351[91] = 42;
            class75.field1351[92] = 74;
            class75.field1351[93] = 43;
            class75.field1351[192] = 28;
            class75.field1351[222] = 58;
            class75.field1351[520] = 59;
        } else {
            class75.field1351[186] = 57;
            class75.field1351[187] = 27;
            class75.field1351[188] = 71;
            class75.field1351[189] = 26;
            class75.field1351[190] = 72;
            class75.field1351[191] = 73;
            class75.field1351[192] = 58;
            class75.field1351[219] = 42;
            class75.field1351[220] = 74;
            class75.field1351[221] = 43;
            class75.field1351[222] = 59;
            class75.field1351[223] = 28;
        }
        class75.method2253(Statics.field1830);
        Canvas var1 = Statics.field1830;
        var1.addMouseListener(class77.field1369);
        var1.addMouseMotionListener(class77.field1369);
        var1.addFocusListener(class77.field1369);
        Statics.field841 = class66.method758();
        if (Statics.field841 != null) {
            Statics.field841.method1290(Statics.field1830);
        }
        Statics.field957 = new class71(255, class82.field1405, class82.field1406, 500000);
        class29 var2 = null;
        class12 var3 = new class12();
        try {
            var2 = class82.method48("", Statics.field2307.field2063, false);
            byte[] var4 = new byte[(int) var2.method527()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method512(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class12(new class126(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method514();
            }
        } catch (Exception var10) {
        }
        Statics.field1018 = var3;
        if (field458 != 0) {
            field471 = true;
        }
    }

    @ObfuscatedName("client.x(I)V")
    public final void method410() {
        field465++;
        this.method486();
        while (true) {
            class177 var1 = class157.field2563;
            class156 var2;
            synchronized (class157.field2563) {
                var2 = (class156) class157.field2566.method3285();
            }
            if (var2 == null) {
                class138.method1988();
                method2786();
                class75 var4 = class75.field1335;
                synchronized (class75.field1335) {
                    class75.field1350++;
                    class75.field1355 = class75.field1349;
                    class75.field1346 = 0;
                    if (class75.field1342 >= 0) {
                        while (class75.field1354 != class75.field1342) {
                            int var6 = class75.field1340[class75.field1354];
                            class75.field1354 = class75.field1354 + 1 & 0x7F;
                            if (var6 < 0) {
                                class75.field1339[~var6] = false;
                            } else {
                                if (!class75.field1339[var6] && class75.field1346 < class75.field1345.length - 1) {
                                    class75.field1345[++class75.field1346 - 1] = var6;
                                }
                                class75.field1339[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class75.field1339[var5] = false;
                        }
                        class75.field1342 = class75.field1354;
                    }
                    class75.field1349 = class75.field1322;
                }
                class77 var8 = class77.field1369;
                synchronized (class77.field1369) {
                    class77.field1364 = class77.field1361;
                    class77.field1365 = class77.field1371;
                    class77.field1366 = class77.field1367;
                    class77.field1368 = class77.field1359;
                    class77.field1372 = class77.field1363;
                    class77.field1373 = class77.field1362;
                    class77.field1374 = class77.field1370;
                    class77.field1359 = 0;
                }
                if (Statics.field841 != null) {
                    int var10 = Statics.field841.method1292();
                    field650 = var10;
                }
                if (field605 == 0) {
                    method2076();
                    Statics.field270.method1283();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field1301[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field1302[var12] = 0L;
                    }
                    Statics.field1009 = 0;
                } else if (field605 == 5) {
                    class21.method121(this);
                    method2076();
                    Statics.field270.method1283();
                    for (int var13 = 0; var13 < 32; var13++) {
                        field1301[var13] = 0L;
                    }
                    for (int var14 = 0; var14 < 32; var14++) {
                        field1302[var14] = 0L;
                    }
                    Statics.field1009 = 0;
                } else if (field605 == 10) {
                    class21.method121(this);
                } else if (field605 == 20) {
                    class21.method121(this);
                    method126();
                } else if (field605 == 25) {
                    method1218();
                }
                if (field605 == 30) {
                    if (field459 > 1) {
                        field459--;
                    }
                    if (field653 > 0) {
                        field653--;
                    }
                    if (field482) {
                        field482 = false;
                        method1470();
                    } else {
                        for (int var15 = 0; var15 < 100; var15++) {
                            boolean var16;
                            if (Statics.field2011 == null) {
                                var16 = false;
                            } else {
                                label2979: {
                                    try {
                                        int var17 = Statics.field2011.method1325();
                                        if (var17 == 0) {
                                            var16 = false;
                                            break label2979;
                                        }
                                        if (field497 == -1) {
                                            Statics.field2011.method1322(field514.field2015, 0, 1);
                                            field514.field2016 = 0;
                                            field497 = field514.method2257();
                                            field496 = class165.field2759[field497];
                                            var17--;
                                        }
                                        if (field496 == -1) {
                                            if (var17 <= 0) {
                                                var16 = false;
                                                break label2979;
                                            }
                                            Statics.field2011.method1322(field514.field2015, 0, 1);
                                            field496 = field514.field2015[0] & 0xFF;
                                            var17--;
                                        }
                                        if (field496 == -2) {
                                            if (var17 <= 1) {
                                                var16 = false;
                                                break label2979;
                                            }
                                            Statics.field2011.method1322(field514.field2015, 0, 2);
                                            field514.field2016 = 0;
                                            field496 = field514.method2373();
                                            var17 -= 2;
                                        }
                                        if (var17 < field496) {
                                            var16 = false;
                                            break label2979;
                                        }
                                        field514.field2016 = 0;
                                        Statics.field2011.method1322(field514.field2015, 0, field496);
                                        field523 = 0;
                                        field503 = field502;
                                        field502 = field501;
                                        field501 = field497;
                                        if (field497 == 186) {
                                            String var18 = field514.method2386();
                                            if (var18.endsWith(":tradereq:")) {
                                                String var19 = var18.substring(0, var18.indexOf(":"));
                                                boolean var20 = false;
                                                if (method202(var19)) {
                                                    var20 = true;
                                                }
                                                if (!var20 && field573 == 0) {
                                                    method91(4, var19, class134.field2242);
                                                }
                                            } else if (var18.endsWith(":duelreq:")) {
                                                String var21 = var18.substring(0, var18.indexOf(":"));
                                                boolean var22 = false;
                                                if (method202(var21)) {
                                                    var22 = true;
                                                }
                                                if (!var22 && field573 == 0) {
                                                    method91(8, var21, class134.field2287);
                                                }
                                            } else if (var18.endsWith(":chalreq:")) {
                                                String var23 = var18.substring(0, var18.indexOf(":"));
                                                boolean var24 = false;
                                                if (method202(var23)) {
                                                    var24 = true;
                                                }
                                                if (!var24 && field573 == 0) {
                                                    String var25 = var18.substring(var18.indexOf(":") + 1, var18.length() - 9);
                                                    method91(8, var23, var25);
                                                }
                                            } else if (var18.endsWith(":assistreq:")) {
                                                String var26 = var18.substring(0, var18.indexOf(":"));
                                                boolean var27 = false;
                                                if (method202(var26)) {
                                                    var27 = true;
                                                }
                                                if (!var27 && field573 == 0) {
                                                    method91(10, var26, "");
                                                }
                                            } else if (var18.endsWith(":clan:")) {
                                                String var28 = var18.substring(0, var18.indexOf(":clan:"));
                                                method91(11, "", var28);
                                            } else if (var18.endsWith(":trade:")) {
                                                String var29 = var18.substring(0, var18.indexOf(":trade:"));
                                                if (field573 == 0) {
                                                    method91(12, "", var29);
                                                }
                                            } else if (var18.endsWith(":assist:")) {
                                                String var30 = var18.substring(0, var18.indexOf(":assist:"));
                                                if (field573 == 0) {
                                                    method91(13, "", var30);
                                                }
                                            } else {
                                                method91(0, "", var18);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 121) {
                                            int var31 = field514.method2403();
                                            int var32 = field514.method2397();
                                            int var33 = field514.method2403();
                                            Statics.field1519 = var33 >> 1;
                                            Statics.field164.method207(var31, var32, (var33 & 0x1) == 1);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 127) {
                                            field700 = true;
                                            Statics.field1798 = field514.method2481();
                                            Statics.field1960 = field514.method2481();
                                            Statics.field1775 = field514.method2373();
                                            Statics.field159 = field514.method2481();
                                            Statics.field22 = field514.method2481();
                                            if (Statics.field22 >= 100) {
                                                int var34 = Statics.field1798 * 128 + 64;
                                                int var35 = Statics.field1960 * 128 + 64;
                                                int var36 = method1463(var34, var35, Statics.field1519) - Statics.field1775;
                                                int var37 = var34 - Statics.field1162;
                                                int var38 = var36 - Statics.field1725;
                                                int var39 = var35 - Statics.field1213;
                                                int var40 = (int) Math.sqrt((double) (var37 * var37 + var39 * var39));
                                                Statics.field21 = (int) (Math.atan2((double) var38, (double) var40) * 325.949D) & 0x7FF;
                                                Statics.field680 = (int) (Math.atan2((double) var37, (double) var39) * -325.949D) & 0x7FF;
                                                if (Statics.field21 < 128) {
                                                    Statics.field21 = 128;
                                                }
                                                if (Statics.field21 > 383) {
                                                    Statics.field21 = 383;
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 94) {
                                            int var41 = field514.method2383();
                                            int var42 = field514.method2373();
                                            if (var41 < -70000) {
                                                var42 += 32768;
                                            }
                                            class158 var43;
                                            if (var41 >= 0) {
                                                var43 = class158.method1612(var41);
                                            } else {
                                                var43 = null;
                                            }
                                            if (var43 != null) {
                                                for (int var44 = 0; var44 < var43.field2681.length; var44++) {
                                                    var43.field2681[var44] = 0;
                                                    var43.field2628[var44] = 0;
                                                }
                                            }
                                            class19 var45 = (class19) class19.field267.method3252((long) var42);
                                            if (var45 != null) {
                                                for (int var46 = 0; var46 < var45.field266.length; var46++) {
                                                    var45.field266[var46] = -1;
                                                    var45.field265[var46] = 0;
                                                }
                                            }
                                            int var47 = field514.method2373();
                                            for (int var48 = 0; var48 < var47; var48++) {
                                                int var49 = field514.method2373();
                                                int var50 = field514.method2404();
                                                if (var50 == 255) {
                                                    var50 = field514.method2383();
                                                }
                                                if (var43 != null && var48 < var43.field2681.length) {
                                                    var43.field2681[var48] = var49;
                                                    var43.field2628[var48] = var50;
                                                }
                                                class19.method2620(var42, var48, var49 - 1, var50);
                                            }
                                            if (var43 != null) {
                                                method186(var43);
                                            }
                                            method689();
                                            field640[++field679 - 1 & 0x1F] = var42 & 0x7FFF;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 138) {
                                            field707 = 1;
                                            field698 = field504;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 212) {
                                            class182.method1304(field514, field496);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 33) {
                                            field561 = field504;
                                            if (field496 == 0) {
                                                field658 = null;
                                                field677 = null;
                                                Statics.field1431 = 0;
                                                Statics.field1593 = null;
                                                field497 = -1;
                                                var16 = true;
                                                break label2979;
                                            }
                                            field677 = field514.method2386();
                                            long var51 = field514.method2384();
                                            field658 = class146.method1467(var51);
                                            Statics.field51 = field514.method2379();
                                            int var53 = field514.method2481();
                                            if (var53 == 255) {
                                                field497 = -1;
                                                var16 = true;
                                                break label2979;
                                            }
                                            Statics.field1431 = var53;
                                            class8[] var54 = new class8[100];
                                            for (int var55 = 0; var55 < Statics.field1431; var55++) {
                                                var54[var55] = new class8();
                                                var54[var55].field105 = field514.method2386();
                                                var54[var55].field102 = class148.method120(var54[var55].field105, Statics.field645);
                                                var54[var55].field104 = field514.method2373();
                                                var54[var55].field108 = field514.method2379();
                                                field514.method2386();
                                                if (var54[var55].field105.equals(Statics.field164.field33)) {
                                                    Statics.field272 = var54[var55].field108;
                                                }
                                            }
                                            boolean var56 = false;
                                            int var57 = Statics.field1431;
                                            while (var57 > 0) {
                                                boolean var58 = true;
                                                var57--;
                                                for (int var59 = 0; var59 < var57; var59++) {
                                                    if (var54[var59].field102.compareTo(var54[var59 + 1].field102) > 0) {
                                                        class8 var60 = var54[var59];
                                                        var54[var59] = var54[var59 + 1];
                                                        var54[var59 + 1] = var60;
                                                        var58 = false;
                                                    }
                                                }
                                                if (var58) {
                                                    break;
                                                }
                                            }
                                            Statics.field1593 = var54;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 28) {
                                            int var61 = field514.method2420();
                                            int var62 = field514.method2373();
                                            class158 var63 = class158.method1612(var61);
                                            if (var63 != null && var63.field2581 == 0) {
                                                if (var62 > var63.field2604 - var63.field2589) {
                                                    var62 = var63.field2604 - var63.field2589;
                                                }
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                }
                                                if (var63.field2593 != var62) {
                                                    var63.field2593 = var62;
                                                    method186(var63);
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 100) {
                                            method2074();
                                            field497 = -1;
                                            var16 = false;
                                            break label2979;
                                        }
                                        if (field497 == 152) {
                                            int var64 = field514.method2383();
                                            int var65 = field514.method2373();
                                            if (var64 < -70000) {
                                                var65 += 32768;
                                            }
                                            class158 var66;
                                            if (var64 >= 0) {
                                                var66 = class158.method1612(var64);
                                            } else {
                                                var66 = null;
                                            }
                                            while (field514.field2016 < field496) {
                                                int var67 = field514.method2391();
                                                int var68 = field514.method2373();
                                                int var69 = 0;
                                                if (var68 != 0) {
                                                    var69 = field514.method2481();
                                                    if (var69 == 255) {
                                                        var69 = field514.method2383();
                                                    }
                                                }
                                                if (var66 != null && var67 >= 0 && var67 < var66.field2681.length) {
                                                    var66.field2681[var67] = var68;
                                                    var66.field2628[var67] = var69;
                                                }
                                                class19.method2620(var65, var67, var68 - 1, var69);
                                            }
                                            if (var66 != null) {
                                                method186(var66);
                                            }
                                            method689();
                                            field640[++field679 - 1 & 0x1F] = var65 & 0x7FFF;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 116) {
                                            field553 = 0;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 103) {
                                            int var70 = field514.method2421();
                                            int var71 = field514.method2381();
                                            class158 var72 = class158.method1612(var70);
                                            if (var72.field2615 != var71 || var71 == -1) {
                                                var72.field2615 = var71;
                                                var72.field2640 = 0;
                                                var72.field2686 = 0;
                                                method186(var72);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 66) {
                                            String var73 = field514.method2386();
                                            Object[] var74 = new Object[var73.length() + 1];
                                            for (int var75 = var73.length() - 1; var75 >= 0; var75--) {
                                                if (var73.charAt(var75) == 's') {
                                                    var74[var75 + 1] = field514.method2386();
                                                } else {
                                                    var74[var75 + 1] = Integer.valueOf(field514.method2383());
                                                }
                                            }
                                            var74[0] = Integer.valueOf(field514.method2383());
                                            class1 var76 = new class1();
                                            var76.field6 = var74;
                                            class26.method116(var76);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 104) {
                                            int var77 = field514.method2411();
                                            if (var77 == 65535) {
                                                var77 = -1;
                                            }
                                            int var78 = field514.method2420();
                                            int var79 = field514.method2383();
                                            int var80 = field514.method2373();
                                            if (var80 == 65535) {
                                                var80 = -1;
                                            }
                                            for (int var81 = var77; var81 <= var80; var81++) {
                                                long var82 = ((long) var78 << 32) + (long) var81;
                                                class179 var84 = field654.method3252(var82);
                                                if (var84 != null) {
                                                    var84.method3311();
                                                }
                                                field654.method3254(new class171(var79), var82);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 185) {
                                            int var85 = field514.method2481();
                                            int var86 = field514.method2481();
                                            int var87 = field514.method2481();
                                            int var88 = field514.method2481();
                                            field686[var85] = true;
                                            field702[var85] = var86;
                                            field703[var85] = var87;
                                            field704[var85] = var88;
                                            field705[var85] = 0;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 147) {
                                            int var89 = field514.method2411();
                                            int var90 = field514.method2421();
                                            class158 var91 = class158.method1612(var90);
                                            if (var91.field2675 != 1 || var91.field2603 != var89) {
                                                var91.field2675 = 1;
                                                var91.field2603 = var89;
                                                method186(var91);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 118) {
                                            method525();
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 229) {
                                            field514.field2016 += 28;
                                            if (field514.method2399()) {
                                                class116 var92 = field514;
                                                int var93 = field514.field2016 - 28;
                                                if (class82.field1404 != null) {
                                                    try {
                                                        class82.field1404.method548(0L);
                                                        class82.field1404.method536(var92.field2015, var93, 24);
                                                    } catch (Exception var420) {
                                                    }
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 128) {
                                            String var95 = field514.method2386();
                                            class116 var96 = field514;
                                            String var97 = class184.method2160(var96, 32767);
                                            String var98 = class185.method3346(class147.method1316(var97));
                                            method91(6, var95, var98);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 231) {
                                            if (field614 != -1) {
                                                method2314(field614, 0);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 240) {
                                            int var99 = field514.method2420();
                                            int var100 = field514.method2393();
                                            int var101 = field514.method2411();
                                            if (var101 == 65535) {
                                                var101 = -1;
                                            }
                                            class158 var102 = class158.method1612(var99);
                                            if (var102.field2578) {
                                                var102.field2683 = var101;
                                                var102.field2684 = var100;
                                                class40 var104 = Statics.method1799(var101);
                                                var102.field2619 = var104.field1005;
                                                var102.field2632 = var104.field964;
                                                var102.field2621 = var104.field978;
                                                var102.field2617 = var104.field962;
                                                var102.field2669 = var104.field979;
                                                var102.field2622 = var104.field1010;
                                                if (var102.field2588 > 0) {
                                                    var102.field2622 = var102.field2622 * 32 / var102.field2588;
                                                }
                                                method186(var102);
                                            } else {
                                                if (var101 == -1) {
                                                    var102.field2675 = 0;
                                                    field497 = -1;
                                                    var16 = true;
                                                    break label2979;
                                                }
                                                class40 var103 = Statics.method1799(var101);
                                                var102.field2675 = 4;
                                                var102.field2603 = var101;
                                                var102.field2619 = var103.field1005;
                                                var102.field2632 = var103.field964;
                                                var102.field2622 = var103.field1010 * 100 / var100;
                                                method186(var102);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 111) {
                                            int var105 = field514.method2403();
                                            int var106 = field514.method2481();
                                            String var107 = field514.method2386();
                                            if (var106 >= 1 && var106 <= 8) {
                                                if (var107.equalsIgnoreCase("null")) {
                                                    var107 = null;
                                                }
                                                field585[var106 - 1] = var107;
                                                field498[var106 - 1] = var105 == 0;
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 70) {
                                            int var108 = field514.method2410();
                                            int var109 = field514.method2373();
                                            int var110 = field514.method2393();
                                            int var111 = field514.method2410();
                                            class158 var112 = class158.method1612(var110);
                                            if (var112.field2619 != var108 || var112.field2632 != var109 || var112.field2622 != var111) {
                                                var112.field2619 = var108;
                                                var112.field2632 = var109;
                                                var112.field2622 = var111;
                                                method186(var112);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 46) {
                                            while (field514.field2016 < field496) {
                                                boolean var113 = field514.method2481() == 1;
                                                String var114 = field514.method2386();
                                                String var115 = field514.method2386();
                                                int var116 = field514.method2373();
                                                int var117 = field514.method2481();
                                                int var118 = field514.method2481();
                                                boolean var119 = (var118 & 0x2) != 0;
                                                boolean var120 = (var118 & 0x1) != 0;
                                                if (var116 > 0) {
                                                    field514.method2386();
                                                    field514.method2481();
                                                    field514.method2383();
                                                }
                                                field514.method2386();
                                                for (int var121 = 0; var121 < field706; var121++) {
                                                    class23 var122 = field708[var121];
                                                    if (var113) {
                                                        if (var115.equals(var122.field354)) {
                                                            var122.field354 = var114;
                                                            var122.field349 = var115;
                                                            var114 = null;
                                                            break;
                                                        }
                                                    } else if (var114.equals(var122.field354)) {
                                                        if (var122.field348 != var116) {
                                                            boolean var123 = true;
                                                            for (class28 var124 = (class28) field709.method3242(); var124 != null; var124 = (class28) field709.method3241()) {
                                                                if (var124.field721.equals(var114)) {
                                                                    if (var116 != 0 && var124.field727 == 0) {
                                                                        var124.method3306();
                                                                        var123 = false;
                                                                    } else if (var116 == 0 && var124.field727 != 0) {
                                                                        var124.method3306();
                                                                        var123 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var123) {
                                                                field709.method3245(new class28(var114, var116));
                                                            }
                                                            var122.field348 = var116;
                                                        }
                                                        var122.field349 = var115;
                                                        var122.field351 = var117;
                                                        var122.field352 = var119;
                                                        var122.field353 = var120;
                                                        var114 = null;
                                                        break;
                                                    }
                                                }
                                                if (var114 != null && field706 < 400) {
                                                    class23 var125 = new class23();
                                                    field708[field706] = var125;
                                                    var125.field354 = var114;
                                                    var125.field349 = var115;
                                                    var125.field348 = var116;
                                                    var125.field351 = var117;
                                                    var125.field352 = var119;
                                                    var125.field353 = var120;
                                                    field706++;
                                                }
                                            }
                                            field707 = 2;
                                            field698 = field504;
                                            boolean var126 = false;
                                            int var127 = field706;
                                            while (var127 > 0) {
                                                boolean var128 = true;
                                                var127--;
                                                for (int var129 = 0; var129 < var127; var129++) {
                                                    boolean var130 = false;
                                                    class23 var131 = field708[var129];
                                                    class23 var132 = field708[var129 + 1];
                                                    if (field457 != var131.field348 && field457 == var132.field348) {
                                                        var130 = true;
                                                    }
                                                    if (!var130 && var131.field348 == 0 && var132.field348 != 0) {
                                                        var130 = true;
                                                    }
                                                    if (!var130 && !var131.field352 && var132.field352) {
                                                        var130 = true;
                                                    }
                                                    if (!var130 && !var131.field353 && var132.field353) {
                                                        var130 = true;
                                                    }
                                                    if (var130) {
                                                        class23 var133 = field708[var129];
                                                        field708[var129] = field708[var129 + 1];
                                                        field708[var129 + 1] = var133;
                                                        var128 = false;
                                                    }
                                                }
                                                if (var128) {
                                                    break;
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 4) {
                                            for (int var134 = 0; var134 < field486.length; var134++) {
                                                if (field486[var134] != null) {
                                                    field486[var134].field424 = -1;
                                                }
                                            }
                                            for (int var135 = 0; var135 < field490.length; var135++) {
                                                if (field490[var135] != null) {
                                                    field490[var135].field424 = -1;
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 198) {
                                            method689();
                                            field697 = field514.method2381();
                                            field649 = field504;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 161) {
                                            String var136 = field514.method2386();
                                            int var137 = field514.method2420();
                                            class158 var138 = class158.method1612(var137);
                                            if (!var136.equals(var138.field2626)) {
                                                var138.field2626 = var136;
                                                method186(var138);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 91) {
                                            field700 = false;
                                            for (int var139 = 0; var139 < 5; var139++) {
                                                field686[var139] = false;
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 95) {
                                            int var140 = field514.method2383();
                                            class4 var141 = (class4) field615.method3252((long) var140);
                                            if (var141 != null) {
                                                method1794(var141, true);
                                            }
                                            if (field618 != null) {
                                                method186(field618);
                                                field618 = null;
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 35) {
                                            int var142 = field514.method2410();
                                            class19.method1287(var142);
                                            field640[++field679 - 1 & 0x1F] = var142 & 0x7FFF;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 29) {
                                            int var143 = field514.method2411();
                                            if (var143 == 65535) {
                                                var143 = -1;
                                            }
                                            if (var143 == -1 && !field699) {
                                                class138.method2623();
                                            } else if (var143 != -1 && field690 != var143 && field689 != 0 && !field699) {
                                                class154 var144 = Statics.field1289;
                                                int var145 = field689;
                                                class138.field2326 = 1;
                                                Statics.field1998 = var144;
                                                Statics.field2327 = var143;
                                                Statics.field732 = 0;
                                                Statics.field2328 = var145;
                                                Statics.field735 = false;
                                                Statics.field2329 = 2;
                                            }
                                            field690 = var143;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 120) {
                                            int var146 = field514.method2477();
                                            int var147 = field514.method2411();
                                            if (var147 == 65535) {
                                                var147 = -1;
                                            }
                                            if (field689 != 0 && var147 != -1) {
                                                class138.method1509(Statics.field370, var147, 0, field689, false);
                                                field699 = true;
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 57) {
                                            field671 = field514.method2481();
                                            field672 = field514.method2481();
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 168) {
                                            method689();
                                            int var148 = field514.method2481();
                                            int var149 = field514.method2403();
                                            int var150 = field514.method2421();
                                            field594[var149] = var150;
                                            field592[var149] = var148;
                                            field593[var149] = 1;
                                            for (int var151 = 0; var151 < 98; var151++) {
                                                if (var150 >= class130.field2028[var151]) {
                                                    field593[var149] = var151 + 2;
                                                }
                                            }
                                            field642[++field643 - 1 & 0x1F] = var149;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 237) {
                                            Statics.field286 = field514.method2397();
                                            Statics.field2568 = field514.method2403();
                                            for (int var152 = Statics.field2568; var152 < Statics.field2568 + 8; var152++) {
                                                for (int var153 = Statics.field286; var153 < Statics.field286 + 8; var153++) {
                                                    if (field588[Statics.field1519][var152][var153] != null) {
                                                        field588[Statics.field1519][var152][var153] = null;
                                                        method1469(var152, var153);
                                                    }
                                                }
                                            }
                                            for (class22 var154 = (class22) field473.method3276(); var154 != null; var154 = (class22) field473.method3278()) {
                                                if (var154.field344 >= Statics.field2568 && var154.field344 < Statics.field2568 + 8 && var154.field329 >= Statics.field286 && var154.field329 < Statics.field286 + 8 && Statics.field1519 == var154.field343) {
                                                    var154.field337 = 0;
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 88) {
                                            field700 = true;
                                            Statics.field280 = field514.method2481();
                                            Statics.field345 = field514.method2481();
                                            Statics.field728 = field514.method2373();
                                            Statics.field1389 = field514.method2481();
                                            Statics.field1717 = field514.method2481();
                                            if (Statics.field1717 >= 100) {
                                                Statics.field1162 = Statics.field280 * 128 + 64;
                                                Statics.field1213 = Statics.field345 * 128 + 64;
                                                Statics.field1725 = method1463(Statics.field1162, Statics.field1213, Statics.field1519) - Statics.field728;
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 74) {
                                            int var155 = field514.method2373();
                                            int var156 = field514.method2481();
                                            int var157 = field514.method2373();
                                            if (field692 != 0 && var156 != 0 && field694 < 50) {
                                                field533[field694] = var155;
                                                field696[field694] = var156;
                                                field463[field694] = var157;
                                                field565[field694] = null;
                                                field626[field694] = 0;
                                                field694++;
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 21) {
                                            for (int var161 = 0; var161 < class159.field2700.length; var161++) {
                                                if (class159.field2700[var161] != class159.field2699[var161]) {
                                                    class159.field2700[var161] = class159.field2699[var161];
                                                    method104(var161);
                                                    field638[++field712 - 1 & 0x1F] = var161;
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 41) {
                                            int var162 = field514.method2420();
                                            class158 var163 = class158.method1612(var162);
                                            var163.field2675 = 3;
                                            var163.field2603 = Statics.field164.field31.method3134();
                                            method186(var163);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 236) {
                                            int var164 = field514.method2420();
                                            int var165 = field514.method2413();
                                            int var166 = field514.method2556();
                                            class158 var167 = class158.method1612(var164);
                                            int var168 = var167.field2682 + var166;
                                            int var169 = var167.field2587 + var165;
                                            if (var167.field2584 != var168 || var167.field2585 != var169) {
                                                var167.field2584 = var168;
                                                var167.field2585 = var169;
                                                method186(var167);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 158) {
                                            boolean var170 = field514.method2481() == 1;
                                            int var171 = field514.method2420();
                                            class158 var172 = class158.method1612(var171);
                                            if (var172.field2591 != var170) {
                                                var172.field2591 = var170;
                                                method186(var172);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 47) {
                                            field582 = 0;
                                            field545 = 0;
                                            method146();
                                            int var173 = field514.method2268(8);
                                            if (var173 < field575) {
                                                for (int var174 = var173; var174 < field575; var174++) {
                                                    field583[++field582 - 1] = field576[var174];
                                                }
                                            }
                                            if (var173 > field575) {
                                                throw new RuntimeException("");
                                            }
                                            field575 = 0;
                                            for (int var175 = 0; var175 < var173; var175++) {
                                                int var176 = field576[var175];
                                                class3 var177 = field486[var176];
                                                int var178 = field514.method2268(1);
                                                if (var178 == 0) {
                                                    field576[++field575 - 1] = var176;
                                                    var177.field446 = field465;
                                                } else {
                                                    int var179 = field514.method2268(2);
                                                    if (var179 == 0) {
                                                        field576[++field575 - 1] = var176;
                                                        var177.field446 = field465;
                                                        field578[++field545 - 1] = var176;
                                                    } else if (var179 == 1) {
                                                        field576[++field575 - 1] = var176;
                                                        var177.field446 = field465;
                                                        int var180 = field514.method2268(3);
                                                        var177.method215(var180, false);
                                                        int var181 = field514.method2268(1);
                                                        if (var181 == 1) {
                                                            field578[++field545 - 1] = var176;
                                                        }
                                                    } else if (var179 == 2) {
                                                        field576[++field575 - 1] = var176;
                                                        var177.field446 = field465;
                                                        int var182 = field514.method2268(3);
                                                        var177.method215(var182, true);
                                                        int var183 = field514.method2268(3);
                                                        var177.method215(var183, true);
                                                        int var184 = field514.method2268(1);
                                                        if (var184 == 1) {
                                                            field578[++field545 - 1] = var176;
                                                        }
                                                    } else if (var179 == 3) {
                                                        field583[++field582 - 1] = var176;
                                                    }
                                                }
                                            }
                                            while (field514.method2261(field496) >= 11) {
                                                int var185 = field514.method2268(11);
                                                if (var185 == 2047) {
                                                    break;
                                                }
                                                boolean var186 = false;
                                                if (field486[var185] == null) {
                                                    field486[var185] = new class3();
                                                    if (field579[var185] != null) {
                                                        field486[var185].method17(field579[var185]);
                                                    }
                                                    var186 = true;
                                                }
                                                field576[++field575 - 1] = var185;
                                                class3 var187 = field486[var185];
                                                var187.field446 = field465;
                                                int var188 = field514.method2268(5);
                                                if (var188 > 15) {
                                                    var188 -= 32;
                                                }
                                                int var189 = field587[field514.method2268(3)];
                                                if (var186) {
                                                    var187.field395 = var187.field397 = var189;
                                                }
                                                int var190 = field514.method2268(5);
                                                if (var190 > 15) {
                                                    var190 -= 32;
                                                }
                                                int var191 = field514.method2268(1);
                                                int var192 = field514.method2268(1);
                                                if (var192 == 1) {
                                                    field578[++field545 - 1] = var185;
                                                }
                                                var187.method207(Statics.field164.field447[0] + var188, Statics.field164.field448[0] + var190, var191 == 1);
                                            }
                                            field514.method2260();
                                            method95();
                                            for (int var193 = 0; var193 < field582; var193++) {
                                                int var194 = field583[var193];
                                                if (field465 != field486[var194].field446) {
                                                    field486[var194] = null;
                                                }
                                            }
                                            if (field496 != field514.field2016) {
                                                throw new RuntimeException(field514.field2016 + class2.field15 + field496);
                                            }
                                            for (int var195 = 0; var195 < field575; var195++) {
                                                if (field486[field576[var195]] == null) {
                                                    throw new RuntimeException(var195 + class2.field15 + field575);
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 154) {
                                            String var196 = field514.method2386();
                                            long var197 = (long) field514.method2373();
                                            long var199 = (long) field514.method2382();
                                            int var201 = field514.method2481();
                                            long var202 = (var197 << 32) + var199;
                                            boolean var204 = false;
                                            for (int var205 = 0; var205 < 100; var205++) {
                                                if (field673[var205] == var202) {
                                                    var204 = true;
                                                    break;
                                                }
                                            }
                                            if (method202(var196)) {
                                                var204 = true;
                                            }
                                            if (!var204 && field573 == 0) {
                                                field673[field674] = var202;
                                                field674 = (field674 + 1) % 100;
                                                class116 var206 = field514;
                                                String var207 = class184.method2160(var206, 32767);
                                                String var208 = class185.method3346(class147.method1316(var207));
                                                if (var201 == 2 || var201 == 3) {
                                                    method91(7, class2.method2633(1) + var196, var208);
                                                } else if (var201 == 1) {
                                                    method91(7, class2.method2633(0) + var196, var208);
                                                } else {
                                                    method91(3, var196, var208);
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 126) {
                                            field607 = field514.method2481();
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 89) {
                                            method151(false);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 54) {
                                            int var209 = field514.method2410();
                                            byte var210 = field514.method2405();
                                            class159.field2699[var209] = var210;
                                            if (class159.field2700[var209] != var210) {
                                                class159.field2700[var209] = var210;
                                                method104(var209);
                                            }
                                            field638[++field712 - 1 & 0x1F] = var209;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 23) {
                                            int var211 = field496 + field514.field2016;
                                            int var212 = field514.method2373();
                                            int var213 = field514.method2373();
                                            if (field614 != var212) {
                                                field614 = var212;
                                                method124(field614);
                                                class26.method2302(field614);
                                                for (int var214 = 0; var214 < 100; var214++) {
                                                    field657[var214] = true;
                                                }
                                            }
                                            while (var213-- > 0) {
                                                int var215 = field514.method2383();
                                                int var216 = field514.method2373();
                                                int var217 = field514.method2481();
                                                class4 var218 = (class4) field615.method3252((long) var215);
                                                if (var218 != null && var218.field55 != var216) {
                                                    method1794(var218, true);
                                                    var218 = null;
                                                }
                                                if (var218 == null) {
                                                    class4 var219 = new class4();
                                                    var219.field55 = var216;
                                                    var219.field54 = var217;
                                                    field615.method3254(var219, (long) var215);
                                                    method124(var216);
                                                    class26.method2302(var216);
                                                    class158 var220 = class158.method1612(var215);
                                                    if (var220 != null) {
                                                        method186(var220);
                                                    }
                                                    if (field618 != null) {
                                                        method186(field618);
                                                        field618 = null;
                                                    }
                                                    method1613();
                                                    if (field614 != -1) {
                                                        method2314(field614, 1);
                                                    }
                                                    var218 = var219;
                                                }
                                                var218.field52 = true;
                                            }
                                            for (class4 var222 = (class4) field615.method3255(); var222 != null; var222 = (class4) field615.method3256()) {
                                                if (var222.field52) {
                                                    var222.field52 = false;
                                                } else {
                                                    method1794(var222, true);
                                                }
                                            }
                                            field654 = new class175(512);
                                            while (field514.field2016 < var211) {
                                                int var223 = field514.method2383();
                                                int var224 = field514.method2373();
                                                int var225 = field514.method2373();
                                                int var226 = field514.method2383();
                                                for (int var227 = var224; var227 <= var225; var227++) {
                                                    long var228 = ((long) var223 << 32) + (long) var227;
                                                    field654.method3254(new class171(var226), var228);
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 2) {
                                            int var230 = field514.method2420();
                                            Statics.field230 = Statics.field156.method1422(var230);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 216) {
                                            int var231 = field514.method2393();
                                            int var232 = field514.method2412();
                                            int var233 = var232 >> 10 & 0x1F;
                                            int var234 = var232 >> 5 & 0x1F;
                                            int var235 = var232 & 0x1F;
                                            int var236 = (var235 << 3) + (var233 << 19) + (var234 << 11);
                                            class158 var237 = class158.method1612(var231);
                                            if (var237.field2607 != var236) {
                                                var237.field2607 = var236;
                                                method186(var237);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 239) {
                                            int var238 = field514.method2421();
                                            int var239 = field514.method2410();
                                            int var240 = field514.method2412();
                                            class158 var241 = class158.method1612(var238);
                                            var241.field2623 = (var240 << 16) + var239;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 50) {
                                            field459 = field514.method2411() * 30;
                                            field649 = field504;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 61) {
                                            int var242 = field514.method2383();
                                            class158 var243 = class158.method1612(var242);
                                            for (int var244 = 0; var244 < var243.field2681.length; var244++) {
                                                var243.field2681[var244] = -1;
                                                var243.field2681[var244] = 0;
                                            }
                                            method186(var243);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 200) {
                                            String var245 = field514.method2386();
                                            int var246 = field514.method2373();
                                            byte var247 = field514.method2379();
                                            boolean var248 = false;
                                            if (var247 == -128) {
                                                var248 = true;
                                            }
                                            if (var248) {
                                                if (Statics.field1431 == 0) {
                                                    field497 = -1;
                                                    var16 = true;
                                                    break label2979;
                                                }
                                                boolean var249 = false;
                                                int var250;
                                                for (var250 = 0; var250 < Statics.field1431 && (!Statics.field1593[var250].field105.equals(var245) || Statics.field1593[var250].field104 != var246); var250++) {
                                                }
                                                if (var250 < Statics.field1431) {
                                                    while (var250 < Statics.field1431 - 1) {
                                                        Statics.field1593[var250] = Statics.field1593[var250 + 1];
                                                        var250++;
                                                    }
                                                    Statics.field1431--;
                                                    Statics.field1593[Statics.field1431] = null;
                                                }
                                            } else {
                                                field514.method2386();
                                                class8 var251 = new class8();
                                                var251.field105 = var245;
                                                var251.field102 = class148.method120(var251.field105, Statics.field645);
                                                var251.field104 = var246;
                                                var251.field108 = var247;
                                                int var252;
                                                for (var252 = Statics.field1431 - 1; var252 >= 0; var252--) {
                                                    int var253 = Statics.field1593[var252].field102.compareTo(var251.field105);
                                                    if (var253 == 0) {
                                                        Statics.field1593[var252].field104 = var246;
                                                        Statics.field1593[var252].field108 = var247;
                                                        if (var245.equals(Statics.field164.field33)) {
                                                            Statics.field272 = var247;
                                                        }
                                                        field561 = field504;
                                                        field497 = -1;
                                                        var16 = true;
                                                        break label2979;
                                                    }
                                                    if (var253 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field1431 >= Statics.field1593.length) {
                                                    field497 = -1;
                                                    var16 = true;
                                                    break label2979;
                                                }
                                                for (int var254 = Statics.field1431 - 1; var254 > var252; var254--) {
                                                    Statics.field1593[var254 + 1] = Statics.field1593[var254];
                                                }
                                                if (Statics.field1431 == 0) {
                                                    Statics.field1593 = new class8[100];
                                                }
                                                Statics.field1593[var252 + 1] = var251;
                                                Statics.field1431++;
                                                if (var245.equals(Statics.field164.field33)) {
                                                    Statics.field272 = var247;
                                                }
                                            }
                                            field561 = field504;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 67) {
                                            int var255 = field514.method2410();
                                            field614 = var255;
                                            method124(var255);
                                            class26.method2302(field614);
                                            for (int var256 = 0; var256 < 100; var256++) {
                                                field657[var256] = true;
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 227) {
                                            field639 = field514.method2481();
                                            if (field639 == 1) {
                                                field474 = field514.method2373();
                                            }
                                            if (field639 >= 2 && field639 <= 6) {
                                                if (field639 == 2) {
                                                    field455 = 64;
                                                    field480 = 64;
                                                }
                                                if (field639 == 3) {
                                                    field455 = 0;
                                                    field480 = 64;
                                                }
                                                if (field639 == 4) {
                                                    field455 = 128;
                                                    field480 = 64;
                                                }
                                                if (field639 == 5) {
                                                    field455 = 64;
                                                    field480 = 0;
                                                }
                                                if (field639 == 6) {
                                                    field455 = 64;
                                                    field480 = 128;
                                                }
                                                field639 = 2;
                                                field541 = field514.method2373();
                                                field536 = field514.method2373();
                                                field586 = field514.method2481();
                                            }
                                            if (field639 == 10) {
                                                field489 = field514.method2373();
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 30) {
                                            while (field514.field2016 < field496) {
                                                int var257 = field514.method2481();
                                                boolean var258 = (var257 & 0x1) == 1;
                                                String var259 = field514.method2386();
                                                String var260 = field514.method2386();
                                                field514.method2386();
                                                for (int var261 = 0; var261 < field701; var261++) {
                                                    class11 var262 = field711[var261];
                                                    if (var258) {
                                                        if (var260.equals(var262.field170)) {
                                                            var262.field170 = var259;
                                                            var262.field166 = var260;
                                                            var259 = null;
                                                            break;
                                                        }
                                                    } else if (var259.equals(var262.field170)) {
                                                        var262.field170 = var259;
                                                        var262.field166 = var260;
                                                        var259 = null;
                                                        break;
                                                    }
                                                }
                                                if (var259 != null && field701 < 400) {
                                                    class11 var263 = new class11();
                                                    field711[field701] = var263;
                                                    var263.field170 = var259;
                                                    var263.field166 = var260;
                                                    field701++;
                                                }
                                            }
                                            field698 = field504;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 149) {
                                            int var264 = field514.method2421();
                                            int var265 = field514.method2411();
                                            class158 var266 = class158.method1612(var264);
                                            if (var266.field2675 != 2 || var266.field2603 != var265) {
                                                var266.field2675 = 2;
                                                var266.field2603 = var265;
                                                method186(var266);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 144 || field497 == 107 || field497 == 56 || field497 == 32 || field497 == 51 || field497 == 163 || field497 == 137 || field497 == 238 || field497 == 243 || field497 == 203 || field497 == 143) {
                                            method697();
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 232) {
                                            Statics.field2568 = field514.method2481();
                                            Statics.field286 = field514.method2397();
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 14) {
                                            method689();
                                            field619 = field514.method2481();
                                            field649 = field504;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 31) {
                                            int var267 = field514.method2393();
                                            int var268 = field514.method2481();
                                            int var269 = field514.method2412();
                                            class4 var270 = (class4) field615.method3252((long) var267);
                                            if (var270 != null) {
                                                method1794(var270, var270.field55 != var269);
                                            }
                                            class4 var271 = new class4();
                                            var271.field55 = var269;
                                            var271.field54 = var268;
                                            field615.method3254(var271, (long) var267);
                                            method124(var269);
                                            class26.method2302(var269);
                                            class158 var272 = class158.method1612(var267);
                                            if (var272 != null) {
                                                method186(var272);
                                            }
                                            if (field618 != null) {
                                                method186(field618);
                                                field618 = null;
                                            }
                                            method1613();
                                            if (field614 != -1) {
                                                method2314(field614, 1);
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 45) {
                                            method151(true);
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 96) {
                                            String var273 = field514.method2386();
                                            long var274 = field514.method2384();
                                            long var276 = (long) field514.method2373();
                                            long var278 = (long) field514.method2382();
                                            int var280 = field514.method2481();
                                            long var281 = (var276 << 32) + var278;
                                            boolean var283 = false;
                                            for (int var284 = 0; var284 < 100; var284++) {
                                                if (field673[var284] == var281) {
                                                    var283 = true;
                                                    break;
                                                }
                                            }
                                            if (var280 <= 1 && method202(var273)) {
                                                var283 = true;
                                            }
                                            if (!var283 && field573 == 0) {
                                                field673[field674] = var281;
                                                field674 = (field674 + 1) % 100;
                                                class116 var285 = field514;
                                                String var286 = class184.method2160(var285, 32767);
                                                String var287 = class185.method3346(class147.method1316(var286));
                                                if (var280 == 2 || var280 == 3) {
                                                    method82(9, class2.method2633(1) + var273, var287, class146.method1984(var274));
                                                } else if (var280 == 1) {
                                                    method82(9, class2.method2633(0) + var273, var287, class146.method1984(var274));
                                                } else {
                                                    method82(9, var273, var287, class146.method1984(var274));
                                                }
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 1) {
                                            int var288 = field514.method2481();
                                            class137[] var289 = new class137[] { class137.field2316, class137.field2313, class137.field2312 };
                                            class137[] var290 = var289;
                                            int var291 = 0;
                                            class137 var293;
                                            while (true) {
                                                if (var291 >= var290.length) {
                                                    var293 = null;
                                                    break;
                                                }
                                                class137 var292 = var290[var291];
                                                if (var292.field2314 == var288) {
                                                    var293 = var292;
                                                    break;
                                                }
                                                var291++;
                                            }
                                            Statics.field845 = var293;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 108) {
                                            int var294 = field514.method2411();
                                            int var295 = field514.method2383();
                                            class159.field2699[var294] = var295;
                                            if (class159.field2700[var294] != var295) {
                                                class159.field2700[var294] = var295;
                                                method104(var294);
                                            }
                                            field638[++field712 - 1 & 0x1F] = var294;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 246) {
                                            Statics.field286 = field514.method2404();
                                            Statics.field2568 = field514.method2403();
                                            while (field514.field2016 < field496) {
                                                field497 = field514.method2481();
                                                method697();
                                            }
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        if (field497 == 205) {
                                            for (int var296 = 0; var296 < Statics.field1022; var296++) {
                                                class42 var297 = class42.method11(var296);
                                                if (var297 != null && var297.field1024 == 0) {
                                                    class159.field2699[var296] = 0;
                                                    class159.field2700[var296] = 0;
                                                }
                                            }
                                            method689();
                                            field712 += 32;
                                            field497 = -1;
                                            var16 = true;
                                            break label2979;
                                        }
                                        class80.method184("" + field497 + class2.field15 + field502 + class2.field15 + field503 + class2.field15 + field496, (Throwable) null);
                                        method2074();
                                    } catch (IOException var424) {
                                        method1470();
                                    } catch (Exception var425) {
                                        String var300 = "" + field497 + class2.field15 + field502 + class2.field15 + field503 + class2.field15 + field496 + class2.field15 + (Statics.field736 + Statics.field164.field447[0]) + class2.field15 + (Statics.field26 + Statics.field164.field448[0]) + class2.field15;
                                        for (int var301 = 0; var301 < field496 && var301 < 50; var301++) {
                                            var300 = var300 + field514.field2015[var301] + class2.field15;
                                        }
                                        class80.method184(var300, var425);
                                        method2074();
                                    }
                                    var16 = true;
                                }
                            }
                            if (!var16) {
                                break;
                            }
                        }
                        if (field605 == 30) {
                            class182.method107(field493, 93);
                            Object var302 = Statics.field1283.field238;
                            synchronized (Statics.field1283.field238) {
                                if (!field456) {
                                    Statics.field1283.field237 = 0;
                                } else if (class77.field1368 != 0 || Statics.field1283.field237 >= 40) {
                                    field493.method2256(217);
                                    field493.method2364(0);
                                    int var303 = field493.field2016;
                                    int var304 = 0;
                                    for (int var305 = 0; var305 < Statics.field1283.field237 && field493.field2016 - var303 < 240; var305++) {
                                        var304++;
                                        int var306 = Statics.field1283.field235[var305];
                                        if (var306 < 0) {
                                            var306 = 0;
                                        } else if (var306 > 502) {
                                            var306 = 502;
                                        }
                                        int var307 = Statics.field1283.field239[var305];
                                        if (var307 < 0) {
                                            var307 = 0;
                                        } else if (var307 > 764) {
                                            var307 = 764;
                                        }
                                        int var308 = var306 * 765 + var307;
                                        if (Statics.field1283.field235[var305] == -1 && Statics.field1283.field239[var305] == -1) {
                                            var307 = -1;
                                            var306 = -1;
                                            var308 = 524287;
                                        }
                                        if (field467 != var307 || field468 != var306) {
                                            int var309 = var307 - field467;
                                            field467 = var307;
                                            int var310 = var306 - field468;
                                            field468 = var306;
                                            if (field469 < 8 && var309 >= -32 && var309 <= 31 && var310 >= -32 && var310 <= 31) {
                                                var309 += 32;
                                                var310 += 32;
                                                field493.method2365((field469 << 12) + (var309 << 6) + var310);
                                                field469 = 0;
                                            } else if (field469 < 8) {
                                                field493.method2366((field469 << 19) + 8388608 + var308);
                                                field469 = 0;
                                            } else {
                                                field493.method2367((field469 << 19) + -1073741824 + var308);
                                                field469 = 0;
                                            }
                                        } else if (field469 < 2047) {
                                            field469++;
                                        }
                                    }
                                    field493.method2375(field493.field2016 - var303);
                                    if (var304 >= Statics.field1283.field237) {
                                        Statics.field1283.field237 = 0;
                                    } else {
                                        Statics.field1283.field237 -= var304;
                                        for (int var311 = 0; var311 < Statics.field1283.field237; var311++) {
                                            Statics.field1283.field239[var311] = Statics.field1283.field239[var304 + var311];
                                            Statics.field1283.field235[var311] = Statics.field1283.field235[var304 + var311];
                                        }
                                    }
                                }
                            }
                            if (class77.field1368 != 0) {
                                long var313 = (class77.field1374 - field466 * -1L) / 50L;
                                if (var313 > 4095L) {
                                    var313 = 4095L;
                                }
                                field466 = class77.field1374 * -1L;
                                int var315 = class77.field1373;
                                if (var315 < 0) {
                                    var315 = 0;
                                } else if (var315 > 502) {
                                    var315 = 502;
                                }
                                int var316 = class77.field1372;
                                if (var316 < 0) {
                                    var316 = 0;
                                } else if (var316 > 764) {
                                    var316 = 764;
                                }
                                int var317 = var315 * 765 + var316;
                                byte var318 = 0;
                                if (class77.field1368 == 2) {
                                    var318 = 1;
                                }
                                int var319 = (int) var313;
                                field493.method2256(159);
                                field493.method2367((var318 << 19) + (var319 << 20) + var317);
                            }
                            if (class75.field1346 > 0) {
                                field493.method2256(7);
                                field493.method2365(0);
                                int var320 = field493.field2016;
                                long var321 = class121.method1471();
                                for (int var323 = 0; var323 < class75.field1346; var323++) {
                                    long var324 = var321 - field461;
                                    if (var324 > 16777215L) {
                                        var324 = 16777215L;
                                    }
                                    field461 = var321;
                                    field493.method2415((int) var324);
                                    field493.method2364(class75.field1345[var323]);
                                }
                                field493.method2441(field493.field2016 - var320);
                            }
                            if (field544 > 0) {
                                field544--;
                            }
                            if (class75.field1339[96] || class75.field1339[97] || class75.field1339[98] || class75.field1339[99]) {
                                field570 = true;
                            }
                            if (field570 && field544 <= 0) {
                                field544 = 20;
                                field570 = false;
                                field493.method2256(68);
                                field493.method2409(field581);
                                field493.method2409(field483);
                            }
                            if (Statics.field341 && !field470) {
                                field470 = true;
                                field493.method2256(57);
                                field493.method2364(1);
                            }
                            if (!Statics.field341 && field470) {
                                field470 = false;
                                field493.method2256(57);
                                field493.method2364(0);
                            }
                            method2156();
                            if (field605 == 30) {
                                method1255();
                                int var10002;
                                for (int var326 = 0; var326 < field694; var326++) {
                                    var10002 = field463[var326]--;
                                    if (field463[var326] >= -10) {
                                        class57 var328 = field565[var326];
                                        if (var328 == null) {
                                            class57 var427 = (class57) null;
                                            var328 = class57.method1190(Statics.field175, field533[var326], 0);
                                            if (var328 == null) {
                                                continue;
                                            }
                                            field463[var326] += var328.method1198();
                                            field565[var326] = var328;
                                        }
                                        if (field463[var326] < 0) {
                                            int var335;
                                            if (field626[var326] == 0) {
                                                var335 = field692;
                                            } else {
                                                int var329 = (field626[var326] & 0xFF) * 128;
                                                int var330 = field626[var326] >> 16 & 0xFF;
                                                int var331 = var330 * 128 + 64 - Statics.field164.field400;
                                                if (var331 < 0) {
                                                    var331 = -var331;
                                                }
                                                int var332 = field626[var326] >> 8 & 0xFF;
                                                int var333 = var332 * 128 + 64 - Statics.field164.field404;
                                                if (var333 < 0) {
                                                    var333 = -var333;
                                                }
                                                int var334 = var331 + var333 - 128;
                                                if (var334 > var329) {
                                                    field463[var326] = -100;
                                                    continue;
                                                }
                                                if (var334 < 0) {
                                                    var334 = 0;
                                                }
                                                var335 = field693 * (var329 - var334) / var329;
                                            }
                                            if (var335 > 0) {
                                                class63 var336 = var328.method1189().method1257(Statics.field75);
                                                class45 var337 = class45.method889(var336, 100, var335);
                                                var337.method892(field696[var326] - 1);
                                                Statics.field1019.method1030(var337);
                                            }
                                            field463[var326] = -100;
                                        }
                                    } else {
                                        field694--;
                                        for (int var327 = var326; var327 < field694; var327++) {
                                            field533[var327] = field533[var327 + 1];
                                            field565[var327] = field565[var327 + 1];
                                            field696[var327] = field696[var327 + 1];
                                            field463[var327] = field463[var327 + 1];
                                            field626[var327] = field626[var327 + 1];
                                        }
                                        var326--;
                                    }
                                }
                                if (field699 && !class138.method829()) {
                                    if (field689 != 0 && field690 != -1) {
                                        class138.method1509(Statics.field1289, field690, 0, field689, false);
                                    }
                                    field699 = false;
                                }
                                field523++;
                                if (field523 > 750) {
                                    method1470();
                                } else {
                                    for (int var338 = -1; var338 < field575; var338++) {
                                        int var339;
                                        if (var338 == -1) {
                                            var339 = 2047;
                                        } else {
                                            var339 = field576[var338];
                                        }
                                        class3 var340 = field486[var339];
                                        if (var340 != null) {
                                            Statics.method747(var340, 1);
                                        }
                                    }
                                    for (int var341 = 0; var341 < field484; var341++) {
                                        int var342 = field492[var341];
                                        class25 var343 = field490[var342];
                                        if (var343 != null) {
                                            Statics.method747(var343, var343.field374.field792);
                                        }
                                    }
                                    method2629();
                                    field532++;
                                    if (field564 != 0) {
                                        field563 += 20;
                                        if (field563 >= 400) {
                                            field564 = 0;
                                        }
                                    }
                                    if (Statics.field359 != null) {
                                        field510++;
                                        if (field510 >= 15) {
                                            method186(Statics.field359);
                                            Statics.field359 = null;
                                        }
                                    }
                                    if (Statics.field731 != null) {
                                        method186(Statics.field731);
                                        field556++;
                                        if (class77.field1365 > field568 + 5 || class77.field1365 < field568 - 5 || class77.field1366 > field543 + 5 || class77.field1366 < field543 - 5) {
                                            field624 = true;
                                        }
                                        if (class77.field1364 == 0) {
                                            if (field624 && field556 >= 5) {
                                                if (Statics.field731 == Statics.field342 && field695 != field641) {
                                                    class158 var344 = Statics.field731;
                                                    byte var345 = 0;
                                                    if (field617 == 1 && var344.field2613 == 206) {
                                                        var345 = 1;
                                                    }
                                                    if (var344.field2681[field641] <= 0) {
                                                        var345 = 0;
                                                    }
                                                    int var346 = method1523(var344);
                                                    boolean var347 = (var346 >> 29 & 0x1) != 0;
                                                    if (var347) {
                                                        int var348 = field695;
                                                        int var349 = field641;
                                                        var344.field2681[var349] = var344.field2681[var348];
                                                        var344.field2628[var349] = var344.field2628[var348];
                                                        var344.field2681[var348] = -1;
                                                        var344.field2628[var348] = 0;
                                                    } else if (var345 == 1) {
                                                        int var350 = field695;
                                                        int var351 = field641;
                                                        while (var350 != var351) {
                                                            if (var350 > var351) {
                                                                var344.method3079(var350 - 1, var350);
                                                                var350--;
                                                            } else if (var350 < var351) {
                                                                var344.method3079(var350 + 1, var350);
                                                                var350++;
                                                            }
                                                        }
                                                    } else {
                                                        var344.method3079(field641, field695);
                                                    }
                                                    field493.method2256(238);
                                                    field493.method2364(var345);
                                                    field493.method2419(Statics.field731.field2665);
                                                    field493.method2365(field641);
                                                    field493.method2365(field695);
                                                }
                                            } else if ((field487 == 1 || method1340(field590 - 1)) && field590 > 2) {
                                                method1250();
                                            } else if (field590 > 0) {
                                                method2154(field590 - 1);
                                            }
                                            field510 = 10;
                                            class77.field1368 = 0;
                                            Statics.field731 = null;
                                        }
                                    }
                                    class158 var352 = Statics.field1247;
                                    class158 var353 = Statics.field231;
                                    Statics.field1247 = null;
                                    Statics.field231 = null;
                                    field517 = null;
                                    field633 = false;
                                    field630 = false;
                                    for (field675 = 0; Statics.method14() && field675 < 128; field675++) {
                                        field606[field675] = Statics.field858;
                                        field676[field675] = Statics.field2310;
                                    }
                                    int var354 = field614;
                                    if (class158.method1540(var354)) {
                                        method1619(Statics.field2670[var354], -1, 0, 0, 765, 503, 0, 0);
                                    }
                                    field504++;
                                    while (true) {
                                        class1 var355;
                                        class158 var356;
                                        class158 var357;
                                        do {
                                            var355 = (class1) field475.method3285();
                                            if (var355 == null) {
                                                while (true) {
                                                    class1 var358;
                                                    class158 var359;
                                                    class158 var360;
                                                    do {
                                                        var358 = (class1) field717.method3285();
                                                        if (var358 == null) {
                                                            while (true) {
                                                                class1 var361;
                                                                class158 var362;
                                                                class158 var363;
                                                                do {
                                                                    var361 = (class1) field651.method3285();
                                                                    if (var361 == null) {
                                                                        if (field625 != null) {
                                                                            method3117();
                                                                        }
                                                                        if (class95.field1565 != -1) {
                                                                            int var364 = class95.field1565;
                                                                            int var365 = class95.field1523;
                                                                            boolean var366 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var364, var365, true, 0, 0, 0, 0, 0, 0);
                                                                            class95.field1565 = -1;
                                                                            if (var366) {
                                                                                field548 = class77.field1372;
                                                                                field562 = class77.field1373;
                                                                                field564 = 1;
                                                                                field563 = 0;
                                                                            }
                                                                        }
                                                                        if (Statics.field731 == null && field625 == null) {
                                                                            int var367 = class77.field1368;
                                                                            if (field613) {
                                                                                if (var367 != 1) {
                                                                                    int var368 = class77.field1365;
                                                                                    int var369 = class77.field1366;
                                                                                    if (var368 < Statics.field899 - 10 || var368 > Statics.field899 + Statics.field1408 + 10 || var369 < Statics.field1287 - 10 || var369 > Statics.field155 + Statics.field1287 + 10) {
                                                                                        field613 = false;
                                                                                        method37(Statics.field899, Statics.field1287, Statics.field1408, Statics.field155);
                                                                                    }
                                                                                }
                                                                                if (var367 == 1) {
                                                                                    int var370 = Statics.field899;
                                                                                    int var371 = Statics.field1287;
                                                                                    int var372 = Statics.field1408;
                                                                                    int var373 = class77.field1372;
                                                                                    int var374 = class77.field1373;
                                                                                    int var375 = -1;
                                                                                    for (int var376 = 0; var376 < field590; var376++) {
                                                                                        int var377 = (field590 - 1 - var376) * 15 + var371 + 31;
                                                                                        if (var373 > var370 && var373 < var370 + var372 && var374 > var377 - 13 && var374 < var377 + 3) {
                                                                                            var375 = var376;
                                                                                        }
                                                                                    }
                                                                                    if (var375 != -1) {
                                                                                        method2154(var375);
                                                                                    }
                                                                                    field613 = false;
                                                                                    method37(Statics.field899, Statics.field1287, Statics.field1408, Statics.field155);
                                                                                }
                                                                            } else {
                                                                                label3027: {
                                                                                    int var379;
                                                                                    int var380;
                                                                                    label3055: {
                                                                                        if (var367 == 1 && field590 > 0) {
                                                                                            int var378 = field600[field590 - 1];
                                                                                            if (var378 == 39 || var378 == 40 || var378 == 41 || var378 == 42 || var378 == 43 || var378 == 33 || var378 == 34 || var378 == 35 || var378 == 36 || var378 == 37 || var378 == 38 || var378 == 1005) {
                                                                                                var379 = field598[field590 - 1];
                                                                                                var380 = field599[field590 - 1];
                                                                                                class158 var381 = class158.method1612(var380);
                                                                                                int var382 = method1523(var381);
                                                                                                boolean var383 = (var382 >> 28 & 0x1) != 0;
                                                                                                if (var383) {
                                                                                                    break label3055;
                                                                                                }
                                                                                                int var384 = method1523(var381);
                                                                                                boolean var385 = (var384 >> 29 & 0x1) != 0;
                                                                                                if (var385) {
                                                                                                    break label3055;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (var367 == 1 && (field487 == 1 && field590 > 2 || method1340(field590 - 1))) {
                                                                                            var367 = 2;
                                                                                        }
                                                                                        if (var367 == 1 && field590 > 0) {
                                                                                            method2154(field590 - 1);
                                                                                        }
                                                                                        if (var367 == 2 && field590 > 0) {
                                                                                            method1250();
                                                                                        }
                                                                                        break label3027;
                                                                                    }
                                                                                    field624 = false;
                                                                                    field556 = 0;
                                                                                    if (Statics.field731 != null) {
                                                                                        method186(Statics.field731);
                                                                                    }
                                                                                    Statics.field731 = class158.method1612(var380);
                                                                                    field695 = var379;
                                                                                    field568 = class77.field1372;
                                                                                    field543 = class77.field1373;
                                                                                    method186(Statics.field731);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (Statics.field1247 != var352) {
                                                                            if (var352 != null) {
                                                                                method186(var352);
                                                                            }
                                                                            if (Statics.field1247 != null) {
                                                                                method186(Statics.field1247);
                                                                            }
                                                                        }
                                                                        if (Statics.field231 != var353 && field683 == field669) {
                                                                            if (var353 != null) {
                                                                                method186(var353);
                                                                            }
                                                                            if (Statics.field231 != null) {
                                                                                method186(Statics.field231);
                                                                            }
                                                                        }
                                                                        if (Statics.field231 == null) {
                                                                            if (field669 > 0) {
                                                                                field669--;
                                                                            }
                                                                        } else if (field669 < field683) {
                                                                            field669++;
                                                                            if (field683 == field669) {
                                                                                method186(Statics.field231);
                                                                            }
                                                                        }
                                                                        int var386 = field520 + Statics.field164.field400;
                                                                        int var387 = field522 + Statics.field164.field404;
                                                                        if (Statics.field99 - var386 < -500 || Statics.field99 - var386 > 500 || Statics.field27 - var387 < -500 || Statics.field27 - var387 > 500) {
                                                                            Statics.field99 = var386;
                                                                            Statics.field27 = var387;
                                                                        }
                                                                        if (Statics.field99 != var386) {
                                                                            Statics.field99 += (var386 - Statics.field99) / 16;
                                                                        }
                                                                        if (Statics.field27 != var387) {
                                                                            Statics.field27 += (var387 - Statics.field27) / 16;
                                                                        }
                                                                        if (class75.field1339[96]) {
                                                                            field572 += (-24 - field572) / 2;
                                                                        } else if (class75.field1339[97]) {
                                                                            field572 += (24 - field572) / 2;
                                                                        } else {
                                                                            field572 /= 2;
                                                                        }
                                                                        if (class75.field1339[98]) {
                                                                            field668 += (12 - field668) / 2;
                                                                        } else if (class75.field1339[99]) {
                                                                            field668 += (-12 - field668) / 2;
                                                                        } else {
                                                                            field668 /= 2;
                                                                        }
                                                                        field581 = field572 / 2 + field581 & 0x7FF;
                                                                        field483 += field668 / 2;
                                                                        if (field483 < 128) {
                                                                            field483 = 128;
                                                                        }
                                                                        if (field483 > 383) {
                                                                            field483 = 383;
                                                                        }
                                                                        int var388 = Statics.field99 >> 7;
                                                                        int var389 = Statics.field27 >> 7;
                                                                        int var390 = method1463(Statics.field99, Statics.field27, Statics.field1519);
                                                                        int var391 = 0;
                                                                        if (var388 > 3 && var389 > 3 && var388 < 100 && var389 < 100) {
                                                                            for (int var392 = var388 - 4; var392 <= var388 + 4; var392++) {
                                                                                for (int var393 = var389 - 4; var393 <= var389 + 4; var393++) {
                                                                                    int var394 = Statics.field1519;
                                                                                    if (var394 < 3 && (class9.field112[1][var392][var393] & 0x2) == 2) {
                                                                                        var394++;
                                                                                    }
                                                                                    int var395 = var390 - class9.field127[var394][var392][var393];
                                                                                    if (var395 > var391) {
                                                                                        var391 = var395;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        int var396 = var391 * 192;
                                                                        if (var396 > 98048) {
                                                                            var396 = 98048;
                                                                        }
                                                                        if (var396 < 32768) {
                                                                            var396 = 32768;
                                                                        }
                                                                        if (var396 > field546) {
                                                                            field546 += (var396 - field546) / 24;
                                                                        } else if (var396 < field546) {
                                                                            field546 += (var396 - field546) / 80;
                                                                        }
                                                                        if (field700) {
                                                                            int var397 = Statics.field280 * 128 + 64;
                                                                            int var398 = Statics.field345 * 128 + 64;
                                                                            int var399 = method1463(var397, var398, Statics.field1519) - Statics.field728;
                                                                            if (Statics.field1162 < var397) {
                                                                                Statics.field1162 += Statics.field1717 * (var397 - Statics.field1162) / 1000 + Statics.field1389;
                                                                                if (Statics.field1162 > var397) {
                                                                                    Statics.field1162 = var397;
                                                                                }
                                                                            }
                                                                            if (Statics.field1162 > var397) {
                                                                                Statics.field1162 -= Statics.field1717 * (Statics.field1162 - var397) / 1000 + Statics.field1389;
                                                                                if (Statics.field1162 < var397) {
                                                                                    Statics.field1162 = var397;
                                                                                }
                                                                            }
                                                                            if (Statics.field1725 < var399) {
                                                                                Statics.field1725 += Statics.field1717 * (var399 - Statics.field1725) / 1000 + Statics.field1389;
                                                                                if (Statics.field1725 > var399) {
                                                                                    Statics.field1725 = var399;
                                                                                }
                                                                            }
                                                                            if (Statics.field1725 > var399) {
                                                                                Statics.field1725 -= Statics.field1717 * (Statics.field1725 - var399) / 1000 + Statics.field1389;
                                                                                if (Statics.field1725 < var399) {
                                                                                    Statics.field1725 = var399;
                                                                                }
                                                                            }
                                                                            if (Statics.field1213 < var398) {
                                                                                Statics.field1213 += Statics.field1717 * (var398 - Statics.field1213) / 1000 + Statics.field1389;
                                                                                if (Statics.field1213 > var398) {
                                                                                    Statics.field1213 = var398;
                                                                                }
                                                                            }
                                                                            if (Statics.field1213 > var398) {
                                                                                Statics.field1213 -= Statics.field1717 * (Statics.field1213 - var398) / 1000 + Statics.field1389;
                                                                                if (Statics.field1213 < var398) {
                                                                                    Statics.field1213 = var398;
                                                                                }
                                                                            }
                                                                            int var400 = Statics.field1798 * 128 + 64;
                                                                            int var401 = Statics.field1960 * 128 + 64;
                                                                            int var402 = method1463(var400, var401, Statics.field1519) - Statics.field1775;
                                                                            int var403 = var400 - Statics.field1162;
                                                                            int var404 = var402 - Statics.field1725;
                                                                            int var405 = var401 - Statics.field1213;
                                                                            int var406 = (int) Math.sqrt((double) (var403 * var403 + var405 * var405));
                                                                            int var407 = (int) (Math.atan2((double) var404, (double) var406) * 325.949D) & 0x7FF;
                                                                            int var408 = (int) (Math.atan2((double) var403, (double) var405) * -325.949D) & 0x7FF;
                                                                            if (var407 < 128) {
                                                                                var407 = 128;
                                                                            }
                                                                            if (var407 > 383) {
                                                                                var407 = 383;
                                                                            }
                                                                            if (Statics.field21 < var407) {
                                                                                Statics.field21 += Statics.field22 * (var407 - Statics.field21) / 1000 + Statics.field159;
                                                                                if (Statics.field21 > var407) {
                                                                                    Statics.field21 = var407;
                                                                                }
                                                                            }
                                                                            if (Statics.field21 > var407) {
                                                                                Statics.field21 -= Statics.field22 * (Statics.field21 - var407) / 1000 + Statics.field159;
                                                                                if (Statics.field21 < var407) {
                                                                                    Statics.field21 = var407;
                                                                                }
                                                                            }
                                                                            int var409 = var408 - Statics.field680;
                                                                            if (var409 > 1024) {
                                                                                var409 -= 2048;
                                                                            }
                                                                            if (var409 < -1024) {
                                                                                var409 += 2048;
                                                                            }
                                                                            if (var409 > 0) {
                                                                                Statics.field680 += Statics.field22 * var409 / 1000 + Statics.field159;
                                                                                Statics.field680 &= 0x7FF;
                                                                            }
                                                                            if (var409 < 0) {
                                                                                Statics.field680 -= Statics.field22 * -var409 / 1000 + Statics.field159;
                                                                                Statics.field680 &= 0x7FF;
                                                                            }
                                                                            int var410 = var408 - Statics.field680;
                                                                            if (var410 > 1024) {
                                                                                var410 -= 2048;
                                                                            }
                                                                            if (var410 < -1024) {
                                                                                var410 += 2048;
                                                                            }
                                                                            if (var410 < 0 && var409 > 0 || var410 > 0 && var409 < 0) {
                                                                                Statics.field680 = var408;
                                                                            }
                                                                        }
                                                                        for (int var411 = 0; var411 < 5; var411++) {
                                                                            var10002 = field705[var411]++;
                                                                        }
                                                                        int var412 = class77.method113();
                                                                        int var413 = class75.field1350;
                                                                        if (var412 > 15000 && var413 > 15000) {
                                                                            field653 = 250;
                                                                            class77.method1169(14500);
                                                                            field493.method2256(28);
                                                                        }
                                                                        field526++;
                                                                        if (field526 > 500) {
                                                                            field526 = 0;
                                                                            int var415 = (int) (Math.random() * 8.0D);
                                                                            if ((var415 & 0x1) == 1) {
                                                                                field520 += field521;
                                                                            }
                                                                            if ((var415 & 0x2) == 2) {
                                                                                field522 += field684;
                                                                            }
                                                                            if ((var415 & 0x4) == 4) {
                                                                                field524 += field525;
                                                                            }
                                                                        }
                                                                        if (field520 < -50) {
                                                                            field521 = 2;
                                                                        }
                                                                        if (field520 > 50) {
                                                                            field521 = -2;
                                                                        }
                                                                        if (field522 < -55) {
                                                                            field684 = 2;
                                                                        }
                                                                        if (field522 > 55) {
                                                                            field684 = -2;
                                                                        }
                                                                        if (field524 < -40) {
                                                                            field525 = 1;
                                                                        }
                                                                        if (field524 > 40) {
                                                                            field525 = -1;
                                                                        }
                                                                        field531++;
                                                                        if (field531 > 500) {
                                                                            field531 = 0;
                                                                            int var416 = (int) (Math.random() * 8.0D);
                                                                            if ((var416 & 0x1) == 1) {
                                                                                field527 += field664;
                                                                            }
                                                                            if ((var416 & 0x2) == 2) {
                                                                                field488 += field691;
                                                                            }
                                                                        }
                                                                        if (field527 < -60) {
                                                                            field664 = 2;
                                                                        }
                                                                        if (field527 > 60) {
                                                                            field664 = -2;
                                                                        }
                                                                        if (field488 < -20) {
                                                                            field691 = 1;
                                                                        }
                                                                        if (field488 > 10) {
                                                                            field691 = -1;
                                                                        }
                                                                        for (class28 var417 = (class28) field709.method3242(); var417 != null; var417 = (class28) field709.method3241()) {
                                                                            if ((long) var417.field720 < class121.method1471() / 1000L - 5L) {
                                                                                if (var417.field727 > 0) {
                                                                                    method91(5, "", var417.field721 + class134.field2068);
                                                                                }
                                                                                if (var417.field727 == 0) {
                                                                                    method91(5, "", var417.field721 + class134.field2207);
                                                                                }
                                                                                var417.method3306();
                                                                            }
                                                                        }
                                                                        field542++;
                                                                        if (field542 > 50) {
                                                                            field493.method2256(163);
                                                                        }
                                                                        try {
                                                                            if (Statics.field2011 != null && field493.field2016 > 0) {
                                                                                Statics.field2011.method1341(field493.field2015, 0, field493.field2016);
                                                                                field493.field2016 = 0;
                                                                                field542 = 0;
                                                                                return;
                                                                            }
                                                                        } catch (IOException var419) {
                                                                            method1470();
                                                                        }
                                                                        return;
                                                                    }
                                                                    var362 = var361.field9;
                                                                    if (var362.field2674 < 0) {
                                                                        break;
                                                                    }
                                                                    var363 = class158.method1612(var362.field2596);
                                                                } while (var363 == null || var363.field2687 == null || var362.field2674 >= var363.field2687.length || var363.field2687[var362.field2674] != var362);
                                                                class26.method116(var361);
                                                            }
                                                        }
                                                        var359 = var358.field9;
                                                        if (var359.field2674 < 0) {
                                                            break;
                                                        }
                                                        var360 = class158.method1612(var359.field2596);
                                                    } while (var360 == null || var360.field2687 == null || var359.field2674 >= var360.field2687.length || var360.field2687[var359.field2674] != var359);
                                                    class26.method116(var358);
                                                }
                                            }
                                            var356 = var355.field9;
                                            if (var356.field2674 < 0) {
                                                break;
                                            }
                                            var357 = class158.method1612(var356.field2596);
                                        } while (var357 == null || var357.field2687 == null || var356.field2674 >= var357.field2687.length || var357.field2687[var356.field2674] != var356);
                                        class26.method116(var355);
                                    }
                                }
                            }
                        }
                    }
                } else if (field605 == 40) {
                    method126();
                }
                return;
            }
            var2.field2556.method3031(var2.field2558, (int) var2.field2817, var2.field2557, false);
        }
    }

    @ObfuscatedName("client.v(I)V")
    public final void method233() {
        boolean var1 = class138.method2634();
        if (var1 && field699 && Statics.field176 != null) {
            Statics.field176.method1108();
        }
        if (field1305) {
            Canvas var2 = Statics.field1830;
            var2.removeKeyListener(class75.field1335);
            var2.removeFocusListener(class75.field1335);
            class75.field1342 = -1;
            Canvas var3 = Statics.field1830;
            var3.removeMouseListener(class77.field1369);
            var3.removeMouseMotionListener(class77.field1369);
            var3.removeFocusListener(class77.field1369);
            class77.field1361 = 0;
            if (Statics.field841 != null) {
                Statics.field841.method1291(Statics.field1830);
            }
            this.method1358();
            class75.method2253(Statics.field1830);
            Canvas var4 = Statics.field1830;
            var4.addMouseListener(class77.field1369);
            var4.addMouseMotionListener(class77.field1369);
            var4.addFocusListener(class77.field1369);
            if (Statics.field841 != null) {
                Statics.field841.method1290(Statics.field1830);
            }
        }
        if (field605 == 0) {
            int var5 = class21.field304;
            String var6 = class21.field308;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field1830.getGraphics();
                if (Statics.field1376 == null) {
                    Statics.field1376 = new Font("Helvetica", 1, 13);
                    Statics.field192 = Statics.field1830.getFontMetrics(Statics.field1376);
                }
                if (field1300) {
                    field1300 = false;
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field1715, Statics.field23);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field366 == null) {
                        Statics.field366 = Statics.field1830.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field366.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field1376);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field192.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field366, Statics.field1715 / 2 - 152, Statics.field23 / 2 - 18, (ImageObserver) null);
                } catch (Exception var44) {
                    int var11 = Statics.field1715 / 2 - 152;
                    int var12 = Statics.field23 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field1376);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field192.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var45) {
                Statics.field1830.repaint();
            }
        } else if (field605 == 5) {
            class21.method529(Statics.field1621, Statics.field251);
        } else if (field605 == 10) {
            class21.method529(Statics.field1621, Statics.field251);
        } else if (field605 == 20) {
            class21.method529(Statics.field1621, Statics.field251);
        } else if (field605 == 25) {
            if (field476 == 1) {
                if (field506 > field507) {
                    field507 = field506;
                }
                int var14 = (field507 * 50 - field506 * 50) / field507;
                method193(class134.field2075 + class2.field29 + class2.field16 + var14 + "%" + class2.field17, false);
            } else if (field476 == 2) {
                if (field508 > field622) {
                    field622 = field508;
                }
                int var15 = (field622 * 50 - field508 * 50) / field622 + 50;
                method193(class134.field2075 + class2.field29 + class2.field16 + var15 + "%" + class2.field17, false);
            } else {
                method193(class134.field2075, false);
            }
        } else if (field605 == 30) {
            if (!field613) {
                field602[0] = class134.field2230;
                field603[0] = "";
                field600[0] = 1006;
                field590 = 1;
            }
            if (field614 != -1) {
                int var16 = field614;
                if (class158.method1540(var16)) {
                    method1513(Statics.field2670[var16], -1);
                }
            }
            for (int var17 = 0; var17 < field655; var17++) {
                if (field657[var17]) {
                    field648[var17] = true;
                }
                field659[var17] = field657[var17];
                field657[var17] = false;
            }
            field656 = field465;
            field604 = -1;
            field540 = -1;
            Statics.field342 = null;
            if (field614 != -1) {
                field655 = 0;
                method2359(field614, 0, 0, 765, 503, 0, 0, -1);
            }
            class89.method1724();
            method2251();
            if (field613) {
                method749();
            } else if (field604 != -1) {
                int var18 = field604;
                int var19 = field540;
                if (field590 >= 2 || field608 != 0 || field610) {
                    String var20;
                    if (field608 == 1 && field590 < 2) {
                        var20 = class134.field2209 + class134.field2219 + field609 + " " + class2.field18;
                    } else if (field610 && field590 < 2) {
                        var20 = field612 + class134.field2219 + field567 + " " + class2.field18;
                    } else {
                        int var21 = field590 - 1;
                        String var22;
                        if (field603[var21].length() > 0) {
                            var22 = field602[var21] + class134.field2219 + field603[var21];
                        } else {
                            var22 = field602[var21];
                        }
                        var20 = var22;
                    }
                    if (field590 > 2) {
                        var20 = var20 + Statics.method2628(16777215) + " " + '/' + " " + (field590 - 2) + class134.field2292;
                    }
                    Statics.field1621.method3350(var20, var18 + 4, var19 + 15, 16777215, 0, field465 / 1000);
                }
            }
            if (field620 == 3) {
                for (int var23 = 0; var23 < field655; var23++) {
                    if (field659[var23]) {
                        class89.method1730(field660[var23], field661[var23], field662[var23], field663[var23], 16711935, 128);
                    } else if (field648[var23]) {
                        class89.method1730(field660[var23], field661[var23], field662[var23], field663[var23], 16711680, 128);
                    }
                }
            }
            int var24 = Statics.field1519;
            int var25 = Statics.field164.field400;
            int var26 = Statics.field164.field404;
            int var27 = field532;
            for (class7 var28 = (class7) class7.field88.method3276(); var28 != null; var28 = (class7) class7.field88.method3278()) {
                if (var28.field91 != -1 || var28.field92 != null) {
                    int var29 = 0;
                    if (var25 > var28.field90) {
                        var29 += var25 - var28.field90;
                    } else if (var25 < var28.field100) {
                        var29 += var28.field100 - var25;
                    }
                    if (var26 > var28.field95) {
                        var29 += var26 - var28.field95;
                    } else if (var26 < var28.field87) {
                        var29 += var28.field87 - var26;
                    }
                    if (var29 - 64 > var28.field85 || field693 == 0 || var28.field94 != var24) {
                        if (var28.field89 != null) {
                            Statics.field1019.method1031(var28.field89);
                            var28.field89 = null;
                        }
                        if (var28.field97 != null) {
                            Statics.field1019.method1031(var28.field97);
                            var28.field97 = null;
                        }
                    } else {
                        var29 -= 64;
                        if (var29 < 0) {
                            var29 = 0;
                        }
                        int var30 = field693 * (var28.field85 - var29) / var28.field85;
                        class57 var10000;
                        if (var28.field89 != null) {
                            var28.field89.method893(var30);
                        } else if (var28.field91 >= 0) {
                            var10000 = (class57) null;
                            class57 var31 = class57.method1190(Statics.field175, var28.field91, 0);
                            if (var31 != null) {
                                class63 var32 = var31.method1189().method1257(Statics.field75);
                                class45 var33 = class45.method889(var32, 100, var30);
                                var33.method892(-1);
                                Statics.field1019.method1030(var33);
                                var28.field89 = var33;
                            }
                        }
                        if (var28.field97 != null) {
                            var28.field97.method893(var30);
                            if (!var28.field97.method3312()) {
                                var28.field97 = null;
                            }
                        } else if (var28.field92 != null && (var28.field96 -= var27) <= 0) {
                            int var34 = (int) (Math.random() * (double) var28.field92.length);
                            var10000 = (class57) null;
                            class57 var35 = class57.method1190(Statics.field175, var28.field92[var34], 0);
                            if (var35 != null) {
                                class63 var36 = var35.method1189().method1257(Statics.field75);
                                class45 var37 = class45.method889(var36, 100, var30);
                                var37.method892(0);
                                Statics.field1019.method1030(var37);
                                var28.field97 = var37;
                                var28.field96 = var28.field93 + (int) (Math.random() * (double) (var28.field86 - var28.field93));
                            }
                        }
                    }
                }
            }
            field532 = 0;
        } else if (field605 == 40) {
            method193(class134.field2076 + class2.field29 + class134.field2077, false);
        }
        if (field605 == 30 && field620 == 0 && !field1300) {
            try {
                Graphics var38 = Statics.field1830.getGraphics();
                for (int var39 = 0; var39 < field655; var39++) {
                    if (field648[var39]) {
                        Statics.field322.method1550(var38, field660[var39], field661[var39], field662[var39], field663[var39]);
                        field648[var39] = false;
                    }
                }
            } catch (Exception var47) {
                Statics.field1830.repaint();
            }
        } else if (field605 > 0) {
            try {
                Graphics var41 = Statics.field1830.getGraphics();
                Statics.field322.method1543(var41, 0, 0);
                field1300 = false;
                for (int var42 = 0; var42 < field655; var42++) {
                    field648[var42] = false;
                }
            } catch (Exception var46) {
                Statics.field1830.repaint();
            }
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method386() {
        if (Statics.field1283 != null) {
            Statics.field1283.field242 = false;
        }
        Statics.field1283 = null;
        if (Statics.field2011 != null) {
            Statics.field2011.method1333();
            Statics.field2011 = null;
        }
        if (class75.field1335 != null) {
            class75 var1 = class75.field1335;
            synchronized (class75.field1335) {
                class75.field1335 = null;
            }
        }
        class77.method1793();
        Statics.field841 = null;
        if (Statics.field176 != null) {
            Statics.field176.method1089();
        }
        if (Statics.field260 != null) {
            Statics.field260.method1089();
        }
        class153.method1990();
        class157.method46();
        class82.method1279();
    }

    @ObfuscatedName("d.n(II)V")
    public static void method197(int arg0) {
        if (field605 == arg0) {
            return;
        }
        if (field605 == 0) {
            Statics.field366 = null;
            Statics.field1376 = null;
            Statics.field192 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field627 = 0;
            field637 = 0;
            field646 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1273 != null) {
            Statics.field1273.method1333();
            Statics.field1273 = null;
        }
        if (field605 == 25) {
            field476 = 0;
            field506 = 0;
            field507 = 1;
            field508 = 0;
            field622 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1830;
            class154 var2 = Statics.field244;
            class154 var3 = Statics.field227;
            if (!Statics.field294) {
                class89.method1775();
                byte[] var4 = var2.method2973("title.jpg", "");
                Statics.field293 = new class86(var4, var1);
                Statics.field303 = Statics.field293.method1622();
                Statics.field2829 = class84.method7(var3, "logo", "");
                Statics.field292 = class84.method7(var3, "titlebox", "");
                Statics.field81 = class84.method7(var3, "titlebutton", "");
                Statics.field380 = class84.method2624(var3, "runes", "");
                Statics.field82 = class84.method2624(var3, "title_mute", "");
                Statics.field312 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field312[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field312[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field312[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field312[var8 + 192] = 16777215;
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
                Statics.field61 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field61[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field61[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field61[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field61[var16 + 192] = 16777215;
                }
                Statics.field724 = new int[256];
                Statics.field1025 = new int[32768];
                Statics.field287 = new int[32768];
                class21.method143((class87) null);
                Statics.field941 = new int[32768];
                Statics.field317 = new int[32768];
                class21.field298 = 0;
                class21.field313 = "";
                class21.field314 = "";
                class21.field306 = false;
                if (Statics.field1018.field174) {
                    class138.field2326 = 1;
                    Statics.field1998 = null;
                    Statics.field2327 = -1;
                    Statics.field732 = -1;
                    Statics.field2328 = 0;
                    Statics.field735 = false;
                    Statics.field2329 = 2;
                } else {
                    class154 var17 = Statics.field1289;
                    int var18 = var17.method2958("scape main");
                    int var19 = var17.method3006(var18, "");
                    class138.field2326 = 1;
                    Statics.field1998 = var17;
                    Statics.field2327 = var18;
                    Statics.field732 = var19;
                    Statics.field2328 = 255;
                    Statics.field735 = false;
                    Statics.field2329 = 2;
                }
                class153.method1528(false);
                Statics.field294 = true;
                Statics.field293.method1631(0, 0);
                Statics.field303.method1631(382, 0);
                Statics.field2829.method1721(382 - Statics.field2829.field1459 / 2, 18);
            }
        } else if (Statics.field294) {
            Statics.field292 = null;
            Statics.field81 = null;
            Statics.field380 = null;
            Statics.field293 = null;
            Statics.field303 = null;
            Statics.field2829 = null;
            Statics.field82 = null;
            Statics.field1723 = null;
            Statics.field1784 = null;
            Statics.field1409 = null;
            Statics.field1984 = null;
            Statics.field392 = null;
            Statics.field312 = null;
            Statics.field302 = null;
            Statics.field61 = null;
            Statics.field724 = null;
            Statics.field1025 = null;
            Statics.field287 = null;
            Statics.field941 = null;
            Statics.field317 = null;
            class138.field2326 = 1;
            Statics.field1998 = null;
            Statics.field2327 = -1;
            Statics.field732 = -1;
            Statics.field2328 = 0;
            Statics.field735 = false;
            Statics.field2329 = 2;
            class153.method1528(true);
            Statics.field294 = false;
        }
        field605 = arg0;
    }

    @ObfuscatedName("client.q(I)V")
    public void method486() {
        if (field605 != 1000) {
            boolean var1 = class153.method1302();
            if (!var1) {
                this.method236();
            }
        }
    }

    @ObfuscatedName("client.i(I)V")
    public void method236() {
        if (class153.field2513 >= 4) {
            this.method1368("js5crc");
            field605 = 1000;
            return;
        }
        if (class153.field2531 >= 4) {
            if (field605 <= 5) {
                this.method1368("js5io");
                field605 = 1000;
                return;
            }
            field454 = 3000;
            class153.field2531 = 3;
        }
        if (--field454 + 1 > 0) {
            return;
        }
        try {
            if (field528 == 0) {
                Statics.field2429 = Statics.field156.method1423(Statics.field1958, Statics.field1795);
                field528++;
            }
            if (field528 == 1) {
                if (Statics.field2429.field1383 == 2) {
                    this.method237(-1);
                    return;
                }
                if (Statics.field2429.field1383 == 1) {
                    field528++;
                }
            }
            if (field528 == 2) {
                Statics.field1211 = new class70((Socket) Statics.field2429.field1381, Statics.field156);
                class126 var1 = new class126(5);
                var1.method2364(15);
                var1.method2367(24);
                Statics.field1211.method1341(var1.field2015, 0, 5);
                field528++;
                Statics.field268 = class121.method1471();
            }
            if (field528 == 3) {
                if (field605 <= 5 || Statics.field1211.method1325() > 0) {
                    int var2 = Statics.field1211.method1323();
                    if (var2 != 0) {
                        this.method237(var2);
                        return;
                    }
                    field528++;
                } else if (class121.method1471() - Statics.field268 > 30000L) {
                    this.method237(-2);
                    return;
                }
            }
            if (field528 == 4) {
                class70 var3 = Statics.field1211;
                boolean var4 = field605 > 20;
                if (Statics.field2514 != null) {
                    try {
                        Statics.field2514.method1333();
                    } catch (Exception var14) {
                    }
                    Statics.field2514 = null;
                }
                Statics.field2514 = var3;
                class153.method1528(var4);
                class153.field2530.field2016 = 0;
                Statics.field2774 = null;
                Statics.field2701 = null;
                class153.field2525 = 0;
                while (true) {
                    class155 var6 = (class155) class153.field2532.method3255();
                    if (var6 == null) {
                        while (true) {
                            class155 var7 = (class155) class153.field2523.method3255();
                            if (var7 == null) {
                                if (class153.field2518 != 0) {
                                    try {
                                        class126 var8 = new class126(4);
                                        var8.method2364(4);
                                        var8.method2364(class153.field2518);
                                        var8.method2365(0);
                                        Statics.field2514.method1341(var8.field2015, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2514.method1333();
                                        } catch (Exception var12) {
                                        }
                                        class153.field2531++;
                                        Statics.field2514 = null;
                                    }
                                }
                                class153.field2516 = 0;
                                Statics.field2529 = class121.method1471();
                                Statics.field2429 = null;
                                Statics.field1211 = null;
                                field528 = 0;
                                field485 = 0;
                                return;
                            }
                            class153.field2520.method3224(var7);
                            class153.field2521.method3254(var7, var7.field2817);
                            class153.field2522++;
                            class153.field2524--;
                        }
                    }
                    class153.field2526.method3254(var6, var6.field2817);
                    class153.field2517++;
                    class153.field2519--;
                }
            }
        } catch (IOException var15) {
            this.method237(-3);
        }
    }

    @ObfuscatedName("client.p(II)V")
    public void method237(int arg0) {
        Statics.field2429 = null;
        Statics.field1211 = null;
        field528 = 0;
        if (Statics.field1795 == Statics.field1388) {
            Statics.field1795 = Statics.field2443;
        } else {
            Statics.field1795 = Statics.field1388;
        }
        field485++;
        if (field485 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field605 <= 5) {
                this.method1368("js5connect_full");
                field605 = 1000;
            } else {
                field454 = 3000;
            }
        } else if (field485 >= 2 && arg0 == 6) {
            this.method1368("js5connect_outofdate");
            field605 = 1000;
        } else if (field485 >= 4) {
            if (field605 <= 5) {
                this.method1368("js5connect");
                field605 = 1000;
            } else {
                field454 = 3000;
            }
        }
    }

    @ObfuscatedName("cn.e(I)V")
    public static void method2076() {
        if (field529 == 0) {
            Statics.field859 = new class95(4, 104, 104, class9.field127);
            for (int var0 = 0; var0 < 4; var0++) {
                field511[var0] = new class164(104, 104);
            }
            Statics.field2054 = new class86(512, 512);
            class21.field308 = class134.field2078;
            class21.field304 = 5;
            field529 = 20;
        } else if (field529 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1753[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1810(var1, 500, 800, 512, 334);
            class21.field308 = class134.field2079;
            class21.field304 = 10;
            field529 = 30;
        } else if (field529 == 30) {
            Statics.field165 = method1618(0, false, true, true);
            Statics.field722 = method1618(1, false, true, true);
            Statics.field1592 = method1618(2, true, false, true);
            Statics.field1310 = method1618(3, false, true, true);
            Statics.field175 = method1618(4, false, true, true);
            Statics.field10 = method1618(5, true, true, true);
            Statics.field1289 = method1618(6, true, true, false);
            Statics.field902 = method1618(7, false, true, true);
            Statics.field227 = method1618(8, false, true, true);
            Statics.field391 = method1618(9, false, true, true);
            Statics.field244 = method1618(10, false, true, true);
            Statics.field370 = method1618(11, false, true, true);
            Statics.field739 = method1618(12, false, true, true);
            Statics.field1279 = method1618(13, true, false, true);
            Statics.field1440 = method1618(14, false, true, false);
            Statics.field255 = method1618(15, false, true, true);
            class21.field308 = class134.field2080;
            class21.field304 = 20;
            field529 = 40;
        } else if (field529 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field165.method3053() * 4 / 100;
            int var8 = var7 + Statics.field722.method3053() * 4 / 100;
            int var9 = var8 + Statics.field1592.method3053() * 2 / 100;
            int var10 = var9 + Statics.field1310.method3053() * 2 / 100;
            int var11 = var10 + Statics.field175.method3053() * 6 / 100;
            int var12 = var11 + Statics.field10.method3053() * 4 / 100;
            int var13 = var12 + Statics.field1289.method3053() * 2 / 100;
            int var14 = var13 + Statics.field902.method3053() * 60 / 100;
            int var15 = var14 + Statics.field227.method3053() * 2 / 100;
            int var16 = var15 + Statics.field391.method3053() * 2 / 100;
            int var17 = var16 + Statics.field244.method3053() * 2 / 100;
            int var18 = var17 + Statics.field370.method3053() * 2 / 100;
            int var19 = var18 + Statics.field739.method3053() * 2 / 100;
            int var20 = var19 + Statics.field1279.method3053() * 2 / 100;
            int var21 = var20 + Statics.field1440.method3053() * 2 / 100;
            int var22 = var21 + Statics.field255.method3053() * 2 / 100;
            if (var22 == 100) {
                class21.field308 = class134.field2082;
                class21.field304 = 30;
                field529 = 45;
            } else {
                if (var22 != 0) {
                    class21.field308 = class134.field2261 + var22 + "%";
                }
                class21.field304 = 30;
            }
        } else if (field529 == 45) {
            boolean var23 = !field597;
            Statics.field1080 = 22050;
            Statics.field2456 = var23;
            Statics.field1085 = 2;
            class141 var24 = new class141();
            var24.method2683(9, 128);
            Statics.field176 = class52.method698(Statics.field156, Statics.field1830, 0, 22050);
            Statics.field176.method1101(var24);
            class154 var25 = Statics.field255;
            class154 var26 = Statics.field1440;
            class154 var27 = Statics.field175;
            Statics.field2330 = var25;
            Statics.field2322 = var26;
            Statics.field2324 = var27;
            Statics.field2323 = var24;
            Statics.field260 = class52.method698(Statics.field156, Statics.field1830, 1, 2048);
            Statics.field1019 = new class46();
            Statics.field260.method1101(Statics.field1019);
            Statics.field75 = new class62(22050, Statics.field1080);
            class21.field308 = class134.field2203;
            class21.field304 = 35;
            field529 = 50;
        } else if (field529 == 50) {
            int var28 = 0;
            if (Statics.field251 == null) {
                Statics.field251 = class84.method119(Statics.field227, Statics.field1279, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field356 == null) {
                Statics.field356 = class84.method119(Statics.field227, Statics.field1279, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1621 == null) {
                Statics.field1621 = class84.method119(Statics.field227, Statics.field1279, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class21.field308 = class134.field2247 + var28 * 100 / 3 + "%";
                class21.field304 = 40;
            } else {
                Statics.field2009 = new class151(true);
                class21.field308 = class134.field2085;
                class21.field304 = 40;
                field529 = 60;
            }
        } else if (field529 == 60) {
            int var29 = class21.method103(Statics.field244, Statics.field227);
            byte var30 = 6;
            if (var29 < var30) {
                class21.field308 = class134.field2086 + var29 * 100 / var30 + "%";
                class21.field304 = 50;
            } else {
                class21.field308 = class134.field2272;
                class21.field304 = 50;
                method197(5);
                field529 = 70;
            }
        } else if (field529 == 70) {
            if (Statics.field1592.method2947()) {
                class154 var32 = Statics.field1592;
                Statics.field921 = var32;
                class154 var33 = Statics.field1592;
                Statics.field854 = var33;
                class154 var34 = Statics.field1592;
                class154 var35 = Statics.field902;
                Statics.field903 = var34;
                Statics.field907 = var35;
                Statics.field909 = Statics.field903.method2962(3);
                class154 var36 = Statics.field1592;
                class154 var37 = Statics.field902;
                boolean var38 = field597;
                Statics.field800 = var36;
                Statics.field2023 = var37;
                class32.field795 = var38;
                class154 var39 = Statics.field1592;
                class154 var40 = Statics.field902;
                Statics.field775 = var39;
                Statics.field758 = var40;
                class154 var41 = Statics.field1592;
                class154 var42 = Statics.field902;
                boolean var43 = field460;
                class183 var44 = Statics.field251;
                Statics.field1000 = var41;
                Statics.field963 = var42;
                Statics.field975 = var43;
                Statics.field1000.method2962(10);
                Statics.field2024 = var44;
                class154 var45 = Statics.field1592;
                class154 var46 = Statics.field165;
                class154 var47 = Statics.field722;
                Statics.field881 = var45;
                Statics.field860 = var46;
                Statics.field254 = var47;
                class154 var48 = Statics.field1592;
                class154 var49 = Statics.field902;
                Statics.field894 = var48;
                Statics.field886 = var49;
                class38.method1983(Statics.field1592);
                class42.method506(Statics.field1592);
                class158.method29(Statics.field1310, Statics.field902, Statics.field227, Statics.field1279);
                class154 var50 = Statics.field1592;
                Statics.field1016 = var50;
                class39.method38(Statics.field1592);
                class21.field308 = class134.field2089;
                class21.field304 = 60;
                field529 = 80;
            } else {
                class21.field308 = class134.field2088 + Statics.field1592.method3034() + "%";
                class21.field304 = 60;
            }
        } else if (field529 == 80) {
            int var51 = 0;
            if (Statics.field373 == null) {
                class154 var52 = Statics.field227;
                int var53 = var52.method2958("compass");
                int var54 = var52.method3006(var53, "");
                class86 var55 = class84.method2327(var52, var53, var54);
                Statics.field373 = var55;
            } else {
                var51++;
            }
            if (Statics.field1436 == null) {
                class154 var56 = Statics.field227;
                int var57 = var56.method2958("mapedge");
                int var58 = var56.method3006(var57, "");
                class86 var59 = class84.method2327(var56, var57, var58);
                Statics.field1436 = var59;
            } else {
                var51++;
            }
            if (Statics.field734 == null) {
                Statics.field734 = class84.method2624(Statics.field227, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field74 == null) {
                Statics.field74 = class84.method149(Statics.field227, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field1165 == null) {
                Statics.field1165 = class84.method149(Statics.field227, "hitmarks", "");
            } else {
                var51++;
            }
            if (Statics.field2036 == null) {
                Statics.field2036 = class84.method149(Statics.field227, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field2047 == null) {
                Statics.field2047 = class84.method149(Statics.field227, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field2019 == null) {
                Statics.field2019 = class84.method149(Statics.field227, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field1808 == null) {
                Statics.field1808 = class84.method149(Statics.field227, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field1589 == null) {
                Statics.field1589 = class84.method149(Statics.field227, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field2376 == null) {
                Statics.field2376 = class84.method149(Statics.field227, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field84 == null) {
                Statics.field84 = class84.method2624(Statics.field227, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field53 == null) {
                Statics.field53 = class84.method2624(Statics.field227, "mod_icons", "");
            } else {
                var51++;
            }
            if (Statics.field1789 == null) {
                Statics.field1789 = class84.method7(Statics.field227, "mapback", "");
            } else {
                var51++;
            }
            if (var51 < 14) {
                class21.field308 = class134.field2288 + var51 * 100 / 14 + "%";
                class21.field304 = 70;
            } else {
                Statics.field2841 = Statics.field53;
                Statics.field1436.method1638();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                for (int var64 = 0; var64 < Statics.field74.length; var64++) {
                    Statics.field74[var64].method1670(var60 + var63, var61 + var63, var62 + var63);
                }
                Statics.field734[0].method1709(var60 + var63, var61 + var63, var62 + var63);
                method142();
                class21.field308 = class134.field2091;
                class21.field304 = 70;
                field529 = 90;
            }
        } else if (field529 == 90) {
            if (Statics.field391.method2947()) {
                class110 var65 = new class110(Statics.field391, Statics.field227, 20, 0.8D, field597 ? 64 : 128);
                class104.method2084(var65);
                class104.method2085(0.8D);
                class21.field308 = class134.field2093;
                class21.field304 = 90;
                field529 = 110;
            } else {
                class21.field308 = class134.field2092 + Statics.field391.method3034() + "%";
                class21.field304 = 90;
            }
        } else if (field529 == 110) {
            Statics.field1283 = new class16();
            Statics.field156.method1424(Statics.field1283, 10);
            class21.field308 = class134.field2094;
            class21.field304 = 94;
            field529 = 120;
        } else if (field529 == 120) {
            if (Statics.field244.method2961("huffman", "")) {
                class120 var66 = new class120(Statics.field244.method2973("huffman", ""));
                Statics.field2831 = var66;
                class21.field308 = class134.field2096;
                class21.field304 = 96;
                field529 = 130;
            } else {
                class21.field308 = class134.field2095 + "%";
                class21.field304 = 96;
            }
        } else if (field529 == 130) {
            if (!Statics.field1310.method2947()) {
                class21.field308 = class134.field2124 + Statics.field1310.method3034() * 4 / 5 + "%";
                class21.field304 = 100;
            } else if (!Statics.field739.method2947()) {
                class21.field308 = class134.field2124 + (80 + Statics.field739.method3034() / 6) + "%";
                class21.field304 = 100;
            } else if (Statics.field1279.method2947()) {
                class21.field308 = class134.field2098;
                class21.field304 = 100;
                field529 = 140;
            } else {
                class21.field308 = class134.field2124 + (96 + Statics.field1279.method3034() / 20) + "%";
                class21.field304 = 100;
            }
        } else if (field529 == 140) {
            method197(10);
        }
    }

    @ObfuscatedName("co.o(IZZZI)Led;")
    public static class154 method1618(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1405 != null) {
            var4 = new class71(arg0, class82.field1405, Statics.field120[arg0], 1000000);
        }
        return new class154(var4, Statics.field957, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("z.j(I)V")
    public static void method142() {
        Statics.field309 = new int[33];
        Statics.field872 = new int[33];
        Statics.field1587 = new int[151];
        Statics.field1011 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field1789.field1454[Statics.field1789.field1459 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field309[var0] = var1;
            Statics.field872[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field1789.field1454[Statics.field1789.field1459 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1587[var4 - 5] = var5 - 25;
            Statics.field1011[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("b.s(I)V")
    public static final void method126() {
        try {
            if (field627 == 0) {
                if (Statics.field2011 != null) {
                    Statics.field2011.method1333();
                    Statics.field2011 = null;
                }
                Statics.field1423 = null;
                field482 = false;
                field637 = 0;
                field627 = 1;
            }
            if (field627 == 1) {
                if (Statics.field1423 == null) {
                    Statics.field1423 = Statics.field156.method1423(Statics.field1958, Statics.field1795);
                }
                if (Statics.field1423.field1383 == 2) {
                    throw new IOException();
                }
                if (Statics.field1423.field1383 == 1) {
                    Statics.field2011 = new class70((Socket) Statics.field1423.field1381, Statics.field156);
                    Statics.field1423 = null;
                    field627 = 2;
                }
            }
            if (field627 == 2) {
                field493.field2016 = 0;
                field493.method2364(14);
                Statics.field2011.method1341(field493.field2015, 0, 1);
                field514.field2016 = 0;
                field627 = 3;
            }
            if (field627 == 3) {
                if (Statics.field176 != null) {
                    Statics.field176.method1098();
                }
                if (Statics.field260 != null) {
                    Statics.field260.method1098();
                }
                int var0 = Statics.field2011.method1323();
                if (Statics.field176 != null) {
                    Statics.field176.method1098();
                }
                if (Statics.field260 != null) {
                    Statics.field260.method1098();
                }
                if (var0 != 0) {
                    method2617(var0);
                    return;
                }
                field514.field2016 = 0;
                field627 = 5;
            }
            if (field627 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field493.field2016 = 0;
                field493.method2364(10);
                field493.method2367(var1[0]);
                field493.method2367(var1[1]);
                field493.method2367(var1[2]);
                field493.method2367(var1[3]);
                field493.method2368(0L);
                field493.method2578(class21.field314);
                field493.method2396(class6.field78, class6.field77);
                field494.field2016 = 0;
                if (field605 == 40) {
                    field494.method2364(18);
                } else {
                    field494.method2364(16);
                }
                field494.method2365(0);
                int var2 = field494.field2016;
                field494.method2367(24);
                field494.method2372(field493.field2015, 0, field493.field2016);
                int var3 = field494.field2016;
                field494.method2578(class21.field313);
                field494.method2364(field597 ? 1 : 0);
                class82.method115(field494);
                class126 var4 = new class126(Statics.field2009.method2933());
                Statics.field2009.method2931(var4);
                field494.method2372(var4.field2015, 0, var4.field2015.length);
                field494.method2367(Statics.field165.field2508);
                field494.method2367(Statics.field722.field2508);
                field494.method2367(Statics.field1592.field2508);
                field494.method2367(Statics.field1310.field2508);
                field494.method2367(Statics.field175.field2508);
                field494.method2367(Statics.field10.field2508);
                field494.method2367(Statics.field1289.field2508);
                field494.method2367(Statics.field902.field2508);
                field494.method2367(Statics.field227.field2508);
                field494.method2367(Statics.field391.field2508);
                field494.method2367(Statics.field244.field2508);
                field494.method2367(Statics.field370.field2508);
                field494.method2367(Statics.field739.field2508);
                field494.method2367(Statics.field1279.field2508);
                field494.method2367(Statics.field1440.field2508);
                field494.method2367(Statics.field255.field2508);
                field494.method2453(var1, var3, field494.field2016);
                field494.method2441(field494.field2016 - var2);
                Statics.field2011.method1341(field494.field2015, 0, field494.field2016);
                field493.method2255(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field514.method2255(var1);
                field627 = 6;
            }
            if (field627 == 6 && Statics.field2011.method1325() > 0) {
                int var6 = Statics.field2011.method1323();
                if (var6 == 21 && field605 == 20) {
                    field627 = 7;
                } else if (var6 == 2) {
                    field627 = 9;
                } else if (var6 == 15 && field605 == 40) {
                    method2155();
                    return;
                } else if (var6 == 23 && field646 < 1) {
                    field646++;
                    field627 = 0;
                } else {
                    method2617(var6);
                    return;
                }
            }
            if (field627 == 7 && Statics.field2011.method1325() > 0) {
                field478 = (Statics.field2011.method1323() + 3) * 60;
                field627 = 8;
            }
            if (field627 == 8) {
                field637 = 0;
                class21.method503(class134.field2115, class134.field2100, field478 / 60 + class134.field2069);
                if (--field478 <= 0) {
                    field627 = 0;
                }
            } else {
                if (field627 == 9 && Statics.field2011.method1325() >= 8) {
                    field621 = Statics.field2011.method1323();
                    field500 = Statics.field2011.method1323() == 1;
                    field580 = Statics.field2011.method1323();
                    field580 <<= 0x8;
                    field580 += Statics.field2011.method1323();
                    field596 = Statics.field2011.method1323();
                    Statics.field2011.method1322(field514.field2015, 0, 1);
                    field514.field2016 = 0;
                    field497 = field514.method2257();
                    Statics.field2011.method1322(field514.field2015, 0, 2);
                    field514.field2016 = 0;
                    field496 = field514.method2373();
                    if (field596 == 1) {
                        try {
                            class67.method1310(Statics.field477, "zap");
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class67.method1310(Statics.field477, "unzap");
                        } catch (Throwable var10) {
                        }
                    }
                    field627 = 10;
                }
                if (field627 != 10) {
                    field637++;
                    if (field637 > 2000) {
                        if (field646 < 1) {
                            if (Statics.field1795 == Statics.field1388) {
                                Statics.field1795 = Statics.field2443;
                            } else {
                                Statics.field1795 = Statics.field1388;
                            }
                            field646++;
                            field627 = 0;
                        } else {
                            method2617(-3);
                        }
                    }
                } else if (Statics.field2011.method1325() >= field496) {
                    field514.field2016 = 0;
                    Statics.field2011.method1322(field514.field2015, 0, field496);
                    method92();
                    Statics.field2383 = -1;
                    method151(false);
                    field497 = -1;
                }
            }
        } catch (IOException var12) {
            if (field646 < 1) {
                if (Statics.field1795 == Statics.field1388) {
                    Statics.field1795 = Statics.field2443;
                } else {
                    Statics.field1795 = Statics.field1388;
                }
                field646++;
                field627 = 0;
            } else {
                method2617(-2);
            }
        }
    }

    @ObfuscatedName("i.b(B)V")
    public static void method92() {
        field466 = 1L;
        field469 = -1;
        Statics.field1283.field237 = 0;
        Statics.field341 = true;
        field470 = true;
        field461 = -1L;
        class182.method2581();
        field493.field2016 = 0;
        field514.field2016 = 0;
        field497 = -1;
        field501 = -1;
        field502 = -1;
        field503 = -1;
        field523 = 0;
        field459 = 0;
        field653 = 0;
        field639 = 0;
        field590 = 0;
        field613 = false;
        class77.method1169(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field495[var0] = null;
        }
        field589 = 0;
        field608 = 0;
        field610 = false;
        field694 = 0;
        field520 = (int) (Math.random() * 100.0D) - 50;
        field522 = (int) (Math.random() * 110.0D) - 55;
        field524 = (int) (Math.random() * 80.0D) - 40;
        field527 = (int) (Math.random() * 120.0D) - 60;
        field488 = (int) (Math.random() * 30.0D) - 20;
        field581 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field607 = 0;
        field479 = -1;
        field553 = 0;
        field687 = 0;
        field575 = 0;
        field484 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field486[var1] = null;
            field579[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field490[var2] = null;
        }
        Statics.field164 = field486[2047] = new class3();
        field681.method3270();
        field591.method3270();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field588[var3][var4][var5] = null;
                }
            }
        }
        field473 = new class177();
        field707 = 0;
        field706 = 0;
        field701 = 0;
        for (int var6 = 0; var6 < Statics.field1022; var6++) {
            class42 var7 = class42.method11(var6);
            if (var7 != null && var7.field1024 == 0) {
                class159.field2699[var6] = 0;
                class159.field2700[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field652.length; var8++) {
            field652[var8] = -1;
        }
        if (field614 != -1) {
            class158.method1354(field614);
        }
        for (class4 var9 = (class4) field615.method3255(); var9 != null; var9 = (class4) field615.method3256()) {
            method1794(var9, true);
        }
        field614 = -1;
        field615 = new class175(8);
        field618 = null;
        field613 = false;
        field590 = 0;
        field516.method3126((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field585[var10] = null;
            field498[var10] = false;
        }
        class19.field267 = new class175(32);
        field464 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field657[var11] = true;
        }
        field658 = null;
        Statics.field1431 = 0;
        Statics.field1593 = null;
    }

    @ObfuscatedName("du.c(I)V")
    public static void method2155() {
        field493.field2016 = 0;
        field514.field2016 = 0;
        field497 = -1;
        field501 = -1;
        field502 = -1;
        field503 = -1;
        field496 = 0;
        field523 = 0;
        field459 = 0;
        field590 = 0;
        field613 = false;
        field607 = 0;
        field553 = 0;
        for (int var0 = 0; var0 < field486.length; var0++) {
            if (field486[var0] != null) {
                field486[var0].field418 = -1;
            }
        }
        for (int var1 = 0; var1 < field490.length; var1++) {
            if (field490[var1] != null) {
                field490[var1].field418 = -1;
            }
        }
        class19.field267 = new class175(32);
        method197(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field657[var2] = true;
        }
    }

    @ObfuscatedName("dm.m(II)V")
    public static void method2617(int arg0) {
        if (arg0 == -3) {
            class21.method503(class134.field2102, class134.field2216, class134.field2104);
        } else if (arg0 == -2) {
            class21.method503(class134.field2074, class134.field2106, class134.field2121);
        } else if (arg0 == -1) {
            class21.method503(class134.field2108, class134.field2109, class134.field2110);
        } else if (arg0 == 3) {
            class21.method503(class134.field2246, class134.field2112, class134.field2113);
        } else if (arg0 == 4) {
            class21.method503(class134.field2114, class134.field2116, class134.field2101);
        } else if (arg0 == 5) {
            class21.method503(class134.field2117, class134.field2119, class134.field2280);
        } else if (arg0 == 6) {
            class21.method503(class134.field2120, class134.field2166, class134.field2122);
        } else if (arg0 == 7) {
            class21.method503(class134.field2221, class134.field2151, class134.field2125);
        } else if (arg0 == 8) {
            class21.method503(class134.field2186, class134.field2127, class134.field2146);
        } else if (arg0 == 9) {
            class21.method503(class134.field2137, class134.field2130, class134.field2131);
        } else if (arg0 == 10) {
            class21.method503(class134.field2132, class134.field2133, class134.field2134);
        } else if (arg0 == 11) {
            class21.method503(class134.field2135, class134.field2205, class134.field2123);
        } else if (arg0 == 12) {
            class21.method503(class134.field2138, class134.field2139, class134.field2126);
        } else if (arg0 == 13) {
            class21.method503(class134.field2103, class134.field2142, class134.field2143);
        } else if (arg0 == 14) {
            class21.method503(class134.field2144, class134.field2145, class134.field2256);
        } else if (arg0 == 16) {
            class21.method503(class134.field2147, class134.field2148, class134.field2149);
        } else if (arg0 == 17) {
            class21.method503(class134.field2150, class134.field2090, class134.field2136);
        } else if (arg0 == 18) {
            class21.method503(class134.field2229, class134.field2154, class134.field2211);
        } else if (arg0 == 19) {
            class21.method503(class134.field2156, class134.field2157, class134.field2281);
        } else if (arg0 == 20) {
            class21.method503(class134.field2169, class134.field2160, class134.field2161);
        } else if (arg0 == 22) {
            class21.method503(class134.field2158, class134.field2163, class134.field2164);
        } else if (arg0 == 23) {
            class21.method503(class134.field2165, class134.field2083, class134.field2162);
        } else if (arg0 == 24) {
            class21.method503(class134.field2206, class134.field2296, class134.field2170);
        } else if (arg0 == 25) {
            class21.method503(class134.field2171, class134.field2204, class134.field2173);
        } else if (arg0 == 26) {
            class21.method503(class134.field2174, class134.field2175, class134.field2176);
        } else if (arg0 == 27) {
            class21.method503(class134.field2177, class134.field2178, class134.field2179);
        } else if (arg0 == 31) {
            class21.method503(class134.field2218, class134.field2155, class134.field2188);
        } else if (arg0 == 32) {
            class21.method503(class134.field2189, class134.field2190, class134.field2159);
        } else if (arg0 == 37) {
            class21.method503(class134.field2238, class134.field2193, class134.field2192);
        } else if (arg0 == 38) {
            class21.method503(class134.field2195, class134.field2196, class134.field2197);
        } else if (arg0 == 55) {
            class21.method503(class134.field2198, class134.field2199, class134.field2200);
        } else {
            class21.method503(class134.field2201, class134.field2202, class134.field2249);
        }
        method197(10);
    }

    @ObfuscatedName("cp.z(I)V")
    public static final void method2074() {
        if (Statics.field2011 != null) {
            Statics.field2011.method1333();
            Statics.field2011 = null;
        }
        method166();
        Statics.field859.method1803();
        for (int var0 = 0; var0 < 4; var0++) {
            field511[var0].method3157();
        }
        System.gc();
        class138.field2326 = 1;
        Statics.field1998 = null;
        Statics.field2327 = -1;
        Statics.field732 = -1;
        Statics.field2328 = 0;
        Statics.field735 = false;
        Statics.field2329 = 2;
        field690 = -1;
        field699 = false;
        class7.method1342();
        method197(10);
    }

    @ObfuscatedName("h.h(I)V")
    public static final void method166() {
        class37.method2077();
        class33.field846.method3216();
        class36.method4();
        class32.method1170();
        class31.method1514();
        class40.field965.method3216();
        class40.field966.method3216();
        class40.field967.method3216();
        class34.field861.method3216();
        class34.field862.method3216();
        class35.field897.method3216();
        class35.field883.method3216();
        class38.field937.method3216();
        class42.method108();
        class163.field2726.method3216();
        class158.method1307();
        ((class110) Statics.field1750).method2164();
        class5.field68.method3216();
        Statics.field165.method2980();
        Statics.field722.method2980();
        Statics.field1310.method2980();
        Statics.field175.method2980();
        Statics.field10.method2980();
        Statics.field1289.method2980();
        Statics.field902.method2980();
        Statics.field227.method2980();
        Statics.field391.method2980();
        Statics.field244.method2980();
        Statics.field370.method2980();
        Statics.field739.method2980();
    }

    @ObfuscatedName("bt.f(B)V")
    public static final void method1470() {
        if (field653 > 0) {
            method2074();
        } else {
            method197(40);
            Statics.field1273 = Statics.field2011;
            Statics.field2011 = null;
        }
    }

    @ObfuscatedName("ep.w(S)V")
    public static final void method2786() {
        if (Statics.field260 != null) {
            Statics.field260.method1087();
        }
        if (Statics.field176 != null) {
            Statics.field176.method1087();
        }
    }

    @ObfuscatedName("d.l(Laf;IIII)V")
    public static void method196(class34 arg0, int arg1, int arg2, int arg3) {
        if (field694 >= 50 || field693 == 0 || arg0.field866 == null || arg1 >= arg0.field866.length) {
            return;
        }
        int var4 = arg0.field866[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field533[field694] = var5;
        field696[field694] = var6;
        field463[field694] = 0;
        field565[field694] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field626[field694] = (var8 << 16) + (var9 << 8) + var7;
        field694++;
    }

    @ObfuscatedName("du.d(I)V")
    public static final void method2156() {
        if (field597 && Statics.field1519 != field574) {
            method167(Statics.field2383, Statics.field1729, Statics.field1519, Statics.field164.field447[0], Statics.field164.field448[0]);
        } else if (Statics.field1519 != field479) {
            field479 = Statics.field1519;
            int var0 = Statics.field1519;
            int[] var1 = Statics.field2054.field1443;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field112[var0][var6][var4] & 0x18) == 0) {
                        Statics.field859.method1946(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field112[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field859.method1946(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field2054.method1698();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field112[var0][var10][var9] & 0x18) == 0) {
                        method2621(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field112[var0 + 1][var10][var9] & 0x8) != 0) {
                        method2621(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field595 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field859.method1832(Statics.field1519, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class32.method582(var14).field822;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field511[Statics.field1519].field2746;
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
                            field685[field595] = Statics.field74[var15];
                            field571[field595] = var16;
                            field552[field595] = var17;
                            field595++;
                        }
                    }
                }
            }
            Statics.field322.method1616();
        }
    }

    @ObfuscatedName("em.y(I)V")
    public static final void method2629() {
        for (int var0 = -1; var0 < field575; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field576[var0];
            }
            class3 var2 = field486[var1];
            if (var2 != null && var2.field409 > 0) {
                var2.field409--;
                if (var2.field409 == 0) {
                    var2.field408 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field484; var3++) {
            int var4 = field492[var3];
            class25 var5 = field490[var4];
            if (var5 != null && var5.field409 > 0) {
                var5.field409--;
                if (var5.field409 == 0) {
                    var5.field408 = null;
                }
            }
        }
    }

    @ObfuscatedName("cv.ah(Ljava/lang/String;B)V")
    public static final void method1800(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field1018.field173 = !Statics.field1018.field173;
            class29 var1 = null;
            try {
                var1 = class82.method48("", Statics.field2307.field2063, true);
                class126 var2 = Statics.field1018.method106();
                var1.method509(var2.field2015, 0, var2.field2016);
            } catch (Exception var9) {
            }
            try {
                if (var1 != null) {
                    var1.method514();
                }
            } catch (Exception var8) {
            }
            if (Statics.field1018.field173) {
                method91(0, "", "Roofs are now all hidden");
            } else {
                method91(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field621 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method1470();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field471 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field471 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            field511[var5].field2746[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field458 == 2) {
                throw new RuntimeException();
            }
        }
        field493.method2256(132);
        field493.method2364(arg0.length() - 1);
        field493.method2578(arg0.substring(2));
    }

    @ObfuscatedName("fi.au(Lah;I)V")
    public static final void method3198(class27 arg0) {
        int var1 = arg0.field438 - field465;
        int var2 = arg0.field434 * 128 + arg0.field399 * 64;
        int var3 = arg0.field443 * 128 + arg0.field399 * 64;
        arg0.field400 += (var2 - arg0.field400) / var1;
        arg0.field404 += (var3 - arg0.field404) / var1;
        arg0.field423 = 0;
        if (arg0.field440 == 0) {
            arg0.field395 = 1024;
        }
        if (arg0.field440 == 1) {
            arg0.field395 = 1536;
        }
        if (arg0.field440 == 2) {
            arg0.field395 = 0;
        }
        if (arg0.field440 == 3) {
            arg0.field395 = 512;
        }
    }

    @ObfuscatedName("bp.as(Lah;I)V")
    public static final void method1350(class27 arg0) {
        if (field465 == arg0.field439 || arg0.field424 == -1 || arg0.field427 != 0 || arg0.field426 + 1 > class34.method30(arg0.field424).field865[arg0.field425]) {
            int var1 = arg0.field439 - arg0.field438;
            int var2 = field465 - arg0.field438;
            int var3 = arg0.field434 * 128 + arg0.field399 * 64;
            int var4 = arg0.field443 * 128 + arg0.field399 * 64;
            int var5 = arg0.field435 * 128 + arg0.field399 * 64;
            int var6 = arg0.field437 * 128 + arg0.field399 * 64;
            arg0.field400 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field404 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field423 = 0;
        if (arg0.field440 == 0) {
            arg0.field395 = 1024;
        }
        if (arg0.field440 == 1) {
            arg0.field395 = 1536;
        }
        if (arg0.field440 == 2) {
            arg0.field395 = 0;
        }
        if (arg0.field440 == 3) {
            arg0.field395 = 512;
        }
        arg0.field397 = arg0.field395;
    }

    @ObfuscatedName("k.ag(Lah;B)V")
    public static final void method34(class27 arg0) {
        if (arg0.field445 == 0) {
            return;
        }
        if (arg0.field418 != -1 && arg0.field418 < 32768) {
            class25 var1 = field490[arg0.field418];
            if (var1 != null) {
                int var2 = arg0.field400 - var1.field400;
                int var3 = arg0.field404 - var1.field404;
                if (var2 != 0 || var3 != 0) {
                    arg0.field395 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field418 >= 32768) {
            int var4 = arg0.field418 - 32768;
            if (field580 == var4) {
                var4 = 2047;
            }
            class3 var5 = field486[var4];
            if (var5 != null) {
                int var6 = arg0.field400 - var5.field400;
                int var7 = arg0.field404 - var5.field404;
                if (var6 != 0 || var7 != 0) {
                    arg0.field395 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field419 != 0 || arg0.field405 != 0) && (arg0.field442 == 0 || arg0.field423 > 0)) {
            int var8 = arg0.field400 - (arg0.field419 * 64 - Statics.field736 * 64 - Statics.field736 * 64);
            int var9 = arg0.field404 - (arg0.field405 * 64 - Statics.field26 * 64 - Statics.field26 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field395 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field419 = 0;
            arg0.field405 = 0;
        }
        int var10 = arg0.field395 - arg0.field397 & 0x7FF;
        if (var10 == 0) {
            arg0.field444 = 0;
            return;
        }
        arg0.field444++;
        if (var10 > 1024) {
            arg0.field397 -= arg0.field445;
            boolean var11 = true;
            if (var10 < arg0.field445 || var10 > 2048 - arg0.field445) {
                arg0.field397 = arg0.field395;
                var11 = false;
            }
            if (arg0.field453 == arg0.field421 && (arg0.field444 > 25 || var11)) {
                if (arg0.field401 == -1) {
                    arg0.field421 = arg0.field403;
                } else {
                    arg0.field421 = arg0.field401;
                }
            }
        } else {
            arg0.field397 += arg0.field445;
            boolean var12 = true;
            if (var10 < arg0.field445 || var10 > 2048 - arg0.field445) {
                arg0.field397 = arg0.field395;
                var12 = false;
            }
            if (arg0.field453 == arg0.field421 && (arg0.field444 > 25 || var12)) {
                if (arg0.field402 == -1) {
                    arg0.field421 = arg0.field403;
                } else {
                    arg0.field421 = arg0.field402;
                }
            }
        }
        arg0.field397 &= 0x7FF;
    }

    @ObfuscatedName("au.ab(Lah;I)V")
    public static final void method524(class27 arg0) {
        arg0.field420 = false;
        if (arg0.field421 != -1) {
            class34 var1 = class34.method30(arg0.field421);
            if (var1 == null || var1.field863 == null) {
                arg0.field421 = -1;
            } else {
                arg0.field428++;
                if (arg0.field436 < var1.field863.length && arg0.field428 > var1.field865[arg0.field436]) {
                    arg0.field428 = 1;
                    arg0.field436++;
                    method196(var1, arg0.field436, arg0.field400, arg0.field404);
                }
                if (arg0.field436 >= var1.field863.length) {
                    arg0.field428 = 0;
                    arg0.field436 = 0;
                    method196(var1, arg0.field436, arg0.field400, arg0.field404);
                }
            }
        }
        if (arg0.field398 != -1 && field465 >= arg0.field441) {
            if (arg0.field430 < 0) {
                arg0.field430 = 0;
            }
            int var2 = class35.method651(arg0.field398).field888;
            if (var2 == -1) {
                arg0.field398 = -1;
            } else {
                class34 var3 = class34.method30(var2);
                if (var3 == null || var3.field863 == null) {
                    arg0.field398 = -1;
                } else {
                    arg0.field431++;
                    if (arg0.field430 < var3.field863.length && arg0.field431 > var3.field865[arg0.field430]) {
                        arg0.field431 = 1;
                        arg0.field430++;
                        method196(var3, arg0.field430, arg0.field400, arg0.field404);
                    }
                    if (arg0.field430 >= var3.field863.length && (arg0.field430 < 0 || arg0.field430 >= var3.field863.length)) {
                        arg0.field398 = -1;
                    }
                }
            }
        }
        if (arg0.field424 != -1 && arg0.field427 <= 1) {
            class34 var4 = class34.method30(arg0.field424);
            if (var4.field874 == 1 && arg0.field451 > 0 && arg0.field438 <= field465 && arg0.field439 < field465) {
                arg0.field427 = 1;
                return;
            }
        }
        if (arg0.field424 != -1 && arg0.field427 == 0) {
            class34 var5 = class34.method30(arg0.field424);
            if (var5 == null || var5.field863 == null) {
                arg0.field424 = -1;
            } else {
                arg0.field426++;
                if (arg0.field425 < var5.field863.length && arg0.field426 > var5.field865[arg0.field425]) {
                    arg0.field426 = 1;
                    arg0.field425++;
                    method196(var5, arg0.field425, arg0.field400, arg0.field404);
                }
                if (arg0.field425 >= var5.field863.length) {
                    arg0.field425 -= var5.field867;
                    arg0.field422++;
                    if (arg0.field422 >= var5.field873) {
                        arg0.field424 = -1;
                    } else if (arg0.field425 >= 0 && arg0.field425 < var5.field863.length) {
                        method196(var5, arg0.field425, arg0.field400, arg0.field404);
                    } else {
                        arg0.field424 = -1;
                    }
                }
                arg0.field420 = var5.field864;
            }
        }
        if (arg0.field427 > 0) {
            arg0.field427--;
        }
    }

    @ObfuscatedName("dj.aq(Lu;III)V")
    public static void method2153(class3 arg0, int arg1, int arg2) {
        if (arg0.field424 == arg1 && arg1 != -1) {
            int var3 = class34.method30(arg1).field868;
            if (var3 == 1) {
                arg0.field425 = 0;
                arg0.field426 = 0;
                arg0.field427 = arg2;
                arg0.field422 = 0;
            }
            if (var3 == 2) {
                arg0.field422 = 0;
            }
        } else if (arg1 == -1 || arg0.field424 == -1 || class34.method30(arg1).field870 >= class34.method30(arg0.field424).field870) {
            arg0.field424 = arg1;
            arg0.field425 = 0;
            arg0.field426 = 0;
            arg0.field427 = arg2;
            arg0.field422 = 0;
            arg0.field451 = arg0.field442;
        }
    }

    @ObfuscatedName("l.af(Ljava/lang/String;ZB)V")
    public static final void method193(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field356.method3340(arg0, 250);
        int var6 = Statics.field356.method3341(arg0, 250) * 13;
        class89.method1728(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1733(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field356.method3373(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method37(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2911(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1830.getGraphics();
            Statics.field322.method1543(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1830.repaint();
        }
    }

    @ObfuscatedName("aj.ay(IIIII)V")
    public static final void method820(int arg0, int arg1, int arg2, int arg3) {
        class89.method1725(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2080();
        field558++;
        method141(true);
        method821(true);
        method141(false);
        method821(false);
        for (class10 var4 = (class10) field681.method3276(); var4 != null; var4 = (class10) field681.method3278()) {
            if (Statics.field1519 != var4.field131 || field465 > var4.field133) {
                var4.method3311();
            } else if (field465 >= var4.field158) {
                if (var4.field139 > 0) {
                    class25 var5 = field490[var4.field139 - 1];
                    if (var5 != null && var5.field400 >= 0 && var5.field400 < 13312 && var5.field404 >= 0 && var5.field404 < 13312) {
                        var4.method84(var5.field400, var5.field404, method1463(var5.field400, var5.field404, var4.field131) - var4.field135, field465);
                    }
                }
                if (var4.field139 < 0) {
                    int var6 = -var4.field139 - 1;
                    class3 var7;
                    if (field580 == var6) {
                        var7 = Statics.field164;
                    } else {
                        var7 = field486[var6];
                    }
                    if (var7 != null && var7.field400 >= 0 && var7.field400 < 13312 && var7.field404 >= 0 && var7.field404 < 13312) {
                        var4.method84(var7.field400, var7.field404, method1463(var7.field400, var7.field404, var4.field131) - var4.field135, field465);
                    }
                }
                var4.method85(field532);
                Statics.field859.method1814(Statics.field1519, (int) var4.field140, (int) var4.field143, (int) var4.field144, 60, var4, var4.field150, -1, false);
            }
        }
        method13();
        if (!field700) {
            int var8 = field483;
            if (field546 / 256 > var8) {
                var8 = field546 / 256;
            }
            if (field686[4] && field703[4] + 128 > var8) {
                var8 = field703[4] + 128;
            }
            int var9 = field581 + field524 & 0x7FF;
            method47(Statics.field99, method1463(Statics.field164.field400, Statics.field164.field404, Statics.field1519) - 50, Statics.field27, var8, var9, var8 * 3 + 600);
        }
        int var22;
        if (field700) {
            var22 = method1522();
        } else {
            int var10;
            if (Statics.field1018.field173) {
                var10 = Statics.field1519;
            } else {
                int var11 = 3;
                if (Statics.field21 < 310) {
                    int var12 = Statics.field1162 >> 7;
                    int var13 = Statics.field1213 >> 7;
                    int var14 = Statics.field164.field400 >> 7;
                    int var15 = Statics.field164.field404 >> 7;
                    if ((class9.field112[Statics.field1519][var12][var13] & 0x4) != 0) {
                        var11 = Statics.field1519;
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
                            if ((class9.field112[Statics.field1519][var12][var13] & 0x4) != 0) {
                                var11 = Statics.field1519;
                            }
                            var19 += var18;
                            if (var19 >= 65536) {
                                var19 -= 65536;
                                if (var13 < var15) {
                                    var13++;
                                } else if (var13 > var15) {
                                    var13--;
                                }
                                if ((class9.field112[Statics.field1519][var12][var13] & 0x4) != 0) {
                                    var11 = Statics.field1519;
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
                            if ((class9.field112[Statics.field1519][var12][var13] & 0x4) != 0) {
                                var11 = Statics.field1519;
                            }
                            var21 += var20;
                            if (var21 >= 65536) {
                                var21 -= 65536;
                                if (var12 < var14) {
                                    var12++;
                                } else if (var12 > var14) {
                                    var12--;
                                }
                                if ((class9.field112[Statics.field1519][var12][var13] & 0x4) != 0) {
                                    var11 = Statics.field1519;
                                }
                            }
                        }
                    }
                }
                if ((class9.field112[Statics.field1519][Statics.field164.field400 >> 7][Statics.field164.field404 >> 7] & 0x4) != 0) {
                    var11 = Statics.field1519;
                }
                var10 = var11;
            }
            var22 = var10;
        }
        int var23 = Statics.field1162;
        int var24 = Statics.field1725;
        int var25 = Statics.field1213;
        int var26 = Statics.field21;
        int var27 = Statics.field680;
        for (int var28 = 0; var28 < 5; var28++) {
            if (field686[var28]) {
                int var29 = (int) (Math.random() * (double) (field702[var28] * 2 + 1) - (double) field702[var28] + Math.sin((double) field704[var28] / 100.0D * (double) field705[var28]) * (double) field703[var28]);
                if (var28 == 0) {
                    Statics.field1162 += var29;
                }
                if (var28 == 1) {
                    Statics.field1725 += var29;
                }
                if (var28 == 2) {
                    Statics.field1213 += var29;
                }
                if (var28 == 3) {
                    Statics.field680 = Statics.field680 + var29 & 0x7FF;
                }
                if (var28 == 4) {
                    Statics.field21 += var29;
                    if (Statics.field21 < 128) {
                        Statics.field21 = 128;
                    }
                    if (Statics.field21 > 383) {
                        Statics.field21 = 383;
                    }
                }
            }
        }
        int var30 = class77.field1365;
        int var31 = class77.field1366;
        if (var30 >= arg0 && var30 < arg0 + arg2 && var31 >= arg1 && var31 < arg1 + arg3) {
            class112.field1888 = true;
            class112.field1891 = 0;
            class112.field1889 = class77.field1365 - arg0;
            class112.field1892 = class77.field1366 - arg1;
        } else {
            class112.field1888 = false;
            class112.field1891 = 0;
        }
        method2786();
        class89.method1728(arg0, arg1, arg2, arg3, 0);
        method2786();
        Statics.field859.method1841(Statics.field1162, Statics.field1725, Statics.field1213, Statics.field21, Statics.field680, var22);
        method2786();
        Statics.field859.method1817();
        field547 = 0;
        for (int var32 = -1; var32 < field575 + field484; var32++) {
            class27 var33;
            if (var32 == -1) {
                var33 = Statics.field164;
            } else if (var32 < field575) {
                var33 = field486[field576[var32]];
            } else {
                var33 = field490[field492[var32 - field575]];
            }
            if (var33 != null && var33.method19()) {
                if (var33 instanceof class25) {
                    class31 var34 = ((class25) var33).field374;
                    if (var34.field787 != null) {
                        var34 = var34.method551();
                    }
                    if (var34 == null) {
                        continue;
                    }
                }
                if (var32 >= field575) {
                    class31 var37 = ((class25) var33).field374;
                    if (var37.field787 != null) {
                        var37 = var37.method551();
                    }
                    if (var37.field785 >= 0 && var37.field785 < Statics.field2047.length) {
                        method2075(var33, var33.field452 + 15);
                        if (field559 > -1) {
                            Statics.field2047[var37.field785].method1633(field559 + arg0 - 12, field560 + arg1 - 30);
                        }
                    }
                    if (field639 == 1 && field474 == field492[var32 - field575] && field465 % 20 < 10) {
                        method2075(var33, var33.field452 + 15);
                        if (field559 > -1) {
                            Statics.field2019[0].method1633(field559 + arg0 - 12, field560 + arg1 - 28);
                        }
                    }
                } else {
                    int var35 = 30;
                    class3 var36 = (class3) var33;
                    if (var36.field38 != -1 || var36.field32 != -1) {
                        method2075(var33, var33.field452 + 15);
                        if (field559 > -1) {
                            if (var36.field38 != -1) {
                                Statics.field2036[var36.field38].method1633(field559 + arg0 - 12, field560 + arg1 - var35);
                                var35 += 25;
                            }
                            if (var36.field32 != -1) {
                                Statics.field2047[var36.field32].method1633(field559 + arg0 - 12, field560 + arg1 - var35);
                                var35 += 25;
                            }
                        }
                    }
                    if (var32 >= 0 && field639 == 10 && field489 == field576[var32]) {
                        method2075(var33, var33.field452 + 15);
                        if (field559 > -1) {
                            Statics.field2019[1].method1633(field559 + arg0 - 12, field560 + arg1 - var35);
                        }
                    }
                }
                if (var33.field408 != null && (var32 >= field575 || field671 == 0 || field671 == 3 || field671 == 1 && method206(((class3) var33).field33))) {
                    method2075(var33, var33.field452);
                    if (field559 > -1 && field547 < field628) {
                        field647[field547] = Statics.field1621.method3361(var33.field408) / 2;
                        field551[field547] = Statics.field1621.field2838;
                        field577[field547] = field559;
                        field550[field547] = field560;
                        field549[field547] = var33.field410;
                        field554[field547] = var33.field411;
                        field555[field547] = var33.field409;
                        field499[field547] = var33.field408;
                        field547++;
                    }
                }
                if (var33.field415 > field465) {
                    method2075(var33, var33.field452 + 15);
                    if (field559 > -1) {
                        int var38 = var33.field416 * 30 / var33.field417;
                        if (var38 > 30) {
                            var38 = 30;
                        }
                        class89.method1728(field559 + arg0 - 15, field560 + arg1 - 3, var38, 5, 65280);
                        class89.method1728(field559 + arg0 - 15 + var38, field560 + arg1 - 3, 30 - var38, 5, 16711680);
                    }
                }
                for (int var39 = 0; var39 < 4; var39++) {
                    if (var33.field450[var39] > field465) {
                        method2075(var33, var33.field452 / 2);
                        if (field559 > -1) {
                            if (var39 == 1) {
                                field560 -= 20;
                            }
                            if (var39 == 2) {
                                field559 -= 15;
                                field560 -= 10;
                            }
                            if (var39 == 3) {
                                field559 += 15;
                                field560 -= 10;
                            }
                            Statics.field1165[var33.field414[var39]].method1633(field559 + arg0 - 12, field560 + arg1 - 12);
                            Statics.field251.method3345(Integer.toString(var33.field412[var39]), field559 + arg0 - 1, field560 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var40 = 0; var40 < field547; var40++) {
            int var41 = field577[var40];
            int var42 = field550[var40];
            int var43 = field647[var40];
            int var44 = field551[var40];
            boolean var45 = true;
            while (var45) {
                var45 = false;
                for (int var46 = 0; var46 < var40; var46++) {
                    if (var42 + 2 > field550[var46] - field551[var46] && var42 - var44 < field550[var46] + 2 && var41 - var43 < field647[var46] + field577[var46] && var41 + var43 > field577[var46] - field647[var46] && field550[var46] - field551[var46] < var42) {
                        var42 = field550[var46] - field551[var46];
                        var45 = true;
                    }
                }
            }
            field559 = field577[var40];
            field560 = field550[var40] = var42;
            String var47 = field499[var40];
            if (field616 == 0) {
                int var48 = 16776960;
                if (field549[var40] < 6) {
                    var48 = field670[field549[var40]];
                }
                if (field549[var40] == 6) {
                    var48 = field558 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field549[var40] == 7) {
                    var48 = field558 % 20 < 10 ? 255 : 65535;
                }
                if (field549[var40] == 8) {
                    var48 = field558 % 20 < 10 ? 45056 : 8454016;
                }
                if (field549[var40] == 9) {
                    int var49 = 150 - field555[var40];
                    if (var49 < 50) {
                        var48 = var49 * 1280 + 16711680;
                    } else if (var49 < 100) {
                        var48 = 16776960 - (var49 - 50) * 327680;
                    } else if (var49 < 150) {
                        var48 = (var49 - 100) * 5 + 65280;
                    }
                }
                if (field549[var40] == 10) {
                    int var50 = 150 - field555[var40];
                    if (var50 < 50) {
                        var48 = var50 * 5 + 16711680;
                    } else if (var50 < 100) {
                        var48 = 16711935 - (var50 - 50) * 327680;
                    } else if (var50 < 150) {
                        var48 = (var50 - 100) * 327680 + 255 - (var50 - 100) * 5;
                    }
                }
                if (field549[var40] == 11) {
                    int var51 = 150 - field555[var40];
                    if (var51 < 50) {
                        var48 = 16777215 - var51 * 327685;
                    } else if (var51 < 100) {
                        var48 = (var51 - 50) * 327685 + 65280;
                    } else if (var51 < 150) {
                        var48 = 16777215 - (var51 - 100) * 327680;
                    }
                }
                if (field554[var40] == 0) {
                    Statics.field1621.method3345(var47, field559 + arg0, field560 + arg1, var48, 0);
                }
                if (field554[var40] == 1) {
                    Statics.field1621.method3347(var47, field559 + arg0, field560 + arg1, var48, 0, field558);
                }
                if (field554[var40] == 2) {
                    Statics.field1621.method3409(var47, field559 + arg0, field560 + arg1, var48, 0, field558);
                }
                if (field554[var40] == 3) {
                    Statics.field1621.method3349(var47, field559 + arg0, field560 + arg1, var48, 0, field558, 150 - field555[var40]);
                }
                if (field554[var40] == 4) {
                    int var52 = (150 - field555[var40]) * (Statics.field1621.method3361(var47) + 100) / 150;
                    class89.method1726(field559 + arg0 - 50, arg1, field559 + arg0 + 50, arg1 + arg3);
                    Statics.field1621.method3415(var47, field559 + arg0 + 50 - var52, field560 + arg1, var48, 0);
                    class89.method1725(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field554[var40] == 5) {
                    int var53 = 150 - field555[var40];
                    int var54 = 0;
                    if (var53 < 25) {
                        var54 = var53 - 25;
                    } else if (var53 > 125) {
                        var54 = var53 - 125;
                    }
                    class89.method1726(arg0, field560 + arg1 - Statics.field1621.field2838 - 1, arg0 + arg2, field560 + arg1 + 5);
                    Statics.field1621.method3345(var47, field559 + arg0, field560 + arg1 + var54, var48, 0);
                    class89.method1725(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1621.method3345(var47, field559 + arg0, field560 + arg1, 16776960, 0);
            }
        }
        if (field639 == 2) {
            method2650((field541 - Statics.field736 << 7) + field455, (field536 - Statics.field26 << 7) + field480, field586 * 2);
            if (field559 > -1 && field465 % 20 < 10) {
                Statics.field2019[0].method1633(field559 + arg0 - 12, field560 + arg1 - 28);
            }
        }
        ((class110) Statics.field1750).method2163(field532);
        method2867(arg0, arg1, arg2, arg3);
        Statics.field1162 = var23;
        Statics.field1725 = var24;
        Statics.field1213 = var25;
        Statics.field21 = var26;
        Statics.field680 = var27;
        if (field464 && class153.method99(true, false) == 0) {
            field464 = false;
        }
        if (field464) {
            class89.method1728(arg0, arg1, arg2, arg3, 0);
            method193(class134.field2075, false);
        }
        if (field464 || field613 || var30 < arg0 || var30 >= arg0 + arg2 || var31 < arg1 || var31 >= arg1 + arg3) {
            return;
        }
        if (field608 == 0 && !field610) {
            method194(class134.field2214, "", 23, 0, var30 - arg0, var31 - arg1);
        }
        int var55 = -1;
        for (int var56 = 0; var56 < class112.field1891; var56++) {
            int var57 = class112.field1837[var56];
            int var58 = var57 & 0x7F;
            int var59 = var57 >> 7 & 0x7F;
            int var60 = var57 >> 29 & 0x3;
            int var61 = var57 >> 14 & 0x7FFF;
            if (var55 != var57) {
                var55 = var57;
                if (var60 == 2 && Statics.field859.method1833(Statics.field1519, var58, var59, var57) >= 0) {
                    class32 var62 = class32.method582(var61);
                    if (var62.field828 != null) {
                        var62 = var62.method593();
                    }
                    if (var62 == null) {
                        continue;
                    }
                    if (field608 == 1) {
                        method194(class134.field2209, field609 + " " + class2.field18 + " " + Statics.method2628(65535) + var62.field804, 1, var57, var58, var59);
                    } else if (!field610) {
                        String[] var63 = var62.field821;
                        if (field632) {
                            var63 = method127(var63);
                        }
                        if (var63 != null) {
                            for (int var64 = 4; var64 >= 0; var64--) {
                                if (var63[var64] != null) {
                                    short var65 = 0;
                                    if (var64 == 0) {
                                        var65 = 3;
                                    }
                                    if (var64 == 1) {
                                        var65 = 4;
                                    }
                                    if (var64 == 2) {
                                        var65 = 5;
                                    }
                                    if (var64 == 3) {
                                        var65 = 6;
                                    }
                                    if (var64 == 4) {
                                        var65 = 1001;
                                    }
                                    method194(var63[var64], Statics.method2628(65535) + var62.field804, var65, var57, var58, var59);
                                }
                            }
                        }
                        method194(class134.field2210, Statics.method2628(65535) + var62.field804, 1002, var62.field801 << 14, var58, var59);
                    } else if ((Statics.field338 & 0x4) == 4) {
                        method194(field612, field567 + " " + class2.field18 + " " + Statics.method2628(65535) + var62.field804, 2, var57, var58, var59);
                    }
                }
                if (var60 == 1) {
                    class25 var66 = field490[var61];
                    if (var66.field374.field792 == 1 && (var66.field400 & 0x7F) == 64 && (var66.field404 & 0x7F) == 64) {
                        for (int var67 = 0; var67 < field484; var67++) {
                            class25 var68 = field490[field492[var67]];
                            if (var68 != null && var66 != var68 && var68.field374.field792 == 1 && var66.field400 == var68.field400 && var66.field404 == var68.field404) {
                                method2(var68.field374, field492[var67], var58, var59);
                            }
                        }
                        for (int var69 = 0; var69 < field575; var69++) {
                            class3 var70 = field486[field576[var69]];
                            if (var70 != null && var66.field400 == var70.field400 && var66.field404 == var70.field404) {
                                method94(var70, field576[var69], var58, var59);
                            }
                        }
                    }
                    method2(var66.field374, var61, var58, var59);
                }
                if (var60 == 0) {
                    class3 var71 = field486[var61];
                    if ((var71.field400 & 0x7F) == 64 && (var71.field404 & 0x7F) == 64) {
                        for (int var72 = 0; var72 < field484; var72++) {
                            class25 var73 = field490[field492[var72]];
                            if (var73 != null && var73.field374.field792 == 1 && var71.field400 == var73.field400 && var71.field404 == var73.field404) {
                                method2(var73.field374, field492[var72], var58, var59);
                            }
                        }
                        for (int var74 = 0; var74 < field575; var74++) {
                            class3 var75 = field486[field576[var74]];
                            if (var75 != null && var71 != var75 && var71.field400 == var75.field400 && var71.field404 == var75.field404) {
                                method94(var75, field576[var74], var58, var59);
                            }
                        }
                    }
                    method94(var71, var61, var58, var59);
                }
                if (var60 == 3) {
                    class177 var76 = field588[Statics.field1519][var58][var59];
                    if (var76 != null) {
                        for (class17 var77 = (class17) var76.method3277(); var77 != null; var77 = (class17) var76.method3297()) {
                            class40 var78 = Statics.method1799(var77.field246);
                            if (field608 == 1) {
                                method194(class134.field2209, field609 + " " + class2.field18 + " " + Statics.method2628(16748608) + var78.field970, 16, var77.field246, var58, var59);
                            } else if (!field610) {
                                String[] var79 = var78.field984;
                                if (field632) {
                                    var79 = method127(var79);
                                }
                                for (int var80 = 4; var80 >= 0; var80--) {
                                    if (var79 != null && var79[var80] != null) {
                                        byte var81 = 0;
                                        if (var80 == 0) {
                                            var81 = 18;
                                        }
                                        if (var80 == 1) {
                                            var81 = 19;
                                        }
                                        if (var80 == 2) {
                                            var81 = 20;
                                        }
                                        if (var80 == 3) {
                                            var81 = 21;
                                        }
                                        if (var80 == 4) {
                                            var81 = 22;
                                        }
                                        method194(var79[var80], Statics.method2628(16748608) + var78.field970, var81, var77.field246, var58, var59);
                                    } else if (var80 == 2) {
                                        method194(class134.field2128, Statics.method2628(16748608) + var78.field970, 20, var77.field246, var58, var59);
                                    }
                                }
                                method194(class134.field2210, Statics.method2628(16748608) + var78.field970, 1004, var77.field246, var58, var59);
                            } else if ((Statics.field338 & 0x1) == 1) {
                                method194(field612, field567 + " " + class2.field18 + " " + Statics.method2628(16748608) + var78.field970, 17, var77.field246, var58, var59);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.ax(ZI)V")
    public static final void method141(boolean arg0) {
        if (Statics.field164.field400 >> 7 == field553 && Statics.field164.field404 >> 7 == field687) {
            field553 = 0;
        }
        int var1 = field575;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field164;
                var4 = 33538048;
            } else {
                var3 = field486[field576[var2]];
                var4 = field576[var2] << 14;
            }
            if (var3 != null && var3.method19()) {
                var3.field43 = false;
                if ((field597 && field575 > 50 || field575 > 200) && !arg0 && var3.field453 == var3.field421) {
                    var3.field43 = true;
                }
                int var5 = var3.field400 >> 7;
                int var6 = var3.field404 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field42 == null || field465 < var3.field37 || field465 >= var3.field39) {
                        if ((var3.field400 & 0x7F) == 64 && (var3.field404 & 0x7F) == 64) {
                            if (field558 == field557[var5][var6]) {
                                continue;
                            }
                            field557[var5][var6] = field558;
                        }
                        var3.field36 = method1463(var3.field400, var3.field404, Statics.field1519);
                        Statics.field859.method1814(Statics.field1519, var3.field400, var3.field404, var3.field36, 60, var3, var3.field397, var4, var3.field420);
                    } else {
                        var3.field43 = false;
                        var3.field36 = method1463(var3.field400, var3.field404, Statics.field1519);
                        Statics.field859.method1815(Statics.field1519, var3.field400, var3.field404, var3.field36, 60, var3, var3.field397, var4, var3.field47, var3.field44, var3.field45, var3.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.aa(ZI)V")
    public static final void method821(boolean arg0) {
        for (int var1 = 0; var1 < field484; var1++) {
            class25 var2 = field490[field492[var1]];
            int var3 = (field492[var1] << 14) + 536870912;
            if (var2 != null && var2.method19() && var2.field374.field765 == arg0 && var2.field374.method558()) {
                int var4 = var2.field400 >> 7;
                int var5 = var2.field404 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field399 == 1 && (var2.field400 & 0x7F) == 64 && (var2.field404 & 0x7F) == 64) {
                        if (field558 == field557[var4][var5]) {
                            continue;
                        }
                        field557[var4][var5] = field558;
                    }
                    if (!var2.field374.field790) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field859.method1814(Statics.field1519, var2.field400, var2.field404, method1463(var2.field400 + (var2.field399 * 64 - 64), var2.field404 + (var2.field399 * 64 - 64), Statics.field1519), var2.field399 * 64 - 64 + 60, var2, var2.field397, var3, var2.field420);
                }
            }
        }
    }

    @ObfuscatedName("r.ak(I)V")
    public static final void method13() {
        for (class20 var0 = (class20) field591.method3276(); var0 != null; var0 = (class20) field591.method3278()) {
            if (Statics.field1519 != var0.field276 || var0.field283) {
                var0.method3311();
            } else if (field465 >= var0.field275) {
                var0.method144(field532);
                if (var0.field283) {
                    var0.method3311();
                } else {
                    Statics.field859.method1814(var0.field276, var0.field277, var0.field278, var0.field279, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ce.ac(I)I")
    public static final int method1522() {
        if (Statics.field1018.field173) {
            return Statics.field1519;
        } else {
            int var0 = method1463(Statics.field1162, Statics.field1213, Statics.field1519);
            return var0 - Statics.field1725 >= 800 || (class9.field112[Statics.field1519][Statics.field1162 >> 7][Statics.field1213 >> 7] & 0x4) == 0 ? 3 : Statics.field1519;
        }
    }

    @ObfuscatedName("cm.aj(I)V")
    public static final void method1590() {
        field573 = 0;
        int var0 = (Statics.field164.field400 >> 7) + Statics.field736;
        int var1 = (Statics.field164.field404 >> 7) + Statics.field26;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field573 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field573 = 1;
        }
        if (field573 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field573 = 0;
        }
    }

    @ObfuscatedName("ec.av(IIIII)V")
    public static final void method2867(int arg0, int arg1, int arg2, int arg3) {
        if (field564 == 1) {
            Statics.field1589[field563 / 100].method1633(field548 - 8, field562 - 8);
        }
        if (field564 == 2) {
            Statics.field1589[field563 / 100 + 4].method1633(field548 - 8, field562 - 8);
        }
        method1590();
        if (!field471) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field356.method3402("Fps:" + field1303, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field597) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field597) {
            var8 = 16711680;
        }
        Statics.field356.method3402("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("cp.al(Lah;II)V")
    public static final void method2075(class27 arg0, int arg1) {
        method2650(arg0.field400, arg0.field404, arg1);
    }

    @ObfuscatedName("ez.an(IIIS)V")
    public static final void method2650(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field559 = -1;
            field560 = -1;
            return;
        }
        int var3 = method1463(arg0, arg1, Statics.field1519) - arg2;
        int var4 = arg0 - Statics.field1162;
        int var5 = var3 - Statics.field1725;
        int var6 = arg1 - Statics.field1213;
        int var7 = class104.field1753[Statics.field21];
        int var8 = class104.field1754[Statics.field21];
        int var9 = class104.field1753[Statics.field680];
        int var10 = class104.field1754[Statics.field680];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field559 = (var11 << 9) / var15 + 256;
            field560 = (var14 << 9) / var15 + 167;
        } else {
            field559 = -1;
            field560 = -1;
        }
    }

    @ObfuscatedName("bm.ap(IIII)I")
    public static final int method1463(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field112[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field127[var5][var3][var4] + class9.field127[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field127[var5][var3][var4 + 1] + class9.field127[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("g.at(IIIIIII)V")
    public static final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1753[var6];
            int var12 = class104.field1754[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1753[var7];
            int var15 = class104.field1754[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1162 = arg0 - var8;
        Statics.field1725 = arg1 - var9;
        Statics.field1213 = arg2 - var10;
        Statics.field21 = arg3;
        Statics.field680 = arg4;
    }

    @ObfuscatedName("h.ae(ZI)V")
    public static final void method151(boolean arg0) {
        field512 = arg0;
        if (!field512) {
            int var1 = (field496 - field514.field2016) / 16;
            Statics.field72 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field72[var2][var3] = field514.method2383();
                }
            }
            int var4 = field514.method2373();
            int var5 = field514.method2373();
            int var6 = field514.method2481();
            int var7 = field514.method2411();
            int var8 = field514.method2410();
            Statics.field60 = new int[var1];
            Statics.field241 = new int[var1];
            Statics.field850 = new int[var1];
            Statics.field228 = new byte[var1][];
            Statics.field49 = new byte[var1][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var5 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var5 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field60[var10] = var13;
                        Statics.field241[var10] = Statics.field10.method2958("m" + var11 + "_" + var12);
                        Statics.field850[var10] = Statics.field10.method2958("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method167(var7, var5, var6, var4, var8);
            return;
        }
        int var14 = field514.method2411();
        int var15 = field514.method2411();
        int var16 = field514.method2412();
        int var17 = field514.method2411();
        field514.method2258();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field514.method2268(1);
                    if (var21 == 1) {
                        field513[var18][var19][var20] = field514.method2268(26);
                    } else {
                        field513[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field514.method2260();
        int var22 = (field496 - field514.field2016) / 16;
        Statics.field72 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field72[var23][var24] = field514.method2393();
            }
        }
        int var25 = field514.method2481();
        Statics.field60 = new int[var22];
        Statics.field241 = new int[var22];
        Statics.field850 = new int[var22];
        Statics.field228 = new byte[var22][];
        Statics.field49 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field513[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field60[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field60[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field241[var26] = Statics.field10.method2958("m" + var35 + "_" + var36);
                            Statics.field850[var26] = Statics.field10.method2958("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method167(var16, var15, var25, var17, var14);
    }

    @ObfuscatedName("h.aw(IIIIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2383 == arg0 && Statics.field1729 == arg1 && field574 == arg2 || !field597) {
            return;
        }
        Statics.field2383 = arg0;
        Statics.field1729 = arg1;
        field574 = arg2;
        if (!field597) {
            field574 = 0;
        }
        method197(25);
        method193(class134.field2075, true);
        int var5 = Statics.field736;
        int var6 = Statics.field26;
        Statics.field736 = (arg0 - 6) * 8;
        Statics.field26 = (arg1 - 6) * 8;
        int var7 = Statics.field736 - var5;
        int var8 = Statics.field26 - var6;
        int var9 = Statics.field736;
        int var10 = Statics.field26;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field490[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field447[var13] -= var7;
                    var12.field448[var13] -= var8;
                }
                var12.field400 -= var7 * 128;
                var12.field404 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field486[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field447[var16] -= var7;
                    var15.field448[var16] -= var8;
                }
                var15.field400 -= var7 * 128;
                var15.field404 -= var8 * 128;
            }
        }
        Statics.field1519 = arg2;
        Statics.field164.method207(arg3, arg4, false);
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
                        field588[var27][var23][var24] = field588[var27][var25][var26];
                    } else {
                        field588[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field473.method3276(); var28 != null; var28 = (class22) field473.method3278()) {
            var28.field344 -= var7;
            var28.field329 -= var8;
            if (var28.field344 < 0 || var28.field329 < 0 || var28.field344 >= 104 || var28.field329 >= 104) {
                var28.method3311();
            }
        }
        if (field553 != 0) {
            field553 -= var7;
            field687 -= var8;
        }
        field694 = 0;
        field700 = false;
        field479 = -1;
        field591.method3270();
        field681.method3270();
    }

    @ObfuscatedName("df.am(ZI)V")
    public static final void method2576(boolean arg0) {
        method2786();
        field542++;
        if (field542 < 50 && !arg0) {
            return;
        }
        field542 = 0;
        if (field482 || Statics.field2011 == null) {
            return;
        }
        field493.method2256(163);
        try {
            Statics.field2011.method1341(field493.field2015, 0, field493.field2016);
            field493.field2016 = 0;
        } catch (IOException var2) {
            field482 = true;
        }
    }

    @ObfuscatedName("be.ar(B)V")
    public static final void method1218() {
        method2576(false);
        field506 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field228.length; var1++) {
            if (Statics.field241[var1] != -1 && Statics.field228[var1] == null) {
                Statics.field228[var1] = Statics.field10.method2943(Statics.field241[var1], 0);
                if (Statics.field228[var1] == null) {
                    var0 = false;
                    field506++;
                }
            }
            if (Statics.field850[var1] != -1 && Statics.field49[var1] == null) {
                Statics.field49[var1] = Statics.field10.method2951(Statics.field850[var1], 0, Statics.field72[var1]);
                if (Statics.field49[var1] == null) {
                    var0 = false;
                    field506++;
                }
            }
        }
        if (!var0) {
            field476 = 1;
            return;
        }
        field508 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field228.length; var3++) {
            byte[] var4 = Statics.field49[var3];
            if (var4 != null) {
                int var5 = (Statics.field60[var3] >> 8) * 64 - Statics.field736;
                int var6 = (Statics.field60[var3] & 0xFF) * 64 - Statics.field26;
                if (field512) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class126 var9 = new class126(var4);
                int var10 = -1;
                label526: while (true) {
                    int var11 = var9.method2391();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2391();
                            if (var16 == 0) {
                                continue label526;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2481() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class32 var22 = class32.method582(var10);
                                if (var19 != 22 || !field597 || var22.field813 != 0 || var22.field811 == 1 || var22.field805) {
                                    if (!var22.method591()) {
                                        field508++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2391();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2481();
                    }
                }
            }
        }
        if (!var2) {
            field476 = 2;
            return;
        }
        if (field476 != 0) {
            method193(class134.field2075 + class2.field29 + class2.field16 + 100 + "%" + class2.field17, true);
        }
        method2786();
        method166();
        method2786();
        Statics.field859.method1803();
        method2786();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field511[var23].method3157();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field112[var24][var25][var26] = 0;
                }
            }
        }
        method2786();
        class9.method1319();
        int var27 = Statics.field228.length;
        class7.method1342();
        method2576(true);
        if (!field512) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field60[var28] >> 8) * 64 - Statics.field736;
                int var30 = (Statics.field60[var28] & 0xFF) * 64 - Statics.field26;
                byte[] var31 = Statics.field228[var28];
                if (var31 != null) {
                    method2786();
                    class9.method508(var31, var29, var30, Statics.field2383 * 8 - 48, Statics.field1729 * 8 - 48, field511);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field60[var32] >> 8) * 64 - Statics.field736;
                int var34 = (Statics.field60[var32] & 0xFF) * 64 - Statics.field26;
                byte[] var35 = Statics.field228[var32];
                if (var35 == null && Statics.field1729 < 800) {
                    method2786();
                    class9.method114(var33, var34, 64, 64);
                }
            }
            method2576(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field49[var36];
                if (var37 != null) {
                    int var38 = (Statics.field60[var36] >> 8) * 64 - Statics.field736;
                    int var39 = (Statics.field60[var36] & 0xFF) * 64 - Statics.field26;
                    method2786();
                    class9.method528(var37, var38, var39, Statics.field859, field511);
                }
            }
        }
        if (field512) {
            for (int var40 = 0; var40 < 4; var40++) {
                method2786();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field513[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field60.length; var50++) {
                                if (Statics.field60[var50] == var49 && Statics.field228[var50] != null) {
                                    class9.method748(Statics.field228[var50], var40, var41 * 8, var42 * 8, var45, (var47 & 0x7) * 8, (var48 & 0x7) * 8, var46, field511);
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43) {
                            int var51 = var40;
                            int var52 = var41 * 8;
                            int var53 = var42 * 8;
                            for (int var54 = 0; var54 < 8; var54++) {
                                for (int var55 = 0; var55 < 8; var55++) {
                                    class9.field127[var51][var52 + var54][var53 + var55] = 0;
                                }
                            }
                            if (var52 > 0) {
                                for (int var56 = 1; var56 < 8; var56++) {
                                    class9.field127[var51][var52][var53 + var56] = class9.field127[var51][var52 - 1][var53 + var56];
                                }
                            }
                            if (var53 > 0) {
                                for (int var57 = 1; var57 < 8; var57++) {
                                    class9.field127[var51][var52 + var57][var53] = class9.field127[var51][var52 + var57][var53 - 1];
                                }
                            }
                            if (var52 > 0 && class9.field127[var51][var52 - 1][var53] != 0) {
                                class9.field127[var51][var52][var53] = class9.field127[var51][var52 - 1][var53];
                            } else if (var53 > 0 && class9.field127[var51][var52][var53 - 1] != 0) {
                                class9.field127[var51][var52][var53] = class9.field127[var51][var52][var53 - 1];
                            } else if (var52 > 0 && var53 > 0 && class9.field127[var51][var52 - 1][var53 - 1] != 0) {
                                class9.field127[var51][var52][var53] = class9.field127[var51][var52 - 1][var53 - 1];
                            }
                        }
                    }
                }
            }
            for (int var58 = 0; var58 < 13; var58++) {
                for (int var59 = 0; var59 < 13; var59++) {
                    int var60 = field513[0][var58][var59];
                    if (var60 == -1) {
                        class9.method114(var58 * 8, var59 * 8, 8, 8);
                    }
                }
            }
            method2576(true);
            for (int var61 = 0; var61 < 4; var61++) {
                method2786();
                for (int var62 = 0; var62 < 13; var62++) {
                    label367: for (int var63 = 0; var63 < 13; var63++) {
                        int var64 = field513[var61][var62][var63];
                        if (var64 != -1) {
                            int var65 = var64 >> 24 & 0x3;
                            int var66 = var64 >> 1 & 0x3;
                            int var67 = var64 >> 14 & 0x3FF;
                            int var68 = var64 >> 3 & 0x7FF;
                            int var69 = (var67 / 8 << 8) + var68 / 8;
                            for (int var70 = 0; var70 < Statics.field60.length; var70++) {
                                if (Statics.field60[var70] == var69 && Statics.field49[var70] != null) {
                                    byte[] var71 = Statics.field49[var70];
                                    int var72 = var62 * 8;
                                    int var73 = var63 * 8;
                                    int var74 = (var67 & 0x7) * 8;
                                    int var75 = (var68 & 0x7) * 8;
                                    class95 var76 = Statics.field859;
                                    class164[] var77 = field511;
                                    class126 var78 = new class126(var71);
                                    int var79 = -1;
                                    while (true) {
                                        int var80 = var78.method2391();
                                        if (var80 == 0) {
                                            continue label367;
                                        }
                                        var79 += var80;
                                        int var81 = 0;
                                        while (true) {
                                            int var82 = var78.method2391();
                                            if (var82 == 0) {
                                                break;
                                            }
                                            var81 += var82 - 1;
                                            int var83 = var81 & 0x3F;
                                            int var84 = var81 >> 6 & 0x3F;
                                            int var85 = var81 >> 12;
                                            int var86 = var78.method2481();
                                            int var87 = var86 >> 2;
                                            int var88 = var86 & 0x3;
                                            if (var65 == var85 && var84 >= var74 && var84 < var74 + 8 && var83 >= var75 && var83 < var75 + 8) {
                                                class32 var89 = class32.method582(var79);
                                                int var91 = var84 & 0x7;
                                                int var92 = var83 & 0x7;
                                                int var94 = var89.field809;
                                                int var95 = var89.field807;
                                                if ((var88 & 0x1) == 1) {
                                                    int var96 = var94;
                                                    var94 = var95;
                                                    var95 = var96;
                                                }
                                                int var97 = var66 & 0x3;
                                                int var98;
                                                if (var97 == 0) {
                                                    var98 = var91;
                                                } else if (var97 == 1) {
                                                    var98 = var92;
                                                } else if (var97 == 2) {
                                                    var98 = 7 - var91 - (var94 - 1);
                                                } else {
                                                    var98 = 7 - var92 - (var95 - 1);
                                                }
                                                int var99 = var72 + var98;
                                                int var101 = var84 & 0x7;
                                                int var102 = var83 & 0x7;
                                                int var104 = var89.field809;
                                                int var105 = var89.field807;
                                                if ((var88 & 0x1) == 1) {
                                                    int var106 = var104;
                                                    var104 = var105;
                                                    var105 = var106;
                                                }
                                                int var107 = var66 & 0x3;
                                                int var108;
                                                if (var107 == 0) {
                                                    var108 = var102;
                                                } else if (var107 == 1) {
                                                    var108 = 7 - var101 - (var104 - 1);
                                                } else if (var107 == 2) {
                                                    var108 = 7 - var102 - (var105 - 1);
                                                } else {
                                                    var108 = var101;
                                                }
                                                int var109 = var73 + var108;
                                                if (var99 > 0 && var109 > 0 && var99 < 103 && var109 < 103) {
                                                    int var110 = var61;
                                                    if ((class9.field112[1][var99][var109] & 0x2) == 2) {
                                                        var110 = var61 - 1;
                                                    }
                                                    class164 var111 = null;
                                                    if (var110 >= 0) {
                                                        var111 = var77[var110];
                                                    }
                                                    class9.method2311(var61, var99, var109, var79, var66 + var88 & 0x3, var87, var76, var111);
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
        method2576(true);
        method166();
        method2786();
        class9.method505(Statics.field859, field511);
        method2576(true);
        int var112 = class9.field115;
        if (var112 > Statics.field1519) {
            var112 = Statics.field1519;
        }
        if (var112 < Statics.field1519 - 1) {
            int var113 = Statics.field1519 - 1;
        }
        if (field597) {
            Statics.field859.method1804(class9.field115);
        } else {
            Statics.field859.method1804(0);
        }
        for (int var114 = 0; var114 < 104; var114++) {
            for (int var115 = 0; var115 < 104; var115++) {
                method1469(var114, var115);
            }
        }
        method2786();
        for (class22 var116 = (class22) field473.method3276(); var116 != null; var116 = (class22) field473.method3278()) {
            if (var116.field337 == -1) {
                var116.field336 = 0;
                method2543(var116);
            } else {
                var116.method3311();
            }
        }
        class32.field797.method3216();
        if (Statics.field1241 != null) {
            field493.method2256(75);
            field493.method2367(1057001181);
        }
        if (!field512) {
            int var117 = (Statics.field2383 - 6) / 8;
            int var118 = (Statics.field2383 + 6) / 8;
            int var119 = (Statics.field1729 - 6) / 8;
            int var120 = (Statics.field1729 + 6) / 8;
            for (int var121 = var117 - 1; var121 <= var118 + 1; var121++) {
                for (int var122 = var119 - 1; var122 <= var120 + 1; var122++) {
                    if (var121 < var117 || var121 > var118 || var122 < var119 || var122 > var120) {
                        Statics.field10.method2940("m" + var121 + "_" + var122);
                        Statics.field10.method2940("l" + var121 + "_" + var122);
                    }
                }
            }
        }
        method197(30);
        method2786();
        Statics.field114 = (byte[][][]) null;
        Statics.field1164 = (byte[][][]) null;
        Statics.field2438 = (byte[][][]) null;
        Statics.field122 = (byte[][][]) null;
        Statics.field1166 = (int[][][]) null;
        Statics.field1020 = (byte[][][]) null;
        Statics.field1015 = (int[][]) null;
        Statics.field116 = null;
        Statics.field1259 = null;
        Statics.field1726 = null;
        Statics.field2710 = null;
        Statics.field1333 = null;
        field493.method2256(108);
        Statics.field270.method1283();
        for (int var123 = 0; var123 < 32; var123++) {
            field1301[var123] = 0L;
        }
        for (int var124 = 0; var124 < 32; var124++) {
            field1302[var124] = 0L;
        }
        Statics.field1009 = 0;
    }

    @ObfuscatedName("ee.ai(IIIIII)V")
    public static final void method2621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field859.method1829(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field859.method1833(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2054.field1443;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method582(var12);
            if (var13.field823 == -1) {
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
                class87 var14 = Statics.field734[var13.field823];
                if (var14 != null) {
                    int var15 = (var13.field809 * 4 - var14.field1459) / 2;
                    int var16 = (var13.field807 * 4 - var14.field1453) / 2;
                    var14.method1721(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field807) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field859.method1831(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field859.method1833(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method582(var21);
            if (var22.field823 != -1) {
                class87 var23 = Statics.field734[var22.field823];
                if (var23 != null) {
                    int var24 = (var22.field809 * 4 - var23.field1459) / 2;
                    int var25 = (var22.field807 * 4 - var23.field1453) / 2;
                    var23.method1721(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field807) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2054.field1443;
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
        int var29 = Statics.field859.method1832(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method582(var30);
        if (var31.field823 == -1) {
            return;
        }
        class87 var32 = Statics.field734[var31.field823];
        if (var32 != null) {
            int var33 = (var31.field809 * 4 - var32.field1459) / 2;
            int var34 = (var31.field807 * 4 - var32.field1453) / 2;
            var32.method1721(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field807) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bv.ao(IIII)Z")
    public static final boolean method1501(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field859.method1833(Statics.field1519, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method582(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field809;
                var9 = var7.field807;
            } else {
                var8 = var7.field807;
                var9 = var7.field809;
            }
            int var10 = var7.field832;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method185(Statics.field164.field447[0], Statics.field164.field448[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method185(Statics.field164.field447[0], Statics.field164.field448[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field548 = class77.field1372;
        field562 = class77.field1373;
        field564 = 2;
        field563 = 0;
        return true;
    }

    @ObfuscatedName("w.az(IIIIZIIIIIII)Z")
    public static final boolean method185(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field629[var11][var12] = 0;
                field491[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field629[arg0][arg1] = 99;
        field491[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field518[var15] = arg0;
        int var36 = var15 + 1;
        field519[var15] = arg1;
        boolean var17 = false;
        int var18 = field518.length;
        int[][] var19 = field511[Statics.field1519].field2746;
        while (var36 != var16) {
            var13 = field518[var16];
            var14 = field519[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field511[Statics.field1519].method3167(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field511[Statics.field1519].method3168(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field511[Statics.field1519].method3169(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field491[var13][var14] + 1;
            if (var13 > 0 && field629[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field518[var36] = var13 - 1;
                field519[var36] = var14;
                var36 = (var36 + 1) % var18;
                field629[var13 - 1][var14] = 2;
                field491[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field629[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field518[var36] = var13 + 1;
                field519[var36] = var14;
                var36 = (var36 + 1) % var18;
                field629[var13 + 1][var14] = 8;
                field491[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field629[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field518[var36] = var13;
                field519[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field629[var13][var14 - 1] = 1;
                field491[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field629[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field518[var36] = var13;
                field519[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field629[var13][var14 + 1] = 4;
                field491[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field629[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field518[var36] = var13 - 1;
                field519[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field629[var13 - 1][var14 - 1] = 3;
                field491[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field629[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field518[var36] = var13 + 1;
                field519[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field629[var13 + 1][var14 - 1] = 9;
                field491[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field629[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field518[var36] = var13 - 1;
                field519[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field629[var13 - 1][var14 + 1] = 6;
                field491[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field629[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field518[var36] = var13 + 1;
                field519[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field629[var13 + 1][var14 + 1] = 12;
                field491[var13 + 1][var14 + 1] = var20;
            }
        }
        field515 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field491[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field491[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field491[var24][var25];
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
            field515 = 1;
        }
        byte var29 = 0;
        field518[var29] = var13;
        int var37 = var29 + 1;
        field519[var29] = var14;
        int var30;
        int var31 = var30 = field629[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field518[var37] = var13;
                field519[var37++] = var14;
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
            var31 = field629[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field518[var37];
            int var34 = field519[var37];
            if (arg10 == 0) {
                field493.method2256(47);
                field493.method2364(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field493.method2256(58);
                field493.method2364(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field493.method2256(147);
                field493.method2364(var32 + var32 + 3);
            }
            field493.method2400(class75.field1339[82] ? 1 : 0);
            field493.method2407(Statics.field26 + var34);
            field493.method2365(Statics.field736 + var33);
            field553 = field518[0];
            field687 = field519[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field493.method2401(field518[var37] - var33);
                field493.method2567(field519[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ay.bg(I)V")
    public static final void method697() {
        if (field497 == 51) {
            int var0 = field514.method2481();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2568;
            int var2 = (var0 & 0x7) + Statics.field286;
            int var3 = field514.method2373();
            int var4 = field514.method2481();
            int var5 = field514.method2373();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class20 var8 = new class20(var3, Statics.field1519, var6, var7, method1463(var6, var7, Statics.field1519) - var4, var5, field465);
                field591.method3271(var8);
            }
        } else if (field497 == 143) {
            int var9 = field514.method2403();
            int var10 = (var9 >> 4 & 0x7) + Statics.field2568;
            int var11 = (var9 & 0x7) + Statics.field286;
            int var12 = field514.method2403();
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = field509[var13];
            int var16 = field514.method2373();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                method1986(Statics.field1519, var10, var11, var15, var16, var13, var14, 0, -1);
            }
        } else if (field497 == 137) {
            int var17 = field514.method2412();
            int var18 = field514.method2397();
            int var19 = (var18 >> 4 & 0x7) + Statics.field2568;
            int var20 = (var18 & 0x7) + Statics.field286;
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class177 var21 = field588[Statics.field1519][var19][var20];
                if (var21 != null) {
                    for (class17 var22 = (class17) var21.method3276(); var22 != null; var22 = (class17) var21.method3278()) {
                        if ((var17 & 0x7FFF) == var22.field246) {
                            var22.method3311();
                            break;
                        }
                    }
                    if (var21.method3276() == null) {
                        field588[Statics.field1519][var19][var20] = null;
                    }
                    method1469(var19, var20);
                }
            }
        } else if (field497 == 32) {
            int var23 = field514.method2412();
            int var24 = field514.method2412();
            int var25 = field514.method2373();
            int var26 = field514.method2403();
            int var27 = (var26 >> 4 & 0x7) + Statics.field2568;
            int var28 = (var26 & 0x7) + Statics.field286;
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field580 != var25) {
                class17 var29 = new class17();
                var29.field246 = var23;
                var29.field250 = var24;
                if (field588[Statics.field1519][var27][var28] == null) {
                    field588[Statics.field1519][var27][var28] = new class177();
                }
                field588[Statics.field1519][var27][var28].method3271(var29);
                method1469(var27, var28);
            }
        } else if (field497 == 243) {
            int var30 = field514.method2397();
            int var31 = (var30 >> 4 & 0x7) + Statics.field2568;
            int var32 = (var30 & 0x7) + Statics.field286;
            int var33 = field514.method2403();
            int var34 = var33 >> 2;
            int var35 = var33 & 0x3;
            int var36 = field509[var34];
            int var37 = field514.method2412();
            if (var31 >= 0 && var32 >= 0 && var31 < 103 && var32 < 103) {
                if (var36 == 0) {
                    class96 var38 = Statics.field859.method1825(Statics.field1519, var31, var32);
                    if (var38 != null) {
                        int var39 = var38.field1590 >> 14 & 0x7FFF;
                        if (var34 == 2) {
                            var38.field1588 = new class14(var39, 2, var35 + 4, Statics.field1519, var31, var32, var37, false, var38.field1588);
                            var38.field1583 = new class14(var39, 2, var35 + 1 & 0x3, Statics.field1519, var31, var32, var37, false, var38.field1583);
                        } else {
                            var38.field1588 = new class14(var39, var34, var35, Statics.field1519, var31, var32, var37, false, var38.field1588);
                        }
                    }
                }
                if (var36 == 1) {
                    class108 var40 = Statics.field859.method1826(Statics.field1519, var31, var32);
                    if (var40 != null) {
                        int var41 = var40.field1786 >> 14 & 0x7FFF;
                        if (var34 == 4 || var34 == 5) {
                            var40.field1781 = new class14(var41, 4, var35, Statics.field1519, var31, var32, var37, false, var40.field1781);
                        } else if (var34 == 6) {
                            var40.field1781 = new class14(var41, 4, var35 + 4, Statics.field1519, var31, var32, var37, false, var40.field1781);
                        } else if (var34 == 7) {
                            var40.field1781 = new class14(var41, 4, (var35 + 2 & 0x3) + 4, Statics.field1519, var31, var32, var37, false, var40.field1781);
                        } else if (var34 == 8) {
                            var40.field1781 = new class14(var41, 4, var35 + 4, Statics.field1519, var31, var32, var37, false, var40.field1781);
                            var40.field1785 = new class14(var41, 4, (var35 + 2 & 0x3) + 4, Statics.field1519, var31, var32, var37, false, var40.field1785);
                        }
                    }
                }
                if (var36 == 2) {
                    class98 var42 = Statics.field859.method1827(Statics.field1519, var31, var32);
                    if (var34 == 11) {
                        var34 = 10;
                    }
                    if (var42 != null) {
                        var42.field1612 = new class14(var42.field1620 >> 14 & 0x7FFF, var34, var35, Statics.field1519, var31, var32, var37, false, var42.field1612);
                    }
                }
                if (var36 == 3) {
                    class107 var43 = Statics.field859.method1816(Statics.field1519, var31, var32);
                    if (var43 != null) {
                        var43.field1774 = new class14(var43.field1771 >> 14 & 0x7FFF, 22, var35, Statics.field1519, var31, var32, var37, false, var43.field1774);
                    }
                }
            }
        } else if (field497 == 203) {
            int var44 = field514.method2403();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field509[var45];
            int var48 = field514.method2397();
            int var49 = (var48 >> 4 & 0x7) + Statics.field2568;
            int var50 = (var48 & 0x7) + Statics.field286;
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                method1986(Statics.field1519, var49, var50, var47, -1, var45, var46, 0, -1);
            }
        } else if (field497 == 107) {
            int var51 = field514.method2481();
            int var52 = (var51 >> 4 & 0x7) + Statics.field2568;
            int var53 = (var51 & 0x7) + Statics.field286;
            int var54 = field514.method2373();
            int var55 = field514.method2373();
            int var56 = field514.method2373();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                class177 var57 = field588[Statics.field1519][var52][var53];
                if (var57 != null) {
                    for (class17 var58 = (class17) var57.method3276(); var58 != null; var58 = (class17) var57.method3278()) {
                        if ((var54 & 0x7FFF) == var58.field246 && var58.field250 == var55) {
                            var58.field250 = var56;
                            break;
                        }
                    }
                    method1469(var52, var53);
                }
            }
        } else {
            if (field497 == 144) {
                int var59 = field514.method2481();
                int var60 = (var59 >> 4 & 0x7) + Statics.field2568;
                int var61 = (var59 & 0x7) + Statics.field286;
                int var62 = field514.method2373();
                int var63 = field514.method2481();
                int var64 = var63 >> 4 & 0xF;
                int var65 = var63 & 0x7;
                int var66 = field514.method2481();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    int var67 = var64 + 1;
                    if (Statics.field164.field447[0] >= var60 - var67 && Statics.field164.field447[0] <= var60 + var67 && Statics.field164.field448[0] >= var61 - var67 && Statics.field164.field448[0] <= var61 + var67 && field693 != 0 && var65 > 0 && field694 < 50) {
                        field533[field694] = var62;
                        field696[field694] = var65;
                        field463[field694] = var66;
                        field565[field694] = null;
                        field626[field694] = (var60 << 16) + (var61 << 8) + var64;
                        field694++;
                    }
                }
            }
            if (field497 == 56) {
                int var68 = field514.method2411();
                byte var69 = field514.method2379();
                byte var70 = field514.method2405();
                int var71 = field514.method2373();
                int var72 = field514.method2410();
                byte var73 = field514.method2394();
                int var74 = field514.method2481();
                int var75 = (var74 >> 4 & 0x7) + Statics.field2568;
                int var76 = (var74 & 0x7) + Statics.field286;
                int var77 = field514.method2481();
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = field509[var78];
                int var81 = field514.method2373();
                byte var82 = field514.method2405();
                class3 var83;
                if (field580 == var68) {
                    var83 = Statics.field164;
                } else {
                    var83 = field486[var68];
                }
                if (var83 != null) {
                    class32 var84 = class32.method582(var72);
                    int var85;
                    int var86;
                    if (var79 == 1 || var79 == 3) {
                        var85 = var84.field807;
                        var86 = var84.field809;
                    } else {
                        var85 = var84.field809;
                        var86 = var84.field807;
                    }
                    int var87 = (var85 >> 1) + var75;
                    int var88 = (var85 + 1 >> 1) + var75;
                    int var89 = (var86 >> 1) + var76;
                    int var90 = (var86 + 1 >> 1) + var76;
                    int[][] var91 = class9.field127[Statics.field1519];
                    int var92 = var91[var87][var89] + var91[var88][var89] + var91[var87][var90] + var91[var88][var90] >> 2;
                    int var93 = (var75 << 7) + (var85 << 6);
                    int var94 = (var76 << 7) + (var86 << 6);
                    class112 var95 = var84.method606(var78, var79, var91, var93, var92, var94);
                    if (var95 != null) {
                        method1986(Statics.field1519, var75, var76, var80, -1, 0, 0, var81 + 1, var71 + 1);
                        var83.field37 = field465 + var81;
                        var83.field39 = field465 + var71;
                        var83.field42 = var95;
                        var83.field34 = var75 * 128 + var85 * 64;
                        var83.field41 = var76 * 128 + var86 * 64;
                        var83.field40 = var92;
                        if (var70 > var69) {
                            byte var96 = var70;
                            var70 = var69;
                            var69 = var96;
                        }
                        if (var82 > var73) {
                            byte var97 = var82;
                            var82 = var73;
                            var73 = var97;
                        }
                        var83.field47 = var70 + var75;
                        var83.field45 = var69 + var75;
                        var83.field44 = var76 + var82;
                        var83.field46 = var73 + var76;
                    }
                }
            }
            if (field497 == 238) {
                int var98 = field514.method2481();
                int var99 = (var98 >> 4 & 0x7) + Statics.field2568;
                int var100 = (var98 & 0x7) + Statics.field286;
                int var101 = field514.method2412();
                int var102 = field514.method2373();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    class17 var103 = new class17();
                    var103.field246 = var101;
                    var103.field250 = var102;
                    if (field588[Statics.field1519][var99][var100] == null) {
                        field588[Statics.field1519][var99][var100] = new class177();
                    }
                    field588[Statics.field1519][var99][var100].method3271(var103);
                    method1469(var99, var100);
                }
            } else if (field497 == 163) {
                int var104 = field514.method2481();
                int var105 = (var104 >> 4 & 0x7) + Statics.field2568;
                int var106 = (var104 & 0x7) + Statics.field286;
                int var107 = var105 + field514.method2379();
                int var108 = var106 + field514.method2379();
                int var109 = field514.method2381();
                int var110 = field514.method2373();
                int var111 = field514.method2481() * 4;
                int var112 = field514.method2481() * 4;
                int var113 = field514.method2373();
                int var114 = field514.method2373();
                int var115 = field514.method2481();
                int var116 = field514.method2481();
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
                    int var117 = var105 * 128 + 64;
                    int var118 = var106 * 128 + 64;
                    int var119 = var107 * 128 + 64;
                    int var120 = var108 * 128 + 64;
                    class10 var121 = new class10(var110, Statics.field1519, var117, var118, method1463(var117, var118, Statics.field1519) - var111, field465 + var113, field465 + var114, var115, var116, var109, var112);
                    var121.method84(var119, var120, method1463(var119, var120, Statics.field1519) - var112, field465 + var113);
                    field681.method3271(var121);
                }
            }
        }
    }

    @ObfuscatedName("cs.bd(IIIIIIIIII)V")
    public static final void method1986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field473.method3276(); var10 != null; var10 = (class22) field473.method3278()) {
            if (var10.field343 == arg0 && var10.field344 == arg1 && var10.field329 == arg2 && var10.field327 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field343 = arg0;
            var9.field327 = arg3;
            var9.field344 = arg1;
            var9.field329 = arg2;
            method2543(var9);
            field473.method3271(var9);
        }
        var9.field333 = arg4;
        var9.field335 = arg5;
        var9.field334 = arg6;
        var9.field336 = arg7;
        var9.field337 = arg8;
    }

    @ObfuscatedName("df.bo(Lf;I)V")
    public static final void method2543(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field327 == 0) {
            var1 = Statics.field859.method1829(arg0.field343, arg0.field344, arg0.field329);
        }
        if (arg0.field327 == 1) {
            var1 = Statics.field859.method1830(arg0.field343, arg0.field344, arg0.field329);
        }
        if (arg0.field327 == 2) {
            var1 = Statics.field859.method1831(arg0.field343, arg0.field344, arg0.field329);
        }
        if (arg0.field327 == 3) {
            var1 = Statics.field859.method1832(arg0.field343, arg0.field344, arg0.field329);
        }
        if (var1 != 0) {
            int var5 = Statics.field859.method1833(arg0.field343, arg0.field344, arg0.field329, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field330 = var2;
        arg0.field332 = var3;
        arg0.field331 = var4;
    }

    @ObfuscatedName("bx.by(I)V")
    public static final void method1255() {
        for (class22 var0 = (class22) field473.method3276(); var0 != null; var0 = (class22) field473.method3278()) {
            if (var0.field337 > 0) {
                var0.field337--;
            }
            if (var0.field337 == 0) {
                if (var0.field330 >= 0) {
                    int var1 = var0.field330;
                    int var2 = var0.field332;
                    class32 var3 = class32.method582(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method615(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method140(var0.field343, var0.field327, var0.field344, var0.field329, var0.field330, var0.field331, var0.field332);
                var0.method3311();
            } else {
                if (var0.field336 > 0) {
                    var0.field336--;
                }
                if (var0.field336 == 0 && var0.field344 >= 1 && var0.field329 >= 1 && var0.field344 <= 102 && var0.field329 <= 102) {
                    if (var0.field333 >= 0) {
                        int var5 = var0.field333;
                        int var6 = var0.field335;
                        class32 var7 = class32.method582(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method615(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method140(var0.field343, var0.field327, var0.field344, var0.field329, var0.field333, var0.field334, var0.field335);
                    var0.field336 = -1;
                    if (var0.field333 == var0.field330 && var0.field330 == -1) {
                        var0.method3311();
                    } else if (var0.field333 == var0.field330 && var0.field334 == var0.field331 && var0.field335 == var0.field332) {
                        var0.method3311();
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.bk(IIIIIIII)V")
    public static final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field597 && Statics.field1519 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field859.method1829(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field859.method1830(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field859.method1831(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field859.method1832(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field859.method1833(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field859.method1869(arg0, arg2, arg3);
                class32 var15 = class32.method582(var12);
                if (var15.field811 != 0) {
                    field511[arg0].method3195(arg2, arg3, var13, var14, var15.field806);
                }
            }
            if (arg1 == 1) {
                Statics.field859.method1822(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field859.method1961(arg0, arg2, arg3);
                class32 var16 = class32.method582(var12);
                if (var16.field809 + arg2 > 103 || var16.field809 + arg3 > 103 || var16.field807 + arg2 > 103 || var16.field807 + arg3 > 103) {
                    return;
                }
                if (var16.field811 != 0) {
                    field511[arg0].method3159(arg2, arg3, var16.field809, var16.field807, var14, var16.field806);
                }
            }
            if (arg1 == 3) {
                Statics.field859.method1823(arg0, arg2, arg3);
                class32 var17 = class32.method582(var12);
                if (var17.field811 == 1) {
                    field511[arg0].method3196(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field112[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class95 var19 = Statics.field859;
        class164 var20 = field511[arg0];
        class32 var21 = class32.method582(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field807;
            var23 = var21.field809;
        } else {
            var22 = var21.field809;
            var23 = var21.field807;
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
        int[][] var28 = class9.field127[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field813 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field835 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class94 var34;
            if (var21.field833 == -1 && var21.field828 == null) {
                var34 = var21.method606(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1809(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field811 == 1) {
                var20.method3161(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var57;
            if (var21.field833 == -1 && var21.field828 == null) {
                var57 = var21.method606(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            if (var57 != null) {
                var19.method1835(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field811 != 0) {
                var20.method3175(arg2, arg3, var22, var23, var21.field806);
            }
        } else if (arg6 >= 12) {
            class94 var35;
            if (var21.field833 == -1 && var21.field828 == null) {
                var35 = var21.method606(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1835(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3175(arg2, arg3, var22, var23, var21.field806);
            }
        } else if (arg6 == 0) {
            class94 var36;
            if (var21.field833 == -1 && var21.field828 == null) {
                var36 = var21.method606(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1811(arg0, arg2, arg3, var29, var36, (class94) null, class9.field117[arg5], 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3158(arg2, arg3, arg6, arg5, var21.field806);
            }
        } else if (arg6 == 1) {
            class94 var37;
            if (var21.field833 == -1 && var21.field828 == null) {
                var37 = var21.method606(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1811(arg0, arg2, arg3, var29, var37, (class94) null, class9.field118[arg5], 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3158(arg2, arg3, arg6, arg5, var21.field806);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class94 var39;
            class94 var40;
            if (var21.field833 == -1 && var21.field828 == null) {
                var39 = var21.method606(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method606(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1811(arg0, arg2, arg3, var29, var39, var40, class9.field117[arg5], class9.field117[var38], var32, var33);
            if (var21.field811 != 0) {
                var20.method3158(arg2, arg3, arg6, arg5, var21.field806);
            }
        } else if (arg6 == 3) {
            class94 var41;
            if (var21.field833 == -1 && var21.field828 == null) {
                var41 = var21.method606(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1811(arg0, arg2, arg3, var29, var41, (class94) null, class9.field118[arg5], 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3158(arg2, arg3, arg6, arg5, var21.field806);
            }
        } else if (arg6 == 9) {
            class94 var42;
            if (var21.field833 == -1 && var21.field828 == null) {
                var42 = var21.method606(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1835(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3175(arg2, arg3, var22, var23, var21.field806);
            }
        } else if (arg6 == 4) {
            class94 var43;
            if (var21.field833 == -1 && var21.field828 == null) {
                var43 = var21.method606(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1812(arg0, arg2, arg3, var29, var43, (class94) null, class9.field117[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1829(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class32.method582(var45 >> 14 & 0x7FFF).field818;
            }
            class94 var46;
            if (var21.field833 == -1 && var21.field828 == null) {
                var46 = var21.method606(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1812(arg0, arg2, arg3, var29, var46, (class94) null, class9.field117[arg5], 0, class9.field124[arg5] * var44, class9.field111[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1829(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class32.method582(var48 >> 14 & 0x7FFF).field818 / 2;
            }
            class94 var49;
            if (var21.field833 == -1 && var21.field828 == null) {
                var49 = var21.method606(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1812(arg0, arg2, arg3, var29, var49, (class94) null, 256, arg5, class9.field121[arg5] * var47, class9.field113[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class94 var51;
            if (var21.field833 == -1 && var21.field828 == null) {
                var51 = var21.method606(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1812(arg0, arg2, arg3, var29, var51, (class94) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1829(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class32.method582(var53 >> 14 & 0x7FFF).field818 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class94 var55;
            class94 var56;
            if (var21.field833 == -1 && var21.field828 == null) {
                var55 = var21.method606(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method606(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field833, true, (class94) null);
            }
            var19.method1812(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field121[arg5] * var52, class9.field113[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("bt.be(III)V")
    public static final void method1469(int arg0, int arg1) {
        class177 var2 = field588[Statics.field1519][arg0][arg1];
        if (var2 == null) {
            Statics.field859.method1824(Statics.field1519, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3276(); var5 != null; var5 = (class17) var2.method3278()) {
            class40 var6 = Statics.method1799(var5.field246);
            int var7 = var6.field993;
            if (var6.field981 == 1) {
                var7 = (var5.field250 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field859.method1824(Statics.field1519, arg0, arg1);
            return;
        }
        var2.method3272(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3276(); var10 != null; var10 = (class17) var2.method3278()) {
            if (var4.field246 != var10.field246) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field246 != var10.field246 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field859.method1937(Statics.field1519, arg0, arg1, method1463(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1519), var4, var11, var8, var9);
    }

    @ObfuscatedName("z.bc(S)V")
    public static final void method146() {
        field514.method2258();
        int var0 = field514.method2268(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field514.method2268(2);
        if (var1 == 0) {
            field578[++field545 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field514.method2268(3);
            Statics.field164.method215(var2, false);
            int var3 = field514.method2268(1);
            if (var3 == 1) {
                field578[++field545 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field514.method2268(3);
            Statics.field164.method215(var4, true);
            int var5 = field514.method2268(3);
            Statics.field164.method215(var5, true);
            int var6 = field514.method2268(1);
            if (var6 == 1) {
                field578[++field545 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field514.method2268(1);
            if (var7 == 1) {
                field578[++field545 - 1] = 2047;
            }
            Statics.field1519 = field514.method2268(2);
            int var8 = field514.method2268(7);
            int var9 = field514.method2268(7);
            int var10 = field514.method2268(1);
            Statics.field164.method207(var9, var8, var10 == 1);
        }
    }

    @ObfuscatedName("p.bl(I)V")
    public static final void method95() {
        for (int var0 = 0; var0 < field545; var0++) {
            int var1 = field578[var0];
            class3 var2 = field486[var1];
            int var3 = field514.method2481();
            if ((var3 & 0x4) != 0) {
                var3 += field514.method2481() << 8;
            }
            method33(var1, var2, var3);
        }
    }

    @ObfuscatedName("k.ba(ILu;II)V")
    public static final void method33(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x100) != 0) {
            arg1.field398 = field514.method2373();
            int var3 = field514.method2383();
            arg1.field433 = var3 >> 16;
            arg1.field441 = (var3 & 0xFFFF) + field465;
            arg1.field430 = 0;
            arg1.field431 = 0;
            if (arg1.field441 > field465) {
                arg1.field430 = -1;
            }
            if (arg1.field398 == 65535) {
                arg1.field398 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var4 = field514.method2410();
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = field514.method2403();
            method2153(arg1, var4, var5);
        }
        if ((arg2 & 0x400) != 0) {
            int var6 = field514.method2481();
            int var7 = field514.method2397();
            arg1.method209(var6, var7, field465);
            arg1.field415 = field465 + 300;
            arg1.field416 = field514.method2397();
            arg1.field417 = field514.method2403();
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field408 = field514.method2386();
            if (arg1.field408.charAt(0) == '~') {
                arg1.field408 = arg1.field408.substring(1);
                method91(2, arg1.field33, arg1.field408);
            } else if (Statics.field164 == arg1) {
                method91(2, arg1.field33, arg1.field408);
            }
            arg1.field410 = 0;
            arg1.field411 = 0;
            arg1.field409 = 150;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field434 = field514.method2403();
            arg1.field443 = field514.method2481();
            arg1.field435 = field514.method2403();
            arg1.field437 = field514.method2403();
            arg1.field438 = field514.method2410() + field465;
            arg1.field439 = field514.method2373() + field465;
            arg1.field440 = field514.method2481();
            arg1.field442 = 1;
            arg1.field451 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            int var8 = field514.method2373();
            int var9 = field514.method2404();
            int var10 = field514.method2397();
            int var11 = field514.field2016;
            if (arg1.field33 != null && arg1.field31 != null) {
                boolean var12 = false;
                if (var9 <= 1 && method202(arg1.field33)) {
                    var12 = true;
                }
                if (!var12 && field573 == 0) {
                    field481.field2016 = 0;
                    field514.method2460(field481.field2015, 0, var10);
                    field481.field2016 = 0;
                    class126 var13 = field481;
                    String var14 = class184.method2160(var13, 32767);
                    String var15 = class185.method3346(class147.method1316(var14));
                    arg1.field408 = var15.trim();
                    arg1.field410 = var8 >> 8;
                    arg1.field411 = var8 & 0xFF;
                    arg1.field409 = 150;
                    if (var9 == 2 || var9 == 3) {
                        method91(1, class2.method2633(1) + arg1.field33, var15);
                    } else if (var9 == 1) {
                        method91(1, class2.method2633(0) + arg1.field33, var15);
                    } else {
                        method91(2, arg1.field33, var15);
                    }
                }
            }
            field514.field2016 = var10 + var11;
        }
        if ((arg2 & 0x40) != 0) {
            int var16 = field514.method2403();
            byte[] var17 = new byte[var16];
            class126 var18 = new class126(var17);
            field514.method2460(var17, 0, var16);
            field579[arg0] = var18;
            arg1.method17(var18);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field418 = field514.method2410();
            if (arg1.field418 == 65535) {
                arg1.field418 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field419 = field514.method2411();
            arg1.field405 = field514.method2411();
        }
        if ((arg2 & 0x8) == 0) {
            return;
        }
        int var19 = field514.method2404();
        int var20 = field514.method2481();
        arg1.method209(var19, var20, field465);
        arg1.field415 = field465 + 300;
        arg1.field416 = field514.method2397();
        arg1.field417 = field514.method2397();
    }

    @ObfuscatedName("au.bx(I)V")
    public static final void method525() {
        field582 = 0;
        field545 = 0;
        field514.method2258();
        int var0 = field514.method2268(8);
        if (var0 < field484) {
            for (int var1 = var0; var1 < field484; var1++) {
                field583[++field582 - 1] = field492[var1];
            }
        }
        if (var0 > field484) {
            throw new RuntimeException("");
        }
        field484 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field492[var2];
            class25 var4 = field490[var3];
            int var5 = field514.method2268(1);
            if (var5 == 0) {
                field492[++field484 - 1] = var3;
                var4.field446 = field465;
            } else {
                int var6 = field514.method2268(2);
                if (var6 == 0) {
                    field492[++field484 - 1] = var3;
                    var4.field446 = field465;
                    field578[++field545 - 1] = var3;
                } else if (var6 == 1) {
                    field492[++field484 - 1] = var3;
                    var4.field446 = field465;
                    int var7 = field514.method2268(3);
                    var4.method215(var7, false);
                    int var8 = field514.method2268(1);
                    if (var8 == 1) {
                        field578[++field545 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field492[++field484 - 1] = var3;
                    var4.field446 = field465;
                    int var9 = field514.method2268(3);
                    var4.method215(var9, true);
                    int var10 = field514.method2268(3);
                    var4.method215(var10, true);
                    int var11 = field514.method2268(1);
                    if (var11 == 1) {
                        field578[++field545 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field583[++field582 - 1] = var3;
                }
            }
        }
        while (field514.method2261(field496) >= 27) {
            int var12 = field514.method2268(15);
            if (var12 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field490[var12] == null) {
                field490[var12] = new class25();
                var16 = true;
            }
            class25 var17 = field490[var12];
            field492[++field484 - 1] = var12;
            var17.field446 = field465;
            var17.field374 = class31.method1792(field514.method2268(14));
            int var18 = field514.method2268(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field514.method2268(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field514.method2268(1);
            int var21 = field514.method2268(1);
            if (var21 == 1) {
                field578[++field545 - 1] = var12;
            }
            int var22 = field587[field514.method2268(3)];
            if (var16) {
                var17.field395 = var17.field397 = var22;
            }
            var17.field399 = var17.field374.field792;
            var17.field445 = var17.field374.field763;
            if (var17.field445 == 0) {
                var17.field397 = 0;
            }
            var17.field403 = var17.field374.field773;
            var17.field429 = var17.field374.field769;
            var17.field413 = var17.field374.field771;
            var17.field406 = var17.field374.field772;
            var17.field453 = var17.field374.field766;
            var17.field401 = var17.field374.field762;
            var17.field402 = var17.field374.field768;
            var17.method207(Statics.field164.field447[0] + var19, Statics.field164.field448[0] + var18, var20 == 1);
        }
        field514.method2260();
        method555();
        for (int var13 = 0; var13 < field582; var13++) {
            int var14 = field583[var13];
            if (field465 != field490[var14].field446) {
                field490[var14].field374 = null;
                field490[var14] = null;
            }
        }
        if (field496 != field514.field2016) {
            throw new RuntimeException(field514.field2016 + class2.field15 + field496);
        }
        for (int var15 = 0; var15 < field484; var15++) {
            if (field490[field492[var15]] == null) {
                throw new RuntimeException(var15 + class2.field15 + field484);
            }
        }
    }

    @ObfuscatedName("ag.bq(I)V")
    public static final void method555() {
        for (int var0 = 0; var0 < field545; var0++) {
            int var1 = field578[var0];
            class25 var2 = field490[var1];
            int var3 = field514.method2481();
            if ((var3 & 0x1) != 0) {
                int var4 = field514.method2397();
                int var5 = field514.method2481();
                var2.method209(var4, var5, field465);
                var2.field415 = field465 + 300;
                var2.field416 = field514.method2403();
                var2.field417 = field514.method2404();
            }
            if ((var3 & 0x40) != 0) {
                var2.field418 = field514.method2412();
                if (var2.field418 == 65535) {
                    var2.field418 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field419 = field514.method2411();
                var2.field405 = field514.method2410();
            }
            if ((var3 & 0x80) != 0) {
                var2.field374 = class31.method1792(field514.method2373());
                var2.field399 = var2.field374.field792;
                var2.field445 = var2.field374.field763;
                var2.field403 = var2.field374.field773;
                var2.field429 = var2.field374.field769;
                var2.field413 = var2.field374.field771;
                var2.field406 = var2.field374.field772;
                var2.field453 = var2.field374.field766;
                var2.field401 = var2.field374.field762;
                var2.field402 = var2.field374.field768;
            }
            if ((var3 & 0x8) != 0) {
                var2.field398 = field514.method2373();
                int var6 = field514.method2421();
                var2.field433 = var6 >> 16;
                var2.field441 = (var6 & 0xFFFF) + field465;
                var2.field430 = 0;
                var2.field431 = 0;
                if (var2.field441 > field465) {
                    var2.field430 = -1;
                }
                if (var2.field398 == 65535) {
                    var2.field398 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field408 = field514.method2386();
                var2.field409 = 100;
            }
            if ((var3 & 0x2) != 0) {
                int var7 = field514.method2410();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field514.method2404();
                if (var2.field424 == var7 && var7 != -1) {
                    int var9 = class34.method30(var7).field868;
                    if (var9 == 1) {
                        var2.field425 = 0;
                        var2.field426 = 0;
                        var2.field427 = var8;
                        var2.field422 = 0;
                    }
                    if (var9 == 2) {
                        var2.field422 = 0;
                    }
                } else if (var7 == -1 || var2.field424 == -1 || class34.method30(var7).field870 >= class34.method30(var2.field424).field870) {
                    var2.field424 = var7;
                    var2.field425 = 0;
                    var2.field426 = 0;
                    var2.field427 = var8;
                    var2.field422 = 0;
                    var2.field451 = var2.field442;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var10 = field514.method2397();
                int var11 = field514.method2397();
                var2.method209(var10, var11, field465);
                var2.field415 = field465 + 300;
                var2.field416 = field514.method2404();
                var2.field417 = field514.method2397();
            }
        }
    }

    @ObfuscatedName("aa.bu(B)V")
    public static final void method749() {
        int var0 = Statics.field899;
        int var1 = Statics.field1287;
        int var2 = Statics.field1408;
        int var3 = Statics.field155;
        int var4 = 6116423;
        class89.method1728(var0, var1, var2, var3, var4);
        class89.method1728(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class89.method1733(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1621.method3415(class134.field2212, var0 + 3, var1 + 14, var4, -1);
        int var5 = class77.field1365;
        int var6 = class77.field1366;
        for (int var7 = 0; var7 < field590; var7++) {
            int var8 = (field590 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1621.method3415(Statics.method2402(var7), var0 + 3, var8, var9, 0);
        }
        method2911(Statics.field899, Statics.field1287, Statics.field1408, Statics.field155);
    }

    @ObfuscatedName("x.bz(IIIIS)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field655; var4++) {
            if (field662[var4] + field660[var4] > arg0 && field660[var4] < arg0 + arg2 && field663[var4] + field661[var4] > arg1 && field661[var4] < arg1 + arg3) {
                field657[var4] = true;
            }
        }
    }

    @ObfuscatedName("ew.bw(IIIII)V")
    public static final void method2911(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field655; var4++) {
            if (field662[var4] + field660[var4] > arg0 && field660[var4] < arg0 + arg2 && field663[var4] + field661[var4] > arg1 && field661[var4] < arg1 + arg3) {
                field648[var4] = true;
            }
        }
    }

    @ObfuscatedName("bx.br(B)V")
    public static final void method1250() {
        int var0 = Statics.field1621.method3361(class134.field2212);
        for (int var1 = 0; var1 < field590; var1++) {
            int var2 = Statics.field1621.method3361(Statics.method2402(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field590 * 15 + 21;
        int var4 = class77.field1372 - var0 / 2;
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
        Statics.field899 = var4;
        Statics.field1287 = var5;
        Statics.field1408 = var0;
        Statics.field155 = field590 * 15 + 22;
    }

    @ObfuscatedName("bh.bf(II)Z")
    public static final boolean method1340(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field600[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dj.bi(IB)V")
    public static final void method2154(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field598[arg0];
        int var2 = field599[arg0];
        int var3 = field600[arg0];
        int var4 = field601[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 32) {
            field493.method2256(85);
            field493.method2417(var2);
            field493.method2365(var1);
            field493.method2417(Statics.field1991);
            field493.method2365(var4);
            field493.method2409(field611);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            String var5 = field603[arg0];
            class158 var6 = class158.method2662(var2, var1);
            if (var6 != null) {
                if (var6.field2666 != null) {
                    class1 var7 = new class1();
                    var7.field9 = var6;
                    var7.field5 = var4;
                    var7.field2 = var5;
                    var7.field6 = var6.field2666;
                    class26.method116(var7);
                }
                boolean var8 = true;
                if (var6.field2613 > 0) {
                    var8 = method550(var6);
                }
                if (var8 && class162.method109(method1523(var6), var4 - 1)) {
                    if (var4 == 1) {
                        field493.method2256(203);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 2) {
                        field493.method2256(211);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 3) {
                        field493.method2256(131);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 4) {
                        field493.method2256(210);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 5) {
                        field493.method2256(106);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 6) {
                        field493.method2256(165);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 7) {
                        field493.method2256(22);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 8) {
                        field493.method2256(86);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 9) {
                        field493.method2256(126);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                    if (var4 == 10) {
                        field493.method2256(98);
                        field493.method2367(var2);
                        field493.method2365(var1);
                    }
                }
            }
        }
        if (var3 == 49) {
            class3 var9 = field486[var4];
            if (var9 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var9.field447[0], var9.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(11);
                field493.method2407(var4);
            }
        }
        if (var3 == 45) {
            class3 var10 = field486[var4];
            if (var10 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var10.field447[0], var10.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(5);
                field493.method2409(var4);
            }
        }
        if (var3 == 33) {
            field493.method2256(250);
            field493.method2417(var2);
            field493.method2409(var1);
            field493.method2408(var4);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 10) {
            class25 var11 = field490[var4];
            if (var11 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var11.field447[0], var11.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(156);
                field493.method2409(var4);
            }
        }
        if (var3 == 30 && field618 == null) {
            field493.method2256(64);
            field493.method2419(var2);
            field493.method2409(var1);
            field618 = class158.method2662(var2, var1);
            method186(field618);
        }
        if (var3 == 40) {
            field493.method2256(155);
            field493.method2407(var1);
            field493.method2417(var2);
            field493.method2408(var4);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 19) {
            boolean var12 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var12) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(196);
            field493.method2408(Statics.field736 + var1);
            field493.method2408(Statics.field26 + var2);
            field493.method2409(var4);
        }
        if (var3 == 17) {
            boolean var14 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var14) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(224);
            field493.method2365(Statics.field26 + var2);
            field493.method2409(Statics.field736 + var1);
            field493.method2417(Statics.field1991);
            field493.method2409(field611);
            field493.method2409(var4);
        }
        if (var3 == 12) {
            class25 var16 = field490[var4];
            if (var16 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var16.field447[0], var16.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(249);
                field493.method2407(var4);
            }
        }
        if (var3 == 2 && method1501(var1, var2, var4)) {
            field493.method2256(107);
            field493.method2409(Statics.field736 + var1);
            field493.method2407(var4 >> 14 & 0x7FFF);
            field493.method2365(field611);
            field493.method2409(Statics.field26 + var2);
            field493.method2417(Statics.field1991);
        }
        if (var3 == 1004) {
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(239);
            field493.method2407(var4);
        }
        if (var3 == 58) {
            field493.method2256(20);
            field493.method2365(field611);
            field493.method2419(Statics.field1991);
            field493.method2365(var1);
            field493.method2367(var2);
        }
        if (var3 == 22) {
            boolean var17 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var17) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(55);
            field493.method2365(Statics.field736 + var1);
            field493.method2365(Statics.field26 + var2);
            field493.method2407(var4);
        }
        if (var3 == 3) {
            method1501(var1, var2, var4);
            field493.method2256(10);
            field493.method2365(Statics.field736 + var1);
            field493.method2407(Statics.field26 + var2);
            field493.method2408(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 25) {
            class158 var19 = class158.method2662(var2, var1);
            if (var19 != null) {
                method180();
                int var22 = method1523(var19);
                int var23 = var22 >> 11 & 0x3F;
                method198(var2, var1, var23);
                field608 = 0;
                int var24 = method1523(var19);
                int var25 = var24 >> 11 & 0x3F;
                String var26;
                if (var25 == 0) {
                    var26 = null;
                } else if (var19.field2694 == null || var19.field2694.trim().length() == 0) {
                    var26 = null;
                } else {
                    var26 = var19.field2694;
                }
                field612 = var26;
                if (field612 == null) {
                    field612 = "Null";
                }
                if (var19.field2578) {
                    field567 = var19.field2620 + Statics.method2628(16777215);
                } else {
                    field567 = Statics.method2628(65280) + var19.field2679 + Statics.method2628(16777215);
                }
            }
            return;
        }
        if (var3 == 21) {
            boolean var27 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var27) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(133);
            field493.method2409(var4);
            field493.method2409(Statics.field736 + var1);
            field493.method2365(Statics.field26 + var2);
        }
        if (var3 == 37) {
            field493.method2256(122);
            field493.method2407(var4);
            field493.method2407(var1);
            field493.method2367(var2);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 14) {
            class3 var29 = field486[var4];
            if (var29 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var29.field447[0], var29.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(51);
                field493.method2417(Statics.field262);
                field493.method2365(Statics.field171);
                field493.method2408(Statics.field347);
                field493.method2408(var4);
            }
        }
        if (var3 == 23) {
            Statics.field859.method1904(Statics.field1519, var1, var2);
        }
        if (var3 == 4) {
            method1501(var1, var2, var4);
            field493.method2256(183);
            field493.method2409(var4 >> 14 & 0x7FFF);
            field493.method2365(Statics.field736 + var1);
            field493.method2408(Statics.field26 + var2);
        }
        if (var3 == 8) {
            class25 var30 = field490[var4];
            if (var30 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var30.field447[0], var30.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(177);
                field493.method2419(Statics.field1991);
                field493.method2407(var4);
                field493.method2365(field611);
            }
        }
        if (var3 == 28) {
            field493.method2256(222);
            field493.method2367(var2);
            class158 var31 = class158.method1612(var2);
            if (var31.field2583 != null && var31.field2583[0][0] == 5) {
                int var32 = var31.field2583[0][1];
                class159.field2700[var32] = 1 - class159.field2700[var32];
                method104(var32);
            }
        }
        if (var3 == 5) {
            method1501(var1, var2, var4);
            field493.method2256(246);
            field493.method2407(var4 >> 14 & 0x7FFF);
            field493.method2407(Statics.field736 + var1);
            field493.method2408(Statics.field26 + var2);
        }
        if (var3 == 44) {
            class3 var33 = field486[var4];
            if (var33 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var33.field447[0], var33.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(251);
                field493.method2409(var4);
            }
        }
        if (var3 == 24) {
            class158 var34 = class158.method1612(var2);
            boolean var35 = true;
            if (var34.field2613 > 0) {
                var35 = method550(var34);
            }
            if (var35) {
                field493.method2256(222);
                field493.method2367(var2);
            }
        }
        if (var3 == 47) {
            class3 var36 = field486[var4];
            if (var36 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var36.field447[0], var36.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(79);
                field493.method2408(var4);
            }
        }
        if (var3 == 35) {
            field493.method2256(202);
            field493.method2407(var4);
            field493.method2367(var2);
            field493.method2409(var1);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 11) {
            class25 var37 = field490[var4];
            if (var37 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var37.field447[0], var37.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(245);
                field493.method2365(var4);
            }
        }
        if (var3 == 48) {
            class3 var38 = field486[var4];
            if (var38 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var38.field447[0], var38.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(115);
                field493.method2408(var4);
            }
        }
        if (var3 == 41) {
            field493.method2256(56);
            field493.method2409(var4);
            field493.method2365(var1);
            field493.method2418(var2);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 7) {
            class25 var39 = field490[var4];
            if (var39 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var39.field447[0], var39.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(199);
                field493.method2407(var4);
                field493.method2365(Statics.field171);
                field493.method2419(Statics.field262);
                field493.method2407(Statics.field347);
            }
        }
        if (var3 == 16) {
            boolean var40 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var40) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(164);
            field493.method2408(Statics.field736 + var1);
            field493.method2409(Statics.field171);
            field493.method2365(Statics.field26 + var2);
            field493.method2418(Statics.field262);
            field493.method2407(Statics.field347);
            field493.method2365(var4);
        }
        if (var3 == 50) {
            class3 var42 = field486[var4];
            if (var42 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var42.field447[0], var42.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(23);
                field493.method2407(var4);
            }
        }
        if (var3 == 46) {
            class3 var43 = field486[var4];
            if (var43 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var43.field447[0], var43.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(65);
                field493.method2408(var4);
            }
        }
        if (var3 == 1 && method1501(var1, var2, var4)) {
            field493.method2256(53);
            field493.method2407(Statics.field736 + var1);
            field493.method2409(Statics.field347);
            field493.method2418(Statics.field262);
            field493.method2365(var4 >> 14 & 0x7FFF);
            field493.method2407(Statics.field171);
            field493.method2407(Statics.field26 + var2);
        }
        if (var3 == 13) {
            class25 var44 = field490[var4];
            if (var44 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var44.field447[0], var44.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(12);
                field493.method2407(var4);
            }
        }
        if (var3 == 15) {
            class3 var45 = field486[var4];
            if (var45 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var45.field447[0], var45.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(206);
                field493.method2365(var4);
                field493.method2409(field611);
                field493.method2417(Statics.field1991);
            }
        }
        if (var3 == 42) {
            field493.method2256(82);
            field493.method2365(var4);
            field493.method2408(var1);
            field493.method2419(var2);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 43) {
            field493.method2256(54);
            field493.method2418(var2);
            field493.method2407(var1);
            field493.method2407(var4);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 38) {
            method180();
            class158 var46 = class158.method1612(var2);
            field608 = 1;
            Statics.field171 = var1;
            Statics.field262 = var2;
            Statics.field347 = var4;
            method186(var46);
            field609 = Statics.method2628(16748608) + Statics.method1799(var4).field970 + Statics.method2628(16777215);
            if (field609 == null) {
                field609 = "null";
            }
            return;
        }
        if (var3 == 34) {
            field493.method2256(37);
            field493.method2408(var4);
            field493.method2367(var2);
            field493.method2409(var1);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 39) {
            field493.method2256(109);
            field493.method2417(var2);
            field493.method2408(var1);
            field493.method2365(var4);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 31) {
            field493.method2256(166);
            field493.method2365(var1);
            field493.method2365(var4);
            field493.method2419(var2);
            field493.method2365(Statics.field171);
            field493.method2417(Statics.field262);
            field493.method2408(Statics.field347);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 29) {
            field493.method2256(222);
            field493.method2367(var2);
            class158 var47 = class158.method1612(var2);
            if (var47.field2583 != null && var47.field2583[0][0] == 5) {
                int var48 = var47.field2583[0][1];
                if (class159.field2700[var48] != var47.field2616[0]) {
                    class159.field2700[var48] = var47.field2616[0];
                    method104(var48);
                }
            }
        }
        if (var3 == 20) {
            boolean var49 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var49) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(117);
            field493.method2365(Statics.field26 + var2);
            field493.method2409(var4);
            field493.method2408(Statics.field736 + var1);
        }
        if (var3 == 51) {
            class3 var51 = field486[var4];
            if (var51 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var51.field447[0], var51.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(231);
                field493.method2409(var4);
            }
        }
        if (var3 == 1005) {
            class158 var52 = class158.method1612(var2);
            if (var52 == null || var52.field2628[var1] < 100000) {
                field493.method2256(239);
                field493.method2407(var4);
            } else {
                method91(0, "", var52.field2628[var1] + " x " + Statics.method1799(var4).field970);
            }
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (var3 == 18) {
            boolean var53 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var53) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(99);
            field493.method2408(var4);
            field493.method2365(Statics.field736 + var1);
            field493.method2409(Statics.field26 + var2);
        }
        if (var3 == 26) {
            method587();
        }
        if (var3 == 1003) {
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            class25 var55 = field490[var4];
            if (var55 != null) {
                class31 var56 = var55.field374;
                if (var56.field787 != null) {
                    var56 = var56.method551();
                }
                if (var56 != null) {
                    field493.method2256(119);
                    field493.method2407(var56.field761);
                }
            }
        }
        if (var3 == 1001) {
            method1501(var1, var2, var4);
            field493.method2256(42);
            field493.method2409(Statics.field26 + var2);
            field493.method2409(Statics.field736 + var1);
            field493.method2409(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1002) {
            field548 = class77.field1372;
            field562 = class77.field1373;
            field564 = 2;
            field563 = 0;
            field493.method2256(39);
            field493.method2407(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 9) {
            class25 var57 = field490[var4];
            if (var57 != null) {
                method185(Statics.field164.field447[0], Statics.field164.field448[0], var57.field447[0], var57.field448[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class77.field1372;
                field562 = class77.field1373;
                field564 = 2;
                field563 = 0;
                field493.method2256(87);
                field493.method2409(var4);
            }
        }
        if (var3 == 6) {
            method1501(var1, var2, var4);
            field493.method2256(36);
            field493.method2409(Statics.field26 + var2);
            field493.method2365(Statics.field736 + var1);
            field493.method2407(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 36) {
            field493.method2256(221);
            field493.method2367(var2);
            field493.method2365(var1);
            field493.method2409(var4);
            field510 = 0;
            Statics.field359 = class158.method1612(var2);
            field566 = var1;
        }
        if (field608 != 0) {
            field608 = 0;
            method186(class158.method1612(Statics.field262));
        }
        if (field610) {
            method180();
        }
        if (Statics.field359 != null && field510 == 0) {
            method186(Statics.field359);
        }
    }

    @ObfuscatedName("d.bh(IIII)V")
    public static void method198(int arg0, int arg1, int arg2) {
        class158 var3 = class158.method2662(arg0, arg1);
        if (var3 != null && var3.field2657 != null) {
            class1 var4 = new class1();
            var4.field9 = var3;
            var4.field6 = var3.field2657;
            class26.method116(var4);
        }
        field610 = true;
        Statics.field1991 = arg0;
        field611 = arg1;
        Statics.field338 = arg2;
        method186(var3);
    }

    @ObfuscatedName("h.bp(B)V")
    public static void method180() {
        if (!field610) {
            return;
        }
        class158 var0 = class158.method2662(Statics.field1991, field611);
        if (var0 != null && var0.field2658 != null) {
            class1 var1 = new class1();
            var1.field9 = var0;
            var1.field6 = var0.field2658;
            class26.method116(var1);
        }
        field610 = false;
        method186(var0);
    }

    @ObfuscatedName("dc.bb(B)V")
    public static final void method2251() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field590 - 1; var1++) {
                if (field600[var1] < 1000 && field600[var1 + 1] > 1000) {
                    String var2 = field603[var1];
                    field603[var1] = field603[var1 + 1];
                    field603[var1 + 1] = var2;
                    String var3 = field602[var1];
                    field602[var1] = field602[var1 + 1];
                    field602[var1 + 1] = var3;
                    int var4 = field600[var1];
                    field600[var1] = field600[var1 + 1];
                    field600[var1 + 1] = var4;
                    int var5 = field598[var1];
                    field598[var1] = field598[var1 + 1];
                    field598[var1 + 1] = var5;
                    int var6 = field599[var1];
                    field599[var1] = field599[var1 + 1];
                    field599[var1 + 1] = var6;
                    int var7 = field601[var1];
                    field601[var1] = field601[var1 + 1];
                    field601[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("l.bs(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method194(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field613 || field590 >= 500) {
            return;
        }
        field602[field590] = arg0;
        field603[field590] = arg1;
        field600[field590] = arg2;
        field601[field590] = arg3;
        field598[field590] = arg4;
        field599[field590] = arg5;
        field590++;
    }

    @ObfuscatedName("co.bn(S)V")
    public static void method1613() {
        for (int var0 = 0; var0 < field590; var0++) {
            if (method118(field600[var0])) {
                if (var0 < field590 - 1) {
                    for (int var1 = var0; var1 < field590 - 1; var1++) {
                        field602[var1] = field602[var1 + 1];
                        field603[var1] = field603[var1 + 1];
                        field600[var1] = field600[var1 + 1];
                        field601[var1] = field601[var1 + 1];
                        field598[var1] = field598[var1 + 1];
                        field599[var1] = field599[var1 + 1];
                    }
                }
                field590--;
            }
        }
    }

    @ObfuscatedName("s.bm(IB)Z")
    public static boolean method118(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("a.bv(Lag;IIIB)V")
    public static final void method2(class31 arg0, int arg1, int arg2, int arg3) {
        if (field590 >= 400) {
            return;
        }
        if (arg0.field787 != null) {
            arg0 = arg0.method551();
        }
        if (arg0 == null || !arg0.field790) {
            return;
        }
        String var4 = arg0.field770;
        if (arg0.field779 != 0) {
            var4 = var4 + method1801(arg0.field779, Statics.field164.field30) + " " + class2.field16 + class134.field2215 + arg0.field779 + class2.field17;
        }
        if (field608 == 1) {
            method194(class134.field2209, field609 + " " + class2.field18 + " " + Statics.method2628(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field610) {
            String[] var5 = arg0.field777;
            if (field632) {
                var5 = method127(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class134.field2191)) {
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
                        method194(var5[var6], Statics.method2628(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class134.field2191)) {
                        short var9 = 0;
                        if (arg0.field779 > Statics.field164.field30) {
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
                        method194(var5[var8], Statics.method2628(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method194(class134.field2210, Statics.method2628(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field338 & 0x2) == 2) {
            method194(field612, field567 + " " + class2.field18 + " " + Statics.method2628(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.bj(Lu;IIII)V")
    public static final void method94(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field164 == arg0 || field590 >= 400) {
            return;
        }
        String var4;
        if (arg0.field35 == 0) {
            var4 = arg0.field33 + method1801(arg0.field30, Statics.field164.field30) + " " + class2.field16 + class134.field2215 + arg0.field30 + class2.field17;
        } else {
            var4 = arg0.field33 + " " + class2.field16 + class134.field2172 + arg0.field35 + class2.field17;
        }
        if (field608 == 1) {
            method194(class134.field2209, field609 + " " + class2.field18 + " " + Statics.method2628(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field610) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field585[var5] != null) {
                    short var6 = 0;
                    if (field585[var5].equalsIgnoreCase(class134.field2191)) {
                        if (arg0.field30 > Statics.field164.field30) {
                            var6 = 2000;
                        }
                        if (Statics.field164.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field164.field48 == arg0.field48) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field498[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field584[var5] + var6;
                    method194(field585[var5], Statics.method2628(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field338 & 0x8) == 8) {
            method194(field612, field567 + " " + class2.field18 + " " + Statics.method2628(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field590; var9++) {
            if (field600[var9] == 23) {
                field603[var9] = Statics.method2628(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("cv.cl(IIB)Ljava/lang/String;")
    public static final String method1801(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return Statics.method2628(16711680);
        } else if (var2 < -6) {
            return Statics.method2628(16723968);
        } else if (var2 < -3) {
            return Statics.method2628(16740352);
        } else if (var2 < 0) {
            return Statics.method2628(16756736);
        } else if (var2 > 9) {
            return Statics.method2628(65280);
        } else if (var2 > 6) {
            return Statics.method2628(4259584);
        } else if (var2 > 3) {
            return Statics.method2628(8453888);
        } else if (var2 > 0) {
            return Statics.method2628(12648192);
        } else {
            return Statics.method2628(16776960);
        }
    }

    @ObfuscatedName("dv.ce(IIIIIIIIB)V")
    public static final void method2359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method1540(arg0)) {
            Statics.field932 = null;
            method150(Statics.field2670[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field932 != null) {
                method150(Statics.field932, -1412584499, arg1, arg2, arg3, arg4, Statics.field1432, Statics.field73, arg7);
                Statics.field932 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field657[var8] = true;
            }
        } else {
            field657[arg7] = true;
        }
    }

    @ObfuscatedName("z.ci([Lfh;IIIIIIIIB)V")
    public static final void method150(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1725(arg2, arg3, arg4, arg5);
        class104.method2080();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2596 == arg1 || arg1 == -1412584499 && field625 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field660[field655] = var10.field2584 + arg6;
                    field661[field655] = var10.field2585 + arg7;
                    field662[field655] = var10.field2588;
                    field663[field655] = var10.field2589;
                    var11 = ++field655 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2673 = var11;
                var10.field2695 = field465;
                if (!var10.field2578 || !method35(var10)) {
                    if (var10.field2613 > 0) {
                        method3(var10);
                    }
                    int var12 = var10.field2584 + arg6;
                    int var13 = var10.field2585 + arg7;
                    int var14 = var10.field2612;
                    if (field625 == var10) {
                        if (arg1 != -1412584499 && !var10.field2644) {
                            Statics.field932 = arg0;
                            Statics.field1432 = arg6;
                            Statics.field73 = arg7;
                            continue;
                        }
                        if (field636 && field630) {
                            int var15 = class77.field1365;
                            int var16 = class77.field1366;
                            int var17 = var15 - field718;
                            int var18 = var16 - field710;
                            if (var17 < field631) {
                                var17 = field631;
                            }
                            if (var10.field2588 + var17 > field631 + field569.field2588) {
                                var17 = field631 + field569.field2588 - var10.field2588;
                            }
                            if (var18 < field539) {
                                var18 = field539;
                            }
                            if (var10.field2589 + var18 > field539 + field569.field2589) {
                                var18 = field539 + field569.field2589 - var10.field2589;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2644) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2581 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2581 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2588 + var12;
                        int var26 = var10.field2589 + var13;
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
                        int var29 = var10.field2588 + var12;
                        int var30 = var10.field2589 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2578 || var19 < var21 && var20 < var22) {
                        if (var10.field2613 != 0) {
                            if (var10.field2613 == 1337) {
                                field604 = var12;
                                field540 = var13;
                                method820(var12, var13, var10.field2588, var10.field2589);
                                class89.method1725(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2613 == 1338) {
                                method2786();
                                class89.method1725(var12, var13, Statics.field1789.field1459 + var12, Statics.field1789.field1453 + var13);
                                if (field607 == 2 || field607 == 5) {
                                    class89.method1740(var12 + 25, var13 + 5, 0, Statics.field1587, Statics.field1011);
                                } else {
                                    int var31 = field581 + field527 & 0x7FF;
                                    int var32 = Statics.field164.field400 / 32 + 48;
                                    int var33 = 464 - Statics.field164.field404 / 32;
                                    Statics.field2054.method1643(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field488 + 256, Statics.field1587, Statics.field1011);
                                    for (int var34 = 0; var34 < field595; var34++) {
                                        int var35 = field571[var34] * 4 + 2 - Statics.field164.field400 / 32;
                                        int var36 = field552[var34] * 4 + 2 - Statics.field164.field404 / 32;
                                        method1982(var12, var13, var35, var36, field685[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class177 var39 = field588[Statics.field1519][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field164.field400 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field164.field404 / 32;
                                                method1982(var12, var13, var40, var41, Statics.field2376[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field484; var42++) {
                                        class25 var43 = field490[field492[var42]];
                                        if (var43 != null && var43.method19()) {
                                            class31 var44 = var43.field374;
                                            if (var44 != null && var44.field787 != null) {
                                                var44 = var44.method551();
                                            }
                                            if (var44 != null && var44.field782 && var44.field790) {
                                                int var45 = var43.field400 / 32 - Statics.field164.field400 / 32;
                                                int var46 = var43.field404 / 32 - Statics.field164.field404 / 32;
                                                method1982(var12, var13, var45, var46, Statics.field2376[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field575; var47++) {
                                        class3 var48 = field486[field576[var47]];
                                        if (var48 != null && var48.method19()) {
                                            int var49 = var48.field400 / 32 - Statics.field164.field400 / 32;
                                            int var50 = var48.field404 / 32 - Statics.field164.field404 / 32;
                                            boolean var51 = false;
                                            if (method206(var48.field33)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field1431; var53++) {
                                                if (var48.field33.equals(Statics.field1593[var53].field105)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field164.field48 != 0 && var48.field48 != 0 && Statics.field164.field48 == var48.field48) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method1982(var12, var13, var49, var50, Statics.field2376[3]);
                                            } else if (var54) {
                                                method1982(var12, var13, var49, var50, Statics.field2376[4]);
                                            } else if (var52) {
                                                method1982(var12, var13, var49, var50, Statics.field2376[2]);
                                            } else {
                                                method1982(var12, var13, var49, var50, Statics.field2376[2]);
                                            }
                                        }
                                    }
                                    if (field639 != 0 && field465 % 20 < 10) {
                                        if (field639 == 1 && field474 >= 0 && field474 < field490.length) {
                                            class25 var55 = field490[field474];
                                            if (var55 != null) {
                                                int var56 = var55.field400 / 32 - Statics.field164.field400 / 32;
                                                int var57 = var55.field404 / 32 - Statics.field164.field404 / 32;
                                                method1402(var12, var13, var56, var57, Statics.field1808[1]);
                                            }
                                        }
                                        if (field639 == 2) {
                                            int var58 = field541 * 4 - Statics.field736 * 4 + 2 - Statics.field164.field400 / 32;
                                            int var59 = field536 * 4 - Statics.field26 * 4 + 2 - Statics.field164.field404 / 32;
                                            method1402(var12, var13, var58, var59, Statics.field1808[1]);
                                        }
                                        if (field639 == 10 && field489 >= 0 && field489 < field486.length) {
                                            class3 var60 = field486[field489];
                                            if (var60 != null) {
                                                int var61 = var60.field400 / 32 - Statics.field164.field400 / 32;
                                                int var62 = var60.field404 / 32 - Statics.field164.field404 / 32;
                                                method1402(var12, var13, var61, var62, Statics.field1808[1]);
                                            }
                                        }
                                    }
                                    if (field553 != 0) {
                                        int var63 = field553 * 4 + 2 - Statics.field164.field400 / 32;
                                        int var64 = field687 * 4 + 2 - Statics.field164.field404 / 32;
                                        method1982(var12, var13, var63, var64, Statics.field1808[0]);
                                    }
                                    class89.method1728(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field607 < 3) {
                                    Statics.field373.method1643(var12, var13, 33, 33, 25, 25, field581, 256, Statics.field309, Statics.field872);
                                } else {
                                    class89.method1740(var12, var13, 0, Statics.field309, Statics.field872);
                                }
                                if (field659[var11]) {
                                    Statics.field1789.method1721(var12, var13);
                                }
                                field648[var11] = true;
                                class89.method1725(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var65 = class77.field1365;
                        int var66 = class77.field1366;
                        if (!field613 && var65 >= var19 && var66 >= var20 && var65 < var21 && var66 < var22) {
                            int var67 = var65 - var12;
                            int var68 = var66 - var13;
                            if (var10.field2582 == 1) {
                                method194(var10.field2680, "", 24, 0, 0, var10.field2665);
                            }
                            if (var10.field2582 == 2 && !field610) {
                                int var69 = method1523(var10);
                                int var70 = var69 >> 11 & 0x3F;
                                String var71;
                                if (var70 == 0) {
                                    var71 = null;
                                } else if (var10.field2694 == null || var10.field2694.trim().length() == 0) {
                                    var71 = null;
                                } else {
                                    var71 = var10.field2694;
                                }
                                if (var71 != null) {
                                    method194(var71, Statics.method2628(65280) + var10.field2679, 25, 0, -1, var10.field2665);
                                }
                            }
                            if (var10.field2582 == 3) {
                                method194(class134.field2152, "", 26, 0, 0, var10.field2665);
                            }
                            if (var10.field2582 == 4) {
                                method194(var10.field2680, "", 28, 0, 0, var10.field2665);
                            }
                            if (var10.field2582 == 5) {
                                method194(var10.field2680, "", 29, 0, 0, var10.field2665);
                            }
                            if (var10.field2582 == 6 && field618 == null) {
                                method194(var10.field2680, "", 30, 0, -1, var10.field2665);
                            }
                            if (var10.field2581 == 2) {
                                int var73 = 0;
                                for (int var74 = 0; var74 < var10.field2589; var74++) {
                                    for (int var75 = 0; var75 < var10.field2588; var75++) {
                                        int var76 = (var10.field2647 + 32) * var75;
                                        int var77 = (var10.field2633 + 32) * var74;
                                        if (var73 < 20) {
                                            var76 += var10.field2634[var73];
                                            var77 += var10.field2635[var73];
                                        }
                                        if (var67 >= var76 && var68 >= var77 && var67 < var76 + 32 && var68 < var77 + 32) {
                                            field641 = var73;
                                            Statics.field342 = var10;
                                            if (var10.field2681[var73] > 0) {
                                                label1281: {
                                                    class40 var78 = Statics.method1799(var10.field2681[var73] - 1);
                                                    if (field608 == 1) {
                                                        int var79 = method1523(var10);
                                                        boolean var80 = (var79 >> 30 & 0x1) != 0;
                                                        if (var80) {
                                                            if (Statics.field262 != var10.field2665 || Statics.field171 != var73) {
                                                                method194(class134.field2209, field609 + " " + class2.field18 + " " + Statics.method2628(16748608) + var78.field970, 31, var78.field968, var73, var10.field2665);
                                                            }
                                                            break label1281;
                                                        }
                                                    }
                                                    if (field610) {
                                                        int var81 = method1523(var10);
                                                        boolean var82 = (var81 >> 30 & 0x1) != 0;
                                                        if (var82) {
                                                            if ((Statics.field338 & 0x10) == 16) {
                                                                method194(field612, field567 + " " + class2.field18 + " " + Statics.method2628(16748608) + var78.field970, 32, var78.field968, var73, var10.field2665);
                                                            }
                                                            break label1281;
                                                        }
                                                    }
                                                    String[] var83 = var78.field994;
                                                    if (field632) {
                                                        var83 = method127(var83);
                                                    }
                                                    int var84 = method1523(var10);
                                                    boolean var85 = (var84 >> 30 & 0x1) != 0;
                                                    if (var85) {
                                                        for (int var86 = 4; var86 >= 3; var86--) {
                                                            if (var83 != null && var83[var86] != null) {
                                                                byte var87;
                                                                if (var86 == 3) {
                                                                    var87 = 36;
                                                                } else {
                                                                    var87 = 37;
                                                                }
                                                                method194(var83[var86], Statics.method2628(16748608) + var78.field970, var87, var78.field968, var73, var10.field2665);
                                                            } else if (var86 == 4) {
                                                                method194(class134.field2070, Statics.method2628(16748608) + var78.field970, 37, var78.field968, var73, var10.field2665);
                                                            }
                                                        }
                                                    }
                                                    int var88 = method1523(var10);
                                                    boolean var89 = (var88 >> 31 & 0x1) != 0;
                                                    if (var89) {
                                                        method194(class134.field2209, Statics.method2628(16748608) + var78.field970, 38, var78.field968, var73, var10.field2665);
                                                    }
                                                    int var90 = method1523(var10);
                                                    boolean var91 = (var90 >> 30 & 0x1) != 0;
                                                    if (var91 && var83 != null) {
                                                        for (int var92 = 2; var92 >= 0; var92--) {
                                                            if (var83[var92] != null) {
                                                                byte var93 = 0;
                                                                if (var92 == 0) {
                                                                    var93 = 33;
                                                                }
                                                                if (var92 == 1) {
                                                                    var93 = 34;
                                                                }
                                                                if (var92 == 2) {
                                                                    var93 = 35;
                                                                }
                                                                method194(var83[var92], Statics.method2628(16748608) + var78.field970, var93, var78.field968, var73, var10.field2665);
                                                            }
                                                        }
                                                    }
                                                    String[] var94 = var10.field2637;
                                                    if (field632) {
                                                        var94 = method127(var94);
                                                    }
                                                    if (var94 != null) {
                                                        for (int var95 = 4; var95 >= 0; var95--) {
                                                            if (var94[var95] != null) {
                                                                byte var96 = 0;
                                                                if (var95 == 0) {
                                                                    var96 = 39;
                                                                }
                                                                if (var95 == 1) {
                                                                    var96 = 40;
                                                                }
                                                                if (var95 == 2) {
                                                                    var96 = 41;
                                                                }
                                                                if (var95 == 3) {
                                                                    var96 = 42;
                                                                }
                                                                if (var95 == 4) {
                                                                    var96 = 43;
                                                                }
                                                                method194(var94[var95], Statics.method2628(16748608) + var78.field970, var96, var78.field968, var73, var10.field2665);
                                                            }
                                                        }
                                                    }
                                                    method194(class134.field2210, Statics.method2628(16748608) + var78.field970, 1005, var78.field968, var73, var10.field2665);
                                                }
                                            }
                                        }
                                        var73++;
                                    }
                                }
                            }
                            if (var10.field2578) {
                                if (field610) {
                                    int var97 = method1523(var10);
                                    boolean var98 = (var97 >> 21 & 0x1) != 0;
                                    if (var98 && (Statics.field338 & 0x20) == 32) {
                                        method194(field612, field567 + " " + class2.field18 + " " + var10.field2620, 58, 0, var10.field2674, var10.field2665);
                                    }
                                } else {
                                    for (int var99 = 9; var99 >= 5; var99--) {
                                        String var100;
                                        if (!class162.method109(method1523(var10), var99) && var10.field2666 == null) {
                                            var100 = null;
                                        } else if (var10.field2592 == null || var10.field2592.length <= var99 || var10.field2592[var99] == null || var10.field2592[var99].trim().length() == 0) {
                                            var100 = null;
                                        } else {
                                            var100 = var10.field2592[var99];
                                        }
                                        if (var100 != null) {
                                            method194(var100, var10.field2620, 1007, var99 + 1, var10.field2674, var10.field2665);
                                        }
                                    }
                                    int var102 = method1523(var10);
                                    int var103 = var102 >> 11 & 0x3F;
                                    String var104;
                                    if (var103 == 0) {
                                        var104 = null;
                                    } else if (var10.field2694 == null || var10.field2694.trim().length() == 0) {
                                        var104 = null;
                                    } else {
                                        var104 = var10.field2694;
                                    }
                                    if (var104 != null) {
                                        method194(var104, var10.field2620, 25, 0, var10.field2674, var10.field2665);
                                    }
                                    for (int var106 = 4; var106 >= 0; var106--) {
                                        String var107;
                                        if (!class162.method109(method1523(var10), var106) && var10.field2666 == null) {
                                            var107 = null;
                                        } else if (var10.field2592 == null || var10.field2592.length <= var106 || var10.field2592[var106] == null || var10.field2592[var106].trim().length() == 0) {
                                            var107 = null;
                                        } else {
                                            var107 = var10.field2592[var106];
                                        }
                                        if (var107 != null) {
                                            method194(var107, var10.field2620, 57, var106 + 1, var10.field2674, var10.field2665);
                                        }
                                    }
                                    int var109 = method1523(var10);
                                    boolean var110 = (var109 & 0x1) != 0;
                                    if (var110) {
                                        method194(class134.field2087, "", 30, 0, var10.field2674, var10.field2665);
                                    }
                                }
                            }
                        }
                        if (var10.field2581 == 0) {
                            if (!var10.field2578 && method35(var10) && Statics.field1247 != var10) {
                                continue;
                            }
                            if (!var10.field2578) {
                                if (var10.field2593 > var10.field2604 - var10.field2589) {
                                    var10.field2593 = var10.field2604 - var10.field2589;
                                }
                                if (var10.field2593 < 0) {
                                    var10.field2593 = 0;
                                }
                            }
                            method150(arg0, var10.field2665, var19, var20, var21, var22, var12 - var10.field2572, var13 - var10.field2593, var11);
                            if (var10.field2687 != null) {
                                method150(var10.field2687, var10.field2665, var19, var20, var21, var22, var12 - var10.field2572, var13 - var10.field2593, var11);
                            }
                            class4 var111 = (class4) field615.method3252((long) var10.field2665);
                            if (var111 != null) {
                                if (var111.field54 == 0 && class77.field1365 >= var19 && class77.field1366 >= var20 && class77.field1365 < var21 && class77.field1366 < var22 && !field613 && !field623) {
                                    field602[0] = class134.field2230;
                                    field603[0] = "";
                                    field600[0] = 1006;
                                    field590 = 1;
                                }
                                method2359(var111.field55, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1725(arg2, arg3, arg4, arg5);
                            class104.method2080();
                        }
                        if (field659[var11] || field620 > 1) {
                            if (var10.field2581 == 0 && !var10.field2578 && var10.field2604 > var10.field2589) {
                                int var112 = var10.field2588 + var12;
                                int var113 = var10.field2593;
                                int var114 = var10.field2589;
                                int var115 = var10.field2604;
                                Statics.field84[0].method1721(var112, var13);
                                Statics.field84[1].method1721(var112, var13 + var114 - 16);
                                class89.method1728(var112, var13 + 16, 16, var114 - 32, field505);
                                int var116 = (var114 - 32) * var114 / var115;
                                if (var116 < 8) {
                                    var116 = 8;
                                }
                                int var117 = (var114 - 32 - var116) * var113 / (var115 - var114);
                                class89.method1728(var112, var13 + 16 + var117, 16, var116, field534);
                                class89.method1774(var112, var13 + 16 + var117, var116, field678);
                                class89.method1774(var112 + 1, var13 + 16 + var117, var116, field678);
                                class89.method1735(var112, var13 + 16 + var117, 16, field678);
                                class89.method1735(var112, var13 + 17 + var117, 16, field678);
                                class89.method1774(var112 + 15, var13 + 16 + var117, var116, field535);
                                class89.method1774(var112 + 14, var13 + 17 + var117, var116 - 1, field535);
                                class89.method1735(var112, var13 + 15 + var117 + var116, 16, field535);
                                class89.method1735(var112 + 1, var13 + 14 + var117 + var116, 15, field535);
                            }
                            if (var10.field2581 != 1) {
                                if (var10.field2581 == 2) {
                                    int var118 = 0;
                                    for (int var119 = 0; var119 < var10.field2589; var119++) {
                                        for (int var120 = 0; var120 < var10.field2588; var120++) {
                                            int var121 = (var10.field2647 + 32) * var120 + var12;
                                            int var122 = (var10.field2633 + 32) * var119 + var13;
                                            if (var118 < 20) {
                                                var121 += var10.field2634[var118];
                                                var122 += var10.field2635[var118];
                                            }
                                            if (var10.field2681[var118] > 0) {
                                                boolean var123 = false;
                                                boolean var124 = false;
                                                int var125 = var10.field2681[var118] - 1;
                                                if (var121 + 32 > arg2 && var121 < arg4 && var122 + 32 > arg3 && var122 < arg5 || Statics.field731 == var10 && field695 == var118) {
                                                    class86 var126;
                                                    if (field608 == 1 && Statics.field171 == var118 && Statics.field262 == var10.field2665) {
                                                        var126 = Statics.method1461(var125, var10.field2628[var118], 2, 0, false);
                                                    } else {
                                                        var126 = Statics.method1461(var125, var10.field2628[var118], 1, 3153952, false);
                                                    }
                                                    if (var126 == null) {
                                                        method186(var10);
                                                    } else if (Statics.field731 == var10 && field695 == var118) {
                                                        int var127 = class77.field1365 - field568;
                                                        int var128 = class77.field1366 - field543;
                                                        if (var127 < 5 && var127 > -5) {
                                                            var127 = 0;
                                                        }
                                                        if (var128 < 5 && var128 > -5) {
                                                            var128 = 0;
                                                        }
                                                        if (field556 < 5) {
                                                            var127 = 0;
                                                            var128 = 0;
                                                        }
                                                        var126.method1639(var121 + var127, var122 + var128, 128);
                                                        if (arg1 != -1) {
                                                            class158 var129 = arg0[arg1 & 0xFFFF];
                                                            if (var122 + var128 < class89.field1465 && var129.field2593 > 0) {
                                                                int var130 = field532 * (class89.field1465 - var122 - var128) / 3;
                                                                if (var130 > field532 * 10) {
                                                                    var130 = field532 * 10;
                                                                }
                                                                if (var130 > var129.field2593) {
                                                                    var130 = var129.field2593;
                                                                }
                                                                var129.field2593 -= var130;
                                                                field543 += var130;
                                                                method186(var129);
                                                            }
                                                            if (var122 + var128 + 32 > class89.field1466 && var129.field2593 < var129.field2604 - var129.field2589) {
                                                                int var131 = field532 * (var122 + var128 + 32 - class89.field1466) / 3;
                                                                if (var131 > field532 * 10) {
                                                                    var131 = field532 * 10;
                                                                }
                                                                if (var131 > var129.field2604 - var129.field2589 - var129.field2593) {
                                                                    var131 = var129.field2604 - var129.field2589 - var129.field2593;
                                                                }
                                                                var129.field2593 += var131;
                                                                field543 -= var131;
                                                                method186(var129);
                                                            }
                                                        }
                                                    } else if (Statics.field359 == var10 && field566 == var118) {
                                                        var126.method1639(var121, var122, 128);
                                                    } else {
                                                        var126.method1633(var121, var122);
                                                    }
                                                }
                                            } else if (var10.field2672 != null && var118 < 20) {
                                                class86 var132 = var10.method3066(var118);
                                                if (var132 != null) {
                                                    var132.method1633(var121, var122);
                                                } else if (class158.field2577) {
                                                    method186(var10);
                                                }
                                            }
                                            var118++;
                                        }
                                    }
                                } else if (var10.field2581 == 3) {
                                    int var133;
                                    if (method1219(var10)) {
                                        var133 = var10.field2597;
                                        if (Statics.field1247 == var10 && var10.field2599 != 0) {
                                            var133 = var10.field2599;
                                        }
                                    } else {
                                        var133 = var10.field2607;
                                        if (Statics.field1247 == var10 && var10.field2598 != 0) {
                                            var133 = var10.field2598;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2600) {
                                            class89.method1728(var12, var13, var10.field2588, var10.field2589, var133);
                                        } else {
                                            class89.method1733(var12, var13, var10.field2588, var10.field2589, var133);
                                        }
                                    } else if (var10.field2600) {
                                        class89.method1730(var12, var13, var10.field2588, var10.field2589, var133, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1734(var12, var13, var10.field2588, var10.field2589, var133, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2581 == 4) {
                                    class183 var134 = var10.method3068();
                                    if (var134 != null) {
                                        String var135 = var10.field2626;
                                        int var136;
                                        if (method1219(var10)) {
                                            var136 = var10.field2597;
                                            if (Statics.field1247 == var10 && var10.field2599 != 0) {
                                                var136 = var10.field2599;
                                            }
                                            if (var10.field2573.length() > 0) {
                                                var135 = var10.field2573;
                                            }
                                        } else {
                                            var136 = var10.field2607;
                                            if (Statics.field1247 == var10 && var10.field2598 != 0) {
                                                var136 = var10.field2598;
                                            }
                                        }
                                        if (var10.field2578 && var10.field2683 != -1) {
                                            class40 var137 = Statics.method1799(var10.field2683);
                                            var135 = var137.field970;
                                            if (var135 == null) {
                                                var135 = "null";
                                            }
                                            if ((var137.field981 == 1 || var10.field2684 != 1) && var10.field2684 != -1) {
                                                var135 = Statics.method2628(16748608) + var135 + class2.field20 + " " + 'x' + Statics.method147(var10.field2684);
                                            }
                                        }
                                        if (field618 == var10) {
                                            class134 var10000 = (class134) null;
                                            var135 = class134.field2217;
                                            var136 = var10.field2607;
                                        }
                                        if (!var10.field2578) {
                                            var135 = method2313(var135, var10);
                                        }
                                        var134.method3373(var135, var12, var13, var10.field2588, var10.field2589, var136, var10.field2631 ? 0 : -1, var10.field2594, var10.field2645, var10.field2629);
                                    } else if (class158.field2577) {
                                        method186(var10);
                                    }
                                } else if (var10.field2581 == 5) {
                                    if (var10.field2578) {
                                        class86 var139;
                                        if (var10.field2683 == -1) {
                                            var139 = var10.method3067(false);
                                        } else {
                                            var139 = Statics.method1461(var10.field2683, var10.field2684, var10.field2643, var10.field2608, false);
                                        }
                                        if (var139 != null) {
                                            int var140 = var139.field1450;
                                            int var141 = var139.field1446;
                                            if (var10.field2606) {
                                                class89.method1726(var12, var13, var10.field2588 + var12, var10.field2589 + var13);
                                                int var142 = (var10.field2588 + (var140 - 1)) / var140;
                                                int var143 = (var10.field2589 + (var141 - 1)) / var141;
                                                for (int var144 = 0; var144 < var142; var144++) {
                                                    for (int var145 = 0; var145 < var143; var145++) {
                                                        if (var10.field2586 != 0) {
                                                            var139.method1674(var140 / 2 + var140 * var144 + var12, var141 / 2 + var141 * var145 + var13, var10.field2586, 4096);
                                                        } else if (var14 == 0) {
                                                            var139.method1633(var140 * var144 + var12, var141 * var145 + var13);
                                                        } else {
                                                            var139.method1639(var140 * var144 + var12, var141 * var145 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1725(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var146 = var10.field2588 * 4096 / var140;
                                                if (var10.field2586 != 0) {
                                                    var139.method1674(var10.field2588 / 2 + var12, var10.field2589 / 2 + var13, var10.field2586, var146);
                                                } else if (var14 != 0) {
                                                    var139.method1705(var12, var13, var10.field2588, var10.field2589, 256 - (var14 & 0xFF));
                                                } else if (var10.field2588 == var140 && var10.field2589 == var141) {
                                                    var139.method1633(var12, var13);
                                                } else {
                                                    var139.method1626(var12, var13, var10.field2588, var10.field2589);
                                                }
                                            }
                                        } else if (class158.field2577) {
                                            method186(var10);
                                        }
                                    } else {
                                        class86 var138 = var10.method3067(method1219(var10));
                                        if (var138 != null) {
                                            var138.method1633(var12, var13);
                                        } else if (class158.field2577) {
                                            method186(var10);
                                        }
                                    }
                                } else if (var10.field2581 == 6) {
                                    boolean var147 = method1219(var10);
                                    int var148;
                                    if (var147) {
                                        var148 = var10.field2677;
                                    } else {
                                        var148 = var10.field2615;
                                    }
                                    class112 var149 = null;
                                    int var150 = 0;
                                    if (var10.field2683 != -1) {
                                        class40 var151 = Statics.method1799(var10.field2683);
                                        if (var151 != null) {
                                            class40 var152 = var151.method779(var10.field2684);
                                            var149 = var152.method781(1);
                                            if (var149 == null) {
                                                method186(var10);
                                            } else {
                                                var149.method2179();
                                                var150 = var149.field1518 / 2;
                                            }
                                        }
                                    } else if (var10.field2675 == 5) {
                                        if (var10.field2603 == 0) {
                                            var149 = field516.method3132((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var149 = Statics.field164.method18();
                                        }
                                    } else if (var148 == -1) {
                                        var149 = var10.method3095((class34) null, -1, var147, Statics.field164.field31);
                                        if (var149 == null && class158.field2577) {
                                            method186(var10);
                                        }
                                    } else {
                                        class34 var153 = class34.method30(var148);
                                        var149 = var10.method3095(var153, var10.field2640, var147, Statics.field164.field31);
                                        if (var149 == null && class158.field2577) {
                                            method186(var10);
                                        }
                                    }
                                    class104.method2104(var10.field2588 / 2 + var12, var10.field2589 / 2 + var13);
                                    int var154 = var10.field2622 * class104.field1753[var10.field2619] >> 16;
                                    int var155 = var10.field2622 * class104.field1754[var10.field2619] >> 16;
                                    if (var149 != null) {
                                        if (var10.field2578) {
                                            var149.method2179();
                                            if (var10.field2624) {
                                                var149.method2239(0, var10.field2632, var10.field2621, var10.field2619, var10.field2617, var10.field2669 + var150 + var154, var10.field2669 + var155, var10.field2622);
                                            } else {
                                                var149.method2191(0, var10.field2632, var10.field2621, var10.field2619, var10.field2617, var10.field2669 + var150 + var154, var10.field2669 + var155);
                                            }
                                        } else {
                                            var149.method2191(0, var10.field2632, 0, var10.field2619, 0, var154, var155);
                                        }
                                    }
                                    class104.method2082();
                                } else {
                                    if (var10.field2581 == 7) {
                                        class183 var156 = var10.method3068();
                                        if (var156 == null) {
                                            if (class158.field2577) {
                                                method186(var10);
                                            }
                                            continue;
                                        }
                                        int var157 = 0;
                                        for (int var158 = 0; var158 < var10.field2589; var158++) {
                                            for (int var159 = 0; var159 < var10.field2588; var159++) {
                                                if (var10.field2681[var157] > 0) {
                                                    class40 var160 = Statics.method1799(var10.field2681[var157] - 1);
                                                    String var161;
                                                    if (var160.field981 != 1 && var10.field2628[var157] == 1) {
                                                        var161 = Statics.method2628(16748608) + var160.field970 + class2.field20;
                                                    } else {
                                                        var161 = Statics.method2628(16748608) + var160.field970 + class2.field20 + " " + 'x' + Statics.method147(var10.field2628[var157]);
                                                    }
                                                    int var162 = (var10.field2647 + 115) * var159 + var12;
                                                    int var163 = (var10.field2633 + 12) * var158 + var13;
                                                    if (var10.field2594 == 0) {
                                                        var156.method3415(var161, var162, var163, var10.field2607, var10.field2631 ? 0 : -1);
                                                    } else if (var10.field2594 == 1) {
                                                        var156.method3345(var161, var10.field2588 / 2 + var162, var163, var10.field2607, var10.field2631 ? 0 : -1);
                                                    } else {
                                                        var156.method3402(var161, var10.field2588 + var162 - 1, var163, var10.field2607, var10.field2631 ? 0 : -1);
                                                    }
                                                }
                                                var157++;
                                            }
                                        }
                                    }
                                    if (var10.field2581 == 8 && Statics.field231 == var10 && field683 == field669) {
                                        int var164 = 0;
                                        int var165 = 0;
                                        class183 var166 = Statics.field356;
                                        String var167 = var10.field2626;
                                        String var168 = method2313(var167, var10);
                                        while (var168.length() > 0) {
                                            int var169 = var168.indexOf(class2.field29);
                                            String var170;
                                            if (var169 == -1) {
                                                var170 = var168;
                                                var168 = "";
                                            } else {
                                                var170 = var168.substring(0, var169);
                                                var168 = var168.substring(var169 + 4);
                                            }
                                            int var171 = var166.method3361(var170);
                                            if (var171 > var164) {
                                                var164 = var171;
                                            }
                                            var165 += var166.field2838 + 1;
                                        }
                                        var164 += 6;
                                        var165 += 7;
                                        int var172 = var10.field2588 + var12 - 5 - var164;
                                        int var173 = var10.field2589 + var13 + 5;
                                        if (var172 < var12 + 5) {
                                            var172 = var12 + 5;
                                        }
                                        if (var164 + var172 > arg4) {
                                            var172 = arg4 - var164;
                                        }
                                        if (var165 + var173 > arg5) {
                                            var173 = arg5 - var165;
                                        }
                                        class89.method1728(var172, var173, var164, var165, 16777120);
                                        class89.method1733(var172, var173, var164, var165, 0);
                                        String var174 = var10.field2626;
                                        int var175 = var166.field2838 + var173 + 2;
                                        String var176 = method2313(var174, var10);
                                        while (var176.length() > 0) {
                                            int var177 = var176.indexOf(class2.field29);
                                            String var178;
                                            if (var177 == -1) {
                                                var178 = var176;
                                                var176 = "";
                                            } else {
                                                var178 = var176.substring(0, var177);
                                                var176 = var176.substring(var177 + 4);
                                            }
                                            var166.method3415(var178, var172 + 3, var175, 0, -1);
                                            var175 += var166.field2838 + 1;
                                        }
                                    }
                                    if (var10.field2581 == 9) {
                                        if (var10.field2663 == 1) {
                                            class89.method1739(var12, var13, var10.field2588 + var12, var10.field2589 + var13, var10.field2607);
                                        } else {
                                            int var179 = var10.field2588 >= 0 ? var10.field2588 : -var10.field2588;
                                            int var180 = var10.field2589 >= 0 ? var10.field2589 : -var10.field2589;
                                            int var181 = var179;
                                            if (var179 < var180) {
                                                var181 = var180;
                                            }
                                            if (var181 != 0) {
                                                int var182 = (var10.field2588 << 16) / var181;
                                                int var183 = (var10.field2589 << 16) / var181;
                                                if (var183 <= var182) {
                                                    var182 = -var182;
                                                } else {
                                                    var183 = -var183;
                                                }
                                                int var184 = var10.field2663 * var183 >> 17;
                                                int var185 = var10.field2663 * var183 + 1 >> 17;
                                                int var186 = var10.field2663 * var182 >> 17;
                                                int var187 = var10.field2663 * var182 + 1 >> 17;
                                                int var188 = var12 + var184;
                                                int var189 = var12 - var185;
                                                int var190 = var10.field2588 + var12 - var185;
                                                int var191 = var10.field2588 + var12 + var184;
                                                int var192 = var13 + var186;
                                                int var193 = var13 - var187;
                                                int var194 = var10.field2589 + var13 - var187;
                                                int var195 = var10.field2589 + var13 + var186;
                                                class104.method2132(var188, var189, var190);
                                                class104.method2091(var192, var193, var194, var188, var189, var190, var10.field2607);
                                                class104.method2132(var188, var190, var191);
                                                class104.method2091(var192, var194, var195, var188, var190, var191, var10.field2607);
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

    @ObfuscatedName("dn.cr(Ljava/lang/String;Lfh;B)Ljava/lang/String;")
    public static String method2313(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method182(method1171(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field230 != null) {
                    int var6 = Statics.field230.field1387;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field230.field1381 != null) {
                        var5 = (String) Statics.field230.field1381;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("f.cm(II)Ljava/lang/String;")
    public static final String method182(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("be.co(Lfh;B)Z")
    public static final boolean method1219(class158 arg0) {
        if (arg0.field2676 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2676.length; var1++) {
            int var2 = method1171(arg0, var1);
            int var3 = arg0.field2616[var1];
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

    @ObfuscatedName("bo.ct(Lfh;IB)I")
    public static final int method1171(class158 arg0, int arg1) {
        if (arg0.field2583 == null || arg1 >= arg0.field2583.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2583[arg1];
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
                    var7 = field592[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field593[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field594[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method1612(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method1799(var12).field998 || field460)) {
                        for (int var13 = 0; var13 < var11.field2681.length; var13++) {
                            if (var12 + 1 == var11.field2681[var13]) {
                                var7 += var11.field2628[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2700[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2028[field593[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2700[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field164.field30;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2030[var14]) {
                            var7 += field593[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method1612(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method1799(var18).field998 || field460)) {
                        for (int var19 = 0; var19 < var17.field2681.length; var19++) {
                            if (var18 + 1 == var17.field2681[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field619;
                }
                if (var6 == 12) {
                    var7 = field697;
                }
                if (var6 == 13) {
                    int var20 = class159.field2700[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2281(var22);
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
                    var7 = (Statics.field164.field400 >> 7) + Statics.field736;
                }
                if (var6 == 19) {
                    var7 = (Statics.field164.field404 >> 7) + Statics.field26;
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

    @ObfuscatedName("co.cb([Lfh;IIIIIIIB)V")
    public static final void method1619(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2578 || var9.field2581 == 0 || var9.field2685 || method1523(var9) != 0 || field569 == var9) && var9.field2596 == arg1 && (!var9.field2578 || !method35(var9))) {
                int var10 = var9.field2584 + arg6;
                int var11 = var9.field2585 + arg7;
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
                if (field625 == var9) {
                    field633 = true;
                    field634 = var10;
                    field635 = var11;
                }
                if (!var9.field2578 || var12 < var14 && var13 < var15) {
                    if (var9.field2613 == 1337) {
                        method186(var9);
                    } else if (var9.field2613 != 1338) {
                        if (var9.field2581 == 0) {
                            if (!var9.field2578 && method35(var9) && Statics.field1247 != var9) {
                                continue;
                            }
                            method1619(arg0, var9.field2665, var12, var13, var14, var15, var10 - var9.field2572, var11 - var9.field2593);
                            if (var9.field2687 != null) {
                                method1619(var9.field2687, var9.field2665, var12, var13, var14, var15, var10 - var9.field2572, var11 - var9.field2593);
                            }
                            class4 var36 = (class4) field615.method3252((long) var9.field2665);
                            if (var36 != null) {
                                int var37 = var36.field55;
                                if (class158.method1540(var37)) {
                                    method1619(Statics.field2670[var37], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2578) {
                            boolean var38;
                            if (class77.field1365 >= var12 && class77.field1366 >= var13 && class77.field1365 < var14 && class77.field1366 < var15) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if (class77.field1364 == 1 && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if (class77.field1368 == 1 && class77.field1372 >= var12 && class77.field1373 >= var13 && class77.field1372 < var14 && class77.field1373 < var15) {
                                var40 = true;
                            }
                            if (var40) {
                                method98(var9, class77.field1372 - var10, class77.field1373 - var11);
                            }
                            if (field625 != null && field625 != var9 && var38 && class162.method105(method1523(var9))) {
                                field517 = var9;
                            }
                            if (field569 == var9) {
                                field630 = true;
                                field631 = var10;
                                field539 = var11;
                            }
                            if (var9.field2685) {
                                if (var38 && field650 != 0 && var9.field2667 != null) {
                                    class1 var41 = new class1();
                                    var41.field9 = var9;
                                    var41.field4 = field650;
                                    var41.field6 = var9.field2667;
                                    field651.method3271(var41);
                                }
                                if (field625 != null || Statics.field731 != null || field613) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field2689 && var40) {
                                    var9.field2689 = true;
                                    if (var9.field2648 != null) {
                                        class1 var42 = new class1();
                                        var42.field9 = var9;
                                        var42.field1 = class77.field1372 - var10;
                                        var42.field4 = class77.field1373 - var11;
                                        var42.field6 = var9.field2648;
                                        field651.method3271(var42);
                                    }
                                }
                                if (var9.field2689 && var39 && var9.field2649 != null) {
                                    class1 var43 = new class1();
                                    var43.field9 = var9;
                                    var43.field1 = class77.field1365 - var10;
                                    var43.field4 = class77.field1366 - var11;
                                    var43.field6 = var9.field2649;
                                    field651.method3271(var43);
                                }
                                if (var9.field2689 && !var39) {
                                    var9.field2689 = false;
                                    if (var9.field2650 != null) {
                                        class1 var44 = new class1();
                                        var44.field9 = var9;
                                        var44.field1 = class77.field1365 - var10;
                                        var44.field4 = class77.field1366 - var11;
                                        var44.field6 = var9.field2650;
                                        field717.method3271(var44);
                                    }
                                }
                                if (var39 && var9.field2651 != null) {
                                    class1 var45 = new class1();
                                    var45.field9 = var9;
                                    var45.field1 = class77.field1365 - var10;
                                    var45.field4 = class77.field1366 - var11;
                                    var45.field6 = var9.field2651;
                                    field651.method3271(var45);
                                }
                                if (!var9.field2688 && var38) {
                                    var9.field2688 = true;
                                    if (var9.field2652 != null) {
                                        class1 var46 = new class1();
                                        var46.field9 = var9;
                                        var46.field1 = class77.field1365 - var10;
                                        var46.field4 = class77.field1366 - var11;
                                        var46.field6 = var9.field2652;
                                        field651.method3271(var46);
                                    }
                                }
                                if (var9.field2688 && var38 && var9.field2653 != null) {
                                    class1 var47 = new class1();
                                    var47.field9 = var9;
                                    var47.field1 = class77.field1365 - var10;
                                    var47.field4 = class77.field1366 - var11;
                                    var47.field6 = var9.field2653;
                                    field651.method3271(var47);
                                }
                                if (var9.field2688 && !var38) {
                                    var9.field2688 = false;
                                    if (var9.field2654 != null) {
                                        class1 var48 = new class1();
                                        var48.field9 = var9;
                                        var48.field1 = class77.field1365 - var10;
                                        var48.field4 = class77.field1366 - var11;
                                        var48.field6 = var9.field2654;
                                        field717.method3271(var48);
                                    }
                                }
                                if (var9.field2605 != null) {
                                    class1 var49 = new class1();
                                    var49.field9 = var9;
                                    var49.field6 = var9.field2605;
                                    field475.method3271(var49);
                                }
                                if (var9.field2659 != null && field712 > var9.field2691) {
                                    if (var9.field2601 == null || field712 - var9.field2691 > 32) {
                                        class1 var54 = new class1();
                                        var54.field9 = var9;
                                        var54.field6 = var9.field2659;
                                        field651.method3271(var54);
                                    } else {
                                        label450: for (int var50 = var9.field2691; var50 < field712; var50++) {
                                            int var51 = field638[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2601.length; var52++) {
                                                if (var9.field2601[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field9 = var9;
                                                    var53.field6 = var9.field2659;
                                                    field651.method3271(var53);
                                                    break label450;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2691 = field712;
                                }
                                if (var9.field2661 != null && field679 > var9.field2692) {
                                    if (var9.field2662 == null || field679 - var9.field2692 > 32) {
                                        class1 var59 = new class1();
                                        var59.field9 = var9;
                                        var59.field6 = var9.field2661;
                                        field651.method3271(var59);
                                    } else {
                                        label430: for (int var55 = var9.field2692; var55 < field679; var55++) {
                                            int var56 = field640[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2662.length; var57++) {
                                                if (var9.field2662[var57] == var56) {
                                                    class1 var58 = new class1();
                                                    var58.field9 = var9;
                                                    var58.field6 = var9.field2661;
                                                    field651.method3271(var58);
                                                    break label430;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2692 = field679;
                                }
                                if (var9.field2579 != null && field643 > var9.field2609) {
                                    if (var9.field2664 == null || field643 - var9.field2609 > 32) {
                                        class1 var64 = new class1();
                                        var64.field9 = var9;
                                        var64.field6 = var9.field2579;
                                        field651.method3271(var64);
                                    } else {
                                        label410: for (int var60 = var9.field2609; var60 < field643; var60++) {
                                            int var61 = field642[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field2664.length; var62++) {
                                                if (var9.field2664[var62] == var61) {
                                                    class1 var63 = new class1();
                                                    var63.field9 = var9;
                                                    var63.field6 = var9.field2579;
                                                    field651.method3271(var63);
                                                    break label410;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2609 = field643;
                                }
                                if (field644 > var9.field2660 && var9.field2668 != null) {
                                    class1 var65 = new class1();
                                    var65.field9 = var9;
                                    var65.field6 = var9.field2668;
                                    field651.method3271(var65);
                                }
                                if (field698 > var9.field2660 && var9.field2639 != null) {
                                    class1 var66 = new class1();
                                    var66.field9 = var9;
                                    var66.field6 = var9.field2639;
                                    field651.method3271(var66);
                                }
                                if (field561 > var9.field2660 && var9.field2671 != null) {
                                    class1 var67 = new class1();
                                    var67.field9 = var9;
                                    var67.field6 = var9.field2671;
                                    field651.method3271(var67);
                                }
                                if (field649 > var9.field2660 && var9.field2646 != null) {
                                    class1 var68 = new class1();
                                    var68.field9 = var9;
                                    var68.field6 = var9.field2646;
                                    field651.method3271(var68);
                                }
                                var9.field2660 = field504;
                                if (var9.field2611 != null) {
                                    for (int var69 = 0; var69 < field675; var69++) {
                                        class1 var70 = new class1();
                                        var70.field9 = var9;
                                        var70.field7 = field606[var69];
                                        var70.field8 = field676[var69];
                                        var70.field6 = var9.field2611;
                                        field651.method3271(var70);
                                    }
                                }
                            }
                        }
                        if (!var9.field2578) {
                            if (field625 != null || Statics.field731 != null || field613) {
                                return;
                            }
                            if ((var9.field2678 >= 0 || var9.field2598 != 0) && class77.field1365 >= var12 && class77.field1366 >= var13 && class77.field1365 < var14 && class77.field1366 < var15) {
                                if (var9.field2678 >= 0) {
                                    Statics.field1247 = arg0[var9.field2678];
                                } else {
                                    Statics.field1247 = var9;
                                }
                            }
                            if (var9.field2581 == 8 && class77.field1365 >= var12 && class77.field1366 >= var13 && class77.field1365 < var14 && class77.field1366 < var15) {
                                Statics.field231 = var9;
                            }
                            if (var9.field2604 > var9.field2589) {
                                int var71 = var9.field2588 + var10;
                                int var72 = var9.field2589;
                                int var73 = var9.field2604;
                                int var74 = class77.field1365;
                                int var75 = class77.field1366;
                                if (field537) {
                                    field538 = 32;
                                } else {
                                    field538 = 0;
                                }
                                field537 = false;
                                if (class77.field1364 != 0) {
                                    if (var74 >= var71 && var74 < var71 + 16 && var75 >= var11 && var75 < var11 + 16) {
                                        var9.field2593 -= 4;
                                        method186(var9);
                                    } else if (var74 >= var71 && var74 < var71 + 16 && var75 >= var11 + var72 - 16 && var75 < var11 + var72) {
                                        var9.field2593 += 4;
                                        method186(var9);
                                    } else if (var74 >= var71 - field538 && var74 < field538 + var71 + 16 && var75 >= var11 + 16 && var75 < var11 + var72 - 16) {
                                        int var76 = (var72 - 32) * var72 / var73;
                                        if (var76 < 8) {
                                            var76 = 8;
                                        }
                                        int var77 = var75 - var11 - 16 - var76 / 2;
                                        int var78 = var72 - 32 - var76;
                                        var9.field2593 = (var73 - var72) * var77 / var78;
                                        method186(var9);
                                        field537 = true;
                                    }
                                }
                                if (field650 != 0) {
                                    int var79 = var9.field2588;
                                    if (var74 >= var71 - var79 && var75 >= var11 && var74 < var71 + 16 && var75 <= var11 + var72) {
                                        var9.field2593 += field650 * 45;
                                        method186(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field607 == 0 || field607 == 3) && class77.field1368 == 1) {
                        int var24 = class77.field1372 - 25 - var10;
                        int var25 = class77.field1373 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field581 + field527 & 0x7FF;
                            int var27 = class104.field1753[var26];
                            int var28 = class104.field1754[var26];
                            int var29 = (field488 + 256) * var27 >> 8;
                            int var30 = (field488 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field164.field400 + var31 >> 7;
                            int var34 = Statics.field164.field404 - var32 >> 7;
                            boolean var35 = method185(Statics.field164.field447[0], Statics.field164.field448[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field493.method2364(var24);
                                field493.method2364(var25);
                                field493.method2365(field581);
                                field493.method2364(57);
                                field493.method2364(field527);
                                field493.method2364(field488);
                                field493.method2364(89);
                                field493.method2365(Statics.field164.field400);
                                field493.method2365(Statics.field164.field404);
                                field493.method2364(field515);
                                field493.method2364(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dn.cw(III)V")
    public static final void method2314(int arg0, int arg1) {
        if (class158.method1540(arg0)) {
            Statics.method1329(Statics.field2670[arg0], arg1);
        }
    }

    @ObfuscatedName("p.cq(Lfh;III)V")
    public static final void method98(class158 arg0, int arg1, int arg2) {
        if (field625 != null || field613 || arg0 == null || method101(arg0) == null) {
            return;
        }
        field625 = arg0;
        field569 = method101(arg0);
        field718 = arg1;
        field710 = arg2;
        Statics.field1012 = 0;
        field636 = false;
    }

    @ObfuscatedName("fu.cz(I)V")
    public static final void method3117() {
        method186(field625);
        Statics.field1012++;
        if (field633 && field630) {
            int var0 = class77.field1365;
            int var1 = class77.field1366;
            int var2 = var0 - field718;
            int var3 = var1 - field710;
            if (var2 < field631) {
                var2 = field631;
            }
            if (field625.field2588 + var2 > field631 + field569.field2588) {
                var2 = field631 + field569.field2588 - field625.field2588;
            }
            if (var3 < field539) {
                var3 = field539;
            }
            if (field625.field2589 + var3 > field539 + field569.field2589) {
                var3 = field539 + field569.field2589 - field625.field2589;
            }
            int var4 = var2 - field634;
            int var5 = var3 - field635;
            int var6 = field625.field2642;
            if (Statics.field1012 > field625.field2618 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field636 = true;
            }
            int var7 = field569.field2572 + (var2 - field631);
            int var8 = field569.field2593 + (var3 - field539);
            if (field625.field2655 != null && field636) {
                class1 var9 = new class1();
                var9.field9 = field625;
                var9.field1 = var7;
                var9.field4 = var8;
                var9.field6 = field625.field2655;
                class26.method116(var9);
            }
            if (class77.field1364 == 0) {
                if (field636) {
                    if (field625.field2656 != null) {
                        class1 var10 = new class1();
                        var10.field9 = field625;
                        var10.field1 = var7;
                        var10.field4 = var8;
                        var10.field3 = field517;
                        var10.field6 = field625.field2656;
                        class26.method116(var10);
                    }
                    if (field517 != null) {
                        class158 var11 = field625;
                        int var12 = class162.method1254(method1523(var11));
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
                                var11 = class158.method1612(var11.field2596);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field493.method2256(244);
                            field493.method2419(field517.field2665);
                            field493.method2407(field517.field2674);
                            field493.method2409(field625.field2674);
                            field493.method2419(field625.field2665);
                        }
                    }
                } else if ((field487 == 1 || method1340(field590 - 1)) && field590 > 2) {
                    method1250();
                } else if (field590 > 0) {
                    method2154(field590 - 1);
                }
                field625 = null;
            }
        } else if (Statics.field1012 > 1) {
            field625 = null;
        }
    }

    @ObfuscatedName("w.cx(Lfh;B)V")
    public static void method186(class158 arg0) {
        if (field656 == arg0.field2695) {
            field657[arg0.field2673] = true;
        }
    }

    @ObfuscatedName("ay.cg(I)V")
    public static void method689() {
        for (class4 var0 = (class4) field615.method3255(); var0 != null; var0 = (class4) field615.method3256()) {
            int var1 = var0.field55;
            if (class158.method1540(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2670[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2578;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2817;
                    class158 var6 = class158.method1612(var5);
                    if (var6 != null) {
                        method186(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.cv(Lfh;B)Lfh;")
    public static class158 method101(class158 arg0) {
        class158 var1 = arg0;
        int var2 = class162.method1254(method1523(arg0));
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
                var1 = class158.method1612(var1.field2596);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class158 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2693;
        }
        return var5;
    }

    @ObfuscatedName("b.ch([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method127(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("b.cf(II)V")
    public static final void method124(int arg0) {
        if (!class158.method1540(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2670[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2640 = 0;
                var3.field2686 = 0;
            }
        }
    }

    @ObfuscatedName("bv.cu([Lfh;II)V")
    public static final void method1513(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2596 == arg1 && (!var3.field2578 || !method35(var3))) {
                if (var3.field2581 == 0) {
                    if (!var3.field2578 && method35(var3) && Statics.field1247 != var3) {
                        continue;
                    }
                    method1513(arg0, var3.field2665);
                    if (var3.field2687 != null) {
                        method1513(var3.field2687, var3.field2665);
                    }
                    class4 var4 = (class4) field615.method3252((long) var3.field2665);
                    if (var4 != null) {
                        int var5 = var4.field55;
                        if (class158.method1540(var5)) {
                            method1513(Statics.field2670[var5], -1);
                        }
                    }
                }
                if (var3.field2581 == 6) {
                    if (var3.field2615 != -1 || var3.field2677 != -1) {
                        boolean var6 = method1219(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2677;
                        } else {
                            var7 = var3.field2615;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method30(var7);
                            var3.field2686 += field532;
                            while (var3.field2686 > var8.field865[var3.field2640]) {
                                var3.field2686 -= var8.field865[var3.field2640];
                                var3.field2640++;
                                if (var3.field2640 >= var8.field863.length) {
                                    var3.field2640 -= var8.field867;
                                    if (var3.field2640 < 0 || var3.field2640 >= var8.field863.length) {
                                        var3.field2640 = 0;
                                    }
                                }
                                method186(var3);
                            }
                        }
                    }
                    if (var3.field2623 != 0 && !var3.field2578) {
                        int var9 = var3.field2623 >> 16;
                        int var10 = var3.field2623 << 16 >> 16;
                        int var11 = field532 * var9;
                        int var12 = field532 * var10;
                        var3.field2619 = var3.field2619 + var11 & 0x7FF;
                        var3.field2632 = var3.field2632 + var12 & 0x7FF;
                        method186(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.cs(IB)V")
    public static final void method104(int arg0) {
        method689();
        for (class7 var1 = (class7) class7.field88.method3276(); var1 != null; var1 = (class7) class7.field88.method3278()) {
            if (var1.field98 != null) {
                var1.method41();
            }
        }
        int var2 = class42.method11(arg0).field1024;
        if (var2 == 0) {
            return;
        }
        int var3 = class159.field2700[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2085(0.9D);
                ((class110) Statics.field1750).method2165(0.9D);
            }
            if (var3 == 2) {
                class104.method2085(0.8D);
                ((class110) Statics.field1750).method2165(0.8D);
            }
            if (var3 == 3) {
                class104.method2085(0.7D);
                ((class110) Statics.field1750).method2165(0.7D);
            }
            if (var3 == 4) {
                class104.method2085(0.6D);
                ((class110) Statics.field1750).method2165(0.6D);
            }
            class40.field967.method3216();
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
            if (field689 != var4) {
                if (field689 == 0 && field690 != -1) {
                    class138.method1509(Statics.field1289, field690, 0, var4, false);
                    field699 = false;
                } else if (var4 == 0) {
                    class138.method2623();
                    field699 = false;
                } else {
                    class138.method1286(var4);
                }
                field689 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field692 = 127;
            }
            if (var3 == 1) {
                field692 = 96;
            }
            if (var3 == 2) {
                field692 = 64;
            }
            if (var3 == 3) {
                field692 = 32;
            }
            if (var3 == 4) {
                field692 = 0;
            }
        }
        if (var2 == 5) {
            field487 = var3;
        }
        if (var2 == 6) {
            field616 = var3;
        }
        if (var2 == 9) {
            field617 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field693 = 127;
        }
        if (var3 == 1) {
            field693 = 96;
        }
        if (var3 == 2) {
            field693 = 64;
        }
        if (var3 == 3) {
            field693 = 32;
        }
        if (var3 == 4) {
            field693 = 0;
        }
    }

    @ObfuscatedName("a.cc(Lfh;B)V")
    public static final void method3(class158 arg0) {
        int var1 = arg0.field2613;
        if (var1 == 324) {
            if (field713 == -1) {
                field713 = arg0.field2602;
                field714 = arg0.field2638;
            }
            if (field516.field2719) {
                arg0.field2602 = field713;
            } else {
                arg0.field2602 = field714;
            }
        } else if (var1 == 325) {
            if (field713 == -1) {
                field713 = arg0.field2602;
                field714 = arg0.field2638;
            }
            if (field516.field2719) {
                arg0.field2602 = field714;
            } else {
                arg0.field2602 = field713;
            }
        } else if (var1 == 327) {
            arg0.field2619 = 150;
            arg0.field2632 = (int) (Math.sin((double) field465 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2675 = 5;
            arg0.field2603 = 0;
        } else if (var1 == 328) {
            arg0.field2619 = 150;
            arg0.field2632 = (int) (Math.sin((double) field465 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2675 = 5;
            arg0.field2603 = 1;
        }
    }

    @ObfuscatedName("ab.cd(I)V")
    public static final void method587() {
        field493.method2256(171);
        for (class4 var0 = (class4) field615.method3255(); var0 != null; var0 = (class4) field615.method3256()) {
            if (var0.field54 == 0 || var0.field54 == 3) {
                method1794(var0, true);
            }
        }
        if (field618 != null) {
            method186(field618);
            field618 = null;
        }
    }

    @ObfuscatedName("cx.ck(Lt;ZI)V")
    public static final void method1794(class4 arg0, boolean arg1) {
        int var2 = arg0.field55;
        int var3 = (int) arg0.field2817;
        arg0.method3311();
        if (arg1) {
            class158.method1354(var2);
        }
        for (class171 var4 = (class171) field654.method3255(); var4 != null; var4 = (class171) field654.method3256()) {
            if ((var4.field2817 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3311();
            }
        }
        class158 var5 = class158.method1612(var3);
        if (var5 != null) {
            method186(var5);
        }
        method1613();
        if (field614 != -1) {
            method2314(field614, 1);
        }
    }

    @ObfuscatedName("as.cp(Lfh;B)Z")
    public static final boolean method550(class158 arg0) {
        int var1 = arg0.field2613;
        if (var1 == 205) {
            field653 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field516.method3146(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field516.method3128(var4, var5 == 1);
        }
        if (var1 == 324) {
            field516.method3151(false);
        }
        if (var1 == 325) {
            field516.method3151(true);
        }
        if (var1 == 326) {
            field493.method2256(187);
            field516.method3129(field493);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bs.cn(IIIILct;B)V")
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1982(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field581 + field527 & 0x7FF;
        int var7 = class104.field1753[var6];
        int var8 = class104.field1754[var6];
        int var9 = var7 * 256 / (field488 + 256);
        int var10 = var8 * 256 / (field488 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1436.method1644(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("cf.ca(IIIILct;I)V")
    public static final void method1982(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field581 + field527 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1753[var5];
        int var8 = class104.field1754[var5];
        int var9 = var7 * 256 / (field488 + 256);
        int var10 = var8 * 256 / (field488 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1647(Statics.field1789, arg0 + 94 + var11 - arg4.field1450 / 2 + 4, arg1 + 83 - var12 - arg4.field1446 / 2 - 4);
        } else {
            arg4.method1633(arg0 + 94 + var11 - arg4.field1450 / 2 + 4, arg1 + 83 - var12 - arg4.field1446 / 2 - 4);
        }
    }

    @ObfuscatedName("q.de(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method91(int arg0, String arg1, String arg2) {
        method82(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("n.do(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method82(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field665[var4] = field665[var4 - 1];
            field666[var4] = field666[var4 - 1];
            field495[var4] = field495[var4 - 1];
            field667[var4] = field667[var4 - 1];
        }
        field665[0] = arg0;
        field666[0] = arg1;
        field495[0] = arg2;
        field667[0] = arg3;
        field589++;
        field644 = field504;
    }

    @ObfuscatedName("y.dj(Ljava/lang/String;B)Z")
    public static boolean method206(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method120(arg0, Statics.field645);
        for (int var2 = 0; var2 < field706; var2++) {
            if (var1.equalsIgnoreCase(class148.method120(field708[var2].field354, Statics.field645))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class148.method120(Statics.field164.field33, Statics.field645))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.du(Ljava/lang/String;B)Z")
    public static boolean method202(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method120(arg0, Statics.field645);
        for (int var2 = 0; var2 < field701; var2++) {
            class11 var3 = field711[var2];
            if (var1.equalsIgnoreCase(class148.method120(var3.field170, Statics.field645))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method120(var3.field166, Statics.field645))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ah.da(Ljava/lang/String;B)V")
    public static final void method225(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method120(arg0, Statics.field645);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field701; var2++) {
            class11 var3 = field711[var2];
            String var4 = var3.field170;
            String var5 = class148.method120(var4, Statics.field645);
            if (class136.method2245(arg0, var1, var4, var5)) {
                field701--;
                for (int var6 = var2; var6 < field701; var6++) {
                    field711[var6] = field711[var6 + 1];
                }
                field698 = field504;
                field493.method2256(24);
                class116 var7 = field493;
                int var8 = arg0.length() + 1;
                var7.method2364(var8);
                field493.method2578(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ce.dk(Lfh;B)I")
    public static int method1523(class158 arg0) {
        class171 var1 = (class171) field654.method3252(((long) arg0.field2665 << 32) + (long) arg0.field2674);
        return var1 == null ? arg0.field2570 : var1.field2799;
    }

    @ObfuscatedName("k.dw(Lfh;B)Z")
    public static boolean method35(class158 arg0) {
        if (field623) {
            if (method1523(arg0) != 0) {
                return false;
            }
            if (arg0.field2581 == 0) {
                return false;
            }
        }
        return arg0.field2591;
    }
}

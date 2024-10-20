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

public final class client extends class72 {

    @ObfuscatedName("client.c")
    public static boolean field469 = true;

    @ObfuscatedName("client.p")
    public static int field470 = 1;

    @ObfuscatedName("client.v")
    public static int field636 = 0;

    @ObfuscatedName("client.g")
    public static boolean field474 = false;

    @ObfuscatedName("client.t")
    public static boolean field475 = false;

    @ObfuscatedName("client.o")
    public static int field476 = 0;

    @ObfuscatedName("client.b")
    public static int field614 = 1;

    @ObfuscatedName("client.k")
    public static int field479 = 0;

    @ObfuscatedName("client.f")
    public static boolean field480 = true;

    @ObfuscatedName("client.e")
    public static int field481 = 0;

    @ObfuscatedName("client.u")
    public static long field482 = 0L;

    @ObfuscatedName("client.q")
    public static int field559 = 0;

    @ObfuscatedName("client.a")
    public static int field624 = 0;

    @ObfuscatedName("client.r")
    public static int field627 = 0;

    @ObfuscatedName("client.w")
    public static class162[] field629 = new class162[4];

    @ObfuscatedName("client.j")
    public static boolean field486 = true;

    @ObfuscatedName("client.s")
    public static boolean field542 = false;

    @ObfuscatedName("client.au")
    public static int field633 = 0;

    @ObfuscatedName("client.ay")
    public static int field734 = 0;

    @ObfuscatedName("client.ar")
    public static int field490 = 0;

    @ObfuscatedName("client.aj")
    public static int field649 = 0;

    @ObfuscatedName("client.ad")
    public static int field495 = 0;

    @ObfuscatedName("client.at")
    public static int field493 = 0;

    @ObfuscatedName("client.as")
    public static int field693 = 0;

    @ObfuscatedName("client.aw")
    public static int field681 = 0;

    @ObfuscatedName("client.ax")
    public static int field496 = 0;

    @ObfuscatedName("client.am")
    public static class126 field497 = new class126(new byte[5000]);

    @ObfuscatedName("client.ae")
    public static int field498 = 0;

    @ObfuscatedName("client.ai")
    public static int field500 = 0;

    @ObfuscatedName("client.ak")
    public static int field501 = 0;

    @ObfuscatedName("client.bl")
    public static int field730 = 0;

    @ObfuscatedName("client.be")
    public static int field504 = 0;

    @ObfuscatedName("client.bz")
    public static int field505 = 0;

    @ObfuscatedName("client.bm")
    public static int field506 = 0;

    @ObfuscatedName("client.bs")
    public static int field507 = 0;

    @ObfuscatedName("client.bb")
    public static class24[] field509 = new class24[32768];

    @ObfuscatedName("client.bx")
    public static int field510 = 0;

    @ObfuscatedName("client.bq")
    public static int[] field511 = new int[32768];

    @ObfuscatedName("client.cn")
    public static class115 field512 = new class115(5000);

    @ObfuscatedName("client.cu")
    public static class115 field513 = new class115(5000);

    @ObfuscatedName("client.cw")
    public static class115 field514 = new class115(5000);

    @ObfuscatedName("client.cb")
    public static int field515 = 0;

    @ObfuscatedName("client.cp")
    public static int field516 = 0;

    @ObfuscatedName("client.cm")
    public static int field517 = 0;

    @ObfuscatedName("client.ci")
    public static int field518 = 0;

    @ObfuscatedName("client.cs")
    public static int field716 = 0;

    @ObfuscatedName("client.cr")
    public static int field520 = 0;

    @ObfuscatedName("client.ct")
    public static int field707 = 0;

    @ObfuscatedName("client.co")
    public static int field680 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field523 = false;

    @ObfuscatedName("client.cg")
    public static int field524 = 0;

    @ObfuscatedName("client.cl")
    public static int field525 = 0;

    @ObfuscatedName("client.cy")
    public static int field526 = 1;

    @ObfuscatedName("client.ca")
    public static int field527 = 0;

    @ObfuscatedName("client.du")
    public static int field528 = 1;

    @ObfuscatedName("client.dw")
    public static int field529 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field594 = false;

    @ObfuscatedName("client.dg")
    public static int[][][] field532 = new int[4][13][13];

    @ObfuscatedName("client.dm")
    public static final int[] field597 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dp")
    public static int field534 = 0;

    @ObfuscatedName("client.dz")
    public static int[][] field535 = new int[104][104];

    @ObfuscatedName("client.dt")
    public static int[][] field519 = new int[104][104];

    @ObfuscatedName("client.do")
    public static int[] field537 = new int[4000];

    @ObfuscatedName("client.ds")
    public static int[] field538 = new int[4000];

    @ObfuscatedName("client.dv")
    public static int field539 = 0;

    @ObfuscatedName("client.di")
    public static int field671 = 2;

    @ObfuscatedName("client.dq")
    public static int field541 = 0;

    @ObfuscatedName("client.dy")
    public static int field655 = 2;

    @ObfuscatedName("client.dc")
    public static int field592 = 0;

    @ObfuscatedName("client.dd")
    public static int field544 = 1;

    @ObfuscatedName("client.df")
    public static int field583 = 0;

    @ObfuscatedName("client.ee")
    public static int field484 = 0;

    @ObfuscatedName("client.ey")
    public static int field547 = 2;

    @ObfuscatedName("client.eo")
    public static int field472 = 0;

    @ObfuscatedName("client.eb")
    public static int field628 = 1;

    @ObfuscatedName("client.ec")
    public static int field550 = 0;

    @ObfuscatedName("client.et")
    public static int field551 = 0;

    @ObfuscatedName("client.eq")
    public static int field554 = 2301979;

    @ObfuscatedName("client.em")
    public static int field555 = 5063219;

    @ObfuscatedName("client.fq")
    public static int field556 = 3353893;

    @ObfuscatedName("client.fi")
    public static int field694 = 7759444;

    @ObfuscatedName("client.fz")
    public static boolean field558 = false;

    @ObfuscatedName("client.fa")
    public static int field491 = 0;

    @ObfuscatedName("client.fg")
    public static int field531 = 128;

    @ObfuscatedName("client.fb")
    public static int field561 = 0;

    @ObfuscatedName("client.fs")
    public static int field562 = 0;

    @ObfuscatedName("client.fw")
    public static int field735 = 0;

    @ObfuscatedName("client.ff")
    public static int field564 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field492 = false;

    @ObfuscatedName("client.ft")
    public static int field566 = 0;

    @ObfuscatedName("client.fy")
    public static int field567 = 0;

    @ObfuscatedName("client.fu")
    public static int field563 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field569 = new int[field563];

    @ObfuscatedName("client.fr")
    public static int[] field468 = new int[field563];

    @ObfuscatedName("client.fp")
    public static int[] field546 = new int[field563];

    @ObfuscatedName("client.fc")
    public static int[] field572 = new int[field563];

    @ObfuscatedName("client.fd")
    public static int[] field596 = new int[field563];

    @ObfuscatedName("client.fh")
    public static int[] field593 = new int[field563];

    @ObfuscatedName("client.gr")
    public static int[] field679 = new int[field563];

    @ObfuscatedName("client.gv")
    public static String[] field543 = new String[field563];

    @ObfuscatedName("client.gm")
    public static int[][] field731 = new int[104][104];

    @ObfuscatedName("client.gj")
    public static int field578 = 0;

    @ObfuscatedName("client.gg")
    public static int field579 = -1;

    @ObfuscatedName("client.gh")
    public static int field580 = -1;

    @ObfuscatedName("client.gl")
    public static int field548 = 0;

    @ObfuscatedName("client.go")
    public static int field678 = 0;

    @ObfuscatedName("client.gi")
    public static int field648 = 0;

    @ObfuscatedName("client.gt")
    public static int field584 = 0;

    @ObfuscatedName("client.gb")
    public static int field585 = 0;

    @ObfuscatedName("client.gs")
    public static int field586 = 0;

    @ObfuscatedName("client.gz")
    public static int field587 = 0;

    @ObfuscatedName("client.ga")
    public static int field581 = 0;

    @ObfuscatedName("client.gk")
    public static int field589 = 0;

    @ObfuscatedName("client.gx")
    public static int field642 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field591 = false;

    @ObfuscatedName("client.gd")
    public static int field601 = 0;

    @ObfuscatedName("client.gw")
    public static int field557 = 0;

    @ObfuscatedName("client.gp")
    public static class3[] field660 = new class3[2048];

    @ObfuscatedName("client.gy")
    public static int field576 = 0;

    @ObfuscatedName("client.he")
    public static int[] field698 = new int[2048];

    @ObfuscatedName("client.hg")
    public static int field635 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field487 = new int[2048];

    @ObfuscatedName("client.hh")
    public static class126[] field552 = new class126[2048];

    @ObfuscatedName("client.hx")
    public static int field600 = -1;

    @ObfuscatedName("client.hn")
    public static int field571 = 0;

    @ObfuscatedName("client.hq")
    public static int field602 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field603 = new int[1000];

    @ObfuscatedName("client.hd")
    public static final int[] field604 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ha")
    public static String[] field605 = new String[8];

    @ObfuscatedName("client.hj")
    public static boolean[] field574 = new boolean[8];

    @ObfuscatedName("client.ht")
    public static int[] field533 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static class175[][][] field608 = new class175[4][104][104];

    @ObfuscatedName("client.hc")
    public static class175 field609 = new class175();

    @ObfuscatedName("client.hz")
    public static class175 field606 = new class175();

    @ObfuscatedName("client.hp")
    public static class175 field611 = new class175();

    @ObfuscatedName("client.hm")
    public static int[] field522 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field613 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field727 = new int[25];

    @ObfuscatedName("client.hr")
    public static int field615 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field616 = false;

    @ObfuscatedName("client.ig")
    public static int field617 = 0;

    @ObfuscatedName("client.iw")
    public static int[] field618 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field619 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field620 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field621 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field477 = new String[500];

    @ObfuscatedName("client.il")
    public static String[] field623 = new String[500];

    @ObfuscatedName("client.ip")
    public static int field488 = -1;

    @ObfuscatedName("client.iq")
    public static int field570 = -1;

    @ObfuscatedName("client.ih")
    public static int field626 = 0;

    @ObfuscatedName("client.iy")
    public static int field483 = 50;

    @ObfuscatedName("client.io")
    public static int field672 = 0;

    @ObfuscatedName("client.it")
    public static String field612 = null;

    @ObfuscatedName("client.ix")
    public static boolean field630 = false;

    @ObfuscatedName("client.ii")
    public static int field631 = -1;

    @ObfuscatedName("client.iv")
    public static String field632 = null;

    @ObfuscatedName("client.jr")
    public static String field599 = null;

    @ObfuscatedName("client.jk")
    public static int field634 = -1;

    @ObfuscatedName("client.je")
    public static class173 field712 = new class173(8);

    @ObfuscatedName("client.jj")
    public static int field503 = 0;

    @ObfuscatedName("client.jb")
    public static int field637 = 0;

    @ObfuscatedName("client.jq")
    public static class156 field638 = null;

    @ObfuscatedName("client.jp")
    public static int field639 = 0;

    @ObfuscatedName("client.jv")
    public static int field640 = 0;

    @ObfuscatedName("client.ja")
    public static int field641 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field573 = false;

    @ObfuscatedName("client.jf")
    public static boolean field643 = false;

    @ObfuscatedName("client.jl")
    public static boolean field724 = false;

    @ObfuscatedName("client.jc")
    public static class156 field489 = null;

    @ObfuscatedName("client.jg")
    public static class156 field646 = null;

    @ObfuscatedName("client.ju")
    public static int field647 = 0;

    @ObfuscatedName("client.jd")
    public static int field549 = 0;

    @ObfuscatedName("client.jz")
    public static class156 field536 = null;

    @ObfuscatedName("client.jy")
    public static boolean field607 = false;

    @ObfuscatedName("client.jx")
    public static int field651 = -1;

    @ObfuscatedName("client.js")
    public static int field652 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field653 = false;

    @ObfuscatedName("client.ji")
    public static int field654 = -1;

    @ObfuscatedName("client.jo")
    public static int field622 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field656 = false;

    @ObfuscatedName("client.kw")
    public static int field657 = 1;

    @ObfuscatedName("client.ky")
    public static int[] field658 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field659 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field595 = new int[32];

    @ObfuscatedName("client.km")
    public static int field661 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field662 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field663 = 0;

    @ObfuscatedName("client.ka")
    public static int field485 = 0;

    @ObfuscatedName("client.kl")
    public static int field665 = 0;

    @ObfuscatedName("client.kv")
    public static int field666 = 0;

    @ObfuscatedName("client.kp")
    public static int field667 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field668 = new int[2000];

    @ObfuscatedName("client.kd")
    public static String[] field568 = new String[1000];

    @ObfuscatedName("client.kg")
    public static int field715 = 0;

    @ObfuscatedName("client.kq")
    public static class175 field588 = new class175();

    @ObfuscatedName("client.ks")
    public static class175 field598 = new class175();

    @ObfuscatedName("client.kb")
    public static class175 field714 = new class175();

    @ObfuscatedName("client.ko")
    public static class173 field674 = new class173(512);

    @ObfuscatedName("client.kh")
    public static int field675 = 0;

    @ObfuscatedName("client.kx")
    public static int field676 = -2;

    @ObfuscatedName("client.ln")
    public static boolean[] field645 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field582 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field553 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static int[] field644 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field545 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field682 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field683 = new int[100];

    @ObfuscatedName("client.lj")
    public static int field684 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field685 = new int[100];

    @ObfuscatedName("client.lr")
    public static String[] field686 = new String[100];

    @ObfuscatedName("client.la")
    public static String[] field687 = new String[100];

    @ObfuscatedName("client.lw")
    public static String[] field688 = new String[100];

    @ObfuscatedName("client.lm")
    public static int field689 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field690 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ld")
    public static int field691 = 0;

    @ObfuscatedName("client.lp")
    public static int field692 = 0;

    @ObfuscatedName("client.lz")
    public static long[] field590 = new long[100];

    @ObfuscatedName("client.lv")
    public static int field577 = 0;

    @ObfuscatedName("client.le")
    public static int field650 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field696 = new int[128];

    @ObfuscatedName("client.lh")
    public static int[] field697 = new int[128];

    @ObfuscatedName("client.li")
    public static String field669 = null;

    @ObfuscatedName("client.mh")
    public static String field699 = null;

    @ObfuscatedName("client.ms")
    public static int field700 = -1;

    @ObfuscatedName("client.mp")
    public static int field701 = 0;

    @ObfuscatedName("client.mo")
    public static int[] field702 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field703 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class85[] field704 = new class85[1000];

    @ObfuscatedName("client.mk")
    public static int field705 = 0;

    @ObfuscatedName("client.ma")
    public static int field706 = 0;

    @ObfuscatedName("client.mx")
    public static int field708 = 0;

    @ObfuscatedName("client.md")
    public static int field709 = 255;

    @ObfuscatedName("client.mq")
    public static int field710 = -1;

    @ObfuscatedName("client.me")
    public static boolean field711 = false;

    @ObfuscatedName("client.mn")
    public static int field540 = 127;

    @ObfuscatedName("client.mj")
    public static int field713 = 127;

    @ObfuscatedName("client.nb")
    public static int field473 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field670 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field673 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field717 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field718 = new int[50];

    @ObfuscatedName("client.nq")
    public static class56[] field719 = new class56[50];

    @ObfuscatedName("client.nk")
    public static boolean field720 = false;

    @ObfuscatedName("client.nj")
    public static boolean[] field721 = new boolean[5];

    @ObfuscatedName("client.nh")
    public static int[] field722 = new int[5];

    @ObfuscatedName("client.nt")
    public static int[] field677 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field530 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field725 = new int[5];

    @ObfuscatedName("client.ol")
    public static int field726 = 0;

    @ObfuscatedName("client.oi")
    public static int field610 = 0;

    @ObfuscatedName("client.ok")
    public static class22[] field728 = new class22[200];

    @ObfuscatedName("client.og")
    public static class171 field729 = new class171();

    @ObfuscatedName("client.ov")
    public static int field695 = 0;

    @ObfuscatedName("client.oq")
    public static class11[] field478 = new class11[100];

    @ObfuscatedName("client.oc")
    public static class161 field732 = new class161();

    @ObfuscatedName("client.on")
    public static int field733 = -1;

    @ObfuscatedName("client.oy")
    public static int field625 = -1;

    @ObfuscatedName("client.l(I)V")
    public final void method254() {
    }

    public final void init() {
        if (!this.method1404()) {
            return;
        }
        class165[] var1 = class165.method92();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class165 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2721);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2721)) {
                    case 1:
                        field636 = Integer.parseInt(var4);
                        break;
                    case 2:
                        field470 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field494 = var4;
                        break;
                    case 4:
                        class132[] var5 = class132.method1222();
                        int var6 = Integer.parseInt(var4);
                        class132[] var7 = var5;
                        int var8 = 0;
                        class132 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class132 var9 = var7[var8];
                            if (var6 == var9.method2342()) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field140 = (class132) var10;
                        if (Statics.field140 == class132.field2038) {
                            Statics.field560 = class184.field2806;
                        } else {
                            Statics.field560 = class184.field2799;
                        }
                        break;
                    case 5:
                        field476 = Integer.parseInt(var4);
                        break;
                    case 6:
                        Statics.field471 = class131.method214(Integer.parseInt(var4));
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field33)) {
                            field474 = true;
                        } else {
                            field474 = false;
                        }
                    case 8:
                    default:
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field33)) {
                            field614 = 1;
                        } else {
                            field614 = 0;
                        }
                }
            }
        }
        class94.field1559 = false;
        field475 = false;
        Statics.field508 = this.getCodeBase().getHost();
        String var11 = Statics.field471.field2030;
        byte var12 = 0;
        try {
            Statics.field1277 = 16;
            Statics.field375 = var12;
            try {
                Statics.field99 = System.getProperty("os.name");
            } catch (Exception var32) {
                Statics.field99 = "Unknown";
            }
            Statics.field1428 = Statics.field99.toLowerCase();
            try {
                Statics.field278 = System.getProperty("user.home");
                if (Statics.field278 != null) {
                    Statics.field278 = Statics.field278 + "/";
                }
            } catch (Exception var31) {
            }
            try {
                if (Statics.field1428.startsWith("win")) {
                    if (Statics.field278 == null) {
                        Statics.field278 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field278 == null) {
                    Statics.field278 = System.getenv("HOME");
                }
                if (Statics.field278 != null) {
                    Statics.field278 = Statics.field278 + "/";
                }
            } catch (Exception var30) {
            }
            if (Statics.field278 == null) {
                Statics.field278 = "~/";
            }
            Statics.field388 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field278, "/tmp/", "" };
            Statics.field293 = new String[] { ".jagex_cache_" + Statics.field375, ".file_store_" + Statics.field375 };
            label152: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field1425 = class81.method1381("oldschool", var11, var16);
                if (!Statics.field1425.exists()) {
                    Statics.field1425.mkdirs();
                }
                File[] var17 = Statics.field1425.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label152;
                    }
                    File var20 = var18[var19];
                    if (!class81.method234(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            class71.method582(Statics.field1425);
            try {
                File var21 = new File(Statics.field278, "random.dat");
                if (var21.exists()) {
                    class81.field1432 = new class29(new class28(var21, "rw", 25L), 24, 0);
                } else {
                    label132: for (int var22 = 0; var22 < Statics.field293.length; var22++) {
                        for (int var23 = 0; var23 < Statics.field388.length; var23++) {
                            File var24 = new File(Statics.field388[var23] + Statics.field293[var22] + File.separatorChar + "random.dat");
                            if (var24.exists()) {
                                class81.field1432 = new class29(new class28(var24, "rw", 25L), 24, 0);
                                break label132;
                            }
                        }
                    }
                }
                if (class81.field1432 == null) {
                    RandomAccessFile var25 = new RandomAccessFile(var21, "rw");
                    int var26 = var25.read();
                    var25.seek(0L);
                    var25.write(var26);
                    var25.seek(0L);
                    var25.close();
                    class81.field1432 = new class29(new class28(var21, "rw", 25L), 24, 0);
                }
            } catch (IOException var33) {
            }
            class81.field1434 = new class29(new class28(class71.method2712("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class81.field1429 = new class29(new class28(class71.method2712("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1421 = new class29[Statics.field1277];
            for (int var28 = 0; var28 < Statics.field1277; var28++) {
                Statics.field1421[var28] = new class29(new class28(class71.method2712("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var34) {
            class79.method218((String) null, var34);
        }
        Statics.field664 = this;
        this.method1402(765, 503, 4);
    }

    @ObfuscatedName("client.g(B)V")
    public final void method354() {
        Statics.field2022 = field636 == 0 ? 43594 : field470 + 40000;
        Statics.field736 = field636 == 0 ? 443 : field470 + 50000;
        Statics.field1269 = Statics.field2022;
        Statics.field2660 = class159.field2648;
        Statics.field2665 = class159.field2646;
        Statics.field2662 = class159.field2647;
        Statics.field1512 = class159.field2649;
        if (Statics.field2638.toLowerCase().indexOf("microsoft") == -1) {
            class74.field1351[44] = 71;
            class74.field1351[45] = 26;
            class74.field1351[46] = 72;
            class74.field1351[47] = 73;
            class74.field1351[59] = 57;
            class74.field1351[61] = 27;
            class74.field1351[91] = 42;
            class74.field1351[92] = 74;
            class74.field1351[93] = 43;
            class74.field1351[192] = 28;
            class74.field1351[222] = 58;
            class74.field1351[520] = 59;
        } else {
            class74.field1351[186] = 57;
            class74.field1351[187] = 27;
            class74.field1351[188] = 71;
            class74.field1351[189] = 26;
            class74.field1351[190] = 72;
            class74.field1351[191] = 73;
            class74.field1351[192] = 58;
            class74.field1351[219] = 42;
            class74.field1351[220] = 74;
            class74.field1351[221] = 43;
            class74.field1351[222] = 59;
            class74.field1351[223] = 28;
        }
        class74.method21(Statics.field1780);
        Canvas var1 = Statics.field1780;
        var1.addMouseListener(class76.field1396);
        var1.addMouseMotionListener(class76.field1396);
        var1.addFocusListener(class76.field1396);
        Statics.field1260 = class65.method11();
        if (Statics.field1260 != null) {
            Statics.field1260.method1332(Statics.field1780);
        }
        Statics.field1336 = new class70(255, class81.field1434, class81.field1429, 500000);
        if (field636 != 0) {
            field542 = true;
        }
    }

    @ObfuscatedName("client.t(B)V")
    public final void method257() {
        field481++;
        this.method293();
        class155.method2917();
        class137.method2667();
        method614();
        class74.method118();
        class76.method1380();
        if (Statics.field1260 != null) {
            int var1 = Statics.field1260.method1335();
            field715 = var1;
        }
        if (field479 == 0) {
            method2025();
            Statics.field245.method1327();
            for (int var2 = 0; var2 < 32; var2++) {
                field1320[var2] = 0L;
            }
            for (int var3 = 0; var3 < 32; var3++) {
                field1321[var3] = 0L;
            }
            Statics.field1506 = 0;
        } else if (field479 == 5) {
            class20.method805(this);
            method2025();
            Statics.field245.method1327();
            for (int var4 = 0; var4 < 32; var4++) {
                field1320[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field1321[var5] = 0L;
            }
            Statics.field1506 = 0;
        } else if (field479 == 10) {
            class20.method805(this);
        } else if (field479 == 20) {
            class20.method805(this);
            Statics.method2173();
        } else if (field479 == 25) {
            method2192();
        }
        if (field479 == 30) {
            method3226();
        } else if (field479 == 40) {
            Statics.method2173();
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method274() {
        boolean var1 = class137.method40();
        if (var1 && field711 && Statics.field372 != null) {
            Statics.field372.method1153();
        }
        if (field1324) {
            Canvas var2 = Statics.field1780;
            var2.removeKeyListener(class74.field1362);
            var2.removeFocusListener(class74.field1362);
            class74.field1364 = -1;
            Canvas var3 = Statics.field1780;
            var3.removeMouseListener(class76.field1396);
            var3.removeMouseMotionListener(class76.field1396);
            var3.removeFocusListener(class76.field1396);
            class76.field1392 = 0;
            if (Statics.field1260 != null) {
                Statics.field1260.method1334(Statics.field1780);
            }
            this.method1423();
            class74.method21(Statics.field1780);
            Canvas var4 = Statics.field1780;
            var4.addMouseListener(class76.field1396);
            var4.addMouseMotionListener(class76.field1396);
            var4.addFocusListener(class76.field1396);
            if (Statics.field1260 != null) {
                Statics.field1260.method1332(Statics.field1780);
            }
        }
        if (field479 == 0) {
            class72.method1391(class20.field300, class20.field315, (Color) null);
        } else if (field479 == 5) {
            class20.method5(Statics.field914, Statics.field2300);
        } else if (field479 == 10) {
            class20.method5(Statics.field914, Statics.field2300);
        } else if (field479 == 20) {
            class20.method5(Statics.field914, Statics.field2300);
        } else if (field479 == 25) {
            if (field529 == 1) {
                if (field525 > field526) {
                    field526 = field525;
                }
                int var5 = (field526 * 50 - field525 * 50) / field526;
                Statics.method208(class133.field2047 + class2.field21 + class2.field24 + var5 + "%" + class2.field30, false);
            } else if (field529 == 2) {
                if (field527 > field528) {
                    field528 = field527;
                }
                int var6 = (field528 * 50 - field527 * 50) / field528 + 50;
                Statics.method208(class133.field2047 + class2.field21 + class2.field24 + var6 + "%" + class2.field30, false);
            } else {
                Statics.method208(class133.field2047, false);
            }
        } else if (field479 == 30) {
            if (!field616) {
                field477[0] = class133.field2254;
                field623[0] = "";
                field620[0] = 1006;
                field617 = 1;
            }
            if (field634 != -1) {
                method2208(field634);
            }
            for (int var7 = 0; var7 < field675; var7++) {
                if (field645[var7]) {
                    field582[var7] = true;
                }
                field553[var7] = field645[var7];
                field645[var7] = false;
            }
            field676 = field481;
            field488 = -1;
            field570 = -1;
            Statics.field2316 = null;
            if (field634 != -1) {
                field675 = 0;
                method1182(field634, 0, 0, 765, 503, 0, 0, -1);
            }
            class88.method1754();
            boolean var8 = false;
            while (!var8) {
                var8 = true;
                for (int var9 = 0; var9 < field617 - 1; var9++) {
                    if (field620[var9] < 1000 && field620[var9 + 1] > 1000) {
                        String var10 = field623[var9];
                        field623[var9] = field623[var9 + 1];
                        field623[var9 + 1] = var10;
                        String var11 = field477[var9];
                        field477[var9] = field477[var9 + 1];
                        field477[var9 + 1] = var11;
                        int var12 = field620[var9];
                        field620[var9] = field620[var9 + 1];
                        field620[var9 + 1] = var12;
                        int var13 = field618[var9];
                        field618[var9] = field618[var9 + 1];
                        field618[var9 + 1] = var13;
                        int var14 = field619[var9];
                        field619[var9] = field619[var9 + 1];
                        field619[var9 + 1] = var14;
                        int var15 = field621[var9];
                        field621[var9] = field621[var9 + 1];
                        field621[var9 + 1] = var15;
                        var8 = false;
                    }
                }
            }
            if (field616) {
                int var19 = Statics.field187;
                int var20 = Statics.field284;
                int var21 = Statics.field1503;
                int var22 = Statics.field1504;
                int var23 = 6116423;
                class88.method1761(var19, var20, var21, var22, var23);
                class88.method1761(var19 + 1, var20 + 1, var21 - 2, 16, 0);
                class88.method1763(var19 + 1, var20 + 18, var21 - 2, var22 - 19, 0);
                Statics.field914.method3408(class133.field2214, var19 + 3, var20 + 14, var23, -1);
                int var24 = class76.field1389;
                int var25 = class76.field1390;
                for (int var26 = 0; var26 < field617; var26++) {
                    int var27 = (field617 - 1 - var26) * 15 + var20 + 31;
                    int var28 = 16777215;
                    if (var24 > var19 && var24 < var19 + var21 && var25 > var27 - 13 && var25 < var27 + 3) {
                        var28 = 16776960;
                    }
                    Statics.field914.method3408(method1181(var26), var19 + 3, var27, var28, 0);
                }
                method209(Statics.field187, Statics.field284, Statics.field1503, Statics.field1504);
            } else if (field488 != -1) {
                int var16 = field488;
                int var17 = field570;
                if (field617 >= 2 || field672 != 0 || field630) {
                    String var18;
                    if (field672 == 1 && field617 < 2) {
                        var18 = class133.field2121 + class133.field2043 + field612 + " " + class2.field25;
                    } else if (field630 && field617 < 2) {
                        var18 = field632 + class133.field2043 + field599 + " " + class2.field25;
                    } else {
                        var18 = method1181(field617 - 1);
                    }
                    if (field617 > 2) {
                        var18 = var18 + class2.method644(16777215) + " " + '/' + " " + (field617 - 2) + class133.field2118;
                    }
                    Statics.field914.method3404(var18, var16 + 4, var17 + 15, 16777215, 0, field481 / 1000);
                }
            }
            if (field684 == 3) {
                for (int var29 = 0; var29 < field675; var29++) {
                    if (field553[var29]) {
                        class88.method1760(field644[var29], field545[var29], field682[var29], field683[var29], 16711935, 128);
                    } else if (field582[var29]) {
                        class88.method1760(field644[var29], field545[var29], field682[var29], field683[var29], 16711680, 128);
                    }
                }
            }
            class7.method1834(Statics.field244, Statics.field1033.field448, Statics.field1033.field410, field551);
            field551 = 0;
        } else if (field479 == 40) {
            Statics.method208(class133.field2156 + class2.field21 + class133.field2049, false);
        }
        if (field479 == 30 && field684 == 0 && !field1322) {
            try {
                Graphics var30 = Statics.field1780.getGraphics();
                for (int var31 = 0; var31 < field675; var31++) {
                    if (field582[var31]) {
                        Statics.field87.method1593(var30, field644[var31], field545[var31], field682[var31], field683[var31]);
                        field582[var31] = false;
                    }
                }
            } catch (Exception var37) {
                Statics.field1780.repaint();
            }
        } else if (field479 > 0) {
            try {
                Graphics var33 = Statics.field1780.getGraphics();
                Statics.field87.method1592(var33, 0, 0);
                field1322 = false;
                for (int var34 = 0; var34 < field675; var34++) {
                    field582[var34] = false;
                }
            } catch (Exception var36) {
                Statics.field1780.repaint();
            }
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method259() {
        if (Statics.field1797 != null) {
            Statics.field1797.field243 = false;
        }
        Statics.field1797 = null;
        if (Statics.field2287 != null) {
            Statics.field2287.method1359();
            Statics.field2287 = null;
        }
        if (class74.field1362 != null) {
            class74 var1 = class74.field1362;
            synchronized (class74.field1362) {
                class74.field1362 = null;
            }
        }
        if (class76.field1396 != null) {
            class76 var3 = class76.field1396;
            synchronized (class76.field1396) {
                class76.field1396 = null;
            }
        }
        Statics.field1260 = null;
        if (Statics.field372 != null) {
            Statics.field372.method1159();
        }
        if (Statics.field1293 != null) {
            Statics.field1293.method1159();
        }
        class151.method2102();
        Object var5 = class155.field2500;
        synchronized (class155.field2500) {
            if (class155.field2499 != 0) {
                class155.field2499 = 1;
                try {
                    class155.field2500.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        try {
            class81.field1434.method590();
            for (int var8 = 0; var8 < Statics.field1277; var8++) {
                Statics.field1421[var8].method590();
            }
            class81.field1429.method590();
            class81.field1432.method590();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("z.d(IS)V")
    public static void method2(int arg0) {
        if (field479 == arg0) {
            return;
        }
        if (field479 == 0) {
            class72.method12();
        }
        if (arg0 == 20 || arg0 == 40) {
            field504 = 0;
            field505 = 0;
            field506 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field116 != null) {
            Statics.field116.method1359();
            Statics.field116 = null;
        }
        if (field479 == 25) {
            field529 = 0;
            field525 = 0;
            field526 = 1;
            field527 = 0;
            field528 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1780;
            class152 var2 = Statics.field1399;
            class152 var3 = Statics.field1288;
            if (!Statics.field304) {
                class88.method1758();
                byte[] var4 = var2.method2968("title.jpg", "");
                Statics.field1768 = new class85(var4, var1);
                Statics.field324 = Statics.field1768.method1666();
                Statics.field301 = class83.method4(var3, "logo", "");
                Statics.field298 = class83.method4(var3, "titlebox", "");
                Statics.field1800 = class83.method4(var3, "titlebutton", "");
                Statics.field319 = class83.method144(var3, "runes", "");
                Statics.field302 = class83.method144(var3, "title_mute", "");
                Statics.field371 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field371[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field371[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field371[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field371[var8 + 192] = 16777215;
                }
                Statics.field1995 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field1995[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field1995[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field1995[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field1995[var12 + 192] = 16777215;
                }
                Statics.field336 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field336[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field336[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field336[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field336[var16 + 192] = 16777215;
                }
                Statics.field1786 = new int[256];
                Statics.field345 = new int[32768];
                Statics.field1911 = new int[32768];
                class20.method123((class86) null);
                Statics.field403 = new int[32768];
                Statics.field1339 = new int[32768];
                class20.field316 = 0;
                class20.field323 = "";
                class20.field307 = "";
                class20.field314 = false;
                if (field709 == 0) {
                    class20.field331 = true;
                } else {
                    class20.field331 = false;
                }
                if (class20.field331) {
                    class137.field2294 = 1;
                    Statics.field2288 = null;
                    Statics.field2295 = -1;
                    Statics.field2292 = -1;
                    Statics.field2297 = 0;
                    Statics.field355 = false;
                    Statics.field2298 = 2;
                } else {
                    class137.method148(2, Statics.field1979, "scape main", "", 255, false);
                }
                class151.method2666(false);
                Statics.field304 = true;
                Statics.field1768.method1673(0, 0);
                Statics.field324.method1673(382, 0);
                Statics.field301.method1742(382 - Statics.field301.field1468 / 2, 18);
            }
        } else if (Statics.field304) {
            Statics.field298 = null;
            Statics.field1800 = null;
            Statics.field319 = null;
            Statics.field1768 = null;
            Statics.field324 = null;
            Statics.field301 = null;
            Statics.field302 = null;
            Statics.field1198 = null;
            Statics.field182 = null;
            Statics.field2635 = null;
            Statics.field1038 = null;
            Statics.field1357 = null;
            Statics.field371 = null;
            Statics.field1995 = null;
            Statics.field336 = null;
            Statics.field1786 = null;
            Statics.field345 = null;
            Statics.field1911 = null;
            Statics.field403 = null;
            Statics.field1339 = null;
            class137.method1399(2);
            class151.method2666(true);
            Statics.field304 = false;
        }
        field479 = arg0;
    }

    @ObfuscatedName("client.k(I)V")
    public void method293() {
        if (field479 == 1000) {
            return;
        }
        long var1 = class120.method228();
        int var3 = (int) (var1 - Statics.field2462);
        Statics.field2462 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2450 += var3;
        boolean var4;
        if (class151.field2459 == 0 && class151.field2455 == 0 && class151.field2457 == 0 && class151.field2453 == 0) {
            var4 = true;
        } else if (Statics.field2454 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class151.field2450 > 30000) {
                        throw new IOException();
                    }
                    while (class151.field2455 < 20 && class151.field2453 > 0) {
                        class153 var5 = (class153) class151.field2452.method3285();
                        class126 var6 = new class126(4);
                        var6.method2462(1);
                        var6.method2439((int) var5.field2755);
                        Statics.field2454.method1363(var6.field2007, 0, 4);
                        class151.field2458.method3283(var5, var5.field2755);
                        class151.field2453--;
                        class151.field2455++;
                    }
                    while (class151.field2459 < 20 && class151.field2457 > 0) {
                        class153 var7 = (class153) class151.field2456.method3251();
                        class126 var8 = new class126(4);
                        var8.method2462(0);
                        var8.method2439((int) var7.field2755);
                        Statics.field2454.method1363(var8.field2007, 0, 4);
                        var7.method3280();
                        class151.field2465.method3283(var7, var7.field2755);
                        class151.field2457--;
                        class151.field2459++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2454.method1360();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class151.field2450 = 0;
                        byte var11 = 0;
                        if (Statics.field82 == null) {
                            var11 = 8;
                        } else if (class151.field2460 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class151.field2461.field2003;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2454.method1374(class151.field2461.field2007, class151.field2461.field2003, var12);
                            if (class151.field2466 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class151.field2461.field2007[class151.field2461.field2003 + var13] ^= class151.field2466;
                                }
                            }
                            class151.field2461.field2003 += var12;
                            if (class151.field2461.field2003 < var11) {
                                break;
                            }
                            if (Statics.field82 == null) {
                                class151.field2461.field2003 = 0;
                                int var14 = class151.field2461.method2450();
                                int var15 = class151.field2461.method2627();
                                int var16 = class151.field2461.method2450();
                                int var17 = class151.field2461.method2467();
                                long var18 = (long) ((var14 << 16) + var15);
                                class153 var20 = (class153) class151.field2458.method3281(var18);
                                Statics.field750 = true;
                                if (var20 == null) {
                                    var20 = (class153) class151.field2465.method3281(var18);
                                    Statics.field750 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field82 = var20;
                                Statics.field352 = new class126(var17 + var21 + Statics.field82.field2486);
                                Statics.field352.method2462(var16);
                                Statics.field352.method2456(var17);
                                class151.field2460 = 8;
                                class151.field2461.field2003 = 0;
                            } else if (class151.field2460 == 0) {
                                if (class151.field2461.field2007[0] == -1) {
                                    class151.field2460 = 1;
                                    class151.field2461.field2003 = 0;
                                } else {
                                    Statics.field82 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field352.field2007.length - Statics.field82.field2486;
                            int var23 = 512 - class151.field2460;
                            if (var23 > var22 - Statics.field352.field2003) {
                                var23 = var22 - Statics.field352.field2003;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2454.method1374(Statics.field352.field2007, Statics.field352.field2003, var23);
                            if (class151.field2466 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field352.field2007[Statics.field352.field2003 + var24] ^= class151.field2466;
                                }
                            }
                            Statics.field352.field2003 += var23;
                            class151.field2460 += var23;
                            if (Statics.field352.field2003 == var22) {
                                if (Statics.field82.field2755 == 16711935L) {
                                    Statics.field2449 = Statics.field352;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class152 var26 = class151.field2464[var25];
                                        if (var26 != null) {
                                            Statics.field2449.field2003 = var25 * 8 + 5;
                                            int var27 = Statics.field2449.method2467();
                                            int var28 = Statics.field2449.method2467();
                                            var26.method3036(var27, var28);
                                        }
                                    }
                                } else {
                                    class151.field2463.reset();
                                    class151.field2463.update(Statics.field352.field2007, 0, var22);
                                    int var29 = (int) class151.field2463.getValue();
                                    if (Statics.field82.field2484 != var29) {
                                        try {
                                            Statics.field2454.method1359();
                                        } catch (Exception var35) {
                                        }
                                        class151.field2467++;
                                        Statics.field2454 = null;
                                        class151.field2466 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class151.field2467 = 0;
                                    class151.field2468 = 0;
                                    Statics.field82.field2485.method3053((int) (Statics.field82.field2755 & 0xFFFFL), Statics.field352.field2007, (Statics.field82.field2755 & 0xFF0000L) == 16711680L, Statics.field750);
                                }
                                Statics.field82.method3346();
                                if (Statics.field750) {
                                    class151.field2455--;
                                } else {
                                    class151.field2459--;
                                }
                                class151.field2460 = 0;
                                Statics.field82 = null;
                                Statics.field352 = null;
                            } else {
                                if (class151.field2460 != 512) {
                                    break;
                                }
                                class151.field2460 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2454.method1359();
                } catch (Exception var34) {
                }
                class151.field2468++;
                Statics.field2454 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method261();
        }
    }

    @ObfuscatedName("client.f(I)V")
    public void method261() {
        if (class151.field2467 >= 4) {
            this.method1414("js5crc");
            field479 = 1000;
            return;
        }
        if (class151.field2468 >= 4) {
            if (field479 <= 5) {
                this.method1414("js5io");
                field479 = 1000;
                return;
            }
            field501 = 3000;
            class151.field2468 = 3;
        }
        if (--field501 + 1 > 0) {
            return;
        }
        try {
            if (field500 == 0) {
                Statics.field1042 = Statics.field1445.method1477(Statics.field508, Statics.field1269);
                field500++;
            }
            if (field500 == 1) {
                if (Statics.field1042.field1408 == 2) {
                    this.method262(-1);
                    return;
                }
                if (Statics.field1042.field1408 == 1) {
                    field500++;
                }
            }
            if (field500 == 2) {
                Statics.field499 = new class69((Socket) Statics.field1042.field1411, Statics.field1445);
                class126 var1 = new class126(5);
                var1.method2462(15);
                var1.method2456(4);
                Statics.field499.method1363(var1.field2007, 0, 5);
                field500++;
                Statics.field2273 = class120.method228();
            }
            if (field500 == 3) {
                if (field479 <= 5 || Statics.field499.method1360() > 0) {
                    int var2 = Statics.field499.method1369();
                    if (var2 != 0) {
                        this.method262(var2);
                        return;
                    }
                    field500++;
                } else if (class120.method228() - Statics.field2273 > 30000L) {
                    this.method262(-2);
                    return;
                }
            }
            if (field500 == 4) {
                class151.method1649(Statics.field499, field479 > 20);
                Statics.field1042 = null;
                Statics.field499 = null;
                field500 = 0;
                field730 = 0;
            }
        } catch (IOException var4) {
            this.method262(-3);
        }
    }

    @ObfuscatedName("client.e(IB)V")
    public void method262(int arg0) {
        Statics.field1042 = null;
        Statics.field499 = null;
        field500 = 0;
        if (Statics.field2022 == Statics.field1269) {
            Statics.field1269 = Statics.field736;
        } else {
            Statics.field1269 = Statics.field2022;
        }
        field730++;
        if (field730 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field479 <= 5) {
                this.method1414("js5connect_full");
                field479 = 1000;
            } else {
                field501 = 3000;
            }
        } else if (field730 >= 2 && arg0 == 6) {
            this.method1414("js5connect_outofdate");
            field479 = 1000;
        } else if (field730 >= 4) {
            if (field479 <= 5) {
                this.method1414("js5connect");
                field479 = 1000;
            } else {
                field501 = 3000;
            }
        }
    }

    @ObfuscatedName("cx.u(I)V")
    public static void method2025() {
        if (field498 == 0) {
            Statics.field2020 = new class94(4, 104, 104, class9.field121);
            for (int var0 = 0; var0 < 4; var0++) {
                field629[var0] = new class162(104, 104);
            }
            Statics.field1453 = new class85(512, 512);
            class20.field315 = class133.field2050;
            class20.field300 = 5;
            field498 = 20;
        } else if (field498 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class103.field1757[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class94.method1871(var1, 500, 800, 512, 334);
            class20.field315 = class133.field2221;
            class20.field300 = 10;
            field498 = 30;
        } else if (field498 == 30) {
            Statics.field723 = method215(0, false, true, true);
            Statics.field224 = method215(1, false, true, true);
            Statics.field502 = method215(2, true, false, true);
            Statics.field2291 = method215(3, false, true, true);
            Statics.field2348 = method215(4, false, true, true);
            Statics.field330 = method215(5, true, true, true);
            Statics.field1979 = method215(6, true, true, false);
            Statics.field1650 = method215(7, false, true, true);
            Statics.field1288 = method215(8, false, true, true);
            Statics.field180 = method215(9, false, true, true);
            Statics.field1399 = method215(10, false, true, true);
            Statics.field88 = method215(11, false, true, true);
            Statics.field256 = method215(12, false, true, true);
            Statics.field1430 = method215(13, true, false, true);
            Statics.field204 = method215(14, false, true, false);
            Statics.field1511 = method215(15, false, true, true);
            class20.field315 = class133.field2052;
            class20.field300 = 20;
            field498 = 40;
        } else if (field498 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field723.method3054() * 4 / 100;
            int var8 = var7 + Statics.field224.method3054() * 4 / 100;
            int var9 = var8 + Statics.field502.method3054() * 2 / 100;
            int var10 = var9 + Statics.field2291.method3054() * 2 / 100;
            int var11 = var10 + Statics.field2348.method3054() * 6 / 100;
            int var12 = var11 + Statics.field330.method3054() * 4 / 100;
            int var13 = var12 + Statics.field1979.method3054() * 2 / 100;
            int var14 = var13 + Statics.field1650.method3054() * 60 / 100;
            int var15 = var14 + Statics.field1288.method3054() * 2 / 100;
            int var16 = var15 + Statics.field180.method3054() * 2 / 100;
            int var17 = var16 + Statics.field1399.method3054() * 2 / 100;
            int var18 = var17 + Statics.field88.method3054() * 2 / 100;
            int var19 = var18 + Statics.field256.method3054() * 2 / 100;
            int var20 = var19 + Statics.field1430.method3054() * 2 / 100;
            int var21 = var20 + Statics.field204.method3054() * 2 / 100;
            int var22 = var21 + Statics.field1511.method3054() * 2 / 100;
            if (var22 == 100) {
                class20.field315 = class133.field2054;
                class20.field300 = 30;
                field498 = 45;
            } else {
                if (var22 != 0) {
                    class20.field315 = class133.field2259 + var22 + "%";
                }
                class20.field300 = 30;
            }
        } else if (field498 == 45) {
            class51.method31(22050, !field475, 2);
            class140 var23 = new class140();
            var23.method2787(9, 128);
            Statics.field372 = class51.method1355(Statics.field1445, Statics.field1780, 0, 22050);
            Statics.field372.method1165(var23);
            class152 var24 = Statics.field1511;
            class152 var25 = Statics.field204;
            class152 var26 = Statics.field2348;
            Statics.field2426 = var24;
            Statics.field2301 = var25;
            Statics.field2299 = var26;
            Statics.field2293 = var23;
            Statics.field1293 = class51.method1355(Statics.field1445, Statics.field1780, 1, 2048);
            Statics.field332 = new class45();
            Statics.field1293.method1165(Statics.field332);
            Statics.field1637 = new class61(22050, Statics.field2409);
            class20.field315 = class133.field2055;
            class20.field300 = 35;
            field498 = 50;
        } else if (field498 == 50) {
            int var27 = 0;
            if (Statics.field2300 == null) {
                class152 var28 = Statics.field1288;
                class152 var29 = Statics.field1430;
                int var30 = var28.method2966("p11_full");
                int var31 = var28.method2967(var30, "");
                class181 var32 = class83.method1392(var28, var29, var30, var31);
                Statics.field2300 = var32;
            } else {
                var27++;
            }
            if (Statics.field351 == null) {
                class152 var33 = Statics.field1288;
                class152 var34 = Statics.field1430;
                int var35 = var33.method2966("p12_full");
                int var36 = var33.method2967(var35, "");
                class181 var37 = class83.method1392(var33, var34, var35, var36);
                Statics.field351 = var37;
            } else {
                var27++;
            }
            if (Statics.field914 == null) {
                class152 var38 = Statics.field1288;
                class152 var39 = Statics.field1430;
                int var40 = var38.method2966("b12_full");
                int var41 = var38.method2967(var40, "");
                class181 var42 = class83.method1392(var38, var39, var40, var41);
                Statics.field914 = var42;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class20.field315 = class133.field2056 + var27 * 100 / 3 + "%";
                class20.field300 = 40;
            } else {
                class20.field315 = class133.field2053;
                class20.field300 = 40;
                field498 = 60;
            }
        } else if (field498 == 60) {
            int var43 = class20.method2101(Statics.field1399, Statics.field1288);
            byte var44 = 6;
            if (var43 < var44) {
                class20.field315 = class133.field2058 + var43 * 100 / var44 + "%";
                class20.field300 = 50;
            } else {
                class20.field315 = class133.field2059;
                class20.field300 = 50;
                method2(5);
                field498 = 70;
            }
        } else if (field498 == 70) {
            if (Statics.field502.method2948()) {
                class152 var46 = Statics.field502;
                Statics.field936 = var46;
                class32.method35(Statics.field502);
                class152 var47 = Statics.field502;
                class152 var48 = Statics.field1650;
                Statics.field921 = var47;
                Statics.field2640 = var48;
                Statics.field917 = Statics.field921.method2961(3);
                class152 var49 = Statics.field502;
                class152 var50 = Statics.field1650;
                boolean var51 = field475;
                Statics.field833 = var49;
                Statics.field861 = var50;
                class31.field850 = var51;
                class152 var52 = Statics.field502;
                class152 var53 = Statics.field1650;
                Statics.field786 = var52;
                Statics.field778 = var53;
                class152 var54 = Statics.field502;
                class152 var55 = Statics.field1650;
                boolean var56 = field474;
                class181 var57 = Statics.field2300;
                Statics.field981 = var54;
                Statics.field980 = var55;
                Statics.field1021 = var56;
                Statics.field981.method2961(10);
                Statics.field379 = var57;
                class33.method210(Statics.field502, Statics.field723, Statics.field224);
                class34.method2947(Statics.field502, Statics.field1650);
                class37.method466(Statics.field502);
                class41.method3140(Statics.field502);
                class156.method57(Statics.field2291, Statics.field1650, Statics.field1288, Statics.field1430);
                class152 var58 = Statics.field502;
                Statics.field1035 = var58;
                class38.method2435(Statics.field502);
                class20.field315 = class133.field2061;
                class20.field300 = 60;
                field498 = 80;
            } else {
                class20.field315 = class133.field2220 + Statics.field502.method3040() + "%";
                class20.field300 = 60;
            }
        } else if (field498 == 80) {
            int var59 = 0;
            if (Statics.field928 == null) {
                Statics.field928 = class83.method2198(Statics.field1288, "compass", "");
            } else {
                var59++;
            }
            if (Statics.field575 == null) {
                Statics.field575 = class83.method2198(Statics.field1288, "mapedge", "");
            } else {
                var59++;
            }
            if (Statics.field212 == null) {
                Statics.field212 = class83.method144(Statics.field1288, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field2278 == null) {
                Statics.field2278 = class83.method2190(Statics.field1288, "mapfunction", "");
            } else {
                var59++;
            }
            if (Statics.field2653 == null) {
                Statics.field2653 = class83.method2190(Statics.field1288, "hitmarks", "");
            } else {
                var59++;
            }
            if (Statics.field565 == null) {
                Statics.field565 = class83.method2190(Statics.field1288, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field401 == null) {
                Statics.field401 = class83.method2190(Statics.field1288, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field8 == null) {
                Statics.field8 = class83.method2190(Statics.field1288, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class83.method2190(Statics.field1288, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field814 == null) {
                Statics.field814 = class83.method2190(Statics.field1288, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field1221 == null) {
                Statics.field1221 = class83.method2190(Statics.field1288, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field1202 == null) {
                Statics.field1202 = class83.method144(Statics.field1288, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field978 == null) {
                Statics.field978 = class83.method144(Statics.field1288, "mod_icons", "");
            } else {
                var59++;
            }
            if (Statics.field2757 == null) {
                Statics.field2757 = class83.method4(Statics.field1288, "mapback", "");
            } else {
                var59++;
            }
            if (var59 < 14) {
                class20.field315 = class133.field2062 + var59 * 100 / 14 + "%";
                class20.field300 = 70;
            } else {
                Statics.field2777 = Statics.field978;
                Statics.field575.method1674();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                for (int var64 = 0; var64 < Statics.field2278.length; var64++) {
                    Statics.field2278[var64].method1658(var60 + var63, var61 + var63, var62 + var63);
                }
                Statics.field212[0].method1741(var60 + var63, var61 + var63, var62 + var63);
                method679();
                class20.field315 = class133.field2087;
                class20.field300 = 70;
                field498 = 90;
            }
        } else if (field498 == 90) {
            if (Statics.field180.method2948()) {
                class109 var65 = new class109(Statics.field180, Statics.field1288, 20, 0.8D, field475 ? 64 : 128);
                class103.method2110(var65);
                class103.method2166(0.8D);
                class20.field315 = class133.field2065;
                class20.field300 = 90;
                field498 = 110;
            } else {
                class20.field315 = class133.field2064 + Statics.field180.method3040() + "%";
                class20.field300 = 90;
            }
        } else if (field498 == 110) {
            Statics.field1797 = new class15();
            Statics.field1445.method1475(Statics.field1797, 10);
            class20.field315 = class133.field2066;
            class20.field300 = 94;
            field498 = 120;
        } else if (field498 == 120) {
            if (Statics.field1399.method2969("huffman", "")) {
                class119 var66 = new class119(Statics.field1399.method2968("huffman", ""));
                class182.method1229(var66);
                class20.field315 = class133.field2068;
                class20.field300 = 96;
                field498 = 130;
            } else {
                class20.field315 = class133.field2191 + "%";
                class20.field300 = 96;
            }
        } else if (field498 == 130) {
            if (!Statics.field2291.method2948()) {
                class20.field315 = class133.field2069 + Statics.field2291.method3040() * 4 / 5 + "%";
                class20.field300 = 100;
            } else if (!Statics.field256.method2948()) {
                class20.field315 = class133.field2069 + (80 + Statics.field256.method3040() / 6) + "%";
                class20.field300 = 100;
            } else if (Statics.field1430.method2948()) {
                class20.field315 = class133.field2070;
                class20.field300 = 100;
                field498 = 140;
            } else {
                class20.field315 = class133.field2069 + (96 + Statics.field1430.method3040() / 20) + "%";
                class20.field300 = 100;
            }
        } else if (field498 == 140) {
            method2(10);
        }
    }

    @ObfuscatedName("r.n(IZZZI)Leu;")
    public static class152 method215(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class70 var4 = null;
        if (class81.field1434 != null) {
            var4 = new class70(arg0, class81.field1434, Statics.field1421[arg0], 1000000);
        }
        return new class152(var4, Statics.field1336, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ad.q(B)V")
    public static void method679() {
        Statics.field1737 = new int[33];
        Statics.field257 = new int[33];
        Statics.field54 = new int[151];
        Statics.field29 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2757.field1466[Statics.field2757.field1468 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1737[var0] = var1;
            Statics.field257[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2757.field1466[Statics.field2757.field1468 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field54[var4 - 5] = var5 - 25;
            Statics.field29[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("dj.a(II)V")
    public static void method2294(int arg0) {
        if (arg0 == -3) {
            class20.method2888(class133.field2074, class133.field2075, class133.field2215);
        } else if (arg0 == -2) {
            class20.method2888(class133.field2046, class133.field2078, class133.field2079);
        } else if (arg0 == -1) {
            class20.method2888(class133.field2080, class133.field2106, class133.field2048);
        } else if (arg0 == 3) {
            class20.method2888(class133.field2083, class133.field2084, class133.field2085);
        } else if (arg0 == 4) {
            class20.method2888(class133.field2086, class133.field2210, class133.field2088);
        } else if (arg0 == 5) {
            class20.method2888(class133.field2128, class133.field2090, class133.field2091);
        } else if (arg0 == 6) {
            class20.method2888(class133.field2092, class133.field2093, class133.field2094);
        } else if (arg0 == 7) {
            class20.method2888(class133.field2095, class133.field2096, class133.field2097);
        } else if (arg0 == 8) {
            class20.method2888(class133.field2186, class133.field2218, class133.field2100);
        } else if (arg0 == 9) {
            class20.method2888(class133.field2077, class133.field2063, class133.field2103);
        } else if (arg0 == 10) {
            class20.method2888(class133.field2104, class133.field2040, class133.field2089);
        } else if (arg0 == 11) {
            class20.method2888(class133.field2107, class133.field2108, class133.field2067);
        } else if (arg0 == 12) {
            class20.method2888(class133.field2057, class133.field2170, class133.field2112);
        } else if (arg0 == 13) {
            class20.method2888(class133.field2113, class133.field2114, class133.field2115);
        } else if (arg0 == 14) {
            class20.method2888(class133.field2116, class133.field2117, class133.field2131);
        } else if (arg0 == 16) {
            class20.method2888(class133.field2119, class133.field2120, class133.field2181);
        } else if (arg0 == 17) {
            class20.method2888(class133.field2184, class133.field2123, class133.field2204);
        } else if (arg0 == 18) {
            class20.method2888(class133.field2125, class133.field2126, class133.field2111);
        } else if (arg0 == 19) {
            class20.method2888(class133.field2237, class133.field2129, class133.field2122);
        } else if (arg0 == 20) {
            class20.method2888(class133.field2076, class133.field2101, class133.field2242);
        } else if (arg0 == 22) {
            class20.method2888(class133.field2134, class133.field2209, class133.field2136);
        } else if (arg0 == 23) {
            class20.method2888(class133.field2137, class133.field2138, class133.field2139);
        } else if (arg0 == 24) {
            class20.method2888(class133.field2228, class133.field2105, class133.field2142);
        } else if (arg0 == 25) {
            class20.method2888(class133.field2143, class133.field2073, class133.field2081);
        } else if (arg0 == 26) {
            class20.method2888(class133.field2146, class133.field2147, class133.field2148);
        } else if (arg0 == 27) {
            class20.method2888(class133.field2246, class133.field2150, class133.field2151);
        } else if (arg0 == 31) {
            class20.method2888(class133.field2158, class133.field2159, class133.field2160);
        } else if (arg0 == 32) {
            class20.method2888(class133.field2161, class133.field2162, class133.field2163);
        } else if (arg0 == 37) {
            class20.method2888(class133.field2141, class133.field2165, class133.field2166);
        } else if (arg0 == 38) {
            class20.method2888(class133.field2232, class133.field2198, class133.field2169);
        } else if (arg0 == 55) {
            class20.method2888(class133.field2206, class133.field2167, class133.field2172);
        } else {
            class20.method2888(class133.field2173, class133.field2174, class133.field2041);
        }
        method2(10);
    }

    @ObfuscatedName("ck.r(B)V")
    public static final void method1575() {
        if (Statics.field2287 != null) {
            Statics.field2287.method1359();
            Statics.field2287 = null;
        }
        method124();
        Statics.field2020.method1836();
        for (int var0 = 0; var0 < 4; var0++) {
            field629[var0].method3185();
        }
        System.gc();
        class137.method1399(2);
        field710 = -1;
        field711 = false;
        for (class7 var1 = (class7) class7.field109.method3317(); var1 != null; var1 = (class7) class7.field109.method3310()) {
            if (var1.field98 != null) {
                Statics.field332.method1113(var1.field98);
                var1.field98 = null;
            }
            if (var1.field103 != null) {
                Statics.field332.method1113(var1.field103);
                var1.field103 = null;
            }
        }
        class7.field109.method3302();
        method2(10);
    }

    @ObfuscatedName("b.x(B)V")
    public static final void method124() {
        class36.method823();
        class32.method127();
        class35.field918.method3241();
        class31.field819.method3241();
        class31.field820.method3241();
        class31.field821.method3241();
        class31.field822.method3241();
        class30.field779.method3241();
        class30.field780.method3241();
        class39.field990.method3241();
        class39.field983.method3241();
        class39.field988.method3241();
        class33.field891.method3241();
        class33.field890.method3241();
        class34.method3065();
        class37.field954.method3241();
        class41.field1039.method3241();
        class161.field2661.method3241();
        class156.method125();
        ((class109) Statics.field1759).method2201();
        class5.field80.method3241();
        Statics.field723.method2973();
        Statics.field224.method2973();
        Statics.field2291.method2973();
        Statics.field2348.method2973();
        Statics.field330.method2973();
        Statics.field1979.method2973();
        Statics.field1650.method2973();
        Statics.field1288.method2973();
        Statics.field180.method2973();
        Statics.field1399.method2973();
        Statics.field88.method2973();
        Statics.field256.method2973();
    }

    @ObfuscatedName("w.w(I)V")
    public static final void method224() {
        if (field716 > 0) {
            method1575();
        } else {
            method2(40);
            Statics.field116 = Statics.field2287;
            Statics.field2287 = null;
        }
    }

    @ObfuscatedName("fe.j(B)V")
    public static final void method3226() {
        if (field633 > 1) {
            field633--;
        }
        if (field716 > 0) {
            field716--;
        }
        if (field523) {
            field523 = false;
            method224();
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field2287 == null) {
                var1 = false;
            } else {
                label2888: {
                    try {
                        int var2 = Statics.field2287.method1360();
                        if (var2 == 0) {
                            var1 = false;
                            break label2888;
                        }
                        if (field516 == -1) {
                            Statics.field2287.method1374(field514.field2007, 0, 1);
                            field514.field2003 = 0;
                            field516 = field514.method2308();
                            field515 = class163.field2710[field516];
                            var2--;
                        }
                        if (field515 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2888;
                            }
                            Statics.field2287.method1374(field514.field2007, 0, 1);
                            field515 = field514.field2007[0] & 0xFF;
                            var2--;
                        }
                        if (field515 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2888;
                            }
                            Statics.field2287.method1374(field514.field2007, 0, 2);
                            field514.field2003 = 0;
                            field515 = field514.method2627();
                            var2 -= 2;
                        }
                        if (var2 < field515) {
                            var1 = false;
                            break label2888;
                        }
                        field514.field2003 = 0;
                        Statics.field2287.method1374(field514.field2007, 0, field515);
                        field517 = 0;
                        field680 = field707;
                        field707 = field520;
                        field520 = field516;
                        if (field516 == 193) {
                            int var3 = field514.method2489();
                            class156 var4 = class156.method2431(var3);
                            var4.field2546 = 3;
                            var4.field2519 = Statics.field1033.field36.method3178();
                            method2103(var4);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 254) {
                            int var5 = field514.method2480();
                            int var6 = field514.method2577();
                            int var7 = field514.method2483();
                            class4 var8 = (class4) field712.method3281((long) var6);
                            if (var8 != null) {
                                method600(var8, var8.field59 != var7);
                            }
                            method131(var6, var7, var5);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 65) {
                            int var9 = field514.method2627();
                            int var10 = field514.method2450();
                            int var11 = field514.method2627();
                            method2371(var9, var10, var11);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 78) {
                            field720 = false;
                            for (int var12 = 0; var12 < 5; var12++) {
                                field721[var12] = false;
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 115) {
                            method58(false);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 35) {
                            int var13 = field514.method2483();
                            class18.method1653(var13);
                            field595[++field661 - 1 & 0x1F] = var13 & 0x7FFF;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 166) {
                            int var14 = field514.method2467();
                            int var15 = field514.method2627();
                            if (var14 < -70000) {
                                var15 += 32768;
                            }
                            class156 var16;
                            if (var14 >= 0) {
                                var16 = class156.method2431(var14);
                            } else {
                                var16 = null;
                            }
                            if (var16 != null) {
                                for (int var17 = 0; var17 < var16.field2616.length; var17++) {
                                    var16.field2616[var17] = 0;
                                    var16.field2617[var17] = 0;
                                }
                            }
                            class18 var18 = (class18) class18.field279.method3281((long) var15);
                            if (var18 != null) {
                                for (int var19 = 0; var19 < var18.field275.length; var19++) {
                                    var18.field275[var19] = -1;
                                    var18.field276[var19] = 0;
                                }
                            }
                            int var20 = field514.method2627();
                            for (int var21 = 0; var21 < var20; var21++) {
                                int var22 = field514.method2480();
                                if (var22 == 255) {
                                    var22 = field514.method2489();
                                }
                                int var23 = field514.method2627();
                                if (var16 != null && var21 < var16.field2616.length) {
                                    var16.field2616[var21] = var23;
                                    var16.field2617[var21] = var22;
                                }
                                class18.method117(var15, var21, var23 - 1, var22);
                            }
                            if (var16 != null) {
                                method2103(var16);
                            }
                            method901();
                            field595[++field661 - 1 & 0x1F] = var15 & 0x7FFF;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 34) {
                            int var24 = field514.method2485();
                            int var25 = field514.method2485();
                            int var26 = field514.method2489();
                            class156 var27 = class156.method2431(var26);
                            int var28 = var27.field2521 + var24;
                            int var29 = var27.field2522 + var25;
                            if (var27.field2549 != var28 || var27.field2520 != var29) {
                                var27.field2549 = var28;
                                var27.field2520 = var29;
                                method2103(var27);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 159) {
                            String var30 = field514.method2603();
                            if (var30.endsWith(":tradereq:")) {
                                String var31 = var30.substring(0, var30.indexOf(":"));
                                boolean var32 = false;
                                if (method61(var31)) {
                                    var32 = true;
                                }
                                if (!var32 && field557 == 0) {
                                    Statics.method2554(4, var31, class133.field2176);
                                }
                            } else if (var30.endsWith(":duelreq:")) {
                                String var33 = var30.substring(0, var30.indexOf(":"));
                                boolean var34 = false;
                                if (method61(var33)) {
                                    var34 = true;
                                }
                                if (!var34 && field557 == 0) {
                                    Statics.method2554(8, var33, class133.field2177);
                                }
                            } else if (var30.endsWith(":chalreq:")) {
                                String var35 = var30.substring(0, var30.indexOf(":"));
                                boolean var36 = false;
                                if (method61(var35)) {
                                    var36 = true;
                                }
                                if (!var36 && field557 == 0) {
                                    String var37 = var30.substring(var30.indexOf(":") + 1, var30.length() - 9);
                                    Statics.method2554(8, var35, var37);
                                }
                            } else if (var30.endsWith(":assistreq:")) {
                                String var38 = var30.substring(0, var30.indexOf(":"));
                                boolean var39 = false;
                                if (method61(var38)) {
                                    var39 = true;
                                }
                                if (!var39 && field557 == 0) {
                                    Statics.method2554(10, var38, "");
                                }
                            } else if (var30.endsWith(":clan:")) {
                                String var40 = var30.substring(0, var30.indexOf(":clan:"));
                                Statics.method2554(11, "", var40);
                            } else if (var30.endsWith(":trade:")) {
                                String var41 = var30.substring(0, var30.indexOf(":trade:"));
                                if (field557 == 0) {
                                    Statics.method2554(12, "", var41);
                                }
                            } else if (var30.endsWith(":assist:")) {
                                String var42 = var30.substring(0, var30.indexOf(":assist:"));
                                if (field557 == 0) {
                                    Statics.method2554(13, "", var42);
                                }
                            } else {
                                Statics.method2554(0, "", var30);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 224) {
                            Statics.field380 = field514.method2624();
                            Statics.field792 = field514.method2475();
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 202) {
                            field602 = 0;
                            field635 = 0;
                            field514.method2310();
                            int var43 = field514.method2312(8);
                            if (var43 < field510) {
                                for (int var44 = var43; var44 < field510; var44++) {
                                    field603[++field602 - 1] = field511[var44];
                                }
                            }
                            if (var43 > field510) {
                                throw new RuntimeException("");
                            }
                            field510 = 0;
                            for (int var45 = 0; var45 < var43; var45++) {
                                int var46 = field511[var45];
                                class24 var47 = field509[var46];
                                int var48 = field514.method2312(1);
                                if (var48 == 0) {
                                    field511[++field510 - 1] = var46;
                                    var47.field455 = field481;
                                } else {
                                    int var49 = field514.method2312(2);
                                    if (var49 == 0) {
                                        field511[++field510 - 1] = var46;
                                        var47.field455 = field481;
                                        field487[++field635 - 1] = var46;
                                    } else if (var49 == 1) {
                                        field511[++field510 - 1] = var46;
                                        var47.field455 = field481;
                                        int var50 = field514.method2312(3);
                                        var47.method251(var50, false);
                                        int var51 = field514.method2312(1);
                                        if (var51 == 1) {
                                            field487[++field635 - 1] = var46;
                                        }
                                    } else if (var49 == 2) {
                                        field511[++field510 - 1] = var46;
                                        var47.field455 = field481;
                                        int var52 = field514.method2312(3);
                                        var47.method251(var52, true);
                                        int var53 = field514.method2312(3);
                                        var47.method251(var53, true);
                                        int var54 = field514.method2312(1);
                                        if (var54 == 1) {
                                            field487[++field635 - 1] = var46;
                                        }
                                    } else if (var49 == 3) {
                                        field603[++field602 - 1] = var46;
                                    }
                                }
                            }
                            method217();
                            for (int var55 = 0; var55 < field635; var55++) {
                                int var56 = field487[var55];
                                class24 var57 = field509[var56];
                                int var58 = field514.method2450();
                                if ((var58 & 0x40) != 0) {
                                    var57.field443 = field514.method2483();
                                    int var59 = field514.method2491();
                                    var57.field414 = var59 >> 16;
                                    var57.field446 = (var59 & 0xFFFF) + field481;
                                    var57.field464 = 0;
                                    var57.field445 = 0;
                                    if (var57.field446 > field481) {
                                        var57.field464 = -1;
                                    }
                                    if (var57.field443 == 65535) {
                                        var57.field443 = -1;
                                    }
                                }
                                if ((var58 & 0x80) != 0) {
                                    int var60 = field514.method2624();
                                    int var61 = field514.method2624();
                                    var57.method239(var60, var61, field481);
                                    var57.field429 = field481 + 300;
                                    var57.field457 = field514.method2480();
                                    var57.field431 = field514.method2624();
                                }
                                if ((var58 & 0x4) != 0) {
                                    int var62 = field514.method2450();
                                    int var63 = field514.method2624();
                                    var57.method239(var62, var63, field481);
                                    var57.field429 = field481 + 300;
                                    var57.field457 = field514.method2480();
                                    var57.field431 = field514.method2480();
                                }
                                if ((var58 & 0x1) != 0) {
                                    int var64 = field514.method2484();
                                    if (var64 == 65535) {
                                        var64 = -1;
                                    }
                                    int var65 = field514.method2450();
                                    if (var57.field438 == var64 && var64 != -1) {
                                        int var66 = class33.method2674(var64).field897;
                                        if (var66 == 1) {
                                            var57.field439 = 0;
                                            var57.field447 = 0;
                                            var57.field440 = var65;
                                            var57.field442 = 0;
                                        }
                                        if (var66 == 2) {
                                            var57.field442 = 0;
                                        }
                                    } else if (var64 == -1 || var57.field438 == -1 || class33.method2674(var64).field892 >= class33.method2674(var57.field438).field892) {
                                        var57.field438 = var64;
                                        var57.field439 = 0;
                                        var57.field447 = 0;
                                        var57.field440 = var65;
                                        var57.field442 = 0;
                                        var57.field454 = var57.field460;
                                    }
                                }
                                if ((var58 & 0x2) != 0) {
                                    var57.field432 = field514.method2465();
                                    if (var57.field432 == 65535) {
                                        var57.field432 = -1;
                                    }
                                }
                                if ((var58 & 0x8) != 0) {
                                    var57.field425 = field514.method2627();
                                    var57.field434 = field514.method2483();
                                }
                                if ((var58 & 0x20) != 0) {
                                    var57.field422 = field514.method2603();
                                    var57.field409 = 100;
                                }
                                if ((var58 & 0x10) != 0) {
                                    var57.field386 = class30.method154(field514.method2627());
                                    var57.field413 = var57.field386.field783;
                                    var57.field459 = var57.field386.field806;
                                    var57.field417 = var57.field386.field789;
                                    var57.field449 = var57.field386.field799;
                                    var57.field419 = var57.field386.field796;
                                    var57.field420 = var57.field386.field781;
                                    var57.field430 = var57.field386.field791;
                                    var57.field415 = var57.field386.field787;
                                    var57.field416 = var57.field386.field811;
                                }
                            }
                            for (int var67 = 0; var67 < field602; var67++) {
                                int var68 = field603[var67];
                                if (field481 != field509[var68].field455) {
                                    field509[var68].field386 = null;
                                    field509[var68] = null;
                                }
                            }
                            if (field515 != field514.field2003) {
                                throw new RuntimeException(field514.field2003 + class2.field22 + field515);
                            }
                            for (int var69 = 0; var69 < field510; var69++) {
                                if (field509[field511[var69]] == null) {
                                    throw new RuntimeException(var69 + class2.field22 + field510);
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 87) {
                            int var70 = field514.method2484();
                            field634 = var70;
                            method3230(var70);
                            class25.method1328(field634);
                            for (int var71 = 0; var71 < 100; var71++) {
                                field645[var71] = true;
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 70) {
                            field666 = field657;
                            if (field515 == 0) {
                                field669 = null;
                                field699 = null;
                                Statics.field1838 = 0;
                                Statics.field2423 = null;
                                field516 = -1;
                                var1 = true;
                            } else {
                                field699 = field514.method2603();
                                long var72 = field514.method2607();
                                field669 = class145.method2029(var72);
                                Statics.field69 = field514.method2451();
                                int var74 = field514.method2450();
                                if (var74 == 255) {
                                    field516 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1838 = var74;
                                    class8[] var75 = new class8[100];
                                    for (int var76 = 0; var76 < Statics.field1838; var76++) {
                                        var75[var76] = new class8();
                                        var75[var76].field112 = field514.method2603();
                                        var75[var76].field117 = class147.method1357(var75[var76].field112, Statics.field560);
                                        var75[var76].field113 = field514.method2627();
                                        var75[var76].field114 = field514.method2451();
                                        field514.method2603();
                                        if (var75[var76].field112.equals(Statics.field1033.field51)) {
                                            Statics.field1827 = var75[var76].field114;
                                        }
                                    }
                                    boolean var77 = false;
                                    int var78 = Statics.field1838;
                                    while (var78 > 0) {
                                        boolean var79 = true;
                                        var78--;
                                        for (int var80 = 0; var80 < var78; var80++) {
                                            if (var75[var80].field117.compareTo(var75[var80 + 1].field117) > 0) {
                                                class8 var81 = var75[var80];
                                                var75[var80] = var75[var80 + 1];
                                                var75[var80 + 1] = var81;
                                                var79 = false;
                                            }
                                        }
                                        if (var79) {
                                            break;
                                        }
                                    }
                                    Statics.field2423 = var75;
                                    field516 = -1;
                                    var1 = true;
                                }
                            }
                            break label2888;
                        }
                        if (field516 == 143) {
                            method901();
                            field640 = field514.method2513();
                            field667 = field657;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 11) {
                            field720 = true;
                            Statics.field179 = field514.method2450();
                            Statics.field17 = field514.method2450();
                            Statics.field1291 = field514.method2627();
                            Statics.field281 = field514.method2450();
                            Statics.field878 = field514.method2450();
                            if (Statics.field878 >= 100) {
                                int var82 = Statics.field179 * 128 + 64;
                                int var83 = Statics.field17 * 128 + 64;
                                int var84 = method121(var82, var83, Statics.field244) - Statics.field1291;
                                int var85 = var82 - Statics.field1804;
                                int var86 = var84 - Statics.field70;
                                int var87 = var83 - Statics.field755;
                                int var88 = (int) Math.sqrt((double) (var85 * var85 + var87 * var87));
                                Statics.field2001 = (int) (Math.atan2((double) var86, (double) var88) * 325.949D) & 0x7FF;
                                Statics.field171 = (int) (Math.atan2((double) var85, (double) var87) * -325.949D) & 0x7FF;
                                if (Statics.field2001 < 128) {
                                    Statics.field2001 = 128;
                                }
                                if (Statics.field2001 > 383) {
                                    Statics.field2001 = 383;
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 52) {
                            for (int var89 = 0; var89 < class157.field2634.length; var89++) {
                                if (class157.field2634[var89] != class157.field2632[var89]) {
                                    class157.field2634[var89] = class157.field2632[var89];
                                    Statics.method2411(var89);
                                    field658[++field659 - 1 & 0x1F] = var89;
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 237) {
                            int var90 = field514.method2450();
                            class136[] var91 = class136.method205();
                            int var92 = 0;
                            class136 var94;
                            while (true) {
                                if (var92 >= var91.length) {
                                    var94 = null;
                                    break;
                                }
                                class136 var93 = var91[var92];
                                if (var93.field2286 == var90) {
                                    var94 = var93;
                                    break;
                                }
                                var92++;
                            }
                            Statics.field1310 = var94;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 1) {
                            field691 = field514.method2450();
                            field692 = field514.method2450();
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 250) {
                            int var95 = field514.method2480();
                            int var96 = field514.method2450();
                            int var97 = field514.method2624();
                            Statics.field244 = var96 >> 1;
                            Statics.field1033.method236(var95, var97, (var96 & 0x1) == 1);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 232) {
                            int var98 = field514.method2489();
                            int var99 = field514.method2467();
                            int var100 = field514.method2484();
                            if (var100 == 65535) {
                                var100 = -1;
                            }
                            class156 var101 = class156.method2431(var99);
                            if (var101.field2513) {
                                var101.field2618 = var100;
                                var101.field2584 = var98;
                                class39 var103 = class39.method2704(var100);
                                var101.field2554 = var103.field1024;
                                var101.field2508 = var103.field994;
                                var101.field2516 = var103.field995;
                                var101.field2552 = var103.field996;
                                var101.field2553 = var103.field993;
                                var101.field2570 = var103.field992;
                                if (var101.field2523 > 0) {
                                    var101.field2570 = var101.field2570 * 32 / var101.field2523;
                                }
                                method2103(var101);
                            } else {
                                if (var100 == -1) {
                                    var101.field2546 = 0;
                                    field516 = -1;
                                    var1 = true;
                                    break label2888;
                                }
                                class39 var102 = class39.method2704(var100);
                                var101.field2546 = 4;
                                var101.field2519 = var100;
                                var101.field2554 = var102.field1024;
                                var101.field2508 = var102.field994;
                                var101.field2570 = var102.field992 * 100 / var98;
                                method2103(var101);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 135) {
                            Statics.field792 = field514.method2480();
                            Statics.field380 = field514.method2450();
                            while (field514.field2003 < field515) {
                                field516 = field514.method2450();
                                method3();
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 134) {
                            int var104 = field514.method2483();
                            int var105 = field514.method2483();
                            int var106 = field514.method2467();
                            int var107 = field514.method2483();
                            class156 var108 = class156.method2431(var106);
                            if (var108.field2554 != var104 || var108.field2508 != var107 || var108.field2570 != var105) {
                                var108.field2554 = var104;
                                var108.field2508 = var107;
                                var108.field2570 = var105;
                                method2103(var108);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 8) {
                            if (field634 != -1) {
                                int var109 = field634;
                                if (class156.method132(var109)) {
                                    method116(Statics.field2537[var109], 0);
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 25) {
                            String var110 = field514.method2603();
                            long var111 = (long) field514.method2627();
                            long var113 = (long) field514.method2454();
                            int var115 = field514.method2450();
                            long var116 = (var111 << 32) + var113;
                            boolean var118 = false;
                            for (int var119 = 0; var119 < 100; var119++) {
                                if (field590[var119] == var116) {
                                    var118 = true;
                                    break;
                                }
                            }
                            if (method61(var110)) {
                                var118 = true;
                            }
                            if (!var118 && field557 == 0) {
                                field590[field577] = var116;
                                field577 = (field577 + 1) % 100;
                                String var120 = class183.method3391(class146.method1266(class182.method143(field514)));
                                if (var115 == 2 || var115 == 3) {
                                    Statics.method2554(7, class2.method29(1) + var110, var120);
                                } else if (var115 == 1) {
                                    Statics.method2554(7, class2.method29(0) + var110, var120);
                                } else {
                                    Statics.method2554(3, var110, var120);
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 60) {
                            method1575();
                            field516 = -1;
                            var1 = false;
                            break label2888;
                        }
                        if (field516 == 160) {
                            int var121 = field514.method2467();
                            int var122 = field514.method2627();
                            if (var121 < -70000) {
                                var122 += 32768;
                            }
                            class156 var123;
                            if (var121 >= 0) {
                                var123 = class156.method2431(var121);
                            } else {
                                var123 = null;
                            }
                            while (field514.field2003 < field515) {
                                int var124 = field514.method2463();
                                int var125 = field514.method2627();
                                int var126 = 0;
                                if (var125 != 0) {
                                    var126 = field514.method2450();
                                    if (var126 == 255) {
                                        var126 = field514.method2467();
                                    }
                                }
                                if (var123 != null && var124 >= 0 && var124 < var123.field2616.length) {
                                    var123.field2616[var124] = var125;
                                    var123.field2617[var124] = var126;
                                }
                                class18.method117(var122, var124, var125 - 1, var126);
                            }
                            if (var123 != null) {
                                method2103(var123);
                            }
                            method901();
                            field595[++field661 - 1 & 0x1F] = var122 & 0x7FFF;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 43) {
                            int var127 = field514.method2577();
                            class156 var128 = class156.method2431(var127);
                            for (int var129 = 0; var129 < var128.field2616.length; var129++) {
                                var128.field2616[var129] = -1;
                                var128.field2616[var129] = 0;
                            }
                            method2103(var128);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 249) {
                            String var130 = field514.method2603();
                            Object[] var131 = new Object[var130.length() + 1];
                            for (int var132 = var130.length() - 1; var132 >= 0; var132--) {
                                if (var130.charAt(var132) == 's') {
                                    var131[var132 + 1] = field514.method2603();
                                } else {
                                    var131[var132 + 1] = Integer.valueOf(field514.method2467());
                                }
                            }
                            var131[0] = Integer.valueOf(field514.method2467());
                            class1 var133 = new class1();
                            var133.field13 = var131;
                            class25.method226(var133);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 168) {
                            int var134 = field514.method2491();
                            int var135 = field514.method2484();
                            if (var135 == 65535) {
                                var135 = -1;
                            }
                            int var136 = field514.method2467();
                            int var137 = field514.method2465();
                            if (var137 == 65535) {
                                var137 = -1;
                            }
                            for (int var138 = var135; var138 <= var137; var138++) {
                                long var139 = ((long) var136 << 32) + (long) var138;
                                class177 var141 = field674.method3281(var139);
                                if (var141 != null) {
                                    var141.method3346();
                                }
                                field674.method3283(new class169(var134), var139);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 37) {
                            field705 = 0;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 2) {
                            while (field514.field2003 < field515) {
                                boolean var142 = field514.method2450() == 1;
                                String var143 = field514.method2603();
                                String var144 = field514.method2603();
                                int var145 = field514.method2627();
                                int var146 = field514.method2450();
                                int var147 = field514.method2450();
                                boolean var148 = (var147 & 0x2) != 0;
                                boolean var149 = (var147 & 0x1) != 0;
                                if (var145 > 0) {
                                    field514.method2603();
                                    field514.method2450();
                                    field514.method2467();
                                }
                                field514.method2603();
                                for (int var150 = 0; var150 < field726; var150++) {
                                    class22 var151 = field728[var150];
                                    if (var142) {
                                        if (var144.equals(var151.field358)) {
                                            var151.field358 = var143;
                                            var151.field364 = var144;
                                            var143 = null;
                                            break;
                                        }
                                    } else if (var143.equals(var151.field358)) {
                                        if (var151.field356 != var145) {
                                            boolean var152 = true;
                                            for (class27 var153 = (class27) field729.method3269(); var153 != null; var153 = (class27) field729.method3267()) {
                                                if (var153.field740.equals(var143)) {
                                                    if (var145 != 0 && var153.field739 == 0) {
                                                        var153.method3343();
                                                        var152 = false;
                                                    } else if (var145 == 0 && var153.field739 != 0) {
                                                        var153.method3343();
                                                        var152 = false;
                                                    }
                                                }
                                            }
                                            if (var152) {
                                                field729.method3268(new class27(var143, var145));
                                            }
                                            var151.field356 = var145;
                                        }
                                        var151.field364 = var144;
                                        var151.field357 = var146;
                                        var151.field362 = var148;
                                        var151.field359 = var149;
                                        var143 = null;
                                        break;
                                    }
                                }
                                if (var143 != null && field726 < 200) {
                                    class22 var154 = new class22();
                                    field728[field726] = var154;
                                    var154.field358 = var143;
                                    var154.field364 = var144;
                                    var154.field356 = var145;
                                    var154.field357 = var146;
                                    var154.field362 = var148;
                                    var154.field359 = var149;
                                    field726++;
                                }
                            }
                            field610 = 2;
                            field665 = field657;
                            boolean var155 = false;
                            int var156 = field726;
                            while (var156 > 0) {
                                boolean var157 = true;
                                var156--;
                                for (int var158 = 0; var158 < var156; var158++) {
                                    boolean var159 = false;
                                    class22 var160 = field728[var158];
                                    class22 var161 = field728[var158 + 1];
                                    if (field470 != var160.field356 && field470 == var161.field356) {
                                        var159 = true;
                                    }
                                    if (!var159 && var160.field356 == 0 && var161.field356 != 0) {
                                        var159 = true;
                                    }
                                    if (!var159 && !var160.field362 && var161.field362) {
                                        var159 = true;
                                    }
                                    if (!var159 && !var160.field359 && var161.field359) {
                                        var159 = true;
                                    }
                                    if (var159) {
                                        class22 var162 = field728[var158];
                                        field728[var158] = field728[var158 + 1];
                                        field728[var158 + 1] = var162;
                                        var157 = false;
                                    }
                                }
                                if (var157) {
                                    break;
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 88) {
                            field602 = 0;
                            field635 = 0;
                            method647();
                            int var163 = field514.method2312(8);
                            if (var163 < field576) {
                                for (int var164 = var163; var164 < field576; var164++) {
                                    field603[++field602 - 1] = field698[var164];
                                }
                            }
                            if (var163 > field576) {
                                throw new RuntimeException("");
                            }
                            field576 = 0;
                            for (int var165 = 0; var165 < var163; var165++) {
                                int var166 = field698[var165];
                                class3 var167 = field660[var166];
                                int var168 = field514.method2312(1);
                                if (var168 == 0) {
                                    field698[++field576 - 1] = var166;
                                    var167.field455 = field481;
                                } else {
                                    int var169 = field514.method2312(2);
                                    if (var169 == 0) {
                                        field698[++field576 - 1] = var166;
                                        var167.field455 = field481;
                                        field487[++field635 - 1] = var166;
                                    } else if (var169 == 1) {
                                        field698[++field576 - 1] = var166;
                                        var167.field455 = field481;
                                        int var170 = field514.method2312(3);
                                        var167.method251(var170, false);
                                        int var171 = field514.method2312(1);
                                        if (var171 == 1) {
                                            field487[++field635 - 1] = var166;
                                        }
                                    } else if (var169 == 2) {
                                        field698[++field576 - 1] = var166;
                                        var167.field455 = field481;
                                        int var172 = field514.method2312(3);
                                        var167.method251(var172, true);
                                        int var173 = field514.method2312(3);
                                        var167.method251(var173, true);
                                        int var174 = field514.method2312(1);
                                        if (var174 == 1) {
                                            field487[++field635 - 1] = var166;
                                        }
                                    } else if (var169 == 3) {
                                        field603[++field602 - 1] = var166;
                                    }
                                }
                            }
                            method1824();
                            method2026();
                            for (int var175 = 0; var175 < field602; var175++) {
                                int var176 = field603[var175];
                                if (field481 != field660[var176].field455) {
                                    field660[var176] = null;
                                }
                            }
                            if (field515 != field514.field2003) {
                                throw new RuntimeException(field514.field2003 + class2.field22 + field515);
                            }
                            for (int var177 = 0; var177 < field576; var177++) {
                                if (field660[field698[var177]] == null) {
                                    throw new RuntimeException(var177 + class2.field22 + field576);
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 235) {
                            class115 var178 = field514;
                            int var179 = field515;
                            class179 var180 = new class179();
                            var180.field2762 = var178.method2450();
                            var180.field2763 = var178.method2467();
                            var180.field2764 = new int[var180.field2762];
                            var180.field2766 = new int[var180.field2762];
                            var180.field2768 = new Field[var180.field2762];
                            var180.field2761 = new int[var180.field2762];
                            var180.field2767 = new Method[var180.field2762];
                            var180.field2765 = new byte[var180.field2762][][];
                            for (int var181 = 0; var181 < var180.field2762; var181++) {
                                try {
                                    int var182 = var178.method2450();
                                    if (var182 == 0 || var182 == 1 || var182 == 2) {
                                        String var183 = new String(var178.method2603());
                                        String var184 = new String(var178.method2603());
                                        int var185 = 0;
                                        if (var182 == 1) {
                                            var185 = var178.method2467();
                                        }
                                        var180.field2764[var181] = var182;
                                        var180.field2761[var181] = var185;
                                        var180.field2768[var181] = class180.method3225(var183).getDeclaredField(var184);
                                    } else if (var182 == 3 || var182 == 4) {
                                        String var186 = new String(var178.method2603());
                                        String var187 = new String(var178.method2603());
                                        int var188 = var178.method2450();
                                        String[] var189 = new String[var188];
                                        for (int var190 = 0; var190 < var188; var190++) {
                                            var189[var190] = new String(var178.method2603());
                                        }
                                        byte[][] var191 = new byte[var188][];
                                        if (var182 == 3) {
                                            for (int var192 = 0; var192 < var188; var192++) {
                                                int var193 = var178.method2467();
                                                var191[var192] = new byte[var193];
                                                var178.method2461(var191[var192], 0, var193);
                                            }
                                        }
                                        var180.field2764[var181] = var182;
                                        Class[] var194 = new Class[var188];
                                        for (int var195 = 0; var195 < var188; var195++) {
                                            var194[var195] = class180.method3225(var189[var195]);
                                        }
                                        var180.field2767[var181] = class180.method3225(var186).getDeclaredMethod(var187, var194);
                                        var180.field2765[var181] = var191;
                                    }
                                } catch (ClassNotFoundException var436) {
                                    var180.field2766[var181] = -1;
                                } catch (SecurityException var437) {
                                    var180.field2766[var181] = -2;
                                } catch (NullPointerException var438) {
                                    var180.field2766[var181] = -3;
                                } catch (Exception var439) {
                                    var180.field2766[var181] = -4;
                                } catch (Throwable var440) {
                                    var180.field2766[var181] = -5;
                                }
                            }
                            class180.field2773.method3303(var180);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 90) {
                            boolean var201 = field514.method2480() == 1;
                            int var202 = field514.method2491();
                            class156 var203 = class156.method2431(var202);
                            if (var203.field2526 != var201) {
                                var203.field2526 = var201;
                                method2103(var203);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 212) {
                            field514.field2003 += 28;
                            if (field514.method2470()) {
                                class115 var204 = field514;
                                int var205 = field514.field2003 - 28;
                                if (class81.field1432 != null) {
                                    try {
                                        class81.field1432.method586(0L);
                                        class81.field1432.method591(var204.field2007, var205, 24);
                                    } catch (Exception var434) {
                                    }
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 227) {
                            field610 = 1;
                            field665 = field657;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 213) {
                            for (int var207 = 0; var207 < field660.length; var207++) {
                                if (field660[var207] != null) {
                                    field660[var207].field438 = -1;
                                }
                            }
                            for (int var208 = 0; var208 < field509.length; var208++) {
                                if (field509[var208] != null) {
                                    field509[var208].field438 = -1;
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 44) {
                            field633 = field514.method2465() * 30;
                            field667 = field657;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 33) {
                            int var209 = field514.method2577();
                            int var210 = field514.method2627();
                            class156 var211 = class156.method2431(var209);
                            if (var211.field2546 != 1 || var211.field2519 != var210) {
                                var211.field2546 = 1;
                                var211.field2519 = var210;
                                method2103(var211);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 4) {
                            int var212 = field514.method2513();
                            int var213 = field514.method2489();
                            class156 var214 = class156.method2431(var213);
                            if (var214.field2550 != var212 || var212 == -1) {
                                var214.field2550 = var212;
                                var214.field2620 = 0;
                                var214.field2621 = 0;
                                method2103(var214);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 95) {
                            int var215 = field514.method2577();
                            int var216 = field514.method2484();
                            class157.field2632[var216] = var215;
                            if (class157.field2634[var216] != var215) {
                                class157.field2634[var216] = var215;
                                Statics.method2411(var216);
                            }
                            field658[++field659 - 1 & 0x1F] = var216;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 69) {
                            for (int var217 = 0; var217 < Statics.field1037; var217++) {
                                class41 var218 = class41.method681(var217);
                                if (var218 != null && var218.field1041 == 0) {
                                    class157.field2632[var217] = 0;
                                    class157.field2634[var217] = 0;
                                }
                            }
                            method901();
                            field659 += 32;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 206) {
                            String var219 = field514.method2603();
                            int var220 = field514.method2627();
                            byte var221 = field514.method2451();
                            boolean var222 = false;
                            if (var221 == -128) {
                                var222 = true;
                            }
                            if (var222) {
                                if (Statics.field1838 == 0) {
                                    field516 = -1;
                                    var1 = true;
                                    break label2888;
                                }
                                boolean var223 = false;
                                int var224;
                                for (var224 = 0; var224 < Statics.field1838 && (!Statics.field2423[var224].field112.equals(var219) || Statics.field2423[var224].field113 != var220); var224++) {
                                }
                                if (var224 < Statics.field1838) {
                                    while (var224 < Statics.field1838 - 1) {
                                        Statics.field2423[var224] = Statics.field2423[var224 + 1];
                                        var224++;
                                    }
                                    Statics.field1838--;
                                    Statics.field2423[Statics.field1838] = null;
                                }
                            } else {
                                field514.method2603();
                                class8 var225 = new class8();
                                var225.field112 = var219;
                                var225.field117 = class147.method1357(var225.field112, Statics.field560);
                                var225.field113 = var220;
                                var225.field114 = var221;
                                int var226;
                                for (var226 = Statics.field1838 - 1; var226 >= 0; var226--) {
                                    int var227 = Statics.field2423[var226].field117.compareTo(var225.field112);
                                    if (var227 == 0) {
                                        Statics.field2423[var226].field113 = var220;
                                        Statics.field2423[var226].field114 = var221;
                                        if (var219.equals(Statics.field1033.field51)) {
                                            Statics.field1827 = var221;
                                        }
                                        field666 = field657;
                                        field516 = -1;
                                        var1 = true;
                                        break label2888;
                                    }
                                    if (var227 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1838 >= Statics.field2423.length) {
                                    field516 = -1;
                                    var1 = true;
                                    break label2888;
                                }
                                for (int var228 = Statics.field1838 - 1; var228 > var226; var228--) {
                                    Statics.field2423[var228 + 1] = Statics.field2423[var228];
                                }
                                if (Statics.field1838 == 0) {
                                    Statics.field2423 = new class8[100];
                                }
                                Statics.field2423[var226 + 1] = var225;
                                Statics.field1838++;
                                if (var219.equals(Statics.field1033.field51)) {
                                    Statics.field1827 = var221;
                                }
                            }
                            field666 = field657;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 187) {
                            int var229 = field514.method2489();
                            int var230 = field514.method2627();
                            int var231 = field514.method2627();
                            class156 var232 = class156.method2431(var229);
                            var232.field2558 = (var230 << 16) + var231;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 137 || field516 == 132 || field516 == 24 || field516 == 131 || field516 == 180 || field516 == 127 || field516 == 218 || field516 == 113 || field516 == 6 || field516 == 167 || field516 == 23) {
                            method3();
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 225) {
                            int var233 = field514.method2450();
                            int var234 = field514.method2450();
                            int var235 = field514.method2450();
                            int var236 = field514.method2450();
                            field721[var233] = true;
                            field722[var233] = var234;
                            field677[var233] = var235;
                            field530[var233] = var236;
                            field725[var233] = 0;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 146) {
                            String var237 = field514.method2603();
                            String var238 = class183.method3391(class146.method1266(class182.method143(field514)));
                            Statics.method2554(6, var237, var238);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 215) {
                            byte var239 = field514.method2478();
                            int var240 = field514.method2627();
                            class157.field2632[var240] = var239;
                            if (class157.field2634[var240] != var239) {
                                class157.field2634[var240] = var239;
                                Statics.method2411(var240);
                            }
                            field658[++field659 - 1 & 0x1F] = var240;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 228) {
                            field708 = field514.method2450();
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 73) {
                            int var241 = field514.method2483();
                            int var242 = field514.method2489();
                            int var243 = var241 >> 10 & 0x1F;
                            int var244 = var241 >> 5 & 0x1F;
                            int var245 = var241 & 0x1F;
                            int var246 = (var245 << 3) + (var243 << 19) + (var244 << 11);
                            class156 var247 = class156.method2431(var242);
                            if (var247.field2545 != var246) {
                                var247.field2545 = var246;
                                method2103(var247);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 205) {
                            field720 = true;
                            Statics.field349 = field514.method2450();
                            Statics.field215 = field514.method2450();
                            Statics.field2296 = field514.method2627();
                            Statics.field55 = field514.method2450();
                            Statics.field108 = field514.method2450();
                            if (Statics.field108 >= 100) {
                                Statics.field1804 = Statics.field349 * 128 + 64;
                                Statics.field755 = Statics.field215 * 128 + 64;
                                Statics.field70 = method121(Statics.field1804, Statics.field755, Statics.field244) - Statics.field2296;
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 247) {
                            method901();
                            int var248 = field514.method2475();
                            int var249 = field514.method2577();
                            int var250 = field514.method2624();
                            field727[var250] = var249;
                            field522[var250] = var248;
                            field613[var250] = 1;
                            for (int var251 = 0; var251 < 98; var251++) {
                                if (var249 >= class129.field2011[var251]) {
                                    field613[var250] = var251 + 2;
                                }
                            }
                            field662[++field663 - 1 & 0x1F] = var250;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 231) {
                            int var252 = field514.method2475();
                            String var253 = field514.method2603();
                            int var254 = field514.method2475();
                            if (var254 >= 1 && var254 <= 8) {
                                if (var253.equalsIgnoreCase("null")) {
                                    var253 = null;
                                }
                                field605[var254 - 1] = var253;
                                field574[var254 - 1] = var252 == 0;
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 16) {
                            while (field514.field2003 < field515) {
                                int var255 = field514.method2450();
                                boolean var256 = (var255 & 0x1) == 1;
                                String var257 = field514.method2603();
                                String var258 = field514.method2603();
                                field514.method2603();
                                for (int var259 = 0; var259 < field695; var259++) {
                                    class11 var260 = field478[var259];
                                    if (var256) {
                                        if (var258.equals(var260.field177)) {
                                            var260.field177 = var257;
                                            var260.field178 = var258;
                                            var257 = null;
                                            break;
                                        }
                                    } else if (var257.equals(var260.field177)) {
                                        var260.field177 = var257;
                                        var260.field178 = var258;
                                        var257 = null;
                                        break;
                                    }
                                }
                                if (var257 != null && field695 < 100) {
                                    class11 var261 = new class11();
                                    field478[field695] = var261;
                                    var261.field177 = var257;
                                    var261.field178 = var258;
                                    field695++;
                                }
                            }
                            field665 = field657;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 161) {
                            method901();
                            field639 = field514.method2450();
                            field667 = field657;
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 108) {
                            String var262 = field514.method2603();
                            long var263 = field514.method2607();
                            long var265 = (long) field514.method2627();
                            long var267 = (long) field514.method2454();
                            int var269 = field514.method2450();
                            long var270 = (var265 << 32) + var267;
                            boolean var272 = false;
                            for (int var273 = 0; var273 < 100; var273++) {
                                if (field590[var273] == var270) {
                                    var272 = true;
                                    break;
                                }
                            }
                            if (var269 <= 1 && method61(var262)) {
                                var272 = true;
                            }
                            if (!var272 && field557 == 0) {
                                field590[field577] = var270;
                                field577 = (field577 + 1) % 100;
                                String var274 = class183.method3391(class146.method1266(class182.method143(field514)));
                                if (var269 == 2 || var269 == 3) {
                                    method2211(9, class2.method29(1) + var262, var274, class145.method900(var263));
                                } else if (var269 == 1) {
                                    method2211(9, class2.method29(0) + var262, var274, class145.method900(var263));
                                } else {
                                    method2211(9, var262, var274, class145.method900(var263));
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 189) {
                            int var275 = field514.method2467();
                            int var276 = field514.method2465();
                            class156 var277 = class156.method2431(var275);
                            if (var277.field2546 != 2 || var277.field2519 != var276) {
                                var277.field2546 = 2;
                                var277.field2519 = var276;
                                method2103(var277);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 209) {
                            int var278 = field514.method2467();
                            int var279 = field514.method2483();
                            class156 var280 = class156.method2431(var278);
                            if (var280 != null && var280.field2587 == 0) {
                                if (var279 > var280.field2530 - var280.field2524) {
                                    var279 = var280.field2530 - var280.field2524;
                                }
                                if (var279 < 0) {
                                    var279 = 0;
                                }
                                if (var280.field2528 != var279) {
                                    var280.field2528 = var279;
                                    method2103(var280);
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 234) {
                            field734 = field514.method2450();
                            if (field734 == 1) {
                                field490 = field514.method2627();
                            }
                            if (field734 >= 2 && field734 <= 6) {
                                if (field734 == 2) {
                                    field681 = 64;
                                    field496 = 64;
                                }
                                if (field734 == 3) {
                                    field681 = 0;
                                    field496 = 64;
                                }
                                if (field734 == 4) {
                                    field681 = 128;
                                    field496 = 64;
                                }
                                if (field734 == 5) {
                                    field681 = 64;
                                    field496 = 0;
                                }
                                if (field734 == 6) {
                                    field681 = 64;
                                    field496 = 128;
                                }
                                field734 = 2;
                                field495 = field514.method2627();
                                field493 = field514.method2627();
                                field693 = field514.method2450();
                            }
                            if (field734 == 10) {
                                field649 = field514.method2627();
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 128) {
                            String var281 = field514.method2603();
                            int var282 = field514.method2467();
                            class156 var283 = class156.method2431(var282);
                            if (!var281.equals(var283.field2581)) {
                                var283.field2581 = var281;
                                method2103(var283);
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 27) {
                            int var284 = field515 + field514.field2003;
                            int var285 = field514.method2627();
                            int var286 = field514.method2627();
                            if (field634 != var285) {
                                field634 = var285;
                                int var287 = field634;
                                if (class156.method132(var287)) {
                                    class156[] var288 = Statics.field2537[var287];
                                    for (int var289 = 0; var289 < var288.length; var289++) {
                                        class156 var290 = var288[var289];
                                        if (var290 != null) {
                                            var290.field2620 = 0;
                                            var290.field2621 = 0;
                                        }
                                    }
                                }
                                class25.method1328(field634);
                                for (int var291 = 0; var291 < 100; var291++) {
                                    field645[var291] = true;
                                }
                            }
                            while (var286-- > 0) {
                                int var292 = field514.method2467();
                                int var293 = field514.method2627();
                                int var294 = field514.method2450();
                                class4 var295 = (class4) field712.method3281((long) var292);
                                if (var295 != null && var295.field59 != var293) {
                                    method600(var295, true);
                                    var295 = null;
                                }
                                if (var295 == null) {
                                    var295 = method131(var292, var293, var294);
                                }
                                var295.field60 = true;
                            }
                            for (class4 var296 = (class4) field712.method3285(); var296 != null; var296 = (class4) field712.method3286()) {
                                if (var296.field60) {
                                    var296.field60 = false;
                                } else {
                                    method600(var296, true);
                                }
                            }
                            field674 = new class173(512);
                            while (field514.field2003 < var284) {
                                int var297 = field514.method2467();
                                int var298 = field514.method2627();
                                int var299 = field514.method2627();
                                int var300 = field514.method2467();
                                for (int var301 = var298; var301 <= var299; var301++) {
                                    long var302 = ((long) var297 << 32) + (long) var301;
                                    field674.method3283(new class169(var300), var302);
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 91) {
                            int var304 = field514.method2465();
                            if (var304 == 65535) {
                                var304 = -1;
                            }
                            method113(var304);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 155) {
                            int var305 = field514.method2454();
                            int var306 = field514.method2484();
                            if (var306 == 65535) {
                                var306 = -1;
                            }
                            method2189(var306, var305);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 245) {
                            int var307 = field514.method2467();
                            class4 var308 = (class4) field712.method3281((long) var307);
                            if (var308 != null) {
                                method600(var308, true);
                            }
                            if (field638 != null) {
                                method2103(field638);
                                field638 = null;
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 220) {
                            Statics.field792 = field514.method2475();
                            Statics.field380 = field514.method2475();
                            for (int var309 = Statics.field380; var309 < Statics.field380 + 8; var309++) {
                                for (int var310 = Statics.field792; var310 < Statics.field792 + 8; var310++) {
                                    if (field608[Statics.field244][var309][var310] != null) {
                                        field608[Statics.field244][var309][var310] = null;
                                        method142(var309, var310);
                                    }
                                }
                            }
                            for (class21 var311 = (class21) field609.method3317(); var311 != null; var311 = (class21) field609.method3310()) {
                                if (var311.field339 >= Statics.field380 && var311.field339 < Statics.field380 + 8 && var311.field350 >= Statics.field792 && var311.field350 < Statics.field792 + 8 && Statics.field244 == var311.field337) {
                                    var311.field348 = 0;
                                }
                            }
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 30) {
                            method58(true);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        if (field516 == 192) {
                            int var312 = field514.method2489();
                            Statics.field408 = Statics.field1445.method1479(var312);
                            field516 = -1;
                            var1 = true;
                            break label2888;
                        }
                        class79.method218("" + field516 + class2.field22 + field707 + class2.field22 + field680 + class2.field22 + field515, (Throwable) null);
                        method1575();
                    } catch (IOException var441) {
                        method224();
                    } catch (Exception var442) {
                        String var315 = "" + field516 + class2.field22 + field707 + class2.field22 + field680 + class2.field22 + field515 + class2.field22 + (Statics.field333 + Statics.field1033.field444[0]) + class2.field22 + (Statics.field141 + Statics.field1033.field450[0]) + class2.field22;
                        for (int var316 = 0; var316 < field515 && var316 < 50; var316++) {
                            var315 = var315 + field514.field2007[var316] + class2.field22;
                        }
                        class79.method218(var315, var442);
                        method1575();
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
        class180.method42(field512, 166);
        Object var317 = Statics.field1797.field237;
        synchronized (Statics.field1797.field237) {
            if (!field469) {
                Statics.field1797.field238 = 0;
            } else if (class76.field1385 != 0 || Statics.field1797.field238 >= 40) {
                field512.method2307(171);
                field512.method2462(0);
                int var318 = field512.field2003;
                int var319 = 0;
                for (int var320 = 0; var320 < Statics.field1797.field238 && field512.field2003 - var318 < 240; var320++) {
                    var319++;
                    int var321 = Statics.field1797.field240[var320];
                    if (var321 < 0) {
                        var321 = 0;
                    } else if (var321 > 502) {
                        var321 = 502;
                    }
                    int var322 = Statics.field1797.field239[var320];
                    if (var322 < 0) {
                        var322 = 0;
                    } else if (var322 > 764) {
                        var322 = 764;
                    }
                    int var323 = var321 * 765 + var322;
                    if (Statics.field1797.field240[var320] == -1 && Statics.field1797.field239[var320] == -1) {
                        var322 = -1;
                        var321 = -1;
                        var323 = 524287;
                    }
                    if (field559 != var322 || field624 != var321) {
                        int var324 = var322 - field559;
                        field559 = var322;
                        int var325 = var321 - field624;
                        field624 = var321;
                        if (field627 < 8 && var324 >= -32 && var324 <= 31 && var325 >= -32 && var325 <= 31) {
                            var324 += 32;
                            var325 += 32;
                            field512.method2438((field627 << 12) + (var324 << 6) + var325);
                            field627 = 0;
                        } else if (field627 < 8) {
                            field512.method2439((field627 << 19) + 8388608 + var323);
                            field627 = 0;
                        } else {
                            field512.method2456((field627 << 19) + -1073741824 + var323);
                            field627 = 0;
                        }
                    } else if (field627 < 2047) {
                        field627++;
                    }
                }
                field512.method2447(field512.field2003 - var318);
                if (var319 >= Statics.field1797.field238) {
                    Statics.field1797.field238 = 0;
                } else {
                    Statics.field1797.field238 -= var319;
                    for (int var326 = 0; var326 < Statics.field1797.field238; var326++) {
                        Statics.field1797.field239[var326] = Statics.field1797.field239[var319 + var326];
                        Statics.field1797.field240[var326] = Statics.field1797.field240[var319 + var326];
                    }
                }
            }
        }
        if (class76.field1385 != 0) {
            long var328 = (class76.field1398 * 7166686839436477399L - field482) / 50L;
            if (var328 > 4095L) {
                var328 = 4095L;
            }
            field482 = class76.field1398 * 7166686839436477399L;
            int var330 = class76.field1397;
            if (var330 < 0) {
                var330 = 0;
            } else if (var330 > 502) {
                var330 = 502;
            }
            int var331 = class76.field1393;
            if (var331 < 0) {
                var331 = 0;
            } else if (var331 > 764) {
                var331 = 764;
            }
            int var332 = var330 * 765 + var331;
            byte var333 = 0;
            if (class76.field1385 == 2) {
                var333 = 1;
            }
            int var334 = (int) var328;
            field512.method2307(28);
            field512.method2488((var333 << 19) + (var334 << 20) + var332);
        }
        if (field564 > 0) {
            field564--;
        }
        if (class74.field1361[96] || class74.field1361[97] || class74.field1361[98] || class74.field1361[99]) {
            field492 = true;
        }
        if (field492 && field564 <= 0) {
            field564 = 20;
            field492 = false;
            field512.method2307(148);
            field512.method2481(field531);
            field512.method2481(field561);
        }
        if (Statics.field2279 && !field486) {
            field486 = true;
            field512.method2307(46);
            field512.method2462(1);
        }
        if (!Statics.field2279 && field486) {
            field486 = false;
            field512.method2307(46);
            field512.method2462(0);
        }
        method2370();
        if (field479 != 30) {
            return;
        }
        for (class21 var335 = (class21) field609.method3317(); var335 != null; var335 = (class21) field609.method3310()) {
            if (var335.field348 > 0) {
                var335.field348--;
            }
            if (var335.field348 == 0) {
                if (var335.field341 >= 0) {
                    int var336 = var335.field341;
                    int var337 = var335.field343;
                    class31 var338 = class31.method2662(var336);
                    if (var337 == 11) {
                        var337 = 10;
                    }
                    if (var337 >= 5 && var337 <= 8) {
                        var337 = 4;
                    }
                    boolean var339 = var338.method662(var337);
                    if (!var339) {
                        continue;
                    }
                }
                Statics.method2296(var335.field337, var335.field338, var335.field339, var335.field350, var335.field341, var335.field342, var335.field343);
                var335.method3346();
            } else {
                if (var335.field347 > 0) {
                    var335.field347--;
                }
                if (var335.field347 == 0 && var335.field339 >= 1 && var335.field350 >= 1 && var335.field339 <= 102 && var335.field350 <= 102 && (var335.field344 < 0 || class9.method785(var335.field344, var335.field346))) {
                    Statics.method2296(var335.field337, var335.field338, var335.field339, var335.field350, var335.field344, var335.field340, var335.field346);
                    var335.field347 = -1;
                    if (var335.field344 == var335.field341 && var335.field341 == -1) {
                        var335.method3346();
                    } else if (var335.field344 == var335.field341 && var335.field342 == var335.field340 && var335.field346 == var335.field343) {
                        var335.method3346();
                    }
                }
            }
        }
        int var10002;
        for (int var340 = 0; var340 < field473; var340++) {
            var10002 = field717[var340]--;
            if (field717[var340] >= -10) {
                class56 var342 = field719[var340];
                if (var342 == null) {
                    class56 var443 = (class56) null;
                    var342 = class56.method1245(Statics.field2348, field670[var340], 0);
                    if (var342 == null) {
                        continue;
                    }
                    field717[var340] += var342.method1247();
                    field719[var340] = var342;
                }
                if (field717[var340] < 0) {
                    int var349;
                    if (field718[var340] == 0) {
                        var349 = field540;
                    } else {
                        int var343 = (field718[var340] & 0xFF) * 128;
                        int var344 = field718[var340] >> 16 & 0xFF;
                        int var345 = var344 * 128 + 64 - Statics.field1033.field448;
                        if (var345 < 0) {
                            var345 = -var345;
                        }
                        int var346 = field718[var340] >> 8 & 0xFF;
                        int var347 = var346 * 128 + 64 - Statics.field1033.field410;
                        if (var347 < 0) {
                            var347 = -var347;
                        }
                        int var348 = var345 + var347 - 128;
                        if (var348 > var343) {
                            field717[var340] = -100;
                            continue;
                        }
                        if (var348 < 0) {
                            var348 = 0;
                        }
                        var349 = field713 * (var343 - var348) / var343;
                    }
                    if (var349 > 0) {
                        class62 var350 = var342.method1250().method1308(Statics.field1637);
                        class44 var351 = class44.method943(var350, 100, var349);
                        var351.method946(field673[var340] - 1);
                        Statics.field332.method1094(var351);
                    }
                    field717[var340] = -100;
                }
            } else {
                field473--;
                for (int var341 = var340; var341 < field473; var341++) {
                    field670[var341] = field670[var341 + 1];
                    field719[var341] = field719[var341 + 1];
                    field673[var341] = field673[var341 + 1];
                    field717[var341] = field717[var341 + 1];
                    field718[var341] = field718[var341 + 1];
                }
                var340--;
            }
        }
        if (field711) {
            boolean var352;
            if (class137.field2294 == 0) {
                var352 = Statics.field2293.method2721();
            } else {
                var352 = true;
            }
            if (!var352) {
                if (field709 != 0 && field710 != -1) {
                    class137.method1823(Statics.field1979, field710, 0, field709, false);
                }
                field711 = false;
            }
        }
        field517++;
        if (field517 > 750) {
            method224();
            return;
        }
        method1825();
        method1348();
        method1271();
        field551++;
        if (field584 != 0) {
            field648 += 20;
            if (field648 >= 400) {
                field584 = 0;
            }
        }
        if (Statics.field405 != null) {
            field585++;
            if (field585 >= 15) {
                method2103(Statics.field405);
                Statics.field405 = null;
            }
        }
        if (Statics.field86 != null) {
            method2103(Statics.field86);
            field601++;
            if (class76.field1389 > field581 + 5 || class76.field1389 < field581 - 5 || class76.field1390 > field589 + 5 || class76.field1390 < field589 - 5) {
                field591 = true;
            }
            if (class76.field1383 == 0) {
                if (!field591 || field601 < 5) {
                    label3093: {
                        label2127: {
                            if (field615 != 1) {
                                int var361 = field617 - 1;
                                boolean var362;
                                if (var361 < 0) {
                                    var362 = false;
                                } else {
                                    int var363 = field620[var361];
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
                                    break label2127;
                                }
                            }
                            if (field617 > 2) {
                                method2030();
                                break label3093;
                            }
                        }
                        if (field617 > 0) {
                            method112(field617 - 1);
                        }
                    }
                } else if (Statics.field86 == Statics.field2316 && field642 != field587) {
                    class156 var353 = Statics.field86;
                    byte var354 = 0;
                    if (field637 == 1 && var353.field2518 == 206) {
                        var354 = 1;
                    }
                    if (var353.field2616[field642] <= 0) {
                        var354 = 0;
                    }
                    int var355 = method883(var353);
                    boolean var356 = (var355 >> 29 & 0x1) != 0;
                    if (var356) {
                        int var357 = field587;
                        int var358 = field642;
                        var353.field2616[var358] = var353.field2616[var357];
                        var353.field2617[var358] = var353.field2617[var357];
                        var353.field2616[var357] = -1;
                        var353.field2617[var357] = 0;
                    } else if (var354 == 1) {
                        int var359 = field587;
                        int var360 = field642;
                        while (var359 != var360) {
                            if (var359 > var360) {
                                var353.method3084(var359 - 1, var359);
                                var359--;
                            } else if (var359 < var360) {
                                var353.method3084(var359 + 1, var359);
                                var359++;
                            }
                        }
                    } else {
                        var353.method3084(field642, field587);
                    }
                    field512.method2307(61);
                    field512.method2479(field642);
                    field512.method2553(field587);
                    field512.method2473(var354);
                    field512.method2456(Statics.field86.field2514);
                }
                field585 = 10;
                class76.field1385 = 0;
                Statics.field86 = null;
            }
        }
        class156 var364 = Statics.field1259;
        class156 var365 = Statics.field467;
        Statics.field1259 = null;
        Statics.field467 = null;
        field536 = null;
        field653 = false;
        field607 = false;
        for (field650 = 0; class74.method212() && field650 < 128; field650++) {
            field697[field650] = Statics.field181;
            field696[field650] = Statics.field383;
        }
        method628(field634, 0, 0, 765, 503, 0, 0);
        field657++;
        while (true) {
            class1 var366;
            class156 var367;
            class156 var368;
            do {
                var366 = (class1) field598.method3330();
                if (var366 == null) {
                    while (true) {
                        class1 var369;
                        class156 var370;
                        class156 var371;
                        do {
                            var369 = (class1) field714.method3330();
                            if (var369 == null) {
                                while (true) {
                                    class1 var372;
                                    class156 var373;
                                    class156 var374;
                                    do {
                                        var372 = (class1) field588.method3330();
                                        if (var372 == null) {
                                            if (field489 != null) {
                                                method2103(field489);
                                                Statics.field384++;
                                                if (field653 && field607) {
                                                    int var375 = class76.field1389;
                                                    int var376 = class76.field1390;
                                                    int var377 = var375 - field647;
                                                    int var378 = var376 - field549;
                                                    if (var377 < field651) {
                                                        var377 = field651;
                                                    }
                                                    if (field489.field2523 + var377 > field651 + field646.field2523) {
                                                        var377 = field651 + field646.field2523 - field489.field2523;
                                                    }
                                                    if (var378 < field652) {
                                                        var378 = field652;
                                                    }
                                                    if (field489.field2524 + var378 > field652 + field646.field2524) {
                                                        var378 = field652 + field646.field2524 - field489.field2524;
                                                    }
                                                    int var379 = var377 - field654;
                                                    int var380 = var378 - field622;
                                                    int var381 = field489.field2577;
                                                    if (Statics.field384 > field489.field2603 && (var379 > var381 || var379 < -var381 || var380 > var381 || var380 < -var381)) {
                                                        field656 = true;
                                                    }
                                                    int var382 = field646.field2527 + (var377 - field651);
                                                    int var383 = field646.field2528 + (var378 - field652);
                                                    if (field489.field2590 != null && field656) {
                                                        class1 var384 = new class1();
                                                        var384.field15 = field489;
                                                        var384.field3 = var382;
                                                        var384.field4 = var383;
                                                        var384.field13 = field489.field2590;
                                                        class25.method226(var384);
                                                    }
                                                    if (class76.field1383 == 0) {
                                                        if (field656) {
                                                            if (field489.field2591 != null) {
                                                                class1 var385 = new class1();
                                                                var385.field15 = field489;
                                                                var385.field3 = var382;
                                                                var385.field4 = var383;
                                                                var385.field6 = field536;
                                                                var385.field13 = field489.field2591;
                                                                class25.method226(var385);
                                                            }
                                                            if (field536 != null && method1833(field489) != null) {
                                                                field512.method2307(162);
                                                                field512.method2481(field536.field2534);
                                                                field512.method2455(field489.field2514);
                                                                field512.method2486(field536.field2514);
                                                                field512.method2479(field489.field2534);
                                                            }
                                                        } else {
                                                            label3055: {
                                                                label2022: {
                                                                    if (field615 != 1) {
                                                                        int var386 = field617 - 1;
                                                                        boolean var387;
                                                                        if (var386 < 0) {
                                                                            var387 = false;
                                                                        } else {
                                                                            int var388 = field620[var386];
                                                                            if (var388 >= 2000) {
                                                                                var388 -= 2000;
                                                                            }
                                                                            if (var388 == 1007) {
                                                                                var387 = true;
                                                                            } else {
                                                                                var387 = false;
                                                                            }
                                                                        }
                                                                        if (!var387) {
                                                                            break label2022;
                                                                        }
                                                                    }
                                                                    if (field617 > 2) {
                                                                        method2030();
                                                                        break label3055;
                                                                    }
                                                                }
                                                                if (field617 > 0) {
                                                                    method112(field617 - 1);
                                                                }
                                                            }
                                                        }
                                                        field489 = null;
                                                    }
                                                } else if (Statics.field384 > 1) {
                                                    field489 = null;
                                                }
                                            }
                                            if (class94.field1575 != -1) {
                                                int var389 = class94.field1575;
                                                int var390 = class94.field1576;
                                                boolean var391 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var389, var390, true, 0, 0, 0, 0, 0, 0);
                                                class94.field1575 = -1;
                                                if (var391) {
                                                    field548 = class76.field1393;
                                                    field678 = class76.field1397;
                                                    field584 = 1;
                                                    field648 = 0;
                                                }
                                            }
                                            if (Statics.field86 == null && field489 == null) {
                                                int var392 = class76.field1385;
                                                if (field616) {
                                                    if (var392 != 1) {
                                                        int var393 = class76.field1389;
                                                        int var394 = class76.field1390;
                                                        if (var393 < Statics.field187 - 10 || var393 > Statics.field187 + Statics.field1503 + 10 || var394 < Statics.field284 - 10 || var394 > Statics.field284 + Statics.field1504 + 10) {
                                                            field616 = false;
                                                            method2434(Statics.field187, Statics.field284, Statics.field1503, Statics.field1504);
                                                        }
                                                    }
                                                    if (var392 == 1) {
                                                        int var395 = Statics.field187;
                                                        int var396 = Statics.field284;
                                                        int var397 = Statics.field1503;
                                                        int var398 = class76.field1393;
                                                        int var399 = class76.field1397;
                                                        int var400 = -1;
                                                        for (int var401 = 0; var401 < field617; var401++) {
                                                            int var402 = (field617 - 1 - var401) * 15 + var396 + 31;
                                                            if (var398 > var395 && var398 < var395 + var397 && var399 > var402 - 13 && var399 < var402 + 3) {
                                                                var400 = var401;
                                                            }
                                                        }
                                                        if (var400 != -1) {
                                                            method112(var400);
                                                        }
                                                        field616 = false;
                                                        method2434(Statics.field187, Statics.field284, Statics.field1503, Statics.field1504);
                                                    }
                                                } else {
                                                    label3086: {
                                                        if (var392 == 1 && field617 > 0) {
                                                            int var403 = field620[field617 - 1];
                                                            if (var403 == 39 || var403 == 40 || var403 == 41 || var403 == 42 || var403 == 43 || var403 == 33 || var403 == 34 || var403 == 35 || var403 == 36 || var403 == 37 || var403 == 38 || var403 == 1005) {
                                                                label3095: {
                                                                    int var404 = field618[field617 - 1];
                                                                    int var405 = field619[field617 - 1];
                                                                    class156 var406 = class156.method2431(var405);
                                                                    int var407 = method883(var406);
                                                                    boolean var408 = (var407 >> 28 & 0x1) != 0;
                                                                    if (!var408) {
                                                                        int var409 = method883(var406);
                                                                        boolean var410 = (var409 >> 29 & 0x1) != 0;
                                                                        if (!var410) {
                                                                            break label3095;
                                                                        }
                                                                    }
                                                                    field591 = false;
                                                                    field601 = 0;
                                                                    if (Statics.field86 != null) {
                                                                        method2103(Statics.field86);
                                                                    }
                                                                    Statics.field86 = class156.method2431(var405);
                                                                    field587 = var404;
                                                                    field581 = class76.field1393;
                                                                    field589 = class76.field1397;
                                                                    method2103(Statics.field86);
                                                                    break label3086;
                                                                }
                                                            }
                                                        }
                                                        if (var392 == 1) {
                                                            label3107: {
                                                                if (field615 != 1 || field617 <= 2) {
                                                                    int var411 = field617 - 1;
                                                                    boolean var412;
                                                                    if (var411 < 0) {
                                                                        var412 = false;
                                                                    } else {
                                                                        int var413 = field620[var411];
                                                                        if (var413 >= 2000) {
                                                                            var413 -= 2000;
                                                                        }
                                                                        if (var413 == 1007) {
                                                                            var412 = true;
                                                                        } else {
                                                                            var412 = false;
                                                                        }
                                                                    }
                                                                    if (!var412) {
                                                                        break label3107;
                                                                    }
                                                                }
                                                                var392 = 2;
                                                            }
                                                        }
                                                        if (var392 == 1 && field617 > 0) {
                                                            method112(field617 - 1);
                                                        }
                                                        if (var392 == 2 && field617 > 0) {
                                                            method2030();
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field1259 != var364) {
                                                if (var364 != null) {
                                                    method2103(var364);
                                                }
                                                if (Statics.field1259 != null) {
                                                    method2103(Statics.field1259);
                                                }
                                            }
                                            if (Statics.field467 != var365 && field626 == field483) {
                                                if (var365 != null) {
                                                    method2103(var365);
                                                }
                                                if (Statics.field467 != null) {
                                                    method2103(Statics.field467);
                                                }
                                            }
                                            if (Statics.field467 == null) {
                                                if (field626 > 0) {
                                                    field626--;
                                                }
                                            } else if (field626 < field483) {
                                                field626++;
                                                if (field626 == field483) {
                                                    method2103(Statics.field467);
                                                }
                                            }
                                            int var414 = field539 + Statics.field1033.field448;
                                            int var415 = field541 + Statics.field1033.field410;
                                            if (Statics.field205 - var414 < -500 || Statics.field205 - var414 > 500 || Statics.field381 - var415 < -500 || Statics.field381 - var415 > 500) {
                                                Statics.field205 = var414;
                                                Statics.field381 = var415;
                                            }
                                            if (Statics.field205 != var414) {
                                                Statics.field205 += (var414 - Statics.field205) / 16;
                                            }
                                            if (Statics.field381 != var415) {
                                                Statics.field381 += (var415 - Statics.field381) / 16;
                                            }
                                            if (class74.field1361[96]) {
                                                field562 += (-24 - field562) / 2;
                                            } else if (class74.field1361[97]) {
                                                field562 += (24 - field562) / 2;
                                            } else {
                                                field562 /= 2;
                                            }
                                            if (class74.field1361[98]) {
                                                field735 += (12 - field735) / 2;
                                            } else if (class74.field1361[99]) {
                                                field735 += (-12 - field735) / 2;
                                            } else {
                                                field735 /= 2;
                                            }
                                            field561 = field562 / 2 + field561 & 0x7FF;
                                            field531 += field735 / 2;
                                            if (field531 < 128) {
                                                field531 = 128;
                                            }
                                            if (field531 > 383) {
                                                field531 = 383;
                                            }
                                            int var416 = Statics.field205 >> 7;
                                            int var417 = Statics.field381 >> 7;
                                            int var418 = method121(Statics.field205, Statics.field381, Statics.field244);
                                            int var419 = 0;
                                            if (var416 > 3 && var417 > 3 && var416 < 100 && var417 < 100) {
                                                for (int var420 = var416 - 4; var420 <= var416 + 4; var420++) {
                                                    for (int var421 = var417 - 4; var421 <= var417 + 4; var421++) {
                                                        int var422 = Statics.field244;
                                                        if (var422 < 3 && (class9.field124[1][var420][var421] & 0x2) == 2) {
                                                            var422++;
                                                        }
                                                        int var423 = var418 - class9.field121[var422][var420][var421];
                                                        if (var423 > var419) {
                                                            var419 = var423;
                                                        }
                                                    }
                                                }
                                            }
                                            int var424 = var419 * 192;
                                            if (var424 > 98048) {
                                                var424 = 98048;
                                            }
                                            if (var424 < 32768) {
                                                var424 = 32768;
                                            }
                                            if (var424 > field566) {
                                                field566 += (var424 - field566) / 24;
                                            } else if (var424 < field566) {
                                                field566 += (var424 - field566) / 80;
                                            }
                                            if (field720) {
                                                method812();
                                            }
                                            for (int var425 = 0; var425 < 5; var425++) {
                                                var10002 = field725[var425]++;
                                            }
                                            int var426 = class76.method129();
                                            int var427 = class74.field1370;
                                            if (var426 > 15000 && var427 > 15000) {
                                                field716 = 250;
                                                class76.field1395 = 14500;
                                                field512.method2307(141);
                                            }
                                            field583++;
                                            if (field583 > 500) {
                                                field583 = 0;
                                                int var429 = (int) (Math.random() * 8.0D);
                                                if ((var429 & 0x1) == 1) {
                                                    field539 += field671;
                                                }
                                                if ((var429 & 0x2) == 2) {
                                                    field541 += field655;
                                                }
                                                if ((var429 & 0x4) == 4) {
                                                    field592 += field544;
                                                }
                                            }
                                            if (field539 < -50) {
                                                field671 = 2;
                                            }
                                            if (field539 > 50) {
                                                field671 = -2;
                                            }
                                            if (field541 < -55) {
                                                field655 = 2;
                                            }
                                            if (field541 > 55) {
                                                field655 = -2;
                                            }
                                            if (field592 < -40) {
                                                field544 = 1;
                                            }
                                            if (field592 > 40) {
                                                field544 = -1;
                                            }
                                            field550++;
                                            if (field550 > 500) {
                                                field550 = 0;
                                                int var430 = (int) (Math.random() * 8.0D);
                                                if ((var430 & 0x1) == 1) {
                                                    field484 += field547;
                                                }
                                                if ((var430 & 0x2) == 2) {
                                                    field472 += field628;
                                                }
                                            }
                                            if (field484 < -60) {
                                                field547 = 2;
                                            }
                                            if (field484 > 60) {
                                                field547 = -2;
                                            }
                                            if (field472 < -20) {
                                                field628 = 1;
                                            }
                                            if (field472 > 10) {
                                                field628 = -1;
                                            }
                                            for (class27 var431 = (class27) field729.method3269(); var431 != null; var431 = (class27) field729.method3267()) {
                                                if ((long) var431.field746 < class120.method228() / 1000L - 5L) {
                                                    if (var431.field739 > 0) {
                                                        Statics.method2554(0, "", var431.field740 + class133.field2178);
                                                    }
                                                    if (var431.field739 == 0) {
                                                        Statics.method2554(0, "", var431.field740 + class133.field2179);
                                                    }
                                                    var431.method3343();
                                                }
                                            }
                                            field518++;
                                            if (field518 > 50) {
                                                field512.method2307(87);
                                            }
                                            try {
                                                if (Statics.field2287 != null && field512.field2003 > 0) {
                                                    Statics.field2287.method1363(field512.field2007, 0, field512.field2003);
                                                    field512.field2003 = 0;
                                                    field518 = 0;
                                                }
                                            } catch (IOException var433) {
                                                method224();
                                            }
                                            return;
                                        }
                                        var373 = var372.field15;
                                        if (var373.field2534 < 0) {
                                            break;
                                        }
                                        var374 = class156.method2431(var373.field2525);
                                    } while (var374 == null || var374.field2622 == null || var373.field2534 >= var374.field2622.length || var374.field2622[var373.field2534] != var373);
                                    class25.method226(var372);
                                }
                            }
                            var370 = var369.field15;
                            if (var370.field2534 < 0) {
                                break;
                            }
                            var371 = class156.method2431(var370.field2525);
                        } while (var371 == null || var371.field2622 == null || var370.field2534 >= var371.field2622.length || var371.field2622[var370.field2534] != var370);
                        class25.method226(var369);
                    }
                }
                var367 = var366.field15;
                if (var367.field2534 < 0) {
                    break;
                }
                var368 = class156.method2431(var367.field2525);
            } while (var368 == null || var368.field2622 == null || var367.field2534 >= var368.field2622.length || var368.field2622[var367.field2534] != var367);
            class25.method226(var366);
        }
    }

    @ObfuscatedName("ar.s(I)V")
    public static final void method614() {
        if (Statics.field1293 != null) {
            Statics.field1293.method1151();
        }
        if (Statics.field372 != null) {
            Statics.field372.method1151();
        }
    }

    @ObfuscatedName("i.au(Las;IIII)V")
    public static void method33(class33 arg0, int arg1, int arg2, int arg3) {
        if (field473 >= 50 || field713 == 0 || arg0.field887 == null || arg1 >= arg0.field887.length) {
            return;
        }
        int var4 = arg0.field887[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field670[field473] = var5;
        field673[field473] = var6;
        field717[field473] = 0;
        field719[field473] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field718[field473] = (var8 << 16) + (var9 << 8) + var7;
        field473++;
    }

    @ObfuscatedName("dz.ay(IIII)V")
    public static void method2371(int arg0, int arg1, int arg2) {
        if (field540 == 0 || arg1 == 0 || field473 >= 50) {
            return;
        }
        field670[field473] = arg0;
        field673[field473] = arg1;
        field717[field473] = arg2;
        field719[field473] = null;
        field718[field473] = 0;
        field473++;
    }

    @ObfuscatedName("t.ar(II)V")
    public static void method113(int arg0) {
        if (arg0 == -1 && !field711) {
            Statics.method145();
        } else if (arg0 != -1 && field710 != arg0 && field709 != 0 && !field711) {
            class137.method163(2, Statics.field1979, arg0, 0, field709, false);
        }
        field710 = arg0;
    }

    @ObfuscatedName("de.aj(III)V")
    public static void method2189(int arg0, int arg1) {
        if (field709 != 0 && arg0 != -1) {
            class137.method1823(Statics.field88, arg0, 0, field709, false);
            field711 = true;
        }
    }

    @ObfuscatedName("dz.ad(I)V")
    public static final void method2370() {
        if (field475 && Statics.field244 != field524) {
            method207(Statics.field1091, Statics.field79, Statics.field244, Statics.field1033.field444[0], Statics.field1033.field450[0]);
        } else if (Statics.field244 != field700) {
            field700 = Statics.field244;
            method225(Statics.field244);
        }
    }

    @ObfuscatedName("fc.at(IIB)V")
    public static final void method3358(int arg0, int arg1) {
        if (field708 != 0 && field708 != 3 || class76.field1385 != 1) {
            return;
        }
        int var2 = class76.field1393 - 25 - arg0;
        int var3 = class76.field1397 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field561 + field484 & 0x7FF;
        int var5 = class103.field1757[var4];
        int var6 = class103.field1746[var4];
        int var7 = (field472 + 256) * var5 >> 8;
        int var8 = (field472 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1033.field448 + var9 >> 7;
        int var12 = Statics.field1033.field410 - var10 >> 7;
        boolean var13 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field512.method2462(var2);
        field512.method2462(var3);
        field512.method2438(field561);
        field512.method2462(57);
        field512.method2462(field484);
        field512.method2462(field472);
        field512.method2462(89);
        field512.method2438(Statics.field1033.field448);
        field512.method2438(Statics.field1033.field410);
        field512.method2462(field534);
        field512.method2462(63);
    }

    @ObfuscatedName("bu.as(B)V")
    public static final void method1271() {
        for (int var0 = -1; var0 < field576; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field698[var0];
            }
            class3 var2 = field660[var1];
            if (var2 != null && var2.field409 > 0) {
                var2.field409--;
                if (var2.field409 == 0) {
                    var2.field422 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field510; var3++) {
            int var4 = field511[var3];
            class24 var5 = field509[var4];
            if (var5 != null && var5.field409 > 0) {
                var5.field409--;
                if (var5.field409 == 0) {
                    var5.field422 = null;
                }
            }
        }
    }

    @ObfuscatedName("p.aw(Ljava/lang/String;I)V")
    public static final void method27(String arg0) {
        if (field641 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method224();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field542 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field542 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field629[var1].field2672[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field636 == 2) {
                throw new RuntimeException();
            }
        }
        field512.method2307(84);
        field512.method2462(arg0.length() - 1);
        field512.method2442(arg0.substring(2));
    }

    @ObfuscatedName("an.ax(B)V")
    public static final void method812() {
        int var0 = Statics.field349 * 128 + 64;
        int var1 = Statics.field215 * 128 + 64;
        int var2 = method121(var0, var1, Statics.field244) - Statics.field2296;
        if (Statics.field1804 < var0) {
            Statics.field1804 += Statics.field108 * (var0 - Statics.field1804) / 1000 + Statics.field55;
            if (Statics.field1804 > var0) {
                Statics.field1804 = var0;
            }
        }
        if (Statics.field1804 > var0) {
            Statics.field1804 -= Statics.field108 * (Statics.field1804 - var0) / 1000 + Statics.field55;
            if (Statics.field1804 < var0) {
                Statics.field1804 = var0;
            }
        }
        if (Statics.field70 < var2) {
            Statics.field70 += Statics.field108 * (var2 - Statics.field70) / 1000 + Statics.field55;
            if (Statics.field70 > var2) {
                Statics.field70 = var2;
            }
        }
        if (Statics.field70 > var2) {
            Statics.field70 -= Statics.field108 * (Statics.field70 - var2) / 1000 + Statics.field55;
            if (Statics.field70 < var2) {
                Statics.field70 = var2;
            }
        }
        if (Statics.field755 < var1) {
            Statics.field755 += Statics.field108 * (var1 - Statics.field755) / 1000 + Statics.field55;
            if (Statics.field755 > var1) {
                Statics.field755 = var1;
            }
        }
        if (Statics.field755 > var1) {
            Statics.field755 -= Statics.field108 * (Statics.field755 - var1) / 1000 + Statics.field55;
            if (Statics.field755 < var1) {
                Statics.field755 = var1;
            }
        }
        int var3 = Statics.field179 * 128 + 64;
        int var4 = Statics.field17 * 128 + 64;
        int var5 = method121(var3, var4, Statics.field244) - Statics.field1291;
        int var6 = var3 - Statics.field1804;
        int var7 = var5 - Statics.field70;
        int var8 = var4 - Statics.field755;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2001 < var10) {
            Statics.field2001 += Statics.field878 * (var10 - Statics.field2001) / 1000 + Statics.field281;
            if (Statics.field2001 > var10) {
                Statics.field2001 = var10;
            }
        }
        if (Statics.field2001 > var10) {
            Statics.field2001 -= Statics.field878 * (Statics.field2001 - var10) / 1000 + Statics.field281;
            if (Statics.field2001 < var10) {
                Statics.field2001 = var10;
            }
        }
        int var12 = var11 - Statics.field171;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field171 += Statics.field878 * var12 / 1000 + Statics.field281;
            Statics.field171 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field171 -= Statics.field878 * -var12 / 1000 + Statics.field281;
            Statics.field171 &= 0x7FF;
        }
        int var13 = var11 - Statics.field171;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field171 = var11;
        }
    }

    @ObfuscatedName("cf.am(I)V")
    public static final void method1825() {
        for (int var0 = -1; var0 < field576; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field698[var0];
            }
            class3 var2 = field660[var1];
            if (var2 != null) {
                method2675(var2, 1);
            }
        }
    }

    @ObfuscatedName("bi.an(I)V")
    public static final void method1348() {
        for (int var0 = 0; var0 < field510; var0++) {
            int var1 = field511[var0];
            class24 var2 = field509[var1];
            if (var2 != null) {
                method2675(var2, var2.field386.field783);
            }
        }
    }

    @ObfuscatedName("et.ap(Ls;II)V")
    public static final void method2675(class26 arg0, int arg1) {
        if (arg0.field461 > field481) {
            int var2 = arg0.field461 - field481;
            int var3 = arg0.field441 * 128 + arg0.field413 * 64;
            int var4 = arg0.field465 * 128 + arg0.field413 * 64;
            arg0.field448 += (var3 - arg0.field448) / var2;
            arg0.field410 += (var4 - arg0.field410) / var2;
            arg0.field433 = 0;
            if (arg0.field452 == 0) {
                arg0.field462 = 1024;
            }
            if (arg0.field452 == 1) {
                arg0.field462 = 1536;
            }
            if (arg0.field452 == 2) {
                arg0.field462 = 0;
            }
            if (arg0.field452 == 3) {
                arg0.field462 = 512;
            }
        } else if (arg0.field453 >= field481) {
            method2660(arg0);
        } else {
            method2171(arg0);
        }
        if (arg0.field448 < 128 || arg0.field410 < 128 || arg0.field448 >= 13184 || arg0.field410 >= 13184) {
            arg0.field438 = -1;
            arg0.field443 = -1;
            arg0.field461 = 0;
            arg0.field453 = 0;
            arg0.field448 = arg0.field444[0] * 128 + arg0.field413 * 64;
            arg0.field410 = arg0.field450[0] * 128 + arg0.field413 * 64;
            arg0.method238();
        }
        if (Statics.field1033 == arg0 && (arg0.field448 < 1536 || arg0.field410 < 1536 || arg0.field448 >= 11776 || arg0.field410 >= 11776)) {
            arg0.field438 = -1;
            arg0.field443 = -1;
            arg0.field461 = 0;
            arg0.field453 = 0;
            arg0.field448 = arg0.field444[0] * 128 + arg0.field413 * 64;
            arg0.field410 = arg0.field450[0] * 128 + arg0.field413 * 64;
            arg0.method238();
        }
        if (arg0.field459 != 0) {
            if (arg0.field432 != -1 && arg0.field432 < 32768) {
                class24 var5 = field509[arg0.field432];
                if (var5 != null) {
                    int var6 = arg0.field448 - var5.field448;
                    int var7 = arg0.field410 - var5.field410;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field462 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field432 >= 32768) {
                int var8 = arg0.field432 - 32768;
                if (field600 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field660[var8];
                if (var9 != null) {
                    int var10 = arg0.field448 - var9.field448;
                    int var11 = arg0.field410 - var9.field410;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field462 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field425 != 0 || arg0.field434 != 0) && (arg0.field460 == 0 || arg0.field433 > 0)) {
                int var12 = arg0.field448 - (arg0.field425 * 64 - Statics.field333 * 64 - Statics.field333 * 64);
                int var13 = arg0.field410 - (arg0.field434 * 64 - Statics.field141 * 64 - Statics.field141 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field462 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field425 = 0;
                arg0.field434 = 0;
            }
            int var14 = arg0.field462 - arg0.field411 & 0x7FF;
            if (var14 == 0) {
                arg0.field458 = 0;
            } else {
                arg0.field458++;
                if (var14 > 1024) {
                    arg0.field411 -= arg0.field459;
                    boolean var15 = true;
                    if (var14 < arg0.field459 || var14 > 2048 - arg0.field459) {
                        arg0.field411 = arg0.field462;
                        var15 = false;
                    }
                    if (arg0.field435 == arg0.field430 && (arg0.field458 > 25 || var15)) {
                        if (arg0.field415 == -1) {
                            arg0.field435 = arg0.field417;
                        } else {
                            arg0.field435 = arg0.field415;
                        }
                    }
                } else {
                    arg0.field411 += arg0.field459;
                    boolean var16 = true;
                    if (var14 < arg0.field459 || var14 > 2048 - arg0.field459) {
                        arg0.field411 = arg0.field462;
                        var16 = false;
                    }
                    if (arg0.field435 == arg0.field430 && (arg0.field458 > 25 || var16)) {
                        if (arg0.field416 == -1) {
                            arg0.field435 = arg0.field417;
                        } else {
                            arg0.field435 = arg0.field416;
                        }
                    }
                }
                arg0.field411 &= 0x7FF;
            }
        }
        method36(arg0);
    }

    @ObfuscatedName("dd.ae(Ls;I)V")
    public static final void method2660(class26 arg0) {
        if (field481 == arg0.field453 || arg0.field438 == -1 || arg0.field440 != 0 || arg0.field447 + 1 > class33.method2674(arg0.field438).field894[arg0.field439]) {
            int var1 = arg0.field453 - arg0.field461;
            int var2 = field481 - arg0.field461;
            int var3 = arg0.field441 * 128 + arg0.field413 * 64;
            int var4 = arg0.field465 * 128 + arg0.field413 * 64;
            int var5 = arg0.field423 * 128 + arg0.field413 * 64;
            int var6 = arg0.field451 * 128 + arg0.field413 * 64;
            arg0.field448 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field410 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field433 = 0;
        if (arg0.field452 == 0) {
            arg0.field462 = 1024;
        }
        if (arg0.field452 == 1) {
            arg0.field462 = 1536;
        }
        if (arg0.field452 == 2) {
            arg0.field462 = 0;
        }
        if (arg0.field452 == 3) {
            arg0.field462 = 512;
        }
        arg0.field411 = arg0.field462;
    }

    @ObfuscatedName("ca.av(Ls;I)V")
    public static final void method2171(class26 arg0) {
        arg0.field435 = arg0.field430;
        if (arg0.field460 == 0) {
            arg0.field433 = 0;
            return;
        }
        if (arg0.field438 != -1 && arg0.field440 == 0) {
            class33 var1 = class33.method2674(arg0.field438);
            if (arg0.field454 > 0 && var1.field895 == 0) {
                arg0.field433++;
                return;
            }
            if (arg0.field454 <= 0 && var1.field896 == 0) {
                arg0.field433++;
                return;
            }
        }
        int var2 = arg0.field448;
        int var3 = arg0.field410;
        int var4 = arg0.field444[arg0.field460 - 1] * 128 + arg0.field413 * 64;
        int var5 = arg0.field450[arg0.field460 - 1] * 128 + arg0.field413 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field448 = var4;
            arg0.field410 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field462 = 1280;
            } else if (var3 > var5) {
                arg0.field462 = 1792;
            } else {
                arg0.field462 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field462 = 768;
            } else if (var3 > var5) {
                arg0.field462 = 256;
            } else {
                arg0.field462 = 512;
            }
        } else if (var3 < var5) {
            arg0.field462 = 1024;
        } else if (var3 > var5) {
            arg0.field462 = 0;
        }
        int var6 = arg0.field462 - arg0.field411 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field449;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field417;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field420;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field419;
        }
        if (var7 == -1) {
            var7 = arg0.field417;
        }
        arg0.field435 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class24) {
            var9 = ((class24) arg0).field386.field777;
        }
        if (var9) {
            if (arg0.field462 != arg0.field411 && arg0.field432 == -1 && arg0.field459 != 0) {
                var8 = 2;
            }
            if (arg0.field460 > 2) {
                var8 = 6;
            }
            if (arg0.field460 > 3) {
                var8 = 8;
            }
            if (arg0.field433 > 0 && arg0.field460 > 1) {
                var8 = 8;
                arg0.field433--;
            }
        } else {
            if (arg0.field460 > 1) {
                var8 = 6;
            }
            if (arg0.field460 > 2) {
                var8 = 8;
            }
            if (arg0.field433 > 0 && arg0.field460 > 1) {
                var8 = 8;
                arg0.field433--;
            }
        }
        if (arg0.field463[arg0.field460 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field435 == arg0.field417 && arg0.field421 != -1) {
            arg0.field435 = arg0.field421;
        }
        if (var2 < var4) {
            arg0.field448 += var8;
            if (arg0.field448 > var4) {
                arg0.field448 = var4;
            }
        } else if (var2 > var4) {
            arg0.field448 -= var8;
            if (arg0.field448 < var4) {
                arg0.field448 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field410 += var8;
            if (arg0.field410 > var5) {
                arg0.field410 = var5;
            }
        } else if (var3 > var5) {
            arg0.field410 -= var8;
            if (arg0.field410 < var5) {
                arg0.field410 = var5;
            }
        }
        if (arg0.field448 == var4 && arg0.field410 == var5) {
            arg0.field460--;
            if (arg0.field454 > 0) {
                arg0.field454--;
            }
        }
    }

    @ObfuscatedName("i.ac(Ls;I)V")
    public static final void method36(class26 arg0) {
        arg0.field437 = false;
        if (arg0.field435 != -1) {
            class33 var1 = class33.method2674(arg0.field435);
            if (var1 == null || var1.field884 == null) {
                arg0.field435 = -1;
            } else {
                arg0.field412++;
                if (arg0.field436 < var1.field884.length && arg0.field412 > var1.field894[arg0.field436]) {
                    arg0.field412 = 1;
                    arg0.field436++;
                    method33(var1, arg0.field436, arg0.field448, arg0.field410);
                }
                if (arg0.field436 >= var1.field884.length) {
                    arg0.field412 = 0;
                    arg0.field436 = 0;
                    method33(var1, arg0.field436, arg0.field448, arg0.field410);
                }
            }
        }
        if (arg0.field443 != -1 && field481 >= arg0.field446) {
            if (arg0.field464 < 0) {
                arg0.field464 = 0;
            }
            int var2 = Statics.method813(arg0.field443).field904;
            if (var2 == -1) {
                arg0.field443 = -1;
            } else {
                class33 var3 = class33.method2674(var2);
                if (var3 == null || var3.field884 == null) {
                    arg0.field443 = -1;
                } else {
                    arg0.field445++;
                    if (arg0.field464 < var3.field884.length && arg0.field445 > var3.field894[arg0.field464]) {
                        arg0.field445 = 1;
                        arg0.field464++;
                        method33(var3, arg0.field464, arg0.field448, arg0.field410);
                    }
                    if (arg0.field464 >= var3.field884.length && (arg0.field464 < 0 || arg0.field464 >= var3.field884.length)) {
                        arg0.field443 = -1;
                    }
                }
            }
        }
        if (arg0.field438 != -1 && arg0.field440 <= 1) {
            class33 var4 = class33.method2674(arg0.field438);
            if (var4.field895 == 1 && arg0.field454 > 0 && arg0.field461 <= field481 && arg0.field453 < field481) {
                arg0.field440 = 1;
                return;
            }
        }
        if (arg0.field438 != -1 && arg0.field440 == 0) {
            class33 var5 = class33.method2674(arg0.field438);
            if (var5 == null || var5.field884 == null) {
                arg0.field438 = -1;
            } else {
                arg0.field447++;
                if (arg0.field439 < var5.field884.length && arg0.field447 > var5.field894[arg0.field439]) {
                    arg0.field447 = 1;
                    arg0.field439++;
                    method33(var5, arg0.field439, arg0.field448, arg0.field410);
                }
                if (arg0.field439 >= var5.field884.length) {
                    arg0.field439 -= var5.field888;
                    arg0.field442++;
                    if (arg0.field442 >= var5.field883) {
                        arg0.field438 = -1;
                    } else if (arg0.field439 >= 0 && arg0.field439 < var5.field884.length) {
                        method33(var5, arg0.field439, arg0.field448, arg0.field410);
                    } else {
                        arg0.field438 = -1;
                    }
                }
                arg0.field437 = var5.field886;
            }
        }
        if (arg0.field440 > 0) {
            arg0.field440--;
        }
    }

    @ObfuscatedName("cf.ai(Lc;III)V")
    public static void method1827(class3 arg0, int arg1, int arg2) {
        if (arg0.field438 == arg1 && arg1 != -1) {
            int var3 = class33.method2674(arg1).field897;
            if (var3 == 1) {
                arg0.field439 = 0;
                arg0.field447 = 0;
                arg0.field440 = arg2;
                arg0.field442 = 0;
            }
            if (var3 == 2) {
                arg0.field442 = 0;
            }
        } else if (arg1 == -1 || arg0.field438 == -1 || class33.method2674(arg1).field892 >= class33.method2674(arg0.field438).field892) {
            arg0.field438 = arg1;
            arg0.field439 = 0;
            arg0.field447 = 0;
            arg0.field440 = arg2;
            arg0.field442 = 0;
            arg0.field454 = arg0.field460;
        }
    }

    @ObfuscatedName("dd.ah(ZI)V")
    public static final void method2659(boolean arg0) {
        for (int var1 = 0; var1 < field510; var1++) {
            class24 var2 = field509[field511[var1]];
            int var3 = (field511[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field386.field802 == arg0 && var2.field386.method619()) {
                int var4 = var2.field448 >> 7;
                int var5 = var2.field410 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field413 == 1 && (var2.field448 & 0x7F) == 64 && (var2.field410 & 0x7F) == 64) {
                        if (field578 == field731[var4][var5]) {
                            continue;
                        }
                        field731[var4][var5] = field578;
                    }
                    if (!var2.field386.field810) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2020.method2003(Statics.field244, var2.field448, var2.field410, method121(var2.field448 + (var2.field413 * 64 - 64), var2.field410 + (var2.field413 * 64 - 64), Statics.field244), var2.field413 * 64 - 64 + 60, var2, var2.field411, var3, var2.field437);
                }
            }
        }
    }

    @ObfuscatedName("bx.af(I)V")
    public static final void method1511() {
        for (class10 var0 = (class10) field606.method3317(); var0 != null; var0 = (class10) field606.method3310()) {
            if (Statics.field244 != var0.field155 || field481 > var0.field153) {
                var0.method3346();
            } else if (field481 >= var0.field152) {
                if (var0.field156 > 0) {
                    class24 var1 = field509[var0.field156 - 1];
                    if (var1 != null && var1.field448 >= 0 && var1.field448 < 13312 && var1.field410 >= 0 && var1.field410 < 13312) {
                        var0.method108(var1.field448, var1.field410, method121(var1.field448, var1.field410, var0.field155) - var0.field163, field481);
                    }
                }
                if (var0.field156 < 0) {
                    int var2 = -var0.field156 - 1;
                    class3 var3;
                    if (field600 == var2) {
                        var3 = Statics.field1033;
                    } else {
                        var3 = field660[var2];
                    }
                    if (var3 != null && var3.field448 >= 0 && var3.field448 < 13312 && var3.field410 >= 0 && var3.field410 < 13312) {
                        var0.method108(var3.field448, var3.field410, method121(var3.field448, var3.field410, var0.field155) - var0.field163, field481);
                    }
                }
                var0.method109(field551);
                Statics.field2020.method2003(Statics.field244, (int) var0.field158, (int) var0.field159, (int) var0.field169, 60, var0, var0.field166, -1, false);
            }
        }
    }

    @ObfuscatedName("w.aa(I)I")
    public static final int method227() {
        int var0 = 3;
        if (Statics.field2001 < 310) {
            int var1 = Statics.field1804 >> 7;
            int var2 = Statics.field755 >> 7;
            int var3 = Statics.field1033.field448 >> 7;
            int var4 = Statics.field1033.field410 >> 7;
            if ((class9.field124[Statics.field244][var1][var2] & 0x4) != 0) {
                var0 = Statics.field244;
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
                    if ((class9.field124[Statics.field244][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field244;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field124[Statics.field244][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field244;
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
                    if ((class9.field124[Statics.field244][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field244;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field124[Statics.field244][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field244;
                        }
                    }
                }
            }
        }
        if ((class9.field124[Statics.field244][Statics.field1033.field448 >> 7][Statics.field1033.field410 >> 7] & 0x4) != 0) {
            var0 = Statics.field244;
        }
        return var0;
    }

    @ObfuscatedName("ez.ab(I)I")
    public static final int method2789() {
        int var0 = method121(Statics.field1804, Statics.field755, Statics.field244);
        return var0 - Statics.field70 >= 800 || (class9.field124[Statics.field244][Statics.field1804 >> 7][Statics.field755 >> 7] & 0x4) == 0 ? 3 : Statics.field244;
    }

    @ObfuscatedName("v.ao(B)V")
    public static final void method41() {
        field557 = 0;
        int var0 = (Statics.field1033.field448 >> 7) + Statics.field333;
        int var1 = (Statics.field1033.field410 >> 7) + Statics.field141;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field557 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field557 = 1;
        }
        if (field557 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field557 = 0;
        }
    }

    @ObfuscatedName("s.al(Ls;IB)V")
    public static final void method250(class26 arg0, int arg1) {
        method135(arg0.field448, arg0.field410, arg1);
    }

    @ObfuscatedName("f.aq(IIIB)V")
    public static final void method135(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field579 = -1;
            field580 = -1;
            return;
        }
        int var3 = method121(arg0, arg1, Statics.field244) - arg2;
        int var4 = arg0 - Statics.field1804;
        int var5 = var3 - Statics.field70;
        int var6 = arg1 - Statics.field755;
        int var7 = class103.field1757[Statics.field2001];
        int var8 = class103.field1746[Statics.field2001];
        int var9 = class103.field1757[Statics.field171];
        int var10 = class103.field1746[Statics.field171];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field579 = (var11 << 9) / var15 + 256;
            field580 = (var14 << 9) / var15 + 167;
        } else {
            field579 = -1;
            field580 = -1;
        }
    }

    @ObfuscatedName("o.az(IIII)I")
    public static final int method121(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field124[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field121[var5][var3][var4] + class9.field121[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field121[var5][var3][var4 + 1] + class9.field121[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("m.bv(ZI)V")
    public static final void method58(boolean arg0) {
        field594 = arg0;
        if (!field594) {
            int var1 = field514.method2627();
            int var2 = (field515 - field514.field2003) / 16;
            Statics.field1229 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field1229[var3][var4] = field514.method2577();
                }
            }
            int var5 = field514.method2627();
            int var6 = field514.method2450();
            int var7 = field514.method2465();
            int var8 = field514.method2627();
            Statics.field89 = new int[var2];
            Statics.field971 = new int[var2];
            Statics.field1653 = new int[var2];
            Statics.field207 = new byte[var2][];
            Statics.field83 = new byte[var2][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field89[var10] = var13;
                        Statics.field971[var10] = Statics.field330.method2966("m" + var11 + "_" + var12);
                        Statics.field1653[var10] = Statics.field330.method2966("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method207(var7, var1, var6, var8, var5);
            return;
        }
        int var14 = field514.method2483();
        int var15 = field514.method2484();
        int var16 = field514.method2484();
        int var17 = field514.method2480();
        field514.method2310();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field514.method2312(1);
                    if (var21 == 1) {
                        field532[var18][var19][var20] = field514.method2312(26);
                    } else {
                        field532[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field514.method2311();
        int var22 = (field515 - field514.field2003) / 16;
        Statics.field1229 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field1229[var23][var24] = field514.method2467();
            }
        }
        int var25 = field514.method2484();
        Statics.field89 = new int[var22];
        Statics.field971 = new int[var22];
        Statics.field1653 = new int[var22];
        Statics.field207 = new byte[var22][];
        Statics.field83 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field532[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field89[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field89[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field971[var26] = Statics.field330.method2966("m" + var35 + "_" + var36);
                            Statics.field1653[var26] = Statics.field330.method2966("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method207(var15, var16, var17, var14, var25);
    }

    @ObfuscatedName("a.bh(IIIIII)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1091 == arg0 && Statics.field79 == arg1 && field524 == arg2 || !field475) {
            return;
        }
        Statics.field1091 = arg0;
        Statics.field79 = arg1;
        field524 = arg2;
        if (!field475) {
            field524 = 0;
        }
        method2(25);
        Statics.method208(class133.field2047, true);
        int var5 = Statics.field333;
        int var6 = Statics.field141;
        Statics.field333 = (arg0 - 6) * 8;
        Statics.field141 = (arg1 - 6) * 8;
        int var7 = Statics.field333 - var5;
        int var8 = Statics.field141 - var6;
        int var9 = Statics.field333;
        int var10 = Statics.field141;
        for (int var11 = 0; var11 < 32768; var11++) {
            class24 var12 = field509[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field444[var13] -= var7;
                    var12.field450[var13] -= var8;
                }
                var12.field448 -= var7 * 128;
                var12.field410 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field660[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field444[var16] -= var7;
                    var15.field450[var16] -= var8;
                }
                var15.field448 -= var7 * 128;
                var15.field410 -= var8 * 128;
            }
        }
        Statics.field244 = arg2;
        Statics.field1033.method236(arg3, arg4, false);
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
                        field608[var27][var23][var24] = field608[var27][var25][var26];
                    } else {
                        field608[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class21 var28 = (class21) field609.method3317(); var28 != null; var28 = (class21) field609.method3310()) {
            var28.field339 -= var7;
            var28.field350 -= var8;
            if (var28.field339 < 0 || var28.field350 < 0 || var28.field339 >= 104 || var28.field350 >= 104) {
                var28.method3346();
            }
        }
        if (field705 != 0) {
            field705 -= var7;
            field706 -= var8;
        }
        field473 = 0;
        field720 = false;
        field700 = -1;
        field611.method3302();
        field606.method3302();
    }

    @ObfuscatedName("cb.bp(ZI)V")
    public static final void method1648(boolean arg0) {
        method614();
        field518++;
        if (field518 < 50 && !arg0) {
            return;
        }
        field518 = 0;
        if (field523 || Statics.field2287 == null) {
            return;
        }
        field512.method2307(87);
        try {
            Statics.field2287.method1363(field512.field2007, 0, field512.field2003);
            field512.field2003 = 0;
        } catch (IOException var2) {
            field523 = true;
        }
    }

    @ObfuscatedName("dx.bt(I)V")
    public static final void method2192() {
        method1648(false);
        field525 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field207.length; var1++) {
            if (Statics.field971[var1] != -1 && Statics.field207[var1] == null) {
                Statics.field207[var1] = Statics.field330.method2951(Statics.field971[var1], 0);
                if (Statics.field207[var1] == null) {
                    var0 = false;
                    field525++;
                }
            }
            if (Statics.field1653[var1] != -1 && Statics.field83[var1] == null) {
                Statics.field83[var1] = Statics.field330.method2952(Statics.field1653[var1], 0, Statics.field1229[var1]);
                if (Statics.field83[var1] == null) {
                    var0 = false;
                    field525++;
                }
            }
        }
        if (!var0) {
            field529 = 1;
            return;
        }
        field527 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field207.length; var3++) {
            byte[] var4 = Statics.field83[var3];
            if (var4 != null) {
                int var5 = (Statics.field89[var3] >> 8) * 64 - Statics.field333;
                int var6 = (Statics.field89[var3] & 0xFF) * 64 - Statics.field141;
                if (field594) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class9.method216(var4, var5, var6);
            }
        }
        if (!var2) {
            field529 = 2;
            return;
        }
        if (field529 != 0) {
            Statics.method208(class133.field2047 + class2.field21 + class2.field24 + 100 + "%" + class2.field30, true);
        }
        method614();
        method124();
        method614();
        Statics.field2020.method1836();
        method614();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field629[var7].method3185();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field124[var8][var9][var10] = 0;
                }
            }
        }
        method614();
        class9.field122 = 99;
        Statics.field128 = new byte[4][104][104];
        Statics.field1802 = new byte[4][104][104];
        Statics.field130 = new byte[4][104][104];
        Statics.field1327 = new byte[4][104][104];
        Statics.field1030 = new int[4][105][105];
        Statics.field2277 = new byte[4][105][105];
        Statics.field2418 = new int[105][105];
        Statics.field951 = new int[104];
        Statics.field135 = new int[104];
        Statics.field144 = new int[104];
        Statics.field27 = new int[104];
        Statics.field127 = new int[104];
        int var11 = Statics.field207.length;
        for (class7 var12 = (class7) class7.field109.method3317(); var12 != null; var12 = (class7) class7.field109.method3310()) {
            if (var12.field98 != null) {
                Statics.field332.method1113(var12.field98);
                var12.field98 = null;
            }
            if (var12.field103 != null) {
                Statics.field332.method1113(var12.field103);
                var12.field103 = null;
            }
        }
        class7.field109.method3302();
        method1648(true);
        if (!field594) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field89[var13] >> 8) * 64 - Statics.field333;
                int var15 = (Statics.field89[var13] & 0xFF) * 64 - Statics.field141;
                byte[] var16 = Statics.field207[var13];
                if (var16 != null) {
                    method614();
                    class9.method2210(var16, var14, var15, Statics.field1091 * 8 - 48, Statics.field79 * 8 - 48, field629);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field89[var17] >> 8) * 64 - Statics.field333;
                int var19 = (Statics.field89[var17] & 0xFF) * 64 - Statics.field141;
                byte[] var20 = Statics.field207[var17];
                if (var20 == null && Statics.field79 < 800) {
                    method614();
                    class9.method2668(var18, var19, 64, 64);
                }
            }
            method1648(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field83[var21];
                if (var22 != null) {
                    int var23 = (Statics.field89[var21] >> 8) * 64 - Statics.field333;
                    int var24 = (Statics.field89[var21] & 0xFF) * 64 - Statics.field141;
                    method614();
                    class94 var25 = Statics.field2020;
                    class162[] var26 = field629;
                    class126 var27 = new class126(var22);
                    int var28 = -1;
                    while (true) {
                        int var29 = var27.method2463();
                        if (var29 == 0) {
                            break;
                        }
                        var28 += var29;
                        int var30 = 0;
                        while (true) {
                            int var31 = var27.method2463();
                            if (var31 == 0) {
                                break;
                            }
                            var30 += var31 - 1;
                            int var32 = var30 & 0x3F;
                            int var33 = var30 >> 6 & 0x3F;
                            int var34 = var30 >> 12;
                            int var35 = var27.method2450();
                            int var36 = var35 >> 2;
                            int var37 = var35 & 0x3;
                            int var38 = var23 + var33;
                            int var39 = var24 + var32;
                            if (var38 > 0 && var39 > 0 && var38 < 103 && var39 < 103) {
                                int var40 = var34;
                                if ((class9.field124[1][var38][var39] & 0x2) == 2) {
                                    var40 = var34 - 1;
                                }
                                class162 var41 = null;
                                if (var40 >= 0) {
                                    var41 = var26[var40];
                                }
                                class9.method219(var34, var38, var39, var28, var37, var36, var25, var41);
                            }
                        }
                    }
                }
            }
        }
        if (field594) {
            for (int var42 = 0; var42 < 4; var42++) {
                method614();
                for (int var43 = 0; var43 < 13; var43++) {
                    for (int var44 = 0; var44 < 13; var44++) {
                        boolean var45 = false;
                        int var46 = field532[var42][var43][var44];
                        if (var46 != -1) {
                            int var47 = var46 >> 24 & 0x3;
                            int var48 = var46 >> 1 & 0x3;
                            int var49 = var46 >> 14 & 0x3FF;
                            int var50 = var46 >> 3 & 0x7FF;
                            int var51 = (var49 / 8 << 8) + var50 / 8;
                            for (int var52 = 0; var52 < Statics.field89.length; var52++) {
                                if (Statics.field89[var52] == var51 && Statics.field207[var52] != null) {
                                    byte[] var53 = Statics.field207[var52];
                                    int var54 = var43 * 8;
                                    int var55 = var44 * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    int var57 = (var50 & 0x7) * 8;
                                    class162[] var58 = field629;
                                    for (int var59 = 0; var59 < 8; var59++) {
                                        for (int var60 = 0; var60 < 8; var60++) {
                                            if (var54 + var59 > 0 && var54 + var59 < 103 && var55 + var60 > 0 && var55 + var60 < 103) {
                                                var58[var42].field2672[var54 + var59][var55 + var60] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class126 var61 = new class126(var53);
                                    for (int var62 = 0; var62 < 4; var62++) {
                                        for (int var63 = 0; var63 < 64; var63++) {
                                            for (int var64 = 0; var64 < 64; var64++) {
                                                if (var47 == var62 && var63 >= var56 && var63 < var56 + 8 && var64 >= var57 && var64 < var57 + 8) {
                                                    int var67 = var54 + class158.method713(var63 & 0x7, var64 & 0x7, var48);
                                                    int var69 = var63 & 0x7;
                                                    int var70 = var64 & 0x7;
                                                    int var72 = var48 & 0x3;
                                                    int var73;
                                                    if (var72 == 0) {
                                                        var73 = var70;
                                                    } else if (var72 == 1) {
                                                        var73 = 7 - var69;
                                                    } else if (var72 == 2) {
                                                        var73 = 7 - var70;
                                                    } else {
                                                        var73 = var69;
                                                    }
                                                    class9.method1587(var61, var42, var67, var55 + var73, 0, 0, var48);
                                                } else {
                                                    class9.method1587(var61, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var45 = true;
                                    break;
                                }
                            }
                        }
                        if (!var45) {
                            int var74 = var42;
                            int var75 = var43 * 8;
                            int var76 = var44 * 8;
                            for (int var77 = 0; var77 < 8; var77++) {
                                for (int var78 = 0; var78 < 8; var78++) {
                                    class9.field121[var74][var75 + var77][var76 + var78] = 0;
                                }
                            }
                            if (var75 > 0) {
                                for (int var79 = 1; var79 < 8; var79++) {
                                    class9.field121[var74][var75][var76 + var79] = class9.field121[var74][var75 - 1][var76 + var79];
                                }
                            }
                            if (var76 > 0) {
                                for (int var80 = 1; var80 < 8; var80++) {
                                    class9.field121[var74][var75 + var80][var76] = class9.field121[var74][var75 + var80][var76 - 1];
                                }
                            }
                            if (var75 > 0 && class9.field121[var74][var75 - 1][var76] != 0) {
                                class9.field121[var74][var75][var76] = class9.field121[var74][var75 - 1][var76];
                            } else if (var76 > 0 && class9.field121[var74][var75][var76 - 1] != 0) {
                                class9.field121[var74][var75][var76] = class9.field121[var74][var75][var76 - 1];
                            } else if (var75 > 0 && var76 > 0 && class9.field121[var74][var75 - 1][var76 - 1] != 0) {
                                class9.field121[var74][var75][var76] = class9.field121[var74][var75 - 1][var76 - 1];
                            }
                        }
                    }
                }
            }
            for (int var81 = 0; var81 < 13; var81++) {
                for (int var82 = 0; var82 < 13; var82++) {
                    int var83 = field532[0][var81][var82];
                    if (var83 == -1) {
                        class9.method2668(var81 * 8, var82 * 8, 8, 8);
                    }
                }
            }
            method1648(true);
            for (int var84 = 0; var84 < 4; var84++) {
                method614();
                for (int var85 = 0; var85 < 13; var85++) {
                    label965: for (int var86 = 0; var86 < 13; var86++) {
                        int var87 = field532[var84][var85][var86];
                        if (var87 != -1) {
                            int var88 = var87 >> 24 & 0x3;
                            int var89 = var87 >> 1 & 0x3;
                            int var90 = var87 >> 14 & 0x3FF;
                            int var91 = var87 >> 3 & 0x7FF;
                            int var92 = (var90 / 8 << 8) + var91 / 8;
                            for (int var93 = 0; var93 < Statics.field89.length; var93++) {
                                if (Statics.field89[var93] == var92 && Statics.field83[var93] != null) {
                                    byte[] var94 = Statics.field83[var93];
                                    int var95 = var85 * 8;
                                    int var96 = var86 * 8;
                                    int var97 = (var90 & 0x7) * 8;
                                    int var98 = (var91 & 0x7) * 8;
                                    class94 var99 = Statics.field2020;
                                    class162[] var100 = field629;
                                    class126 var101 = new class126(var94);
                                    int var102 = -1;
                                    while (true) {
                                        int var103 = var101.method2463();
                                        if (var103 == 0) {
                                            continue label965;
                                        }
                                        var102 += var103;
                                        int var104 = 0;
                                        while (true) {
                                            int var105 = var101.method2463();
                                            if (var105 == 0) {
                                                break;
                                            }
                                            var104 += var105 - 1;
                                            int var106 = var104 & 0x3F;
                                            int var107 = var104 >> 6 & 0x3F;
                                            int var108 = var104 >> 12;
                                            int var109 = var101.method2450();
                                            int var110 = var109 >> 2;
                                            int var111 = var109 & 0x3;
                                            if (var88 == var108 && var107 >= var97 && var107 < var97 + 8 && var106 >= var98 && var106 < var98 + 8) {
                                                class31 var112 = class31.method2662(var102);
                                                int var113 = var95 + class158.method2923(var107 & 0x7, var106 & 0x7, var89, var112.field832, var112.field829, var111);
                                                int var114 = var96 + class158.method3108(var107 & 0x7, var106 & 0x7, var89, var112.field832, var112.field829, var111);
                                                if (var113 > 0 && var114 > 0 && var113 < 103 && var114 < 103) {
                                                    int var115 = var84;
                                                    if ((class9.field124[1][var113][var114] & 0x2) == 2) {
                                                        var115 = var84 - 1;
                                                    }
                                                    class162 var116 = null;
                                                    if (var115 >= 0) {
                                                        var116 = var100[var115];
                                                    }
                                                    class9.method219(var84, var113, var114, var102, var89 + var111 & 0x3, var110, var99, var116);
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
        method1648(true);
        method124();
        method614();
        class94 var117 = Statics.field2020;
        class162[] var118 = field629;
        for (int var119 = 0; var119 < 4; var119++) {
            for (int var120 = 0; var120 < 104; var120++) {
                for (int var121 = 0; var121 < 104; var121++) {
                    if ((class9.field124[var119][var120][var121] & 0x1) == 1) {
                        int var122 = var119;
                        if ((class9.field124[1][var120][var121] & 0x2) == 2) {
                            var122 = var119 - 1;
                        }
                        if (var122 >= 0) {
                            var118[var122].method3192(var120, var121);
                        }
                    }
                }
            }
        }
        class9.field137 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field137 < -8) {
            class9.field137 = -8;
        }
        if (class9.field137 > 8) {
            class9.field137 = 8;
        }
        class9.field134 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field134 < -16) {
            class9.field134 = -16;
        }
        if (class9.field134 > 16) {
            class9.field134 = 16;
        }
        for (int var123 = 0; var123 < 4; var123++) {
            byte[][] var124 = Statics.field2277[var123];
            int var125 = (int) Math.sqrt(5100.0D);
            int var126 = var125 * 768 >> 8;
            for (int var127 = 1; var127 < 103; var127++) {
                for (int var128 = 1; var128 < 103; var128++) {
                    int var129 = class9.field121[var123][var128 + 1][var127] - class9.field121[var123][var128 - 1][var127];
                    int var130 = class9.field121[var123][var128][var127 + 1] - class9.field121[var123][var128][var127 - 1];
                    int var131 = (int) Math.sqrt((double) (var130 * var130 + var129 * var129 + 65536));
                    int var132 = (var129 << 8) / var131;
                    int var133 = 65536 / var131;
                    int var134 = (var130 << 8) / var131;
                    int var135 = (var134 * -50 + var132 * -50 + var133 * -10) / var126 + 96;
                    int var136 = (var124[var128][var127] >> 1) + (var124[var128][var127 + 1] >> 3) + (var124[var128][var127 - 1] >> 2) + (var124[var128 - 1][var127] >> 2) + (var124[var128 + 1][var127] >> 3);
                    Statics.field2418[var128][var127] = var135 - var136;
                }
            }
            for (int var137 = 0; var137 < 104; var137++) {
                Statics.field951[var137] = 0;
                Statics.field135[var137] = 0;
                Statics.field144[var137] = 0;
                Statics.field27[var137] = 0;
                Statics.field127[var137] = 0;
            }
            for (int var138 = -5; var138 < 109; var138++) {
                for (int var139 = 0; var139 < 104; var139++) {
                    int var140 = var138 + 5;
                    int var10002;
                    if (var140 >= 0 && var140 < 104) {
                        int var141 = Statics.field128[var123][var140][var139] & 0xFF;
                        if (var141 > 0) {
                            int var142 = var141 - 1;
                            class32 var143 = (class32) class32.field871.method3240((long) var142);
                            class32 var144;
                            if (var143 == null) {
                                byte[] var145 = Statics.field872.method2951(1, var142);
                                class32 var146 = new class32();
                                if (var145 != null) {
                                    var146.method684(new class126(var145), var142);
                                }
                                var146.method685();
                                class32.field871.method3237(var146, (long) var142);
                                var144 = var146;
                            } else {
                                var144 = var143;
                            }
                            Statics.field951[var139] += var144.field873;
                            Statics.field135[var139] += var144.field874;
                            Statics.field144[var139] += var144.field875;
                            Statics.field27[var139] += var144.field876;
                            var10002 = Statics.field127[var139]++;
                        }
                    }
                    int var148 = var138 - 5;
                    if (var148 >= 0 && var148 < 104) {
                        int var149 = Statics.field128[var123][var148][var139] & 0xFF;
                        if (var149 > 0) {
                            int var150 = var149 - 1;
                            class32 var151 = (class32) class32.field871.method3240((long) var150);
                            class32 var152;
                            if (var151 == null) {
                                byte[] var153 = Statics.field872.method2951(1, var150);
                                class32 var154 = new class32();
                                if (var153 != null) {
                                    var154.method684(new class126(var153), var150);
                                }
                                var154.method685();
                                class32.field871.method3237(var154, (long) var150);
                                var152 = var154;
                            } else {
                                var152 = var151;
                            }
                            Statics.field951[var139] -= var152.field873;
                            Statics.field135[var139] -= var152.field874;
                            Statics.field144[var139] -= var152.field875;
                            Statics.field27[var139] -= var152.field876;
                            var10002 = Statics.field127[var139]--;
                        }
                    }
                }
                if (var138 >= 1 && var138 < 103) {
                    int var156 = 0;
                    int var157 = 0;
                    int var158 = 0;
                    int var159 = 0;
                    int var160 = 0;
                    for (int var161 = -5; var161 < 109; var161++) {
                        int var162 = var161 + 5;
                        if (var162 >= 0 && var162 < 104) {
                            var156 += Statics.field951[var162];
                            var157 += Statics.field135[var162];
                            var158 += Statics.field144[var162];
                            var159 += Statics.field27[var162];
                            var160 += Statics.field127[var162];
                        }
                        int var163 = var161 - 5;
                        if (var163 >= 0 && var163 < 104) {
                            var156 -= Statics.field951[var163];
                            var157 -= Statics.field135[var163];
                            var158 -= Statics.field144[var163];
                            var159 -= Statics.field27[var163];
                            var160 -= Statics.field127[var163];
                        }
                        if (var161 >= 1 && var161 < 103 && (!field475 || (class9.field124[0][var138][var161] & 0x2) != 0 || (class9.field124[var123][var138][var161] & 0x10) == 0 && class9.method1539(var123, var138, var161) == field524)) {
                            if (var123 < class9.field122) {
                                class9.field122 = var123;
                            }
                            int var164 = Statics.field128[var123][var138][var161] & 0xFF;
                            int var165 = Statics.field1802[var123][var138][var161] & 0xFF;
                            if (var164 > 0 || var165 > 0) {
                                int var166 = class9.field121[var123][var138][var161];
                                int var167 = class9.field121[var123][var138 + 1][var161];
                                int var168 = class9.field121[var123][var138 + 1][var161 + 1];
                                int var169 = class9.field121[var123][var138][var161 + 1];
                                int var170 = Statics.field2418[var138][var161];
                                int var171 = Statics.field2418[var138 + 1][var161];
                                int var172 = Statics.field2418[var138 + 1][var161 + 1];
                                int var173 = Statics.field2418[var138][var161 + 1];
                                int var174 = -1;
                                int var175 = -1;
                                if (var164 > 0) {
                                    int var176 = var156 * 256 / var159;
                                    int var177 = var157 / var160;
                                    int var178 = var158 / var160;
                                    var174 = class9.method146(var176, var177, var178);
                                    int var179 = class9.field137 + var176 & 0xFF;
                                    int var180 = class9.field134 + var178;
                                    if (var180 < 0) {
                                        var180 = 0;
                                    } else if (var180 > 255) {
                                        var180 = 255;
                                    }
                                    var175 = class9.method146(var179, var177, var180);
                                }
                                if (var123 > 0) {
                                    boolean var181 = true;
                                    if (var164 == 0 && Statics.field130[var123][var138][var161] != 0) {
                                        var181 = false;
                                    }
                                    if (var165 > 0 && !class36.method1561(var165 - 1).field939) {
                                        var181 = false;
                                    }
                                    if (var181 && var166 == var167 && var166 == var168 && var166 == var169) {
                                        Statics.field1030[var123][var138][var161] |= 0x924;
                                    }
                                }
                                int var182 = 0;
                                if (var175 != -1) {
                                    var182 = class103.field1758[class9.method2172(var175, 96)];
                                }
                                if (var165 == 0) {
                                    var117.method1841(var123, var138, var161, 0, 0, -1, var166, var167, var168, var169, class9.method2172(var174, var170), class9.method2172(var174, var171), class9.method2172(var174, var172), class9.method2172(var174, var173), 0, 0, 0, 0, var182, 0);
                                } else {
                                    int var183 = Statics.field130[var123][var138][var161] + 1;
                                    byte var184 = Statics.field1327[var123][var138][var161];
                                    class36 var185 = class36.method1561(var165 - 1);
                                    int var186 = var185.field934;
                                    int var187;
                                    int var188;
                                    if (var186 >= 0) {
                                        var187 = Statics.field1759.method2175(var186);
                                        var188 = -1;
                                    } else if (var185.field937 == 16711935) {
                                        var188 = -2;
                                        var186 = -1;
                                        var187 = -2;
                                    } else {
                                        var188 = class9.method146(var185.field940, var185.field941, var185.field942);
                                        int var189 = class9.field137 + var185.field940 & 0xFF;
                                        int var190 = class9.field134 + var185.field942;
                                        if (var190 < 0) {
                                            var190 = 0;
                                        } else if (var190 > 255) {
                                            var190 = 255;
                                        }
                                        var187 = class9.method146(var189, var185.field941, var190);
                                    }
                                    int var191 = 0;
                                    if (var187 != -2) {
                                        var191 = class103.field1758[class9.method128(var187, 96)];
                                    }
                                    if (var185.field948 != -1) {
                                        int var192 = class9.field137 + var185.field943 & 0xFF;
                                        int var193 = class9.field134 + var185.field945;
                                        if (var193 < 0) {
                                            var193 = 0;
                                        } else if (var193 > 255) {
                                            var193 = 255;
                                        }
                                        int var194 = class9.method146(var192, var185.field944, var193);
                                        var191 = class103.field1758[class9.method128(var194, 96)];
                                    }
                                    var117.method1841(var123, var138, var161, var183, var184, var186, var166, var167, var168, var169, class9.method2172(var174, var170), class9.method2172(var174, var171), class9.method2172(var174, var172), class9.method2172(var174, var173), class9.method128(var188, var170), class9.method128(var188, var171), class9.method128(var188, var172), class9.method128(var188, var173), var182, var191);
                                }
                            }
                        }
                    }
                }
            }
            for (int var195 = 1; var195 < 103; var195++) {
                for (int var196 = 1; var196 < 103; var196++) {
                    var117.method1840(var123, var196, var195, class9.method1539(var123, var196, var195));
                }
            }
            Statics.field128[var123] = (byte[][]) null;
            Statics.field1802[var123] = (byte[][]) null;
            Statics.field130[var123] = (byte[][]) null;
            Statics.field1327[var123] = (byte[][]) null;
            Statics.field2277[var123] = (byte[][]) null;
        }
        var117.method1932(-50, -10, -50);
        for (int var197 = 0; var197 < 104; var197++) {
            for (int var198 = 0; var198 < 104; var198++) {
                if ((class9.field124[1][var197][var198] & 0x2) == 2) {
                    var117.method1913(var197, var198);
                }
            }
        }
        int var199 = 1;
        int var200 = 2;
        int var201 = 4;
        for (int var202 = 0; var202 < 4; var202++) {
            if (var202 > 0) {
                var199 <<= 0x3;
                var200 <<= 0x3;
                var201 <<= 0x3;
            }
            for (int var203 = 0; var203 <= var202; var203++) {
                for (int var204 = 0; var204 <= 104; var204++) {
                    for (int var205 = 0; var205 <= 104; var205++) {
                        if ((Statics.field1030[var203][var205][var204] & var199) != 0) {
                            int var206 = var204;
                            int var207 = var204;
                            int var208 = var203;
                            int var209 = var203;
                            while (var206 > 0 && (Statics.field1030[var203][var205][var206 - 1] & var199) != 0) {
                                var206--;
                            }
                            while (var207 < 104 && (Statics.field1030[var203][var205][var207 + 1] & var199) != 0) {
                                var207++;
                            }
                            label698: while (var208 > 0) {
                                for (int var210 = var206; var210 <= var207; var210++) {
                                    if ((Statics.field1030[var208 - 1][var205][var210] & var199) == 0) {
                                        break label698;
                                    }
                                }
                                var208--;
                            }
                            label687: while (var209 < var202) {
                                for (int var211 = var206; var211 <= var207; var211++) {
                                    if ((Statics.field1030[var209 + 1][var205][var211] & var199) == 0) {
                                        break label687;
                                    }
                                }
                                var209++;
                            }
                            int var212 = (var209 + 1 - var208) * (var207 - var206 + 1);
                            if (var212 >= 8) {
                                short var213 = 240;
                                int var214 = class9.field121[var209][var205][var206] - var213;
                                int var215 = class9.field121[var208][var205][var206];
                                class94.method1839(var202, 1, var205 * 128, var205 * 128, var206 * 128, var207 * 128 + 128, var214, var215);
                                for (int var216 = var208; var216 <= var209; var216++) {
                                    for (int var217 = var206; var217 <= var207; var217++) {
                                        Statics.field1030[var216][var205][var217] &= ~var199;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1030[var203][var205][var204] & var200) != 0) {
                            int var218 = var205;
                            int var219 = var205;
                            int var220 = var203;
                            int var221 = var203;
                            while (var218 > 0 && (Statics.field1030[var203][var218 - 1][var204] & var200) != 0) {
                                var218--;
                            }
                            while (var219 < 104 && (Statics.field1030[var203][var219 + 1][var204] & var200) != 0) {
                                var219++;
                            }
                            label751: while (var220 > 0) {
                                for (int var222 = var218; var222 <= var219; var222++) {
                                    if ((Statics.field1030[var220 - 1][var222][var204] & var200) == 0) {
                                        break label751;
                                    }
                                }
                                var220--;
                            }
                            label740: while (var221 < var202) {
                                for (int var223 = var218; var223 <= var219; var223++) {
                                    if ((Statics.field1030[var221 + 1][var223][var204] & var200) == 0) {
                                        break label740;
                                    }
                                }
                                var221++;
                            }
                            int var224 = (var221 + 1 - var220) * (var219 - var218 + 1);
                            if (var224 >= 8) {
                                short var225 = 240;
                                int var226 = class9.field121[var221][var218][var204] - var225;
                                int var227 = class9.field121[var220][var218][var204];
                                class94.method1839(var202, 2, var218 * 128, var219 * 128 + 128, var204 * 128, var204 * 128, var226, var227);
                                for (int var228 = var220; var228 <= var221; var228++) {
                                    for (int var229 = var218; var229 <= var219; var229++) {
                                        Statics.field1030[var228][var229][var204] &= ~var200;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1030[var203][var205][var204] & var201) != 0) {
                            int var230 = var205;
                            int var231 = var205;
                            int var232 = var204;
                            int var233 = var204;
                            while (var232 > 0 && (Statics.field1030[var203][var205][var232 - 1] & var201) != 0) {
                                var232--;
                            }
                            while (var233 < 104 && (Statics.field1030[var203][var205][var233 + 1] & var201) != 0) {
                                var233++;
                            }
                            label804: while (var230 > 0) {
                                for (int var234 = var232; var234 <= var233; var234++) {
                                    if ((Statics.field1030[var203][var230 - 1][var234] & var201) == 0) {
                                        break label804;
                                    }
                                }
                                var230--;
                            }
                            label793: while (var231 < 104) {
                                for (int var235 = var232; var235 <= var233; var235++) {
                                    if ((Statics.field1030[var203][var231 + 1][var235] & var201) == 0) {
                                        break label793;
                                    }
                                }
                                var231++;
                            }
                            if ((var231 - var230 + 1) * (var233 - var232 + 1) >= 4) {
                                int var236 = class9.field121[var203][var230][var232];
                                class94.method1839(var202, 4, var230 * 128, var231 * 128 + 128, var232 * 128, var233 * 128 + 128, var236, var236);
                                for (int var237 = var230; var237 <= var231; var237++) {
                                    for (int var238 = var232; var238 <= var233; var238++) {
                                        Statics.field1030[var203][var237][var238] &= ~var201;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method1648(true);
        int var239 = class9.field122;
        if (var239 > Statics.field244) {
            var239 = Statics.field244;
        }
        if (var239 < Statics.field244 - 1) {
            int var240 = Statics.field244 - 1;
        }
        if (field475) {
            Statics.field2020.method1957(class9.field122);
        } else {
            Statics.field2020.method1957(0);
        }
        for (int var241 = 0; var241 < 104; var241++) {
            for (int var242 = 0; var242 < 104; var242++) {
                method142(var241, var242);
            }
        }
        method614();
        method115();
        class31.field820.method3241();
        if (Statics.field1382 != null) {
            field512.method2307(126);
            field512.method2456(1057001181);
        }
        if (!field594) {
            int var243 = (Statics.field1091 - 6) / 8;
            int var244 = (Statics.field1091 + 6) / 8;
            int var245 = (Statics.field79 - 6) / 8;
            int var246 = (Statics.field79 + 6) / 8;
            for (int var247 = var243 - 1; var247 <= var244 + 1; var247++) {
                for (int var248 = var245 - 1; var248 <= var246 + 1; var248++) {
                    if (var247 < var243 || var247 > var244 || var248 < var245 || var248 > var246) {
                        Statics.field330.method2970("m" + var247 + "_" + var248);
                        Statics.field330.method2970("l" + var247 + "_" + var248);
                    }
                }
            }
        }
        method2(30);
        method614();
        class9.method1503();
        field512.method2307(241);
        Statics.field245.method1327();
        for (int var249 = 0; var249 < 32; var249++) {
            field1320[var249] = 0L;
        }
        for (int var250 = 0; var250 < 32; var250++) {
            field1321[var250] = 0L;
        }
        Statics.field1506 = 0;
    }

    @ObfuscatedName("w.bu(II)V")
    public static final void method225(int arg0) {
        int[] var1 = Statics.field1453.field1461;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field124[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2020.method1870(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field124[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2020.method1870(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1453.method1657();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field124[arg0][var10][var9] & 0x18) == 0) {
                    method873(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field124[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method873(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field701 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2020.method1947(Statics.field244, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class31.method2662(var14).field867;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field629[Statics.field244].field2672;
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
                        field704[field701] = Statics.field2278[var15];
                        field702[field701] = var16;
                        field703[field701] = var17;
                        field701++;
                    }
                }
            }
        }
        Statics.field87.method1650();
    }

    @ObfuscatedName("av.bc(IIIIIB)V")
    public static final void method873(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2020.method1862(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2020.method1866(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1453.field1461;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class31 var13 = class31.method2662(var12);
            if (var13.field847 == -1) {
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
                class86 var14 = Statics.field212[var13.field847];
                if (var14 != null) {
                    int var15 = (var13.field832 * 4 - var14.field1468) / 2;
                    int var16 = (var13.field829 * 4 - var14.field1473) / 2;
                    var14.method1742(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field829) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2020.method1972(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2020.method1866(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class31 var22 = class31.method2662(var21);
            if (var22.field847 != -1) {
                class86 var23 = Statics.field212[var22.field847];
                if (var23 != null) {
                    int var24 = (var22.field832 * 4 - var23.field1468) / 2;
                    int var25 = (var22.field829 * 4 - var23.field1473) / 2;
                    var23.method1742(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field829) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1453.field1461;
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
        int var29 = Statics.field2020.method1947(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class31 var31 = class31.method2662(var30);
        if (var31.field847 == -1) {
            return;
        }
        class86 var32 = Statics.field212[var31.field847];
        if (var32 != null) {
            int var33 = (var31.field832 * 4 - var32.field1468) / 2;
            int var34 = (var31.field829 * 4 - var32.field1473) / 2;
            var32.method1742(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field829) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("f.bw(IIII)Z")
    public static final boolean method136(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field2020.method1866(Statics.field244, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class31 var7 = class31.method2662(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field832;
                var9 = var7.field829;
            } else {
                var8 = var7.field829;
                var9 = var7.field832;
            }
            int var10 = var7.field862;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method233(Statics.field1033.field444[0], Statics.field1033.field450[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method233(Statics.field1033.field444[0], Statics.field1033.field450[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field548 = class76.field1393;
        field678 = class76.field1397;
        field584 = 2;
        field648 = 0;
        return true;
    }

    @ObfuscatedName("j.bj(IIIIZIIIIIIS)Z")
    public static final boolean method233(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field535[var11][var12] = 0;
                field519[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field535[arg0][arg1] = 99;
        field519[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field537[var15] = arg0;
        int var36 = var15 + 1;
        field538[var15] = arg1;
        boolean var17 = false;
        int var18 = field537.length;
        int[][] var19 = field629[Statics.field244].field2672;
        while (var36 != var16) {
            var13 = field537[var16];
            var14 = field538[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field629[Statics.field244].method3194(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field629[Statics.field244].method3184(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field629[Statics.field244].method3190(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field519[var13][var14] + 1;
            if (var13 > 0 && field535[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field537[var36] = var13 - 1;
                field538[var36] = var14;
                var36 = (var36 + 1) % var18;
                field535[var13 - 1][var14] = 2;
                field519[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field535[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field537[var36] = var13 + 1;
                field538[var36] = var14;
                var36 = (var36 + 1) % var18;
                field535[var13 + 1][var14] = 8;
                field519[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field535[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field537[var36] = var13;
                field538[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field535[var13][var14 - 1] = 1;
                field519[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field535[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field537[var36] = var13;
                field538[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field535[var13][var14 + 1] = 4;
                field519[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field535[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field537[var36] = var13 - 1;
                field538[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field535[var13 - 1][var14 - 1] = 3;
                field519[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field535[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field537[var36] = var13 + 1;
                field538[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field535[var13 + 1][var14 - 1] = 9;
                field519[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field535[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field537[var36] = var13 - 1;
                field538[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field535[var13 - 1][var14 + 1] = 6;
                field519[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field535[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field537[var36] = var13 + 1;
                field538[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field535[var13 + 1][var14 + 1] = 12;
                field519[var13 + 1][var14 + 1] = var20;
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
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field519[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field519[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field519[var24][var25];
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
        field538[var29] = var14;
        int var30;
        int var31 = var30 = field535[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field537[var37] = var13;
                field538[var37++] = var14;
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
            var31 = field535[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field537[var37];
            int var34 = field538[var37];
            if (arg10 == 0) {
                field512.method2307(86);
                field512.method2462(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field512.method2307(25);
                field512.method2462(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field512.method2307(27);
                field512.method2462(var32 + var32 + 3);
            }
            field512.method2438(Statics.field141 + var34);
            field705 = field537[0];
            field706 = field538[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field512.method2472(field537[var37] - var33);
                field512.method2471(field538[var37] - var34);
            }
            field512.method2479(Statics.field333 + var33);
            field512.method2471(class74.field1361[82] ? 1 : 0);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("z.bl(B)V")
    public static final void method3() {
        if (field516 == 137) {
            int var0 = field514.method2450();
            int var1 = (var0 >> 4 & 0x7) + Statics.field380;
            int var2 = (var0 & 0x7) + Statics.field792;
            int var3 = field514.method2627();
            int var4 = field514.method2450();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field514.method2450();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field1033.field444[0] >= var1 - var8 && Statics.field1033.field444[0] <= var1 + var8 && Statics.field1033.field450[0] >= var2 - var8 && Statics.field1033.field450[0] <= var2 + var8 && field713 != 0 && var6 > 0 && field473 < 50) {
                    field670[field473] = var3;
                    field673[field473] = var6;
                    field717[field473] = var7;
                    field719[field473] = null;
                    field718[field473] = (var1 << 16) + (var2 << 8) + var5;
                    field473++;
                }
            }
        }
        if (field516 == 127) {
            int var9 = field514.method2450();
            int var10 = (var9 >> 4 & 0x7) + Statics.field380;
            int var11 = (var9 & 0x7) + Statics.field792;
            int var12 = var10 + field514.method2451();
            int var13 = var11 + field514.method2451();
            int var14 = field514.method2513();
            int var15 = field514.method2627();
            int var16 = field514.method2450() * 4;
            int var17 = field514.method2450() * 4;
            int var18 = field514.method2627();
            int var19 = field514.method2627();
            int var20 = field514.method2450();
            int var21 = field514.method2450();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && var15 != 65535) {
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                int var24 = var12 * 128 + 64;
                int var25 = var13 * 128 + 64;
                class10 var26 = new class10(var15, Statics.field244, var22, var23, method121(var22, var23, Statics.field244) - var16, field481 + var18, field481 + var19, var20, var21, var14, var17);
                var26.method108(var24, var25, method121(var24, var25, Statics.field244) - var17, field481 + var18);
                field606.method3303(var26);
            }
        } else if (field516 == 180) {
            int var27 = field514.method2450();
            int var28 = (var27 >> 4 & 0x7) + Statics.field380;
            int var29 = (var27 & 0x7) + Statics.field792;
            int var30 = field514.method2627();
            int var31 = field514.method2450();
            int var32 = field514.method2627();
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                int var33 = var28 * 128 + 64;
                int var34 = var29 * 128 + 64;
                class19 var35 = new class19(var30, Statics.field244, var33, var34, method121(var33, var34, Statics.field244) - var31, var32, field481);
                field611.method3303(var35);
            }
        } else if (field516 == 131) {
            int var36 = field514.method2624();
            int var37 = (var36 >> 4 & 0x7) + Statics.field380;
            int var38 = (var36 & 0x7) + Statics.field792;
            int var39 = field514.method2483();
            int var40 = field514.method2465();
            int var41 = field514.method2484();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && field600 != var41) {
                class16 var42 = new class16();
                var42.field254 = var40;
                var42.field251 = var39;
                if (field608[Statics.field244][var37][var38] == null) {
                    field608[Statics.field244][var37][var38] = new class175();
                }
                field608[Statics.field244][var37][var38].method3303(var42);
                method142(var37, var38);
            }
        } else {
            if (field516 == 24) {
                int var43 = field514.method2480();
                int var44 = var43 >> 2;
                int var45 = var43 & 0x3;
                int var46 = field597[var44];
                int var47 = field514.method2483();
                int var48 = field514.method2480();
                int var49 = (var48 >> 4 & 0x7) + Statics.field380;
                int var50 = (var48 & 0x7) + Statics.field792;
                int var51 = field514.method2483();
                int var52 = field514.method2627();
                byte var53 = field514.method2477();
                byte var54 = field514.method2477();
                byte var55 = field514.method2451();
                int var56 = field514.method2465();
                byte var57 = field514.method2478();
                class3 var58;
                if (field600 == var47) {
                    var58 = Statics.field1033;
                } else {
                    var58 = field660[var47];
                }
                if (var58 != null) {
                    class31 var59 = class31.method2662(var56);
                    int var60;
                    int var61;
                    if (var45 == 1 || var45 == 3) {
                        var60 = var59.field829;
                        var61 = var59.field832;
                    } else {
                        var60 = var59.field832;
                        var61 = var59.field829;
                    }
                    int var62 = (var60 >> 1) + var49;
                    int var63 = (var60 + 1 >> 1) + var49;
                    int var64 = (var61 >> 1) + var50;
                    int var65 = (var61 + 1 >> 1) + var50;
                    int[][] var66 = class9.field121[Statics.field244];
                    int var67 = var66[var62][var64] + var66[var63][var64] + var66[var62][var65] + var66[var63][var65] >> 2;
                    int var68 = (var49 << 7) + (var60 << 6);
                    int var69 = (var50 << 7) + (var61 << 6);
                    class111 var70 = var59.method674(var44, var45, var66, var68, var67, var69);
                    if (var70 != null) {
                        method1354(Statics.field244, var49, var50, var46, -1, 0, 0, var51 + 1, var52 + 1);
                        var58.field57 = field481 + var51;
                        var58.field43 = field481 + var52;
                        var58.field47 = var70;
                        var58.field35 = var49 * 128 + var60 * 64;
                        var58.field46 = var50 * 128 + var61 * 64;
                        var58.field45 = var67;
                        if (var53 > var55) {
                            byte var71 = var53;
                            var53 = var55;
                            var55 = var71;
                        }
                        if (var54 > var57) {
                            byte var72 = var54;
                            var54 = var57;
                            var57 = var72;
                        }
                        var58.field48 = var49 + var53;
                        var58.field50 = var49 + var55;
                        var58.field49 = var50 + var54;
                        var58.field53 = var50 + var57;
                    }
                }
            }
            if (field516 == 218) {
                int var73 = field514.method2480();
                int var74 = (var73 >> 4 & 0x7) + Statics.field380;
                int var75 = (var73 & 0x7) + Statics.field792;
                int var76 = field514.method2465();
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    class175 var77 = field608[Statics.field244][var74][var75];
                    if (var77 != null) {
                        for (class16 var78 = (class16) var77.method3317(); var78 != null; var78 = (class16) var77.method3310()) {
                            if ((var76 & 0x7FFF) == var78.field254) {
                                var78.method3346();
                                break;
                            }
                        }
                        if (var77.method3317() == null) {
                            field608[Statics.field244][var74][var75] = null;
                        }
                        method142(var74, var75);
                    }
                }
            } else if (field516 == 113) {
                int var79 = field514.method2465();
                int var80 = field514.method2475();
                int var81 = (var80 >> 4 & 0x7) + Statics.field380;
                int var82 = (var80 & 0x7) + Statics.field792;
                int var83 = field514.method2627();
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    class16 var84 = new class16();
                    var84.field254 = var83;
                    var84.field251 = var79;
                    if (field608[Statics.field244][var81][var82] == null) {
                        field608[Statics.field244][var81][var82] = new class175();
                    }
                    field608[Statics.field244][var81][var82].method3303(var84);
                    method142(var81, var82);
                }
            } else if (field516 == 6) {
                int var85 = field514.method2475();
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                int var88 = field597[var86];
                int var89 = field514.method2480();
                int var90 = (var89 >> 4 & 0x7) + Statics.field380;
                int var91 = (var89 & 0x7) + Statics.field792;
                int var92 = field514.method2484();
                if (var90 >= 0 && var91 >= 0 && var90 < 103 && var91 < 103) {
                    if (var88 == 0) {
                        class95 var93 = Statics.field2020.method1925(Statics.field244, var90, var91);
                        if (var93 != null) {
                            int var94 = var93.field1609 >> 14 & 0x7FFF;
                            if (var86 == 2) {
                                var93.field1607 = new class13(var94, 2, var87 + 4, Statics.field244, var90, var91, var92, false, var93.field1607);
                                var93.field1608 = new class13(var94, 2, var87 + 1 & 0x3, Statics.field244, var90, var91, var92, false, var93.field1608);
                            } else {
                                var93.field1607 = new class13(var94, var86, var87, Statics.field244, var90, var91, var92, false, var93.field1607);
                            }
                        }
                    }
                    if (var88 == 1) {
                        class107 var95 = Statics.field2020.method2006(Statics.field244, var90, var91);
                        if (var95 != null) {
                            int var96 = var95.field1787 >> 14 & 0x7FFF;
                            if (var86 == 4 || var86 == 5) {
                                var95.field1792 = new class13(var96, 4, var87, Statics.field244, var90, var91, var92, false, var95.field1792);
                            } else if (var86 == 6) {
                                var95.field1792 = new class13(var96, 4, var87 + 4, Statics.field244, var90, var91, var92, false, var95.field1792);
                            } else if (var86 == 7) {
                                var95.field1792 = new class13(var96, 4, (var87 + 2 & 0x3) + 4, Statics.field244, var90, var91, var92, false, var95.field1792);
                            } else if (var86 == 8) {
                                var95.field1792 = new class13(var96, 4, var87 + 4, Statics.field244, var90, var91, var92, false, var95.field1792);
                                var95.field1793 = new class13(var96, 4, (var87 + 2 & 0x3) + 4, Statics.field244, var90, var91, var92, false, var95.field1793);
                            }
                        }
                    }
                    if (var88 == 2) {
                        class97 var97 = Statics.field2020.method1860(Statics.field244, var90, var91);
                        if (var86 == 11) {
                            var86 = 10;
                        }
                        if (var97 != null) {
                            var97.field1627 = new class13(var97.field1635 >> 14 & 0x7FFF, var86, var87, Statics.field244, var90, var91, var92, false, var97.field1627);
                        }
                    }
                    if (var88 == 3) {
                        class106 var98 = Statics.field2020.method1861(Statics.field244, var90, var91);
                        if (var98 != null) {
                            var98.field1775 = new class13(var98.field1776 >> 14 & 0x7FFF, 22, var87, Statics.field244, var90, var91, var92, false, var98.field1775);
                        }
                    }
                }
            } else if (field516 == 167) {
                int var99 = field514.method2450();
                int var100 = (var99 >> 4 & 0x7) + Statics.field380;
                int var101 = (var99 & 0x7) + Statics.field792;
                int var102 = field514.method2624();
                int var103 = var102 >> 2;
                int var104 = var102 & 0x3;
                int var105 = field597[var103];
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    method1354(Statics.field244, var100, var101, var105, -1, var103, var104, 0, -1);
                }
            } else if (field516 == 132) {
                int var106 = field514.method2450();
                int var107 = (var106 >> 4 & 0x7) + Statics.field380;
                int var108 = (var106 & 0x7) + Statics.field792;
                int var109 = field514.method2627();
                int var110 = field514.method2627();
                int var111 = field514.method2627();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    class175 var112 = field608[Statics.field244][var107][var108];
                    if (var112 != null) {
                        for (class16 var113 = (class16) var112.method3317(); var113 != null; var113 = (class16) var112.method3310()) {
                            if ((var109 & 0x7FFF) == var113.field254 && var113.field251 == var110) {
                                var113.field251 = var111;
                                break;
                            }
                        }
                        method142(var107, var108);
                    }
                }
            } else if (field516 == 23) {
                int var114 = field514.method2465();
                int var115 = field514.method2475();
                int var116 = (var115 >> 4 & 0x7) + Statics.field380;
                int var117 = (var115 & 0x7) + Statics.field792;
                int var118 = field514.method2480();
                int var119 = var118 >> 2;
                int var120 = var118 & 0x3;
                int var121 = field597[var119];
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    method1354(Statics.field244, var116, var117, var121, var114, var119, var120, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("bd.be(IIIIIIIIII)V")
    public static final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var9 = null;
        for (class21 var10 = (class21) field609.method3317(); var10 != null; var10 = (class21) field609.method3310()) {
            if (var10.field337 == arg0 && var10.field339 == arg1 && var10.field350 == arg2 && var10.field338 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class21();
            var9.field337 = arg0;
            var9.field338 = arg3;
            var9.field339 = arg1;
            var9.field350 = arg2;
            method60(var9);
            field609.method3303(var9);
        }
        var9.field344 = arg4;
        var9.field346 = arg5;
        var9.field340 = arg6;
        var9.field347 = arg7;
        var9.field348 = arg8;
    }

    @ObfuscatedName("t.bz(B)V")
    public static final void method115() {
        for (class21 var0 = (class21) field609.method3317(); var0 != null; var0 = (class21) field609.method3310()) {
            if (var0.field348 == -1) {
                var0.field347 = 0;
                method60(var0);
            } else {
                var0.method3346();
            }
        }
    }

    @ObfuscatedName("m.bm(La;I)V")
    public static final void method60(class21 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field338 == 0) {
            var1 = Statics.field2020.method1862(arg0.field337, arg0.field339, arg0.field350);
        }
        if (arg0.field338 == 1) {
            var1 = Statics.field2020.method1863(arg0.field337, arg0.field339, arg0.field350);
        }
        if (arg0.field338 == 2) {
            var1 = Statics.field2020.method1972(arg0.field337, arg0.field339, arg0.field350);
        }
        if (arg0.field338 == 3) {
            var1 = Statics.field2020.method1947(arg0.field337, arg0.field339, arg0.field350);
        }
        if (var1 != 0) {
            int var5 = Statics.field2020.method1866(arg0.field337, arg0.field339, arg0.field350, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field341 = var2;
        arg0.field343 = var3;
        arg0.field342 = var4;
    }

    @ObfuscatedName("f.br(III)V")
    public static final void method142(int arg0, int arg1) {
        class175 var2 = field608[Statics.field244][arg0][arg1];
        if (var2 == null) {
            Statics.field2020.method1876(Statics.field244, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class16 var4 = null;
        for (class16 var5 = (class16) var2.method3317(); var5 != null; var5 = (class16) var2.method3310()) {
            class39 var6 = class39.method2704(var5.field254);
            int var7 = var6.field1016;
            if (var6.field998 == 1) {
                var7 = (var5.field251 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field2020.method1876(Statics.field244, arg0, arg1);
            return;
        }
        var2.method3304(var4);
        class16 var8 = null;
        class16 var9 = null;
        for (class16 var10 = (class16) var2.method3317(); var10 != null; var10 = (class16) var2.method3310()) {
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
        Statics.field2020.method1843(Statics.field244, arg0, arg1, method121(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field244), var4, var11, var8, var9);
    }

    @ObfuscatedName("aj.bi(B)V")
    public static final void method647() {
        field514.method2310();
        int var0 = field514.method2312(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field514.method2312(2);
        if (var1 == 0) {
            field487[++field635 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field514.method2312(3);
            Statics.field1033.method251(var2, false);
            int var3 = field514.method2312(1);
            if (var3 == 1) {
                field487[++field635 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field514.method2312(3);
            Statics.field1033.method251(var4, true);
            int var5 = field514.method2312(3);
            Statics.field1033.method251(var5, true);
            int var6 = field514.method2312(1);
            if (var6 == 1) {
                field487[++field635 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field244 = field514.method2312(2);
            int var7 = field514.method2312(7);
            int var8 = field514.method2312(7);
            int var9 = field514.method2312(1);
            if (var9 == 1) {
                field487[++field635 - 1] = 2047;
            }
            int var10 = field514.method2312(1);
            Statics.field1033.method236(var7, var8, var10 == 1);
        }
    }

    @ObfuscatedName("cf.bd(I)V")
    public static final void method1824() {
        while (true) {
            if (field514.method2309(field515) >= 11) {
                int var0 = field514.method2312(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field660[var0] == null) {
                        field660[var0] = new class3();
                        if (field552[var0] != null) {
                            field660[var0].method14(field552[var0]);
                        }
                        var1 = true;
                    }
                    field698[++field576 - 1] = var0;
                    class3 var2 = field660[var0];
                    var2.field455 = field481;
                    int var3 = field514.method2312(1);
                    if (var3 == 1) {
                        field487[++field635 - 1] = var0;
                    }
                    int var4 = field514.method2312(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field514.method2312(1);
                    int var6 = field514.method2312(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field533[field514.method2312(3)];
                    if (var1) {
                        var2.field462 = var2.field411 = var7;
                    }
                    var2.method236(Statics.field1033.field444[0] + var6, Statics.field1033.field450[0] + var4, var5 == 1);
                    continue;
                }
            }
            field514.method2311();
            return;
        }
    }

    @ObfuscatedName("cx.bg(B)V")
    public static final void method2026() {
        for (int var0 = 0; var0 < field635; var0++) {
            int var1 = field487[var0];
            class3 var2 = field660[var1];
            int var3 = field514.method2450();
            if ((var3 & 0x2) != 0) {
                var3 += field514.method2450() << 8;
            }
            method2188(var1, var2, var3);
        }
    }

    @ObfuscatedName("de.ba(ILc;IB)V")
    public static final void method2188(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x20) != 0) {
            int var3 = field514.method2624();
            int var4 = field514.method2475();
            arg1.method239(var3, var4, field481);
            arg1.field429 = field481 + 300;
            arg1.field457 = field514.method2480();
            arg1.field431 = field514.method2480();
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field432 = field514.method2484();
            if (arg1.field432 == 65535) {
                arg1.field432 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var5 = field514.method2484();
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = field514.method2624();
            method1827(arg1, var5, var6);
        }
        if ((arg2 & 0x200) != 0) {
            int var7 = field514.method2624();
            int var8 = field514.method2475();
            arg1.method239(var7, var8, field481);
            arg1.field429 = field481 + 300;
            arg1.field457 = field514.method2480();
            arg1.field431 = field514.method2475();
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field422 = field514.method2603();
            if (arg1.field422.charAt(0) == '~') {
                arg1.field422 = arg1.field422.substring(1);
                Statics.method2554(2, arg1.field51, arg1.field422);
            } else if (Statics.field1033 == arg1) {
                Statics.method2554(2, arg1.field51, arg1.field422);
            }
            arg1.field424 = 0;
            arg1.field418 = 0;
            arg1.field409 = 150;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field441 = field514.method2475();
            arg1.field465 = field514.method2450();
            arg1.field423 = field514.method2480();
            arg1.field451 = field514.method2624();
            arg1.field461 = field514.method2483() + field481;
            arg1.field453 = field514.method2483() + field481;
            arg1.field452 = field514.method2475();
            arg1.field460 = 1;
            arg1.field454 = 0;
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field425 = field514.method2465();
            arg1.field434 = field514.method2484();
        }
        if ((arg2 & 0x80) != 0) {
            int var9 = field514.method2624();
            byte[] var10 = new byte[var9];
            class126 var11 = new class126(var10);
            field514.method2493(var10, 0, var9);
            field552[arg0] = var11;
            arg1.method14(var11);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field443 = field514.method2627();
            int var12 = field514.method2491();
            arg1.field414 = var12 >> 16;
            arg1.field446 = (var12 & 0xFFFF) + field481;
            arg1.field464 = 0;
            arg1.field445 = 0;
            if (arg1.field446 > field481) {
                arg1.field464 = -1;
            }
            if (arg1.field443 == 65535) {
                arg1.field443 = -1;
            }
        }
        if ((arg2 & 0x4) == 0) {
            return;
        }
        int var13 = field514.method2627();
        int var14 = field514.method2624();
        int var15 = field514.method2624();
        int var16 = field514.field2003;
        if (arg1.field51 != null && arg1.field36 != null) {
            boolean var17 = false;
            if (var14 <= 1 && method61(arg1.field51)) {
                var17 = true;
            }
            if (!var17 && field557 == 0) {
                field497.field2003 = 0;
                field514.method2605(field497.field2007, 0, var15);
                field497.field2003 = 0;
                String var18 = class183.method3391(class146.method1266(class182.method143(field497)));
                arg1.field422 = var18.trim();
                arg1.field424 = var13 >> 8;
                arg1.field418 = var13 & 0xFF;
                arg1.field409 = 150;
                if (var14 == 2 || var14 == 3) {
                    Statics.method2554(1, class2.method29(1) + arg1.field51, var18);
                } else if (var14 == 1) {
                    Statics.method2554(1, class2.method29(0) + arg1.field51, var18);
                } else {
                    Statics.method2554(2, arg1.field51, var18);
                }
            }
        }
        field514.field2003 = var15 + var16;
    }

    @ObfuscatedName("r.bo(I)V")
    public static final void method217() {
        while (true) {
            if (field514.method2309(field515) >= 27) {
                int var0 = field514.method2312(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field509[var0] == null) {
                        field509[var0] = new class24();
                        var1 = true;
                    }
                    class24 var2 = field509[var0];
                    field511[++field510 - 1] = var0;
                    var2.field455 = field481;
                    int var3 = field514.method2312(1);
                    int var4 = field514.method2312(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field514.method2312(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field533[field514.method2312(3)];
                    if (var1) {
                        var2.field462 = var2.field411 = var6;
                    }
                    var2.field386 = class30.method154(field514.method2312(14));
                    int var7 = field514.method2312(1);
                    if (var7 == 1) {
                        field487[++field635 - 1] = var0;
                    }
                    var2.field413 = var2.field386.field783;
                    var2.field459 = var2.field386.field806;
                    if (var2.field459 == 0) {
                        var2.field411 = 0;
                    }
                    var2.field417 = var2.field386.field789;
                    var2.field449 = var2.field386.field799;
                    var2.field419 = var2.field386.field796;
                    var2.field420 = var2.field386.field781;
                    var2.field430 = var2.field386.field791;
                    var2.field415 = var2.field386.field787;
                    var2.field416 = var2.field386.field811;
                    var2.method236(Statics.field1033.field444[0] + var5, Statics.field1033.field450[0] + var4, var3 == 1);
                    continue;
                }
            }
            field514.method2311();
            return;
        }
    }

    @ObfuscatedName("di.bn(IIIII)V")
    public static final void method2434(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field675; var4++) {
            if (field682[var4] + field644[var4] > arg0 && field644[var4] < arg0 + arg2 && field683[var4] + field545[var4] > arg1 && field545[var4] < arg1 + arg3) {
                field645[var4] = true;
            }
        }
    }

    @ObfuscatedName("a.bb(IIIIB)V")
    public static final void method209(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field675; var4++) {
            if (field682[var4] + field644[var4] > arg0 && field644[var4] < arg0 + arg2 && field683[var4] + field545[var4] > arg1 && field545[var4] < arg1 + arg3) {
                field582[var4] = true;
            }
        }
    }

    @ObfuscatedName("cg.bx(I)V")
    public static final void method2030() {
        int var0 = Statics.field914.method3409(class133.field2214);
        for (int var1 = 0; var1 < field617; var1++) {
            int var2 = Statics.field914.method3409(method1181(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field617 * 15 + 21;
        int var4 = class76.field1393 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class76.field1397;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field616 = true;
        Statics.field187 = var4;
        Statics.field284 = var5;
        Statics.field1503 = var0;
        Statics.field1504 = field617 * 15 + 22;
    }

    @ObfuscatedName("t.bq(II)V")
    public static final void method112(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field618[arg0];
        int var2 = field619[arg0];
        int var3 = field620[arg0];
        int var4 = field621[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 41) {
            field512.method2307(191);
            field512.method2553(var4);
            field512.method2486(var2);
            field512.method2553(var1);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 10) {
            class24 var5 = field509[var4];
            if (var5 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var5.field444[0], var5.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(32);
                field512.method2553(var4);
            }
        }
        if (var3 == 36) {
            field512.method2307(107);
            field512.method2456(var2);
            field512.method2481(var4);
            field512.method2479(var1);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 34) {
            field512.method2307(81);
            field512.method2479(var1);
            field512.method2553(var4);
            field512.method2455(var2);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 21) {
            boolean var6 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var6) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(36);
            field512.method2438(Statics.field141 + var2);
            field512.method2553(Statics.field333 + var1);
            field512.method2438(var4);
        }
        if (var3 == 46) {
            class3 var8 = field660[var4];
            if (var8 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var8.field444[0], var8.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(6);
                field512.method2438(var4);
            }
        }
        if (var3 == 48) {
            class3 var9 = field660[var4];
            if (var9 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var9.field444[0], var9.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(58);
                field512.method2479(var4);
            }
        }
        if (var3 == 17) {
            boolean var10 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var10) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(98);
            field512.method2481(field631);
            field512.method2456(Statics.field211);
            field512.method2481(var4);
            field512.method2438(Statics.field141 + var2);
            field512.method2481(Statics.field333 + var1);
        }
        if (var3 == 35) {
            field512.method2307(12);
            field512.method2438(var1);
            field512.method2553(var4);
            field512.method2488(var2);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 15) {
            class3 var12 = field660[var4];
            if (var12 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var12.field444[0], var12.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(177);
                field512.method2553(var4);
                field512.method2481(field631);
                field512.method2486(Statics.field211);
            }
        }
        if (var3 == 4) {
            method136(var1, var2, var4);
            field512.method2307(188);
            field512.method2438(Statics.field333 + var1);
            field512.method2438(Statics.field141 + var2);
            field512.method2481(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 2 && method136(var1, var2, var4)) {
            field512.method2307(134);
            field512.method2481(Statics.field141 + var2);
            field512.method2553(var4 >> 14 & 0x7FFF);
            field512.method2456(Statics.field211);
            field512.method2481(Statics.field333 + var1);
            field512.method2438(field631);
        }
        if (var3 == 1 && method136(var1, var2, var4)) {
            field512.method2307(165);
            field512.method2553(Statics.field141 + var2);
            field512.method2481(Statics.field39);
            field512.method2486(Statics.field65);
            field512.method2438(var4 >> 14 & 0x7FFF);
            field512.method2481(Statics.field71);
            field512.method2553(Statics.field333 + var1);
        }
        if (var3 == 42) {
            field512.method2307(89);
            field512.method2486(var2);
            field512.method2479(var4);
            field512.method2479(var1);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 44) {
            class3 var13 = field660[var4];
            if (var13 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var13.field444[0], var13.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(213);
                field512.method2479(var4);
            }
        }
        if (var3 == 13) {
            class24 var14 = field509[var4];
            if (var14 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var14.field444[0], var14.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(11);
                field512.method2438(var4);
            }
        }
        if (var3 == 38) {
            if (field630) {
                class156 var15 = class156.method2911(Statics.field211, field631);
                if (var15 != null && var15.field2597 != null) {
                    class1 var16 = new class1();
                    var16.field15 = var15;
                    var16.field13 = var15.field2597;
                    class25.method226(var16);
                }
                field630 = false;
                method2103(var15);
            }
            class156 var17 = class156.method2431(var2);
            field672 = 1;
            Statics.field39 = var1;
            Statics.field65 = var2;
            Statics.field71 = var4;
            method2103(var17);
            field612 = class2.method644(16748608) + class39.method2704(var4).field1026 + class2.method644(16777215);
            if (field612 == null) {
                field612 = "null";
            }
            return;
        }
        if (var3 == 26) {
            field512.method2307(118);
            for (class4 var18 = (class4) field712.method3285(); var18 != null; var18 = (class4) field712.method3286()) {
                if (var18.field66 == 0 || var18.field66 == 3) {
                    method600(var18, true);
                }
            }
            if (field638 != null) {
                method2103(field638);
                field638 = null;
            }
        }
        if (var3 == 58) {
            field512.method2307(49);
            field512.method2553(field631);
            field512.method2488(var2);
            field512.method2479(var1);
            field512.method2488(Statics.field211);
        }
        if (var3 == 3) {
            method136(var1, var2, var4);
            field512.method2307(72);
            field512.method2553(var4 >> 14 & 0x7FFF);
            field512.method2481(Statics.field333 + var1);
            field512.method2553(Statics.field141 + var2);
        }
        if (var3 == 33) {
            field512.method2307(155);
            field512.method2488(var2);
            field512.method2481(var4);
            field512.method2553(var1);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 19) {
            boolean var19 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var19) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(234);
            field512.method2438(var4);
            field512.method2481(Statics.field333 + var1);
            field512.method2438(Statics.field141 + var2);
        }
        if (var3 == 24) {
            class156 var21 = class156.method2431(var2);
            boolean var22 = true;
            if (var21.field2518 > 0) {
                var22 = method1537(var21);
            }
            if (var22) {
                field512.method2307(127);
                field512.method2456(var2);
            }
        }
        if (var3 == 9) {
            class24 var23 = field509[var4];
            if (var23 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var23.field444[0], var23.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(75);
                field512.method2438(var4);
            }
        }
        if (var3 == 32) {
            field512.method2307(33);
            field512.method2553(field631);
            field512.method2481(var1);
            field512.method2456(Statics.field211);
            field512.method2553(var4);
            field512.method2488(var2);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 1001) {
            method136(var1, var2, var4);
            field512.method2307(233);
            field512.method2479(Statics.field333 + var1);
            field512.method2553(Statics.field141 + var2);
            field512.method2481(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 49) {
            class3 var24 = field660[var4];
            if (var24 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var24.field444[0], var24.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(74);
                field512.method2438(var4);
            }
        }
        if (var3 == 22) {
            boolean var25 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var25) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(237);
            field512.method2438(Statics.field141 + var2);
            field512.method2553(Statics.field333 + var1);
            field512.method2479(var4);
        }
        if (var3 == 30 && field638 == null) {
            method898(var2, var1);
            field638 = class156.method2911(var2, var1);
            method2103(field638);
        }
        if (var3 == 57 || var3 == 1007) {
            method869(var4, var2, var1, field623[arg0]);
        }
        if (var3 == 43) {
            field512.method2307(194);
            field512.method2486(var2);
            field512.method2553(var1);
            field512.method2479(var4);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 1003) {
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            class24 var27 = field509[var4];
            if (var27 != null) {
                class30 var28 = var27.field386;
                if (var28.field790 != null) {
                    var28 = var28.method645();
                }
                if (var28 != null) {
                    field512.method2307(37);
                    field512.method2479(var28.field812);
                }
            }
        }
        if (var3 == 8) {
            class24 var29 = field509[var4];
            if (var29 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var29.field444[0], var29.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(243);
                field512.method2479(var4);
                field512.method2481(field631);
                field512.method2488(Statics.field211);
            }
        }
        if (var3 == 39) {
            field512.method2307(176);
            field512.method2486(var2);
            field512.method2438(var4);
            field512.method2479(var1);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 1004) {
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(133);
            field512.method2438(var4);
        }
        if (var3 == 37) {
            field512.method2307(93);
            field512.method2479(var4);
            field512.method2456(var2);
            field512.method2438(var1);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 50) {
            class3 var30 = field660[var4];
            if (var30 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var30.field444[0], var30.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(60);
                field512.method2438(var4);
            }
        }
        if (var3 == 11) {
            class24 var31 = field509[var4];
            if (var31 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var31.field444[0], var31.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(163);
                field512.method2481(var4);
            }
        }
        if (var3 == 14) {
            class3 var32 = field660[var4];
            if (var32 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var32.field444[0], var32.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(51);
                field512.method2455(Statics.field65);
                field512.method2479(var4);
                field512.method2438(Statics.field71);
                field512.method2438(Statics.field39);
            }
        }
        if (var3 == 16) {
            boolean var33 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var33) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(103);
            field512.method2479(Statics.field141 + var2);
            field512.method2553(Statics.field71);
            field512.method2455(Statics.field65);
            field512.method2479(Statics.field39);
            field512.method2438(Statics.field333 + var1);
            field512.method2481(var4);
        }
        if (var3 == 45) {
            class3 var35 = field660[var4];
            if (var35 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var35.field444[0], var35.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(138);
                field512.method2438(var4);
            }
        }
        if (var3 == 7) {
            class24 var36 = field509[var4];
            if (var36 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var36.field444[0], var36.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(208);
                field512.method2481(Statics.field71);
                field512.method2481(Statics.field39);
                field512.method2438(var4);
                field512.method2455(Statics.field65);
            }
        }
        if (var3 == 29) {
            field512.method2307(127);
            field512.method2456(var2);
            class156 var37 = class156.method2431(var2);
            if (var37.field2610 != null && var37.field2610[0][0] == 5) {
                int var38 = var37.field2610[0][1];
                if (class157.field2634[var38] != var37.field2567[0]) {
                    class157.field2634[var38] = var37.field2567[0];
                    Statics.method2411(var38);
                }
            }
        }
        if (var3 == 1002) {
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(125);
            field512.method2553(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 25) {
            class156 var39 = class156.method2911(var2, var1);
            if (var39 != null) {
                if (field630) {
                    class156 var40 = class156.method2911(Statics.field211, field631);
                    if (var40 != null && var40.field2597 != null) {
                        class1 var41 = new class1();
                        var41.field15 = var40;
                        var41.field13 = var40.field2597;
                        class25.method226(var41);
                    }
                    field630 = false;
                    method2103(var40);
                }
                int var42 = class160.method171(method883(var39));
                class156 var43 = class156.method2911(var2, var1);
                if (var43 != null && var43.field2626 != null) {
                    class1 var44 = new class1();
                    var44.field15 = var43;
                    var44.field13 = var43.field2626;
                    class25.method226(var44);
                }
                field630 = true;
                Statics.field211 = var2;
                field631 = var1;
                Statics.field756 = var42;
                method2103(var43);
                field672 = 0;
                field632 = method3227(var39);
                if (field632 == null) {
                    field632 = "Null";
                }
                if (var39.field2513) {
                    field599 = var39.field2535 + class2.method644(16777215);
                } else {
                    field599 = class2.method644(65280) + var39.field2541 + class2.method644(16777215);
                }
            }
            return;
        }
        if (var3 == 18) {
            boolean var45 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var45) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(69);
            field512.method2553(Statics.field333 + var1);
            field512.method2479(var4);
            field512.method2481(Statics.field141 + var2);
        }
        if (var3 == 6) {
            method136(var1, var2, var4);
            field512.method2307(78);
            field512.method2438(Statics.field141 + var2);
            field512.method2553(var4 >> 14 & 0x7FFF);
            field512.method2479(Statics.field333 + var1);
        }
        if (var3 == 5) {
            method136(var1, var2, var4);
            field512.method2307(30);
            field512.method2481(Statics.field141 + var2);
            field512.method2479(var4 >> 14 & 0x7FFF);
            field512.method2553(Statics.field333 + var1);
        }
        if (var3 == 40) {
            field512.method2307(156);
            field512.method2456(var2);
            field512.method2438(var1);
            field512.method2479(var4);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 47) {
            class3 var47 = field660[var4];
            if (var47 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var47.field444[0], var47.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(173);
                field512.method2479(var4);
            }
        }
        if (var3 == 51) {
            class3 var48 = field660[var4];
            if (var48 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var48.field444[0], var48.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(99);
                field512.method2481(var4);
            }
        }
        if (var3 == 20) {
            boolean var49 = method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var49) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field548 = class76.field1393;
            field678 = class76.field1397;
            field584 = 2;
            field648 = 0;
            field512.method2307(231);
            field512.method2479(Statics.field141 + var2);
            field512.method2438(var4);
            field512.method2438(Statics.field333 + var1);
        }
        if (var3 == 28) {
            field512.method2307(127);
            field512.method2456(var2);
            class156 var51 = class156.method2431(var2);
            if (var51.field2610 != null && var51.field2610[0][0] == 5) {
                int var52 = var51.field2610[0][1];
                class157.field2634[var52] = 1 - class157.field2634[var52];
                Statics.method2411(var52);
            }
        }
        if (var3 == 1005) {
            class156 var53 = class156.method2431(var2);
            if (var53 == null || var53.field2617[var1] < 100000) {
                field512.method2307(133);
                field512.method2438(var4);
            } else {
                Statics.method2554(0, "", var53.field2617[var1] + " x " + class39.method2704(var4).field1026);
            }
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (var3 == 23) {
            Statics.field2020.method1989(Statics.field244, var1, var2);
        }
        if (var3 == 12) {
            class24 var54 = field509[var4];
            if (var54 != null) {
                method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var54.field444[0], var54.field450[0], false, 0, 0, 1, 1, 0, 2);
                field548 = class76.field1393;
                field678 = class76.field1397;
                field584 = 2;
                field648 = 0;
                field512.method2307(205);
                field512.method2479(var4);
            }
        }
        if (var3 == 31) {
            field512.method2307(183);
            field512.method2438(var1);
            field512.method2553(Statics.field71);
            field512.method2455(var2);
            field512.method2438(var4);
            field512.method2481(Statics.field39);
            field512.method2488(Statics.field65);
            field585 = 0;
            Statics.field405 = class156.method2431(var2);
            field586 = var1;
        }
        if (field672 != 0) {
            field672 = 0;
            method2103(class156.method2431(Statics.field65));
        }
        if (field630 && field630) {
            class156 var55 = class156.method2911(Statics.field211, field631);
            if (var55 != null && var55.field2597 != null) {
                class1 var56 = new class1();
                var56.field15 = var55;
                var56.field13 = var55.field2597;
                class25.method226(var56);
            }
            field630 = false;
            method2103(var55);
        }
        if (Statics.field405 != null && field585 == 0) {
            method2103(Statics.field405);
        }
    }

    @ObfuscatedName("ac.bf(III)V")
    public static void method898(int arg0, int arg1) {
        field512.method2307(146);
        field512.method2479(arg1);
        field512.method2456(arg0);
    }

    @ObfuscatedName("ae.by(IIILjava/lang/String;I)V")
    public static void method869(int arg0, int arg1, int arg2, String arg3) {
        class156 var4 = class156.method2911(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2578 != null) {
            class1 var5 = new class1();
            var5.field15 = var4;
            var5.field5 = arg0;
            var5.field9 = arg3;
            var5.field13 = var4.field2578;
            class25.method226(var5);
        }
        boolean var6 = true;
        if (var4.field2518 > 0) {
            var6 = method1537(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method883(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field512.method2307(56);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 2) {
            field512.method2307(59);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 3) {
            field512.method2307(175);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 4) {
            field512.method2307(122);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 5) {
            field512.method2307(114);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 6) {
            field512.method2307(34);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 7) {
            field512.method2307(198);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 8) {
            field512.method2307(96);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 9) {
            field512.method2307(85);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
        if (arg0 == 10) {
            field512.method2307(82);
            field512.method2456(arg1);
            field512.method2438(arg2);
        }
    }

    @ObfuscatedName("l.bk(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method56(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field616 || field617 >= 500) {
            return;
        }
        field477[field617] = arg0;
        field623[field617] = arg1;
        field620[field617] = arg2;
        field621[field617] = arg3;
        field618[field617] = arg4;
        field619[field617] = arg5;
        field617++;
    }

    @ObfuscatedName("aq.ck(IB)Ljava/lang/String;")
    public static String method1181(int arg0) {
        return field623[arg0].length() > 0 ? field477[arg0] + class133.field2043 + field623[arg0] : field477[arg0];
    }

    @ObfuscatedName("b.cn(Laj;IIII)V")
    public static final void method122(class30 arg0, int arg1, int arg2, int arg3) {
        if (field617 >= 400) {
            return;
        }
        if (arg0.field790 != null) {
            arg0 = arg0.method645();
        }
        if (arg0 == null || !arg0.field810) {
            return;
        }
        String var4 = arg0.field782;
        if (arg0.field788 != 0) {
            var4 = var4 + method1590(arg0.field788, Statics.field1033.field44) + " " + class2.field24 + class133.field2187 + arg0.field788 + class2.field30;
        }
        if (field672 == 1) {
            method56(class133.field2121, field612 + " " + class2.field25 + " " + class2.method644(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field630) {
            String[] var5 = arg0.field797;
            if (field724) {
                var5 = method130(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class133.field2183)) {
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
                        method56(var5[var6], class2.method644(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class133.field2183)) {
                        short var9 = 0;
                        if (arg0.field788 > Statics.field1033.field44) {
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
                        method56(var5[var8], class2.method644(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method56(class133.field2182, class2.method644(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field756 & 0x2) == 2) {
            method56(field632, field599 + " " + class2.field25 + " " + class2.method644(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cl.cu(Lc;IIII)V")
    public static final void method2104(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1033 == arg0 || field617 >= 400) {
            return;
        }
        String var4;
        if (arg0.field42 == 0) {
            var4 = arg0.field51 + method1590(arg0.field44, Statics.field1033.field44) + " " + class2.field24 + class133.field2187 + arg0.field44 + class2.field30;
        } else {
            var4 = arg0.field51 + " " + class2.field24 + class133.field2239 + arg0.field42 + class2.field30;
        }
        if (field672 == 1) {
            method56(class133.field2121, field612 + " " + class2.field25 + " " + class2.method644(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field630) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field605[var5] != null) {
                    short var6 = 0;
                    if (field605[var5].equalsIgnoreCase(class133.field2183)) {
                        if (arg0.field44 > Statics.field1033.field44) {
                            var6 = 2000;
                        }
                        if (Statics.field1033.field40 != 0 && arg0.field40 != 0) {
                            if (Statics.field1033.field40 == arg0.field40) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field574[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field604[var5] + var6;
                    method56(field605[var5], class2.method644(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field756 & 0x8) == 8) {
            method56(field632, field599 + " " + class2.field25 + " " + class2.method644(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field617; var9++) {
            if (field620[var9] == 23) {
                field623[var9] = class2.method644(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("cu.cw(III)Ljava/lang/String;")
    public static final String method1590(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method644(16711680);
        } else if (var2 < -6) {
            return class2.method644(16723968);
        } else if (var2 < -3) {
            return class2.method644(16740352);
        } else if (var2 < 0) {
            return class2.method644(16756736);
        } else if (var2 > 9) {
            return class2.method644(65280);
        } else if (var2 > 6) {
            return class2.method644(4259584);
        } else if (var2 > 3) {
            return class2.method644(8453888);
        } else if (var2 > 0) {
            return class2.method644(12648192);
        } else {
            return class2.method644(16776960);
        }
    }

    @ObfuscatedName("aq.cb(IIIIIIIII)V")
    public static final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class156.method132(arg0)) {
            Statics.field402 = null;
            method1822(Statics.field2537[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field402 != null) {
                method1822(Statics.field402, -1412584499, arg1, arg2, arg3, arg4, Statics.field977, Statics.field784, arg7);
                Statics.field402 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field645[var8] = true;
            }
        } else {
            field645[arg7] = true;
        }
    }

    @ObfuscatedName("co.cp([Lem;IIIIIIIII)V")
    public static final void method1822(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class88.method1755(arg2, arg3, arg4, arg5);
        class103.method2106();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class156 var10 = arg0[var9];
            if (var10 != null && (var10.field2525 == arg1 || arg1 == -1412584499 && field489 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field644[field675] = var10.field2549 + arg6;
                    field545[field675] = var10.field2520 + arg7;
                    field682[field675] = var10.field2523;
                    field683[field675] = var10.field2524;
                    var11 = ++field675 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2629 = var11;
                var10.field2630 = field481;
                if (!var10.field2513 || !method170(var10)) {
                    if (var10.field2518 > 0) {
                        method38(var10);
                    }
                    int var12 = var10.field2549 + arg6;
                    int var13 = var10.field2520 + arg7;
                    int var14 = var10.field2536;
                    if (field489 == var10) {
                        if (arg1 != -1412584499 && !var10.field2579) {
                            Statics.field402 = arg0;
                            Statics.field977 = arg6;
                            Statics.field784 = arg7;
                            continue;
                        }
                        if (field656 && field607) {
                            int var15 = class76.field1389;
                            int var16 = class76.field1390;
                            int var17 = var15 - field647;
                            int var18 = var16 - field549;
                            if (var17 < field651) {
                                var17 = field651;
                            }
                            if (var10.field2523 + var17 > field651 + field646.field2523) {
                                var17 = field651 + field646.field2523 - var10.field2523;
                            }
                            if (var18 < field652) {
                                var18 = field652;
                            }
                            if (var10.field2524 + var18 > field652 + field646.field2524) {
                                var18 = field652 + field646.field2524 - var10.field2524;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2579) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2587 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2587 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2523 + var12;
                        int var26 = var10.field2524 + var13;
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
                        int var29 = var10.field2523 + var12;
                        int var30 = var10.field2524 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2513 || var19 < var21 && var20 < var22) {
                        if (var10.field2518 != 0) {
                            if (var10.field2518 == 1337) {
                                field488 = var12;
                                field570 = var13;
                                int var31 = var10.field2523;
                                int var32 = var10.field2524;
                                class88.method1755(var12, var13, var12 + var31, var13 + var32);
                                class103.method2106();
                                field578++;
                                Statics.method28(true);
                                method2659(true);
                                Statics.method28(false);
                                method2659(false);
                                method1511();
                                for (class19 var33 = (class19) field611.method3317(); var33 != null; var33 = (class19) field611.method3310()) {
                                    if (Statics.field244 != var33.field288 || var33.field295) {
                                        var33.method3346();
                                    } else if (field481 >= var33.field283) {
                                        var33.method166(field551);
                                        if (var33.field295) {
                                            var33.method3346();
                                        } else {
                                            Statics.field2020.method2003(var33.field288, var33.field285, var33.field286, var33.field287, 60, var33, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field720) {
                                    int var34 = field531;
                                    if (field566 / 256 > var34) {
                                        var34 = field566 / 256;
                                    }
                                    if (field721[4] && field677[4] + 128 > var34) {
                                        var34 = field677[4] + 128;
                                    }
                                    int var35 = field592 + field561 & 0x7FF;
                                    int var36 = Statics.field205;
                                    int var37 = method121(Statics.field1033.field448, Statics.field1033.field410, Statics.field244) - 50;
                                    int var38 = Statics.field381;
                                    int var39 = var34 * 3 + 600;
                                    int var40 = 2048 - var34 & 0x7FF;
                                    int var41 = 2048 - var35 & 0x7FF;
                                    int var42 = 0;
                                    int var43 = 0;
                                    int var44 = var39;
                                    if (var40 != 0) {
                                        int var45 = class103.field1757[var40];
                                        int var46 = class103.field1746[var40];
                                        int var47 = var43 * var46 - var39 * var45 >> 16;
                                        var44 = var43 * var45 + var39 * var46 >> 16;
                                        var43 = var47;
                                    }
                                    if (var41 != 0) {
                                        int var48 = class103.field1757[var41];
                                        int var49 = class103.field1746[var41];
                                        int var50 = var42 * var49 + var44 * var48 >> 16;
                                        var44 = var44 * var49 - var42 * var48 >> 16;
                                        var42 = var50;
                                    }
                                    Statics.field1804 = var36 - var42;
                                    Statics.field70 = var37 - var43;
                                    Statics.field755 = var38 - var44;
                                    Statics.field2001 = var34;
                                    Statics.field171 = var35;
                                }
                                int var51;
                                if (field720) {
                                    var51 = method2789();
                                } else {
                                    var51 = method227();
                                }
                                int var52 = Statics.field1804;
                                int var53 = Statics.field70;
                                int var54 = Statics.field755;
                                int var55 = Statics.field2001;
                                int var56 = Statics.field171;
                                for (int var57 = 0; var57 < 5; var57++) {
                                    if (field721[var57]) {
                                        int var58 = (int) (Math.random() * (double) (field722[var57] * 2 + 1) - (double) field722[var57] + Math.sin((double) field530[var57] / 100.0D * (double) field725[var57]) * (double) field677[var57]);
                                        if (var57 == 0) {
                                            Statics.field1804 += var58;
                                        }
                                        if (var57 == 1) {
                                            Statics.field70 += var58;
                                        }
                                        if (var57 == 2) {
                                            Statics.field755 += var58;
                                        }
                                        if (var57 == 3) {
                                            Statics.field171 = Statics.field171 + var58 & 0x7FF;
                                        }
                                        if (var57 == 4) {
                                            Statics.field2001 += var58;
                                            if (Statics.field2001 < 128) {
                                                Statics.field2001 = 128;
                                            }
                                            if (Statics.field2001 > 383) {
                                                Statics.field2001 = 383;
                                            }
                                        }
                                    }
                                }
                                int var59 = class76.field1389;
                                int var60 = class76.field1390;
                                if (var59 >= var12 && var59 < var12 + var31 && var60 >= var13 && var60 < var13 + var32) {
                                    class111.field1894 = true;
                                    class111.field1842 = 0;
                                    class111.field1895 = class76.field1389 - var12;
                                    class111.field1896 = class76.field1390 - var13;
                                } else {
                                    class111.field1894 = false;
                                    class111.field1842 = 0;
                                }
                                method614();
                                class88.method1761(var12, var13, var31, var32, 0);
                                method614();
                                Statics.field2020.method1846(Statics.field1804, Statics.field70, Statics.field755, Statics.field2001, Statics.field171, var51);
                                method614();
                                Statics.field2020.method1850();
                                field567 = 0;
                                for (int var61 = -1; var61 < field576 + field510; var61++) {
                                    class26 var62;
                                    if (var61 == -1) {
                                        var62 = Statics.field1033;
                                    } else if (var61 < field576) {
                                        var62 = field660[field698[var61]];
                                    } else {
                                        var62 = field509[field511[var61 - field576]];
                                    }
                                    if (var62 != null && var62.method16()) {
                                        if (var62 instanceof class24) {
                                            class30 var63 = ((class24) var62).field386;
                                            if (var63.field790 != null) {
                                                var63 = var63.method645();
                                            }
                                            if (var63 == null) {
                                                continue;
                                            }
                                        }
                                        if (var61 >= field576) {
                                            class30 var66 = ((class24) var62).field386;
                                            if (var66.field790 != null) {
                                                var66 = var66.method645();
                                            }
                                            if (var66.field805 >= 0 && var66.field805 < Statics.field401.length) {
                                                method250(var62, var62.field456 + 15);
                                                if (field579 > -1) {
                                                    Statics.field401[var66.field805].method1665(field579 + var12 - 12, field580 + var13 - 30);
                                                }
                                            }
                                            if (field734 == 1 && field490 == field511[var61 - field576] && field481 % 20 < 10) {
                                                method250(var62, var62.field456 + 15);
                                                if (field579 > -1) {
                                                    Statics.field8[0].method1665(field579 + var12 - 12, field580 + var13 - 28);
                                                }
                                            }
                                        } else {
                                            int var64 = 30;
                                            class3 var65 = (class3) var62;
                                            if (var65.field37 != -1 || var65.field38 != -1) {
                                                method250(var62, var62.field456 + 15);
                                                if (field579 > -1) {
                                                    if (var65.field37 != -1) {
                                                        Statics.field565[var65.field37].method1665(field579 + var12 - 12, field580 + var13 - var64);
                                                        var64 += 25;
                                                    }
                                                    if (var65.field38 != -1) {
                                                        Statics.field401[var65.field38].method1665(field579 + var12 - 12, field580 + var13 - var64);
                                                        var64 += 25;
                                                    }
                                                }
                                            }
                                            if (var61 >= 0 && field734 == 10 && field649 == field698[var61]) {
                                                method250(var62, var62.field456 + 15);
                                                if (field579 > -1) {
                                                    Statics.field8[1].method1665(field579 + var12 - 12, field580 + var13 - var64);
                                                }
                                            }
                                        }
                                        if (var62.field422 != null && (var61 >= field576 || field691 == 0 || field691 == 3 || field691 == 1 && method107(((class3) var62).field51))) {
                                            method250(var62, var62.field456);
                                            if (field579 > -1 && field567 < field563) {
                                                field572[field567] = Statics.field914.method3409(var62.field422) / 2;
                                                field546[field567] = Statics.field914.field2783;
                                                field569[field567] = field579;
                                                field468[field567] = field580;
                                                field596[field567] = var62.field424;
                                                field593[field567] = var62.field418;
                                                field679[field567] = var62.field409;
                                                field543[field567] = var62.field422;
                                                field567++;
                                            }
                                        }
                                        if (var62.field429 > field481) {
                                            method250(var62, var62.field456 + 15);
                                            if (field579 > -1) {
                                                int var67 = var62.field457 * 30 / var62.field431;
                                                if (var67 > 30) {
                                                    var67 = 30;
                                                }
                                                class88.method1761(field579 + var12 - 15, field580 + var13 - 3, var67, 5, 65280);
                                                class88.method1761(field579 + var12 - 15 + var67, field580 + var13 - 3, 30 - var67, 5, 16711680);
                                            }
                                        }
                                        for (int var68 = 0; var68 < 4; var68++) {
                                            if (var62.field428[var68] > field481) {
                                                method250(var62, var62.field456 / 2);
                                                if (field579 > -1) {
                                                    if (var68 == 1) {
                                                        field580 -= 20;
                                                    }
                                                    if (var68 == 2) {
                                                        field579 -= 15;
                                                        field580 -= 10;
                                                    }
                                                    if (var68 == 3) {
                                                        field579 += 15;
                                                        field580 -= 10;
                                                    }
                                                    Statics.field2653[var62.field427[var68]].method1665(field579 + var12 - 12, field580 + var13 - 12);
                                                    Statics.field2300.method3394(Integer.toString(var62.field426[var68]), field579 + var12 - 1, field580 + var13 + 3, 16777215, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var69 = 0; var69 < field567; var69++) {
                                    int var70 = field569[var69];
                                    int var71 = field468[var69];
                                    int var72 = field572[var69];
                                    int var73 = field546[var69];
                                    boolean var74 = true;
                                    while (var74) {
                                        var74 = false;
                                        for (int var75 = 0; var75 < var69; var75++) {
                                            if (var71 + 2 > field468[var75] - field546[var75] && var71 - var73 < field468[var75] + 2 && var70 - var72 < field572[var75] + field569[var75] && var70 + var72 > field569[var75] - field572[var75] && field468[var75] - field546[var75] < var71) {
                                                var71 = field468[var75] - field546[var75];
                                                var74 = true;
                                            }
                                        }
                                    }
                                    field579 = field569[var69];
                                    field580 = field468[var69] = var71;
                                    String var76 = field543[var69];
                                    if (field503 == 0) {
                                        int var77 = 16776960;
                                        if (field596[var69] < 6) {
                                            var77 = field690[field596[var69]];
                                        }
                                        if (field596[var69] == 6) {
                                            var77 = field578 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field596[var69] == 7) {
                                            var77 = field578 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field596[var69] == 8) {
                                            var77 = field578 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field596[var69] == 9) {
                                            int var78 = 150 - field679[var69];
                                            if (var78 < 50) {
                                                var77 = var78 * 1280 + 16711680;
                                            } else if (var78 < 100) {
                                                var77 = 16776960 - (var78 - 50) * 327680;
                                            } else if (var78 < 150) {
                                                var77 = (var78 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field596[var69] == 10) {
                                            int var79 = 150 - field679[var69];
                                            if (var79 < 50) {
                                                var77 = var79 * 5 + 16711680;
                                            } else if (var79 < 100) {
                                                var77 = 16711935 - (var79 - 50) * 327680;
                                            } else if (var79 < 150) {
                                                var77 = (var79 - 100) * 327680 + 255 - (var79 - 100) * 5;
                                            }
                                        }
                                        if (field596[var69] == 11) {
                                            int var80 = 150 - field679[var69];
                                            if (var80 < 50) {
                                                var77 = 16777215 - var80 * 327685;
                                            } else if (var80 < 100) {
                                                var77 = (var80 - 50) * 327685 + 65280;
                                            } else if (var80 < 150) {
                                                var77 = 16777215 - (var80 - 100) * 327680;
                                            }
                                        }
                                        if (field593[var69] == 0) {
                                            Statics.field914.method3394(var76, field579 + var12, field580 + var13, var77, 0);
                                        }
                                        if (field593[var69] == 1) {
                                            Statics.field914.method3396(var76, field579 + var12, field580 + var13, var77, 0, field578);
                                        }
                                        if (field593[var69] == 2) {
                                            Statics.field914.method3397(var76, field579 + var12, field580 + var13, var77, 0, field578);
                                        }
                                        if (field593[var69] == 3) {
                                            Statics.field914.method3398(var76, field579 + var12, field580 + var13, var77, 0, field578, 150 - field679[var69]);
                                        }
                                        if (field593[var69] == 4) {
                                            int var81 = (150 - field679[var69]) * (Statics.field914.method3409(var76) + 100) / 150;
                                            class88.method1806(field579 + var12 - 50, var13, field579 + var12 + 50, var13 + var32);
                                            Statics.field914.method3408(var76, field579 + var12 + 50 - var81, field580 + var13, var77, 0);
                                            class88.method1755(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field593[var69] == 5) {
                                            int var82 = 150 - field679[var69];
                                            int var83 = 0;
                                            if (var82 < 25) {
                                                var83 = var82 - 25;
                                            } else if (var82 > 125) {
                                                var83 = var82 - 125;
                                            }
                                            class88.method1806(var12, field580 + var13 - Statics.field914.field2783 - 1, var12 + var31, field580 + var13 + 5);
                                            Statics.field914.method3394(var76, field579 + var12, field580 + var13 + var83, var77, 0);
                                            class88.method1755(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field914.method3394(var76, field579 + var12, field580 + var13, 16776960, 0);
                                    }
                                }
                                if (field734 == 2) {
                                    method135((field495 - Statics.field333 << 7) + field681, (field493 - Statics.field141 << 7) + field496, field693 * 2);
                                    if (field579 > -1 && field481 % 20 < 10) {
                                        Statics.field8[0].method1665(field579 + var12 - 12, field580 + var13 - 28);
                                    }
                                }
                                ((class109) Statics.field1759).method2202(field551);
                                if (field584 == 1) {
                                    Statics.field814[field648 / 100].method1665(field548 - 8, field678 - 8);
                                }
                                if (field584 == 2) {
                                    Statics.field814[field648 / 100 + 4].method1665(field548 - 8, field678 - 8);
                                }
                                method41();
                                if (field542) {
                                    int var84 = var12 + 512 - 5;
                                    int var85 = var13 + 20;
                                    Statics.field351.method3393("Fps:" + field1319, var84, var85, 16776960, -1);
                                    int var242 = var85 + 15;
                                    Runtime var86 = Runtime.getRuntime();
                                    int var87 = (int) ((var86.totalMemory() - var86.freeMemory()) / 1024L);
                                    int var88 = 16776960;
                                    if (var87 > 32768 && field475) {
                                        var88 = 16711680;
                                    }
                                    if (var87 > 65536 && !field475) {
                                        var88 = 16711680;
                                    }
                                    Statics.field351.method3393("Mem:" + var87 + "k", var84, var242, var88, -1);
                                    var85 = var242 + 15;
                                }
                                Statics.field1804 = var52;
                                Statics.field70 = var53;
                                Statics.field755 = var54;
                                Statics.field2001 = var55;
                                Statics.field171 = var56;
                                if (field480) {
                                    byte var89 = 0;
                                    int var90 = class151.field2455 + class151.field2453 + var89;
                                    if (var90 == 0) {
                                        field480 = false;
                                    }
                                }
                                if (field480) {
                                    class88.method1761(var12, var13, var31, var32, 0);
                                    Statics.method208(class133.field2047, false);
                                }
                                if (!field480 && !field616 && var59 >= var12 && var59 < var12 + var31 && var60 >= var13 && var60 < var13 + var32) {
                                    if (field672 == 0 && !field630) {
                                        method56(class133.field2171, "", 23, 0, var59 - var12, var60 - var13);
                                    }
                                    int var92 = -1;
                                    for (int var93 = 0; var93 < class111.field1842; var93++) {
                                        int var94 = class111.field1898[var93];
                                        int var95 = var94 & 0x7F;
                                        int var96 = var94 >> 7 & 0x7F;
                                        int var97 = var94 >> 29 & 0x3;
                                        int var98 = var94 >> 14 & 0x7FFF;
                                        if (var92 != var94) {
                                            var92 = var94;
                                            if (var97 == 2 && Statics.field2020.method1866(Statics.field244, var95, var96, var94) >= 0) {
                                                class31 var99 = class31.method2662(var98);
                                                if (var99.field817 != null) {
                                                    var99 = var99.method657();
                                                }
                                                if (var99 == null) {
                                                    continue;
                                                }
                                                if (field672 == 1) {
                                                    method56(class133.field2121, field612 + " " + class2.field25 + " " + class2.method644(65535) + var99.field827, 1, var94, var95, var96);
                                                } else if (!field630) {
                                                    String[] var100 = var99.field844;
                                                    if (field724) {
                                                        var100 = method130(var100);
                                                    }
                                                    if (var100 != null) {
                                                        for (int var101 = 4; var101 >= 0; var101--) {
                                                            if (var100[var101] != null) {
                                                                short var102 = 0;
                                                                if (var101 == 0) {
                                                                    var102 = 3;
                                                                }
                                                                if (var101 == 1) {
                                                                    var102 = 4;
                                                                }
                                                                if (var101 == 2) {
                                                                    var102 = 5;
                                                                }
                                                                if (var101 == 3) {
                                                                    var102 = 6;
                                                                }
                                                                if (var101 == 4) {
                                                                    var102 = 1001;
                                                                }
                                                                method56(var100[var101], class2.method644(65535) + var99.field827, var102, var94, var95, var96);
                                                            }
                                                        }
                                                    }
                                                    method56(class133.field2182, class2.method644(65535) + var99.field827, 1002, var99.field838 << 14, var95, var96);
                                                } else if ((Statics.field756 & 0x4) == 4) {
                                                    method56(field632, field599 + " " + class2.field25 + " " + class2.method644(65535) + var99.field827, 2, var94, var95, var96);
                                                }
                                            }
                                            if (var97 == 1) {
                                                class24 var103 = field509[var98];
                                                if (var103.field386.field783 == 1 && (var103.field448 & 0x7F) == 64 && (var103.field410 & 0x7F) == 64) {
                                                    for (int var104 = 0; var104 < field510; var104++) {
                                                        class24 var105 = field509[field511[var104]];
                                                        if (var105 != null && var103 != var105 && var105.field386.field783 == 1 && var103.field448 == var105.field448 && var103.field410 == var105.field410) {
                                                            method122(var105.field386, field511[var104], var95, var96);
                                                        }
                                                    }
                                                    for (int var106 = 0; var106 < field576; var106++) {
                                                        class3 var107 = field660[field698[var106]];
                                                        if (var107 != null && var103.field448 == var107.field448 && var103.field410 == var107.field410) {
                                                            method2104(var107, field698[var106], var95, var96);
                                                        }
                                                    }
                                                }
                                                method122(var103.field386, var98, var95, var96);
                                            }
                                            if (var97 == 0) {
                                                class3 var108 = field660[var98];
                                                if ((var108.field448 & 0x7F) == 64 && (var108.field410 & 0x7F) == 64) {
                                                    for (int var109 = 0; var109 < field510; var109++) {
                                                        class24 var110 = field509[field511[var109]];
                                                        if (var110 != null && var110.field386.field783 == 1 && var108.field448 == var110.field448 && var108.field410 == var110.field410) {
                                                            method122(var110.field386, field511[var109], var95, var96);
                                                        }
                                                    }
                                                    for (int var111 = 0; var111 < field576; var111++) {
                                                        class3 var112 = field660[field698[var111]];
                                                        if (var112 != null && var108 != var112 && var108.field448 == var112.field448 && var108.field410 == var112.field410) {
                                                            method2104(var112, field698[var111], var95, var96);
                                                        }
                                                    }
                                                }
                                                method2104(var108, var98, var95, var96);
                                            }
                                            if (var97 == 3) {
                                                class175 var113 = field608[Statics.field244][var95][var96];
                                                if (var113 != null) {
                                                    for (class16 var114 = (class16) var113.method3309(); var114 != null; var114 = (class16) var113.method3311()) {
                                                        class39 var115 = class39.method2704(var114.field254);
                                                        if (field672 == 1) {
                                                            method56(class133.field2121, field612 + " " + class2.field25 + " " + class2.method644(16748608) + var115.field1026, 16, var114.field254, var95, var96);
                                                        } else if (!field630) {
                                                            String[] var116 = var115.field1001;
                                                            if (field724) {
                                                                var116 = method130(var116);
                                                            }
                                                            for (int var117 = 4; var117 >= 0; var117--) {
                                                                if (var116 != null && var116[var117] != null) {
                                                                    byte var118 = 0;
                                                                    if (var117 == 0) {
                                                                        var118 = 18;
                                                                    }
                                                                    if (var117 == 1) {
                                                                        var118 = 19;
                                                                    }
                                                                    if (var117 == 2) {
                                                                        var118 = 20;
                                                                    }
                                                                    if (var117 == 3) {
                                                                        var118 = 21;
                                                                    }
                                                                    if (var117 == 4) {
                                                                        var118 = 22;
                                                                    }
                                                                    method56(var116[var117], class2.method644(16748608) + var115.field1026, var118, var114.field254, var95, var96);
                                                                } else if (var117 == 2) {
                                                                    method56(class133.field2133, class2.method644(16748608) + var115.field1026, 20, var114.field254, var95, var96);
                                                                }
                                                            }
                                                            method56(class133.field2182, class2.method644(16748608) + var115.field1026, 1004, var114.field254, var95, var96);
                                                        } else if ((Statics.field756 & 0x1) == 1) {
                                                            method56(field632, field599 + " " + class2.field25 + " " + class2.method644(16748608) + var115.field1026, 17, var114.field254, var95, var96);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class88.method1755(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2518 == 1338) {
                                method614();
                                class88.method1755(var12, var13, Statics.field2757.field1468 + var12, Statics.field2757.field1473 + var13);
                                if (field708 == 2 || field708 == 5) {
                                    class88.method1780(var12 + 25, var13 + 5, 0, Statics.field54, Statics.field29);
                                } else {
                                    int var119 = field561 + field484 & 0x7FF;
                                    int var120 = Statics.field1033.field448 / 32 + 48;
                                    int var121 = 464 - Statics.field1033.field410 / 32;
                                    Statics.field1453.method1676(var12 + 25, var13 + 5, 146, 151, var120, var121, var119, field472 + 256, Statics.field54, Statics.field29);
                                    for (int var122 = 0; var122 < field701; var122++) {
                                        int var123 = field702[var122] * 4 + 2 - Statics.field1033.field448 / 32;
                                        int var124 = field703[var122] * 4 + 2 - Statics.field1033.field410 / 32;
                                        method802(var12, var13, var123, var124, field704[var122]);
                                    }
                                    for (int var125 = 0; var125 < 104; var125++) {
                                        for (int var126 = 0; var126 < 104; var126++) {
                                            class175 var127 = field608[Statics.field244][var125][var126];
                                            if (var127 != null) {
                                                int var128 = var125 * 4 + 2 - Statics.field1033.field448 / 32;
                                                int var129 = var126 * 4 + 2 - Statics.field1033.field410 / 32;
                                                method802(var12, var13, var128, var129, Statics.field1221[0]);
                                            }
                                        }
                                    }
                                    for (int var130 = 0; var130 < field510; var130++) {
                                        class24 var131 = field509[field511[var130]];
                                        if (var131 != null && var131.method16()) {
                                            class30 var132 = var131.field386;
                                            if (var132 != null && var132.field790 != null) {
                                                var132 = var132.method645();
                                            }
                                            if (var132 != null && var132.field798 && var132.field810) {
                                                int var133 = var131.field448 / 32 - Statics.field1033.field448 / 32;
                                                int var134 = var131.field410 / 32 - Statics.field1033.field410 / 32;
                                                method802(var12, var13, var133, var134, Statics.field1221[1]);
                                            }
                                        }
                                    }
                                    for (int var135 = 0; var135 < field576; var135++) {
                                        class3 var136 = field660[field698[var135]];
                                        if (var136 != null && var136.method16()) {
                                            int var137 = var136.field448 / 32 - Statics.field1033.field448 / 32;
                                            int var138 = var136.field410 / 32 - Statics.field1033.field410 / 32;
                                            boolean var139 = false;
                                            if (method107(var136.field51)) {
                                                var139 = true;
                                            }
                                            boolean var140 = false;
                                            if (Statics.field1033.field40 != 0 && var136.field40 != 0 && Statics.field1033.field40 == var136.field40) {
                                                var140 = true;
                                            }
                                            if (var139) {
                                                method802(var12, var13, var137, var138, Statics.field1221[3]);
                                            } else if (var140) {
                                                method802(var12, var13, var137, var138, Statics.field1221[4]);
                                            } else {
                                                method802(var12, var13, var137, var138, Statics.field1221[2]);
                                            }
                                        }
                                    }
                                    if (field734 != 0 && field481 % 20 < 10) {
                                        if (field734 == 1 && field490 >= 0 && field490 < field509.length) {
                                            class24 var141 = field509[field490];
                                            if (var141 != null) {
                                                int var142 = var141.field448 / 32 - Statics.field1033.field448 / 32;
                                                int var143 = var141.field410 / 32 - Statics.field1033.field410 / 32;
                                                method164(var12, var13, var142, var143, Statics.field241[1]);
                                            }
                                        }
                                        if (field734 == 2) {
                                            int var144 = field495 * 4 - Statics.field333 * 4 + 2 - Statics.field1033.field448 / 32;
                                            int var145 = field493 * 4 - Statics.field141 * 4 + 2 - Statics.field1033.field410 / 32;
                                            method164(var12, var13, var144, var145, Statics.field241[1]);
                                        }
                                        if (field734 == 10 && field649 >= 0 && field649 < field660.length) {
                                            class3 var146 = field660[field649];
                                            if (var146 != null) {
                                                int var147 = var146.field448 / 32 - Statics.field1033.field448 / 32;
                                                int var148 = var146.field410 / 32 - Statics.field1033.field410 / 32;
                                                method164(var12, var13, var147, var148, Statics.field241[1]);
                                            }
                                        }
                                    }
                                    if (field705 != 0) {
                                        int var149 = field705 * 4 + 2 - Statics.field1033.field448 / 32;
                                        int var150 = field706 * 4 + 2 - Statics.field1033.field410 / 32;
                                        method802(var12, var13, var149, var150, Statics.field241[0]);
                                    }
                                    class88.method1761(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field708 < 3) {
                                    Statics.field928.method1676(var12, var13, 33, 33, 25, 25, field561, 256, Statics.field1737, Statics.field257);
                                } else {
                                    class88.method1780(var12, var13, 0, Statics.field1737, Statics.field257);
                                }
                                if (field553[var11]) {
                                    Statics.field2757.method1742(var12, var13);
                                }
                                field582[var11] = true;
                                class88.method1755(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var151 = class76.field1389;
                        int var152 = class76.field1390;
                        if (!field616 && var151 >= var19 && var152 >= var20 && var151 < var21 && var152 < var22) {
                            method172(var10, var151 - var12, var152 - var13);
                        }
                        if (var10.field2587 == 0) {
                            if (!var10.field2513 && method170(var10) && Statics.field1259 != var10) {
                                continue;
                            }
                            if (!var10.field2513) {
                                if (var10.field2528 > var10.field2530 - var10.field2524) {
                                    var10.field2528 = var10.field2530 - var10.field2524;
                                }
                                if (var10.field2528 < 0) {
                                    var10.field2528 = 0;
                                }
                            }
                            method1822(arg0, var10.field2514, var19, var20, var21, var22, var12 - var10.field2527, var13 - var10.field2528, var11);
                            if (var10.field2622 != null) {
                                method1822(var10.field2622, var10.field2514, var19, var20, var21, var22, var12 - var10.field2527, var13 - var10.field2528, var11);
                            }
                            class4 var153 = (class4) field712.method3281((long) var10.field2514);
                            if (var153 != null) {
                                if (var153.field66 == 0 && class76.field1389 >= var19 && class76.field1390 >= var20 && class76.field1389 < var21 && class76.field1390 < var22 && !field616 && !field643) {
                                    field477[0] = class133.field2254;
                                    field623[0] = "";
                                    field620[0] = 1006;
                                    field617 = 1;
                                }
                                method1182(var153.field59, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class88.method1755(arg2, arg3, arg4, arg5);
                            class103.method2106();
                        }
                        if (field553[var11] || field684 > 1) {
                            if (var10.field2587 == 0 && !var10.field2513 && var10.field2530 > var10.field2524) {
                                method150(var10.field2523 + var12, var13, var10.field2528, var10.field2524, var10.field2530);
                            }
                            if (var10.field2587 != 1) {
                                if (var10.field2587 == 2) {
                                    int var154 = 0;
                                    for (int var155 = 0; var155 < var10.field2524; var155++) {
                                        for (int var156 = 0; var156 < var10.field2523; var156++) {
                                            int var157 = (var10.field2566 + 32) * var156 + var12;
                                            int var158 = (var10.field2568 + 32) * var155 + var13;
                                            if (var154 < 20) {
                                                var157 += var10.field2569[var154];
                                                var158 += var10.field2631[var154];
                                            }
                                            if (var10.field2616[var154] > 0) {
                                                boolean var159 = false;
                                                boolean var160 = false;
                                                int var161 = var10.field2616[var154] - 1;
                                                if (var157 + 32 > arg2 && var157 < arg4 && var158 + 32 > arg3 && var158 < arg5 || Statics.field86 == var10 && field587 == var154) {
                                                    class85 var162;
                                                    if (field672 == 1 && Statics.field39 == var154 && Statics.field65 == var10.field2514) {
                                                        var162 = class39.method1577(var161, var10.field2617[var154], 2, 0, false);
                                                    } else {
                                                        var162 = class39.method1577(var161, var10.field2617[var154], 1, 3153952, false);
                                                    }
                                                    if (var162 == null) {
                                                        method2103(var10);
                                                    } else if (Statics.field86 == var10 && field587 == var154) {
                                                        int var163 = class76.field1389 - field581;
                                                        int var164 = class76.field1390 - field589;
                                                        if (var163 < 5 && var163 > -5) {
                                                            var163 = 0;
                                                        }
                                                        if (var164 < 5 && var164 > -5) {
                                                            var164 = 0;
                                                        }
                                                        if (field601 < 5) {
                                                            var163 = 0;
                                                            var164 = 0;
                                                        }
                                                        var162.method1683(var157 + var163, var158 + var164, 128);
                                                        if (arg1 != -1) {
                                                            class156 var165 = arg0[arg1 & 0xFFFF];
                                                            if (var158 + var164 < class88.field1478 && var165.field2528 > 0) {
                                                                int var166 = field551 * (class88.field1478 - var158 - var164) / 3;
                                                                if (var166 > field551 * 10) {
                                                                    var166 = field551 * 10;
                                                                }
                                                                if (var166 > var165.field2528) {
                                                                    var166 = var165.field2528;
                                                                }
                                                                var165.field2528 -= var166;
                                                                field589 += var166;
                                                                method2103(var165);
                                                            }
                                                            if (var158 + var164 + 32 > class88.field1479 && var165.field2528 < var165.field2530 - var165.field2524) {
                                                                int var167 = field551 * (var158 + var164 + 32 - class88.field1479) / 3;
                                                                if (var167 > field551 * 10) {
                                                                    var167 = field551 * 10;
                                                                }
                                                                if (var167 > var165.field2530 - var165.field2524 - var165.field2528) {
                                                                    var167 = var165.field2530 - var165.field2524 - var165.field2528;
                                                                }
                                                                var165.field2528 += var167;
                                                                field589 -= var167;
                                                                method2103(var165);
                                                            }
                                                        }
                                                    } else if (Statics.field405 == var10 && field586 == var154) {
                                                        var162.method1683(var157, var158, 128);
                                                    } else {
                                                        var162.method1665(var157, var158);
                                                    }
                                                }
                                            } else if (var10.field2571 != null && var154 < 20) {
                                                class85 var168 = var10.method3087(var154);
                                                if (var168 != null) {
                                                    var168.method1665(var157, var158);
                                                } else if (class156.field2512) {
                                                    method2103(var10);
                                                }
                                            }
                                            var154++;
                                        }
                                    }
                                } else if (var10.field2587 == 3) {
                                    int var169;
                                    if (method149(var10)) {
                                        var169 = var10.field2532;
                                        if (Statics.field1259 == var10 && var10.field2573 != 0) {
                                            var169 = var10.field2573;
                                        }
                                    } else {
                                        var169 = var10.field2545;
                                        if (Statics.field1259 == var10 && var10.field2533 != 0) {
                                            var169 = var10.field2533;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2556) {
                                            class88.method1761(var12, var13, var10.field2523, var10.field2524, var169);
                                        } else {
                                            class88.method1763(var12, var13, var10.field2523, var10.field2524, var169);
                                        }
                                    } else if (var10.field2556) {
                                        class88.method1760(var12, var13, var10.field2523, var10.field2524, var169, 256 - (var14 & 0xFF));
                                    } else {
                                        class88.method1752(var12, var13, var10.field2523, var10.field2524, var169, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2587 == 4) {
                                    class181 var170 = var10.method3086();
                                    if (var170 != null) {
                                        String var171 = var10.field2581;
                                        int var172;
                                        if (method149(var10)) {
                                            var172 = var10.field2532;
                                            if (Statics.field1259 == var10 && var10.field2573 != 0) {
                                                var172 = var10.field2573;
                                            }
                                            if (var10.field2562.length() > 0) {
                                                var171 = var10.field2562;
                                            }
                                        } else {
                                            var172 = var10.field2545;
                                            if (Statics.field1259 == var10 && var10.field2533 != 0) {
                                                var172 = var10.field2533;
                                            }
                                        }
                                        if (var10.field2513 && var10.field2618 != -1) {
                                            class39 var173 = class39.method2704(var10.field2618);
                                            var171 = var173.field1026;
                                            if (var171 == null) {
                                                var171 = "null";
                                            }
                                            if ((var173.field998 == 1 || var10.field2584 != 1) && var10.field2584 != -1) {
                                                String var174 = class2.method644(16748608) + var171 + class2.field28 + " " + 'x';
                                                int var175 = var10.field2584;
                                                String var176 = Integer.toString(var175);
                                                for (int var177 = var176.length() - 3; var177 > 0; var177 -= 3) {
                                                    var176 = var176.substring(0, var177) + class2.field22 + var176.substring(var177);
                                                }
                                                String var178;
                                                StringBuilder var10000;
                                                class133 var10001;
                                                if (var176.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method644(65408)).append(var176.substring(0, var176.length() - 8));
                                                    var10001 = (class133) null;
                                                    var178 = var10000.append(class133.field2192).append(" ").append(class2.field24).append(var176).append(class2.field30).append(class2.field28).toString();
                                                } else if (var176.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method644(16777215)).append(var176.substring(0, var176.length() - 4));
                                                    var10001 = (class133) null;
                                                    var178 = var10000.append(class133.field2194).append(" ").append(class2.field24).append(var176).append(class2.field30).append(class2.field28).toString();
                                                } else {
                                                    var178 = " " + class2.method644(16776960) + var176 + class2.field28;
                                                }
                                                var171 = var174 + var178;
                                            }
                                        }
                                        if (field638 == var10) {
                                            class133 var243 = (class133) null;
                                            var171 = class133.field2189;
                                            var172 = var10.field2545;
                                        }
                                        if (!var10.field2513) {
                                            var171 = method37(var171, var10);
                                        }
                                        var170.method3395(var171, var12, var13, var10.field2523, var10.field2524, var172, var10.field2557 ? 0 : -1, var10.field2561, var10.field2574, var10.field2563);
                                    } else if (class156.field2512) {
                                        method2103(var10);
                                    }
                                } else if (var10.field2587 == 5) {
                                    if (var10.field2513) {
                                        class85 var180;
                                        if (var10.field2618 == -1) {
                                            var180 = var10.method3085(false);
                                        } else {
                                            var180 = class39.method1577(var10.field2618, var10.field2584, var10.field2542, var10.field2543, false);
                                        }
                                        if (var180 != null) {
                                            int var181 = var180.field1459;
                                            int var182 = var180.field1458;
                                            if (var10.field2614) {
                                                class88.method1806(var12, var13, var10.field2523 + var12, var10.field2524 + var13);
                                                int var183 = (var10.field2523 + (var181 - 1)) / var181;
                                                int var184 = (var10.field2524 + (var182 - 1)) / var182;
                                                for (int var185 = 0; var185 < var183; var185++) {
                                                    for (int var186 = 0; var186 < var184; var186++) {
                                                        if (var10.field2608 != 0) {
                                                            var180.method1678(var181 / 2 + var181 * var185 + var12, var182 / 2 + var182 * var186 + var13, var10.field2608, 4096);
                                                        } else if (var14 == 0) {
                                                            var180.method1665(var181 * var185 + var12, var182 * var186 + var13);
                                                        } else {
                                                            var180.method1683(var181 * var185 + var12, var182 * var186 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class88.method1755(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var187 = var10.field2523 * 4096 / var181;
                                                if (var10.field2608 != 0) {
                                                    var180.method1678(var10.field2523 / 2 + var12, var10.field2524 / 2 + var13, var10.field2608, var187);
                                                } else if (var14 != 0) {
                                                    var180.method1737(var12, var13, var10.field2523, var10.field2524, 256 - (var14 & 0xFF));
                                                } else if (var10.field2523 == var181 && var10.field2524 == var182) {
                                                    var180.method1665(var12, var13);
                                                } else {
                                                    var180.method1669(var12, var13, var10.field2523, var10.field2524);
                                                }
                                            }
                                        } else if (class156.field2512) {
                                            method2103(var10);
                                        }
                                    } else {
                                        class85 var179 = var10.method3085(method149(var10));
                                        if (var179 != null) {
                                            var179.method1665(var12, var13);
                                        } else if (class156.field2512) {
                                            method2103(var10);
                                        }
                                    }
                                } else if (var10.field2587 == 6) {
                                    boolean var188 = method149(var10);
                                    int var189;
                                    if (var188) {
                                        var189 = var10.field2511;
                                    } else {
                                        var189 = var10.field2550;
                                    }
                                    class111 var190 = null;
                                    int var191 = 0;
                                    if (var10.field2618 != -1) {
                                        class39 var192 = class39.method2704(var10.field2618);
                                        if (var192 != null) {
                                            class39 var193 = var192.method831(var10.field2584);
                                            var190 = var193.method849(1);
                                            if (var190 == null) {
                                                method2103(var10);
                                            } else {
                                                var190.method2219();
                                                var191 = var190.field1537 / 2;
                                            }
                                        }
                                    } else if (var10.field2546 == 5) {
                                        if (var10.field2519 == 0) {
                                            var190 = field732.method3165((class33) null, -1, (class33) null, -1);
                                        } else {
                                            var190 = Statics.field1033.method15();
                                        }
                                    } else if (var189 == -1) {
                                        var190 = var10.method3125((class33) null, -1, var188, Statics.field1033.field36);
                                        if (var190 == null && class156.field2512) {
                                            method2103(var10);
                                        }
                                    } else {
                                        class33 var194 = class33.method2674(var189);
                                        var190 = var10.method3125(var194, var10.field2620, var188, Statics.field1033.field36);
                                        if (var190 == null && class156.field2512) {
                                            method2103(var10);
                                        }
                                    }
                                    class103.method2116(var10.field2523 / 2 + var12, var10.field2524 / 2 + var13);
                                    int var195 = var10.field2570 * class103.field1757[var10.field2554] >> 16;
                                    int var196 = var10.field2570 * class103.field1746[var10.field2554] >> 16;
                                    if (var190 != null) {
                                        if (var10.field2513) {
                                            var190.method2219();
                                            if (var10.field2619) {
                                                var190.method2232(0, var10.field2508, var10.field2516, var10.field2554, var10.field2552, var10.field2553 + var191 + var195, var10.field2553 + var196, var10.field2570);
                                            } else {
                                                var190.method2231(0, var10.field2508, var10.field2516, var10.field2554, var10.field2552, var10.field2553 + var191 + var195, var10.field2553 + var196);
                                            }
                                        } else {
                                            var190.method2231(0, var10.field2508, 0, var10.field2554, 0, var195, var196);
                                        }
                                    }
                                    class103.method2108();
                                } else {
                                    if (var10.field2587 == 7) {
                                        class181 var197 = var10.method3086();
                                        if (var197 == null) {
                                            if (class156.field2512) {
                                                method2103(var10);
                                            }
                                            continue;
                                        }
                                        int var198 = 0;
                                        for (int var199 = 0; var199 < var10.field2524; var199++) {
                                            for (int var200 = 0; var200 < var10.field2523; var200++) {
                                                if (var10.field2616[var198] > 0) {
                                                    class39 var201 = class39.method2704(var10.field2616[var198] - 1);
                                                    String var202;
                                                    if (var201.field998 != 1 && var10.field2617[var198] == 1) {
                                                        var202 = class2.method644(16748608) + var201.field1026 + class2.field28;
                                                    } else {
                                                        String var203 = class2.method644(16748608) + var201.field1026 + class2.field28 + " " + 'x';
                                                        int var204 = var10.field2617[var198];
                                                        String var205 = Integer.toString(var204);
                                                        for (int var206 = var205.length() - 3; var206 > 0; var206 -= 3) {
                                                            var205 = var205.substring(0, var206) + class2.field22 + var205.substring(var206);
                                                        }
                                                        String var207;
                                                        if (var205.length() > 9) {
                                                            var207 = " " + class2.method644(65408) + var205.substring(0, var205.length() - 8) + class133.field2192 + " " + class2.field24 + var205 + class2.field30 + class2.field28;
                                                        } else if (var205.length() > 6) {
                                                            var207 = " " + class2.method644(16777215) + var205.substring(0, var205.length() - 4) + class133.field2194 + " " + class2.field24 + var205 + class2.field30 + class2.field28;
                                                        } else {
                                                            var207 = " " + class2.method644(16776960) + var205 + class2.field28;
                                                        }
                                                        var202 = var203 + var207;
                                                    }
                                                    int var208 = (var10.field2566 + 115) * var200 + var12;
                                                    int var209 = (var10.field2568 + 12) * var199 + var13;
                                                    if (var10.field2561 == 0) {
                                                        var197.method3408(var202, var208, var209, var10.field2545, var10.field2557 ? 0 : -1);
                                                    } else if (var10.field2561 == 1) {
                                                        var197.method3394(var202, var10.field2523 / 2 + var208, var209, var10.field2545, var10.field2557 ? 0 : -1);
                                                    } else {
                                                        var197.method3393(var202, var10.field2523 + var208 - 1, var209, var10.field2545, var10.field2557 ? 0 : -1);
                                                    }
                                                }
                                                var198++;
                                            }
                                        }
                                    }
                                    if (var10.field2587 == 8 && Statics.field467 == var10 && field626 == field483) {
                                        int var210 = 0;
                                        int var211 = 0;
                                        class181 var212 = Statics.field351;
                                        String var213 = var10.field2581;
                                        String var214 = method37(var213, var10);
                                        while (var214.length() > 0) {
                                            int var215 = var214.indexOf(class2.field21);
                                            String var216;
                                            if (var215 == -1) {
                                                var216 = var214;
                                                var214 = "";
                                            } else {
                                                var216 = var214.substring(0, var215);
                                                var214 = var214.substring(var215 + 4);
                                            }
                                            int var217 = var212.method3409(var216);
                                            if (var217 > var210) {
                                                var210 = var217;
                                            }
                                            var211 += var212.field2783 + 1;
                                        }
                                        var210 += 6;
                                        var211 += 7;
                                        int var218 = var10.field2523 + var12 - 5 - var210;
                                        int var219 = var10.field2524 + var13 + 5;
                                        if (var218 < var12 + 5) {
                                            var218 = var12 + 5;
                                        }
                                        if (var210 + var218 > arg4) {
                                            var218 = arg4 - var210;
                                        }
                                        if (var211 + var219 > arg5) {
                                            var219 = arg5 - var211;
                                        }
                                        class88.method1761(var218, var219, var210, var211, 16777120);
                                        class88.method1763(var218, var219, var210, var211, 0);
                                        String var220 = var10.field2581;
                                        int var221 = var212.field2783 + var219 + 2;
                                        String var222 = method37(var220, var10);
                                        while (var222.length() > 0) {
                                            int var223 = var222.indexOf(class2.field21);
                                            String var224;
                                            if (var223 == -1) {
                                                var224 = var222;
                                                var222 = "";
                                            } else {
                                                var224 = var222.substring(0, var223);
                                                var222 = var222.substring(var223 + 4);
                                            }
                                            var212.method3408(var224, var218 + 3, var221, 0, -1);
                                            var221 += var212.field2783 + 1;
                                        }
                                    }
                                    if (var10.field2587 == 9) {
                                        if (var10.field2559 == 1) {
                                            class88.method1769(var12, var13, var10.field2523 + var12, var10.field2524 + var13, var10.field2545);
                                        } else {
                                            int var225 = var10.field2523 >= 0 ? var10.field2523 : -var10.field2523;
                                            int var226 = var10.field2524 >= 0 ? var10.field2524 : -var10.field2524;
                                            int var227 = var225;
                                            if (var225 < var226) {
                                                var227 = var226;
                                            }
                                            if (var227 != 0) {
                                                int var228 = (var10.field2523 << 16) / var227;
                                                int var229 = (var10.field2524 << 16) / var227;
                                                if (var229 <= var228) {
                                                    var228 = -var228;
                                                } else {
                                                    var229 = -var229;
                                                }
                                                int var230 = var10.field2559 * var229 >> 17;
                                                int var231 = var10.field2559 * var229 + 1 >> 17;
                                                int var232 = var10.field2559 * var228 >> 17;
                                                int var233 = var10.field2559 * var228 + 1 >> 17;
                                                int var234 = var12 + var230;
                                                int var235 = var12 - var231;
                                                int var236 = var10.field2523 + var12 - var231;
                                                int var237 = var10.field2523 + var12 + var230;
                                                int var238 = var13 + var232;
                                                int var239 = var13 - var233;
                                                int var240 = var10.field2524 + var13 - var233;
                                                int var241 = var10.field2524 + var13 + var232;
                                                class103.method2114(var234, var235, var236);
                                                class103.method2117(var238, var239, var240, var234, var235, var236, var10.field2545);
                                                class103.method2114(var234, var236, var237);
                                                class103.method2117(var238, var240, var241, var234, var236, var237, var10.field2545);
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

    @ObfuscatedName("i.cm(Ljava/lang/String;Lem;I)Ljava/lang/String;")
    public static String method37(String arg0, class156 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2174(arg1, var2 - 1);
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
                if (Statics.field408 != null) {
                    int var9 = Statics.field408.field1409;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field408.field1411 != null) {
                        var8 = (String) Statics.field408.field1411;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("d.ci(Lem;IIIIIII)V")
    public static final void method126(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field558) {
            field491 = 32;
        } else {
            field491 = 0;
        }
        field558 = false;
        if (class76.field1383 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2528 -= 4;
                method2103(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2528 += 4;
                method2103(arg0);
            } else if (arg5 >= arg1 - field491 && arg5 < field491 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2528 = (arg4 - arg3) * var8 / var9;
                method2103(arg0);
                field558 = true;
            }
        }
        if (field715 == 0) {
            return;
        }
        int var10 = arg0.field2523;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2528 += field715 * 45;
            method2103(arg0);
        }
    }

    @ObfuscatedName("u.cs(IIIIII)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1202[0].method1742(arg0, arg1);
        Statics.field1202[1].method1742(arg0, arg1 + arg3 - 16);
        class88.method1761(arg0, arg1 + 16, 16, arg3 - 32, field554);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class88.method1761(arg0, arg1 + 16 + var6, 16, var5, field555);
        class88.method1805(arg0, arg1 + 16 + var6, var5, field694);
        class88.method1805(arg0 + 1, arg1 + 16 + var6, var5, field694);
        class88.method1770(arg0, arg1 + 16 + var6, 16, field694);
        class88.method1770(arg0, arg1 + 17 + var6, 16, field694);
        class88.method1805(arg0 + 15, arg1 + 16 + var6, var5, field556);
        class88.method1805(arg0 + 14, arg1 + 17 + var6, var5 - 1, field556);
        class88.method1770(arg0, arg1 + 15 + var6 + var5, 16, field556);
        class88.method1770(arg0 + 1, arg1 + 14 + var6 + var5, 15, field556);
    }

    @ObfuscatedName("u.cr(Lem;I)Z")
    public static final boolean method149(class156 arg0) {
        if (arg0.field2611 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2611.length; var1++) {
            int var2 = method2174(arg0, var1);
            int var3 = arg0.field2567[var1];
            if (arg0.field2611[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2611[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2611[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ca.ct(Lem;II)I")
    public static final int method2174(class156 arg0, int arg1) {
        if (arg0.field2610 == null || arg1 >= arg0.field2610.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2610[arg1];
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
                    var7 = field522[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field613[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field727[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class156 var11 = class156.method2431(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class39.method2704(var12).field1019 || field474)) {
                        for (int var13 = 0; var13 < var11.field2616.length; var13++) {
                            if (var12 + 1 == var11.field2616[var13]) {
                                var7 += var11.field2617[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2634[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class129.field2011[field613[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2634[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1033.field44;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class129.field2012[var14]) {
                            var7 += field613[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class156 var17 = class156.method2431(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class39.method2704(var18).field1019 || field474)) {
                        for (int var19 = 0; var19 < var17.field2616.length; var19++) {
                            if (var18 + 1 == var17.field2616[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field639;
                }
                if (var6 == 12) {
                    var7 = field640;
                }
                if (var6 == 13) {
                    int var20 = class157.field2634[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method3063(var22);
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
                    var7 = (Statics.field1033.field448 >> 7) + Statics.field333;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1033.field410 >> 7) + Statics.field141;
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

    @ObfuscatedName("q.co(Lem;III)V")
    public static final void method172(class156 arg0, int arg1, int arg2) {
        if (arg0.field2517 == 1) {
            method56(arg0.field2615, "", 24, 0, 0, arg0.field2514);
        }
        if (arg0.field2517 == 2 && !field630) {
            String var3 = method3227(arg0);
            if (var3 != null) {
                method56(var3, class2.method644(65280) + arg0.field2541, 25, 0, -1, arg0.field2514);
            }
        }
        if (arg0.field2517 == 3) {
            method56(class133.field2098, "", 26, 0, 0, arg0.field2514);
        }
        if (arg0.field2517 == 4) {
            method56(arg0.field2615, "", 28, 0, 0, arg0.field2514);
        }
        if (arg0.field2517 == 5) {
            method56(arg0.field2615, "", 29, 0, 0, arg0.field2514);
        }
        if (arg0.field2517 == 6 && field638 == null) {
            method56(arg0.field2615, "", 30, 0, -1, arg0.field2514);
        }
        if (arg0.field2587 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2524; var5++) {
                for (int var6 = 0; var6 < arg0.field2523; var6++) {
                    int var7 = (arg0.field2566 + 32) * var6;
                    int var8 = (arg0.field2568 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2569[var4];
                        var8 += arg0.field2631[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field642 = var4;
                        Statics.field2316 = arg0;
                        if (arg0.field2616[var4] > 0) {
                            label340: {
                                class39 var9 = class39.method2704(arg0.field2616[var4] - 1);
                                if (field672 == 1) {
                                    int var10 = method883(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field65 != arg0.field2514 || Statics.field39 != var4) {
                                            method56(class133.field2121, field612 + " " + class2.field25 + " " + class2.method644(16748608) + var9.field1026, 31, var9.field1007, var4, arg0.field2514);
                                        }
                                        break label340;
                                    }
                                }
                                if (field630) {
                                    int var12 = method883(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field756 & 0x10) == 16) {
                                            method56(field632, field599 + " " + class2.field25 + " " + class2.method644(16748608) + var9.field1026, 32, var9.field1007, var4, arg0.field2514);
                                        }
                                        break label340;
                                    }
                                }
                                String[] var14 = var9.field1002;
                                if (field724) {
                                    var14 = method130(var14);
                                }
                                int var15 = method883(arg0);
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
                                            method56(var14[var17], class2.method644(16748608) + var9.field1026, var18, var9.field1007, var4, arg0.field2514);
                                        } else if (var17 == 4) {
                                            method56(class133.field2042, class2.method644(16748608) + var9.field1026, 37, var9.field1007, var4, arg0.field2514);
                                        }
                                    }
                                }
                                int var19 = method883(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method56(class133.field2121, class2.method644(16748608) + var9.field1026, 38, var9.field1007, var4, arg0.field2514);
                                }
                                int var21 = method883(arg0);
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
                                            method56(var14[var23], class2.method644(16748608) + var9.field1026, var24, var9.field1007, var4, arg0.field2514);
                                        }
                                    }
                                }
                                String[] var25 = arg0.field2572;
                                if (field724) {
                                    var25 = method130(var25);
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
                                            method56(var25[var26], class2.method644(16748608) + var9.field1026, var27, var9.field1007, var4, arg0.field2514);
                                        }
                                    }
                                }
                                method56(class133.field2182, class2.method644(16748608) + var9.field1026, 1005, var9.field1007, var4, arg0.field2514);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2513) {
            return;
        }
        if (field630) {
            int var28 = method883(arg0);
            boolean var29 = (var28 >> 21 & 0x1) != 0;
            if (var29 && (Statics.field756 & 0x20) == 32) {
                method56(field632, field599 + " " + class2.field25 + " " + arg0.field2535, 58, 0, arg0.field2534, arg0.field2514);
            }
            return;
        }
        for (int var30 = 9; var30 >= 5; var30--) {
            int var31 = method883(arg0);
            boolean var32 = (var31 >> var30 + 1 & 0x1) != 0;
            String var33;
            if (!var32 && arg0.field2578 == null) {
                var33 = null;
            } else if (arg0.field2575 == null || arg0.field2575.length <= var30 || arg0.field2575[var30] == null || arg0.field2575[var30].trim().length() == 0) {
                var33 = null;
            } else {
                var33 = arg0.field2575[var30];
            }
            if (var33 != null) {
                method56(var33, arg0.field2535, 1007, var30 + 1, arg0.field2534, arg0.field2514);
            }
        }
        String var35 = method3227(arg0);
        if (var35 != null) {
            method56(var35, arg0.field2535, 25, 0, arg0.field2534, arg0.field2514);
        }
        for (int var36 = 4; var36 >= 0; var36--) {
            int var37 = method883(arg0);
            boolean var38 = (var37 >> var36 + 1 & 0x1) != 0;
            String var39;
            if (!var38 && arg0.field2578 == null) {
                var39 = null;
            } else if (arg0.field2575 == null || arg0.field2575.length <= var36 || arg0.field2575[var36] == null || arg0.field2575[var36].trim().length() == 0) {
                var39 = null;
            } else {
                var39 = arg0.field2575[var36];
            }
            if (var39 != null) {
                method56(var39, arg0.field2535, 57, var36 + 1, arg0.field2534, arg0.field2514);
            }
        }
        if (class160.method870(method883(arg0))) {
            method56(class133.field2185, "", 30, 0, arg0.field2534, arg0.field2514);
        }
    }

    @ObfuscatedName("aj.cf(IIIIIIII)V")
    public static final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class156.method132(arg0)) {
            method2320(Statics.field2537[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dg.cd([Lem;IIIIIIII)V")
    public static final void method2320(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class156 var9 = arg0[var8];
            if (var9 != null && (!var9.field2513 || var9.field2587 == 0 || var9.field2595 || method883(var9) != 0 || field646 == var9) && var9.field2525 == arg1 && (!var9.field2513 || !method170(var9))) {
                int var10 = var9.field2549 + arg6;
                int var11 = var9.field2520 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2587 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2587 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2523 + var10;
                    int var19 = var9.field2524 + var11;
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
                    int var22 = var9.field2523 + var10;
                    int var23 = var9.field2524 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field489 == var9) {
                    field653 = true;
                    field654 = var10;
                    field622 = var11;
                }
                if (!var9.field2513 || var12 < var14 && var13 < var15) {
                    if (var9.field2518 == 1337) {
                        method2103(var9);
                    } else if (var9.field2518 == 1338) {
                        method3358(var10, var11);
                    } else {
                        if (var9.field2587 == 0) {
                            if (!var9.field2513 && method170(var9) && Statics.field1259 != var9) {
                                continue;
                            }
                            method2320(arg0, var9.field2514, var12, var13, var14, var15, var10 - var9.field2527, var11 - var9.field2528);
                            if (var9.field2622 != null) {
                                method2320(var9.field2622, var9.field2514, var12, var13, var14, var15, var10 - var9.field2527, var11 - var9.field2528);
                            }
                            class4 var24 = (class4) field712.method3281((long) var9.field2514);
                            if (var24 != null) {
                                method628(var24.field59, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2513) {
                            boolean var25;
                            if (class76.field1389 >= var12 && class76.field1390 >= var13 && class76.field1389 < var14 && class76.field1390 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class76.field1383 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class76.field1385 == 1 && class76.field1393 >= var12 && class76.field1397 >= var13 && class76.field1393 < var14 && class76.field1397 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                method3077(var9, class76.field1393 - var10, class76.field1397 - var11);
                            }
                            if (field489 != null && field489 != var9 && var25) {
                                int var28 = method883(var9);
                                boolean var29 = (var28 >> 20 & 0x1) != 0;
                                if (var29) {
                                    field536 = var9;
                                }
                            }
                            if (field646 == var9) {
                                field607 = true;
                                field651 = var10;
                                field652 = var11;
                            }
                            if (var9.field2595) {
                                if (var25 && field715 != 0 && var9.field2601 != null) {
                                    class1 var30 = new class1();
                                    var30.field15 = var9;
                                    var30.field4 = field715;
                                    var30.field13 = var9.field2601;
                                    field588.method3303(var30);
                                }
                                if (field489 != null || Statics.field86 != null || field616) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2624 && var27) {
                                    var9.field2624 = true;
                                    if (var9.field2583 != null) {
                                        class1 var31 = new class1();
                                        var31.field15 = var9;
                                        var31.field3 = class76.field1393 - var10;
                                        var31.field4 = class76.field1397 - var11;
                                        var31.field13 = var9.field2583;
                                        field588.method3303(var31);
                                    }
                                }
                                if (var9.field2624 && var26 && var9.field2602 != null) {
                                    class1 var32 = new class1();
                                    var32.field15 = var9;
                                    var32.field3 = class76.field1389 - var10;
                                    var32.field4 = class76.field1390 - var11;
                                    var32.field13 = var9.field2602;
                                    field588.method3303(var32);
                                }
                                if (var9.field2624 && !var26) {
                                    var9.field2624 = false;
                                    if (var9.field2585 != null) {
                                        class1 var33 = new class1();
                                        var33.field15 = var9;
                                        var33.field3 = class76.field1389 - var10;
                                        var33.field4 = class76.field1390 - var11;
                                        var33.field13 = var9.field2585;
                                        field714.method3303(var33);
                                    }
                                }
                                if (var26 && var9.field2586 != null) {
                                    class1 var34 = new class1();
                                    var34.field15 = var9;
                                    var34.field3 = class76.field1389 - var10;
                                    var34.field4 = class76.field1390 - var11;
                                    var34.field13 = var9.field2586;
                                    field588.method3303(var34);
                                }
                                if (!var9.field2623 && var25) {
                                    var9.field2623 = true;
                                    if (var9.field2580 != null) {
                                        class1 var35 = new class1();
                                        var35.field15 = var9;
                                        var35.field3 = class76.field1389 - var10;
                                        var35.field4 = class76.field1390 - var11;
                                        var35.field13 = var9.field2580;
                                        field588.method3303(var35);
                                    }
                                }
                                if (var9.field2623 && var25 && var9.field2588 != null) {
                                    class1 var36 = new class1();
                                    var36.field15 = var9;
                                    var36.field3 = class76.field1389 - var10;
                                    var36.field4 = class76.field1390 - var11;
                                    var36.field13 = var9.field2588;
                                    field588.method3303(var36);
                                }
                                if (var9.field2623 && !var25) {
                                    var9.field2623 = false;
                                    if (var9.field2589 != null) {
                                        class1 var37 = new class1();
                                        var37.field15 = var9;
                                        var37.field3 = class76.field1389 - var10;
                                        var37.field4 = class76.field1390 - var11;
                                        var37.field13 = var9.field2589;
                                        field714.method3303(var37);
                                    }
                                }
                                if (var9.field2600 != null) {
                                    class1 var38 = new class1();
                                    var38.field15 = var9;
                                    var38.field13 = var9.field2600;
                                    field598.method3303(var38);
                                }
                                if (var9.field2594 != null && field659 > var9.field2506) {
                                    if (var9.field2531 == null || field659 - var9.field2506 > 32) {
                                        class1 var43 = new class1();
                                        var43.field15 = var9;
                                        var43.field13 = var9.field2594;
                                        field588.method3303(var43);
                                    } else {
                                        label383: for (int var39 = var9.field2506; var39 < field659; var39++) {
                                            int var40 = field658[var39 & 0x1F];
                                            for (int var41 = 0; var41 < var9.field2531.length; var41++) {
                                                if (var9.field2531[var41] == var40) {
                                                    class1 var42 = new class1();
                                                    var42.field15 = var9;
                                                    var42.field13 = var9.field2594;
                                                    field588.method3303(var42);
                                                    break label383;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2506 = field659;
                                }
                                if (var9.field2596 != null && field661 > var9.field2627) {
                                    if (var9.field2505 == null || field661 - var9.field2627 > 32) {
                                        class1 var48 = new class1();
                                        var48.field15 = var9;
                                        var48.field13 = var9.field2596;
                                        field588.method3303(var48);
                                    } else {
                                        label363: for (int var44 = var9.field2627; var44 < field661; var44++) {
                                            int var45 = field595[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var9.field2505.length; var46++) {
                                                if (var9.field2505[var46] == var45) {
                                                    class1 var47 = new class1();
                                                    var47.field15 = var9;
                                                    var47.field13 = var9.field2596;
                                                    field588.method3303(var47);
                                                    break label363;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2627 = field661;
                                }
                                if (var9.field2598 != null && field663 > var9.field2628) {
                                    if (var9.field2599 == null || field663 - var9.field2628 > 32) {
                                        class1 var53 = new class1();
                                        var53.field15 = var9;
                                        var53.field13 = var9.field2598;
                                        field588.method3303(var53);
                                    } else {
                                        label343: for (int var49 = var9.field2628; var49 < field663; var49++) {
                                            int var50 = field662[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2599.length; var51++) {
                                                if (var9.field2599[var51] == var50) {
                                                    class1 var52 = new class1();
                                                    var52.field15 = var9;
                                                    var52.field13 = var9.field2598;
                                                    field588.method3303(var52);
                                                    break label343;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2628 = field663;
                                }
                                if (field485 > var9.field2625 && var9.field2564 != null) {
                                    class1 var54 = new class1();
                                    var54.field15 = var9;
                                    var54.field13 = var9.field2564;
                                    field588.method3303(var54);
                                }
                                if (field665 > var9.field2625 && var9.field2605 != null) {
                                    class1 var55 = new class1();
                                    var55.field15 = var9;
                                    var55.field13 = var9.field2605;
                                    field588.method3303(var55);
                                }
                                if (field666 > var9.field2625 && var9.field2606 != null) {
                                    class1 var56 = new class1();
                                    var56.field15 = var9;
                                    var56.field13 = var9.field2606;
                                    field588.method3303(var56);
                                }
                                if (field667 > var9.field2625 && var9.field2607 != null) {
                                    class1 var57 = new class1();
                                    var57.field15 = var9;
                                    var57.field13 = var9.field2607;
                                    field588.method3303(var57);
                                }
                                var9.field2625 = field657;
                                if (var9.field2612 != null) {
                                    for (int var58 = 0; var58 < field650; var58++) {
                                        class1 var59 = new class1();
                                        var59.field15 = var9;
                                        var59.field7 = field697[var58];
                                        var59.field11 = field696[var58];
                                        var59.field13 = var9.field2612;
                                        field588.method3303(var59);
                                    }
                                }
                            }
                        }
                        if (!var9.field2513) {
                            if (field489 != null || Statics.field86 != null || field616) {
                                return;
                            }
                            if ((var9.field2613 >= 0 || var9.field2533 != 0) && class76.field1389 >= var12 && class76.field1390 >= var13 && class76.field1389 < var14 && class76.field1390 < var15) {
                                if (var9.field2613 >= 0) {
                                    Statics.field1259 = arg0[var9.field2613];
                                } else {
                                    Statics.field1259 = var9;
                                }
                            }
                            if (var9.field2587 == 8 && class76.field1389 >= var12 && class76.field1390 >= var13 && class76.field1389 < var14 && class76.field1390 < var15) {
                                Statics.field467 = var9;
                            }
                            if (var9.field2530 > var9.field2524) {
                                method126(var9, var9.field2523 + var10, var11, var9.field2524, var9.field2530, class76.field1389, class76.field1390);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.cq([Lem;II)V")
    public static final void method116(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2587 == 0) {
                    if (var3.field2622 != null) {
                        method116(var3.field2622, arg1);
                    }
                    class4 var4 = (class4) field712.method3281((long) var3.field2514);
                    if (var4 != null) {
                        int var5 = var4.field59;
                        if (class156.method132(var5)) {
                            method116(Statics.field2537[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2604 != null) {
                    class1 var6 = new class1();
                    var6.field15 = var3;
                    var6.field13 = var3.field2604;
                    class25.method226(var6);
                }
                if (arg1 == 1 && var3.field2609 != null) {
                    if (var3.field2534 >= 0) {
                        class156 var7 = class156.method2431(var3.field2514);
                        if (var7 == null || var7.field2622 == null || var3.field2534 >= var7.field2622.length || var7.field2622[var3.field2534] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field15 = var3;
                    var8.field13 = var3.field2609;
                    class25.method226(var8);
                }
            }
        }
    }

    @ObfuscatedName("eq.ch(Lem;IIB)V")
    public static final void method3077(class156 arg0, int arg1, int arg2) {
        if (field489 != null || field616 || arg0 == null || method2628(arg0) == null) {
            return;
        }
        field489 = arg0;
        field646 = method2628(arg0);
        field647 = arg1;
        field549 = arg2;
        Statics.field384 = 0;
        field656 = false;
    }

    @ObfuscatedName("cl.cx(Lem;I)V")
    public static void method2103(class156 arg0) {
        if (field676 == arg0.field2630) {
            field645[arg0.field2629] = true;
        }
    }

    @ObfuscatedName("ac.ce(B)V")
    public static void method901() {
        for (class4 var0 = (class4) field712.method3285(); var0 != null; var0 = (class4) field712.method3286()) {
            int var1 = var0.field59;
            if (class156.method132(var1)) {
                boolean var2 = true;
                class156[] var3 = Statics.field2537[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2513;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2755;
                    class156 var6 = class156.method2431(var5);
                    if (var6 != null) {
                        method2103(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dq.cc(Lem;I)Lem;")
    public static class156 method2628(class156 arg0) {
        class156 var1 = method1833(arg0);
        if (var1 == null) {
            var1 = arg0.field2576;
        }
        return var1;
    }

    @ObfuscatedName("k.cv([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method130(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("fg.cg(II)V")
    public static final void method3230(int arg0) {
        if (!class156.method132(arg0)) {
            return;
        }
        class156[] var1 = Statics.field2537[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class156 var3 = var1[var2];
            if (var3 != null) {
                var3.field2620 = 0;
                var3.field2621 = 0;
            }
        }
    }

    @ObfuscatedName("dr.cj(II)V")
    public static final void method2208(int arg0) {
        if (class156.method132(arg0)) {
            method2428(Statics.field2537[arg0], -1);
        }
    }

    @ObfuscatedName("ds.cz([Lem;II)V")
    public static final void method2428(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null && var3.field2525 == arg1 && (!var3.field2513 || !method170(var3))) {
                if (var3.field2587 == 0) {
                    if (!var3.field2513 && method170(var3) && Statics.field1259 != var3) {
                        continue;
                    }
                    method2428(arg0, var3.field2514);
                    if (var3.field2622 != null) {
                        method2428(var3.field2622, var3.field2514);
                    }
                    class4 var4 = (class4) field712.method3281((long) var3.field2514);
                    if (var4 != null) {
                        method2208(var4.field59);
                    }
                }
                if (var3.field2587 == 6) {
                    if (var3.field2550 != -1 || var3.field2511 != -1) {
                        boolean var5 = method149(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2511;
                        } else {
                            var6 = var3.field2550;
                        }
                        if (var6 != -1) {
                            class33 var7 = class33.method2674(var6);
                            var3.field2621 += field551;
                            while (var3.field2621 > var7.field894[var3.field2620]) {
                                var3.field2621 -= var7.field894[var3.field2620];
                                var3.field2620++;
                                if (var3.field2620 >= var7.field884.length) {
                                    var3.field2620 -= var7.field888;
                                    if (var3.field2620 < 0 || var3.field2620 >= var7.field884.length) {
                                        var3.field2620 = 0;
                                    }
                                }
                                method2103(var3);
                            }
                        }
                    }
                    if (var3.field2558 != 0 && !var3.field2513) {
                        int var8 = var3.field2558 >> 16;
                        int var9 = var3.field2558 << 16 >> 16;
                        int var10 = field551 * var8;
                        int var11 = field551 * var9;
                        var3.field2554 = var3.field2554 + var10 & 0x7FF;
                        var3.field2508 = var3.field2508 + var11 & 0x7FF;
                        method2103(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cy(Lem;B)V")
    public static final void method38(class156 arg0) {
        int var1 = arg0.field2518;
        if (var1 == 324) {
            if (field733 == -1) {
                field733 = arg0.field2538;
                field625 = arg0.field2515;
            }
            if (field732.field2656) {
                arg0.field2538 = field733;
            } else {
                arg0.field2538 = field625;
            }
        } else if (var1 == 325) {
            if (field733 == -1) {
                field733 = arg0.field2538;
                field625 = arg0.field2515;
            }
            if (field732.field2656) {
                arg0.field2538 = field625;
            } else {
                arg0.field2538 = field733;
            }
        } else if (var1 == 327) {
            arg0.field2554 = 150;
            arg0.field2508 = (int) (Math.sin((double) field481 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2546 = 5;
            arg0.field2519 = 0;
        } else if (var1 == 328) {
            arg0.field2554 = 150;
            arg0.field2508 = (int) (Math.sin((double) field481 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2546 = 5;
            arg0.field2519 = 1;
        }
    }

    @ObfuscatedName("k.ca(IIII)Lp;")
    public static final class4 method131(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field59 = arg1;
        var3.field66 = arg2;
        field712.method3283(var3, (long) arg0);
        method3230(arg1);
        class25.method1328(arg1);
        class156 var4 = class156.method2431(arg0);
        if (var4 != null) {
            method2103(var4);
        }
        if (field638 != null) {
            method2103(field638);
            field638 = null;
        }
        field616 = false;
        field617 = 0;
        method2434(Statics.field187, Statics.field284, Statics.field1503, Statics.field1504);
        if (field634 != -1) {
            int var5 = field634;
            if (class156.method132(var5)) {
                method116(Statics.field2537[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ar.du(Lp;ZI)V")
    public static final void method600(class4 arg0, boolean arg1) {
        int var2 = arg0.field59;
        int var3 = (int) arg0.field2755;
        arg0.method3346();
        if (arg1 && var2 != -1 && Statics.field2551[var2]) {
            Statics.field2547.method2963(var2);
            if (Statics.field2537[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2537[var2].length; var5++) {
                    if (Statics.field2537[var2][var5] != null) {
                        if (Statics.field2537[var2][var5].field2587 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2537[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2537[var2] = null;
                }
                Statics.field2551[var2] = false;
            }
        }
        method1(var2);
        class156 var6 = class156.method2431(var3);
        if (var6 != null) {
            method2103(var6);
        }
        field616 = false;
        field617 = 0;
        method2434(Statics.field187, Statics.field284, Statics.field1503, Statics.field1504);
        if (field634 != -1) {
            int var7 = field634;
            if (class156.method132(var7)) {
                method116(Statics.field2537[var7], 1);
            }
        }
    }

    @ObfuscatedName("bq.dw(Lem;S)Z")
    public static final boolean method1537(class156 arg0) {
        int var1 = arg0.field2518;
        if (var1 == 205) {
            field716 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field732.method3167(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field732.method3175(var4, var5 == 1);
        }
        if (var1 == 324) {
            field732.method3160(false);
        }
        if (var1 == 325) {
            field732.method3160(true);
        }
        if (var1 == 326) {
            field512.method2307(238);
            field732.method3163(field512);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.de(IIIILcm;I)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method802(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field561 + field484 & 0x7FF;
        int var7 = class103.field1757[var6];
        int var8 = class103.field1746[var6];
        int var9 = var7 * 256 / (field472 + 256);
        int var10 = var8 * 256 / (field472 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field575.method1726(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("am.dx(IIIILcm;I)V")
    public static final void method802(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field561 + field484 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class103.field1757[var5];
        int var8 = class103.field1746[var5];
        int var9 = var7 * 256 / (field472 + 256);
        int var10 = var8 * 256 / (field472 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1680(Statics.field2757, arg0 + 94 + var11 - arg4.field1459 / 2 + 4, arg1 + 83 - var12 - arg4.field1458 / 2 - 4);
        } else {
            arg4.method1665(arg0 + 94 + var11 - arg4.field1459 / 2 + 4, arg1 + 83 - var12 - arg4.field1458 / 2 - 4);
        }
    }

    @ObfuscatedName("dr.dl(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2211(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field685[var4] = field685[var4 - 1];
            field686[var4] = field686[var4 - 1];
            field688[var4] = field688[var4 - 1];
            field687[var4] = field687[var4 - 1];
        }
        field685[0] = arg0;
        field686[0] = arg1;
        field688[0] = arg2;
        field687[0] = arg3;
        field689++;
        field485 = field657;
    }

    @ObfuscatedName("g.dh(Ljava/lang/String;I)Z")
    public static boolean method107(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method1357(arg0, Statics.field560);
        for (int var2 = 0; var2 < field726; var2++) {
            if (var1.equalsIgnoreCase(class147.method1357(field728[var2].field358, Statics.field560))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class147.method1357(Statics.field1033.field51, Statics.field560))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.dj(Ljava/lang/String;I)Z")
    public static boolean method61(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method1357(arg0, Statics.field560);
        for (int var2 = 0; var2 < field695; var2++) {
            class11 var3 = field478[var2];
            if (var1.equalsIgnoreCase(class147.method1357(var3.field177, Statics.field560))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class147.method1357(var3.field178, Statics.field560))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("en.da(Ljava/lang/String;B)V")
    public static final void method3023(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field726 < 200 || field571 == 1) || field726 >= 200) {
            Statics.method2554(0, "", class133.field2109);
            return;
        }
        String var1 = class147.method1357(arg0, Statics.field560);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field726; var2++) {
            class22 var3 = field728[var2];
            String var4 = class147.method1357(var3.field358, Statics.field560);
            if (var4 != null && var4.equals(var1)) {
                Statics.method2554(0, "", arg0 + class133.field2164);
                return;
            }
            if (var3.field364 != null) {
                String var5 = class147.method1357(var3.field364, Statics.field560);
                if (var5 != null && var5.equals(var1)) {
                    Statics.method2554(0, "", arg0 + class133.field2164);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field695; var6++) {
            class11 var7 = field478[var6];
            String var8 = class147.method1357(var7.field177, Statics.field560);
            if (var8 != null && var8.equals(var1)) {
                Statics.method2554(0, "", class133.field2205 + arg0 + class133.field2132);
                return;
            }
            if (var7.field178 != null) {
                String var9 = class147.method1357(var7.field178, Statics.field560);
                if (var9 != null && var9.equals(var1)) {
                    Statics.method2554(0, "", class133.field2205 + arg0 + class133.field2132);
                    return;
                }
            }
        }
        if (class147.method1357(Statics.field1033.field51, Statics.field560).equals(var1)) {
            Statics.method2554(0, "", class133.field2201);
            return;
        }
        field512.method2307(124);
        class115 var10 = field512;
        int var11 = arg0.length() + 1;
        var10.method2462(var11);
        field512.method2442(arg0);
    }

    @ObfuscatedName("t.dn(Ljava/lang/String;I)V")
    public static final void method119(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class147.method1357(arg0, Statics.field560);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field726; var2++) {
            class22 var3 = field728[var2];
            String var4 = var3.field358;
            String var5 = class147.method1357(var4, Statics.field560);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field726--;
                for (int var7 = var2; var7 < field726; var7++) {
                    field728[var7] = field728[var7 + 1];
                }
                field665 = field657;
                field512.method2307(211);
                class115 var8 = field512;
                int var9 = arg0.length() + 1;
                var8.method2462(var9);
                field512.method2442(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bq.dg(Ljava/lang/String;B)V")
    public static final void method1536(String arg0) {
        if (Statics.field2423 == null) {
            return;
        }
        field512.method2307(227);
        class115 var1 = field512;
        int var2 = arg0.length() + 1;
        var1.method2462(var2);
        field512.method2442(arg0);
    }

    @ObfuscatedName("ec.dm(Ljava/lang/String;I)V")
    public static final void method2669(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field512.method2307(136);
        class115 var1 = field512;
        int var2 = arg0.length() + 1;
        var1.method2462(var2);
        field512.method2442(arg0);
    }

    @ObfuscatedName("z.dk(II)V")
    public static void method1(int arg0) {
        for (class169 var1 = (class169) field674.method3285(); var1 != null; var1 = (class169) field674.method3286()) {
            if ((long) arg0 == (var1.field2755 >> 48 & 0xFFFFL)) {
                var1.method3346();
            }
        }
    }

    @ObfuscatedName("ac.db(Lem;B)I")
    public static int method883(class156 arg0) {
        class169 var1 = (class169) field674.method3281(((long) arg0.field2514 << 32) + (long) arg0.field2534);
        return var1 == null ? arg0.field2592 : var1.field2738;
    }

    @ObfuscatedName("cq.dp(Lem;B)Lem;")
    public static class156 method1833(class156 arg0) {
        int var1 = class160.method871(method883(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class156.method2431(arg0.field2525);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("q.dz(Lem;I)Z")
    public static boolean method170(class156 arg0) {
        if (field643) {
            if (method883(arg0) != 0) {
                return false;
            }
            if (arg0.field2587 == 0) {
                return false;
            }
        }
        return arg0.field2526;
    }

    @ObfuscatedName("fn.dt(Lem;I)Ljava/lang/String;")
    public static String method3227(class156 arg0) {
        if (class160.method171(method883(arg0)) == 0) {
            return null;
        } else if (arg0.field2593 == null || arg0.field2593.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2593;
        }
    }
}

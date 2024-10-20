package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.o")
    public static boolean field713 = true;

    @ObfuscatedName("client.w")
    public static class130[] field530 = new class130[4];

    @ObfuscatedName("client.r")
    public static int field474 = 1;

    @ObfuscatedName("client.k")
    public static int field602 = 0;

    @ObfuscatedName("client.g")
    public static int field477 = 0;

    @ObfuscatedName("client.c")
    public static boolean field478 = false;

    @ObfuscatedName("client.m")
    public static boolean field479 = false;

    @ObfuscatedName("client.a")
    public static int field503 = 0;

    @ObfuscatedName("client.q")
    public static int field481 = 0;

    @ObfuscatedName("client.v")
    public static boolean field580 = true;

    @ObfuscatedName("client.s")
    public static int field723 = 0;

    @ObfuscatedName("client.u")
    public static long field484 = -1L;

    @ObfuscatedName("client.i")
    public static int field696 = -1;

    @ObfuscatedName("client.p")
    public static int field486 = -1;

    @ObfuscatedName("client.h")
    public static int field487 = -1;

    @ObfuscatedName("client.f")
    public static boolean field488 = true;

    @ObfuscatedName("client.t")
    public static boolean field654 = false;

    @ObfuscatedName("client.ar")
    public static int field472 = 0;

    @ObfuscatedName("client.au")
    public static int field491 = 0;

    @ObfuscatedName("client.an")
    public static int field492 = 0;

    @ObfuscatedName("client.ad")
    public static int field493 = 0;

    @ObfuscatedName("client.at")
    public static int field494 = 0;

    @ObfuscatedName("client.ay")
    public static int field495 = 0;

    @ObfuscatedName("client.ac")
    public static int field496 = 0;

    @ObfuscatedName("client.av")
    public static int field678 = 0;

    @ObfuscatedName("client.ae")
    public static int field482 = 0;

    @ObfuscatedName("client.ah")
    public static class127 field628 = new class127(new byte[5000]);

    @ObfuscatedName("client.af")
    public static int field480 = 0;

    @ObfuscatedName("client.aj")
    public static int field501 = 0;

    @ObfuscatedName("client.ag")
    public static int field679 = 0;

    @ObfuscatedName("client.be")
    public static int field504 = 0;

    @ObfuscatedName("client.bl")
    public static int field505 = 0;

    @ObfuscatedName("client.bv")
    public static int field506 = 0;

    @ObfuscatedName("client.bc")
    public static int field507 = 0;

    @ObfuscatedName("client.br")
    public static int field508 = 0;

    @ObfuscatedName("client.bz")
    public static class25[] field714 = new class25[32768];

    @ObfuscatedName("client.bq")
    public static int field476 = 0;

    @ObfuscatedName("client.bw")
    public static int[] field511 = new int[32768];

    @ObfuscatedName("client.ck")
    public static class116 field513 = new class116(5000);

    @ObfuscatedName("client.cn")
    public static class116 field721 = new class116(5000);

    @ObfuscatedName("client.cj")
    public static class116 field514 = new class116(5000);

    @ObfuscatedName("client.cb")
    public static int field515 = 0;

    @ObfuscatedName("client.cx")
    public static int field618 = 0;

    @ObfuscatedName("client.ch")
    public static int field597 = 0;

    @ObfuscatedName("client.cv")
    public static int field518 = 0;

    @ObfuscatedName("client.cs")
    public static int field490 = 0;

    @ObfuscatedName("client.cf")
    public static int field520 = 0;

    @ObfuscatedName("client.co")
    public static int field521 = 0;

    @ObfuscatedName("client.cq")
    public static int field605 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field541 = false;

    @ObfuscatedName("client.cp")
    public static int field524 = 0;

    @ObfuscatedName("client.ci")
    public static int field525 = 0;

    @ObfuscatedName("client.cu")
    public static int field526 = 1;

    @ObfuscatedName("client.dw")
    public static int field527 = 0;

    @ObfuscatedName("client.dk")
    public static int field489 = 1;

    @ObfuscatedName("client.dp")
    public static int field529 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field531 = false;

    @ObfuscatedName("client.db")
    public static int[][][] field532 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static final int[] field683 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dl")
    public static int field534 = 0;

    @ObfuscatedName("client.dv")
    public static int field535 = 2;

    @ObfuscatedName("client.dc")
    public static int field536 = 0;

    @ObfuscatedName("client.dg")
    public static int field671 = 2;

    @ObfuscatedName("client.dj")
    public static int field537 = 0;

    @ObfuscatedName("client.dd")
    public static int field539 = 1;

    @ObfuscatedName("client.dz")
    public static int field594 = 0;

    @ObfuscatedName("client.dm")
    public static int field510 = 0;

    @ObfuscatedName("client.dx")
    public static int field547 = 2;

    @ObfuscatedName("client.dn")
    public static int field543 = 0;

    @ObfuscatedName("client.dy")
    public static int field540 = 1;

    @ObfuscatedName("client.en")
    public static int field545 = 0;

    @ObfuscatedName("client.es")
    public static int field546 = 0;

    @ObfuscatedName("client.ey")
    public static int field528 = 2301979;

    @ObfuscatedName("client.ev")
    public static int field548 = 5063219;

    @ObfuscatedName("client.ep")
    public static int field549 = 3353893;

    @ObfuscatedName("client.em")
    public static int field550 = 7759444;

    @ObfuscatedName("client.eu")
    public static boolean field551 = false;

    @ObfuscatedName("client.ee")
    public static int field523 = 0;

    @ObfuscatedName("client.fg")
    public static int field553 = 128;

    @ObfuscatedName("client.fl")
    public static int field554 = 0;

    @ObfuscatedName("client.fj")
    public static int field471 = 0;

    @ObfuscatedName("client.fh")
    public static int field682 = 0;

    @ObfuscatedName("client.fo")
    public static int field704 = 0;

    @ObfuscatedName("client.fb")
    public static int field558 = 0;

    @ObfuscatedName("client.fs")
    public static int field559 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field560 = false;

    @ObfuscatedName("client.fv")
    public static int field512 = 0;

    @ObfuscatedName("client.ff")
    public static int field517 = 0;

    @ObfuscatedName("client.fa")
    public static int field563 = 50;

    @ObfuscatedName("client.fi")
    public static int[] field564 = new int[field563];

    @ObfuscatedName("client.fu")
    public static int[] field643 = new int[field563];

    @ObfuscatedName("client.fw")
    public static int[] field566 = new int[field563];

    @ObfuscatedName("client.fk")
    public static int[] field567 = new int[field563];

    @ObfuscatedName("client.fp")
    public static int[] field568 = new int[field563];

    @ObfuscatedName("client.fm")
    public static int[] field569 = new int[field563];

    @ObfuscatedName("client.fe")
    public static int[] field570 = new int[field563];

    @ObfuscatedName("client.fx")
    public static String[] field636 = new String[field563];

    @ObfuscatedName("client.gk")
    public static int[][] field572 = new int[104][104];

    @ObfuscatedName("client.gv")
    public static int field498 = 0;

    @ObfuscatedName("client.gd")
    public static int field574 = -1;

    @ObfuscatedName("client.gc")
    public static int field575 = -1;

    @ObfuscatedName("client.gp")
    public static int field726 = 0;

    @ObfuscatedName("client.gl")
    public static int field577 = 0;

    @ObfuscatedName("client.go")
    public static int field485 = 0;

    @ObfuscatedName("client.gu")
    public static int field579 = 0;

    @ObfuscatedName("client.gw")
    public static int field502 = 0;

    @ObfuscatedName("client.gm")
    public static int field581 = 0;

    @ObfuscatedName("client.gh")
    public static int field653 = 0;

    @ObfuscatedName("client.gf")
    public static int field583 = 0;

    @ObfuscatedName("client.gz")
    public static int field584 = 0;

    @ObfuscatedName("client.gy")
    public static int field585 = 0;

    @ObfuscatedName("client.ga")
    public static boolean field586 = false;

    @ObfuscatedName("client.gn")
    public static int field587 = 0;

    @ObfuscatedName("client.gr")
    public static int field588 = 0;

    @ObfuscatedName("client.gt")
    public static class3[] field595 = new class3[2048];

    @ObfuscatedName("client.ge")
    public static int field590 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field591 = new int[2048];

    @ObfuscatedName("client.gs")
    public static int field592 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field593 = new int[2048];

    @ObfuscatedName("client.ht")
    public static class127[] field661 = new class127[2048];

    @ObfuscatedName("client.hg")
    public static int field622 = -1;

    @ObfuscatedName("client.he")
    public static int field596 = 0;

    @ObfuscatedName("client.hx")
    public static int field565 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field598 = new int[1000];

    @ObfuscatedName("client.hv")
    public static final int[] field694 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hu")
    public static String[] field705 = new String[8];

    @ObfuscatedName("client.hb")
    public static boolean[] field601 = new boolean[8];

    @ObfuscatedName("client.hs")
    public static int[] field649 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ha")
    public static class178[][][] field603 = new class178[4][104][104];

    @ObfuscatedName("client.ho")
    public static class178 field604 = new class178();

    @ObfuscatedName("client.hh")
    public static class178 field615 = new class178();

    @ObfuscatedName("client.hk")
    public static class178 field606 = new class178();

    @ObfuscatedName("client.hr")
    public static int[] field607 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field608 = new int[25];

    @ObfuscatedName("client.hf")
    public static int[] field609 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field611 = 0;

    @ObfuscatedName("client.hj")
    public static boolean field703 = false;

    @ObfuscatedName("client.ic")
    public static int field612 = 0;

    @ObfuscatedName("client.im")
    public static int[] field516 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field614 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field658 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field616 = new int[500];

    @ObfuscatedName("client.ip")
    public static String[] field617 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field652 = new String[500];

    @ObfuscatedName("client.iv")
    public static int field619 = -1;

    @ObfuscatedName("client.ij")
    public static int field709 = -1;

    @ObfuscatedName("client.il")
    public static int field621 = 0;

    @ObfuscatedName("client.is")
    public static int field473 = 50;

    @ObfuscatedName("client.iy")
    public static int field500 = 0;

    @ObfuscatedName("client.it")
    public static String field624 = null;

    @ObfuscatedName("client.ia")
    public static boolean field625 = false;

    @ObfuscatedName("client.if")
    public static int field626 = -1;

    @ObfuscatedName("client.iu")
    public static String field627 = null;

    @ObfuscatedName("client.id")
    public static String field589 = null;

    @ObfuscatedName("client.ie")
    public static int field629 = -1;

    @ObfuscatedName("client.jj")
    public static class176 field630 = new class176(8);

    @ObfuscatedName("client.jg")
    public static int field631 = 0;

    @ObfuscatedName("client.jk")
    public static int field632 = 0;

    @ObfuscatedName("client.ju")
    public static class160 field633 = null;

    @ObfuscatedName("client.jb")
    public static int field634 = 0;

    @ObfuscatedName("client.jz")
    public static int field635 = 0;

    @ObfuscatedName("client.jo")
    public static int field578 = 0;

    @ObfuscatedName("client.jw")
    public static boolean field637 = false;

    @ObfuscatedName("client.js")
    public static boolean field562 = false;

    @ObfuscatedName("client.ja")
    public static boolean field639 = false;

    @ObfuscatedName("client.jh")
    public static class160 field640 = null;

    @ObfuscatedName("client.jq")
    public static class160 field641 = null;

    @ObfuscatedName("client.ji")
    public static int field642 = 0;

    @ObfuscatedName("client.jt")
    public static int field499 = 0;

    @ObfuscatedName("client.jv")
    public static class160 field644 = null;

    @ObfuscatedName("client.jp")
    public static boolean field555 = false;

    @ObfuscatedName("client.jm")
    public static int field646 = -1;

    @ObfuscatedName("client.jr")
    public static int field647 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field648 = false;

    @ObfuscatedName("client.jn")
    public static int field711 = -1;

    @ObfuscatedName("client.jf")
    public static int field650 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field651 = false;

    @ObfuscatedName("client.kj")
    public static int field556 = 1;

    @ObfuscatedName("client.ka")
    public static int[] field561 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field691 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field655 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field571 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field719 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field688 = 0;

    @ObfuscatedName("client.ks")
    public static int field659 = 0;

    @ObfuscatedName("client.kk")
    public static int field660 = 0;

    @ObfuscatedName("client.km")
    public static int field557 = 0;

    @ObfuscatedName("client.ke")
    public static int field662 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field663 = new int[2000];

    @ObfuscatedName("client.kz")
    public static String[] field664 = new String[1000];

    @ObfuscatedName("client.ko")
    public static int field665 = 0;

    @ObfuscatedName("client.kg")
    public static class178 field666 = new class178();

    @ObfuscatedName("client.ki")
    public static class178 field667 = new class178();

    @ObfuscatedName("client.kr")
    public static class178 field668 = new class178();

    @ObfuscatedName("client.kt")
    public static class176 field669 = new class176(512);

    @ObfuscatedName("client.ku")
    public static int field670 = 0;

    @ObfuscatedName("client.kf")
    public static int field497 = -2;

    @ObfuscatedName("client.kl")
    public static boolean[] field519 = new boolean[100];

    @ObfuscatedName("client.kp")
    public static boolean[] field673 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static boolean[] field701 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static int[] field675 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field676 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field674 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field475 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field483 = 0;

    @ObfuscatedName("client.lj")
    public static int[] field677 = new int[100];

    @ObfuscatedName("client.lm")
    public static String[] field681 = new String[100];

    @ObfuscatedName("client.ll")
    public static String[] field509 = new String[100];

    @ObfuscatedName("client.ls")
    public static String[] field620 = new String[100];

    @ObfuscatedName("client.la")
    public static int field684 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field685 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ly")
    public static int field686 = 0;

    @ObfuscatedName("client.lk")
    public static int field687 = 0;

    @ObfuscatedName("client.le")
    public static long[] field680 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field689 = 0;

    @ObfuscatedName("client.ln")
    public static int field533 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field623 = new int[128];

    @ObfuscatedName("client.li")
    public static int[] field692 = new int[128];

    @ObfuscatedName("client.lr")
    public static long field693 = -1L;

    @ObfuscatedName("client.lz")
    public static String field573 = null;

    @ObfuscatedName("client.lv")
    public static String field695 = null;

    @ObfuscatedName("client.mp")
    public static int field576 = -1;

    @ObfuscatedName("client.mu")
    public static int field697 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field698 = new int[1000];

    @ObfuscatedName("client.mh")
    public static int[] field699 = new int[1000];

    @ObfuscatedName("client.mk")
    public static class86[] field638 = new class86[1000];

    @ObfuscatedName("client.mc")
    public static int field656 = 0;

    @ObfuscatedName("client.mn")
    public static int field702 = 0;

    @ObfuscatedName("client.mo")
    public static int field522 = 0;

    @ObfuscatedName("client.mx")
    public static int field552 = 255;

    @ObfuscatedName("client.mq")
    public static int field657 = -1;

    @ObfuscatedName("client.mv")
    public static boolean field706 = false;

    @ObfuscatedName("client.my")
    public static int field707 = 127;

    @ObfuscatedName("client.me")
    public static int field708 = 127;

    @ObfuscatedName("client.nr")
    public static int field718 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field710 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field542 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field712 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field672 = new int[50];

    @ObfuscatedName("client.nt")
    public static class57[] field613 = new class57[50];

    @ObfuscatedName("client.nq")
    public static boolean field715 = false;

    @ObfuscatedName("client.nv")
    public static boolean[] field716 = new boolean[5];

    @ObfuscatedName("client.ng")
    public static int[] field717 = new int[5];

    @ObfuscatedName("client.nx")
    public static int[] field690 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field600 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field720 = new int[5];

    @ObfuscatedName("client.ou")
    public static int field538 = 0;

    @ObfuscatedName("client.og")
    public static int field722 = 0;

    @ObfuscatedName("client.of")
    public static class23[] field645 = new class23[400];

    @ObfuscatedName("client.om")
    public static class174 field724 = new class174();

    @ObfuscatedName("client.oa")
    public static int field725 = 0;

    @ObfuscatedName("client.oc")
    public static class11[] field610 = new class11[400];

    @ObfuscatedName("client.ok")
    public static class165 field727 = new class165();

    @ObfuscatedName("client.oy")
    public static int field728 = -1;

    @ObfuscatedName("client.or")
    public static int field729 = -1;

    @ObfuscatedName("client.w(B)V")
    public final void method260() {
    }

    public final void init() {
        if (!this.method1496()) {
            return;
        }
        class168[] var1 = new class168[] { class168.field2796, class168.field2795, class168.field2801, class168.field2805, class168.field2797, class168.field2800, class168.field2798, class168.field2802, class168.field2803, class168.field2804 };
        class168[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class168 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2799);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2799)) {
                    case 1:
                        field602 = Integer.parseInt(var5);
                    case 2:
                    default:
                        break;
                    case 3:
                        field474 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field503 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                        }
                        break;
                    case 6:
                        Statics.field1774 = var5;
                        break;
                    case 7:
                        class135[] var6 = new class135[] { class135.field2079, class135.field2082, class135.field2080, class135.field2081, class135.field2089, class135.field2083 };
                        int var8 = Integer.parseInt(var5);
                        class135[] var9 = var6;
                        int var10 = 0;
                        class135 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class135 var11 = var9[var10];
                            if (var8 == var11.method2340()) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field2747 = (class135) var12;
                        if (Statics.field2747 == class135.field2079) {
                            Statics.field103 = class187.field2881;
                        } else {
                            Statics.field103 = class187.field2882;
                        }
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                            field478 = true;
                        } else {
                            field478 = false;
                        }
                        break;
                    case 9:
                        field477 = Integer.parseInt(var5);
                        break;
                    case 10:
                        Statics.field582 = class133.method1372(Integer.parseInt(var5));
                }
            }
        }
        method103();
        Statics.field1733 = this.getCodeBase().getHost();
        String var13 = Statics.field582.field2064;
        byte var14 = 0;
        try {
            Statics.field1410 = 16;
            Statics.field293 = var14;
            try {
                Statics.field296 = System.getProperty("os.name");
            } catch (Exception var66) {
                Statics.field296 = "Unknown";
            }
            Statics.field1505 = Statics.field296.toLowerCase();
            try {
                Statics.field1955 = System.getProperty("user.home");
                if (Statics.field1955 != null) {
                    Statics.field1955 = Statics.field1955 + "/";
                }
            } catch (Exception var65) {
            }
            try {
                if (Statics.field1505.startsWith("win")) {
                    if (Statics.field1955 == null) {
                        Statics.field1955 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1955 == null) {
                    Statics.field1955 = System.getenv("HOME");
                }
                if (Statics.field1955 != null) {
                    Statics.field1955 = Statics.field1955 + "/";
                }
            } catch (Exception var64) {
            }
            if (Statics.field1955 == null) {
                Statics.field1955 = "~/";
            }
            Statics.field1985 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1955, "/tmp/", "" };
            Statics.field1416 = new String[] { ".jagex_cache_" + Statics.field293, ".file_store_" + Statics.field293 };
            int var18 = 0;
            label292: while (var18 < 4) {
                String var19 = var18 == 0 ? "" : "" + var18;
                Statics.field1409 = new File(Statics.field1955, "jagex_cl_oldschool_" + var13 + var19 + ".dat");
                String var20 = null;
                String var21 = null;
                boolean var22 = false;
                if (Statics.field1409.exists()) {
                    try {
                        class29 var23 = new class29(Statics.field1409, "rw", 10000L);
                        class127 var24 = new class127((int) var23.method566());
                        while (var24.field2022 < var24.field2024.length) {
                            int var25 = var23.method571(var24.field2024, var24.field2022, var24.field2024.length - var24.field2022);
                            if (var25 == -1) {
                                throw new IOException();
                            }
                            var24.field2022 += var25;
                        }
                        var24.field2022 = 0;
                        int var26 = var24.method2440();
                        if (var26 < 1 || var26 > 3) {
                            throw new IOException("" + var26);
                        }
                        int var27 = 0;
                        if (var26 > 1) {
                            var27 = var24.method2440();
                        }
                        if (var26 <= 2) {
                            var20 = var24.method2634();
                            if (var27 == 1) {
                                var21 = var24.method2634();
                            }
                        } else {
                            var20 = var24.method2461();
                            if (var27 == 1) {
                                var21 = var24.method2461();
                            }
                        }
                        var23.method578();
                    } catch (IOException var69) {
                        var69.printStackTrace();
                    }
                    if (var20 != null) {
                        File var29 = new File(var20);
                        if (!var29.exists()) {
                            var20 = null;
                        }
                    }
                    if (var20 != null) {
                        File var30 = new File(var20, "test.dat");
                        if (!class82.method1526(var30, true)) {
                            var20 = null;
                        }
                    }
                }
                if (var20 == null && var18 == 0) {
                    label267: for (int var31 = 0; var31 < Statics.field1416.length; var31++) {
                        for (int var32 = 0; var32 < Statics.field1985.length; var32++) {
                            File var33 = new File(Statics.field1985[var32] + Statics.field1416[var31] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var33.exists() && class82.method1526(new File(var33, "test.dat"), true)) {
                                var20 = var33.toString();
                                var22 = true;
                                break label267;
                            }
                        }
                    }
                }
                if (var20 == null) {
                    var20 = Statics.field1955 + File.separatorChar + "jagexcache" + var19 + File.separatorChar + "oldschool" + File.separatorChar + var13 + File.separatorChar;
                    var22 = true;
                }
                if (var21 != null) {
                    File var34 = new File(var21);
                    File var35 = new File(var20);
                    try {
                        File[] var36 = var34.listFiles();
                        File[] var37 = var36;
                        for (int var38 = 0; var38 < var37.length; var38++) {
                            File var39 = var37[var38];
                            File var40 = new File(var35, var39.getName());
                            boolean var41 = var39.renameTo(var40);
                            if (!var41) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var68) {
                        var68.printStackTrace();
                    }
                    var22 = true;
                }
                if (var22) {
                    File var43 = new File(var20);
                    Object var44 = null;
                    try {
                        class29 var45 = new class29(Statics.field1409, "rw", 10000L);
                        class127 var46 = new class127(500);
                        var46.method2493(3);
                        var46.method2493(var44 == null ? 0 : 1);
                        var46.method2430(var43.getPath());
                        if (var44 != null) {
                            var46.method2430(((File) var44).getPath());
                        }
                        var45.method564(var46.field2024, 0, var46.field2022);
                        var45.method578();
                    } catch (IOException var63) {
                        var63.printStackTrace();
                    }
                }
                File var48 = new File(var20);
                Statics.field1105 = var48;
                if (!Statics.field1105.exists()) {
                    Statics.field1105.mkdirs();
                }
                File[] var49 = Statics.field1105.listFiles();
                if (var49 == null) {
                    break;
                }
                File[] var50 = var49;
                int var51 = 0;
                while (true) {
                    if (var51 >= var50.length) {
                        break label292;
                    }
                    File var52 = var50[var51];
                    if (!class82.method1526(var52, false)) {
                        var18++;
                        break;
                    }
                    var51++;
                }
            }
            File var53 = Statics.field1105;
            Statics.field1297 = var53;
            if (!Statics.field1297.exists()) {
                throw new RuntimeException("");
            }
            class72.field1295 = true;
            try {
                File var54 = new File(Statics.field1955, "random.dat");
                if (var54.exists()) {
                    class82.field1412 = new class30(new class29(var54, "rw", 25L), 24, 0);
                } else {
                    label220: for (int var55 = 0; var55 < Statics.field1416.length; var55++) {
                        for (int var56 = 0; var56 < Statics.field1985.length; var56++) {
                            File var57 = new File(Statics.field1985[var56] + Statics.field1416[var55] + File.separatorChar + "random.dat");
                            if (var57.exists()) {
                                class82.field1412 = new class30(new class29(var57, "rw", 25L), 24, 0);
                                break label220;
                            }
                        }
                    }
                }
                if (class82.field1412 == null) {
                    RandomAccessFile var58 = new RandomAccessFile(var54, "rw");
                    int var59 = var58.read();
                    var58.seek(0L);
                    var58.write(var59);
                    var58.seek(0L);
                    var58.close();
                    class82.field1412 = new class30(new class29(var54, "rw", 25L), 24, 0);
                }
            } catch (IOException var67) {
            }
            class82.field1413 = new class30(new class29(class72.method166("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1414 = new class30(new class29(class72.method166("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1427 = new class30[Statics.field1410];
            for (int var61 = 0; var61 < Statics.field1410; var61++) {
                Statics.field1427[var61] = new class30(new class29(class72.method166("main_file_cache.idx" + var61), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var70) {
            Statics.method1393((String) null, var70);
        }
        Statics.field599 = this;
        this.method1440(765, 503, 42);
    }

    @ObfuscatedName("n.k(I)V")
    public static final void method103() {
        class95.field1589 = false;
        field479 = false;
    }

    @ObfuscatedName("client.z(I)V")
    public final void method292() {
        Statics.field1983 = field477 == 0 ? 43594 : field474 + 40000;
        Statics.field290 = field477 == 0 ? 443 : field474 + 50000;
        Statics.field2887 = Statics.field1983;
        Statics.field2763 = class163.field2752;
        Statics.field2764 = class163.field2745;
        Statics.field197 = class163.field2746;
        Statics.field1264 = class163.field2753;
        if (Statics.field1319.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1357[44] = 71;
            class75.field1357[45] = 26;
            class75.field1357[46] = 72;
            class75.field1357[47] = 73;
            class75.field1357[59] = 57;
            class75.field1357[61] = 27;
            class75.field1357[91] = 42;
            class75.field1357[92] = 74;
            class75.field1357[93] = 43;
            class75.field1357[192] = 28;
            class75.field1357[222] = 58;
            class75.field1357[520] = 59;
        } else {
            class75.field1357[186] = 57;
            class75.field1357[187] = 27;
            class75.field1357[188] = 71;
            class75.field1357[189] = 26;
            class75.field1357[190] = 72;
            class75.field1357[191] = 73;
            class75.field1357[192] = 58;
            class75.field1357[219] = 42;
            class75.field1357[220] = 74;
            class75.field1357[221] = 43;
            class75.field1357[222] = 59;
            class75.field1357[223] = 28;
        }
        class75.method710(Statics.field1984);
        Canvas var1 = Statics.field1984;
        var1.addMouseListener(class77.field1382);
        var1.addMouseMotionListener(class77.field1382);
        var1.addFocusListener(class77.field1382);
        Statics.field196 = Statics.method2717();
        if (Statics.field196 != null) {
            Statics.field196.method1376(Statics.field1984);
        }
        Statics.field2059 = new class71(255, class82.field1413, class82.field1414, 500000);
        class29 var2 = null;
        class12 var3 = new class12();
        try {
            var2 = class82.method1563("", Statics.field2747.field2078, false);
            byte[] var4 = new byte[(int) var2.method566()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method571(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class12(new class127(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method578();
            }
        } catch (Exception var10) {
        }
        Statics.field2592 = var3;
        Statics.field46 = this.getToolkit().getSystemClipboard();
        if (field477 != 0) {
            field654 = true;
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method264() {
        field723++;
        this.method267();
        while (true) {
            class178 var1 = class159.field2604;
            class158 var2;
            synchronized (class159.field2604) {
                var2 = (class158) class159.field2599.method3324();
            }
            if (var2 == null) {
                try {
                    if (class140.field2352 == 1) {
                        int var4 = Statics.field246.method2770();
                        if (var4 > 0 && Statics.field246.method2797()) {
                            int var5 = var4 - Statics.field2357;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field246.method2783(var5);
                        } else {
                            Statics.field246.method2774();
                            Statics.field246.method2772();
                            if (Statics.field2353 == null) {
                                class140.field2352 = 0;
                            } else {
                                class140.field2352 = 2;
                            }
                            Statics.field2349 = null;
                            Statics.field2354 = null;
                        }
                    }
                } catch (Exception var126) {
                    var126.printStackTrace();
                    Statics.field246.method2774();
                    class140.field2352 = 0;
                    Statics.field2349 = null;
                    Statics.field2354 = null;
                    Statics.field2353 = null;
                }
                method1502();
                class75 var7 = class75.field1353;
                synchronized (class75.field1353) {
                    class75.field1335++;
                    class75.field1337 = class75.field1355;
                    class75.field1352 = 0;
                    if (class75.field1348 >= 0) {
                        while (class75.field1348 != class75.field1347) {
                            int var9 = class75.field1358[class75.field1347];
                            class75.field1347 = class75.field1347 + 1 & 0x7F;
                            if (var9 < 0) {
                                class75.field1345[~var9] = false;
                            } else {
                                if (!class75.field1345[var9] && class75.field1352 < class75.field1356.length - 1) {
                                    class75.field1356[++class75.field1352 - 1] = var9;
                                }
                                class75.field1345[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class75.field1345[var8] = false;
                        }
                        class75.field1348 = class75.field1347;
                    }
                    class75.field1355 = class75.field1354;
                }
                class77 var11 = class77.field1382;
                synchronized (class77.field1382) {
                    class77.field1377 = class77.field1374;
                    class77.field1378 = class77.field1381;
                    class77.field1379 = class77.field1386 * -1421558159;
                    class77.field1384 = class77.field1380;
                    class77.field1372 = class77.field1389;
                    class77.field1376 = class77.field1385;
                    class77.field1387 = class77.field1383;
                    class77.field1380 = 0;
                }
                if (Statics.field196 != null) {
                    int var13 = Statics.field196.method1375();
                    field665 = var13;
                }
                if (field481 == 0) {
                    method2370();
                    class73.method31();
                } else if (field481 == 5) {
                    class21.method34(this);
                    method2370();
                    class73.method31();
                } else if (field481 == 10) {
                    class21.method34(this);
                } else if (field481 == 20) {
                    class21.method34(this);
                    method218();
                } else if (field481 == 25) {
                    method225();
                }
                if (field481 == 30) {
                    if (field472 > 1) {
                        field472--;
                    }
                    if (field490 > 0) {
                        field490--;
                    }
                    if (field541) {
                        field541 = false;
                        Statics.method2419();
                    } else {
                        if (!field703) {
                            field617[0] = class136.field2264;
                            field652[0] = "";
                            field658[0] = 1006;
                            field612 = 1;
                        }
                        for (int var14 = 0; var14 < 100 && method1395(); var14++) {
                        }
                        if (field481 == 30) {
                            class183.method2731(field513, 46);
                            Object var15 = Statics.field271.field236;
                            synchronized (Statics.field271.field236) {
                                if (!field713) {
                                    Statics.field271.field237 = 0;
                                } else if (class77.field1384 != 0 || Statics.field271.field237 >= 40) {
                                    field513.method2326(83);
                                    field513.method2493(0);
                                    int var16 = field513.field2022;
                                    int var17 = 0;
                                    for (int var18 = 0; var18 < Statics.field271.field237 && field513.field2022 - var16 < 240; var18++) {
                                        var17++;
                                        int var19 = Statics.field271.field239[var18];
                                        if (var19 < 0) {
                                            var19 = 0;
                                        } else if (var19 > 502) {
                                            var19 = 502;
                                        }
                                        int var20 = Statics.field271.field238[var18];
                                        if (var20 < 0) {
                                            var20 = 0;
                                        } else if (var20 > 764) {
                                            var20 = 764;
                                        }
                                        int var21 = var19 * 765 + var20;
                                        if (Statics.field271.field239[var18] == -1 && Statics.field271.field238[var18] == -1) {
                                            var20 = -1;
                                            var19 = -1;
                                            var21 = 524287;
                                        }
                                        if (field696 != var20 || field486 != var19) {
                                            int var22 = var20 - field696;
                                            field696 = var20;
                                            int var23 = var19 - field486;
                                            field486 = var19;
                                            if (field487 < 8 && var22 >= -32 && var22 <= 31 && var23 >= -32 && var23 <= 31) {
                                                var22 += 32;
                                                var23 += 32;
                                                field513.method2424((field487 << 12) + (var22 << 6) + var23);
                                                field487 = 0;
                                            } else if (field487 < 8) {
                                                field513.method2425((field487 << 19) + 8388608 + var21);
                                                field487 = 0;
                                            } else {
                                                field513.method2540((field487 << 19) + -1073741824 + var21);
                                                field487 = 0;
                                            }
                                        } else if (field487 < 2047) {
                                            field487++;
                                        }
                                    }
                                    field513.method2434(field513.field2022 - var16);
                                    if (var17 >= Statics.field271.field237) {
                                        Statics.field271.field237 = 0;
                                    } else {
                                        Statics.field271.field237 -= var17;
                                        for (int var24 = 0; var24 < Statics.field271.field237; var24++) {
                                            Statics.field271.field238[var24] = Statics.field271.field238[var17 + var24];
                                            Statics.field271.field239[var24] = Statics.field271.field239[var17 + var24];
                                        }
                                    }
                                }
                            }
                            if (class77.field1384 == 1 || !Statics.field249 && class77.field1384 == 4 || class77.field1384 == 2) {
                                long var26 = (class77.field1387 - field484) / 50L;
                                if (var26 > 4095L) {
                                    var26 = 4095L;
                                }
                                field484 = class77.field1387;
                                int var28 = class77.field1376;
                                if (var28 < 0) {
                                    var28 = 0;
                                } else if (var28 > 502) {
                                    var28 = 502;
                                }
                                int var29 = class77.field1372;
                                if (var29 < 0) {
                                    var29 = 0;
                                } else if (var29 > 764) {
                                    var29 = 764;
                                }
                                int var30 = var28 * 765 + var29;
                                byte var31 = 0;
                                if (class77.field1384 == 2) {
                                    var31 = 1;
                                }
                                int var32 = (int) var26;
                                field513.method2326(141);
                                field513.method2540((var31 << 19) + (var32 << 20) + var30);
                            }
                            if (class75.field1352 > 0) {
                                field513.method2326(197);
                                field513.method2424(0);
                                int var33 = field513.field2022;
                                long var34 = class121.method1435();
                                for (int var36 = 0; var36 < class75.field1352; var36++) {
                                    long var37 = var34 - field693;
                                    if (var37 > 16777215L) {
                                        var37 = 16777215L;
                                    }
                                    field693 = var34;
                                    field513.method2459(class75.field1356[var36]);
                                    field513.method2476((int) var37);
                                }
                                field513.method2484(field513.field2022 - var33);
                            }
                            if (field559 > 0) {
                                field559--;
                            }
                            if (class75.field1345[96] || class75.field1345[97] || class75.field1345[98] || class75.field1345[99]) {
                                field560 = true;
                            }
                            if (field560 && field559 <= 0) {
                                field559 = 20;
                                field560 = false;
                                field513.method2326(23);
                                field513.method2496(field553);
                                field513.method2496(field554);
                            }
                            if (Statics.field268 && !field488) {
                                field488 = true;
                                field513.method2326(230);
                                field513.method2493(1);
                            }
                            if (!Statics.field268 && field488) {
                                field488 = false;
                                field513.method2326(230);
                                field513.method2493(0);
                            }
                            method131();
                            if (field481 == 30) {
                                for (class22 var39 = (class22) field604.method3343(); var39 != null; var39 = (class22) field604.method3328()) {
                                    if (var39.field348 > 0) {
                                        var39.field348--;
                                    }
                                    if (var39.field348 != 0) {
                                        if (var39.field349 > 0) {
                                            var39.field349--;
                                        }
                                        if (var39.field349 == 0 && var39.field344 >= 1 && var39.field340 >= 1 && var39.field344 <= 102 && var39.field340 <= 102 && (var39.field337 < 0 || class9.method1273(var39.field337, var39.field346))) {
                                            method160(var39.field357, var39.field347, var39.field344, var39.field340, var39.field337, var39.field345, var39.field346);
                                            var39.field349 = -1;
                                            if (var39.field341 == var39.field337 && var39.field341 == -1) {
                                                var39.method3360();
                                            } else if (var39.field341 == var39.field337 && var39.field345 == var39.field342 && var39.field346 == var39.field343) {
                                                var39.method3360();
                                            }
                                        }
                                    } else if (var39.field341 < 0 || class9.method1273(var39.field341, var39.field343)) {
                                        method160(var39.field357, var39.field347, var39.field344, var39.field340, var39.field341, var39.field342, var39.field343);
                                        var39.method3360();
                                    }
                                }
                                int var10002;
                                for (int var40 = 0; var40 < field718; var40++) {
                                    var10002 = field712[var40]--;
                                    if (field712[var40] >= -10) {
                                        class57 var42 = field613[var40];
                                        if (var42 == null) {
                                            class57 var10000 = (class57) null;
                                            var42 = class57.method1260(Statics.field2021, field710[var40], 0);
                                            if (var42 == null) {
                                                continue;
                                            }
                                            field712[var40] += var42.method1263();
                                            field613[var40] = var42;
                                        }
                                        if (field712[var40] < 0) {
                                            int var49;
                                            if (field672[var40] == 0) {
                                                var49 = field707;
                                            } else {
                                                int var43 = (field672[var40] & 0xFF) * 128;
                                                int var44 = field672[var40] >> 16 & 0xFF;
                                                int var45 = var44 * 128 + 64 - Statics.field1096.field442;
                                                if (var45 < 0) {
                                                    var45 = -var45;
                                                }
                                                int var46 = field672[var40] >> 8 & 0xFF;
                                                int var47 = var46 * 128 + 64 - Statics.field1096.field430;
                                                if (var47 < 0) {
                                                    var47 = -var47;
                                                }
                                                int var48 = var45 + var47 - 128;
                                                if (var48 > var43) {
                                                    field712[var40] = -100;
                                                    continue;
                                                }
                                                if (var48 < 0) {
                                                    var48 = 0;
                                                }
                                                var49 = field708 * (var43 - var48) / var43;
                                            }
                                            if (var49 > 0) {
                                                class63 var50 = var42.method1261().method1337(Statics.field332);
                                                class45 var51 = class45.method1024(var50, 100, var49);
                                                var51.method947(field542[var40] - 1);
                                                Statics.field276.method1101(var51);
                                            }
                                            field712[var40] = -100;
                                        }
                                    } else {
                                        field718--;
                                        for (int var41 = var40; var41 < field718; var41++) {
                                            field710[var41] = field710[var41 + 1];
                                            field613[var41] = field613[var41 + 1];
                                            field542[var41] = field542[var41 + 1];
                                            field712[var41] = field712[var41 + 1];
                                            field672[var41] = field672[var41 + 1];
                                        }
                                        var40--;
                                    }
                                }
                                if (field706) {
                                    boolean var52;
                                    if (class140.field2352 == 0) {
                                        var52 = Statics.field246.method2797();
                                    } else {
                                        var52 = true;
                                    }
                                    if (!var52) {
                                        if (field552 != 0 && field657 != -1) {
                                            class140.method2313(Statics.field544, field657, 0, field552, false);
                                        }
                                        field706 = false;
                                    }
                                }
                                field597++;
                                if (field597 > 750) {
                                    Statics.method2419();
                                } else {
                                    for (int var53 = -1; var53 < field590; var53++) {
                                        int var54;
                                        if (var53 == -1) {
                                            var54 = 2047;
                                        } else {
                                            var54 = field591[var53];
                                        }
                                        class3 var55 = field595[var54];
                                        if (var55 != null) {
                                            method893(var55, 1);
                                        }
                                    }
                                    method153();
                                    for (int var56 = -1; var56 < field590; var56++) {
                                        int var57;
                                        if (var56 == -1) {
                                            var57 = 2047;
                                        } else {
                                            var57 = field591[var56];
                                        }
                                        class3 var58 = field595[var57];
                                        if (var58 != null && var58.field458 > 0) {
                                            var58.field458--;
                                            if (var58.field458 == 0) {
                                                var58.field424 = null;
                                            }
                                        }
                                    }
                                    for (int var59 = 0; var59 < field476; var59++) {
                                        int var60 = field511[var59];
                                        class25 var61 = field714[var60];
                                        if (var61 != null && var61.field458 > 0) {
                                            var61.field458--;
                                            if (var61.field458 == 0) {
                                                var61.field424 = null;
                                            }
                                        }
                                    }
                                    field546++;
                                    if (field579 != 0) {
                                        field485 += 20;
                                        if (field485 >= 400) {
                                            field579 = 0;
                                        }
                                    }
                                    if (Statics.field2017 != null) {
                                        field502++;
                                        if (field502 >= 15) {
                                            method882(Statics.field2017);
                                            Statics.field2017 = null;
                                        }
                                    }
                                    class160 var62 = Statics.field1349;
                                    class160 var63 = Statics.field1083;
                                    Statics.field1349 = null;
                                    Statics.field1083 = null;
                                    field644 = null;
                                    field648 = false;
                                    field555 = false;
                                    field533 = 0;
                                    while (true) {
                                        while (class75.method36() && field533 < 128) {
                                            if (field578 >= 2 && class75.field1345[82] && Statics.field1971 == 66) {
                                                String var64 = "";
                                                for (int var65 = 0; var65 < field684 && var65 < 100; var65++) {
                                                    var64 = var64 + field681[var65] + ':' + field620[var65] + '\n';
                                                }
                                                Statics.field46.setContents(new StringSelection(var64), (ClipboardOwner) null);
                                            } else {
                                                field692[field533] = Statics.field1971;
                                                field623[field533] = Statics.field1796;
                                                field533++;
                                            }
                                        }
                                        int var66 = field629;
                                        if (class160.method2728(var66)) {
                                            method52(Statics.field2688[var66], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field556++;
                                        while (true) {
                                            class1 var67;
                                            class160 var68;
                                            class160 var69;
                                            do {
                                                var67 = (class1) field667.method3324();
                                                if (var67 == null) {
                                                    while (true) {
                                                        class1 var70;
                                                        class160 var71;
                                                        class160 var72;
                                                        do {
                                                            var70 = (class1) field668.method3324();
                                                            if (var70 == null) {
                                                                while (true) {
                                                                    class1 var73;
                                                                    class160 var74;
                                                                    class160 var75;
                                                                    do {
                                                                        var73 = (class1) field666.method3324();
                                                                        if (var73 == null) {
                                                                            method1332();
                                                                            if (Statics.field1027 == null && field640 == null) {
                                                                                int var76 = class77.field1384;
                                                                                if (field703) {
                                                                                    if (var76 != 1 && (Statics.field249 || var76 != 4)) {
                                                                                        int var77 = class77.field1378;
                                                                                        int var78 = class77.field1379 * -1108917615;
                                                                                        if (var77 < Statics.field126 - 10 || var77 > Statics.field350 + Statics.field126 + 10 || var78 < Statics.field193 - 10 || var78 > Statics.field761 + Statics.field193 + 10) {
                                                                                            field703 = false;
                                                                                            method806(Statics.field126, Statics.field193, Statics.field350, Statics.field761);
                                                                                        }
                                                                                    }
                                                                                    if (var76 == 1 || !Statics.field249 && var76 == 4) {
                                                                                        int var79 = Statics.field126;
                                                                                        int var80 = Statics.field193;
                                                                                        int var81 = Statics.field350;
                                                                                        int var82 = class77.field1372;
                                                                                        int var83 = class77.field1376;
                                                                                        int var84 = -1;
                                                                                        for (int var85 = 0; var85 < field612; var85++) {
                                                                                            int var86 = (field612 - 1 - var85) * 15 + var80 + 31;
                                                                                            if (var82 > var79 && var82 < var79 + var81 && var83 > var86 - 13 && var83 < var86 + 3) {
                                                                                                var84 = var85;
                                                                                            }
                                                                                        }
                                                                                        if (var84 != -1) {
                                                                                            method224(var84);
                                                                                        }
                                                                                        field703 = false;
                                                                                        method806(Statics.field126, Statics.field193, Statics.field350, Statics.field761);
                                                                                    }
                                                                                } else {
                                                                                    label1239: {
                                                                                        int var88;
                                                                                        int var89;
                                                                                        label1277: {
                                                                                            if ((var76 == 1 || !Statics.field249 && var76 == 4) && field612 > 0) {
                                                                                                int var87 = field658[field612 - 1];
                                                                                                if (var87 == 39 || var87 == 40 || var87 == 41 || var87 == 42 || var87 == 43 || var87 == 33 || var87 == 34 || var87 == 35 || var87 == 36 || var87 == 37 || var87 == 38 || var87 == 1005) {
                                                                                                    var88 = field516[field612 - 1];
                                                                                                    var89 = field614[field612 - 1];
                                                                                                    class160 var90 = class160.method628(var89);
                                                                                                    if (class164.method2712(method216(var90))) {
                                                                                                        break label1277;
                                                                                                    }
                                                                                                    int var91 = method216(var90);
                                                                                                    boolean var92 = (var91 >> 29 & 0x1) != 0;
                                                                                                    if (var92) {
                                                                                                        break label1277;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if ((var76 == 1 || !Statics.field249 && var76 == 4) && (field611 == 1 && field612 > 2 || method47(field612 - 1))) {
                                                                                                var76 = 2;
                                                                                            }
                                                                                            if ((var76 == 1 || !Statics.field249 && var76 == 4) && field612 > 0) {
                                                                                                method224(field612 - 1);
                                                                                            }
                                                                                            if (var76 == 2 && field612 > 0) {
                                                                                                method143();
                                                                                            }
                                                                                            break label1239;
                                                                                        }
                                                                                        if (Statics.field1027 != null && !field586 && field611 != 1 && !method47(field612 - 1) && field612 > 0) {
                                                                                            method224(field612 - 1);
                                                                                        }
                                                                                        field586 = false;
                                                                                        field587 = 0;
                                                                                        if (Statics.field1027 != null) {
                                                                                            method882(Statics.field1027);
                                                                                        }
                                                                                        Statics.field1027 = class160.method628(var89);
                                                                                        field653 = var88;
                                                                                        field583 = class77.field1372;
                                                                                        field584 = class77.field1376;
                                                                                        method882(Statics.field1027);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field640 != null) {
                                                                                method882(field640);
                                                                                Statics.field76++;
                                                                                if (field648 && field555) {
                                                                                    int var93 = class77.field1378;
                                                                                    int var94 = class77.field1379 * -1108917615;
                                                                                    int var95 = var93 - field642;
                                                                                    int var96 = var94 - field499;
                                                                                    if (var95 < field646) {
                                                                                        var95 = field646;
                                                                                    }
                                                                                    if (field640.field2625 + var95 > field646 + field641.field2625) {
                                                                                        var95 = field646 + field641.field2625 - field640.field2625;
                                                                                    }
                                                                                    if (var96 < field647) {
                                                                                        var96 = field647;
                                                                                    }
                                                                                    if (field640.field2626 + var96 > field647 + field641.field2626) {
                                                                                        var96 = field647 + field641.field2626 - field640.field2626;
                                                                                    }
                                                                                    int var97 = var95 - field711;
                                                                                    int var98 = var96 - field650;
                                                                                    int var99 = field640.field2679;
                                                                                    if (Statics.field76 > field640.field2712 && (var97 > var99 || var97 < -var99 || var98 > var99 || var98 < -var99)) {
                                                                                        field651 = true;
                                                                                    }
                                                                                    int var100 = field641.field2629 + (var95 - field646);
                                                                                    int var101 = field641.field2658 + (var96 - field647);
                                                                                    if (field640.field2692 != null && field651) {
                                                                                        class1 var102 = new class1();
                                                                                        var102.field11 = field640;
                                                                                        var102.field4 = var100;
                                                                                        var102.field2 = var101;
                                                                                        var102.field5 = field640.field2692;
                                                                                        class26.method769(var102);
                                                                                    }
                                                                                    if (class77.field1377 == 0) {
                                                                                        if (field651) {
                                                                                            if (field640.field2693 != null) {
                                                                                                class1 var103 = new class1();
                                                                                                var103.field11 = field640;
                                                                                                var103.field4 = var100;
                                                                                                var103.field2 = var101;
                                                                                                var103.field7 = field644;
                                                                                                var103.field5 = field640.field2693;
                                                                                                class26.method769(var103);
                                                                                            }
                                                                                            if (field644 != null && method1385(field640) != null) {
                                                                                                field513.method2326(3);
                                                                                                field513.method2540(field640.field2616);
                                                                                                field513.method2496(field640.field2617);
                                                                                                field513.method2424(field644.field2617);
                                                                                                field513.method2574(field644.field2616);
                                                                                            }
                                                                                        } else if ((field611 == 1 || method47(field612 - 1)) && field612 > 2) {
                                                                                            method143();
                                                                                        } else if (field612 > 0) {
                                                                                            method224(field612 - 1);
                                                                                        }
                                                                                        field640 = null;
                                                                                    }
                                                                                } else if (Statics.field76 > 1) {
                                                                                    field640 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field1027 != null) {
                                                                                method882(Statics.field1027);
                                                                                field587++;
                                                                                if (class77.field1377 == 0) {
                                                                                    if (field586) {
                                                                                        if (Statics.field256 == Statics.field1027 && field653 != field585) {
                                                                                            class160 var104 = Statics.field1027;
                                                                                            byte var105 = 0;
                                                                                            if (field632 == 1 && var104.field2732 == 206) {
                                                                                                var105 = 1;
                                                                                            }
                                                                                            if (var104.field2718[field585] <= 0) {
                                                                                                var105 = 0;
                                                                                            }
                                                                                            int var106 = method216(var104);
                                                                                            boolean var107 = (var106 >> 29 & 0x1) != 0;
                                                                                            if (var107) {
                                                                                                int var108 = field653;
                                                                                                int var109 = field585;
                                                                                                var104.field2718[var109] = var104.field2718[var108];
                                                                                                var104.field2719[var109] = var104.field2719[var108];
                                                                                                var104.field2718[var108] = -1;
                                                                                                var104.field2719[var108] = 0;
                                                                                            } else if (var105 == 1) {
                                                                                                int var110 = field653;
                                                                                                int var111 = field585;
                                                                                                while (var110 != var111) {
                                                                                                    if (var110 > var111) {
                                                                                                        var104.method3183(var110 - 1, var110);
                                                                                                        var110--;
                                                                                                    } else if (var110 < var111) {
                                                                                                        var104.method3183(var110 + 1, var110);
                                                                                                        var110++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var104.method3183(field585, field653);
                                                                                            }
                                                                                            field513.method2326(99);
                                                                                            field513.method2467(field585);
                                                                                            field513.method2460(var105);
                                                                                            field513.method2528(Statics.field1027.field2616);
                                                                                            field513.method2444(field653);
                                                                                        }
                                                                                    } else if ((field611 == 1 || method47(field612 - 1)) && field612 > 2) {
                                                                                        method143();
                                                                                    } else if (field612 > 0) {
                                                                                        method224(field612 - 1);
                                                                                    }
                                                                                    field502 = 10;
                                                                                    class77.field1384 = 0;
                                                                                    Statics.field1027 = null;
                                                                                } else if (field587 >= 5 && (class77.field1378 > field583 + 5 || class77.field1378 < field583 - 5 || class77.field1379 * -1108917615 > field584 + 5 || class77.field1379 * -1108917615 < field584 - 5)) {
                                                                                    field586 = true;
                                                                                }
                                                                            }
                                                                            if (class95.field1575 != -1) {
                                                                                int var112 = class95.field1575;
                                                                                int var113 = class95.field1576;
                                                                                field513.method2326(105);
                                                                                field513.method2493(5);
                                                                                field513.method2459(class75.field1345[82] ? (class75.field1345[81] ? 2 : 1) : 0);
                                                                                field513.method2444(Statics.field924 + var113);
                                                                                field513.method2424(Statics.field252 + var112);
                                                                                class95.field1575 = -1;
                                                                                field726 = class77.field1372;
                                                                                field577 = class77.field1376;
                                                                                field579 = 1;
                                                                                field485 = 0;
                                                                                field656 = var112;
                                                                                field702 = var113;
                                                                            }
                                                                            if (Statics.field1349 != var62) {
                                                                                if (var62 != null) {
                                                                                    method882(var62);
                                                                                }
                                                                                if (Statics.field1349 != null) {
                                                                                    method882(Statics.field1349);
                                                                                }
                                                                            }
                                                                            if (Statics.field1083 != var63 && field621 == field473) {
                                                                                if (var63 != null) {
                                                                                    method882(var63);
                                                                                }
                                                                                if (Statics.field1083 != null) {
                                                                                    method882(Statics.field1083);
                                                                                }
                                                                            }
                                                                            if (Statics.field1083 == null) {
                                                                                if (field621 > 0) {
                                                                                    field621--;
                                                                                }
                                                                            } else if (field621 < field473) {
                                                                                field621++;
                                                                                if (field621 == field473) {
                                                                                    method882(Statics.field1083);
                                                                                }
                                                                            }
                                                                            method2354();
                                                                            if (field715) {
                                                                                method1838();
                                                                            }
                                                                            for (int var114 = 0; var114 < 5; var114++) {
                                                                                var10002 = field720[var114]++;
                                                                            }
                                                                            int var115 = class77.method2201();
                                                                            int var116 = class75.method1839();
                                                                            if (var115 > 15000 && var116 > 15000) {
                                                                                field490 = 250;
                                                                                class77.field1373 = 14500;
                                                                                field513.method2326(64);
                                                                            }
                                                                            field594++;
                                                                            if (field594 > 500) {
                                                                                field594 = 0;
                                                                                int var117 = (int) (Math.random() * 8.0D);
                                                                                if ((var117 & 0x1) == 1) {
                                                                                    field534 += field535;
                                                                                }
                                                                                if ((var117 & 0x2) == 2) {
                                                                                    field536 += field671;
                                                                                }
                                                                                if ((var117 & 0x4) == 4) {
                                                                                    field537 += field539;
                                                                                }
                                                                            }
                                                                            if (field534 < -50) {
                                                                                field535 = 2;
                                                                            }
                                                                            if (field534 > 50) {
                                                                                field535 = -2;
                                                                            }
                                                                            if (field536 < -55) {
                                                                                field671 = 2;
                                                                            }
                                                                            if (field536 > 55) {
                                                                                field671 = -2;
                                                                            }
                                                                            if (field537 < -40) {
                                                                                field539 = 1;
                                                                            }
                                                                            if (field537 > 40) {
                                                                                field539 = -1;
                                                                            }
                                                                            field545++;
                                                                            if (field545 > 500) {
                                                                                field545 = 0;
                                                                                int var118 = (int) (Math.random() * 8.0D);
                                                                                if ((var118 & 0x1) == 1) {
                                                                                    field510 += field547;
                                                                                }
                                                                                if ((var118 & 0x2) == 2) {
                                                                                    field543 += field540;
                                                                                }
                                                                            }
                                                                            if (field510 < -60) {
                                                                                field547 = 2;
                                                                            }
                                                                            if (field510 > 60) {
                                                                                field547 = -2;
                                                                            }
                                                                            if (field543 < -20) {
                                                                                field540 = 1;
                                                                            }
                                                                            if (field543 > 10) {
                                                                                field540 = -1;
                                                                            }
                                                                            for (class28 var119 = (class28) field724.method3285(); var119 != null; var119 = (class28) field724.method3294()) {
                                                                                if ((long) var119.field734 < class121.method1435() / 1000L - 5L) {
                                                                                    if (var119.field735 > 0) {
                                                                                        method220(5, "", var119.field733 + class136.field2226);
                                                                                    }
                                                                                    if (var119.field735 == 0) {
                                                                                        method220(5, "", var119.field733 + class136.field2227);
                                                                                    }
                                                                                    var119.method3355();
                                                                                }
                                                                            }
                                                                            field518++;
                                                                            if (field518 > 50) {
                                                                                field513.method2326(100);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1269 != null && field513.field2022 > 0) {
                                                                                    Statics.field1269.method1421(field513.field2024, 0, field513.field2022);
                                                                                    field513.field2022 = 0;
                                                                                    field518 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var121) {
                                                                                Statics.method2419();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var74 = var73.field11;
                                                                        if (var74.field2617 < 0) {
                                                                            break;
                                                                        }
                                                                        var75 = class160.method628(var74.field2627);
                                                                    } while (var75 == null || var75.field2705 == null || var74.field2617 >= var75.field2705.length || var75.field2705[var74.field2617] != var74);
                                                                    class26.method769(var73);
                                                                }
                                                            }
                                                            var71 = var70.field11;
                                                            if (var71.field2617 < 0) {
                                                                break;
                                                            }
                                                            var72 = class160.method628(var71.field2627);
                                                        } while (var72 == null || var72.field2705 == null || var71.field2617 >= var72.field2705.length || var72.field2705[var71.field2617] != var71);
                                                        class26.method769(var70);
                                                    }
                                                }
                                                var68 = var67.field11;
                                                if (var68.field2617 < 0) {
                                                    break;
                                                }
                                                var69 = class160.method628(var68.field2627);
                                            } while (var69 == null || var69.field2705 == null || var68.field2617 >= var69.field2705.length || var69.field2705[var68.field2617] != var68);
                                            class26.method769(var67);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field481 == 40 || field481 == 45) {
                    method218();
                }
                return;
            }
            var2.field2595.method3116(var2.field2597, (int) var2.field2837, var2.field2593, false);
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method469() {
        boolean var1 = class140.method2734();
        if (var1 && field706 && Statics.field2329 != null) {
            Statics.field2329.method1164();
        }
        if (field1314) {
            Canvas var2 = Statics.field1984;
            var2.removeKeyListener(class75.field1353);
            var2.removeFocusListener(class75.field1353);
            class75.field1348 = -1;
            Statics.method48(Statics.field1984);
            if (Statics.field196 != null) {
                Statics.field196.method1379(Statics.field1984);
            }
            this.method1439();
            class75.method710(Statics.field1984);
            Canvas var3 = Statics.field1984;
            var3.addMouseListener(class77.field1382);
            var3.addMouseMotionListener(class77.field1382);
            var3.addFocusListener(class77.field1382);
            if (Statics.field196 != null) {
                Statics.field196.method1376(Statics.field1984);
            }
        }
        if (field481 == 0) {
            int var4 = class21.field318;
            String var5 = class21.field308;
            Color var6 = null;
            try {
                Graphics var7 = Statics.field1984.getGraphics();
                if (Statics.field1035 == null) {
                    Statics.field1035 = new Font("Helvetica", 1, 13);
                    Statics.field242 = Statics.field1984.getFontMetrics(Statics.field1035);
                }
                if (field1312) {
                    field1312 = false;
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, Statics.field1016, Statics.field1266);
                }
                if (var6 == null) {
                    var6 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field861 == null) {
                        Statics.field861 = Statics.field1984.createImage(304, 34);
                    }
                    Graphics var8 = Statics.field861.getGraphics();
                    var8.setColor(var6);
                    var8.drawRect(0, 0, 303, 33);
                    var8.fillRect(2, 2, var4 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(1, 1, 301, 31);
                    var8.fillRect(var4 * 3 + 2, 2, 300 - var4 * 3, 30);
                    var8.setFont(Statics.field1035);
                    var8.setColor(Color.white);
                    var8.drawString(var5, (304 - Statics.field242.stringWidth(var5)) / 2, 22);
                    var7.drawImage(Statics.field861, Statics.field1016 / 2 - 152, Statics.field1266 / 2 - 18, (ImageObserver) null);
                } catch (Exception var21) {
                    int var10 = Statics.field1016 / 2 - 152;
                    int var11 = Statics.field1266 / 2 - 18;
                    var7.setColor(var6);
                    var7.drawRect(var10, var11, 303, 33);
                    var7.fillRect(var10 + 2, var11 + 2, var4 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var7.fillRect(var4 * 3 + var10 + 2, var11 + 2, 300 - var4 * 3, 30);
                    var7.setFont(Statics.field1035);
                    var7.setColor(Color.white);
                    var7.drawString(var5, var10 + (304 - Statics.field242.stringWidth(var5)) / 2, var11 + 22);
                }
            } catch (Exception var22) {
                Statics.field1984.repaint();
            }
        } else if (field481 == 5) {
            class21.method2181(Statics.field785, Statics.field1031);
        } else if (field481 == 10) {
            class21.method2181(Statics.field785, Statics.field1031);
        } else if (field481 == 20) {
            class21.method2181(Statics.field785, Statics.field1031);
        } else if (field481 == 25) {
            if (field529 == 1) {
                if (field525 > field526) {
                    field526 = field525;
                }
                int var13 = (field526 * 50 - field525 * 50) / field526;
                method876(class136.field2097 + class2.field22 + class2.field19 + var13 + "%" + class2.field20, false);
            } else if (field529 == 2) {
                if (field527 > field489) {
                    field489 = field527;
                }
                int var14 = (field489 * 50 - field527 * 50) / field489 + 50;
                method876(class136.field2097 + class2.field22 + class2.field19 + var14 + "%" + class2.field20, false);
            } else {
                method876(class136.field2097, false);
            }
        } else if (field481 == 30) {
            method1536();
        } else if (field481 == 40) {
            method876(class136.field2098 + class2.field22 + class136.field2099, false);
        } else if (field481 == 45) {
            method876(class136.field2168, false);
        }
        if (field481 == 30 && field483 == 0 && !field1312) {
            try {
                Graphics var15 = Statics.field1984.getGraphics();
                for (int var16 = 0; var16 < field670; var16++) {
                    if (field673[var16]) {
                        Statics.field79.method1624(var15, field675[var16], field676[var16], field674[var16], field475[var16]);
                        field673[var16] = false;
                    }
                }
            } catch (Exception var24) {
                Statics.field1984.repaint();
            }
        } else if (field481 > 0) {
            try {
                Graphics var18 = Statics.field1984.getGraphics();
                Statics.field79.method1605(var18, 0, 0);
                field1312 = false;
                for (int var19 = 0; var19 < field670; var19++) {
                    field673[var19] = false;
                }
            } catch (Exception var23) {
                Statics.field1984.repaint();
            }
        }
    }

    @ObfuscatedName("client.j(I)V")
    public final void method266() {
        if (Statics.field271 != null) {
            Statics.field271.field241 = false;
        }
        Statics.field271 = null;
        if (Statics.field1269 != null) {
            Statics.field1269.method1402();
            Statics.field1269 = null;
        }
        class75.method152();
        class77.method2369();
        Statics.field196 = null;
        if (Statics.field2329 != null) {
            Statics.field2329.method1163();
        }
        if (Statics.field1809 != null) {
            Statics.field1809.method1163();
        }
        class155.method26();
        Object var1 = class159.field2601;
        synchronized (class159.field2601) {
            if (class159.field2603 != 0) {
                class159.field2603 = 1;
                try {
                    class159.field2601.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class82.field1413.method583();
            for (int var4 = 0; var4 < Statics.field1410; var4++) {
                Statics.field1427[var4].method583();
            }
            class82.field1414.method583();
            class82.field1412.method583();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("o.c(II)V")
    public static void method10(int arg0) {
        if (field481 == arg0) {
            return;
        }
        if (field481 == 0) {
            Statics.field861 = null;
            Statics.field1035 = null;
            Statics.field242 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field505 = 0;
            field506 = 0;
            field507 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field273 != null) {
            Statics.field273.method1402();
            Statics.field273 = null;
        }
        if (field481 == 25) {
            field529 = 0;
            field525 = 0;
            field526 = 1;
            field527 = 0;
            field489 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method50(Statics.field1984, Statics.field1246, Statics.field1998);
        } else {
            class21.method18();
        }
        field481 = arg0;
    }

    @ObfuscatedName("client.m(B)V")
    public void method267() {
        if (field481 == 1000) {
            return;
        }
        long var1 = class121.method1435();
        int var3 = (int) (var1 - Statics.field2555);
        Statics.field2555 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class155.field2544 += var3;
        boolean var4;
        if (class155.field2552 == 0 && class155.field2549 == 0 && class155.field2554 == 0 && class155.field2547 == 0) {
            var4 = true;
        } else if (Statics.field2560 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class155.field2544 > 30000) {
                        throw new IOException();
                    }
                    while (class155.field2549 < 20 && class155.field2547 > 0) {
                        class157 var5 = (class157) class155.field2546.method3317();
                        class127 var6 = new class127(4);
                        var6.method2493(1);
                        var6.method2425((int) var5.field2837);
                        Statics.field2560.method1421(var6.field2024, 0, 4);
                        class155.field2557.method3301(var5, var5.field2837);
                        class155.field2547--;
                        class155.field2549++;
                    }
                    while (class155.field2552 < 20 && class155.field2554 > 0) {
                        class157 var7 = (class157) class155.field2550.method3276();
                        class127 var8 = new class127(4);
                        var8.method2493(0);
                        var8.method2425((int) var7.field2837);
                        Statics.field2560.method1421(var8.field2024, 0, 4);
                        var7.method3298();
                        class155.field2553.method3301(var7, var7.field2837);
                        class155.field2554--;
                        class155.field2552++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2560.method1414();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class155.field2544 = 0;
                        byte var11 = 0;
                        if (Statics.field2415 == null) {
                            var11 = 8;
                        } else if (class155.field2558 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class155.field2556.field2022;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2560.method1400(class155.field2556.field2024, class155.field2556.field2022, var12);
                            if (class155.field2562 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class155.field2556.field2024[class155.field2556.field2022 + var13] ^= class155.field2562;
                                }
                            }
                            class155.field2556.field2022 += var12;
                            if (class155.field2556.field2022 < var11) {
                                break;
                            }
                            if (Statics.field2415 == null) {
                                class155.field2556.field2022 = 0;
                                int var14 = class155.field2556.method2440();
                                int var15 = class155.field2556.method2442();
                                int var16 = class155.field2556.method2440();
                                int var17 = class155.field2556.method2586();
                                long var18 = (long) ((var14 << 16) + var15);
                                class157 var20 = (class157) class155.field2557.method3300(var18);
                                Statics.field2563 = true;
                                if (var20 == null) {
                                    var20 = (class157) class155.field2553.method3300(var18);
                                    Statics.field2563 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2415 = var20;
                                Statics.field2548 = new class127(var17 + var21 + Statics.field2415.field2586);
                                Statics.field2548.method2493(var16);
                                Statics.field2548.method2540(var17);
                                class155.field2558 = 8;
                                class155.field2556.field2022 = 0;
                            } else if (class155.field2558 == 0) {
                                if (class155.field2556.field2024[0] == -1) {
                                    class155.field2558 = 1;
                                    class155.field2556.field2022 = 0;
                                } else {
                                    Statics.field2415 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2548.field2024.length - Statics.field2415.field2586;
                            int var23 = 512 - class155.field2558;
                            if (var23 > var22 - Statics.field2548.field2022) {
                                var23 = var22 - Statics.field2548.field2022;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2560.method1400(Statics.field2548.field2024, Statics.field2548.field2022, var23);
                            if (class155.field2562 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2548.field2024[Statics.field2548.field2022 + var24] ^= class155.field2562;
                                }
                            }
                            Statics.field2548.field2022 += var23;
                            class155.field2558 += var23;
                            if (Statics.field2548.field2022 == var22) {
                                if (Statics.field2415.field2837 == 16711935L) {
                                    Statics.field2767 = Statics.field2548;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class156 var26 = class155.field2561[var25];
                                        if (var26 != null) {
                                            Statics.field2767.field2022 = var25 * 8 + 5;
                                            int var27 = Statics.field2767.method2586();
                                            int var28 = Statics.field2767.method2586();
                                            var26.method3111(var27, var28);
                                        }
                                    }
                                } else {
                                    class155.field2543.reset();
                                    class155.field2543.update(Statics.field2548.field2024, 0, var22);
                                    int var29 = (int) class155.field2543.getValue();
                                    if (Statics.field2415.field2584 != var29) {
                                        try {
                                            Statics.field2560.method1402();
                                        } catch (Exception var35) {
                                        }
                                        class155.field2545++;
                                        Statics.field2560 = null;
                                        class155.field2562 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class155.field2545 = 0;
                                    class155.field2564 = 0;
                                    Statics.field2415.field2590.method3112((int) (Statics.field2415.field2837 & 0xFFFFL), Statics.field2548.field2024, (Statics.field2415.field2837 & 0xFF0000L) == 16711680L, Statics.field2563);
                                }
                                Statics.field2415.method3360();
                                if (Statics.field2563) {
                                    class155.field2549--;
                                } else {
                                    class155.field2552--;
                                }
                                class155.field2558 = 0;
                                Statics.field2415 = null;
                                Statics.field2548 = null;
                            } else {
                                if (class155.field2558 != 512) {
                                    break;
                                }
                                class155.field2558 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2560.method1402();
                } catch (Exception var34) {
                }
                class155.field2564++;
                Statics.field2560 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method305();
        }
    }

    @ObfuscatedName("client.a(S)V")
    public void method305() {
        if (class155.field2545 >= 4) {
            this.method1464("js5crc");
            field481 = 1000;
            return;
        }
        if (class155.field2564 >= 4) {
            if (field481 <= 5) {
                this.method1464("js5io");
                field481 = 1000;
                return;
            }
            field679 = 3000;
            class155.field2564 = 3;
        }
        if (--field679 + 1 > 0) {
            return;
        }
        try {
            if (field501 == 0) {
                Statics.field2030 = Statics.field1172.method1506(Statics.field1733, Statics.field2887);
                field501++;
            }
            if (field501 == 1) {
                if (Statics.field2030.field1397 == 2) {
                    this.method269(-1);
                    return;
                }
                if (Statics.field2030.field1397 == 1) {
                    field501++;
                }
            }
            if (field501 == 2) {
                Statics.field1028 = new class70((Socket) Statics.field2030.field1395, Statics.field1172);
                class127 var1 = new class127(5);
                var1.method2493(15);
                var1.method2540(42);
                Statics.field1028.method1421(var1.field2024, 0, 5);
                field501++;
                Statics.field2884 = class121.method1435();
            }
            if (field501 == 3) {
                if (field481 <= 5 || Statics.field1028.method1414() > 0) {
                    int var2 = Statics.field1028.method1423();
                    if (var2 != 0) {
                        this.method269(var2);
                        return;
                    }
                    field501++;
                } else if (class121.method1435() - Statics.field2884 > 30000L) {
                    this.method269(-2);
                    return;
                }
            }
            if (field501 == 4) {
                class70 var3 = Statics.field1028;
                boolean var4 = field481 > 20;
                if (Statics.field2560 != null) {
                    try {
                        Statics.field2560.method1402();
                    } catch (Exception var14) {
                    }
                    Statics.field2560 = null;
                }
                Statics.field2560 = var3;
                class155.method49(var4);
                class155.field2556.field2022 = 0;
                Statics.field2415 = null;
                Statics.field2548 = null;
                class155.field2558 = 0;
                while (true) {
                    class157 var6 = (class157) class155.field2557.method3317();
                    if (var6 == null) {
                        while (true) {
                            class157 var7 = (class157) class155.field2553.method3317();
                            if (var7 == null) {
                                if (class155.field2562 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2493(4);
                                        var8.method2493(class155.field2562);
                                        var8.method2424(0);
                                        Statics.field2560.method1421(var8.field2024, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2560.method1402();
                                        } catch (Exception var12) {
                                        }
                                        class155.field2564++;
                                        Statics.field2560 = null;
                                    }
                                }
                                class155.field2544 = 0;
                                Statics.field2555 = class121.method1435();
                                Statics.field2030 = null;
                                Statics.field1028 = null;
                                field501 = 0;
                                field504 = 0;
                                return;
                            }
                            class155.field2550.method3264(var7);
                            class155.field2551.method3301(var7, var7.field2837);
                            class155.field2554++;
                            class155.field2552--;
                        }
                    }
                    class155.field2546.method3301(var6, var6.field2837);
                    class155.field2547++;
                    class155.field2549--;
                }
            }
        } catch (IOException var15) {
            this.method269(-3);
        }
    }

    @ObfuscatedName("client.e(IB)V")
    public void method269(int arg0) {
        Statics.field2030 = null;
        Statics.field1028 = null;
        field501 = 0;
        if (Statics.field2887 == Statics.field1983) {
            Statics.field2887 = Statics.field290;
        } else {
            Statics.field2887 = Statics.field1983;
        }
        field504++;
        if (field504 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field481 <= 5) {
                this.method1464("js5connect_full");
                field481 = 1000;
            } else {
                field679 = 3000;
            }
        } else if (field504 >= 2 && arg0 == 6) {
            this.method1464("js5connect_outofdate");
            field481 = 1000;
        } else if (field504 >= 4) {
            if (field481 <= 5) {
                this.method1464("js5connect");
                field481 = 1000;
            } else {
                field679 = 3000;
            }
        }
    }

    @ObfuscatedName("dv.q(I)V")
    public static void method2370() {
        if (field480 == 0) {
            Statics.field356 = new class95(4, 104, 104, class9.field109);
            for (int var0 = 0; var0 < 4; var0++) {
                field530[var0] = new class130(104, 104);
            }
            Statics.field2583 = new class86(512, 512);
            class21.field308 = class136.field2298;
            class21.field318 = 5;
            field480 = 20;
        } else if (field480 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1757[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1944(var1, 500, 800, 512, 334);
            class21.field308 = class136.field2101;
            class21.field318 = 10;
            field480 = 30;
        } else if (field480 == 30) {
            Statics.field99 = method1523(0, false, true, true);
            Statics.field2754 = method1523(1, false, true, true);
            Statics.field379 = method1523(2, true, false, true);
            Statics.field1970 = method1523(3, false, true, true);
            Statics.field2021 = method1523(4, false, true, true);
            Statics.field1365 = method1523(5, true, true, true);
            Statics.field544 = method1523(6, true, true, false);
            Statics.field338 = method1523(7, false, true, true);
            Statics.field1998 = method1523(8, false, true, true);
            Statics.field98 = method1523(9, false, true, true);
            Statics.field1246 = method1523(10, false, true, true);
            Statics.field1293 = method1523(11, false, true, true);
            Statics.field25 = method1523(12, false, true, true);
            Statics.field305 = method1523(13, true, false, true);
            Statics.field88 = method1523(14, false, true, false);
            Statics.field2457 = method1523(15, false, true, true);
            class21.field308 = class136.field2102;
            class21.field318 = 20;
            field480 = 40;
        } else if (field480 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field99.method3109() * 4 / 100;
            int var8 = var7 + Statics.field2754.method3109() * 4 / 100;
            int var9 = var8 + Statics.field379.method3109() * 2 / 100;
            int var10 = var9 + Statics.field1970.method3109() * 2 / 100;
            int var11 = var10 + Statics.field2021.method3109() * 6 / 100;
            int var12 = var11 + Statics.field1365.method3109() * 4 / 100;
            int var13 = var12 + Statics.field544.method3109() * 2 / 100;
            int var14 = var13 + Statics.field338.method3109() * 60 / 100;
            int var15 = var14 + Statics.field1998.method3109() * 2 / 100;
            int var16 = var15 + Statics.field98.method3109() * 2 / 100;
            int var17 = var16 + Statics.field1246.method3109() * 2 / 100;
            int var18 = var17 + Statics.field1293.method3109() * 2 / 100;
            int var19 = var18 + Statics.field25.method3109() * 2 / 100;
            int var20 = var19 + Statics.field305.method3109() * 2 / 100;
            int var21 = var20 + Statics.field88.method3109() * 2 / 100;
            int var22 = var21 + Statics.field2457.method3109() * 2 / 100;
            if (var22 == 100) {
                class21.field308 = class136.field2104;
                class21.field318 = 30;
                field480 = 45;
            } else {
                if (var22 != 0) {
                    class21.field308 = class136.field2103 + var22 + "%";
                }
                class21.field318 = 30;
            }
        } else if (field480 == 45) {
            class52.method154(22050, !field479, 2);
            class143 var23 = new class143();
            var23.method2882(9, 128);
            Statics.field2329 = class52.method1371(Statics.field1172, Statics.field1984, 0, 22050);
            Statics.field2329.method1153(var23);
            class140.method2222(Statics.field2457, Statics.field88, Statics.field2021, var23);
            Statics.field1809 = class52.method1371(Statics.field1172, Statics.field1984, 1, 2048);
            Statics.field276 = new class46();
            Statics.field1809.method1153(Statics.field276);
            Statics.field332 = new class62(22050, Statics.field745);
            class21.field308 = class136.field2105;
            class21.field318 = 35;
            field480 = 50;
        } else if (field480 == 50) {
            int var24 = 0;
            if (Statics.field1031 == null) {
                Statics.field1031 = class84.method899(Statics.field1998, Statics.field305, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field864 == null) {
                Statics.field864 = class84.method899(Statics.field1998, Statics.field305, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field785 == null) {
                Statics.field785 = class84.method899(Statics.field1998, Statics.field305, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class21.field308 = class136.field2106 + var24 * 100 / 3 + "%";
                class21.field318 = 40;
            } else {
                Statics.field388 = new class153(true);
                class21.field308 = class136.field2107;
                class21.field318 = 40;
                field480 = 60;
            }
        } else if (field480 == 60) {
            int var25 = class21.method158(Statics.field1246, Statics.field1998);
            byte var26 = 6;
            if (var25 < var26) {
                class21.field308 = class136.field2108 + var25 * 100 / var26 + "%";
                class21.field318 = 50;
            } else {
                class21.field308 = class136.field2109;
                class21.field318 = 50;
                method10(5);
                field480 = 70;
            }
        } else if (field480 == 70) {
            if (Statics.field379.method3058()) {
                class156 var28 = Statics.field379;
                Statics.field929 = var28;
                class156 var29 = Statics.field379;
                Statics.field865 = var29;
                class36.method808(Statics.field379, Statics.field338);
                class32.method1359(Statics.field379, Statics.field338, field479);
                class156 var30 = Statics.field379;
                class156 var31 = Statics.field338;
                Statics.field781 = var30;
                Statics.field789 = var31;
                class156 var32 = Statics.field379;
                class156 var33 = Statics.field338;
                boolean var34 = field478;
                class184 var35 = Statics.field1031;
                Statics.field1017 = var32;
                Statics.field970 = var33;
                Statics.field971 = var34;
                Statics.field1017.method3074(10);
                Statics.field975 = var35;
                class156 var36 = Statics.field379;
                class156 var37 = Statics.field99;
                class156 var38 = Statics.field2754;
                Statics.field882 = var36;
                Statics.field867 = var37;
                Statics.field869 = var38;
                class156 var39 = Statics.field379;
                class156 var40 = Statics.field338;
                Statics.field905 = var39;
                Statics.field893 = var40;
                class156 var41 = Statics.field379;
                Statics.field954 = var41;
                class156 var42 = Statics.field379;
                Statics.field1036 = var42;
                Statics.field1032 = Statics.field1036.method3074(16);
                class160.method108(Statics.field1970, Statics.field338, Statics.field1998, Statics.field305);
                class156 var43 = Statics.field379;
                Statics.field1029 = var43;
                class156 var44 = Statics.field379;
                Statics.field959 = var44;
                class21.field308 = class136.field2111;
                class21.field318 = 60;
                field480 = 80;
            } else {
                class21.field308 = class136.field2203 + Statics.field379.method3120() + "%";
                class21.field318 = 60;
            }
        } else if (field480 == 80) {
            int var45 = 0;
            if (Statics.field96 == null) {
                Statics.field96 = class84.method1601(Statics.field1998, "compass", "");
            } else {
                var45++;
            }
            if (Statics.field125 == null) {
                Statics.field125 = class84.method1601(Statics.field1998, "mapedge", "");
            } else {
                var45++;
            }
            if (Statics.field1901 == null) {
                Statics.field1901 = class84.method1561(Statics.field1998, "mapscene", "");
            } else {
                var45++;
            }
            if (Statics.field2088 == null) {
                Statics.field2088 = class84.method3386(Statics.field1998, "mapfunction", "");
            } else {
                var45++;
            }
            if (Statics.field1640 == null) {
                Statics.field1640 = class84.method3386(Statics.field1998, "hitmarks", "");
            } else {
                var45++;
            }
            if (Statics.field248 == null) {
                Statics.field248 = class84.method3386(Statics.field1998, "headicons_pk", "");
            } else {
                var45++;
            }
            if (Statics.field166 == null) {
                Statics.field166 = class84.method3386(Statics.field1998, "headicons_prayer", "");
            } else {
                var45++;
            }
            if (Statics.field108 == null) {
                Statics.field108 = class84.method3386(Statics.field1998, "headicons_hint", "");
            } else {
                var45++;
            }
            if (Statics.field2487 == null) {
                Statics.field2487 = class84.method3386(Statics.field1998, "mapmarker", "");
            } else {
                var45++;
            }
            if (Statics.field2739 == null) {
                Statics.field2739 = class84.method3386(Statics.field1998, "cross", "");
            } else {
                var45++;
            }
            if (Statics.field1001 == null) {
                Statics.field1001 = class84.method3386(Statics.field1998, "mapdots", "");
            } else {
                var45++;
            }
            if (Statics.field2510 == null) {
                Statics.field2510 = class84.method1561(Statics.field1998, "scrollbar", "");
            } else {
                var45++;
            }
            if (Statics.field97 == null) {
                Statics.field97 = class84.method1561(Statics.field1998, "mod_icons", "");
            } else {
                var45++;
            }
            if (Statics.field2602 == null) {
                Statics.field2602 = class84.method168(Statics.field1998, "mapback", "");
            } else {
                var45++;
            }
            if (var45 < 14) {
                class21.field308 = class136.field2166 + var45 * 100 / 14 + "%";
                class21.field318 = 70;
            } else {
                Statics.field2861 = Statics.field97;
                Statics.field125.method1680();
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 41.0D) - 20;
                for (int var50 = 0; var50 < Statics.field2088.length; var50++) {
                    Statics.field2088[var50].method1679(var46 + var49, var47 + var49, var48 + var49);
                }
                Statics.field1901[0].method1770(var46 + var49, var47 + var49, var48 + var49);
                method240();
                class21.field308 = class136.field2113;
                class21.field318 = 70;
                field480 = 90;
            }
        } else if (field480 == 90) {
            if (Statics.field98.method3058()) {
                class110 var51 = new class110(Statics.field98, Statics.field1998, 20, 0.8D, field479 ? 64 : 128);
                class104.method2120(var51);
                class104.method2129(0.8D);
                class21.field308 = class136.field2115;
                class21.field318 = 90;
                field480 = 110;
            } else {
                class21.field308 = class136.field2114 + Statics.field98.method3120() + "%";
                class21.field318 = 90;
            }
        } else if (field480 == 110) {
            Statics.field271 = new class16();
            Statics.field1172.method1517(Statics.field271, 10);
            class21.field308 = class136.field2116;
            class21.field318 = 94;
            field480 = 120;
        } else if (field480 == 120) {
            if (Statics.field1246.method3047("huffman", "")) {
                class120 var52 = new class120(Statics.field1246.method3046("huffman", ""));
                Statics.field2851 = var52;
                class21.field308 = class136.field2156;
                class21.field318 = 96;
                field480 = 130;
            } else {
                class21.field308 = class136.field2256 + "%";
                class21.field318 = 96;
            }
        } else if (field480 == 130) {
            if (!Statics.field1970.method3058()) {
                class21.field308 = class136.field2119 + Statics.field1970.method3120() * 4 / 5 + "%";
                class21.field318 = 100;
            } else if (!Statics.field25.method3058()) {
                class21.field308 = class136.field2119 + (80 + Statics.field25.method3120() / 6) + "%";
                class21.field318 = 100;
            } else if (Statics.field305.method3058()) {
                class21.field308 = class136.field2303;
                class21.field318 = 100;
                field480 = 140;
            } else {
                class21.field308 = class136.field2119 + (96 + Statics.field305.method3120() / 20) + "%";
                class21.field318 = 100;
            }
        } else if (field480 == 140) {
            method10(10);
        }
    }

    @ObfuscatedName("bk.y(IZZZI)Lee;")
    public static class156 method1523(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1413 != null) {
            var4 = new class71(arg0, class82.field1413, Statics.field1427[arg0], 1000000);
        }
        return new class156(var4, Statics.field2059, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("x.v(I)V")
    public static void method240() {
        Statics.field1257 = new int[33];
        Statics.field2086 = new int[33];
        Statics.field1296 = new int[151];
        Statics.field51 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2602.field1475[Statics.field2602.field1473 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1257[var0] = var1;
            Statics.field2086[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2602.field1475[Statics.field2602.field1473 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1296[var4 - 5] = var5 - 25;
            Statics.field51[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("p.s(B)V")
    public static final void method218() {
        try {
            if (field505 == 0) {
                if (Statics.field1269 != null) {
                    Statics.field1269.method1402();
                    Statics.field1269 = null;
                }
                Statics.field2738 = null;
                field541 = false;
                field506 = 0;
                field505 = 1;
            }
            if (field505 == 1) {
                if (Statics.field2738 == null) {
                    Statics.field2738 = Statics.field1172.method1506(Statics.field1733, Statics.field2887);
                }
                if (Statics.field2738.field1397 == 2) {
                    throw new IOException();
                }
                if (Statics.field2738.field1397 == 1) {
                    Statics.field1269 = new class70((Socket) Statics.field2738.field1395, Statics.field1172);
                    Statics.field2738 = null;
                    field505 = 2;
                }
            }
            if (field505 == 2) {
                field513.field2022 = 0;
                field513.method2493(14);
                Statics.field1269.method1421(field513.field2024, 0, 1);
                field514.field2022 = 0;
                field505 = 3;
            }
            if (field505 == 3) {
                if (Statics.field2329 != null) {
                    Statics.field2329.method1157();
                }
                if (Statics.field1809 != null) {
                    Statics.field1809.method1157();
                }
                int var0 = Statics.field1269.method1423();
                if (Statics.field2329 != null) {
                    Statics.field2329.method1157();
                }
                if (Statics.field1809 != null) {
                    Statics.field1809.method1157();
                }
                if (var0 != 0) {
                    method892(var0);
                    return;
                }
                field514.field2022 = 0;
                field505 = 5;
            }
            if (field505 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field513.field2022 = 0;
                field513.method2493(10);
                field513.method2540(var1[0]);
                field513.method2540(var1[1]);
                field513.method2540(var1[2]);
                field513.method2540(var1[3]);
                field513.method2427(0L);
                field513.method2428(class21.field320);
                field513.method2455(class6.field75, class6.field74);
                field721.field2022 = 0;
                if (field481 == 40) {
                    field721.method2493(18);
                } else {
                    field721.method2493(16);
                }
                field721.method2424(0);
                int var2 = field721.field2022;
                field721.method2540(42);
                field721.method2576(field513.field2024, 0, field513.field2022);
                int var3 = field721.field2022;
                field721.method2428(class21.field314);
                field721.method2493(field479 ? 1 : 0);
                class116 var4 = field721;
                byte[] var5 = new byte[24];
                try {
                    class82.field1412.method584(0L);
                    class82.field1412.method593(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var31) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2576(var5, 0, 24);
                class127 var9 = new class127(Statics.field388.method3020());
                Statics.field388.method3025(var9);
                field721.method2576(var9.field2024, 0, var9.field2024.length);
                field721.method2540(Statics.field99.field2533);
                field721.method2540(Statics.field2754.field2533);
                field721.method2540(Statics.field379.field2533);
                field721.method2540(Statics.field1970.field2533);
                field721.method2540(Statics.field2021.field2533);
                field721.method2540(Statics.field1365.field2533);
                field721.method2540(Statics.field544.field2533);
                field721.method2540(Statics.field338.field2533);
                field721.method2540(Statics.field1998.field2533);
                field721.method2540(Statics.field98.field2533);
                field721.method2540(Statics.field1246.field2533);
                field721.method2540(Statics.field1293.field2533);
                field721.method2540(Statics.field25.field2533);
                field721.method2540(Statics.field305.field2533);
                field721.method2540(Statics.field88.field2533);
                field721.method2540(Statics.field2457.field2533);
                field721.method2453(var1, var3, field721.field2022);
                field721.method2484(field721.field2022 - var2);
                Statics.field1269.method1421(field721.field2024, 0, field721.field2022);
                field513.method2303(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field514.method2303(var1);
                field505 = 6;
            }
            if (field505 == 6 && Statics.field1269.method1414() > 0) {
                int var11 = Statics.field1269.method1423();
                if (var11 == 21 && field481 == 20) {
                    field505 = 7;
                } else if (var11 == 2) {
                    field505 = 9;
                } else if (var11 == 15 && field481 == 40) {
                    Statics.method1392();
                    return;
                } else if (var11 == 23 && field507 < 1) {
                    field507++;
                    field505 = 0;
                } else {
                    method892(var11);
                    return;
                }
            }
            if (field505 == 7 && Statics.field1269.method1414() > 0) {
                field508 = (Statics.field1269.method1423() + 3) * 60;
                field505 = 8;
            }
            if (field505 == 8) {
                field506 = 0;
                class21.method112(class136.field2121, class136.field2145, field508 / 60 + class136.field2123);
                if (--field508 <= 0) {
                    field505 = 0;
                }
            } else {
                if (field505 == 9 && Statics.field1269.method1414() >= 8) {
                    field578 = Statics.field1269.method1423();
                    field637 = Statics.field1269.method1423() == 1;
                    field622 = Statics.field1269.method1423();
                    field622 <<= 0x8;
                    field622 += Statics.field1269.method1423();
                    field596 = Statics.field1269.method1423();
                    Statics.field1269.method1400(field514.field2024, 0, 1);
                    field514.field2022 = 0;
                    field618 = field514.method2304();
                    Statics.field1269.method1400(field514.field2024, 0, 2);
                    field514.field2022 = 0;
                    field515 = field514.method2442();
                    if (field596 == 1) {
                        try {
                            client var12 = Statics.field599;
                            JSObject.getWindow(var12).call("zap", (Object[]) null);
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            client var14 = Statics.field599;
                            JSObject.getWindow(var14).call("unzap", (Object[]) null);
                        } catch (Throwable var29) {
                        }
                    }
                    field505 = 10;
                }
                if (field505 != 10) {
                    field506++;
                    if (field506 > 2000) {
                        if (field507 < 1) {
                            if (Statics.field2887 == Statics.field1983) {
                                Statics.field2887 = Statics.field290;
                            } else {
                                Statics.field2887 = Statics.field1983;
                            }
                            field507++;
                            field505 = 0;
                        } else {
                            method892(-3);
                        }
                    }
                } else if (Statics.field1269.method1414() >= field515) {
                    field514.field2022 = 0;
                    Statics.field1269.method1400(field514.field2024, 0, field515);
                    field484 = -1L;
                    field487 = -1;
                    Statics.field271.field237 = 0;
                    Statics.field268 = true;
                    field488 = true;
                    field693 = -1L;
                    class183.method174();
                    field513.field2022 = 0;
                    field514.field2022 = 0;
                    field618 = -1;
                    field520 = -1;
                    field521 = -1;
                    field605 = -1;
                    field597 = 0;
                    field472 = 0;
                    field490 = 0;
                    field491 = 0;
                    field612 = 0;
                    field703 = false;
                    class77.field1373 = 0;
                    for (int var16 = 0; var16 < 100; var16++) {
                        field620[var16] = null;
                    }
                    field684 = 0;
                    field500 = 0;
                    field625 = false;
                    field718 = 0;
                    field534 = (int) (Math.random() * 100.0D) - 50;
                    field536 = (int) (Math.random() * 110.0D) - 55;
                    field537 = (int) (Math.random() * 80.0D) - 40;
                    field510 = (int) (Math.random() * 120.0D) - 60;
                    field543 = (int) (Math.random() * 30.0D) - 20;
                    field554 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field522 = 0;
                    field576 = -1;
                    field656 = 0;
                    field702 = 0;
                    field590 = 0;
                    field476 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field595[var17] = null;
                        field661[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field714[var18] = null;
                    }
                    Statics.field1096 = field595[2047] = new class3();
                    field615.method3320();
                    field606.method3320();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field603[var19][var20][var21] = null;
                            }
                        }
                    }
                    field604 = new class178();
                    field722 = 0;
                    field538 = 0;
                    field725 = 0;
                    for (int var22 = 0; var22 < Statics.field1032; var22++) {
                        class42 var23 = class42.method157(var22);
                        if (var23 != null && var23.field1034 == 0) {
                            class161.field2735[var22] = 0;
                            class161.field2736[var22] = 0;
                        }
                    }
                    for (int var24 = 0; var24 < field663.length; var24++) {
                        field663[var24] = -1;
                    }
                    if (field629 != -1) {
                        class160.method2729(field629);
                    }
                    for (class4 var25 = (class4) field630.method3317(); var25 != null; var25 = (class4) field630.method3299()) {
                        method2727(var25, true);
                    }
                    field629 = -1;
                    field630 = new class176(8);
                    field633 = null;
                    field703 = false;
                    field612 = 0;
                    field727.method3217((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var26 = 0; var26 < 8; var26++) {
                        field705[var26] = null;
                        field601[var26] = false;
                    }
                    class19.field278 = new class176(32);
                    field580 = true;
                    for (int var27 = 0; var27 < 100; var27++) {
                        field519[var27] = true;
                    }
                    field573 = null;
                    Statics.field764 = 0;
                    Statics.field1200 = null;
                    Statics.field2360 = -1;
                    method2420(false);
                    field618 = -1;
                }
            }
        } catch (IOException var32) {
            if (field507 < 1) {
                if (Statics.field2887 == Statics.field1983) {
                    Statics.field2887 = Statics.field290;
                } else {
                    Statics.field2887 = Statics.field1983;
                }
                field507++;
                field505 = 0;
            } else {
                method892(-2);
            }
        }
    }

    @ObfuscatedName("ab.d(IB)V")
    public static void method892(int arg0) {
        if (arg0 == -3) {
            class21.method112(class136.field2124, class136.field2125, class136.field2126);
        } else if (arg0 == -2) {
            class21.method112(class136.field2117, class136.field2128, class136.field2129);
        } else if (arg0 == -1) {
            class21.method112(class136.field2130, class136.field2309, class136.field2132);
        } else if (arg0 == 3) {
            class21.method112(class136.field2133, class136.field2251, class136.field2135);
        } else if (arg0 == 4) {
            class21.method112(class136.field2155, class136.field2137, class136.field2138);
        } else if (arg0 == 5) {
            class21.method112(class136.field2139, class136.field2140, class136.field2141);
        } else if (arg0 == 6) {
            class21.method112(class136.field2142, class136.field2143, class136.field2144);
        } else if (arg0 == 7) {
            class21.method112(class136.field2250, class136.field2146, class136.field2147);
        } else if (arg0 == 8) {
            class21.method112(class136.field2187, class136.field2149, class136.field2150);
        } else if (arg0 == 9) {
            class21.method112(class136.field2151, class136.field2152, class136.field2153);
        } else if (arg0 == 10) {
            class21.method112(class136.field2296, class136.field2310, class136.field2311);
        } else if (arg0 == 11) {
            class21.method112(class136.field2157, class136.field2192, class136.field2159);
        } else if (arg0 == 12) {
            class21.method112(class136.field2160, class136.field2122, class136.field2162);
        } else if (arg0 == 13) {
            class21.method112(class136.field2163, class136.field2164, class136.field2301);
        } else if (arg0 == 14) {
            class21.method112(class136.field2312, class136.field2288, class136.field2158);
        } else if (arg0 == 16) {
            class21.method112(class136.field2232, class136.field2183, class136.field2315);
        } else if (arg0 == 17) {
            class21.method112(class136.field2205, class136.field2173, class136.field2197);
        } else if (arg0 == 18) {
            class21.method112(class136.field2177, class136.field2176, class136.field2174);
        } else if (arg0 == 19) {
            class21.method112(class136.field2178, class136.field2324, class136.field2180);
        } else if (arg0 == 20) {
            class21.method112(class136.field2181, class136.field2182, class136.field2216);
        } else if (arg0 == 22) {
            class21.method112(class136.field2184, class136.field2278, class136.field2186);
        } else if (arg0 == 23) {
            class21.method112(class136.field2127, class136.field2188, class136.field2179);
        } else if (arg0 == 24) {
            class21.method112(class136.field2190, class136.field2191, class136.field2234);
        } else if (arg0 == 25) {
            class21.method112(class136.field2193, class136.field2194, class136.field2175);
        } else if (arg0 == 26) {
            class21.method112(class136.field2196, class136.field2148, class136.field2210);
        } else if (arg0 == 27) {
            class21.method112(class136.field2199, class136.field2268, class136.field2316);
        } else if (arg0 == 31) {
            class21.method112(class136.field2171, class136.field2209, class136.field2154);
        } else if (arg0 == 32) {
            class21.method112(class136.field2211, class136.field2112, class136.field2213);
        } else if (arg0 == 37) {
            class21.method112(class136.field2214, class136.field2215, class136.field2167);
        } else if (arg0 == 38) {
            class21.method112(class136.field2217, class136.field2204, class136.field2219);
        } else if (arg0 == 55) {
            class21.method112(class136.field2220, class136.field2221, class136.field2222);
        } else {
            class21.method112(class136.field2223, class136.field2260, class136.field2225);
        }
        method10(10);
    }

    @ObfuscatedName("dr.i(I)V")
    public static final void method2355() {
        if (Statics.field1269 != null) {
            Statics.field1269.method1402();
            Statics.field1269 = null;
        }
        method2714();
        Statics.field356.method1984();
        for (int var0 = 0; var0 < 4; var0++) {
            field530[var0].method2677();
        }
        System.gc();
        class140.method2363(2);
        field657 = -1;
        field706 = false;
        for (class7 var1 = (class7) class7.field91.method3343(); var1 != null; var1 = (class7) class7.field91.method3328()) {
            if (var1.field92 != null) {
                Statics.field276.method1102(var1.field92);
                var1.field92 = null;
            }
            if (var1.field85 != null) {
                Statics.field276.method1102(var1.field85);
                var1.field85 = null;
            }
        }
        class7.field91.method3320();
        method10(10);
    }

    @ObfuscatedName("dy.p(I)V")
    public static final void method2714() {
        class37.field930.method3254();
        class33.method241();
        class36.method581();
        class32.field806.method3254();
        class32.field807.method3254();
        class32.field808.method3254();
        class32.field809.method3254();
        class31.method2371();
        Statics.method222();
        class34.field870.method3254();
        class34.field871.method3254();
        class35.method139();
        class38.field947.method3254();
        class42.field1033.method3254();
        class165.method902();
        class160.field2611.method3254();
        class160.field2630.method3254();
        class160.field2645.method3254();
        ((class110) Statics.field1754).method2211();
        class5.field59.method3254();
        Statics.field99.method3042();
        Statics.field2754.method3042();
        Statics.field1970.method3042();
        Statics.field2021.method3042();
        Statics.field1365.method3042();
        Statics.field544.method3042();
        Statics.field338.method3042();
        Statics.field1998.method3042();
        Statics.field98.method3042();
        Statics.field1246.method3042();
        Statics.field1293.method3042();
        Statics.field25.method3042();
    }

    @ObfuscatedName("bf.f(I)V")
    public static final void method1502() {
        if (Statics.field1809 != null) {
            Statics.field1809.method1154();
        }
        if (Statics.field2329 != null) {
            Statics.field2329.method1154();
        }
    }

    @ObfuscatedName("bg.t(Lav;IIII)V")
    public static void method1433(class34 arg0, int arg1, int arg2, int arg3) {
        if (field718 >= 50 || field708 == 0 || arg0.field875 == null || arg1 >= arg0.field875.length) {
            return;
        }
        int var4 = arg0.field875[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field710[field718] = var5;
        field542[field718] = var6;
        field712[field718] = 0;
        field613[field718] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field672[field718] = (var8 << 16) + (var9 << 8) + var7;
        field718++;
    }

    @ObfuscatedName("ae.x(III)V")
    public static void method753(int arg0, int arg1) {
        if (field552 != 0 && arg0 != -1) {
            class140.method2313(Statics.field1293, arg0, 0, field552, false);
            field706 = true;
        }
    }

    @ObfuscatedName("a.ar(I)V")
    public static final void method131() {
        if (field479 && Statics.field1030 != field524) {
            method2017(Statics.field2360, Statics.field124, Statics.field1030, Statics.field1096.field463[0], Statics.field1096.field440[0]);
        } else if (Statics.field1030 != field576) {
            field576 = Statics.field1030;
            int var0 = Statics.field1030;
            int[] var1 = Statics.field2583.field1464;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field110[var0][var6][var4] & 0x18) == 0) {
                        Statics.field356.method1967(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field110[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field356.method1967(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field2583.method1722();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field110[var0][var10][var9] & 0x18) == 0) {
                        method1840(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field110[var0 + 1][var10][var9] & 0x8) != 0) {
                        method1840(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field697 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field356.method1875(Statics.field1030, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class32.method217(var14).field848;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field530[Statics.field1030].field2038;
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
                            field638[field697] = Statics.field2088[var15];
                            field698[field697] = var16;
                            field699[field697] = var17;
                            field697++;
                        }
                    }
                }
            }
            Statics.field79.method1671();
        }
    }

    @ObfuscatedName("cg.au(I)V")
    public static final void method1838() {
        int var0 = Statics.field257 * 128 + 64;
        int var1 = Statics.field2847 * 128 + 64;
        int var2 = method1287(var0, var1, Statics.field1030) - Statics.field468;
        if (Statics.field1225 < var0) {
            Statics.field1225 += Statics.field127 * (var0 - Statics.field1225) / 1000 + Statics.field469;
            if (Statics.field1225 > var0) {
                Statics.field1225 = var0;
            }
        }
        if (Statics.field1225 > var0) {
            Statics.field1225 -= Statics.field127 * (Statics.field1225 - var0) / 1000 + Statics.field469;
            if (Statics.field1225 < var0) {
                Statics.field1225 = var0;
            }
        }
        if (Statics.field104 < var2) {
            Statics.field104 += Statics.field127 * (var2 - Statics.field104) / 1000 + Statics.field469;
            if (Statics.field104 > var2) {
                Statics.field104 = var2;
            }
        }
        if (Statics.field104 > var2) {
            Statics.field104 -= Statics.field127 * (Statics.field104 - var2) / 1000 + Statics.field469;
            if (Statics.field104 < var2) {
                Statics.field104 = var2;
            }
        }
        if (Statics.field1092 < var1) {
            Statics.field1092 += Statics.field127 * (var1 - Statics.field1092) / 1000 + Statics.field469;
            if (Statics.field1092 > var1) {
                Statics.field1092 = var1;
            }
        }
        if (Statics.field1092 > var1) {
            Statics.field1092 -= Statics.field127 * (Statics.field1092 - var1) / 1000 + Statics.field469;
            if (Statics.field1092 < var1) {
                Statics.field1092 = var1;
            }
        }
        int var3 = Statics.field244 * 128 + 64;
        int var4 = Statics.field1259 * 128 + 64;
        int var5 = method1287(var3, var4, Statics.field1030) - Statics.field199;
        int var6 = var3 - Statics.field1225;
        int var7 = var5 - Statics.field104;
        int var8 = var4 - Statics.field1092;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1419 < var10) {
            Statics.field1419 += Statics.field261 * (var10 - Statics.field1419) / 1000 + Statics.field2566;
            if (Statics.field1419 > var10) {
                Statics.field1419 = var10;
            }
        }
        if (Statics.field1419 > var10) {
            Statics.field1419 -= Statics.field261 * (Statics.field1419 - var10) / 1000 + Statics.field2566;
            if (Statics.field1419 < var10) {
                Statics.field1419 = var10;
            }
        }
        int var12 = var11 - Statics.field405;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field405 += Statics.field261 * var12 / 1000 + Statics.field2566;
            Statics.field405 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field405 -= Statics.field261 * -var12 / 1000 + Statics.field2566;
            Statics.field405 &= 0x7FF;
        }
        int var13 = var11 - Statics.field405;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field405 = var11;
        }
    }

    @ObfuscatedName("dr.an(B)V")
    public static final void method2354() {
        int var0 = field534 + Statics.field1096.field442;
        int var1 = field536 + Statics.field1096.field430;
        if (Statics.field822 - var0 < -500 || Statics.field822 - var0 > 500 || Statics.field1420 - var1 < -500 || Statics.field1420 - var1 > 500) {
            Statics.field822 = var0;
            Statics.field1420 = var1;
        }
        if (Statics.field822 != var0) {
            Statics.field822 += (var0 - Statics.field822) / 16;
        }
        if (Statics.field1420 != var1) {
            Statics.field1420 += (var1 - Statics.field1420) / 16;
        }
        if (class77.field1377 == 4 && Statics.field249) {
            int var2 = class77.field1379 * -1108917615 - field558;
            field682 = var2 * 2;
            field558 = var2 == -1 || var2 == 1 ? class77.field1379 * -1108917615 : (field558 + class77.field1379 * -1108917615) / 2;
            int var3 = field704 - class77.field1378;
            field471 = var3 * 2;
            field704 = var3 == -1 || var3 == 1 ? class77.field1378 : (field704 + class77.field1378) / 2;
        } else {
            if (class75.field1345[96]) {
                field471 += (-24 - field471) / 2;
            } else if (class75.field1345[97]) {
                field471 += (24 - field471) / 2;
            } else {
                field471 /= 2;
            }
            if (class75.field1345[98]) {
                field682 += (12 - field682) / 2;
            } else if (class75.field1345[99]) {
                field682 += (-12 - field682) / 2;
            } else {
                field682 /= 2;
            }
            field558 = class77.field1379 * -1108917615;
            field704 = class77.field1378;
        }
        field554 = field471 / 2 + field554 & 0x7FF;
        field553 += field682 / 2;
        if (field553 < 128) {
            field553 = 128;
        }
        if (field553 > 383) {
            field553 = 383;
        }
        int var4 = Statics.field822 >> 7;
        int var5 = Statics.field1420 >> 7;
        int var6 = method1287(Statics.field822, Statics.field1420, Statics.field1030);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1030;
                    if (var10 < 3 && (class9.field110[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class9.field109[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > field512) {
            field512 += (var12 - field512) / 24;
        } else if (var12 < field512) {
            field512 += (var12 - field512) / 80;
        }
    }

    @ObfuscatedName("v.ad(B)V")
    public static final void method153() {
        for (int var0 = 0; var0 < field476; var0++) {
            int var1 = field511[var0];
            class25 var2 = field714[var1];
            if (var2 != null) {
                method893(var2, var2.field395.field774);
            }
        }
    }

    @ObfuscatedName("ab.at(Lar;II)V")
    public static final void method893(class27 arg0, int arg1) {
        if (arg0.field454 > field723) {
            int var2 = arg0.field454 - field723;
            int var3 = arg0.field425 * 128 + arg0.field415 * 64;
            int var4 = arg0.field426 * 128 + arg0.field415 * 64;
            arg0.field442 += (var3 - arg0.field442) / var2;
            arg0.field430 += (var4 - arg0.field430) / var2;
            arg0.field466 = 0;
            if (arg0.field423 == 0) {
                arg0.field459 = 1024;
            }
            if (arg0.field423 == 1) {
                arg0.field459 = 1536;
            }
            if (arg0.field423 == 2) {
                arg0.field459 = 0;
            }
            if (arg0.field423 == 3) {
                arg0.field459 = 512;
            }
        } else if (arg0.field455 >= field723) {
            method21(arg0);
        } else {
            arg0.field456 = arg0.field416;
            if (arg0.field462 == 0) {
                arg0.field466 = 0;
            } else {
                label331: {
                    if (arg0.field414 != -1 && arg0.field443 == 0) {
                        class34 var5 = class34.method2198(arg0.field414);
                        if (arg0.field467 > 0 && var5.field883 == 0) {
                            arg0.field466++;
                            break label331;
                        }
                        if (arg0.field467 <= 0 && var5.field868 == 0) {
                            arg0.field466++;
                            break label331;
                        }
                    }
                    int var6 = arg0.field442;
                    int var7 = arg0.field430;
                    int var8 = arg0.field463[arg0.field462 - 1] * 128 + arg0.field415 * 64;
                    int var9 = arg0.field440[arg0.field462 - 1] * 128 + arg0.field415 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field459 = 1280;
                            } else if (var7 > var9) {
                                arg0.field459 = 1792;
                            } else {
                                arg0.field459 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field459 = 768;
                            } else if (var7 > var9) {
                                arg0.field459 = 256;
                            } else {
                                arg0.field459 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field459 = 1024;
                        } else if (var7 > var9) {
                            arg0.field459 = 0;
                        }
                        int var10 = arg0.field459 - arg0.field413 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field420;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field419;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field412;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field421;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field419;
                        }
                        arg0.field456 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class25) {
                            var13 = ((class25) arg0).field395.field797;
                        }
                        if (var13) {
                            if (arg0.field459 != arg0.field413 && arg0.field434 == -1 && arg0.field448 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field462 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field462 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field466 > 0 && arg0.field462 > 1) {
                                var12 = 8;
                                arg0.field466--;
                            }
                        } else {
                            if (arg0.field462 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field462 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field466 > 0 && arg0.field462 > 1) {
                                var12 = 8;
                                arg0.field466--;
                            }
                        }
                        if (arg0.field465[arg0.field462 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field456 == arg0.field419 && arg0.field411 != -1) {
                            arg0.field456 = arg0.field411;
                        }
                        if (var6 < var8) {
                            arg0.field442 += var12;
                            if (arg0.field442 > var8) {
                                arg0.field442 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field442 -= var12;
                            if (arg0.field442 < var8) {
                                arg0.field442 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field430 += var12;
                            if (arg0.field430 > var9) {
                                arg0.field430 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field430 -= var12;
                            if (arg0.field430 < var9) {
                                arg0.field430 = var9;
                            }
                        }
                        if (arg0.field442 == var8 && arg0.field430 == var9) {
                            arg0.field462--;
                            if (arg0.field467 > 0) {
                                arg0.field467--;
                            }
                        }
                    } else {
                        arg0.field442 = var8;
                        arg0.field430 = var9;
                    }
                }
            }
        }
        if (arg0.field442 < 128 || arg0.field430 < 128 || arg0.field442 >= 13184 || arg0.field430 >= 13184) {
            arg0.field414 = -1;
            arg0.field445 = -1;
            arg0.field454 = 0;
            arg0.field455 = 0;
            arg0.field442 = arg0.field463[0] * 128 + arg0.field415 * 64;
            arg0.field430 = arg0.field440[0] * 128 + arg0.field415 * 64;
            arg0.method244();
        }
        if (Statics.field1096 == arg0 && (arg0.field442 < 1536 || arg0.field430 < 1536 || arg0.field442 >= 11776 || arg0.field430 >= 11776)) {
            arg0.field414 = -1;
            arg0.field445 = -1;
            arg0.field454 = 0;
            arg0.field455 = 0;
            arg0.field442 = arg0.field463[0] * 128 + arg0.field415 * 64;
            arg0.field430 = arg0.field440[0] * 128 + arg0.field415 * 64;
            arg0.method244();
        }
        if (arg0.field448 != 0) {
            if (arg0.field434 != -1 && arg0.field434 < 32768) {
                class25 var14 = field714[arg0.field434];
                if (var14 != null) {
                    int var15 = arg0.field442 - var14.field442;
                    int var16 = arg0.field430 - var14.field430;
                    if (var15 != 0 || var16 != 0) {
                        arg0.field459 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field434 >= 32768) {
                int var17 = arg0.field434 - 32768;
                if (field622 == var17) {
                    var17 = 2047;
                }
                class3 var18 = field595[var17];
                if (var18 != null) {
                    int var19 = arg0.field442 - var18.field442;
                    int var20 = arg0.field430 - var18.field430;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field459 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field464 != 0 || arg0.field436 != 0) && (arg0.field462 == 0 || arg0.field466 > 0)) {
                int var21 = arg0.field442 - (arg0.field464 * 64 - Statics.field252 * 64 - Statics.field252 * 64);
                int var22 = arg0.field430 - (arg0.field436 * 64 - Statics.field924 * 64 - Statics.field924 * 64);
                if (var21 != 0 || var22 != 0) {
                    arg0.field459 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
                arg0.field464 = 0;
                arg0.field436 = 0;
            }
            int var23 = arg0.field459 - arg0.field413 & 0x7FF;
            if (var23 == 0) {
                arg0.field460 = 0;
            } else {
                arg0.field460++;
                if (var23 > 1024) {
                    arg0.field413 -= arg0.field448;
                    boolean var24 = true;
                    if (var23 < arg0.field448 || var23 > 2048 - arg0.field448) {
                        arg0.field413 = arg0.field459;
                        var24 = false;
                    }
                    if (arg0.field456 == arg0.field416 && (arg0.field460 > 25 || var24)) {
                        if (arg0.field417 == -1) {
                            arg0.field456 = arg0.field419;
                        } else {
                            arg0.field456 = arg0.field417;
                        }
                    }
                } else {
                    arg0.field413 += arg0.field448;
                    boolean var25 = true;
                    if (var23 < arg0.field448 || var23 > 2048 - arg0.field448) {
                        arg0.field413 = arg0.field459;
                        var25 = false;
                    }
                    if (arg0.field456 == arg0.field416 && (arg0.field460 > 25 || var25)) {
                        if (arg0.field418 == -1) {
                            arg0.field456 = arg0.field419;
                        } else {
                            arg0.field456 = arg0.field418;
                        }
                    }
                }
                arg0.field413 &= 0x7FF;
            }
        }
        method51(arg0);
    }

    @ObfuscatedName("o.ay(Lar;B)V")
    public static final void method21(class27 arg0) {
        if (field723 == arg0.field455 || arg0.field414 == -1 || arg0.field443 != 0 || arg0.field461 + 1 > class34.method2198(arg0.field414).field877[arg0.field441]) {
            int var1 = arg0.field455 - arg0.field454;
            int var2 = field723 - arg0.field454;
            int var3 = arg0.field425 * 128 + arg0.field415 * 64;
            int var4 = arg0.field426 * 128 + arg0.field415 * 64;
            int var5 = arg0.field435 * 128 + arg0.field415 * 64;
            int var6 = arg0.field453 * 128 + arg0.field415 * 64;
            arg0.field442 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field430 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field466 = 0;
        if (arg0.field423 == 0) {
            arg0.field459 = 1024;
        }
        if (arg0.field423 == 1) {
            arg0.field459 = 1536;
        }
        if (arg0.field423 == 2) {
            arg0.field459 = 0;
        }
        if (arg0.field423 == 3) {
            arg0.field459 = 512;
        }
        arg0.field413 = arg0.field459;
    }

    @ObfuscatedName("g.ac(Lar;B)V")
    public static final void method51(class27 arg0) {
        arg0.field437 = false;
        if (arg0.field456 != -1) {
            class34 var1 = class34.method2198(arg0.field456);
            if (var1 == null || var1.field872 == null) {
                arg0.field456 = -1;
            } else {
                arg0.field439++;
                if (arg0.field438 < var1.field872.length && arg0.field439 > var1.field877[arg0.field438]) {
                    arg0.field439 = 1;
                    arg0.field438++;
                    method1433(var1, arg0.field438, arg0.field442, arg0.field430);
                }
                if (arg0.field438 >= var1.field872.length) {
                    arg0.field439 = 0;
                    arg0.field438 = 0;
                    method1433(var1, arg0.field438, arg0.field442, arg0.field430);
                }
            }
        }
        if (arg0.field445 != -1 && field723 >= arg0.field450) {
            if (arg0.field446 < 0) {
                arg0.field446 = 0;
            }
            int var2 = class35.method2114(arg0.field445).field898;
            if (var2 == -1) {
                arg0.field445 = -1;
            } else {
                class34 var3 = class34.method2198(var2);
                if (var3 == null || var3.field872 == null) {
                    arg0.field445 = -1;
                } else {
                    arg0.field447++;
                    if (arg0.field446 < var3.field872.length && arg0.field447 > var3.field877[arg0.field446]) {
                        arg0.field447 = 1;
                        arg0.field446++;
                        method1433(var3, arg0.field446, arg0.field442, arg0.field430);
                    }
                    if (arg0.field446 >= var3.field872.length && (arg0.field446 < 0 || arg0.field446 >= var3.field872.length)) {
                        arg0.field445 = -1;
                    }
                }
            }
        }
        if (arg0.field414 != -1 && arg0.field443 <= 1) {
            class34 var4 = class34.method2198(arg0.field414);
            if (var4.field883 == 1 && arg0.field467 > 0 && arg0.field454 <= field723 && arg0.field455 < field723) {
                arg0.field443 = 1;
                return;
            }
        }
        if (arg0.field414 != -1 && arg0.field443 == 0) {
            class34 var5 = class34.method2198(arg0.field414);
            if (var5 == null || var5.field872 == null) {
                arg0.field414 = -1;
            } else {
                arg0.field461++;
                if (arg0.field441 < var5.field872.length && arg0.field461 > var5.field877[arg0.field441]) {
                    arg0.field461 = 1;
                    arg0.field441++;
                    method1433(var5, arg0.field441, arg0.field442, arg0.field430);
                }
                if (arg0.field441 >= var5.field872.length) {
                    arg0.field441 -= var5.field876;
                    arg0.field444++;
                    if (arg0.field444 >= var5.field879) {
                        arg0.field414 = -1;
                    } else if (arg0.field441 >= 0 && arg0.field441 < var5.field872.length) {
                        method1433(var5, arg0.field441, arg0.field442, arg0.field430);
                    } else {
                        arg0.field414 = -1;
                    }
                }
                arg0.field437 = var5.field886;
            }
        }
        if (arg0.field443 > 0) {
            arg0.field443--;
        }
    }

    @ObfuscatedName("d.av(Lo;IIB)V")
    public static void method170(class3 arg0, int arg1, int arg2) {
        if (arg0.field414 == arg1 && arg1 != -1) {
            int var3 = class34.method2198(arg1).field885;
            if (var3 == 1) {
                arg0.field441 = 0;
                arg0.field461 = 0;
                arg0.field443 = arg2;
                arg0.field444 = 0;
            }
            if (var3 == 2) {
                arg0.field444 = 0;
            }
        } else if (arg1 == -1 || arg0.field414 == -1 || class34.method2198(arg1).field884 >= class34.method2198(arg0.field414).field884) {
            arg0.field414 = arg1;
            arg0.field441 = 0;
            arg0.field461 = 0;
            arg0.field443 = arg2;
            arg0.field444 = 0;
            arg0.field467 = arg0.field462;
        }
    }

    @ObfuscatedName("bz.ae(I)V")
    public static final void method1536() {
        if (field629 != -1) {
            method2221(field629);
        }
        for (int var0 = 0; var0 < field670; var0++) {
            if (field519[var0]) {
                field673[var0] = true;
            }
            field701[var0] = field519[var0];
            field519[var0] = false;
        }
        field497 = field723;
        field619 = -1;
        field709 = -1;
        Statics.field256 = null;
        if (field629 != -1) {
            field670 = 0;
            method215(field629, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1795();
        if (field703) {
            method23();
        } else if (field619 != -1) {
            int var1 = field619;
            int var2 = field709;
            if (field612 >= 2 || field500 != 0 || field625) {
                String var3;
                if (field500 == 1 && field612 < 2) {
                    var3 = class136.field2229 + class136.field2224 + field624 + " " + class2.field21;
                } else if (field625 && field612 < 2) {
                    var3 = field627 + class136.field2224 + field589 + " " + class2.field21;
                } else {
                    int var4 = field612 - 1;
                    String var5;
                    if (field652[var4].length() > 0) {
                        var5 = field617[var4] + class136.field2224 + field652[var4];
                    } else {
                        var5 = field617[var4];
                    }
                    var3 = var5;
                }
                if (field612 > 2) {
                    var3 = var3 + class2.method2414(16777215) + " " + '/' + " " + (field612 - 2) + class136.field2233;
                }
                Statics.field785.method3402(var3, var1 + 4, var2 + 15, 16777215, 0, field723 / 1000);
            }
        }
        if (field483 == 3) {
            for (int var6 = 0; var6 < field670; var6++) {
                if (field701[var6]) {
                    class89.method1781(field675[var6], field676[var6], field674[var6], field475[var6], 16711935, 128);
                } else if (field673[var6]) {
                    class89.method1781(field675[var6], field676[var6], field674[var6], field475[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field1030;
        int var8 = Statics.field1096.field442;
        int var9 = Statics.field1096.field430;
        int var10 = field546;
        for (class7 var11 = (class7) class7.field91.method3343(); var11 != null; var11 = (class7) class7.field91.method3328()) {
            if (var11.field87 != -1 || var11.field82 != null) {
                int var12 = 0;
                if (var8 > var11.field84) {
                    var12 += var8 - var11.field84;
                } else if (var8 < var11.field95) {
                    var12 += var11.field95 - var8;
                }
                if (var9 > var11.field93) {
                    var12 += var9 - var11.field93;
                } else if (var9 < var11.field83) {
                    var12 += var11.field83 - var9;
                }
                if (var12 - 64 > var11.field86 || field708 == 0 || var11.field81 != var7) {
                    if (var11.field92 != null) {
                        Statics.field276.method1102(var11.field92);
                        var11.field92 = null;
                    }
                    if (var11.field85 != null) {
                        Statics.field276.method1102(var11.field85);
                        var11.field85 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field708 * (var11.field86 - var12) / var11.field86;
                    class57 var10000;
                    if (var11.field92 != null) {
                        var11.field92.method948(var13);
                    } else if (var11.field87 >= 0) {
                        var10000 = (class57) null;
                        class57 var14 = class57.method1260(Statics.field2021, var11.field87, 0);
                        if (var14 != null) {
                            class63 var15 = var14.method1261().method1337(Statics.field332);
                            class45 var16 = class45.method1024(var15, 100, var13);
                            var16.method947(-1);
                            Statics.field276.method1101(var16);
                            var11.field92 = var16;
                        }
                    }
                    if (var11.field85 != null) {
                        var11.field85.method948(var13);
                        if (!var11.field85.method3361()) {
                            var11.field85 = null;
                        }
                    } else if (var11.field82 != null && (var11.field80 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field82.length);
                        var10000 = (class57) null;
                        class57 var18 = class57.method1260(Statics.field2021, var11.field82[var17], 0);
                        if (var18 != null) {
                            class63 var19 = var18.method1261().method1337(Statics.field332);
                            class45 var20 = class45.method1024(var19, 100, var13);
                            var20.method947(0);
                            Statics.field276.method1101(var20);
                            var11.field85 = var20;
                            var11.field80 = var11.field89 + (int) (Math.random() * (double) (var11.field90 - var11.field89));
                        }
                    }
                }
            }
        }
        field546 = 0;
    }

    @ObfuscatedName("af.ah(Ljava/lang/String;ZI)V")
    public static final void method876(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field864.method3443(arg0, 250);
        int var6 = Statics.field864.method3393(arg0, 250) * 13;
        class89.method1782(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1784(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field864.method3398(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method806(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1984.getGraphics();
                Statics.field79.method1605(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1984.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field670; var13++) {
            if (field675[var13] + field674[var13] > var9 && field675[var13] < var9 + var11 && field676[var13] + field475[var13] > var10 && field676[var13] < var10 + var12) {
                field673[var13] = true;
            }
        }
    }

    @ObfuscatedName("m.aq(IIIIB)V")
    public static final void method126(int arg0, int arg1, int arg2, int arg3) {
        class89.method1776(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2126();
        field498++;
        method824(true);
        method1191(true);
        method824(false);
        method1191(false);
        for (class10 var4 = (class10) field615.method3343(); var4 != null; var4 = (class10) field615.method3328()) {
            if (Statics.field1030 != var4.field158 || field723 > var4.field140) {
                var4.method3360();
            } else if (field723 >= var4.field146) {
                if (var4.field143 > 0) {
                    class25 var5 = field714[var4.field143 - 1];
                    if (var5 != null && var5.field442 >= 0 && var5.field442 < 13312 && var5.field430 >= 0 && var5.field430 < 13312) {
                        var4.method109(var5.field442, var5.field430, method1287(var5.field442, var5.field430, var4.field158) - var4.field138, field723);
                    }
                }
                if (var4.field143 < 0) {
                    int var6 = -var4.field143 - 1;
                    class3 var7;
                    if (field622 == var6) {
                        var7 = Statics.field1096;
                    } else {
                        var7 = field595[var6];
                    }
                    if (var7 != null && var7.field442 >= 0 && var7.field442 < 13312 && var7.field430 >= 0 && var7.field430 < 13312) {
                        var4.method109(var7.field442, var7.field430, method1287(var7.field442, var7.field430, var4.field158) - var4.field138, field723);
                    }
                }
                var4.method113(field546);
                Statics.field356.method1858(Statics.field1030, (int) var4.field139, (int) var4.field155, (int) var4.field147, 60, var4, var4.field153, -1, false);
            }
        }
        for (class20 var8 = (class20) field606.method3343(); var8 != null; var8 = (class20) field606.method3328()) {
            if (Statics.field1030 != var8.field295 || var8.field289) {
                var8.method3360();
            } else if (field723 >= var8.field281) {
                var8.method171(field546);
                if (var8.field289) {
                    var8.method3360();
                } else {
                    Statics.field356.method1858(var8.field295, var8.field283, var8.field284, var8.field285, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field715) {
            int var9 = field553;
            if (field512 / 256 > var9) {
                var9 = field512 / 256;
            }
            if (field716[4] && field690[4] + 128 > var9) {
                var9 = field690[4] + 128;
            }
            int var10 = field554 + field537 & 0x7FF;
            int var11 = Statics.field822;
            int var12 = method1287(Statics.field1096.field442, Statics.field1096.field430, Statics.field1030) - 50;
            int var13 = Statics.field1420;
            int var14 = var9 * 3 + 600;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 2048 - var10 & 0x7FF;
            int var17 = 0;
            int var18 = 0;
            int var19 = var14;
            if (var15 != 0) {
                int var20 = class104.field1757[var15];
                int var21 = class104.field1736[var15];
                int var22 = var18 * var21 - var14 * var20 >> 16;
                var19 = var18 * var20 + var14 * var21 >> 16;
                var18 = var22;
            }
            if (var16 != 0) {
                int var23 = class104.field1757[var16];
                int var24 = class104.field1736[var16];
                int var25 = var17 * var24 + var19 * var23 >> 16;
                var19 = var19 * var24 - var17 * var23 >> 16;
                var17 = var25;
            }
            Statics.field1225 = var11 - var17;
            Statics.field104 = var12 - var18;
            Statics.field1092 = var13 - var19;
            Statics.field1419 = var9;
            Statics.field405 = var10;
        }
        int var26;
        if (field715) {
            var26 = method122();
        } else {
            var26 = method44();
        }
        int var27 = Statics.field1225;
        int var28 = Statics.field104;
        int var29 = Statics.field1092;
        int var30 = Statics.field1419;
        int var31 = Statics.field405;
        for (int var32 = 0; var32 < 5; var32++) {
            if (field716[var32]) {
                int var33 = (int) (Math.random() * (double) (field717[var32] * 2 + 1) - (double) field717[var32] + Math.sin((double) field600[var32] / 100.0D * (double) field720[var32]) * (double) field690[var32]);
                if (var32 == 0) {
                    Statics.field1225 += var33;
                }
                if (var32 == 1) {
                    Statics.field104 += var33;
                }
                if (var32 == 2) {
                    Statics.field1092 += var33;
                }
                if (var32 == 3) {
                    Statics.field405 = Statics.field405 + var33 & 0x7FF;
                }
                if (var32 == 4) {
                    Statics.field1419 += var33;
                    if (Statics.field1419 < 128) {
                        Statics.field1419 = 128;
                    }
                    if (Statics.field1419 > 383) {
                        Statics.field1419 = 383;
                    }
                }
            }
        }
        int var34 = class77.field1378;
        int var35 = class77.field1379 * -1108917615;
        if (class77.field1384 != 0) {
            var34 = class77.field1372;
            var35 = class77.field1376;
        }
        if (var34 >= arg0 && var34 < arg0 + arg2 && var35 >= arg1 && var35 < arg1 + arg3) {
            class112.field1830 = true;
            class112.field1849 = 0;
            class112.field1868 = var34 - arg0;
            class112.field1887 = var35 - arg1;
        } else {
            class112.field1830 = false;
            class112.field1849 = 0;
        }
        method1502();
        class89.method1782(arg0, arg1, arg2, arg3, 0);
        method1502();
        Statics.field356.method1926(Statics.field1225, Statics.field104, Statics.field1092, Statics.field1419, Statics.field405, var26);
        method1502();
        Statics.field356.method1861();
        method2015(arg0, arg1, arg2, arg3);
        if (field491 == 2) {
            method27((field494 - Statics.field252 << 7) + field678, (field495 - Statics.field924 << 7) + field482, field496 * 2);
            if (field574 > -1 && field723 % 20 < 10) {
                Statics.field108[0].method1688(field574 + arg0 - 12, field575 + arg1 - 28);
            }
        }
        ((class110) Statics.field1754).method2213(field546);
        method6(arg0, arg1, arg2, arg3);
        Statics.field1225 = var27;
        Statics.field104 = var28;
        Statics.field1092 = var29;
        Statics.field1419 = var30;
        Statics.field405 = var31;
        if (field580 && class155.method1387(true, false) == 0) {
            field580 = false;
        }
        if (field580) {
            class89.method1782(arg0, arg1, arg2, arg3, 0);
            method876(class136.field2097, false);
        }
    }

    @ObfuscatedName("ax.ax(ZB)V")
    public static final void method824(boolean arg0) {
        if (Statics.field1096.field442 >> 7 == field656 && Statics.field1096.field430 >> 7 == field702) {
            field656 = 0;
        }
        int var1 = field590;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1096;
                var4 = 33538048;
            } else {
                var3 = field595[field591[var2]];
                var4 = field591[var2] << 14;
            }
            if (var3 != null && var3.method20()) {
                var3.field44 = false;
                if ((field479 && field590 > 50 || field590 > 200) && !arg0 && var3.field456 == var3.field416) {
                    var3.field44 = true;
                }
                int var5 = var3.field442 >> 7;
                int var6 = var3.field430 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field42 == null || field723 < var3.field33 || field723 >= var3.field35) {
                        if ((var3.field442 & 0x7F) == 64 && (var3.field430 & 0x7F) == 64) {
                            if (field498 == field572[var5][var6]) {
                                continue;
                            }
                            field572[var5][var6] = field498;
                        }
                        var3.field32 = method1287(var3.field442, var3.field430, Statics.field1030);
                        Statics.field356.method1858(Statics.field1030, var3.field442, var3.field430, var3.field32, 60, var3, var3.field413, var4, var3.field437);
                    } else {
                        var3.field44 = false;
                        var3.field32 = method1287(var3.field442, var3.field430, Statics.field1030);
                        Statics.field356.method1859(Statics.field1030, var3.field442, var3.field430, var3.field32, 60, var3, var3.field413, var4, var3.field40, var3.field37, var3.field45, var3.field43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.am(ZI)V")
    public static final void method1191(boolean arg0) {
        for (int var1 = 0; var1 < field476; var1++) {
            class25 var2 = field714[field511[var1]];
            int var3 = (field511[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field395.field775 == arg0 && var2.field395.method608()) {
                int var4 = var2.field442 >> 7;
                int var5 = var2.field430 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field415 == 1 && (var2.field442 & 0x7F) == 64 && (var2.field430 & 0x7F) == 64) {
                        if (field498 == field572[var4][var5]) {
                            continue;
                        }
                        field572[var4][var5] = field498;
                    }
                    if (!var2.field395.field796) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field356.method1858(Statics.field1030, var2.field442, var2.field430, method1287(var2.field442 + (var2.field415 * 64 - 64), var2.field430 + (var2.field415 * 64 - 64), Statics.field1030), var2.field415 * 64 - 64 + 60, var2, var2.field413, var3, var2.field437);
                }
            }
        }
    }

    @ObfuscatedName("z.af(S)I")
    public static final int method44() {
        if (Statics.field2592.field173) {
            return Statics.field1030;
        }
        int var0 = 3;
        if (Statics.field1419 < 310) {
            int var1 = Statics.field1225 >> 7;
            int var2 = Statics.field1092 >> 7;
            int var3 = Statics.field1096.field442 >> 7;
            int var4 = Statics.field1096.field430 >> 7;
            if ((class9.field110[Statics.field1030][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1030;
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
                    if ((class9.field110[Statics.field1030][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1030;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field110[Statics.field1030][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1030;
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
                    if ((class9.field110[Statics.field1030][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1030;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field110[Statics.field1030][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1030;
                        }
                    }
                }
            }
        }
        if ((class9.field110[Statics.field1030][Statics.field1096.field442 >> 7][Statics.field1096.field430 >> 7] & 0x4) != 0) {
            var0 = Statics.field1030;
        }
        return var0;
    }

    @ObfuscatedName("m.ao(I)I")
    public static final int method122() {
        if (Statics.field2592.field173) {
            return Statics.field1030;
        } else {
            int var0 = method1287(Statics.field1225, Statics.field1092, Statics.field1030);
            return var0 - Statics.field104 >= 800 || (class9.field110[Statics.field1030][Statics.field1225 >> 7][Statics.field1092 >> 7] & 0x4) == 0 ? 3 : Statics.field1030;
        }
    }

    @ObfuscatedName("ca.ab(IIIIB)V")
    public static final void method2015(int arg0, int arg1, int arg2, int arg3) {
        field517 = 0;
        for (int var4 = -1; var4 < field590 + field476; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field1096;
            } else if (var4 < field590) {
                var5 = field595[field591[var4]];
            } else {
                var5 = field714[field511[var4 - field590]];
            }
            if (var5 != null && var5.method20()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field395;
                    if (var6.field793 != null) {
                        var6 = var6.method612();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field590) {
                    class31 var9 = ((class25) var5).field395;
                    if (var9.field793 != null) {
                        var9 = var9.method612();
                    }
                    if (var9.field767 >= 0 && var9.field767 < Statics.field166.length) {
                        method2888(var5, var5.field431 + 15);
                        if (field574 > -1) {
                            Statics.field166[var9.field767].method1688(field574 + arg0 - 12, field575 + arg1 - 30);
                        }
                    }
                    if (field491 == 1 && field492 == field511[var4 - field590] && field723 % 20 < 10) {
                        method2888(var5, var5.field431 + 15);
                        if (field574 > -1) {
                            Statics.field108[0].method1688(field574 + arg0 - 12, field575 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field29 != -1 || var8.field30 != -1) {
                        method2888(var5, var5.field431 + 15);
                        if (field574 > -1) {
                            if (var8.field29 != -1) {
                                Statics.field248[var8.field29].method1688(field574 + arg0 - 12, field575 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field30 != -1) {
                                Statics.field166[var8.field30].method1688(field574 + arg0 - 12, field575 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field491 == 10 && field493 == field591[var4]) {
                        method2888(var5, var5.field431 + 15);
                        if (field574 > -1) {
                            Statics.field108[1].method1688(field574 + arg0 - 12, field575 + arg1 - var7);
                        }
                    }
                }
                if (var5.field424 != null && (var4 >= field590 || field686 == 0 || field686 == 3 || field686 == 1 && method2209(((class3) var5).field41))) {
                    method2888(var5, var5.field431);
                    if (field574 > -1 && field517 < field563) {
                        field567[field517] = Statics.field785.method3390(var5.field424) / 2;
                        field566[field517] = Statics.field785.field2858;
                        field564[field517] = field574;
                        field643[field517] = field575;
                        field568[field517] = var5.field470;
                        field569[field517] = var5.field427;
                        field570[field517] = var5.field458;
                        field636[field517] = var5.field424;
                        field517++;
                    }
                }
                if (var5.field422 > field723) {
                    method2888(var5, var5.field431 + 15);
                    if (field574 > -1) {
                        int var10 = var5.field449 * 30 / var5.field433;
                        if (var10 > 30) {
                            var10 = 30;
                        } else if (var10 == 0 && var5.field449 > 0) {
                            var10 = 1;
                        }
                        class89.method1782(field574 + arg0 - 15, field575 + arg1 - 3, var10, 5, 65280);
                        class89.method1782(field574 + arg0 - 15 + var10, field575 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field452[var11] > field723) {
                        method2888(var5, var5.field431 / 2);
                        if (field574 > -1) {
                            if (var11 == 1) {
                                field575 -= 20;
                            }
                            if (var11 == 2) {
                                field574 -= 15;
                                field575 -= 10;
                            }
                            if (var11 == 3) {
                                field574 += 15;
                                field575 -= 10;
                            }
                            Statics.field1640[var5.field429[var11]].method1688(field574 + arg0 - 12, field575 + arg1 - 12);
                            Statics.field1031.method3397(Integer.toString(var5.field428[var11]), field574 + arg0 - 1, field575 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field517; var12++) {
            int var13 = field564[var12];
            int var14 = field643[var12];
            int var15 = field567[var12];
            int var16 = field566[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field643[var18] - field566[var18] && var14 - var16 < field643[var18] + 2 && var13 - var15 < field567[var18] + field564[var18] && var13 + var15 > field564[var18] - field567[var18] && field643[var18] - field566[var18] < var14) {
                        var14 = field643[var18] - field566[var18];
                        var17 = true;
                    }
                }
            }
            field574 = field564[var12];
            field575 = field643[var12] = var14;
            String var19 = field636[var12];
            if (field631 == 0) {
                int var20 = 16776960;
                if (field568[var12] < 6) {
                    var20 = field685[field568[var12]];
                }
                if (field568[var12] == 6) {
                    var20 = field498 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field568[var12] == 7) {
                    var20 = field498 % 20 < 10 ? 255 : 65535;
                }
                if (field568[var12] == 8) {
                    var20 = field498 % 20 < 10 ? 45056 : 8454016;
                }
                if (field568[var12] == 9) {
                    int var21 = 150 - field570[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field568[var12] == 10) {
                    int var22 = 150 - field570[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field568[var12] == 11) {
                    int var23 = 150 - field570[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field569[var12] == 0) {
                    Statics.field785.method3397(var19, field574 + arg0, field575 + arg1, var20, 0);
                }
                if (field569[var12] == 1) {
                    Statics.field785.method3399(var19, field574 + arg0, field575 + arg1, var20, 0, field498);
                }
                if (field569[var12] == 2) {
                    Statics.field785.method3400(var19, field574 + arg0, field575 + arg1, var20, 0, field498);
                }
                if (field569[var12] == 3) {
                    Statics.field785.method3401(var19, field574 + arg0, field575 + arg1, var20, 0, field498, 150 - field570[var12]);
                }
                if (field569[var12] == 4) {
                    int var24 = (150 - field570[var12]) * (Statics.field785.method3390(var19) + 100) / 150;
                    class89.method1777(field574 + arg0 - 50, arg1, field574 + arg0 + 50, arg1 + arg3);
                    Statics.field785.method3467(var19, field574 + arg0 + 50 - var24, field575 + arg1, var20, 0);
                    class89.method1776(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field569[var12] == 5) {
                    int var25 = 150 - field570[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1777(arg0, field575 + arg1 - Statics.field785.field2858 - 1, arg0 + arg2, field575 + arg1 + 5);
                    Statics.field785.method3397(var19, field574 + arg0, field575 + arg1 + var26, var20, 0);
                    class89.method1776(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field785.method3397(var19, field574 + arg0, field575 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("n.aj(B)V")
    public static final void method89() {
        field588 = 0;
        int var0 = (Statics.field1096.field442 >> 7) + Statics.field252;
        int var1 = (Statics.field1096.field430 >> 7) + Statics.field924;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field588 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field588 = 1;
        }
        if (field588 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field588 = 0;
        }
    }

    @ObfuscatedName("b.ag(IIIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3) {
        if (field579 == 1) {
            Statics.field2739[field485 / 100].method1688(field726 - 8, field577 - 8);
        }
        if (field579 == 2) {
            Statics.field2739[field485 / 100 + 4].method1688(field726 - 8, field577 - 8);
        }
        method89();
        if (!field654) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field864.method3474("Fps:" + field1309, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field479) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field479) {
            var8 = 16711680;
        }
        Statics.field864.method3474("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("ef.aw(Lar;IB)V")
    public static final void method2888(class27 arg0, int arg1) {
        method27(arg0.field442, arg0.field430, arg1);
    }

    @ObfuscatedName("w.az(IIII)V")
    public static final void method27(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field574 = -1;
            field575 = -1;
            return;
        }
        int var3 = method1287(arg0, arg1, Statics.field1030) - arg2;
        int var4 = arg0 - Statics.field1225;
        int var5 = var3 - Statics.field104;
        int var6 = arg1 - Statics.field1092;
        int var7 = class104.field1757[Statics.field1419];
        int var8 = class104.field1736[Statics.field1419];
        int var9 = class104.field1757[Statics.field405];
        int var10 = class104.field1736[Statics.field405];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field574 = (var11 << 9) / var15 + 256;
            field575 = (var14 << 9) / var15 + 167;
        } else {
            field574 = -1;
            field575 = -1;
        }
    }

    @ObfuscatedName("bm.al(IIII)I")
    public static final int method1287(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field110[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field109[var5][var3][var4] + class9.field109[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field109[var5][var3][var4 + 1] + class9.field109[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dz.as(ZI)V")
    public static final void method2420(boolean arg0) {
        field531 = arg0;
        if (!field531) {
            int var1 = (field515 - field514.field2022) / 16;
            Statics.field390 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field390[var2][var3] = field514.method2586();
                }
            }
            int var4 = field514.method2442();
            int var5 = field514.method2515();
            int var6 = field514.method2470();
            int var7 = field514.method2629();
            int var8 = field514.method2470();
            Statics.field364 = new int[var1];
            Statics.field1329 = new int[var1];
            Statics.field334 = new int[var1];
            Statics.field945 = new byte[var1][];
            Statics.field1538 = new byte[var1][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field364[var10] = var13;
                        Statics.field1329[var10] = Statics.field1365.method3062("m" + var11 + "_" + var12);
                        Statics.field334[var10] = Statics.field1365.method3062("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2017(var7, var8, var5, var6, var4);
            return;
        }
        int var14 = field514.method2629();
        field514.method2305();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field514.method2306(1);
                    if (var18 == 1) {
                        field532[var15][var16][var17] = field514.method2306(26);
                    } else {
                        field532[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field514.method2307();
        int var19 = (field515 - field514.field2022) / 16;
        Statics.field390 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field390[var20][var21] = field514.method2586();
            }
        }
        int var22 = field514.method2442();
        int var23 = field514.method2470();
        int var24 = field514.method2470();
        int var25 = field514.method2440();
        Statics.field364 = new int[var19];
        Statics.field1329 = new int[var19];
        Statics.field334 = new int[var19];
        Statics.field945 = new byte[var19][];
        Statics.field1538 = new byte[var19][];
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
                            if (Statics.field364[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field364[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1329[var26] = Statics.field1365.method3062("m" + var35 + "_" + var36);
                            Statics.field334[var26] = Statics.field1365.method3062("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2017(var24, var14, var25, var23, var22);
    }

    @ObfuscatedName("ca.ap(IIIIII)V")
    public static final void method2017(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2360 == arg0 && Statics.field124 == arg1 && field524 == arg2 || !field479) {
            return;
        }
        Statics.field2360 = arg0;
        Statics.field124 = arg1;
        field524 = arg2;
        if (!field479) {
            field524 = 0;
        }
        method10(25);
        method876(class136.field2097, true);
        int var5 = Statics.field252;
        int var6 = Statics.field924;
        Statics.field252 = (arg0 - 6) * 8;
        Statics.field924 = (arg1 - 6) * 8;
        int var7 = Statics.field252 - var5;
        int var8 = Statics.field924 - var6;
        int var9 = Statics.field252;
        int var10 = Statics.field924;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field714[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field463[var13] -= var7;
                    var12.field440[var13] -= var8;
                }
                var12.field442 -= var7 * 128;
                var12.field430 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field595[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field463[var16] -= var7;
                    var15.field440[var16] -= var8;
                }
                var15.field442 -= var7 * 128;
                var15.field430 -= var8 * 128;
            }
        }
        Statics.field1030 = arg2;
        Statics.field1096.method243(arg3, arg4, false);
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
                        field603[var27][var23][var24] = field603[var27][var25][var26];
                    } else {
                        field603[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field604.method3343(); var28 != null; var28 = (class22) field604.method3328()) {
            var28.field344 -= var7;
            var28.field340 -= var8;
            if (var28.field344 < 0 || var28.field340 < 0 || var28.field344 >= 104 || var28.field340 >= 104) {
                var28.method3360();
            }
        }
        if (field656 != 0) {
            field656 -= var7;
            field702 -= var8;
        }
        field718 = 0;
        field715 = false;
        field576 = -1;
        field606.method3320();
        field615.method3320();
    }

    @ObfuscatedName("r.ai(ZB)V")
    public static final void method28(boolean arg0) {
        method1502();
        field518++;
        if (field518 < 50 && !arg0) {
            return;
        }
        field518 = 0;
        if (field541 || Statics.field1269 == null) {
            return;
        }
        field513.method2326(100);
        try {
            Statics.field1269.method1421(field513.field2024, 0, field513.field2022);
            field513.field2022 = 0;
        } catch (IOException var2) {
            field541 = true;
        }
    }

    @ObfuscatedName("f.aa(I)V")
    public static final void method225() {
        method28(false);
        field525 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field945.length; var1++) {
            if (Statics.field1329[var1] != -1 && Statics.field945[var1] == null) {
                Statics.field945[var1] = Statics.field1365.method3029(Statics.field1329[var1], 0);
                if (Statics.field945[var1] == null) {
                    var0 = false;
                    field525++;
                }
            }
            if (Statics.field334[var1] != -1 && Statics.field1538[var1] == null) {
                Statics.field1538[var1] = Statics.field1365.method3065(Statics.field334[var1], 0, Statics.field390[var1]);
                if (Statics.field1538[var1] == null) {
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
        for (int var3 = 0; var3 < Statics.field945.length; var3++) {
            byte[] var4 = Statics.field1538[var3];
            if (var4 != null) {
                int var5 = (Statics.field364[var3] >> 8) * 64 - Statics.field252;
                int var6 = (Statics.field364[var3] & 0xFF) * 64 - Statics.field924;
                if (field531) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class127 var9 = new class127(var4);
                int var10 = -1;
                label1044: while (true) {
                    int var11 = var9.method2450();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2450();
                            if (var16 == 0) {
                                continue label1044;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2440() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class32 var22 = class32.method217(var10);
                                if (var19 != 22 || !field479 || var22.field853 != 0 || var22.field831 == 1 || var22.field814) {
                                    if (!var22.method634()) {
                                        field527++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2450();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2440();
                    }
                }
            }
        }
        if (!var2) {
            field529 = 2;
            return;
        }
        if (field529 != 0) {
            method876(class136.field2097 + class2.field22 + class2.field19 + 100 + "%" + class2.field20, true);
        }
        method1502();
        method2714();
        method1502();
        Statics.field356.method1984();
        method1502();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field530[var23].method2677();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field110[var24][var25][var26] = 0;
                }
            }
        }
        method1502();
        class9.field111 = 99;
        Statics.field161 = new byte[4][104][104];
        Statics.field1732 = new byte[4][104][104];
        Statics.field128 = new byte[4][104][104];
        Statics.field113 = new byte[4][104][104];
        Statics.field2470 = new int[4][105][105];
        Statics.field114 = new byte[4][105][105];
        Statics.field115 = new int[105][105];
        Statics.field1768 = new int[104];
        Statics.field2742 = new int[104];
        Statics.field24 = new int[104];
        Statics.field1456 = new int[104];
        Statics.field269 = new int[104];
        int var27 = Statics.field945.length;
        for (class7 var28 = (class7) class7.field91.method3343(); var28 != null; var28 = (class7) class7.field91.method3328()) {
            if (var28.field92 != null) {
                Statics.field276.method1102(var28.field92);
                var28.field92 = null;
            }
            if (var28.field85 != null) {
                Statics.field276.method1102(var28.field85);
                var28.field85 = null;
            }
        }
        class7.field91.method3320();
        method28(true);
        if (!field531) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field364[var29] >> 8) * 64 - Statics.field252;
                int var31 = (Statics.field364[var29] & 0xFF) * 64 - Statics.field924;
                byte[] var32 = Statics.field945[var29];
                if (var32 != null) {
                    method1502();
                    class9.method727(var32, var30, var31, Statics.field2360 * 8 - 48, Statics.field124 * 8 - 48, field530);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field364[var33] >> 8) * 64 - Statics.field252;
                int var35 = (Statics.field364[var33] & 0xFF) * 64 - Statics.field924;
                byte[] var36 = Statics.field945[var33];
                if (var36 == null && Statics.field124 < 800) {
                    method1502();
                    class9.method1288(var34, var35, 64, 64);
                }
            }
            method28(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field1538[var37];
                if (var38 != null) {
                    int var39 = (Statics.field364[var37] >> 8) * 64 - Statics.field252;
                    int var40 = (Statics.field364[var37] & 0xFF) * 64 - Statics.field924;
                    method1502();
                    class95 var41 = Statics.field356;
                    class130[] var42 = field530;
                    class127 var43 = new class127(var38);
                    int var44 = -1;
                    while (true) {
                        int var45 = var43.method2450();
                        if (var45 == 0) {
                            break;
                        }
                        var44 += var45;
                        int var46 = 0;
                        while (true) {
                            int var47 = var43.method2450();
                            if (var47 == 0) {
                                break;
                            }
                            var46 += var47 - 1;
                            int var48 = var46 & 0x3F;
                            int var49 = var46 >> 6 & 0x3F;
                            int var50 = var46 >> 12;
                            int var51 = var43.method2440();
                            int var52 = var51 >> 2;
                            int var53 = var51 & 0x3;
                            int var54 = var39 + var49;
                            int var55 = var40 + var48;
                            if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                int var56 = var50;
                                if ((class9.field110[1][var54][var55] & 0x2) == 2) {
                                    var56 = var50 - 1;
                                }
                                class130 var57 = null;
                                if (var56 >= 0) {
                                    var57 = var42[var56];
                                }
                                class9.method2737(var50, var54, var55, var44, var53, var52, var41, var57);
                            }
                        }
                    }
                }
            }
        }
        if (field531) {
            for (int var58 = 0; var58 < 4; var58++) {
                method1502();
                for (int var59 = 0; var59 < 13; var59++) {
                    for (int var60 = 0; var60 < 13; var60++) {
                        boolean var61 = false;
                        int var62 = field532[var58][var59][var60];
                        if (var62 != -1) {
                            int var63 = var62 >> 24 & 0x3;
                            int var64 = var62 >> 1 & 0x3;
                            int var65 = var62 >> 14 & 0x3FF;
                            int var66 = var62 >> 3 & 0x7FF;
                            int var67 = (var65 / 8 << 8) + var66 / 8;
                            for (int var68 = 0; var68 < Statics.field364.length; var68++) {
                                if (Statics.field364[var68] == var67 && Statics.field945[var68] != null) {
                                    class9.method2200(Statics.field945[var68], var58, var59 * 8, var60 * 8, var63, (var65 & 0x7) * 8, (var66 & 0x7) * 8, var64, field530);
                                    var61 = true;
                                    break;
                                }
                            }
                        }
                        if (!var61) {
                            class9.method2730(var58, var59 * 8, var60 * 8);
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = field532[0][var69][var70];
                    if (var71 == -1) {
                        class9.method1288(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            method28(true);
            for (int var72 = 0; var72 < 4; var72++) {
                method1502();
                for (int var73 = 0; var73 < 13; var73++) {
                    label900: for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = field532[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < Statics.field364.length; var81++) {
                                if (Statics.field364[var81] == var80 && Statics.field1538[var81] != null) {
                                    byte[] var82 = Statics.field1538[var81];
                                    int var83 = var73 * 8;
                                    int var84 = var74 * 8;
                                    int var85 = (var78 & 0x7) * 8;
                                    int var86 = (var79 & 0x7) * 8;
                                    class95 var87 = Statics.field356;
                                    class130[] var88 = field530;
                                    class127 var89 = new class127(var82);
                                    int var90 = -1;
                                    while (true) {
                                        int var91 = var89.method2450();
                                        if (var91 == 0) {
                                            continue label900;
                                        }
                                        var90 += var91;
                                        int var92 = 0;
                                        while (true) {
                                            int var93 = var89.method2450();
                                            if (var93 == 0) {
                                                break;
                                            }
                                            var92 += var93 - 1;
                                            int var94 = var92 & 0x3F;
                                            int var95 = var92 >> 6 & 0x3F;
                                            int var96 = var92 >> 12;
                                            int var97 = var89.method2440();
                                            int var98 = var97 >> 2;
                                            int var99 = var97 & 0x3;
                                            if (var76 == var96 && var95 >= var85 && var95 < var85 + 8 && var94 >= var86 && var94 < var86 + 8) {
                                                class32 var100 = class32.method217(var90);
                                                int var102 = var95 & 0x7;
                                                int var103 = var94 & 0x7;
                                                int var105 = var100.field819;
                                                int var106 = var100.field820;
                                                if ((var99 & 0x1) == 1) {
                                                    int var107 = var105;
                                                    var105 = var106;
                                                    var106 = var107;
                                                }
                                                int var108 = var77 & 0x3;
                                                int var109;
                                                if (var108 == 0) {
                                                    var109 = var102;
                                                } else if (var108 == 1) {
                                                    var109 = var103;
                                                } else if (var108 == 2) {
                                                    var109 = 7 - var102 - (var105 - 1);
                                                } else {
                                                    var109 = 7 - var103 - (var106 - 1);
                                                }
                                                int var110 = var83 + var109;
                                                int var111 = var84 + class162.method114(var95 & 0x7, var94 & 0x7, var77, var100.field819, var100.field820, var99);
                                                if (var110 > 0 && var111 > 0 && var110 < 103 && var111 < 103) {
                                                    int var112 = var72;
                                                    if ((class9.field110[1][var110][var111] & 0x2) == 2) {
                                                        var112 = var72 - 1;
                                                    }
                                                    class130 var113 = null;
                                                    if (var112 >= 0) {
                                                        var113 = var88[var112];
                                                    }
                                                    class9.method2737(var72, var110, var111, var90, var77 + var99 & 0x3, var98, var87, var113);
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
        method28(true);
        method2714();
        method1502();
        class95 var114 = Statics.field356;
        class130[] var115 = field530;
        for (int var116 = 0; var116 < 4; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                for (int var118 = 0; var118 < 104; var118++) {
                    if ((class9.field110[var116][var117][var118] & 0x1) == 1) {
                        int var119 = var116;
                        if ((class9.field110[1][var117][var118] & 0x2) == 2) {
                            var119 = var116 - 1;
                        }
                        if (var119 >= 0) {
                            var115[var119].method2680(var117, var118);
                        }
                    }
                }
            }
        }
        class9.field122 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field122 < -8) {
            class9.field122 = -8;
        }
        if (class9.field122 > 8) {
            class9.field122 = 8;
        }
        class9.field120 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field120 < -16) {
            class9.field120 = -16;
        }
        if (class9.field120 > 16) {
            class9.field120 = 16;
        }
        for (int var120 = 0; var120 < 4; var120++) {
            byte[][] var121 = Statics.field114[var120];
            int var122 = (int) Math.sqrt(5100.0D);
            int var123 = var122 * 768 >> 8;
            for (int var124 = 1; var124 < 103; var124++) {
                for (int var125 = 1; var125 < 103; var125++) {
                    int var126 = class9.field109[var120][var125 + 1][var124] - class9.field109[var120][var125 - 1][var124];
                    int var127 = class9.field109[var120][var125][var124 + 1] - class9.field109[var120][var125][var124 - 1];
                    int var128 = (int) Math.sqrt((double) (var127 * var127 + var126 * var126 + 65536));
                    int var129 = (var126 << 8) / var128;
                    int var130 = 65536 / var128;
                    int var131 = (var127 << 8) / var128;
                    int var132 = (var131 * -50 + var129 * -50 + var130 * -10) / var123 + 96;
                    int var133 = (var121[var125][var124] >> 1) + (var121[var125][var124 + 1] >> 3) + (var121[var125][var124 - 1] >> 2) + (var121[var125 - 1][var124] >> 2) + (var121[var125 + 1][var124] >> 3);
                    Statics.field115[var125][var124] = var132 - var133;
                }
            }
            for (int var134 = 0; var134 < 104; var134++) {
                Statics.field1768[var134] = 0;
                Statics.field2742[var134] = 0;
                Statics.field24[var134] = 0;
                Statics.field1456[var134] = 0;
                Statics.field269[var134] = 0;
            }
            for (int var135 = -5; var135 < 109; var135++) {
                for (int var136 = 0; var136 < 104; var136++) {
                    int var137 = var135 + 5;
                    int var10002;
                    if (var137 >= 0 && var137 < 104) {
                        int var138 = Statics.field161[var120][var137][var136] & 0xFF;
                        if (var138 > 0) {
                            class33 var139 = class33.method219(var138 - 1);
                            Statics.field1768[var136] += var139.field859;
                            Statics.field2742[var136] += var139.field860;
                            Statics.field24[var136] += var139.field866;
                            Statics.field1456[var136] += var139.field862;
                            var10002 = Statics.field269[var136]++;
                        }
                    }
                    int var140 = var135 - 5;
                    if (var140 >= 0 && var140 < 104) {
                        int var141 = Statics.field161[var120][var140][var136] & 0xFF;
                        if (var141 > 0) {
                            class33 var142 = class33.method219(var141 - 1);
                            Statics.field1768[var136] -= var142.field859;
                            Statics.field2742[var136] -= var142.field860;
                            Statics.field24[var136] -= var142.field866;
                            Statics.field1456[var136] -= var142.field862;
                            var10002 = Statics.field269[var136]--;
                        }
                    }
                }
                if (var135 >= 1 && var135 < 103) {
                    int var143 = 0;
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    for (int var148 = -5; var148 < 109; var148++) {
                        int var149 = var148 + 5;
                        if (var149 >= 0 && var149 < 104) {
                            var143 += Statics.field1768[var149];
                            var144 += Statics.field2742[var149];
                            var145 += Statics.field24[var149];
                            var146 += Statics.field1456[var149];
                            var147 += Statics.field269[var149];
                        }
                        int var150 = var148 - 5;
                        if (var150 >= 0 && var150 < 104) {
                            var143 -= Statics.field1768[var150];
                            var144 -= Statics.field2742[var150];
                            var145 -= Statics.field24[var150];
                            var146 -= Statics.field1456[var150];
                            var147 -= Statics.field269[var150];
                        }
                        if (var148 >= 1 && var148 < 103 && (!field479 || (class9.field110[0][var135][var148] & 0x2) != 0 || (class9.field110[var120][var135][var148] & 0x10) == 0 && class9.method22(var120, var135, var148) == field524)) {
                            if (var120 < class9.field111) {
                                class9.field111 = var120;
                            }
                            int var151 = Statics.field161[var120][var135][var148] & 0xFF;
                            int var152 = Statics.field1732[var120][var135][var148] & 0xFF;
                            if (var151 > 0 || var152 > 0) {
                                int var153 = class9.field109[var120][var135][var148];
                                int var154 = class9.field109[var120][var135 + 1][var148];
                                int var155 = class9.field109[var120][var135 + 1][var148 + 1];
                                int var156 = class9.field109[var120][var135][var148 + 1];
                                int var157 = Statics.field115[var135][var148];
                                int var158 = Statics.field115[var135 + 1][var148];
                                int var159 = Statics.field115[var135 + 1][var148 + 1];
                                int var160 = Statics.field115[var135][var148 + 1];
                                int var161 = -1;
                                int var162 = -1;
                                if (var151 > 0) {
                                    int var163 = var143 * 256 / var146;
                                    int var164 = var144 / var147;
                                    int var165 = var145 / var147;
                                    var161 = class9.method1434(var163, var164, var165);
                                    int var166 = class9.field122 + var163 & 0xFF;
                                    int var167 = class9.field120 + var165;
                                    if (var167 < 0) {
                                        var167 = 0;
                                    } else if (var167 > 255) {
                                        var167 = 255;
                                    }
                                    var162 = class9.method1434(var166, var164, var167);
                                }
                                if (var120 > 0) {
                                    boolean var168 = true;
                                    if (var151 == 0 && Statics.field128[var120][var135][var148] != 0) {
                                        var168 = false;
                                    }
                                    if (var152 > 0 && !class37.method116(var152 - 1).field936) {
                                        var168 = false;
                                    }
                                    if (var168 && var153 == var154 && var153 == var155 && var153 == var156) {
                                        Statics.field2470[var120][var135][var148] |= 0x924;
                                    }
                                }
                                int var169 = 0;
                                if (var162 != -1) {
                                    var169 = class104.field1734[class9.method1334(var162, 96)];
                                }
                                if (var152 == 0) {
                                    var114.method1954(var120, var135, var148, 0, 0, -1, var153, var154, var155, var156, class9.method1334(var161, var157), class9.method1334(var161, var158), class9.method1334(var161, var159), class9.method1334(var161, var160), 0, 0, 0, 0, var169, 0);
                                } else {
                                    int var170 = Statics.field128[var120][var135][var148] + 1;
                                    byte var171 = Statics.field113[var120][var135][var148];
                                    class37 var172 = class37.method116(var152 - 1);
                                    int var173 = var172.field932;
                                    int var174;
                                    int var175;
                                    if (var173 >= 0) {
                                        var174 = Statics.field1754.method2184(var173);
                                        var175 = -1;
                                    } else if (var172.field931 == 16711935) {
                                        var175 = -2;
                                        var173 = -1;
                                        var174 = -2;
                                    } else {
                                        var175 = class9.method1434(var172.field935, var172.field934, var172.field943);
                                        int var176 = class9.field122 + var172.field935 & 0xFF;
                                        int var177 = class9.field120 + var172.field943;
                                        if (var177 < 0) {
                                            var177 = 0;
                                        } else if (var177 > 255) {
                                            var177 = 255;
                                        }
                                        var174 = class9.method1434(var176, var172.field934, var177);
                                    }
                                    int var178 = 0;
                                    if (var174 != -2) {
                                        var178 = class104.field1734[class9.method1391(var174, 96)];
                                    }
                                    if (var172.field933 != -1) {
                                        int var179 = class9.field122 + var172.field938 & 0xFF;
                                        int var180 = class9.field120 + var172.field940;
                                        if (var180 < 0) {
                                            var180 = 0;
                                        } else if (var180 > 255) {
                                            var180 = 255;
                                        }
                                        int var181 = class9.method1434(var179, var172.field939, var180);
                                        var178 = class104.field1734[class9.method1391(var181, 96)];
                                    }
                                    var114.method1954(var120, var135, var148, var170, var171, var173, var153, var154, var155, var156, class9.method1334(var161, var157), class9.method1334(var161, var158), class9.method1334(var161, var159), class9.method1334(var161, var160), class9.method1391(var175, var157), class9.method1391(var175, var158), class9.method1391(var175, var159), class9.method1391(var175, var160), var169, var178);
                                }
                            }
                        }
                    }
                }
            }
            for (int var182 = 1; var182 < 103; var182++) {
                for (int var183 = 1; var183 < 103; var183++) {
                    var114.method1851(var120, var183, var182, class9.method22(var120, var183, var182));
                }
            }
            Statics.field161[var120] = (byte[][]) null;
            Statics.field1732[var120] = (byte[][]) null;
            Statics.field128[var120] = (byte[][]) null;
            Statics.field113[var120] = (byte[][]) null;
            Statics.field114[var120] = (byte[][]) null;
        }
        var114.method1877(-50, -10, -50);
        for (int var184 = 0; var184 < 104; var184++) {
            for (int var185 = 0; var185 < 104; var185++) {
                if ((class9.field110[1][var184][var185] & 0x2) == 2) {
                    var114.method1849(var184, var185);
                }
            }
        }
        int var186 = 1;
        int var187 = 2;
        int var188 = 4;
        for (int var189 = 0; var189 < 4; var189++) {
            if (var189 > 0) {
                var186 <<= 0x3;
                var187 <<= 0x3;
                var188 <<= 0x3;
            }
            for (int var190 = 0; var190 <= var189; var190++) {
                for (int var191 = 0; var191 <= 104; var191++) {
                    for (int var192 = 0; var192 <= 104; var192++) {
                        if ((Statics.field2470[var190][var192][var191] & var186) != 0) {
                            int var193 = var191;
                            int var194 = var191;
                            int var195 = var190;
                            int var196 = var190;
                            while (var193 > 0 && (Statics.field2470[var190][var192][var193 - 1] & var186) != 0) {
                                var193--;
                            }
                            while (var194 < 104 && (Statics.field2470[var190][var192][var194 + 1] & var186) != 0) {
                                var194++;
                            }
                            label633: while (var195 > 0) {
                                for (int var197 = var193; var197 <= var194; var197++) {
                                    if ((Statics.field2470[var195 - 1][var192][var197] & var186) == 0) {
                                        break label633;
                                    }
                                }
                                var195--;
                            }
                            label622: while (var196 < var189) {
                                for (int var198 = var193; var198 <= var194; var198++) {
                                    if ((Statics.field2470[var196 + 1][var192][var198] & var186) == 0) {
                                        break label622;
                                    }
                                }
                                var196++;
                            }
                            int var199 = (var196 + 1 - var195) * (var194 - var193 + 1);
                            if (var199 >= 8) {
                                short var200 = 240;
                                int var201 = class9.field109[var196][var192][var193] - var200;
                                int var202 = class9.field109[var195][var192][var193];
                                class95.method1870(var189, 1, var192 * 128, var192 * 128, var193 * 128, var194 * 128 + 128, var201, var202);
                                for (int var203 = var195; var203 <= var196; var203++) {
                                    for (int var204 = var193; var204 <= var194; var204++) {
                                        Statics.field2470[var203][var192][var204] &= ~var186;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2470[var190][var192][var191] & var187) != 0) {
                            int var205 = var192;
                            int var206 = var192;
                            int var207 = var190;
                            int var208 = var190;
                            while (var205 > 0 && (Statics.field2470[var190][var205 - 1][var191] & var187) != 0) {
                                var205--;
                            }
                            while (var206 < 104 && (Statics.field2470[var190][var206 + 1][var191] & var187) != 0) {
                                var206++;
                            }
                            label686: while (var207 > 0) {
                                for (int var209 = var205; var209 <= var206; var209++) {
                                    if ((Statics.field2470[var207 - 1][var209][var191] & var187) == 0) {
                                        break label686;
                                    }
                                }
                                var207--;
                            }
                            label675: while (var208 < var189) {
                                for (int var210 = var205; var210 <= var206; var210++) {
                                    if ((Statics.field2470[var208 + 1][var210][var191] & var187) == 0) {
                                        break label675;
                                    }
                                }
                                var208++;
                            }
                            int var211 = (var208 + 1 - var207) * (var206 - var205 + 1);
                            if (var211 >= 8) {
                                short var212 = 240;
                                int var213 = class9.field109[var208][var205][var191] - var212;
                                int var214 = class9.field109[var207][var205][var191];
                                class95.method1870(var189, 2, var205 * 128, var206 * 128 + 128, var191 * 128, var191 * 128, var213, var214);
                                for (int var215 = var207; var215 <= var208; var215++) {
                                    for (int var216 = var205; var216 <= var206; var216++) {
                                        Statics.field2470[var215][var216][var191] &= ~var187;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2470[var190][var192][var191] & var188) != 0) {
                            int var217 = var192;
                            int var218 = var192;
                            int var219 = var191;
                            int var220 = var191;
                            while (var219 > 0 && (Statics.field2470[var190][var192][var219 - 1] & var188) != 0) {
                                var219--;
                            }
                            while (var220 < 104 && (Statics.field2470[var190][var192][var220 + 1] & var188) != 0) {
                                var220++;
                            }
                            label739: while (var217 > 0) {
                                for (int var221 = var219; var221 <= var220; var221++) {
                                    if ((Statics.field2470[var190][var217 - 1][var221] & var188) == 0) {
                                        break label739;
                                    }
                                }
                                var217--;
                            }
                            label728: while (var218 < 104) {
                                for (int var222 = var219; var222 <= var220; var222++) {
                                    if ((Statics.field2470[var190][var218 + 1][var222] & var188) == 0) {
                                        break label728;
                                    }
                                }
                                var218++;
                            }
                            if ((var218 - var217 + 1) * (var220 - var219 + 1) >= 4) {
                                int var223 = class9.field109[var190][var217][var219];
                                class95.method1870(var189, 4, var217 * 128, var218 * 128 + 128, var219 * 128, var220 * 128 + 128, var223, var223);
                                for (int var224 = var217; var224 <= var218; var224++) {
                                    for (int var225 = var219; var225 <= var220; var225++) {
                                        Statics.field2470[var190][var224][var225] &= ~var188;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method28(true);
        int var226 = class9.field111;
        if (var226 > Statics.field1030) {
            var226 = Statics.field1030;
        }
        if (var226 < Statics.field1030 - 1) {
            int var227 = Statics.field1030 - 1;
        }
        if (field479) {
            Statics.field356.method1848(class9.field111);
        } else {
            Statics.field356.method1848(0);
        }
        for (int var228 = 0; var228 < 104; var228++) {
            for (int var229 = 0; var229 < 104; var229++) {
                method838(var228, var229);
            }
        }
        method1502();
        method2953();
        class32.field807.method3254();
        if (Statics.field123 != null) {
            field513.method2326(52);
            field513.method2540(1057001181);
        }
        if (!field531) {
            int var230 = (Statics.field2360 - 6) / 8;
            int var231 = (Statics.field2360 + 6) / 8;
            int var232 = (Statics.field124 - 6) / 8;
            int var233 = (Statics.field124 + 6) / 8;
            for (int var234 = var230 - 1; var234 <= var231 + 1; var234++) {
                for (int var235 = var232 - 1; var235 <= var233 + 1; var235++) {
                    if (var234 < var230 || var234 > var231 || var235 < var232 || var235 > var233) {
                        Statics.field1365.method3048("m" + var234 + "_" + var235);
                        Statics.field1365.method3048("l" + var234 + "_" + var235);
                    }
                }
            }
        }
        method10(30);
        method1502();
        class9.method145();
        field513.method2326(166);
        class73.method31();
    }

    @ObfuscatedName("cm.ak(IIIIII)V")
    public static final void method1840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field356.method1872(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field356.method1876(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2583.field1464;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method217(var12);
            if (var13.field833 == -1) {
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
                class87 var14 = Statics.field1901[var13.field833];
                if (var14 != null) {
                    int var15 = (var13.field819 * 4 - var14.field1473) / 2;
                    int var16 = (var13.field820 * 4 - var14.field1472) / 2;
                    var14.method1765(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field820) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field356.method1874(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field356.method1876(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method217(var21);
            if (var22.field833 != -1) {
                class87 var23 = Statics.field1901[var22.field833];
                if (var23 != null) {
                    int var24 = (var22.field819 * 4 - var23.field1473) / 2;
                    int var25 = (var22.field820 * 4 - var23.field1472) / 2;
                    var23.method1765(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field820) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2583.field1464;
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
        int var29 = Statics.field356.method1875(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method217(var30);
        if (var31.field833 == -1) {
            return;
        }
        class87 var32 = Statics.field1901[var31.field833];
        if (var32 != null) {
            int var33 = (var31.field819 * 4 - var32.field1473) / 2;
            int var34 = (var31.field820 * 4 - var32.field1472) / 2;
            var32.method1765(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field820) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bu.bi(B)Z")
    public static final boolean method1395() {
        if (Statics.field1269 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1269.method1414();
            if (var0 == 0) {
                return false;
            }
            if (field618 == -1) {
                Statics.field1269.method1400(field514.field2024, 0, 1);
                field514.field2022 = 0;
                field618 = field514.method2304();
                field515 = class166.field2789[field618];
                var0--;
            }
            if (field515 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1269.method1400(field514.field2024, 0, 1);
                field515 = field514.field2024[0] & 0xFF;
                var0--;
            }
            if (field515 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1269.method1400(field514.field2024, 0, 2);
                field514.field2022 = 0;
                field515 = field514.method2442();
                var0 -= 2;
            }
            if (var0 < field515) {
                return false;
            }
            field514.field2022 = 0;
            Statics.field1269.method1400(field514.field2024, 0, field515);
            field597 = 0;
            field605 = field521;
            field521 = field520;
            field520 = field618;
            if (field618 == 17) {
                int var1 = field514.method2481();
                int var2 = field514.method2629();
                class160 var3 = class160.method628(var1);
                if (var3 != null && var3.field2698 == 0) {
                    if (var2 > var3.field2632 - var3.field2626) {
                        var2 = var3.field2632 - var3.field2626;
                    }
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    if (var3.field2658 != var2) {
                        var3.field2658 = var2;
                        method882(var3);
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 4) {
                int var4 = field514.method2483();
                int var5 = field514.method2442();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field514.method2635();
                int var7 = field514.method2442();
                if (var7 == 65535) {
                    var7 = -1;
                }
                for (int var8 = var5; var8 <= var7; var8++) {
                    long var9 = ((long) var6 << 32) + (long) var8;
                    class180 var11 = field669.method3300(var9);
                    if (var11 != null) {
                        var11.method3360();
                    }
                    field669.method3301(new class172(var4), var9);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 153) {
                int var12 = field514.method2470();
                int var13 = field514.method2483();
                int var14 = var12 >> 10 & 0x1F;
                int var15 = var12 >> 5 & 0x1F;
                int var16 = var12 & 0x1F;
                int var17 = (var16 << 3) + (var14 << 19) + (var15 << 11);
                class160 var18 = class160.method628(var13);
                if (var18.field2633 != var17) {
                    var18.field2633 = var17;
                    method882(var18);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 136) {
                int var19 = field514.method2586();
                int var20 = field514.method2442();
                if (var19 < -70000) {
                    var20 += 32768;
                }
                class160 var21;
                if (var19 >= 0) {
                    var21 = class160.method628(var19);
                } else {
                    var21 = null;
                }
                while (field514.field2022 < field515) {
                    int var22 = field514.method2450();
                    int var23 = field514.method2442();
                    int var24 = 0;
                    if (var23 != 0) {
                        var24 = field514.method2440();
                        if (var24 == 255) {
                            var24 = field514.method2586();
                        }
                    }
                    if (var21 != null && var22 >= 0 && var22 < var21.field2718.length) {
                        var21.field2718[var22] = var23;
                        var21.field2719[var22] = var24;
                    }
                    class19.method1335(var20, var22, var23 - 1, var24);
                }
                if (var21 != null) {
                    method882(var21);
                }
                method25();
                field655[++field571 - 1 & 0x1F] = var20 & 0x7FFF;
                field618 = -1;
                return true;
            }
            if (field618 == 166) {
                field715 = true;
                Statics.field257 = field514.method2440();
                Statics.field2847 = field514.method2440();
                Statics.field468 = field514.method2442();
                Statics.field469 = field514.method2440();
                Statics.field127 = field514.method2440();
                if (Statics.field127 >= 100) {
                    Statics.field1225 = Statics.field257 * 128 + 64;
                    Statics.field1092 = Statics.field2847 * 128 + 64;
                    Statics.field104 = method1287(Statics.field1225, Statics.field1092, Statics.field1030) - Statics.field468;
                }
                field618 = -1;
                return true;
            }
            if (field618 == 227) {
                method1179();
                field618 = -1;
                return true;
            }
            if (field618 == 148) {
                while (field514.field2022 < field515) {
                    boolean var25 = field514.method2440() == 1;
                    String var26 = field514.method2471();
                    String var27 = field514.method2471();
                    int var28 = field514.method2442();
                    int var29 = field514.method2440();
                    int var30 = field514.method2440();
                    boolean var31 = (var30 & 0x2) != 0;
                    boolean var32 = (var30 & 0x1) != 0;
                    if (var28 > 0) {
                        field514.method2471();
                        field514.method2440();
                        field514.method2586();
                    }
                    field514.method2471();
                    for (int var33 = 0; var33 < field538; var33++) {
                        class23 var34 = field645[var33];
                        if (var25) {
                            if (var27.equals(var34.field366)) {
                                var34.field366 = var26;
                                var34.field362 = var27;
                                var26 = null;
                                break;
                            }
                        } else if (var26.equals(var34.field366)) {
                            if (var34.field360 != var28) {
                                boolean var35 = true;
                                for (class28 var36 = (class28) field724.method3285(); var36 != null; var36 = (class28) field724.method3294()) {
                                    if (var36.field733.equals(var26)) {
                                        if (var28 != 0 && var36.field735 == 0) {
                                            var36.method3355();
                                            var35 = false;
                                        } else if (var28 == 0 && var36.field735 != 0) {
                                            var36.method3355();
                                            var35 = false;
                                        }
                                    }
                                }
                                if (var35) {
                                    field724.method3284(new class28(var26, var28));
                                }
                                var34.field360 = var28;
                            }
                            var34.field362 = var27;
                            var34.field361 = var29;
                            var34.field368 = var31;
                            var34.field363 = var32;
                            var26 = null;
                            break;
                        }
                    }
                    if (var26 != null && field538 < 400) {
                        class23 var37 = new class23();
                        field645[field538] = var37;
                        var37.field366 = var26;
                        var37.field362 = var27;
                        var37.field360 = var28;
                        var37.field361 = var29;
                        var37.field368 = var31;
                        var37.field363 = var32;
                        field538++;
                    }
                }
                field722 = 2;
                field660 = field556;
                boolean var38 = false;
                int var39 = field538;
                while (var39 > 0) {
                    boolean var40 = true;
                    var39--;
                    for (int var41 = 0; var41 < var39; var41++) {
                        boolean var42 = false;
                        class23 var43 = field645[var41];
                        class23 var44 = field645[var41 + 1];
                        if (field474 != var43.field360 && field474 == var44.field360) {
                            var42 = true;
                        }
                        if (!var42 && var43.field360 == 0 && var44.field360 != 0) {
                            var42 = true;
                        }
                        if (!var42 && !var43.field368 && var44.field368) {
                            var42 = true;
                        }
                        if (!var42 && !var43.field363 && var44.field363) {
                            var42 = true;
                        }
                        if (var42) {
                            class23 var45 = field645[var41];
                            field645[var41] = field645[var41 + 1];
                            field645[var41 + 1] = var45;
                            var40 = false;
                        }
                    }
                    if (var40) {
                        break;
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 248) {
                int var46 = field514.method2481();
                int var47 = field514.method2475();
                class160 var48 = class160.method628(var46);
                if (var48.field2724 != var47 || var47 == -1) {
                    var48.field2724 = var47;
                    var48.field2722 = 0;
                    var48.field2723 = 0;
                    method882(var48);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 1) {
                String var49 = field514.method2471();
                class116 var50 = field514;
                String var54;
                try {
                    int var51 = var50.method2450();
                    if (var51 > 32767) {
                        var51 = 32767;
                    }
                    byte[] var52 = new byte[var51];
                    var50.field2022 += Statics.field2851.method2358(var50.field2024, var50.field2022, var52, 0, var51);
                    String var53 = class151.method250(var52, 0, var51);
                    var54 = var53;
                } catch (Exception var295) {
                    var54 = "Cabbage";
                }
                String var57 = class186.method3446(class149.method1675(var54));
                method220(6, var49, var57);
                field618 = -1;
                return true;
            }
            if (field618 == 254) {
                method2420(false);
                field618 = -1;
                return true;
            }
            if (field618 == 32) {
                int var58 = field514.method2629();
                int var59 = field514.method2483();
                class160 var60 = class160.method628(var59);
                if (var60.field2716 != 1 || var60.field2649 != var58) {
                    var60.field2716 = 1;
                    var60.field2649 = var58;
                    method882(var60);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 13) {
                int var61 = field514.method2586();
                class160 var62 = class160.method628(var61);
                for (int var63 = 0; var63 < var62.field2718.length; var63++) {
                    var62.field2718[var63] = -1;
                    var62.field2718[var63] = 0;
                }
                method882(var62);
                field618 = -1;
                return true;
            }
            if (field618 == 44) {
                field514.field2022 += 28;
                if (field514.method2457()) {
                    class116 var64 = field514;
                    int var65 = field514.field2022 - 28;
                    if (class82.field1412 != null) {
                        try {
                            class82.field1412.method584(0L);
                            class82.field1412.method595(var64.field2024, var65, 24);
                        } catch (Exception var294) {
                        }
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 253) {
                class13 var67 = new class13();
                var67.field188 = field514.method2471();
                var67.field187 = field514.method2442();
                int var68 = field514.method2586();
                var67.field186 = var68;
                method10(45);
                Statics.field1269.method1402();
                Statics.field1269 = null;
                class21.method155(var67);
                field618 = -1;
                return false;
            }
            if (field618 == 215) {
                field491 = field514.method2440();
                if (field491 == 1) {
                    field492 = field514.method2442();
                }
                if (field491 >= 2 && field491 <= 6) {
                    if (field491 == 2) {
                        field678 = 64;
                        field482 = 64;
                    }
                    if (field491 == 3) {
                        field678 = 0;
                        field482 = 64;
                    }
                    if (field491 == 4) {
                        field678 = 128;
                        field482 = 64;
                    }
                    if (field491 == 5) {
                        field678 = 64;
                        field482 = 0;
                    }
                    if (field491 == 6) {
                        field678 = 64;
                        field482 = 128;
                    }
                    field491 = 2;
                    field494 = field514.method2442();
                    field495 = field514.method2442();
                    field496 = field514.method2440();
                }
                if (field491 == 10) {
                    field493 = field514.method2442();
                }
                field618 = -1;
                return true;
            }
            if (field618 == 182) {
                int var69 = field514.method2586();
                int var70 = field514.method2469();
                int var71 = field514.method2629();
                class160 var72 = class160.method628(var69);
                var72.field2726 = (var71 << 16) + var70;
                field618 = -1;
                return true;
            }
            if (field618 == 232) {
                field656 = field514.method2440();
                if (field656 == 255) {
                    field656 = 0;
                }
                field702 = field514.method2440();
                if (field702 == 255) {
                    field702 = 0;
                }
                field618 = -1;
                return true;
            }
            if (field618 == 121) {
                int var73 = field514.method2440();
                String var74 = field514.method2471();
                int var75 = field514.method2587();
                if (var73 >= 1 && var73 <= 8) {
                    if (var74.equalsIgnoreCase("null")) {
                        var74 = null;
                    }
                    field705[var73 - 1] = var74;
                    field601[var73 - 1] = var75 == 0;
                }
                field618 = -1;
                return true;
            }
            if (field618 == 45) {
                int var76 = field514.method2586();
                String var77 = field514.method2471();
                class160 var78 = class160.method628(var76);
                if (!var77.equals(var78.field2663)) {
                    var78.field2663 = var77;
                    method882(var78);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 218) {
                method25();
                field635 = field514.method2606();
                field662 = field556;
                field618 = -1;
                return true;
            }
            if (field618 == 238) {
                int var79 = field514.method2470();
                if (var79 == 65535) {
                    var79 = -1;
                }
                if (var79 == -1 && !field706) {
                    class140.method805();
                } else if (var79 != -1 && field657 != var79 && field552 != 0 && !field706) {
                    class156 var80 = Statics.field544;
                    int var81 = field552;
                    class140.field2352 = 1;
                    Statics.field2353 = var80;
                    Statics.field2355 = var79;
                    Statics.field2358 = 0;
                    Statics.field2356 = var81;
                    Statics.field2334 = false;
                    Statics.field2357 = 2;
                }
                field657 = var79;
                field618 = -1;
                return true;
            }
            if (field618 == 158) {
                int var82 = field514.method2442();
                if (var82 == 65535) {
                    var82 = -1;
                }
                int var83 = field514.method2477();
                method753(var82, var83);
                field618 = -1;
                return true;
            }
            if (field618 == 104) {
                method25();
                int var84 = field514.method2515();
                int var85 = field514.method2587();
                int var86 = field514.method2635();
                field609[var85] = var86;
                field607[var85] = var84;
                field608[var85] = 1;
                for (int var87 = 0; var87 < 98; var87++) {
                    if (var86 >= class131.field2047[var87]) {
                        field608[var85] = var87 + 2;
                    }
                }
                field719[++field688 - 1 & 0x1F] = var85;
                field618 = -1;
                return true;
            }
            if (field618 == 116) {
                field722 = 1;
                field660 = field556;
                field618 = -1;
                return true;
            }
            if (field618 == 130) {
                int var88 = field514.method2635();
                boolean var89 = field514.method2587() == 1;
                class160 var90 = class160.method628(var88);
                if (var90.field2715 != var89) {
                    var90.field2715 = var89;
                    method882(var90);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 174) {
                method2355();
                field618 = -1;
                return false;
            }
            if (field618 == 250) {
                int var91 = field514.method2442();
                int var92 = field514.method2635();
                int var93 = field514.method2469();
                int var94 = field514.method2442();
                class160 var95 = class160.method628(var92);
                if (var95.field2656 != var93 || var95.field2648 != var94 || var95.field2674 != var91) {
                    var95.field2656 = var93;
                    var95.field2648 = var94;
                    var95.field2674 = var91;
                    method882(var95);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 164) {
                if (field629 != -1) {
                    int var96 = field629;
                    if (class160.method2728(var96)) {
                        method1183(Statics.field2688[var96], 0);
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 9) {
                byte var97 = field514.method2465();
                int var98 = field514.method2442();
                class161.field2735[var98] = var97;
                if (class161.field2736[var98] != var97) {
                    class161.field2736[var98] = var97;
                    method2996(var98);
                }
                field561[++field691 - 1 & 0x1F] = var98;
                field618 = -1;
                return true;
            }
            if (field618 == 221) {
                Statics.field287 = class139.method820(field514.method2440());
                field618 = -1;
                return true;
            }
            if (field618 == 75) {
                while (field514.field2022 < field515) {
                    int var99 = field514.method2440();
                    boolean var100 = (var99 & 0x1) == 1;
                    String var101 = field514.method2471();
                    String var102 = field514.method2471();
                    field514.method2471();
                    for (int var103 = 0; var103 < field725; var103++) {
                        class11 var104 = field610[var103];
                        if (var100) {
                            if (var102.equals(var104.field159)) {
                                var104.field159 = var101;
                                var104.field164 = var102;
                                var101 = null;
                                break;
                            }
                        } else if (var101.equals(var104.field159)) {
                            var104.field159 = var101;
                            var104.field164 = var102;
                            var101 = null;
                            break;
                        }
                    }
                    if (var101 != null && field725 < 400) {
                        class11 var105 = new class11();
                        field610[field725] = var105;
                        var105.field159 = var101;
                        var105.field164 = var102;
                        field725++;
                    }
                }
                field660 = field556;
                field618 = -1;
                return true;
            }
            if (field618 == 192) {
                int var106 = field514.method2481();
                int var107 = field514.method2473();
                int var108 = field514.method2474();
                class160 var109 = class160.method628(var106);
                int var110 = var109.field2607 + var107;
                int var111 = var109.field2624 + var108;
                if (var109.field2621 != var110 || var109.field2622 != var111) {
                    var109.field2621 = var110;
                    var109.field2622 = var111;
                    method882(var109);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 77) {
                int var112 = field514.method2470();
                class19 var113 = (class19) class19.field278.method3300((long) var112);
                if (var113 != null) {
                    var113.method3360();
                }
                field655[++field571 - 1 & 0x1F] = var112 & 0x7FFF;
                field618 = -1;
                return true;
            }
            if (field618 == 59) {
                class116 var114 = field514;
                int var115 = field515;
                class182 var116 = new class182();
                var116.field2848 = var114.method2440();
                var116.field2842 = var114.method2586();
                var116.field2840 = new int[var116.field2848];
                var116.field2841 = new int[var116.field2848];
                var116.field2843 = new Field[var116.field2848];
                var116.field2844 = new int[var116.field2848];
                var116.field2845 = new Method[var116.field2848];
                var116.field2846 = new byte[var116.field2848][][];
                for (int var117 = 0; var117 < var116.field2848; var117++) {
                    try {
                        int var118 = var114.method2440();
                        if (var118 == 0 || var118 == 1 || var118 == 2) {
                            String var119 = new String(var114.method2471());
                            String var120 = new String(var114.method2471());
                            int var121 = 0;
                            if (var118 == 1) {
                                var121 = var114.method2586();
                            }
                            var116.field2840[var117] = var118;
                            var116.field2844[var117] = var121;
                            var116.field2843[var117] = class183.method2(var119).getDeclaredField(var120);
                        } else if (var118 == 3 || var118 == 4) {
                            String var122 = new String(var114.method2471());
                            String var123 = new String(var114.method2471());
                            int var124 = var114.method2440();
                            String[] var125 = new String[var124];
                            for (int var126 = 0; var126 < var124; var126++) {
                                var125[var126] = new String(var114.method2471());
                            }
                            byte[][] var127 = new byte[var124][];
                            if (var118 == 3) {
                                for (int var128 = 0; var128 < var124; var128++) {
                                    int var129 = var114.method2586();
                                    var127[var128] = new byte[var129];
                                    var114.method2615(var127[var128], 0, var129);
                                }
                            }
                            var116.field2840[var117] = var118;
                            Class[] var130 = new Class[var124];
                            for (int var131 = 0; var131 < var124; var131++) {
                                var130[var131] = class183.method2(var125[var131]);
                            }
                            var116.field2845[var117] = class183.method2(var122).getDeclaredMethod(var123, var130);
                            var116.field2846[var117] = var127;
                        }
                    } catch (ClassNotFoundException var296) {
                        var116.field2841[var117] = -1;
                    } catch (SecurityException var297) {
                        var116.field2841[var117] = -2;
                    } catch (NullPointerException var298) {
                        var116.field2841[var117] = -3;
                    } catch (Exception var299) {
                        var116.field2841[var117] = -4;
                    } catch (Throwable var300) {
                        var116.field2841[var117] = -5;
                    }
                }
                class183.field2849.method3321(var116);
                field618 = -1;
                return true;
            }
            if (field618 == 147 || field618 == 8 || field618 == 154 || field618 == 11 || field618 == 57 || field618 == 217 || field618 == 80 || field618 == 35 || field618 == 175 || field618 == 252 || field618 == 70) {
                method156();
                field618 = -1;
                return true;
            }
            if (field618 == 162) {
                String var137 = field514.method2471();
                long var138 = (long) field514.method2442();
                long var140 = (long) field514.method2441();
                int var142 = field514.method2440();
                long var143 = (var138 << 32) + var140;
                boolean var145 = false;
                for (int var146 = 0; var146 < 100; var146++) {
                    if (field680[var146] == var143) {
                        var145 = true;
                        break;
                    }
                }
                if (method810(var137)) {
                    var145 = true;
                }
                if (!var145 && field588 == 0) {
                    field680[field689] = var143;
                    field689 = (field689 + 1) % 100;
                    class116 var147 = field514;
                    String var151;
                    try {
                        int var148 = var147.method2450();
                        if (var148 > 32767) {
                            var148 = 32767;
                        }
                        byte[] var149 = new byte[var148];
                        var147.field2022 += Statics.field2851.method2358(var147.field2024, var147.field2022, var149, 0, var148);
                        String var150 = class151.method250(var149, 0, var148);
                        var151 = var150;
                    } catch (Exception var293) {
                        var151 = "Cabbage";
                    }
                    String var154 = class186.method3446(class149.method1675(var151));
                    if (var142 == 2 || var142 == 3) {
                        method220(7, class2.method175(1) + var137, var154);
                    } else if (var142 == 1) {
                        method220(7, class2.method175(0) + var137, var154);
                    } else {
                        method220(3, var137, var154);
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 96) {
                Statics.field13 = field514.method2462();
                Statics.field106 = field514.method2587();
                while (field514.field2022 < field515) {
                    field618 = field514.method2440();
                    method156();
                }
                field618 = -1;
                return true;
            }
            if (field618 == 229) {
                int var155 = field514.method2469();
                int var156 = field514.method2586();
                class161.field2735[var155] = var156;
                if (class161.field2736[var155] != var156) {
                    class161.field2736[var155] = var156;
                    method2996(var155);
                }
                field561[++field691 - 1 & 0x1F] = var155;
                field618 = -1;
                return true;
            }
            if (field618 == 76) {
                method2420(true);
                field618 = -1;
                return true;
            }
            if (field618 == 101) {
                field715 = false;
                for (int var157 = 0; var157 < 5; var157++) {
                    field716[var157] = false;
                }
                field618 = -1;
                return true;
            }
            if (field618 == 225) {
                int var158 = field514.method2442();
                int var159 = field514.method2440();
                int var160 = field514.method2442();
                if (field707 != 0 && var159 != 0 && field718 < 50) {
                    field710[field718] = var158;
                    field542[field718] = var159;
                    field712[field718] = var160;
                    field613[field718] = null;
                    field672[field718] = 0;
                    field718++;
                }
                field618 = -1;
                return true;
            }
            if (field618 == 39) {
                String var164 = field514.method2471();
                long var165 = field514.method2443();
                long var167 = (long) field514.method2442();
                long var169 = (long) field514.method2441();
                int var171 = field514.method2440();
                long var172 = (var167 << 32) + var169;
                boolean var174 = false;
                for (int var175 = 0; var175 < 100; var175++) {
                    if (field680[var175] == var172) {
                        var174 = true;
                        break;
                    }
                }
                if (var171 <= 1 && method810(var164)) {
                    var174 = true;
                }
                if (!var174 && field588 == 0) {
                    field680[field689] = var172;
                    field689 = (field689 + 1) % 100;
                    class116 var176 = field514;
                    String var180;
                    try {
                        int var177 = var176.method2450();
                        if (var177 > 32767) {
                            var177 = 32767;
                        }
                        byte[] var178 = new byte[var177];
                        var176.field2022 += Statics.field2851.method2358(var176.field2024, var176.field2022, var178, 0, var177);
                        String var179 = class151.method250(var178, 0, var177);
                        var180 = var179;
                    } catch (Exception var292) {
                        var180 = "Cabbage";
                    }
                    String var183 = class186.method3446(class149.method1675(var180));
                    if (var171 == 2 || var171 == 3) {
                        method1289(9, class2.method175(1) + var164, var183, class148.method1674(var165));
                    } else if (var171 == 1) {
                        method1289(9, class2.method175(0) + var164, var183, class148.method1674(var165));
                    } else {
                        method1289(9, var164, var183, class148.method1674(var165));
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 180) {
                int var184 = field514.method2450();
                boolean var185 = field514.method2440() == 1;
                String var186 = "";
                boolean var187 = false;
                if (var185) {
                    var186 = field514.method2471();
                    if (method810(var186)) {
                        var187 = true;
                    }
                }
                String var188 = field514.method2471();
                if (!var187) {
                    method220(var184, var186, var188);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 167) {
                for (int var189 = 0; var189 < class161.field2736.length; var189++) {
                    if (class161.field2736[var189] != class161.field2735[var189]) {
                        class161.field2736[var189] = class161.field2735[var189];
                        method2996(var189);
                        field561[++field691 - 1 & 0x1F] = var189;
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 41) {
                int var190 = field514.method2587();
                int var191 = field514.method2587();
                int var192 = field514.method2587();
                Statics.field1030 = var191 >> 1;
                Statics.field1096.method243(var190, var192, (var191 & 0x1) == 1);
                field618 = -1;
                return true;
            }
            if (field618 == 27) {
                field715 = true;
                Statics.field244 = field514.method2440();
                Statics.field1259 = field514.method2440();
                Statics.field199 = field514.method2442();
                Statics.field2566 = field514.method2440();
                Statics.field261 = field514.method2440();
                if (Statics.field261 >= 100) {
                    int var193 = Statics.field244 * 128 + 64;
                    int var194 = Statics.field1259 * 128 + 64;
                    int var195 = method1287(var193, var194, Statics.field1030) - Statics.field199;
                    int var196 = var193 - Statics.field1225;
                    int var197 = var195 - Statics.field104;
                    int var198 = var194 - Statics.field1092;
                    int var199 = (int) Math.sqrt((double) (var196 * var196 + var198 * var198));
                    Statics.field1419 = (int) (Math.atan2((double) var197, (double) var199) * 325.949D) & 0x7FF;
                    Statics.field405 = (int) (Math.atan2((double) var196, (double) var198) * -325.949D) & 0x7FF;
                    if (Statics.field1419 < 128) {
                        Statics.field1419 = 128;
                    }
                    if (Statics.field1419 > 383) {
                        Statics.field1419 = 383;
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 142) {
                int var200 = field514.method2483();
                Statics.field1300 = Statics.field1172.method1508(var200);
                field618 = -1;
                return true;
            }
            if (field618 == 247) {
                int var201 = field515 + field514.field2022;
                int var202 = field514.method2442();
                int var203 = field514.method2442();
                if (field629 != var202) {
                    field629 = var202;
                    method2018(field629);
                    Statics.method119(field629);
                    for (int var204 = 0; var204 < 100; var204++) {
                        field519[var204] = true;
                    }
                }
                while (var203-- > 0) {
                    int var205 = field514.method2586();
                    int var206 = field514.method2442();
                    int var207 = field514.method2440();
                    class4 var208 = (class4) field630.method3300((long) var205);
                    if (var208 != null && var208.field50 != var206) {
                        method2727(var208, true);
                        var208 = null;
                    }
                    if (var208 == null) {
                        class4 var209 = new class4();
                        var209.field50 = var206;
                        var209.field49 = var207;
                        field630.method3301(var209, (long) var205);
                        method2018(var206);
                        Statics.method119(var206);
                        class160 var210 = class160.method628(var205);
                        if (var210 != null) {
                            method882(var210);
                        }
                        if (field633 != null) {
                            method882(field633);
                            field633 = null;
                        }
                        method2718();
                        if (field629 != -1) {
                            int var211 = field629;
                            if (class160.method2728(var211)) {
                                method1183(Statics.field2688[var211], 1);
                            }
                        }
                        var208 = var209;
                    }
                    var208.field54 = true;
                }
                for (class4 var213 = (class4) field630.method3317(); var213 != null; var213 = (class4) field630.method3299()) {
                    if (var213.field54) {
                        var213.field54 = false;
                    } else {
                        method2727(var213, true);
                    }
                }
                field669 = new class176(512);
                while (field514.field2022 < var201) {
                    int var214 = field514.method2586();
                    int var215 = field514.method2442();
                    int var216 = field514.method2442();
                    int var217 = field514.method2586();
                    for (int var218 = var215; var218 <= var216; var218++) {
                        long var219 = ((long) var214 << 32) + (long) var218;
                        field669.method3301(new class172(var217), var219);
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 10) {
                int var221 = field514.method2635();
                int var222 = field514.method2469();
                if (var222 == 65535) {
                    var222 = -1;
                }
                int var223 = field514.method2481();
                class160 var224 = class160.method628(var223);
                if (var224.field2615) {
                    var224.field2720 = var222;
                    var224.field2631 = var221;
                    class40 var226 = class40.method1243(var222);
                    var224.field2656 = var226.field984;
                    var224.field2648 = var226.field985;
                    var224.field2657 = var226.field986;
                    var224.field2654 = var226.field980;
                    var224.field2655 = var226.field1019;
                    var224.field2674 = var226.field988;
                    if (var224.field2625 > 0) {
                        var224.field2674 = var224.field2674 * 32 / var224.field2625;
                    }
                    method882(var224);
                } else if (var222 == -1) {
                    var224.field2716 = 0;
                    field618 = -1;
                    return true;
                } else {
                    class40 var225 = class40.method1243(var222);
                    var224.field2716 = 4;
                    var224.field2649 = var222;
                    var224.field2656 = var225.field984;
                    var224.field2648 = var225.field985;
                    var224.field2674 = var225.field988 * 100 / var221;
                    method882(var224);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 102) {
                int var227 = field514.method2440();
                int var228 = field514.method2440();
                int var229 = field514.method2440();
                int var230 = field514.method2440();
                field716[var227] = true;
                field717[var227] = var228;
                field690[var227] = var229;
                field600[var227] = var230;
                field720[var227] = 0;
                field618 = -1;
                return true;
            }
            if (field618 == 14) {
                int var231 = field514.method2629();
                int var232 = field514.method2462();
                int var233 = field514.method2586();
                class4 var234 = (class4) field630.method3300((long) var233);
                if (var234 != null) {
                    method2727(var234, var234.field50 != var231);
                }
                class4 var235 = new class4();
                var235.field50 = var231;
                var235.field49 = var232;
                field630.method3301(var235, (long) var233);
                method2018(var231);
                Statics.method119(var231);
                class160 var236 = class160.method628(var233);
                if (var236 != null) {
                    method882(var236);
                }
                if (field633 != null) {
                    method882(field633);
                    field633 = null;
                }
                method2718();
                if (field629 != -1) {
                    int var237 = field629;
                    if (class160.method2728(var237)) {
                        method1183(Statics.field2688[var237], 1);
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 201) {
                Statics.field106 = field514.method2440();
                Statics.field13 = field514.method2440();
                for (int var238 = Statics.field13; var238 < Statics.field13 + 8; var238++) {
                    for (int var239 = Statics.field106; var239 < Statics.field106 + 8; var239++) {
                        if (field603[Statics.field1030][var238][var239] != null) {
                            field603[Statics.field1030][var238][var239] = null;
                            method838(var238, var239);
                        }
                    }
                }
                for (class22 var240 = (class22) field604.method3343(); var240 != null; var240 = (class22) field604.method3328()) {
                    if (var240.field344 >= Statics.field13 && var240.field344 < Statics.field13 + 8 && var240.field340 >= Statics.field106 && var240.field340 < Statics.field106 + 8 && Statics.field1030 == var240.field357) {
                        var240.field348 = 0;
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 128) {
                field472 = field514.method2469() * 30;
                field662 = field556;
                field618 = -1;
                return true;
            }
            if (field618 == 79) {
                for (int var241 = 0; var241 < Statics.field1032; var241++) {
                    class42 var242 = class42.method157(var241);
                    if (var242 != null && var242.field1034 == 0) {
                        class161.field2735[var241] = 0;
                        class161.field2736[var241] = 0;
                    }
                }
                method25();
                field691 += 32;
                field618 = -1;
                return true;
            }
            if (field618 == 198) {
                field686 = field514.method2440();
                field687 = field514.method2440();
                field618 = -1;
                return true;
            }
            if (field618 == 212) {
                int var243 = field514.method2481();
                class160 var244 = class160.method628(var243);
                var244.field2716 = 3;
                var244.field2649 = Statics.field1096.field28.method3225();
                method882(var244);
                field618 = -1;
                return true;
            }
            if (field618 == 181) {
                field522 = field514.method2440();
                field618 = -1;
                return true;
            }
            if (field618 == 244) {
                int var245 = field514.method2442();
                field629 = var245;
                method2018(var245);
                Statics.method119(field629);
                for (int var246 = 0; var246 < 100; var246++) {
                    field519[var246] = true;
                }
                field618 = -1;
                return true;
            }
            if (field618 == 151) {
                String var247 = field514.method2471();
                Object[] var248 = new Object[var247.length() + 1];
                for (int var249 = var247.length() - 1; var249 >= 0; var249--) {
                    if (var247.charAt(var249) == 's') {
                        var248[var249 + 1] = field514.method2471();
                    } else {
                        var248[var249 + 1] = Integer.valueOf(field514.method2586());
                    }
                }
                var248[0] = Integer.valueOf(field514.method2586());
                class1 var250 = new class1();
                var250.field5 = var248;
                class26.method769(var250);
                field618 = -1;
                return true;
            }
            if (field618 == 109) {
                String var251 = field514.method2471();
                int var252 = field514.method2442();
                byte var253 = field514.method2438();
                boolean var254 = false;
                if (var253 == -128) {
                    var254 = true;
                }
                if (var254) {
                    if (Statics.field764 == 0) {
                        field618 = -1;
                        return true;
                    }
                    boolean var255 = false;
                    int var256;
                    for (var256 = 0; var256 < Statics.field764 && (!Statics.field1200[var256].field100.equals(var251) || Statics.field1200[var256].field101 != var252); var256++) {
                    }
                    if (var256 < Statics.field764) {
                        while (var256 < Statics.field764 - 1) {
                            Statics.field1200[var256] = Statics.field1200[var256 + 1];
                            var256++;
                        }
                        Statics.field764--;
                        Statics.field1200[Statics.field764] = null;
                    }
                } else {
                    field514.method2471();
                    class8 var257 = new class8();
                    var257.field100 = var251;
                    var257.field105 = class150.method159(var257.field100, Statics.field103);
                    var257.field101 = var252;
                    var257.field107 = var253;
                    int var258;
                    for (var258 = Statics.field764 - 1; var258 >= 0; var258--) {
                        int var259 = Statics.field1200[var258].field105.compareTo(var257.field100);
                        if (var259 == 0) {
                            Statics.field1200[var258].field101 = var252;
                            Statics.field1200[var258].field107 = var253;
                            if (var251.equals(Statics.field1096.field41)) {
                                Statics.field2087 = var253;
                            }
                            field557 = field556;
                            field618 = -1;
                            return true;
                        }
                        if (var259 < 0) {
                            break;
                        }
                    }
                    if (Statics.field764 >= Statics.field1200.length) {
                        field618 = -1;
                        return true;
                    }
                    for (int var260 = Statics.field764 - 1; var260 > var258; var260--) {
                        Statics.field1200[var260 + 1] = Statics.field1200[var260];
                    }
                    if (Statics.field764 == 0) {
                        Statics.field1200 = new class8[100];
                    }
                    Statics.field1200[var258 + 1] = var257;
                    Statics.field764++;
                    if (var251.equals(Statics.field1096.field41)) {
                        Statics.field2087 = var253;
                    }
                }
                field557 = field556;
                field618 = -1;
                return true;
            }
            if (field618 == 223) {
                Statics.field106 = field514.method2587();
                Statics.field13 = field514.method2462();
                field618 = -1;
                return true;
            }
            if (field618 == 220) {
                int var261 = field514.method2481();
                int var262 = field514.method2629();
                class160 var263 = class160.method628(var261);
                if (var263.field2716 != 2 || var263.field2649 != var262) {
                    var263.field2716 = 2;
                    var263.field2649 = var262;
                    method882(var263);
                }
                field618 = -1;
                return true;
            }
            if (field618 == 21) {
                method105();
                field618 = -1;
                return true;
            }
            if (field618 == 139) {
                int var264 = field514.method2586();
                int var265 = field514.method2442();
                if (var264 < -70000) {
                    var265 += 32768;
                }
                class160 var266;
                if (var264 >= 0) {
                    var266 = class160.method628(var264);
                } else {
                    var266 = null;
                }
                if (var266 != null) {
                    for (int var267 = 0; var267 < var266.field2718.length; var267++) {
                        var266.field2718[var267] = 0;
                        var266.field2719[var267] = 0;
                    }
                }
                class19 var268 = (class19) class19.field278.method3300((long) var265);
                if (var268 != null) {
                    for (int var269 = 0; var269 < var268.field267.length; var269++) {
                        var268.field267[var269] = -1;
                        var268.field272[var269] = 0;
                    }
                }
                int var270 = field514.method2442();
                for (int var271 = 0; var271 < var270; var271++) {
                    int var272 = field514.method2470();
                    int var273 = field514.method2462();
                    if (var273 == 255) {
                        var273 = field514.method2635();
                    }
                    if (var266 != null && var271 < var266.field2718.length) {
                        var266.field2718[var271] = var272;
                        var266.field2719[var271] = var273;
                    }
                    class19.method1335(var265, var271, var272 - 1, var273);
                }
                if (var266 != null) {
                    method882(var266);
                }
                method25();
                field655[++field571 - 1 & 0x1F] = var265 & 0x7FFF;
                field618 = -1;
                return true;
            }
            if (field618 == 138) {
                for (int var274 = 0; var274 < field595.length; var274++) {
                    if (field595[var274] != null) {
                        field595[var274].field414 = -1;
                    }
                }
                for (int var275 = 0; var275 < field714.length; var275++) {
                    if (field714[var275] != null) {
                        field714[var275].field414 = -1;
                    }
                }
                field618 = -1;
                return true;
            }
            if (field618 == 29) {
                field557 = field556;
                if (field515 == 0) {
                    field573 = null;
                    field695 = null;
                    Statics.field764 = 0;
                    Statics.field1200 = null;
                    field618 = -1;
                    return true;
                }
                field695 = field514.method2471();
                long var276 = field514.method2443();
                field573 = class148.method743(var276);
                Statics.field259 = field514.method2438();
                int var278 = field514.method2440();
                if (var278 == 255) {
                    field618 = -1;
                    return true;
                }
                Statics.field764 = var278;
                class8[] var279 = new class8[100];
                for (int var280 = 0; var280 < Statics.field764; var280++) {
                    var279[var280] = new class8();
                    var279[var280].field100 = field514.method2471();
                    var279[var280].field105 = class150.method159(var279[var280].field100, Statics.field103);
                    var279[var280].field101 = field514.method2442();
                    var279[var280].field107 = field514.method2438();
                    field514.method2471();
                    if (var279[var280].field100.equals(Statics.field1096.field41)) {
                        Statics.field2087 = var279[var280].field107;
                    }
                }
                boolean var281 = false;
                int var282 = Statics.field764;
                while (var282 > 0) {
                    boolean var283 = true;
                    var282--;
                    for (int var284 = 0; var284 < var282; var284++) {
                        if (var279[var284].field105.compareTo(var279[var284 + 1].field105) > 0) {
                            class8 var285 = var279[var284];
                            var279[var284] = var279[var284 + 1];
                            var279[var284 + 1] = var285;
                            var283 = false;
                        }
                    }
                    if (var283) {
                        break;
                    }
                }
                Statics.field1200 = var279;
                field618 = -1;
                return true;
            }
            if (field618 == 48) {
                method25();
                field634 = field514.method2440();
                field662 = field556;
                field618 = -1;
                return true;
            }
            if (field618 == 74) {
                int var286 = field514.method2586();
                class4 var287 = (class4) field630.method3300((long) var286);
                if (var287 != null) {
                    method2727(var287, true);
                }
                if (field633 != null) {
                    method882(field633);
                    field633 = null;
                }
                field618 = -1;
                return true;
            }
            Statics.method1393("" + field618 + class2.field26 + field521 + class2.field26 + field605 + class2.field26 + field515, (Throwable) null);
            method2355();
        } catch (IOException var301) {
            Statics.method2419();
        } catch (Exception var302) {
            String var290 = "" + field618 + class2.field26 + field521 + class2.field26 + field605 + class2.field26 + field515 + class2.field26 + (Statics.field252 + Statics.field1096.field463[0]) + class2.field26 + (Statics.field924 + Statics.field1096.field440[0]) + class2.field26;
            for (int var291 = 0; var291 < field515 && var291 < 50; var291++) {
                var290 = var290 + field514.field2024[var291] + class2.field26;
            }
            Statics.method1393(var290, var302);
            method2355();
        }
        return true;
    }

    @ObfuscatedName("s.bd(B)V")
    public static final void method156() {
        if (field618 == 80) {
            int var0 = field514.method2469();
            int var1 = field514.method2462();
            int var2 = (var1 >> 4 & 0x7) + Statics.field13;
            int var3 = (var1 & 0x7) + Statics.field106;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class178 var4 = field603[Statics.field1030][var2][var3];
                if (var4 != null) {
                    for (class17 var5 = (class17) var4.method3343(); var5 != null; var5 = (class17) var4.method3328()) {
                        if ((var0 & 0x7FFF) == var5.field247) {
                            var5.method3360();
                            break;
                        }
                    }
                    if (var4.method3343() == null) {
                        field603[Statics.field1030][var2][var3] = null;
                    }
                    method838(var2, var3);
                }
            }
        } else if (field618 == 57) {
            int var6 = field514.method2440();
            int var7 = (var6 >> 4 & 0x7) + Statics.field13;
            int var8 = (var6 & 0x7) + Statics.field106;
            int var9 = field514.method2442();
            int var10 = field514.method2440();
            int var11 = field514.method2442();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var12 = var7 * 128 + 64;
                int var13 = var8 * 128 + 64;
                class20 var14 = new class20(var9, Statics.field1030, var12, var13, method1287(var12, var13, Statics.field1030) - var10, var11, field723);
                field606.method3321(var14);
            }
        } else if (field618 == 35) {
            int var15 = field514.method2629();
            int var16 = field514.method2442();
            int var17 = field514.method2515();
            int var18 = (var17 >> 4 & 0x7) + Statics.field13;
            int var19 = (var17 & 0x7) + Statics.field106;
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class17 var20 = new class17();
                var20.field247 = var16;
                var20.field245 = var15;
                if (field603[Statics.field1030][var18][var19] == null) {
                    field603[Statics.field1030][var18][var19] = new class178();
                }
                field603[Statics.field1030][var18][var19].method3321(var20);
                method838(var18, var19);
            }
        } else if (field618 == 175) {
            int var21 = field514.method2462();
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = field683[var22];
            int var25 = field514.method2515();
            int var26 = (var25 >> 4 & 0x7) + Statics.field13;
            int var27 = (var25 & 0x7) + Statics.field106;
            int var28 = field514.method2469();
            if (var26 >= 0 && var27 >= 0 && var26 < 103 && var27 < 103) {
                if (var24 == 0) {
                    class96 var29 = Statics.field356.method1868(Statics.field1030, var26, var27);
                    if (var29 != null) {
                        int var30 = var29.field1602 >> 14 & 0x7FFF;
                        if (var22 == 2) {
                            var29.field1607 = new class14(var30, 2, var23 + 4, Statics.field1030, var26, var27, var28, false, var29.field1607);
                            var29.field1608 = new class14(var30, 2, var23 + 1 & 0x3, Statics.field1030, var26, var27, var28, false, var29.field1608);
                        } else {
                            var29.field1607 = new class14(var30, var22, var23, Statics.field1030, var26, var27, var28, false, var29.field1607);
                        }
                    }
                }
                if (var24 == 1) {
                    class108 var31 = Statics.field356.method1869(Statics.field1030, var26, var27);
                    if (var31 != null) {
                        int var32 = var31.field1780 >> 14 & 0x7FFF;
                        if (var22 == 4 || var22 == 5) {
                            var31.field1787 = new class14(var32, 4, var23, Statics.field1030, var26, var27, var28, false, var31.field1787);
                        } else if (var22 == 6) {
                            var31.field1787 = new class14(var32, 4, var23 + 4, Statics.field1030, var26, var27, var28, false, var31.field1787);
                        } else if (var22 == 7) {
                            var31.field1787 = new class14(var32, 4, (var23 + 2 & 0x3) + 4, Statics.field1030, var26, var27, var28, false, var31.field1787);
                        } else if (var22 == 8) {
                            var31.field1787 = new class14(var32, 4, var23 + 4, Statics.field1030, var26, var27, var28, false, var31.field1787);
                            var31.field1792 = new class14(var32, 4, (var23 + 2 & 0x3) + 4, Statics.field1030, var26, var27, var28, false, var31.field1792);
                        }
                    }
                }
                if (var24 == 2) {
                    class98 var33 = Statics.field356.method1982(Statics.field1030, var26, var27);
                    if (var22 == 11) {
                        var22 = 10;
                    }
                    if (var33 != null) {
                        var33.field1631 = new class14(var33.field1636 >> 14 & 0x7FFF, var22, var23, Statics.field1030, var26, var27, var28, false, var33.field1631);
                    }
                }
                if (var24 == 3) {
                    class107 var34 = Statics.field356.method1871(Statics.field1030, var26, var27);
                    if (var34 != null) {
                        var34.field1777 = new class14(var34.field1770 >> 14 & 0x7FFF, 22, var23, Statics.field1030, var26, var27, var28, false, var34.field1777);
                    }
                }
            }
        } else if (field618 == 70) {
            int var35 = field514.method2462();
            int var36 = var35 >> 2;
            int var37 = var35 & 0x3;
            int var38 = field683[var36];
            int var39 = field514.method2469();
            int var40 = field514.method2462();
            int var41 = (var40 >> 4 & 0x7) + Statics.field13;
            int var42 = (var40 & 0x7) + Statics.field106;
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                method35(Statics.field1030, var41, var42, var38, var39, var36, var37, 0, -1);
            }
        } else if (field618 == 252) {
            int var43 = field514.method2515();
            int var44 = var43 >> 2;
            int var45 = var43 & 0x3;
            int var46 = field683[var44];
            int var47 = field514.method2462();
            int var48 = (var47 >> 4 & 0x7) + Statics.field13;
            int var49 = (var47 & 0x7) + Statics.field106;
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                method35(Statics.field1030, var48, var49, var46, -1, var44, var45, 0, -1);
            }
        } else if (field618 == 8) {
            int var50 = field514.method2440();
            int var51 = (var50 >> 4 & 0x7) + Statics.field13;
            int var52 = (var50 & 0x7) + Statics.field106;
            int var53 = field514.method2442();
            int var54 = field514.method2442();
            int var55 = field514.method2442();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                class178 var56 = field603[Statics.field1030][var51][var52];
                if (var56 != null) {
                    for (class17 var57 = (class17) var56.method3343(); var57 != null; var57 = (class17) var56.method3328()) {
                        if ((var53 & 0x7FFF) == var57.field247 && var57.field245 == var54) {
                            var57.field245 = var55;
                            break;
                        }
                    }
                    method838(var51, var52);
                }
            }
        } else {
            if (field618 == 154) {
                int var58 = field514.method2470();
                int var59 = field514.method2515();
                int var60 = var59 >> 2;
                int var61 = var59 & 0x3;
                int var62 = field683[var60];
                int var63 = field514.method2470();
                int var64 = field514.method2629();
                byte var65 = field514.method2464();
                byte var66 = field514.method2464();
                int var67 = field514.method2629();
                byte var68 = field514.method2466();
                int var69 = field514.method2440();
                int var70 = (var69 >> 4 & 0x7) + Statics.field13;
                int var71 = (var69 & 0x7) + Statics.field106;
                byte var72 = field514.method2464();
                class3 var73;
                if (field622 == var58) {
                    var73 = Statics.field1096;
                } else {
                    var73 = field595[var58];
                }
                if (var73 != null) {
                    class32 var74 = class32.method217(var63);
                    int var75;
                    int var76;
                    if (var61 == 1 || var61 == 3) {
                        var75 = var74.field820;
                        var76 = var74.field819;
                    } else {
                        var75 = var74.field819;
                        var76 = var74.field820;
                    }
                    int var77 = (var75 >> 1) + var70;
                    int var78 = (var75 + 1 >> 1) + var70;
                    int var79 = (var76 >> 1) + var71;
                    int var80 = (var76 + 1 >> 1) + var71;
                    int[][] var81 = class9.field109[Statics.field1030];
                    int var82 = var81[var77][var79] + var81[var78][var79] + var81[var77][var80] + var81[var78][var80] >> 2;
                    int var83 = (var70 << 7) + (var75 << 6);
                    int var84 = (var71 << 7) + (var76 << 6);
                    class112 var85 = var74.method636(var60, var61, var81, var83, var82, var84);
                    if (var85 != null) {
                        method35(Statics.field1030, var70, var71, var62, -1, 0, 0, var64 + 1, var67 + 1);
                        var73.field33 = field723 + var64;
                        var73.field35 = field723 + var67;
                        var73.field42 = var85;
                        var73.field38 = var70 * 128 + var75 * 64;
                        var73.field34 = var71 * 128 + var76 * 64;
                        var73.field36 = var82;
                        if (var68 > var72) {
                            byte var86 = var68;
                            var68 = var72;
                            var72 = var86;
                        }
                        if (var66 > var65) {
                            byte var87 = var66;
                            var66 = var65;
                            var65 = var87;
                        }
                        var73.field40 = var68 + var70;
                        var73.field45 = var70 + var72;
                        var73.field37 = var66 + var71;
                        var73.field43 = var65 + var71;
                    }
                }
            }
            if (field618 == 147) {
                int var88 = field514.method2440();
                int var89 = (var88 >> 4 & 0x7) + Statics.field13;
                int var90 = (var88 & 0x7) + Statics.field106;
                int var91 = field514.method2442();
                int var92 = field514.method2440();
                int var93 = var92 >> 4 & 0xF;
                int var94 = var92 & 0x7;
                int var95 = field514.method2440();
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    int var96 = var93 + 1;
                    if (Statics.field1096.field463[0] >= var89 - var96 && Statics.field1096.field463[0] <= var89 + var96 && Statics.field1096.field440[0] >= var90 - var96 && Statics.field1096.field440[0] <= var90 + var96 && field708 != 0 && var94 > 0 && field718 < 50) {
                        field710[field718] = var91;
                        field542[field718] = var94;
                        field712[field718] = var95;
                        field613[field718] = null;
                        field672[field718] = (var89 << 16) + (var90 << 8) + var93;
                        field718++;
                    }
                }
            }
            if (field618 == 217) {
                int var97 = field514.method2440();
                int var98 = (var97 >> 4 & 0x7) + Statics.field13;
                int var99 = (var97 & 0x7) + Statics.field106;
                int var100 = var98 + field514.method2438();
                int var101 = var99 + field514.method2438();
                int var102 = field514.method2606();
                int var103 = field514.method2442();
                int var104 = field514.method2440() * 4;
                int var105 = field514.method2440() * 4;
                int var106 = field514.method2442();
                int var107 = field514.method2442();
                int var108 = field514.method2440();
                int var109 = field514.method2440();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var101 * 128 + 64;
                    class10 var114 = new class10(var103, Statics.field1030, var110, var111, method1287(var110, var111, Statics.field1030) - var104, field723 + var106, field723 + var107, var108, var109, var102, var105);
                    var114.method109(var112, var113, method1287(var112, var113, Statics.field1030) - var105, field723 + var106);
                    field615.method3321(var114);
                }
            } else if (field618 == 11) {
                int var115 = field514.method2470();
                int var116 = field514.method2462();
                int var117 = (var116 >> 4 & 0x7) + Statics.field13;
                int var118 = (var116 & 0x7) + Statics.field106;
                int var119 = field514.method2469();
                int var120 = field514.method2442();
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && field622 != var120) {
                    class17 var121 = new class17();
                    var121.field247 = var115;
                    var121.field245 = var119;
                    if (field603[Statics.field1030][var117][var118] == null) {
                        field603[Statics.field1030][var117][var118] = new class178();
                    }
                    field603[Statics.field1030][var117][var118].method3321(var121);
                    method838(var117, var118);
                }
            }
        }
    }

    @ObfuscatedName("k.bb(IIIIIIIIII)V")
    public static final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field604.method3343(); var10 != null; var10 = (class22) field604.method3328()) {
            if (var10.field357 == arg0 && var10.field344 == arg1 && var10.field340 == arg2 && var10.field347 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field357 = arg0;
            var9.field347 = arg3;
            var9.field344 = arg1;
            var9.field340 = arg2;
            method1398(var9);
            field604.method3321(var9);
        }
        var9.field337 = arg4;
        var9.field346 = arg5;
        var9.field345 = arg6;
        var9.field349 = arg7;
        var9.field348 = arg8;
    }

    @ObfuscatedName("ej.bn(B)V")
    public static final void method2953() {
        for (class22 var0 = (class22) field604.method3343(); var0 != null; var0 = (class22) field604.method3328()) {
            if (var0.field348 == -1) {
                var0.field349 = 0;
                method1398(var0);
            } else {
                var0.method3360();
            }
        }
    }

    @ObfuscatedName("by.bp(Lp;I)V")
    public static final void method1398(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field347 == 0) {
            var1 = Statics.field356.method1872(arg0.field357, arg0.field344, arg0.field340);
        }
        if (arg0.field347 == 1) {
            var1 = Statics.field356.method1873(arg0.field357, arg0.field344, arg0.field340);
        }
        if (arg0.field347 == 2) {
            var1 = Statics.field356.method1874(arg0.field357, arg0.field344, arg0.field340);
        }
        if (arg0.field347 == 3) {
            var1 = Statics.field356.method1875(arg0.field357, arg0.field344, arg0.field340);
        }
        if (var1 != 0) {
            int var5 = Statics.field356.method1876(arg0.field357, arg0.field344, arg0.field340, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field341 = var2;
        arg0.field343 = var3;
        arg0.field342 = var4;
    }

    @ObfuscatedName("s.bm(IIIIIIIB)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field479 && Statics.field1030 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field356.method1872(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field356.method1873(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field356.method1874(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field356.method1875(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field356.method1876(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field356.method1864(arg0, arg2, arg3);
                class32 var15 = class32.method217(var12);
                if (var15.field831 != 0) {
                    field530[arg0].method2710(arg2, arg3, var13, var14, var15.field825);
                }
            }
            if (arg1 == 1) {
                Statics.field356.method1981(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field356.method1866(arg0, arg2, arg3);
                class32 var16 = class32.method217(var12);
                if (var16.field819 + arg2 > 103 || var16.field819 + arg3 > 103 || var16.field820 + arg2 > 103 || var16.field820 + arg3 > 103) {
                    return;
                }
                if (var16.field831 != 0) {
                    field530[arg0].method2684(arg2, arg3, var16.field819, var16.field820, var14, var16.field825);
                }
            }
            if (arg1 == 3) {
                Statics.field356.method1867(arg0, arg2, arg3);
                class32 var17 = class32.method217(var12);
                if (var17.field831 == 1) {
                    field530[arg0].method2709(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field110[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method2889(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field356, field530[arg0]);
    }

    @ObfuscatedName("am.bt(IIB)V")
    public static final void method838(int arg0, int arg1) {
        class178 var2 = field603[Statics.field1030][arg0][arg1];
        if (var2 == null) {
            Statics.field356.method1862(Statics.field1030, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3343(); var6 != null; var6 = (class17) var2.method3328()) {
            class40 var7 = class40.method1243(var6.field247);
            long var8 = (long) var7.field990;
            if (var7.field989 == 1) {
                var8 = (long) (var6.field245 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field356.method1862(Statics.field1030, arg0, arg1);
            return;
        }
        var2.method3322(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3343(); var12 != null; var12 = (class17) var2.method3328()) {
            if (var5.field247 != var12.field247) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field247 != var12.field247 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field356.method1854(Statics.field1030, arg0, arg1, method1287(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1030), var5, var13, var10, var11);
    }

    @ObfuscatedName("n.bh(B)V")
    public static final void method105() {
        field565 = 0;
        field592 = 0;
        field514.method2305();
        int var0 = field514.method2306(1);
        if (var0 != 0) {
            int var1 = field514.method2306(2);
            if (var1 == 0) {
                field593[++field592 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field514.method2306(3);
                Statics.field1096.method257(var2, false);
                int var3 = field514.method2306(1);
                if (var3 == 1) {
                    field593[++field592 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field514.method2306(3);
                Statics.field1096.method257(var4, true);
                int var5 = field514.method2306(3);
                Statics.field1096.method257(var5, true);
                int var6 = field514.method2306(1);
                if (var6 == 1) {
                    field593[++field592 - 1] = 2047;
                }
            } else if (var1 == 3) {
                Statics.field1030 = field514.method2306(2);
                int var7 = field514.method2306(7);
                int var8 = field514.method2306(1);
                int var9 = field514.method2306(1);
                if (var9 == 1) {
                    field593[++field592 - 1] = 2047;
                }
                int var10 = field514.method2306(7);
                Statics.field1096.method243(var7, var10, var8 == 1);
            }
        }
        method115();
        method2409();
        for (int var11 = 0; var11 < field592; var11++) {
            int var12 = field593[var11];
            class3 var13 = field595[var12];
            int var14 = field514.method2440();
            if ((var14 & 0x1) != 0) {
                var14 += field514.method2440() << 8;
            }
            if ((var14 & 0x40) != 0) {
                int var15 = field514.method2587();
                byte[] var16 = new byte[var15];
                class127 var17 = new class127(var16);
                field514.method2513(var16, 0, var15);
                field661[var12] = var17;
                var13.method9(var17);
            }
            if ((var14 & 0x2) != 0) {
                var13.field424 = field514.method2471();
                if (var13.field424.charAt(0) == '~') {
                    var13.field424 = var13.field424.substring(1);
                    method220(2, var13.field41, var13.field424);
                } else if (Statics.field1096 == var13) {
                    method220(2, var13.field41, var13.field424);
                }
                var13.field470 = 0;
                var13.field427 = 0;
                var13.field458 = 150;
            }
            if ((var14 & 0x80) != 0) {
                int var18 = field514.method2515();
                int var19 = field514.method2515();
                var13.method246(var18, var19, field723);
                var13.field422 = field723 + 300;
                var13.field449 = field514.method2515();
                var13.field433 = field514.method2515();
            }
            if ((var14 & 0x100) != 0) {
                var13.field425 = field514.method2587();
                var13.field426 = field514.method2515();
                var13.field435 = field514.method2440();
                var13.field453 = field514.method2440();
                var13.field454 = field514.method2629() + field723;
                var13.field455 = field514.method2442() + field723;
                var13.field423 = field514.method2462();
                var13.field462 = 1;
                var13.field467 = 0;
            }
            if ((var14 & 0x20) != 0) {
                int var20 = field514.method2470();
                int var21 = field514.method2462();
                int var22 = field514.method2462();
                int var23 = field514.field2022;
                if (var13.field41 != null && var13.field28 != null) {
                    boolean var24 = false;
                    if (var21 <= 1 && method810(var13.field41)) {
                        var24 = true;
                    }
                    if (!var24 && field588 == 0) {
                        field628.field2022 = 0;
                        field514.method2615(field628.field2024, 0, var22);
                        field628.field2022 = 0;
                        class127 var25 = field628;
                        String var29;
                        try {
                            int var26 = var25.method2450();
                            if (var26 > 32767) {
                                var26 = 32767;
                            }
                            byte[] var27 = new byte[var26];
                            var25.field2022 += Statics.field2851.method2358(var25.field2024, var25.field2022, var27, 0, var26);
                            String var28 = class151.method250(var27, 0, var26);
                            var29 = var28;
                        } catch (Exception var41) {
                            var29 = "Cabbage";
                        }
                        String var32 = class186.method3446(class149.method1675(var29));
                        var13.field424 = var32.trim();
                        var13.field470 = var20 >> 8;
                        var13.field427 = var20 & 0xFF;
                        var13.field458 = 150;
                        if (var21 == 2 || var21 == 3) {
                            method220(1, class2.method175(1) + var13.field41, var32);
                        } else if (var21 == 1) {
                            method220(1, class2.method175(0) + var13.field41, var32);
                        } else {
                            method220(2, var13.field41, var32);
                        }
                    }
                }
                field514.field2022 = var22 + var23;
            }
            if ((var14 & 0x400) != 0) {
                var13.field445 = field514.method2470();
                int var33 = field514.method2481();
                var13.field451 = var33 >> 16;
                var13.field450 = (var33 & 0xFFFF) + field723;
                var13.field446 = 0;
                var13.field447 = 0;
                if (var13.field450 > field723) {
                    var13.field446 = -1;
                }
                if (var13.field445 == 65535) {
                    var13.field445 = -1;
                }
            }
            if ((var14 & 0x200) != 0) {
                int var34 = field514.method2462();
                int var35 = field514.method2587();
                var13.method246(var34, var35, field723);
                var13.field422 = field723 + 300;
                var13.field449 = field514.method2462();
                var13.field433 = field514.method2515();
            }
            if ((var14 & 0x4) != 0) {
                int var36 = field514.method2470();
                if (var36 == 65535) {
                    var36 = -1;
                }
                int var37 = field514.method2587();
                method170(var13, var36, var37);
            }
            if ((var14 & 0x10) != 0) {
                var13.field464 = field514.method2442();
                var13.field436 = field514.method2470();
            }
            if ((var14 & 0x8) != 0) {
                var13.field434 = field514.method2469();
                if (var13.field434 == 65535) {
                    var13.field434 = -1;
                }
            }
        }
        for (int var38 = 0; var38 < field565; var38++) {
            int var39 = field598[var38];
            if (field723 != field595[var39].field457) {
                field595[var39] = null;
            }
        }
        if (field515 != field514.field2022) {
            throw new RuntimeException(field514.field2022 + class2.field26 + field515);
        }
        for (int var40 = 0; var40 < field590; var40++) {
            if (field595[field591[var40]] == null) {
                throw new RuntimeException(var40 + class2.field26 + field590);
            }
        }
    }

    @ObfuscatedName("j.bj(B)V")
    public static final void method115() {
        int var0 = field514.method2306(8);
        if (var0 < field590) {
            for (int var1 = var0; var1 < field590; var1++) {
                field598[++field565 - 1] = field591[var1];
            }
        }
        if (var0 > field590) {
            throw new RuntimeException("");
        }
        field590 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field591[var2];
            class3 var4 = field595[var3];
            int var5 = field514.method2306(1);
            if (var5 == 0) {
                field591[++field590 - 1] = var3;
                var4.field457 = field723;
            } else {
                int var6 = field514.method2306(2);
                if (var6 == 0) {
                    field591[++field590 - 1] = var3;
                    var4.field457 = field723;
                    field593[++field592 - 1] = var3;
                } else if (var6 == 1) {
                    field591[++field590 - 1] = var3;
                    var4.field457 = field723;
                    int var7 = field514.method2306(3);
                    var4.method257(var7, false);
                    int var8 = field514.method2306(1);
                    if (var8 == 1) {
                        field593[++field592 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field591[++field590 - 1] = var3;
                    var4.field457 = field723;
                    int var9 = field514.method2306(3);
                    var4.method257(var9, true);
                    int var10 = field514.method2306(3);
                    var4.method257(var10, true);
                    int var11 = field514.method2306(1);
                    if (var11 == 1) {
                        field593[++field592 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field598[++field565 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dj.be(I)V")
    public static final void method2409() {
        while (true) {
            if (field514.method2308(field515) >= 11) {
                int var0 = field514.method2306(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field595[var0] == null) {
                        field595[var0] = new class3();
                        if (field661[var0] != null) {
                            field595[var0].method9(field661[var0]);
                        }
                        var1 = true;
                    }
                    field591[++field590 - 1] = var0;
                    class3 var2 = field595[var0];
                    var2.field457 = field723;
                    int var3 = field514.method2306(1);
                    int var4 = field514.method2306(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field649[field514.method2306(3)];
                    if (var1) {
                        var2.field459 = var2.field413 = var5;
                    }
                    int var6 = field514.method2306(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field514.method2306(1);
                    if (var7 == 1) {
                        field593[++field592 - 1] = var0;
                    }
                    var2.method243(Statics.field1096.field463[0] + var6, Statics.field1096.field440[0] + var4, var3 == 1);
                    continue;
                }
            }
            field514.method2307();
            return;
        }
    }

    @ObfuscatedName("ak.bl(I)V")
    public static final void method1179() {
        field565 = 0;
        field592 = 0;
        field514.method2305();
        int var0 = field514.method2306(8);
        if (var0 < field476) {
            for (int var1 = var0; var1 < field476; var1++) {
                field598[++field565 - 1] = field511[var1];
            }
        }
        if (var0 > field476) {
            throw new RuntimeException("");
        }
        field476 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field511[var2];
            class25 var4 = field714[var3];
            int var5 = field514.method2306(1);
            if (var5 == 0) {
                field511[++field476 - 1] = var3;
                var4.field457 = field723;
            } else {
                int var6 = field514.method2306(2);
                if (var6 == 0) {
                    field511[++field476 - 1] = var3;
                    var4.field457 = field723;
                    field593[++field592 - 1] = var3;
                } else if (var6 == 1) {
                    field511[++field476 - 1] = var3;
                    var4.field457 = field723;
                    int var7 = field514.method2306(3);
                    var4.method257(var7, false);
                    int var8 = field514.method2306(1);
                    if (var8 == 1) {
                        field593[++field592 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field511[++field476 - 1] = var3;
                    var4.field457 = field723;
                    int var9 = field514.method2306(3);
                    var4.method257(var9, true);
                    int var10 = field514.method2306(3);
                    var4.method257(var10, true);
                    int var11 = field514.method2306(1);
                    if (var11 == 1) {
                        field593[++field592 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field598[++field565 - 1] = var3;
                }
            }
        }
        while (field514.method2308(field515) >= 27) {
            int var12 = field514.method2306(15);
            if (var12 == 32767) {
                break;
            }
            boolean var28 = false;
            if (field714[var12] == null) {
                field714[var12] = new class25();
                var28 = true;
            }
            class25 var29 = field714[var12];
            field511[++field476 - 1] = var12;
            var29.field457 = field723;
            int var30 = field514.method2306(1);
            if (var30 == 1) {
                field593[++field592 - 1] = var12;
            }
            int var31 = field649[field514.method2306(3)];
            if (var28) {
                var29.field459 = var29.field413 = var31;
            }
            int var32 = field514.method2306(5);
            if (var32 > 15) {
                var32 -= 32;
            }
            int var33 = field514.method2306(1);
            var29.field395 = class31.method3247(field514.method2306(14));
            int var34 = field514.method2306(5);
            if (var34 > 15) {
                var34 -= 32;
            }
            var29.field415 = var29.field395.field774;
            var29.field448 = var29.field395.field792;
            if (var29.field448 == 0) {
                var29.field413 = 0;
            }
            var29.field419 = var29.field395.field771;
            var29.field420 = var29.field395.field776;
            var29.field421 = var29.field395.field777;
            var29.field412 = var29.field395.field778;
            var29.field416 = var29.field395.field772;
            var29.field417 = var29.field395.field773;
            var29.field418 = var29.field395.field788;
            var29.method243(Statics.field1096.field463[0] + var32, Statics.field1096.field440[0] + var34, var33 == 1);
        }
        field514.method2307();
        for (int var13 = 0; var13 < field592; var13++) {
            int var14 = field593[var13];
            class25 var15 = field714[var14];
            int var16 = field514.method2440();
            if ((var16 & 0x40) != 0) {
                int var17 = field514.method2515();
                int var18 = field514.method2440();
                var15.method246(var17, var18, field723);
                var15.field422 = field723 + 300;
                var15.field449 = field514.method2515();
                var15.field433 = field514.method2440();
            }
            if ((var16 & 0x80) != 0) {
                var15.field395 = class31.method3247(field514.method2469());
                var15.field415 = var15.field395.field774;
                var15.field448 = var15.field395.field792;
                var15.field419 = var15.field395.field771;
                var15.field420 = var15.field395.field776;
                var15.field421 = var15.field395.field777;
                var15.field412 = var15.field395.field778;
                var15.field416 = var15.field395.field772;
                var15.field417 = var15.field395.field773;
                var15.field418 = var15.field395.field788;
            }
            if ((var16 & 0x4) != 0) {
                var15.field445 = field514.method2629();
                int var19 = field514.method2635();
                var15.field451 = var19 >> 16;
                var15.field450 = (var19 & 0xFFFF) + field723;
                var15.field446 = 0;
                var15.field447 = 0;
                if (var15.field450 > field723) {
                    var15.field446 = -1;
                }
                if (var15.field445 == 65535) {
                    var15.field445 = -1;
                }
            }
            if ((var16 & 0x10) != 0) {
                int var20 = field514.method2587();
                int var21 = field514.method2462();
                var15.method246(var20, var21, field723);
                var15.field422 = field723 + 300;
                var15.field449 = field514.method2462();
                var15.field433 = field514.method2587();
            }
            if ((var16 & 0x8) != 0) {
                var15.field464 = field514.method2442();
                var15.field436 = field514.method2629();
            }
            if ((var16 & 0x1) != 0) {
                int var22 = field514.method2442();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field514.method2587();
                if (var15.field414 == var22 && var22 != -1) {
                    int var24 = class34.method2198(var22).field885;
                    if (var24 == 1) {
                        var15.field441 = 0;
                        var15.field461 = 0;
                        var15.field443 = var23;
                        var15.field444 = 0;
                    }
                    if (var24 == 2) {
                        var15.field444 = 0;
                    }
                } else if (var22 == -1 || var15.field414 == -1 || class34.method2198(var22).field884 >= class34.method2198(var15.field414).field884) {
                    var15.field414 = var22;
                    var15.field441 = 0;
                    var15.field461 = 0;
                    var15.field443 = var23;
                    var15.field444 = 0;
                    var15.field467 = var15.field462;
                }
            }
            if ((var16 & 0x2) != 0) {
                var15.field424 = field514.method2471();
                var15.field458 = 100;
            }
            if ((var16 & 0x20) != 0) {
                var15.field434 = field514.method2470();
                if (var15.field434 == 65535) {
                    var15.field434 = -1;
                }
            }
        }
        for (int var25 = 0; var25 < field565; var25++) {
            int var26 = field598[var25];
            if (field723 != field714[var26].field457) {
                field714[var26].field395 = null;
                field714[var26] = null;
            }
        }
        if (field515 != field514.field2022) {
            throw new RuntimeException(field514.field2022 + class2.field26 + field515);
        }
        for (int var27 = 0; var27 < field476; var27++) {
            if (field714[field511[var27]] == null) {
                throw new RuntimeException(var27 + class2.field26 + field476);
            }
        }
    }

    @ObfuscatedName("w.bv(B)V")
    public static final void method23() {
        int var0 = Statics.field126;
        int var1 = Statics.field193;
        int var2 = Statics.field350;
        int var3 = Statics.field761;
        int var4 = 6116423;
        class89.method1782(var0, var1, var2, var3, var4);
        class89.method1782(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class89.method1784(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field785.method3467(class136.field2185, var0 + 3, var1 + 14, var4, -1);
        int var5 = class77.field1378;
        int var6 = class77.field1379 * -1108917615;
        for (int var7 = 0; var7 < field612; var7++) {
            int var8 = (field612 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class184 var10 = Statics.field785;
            String var11;
            if (field652[var7].length() > 0) {
                var11 = field617[var7] + class136.field2224 + field652[var7];
            } else {
                var11 = field617[var7];
            }
            var10.method3467(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field126;
        int var13 = Statics.field193;
        int var14 = Statics.field350;
        int var15 = Statics.field761;
        for (int var16 = 0; var16 < field670; var16++) {
            if (field675[var16] + field674[var16] > var12 && field675[var16] < var12 + var14 && field676[var16] + field475[var16] > var13 && field676[var16] < var13 + var15) {
                field673[var16] = true;
            }
        }
    }

    @ObfuscatedName("aq.bc(IIIIB)V")
    public static final void method806(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field670; var4++) {
            if (field675[var4] + field674[var4] > arg0 && field675[var4] < arg0 + arg2 && field676[var4] + field475[var4] > arg1 && field676[var4] < arg1 + arg3) {
                field519[var4] = true;
            }
        }
    }

    @ObfuscatedName("q.br(I)V")
    public static final void method143() {
        int var0 = Statics.field785.method3390(class136.field2185);
        for (int var1 = 0; var1 < field612; var1++) {
            class184 var2 = Statics.field785;
            String var3;
            if (field652[var1].length() > 0) {
                var3 = field617[var1] + class136.field2224 + field652[var1];
            } else {
                var3 = field617[var1];
            }
            int var4 = var2.method3390(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field612 * 15 + 21;
        int var6 = class77.field1372 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1376;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field703 = true;
        Statics.field126 = var6;
        Statics.field193 = var7;
        Statics.field350 = var0;
        Statics.field761 = field612 * 15 + 22;
    }

    @ObfuscatedName("z.bx(IB)Z")
    public static final boolean method47(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field658[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("h.bu(II)V")
    public static final void method224(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field516[arg0];
        int var2 = field614[arg0];
        int var3 = field658[arg0];
        int var4 = field616[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 8) {
            class25 var5 = field714[var4];
            if (var5 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(216);
                field513.method2496(var4);
                field513.method2479(Statics.field354);
                field513.method2460(class75.field1345[82] ? 1 : 0);
                field513.method2467(field626);
            }
        }
        if (var3 == 12) {
            class25 var6 = field714[var4];
            if (var6 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(161);
                field513.method2458(class75.field1345[82] ? 1 : 0);
                field513.method2496(var4);
            }
        }
        if (var3 == 19) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(250);
            field513.method2458(class75.field1345[82] ? 1 : 0);
            field513.method2467(Statics.field252 + var1);
            field513.method2467(var4);
            field513.method2496(Statics.field924 + var2);
        }
        if (var3 == 20) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(119);
            field513.method2444(var4);
            field513.method2459(class75.field1345[82] ? 1 : 0);
            field513.method2496(Statics.field252 + var1);
            field513.method2444(Statics.field924 + var2);
        }
        if (var3 == 38) {
            method138();
            class160 var7 = class160.method628(var2);
            field500 = 1;
            Statics.field70 = var1;
            Statics.field270 = var2;
            Statics.field2482 = var4;
            method882(var7);
            field624 = class2.method2414(16748608) + class40.method1243(var4).field1010 + class2.method2414(16777215);
            if (field624 == null) {
                field624 = "null";
            }
            return;
        }
        if (var3 == 58) {
            field513.method2326(85);
            field513.method2479(var2);
            field513.method2540(Statics.field354);
            field513.method2467(var1);
            field513.method2467(field626);
        }
        if (var3 == 30 && field633 == null) {
            method151(var2, var1);
            field633 = class160.method141(var2, var1);
            method882(field633);
        }
        if (var3 == 4) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(9);
            field513.method2467(var4 >> 14 & 0x7FFF);
            field513.method2458(class75.field1345[82] ? 1 : 0);
            field513.method2444(Statics.field252 + var1);
            field513.method2467(Statics.field924 + var2);
        }
        if (var3 == 26) {
            field513.method2326(54);
            for (class4 var8 = (class4) field630.method3317(); var8 != null; var8 = (class4) field630.method3299()) {
                if (var8.field49 == 0 || var8.field49 == 3) {
                    method2727(var8, true);
                }
            }
            if (field633 != null) {
                method882(field633);
                field633 = null;
            }
        }
        if (var3 == 23) {
            Statics.field356.method2007(Statics.field1030, var1, var2);
        }
        if (var3 == 47) {
            class3 var9 = field595[var4];
            if (var9 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(113);
                field513.method2460(class75.field1345[82] ? 1 : 0);
                field513.method2424(var4);
            }
        }
        if (var3 == 33) {
            field513.method2326(112);
            field513.method2467(var1);
            field513.method2467(var4);
            field513.method2528(var2);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 22) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(157);
            field513.method2496(Statics.field924 + var2);
            field513.method2496(var4);
            field513.method2467(Statics.field252 + var1);
            field513.method2459(class75.field1345[82] ? 1 : 0);
        }
        if (var3 == 49) {
            class3 var10 = field595[var4];
            if (var10 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(24);
                field513.method2444(var4);
                field513.method2458(class75.field1345[82] ? 1 : 0);
            }
        }
        if (var3 == 41) {
            field513.method2326(153);
            field513.method2444(var4);
            field513.method2467(var1);
            field513.method2540(var2);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 1004) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field513.method2326(205);
            field513.method2467(var4);
        }
        if (var3 == 1005) {
            class160 var11 = class160.method628(var2);
            if (var11 == null || var11.field2719[var1] < 100000) {
                field513.method2326(205);
                field513.method2467(var4);
            } else {
                method220(27, "", var11.field2719[var1] + " x " + class40.method1243(var4).field1010);
            }
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 45) {
            class3 var12 = field595[var4];
            if (var12 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(60);
                field513.method2424(var4);
                field513.method2460(class75.field1345[82] ? 1 : 0);
            }
        }
        if (var3 == 36) {
            field513.method2326(42);
            field513.method2496(var4);
            field513.method2444(var1);
            field513.method2574(var2);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 14) {
            class3 var13 = field595[var4];
            if (var13 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(101);
                field513.method2493(class75.field1345[82] ? 1 : 0);
                field513.method2496(Statics.field70);
                field513.method2496(var4);
                field513.method2444(Statics.field2482);
                field513.method2479(Statics.field270);
            }
        }
        if (var3 == 35) {
            field513.method2326(249);
            field513.method2444(var4);
            field513.method2444(var1);
            field513.method2528(var2);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 31) {
            field513.method2326(22);
            field513.method2540(Statics.field270);
            field513.method2467(Statics.field2482);
            field513.method2528(var2);
            field513.method2444(Statics.field70);
            field513.method2467(var1);
            field513.method2467(var4);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 15) {
            class3 var14 = field595[var4];
            if (var14 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(201);
                field513.method2458(class75.field1345[82] ? 1 : 0);
                field513.method2479(Statics.field354);
                field513.method2496(var4);
                field513.method2467(field626);
            }
        }
        if (var3 == 1) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(43);
            field513.method2444(Statics.field70);
            field513.method2424(Statics.field2482);
            field513.method2424(var4 >> 14 & 0x7FFF);
            field513.method2493(class75.field1345[82] ? 1 : 0);
            field513.method2444(Statics.field924 + var2);
            field513.method2528(Statics.field270);
            field513.method2444(Statics.field252 + var1);
        }
        if (var3 == 2) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(219);
            field513.method2479(Statics.field354);
            field513.method2458(class75.field1345[82] ? 1 : 0);
            field513.method2424(Statics.field252 + var1);
            field513.method2444(Statics.field924 + var2);
            field513.method2467(field626);
            field513.method2424(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 28) {
            field513.method2326(143);
            field513.method2540(var2);
            class160 var15 = class160.method628(var2);
            if (var15.field2707 != null && var15.field2707[0][0] == 5) {
                int var16 = var15.field2707[0][1];
                class161.field2736[var16] = 1 - class161.field2736[var16];
                method2996(var16);
            }
        }
        if (var3 == 34) {
            field513.method2326(184);
            field513.method2479(var2);
            field513.method2496(var4);
            field513.method2424(var1);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 43) {
            field513.method2326(110);
            field513.method2424(var1);
            field513.method2479(var2);
            field513.method2444(var4);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 46) {
            class3 var17 = field595[var4];
            if (var17 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(28);
                field513.method2459(class75.field1345[82] ? 1 : 0);
                field513.method2467(var4);
            }
        }
        if (var3 == 13) {
            class25 var18 = field714[var4];
            if (var18 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(26);
                field513.method2444(var4);
                field513.method2493(class75.field1345[82] ? 1 : 0);
            }
        }
        if (var3 == 44) {
            class3 var19 = field595[var4];
            if (var19 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(145);
                field513.method2458(class75.field1345[82] ? 1 : 0);
                field513.method2467(var4);
            }
        }
        if (var3 == 24) {
            class160 var20 = class160.method628(var2);
            boolean var21 = true;
            if (var20.field2732 > 0) {
                var21 = method562(var20);
            }
            if (var21) {
                field513.method2326(143);
                field513.method2540(var2);
            }
        }
        if (var3 == 40) {
            field513.method2326(156);
            field513.method2467(var4);
            field513.method2540(var2);
            field513.method2444(var1);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 37) {
            field513.method2326(247);
            field513.method2467(var1);
            field513.method2574(var2);
            field513.method2496(var4);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 3) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(2);
            field513.method2424(Statics.field252 + var1);
            field513.method2493(class75.field1345[82] ? 1 : 0);
            field513.method2444(Statics.field924 + var2);
            field513.method2444(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 5) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(81);
            field513.method2459(class75.field1345[82] ? 1 : 0);
            field513.method2444(Statics.field252 + var1);
            field513.method2467(var4 >> 14 & 0x7FFF);
            field513.method2444(Statics.field924 + var2);
        }
        if (var3 == 25) {
            class160 var22 = class160.method141(var2, var1);
            if (var22 != null) {
                method138();
                int var23 = method216(var22);
                int var24 = var23 >> 11 & 0x3F;
                class160 var26 = class160.method141(var2, var1);
                if (var26 != null && var26.field2680 != null) {
                    class1 var27 = new class1();
                    var27.field11 = var26;
                    var27.field5 = var26.field2680;
                    class26.method769(var27);
                }
                field625 = true;
                Statics.field354 = var2;
                field626 = var1;
                Statics.field353 = var24;
                method882(var26);
                field500 = 0;
                int var28 = method216(var22);
                int var29 = var28 >> 11 & 0x3F;
                String var30;
                if (var29 == 0) {
                    var30 = null;
                } else if (var22.field2609 == null || var22.field2609.trim().length() == 0) {
                    var30 = null;
                } else {
                    var30 = var22.field2609;
                }
                field627 = var30;
                if (field627 == null) {
                    field627 = "Null";
                }
                if (var22.field2615) {
                    field589 = var22.field2676 + class2.method2414(16777215);
                } else {
                    field589 = class2.method2414(65280) + var22.field2660 + class2.method2414(16777215);
                }
            }
            return;
        }
        if (var3 == 1002) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field513.method2326(93);
            field513.method2467(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 9) {
            class25 var31 = field714[var4];
            if (var31 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(202);
                field513.method2459(class75.field1345[82] ? 1 : 0);
                field513.method2496(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            method853(var4, var2, var1, field652[arg0]);
        }
        if (var3 == 51) {
            class3 var32 = field595[var4];
            if (var32 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(182);
                field513.method2460(class75.field1345[82] ? 1 : 0);
                field513.method2424(var4);
            }
        }
        if (var3 == 1003) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            class25 var33 = field714[var4];
            if (var33 != null) {
                class31 var34 = var33.field395;
                if (var34.field793 != null) {
                    var34 = var34.method612();
                }
                if (var34 != null) {
                    field513.method2326(39);
                    field513.method2444(var34.field800);
                }
            }
        }
        if (var3 == 42) {
            field513.method2326(162);
            field513.method2467(var1);
            field513.method2424(var4);
            field513.method2528(var2);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 6) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(165);
            field513.method2444(var4 >> 14 & 0x7FFF);
            field513.method2496(Statics.field252 + var1);
            field513.method2458(class75.field1345[82] ? 1 : 0);
            field513.method2467(Statics.field924 + var2);
        }
        if (var3 == 29) {
            field513.method2326(143);
            field513.method2540(var2);
            class160 var35 = class160.method628(var2);
            if (var35.field2707 != null && var35.field2707[0][0] == 5) {
                int var36 = var35.field2707[0][1];
                if (class161.field2736[var36] != var35.field2664[0]) {
                    class161.field2736[var36] = var35.field2664[0];
                    method2996(var36);
                }
            }
        }
        if (var3 == 1001) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(94);
            field513.method2467(Statics.field252 + var1);
            field513.method2496(var4 >> 14 & 0x7FFF);
            field513.method2458(class75.field1345[82] ? 1 : 0);
            field513.method2444(Statics.field924 + var2);
        }
        if (var3 == 18) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(68);
            field513.method2424(Statics.field924 + var2);
            field513.method2460(class75.field1345[82] ? 1 : 0);
            field513.method2467(var4);
            field513.method2496(Statics.field252 + var1);
        }
        if (var3 == 10) {
            class25 var37 = field714[var4];
            if (var37 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(31);
                field513.method2493(class75.field1345[82] ? 1 : 0);
                field513.method2467(var4);
            }
        }
        if (var3 == 21) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(132);
            field513.method2424(var4);
            field513.method2424(Statics.field252 + var1);
            field513.method2467(Statics.field924 + var2);
            field513.method2459(class75.field1345[82] ? 1 : 0);
        }
        if (var3 == 16) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(246);
            field513.method2467(Statics.field924 + var2);
            field513.method2424(var4);
            field513.method2444(Statics.field2482);
            field513.method2493(class75.field1345[82] ? 1 : 0);
            field513.method2444(Statics.field70);
            field513.method2528(Statics.field270);
            field513.method2444(Statics.field252 + var1);
        }
        if (var3 == 32) {
            field513.method2326(90);
            field513.method2479(var2);
            field513.method2424(field626);
            field513.method2467(var4);
            field513.method2528(Statics.field354);
            field513.method2444(var1);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 17) {
            field726 = class77.field1372;
            field577 = class77.field1376;
            field579 = 2;
            field485 = 0;
            field656 = var1;
            field702 = var2;
            field513.method2326(237);
            field513.method2459(class75.field1345[82] ? 1 : 0);
            field513.method2496(Statics.field924 + var2);
            field513.method2424(var4);
            field513.method2444(field626);
            field513.method2479(Statics.field354);
            field513.method2467(Statics.field252 + var1);
        }
        if (var3 == 50) {
            class3 var38 = field595[var4];
            if (var38 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(241);
                field513.method2444(var4);
                field513.method2458(class75.field1345[82] ? 1 : 0);
            }
        }
        if (var3 == 7) {
            class25 var39 = field714[var4];
            if (var39 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(72);
                field513.method2540(Statics.field270);
                field513.method2444(Statics.field2482);
                field513.method2444(var4);
                field513.method2458(class75.field1345[82] ? 1 : 0);
                field513.method2496(Statics.field70);
            }
        }
        if (var3 == 39) {
            field513.method2326(137);
            field513.method2424(var4);
            field513.method2528(var2);
            field513.method2424(var1);
            field502 = 0;
            Statics.field2017 = class160.method628(var2);
            field581 = var1;
        }
        if (var3 == 11) {
            class25 var40 = field714[var4];
            if (var40 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(30);
                field513.method2459(class75.field1345[82] ? 1 : 0);
                field513.method2424(var4);
            }
        }
        if (var3 == 48) {
            class3 var41 = field595[var4];
            if (var41 != null) {
                field726 = class77.field1372;
                field577 = class77.field1376;
                field579 = 2;
                field485 = 0;
                field656 = var1;
                field702 = var2;
                field513.method2326(37);
                field513.method2459(class75.field1345[82] ? 1 : 0);
                field513.method2444(var4);
            }
        }
        if (field500 != 0) {
            field500 = 0;
            method882(class160.method628(Statics.field270));
        }
        if (field625) {
            method138();
        }
        if (Statics.field2017 != null && field502 == 0) {
            method882(Statics.field2017);
        }
    }

    @ObfuscatedName("a.bo(B)V")
    public static void method138() {
        if (!field625) {
            return;
        }
        class160 var0 = class160.method141(Statics.field354, field626);
        if (var0 != null && var0.field2628 != null) {
            class1 var1 = new class1();
            var1.field11 = var0;
            var1.field5 = var0.field2628;
            class26.method769(var1);
        }
        field625 = false;
        method882(var0);
    }

    @ObfuscatedName("y.by(III)V")
    public static void method151(int arg0, int arg1) {
        field513.method2326(178);
        field513.method2444(arg1);
        field513.method2479(arg0);
    }

    @ObfuscatedName("af.bg(IIILjava/lang/String;I)V")
    public static void method853(int arg0, int arg1, int arg2, String arg3) {
        class160 var4 = class160.method141(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2659 != null) {
            class1 var5 = new class1();
            var5.field11 = var4;
            var5.field6 = arg0;
            var5.field10 = arg3;
            var5.field5 = var4.field2659;
            class26.method769(var5);
        }
        boolean var6 = true;
        if (var4.field2732 > 0) {
            var6 = method562(var4);
        }
        if (!var6 || !class164.method2022(method216(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field513.method2326(187);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 2) {
            field513.method2326(167);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 3) {
            field513.method2326(152);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 4) {
            field513.method2326(59);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 5) {
            field513.method2326(82);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 6) {
            field513.method2326(238);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 7) {
            field513.method2326(195);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 8) {
            field513.method2326(44);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 9) {
            field513.method2326(210);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
        if (arg0 == 10) {
            field513.method2326(203);
            field513.method2540(arg1);
            field513.method2424(arg2);
        }
    }

    @ObfuscatedName("be.ba(B)V")
    public static final void method1332() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field612 - 1; var1++) {
                if (field658[var1] < 1000 && field658[var1 + 1] > 1000) {
                    String var2 = field652[var1];
                    field652[var1] = field652[var1 + 1];
                    field652[var1 + 1] = var2;
                    String var3 = field617[var1];
                    field617[var1] = field617[var1 + 1];
                    field617[var1 + 1] = var3;
                    int var4 = field658[var1];
                    field658[var1] = field658[var1 + 1];
                    field658[var1 + 1] = var4;
                    int var5 = field516[var1];
                    field516[var1] = field516[var1 + 1];
                    field516[var1 + 1] = var5;
                    int var6 = field614[var1];
                    field614[var1] = field614[var1 + 1];
                    field614[var1 + 1] = var6;
                    int var7 = field616[var1];
                    field616[var1] = field616[var1 + 1];
                    field616[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("h.bf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method223(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field703 || field612 >= 500) {
            return;
        }
        field617[field612] = arg0;
        field652[field612] = arg1;
        field658[field612] = arg2;
        field616[field612] = arg3;
        field516[field612] = arg4;
        field614[field612] = arg5;
        field612++;
    }

    @ObfuscatedName("es.bk(I)V")
    public static void method2718() {
        for (int var0 = 0; var0 < field612; var0++) {
            if (method1424(field658[var0])) {
                if (var0 < field612 - 1) {
                    for (int var1 = var0; var1 < field612 - 1; var1++) {
                        field617[var1] = field617[var1 + 1];
                        field652[var1] = field652[var1 + 1];
                        field658[var1] = field658[var1 + 1];
                        field616[var1] = field616[var1 + 1];
                        field516[var1] = field516[var1 + 1];
                        field614[var1] = field614[var1 + 1];
                    }
                }
                field612--;
            }
        }
    }

    @ObfuscatedName("bg.bz(II)Z")
    public static boolean method1424(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("k.bq(IIIII)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3) {
        if (field500 == 0 && !field625) {
            method223(class136.field2090, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1849; var5++) {
            int var6 = class112.field1889[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field356.method1876(Statics.field1030, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method217(var10);
                    if (var11.field845 != null) {
                        var11 = var11.method639();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field500 == 1) {
                        method223(class136.field2229, field624 + " " + class2.field21 + " " + class2.method2414(65535) + var11.field842, 1, var6, var7, var8);
                    } else if (!field625) {
                        String[] var12 = var11.field852;
                        if (field639) {
                            var12 = method2954(var12);
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
                                    method223(var12[var13], class2.method2414(65535) + var11.field842, var14, var6, var7, var8);
                                }
                            }
                        }
                        method223(class136.field2230, class2.method2414(65535) + var11.field842, 1002, var11.field805 << 14, var7, var8);
                    } else if ((Statics.field353 & 0x4) == 4) {
                        method223(field627, field589 + " " + class2.field21 + " " + class2.method2414(65535) + var11.field842, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field714[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field395.field774 == 1 && (var15.field442 & 0x7F) == 64 && (var15.field430 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field476; var16++) {
                            class25 var17 = field714[field511[var16]];
                            if (var17 != null && var15 != var17 && var17.field395.field774 == 1 && var15.field442 == var17.field442 && var15.field430 == var17.field430) {
                                method24(var17.field395, field511[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field590; var18++) {
                            class3 var19 = field595[field591[var18]];
                            if (var19 != null && var15.field442 == var19.field442 && var15.field430 == var19.field430) {
                                method833(var19, field591[var18], var7, var8);
                            }
                        }
                    }
                    method24(var15.field395, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field595[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field442 & 0x7F) == 64 && (var20.field430 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field476; var21++) {
                            class25 var22 = field714[field511[var21]];
                            if (var22 != null && var22.field395.field774 == 1 && var20.field442 == var22.field442 && var20.field430 == var22.field430) {
                                method24(var22.field395, field511[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field590; var23++) {
                            class3 var24 = field595[field591[var23]];
                            if (var24 != null && var20 != var24 && var20.field442 == var24.field442 && var20.field430 == var24.field430) {
                                method833(var24, field591[var23], var7, var8);
                            }
                        }
                    }
                    method833(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class178 var25 = field603[Statics.field1030][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3327(); var26 != null; var26 = (class17) var25.method3348()) {
                            class40 var27 = class40.method1243(var26.field247);
                            if (field500 == 1) {
                                method223(class136.field2229, field624 + " " + class2.field21 + " " + class2.method2414(16748608) + var27.field1010, 16, var26.field247, var7, var8);
                            } else if (!field625) {
                                String[] var28 = var27.field994;
                                if (field639) {
                                    var28 = method2954(var28);
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
                                        method223(var28[var29], class2.method2414(16748608) + var27.field1010, var30, var26.field247, var7, var8);
                                    } else if (var29 == 2) {
                                        method223(class136.field2091, class2.method2414(16748608) + var27.field1010, 20, var26.field247, var7, var8);
                                    }
                                }
                                method223(class136.field2230, class2.method2414(16748608) + var27.field1010, 1004, var26.field247, var7, var8);
                            } else if ((Statics.field353 & 0x1) == 1) {
                                method223(field627, field589 + " " + class2.field21 + " " + class2.method2414(16748608) + var27.field1010, 17, var26.field247, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.bw(Lat;IIII)V")
    public static final void method24(class31 arg0, int arg1, int arg2, int arg3) {
        if (field612 >= 400) {
            return;
        }
        if (arg0.field793 != null) {
            arg0 = arg0.method612();
        }
        if (arg0 == null || !arg0.field796) {
            return;
        }
        String var4 = arg0.field768;
        if (arg0.field769 != 0) {
            var4 = var4 + method127(arg0.field769, Statics.field1096.field31) + " " + class2.field19 + class136.field2235 + arg0.field769 + class2.field20;
        }
        if (field500 == 1) {
            method223(class136.field2229, field624 + " " + class2.field21 + " " + class2.method2414(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field625) {
            String[] var5 = arg0.field783;
            if (field639) {
                var5 = method2954(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class136.field2198)) {
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
                        method223(var5[var6], class2.method2414(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class136.field2198)) {
                        short var9 = 0;
                        if (arg0.field769 > Statics.field1096.field31) {
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
                        method223(var5[var8], class2.method2414(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method223(class136.field2230, class2.method2414(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field353 & 0x2) == 2) {
            method223(field627, field589 + " " + class2.field21 + " " + class2.method2414(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("am.bs(Lo;IIII)V")
    public static final void method833(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1096 == arg0 || field612 >= 400) {
            return;
        }
        String var4;
        if (arg0.field27 == 0) {
            var4 = arg0.field41 + method127(arg0.field31, Statics.field1096.field31) + " " + class2.field19 + class136.field2235 + arg0.field31 + class2.field20;
        } else {
            var4 = arg0.field41 + " " + class2.field19 + class136.field2236 + arg0.field27 + class2.field20;
        }
        if (field500 == 1) {
            method223(class136.field2229, field624 + " " + class2.field21 + " " + class2.method2414(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field625) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field705[var5] != null) {
                    short var6 = 0;
                    if (field705[var5].equalsIgnoreCase(class136.field2198)) {
                        if (arg0.field31 > Statics.field1096.field31) {
                            var6 = 2000;
                        }
                        if (Statics.field1096.field39 != 0 && arg0.field39 != 0) {
                            if (Statics.field1096.field39 == arg0.field39) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field601[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field694[var5] + var6;
                    method223(field705[var5], class2.method2414(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field353 & 0x8) == 8) {
            method223(field627, field589 + " " + class2.field21 + " " + class2.method2414(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field612; var9++) {
            if (field658[var9] == 23) {
                field652[var9] = class2.method2414(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("m.cl(III)Ljava/lang/String;")
    public static final String method127(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2414(16711680);
        } else if (var2 < -6) {
            return class2.method2414(16723968);
        } else if (var2 < -3) {
            return class2.method2414(16740352);
        } else if (var2 < 0) {
            return class2.method2414(16756736);
        } else if (var2 > 9) {
            return class2.method2414(65280);
        } else if (var2 > 6) {
            return class2.method2414(4259584);
        } else if (var2 > 3) {
            return class2.method2414(8453888);
        } else if (var2 > 0) {
            return class2.method2414(12648192);
        } else {
            return class2.method2414(16776960);
        }
    }

    @ObfuscatedName("i.cd(IIIIIIIII)V")
    public static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class160.method2728(arg0)) {
            Statics.field2517 = null;
            method822(Statics.field2688[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2517 != null) {
                method822(Statics.field2517, -1412584499, arg1, arg2, arg3, arg4, Statics.field130, Statics.field163, arg7);
                Statics.field2517 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field519[var8] = true;
            }
        } else {
            field519[arg7] = true;
        }
    }

    @ObfuscatedName("ax.ck([Lfc;IIIIIIIII)V")
    public static final void method822(class160[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1776(arg2, arg3, arg4, arg5);
        class104.method2126();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class160 var10 = arg0[var9];
            if (var10 != null && (var10.field2627 == arg1 || arg1 == -1412584499 && field640 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field675[field670] = var10.field2621 + arg6;
                    field676[field670] = var10.field2622 + arg7;
                    field674[field670] = var10.field2625;
                    field475[field670] = var10.field2626;
                    var11 = ++field670 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2731 = var11;
                var10.field2706 = field723;
                if (!var10.field2615 || !method111(var10)) {
                    if (var10.field2732 > 0) {
                        method2732(var10);
                    }
                    int var12 = var10.field2621 + arg6;
                    int var13 = var10.field2622 + arg7;
                    int var14 = var10.field2678;
                    if (field640 == var10) {
                        if (arg1 != -1412584499 && !var10.field2721) {
                            Statics.field2517 = arg0;
                            Statics.field130 = arg6;
                            Statics.field163 = arg7;
                            continue;
                        }
                        if (field651 && field555) {
                            int var15 = class77.field1378;
                            int var16 = class77.field1379 * -1108917615;
                            int var17 = var15 - field642;
                            int var18 = var16 - field499;
                            if (var17 < field646) {
                                var17 = field646;
                            }
                            if (var10.field2625 + var17 > field646 + field641.field2625) {
                                var17 = field646 + field641.field2625 - var10.field2625;
                            }
                            if (var18 < field647) {
                                var18 = field647;
                            }
                            if (var10.field2626 + var18 > field647 + field641.field2626) {
                                var18 = field647 + field641.field2626 - var10.field2626;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2721) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2698 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2698 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2625 + var12;
                        int var26 = var10.field2626 + var13;
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
                        int var29 = var10.field2625 + var12;
                        int var30 = var10.field2626 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2615 || var19 < var21 && var20 < var22) {
                        if (var10.field2732 != 0) {
                            if (var10.field2732 == 1337) {
                                field619 = var12;
                                field709 = var13;
                                method126(var12, var13, var10.field2625, var10.field2626);
                                class89.method1776(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2732 == 1338) {
                                method1502();
                                class89.method1776(var12, var13, Statics.field2602.field1473 + var12, Statics.field2602.field1472 + var13);
                                if (field522 == 2 || field522 == 5) {
                                    class89.method1791(var12 + 25, var13 + 5, 0, Statics.field1296, Statics.field51);
                                } else {
                                    int var31 = field554 + field510 & 0x7FF;
                                    int var32 = Statics.field1096.field442 / 32 + 48;
                                    int var33 = 464 - Statics.field1096.field430 / 32;
                                    Statics.field2583.method1730(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field543 + 256, Statics.field1296, Statics.field51);
                                    for (int var34 = 0; var34 < field697; var34++) {
                                        int var35 = field698[var34] * 4 + 2 - Statics.field1096.field442 / 32;
                                        int var36 = field699[var34] * 4 + 2 - Statics.field1096.field430 / 32;
                                        method3246(var12, var13, var35, var36, field638[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class178 var39 = field603[Statics.field1030][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field1096.field442 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field1096.field430 / 32;
                                                method3246(var12, var13, var40, var41, Statics.field1001[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field476; var42++) {
                                        class25 var43 = field714[field511[var42]];
                                        if (var43 != null && var43.method20()) {
                                            class31 var44 = var43.field395;
                                            if (var44 != null && var44.field793 != null) {
                                                var44 = var44.method612();
                                            }
                                            if (var44 != null && var44.field784 && var44.field796) {
                                                int var45 = var43.field442 / 32 - Statics.field1096.field442 / 32;
                                                int var46 = var43.field430 / 32 - Statics.field1096.field430 / 32;
                                                method3246(var12, var13, var45, var46, Statics.field1001[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field590; var47++) {
                                        class3 var48 = field595[field591[var47]];
                                        if (var48 != null && var48.method20()) {
                                            int var49 = var48.field442 / 32 - Statics.field1096.field442 / 32;
                                            int var50 = var48.field430 / 32 - Statics.field1096.field430 / 32;
                                            boolean var51 = false;
                                            if (method2209(var48.field41)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field764; var53++) {
                                                if (var48.field41.equals(Statics.field1200[var53].field100)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field1096.field39 != 0 && var48.field39 != 0 && Statics.field1096.field39 == var48.field39) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method3246(var12, var13, var49, var50, Statics.field1001[3]);
                                            } else if (var54) {
                                                method3246(var12, var13, var49, var50, Statics.field1001[4]);
                                            } else if (var52) {
                                                method3246(var12, var13, var49, var50, Statics.field1001[5]);
                                            } else {
                                                method3246(var12, var13, var49, var50, Statics.field1001[2]);
                                            }
                                        }
                                    }
                                    if (field491 != 0 && field723 % 20 < 10) {
                                        if (field491 == 1 && field492 >= 0 && field492 < field714.length) {
                                            class25 var55 = field714[field492];
                                            if (var55 != null) {
                                                int var56 = var55.field442 / 32 - Statics.field1096.field442 / 32;
                                                int var57 = var55.field430 / 32 - Statics.field1096.field430 / 32;
                                                method32(var12, var13, var56, var57, Statics.field2487[1]);
                                            }
                                        }
                                        if (field491 == 2) {
                                            int var58 = field494 * 4 - Statics.field252 * 4 + 2 - Statics.field1096.field442 / 32;
                                            int var59 = field495 * 4 - Statics.field924 * 4 + 2 - Statics.field1096.field430 / 32;
                                            method32(var12, var13, var58, var59, Statics.field2487[1]);
                                        }
                                        if (field491 == 10 && field493 >= 0 && field493 < field595.length) {
                                            class3 var60 = field595[field493];
                                            if (var60 != null) {
                                                int var61 = var60.field442 / 32 - Statics.field1096.field442 / 32;
                                                int var62 = var60.field430 / 32 - Statics.field1096.field430 / 32;
                                                method32(var12, var13, var61, var62, Statics.field2487[1]);
                                            }
                                        }
                                    }
                                    if (field656 != 0) {
                                        int var63 = field656 * 4 + 2 - Statics.field1096.field442 / 32;
                                        int var64 = field702 * 4 + 2 - Statics.field1096.field430 / 32;
                                        method3246(var12, var13, var63, var64, Statics.field2487[0]);
                                    }
                                    class89.method1782(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field522 < 3) {
                                    Statics.field96.method1730(var12, var13, 33, 33, 25, 25, field554, 256, Statics.field1257, Statics.field2086);
                                } else {
                                    class89.method1791(var12, var13, 0, Statics.field1257, Statics.field2086);
                                }
                                if (field701[var11]) {
                                    Statics.field2602.method1765(var12, var13);
                                }
                                field673[var11] = true;
                                class89.method1776(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2698 == 0) {
                            if (!var10.field2615 && method111(var10) && Statics.field1349 != var10) {
                                continue;
                            }
                            if (!var10.field2615) {
                                if (var10.field2658 > var10.field2632 - var10.field2626) {
                                    var10.field2658 = var10.field2632 - var10.field2626;
                                }
                                if (var10.field2658 < 0) {
                                    var10.field2658 = 0;
                                }
                            }
                            method822(arg0, var10.field2616, var19, var20, var21, var22, var12 - var10.field2629, var13 - var10.field2658, var11);
                            if (var10.field2705 != null) {
                                method822(var10.field2705, var10.field2616, var19, var20, var21, var22, var12 - var10.field2629, var13 - var10.field2658, var11);
                            }
                            class4 var65 = (class4) field630.method3300((long) var10.field2616);
                            if (var65 != null) {
                                method215(var65.field50, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1776(arg2, arg3, arg4, arg5);
                            class104.method2126();
                        }
                        if (field701[var11] || field483 > 1) {
                            if (var10.field2698 == 0 && !var10.field2615 && var10.field2632 > var10.field2626) {
                                method144(var10.field2625 + var12, var13, var10.field2658, var10.field2626, var10.field2632);
                            }
                            if (var10.field2698 != 1) {
                                if (var10.field2698 == 2) {
                                    int var66 = 0;
                                    for (int var67 = 0; var67 < var10.field2626; var67++) {
                                        for (int var68 = 0; var68 < var10.field2625; var68++) {
                                            int var69 = (var10.field2669 + 32) * var68 + var12;
                                            int var70 = (var10.field2670 + 32) * var67 + var13;
                                            if (var66 < 20) {
                                                var69 += var10.field2671[var66];
                                                var70 += var10.field2672[var66];
                                            }
                                            if (var10.field2718[var66] > 0) {
                                                boolean var71 = false;
                                                boolean var72 = false;
                                                int var73 = var10.field2718[var66] - 1;
                                                if (var69 + 32 > arg2 && var69 < arg4 && var70 + 32 > arg3 && var70 < arg5 || Statics.field1027 == var10 && field653 == var66) {
                                                    class86 var74;
                                                    if (field500 == 1 && Statics.field70 == var66 && Statics.field270 == var10.field2616) {
                                                        var74 = class40.method825(var73, var10.field2719[var66], 2, 0, false);
                                                    } else {
                                                        var74 = class40.method825(var73, var10.field2719[var66], 1, 3153952, false);
                                                    }
                                                    if (var74 == null) {
                                                        method882(var10);
                                                    } else if (Statics.field1027 == var10 && field653 == var66) {
                                                        int var75 = class77.field1378 - field583;
                                                        int var76 = class77.field1379 * -1108917615 - field584;
                                                        if (var75 < 5 && var75 > -5) {
                                                            var75 = 0;
                                                        }
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (field587 < 5) {
                                                            var75 = 0;
                                                            var76 = 0;
                                                        }
                                                        var74.method1694(var69 + var75, var70 + var76, 128);
                                                        if (arg1 != -1) {
                                                            class160 var77 = arg0[arg1 & 0xFFFF];
                                                            if (var70 + var76 < class89.field1478 && var77.field2658 > 0) {
                                                                int var78 = field546 * (class89.field1478 - var70 - var76) / 3;
                                                                if (var78 > field546 * 10) {
                                                                    var78 = field546 * 10;
                                                                }
                                                                if (var78 > var77.field2658) {
                                                                    var78 = var77.field2658;
                                                                }
                                                                var77.field2658 -= var78;
                                                                field584 += var78;
                                                                method882(var77);
                                                            }
                                                            if (var70 + var76 + 32 > class89.field1482 && var77.field2658 < var77.field2632 - var77.field2626) {
                                                                int var79 = field546 * (var70 + var76 + 32 - class89.field1482) / 3;
                                                                if (var79 > field546 * 10) {
                                                                    var79 = field546 * 10;
                                                                }
                                                                if (var79 > var77.field2632 - var77.field2626 - var77.field2658) {
                                                                    var79 = var77.field2632 - var77.field2626 - var77.field2658;
                                                                }
                                                                var77.field2658 += var79;
                                                                field584 -= var79;
                                                                method882(var77);
                                                            }
                                                        }
                                                    } else if (Statics.field2017 == var10 && field581 == var66) {
                                                        var74.method1694(var69, var70, 128);
                                                    } else {
                                                        var74.method1688(var69, var70);
                                                    }
                                                }
                                            } else if (var10.field2673 != null && var66 < 20) {
                                                class86 var80 = var10.method3147(var66);
                                                if (var80 != null) {
                                                    var80.method1688(var69, var70);
                                                } else if (class160.field2614) {
                                                    method882(var10);
                                                }
                                            }
                                            var66++;
                                        }
                                    }
                                } else if (var10.field2698 == 3) {
                                    int var81;
                                    if (method2955(var10)) {
                                        var81 = var10.field2634;
                                        if (Statics.field1349 == var10 && var10.field2636 != 0) {
                                            var81 = var10.field2636;
                                        }
                                    } else {
                                        var81 = var10.field2633;
                                        if (Statics.field1349 == var10 && var10.field2635 != 0) {
                                            var81 = var10.field2635;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2637) {
                                            class89.method1782(var12, var13, var10.field2625, var10.field2626, var81);
                                        } else {
                                            class89.method1784(var12, var13, var10.field2625, var10.field2626, var81);
                                        }
                                    } else if (var10.field2637) {
                                        class89.method1781(var12, var13, var10.field2625, var10.field2626, var81, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1799(var12, var13, var10.field2625, var10.field2626, var81, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2698 == 4) {
                                    class184 var82 = var10.method3146();
                                    if (var82 != null) {
                                        String var83 = var10.field2663;
                                        int var84;
                                        if (method2955(var10)) {
                                            var84 = var10.field2634;
                                            if (Statics.field1349 == var10 && var10.field2636 != 0) {
                                                var84 = var10.field2636;
                                            }
                                            if (var10.field2618.length() > 0) {
                                                var83 = var10.field2618;
                                            }
                                        } else {
                                            var84 = var10.field2633;
                                            if (Statics.field1349 == var10 && var10.field2635 != 0) {
                                                var84 = var10.field2635;
                                            }
                                        }
                                        if (var10.field2615 && var10.field2720 != -1) {
                                            class40 var85 = class40.method1243(var10.field2720);
                                            var83 = var85.field1010;
                                            if (var83 == null) {
                                                var83 = "null";
                                            }
                                            if ((var85.field989 == 1 || var10.field2631 != 1) && var10.field2631 != -1) {
                                                var83 = class2.method2414(16748608) + var83 + class2.field16 + " " + 'x' + method1292(var10.field2631);
                                            }
                                        }
                                        if (field633 == var10) {
                                            class136 var10000 = (class136) null;
                                            var83 = class136.field2168;
                                            var84 = var10.field2633;
                                        }
                                        if (!var10.field2615) {
                                            var83 = method2180(var83, var10);
                                        }
                                        var82.method3398(var83, var12, var13, var10.field2625, var10.field2626, var84, var10.field2668 ? 0 : -1, var10.field2666, var10.field2662, var10.field2703);
                                    } else if (class160.field2614) {
                                        method882(var10);
                                    }
                                } else if (var10.field2698 == 5) {
                                    if (var10.field2615) {
                                        class86 var87;
                                        if (var10.field2720 == -1) {
                                            var87 = var10.method3145(false);
                                        } else {
                                            var87 = class40.method825(var10.field2720, var10.field2631, var10.field2704, var10.field2681, false);
                                        }
                                        if (var87 != null) {
                                            int var88 = var87.field1462;
                                            int var89 = var87.field1463;
                                            if (var10.field2695) {
                                                class89.method1777(var12, var13, var10.field2625 + var12, var10.field2626 + var13);
                                                int var90 = (var10.field2625 + (var88 - 1)) / var88;
                                                int var91 = (var10.field2626 + (var89 - 1)) / var89;
                                                for (int var92 = 0; var92 < var90; var92++) {
                                                    for (int var93 = 0; var93 < var91; var93++) {
                                                        if (var10.field2642 != 0) {
                                                            var87.method1697(var88 / 2 + var88 * var92 + var12, var89 / 2 + var89 * var93 + var13, var10.field2642, 4096);
                                                        } else if (var14 == 0) {
                                                            var87.method1688(var88 * var92 + var12, var89 * var93 + var13);
                                                        } else {
                                                            var87.method1694(var88 * var92 + var12, var89 * var93 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1776(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var94 = var10.field2625 * 4096 / var88;
                                                if (var10.field2642 != 0) {
                                                    var87.method1697(var10.field2625 / 2 + var12, var10.field2626 / 2 + var13, var10.field2642, var94);
                                                } else if (var14 != 0) {
                                                    var87.method1677(var12, var13, var10.field2625, var10.field2626, 256 - (var14 & 0xFF));
                                                } else if (var10.field2625 == var88 && var10.field2626 == var89) {
                                                    var87.method1688(var12, var13);
                                                } else {
                                                    var87.method1690(var12, var13, var10.field2625, var10.field2626);
                                                }
                                            }
                                        } else if (class160.field2614) {
                                            method882(var10);
                                        }
                                    } else {
                                        class86 var86 = var10.method3145(method2955(var10));
                                        if (var86 != null) {
                                            var86.method1688(var12, var13);
                                        } else if (class160.field2614) {
                                            method882(var10);
                                        }
                                    }
                                } else if (var10.field2698 == 6) {
                                    boolean var95 = method2955(var10);
                                    int var96;
                                    if (var95) {
                                        var96 = var10.field2682;
                                    } else {
                                        var96 = var10.field2724;
                                    }
                                    class112 var97 = null;
                                    int var98 = 0;
                                    if (var10.field2720 != -1) {
                                        class40 var99 = class40.method1243(var10.field2720);
                                        if (var99 != null) {
                                            class40 var100 = var99.method845(var10.field2631);
                                            var97 = var100.method844(1);
                                            if (var97 == null) {
                                                method882(var10);
                                            } else {
                                                var97.method2230();
                                                var98 = var97.field1537 / 2;
                                            }
                                        }
                                    } else if (var10.field2716 == 5) {
                                        if (var10.field2649 == 0) {
                                            var97 = field727.method3223((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var97 = Statics.field1096.method11();
                                        }
                                    } else if (var96 == -1) {
                                        var97 = var10.method3144((class34) null, -1, var95, Statics.field1096.field28);
                                        if (var97 == null && class160.field2614) {
                                            method882(var10);
                                        }
                                    } else {
                                        class34 var101 = class34.method2198(var96);
                                        var97 = var10.method3144(var101, var10.field2722, var95, Statics.field1096.field28);
                                        if (var97 == null && class160.field2614) {
                                            method882(var10);
                                        }
                                    }
                                    class104.method2116(var10.field2625 / 2 + var12, var10.field2626 / 2 + var13);
                                    int var102 = var10.field2674 * class104.field1757[var10.field2656] >> 16;
                                    int var103 = var10.field2674 * class104.field1736[var10.field2656] >> 16;
                                    if (var97 != null) {
                                        if (var10.field2615) {
                                            var97.method2230();
                                            if (var10.field2639) {
                                                var97.method2242(0, var10.field2648, var10.field2657, var10.field2656, var10.field2654, var10.field2655 + var98 + var102, var10.field2655 + var103, var10.field2674);
                                            } else {
                                                var97.method2241(0, var10.field2648, var10.field2657, var10.field2656, var10.field2654, var10.field2655 + var98 + var102, var10.field2655 + var103);
                                            }
                                        } else {
                                            var97.method2241(0, var10.field2648, 0, var10.field2656, 0, var102, var103);
                                        }
                                    }
                                    class104.method2118();
                                } else {
                                    if (var10.field2698 == 7) {
                                        class184 var104 = var10.method3146();
                                        if (var104 == null) {
                                            if (class160.field2614) {
                                                method882(var10);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var10.field2626; var106++) {
                                            for (int var107 = 0; var107 < var10.field2625; var107++) {
                                                if (var10.field2718[var105] > 0) {
                                                    class40 var108 = class40.method1243(var10.field2718[var105] - 1);
                                                    String var109;
                                                    if (var108.field989 != 1 && var10.field2719[var105] == 1) {
                                                        var109 = class2.method2414(16748608) + var108.field1010 + class2.field16;
                                                    } else {
                                                        var109 = class2.method2414(16748608) + var108.field1010 + class2.field16 + " " + 'x' + method1292(var10.field2719[var105]);
                                                    }
                                                    int var110 = (var10.field2669 + 115) * var107 + var12;
                                                    int var111 = (var10.field2670 + 12) * var106 + var13;
                                                    if (var10.field2666 == 0) {
                                                        var104.method3467(var109, var110, var111, var10.field2633, var10.field2668 ? 0 : -1);
                                                    } else if (var10.field2666 == 1) {
                                                        var104.method3397(var109, var10.field2625 / 2 + var110, var111, var10.field2633, var10.field2668 ? 0 : -1);
                                                    } else {
                                                        var104.method3474(var109, var10.field2625 + var110 - 1, var111, var10.field2633, var10.field2668 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var10.field2698 == 8 && Statics.field1083 == var10 && field621 == field473) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class184 var114 = Statics.field864;
                                        String var115 = var10.field2663;
                                        String var116 = method2180(var115, var10);
                                        while (var116.length() > 0) {
                                            int var117 = var116.indexOf(class2.field22);
                                            String var118;
                                            if (var117 == -1) {
                                                var118 = var116;
                                                var116 = "";
                                            } else {
                                                var118 = var116.substring(0, var117);
                                                var116 = var116.substring(var117 + 4);
                                            }
                                            int var119 = var114.method3390(var118);
                                            if (var119 > var112) {
                                                var112 = var119;
                                            }
                                            var113 += var114.field2858 + 1;
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var120 = var10.field2625 + var12 - 5 - var112;
                                        int var121 = var10.field2626 + var13 + 5;
                                        if (var120 < var12 + 5) {
                                            var120 = var12 + 5;
                                        }
                                        if (var112 + var120 > arg4) {
                                            var120 = arg4 - var112;
                                        }
                                        if (var113 + var121 > arg5) {
                                            var121 = arg5 - var113;
                                        }
                                        class89.method1782(var120, var121, var112, var113, 16777120);
                                        class89.method1784(var120, var121, var112, var113, 0);
                                        String var122 = var10.field2663;
                                        int var123 = var114.field2858 + var121 + 2;
                                        String var124 = method2180(var122, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class2.field22);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            var114.method3467(var126, var120 + 3, var123, 0, -1);
                                            var123 += var114.field2858 + 1;
                                        }
                                    }
                                    if (var10.field2698 == 9) {
                                        if (var10.field2646 == 1) {
                                            class89.method1788(var12, var13, var10.field2625 + var12, var10.field2626 + var13, var10.field2633);
                                        } else {
                                            int var127 = var10.field2625 >= 0 ? var10.field2625 : -var10.field2625;
                                            int var128 = var10.field2626 >= 0 ? var10.field2626 : -var10.field2626;
                                            int var129 = var127;
                                            if (var127 < var128) {
                                                var129 = var128;
                                            }
                                            if (var129 != 0) {
                                                int var130 = (var10.field2625 << 16) / var129;
                                                int var131 = (var10.field2626 << 16) / var129;
                                                if (var131 <= var130) {
                                                    var130 = -var130;
                                                } else {
                                                    var131 = -var131;
                                                }
                                                int var132 = var10.field2646 * var131 >> 17;
                                                int var133 = var10.field2646 * var131 + 1 >> 17;
                                                int var134 = var10.field2646 * var130 >> 17;
                                                int var135 = var10.field2646 * var130 + 1 >> 17;
                                                int var136 = var12 + var132;
                                                int var137 = var12 - var133;
                                                int var138 = var10.field2625 + var12 - var133;
                                                int var139 = var10.field2625 + var12 + var132;
                                                int var140 = var13 + var134;
                                                int var141 = var13 - var135;
                                                int var142 = var10.field2626 + var13 - var135;
                                                int var143 = var10.field2626 + var13 + var134;
                                                class104.method2124(var136, var137, var138);
                                                class104.method2147(var140, var141, var142, var136, var137, var138, var10.field2633);
                                                class104.method2124(var136, var138, var139);
                                                class104.method2147(var140, var142, var143, var136, var138, var139, var10.field2633);
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

    @ObfuscatedName("dw.cn(Ljava/lang/String;Lfc;B)Ljava/lang/String;")
    public static String method2180(String arg0, class160 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1590(method2014(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1300 != null) {
                    var5 = class149.method2020(Statics.field1300.field1391);
                    if (Statics.field1300.field1395 != null) {
                        var5 = (String) Statics.field1300.field1395;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bm.cj(II)Ljava/lang/String;")
    public static final String method1292(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field26 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2414(65408) + var1.substring(0, var1.length() - 8) + class136.field2240 + " " + class2.field19 + var1 + class2.field20 + class2.field16;
        } else if (var1.length() > 6) {
            return " " + class2.method2414(16777215) + var1.substring(0, var1.length() - 4) + class136.field2242 + " " + class2.field19 + var1 + class2.field20 + class2.field16;
        } else {
            return " " + class2.method2414(16776960) + var1 + class2.field16;
        }
    }

    @ObfuscatedName("cp.cb(Lfc;IIIIIII)V")
    public static final void method2023(class160 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field551) {
            field523 = 32;
        } else {
            field523 = 0;
        }
        field551 = false;
        if (class77.field1377 == 1 || !Statics.field249 && class77.field1377 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2658 -= 4;
                method882(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2658 += 4;
                method882(arg0);
            } else if (arg5 >= arg1 - field523 && arg5 < field523 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2658 = (arg4 - arg3) * var8 / var9;
                method882(arg0);
                field551 = true;
            }
        }
        if (field665 == 0) {
            return;
        }
        int var10 = arg0.field2625;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2658 += field665 * 45;
            method882(arg0);
        }
    }

    @ObfuscatedName("q.cx(IIIIII)V")
    public static final void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2510[0].method1765(arg0, arg1);
        Statics.field2510[1].method1765(arg0, arg1 + arg3 - 16);
        class89.method1782(arg0, arg1 + 16, 16, arg3 - 32, field528);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1782(arg0, arg1 + 16 + var6, 16, var5, field548);
        class89.method1774(arg0, arg1 + 16 + var6, var5, field550);
        class89.method1774(arg0 + 1, arg1 + 16 + var6, var5, field550);
        class89.method1786(arg0, arg1 + 16 + var6, 16, field550);
        class89.method1786(arg0, arg1 + 17 + var6, 16, field550);
        class89.method1774(arg0 + 15, arg1 + 16 + var6, var5, field549);
        class89.method1774(arg0 + 14, arg1 + 17 + var6, var5 - 1, field549);
        class89.method1786(arg0, arg1 + 15 + var6 + var5, 16, field549);
        class89.method1786(arg0 + 1, arg1 + 14 + var6 + var5, 15, field549);
    }

    @ObfuscatedName("bw.ch(II)Ljava/lang/String;")
    public static final String method1590(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("et.cv(Lfc;I)Z")
    public static final boolean method2955(class160 arg0) {
        if (arg0.field2644 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2644.length; var1++) {
            int var2 = method2014(arg0, var1);
            int var3 = arg0.field2664[var1];
            if (arg0.field2644[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2644[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2644[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ca.cs(Lfc;IB)I")
    public static final int method2014(class160 arg0, int arg1) {
        if (arg0.field2707 == null || arg1 >= arg0.field2707.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2707[arg1];
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
                    var7 = field607[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field608[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field609[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class160 var11 = class160.method628(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method1243(var12).field991 || field478)) {
                        for (int var13 = 0; var13 < var11.field2718.length; var13++) {
                            if (var12 + 1 == var11.field2718[var13]) {
                                var7 += var11.field2719[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class161.field2736[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2047[field608[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class161.field2736[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1096.field31;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2045[var14]) {
                            var7 += field608[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class160 var17 = class160.method628(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method1243(var18).field991 || field478)) {
                        for (int var19 = 0; var19 < var17.field2718.length; var19++) {
                            if (var18 + 1 == var17.field2718[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field634;
                }
                if (var6 == 12) {
                    var7 = field635;
                }
                if (var6 == 13) {
                    int var20 = class161.field2736[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class161.method3138(var22);
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
                    var7 = (Statics.field1096.field442 >> 7) + Statics.field252;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1096.field430 >> 7) + Statics.field924;
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

    @ObfuscatedName("g.cf([Lfc;IIIIIIIB)V")
    public static final void method52(class160[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class160 var9 = arg0[var8];
            if (var9 != null && (!var9.field2615 || var9.field2698 == 0 || var9.field2623 || method216(var9) != 0 || field641 == var9) && var9.field2627 == arg1 && (!var9.field2615 || !method111(var9))) {
                int var10 = var9.field2621 + arg6;
                int var11 = var9.field2622 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2698 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2698 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2625 + var10;
                    int var19 = var9.field2626 + var11;
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
                    int var22 = var9.field2625 + var10;
                    int var23 = var9.field2626 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field640 == var9) {
                    field648 = true;
                    field711 = var10;
                    field650 = var11;
                }
                if (!var9.field2615 || var12 < var14 && var13 < var15) {
                    int var24 = class77.field1378;
                    int var25 = class77.field1379 * -1108917615;
                    if (class77.field1384 != 0) {
                        var24 = class77.field1372;
                        var25 = class77.field1376;
                    }
                    if (var9.field2732 == 1337) {
                        method882(var9);
                        if (!field580 && !field703 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method37(var24, var25, var12, var13);
                        }
                    } else if (var9.field2732 != 1338) {
                        if (!field703 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var37 = var24 - var10;
                            int var38 = var25 - var11;
                            if (var9.field2619 == 1) {
                                method223(var9.field2717, "", 24, 0, 0, var9.field2616);
                            }
                            if (var9.field2619 == 2 && !field625) {
                                int var39 = method216(var9);
                                int var40 = var39 >> 11 & 0x3F;
                                String var41;
                                if (var40 == 0) {
                                    var41 = null;
                                } else if (var9.field2609 == null || var9.field2609.trim().length() == 0) {
                                    var41 = null;
                                } else {
                                    var41 = var9.field2609;
                                }
                                if (var41 != null) {
                                    method223(var41, class2.method2414(65280) + var9.field2660, 25, 0, -1, var9.field2616);
                                }
                            }
                            if (var9.field2619 == 3) {
                                method223(class136.field2238, "", 26, 0, 0, var9.field2616);
                            }
                            if (var9.field2619 == 4) {
                                method223(var9.field2717, "", 28, 0, 0, var9.field2616);
                            }
                            if (var9.field2619 == 5) {
                                method223(var9.field2717, "", 29, 0, 0, var9.field2616);
                            }
                            if (var9.field2619 == 6 && field633 == null) {
                                method223(var9.field2717, "", 30, 0, -1, var9.field2616);
                            }
                            if (var9.field2698 == 2) {
                                int var43 = 0;
                                for (int var44 = 0; var44 < var9.field2626; var44++) {
                                    for (int var45 = 0; var45 < var9.field2625; var45++) {
                                        int var46 = (var9.field2669 + 32) * var45;
                                        int var47 = (var9.field2670 + 32) * var44;
                                        if (var43 < 20) {
                                            var46 += var9.field2671[var43];
                                            var47 += var9.field2672[var43];
                                        }
                                        if (var37 >= var46 && var38 >= var47 && var37 < var46 + 32 && var38 < var47 + 32) {
                                            field585 = var43;
                                            Statics.field256 = var9;
                                            if (var9.field2718[var43] > 0) {
                                                class40 var48 = class40.method1243(var9.field2718[var43] - 1);
                                                if (field500 == 1 && class164.method897(method216(var9))) {
                                                    if (Statics.field270 != var9.field2616 || Statics.field70 != var43) {
                                                        method223(class136.field2229, field624 + " " + class2.field21 + " " + class2.method2414(16748608) + var48.field1010, 31, var48.field976, var43, var9.field2616);
                                                    }
                                                } else if (!field625 || !class164.method897(method216(var9))) {
                                                    String[] var49 = var48.field993;
                                                    if (field639) {
                                                        var49 = method2954(var49);
                                                    }
                                                    if (class164.method897(method216(var9))) {
                                                        for (int var50 = 4; var50 >= 3; var50--) {
                                                            if (var49 != null && var49[var50] != null) {
                                                                byte var51;
                                                                if (var50 == 3) {
                                                                    var51 = 36;
                                                                } else {
                                                                    var51 = 37;
                                                                }
                                                                method223(var49[var50], class2.method2414(16748608) + var48.field1010, var51, var48.field976, var43, var9.field2616);
                                                            } else if (var50 == 4) {
                                                                method223(class136.field2200, class2.method2414(16748608) + var48.field1010, 37, var48.field976, var43, var9.field2616);
                                                            }
                                                        }
                                                    }
                                                    if (class164.method3197(method216(var9))) {
                                                        method223(class136.field2229, class2.method2414(16748608) + var48.field1010, 38, var48.field976, var43, var9.field2616);
                                                    }
                                                    if (class164.method897(method216(var9)) && var49 != null) {
                                                        for (int var52 = 2; var52 >= 0; var52--) {
                                                            if (var49[var52] != null) {
                                                                byte var53 = 0;
                                                                if (var52 == 0) {
                                                                    var53 = 33;
                                                                }
                                                                if (var52 == 1) {
                                                                    var53 = 34;
                                                                }
                                                                if (var52 == 2) {
                                                                    var53 = 35;
                                                                }
                                                                method223(var49[var52], class2.method2414(16748608) + var48.field1010, var53, var48.field976, var43, var9.field2616);
                                                            }
                                                        }
                                                    }
                                                    String[] var54 = var9.field2683;
                                                    if (field639) {
                                                        var54 = method2954(var54);
                                                    }
                                                    if (var54 != null) {
                                                        for (int var55 = 4; var55 >= 0; var55--) {
                                                            if (var54[var55] != null) {
                                                                byte var56 = 0;
                                                                if (var55 == 0) {
                                                                    var56 = 39;
                                                                }
                                                                if (var55 == 1) {
                                                                    var56 = 40;
                                                                }
                                                                if (var55 == 2) {
                                                                    var56 = 41;
                                                                }
                                                                if (var55 == 3) {
                                                                    var56 = 42;
                                                                }
                                                                if (var55 == 4) {
                                                                    var56 = 43;
                                                                }
                                                                method223(var54[var55], class2.method2414(16748608) + var48.field1010, var56, var48.field976, var43, var9.field2616);
                                                            }
                                                        }
                                                    }
                                                    method223(class136.field2230, class2.method2414(16748608) + var48.field1010, 1005, var48.field976, var43, var9.field2616);
                                                } else if ((Statics.field353 & 0x10) == 16) {
                                                    method223(field627, field589 + " " + class2.field21 + " " + class2.method2414(16748608) + var48.field1010, 32, var48.field976, var43, var9.field2616);
                                                }
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var9.field2615) {
                                if (field625) {
                                    int var57 = method216(var9);
                                    boolean var58 = (var57 >> 21 & 0x1) != 0;
                                    if (var58 && (Statics.field353 & 0x20) == 32) {
                                        method223(field627, field589 + " " + class2.field21 + " " + var9.field2676, 58, 0, var9.field2617, var9.field2616);
                                    }
                                } else {
                                    for (int var59 = 9; var59 >= 5; var59--) {
                                        String var60 = method230(var9, var59);
                                        if (var60 != null) {
                                            method223(var60, var9.field2676, 1007, var59 + 1, var9.field2617, var9.field2616);
                                        }
                                    }
                                    int var61 = method216(var9);
                                    int var62 = var61 >> 11 & 0x3F;
                                    String var63;
                                    if (var62 == 0) {
                                        var63 = null;
                                    } else if (var9.field2609 == null || var9.field2609.trim().length() == 0) {
                                        var63 = null;
                                    } else {
                                        var63 = var9.field2609;
                                    }
                                    if (var63 != null) {
                                        method223(var63, var9.field2676, 25, 0, var9.field2617, var9.field2616);
                                    }
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        String var66 = method230(var9, var65);
                                        if (var66 != null) {
                                            method223(var66, var9.field2676, 57, var65 + 1, var9.field2617, var9.field2616);
                                        }
                                    }
                                    if (class164.method2733(method216(var9))) {
                                        method223(class136.field2096, "", 30, 0, var9.field2617, var9.field2616);
                                    }
                                }
                            }
                        }
                        if (var9.field2698 == 0) {
                            if (!var9.field2615 && method111(var9) && Statics.field1349 != var9) {
                                continue;
                            }
                            method52(arg0, var9.field2616, var12, var13, var14, var15, var10 - var9.field2629, var11 - var9.field2658);
                            if (var9.field2705 != null) {
                                method52(var9.field2705, var9.field2616, var12, var13, var14, var15, var10 - var9.field2629, var11 - var9.field2658);
                            }
                            class4 var67 = (class4) field630.method3300((long) var9.field2616);
                            if (var67 != null) {
                                if (var67.field49 == 0 && class77.field1378 >= var12 && class77.field1379 * -1108917615 >= var13 && class77.field1378 < var14 && class77.field1379 * -1108917615 < var15 && !field703 && !field562) {
                                    field617[0] = class136.field2264;
                                    field652[0] = "";
                                    field658[0] = 1006;
                                    field612 = 1;
                                }
                                int var68 = var67.field50;
                                if (class160.method2728(var68)) {
                                    method52(Statics.field2688[var68], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2615) {
                            if (var9.field2733 && class77.field1378 >= var12 && class77.field1379 * -1108917615 >= var13 && class77.field1378 < var14 && class77.field1379 * -1108917615 < var15) {
                                for (class1 var69 = (class1) field666.method3343(); var69 != null; var69 = (class1) field666.method3328()) {
                                    if (var69.field8) {
                                        var69.method3360();
                                        var69.field11.field2725 = false;
                                    }
                                }
                                if (Statics.field76 == 0) {
                                    field640 = null;
                                    field641 = null;
                                }
                                if (!field703) {
                                    field617[0] = class136.field2264;
                                    field652[0] = "";
                                    field658[0] = 1006;
                                    field612 = 1;
                                }
                            }
                            boolean var70;
                            if (class77.field1378 >= var12 && class77.field1379 * -1108917615 >= var13 && class77.field1378 < var14 && class77.field1379 * -1108917615 < var15) {
                                var70 = true;
                            } else {
                                var70 = false;
                            }
                            boolean var71 = false;
                            if ((class77.field1377 == 1 || !Statics.field249 && class77.field1377 == 4) && var70) {
                                var71 = true;
                            }
                            boolean var72 = false;
                            if ((class77.field1384 == 1 || !Statics.field249 && class77.field1384 == 4) && class77.field1372 >= var12 && class77.field1376 >= var13 && class77.field1372 < var14 && class77.field1376 < var15) {
                                var72 = true;
                            }
                            if (var72) {
                                method1(var9, class77.field1372 - var10, class77.field1376 - var11);
                            }
                            if (field640 != null && field640 != var9 && var70 && class164.method3105(method216(var9))) {
                                field644 = var9;
                            }
                            if (field641 == var9) {
                                field555 = true;
                                field646 = var10;
                                field647 = var11;
                            }
                            if (var9.field2623) {
                                if (var70 && field665 != 0 && var9.field2612 != null) {
                                    class1 var73 = new class1();
                                    var73.field8 = true;
                                    var73.field11 = var9;
                                    var73.field2 = field665;
                                    var73.field5 = var9.field2612;
                                    field666.method3321(var73);
                                }
                                if (field640 != null || Statics.field1027 != null || field703) {
                                    var72 = false;
                                    var71 = false;
                                    var70 = false;
                                }
                                if (!var9.field2613 && var72) {
                                    var9.field2613 = true;
                                    if (var9.field2685 != null) {
                                        class1 var74 = new class1();
                                        var74.field8 = true;
                                        var74.field11 = var9;
                                        var74.field4 = class77.field1372 - var10;
                                        var74.field2 = class77.field1376 - var11;
                                        var74.field5 = var9.field2685;
                                        field666.method3321(var74);
                                    }
                                }
                                if (var9.field2613 && var71 && var9.field2686 != null) {
                                    class1 var75 = new class1();
                                    var75.field8 = true;
                                    var75.field11 = var9;
                                    var75.field4 = class77.field1378 - var10;
                                    var75.field2 = class77.field1379 * -1108917615 - var11;
                                    var75.field5 = var9.field2686;
                                    field666.method3321(var75);
                                }
                                if (var9.field2613 && !var71) {
                                    var9.field2613 = false;
                                    if (var9.field2687 != null) {
                                        class1 var76 = new class1();
                                        var76.field8 = true;
                                        var76.field11 = var9;
                                        var76.field4 = class77.field1378 - var10;
                                        var76.field2 = class77.field1379 * -1108917615 - var11;
                                        var76.field5 = var9.field2687;
                                        field668.method3321(var76);
                                    }
                                }
                                if (var71 && var9.field2713 != null) {
                                    class1 var77 = new class1();
                                    var77.field8 = true;
                                    var77.field11 = var9;
                                    var77.field4 = class77.field1378 - var10;
                                    var77.field2 = class77.field1379 * -1108917615 - var11;
                                    var77.field5 = var9.field2713;
                                    field666.method3321(var77);
                                }
                                if (!var9.field2725 && var70) {
                                    var9.field2725 = true;
                                    if (var9.field2694 != null) {
                                        class1 var78 = new class1();
                                        var78.field8 = true;
                                        var78.field11 = var9;
                                        var78.field4 = class77.field1378 - var10;
                                        var78.field2 = class77.field1379 * -1108917615 - var11;
                                        var78.field5 = var9.field2694;
                                        field666.method3321(var78);
                                    }
                                }
                                if (var9.field2725 && var70 && var9.field2690 != null) {
                                    class1 var79 = new class1();
                                    var79.field8 = true;
                                    var79.field11 = var9;
                                    var79.field4 = class77.field1378 - var10;
                                    var79.field2 = class77.field1379 * -1108917615 - var11;
                                    var79.field5 = var9.field2690;
                                    field666.method3321(var79);
                                }
                                if (var9.field2725 && !var70) {
                                    var9.field2725 = false;
                                    if (var9.field2691 != null) {
                                        class1 var80 = new class1();
                                        var80.field8 = true;
                                        var80.field11 = var9;
                                        var80.field4 = class77.field1378 - var10;
                                        var80.field2 = class77.field1379 * -1108917615 - var11;
                                        var80.field5 = var9.field2691;
                                        field668.method3321(var80);
                                    }
                                }
                                if (var9.field2702 != null) {
                                    class1 var81 = new class1();
                                    var81.field11 = var9;
                                    var81.field5 = var9.field2702;
                                    field667.method3321(var81);
                                }
                                if (var9.field2696 != null && field691 > var9.field2728) {
                                    if (var9.field2697 == null || field691 - var9.field2728 > 32) {
                                        class1 var86 = new class1();
                                        var86.field11 = var9;
                                        var86.field5 = var9.field2696;
                                        field666.method3321(var86);
                                    } else {
                                        label675: for (int var82 = var9.field2728; var82 < field691; var82++) {
                                            int var83 = field561[var82 & 0x1F];
                                            for (int var84 = 0; var84 < var9.field2697.length; var84++) {
                                                if (var9.field2697[var84] == var83) {
                                                    class1 var85 = new class1();
                                                    var85.field11 = var9;
                                                    var85.field5 = var9.field2696;
                                                    field666.method3321(var85);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2728 = field691;
                                }
                                if (var9.field2729 != null && field571 > var9.field2652) {
                                    if (var9.field2638 == null || field571 - var9.field2652 > 32) {
                                        class1 var91 = new class1();
                                        var91.field11 = var9;
                                        var91.field5 = var9.field2729;
                                        field666.method3321(var91);
                                    } else {
                                        label651: for (int var87 = var9.field2652; var87 < field571; var87++) {
                                            int var88 = field655[var87 & 0x1F];
                                            for (int var89 = 0; var89 < var9.field2638.length; var89++) {
                                                if (var9.field2638[var89] == var88) {
                                                    class1 var90 = new class1();
                                                    var90.field11 = var9;
                                                    var90.field5 = var9.field2729;
                                                    field666.method3321(var90);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2652 = field571;
                                }
                                if (var9.field2700 != null && field688 > var9.field2730) {
                                    if (var9.field2701 == null || field688 - var9.field2730 > 32) {
                                        class1 var96 = new class1();
                                        var96.field11 = var9;
                                        var96.field5 = var9.field2700;
                                        field666.method3321(var96);
                                    } else {
                                        label627: for (int var92 = var9.field2730; var92 < field688; var92++) {
                                            int var93 = field719[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2701.length; var94++) {
                                                if (var9.field2701[var94] == var93) {
                                                    class1 var95 = new class1();
                                                    var95.field11 = var9;
                                                    var95.field5 = var9.field2700;
                                                    field666.method3321(var95);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2730 = field688;
                                }
                                if (field659 > var9.field2727 && var9.field2665 != null) {
                                    class1 var97 = new class1();
                                    var97.field11 = var9;
                                    var97.field5 = var9.field2665;
                                    field666.method3321(var97);
                                }
                                if (field660 > var9.field2727 && var9.field2667 != null) {
                                    class1 var98 = new class1();
                                    var98.field11 = var9;
                                    var98.field5 = var9.field2667;
                                    field666.method3321(var98);
                                }
                                if (field557 > var9.field2727 && var9.field2708 != null) {
                                    class1 var99 = new class1();
                                    var99.field11 = var9;
                                    var99.field5 = var9.field2708;
                                    field666.method3321(var99);
                                }
                                if (field662 > var9.field2727 && var9.field2709 != null) {
                                    class1 var100 = new class1();
                                    var100.field11 = var9;
                                    var100.field5 = var9.field2709;
                                    field666.method3321(var100);
                                }
                                var9.field2727 = field556;
                                if (var9.field2641 != null) {
                                    for (int var101 = 0; var101 < field533; var101++) {
                                        class1 var102 = new class1();
                                        var102.field11 = var9;
                                        var102.field1 = field692[var101];
                                        var102.field9 = field623[var101];
                                        var102.field5 = var9.field2641;
                                        field666.method3321(var102);
                                    }
                                }
                            }
                        }
                        if (!var9.field2615 && field640 == null && Statics.field1027 == null && !field703) {
                            if ((var9.field2643 >= 0 || var9.field2635 != 0) && class77.field1378 >= var12 && class77.field1379 * -1108917615 >= var13 && class77.field1378 < var14 && class77.field1379 * -1108917615 < var15) {
                                if (var9.field2643 >= 0) {
                                    Statics.field1349 = arg0[var9.field2643];
                                } else {
                                    Statics.field1349 = var9;
                                }
                            }
                            if (var9.field2698 == 8 && class77.field1378 >= var12 && class77.field1379 * -1108917615 >= var13 && class77.field1378 < var14 && class77.field1379 * -1108917615 < var15) {
                                Statics.field1083 = var9;
                            }
                            if (var9.field2632 > var9.field2626) {
                                method2023(var9, var9.field2625 + var10, var11, var9.field2626, var9.field2632, class77.field1378, class77.field1379 * -1108917615);
                            }
                        }
                    } else if ((field522 == 0 || field522 == 3) && (class77.field1384 == 1 || !Statics.field249 && class77.field1384 == 4)) {
                        int var26 = class77.field1372 - 25 - var10;
                        int var27 = class77.field1376 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field554 + field510 & 0x7FF;
                            int var29 = class104.field1757[var28];
                            int var30 = class104.field1736[var28];
                            int var31 = (field543 + 256) * var29 >> 8;
                            int var32 = (field543 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field1096.field442 + var33 >> 7;
                            int var36 = Statics.field1096.field430 - var34 >> 7;
                            field513.method2326(179);
                            field513.method2493(18);
                            field513.method2459(class75.field1345[82] ? (class75.field1345[81] ? 2 : 1) : 0);
                            field513.method2444(Statics.field924 + var36);
                            field513.method2424(Statics.field252 + var35);
                            field513.method2493(var26);
                            field513.method2493(var27);
                            field513.method2424(field554);
                            field513.method2493(57);
                            field513.method2493(field510);
                            field513.method2493(field543);
                            field513.method2493(89);
                            field513.method2424(Statics.field1096.field442);
                            field513.method2424(Statics.field1096.field430);
                            field513.method2493(63);
                            field656 = var35;
                            field702 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.co([Lfc;II)V")
    public static final void method1183(class160[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class160 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2698 == 0) {
                    if (var3.field2705 != null) {
                        method1183(var3.field2705, arg1);
                    }
                    class4 var4 = (class4) field630.method3300((long) var3.field2616);
                    if (var4 != null) {
                        int var5 = var4.field50;
                        if (class160.method2728(var5)) {
                            method1183(Statics.field2688[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2661 != null) {
                    class1 var6 = new class1();
                    var6.field11 = var3;
                    var6.field5 = var3.field2661;
                    class26.method769(var6);
                }
                if (arg1 == 1 && var3.field2711 != null) {
                    if (var3.field2617 >= 0) {
                        class160 var7 = class160.method628(var3.field2616);
                        if (var7 == null || var7.field2705 == null || var3.field2617 >= var7.field2705.length || var7.field2705[var3.field2617] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field11 = var3;
                    var8.field5 = var3.field2711;
                    class26.method769(var8);
                }
            }
        }
    }

    @ObfuscatedName("l.cq(Lfc;III)V")
    public static final void method1(class160 arg0, int arg1, int arg2) {
        if (field640 != null || field703 || arg0 == null) {
            return;
        }
        class160 var3 = method1385(arg0);
        if (var3 == null) {
            var3 = arg0.field2714;
        }
        if (var3 == null) {
            return;
        }
        field640 = arg0;
        class160 var5 = method1385(arg0);
        if (var5 == null) {
            var5 = arg0.field2714;
        }
        field641 = var5;
        field642 = arg1;
        field499 = arg2;
        Statics.field76 = 0;
        field651 = false;
        return;
    }

    @ObfuscatedName("ao.cg(Lfc;I)V")
    public static void method882(class160 arg0) {
        if (field497 == arg0.field2706) {
            field519[arg0.field2731] = true;
        }
    }

    @ObfuscatedName("w.cz(B)V")
    public static void method25() {
        for (class4 var0 = (class4) field630.method3317(); var0 != null; var0 = (class4) field630.method3299()) {
            int var1 = var0.field50;
            if (class160.method2728(var1)) {
                boolean var2 = true;
                class160[] var3 = Statics.field2688[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2615;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2837;
                    class160 var6 = class160.method628(var5);
                    if (var6 != null) {
                        method882(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("et.cm([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2954(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cw.ct(II)V")
    public static final void method2018(int arg0) {
        if (!class160.method2728(arg0)) {
            return;
        }
        class160[] var1 = Statics.field2688[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class160 var3 = var1[var2];
            if (var3 != null) {
                var3.field2722 = 0;
                var3.field2723 = 0;
            }
        }
    }

    @ObfuscatedName("du.ca(II)V")
    public static final void method2221(int arg0) {
        if (class160.method2728(arg0)) {
            method1281(Statics.field2688[arg0], -1);
        }
    }

    @ObfuscatedName("bm.ce([Lfc;IB)V")
    public static final void method1281(class160[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class160 var3 = arg0[var2];
            if (var3 != null && var3.field2627 == arg1 && (!var3.field2615 || !method111(var3))) {
                if (var3.field2698 == 0) {
                    if (!var3.field2615 && method111(var3) && Statics.field1349 != var3) {
                        continue;
                    }
                    method1281(arg0, var3.field2616);
                    if (var3.field2705 != null) {
                        method1281(var3.field2705, var3.field2616);
                    }
                    class4 var4 = (class4) field630.method3300((long) var3.field2616);
                    if (var4 != null) {
                        method2221(var4.field50);
                    }
                }
                if (var3.field2698 == 6) {
                    if (var3.field2724 != -1 || var3.field2682 != -1) {
                        boolean var5 = method2955(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2682;
                        } else {
                            var6 = var3.field2724;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method2198(var6);
                            var3.field2723 += field546;
                            while (var3.field2723 > var7.field877[var3.field2722]) {
                                var3.field2723 -= var7.field877[var3.field2722];
                                var3.field2722++;
                                if (var3.field2722 >= var7.field872.length) {
                                    var3.field2722 -= var7.field876;
                                    if (var3.field2722 < 0 || var3.field2722 >= var7.field872.length) {
                                        var3.field2722 = 0;
                                    }
                                }
                                method882(var3);
                            }
                        }
                    }
                    if (var3.field2726 != 0 && !var3.field2615) {
                        int var8 = var3.field2726 >> 16;
                        int var9 = var3.field2726 << 16 >> 16;
                        int var10 = field546 * var8;
                        int var11 = field546 * var9;
                        var3.field2656 = var3.field2656 + var10 & 0x7FF;
                        var3.field2648 = var3.field2648 + var11 & 0x7FF;
                        method882(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ea.cw(II)V")
    public static final void method2996(int arg0) {
        method25();
        class7.method106();
        int var1 = class42.method157(arg0).field1034;
        if (var1 == 0) {
            return;
        }
        int var2 = class161.field2736[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class104.method2129(0.9D);
                ((class110) Statics.field1754).method2215(0.9D);
            }
            if (var2 == 2) {
                class104.method2129(0.8D);
                ((class110) Statics.field1754).method2215(0.8D);
            }
            if (var2 == 3) {
                class104.method2129(0.7D);
                ((class110) Statics.field1754).method2215(0.7D);
            }
            if (var2 == 4) {
                class104.method2129(0.6D);
                ((class110) Statics.field1754).method2215(0.6D);
            }
            class40.field974.method3254();
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
            if (field552 != var3) {
                if (field552 == 0 && field657 != -1) {
                    class140.method2313(Statics.field544, field657, 0, var3, false);
                    field706 = false;
                } else if (var3 == 0) {
                    class140.method805();
                    field706 = false;
                } else if (class140.field2352 == 0) {
                    Statics.field246.method2783(var3);
                } else {
                    Statics.field2356 = var3;
                }
                field552 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field707 = 127;
            }
            if (var2 == 1) {
                field707 = 96;
            }
            if (var2 == 2) {
                field707 = 64;
            }
            if (var2 == 3) {
                field707 = 32;
            }
            if (var2 == 4) {
                field707 = 0;
            }
        }
        if (var1 == 5) {
            field611 = var2;
        }
        if (var1 == 6) {
            field631 = var2;
        }
        if (var1 == 9) {
            field632 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field708 = 127;
        }
        if (var2 == 1) {
            field708 = 96;
        }
        if (var2 == 2) {
            field708 = 64;
        }
        if (var2 == 3) {
            field708 = 32;
        }
        if (var2 == 4) {
            field708 = 0;
        }
    }

    @ObfuscatedName("eg.cr(Lfc;B)V")
    public static final void method2732(class160 arg0) {
        int var1 = arg0.field2732;
        if (var1 == 324) {
            if (field728 == -1) {
                field728 = arg0.field2640;
                field729 = arg0.field2699;
            }
            if (field727.field2759) {
                arg0.field2640 = field728;
            } else {
                arg0.field2640 = field729;
            }
        } else if (var1 == 325) {
            if (field728 == -1) {
                field728 = arg0.field2640;
                field729 = arg0.field2699;
            }
            if (field727.field2759) {
                arg0.field2640 = field729;
            } else {
                arg0.field2640 = field728;
            }
        } else if (var1 == 327) {
            arg0.field2656 = 150;
            arg0.field2648 = (int) (Math.sin((double) field723 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2716 = 5;
            arg0.field2649 = 0;
        } else if (var1 == 328) {
            arg0.field2656 = 150;
            arg0.field2648 = (int) (Math.sin((double) field723 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2716 = 5;
            arg0.field2649 = 1;
        }
    }

    @ObfuscatedName("ew.cp(Lw;ZI)V")
    public static final void method2727(class4 arg0, boolean arg1) {
        int var2 = arg0.field50;
        int var3 = (int) arg0.field2837;
        arg0.method3360();
        if (arg1) {
            class160.method2729(var2);
        }
        for (class172 var4 = (class172) field669.method3317(); var4 != null; var4 = (class172) field669.method3299()) {
            if ((var4.field2837 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3360();
            }
        }
        class160 var5 = class160.method628(var3);
        if (var5 != null) {
            method882(var5);
        }
        method2718();
        if (field629 != -1) {
            int var6 = field629;
            if (class160.method2728(var6)) {
                method1183(Statics.field2688[var6], 1);
            }
        }
    }

    @ObfuscatedName("au.cc(Lfc;B)Z")
    public static final boolean method562(class160 arg0) {
        int var1 = arg0.field2732;
        if (var1 == 205) {
            field490 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field727.method3218(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field727.method3219(var4, var5 == 1);
        }
        if (var1 == 324) {
            field727.method3220(false);
        }
        if (var1 == 325) {
            field727.method3220(true);
        }
        if (var1 == 326) {
            field513.method2326(253);
            field727.method3221(field513);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.cy(IIIILch;I)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method3246(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field554 + field510 & 0x7FF;
        int var7 = class104.field1757[var6];
        int var8 = class104.field1736[var6];
        int var9 = var7 * 256 / (field543 + 256);
        int var10 = var8 * 256 / (field543 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field125.method1699(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("fb.ci(IIIILch;I)V")
    public static final void method3246(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field554 + field510 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1757[var5];
        int var8 = class104.field1736[var5];
        int var9 = var7 * 256 / (field543 + 256);
        int var10 = var8 * 256 / (field543 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1702(Statics.field2602, arg0 + 94 + var11 - arg4.field1462 / 2 + 4, arg1 + 83 - var12 - arg4.field1463 / 2 - 4);
        } else {
            arg4.method1688(arg0 + 94 + var11 - arg4.field1462 / 2 + 4, arg1 + 83 - var12 - arg4.field1463 / 2 - 4);
        }
    }

    @ObfuscatedName("p.cu(ILjava/lang/String;Ljava/lang/String;S)V")
    public static final void method220(int arg0, String arg1, String arg2) {
        method1289(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bm.dw(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method1289(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field677[var4] = field677[var4 - 1];
            field681[var4] = field681[var4 - 1];
            field620[var4] = field620[var4 - 1];
            field509[var4] = field509[var4 - 1];
        }
        field677[0] = arg0;
        field681[0] = arg1;
        field620[0] = arg2;
        field509[0] = arg3;
        field684++;
        field659 = field556;
    }

    @ObfuscatedName("de.dk(Ljava/lang/String;I)Z")
    public static boolean method2209(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class150.method159(arg0, Statics.field103);
        for (int var2 = 0; var2 < field538; var2++) {
            if (var1.equalsIgnoreCase(class150.method159(field645[var2].field366, Statics.field103))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class150.method159(Statics.field1096.field41, Statics.field103))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.dp(Ljava/lang/String;B)Z")
    public static boolean method810(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class150.method159(arg0, Statics.field103);
        for (int var2 = 0; var2 < field725; var2++) {
            class11 var3 = field610[var2];
            if (var1.equalsIgnoreCase(class150.method159(var3.field159, Statics.field103))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class150.method159(var3.field164, Statics.field103))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("af.dh(Ljava/lang/String;I)V")
    public static final void method855(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field538 < 200 || field596 == 1) || field538 >= 400) {
            method220(30, "", class136.field2245);
            return;
        }
        String var1 = class150.method159(arg0, Statics.field103);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field538; var2++) {
            class23 var3 = field645[var2];
            String var4 = class150.method159(var3.field366, Statics.field103);
            if (var4 != null && var4.equals(var1)) {
                method220(30, "", arg0 + class136.field2246);
                return;
            }
            if (var3.field362 != null) {
                String var5 = class150.method159(var3.field362, Statics.field103);
                if (var5 != null && var5.equals(var1)) {
                    method220(30, "", arg0 + class136.field2246);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field725; var6++) {
            class11 var7 = field610[var6];
            String var8 = class150.method159(var7.field159, Statics.field103);
            if (var8 != null && var8.equals(var1)) {
                method220(30, "", class136.field2308 + arg0 + class136.field2252);
                return;
            }
            if (var7.field164 != null) {
                String var9 = class150.method159(var7.field164, Statics.field103);
                if (var9 != null && var9.equals(var1)) {
                    method220(30, "", class136.field2308 + arg0 + class136.field2252);
                    return;
                }
            }
        }
        if (class150.method159(Statics.field1096.field41, Statics.field103).equals(var1)) {
            method220(30, "", class136.field2208);
            return;
        }
        field513.method2326(127);
        class116 var10 = field513;
        int var11 = arg0.length() + 1;
        var10.method2493(var11);
        field513.method2428(arg0);
    }

    @ObfuscatedName("ak.de(Ljava/lang/String;B)V")
    public static final void method1189(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class150.method159(arg0, Statics.field103);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field725; var2++) {
            class11 var3 = field610[var2];
            String var4 = var3.field159;
            String var5 = class150.method159(var4, Statics.field103);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field725--;
                for (int var7 = var2; var7 < field725; var7++) {
                    field610[var7] = field610[var7 + 1];
                }
                field660 = field556;
                field513.method2326(6);
                class116 var8 = field513;
                int var9 = arg0.length() + 1;
                var8.method2493(var9);
                field513.method2428(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bk.du(Ljava/lang/String;I)V")
    public static final void method1513(String arg0) {
        if (Statics.field1200 == null) {
            return;
        }
        field513.method2326(126);
        class116 var1 = field513;
        int var2 = arg0.length() + 1;
        var1.method2493(var2);
        field513.method2428(arg0);
    }

    @ObfuscatedName("cq.di(I)V")
    public static final void method1836() {
        field513.method2326(244);
        field513.method2493(0);
    }

    @ObfuscatedName("i.dt(Lfc;B)I")
    public static int method216(class160 arg0) {
        class172 var1 = (class172) field669.method3300(((long) arg0.field2616 << 32) + (long) arg0.field2617);
        return var1 == null ? arg0.field2675 : var1.field2819;
    }

    @ObfuscatedName("br.df(Lfc;I)Lfc;")
    public static class160 method1385(class160 arg0) {
        int var1 = method216(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class160.method628(arg0.field2627);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.da(Lfc;B)Z")
    public static boolean method111(class160 arg0) {
        if (field562) {
            if (method216(arg0) != 0) {
                return false;
            }
            if (arg0.field2698 == 0) {
                return false;
            }
        }
        return arg0.field2715;
    }

    @ObfuscatedName("t.ds(Lfc;II)Ljava/lang/String;")
    public static String method230(class160 arg0, int arg1) {
        if (!class164.method2022(method216(arg0), arg1) && arg0.field2659 == null) {
            return null;
        } else if (arg0.field2677 == null || arg0.field2677.length <= arg1 || arg0.field2677[arg1] == null || arg0.field2677[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2677[arg1];
        }
    }
}

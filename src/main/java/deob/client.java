package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.j")
    public static boolean field479 = true;

    @ObfuscatedName("client.i")
    public static int field480 = 1;

    @ObfuscatedName("client.k")
    public static int field636 = 0;

    @ObfuscatedName("client.t")
    public static int field483 = 0;

    @ObfuscatedName("client.w")
    public static class130[] field537 = new class130[4];

    @ObfuscatedName("client.s")
    public static boolean field661 = false;

    @ObfuscatedName("client.n")
    public static boolean field643 = false;

    @ObfuscatedName("client.o")
    public static int field688 = 0;

    @ObfuscatedName("client.u")
    public static int field487 = 0;

    @ObfuscatedName("client.z")
    public static boolean field488 = true;

    @ObfuscatedName("client.d")
    public static int field489 = 0;

    @ObfuscatedName("client.m")
    public static long field490 = -1L;

    @ObfuscatedName("client.a")
    public static int field491 = -1;

    @ObfuscatedName("client.h")
    public static int field492 = -1;

    @ObfuscatedName("client.p")
    public static int field493 = -1;

    @ObfuscatedName("client.e")
    public static boolean field494 = true;

    @ObfuscatedName("client.r")
    public static boolean field723 = false;

    @ObfuscatedName("client.av")
    public static int field496 = 0;

    @ObfuscatedName("client.an")
    public static int field668 = 0;

    @ObfuscatedName("client.ae")
    public static int field676 = 0;

    @ObfuscatedName("client.au")
    public static int field708 = 0;

    @ObfuscatedName("client.ag")
    public static int field500 = 0;

    @ObfuscatedName("client.at")
    public static int field501 = 0;

    @ObfuscatedName("client.ac")
    public static int field502 = 0;

    @ObfuscatedName("client.aw")
    public static int field623 = 0;

    @ObfuscatedName("client.ah")
    public static int field504 = 0;

    @ObfuscatedName("client.ai")
    public static class127 field505 = new class127(new byte[5000]);

    @ObfuscatedName("client.az")
    public static int field506 = 0;

    @ObfuscatedName("client.as")
    public static int field507 = 0;

    @ObfuscatedName("client.aa")
    public static int field639 = 0;

    @ObfuscatedName("client.bb")
    public static int field510 = 0;

    @ObfuscatedName("client.bl")
    public static int field511 = 0;

    @ObfuscatedName("client.ba")
    public static int field512 = 0;

    @ObfuscatedName("client.br")
    public static int field513 = 0;

    @ObfuscatedName("client.bc")
    public static int field514 = 0;

    @ObfuscatedName("client.by")
    public static class25[] field516 = new class25[32768];

    @ObfuscatedName("client.bn")
    public static int field581 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field582 = new int[32768];

    @ObfuscatedName("client.ci")
    public static class116 field519 = new class116(5000);

    @ObfuscatedName("client.cb")
    public static class116 field520 = new class116(5000);

    @ObfuscatedName("client.cy")
    public static class116 field521 = new class116(5000);

    @ObfuscatedName("client.ca")
    public static int field522 = 0;

    @ObfuscatedName("client.ce")
    public static int field523 = 0;

    @ObfuscatedName("client.cs")
    public static int field524 = 0;

    @ObfuscatedName("client.cq")
    public static int field571 = 0;

    @ObfuscatedName("client.cl")
    public static int field526 = 0;

    @ObfuscatedName("client.cr")
    public static int field589 = 0;

    @ObfuscatedName("client.cw")
    public static int field498 = 0;

    @ObfuscatedName("client.cz")
    public static int field529 = 0;

    @ObfuscatedName("client.ch")
    public static boolean field530 = false;

    @ObfuscatedName("client.cp")
    public static int field531 = 0;

    @ObfuscatedName("client.cx")
    public static int field532 = 0;

    @ObfuscatedName("client.ct")
    public static int field553 = 1;

    @ObfuscatedName("client.dk")
    public static int field536 = 0;

    @ObfuscatedName("client.de")
    public static int field640 = 1;

    @ObfuscatedName("client.dw")
    public static int field481 = 0;

    @ObfuscatedName("client.db")
    public static boolean field538 = false;

    @ObfuscatedName("client.dd")
    public static int[][][] field539 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field540 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.do")
    public static int field541 = 0;

    @ObfuscatedName("client.dc")
    public static int field542 = 2;

    @ObfuscatedName("client.dj")
    public static int field477 = 0;

    @ObfuscatedName("client.dq")
    public static int field544 = 2;

    @ObfuscatedName("client.dm")
    public static int field545 = 0;

    @ObfuscatedName("client.dt")
    public static int field546 = 1;

    @ObfuscatedName("client.dy")
    public static int field547 = 0;

    @ObfuscatedName("client.dv")
    public static int field548 = 0;

    @ObfuscatedName("client.dg")
    public static int field549 = 2;

    @ObfuscatedName("client.du")
    public static int field550 = 0;

    @ObfuscatedName("client.dz")
    public static int field551 = 1;

    @ObfuscatedName("client.en")
    public static int field552 = 0;

    @ObfuscatedName("client.ez")
    public static int field558 = 0;

    @ObfuscatedName("client.ef")
    public static int field554 = 2301979;

    @ObfuscatedName("client.ex")
    public static int field627 = 5063219;

    @ObfuscatedName("client.eo")
    public static int field556 = 3353893;

    @ObfuscatedName("client.ed")
    public static int field557 = 7759444;

    @ObfuscatedName("client.eu")
    public static boolean field699 = false;

    @ObfuscatedName("client.eh")
    public static int field559 = 0;

    @ObfuscatedName("client.fb")
    public static int field561 = 128;

    @ObfuscatedName("client.fg")
    public static int field562 = 0;

    @ObfuscatedName("client.fz")
    public static int field563 = 0;

    @ObfuscatedName("client.ft")
    public static int field609 = 0;

    @ObfuscatedName("client.fp")
    public static int field565 = 0;

    @ObfuscatedName("client.fa")
    public static int field566 = 0;

    @ObfuscatedName("client.fc")
    public static int field567 = 0;

    @ObfuscatedName("client.fi")
    public static boolean field703 = false;

    @ObfuscatedName("client.fk")
    public static int field569 = 0;

    @ObfuscatedName("client.fr")
    public static int field594 = 0;

    @ObfuscatedName("client.fw")
    public static int field578 = 50;

    @ObfuscatedName("client.fn")
    public static int[] field572 = new int[field578];

    @ObfuscatedName("client.fu")
    public static int[] field573 = new int[field578];

    @ObfuscatedName("client.fy")
    public static int[] field727 = new int[field578];

    @ObfuscatedName("client.fm")
    public static int[] field575 = new int[field578];

    @ObfuscatedName("client.fo")
    public static int[] field712 = new int[field578];

    @ObfuscatedName("client.ff")
    public static int[] field577 = new int[field578];

    @ObfuscatedName("client.fe")
    public static int[] field508 = new int[field578];

    @ObfuscatedName("client.fl")
    public static String[] field579 = new String[field578];

    @ObfuscatedName("client.gw")
    public static int[][] field574 = new int[104][104];

    @ObfuscatedName("client.gb")
    public static int field518 = 0;

    @ObfuscatedName("client.gy")
    public static int field525 = -1;

    @ObfuscatedName("client.gj")
    public static int field583 = -1;

    @ObfuscatedName("client.gr")
    public static int field593 = 0;

    @ObfuscatedName("client.gu")
    public static int field585 = 0;

    @ObfuscatedName("client.go")
    public static int field586 = 0;

    @ObfuscatedName("client.gq")
    public static int field587 = 0;

    @ObfuscatedName("client.gh")
    public static int field588 = 0;

    @ObfuscatedName("client.gz")
    public static int field499 = 0;

    @ObfuscatedName("client.gk")
    public static int field590 = 0;

    @ObfuscatedName("client.ga")
    public static int field591 = 0;

    @ObfuscatedName("client.gp")
    public static int field592 = 0;

    @ObfuscatedName("client.gs")
    public static int field608 = 0;

    @ObfuscatedName("client.gf")
    public static boolean field705 = false;

    @ObfuscatedName("client.gx")
    public static int field595 = 0;

    @ObfuscatedName("client.gv")
    public static int field596 = 0;

    @ObfuscatedName("client.gd")
    public static class3[] field662 = new class3[2048];

    @ObfuscatedName("client.gl")
    public static int field685 = 0;

    @ObfuscatedName("client.ge")
    public static int[] field534 = new int[2048];

    @ObfuscatedName("client.gm")
    public static int field600 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field601 = new int[2048];

    @ObfuscatedName("client.hz")
    public static class127[] field602 = new class127[2048];

    @ObfuscatedName("client.hy")
    public static int field709 = -1;

    @ObfuscatedName("client.ho")
    public static int field635 = 0;

    @ObfuscatedName("client.hk")
    public static int field605 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field599 = new int[1000];

    @ObfuscatedName("client.hj")
    public static final int[] field607 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hp")
    public static String[] field660 = new String[8];

    @ObfuscatedName("client.hf")
    public static boolean[] field706 = new boolean[8];

    @ObfuscatedName("client.hm")
    public static int[] field610 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static class177[][][] field611 = new class177[4][104][104];

    @ObfuscatedName("client.hc")
    public static class177 field737 = new class177();

    @ObfuscatedName("client.hu")
    public static class177 field527 = new class177();

    @ObfuscatedName("client.hh")
    public static class177 field614 = new class177();

    @ObfuscatedName("client.hr")
    public static int[] field615 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field613 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field617 = new int[25];

    @ObfuscatedName("client.hi")
    public static int field618 = 0;

    @ObfuscatedName("client.hq")
    public static boolean field619 = false;

    @ObfuscatedName("client.is")
    public static int field620 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field621 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field622 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field672 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field603 = new int[500];

    @ObfuscatedName("client.il")
    public static String[] field625 = new String[500];

    @ObfuscatedName("client.ic")
    public static String[] field694 = new String[500];

    @ObfuscatedName("client.iv")
    public static int field684 = -1;

    @ObfuscatedName("client.iq")
    public static int field628 = -1;

    @ObfuscatedName("client.in")
    public static int field484 = 0;

    @ObfuscatedName("client.iu")
    public static int field630 = 50;

    @ObfuscatedName("client.ij")
    public static int field631 = 0;

    @ObfuscatedName("client.it")
    public static String field580 = null;

    @ObfuscatedName("client.iy")
    public static boolean field633 = false;

    @ObfuscatedName("client.ip")
    public static int field634 = -1;

    @ObfuscatedName("client.ii")
    public static String field656 = null;

    @ObfuscatedName("client.ib")
    public static String field690 = null;

    @ObfuscatedName("client.ih")
    public static int field637 = -1;

    @ObfuscatedName("client.jh")
    public static class175 field597 = new class175(8);

    @ObfuscatedName("client.jd")
    public static int field655 = 0;

    @ObfuscatedName("client.jc")
    public static int field663 = 0;

    @ObfuscatedName("client.jl")
    public static class159 field570 = null;

    @ObfuscatedName("client.jq")
    public static int field642 = 0;

    @ObfuscatedName("client.je")
    public static int field584 = 0;

    @ObfuscatedName("client.ju")
    public static int field644 = 0;

    @ObfuscatedName("client.ji")
    public static boolean field645 = false;

    @ObfuscatedName("client.jk")
    public static boolean field560 = false;

    @ObfuscatedName("client.jm")
    public static boolean field647 = false;

    @ObfuscatedName("client.jo")
    public static class159 field648 = null;

    @ObfuscatedName("client.js")
    public static class159 field649 = null;

    @ObfuscatedName("client.jt")
    public static int field650 = 0;

    @ObfuscatedName("client.jg")
    public static int field651 = 0;

    @ObfuscatedName("client.jv")
    public static class159 field652 = null;

    @ObfuscatedName("client.jz")
    public static boolean field653 = false;

    @ObfuscatedName("client.jx")
    public static int field654 = -1;

    @ObfuscatedName("client.jf")
    public static int field576 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field616 = false;

    @ObfuscatedName("client.jw")
    public static int field564 = -1;

    @ObfuscatedName("client.ja")
    public static int field641 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field659 = false;

    @ObfuscatedName("client.ke")
    public static int field495 = 1;

    @ObfuscatedName("client.kk")
    public static int[] field646 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field632 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field533 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field664 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field503 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field666 = 0;

    @ObfuscatedName("client.kj")
    public static int field667 = 0;

    @ObfuscatedName("client.kq")
    public static int field543 = 0;

    @ObfuscatedName("client.kh")
    public static int field669 = 0;

    @ObfuscatedName("client.kc")
    public static int field670 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field671 = new int[2000];

    @ObfuscatedName("client.kv")
    public static String[] field485 = new String[1000];

    @ObfuscatedName("client.ku")
    public static int field604 = 0;

    @ObfuscatedName("client.ks")
    public static class177 field674 = new class177();

    @ObfuscatedName("client.kn")
    public static class177 field675 = new class177();

    @ObfuscatedName("client.kl")
    public static class177 field731 = new class177();

    @ObfuscatedName("client.ko")
    public static class175 field677 = new class175(512);

    @ObfuscatedName("client.ka")
    public static int field678 = 0;

    @ObfuscatedName("client.kd")
    public static int field679 = -2;

    @ObfuscatedName("client.kr")
    public static boolean[] field680 = new boolean[100];

    @ObfuscatedName("client.kp")
    public static boolean[] field681 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field682 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field683 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field736 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field612 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field686 = new int[100];

    @ObfuscatedName("client.lv")
    public static int field687 = 0;

    @ObfuscatedName("client.li")
    public static int[] field626 = new int[100];

    @ObfuscatedName("client.la")
    public static String[] field689 = new String[100];

    @ObfuscatedName("client.lu")
    public static String[] field665 = new String[100];

    @ObfuscatedName("client.lq")
    public static String[] field624 = new String[100];

    @ObfuscatedName("client.lf")
    public static int field692 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field693 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lr")
    public static int field482 = 0;

    @ObfuscatedName("client.ls")
    public static int field695 = 0;

    @ObfuscatedName("client.lk")
    public static long[] field696 = new long[100];

    @ObfuscatedName("client.lj")
    public static int field697 = 0;

    @ObfuscatedName("client.lw")
    public static int field698 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field606 = new int[128];

    @ObfuscatedName("client.le")
    public static int[] field700 = new int[128];

    @ObfuscatedName("client.ld")
    public static long field701 = -1L;

    @ObfuscatedName("client.lx")
    public static String field702 = null;

    @ObfuscatedName("client.lz")
    public static String field730 = null;

    @ObfuscatedName("client.mf")
    public static int field704 = -1;

    @ObfuscatedName("client.mo")
    public static int field657 = 0;

    @ObfuscatedName("client.mc")
    public static int[] field528 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field735 = new int[1000];

    @ObfuscatedName("client.ml")
    public static class86[] field638 = new class86[1000];

    @ObfuscatedName("client.md")
    public static int field713 = 0;

    @ObfuscatedName("client.mg")
    public static int field710 = 0;

    @ObfuscatedName("client.me")
    public static int field711 = 0;

    @ObfuscatedName("client.mx")
    public static int field517 = 255;

    @ObfuscatedName("client.ma")
    public static int field658 = -1;

    @ObfuscatedName("client.mw")
    public static boolean field714 = false;

    @ObfuscatedName("client.mb")
    public static int field715 = 127;

    @ObfuscatedName("client.mz")
    public static int field716 = 127;

    @ObfuscatedName("client.nd")
    public static int field717 = 0;

    @ObfuscatedName("client.np")
    public static int[] field718 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field719 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field720 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field721 = new int[50];

    @ObfuscatedName("client.nv")
    public static class57[] field535 = new class57[50];

    @ObfuscatedName("client.nl")
    public static boolean field673 = false;

    @ObfuscatedName("client.nb")
    public static boolean[] field724 = new boolean[5];

    @ObfuscatedName("client.ng")
    public static int[] field725 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field726 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field738 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field728 = new int[5];

    @ObfuscatedName("client.of")
    public static int field729 = 0;

    @ObfuscatedName("client.oe")
    public static int field732 = 0;

    @ObfuscatedName("client.oy")
    public static class23[] field555 = new class23[400];

    @ObfuscatedName("client.oj")
    public static class173 field497 = new class173();

    @ObfuscatedName("client.oh")
    public static int field733 = 0;

    @ObfuscatedName("client.oa")
    public static class11[] field722 = new class11[400];

    @ObfuscatedName("client.or")
    public static class164 field691 = new class164();

    @ObfuscatedName("client.oi")
    public static int field568 = -1;

    @ObfuscatedName("client.op")
    public static int field598 = -1;

    @ObfuscatedName("client.i(I)V")
    public final void method309() {
    }

    public final void init() {
        if (!this.method1391()) {
            return;
        }
        class167[] var1 = class167.method2688();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2797);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2797)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field33)) {
                        }
                    case 2:
                    default:
                        break;
                    case 3:
                        field480 = Integer.parseInt(var4);
                        break;
                    case 4:
                        Statics.field629 = class133.method2365(Integer.parseInt(var4));
                        break;
                    case 5:
                        class134[] var5 = new class134[] { class134.field2119, class134.field2115, class134.field2111, class134.field2113, class134.field2114, class134.field2116 };
                        int var7 = Integer.parseInt(var4);
                        class134[] var8 = var5;
                        int var9 = 0;
                        class134 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class134 var10 = var8[var9];
                            if (var7 == var10.method2306()) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field1217 = (class134) var11;
                        if (Statics.field1217 == class134.field2116) {
                            Statics.field210 = class186.field2869;
                        } else {
                            Statics.field210 = class186.field2871;
                        }
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field33)) {
                            field661 = true;
                        } else {
                            field661 = false;
                        }
                        break;
                    case 7:
                        field483 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field1403 = var4;
                        break;
                    case 9:
                        field636 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field688 = Integer.parseInt(var4);
                }
            }
        }
        class95.field1619 = false;
        field643 = false;
        Statics.field1835 = this.getCodeBase().getHost();
        String var12 = Statics.field629.field2104;
        byte var13 = 0;
        try {
            Statics.field1448 = 16;
            Statics.field267 = var13;
            try {
                Statics.field1451 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field1451 = "Unknown";
            }
            Statics.field880 = Statics.field1451.toLowerCase();
            try {
                Statics.field1458 = System.getProperty("user.home");
                if (Statics.field1458 != null) {
                    Statics.field1458 = Statics.field1458 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field880.startsWith("win")) {
                    if (Statics.field1458 == null) {
                        Statics.field1458 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1458 == null) {
                    Statics.field1458 = System.getenv("HOME");
                }
                if (Statics.field1458 != null) {
                    Statics.field1458 = Statics.field1458 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field1458 == null) {
                Statics.field1458 = "~/";
            }
            Statics.field1453 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1458, "/tmp/", "" };
            Statics.field67 = new String[] { ".jagex_cache_" + Statics.field267, ".file_store_" + Statics.field267 };
            label115: for (int var17 = 0; var17 < 4; var17++) {
                Statics.field1939 = class82.method147("oldschool", var12, var17);
                if (!Statics.field1939.exists()) {
                    Statics.field1939.mkdirs();
                }
                File[] var18 = Statics.field1939.listFiles();
                if (var18 == null) {
                    break;
                }
                File[] var19 = var18;
                int var20 = 0;
                while (true) {
                    if (var20 >= var19.length) {
                        break label115;
                    }
                    File var21 = var19[var20];
                    if (!class82.method1645(var21, false)) {
                        break;
                    }
                    var20++;
                }
            }
            class72.method2189(Statics.field1939);
            class82.method227();
            class82.field1445 = new class30(new class29(class72.method1148("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1452 = new class30(new class29(class72.method1148("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1841 = new class30[Statics.field1448];
            for (int var22 = 0; var22 < Statics.field1448; var22++) {
                Statics.field1841[var22] = new class30(new class29(class72.method1148("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var27) {
            class80.method173((String) null, var27);
        }
        Statics.field478 = this;
        this.method1389(765, 503, 39);
    }

    @ObfuscatedName("client.q(B)V")
    public final void method347() {
        Statics.field59 = field483 == 0 ? 43594 : field480 + 40000;
        Statics.field207 = field483 == 0 ? 443 : field480 + 50000;
        Statics.field411 = Statics.field59;
        Statics.field2438 = class162.field2744;
        Statics.field2757 = class162.field2745;
        Statics.field1548 = class162.field2746;
        Statics.field2506 = class162.field2747;
        class75.method1486();
        class75.method1(Statics.field869);
        Canvas var1 = Statics.field869;
        var1.addMouseListener(class77.field1418);
        var1.addMouseMotionListener(class77.field1418);
        var1.addFocusListener(class77.field1418);
        class78 var2;
        try {
            var2 = new class78();
        } catch (Throwable var4) {
            var2 = null;
        }
        Statics.field208 = var2;
        if (Statics.field208 != null) {
            Statics.field208.method1332(Statics.field869);
        }
        Statics.field93 = new class71(255, class82.field1445, class82.field1452, 500000);
        Statics.field29 = class12.method746();
        Statics.field2083 = this.getToolkit().getSystemClipboard();
        if (field483 != 0) {
            field723 = true;
        }
    }

    @ObfuscatedName("client.t(I)V")
    public final void method271() {
        field489++;
        this.method274();
        while (true) {
            class177 var1 = class158.field2609;
            class157 var2;
            synchronized (class158.field2609) {
                var2 = (class157) class158.field2606.method3262();
            }
            if (var2 == null) {
                class139.method1348();
                method2180();
                class75.method3075();
                class77 var4 = class77.field1418;
                synchronized (class77.field1418) {
                    class77.field1404 = class77.field1412;
                    class77.field1410 = class77.field1407;
                    class77.field1411 = class77.field1408;
                    class77.field1425 = class77.field1406;
                    class77.field1421 = class77.field1413;
                    class77.field1416 = class77.field1414;
                    class77.field1419 = class77.field1415;
                    class77.field1406 = 0;
                }
                if (Statics.field208 != null) {
                    int var6 = Statics.field208.method1334();
                    field604 = var6;
                }
                if (field487 == 0) {
                    method248();
                    class73.method151();
                } else if (field487 == 5) {
                    class21.method165(this);
                    method248();
                    class73.method151();
                } else if (field487 == 10) {
                    class21.method165(this);
                } else if (field487 == 20) {
                    class21.method165(this);
                    method673();
                } else if (field487 == 25) {
                    method171(false);
                    field532 = 0;
                    boolean var7 = true;
                    for (int var8 = 0; var8 < Statics.field476.length; var8++) {
                        if (Statics.field1298[var8] != -1 && Statics.field476[var8] == null) {
                            Statics.field476[var8] = Statics.field1045.method2964(Statics.field1298[var8], 0);
                            if (Statics.field476[var8] == null) {
                                var7 = false;
                                field532++;
                            }
                        }
                        if (Statics.field103[var8] != -1 && Statics.field923[var8] == null) {
                            Statics.field923[var8] = Statics.field1045.method2985(Statics.field103[var8], 0, Statics.field18[var8]);
                            if (Statics.field923[var8] == null) {
                                var7 = false;
                                field532++;
                            }
                        }
                    }
                    if (var7) {
                        field536 = 0;
                        boolean var9 = true;
                        for (int var10 = 0; var10 < Statics.field476.length; var10++) {
                            byte[] var11 = Statics.field923[var10];
                            if (var11 != null) {
                                int var12 = (Statics.field2077[var10] >> 8) * 64 - Statics.field96;
                                int var13 = (Statics.field2077[var10] & 0xFF) * 64 - Statics.field92;
                                if (field538) {
                                    var12 = 10;
                                    var13 = 10;
                                }
                                var9 &= class9.method114(var11, var12, var13);
                            }
                        }
                        if (var9) {
                            if (field481 != 0) {
                                method2825(class135.field2128 + class2.field25 + class2.field22 + 100 + "%" + class2.field23, true);
                            }
                            method2180();
                            method2150();
                            method2180();
                            Statics.field1245.method1816();
                            method2180();
                            System.gc();
                            for (int var14 = 0; var14 < 4; var14++) {
                                field537[var14].method2661();
                            }
                            for (int var15 = 0; var15 < 4; var15++) {
                                for (int var16 = 0; var16 < 104; var16++) {
                                    for (int var17 = 0; var17 < 104; var17++) {
                                        class9.field139[var15][var16][var17] = 0;
                                    }
                                }
                            }
                            method2180();
                            class9.method872();
                            int var18 = Statics.field476.length;
                            for (class7 var19 = (class7) class7.field112.method3246(); var19 != null; var19 = (class7) class7.field112.method3248()) {
                                if (var19.field109 != null) {
                                    Statics.field1216.method1088(var19.field109);
                                    var19.field109 = null;
                                }
                                if (var19.field122 != null) {
                                    Statics.field1216.method1088(var19.field122);
                                    var19.field122 = null;
                                }
                            }
                            class7.field112.method3240();
                            method171(true);
                            if (!field538) {
                                for (int var20 = 0; var20 < var18; var20++) {
                                    int var21 = (Statics.field2077[var20] >> 8) * 64 - Statics.field96;
                                    int var22 = (Statics.field2077[var20] & 0xFF) * 64 - Statics.field92;
                                    byte[] var23 = Statics.field476[var20];
                                    if (var23 != null) {
                                        method2180();
                                        class9.method2190(var23, var21, var22, Statics.field1360 * 8 - 48, Statics.field976 * 8 - 48, field537);
                                    }
                                }
                                for (int var24 = 0; var24 < var18; var24++) {
                                    int var25 = (Statics.field2077[var24] >> 8) * 64 - Statics.field96;
                                    int var26 = (Statics.field2077[var24] & 0xFF) * 64 - Statics.field92;
                                    byte[] var27 = Statics.field476[var24];
                                    if (var27 == null && Statics.field976 < 800) {
                                        method2180();
                                        class9.method780(var25, var26, 64, 64);
                                    }
                                }
                                method171(true);
                                for (int var28 = 0; var28 < var18; var28++) {
                                    byte[] var29 = Statics.field923[var28];
                                    if (var29 != null) {
                                        int var30 = (Statics.field2077[var28] >> 8) * 64 - Statics.field96;
                                        int var31 = (Statics.field2077[var28] & 0xFF) * 64 - Statics.field92;
                                        method2180();
                                        Statics.method2296(var29, var30, var31, Statics.field1245, field537);
                                    }
                                }
                            }
                            if (field538) {
                                int var32 = 0;
                                label1029: while (true) {
                                    if (var32 >= 4) {
                                        for (int var43 = 0; var43 < 13; var43++) {
                                            for (int var44 = 0; var44 < 13; var44++) {
                                                int var45 = field539[0][var43][var44];
                                                if (var45 == -1) {
                                                    class9.method780(var43 * 8, var44 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method171(true);
                                        int var46 = 0;
                                        while (true) {
                                            if (var46 >= 4) {
                                                break label1029;
                                            }
                                            method2180();
                                            for (int var47 = 0; var47 < 13; var47++) {
                                                label986: for (int var48 = 0; var48 < 13; var48++) {
                                                    int var49 = field539[var46][var47][var48];
                                                    if (var49 != -1) {
                                                        int var50 = var49 >> 24 & 0x3;
                                                        int var51 = var49 >> 1 & 0x3;
                                                        int var52 = var49 >> 14 & 0x3FF;
                                                        int var53 = var49 >> 3 & 0x7FF;
                                                        int var54 = (var52 / 8 << 8) + var53 / 8;
                                                        for (int var55 = 0; var55 < Statics.field2077.length; var55++) {
                                                            if (Statics.field2077[var55] == var54 && Statics.field923[var55] != null) {
                                                                byte[] var56 = Statics.field923[var55];
                                                                int var57 = var47 * 8;
                                                                int var58 = var48 * 8;
                                                                int var59 = (var52 & 0x7) * 8;
                                                                int var60 = (var53 & 0x7) * 8;
                                                                class95 var61 = Statics.field1245;
                                                                class130[] var62 = field537;
                                                                class127 var63 = new class127(var56);
                                                                int var64 = -1;
                                                                while (true) {
                                                                    int var65 = var63.method2409();
                                                                    if (var65 == 0) {
                                                                        continue label986;
                                                                    }
                                                                    var64 += var65;
                                                                    int var66 = 0;
                                                                    while (true) {
                                                                        int var67 = var63.method2409();
                                                                        if (var67 == 0) {
                                                                            break;
                                                                        }
                                                                        var66 += var67 - 1;
                                                                        int var68 = var66 & 0x3F;
                                                                        int var69 = var66 >> 6 & 0x3F;
                                                                        int var70 = var66 >> 12;
                                                                        int var71 = var63.method2416();
                                                                        int var72 = var71 >> 2;
                                                                        int var73 = var71 & 0x3;
                                                                        if (var50 == var70 && var69 >= var59 && var69 < var59 + 8 && var68 >= var60 && var68 < var60 + 8) {
                                                                            class32 var74 = class32.method46(var64);
                                                                            int var76 = var69 & 0x7;
                                                                            int var77 = var68 & 0x7;
                                                                            int var79 = var74.field825;
                                                                            int var80 = var74.field826;
                                                                            if ((var73 & 0x1) == 1) {
                                                                                int var81 = var79;
                                                                                var79 = var80;
                                                                                var80 = var81;
                                                                            }
                                                                            int var82 = var51 & 0x3;
                                                                            int var83;
                                                                            if (var82 == 0) {
                                                                                var83 = var76;
                                                                            } else if (var82 == 1) {
                                                                                var83 = var77;
                                                                            } else if (var82 == 2) {
                                                                                var83 = 7 - var76 - (var79 - 1);
                                                                            } else {
                                                                                var83 = 7 - var77 - (var80 - 1);
                                                                            }
                                                                            int var84 = var57 + var83;
                                                                            int var86 = var69 & 0x7;
                                                                            int var87 = var68 & 0x7;
                                                                            int var89 = var74.field825;
                                                                            int var90 = var74.field826;
                                                                            if ((var73 & 0x1) == 1) {
                                                                                int var91 = var89;
                                                                                var89 = var90;
                                                                                var90 = var91;
                                                                            }
                                                                            int var92 = var51 & 0x3;
                                                                            int var93;
                                                                            if (var92 == 0) {
                                                                                var93 = var87;
                                                                            } else if (var92 == 1) {
                                                                                var93 = 7 - var86 - (var89 - 1);
                                                                            } else if (var92 == 2) {
                                                                                var93 = 7 - var87 - (var90 - 1);
                                                                            } else {
                                                                                var93 = var86;
                                                                            }
                                                                            int var94 = var58 + var93;
                                                                            if (var84 > 0 && var94 > 0 && var84 < 103 && var94 < 103) {
                                                                                int var95 = var46;
                                                                                if ((class9.field139[1][var84][var94] & 0x2) == 2) {
                                                                                    var95 = var46 - 1;
                                                                                }
                                                                                class130 var96 = null;
                                                                                if (var95 >= 0) {
                                                                                    var96 = var62[var95];
                                                                                }
                                                                                class9.method3086(var46, var84, var94, var64, var51 + var73 & 0x3, var72, var61, var96);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var46++;
                                        }
                                    }
                                    method2180();
                                    for (int var33 = 0; var33 < 13; var33++) {
                                        for (int var34 = 0; var34 < 13; var34++) {
                                            boolean var35 = false;
                                            int var36 = field539[var32][var33][var34];
                                            if (var36 != -1) {
                                                int var37 = var36 >> 24 & 0x3;
                                                int var38 = var36 >> 1 & 0x3;
                                                int var39 = var36 >> 14 & 0x3FF;
                                                int var40 = var36 >> 3 & 0x7FF;
                                                int var41 = (var39 / 8 << 8) + var40 / 8;
                                                for (int var42 = 0; var42 < Statics.field2077.length; var42++) {
                                                    if (Statics.field2077[var42] == var41 && Statics.field476[var42] != null) {
                                                        class9.method547(Statics.field476[var42], var32, var33 * 8, var34 * 8, var37, (var39 & 0x7) * 8, (var40 & 0x7) * 8, var38, field537);
                                                        var35 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var35) {
                                                class9.method2166(var32, var33 * 8, var34 * 8);
                                            }
                                        }
                                    }
                                    var32++;
                                }
                            }
                            method171(true);
                            method2150();
                            method2180();
                            class95 var97 = Statics.field1245;
                            class130[] var98 = field537;
                            for (int var99 = 0; var99 < 4; var99++) {
                                for (int var100 = 0; var100 < 104; var100++) {
                                    for (int var101 = 0; var101 < 104; var101++) {
                                        if ((class9.field139[var99][var100][var101] & 0x1) == 1) {
                                            int var102 = var99;
                                            if ((class9.field139[1][var100][var101] & 0x2) == 2) {
                                                var102 = var99 - 1;
                                            }
                                            if (var102 >= 0) {
                                                var98[var102].method2656(var100, var101);
                                            }
                                        }
                                    }
                                }
                            }
                            class9.field153 += (int) (Math.random() * 5.0D) - 2;
                            if (class9.field153 < -8) {
                                class9.field153 = -8;
                            }
                            if (class9.field153 > 8) {
                                class9.field153 = 8;
                            }
                            class9.field142 += (int) (Math.random() * 5.0D) - 2;
                            if (class9.field142 < -16) {
                                class9.field142 = -16;
                            }
                            if (class9.field142 > 16) {
                                class9.field142 = 16;
                            }
                            for (int var103 = 0; var103 < 4; var103++) {
                                byte[][] var104 = Statics.field145[var103];
                                int var105 = (int) Math.sqrt(5100.0D);
                                int var106 = var105 * 768 >> 8;
                                for (int var107 = 1; var107 < 103; var107++) {
                                    for (int var108 = 1; var108 < 103; var108++) {
                                        int var109 = class9.field149[var103][var108 + 1][var107] - class9.field149[var103][var108 - 1][var107];
                                        int var110 = class9.field149[var103][var108][var107 + 1] - class9.field149[var103][var108][var107 - 1];
                                        int var111 = (int) Math.sqrt((double) (var110 * var110 + var109 * var109 + 65536));
                                        int var112 = (var109 << 8) / var111;
                                        int var113 = 65536 / var111;
                                        int var114 = (var110 << 8) / var111;
                                        int var115 = (var114 * -50 + var112 * -50 + var113 * -10) / var106 + 96;
                                        int var116 = (var104[var108][var107] >> 1) + (var104[var108][var107 + 1] >> 3) + (var104[var108][var107 - 1] >> 2) + (var104[var108 - 1][var107] >> 2) + (var104[var108 + 1][var107] >> 3);
                                        Statics.field2120[var108][var107] = var115 - var116;
                                    }
                                }
                                for (int var117 = 0; var117 < 104; var117++) {
                                    Statics.field198[var117] = 0;
                                    Statics.field144[var117] = 0;
                                    Statics.field1028[var117] = 0;
                                    Statics.field1464[var117] = 0;
                                    Statics.field146[var117] = 0;
                                }
                                for (int var118 = -5; var118 < 109; var118++) {
                                    for (int var119 = 0; var119 < 104; var119++) {
                                        int var120 = var118 + 5;
                                        int var10002;
                                        if (var120 >= 0 && var120 < 104) {
                                            int var121 = Statics.field141[var103][var120][var119] & 0xFF;
                                            if (var121 > 0) {
                                                int var122 = var121 - 1;
                                                class33 var123 = (class33) class33.field864.method3188((long) var122);
                                                class33 var124;
                                                if (var123 == null) {
                                                    byte[] var125 = Statics.field877.method2964(1, var122);
                                                    class33 var126 = new class33();
                                                    if (var125 != null) {
                                                        var126.method680(new class127(var125), var122);
                                                    }
                                                    var126.method690();
                                                    class33.field864.method3190(var126, (long) var122);
                                                    var124 = var126;
                                                } else {
                                                    var124 = var123;
                                                }
                                                Statics.field198[var119] += var124.field861;
                                                Statics.field144[var119] += var124.field862;
                                                Statics.field1028[var119] += var124.field866;
                                                Statics.field1464[var119] += var124.field867;
                                                var10002 = Statics.field146[var119]++;
                                            }
                                        }
                                        int var128 = var118 - 5;
                                        if (var128 >= 0 && var128 < 104) {
                                            int var129 = Statics.field141[var103][var128][var119] & 0xFF;
                                            if (var129 > 0) {
                                                int var130 = var129 - 1;
                                                class33 var131 = (class33) class33.field864.method3188((long) var130);
                                                class33 var132;
                                                if (var131 == null) {
                                                    byte[] var133 = Statics.field877.method2964(1, var130);
                                                    class33 var134 = new class33();
                                                    if (var133 != null) {
                                                        var134.method680(new class127(var133), var130);
                                                    }
                                                    var134.method690();
                                                    class33.field864.method3190(var134, (long) var130);
                                                    var132 = var134;
                                                } else {
                                                    var132 = var131;
                                                }
                                                Statics.field198[var119] -= var132.field861;
                                                Statics.field144[var119] -= var132.field862;
                                                Statics.field1028[var119] -= var132.field866;
                                                Statics.field1464[var119] -= var132.field867;
                                                var10002 = Statics.field146[var119]--;
                                            }
                                        }
                                    }
                                    if (var118 >= 1 && var118 < 103) {
                                        int var136 = 0;
                                        int var137 = 0;
                                        int var138 = 0;
                                        int var139 = 0;
                                        int var140 = 0;
                                        for (int var141 = -5; var141 < 109; var141++) {
                                            int var142 = var141 + 5;
                                            if (var142 >= 0 && var142 < 104) {
                                                var136 += Statics.field198[var142];
                                                var137 += Statics.field144[var142];
                                                var138 += Statics.field1028[var142];
                                                var139 += Statics.field1464[var142];
                                                var140 += Statics.field146[var142];
                                            }
                                            int var143 = var141 - 5;
                                            if (var143 >= 0 && var143 < 104) {
                                                var136 -= Statics.field198[var143];
                                                var137 -= Statics.field144[var143];
                                                var138 -= Statics.field1028[var143];
                                                var139 -= Statics.field1464[var143];
                                                var140 -= Statics.field146[var143];
                                            }
                                            if (var141 >= 1 && var141 < 103) {
                                                if (field643 && (class9.field139[0][var118][var141] & 0x2) == 0) {
                                                    if ((class9.field139[var103][var118][var141] & 0x10) != 0) {
                                                        continue;
                                                    }
                                                    int var144;
                                                    if ((class9.field139[var103][var118][var141] & 0x8) != 0) {
                                                        var144 = 0;
                                                    } else if (var103 <= 0 || (class9.field139[1][var118][var141] & 0x2) == 0) {
                                                        var144 = var103;
                                                    } else {
                                                        var144 = var103 - 1;
                                                    }
                                                    if (field531 != var144) {
                                                        continue;
                                                    }
                                                }
                                                if (var103 < class9.field140) {
                                                    class9.field140 = var103;
                                                }
                                                int var145 = Statics.field141[var103][var118][var141] & 0xFF;
                                                int var146 = Statics.field2490[var103][var118][var141] & 0xFF;
                                                if (var145 > 0 || var146 > 0) {
                                                    int var147 = class9.field149[var103][var118][var141];
                                                    int var148 = class9.field149[var103][var118 + 1][var141];
                                                    int var149 = class9.field149[var103][var118 + 1][var141 + 1];
                                                    int var150 = class9.field149[var103][var118][var141 + 1];
                                                    int var151 = Statics.field2120[var118][var141];
                                                    int var152 = Statics.field2120[var118 + 1][var141];
                                                    int var153 = Statics.field2120[var118 + 1][var141 + 1];
                                                    int var154 = Statics.field2120[var118][var141 + 1];
                                                    int var155 = -1;
                                                    int var156 = -1;
                                                    if (var145 > 0) {
                                                        int var157 = var136 * 256 / var139;
                                                        int var158 = var137 / var140;
                                                        int var159 = var138 / var140;
                                                        var155 = class9.method2323(var157, var158, var159);
                                                        int var160 = class9.field153 + var157 & 0xFF;
                                                        int var161 = class9.field142 + var159;
                                                        if (var161 < 0) {
                                                            var161 = 0;
                                                        } else if (var161 > 255) {
                                                            var161 = 255;
                                                        }
                                                        var156 = class9.method2323(var160, var158, var161);
                                                    }
                                                    if (var103 > 0) {
                                                        boolean var162 = true;
                                                        if (var145 == 0 && Statics.field154[var103][var118][var141] != 0) {
                                                            var162 = false;
                                                        }
                                                        if (var146 > 0 && !class37.method232(var146 - 1).field946) {
                                                            var162 = false;
                                                        }
                                                        if (var162 && var147 == var148 && var147 == var149 && var147 == var150) {
                                                            Statics.field2496[var103][var118][var141] |= 0x924;
                                                        }
                                                    }
                                                    int var163 = 0;
                                                    if (var156 != -1) {
                                                        var163 = class104.field1798[class9.method25(var156, 96)];
                                                    }
                                                    if (var146 == 0) {
                                                        var97.method1826(var103, var118, var141, 0, 0, -1, var147, var148, var149, var150, class9.method25(var155, var151), class9.method25(var155, var152), class9.method25(var155, var153), class9.method25(var155, var154), 0, 0, 0, 0, var163, 0);
                                                    } else {
                                                        int var164 = Statics.field154[var103][var118][var141] + 1;
                                                        byte var165 = Statics.field1330[var103][var118][var141];
                                                        class37 var166 = class37.method232(var146 - 1);
                                                        int var167 = var166.field948;
                                                        int var168;
                                                        int var169;
                                                        if (var167 >= 0) {
                                                            var168 = Statics.field1797.method2153(var167);
                                                            var169 = -1;
                                                        } else if (var166.field939 == 16711935) {
                                                            var169 = -2;
                                                            var167 = -1;
                                                            var168 = -2;
                                                        } else {
                                                            var169 = class9.method2323(var166.field943, var166.field944, var166.field945);
                                                            int var170 = class9.field153 + var166.field943 & 0xFF;
                                                            int var171 = class9.field142 + var166.field945;
                                                            if (var171 < 0) {
                                                                var171 = 0;
                                                            } else if (var171 > 255) {
                                                                var171 = 255;
                                                            }
                                                            var168 = class9.method2323(var170, var166.field944, var171);
                                                        }
                                                        int var172 = 0;
                                                        if (var168 != -2) {
                                                            var172 = class104.field1798[class9.method148(var168, 96)];
                                                        }
                                                        if (var166.field942 != -1) {
                                                            int var173 = class9.field153 + var166.field947 & 0xFF;
                                                            int var174 = class9.field142 + var166.field949;
                                                            if (var174 < 0) {
                                                                var174 = 0;
                                                            } else if (var174 > 255) {
                                                                var174 = 255;
                                                            }
                                                            int var175 = class9.method2323(var173, var166.field940, var174);
                                                            var172 = class104.field1798[class9.method148(var175, 96)];
                                                        }
                                                        var97.method1826(var103, var118, var141, var164, var165, var167, var147, var148, var149, var150, class9.method25(var155, var151), class9.method25(var155, var152), class9.method25(var155, var153), class9.method25(var155, var154), class9.method148(var169, var151), class9.method148(var169, var152), class9.method148(var169, var153), class9.method148(var169, var154), var163, var172);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var176 = 1; var176 < 103; var176++) {
                                    for (int var177 = 1; var177 < 103; var177++) {
                                        int var182;
                                        if ((class9.field139[var103][var177][var176] & 0x8) != 0) {
                                            var182 = 0;
                                        } else if (var103 <= 0 || (class9.field139[1][var177][var176] & 0x2) == 0) {
                                            var182 = var103;
                                        } else {
                                            var182 = var103 - 1;
                                        }
                                        var97.method1820(var103, var177, var176, var182);
                                    }
                                }
                                Statics.field141[var103] = (byte[][]) null;
                                Statics.field2490[var103] = (byte[][]) null;
                                Statics.field154[var103] = (byte[][]) null;
                                Statics.field1330[var103] = (byte[][]) null;
                                Statics.field145[var103] = (byte[][]) null;
                            }
                            var97.method1847(-50, -10, -50);
                            for (int var183 = 0; var183 < 104; var183++) {
                                for (int var184 = 0; var184 < 104; var184++) {
                                    if ((class9.field139[1][var183][var184] & 0x2) == 2) {
                                        var97.method1818(var183, var184);
                                    }
                                }
                            }
                            int var185 = 1;
                            int var186 = 2;
                            int var187 = 4;
                            for (int var188 = 0; var188 < 4; var188++) {
                                if (var188 > 0) {
                                    var185 <<= 0x3;
                                    var186 <<= 0x3;
                                    var187 <<= 0x3;
                                }
                                for (int var189 = 0; var189 <= var188; var189++) {
                                    for (int var190 = 0; var190 <= 104; var190++) {
                                        for (int var191 = 0; var191 <= 104; var191++) {
                                            if ((Statics.field2496[var189][var191][var190] & var185) != 0) {
                                                int var192 = var190;
                                                int var193 = var190;
                                                int var194 = var189;
                                                int var195 = var189;
                                                while (var192 > 0 && (Statics.field2496[var189][var191][var192 - 1] & var185) != 0) {
                                                    var192--;
                                                }
                                                while (var193 < 104 && (Statics.field2496[var189][var191][var193 + 1] & var185) != 0) {
                                                    var193++;
                                                }
                                                label696: while (var194 > 0) {
                                                    for (int var196 = var192; var196 <= var193; var196++) {
                                                        if ((Statics.field2496[var194 - 1][var191][var196] & var185) == 0) {
                                                            break label696;
                                                        }
                                                    }
                                                    var194--;
                                                }
                                                label685: while (var195 < var188) {
                                                    for (int var197 = var192; var197 <= var193; var197++) {
                                                        if ((Statics.field2496[var195 + 1][var191][var197] & var185) == 0) {
                                                            break label685;
                                                        }
                                                    }
                                                    var195++;
                                                }
                                                int var198 = (var195 + 1 - var194) * (var193 - var192 + 1);
                                                if (var198 >= 8) {
                                                    short var199 = 240;
                                                    int var200 = class9.field149[var195][var191][var192] - var199;
                                                    int var201 = class9.field149[var194][var191][var192];
                                                    class95.method1819(var188, 1, var191 * 128, var191 * 128, var192 * 128, var193 * 128 + 128, var200, var201);
                                                    for (int var202 = var194; var202 <= var195; var202++) {
                                                        for (int var203 = var192; var203 <= var193; var203++) {
                                                            Statics.field2496[var202][var191][var203] &= ~var185;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2496[var189][var191][var190] & var186) != 0) {
                                                int var204 = var191;
                                                int var205 = var191;
                                                int var206 = var189;
                                                int var207 = var189;
                                                while (var204 > 0 && (Statics.field2496[var189][var204 - 1][var190] & var186) != 0) {
                                                    var204--;
                                                }
                                                while (var205 < 104 && (Statics.field2496[var189][var205 + 1][var190] & var186) != 0) {
                                                    var205++;
                                                }
                                                label749: while (var206 > 0) {
                                                    for (int var208 = var204; var208 <= var205; var208++) {
                                                        if ((Statics.field2496[var206 - 1][var208][var190] & var186) == 0) {
                                                            break label749;
                                                        }
                                                    }
                                                    var206--;
                                                }
                                                label738: while (var207 < var188) {
                                                    for (int var209 = var204; var209 <= var205; var209++) {
                                                        if ((Statics.field2496[var207 + 1][var209][var190] & var186) == 0) {
                                                            break label738;
                                                        }
                                                    }
                                                    var207++;
                                                }
                                                int var210 = (var207 + 1 - var206) * (var205 - var204 + 1);
                                                if (var210 >= 8) {
                                                    short var211 = 240;
                                                    int var212 = class9.field149[var207][var204][var190] - var211;
                                                    int var213 = class9.field149[var206][var204][var190];
                                                    class95.method1819(var188, 2, var204 * 128, var205 * 128 + 128, var190 * 128, var190 * 128, var212, var213);
                                                    for (int var214 = var206; var214 <= var207; var214++) {
                                                        for (int var215 = var204; var215 <= var205; var215++) {
                                                            Statics.field2496[var214][var215][var190] &= ~var186;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2496[var189][var191][var190] & var187) != 0) {
                                                int var216 = var191;
                                                int var217 = var191;
                                                int var218 = var190;
                                                int var219 = var190;
                                                while (var218 > 0 && (Statics.field2496[var189][var191][var218 - 1] & var187) != 0) {
                                                    var218--;
                                                }
                                                while (var219 < 104 && (Statics.field2496[var189][var191][var219 + 1] & var187) != 0) {
                                                    var219++;
                                                }
                                                label802: while (var216 > 0) {
                                                    for (int var220 = var218; var220 <= var219; var220++) {
                                                        if ((Statics.field2496[var189][var216 - 1][var220] & var187) == 0) {
                                                            break label802;
                                                        }
                                                    }
                                                    var216--;
                                                }
                                                label791: while (var217 < 104) {
                                                    for (int var221 = var218; var221 <= var219; var221++) {
                                                        if ((Statics.field2496[var189][var217 + 1][var221] & var187) == 0) {
                                                            break label791;
                                                        }
                                                    }
                                                    var217++;
                                                }
                                                if ((var217 - var216 + 1) * (var219 - var218 + 1) >= 4) {
                                                    int var222 = class9.field149[var189][var216][var218];
                                                    class95.method1819(var188, 4, var216 * 128, var217 * 128 + 128, var218 * 128, var219 * 128 + 128, var222, var222);
                                                    for (int var223 = var216; var223 <= var217; var223++) {
                                                        for (int var224 = var218; var224 <= var219; var224++) {
                                                            Statics.field2496[var189][var223][var224] &= ~var187;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method171(true);
                            int var225 = class9.field140;
                            if (var225 > Statics.field13) {
                                var225 = Statics.field13;
                            }
                            if (var225 < Statics.field13 - 1) {
                                int var226 = Statics.field13 - 1;
                            }
                            if (field643) {
                                Statics.field1245.method1857(class9.field140);
                            } else {
                                Statics.field1245.method1857(0);
                            }
                            for (int var227 = 0; var227 < 104; var227++) {
                                for (int var228 = 0; var228 < 104; var228++) {
                                    method2327(var227, var228);
                                }
                            }
                            method2180();
                            for (class22 var229 = (class22) field737.method3246(); var229 != null; var229 = (class22) field737.method3248()) {
                                if (var229.field361 == -1) {
                                    var229.field358 = 0;
                                    method186(var229);
                                } else {
                                    var229.method3282();
                                }
                            }
                            class32.field813.method3191();
                            if (Statics.field1236 != null) {
                                field519.method2273(21);
                                field519.method2385(1057001181);
                            }
                            if (!field538) {
                                int var230 = (Statics.field1360 - 6) / 8;
                                int var231 = (Statics.field1360 + 6) / 8;
                                int var232 = (Statics.field976 - 6) / 8;
                                int var233 = (Statics.field976 + 6) / 8;
                                for (int var234 = var230 - 1; var234 <= var231 + 1; var234++) {
                                    for (int var235 = var232 - 1; var235 <= var233 + 1; var235++) {
                                        if (var234 < var230 || var234 > var231 || var235 < var232 || var235 > var233) {
                                            Statics.field1045.method2982("m" + var234 + "_" + var235);
                                            Statics.field1045.method2982("l" + var234 + "_" + var235);
                                        }
                                    }
                                }
                            }
                            method222(30);
                            method2180();
                            Statics.field141 = (byte[][][]) null;
                            Statics.field2490 = (byte[][][]) null;
                            Statics.field154 = (byte[][][]) null;
                            Statics.field1330 = (byte[][][]) null;
                            Statics.field2496 = (int[][][]) null;
                            Statics.field145 = (byte[][][]) null;
                            Statics.field2120 = (int[][]) null;
                            Statics.field198 = null;
                            Statics.field144 = null;
                            Statics.field1028 = null;
                            Statics.field1464 = null;
                            Statics.field146 = null;
                            field519.method2273(225);
                            class73.method151();
                        } else {
                            field481 = 2;
                        }
                    } else {
                        field481 = 1;
                    }
                }
                if (field487 == 30) {
                    method561();
                } else if (field487 == 40 || field487 == 45) {
                    method673();
                }
                return;
            }
            var2.field2600.method3056(var2.field2598, (int) var2.field2826, var2.field2597, false);
        }
    }

    @ObfuscatedName("client.v(S)V")
    public final void method300() {
        boolean var1;
        label214: {
            try {
                if (class139.field2379 == 2) {
                    if (Statics.field249 == null) {
                        Statics.field249 = class140.method2710(Statics.field2380, Statics.field2381, Statics.field2383);
                        if (Statics.field249 == null) {
                            var1 = false;
                            break label214;
                        }
                    }
                    if (Statics.field2021 == null) {
                        Statics.field2021 = new class58(Statics.field2013, Statics.field2378);
                    }
                    if (Statics.field68.method2729(Statics.field249, Statics.field2377, Statics.field2021, 22050)) {
                        Statics.field68.method2743();
                        Statics.field68.method2754(Statics.field89);
                        Statics.field68.method2732(Statics.field249, Statics.field1543);
                        class139.field2379 = 0;
                        Statics.field249 = null;
                        Statics.field2021 = null;
                        Statics.field2380 = null;
                        var1 = true;
                        break label214;
                    }
                }
            } catch (Exception var32) {
                var32.printStackTrace();
                Statics.field68.method2755();
                class139.field2379 = 0;
                Statics.field249 = null;
                Statics.field2021 = null;
                Statics.field2380 = null;
            }
            var1 = false;
        }
        if (var1 && field714 && Statics.field2579 != null) {
            Statics.field2579.method1142();
        }
        if (field1355) {
            class75.method120(Statics.field869);
            Canvas var4 = Statics.field869;
            var4.removeMouseListener(class77.field1418);
            var4.removeMouseMotionListener(class77.field1418);
            var4.removeFocusListener(class77.field1418);
            class77.field1412 = 0;
            if (Statics.field208 != null) {
                Statics.field208.method1340(Statics.field869);
            }
            this.method1390();
            class75.method1(Statics.field869);
            Canvas var5 = Statics.field869;
            var5.addMouseListener(class77.field1418);
            var5.addMouseMotionListener(class77.field1418);
            var5.addFocusListener(class77.field1418);
            if (Statics.field208 != null) {
                Statics.field208.method1332(Statics.field869);
            }
        }
        if (field487 == 0) {
            class73.method1254(class21.field315, class21.field335, (Color) null);
        } else if (field487 == 5) {
            class21.method1460(Statics.field211, Statics.field277);
        } else if (field487 == 10) {
            class21.method1460(Statics.field211, Statics.field277);
        } else if (field487 == 20) {
            class21.method1460(Statics.field211, Statics.field277);
        } else if (field487 == 25) {
            if (field481 == 1) {
                if (field532 > field553) {
                    field553 = field532;
                }
                int var6 = (field553 * 50 - field532 * 50) / field553;
                method2825(class135.field2128 + class2.field25 + class2.field22 + var6 + "%" + class2.field23, false);
            } else if (field481 == 2) {
                if (field536 > field640) {
                    field640 = field536;
                }
                int var7 = (field640 * 50 - field536 * 50) / field640 + 50;
                method2825(class135.field2128 + class2.field25 + class2.field22 + var7 + "%" + class2.field23, false);
            } else {
                method2825(class135.field2128, false);
            }
        } else if (field487 == 30) {
            if (field637 != -1) {
                method1342(field637);
            }
            for (int var8 = 0; var8 < field678; var8++) {
                if (field680[var8]) {
                    field681[var8] = true;
                }
                field682[var8] = field680[var8];
                field680[var8] = false;
            }
            field679 = field489;
            field684 = -1;
            field628 = -1;
            Statics.field1775 = null;
            if (field637 != -1) {
                field678 = 0;
                int var9 = field637;
                if (class159.method880(var9)) {
                    Statics.field1118 = null;
                    method1472(Statics.field2830[var9], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field1118 != null) {
                        method1472(Statics.field1118, -1412584499, 0, 0, 765, 503, Statics.field218, Statics.field1648, -1);
                        Statics.field1118 = null;
                    }
                } else {
                    for (int var10 = 0; var10 < 100; var10++) {
                        field680[var10] = true;
                    }
                }
            }
            class89.method1742();
            if (field619) {
                int var11 = Statics.field1214;
                int var12 = Statics.field195;
                int var13 = Statics.field1936;
                int var14 = Statics.field1314;
                int var15 = 6116423;
                class89.method1770(var11, var12, var13, var14, var15);
                class89.method1770(var11 + 1, var12 + 1, var13 - 2, 16, 0);
                class89.method1759(var11 + 1, var12 + 18, var13 - 2, var14 - 19, 0);
                Statics.field211.method3367(class135.field2265, var11 + 3, var12 + 14, var15, -1);
                int var16 = class77.field1410;
                int var17 = class77.field1411;
                for (int var18 = 0; var18 < field620; var18++) {
                    int var19 = (field620 - 1 - var18) * 15 + var12 + 31;
                    int var20 = 16777215;
                    if (var16 > var11 && var16 < var11 + var13 && var17 > var19 - 13 && var17 < var19 + 3) {
                        var20 = 16776960;
                    }
                    class183 var21 = Statics.field211;
                    String var22;
                    if (field694[var18].length() > 0) {
                        var22 = field625[var18] + class135.field2272 + field694[var18];
                    } else {
                        var22 = field625[var18];
                    }
                    var21.method3367(var22, var11 + 3, var19, var20, 0);
                }
                method1998(Statics.field1214, Statics.field195, Statics.field1936, Statics.field1314);
            } else if (field684 != -1) {
                Statics.method553(field684, field628);
            }
            if (field687 == 3) {
                for (int var23 = 0; var23 < field678; var23++) {
                    if (field682[var23]) {
                        class89.method1748(field683[var23], field736[var23], field612[var23], field686[var23], 16711935, 128);
                    } else if (field681[var23]) {
                        class89.method1748(field683[var23], field736[var23], field612[var23], field686[var23], 16711680, 128);
                    }
                }
            }
            class7.method11(Statics.field13, Statics.field368.field444, Statics.field368.field420, field558);
            field558 = 0;
        } else if (field487 == 40) {
            method2825(class135.field2129 + class2.field25 + class135.field2159, false);
        } else if (field487 == 45) {
            method2825(class135.field2269, false);
        }
        if (field487 == 30 && field687 == 0 && !field1341) {
            try {
                Graphics var24 = Statics.field869.getGraphics();
                for (int var25 = 0; var25 < field678; var25++) {
                    if (field681[var25]) {
                        Statics.field1541.method1583(var24, field683[var25], field736[var25], field612[var25], field686[var25]);
                        field681[var25] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field869.repaint();
            }
        } else if (field487 > 0) {
            try {
                Graphics var27 = Statics.field869.getGraphics();
                Statics.field1541.method1582(var27, 0, 0);
                field1341 = false;
                for (int var28 = 0; var28 < field678; var28++) {
                    field681[var28] = false;
                }
            } catch (Exception var30) {
                Statics.field869.repaint();
            }
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method508() {
        if (Statics.field294 != null) {
            Statics.field294.field272 = false;
        }
        Statics.field294 = null;
        if (Statics.field1209 != null) {
            Statics.field1209.method1350();
            Statics.field1209 = null;
        }
        class75.method816();
        class77.method1415();
        Statics.field208 = null;
        if (Statics.field2579 != null) {
            Statics.field2579.method1143();
        }
        if (Statics.field287 != null) {
            Statics.field287.method1143();
        }
        class154.method767();
        Object var1 = class158.field2604;
        synchronized (class158.field2604) {
            if (class158.field2603 != 0) {
                class158.field2603 = 1;
                try {
                    class158.field2604.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class82.field1445.method563();
            for (int var4 = 0; var4 < Statics.field1448; var4++) {
                Statics.field1841[var4].method563();
            }
            class82.field1452.method563();
            class82.field1456.method563();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("a.w(II)V")
    public static void method222(int arg0) {
        if (field487 == arg0) {
            return;
        }
        if (field487 == 0) {
            Statics.field2501 = null;
            Statics.field314 = null;
            Statics.field126 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field511 = 0;
            field512 = 0;
            field513 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1218 != null) {
            Statics.field1218.method1350();
            Statics.field1218 = null;
        }
        if (field487 == 25) {
            field481 = 0;
            field532 = 0;
            field553 = 1;
            field536 = 0;
            field640 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field869;
            class155 var2 = Statics.field1817;
            class155 var3 = Statics.field950;
            if (!Statics.field320) {
                class89.method1747();
                byte[] var4 = var2.method3031("title.jpg", "");
                Statics.field319 = new class86(var4, var1);
                Statics.field322 = Statics.field319.method1693();
                Statics.field321 = class84.method806(var3, "logo", "");
                Statics.field316 = class84.method806(var3, "titlebox", "");
                Statics.field317 = class84.method806(var3, "titlebutton", "");
                Statics.field318 = class84.method167(var3, "runes", "");
                Statics.field2502 = class84.method167(var3, "title_mute", "");
                Statics.field348 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field348[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field348[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field348[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field348[var8 + 192] = 16777215;
                }
                Statics.field1468 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field1468[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field1468[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field1468[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field1468[var12 + 192] = 16777215;
                }
                Statics.field1809 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field1809[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field1809[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field1809[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field1809[var16 + 192] = 16777215;
                }
                Statics.field2792 = new int[256];
                Statics.field1328 = new int[32768];
                Statics.field872 = new int[32768];
                class21.method266((class87) null);
                Statics.field1041 = new int[32768];
                Statics.field338 = new int[32768];
                class21.field330 = 0;
                class21.field337 = "";
                class21.field341 = "";
                class21.field324 = false;
                if (Statics.field29.field216) {
                    class139.field2379 = 1;
                    Statics.field2380 = null;
                    Statics.field2381 = -1;
                    Statics.field2383 = -1;
                    Statics.field89 = 0;
                    Statics.field1543 = false;
                    Statics.field2382 = 2;
                } else {
                    class155 var17 = Statics.field509;
                    int var18 = var17.method2978("scape main");
                    int var19 = var17.method2979(var18, "");
                    class139.field2379 = 1;
                    Statics.field2380 = var17;
                    Statics.field2381 = var18;
                    Statics.field2383 = var19;
                    Statics.field89 = 255;
                    Statics.field1543 = false;
                    Statics.field2382 = 2;
                }
                class154.method126(false);
                Statics.field320 = true;
                Statics.field319.method1657(0, 0);
                Statics.field322.method1657(382, 0);
                Statics.field321.method1730(382 - Statics.field321.field1504 / 2, 18);
            }
        } else {
            class21.method749();
        }
        field487 = arg0;
    }

    @ObfuscatedName("client.g(I)V")
    public void method274() {
        if (field487 == 1000) {
            return;
        }
        long var1 = class121.method2318();
        int var3 = (int) (var1 - Statics.field1299);
        Statics.field1299 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class154.field2559 += var3;
        boolean var4;
        if (class154.field2568 == 0 && class154.field2558 == 0 && class154.field2566 == 0 && class154.field2561 == 0) {
            var4 = true;
        } else if (Statics.field2577 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class154.field2559 > 30000) {
                        throw new IOException();
                    }
                    while (class154.field2558 < 20 && class154.field2561 > 0) {
                        class156 var5 = (class156) class154.field2573.method3226();
                        class127 var6 = new class127(4);
                        var6.method2590(1);
                        var6.method2404((int) var5.field2826);
                        Statics.field2577.method1352(var6.field2056, 0, 4);
                        class154.field2562.method3228(var5, var5.field2826);
                        class154.field2561--;
                        class154.field2558++;
                    }
                    while (class154.field2568 < 20 && class154.field2566 > 0) {
                        class156 var7 = (class156) class154.field2565.method3211();
                        class127 var8 = new class127(4);
                        var8.method2590(0);
                        var8.method2404((int) var7.field2826);
                        Statics.field2577.method1352(var8.field2056, 0, 4);
                        var7.method3223();
                        class154.field2567.method3228(var7, var7.field2826);
                        class154.field2566--;
                        class154.field2568++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2577.method1362();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class154.field2559 = 0;
                        byte var11 = 0;
                        if (Statics.field192 == null) {
                            var11 = 8;
                        } else if (class154.field2570 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class154.field2569.field2051;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2577.method1351(class154.field2569.field2056, class154.field2569.field2051, var12);
                            if (class154.field2563 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class154.field2569.field2056[class154.field2569.field2051 + var13] ^= class154.field2563;
                                }
                            }
                            class154.field2569.field2051 += var12;
                            if (class154.field2569.field2051 < var11) {
                                break;
                            }
                            if (Statics.field192 == null) {
                                class154.field2569.field2051 = 0;
                                int var14 = class154.field2569.method2416();
                                int var15 = class154.field2569.method2394();
                                int var16 = class154.field2569.method2416();
                                int var17 = class154.field2569.method2455();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class154.field2562.method3232(var18);
                                Statics.field1286 = true;
                                if (var20 == null) {
                                    var20 = (class156) class154.field2567.method3232(var18);
                                    Statics.field1286 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field192 = var20;
                                Statics.field2052 = new class127(var17 + var21 + Statics.field192.field2591);
                                Statics.field2052.method2590(var16);
                                Statics.field2052.method2385(var17);
                                class154.field2570 = 8;
                                class154.field2569.field2051 = 0;
                            } else if (class154.field2570 == 0) {
                                if (class154.field2569.field2056[0] == -1) {
                                    class154.field2570 = 1;
                                    class154.field2569.field2051 = 0;
                                } else {
                                    Statics.field192 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2052.field2056.length - Statics.field192.field2591;
                            int var23 = 512 - class154.field2570;
                            if (var23 > var22 - Statics.field2052.field2051) {
                                var23 = var22 - Statics.field2052.field2051;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2577.method1351(Statics.field2052.field2056, Statics.field2052.field2051, var23);
                            if (class154.field2563 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2052.field2056[Statics.field2052.field2051 + var24] ^= class154.field2563;
                                }
                            }
                            Statics.field2052.field2051 += var23;
                            class154.field2570 += var23;
                            if (Statics.field2052.field2051 == var22) {
                                if (Statics.field192.field2826 == 16711935L) {
                                    Statics.field2572 = Statics.field2052;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class155 var26 = class154.field2560[var25];
                                        if (var26 != null) {
                                            Statics.field2572.field2051 = var25 * 8 + 5;
                                            int var27 = Statics.field2572.method2455();
                                            int var28 = Statics.field2572.method2455();
                                            var26.method3055(var27, var28);
                                        }
                                    }
                                } else {
                                    class154.field2571.reset();
                                    class154.field2571.update(Statics.field2052.field2056, 0, var22);
                                    int var29 = (int) class154.field2571.getValue();
                                    if (Statics.field192.field2592 != var29) {
                                        try {
                                            Statics.field2577.method1350();
                                        } catch (Exception var35) {
                                        }
                                        class154.field2564++;
                                        Statics.field2577 = null;
                                        class154.field2563 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class154.field2564 = 0;
                                    class154.field2576 = 0;
                                    Statics.field192.field2595.method3061((int) (Statics.field192.field2826 & 0xFFFFL), Statics.field2052.field2056, (Statics.field192.field2826 & 0xFF0000L) == 16711680L, Statics.field1286);
                                }
                                Statics.field192.method3282();
                                if (Statics.field1286) {
                                    class154.field2558--;
                                } else {
                                    class154.field2568--;
                                }
                                class154.field2570 = 0;
                                Statics.field192 = null;
                                Statics.field2052 = null;
                            } else {
                                if (class154.field2570 != 512) {
                                    break;
                                }
                                class154.field2570 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2577.method1350();
                } catch (Exception var34) {
                }
                class154.field2576++;
                Statics.field2577 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method382();
        }
    }

    @ObfuscatedName("client.s(I)V")
    public void method382() {
        if (class154.field2564 >= 4) {
            this.method1388("js5crc");
            field487 = 1000;
            return;
        }
        if (class154.field2576 >= 4) {
            if (field487 <= 5) {
                this.method1388("js5io");
                field487 = 1000;
                return;
            }
            field639 = 3000;
            class154.field2576 = 3;
        }
        if (--field639 + 1 > 0) {
            return;
        }
        try {
            if (field507 == 0) {
                Statics.field873 = Statics.field362.method1464(Statics.field1835, Statics.field411);
                field507++;
            }
            if (field507 == 1) {
                if (Statics.field873.field1433 == 2) {
                    this.method276(-1);
                    return;
                }
                if (Statics.field873.field1433 == 1) {
                    field507++;
                }
            }
            if (field507 == 2) {
                Statics.field1747 = new class70((Socket) Statics.field873.field1435, Statics.field362);
                class127 var1 = new class127(5);
                var1.method2590(15);
                var1.method2385(39);
                Statics.field1747.method1352(var1.field2056, 0, 5);
                field507++;
                Statics.field99 = class121.method2318();
            }
            if (field507 == 3) {
                if (field487 <= 5 || Statics.field1747.method1362() > 0) {
                    int var2 = Statics.field1747.method1349();
                    if (var2 != 0) {
                        this.method276(var2);
                        return;
                    }
                    field507++;
                } else if (class121.method2318() - Statics.field99 > 30000L) {
                    this.method276(-2);
                    return;
                }
            }
            if (field507 == 4) {
                class154.method671(Statics.field1747, field487 > 20);
                Statics.field873 = null;
                Statics.field1747 = null;
                field507 = 0;
                field510 = 0;
            }
        } catch (IOException var4) {
            this.method276(-3);
        }
    }

    @ObfuscatedName("client.n(II)V")
    public void method276(int arg0) {
        Statics.field873 = null;
        Statics.field1747 = null;
        field507 = 0;
        if (Statics.field59 == Statics.field411) {
            Statics.field411 = Statics.field207;
        } else {
            Statics.field411 = Statics.field59;
        }
        field510++;
        if (field510 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field487 <= 5) {
                this.method1388("js5connect_full");
                field487 = 1000;
            } else {
                field639 = 3000;
            }
        } else if (field510 >= 2 && arg0 == 6) {
            this.method1388("js5connect_outofdate");
            field487 = 1000;
        } else if (field510 >= 4) {
            if (field487 <= 5) {
                this.method1388("js5connect");
                field487 = 1000;
            } else {
                field639 = 3000;
            }
        }
    }

    @ObfuscatedName("r.x(I)V")
    public static void method248() {
        if (field506 == 0) {
            Statics.field1245 = new class95(4, 104, 104, class9.field149);
            for (int var0 = 0; var0 < 4; var0++) {
                field537[var0] = new class130(104, 104);
            }
            Statics.field1573 = new class86(512, 512);
            class21.field335 = class135.field2131;
            class21.field315 = 5;
            field506 = 20;
        } else if (field506 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1800[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1851(var1, 500, 800, 512, 334);
            class21.field335 = class135.field2354;
            class21.field315 = 10;
            field506 = 30;
        } else if (field506 == 30) {
            Statics.field2365 = method805(0, false, true, true);
            Statics.field131 = method805(1, false, true, true);
            Statics.field2395 = method805(2, true, false, true);
            Statics.field278 = method805(3, false, true, true);
            Statics.field1193 = method805(4, false, true, true);
            Statics.field1045 = method805(5, true, true, true);
            Statics.field509 = method805(6, true, true, false);
            Statics.field157 = method805(7, false, true, true);
            Statics.field950 = method805(8, false, true, true);
            Statics.field739 = method805(9, false, true, true);
            Statics.field1817 = method805(10, false, true, true);
            Statics.field1292 = method805(11, false, true, true);
            Statics.field386 = method805(12, false, true, true);
            Statics.field764 = method805(13, true, false, true);
            Statics.field2594 = method805(14, false, true, false);
            Statics.field1043 = method805(15, false, true, true);
            class21.field335 = class135.field2133;
            class21.field315 = 20;
            field506 = 40;
        } else if (field506 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2365.method3068() * 4 / 100;
            int var8 = var7 + Statics.field131.method3068() * 4 / 100;
            int var9 = var8 + Statics.field2395.method3068() * 2 / 100;
            int var10 = var9 + Statics.field278.method3068() * 2 / 100;
            int var11 = var10 + Statics.field1193.method3068() * 6 / 100;
            int var12 = var11 + Statics.field1045.method3068() * 4 / 100;
            int var13 = var12 + Statics.field509.method3068() * 2 / 100;
            int var14 = var13 + Statics.field157.method3068() * 60 / 100;
            int var15 = var14 + Statics.field950.method3068() * 2 / 100;
            int var16 = var15 + Statics.field739.method3068() * 2 / 100;
            int var17 = var16 + Statics.field1817.method3068() * 2 / 100;
            int var18 = var17 + Statics.field1292.method3068() * 2 / 100;
            int var19 = var18 + Statics.field386.method3068() * 2 / 100;
            int var20 = var19 + Statics.field764.method3068() * 2 / 100;
            int var21 = var20 + Statics.field2594.method3068() * 2 / 100;
            int var22 = var21 + Statics.field1043.method3068() * 2 / 100;
            if (var22 == 100) {
                class21.field335 = class135.field2335;
                class21.field315 = 30;
                field506 = 45;
            } else {
                if (var22 != 0) {
                    class21.field335 = class135.field2248 + var22 + "%";
                }
                class21.field315 = 30;
            }
        } else if (field506 == 45) {
            class52.method807(22050, !field643, 2);
            class142 var23 = new class142();
            var23.method2769(9, 128);
            Statics.field2579 = class52.method2191(Statics.field362, Statics.field869, 0, 22050);
            Statics.field2579.method1144(var23);
            class155 var24 = Statics.field1043;
            class155 var25 = Statics.field2594;
            class155 var26 = Statics.field1193;
            Statics.field2377 = var24;
            Statics.field2378 = var25;
            Statics.field2013 = var26;
            Statics.field68 = var23;
            Statics.field287 = class52.method2191(Statics.field362, Statics.field869, 1, 2048);
            Statics.field1216 = new class46();
            Statics.field287.method1144(Statics.field1216);
            Statics.field1317 = new class62(22050, Statics.field1117);
            class21.field335 = class135.field2136;
            class21.field315 = 35;
            field506 = 50;
        } else if (field506 == 50) {
            int var27 = 0;
            if (Statics.field277 == null) {
                Statics.field277 = class84.method41(Statics.field950, Statics.field764, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field215 == null) {
                Statics.field215 = class84.method41(Statics.field950, Statics.field764, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field211 == null) {
                Statics.field211 = class84.method41(Statics.field950, Statics.field764, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field335 = class135.field2137 + var27 * 100 / 3 + "%";
                class21.field315 = 40;
            } else {
                Statics.field1188 = new class152(true);
                class21.field335 = class135.field2138;
                class21.field315 = 40;
                field506 = 60;
            }
        } else if (field506 == 60) {
            int var28 = class21.method2326(Statics.field1817, Statics.field950);
            byte var29 = 6;
            if (var28 < var29) {
                class21.field335 = class135.field2134 + var28 * 100 / var29 + "%";
                class21.field315 = 50;
            } else {
                class21.field335 = class135.field2139;
                class21.field315 = 50;
                method222(5);
                field506 = 70;
            }
        } else if (field506 == 70) {
            if (Statics.field2395.method2967()) {
                class37.method22(Statics.field2395);
                class155 var31 = Statics.field2395;
                Statics.field877 = var31;
                class155 var32 = Statics.field2395;
                class155 var33 = Statics.field157;
                Statics.field935 = var32;
                Statics.field924 = var33;
                Statics.field929 = Statics.field935.method2973(3);
                class155 var34 = Statics.field2395;
                class155 var35 = Statics.field157;
                boolean var36 = field643;
                Statics.field810 = var34;
                Statics.field857 = var35;
                class32.field828 = var36;
                class155 var37 = Statics.field2395;
                class155 var38 = Statics.field157;
                Statics.field778 = var37;
                Statics.field775 = var38;
                class40.method24(Statics.field2395, Statics.field157, field661, Statics.field277);
                class34.method2961(Statics.field2395, Statics.field2365, Statics.field131);
                class155 var39 = Statics.field2395;
                class155 var40 = Statics.field157;
                Statics.field907 = var39;
                Statics.field2828 = var40;
                class155 var41 = Statics.field2395;
                Statics.field957 = var41;
                class42.method159(Statics.field2395);
                class155 var42 = Statics.field278;
                class155 var43 = Statics.field157;
                class155 var44 = Statics.field950;
                class155 var45 = Statics.field764;
                Statics.field2611 = var42;
                Statics.field197 = var43;
                Statics.field2605 = var44;
                Statics.field2612 = var45;
                Statics.field2830 = new class159[Statics.field2611.method3021()][];
                Statics.field2723 = new boolean[Statics.field2611.method3021()];
                class155 var46 = Statics.field2395;
                Statics.field1032 = var46;
                class155 var47 = Statics.field2395;
                Statics.field967 = var47;
                class21.field335 = class135.field2142;
                class21.field315 = 60;
                field506 = 80;
            } else {
                class21.field335 = class135.field2141 + Statics.field2395.method3059() + "%";
                class21.field315 = 60;
            }
        } else if (field506 == 80) {
            int var48 = 0;
            if (Statics.field1290 == null) {
                Statics.field1290 = Statics.method226(Statics.field950, "compass", "");
            } else {
                var48++;
            }
            if (Statics.field881 == null) {
                class155 var49 = Statics.field950;
                int var50 = var49.method2978("mapedge");
                int var51 = var49.method2979(var50, "");
                class86 var52;
                if (class84.method188(var49, var50, var51)) {
                    var52 = class84.method2681();
                } else {
                    var52 = null;
                }
                Statics.field881 = var52;
            } else {
                var48++;
            }
            if (Statics.field244 == null) {
                Statics.field244 = class84.method167(Statics.field950, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field212 == null) {
                Statics.field212 = class84.method183(Statics.field950, "mapfunction", "");
            } else {
                var48++;
            }
            if (Statics.field264 == null) {
                Statics.field264 = class84.method183(Statics.field950, "hitmarks", "");
            } else {
                var48++;
            }
            if (Statics.field2374 == null) {
                Statics.field2374 = class84.method183(Statics.field950, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field751 == null) {
                Statics.field751 = class84.method183(Statics.field950, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field1937 == null) {
                Statics.field1937 = class84.method183(Statics.field950, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field376 == null) {
                Statics.field376 = class84.method183(Statics.field950, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field98 == null) {
                Statics.field98 = class84.method183(Statics.field950, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field64 == null) {
                Statics.field64 = class84.method183(Statics.field950, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field288 == null) {
                Statics.field288 = class84.method167(Statics.field950, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field163 == null) {
                Statics.field163 = class84.method167(Statics.field950, "mod_icons", "");
            } else {
                var48++;
            }
            if (Statics.field1215 == null) {
                Statics.field1215 = class84.method806(Statics.field950, "mapback", "");
            } else {
                var48++;
            }
            if (var48 < 14) {
                class21.field335 = class135.field2143 + var48 * 100 / 14 + "%";
                class21.field315 = 70;
            } else {
                Statics.field2853 = Statics.field163;
                Statics.field881.method1651();
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 41.0D) - 20;
                for (int var58 = 0; var58 < Statics.field212.length; var58++) {
                    Statics.field212[var58].method1650(var54 + var57, var55 + var57, var56 + var57);
                }
                Statics.field244[0].method1739(var54 + var57, var55 + var57, var56 + var57);
                Statics.field1288 = new int[33];
                Statics.field1816 = new int[33];
                Statics.field1295 = new int[151];
                Statics.field213 = new int[151];
                for (int var59 = 0; var59 < 33; var59++) {
                    int var60 = 999;
                    int var61 = 0;
                    for (int var62 = 0; var62 < 34; var62++) {
                        if (Statics.field1215.field1503[Statics.field1215.field1504 * var59 + var62] == 0) {
                            if (var60 == 999) {
                                var60 = var62;
                            }
                        } else if (var60 != 999) {
                            var61 = var62;
                            break;
                        }
                    }
                    Statics.field1288[var59] = var60;
                    Statics.field1816[var59] = var61 - var60;
                }
                for (int var63 = 5; var63 < 156; var63++) {
                    int var64 = 999;
                    int var65 = 0;
                    for (int var66 = 25; var66 < 172; var66++) {
                        if (Statics.field1215.field1503[Statics.field1215.field1504 * var63 + var66] == 0 && var66 > 34 || var63 > 34) {
                            if (var64 == 999) {
                                var64 = var66;
                            }
                        } else if (var64 != 999) {
                            var65 = var66;
                            break;
                        }
                    }
                    Statics.field1295[var63 - 5] = var64 - 25;
                    Statics.field213[var63 - 5] = var65 - var64;
                }
                class21.field335 = class135.field2266;
                class21.field315 = 70;
                field506 = 90;
            }
        } else if (field506 == 90) {
            if (Statics.field739.method2967()) {
                class110 var67 = new class110(Statics.field739, Statics.field950, 20, 0.8D, field643 ? 64 : 128);
                class104.method2084(var67);
                class104.method2085(0.8D);
                class21.field335 = class135.field2146;
                class21.field315 = 90;
                field506 = 110;
            } else {
                class21.field335 = class135.field2361 + Statics.field739.method3059() + "%";
                class21.field315 = 90;
            }
        } else if (field506 == 110) {
            Statics.field294 = new class16();
            Statics.field362.method1463(Statics.field294, 10);
            class21.field335 = class135.field2245;
            class21.field315 = 94;
            field506 = 120;
        } else if (field506 == 120) {
            if (Statics.field1817.method2981("huffman", "")) {
                class120 var68 = new class120(Statics.field1817.method3031("huffman", ""));
                Statics.field2842 = var68;
                class21.field335 = class135.field2215;
                class21.field315 = 96;
                field506 = 130;
            } else {
                class21.field335 = class135.field2270 + "%";
                class21.field315 = 96;
            }
        } else if (field506 == 130) {
            if (!Statics.field278.method2967()) {
                class21.field335 = class135.field2150 + Statics.field278.method3059() * 4 / 5 + "%";
                class21.field315 = 100;
            } else if (!Statics.field386.method2967()) {
                class21.field335 = class135.field2150 + (80 + Statics.field386.method3059() / 6) + "%";
                class21.field315 = 100;
            } else if (Statics.field764.method2967()) {
                class21.field335 = class135.field2151;
                class21.field315 = 100;
                field506 = 140;
            } else {
                class21.field335 = class135.field2150 + (96 + Statics.field764.method3059() / 20) + "%";
                class21.field315 = 100;
            }
        } else if (field506 == 140) {
            method222(10);
        }
    }

    @ObfuscatedName("ad.o(IZZZB)Leu;")
    public static class155 method805(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1445 != null) {
            var4 = new class71(arg0, class82.field1445, Statics.field1841[arg0], 1000000);
        }
        return new class155(var4, Statics.field93, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ac.l(B)V")
    public static final void method673() {
        try {
            if (field511 == 0) {
                if (Statics.field1209 != null) {
                    Statics.field1209.method1350();
                    Statics.field1209 = null;
                }
                Statics.field27 = null;
                field530 = false;
                field512 = 0;
                field511 = 1;
            }
            if (field511 == 1) {
                if (Statics.field27 == null) {
                    Statics.field27 = Statics.field362.method1464(Statics.field1835, Statics.field411);
                }
                if (Statics.field27.field1433 == 2) {
                    throw new IOException();
                }
                if (Statics.field27.field1433 == 1) {
                    Statics.field1209 = new class70((Socket) Statics.field27.field1435, Statics.field362);
                    Statics.field27 = null;
                    field511 = 2;
                }
            }
            if (field511 == 2) {
                field519.field2051 = 0;
                field519.method2590(14);
                Statics.field1209.method1352(field519.field2056, 0, 1);
                field521.field2051 = 0;
                field511 = 3;
            }
            if (field511 == 3) {
                if (Statics.field2579 != null) {
                    Statics.field2579.method1141();
                }
                if (Statics.field287 != null) {
                    Statics.field287.method1141();
                }
                int var0 = Statics.field1209.method1349();
                if (Statics.field2579 != null) {
                    Statics.field2579.method1141();
                }
                if (Statics.field287 != null) {
                    Statics.field287.method1141();
                }
                if (var0 != 0) {
                    method38(var0);
                    return;
                }
                field521.field2051 = 0;
                field511 = 5;
            }
            if (field511 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field519.field2051 = 0;
                field519.method2590(10);
                field519.method2385(var1[0]);
                field519.method2385(var1[1]);
                field519.method2385(var1[2]);
                field519.method2385(var1[3]);
                field519.method2398(0L);
                field519.method2520(class21.field341);
                field519.method2485(class6.field102, class6.field94);
                field520.field2051 = 0;
                if (field487 == 40) {
                    field520.method2590(18);
                } else {
                    field520.method2590(16);
                }
                field520.method2576(0);
                int var2 = field520.field2051;
                field520.method2385(39);
                field520.method2579(field519.field2056, 0, field519.field2051);
                int var3 = field520.field2051;
                field520.method2520(class21.field337);
                field520.method2590(field643 ? 1 : 0);
                class82.method1219(field520);
                class127 var4 = new class127(Statics.field1188.method2952());
                Statics.field1188.method2953(var4);
                field520.method2579(var4.field2056, 0, var4.field2056.length);
                field520.method2385(Statics.field2365.field2554);
                field520.method2385(Statics.field131.field2554);
                field520.method2385(Statics.field2395.field2554);
                field520.method2385(Statics.field278.field2554);
                field520.method2385(Statics.field1193.field2554);
                field520.method2385(Statics.field1045.field2554);
                field520.method2385(Statics.field509.field2554);
                field520.method2385(Statics.field157.field2554);
                field520.method2385(Statics.field950.field2554);
                field520.method2385(Statics.field739.field2554);
                field520.method2385(Statics.field1817.field2554);
                field520.method2385(Statics.field1292.field2554);
                field520.method2385(Statics.field386.field2554);
                field520.method2385(Statics.field764.field2554);
                field520.method2385(Statics.field2594.field2554);
                field520.method2385(Statics.field1043.field2554);
                field520.method2477(var1, var3, field520.field2051);
                field520.method2392(field520.field2051 - var2);
                Statics.field1209.method1352(field520.field2056, 0, field520.field2051);
                field519.method2277(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field521.method2277(var1);
                field511 = 6;
            }
            if (field511 == 6 && Statics.field1209.method1362() > 0) {
                int var6 = Statics.field1209.method1349();
                if (var6 == 21 && field487 == 20) {
                    field511 = 7;
                } else if (var6 == 2) {
                    field511 = 9;
                } else if (var6 == 15 && field487 == 40) {
                    field519.field2051 = 0;
                    field521.field2051 = 0;
                    field523 = -1;
                    field589 = -1;
                    field498 = -1;
                    field529 = -1;
                    field522 = 0;
                    field524 = 0;
                    field496 = 0;
                    field620 = 0;
                    field619 = false;
                    field711 = 0;
                    field713 = 0;
                    for (int var7 = 0; var7 < field662.length; var7++) {
                        if (field662[var7] != null) {
                            field662[var7].field452 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field516.length; var8++) {
                        if (field516[var8] != null) {
                            field516[var8].field452 = -1;
                        }
                    }
                    class19.method1504();
                    method222(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field680[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field513 < 1) {
                    field513++;
                    field511 = 0;
                } else {
                    method38(var6);
                    return;
                }
            }
            if (field511 == 7 && Statics.field1209.method1362() > 0) {
                field514 = (Statics.field1209.method1349() + 3) * 60;
                field511 = 8;
            }
            if (field511 == 8) {
                field512 = 0;
                class21.method1807(class135.field2359, class135.field2316, field514 / 60 + class135.field2254);
                if (--field514 <= 0) {
                    field511 = 0;
                }
            } else {
                if (field511 == 9 && Statics.field1209.method1362() >= 8) {
                    field644 = Statics.field1209.method1349();
                    field645 = Statics.field1209.method1349() == 1;
                    field709 = Statics.field1209.method1349();
                    field709 <<= 0x8;
                    field709 += Statics.field1209.method1349();
                    field635 = Statics.field1209.method1349();
                    Statics.field1209.method1351(field521.field2056, 0, 1);
                    field521.field2051 = 0;
                    field523 = field521.method2274();
                    Statics.field1209.method1351(field521.field2056, 0, 2);
                    field521.field2051 = 0;
                    field522 = field521.method2394();
                    if (field635 == 1) {
                        try {
                            client var10 = Statics.field478;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var16) {
                        }
                    } else {
                        try {
                            client var12 = Statics.field478;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var15) {
                        }
                    }
                    field511 = 10;
                }
                if (field511 != 10) {
                    field512++;
                    if (field512 > 2000) {
                        if (field513 < 1) {
                            if (Statics.field59 == Statics.field411) {
                                Statics.field411 = Statics.field207;
                            } else {
                                Statics.field411 = Statics.field59;
                            }
                            field513++;
                            field511 = 0;
                        } else {
                            method38(-3);
                        }
                    }
                } else if (Statics.field1209.method1362() >= field522) {
                    field521.field2051 = 0;
                    Statics.field1209.method1351(field521.field2056, 0, field522);
                    method125();
                    Statics.field1360 = -1;
                    method538(false);
                    field523 = -1;
                }
            }
        } catch (IOException var17) {
            if (field513 < 1) {
                if (Statics.field59 == Statics.field411) {
                    Statics.field411 = Statics.field207;
                } else {
                    Statics.field411 = Statics.field59;
                }
                field513++;
                field511 = 0;
            } else {
                method38(-2);
            }
        }
    }

    @ObfuscatedName("g.u(I)V")
    public static void method125() {
        field490 = -1L;
        field493 = -1;
        Statics.field294.field270 = 0;
        Statics.field900 = true;
        field494 = true;
        field701 = -1L;
        class182.method2725();
        field519.field2051 = 0;
        field521.field2051 = 0;
        field523 = -1;
        field589 = -1;
        field498 = -1;
        field529 = -1;
        field524 = 0;
        field496 = 0;
        field526 = 0;
        field668 = 0;
        field620 = 0;
        field619 = false;
        class77.method1382(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field624[var0] = null;
        }
        field692 = 0;
        field631 = 0;
        field633 = false;
        field717 = 0;
        field541 = (int) (Math.random() * 100.0D) - 50;
        field477 = (int) (Math.random() * 110.0D) - 55;
        field545 = (int) (Math.random() * 80.0D) - 40;
        field548 = (int) (Math.random() * 120.0D) - 60;
        field550 = (int) (Math.random() * 30.0D) - 20;
        field562 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field711 = 0;
        field704 = -1;
        field713 = 0;
        field710 = 0;
        field685 = 0;
        field581 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field662[var1] = null;
            field602[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field516[var2] = null;
        }
        Statics.field368 = field662[2047] = new class3();
        field527.method3240();
        field614.method3240();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field611[var3][var4][var5] = null;
                }
            }
        }
        field737 = new class177();
        field732 = 0;
        field729 = 0;
        field733 = 0;
        for (int var6 = 0; var6 < Statics.field1036; var6++) {
            class42 var7 = (class42) class42.field1037.method3188((long) var6);
            class42 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field1040.method2964(16, var6);
                class42 var10 = new class42();
                if (var9 != null) {
                    var10.method882(new class127(var9));
                }
                class42.field1037.method3190(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null && var8.field1038 == 0) {
                class160.field2739[var6] = 0;
                class160.field2742[var6] = 0;
            }
        }
        for (int var12 = 0; var12 < field671.length; var12++) {
            field671[var12] = -1;
        }
        if (field637 != -1) {
            class159.method217(field637);
        }
        for (class4 var13 = (class4) field597.method3226(); var13 != null; var13 = (class4) field597.method3231()) {
            method588(var13, true);
        }
        field637 = -1;
        field597 = new class175(8);
        field570 = null;
        field619 = false;
        field620 = 0;
        field691.method3167((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var14 = 0; var14 < 8; var14++) {
            field660[var14] = null;
            field706[var14] = false;
        }
        class19.method1504();
        field488 = true;
        for (int var15 = 0; var15 < 100; var15++) {
            field680[var15] = true;
        }
        field702 = null;
        Statics.field2700 = 0;
        Statics.field34 = null;
    }

    @ObfuscatedName("k.z(II)V")
    public static void method38(int arg0) {
        if (arg0 == -3) {
            class21.method1807(class135.field2155, class135.field2156, class135.field2157);
        } else if (arg0 == -2) {
            class21.method1807(class135.field2144, class135.field2235, class135.field2349);
        } else if (arg0 == -1) {
            class21.method1807(class135.field2222, class135.field2162, class135.field2163);
        } else if (arg0 == 3) {
            class21.method1807(class135.field2164, class135.field2122, class135.field2312);
        } else if (arg0 == 4) {
            class21.method1807(class135.field2167, class135.field2177, class135.field2169);
        } else if (arg0 == 5) {
            class21.method1807(class135.field2170, class135.field2171, class135.field2172);
        } else if (arg0 == 6) {
            class21.method1807(class135.field2173, class135.field2240, class135.field2132);
        } else if (arg0 == 7) {
            class21.method1807(class135.field2176, class135.field2161, class135.field2247);
        } else if (arg0 == 8) {
            class21.method1807(class135.field2185, class135.field2180, class135.field2181);
        } else if (arg0 == 9) {
            class21.method1807(class135.field2182, class135.field2183, class135.field2184);
        } else if (arg0 == 10) {
            class21.method1807(class135.field2152, class135.field2306, class135.field2187);
        } else if (arg0 == 11) {
            class21.method1807(class135.field2188, class135.field2189, class135.field2190);
        } else if (arg0 == 12) {
            class21.method1807(class135.field2194, class135.field2192, class135.field2193);
        } else if (arg0 == 13) {
            class21.method1807(class135.field2199, class135.field2195, class135.field2196);
        } else if (arg0 == 14) {
            class21.method1807(class135.field2330, class135.field2198, class135.field2130);
        } else if (arg0 == 16) {
            class21.method1807(class135.field2200, class135.field2127, class135.field2166);
        } else if (arg0 == 17) {
            class21.method1807(class135.field2203, class135.field2341, class135.field2257);
        } else if (arg0 == 18) {
            class21.method1807(class135.field2206, class135.field2207, class135.field2208);
        } else if (arg0 == 19) {
            class21.method1807(class135.field2209, class135.field2145, class135.field2211);
        } else if (arg0 == 20) {
            class21.method1807(class135.field2212, class135.field2213, class135.field2214);
        } else if (arg0 == 22) {
            class21.method1807(class135.field2216, class135.field2205, class135.field2217);
        } else if (arg0 == 23) {
            class21.method1807(class135.field2329, class135.field2219, class135.field2220);
        } else if (arg0 == 24) {
            class21.method1807(class135.field2221, class135.field2287, class135.field2223);
        } else if (arg0 == 25) {
            class21.method1807(class135.field2224, class135.field2284, class135.field2342);
        } else if (arg0 == 26) {
            class21.method1807(class135.field2227, class135.field2228, class135.field2298);
        } else if (arg0 == 27) {
            class21.method1807(class135.field2230, class135.field2231, class135.field2232);
        } else if (arg0 == 31) {
            class21.method1807(class135.field2239, class135.field2165, class135.field2186);
        } else if (arg0 == 32) {
            class21.method1807(class135.field2242, class135.field2243, class135.field2244);
        } else if (arg0 == 37) {
            class21.method1807(class135.field2174, class135.field2140, class135.field2271);
        } else if (arg0 == 38) {
            class21.method1807(class135.field2327, class135.field2249, class135.field2250);
        } else if (arg0 == 55) {
            class21.method1807(class135.field2201, class135.field2252, class135.field2253);
        } else {
            class21.method1807(class135.field2210, class135.field2255, class135.field2256);
        }
        method222(10);
    }

    @ObfuscatedName("j.d(B)V")
    public static final void method20() {
        if (Statics.field1209 != null) {
            Statics.field1209.method1350();
            Statics.field1209 = null;
        }
        method2150();
        Statics.field1245.method1816();
        for (int var0 = 0; var0 < 4; var0++) {
            field537[var0].method2661();
        }
        System.gc();
        class139.field2379 = 1;
        Statics.field2380 = null;
        Statics.field2381 = -1;
        Statics.field2383 = -1;
        Statics.field89 = 0;
        Statics.field1543 = false;
        Statics.field2382 = 2;
        field658 = -1;
        field714 = false;
        for (class7 var1 = (class7) class7.field112.method3246(); var1 != null; var1 = (class7) class7.field112.method3248()) {
            if (var1.field109 != null) {
                Statics.field1216.method1088(var1.field109);
                var1.field109 = null;
            }
            if (var1.field122 != null) {
                Statics.field1216.method1088(var1.field122);
                var1.field122 = null;
            }
        }
        class7.field112.method3240();
        method222(10);
    }

    @ObfuscatedName("dk.m(I)V")
    public static final void method2150() {
        class37.method617();
        class33.field864.method3191();
        class36.method2176();
        class32.method730();
        class31.method42();
        class40.method3181();
        class34.field884.method3191();
        class34.field885.method3191();
        class35.field904.method3191();
        class35.field906.method3191();
        class38.method57();
        class42.method2682();
        class164.field2761.method3191();
        class159.method2672();
        ((class110) Statics.field1797).method2184();
        class5.field73.method3191();
        Statics.field2365.method2976();
        Statics.field131.method2976();
        Statics.field278.method2976();
        Statics.field1193.method2976();
        Statics.field1045.method2976();
        Statics.field509.method2976();
        Statics.field157.method2976();
        Statics.field950.method2976();
        Statics.field739.method2976();
        Statics.field1817.method2976();
        Statics.field1292.method2976();
        Statics.field386.method2976();
    }

    @ObfuscatedName("cg.f(S)V")
    public static final void method2078() {
        if (field526 > 0) {
            method20();
        } else {
            method222(40);
            Statics.field1218 = Statics.field1209;
            Statics.field1209 = null;
        }
    }

    @ObfuscatedName("ae.a(I)V")
    public static final void method561() {
        if (field496 > 1) {
            field496--;
        }
        if (field526 > 0) {
            field526--;
        }
        if (field530) {
            field530 = false;
            method2078();
            return;
        }
        if (!field619) {
            field625[0] = class135.field2345;
            field694[0] = "";
            field672[0] = 1006;
            field620 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1209 == null) {
                var1 = false;
            } else {
                label2726: {
                    try {
                        int var2 = Statics.field1209.method1362();
                        if (var2 == 0) {
                            var1 = false;
                            break label2726;
                        }
                        if (field523 == -1) {
                            Statics.field1209.method1351(field521.field2056, 0, 1);
                            field521.field2051 = 0;
                            field523 = field521.method2274();
                            field522 = class165.field2784[field523];
                            var2--;
                        }
                        if (field522 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2726;
                            }
                            Statics.field1209.method1351(field521.field2056, 0, 1);
                            field522 = field521.field2056[0] & 0xFF;
                            var2--;
                        }
                        if (field522 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2726;
                            }
                            Statics.field1209.method1351(field521.field2056, 0, 2);
                            field521.field2051 = 0;
                            field522 = field521.method2394();
                            var2 -= 2;
                        }
                        if (var2 < field522) {
                            var1 = false;
                            break label2726;
                        }
                        field521.field2051 = 0;
                        Statics.field1209.method1351(field521.field2056, 0, field522);
                        field524 = 0;
                        field529 = field498;
                        field498 = field589;
                        field589 = field523;
                        if (field523 == 196) {
                            if (field637 != -1) {
                                int var3 = field637;
                                if (class159.method880(var3)) {
                                    method113(Statics.field2830[var3], 0);
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 107) {
                            field668 = field521.method2416();
                            if (field668 == 1) {
                                field676 = field521.method2394();
                            }
                            if (field668 >= 2 && field668 <= 6) {
                                if (field668 == 2) {
                                    field623 = 64;
                                    field504 = 64;
                                }
                                if (field668 == 3) {
                                    field623 = 0;
                                    field504 = 64;
                                }
                                if (field668 == 4) {
                                    field623 = 128;
                                    field504 = 64;
                                }
                                if (field668 == 5) {
                                    field623 = 64;
                                    field504 = 0;
                                }
                                if (field668 == 6) {
                                    field623 = 64;
                                    field504 = 128;
                                }
                                field668 = 2;
                                field500 = field521.method2394();
                                field501 = field521.method2394();
                                field502 = field521.method2416();
                            }
                            if (field668 == 10) {
                                field708 = field521.method2394();
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 31) {
                            String var4 = field521.method2473();
                            int var5 = field521.method2394();
                            byte var6 = field521.method2397();
                            boolean var7 = false;
                            if (var6 == -128) {
                                var7 = true;
                            }
                            if (var7) {
                                if (Statics.field2700 == 0) {
                                    field523 = -1;
                                    var1 = true;
                                    break label2726;
                                }
                                boolean var8 = false;
                                int var9;
                                for (var9 = 0; var9 < Statics.field2700 && (!Statics.field34[var9].field133.equals(var4) || Statics.field34[var9].field137 != var5); var9++) {
                                }
                                if (var9 < Statics.field2700) {
                                    while (var9 < Statics.field2700 - 1) {
                                        Statics.field34[var9] = Statics.field34[var9 + 1];
                                        var9++;
                                    }
                                    Statics.field2700--;
                                    Statics.field34[Statics.field2700] = null;
                                }
                            } else {
                                field521.method2473();
                                class8 var10 = new class8();
                                var10.field133 = var4;
                                var10.field130 = class149.method122(var10.field133, Statics.field210);
                                var10.field137 = var5;
                                var10.field132 = var6;
                                int var11;
                                for (var11 = Statics.field2700 - 1; var11 >= 0; var11--) {
                                    int var12 = Statics.field34[var11].field130.compareTo(var10.field133);
                                    if (var12 == 0) {
                                        Statics.field34[var11].field137 = var5;
                                        Statics.field34[var11].field132 = var6;
                                        if (var4.equals(Statics.field368.field52)) {
                                            Statics.field1487 = var6;
                                        }
                                        field669 = field495;
                                        field523 = -1;
                                        var1 = true;
                                        break label2726;
                                    }
                                    if (var12 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field2700 >= Statics.field34.length) {
                                    field523 = -1;
                                    var1 = true;
                                    break label2726;
                                }
                                for (int var13 = Statics.field2700 - 1; var13 > var11; var13--) {
                                    Statics.field34[var13 + 1] = Statics.field34[var13];
                                }
                                if (Statics.field2700 == 0) {
                                    Statics.field34 = new class8[100];
                                }
                                Statics.field34[var11 + 1] = var10;
                                Statics.field2700++;
                                if (var4.equals(Statics.field368.field52)) {
                                    Statics.field1487 = var6;
                                }
                            }
                            field669 = field495;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 81) {
                            int var14 = field521.method2437();
                            boolean var15 = field521.method2479() == 1;
                            class159 var16 = class159.method2333(var14);
                            if (var16.field2630 != var15) {
                                var16.field2630 = var15;
                                method728(var16);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 50) {
                            String var17 = field521.method2473();
                            int var18 = field521.method2479();
                            int var19 = field521.method2421();
                            if (var18 >= 1 && var18 <= 8) {
                                if (var17.equalsIgnoreCase("null")) {
                                    var17 = null;
                                }
                                field660[var18 - 1] = var17;
                                field706[var18 - 1] = var19 == 0;
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 53) {
                            String var20 = field521.method2473();
                            long var21 = (long) field521.method2394();
                            long var23 = (long) field521.method2400();
                            int var25 = field521.method2416();
                            long var26 = (var21 << 32) + var23;
                            boolean var28 = false;
                            for (int var29 = 0; var29 < 100; var29++) {
                                if (field696[var29] == var26) {
                                    var28 = true;
                                    break;
                                }
                            }
                            if (method157(var20)) {
                                var28 = true;
                            }
                            if (!var28 && field596 == 0) {
                                field696[field697] = var26;
                                field697 = (field697 + 1) % 100;
                                String var30 = class185.method3371(class148.method2668(class184.method154(field521)));
                                if (var25 == 2 || var25 == 3) {
                                    method112(7, class2.method10(1) + var20, var30);
                                } else if (var25 == 1) {
                                    method112(7, class2.method10(0) + var20, var30);
                                } else {
                                    method112(3, var20, var30);
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 183) {
                            field496 = field521.method2528() * 30;
                            field670 = field495;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 91) {
                            int var31 = field521.method2455();
                            int var32 = field521.method2389();
                            class159 var33 = class159.method2333(var31);
                            if (var33 != null && var33.field2620 == 0) {
                                if (var32 > var33.field2634 - var33.field2628) {
                                    var32 = var33.field2634 - var33.field2628;
                                }
                                if (var32 < 0) {
                                    var32 = 0;
                                }
                                if (var33.field2632 != var32) {
                                    var33.field2632 = var32;
                                    method728(var33);
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 244) {
                            int var34 = field521.method2441();
                            int var35 = field521.method2438();
                            class159 var36 = class159.method2333(var35);
                            if (var36.field2650 != 1 || var36.field2651 != var34) {
                                var36.field2650 = 1;
                                var36.field2651 = var34;
                                method728(var36);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 38) {
                            method538(true);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 0) {
                            method1343();
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 71) {
                            int var37 = field521.method2455();
                            int var38 = field521.method2394();
                            if (var37 < -70000) {
                                var38 += 32768;
                            }
                            class159 var39;
                            if (var37 >= 0) {
                                var39 = class159.method2333(var37);
                            } else {
                                var39 = null;
                            }
                            if (var39 != null) {
                                for (int var40 = 0; var40 < var39.field2720.length; var40++) {
                                    var39.field2720[var40] = 0;
                                    var39.field2721[var40] = 0;
                                }
                            }
                            class19 var41 = (class19) class19.field295.method3232((long) var38);
                            if (var41 != null) {
                                for (int var42 = 0; var42 < var41.field292.length; var42++) {
                                    var41.field292[var42] = -1;
                                    var41.field293[var42] = 0;
                                }
                            }
                            int var43 = field521.method2394();
                            for (int var44 = 0; var44 < var43; var44++) {
                                int var45 = field521.method2416();
                                if (var45 == 255) {
                                    var45 = field521.method2438();
                                }
                                int var46 = field521.method2389();
                                if (var39 != null && var44 < var39.field2720.length) {
                                    var39.field2720[var44] = var46;
                                    var39.field2721[var44] = var45;
                                }
                                class19.method107(var38, var44, var46 - 1, var45);
                            }
                            if (var39 != null) {
                                method728(var39);
                            }
                            method153();
                            field533[++field664 - 1 & 0x1F] = var38 & 0x7FFF;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 147) {
                            int var47 = field521.method2441();
                            int var48 = field521.method2441();
                            int var49 = field521.method2455();
                            int var50 = field521.method2394();
                            class159 var51 = class159.method2333(var49);
                            if (var51.field2658 != var48 || var51.field2659 != var47 || var51.field2661 != var50) {
                                var51.field2658 = var48;
                                var51.field2659 = var47;
                                var51.field2661 = var50;
                                method728(var51);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 89) {
                            int var52 = field521.method2416();
                            int var53 = field521.method2416();
                            int var54 = field521.method2416();
                            int var55 = field521.method2416();
                            field724[var52] = true;
                            field725[var52] = var53;
                            field726[var52] = var54;
                            field738[var52] = var55;
                            field728[var52] = 0;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 208) {
                            while (field521.field2051 < field522) {
                                int var56 = field521.method2416();
                                boolean var57 = (var56 & 0x1) == 1;
                                String var58 = field521.method2473();
                                String var59 = field521.method2473();
                                field521.method2473();
                                for (int var60 = 0; var60 < field733; var60++) {
                                    class11 var61 = field722[var60];
                                    if (var57) {
                                        if (var59.equals(var61.field202)) {
                                            var61.field202 = var58;
                                            var61.field199 = var59;
                                            var58 = null;
                                            break;
                                        }
                                    } else if (var58.equals(var61.field202)) {
                                        var61.field202 = var58;
                                        var61.field199 = var59;
                                        var58 = null;
                                        break;
                                    }
                                }
                                if (var58 != null && field733 < 400) {
                                    class11 var62 = new class11();
                                    field722[field733] = var62;
                                    var62.field202 = var58;
                                    var62.field199 = var59;
                                    field733++;
                                }
                            }
                            field543 = field495;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 117) {
                            String var63 = field521.method2473();
                            if (var63.endsWith(":tradereq:")) {
                                String var64 = var63.substring(0, var63.indexOf(":"));
                                boolean var65 = false;
                                if (method157(var64)) {
                                    var65 = true;
                                }
                                if (!var65 && field596 == 0) {
                                    method112(4, var64, class135.field2175);
                                }
                            } else if (var63.endsWith(":duelreq:")) {
                                String var66 = var63.substring(0, var63.indexOf(":"));
                                boolean var67 = false;
                                if (method157(var66)) {
                                    var67 = true;
                                }
                                if (!var67 && field596 == 0) {
                                    method112(8, var66, class135.field2258);
                                }
                            } else if (var63.endsWith(":chalreq:")) {
                                String var68 = var63.substring(0, var63.indexOf(":"));
                                boolean var69 = false;
                                if (method157(var68)) {
                                    var69 = true;
                                }
                                if (!var69 && field596 == 0) {
                                    String var70 = var63.substring(var63.indexOf(":") + 1, var63.length() - 9);
                                    method112(8, var68, var70);
                                }
                            } else if (var63.endsWith(":assistreq:")) {
                                String var71 = var63.substring(0, var63.indexOf(":"));
                                boolean var72 = false;
                                if (method157(var71)) {
                                    var72 = true;
                                }
                                if (!var72 && field596 == 0) {
                                    method112(10, var71, "");
                                }
                            } else if (var63.endsWith(":clan:")) {
                                String var73 = var63.substring(0, var63.indexOf(":clan:"));
                                method112(11, "", var73);
                            } else if (var63.endsWith(":trade:")) {
                                String var74 = var63.substring(0, var63.indexOf(":trade:"));
                                if (field596 == 0) {
                                    method112(12, "", var74);
                                }
                            } else if (var63.endsWith(":assist:")) {
                                String var75 = var63.substring(0, var63.indexOf(":assist:"));
                                if (field596 == 0) {
                                    method112(13, "", var75);
                                }
                            } else if (var63.endsWith(":broadcast:")) {
                                String var76 = var63.substring(0, var63.indexOf(":broadcast:"));
                                if (field596 == 0) {
                                    method112(14, "", var76);
                                }
                            } else {
                                method112(0, "", var63);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 110) {
                            Statics.field1771 = field521.method2421();
                            Statics.field100 = field521.method2416();
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 99) {
                            method153();
                            field584 = field521.method2399();
                            field670 = field495;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 239) {
                            field732 = 1;
                            field543 = field495;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 168) {
                            String var77 = field521.method2473();
                            int var78 = field521.method2527();
                            class159 var79 = class159.method2333(var78);
                            if (!var77.equals(var79.field2689)) {
                                var79.field2689 = var77;
                                method728(var79);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 145) {
                            String var80 = field521.method2473();
                            long var81 = field521.method2402();
                            long var83 = (long) field521.method2394();
                            long var85 = (long) field521.method2400();
                            int var87 = field521.method2416();
                            long var88 = (var83 << 32) + var85;
                            boolean var90 = false;
                            for (int var91 = 0; var91 < 100; var91++) {
                                if (field696[var91] == var88) {
                                    var90 = true;
                                    break;
                                }
                            }
                            if (var87 <= 1 && method157(var80)) {
                                var90 = true;
                            }
                            if (!var90 && field596 == 0) {
                                field696[field697] = var88;
                                field697 = (field697 + 1) % 100;
                                String var92 = class185.method3371(class148.method2668(class184.method154(field521)));
                                if (var87 == 2 || var87 == 3) {
                                    method263(9, class2.method10(1) + var80, var92, class147.method1520(var81));
                                } else if (var87 == 1) {
                                    method263(9, class2.method10(0) + var80, var92, class147.method1520(var81));
                                } else {
                                    method263(9, var80, var92, class147.method1520(var81));
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 23) {
                            int var93 = field521.method2455();
                            int var94 = field521.method2441();
                            int var95 = field521.method2394();
                            class159 var96 = class159.method2333(var93);
                            var96.field2662 = (var94 << 16) + var95;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 101) {
                            int var97 = field521.method2455();
                            class159 var98 = class159.method2333(var97);
                            var98.field2650 = 3;
                            var98.field2651 = Statics.field368.field36.method3159();
                            method728(var98);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 24) {
                            field521.field2051 += 28;
                            if (field521.method2453()) {
                                class116 var99 = field521;
                                int var100 = field521.field2051 - 28;
                                if (class82.field1456 != null) {
                                    try {
                                        class82.field1456.method564(0L);
                                        class82.field1456.method576(var99.field2056, var100, 24);
                                    } catch (Exception var387) {
                                    }
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 33) {
                            field673 = true;
                            Statics.field39 = field521.method2416();
                            Statics.field746 = field521.method2416();
                            Statics.field2629 = field521.method2394();
                            Statics.field1325 = field521.method2416();
                            Statics.field1291 = field521.method2416();
                            if (Statics.field1291 >= 100) {
                                int var102 = Statics.field39 * 128 + 64;
                                int var103 = Statics.field746 * 128 + 64;
                                int var104 = method2151(var102, var103, Statics.field13) - Statics.field2629;
                                int var105 = var102 - Statics.field707;
                                int var106 = var104 - Statics.field399;
                                int var107 = var103 - Statics.field1356;
                                int var108 = (int) Math.sqrt((double) (var105 * var105 + var107 * var107));
                                Statics.field1858 = (int) (Math.atan2((double) var106, (double) var108) * 325.949D) & 0x7FF;
                                Statics.field262 = (int) (Math.atan2((double) var105, (double) var107) * -325.949D) & 0x7FF;
                                if (Statics.field1858 < 128) {
                                    Statics.field1858 = 128;
                                }
                                if (Statics.field1858 > 383) {
                                    Statics.field1858 = 383;
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 241) {
                            int var109 = field522 + field521.field2051;
                            int var110 = field521.method2394();
                            int var111 = field521.method2394();
                            if (field637 != var110) {
                                field637 = var110;
                                int var112 = field637;
                                if (class159.method880(var112)) {
                                    class159[] var113 = Statics.field2830[var112];
                                    for (int var114 = 0; var114 < var113.length; var114++) {
                                        class159 var115 = var113[var114];
                                        if (var115 != null) {
                                            var115.field2705 = 0;
                                            var115.field2725 = 0;
                                        }
                                    }
                                }
                                class26.method556(field637);
                                for (int var116 = 0; var116 < 100; var116++) {
                                    field680[var116] = true;
                                }
                            }
                            while (var111-- > 0) {
                                int var117 = field521.method2455();
                                int var118 = field521.method2394();
                                int var119 = field521.method2416();
                                class4 var120 = (class4) field597.method3232((long) var117);
                                if (var120 != null && var120.field57 != var118) {
                                    method588(var120, true);
                                    var120 = null;
                                }
                                if (var120 == null) {
                                    var120 = method587(var117, var118, var119);
                                }
                                var120.field66 = true;
                            }
                            for (class4 var121 = (class4) field597.method3226(); var121 != null; var121 = (class4) field597.method3231()) {
                                if (var121.field66) {
                                    var121.field66 = false;
                                } else {
                                    method588(var121, true);
                                }
                            }
                            field677 = new class175(512);
                            while (field521.field2051 < var109) {
                                int var122 = field521.method2455();
                                int var123 = field521.method2394();
                                int var124 = field521.method2394();
                                int var125 = field521.method2455();
                                for (int var126 = var123; var126 <= var124; var126++) {
                                    long var127 = ((long) var122 << 32) + (long) var126;
                                    field677.method3228(new class171(var125), var127);
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 238) {
                            field673 = true;
                            Statics.field1807 = field521.method2416();
                            Statics.field313 = field521.method2416();
                            Statics.field2750 = field521.method2394();
                            Statics.field1033 = field521.method2416();
                            Statics.field58 = field521.method2416();
                            if (Statics.field58 >= 100) {
                                Statics.field707 = Statics.field1807 * 128 + 64;
                                Statics.field1356 = Statics.field313 * 128 + 64;
                                Statics.field399 = method2151(Statics.field707, Statics.field1356, Statics.field13) - Statics.field2750;
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 193) {
                            int var129 = field521.method2438();
                            int var130 = field521.method2394();
                            class159 var131 = class159.method2333(var129);
                            if (var131.field2650 != 2 || var131.field2651 != var130) {
                                var131.field2650 = 2;
                                var131.field2651 = var130;
                                method728(var131);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 78) {
                            class13 var132 = new class13();
                            var132.field221 = field521.method2473();
                            var132.field222 = field521.method2394();
                            int var133 = field521.method2455();
                            var132.field226 = var133;
                            method222(45);
                            Statics.field1209.method1350();
                            Statics.field1209 = null;
                            if (var132.method140() != field661) {
                                field661 = var132.method140();
                                class40.method744(var132.method140());
                            }
                            Statics.field1835 = var132.field221;
                            field480 = var132.field222;
                            field636 = var132.field226;
                            Statics.field59 = field483 == 0 ? 43594 : var132.field222 + 40000;
                            Statics.field207 = field483 == 0 ? 443 : var132.field222 + 50000;
                            Statics.field411 = Statics.field59;
                            field523 = -1;
                            var1 = false;
                            break label2726;
                        }
                        if (field523 == 70) {
                            int var134 = field521.method2389();
                            class19 var135 = (class19) class19.field295.method3232((long) var134);
                            if (var135 != null) {
                                var135.method3282();
                            }
                            field533[++field664 - 1 & 0x1F] = var134 & 0x7FFF;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 106) {
                            String var136 = field521.method2473();
                            Object[] var137 = new Object[var136.length() + 1];
                            for (int var138 = var136.length() - 1; var138 >= 0; var138--) {
                                if (var136.charAt(var138) == 's') {
                                    var137[var138 + 1] = field521.method2473();
                                } else {
                                    var137[var138 + 1] = Integer.valueOf(field521.method2455());
                                }
                            }
                            var137[0] = Integer.valueOf(field521.method2455());
                            class1 var139 = new class1();
                            var139.field15 = var137;
                            class26.method1493(var139);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 60) {
                            field711 = field521.method2416();
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 55) {
                            int var140 = field521.method2455();
                            int var141 = field521.method2394();
                            if (var140 < -70000) {
                                var141 += 32768;
                            }
                            class159 var142;
                            if (var140 >= 0) {
                                var142 = class159.method2333(var140);
                            } else {
                                var142 = null;
                            }
                            while (field521.field2051 < field522) {
                                int var143 = field521.method2409();
                                int var144 = field521.method2394();
                                int var145 = 0;
                                if (var144 != 0) {
                                    var145 = field521.method2416();
                                    if (var145 == 255) {
                                        var145 = field521.method2455();
                                    }
                                }
                                if (var142 != null && var143 >= 0 && var143 < var142.field2720.length) {
                                    var142.field2720[var143] = var144;
                                    var142.field2721[var143] = var145;
                                }
                                class19.method107(var141, var143, var144 - 1, var145);
                            }
                            if (var142 != null) {
                                method728(var142);
                            }
                            method153();
                            field533[++field664 - 1 & 0x1F] = var141 & 0x7FFF;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 143) {
                            int var146 = field521.method2394();
                            int var147 = field521.method2438();
                            class160.field2739[var146] = var147;
                            if (class160.field2742[var146] != var147) {
                                class160.field2742[var146] = var147;
                                method21(var146);
                            }
                            field646[++field632 - 1 & 0x1F] = var146;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 194) {
                            int var148 = field521.method2455();
                            int var149 = field521.method2394();
                            if (var149 == 65535) {
                                var149 = -1;
                            }
                            int var150 = field521.method2438();
                            class159 var151 = class159.method2333(var148);
                            if (var151.field2617) {
                                var151.field2722 = var149;
                                var151.field2706 = var150;
                                class40 var153 = class40.method1565(var149);
                                var151.field2658 = var153.field990;
                                var151.field2659 = var153.field1027;
                                var151.field2691 = var153.field992;
                                var151.field2656 = var153.field1021;
                                var151.field2633 = var153.field994;
                                var151.field2661 = var153.field989;
                                if (var151.field2627 > 0) {
                                    var151.field2661 = var151.field2661 * 32 / var151.field2627;
                                }
                                method728(var151);
                            } else {
                                if (var149 == -1) {
                                    var151.field2650 = 0;
                                    field523 = -1;
                                    var1 = true;
                                    break label2726;
                                }
                                class40 var152 = class40.method1565(var149);
                                var151.field2650 = 4;
                                var151.field2651 = var149;
                                var151.field2658 = var152.field990;
                                var151.field2659 = var152.field1027;
                                var151.field2661 = var152.field989 * 100 / var150;
                                method728(var151);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 35) {
                            for (int var154 = 0; var154 < class160.field2742.length; var154++) {
                                if (class160.field2742[var154] != class160.field2739[var154]) {
                                    class160.field2742[var154] = class160.field2739[var154];
                                    method21(var154);
                                    field646[++field632 - 1 & 0x1F] = var154;
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 56) {
                            field713 = field521.method2416();
                            if (field713 == 255) {
                                field713 = 0;
                            }
                            field710 = field521.method2416();
                            if (field710 == 255) {
                                field710 = 0;
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 159) {
                            method153();
                            field642 = field521.method2416();
                            field670 = field495;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 217) {
                            int var155 = field521.method2455();
                            int var156 = field521.method2431();
                            class159 var157 = class159.method2333(var155);
                            if (var157.field2654 != var156 || var156 == -1) {
                                var157.field2654 = var156;
                                var157.field2705 = 0;
                                var157.field2725 = 0;
                                method728(var157);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 167) {
                            int var158 = field521.method2527();
                            int var159 = field521.method2528();
                            if (var159 == 65535) {
                                var159 = -1;
                            }
                            int var160 = field521.method2441();
                            if (var160 == 65535) {
                                var160 = -1;
                            }
                            int var161 = field521.method2527();
                            for (int var162 = var160; var162 <= var159; var162++) {
                                long var163 = ((long) var158 << 32) + (long) var162;
                                class179 var165 = field677.method3232(var163);
                                if (var165 != null) {
                                    var165.method3282();
                                }
                                field677.method3228(new class171(var161), var163);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 116) {
                            byte var166 = field521.method2422();
                            int var167 = field521.method2441();
                            class160.field2739[var167] = var166;
                            if (class160.field2742[var167] != var166) {
                                class160.field2742[var167] = var166;
                                method21(var167);
                            }
                            field646[++field632 - 1 & 0x1F] = var167;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 20) {
                            method538(false);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 181) {
                            int var168 = field521.method2455();
                            Statics.field2482 = Statics.field362.method1459(var168);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 97) {
                            method20();
                            field523 = -1;
                            var1 = false;
                            break label2726;
                        }
                        if (field523 == 27) {
                            Statics.field412 = class138.method2170(field521.method2416());
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 233) {
                            int var169 = field521.method2479();
                            int var170 = field521.method2416();
                            int var171 = field521.method2416();
                            Statics.field13 = var169 >> 1;
                            Statics.field368.method251(var171, var170, (var169 & 0x1) == 1);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 30) {
                            String var172 = field521.method2473();
                            String var173 = class185.method3371(class148.method2668(class184.method154(field521)));
                            method112(6, var172, var173);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 188) {
                            int var174 = field521.method2419();
                            int var175 = field521.method2441();
                            int var176 = field521.method2527();
                            class4 var177 = (class4) field597.method3232((long) var176);
                            if (var177 != null) {
                                method588(var177, var177.field57 != var175);
                            }
                            method587(var176, var175, var174);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 156) {
                            int var178 = field521.method2455();
                            int var179 = field521.method2399();
                            int var180 = field521.method2431();
                            class159 var181 = class159.method2333(var178);
                            int var182 = var181.field2641 + var179;
                            int var183 = var181.field2626 + var180;
                            if (var181.field2623 != var182 || var181.field2727 != var183) {
                                var181.field2623 = var182;
                                var181.field2727 = var183;
                                method728(var181);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 29) {
                            Statics.field100 = field521.method2479();
                            Statics.field1771 = field521.method2419();
                            for (int var184 = Statics.field1771; var184 < Statics.field1771 + 8; var184++) {
                                for (int var185 = Statics.field100; var185 < Statics.field100 + 8; var185++) {
                                    if (field611[Statics.field13][var184][var185] != null) {
                                        field611[Statics.field13][var184][var185] = null;
                                        method2327(var184, var185);
                                    }
                                }
                            }
                            for (class22 var186 = (class22) field737.method3246(); var186 != null; var186 = (class22) field737.method3248()) {
                                if (var186.field352 >= Statics.field1771 && var186.field352 < Statics.field1771 + 8 && var186.field353 >= Statics.field100 && var186.field353 < Statics.field100 + 8 && Statics.field13 == var186.field351) {
                                    var186.field361 = 0;
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 14) {
                            int var187 = field521.method2527();
                            class159 var188 = class159.method2333(var187);
                            for (int var189 = 0; var189 < var188.field2720.length; var189++) {
                                var188.field2720[var189] = -1;
                                var188.field2720[var189] = 0;
                            }
                            method728(var188);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 221 || field523 == 232 || field523 == 36 || field523 == 253 || field523 == 250 || field523 == 25 || field523 == 10 || field523 == 95 || field523 == 108 || field523 == 114 || field523 == 210) {
                            method137();
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 87) {
                            int var190 = field521.method2528();
                            int var191 = field521.method2437();
                            int var192 = var190 >> 10 & 0x1F;
                            int var193 = var190 >> 5 & 0x1F;
                            int var194 = var190 & 0x1F;
                            int var195 = (var194 << 3) + (var192 << 19) + (var193 << 11);
                            class159 var196 = class159.method2333(var191);
                            if (var196.field2670 != var195) {
                                var196.field2670 = var195;
                                method728(var196);
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 22) {
                            method153();
                            int var197 = field521.method2479();
                            int var198 = field521.method2455();
                            int var199 = field521.method2421();
                            field617[var199] = var198;
                            field615[var199] = var197;
                            field613[var199] = 1;
                            for (int var200 = 0; var200 < 98; var200++) {
                                if (var198 >= class131.field2088[var200]) {
                                    field613[var199] = var200 + 2;
                                }
                            }
                            field503[++field666 - 1 & 0x1F] = var199;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 202) {
                            field605 = 0;
                            field600 = 0;
                            method2269();
                            method164();
                            for (int var201 = 0; var201 < field600; var201++) {
                                int var202 = field601[var201];
                                class25 var203 = field516[var202];
                                int var204 = field521.method2416();
                                if ((var204 & 0x1) != 0) {
                                    var203.field396 = class31.method1217(field521.method2389());
                                    var203.field423 = var203.field396.field781;
                                    var203.field469 = var203.field396.field794;
                                    var203.field427 = var203.field396.field786;
                                    var203.field428 = var203.field396.field807;
                                    var203.field449 = var203.field396.field788;
                                    var203.field442 = var203.field396.field787;
                                    var203.field424 = var203.field396.field783;
                                    var203.field464 = var203.field396.field784;
                                    var203.field426 = var203.field396.field798;
                                }
                                if ((var204 & 0x10) != 0) {
                                    int var205 = field521.method2441();
                                    if (var205 == 65535) {
                                        var205 = -1;
                                    }
                                    int var206 = field521.method2479();
                                    if (var203.field448 == var205 && var205 != -1) {
                                        int var207 = Statics.method61(var205).field897;
                                        if (var207 == 1) {
                                            var203.field425 = 0;
                                            var203.field450 = 0;
                                            var203.field451 = var206;
                                            var203.field470 = 0;
                                        }
                                        if (var207 == 2) {
                                            var203.field470 = 0;
                                        }
                                    } else if (var205 == -1 || var203.field448 == -1 || Statics.method61(var205).field893 >= Statics.method61(var203.field448).field893) {
                                        var203.field448 = var205;
                                        var203.field425 = 0;
                                        var203.field450 = 0;
                                        var203.field451 = var206;
                                        var203.field470 = 0;
                                        var203.field447 = var203.field475;
                                    }
                                }
                                if ((var204 & 0x40) != 0) {
                                    int var208 = field521.method2421();
                                    int var209 = field521.method2416();
                                    var203.method252(var208, var209, field489);
                                    var203.field439 = field489 + 300;
                                    var203.field441 = field521.method2419();
                                    var203.field456 = field521.method2479();
                                }
                                if ((var204 & 0x20) != 0) {
                                    var203.field432 = field521.method2473();
                                    var203.field433 = 100;
                                }
                                if ((var204 & 0x2) != 0) {
                                    var203.field453 = field521.method2528();
                                    int var210 = field521.method2455();
                                    var203.field457 = var210 >> 16;
                                    var203.field429 = (var210 & 0xFFFF) + field489;
                                    var203.field454 = 0;
                                    var203.field455 = 0;
                                    if (var203.field429 > field489) {
                                        var203.field454 = -1;
                                    }
                                    if (var203.field453 == 65535) {
                                        var203.field453 = -1;
                                    }
                                }
                                if ((var204 & 0x8) != 0) {
                                    int var211 = field521.method2416();
                                    int var212 = field521.method2419();
                                    var203.method252(var211, var212, field489);
                                    var203.field439 = field489 + 300;
                                    var203.field441 = field521.method2416();
                                    var203.field456 = field521.method2419();
                                }
                                if ((var204 & 0x4) != 0) {
                                    var203.field419 = field521.method2528();
                                    var203.field440 = field521.method2389();
                                }
                                if ((var204 & 0x80) != 0) {
                                    var203.field452 = field521.method2441();
                                    if (var203.field452 == 65535) {
                                        var203.field452 = -1;
                                    }
                                }
                            }
                            for (int var213 = 0; var213 < field605; var213++) {
                                int var214 = field599[var213];
                                if (field489 != field516[var214].field465) {
                                    field516[var214].field396 = null;
                                    field516[var214] = null;
                                }
                            }
                            if (field522 != field521.field2051) {
                                throw new RuntimeException(field521.field2051 + class2.field20 + field522);
                            }
                            for (int var215 = 0; var215 < field581; var215++) {
                                if (field516[field582[var215]] == null) {
                                    throw new RuntimeException(var215 + class2.field20 + field581);
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 187) {
                            while (field521.field2051 < field522) {
                                boolean var216 = field521.method2416() == 1;
                                String var217 = field521.method2473();
                                String var218 = field521.method2473();
                                int var219 = field521.method2394();
                                int var220 = field521.method2416();
                                int var221 = field521.method2416();
                                boolean var222 = (var221 & 0x2) != 0;
                                boolean var223 = (var221 & 0x1) != 0;
                                if (var219 > 0) {
                                    field521.method2473();
                                    field521.method2416();
                                    field521.method2455();
                                }
                                field521.method2473();
                                for (int var224 = 0; var224 < field729; var224++) {
                                    class23 var225 = field555[var224];
                                    if (var216) {
                                        if (var218.equals(var225.field372)) {
                                            var225.field372 = var217;
                                            var225.field369 = var218;
                                            var217 = null;
                                            break;
                                        }
                                    } else if (var217.equals(var225.field372)) {
                                        if (var225.field370 != var219) {
                                            boolean var226 = true;
                                            for (class28 var227 = (class28) field497.method3217(); var227 != null; var227 = (class28) field497.method3221()) {
                                                if (var227.field744.equals(var217)) {
                                                    if (var219 != 0 && var227.field743 == 0) {
                                                        var227.method3279();
                                                        var226 = false;
                                                    } else if (var219 == 0 && var227.field743 != 0) {
                                                        var227.method3279();
                                                        var226 = false;
                                                    }
                                                }
                                            }
                                            if (var226) {
                                                field497.method3218(new class28(var217, var219));
                                            }
                                            var225.field370 = var219;
                                        }
                                        var225.field369 = var218;
                                        var225.field371 = var220;
                                        var225.field374 = var222;
                                        var225.field378 = var223;
                                        var217 = null;
                                        break;
                                    }
                                }
                                if (var217 != null && field729 < 400) {
                                    class23 var228 = new class23();
                                    field555[field729] = var228;
                                    var228.field372 = var217;
                                    var228.field369 = var218;
                                    var228.field370 = var219;
                                    var228.field371 = var220;
                                    var228.field374 = var222;
                                    var228.field378 = var223;
                                    field729++;
                                }
                            }
                            field732 = 2;
                            field543 = field495;
                            boolean var229 = false;
                            int var230 = field729;
                            while (var230 > 0) {
                                boolean var231 = true;
                                var230--;
                                for (int var232 = 0; var232 < var230; var232++) {
                                    boolean var233 = false;
                                    class23 var234 = field555[var232];
                                    class23 var235 = field555[var232 + 1];
                                    if (field480 != var234.field370 && field480 == var235.field370) {
                                        var233 = true;
                                    }
                                    if (!var233 && var234.field370 == 0 && var235.field370 != 0) {
                                        var233 = true;
                                    }
                                    if (!var233 && !var234.field374 && var235.field374) {
                                        var233 = true;
                                    }
                                    if (!var233 && !var234.field378 && var235.field378) {
                                        var233 = true;
                                    }
                                    if (var233) {
                                        class23 var236 = field555[var232];
                                        field555[var232] = field555[var232 + 1];
                                        field555[var232 + 1] = var236;
                                        var231 = false;
                                    }
                                }
                                if (var231) {
                                    break;
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 64) {
                            Statics.field1771 = field521.method2421();
                            Statics.field100 = field521.method2421();
                            while (field521.field2051 < field522) {
                                field523 = field521.method2416();
                                method137();
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 230) {
                            int var237 = field521.method2441();
                            field637 = var237;
                            if (class159.method880(var237)) {
                                class159[] var238 = Statics.field2830[var237];
                                for (int var239 = 0; var239 < var238.length; var239++) {
                                    class159 var240 = var238[var239];
                                    if (var240 != null) {
                                        var240.field2705 = 0;
                                        var240.field2725 = 0;
                                    }
                                }
                            }
                            class26.method556(field637);
                            for (int var241 = 0; var241 < 100; var241++) {
                                field680[var241] = true;
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 96) {
                            field669 = field495;
                            if (field522 == 0) {
                                field702 = null;
                                field730 = null;
                                Statics.field2700 = 0;
                                Statics.field34 = null;
                                field523 = -1;
                                var1 = true;
                            } else {
                                field730 = field521.method2473();
                                long var242 = field521.method2402();
                                long var244 = var242;
                                String var246;
                                if (var242 <= 0L || var242 >= 6582952005840035281L) {
                                    var246 = null;
                                } else if (var242 % 37L == 0L) {
                                    var246 = null;
                                } else {
                                    int var247 = 0;
                                    for (long var248 = var242; var248 != 0L; var248 /= 37L) {
                                        var247++;
                                    }
                                    StringBuilder var250 = new StringBuilder(var247);
                                    while (var244 != 0L) {
                                        long var251 = var244;
                                        var244 /= 37L;
                                        var250.append(class147.field2481[(int) (var251 - var244 * 37L)]);
                                    }
                                    var246 = var250.reverse().toString();
                                }
                                field702 = var246;
                                Statics.field993 = field521.method2397();
                                int var253 = field521.method2416();
                                if (var253 == 255) {
                                    field523 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field2700 = var253;
                                    class8[] var254 = new class8[100];
                                    for (int var255 = 0; var255 < Statics.field2700; var255++) {
                                        var254[var255] = new class8();
                                        var254[var255].field133 = field521.method2473();
                                        var254[var255].field130 = class149.method122(var254[var255].field133, Statics.field210);
                                        var254[var255].field137 = field521.method2394();
                                        var254[var255].field132 = field521.method2397();
                                        field521.method2473();
                                        if (var254[var255].field133.equals(Statics.field368.field52)) {
                                            Statics.field1487 = var254[var255].field132;
                                        }
                                    }
                                    boolean var256 = false;
                                    int var257 = Statics.field2700;
                                    while (var257 > 0) {
                                        boolean var258 = true;
                                        var257--;
                                        for (int var259 = 0; var259 < var257; var259++) {
                                            if (var254[var259].field130.compareTo(var254[var259 + 1].field130) > 0) {
                                                class8 var260 = var254[var259];
                                                var254[var259] = var254[var259 + 1];
                                                var254[var259 + 1] = var260;
                                                var258 = false;
                                            }
                                        }
                                        if (var258) {
                                            break;
                                        }
                                    }
                                    Statics.field34 = var254;
                                    field523 = -1;
                                    var1 = true;
                                }
                            }
                            break label2726;
                        }
                        if (field523 == 200) {
                            int var261 = field521.method2394();
                            int var262 = field521.method2416();
                            int var263 = field521.method2394();
                            method208(var261, var262, var263);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 137) {
                            field673 = false;
                            for (int var264 = 0; var264 < 5; var264++) {
                                field724[var264] = false;
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 237) {
                            for (int var265 = 0; var265 < field662.length; var265++) {
                                if (field662[var265] != null) {
                                    field662[var265].field448 = -1;
                                }
                            }
                            for (int var266 = 0; var266 < field516.length; var266++) {
                                if (field516[var266] != null) {
                                    field516[var266].field448 = -1;
                                }
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 102) {
                            for (int var267 = 0; var267 < Statics.field1036; var267++) {
                                class42 var268 = (class42) class42.field1037.method3188((long) var267);
                                class42 var269;
                                if (var268 == null) {
                                    byte[] var270 = Statics.field1040.method2964(16, var267);
                                    class42 var271 = new class42();
                                    if (var270 != null) {
                                        var271.method882(new class127(var270));
                                    }
                                    class42.field1037.method3190(var271, (long) var267);
                                    var269 = var271;
                                } else {
                                    var269 = var268;
                                }
                                if (var269 != null && var269.field1038 == 0) {
                                    class160.field2739[var267] = 0;
                                    class160.field2742[var267] = 0;
                                }
                            }
                            method153();
                            field632 += 32;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 104) {
                            int var273 = field521.method2455();
                            class4 var274 = (class4) field597.method3232((long) var273);
                            if (var274 != null) {
                                method588(var274, true);
                            }
                            if (field570 != null) {
                                method728(field570);
                                field570 = null;
                            }
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 218) {
                            class182.method39(field521, field522);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 155) {
                            int var275 = field521.method2528();
                            if (var275 == 65535) {
                                var275 = -1;
                            }
                            if (var275 == -1 && !field714) {
                                Statics.field68.method2755();
                                class139.field2379 = 1;
                                Statics.field2380 = null;
                            } else if (var275 != -1 && field658 != var275 && field517 != 0 && !field714) {
                                class155 var276 = Statics.field509;
                                int var277 = field517;
                                class139.field2379 = 1;
                                Statics.field2380 = var276;
                                Statics.field2381 = var275;
                                Statics.field2383 = 0;
                                Statics.field89 = var277;
                                Statics.field1543 = false;
                                Statics.field2382 = 2;
                            }
                            field658 = var275;
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 34) {
                            int var278 = field521.method2389();
                            if (var278 == 65535) {
                                var278 = -1;
                            }
                            int var279 = field521.method2400();
                            Statics.method138(var278, var279);
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        if (field523 == 113) {
                            field482 = field521.method2416();
                            field695 = field521.method2416();
                            field523 = -1;
                            var1 = true;
                            break label2726;
                        }
                        class80.method173("" + field523 + class2.field20 + field498 + class2.field20 + field529 + class2.field20 + field522, (Throwable) null);
                        method20();
                    } catch (IOException var389) {
                        method2078();
                    } catch (Exception var390) {
                        String var282 = "" + field523 + class2.field20 + field498 + class2.field20 + field529 + class2.field20 + field522 + class2.field20 + (Statics.field96 + Statics.field368.field471[0]) + class2.field20 + (Statics.field92 + Statics.field368.field472[0]) + class2.field20;
                        for (int var283 = 0; var283 < field522 && var283 < 50; var283++) {
                            var282 = var282 + field521.field2056[var283] + class2.field20;
                        }
                        class80.method173(var282, var390);
                        method20();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field487 != 30) {
            return;
        }
        Statics.method230(field519, 23);
        Object var284 = Statics.field294.field269;
        synchronized (Statics.field294.field269) {
            if (!field479) {
                Statics.field294.field270 = 0;
            } else if (class77.field1425 != 0 || Statics.field294.field270 >= 40) {
                field519.method2273(71);
                field519.method2590(0);
                int var285 = field519.field2051;
                int var286 = 0;
                for (int var287 = 0; var287 < Statics.field294.field270 && field519.field2051 - var285 < 240; var287++) {
                    var286++;
                    int var288 = Statics.field294.field268[var287];
                    if (var288 < 0) {
                        var288 = 0;
                    } else if (var288 > 502) {
                        var288 = 502;
                    }
                    int var289 = Statics.field294.field271[var287];
                    if (var289 < 0) {
                        var289 = 0;
                    } else if (var289 > 764) {
                        var289 = 764;
                    }
                    int var290 = var288 * 765 + var289;
                    if (Statics.field294.field268[var287] == -1 && Statics.field294.field271[var287] == -1) {
                        var289 = -1;
                        var288 = -1;
                        var290 = 524287;
                    }
                    if (field491 != var289 || field492 != var288) {
                        int var291 = var289 - field491;
                        field491 = var289;
                        int var292 = var288 - field492;
                        field492 = var288;
                        if (field493 < 8 && var291 >= -32 && var291 <= 31 && var292 >= -32 && var292 <= 31) {
                            var291 += 32;
                            var292 += 32;
                            field519.method2576((field493 << 12) + (var291 << 6) + var292);
                            field493 = 0;
                        } else if (field493 < 8) {
                            field519.method2404((field493 << 19) + 8388608 + var290);
                            field493 = 0;
                        } else {
                            field519.method2385((field493 << 19) + -1073741824 + var290);
                            field493 = 0;
                        }
                    } else if (field493 < 2047) {
                        field493++;
                    }
                }
                field519.method2547(field519.field2051 - var285);
                if (var286 >= Statics.field294.field270) {
                    Statics.field294.field270 = 0;
                } else {
                    Statics.field294.field270 -= var286;
                    for (int var293 = 0; var293 < Statics.field294.field270; var293++) {
                        Statics.field294.field271[var293] = Statics.field294.field271[var286 + var293];
                        Statics.field294.field268[var293] = Statics.field294.field268[var286 + var293];
                    }
                }
            }
        }
        if (class77.field1425 == 1 || !Statics.field377 && class77.field1425 == 4 || class77.field1425 == 2) {
            long var295 = (class77.field1419 - field490) / 50L;
            if (var295 > 4095L) {
                var295 = 4095L;
            }
            field490 = class77.field1419;
            int var297 = class77.field1416;
            if (var297 < 0) {
                var297 = 0;
            } else if (var297 > 502) {
                var297 = 502;
            }
            int var298 = class77.field1421;
            if (var298 < 0) {
                var298 = 0;
            } else if (var298 > 764) {
                var298 = 764;
            }
            int var299 = var297 * 765 + var298;
            byte var300 = 0;
            if (class77.field1425 == 2) {
                var300 = 1;
            }
            int var301 = (int) var295;
            field519.method2273(236);
            field519.method2385((var300 << 19) + (var301 << 20) + var299);
        }
        if (class75.field1380 > 0) {
            field519.method2273(6);
            field519.method2576(0);
            int var302 = field519.field2051;
            long var303 = class121.method2318();
            for (int var305 = 0; var305 < class75.field1380; var305++) {
                long var306 = var303 - field701;
                if (var306 > 16777215L) {
                    var306 = 16777215L;
                }
                field701 = var303;
                field519.method2434((int) var306);
                field519.method2590(class75.field1393[var305]);
            }
            field519.method2392(field519.field2051 - var302);
        }
        if (field567 > 0) {
            field567--;
        }
        if (class75.field1386[96] || class75.field1386[97] || class75.field1386[98] || class75.field1386[99]) {
            field703 = true;
        }
        if (field703 && field567 <= 0) {
            field567 = 20;
            field703 = false;
            field519.method2273(214);
            field519.method2427(field561);
            field519.method2426(field562);
        }
        if (Statics.field900 && !field494) {
            field494 = true;
            field519.method2273(112);
            field519.method2590(1);
        }
        if (!Statics.field900 && field494) {
            field494 = false;
            field519.method2273(112);
            field519.method2590(0);
        }
        method1414();
        if (field487 != 30) {
            return;
        }
        method214();
        int var10002;
        for (int var308 = 0; var308 < field717; var308++) {
            var10002 = field720[var308]--;
            if (field720[var308] >= -10) {
                class57 var310 = field535[var308];
                if (var310 == null) {
                    class57 var391 = (class57) null;
                    var310 = class57.method1249(Statics.field1193, field718[var308], 0);
                    if (var310 == null) {
                        continue;
                    }
                    field720[var308] += var310.method1252();
                    field535[var308] = var310;
                }
                if (field720[var308] < 0) {
                    int var317;
                    if (field721[var308] == 0) {
                        var317 = field715;
                    } else {
                        int var311 = (field721[var308] & 0xFF) * 128;
                        int var312 = field721[var308] >> 16 & 0xFF;
                        int var313 = var312 * 128 + 64 - Statics.field368.field444;
                        if (var313 < 0) {
                            var313 = -var313;
                        }
                        int var314 = field721[var308] >> 8 & 0xFF;
                        int var315 = var314 * 128 + 64 - Statics.field368.field420;
                        if (var315 < 0) {
                            var315 = -var315;
                        }
                        int var316 = var313 + var315 - 128;
                        if (var316 > var311) {
                            field720[var308] = -100;
                            continue;
                        }
                        if (var316 < 0) {
                            var316 = 0;
                        }
                        var317 = field716 * (var311 - var316) / var311;
                    }
                    if (var317 > 0) {
                        class63 var318 = var310.method1239().method1302(Statics.field1317);
                        class45 var319 = class45.method964(var318, 100, var317);
                        var319.method965(field719[var308] - 1);
                        Statics.field1216.method1087(var319);
                    }
                    field720[var308] = -100;
                }
            } else {
                field717--;
                for (int var309 = var308; var309 < field717; var309++) {
                    field718[var309] = field718[var309 + 1];
                    field535[var309] = field535[var309 + 1];
                    field719[var309] = field719[var309 + 1];
                    field720[var309] = field720[var309 + 1];
                    field721[var309] = field721[var309 + 1];
                }
                var308--;
            }
        }
        if (field714) {
            boolean var320;
            if (class139.field2379 == 0) {
                var320 = Statics.field68.method2733();
            } else {
                var320 = true;
            }
            if (!var320) {
                if (field517 != 0 && field658 != -1) {
                    class139.method2683(Statics.field509, field658, 0, field517, false);
                }
                field714 = false;
            }
        }
        field524++;
        if (field524 > 750) {
            method2078();
            return;
        }
        for (int var321 = -1; var321 < field685; var321++) {
            int var322;
            if (var321 == -1) {
                var322 = 2047;
            } else {
                var322 = field534[var321];
            }
            class3 var323 = field662[var322];
            if (var323 != null) {
                method32(var323, 1);
            }
        }
        for (int var324 = 0; var324 < field581; var324++) {
            int var325 = field582[var324];
            class25 var326 = field516[var325];
            if (var326 != null) {
                method32(var326, var326.field396.field781);
            }
        }
        method2266();
        field558++;
        if (field587 != 0) {
            field586 += 20;
            if (field586 >= 400) {
                field587 = 0;
            }
        }
        if (Statics.field156 != null) {
            field588++;
            if (field588 >= 15) {
                method728(Statics.field156);
                Statics.field156 = null;
            }
        }
        class159 var327 = Statics.field1997;
        class159 var328 = Statics.field1044;
        Statics.field1997 = null;
        Statics.field1044 = null;
        field652 = null;
        field616 = false;
        field653 = false;
        field698 = 0;
        while (class75.method1644() && field698 < 128) {
            if (field644 >= 2 && class75.field1386[82] && Statics.field1938 == 66) {
                String var329 = "";
                for (int var330 = 0; var330 < field692 && var330 < 100; var330++) {
                    var329 = var329 + field689[var330] + ':' + field624[var330] + '\n';
                }
                Statics.field2083.setContents(new StringSelection(var329), (ClipboardOwner) null);
            } else {
                field700[field698] = Statics.field1938;
                field606[field698] = Statics.field398;
                field698++;
            }
        }
        int var331 = field637;
        if (class159.method880(var331)) {
            method688(Statics.field2830[var331], -1, 0, 0, 765, 503, 0, 0);
        }
        field495++;
        while (true) {
            class1 var332;
            class159 var333;
            class159 var334;
            do {
                var332 = (class1) field675.method3262();
                if (var332 == null) {
                    while (true) {
                        class1 var335;
                        class159 var336;
                        class159 var337;
                        do {
                            var335 = (class1) field731.method3262();
                            if (var335 == null) {
                                while (true) {
                                    class1 var338;
                                    class159 var339;
                                    class159 var340;
                                    do {
                                        var338 = (class1) field674.method3262();
                                        if (var338 == null) {
                                            Statics.method64();
                                            if (Statics.field1333 == null && field648 == null) {
                                                int var341 = class77.field1425;
                                                if (field619) {
                                                    if (var341 != 1 && (Statics.field377 || var341 != 4)) {
                                                        int var342 = class77.field1410;
                                                        int var343 = class77.field1411;
                                                        if (var342 < Statics.field1214 - 10 || var342 > Statics.field1936 + Statics.field1214 + 10 || var343 < Statics.field195 - 10 || var343 > Statics.field195 + Statics.field1314 + 10) {
                                                            field619 = false;
                                                            method29(Statics.field1214, Statics.field195, Statics.field1936, Statics.field1314);
                                                        }
                                                    }
                                                    if (var341 == 1 || !Statics.field377 && var341 == 4) {
                                                        int var344 = Statics.field1214;
                                                        int var345 = Statics.field195;
                                                        int var346 = Statics.field1936;
                                                        int var347 = class77.field1421;
                                                        int var348 = class77.field1416;
                                                        int var349 = -1;
                                                        for (int var350 = 0; var350 < field620; var350++) {
                                                            int var351 = (field620 - 1 - var350) * 15 + var345 + 31;
                                                            if (var347 > var344 && var347 < var344 + var346 && var348 > var351 - 13 && var348 < var351 + 3) {
                                                                var349 = var350;
                                                            }
                                                        }
                                                        if (var349 != -1) {
                                                            method2188(var349);
                                                        }
                                                        field619 = false;
                                                        method29(Statics.field1214, Statics.field195, Statics.field1936, Statics.field1314);
                                                    }
                                                } else {
                                                    label2939: {
                                                        if ((var341 == 1 || !Statics.field377 && var341 == 4) && field620 > 0) {
                                                            int var352 = field672[field620 - 1];
                                                            if (var352 == 39 || var352 == 40 || var352 == 41 || var352 == 42 || var352 == 43 || var352 == 33 || var352 == 34 || var352 == 35 || var352 == 36 || var352 == 37 || var352 == 38 || var352 == 1005) {
                                                                int var353 = field621[field620 - 1];
                                                                int var354 = field622[field620 - 1];
                                                                class159 var355 = class159.method2333(var354);
                                                                if (class163.method152(method2824(var355)) || class163.method2826(method2824(var355))) {
                                                                    if (Statics.field1333 != null && !field705 && field618 != 1 && !Statics.method663(field620 - 1) && field620 > 0) {
                                                                        method2188(field620 - 1);
                                                                    }
                                                                    field705 = false;
                                                                    field595 = 0;
                                                                    if (Statics.field1333 != null) {
                                                                        method728(Statics.field1333);
                                                                    }
                                                                    Statics.field1333 = class159.method2333(var354);
                                                                    field590 = var353;
                                                                    field591 = class77.field1421;
                                                                    field592 = class77.field1416;
                                                                    method728(Statics.field1333);
                                                                    break label2939;
                                                                }
                                                            }
                                                        }
                                                        if ((var341 == 1 || !Statics.field377 && var341 == 4) && (field618 == 1 && field620 > 2 || Statics.method663(field620 - 1))) {
                                                            var341 = 2;
                                                        }
                                                        if ((var341 == 1 || !Statics.field377 && var341 == 4) && field620 > 0) {
                                                            method2188(field620 - 1);
                                                        }
                                                        if (var341 == 2 && field620 > 0) {
                                                            Statics.method234();
                                                        }
                                                    }
                                                }
                                            }
                                            if (field648 != null) {
                                                method1487();
                                            }
                                            if (Statics.field1333 != null) {
                                                method728(Statics.field1333);
                                                field595++;
                                                if (class77.field1404 == 0) {
                                                    if (field705) {
                                                        if (Statics.field1775 == Statics.field1333 && field608 != field590) {
                                                            class159 var356 = Statics.field1333;
                                                            byte var357 = 0;
                                                            if (field663 == 1 && var356.field2622 == 206) {
                                                                var357 = 1;
                                                            }
                                                            if (var356.field2720[field608] <= 0) {
                                                                var357 = 0;
                                                            }
                                                            if (class163.method2826(method2824(var356))) {
                                                                int var358 = field590;
                                                                int var359 = field608;
                                                                var356.field2720[var359] = var356.field2720[var358];
                                                                var356.field2721[var359] = var356.field2721[var358];
                                                                var356.field2720[var358] = -1;
                                                                var356.field2721[var358] = 0;
                                                            } else if (var357 == 1) {
                                                                int var360 = field590;
                                                                int var361 = field608;
                                                                while (var360 != var361) {
                                                                    if (var360 > var361) {
                                                                        var356.method3092(var360 - 1, var360);
                                                                        var360--;
                                                                    } else if (var360 < var361) {
                                                                        var356.method3092(var360 + 1, var360);
                                                                        var360++;
                                                                    }
                                                                }
                                                            } else {
                                                                var356.method3092(field608, field590);
                                                            }
                                                            field519.method2273(178);
                                                            field519.method2385(Statics.field1333.field2618);
                                                            field519.method2426(field590);
                                                            field519.method2590(var357);
                                                            field519.method2427(field608);
                                                        }
                                                    } else if ((field618 == 1 || Statics.method663(field620 - 1)) && field620 > 2) {
                                                        Statics.method234();
                                                    } else if (field620 > 0) {
                                                        method2188(field620 - 1);
                                                    }
                                                    field588 = 10;
                                                    class77.field1425 = 0;
                                                    Statics.field1333 = null;
                                                } else if (field595 >= 5 && (class77.field1410 > field591 + 5 || class77.field1410 < field591 - 5 || class77.field1411 > field592 + 5 || class77.field1411 < field592 - 5)) {
                                                    field705 = true;
                                                }
                                            }
                                            if (class95.field1612 != -1) {
                                                int var362 = class95.field1612;
                                                int var363 = class95.field1613;
                                                field519.method2273(89);
                                                field519.method2590(5);
                                                field519.method2417(class75.field1386[82] ? (class75.field1386[81] ? 2 : 1) : 0);
                                                field519.method2576(Statics.field92 + var363);
                                                field519.method2426(Statics.field96 + var362);
                                                class95.field1612 = -1;
                                                field593 = class77.field1421;
                                                field585 = class77.field1416;
                                                field587 = 1;
                                                field586 = 0;
                                                field713 = var362;
                                                field710 = var363;
                                            }
                                            if (Statics.field1997 != var327) {
                                                if (var327 != null) {
                                                    method728(var327);
                                                }
                                                if (Statics.field1997 != null) {
                                                    method728(Statics.field1997);
                                                }
                                            }
                                            if (Statics.field1044 != var328 && field630 == field484) {
                                                if (var328 != null) {
                                                    method728(var328);
                                                }
                                                if (Statics.field1044 != null) {
                                                    method728(Statics.field1044);
                                                }
                                            }
                                            if (Statics.field1044 == null) {
                                                if (field484 > 0) {
                                                    field484--;
                                                }
                                            } else if (field484 < field630) {
                                                field484++;
                                                if (field630 == field484) {
                                                    method728(Statics.field1044);
                                                }
                                            }
                                            method2262();
                                            if (field673) {
                                                int var364 = Statics.field1807 * 128 + 64;
                                                int var365 = Statics.field313 * 128 + 64;
                                                int var366 = method2151(var364, var365, Statics.field13) - Statics.field2750;
                                                if (Statics.field707 < var364) {
                                                    Statics.field707 += Statics.field58 * (var364 - Statics.field707) / 1000 + Statics.field1033;
                                                    if (Statics.field707 > var364) {
                                                        Statics.field707 = var364;
                                                    }
                                                }
                                                if (Statics.field707 > var364) {
                                                    Statics.field707 -= Statics.field58 * (Statics.field707 - var364) / 1000 + Statics.field1033;
                                                    if (Statics.field707 < var364) {
                                                        Statics.field707 = var364;
                                                    }
                                                }
                                                if (Statics.field399 < var366) {
                                                    Statics.field399 += Statics.field58 * (var366 - Statics.field399) / 1000 + Statics.field1033;
                                                    if (Statics.field399 > var366) {
                                                        Statics.field399 = var366;
                                                    }
                                                }
                                                if (Statics.field399 > var366) {
                                                    Statics.field399 -= Statics.field58 * (Statics.field399 - var366) / 1000 + Statics.field1033;
                                                    if (Statics.field399 < var366) {
                                                        Statics.field399 = var366;
                                                    }
                                                }
                                                if (Statics.field1356 < var365) {
                                                    Statics.field1356 += Statics.field58 * (var365 - Statics.field1356) / 1000 + Statics.field1033;
                                                    if (Statics.field1356 > var365) {
                                                        Statics.field1356 = var365;
                                                    }
                                                }
                                                if (Statics.field1356 > var365) {
                                                    Statics.field1356 -= Statics.field58 * (Statics.field1356 - var365) / 1000 + Statics.field1033;
                                                    if (Statics.field1356 < var365) {
                                                        Statics.field1356 = var365;
                                                    }
                                                }
                                                int var367 = Statics.field39 * 128 + 64;
                                                int var368 = Statics.field746 * 128 + 64;
                                                int var369 = method2151(var367, var368, Statics.field13) - Statics.field2629;
                                                int var370 = var367 - Statics.field707;
                                                int var371 = var369 - Statics.field399;
                                                int var372 = var368 - Statics.field1356;
                                                int var373 = (int) Math.sqrt((double) (var370 * var370 + var372 * var372));
                                                int var374 = (int) (Math.atan2((double) var371, (double) var373) * 325.949D) & 0x7FF;
                                                int var375 = (int) (Math.atan2((double) var370, (double) var372) * -325.949D) & 0x7FF;
                                                if (var374 < 128) {
                                                    var374 = 128;
                                                }
                                                if (var374 > 383) {
                                                    var374 = 383;
                                                }
                                                if (Statics.field1858 < var374) {
                                                    Statics.field1858 += Statics.field1291 * (var374 - Statics.field1858) / 1000 + Statics.field1325;
                                                    if (Statics.field1858 > var374) {
                                                        Statics.field1858 = var374;
                                                    }
                                                }
                                                if (Statics.field1858 > var374) {
                                                    Statics.field1858 -= Statics.field1291 * (Statics.field1858 - var374) / 1000 + Statics.field1325;
                                                    if (Statics.field1858 < var374) {
                                                        Statics.field1858 = var374;
                                                    }
                                                }
                                                int var376 = var375 - Statics.field262;
                                                if (var376 > 1024) {
                                                    var376 -= 2048;
                                                }
                                                if (var376 < -1024) {
                                                    var376 += 2048;
                                                }
                                                if (var376 > 0) {
                                                    Statics.field262 += Statics.field1291 * var376 / 1000 + Statics.field1325;
                                                    Statics.field262 &= 0x7FF;
                                                }
                                                if (var376 < 0) {
                                                    Statics.field262 -= Statics.field1291 * -var376 / 1000 + Statics.field1325;
                                                    Statics.field262 &= 0x7FF;
                                                }
                                                int var377 = var375 - Statics.field262;
                                                if (var377 > 1024) {
                                                    var377 -= 2048;
                                                }
                                                if (var377 < -1024) {
                                                    var377 += 2048;
                                                }
                                                if (var377 < 0 && var376 > 0 || var377 > 0 && var376 < 0) {
                                                    Statics.field262 = var375;
                                                }
                                            }
                                            for (int var378 = 0; var378 < 5; var378++) {
                                                var10002 = field728[var378]++;
                                            }
                                            int var379 = class77.method691();
                                            int var380 = class75.field1398;
                                            if (var379 > 15000 && var380 > 15000) {
                                                field526 = 250;
                                                class77.method1382(14500);
                                                field519.method2273(135);
                                            }
                                            field547++;
                                            if (field547 > 500) {
                                                field547 = 0;
                                                int var382 = (int) (Math.random() * 8.0D);
                                                if ((var382 & 0x1) == 1) {
                                                    field541 += field542;
                                                }
                                                if ((var382 & 0x2) == 2) {
                                                    field477 += field544;
                                                }
                                                if ((var382 & 0x4) == 4) {
                                                    field545 += field546;
                                                }
                                            }
                                            if (field541 < -50) {
                                                field542 = 2;
                                            }
                                            if (field541 > 50) {
                                                field542 = -2;
                                            }
                                            if (field477 < -55) {
                                                field544 = 2;
                                            }
                                            if (field477 > 55) {
                                                field544 = -2;
                                            }
                                            if (field545 < -40) {
                                                field546 = 1;
                                            }
                                            if (field545 > 40) {
                                                field546 = -1;
                                            }
                                            field552++;
                                            if (field552 > 500) {
                                                field552 = 0;
                                                int var383 = (int) (Math.random() * 8.0D);
                                                if ((var383 & 0x1) == 1) {
                                                    field548 += field549;
                                                }
                                                if ((var383 & 0x2) == 2) {
                                                    field550 += field551;
                                                }
                                            }
                                            if (field548 < -60) {
                                                field549 = 2;
                                            }
                                            if (field548 > 60) {
                                                field549 = -2;
                                            }
                                            if (field550 < -20) {
                                                field551 = 1;
                                            }
                                            if (field550 > 10) {
                                                field551 = -1;
                                            }
                                            for (class28 var384 = (class28) field497.method3217(); var384 != null; var384 = (class28) field497.method3221()) {
                                                if ((long) var384.field747 < class121.method2318() / 1000L - 5L) {
                                                    if (var384.field743 > 0) {
                                                        method112(5, "", var384.field744 + class135.field2259);
                                                    }
                                                    if (var384.field743 == 0) {
                                                        method112(5, "", var384.field744 + class135.field2260);
                                                    }
                                                    var384.method3279();
                                                }
                                            }
                                            field571++;
                                            if (field571 > 50) {
                                                field519.method2273(142);
                                            }
                                            try {
                                                if (Statics.field1209 != null && field519.field2051 > 0) {
                                                    Statics.field1209.method1352(field519.field2056, 0, field519.field2051);
                                                    field519.field2051 = 0;
                                                    field571 = 0;
                                                }
                                            } catch (IOException var386) {
                                                method2078();
                                            }
                                            return;
                                        }
                                        var339 = var338.field1;
                                        if (var339.field2619 < 0) {
                                            break;
                                        }
                                        var340 = class159.method2333(var339.field2625);
                                    } while (var340 == null || var340.field2635 == null || var339.field2619 >= var340.field2635.length || var340.field2635[var339.field2619] != var339);
                                    class26.method1493(var338);
                                }
                            }
                            var336 = var335.field1;
                            if (var336.field2619 < 0) {
                                break;
                            }
                            var337 = class159.method2333(var336.field2625);
                        } while (var337 == null || var337.field2635 == null || var336.field2619 >= var337.field2635.length || var337.field2635[var336.field2619] != var336);
                        class26.method1493(var335);
                    }
                }
                var333 = var332.field1;
                if (var333.field2619 < 0) {
                    break;
                }
                var334 = class159.method2333(var333.field2625);
            } while (var334 == null || var334.field2635 == null || var333.field2619 >= var334.field2635.length || var334.field2635[var333.field2619] != var333);
            class26.method111(var332, 200000);
        }
    }

    @ObfuscatedName("df.h(I)V")
    public static final void method2180() {
        if (Statics.field287 != null) {
            Statics.field287.method1152();
        }
        if (Statics.field2579 != null) {
            Statics.field2579.method1152();
        }
    }

    @ObfuscatedName("by.p(Law;IIII)V")
    public static void method1513(class34 arg0, int arg1, int arg2, int arg3) {
        if (field717 >= 50 || field716 == 0 || arg0.field882 == null || arg1 >= arg0.field882.length) {
            return;
        }
        int var4 = arg0.field882[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field718[field717] = var5;
        field719[field717] = var6;
        field720[field717] = 0;
        field535[field717] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field721[field717] = (var8 << 16) + (var9 << 8) + var7;
        field717++;
    }

    @ObfuscatedName("f.e(IIII)V")
    public static void method208(int arg0, int arg1, int arg2) {
        if (field715 == 0 || arg1 == 0 || field717 >= 50) {
            return;
        }
        field718[field717] = arg0;
        field719[field717] = arg1;
        field720[field717] = arg2;
        field535[field717] = null;
        field721[field717] = 0;
        field717++;
    }

    @ObfuscatedName("bt.av(I)V")
    public static final void method1414() {
        if (field643 && Statics.field13 != field531) {
            method1608(Statics.field1360, Statics.field976, Statics.field13, Statics.field368.field471[0], Statics.field368.field472[0]);
        } else if (Statics.field13 != field704) {
            field704 = Statics.field13;
            int var0 = Statics.field13;
            int[] var1 = Statics.field1573.field1498;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field139[var0][var6][var4] & 0x18) == 0) {
                        Statics.field1245.method1850(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field139[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field1245.method1850(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1573.method1649();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field139[var0][var10][var9] & 0x18) == 0) {
                        method233(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field139[var0 + 1][var10][var9] & 0x8) != 0) {
                        method233(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field657 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field1245.method1845(Statics.field13, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class32.method46(var14).field822;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field537[Statics.field13].field2063;
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
                            field638[field657] = Statics.field212[var15];
                            field528[field657] = var16;
                            field735[field657] = var17;
                            field657++;
                        }
                    }
                }
            }
            Statics.field1541.method1641();
        }
    }

    @ObfuscatedName("dx.an(I)V")
    public static final void method2266() {
        for (int var0 = -1; var0 < field685; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field534[var0];
            }
            class3 var2 = field662[var1];
            if (var2 != null && var2.field433 > 0) {
                var2.field433--;
                if (var2.field433 == 0) {
                    var2.field432 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field581; var3++) {
            int var4 = field582[var3];
            class25 var5 = field516[var4];
            if (var5 != null && var5.field433 > 0) {
                var5.field433--;
                if (var5.field433 == 0) {
                    var5.field432 = null;
                }
            }
        }
    }

    @ObfuscatedName("ae.ae(Ljava/lang/String;I)V")
    public static final void method555(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field29.field206 = !Statics.field29.field206;
            class29 var1 = null;
            try {
                var1 = class82.method2167("", Statics.field1217.field2117, true);
                class127 var2 = Statics.field29.method133();
                var1.method559(var2.field2056, 0, var2.field2051);
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method541();
                }
            } catch (Exception var5) {
            }
            if (Statics.field29.field206) {
                method112(0, "", "Roofs are now all hidden");
            } else {
                method112(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field644 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field723 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field723 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2078();
            }
            if (arg0.equalsIgnoreCase("errortest") && field483 == 2) {
                throw new RuntimeException();
            }
        }
        field519.method2273(205);
        field519.method2590(arg0.length() + 1);
        field519.method2520(arg0);
    }

    @ObfuscatedName("dh.au(I)V")
    public static final void method2262() {
        int var0 = field541 + Statics.field368.field444;
        int var1 = field477 + Statics.field368.field420;
        if (Statics.field2602 - var0 < -500 || Statics.field2602 - var0 > 500 || Statics.field1370 - var1 < -500 || Statics.field1370 - var1 > 500) {
            Statics.field2602 = var0;
            Statics.field1370 = var1;
        }
        if (Statics.field2602 != var0) {
            Statics.field2602 += (var0 - Statics.field2602) / 16;
        }
        if (Statics.field1370 != var1) {
            Statics.field1370 += (var1 - Statics.field1370) / 16;
        }
        if (class77.field1404 == 4 && Statics.field377) {
            int var2 = class77.field1411 - field566;
            field609 = var2 * 2;
            field566 = var2 == -1 || var2 == 1 ? class77.field1411 : (field566 + class77.field1411) / 2;
            int var3 = field565 - class77.field1410;
            field563 = var3 * 2;
            field565 = var3 == -1 || var3 == 1 ? class77.field1410 : (field565 + class77.field1410) / 2;
        } else {
            if (class75.field1386[96]) {
                field563 += (-24 - field563) / 2;
            } else if (class75.field1386[97]) {
                field563 += (24 - field563) / 2;
            } else {
                field563 /= 2;
            }
            if (class75.field1386[98]) {
                field609 += (12 - field609) / 2;
            } else if (class75.field1386[99]) {
                field609 += (-12 - field609) / 2;
            } else {
                field609 /= 2;
            }
            field566 = class77.field1411;
            field565 = class77.field1410;
        }
        field562 = field563 / 2 + field562 & 0x7FF;
        field561 += field609 / 2;
        if (field561 < 128) {
            field561 = 128;
        }
        if (field561 > 383) {
            field561 = 383;
        }
        int var4 = Statics.field2602 >> 7;
        int var5 = Statics.field1370 >> 7;
        int var6 = method2151(Statics.field2602, Statics.field1370, Statics.field13);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field13;
                    if (var10 < 3 && (class9.field139[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class9.field149[var10][var8][var9];
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
        if (var12 > field569) {
            field569 += (var12 - field569) / 24;
        } else if (var12 < field569) {
            field569 += (var12 - field569) / 80;
        }
    }

    @ObfuscatedName("i.ag(Lav;II)V")
    public static final void method32(class27 arg0, int arg1) {
        if (arg0.field462 > field489) {
            int var2 = arg0.field462 - field489;
            int var3 = arg0.field458 * 128 + arg0.field423 * 64;
            int var4 = arg0.field460 * 128 + arg0.field423 * 64;
            arg0.field444 += (var3 - arg0.field444) / var2;
            arg0.field420 += (var4 - arg0.field420) / var2;
            arg0.field474 = 0;
            if (arg0.field443 == 0) {
                arg0.field467 = 1024;
            }
            if (arg0.field443 == 1) {
                arg0.field467 = 1536;
            }
            if (arg0.field443 == 2) {
                arg0.field467 = 0;
            }
            if (arg0.field443 == 3) {
                arg0.field467 = 512;
            }
        } else if (arg0.field437 >= field489) {
            if (field489 == arg0.field437 || arg0.field448 == -1 || arg0.field451 != 0 || arg0.field450 + 1 > Statics.method61(arg0.field448).field888[arg0.field425]) {
                int var5 = arg0.field437 - arg0.field462;
                int var6 = field489 - arg0.field462;
                int var7 = arg0.field458 * 128 + arg0.field423 * 64;
                int var8 = arg0.field460 * 128 + arg0.field423 * 64;
                int var9 = arg0.field459 * 128 + arg0.field423 * 64;
                int var10 = arg0.field461 * 128 + arg0.field423 * 64;
                arg0.field444 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field420 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field474 = 0;
            if (arg0.field443 == 0) {
                arg0.field467 = 1024;
            }
            if (arg0.field443 == 1) {
                arg0.field467 = 1536;
            }
            if (arg0.field443 == 2) {
                arg0.field467 = 0;
            }
            if (arg0.field443 == 3) {
                arg0.field467 = 512;
            }
            arg0.field431 = arg0.field467;
        } else {
            method1997(arg0);
        }
        if (arg0.field444 < 128 || arg0.field420 < 128 || arg0.field444 >= 13184 || arg0.field420 >= 13184) {
            arg0.field448 = -1;
            arg0.field453 = -1;
            arg0.field462 = 0;
            arg0.field437 = 0;
            arg0.field444 = arg0.field471[0] * 128 + arg0.field423 * 64;
            arg0.field420 = arg0.field472[0] * 128 + arg0.field423 * 64;
            arg0.method259();
        }
        if (Statics.field368 == arg0 && (arg0.field444 < 1536 || arg0.field420 < 1536 || arg0.field444 >= 11776 || arg0.field420 >= 11776)) {
            arg0.field448 = -1;
            arg0.field453 = -1;
            arg0.field462 = 0;
            arg0.field437 = 0;
            arg0.field444 = arg0.field471[0] * 128 + arg0.field423 * 64;
            arg0.field420 = arg0.field472[0] * 128 + arg0.field423 * 64;
            arg0.method259();
        }
        if (arg0.field469 != 0) {
            if (arg0.field452 != -1 && arg0.field452 < 32768) {
                class25 var11 = field516[arg0.field452];
                if (var11 != null) {
                    int var12 = arg0.field444 - var11.field444;
                    int var13 = arg0.field420 - var11.field420;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field467 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field452 >= 32768) {
                int var14 = arg0.field452 - 32768;
                if (field709 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field662[var14];
                if (var15 != null) {
                    int var16 = arg0.field444 - var15.field444;
                    int var17 = arg0.field420 - var15.field420;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field467 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field419 != 0 || arg0.field440 != 0) && (arg0.field475 == 0 || arg0.field474 > 0)) {
                int var18 = arg0.field444 - (arg0.field419 * 64 - Statics.field96 * 64 - Statics.field96 * 64);
                int var19 = arg0.field420 - (arg0.field440 * 64 - Statics.field92 * 64 - Statics.field92 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field467 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field419 = 0;
                arg0.field440 = 0;
            }
            int var20 = arg0.field467 - arg0.field431 & 0x7FF;
            if (var20 == 0) {
                arg0.field468 = 0;
            } else {
                arg0.field468++;
                if (var20 > 1024) {
                    arg0.field431 -= arg0.field469;
                    boolean var21 = true;
                    if (var20 < arg0.field469 || var20 > 2048 - arg0.field469) {
                        arg0.field431 = arg0.field467;
                        var21 = false;
                    }
                    if (arg0.field445 == arg0.field424 && (arg0.field468 > 25 || var21)) {
                        if (arg0.field464 == -1) {
                            arg0.field445 = arg0.field427;
                        } else {
                            arg0.field445 = arg0.field464;
                        }
                    }
                } else {
                    arg0.field431 += arg0.field469;
                    boolean var22 = true;
                    if (var20 < arg0.field469 || var20 > 2048 - arg0.field469) {
                        arg0.field431 = arg0.field467;
                        var22 = false;
                    }
                    if (arg0.field445 == arg0.field424 && (arg0.field468 > 25 || var22)) {
                        if (arg0.field426 == -1) {
                            arg0.field445 = arg0.field427;
                        } else {
                            arg0.field445 = arg0.field426;
                        }
                    }
                }
                arg0.field431 &= 0x7FF;
            }
        }
        arg0.field422 = false;
        if (arg0.field445 != -1) {
            class34 var24 = Statics.method61(arg0.field445);
            if (var24 == null || var24.field891 == null) {
                arg0.field445 = -1;
            } else {
                arg0.field463++;
                if (arg0.field446 < var24.field891.length && arg0.field463 > var24.field888[arg0.field446]) {
                    arg0.field463 = 1;
                    arg0.field446++;
                    method1513(var24, arg0.field446, arg0.field444, arg0.field420);
                }
                if (arg0.field446 >= var24.field891.length) {
                    arg0.field463 = 0;
                    arg0.field446 = 0;
                    method1513(var24, arg0.field446, arg0.field444, arg0.field420);
                }
            }
        }
        if (arg0.field453 != -1 && field489 >= arg0.field429) {
            if (arg0.field454 < 0) {
                arg0.field454 = 0;
            }
            int var25 = class35.method216(arg0.field453).field909;
            if (var25 == -1) {
                arg0.field453 = -1;
            } else {
                class34 var26 = Statics.method61(var25);
                if (var26 == null || var26.field891 == null) {
                    arg0.field453 = -1;
                } else {
                    arg0.field455++;
                    if (arg0.field454 < var26.field891.length && arg0.field455 > var26.field888[arg0.field454]) {
                        arg0.field455 = 1;
                        arg0.field454++;
                        method1513(var26, arg0.field454, arg0.field444, arg0.field420);
                    }
                    if (arg0.field454 >= var26.field891.length && (arg0.field454 < 0 || arg0.field454 >= var26.field891.length)) {
                        arg0.field453 = -1;
                    }
                }
            }
        }
        if (arg0.field448 != -1 && arg0.field451 <= 1) {
            class34 var27 = Statics.method61(arg0.field448);
            if (var27.field903 == 1 && arg0.field447 > 0 && arg0.field462 <= field489 && arg0.field437 < field489) {
                arg0.field451 = 1;
                return;
            }
        }
        if (arg0.field448 != -1 && arg0.field451 == 0) {
            class34 var28 = Statics.method61(arg0.field448);
            if (var28 == null || var28.field891 == null) {
                arg0.field448 = -1;
            } else {
                arg0.field450++;
                if (arg0.field425 < var28.field891.length && arg0.field450 > var28.field888[arg0.field425]) {
                    arg0.field450 = 1;
                    arg0.field425++;
                    method1513(var28, arg0.field425, arg0.field444, arg0.field420);
                }
                if (arg0.field425 >= var28.field891.length) {
                    arg0.field425 -= var28.field890;
                    arg0.field470++;
                    if (arg0.field470 >= var28.field896) {
                        arg0.field448 = -1;
                    } else if (arg0.field425 >= 0 && arg0.field425 < var28.field891.length) {
                        method1513(var28, arg0.field425, arg0.field444, arg0.field420);
                    } else {
                        arg0.field448 = -1;
                    }
                }
                arg0.field422 = var28.field892;
            }
        }
        if (arg0.field451 > 0) {
            arg0.field451--;
        }
    }

    @ObfuscatedName("cp.at(Lav;I)V")
    public static final void method1997(class27 arg0) {
        arg0.field445 = arg0.field424;
        if (arg0.field475 == 0) {
            arg0.field474 = 0;
            return;
        }
        if (arg0.field448 != -1 && arg0.field451 == 0) {
            class34 var1 = Statics.method61(arg0.field448);
            if (arg0.field447 > 0 && var1.field903 == 0) {
                arg0.field474++;
                return;
            }
            if (arg0.field447 <= 0 && var1.field898 == 0) {
                arg0.field474++;
                return;
            }
        }
        int var2 = arg0.field444;
        int var3 = arg0.field420;
        int var4 = arg0.field471[arg0.field475 - 1] * 128 + arg0.field423 * 64;
        int var5 = arg0.field472[arg0.field475 - 1] * 128 + arg0.field423 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field444 = var4;
            arg0.field420 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field467 = 1280;
            } else if (var3 > var5) {
                arg0.field467 = 1792;
            } else {
                arg0.field467 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field467 = 768;
            } else if (var3 > var5) {
                arg0.field467 = 256;
            } else {
                arg0.field467 = 512;
            }
        } else if (var3 < var5) {
            arg0.field467 = 1024;
        } else if (var3 > var5) {
            arg0.field467 = 0;
        }
        int var6 = arg0.field467 - arg0.field431 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field428;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field427;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field442;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field449;
        }
        if (var7 == -1) {
            var7 = arg0.field427;
        }
        arg0.field445 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field396.field808;
        }
        if (var9) {
            if (arg0.field467 != arg0.field431 && arg0.field452 == -1 && arg0.field469 != 0) {
                var8 = 2;
            }
            if (arg0.field475 > 2) {
                var8 = 6;
            }
            if (arg0.field475 > 3) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field475 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        } else {
            if (arg0.field475 > 1) {
                var8 = 6;
            }
            if (arg0.field475 > 2) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field475 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        }
        if (arg0.field473[arg0.field475 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field445 == arg0.field427 && arg0.field434 != -1) {
            arg0.field445 = arg0.field434;
        }
        if (var2 < var4) {
            arg0.field444 += var8;
            if (arg0.field444 > var4) {
                arg0.field444 = var4;
            }
        } else if (var2 > var4) {
            arg0.field444 -= var8;
            if (arg0.field444 < var4) {
                arg0.field444 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field420 += var8;
            if (arg0.field420 > var5) {
                arg0.field420 = var5;
            }
        } else if (var3 > var5) {
            arg0.field420 -= var8;
            if (arg0.field420 < var5) {
                arg0.field420 = var5;
            }
        }
        if (arg0.field444 == var4 && arg0.field420 == var5) {
            arg0.field475--;
            if (arg0.field447 > 0) {
                arg0.field447--;
            }
        }
    }

    @ObfuscatedName("dj.ac(Lj;IIB)V")
    public static void method2337(class3 arg0, int arg1, int arg2) {
        if (arg0.field448 == arg1 && arg1 != -1) {
            int var3 = Statics.method61(arg1).field897;
            if (var3 == 1) {
                arg0.field425 = 0;
                arg0.field450 = 0;
                arg0.field451 = arg2;
                arg0.field470 = 0;
            }
            if (var3 == 2) {
                arg0.field470 = 0;
            }
        } else if (arg1 == -1 || arg0.field448 == -1 || Statics.method61(arg1).field893 >= Statics.method61(arg0.field448).field893) {
            arg0.field448 = arg1;
            arg0.field425 = 0;
            arg0.field450 = 0;
            arg0.field451 = arg2;
            arg0.field470 = 0;
            arg0.field447 = arg0.field475;
        }
    }

    @ObfuscatedName("eb.aw(Ljava/lang/String;ZB)V")
    public static final void method2825(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field215.method3323(arg0, 250);
        int var6 = Statics.field215.method3381(arg0, 250) * 13;
        class89.method1770(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1759(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field215.method3340(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method29(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1998(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field869.getGraphics();
            Statics.field1541.method1582(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field869.repaint();
        }
    }

    @ObfuscatedName("ah.ah(ZI)V")
    public static final void method734(boolean arg0) {
        if (Statics.field368.field444 >> 7 == field713 && Statics.field368.field420 >> 7 == field710) {
            field713 = 0;
        }
        int var1 = field685;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field368;
                var4 = 33538048;
            } else {
                var3 = field662[field534[var2]];
                var4 = field534[var2] << 14;
            }
            if (var3 != null && var3.method14()) {
                var3.field44 = false;
                if ((field643 && field685 > 50 || field685 > 200) && !arg0 && var3.field445 == var3.field424) {
                    var3.field44 = true;
                }
                int var5 = var3.field444 >> 7;
                int var6 = var3.field420 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field35 == null || field489 < var3.field42 || field489 >= var3.field43) {
                        if ((var3.field444 & 0x7F) == 64 && (var3.field420 & 0x7F) == 64) {
                            if (field518 == field574[var5][var6]) {
                                continue;
                            }
                            field574[var5][var6] = field518;
                        }
                        var3.field41 = method2151(var3.field444, var3.field420, Statics.field13);
                        Statics.field1245.method1827(Statics.field13, var3.field444, var3.field420, var3.field41, 60, var3, var3.field431, var4, var3.field422);
                    } else {
                        var3.field44 = false;
                        var3.field41 = method2151(var3.field444, var3.field420, Statics.field13);
                        Statics.field1245.method1828(Statics.field13, var3.field444, var3.field420, var3.field41, 60, var3, var3.field431, var4, var3.field48, var3.field50, var3.field47, var3.field51);
                    }
                }
            }
        }
    }

    @ObfuscatedName("en.ai(ZI)V")
    public static final void method2669(boolean arg0) {
        for (int var1 = 0; var1 < field581; var1++) {
            class25 var2 = field516[field582[var1]];
            int var3 = (field582[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field396.field802 == arg0 && var2.field396.method595()) {
                int var4 = var2.field444 >> 7;
                int var5 = var2.field420 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field423 == 1 && (var2.field444 & 0x7F) == 64 && (var2.field420 & 0x7F) == 64) {
                        if (field518 == field574[var4][var5]) {
                            continue;
                        }
                        field574[var4][var5] = field518;
                    }
                    if (!var2.field396.field797) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1245.method1827(Statics.field13, var2.field444, var2.field420, method2151(var2.field444 + (var2.field423 * 64 - 64), var2.field420 + (var2.field423 * 64 - 64), Statics.field13), var2.field423 * 64 - 64 + 60, var2, var2.field431, var3, var2.field422);
                }
            }
        }
    }

    @ObfuscatedName("s.ap(I)V")
    public static final void method128() {
        for (class10 var0 = (class10) field527.method3246(); var0 != null; var0 = (class10) field527.method3248()) {
            if (Statics.field13 != var0.field165 || field489 > var0.field171) {
                var0.method3282();
            } else if (field489 >= var0.field170) {
                if (var0.field188 > 0) {
                    class25 var1 = field516[var0.field188 - 1];
                    if (var1 != null && var1.field444 >= 0 && var1.field444 < 13312 && var1.field420 >= 0 && var1.field420 < 13312) {
                        var0.method118(var1.field444, var1.field420, method2151(var1.field444, var1.field420, var0.field165) - var0.field184, field489);
                    }
                }
                if (var0.field188 < 0) {
                    int var2 = -var0.field188 - 1;
                    class3 var3;
                    if (field709 == var2) {
                        var3 = Statics.field368;
                    } else {
                        var3 = field662[var2];
                    }
                    if (var3 != null && var3.field444 >= 0 && var3.field444 < 13312 && var3.field420 >= 0 && var3.field420 < 13312) {
                        var0.method118(var3.field444, var3.field420, method2151(var3.field444, var3.field420, var0.field165) - var0.field184, field489);
                    }
                }
                var0.method116(field558);
                Statics.field1245.method1827(Statics.field13, (int) var0.field176, (int) var0.field177, (int) var0.field166, 60, var0, var0.field178, -1, false);
            }
        }
    }

    @ObfuscatedName("u.ad(B)V")
    public static final void method168() {
        for (class20 var0 = (class20) field614.method3246(); var0 != null; var0 = (class20) field614.method3248()) {
            if (Statics.field13 != var0.field303 || var0.field310) {
                var0.method3282();
            } else if (field489 >= var0.field302) {
                var0.method184(field558);
                if (var0.field310) {
                    var0.method3282();
                } else {
                    Statics.field1245.method1827(var0.field303, var0.field304, var0.field305, var0.field306, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("bo.ay(IIIII)V")
    public static final void method1265(int arg0, int arg1, int arg2, int arg3) {
        if (field587 == 1) {
            Statics.field98[field586 / 100].method1659(field593 - 8, field585 - 8);
        }
        if (field587 == 2) {
            Statics.field98[field586 / 100 + 4].method1659(field593 - 8, field585 - 8);
        }
        field596 = 0;
        int var4 = (Statics.field368.field444 >> 7) + Statics.field96;
        int var5 = (Statics.field368.field420 >> 7) + Statics.field92;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field596 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field596 = 1;
        }
        if (field596 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field596 = 0;
        }
        if (!field723) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field215.method3325("Fps:" + field1345, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field643) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field643) {
            var10 = 16711680;
        }
        Statics.field215.method3325("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("s.az(Lav;II)V")
    public static final void method136(class27 arg0, int arg1) {
        method224(arg0.field444, arg0.field420, arg1);
    }

    @ObfuscatedName("h.ab(IIIB)V")
    public static final void method224(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field525 = -1;
            field583 = -1;
            return;
        }
        int var3 = method2151(arg0, arg1, Statics.field13) - arg2;
        int var4 = arg0 - Statics.field707;
        int var5 = var3 - Statics.field399;
        int var6 = arg1 - Statics.field1356;
        int var7 = class104.field1800[Statics.field1858];
        int var8 = class104.field1801[Statics.field1858];
        int var9 = class104.field1800[Statics.field262];
        int var10 = class104.field1801[Statics.field262];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field525 = (var11 << 9) / var15 + 256;
            field583 = (var14 << 9) / var15 + 167;
        } else {
            field525 = -1;
            field583 = -1;
        }
    }

    @ObfuscatedName("dk.am(IIII)I")
    public static final int method2151(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field139[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field149[var5][var3][var4] + class9.field149[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field149[var5][var3][var4 + 1] + class9.field149[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("e.as(IIIIIIB)V")
    public static final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1800[var6];
            int var12 = class104.field1801[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1800[var7];
            int var15 = class104.field1801[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field707 = arg0 - var8;
        Statics.field399 = arg1 - var9;
        Statics.field1356 = arg2 - var10;
        Statics.field1858 = arg3;
        Statics.field262 = arg4;
    }

    @ObfuscatedName("an.aa(ZI)V")
    public static final void method538(boolean arg0) {
        field538 = arg0;
        if (!field538) {
            int var1 = field521.method2416();
            int var2 = field521.method2394();
            int var3 = (field522 - field521.field2051) / 16;
            Statics.field18 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field18[var4][var5] = field521.method2527();
                }
            }
            int var6 = field521.method2528();
            int var7 = field521.method2441();
            int var8 = field521.method2528();
            Statics.field2077 = new int[var3];
            Statics.field1298 = new int[var3];
            Statics.field103 = new int[var3];
            Statics.field476 = new byte[var3][];
            Statics.field923 = new byte[var3][];
            boolean var9 = false;
            if ((var6 / 8 == 48 || var6 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var6 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var6 - 6) / 8; var11 <= (var6 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2077[var10] = var13;
                        Statics.field1298[var10] = Statics.field1045.method2978("m" + var11 + "_" + var12);
                        Statics.field103[var10] = Statics.field1045.method2978("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1608(var6, var2, var1, var8, var7);
            return;
        }
        field521.method2292();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field521.method2276(1);
                    if (var17 == 1) {
                        field539[var14][var15][var16] = field521.method2276(26);
                    } else {
                        field539[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field521.method2288();
        int var18 = (field522 - field521.field2051) / 16;
        Statics.field18 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field18[var19][var20] = field521.method2527();
            }
        }
        int var21 = field521.method2528();
        int var22 = field521.method2389();
        int var23 = field521.method2416();
        int var24 = field521.method2528();
        int var25 = field521.method2389();
        Statics.field2077 = new int[var18];
        Statics.field1298 = new int[var18];
        Statics.field103 = new int[var18];
        Statics.field476 = new byte[var18][];
        Statics.field923 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field539[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2077[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2077[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1298[var26] = Statics.field1045.method2978("m" + var35 + "_" + var36);
                            Statics.field103[var26] = Statics.field1045.method2978("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1608(var22, var25, var23, var21, var24);
    }

    @ObfuscatedName("cy.af(IIIIII)V")
    public static final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1360 == arg0 && Statics.field976 == arg1 && field531 == arg2 || !field643) {
            return;
        }
        Statics.field1360 = arg0;
        Statics.field976 = arg1;
        field531 = arg2;
        if (!field643) {
            field531 = 0;
        }
        method222(25);
        method2825(class135.field2128, true);
        int var5 = Statics.field96;
        int var6 = Statics.field92;
        Statics.field96 = (arg0 - 6) * 8;
        Statics.field92 = (arg1 - 6) * 8;
        int var7 = Statics.field96 - var5;
        int var8 = Statics.field92 - var6;
        int var9 = Statics.field96;
        int var10 = Statics.field92;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field516[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field471[var13] -= var7;
                    var12.field472[var13] -= var8;
                }
                var12.field444 -= var7 * 128;
                var12.field420 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field662[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field471[var16] -= var7;
                    var15.field472[var16] -= var8;
                }
                var15.field444 -= var7 * 128;
                var15.field420 -= var8 * 128;
            }
        }
        Statics.field13 = arg2;
        Statics.field368.method251(arg3, arg4, false);
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
                        field611[var27][var23][var24] = field611[var27][var25][var26];
                    } else {
                        field611[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field737.method3246(); var28 != null; var28 = (class22) field737.method3248()) {
            var28.field352 -= var7;
            var28.field353 -= var8;
            if (var28.field352 < 0 || var28.field353 < 0 || var28.field352 >= 104 || var28.field353 >= 104) {
                var28.method3282();
            }
        }
        if (field713 != 0) {
            field713 -= var7;
            field710 -= var8;
        }
        field717 = 0;
        field673 = false;
        field704 = -1;
        field614.method3240();
        field527.method3240();
    }

    @ObfuscatedName("z.ax(ZI)V")
    public static final void method171(boolean arg0) {
        method2180();
        field571++;
        if (field571 < 50 && !arg0) {
            return;
        }
        field571 = 0;
        if (field530 || Statics.field1209 == null) {
            return;
        }
        field519.method2273(142);
        try {
            Statics.field1209.method1352(field519.field2056, 0, field519.field2051);
            field519.field2051 = 0;
        } catch (IOException var2) {
            field530 = true;
        }
    }

    @ObfuscatedName("p.aq(IIIIII)V")
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1245.method1882(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1245.method1844(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1573.field1498;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method46(var12);
            if (var13.field839 == -1) {
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
                class87 var14 = Statics.field244[var13.field839];
                if (var14 != null) {
                    int var15 = (var13.field825 * 4 - var14.field1504) / 2;
                    int var16 = (var13.field826 * 4 - var14.field1506) / 2;
                    var14.method1730(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field826) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1245.method1873(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1245.method1844(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method46(var21);
            if (var22.field839 != -1) {
                class87 var23 = Statics.field244[var22.field839];
                if (var23 != null) {
                    int var24 = (var22.field825 * 4 - var23.field1504) / 2;
                    int var25 = (var22.field826 * 4 - var23.field1506) / 2;
                    var23.method1730(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field826) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1573.field1498;
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
        int var29 = Statics.field1245.method1845(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method46(var30);
        if (var31.field839 == -1) {
            return;
        }
        class87 var32 = Statics.field244[var31.field839];
        if (var32 != null) {
            int var33 = (var31.field825 * 4 - var32.field1504) / 2;
            int var34 = (var31.field826 * 4 - var32.field1506) / 2;
            var32.method1730(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field826) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("s.ao(I)V")
    public static final void method137() {
        if (field523 == 221) {
            int var0 = field521.method2416();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1771;
            int var2 = (var0 & 0x7) + Statics.field100;
            int var3 = field521.method2394();
            int var4 = field521.method2416();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field521.method2416();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field368.field471[0] >= var1 - var8 && Statics.field368.field471[0] <= var1 + var8 && Statics.field368.field472[0] >= var2 - var8 && Statics.field368.field472[0] <= var2 + var8 && field716 != 0 && var6 > 0 && field717 < 50) {
                    field718[field717] = var3;
                    field719[field717] = var6;
                    field720[field717] = var7;
                    field535[field717] = null;
                    field721[field717] = (var1 << 16) + (var2 << 8) + var5;
                    field717++;
                }
            }
        }
        if (field523 == 253) {
            int var9 = field521.method2528();
            int var10 = field521.method2528();
            int var11 = field521.method2416();
            int var12 = (var11 >> 4 & 0x7) + Statics.field1771;
            int var13 = (var11 & 0x7) + Statics.field100;
            int var14 = field521.method2389();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && field709 != var9) {
                class17 var15 = new class17();
                var15.field280 = var14;
                var15.field275 = var10;
                if (field611[Statics.field13][var12][var13] == null) {
                    field611[Statics.field13][var12][var13] = new class177();
                }
                field611[Statics.field13][var12][var13].method3261(var15);
                method2327(var12, var13);
            }
        } else if (field523 == 210) {
            int var16 = field521.method2416();
            int var17 = (var16 >> 4 & 0x7) + Statics.field1771;
            int var18 = (var16 & 0x7) + Statics.field100;
            int var19 = field521.method2441();
            int var20 = field521.method2479();
            int var21 = var20 >> 2;
            int var22 = var20 & 0x3;
            int var23 = field540[var21];
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                method231(Statics.field13, var17, var18, var23, var19, var21, var22, 0, -1);
            }
        } else if (field523 == 108) {
            int var24 = field521.method2389();
            int var25 = field521.method2416();
            int var26 = (var25 >> 4 & 0x7) + Statics.field1771;
            int var27 = (var25 & 0x7) + Statics.field100;
            int var28 = field521.method2421();
            int var29 = var28 >> 2;
            int var30 = var28 & 0x3;
            int var31 = field540[var29];
            if (var26 >= 0 && var27 >= 0 && var26 < 103 && var27 < 103) {
                if (var31 == 0) {
                    class96 var32 = Statics.field1245.method1838(Statics.field13, var26, var27);
                    if (var32 != null) {
                        int var33 = var32.field1646 >> 14 & 0x7FFF;
                        if (var29 == 2) {
                            var32.field1639 = new class14(var33, 2, var30 + 4, Statics.field13, var26, var27, var24, false, var32.field1639);
                            var32.field1645 = new class14(var33, 2, var30 + 1 & 0x3, Statics.field13, var26, var27, var24, false, var32.field1645);
                        } else {
                            var32.field1639 = new class14(var33, var29, var30, Statics.field13, var26, var27, var24, false, var32.field1639);
                        }
                    }
                }
                if (var31 == 1) {
                    class108 var34 = Statics.field1245.method1839(Statics.field13, var26, var27);
                    if (var34 != null) {
                        int var35 = var34.field1828 >> 14 & 0x7FFF;
                        if (var29 == 4 || var29 == 5) {
                            var34.field1834 = new class14(var35, 4, var30, Statics.field13, var26, var27, var24, false, var34.field1834);
                        } else if (var29 == 6) {
                            var34.field1834 = new class14(var35, 4, var30 + 4, Statics.field13, var26, var27, var24, false, var34.field1834);
                        } else if (var29 == 7) {
                            var34.field1834 = new class14(var35, 4, (var30 + 2 & 0x3) + 4, Statics.field13, var26, var27, var24, false, var34.field1834);
                        } else if (var29 == 8) {
                            var34.field1834 = new class14(var35, 4, var30 + 4, Statics.field13, var26, var27, var24, false, var34.field1834);
                            var34.field1822 = new class14(var35, 4, (var30 + 2 & 0x3) + 4, Statics.field13, var26, var27, var24, false, var34.field1822);
                        }
                    }
                }
                if (var31 == 2) {
                    class98 var36 = Statics.field1245.method1840(Statics.field13, var26, var27);
                    if (var29 == 11) {
                        var29 = 10;
                    }
                    if (var36 != null) {
                        var36.field1669 = new class14(var36.field1675 >> 14 & 0x7FFF, var29, var30, Statics.field13, var26, var27, var24, false, var36.field1669);
                    }
                }
                if (var31 == 3) {
                    class107 var37 = Statics.field1245.method1989(Statics.field13, var26, var27);
                    if (var37 != null) {
                        var37.field1810 = new class14(var37.field1814 >> 14 & 0x7FFF, 22, var30, Statics.field13, var26, var27, var24, false, var37.field1810);
                    }
                }
            }
        } else if (field523 == 114) {
            int var38 = field521.method2416();
            int var39 = (var38 >> 4 & 0x7) + Statics.field1771;
            int var40 = (var38 & 0x7) + Statics.field100;
            int var41 = field521.method2416();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field540[var42];
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                method231(Statics.field13, var39, var40, var44, -1, var42, var43, 0, -1);
            }
        } else if (field523 == 232) {
            int var45 = field521.method2416();
            int var46 = (var45 >> 4 & 0x7) + Statics.field1771;
            int var47 = (var45 & 0x7) + Statics.field100;
            int var48 = field521.method2394();
            int var49 = field521.method2394();
            int var50 = field521.method2394();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class177 var51 = field611[Statics.field13][var46][var47];
                if (var51 != null) {
                    for (class17 var52 = (class17) var51.method3246(); var52 != null; var52 = (class17) var51.method3248()) {
                        if ((var48 & 0x7FFF) == var52.field280 && var52.field275 == var49) {
                            var52.field275 = var50;
                            break;
                        }
                    }
                    method2327(var46, var47);
                }
            }
        } else if (field523 == 95) {
            int var53 = field521.method2394();
            int var54 = field521.method2419();
            int var55 = (var54 >> 4 & 0x7) + Statics.field1771;
            int var56 = (var54 & 0x7) + Statics.field100;
            int var57 = field521.method2528();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                class17 var58 = new class17();
                var58.field280 = var53;
                var58.field275 = var57;
                if (field611[Statics.field13][var55][var56] == null) {
                    field611[Statics.field13][var55][var56] = new class177();
                }
                field611[Statics.field13][var55][var56].method3261(var58);
                method2327(var55, var56);
            }
        } else if (field523 == 10) {
            int var59 = field521.method2389();
            int var60 = field521.method2416();
            int var61 = (var60 >> 4 & 0x7) + Statics.field1771;
            int var62 = (var60 & 0x7) + Statics.field100;
            if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                class177 var63 = field611[Statics.field13][var61][var62];
                if (var63 != null) {
                    for (class17 var64 = (class17) var63.method3246(); var64 != null; var64 = (class17) var63.method3248()) {
                        if ((var59 & 0x7FFF) == var64.field280) {
                            var64.method3282();
                            break;
                        }
                    }
                    if (var63.method3246() == null) {
                        field611[Statics.field13][var61][var62] = null;
                    }
                    method2327(var61, var62);
                }
            }
        } else if (field523 == 250) {
            int var65 = field521.method2416();
            int var66 = (var65 >> 4 & 0x7) + Statics.field1771;
            int var67 = (var65 & 0x7) + Statics.field100;
            int var68 = field521.method2394();
            int var69 = field521.method2416();
            int var70 = field521.method2394();
            if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                int var71 = var66 * 128 + 64;
                int var72 = var67 * 128 + 64;
                class20 var73 = new class20(var68, Statics.field13, var71, var72, method2151(var71, var72, Statics.field13) - var69, var70, field489);
                field614.method3261(var73);
            }
        } else if (field523 == 25) {
            int var74 = field521.method2416();
            int var75 = (var74 >> 4 & 0x7) + Statics.field1771;
            int var76 = (var74 & 0x7) + Statics.field100;
            int var77 = var75 + field521.method2397();
            int var78 = var76 + field521.method2397();
            int var79 = field521.method2399();
            int var80 = field521.method2394();
            int var81 = field521.method2416() * 4;
            int var82 = field521.method2416() * 4;
            int var83 = field521.method2394();
            int var84 = field521.method2394();
            int var85 = field521.method2416();
            int var86 = field521.method2416();
            if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var80 != 65535) {
                int var87 = var75 * 128 + 64;
                int var88 = var76 * 128 + 64;
                int var89 = var77 * 128 + 64;
                int var90 = var78 * 128 + 64;
                class10 var91 = new class10(var80, Statics.field13, var87, var88, method2151(var87, var88, Statics.field13) - var81, field489 + var83, field489 + var84, var85, var86, var79, var82);
                var91.method118(var89, var90, method2151(var89, var90, Statics.field13) - var82, field489 + var83);
                field527.method3261(var91);
            }
        } else if (field523 == 36) {
            int var92 = field521.method2419();
            int var93 = var92 >> 2;
            int var94 = var92 & 0x3;
            int var95 = field540[var93];
            byte var96 = field521.method2422();
            int var97 = field521.method2421();
            int var98 = (var97 >> 4 & 0x7) + Statics.field1771;
            int var99 = (var97 & 0x7) + Statics.field100;
            byte var100 = field521.method2422();
            byte var101 = field521.method2509();
            byte var102 = field521.method2424();
            int var103 = field521.method2389();
            int var104 = field521.method2389();
            int var105 = field521.method2389();
            int var106 = field521.method2441();
            class3 var107;
            if (field709 == var104) {
                var107 = Statics.field368;
            } else {
                var107 = field662[var104];
            }
            if (var107 != null) {
                class32 var108 = class32.method46(var106);
                int var109;
                int var110;
                if (var94 == 1 || var94 == 3) {
                    var109 = var108.field826;
                    var110 = var108.field825;
                } else {
                    var109 = var108.field825;
                    var110 = var108.field826;
                }
                int var111 = (var109 >> 1) + var98;
                int var112 = (var109 + 1 >> 1) + var98;
                int var113 = (var110 >> 1) + var99;
                int var114 = (var110 + 1 >> 1) + var99;
                int[][] var115 = class9.field149[Statics.field13];
                int var116 = var115[var111][var113] + var115[var112][var113] + var115[var111][var114] + var115[var112][var114] >> 2;
                int var117 = (var98 << 7) + (var109 << 6);
                int var118 = (var99 << 7) + (var110 << 6);
                class112 var119 = var108.method656(var93, var94, var115, var117, var116, var118);
                if (var119 != null) {
                    method231(Statics.field13, var98, var99, var95, -1, 0, 0, var105 + 1, var103 + 1);
                    var107.field42 = field489 + var105;
                    var107.field43 = field489 + var103;
                    var107.field35 = var119;
                    var107.field45 = var98 * 128 + var109 * 64;
                    var107.field46 = var99 * 128 + var110 * 64;
                    var107.field49 = var116;
                    if (var101 > var102) {
                        byte var120 = var101;
                        var101 = var102;
                        var102 = var120;
                    }
                    if (var100 > var96) {
                        byte var121 = var100;
                        var100 = var96;
                        var96 = var121;
                    }
                    var107.field48 = var98 + var101;
                    var107.field47 = var98 + var102;
                    var107.field50 = var99 + var100;
                    var107.field51 = var96 + var99;
                }
            }
        }
    }

    @ObfuscatedName("p.ar(IIIIIIIIII)V")
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field737.method3246(); var10 != null; var10 = (class22) field737.method3248()) {
            if (var10.field351 == arg0 && var10.field352 == arg1 && var10.field353 == arg2 && var10.field357 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field351 = arg0;
            var9.field357 = arg3;
            var9.field352 = arg1;
            var9.field353 = arg2;
            method186(var9);
            field737.method3261(var9);
        }
        var9.field356 = arg4;
        var9.field350 = arg5;
        var9.field360 = arg6;
        var9.field358 = arg7;
        var9.field361 = arg8;
    }

    @ObfuscatedName("m.aj(La;B)V")
    public static final void method186(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field357 == 0) {
            var1 = Statics.field1245.method1882(arg0.field351, arg0.field352, arg0.field353);
        }
        if (arg0.field357 == 1) {
            var1 = Statics.field1245.method1985(arg0.field351, arg0.field352, arg0.field353);
        }
        if (arg0.field357 == 2) {
            var1 = Statics.field1245.method1873(arg0.field351, arg0.field352, arg0.field353);
        }
        if (arg0.field357 == 3) {
            var1 = Statics.field1245.method1845(arg0.field351, arg0.field352, arg0.field353);
        }
        if (var1 != 0) {
            int var5 = Statics.field1245.method1844(arg0.field351, arg0.field352, arg0.field353, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field354 = var2;
        arg0.field359 = var3;
        arg0.field355 = var4;
    }

    @ObfuscatedName("f.al(I)V")
    public static final void method214() {
        for (class22 var0 = (class22) field737.method3246(); var0 != null; var0 = (class22) field737.method3248()) {
            if (var0.field361 > 0) {
                var0.field361--;
            }
            if (var0.field361 == 0) {
                if (var0.field354 >= 0) {
                    int var1 = var0.field354;
                    int var2 = var0.field359;
                    class32 var3 = class32.method46(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method624(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1220(var0.field351, var0.field357, var0.field352, var0.field353, var0.field354, var0.field355, var0.field359);
                var0.method3282();
            } else {
                if (var0.field358 > 0) {
                    var0.field358--;
                }
                if (var0.field358 == 0 && var0.field352 >= 1 && var0.field353 >= 1 && var0.field352 <= 102 && var0.field353 <= 102) {
                    if (var0.field356 >= 0) {
                        int var5 = var0.field356;
                        int var6 = var0.field350;
                        class32 var7 = class32.method46(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method624(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1220(var0.field351, var0.field357, var0.field352, var0.field353, var0.field356, var0.field360, var0.field350);
                    var0.field358 = -1;
                    if (var0.field356 == var0.field354 && var0.field354 == -1) {
                        var0.method3282();
                    } else if (var0.field356 == var0.field354 && var0.field360 == var0.field355 && var0.field359 == var0.field350) {
                        var0.method3282();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.ak(IIIIIIII)V")
    public static final void method1220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field643 && Statics.field13 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1245.method1882(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1245.method1985(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1245.method1873(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1245.method1845(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1245.method1844(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1245.method1833(arg0, arg2, arg3);
                class32 var15 = class32.method46(var12);
                if (var15.field827 != 0) {
                    field537[arg0].method2638(arg2, arg3, var13, var14, var15.field858);
                }
            }
            if (arg1 == 1) {
                Statics.field1245.method1834(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1245.method1835(arg0, arg2, arg3);
                class32 var16 = class32.method46(var12);
                if (var16.field825 + arg2 > 103 || var16.field825 + arg3 > 103 || var16.field826 + arg2 > 103 || var16.field826 + arg3 > 103) {
                    return;
                }
                if (var16.field827 != 0) {
                    field537[arg0].method2639(arg2, arg3, var16.field825, var16.field826, var14, var16.field858);
                }
            }
            if (arg1 == 3) {
                Statics.field1245.method1836(arg0, arg2, arg3);
                class32 var17 = class32.method46(var12);
                if (var17.field827 == 1) {
                    field537[arg0].method2641(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field139[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method667(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1245, field537[arg0]);
    }

    @ObfuscatedName("do.bj(III)V")
    public static final void method2327(int arg0, int arg1) {
        class177 var2 = field611[Statics.field13][arg0][arg1];
        if (var2 == null) {
            Statics.field1245.method1837(Statics.field13, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3246(); var6 != null; var6 = (class17) var2.method3248()) {
            class40 var7 = class40.method1565(var6.field280);
            long var8 = (long) var7.field996;
            if (var7.field995 == 1) {
                var8 = (long) (var6.field275 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1245.method1837(Statics.field13, arg0, arg1);
            return;
        }
        var2.method3242(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3246(); var12 != null; var12 = (class17) var2.method3248()) {
            if (var5.field280 != var12.field280) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field280 != var12.field280 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1245.method1823(Statics.field13, arg0, arg1, method2151(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field13), var5, var13, var10, var11);
    }

    @ObfuscatedName("bd.bk(I)V")
    public static final void method1343() {
        field605 = 0;
        field600 = 0;
        field521.method2292();
        int var0 = field521.method2276(1);
        if (var0 != 0) {
            int var1 = field521.method2276(2);
            if (var1 == 0) {
                field601[++field600 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field521.method2276(3);
                Statics.field368.method254(var2, false);
                int var3 = field521.method2276(1);
                if (var3 == 1) {
                    field601[++field600 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field521.method2276(3);
                Statics.field368.method254(var4, true);
                int var5 = field521.method2276(3);
                Statics.field368.method254(var5, true);
                int var6 = field521.method2276(1);
                if (var6 == 1) {
                    field601[++field600 - 1] = 2047;
                }
            } else if (var1 == 3) {
                Statics.field13 = field521.method2276(2);
                int var7 = field521.method2276(1);
                if (var7 == 1) {
                    field601[++field600 - 1] = 2047;
                }
                int var8 = field521.method2276(7);
                int var9 = field521.method2276(7);
                int var10 = field521.method2276(1);
                Statics.field368.method251(var8, var9, var10 == 1);
            }
        }
        int var11 = field521.method2276(8);
        if (var11 < field685) {
            for (int var12 = var11; var12 < field685; var12++) {
                field599[++field605 - 1] = field534[var12];
            }
        }
        if (var11 > field685) {
            throw new RuntimeException("");
        }
        field685 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field534[var13];
            class3 var15 = field662[var14];
            int var16 = field521.method2276(1);
            if (var16 == 0) {
                field534[++field685 - 1] = var14;
                var15.field465 = field489;
            } else {
                int var17 = field521.method2276(2);
                if (var17 == 0) {
                    field534[++field685 - 1] = var14;
                    var15.field465 = field489;
                    field601[++field600 - 1] = var14;
                } else if (var17 == 1) {
                    field534[++field685 - 1] = var14;
                    var15.field465 = field489;
                    int var18 = field521.method2276(3);
                    var15.method254(var18, false);
                    int var19 = field521.method2276(1);
                    if (var19 == 1) {
                        field601[++field600 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field534[++field685 - 1] = var14;
                    var15.field465 = field489;
                    int var20 = field521.method2276(3);
                    var15.method254(var20, true);
                    int var21 = field521.method2276(3);
                    var15.method254(var21, true);
                    int var22 = field521.method2276(1);
                    if (var22 == 1) {
                        field601[++field600 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field599[++field605 - 1] = var14;
                }
            }
        }
        while (field521.method2278(field522) >= 11) {
            int var23 = field521.method2276(11);
            if (var23 == 2047) {
                break;
            }
            boolean var27 = false;
            if (field662[var23] == null) {
                field662[var23] = new class3();
                if (field602[var23] != null) {
                    field662[var23].method23(field602[var23]);
                }
                var27 = true;
            }
            field534[++field685 - 1] = var23;
            class3 var28 = field662[var23];
            var28.field465 = field489;
            int var29 = field521.method2276(1);
            int var30 = field610[field521.method2276(3)];
            if (var27) {
                var28.field467 = var28.field431 = var30;
            }
            int var31 = field521.method2276(5);
            if (var31 > 15) {
                var31 -= 32;
            }
            int var32 = field521.method2276(5);
            if (var32 > 15) {
                var32 -= 32;
            }
            int var33 = field521.method2276(1);
            if (var33 == 1) {
                field601[++field600 - 1] = var23;
            }
            var28.method251(Statics.field368.field471[0] + var32, Statics.field368.field472[0] + var31, var29 == 1);
        }
        field521.method2288();
        method1813();
        for (int var24 = 0; var24 < field605; var24++) {
            int var25 = field599[var24];
            if (field489 != field662[var25].field465) {
                field662[var25] = null;
            }
        }
        if (field522 != field521.field2051) {
            throw new RuntimeException(field521.field2051 + class2.field20 + field522);
        }
        for (int var26 = 0; var26 < field685; var26++) {
            if (field662[field534[var26]] == null) {
                throw new RuntimeException(var26 + class2.field20 + field685);
            }
        }
    }

    @ObfuscatedName("cm.bm(I)V")
    public static final void method1813() {
        for (int var0 = 0; var0 < field600; var0++) {
            int var1 = field601[var0];
            class3 var2 = field662[var1];
            int var3 = field521.method2416();
            if ((var3 & 0x40) != 0) {
                var3 += field521.method2416() << 8;
            }
            if ((var3 & 0x100) != 0) {
                var2.field453 = field521.method2441();
                int var4 = field521.method2437();
                var2.field457 = var4 >> 16;
                var2.field429 = (var4 & 0xFFFF) + field489;
                var2.field454 = 0;
                var2.field455 = 0;
                if (var2.field429 > field489) {
                    var2.field454 = -1;
                }
                if (var2.field453 == 65535) {
                    var2.field453 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var5 = field521.method2528();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field521.method2416();
                method2337(var2, var5, var6);
            }
            if ((var3 & 0x8) != 0) {
                var2.field452 = field521.method2528();
                if (var2.field452 == 65535) {
                    var2.field452 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field419 = field521.method2389();
                var2.field440 = field521.method2394();
            }
            if ((var3 & 0x200) != 0) {
                int var7 = field521.method2421();
                int var8 = field521.method2419();
                var2.method252(var7, var8, field489);
                var2.field439 = field489 + 300;
                var2.field441 = field521.method2479();
                var2.field456 = field521.method2479();
            }
            if ((var3 & 0x400) != 0) {
                var2.field458 = field521.method2419();
                var2.field460 = field521.method2419();
                var2.field459 = field521.method2421();
                var2.field461 = field521.method2479();
                var2.field462 = field521.method2394() + field489;
                var2.field437 = field521.method2441() + field489;
                var2.field443 = field521.method2419();
                var2.field475 = 1;
                var2.field447 = 0;
            }
            if ((var3 & 0x10) != 0) {
                int var9 = field521.method2421();
                byte[] var10 = new byte[var9];
                class127 var11 = new class127(var10);
                field521.method2466(var10, 0, var9);
                field602[var1] = var11;
                var2.method23(var11);
            }
            if ((var3 & 0x80) != 0) {
                var2.field432 = field521.method2473();
                if (var2.field432.charAt(0) == '~') {
                    var2.field432 = var2.field432.substring(1);
                    method112(2, var2.field52, var2.field432);
                } else if (Statics.field368 == var2) {
                    method112(2, var2.field52, var2.field432);
                }
                var2.field421 = 0;
                var2.field435 = 0;
                var2.field433 = 150;
            }
            if ((var3 & 0x2) != 0) {
                int var12 = field521.method2394();
                int var13 = field521.method2479();
                int var14 = field521.method2479();
                int var15 = field521.field2051;
                if (var2.field52 != null && var2.field36 != null) {
                    boolean var16 = false;
                    if (var13 <= 1 && method157(var2.field52)) {
                        var16 = true;
                    }
                    if (!var16 && field596 == 0) {
                        field505.field2051 = 0;
                        field521.method2440(field505.field2056, 0, var14);
                        field505.field2051 = 0;
                        String var17 = class185.method3371(class148.method2668(class184.method154(field505)));
                        var2.field432 = var17.trim();
                        var2.field421 = var12 >> 8;
                        var2.field435 = var12 & 0xFF;
                        var2.field433 = 150;
                        if (var13 == 2 || var13 == 3) {
                            method112(1, class2.method10(1) + var2.field52, var17);
                        } else if (var13 == 1) {
                            method112(1, class2.method10(0) + var2.field52, var17);
                        } else {
                            method112(2, var2.field52, var17);
                        }
                    }
                }
                field521.field2051 = var14 + var15;
            }
            if ((var3 & 0x20) != 0) {
                int var18 = field521.method2419();
                int var19 = field521.method2419();
                var2.method252(var18, var19, field489);
                var2.field439 = field489 + 300;
                var2.field441 = field521.method2421();
                var2.field456 = field521.method2416();
            }
        }
    }

    @ObfuscatedName("db.bq(I)V")
    public static final void method2269() {
        field521.method2292();
        int var0 = field521.method2276(8);
        if (var0 < field581) {
            for (int var1 = var0; var1 < field581; var1++) {
                field599[++field605 - 1] = field582[var1];
            }
        }
        if (var0 > field581) {
            throw new RuntimeException("");
        }
        field581 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field582[var2];
            class25 var4 = field516[var3];
            int var5 = field521.method2276(1);
            if (var5 == 0) {
                field582[++field581 - 1] = var3;
                var4.field465 = field489;
            } else {
                int var6 = field521.method2276(2);
                if (var6 == 0) {
                    field582[++field581 - 1] = var3;
                    var4.field465 = field489;
                    field601[++field600 - 1] = var3;
                } else if (var6 == 1) {
                    field582[++field581 - 1] = var3;
                    var4.field465 = field489;
                    int var7 = field521.method2276(3);
                    var4.method254(var7, false);
                    int var8 = field521.method2276(1);
                    if (var8 == 1) {
                        field601[++field600 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field582[++field581 - 1] = var3;
                    var4.field465 = field489;
                    int var9 = field521.method2276(3);
                    var4.method254(var9, true);
                    int var10 = field521.method2276(3);
                    var4.method254(var10, true);
                    int var11 = field521.method2276(1);
                    if (var11 == 1) {
                        field601[++field600 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field599[++field605 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("l.bh(I)V")
    public static final void method164() {
        while (true) {
            if (field521.method2278(field522) >= 27) {
                int var0 = field521.method2276(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field516[var0] == null) {
                        field516[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field516[var0];
                    field582[++field581 - 1] = var0;
                    var2.field465 = field489;
                    int var3 = field521.method2276(1);
                    if (var3 == 1) {
                        field601[++field600 - 1] = var0;
                    }
                    var2.field396 = class31.method1217(field521.method2276(14));
                    int var4 = field521.method2276(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field521.method2276(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field610[field521.method2276(3)];
                    if (var1) {
                        var2.field467 = var2.field431 = var6;
                    }
                    int var7 = field521.method2276(1);
                    var2.field423 = var2.field396.field781;
                    var2.field469 = var2.field396.field794;
                    if (var2.field469 == 0) {
                        var2.field431 = 0;
                    }
                    var2.field427 = var2.field396.field786;
                    var2.field428 = var2.field396.field807;
                    var2.field449 = var2.field396.field788;
                    var2.field442 = var2.field396.field787;
                    var2.field424 = var2.field396.field783;
                    var2.field464 = var2.field396.field784;
                    var2.field426 = var2.field396.field798;
                    var2.method251(Statics.field368.field471[0] + var4, Statics.field368.field472[0] + var5, var7 == 1);
                    continue;
                }
            }
            field521.method2288();
            return;
        }
    }

    @ObfuscatedName("i.bx(IIIII)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field678; var4++) {
            if (field683[var4] + field612[var4] > arg0 && field683[var4] < arg0 + arg2 && field736[var4] + field686[var4] > arg1 && field736[var4] < arg1 + arg3) {
                field680[var4] = true;
            }
        }
    }

    @ObfuscatedName("cp.bw(IIIII)V")
    public static final void method1998(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field678; var4++) {
            if (field683[var4] + field612[var4] > arg0 && field683[var4] < arg0 + arg2 && field736[var4] + field686[var4] > arg1 && field736[var4] < arg1 + arg3) {
                field681[var4] = true;
            }
        }
    }

    @ObfuscatedName("dn.bl(IB)V")
    public static final void method2188(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field621[arg0];
        int var2 = field622[arg0];
        int var3 = field672[arg0];
        int var4 = field603[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 1002) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field519.method2273(218);
            field519.method2425(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 17) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(67);
            field519.method2427(var4);
            field519.method2412(Statics.field742);
            field519.method2427(Statics.field96 + var1);
            field519.method2427(Statics.field92 + var2);
            field519.method2425(field634);
        }
        if (var3 == 57 || var3 == 1007) {
            String var5 = field694[arg0];
            class159 var6 = class159.method2673(var2, var1);
            if (var6 != null) {
                if (var6.field2735 != null) {
                    class1 var7 = new class1();
                    var7.field1 = var6;
                    var7.field6 = var4;
                    var7.field8 = var5;
                    var7.field15 = var6.field2735;
                    class26.method1493(var7);
                }
                boolean var8 = true;
                if (var6.field2622 > 0) {
                    var8 = method170(var6);
                }
                if (var8 && class163.method1996(method2824(var6), var4 - 1)) {
                    if (var4 == 1) {
                        field519.method2273(213);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 2) {
                        field519.method2273(120);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 3) {
                        field519.method2273(170);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 4) {
                        field519.method2273(247);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 5) {
                        field519.method2273(138);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 6) {
                        field519.method2273(0);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 7) {
                        field519.method2273(3);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 8) {
                        field519.method2273(176);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 9) {
                        field519.method2273(229);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                    if (var4 == 10) {
                        field519.method2273(168);
                        field519.method2385(var2);
                        field519.method2576(var1);
                    }
                }
            }
        }
        if (var3 == 44) {
            class3 var9 = field662[var4];
            if (var9 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(33);
                field519.method2576(var4);
            }
        }
        if (var3 == 28) {
            field519.method2273(118);
            field519.method2385(var2);
            class159 var10 = class159.method2333(var2);
            if (var10.field2668 != null && var10.field2668[0][0] == 5) {
                int var11 = var10.field2668[0][1];
                class160.field2742[var11] = 1 - class160.field2742[var11];
                method21(var11);
            }
        }
        if (var3 == 21) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(156);
            field519.method2425(Statics.field96 + var1);
            field519.method2576(var4);
            field519.method2427(Statics.field92 + var2);
        }
        if (var3 == 34) {
            field519.method2273(92);
            field519.method2426(var4);
            field519.method2435(var2);
            field519.method2425(var1);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 9) {
            class25 var12 = field516[var4];
            if (var12 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(175);
                field519.method2427(var4);
            }
        }
        if (var3 == 45) {
            class3 var13 = field662[var4];
            if (var13 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(166);
                field519.method2426(var4);
            }
        }
        if (var3 == 48) {
            class3 var14 = field662[var4];
            if (var14 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(27);
                field519.method2425(var4);
            }
        }
        if (var3 == 19) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(76);
            field519.method2426(var4);
            field519.method2425(Statics.field92 + var2);
            field519.method2427(Statics.field96 + var1);
        }
        if (var3 == 5) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(60);
            field519.method2426(Statics.field96 + var1);
            field519.method2576(Statics.field92 + var2);
            field519.method2426(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 29) {
            field519.method2273(118);
            field519.method2385(var2);
            class159 var15 = class159.method2333(var2);
            if (var15.field2668 != null && var15.field2668[0][0] == 5) {
                int var16 = var15.field2668[0][1];
                if (class160.field2742[var16] != var15.field2716[0]) {
                    class160.field2742[var16] = var15.field2716[0];
                    method21(var16);
                }
            }
        }
        if (var3 == 7) {
            class25 var17 = field516[var4];
            if (var17 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(134);
                field519.method2576(Statics.field397);
                field519.method2427(Statics.field3);
                field519.method2427(var4);
                field519.method2433(Statics.field865);
            }
        }
        if (var3 == 30 && field570 == null) {
            method115(var2, var1);
            field570 = class159.method2673(var2, var1);
            method728(field570);
        }
        if (var3 == 11) {
            class25 var18 = field516[var4];
            if (var18 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(182);
                field519.method2427(var4);
            }
        }
        if (var3 == 1004) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field519.method2273(140);
            field519.method2427(var4);
        }
        if (var3 == 3) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(126);
            field519.method2426(Statics.field92 + var2);
            field519.method2425(var4 >> 14 & 0x7FFF);
            field519.method2576(Statics.field96 + var1);
        }
        if (var3 == 43) {
            field519.method2273(224);
            field519.method2427(var1);
            field519.method2576(var4);
            field519.method2412(var2);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 6) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(189);
            field519.method2425(var4 >> 14 & 0x7FFF);
            field519.method2425(Statics.field92 + var2);
            field519.method2426(Statics.field96 + var1);
        }
        if (var3 == 24) {
            class159 var19 = class159.method2333(var2);
            boolean var20 = true;
            if (var19.field2622 > 0) {
                var20 = method170(var19);
            }
            if (var20) {
                field519.method2273(118);
                field519.method2385(var2);
            }
        }
        if (var3 == 25) {
            class159 var21 = class159.method2673(var2, var1);
            if (var21 != null) {
                method1814();
                method236(var2, var1, class163.method1514(method2824(var21)));
                field631 = 0;
                field656 = method235(var21);
                if (field656 == null) {
                    field656 = "Null";
                }
                if (var21.field2617) {
                    field690 = var21.field2678 + class2.method1344(16777215);
                } else {
                    field690 = class2.method1344(65280) + var21.field2709 + class2.method1344(16777215);
                }
            }
            return;
        }
        if (var3 == 10) {
            class25 var22 = field516[var4];
            if (var22 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(78);
                field519.method2576(var4);
            }
        }
        if (var3 == 15) {
            class3 var23 = field662[var4];
            if (var23 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(110);
                field519.method2427(field634);
                field519.method2425(var4);
                field519.method2435(Statics.field742);
            }
        }
        if (var3 == 33) {
            field519.method2273(146);
            field519.method2425(var4);
            field519.method2412(var2);
            field519.method2576(var1);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 1005) {
            class159 var24 = class159.method2333(var2);
            if (var24 == null || var24.field2721[var1] < 100000) {
                field519.method2273(140);
                field519.method2427(var4);
            } else {
                method112(0, "", var24.field2721[var1] + " x " + class40.method1565(var4).field977);
            }
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 18) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(157);
            field519.method2427(Statics.field96 + var1);
            field519.method2576(var4);
            field519.method2576(Statics.field92 + var2);
        }
        if (var3 == 37) {
            field519.method2273(116);
            field519.method2412(var2);
            field519.method2427(var1);
            field519.method2576(var4);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 22) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(58);
            field519.method2576(var4);
            field519.method2425(Statics.field96 + var1);
            field519.method2426(Statics.field92 + var2);
        }
        if (var3 == 39) {
            field519.method2273(39);
            field519.method2412(var2);
            field519.method2426(var4);
            field519.method2427(var1);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 58) {
            field519.method2273(212);
            field519.method2435(var2);
            field519.method2435(Statics.field742);
            field519.method2427(var1);
            field519.method2425(field634);
        }
        if (var3 == 47) {
            class3 var25 = field662[var4];
            if (var25 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(80);
                field519.method2426(var4);
            }
        }
        if (var3 == 26) {
            method1384();
        }
        if (var3 == 46) {
            class3 var26 = field662[var4];
            if (var26 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(219);
                field519.method2425(var4);
            }
        }
        if (var3 == 41) {
            field519.method2273(139);
            field519.method2433(var2);
            field519.method2427(var1);
            field519.method2425(var4);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 14) {
            class3 var27 = field662[var4];
            if (var27 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(246);
                field519.method2385(Statics.field865);
                field519.method2425(Statics.field3);
                field519.method2427(Statics.field397);
                field519.method2427(var4);
            }
        }
        if (var3 == 36) {
            field519.method2273(159);
            field519.method2576(var1);
            field519.method2412(var2);
            field519.method2426(var4);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 8) {
            class25 var28 = field516[var4];
            if (var28 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(164);
                field519.method2385(Statics.field742);
                field519.method2427(field634);
                field519.method2427(var4);
            }
        }
        if (var3 == 42) {
            field519.method2273(150);
            field519.method2427(var1);
            field519.method2433(var2);
            field519.method2576(var4);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 50) {
            class3 var29 = field662[var4];
            if (var29 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(240);
                field519.method2427(var4);
            }
        }
        if (var3 == 35) {
            field519.method2273(26);
            field519.method2433(var2);
            field519.method2426(var4);
            field519.method2427(var1);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 1003) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            class25 var30 = field516[var4];
            if (var30 != null) {
                class31 var31 = var30.field396;
                if (var31.field804 != null) {
                    var31 = var31.method594();
                }
                if (var31 != null) {
                    field519.method2273(215);
                    field519.method2426(var31.field791);
                }
            }
        }
        if (var3 == 20) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(192);
            field519.method2427(Statics.field96 + var1);
            field519.method2576(Statics.field92 + var2);
            field519.method2425(var4);
        }
        if (var3 == 2) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(186);
            field519.method2427(Statics.field92 + var2);
            field519.method2576(field634);
            field519.method2412(Statics.field742);
            field519.method2425(var4 >> 14 & 0x7FFF);
            field519.method2576(Statics.field96 + var1);
        }
        if (var3 == 51) {
            class3 var32 = field662[var4];
            if (var32 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(242);
                field519.method2576(var4);
            }
        }
        if (var3 == 4) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(233);
            field519.method2576(var4 >> 14 & 0x7FFF);
            field519.method2426(Statics.field96 + var1);
            field519.method2427(Statics.field92 + var2);
        }
        if (var3 == 23) {
            Statics.field1245.method1877(Statics.field13, var1, var2);
        }
        if (var3 == 31) {
            field519.method2273(153);
            field519.method2427(var1);
            field519.method2576(Statics.field397);
            field519.method2412(var2);
            field519.method2426(Statics.field3);
            field519.method2427(var4);
            field519.method2412(Statics.field865);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 16) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(84);
            field519.method2425(Statics.field96 + var1);
            field519.method2425(Statics.field397);
            field519.method2426(Statics.field92 + var2);
            field519.method2427(Statics.field3);
            field519.method2425(var4);
            field519.method2433(Statics.field865);
        }
        if (var3 == 13) {
            class25 var33 = field516[var4];
            if (var33 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(122);
                field519.method2425(var4);
            }
        }
        if (var3 == 49) {
            class3 var34 = field662[var4];
            if (var34 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(237);
                field519.method2426(var4);
            }
        }
        if (var3 == 40) {
            field519.method2273(11);
            field519.method2433(var2);
            field519.method2427(var1);
            field519.method2576(var4);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 12) {
            class25 var35 = field516[var4];
            if (var35 != null) {
                field593 = class77.field1421;
                field585 = class77.field1416;
                field587 = 2;
                field586 = 0;
                field713 = var1;
                field710 = var2;
                field519.method2273(163);
                field519.method2426(var4);
            }
        }
        if (var3 == 32) {
            field519.method2273(42);
            field519.method2412(Statics.field742);
            field519.method2426(var4);
            field519.method2385(var2);
            field519.method2576(field634);
            field519.method2425(var1);
            field588 = 0;
            Statics.field156 = class159.method2333(var2);
            field499 = var1;
        }
        if (var3 == 1001) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(129);
            field519.method2426(Statics.field92 + var2);
            field519.method2425(var4 >> 14 & 0x7FFF);
            field519.method2576(Statics.field96 + var1);
        }
        if (var3 == 1) {
            field593 = class77.field1421;
            field585 = class77.field1416;
            field587 = 2;
            field586 = 0;
            field713 = var1;
            field710 = var2;
            field519.method2273(162);
            field519.method2576(Statics.field3);
            field519.method2426(var4 >> 14 & 0x7FFF);
            field519.method2425(Statics.field92 + var2);
            field519.method2435(Statics.field865);
            field519.method2427(Statics.field397);
            field519.method2427(Statics.field96 + var1);
        }
        if (var3 != 38) {
            if (field631 != 0) {
                field631 = 0;
                method728(class159.method2333(Statics.field865));
            }
            if (field633) {
                method1814();
            }
            if (Statics.field156 != null && field588 == 0) {
                method728(Statics.field156);
            }
            return;
        }
        method1814();
        class159 var36 = class159.method2333(var2);
        field631 = 1;
        Statics.field3 = var1;
        Statics.field865 = var2;
        Statics.field397 = var4;
        method728(var36);
        field580 = class2.method1344(16748608) + class40.method1565(var4).field977 + class2.method1344(16777215);
        if (field580 == null) {
            field580 = "null";
        }
    }

    @ObfuscatedName("ch.bf(ILjava/lang/String;I)V")
    public static void method1808(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field685; var3++) {
            class3 var4 = field662[field534[var3]];
            if (var4 != null && var4.field52 != null && var4.field52.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field519.method2273(33);
                    field519.method2576(field534[var3]);
                } else if (arg0 == 4) {
                    field519.method2273(80);
                    field519.method2426(field534[var3]);
                } else if (arg0 == 6) {
                    field519.method2273(237);
                    field519.method2426(field534[var3]);
                } else if (arg0 == 7) {
                    field519.method2273(240);
                    field519.method2427(field534[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method112(0, "", class135.field2261 + arg1);
        }
    }

    @ObfuscatedName("e.ba(IIII)V")
    public static void method236(int arg0, int arg1, int arg2) {
        class159 var3 = class159.method2673(arg0, arg1);
        if (var3 != null && var3.field2696 != null) {
            class1 var4 = new class1();
            var4.field1 = var3;
            var4.field15 = var3.field2696;
            class26.method1493(var4);
        }
        field633 = true;
        Statics.field742 = arg0;
        field634 = arg1;
        Statics.field12 = arg2;
        method728(var3);
    }

    @ObfuscatedName("cm.br(I)V")
    public static void method1814() {
        if (!field633) {
            return;
        }
        class159 var0 = class159.method2673(Statics.field742, field634);
        if (var0 != null && var0.field2697 != null) {
            class1 var1 = new class1();
            var1.field1 = var0;
            var1.field15 = var0.field2697;
            class26.method1493(var1);
        }
        field633 = false;
        method728(var0);
    }

    @ObfuscatedName("w.bc(IIB)V")
    public static void method115(int arg0, int arg1) {
        field519.method2273(48);
        field519.method2576(arg1);
        field519.method2385(arg0);
    }

    @ObfuscatedName("g.bu(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method124(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field619 || field620 >= 500) {
            return;
        }
        field625[field620] = arg0;
        field694[field620] = arg1;
        field672[field620] = arg2;
        field603[field620] = arg3;
        field621[field620] = arg4;
        field622[field620] = arg5;
        field620++;
    }

    @ObfuscatedName("f.bi(I)V")
    public static void method187() {
        for (int var0 = 0; var0 < field620; var0++) {
            int var1 = field672[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field620 - 1) {
                    for (int var3 = var0; var3 < field620 - 1; var3++) {
                        field625[var3] = field625[var3 + 1];
                        field694[var3] = field694[var3 + 1];
                        field672[var3] = field672[var3 + 1];
                        field603[var3] = field603[var3 + 1];
                        field621[var3] = field621[var3 + 1];
                        field622[var3] = field622[var3 + 1];
                    }
                }
                field620--;
            }
        }
    }

    @ObfuscatedName("r.bv(Lag;IIII)V")
    public static final void method249(class31 arg0, int arg1, int arg2, int arg3) {
        if (field620 >= 400) {
            return;
        }
        if (arg0.field804 != null) {
            arg0 = arg0.method594();
        }
        if (arg0 == null || !arg0.field797) {
            return;
        }
        String var4 = arg0.field779;
        if (arg0.field790 != 0) {
            var4 = var4 + method2691(arg0.field790, Statics.field368.field54) + " " + class2.field22 + class135.field2268 + arg0.field790 + class2.field23;
        }
        if (field631 == 1) {
            method124(class135.field2262, field580 + " " + class2.field24 + " " + class2.method1344(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field633) {
            String[] var5 = arg0.field799;
            if (field647) {
                var5 = method692(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class135.field2264)) {
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
                        method124(var5[var6], class2.method1344(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class135.field2264)) {
                        short var9 = 0;
                        if (arg0.field790 > Statics.field368.field54) {
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
                        method124(var5[var8], class2.method1344(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method124(class135.field2148, class2.method1344(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field12 & 0x2) == 2) {
            method124(field656, field690 + " " + class2.field24 + " " + class2.method1344(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ec.bp(Lj;IIIB)V")
    public static final void method2904(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field368 == arg0 || field620 >= 400) {
            return;
        }
        String var4;
        if (arg0.field40 == 0) {
            var4 = arg0.field52 + method2691(arg0.field54, Statics.field368.field54) + " " + class2.field22 + class135.field2268 + arg0.field54 + class2.field23;
        } else {
            var4 = arg0.field52 + " " + class2.field22 + class135.field2343 + arg0.field40 + class2.field23;
        }
        if (field631 == 1) {
            method124(class135.field2262, field580 + " " + class2.field24 + " " + class2.method1344(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field633) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field660[var5] != null) {
                    short var6 = 0;
                    if (field660[var5].equalsIgnoreCase(class135.field2264)) {
                        if (arg0.field54 > Statics.field368.field54) {
                            var6 = 2000;
                        }
                        if (Statics.field368.field53 != 0 && arg0.field53 != 0) {
                            if (Statics.field368.field53 == arg0.field53) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field706[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field607[var5] + var6;
                    method124(field660[var5], class2.method1344(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field12 & 0x8) == 8) {
            method124(field656, field690 + " " + class2.field24 + " " + class2.method1344(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field620; var9++) {
            if (field672[var9] == 23) {
                field694[var9] = class2.method1344(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("em.bt(III)Ljava/lang/String;")
    public static final String method2691(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1344(16711680);
        } else if (var2 < -6) {
            return class2.method1344(16723968);
        } else if (var2 < -3) {
            return class2.method1344(16740352);
        } else if (var2 < 0) {
            return class2.method1344(16756736);
        } else if (var2 > 9) {
            return class2.method1344(65280);
        } else if (var2 > 6) {
            return class2.method1344(4259584);
        } else if (var2 > 3) {
            return class2.method1344(8453888);
        } else if (var2 > 0) {
            return class2.method1344(12648192);
        } else {
            return class2.method1344(16776960);
        }
    }

    @ObfuscatedName("bg.bg([Lfh;IIIIIIIII)V")
    public static final void method1472(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1743(arg2, arg3, arg4, arg5);
        class104.method2080();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2625 == arg1 || arg1 == -1412584499 && field648 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field683[field678] = var10.field2623 + arg6;
                    field736[field678] = var10.field2727 + arg7;
                    field612[field678] = var10.field2627;
                    field686[field678] = var10.field2628;
                    var11 = ++field678 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2695 = var11;
                var10.field2717 = field489;
                if (!var10.field2617 || !method2263(var10)) {
                    if (var10.field2622 > 0) {
                        method156(var10);
                    }
                    int var12 = var10.field2623 + arg6;
                    int var13 = var10.field2727 + arg7;
                    int var14 = var10.field2640;
                    if (field648 == var10) {
                        if (arg1 != -1412584499 && !var10.field2683) {
                            Statics.field1118 = arg0;
                            Statics.field218 = arg6;
                            Statics.field1648 = arg7;
                            continue;
                        }
                        if (field659 && field653) {
                            int var15 = class77.field1410;
                            int var16 = class77.field1411;
                            int var17 = var15 - field650;
                            int var18 = var16 - field651;
                            if (var17 < field654) {
                                var17 = field654;
                            }
                            if (var10.field2627 + var17 > field654 + field649.field2627) {
                                var17 = field654 + field649.field2627 - var10.field2627;
                            }
                            if (var18 < field576) {
                                var18 = field576;
                            }
                            if (var10.field2628 + var18 > field576 + field649.field2628) {
                                var18 = field576 + field649.field2628 - var10.field2628;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2683) {
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
                        int var25 = var10.field2627 + var12;
                        int var26 = var10.field2628 + var13;
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
                        int var29 = var10.field2627 + var12;
                        int var30 = var10.field2628 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2617 || var19 < var21 && var20 < var22) {
                        if (var10.field2622 != 0) {
                            if (var10.field2622 == 1337) {
                                field684 = var12;
                                field628 = var13;
                                int var31 = var10.field2627;
                                int var32 = var10.field2628;
                                class89.method1743(var12, var13, var12 + var31, var13 + var32);
                                class104.method2080();
                                field518++;
                                method734(true);
                                method2669(true);
                                method734(false);
                                method2669(false);
                                method128();
                                method168();
                                if (!field673) {
                                    int var33 = field561;
                                    if (field569 / 256 > var33) {
                                        var33 = field569 / 256;
                                    }
                                    if (field724[4] && field726[4] + 128 > var33) {
                                        var33 = field726[4] + 128;
                                    }
                                    int var34 = field562 + field545 & 0x7FF;
                                    method237(Statics.field2602, method2151(Statics.field368.field444, Statics.field368.field420, Statics.field13) - 50, Statics.field1370, var33, var34, var33 * 3 + 600);
                                }
                                int var47;
                                if (field673) {
                                    int var48;
                                    if (Statics.field29.field206) {
                                        var48 = Statics.field13;
                                    } else {
                                        int var49 = method2151(Statics.field707, Statics.field1356, Statics.field13);
                                        if (var49 - Statics.field399 >= 800 || (class9.field139[Statics.field13][Statics.field707 >> 7][Statics.field1356 >> 7] & 0x4) == 0) {
                                            var48 = 3;
                                        } else {
                                            var48 = Statics.field13;
                                        }
                                    }
                                    var47 = var48;
                                } else {
                                    int var35;
                                    if (Statics.field29.field206) {
                                        var35 = Statics.field13;
                                    } else {
                                        int var36 = 3;
                                        if (Statics.field1858 < 310) {
                                            int var37 = Statics.field707 >> 7;
                                            int var38 = Statics.field1356 >> 7;
                                            int var39 = Statics.field368.field444 >> 7;
                                            int var40 = Statics.field368.field420 >> 7;
                                            if ((class9.field139[Statics.field13][var37][var38] & 0x4) != 0) {
                                                var36 = Statics.field13;
                                            }
                                            int var41;
                                            if (var39 > var37) {
                                                var41 = var39 - var37;
                                            } else {
                                                var41 = var37 - var39;
                                            }
                                            int var42;
                                            if (var40 > var38) {
                                                var42 = var40 - var38;
                                            } else {
                                                var42 = var38 - var40;
                                            }
                                            if (var41 > var42) {
                                                int var43 = var42 * 65536 / var41;
                                                int var44 = 32768;
                                                while (var37 != var39) {
                                                    if (var37 < var39) {
                                                        var37++;
                                                    } else if (var37 > var39) {
                                                        var37--;
                                                    }
                                                    if ((class9.field139[Statics.field13][var37][var38] & 0x4) != 0) {
                                                        var36 = Statics.field13;
                                                    }
                                                    var44 += var43;
                                                    if (var44 >= 65536) {
                                                        var44 -= 65536;
                                                        if (var38 < var40) {
                                                            var38++;
                                                        } else if (var38 > var40) {
                                                            var38--;
                                                        }
                                                        if ((class9.field139[Statics.field13][var37][var38] & 0x4) != 0) {
                                                            var36 = Statics.field13;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var45 = var41 * 65536 / var42;
                                                int var46 = 32768;
                                                while (var38 != var40) {
                                                    if (var38 < var40) {
                                                        var38++;
                                                    } else if (var38 > var40) {
                                                        var38--;
                                                    }
                                                    if ((class9.field139[Statics.field13][var37][var38] & 0x4) != 0) {
                                                        var36 = Statics.field13;
                                                    }
                                                    var46 += var45;
                                                    if (var46 >= 65536) {
                                                        var46 -= 65536;
                                                        if (var37 < var39) {
                                                            var37++;
                                                        } else if (var37 > var39) {
                                                            var37--;
                                                        }
                                                        if ((class9.field139[Statics.field13][var37][var38] & 0x4) != 0) {
                                                            var36 = Statics.field13;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class9.field139[Statics.field13][Statics.field368.field444 >> 7][Statics.field368.field420 >> 7] & 0x4) != 0) {
                                            var36 = Statics.field13;
                                        }
                                        var35 = var36;
                                    }
                                    var47 = var35;
                                }
                                int var50 = Statics.field707;
                                int var51 = Statics.field399;
                                int var52 = Statics.field1356;
                                int var53 = Statics.field1858;
                                int var54 = Statics.field262;
                                for (int var55 = 0; var55 < 5; var55++) {
                                    if (field724[var55]) {
                                        int var56 = (int) (Math.random() * (double) (field725[var55] * 2 + 1) - (double) field725[var55] + Math.sin((double) field738[var55] / 100.0D * (double) field728[var55]) * (double) field726[var55]);
                                        if (var55 == 0) {
                                            Statics.field707 += var56;
                                        }
                                        if (var55 == 1) {
                                            Statics.field399 += var56;
                                        }
                                        if (var55 == 2) {
                                            Statics.field1356 += var56;
                                        }
                                        if (var55 == 3) {
                                            Statics.field262 = Statics.field262 + var56 & 0x7FF;
                                        }
                                        if (var55 == 4) {
                                            Statics.field1858 += var56;
                                            if (Statics.field1858 < 128) {
                                                Statics.field1858 = 128;
                                            }
                                            if (Statics.field1858 > 383) {
                                                Statics.field1858 = 383;
                                            }
                                        }
                                    }
                                }
                                int var57 = class77.field1410;
                                int var58 = class77.field1411;
                                if (class77.field1425 != 0) {
                                    var57 = class77.field1421;
                                    var58 = class77.field1416;
                                }
                                if (var57 >= var12 && var57 < var12 + var31 && var58 >= var13 && var58 < var13 + var32) {
                                    class112.field1924 = true;
                                    class112.field1927 = 0;
                                    class112.field1903 = var57 - var12;
                                    class112.field1926 = var58 - var13;
                                } else {
                                    class112.field1924 = false;
                                    class112.field1927 = 0;
                                }
                                method2180();
                                class89.method1770(var12, var13, var31, var32, 0);
                                method2180();
                                Statics.field1245.method1884(Statics.field707, Statics.field399, Statics.field1356, Statics.field1858, Statics.field262, var47);
                                method2180();
                                Statics.field1245.method1830();
                                field594 = 0;
                                for (int var59 = -1; var59 < field685 + field581; var59++) {
                                    class27 var60;
                                    if (var59 == -1) {
                                        var60 = Statics.field368;
                                    } else if (var59 < field685) {
                                        var60 = field662[field534[var59]];
                                    } else {
                                        var60 = field516[field582[var59 - field685]];
                                    }
                                    if (var60 != null && var60.method14()) {
                                        if (var60 instanceof class25) {
                                            class31 var61 = ((class25) var60).field396;
                                            if (var61.field804 != null) {
                                                var61 = var61.method594();
                                            }
                                            if (var61 == null) {
                                                continue;
                                            }
                                        }
                                        if (var59 >= field685) {
                                            class31 var64 = ((class25) var60).field396;
                                            if (var64.field804 != null) {
                                                var64 = var64.method594();
                                            }
                                            if (var64.field780 >= 0 && var64.field780 < Statics.field751.length) {
                                                method136(var60, var60.field466 + 15);
                                                if (field525 > -1) {
                                                    Statics.field751[var64.field780].method1659(field525 + var12 - 12, field583 + var13 - 30);
                                                }
                                            }
                                            if (field668 == 1 && field676 == field582[var59 - field685] && field489 % 20 < 10) {
                                                method136(var60, var60.field466 + 15);
                                                if (field525 > -1) {
                                                    Statics.field1937[0].method1659(field525 + var12 - 12, field583 + var13 - 28);
                                                }
                                            }
                                        } else {
                                            int var62 = 30;
                                            class3 var63 = (class3) var60;
                                            if (var63.field37 != -1 || var63.field38 != -1) {
                                                method136(var60, var60.field466 + 15);
                                                if (field525 > -1) {
                                                    if (var63.field37 != -1) {
                                                        Statics.field2374[var63.field37].method1659(field525 + var12 - 12, field583 + var13 - var62);
                                                        var62 += 25;
                                                    }
                                                    if (var63.field38 != -1) {
                                                        Statics.field751[var63.field38].method1659(field525 + var12 - 12, field583 + var13 - var62);
                                                        var62 += 25;
                                                    }
                                                }
                                            }
                                            if (var59 >= 0 && field668 == 10 && field708 == field534[var59]) {
                                                method136(var60, var60.field466 + 15);
                                                if (field525 > -1) {
                                                    Statics.field1937[1].method1659(field525 + var12 - 12, field583 + var13 - var62);
                                                }
                                            }
                                        }
                                        if (var60.field432 != null && (var59 >= field685 || field482 == 0 || field482 == 3 || field482 == 1 && method34(((class3) var60).field52))) {
                                            method136(var60, var60.field466);
                                            if (field525 > -1 && field594 < field578) {
                                                field575[field594] = Statics.field211.method3321(var60.field432) / 2;
                                                field727[field594] = Statics.field211.field2850;
                                                field572[field594] = field525;
                                                field573[field594] = field583;
                                                field712[field594] = var60.field421;
                                                field577[field594] = var60.field435;
                                                field508[field594] = var60.field433;
                                                field579[field594] = var60.field432;
                                                field594++;
                                            }
                                        }
                                        if (var60.field439 > field489) {
                                            method136(var60, var60.field466 + 15);
                                            if (field525 > -1) {
                                                int var65 = var60.field441 * 30 / var60.field456;
                                                if (var65 > 30) {
                                                    var65 = 30;
                                                } else if (var65 == 0 && var60.field441 > 0) {
                                                    var65 = 1;
                                                }
                                                class89.method1770(field525 + var12 - 15, field583 + var13 - 3, var65, 5, 65280);
                                                class89.method1770(field525 + var12 - 15 + var65, field583 + var13 - 3, 30 - var65, 5, 16711680);
                                            }
                                        }
                                        for (int var66 = 0; var66 < 4; var66++) {
                                            if (var60.field438[var66] > field489) {
                                                method136(var60, var60.field466 / 2);
                                                if (field525 > -1) {
                                                    if (var66 == 1) {
                                                        field583 -= 20;
                                                    }
                                                    if (var66 == 2) {
                                                        field525 -= 15;
                                                        field583 -= 10;
                                                    }
                                                    if (var66 == 3) {
                                                        field525 += 15;
                                                        field583 -= 10;
                                                    }
                                                    Statics.field264[var60.field430[var66]].method1659(field525 + var12 - 12, field583 + var13 - 12);
                                                    Statics.field277.method3326(Integer.toString(var60.field436[var66]), field525 + var12 - 1, field583 + var13 + 3, 16777215, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var67 = 0; var67 < field594; var67++) {
                                    int var68 = field572[var67];
                                    int var69 = field573[var67];
                                    int var70 = field575[var67];
                                    int var71 = field727[var67];
                                    boolean var72 = true;
                                    while (var72) {
                                        var72 = false;
                                        for (int var73 = 0; var73 < var67; var73++) {
                                            if (var69 + 2 > field573[var73] - field727[var73] && var69 - var71 < field573[var73] + 2 && var68 - var70 < field575[var73] + field572[var73] && var68 + var70 > field572[var73] - field575[var73] && field573[var73] - field727[var73] < var69) {
                                                var69 = field573[var73] - field727[var73];
                                                var72 = true;
                                            }
                                        }
                                    }
                                    field525 = field572[var67];
                                    field583 = field573[var67] = var69;
                                    String var74 = field579[var67];
                                    if (field655 == 0) {
                                        int var75 = 16776960;
                                        if (field712[var67] < 6) {
                                            var75 = field693[field712[var67]];
                                        }
                                        if (field712[var67] == 6) {
                                            var75 = field518 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field712[var67] == 7) {
                                            var75 = field518 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field712[var67] == 8) {
                                            var75 = field518 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field712[var67] == 9) {
                                            int var76 = 150 - field508[var67];
                                            if (var76 < 50) {
                                                var75 = var76 * 1280 + 16711680;
                                            } else if (var76 < 100) {
                                                var75 = 16776960 - (var76 - 50) * 327680;
                                            } else if (var76 < 150) {
                                                var75 = (var76 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field712[var67] == 10) {
                                            int var77 = 150 - field508[var67];
                                            if (var77 < 50) {
                                                var75 = var77 * 5 + 16711680;
                                            } else if (var77 < 100) {
                                                var75 = 16711935 - (var77 - 50) * 327680;
                                            } else if (var77 < 150) {
                                                var75 = (var77 - 100) * 327680 + 255 - (var77 - 100) * 5;
                                            }
                                        }
                                        if (field712[var67] == 11) {
                                            int var78 = 150 - field508[var67];
                                            if (var78 < 50) {
                                                var75 = 16777215 - var78 * 327685;
                                            } else if (var78 < 100) {
                                                var75 = (var78 - 50) * 327685 + 65280;
                                            } else if (var78 < 150) {
                                                var75 = 16777215 - (var78 - 100) * 327680;
                                            }
                                        }
                                        if (field577[var67] == 0) {
                                            Statics.field211.method3326(var74, field525 + var12, field583 + var13, var75, 0);
                                        }
                                        if (field577[var67] == 1) {
                                            Statics.field211.method3328(var74, field525 + var12, field583 + var13, var75, 0, field518);
                                        }
                                        if (field577[var67] == 2) {
                                            Statics.field211.method3329(var74, field525 + var12, field583 + var13, var75, 0, field518);
                                        }
                                        if (field577[var67] == 3) {
                                            Statics.field211.method3330(var74, field525 + var12, field583 + var13, var75, 0, field518, 150 - field508[var67]);
                                        }
                                        if (field577[var67] == 4) {
                                            int var79 = (150 - field508[var67]) * (Statics.field211.method3321(var74) + 100) / 150;
                                            class89.method1754(field525 + var12 - 50, var13, field525 + var12 + 50, var13 + var32);
                                            Statics.field211.method3367(var74, field525 + var12 + 50 - var79, field583 + var13, var75, 0);
                                            class89.method1743(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field577[var67] == 5) {
                                            int var80 = 150 - field508[var67];
                                            int var81 = 0;
                                            if (var80 < 25) {
                                                var81 = var80 - 25;
                                            } else if (var80 > 125) {
                                                var81 = var80 - 125;
                                            }
                                            class89.method1754(var12, field583 + var13 - Statics.field211.field2850 - 1, var12 + var31, field583 + var13 + 5);
                                            Statics.field211.method3326(var74, field525 + var12, field583 + var13 + var81, var75, 0);
                                            class89.method1743(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field211.method3326(var74, field525 + var12, field583 + var13, 16776960, 0);
                                    }
                                }
                                if (field668 == 2) {
                                    method224((field500 - Statics.field96 << 7) + field623, (field501 - Statics.field92 << 7) + field504, field502 * 2);
                                    if (field525 > -1 && field489 % 20 < 10) {
                                        Statics.field1937[0].method1659(field525 + var12 - 12, field583 + var13 - 28);
                                    }
                                }
                                ((class110) Statics.field1797).method2183(field558);
                                method1265(var12, var13, var31, var32);
                                Statics.field707 = var50;
                                Statics.field399 = var51;
                                Statics.field1356 = var52;
                                Statics.field1858 = var53;
                                Statics.field262 = var54;
                                if (field488 && class154.method2701(true, false) == 0) {
                                    field488 = false;
                                }
                                if (field488) {
                                    class89.method1770(var12, var13, var31, var32, 0);
                                    method2825(class135.field2128, false);
                                }
                                class89.method1743(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2622 == 1338) {
                                method2180();
                                class89.method1743(var12, var13, Statics.field1215.field1504 + var12, Statics.field1215.field1506 + var13);
                                if (field711 == 2 || field711 == 5) {
                                    class89.method1753(var12 + 25, var13 + 5, 0, Statics.field1295, Statics.field213);
                                } else {
                                    int var82 = field562 + field548 & 0x7FF;
                                    int var83 = Statics.field368.field444 / 32 + 48;
                                    int var84 = 464 - Statics.field368.field420 / 32;
                                    Statics.field1573.method1669(var12 + 25, var13 + 5, 146, 151, var83, var84, var82, field550 + 256, Statics.field1295, Statics.field213);
                                    for (int var85 = 0; var85 < field657; var85++) {
                                        int var86 = field528[var85] * 4 + 2 - Statics.field368.field444 / 32;
                                        int var87 = field735[var85] * 4 + 2 - Statics.field368.field420 / 32;
                                        method2(var12, var13, var86, var87, field638[var85]);
                                    }
                                    for (int var88 = 0; var88 < 104; var88++) {
                                        for (int var89 = 0; var89 < 104; var89++) {
                                            class177 var90 = field611[Statics.field13][var88][var89];
                                            if (var90 != null) {
                                                int var91 = var88 * 4 + 2 - Statics.field368.field444 / 32;
                                                int var92 = var89 * 4 + 2 - Statics.field368.field420 / 32;
                                                method2(var12, var13, var91, var92, Statics.field64[0]);
                                            }
                                        }
                                    }
                                    for (int var93 = 0; var93 < field581; var93++) {
                                        class25 var94 = field516[field582[var93]];
                                        if (var94 != null && var94.method14()) {
                                            class31 var95 = var94.field396;
                                            if (var95 != null && var95.field804 != null) {
                                                var95 = var95.method594();
                                            }
                                            if (var95 != null && var95.field795 && var95.field797) {
                                                int var96 = var94.field444 / 32 - Statics.field368.field444 / 32;
                                                int var97 = var94.field420 / 32 - Statics.field368.field420 / 32;
                                                method2(var12, var13, var96, var97, Statics.field64[1]);
                                            }
                                        }
                                    }
                                    for (int var98 = 0; var98 < field685; var98++) {
                                        class3 var99 = field662[field534[var98]];
                                        if (var99 != null && var99.method14()) {
                                            int var100 = var99.field444 / 32 - Statics.field368.field444 / 32;
                                            int var101 = var99.field420 / 32 - Statics.field368.field420 / 32;
                                            boolean var102 = false;
                                            if (method34(var99.field52)) {
                                                var102 = true;
                                            }
                                            boolean var103 = false;
                                            for (int var104 = 0; var104 < Statics.field2700; var104++) {
                                                if (var99.field52.equals(Statics.field34[var104].field133)) {
                                                    var103 = true;
                                                    break;
                                                }
                                            }
                                            boolean var105 = false;
                                            if (Statics.field368.field53 != 0 && var99.field53 != 0 && Statics.field368.field53 == var99.field53) {
                                                var105 = true;
                                            }
                                            if (var102) {
                                                method2(var12, var13, var100, var101, Statics.field64[3]);
                                            } else if (var105) {
                                                method2(var12, var13, var100, var101, Statics.field64[4]);
                                            } else if (var103) {
                                                method2(var12, var13, var100, var101, Statics.field64[5]);
                                            } else {
                                                method2(var12, var13, var100, var101, Statics.field64[2]);
                                            }
                                        }
                                    }
                                    if (field668 != 0 && field489 % 20 < 10) {
                                        if (field668 == 1 && field676 >= 0 && field676 < field516.length) {
                                            class25 var106 = field516[field676];
                                            if (var106 != null) {
                                                int var107 = var106.field444 / 32 - Statics.field368.field444 / 32;
                                                int var108 = var106.field420 / 32 - Statics.field368.field420 / 32;
                                                method558(var12, var13, var107, var108, Statics.field376[1]);
                                            }
                                        }
                                        if (field668 == 2) {
                                            int var109 = field500 * 4 - Statics.field96 * 4 + 2 - Statics.field368.field444 / 32;
                                            int var110 = field501 * 4 - Statics.field92 * 4 + 2 - Statics.field368.field420 / 32;
                                            method558(var12, var13, var109, var110, Statics.field376[1]);
                                        }
                                        if (field668 == 10 && field708 >= 0 && field708 < field662.length) {
                                            class3 var111 = field662[field708];
                                            if (var111 != null) {
                                                int var112 = var111.field444 / 32 - Statics.field368.field444 / 32;
                                                int var113 = var111.field420 / 32 - Statics.field368.field420 / 32;
                                                method558(var12, var13, var112, var113, Statics.field376[1]);
                                            }
                                        }
                                    }
                                    if (field713 != 0) {
                                        int var114 = field713 * 4 + 2 - Statics.field368.field444 / 32;
                                        int var115 = field710 * 4 + 2 - Statics.field368.field420 / 32;
                                        method2(var12, var13, var114, var115, Statics.field376[0]);
                                    }
                                    class89.method1770(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field711 < 3) {
                                    Statics.field1290.method1669(var12, var13, 33, 33, 25, 25, field562, 256, Statics.field1288, Statics.field1816);
                                } else {
                                    class89.method1753(var12, var13, 0, Statics.field1288, Statics.field1816);
                                }
                                if (field682[var11]) {
                                    Statics.field1215.method1730(var12, var13);
                                }
                                field681[var11] = true;
                                class89.method1743(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2620 == 0) {
                            if (!var10.field2617 && method2263(var10) && Statics.field1997 != var10) {
                                continue;
                            }
                            if (!var10.field2617) {
                                if (var10.field2632 > var10.field2634 - var10.field2628) {
                                    var10.field2632 = var10.field2634 - var10.field2628;
                                }
                                if (var10.field2632 < 0) {
                                    var10.field2632 = 0;
                                }
                            }
                            method1472(arg0, var10.field2618, var19, var20, var21, var22, var12 - var10.field2631, var13 - var10.field2632, var11);
                            if (var10.field2635 != null) {
                                method1472(var10.field2635, var10.field2618, var19, var20, var21, var22, var12 - var10.field2631, var13 - var10.field2632, var11);
                            }
                            class4 var116 = (class4) field597.method3232((long) var10.field2618);
                            if (var116 != null) {
                                int var117 = var116.field57;
                                if (class159.method880(var117)) {
                                    Statics.field1118 = null;
                                    method1472(Statics.field2830[var117], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field1118 != null) {
                                        method1472(Statics.field1118, -1412584499, var19, var20, var21, var22, Statics.field218, Statics.field1648, var11);
                                        Statics.field1118 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var118 = 0; var118 < 100; var118++) {
                                        field680[var118] = true;
                                    }
                                } else {
                                    field680[var11] = true;
                                }
                            }
                            class89.method1743(arg2, arg3, arg4, arg5);
                            class104.method2080();
                        }
                        if (field682[var11] || field687 > 1) {
                            if (var10.field2620 == 0 && !var10.field2617 && var10.field2634 > var10.field2628) {
                                method878(var10.field2627 + var12, var13, var10.field2632, var10.field2628, var10.field2634);
                            }
                            if (var10.field2620 != 1) {
                                if (var10.field2620 == 2) {
                                    int var119 = 0;
                                    for (int var120 = 0; var120 < var10.field2628; var120++) {
                                        for (int var121 = 0; var121 < var10.field2627; var121++) {
                                            int var122 = (var10.field2671 + 32) * var121 + var12;
                                            int var123 = (var10.field2672 + 32) * var120 + var13;
                                            if (var119 < 20) {
                                                var122 += var10.field2673[var119];
                                                var123 += var10.field2736[var119];
                                            }
                                            if (var10.field2720[var119] > 0) {
                                                boolean var124 = false;
                                                boolean var125 = false;
                                                int var126 = var10.field2720[var119] - 1;
                                                if (var122 + 32 > arg2 && var122 < arg4 && var123 + 32 > arg3 && var123 < arg5 || Statics.field1333 == var10 && field590 == var119) {
                                                    class86 var127;
                                                    if (field631 == 1 && Statics.field3 == var119 && Statics.field865 == var10.field2618) {
                                                        var127 = class40.method158(var126, var10.field2721[var119], 2, 0, false);
                                                    } else {
                                                        var127 = class40.method158(var126, var10.field2721[var119], 1, 3153952, false);
                                                    }
                                                    if (var127 == null) {
                                                        method728(var10);
                                                    } else if (Statics.field1333 == var10 && field590 == var119) {
                                                        int var128 = class77.field1410 - field591;
                                                        int var129 = class77.field1411 - field592;
                                                        if (var128 < 5 && var128 > -5) {
                                                            var128 = 0;
                                                        }
                                                        if (var129 < 5 && var129 > -5) {
                                                            var129 = 0;
                                                        }
                                                        if (field595 < 5) {
                                                            var128 = 0;
                                                            var129 = 0;
                                                        }
                                                        var127.method1665(var122 + var128, var123 + var129, 128);
                                                        if (arg1 != -1) {
                                                            class159 var130 = arg0[arg1 & 0xFFFF];
                                                            if (var123 + var129 < class89.field1515 && var130.field2632 > 0) {
                                                                int var131 = field558 * (class89.field1515 - var123 - var129) / 3;
                                                                if (var131 > field558 * 10) {
                                                                    var131 = field558 * 10;
                                                                }
                                                                if (var131 > var130.field2632) {
                                                                    var131 = var130.field2632;
                                                                }
                                                                var130.field2632 -= var131;
                                                                field592 += var131;
                                                                method728(var130);
                                                            }
                                                            if (var123 + var129 + 32 > class89.field1516 && var130.field2632 < var130.field2634 - var130.field2628) {
                                                                int var132 = field558 * (var123 + var129 + 32 - class89.field1516) / 3;
                                                                if (var132 > field558 * 10) {
                                                                    var132 = field558 * 10;
                                                                }
                                                                if (var132 > var130.field2634 - var130.field2628 - var130.field2632) {
                                                                    var132 = var130.field2634 - var130.field2628 - var130.field2632;
                                                                }
                                                                var130.field2632 += var132;
                                                                field592 -= var132;
                                                                method728(var130);
                                                            }
                                                        }
                                                    } else if (Statics.field156 == var10 && field499 == var119) {
                                                        var127.method1665(var122, var123, 128);
                                                    } else {
                                                        var127.method1659(var122, var123);
                                                    }
                                                }
                                            } else if (var10.field2675 != null && var119 < 20) {
                                                class86 var133 = var10.method3106(var119);
                                                if (var133 != null) {
                                                    var133.method1659(var122, var123);
                                                } else if (class159.field2660) {
                                                    method728(var10);
                                                }
                                            }
                                            var119++;
                                        }
                                    }
                                } else if (var10.field2620 == 3) {
                                    int var134;
                                    if (method672(var10)) {
                                        var134 = var10.field2636;
                                        if (Statics.field1997 == var10 && var10.field2638 != 0) {
                                            var134 = var10.field2638;
                                        }
                                    } else {
                                        var134 = var10.field2670;
                                        if (Statics.field1997 == var10 && var10.field2637 != 0) {
                                            var134 = var10.field2637;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2639) {
                                            class89.method1770(var12, var13, var10.field2627, var10.field2628, var134);
                                        } else {
                                            class89.method1759(var12, var13, var10.field2627, var10.field2628, var134);
                                        }
                                    } else if (var10.field2639) {
                                        class89.method1748(var12, var13, var10.field2627, var10.field2628, var134, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1752(var12, var13, var10.field2627, var10.field2628, var134, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2620 == 4) {
                                    class183 var135 = var10.method3094();
                                    if (var135 != null) {
                                        String var136 = var10.field2689;
                                        int var137;
                                        if (method672(var10)) {
                                            var137 = var10.field2636;
                                            if (Statics.field1997 == var10 && var10.field2638 != 0) {
                                                var137 = var10.field2638;
                                            }
                                            if (var10.field2708.length() > 0) {
                                                var136 = var10.field2708;
                                            }
                                        } else {
                                            var137 = var10.field2670;
                                            if (Statics.field1997 == var10 && var10.field2637 != 0) {
                                                var137 = var10.field2637;
                                            }
                                        }
                                        if (var10.field2617 && var10.field2722 != -1) {
                                            class40 var138 = class40.method1565(var10.field2722);
                                            var136 = var138.field977;
                                            if (var136 == null) {
                                                var136 = "null";
                                            }
                                            if ((var138.field995 == 1 || var10.field2706 != 1) && var10.field2706 != -1) {
                                                var136 = class2.method1344(16748608) + var136 + class2.field26 + " " + 'x' + method1515(var10.field2706);
                                            }
                                        }
                                        if (field570 == var10) {
                                            class135 var10000 = (class135) null;
                                            var136 = class135.field2269;
                                            var137 = var10.field2670;
                                        }
                                        if (!var10.field2617) {
                                            var136 = method586(var136, var10);
                                        }
                                        var135.method3340(var136, var12, var13, var10.field2627, var10.field2628, var137, var10.field2616 ? 0 : -1, var10.field2714, var10.field2690, var10.field2667);
                                    } else if (class159.field2660) {
                                        method728(var10);
                                    }
                                } else if (var10.field2620 == 5) {
                                    if (var10.field2617) {
                                        class86 var140;
                                        if (var10.field2722 == -1) {
                                            var140 = var10.method3120(false);
                                        } else {
                                            var140 = class40.method158(var10.field2722, var10.field2706, var10.field2646, var10.field2647, false);
                                        }
                                        if (var140 != null) {
                                            int var141 = var140.field1494;
                                            int var142 = var140.field1497;
                                            if (var10.field2645) {
                                                class89.method1754(var12, var13, var10.field2627 + var12, var10.field2628 + var13);
                                                int var143 = (var10.field2627 + (var141 - 1)) / var141;
                                                int var144 = (var10.field2628 + (var142 - 1)) / var142;
                                                for (int var145 = 0; var145 < var143; var145++) {
                                                    for (int var146 = 0; var146 < var144; var146++) {
                                                        if (var10.field2624 != 0) {
                                                            var140.method1679(var141 / 2 + var141 * var145 + var12, var142 / 2 + var142 * var146 + var13, var10.field2624, 4096);
                                                        } else if (var14 == 0) {
                                                            var140.method1659(var141 * var145 + var12, var142 * var146 + var13);
                                                        } else {
                                                            var140.method1665(var141 * var145 + var12, var142 * var146 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1743(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var147 = var10.field2627 * 4096 / var141;
                                                if (var10.field2624 != 0) {
                                                    var140.method1679(var10.field2627 / 2 + var12, var10.field2628 / 2 + var13, var10.field2624, var147);
                                                } else if (var14 != 0) {
                                                    var140.method1667(var12, var13, var10.field2627, var10.field2628, 256 - (var14 & 0xFF));
                                                } else if (var10.field2627 == var141 && var10.field2628 == var142) {
                                                    var140.method1659(var12, var13);
                                                } else {
                                                    var140.method1661(var12, var13, var10.field2627, var10.field2628);
                                                }
                                            }
                                        } else if (class159.field2660) {
                                            method728(var10);
                                        }
                                    } else {
                                        class86 var139 = var10.method3120(method672(var10));
                                        if (var139 != null) {
                                            var139.method1659(var12, var13);
                                        } else if (class159.field2660) {
                                            method728(var10);
                                        }
                                    }
                                } else if (var10.field2620 == 6) {
                                    boolean var148 = method672(var10);
                                    int var149;
                                    if (var148) {
                                        var149 = var10.field2724;
                                    } else {
                                        var149 = var10.field2654;
                                    }
                                    class112 var150 = null;
                                    int var151 = 0;
                                    if (var10.field2722 != -1) {
                                        class40 var152 = class40.method1565(var10.field2722);
                                        if (var152 != null) {
                                            class40 var153 = var152.method848(var10.field2706);
                                            var150 = var153.method824(1);
                                            if (var150 == null) {
                                                method728(var10);
                                            } else {
                                                var150.method2196();
                                                var151 = var150.field1572 / 2;
                                            }
                                        }
                                    } else if (var10.field2650 == 5) {
                                        if (var10.field2651 == 0) {
                                            var150 = field691.method3179((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var150 = Statics.field368.method13();
                                        }
                                    } else if (var149 == -1) {
                                        var150 = var10.method3096((class34) null, -1, var148, Statics.field368.field36);
                                        if (var150 == null && class159.field2660) {
                                            method728(var10);
                                        }
                                    } else {
                                        class34 var154 = Statics.method61(var149);
                                        var150 = var10.method3096(var154, var10.field2705, var148, Statics.field368.field36);
                                        if (var150 == null && class159.field2660) {
                                            method728(var10);
                                        }
                                    }
                                    class104.method2083(var10.field2627 / 2 + var12, var10.field2628 / 2 + var13);
                                    int var155 = var10.field2661 * class104.field1800[var10.field2658] >> 16;
                                    int var156 = var10.field2661 * class104.field1801[var10.field2658] >> 16;
                                    if (var150 != null) {
                                        if (var10.field2617) {
                                            var150.method2196();
                                            if (var10.field2663) {
                                                var150.method2208(0, var10.field2659, var10.field2691, var10.field2658, var10.field2656, var10.field2633 + var151 + var155, var10.field2633 + var156, var10.field2661);
                                            } else {
                                                var150.method2239(0, var10.field2659, var10.field2691, var10.field2658, var10.field2656, var10.field2633 + var151 + var155, var10.field2633 + var156);
                                            }
                                        } else {
                                            var150.method2239(0, var10.field2659, 0, var10.field2658, 0, var155, var156);
                                        }
                                    }
                                    class104.method2082();
                                } else {
                                    if (var10.field2620 == 7) {
                                        class183 var157 = var10.method3094();
                                        if (var157 == null) {
                                            if (class159.field2660) {
                                                method728(var10);
                                            }
                                            continue;
                                        }
                                        int var158 = 0;
                                        for (int var159 = 0; var159 < var10.field2628; var159++) {
                                            for (int var160 = 0; var160 < var10.field2627; var160++) {
                                                if (var10.field2720[var158] > 0) {
                                                    class40 var161 = class40.method1565(var10.field2720[var158] - 1);
                                                    String var162;
                                                    if (var161.field995 != 1 && var10.field2721[var158] == 1) {
                                                        var162 = class2.method1344(16748608) + var161.field977 + class2.field26;
                                                    } else {
                                                        var162 = class2.method1344(16748608) + var161.field977 + class2.field26 + " " + 'x' + method1515(var10.field2721[var158]);
                                                    }
                                                    int var163 = (var10.field2671 + 115) * var160 + var12;
                                                    int var164 = (var10.field2672 + 12) * var159 + var13;
                                                    if (var10.field2714 == 0) {
                                                        var157.method3367(var162, var163, var164, var10.field2670, var10.field2616 ? 0 : -1);
                                                    } else if (var10.field2714 == 1) {
                                                        var157.method3326(var162, var10.field2627 / 2 + var163, var164, var10.field2670, var10.field2616 ? 0 : -1);
                                                    } else {
                                                        var157.method3325(var162, var10.field2627 + var163 - 1, var164, var10.field2670, var10.field2616 ? 0 : -1);
                                                    }
                                                }
                                                var158++;
                                            }
                                        }
                                    }
                                    if (var10.field2620 == 8 && Statics.field1044 == var10 && field630 == field484) {
                                        int var165 = 0;
                                        int var166 = 0;
                                        class183 var167 = Statics.field215;
                                        String var168 = var10.field2689;
                                        String var169 = method586(var168, var10);
                                        while (var169.length() > 0) {
                                            int var170 = var169.indexOf(class2.field25);
                                            String var171;
                                            if (var170 == -1) {
                                                var171 = var169;
                                                var169 = "";
                                            } else {
                                                var171 = var169.substring(0, var170);
                                                var169 = var169.substring(var170 + 4);
                                            }
                                            int var172 = var167.method3321(var171);
                                            if (var172 > var165) {
                                                var165 = var172;
                                            }
                                            var166 += var167.field2850 + 1;
                                        }
                                        var165 += 6;
                                        var166 += 7;
                                        int var173 = var10.field2627 + var12 - 5 - var165;
                                        int var174 = var10.field2628 + var13 + 5;
                                        if (var173 < var12 + 5) {
                                            var173 = var12 + 5;
                                        }
                                        if (var165 + var173 > arg4) {
                                            var173 = arg4 - var165;
                                        }
                                        if (var166 + var174 > arg5) {
                                            var174 = arg5 - var166;
                                        }
                                        class89.method1770(var173, var174, var165, var166, 16777120);
                                        class89.method1759(var173, var174, var165, var166, 0);
                                        String var175 = var10.field2689;
                                        int var176 = var167.field2850 + var174 + 2;
                                        String var177 = method586(var175, var10);
                                        while (var177.length() > 0) {
                                            int var178 = var177.indexOf(class2.field25);
                                            String var179;
                                            if (var178 == -1) {
                                                var179 = var177;
                                                var177 = "";
                                            } else {
                                                var179 = var177.substring(0, var178);
                                                var177 = var177.substring(var178 + 4);
                                            }
                                            var167.method3367(var179, var173 + 3, var176, 0, -1);
                                            var176 += var167.field2850 + 1;
                                        }
                                    }
                                    if (var10.field2620 == 9) {
                                        if (var10.field2644 == 1) {
                                            class89.method1757(var12, var13, var10.field2627 + var12, var10.field2628 + var13, var10.field2670);
                                        } else {
                                            int var180 = var10.field2627 >= 0 ? var10.field2627 : -var10.field2627;
                                            int var181 = var10.field2628 >= 0 ? var10.field2628 : -var10.field2628;
                                            int var182 = var180;
                                            if (var180 < var181) {
                                                var182 = var181;
                                            }
                                            if (var182 != 0) {
                                                int var183 = (var10.field2627 << 16) / var182;
                                                int var184 = (var10.field2628 << 16) / var182;
                                                if (var184 <= var183) {
                                                    var183 = -var183;
                                                } else {
                                                    var184 = -var184;
                                                }
                                                int var185 = var10.field2644 * var184 >> 17;
                                                int var186 = var10.field2644 * var184 + 1 >> 17;
                                                int var187 = var10.field2644 * var183 >> 17;
                                                int var188 = var10.field2644 * var183 + 1 >> 17;
                                                int var189 = var12 + var185;
                                                int var190 = var12 - var186;
                                                int var191 = var10.field2627 + var12 - var186;
                                                int var192 = var10.field2627 + var12 + var185;
                                                int var193 = var13 + var187;
                                                int var194 = var13 - var188;
                                                int var195 = var10.field2628 + var13 - var188;
                                                int var196 = var10.field2628 + var13 + var187;
                                                class104.method2088(var189, var190, var191);
                                                class104.method2091(var193, var194, var195, var189, var190, var191, var10.field2670);
                                                class104.method2088(var189, var191, var192);
                                                class104.method2091(var193, var195, var196, var189, var191, var192, var10.field2670);
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

    @ObfuscatedName("au.by(Ljava/lang/String;Lfh;I)Ljava/lang/String;")
    public static String method586(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method150(method53(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2482 != null) {
                    int var6 = Statics.field2482.field1429;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field2482.field1435 != null) {
                        var5 = (String) Statics.field2482.field1435;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bn.bn(II)Ljava/lang/String;")
    public static final String method1515(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field20 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1344(65408) + var1.substring(0, var1.length() - 8) + class135.field2273 + " " + class2.field22 + var1 + class2.field23 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method1344(16777215) + var1.substring(0, var1.length() - 4) + class135.field2236 + " " + class2.field22 + var1 + class2.field23 + class2.field26;
        } else {
            return " " + class2.method1344(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("ab.bs(IIIIIB)V")
    public static final void method878(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field288[0].method1730(arg0, arg1);
        Statics.field288[1].method1730(arg0, arg1 + arg3 - 16);
        class89.method1770(arg0, arg1 + 16, 16, arg3 - 32, field554);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1770(arg0, arg1 + 16 + var6, 16, var5, field627);
        class89.method1755(arg0, arg1 + 16 + var6, var5, field557);
        class89.method1755(arg0 + 1, arg1 + 16 + var6, var5, field557);
        class89.method1791(arg0, arg1 + 16 + var6, 16, field557);
        class89.method1791(arg0, arg1 + 17 + var6, 16, field557);
        class89.method1755(arg0 + 15, arg1 + 16 + var6, var5, field556);
        class89.method1755(arg0 + 14, arg1 + 17 + var6, var5 - 1, field556);
        class89.method1791(arg0, arg1 + 15 + var6 + var5, 16, field556);
        class89.method1791(arg0 + 1, arg1 + 14 + var6 + var5, 15, field556);
    }

    @ObfuscatedName("x.be(II)Ljava/lang/String;")
    public static final String method150(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ac.cc(Lfh;B)Z")
    public static final boolean method672(class159 arg0) {
        if (arg0.field2734 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2734.length; var1++) {
            int var2 = method53(arg0, var1);
            int var3 = arg0.field2716[var1];
            if (arg0.field2734[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2734[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2734[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("t.cj(Lfh;II)I")
    public static final int method53(class159 arg0, int arg1) {
        if (arg0.field2668 == null || arg1 >= arg0.field2668.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2668[arg1];
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
                    var7 = field615[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field613[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field617[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method2333(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method1565(var12).field997 || field661)) {
                        for (int var13 = 0; var13 < var11.field2720.length; var13++) {
                            if (var12 + 1 == var11.field2720[var13]) {
                                var7 += var11.field2721[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2742[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2088[field613[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2742[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field368.field54;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2084[var14]) {
                            var7 += field613[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method2333(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method1565(var18).field997 || field661)) {
                        for (int var19 = 0; var19 < var17.field2720.length; var19++) {
                            if (var18 + 1 == var17.field2720[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field642;
                }
                if (var6 == 12) {
                    var7 = field584;
                }
                if (var6 == 13) {
                    int var20 = class160.field2742[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method1338(var22);
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
                    var7 = (Statics.field368.field444 >> 7) + Statics.field96;
                }
                if (var6 == 19) {
                    var7 = (Statics.field368.field420 >> 7) + Statics.field92;
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

    @ObfuscatedName("ac.ci([Lfh;IIIIIIII)V")
    public static final void method688(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2617 || var9.field2620 == 0 || var9.field2685 || method2824(var9) != 0 || field649 == var9) && var9.field2625 == arg1 && (!var9.field2617 || !method2263(var9))) {
                int var10 = var9.field2623 + arg6;
                int var11 = var9.field2727 + arg7;
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
                    int var18 = var9.field2627 + var10;
                    int var19 = var9.field2628 + var11;
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
                    int var22 = var9.field2627 + var10;
                    int var23 = var9.field2628 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field648 == var9) {
                    field616 = true;
                    field564 = var10;
                    field641 = var11;
                }
                if (!var9.field2617 || var12 < var14 && var13 < var15) {
                    int var24 = class77.field1410;
                    int var25 = class77.field1411;
                    if (class77.field1425 != 0) {
                        var24 = class77.field1421;
                        var25 = class77.field1416;
                    }
                    if (var9.field2622 == 1337) {
                        method728(var9);
                        if (!field488 && !field619 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field631 == 0 && !field633) {
                                method124(class135.field2267, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class112.field1927; var27++) {
                                int var28 = class112.field1928[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field1245.method1844(Statics.field13, var29, var30, var28) >= 0) {
                                        class32 var33 = class32.method46(var32);
                                        if (var33.field851 != null) {
                                            var33 = var33.method630();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field631 == 1) {
                                            method124(class135.field2262, field580 + " " + class2.field24 + " " + class2.method1344(65535) + var33.field852, 1, var28, var29, var30);
                                        } else if (!field633) {
                                            String[] var34 = var33.field837;
                                            if (field647) {
                                                var34 = method692(var34);
                                            }
                                            if (var34 != null) {
                                                for (int var35 = 4; var35 >= 0; var35--) {
                                                    if (var34[var35] != null) {
                                                        short var36 = 0;
                                                        if (var35 == 0) {
                                                            var36 = 3;
                                                        }
                                                        if (var35 == 1) {
                                                            var36 = 4;
                                                        }
                                                        if (var35 == 2) {
                                                            var36 = 5;
                                                        }
                                                        if (var35 == 3) {
                                                            var36 = 6;
                                                        }
                                                        if (var35 == 4) {
                                                            var36 = 1001;
                                                        }
                                                        method124(var34[var35], class2.method1344(65535) + var33.field852, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method124(class135.field2148, class2.method1344(65535) + var33.field852, 1002, var33.field817 << 14, var29, var30);
                                        } else if ((Statics.field12 & 0x4) == 4) {
                                            method124(field656, field690 + " " + class2.field24 + " " + class2.method1344(65535) + var33.field852, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class25 var37 = field516[var32];
                                        if (var37.field396.field781 == 1 && (var37.field444 & 0x7F) == 64 && (var37.field420 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field581; var38++) {
                                                class25 var39 = field516[field582[var38]];
                                                if (var39 != null && var37 != var39 && var39.field396.field781 == 1 && var37.field444 == var39.field444 && var37.field420 == var39.field420) {
                                                    method249(var39.field396, field582[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field685; var40++) {
                                                class3 var41 = field662[field534[var40]];
                                                if (var41 != null && var37.field444 == var41.field444 && var37.field420 == var41.field420) {
                                                    method2904(var41, field534[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method249(var37.field396, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field662[var32];
                                        if ((var42.field444 & 0x7F) == 64 && (var42.field420 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field581; var43++) {
                                                class25 var44 = field516[field582[var43]];
                                                if (var44 != null && var44.field396.field781 == 1 && var42.field444 == var44.field444 && var42.field420 == var44.field420) {
                                                    method249(var44.field396, field582[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field685; var45++) {
                                                class3 var46 = field662[field534[var45]];
                                                if (var46 != null && var42 != var46 && var42.field444 == var46.field444 && var42.field420 == var46.field420) {
                                                    method2904(var46, field534[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method2904(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class177 var47 = field611[Statics.field13][var29][var30];
                                        if (var47 != null) {
                                            for (class17 var48 = (class17) var47.method3268(); var48 != null; var48 = (class17) var47.method3249()) {
                                                class40 var49 = class40.method1565(var48.field280);
                                                if (field631 == 1) {
                                                    method124(class135.field2262, field580 + " " + class2.field24 + " " + class2.method1344(16748608) + var49.field977, 16, var48.field280, var29, var30);
                                                } else if (!field633) {
                                                    String[] var50 = var49.field998;
                                                    if (field647) {
                                                        var50 = method692(var50);
                                                    }
                                                    for (int var51 = 4; var51 >= 0; var51--) {
                                                        if (var50 != null && var50[var51] != null) {
                                                            byte var52 = 0;
                                                            if (var51 == 0) {
                                                                var52 = 18;
                                                            }
                                                            if (var51 == 1) {
                                                                var52 = 19;
                                                            }
                                                            if (var51 == 2) {
                                                                var52 = 20;
                                                            }
                                                            if (var51 == 3) {
                                                                var52 = 21;
                                                            }
                                                            if (var51 == 4) {
                                                                var52 = 22;
                                                            }
                                                            method124(var50[var51], class2.method1344(16748608) + var49.field977, var52, var48.field280, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method124(class135.field2246, class2.method1344(16748608) + var49.field977, 20, var48.field280, var29, var30);
                                                        }
                                                    }
                                                    method124(class135.field2148, class2.method1344(16748608) + var49.field977, 1004, var48.field280, var29, var30);
                                                } else if ((Statics.field12 & 0x1) == 1) {
                                                    method124(field656, field690 + " " + class2.field24 + " " + class2.method1344(16748608) + var49.field977, 17, var48.field280, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2622 != 1338) {
                        if (!field619 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var64 = var24 - var10;
                            int var65 = var25 - var11;
                            if (var9.field2621 == 1) {
                                method124(var9.field2719, "", 24, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 2 && !field633) {
                                String var66 = method235(var9);
                                if (var66 != null) {
                                    method124(var66, class2.method1344(65280) + var9.field2709, 25, 0, -1, var9.field2618);
                                }
                            }
                            if (var9.field2621 == 3) {
                                method124(class135.field2325, "", 26, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 4) {
                                method124(var9.field2719, "", 28, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 5) {
                                method124(var9.field2719, "", 29, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 6 && field570 == null) {
                                method124(var9.field2719, "", 30, 0, -1, var9.field2618);
                            }
                            if (var9.field2620 == 2) {
                                int var67 = 0;
                                for (int var68 = 0; var68 < var9.field2628; var68++) {
                                    for (int var69 = 0; var69 < var9.field2627; var69++) {
                                        int var70 = (var9.field2671 + 32) * var69;
                                        int var71 = (var9.field2672 + 32) * var68;
                                        if (var67 < 20) {
                                            var70 += var9.field2673[var67];
                                            var71 += var9.field2736[var67];
                                        }
                                        if (var64 >= var70 && var65 >= var71 && var64 < var70 + 32 && var65 < var71 + 32) {
                                            field608 = var67;
                                            Statics.field1775 = var9;
                                            if (var9.field2720[var67] > 0) {
                                                label1273: {
                                                    class40 var72 = class40.method1565(var9.field2720[var67] - 1);
                                                    if (field631 == 1) {
                                                        int var73 = method2824(var9);
                                                        boolean var74 = (var73 >> 30 & 0x1) != 0;
                                                        if (var74) {
                                                            if (Statics.field865 != var9.field2618 || Statics.field3 != var67) {
                                                                method124(class135.field2262, field580 + " " + class2.field24 + " " + class2.method1344(16748608) + var72.field977, 31, var72.field1008, var67, var9.field2618);
                                                            }
                                                            break label1273;
                                                        }
                                                    }
                                                    if (field633) {
                                                        int var75 = method2824(var9);
                                                        boolean var76 = (var75 >> 30 & 0x1) != 0;
                                                        if (var76) {
                                                            if ((Statics.field12 & 0x10) == 16) {
                                                                method124(field656, field690 + " " + class2.field24 + " " + class2.method1344(16748608) + var72.field977, 32, var72.field1008, var67, var9.field2618);
                                                            }
                                                            break label1273;
                                                        }
                                                    }
                                                    String[] var77 = var72.field1018;
                                                    if (field647) {
                                                        var77 = method692(var77);
                                                    }
                                                    int var78 = method2824(var9);
                                                    boolean var79 = (var78 >> 30 & 0x1) != 0;
                                                    if (var79) {
                                                        for (int var80 = 4; var80 >= 3; var80--) {
                                                            if (var77 != null && var77[var80] != null) {
                                                                byte var81;
                                                                if (var80 == 3) {
                                                                    var81 = 36;
                                                                } else {
                                                                    var81 = 37;
                                                                }
                                                                method124(var77[var80], class2.method1344(16748608) + var72.field977, var81, var72.field1008, var67, var9.field2618);
                                                            } else if (var80 == 4) {
                                                                method124(class135.field2123, class2.method1344(16748608) + var72.field977, 37, var72.field1008, var67, var9.field2618);
                                                            }
                                                        }
                                                    }
                                                    int var82 = method2824(var9);
                                                    boolean var83 = (var82 >> 31 & 0x1) != 0;
                                                    if (var83) {
                                                        method124(class135.field2262, class2.method1344(16748608) + var72.field977, 38, var72.field1008, var67, var9.field2618);
                                                    }
                                                    int var84 = method2824(var9);
                                                    boolean var85 = (var84 >> 30 & 0x1) != 0;
                                                    if (var85 && var77 != null) {
                                                        for (int var86 = 2; var86 >= 0; var86--) {
                                                            if (var77[var86] != null) {
                                                                byte var87 = 0;
                                                                if (var86 == 0) {
                                                                    var87 = 33;
                                                                }
                                                                if (var86 == 1) {
                                                                    var87 = 34;
                                                                }
                                                                if (var86 == 2) {
                                                                    var87 = 35;
                                                                }
                                                                method124(var77[var86], class2.method1344(16748608) + var72.field977, var87, var72.field1008, var67, var9.field2618);
                                                            }
                                                        }
                                                    }
                                                    String[] var88 = var9.field2676;
                                                    if (field647) {
                                                        var88 = method692(var88);
                                                    }
                                                    if (var88 != null) {
                                                        for (int var89 = 4; var89 >= 0; var89--) {
                                                            if (var88[var89] != null) {
                                                                byte var90 = 0;
                                                                if (var89 == 0) {
                                                                    var90 = 39;
                                                                }
                                                                if (var89 == 1) {
                                                                    var90 = 40;
                                                                }
                                                                if (var89 == 2) {
                                                                    var90 = 41;
                                                                }
                                                                if (var89 == 3) {
                                                                    var90 = 42;
                                                                }
                                                                if (var89 == 4) {
                                                                    var90 = 43;
                                                                }
                                                                method124(var88[var89], class2.method1344(16748608) + var72.field977, var90, var72.field1008, var67, var9.field2618);
                                                            }
                                                        }
                                                    }
                                                    method124(class135.field2148, class2.method1344(16748608) + var72.field977, 1005, var72.field1008, var67, var9.field2618);
                                                }
                                            }
                                        }
                                        var67++;
                                    }
                                }
                            }
                            if (var9.field2617) {
                                if (!field633) {
                                    for (int var91 = 9; var91 >= 5; var91--) {
                                        String var92 = method3(var9, var91);
                                        if (var92 != null) {
                                            method124(var92, var9.field2678, 1007, var91 + 1, var9.field2619, var9.field2618);
                                        }
                                    }
                                    String var93 = method235(var9);
                                    if (var93 != null) {
                                        method124(var93, var9.field2678, 25, 0, var9.field2619, var9.field2618);
                                    }
                                    for (int var94 = 4; var94 >= 0; var94--) {
                                        String var95 = method3(var9, var94);
                                        if (var95 != null) {
                                            method124(var95, var9.field2678, 57, var94 + 1, var9.field2619, var9.field2618);
                                        }
                                    }
                                    int var96 = method2824(var9);
                                    boolean var97 = (var96 & 0x1) != 0;
                                    if (var97) {
                                        method124(class135.field2263, "", 30, 0, var9.field2619, var9.field2618);
                                    }
                                } else if (class163.method1328(method2824(var9)) && (Statics.field12 & 0x20) == 32) {
                                    method124(field656, field690 + " " + class2.field24 + " " + var9.field2678, 58, 0, var9.field2619, var9.field2618);
                                }
                            }
                        }
                        if (var9.field2620 == 0) {
                            if (!var9.field2617 && method2263(var9) && Statics.field1997 != var9) {
                                continue;
                            }
                            method688(arg0, var9.field2618, var12, var13, var14, var15, var10 - var9.field2631, var11 - var9.field2632);
                            if (var9.field2635 != null) {
                                method688(var9.field2635, var9.field2618, var12, var13, var14, var15, var10 - var9.field2631, var11 - var9.field2632);
                            }
                            class4 var98 = (class4) field597.method3232((long) var9.field2618);
                            if (var98 != null) {
                                if (var98.field56 == 0 && class77.field1410 >= var12 && class77.field1411 >= var13 && class77.field1410 < var14 && class77.field1411 < var15 && !field619 && !field560) {
                                    field625[0] = class135.field2345;
                                    field694[0] = "";
                                    field672[0] = 1006;
                                    field620 = 1;
                                }
                                int var99 = var98.field57;
                                if (class159.method880(var99)) {
                                    method688(Statics.field2830[var99], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2617) {
                            if (var9.field2610 && class77.field1410 >= var12 && class77.field1411 >= var13 && class77.field1410 < var14 && class77.field1411 < var15) {
                                for (class1 var100 = (class1) field674.method3246(); var100 != null; var100 = (class1) field674.method3248()) {
                                    if (var100.field4) {
                                        var100.method3282();
                                        var100.field1.field2642 = false;
                                    }
                                }
                                if (Statics.field1837 == 0) {
                                    field648 = null;
                                    field649 = null;
                                }
                                if (!field619) {
                                    field625[0] = class135.field2345;
                                    field694[0] = "";
                                    field672[0] = 1006;
                                    field620 = 1;
                                }
                            }
                            boolean var101;
                            if (class77.field1410 >= var12 && class77.field1411 >= var13 && class77.field1410 < var14 && class77.field1411 < var15) {
                                var101 = true;
                            } else {
                                var101 = false;
                            }
                            boolean var102 = false;
                            if ((class77.field1404 == 1 || !Statics.field377 && class77.field1404 == 4) && var101) {
                                var102 = true;
                            }
                            boolean var103 = false;
                            if ((class77.field1425 == 1 || !Statics.field377 && class77.field1425 == 4) && class77.field1421 >= var12 && class77.field1416 >= var13 && class77.field1421 < var14 && class77.field1416 < var15) {
                                var103 = true;
                            }
                            if (var103) {
                                int var104 = class77.field1421 - var10;
                                int var105 = class77.field1416 - var11;
                                if (field648 == null && !field619 && var9 != null) {
                                    class159 var106 = method160(var9);
                                    if (var106 == null) {
                                        var106 = var9.field2680;
                                    }
                                    if (var106 != null) {
                                        field648 = var9;
                                        class159 var108 = method160(var9);
                                        if (var108 == null) {
                                            var108 = var9.field2680;
                                        }
                                        field649 = var108;
                                        field650 = var104;
                                        field651 = var105;
                                        Statics.field1837 = 0;
                                        field659 = false;
                                    }
                                }
                            }
                            if (field648 != null && field648 != var9 && var101 && class163.method1324(method2824(var9))) {
                                field652 = var9;
                            }
                            if (field649 == var9) {
                                field653 = true;
                                field654 = var10;
                                field576 = var11;
                            }
                            if (var9.field2685) {
                                if (var101 && field604 != 0 && var9.field2615 != null) {
                                    class1 var110 = new class1();
                                    var110.field4 = true;
                                    var110.field1 = var9;
                                    var110.field5 = field604;
                                    var110.field15 = var9.field2615;
                                    field674.method3261(var110);
                                }
                                if (field648 != null || Statics.field1333 != null || field619) {
                                    var103 = false;
                                    var102 = false;
                                    var101 = false;
                                }
                                if (!var9.field2728 && var103) {
                                    var9.field2728 = true;
                                    if (var9.field2687 != null) {
                                        class1 var111 = new class1();
                                        var111.field4 = true;
                                        var111.field1 = var9;
                                        var111.field10 = class77.field1421 - var10;
                                        var111.field5 = class77.field1416 - var11;
                                        var111.field15 = var9.field2687;
                                        field674.method3261(var111);
                                    }
                                }
                                if (var9.field2728 && var102 && var9.field2688 != null) {
                                    class1 var112 = new class1();
                                    var112.field4 = true;
                                    var112.field1 = var9;
                                    var112.field10 = class77.field1410 - var10;
                                    var112.field5 = class77.field1411 - var11;
                                    var112.field15 = var9.field2688;
                                    field674.method3261(var112);
                                }
                                if (var9.field2728 && !var102) {
                                    var9.field2728 = false;
                                    if (var9.field2733 != null) {
                                        class1 var113 = new class1();
                                        var113.field4 = true;
                                        var113.field1 = var9;
                                        var113.field10 = class77.field1410 - var10;
                                        var113.field5 = class77.field1411 - var11;
                                        var113.field15 = var9.field2733;
                                        field731.method3261(var113);
                                    }
                                }
                                if (var102 && var9.field2648 != null) {
                                    class1 var114 = new class1();
                                    var114.field4 = true;
                                    var114.field1 = var9;
                                    var114.field10 = class77.field1410 - var10;
                                    var114.field5 = class77.field1411 - var11;
                                    var114.field15 = var9.field2648;
                                    field674.method3261(var114);
                                }
                                if (!var9.field2642 && var101) {
                                    var9.field2642 = true;
                                    if (var9.field2737 != null) {
                                        class1 var115 = new class1();
                                        var115.field4 = true;
                                        var115.field1 = var9;
                                        var115.field10 = class77.field1410 - var10;
                                        var115.field5 = class77.field1411 - var11;
                                        var115.field15 = var9.field2737;
                                        field674.method3261(var115);
                                    }
                                }
                                if (var9.field2642 && var101 && var9.field2707 != null) {
                                    class1 var116 = new class1();
                                    var116.field4 = true;
                                    var116.field1 = var9;
                                    var116.field10 = class77.field1410 - var10;
                                    var116.field5 = class77.field1411 - var11;
                                    var116.field15 = var9.field2707;
                                    field674.method3261(var116);
                                }
                                if (var9.field2642 && !var101) {
                                    var9.field2642 = false;
                                    if (var9.field2693 != null) {
                                        class1 var117 = new class1();
                                        var117.field4 = true;
                                        var117.field1 = var9;
                                        var117.field10 = class77.field1410 - var10;
                                        var117.field5 = class77.field1411 - var11;
                                        var117.field15 = var9.field2693;
                                        field731.method3261(var117);
                                    }
                                }
                                if (var9.field2704 != null) {
                                    class1 var118 = new class1();
                                    var118.field1 = var9;
                                    var118.field15 = var9.field2704;
                                    field675.method3261(var118);
                                }
                                if (var9.field2698 != null && field632 > var9.field2730) {
                                    if (var9.field2699 == null || field632 - var9.field2730 > 32) {
                                        class1 var123 = new class1();
                                        var123.field1 = var9;
                                        var123.field15 = var9.field2698;
                                        field674.method3261(var123);
                                    } else {
                                        label865: for (int var119 = var9.field2730; var119 < field632; var119++) {
                                            int var120 = field646[var119 & 0x1F];
                                            for (int var121 = 0; var121 < var9.field2699.length; var121++) {
                                                if (var9.field2699[var121] == var120) {
                                                    class1 var122 = new class1();
                                                    var122.field1 = var9;
                                                    var122.field15 = var9.field2698;
                                                    field674.method3261(var122);
                                                    break label865;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2730 = field632;
                                }
                                if (var9.field2669 != null && field664 > var9.field2655) {
                                    if (var9.field2701 == null || field664 - var9.field2655 > 32) {
                                        class1 var128 = new class1();
                                        var128.field1 = var9;
                                        var128.field15 = var9.field2669;
                                        field674.method3261(var128);
                                    } else {
                                        label845: for (int var124 = var9.field2655; var124 < field664; var124++) {
                                            int var125 = field533[var124 & 0x1F];
                                            for (int var126 = 0; var126 < var9.field2701.length; var126++) {
                                                if (var9.field2701[var126] == var125) {
                                                    class1 var127 = new class1();
                                                    var127.field1 = var9;
                                                    var127.field15 = var9.field2669;
                                                    field674.method3261(var127);
                                                    break label845;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2655 = field664;
                                }
                                if (var9.field2702 != null && field666 > var9.field2732) {
                                    if (var9.field2703 == null || field666 - var9.field2732 > 32) {
                                        class1 var133 = new class1();
                                        var133.field1 = var9;
                                        var133.field15 = var9.field2702;
                                        field674.method3261(var133);
                                    } else {
                                        label825: for (int var129 = var9.field2732; var129 < field666; var129++) {
                                            int var130 = field503[var129 & 0x1F];
                                            for (int var131 = 0; var131 < var9.field2703.length; var131++) {
                                                if (var9.field2703[var131] == var130) {
                                                    class1 var132 = new class1();
                                                    var132.field1 = var9;
                                                    var132.field15 = var9.field2702;
                                                    field674.method3261(var132);
                                                    break label825;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2732 = field666;
                                }
                                if (field667 > var9.field2729 && var9.field2666 != null) {
                                    class1 var134 = new class1();
                                    var134.field1 = var9;
                                    var134.field15 = var9.field2666;
                                    field674.method3261(var134);
                                }
                                if (field543 > var9.field2729 && var9.field2731 != null) {
                                    class1 var135 = new class1();
                                    var135.field1 = var9;
                                    var135.field15 = var9.field2731;
                                    field674.method3261(var135);
                                }
                                if (field669 > var9.field2729 && var9.field2710 != null) {
                                    class1 var136 = new class1();
                                    var136.field1 = var9;
                                    var136.field15 = var9.field2710;
                                    field674.method3261(var136);
                                }
                                if (field670 > var9.field2729 && var9.field2711 != null) {
                                    class1 var137 = new class1();
                                    var137.field1 = var9;
                                    var137.field15 = var9.field2711;
                                    field674.method3261(var137);
                                }
                                var9.field2729 = field495;
                                if (var9.field2664 != null) {
                                    for (int var138 = 0; var138 < field698; var138++) {
                                        class1 var139 = new class1();
                                        var139.field1 = var9;
                                        var139.field11 = field700[var138];
                                        var139.field9 = field606[var138];
                                        var139.field15 = var9.field2664;
                                        field674.method3261(var139);
                                    }
                                }
                            }
                        }
                        if (!var9.field2617) {
                            if (field648 != null || Statics.field1333 != null || field619) {
                                return;
                            }
                            if ((var9.field2692 >= 0 || var9.field2637 != 0) && class77.field1410 >= var12 && class77.field1411 >= var13 && class77.field1410 < var14 && class77.field1411 < var15) {
                                if (var9.field2692 >= 0) {
                                    Statics.field1997 = arg0[var9.field2692];
                                } else {
                                    Statics.field1997 = var9;
                                }
                            }
                            if (var9.field2620 == 8 && class77.field1410 >= var12 && class77.field1411 >= var13 && class77.field1410 < var14 && class77.field1411 < var15) {
                                Statics.field1044 = var9;
                            }
                            if (var9.field2634 > var9.field2628) {
                                int var140 = var9.field2627 + var10;
                                int var141 = var9.field2628;
                                int var142 = var9.field2634;
                                int var143 = class77.field1410;
                                int var144 = class77.field1411;
                                if (field699) {
                                    field559 = 32;
                                } else {
                                    field559 = 0;
                                }
                                field699 = false;
                                if (class77.field1404 == 1 || !Statics.field377 && class77.field1404 == 4) {
                                    if (var143 >= var140 && var143 < var140 + 16 && var144 >= var11 && var144 < var11 + 16) {
                                        var9.field2632 -= 4;
                                        method728(var9);
                                    } else if (var143 >= var140 && var143 < var140 + 16 && var144 >= var11 + var141 - 16 && var144 < var11 + var141) {
                                        var9.field2632 += 4;
                                        method728(var9);
                                    } else if (var143 >= var140 - field559 && var143 < field559 + var140 + 16 && var144 >= var11 + 16 && var144 < var11 + var141 - 16) {
                                        int var145 = (var141 - 32) * var141 / var142;
                                        if (var145 < 8) {
                                            var145 = 8;
                                        }
                                        int var146 = var144 - var11 - 16 - var145 / 2;
                                        int var147 = var141 - 32 - var145;
                                        var9.field2632 = (var142 - var141) * var146 / var147;
                                        method728(var9);
                                        field699 = true;
                                    }
                                }
                                if (field604 != 0) {
                                    int var148 = var9.field2627;
                                    if (var143 >= var140 - var148 && var144 >= var11 && var143 < var140 + 16 && var144 <= var11 + var141) {
                                        var9.field2632 += field604 * 45;
                                        method728(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field711 == 0 || field711 == 3) && (class77.field1425 == 1 || !Statics.field377 && class77.field1425 == 4)) {
                        int var53 = class77.field1421 - 25 - var10;
                        int var54 = class77.field1416 - 5 - var11;
                        if (var53 >= 0 && var54 >= 0 && var53 < 146 && var54 < 151 && (var53 < 0 || var53 > 23 || var54 < 117 || var54 > 142)) {
                            var53 -= 73;
                            var54 -= 75;
                            int var55 = field562 + field548 & 0x7FF;
                            int var56 = class104.field1800[var55];
                            int var57 = class104.field1801[var55];
                            int var58 = (field550 + 256) * var56 >> 8;
                            int var59 = (field550 + 256) * var57 >> 8;
                            int var60 = var53 * var59 + var54 * var58 >> 11;
                            int var61 = var54 * var59 - var53 * var58 >> 11;
                            int var62 = Statics.field368.field444 + var60 >> 7;
                            int var63 = Statics.field368.field420 - var61 >> 7;
                            field519.method2273(152);
                            field519.method2590(18);
                            field519.method2417(class75.field1386[82] ? (class75.field1386[81] ? 2 : 1) : 0);
                            field519.method2576(Statics.field92 + var63);
                            field519.method2426(Statics.field96 + var62);
                            field519.method2590(var53);
                            field519.method2590(var54);
                            field519.method2576(field562);
                            field519.method2590(57);
                            field519.method2590(field548);
                            field519.method2590(field550);
                            field519.method2590(89);
                            field519.method2576(Statics.field368.field444);
                            field519.method2576(Statics.field368.field420);
                            field519.method2590(63);
                            field713 = var62;
                            field710 = var63;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.cb([Lfh;II)V")
    public static final void method113(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2620 == 0) {
                    if (var3.field2635 != null) {
                        method113(var3.field2635, arg1);
                    }
                    class4 var4 = (class4) field597.method3232((long) var3.field2618);
                    if (var4 != null) {
                        int var5 = var4.field57;
                        if (class159.method880(var5)) {
                            method113(Statics.field2830[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2715 != null) {
                    class1 var6 = new class1();
                    var6.field1 = var3;
                    var6.field15 = var3.field2715;
                    class26.method1493(var6);
                }
                if (arg1 == 1 && var3.field2713 != null) {
                    if (var3.field2619 >= 0) {
                        class159 var7 = class159.method2333(var3.field2618);
                        if (var7 == null || var7.field2635 == null || var3.field2619 >= var7.field2635.length || var7.field2635[var3.field2619] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field1 = var3;
                    var8.field15 = var3.field2713;
                    class26.method1493(var8);
                }
            }
        }
    }

    @ObfuscatedName("bg.cy(I)V")
    public static final void method1487() {
        method728(field648);
        Statics.field1837++;
        if (field616 && field653) {
            int var0 = class77.field1410;
            int var1 = class77.field1411;
            int var2 = var0 - field650;
            int var3 = var1 - field651;
            if (var2 < field654) {
                var2 = field654;
            }
            if (field648.field2627 + var2 > field654 + field649.field2627) {
                var2 = field654 + field649.field2627 - field648.field2627;
            }
            if (var3 < field576) {
                var3 = field576;
            }
            if (field648.field2628 + var3 > field576 + field649.field2628) {
                var3 = field576 + field649.field2628 - field648.field2628;
            }
            int var4 = var2 - field564;
            int var5 = var3 - field641;
            int var6 = field648.field2681;
            if (Statics.field1837 > field648.field2649 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field659 = true;
            }
            int var7 = field649.field2631 + (var2 - field654);
            int var8 = field649.field2632 + (var3 - field576);
            if (field648.field2694 != null && field659) {
                class1 var9 = new class1();
                var9.field1 = field648;
                var9.field10 = var7;
                var9.field5 = var8;
                var9.field15 = field648.field2694;
                class26.method1493(var9);
            }
            if (class77.field1404 == 0) {
                if (field659) {
                    if (field648.field2682 != null) {
                        class1 var10 = new class1();
                        var10.field1 = field648;
                        var10.field10 = var7;
                        var10.field5 = var8;
                        var10.field7 = field652;
                        var10.field15 = field648.field2682;
                        class26.method1493(var10);
                    }
                    if (field652 != null && method160(field648) != null) {
                        field519.method2273(12);
                        field519.method2426(field652.field2619);
                        field519.method2576(field648.field2619);
                        field519.method2385(field652.field2618);
                        field519.method2412(field648.field2618);
                    }
                } else if ((field618 == 1 || Statics.method663(field620 - 1)) && field620 > 2) {
                    Statics.method234();
                } else if (field620 > 0) {
                    method2188(field620 - 1);
                }
                field648 = null;
            }
        } else if (Statics.field1837 > 1) {
            field648 = null;
        }
    }

    @ObfuscatedName("aw.ca(Lfh;B)V")
    public static void method728(class159 arg0) {
        if (field679 == arg0.field2717) {
            field680[arg0.field2695] = true;
        }
    }

    @ObfuscatedName("x.ce(I)V")
    public static void method153() {
        for (class4 var0 = (class4) field597.method3226(); var0 != null; var0 = (class4) field597.method3231()) {
            int var1 = var0.field57;
            if (class159.method880(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field2830[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2617;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2826;
                    class159 var6 = class159.method2333(var5);
                    if (var6 != null) {
                        method728(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.cs([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method692(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bd.cq(II)V")
    public static final void method1342(int arg0) {
        if (class159.method880(arg0)) {
            method268(Statics.field2830[arg0], -1);
        }
    }

    @ObfuscatedName("client.cl([Lfh;II)V")
    public static final void method268(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2625 == arg1 && (!var3.field2617 || !method2263(var3))) {
                if (var3.field2620 == 0) {
                    if (!var3.field2617 && method2263(var3) && Statics.field1997 != var3) {
                        continue;
                    }
                    method268(arg0, var3.field2618);
                    if (var3.field2635 != null) {
                        method268(var3.field2635, var3.field2618);
                    }
                    class4 var4 = (class4) field597.method3232((long) var3.field2618);
                    if (var4 != null) {
                        method1342(var4.field57);
                    }
                }
                if (var3.field2620 == 6) {
                    if (var3.field2654 != -1 || var3.field2724 != -1) {
                        boolean var5 = method672(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2724;
                        } else {
                            var6 = var3.field2654;
                        }
                        if (var6 != -1) {
                            class34 var7 = Statics.method61(var6);
                            var3.field2725 += field558;
                            while (var3.field2725 > var7.field888[var3.field2705]) {
                                var3.field2725 -= var7.field888[var3.field2705];
                                var3.field2705++;
                                if (var3.field2705 >= var7.field891.length) {
                                    var3.field2705 -= var7.field890;
                                    if (var3.field2705 < 0 || var3.field2705 >= var7.field891.length) {
                                        var3.field2705 = 0;
                                    }
                                }
                                method728(var3);
                            }
                        }
                    }
                    if (var3.field2662 != 0 && !var3.field2617) {
                        int var8 = var3.field2662 >> 16;
                        int var9 = var3.field2662 << 16 >> 16;
                        int var10 = field558 * var8;
                        int var11 = field558 * var9;
                        var3.field2658 = var3.field2658 + var10 & 0x7FF;
                        var3.field2659 = var3.field2659 + var11 & 0x7FF;
                        method728(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cr(IB)V")
    public static final void method21(int arg0) {
        method153();
        class7.method26();
        class42 var1 = (class42) class42.field1037.method3188((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1040.method2964(16, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method882(new class127(var3));
            }
            class42.field1037.method3190(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1038;
        if (var5 == 0) {
            return;
        }
        int var6 = class160.field2742[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class104.method2085(0.9D);
                ((class110) Statics.field1797).method2182(0.9D);
            }
            if (var6 == 2) {
                class104.method2085(0.8D);
                ((class110) Statics.field1797).method2182(0.8D);
            }
            if (var6 == 3) {
                class104.method2085(0.7D);
                ((class110) Statics.field1797).method2182(0.7D);
            }
            if (var6 == 4) {
                class104.method2085(0.6D);
                ((class110) Statics.field1797).method2182(0.6D);
            }
            class40.field1014.method3191();
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
            if (field517 != var7) {
                if (field517 == 0 && field658 != -1) {
                    class139.method2683(Statics.field509, field658, 0, var7, false);
                    field714 = false;
                } else if (var7 == 0) {
                    Statics.field68.method2755();
                    class139.field2379 = 1;
                    Statics.field2380 = null;
                    field714 = false;
                } else if (class139.field2379 == 0) {
                    Statics.field68.method2754(var7);
                } else {
                    Statics.field89 = var7;
                }
                field517 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field715 = 127;
            }
            if (var6 == 1) {
                field715 = 96;
            }
            if (var6 == 2) {
                field715 = 64;
            }
            if (var6 == 3) {
                field715 = 32;
            }
            if (var6 == 4) {
                field715 = 0;
            }
        }
        if (var5 == 5) {
            field618 = var6;
        }
        if (var5 == 6) {
            field655 = var6;
        }
        if (var5 == 9) {
            field663 = var6;
        }
        if (var5 != 10) {
            return;
        }
        if (var6 == 0) {
            field716 = 127;
        }
        if (var6 == 1) {
            field716 = 96;
        }
        if (var6 == 2) {
            field716 = 64;
        }
        if (var6 == 3) {
            field716 = 32;
        }
        if (var6 == 4) {
            field716 = 0;
        }
    }

    @ObfuscatedName("o.cw(Lfh;I)V")
    public static final void method156(class159 arg0) {
        int var1 = arg0.field2622;
        if (var1 == 324) {
            if (field568 == -1) {
                field568 = arg0.field2718;
                field598 = arg0.field2643;
            }
            if (field691.field2753) {
                arg0.field2718 = field568;
            } else {
                arg0.field2718 = field598;
            }
        } else if (var1 == 325) {
            if (field568 == -1) {
                field568 = arg0.field2718;
                field598 = arg0.field2643;
            }
            if (field691.field2753) {
                arg0.field2718 = field598;
            } else {
                arg0.field2718 = field568;
            }
        } else if (var1 == 327) {
            arg0.field2658 = 150;
            arg0.field2659 = (int) (Math.sin((double) field489 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2650 = 5;
            arg0.field2651 = 0;
        } else if (var1 == 328) {
            arg0.field2658 = 150;
            arg0.field2659 = (int) (Math.sin((double) field489 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2650 = 5;
            arg0.field2651 = 1;
        }
    }

    @ObfuscatedName("bp.cz(B)V")
    public static final void method1384() {
        field519.method2273(30);
        for (class4 var0 = (class4) field597.method3226(); var0 != null; var0 = (class4) field597.method3231()) {
            if (var0.field56 == 0 || var0.field56 == 3) {
                method588(var0, true);
            }
        }
        if (field570 != null) {
            method728(field570);
            field570 = null;
        }
    }

    @ObfuscatedName("au.ch(IIII)Li;")
    public static final class4 method587(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field57 = arg1;
        var3.field56 = arg2;
        field597.method3228(var3, (long) arg0);
        if (class159.method880(arg1)) {
            class159[] var4 = Statics.field2830[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class159 var6 = var4[var5];
                if (var6 != null) {
                    var6.field2705 = 0;
                    var6.field2725 = 0;
                }
            }
        }
        class26.method556(arg1);
        class159 var7 = class159.method2333(arg0);
        if (var7 != null) {
            method728(var7);
        }
        if (field570 != null) {
            method728(field570);
            field570 = null;
        }
        method187();
        if (field637 != -1) {
            int var8 = field637;
            if (class159.method880(var8)) {
                method113(Statics.field2830[var8], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ag.cv(Li;ZI)V")
    public static final void method588(class4 arg0, boolean arg1) {
        int var2 = arg0.field57;
        int var3 = (int) arg0.field2826;
        arg0.method3282();
        if (arg1) {
            class159.method217(var2);
        }
        method155(var2);
        class159 var4 = class159.method2333(var3);
        if (var4 != null) {
            method728(var4);
        }
        method187();
        if (field637 != -1) {
            int var5 = field637;
            if (class159.method880(var5)) {
                method113(Statics.field2830[var5], 1);
            }
        }
    }

    @ObfuscatedName("z.cm(Lfh;I)Z")
    public static final boolean method170(class159 arg0) {
        int var1 = arg0.field2622;
        if (var1 == 205) {
            field526 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field691.method3153(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field691.method3154(var4, var5 == 1);
        }
        if (var1 == 324) {
            field691.method3173(false);
        }
        if (var1 == 325) {
            field691.method3173(true);
        }
        if (var1 == 326) {
            field519.method2273(107);
            field691.method3161(field519);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.ck(IIIILcs;I)V")
    public static final void method558(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field562 + field548 & 0x7FF;
        int var7 = class104.field1800[var6];
        int var8 = class104.field1801[var6];
        int var9 = var7 * 256 / (field550 + 256);
        int var10 = var8 * 256 / (field550 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field881.method1664(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("b.cd(IIIILcs;I)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field562 + field548 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1800[var5];
        int var8 = class104.field1801[var5];
        int var9 = var7 * 256 / (field550 + 256);
        int var10 = var8 * 256 / (field550 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1673(Statics.field1215, arg0 + 94 + var11 - arg4.field1494 / 2 + 4, arg1 + 83 - var12 - arg4.field1497 / 2 - 4);
        } else {
            arg4.method1659(arg0 + 94 + var11 - arg4.field1494 / 2 + 4, arg1 + 83 - var12 - arg4.field1497 / 2 - 4);
        }
    }

    @ObfuscatedName("y.cn(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method112(int arg0, String arg1, String arg2) {
        method263(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("av.cf(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method263(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field626[var4] = field626[var4 - 1];
            field689[var4] = field689[var4 - 1];
            field624[var4] = field624[var4 - 1];
            field665[var4] = field665[var4 - 1];
        }
        field626[0] = arg0;
        field689[0] = arg1;
        field624[0] = arg2;
        field665[0] = arg3;
        field692++;
        field667 = field495;
    }

    @ObfuscatedName("k.co(Ljava/lang/String;I)Z")
    public static boolean method34(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method122(arg0, Statics.field210);
        for (int var2 = 0; var2 < field729; var2++) {
            if (var1.equalsIgnoreCase(class149.method122(field555[var2].field372, Statics.field210))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method122(Statics.field368.field52, Statics.field210))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("o.cp(Ljava/lang/String;I)Z")
    public static boolean method157(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method122(arg0, Statics.field210);
        for (int var2 = 0; var2 < field733; var2++) {
            class11 var3 = field722[var2];
            if (var1.equalsIgnoreCase(class149.method122(var3.field202, Statics.field210))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method122(var3.field199, Statics.field210))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ac.cu(Ljava/lang/String;ZB)V")
    public static final void method687(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field733 < 100 || field635 == 1) || field733 >= 400) {
            method112(0, "", class135.field2280);
            return;
        }
        String var2 = class149.method122(arg0, Statics.field210);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field733; var3++) {
            class11 var4 = field722[var3];
            String var5 = class149.method122(var4.field202, Statics.field210);
            if (var5 != null && var5.equals(var2)) {
                method112(0, "", arg0 + class135.field2251);
                return;
            }
            if (var4.field199 != null) {
                String var6 = class149.method122(var4.field199, Statics.field210);
                if (var6 != null && var6.equals(var2)) {
                    method112(0, "", arg0 + class135.field2251);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field729; var7++) {
            class23 var8 = field555[var7];
            String var9 = class149.method122(var8.field372, Statics.field210);
            if (var9 != null && var9.equals(var2)) {
                method112(0, "", class135.field2286 + arg0 + class135.field2149);
                return;
            }
            if (var8.field369 != null) {
                String var10 = class149.method122(var8.field369, Statics.field210);
                if (var10 != null && var10.equals(var2)) {
                    method112(0, "", class135.field2286 + arg0 + class135.field2149);
                    return;
                }
            }
        }
        if (class149.method122(Statics.field368.field52, Statics.field210).equals(var2)) {
            method112(0, "", class135.field2347);
            return;
        }
        field519.method2273(65);
        class116 var11 = field519;
        int var12 = arg0.length() + 1;
        var11.method2590(var12);
        field519.method2520(arg0);
    }

    @ObfuscatedName("g.cg(Ljava/lang/String;B)V")
    public static final void method123(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method122(arg0, Statics.field210);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field729; var2++) {
            class23 var3 = field555[var2];
            String var4 = var3.field372;
            String var5 = class149.method122(var4, Statics.field210);
            if (class137.method1320(arg0, var1, var4, var5)) {
                field729--;
                for (int var6 = var2; var6 < field729; var6++) {
                    field555[var6] = field555[var6 + 1];
                }
                field543 = field495;
                field519.method2273(54);
                class116 var7 = field519;
                int var8 = arg0.length() + 1;
                var7.method2590(var8);
                field519.method2520(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("el.cx(Ljava/lang/String;B)V")
    public static final void method2684(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method122(arg0, Statics.field210);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field733; var2++) {
            class11 var3 = field722[var2];
            String var4 = var3.field202;
            String var5 = class149.method122(var4, Statics.field210);
            if (class137.method1320(arg0, var1, var4, var5)) {
                field733--;
                for (int var6 = var2; var6 < field733; var6++) {
                    field722[var6] = field722[var6 + 1];
                }
                field543 = field495;
                field519.method2273(10);
                class116 var7 = field519;
                int var8 = arg0.length() + 1;
                var7.method2590(var8);
                field519.method2520(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ek.ct(Ljava/lang/String;IB)V")
    public static final void method2823(String arg0, int arg1) {
        field519.method2273(249);
        class116 var2 = field519;
        int var3 = arg0.length() + 1;
        var2.method2590(var3 + 1);
        field519.method2418(arg1);
        field519.method2520(arg0);
    }

    @ObfuscatedName("o.dk(IS)V")
    public static void method155(int arg0) {
        for (class171 var1 = (class171) field677.method3226(); var1 != null; var1 = (class171) field677.method3231()) {
            if ((long) arg0 == (var1.field2826 >> 48 & 0xFFFFL)) {
                var1.method3282();
            }
        }
    }

    @ObfuscatedName("eb.de(Lfh;I)I")
    public static int method2824(class159 arg0) {
        class171 var1 = (class171) field677.method3232(((long) arg0.field2618 << 32) + (long) arg0.field2619);
        return var1 == null ? arg0.field2677 : var1.field2809;
    }

    @ObfuscatedName("l.dw(Lfh;I)Lfh;")
    public static class159 method160(class159 arg0) {
        int var1 = method2824(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class159.method2333(arg0.field2625);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dh.dp(Lfh;B)Z")
    public static boolean method2263(class159 arg0) {
        if (field560) {
            if (method2824(arg0) != 0) {
                return false;
            }
            if (arg0.field2620 == 0) {
                return false;
            }
        }
        return arg0.field2630;
    }

    @ObfuscatedName("b.df(Lfh;IS)Ljava/lang/String;")
    public static String method3(class159 arg0, int arg1) {
        if (!class163.method1996(method2824(arg0), arg1) && arg0.field2735 == null) {
            return null;
        } else if (arg0.field2679 == null || arg0.field2679.length <= arg1 || arg0.field2679[arg1] == null || arg0.field2679[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2679[arg1];
        }
    }

    @ObfuscatedName("e.dl(Lfh;I)Ljava/lang/String;")
    public static String method235(class159 arg0) {
        if (class163.method1514(method2824(arg0)) == 0) {
            return null;
        } else if (arg0.field2684 == null || arg0.field2684.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2684;
        }
    }
}

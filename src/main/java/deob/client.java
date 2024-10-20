package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class74 {

    @ObfuscatedName("client.r")
    public static boolean field606 = true;

    @ObfuscatedName("client.l")
    public static int field552 = 1;

    @ObfuscatedName("client.s")
    public static int field480 = 0;

    @ObfuscatedName("client.e")
    public static int field481 = 0;

    @ObfuscatedName("client.o")
    public static boolean field484 = false;

    @ObfuscatedName("client.v")
    public static boolean field485 = false;

    @ObfuscatedName("client.m")
    public static int field486 = 0;

    @ObfuscatedName("client.w")
    public static class131[] field540 = new class131[4];

    @ObfuscatedName("client.z")
    public static int field487 = 0;

    @ObfuscatedName("client.h")
    public static boolean field729 = true;

    @ObfuscatedName("client.a")
    public static int field735 = 0;

    @ObfuscatedName("client.c")
    public static long field490 = -1L;

    @ObfuscatedName("client.n")
    public static int field479 = -1;

    @ObfuscatedName("client.t")
    public static int field492 = -1;

    @ObfuscatedName("client.g")
    public static int field610 = -1;

    @ObfuscatedName("client.f")
    public static boolean field494 = true;

    @ObfuscatedName("client.j")
    public static boolean field495 = false;

    @ObfuscatedName("client.af")
    public static int field496 = 0;

    @ObfuscatedName("client.ar")
    public static int field497 = 0;

    @ObfuscatedName("client.ax")
    public static int field498 = 0;

    @ObfuscatedName("client.at")
    public static int field499 = 0;

    @ObfuscatedName("client.ah")
    public static int field500 = 0;

    @ObfuscatedName("client.ap")
    public static int field491 = 0;

    @ObfuscatedName("client.ay")
    public static int field502 = 0;

    @ObfuscatedName("client.ag")
    public static int field503 = 0;

    @ObfuscatedName("client.ai")
    public static int field714 = 0;

    @ObfuscatedName("client.aw")
    public static class128 field505 = new class128(new byte[5000]);

    @ObfuscatedName("client.au")
    public static int field507 = 0;

    @ObfuscatedName("client.ae")
    public static int field508 = 0;

    @ObfuscatedName("client.ad")
    public static int field672 = 0;

    @ObfuscatedName("client.bl")
    public static int field506 = 0;

    @ObfuscatedName("client.bq")
    public static int field514 = 0;

    @ObfuscatedName("client.bc")
    public static int field515 = 0;

    @ObfuscatedName("client.bb")
    public static int field584 = 0;

    @ObfuscatedName("client.bt")
    public static int field687 = 0;

    @ObfuscatedName("client.bm")
    public static class26[] field518 = new class26[32768];

    @ObfuscatedName("client.bj")
    public static int field519 = 0;

    @ObfuscatedName("client.bk")
    public static int[] field603 = new int[32768];

    @ObfuscatedName("client.cb")
    public static class117 field689 = new class117(5000);

    @ObfuscatedName("client.cd")
    public static class117 field522 = new class117(5000);

    @ObfuscatedName("client.ch")
    public static class117 field523 = new class117(5000);

    @ObfuscatedName("client.cj")
    public static int field684 = 0;

    @ObfuscatedName("client.cl")
    public static int field525 = 0;

    @ObfuscatedName("client.cn")
    public static int field653 = 0;

    @ObfuscatedName("client.cz")
    public static int field527 = 0;

    @ObfuscatedName("client.ck")
    public static int field528 = 0;

    @ObfuscatedName("client.cs")
    public static int field529 = 0;

    @ObfuscatedName("client.cr")
    public static int field530 = 0;

    @ObfuscatedName("client.cu")
    public static int field509 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field532 = false;

    @ObfuscatedName("client.cq")
    public static int field578 = 0;

    @ObfuscatedName("client.cy")
    public static int field535 = 0;

    @ObfuscatedName("client.cg")
    public static int field536 = 1;

    @ObfuscatedName("client.du")
    public static int field524 = 0;

    @ObfuscatedName("client.dm")
    public static int field538 = 1;

    @ObfuscatedName("client.dg")
    public static int field612 = 0;

    @ObfuscatedName("client.dl")
    public static boolean field541 = false;

    @ObfuscatedName("client.dr")
    public static int[][][] field542 = new int[4][13][13];

    @ObfuscatedName("client.dw")
    public static final int[] field517 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field544 = 0;

    @ObfuscatedName("client.dh")
    public static int field629 = 2;

    @ObfuscatedName("client.dd")
    public static int field546 = 0;

    @ObfuscatedName("client.dc")
    public static int field628 = 2;

    @ObfuscatedName("client.dv")
    public static int field476 = 0;

    @ObfuscatedName("client.dx")
    public static int field549 = 1;

    @ObfuscatedName("client.do")
    public static int field550 = 0;

    @ObfuscatedName("client.df")
    public static int field551 = 0;

    @ObfuscatedName("client.ds")
    public static int field699 = 2;

    @ObfuscatedName("client.db")
    public static int field553 = 0;

    @ObfuscatedName("client.dy")
    public static int field554 = 1;

    @ObfuscatedName("client.eo")
    public static int field555 = 0;

    @ObfuscatedName("client.ec")
    public static int field556 = 0;

    @ObfuscatedName("client.ee")
    public static int field558 = 2301979;

    @ObfuscatedName("client.ej")
    public static int field559 = 5063219;

    @ObfuscatedName("client.ea")
    public static int field560 = 3353893;

    @ObfuscatedName("client.ek")
    public static int field708 = 7759444;

    @ObfuscatedName("client.eg")
    public static boolean field562 = false;

    @ObfuscatedName("client.et")
    public static int field563 = 0;

    @ObfuscatedName("client.fp")
    public static int field564 = 128;

    @ObfuscatedName("client.fk")
    public static int field565 = 0;

    @ObfuscatedName("client.fj")
    public static int field730 = 0;

    @ObfuscatedName("client.fa")
    public static int field567 = 0;

    @ObfuscatedName("client.ft")
    public static int field680 = 0;

    @ObfuscatedName("client.fu")
    public static int field569 = 0;

    @ObfuscatedName("client.fh")
    public static int field733 = 0;

    @ObfuscatedName("client.fw")
    public static boolean field571 = false;

    @ObfuscatedName("client.fd")
    public static int field572 = 0;

    @ObfuscatedName("client.fb")
    public static int field573 = 0;

    @ObfuscatedName("client.fe")
    public static int field638 = 50;

    @ObfuscatedName("client.fo")
    public static int[] field526 = new int[field638];

    @ObfuscatedName("client.fq")
    public static int[] field575 = new int[field638];

    @ObfuscatedName("client.ff")
    public static int[] field577 = new int[field638];

    @ObfuscatedName("client.fr")
    public static int[] field534 = new int[field638];

    @ObfuscatedName("client.fc")
    public static int[] field579 = new int[field638];

    @ObfuscatedName("client.fz")
    public static int[] field580 = new int[field638];

    @ObfuscatedName("client.fx")
    public static int[] field581 = new int[field638];

    @ObfuscatedName("client.fy")
    public static String[] field521 = new String[field638];

    @ObfuscatedName("client.ge")
    public static int[][] field670 = new int[104][104];

    @ObfuscatedName("client.gk")
    public static int field633 = 0;

    @ObfuscatedName("client.ga")
    public static int field585 = -1;

    @ObfuscatedName("client.gj")
    public static int field586 = -1;

    @ObfuscatedName("client.gh")
    public static int field587 = 0;

    @ObfuscatedName("client.gl")
    public static int field588 = 0;

    @ObfuscatedName("client.gi")
    public static int field589 = 0;

    @ObfuscatedName("client.gf")
    public static int field590 = 0;

    @ObfuscatedName("client.gw")
    public static int field591 = 0;

    @ObfuscatedName("client.go")
    public static int field592 = 0;

    @ObfuscatedName("client.gu")
    public static int field593 = 0;

    @ObfuscatedName("client.gn")
    public static int field712 = 0;

    @ObfuscatedName("client.gv")
    public static int field595 = 0;

    @ObfuscatedName("client.gx")
    public static int field596 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field537 = false;

    @ObfuscatedName("client.gc")
    public static int field598 = 0;

    @ObfuscatedName("client.gy")
    public static int field547 = 0;

    @ObfuscatedName("client.gm")
    public static class3[] field600 = new class3[2048];

    @ObfuscatedName("client.gb")
    public static int field601 = 0;

    @ObfuscatedName("client.gq")
    public static int[] field662 = new int[2048];

    @ObfuscatedName("client.gz")
    public static int field639 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field604 = new int[2048];

    @ObfuscatedName("client.hl")
    public static class128[] field605 = new class128[2048];

    @ObfuscatedName("client.hm")
    public static int field700 = -1;

    @ObfuscatedName("client.hu")
    public static int field623 = 0;

    @ObfuscatedName("client.hv")
    public static int field608 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field609 = new int[1000];

    @ObfuscatedName("client.hn")
    public static final int[] field698 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hs")
    public static String[] field611 = new String[8];

    @ObfuscatedName("client.hh")
    public static boolean[] field646 = new boolean[8];

    @ObfuscatedName("client.he")
    public static int[] field613 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hi")
    public static class179[][][] field614 = new class179[4][104][104];

    @ObfuscatedName("client.hd")
    public static class179 field615 = new class179();

    @ObfuscatedName("client.hx")
    public static class179 field616 = new class179();

    @ObfuscatedName("client.hr")
    public static class179 field489 = new class179();

    @ObfuscatedName("client.hc")
    public static int[] field618 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field619 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field620 = new int[25];

    @ObfuscatedName("client.hf")
    public static int field621 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field622 = false;

    @ObfuscatedName("client.ik")
    public static int field685 = 0;

    @ObfuscatedName("client.iu")
    public static int[] field667 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field625 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field626 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field627 = new int[500];

    @ObfuscatedName("client.ir")
    public static String[] field677 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field652 = new String[500];

    @ObfuscatedName("client.iq")
    public static int field630 = -1;

    @ObfuscatedName("client.ii")
    public static int field669 = -1;

    @ObfuscatedName("client.ip")
    public static int field632 = 0;

    @ObfuscatedName("client.ie")
    public static int field504 = 50;

    @ObfuscatedName("client.ij")
    public static int field634 = 0;

    @ObfuscatedName("client.it")
    public static String field635 = null;

    @ObfuscatedName("client.ib")
    public static boolean field636 = false;

    @ObfuscatedName("client.ix")
    public static int field637 = -1;

    @ObfuscatedName("client.iv")
    public static String field647 = null;

    @ObfuscatedName("client.if")
    public static String field597 = null;

    @ObfuscatedName("client.jv")
    public static int field640 = -1;

    @ObfuscatedName("client.ji")
    public static class177 field641 = new class177(8);

    @ObfuscatedName("client.ja")
    public static int field642 = 0;

    @ObfuscatedName("client.jg")
    public static int field594 = 0;

    @ObfuscatedName("client.je")
    public static class161 field644 = null;

    @ObfuscatedName("client.jm")
    public static int field645 = 0;

    @ObfuscatedName("client.jj")
    public static int field574 = 0;

    @ObfuscatedName("client.jf")
    public static int field511 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field648 = false;

    @ObfuscatedName("client.jw")
    public static boolean field649 = false;

    @ObfuscatedName("client.jz")
    public static boolean field650 = false;

    @ObfuscatedName("client.jd")
    public static class161 field651 = null;

    @ObfuscatedName("client.jc")
    public static class161 field520 = null;

    @ObfuscatedName("client.jo")
    public static int field478 = 0;

    @ObfuscatedName("client.jr")
    public static int field654 = 0;

    @ObfuscatedName("client.jn")
    public static class161 field655 = null;

    @ObfuscatedName("client.jy")
    public static boolean field656 = false;

    @ObfuscatedName("client.jl")
    public static int field568 = -1;

    @ObfuscatedName("client.jk")
    public static int field658 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field659 = false;

    @ObfuscatedName("client.jp")
    public static int field660 = -1;

    @ObfuscatedName("client.ju")
    public static int field661 = -1;

    @ObfuscatedName("client.js")
    public static boolean field576 = false;

    @ObfuscatedName("client.ku")
    public static int field545 = 1;

    @ObfuscatedName("client.kb")
    public static int[] field664 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field665 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field666 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field512 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field668 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field548 = 0;

    @ObfuscatedName("client.kt")
    public static int field717 = 0;

    @ObfuscatedName("client.kj")
    public static int field671 = 0;

    @ObfuscatedName("client.ki")
    public static int field663 = 0;

    @ObfuscatedName("client.kd")
    public static int field673 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field674 = new int[2000];

    @ObfuscatedName("client.kc")
    public static String[] field643 = new String[1000];

    @ObfuscatedName("client.kw")
    public static int field676 = 0;

    @ObfuscatedName("client.kp")
    public static class179 field501 = new class179();

    @ObfuscatedName("client.ka")
    public static class179 field678 = new class179();

    @ObfuscatedName("client.ko")
    public static class179 field711 = new class179();

    @ObfuscatedName("client.ke")
    public static class177 field533 = new class177(512);

    @ObfuscatedName("client.kq")
    public static int field681 = 0;

    @ObfuscatedName("client.kz")
    public static int field682 = -2;

    @ObfuscatedName("client.kg")
    public static boolean[] field683 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field516 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field617 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static int[] field686 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field720 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field688 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field675 = new int[100];

    @ObfuscatedName("client.li")
    public static int field690 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field691 = new int[100];

    @ObfuscatedName("client.ln")
    public static String[] field692 = new String[100];

    @ObfuscatedName("client.lh")
    public static String[] field710 = new String[100];

    @ObfuscatedName("client.lm")
    public static String[] field694 = new String[100];

    @ObfuscatedName("client.le")
    public static int field695 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field696 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field697 = 0;

    @ObfuscatedName("client.lj")
    public static int field607 = 0;

    @ObfuscatedName("client.lo")
    public static long[] field624 = new long[100];

    @ObfuscatedName("client.lq")
    public static int field602 = 0;

    @ObfuscatedName("client.lp")
    public static int field701 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field657 = new int[128];

    @ObfuscatedName("client.lc")
    public static int[] field703 = new int[128];

    @ObfuscatedName("client.lu")
    public static long field704 = -1L;

    @ObfuscatedName("client.lx")
    public static String field705 = null;

    @ObfuscatedName("client.mu")
    public static String field706 = null;

    @ObfuscatedName("client.ma")
    public static int field707 = -1;

    @ObfuscatedName("client.ms")
    public static int field599 = 0;

    @ObfuscatedName("client.mo")
    public static int[] field709 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field716 = new int[1000];

    @ObfuscatedName("client.mf")
    public static class87[] field482 = new class87[1000];

    @ObfuscatedName("client.mg")
    public static int field570 = 0;

    @ObfuscatedName("client.mn")
    public static int field531 = 0;

    @ObfuscatedName("client.mh")
    public static int field566 = 0;

    @ObfuscatedName("client.mw")
    public static int field715 = 255;

    @ObfuscatedName("client.mi")
    public static int field582 = -1;

    @ObfuscatedName("client.mz")
    public static boolean field543 = false;

    @ObfuscatedName("client.mq")
    public static int field718 = 127;

    @ObfuscatedName("client.mp")
    public static int field719 = 127;

    @ObfuscatedName("client.nr")
    public static int field702 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field721 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field722 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field723 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field724 = new int[50];

    @ObfuscatedName("client.nm")
    public static class58[] field725 = new class58[50];

    @ObfuscatedName("client.np")
    public static boolean field726 = false;

    @ObfuscatedName("client.nl")
    public static boolean[] field727 = new boolean[5];

    @ObfuscatedName("client.nz")
    public static int[] field728 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field693 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field731 = new int[5];

    @ObfuscatedName("client.oc")
    public static int field732 = 0;

    @ObfuscatedName("client.ov")
    public static int field561 = 0;

    @ObfuscatedName("client.of")
    public static class24[] field734 = new class24[400];

    @ObfuscatedName("client.ou")
    public static class175 field493 = new class175();

    @ObfuscatedName("client.oq")
    public static int field736 = 0;

    @ObfuscatedName("client.oj")
    public static class11[] field737 = new class11[400];

    @ObfuscatedName("client.oi")
    public static class166 field738 = new class166();

    @ObfuscatedName("client.oh")
    public static int field739 = -1;

    @ObfuscatedName("client.om")
    public static int field583 = -1;

    @ObfuscatedName("client.s(B)V")
    public final void method278() {
    }

    public final void init() {
        if (!this.method1479()) {
            return;
        }
        class169[] var1 = new class169[] { class169.field2801, class169.field2796, class169.field2800, class169.field2805, class169.field2803, class169.field2799, class169.field2804, class169.field2798, class169.field2802, class169.field2797 };
        class169[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class169 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2794);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2794)) {
                    case 1:
                        int var12 = Integer.parseInt(var5);
                        class134[] var13 = new class134[] { class134.field2088, class134.field2095, class134.field2097, class134.field2091 };
                        class134[] var14 = var13;
                        int var15 = 0;
                        class134 var17;
                        while (true) {
                            if (var15 >= var14.length) {
                                var17 = null;
                                break;
                            }
                            class134 var16 = var14[var15];
                            if (var16.field2092 == var12) {
                                var17 = var16;
                                break;
                            }
                            var15++;
                        }
                        Statics.field2858 = var17;
                        break;
                    case 2:
                        field480 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                        }
                        break;
                    case 4:
                        Statics.field296 = var5;
                        break;
                    case 5:
                        class136[] var6 = class136.method2908();
                        int var7 = Integer.parseInt(var5);
                        class136[] var8 = var6;
                        int var9 = 0;
                        class136 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class136 var10 = var8[var9];
                            if (var7 == var10.method2372()) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field631 = (class136) var11;
                        if (Statics.field631 == class136.field2115) {
                            Statics.field483 = class188.field2885;
                        } else {
                            Statics.field483 = class188.field2883;
                        }
                    case 6:
                    default:
                        break;
                    case 7:
                        field486 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                            field484 = true;
                        } else {
                            field484 = false;
                        }
                        break;
                    case 9:
                        field481 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field552 = Integer.parseInt(var5);
                }
            }
        }
        class96.field1605 = false;
        field485 = false;
        Statics.field2579 = this.getCodeBase().getHost();
        String var18 = Statics.field2858.field2089;
        byte var19 = 0;
        try {
            Statics.field239 = 16;
            Statics.field397 = var19;
            try {
                Statics.field26 = System.getProperty("os.name");
            } catch (Exception var64) {
                Statics.field26 = "Unknown";
            }
            Statics.field1446 = Statics.field26.toLowerCase();
            try {
                Statics.field2854 = System.getProperty("user.home");
                if (Statics.field2854 != null) {
                    Statics.field2854 = Statics.field2854 + "/";
                }
            } catch (Exception var63) {
            }
            try {
                if (Statics.field1446.startsWith("win")) {
                    if (Statics.field2854 == null) {
                        Statics.field2854 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2854 == null) {
                    Statics.field2854 = System.getenv("HOME");
                }
                if (Statics.field2854 != null) {
                    Statics.field2854 = Statics.field2854 + "/";
                }
            } catch (Exception var62) {
            }
            if (Statics.field2854 == null) {
                Statics.field2854 = "~/";
            }
            Statics.field1457 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2854, "/tmp/", "" };
            Statics.field184 = new String[] { ".jagex_cache_" + Statics.field397, ".file_store_" + Statics.field397 };
            int var23 = 0;
            label279: while (var23 < 4) {
                String var24 = var23 == 0 ? "" : "" + var23;
                Statics.field1448 = new File(Statics.field2854, "jagex_cl_oldschool_" + var18 + var24 + ".dat");
                String var25 = null;
                String var26 = null;
                boolean var27 = false;
                if (Statics.field1448.exists()) {
                    try {
                        class30 var28 = new class30(Statics.field1448, "rw", 10000L);
                        class128 var29 = new class128((int) var28.method573());
                        while (var29.field2048 < var29.field2050.length) {
                            int var30 = var28.method574(var29.field2050, var29.field2048, var29.field2050.length - var29.field2048);
                            if (var30 == -1) {
                                throw new IOException();
                            }
                            var29.field2048 += var30;
                        }
                        var29.field2048 = 0;
                        int var31 = var29.method2531();
                        if (var31 < 1 || var31 > 3) {
                            throw new IOException("" + var31);
                        }
                        int var32 = 0;
                        if (var31 > 1) {
                            var32 = var29.method2531();
                        }
                        if (var31 <= 2) {
                            var25 = var29.method2472();
                            if (var32 == 1) {
                                var26 = var29.method2472();
                            }
                        } else {
                            var25 = var29.method2491();
                            if (var32 == 1) {
                                var26 = var29.method2491();
                            }
                        }
                        var28.method572();
                    } catch (IOException var67) {
                        var67.printStackTrace();
                    }
                    if (var25 != null) {
                        File var34 = new File(var25);
                        if (!var34.exists()) {
                            var25 = null;
                        }
                    }
                    if (var25 != null) {
                        File var35 = new File(var25, "test.dat");
                        if (!class83.method2224(var35, true)) {
                            var25 = null;
                        }
                    }
                }
                if (var25 == null && var23 == 0) {
                    label255: for (int var36 = 0; var36 < Statics.field184.length; var36++) {
                        for (int var37 = 0; var37 < Statics.field1457.length; var37++) {
                            File var38 = new File(Statics.field1457[var37] + Statics.field184[var36] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var38.exists() && class83.method2224(new File(var38, "test.dat"), true)) {
                                var25 = var38.toString();
                                var27 = true;
                                break label255;
                            }
                        }
                    }
                }
                if (var25 == null) {
                    var25 = Statics.field2854 + File.separatorChar + "jagexcache" + var24 + File.separatorChar + "oldschool" + File.separatorChar + var18 + File.separatorChar;
                    var27 = true;
                }
                if (var26 != null) {
                    File var39 = new File(var26);
                    File var40 = new File(var25);
                    try {
                        File[] var41 = var39.listFiles();
                        File[] var42 = var41;
                        for (int var43 = 0; var43 < var42.length; var43++) {
                            File var44 = var42[var43];
                            File var45 = new File(var40, var44.getName());
                            boolean var46 = var44.renameTo(var45);
                            if (!var46) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var66) {
                        var66.printStackTrace();
                    }
                    var27 = true;
                }
                if (var27) {
                    Statics.method1426(new File(var25), (File) null);
                }
                File var48 = new File(var25);
                Statics.field1212 = var48;
                if (!Statics.field1212.exists()) {
                    Statics.field1212.mkdirs();
                }
                File[] var49 = Statics.field1212.listFiles();
                if (var49 == null) {
                    break;
                }
                File[] var50 = var49;
                int var51 = 0;
                while (true) {
                    if (var51 >= var50.length) {
                        break label279;
                    }
                    File var52 = var50[var51];
                    if (!class83.method2224(var52, false)) {
                        var23++;
                        break;
                    }
                    var51++;
                }
            }
            class73.method560(Statics.field1212);
            try {
                File var53 = new File(Statics.field2854, "random.dat");
                if (var53.exists()) {
                    class83.field1452 = new class31(new class30(var53, "rw", 25L), 24, 0);
                } else {
                    label210: for (int var54 = 0; var54 < Statics.field184.length; var54++) {
                        for (int var55 = 0; var55 < Statics.field1457.length; var55++) {
                            File var56 = new File(Statics.field1457[var55] + Statics.field184[var54] + File.separatorChar + "random.dat");
                            if (var56.exists()) {
                                class83.field1452 = new class31(new class30(var56, "rw", 25L), 24, 0);
                                break label210;
                            }
                        }
                    }
                }
                if (class83.field1452 == null) {
                    RandomAccessFile var57 = new RandomAccessFile(var53, "rw");
                    int var58 = var57.read();
                    var57.seek(0L);
                    var57.write(var58);
                    var57.seek(0L);
                    var57.close();
                    class83.field1452 = new class31(new class30(var53, "rw", 25L), 24, 0);
                }
            } catch (IOException var65) {
            }
            class83.field1453 = new class31(new class30(class73.method1414("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class83.field1454 = new class31(new class30(class73.method1414("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1455 = new class31[Statics.field239];
            for (int var60 = 0; var60 < Statics.field239; var60++) {
                Statics.field1455[var60] = new class31(new class30(class73.method1414("main_file_cache.idx" + var60), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var68) {
            class81.method3159((String) null, var68);
        }
        Statics.field477 = this;
        this.method1422(765, 503, 43);
    }

    @ObfuscatedName("client.e(B)V")
    public final void method281() {
        Statics.field1693 = field481 == 0 ? 43594 : field552 + 40000;
        Statics.field1034 = field481 == 0 ? 443 : field552 + 50000;
        Statics.field2072 = Statics.field1693;
        Statics.field2493 = class164.field2747;
        Statics.field66 = class164.field2744;
        Statics.field2757 = class164.field2749;
        Statics.field1640 = class164.field2746;
        if (Statics.field1360.toLowerCase().indexOf("microsoft") == -1) {
            class76.field1370[44] = 71;
            class76.field1370[45] = 26;
            class76.field1370[46] = 72;
            class76.field1370[47] = 73;
            class76.field1370[59] = 57;
            class76.field1370[61] = 27;
            class76.field1370[91] = 42;
            class76.field1370[92] = 74;
            class76.field1370[93] = 43;
            class76.field1370[192] = 28;
            class76.field1370[222] = 58;
            class76.field1370[520] = 59;
        } else {
            class76.field1370[186] = 57;
            class76.field1370[187] = 27;
            class76.field1370[188] = 71;
            class76.field1370[189] = 26;
            class76.field1370[190] = 72;
            class76.field1370[191] = 73;
            class76.field1370[192] = 58;
            class76.field1370[219] = 42;
            class76.field1370[220] = 74;
            class76.field1370[221] = 43;
            class76.field1370[222] = 59;
            class76.field1370[223] = 28;
        }
        class76.method1399(Statics.field1230);
        class78.method1605(Statics.field1230);
        Statics.field51 = class67.method1();
        if (Statics.field51 != null) {
            Statics.field51.method1355(Statics.field1230);
        }
        Statics.field48 = new class72(255, class83.field1453, class83.field1454, 500000);
        Statics.field247 = class12.method566();
        Statics.field62 = this.getToolkit().getSystemClipboard();
        if (field481 != 0) {
            field495 = true;
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method282() {
        field735++;
        this.method285();
        while (true) {
            class179 var1 = class160.field2604;
            class159 var2;
            synchronized (class160.field2604) {
                var2 = (class159) class160.field2605.method3337();
            }
            if (var2 == null) {
                try {
                    if (class141.field2382 == 1) {
                        int var4 = Statics.field2381.method2854();
                        if (var4 > 0 && Statics.field2381.method2792()) {
                            int var5 = var4 - Statics.field2476;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2381.method2786(var5);
                        } else {
                            Statics.field2381.method2791();
                            Statics.field2381.method2789();
                            if (Statics.field2380 == null) {
                                class141.field2382 = 0;
                            } else {
                                class141.field2382 = 2;
                            }
                            Statics.field2383 = null;
                            Statics.field2378 = null;
                        }
                    }
                } catch (Exception var600) {
                    var600.printStackTrace();
                    Statics.field2381.method2791();
                    class141.field2382 = 0;
                    Statics.field2383 = null;
                    Statics.field2378 = null;
                    Statics.field2380 = null;
                }
                method1870();
                class76 var7 = class76.field1391;
                synchronized (class76.field1391) {
                    class76.field1389++;
                    class76.field1386 = class76.field1388;
                    class76.field1385 = 0;
                    if (class76.field1374 >= 0) {
                        while (class76.field1374 != class76.field1363) {
                            int var9 = class76.field1364[class76.field1363];
                            class76.field1363 = class76.field1363 + 1 & 0x7F;
                            if (var9 < 0) {
                                class76.field1390[~var9] = false;
                            } else {
                                if (!class76.field1390[var9] && class76.field1385 < class76.field1384.length - 1) {
                                    class76.field1384[++class76.field1385 - 1] = var9;
                                }
                                class76.field1390[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class76.field1390[var8] = false;
                        }
                        class76.field1374 = class76.field1363;
                    }
                    class76.field1388 = class76.field1387;
                }
                class78.method28();
                if (Statics.field51 != null) {
                    int var11 = Statics.field51.method1345();
                    field676 = var11;
                }
                if (field487 == 0) {
                    method210();
                    Statics.field399.method1336();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field1329[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field1338[var13] = 0L;
                    }
                    Statics.field907 = 0;
                } else if (field487 == 5) {
                    class22.method1311(this);
                    method210();
                    Statics.field399.method1336();
                    for (int var14 = 0; var14 < 32; var14++) {
                        field1329[var14] = 0L;
                    }
                    for (int var15 = 0; var15 < 32; var15++) {
                        field1338[var15] = 0L;
                    }
                    Statics.field907 = 0;
                } else if (field487 == 10) {
                    class22.method1311(this);
                } else if (field487 == 20) {
                    class22.method1311(this);
                    method2048();
                } else if (field487 == 25) {
                    method30(false);
                    field535 = 0;
                    boolean var16 = true;
                    for (int var17 = 0; var17 < Statics.field818.length; var17++) {
                        if (Statics.field1397[var17] != -1 && Statics.field818[var17] == null) {
                            Statics.field818[var17] = Statics.field343.method3043(Statics.field1397[var17], 0);
                            if (Statics.field818[var17] == null) {
                                var16 = false;
                                field535++;
                            }
                        }
                        if (Statics.field253[var17] != -1 && Statics.field2480[var17] == null) {
                            Statics.field2480[var17] = Statics.field343.method3058(Statics.field253[var17], 0, Statics.field2051[var17]);
                            if (Statics.field2480[var17] == null) {
                                var16 = false;
                                field535++;
                            }
                        }
                    }
                    if (var16) {
                        field524 = 0;
                        boolean var18 = true;
                        for (int var19 = 0; var19 < Statics.field818.length; var19++) {
                            byte[] var20 = Statics.field2480[var19];
                            if (var20 != null) {
                                int var21 = (Statics.field753[var19] >> 8) * 64 - Statics.field52;
                                int var22 = (Statics.field753[var19] & 0xFF) * 64 - Statics.field332;
                                if (field541) {
                                    var21 = 10;
                                    var22 = 10;
                                }
                                boolean var24 = true;
                                class128 var25 = new class128(var20);
                                int var26 = -1;
                                label3580: while (true) {
                                    int var27 = var25.method2476();
                                    if (var27 == 0) {
                                        var18 &= var24;
                                        break;
                                    }
                                    var26 += var27;
                                    int var28 = 0;
                                    boolean var29 = false;
                                    while (true) {
                                        while (!var29) {
                                            int var31 = var25.method2476();
                                            if (var31 == 0) {
                                                continue label3580;
                                            }
                                            var28 += var31 - 1;
                                            int var32 = var28 & 0x3F;
                                            int var33 = var28 >> 6 & 0x3F;
                                            int var34 = var25.method2531() >> 2;
                                            int var35 = var21 + var33;
                                            int var36 = var22 + var32;
                                            if (var35 > 0 && var36 > 0 && var35 < 103 && var36 < 103) {
                                                class33 var37 = Statics.method2776(var26);
                                                if (var34 != 22 || !field485 || var37.field833 != 0 || var37.field831 == 1 || var37.field852) {
                                                    if (!var37.method686()) {
                                                        field524++;
                                                        var24 = false;
                                                    }
                                                    var29 = true;
                                                }
                                            }
                                        }
                                        int var30 = var25.method2476();
                                        if (var30 == 0) {
                                            break;
                                        }
                                        var25.method2531();
                                    }
                                }
                            }
                        }
                        if (var18) {
                            if (field612 != 0) {
                                method32(class137.field2129 + class2.field21 + class2.field18 + 100 + "%" + class2.field19, true);
                            }
                            method1870();
                            method173();
                            method1870();
                            Statics.field192.method2037();
                            method1870();
                            System.gc();
                            for (int var39 = 0; var39 < 4; var39++) {
                                field540[var39].method2694();
                            }
                            for (int var40 = 0; var40 < 4; var40++) {
                                for (int var41 = 0; var41 < 104; var41++) {
                                    for (int var42 = 0; var42 < 104; var42++) {
                                        class9.field127[var40][var41][var42] = 0;
                                    }
                                }
                            }
                            method1870();
                            class9.method557();
                            int var43 = Statics.field818.length;
                            class7.method263();
                            method30(true);
                            if (!field541) {
                                int var44 = 0;
                                label3518: while (true) {
                                    if (var44 >= var43) {
                                        for (int var58 = 0; var58 < var43; var58++) {
                                            int var59 = (Statics.field753[var58] >> 8) * 64 - Statics.field52;
                                            int var60 = (Statics.field753[var58] & 0xFF) * 64 - Statics.field332;
                                            byte[] var61 = Statics.field818[var58];
                                            if (var61 == null && Statics.field2597 < 800) {
                                                method1870();
                                                class9.method1869(var59, var60, 64, 64);
                                            }
                                        }
                                        method30(true);
                                        int var62 = 0;
                                        while (true) {
                                            if (var62 >= var43) {
                                                break label3518;
                                            }
                                            byte[] var63 = Statics.field2480[var62];
                                            if (var63 != null) {
                                                int var64 = (Statics.field753[var62] >> 8) * 64 - Statics.field52;
                                                int var65 = (Statics.field753[var62] & 0xFF) * 64 - Statics.field332;
                                                method1870();
                                                class96 var66 = Statics.field192;
                                                class131[] var67 = field540;
                                                class128 var68 = new class128(var63);
                                                int var69 = -1;
                                                while (true) {
                                                    int var70 = var68.method2476();
                                                    if (var70 == 0) {
                                                        break;
                                                    }
                                                    var69 += var70;
                                                    int var71 = 0;
                                                    while (true) {
                                                        int var72 = var68.method2476();
                                                        if (var72 == 0) {
                                                            break;
                                                        }
                                                        var71 += var72 - 1;
                                                        int var73 = var71 & 0x3F;
                                                        int var74 = var71 >> 6 & 0x3F;
                                                        int var75 = var71 >> 12;
                                                        int var76 = var68.method2531();
                                                        int var77 = var76 >> 2;
                                                        int var78 = var76 & 0x3;
                                                        int var79 = var64 + var74;
                                                        int var80 = var65 + var73;
                                                        if (var79 > 0 && var80 > 0 && var79 < 103 && var80 < 103) {
                                                            int var81 = var75;
                                                            if ((class9.field127[1][var79][var80] & 0x2) == 2) {
                                                                var81 = var75 - 1;
                                                            }
                                                            class131 var82 = null;
                                                            if (var81 >= 0) {
                                                                var82 = var67[var81];
                                                            }
                                                            class9.method1367(var75, var79, var80, var69, var78, var77, var66, var82);
                                                        }
                                                    }
                                                }
                                            }
                                            var62++;
                                        }
                                    }
                                    int var45 = (Statics.field753[var44] >> 8) * 64 - Statics.field52;
                                    int var46 = (Statics.field753[var44] & 0xFF) * 64 - Statics.field332;
                                    byte[] var47 = Statics.field818[var44];
                                    if (var47 != null) {
                                        method1870();
                                        int var48 = Statics.field265 * 8 - 48;
                                        int var49 = Statics.field2597 * 8 - 48;
                                        class131[] var50 = field540;
                                        int var51 = 0;
                                        label3515: while (true) {
                                            if (var51 >= 4) {
                                                class128 var54 = new class128(var47);
                                                int var55 = 0;
                                                while (true) {
                                                    if (var55 >= 4) {
                                                        break label3515;
                                                    }
                                                    for (int var56 = 0; var56 < 64; var56++) {
                                                        for (int var57 = 0; var57 < 64; var57++) {
                                                            class9.method1597(var54, var55, var45 + var56, var46 + var57, var48, var49, 0);
                                                        }
                                                    }
                                                    var55++;
                                                }
                                            }
                                            for (int var52 = 0; var52 < 64; var52++) {
                                                for (int var53 = 0; var53 < 64; var53++) {
                                                    if (var45 + var52 > 0 && var45 + var52 < 103 && var46 + var53 > 0 && var46 + var53 < 103) {
                                                        var50[var51].field2065[var45 + var52][var46 + var53] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var51++;
                                        }
                                    }
                                    var44++;
                                }
                            }
                            if (field541) {
                                int var83 = 0;
                                label3451: while (true) {
                                    if (var83 >= 4) {
                                        for (int var106 = 0; var106 < 13; var106++) {
                                            for (int var107 = 0; var107 < 13; var107++) {
                                                int var108 = field542[0][var106][var107];
                                                if (var108 == -1) {
                                                    class9.method1869(var106 * 8, var107 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method30(true);
                                        int var109 = 0;
                                        while (true) {
                                            if (var109 >= 4) {
                                                break label3451;
                                            }
                                            method1870();
                                            for (int var110 = 0; var110 < 13; var110++) {
                                                for (int var111 = 0; var111 < 13; var111++) {
                                                    int var112 = field542[var109][var110][var111];
                                                    if (var112 != -1) {
                                                        int var113 = var112 >> 24 & 0x3;
                                                        int var114 = var112 >> 1 & 0x3;
                                                        int var115 = var112 >> 14 & 0x3FF;
                                                        int var116 = var112 >> 3 & 0x7FF;
                                                        int var117 = (var115 / 8 << 8) + var116 / 8;
                                                        for (int var118 = 0; var118 < Statics.field753.length; var118++) {
                                                            if (Statics.field753[var118] == var117 && Statics.field2480[var118] != null) {
                                                                class9.method2209(Statics.field2480[var118], var109, var110 * 8, var111 * 8, var113, (var115 & 0x7) * 8, (var116 & 0x7) * 8, var114, Statics.field192, field540);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var109++;
                                        }
                                    }
                                    method1870();
                                    for (int var84 = 0; var84 < 13; var84++) {
                                        for (int var85 = 0; var85 < 13; var85++) {
                                            boolean var86 = false;
                                            int var87 = field542[var83][var84][var85];
                                            if (var87 != -1) {
                                                int var88 = var87 >> 24 & 0x3;
                                                int var89 = var87 >> 1 & 0x3;
                                                int var90 = var87 >> 14 & 0x3FF;
                                                int var91 = var87 >> 3 & 0x7FF;
                                                int var92 = (var90 / 8 << 8) + var91 / 8;
                                                for (int var93 = 0; var93 < Statics.field753.length; var93++) {
                                                    if (Statics.field753[var93] == var92 && Statics.field818[var93] != null) {
                                                        byte[] var94 = Statics.field818[var93];
                                                        int var95 = var84 * 8;
                                                        int var96 = var85 * 8;
                                                        int var97 = (var90 & 0x7) * 8;
                                                        int var98 = (var91 & 0x7) * 8;
                                                        class131[] var99 = field540;
                                                        for (int var100 = 0; var100 < 8; var100++) {
                                                            for (int var101 = 0; var101 < 8; var101++) {
                                                                if (var95 + var100 > 0 && var95 + var100 < 103 && var96 + var101 > 0 && var96 + var101 < 103) {
                                                                    var99[var83].field2065[var95 + var100][var96 + var101] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class128 var102 = new class128(var94);
                                                        for (int var103 = 0; var103 < 4; var103++) {
                                                            for (int var104 = 0; var104 < 64; var104++) {
                                                                for (int var105 = 0; var105 < 64; var105++) {
                                                                    if (var88 == var103 && var104 >= var97 && var104 < var97 + 8 && var105 >= var98 && var105 < var98 + 8) {
                                                                        class9.method1597(var102, var83, var95 + class163.method650(var104 & 0x7, var105 & 0x7, var89), var96 + class163.method1867(var104 & 0x7, var105 & 0x7, var89), 0, 0, var89);
                                                                    } else {
                                                                        class9.method1597(var102, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var86 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var86) {
                                                class9.method52(var83, var84 * 8, var85 * 8);
                                            }
                                        }
                                    }
                                    var83++;
                                }
                            }
                            method30(true);
                            method173();
                            method1870();
                            class9.method2775(Statics.field192, field540);
                            method30(true);
                            int var119 = class9.field121;
                            if (var119 > Statics.field259) {
                                var119 = Statics.field259;
                            }
                            if (var119 < Statics.field259 - 1) {
                                int var120 = Statics.field259 - 1;
                            }
                            if (field485) {
                                Statics.field192.method1906(class9.field121);
                            } else {
                                Statics.field192.method1906(0);
                            }
                            for (int var121 = 0; var121 < 104; var121++) {
                                for (int var122 = 0; var122 < 104; var122++) {
                                    method3259(var121, var122);
                                }
                            }
                            method1870();
                            Statics.method2238();
                            class33.field817.method3279();
                            if (Statics.field1295 != null) {
                                field689.method2335(201);
                                field689.method2452(1057001181);
                            }
                            if (!field541) {
                                int var123 = (Statics.field265 - 6) / 8;
                                int var124 = (Statics.field265 + 6) / 8;
                                int var125 = (Statics.field2597 - 6) / 8;
                                int var126 = (Statics.field2597 + 6) / 8;
                                for (int var127 = var123 - 1; var127 <= var124 + 1; var127++) {
                                    for (int var128 = var125 - 1; var128 <= var126 + 1; var128++) {
                                        if (var127 < var123 || var127 > var124 || var128 < var125 || var128 > var126) {
                                            Statics.field343.method3061("m" + var127 + "_" + var128);
                                            Statics.field343.method3061("l" + var127 + "_" + var128);
                                        }
                                    }
                                }
                            }
                            method882(30);
                            method1870();
                            Statics.field1830 = (byte[][][]) null;
                            Statics.field1539 = (byte[][][]) null;
                            Statics.field261 = (byte[][][]) null;
                            Statics.field124 = (byte[][][]) null;
                            Statics.field11 = (int[][][]) null;
                            Statics.field2093 = (byte[][][]) null;
                            Statics.field2848 = (int[][]) null;
                            Statics.field133 = null;
                            Statics.field179 = null;
                            Statics.field2595 = null;
                            Statics.field2581 = null;
                            Statics.field2366 = null;
                            field689.method2335(110);
                            Statics.field399.method1336();
                            for (int var129 = 0; var129 < 32; var129++) {
                                field1329[var129] = 0L;
                            }
                            for (int var130 = 0; var130 < 32; var130++) {
                                field1338[var130] = 0L;
                            }
                            Statics.field907 = 0;
                        } else {
                            field612 = 2;
                        }
                    } else {
                        field612 = 1;
                    }
                }
                if (field487 == 30) {
                    if (field496 > 1) {
                        field496--;
                    }
                    if (field528 > 0) {
                        field528--;
                    }
                    if (field532) {
                        field532 = false;
                        method3270();
                    } else {
                        if (!field622) {
                            field677[0] = class137.field2279;
                            field652[0] = "";
                            field626[0] = 1006;
                            field685 = 1;
                        }
                        for (int var131 = 0; var131 < 100; var131++) {
                            boolean var132;
                            if (Statics.field275 == null) {
                                var132 = false;
                            } else {
                                label3851: {
                                    try {
                                        int var133 = Statics.field275.method1373();
                                        if (var133 == 0) {
                                            var132 = false;
                                            break label3851;
                                        }
                                        if (field525 == -1) {
                                            Statics.field275.method1374(field523.field2050, 0, 1);
                                            field523.field2048 = 0;
                                            field525 = field523.method2336();
                                            field684 = class167.field2783[field525];
                                            var133--;
                                        }
                                        if (field684 == -1) {
                                            if (var133 <= 0) {
                                                var132 = false;
                                                break label3851;
                                            }
                                            Statics.field275.method1374(field523.field2050, 0, 1);
                                            field684 = field523.field2050[0] & 0xFF;
                                            var133--;
                                        }
                                        if (field684 == -2) {
                                            if (var133 <= 1) {
                                                var132 = false;
                                                break label3851;
                                            }
                                            Statics.field275.method1374(field523.field2050, 0, 2);
                                            field523.field2048 = 0;
                                            field684 = field523.method2473();
                                            var133 -= 2;
                                        }
                                        if (var133 < field684) {
                                            var132 = false;
                                            break label3851;
                                        }
                                        field523.field2048 = 0;
                                        Statics.field275.method1374(field523.field2050, 0, field684);
                                        field653 = 0;
                                        field509 = field530;
                                        field530 = field529;
                                        field529 = field525;
                                        if (field525 == 34) {
                                            for (int var134 = 0; var134 < field600.length; var134++) {
                                                if (field600[var134] != null) {
                                                    field600[var134].field459 = -1;
                                                }
                                            }
                                            for (int var135 = 0; var135 < field518.length; var135++) {
                                                if (field518[var135] != null) {
                                                    field518[var135].field459 = -1;
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 15) {
                                            for (int var136 = 0; var136 < class162.field2740.length; var136++) {
                                                if (class162.field2741[var136] != class162.field2740[var136]) {
                                                    class162.field2740[var136] = class162.field2741[var136];
                                                    method821(var136);
                                                    field664[++field665 - 1 & 0x1F] = var136;
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 46) {
                                            Statics.field1274 = field523.method2539();
                                            Statics.field1232 = field523.method2531();
                                            while (field523.field2048 < field684) {
                                                field525 = field523.method2531();
                                                method3004();
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 216) {
                                            int var137 = field523.method2508();
                                            class161 var138 = class161.method3039(var137);
                                            for (int var139 = 0; var139 < var138.field2721.length; var139++) {
                                                var138.field2721[var139] = -1;
                                                var138.field2721[var139] = 0;
                                            }
                                            method610(var138);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 95) {
                                            if (field640 != -1) {
                                                int var140 = field640;
                                                if (class161.method199(var140)) {
                                                    method2225(Statics.field2626[var140], 0);
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 5) {
                                            int var141 = field523.method2519();
                                            int var142 = field523.method2508();
                                            class161 var143 = class161.method3039(var142);
                                            if (var143.field2651 != 2 || var143.field2652 != var141) {
                                                var143.field2651 = 2;
                                                var143.field2652 = var141;
                                                method610(var143);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 249) {
                                            byte var144 = field523.method2635();
                                            int var145 = field523.method2496();
                                            class162.field2741[var145] = var144;
                                            if (class162.field2740[var145] != var144) {
                                                class162.field2740[var145] = var144;
                                                method821(var145);
                                            }
                                            field664[++field665 - 1 & 0x1F] = var145;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 32) {
                                            int var146 = field523.method2473();
                                            if (var146 == 65535) {
                                                var146 = -1;
                                            }
                                            method198(var146);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 219) {
                                            int var147 = field523.method2496();
                                            if (var147 == 65535) {
                                                var147 = -1;
                                            }
                                            int var148 = field523.method2507();
                                            if (field715 != 0 && var147 != -1) {
                                                class141.method761(Statics.field310, var147, 0, field715, false);
                                                field543 = true;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 198) {
                                            int var149 = field523.method2508();
                                            class161 var150 = class161.method3039(var149);
                                            var150.field2651 = 3;
                                            var150.field2652 = Statics.field1683.field38.method3260();
                                            method610(var150);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 195) {
                                            int var151 = field523.method2531();
                                            int var152 = field523.method2633();
                                            int var153 = field523.method2531();
                                            Statics.field259 = var153 >> 1;
                                            Statics.field1683.method266(var151, var152, (var153 & 0x1) == 1);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 3) {
                                            field561 = 1;
                                            field671 = field545;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 179) {
                                            field663 = field545;
                                            if (field684 == 0) {
                                                field705 = null;
                                                field706 = null;
                                                Statics.field365 = 0;
                                                Statics.field24 = null;
                                                field525 = -1;
                                                var132 = true;
                                                break label3851;
                                            }
                                            field706 = field523.method2618();
                                            long var154 = field523.method2569();
                                            long var156 = var154;
                                            String var158;
                                            if (var154 <= 0L || var154 >= 6582952005840035281L) {
                                                var158 = null;
                                            } else if (var154 % 37L == 0L) {
                                                var158 = null;
                                            } else {
                                                int var159 = 0;
                                                for (long var160 = var154; var160 != 0L; var160 /= 37L) {
                                                    var159++;
                                                }
                                                StringBuilder var162 = new StringBuilder(var159);
                                                while (var156 != 0L) {
                                                    long var163 = var156;
                                                    var156 /= 37L;
                                                    var162.append(class149.field2479[(int) (var163 - var156 * 37L)]);
                                                }
                                                var158 = var162.reverse().toString();
                                            }
                                            field705 = var158;
                                            Statics.field56 = field523.method2464();
                                            int var165 = field523.method2531();
                                            if (var165 == 255) {
                                                field525 = -1;
                                                var132 = true;
                                                break label3851;
                                            }
                                            Statics.field365 = var165;
                                            class8[] var166 = new class8[100];
                                            for (int var167 = 0; var167 < Statics.field365; var167++) {
                                                var166[var167] = new class8();
                                                var166[var167].field108 = field523.method2618();
                                                var166[var167].field109 = class151.method276(var166[var167].field108, Statics.field483);
                                                var166[var167].field110 = field523.method2473();
                                                var166[var167].field111 = field523.method2464();
                                                field523.method2618();
                                                if (var166[var167].field108.equals(Statics.field1683.field47)) {
                                                    Statics.field1050 = var166[var167].field111;
                                                }
                                            }
                                            boolean var168 = false;
                                            int var169 = Statics.field365;
                                            while (var169 > 0) {
                                                boolean var170 = true;
                                                var169--;
                                                for (int var171 = 0; var171 < var169; var171++) {
                                                    if (var166[var171].field109.compareTo(var166[var171 + 1].field109) > 0) {
                                                        class8 var172 = var166[var171];
                                                        var166[var171] = var166[var171 + 1];
                                                        var166[var171 + 1] = var172;
                                                        var170 = false;
                                                    }
                                                }
                                                if (var170) {
                                                    break;
                                                }
                                            }
                                            Statics.field24 = var166;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 79) {
                                            int var173 = field523.method2531();
                                            class140[] var174 = new class140[] { class140.field2372, class140.field2371, class140.field2373 };
                                            class140[] var175 = var174;
                                            int var176 = 0;
                                            class140 var178;
                                            while (true) {
                                                if (var176 >= var175.length) {
                                                    var178 = null;
                                                    break;
                                                }
                                                class140 var177 = var175[var176];
                                                if (var177.field2370 == var173) {
                                                    var178 = var177;
                                                    break;
                                                }
                                                var176++;
                                            }
                                            Statics.field806 = var178;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 125) {
                                            Statics.field1232 = field523.method2633();
                                            Statics.field1274 = field523.method2484();
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 91) {
                                            for (int var179 = 0; var179 < Statics.field1045; var179++) {
                                                class43 var180 = class43.method562(var179);
                                                if (var180 != null && var180.field1047 == 0) {
                                                    class162.field2741[var179] = 0;
                                                    class162.field2740[var179] = 0;
                                                }
                                            }
                                            method3017();
                                            field665 += 32;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 241) {
                                            field726 = false;
                                            for (int var181 = 0; var181 < 5; var181++) {
                                                field727[var181] = false;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 134) {
                                            field570 = field523.method2531();
                                            if (field570 == 255) {
                                                field570 = 0;
                                            }
                                            field531 = field523.method2531();
                                            if (field531 == 255) {
                                                field531 = 0;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 170) {
                                            while (field523.field2048 < field684) {
                                                boolean var182 = field523.method2531() == 1;
                                                String var183 = field523.method2618();
                                                String var184 = field523.method2618();
                                                int var185 = field523.method2473();
                                                int var186 = field523.method2531();
                                                int var187 = field523.method2531();
                                                boolean var188 = (var187 & 0x2) != 0;
                                                boolean var189 = (var187 & 0x1) != 0;
                                                if (var185 > 0) {
                                                    field523.method2618();
                                                    field523.method2531();
                                                    field523.method2468();
                                                }
                                                field523.method2618();
                                                for (int var190 = 0; var190 < field732; var190++) {
                                                    class24 var191 = field734[var190];
                                                    if (var182) {
                                                        if (var184.equals(var191.field372)) {
                                                            var191.field372 = var183;
                                                            var191.field369 = var184;
                                                            var183 = null;
                                                            break;
                                                        }
                                                    } else if (var183.equals(var191.field372)) {
                                                        if (var191.field375 != var185) {
                                                            boolean var192 = true;
                                                            for (class29 var193 = (class29) field493.method3307(); var193 != null; var193 = (class29) field493.method3308()) {
                                                                if (var193.field742.equals(var183)) {
                                                                    if (var185 != 0 && var193.field748 == 0) {
                                                                        var193.method3360();
                                                                        var192 = false;
                                                                    } else if (var185 == 0 && var193.field748 != 0) {
                                                                        var193.method3360();
                                                                        var192 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var192) {
                                                                field493.method3306(new class29(var183, var185));
                                                            }
                                                            var191.field375 = var185;
                                                        }
                                                        var191.field369 = var184;
                                                        var191.field371 = var186;
                                                        var191.field370 = var188;
                                                        var191.field373 = var189;
                                                        var183 = null;
                                                        break;
                                                    }
                                                }
                                                if (var183 != null && field732 < 400) {
                                                    class24 var194 = new class24();
                                                    field734[field732] = var194;
                                                    var194.field372 = var183;
                                                    var194.field369 = var184;
                                                    var194.field375 = var185;
                                                    var194.field371 = var186;
                                                    var194.field370 = var188;
                                                    var194.field373 = var189;
                                                    field732++;
                                                }
                                            }
                                            field561 = 2;
                                            field671 = field545;
                                            boolean var195 = false;
                                            int var196 = field732;
                                            while (var196 > 0) {
                                                boolean var197 = true;
                                                var196--;
                                                for (int var198 = 0; var198 < var196; var198++) {
                                                    boolean var199 = false;
                                                    class24 var200 = field734[var198];
                                                    class24 var201 = field734[var198 + 1];
                                                    if (field552 != var200.field375 && field552 == var201.field375) {
                                                        var199 = true;
                                                    }
                                                    if (!var199 && var200.field375 == 0 && var201.field375 != 0) {
                                                        var199 = true;
                                                    }
                                                    if (!var199 && !var200.field370 && var201.field370) {
                                                        var199 = true;
                                                    }
                                                    if (!var199 && !var200.field373 && var201.field373) {
                                                        var199 = true;
                                                    }
                                                    if (var199) {
                                                        class24 var202 = field734[var198];
                                                        field734[var198] = field734[var198 + 1];
                                                        field734[var198 + 1] = var202;
                                                        var197 = false;
                                                    }
                                                }
                                                if (var197) {
                                                    break;
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 128) {
                                            method2442(false);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 254) {
                                            while (field523.field2048 < field684) {
                                                int var203 = field523.method2531();
                                                boolean var204 = (var203 & 0x1) == 1;
                                                String var205 = field523.method2618();
                                                String var206 = field523.method2618();
                                                field523.method2618();
                                                for (int var207 = 0; var207 < field736; var207++) {
                                                    class11 var208 = field737[var207];
                                                    if (var204) {
                                                        if (var206.equals(var208.field177)) {
                                                            var208.field177 = var205;
                                                            var208.field176 = var206;
                                                            var205 = null;
                                                            break;
                                                        }
                                                    } else if (var205.equals(var208.field177)) {
                                                        var208.field177 = var205;
                                                        var208.field176 = var206;
                                                        var205 = null;
                                                        break;
                                                    }
                                                }
                                                if (var205 != null && field736 < 400) {
                                                    class11 var209 = new class11();
                                                    field737[field736] = var209;
                                                    var209.field177 = var205;
                                                    var209.field176 = var206;
                                                    field736++;
                                                }
                                            }
                                            field671 = field545;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 74 || field525 == 99 || field525 == 57 || field525 == 81 || field525 == 69 || field525 == 222 || field525 == 247 || field525 == 25 || field525 == 22 || field525 == 31 || field525 == 205) {
                                            method3004();
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 122) {
                                            int var210 = field523.method2468();
                                            int var211 = field523.method2473();
                                            if (var210 < -70000) {
                                                var211 += 32768;
                                            }
                                            class161 var212;
                                            if (var210 >= 0) {
                                                var212 = class161.method3039(var210);
                                            } else {
                                                var212 = null;
                                            }
                                            if (var212 != null) {
                                                for (int var213 = 0; var213 < var212.field2721.length; var213++) {
                                                    var212.field2721[var213] = 0;
                                                    var212.field2663[var213] = 0;
                                                }
                                            }
                                            class19 var214 = (class19) class19.field273.method3315((long) var211);
                                            if (var214 != null) {
                                                for (int var215 = 0; var215 < var214.field271.length; var215++) {
                                                    var214.field271[var215] = -1;
                                                    var214.field272[var215] = 0;
                                                }
                                            }
                                            int var216 = field523.method2473();
                                            for (int var217 = 0; var217 < var216; var217++) {
                                                int var218 = field523.method2519();
                                                int var219 = field523.method2633();
                                                if (var219 == 255) {
                                                    var219 = field523.method2508();
                                                }
                                                if (var212 != null && var217 < var212.field2721.length) {
                                                    var212.field2721[var217] = var218;
                                                    var212.field2663[var217] = var219;
                                                }
                                                class19.method242(var211, var217, var218 - 1, var219);
                                            }
                                            if (var212 != null) {
                                                method610(var212);
                                            }
                                            method3017();
                                            field666[++field512 - 1 & 0x1F] = var211 & 0x7FFF;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 111) {
                                            int var220 = field523.method2519();
                                            class19.method264(var220);
                                            field666[++field512 - 1 & 0x1F] = var220 & 0x7FFF;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 82) {
                                            String var221 = field523.method2618();
                                            Object[] var222 = new Object[var221.length() + 1];
                                            for (int var223 = var221.length() - 1; var223 >= 0; var223--) {
                                                if (var221.charAt(var223) == 's') {
                                                    var222[var223 + 1] = field523.method2618();
                                                } else {
                                                    var222[var223 + 1] = Integer.valueOf(field523.method2468());
                                                }
                                            }
                                            var222[0] = Integer.valueOf(field523.method2468());
                                            class1 var224 = new class1();
                                            var224.field6 = var222;
                                            class27.method1310(var224);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 238) {
                                            int var225 = field523.method2506();
                                            int var226 = field523.method2457();
                                            class162.field2741[var226] = var225;
                                            if (class162.field2740[var226] != var225) {
                                                class162.field2740[var226] = var225;
                                                method821(var226);
                                            }
                                            field664[++field665 - 1 & 0x1F] = var226;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 236) {
                                            int var227 = field523.method2487();
                                            int var228 = field523.method2508();
                                            class161 var229 = class161.method3039(var228);
                                            if (var229.field2700 != var227 || var227 == -1) {
                                                var229.field2700 = var227;
                                                var229.field2725 = 0;
                                                var229.field2726 = 0;
                                                method610(var229);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 184) {
                                            class117 var230 = field523;
                                            int var231 = field684;
                                            class183 var232 = new class183();
                                            var232.field2844 = var230.method2531();
                                            var232.field2846 = var230.method2468();
                                            var232.field2845 = new int[var232.field2844];
                                            var232.field2852 = new int[var232.field2844];
                                            var232.field2847 = new Field[var232.field2844];
                                            var232.field2850 = new int[var232.field2844];
                                            var232.field2849 = new Method[var232.field2844];
                                            var232.field2843 = new byte[var232.field2844][][];
                                            for (int var233 = 0; var233 < var232.field2844; var233++) {
                                                try {
                                                    int var234 = var230.method2531();
                                                    if (var234 == 0 || var234 == 1 || var234 == 2) {
                                                        String var235 = new String(var230.method2618());
                                                        String var236 = new String(var230.method2618());
                                                        int var237 = 0;
                                                        if (var234 == 1) {
                                                            var237 = var230.method2468();
                                                        }
                                                        var232.field2845[var233] = var234;
                                                        var232.field2850[var233] = var237;
                                                        var232.field2847[var233] = class184.method684(var235).getDeclaredField(var236);
                                                    } else if (var234 == 3 || var234 == 4) {
                                                        String var238 = new String(var230.method2618());
                                                        String var239 = new String(var230.method2618());
                                                        int var240 = var230.method2531();
                                                        String[] var241 = new String[var240];
                                                        for (int var242 = 0; var242 < var240; var242++) {
                                                            var241[var242] = new String(var230.method2618());
                                                        }
                                                        byte[][] var243 = new byte[var240][];
                                                        if (var234 == 3) {
                                                            for (int var244 = 0; var244 < var240; var244++) {
                                                                int var245 = var230.method2468();
                                                                var243[var244] = new byte[var245];
                                                                var230.method2474(var243[var244], 0, var245);
                                                            }
                                                        }
                                                        var232.field2845[var233] = var234;
                                                        Class[] var246 = new Class[var240];
                                                        for (int var247 = 0; var247 < var240; var247++) {
                                                            var246[var247] = class184.method684(var241[var247]);
                                                        }
                                                        var232.field2849[var233] = class184.method684(var238).getDeclaredMethod(var239, var246);
                                                        var232.field2843[var233] = var243;
                                                    }
                                                } catch (ClassNotFoundException var592) {
                                                    var232.field2852[var233] = -1;
                                                } catch (SecurityException var593) {
                                                    var232.field2852[var233] = -2;
                                                } catch (NullPointerException var594) {
                                                    var232.field2852[var233] = -3;
                                                } catch (Exception var595) {
                                                    var232.field2852[var233] = -4;
                                                } catch (Throwable var596) {
                                                    var232.field2852[var233] = -5;
                                                }
                                            }
                                            class184.field2853.method3334(var232);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 246) {
                                            int var253 = field523.method2531();
                                            int var254 = field523.method2531();
                                            int var255 = field523.method2531();
                                            int var256 = field523.method2531();
                                            field727[var253] = true;
                                            field728[var253] = var254;
                                            field693[var253] = var255;
                                            field539[var253] = var256;
                                            field731[var253] = 0;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 29) {
                                            int var257 = field523.method2499();
                                            int var258 = field523.method2506();
                                            int var259 = field523.method2500();
                                            class161 var260 = class161.method3039(var258);
                                            int var261 = var260.field2639 + var257;
                                            int var262 = var260.field2647 + var259;
                                            if (var260.field2624 != var261 || var260.field2674 != var262) {
                                                var260.field2624 = var261;
                                                var260.field2674 = var262;
                                                method610(var260);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 162) {
                                            String var263 = field523.method2618();
                                            int var264 = field523.method2473();
                                            byte var265 = field523.method2464();
                                            boolean var266 = false;
                                            if (var265 == -128) {
                                                var266 = true;
                                            }
                                            if (var266) {
                                                if (Statics.field365 == 0) {
                                                    field525 = -1;
                                                    var132 = true;
                                                    break label3851;
                                                }
                                                boolean var267 = false;
                                                int var268;
                                                for (var268 = 0; var268 < Statics.field365 && (!Statics.field24[var268].field108.equals(var263) || Statics.field24[var268].field110 != var264); var268++) {
                                                }
                                                if (var268 < Statics.field365) {
                                                    while (var268 < Statics.field365 - 1) {
                                                        Statics.field24[var268] = Statics.field24[var268 + 1];
                                                        var268++;
                                                    }
                                                    Statics.field365--;
                                                    Statics.field24[Statics.field365] = null;
                                                }
                                            } else {
                                                field523.method2618();
                                                class8 var269 = new class8();
                                                var269.field108 = var263;
                                                var269.field109 = class151.method276(var269.field108, Statics.field483);
                                                var269.field110 = var264;
                                                var269.field111 = var265;
                                                int var270;
                                                for (var270 = Statics.field365 - 1; var270 >= 0; var270--) {
                                                    int var271 = Statics.field24[var270].field109.compareTo(var269.field108);
                                                    if (var271 == 0) {
                                                        Statics.field24[var270].field110 = var264;
                                                        Statics.field24[var270].field111 = var265;
                                                        if (var263.equals(Statics.field1683.field47)) {
                                                            Statics.field1050 = var265;
                                                        }
                                                        field663 = field545;
                                                        field525 = -1;
                                                        var132 = true;
                                                        break label3851;
                                                    }
                                                    if (var271 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field365 >= Statics.field24.length) {
                                                    field525 = -1;
                                                    var132 = true;
                                                    break label3851;
                                                }
                                                for (int var272 = Statics.field365 - 1; var272 > var270; var272--) {
                                                    Statics.field24[var272 + 1] = Statics.field24[var272];
                                                }
                                                if (Statics.field365 == 0) {
                                                    Statics.field24 = new class8[100];
                                                }
                                                Statics.field24[var270 + 1] = var269;
                                                Statics.field365++;
                                                if (var263.equals(Statics.field1683.field47)) {
                                                    Statics.field1050 = var265;
                                                }
                                            }
                                            field663 = field545;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 10) {
                                            field697 = field523.method2531();
                                            field607 = field523.method2531();
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 88) {
                                            String var273 = field523.method2618();
                                            class117 var274 = field523;
                                            String var278;
                                            try {
                                                int var275 = var274.method2476();
                                                if (var275 > 32767) {
                                                    var275 = 32767;
                                                }
                                                byte[] var276 = new byte[var275];
                                                var274.field2048 += Statics.field2859.method2389(var274.field2050, var274.field2048, var276, 0, var275);
                                                String var277 = class152.method37(var276, 0, var275);
                                                var278 = var277;
                                            } catch (Exception var589) {
                                                var278 = "Cabbage";
                                            }
                                            String var281 = class187.method3460(class150.method1277(var278));
                                            method197(6, var273, var281);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 159) {
                                            int var282 = field523.method2457();
                                            if (var282 == 65535) {
                                                var282 = -1;
                                            }
                                            int var283 = field523.method2506();
                                            int var284 = field523.method2508();
                                            class161 var285 = class161.method3039(var284);
                                            if (var285.field2618) {
                                                var285.field2723 = var282;
                                                var285.field2627 = var283;
                                                class41 var287 = class41.method1342(var282);
                                                var285.field2659 = var287.field1001;
                                                var285.field2660 = var287.field1002;
                                                var285.field2661 = var287.field995;
                                                var285.field2657 = var287.field1004;
                                                var285.field2658 = var287.field1005;
                                                var285.field2662 = var287.field1000;
                                                if (var285.field2734 > 0) {
                                                    var285.field2662 = var285.field2662 * 32 / var285.field2734;
                                                }
                                                method610(var285);
                                            } else {
                                                if (var282 == -1) {
                                                    var285.field2651 = 0;
                                                    field525 = -1;
                                                    var132 = true;
                                                    break label3851;
                                                }
                                                class41 var286 = class41.method1342(var282);
                                                var285.field2651 = 4;
                                                var285.field2652 = var282;
                                                var285.field2659 = var286.field1001;
                                                var285.field2660 = var286.field1002;
                                                var285.field2662 = var286.field1000 * 100 / var283;
                                                method610(var285);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 108) {
                                            int var288 = field523.method2473();
                                            int var289 = field523.method2496();
                                            int var290 = field523.method2457();
                                            int var291 = field523.method2506();
                                            class161 var292 = class161.method3039(var291);
                                            if (var292.field2659 != var290 || var292.field2660 != var289 || var292.field2662 != var288) {
                                                var292.field2659 = var290;
                                                var292.field2660 = var289;
                                                var292.field2662 = var288;
                                                method610(var292);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 62) {
                                            method3017();
                                            field645 = field523.method2531();
                                            field673 = field545;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 17) {
                                            int var293 = field523.method2506();
                                            int var294 = field523.method2496();
                                            class161 var295 = class161.method3039(var293);
                                            if (var295 != null && var295.field2621 == 0) {
                                                if (var294 > var295.field2635 - var295.field2629) {
                                                    var294 = var295.field2635 - var295.field2629;
                                                }
                                                if (var294 < 0) {
                                                    var294 = 0;
                                                }
                                                if (var295.field2655 != var294) {
                                                    var295.field2655 = var294;
                                                    method610(var295);
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 18) {
                                            int var296 = field523.method2457();
                                            int var297 = field523.method2485();
                                            int var298 = var296 >> 10 & 0x1F;
                                            int var299 = var296 >> 5 & 0x1F;
                                            int var300 = var296 & 0x1F;
                                            int var301 = (var300 << 3) + (var298 << 19) + (var299 << 11);
                                            class161 var302 = class161.method3039(var297);
                                            if (var302.field2636 != var301) {
                                                var302.field2636 = var301;
                                                method610(var302);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 147) {
                                            method2442(true);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 245) {
                                            field726 = true;
                                            Statics.field880 = field523.method2531();
                                            Statics.field398 = field523.method2531();
                                            Statics.field263 = field523.method2473();
                                            Statics.field1357 = field523.method2531();
                                            Statics.field15 = field523.method2531();
                                            if (Statics.field15 >= 100) {
                                                int var303 = Statics.field880 * 128 + 64;
                                                int var304 = Statics.field398 * 128 + 64;
                                                int var305 = method29(var303, var304, Statics.field259) - Statics.field263;
                                                int var306 = var303 - Statics.field903;
                                                int var307 = var305 - Statics.field50;
                                                int var308 = var304 - Statics.field1681;
                                                int var309 = (int) Math.sqrt((double) (var306 * var306 + var308 * var308));
                                                Statics.field105 = (int) (Math.atan2((double) var307, (double) var309) * 325.949D) & 0x7FF;
                                                Statics.field1474 = (int) (Math.atan2((double) var306, (double) var308) * -325.949D) & 0x7FF;
                                                if (Statics.field105 < 128) {
                                                    Statics.field105 = 128;
                                                }
                                                if (Statics.field105 > 383) {
                                                    Statics.field105 = 383;
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 11) {
                                            field726 = true;
                                            Statics.field1305 = field523.method2531();
                                            Statics.field238 = field523.method2531();
                                            Statics.field170 = field523.method2473();
                                            Statics.field384 = field523.method2531();
                                            Statics.field321 = field523.method2531();
                                            if (Statics.field321 >= 100) {
                                                Statics.field903 = Statics.field1305 * 128 + 64;
                                                Statics.field1681 = Statics.field238 * 128 + 64;
                                                Statics.field50 = method29(Statics.field903, Statics.field1681, Statics.field259) - Statics.field170;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 40) {
                                            int var310 = field523.method2506();
                                            int var311 = field523.method2633();
                                            int var312 = field523.method2519();
                                            class4 var313 = (class4) field641.method3315((long) var310);
                                            if (var313 != null) {
                                                method1487(var313, var313.field57 != var312);
                                            }
                                            class4 var314 = new class4();
                                            var314.field57 = var312;
                                            var314.field69 = var311;
                                            field641.method3329(var314, (long) var310);
                                            method2661(var312);
                                            class27.method1230(var312);
                                            class161 var315 = class161.method3039(var310);
                                            if (var315 != null) {
                                                method610(var315);
                                            }
                                            if (field644 != null) {
                                                method610(field644);
                                                field644 = null;
                                            }
                                            for (int var316 = 0; var316 < field685; var316++) {
                                                int var317 = field626[var316];
                                                boolean var318 = var317 == 57 || var317 == 58 || var317 == 1007 || var317 == 25 || var317 == 30;
                                                if (var318) {
                                                    if (var316 < field685 - 1) {
                                                        for (int var319 = var316; var319 < field685 - 1; var319++) {
                                                            field677[var319] = field677[var319 + 1];
                                                            field652[var319] = field652[var319 + 1];
                                                            field626[var319] = field626[var319 + 1];
                                                            field627[var319] = field627[var319 + 1];
                                                            field667[var319] = field667[var319 + 1];
                                                            field625[var319] = field625[var319 + 1];
                                                        }
                                                    }
                                                    field685--;
                                                }
                                            }
                                            if (field640 != -1) {
                                                int var320 = field640;
                                                if (class161.method199(var320)) {
                                                    method2225(Statics.field2626[var320], 1);
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 169) {
                                            int var321 = field523.method2496();
                                            field640 = var321;
                                            method2661(var321);
                                            class27.method1230(field640);
                                            for (int var322 = 0; var322 < 100; var322++) {
                                                field683[var322] = true;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 155) {
                                            int var323 = field684 + field523.field2048;
                                            int var324 = field523.method2473();
                                            int var325 = field523.method2473();
                                            if (field640 != var324) {
                                                field640 = var324;
                                                method2661(field640);
                                                class27.method1230(field640);
                                                for (int var326 = 0; var326 < 100; var326++) {
                                                    field683[var326] = true;
                                                }
                                            }
                                            while (var325-- > 0) {
                                                int var327 = field523.method2468();
                                                int var328 = field523.method2473();
                                                int var329 = field523.method2531();
                                                class4 var330 = (class4) field641.method3315((long) var327);
                                                if (var330 != null && var330.field57 != var328) {
                                                    method1487(var330, true);
                                                    var330 = null;
                                                }
                                                if (var330 == null) {
                                                    class4 var331 = new class4();
                                                    var331.field57 = var328;
                                                    var331.field69 = var329;
                                                    field641.method3329(var331, (long) var327);
                                                    method2661(var328);
                                                    class27.method1230(var328);
                                                    class161 var332 = class161.method3039(var327);
                                                    if (var332 != null) {
                                                        method610(var332);
                                                    }
                                                    if (field644 != null) {
                                                        method610(field644);
                                                        field644 = null;
                                                    }
                                                    for (int var333 = 0; var333 < field685; var333++) {
                                                        int var334 = field626[var333];
                                                        boolean var335 = var334 == 57 || var334 == 58 || var334 == 1007 || var334 == 25 || var334 == 30;
                                                        if (var335) {
                                                            if (var333 < field685 - 1) {
                                                                for (int var336 = var333; var336 < field685 - 1; var336++) {
                                                                    field677[var336] = field677[var336 + 1];
                                                                    field652[var336] = field652[var336 + 1];
                                                                    field626[var336] = field626[var336 + 1];
                                                                    field627[var336] = field627[var336 + 1];
                                                                    field667[var336] = field667[var336 + 1];
                                                                    field625[var336] = field625[var336 + 1];
                                                                }
                                                            }
                                                            field685--;
                                                        }
                                                    }
                                                    if (field640 != -1) {
                                                        int var337 = field640;
                                                        if (class161.method199(var337)) {
                                                            method2225(Statics.field2626[var337], 1);
                                                        }
                                                    }
                                                    var330 = var331;
                                                }
                                                var330.field58 = true;
                                            }
                                            for (class4 var339 = (class4) field641.method3318(); var339 != null; var339 = (class4) field641.method3321()) {
                                                if (var339.field58) {
                                                    var339.field58 = false;
                                                } else {
                                                    method1487(var339, true);
                                                }
                                            }
                                            field533 = new class177(512);
                                            while (field523.field2048 < var323) {
                                                int var340 = field523.method2468();
                                                int var341 = field523.method2473();
                                                int var342 = field523.method2473();
                                                int var343 = field523.method2468();
                                                for (int var344 = var341; var344 <= var342; var344++) {
                                                    long var345 = ((long) var340 << 32) + (long) var344;
                                                    field533.method3329(new class173(var343), var345);
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 133) {
                                            field497 = field523.method2531();
                                            if (field497 == 1) {
                                                field498 = field523.method2473();
                                            }
                                            if (field497 >= 2 && field497 <= 6) {
                                                if (field497 == 2) {
                                                    field503 = 64;
                                                    field714 = 64;
                                                }
                                                if (field497 == 3) {
                                                    field503 = 0;
                                                    field714 = 64;
                                                }
                                                if (field497 == 4) {
                                                    field503 = 128;
                                                    field714 = 64;
                                                }
                                                if (field497 == 5) {
                                                    field503 = 64;
                                                    field714 = 0;
                                                }
                                                if (field497 == 6) {
                                                    field503 = 64;
                                                    field714 = 128;
                                                }
                                                field497 = 2;
                                                field500 = field523.method2473();
                                                field491 = field523.method2473();
                                                field502 = field523.method2531();
                                            }
                                            if (field497 == 10) {
                                                field499 = field523.method2473();
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 146) {
                                            method243();
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 86) {
                                            String var347 = field523.method2618();
                                            long var348 = field523.method2569();
                                            long var350 = (long) field523.method2473();
                                            long var352 = (long) field523.method2599();
                                            int var354 = field523.method2531();
                                            long var355 = (var350 << 32) + var352;
                                            boolean var357 = false;
                                            for (int var358 = 0; var358 < 100; var358++) {
                                                if (field624[var358] == var355) {
                                                    var357 = true;
                                                    break;
                                                }
                                            }
                                            if (var354 <= 1 && method664(var347)) {
                                                var357 = true;
                                            }
                                            if (!var357 && field547 == 0) {
                                                field624[field602] = var355;
                                                field602 = (field602 + 1) % 100;
                                                class117 var359 = field523;
                                                String var363;
                                                try {
                                                    int var360 = var359.method2476();
                                                    if (var360 > 32767) {
                                                        var360 = 32767;
                                                    }
                                                    byte[] var361 = new byte[var360];
                                                    var359.field2048 += Statics.field2859.method2389(var359.field2050, var359.field2048, var361, 0, var360);
                                                    String var362 = class152.method37(var361, 0, var360);
                                                    var363 = var362;
                                                } catch (Exception var588) {
                                                    var363 = "Cabbage";
                                                }
                                                String var366 = class187.method3460(class150.method1277(var363));
                                                if (var354 == 2 || var354 == 3) {
                                                    method236(9, class2.method155(1) + var347, var366, class149.method2328(var348));
                                                } else if (var354 == 1) {
                                                    method236(9, class2.method155(0) + var347, var366, class149.method2328(var348));
                                                } else {
                                                    method236(9, var347, var366, class149.method2328(var348));
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 1) {
                                            class13 var367 = new class13();
                                            var367.field195 = field523.method2618();
                                            var367.field202 = field523.method2473();
                                            int var368 = field523.method2468();
                                            var367.field199 = var368;
                                            method882(45);
                                            Statics.field275.method1371();
                                            Statics.field275 = null;
                                            class22.method2739(var367);
                                            field525 = -1;
                                            var132 = false;
                                            break label3851;
                                        }
                                        if (field525 == 7) {
                                            int var369 = field523.method2468();
                                            boolean var370 = field523.method2633() == 1;
                                            class161 var371 = class161.method3039(var369);
                                            if (var371.field2631 != var370) {
                                                var371.field2631 = var370;
                                                method610(var371);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 51) {
                                            field566 = field523.method2531();
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 227) {
                                            String var372 = field523.method2618();
                                            int var373 = field523.method2508();
                                            class161 var374 = class161.method3039(var373);
                                            if (!var372.equals(var374.field2666)) {
                                                var374.field2666 = var372;
                                                method610(var374);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 118) {
                                            method3017();
                                            int var375 = field523.method2539();
                                            int var376 = field523.method2508();
                                            int var377 = field523.method2633();
                                            field620[var375] = var376;
                                            field618[var375] = var377;
                                            field619[var375] = 1;
                                            for (int var378 = 0; var378 < 98; var378++) {
                                                if (var376 >= class132.field2075[var378]) {
                                                    field619[var375] = var378 + 2;
                                                }
                                            }
                                            field668[++field548 - 1 & 0x1F] = var375;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 244) {
                                            method3017();
                                            field574 = field523.method2487();
                                            field673 = field545;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 243) {
                                            int var379 = field523.method2485();
                                            int var380 = field523.method2485();
                                            int var381 = field523.method2496();
                                            if (var381 == 65535) {
                                                var381 = -1;
                                            }
                                            int var382 = field523.method2496();
                                            if (var382 == 65535) {
                                                var382 = -1;
                                            }
                                            for (int var383 = var382; var383 <= var381; var383++) {
                                                long var384 = ((long) var380 << 32) + (long) var383;
                                                class181 var386 = field533.method3315(var384);
                                                if (var386 != null) {
                                                    var386.method3363();
                                                }
                                                field533.method3329(new class173(var379), var384);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 239) {
                                            String var387 = field523.method2618();
                                            long var388 = (long) field523.method2473();
                                            long var390 = (long) field523.method2599();
                                            int var392 = field523.method2531();
                                            long var393 = (var388 << 32) + var390;
                                            boolean var395 = false;
                                            for (int var396 = 0; var396 < 100; var396++) {
                                                if (field624[var396] == var393) {
                                                    var395 = true;
                                                    break;
                                                }
                                            }
                                            if (method664(var387)) {
                                                var395 = true;
                                            }
                                            if (!var395 && field547 == 0) {
                                                field624[field602] = var393;
                                                field602 = (field602 + 1) % 100;
                                                class117 var397 = field523;
                                                String var401;
                                                try {
                                                    int var398 = var397.method2476();
                                                    if (var398 > 32767) {
                                                        var398 = 32767;
                                                    }
                                                    byte[] var399 = new byte[var398];
                                                    var397.field2048 += Statics.field2859.method2389(var397.field2050, var397.field2048, var399, 0, var398);
                                                    String var400 = class152.method37(var399, 0, var398);
                                                    var401 = var400;
                                                } catch (Exception var587) {
                                                    var401 = "Cabbage";
                                                }
                                                String var404 = class187.method3460(class150.method1277(var401));
                                                if (var392 == 2 || var392 == 3) {
                                                    method197(7, class2.method155(1) + var387, var404);
                                                } else if (var392 == 1) {
                                                    method197(7, class2.method155(0) + var387, var404);
                                                } else {
                                                    method197(3, var387, var404);
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 28) {
                                            int var405 = field523.method2468();
                                            int var406 = field523.method2457();
                                            int var407 = field523.method2496();
                                            class161 var408 = class161.method3039(var405);
                                            var408.field2613 = (var406 << 16) + var407;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 234) {
                                            int var409 = field523.method2473();
                                            int var410 = field523.method2531();
                                            int var411 = field523.method2473();
                                            if (field718 != 0 && var410 != 0 && field702 < 50) {
                                                field721[field702] = var409;
                                                field722[field702] = var410;
                                                field723[field702] = var411;
                                                field725[field702] = null;
                                                field724[field702] = 0;
                                                field702++;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 208) {
                                            Statics.field1274 = field523.method2539();
                                            Statics.field1232 = field523.method2484();
                                            for (int var415 = Statics.field1232; var415 < Statics.field1232 + 8; var415++) {
                                                for (int var416 = Statics.field1274; var416 < Statics.field1274 + 8; var416++) {
                                                    if (field614[Statics.field259][var415][var416] != null) {
                                                        field614[Statics.field259][var415][var416] = null;
                                                        method3259(var415, var416);
                                                    }
                                                }
                                            }
                                            for (class23 var417 = (class23) field615.method3339(); var417 != null; var417 = (class23) field615.method3353()) {
                                                if (var417.field352 >= Statics.field1232 && var417.field352 < Statics.field1232 + 8 && var417.field353 >= Statics.field1274 && var417.field353 < Statics.field1274 + 8 && Statics.field259 == var417.field350) {
                                                    var417.field364 = 0;
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 148) {
                                            int var418 = field523.method2496();
                                            int var419 = field523.method2485();
                                            class161 var420 = class161.method3039(var419);
                                            if (var420.field2651 != 1 || var420.field2652 != var418) {
                                                var420.field2651 = 1;
                                                var420.field2652 = var418;
                                                method610(var420);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 213) {
                                            int var421 = field523.method2476();
                                            boolean var422 = field523.method2531() == 1;
                                            String var423 = "";
                                            boolean var424 = false;
                                            if (var422) {
                                                var423 = field523.method2618();
                                                if (method664(var423)) {
                                                    var424 = true;
                                                }
                                            }
                                            String var425 = field523.method2618();
                                            if (!var424) {
                                                method197(var421, var423, var425);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 137) {
                                            int var426 = field523.method2468();
                                            Statics.field2475 = Statics.field1483.method1496(var426);
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 192) {
                                            int var427 = field523.method2468();
                                            int var428 = field523.method2473();
                                            if (var427 < -70000) {
                                                var428 += 32768;
                                            }
                                            class161 var429;
                                            if (var427 >= 0) {
                                                var429 = class161.method3039(var427);
                                            } else {
                                                var429 = null;
                                            }
                                            while (field523.field2048 < field684) {
                                                int var430 = field523.method2476();
                                                int var431 = field523.method2473();
                                                int var432 = 0;
                                                if (var431 != 0) {
                                                    var432 = field523.method2531();
                                                    if (var432 == 255) {
                                                        var432 = field523.method2468();
                                                    }
                                                }
                                                if (var429 != null && var430 >= 0 && var430 < var429.field2721.length) {
                                                    var429.field2721[var430] = var431;
                                                    var429.field2663[var430] = var432;
                                                }
                                                class19.method242(var428, var430, var431 - 1, var432);
                                            }
                                            if (var429 != null) {
                                                method610(var429);
                                            }
                                            method3017();
                                            field666[++field512 - 1 & 0x1F] = var428 & 0x7FFF;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 120) {
                                            int var433 = field523.method2468();
                                            class4 var434 = (class4) field641.method3315((long) var433);
                                            if (var434 != null) {
                                                method1487(var434, true);
                                            }
                                            if (field644 != null) {
                                                method610(field644);
                                                field644 = null;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 124) {
                                            method54();
                                            field525 = -1;
                                            var132 = false;
                                            break label3851;
                                        }
                                        if (field525 == 156) {
                                            field608 = 0;
                                            field639 = 0;
                                            field523.method2345();
                                            int var435 = field523.method2338(8);
                                            if (var435 < field519) {
                                                for (int var436 = var435; var436 < field519; var436++) {
                                                    field609[++field608 - 1] = field603[var436];
                                                }
                                            }
                                            if (var435 > field519) {
                                                throw new RuntimeException("");
                                            }
                                            field519 = 0;
                                            for (int var437 = 0; var437 < var435; var437++) {
                                                int var438 = field603[var437];
                                                class26 var439 = field518[var438];
                                                int var440 = field523.method2338(1);
                                                if (var440 == 0) {
                                                    field603[++field519 - 1] = var438;
                                                    var439.field465 = field735;
                                                } else {
                                                    int var441 = field523.method2338(2);
                                                    if (var441 == 0) {
                                                        field603[++field519 - 1] = var438;
                                                        var439.field465 = field735;
                                                        field604[++field639 - 1] = var438;
                                                    } else if (var441 == 1) {
                                                        field603[++field519 - 1] = var438;
                                                        var439.field465 = field735;
                                                        int var442 = field523.method2338(3);
                                                        var439.method267(var442, false);
                                                        int var443 = field523.method2338(1);
                                                        if (var443 == 1) {
                                                            field604[++field639 - 1] = var438;
                                                        }
                                                    } else if (var441 == 2) {
                                                        field603[++field519 - 1] = var438;
                                                        var439.field465 = field735;
                                                        int var444 = field523.method2338(3);
                                                        var439.method267(var444, true);
                                                        int var445 = field523.method2338(3);
                                                        var439.method267(var445, true);
                                                        int var446 = field523.method2338(1);
                                                        if (var446 == 1) {
                                                            field604[++field639 - 1] = var438;
                                                        }
                                                    } else if (var441 == 3) {
                                                        field609[++field608 - 1] = var438;
                                                    }
                                                }
                                            }
                                            while (field523.method2349(field684) >= 27) {
                                                int var447 = field523.method2338(15);
                                                if (var447 == 32767) {
                                                    break;
                                                }
                                                boolean var448 = false;
                                                if (field518[var447] == null) {
                                                    field518[var447] = new class26();
                                                    var448 = true;
                                                }
                                                class26 var449 = field518[var447];
                                                field603[++field519 - 1] = var447;
                                                var449.field465 = field735;
                                                var449.field400 = class32.method167(field523.method2338(14));
                                                int var450 = field613[field523.method2338(3)];
                                                if (var448) {
                                                    var449.field467 = var449.field420 = var450;
                                                }
                                                int var451 = field523.method2338(5);
                                                if (var451 > 15) {
                                                    var451 -= 32;
                                                }
                                                int var452 = field523.method2338(1);
                                                int var453 = field523.method2338(5);
                                                if (var453 > 15) {
                                                    var453 -= 32;
                                                }
                                                int var454 = field523.method2338(1);
                                                if (var454 == 1) {
                                                    field604[++field639 - 1] = var447;
                                                }
                                                var449.field452 = var449.field400.field792;
                                                var449.field469 = var449.field400.field799;
                                                if (var449.field469 == 0) {
                                                    var449.field420 = 0;
                                                }
                                                var449.field440 = var449.field400.field782;
                                                var449.field432 = var449.field400.field779;
                                                var449.field472 = var449.field400.field802;
                                                var449.field429 = var449.field400.field811;
                                                var449.field423 = var449.field400.field800;
                                                var449.field424 = var449.field400.field776;
                                                var449.field426 = var449.field400.field781;
                                                var449.method266(Statics.field1683.field471[0] + var453, Statics.field1683.field431[0] + var451, var452 == 1);
                                            }
                                            field523.method2344();
                                            for (int var455 = 0; var455 < field639; var455++) {
                                                int var456 = field604[var455];
                                                class26 var457 = field518[var456];
                                                int var458 = field523.method2531();
                                                if ((var458 & 0x8) != 0) {
                                                    var457.field400 = class32.method167(field523.method2473());
                                                    var457.field452 = var457.field400.field792;
                                                    var457.field469 = var457.field400.field799;
                                                    var457.field440 = var457.field400.field782;
                                                    var457.field432 = var457.field400.field779;
                                                    var457.field472 = var457.field400.field802;
                                                    var457.field429 = var457.field400.field811;
                                                    var457.field423 = var457.field400.field800;
                                                    var457.field424 = var457.field400.field776;
                                                    var457.field426 = var457.field400.field781;
                                                }
                                                if ((var458 & 0x2) != 0) {
                                                    var457.field453 = field523.method2496();
                                                    int var459 = field523.method2485();
                                                    var457.field457 = var459 >> 16;
                                                    var457.field456 = (var459 & 0xFFFF) + field735;
                                                    var457.field454 = 0;
                                                    var457.field418 = 0;
                                                    if (var457.field456 > field735) {
                                                        var457.field454 = -1;
                                                    }
                                                    if (var457.field453 == 65535) {
                                                        var457.field453 = -1;
                                                    }
                                                }
                                                if ((var458 & 0x20) != 0) {
                                                    int var460 = field523.method2496();
                                                    if (var460 == 65535) {
                                                        var460 = -1;
                                                    }
                                                    int var461 = field523.method2539();
                                                    if (var457.field459 == var460 && var460 != -1) {
                                                        int var462 = class35.method708(var460).field886;
                                                        if (var462 == 1) {
                                                            var457.field449 = 0;
                                                            var457.field450 = 0;
                                                            var457.field451 = var461;
                                                            var457.field455 = 0;
                                                        }
                                                        if (var462 == 2) {
                                                            var457.field455 = 0;
                                                        }
                                                    } else if (var460 == -1 || var457.field459 == -1 || class35.method708(var460).field891 >= class35.method708(var457.field459).field891) {
                                                        var457.field459 = var460;
                                                        var457.field449 = 0;
                                                        var457.field450 = 0;
                                                        var457.field451 = var461;
                                                        var457.field455 = 0;
                                                        var457.field422 = var457.field466;
                                                    }
                                                }
                                                if ((var458 & 0x4) != 0) {
                                                    int var463 = field523.method2633();
                                                    int var464 = field523.method2539();
                                                    var457.method275(var463, var464, field735);
                                                    var457.field439 = field735 + 300;
                                                    var457.field427 = field523.method2633();
                                                    var457.field441 = field523.method2633();
                                                }
                                                if ((var458 & 0x80) != 0) {
                                                    var457.field442 = field523.method2496();
                                                    if (var457.field442 == 65535) {
                                                        var457.field442 = -1;
                                                    }
                                                }
                                                if ((var458 & 0x10) != 0) {
                                                    var457.field421 = field523.method2618();
                                                    var457.field475 = 100;
                                                }
                                                if ((var458 & 0x1) != 0) {
                                                    var457.field443 = field523.method2496();
                                                    var457.field435 = field523.method2457();
                                                }
                                                if ((var458 & 0x40) != 0) {
                                                    int var465 = field523.method2539();
                                                    int var466 = field523.method2484();
                                                    var457.method275(var465, var466, field735);
                                                    var457.field439 = field735 + 300;
                                                    var457.field427 = field523.method2633();
                                                    var457.field441 = field523.method2484();
                                                }
                                            }
                                            for (int var467 = 0; var467 < field608; var467++) {
                                                int var468 = field609[var467];
                                                if (field735 != field518[var468].field465) {
                                                    field518[var468].field400 = null;
                                                    field518[var468] = null;
                                                }
                                            }
                                            if (field684 != field523.field2048) {
                                                throw new RuntimeException(field523.field2048 + class2.field17 + field684);
                                            }
                                            for (int var469 = 0; var469 < field519; var469++) {
                                                if (field518[field603[var469]] == null) {
                                                    throw new RuntimeException(var469 + class2.field17 + field519);
                                                }
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 104) {
                                            field496 = field523.method2519() * 30;
                                            field673 = field545;
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 175) {
                                            int var470 = field523.method2484();
                                            int var471 = field523.method2484();
                                            String var472 = field523.method2618();
                                            if (var470 >= 1 && var470 <= 8) {
                                                if (var472.equalsIgnoreCase("null")) {
                                                    var472 = null;
                                                }
                                                field611[var470 - 1] = var472;
                                                field646[var470 - 1] = var471 == 0;
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        if (field525 == 65) {
                                            field523.field2048 += 28;
                                            if (field523.method2483()) {
                                                class83.method2230(field523, field523.field2048 - 28);
                                            }
                                            field525 = -1;
                                            var132 = true;
                                            break label3851;
                                        }
                                        class81.method3159("" + field525 + class2.field17 + field530 + class2.field17 + field509 + class2.field17 + field684, (Throwable) null);
                                        method54();
                                    } catch (IOException var597) {
                                        method3270();
                                    } catch (Exception var598) {
                                        String var475 = "" + field525 + class2.field17 + field530 + class2.field17 + field509 + class2.field17 + field684 + class2.field17 + (Statics.field52 + Statics.field1683.field471[0]) + class2.field17 + (Statics.field332 + Statics.field1683.field431[0]) + class2.field17;
                                        for (int var476 = 0; var476 < field684 && var476 < 50; var476++) {
                                            var475 = var475 + field523.field2050[var476] + class2.field17;
                                        }
                                        class81.method3159(var475, var598);
                                        method54();
                                    }
                                    var132 = true;
                                }
                            }
                            if (!var132) {
                                break;
                            }
                        }
                        if (field487 == 30) {
                            class184.method2904(field689, 225);
                            Object var477 = Statics.field2019.field240;
                            synchronized (Statics.field2019.field240) {
                                if (!field606) {
                                    Statics.field2019.field245 = 0;
                                } else if (class78.field1416 != 0 || Statics.field2019.field245 >= 40) {
                                    field689.method2335(254);
                                    field689.method2449(0);
                                    int var478 = field689.field2048;
                                    int var479 = 0;
                                    for (int var480 = 0; var480 < Statics.field2019.field245 && field689.field2048 - var478 < 240; var480++) {
                                        var479++;
                                        int var481 = Statics.field2019.field241[var480];
                                        if (var481 < 0) {
                                            var481 = 0;
                                        } else if (var481 > 502) {
                                            var481 = 502;
                                        }
                                        int var482 = Statics.field2019.field242[var480];
                                        if (var482 < 0) {
                                            var482 = 0;
                                        } else if (var482 > 764) {
                                            var482 = 764;
                                        }
                                        int var483 = var481 * 765 + var482;
                                        if (Statics.field2019.field241[var480] == -1 && Statics.field2019.field242[var480] == -1) {
                                            var482 = -1;
                                            var481 = -1;
                                            var483 = 524287;
                                        }
                                        if (field479 != var482 || field492 != var481) {
                                            int var484 = var482 - field479;
                                            field479 = var482;
                                            int var485 = var481 - field492;
                                            field492 = var481;
                                            if (field610 < 8 && var484 >= -32 && var484 <= 31 && var485 >= -32 && var485 <= 31) {
                                                var484 += 32;
                                                var485 += 32;
                                                field689.method2529((field610 << 12) + (var484 << 6) + var485);
                                                field610 = 0;
                                            } else if (field610 < 8) {
                                                field689.method2501((field610 << 19) + 8388608 + var483);
                                                field610 = 0;
                                            } else {
                                                field689.method2452((field610 << 19) + -1073741824 + var483);
                                                field610 = 0;
                                            }
                                        } else if (field610 < 2047) {
                                            field610++;
                                        }
                                    }
                                    field689.method2460(field689.field2048 - var478);
                                    if (var479 >= Statics.field2019.field245) {
                                        Statics.field2019.field245 = 0;
                                    } else {
                                        Statics.field2019.field245 -= var479;
                                        for (int var486 = 0; var486 < Statics.field2019.field245; var486++) {
                                            Statics.field2019.field242[var486] = Statics.field2019.field242[var479 + var486];
                                            Statics.field2019.field241[var486] = Statics.field2019.field241[var479 + var486];
                                        }
                                    }
                                }
                            }
                            if (class78.field1416 == 1 || !Statics.field1668 && class78.field1416 == 4 || class78.field1416 == 2) {
                                long var488 = (class78.field1420 - field490) / 50L;
                                if (var488 > 4095L) {
                                    var488 = 4095L;
                                }
                                field490 = class78.field1420;
                                int var490 = class78.field1418;
                                if (var490 < 0) {
                                    var490 = 0;
                                } else if (var490 > 502) {
                                    var490 = 502;
                                }
                                int var491 = class78.field1417;
                                if (var491 < 0) {
                                    var491 = 0;
                                } else if (var491 > 764) {
                                    var491 = 764;
                                }
                                int var492 = var490 * 765 + var491;
                                byte var493 = 0;
                                if (class78.field1416 == 2) {
                                    var493 = 1;
                                }
                                int var494 = (int) var488;
                                field689.method2335(170);
                                field689.method2452((var493 << 19) + (var494 << 20) + var492);
                            }
                            if (class76.field1385 > 0) {
                                field689.method2335(128);
                                field689.method2529(0);
                                int var495 = field689.field2048;
                                long var496 = class122.method195();
                                for (int var498 = 0; var498 < class76.field1385; var498++) {
                                    long var499 = var496 - field704;
                                    if (var499 > 16777215L) {
                                        var499 = 16777215L;
                                    }
                                    field704 = var496;
                                    field689.method2449(class76.field1384[var498]);
                                    field689.method2450((int) var499);
                                }
                                field689.method2459(field689.field2048 - var495);
                            }
                            if (field733 > 0) {
                                field733--;
                            }
                            if (class76.field1390[96] || class76.field1390[97] || class76.field1390[98] || class76.field1390[99]) {
                                field571 = true;
                            }
                            if (field571 && field733 <= 0) {
                                field733 = 20;
                                field571 = false;
                                field689.method2335(86);
                                field689.method2494(field564);
                                field689.method2470(field565);
                            }
                            if (Statics.field217 && !field494) {
                                field494 = true;
                                field689.method2335(208);
                                field689.method2449(1);
                            }
                            if (!Statics.field217 && field494) {
                                field494 = false;
                                field689.method2335(208);
                                field689.method2449(0);
                            }
                            if (field485 && Statics.field259 != field578) {
                                method1357(Statics.field265, Statics.field2597, Statics.field259, Statics.field1683.field471[0], Statics.field1683.field431[0]);
                            } else if (Statics.field259 != field707) {
                                field707 = Statics.field259;
                                int var501 = Statics.field259;
                                int[] var502 = Statics.field1125.field1484;
                                int var503 = var502.length;
                                for (int var504 = 0; var504 < var503; var504++) {
                                    var502[var504] = 0;
                                }
                                int var505 = 1;
                                while (true) {
                                    if (var505 >= 103) {
                                        int var508 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var509 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field1125.method1688();
                                        for (int var510 = 1; var510 < 103; var510++) {
                                            for (int var511 = 1; var511 < 103; var511++) {
                                                if ((class9.field127[var501][var511][var510] & 0x18) == 0) {
                                                    method1643(var501, var511, var510, var508, var509);
                                                }
                                                if (var501 < 3 && (class9.field127[var501 + 1][var511][var510] & 0x8) != 0) {
                                                    method1643(var501 + 1, var511, var510, var508, var509);
                                                }
                                            }
                                        }
                                        field599 = 0;
                                        for (int var512 = 0; var512 < 104; var512++) {
                                            for (int var513 = 0; var513 < 104; var513++) {
                                                int var514 = Statics.field192.method1907(Statics.field259, var512, var513);
                                                if (var514 != 0) {
                                                    int var515 = var514 >> 14 & 0x7FFF;
                                                    int var516 = Statics.method2776(var515).field842;
                                                    if (var516 >= 0) {
                                                        int var517 = var512;
                                                        int var518 = var513;
                                                        if (var516 != 22 && var516 != 29 && var516 != 34 && var516 != 36 && var516 != 46 && var516 != 47 && var516 != 48) {
                                                            int[][] var519 = field540[Statics.field259].field2065;
                                                            for (int var520 = 0; var520 < 10; var520++) {
                                                                int var521 = (int) (Math.random() * 4.0D);
                                                                if (var521 == 0 && var517 > 0 && var517 > var512 - 3 && (var519[var517 - 1][var518] & 0x1240108) == 0) {
                                                                    var517--;
                                                                }
                                                                if (var521 == 1 && var517 < 103 && var517 < var512 + 3 && (var519[var517 + 1][var518] & 0x1240180) == 0) {
                                                                    var517++;
                                                                }
                                                                if (var521 == 2 && var518 > 0 && var518 > var513 - 3 && (var519[var517][var518 - 1] & 0x1240102) == 0) {
                                                                    var518--;
                                                                }
                                                                if (var521 == 3 && var518 < 103 && var518 < var513 + 3 && (var519[var517][var518 + 1] & 0x1240120) == 0) {
                                                                    var518++;
                                                                }
                                                            }
                                                        }
                                                        field482[field599] = Statics.field2369[var516];
                                                        field709[field599] = var517;
                                                        field716[field599] = var518;
                                                        field599++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field200.method1679();
                                        break;
                                    }
                                    int var506 = (103 - var505) * 2048 + 24628;
                                    for (int var507 = 1; var507 < 103; var507++) {
                                        if ((class9.field127[var501][var507][var505] & 0x18) == 0) {
                                            Statics.field192.method1912(var502, var506, 512, var501, var507, var505);
                                        }
                                        if (var501 < 3 && (class9.field127[var501 + 1][var507][var505] & 0x8) != 0) {
                                            Statics.field192.method1912(var502, var506, 512, var501 + 1, var507, var505);
                                        }
                                        var506 += 4;
                                    }
                                    var505++;
                                }
                            }
                            if (field487 == 30) {
                                method2746();
                                method2325();
                                field653++;
                                if (field653 > 750) {
                                    method3270();
                                } else {
                                    method2979();
                                    method1542();
                                    method1364();
                                    field556++;
                                    if (field590 != 0) {
                                        field589 += 20;
                                        if (field589 >= 400) {
                                            field590 = 0;
                                        }
                                    }
                                    if (Statics.field348 != null) {
                                        field591++;
                                        if (field591 >= 15) {
                                            method610(Statics.field348);
                                            Statics.field348 = null;
                                        }
                                    }
                                    class161 var522 = Statics.field1768;
                                    class161 var523 = Statics.field363;
                                    Statics.field1768 = null;
                                    Statics.field363 = null;
                                    field655 = null;
                                    field659 = false;
                                    field656 = false;
                                    field701 = 0;
                                    while (true) {
                                        while (true) {
                                            class76 var524 = class76.field1391;
                                            boolean var525;
                                            synchronized (class76.field1391) {
                                                if (class76.field1388 == class76.field1386) {
                                                    var525 = false;
                                                } else {
                                                    Statics.field306 = class76.field1383[class76.field1386];
                                                    Statics.field1382 = class76.field1361[class76.field1386];
                                                    class76.field1386 = class76.field1386 + 1 & 0x7F;
                                                    var525 = true;
                                                }
                                            }
                                            if (!var525 || field701 >= 128) {
                                                int var529 = field640;
                                                if (class161.method199(var529)) {
                                                    method1652(Statics.field2626[var529], -1, 0, 0, 765, 503, 0, 0);
                                                }
                                                field545++;
                                                while (true) {
                                                    class1 var530;
                                                    class161 var531;
                                                    class161 var532;
                                                    do {
                                                        var530 = (class1) field678.method3337();
                                                        if (var530 == null) {
                                                            while (true) {
                                                                class1 var533;
                                                                class161 var534;
                                                                class161 var535;
                                                                do {
                                                                    var533 = (class1) field711.method3337();
                                                                    if (var533 == null) {
                                                                        while (true) {
                                                                            class1 var536;
                                                                            class161 var537;
                                                                            class161 var538;
                                                                            do {
                                                                                var536 = (class1) field501.method3337();
                                                                                if (var536 == null) {
                                                                                    boolean var539 = false;
                                                                                    while (!var539) {
                                                                                        var539 = true;
                                                                                        for (int var540 = 0; var540 < field685 - 1; var540++) {
                                                                                            if (field626[var540] < 1000 && field626[var540 + 1] > 1000) {
                                                                                                String var541 = field652[var540];
                                                                                                field652[var540] = field652[var540 + 1];
                                                                                                field652[var540 + 1] = var541;
                                                                                                String var542 = field677[var540];
                                                                                                field677[var540] = field677[var540 + 1];
                                                                                                field677[var540 + 1] = var542;
                                                                                                int var543 = field626[var540];
                                                                                                field626[var540] = field626[var540 + 1];
                                                                                                field626[var540 + 1] = var543;
                                                                                                int var544 = field667[var540];
                                                                                                field667[var540] = field667[var540 + 1];
                                                                                                field667[var540 + 1] = var544;
                                                                                                int var545 = field625[var540];
                                                                                                field625[var540] = field625[var540 + 1];
                                                                                                field625[var540 + 1] = var545;
                                                                                                int var546 = field627[var540];
                                                                                                field627[var540] = field627[var540 + 1];
                                                                                                field627[var540 + 1] = var546;
                                                                                                var539 = false;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field1191 == null && field651 == null) {
                                                                                        int var547 = class78.field1416;
                                                                                        if (field622) {
                                                                                            if (var547 != 1 && (Statics.field1668 || var547 != 4)) {
                                                                                                int var548 = class78.field1410;
                                                                                                int var549 = class78.field1411;
                                                                                                if (var548 < Statics.field137 - 10 || var548 > Statics.field1401 + Statics.field137 + 10 || var549 < Statics.field1291 - 10 || var549 > Statics.field175 + Statics.field1291 + 10) {
                                                                                                    field622 = false;
                                                                                                    method1279(Statics.field137, Statics.field1291, Statics.field1401, Statics.field175);
                                                                                                }
                                                                                            }
                                                                                            if (var547 == 1 || !Statics.field1668 && var547 == 4) {
                                                                                                int var550 = Statics.field137;
                                                                                                int var551 = Statics.field1291;
                                                                                                int var552 = Statics.field1401;
                                                                                                int var553 = class78.field1417;
                                                                                                int var554 = class78.field1418;
                                                                                                int var555 = -1;
                                                                                                for (int var556 = 0; var556 < field685; var556++) {
                                                                                                    int var557 = (field685 - 1 - var556) * 15 + var551 + 31;
                                                                                                    if (var553 > var550 && var553 < var550 + var552 && var554 > var557 - 13 && var554 < var557 + 3) {
                                                                                                        var555 = var556;
                                                                                                    }
                                                                                                }
                                                                                                if (var555 != -1) {
                                                                                                    method194(var555);
                                                                                                }
                                                                                                field622 = false;
                                                                                                method1279(Statics.field137, Statics.field1291, Statics.field1401, Statics.field175);
                                                                                            }
                                                                                        } else {
                                                                                            label3900: {
                                                                                                int var559;
                                                                                                int var560;
                                                                                                label3973: {
                                                                                                    if ((var547 == 1 || !Statics.field1668 && var547 == 4) && field685 > 0) {
                                                                                                        int var558 = field626[field685 - 1];
                                                                                                        if (var558 == 39 || var558 == 40 || var558 == 41 || var558 == 42 || var558 == 43 || var558 == 33 || var558 == 34 || var558 == 35 || var558 == 36 || var558 == 37 || var558 == 38 || var558 == 1005) {
                                                                                                            var559 = field667[field685 - 1];
                                                                                                            var560 = field625[field685 - 1];
                                                                                                            class161 var561 = class161.method3039(var560);
                                                                                                            int var562 = method559(var561);
                                                                                                            boolean var563 = (var562 >> 28 & 0x1) != 0;
                                                                                                            if (var563) {
                                                                                                                break label3973;
                                                                                                            }
                                                                                                            int var564 = method559(var561);
                                                                                                            boolean var565 = (var564 >> 29 & 0x1) != 0;
                                                                                                            if (var565) {
                                                                                                                break label3973;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if ((var547 == 1 || !Statics.field1668 && var547 == 4) && (field621 == 1 && field685 > 2 || method565(field685 - 1))) {
                                                                                                        var547 = 2;
                                                                                                    }
                                                                                                    if ((var547 == 1 || !Statics.field1668 && var547 == 4) && field685 > 0) {
                                                                                                        method194(field685 - 1);
                                                                                                    }
                                                                                                    if (var547 == 2 && field685 > 0) {
                                                                                                        method40(class78.field1417, class78.field1418);
                                                                                                    }
                                                                                                    break label3900;
                                                                                                }
                                                                                                if (Statics.field1191 != null && !field537 && field621 != 1 && !method565(field685 - 1) && field685 > 0) {
                                                                                                    method154(field712, field595);
                                                                                                }
                                                                                                field537 = false;
                                                                                                field598 = 0;
                                                                                                if (Statics.field1191 != null) {
                                                                                                    method610(Statics.field1191);
                                                                                                }
                                                                                                Statics.field1191 = class161.method3039(var560);
                                                                                                field593 = var559;
                                                                                                field712 = class78.field1417;
                                                                                                field595 = class78.field1418;
                                                                                                if (field685 > 0) {
                                                                                                    int var566 = field685 - 1;
                                                                                                    Statics.field1268 = new class21();
                                                                                                    Statics.field1268.field309 = field667[var566];
                                                                                                    Statics.field1268.field300 = field625[var566];
                                                                                                    Statics.field1268.field301 = field626[var566];
                                                                                                    Statics.field1268.field302 = field627[var566];
                                                                                                    Statics.field1268.field303 = field677[var566];
                                                                                                }
                                                                                                method610(Statics.field1191);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (field651 != null) {
                                                                                        Statics.method1231();
                                                                                    }
                                                                                    if (Statics.field1191 != null) {
                                                                                        method610(Statics.field1191);
                                                                                        field598++;
                                                                                        if (class78.field1419 == 0) {
                                                                                            if (field537) {
                                                                                                if (Statics.field1404 == Statics.field1191 && field596 != field593) {
                                                                                                    class161 var567 = Statics.field1191;
                                                                                                    byte var568 = 0;
                                                                                                    if (field594 == 1 && var567.field2680 == 206) {
                                                                                                        var568 = 1;
                                                                                                    }
                                                                                                    if (var567.field2721[field596] <= 0) {
                                                                                                        var568 = 0;
                                                                                                    }
                                                                                                    int var569 = method559(var567);
                                                                                                    boolean var570 = (var569 >> 29 & 0x1) != 0;
                                                                                                    if (var570) {
                                                                                                        int var571 = field593;
                                                                                                        int var572 = field596;
                                                                                                        var567.field2721[var572] = var567.field2721[var571];
                                                                                                        var567.field2663[var572] = var567.field2663[var571];
                                                                                                        var567.field2721[var571] = -1;
                                                                                                        var567.field2663[var571] = 0;
                                                                                                    } else if (var568 == 1) {
                                                                                                        int var573 = field593;
                                                                                                        int var574 = field596;
                                                                                                        while (var573 != var574) {
                                                                                                            if (var573 > var574) {
                                                                                                                var567.method3190(var573 - 1, var573);
                                                                                                                var573--;
                                                                                                            } else if (var573 < var574) {
                                                                                                                var567.method3190(var573 + 1, var573);
                                                                                                                var573++;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var567.method3190(field596, field593);
                                                                                                    }
                                                                                                    field689.method2335(120);
                                                                                                    field689.method2502(Statics.field1191.field2727);
                                                                                                    field689.method2449(var568);
                                                                                                    field689.method2494(field596);
                                                                                                    field689.method2529(field593);
                                                                                                }
                                                                                            } else if ((field621 == 1 || method565(field685 - 1)) && field685 > 2) {
                                                                                                method40(field712, field595);
                                                                                            } else if (field685 > 0) {
                                                                                                method154(field712, field595);
                                                                                            }
                                                                                            field591 = 10;
                                                                                            class78.field1416 = 0;
                                                                                            Statics.field1191 = null;
                                                                                        } else if (field598 >= 5 && (class78.field1410 > field712 + 5 || class78.field1410 < field712 - 5 || class78.field1411 > field595 + 5 || class78.field1411 < field595 - 5)) {
                                                                                            field537 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class96.field1582 != -1) {
                                                                                        int var575 = class96.field1582;
                                                                                        int var576 = class96.field1602;
                                                                                        field689.method2335(3);
                                                                                        field689.method2449(5);
                                                                                        field689.method2481(class76.field1390[82] ? (class76.field1390[81] ? 2 : 1) : 0);
                                                                                        field689.method2628(Statics.field52 + var575);
                                                                                        field689.method2494(Statics.field332 + var576);
                                                                                        class96.field1582 = -1;
                                                                                        field587 = class78.field1417;
                                                                                        field588 = class78.field1418;
                                                                                        field590 = 1;
                                                                                        field589 = 0;
                                                                                        field570 = var575;
                                                                                        field531 = var576;
                                                                                    }
                                                                                    if (Statics.field1768 != var522) {
                                                                                        if (var522 != null) {
                                                                                            method610(var522);
                                                                                        }
                                                                                        if (Statics.field1768 != null) {
                                                                                            method610(Statics.field1768);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field363 != var523 && field632 == field504) {
                                                                                        if (var523 != null) {
                                                                                            method610(var523);
                                                                                        }
                                                                                        if (Statics.field363 != null) {
                                                                                            method610(Statics.field363);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field363 == null) {
                                                                                        if (field632 > 0) {
                                                                                            field632--;
                                                                                        }
                                                                                    } else if (field632 < field504) {
                                                                                        field632++;
                                                                                        if (field632 == field504) {
                                                                                            method610(Statics.field363);
                                                                                        }
                                                                                    }
                                                                                    Statics.method2053();
                                                                                    if (field726) {
                                                                                        method563();
                                                                                    }
                                                                                    for (int var577 = 0; var577 < 5; var577++) {
                                                                                        int var10002 = field731[var577]++;
                                                                                    }
                                                                                    int var578 = Statics.method240();
                                                                                    int var579 = class76.field1389;
                                                                                    if (var578 > 15000 && var579 > 15000) {
                                                                                        field528 = 250;
                                                                                        class78.field1413 = 14500;
                                                                                        field689.method2335(72);
                                                                                    }
                                                                                    field550++;
                                                                                    if (field550 > 500) {
                                                                                        field550 = 0;
                                                                                        int var581 = (int) (Math.random() * 8.0D);
                                                                                        if ((var581 & 0x1) == 1) {
                                                                                            field544 += field629;
                                                                                        }
                                                                                        if ((var581 & 0x2) == 2) {
                                                                                            field546 += field628;
                                                                                        }
                                                                                        if ((var581 & 0x4) == 4) {
                                                                                            field476 += field549;
                                                                                        }
                                                                                    }
                                                                                    if (field544 < -50) {
                                                                                        field629 = 2;
                                                                                    }
                                                                                    if (field544 > 50) {
                                                                                        field629 = -2;
                                                                                    }
                                                                                    if (field546 < -55) {
                                                                                        field628 = 2;
                                                                                    }
                                                                                    if (field546 > 55) {
                                                                                        field628 = -2;
                                                                                    }
                                                                                    if (field476 < -40) {
                                                                                        field549 = 1;
                                                                                    }
                                                                                    if (field476 > 40) {
                                                                                        field549 = -1;
                                                                                    }
                                                                                    field555++;
                                                                                    if (field555 > 500) {
                                                                                        field555 = 0;
                                                                                        int var582 = (int) (Math.random() * 8.0D);
                                                                                        if ((var582 & 0x1) == 1) {
                                                                                            field551 += field699;
                                                                                        }
                                                                                        if ((var582 & 0x2) == 2) {
                                                                                            field553 += field554;
                                                                                        }
                                                                                    }
                                                                                    if (field551 < -60) {
                                                                                        field699 = 2;
                                                                                    }
                                                                                    if (field551 > 60) {
                                                                                        field699 = -2;
                                                                                    }
                                                                                    if (field553 < -20) {
                                                                                        field554 = 1;
                                                                                    }
                                                                                    if (field553 > 10) {
                                                                                        field554 = -1;
                                                                                    }
                                                                                    for (class29 var583 = (class29) field493.method3307(); var583 != null; var583 = (class29) field493.method3308()) {
                                                                                        if ((long) var583.field744 < class122.method195() / 1000L - 5L) {
                                                                                            if (var583.field748 > 0) {
                                                                                                method197(5, "", var583.field742 + class137.field2258);
                                                                                            }
                                                                                            if (var583.field748 == 0) {
                                                                                                method197(5, "", var583.field742 + class137.field2259);
                                                                                            }
                                                                                            var583.method3360();
                                                                                        }
                                                                                    }
                                                                                    field527++;
                                                                                    if (field527 > 50) {
                                                                                        field689.method2335(12);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field275 != null && field689.field2048 > 0) {
                                                                                            Statics.field275.method1372(field689.field2050, 0, field689.field2048);
                                                                                            field689.field2048 = 0;
                                                                                            field527 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var585) {
                                                                                        method3270();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var537 = var536.field3;
                                                                                if (var537.field2620 < 0) {
                                                                                    break;
                                                                                }
                                                                                var538 = class161.method3039(var537.field2713);
                                                                            } while (var538 == null || var538.field2641 == null || var537.field2620 >= var538.field2641.length || var538.field2641[var537.field2620] != var537);
                                                                            class27.method1310(var536);
                                                                        }
                                                                    }
                                                                    var534 = var533.field3;
                                                                    if (var534.field2620 < 0) {
                                                                        break;
                                                                    }
                                                                    var535 = class161.method3039(var534.field2713);
                                                                } while (var535 == null || var535.field2641 == null || var534.field2620 >= var535.field2641.length || var535.field2641[var534.field2620] != var534);
                                                                class27.method1310(var533);
                                                            }
                                                        }
                                                        var531 = var530.field3;
                                                        if (var531.field2620 < 0) {
                                                            break;
                                                        }
                                                        var532 = class161.method3039(var531.field2713);
                                                    } while (var532 == null || var532.field2641 == null || var531.field2620 >= var532.field2641.length || var532.field2641[var531.field2620] != var531);
                                                    class27.method1310(var530);
                                                }
                                            }
                                            if (field511 >= 2 && class76.field1390[82] && Statics.field306 == 66) {
                                                String var527 = "";
                                                for (int var528 = 0; var528 < field695 && var528 < 100; var528++) {
                                                    var527 = var527 + field692[var528] + ':' + field694[var528] + '\n';
                                                }
                                                Statics.field62.setContents(new StringSelection(var527), (ClipboardOwner) null);
                                            } else {
                                                field703[field701] = Statics.field306;
                                                field657[field701] = Statics.field1382;
                                                field701++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field487 == 40 || field487 == 45) {
                    method2048();
                }
                return;
            }
            var2.field2601.method3142(var2.field2600, (int) var2.field2839, var2.field2599, false);
        }
    }

    @ObfuscatedName("client.q(B)V")
    public final void method283() {
        boolean var1 = class141.method2227();
        if (var1 && field543 && Statics.field236 != null) {
            Statics.field236.method1155();
        }
        if (field1341) {
            class76.method1619(Statics.field1230);
            class78.method151(Statics.field1230);
            if (Statics.field51 != null) {
                Statics.field51.method1344(Statics.field1230);
            }
            this.method1423();
            class76.method1399(Statics.field1230);
            class78.method1605(Statics.field1230);
            if (Statics.field51 != null) {
                Statics.field51.method1355(Statics.field1230);
            }
        }
        if (field487 == 0) {
            class74.method769(class22.field318, class22.field331, (Color) null);
        } else if (field487 == 5) {
            Statics.method24(Statics.field1767, Statics.field257);
        } else if (field487 == 10) {
            Statics.method24(Statics.field1767, Statics.field257);
        } else if (field487 == 20) {
            Statics.method24(Statics.field1767, Statics.field257);
        } else if (field487 == 25) {
            if (field612 == 1) {
                if (field535 > field536) {
                    field536 = field535;
                }
                int var2 = (field536 * 50 - field535 * 50) / field536;
                method32(class137.field2129 + class2.field21 + class2.field18 + var2 + "%" + class2.field19, false);
            } else if (field612 == 2) {
                if (field524 > field538) {
                    field538 = field524;
                }
                int var3 = (field538 * 50 - field524 * 50) / field538 + 50;
                method32(class137.field2129 + class2.field21 + class2.field18 + var3 + "%" + class2.field19, false);
            } else {
                method32(class137.field2129, false);
            }
        } else if (field487 == 30) {
            if (field640 != -1) {
                int var4 = field640;
                if (class161.method199(var4)) {
                    method254(Statics.field2626[var4], -1);
                }
            }
            for (int var5 = 0; var5 < field681; var5++) {
                if (field683[var5]) {
                    field516[var5] = true;
                }
                field617[var5] = field683[var5];
                field683[var5] = false;
            }
            field682 = field735;
            field630 = -1;
            field669 = -1;
            Statics.field1404 = null;
            if (field640 != -1) {
                field681 = 0;
                method273(field640, 0, 0, 765, 503, 0, 0, -1);
            }
            class90.method1797();
            if (field622) {
                int var6 = Statics.field137;
                int var7 = Statics.field1291;
                int var8 = Statics.field1401;
                int var9 = Statics.field175;
                int var10 = 6116423;
                class90.method1804(var6, var7, var8, var9, var10);
                class90.method1804(var6 + 1, var7 + 1, var8 - 2, 16, 0);
                class90.method1806(var6 + 1, var7 + 18, var8 - 2, var9 - 19, 0);
                Statics.field1767.method3398(class137.field2262, var6 + 3, var7 + 14, var10, -1);
                int var11 = class78.field1410;
                int var12 = class78.field1411;
                for (int var13 = 0; var13 < field685; var13++) {
                    int var14 = (field685 - 1 - var13) * 15 + var7 + 31;
                    int var15 = 16777215;
                    if (var11 > var6 && var11 < var6 + var8 && var12 > var14 - 13 && var12 < var14 + 3) {
                        var15 = 16776960;
                    }
                    Statics.field1767.method3398(method2732(var13), var6 + 3, var14, var15, 0);
                }
                method168(Statics.field137, Statics.field1291, Statics.field1401, Statics.field175);
            } else if (field630 != -1) {
                Statics.method136(field630, field669);
            }
            if (field690 == 3) {
                for (int var16 = 0; var16 < field681; var16++) {
                    if (field617[var16]) {
                        class90.method1803(field686[var16], field720[var16], field688[var16], field675[var16], 16711935, 128);
                    } else if (field516[var16]) {
                        class90.method1803(field686[var16], field720[var16], field688[var16], field675[var16], 16711680, 128);
                    }
                }
            }
            class7.method911(Statics.field259, Statics.field1683.field470, Statics.field1683.field419, field556);
            field556 = 0;
        } else if (field487 == 40) {
            method32(class137.field2130 + class2.field21 + class137.field2131, false);
        } else if (field487 == 45) {
            method32(class137.field2122, false);
        }
        if (field487 == 30 && field690 == 0 && !field1339) {
            try {
                Graphics var17 = Statics.field1230.getGraphics();
                for (int var18 = 0; var18 < field681; var18++) {
                    if (field516[var18]) {
                        Statics.field200.method1610(var17, field686[var18], field720[var18], field688[var18], field675[var18]);
                        field516[var18] = false;
                    }
                }
            } catch (Exception var24) {
                Statics.field1230.repaint();
            }
        } else if (field487 > 0) {
            try {
                Graphics var20 = Statics.field1230.getGraphics();
                Statics.field200.method1632(var20, 0, 0);
                field1339 = false;
                for (int var21 = 0; var21 < field681; var21++) {
                    field516[var21] = false;
                }
            } catch (Exception var23) {
                Statics.field1230.repaint();
            }
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method284() {
        if (Statics.field2019 != null) {
            Statics.field2019.field243 = false;
        }
        Statics.field2019 = null;
        if (Statics.field275 != null) {
            Statics.field275.method1371();
            Statics.field275 = null;
        }
        if (class76.field1391 != null) {
            class76 var1 = class76.field1391;
            synchronized (class76.field1391) {
                class76.field1391 = null;
            }
        }
        if (class78.field1409 != null) {
            class78 var3 = class78.field1409;
            synchronized (class78.field1409) {
                class78.field1409 = null;
            }
        }
        Statics.field51 = null;
        if (Statics.field236 != null) {
            Statics.field236.method1156();
        }
        if (Statics.field925 != null) {
            Statics.field925.method1156();
        }
        class156.method1684();
        class160.method241();
        try {
            class83.field1453.method597();
            for (int var5 = 0; var5 < Statics.field239; var5++) {
                Statics.field1455[var5].method597();
            }
            class83.field1454.method597();
            class83.field1452.method597();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("ac.v(II)V")
    public static void method882(int arg0) {
        if (field487 == arg0) {
            return;
        }
        if (field487 == 0) {
            Statics.field1637 = null;
            Statics.field417 = null;
            Statics.field387 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field514 = 0;
            field515 = 0;
            field584 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2062 != null) {
            Statics.field2062.method1371();
            Statics.field2062 = null;
        }
        if (field487 == 25) {
            field612 = 0;
            field535 = 0;
            field536 = 1;
            field524 = 0;
            field538 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1230;
            class157 var2 = Statics.field60;
            class157 var3 = Statics.field713;
            if (!Statics.field2036) {
                class90.method1802();
                byte[] var4 = var2.method3059("title.jpg", "");
                Statics.field2374 = new class87(var4, var1);
                Statics.field282 = Statics.field2374.method1713();
                Statics.field312 = Statics.method568(var3, "logo", "");
                Statics.field2484 = Statics.method568(var3, "titlebox", "");
                Statics.field326 = Statics.method568(var3, "titlebutton", "");
                Statics.field2018 = class85.method192(var3, "runes", "");
                Statics.field304 = class85.method192(var3, "title_mute", "");
                Statics.field338 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field338[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field338[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field338[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field338[var8 + 192] = 16777215;
                }
                Statics.field274 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field274[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field274[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field274[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field274[var12 + 192] = 16777215;
                }
                Statics.field317 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field317[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field317[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field317[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field317[var16 + 192] = 16777215;
                }
                Statics.field1800 = new int[256];
                Statics.field747 = new int[32768];
                Statics.field1933 = new int[32768];
                class22.method183((class88) null);
                Statics.field320 = new int[32768];
                Statics.field1532 = new int[32768];
                class22.field327 = 0;
                class22.field342 = "";
                class22.field347 = "";
                class22.field335 = false;
                if (Statics.field247.field182) {
                    class141.method3226(2);
                } else {
                    class141.method193(2, Statics.field2033, "scape main", "", 255, false);
                }
                class156.method2052(false);
                Statics.field2036 = true;
                Statics.field2374.method1696(0, 0);
                Statics.field282.method1696(382, 0);
                Statics.field312.method1782(382 - Statics.field312.field1498 / 2, 18);
            }
        } else {
            class22.method156();
        }
        field487 = arg0;
    }

    @ObfuscatedName("client.m(B)V")
    public void method285() {
        if (field487 == 1000) {
            return;
        }
        long var1 = class122.method195();
        int var3 = (int) (var1 - Statics.field2578);
        Statics.field2578 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class156.field2580 += var3;
        boolean var4;
        if (class156.field2565 == 0 && class156.field2559 == 0 && class156.field2561 == 0 && class156.field2563 == 0) {
            var4 = true;
        } else if (Statics.field2570 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class156.field2580 > 30000) {
                        throw new IOException();
                    }
                    while (class156.field2559 < 20 && class156.field2563 > 0) {
                        class158 var5 = (class158) class156.field2560.method3318();
                        class128 var6 = new class128(4);
                        var6.method2449(1);
                        var6.method2501((int) var5.field2839);
                        Statics.field2570.method1372(var6.field2050, 0, 4);
                        class156.field2564.method3329(var5, var5.field2839);
                        class156.field2563--;
                        class156.field2559++;
                    }
                    while (class156.field2565 < 20 && class156.field2561 > 0) {
                        class158 var7 = (class158) class156.field2566.method3291();
                        class128 var8 = new class128(4);
                        var8.method2449(0);
                        var8.method2501((int) var7.field2839);
                        Statics.field2570.method1372(var8.field2050, 0, 4);
                        var7.method3311();
                        class156.field2569.method3329(var7, var7.field2839);
                        class156.field2561--;
                        class156.field2565++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2570.method1373();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class156.field2580 = 0;
                        byte var11 = 0;
                        if (Statics.field2571 == null) {
                            var11 = 8;
                        } else if (class156.field2568 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class156.field2572.field2048;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2570.method1374(class156.field2572.field2050, class156.field2572.field2048, var12);
                            if (class156.field2576 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class156.field2572.field2050[class156.field2572.field2048 + var13] ^= class156.field2576;
                                }
                            }
                            class156.field2572.field2048 += var12;
                            if (class156.field2572.field2048 < var11) {
                                break;
                            }
                            if (Statics.field2571 == null) {
                                class156.field2572.field2048 = 0;
                                int var14 = class156.field2572.method2531();
                                int var15 = class156.field2572.method2473();
                                int var16 = class156.field2572.method2531();
                                int var17 = class156.field2572.method2468();
                                long var18 = (long) ((var14 << 16) + var15);
                                class158 var20 = (class158) class156.field2564.method3315(var18);
                                Statics.field1350 = true;
                                if (var20 == null) {
                                    var20 = (class158) class156.field2569.method3315(var18);
                                    Statics.field1350 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2571 = var20;
                                Statics.field2076 = new class128(var17 + var21 + Statics.field2571.field2592);
                                Statics.field2076.method2449(var16);
                                Statics.field2076.method2452(var17);
                                class156.field2568 = 8;
                                class156.field2572.field2048 = 0;
                            } else if (class156.field2568 == 0) {
                                if (class156.field2572.field2050[0] == -1) {
                                    class156.field2568 = 1;
                                    class156.field2572.field2048 = 0;
                                } else {
                                    Statics.field2571 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2076.field2050.length - Statics.field2571.field2592;
                            int var23 = 512 - class156.field2568;
                            if (var23 > var22 - Statics.field2076.field2048) {
                                var23 = var22 - Statics.field2076.field2048;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2570.method1374(Statics.field2076.field2050, Statics.field2076.field2048, var23);
                            if (class156.field2576 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2076.field2050[Statics.field2076.field2048 + var24] ^= class156.field2576;
                                }
                            }
                            Statics.field2076.field2048 += var23;
                            class156.field2568 += var23;
                            if (Statics.field2076.field2048 == var22) {
                                if (Statics.field2571.field2839 == 16711935L) {
                                    Statics.field208 = Statics.field2076;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class157 var26 = class156.field2575[var25];
                                        if (var26 != null) {
                                            Statics.field208.field2048 = var25 * 8 + 5;
                                            int var27 = Statics.field208.method2468();
                                            int var28 = Statics.field208.method2468();
                                            var26.method3141(var27, var28);
                                        }
                                    }
                                } else {
                                    class156.field2573.reset();
                                    class156.field2573.update(Statics.field2076.field2050, 0, var22);
                                    int var29 = (int) class156.field2573.getValue();
                                    if (Statics.field2571.field2596 != var29) {
                                        try {
                                            Statics.field2570.method1371();
                                        } catch (Exception var35) {
                                        }
                                        class156.field2577++;
                                        Statics.field2570 = null;
                                        class156.field2576 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class156.field2577 = 0;
                                    class156.field2562 = 0;
                                    Statics.field2571.field2593.method3139((int) (Statics.field2571.field2839 & 0xFFFFL), Statics.field2076.field2050, (Statics.field2571.field2839 & 0xFF0000L) == 16711680L, Statics.field1350);
                                }
                                Statics.field2571.method3363();
                                if (Statics.field1350) {
                                    class156.field2559--;
                                } else {
                                    class156.field2565--;
                                }
                                class156.field2568 = 0;
                                Statics.field2571 = null;
                                Statics.field2076 = null;
                            } else {
                                if (class156.field2568 != 512) {
                                    break;
                                }
                                class156.field2568 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2570.method1371();
                } catch (Exception var34) {
                }
                class156.field2562++;
                Statics.field2570 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method344();
        }
    }

    @ObfuscatedName("client.x(I)V")
    public void method344() {
        if (class156.field2577 >= 4) {
            this.method1431("js5crc");
            field487 = 1000;
            return;
        }
        if (class156.field2562 >= 4) {
            if (field487 <= 5) {
                this.method1431("js5io");
                field487 = 1000;
                return;
            }
            field672 = 3000;
            class156.field2562 = 3;
        }
        if (--field672 + 1 > 0) {
            return;
        }
        try {
            if (field508 == 0) {
                Statics.field2482 = Statics.field1483.method1512(Statics.field2579, Statics.field2072);
                field508++;
            }
            if (field508 == 1) {
                if (Statics.field2482.field1430 == 2) {
                    this.method377(-1);
                    return;
                }
                if (Statics.field2482.field1430 == 1) {
                    field508++;
                }
            }
            if (field508 == 2) {
                Statics.field1989 = new class71((Socket) Statics.field2482.field1429, Statics.field1483);
                class128 var1 = new class128(5);
                var1.method2449(15);
                var1.method2452(43);
                Statics.field1989.method1372(var1.field2050, 0, 5);
                field508++;
                Statics.field2598 = class122.method195();
            }
            if (field508 == 3) {
                if (field487 <= 5 || Statics.field1989.method1373() > 0) {
                    int var2 = Statics.field1989.method1376();
                    if (var2 != 0) {
                        this.method377(var2);
                        return;
                    }
                    field508++;
                } else if (class122.method195() - Statics.field2598 > 30000L) {
                    this.method377(-2);
                    return;
                }
            }
            if (field508 == 4) {
                Statics.method2324(Statics.field1989, field487 > 20);
                Statics.field2482 = null;
                Statics.field1989 = null;
                field508 = 0;
                field506 = 0;
            }
        } catch (IOException var4) {
            this.method377(-3);
        }
    }

    @ObfuscatedName("client.w(II)V")
    public void method377(int arg0) {
        Statics.field2482 = null;
        Statics.field1989 = null;
        field508 = 0;
        if (Statics.field2072 == Statics.field1693) {
            Statics.field2072 = Statics.field1034;
        } else {
            Statics.field2072 = Statics.field1693;
        }
        field506++;
        if (field506 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field487 <= 5) {
                this.method1431("js5connect_full");
                field487 = 1000;
            } else {
                field672 = 3000;
            }
        } else if (field506 >= 2 && arg0 == 6) {
            this.method1431("js5connect_outofdate");
            field487 = 1000;
        } else if (field506 >= 4) {
            if (field487 <= 5) {
                this.method1431("js5connect");
                field487 = 1000;
            } else {
                field672 = 3000;
            }
        }
    }

    @ObfuscatedName("t.p(I)V")
    public static void method210() {
        if (field507 == 0) {
            Statics.field192 = new class96(4, 104, 104, class9.field122);
            for (int var0 = 0; var0 < 4; var0++) {
                field540[var0] = new class131(104, 104);
            }
            Statics.field1125 = new class87(512, 512);
            class22.field331 = class137.field2132;
            class22.field318 = 5;
            field507 = 20;
        } else if (field507 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class105.field1794[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class96.method1913(var1, 500, 800, 512, 334);
            class22.field331 = class137.field2133;
            class22.field318 = 10;
            field507 = 30;
        } else if (field507 == 30) {
            Statics.field757 = method2359(0, false, true, true);
            Statics.field1808 = method2359(1, false, true, true);
            Statics.field374 = method2359(2, true, false, true);
            Statics.field510 = method2359(3, false, true, true);
            Statics.field1037 = method2359(4, false, true, true);
            Statics.field343 = method2359(5, true, true, true);
            Statics.field2033 = method2359(6, true, true, false);
            Statics.field679 = method2359(7, false, true, true);
            Statics.field713 = method2359(8, false, true, true);
            Statics.field2486 = method2359(9, false, true, true);
            Statics.field60 = method2359(10, false, true, true);
            Statics.field310 = method2359(11, false, true, true);
            Statics.field1326 = method2359(12, false, true, true);
            Statics.field1815 = method2359(13, true, false, true);
            Statics.field1472 = method2359(14, false, true, false);
            Statics.field142 = method2359(15, false, true, true);
            class22.field331 = class137.field2166;
            class22.field318 = 20;
            field507 = 40;
        } else if (field507 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field757.method3140() * 4 / 100;
            int var8 = var7 + Statics.field1808.method3140() * 4 / 100;
            int var9 = var8 + Statics.field374.method3140() * 2 / 100;
            int var10 = var9 + Statics.field510.method3140() * 2 / 100;
            int var11 = var10 + Statics.field1037.method3140() * 6 / 100;
            int var12 = var11 + Statics.field343.method3140() * 4 / 100;
            int var13 = var12 + Statics.field2033.method3140() * 2 / 100;
            int var14 = var13 + Statics.field679.method3140() * 60 / 100;
            int var15 = var14 + Statics.field713.method3140() * 2 / 100;
            int var16 = var15 + Statics.field2486.method3140() * 2 / 100;
            int var17 = var16 + Statics.field60.method3140() * 2 / 100;
            int var18 = var17 + Statics.field310.method3140() * 2 / 100;
            int var19 = var18 + Statics.field1326.method3140() * 2 / 100;
            int var20 = var19 + Statics.field1815.method3140() * 2 / 100;
            int var21 = var20 + Statics.field1472.method3140() * 2 / 100;
            int var22 = var21 + Statics.field142.method3140() * 2 / 100;
            if (var22 == 100) {
                class22.field331 = class137.field2136;
                class22.field318 = 30;
                field507 = 45;
            } else {
                if (var22 != 0) {
                    class22.field331 = class137.field2135 + var22 + "%";
                }
                class22.field318 = 30;
            }
        } else if (field507 == 45) {
            boolean var23 = !field485;
            Statics.field2014 = 22050;
            Statics.field1104 = var23;
            Statics.field2856 = 2;
            class144 var24 = new class144();
            var24.method2814(9, 128);
            Statics.field236 = class53.method147(Statics.field1483, Statics.field1230, 0, 22050);
            Statics.field236.method1152(var24);
            Statics.method149(Statics.field142, Statics.field1472, Statics.field1037, var24);
            Statics.field925 = class53.method147(Statics.field1483, Statics.field1230, 1, 2048);
            Statics.field875 = new class47();
            Statics.field925.method1152(Statics.field875);
            Statics.field2118 = new class63(22050, Statics.field2014);
            class22.field331 = class137.field2137;
            class22.field318 = 35;
            field507 = 50;
        } else if (field507 == 50) {
            int var25 = 0;
            if (Statics.field257 == null) {
                Statics.field257 = class85.method1868(Statics.field713, Statics.field1815, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field204 == null) {
                Statics.field204 = class85.method1868(Statics.field713, Statics.field1815, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field1767 == null) {
                Statics.field1767 = class85.method1868(Statics.field713, Statics.field1815, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class22.field331 = class137.field2138 + var25 * 100 / 3 + "%";
                class22.field318 = 40;
            } else {
                Statics.field188 = new class154(true);
                class22.field331 = class137.field2139;
                class22.field318 = 40;
                field507 = 60;
            }
        } else if (field507 == 60) {
            int var26 = class22.method196(Statics.field60, Statics.field713);
            int var27 = class22.method2767();
            if (var26 < var27) {
                class22.field331 = class137.field2152 + var26 * 100 / var27 + "%";
                class22.field318 = 50;
            } else {
                class22.field331 = class137.field2141;
                class22.field318 = 50;
                method882(5);
                field507 = 70;
            }
        } else if (field507 == 70) {
            if (Statics.field374.method3047()) {
                class157 var28 = Statics.field374;
                Statics.field946 = var28;
                class34.method595(Statics.field374);
                class37.method3(Statics.field374, Statics.field679);
                class157 var29 = Statics.field374;
                class157 var30 = Statics.field679;
                boolean var31 = field485;
                Statics.field822 = var29;
                Statics.field813 = var30;
                class33.field859 = var31;
                class157 var32 = Statics.field374;
                class157 var33 = Statics.field679;
                Statics.field2750 = var32;
                Statics.field775 = var33;
                class41.method754(Statics.field374, Statics.field679, field484, Statics.field257);
                class157 var34 = Statics.field374;
                class157 var35 = Statics.field757;
                class157 var36 = Statics.field1808;
                Statics.field896 = var34;
                Statics.field884 = var35;
                Statics.field885 = var36;
                class36.method1680(Statics.field374, Statics.field679);
                class157 var37 = Statics.field374;
                Statics.field970 = var37;
                class157 var38 = Statics.field374;
                Statics.field1044 = var38;
                Statics.field1045 = Statics.field1044.method3084(16);
                class157 var39 = Statics.field510;
                class157 var40 = Statics.field679;
                class157 var41 = Statics.field713;
                class157 var42 = Statics.field1815;
                Statics.field2742 = var39;
                Statics.field2687 = var40;
                Statics.field2715 = var41;
                Statics.field2722 = var42;
                Statics.field2626 = new class161[Statics.field2742.method3054()][];
                Statics.field2860 = new boolean[Statics.field2742.method3054()];
                class42.method58(Statics.field374);
                class157 var43 = Statics.field374;
                Statics.field983 = var43;
                class22.field331 = class137.field2143;
                class22.field318 = 60;
                field507 = 80;
            } else {
                class22.field331 = class137.field2154 + Statics.field374.method3144() + "%";
                class22.field318 = 60;
            }
        } else if (field507 == 80) {
            int var44 = 0;
            if (Statics.field377 == null) {
                Statics.field377 = class85.method134(Statics.field713, "compass", "");
            } else {
                var44++;
            }
            if (Statics.field557 == null) {
                Statics.field557 = class85.method134(Statics.field713, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field973 == null) {
                Statics.field973 = class85.method192(Statics.field713, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field2369 == null) {
                Statics.field2369 = class85.method1488(Statics.field713, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field135 == null) {
                Statics.field135 = class85.method1488(Statics.field713, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field966 == null) {
                Statics.field966 = class85.method1488(Statics.field713, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field989 == null) {
                Statics.field989 = class85.method1488(Statics.field713, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field103 == null) {
                Statics.field103 = class85.method1488(Statics.field713, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field362 == null) {
                Statics.field362 = class85.method1488(Statics.field713, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field10 == null) {
                Statics.field10 = class85.method1488(Statics.field713, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field379 == null) {
                Statics.field379 = class85.method1488(Statics.field713, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field349 == null) {
                Statics.field349 = class85.method192(Statics.field713, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field356 == null) {
                Statics.field356 = class85.method192(Statics.field713, "mod_icons", "");
            } else {
                var44++;
            }
            if (Statics.field59 == null) {
                Statics.field59 = Statics.method568(Statics.field713, "mapback", "");
            } else {
                var44++;
            }
            if (var44 < 14) {
                class22.field331 = class137.field2300 + var44 * 100 / 14 + "%";
                class22.field318 = 70;
            } else {
                Statics.field2870 = Statics.field356;
                Statics.field557.method1690();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                for (int var49 = 0; var49 < Statics.field2369.length; var49++) {
                    Statics.field2369[var49].method1716(var45 + var48, var46 + var48, var47 + var48);
                }
                Statics.field973[0].method1781(var45 + var48, var46 + var48, var47 + var48);
                method209();
                class22.field331 = class137.field2145;
                class22.field318 = 70;
                field507 = 90;
            }
        } else if (field507 == 90) {
            if (Statics.field2486.method3047()) {
                class111 var50 = new class111(Statics.field2486, Statics.field713, 20, 0.8D, field485 ? 64 : 128);
                class105.method2143(var50);
                class105.method2144(0.8D);
                class22.field331 = class137.field2147;
                class22.field318 = 90;
                field507 = 110;
            } else {
                class22.field331 = class137.field2146 + Statics.field2486.method3144() + "%";
                class22.field318 = 90;
            }
        } else if (field507 == 110) {
            Statics.field2019 = new class16();
            Statics.field1483.method1495(Statics.field2019, 10);
            class22.field331 = class137.field2148;
            class22.field318 = 94;
            field507 = 120;
        } else if (field507 == 120) {
            if (Statics.field60.method3060("huffman", "")) {
                class121 var51 = new class121(Statics.field60.method3059("huffman", ""));
                class186.method858(var51);
                class22.field331 = class137.field2150;
                class22.field318 = 96;
                field507 = 130;
            } else {
                class22.field331 = class137.field2267 + "%";
                class22.field318 = 96;
            }
        } else if (field507 == 130) {
            if (!Statics.field510.method3047()) {
                class22.field331 = class137.field2337 + Statics.field510.method3144() * 4 / 5 + "%";
                class22.field318 = 100;
            } else if (!Statics.field1326.method3047()) {
                class22.field331 = class137.field2337 + (80 + Statics.field1326.method3144() / 6) + "%";
                class22.field318 = 100;
            } else if (Statics.field1815.method3047()) {
                class22.field331 = class137.field2222;
                class22.field318 = 100;
                field507 = 140;
            } else {
                class22.field331 = class137.field2337 + (96 + Statics.field1815.method3144() / 20) + "%";
                class22.field318 = 100;
            }
        } else if (field507 == 140) {
            method882(10);
        }
    }

    @ObfuscatedName("dw.z(IZZZB)Lfv;")
    public static class157 method2359(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class72 var4 = null;
        if (class83.field1453 != null) {
            var4 = new class72(arg0, class83.field1453, Statics.field1455[arg0], 1000000);
        }
        return new class157(var4, Statics.field48, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("t.h(I)V")
    public static void method209() {
        Statics.field1766 = new int[33];
        Statics.field104 = new int[33];
        Statics.field1288 = new int[151];
        Statics.field755 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field59.field1499[Statics.field59.field1498 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1766[var0] = var1;
            Statics.field104[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field59.field1499[Statics.field59.field1498 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1288[var4 - 5] = var5 - 25;
            Statics.field755[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("cq.a(B)V")
    public static final void method2048() {
        try {
            if (field514 == 0) {
                if (Statics.field275 != null) {
                    Statics.field275.method1371();
                    Statics.field275 = null;
                }
                Statics.field180 = null;
                field532 = false;
                field515 = 0;
                field514 = 1;
            }
            if (field514 == 1) {
                if (Statics.field180 == null) {
                    Statics.field180 = Statics.field1483.method1512(Statics.field2579, Statics.field2072);
                }
                if (Statics.field180.field1430 == 2) {
                    throw new IOException();
                }
                if (Statics.field180.field1430 == 1) {
                    Statics.field275 = new class71((Socket) Statics.field180.field1429, Statics.field1483);
                    Statics.field180 = null;
                    field514 = 2;
                }
            }
            if (field514 == 2) {
                field689.field2048 = 0;
                field689.method2449(14);
                Statics.field275.method1372(field689.field2050, 0, 1);
                field523.field2048 = 0;
                field514 = 3;
            }
            if (field514 == 3) {
                if (Statics.field236 != null) {
                    Statics.field236.method1162();
                }
                if (Statics.field925 != null) {
                    Statics.field925.method1162();
                }
                int var0 = Statics.field275.method1376();
                if (Statics.field236 != null) {
                    Statics.field236.method1162();
                }
                if (Statics.field925 != null) {
                    Statics.field925.method1162();
                }
                if (var0 != 0) {
                    method2436(var0);
                    return;
                }
                field523.field2048 = 0;
                field514 = 5;
            }
            if (field514 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field689.field2048 = 0;
                field689.method2449(10);
                field689.method2452(var1[0]);
                field689.method2452(var1[1]);
                field689.method2452(var1[2]);
                field689.method2452(var1[3]);
                field689.method2453(0L);
                field689.method2454(class22.field347);
                field689.method2642(class6.field83, class6.field84);
                field522.field2048 = 0;
                if (field487 == 40) {
                    field522.method2449(18);
                } else {
                    field522.method2449(16);
                }
                field522.method2529(0);
                int var2 = field522.field2048;
                field522.method2452(43);
                field522.method2480(field689.field2050, 0, field689.field2048);
                int var3 = field522.field2048;
                field522.method2454(class22.field342);
                field522.method2449(field485 ? 1 : 0);
                class83.method148(field522);
                class128 var4 = new class128(Statics.field188.method3035());
                Statics.field188.method3030(var4);
                field522.method2480(var4.field2050, 0, var4.field2050.length);
                field522.method2452(Statics.field757.field2552);
                field522.method2452(Statics.field1808.field2552);
                field522.method2452(Statics.field374.field2552);
                field522.method2452(Statics.field510.field2552);
                field522.method2452(Statics.field1037.field2552);
                field522.method2452(Statics.field343.field2552);
                field522.method2452(Statics.field2033.field2552);
                field522.method2452(Statics.field679.field2552);
                field522.method2452(Statics.field713.field2552);
                field522.method2452(Statics.field2486.field2552);
                field522.method2452(Statics.field60.field2552);
                field522.method2452(Statics.field310.field2552);
                field522.method2452(Statics.field1326.field2552);
                field522.method2452(Statics.field1815.field2552);
                field522.method2452(Statics.field1472.field2552);
                field522.method2452(Statics.field142.field2552);
                field522.method2479(var1, var3, field522.field2048);
                field522.method2459(field522.field2048 - var2);
                Statics.field275.method1372(field522.field2050, 0, field522.field2048);
                field689.method2353(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field523.method2353(var1);
                field514 = 6;
            }
            if (field514 == 6 && Statics.field275.method1373() > 0) {
                int var6 = Statics.field275.method1376();
                if (var6 == 21 && field487 == 20) {
                    field514 = 7;
                } else if (var6 == 2) {
                    field514 = 9;
                } else if (var6 == 15 && field487 == 40) {
                    method567();
                    return;
                } else if (var6 == 23 && field584 < 1) {
                    field584++;
                    field514 = 0;
                } else {
                    method2436(var6);
                    return;
                }
            }
            if (field514 == 7 && Statics.field275.method1373() > 0) {
                field687 = (Statics.field275.method1376() + 3) * 60;
                field514 = 8;
            }
            if (field514 == 8) {
                field515 = 0;
                class22.method1875(class137.field2153, class137.field2193, field687 / 60 + class137.field2188);
                if (--field687 <= 0) {
                    field514 = 0;
                }
            } else {
                if (field514 == 9 && Statics.field275.method1373() >= 8) {
                    field511 = Statics.field275.method1376();
                    field648 = Statics.field275.method1376() == 1;
                    field700 = Statics.field275.method1376();
                    field700 <<= 0x8;
                    field700 += Statics.field275.method1376();
                    field623 = Statics.field275.method1376();
                    Statics.field275.method1374(field523.field2050, 0, 1);
                    field523.field2048 = 0;
                    field525 = field523.method2336();
                    Statics.field275.method1374(field523.field2050, 0, 2);
                    field523.field2048 = 0;
                    field684 = field523.method2473();
                    if (field623 == 1) {
                        try {
                            client var7 = Statics.field477;
                            JSObject.getWindow(var7).call("zap", (Object[]) null);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            client var9 = Statics.field477;
                            JSObject.getWindow(var9).call("unzap", (Object[]) null);
                        } catch (Throwable var12) {
                        }
                    }
                    field514 = 10;
                }
                if (field514 != 10) {
                    field515++;
                    if (field515 > 2000) {
                        if (field584 < 1) {
                            if (Statics.field2072 == Statics.field1693) {
                                Statics.field2072 = Statics.field1034;
                            } else {
                                Statics.field2072 = Statics.field1693;
                            }
                            field584++;
                            field514 = 0;
                        } else {
                            method2436(-3);
                        }
                    }
                } else if (Statics.field275.method1373() >= field684) {
                    field523.field2048 = 0;
                    Statics.field275.method1374(field523.field2050, 0, field684);
                    method656();
                    Statics.field265 = -1;
                    method2442(false);
                    field525 = -1;
                }
            }
        } catch (IOException var14) {
            if (field584 < 1) {
                if (Statics.field2072 == Statics.field1693) {
                    Statics.field2072 = Statics.field1034;
                } else {
                    Statics.field2072 = Statics.field1693;
                }
                field584++;
                field514 = 0;
            } else {
                method2436(-2);
            }
        }
    }

    @ObfuscatedName("ay.c(B)V")
    public static void method656() {
        field490 = -1L;
        field610 = -1;
        Statics.field2019.field245 = 0;
        Statics.field217 = true;
        field494 = true;
        field704 = -1L;
        class184.field2853 = new class179();
        field689.field2048 = 0;
        field523.field2048 = 0;
        field525 = -1;
        field529 = -1;
        field530 = -1;
        field509 = -1;
        field653 = 0;
        field496 = 0;
        field528 = 0;
        field497 = 0;
        field685 = 0;
        field622 = false;
        class78.field1413 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field694[var0] = null;
        }
        field695 = 0;
        field634 = 0;
        field636 = false;
        field702 = 0;
        field544 = (int) (Math.random() * 100.0D) - 50;
        field546 = (int) (Math.random() * 110.0D) - 55;
        field476 = (int) (Math.random() * 80.0D) - 40;
        field551 = (int) (Math.random() * 120.0D) - 60;
        field553 = (int) (Math.random() * 30.0D) - 20;
        field565 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field566 = 0;
        field707 = -1;
        field570 = 0;
        field531 = 0;
        field601 = 0;
        field519 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field600[var1] = null;
            field605[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field518[var2] = null;
        }
        Statics.field1683 = field600[2047] = new class3();
        field616.method3333();
        field489.method3333();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field614[var3][var4][var5] = null;
                }
            }
        }
        field615 = new class179();
        field561 = 0;
        field732 = 0;
        field736 = 0;
        for (int var6 = 0; var6 < Statics.field1045; var6++) {
            class43 var7 = class43.method562(var6);
            if (var7 != null && var7.field1047 == 0) {
                class162.field2741[var6] = 0;
                class162.field2740[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field674.length; var8++) {
            field674[var8] = -1;
        }
        if (field640 != -1) {
            int var9 = field640;
            if (var9 != -1 && Statics.field2860[var9]) {
                Statics.field2742.method3055(var9);
                if (Statics.field2626[var9] != null) {
                    boolean var10 = true;
                    for (int var11 = 0; var11 < Statics.field2626[var9].length; var11++) {
                        if (Statics.field2626[var9][var11] != null) {
                            if (Statics.field2626[var9][var11].field2621 == 2) {
                                var10 = false;
                            } else {
                                Statics.field2626[var9][var11] = null;
                            }
                        }
                    }
                    if (var10) {
                        Statics.field2626[var9] = null;
                    }
                    Statics.field2860[var9] = false;
                }
            }
        }
        for (class4 var12 = (class4) field641.method3318(); var12 != null; var12 = (class4) field641.method3321()) {
            method1487(var12, true);
        }
        field640 = -1;
        field641 = new class177(8);
        field644 = null;
        field622 = false;
        field685 = 0;
        field738.method3254((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var13 = 0; var13 < 8; var13++) {
            field611[var13] = null;
            field646[var13] = false;
        }
        class19.method1551();
        field729 = true;
        for (int var14 = 0; var14 < 100; var14++) {
            field683[var14] = true;
        }
        field705 = null;
        Statics.field365 = 0;
        Statics.field24 = null;
    }

    @ObfuscatedName("ax.k(I)V")
    public static void method567() {
        field689.field2048 = 0;
        field523.field2048 = 0;
        field525 = -1;
        field529 = -1;
        field530 = -1;
        field509 = -1;
        field684 = 0;
        field653 = 0;
        field496 = 0;
        field685 = 0;
        field622 = false;
        field566 = 0;
        field570 = 0;
        for (int var0 = 0; var0 < field600.length; var0++) {
            if (field600[var0] != null) {
                field600[var0].field442 = -1;
            }
        }
        for (int var1 = 0; var1 < field518.length; var1++) {
            if (field518[var1] != null) {
                field518[var1].field442 = -1;
            }
        }
        class19.method1551();
        method882(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field683[var2] = true;
        }
    }

    @ObfuscatedName("dx.n(II)V")
    public static void method2436(int arg0) {
        if (arg0 == -3) {
            class22.method1875(class137.field2156, class137.field2333, class137.field2158);
        } else if (arg0 == -2) {
            class22.method1875(class137.field2210, class137.field2160, class137.field2161);
        } else if (arg0 == -1) {
            class22.method1875(class137.field2157, class137.field2173, class137.field2164);
        } else if (arg0 == 3) {
            class22.method1875(class137.field2165, class137.field2331, class137.field2167);
        } else if (arg0 == 4) {
            class22.method1875(class137.field2168, class137.field2240, class137.field2170);
        } else if (arg0 == 5) {
            class22.method1875(class137.field2282, class137.field2172, class137.field2230);
        } else if (arg0 == 6) {
            class22.method1875(class137.field2174, class137.field2175, class137.field2218);
        } else if (arg0 == 7) {
            class22.method1875(class137.field2211, class137.field2178, class137.field2179);
        } else if (arg0 == 8) {
            class22.method1875(class137.field2180, class137.field2181, class137.field2182);
        } else if (arg0 == 9) {
            class22.method1875(class137.field2183, class137.field2253, class137.field2185);
        } else if (arg0 == 10) {
            class22.method1875(class137.field2186, class137.field2187, class137.field2264);
        } else if (arg0 == 11) {
            class22.method1875(class137.field2353, class137.field2239, class137.field2237);
        } else if (arg0 == 12) {
            class22.method1875(class137.field2298, class137.field2171, class137.field2194);
        } else if (arg0 == 13) {
            class22.method1875(class137.field2195, class137.field2342, class137.field2197);
        } else if (arg0 == 14) {
            class22.method1875(class137.field2198, class137.field2199, class137.field2200);
        } else if (arg0 == 16) {
            class22.method1875(class137.field2126, class137.field2189, class137.field2313);
        } else if (arg0 == 17) {
            class22.method1875(class137.field2149, class137.field2134, class137.field2206);
        } else if (arg0 == 18) {
            class22.method1875(class137.field2360, class137.field2290, class137.field2344);
        } else if (arg0 == 19) {
            class22.method1875(class137.field2163, class137.field2299, class137.field2212);
        } else if (arg0 == 20) {
            class22.method1875(class137.field2213, class137.field2208, class137.field2215);
        } else if (arg0 == 22) {
            class22.method1875(class137.field2184, class137.field2217, class137.field2140);
        } else if (arg0 == 23) {
            class22.method1875(class137.field2219, class137.field2227, class137.field2334);
        } else if (arg0 == 24) {
            class22.method1875(class137.field2319, class137.field2223, class137.field2224);
        } else if (arg0 == 25) {
            class22.method1875(class137.field2221, class137.field2226, class137.field2128);
        } else if (arg0 == 26) {
            class22.method1875(class137.field2228, class137.field2229, class137.field2339);
        } else if (arg0 == 27) {
            class22.method1875(class137.field2312, class137.field2232, class137.field2233);
        } else if (arg0 == 31) {
            class22.method1875(class137.field2162, class137.field2241, class137.field2242);
        } else if (arg0 == 32) {
            class22.method1875(class137.field2243, class137.field2244, class137.field2245);
        } else if (arg0 == 37) {
            class22.method1875(class137.field2246, class137.field2247, class137.field2196);
        } else if (arg0 == 38) {
            class22.method1875(class137.field2249, class137.field2250, class137.field2205);
        } else if (arg0 == 55) {
            class22.method1875(class137.field2252, class137.field2220, class137.field2254);
        } else {
            class22.method1875(class137.field2255, class137.field2256, class137.field2257);
        }
        method882(10);
    }

    @ObfuscatedName("u.t(I)V")
    public static final void method54() {
        if (Statics.field275 != null) {
            Statics.field275.method1371();
            Statics.field275 = null;
        }
        method173();
        Statics.field192.method2037();
        for (int var0 = 0; var0 < 4; var0++) {
            field540[var0].method2694();
        }
        System.gc();
        class141.method3226(2);
        field582 = -1;
        field543 = false;
        class7.method263();
        method882(10);
    }

    @ObfuscatedName("c.y(I)V")
    public static final void method173() {
        class38.field956.method3279();
        class34.method162();
        Statics.method1398();
        class33.method1420();
        class32.method2249();
        Statics.method2050();
        class35.method2975();
        class36.field909.method3279();
        class36.field927.method3279();
        class39.field961.method3279();
        class43.method238();
        class166.field2753.method3279();
        class161.field2614.method3279();
        class161.field2615.method3279();
        class161.field2616.method3279();
        ((class111) Statics.field1791).method2242();
        class5.field78.method3279();
        Statics.field757.method3056();
        Statics.field1808.method3056();
        Statics.field510.method3056();
        Statics.field1037.method3056();
        Statics.field343.method3056();
        Statics.field2033.method3056();
        Statics.field679.method3056();
        Statics.field713.method3056();
        Statics.field2486.method3056();
        Statics.field60.method3056();
        Statics.field310.method3056();
        Statics.field1326.method3056();
    }

    @ObfuscatedName("fh.g(I)V")
    public static final void method3270() {
        if (field528 > 0) {
            method54();
        } else {
            method882(40);
            Statics.field2062 = Statics.field275;
            Statics.field275 = null;
        }
    }

    @ObfuscatedName("ce.f(I)V")
    public static final void method1870() {
        if (Statics.field925 != null) {
            Statics.field925.method1153();
        }
        if (Statics.field236 != null) {
            Statics.field236.method1153();
        }
    }

    @ObfuscatedName("dq.j(I)V")
    public static final void method2325() {
        for (int var0 = 0; var0 < field702; var0++) {
            int var10002 = field723[var0]--;
            if (field723[var0] >= -10) {
                class58 var2 = field725[var0];
                if (var2 == null) {
                    class58 var10000 = (class58) null;
                    var2 = class58.method1261(Statics.field1037, field721[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field723[var0] += var2.method1248();
                    field725[var0] = var2;
                }
                if (field723[var0] < 0) {
                    int var9;
                    if (field724[var0] == 0) {
                        var9 = field718;
                    } else {
                        int var3 = (field724[var0] & 0xFF) * 128;
                        int var4 = field724[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1683.field470;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field724[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1683.field419;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field723[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field719 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class64 var10 = var2.method1256().method1313(Statics.field2118);
                        class46 var11 = class46.method957(var10, 100, var9);
                        var11.method1033(field722[var0] - 1);
                        Statics.field875.method1120(var11);
                    }
                    field723[var0] = -100;
                }
            } else {
                field702--;
                for (int var1 = var0; var1 < field702; var1++) {
                    field721[var1] = field721[var1 + 1];
                    field725[var1] = field725[var1 + 1];
                    field722[var1] = field722[var1 + 1];
                    field723[var1] = field723[var1 + 1];
                    field724[var1] = field724[var1 + 1];
                }
                var0--;
            }
        }
        if (field543 && !class141.method2135()) {
            if (field715 != 0 && field582 != -1) {
                class141.method761(Statics.field2033, field582, 0, field715, false);
            }
            field543 = false;
        }
    }

    @ObfuscatedName("bx.af(Lai;IIII)V")
    public static void method1450(class35 arg0, int arg1, int arg2, int arg3) {
        if (field702 >= 50 || field719 == 0 || arg0.field906 == null || arg1 >= arg0.field906.length) {
            return;
        }
        int var4 = arg0.field906[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field721[field702] = var5;
        field722[field702] = var6;
        field723[field702] = 0;
        field725[field702] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field724[field702] = (var8 << 16) + (var9 << 8) + var7;
        field702++;
    }

    @ObfuscatedName("n.ar(IB)V")
    public static void method198(int arg0) {
        if (arg0 == -1 && !field543) {
            Statics.field2381.method2791();
            class141.field2382 = 1;
            Statics.field2380 = null;
        } else if (arg0 != -1 && field582 != arg0 && field715 != 0 && !field543) {
            class157 var1 = Statics.field2033;
            int var2 = field715;
            class141.field2382 = 1;
            Statics.field2380 = var1;
            Statics.field174 = arg0;
            Statics.field118 = 0;
            Statics.field2375 = var2;
            Statics.field86 = false;
            Statics.field2476 = 2;
        }
        field582 = arg0;
    }

    @ObfuscatedName("bs.ax(I)V")
    public static final void method1364() {
        for (int var0 = -1; var0 < field601; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field662[var0];
            }
            class3 var2 = field600[var1];
            if (var2 != null && var2.field475 > 0) {
                var2.field475--;
                if (var2.field475 == 0) {
                    var2.field421 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field519; var3++) {
            int var4 = field603[var3];
            class26 var5 = field518[var4];
            if (var5 != null && var5.field475 > 0) {
                var5.field475--;
                if (var5.field475 == 0) {
                    var5.field421 = null;
                }
            }
        }
    }

    @ObfuscatedName("bu.at(Ljava/lang/String;B)V")
    public static final void method1365(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field247.field181 = !Statics.field247.field181;
            class12.method38();
            if (Statics.field247.field181) {
                method197(99, "", "Roofs are now all hidden");
            } else {
                method197(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field511 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field495 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field495 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method3270();
            }
            if (arg0.equalsIgnoreCase("errortest") && field481 == 2) {
                throw new RuntimeException();
            }
        }
        field689.method2335(113);
        field689.method2449(arg0.length() + 1);
        field689.method2454(arg0);
    }

    @ObfuscatedName("client.ah(I)V")
    public static final void method563() {
        int var0 = Statics.field1305 * 128 + 64;
        int var1 = Statics.field238 * 128 + 64;
        int var2 = method29(var0, var1, Statics.field259) - Statics.field170;
        if (Statics.field903 < var0) {
            Statics.field903 += Statics.field321 * (var0 - Statics.field903) / 1000 + Statics.field384;
            if (Statics.field903 > var0) {
                Statics.field903 = var0;
            }
        }
        if (Statics.field903 > var0) {
            Statics.field903 -= Statics.field321 * (Statics.field903 - var0) / 1000 + Statics.field384;
            if (Statics.field903 < var0) {
                Statics.field903 = var0;
            }
        }
        if (Statics.field50 < var2) {
            Statics.field50 += Statics.field321 * (var2 - Statics.field50) / 1000 + Statics.field384;
            if (Statics.field50 > var2) {
                Statics.field50 = var2;
            }
        }
        if (Statics.field50 > var2) {
            Statics.field50 -= Statics.field321 * (Statics.field50 - var2) / 1000 + Statics.field384;
            if (Statics.field50 < var2) {
                Statics.field50 = var2;
            }
        }
        if (Statics.field1681 < var1) {
            Statics.field1681 += Statics.field321 * (var1 - Statics.field1681) / 1000 + Statics.field384;
            if (Statics.field1681 > var1) {
                Statics.field1681 = var1;
            }
        }
        if (Statics.field1681 > var1) {
            Statics.field1681 -= Statics.field321 * (Statics.field1681 - var1) / 1000 + Statics.field384;
            if (Statics.field1681 < var1) {
                Statics.field1681 = var1;
            }
        }
        int var3 = Statics.field880 * 128 + 64;
        int var4 = Statics.field398 * 128 + 64;
        int var5 = method29(var3, var4, Statics.field259) - Statics.field263;
        int var6 = var3 - Statics.field903;
        int var7 = var5 - Statics.field50;
        int var8 = var4 - Statics.field1681;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field105 < var10) {
            Statics.field105 += Statics.field15 * (var10 - Statics.field105) / 1000 + Statics.field1357;
            if (Statics.field105 > var10) {
                Statics.field105 = var10;
            }
        }
        if (Statics.field105 > var10) {
            Statics.field105 -= Statics.field15 * (Statics.field105 - var10) / 1000 + Statics.field1357;
            if (Statics.field105 < var10) {
                Statics.field105 = var10;
            }
        }
        int var12 = var11 - Statics.field1474;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1474 += Statics.field15 * var12 / 1000 + Statics.field1357;
            Statics.field1474 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1474 -= Statics.field15 * -var12 / 1000 + Statics.field1357;
            Statics.field1474 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1474;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1474 = var11;
        }
    }

    @ObfuscatedName("ew.ay(I)V")
    public static final void method2979() {
        for (int var0 = -1; var0 < field601; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field662[var0];
            }
            class3 var2 = field600[var1];
            if (var2 != null) {
                method1533(var2, 1);
            }
        }
    }

    @ObfuscatedName("bj.ag(I)V")
    public static final void method1542() {
        for (int var0 = 0; var0 < field519; var0++) {
            int var1 = field603[var0];
            class26 var2 = field518[var1];
            if (var2 != null) {
                method1533(var2, var2.field400.field792);
            }
        }
    }

    @ObfuscatedName("bj.ai(Lar;II)V")
    public static final void method1533(class28 arg0, int arg1) {
        if (arg0.field462 > field735) {
            int var2 = arg0.field462 - field735;
            int var3 = arg0.field458 * 128 + arg0.field452 * 64;
            int var4 = arg0.field460 * 128 + arg0.field452 * 64;
            arg0.field470 += (var3 - arg0.field470) / var2;
            arg0.field419 += (var4 - arg0.field419) / var2;
            arg0.field474 = 0;
            if (arg0.field464 == 0) {
                arg0.field467 = 1024;
            }
            if (arg0.field464 == 1) {
                arg0.field467 = 1536;
            }
            if (arg0.field464 == 2) {
                arg0.field467 = 0;
            }
            if (arg0.field464 == 3) {
                arg0.field467 = 512;
            }
        } else if (arg0.field463 >= field735) {
            method36(arg0);
        } else {
            method2735(arg0);
        }
        if (arg0.field470 < 128 || arg0.field419 < 128 || arg0.field470 >= 13184 || arg0.field419 >= 13184) {
            arg0.field459 = -1;
            arg0.field453 = -1;
            arg0.field462 = 0;
            arg0.field463 = 0;
            arg0.field470 = arg0.field471[0] * 128 + arg0.field452 * 64;
            arg0.field419 = arg0.field431[0] * 128 + arg0.field452 * 64;
            arg0.method274();
        }
        if (Statics.field1683 == arg0 && (arg0.field470 < 1536 || arg0.field419 < 1536 || arg0.field470 >= 11776 || arg0.field419 >= 11776)) {
            arg0.field459 = -1;
            arg0.field453 = -1;
            arg0.field462 = 0;
            arg0.field463 = 0;
            arg0.field470 = arg0.field471[0] * 128 + arg0.field452 * 64;
            arg0.field419 = arg0.field431[0] * 128 + arg0.field452 * 64;
            arg0.method274();
        }
        method251(arg0);
        arg0.field428 = false;
        if (arg0.field445 != -1) {
            class35 var5 = class35.method708(arg0.field445);
            if (var5 == null || var5.field901 == null) {
                arg0.field445 = -1;
            } else {
                arg0.field447++;
                if (arg0.field461 < var5.field901.length && arg0.field447 > var5.field890[arg0.field461]) {
                    arg0.field447 = 1;
                    arg0.field461++;
                    method1450(var5, arg0.field461, arg0.field470, arg0.field419);
                }
                if (arg0.field461 >= var5.field901.length) {
                    arg0.field447 = 0;
                    arg0.field461 = 0;
                    method1450(var5, arg0.field461, arg0.field470, arg0.field419);
                }
            }
        }
        if (arg0.field453 != -1 && field735 >= arg0.field456) {
            if (arg0.field454 < 0) {
                arg0.field454 = 0;
            }
            int var6 = Statics.method623(arg0.field453).field913;
            if (var6 == -1) {
                arg0.field453 = -1;
            } else {
                class35 var7 = class35.method708(var6);
                if (var7 == null || var7.field901 == null) {
                    arg0.field453 = -1;
                } else {
                    arg0.field418++;
                    if (arg0.field454 < var7.field901.length && arg0.field418 > var7.field890[arg0.field454]) {
                        arg0.field418 = 1;
                        arg0.field454++;
                        method1450(var7, arg0.field454, arg0.field470, arg0.field419);
                    }
                    if (arg0.field454 >= var7.field901.length && (arg0.field454 < 0 || arg0.field454 >= var7.field901.length)) {
                        arg0.field453 = -1;
                    }
                }
            }
        }
        if (arg0.field459 != -1 && arg0.field451 <= 1) {
            class35 var8 = class35.method708(arg0.field459);
            if (var8.field899 == 1 && arg0.field422 > 0 && arg0.field462 <= field735 && arg0.field463 < field735) {
                arg0.field451 = 1;
                return;
            }
        }
        if (arg0.field459 != -1 && arg0.field451 == 0) {
            class35 var9 = class35.method708(arg0.field459);
            if (var9 == null || var9.field901 == null) {
                arg0.field459 = -1;
            } else {
                arg0.field450++;
                if (arg0.field449 < var9.field901.length && arg0.field450 > var9.field890[arg0.field449]) {
                    arg0.field450 = 1;
                    arg0.field449++;
                    method1450(var9, arg0.field449, arg0.field470, arg0.field419);
                }
                if (arg0.field449 >= var9.field901.length) {
                    arg0.field449 -= var9.field888;
                    arg0.field455++;
                    if (arg0.field455 >= var9.field898) {
                        arg0.field459 = -1;
                    } else if (arg0.field449 >= 0 && arg0.field449 < var9.field901.length) {
                        method1450(var9, arg0.field449, arg0.field470, arg0.field419);
                    } else {
                        arg0.field459 = -1;
                    }
                }
                arg0.field428 = var9.field892;
            }
        }
        if (arg0.field451 > 0) {
            arg0.field451--;
        }
    }

    @ObfuscatedName("s.aw(Lar;I)V")
    public static final void method36(class28 arg0) {
        if (field735 == arg0.field463 || arg0.field459 == -1 || arg0.field451 != 0 || arg0.field450 + 1 > class35.method708(arg0.field459).field890[arg0.field449]) {
            int var1 = arg0.field463 - arg0.field462;
            int var2 = field735 - arg0.field462;
            int var3 = arg0.field458 * 128 + arg0.field452 * 64;
            int var4 = arg0.field460 * 128 + arg0.field452 * 64;
            int var5 = arg0.field452 * 64 + arg0.field446 * 128;
            int var6 = arg0.field452 * 64 + arg0.field425 * 128;
            arg0.field470 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field419 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field474 = 0;
        if (arg0.field464 == 0) {
            arg0.field467 = 1024;
        }
        if (arg0.field464 == 1) {
            arg0.field467 = 1536;
        }
        if (arg0.field464 == 2) {
            arg0.field467 = 0;
        }
        if (arg0.field464 == 3) {
            arg0.field467 = 512;
        }
        arg0.field420 = arg0.field467;
    }

    @ObfuscatedName("ec.am(Lar;I)V")
    public static final void method2735(class28 arg0) {
        arg0.field445 = arg0.field423;
        if (arg0.field466 == 0) {
            arg0.field474 = 0;
            return;
        }
        if (arg0.field459 != -1 && arg0.field451 == 0) {
            class35 var1 = class35.method708(arg0.field459);
            if (arg0.field422 > 0 && var1.field899 == 0) {
                arg0.field474++;
                return;
            }
            if (arg0.field422 <= 0 && var1.field900 == 0) {
                arg0.field474++;
                return;
            }
        }
        int var2 = arg0.field470;
        int var3 = arg0.field419;
        int var4 = arg0.field471[arg0.field466 - 1] * 128 + arg0.field452 * 64;
        int var5 = arg0.field431[arg0.field466 - 1] * 128 + arg0.field452 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field470 = var4;
            arg0.field419 = var5;
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
        int var6 = arg0.field467 - arg0.field420 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field432;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field440;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field429;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field472;
        }
        if (var7 == -1) {
            var7 = arg0.field440;
        }
        arg0.field445 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class26) {
            var9 = ((class26) arg0).field400.field804;
        }
        if (var9) {
            if (arg0.field467 != arg0.field420 && arg0.field442 == -1 && arg0.field469 != 0) {
                var8 = 2;
            }
            if (arg0.field466 > 2) {
                var8 = 6;
            }
            if (arg0.field466 > 3) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field466 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        } else {
            if (arg0.field466 > 1) {
                var8 = 6;
            }
            if (arg0.field466 > 2) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field466 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        }
        if (arg0.field473[arg0.field466 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field445 == arg0.field440 && arg0.field430 != -1) {
            arg0.field445 = arg0.field430;
        }
        if (var2 < var4) {
            arg0.field470 += var8;
            if (arg0.field470 > var4) {
                arg0.field470 = var4;
            }
        } else if (var2 > var4) {
            arg0.field470 -= var8;
            if (arg0.field470 < var4) {
                arg0.field470 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field419 += var8;
            if (arg0.field419 > var5) {
                arg0.field419 = var5;
            }
        } else if (var3 > var5) {
            arg0.field419 -= var8;
            if (arg0.field419 < var5) {
                arg0.field419 = var5;
            }
        }
        if (arg0.field470 == var4 && arg0.field419 == var5) {
            arg0.field466--;
            if (arg0.field422 > 0) {
                arg0.field422--;
            }
        }
    }

    @ObfuscatedName("f.an(Lar;I)V")
    public static final void method251(class28 arg0) {
        if (arg0.field469 == 0) {
            return;
        }
        if (arg0.field442 != -1 && arg0.field442 < 32768) {
            class26 var1 = field518[arg0.field442];
            if (var1 != null) {
                int var2 = arg0.field470 - var1.field470;
                int var3 = arg0.field419 - var1.field419;
                if (var2 != 0 || var3 != 0) {
                    arg0.field467 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field442 >= 32768) {
            int var4 = arg0.field442 - 32768;
            if (field700 == var4) {
                var4 = 2047;
            }
            class3 var5 = field600[var4];
            if (var5 != null) {
                int var6 = arg0.field470 - var5.field470;
                int var7 = arg0.field419 - var5.field419;
                if (var6 != 0 || var7 != 0) {
                    arg0.field467 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field443 != 0 || arg0.field435 != 0) && (arg0.field466 == 0 || arg0.field474 > 0)) {
            int var8 = arg0.field470 - (arg0.field443 * 64 - Statics.field52 * 64 - Statics.field52 * 64);
            int var9 = arg0.field419 - (arg0.field435 * 64 - Statics.field332 * 64 - Statics.field332 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field467 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field443 = 0;
            arg0.field435 = 0;
        }
        int var10 = arg0.field467 - arg0.field420 & 0x7FF;
        if (var10 == 0) {
            arg0.field468 = 0;
            return;
        }
        arg0.field468++;
        if (var10 > 1024) {
            arg0.field420 -= arg0.field469;
            boolean var11 = true;
            if (var10 < arg0.field469 || var10 > 2048 - arg0.field469) {
                arg0.field420 = arg0.field467;
                var11 = false;
            }
            if (arg0.field445 == arg0.field423 && (arg0.field468 > 25 || var11)) {
                if (arg0.field424 == -1) {
                    arg0.field445 = arg0.field440;
                } else {
                    arg0.field445 = arg0.field424;
                }
            }
        } else {
            arg0.field420 += arg0.field469;
            boolean var12 = true;
            if (var10 < arg0.field469 || var10 > 2048 - arg0.field469) {
                arg0.field420 = arg0.field467;
                var12 = false;
            }
            if (arg0.field445 == arg0.field423 && (arg0.field468 > 25 || var12)) {
                if (arg0.field426 == -1) {
                    arg0.field445 = arg0.field440;
                } else {
                    arg0.field445 = arg0.field426;
                }
            }
        }
        arg0.field420 &= 0x7FF;
    }

    @ObfuscatedName("cg.as(Lr;III)V")
    public static void method2136(class3 arg0, int arg1, int arg2) {
        if (arg0.field459 == arg1 && arg1 != -1) {
            int var3 = class35.method708(arg1).field886;
            if (var3 == 1) {
                arg0.field449 = 0;
                arg0.field450 = 0;
                arg0.field451 = arg2;
                arg0.field455 = 0;
            }
            if (var3 == 2) {
                arg0.field455 = 0;
            }
        } else if (arg1 == -1 || arg0.field459 == -1 || class35.method708(arg1).field891 >= class35.method708(arg0.field459).field891) {
            arg0.field459 = arg1;
            arg0.field449 = 0;
            arg0.field450 = 0;
            arg0.field451 = arg2;
            arg0.field455 = 0;
            arg0.field422 = arg0.field466;
        }
    }

    @ObfuscatedName("l.au(Ljava/lang/String;ZB)V")
    public static final void method32(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field204.method3461(arg0, 250);
        int var6 = Statics.field204.method3400(arg0, 250) * 13;
        class90.method1804(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class90.method1806(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field204.method3411(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1279(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method168(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1230.getGraphics();
            Statics.field200.method1632(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1230.repaint();
        }
    }

    @ObfuscatedName("t.aq(IIIIS)V")
    public static final void method233(int arg0, int arg1, int arg2, int arg3) {
        class90.method1798(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class105.method2139();
        field633++;
        method2137(true);
        method2208(true);
        method2137(false);
        method2208(false);
        method898();
        method1356();
        if (!field726) {
            int var4 = field564;
            if (field572 / 256 > var4) {
                var4 = field572 / 256;
            }
            if (field727[4] && field693[4] + 128 > var4) {
                var4 = field693[4] + 128;
            }
            int var5 = field565 + field476 & 0x7FF;
            int var6 = Statics.field1124;
            int var7 = method29(Statics.field1683.field470, Statics.field1683.field419, Statics.field259) - 50;
            int var8 = Statics.field213;
            int var9 = var4 * 3 + 600;
            int var10 = 2048 - var4 & 0x7FF;
            int var11 = 2048 - var5 & 0x7FF;
            int var12 = 0;
            int var13 = 0;
            int var14 = var9;
            if (var10 != 0) {
                int var15 = class105.field1794[var10];
                int var16 = class105.field1795[var10];
                int var17 = var13 * var16 - var9 * var15 >> 16;
                var14 = var13 * var15 + var9 * var16 >> 16;
                var13 = var17;
            }
            if (var11 != 0) {
                int var18 = class105.field1794[var11];
                int var19 = class105.field1795[var11];
                int var20 = var12 * var19 + var14 * var18 >> 16;
                var14 = var14 * var19 - var12 * var18 >> 16;
                var12 = var20;
            }
            Statics.field903 = var6 - var12;
            Statics.field50 = var7 - var13;
            Statics.field1681 = var8 - var14;
            Statics.field105 = var4;
            Statics.field1474 = var5;
        }
        int var21;
        if (field726) {
            int var22;
            if (Statics.field247.field181) {
                var22 = Statics.field259;
            } else {
                int var23 = method29(Statics.field903, Statics.field1681, Statics.field259);
                if (var23 - Statics.field50 >= 800 || (class9.field127[Statics.field259][Statics.field903 >> 7][Statics.field1681 >> 7] & 0x4) == 0) {
                    var22 = 3;
                } else {
                    var22 = Statics.field259;
                }
            }
            var21 = var22;
        } else {
            var21 = method2370();
        }
        int var24 = Statics.field903;
        int var25 = Statics.field50;
        int var26 = Statics.field1681;
        int var27 = Statics.field105;
        int var28 = Statics.field1474;
        for (int var29 = 0; var29 < 5; var29++) {
            if (field727[var29]) {
                int var30 = (int) (Math.random() * (double) (field728[var29] * 2 + 1) - (double) field728[var29] + Math.sin((double) field539[var29] / 100.0D * (double) field731[var29]) * (double) field693[var29]);
                if (var29 == 0) {
                    Statics.field903 += var30;
                }
                if (var29 == 1) {
                    Statics.field50 += var30;
                }
                if (var29 == 2) {
                    Statics.field1681 += var30;
                }
                if (var29 == 3) {
                    Statics.field1474 = Statics.field1474 + var30 & 0x7FF;
                }
                if (var29 == 4) {
                    Statics.field105 += var30;
                    if (Statics.field105 < 128) {
                        Statics.field105 = 128;
                    }
                    if (Statics.field105 > 383) {
                        Statics.field105 = 383;
                    }
                }
            }
        }
        int var31 = class78.field1410;
        int var32 = class78.field1411;
        if (class78.field1416 != 0) {
            var31 = class78.field1417;
            var32 = class78.field1418;
        }
        if (var31 >= arg0 && var31 < arg0 + arg2 && var32 >= arg1 && var32 < arg1 + arg3) {
            class113.field1892 = true;
            class113.field1920 = 0;
            class113.field1918 = var31 - arg0;
            class113.field1919 = var32 - arg1;
        } else {
            class113.field1892 = false;
            class113.field1920 = 0;
        }
        method1870();
        class90.method1804(arg0, arg1, arg2, arg3, 0);
        method1870();
        Statics.field192.method1916(Statics.field903, Statics.field50, Statics.field1681, Statics.field105, Statics.field1474, var21);
        method1870();
        Statics.field192.method1892();
        field573 = 0;
        for (int var33 = -1; var33 < field601 + field519; var33++) {
            class28 var34;
            if (var33 == -1) {
                var34 = Statics.field1683;
            } else if (var33 < field601) {
                var34 = field600[field662[var33]];
            } else {
                var34 = field518[field603[var33 - field601]];
            }
            if (var34 != null && var34.method14()) {
                if (var34 instanceof class26) {
                    class32 var35 = ((class26) var34).field400;
                    if (var35.field784 != null) {
                        var35 = var35.method628();
                    }
                    if (var35 == null) {
                        continue;
                    }
                }
                if (var33 >= field601) {
                    class32 var38 = ((class26) var34).field400;
                    if (var38.field784 != null) {
                        var38 = var38.method628();
                    }
                    if (var38.field780 >= 0 && var38.field780 < Statics.field989.length) {
                        method2768(var34, var34.field434 + 15);
                        if (field585 > -1) {
                            Statics.field989[var38.field780].method1747(field585 + arg0 - 12, field586 + arg1 - 30);
                        }
                    }
                    if (field497 == 1 && field498 == field603[var33 - field601] && field735 % 20 < 10) {
                        method2768(var34, var34.field434 + 15);
                        if (field585 > -1) {
                            Statics.field103[0].method1747(field585 + arg0 - 12, field586 + arg1 - 28);
                        }
                    }
                } else {
                    int var36 = 30;
                    class3 var37 = (class3) var34;
                    if (var37.field33 != -1 || var37.field34 != -1) {
                        method2768(var34, var34.field434 + 15);
                        if (field585 > -1) {
                            if (var37.field33 != -1) {
                                Statics.field966[var37.field33].method1747(field585 + arg0 - 12, field586 + arg1 - var36);
                                var36 += 25;
                            }
                            if (var37.field34 != -1) {
                                Statics.field989[var37.field34].method1747(field585 + arg0 - 12, field586 + arg1 - var36);
                                var36 += 25;
                            }
                        }
                    }
                    if (var33 >= 0 && field497 == 10 && field499 == field662[var33]) {
                        method2768(var34, var34.field434 + 15);
                        if (field585 > -1) {
                            Statics.field103[1].method1747(field585 + arg0 - 12, field586 + arg1 - var36);
                        }
                    }
                }
                if (var34.field421 != null && (var33 >= field601 || field697 == 0 || field697 == 3 || field697 == 1 && method2446(((class3) var34).field47, false))) {
                    method2768(var34, var34.field434);
                    if (field585 > -1 && field573 < field638) {
                        field534[field573] = Statics.field1767.method3393(var34.field421) / 2;
                        field577[field573] = Statics.field1767.field2867;
                        field526[field573] = field585;
                        field575[field573] = field586;
                        field579[field573] = var34.field433;
                        field580[field573] = var34.field436;
                        field581[field573] = var34.field475;
                        field521[field573] = var34.field421;
                        field573++;
                    }
                }
                if (var34.field439 > field735) {
                    method2768(var34, var34.field434 + 15);
                    if (field585 > -1) {
                        int var39 = var34.field427 * 30 / var34.field441;
                        if (var39 > 30) {
                            var39 = 30;
                        } else if (var39 == 0 && var34.field427 > 0) {
                            var39 = 1;
                        }
                        class90.method1804(field585 + arg0 - 15, field586 + arg1 - 3, var39, 5, 65280);
                        class90.method1804(field585 + arg0 - 15 + var39, field586 + arg1 - 3, 30 - var39, 5, 16711680);
                    }
                }
                for (int var40 = 0; var40 < 4; var40++) {
                    if (var34.field438[var40] > field735) {
                        method2768(var34, var34.field434 / 2);
                        if (field585 > -1) {
                            if (var40 == 1) {
                                field586 -= 20;
                            }
                            if (var40 == 2) {
                                field585 -= 15;
                                field586 -= 10;
                            }
                            if (var40 == 3) {
                                field585 += 15;
                                field586 -= 10;
                            }
                            Statics.field135[var34.field437[var40]].method1747(field585 + arg0 - 12, field586 + arg1 - 12);
                            Statics.field257.method3449(Integer.toString(var34.field444[var40]), field585 + arg0 - 1, field586 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var41 = 0; var41 < field573; var41++) {
            int var42 = field526[var41];
            int var43 = field575[var41];
            int var44 = field534[var41];
            int var45 = field577[var41];
            boolean var46 = true;
            while (var46) {
                var46 = false;
                for (int var47 = 0; var47 < var41; var47++) {
                    if (var43 + 2 > field575[var47] - field577[var47] && var43 - var45 < field575[var47] + 2 && var42 - var44 < field534[var47] + field526[var47] && var42 + var44 > field526[var47] - field534[var47] && field575[var47] - field577[var47] < var43) {
                        var43 = field575[var47] - field577[var47];
                        var46 = true;
                    }
                }
            }
            field585 = field526[var41];
            field586 = field575[var41] = var43;
            String var48 = field521[var41];
            if (field642 == 0) {
                int var49 = 16776960;
                if (field579[var41] < 6) {
                    var49 = field696[field579[var41]];
                }
                if (field579[var41] == 6) {
                    var49 = field633 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field579[var41] == 7) {
                    var49 = field633 % 20 < 10 ? 255 : 65535;
                }
                if (field579[var41] == 8) {
                    var49 = field633 % 20 < 10 ? 45056 : 8454016;
                }
                if (field579[var41] == 9) {
                    int var50 = 150 - field581[var41];
                    if (var50 < 50) {
                        var49 = var50 * 1280 + 16711680;
                    } else if (var50 < 100) {
                        var49 = 16776960 - (var50 - 50) * 327680;
                    } else if (var50 < 150) {
                        var49 = (var50 - 100) * 5 + 65280;
                    }
                }
                if (field579[var41] == 10) {
                    int var51 = 150 - field581[var41];
                    if (var51 < 50) {
                        var49 = var51 * 5 + 16711680;
                    } else if (var51 < 100) {
                        var49 = 16711935 - (var51 - 50) * 327680;
                    } else if (var51 < 150) {
                        var49 = (var51 - 100) * 327680 + 255 - (var51 - 100) * 5;
                    }
                }
                if (field579[var41] == 11) {
                    int var52 = 150 - field581[var41];
                    if (var52 < 50) {
                        var49 = 16777215 - var52 * 327685;
                    } else if (var52 < 100) {
                        var49 = (var52 - 50) * 327685 + 65280;
                    } else if (var52 < 150) {
                        var49 = 16777215 - (var52 - 100) * 327680;
                    }
                }
                if (field580[var41] == 0) {
                    Statics.field1767.method3449(var48, field585 + arg0, field586 + arg1, var49, 0);
                }
                if (field580[var41] == 1) {
                    Statics.field1767.method3389(var48, field585 + arg0, field586 + arg1, var49, 0, field633);
                }
                if (field580[var41] == 2) {
                    Statics.field1767.method3403(var48, field585 + arg0, field586 + arg1, var49, 0, field633);
                }
                if (field580[var41] == 3) {
                    Statics.field1767.method3404(var48, field585 + arg0, field586 + arg1, var49, 0, field633, 150 - field581[var41]);
                }
                if (field580[var41] == 4) {
                    int var53 = (150 - field581[var41]) * (Statics.field1767.method3393(var48) + 100) / 150;
                    class90.method1799(field585 + arg0 - 50, arg1, field585 + arg0 + 50, arg1 + arg3);
                    Statics.field1767.method3398(var48, field585 + arg0 + 50 - var53, field586 + arg1, var49, 0);
                    class90.method1798(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field580[var41] == 5) {
                    int var54 = 150 - field581[var41];
                    int var55 = 0;
                    if (var54 < 25) {
                        var55 = var54 - 25;
                    } else if (var54 > 125) {
                        var55 = var54 - 125;
                    }
                    class90.method1799(arg0, field586 + arg1 - Statics.field1767.field2867 - 1, arg0 + arg2, field586 + arg1 + 5);
                    Statics.field1767.method3449(var48, field585 + arg0, field586 + arg1 + var55, var49, 0);
                    class90.method1798(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1767.method3449(var48, field585 + arg0, field586 + arg1, 16776960, 0);
            }
        }
        if (field497 == 2) {
            method1866((field500 - Statics.field52 << 7) + field503, (field491 - Statics.field332 << 7) + field714, field502 * 2);
            if (field585 > -1 && field735 % 20 < 10) {
                Statics.field103[0].method1747(field585 + arg0 - 12, field586 + arg1 - 28);
            }
        }
        ((class111) Statics.field1791).method2243(field556);
        if (field590 == 1) {
            Statics.field10[field589 / 100].method1747(field587 - 8, field588 - 8);
        }
        if (field590 == 2) {
            Statics.field10[field589 / 100 + 4].method1747(field587 - 8, field588 - 8);
        }
        method164();
        if (field495) {
            int var56 = arg0 + 512 - 5;
            int var57 = arg1 + 20;
            Statics.field204.method3399("Fps:" + field1337, var56, var57, 16776960, -1);
            int var64 = var57 + 15;
            Runtime var58 = Runtime.getRuntime();
            int var59 = (int) ((var58.totalMemory() - var58.freeMemory()) / 1024L);
            int var60 = 16776960;
            if (var59 > 32768 && field485) {
                var60 = 16711680;
            }
            if (var59 > 65536 && !field485) {
                var60 = 16711680;
            }
            Statics.field204.method3399("Mem:" + var59 + "k", var56, var64, var60, -1);
            var57 = var64 + 15;
        }
        Statics.field903 = var24;
        Statics.field50 = var25;
        Statics.field1681 = var26;
        Statics.field105 = var27;
        Statics.field1474 = var28;
        if (field729) {
            byte var61 = 0;
            int var62 = class156.field2563 + class156.field2559 + var61;
            if (var62 == 0) {
                field729 = false;
            }
        }
        if (field729) {
            class90.method1804(arg0, arg1, arg2, arg3, 0);
            method32(class137.field2129, false);
        }
    }

    @ObfuscatedName("cg.ac(ZI)V")
    public static final void method2137(boolean arg0) {
        if (Statics.field1683.field470 >> 7 == field570 && Statics.field1683.field419 >> 7 == field531) {
            field570 = 0;
        }
        int var1 = field601;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1683;
                var4 = 33538048;
            } else {
                var3 = field600[field662[var2]];
                var4 = field662[var2] << 14;
            }
            if (var3 != null && var3.method14()) {
                var3.field43 = false;
                if ((field485 && field601 > 50 || field601 > 200) && !arg0 && var3.field445 == var3.field423) {
                    var3.field43 = true;
                }
                int var5 = var3.field470 >> 7;
                int var6 = var3.field419 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field53 == null || field735 < var3.field37 || field735 >= var3.field39) {
                        if ((var3.field470 & 0x7F) == 64 && (var3.field419 & 0x7F) == 64) {
                            if (field633 == field670[var5][var6]) {
                                continue;
                            }
                            field670[var5][var6] = field633;
                        }
                        var3.field32 = method29(var3.field470, var3.field419, Statics.field259);
                        Statics.field192.method1889(Statics.field259, var3.field470, var3.field419, var3.field32, 60, var3, var3.field420, var4, var3.field428);
                    } else {
                        var3.field43 = false;
                        var3.field32 = method29(var3.field470, var3.field419, Statics.field259);
                        Statics.field192.method1997(Statics.field259, var3.field470, var3.field419, var3.field32, 60, var3, var3.field420, var4, var3.field44, var3.field45, var3.field46, var3.field31);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dm.ae(ZI)V")
    public static final void method2208(boolean arg0) {
        for (int var1 = 0; var1 < field519; var1++) {
            class26 var2 = field518[field603[var1]];
            int var3 = (field603[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field400.field795 == arg0 && var2.field400.method643()) {
                int var4 = var2.field470 >> 7;
                int var5 = var2.field419 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field452 == 1 && (var2.field470 & 0x7F) == 64 && (var2.field419 & 0x7F) == 64) {
                        if (field633 == field670[var4][var5]) {
                            continue;
                        }
                        field670[var4][var5] = field633;
                    }
                    if (!var2.field400.field789) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field192.method1889(Statics.field259, var2.field470, var2.field419, method29(var2.field470 + (var2.field452 * 64 - 64), var2.field419 + (var2.field452 * 64 - 64), Statics.field259), var2.field452 * 64 - 64 + 60, var2, var2.field420, var3, var2.field428);
                }
            }
        }
    }

    @ObfuscatedName("ac.ad(I)V")
    public static final void method898() {
        for (class10 var0 = (class10) field616.method3339(); var0 != null; var0 = (class10) field616.method3353()) {
            if (Statics.field259 != var0.field143 || field735 > var0.field149) {
                var0.method3363();
            } else if (field735 >= var0.field171) {
                if (var0.field152 > 0) {
                    class26 var1 = field518[var0.field152 - 1];
                    if (var1 != null && var1.field470 >= 0 && var1.field470 < 13312 && var1.field419 >= 0 && var1.field419 < 13312) {
                        var0.method106(var1.field470, var1.field419, method29(var1.field470, var1.field419, var0.field143) - var0.field158, field735);
                    }
                }
                if (var0.field152 < 0) {
                    int var2 = -var0.field152 - 1;
                    class3 var3;
                    if (field700 == var2) {
                        var3 = Statics.field1683;
                    } else {
                        var3 = field600[var2];
                    }
                    if (var3 != null && var3.field470 >= 0 && var3.field470 < 13312 && var3.field419 >= 0 && var3.field419 < 13312) {
                        var0.method106(var3.field470, var3.field419, method29(var3.field470, var3.field419, var0.field143) - var0.field158, field735);
                    }
                }
                var0.method104(field556);
                Statics.field192.method1889(Statics.field259, (int) var0.field148, (int) var0.field147, (int) var0.field156, 60, var0, var0.field162, -1, false);
            }
        }
    }

    @ObfuscatedName("bt.ao(I)V")
    public static final void method1356() {
        for (class20 var0 = (class20) field489.method3339(); var0 != null; var0 = (class20) field489.method3353()) {
            if (Statics.field259 != var0.field285 || var0.field292) {
                var0.method3363();
            } else if (field735 >= var0.field284) {
                var0.method189(field556);
                if (var0.field292) {
                    var0.method3363();
                } else {
                    Statics.field192.method1889(var0.field285, var0.field286, var0.field287, var0.field288, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("da.aj(I)I")
    public static final int method2370() {
        if (Statics.field247.field181) {
            return Statics.field259;
        }
        int var0 = 3;
        if (Statics.field105 < 310) {
            int var1 = Statics.field903 >> 7;
            int var2 = Statics.field1681 >> 7;
            int var3 = Statics.field1683.field470 >> 7;
            int var4 = Statics.field1683.field419 >> 7;
            if ((class9.field127[Statics.field259][var1][var2] & 0x4) != 0) {
                var0 = Statics.field259;
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
                    if ((class9.field127[Statics.field259][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field259;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field127[Statics.field259][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field259;
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
                    if ((class9.field127[Statics.field259][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field259;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field127[Statics.field259][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field259;
                        }
                    }
                }
            }
        }
        if ((class9.field127[Statics.field259][Statics.field1683.field470 >> 7][Statics.field1683.field419 >> 7] & 0x4) != 0) {
            var0 = Statics.field259;
        }
        return var0;
    }

    @ObfuscatedName("z.aa(I)V")
    public static final void method164() {
        field547 = 0;
        int var0 = (Statics.field1683.field470 >> 7) + Statics.field52;
        int var1 = (Statics.field1683.field419 >> 7) + Statics.field332;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field547 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field547 = 1;
        }
        if (field547 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field547 = 0;
        }
    }

    @ObfuscatedName("eh.al(Lar;II)V")
    public static final void method2768(class28 arg0, int arg1) {
        method1866(arg0.field470, arg0.field419, arg1);
    }

    @ObfuscatedName("ce.az(IIII)V")
    public static final void method1866(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field585 = -1;
            field586 = -1;
            return;
        }
        int var3 = method29(arg0, arg1, Statics.field259) - arg2;
        int var4 = arg0 - Statics.field903;
        int var5 = var3 - Statics.field50;
        int var6 = arg1 - Statics.field1681;
        int var7 = class105.field1794[Statics.field105];
        int var8 = class105.field1795[Statics.field105];
        int var9 = class105.field1794[Statics.field1474];
        int var10 = class105.field1795[Statics.field1474];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field585 = (var11 << 9) / var15 + 256;
            field586 = (var14 << 9) / var15 + 167;
        } else {
            field585 = -1;
            field586 = -1;
        }
    }

    @ObfuscatedName("l.av(IIIB)I")
    public static final int method29(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field127[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field122[var5][var3][var4] + class9.field122[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field122[var5][var3][var4 + 1] + class9.field122[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("df.ab(ZI)V")
    public static final void method2442(boolean arg0) {
        field541 = arg0;
        if (!field541) {
            int var1 = field523.method2457();
            int var2 = field523.method2473();
            int var3 = field523.method2457();
            int var4 = field523.method2633();
            int var5 = field523.method2473();
            int var6 = (field684 - field523.field2048) / 16;
            Statics.field2051 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field2051[var7][var8] = field523.method2468();
                }
            }
            Statics.field753 = new int[var6];
            Statics.field1397 = new int[var6];
            Statics.field253 = new int[var6];
            Statics.field818 = new byte[var6][];
            Statics.field2480 = new byte[var6][];
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
                        Statics.field753[var10] = var13;
                        Statics.field1397[var10] = Statics.field343.method3057("m" + var11 + "_" + var12);
                        Statics.field253[var10] = Statics.field343.method3057("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1357(var1, var3, var4, var5, var2);
            return;
        }
        field523.method2345();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field523.method2338(1);
                    if (var17 == 1) {
                        field542[var14][var15][var16] = field523.method2338(26);
                    } else {
                        field542[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field523.method2344();
        int var18 = (field684 - field523.field2048) / 16;
        Statics.field2051 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2051[var19][var20] = field523.method2506();
            }
        }
        int var21 = field523.method2539();
        int var22 = field523.method2519();
        int var23 = field523.method2457();
        int var24 = field523.method2496();
        int var25 = field523.method2457();
        Statics.field753 = new int[var18];
        Statics.field1397 = new int[var18];
        Statics.field253 = new int[var18];
        Statics.field818 = new byte[var18][];
        Statics.field2480 = new byte[var18][];
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
                            if (Statics.field753[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field753[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1397[var26] = Statics.field343.method3057("m" + var35 + "_" + var36);
                            Statics.field253[var26] = Statics.field343.method3057("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1357(var23, var24, var21, var25, var22);
    }

    @ObfuscatedName("bt.ak(IIIIII)V")
    public static final void method1357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field265 == arg0 && Statics.field2597 == arg1 && field578 == arg2 || !field485) {
            return;
        }
        Statics.field265 = arg0;
        Statics.field2597 = arg1;
        field578 = arg2;
        if (!field485) {
            field578 = 0;
        }
        method882(25);
        method32(class137.field2129, true);
        int var5 = Statics.field52;
        int var6 = Statics.field332;
        Statics.field52 = (arg0 - 6) * 8;
        Statics.field332 = (arg1 - 6) * 8;
        int var7 = Statics.field52 - var5;
        int var8 = Statics.field332 - var6;
        int var9 = Statics.field52;
        int var10 = Statics.field332;
        for (int var11 = 0; var11 < 32768; var11++) {
            class26 var12 = field518[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field471[var13] -= var7;
                    var12.field431[var13] -= var8;
                }
                var12.field470 -= var7 * 128;
                var12.field419 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field600[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field471[var16] -= var7;
                    var15.field431[var16] -= var8;
                }
                var15.field470 -= var7 * 128;
                var15.field419 -= var8 * 128;
            }
        }
        Statics.field259 = arg2;
        Statics.field1683.method266(arg3, arg4, false);
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
                        field614[var27][var23][var24] = field614[var27][var25][var26];
                    } else {
                        field614[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class23 var28 = (class23) field615.method3339(); var28 != null; var28 = (class23) field615.method3353()) {
            var28.field352 -= var7;
            var28.field353 -= var8;
            if (var28.field352 < 0 || var28.field353 < 0 || var28.field352 >= 104 || var28.field353 >= 104) {
                var28.method3363();
            }
        }
        if (field570 != 0) {
            field570 -= var7;
            field531 -= var8;
        }
        field702 = 0;
        field726 = false;
        field707 = -1;
        field489.method3333();
        field616.method3333();
    }

    @ObfuscatedName("l.bi(ZI)V")
    public static final void method30(boolean arg0) {
        method1870();
        field527++;
        if (field527 < 50 && !arg0) {
            return;
        }
        field527 = 0;
        if (field532 || Statics.field275 == null) {
            return;
        }
        field689.method2335(12);
        try {
            Statics.field275.method1372(field689.field2050, 0, field689.field2048);
            field689.field2048 = 0;
        } catch (IOException var2) {
            field532 = true;
        }
    }

    @ObfuscatedName("cj.bp(IIIIIB)V")
    public static final void method1643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field192.method1919(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field192.method1908(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1125.field1484;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class33 var13 = Statics.method2776(var12);
            if (var13.field843 == -1) {
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
                class88 var14 = Statics.field973[var13.field843];
                if (var14 != null) {
                    int var15 = (var13.field819 * 4 - var14.field1498) / 2;
                    int var16 = (var13.field830 * 4 - var14.field1502) / 2;
                    var14.method1782(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field830) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field192.method1988(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field192.method1908(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class33 var22 = Statics.method2776(var21);
            if (var22.field843 != -1) {
                class88 var23 = Statics.field973[var22.field843];
                if (var23 != null) {
                    int var24 = (var22.field819 * 4 - var23.field1498) / 2;
                    int var25 = (var22.field830 * 4 - var23.field1502) / 2;
                    var23.method1782(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field830) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1125.field1484;
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
        int var29 = Statics.field192.method1907(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class33 var31 = Statics.method2776(var30);
        if (var31.field843 == -1) {
            return;
        }
        class88 var32 = Statics.field973[var31.field843];
        if (var32 != null) {
            int var33 = (var31.field819 * 4 - var32.field1498) / 2;
            int var34 = (var31.field830 * 4 - var32.field1502) / 2;
            var32.method1782(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field830) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ej.bg(S)V")
    public static final void method3004() {
        if (field525 == 205) {
            int var0 = field523.method2484();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field517[var1];
            int var4 = field523.method2457();
            int var5 = field523.method2539();
            int var6 = (var5 >> 4 & 0x7) + Statics.field1232;
            int var7 = (var5 & 0x7) + Statics.field1274;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                method244(Statics.field259, var6, var7, var3, var4, var1, var2, 0, -1);
            }
            return;
        }
        if (field525 == 57) {
            int var8 = field523.method2457();
            int var9 = field523.method2473();
            int var10 = field523.method2633();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field517[var11];
            int var14 = field523.method2473();
            byte var15 = field523.method2490();
            int var16 = field523.method2531();
            int var17 = (var16 >> 4 & 0x7) + Statics.field1232;
            int var18 = (var16 & 0x7) + Statics.field1274;
            byte var19 = field523.method2635();
            byte var20 = field523.method2492();
            byte var21 = field523.method2464();
            int var22 = field523.method2473();
            class3 var23;
            if (field700 == var9) {
                var23 = Statics.field1683;
            } else {
                var23 = field600[var9];
            }
            if (var23 != null) {
                class33 var24 = Statics.method2776(var22);
                int var25;
                int var26;
                if (var12 == 1 || var12 == 3) {
                    var25 = var24.field830;
                    var26 = var24.field819;
                } else {
                    var25 = var24.field819;
                    var26 = var24.field830;
                }
                int var27 = (var25 >> 1) + var17;
                int var28 = (var25 + 1 >> 1) + var17;
                int var29 = (var26 >> 1) + var18;
                int var30 = (var26 + 1 >> 1) + var18;
                int[][] var31 = class9.field122[Statics.field259];
                int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
                int var33 = (var17 << 7) + (var25 << 6);
                int var34 = (var18 << 7) + (var26 << 6);
                class113 var35 = var24.method659(var11, var12, var31, var33, var32, var34);
                if (var35 != null) {
                    method244(Statics.field259, var17, var18, var13, -1, 0, 0, var14 + 1, var8 + 1);
                    var23.field37 = field735 + var14;
                    var23.field39 = field735 + var8;
                    var23.field53 = var35;
                    var23.field40 = var17 * 128 + var25 * 64;
                    var23.field42 = var18 * 128 + var26 * 64;
                    var23.field41 = var32;
                    if (var21 > var15) {
                        byte var36 = var21;
                        var21 = var15;
                        var15 = var36;
                    }
                    if (var20 > var19) {
                        byte var37 = var20;
                        var20 = var19;
                        var19 = var37;
                    }
                    var23.field44 = var17 + var21;
                    var23.field46 = var15 + var17;
                    var23.field45 = var18 + var20;
                    var23.field31 = var18 + var19;
                }
            }
        }
        if (field525 == 31) {
            int var38 = field523.method2633();
            int var39 = var38 >> 2;
            int var40 = var38 & 0x3;
            int var41 = field517[var39];
            int var42 = field523.method2531();
            int var43 = (var42 >> 4 & 0x7) + Statics.field1232;
            int var44 = (var42 & 0x7) + Statics.field1274;
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                method244(Statics.field259, var43, var44, var41, -1, var39, var40, 0, -1);
            }
        } else if (field525 == 25) {
            int var45 = field523.method2633();
            int var46 = (var45 >> 4 & 0x7) + Statics.field1232;
            int var47 = (var45 & 0x7) + Statics.field1274;
            int var48 = field523.method2519();
            int var49 = field523.method2473();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class17 var50 = new class17();
                var50.field250 = var49;
                var50.field251 = var48;
                if (field614[Statics.field259][var46][var47] == null) {
                    field614[Statics.field259][var46][var47] = new class179();
                }
                field614[Statics.field259][var46][var47].method3334(var50);
                method3259(var46, var47);
            }
        } else if (field525 == 22) {
            int var51 = field523.method2484();
            int var52 = (var51 >> 4 & 0x7) + Statics.field1232;
            int var53 = (var51 & 0x7) + Statics.field1274;
            int var54 = field523.method2633();
            int var55 = var54 >> 2;
            int var56 = var54 & 0x3;
            int var57 = field517[var55];
            int var58 = field523.method2496();
            if (var52 >= 0 && var53 >= 0 && var52 < 103 && var53 < 103) {
                if (var57 == 0) {
                    class97 var59 = Statics.field192.method1900(Statics.field259, var52, var53);
                    if (var59 != null) {
                        int var60 = var59.field1635 >> 14 & 0x7FFF;
                        if (var55 == 2) {
                            var59.field1628 = new class14(var60, 2, var56 + 4, Statics.field259, var52, var53, var58, false, var59.field1628);
                            var59.field1634 = new class14(var60, 2, var56 + 1 & 0x3, Statics.field259, var52, var53, var58, false, var59.field1634);
                        } else {
                            var59.field1628 = new class14(var60, var55, var56, Statics.field259, var52, var53, var58, false, var59.field1628);
                        }
                    }
                }
                if (var57 == 1) {
                    class109 var61 = Statics.field192.method1901(Statics.field259, var52, var53);
                    if (var61 != null) {
                        int var62 = var61.field1827 >> 14 & 0x7FFF;
                        if (var55 == 4 || var55 == 5) {
                            var61.field1826 = new class14(var62, 4, var56, Statics.field259, var52, var53, var58, false, var61.field1826);
                        } else if (var55 == 6) {
                            var61.field1826 = new class14(var62, 4, var56 + 4, Statics.field259, var52, var53, var58, false, var61.field1826);
                        } else if (var55 == 7) {
                            var61.field1826 = new class14(var62, 4, (var56 + 2 & 0x3) + 4, Statics.field259, var52, var53, var58, false, var61.field1826);
                        } else if (var55 == 8) {
                            var61.field1826 = new class14(var62, 4, var56 + 4, Statics.field259, var52, var53, var58, false, var61.field1826);
                            var61.field1822 = new class14(var62, 4, (var56 + 2 & 0x3) + 4, Statics.field259, var52, var53, var58, false, var61.field1822);
                        }
                    }
                }
                if (var57 == 2) {
                    class99 var63 = Statics.field192.method1902(Statics.field259, var52, var53);
                    if (var55 == 11) {
                        var55 = 10;
                    }
                    if (var63 != null) {
                        var63.field1659 = new class14(var63.field1667 >> 14 & 0x7FFF, var55, var56, Statics.field259, var52, var53, var58, false, var63.field1659);
                    }
                }
                if (var57 == 3) {
                    class108 var64 = Statics.field192.method1932(Statics.field259, var52, var53);
                    if (var64 != null) {
                        var64.field1807 = new class14(var64.field1809 >> 14 & 0x7FFF, 22, var56, Statics.field259, var52, var53, var58, false, var64.field1807);
                    }
                }
            }
        } else {
            if (field525 == 74) {
                int var65 = field523.method2531();
                int var66 = (var65 >> 4 & 0x7) + Statics.field1232;
                int var67 = (var65 & 0x7) + Statics.field1274;
                int var68 = field523.method2473();
                int var69 = field523.method2531();
                int var70 = var69 >> 4 & 0xF;
                int var71 = var69 & 0x7;
                int var72 = field523.method2531();
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    int var73 = var70 + 1;
                    if (Statics.field1683.field471[0] >= var66 - var73 && Statics.field1683.field471[0] <= var66 + var73 && Statics.field1683.field431[0] >= var67 - var73 && Statics.field1683.field431[0] <= var67 + var73 && field719 != 0 && var71 > 0 && field702 < 50) {
                        field721[field702] = var68;
                        field722[field702] = var71;
                        field723[field702] = var72;
                        field725[field702] = null;
                        field724[field702] = (var66 << 16) + (var67 << 8) + var70;
                        field702++;
                    }
                }
            }
            if (field525 == 247) {
                int var74 = field523.method2473();
                int var75 = field523.method2484();
                int var76 = (var75 >> 4 & 0x7) + Statics.field1232;
                int var77 = (var75 & 0x7) + Statics.field1274;
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class179 var78 = field614[Statics.field259][var76][var77];
                    if (var78 != null) {
                        for (class17 var79 = (class17) var78.method3339(); var79 != null; var79 = (class17) var78.method3353()) {
                            if ((var74 & 0x7FFF) == var79.field250) {
                                var79.method3363();
                                break;
                            }
                        }
                        if (var78.method3339() == null) {
                            field614[Statics.field259][var76][var77] = null;
                        }
                        method3259(var76, var77);
                    }
                }
            } else if (field525 == 81) {
                int var80 = field523.method2519();
                int var81 = field523.method2539();
                int var82 = (var81 >> 4 & 0x7) + Statics.field1232;
                int var83 = (var81 & 0x7) + Statics.field1274;
                int var84 = field523.method2519();
                int var85 = field523.method2473();
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && field700 != var85) {
                    class17 var86 = new class17();
                    var86.field250 = var84;
                    var86.field251 = var80;
                    if (field614[Statics.field259][var82][var83] == null) {
                        field614[Statics.field259][var82][var83] = new class179();
                    }
                    field614[Statics.field259][var82][var83].method3334(var86);
                    method3259(var82, var83);
                }
            } else if (field525 == 99) {
                int var87 = field523.method2531();
                int var88 = (var87 >> 4 & 0x7) + Statics.field1232;
                int var89 = (var87 & 0x7) + Statics.field1274;
                int var90 = field523.method2473();
                int var91 = field523.method2473();
                int var92 = field523.method2473();
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    class179 var93 = field614[Statics.field259][var88][var89];
                    if (var93 != null) {
                        for (class17 var94 = (class17) var93.method3339(); var94 != null; var94 = (class17) var93.method3353()) {
                            if ((var90 & 0x7FFF) == var94.field250 && var94.field251 == var91) {
                                var94.field251 = var92;
                                break;
                            }
                        }
                        method3259(var88, var89);
                    }
                }
            } else if (field525 == 69) {
                int var95 = field523.method2531();
                int var96 = (var95 >> 4 & 0x7) + Statics.field1232;
                int var97 = (var95 & 0x7) + Statics.field1274;
                int var98 = field523.method2473();
                int var99 = field523.method2531();
                int var100 = field523.method2473();
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    int var101 = var96 * 128 + 64;
                    int var102 = var97 * 128 + 64;
                    class20 var103 = new class20(var98, Statics.field259, var101, var102, method29(var101, var102, Statics.field259) - var99, var100, field735);
                    field489.method3334(var103);
                }
            } else if (field525 == 222) {
                int var104 = field523.method2531();
                int var105 = (var104 >> 4 & 0x7) + Statics.field1232;
                int var106 = (var104 & 0x7) + Statics.field1274;
                int var107 = var105 + field523.method2464();
                int var108 = var106 + field523.method2464();
                int var109 = field523.method2487();
                int var110 = field523.method2473();
                int var111 = field523.method2531() * 4;
                int var112 = field523.method2531() * 4;
                int var113 = field523.method2473();
                int var114 = field523.method2473();
                int var115 = field523.method2531();
                int var116 = field523.method2531();
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
                    int var117 = var105 * 128 + 64;
                    int var118 = var106 * 128 + 64;
                    int var119 = var107 * 128 + 64;
                    int var120 = var108 * 128 + 64;
                    class10 var121 = new class10(var110, Statics.field259, var117, var118, method29(var117, var118, Statics.field259) - var111, field735 + var113, field735 + var114, var115, var116, var109, var112);
                    var121.method106(var119, var120, method29(var119, var120, Statics.field259) - var112, field735 + var113);
                    field616.method3334(var121);
                }
            }
        }
    }

    @ObfuscatedName("f.ba(IIIIIIIIIS)V")
    public static final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class23 var9 = null;
        for (class23 var10 = (class23) field615.method3339(); var10 != null; var10 = (class23) field615.method3353()) {
            if (var10.field350 == arg0 && var10.field352 == arg1 && var10.field353 == arg2 && var10.field351 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class23();
            var9.field350 = arg0;
            var9.field351 = arg3;
            var9.field352 = arg1;
            var9.field353 = arg2;
            method2743(var9);
            field615.method3334(var9);
        }
        var9.field357 = arg4;
        var9.field361 = arg5;
        var9.field358 = arg6;
        var9.field360 = arg7;
        var9.field364 = arg8;
    }

    @ObfuscatedName("er.bf(Ly;B)V")
    public static final void method2743(class23 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field351 == 0) {
            var1 = Statics.field192.method1919(arg0.field350, arg0.field352, arg0.field353);
        }
        if (arg0.field351 == 1) {
            var1 = Statics.field192.method1905(arg0.field350, arg0.field352, arg0.field353);
        }
        if (arg0.field351 == 2) {
            var1 = Statics.field192.method1988(arg0.field350, arg0.field352, arg0.field353);
        }
        if (arg0.field351 == 3) {
            var1 = Statics.field192.method1907(arg0.field350, arg0.field352, arg0.field353);
        }
        if (var1 != 0) {
            int var5 = Statics.field192.method1908(arg0.field350, arg0.field352, arg0.field353, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field354 = var2;
        arg0.field359 = var3;
        arg0.field355 = var4;
    }

    @ObfuscatedName("en.bo(I)V")
    public static final void method2746() {
        for (class23 var0 = (class23) field615.method3339(); var0 != null; var0 = (class23) field615.method3353()) {
            if (var0.field364 > 0) {
                var0.field364--;
            }
            if (var0.field364 == 0) {
                if (var0.field354 >= 0) {
                    int var1 = var0.field354;
                    int var2 = var0.field359;
                    class33 var3 = Statics.method2776(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method683(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method186(var0.field350, var0.field351, var0.field352, var0.field353, var0.field354, var0.field355, var0.field359);
                var0.method3363();
            } else {
                if (var0.field360 > 0) {
                    var0.field360--;
                }
                if (var0.field360 == 0 && var0.field352 >= 1 && var0.field353 >= 1 && var0.field352 <= 102 && var0.field353 <= 102) {
                    if (var0.field357 >= 0) {
                        int var5 = var0.field357;
                        int var6 = var0.field361;
                        class33 var7 = Statics.method2776(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method683(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method186(var0.field350, var0.field351, var0.field352, var0.field353, var0.field357, var0.field358, var0.field361);
                    var0.field360 = -1;
                    if (var0.field357 == var0.field354 && var0.field354 == -1) {
                        var0.method3363();
                    } else if (var0.field357 == var0.field354 && var0.field358 == var0.field355 && var0.field361 == var0.field359) {
                        var0.method3363();
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.bd(IIIIIIII)V")
    public static final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field485 && Statics.field259 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field192.method1919(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field192.method1905(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field192.method1988(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field192.method1907(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field192.method1908(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field192.method1987(arg0, arg2, arg3);
                class33 var15 = Statics.method2776(var12);
                if (var15.field831 != 0) {
                    field540[arg0].method2700(arg2, arg3, var13, var14, var15.field832);
                }
            }
            if (arg1 == 1) {
                Statics.field192.method1896(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field192.method1897(arg0, arg2, arg3);
                class33 var16 = Statics.method2776(var12);
                if (var16.field819 + arg2 > 103 || var16.field819 + arg3 > 103 || var16.field830 + arg2 > 103 || var16.field830 + arg3 > 103) {
                    return;
                }
                if (var16.field831 != 0) {
                    field540[arg0].method2703(arg2, arg3, var16.field819, var16.field830, var14, var16.field832);
                }
            }
            if (arg1 == 3) {
                Statics.field192.method1964(arg0, arg2, arg3);
                class33 var17 = Statics.method2776(var12);
                if (var17.field831 == 1) {
                    field540[arg0].method2702(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field127[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class96 var19 = Statics.field192;
        class131 var20 = field540[arg0];
        class33 var21 = Statics.method2776(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field830;
            var23 = var21.field819;
        } else {
            var22 = var21.field819;
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
        int[][] var28 = class9.field122[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field833 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field856 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class95 var34;
            if (var21.field837 == -1 && var21.field855 == null) {
                var34 = var21.method659(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1893(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field831 == 1) {
                var20.method2697(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class95 var57;
            if (var21.field837 == -1 && var21.field855 == null) {
                var57 = var21.method659(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            if (var57 != null) {
                var19.method1888(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field831 != 0) {
                var20.method2695(arg2, arg3, var22, var23, var21.field832);
            }
        } else if (arg6 >= 12) {
            class95 var35;
            if (var21.field837 == -1 && var21.field855 == null) {
                var35 = var21.method659(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2695(arg2, arg3, var22, var23, var21.field832);
            }
        } else if (arg6 == 0) {
            class95 var36;
            if (var21.field837 == -1 && var21.field855 == null) {
                var36 = var21.method659(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1886(arg0, arg2, arg3, var29, var36, (class95) null, class9.field125[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2724(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 1) {
            class95 var37;
            if (var21.field837 == -1 && var21.field855 == null) {
                var37 = var21.method659(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1886(arg0, arg2, arg3, var29, var37, (class95) null, class9.field128[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2724(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class95 var39;
            class95 var40;
            if (var21.field837 == -1 && var21.field855 == null) {
                var39 = var21.method659(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method659(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field837, true, (class95) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1886(arg0, arg2, arg3, var29, var39, var40, class9.field125[arg5], class9.field125[var38], var32, var33);
            if (var21.field831 != 0) {
                var20.method2724(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 3) {
            class95 var41;
            if (var21.field837 == -1 && var21.field855 == null) {
                var41 = var21.method659(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1886(arg0, arg2, arg3, var29, var41, (class95) null, class9.field128[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2724(arg2, arg3, arg6, arg5, var21.field832);
            }
        } else if (arg6 == 9) {
            class95 var42;
            if (var21.field837 == -1 && var21.field855 == null) {
                var42 = var21.method659(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method2695(arg2, arg3, var22, var23, var21.field832);
            }
        } else if (arg6 == 4) {
            class95 var43;
            if (var21.field837 == -1 && var21.field855 == null) {
                var43 = var21.method659(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var43, (class95) null, class9.field125[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1919(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = Statics.method2776(var45 >> 14 & 0x7FFF).field838;
            }
            class95 var46;
            if (var21.field837 == -1 && var21.field855 == null) {
                var46 = var21.method659(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var46, (class95) null, class9.field125[arg5], 0, class9.field129[arg5] * var44, class9.field132[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1919(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = Statics.method2776(var48 >> 14 & 0x7FFF).field838 / 2;
            }
            class95 var49;
            if (var21.field837 == -1 && var21.field855 == null) {
                var49 = var21.method659(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var49, (class95) null, 256, arg5, class9.field131[arg5] * var47, class9.field130[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class95 var51;
            if (var21.field837 == -1 && var21.field855 == null) {
                var51 = var21.method659(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var51, (class95) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1919(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = Statics.method2776(var53 >> 14 & 0x7FFF).field838 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class95 var55;
            class95 var56;
            if (var21.field837 == -1 && var21.field855 == null) {
                var55 = var21.method659(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method659(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field837, true, (class95) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field837, true, (class95) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field131[arg5] * var52, class9.field130[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ft.bn(III)V")
    public static final void method3259(int arg0, int arg1) {
        class179 var2 = field614[Statics.field259][arg0][arg1];
        if (var2 == null) {
            Statics.field192.method1899(Statics.field259, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3339(); var6 != null; var6 = (class17) var2.method3353()) {
            class41 var7 = class41.method1342(var6.field250);
            long var8 = (long) var7.field1007;
            if (var7.field1006 == 1) {
                var8 = (long) (var6.field251 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field192.method1899(Statics.field259, arg0, arg1);
            return;
        }
        var2.method3335(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3339(); var12 != null; var12 = (class17) var2.method3353()) {
            if (var5.field250 != var12.field250) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field250 != var12.field250 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field192.method2008(Statics.field259, arg0, arg1, method29(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field259), var5, var13, var10, var11);
    }

    @ObfuscatedName("f.bz(I)V")
    public static final void method243() {
        field608 = 0;
        field639 = 0;
        method3002();
        int var0 = field523.method2338(8);
        if (var0 < field601) {
            for (int var1 = var0; var1 < field601; var1++) {
                field609[++field608 - 1] = field662[var1];
            }
        }
        if (var0 > field601) {
            throw new RuntimeException("");
        }
        field601 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field662[var2];
            class3 var4 = field600[var3];
            int var5 = field523.method2338(1);
            if (var5 == 0) {
                field662[++field601 - 1] = var3;
                var4.field465 = field735;
            } else {
                int var6 = field523.method2338(2);
                if (var6 == 0) {
                    field662[++field601 - 1] = var3;
                    var4.field465 = field735;
                    field604[++field639 - 1] = var3;
                } else if (var6 == 1) {
                    field662[++field601 - 1] = var3;
                    var4.field465 = field735;
                    int var7 = field523.method2338(3);
                    var4.method267(var7, false);
                    int var8 = field523.method2338(1);
                    if (var8 == 1) {
                        field604[++field639 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field662[++field601 - 1] = var3;
                    var4.field465 = field735;
                    int var9 = field523.method2338(3);
                    var4.method267(var9, true);
                    int var10 = field523.method2338(3);
                    var4.method267(var10, true);
                    int var11 = field523.method2338(1);
                    if (var11 == 1) {
                        field604[++field639 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field609[++field608 - 1] = var3;
                }
            }
        }
        while (field523.method2349(field684) >= 11) {
            int var12 = field523.method2338(11);
            if (var12 == 2047) {
                break;
            }
            boolean var16 = false;
            if (field600[var12] == null) {
                field600[var12] = new class3();
                if (field605[var12] != null) {
                    field600[var12].method12(field605[var12]);
                }
                var16 = true;
            }
            field662[++field601 - 1] = var12;
            class3 var17 = field600[var12];
            var17.field465 = field735;
            int var18 = field523.method2338(1);
            if (var18 == 1) {
                field604[++field639 - 1] = var12;
            }
            int var19 = field523.method2338(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field523.method2338(5);
            if (var20 > 15) {
                var20 -= 32;
            }
            int var21 = field523.method2338(1);
            int var22 = field613[field523.method2338(3)];
            if (var16) {
                var17.field467 = var17.field420 = var22;
            }
            var17.method266(Statics.field1683.field471[0] + var19, Statics.field1683.field431[0] + var20, var21 == 1);
        }
        field523.method2344();
        method123();
        for (int var13 = 0; var13 < field608; var13++) {
            int var14 = field609[var13];
            if (field735 != field600[var14].field465) {
                field600[var14] = null;
            }
        }
        if (field684 != field523.field2048) {
            throw new RuntimeException(field523.field2048 + class2.field17 + field684);
        }
        for (int var15 = 0; var15 < field601; var15++) {
            if (field600[field662[var15]] == null) {
                throw new RuntimeException(var15 + class2.field17 + field601);
            }
        }
    }

    @ObfuscatedName("ee.bl(S)V")
    public static final void method3002() {
        field523.method2345();
        int var0 = field523.method2338(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field523.method2338(2);
        if (var1 == 0) {
            field604[++field639 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field523.method2338(3);
            Statics.field1683.method267(var2, false);
            int var3 = field523.method2338(1);
            if (var3 == 1) {
                field604[++field639 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field523.method2338(3);
            Statics.field1683.method267(var4, true);
            int var5 = field523.method2338(3);
            Statics.field1683.method267(var5, true);
            int var6 = field523.method2338(1);
            if (var6 == 1) {
                field604[++field639 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field523.method2338(7);
            int var8 = field523.method2338(1);
            if (var8 == 1) {
                field604[++field639 - 1] = 2047;
            }
            Statics.field259 = field523.method2338(2);
            int var9 = field523.method2338(1);
            int var10 = field523.method2338(7);
            Statics.field1683.method266(var7, var10, var9 == 1);
        }
    }

    @ObfuscatedName("m.bq(I)V")
    public static final void method123() {
        for (int var0 = 0; var0 < field639; var0++) {
            int var1 = field604[var0];
            class3 var2 = field600[var1];
            int var3 = field523.method2531();
            if ((var3 & 0x80) != 0) {
                var3 += field523.method2531() << 8;
            }
            if ((var3 & 0x10) != 0) {
                int var4 = field523.method2496();
                int var5 = field523.method2484();
                int var6 = field523.method2484();
                int var7 = field523.field2048;
                if (var2.field47 != null && var2.field38 != null) {
                    boolean var8 = false;
                    if (var5 <= 1 && method664(var2.field47)) {
                        var8 = true;
                    }
                    if (!var8 && field547 == 0) {
                        field505.field2048 = 0;
                        field523.method2474(field505.field2050, 0, var6);
                        field505.field2048 = 0;
                        class128 var9 = field505;
                        String var13;
                        try {
                            int var10 = var9.method2476();
                            if (var10 > 32767) {
                                var10 = 32767;
                            }
                            byte[] var11 = new byte[var10];
                            var9.field2048 += Statics.field2859.method2389(var9.field2050, var9.field2048, var11, 0, var10);
                            String var12 = class152.method37(var11, 0, var10);
                            var13 = var12;
                        } catch (Exception var27) {
                            var13 = "Cabbage";
                        }
                        String var16 = class187.method3460(class150.method1277(var13));
                        var2.field421 = var16.trim();
                        var2.field433 = var4 >> 8;
                        var2.field436 = var4 & 0xFF;
                        var2.field475 = 150;
                        if (var5 == 2 || var5 == 3) {
                            method197(1, class2.method155(1) + var2.field47, var16);
                        } else if (var5 == 1) {
                            method197(1, class2.method155(0) + var2.field47, var16);
                        } else {
                            method197(2, var2.field47, var16);
                        }
                    }
                }
                field523.field2048 = var6 + var7;
            }
            if ((var3 & 0x100) != 0) {
                var2.field453 = field523.method2457();
                int var17 = field523.method2485();
                var2.field457 = var17 >> 16;
                var2.field456 = (var17 & 0xFFFF) + field735;
                var2.field454 = 0;
                var2.field418 = 0;
                if (var2.field456 > field735) {
                    var2.field454 = -1;
                }
                if (var2.field453 == 65535) {
                    var2.field453 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var18 = field523.method2519();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field523.method2484();
                method2136(var2, var18, var19);
            }
            if ((var3 & 0x400) != 0) {
                var2.field458 = field523.method2539();
                var2.field460 = field523.method2539();
                var2.field446 = field523.method2531();
                var2.field425 = field523.method2531();
                var2.field462 = field523.method2473() + field735;
                var2.field463 = field523.method2496() + field735;
                var2.field464 = field523.method2484();
                var2.field466 = 1;
                var2.field422 = 0;
            }
            if ((var3 & 0x40) != 0) {
                int var20 = field523.method2539();
                int var21 = field523.method2531();
                var2.method275(var20, var21, field735);
                var2.field439 = field735 + 300;
                var2.field427 = field523.method2633();
                var2.field441 = field523.method2633();
            }
            if ((var3 & 0x20) != 0) {
                var2.field443 = field523.method2496();
                var2.field435 = field523.method2457();
            }
            if ((var3 & 0x1) != 0) {
                var2.field442 = field523.method2519();
                if (var2.field442 == 65535) {
                    var2.field442 = -1;
                }
            }
            if ((var3 & 0x200) != 0) {
                int var22 = field523.method2633();
                int var23 = field523.method2539();
                var2.method275(var22, var23, field735);
                var2.field439 = field735 + 300;
                var2.field427 = field523.method2531();
                var2.field441 = field523.method2539();
            }
            if ((var3 & 0x2) != 0) {
                int var24 = field523.method2484();
                byte[] var25 = new byte[var24];
                class128 var26 = new class128(var25);
                field523.method2509(var25, 0, var24);
                field605[var1] = var26;
                var2.method12(var26);
            }
            if ((var3 & 0x8) != 0) {
                var2.field421 = field523.method2618();
                if (var2.field421.charAt(0) == '~') {
                    var2.field421 = var2.field421.substring(1);
                    method197(2, var2.field47, var2.field421);
                } else if (Statics.field1683 == var2) {
                    method197(2, var2.field47, var2.field421);
                }
                var2.field433 = 0;
                var2.field436 = 0;
                var2.field475 = 150;
            }
        }
    }

    @ObfuscatedName("bo.bb(IIIIB)V")
    public static final void method1279(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field681; var4++) {
            if (field688[var4] + field686[var4] > arg0 && field686[var4] < arg0 + arg2 && field720[var4] + field675[var4] > arg1 && field720[var4] < arg1 + arg3) {
                field683[var4] = true;
            }
        }
    }

    @ObfuscatedName("a.bt(IIIII)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field681; var4++) {
            if (field688[var4] + field686[var4] > arg0 && field686[var4] < arg0 + arg2 && field720[var4] + field675[var4] > arg1 && field720[var4] < arg1 + arg3) {
                field516[var4] = true;
            }
        }
    }

    @ObfuscatedName("d.br(IIB)V")
    public static final void method40(int arg0, int arg1) {
        int var2 = Statics.field1767.method3393(class137.field2262);
        for (int var3 = 0; var3 < field685; var3++) {
            int var4 = Statics.field1767.method3393(method2732(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field685 * 15 + 21;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > 765) {
            var6 = 765 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field622 = true;
        Statics.field137 = var6;
        Statics.field1291 = var7;
        Statics.field1401 = var2;
        Statics.field175 = field685 * 15 + 22;
    }

    @ObfuscatedName("ax.bs(II)Z")
    public static final boolean method565(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field626[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("k.bu(II)V")
    public static final void method194(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field667[arg0];
        int var2 = field625[arg0];
        int var3 = field626[arg0];
        int var4 = field627[arg0];
        String var5 = field677[arg0];
        String var6 = field652[arg0];
        method2400(var1, var2, var3, var4, var5, var6, class78.field1417, class78.field1418);
    }

    @ObfuscatedName("dc.bv(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method2400(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1005) {
            class161 var8 = class161.method3039(arg1);
            if (var8 == null || var8.field2663[arg0] < 100000) {
                field689.method2335(32);
                field689.method2494(arg3);
            } else {
                method197(27, "", var8.field2663[arg0] + " x " + class41.method1342(arg3).field993);
            }
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 25) {
            class161 var9 = class161.method2331(arg1, arg0);
            if (var9 != null) {
                method1343();
                int var12 = method559(var9);
                int var13 = var12 >> 11 & 0x3F;
                method2134(arg1, arg0, var13);
                field634 = 0;
                int var14 = method559(var9);
                int var15 = var14 >> 11 & 0x3F;
                String var16;
                if (var15 == 0) {
                    var16 = null;
                } else if (var9.field2633 == null || var9.field2633.trim().length() == 0) {
                    var16 = null;
                } else {
                    var16 = var9.field2633;
                }
                field647 = var16;
                if (field647 == null) {
                    field647 = "Null";
                }
                if (var9.field2618) {
                    field597 = var9.field2672 + class2.method1593(16777215);
                } else {
                    field597 = class2.method1593(65280) + var9.field2628 + class2.method1593(16777215);
                }
            }
            return;
        }
        if (arg2 == 23) {
            Statics.field192.method1915(Statics.field259, arg0, arg1);
        }
        if (arg2 == 33) {
            field689.method2335(230);
            field689.method2529(arg3);
            field689.method2470(arg0);
            field689.method2502(arg1);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 47) {
            class3 var17 = field600[arg3];
            if (var17 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(64);
                field689.method2449(class76.field1390[82] ? 1 : 0);
                field689.method2470(arg3);
            }
        }
        if (arg2 == 2) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(49);
            field689.method2470(field637);
            field689.method2470(Statics.field332 + arg1);
            field689.method2503(Statics.field2015);
            field689.method2449(class76.field1390[82] ? 1 : 0);
            field689.method2628(Statics.field52 + arg0);
            field689.method2529(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 12) {
            class26 var18 = field518[arg3];
            if (var18 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(87);
                field689.method2449(class76.field1390[82] ? 1 : 0);
                field689.method2628(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class161 var19 = class161.method2331(arg1, arg0);
            if (var19 != null) {
                if (var19.field2706 != null) {
                    class1 var20 = new class1();
                    var20.field3 = var19;
                    var20.field8 = arg3;
                    var20.field1 = arg5;
                    var20.field6 = var19.field2706;
                    class27.method1310(var20);
                }
                boolean var21 = true;
                if (var19.field2680 > 0) {
                    var21 = method113(var19);
                }
                if (var21 && class165.method1312(method559(var19), arg3 - 1)) {
                    if (arg3 == 1) {
                        field689.method2335(73);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 2) {
                        field689.method2335(0);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 3) {
                        field689.method2335(159);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 4) {
                        field689.method2335(246);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 5) {
                        field689.method2335(102);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 6) {
                        field689.method2335(149);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 7) {
                        field689.method2335(114);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 8) {
                        field689.method2335(204);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 9) {
                        field689.method2335(112);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                    if (arg3 == 10) {
                        field689.method2335(7);
                        field689.method2452(arg1);
                        field689.method2529(arg0);
                    }
                }
            }
        }
        if (arg2 == 48) {
            class3 var22 = field600[arg3];
            if (var22 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(91);
                field689.method2481(class76.field1390[82] ? 1 : 0);
                field689.method2470(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var23 = field600[arg3];
            if (var23 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(92);
                field689.method2529(arg3);
                field689.method2529(Statics.field2039);
                field689.method2470(Statics.field1324);
                field689.method2573(class76.field1390[82] ? 1 : 0);
                field689.method2505(Statics.field269);
            }
        }
        if (arg2 == 37) {
            field689.method2335(67);
            field689.method2494(arg3);
            field689.method2505(arg1);
            field689.method2494(arg0);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 1) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(248);
            field689.method2449(class76.field1390[82] ? 1 : 0);
            field689.method2529(arg3 >> 14 & 0x7FFF);
            field689.method2529(Statics.field332 + arg1);
            field689.method2494(Statics.field2039);
            field689.method2503(Statics.field269);
            field689.method2529(Statics.field1324);
            field689.method2470(Statics.field52 + arg0);
        }
        if (arg2 == 36) {
            field689.method2335(41);
            field689.method2505(arg1);
            field689.method2470(arg3);
            field689.method2494(arg0);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 28) {
            field689.method2335(11);
            field689.method2452(arg1);
            class161 var24 = class161.method3039(arg1);
            if (var24.field2737 != null && var24.field2737[0][0] == 5) {
                int var25 = var24.field2737[0][1];
                class162.field2740[var25] = 1 - class162.field2740[var25];
                method821(var25);
            }
        }
        if (arg2 == 10) {
            class26 var26 = field518[arg3];
            if (var26 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(85);
                field689.method2628(arg3);
                field689.method2481(class76.field1390[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class26 var27 = field518[arg3];
            if (var27 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(211);
                field689.method2494(arg3);
                field689.method2503(Statics.field2015);
                field689.method2481(class76.field1390[82] ? 1 : 0);
                field689.method2529(field637);
            }
        }
        if (arg2 == 6) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(151);
            field689.method2470(Statics.field332 + arg1);
            field689.method2470(arg3 >> 14 & 0x7FFF);
            field689.method2573(class76.field1390[82] ? 1 : 0);
            field689.method2628(Statics.field52 + arg0);
        }
        if (arg2 == 17) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(164);
            field689.method2494(Statics.field332 + arg1);
            field689.method2470(Statics.field52 + arg0);
            field689.method2470(field637);
            field689.method2547(class76.field1390[82] ? 1 : 0);
            field689.method2628(arg3);
            field689.method2502(Statics.field2015);
        }
        if (arg2 == 1001) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(27);
            field689.method2573(class76.field1390[82] ? 1 : 0);
            field689.method2628(arg3 >> 14 & 0x7FFF);
            field689.method2470(Statics.field332 + arg1);
            field689.method2494(Statics.field52 + arg0);
        }
        if (arg2 == 18) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(240);
            field689.method2494(Statics.field52 + arg0);
            field689.method2573(class76.field1390[82] ? 1 : 0);
            field689.method2494(arg3);
            field689.method2529(Statics.field332 + arg1);
        }
        if (arg2 == 40) {
            field689.method2335(6);
            field689.method2470(arg0);
            field689.method2503(arg1);
            field689.method2470(arg3);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 13) {
            class26 var28 = field518[arg3];
            if (var28 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(163);
                field689.method2449(class76.field1390[82] ? 1 : 0);
                field689.method2628(arg3);
            }
        }
        if (arg2 == 42) {
            field689.method2335(78);
            field689.method2503(arg1);
            field689.method2628(arg3);
            field689.method2628(arg0);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 1004) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field689.method2335(32);
            field689.method2494(arg3);
        }
        if (arg2 == 58) {
            field689.method2335(210);
            field689.method2505(arg1);
            field689.method2470(arg0);
            field689.method2503(Statics.field2015);
            field689.method2494(field637);
        }
        if (arg2 == 1003) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            class26 var29 = field518[arg3];
            if (var29 != null) {
                class32 var30 = var29.field400;
                if (var30.field784 != null) {
                    var30 = var30.method628();
                }
                if (var30 != null) {
                    field689.method2335(187);
                    field689.method2628(var30.field771);
                }
            }
        }
        if (arg2 == 15) {
            class3 var31 = field600[arg3];
            if (var31 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(22);
                field689.method2628(field637);
                field689.method2449(class76.field1390[82] ? 1 : 0);
                field689.method2529(arg3);
                field689.method2452(Statics.field2015);
            }
        }
        if (arg2 == 32) {
            field689.method2335(131);
            field689.method2470(field637);
            field689.method2494(arg3);
            field689.method2452(arg1);
            field689.method2503(Statics.field2015);
            field689.method2529(arg0);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 34) {
            field689.method2335(200);
            field689.method2470(arg0);
            field689.method2505(arg1);
            field689.method2628(arg3);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 49) {
            class3 var32 = field600[arg3];
            if (var32 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(243);
                field689.method2573(class76.field1390[82] ? 1 : 0);
                field689.method2628(arg3);
            }
        }
        if (arg2 == 16) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(36);
            field689.method2503(Statics.field269);
            field689.method2449(class76.field1390[82] ? 1 : 0);
            field689.method2628(Statics.field332 + arg1);
            field689.method2529(Statics.field52 + arg0);
            field689.method2470(Statics.field2039);
            field689.method2628(arg3);
            field689.method2628(Statics.field1324);
        }
        if (arg2 == 38) {
            method1343();
            class161 var33 = class161.method3039(arg1);
            field634 = 1;
            Statics.field2039 = arg0;
            Statics.field269 = arg1;
            Statics.field1324 = arg3;
            method610(var33);
            field635 = class2.method1593(16748608) + class41.method1342(arg3).field993 + class2.method1593(16777215);
            if (field635 == null) {
                field635 = "null";
            }
            return;
        }
        if (arg2 == 7) {
            class26 var34 = field518[arg3];
            if (var34 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(194);
                field689.method2449(class76.field1390[82] ? 1 : 0);
                field689.method2628(Statics.field1324);
                field689.method2505(Statics.field269);
                field689.method2529(Statics.field2039);
                field689.method2470(arg3);
            }
        }
        if (arg2 == 5) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(83);
            field689.method2494(Statics.field332 + arg1);
            field689.method2529(Statics.field52 + arg0);
            field689.method2573(class76.field1390[82] ? 1 : 0);
            field689.method2470(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 46) {
            class3 var35 = field600[arg3];
            if (var35 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(25);
                field689.method2481(class76.field1390[82] ? 1 : 0);
                field689.method2470(arg3);
            }
        }
        if (arg2 == 4) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(150);
            field689.method2494(Statics.field332 + arg1);
            field689.method2529(Statics.field52 + arg0);
            field689.method2481(class76.field1390[82] ? 1 : 0);
            field689.method2494(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 45) {
            class3 var36 = field600[arg3];
            if (var36 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(77);
                field689.method2494(arg3);
                field689.method2573(class76.field1390[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field689.method2335(60);
            field689.method2529(arg0);
            field689.method2529(Statics.field1324);
            field689.method2452(arg1);
            field689.method2502(Statics.field269);
            field689.method2628(Statics.field2039);
            field689.method2494(arg3);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 11) {
            class26 var37 = field518[arg3];
            if (var37 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(133);
                field689.method2547(class76.field1390[82] ? 1 : 0);
                field689.method2628(arg3);
            }
        }
        if (arg2 == 22) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(115);
            field689.method2529(Statics.field52 + arg0);
            field689.method2470(arg3);
            field689.method2449(class76.field1390[82] ? 1 : 0);
            field689.method2529(Statics.field332 + arg1);
        }
        if (arg2 == 41) {
            field689.method2335(134);
            field689.method2470(arg0);
            field689.method2452(arg1);
            field689.method2470(arg3);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 26) {
            method116();
        }
        if (arg2 == 50) {
            class3 var38 = field600[arg3];
            if (var38 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(2);
                field689.method2494(arg3);
                field689.method2573(class76.field1390[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(193);
            field689.method2494(Statics.field332 + arg1);
            field689.method2494(arg3 >> 14 & 0x7FFF);
            field689.method2529(Statics.field52 + arg0);
            field689.method2481(class76.field1390[82] ? 1 : 0);
        }
        if (arg2 == 43) {
            field689.method2335(116);
            field689.method2628(arg0);
            field689.method2494(arg3);
            field689.method2503(arg1);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 9) {
            class26 var39 = field518[arg3];
            if (var39 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(108);
                field689.method2470(arg3);
                field689.method2573(class76.field1390[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field689.method2335(199);
            field689.method2494(arg3);
            field689.method2494(arg0);
            field689.method2505(arg1);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (arg2 == 20) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(228);
            field689.method2470(arg3);
            field689.method2529(Statics.field332 + arg1);
            field689.method2529(Statics.field52 + arg0);
            field689.method2547(class76.field1390[82] ? 1 : 0);
        }
        if (arg2 == 19) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(42);
            field689.method2547(class76.field1390[82] ? 1 : 0);
            field689.method2628(Statics.field52 + arg0);
            field689.method2470(arg3);
            field689.method2470(Statics.field332 + arg1);
        }
        if (arg2 == 51) {
            class3 var40 = field600[arg3];
            if (var40 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(121);
                field689.method2547(class76.field1390[82] ? 1 : 0);
                field689.method2470(arg3);
            }
        }
        if (arg2 == 29) {
            field689.method2335(11);
            field689.method2452(arg1);
            class161 var41 = class161.method3039(arg1);
            if (var41.field2737 != null && var41.field2737[0][0] == 5) {
                int var42 = var41.field2737[0][1];
                if (class162.field2740[var42] != var41.field2709[0]) {
                    class162.field2740[var42] = var41.field2709[0];
                    method821(var42);
                }
            }
        }
        if (arg2 == 30 && field644 == null) {
            field689.method2335(39);
            field689.method2503(arg1);
            field689.method2470(arg0);
            field644 = class161.method2331(arg1, arg0);
            method610(field644);
        }
        if (arg2 == 1002) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field689.method2335(63);
            field689.method2529(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 24) {
            class161 var43 = class161.method3039(arg1);
            boolean var44 = true;
            if (var43.field2680 > 0) {
                var44 = method113(var43);
            }
            if (var44) {
                field689.method2335(11);
                field689.method2452(arg1);
            }
        }
        if (arg2 == 21) {
            field587 = arg6;
            field588 = arg7;
            field590 = 2;
            field589 = 0;
            field570 = arg0;
            field531 = arg1;
            field689.method2335(30);
            field689.method2573(class76.field1390[82] ? 1 : 0);
            field689.method2628(Statics.field52 + arg0);
            field689.method2628(Statics.field332 + arg1);
            field689.method2494(arg3);
        }
        if (arg2 == 44) {
            class3 var45 = field600[arg3];
            if (var45 != null) {
                field587 = arg6;
                field588 = arg7;
                field590 = 2;
                field589 = 0;
                field570 = arg0;
                field531 = arg1;
                field689.method2335(97);
                field689.method2470(arg3);
                field689.method2547(class76.field1390[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field689.method2335(31);
            field689.method2529(arg0);
            field689.method2503(arg1);
            field689.method2529(arg3);
            field591 = 0;
            Statics.field348 = class161.method3039(arg1);
            field592 = arg0;
        }
        if (field634 != 0) {
            field634 = 0;
            method610(class161.method3039(Statics.field269));
        }
        if (field636) {
            method1343();
        }
        if (Statics.field348 != null && field591 == 0) {
            method610(Statics.field348);
        }
    }

    @ObfuscatedName("j.bh(ILjava/lang/String;I)V")
    public static void method252(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field601; var3++) {
            class3 var4 = field600[field662[var3]];
            if (var4 != null && var4.field47 != null && var4.field47.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field689.method2335(97);
                    field689.method2470(field662[var3]);
                    field689.method2547(0);
                } else if (arg0 == 4) {
                    field689.method2335(64);
                    field689.method2449(0);
                    field689.method2470(field662[var3]);
                } else if (arg0 == 6) {
                    field689.method2335(243);
                    field689.method2573(0);
                    field689.method2628(field662[var3]);
                } else if (arg0 == 7) {
                    field689.method2335(2);
                    field689.method2494(field662[var3]);
                    field689.method2573(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method197(4, "", class137.field2260 + arg1);
        }
    }

    @ObfuscatedName("cy.be(IIII)V")
    public static void method2134(int arg0, int arg1, int arg2) {
        class161 var3 = class161.method2331(arg0, arg1);
        if (var3 != null && var3.field2697 != null) {
            class1 var4 = new class1();
            var4.field3 = var3;
            var4.field6 = var3.field2697;
            class27.method1310(var4);
        }
        field636 = true;
        Statics.field2015 = arg0;
        field637 = arg1;
        Statics.field960 = arg2;
        method610(var3);
    }

    @ObfuscatedName("bt.bx(I)V")
    public static void method1343() {
        if (!field636) {
            return;
        }
        class161 var0 = class161.method2331(Statics.field2015, field637);
        if (var0 != null && var0.field2698 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field6 = var0.field2698;
            class27.method1310(var1);
        }
        field636 = false;
        method610(var0);
    }

    @ObfuscatedName("p.bm(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method157(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field622 || field685 >= 500) {
            return;
        }
        field677[field685] = arg0;
        field652[field685] = arg1;
        field626[field685] = arg2;
        field627[field685] = arg3;
        field667[field685] = arg4;
        field625[field685] = arg5;
        field685++;
    }

    @ObfuscatedName("eo.bj(IB)Ljava/lang/String;")
    public static String method2732(int arg0) {
        return field652[arg0].length() > 0 ? field677[arg0] + class137.field2271 + field652[arg0] : field677[arg0];
    }

    @ObfuscatedName("dr.bk(IIIII)V")
    public static final void method2330(int arg0, int arg1, int arg2, int arg3) {
        if (field634 == 0 && !field636) {
            method157(class137.field2266, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class113.field1920; var5++) {
            int var6 = class113.field1885[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field192.method1908(Statics.field259, var7, var8, var6) >= 0) {
                    class33 var11 = Statics.method2776(var10);
                    if (var11.field855 != null) {
                        var11 = var11.method662();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field634 == 1) {
                        method157(class137.field2190, field635 + " " + class2.field20 + " " + class2.method1593(65535) + var11.field844, 1, var6, var7, var8);
                    } else if (!field636) {
                        String[] var12 = var11.field841;
                        if (field650) {
                            var12 = method2766(var12);
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
                                    method157(var12[var13], class2.method1593(65535) + var11.field844, var14, var6, var7, var8);
                                }
                            }
                        }
                        method157(class137.field2351, class2.method1593(65535) + var11.field844, 1002, var11.field821 << 14, var7, var8);
                    } else if ((Statics.field960 & 0x4) == 4) {
                        method157(field647, field597 + " " + class2.field20 + " " + class2.method1593(65535) + var11.field844, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class26 var15 = field518[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field400.field792 == 1 && (var15.field470 & 0x7F) == 64 && (var15.field419 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field519; var16++) {
                            class26 var17 = field518[field603[var16]];
                            if (var17 != null && var15 != var17 && var17.field400.field792 == 1 && var15.field470 == var17.field470 && var15.field419 == var17.field419) {
                                method2662(var17.field400, field603[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field601; var18++) {
                            class3 var19 = field600[field662[var18]];
                            if (var19 != null && var15.field470 == var19.field470 && var15.field419 == var19.field419) {
                                method1641(var19, field662[var18], var7, var8);
                            }
                        }
                    }
                    method2662(var15.field400, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field600[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field470 & 0x7F) == 64 && (var20.field419 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field519; var21++) {
                            class26 var22 = field518[field603[var21]];
                            if (var22 != null && var22.field400.field792 == 1 && var20.field470 == var22.field470 && var20.field419 == var22.field419) {
                                method2662(var22.field400, field603[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field601; var23++) {
                            class3 var24 = field600[field662[var23]];
                            if (var24 != null && var20 != var24 && var20.field470 == var24.field470 && var20.field419 == var24.field419) {
                                method1641(var24, field662[var23], var7, var8);
                            }
                        }
                    }
                    method1641(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class179 var25 = field614[Statics.field259][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3340(); var26 != null; var26 = (class17) var25.method3342()) {
                            class41 var27 = class41.method1342(var26.field250);
                            if (field634 == 1) {
                                method157(class137.field2190, field635 + " " + class2.field20 + " " + class2.method1593(16748608) + var27.field993, 16, var26.field250, var7, var8);
                            } else if (!field636) {
                                String[] var28 = var27.field1021;
                                if (field650) {
                                    var28 = method2766(var28);
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
                                        method157(var28[var29], class2.method1593(16748608) + var27.field993, var30, var26.field250, var7, var8);
                                    } else if (var29 == 2) {
                                        method157(class137.field2123, class2.method1593(16748608) + var27.field993, 20, var26.field250, var7, var8);
                                    }
                                }
                                method157(class137.field2351, class2.method1593(16748608) + var27.field993, 1004, var26.field250, var7, var8);
                            } else if ((Statics.field960 & 0x1) == 1) {
                                method157(field647, field597 + " " + class2.field20 + " " + class2.method1593(16748608) + var27.field993, 17, var26.field250, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.bw(Lap;IIII)V")
    public static final void method2662(class32 arg0, int arg1, int arg2, int arg3) {
        if (field685 >= 400) {
            return;
        }
        if (arg0.field784 != null) {
            arg0 = arg0.method628();
        }
        if (arg0 == null || !arg0.field789) {
            return;
        }
        String var4 = arg0.field785;
        if (arg0.field773 != 0) {
            int var6 = arg0.field773;
            int var7 = Statics.field1683.field35;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1593(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1593(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1593(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1593(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1593(65280);
            } else if (var8 > 6) {
                var9 = class2.method1593(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1593(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1593(12648192);
            } else {
                var9 = class2.method1593(16776960);
            }
            var4 = var4 + var9 + " " + class2.field18 + class137.field2330 + arg0.field773 + class2.field19;
        }
        if (field634 == 1) {
            method157(class137.field2190, field635 + " " + class2.field20 + " " + class2.method1593(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field636) {
            String[] var10 = arg0.field790;
            if (field650) {
                var10 = method2766(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class137.field2155)) {
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
                        method157(var10[var11], class2.method1593(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class137.field2155)) {
                        short var14 = 0;
                        if (arg0.field773 > Statics.field1683.field35) {
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
                        method157(var10[var13], class2.method1593(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method157(class137.field2351, class2.method1593(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field960 & 0x2) == 2) {
            method157(field647, field597 + " " + class2.field20 + " " + class2.method1593(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cj.cv(Lr;IIII)V")
    public static final void method1641(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1683 == arg0 || field685 >= 400) {
            return;
        }
        String var9;
        if (arg0.field36 == 0) {
            String var4 = arg0.field47;
            int var5 = arg0.field35;
            int var6 = Statics.field1683.field35;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1593(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1593(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1593(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1593(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1593(65280);
            } else if (var7 > 6) {
                var8 = class2.method1593(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1593(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1593(12648192);
            } else {
                var8 = class2.method1593(16776960);
            }
            var9 = var4 + var8 + " " + class2.field18 + class137.field2330 + arg0.field35 + class2.field19;
        } else {
            var9 = arg0.field47 + " " + class2.field18 + class137.field2268 + arg0.field36 + class2.field19;
        }
        if (field634 == 1) {
            method157(class137.field2190, field635 + " " + class2.field20 + " " + class2.method1593(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field636) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field611[var10] != null) {
                    short var11 = 0;
                    if (field611[var10].equalsIgnoreCase(class137.field2155)) {
                        if (arg0.field35 > Statics.field1683.field35) {
                            var11 = 2000;
                        }
                        if (Statics.field1683.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field1683.field49 == arg0.field49) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field646[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field698[var10] + var11;
                    method157(field611[var10], class2.method1593(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field960 & 0x8) == 8) {
            method157(field647, field597 + " " + class2.field20 + " " + class2.method1593(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field685; var14++) {
            if (field626[var14] == 23) {
                field652[var14] = class2.method1593(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ar.cm(IIIIIIIII)V")
    public static final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class161.method199(arg0)) {
            Statics.field277 = null;
            method41(Statics.field2626[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field277 != null) {
                method41(Statics.field277, -1412584499, arg1, arg2, arg3, arg4, Statics.field1458, Statics.field140, arg7);
                Statics.field277 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field683[var8] = true;
            }
        } else {
            field683[arg7] = true;
        }
    }

    @ObfuscatedName("d.cb([Lfg;IIIIIIIII)V")
    public static final void method41(class161[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class90.method1798(arg2, arg3, arg4, arg5);
        class105.method2139();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class161 var10 = arg0[var9];
            if (var10 != null && (var10.field2713 == arg1 || arg1 == -1412584499 && field651 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field686[field681] = var10.field2624 + arg6;
                    field720[field681] = var10.field2674 + arg7;
                    field688[field681] = var10.field2734;
                    field675[field681] = var10.field2629;
                    var11 = ++field681 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2704 = var11;
                var10.field2735 = field735;
                if (!var10.field2618 || !method112(var10)) {
                    if (var10.field2680 > 0) {
                        method55(var10);
                    }
                    int var12 = var10.field2624 + arg6;
                    int var13 = var10.field2674 + arg7;
                    int var14 = var10.field2691;
                    if (field651 == var10) {
                        if (arg1 != -1412584499 && !var10.field2684) {
                            Statics.field277 = arg0;
                            Statics.field1458 = arg6;
                            Statics.field140 = arg7;
                            continue;
                        }
                        if (field576 && field656) {
                            int var15 = class78.field1410;
                            int var16 = class78.field1411;
                            int var17 = var15 - field478;
                            int var18 = var16 - field654;
                            if (var17 < field568) {
                                var17 = field568;
                            }
                            if (var10.field2734 + var17 > field568 + field520.field2734) {
                                var17 = field568 + field520.field2734 - var10.field2734;
                            }
                            if (var18 < field658) {
                                var18 = field658;
                            }
                            if (var10.field2629 + var18 > field658 + field520.field2629) {
                                var18 = field658 + field520.field2629 - var10.field2629;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2684) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2621 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2621 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2734 + var12;
                        int var26 = var10.field2629 + var13;
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
                        int var29 = var10.field2734 + var12;
                        int var30 = var10.field2629 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2618 || var19 < var21 && var20 < var22) {
                        if (var10.field2680 != 0) {
                            if (var10.field2680 == 1337) {
                                field630 = var12;
                                field669 = var13;
                                method233(var12, var13, var10.field2734, var10.field2629);
                                class90.method1798(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2680 == 1338) {
                                method658(var12, var13, var11);
                                class90.method1798(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2621 == 0) {
                            if (!var10.field2618 && method112(var10) && Statics.field1768 != var10) {
                                continue;
                            }
                            if (!var10.field2618) {
                                if (var10.field2655 > var10.field2635 - var10.field2629) {
                                    var10.field2655 = var10.field2635 - var10.field2629;
                                }
                                if (var10.field2655 < 0) {
                                    var10.field2655 = 0;
                                }
                            }
                            method41(arg0, var10.field2727, var19, var20, var21, var22, var12 - var10.field2632, var13 - var10.field2655, var11);
                            if (var10.field2641 != null) {
                                method41(var10.field2641, var10.field2727, var19, var20, var21, var22, var12 - var10.field2632, var13 - var10.field2655, var11);
                            }
                            class4 var31 = (class4) field641.method3315((long) var10.field2727);
                            if (var31 != null) {
                                method273(var31.field57, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class90.method1798(arg2, arg3, arg4, arg5);
                            class105.method2139();
                        }
                        if (field617[var11] || field690 > 1) {
                            if (var10.field2621 == 0 && !var10.field2618 && var10.field2635 > var10.field2629) {
                                int var32 = var10.field2734 + var12;
                                int var33 = var10.field2655;
                                int var34 = var10.field2629;
                                int var35 = var10.field2635;
                                Statics.field349[0].method1782(var32, var13);
                                Statics.field349[1].method1782(var32, var13 + var34 - 16);
                                class90.method1804(var32, var13 + 16, 16, var34 - 32, field558);
                                int var36 = (var34 - 32) * var34 / var35;
                                if (var36 < 8) {
                                    var36 = 8;
                                }
                                int var37 = (var34 - 32 - var36) * var33 / (var35 - var34);
                                class90.method1804(var32, var13 + 16 + var37, 16, var36, field559);
                                class90.method1855(var32, var13 + 16 + var37, var36, field708);
                                class90.method1855(var32 + 1, var13 + 16 + var37, var36, field708);
                                class90.method1835(var32, var13 + 16 + var37, 16, field708);
                                class90.method1835(var32, var13 + 17 + var37, 16, field708);
                                class90.method1855(var32 + 15, var13 + 16 + var37, var36, field560);
                                class90.method1855(var32 + 14, var13 + 17 + var37, var36 - 1, field560);
                                class90.method1835(var32, var13 + 15 + var37 + var36, 16, field560);
                                class90.method1835(var32 + 1, var13 + 14 + var37 + var36, 15, field560);
                            }
                            if (var10.field2621 != 1) {
                                if (var10.field2621 == 2) {
                                    int var38 = 0;
                                    for (int var39 = 0; var39 < var10.field2629; var39++) {
                                        for (int var40 = 0; var40 < var10.field2734; var40++) {
                                            int var41 = (var10.field2656 + 32) * var40 + var12;
                                            int var42 = (var10.field2673 + 32) * var39 + var13;
                                            if (var38 < 20) {
                                                var41 += var10.field2690[var38];
                                                var42 += var10.field2675[var38];
                                            }
                                            if (var10.field2721[var38] > 0) {
                                                boolean var43 = false;
                                                boolean var44 = false;
                                                int var45 = var10.field2721[var38] - 1;
                                                if (var41 + 32 > arg2 && var41 < arg4 && var42 + 32 > arg3 && var42 < arg5 || Statics.field1191 == var10 && field593 == var38) {
                                                    class87 var46;
                                                    if (field634 == 1 && Statics.field2039 == var38 && Statics.field269 == var10.field2727) {
                                                        var46 = class41.method234(var45, var10.field2663[var38], 2, 0, false);
                                                    } else {
                                                        var46 = class41.method234(var45, var10.field2663[var38], 1, 3153952, false);
                                                    }
                                                    if (var46 == null) {
                                                        method610(var10);
                                                    } else if (Statics.field1191 == var10 && field593 == var38) {
                                                        int var47 = class78.field1410 - field712;
                                                        int var48 = class78.field1411 - field595;
                                                        if (var47 < 5 && var47 > -5) {
                                                            var47 = 0;
                                                        }
                                                        if (var48 < 5 && var48 > -5) {
                                                            var48 = 0;
                                                        }
                                                        if (field598 < 5) {
                                                            var47 = 0;
                                                            var48 = 0;
                                                        }
                                                        var46.method1704(var41 + var47, var42 + var48, 128);
                                                        if (arg1 != -1) {
                                                            class161 var49 = arg0[arg1 & 0xFFFF];
                                                            if (var42 + var48 < class90.field1509 && var49.field2655 > 0) {
                                                                int var50 = field556 * (class90.field1509 - var42 - var48) / 3;
                                                                if (var50 > field556 * 10) {
                                                                    var50 = field556 * 10;
                                                                }
                                                                if (var50 > var49.field2655) {
                                                                    var50 = var49.field2655;
                                                                }
                                                                var49.field2655 -= var50;
                                                                field595 += var50;
                                                                method610(var49);
                                                            }
                                                            if (var42 + var48 + 32 > class90.field1511 && var49.field2655 < var49.field2635 - var49.field2629) {
                                                                int var51 = field556 * (var42 + var48 + 32 - class90.field1511) / 3;
                                                                if (var51 > field556 * 10) {
                                                                    var51 = field556 * 10;
                                                                }
                                                                if (var51 > var49.field2635 - var49.field2629 - var49.field2655) {
                                                                    var51 = var49.field2635 - var49.field2629 - var49.field2655;
                                                                }
                                                                var49.field2655 += var51;
                                                                field595 -= var51;
                                                                method610(var49);
                                                            }
                                                        }
                                                    } else if (Statics.field348 == var10 && field592 == var38) {
                                                        var46.method1704(var41, var42, 128);
                                                    } else {
                                                        var46.method1747(var41, var42);
                                                    }
                                                }
                                            } else if (var10.field2676 != null && var38 < 20) {
                                                class87 var52 = var10.method3183(var38);
                                                if (var52 != null) {
                                                    var52.method1747(var41, var42);
                                                } else if (class161.field2701) {
                                                    method610(var10);
                                                }
                                            }
                                            var38++;
                                        }
                                    }
                                } else if (var10.field2621 == 3) {
                                    int var53;
                                    if (method2398(var10)) {
                                        var53 = var10.field2637;
                                        if (Statics.field1768 == var10 && var10.field2619 != 0) {
                                            var53 = var10.field2619;
                                        }
                                    } else {
                                        var53 = var10.field2636;
                                        if (Statics.field1768 == var10 && var10.field2638 != 0) {
                                            var53 = var10.field2638;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2640) {
                                            class90.method1804(var12, var13, var10.field2734, var10.field2629, var53);
                                        } else {
                                            class90.method1806(var12, var13, var10.field2734, var10.field2629, var53);
                                        }
                                    } else if (var10.field2640) {
                                        class90.method1803(var12, var13, var10.field2734, var10.field2629, var53, 256 - (var14 & 0xFF));
                                    } else {
                                        class90.method1807(var12, var13, var10.field2734, var10.field2629, var53, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2621 == 4) {
                                    class185 var54 = var10.method3182();
                                    if (var54 != null) {
                                        String var55 = var10.field2666;
                                        int var56;
                                        if (method2398(var10)) {
                                            var56 = var10.field2637;
                                            if (Statics.field1768 == var10 && var10.field2619 != 0) {
                                                var56 = var10.field2619;
                                            }
                                            if (var10.field2667.length() > 0) {
                                                var55 = var10.field2667;
                                            }
                                        } else {
                                            var56 = var10.field2636;
                                            if (Statics.field1768 == var10 && var10.field2638 != 0) {
                                                var56 = var10.field2638;
                                            }
                                        }
                                        if (var10.field2618 && var10.field2723 != -1) {
                                            class41 var57 = class41.method1342(var10.field2723);
                                            var55 = var57.field993;
                                            if (var55 == null) {
                                                var55 = "null";
                                            }
                                            if ((var57.field1006 == 1 || var10.field2627 != 1) && var10.field2627 != -1) {
                                                var55 = class2.method1593(16748608) + var55 + class2.field22 + " " + 'x' + method1683(var10.field2627);
                                            }
                                        }
                                        if (field644 == var10) {
                                            class137 var10000 = (class137) null;
                                            var55 = class137.field2122;
                                            var56 = var10.field2636;
                                        }
                                        if (!var10.field2618) {
                                            var55 = method153(var55, var10);
                                        }
                                        var54.method3411(var55, var12, var13, var10.field2734, var10.field2629, var56, var10.field2671 ? 0 : -1, var10.field2669, var10.field2670, var10.field2668);
                                    } else if (class161.field2701) {
                                        method610(var10);
                                    }
                                } else if (var10.field2621 == 5) {
                                    if (var10.field2618) {
                                        class87 var59;
                                        if (var10.field2723 == -1) {
                                            var59 = var10.method3181(false);
                                        } else {
                                            var59 = class41.method234(var10.field2723, var10.field2627, var10.field2703, var10.field2648, false);
                                        }
                                        if (var59 != null) {
                                            int var60 = var59.field1485;
                                            int var61 = var59.field1495;
                                            if (var10.field2646) {
                                                class90.method1799(var12, var13, var10.field2734 + var12, var10.field2629 + var13);
                                                int var62 = (var10.field2734 + (var60 - 1)) / var60;
                                                int var63 = (var10.field2629 + (var61 - 1)) / var61;
                                                for (int var64 = 0; var64 < var62; var64++) {
                                                    for (int var65 = 0; var65 < var63; var65++) {
                                                        if (var10.field2645 != 0) {
                                                            var59.method1687(var60 / 2 + var60 * var64 + var12, var61 / 2 + var61 * var65 + var13, var10.field2645, 4096);
                                                        } else if (var14 == 0) {
                                                            var59.method1747(var60 * var64 + var12, var61 * var65 + var13);
                                                        } else {
                                                            var59.method1704(var60 * var64 + var12, var61 * var65 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class90.method1798(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var66 = var10.field2734 * 4096 / var60;
                                                if (var10.field2645 != 0) {
                                                    var59.method1687(var10.field2734 / 2 + var12, var10.field2629 / 2 + var13, var10.field2645, var66);
                                                } else if (var14 != 0) {
                                                    var59.method1706(var12, var13, var10.field2734, var10.field2629, 256 - (var14 & 0xFF));
                                                } else if (var10.field2734 == var60 && var10.field2629 == var61) {
                                                    var59.method1747(var12, var13);
                                                } else {
                                                    var59.method1700(var12, var13, var10.field2734, var10.field2629);
                                                }
                                            }
                                        } else if (class161.field2701) {
                                            method610(var10);
                                        }
                                    } else {
                                        class87 var58 = var10.method3181(method2398(var10));
                                        if (var58 != null) {
                                            var58.method1747(var12, var13);
                                        } else if (class161.field2701) {
                                            method610(var10);
                                        }
                                    }
                                } else if (var10.field2621 == 6) {
                                    boolean var67 = method2398(var10);
                                    int var68;
                                    if (var67) {
                                        var68 = var10.field2724;
                                    } else {
                                        var68 = var10.field2700;
                                    }
                                    class113 var69 = null;
                                    int var70 = 0;
                                    if (var10.field2723 != -1) {
                                        class41 var71 = class41.method1342(var10.field2723);
                                        if (var71 != null) {
                                            class41 var72 = var71.method835(var10.field2627);
                                            var69 = var72.method872(1);
                                            if (var69 == null) {
                                                method610(var10);
                                            } else {
                                                var69.method2271();
                                                var70 = var69.field1564 / 2;
                                            }
                                        }
                                    } else if (var10.field2651 == 5) {
                                        if (var10.field2652 == 0) {
                                            var69 = field738.method3243((class35) null, -1, (class35) null, -1);
                                        } else {
                                            var69 = Statics.field1683.method26();
                                        }
                                    } else if (var68 == -1) {
                                        var69 = var10.method3209((class35) null, -1, var67, Statics.field1683.field38);
                                        if (var69 == null && class161.field2701) {
                                            method610(var10);
                                        }
                                    } else {
                                        class35 var73 = class35.method708(var68);
                                        var69 = var10.method3209(var73, var10.field2725, var67, Statics.field1683.field38);
                                        if (var69 == null && class161.field2701) {
                                            method610(var10);
                                        }
                                    }
                                    class105.method2160(var10.field2734 / 2 + var12, var10.field2629 / 2 + var13);
                                    int var74 = var10.field2662 * class105.field1794[var10.field2659] >> 16;
                                    int var75 = var10.field2662 * class105.field1795[var10.field2659] >> 16;
                                    if (var69 != null) {
                                        if (var10.field2618) {
                                            var69.method2271();
                                            if (var10.field2664) {
                                                var69.method2273(0, var10.field2660, var10.field2661, var10.field2659, var10.field2657, var10.field2658 + var70 + var74, var10.field2658 + var75, var10.field2662);
                                            } else {
                                                var69.method2315(0, var10.field2660, var10.field2661, var10.field2659, var10.field2657, var10.field2658 + var70 + var74, var10.field2658 + var75);
                                            }
                                        } else {
                                            var69.method2315(0, var10.field2660, 0, var10.field2659, 0, var74, var75);
                                        }
                                    }
                                    class105.method2141();
                                } else {
                                    if (var10.field2621 == 7) {
                                        class185 var76 = var10.method3182();
                                        if (var76 == null) {
                                            if (class161.field2701) {
                                                method610(var10);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var10.field2629; var78++) {
                                            for (int var79 = 0; var79 < var10.field2734; var79++) {
                                                if (var10.field2721[var77] > 0) {
                                                    class41 var80 = class41.method1342(var10.field2721[var77] - 1);
                                                    String var81;
                                                    if (var80.field1006 != 1 && var10.field2663[var77] == 1) {
                                                        var81 = class2.method1593(16748608) + var80.field993 + class2.field22;
                                                    } else {
                                                        var81 = class2.method1593(16748608) + var80.field993 + class2.field22 + " " + 'x' + method1683(var10.field2663[var77]);
                                                    }
                                                    int var82 = (var10.field2656 + 115) * var79 + var12;
                                                    int var83 = (var10.field2673 + 12) * var78 + var13;
                                                    if (var10.field2669 == 0) {
                                                        var76.method3398(var81, var82, var83, var10.field2636, var10.field2671 ? 0 : -1);
                                                    } else if (var10.field2669 == 1) {
                                                        var76.method3449(var81, var10.field2734 / 2 + var82, var83, var10.field2636, var10.field2671 ? 0 : -1);
                                                    } else {
                                                        var76.method3399(var81, var10.field2734 + var82 - 1, var83, var10.field2636, var10.field2671 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var10.field2621 == 8 && Statics.field363 == var10 && field632 == field504) {
                                        int var84 = 0;
                                        int var85 = 0;
                                        class185 var86 = Statics.field204;
                                        String var87 = var10.field2666;
                                        String var88 = method153(var87, var10);
                                        while (var88.length() > 0) {
                                            int var89 = var88.indexOf(class2.field21);
                                            String var90;
                                            if (var89 == -1) {
                                                var90 = var88;
                                                var88 = "";
                                            } else {
                                                var90 = var88.substring(0, var89);
                                                var88 = var88.substring(var89 + 4);
                                            }
                                            int var91 = var86.method3393(var90);
                                            if (var91 > var84) {
                                                var84 = var91;
                                            }
                                            var85 += var86.field2867 + 1;
                                        }
                                        var84 += 6;
                                        var85 += 7;
                                        int var92 = var10.field2734 + var12 - 5 - var84;
                                        int var93 = var10.field2629 + var13 + 5;
                                        if (var92 < var12 + 5) {
                                            var92 = var12 + 5;
                                        }
                                        if (var84 + var92 > arg4) {
                                            var92 = arg4 - var84;
                                        }
                                        if (var85 + var93 > arg5) {
                                            var93 = arg5 - var85;
                                        }
                                        class90.method1804(var92, var93, var84, var85, 16777120);
                                        class90.method1806(var92, var93, var84, var85, 0);
                                        String var94 = var10.field2666;
                                        int var95 = var86.field2867 + var93 + 2;
                                        String var96 = method153(var94, var10);
                                        while (var96.length() > 0) {
                                            int var97 = var96.indexOf(class2.field21);
                                            String var98;
                                            if (var97 == -1) {
                                                var98 = var96;
                                                var96 = "";
                                            } else {
                                                var98 = var96.substring(0, var97);
                                                var96 = var96.substring(var97 + 4);
                                            }
                                            var86.method3398(var98, var92 + 3, var95, 0, -1);
                                            var95 += var86.field2867 + 1;
                                        }
                                    }
                                    if (var10.field2621 == 9) {
                                        if (var10.field2716 == 1) {
                                            class90.method1812(var12, var13, var10.field2734 + var12, var10.field2629 + var13, var10.field2636);
                                        } else {
                                            int var99 = var10.field2734 >= 0 ? var10.field2734 : -var10.field2734;
                                            int var100 = var10.field2629 >= 0 ? var10.field2629 : -var10.field2629;
                                            int var101 = var99;
                                            if (var99 < var100) {
                                                var101 = var100;
                                            }
                                            if (var101 != 0) {
                                                int var102 = (var10.field2734 << 16) / var101;
                                                int var103 = (var10.field2629 << 16) / var101;
                                                if (var103 <= var102) {
                                                    var102 = -var102;
                                                } else {
                                                    var103 = -var103;
                                                }
                                                int var104 = var10.field2716 * var103 >> 17;
                                                int var105 = var10.field2716 * var103 + 1 >> 17;
                                                int var106 = var10.field2716 * var102 >> 17;
                                                int var107 = var10.field2716 * var102 + 1 >> 17;
                                                int var108 = var12 + var104;
                                                int var109 = var12 - var105;
                                                int var110 = var10.field2734 + var12 - var105;
                                                int var111 = var10.field2734 + var12 + var104;
                                                int var112 = var13 + var106;
                                                int var113 = var13 - var107;
                                                int var114 = var10.field2629 + var13 - var107;
                                                int var115 = var10.field2629 + var13 + var106;
                                                class105.method2194(var108, var109, var110);
                                                class105.method2150(var112, var113, var114, var108, var109, var110, var10.field2636);
                                                class105.method2194(var108, var110, var111);
                                                class105.method2150(var112, var114, var115, var108, var110, var111, var10.field2636);
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

    @ObfuscatedName("p.cd(Ljava/lang/String;Lfg;I)Ljava/lang/String;")
    public static String method153(String arg0, class161 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method132(method27(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2475 != null) {
                    int var6 = Statics.field2475.field1433;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field2475.field1429 != null) {
                        var5 = (String) Statics.field2475.field1429;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cn.ch(II)Ljava/lang/String;")
    public static final String method1683(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1593(65408) + var1.substring(0, var1.length() - 8) + class137.field2272 + " " + class2.field18 + var1 + class2.field19 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method1593(16777215) + var1.substring(0, var1.length() - 4) + class137.field2274 + " " + class2.field18 + var1 + class2.field19 + class2.field22;
        } else {
            return " " + class2.method1593(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("m.cj(II)Ljava/lang/String;")
    public static final String method132(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dd.cl(Lfg;B)Z")
    public static final boolean method2398(class161 arg0) {
        if (arg0.field2692 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2692.length; var1++) {
            int var2 = method27(arg0, var1);
            int var3 = arg0.field2709[var1];
            if (arg0.field2692[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2692[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2692[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.cn(Lfg;IS)I")
    public static final int method27(class161 arg0, int arg1) {
        if (arg0.field2737 == null || arg1 >= arg0.field2737.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2737[arg1];
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
                    var7 = field618[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field619[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field620[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class161 var11 = class161.method3039(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class41.method1342(var12).field1025 || field484)) {
                        for (int var13 = 0; var13 < var11.field2721.length; var13++) {
                            if (var12 + 1 == var11.field2721[var13]) {
                                var7 += var11.field2663[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class162.field2740[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class132.field2075[field619[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class162.field2740[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1683.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class132.field2073[var14]) {
                            var7 += field619[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class161 var17 = class161.method3039(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class41.method1342(var18).field1025 || field484)) {
                        for (int var19 = 0; var19 < var17.field2721.length; var19++) {
                            if (var18 + 1 == var17.field2721[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field645;
                }
                if (var6 == 12) {
                    var7 = field574;
                }
                if (var6 == 13) {
                    int var20 = class162.field2740[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class162.method2738(var22);
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
                    var7 = (Statics.field1683.field470 >> 7) + Statics.field52;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1683.field419 >> 7) + Statics.field332;
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

    @ObfuscatedName("cl.cz([Lfg;IIIIIIII)V")
    public static final void method1652(class161[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class161 var9 = arg0[var8];
            if (var9 != null && (!var9.field2618 || var9.field2621 == 0 || var9.field2686 || method559(var9) != 0 || field520 == var9) && var9.field2713 == arg1 && (!var9.field2618 || !method112(var9))) {
                int var10 = var9.field2624 + arg6;
                int var11 = var9.field2674 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2621 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2621 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2734 + var10;
                    int var19 = var9.field2629 + var11;
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
                    int var22 = var9.field2734 + var10;
                    int var23 = var9.field2629 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field651 == var9) {
                    field659 = true;
                    field660 = var10;
                    field661 = var11;
                }
                if (!var9.field2618 || var12 < var14 && var13 < var15) {
                    int var24 = class78.field1410;
                    int var25 = class78.field1411;
                    if (class78.field1416 != 0) {
                        var24 = class78.field1417;
                        var25 = class78.field1418;
                    }
                    if (var9.field2680 == 1337) {
                        method610(var9);
                        if (!field729 && !field622 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2330(var24, var25, var12, var13);
                        }
                    } else if (var9.field2680 != 1338) {
                        if (!field622 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var37 = var24 - var10;
                            int var38 = var25 - var11;
                            if (var9.field2622 == 1) {
                                method157(var9.field2612, "", 24, 0, 0, var9.field2727);
                            }
                            if (var9.field2622 == 2 && !field636) {
                                int var39 = method559(var9);
                                int var40 = var39 >> 11 & 0x3F;
                                String var41;
                                if (var40 == 0) {
                                    var41 = null;
                                } else if (var9.field2633 == null || var9.field2633.trim().length() == 0) {
                                    var41 = null;
                                } else {
                                    var41 = var9.field2633;
                                }
                                if (var41 != null) {
                                    method157(var41, class2.method1593(65280) + var9.field2628, 25, 0, -1, var9.field2727);
                                }
                            }
                            if (var9.field2622 == 3) {
                                method157(class137.field2270, "", 26, 0, 0, var9.field2727);
                            }
                            if (var9.field2622 == 4) {
                                method157(var9.field2612, "", 28, 0, 0, var9.field2727);
                            }
                            if (var9.field2622 == 5) {
                                method157(var9.field2612, "", 29, 0, 0, var9.field2727);
                            }
                            if (var9.field2622 == 6 && field644 == null) {
                                method157(var9.field2612, "", 30, 0, -1, var9.field2727);
                            }
                            if (var9.field2621 == 2) {
                                int var43 = 0;
                                for (int var44 = 0; var44 < var9.field2629; var44++) {
                                    for (int var45 = 0; var45 < var9.field2734; var45++) {
                                        int var46 = (var9.field2656 + 32) * var45;
                                        int var47 = (var9.field2673 + 32) * var44;
                                        if (var43 < 20) {
                                            var46 += var9.field2690[var43];
                                            var47 += var9.field2675[var43];
                                        }
                                        if (var37 >= var46 && var38 >= var47 && var37 < var46 + 32 && var38 < var47 + 32) {
                                            field596 = var43;
                                            Statics.field1404 = var9;
                                            if (var9.field2721[var43] > 0) {
                                                class41 var48 = class41.method1342(var9.field2721[var43] - 1);
                                                if (field634 == 1 && class165.method3027(method559(var9))) {
                                                    if (Statics.field269 != var9.field2727 || Statics.field2039 != var43) {
                                                        method157(class137.field2190, field635 + " " + class2.field20 + " " + class2.method1593(16748608) + var48.field993, 31, var48.field1008, var43, var9.field2727);
                                                    }
                                                } else if (!field636 || !class165.method3027(method559(var9))) {
                                                    String[] var49 = var48.field1010;
                                                    if (field650) {
                                                        var49 = method2766(var49);
                                                    }
                                                    if (class165.method3027(method559(var9))) {
                                                        for (int var50 = 4; var50 >= 3; var50--) {
                                                            if (var49 != null && var49[var50] != null) {
                                                                byte var51;
                                                                if (var50 == 3) {
                                                                    var51 = 36;
                                                                } else {
                                                                    var51 = 37;
                                                                }
                                                                method157(var49[var50], class2.method1593(16748608) + var48.field993, var51, var48.field1008, var43, var9.field2727);
                                                            } else if (var50 == 4) {
                                                                method157(class137.field2124, class2.method1593(16748608) + var48.field993, 37, var48.field1008, var43, var9.field2727);
                                                            }
                                                        }
                                                    }
                                                    int var52 = method559(var9);
                                                    boolean var53 = (var52 >> 31 & 0x1) != 0;
                                                    if (var53) {
                                                        method157(class137.field2190, class2.method1593(16748608) + var48.field993, 38, var48.field1008, var43, var9.field2727);
                                                    }
                                                    class165 var10000 = (class165) null;
                                                    if (class165.method3027(method559(var9)) && var49 != null) {
                                                        for (int var54 = 2; var54 >= 0; var54--) {
                                                            if (var49[var54] != null) {
                                                                byte var55 = 0;
                                                                if (var54 == 0) {
                                                                    var55 = 33;
                                                                }
                                                                if (var54 == 1) {
                                                                    var55 = 34;
                                                                }
                                                                if (var54 == 2) {
                                                                    var55 = 35;
                                                                }
                                                                method157(var49[var54], class2.method1593(16748608) + var48.field993, var55, var48.field1008, var43, var9.field2727);
                                                            }
                                                        }
                                                    }
                                                    String[] var56 = var9.field2677;
                                                    if (field650) {
                                                        var56 = method2766(var56);
                                                    }
                                                    if (var56 != null) {
                                                        for (int var57 = 4; var57 >= 0; var57--) {
                                                            if (var56[var57] != null) {
                                                                byte var58 = 0;
                                                                if (var57 == 0) {
                                                                    var58 = 39;
                                                                }
                                                                if (var57 == 1) {
                                                                    var58 = 40;
                                                                }
                                                                if (var57 == 2) {
                                                                    var58 = 41;
                                                                }
                                                                if (var57 == 3) {
                                                                    var58 = 42;
                                                                }
                                                                if (var57 == 4) {
                                                                    var58 = 43;
                                                                }
                                                                method157(var56[var57], class2.method1593(16748608) + var48.field993, var58, var48.field1008, var43, var9.field2727);
                                                            }
                                                        }
                                                    }
                                                    method157(class137.field2351, class2.method1593(16748608) + var48.field993, 1005, var48.field1008, var43, var9.field2727);
                                                } else if ((Statics.field960 & 0x10) == 16) {
                                                    method157(field647, field597 + " " + class2.field20 + " " + class2.method1593(16748608) + var48.field993, 32, var48.field1008, var43, var9.field2727);
                                                }
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var9.field2618) {
                                if (!field636) {
                                    for (int var59 = 9; var59 >= 5; var59--) {
                                        String var60;
                                        if (!class165.method1312(method559(var9), var59) && var9.field2706 == null) {
                                            var60 = null;
                                        } else if (var9.field2610 == null || var9.field2610.length <= var59 || var9.field2610[var59] == null || var9.field2610[var59].trim().length() == 0) {
                                            var60 = null;
                                        } else {
                                            var60 = var9.field2610[var59];
                                        }
                                        if (var60 != null) {
                                            method157(var60, var9.field2672, 1007, var59 + 1, var9.field2620, var9.field2727);
                                        }
                                    }
                                    int var62 = method559(var9);
                                    int var63 = var62 >> 11 & 0x3F;
                                    String var64;
                                    if (var63 == 0) {
                                        var64 = null;
                                    } else if (var9.field2633 == null || var9.field2633.trim().length() == 0) {
                                        var64 = null;
                                    } else {
                                        var64 = var9.field2633;
                                    }
                                    if (var64 != null) {
                                        method157(var64, var9.field2672, 25, 0, var9.field2620, var9.field2727);
                                    }
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        String var67;
                                        if (!class165.method1312(method559(var9), var66) && var9.field2706 == null) {
                                            var67 = null;
                                        } else if (var9.field2610 == null || var9.field2610.length <= var66 || var9.field2610[var66] == null || var9.field2610[var66].trim().length() == 0) {
                                            var67 = null;
                                        } else {
                                            var67 = var9.field2610[var66];
                                        }
                                        if (var67 != null) {
                                            method157(var67, var9.field2672, 57, var66 + 1, var9.field2620, var9.field2727);
                                        }
                                    }
                                    int var69 = method559(var9);
                                    boolean var70 = (var69 & 0x1) != 0;
                                    if (var70) {
                                        method157(class137.field2297, "", 30, 0, var9.field2620, var9.field2727);
                                    }
                                } else if (class165.method2748(method559(var9)) && (Statics.field960 & 0x20) == 32) {
                                    method157(field647, field597 + " " + class2.field20 + " " + var9.field2672, 58, 0, var9.field2620, var9.field2727);
                                }
                            }
                        }
                        if (var9.field2621 == 0) {
                            if (!var9.field2618 && method112(var9) && Statics.field1768 != var9) {
                                continue;
                            }
                            method1652(arg0, var9.field2727, var12, var13, var14, var15, var10 - var9.field2632, var11 - var9.field2655);
                            if (var9.field2641 != null) {
                                method1652(var9.field2641, var9.field2727, var12, var13, var14, var15, var10 - var9.field2632, var11 - var9.field2655);
                            }
                            class4 var71 = (class4) field641.method3315((long) var9.field2727);
                            if (var71 != null) {
                                if (var71.field69 == 0 && class78.field1410 >= var12 && class78.field1411 >= var13 && class78.field1410 < var14 && class78.field1411 < var15 && !field622 && !field649) {
                                    field677[0] = class137.field2279;
                                    field652[0] = "";
                                    field626[0] = 1006;
                                    field685 = 1;
                                }
                                int var72 = var71.field57;
                                if (class161.method199(var72)) {
                                    method1652(Statics.field2626[var72], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2618) {
                            if (var9.field2736 && class78.field1410 >= var12 && class78.field1411 >= var13 && class78.field1410 < var14 && class78.field1411 < var15) {
                                for (class1 var73 = (class1) field501.method3339(); var73 != null; var73 = (class1) field501.method3353()) {
                                    if (var73.field4) {
                                        var73.method3363();
                                        var73.field3.field2728 = false;
                                    }
                                }
                                if (Statics.field168 == 0) {
                                    field651 = null;
                                    field520 = null;
                                }
                                if (!field622) {
                                    field677[0] = class137.field2279;
                                    field652[0] = "";
                                    field626[0] = 1006;
                                    field685 = 1;
                                }
                            }
                            boolean var74;
                            if (class78.field1410 >= var12 && class78.field1411 >= var13 && class78.field1410 < var14 && class78.field1411 < var15) {
                                var74 = true;
                            } else {
                                var74 = false;
                            }
                            boolean var75 = false;
                            if ((class78.field1419 == 1 || !Statics.field1668 && class78.field1419 == 4) && var74) {
                                var75 = true;
                            }
                            boolean var76 = false;
                            if ((class78.field1416 == 1 || !Statics.field1668 && class78.field1416 == 4) && class78.field1417 >= var12 && class78.field1418 >= var13 && class78.field1417 < var14 && class78.field1418 < var15) {
                                var76 = true;
                            }
                            if (var76) {
                                method2810(var9, class78.field1417 - var10, class78.field1418 - var11);
                            }
                            if (field651 != null && field651 != var9 && var74) {
                                int var77 = method559(var9);
                                boolean var78 = (var77 >> 20 & 0x1) != 0;
                                if (var78) {
                                    field655 = var9;
                                }
                            }
                            if (field520 == var9) {
                                field656 = true;
                                field568 = var10;
                                field658 = var11;
                            }
                            if (var9.field2686) {
                                if (var74 && field676 != 0 && var9.field2707 != null) {
                                    class1 var79 = new class1();
                                    var79.field4 = true;
                                    var79.field3 = var9;
                                    var79.field5 = field676;
                                    var79.field6 = var9.field2707;
                                    field501.method3334(var79);
                                }
                                if (field651 != null || Statics.field1191 != null || field622) {
                                    var76 = false;
                                    var75 = false;
                                    var74 = false;
                                }
                                if (!var9.field2729 && var76) {
                                    var9.field2729 = true;
                                    if (var9.field2623 != null) {
                                        class1 var80 = new class1();
                                        var80.field4 = true;
                                        var80.field3 = var9;
                                        var80.field2 = class78.field1417 - var10;
                                        var80.field5 = class78.field1418 - var11;
                                        var80.field6 = var9.field2623;
                                        field501.method3334(var80);
                                    }
                                }
                                if (var9.field2729 && var75 && var9.field2689 != null) {
                                    class1 var81 = new class1();
                                    var81.field4 = true;
                                    var81.field3 = var9;
                                    var81.field2 = class78.field1410 - var10;
                                    var81.field5 = class78.field1411 - var11;
                                    var81.field6 = var9.field2689;
                                    field501.method3334(var81);
                                }
                                if (var9.field2729 && !var75) {
                                    var9.field2729 = false;
                                    if (var9.field2685 != null) {
                                        class1 var82 = new class1();
                                        var82.field4 = true;
                                        var82.field3 = var9;
                                        var82.field2 = class78.field1410 - var10;
                                        var82.field5 = class78.field1411 - var11;
                                        var82.field6 = var9.field2685;
                                        field711.method3334(var82);
                                    }
                                }
                                if (var75 && var9.field2720 != null) {
                                    class1 var83 = new class1();
                                    var83.field4 = true;
                                    var83.field3 = var9;
                                    var83.field2 = class78.field1410 - var10;
                                    var83.field5 = class78.field1411 - var11;
                                    var83.field6 = var9.field2720;
                                    field501.method3334(var83);
                                }
                                if (!var9.field2728 && var74) {
                                    var9.field2728 = true;
                                    if (var9.field2625 != null) {
                                        class1 var84 = new class1();
                                        var84.field4 = true;
                                        var84.field3 = var9;
                                        var84.field2 = class78.field1410 - var10;
                                        var84.field5 = class78.field1411 - var11;
                                        var84.field6 = var9.field2625;
                                        field501.method3334(var84);
                                    }
                                }
                                if (var9.field2728 && var74 && var9.field2679 != null) {
                                    class1 var85 = new class1();
                                    var85.field4 = true;
                                    var85.field3 = var9;
                                    var85.field2 = class78.field1410 - var10;
                                    var85.field5 = class78.field1411 - var11;
                                    var85.field6 = var9.field2679;
                                    field501.method3334(var85);
                                }
                                if (var9.field2728 && !var74) {
                                    var9.field2728 = false;
                                    if (var9.field2694 != null) {
                                        class1 var86 = new class1();
                                        var86.field4 = true;
                                        var86.field3 = var9;
                                        var86.field2 = class78.field1410 - var10;
                                        var86.field5 = class78.field1411 - var11;
                                        var86.field6 = var9.field2694;
                                        field711.method3334(var86);
                                    }
                                }
                                if (var9.field2705 != null) {
                                    class1 var87 = new class1();
                                    var87.field3 = var9;
                                    var87.field6 = var9.field2705;
                                    field678.method3334(var87);
                                }
                                if (var9.field2699 != null && field665 > var9.field2731) {
                                    if (var9.field2708 == null || field665 - var9.field2731 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field6 = var9.field2699;
                                        field501.method3334(var92);
                                    } else {
                                        label765: for (int var88 = var9.field2731; var88 < field665; var88++) {
                                            int var89 = field664[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2708.length; var90++) {
                                                if (var9.field2708[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field6 = var9.field2699;
                                                    field501.method3334(var91);
                                                    break label765;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2731 = field665;
                                }
                                if (var9.field2719 != null && field512 > var9.field2732) {
                                    if (var9.field2702 == null || field512 - var9.field2732 > 32) {
                                        class1 var97 = new class1();
                                        var97.field3 = var9;
                                        var97.field6 = var9.field2719;
                                        field501.method3334(var97);
                                    } else {
                                        label741: for (int var93 = var9.field2732; var93 < field512; var93++) {
                                            int var94 = field666[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2702.length; var95++) {
                                                if (var9.field2702[var95] == var94) {
                                                    class1 var96 = new class1();
                                                    var96.field3 = var9;
                                                    var96.field6 = var9.field2719;
                                                    field501.method3334(var96);
                                                    break label741;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2732 = field512;
                                }
                                if (var9.field2733 != null && field548 > var9.field2717) {
                                    if (var9.field2710 == null || field548 - var9.field2717 > 32) {
                                        class1 var102 = new class1();
                                        var102.field3 = var9;
                                        var102.field6 = var9.field2733;
                                        field501.method3334(var102);
                                    } else {
                                        label717: for (int var98 = var9.field2717; var98 < field548; var98++) {
                                            int var99 = field668[var98 & 0x1F];
                                            for (int var100 = 0; var100 < var9.field2710.length; var100++) {
                                                if (var9.field2710[var100] == var99) {
                                                    class1 var101 = new class1();
                                                    var101.field3 = var9;
                                                    var101.field6 = var9.field2733;
                                                    field501.method3334(var101);
                                                    break label717;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2717 = field548;
                                }
                                if (field717 > var9.field2730 && var9.field2695 != null) {
                                    class1 var103 = new class1();
                                    var103.field3 = var9;
                                    var103.field6 = var9.field2695;
                                    field501.method3334(var103);
                                }
                                if (field671 > var9.field2730 && var9.field2693 != null) {
                                    class1 var104 = new class1();
                                    var104.field3 = var9;
                                    var104.field6 = var9.field2693;
                                    field501.method3334(var104);
                                }
                                if (field663 > var9.field2730 && var9.field2711 != null) {
                                    class1 var105 = new class1();
                                    var105.field3 = var9;
                                    var105.field6 = var9.field2711;
                                    field501.method3334(var105);
                                }
                                if (field673 > var9.field2730 && var9.field2712 != null) {
                                    class1 var106 = new class1();
                                    var106.field3 = var9;
                                    var106.field6 = var9.field2712;
                                    field501.method3334(var106);
                                }
                                var9.field2730 = field545;
                                if (var9.field2630 != null) {
                                    for (int var107 = 0; var107 < field701; var107++) {
                                        class1 var108 = new class1();
                                        var108.field3 = var9;
                                        var108.field12 = field703[var107];
                                        var108.field9 = field657[var107];
                                        var108.field6 = var9.field2630;
                                        field501.method3334(var108);
                                    }
                                }
                            }
                        }
                        if (!var9.field2618 && field651 == null && Statics.field1191 == null && !field622) {
                            if ((var9.field2718 >= 0 || var9.field2638 != 0) && class78.field1410 >= var12 && class78.field1411 >= var13 && class78.field1410 < var14 && class78.field1411 < var15) {
                                if (var9.field2718 >= 0) {
                                    Statics.field1768 = arg0[var9.field2718];
                                } else {
                                    Statics.field1768 = var9;
                                }
                            }
                            if (var9.field2621 == 8 && class78.field1410 >= var12 && class78.field1411 >= var13 && class78.field1410 < var14 && class78.field1411 < var15) {
                                Statics.field363 = var9;
                            }
                            if (var9.field2635 > var9.field2629) {
                                int var109 = var9.field2734 + var10;
                                int var110 = var9.field2629;
                                int var111 = var9.field2635;
                                int var112 = class78.field1410;
                                int var113 = class78.field1411;
                                if (field562) {
                                    field563 = 32;
                                } else {
                                    field563 = 0;
                                }
                                field562 = false;
                                if (class78.field1419 == 1 || !Statics.field1668 && class78.field1419 == 4) {
                                    if (var112 >= var109 && var112 < var109 + 16 && var113 >= var11 && var113 < var11 + 16) {
                                        var9.field2655 -= 4;
                                        method610(var9);
                                    } else if (var112 >= var109 && var112 < var109 + 16 && var113 >= var11 + var110 - 16 && var113 < var11 + var110) {
                                        var9.field2655 += 4;
                                        method610(var9);
                                    } else if (var112 >= var109 - field563 && var112 < field563 + var109 + 16 && var113 >= var11 + 16 && var113 < var11 + var110 - 16) {
                                        int var114 = (var110 - 32) * var110 / var111;
                                        if (var114 < 8) {
                                            var114 = 8;
                                        }
                                        int var115 = var113 - var11 - 16 - var114 / 2;
                                        int var116 = var110 - 32 - var114;
                                        var9.field2655 = (var111 - var110) * var115 / var116;
                                        method610(var9);
                                        field562 = true;
                                    }
                                }
                                if (field676 != 0) {
                                    int var117 = var9.field2734;
                                    if (var112 >= var109 - var117 && var113 >= var11 && var112 < var109 + 16 && var113 <= var11 + var110) {
                                        var9.field2655 += field676 * 45;
                                        method610(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field566 == 0 || field566 == 3) && (class78.field1416 == 1 || !Statics.field1668 && class78.field1416 == 4)) {
                        int var26 = class78.field1417 - 25 - var10;
                        int var27 = class78.field1418 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field565 + field551 & 0x7FF;
                            int var29 = class105.field1794[var28];
                            int var30 = class105.field1795[var28];
                            int var31 = (field553 + 256) * var29 >> 8;
                            int var32 = (field553 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field1683.field470 + var33 >> 7;
                            int var36 = Statics.field1683.field419 - var34 >> 7;
                            field689.method2335(68);
                            field689.method2449(18);
                            field689.method2481(class76.field1390[82] ? (class76.field1390[81] ? 2 : 1) : 0);
                            field689.method2628(Statics.field52 + var35);
                            field689.method2494(Statics.field332 + var36);
                            field689.method2449(var26);
                            field689.method2449(var27);
                            field689.method2529(field565);
                            field689.method2449(57);
                            field689.method2449(field551);
                            field689.method2449(field553);
                            field689.method2449(89);
                            field689.method2529(Statics.field1683.field470);
                            field689.method2529(Statics.field1683.field419);
                            field689.method2449(63);
                            field570 = var35;
                            field531 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.ck([Lfg;II)V")
    public static final void method2225(class161[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class161 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2621 == 0) {
                    if (var3.field2641 != null) {
                        method2225(var3.field2641, arg1);
                    }
                    class4 var4 = (class4) field641.method3315((long) var3.field2727);
                    if (var4 != null) {
                        int var5 = var4.field57;
                        if (class161.method199(var5)) {
                            method2225(Statics.field2626[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2617 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field6 = var3.field2617;
                    class27.method1310(var6);
                }
                if (arg1 == 1 && var3.field2714 != null) {
                    if (var3.field2620 >= 0) {
                        class161 var7 = class161.method3039(var3.field2727);
                        if (var7 == null || var7.field2641 == null || var3.field2620 >= var7.field2641.length || var7.field2641[var3.field2620] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field6 = var3.field2714;
                    class27.method1310(var8);
                }
            }
        }
    }

    @ObfuscatedName("eu.cs(Lfg;IIB)V")
    public static final void method2810(class161 arg0, int arg1, int arg2) {
        if (field651 != null || field622 || arg0 == null || method1871(arg0) == null) {
            return;
        }
        field651 = arg0;
        field520 = method1871(arg0);
        field478 = arg1;
        field654 = arg2;
        Statics.field168 = 0;
        field576 = false;
        if (field685 <= 0) {
            return;
        }
        int var3 = field685 - 1;
        Statics.field1268 = new class21();
        Statics.field1268.field309 = field667[var3];
        Statics.field1268.field300 = field625[var3];
        Statics.field1268.field301 = field626[var3];
        Statics.field1268.field302 = field627[var3];
        Statics.field1268.field303 = field677[var3];
    }

    @ObfuscatedName("p.cu(IIB)V")
    public static void method154(int arg0, int arg1) {
        class21 var2 = Statics.field1268;
        method2400(var2.field309, var2.field300, var2.field301, var2.field302, var2.field303, var2.field303, arg0, arg1);
        Statics.field1268 = null;
    }

    @ObfuscatedName("ah.ce(Lfg;I)V")
    public static void method610(class161 arg0) {
        if (field682 == arg0.field2735) {
            field683[arg0.field2704] = true;
        }
    }

    @ObfuscatedName("ej.ci(I)V")
    public static void method3017() {
        for (class4 var0 = (class4) field641.method3318(); var0 != null; var0 = (class4) field641.method3321()) {
            int var1 = var0.field57;
            if (class161.method199(var1)) {
                boolean var2 = true;
                class161[] var3 = Statics.field2626[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2618;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2839;
                    class161 var6 = class161.method3039(var5);
                    if (var6 != null) {
                        method610(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ci.cf(Lfg;I)Lfg;")
    public static class161 method1871(class161 arg0) {
        class161 var1 = method714(arg0);
        if (var1 == null) {
            var1 = arg0.field2681;
        }
        return var1;
    }

    @ObfuscatedName("eh.cx([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2766(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ds.ca(IB)V")
    public static final void method2661(int arg0) {
        if (!class161.method199(arg0)) {
            return;
        }
        class161[] var1 = Statics.field2626[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class161 var3 = var1[var2];
            if (var3 != null) {
                var3.field2725 = 0;
                var3.field2726 = 0;
            }
        }
    }

    @ObfuscatedName("j.ct([Lfg;II)V")
    public static final void method254(class161[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class161 var3 = arg0[var2];
            if (var3 != null && var3.field2713 == arg1 && (!var3.field2618 || !method112(var3))) {
                if (var3.field2621 == 0) {
                    if (!var3.field2618 && method112(var3) && Statics.field1768 != var3) {
                        continue;
                    }
                    method254(arg0, var3.field2727);
                    if (var3.field2641 != null) {
                        method254(var3.field2641, var3.field2727);
                    }
                    class4 var4 = (class4) field641.method3315((long) var3.field2727);
                    if (var4 != null) {
                        int var5 = var4.field57;
                        if (class161.method199(var5)) {
                            method254(Statics.field2626[var5], -1);
                        }
                    }
                }
                if (var3.field2621 == 6) {
                    if (var3.field2700 != -1 || var3.field2724 != -1) {
                        boolean var6 = method2398(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2724;
                        } else {
                            var7 = var3.field2700;
                        }
                        if (var7 != -1) {
                            class35 var8 = class35.method708(var7);
                            var3.field2726 += field556;
                            while (var3.field2726 > var8.field890[var3.field2725]) {
                                var3.field2726 -= var8.field890[var3.field2725];
                                var3.field2725++;
                                if (var3.field2725 >= var8.field901.length) {
                                    var3.field2725 -= var8.field888;
                                    if (var3.field2725 < 0 || var3.field2725 >= var8.field901.length) {
                                        var3.field2725 = 0;
                                    }
                                }
                                method610(var3);
                            }
                        }
                    }
                    if (var3.field2613 != 0 && !var3.field2618) {
                        int var9 = var3.field2613 >> 16;
                        int var10 = var3.field2613 << 16 >> 16;
                        int var11 = field556 * var9;
                        int var12 = field556 * var10;
                        var3.field2659 = var3.field2659 + var11 & 0x7FF;
                        var3.field2660 = var3.field2660 + var12 & 0x7FF;
                        method610(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.cp(II)V")
    public static final void method821(int arg0) {
        method3017();
        for (class7 var1 = (class7) class7.field95.method3339(); var1 != null; var1 = (class7) class7.field95.method3353()) {
            if (var1.field91 != null) {
                var1.method43();
            }
        }
        int var2 = class43.method562(arg0).field1047;
        if (var2 == 0) {
            return;
        }
        int var3 = class162.field2740[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class105.method2144(0.9D);
                ((class111) Statics.field1791).method2239(0.9D);
            }
            if (var3 == 2) {
                class105.method2144(0.8D);
                ((class111) Statics.field1791).method2239(0.8D);
            }
            if (var3 == 3) {
                class105.method2144(0.7D);
                ((class111) Statics.field1791).method2239(0.7D);
            }
            if (var3 == 4) {
                class105.method2144(0.6D);
                ((class111) Statics.field1791).method2239(0.6D);
            }
            class41.field992.method3279();
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
            if (field715 != var4) {
                if (field715 == 0 && field582 != -1) {
                    class141.method761(Statics.field2033, field582, 0, var4, false);
                    field543 = false;
                } else if (var4 == 0) {
                    Statics.field2381.method2791();
                    class141.field2382 = 1;
                    Statics.field2380 = null;
                    field543 = false;
                } else {
                    class141.method239(var4);
                }
                field715 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field718 = 127;
            }
            if (var3 == 1) {
                field718 = 96;
            }
            if (var3 == 2) {
                field718 = 64;
            }
            if (var3 == 3) {
                field718 = 32;
            }
            if (var3 == 4) {
                field718 = 0;
            }
        }
        if (var2 == 5) {
            field621 = var3;
        }
        if (var2 == 6) {
            field642 = var3;
        }
        if (var2 == 9) {
            field594 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field719 = 127;
        }
        if (var3 == 1) {
            field719 = 96;
        }
        if (var3 == 2) {
            field719 = 64;
        }
        if (var3 == 3) {
            field719 = 32;
        }
        if (var3 == 4) {
            field719 = 0;
        }
    }

    @ObfuscatedName("u.cc(Lfg;B)V")
    public static final void method55(class161 arg0) {
        int var1 = arg0.field2680;
        if (var1 == 324) {
            if (field739 == -1) {
                field739 = arg0.field2643;
                field583 = arg0.field2644;
            }
            if (field738.field2752) {
                arg0.field2643 = field739;
            } else {
                arg0.field2643 = field583;
            }
        } else if (var1 == 325) {
            if (field739 == -1) {
                field739 = arg0.field2643;
                field583 = arg0.field2644;
            }
            if (field738.field2752) {
                arg0.field2643 = field583;
            } else {
                arg0.field2643 = field739;
            }
        } else if (var1 == 327) {
            arg0.field2659 = 150;
            arg0.field2660 = (int) (Math.sin((double) field735 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2651 = 5;
            arg0.field2652 = 0;
        } else if (var1 == 328) {
            arg0.field2659 = 150;
            arg0.field2660 = (int) (Math.sin((double) field735 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2651 = 5;
            arg0.field2652 = 1;
        }
    }

    @ObfuscatedName("v.cq(I)V")
    public static final void method116() {
        field689.method2335(154);
        for (class4 var0 = (class4) field641.method3318(); var0 != null; var0 = (class4) field641.method3321()) {
            if (var0.field69 == 0 || var0.field69 == 3) {
                method1487(var0, true);
            }
        }
        if (field644 != null) {
            method610(field644);
            field644 = null;
        }
    }

    @ObfuscatedName("bx.cw(Ll;ZI)V")
    public static final void method1487(class4 arg0, boolean arg1) {
        int var2 = arg0.field57;
        int var3 = (int) arg0.field2839;
        arg0.method3363();
        if (arg1 && var2 != -1 && Statics.field2860[var2]) {
            Statics.field2742.method3055(var2);
            if (Statics.field2626[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2626[var2].length; var5++) {
                    if (Statics.field2626[var2][var5] != null) {
                        if (Statics.field2626[var2][var5].field2621 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2626[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2626[var2] = null;
                }
                Statics.field2860[var2] = false;
            }
        }
        method114(var2);
        class161 var6 = class161.method3039(var3);
        if (var6 != null) {
            method610(var6);
        }
        for (int var7 = 0; var7 < field685; var7++) {
            int var8 = field626[var7];
            boolean var9 = var8 == 57 || var8 == 58 || var8 == 1007 || var8 == 25 || var8 == 30;
            if (var9) {
                if (var7 < field685 - 1) {
                    for (int var10 = var7; var10 < field685 - 1; var10++) {
                        field677[var10] = field677[var10 + 1];
                        field652[var10] = field652[var10 + 1];
                        field626[var10] = field626[var10 + 1];
                        field627[var10] = field627[var10 + 1];
                        field667[var10] = field667[var10 + 1];
                        field625[var10] = field625[var10 + 1];
                    }
                }
                field685--;
            }
        }
        if (field640 != -1) {
            int var11 = field640;
            if (class161.method199(var11)) {
                method2225(Statics.field2626[var11], 1);
            }
        }
    }

    @ObfuscatedName("v.co(Lfg;I)Z")
    public static final boolean method113(class161 arg0) {
        int var1 = arg0.field2680;
        if (var1 == 205) {
            field528 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field738.method3238(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field738.method3239(var4, var5 == 1);
        }
        if (var1 == 324) {
            field738.method3236(false);
        }
        if (var1 == 325) {
            field738.method3236(true);
        }
        if (var1 == 326) {
            field689.method2335(75);
            field738.method3241(field689);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.cy(IIII)V")
    public static final void method658(int arg0, int arg1, int arg2) {
        method1870();
        class90.method1798(arg0, arg1, Statics.field59.field1498 + arg0, Statics.field59.field1502 + arg1);
        if (field566 == 2 || field566 == 5) {
            class90.method1813(arg0 + 25, arg1 + 5, 0, Statics.field1288, Statics.field755);
        } else {
            int var3 = field565 + field551 & 0x7FF;
            int var4 = Statics.field1683.field470 / 32 + 48;
            int var5 = 464 - Statics.field1683.field419 / 32;
            Statics.field1125.method1708(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field553 + 256, Statics.field1288, Statics.field755);
            for (int var6 = 0; var6 < field599; var6++) {
                int var7 = field709[var6] * 4 + 2 - Statics.field1683.field470 / 32;
                int var8 = field716[var6] * 4 + 2 - Statics.field1683.field419 / 32;
                method270(arg0, arg1, var7, var8, field482[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class179 var11 = field614[Statics.field259][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1683.field470 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1683.field419 / 32;
                        method270(arg0, arg1, var12, var13, Statics.field379[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field519; var14++) {
                class26 var15 = field518[field603[var14]];
                if (var15 != null && var15.method14()) {
                    class32 var16 = var15.field400;
                    if (var16 != null && var16.field784 != null) {
                        var16 = var16.method628();
                    }
                    if (var16 != null && var16.field791 && var16.field789) {
                        int var17 = var15.field470 / 32 - Statics.field1683.field470 / 32;
                        int var18 = var15.field419 / 32 - Statics.field1683.field419 / 32;
                        method270(arg0, arg1, var17, var18, Statics.field379[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field601; var19++) {
                class3 var20 = field600[field662[var19]];
                if (var20 != null && var20.method14()) {
                    int var21 = var20.field470 / 32 - Statics.field1683.field470 / 32;
                    int var22 = var20.field419 / 32 - Statics.field1683.field419 / 32;
                    boolean var23 = false;
                    if (method2446(var20.field47, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field365; var25++) {
                        if (var20.field47.equals(Statics.field24[var25].field108)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1683.field49 != 0 && var20.field49 != 0 && Statics.field1683.field49 == var20.field49) {
                        var26 = true;
                    }
                    if (var23) {
                        method270(arg0, arg1, var21, var22, Statics.field379[3]);
                    } else if (var26) {
                        method270(arg0, arg1, var21, var22, Statics.field379[4]);
                    } else if (var24) {
                        method270(arg0, arg1, var21, var22, Statics.field379[5]);
                    } else {
                        method270(arg0, arg1, var21, var22, Statics.field379[2]);
                    }
                }
            }
            if (field497 != 0 && field735 % 20 < 10) {
                if (field497 == 1 && field498 >= 0 && field498 < field518.length) {
                    class26 var27 = field518[field498];
                    if (var27 != null) {
                        int var28 = var27.field470 / 32 - Statics.field1683.field470 / 32;
                        int var29 = var27.field419 / 32 - Statics.field1683.field419 / 32;
                        method185(arg0, arg1, var28, var29, Statics.field362[1]);
                    }
                }
                if (field497 == 2) {
                    int var30 = field500 * 4 - Statics.field52 * 4 + 2 - Statics.field1683.field470 / 32;
                    int var31 = field491 * 4 - Statics.field332 * 4 + 2 - Statics.field1683.field419 / 32;
                    method185(arg0, arg1, var30, var31, Statics.field362[1]);
                }
                if (field497 == 10 && field499 >= 0 && field499 < field600.length) {
                    class3 var32 = field600[field499];
                    if (var32 != null) {
                        int var33 = var32.field470 / 32 - Statics.field1683.field470 / 32;
                        int var34 = var32.field419 / 32 - Statics.field1683.field419 / 32;
                        method185(arg0, arg1, var33, var34, Statics.field362[1]);
                    }
                }
            }
            if (field570 != 0) {
                int var35 = field570 * 4 + 2 - Statics.field1683.field470 / 32;
                int var36 = field531 * 4 + 2 - Statics.field1683.field419 / 32;
                method270(arg0, arg1, var35, var36, Statics.field362[0]);
            }
            class90.method1804(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field566 < 3) {
            Statics.field377.method1708(arg0, arg1, 33, 33, 25, 25, field565, 256, Statics.field1766, Statics.field104);
        } else {
            class90.method1813(arg0, arg1, 0, Statics.field1766, Statics.field104);
        }
        if (field617[arg2]) {
            Statics.field59.method1782(arg0, arg1);
        }
        field516[arg2] = true;
    }

    @ObfuscatedName("c.cg(IIIILcz;I)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3, class87 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method270(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field565 + field551 & 0x7FF;
        int var7 = class105.field1794[var6];
        int var8 = class105.field1795[var6];
        int var9 = var7 * 256 / (field553 + 256);
        int var10 = var8 * 256 / (field553 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field557.method1709(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("ar.du(IIIILcz;B)V")
    public static final void method270(int arg0, int arg1, int arg2, int arg3, class87 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field565 + field551 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class105.field1794[var5];
        int var8 = class105.field1795[var5];
        int var9 = var7 * 256 / (field553 + 256);
        int var10 = var8 * 256 / (field553 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1712(Statics.field59, arg0 + 94 + var11 - arg4.field1485 / 2 + 4, arg1 + 83 - var12 - arg4.field1495 / 2 - 4);
        } else {
            arg4.method1747(arg0 + 94 + var11 - arg4.field1485 / 2 + 4, arg1 + 83 - var12 - arg4.field1495 / 2 - 4);
        }
    }

    @ObfuscatedName("n.dm(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method197(int arg0, String arg1, String arg2) {
        method236(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("y.dg(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method236(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field691[var4] = field691[var4 - 1];
            field692[var4] = field692[var4 - 1];
            field694[var4] = field694[var4 - 1];
            field710[var4] = field710[var4 - 1];
        }
        field691[0] = arg0;
        field692[0] = arg1;
        field694[0] = arg2;
        field710[0] = arg3;
        field695++;
        field717 = field545;
    }

    @ObfuscatedName("df.de(Ljava/lang/String;ZI)Z")
    public static boolean method2446(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class151.method276(arg0, Statics.field483);
        for (int var3 = 0; var3 < field732; var3++) {
            if (var2.equalsIgnoreCase(class151.method276(field734[var3].field372, Statics.field483)) && (!arg1 || field734[var3].field375 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class151.method276(Statics.field1683.field47, Statics.field483))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.dk(Ljava/lang/String;I)Z")
    public static boolean method664(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class151.method276(arg0, Statics.field483);
        for (int var2 = 0; var2 < field736; var2++) {
            class11 var3 = field737[var2];
            if (var1.equalsIgnoreCase(class151.method276(var3.field177, Statics.field483))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class151.method276(var3.field176, Statics.field483))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dj.dj(Ljava/lang/String;I)V")
    public static final void method2237(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class151.method276(arg0, Statics.field483);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field732; var2++) {
            class24 var3 = field734[var2];
            String var4 = var3.field372;
            String var5 = class151.method276(var4, Statics.field483);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field732--;
                for (int var7 = var2; var7 < field732; var7++) {
                    field734[var7] = field734[var7 + 1];
                }
                field671 = field545;
                field689.method2335(96);
                field689.method2449(class128.method594(arg0));
                field689.method2454(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("l.di(Ljava/lang/String;B)V")
    public static final void method31(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class151.method276(arg0, Statics.field483);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field736; var2++) {
            class11 var3 = field737[var2];
            String var4 = var3.field177;
            String var5 = class151.method276(var4, Statics.field483);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field736--;
                for (int var7 = var2; var7 < field736; var7++) {
                    field737[var7] = field737[var7 + 1];
                }
                field671 = field545;
                field689.method2335(65);
                field689.method2449(class128.method594(arg0));
                field689.method2454(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ex.dn(Ljava/lang/String;II)V")
    public static final void method2784(String arg0, int arg1) {
        field689.method2335(137);
        field689.method2449(class128.method594(arg0) + 1);
        field689.method2454(arg0);
        field689.method2481(arg1);
    }

    @ObfuscatedName("am.dt(Ljava/lang/String;I)V")
    public static final void method794(String arg0) {
        if (!arg0.equals("")) {
            field689.method2335(89);
            field689.method2449(class128.method594(arg0));
            field689.method2454(arg0);
        }
    }

    @ObfuscatedName("v.dq(II)V")
    public static void method114(int arg0) {
        for (class173 var1 = (class173) field533.method3318(); var1 != null; var1 = (class173) field533.method3321()) {
            if ((var1.field2839 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3363();
            }
        }
    }

    @ObfuscatedName("client.dl(Lfg;I)I")
    public static int method559(class161 arg0) {
        class173 var1 = (class173) field533.method3315(((long) arg0.field2727 << 32) + (long) arg0.field2620);
        return var1 == null ? arg0.field2642 : var1.field2822;
    }

    @ObfuscatedName("ag.dr(Lfg;I)Lfg;")
    public static class161 method714(class161 arg0) {
        int var1 = method559(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class161.method3039(arg0.field2713);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("v.dw(Lfg;B)Z")
    public static boolean method112(class161 arg0) {
        if (field649) {
            if (method559(arg0) != 0) {
                return false;
            }
            if (arg0.field2621 == 0) {
                return false;
            }
        }
        return arg0.field2631;
    }
}

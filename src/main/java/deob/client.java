package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.s")
    public static boolean field482 = true;

    @ObfuscatedName("client.o")
    public static int field740 = 1;

    @ObfuscatedName("client.p")
    public static int field484 = 0;

    @ObfuscatedName("client.r")
    public static int field692 = 0;

    @ObfuscatedName("client.j")
    public static boolean field489 = false;

    @ObfuscatedName("client.b")
    public static boolean field490 = false;

    @ObfuscatedName("client.t")
    public static int field572 = 0;

    @ObfuscatedName("client.e")
    public static int field492 = 0;

    @ObfuscatedName("client.l")
    public static boolean field725 = true;

    @ObfuscatedName("client.u")
    public static int field496 = 0;

    @ObfuscatedName("client.m")
    public static long field739 = 1L;

    @ObfuscatedName("client.f")
    public static int field671 = -1;

    @ObfuscatedName("client.v")
    public static int field497 = -1;

    @ObfuscatedName("client.w")
    public static class130[] field544 = new class130[4];

    @ObfuscatedName("client.d")
    public static int field498 = -1;

    @ObfuscatedName("client.i")
    public static boolean field499 = true;

    @ObfuscatedName("client.c")
    public static boolean field500 = false;

    @ObfuscatedName("client.af")
    public static int field501 = 0;

    @ObfuscatedName("client.aq")
    public static int field502 = 0;

    @ObfuscatedName("client.at")
    public static int field503 = 0;

    @ObfuscatedName("client.aw")
    public static int field597 = 0;

    @ObfuscatedName("client.ax")
    public static int field505 = 0;

    @ObfuscatedName("client.ak")
    public static int field506 = 0;

    @ObfuscatedName("client.ar")
    public static int field507 = 0;

    @ObfuscatedName("client.az")
    public static int field508 = 0;

    @ObfuscatedName("client.ai")
    public static int field509 = 0;

    @ObfuscatedName("client.aj")
    public static class127 field510 = new class127(new byte[5000]);

    @ObfuscatedName("client.ae")
    public static int field731 = 0;

    @ObfuscatedName("client.ay")
    public static int field512 = 0;

    @ObfuscatedName("client.ag")
    public static int field513 = 0;

    @ObfuscatedName("client.bd")
    public static int field647 = 0;

    @ObfuscatedName("client.bk")
    public static int field518 = 0;

    @ObfuscatedName("client.bs")
    public static int field519 = 0;

    @ObfuscatedName("client.br")
    public static int field520 = 0;

    @ObfuscatedName("client.bm")
    public static int field521 = 0;

    @ObfuscatedName("client.bw")
    public static class25[] field603 = new class25[32768];

    @ObfuscatedName("client.bp")
    public static int field624 = 0;

    @ObfuscatedName("client.bv")
    public static int[] field525 = new int[32768];

    @ObfuscatedName("client.cs")
    public static class116 field605 = new class116(5000);

    @ObfuscatedName("client.cw")
    public static class116 field527 = new class116(5000);

    @ObfuscatedName("client.ca")
    public static class116 field696 = new class116(5000);

    @ObfuscatedName("client.cx")
    public static int field529 = 0;

    @ObfuscatedName("client.ci")
    public static int field744 = 0;

    @ObfuscatedName("client.cj")
    public static int field531 = 0;

    @ObfuscatedName("client.cv")
    public static int field719 = 0;

    @ObfuscatedName("client.ct")
    public static int field533 = 0;

    @ObfuscatedName("client.cc")
    public static int field713 = 0;

    @ObfuscatedName("client.cr")
    public static int field535 = 0;

    @ObfuscatedName("client.cf")
    public static int field547 = 0;

    @ObfuscatedName("client.cq")
    public static boolean field668 = false;

    @ObfuscatedName("client.cy")
    public static int field538 = 0;

    @ObfuscatedName("client.cn")
    public static int field588 = 0;

    @ObfuscatedName("client.co")
    public static int field540 = 1;

    @ObfuscatedName("client.dv")
    public static int field541 = 0;

    @ObfuscatedName("client.dc")
    public static int field542 = 1;

    @ObfuscatedName("client.dg")
    public static int field543 = 0;

    @ObfuscatedName("client.dz")
    public static boolean field545 = false;

    @ObfuscatedName("client.dq")
    public static int[][][] field546 = new int[4][13][13];

    @ObfuscatedName("client.dk")
    public static final int[] field560 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.de")
    public static int field548 = 0;

    @ObfuscatedName("client.dr")
    public static int field549 = 2;

    @ObfuscatedName("client.db")
    public static int field550 = 0;

    @ObfuscatedName("client.dy")
    public static int field613 = 2;

    @ObfuscatedName("client.ds")
    public static int field554 = 0;

    @ObfuscatedName("client.dp")
    public static int field553 = 1;

    @ObfuscatedName("client.dh")
    public static int field685 = 0;

    @ObfuscatedName("client.dw")
    public static int field670 = 0;

    @ObfuscatedName("client.dt")
    public static int field650 = 2;

    @ObfuscatedName("client.dx")
    public static int field557 = 0;

    @ObfuscatedName("client.df")
    public static int field558 = 1;

    @ObfuscatedName("client.ec")
    public static int field559 = 0;

    @ObfuscatedName("client.ew")
    public static int field723 = 0;

    @ObfuscatedName("client.ek")
    public static int field561 = 2301979;

    @ObfuscatedName("client.ef")
    public static int field562 = 5063219;

    @ObfuscatedName("client.eu")
    public static int field563 = 3353893;

    @ObfuscatedName("client.eh")
    public static int field618 = 7759444;

    @ObfuscatedName("client.ey")
    public static boolean field523 = false;

    @ObfuscatedName("client.el")
    public static int field539 = 0;

    @ObfuscatedName("client.fi")
    public static int field491 = 128;

    @ObfuscatedName("client.fq")
    public static int field568 = 0;

    @ObfuscatedName("client.fb")
    public static int field645 = 0;

    @ObfuscatedName("client.fj")
    public static int field721 = 0;

    @ObfuscatedName("client.fm")
    public static int field571 = 0;

    @ObfuscatedName("client.ff")
    public static int field524 = 0;

    @ObfuscatedName("client.fk")
    public static int field593 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field574 = false;

    @ObfuscatedName("client.ft")
    public static int field575 = 0;

    @ObfuscatedName("client.fl")
    public static int field673 = 0;

    @ObfuscatedName("client.fh")
    public static int field577 = 50;

    @ObfuscatedName("client.fu")
    public static int[] field578 = new int[field577];

    @ObfuscatedName("client.fd")
    public static int[] field579 = new int[field577];

    @ObfuscatedName("client.fp")
    public static int[] field627 = new int[field577];

    @ObfuscatedName("client.fr")
    public static int[] field581 = new int[field577];

    @ObfuscatedName("client.fz")
    public static int[] field582 = new int[field577];

    @ObfuscatedName("client.fw")
    public static int[] field530 = new int[field577];

    @ObfuscatedName("client.fc")
    public static int[] field576 = new int[field577];

    @ObfuscatedName("client.fy")
    public static String[] field511 = new String[field577];

    @ObfuscatedName("client.gl")
    public static int[][] field586 = new int[104][104];

    @ObfuscatedName("client.gk")
    public static int field587 = 0;

    @ObfuscatedName("client.gu")
    public static int field654 = -1;

    @ObfuscatedName("client.gm")
    public static int field589 = -1;

    @ObfuscatedName("client.gr")
    public static int field590 = 0;

    @ObfuscatedName("client.gs")
    public static int field591 = 0;

    @ObfuscatedName("client.gw")
    public static int field592 = 0;

    @ObfuscatedName("client.gt")
    public static int field634 = 0;

    @ObfuscatedName("client.gy")
    public static int field564 = 0;

    @ObfuscatedName("client.gg")
    public static int field595 = 0;

    @ObfuscatedName("client.gb")
    public static int field596 = 0;

    @ObfuscatedName("client.gx")
    public static int field480 = 0;

    @ObfuscatedName("client.gq")
    public static int field598 = 0;

    @ObfuscatedName("client.gz")
    public static int field599 = 0;

    @ObfuscatedName("client.gc")
    public static boolean field600 = false;

    @ObfuscatedName("client.go")
    public static int field644 = 0;

    @ObfuscatedName("client.ge")
    public static int field637 = 0;

    @ObfuscatedName("client.gj")
    public static class3[] field729 = new class3[2048];

    @ObfuscatedName("client.gp")
    public static int field604 = 0;

    @ObfuscatedName("client.gv")
    public static int[] field584 = new int[2048];

    @ObfuscatedName("client.gf")
    public static int field594 = 0;

    @ObfuscatedName("client.hl")
    public static int[] field607 = new int[2048];

    @ObfuscatedName("client.hb")
    public static class127[] field608 = new class127[2048];

    @ObfuscatedName("client.ho")
    public static int field609 = -1;

    @ObfuscatedName("client.hd")
    public static int field528 = 0;

    @ObfuscatedName("client.hp")
    public static int field611 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field612 = new int[1000];

    @ObfuscatedName("client.hk")
    public static final int[] field556 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field642 = new String[8];

    @ObfuscatedName("client.hx")
    public static boolean[] field615 = new boolean[8];

    @ObfuscatedName("client.ha")
    public static int[] field732 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hf")
    public static class177[][][] field617 = new class177[4][104][104];

    @ObfuscatedName("client.hg")
    public static class177 field616 = new class177();

    @ObfuscatedName("client.he")
    public static class177 field619 = new class177();

    @ObfuscatedName("client.hu")
    public static class177 field620 = new class177();

    @ObfuscatedName("client.hz")
    public static int[] field621 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field622 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field623 = new int[25];

    @ObfuscatedName("client.hj")
    public static int field486 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field722 = false;

    @ObfuscatedName("client.is")
    public static int field626 = 0;

    @ObfuscatedName("client.ih")
    public static int[] field606 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field628 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field629 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field630 = new int[500];

    @ObfuscatedName("client.ib")
    public static String[] field631 = new String[500];

    @ObfuscatedName("client.ii")
    public static String[] field632 = new String[500];

    @ObfuscatedName("client.ij")
    public static int field633 = -1;

    @ObfuscatedName("client.il")
    public static int field483 = -1;

    @ObfuscatedName("client.ip")
    public static int field636 = 0;

    @ObfuscatedName("client.iq")
    public static int field610 = 50;

    @ObfuscatedName("client.ik")
    public static int field638 = 0;

    @ObfuscatedName("client.it")
    public static String field639 = null;

    @ObfuscatedName("client.iy")
    public static boolean field640 = false;

    @ObfuscatedName("client.iv")
    public static int field641 = -1;

    @ObfuscatedName("client.if")
    public static String field678 = null;

    @ObfuscatedName("client.iu")
    public static String field565 = null;

    @ObfuscatedName("client.iz")
    public static int field681 = -1;

    @ObfuscatedName("client.jw")
    public static class175 field653 = new class175(8);

    @ObfuscatedName("client.jm")
    public static int field646 = 0;

    @ObfuscatedName("client.jz")
    public static int field660 = 0;

    @ObfuscatedName("client.jf")
    public static class159 field648 = null;

    @ObfuscatedName("client.jt")
    public static int field649 = 0;

    @ObfuscatedName("client.jg")
    public static int field567 = 0;

    @ObfuscatedName("client.jr")
    public static int field651 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field652 = false;

    @ObfuscatedName("client.jj")
    public static boolean field573 = false;

    @ObfuscatedName("client.ja")
    public static boolean field534 = false;

    @ObfuscatedName("client.jh")
    public static class159 field655 = null;

    @ObfuscatedName("client.ji")
    public static class159 field656 = null;

    @ObfuscatedName("client.jn")
    public static int field657 = 0;

    @ObfuscatedName("client.ju")
    public static int field658 = 0;

    @ObfuscatedName("client.jq")
    public static class159 field659 = null;

    @ObfuscatedName("client.jv")
    public static boolean field494 = false;

    @ObfuscatedName("client.jb")
    public static int field643 = -1;

    @ObfuscatedName("client.jx")
    public static int field706 = -1;

    @ObfuscatedName("client.js")
    public static boolean field537 = false;

    @ObfuscatedName("client.je")
    public static int field664 = -1;

    @ObfuscatedName("client.jp")
    public static int field665 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field730 = false;

    @ObfuscatedName("client.km")
    public static int field667 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field703 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field669 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field580 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field686 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field672 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field602 = 0;

    @ObfuscatedName("client.ky")
    public static int field674 = 0;

    @ObfuscatedName("client.kn")
    public static int field675 = 0;

    @ObfuscatedName("client.kf")
    public static int field676 = 0;

    @ObfuscatedName("client.kj")
    public static int field677 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field708 = new int[2000];

    @ObfuscatedName("client.ks")
    public static String[] field679 = new String[1000];

    @ObfuscatedName("client.kg")
    public static int field680 = 0;

    @ObfuscatedName("client.kc")
    public static class177 field504 = new class177();

    @ObfuscatedName("client.kt")
    public static class177 field682 = new class177();

    @ObfuscatedName("client.kw")
    public static class177 field683 = new class177();

    @ObfuscatedName("client.ki")
    public static class175 field684 = new class175(512);

    @ObfuscatedName("client.kx")
    public static int field517 = 0;

    @ObfuscatedName("client.kb")
    public static int field585 = -2;

    @ObfuscatedName("client.kz")
    public static boolean[] field687 = new boolean[100];

    @ObfuscatedName("client.ka")
    public static boolean[] field688 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field689 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static int[] field690 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field691 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field552 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field693 = new int[100];

    @ObfuscatedName("client.ln")
    public static int field694 = 0;

    @ObfuscatedName("client.ls")
    public static int[] field695 = new int[100];

    @ObfuscatedName("client.la")
    public static String[] field515 = new String[100];

    @ObfuscatedName("client.lk")
    public static String[] field697 = new String[100];

    @ObfuscatedName("client.ld")
    public static String[] field698 = new String[100];

    @ObfuscatedName("client.lp")
    public static int field699 = 0;

    @ObfuscatedName("client.lb")
    public static int[] field700 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lf")
    public static int field701 = 0;

    @ObfuscatedName("client.lh")
    public static int field702 = 0;

    @ObfuscatedName("client.lm")
    public static long[] field536 = new long[100];

    @ObfuscatedName("client.lz")
    public static int field704 = 0;

    @ObfuscatedName("client.ly")
    public static int field555 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field495 = new int[128];

    @ObfuscatedName("client.lr")
    public static int[] field707 = new int[128];

    @ObfuscatedName("client.lq")
    public static long field583 = -1L;

    @ObfuscatedName("client.lu")
    public static String field709 = null;

    @ObfuscatedName("client.lt")
    public static String field710 = null;

    @ObfuscatedName("client.mm")
    public static int field711 = -1;

    @ObfuscatedName("client.mf")
    public static int field712 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field662 = new int[1000];

    @ObfuscatedName("client.mq")
    public static int[] field714 = new int[1000];

    @ObfuscatedName("client.mp")
    public static class86[] field715 = new class86[1000];

    @ObfuscatedName("client.mi")
    public static int field716 = 0;

    @ObfuscatedName("client.me")
    public static int field717 = 0;

    @ObfuscatedName("client.mo")
    public static int field718 = 0;

    @ObfuscatedName("client.mz")
    public static int field705 = 255;

    @ObfuscatedName("client.mr")
    public static int field720 = -1;

    @ObfuscatedName("client.ml")
    public static boolean field625 = false;

    @ObfuscatedName("client.mu")
    public static int field663 = 127;

    @ObfuscatedName("client.mc")
    public static int field743 = 127;

    @ObfuscatedName("client.nh")
    public static int field724 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field666 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field726 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field727 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field728 = new int[50];

    @ObfuscatedName("client.na")
    public static class57[] field526 = new class57[50];

    @ObfuscatedName("client.ne")
    public static boolean field570 = false;

    @ObfuscatedName("client.nj")
    public static boolean[] field566 = new boolean[5];

    @ObfuscatedName("client.ni")
    public static int[] field614 = new int[5];

    @ObfuscatedName("client.nz")
    public static int[] field733 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field734 = new int[5];

    @ObfuscatedName("client.nm")
    public static int[] field735 = new int[5];

    @ObfuscatedName("client.ot")
    public static int field736 = 0;

    @ObfuscatedName("client.od")
    public static int field737 = 0;

    @ObfuscatedName("client.oi")
    public static class23[] field738 = new class23[400];

    @ObfuscatedName("client.or")
    public static class173 field551 = new class173();

    @ObfuscatedName("client.oj")
    public static int field493 = 0;

    @ObfuscatedName("client.ow")
    public static class11[] field741 = new class11[400];

    @ObfuscatedName("client.om")
    public static class164 field742 = new class164();

    @ObfuscatedName("client.oe")
    public static int field532 = -1;

    @ObfuscatedName("client.oc")
    public static int field601 = -1;

    @ObfuscatedName("client.h(B)V")
    public final void method269() {
    }

    public final void init() {
        if (!this.method1472()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2788, class167.field2783, class167.field2787, class167.field2786, class167.field2790, class167.field2781, class167.field2785, class167.field2792, class167.field2782, class167.field2784 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2791);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2791)) {
                    case 1:
                        field484 = Integer.parseInt(var5);
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                            field489 = true;
                        } else {
                            field489 = false;
                        }
                        break;
                    case 3:
                        Statics.field138 = var5;
                        break;
                    case 4:
                        field740 = Integer.parseInt(var5);
                        break;
                    case 5:
                        int var6 = Integer.parseInt(var5);
                        class133[] var7 = class133.method576();
                        int var8 = 0;
                        class133 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class133 var9 = var7[var8];
                            if (var9.field2077 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field485 = var10;
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                        }
                    case 7:
                    default:
                        break;
                    case 8:
                        Statics.field487 = (class134) class113.method2776(class134.method2458(), Integer.parseInt(var5));
                        if (Statics.field487 == class134.field2080) {
                            Statics.field661 = class186.field2863;
                        } else {
                            Statics.field661 = class186.field2870;
                        }
                        break;
                    case 9:
                        field572 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field692 = Integer.parseInt(var5);
                }
            }
        }
        class95.field1571 = false;
        field490 = false;
        Statics.field59 = this.getCodeBase().getHost();
        String var11 = Statics.field485.field2078;
        byte var12 = 0;
        try {
            Statics.field1415 = 16;
            Statics.field1991 = var12;
            try {
                Statics.field65 = System.getProperty("os.name");
            } catch (Exception var57) {
                Statics.field65 = "Unknown";
            }
            Statics.field1425 = Statics.field65.toLowerCase();
            try {
                Statics.field1647 = System.getProperty("user.home");
                if (Statics.field1647 != null) {
                    Statics.field1647 = Statics.field1647 + "/";
                }
            } catch (Exception var56) {
            }
            try {
                if (Statics.field1425.startsWith("win")) {
                    if (Statics.field1647 == null) {
                        Statics.field1647 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1647 == null) {
                    Statics.field1647 = System.getenv("HOME");
                }
                if (Statics.field1647 != null) {
                    Statics.field1647 = Statics.field1647 + "/";
                }
            } catch (Exception var55) {
            }
            if (Statics.field1647 == null) {
                Statics.field1647 = "~/";
            }
            Statics.field752 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1647, "/tmp/", "" };
            Statics.field1423 = new String[] { ".jagex_cache_" + Statics.field1991, ".file_store_" + Statics.field1991 };
            int var16 = 0;
            label257: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field2055 = new File(Statics.field1647, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field2055.exists()) {
                    try {
                        class29 var21 = new class29(Statics.field2055, "rw", 10000L);
                        class127 var22 = new class127((int) var21.method558());
                        while (var22.field2027 < var22.field2030.length) {
                            int var23 = var21.method555(var22.field2030, var22.field2027, var22.field2030.length - var22.field2027);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2027 += var23;
                        }
                        var22.field2027 = 0;
                        int var24 = var22.method2499();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2499();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2508();
                            if (var25 == 1) {
                                var19 = var22.method2508();
                            }
                        } else {
                            var18 = var22.method2509();
                            if (var25 == 1) {
                                var19 = var22.method2509();
                            }
                        }
                        var21.method574();
                    } catch (IOException var59) {
                        var59.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class82.method221(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label232: for (int var29 = 0; var29 < Statics.field1423.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field752.length; var30++) {
                            File var31 = new File(Statics.field752[var30] + Statics.field1423[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class82.method221(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label232;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field1647 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
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
                    } catch (Exception var58) {
                        var58.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    File var41 = new File(var18);
                    Object var42 = null;
                    try {
                        class29 var43 = new class29(Statics.field2055, "rw", 10000L);
                        class127 var44 = new class127(500);
                        var44.method2485(3);
                        var44.method2485(var42 == null ? 0 : 1);
                        var44.method2635(var41.getPath());
                        if (var42 != null) {
                            var44.method2635(((File) var42).getPath());
                        }
                        var43.method552(var44.field2030, 0, var44.field2027);
                        var43.method574();
                    } catch (IOException var54) {
                        var54.printStackTrace();
                    }
                }
                File var46 = new File(var18);
                Statics.field1411 = var46;
                if (!Statics.field1411.exists()) {
                    Statics.field1411.mkdirs();
                }
                File[] var47 = Statics.field1411.listFiles();
                if (var47 == null) {
                    break;
                }
                File[] var48 = var47;
                int var49 = 0;
                while (true) {
                    if (var49 >= var48.length) {
                        break label257;
                    }
                    File var50 = var48[var49];
                    if (!class82.method221(var50, false)) {
                        var16++;
                        break;
                    }
                    var49++;
                }
            }
            File var51 = Statics.field1411;
            Statics.field1299 = var51;
            if (!Statics.field1299.exists()) {
                throw new RuntimeException("");
            }
            class72.field1302 = true;
            class82.method1564();
            class82.field1414 = new class30(new class29(class72.method1402("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1421 = new class30(new class29(class72.method1402("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1422 = new class30[Statics.field1415];
            for (int var52 = 0; var52 < Statics.field1415; var52++) {
                Statics.field1422[var52] = new class30(new class29(class72.method1402("main_file_cache.idx" + var52), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var60) {
            class80.method1330((String) null, var60);
        }
        Statics.field481 = this;
        this.method1425(765, 503, 38);
    }

    @ObfuscatedName("client.o(I)V")
    public final void method365() {
        Statics.field522 = field692 == 0 ? 43594 : field740 + 40000;
        Statics.field2406 = field692 == 0 ? 443 : field740 + 50000;
        Statics.field1364 = Statics.field522;
        Statics.field2749 = class162.field2745;
        Statics.field2753 = class162.field2742;
        Statics.field1236 = class162.field2743;
        Statics.field2757 = class162.field2744;
        class75.method1325();
        class75.method1550(Statics.field2789);
        class77.method1488(Statics.field2789);
        Statics.field1359 = class66.method2777();
        if (Statics.field1359 != null) {
            Statics.field1359.method1361(Statics.field2789);
        }
        Statics.field1503 = new class71(255, class82.field1414, class82.field1421, 500000);
        Statics.field78 = class12.method2783();
        Statics.field2378 = this.getToolkit().getSystemClipboard();
        if (field692 != 0) {
            field500 = true;
        }
    }

    @ObfuscatedName("client.p(B)V")
    public final void method273() {
        field496++;
        this.method276();
        while (true) {
            class177 var1 = class158.field2594;
            class157 var2;
            synchronized (class158.field2594) {
                var2 = (class157) class158.field2596.method3371();
            }
            if (var2 == null) {
                class139.method895();
                method801();
                class75 var4 = class75.field1348;
                synchronized (class75.field1348) {
                    class75.field1356++;
                    class75.field1353 = class75.field1355;
                    class75.field1332 = 0;
                    if (class75.field1346 >= 0) {
                        while (class75.field1347 != class75.field1346) {
                            int var6 = class75.field1352[class75.field1347];
                            class75.field1347 = class75.field1347 + 1 & 0x7F;
                            if (var6 < 0) {
                                class75.field1345[~var6] = false;
                            } else {
                                if (!class75.field1345[var6] && class75.field1332 < class75.field1351.length - 1) {
                                    class75.field1351[++class75.field1332 - 1] = var6;
                                }
                                class75.field1345[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class75.field1345[var5] = false;
                        }
                        class75.field1346 = class75.field1347;
                    }
                    class75.field1355 = class75.field1337;
                }
                class77.method12();
                if (Statics.field1359 != null) {
                    int var8 = Statics.field1359.method1364();
                    field680 = var8;
                }
                if (field492 == 0) {
                    method150();
                    Statics.field107.method1353();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field1311[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field1303[var10] = 0L;
                    }
                    Statics.field351 = 0;
                } else if (field492 == 5) {
                    class21.method63(this);
                    method150();
                    Statics.field107.method1353();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field1311[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field1303[var12] = 0L;
                    }
                    Statics.field351 = 0;
                } else if (field492 == 10) {
                    class21.method63(this);
                } else if (field492 == 20) {
                    class21.method63(this);
                    method14();
                } else if (field492 == 25) {
                    method1703(false);
                    field588 = 0;
                    boolean var13 = true;
                    for (int var14 = 0; var14 < Statics.field363.length; var14++) {
                        if (Statics.field926[var14] != -1 && Statics.field363[var14] == null) {
                            Statics.field363[var14] = Statics.field242.method3080(Statics.field926[var14], 0);
                            if (Statics.field363[var14] == null) {
                                var13 = false;
                                field588++;
                            }
                        }
                        if (Statics.field1608[var14] != -1 && Statics.field209[var14] == null) {
                            Statics.field209[var14] = Statics.field242.method3083(Statics.field1608[var14], 0, Statics.field1912[var14]);
                            if (Statics.field209[var14] == null) {
                                var13 = false;
                                field588++;
                            }
                        }
                    }
                    if (var13) {
                        field541 = 0;
                        boolean var15 = true;
                        for (int var16 = 0; var16 < Statics.field363.length; var16++) {
                            byte[] var17 = Statics.field209[var16];
                            if (var17 != null) {
                                int var18 = (Statics.field15[var16] >> 8) * 64 - Statics.field1399;
                                int var19 = (Statics.field15[var16] & 0xFF) * 64 - Statics.field113;
                                if (field545) {
                                    var18 = 10;
                                    var19 = 10;
                                }
                                var15 &= class9.method1610(var17, var18, var19);
                            }
                        }
                        if (var15) {
                            if (field543 != 0) {
                                method1186(class135.field2112 + class2.field24 + class2.field21 + 100 + "%" + class2.field22, true);
                            }
                            method801();
                            method2787();
                            method801();
                            Statics.field751.method1898();
                            method801();
                            System.gc();
                            for (int var20 = 0; var20 < 4; var20++) {
                                field544[var20].method2727();
                            }
                            for (int var21 = 0; var21 < 4; var21++) {
                                for (int var22 = 0; var22 < 104; var22++) {
                                    for (int var23 = 0; var23 < 104; var23++) {
                                        class9.field121[var21][var22][var23] = 0;
                                    }
                                }
                            }
                            method801();
                            class9.field122 = 99;
                            Statics.field123 = new byte[4][104][104];
                            Statics.field124 = new byte[4][104][104];
                            Statics.field2330 = new byte[4][104][104];
                            Statics.field88 = new byte[4][104][104];
                            Statics.field399 = new int[4][105][105];
                            Statics.field343 = new byte[4][105][105];
                            Statics.field873 = new int[105][105];
                            Statics.field125 = new int[104];
                            Statics.field1777 = new int[104];
                            Statics.field2467 = new int[104];
                            Statics.field1779 = new int[104];
                            Statics.field375 = new int[104];
                            int var24 = Statics.field363.length;
                            class7.method149();
                            method1703(true);
                            if (!field545) {
                                int var25 = 0;
                                label3403: while (true) {
                                    if (var25 >= var24) {
                                        for (int var39 = 0; var39 < var24; var39++) {
                                            int var40 = (Statics.field15[var39] >> 8) * 64 - Statics.field1399;
                                            int var41 = (Statics.field15[var39] & 0xFF) * 64 - Statics.field113;
                                            byte[] var42 = Statics.field363[var39];
                                            if (var42 == null && Statics.field254 < 800) {
                                                method801();
                                                class9.method820(var40, var41, 64, 64);
                                            }
                                        }
                                        method1703(true);
                                        int var43 = 0;
                                        while (true) {
                                            if (var43 >= var24) {
                                                break label3403;
                                            }
                                            byte[] var44 = Statics.field209[var43];
                                            if (var44 != null) {
                                                int var45 = (Statics.field15[var43] >> 8) * 64 - Statics.field1399;
                                                int var46 = (Statics.field15[var43] & 0xFF) * 64 - Statics.field113;
                                                method801();
                                                class9.method785(var44, var45, var46, Statics.field751, field544);
                                            }
                                            var43++;
                                        }
                                    }
                                    int var26 = (Statics.field15[var25] >> 8) * 64 - Statics.field1399;
                                    int var27 = (Statics.field15[var25] & 0xFF) * 64 - Statics.field113;
                                    byte[] var28 = Statics.field363[var25];
                                    if (var28 != null) {
                                        method801();
                                        int var29 = Statics.field2002 * 8 - 48;
                                        int var30 = Statics.field254 * 8 - 48;
                                        class130[] var31 = field544;
                                        int var32 = 0;
                                        label3400: while (true) {
                                            if (var32 >= 4) {
                                                class127 var35 = new class127(var28);
                                                int var36 = 0;
                                                while (true) {
                                                    if (var36 >= 4) {
                                                        break label3400;
                                                    }
                                                    for (int var37 = 0; var37 < 64; var37++) {
                                                        for (int var38 = 0; var38 < 64; var38++) {
                                                            class9.method118(var35, var36, var26 + var37, var27 + var38, var29, var30, 0);
                                                        }
                                                    }
                                                    var36++;
                                                }
                                            }
                                            for (int var33 = 0; var33 < 64; var33++) {
                                                for (int var34 = 0; var34 < 64; var34++) {
                                                    if (var26 + var33 > 0 && var26 + var33 < 103 && var27 + var34 > 0 && var27 + var34 < 103) {
                                                        var31[var32].field2049[var26 + var33][var27 + var34] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                    var25++;
                                }
                            }
                            if (field545) {
                                int var47 = 0;
                                label3349: while (true) {
                                    if (var47 >= 4) {
                                        for (int var58 = 0; var58 < 13; var58++) {
                                            for (int var59 = 0; var59 < 13; var59++) {
                                                int var60 = field546[0][var58][var59];
                                                if (var60 == -1) {
                                                    class9.method820(var58 * 8, var59 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method1703(true);
                                        int var61 = 0;
                                        while (true) {
                                            if (var61 >= 4) {
                                                break label3349;
                                            }
                                            method801();
                                            for (int var62 = 0; var62 < 13; var62++) {
                                                for (int var63 = 0; var63 < 13; var63++) {
                                                    int var64 = field546[var61][var62][var63];
                                                    if (var64 != -1) {
                                                        int var65 = var64 >> 24 & 0x3;
                                                        int var66 = var64 >> 1 & 0x3;
                                                        int var67 = var64 >> 14 & 0x3FF;
                                                        int var68 = var64 >> 3 & 0x7FF;
                                                        int var69 = (var67 / 8 << 8) + var68 / 8;
                                                        for (int var70 = 0; var70 < Statics.field15.length; var70++) {
                                                            if (Statics.field15[var70] == var69 && Statics.field209[var70] != null) {
                                                                class9.method1614(Statics.field209[var70], var61, var62 * 8, var63 * 8, var65, (var67 & 0x7) * 8, (var68 & 0x7) * 8, var66, Statics.field751, field544);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var61++;
                                        }
                                    }
                                    method801();
                                    for (int var48 = 0; var48 < 13; var48++) {
                                        for (int var49 = 0; var49 < 13; var49++) {
                                            boolean var50 = false;
                                            int var51 = field546[var47][var48][var49];
                                            if (var51 != -1) {
                                                int var52 = var51 >> 24 & 0x3;
                                                int var53 = var51 >> 1 & 0x3;
                                                int var54 = var51 >> 14 & 0x3FF;
                                                int var55 = var51 >> 3 & 0x7FF;
                                                int var56 = (var54 / 8 << 8) + var55 / 8;
                                                for (int var57 = 0; var57 < Statics.field15.length; var57++) {
                                                    if (Statics.field15[var57] == var56 && Statics.field363[var57] != null) {
                                                        Statics.method590(Statics.field363[var57], var47, var48 * 8, var49 * 8, var52, (var54 & 0x7) * 8, (var55 & 0x7) * 8, var53, field544);
                                                        var50 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var50) {
                                                class9.method1258(var47, var48 * 8, var49 * 8);
                                            }
                                        }
                                    }
                                    var47++;
                                }
                            }
                            method1703(true);
                            method2787();
                            method801();
                            class9.method182(Statics.field751, field544);
                            method1703(true);
                            int var71 = class9.field122;
                            if (var71 > Statics.field1113) {
                                var71 = Statics.field1113;
                            }
                            if (var71 < Statics.field1113 - 1) {
                                int var72 = Statics.field1113 - 1;
                            }
                            if (field490) {
                                Statics.field751.method1899(class9.field122);
                            } else {
                                Statics.field751.method1899(0);
                            }
                            for (int var73 = 0; var73 < 104; var73++) {
                                for (int var74 = 0; var74 < 104; var74++) {
                                    method252(var73, var74);
                                }
                            }
                            method801();
                            method543();
                            class32.field820.method3306();
                            if (Statics.field2359 != null) {
                                field605.method2360(227);
                                field605.method2605(1057001181);
                            }
                            if (!field545) {
                                int var75 = (Statics.field2002 - 6) / 8;
                                int var76 = (Statics.field2002 + 6) / 8;
                                int var77 = (Statics.field254 - 6) / 8;
                                int var78 = (Statics.field254 + 6) / 8;
                                for (int var79 = var75 - 1; var79 <= var76 + 1; var79++) {
                                    for (int var80 = var77 - 1; var80 <= var78 + 1; var80++) {
                                        if (var79 < var75 || var79 > var76 || var80 < var77 || var80 > var78) {
                                            Statics.field242.method3143("m" + var79 + "_" + var80);
                                            Statics.field242.method3143("l" + var79 + "_" + var80);
                                        }
                                    }
                                }
                            }
                            method819(30);
                            method801();
                            Statics.field123 = (byte[][][]) null;
                            Statics.field124 = (byte[][][]) null;
                            Statics.field2330 = (byte[][][]) null;
                            Statics.field88 = (byte[][][]) null;
                            Statics.field399 = (int[][][]) null;
                            Statics.field343 = (byte[][][]) null;
                            Statics.field873 = (int[][]) null;
                            Statics.field125 = null;
                            Statics.field1777 = null;
                            Statics.field2467 = null;
                            Statics.field1779 = null;
                            Statics.field375 = null;
                            field605.method2360(82);
                            Statics.field107.method1353();
                            for (int var81 = 0; var81 < 32; var81++) {
                                field1311[var81] = 0L;
                            }
                            for (int var82 = 0; var82 < 32; var82++) {
                                field1303[var82] = 0L;
                            }
                            Statics.field351 = 0;
                        } else {
                            field543 = 2;
                        }
                    } else {
                        field543 = 1;
                    }
                }
                if (field492 == 30) {
                    if (field501 > 1) {
                        field501--;
                    }
                    if (field533 > 0) {
                        field533--;
                    }
                    if (field668) {
                        field668 = false;
                        method2758();
                    } else {
                        for (int var83 = 0; var83 < 100; var83++) {
                            boolean var84;
                            if (Statics.field420 == null) {
                                var84 = false;
                            } else {
                                label3673: {
                                    try {
                                        int var85 = Statics.field420.method1386();
                                        if (var85 == 0) {
                                            var84 = false;
                                            break label3673;
                                        }
                                        if (field744 == -1) {
                                            Statics.field420.method1387(field696.field2030, 0, 1);
                                            field696.field2027 = 0;
                                            field744 = field696.method2361();
                                            field529 = class165.field2767[field744];
                                            var85--;
                                        }
                                        if (field529 == -1) {
                                            if (var85 <= 0) {
                                                var84 = false;
                                                break label3673;
                                            }
                                            Statics.field420.method1387(field696.field2030, 0, 1);
                                            field529 = field696.field2030[0] & 0xFF;
                                            var85--;
                                        }
                                        if (field529 == -2) {
                                            if (var85 <= 1) {
                                                var84 = false;
                                                break label3673;
                                            }
                                            Statics.field420.method1387(field696.field2030, 0, 2);
                                            field696.field2027 = 0;
                                            field529 = field696.method2501();
                                            var85 -= 2;
                                        }
                                        if (var85 < field529) {
                                            var84 = false;
                                            break label3673;
                                        }
                                        field696.field2027 = 0;
                                        Statics.field420.method1387(field696.field2030, 0, field529);
                                        field531 = 0;
                                        field547 = field535;
                                        field535 = field713;
                                        field713 = field744;
                                        if (field744 == 121) {
                                            Statics.field103 = field696.method2499();
                                            Statics.field77 = field696.method2582();
                                            while (field696.field2027 < field529) {
                                                field744 = field696.method2499();
                                                method2836();
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 77) {
                                            field737 = 1;
                                            field675 = field667;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 222) {
                                            String var86 = field696.method2507();
                                            long var87 = (long) field696.method2501();
                                            long var89 = (long) field696.method2503();
                                            int var91 = field696.method2499();
                                            long var92 = (var87 << 32) + var89;
                                            boolean var94 = false;
                                            for (int var95 = 0; var95 < 100; var95++) {
                                                if (field536[var95] == var92) {
                                                    var94 = true;
                                                    break;
                                                }
                                            }
                                            if (method57(var86)) {
                                                var94 = true;
                                            }
                                            if (!var94 && field637 == 0) {
                                                field536[field704] = var92;
                                                field704 = (field704 + 1) % 100;
                                                String var96 = class185.method3441(class148.method1626(class184.method547(field696)));
                                                if (var91 == 2 || var91 == 3) {
                                                    method1557(7, class2.method231(1) + var86, var96);
                                                } else if (var91 == 1) {
                                                    method1557(7, class2.method231(0) + var86, var96);
                                                } else {
                                                    method1557(3, var86, var96);
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 78) {
                                            int var97 = field696.method2541();
                                            int var98 = field696.method2539();
                                            class160.field2726[var97] = var98;
                                            if (class160.field2727[var97] != var98) {
                                                class160.field2727[var97] = var98;
                                                method27(var97);
                                            }
                                            field703[++field669 - 1 & 0x1F] = var97;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 74) {
                                            int var99 = field696.method2501();
                                            field681 = var99;
                                            method37(var99);
                                            class26.method2395(field681);
                                            for (int var100 = 0; var100 < 100; var100++) {
                                                field687[var100] = true;
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 226) {
                                            String var101 = field696.method2507();
                                            int var102 = field696.method2501();
                                            byte var103 = field696.method2500();
                                            boolean var104 = false;
                                            if (var103 == -128) {
                                                var104 = true;
                                            }
                                            if (var104) {
                                                if (Statics.field1817 == 0) {
                                                    field744 = -1;
                                                    var84 = true;
                                                    break label3673;
                                                }
                                                boolean var105 = false;
                                                int var106;
                                                for (var106 = 0; var106 < Statics.field1817 && (!Statics.field199[var106].field118.equals(var101) || Statics.field199[var106].field115 != var102); var106++) {
                                                }
                                                if (var106 < Statics.field1817) {
                                                    while (var106 < Statics.field1817 - 1) {
                                                        Statics.field199[var106] = Statics.field199[var106 + 1];
                                                        var106++;
                                                    }
                                                    Statics.field1817--;
                                                    Statics.field199[Statics.field1817] = null;
                                                }
                                            } else {
                                                field696.method2507();
                                                class8 var107 = new class8();
                                                var107.field118 = var101;
                                                var107.field117 = class149.method2249(var107.field118, Statics.field661);
                                                var107.field115 = var102;
                                                var107.field116 = var103;
                                                int var108;
                                                for (var108 = Statics.field1817 - 1; var108 >= 0; var108--) {
                                                    int var109 = Statics.field199[var108].field117.compareTo(var107.field118);
                                                    if (var109 == 0) {
                                                        Statics.field199[var108].field115 = var102;
                                                        Statics.field199[var108].field116 = var103;
                                                        if (var101.equals(Statics.field461.field45)) {
                                                            Statics.field922 = var103;
                                                        }
                                                        field676 = field667;
                                                        field744 = -1;
                                                        var84 = true;
                                                        break label3673;
                                                    }
                                                    if (var109 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field1817 >= Statics.field199.length) {
                                                    field744 = -1;
                                                    var84 = true;
                                                    break label3673;
                                                }
                                                for (int var110 = Statics.field1817 - 1; var110 > var108; var110--) {
                                                    Statics.field199[var110 + 1] = Statics.field199[var110];
                                                }
                                                if (Statics.field1817 == 0) {
                                                    Statics.field199 = new class8[100];
                                                }
                                                Statics.field199[var108 + 1] = var107;
                                                Statics.field1817++;
                                                if (var101.equals(Statics.field461.field45)) {
                                                    Statics.field922 = var103;
                                                }
                                            }
                                            field676 = field667;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 20 || field744 == 100 || field744 == 172 || field744 == 233 || field744 == 163 || field744 == 157 || field744 == 193 || field744 == 50 || field744 == 242 || field744 == 174 || field744 == 246) {
                                            method2836();
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 224) {
                                            method786(true);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 206) {
                                            for (int var111 = 0; var111 < Statics.field1042; var111++) {
                                                class42 var112 = class42.method2350(var111);
                                                if (var112 != null && var112.field1039 == 0) {
                                                    class160.field2726[var111] = 0;
                                                    class160.field2727[var111] = 0;
                                                }
                                            }
                                            method1600();
                                            field669 += 32;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 195) {
                                            int var113 = field696.method2548();
                                            int var114 = field696.method2534();
                                            class159 var115 = class159.method166(var113);
                                            if (var115.field2632 != var114 || var114 == -1) {
                                                var115.field2632 = var114;
                                                var115.field2601 = 0;
                                                var115.field2713 = 0;
                                                method2472(var115);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 113) {
                                            int var116 = field696.method2548();
                                            class4 var117 = (class4) field653.method3354((long) var116);
                                            if (var117 != null) {
                                                method62(var117, true);
                                            }
                                            if (field648 != null) {
                                                method2472(field648);
                                                field648 = null;
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 65) {
                                            int var118 = field696.method2549();
                                            boolean var119 = field696.method2582() == 1;
                                            class159 var120 = class159.method166(var118);
                                            if (var120.field2618 != var119) {
                                                var120.field2618 = var119;
                                                method2472(var120);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 198) {
                                            int var121 = field696.method2501();
                                            int var122 = field696.method2499();
                                            int var123 = field696.method2501();
                                            Statics.method1329(var121, var122, var123);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 160) {
                                            Statics.field103 = field696.method2524();
                                            Statics.field77 = field696.method2522();
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 129) {
                                            field701 = field696.method2499();
                                            field702 = field696.method2499();
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 155) {
                                            int var124 = field696.method2539();
                                            Statics.field208 = Statics.field1295.method1493(var124);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 88) {
                                            int var125 = field696.method2541();
                                            int var126 = field696.method2549();
                                            class159 var127 = class159.method166(var126);
                                            if (var127 != null && var127.field2668 == 0) {
                                                if (var125 > var127.field2622 - var127.field2616) {
                                                    var125 = var127.field2622 - var127.field2616;
                                                }
                                                if (var125 < 0) {
                                                    var125 = 0;
                                                }
                                                if (var127.field2620 != var125) {
                                                    var127.field2620 = var125;
                                                    method2472(var127);
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 102) {
                                            field502 = field696.method2499();
                                            if (field502 == 1) {
                                                field503 = field696.method2501();
                                            }
                                            if (field502 >= 2 && field502 <= 6) {
                                                if (field502 == 2) {
                                                    field508 = 64;
                                                    field509 = 64;
                                                }
                                                if (field502 == 3) {
                                                    field508 = 0;
                                                    field509 = 64;
                                                }
                                                if (field502 == 4) {
                                                    field508 = 128;
                                                    field509 = 64;
                                                }
                                                if (field502 == 5) {
                                                    field508 = 64;
                                                    field509 = 0;
                                                }
                                                if (field502 == 6) {
                                                    field508 = 64;
                                                    field509 = 128;
                                                }
                                                field502 = 2;
                                                field505 = field696.method2501();
                                                field506 = field696.method2501();
                                                field507 = field696.method2499();
                                            }
                                            if (field502 == 10) {
                                                field597 = field696.method2501();
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 149) {
                                            int var128 = field696.method2530();
                                            byte var129 = field696.method2628();
                                            class160.field2726[var128] = var129;
                                            if (class160.field2727[var128] != var129) {
                                                class160.field2727[var128] = var129;
                                                method27(var128);
                                            }
                                            field703[++field669 - 1 & 0x1F] = var128;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 126) {
                                            int var130 = field696.method2497();
                                            class159 var131 = class159.method166(var130);
                                            for (int var132 = 0; var132 < var131.field2708.length; var132++) {
                                                var131.field2708[var132] = -1;
                                                var131.field2708[var132] = 0;
                                            }
                                            method2472(var131);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 32) {
                                            String var133 = field696.method2507();
                                            Object[] var134 = new Object[var133.length() + 1];
                                            for (int var135 = var133.length() - 1; var135 >= 0; var135--) {
                                                if (var133.charAt(var135) == 's') {
                                                    var134[var135 + 1] = field696.method2507();
                                                } else {
                                                    var134[var135 + 1] = Integer.valueOf(field696.method2548());
                                                }
                                            }
                                            var134[0] = Integer.valueOf(field696.method2548());
                                            class1 var136 = new class1();
                                            var136.field13 = var134;
                                            class26.method134(var136);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 124) {
                                            int var137 = field696.method2548();
                                            int var138 = field696.method2539();
                                            int var139 = field696.method2530();
                                            if (var139 == 65535) {
                                                var139 = -1;
                                            }
                                            class159 var140 = class159.method166(var138);
                                            if (var140.field2608) {
                                                var140.field2710 = var139;
                                                var140.field2711 = var137;
                                                class40 var142 = class40.method1333(var139);
                                                var140.field2715 = var142.field1026;
                                                var140.field2647 = var142.field1022;
                                                var140.field2646 = var142.field997;
                                                var140.field2686 = var142.field998;
                                                var140.field2717 = var142.field988;
                                                var140.field2649 = var142.field994;
                                                if (var140.field2615 > 0) {
                                                    var140.field2649 = var140.field2649 * 32 / var140.field2615;
                                                }
                                                method2472(var140);
                                            } else {
                                                if (var139 == -1) {
                                                    var140.field2638 = 0;
                                                    field744 = -1;
                                                    var84 = true;
                                                    break label3673;
                                                }
                                                class40 var141 = class40.method1333(var139);
                                                var140.field2638 = 4;
                                                var140.field2599 = var139;
                                                var140.field2715 = var141.field1026;
                                                var140.field2647 = var141.field1022;
                                                var140.field2649 = var141.field994 * 100 / var137;
                                                method2472(var140);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 133) {
                                            int var143 = field696.method2548();
                                            int var144 = field696.method2501();
                                            int var145 = field696.method2622();
                                            int var146 = field696.method2541();
                                            class159 var147 = class159.method166(var143);
                                            if (var147.field2715 != var145 || var147.field2647 != var144 || var147.field2649 != var146) {
                                                var147.field2715 = var145;
                                                var147.field2647 = var144;
                                                var147.field2649 = var146;
                                                method2472(var147);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 14) {
                                            int var148 = field696.method2549();
                                            int var149 = field696.method2530();
                                            class159 var150 = class159.method166(var148);
                                            if (var150.field2638 != 1 || var150.field2599 != var149) {
                                                var150.field2638 = 1;
                                                var150.field2599 = var149;
                                                method2472(var150);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 211) {
                                            int var151 = field529 + field696.field2027;
                                            int var152 = field696.method2501();
                                            int var153 = field696.method2501();
                                            if (field681 != var152) {
                                                field681 = var152;
                                                method37(field681);
                                                class26.method2395(field681);
                                                for (int var154 = 0; var154 < 100; var154++) {
                                                    field687[var154] = true;
                                                }
                                            }
                                            while (var153-- > 0) {
                                                int var155 = field696.method2548();
                                                int var156 = field696.method2501();
                                                int var157 = field696.method2499();
                                                class4 var158 = (class4) field653.method3354((long) var155);
                                                if (var158 != null && var158.field63 != var156) {
                                                    method62(var158, true);
                                                    var158 = null;
                                                }
                                                if (var158 == null) {
                                                    var158 = method2357(var155, var156, var157);
                                                }
                                                var158.field66 = true;
                                            }
                                            for (class4 var159 = (class4) field653.method3352(); var159 != null; var159 = (class4) field653.method3353()) {
                                                if (var159.field66) {
                                                    var159.field66 = false;
                                                } else {
                                                    method62(var159, true);
                                                }
                                            }
                                            field684 = new class175(512);
                                            while (field696.field2027 < var151) {
                                                int var160 = field696.method2548();
                                                int var161 = field696.method2501();
                                                int var162 = field696.method2501();
                                                int var163 = field696.method2548();
                                                for (int var164 = var161; var164 <= var162; var164++) {
                                                    long var165 = ((long) var160 << 32) + (long) var164;
                                                    field684.method3364(new class171(var163), var165);
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 7) {
                                            method1600();
                                            field649 = field696.method2499();
                                            field677 = field667;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 165) {
                                            int var167 = field696.method2549();
                                            String var168 = field696.method2507();
                                            class159 var169 = class159.method166(var167);
                                            if (!var168.equals(var169.field2653)) {
                                                var169.field2653 = var168;
                                                method2472(var169);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 93) {
                                            String var170 = field696.method2507();
                                            long var171 = field696.method2505();
                                            long var173 = (long) field696.method2501();
                                            long var175 = (long) field696.method2503();
                                            int var177 = field696.method2499();
                                            long var178 = (var173 << 32) + var175;
                                            boolean var180 = false;
                                            for (int var181 = 0; var181 < 100; var181++) {
                                                if (field536[var181] == var178) {
                                                    var180 = true;
                                                    break;
                                                }
                                            }
                                            if (var177 <= 1 && method57(var170)) {
                                                var180 = true;
                                            }
                                            if (!var180 && field637 == 0) {
                                                field536[field704] = var178;
                                                field704 = (field704 + 1) % 100;
                                                String var182 = class185.method3441(class148.method1626(class184.method547(field696)));
                                                if (var177 == 2 || var177 == 3) {
                                                    method34(9, class2.method231(1) + var170, var182, class147.method2080(var171));
                                                } else if (var177 == 1) {
                                                    method34(9, class2.method231(0) + var170, var182, class147.method2080(var171));
                                                } else {
                                                    method34(9, var170, var182, class147.method2080(var171));
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 158) {
                                            int var183 = field696.method2548();
                                            int var184 = field696.method2622();
                                            if (var184 == 65535) {
                                                var184 = -1;
                                            }
                                            int var185 = field696.method2501();
                                            if (var185 == 65535) {
                                                var185 = -1;
                                            }
                                            int var186 = field696.method2539();
                                            for (int var187 = var185; var187 <= var184; var187++) {
                                                long var188 = ((long) var183 << 32) + (long) var187;
                                                class179 var190 = field684.method3354(var188);
                                                if (var190 != null) {
                                                    var190.method3404();
                                                }
                                                field684.method3364(new class171(var186), var188);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 182) {
                                            field676 = field667;
                                            if (field529 == 0) {
                                                field709 = null;
                                                field710 = null;
                                                Statics.field1817 = 0;
                                                Statics.field199 = null;
                                                field744 = -1;
                                                var84 = true;
                                                break label3673;
                                            }
                                            field710 = field696.method2507();
                                            long var191 = field696.method2505();
                                            field709 = class147.method2481(var191);
                                            Statics.field2571 = field696.method2500();
                                            int var193 = field696.method2499();
                                            if (var193 == 255) {
                                                field744 = -1;
                                                var84 = true;
                                                break label3673;
                                            }
                                            Statics.field1817 = var193;
                                            class8[] var194 = new class8[100];
                                            for (int var195 = 0; var195 < Statics.field1817; var195++) {
                                                var194[var195] = new class8();
                                                var194[var195].field118 = field696.method2507();
                                                var194[var195].field117 = class149.method2249(var194[var195].field118, Statics.field661);
                                                var194[var195].field115 = field696.method2501();
                                                var194[var195].field116 = field696.method2500();
                                                field696.method2507();
                                                if (var194[var195].field118.equals(Statics.field461.field45)) {
                                                    Statics.field922 = var194[var195].field116;
                                                }
                                            }
                                            boolean var196 = false;
                                            int var197 = Statics.field1817;
                                            while (var197 > 0) {
                                                boolean var198 = true;
                                                var197--;
                                                for (int var199 = 0; var199 < var197; var199++) {
                                                    if (var194[var199].field117.compareTo(var194[var199 + 1].field117) > 0) {
                                                        class8 var200 = var194[var199];
                                                        var194[var199] = var194[var199 + 1];
                                                        var194[var199 + 1] = var200;
                                                        var198 = false;
                                                    }
                                                }
                                                if (var198) {
                                                    break;
                                                }
                                            }
                                            Statics.field199 = var194;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 104) {
                                            int var201 = field696.method2548();
                                            class159 var202 = class159.method166(var201);
                                            var202.field2638 = 3;
                                            var202.field2599 = Statics.field461.field51.method3274();
                                            method2472(var202);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 22) {
                                            field716 = field696.method2499();
                                            if (field716 == 255) {
                                                field716 = 0;
                                            }
                                            field717 = field696.method2499();
                                            if (field717 == 255) {
                                                field717 = 0;
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 48) {
                                            int var203 = field696.method2530();
                                            int var204 = field696.method2539();
                                            int var205 = var203 >> 10 & 0x1F;
                                            int var206 = var203 >> 5 & 0x1F;
                                            int var207 = var203 & 0x1F;
                                            int var208 = (var207 << 3) + (var205 << 19) + (var206 << 11);
                                            class159 var209 = class159.method166(var204);
                                            if (var209.field2623 != var208) {
                                                var209.field2623 = var208;
                                                method2472(var209);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 56) {
                                            int var210 = field696.method2501();
                                            int var211 = field696.method2582();
                                            int var212 = field696.method2539();
                                            class4 var213 = (class4) field653.method3354((long) var212);
                                            if (var213 != null) {
                                                method62(var213, var213.field63 != var210);
                                            }
                                            method2357(var212, var210, var211);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 47) {
                                            method786(false);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 207) {
                                            int var214 = field696.method2499();
                                            int var215 = field696.method2499();
                                            int var216 = field696.method2524();
                                            Statics.field1113 = var214 >> 1;
                                            Statics.field461.method255(var215, var216, (var214 & 0x1) == 1);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 240) {
                                            for (int var217 = 0; var217 < field729.length; var217++) {
                                                if (field729[var217] != null) {
                                                    field729[var217].field450 = -1;
                                                }
                                            }
                                            for (int var218 = 0; var218 < field603.length; var218++) {
                                                if (field603[var218] != null) {
                                                    field603[var218].field450 = -1;
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 234) {
                                            field570 = true;
                                            Statics.field967 = field696.method2499();
                                            Statics.field398 = field696.method2499();
                                            Statics.field1783 = field696.method2501();
                                            Statics.field954 = field696.method2499();
                                            Statics.field252 = field696.method2499();
                                            if (Statics.field252 >= 100) {
                                                Statics.field1797 = Statics.field967 * 128 + 64;
                                                Statics.field391 = Statics.field398 * 128 + 64;
                                                Statics.field1737 = method183(Statics.field1797, Statics.field391, Statics.field1113) - Statics.field1783;
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 196) {
                                            int var219 = field696.method2548();
                                            int var220 = field696.method2501();
                                            if (var219 < -70000) {
                                                var220 += 32768;
                                            }
                                            class159 var221;
                                            if (var219 >= 0) {
                                                var221 = class159.method166(var219);
                                            } else {
                                                var221 = null;
                                            }
                                            while (field696.field2027 < field529) {
                                                int var222 = field696.method2564();
                                                int var223 = field696.method2501();
                                                int var224 = 0;
                                                if (var223 != 0) {
                                                    var224 = field696.method2499();
                                                    if (var224 == 255) {
                                                        var224 = field696.method2548();
                                                    }
                                                }
                                                if (var221 != null && var222 >= 0 && var222 < var221.field2708.length) {
                                                    var221.field2708[var222] = var223;
                                                    var221.field2663[var222] = var224;
                                                }
                                                class19.method2268(var220, var222, var223 - 1, var224);
                                            }
                                            if (var221 != null) {
                                                method2472(var221);
                                            }
                                            method1600();
                                            field580[++field686 - 1 & 0x1F] = var220 & 0x7FFF;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 236) {
                                            field501 = field696.method2501() * 30;
                                            field677 = field667;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 245) {
                                            class116 var225 = field696;
                                            int var226 = field529;
                                            class181 var227 = new class181();
                                            var227.field2826 = var225.method2499();
                                            var227.field2825 = var225.method2548();
                                            var227.field2833 = new int[var227.field2826];
                                            var227.field2828 = new int[var227.field2826];
                                            var227.field2829 = new Field[var227.field2826];
                                            var227.field2830 = new int[var227.field2826];
                                            var227.field2831 = new Method[var227.field2826];
                                            var227.field2832 = new byte[var227.field2826][][];
                                            for (int var228 = 0; var228 < var227.field2826; var228++) {
                                                try {
                                                    int var229 = var225.method2499();
                                                    if (var229 == 0 || var229 == 1 || var229 == 2) {
                                                        String var230 = new String(var225.method2507());
                                                        String var231 = new String(var225.method2507());
                                                        int var232 = 0;
                                                        if (var229 == 1) {
                                                            var232 = var225.method2548();
                                                        }
                                                        var227.field2833[var228] = var229;
                                                        var227.field2830[var228] = var232;
                                                        var227.field2829[var228] = class182.method234(var230).getDeclaredField(var231);
                                                    } else if (var229 == 3 || var229 == 4) {
                                                        String var233 = new String(var225.method2507());
                                                        String var234 = new String(var225.method2507());
                                                        int var235 = var225.method2499();
                                                        String[] var236 = new String[var235];
                                                        for (int var237 = 0; var237 < var235; var237++) {
                                                            var236[var237] = new String(var225.method2507());
                                                        }
                                                        byte[][] var238 = new byte[var235][];
                                                        if (var229 == 3) {
                                                            for (int var239 = 0; var239 < var235; var239++) {
                                                                int var240 = var225.method2548();
                                                                var238[var239] = new byte[var240];
                                                                var225.method2510(var238[var239], 0, var240);
                                                            }
                                                        }
                                                        var227.field2833[var228] = var229;
                                                        Class[] var241 = new Class[var235];
                                                        for (int var242 = 0; var242 < var235; var242++) {
                                                            var241[var242] = class182.method234(var236[var242]);
                                                        }
                                                        var227.field2831[var228] = class182.method234(var233).getDeclaredMethod(var234, var241);
                                                        var227.field2832[var228] = var238;
                                                    }
                                                } catch (ClassNotFoundException var520) {
                                                    var227.field2828[var228] = -1;
                                                } catch (SecurityException var521) {
                                                    var227.field2828[var228] = -2;
                                                } catch (NullPointerException var522) {
                                                    var227.field2828[var228] = -3;
                                                } catch (Exception var523) {
                                                    var227.field2828[var228] = -4;
                                                } catch (Throwable var524) {
                                                    var227.field2828[var228] = -5;
                                                }
                                            }
                                            class182.field2834.method3381(var227);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 52) {
                                            field570 = false;
                                            for (int var248 = 0; var248 < 5; var248++) {
                                                field566[var248] = false;
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 255) {
                                            int var249 = field696.method2499();
                                            class138[] var250 = class138.method236();
                                            int var251 = 0;
                                            class138 var253;
                                            while (true) {
                                                if (var251 >= var250.length) {
                                                    var253 = null;
                                                    break;
                                                }
                                                class138 var252 = var250[var251];
                                                if (var252.field2343 == var249) {
                                                    var253 = var252;
                                                    break;
                                                }
                                                var251++;
                                            }
                                            Statics.field1916 = var253;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 62) {
                                            field718 = field696.method2499();
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 205) {
                                            method1600();
                                            field567 = field696.method2511();
                                            field677 = field667;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 112) {
                                            field611 = 0;
                                            field594 = 0;
                                            field696.method2373();
                                            int var254 = field696.method2359(8);
                                            if (var254 < field624) {
                                                for (int var255 = var254; var255 < field624; var255++) {
                                                    field612[++field611 - 1] = field525[var255];
                                                }
                                            }
                                            if (var254 > field624) {
                                                throw new RuntimeException("");
                                            }
                                            field624 = 0;
                                            for (int var256 = 0; var256 < var254; var256++) {
                                                int var257 = field525[var256];
                                                class25 var258 = field603[var257];
                                                int var259 = field696.method2359(1);
                                                if (var259 == 0) {
                                                    field525[++field624 - 1] = var257;
                                                    var258.field471 = field496;
                                                } else {
                                                    int var260 = field696.method2359(2);
                                                    if (var260 == 0) {
                                                        field525[++field624 - 1] = var257;
                                                        var258.field471 = field496;
                                                        field607[++field594 - 1] = var257;
                                                    } else if (var260 == 1) {
                                                        field525[++field624 - 1] = var257;
                                                        var258.field471 = field496;
                                                        int var261 = field696.method2359(3);
                                                        var258.method256(var261, false);
                                                        int var262 = field696.method2359(1);
                                                        if (var262 == 1) {
                                                            field607[++field594 - 1] = var257;
                                                        }
                                                    } else if (var260 == 2) {
                                                        field525[++field624 - 1] = var257;
                                                        var258.field471 = field496;
                                                        int var263 = field696.method2359(3);
                                                        var258.method256(var263, true);
                                                        int var264 = field696.method2359(3);
                                                        var258.method256(var264, true);
                                                        int var265 = field696.method2359(1);
                                                        if (var265 == 1) {
                                                            field607[++field594 - 1] = var257;
                                                        }
                                                    } else if (var260 == 3) {
                                                        field612[++field611 - 1] = var257;
                                                    }
                                                }
                                            }
                                            while (field696.method2363(field529) >= 27) {
                                                int var266 = field696.method2359(15);
                                                if (var266 == 32767) {
                                                    break;
                                                }
                                                boolean var267 = false;
                                                if (field603[var266] == null) {
                                                    field603[var266] = new class25();
                                                    var267 = true;
                                                }
                                                class25 var268 = field603[var266];
                                                field525[++field624 - 1] = var266;
                                                var268.field471 = field496;
                                                var268.field395 = class31.method898(field696.method2359(14));
                                                int var269 = field696.method2359(1);
                                                if (var269 == 1) {
                                                    field607[++field594 - 1] = var266;
                                                }
                                                int var270 = field696.method2359(5);
                                                if (var270 > 15) {
                                                    var270 -= 32;
                                                }
                                                int var271 = field696.method2359(1);
                                                int var272 = field696.method2359(5);
                                                if (var272 > 15) {
                                                    var272 -= 32;
                                                }
                                                int var273 = field732[field696.method2359(3)];
                                                if (var267) {
                                                    var268.field469 = var268.field423 = var273;
                                                }
                                                var268.field458 = var268.field395.field794;
                                                var268.field459 = var268.field395.field809;
                                                if (var268.field459 == 0) {
                                                    var268.field423 = 0;
                                                }
                                                var268.field429 = var268.field395.field792;
                                                var268.field434 = var268.field395.field780;
                                                var268.field431 = var268.field395.field783;
                                                var268.field444 = var268.field395.field795;
                                                var268.field426 = var268.field395.field797;
                                                var268.field427 = var268.field395.field803;
                                                var268.field428 = var268.field395.field791;
                                                var268.method255(Statics.field461.field473[0] + var272, Statics.field461.field474[0] + var270, var271 == 1);
                                            }
                                            field696.method2364();
                                            for (int var274 = 0; var274 < field594; var274++) {
                                                int var275 = field607[var274];
                                                class25 var276 = field603[var275];
                                                int var277 = field696.method2499();
                                                if ((var277 & 0x10) != 0) {
                                                    int var278 = field696.method2582();
                                                    int var279 = field696.method2499();
                                                    var276.method258(var278, var279, field496);
                                                    var276.field435 = field496 + 300;
                                                    var276.field442 = field696.method2524();
                                                    var276.field443 = field696.method2522();
                                                }
                                                if ((var277 & 0x2) != 0) {
                                                    var276.field462 = field696.method2507();
                                                    var276.field424 = 100;
                                                }
                                                if ((var277 & 0x4) != 0) {
                                                    var276.field395 = class31.method898(field696.method2622());
                                                    var276.field458 = var276.field395.field794;
                                                    var276.field459 = var276.field395.field809;
                                                    var276.field429 = var276.field395.field792;
                                                    var276.field434 = var276.field395.field780;
                                                    var276.field431 = var276.field395.field783;
                                                    var276.field444 = var276.field395.field795;
                                                    var276.field426 = var276.field395.field797;
                                                    var276.field427 = var276.field395.field803;
                                                    var276.field428 = var276.field395.field791;
                                                }
                                                if ((var277 & 0x1) != 0) {
                                                    var276.field455 = field696.method2530();
                                                    int var280 = field696.method2549();
                                                    var276.field441 = var280 >> 16;
                                                    var276.field464 = (var280 & 0xFFFF) + field496;
                                                    var276.field456 = 0;
                                                    var276.field477 = 0;
                                                    if (var276.field464 > field496) {
                                                        var276.field456 = -1;
                                                    }
                                                    if (var276.field455 == 65535) {
                                                        var276.field455 = -1;
                                                    }
                                                }
                                                if ((var277 & 0x80) != 0) {
                                                    var276.field478 = field696.method2501();
                                                    var276.field446 = field696.method2541();
                                                }
                                                if ((var277 & 0x8) != 0) {
                                                    int var281 = field696.method2522();
                                                    int var282 = field696.method2582();
                                                    var276.method258(var281, var282, field496);
                                                    var276.field435 = field496 + 300;
                                                    var276.field442 = field696.method2582();
                                                    var276.field443 = field696.method2499();
                                                }
                                                if ((var277 & 0x20) != 0) {
                                                    int var283 = field696.method2501();
                                                    if (var283 == 65535) {
                                                        var283 = -1;
                                                    }
                                                    int var284 = field696.method2522();
                                                    if (var276.field450 == var283 && var283 != -1) {
                                                        int var285 = class34.method152(var283).field900;
                                                        if (var285 == 1) {
                                                            var276.field430 = 0;
                                                            var276.field452 = 0;
                                                            var276.field453 = var284;
                                                            var276.field454 = 0;
                                                        }
                                                        if (var285 == 2) {
                                                            var276.field454 = 0;
                                                        }
                                                    } else if (var283 == -1 || var276.field450 == -1 || class34.method152(var283).field894 >= class34.method152(var276.field450).field894) {
                                                        var276.field450 = var283;
                                                        var276.field430 = 0;
                                                        var276.field452 = 0;
                                                        var276.field453 = var284;
                                                        var276.field454 = 0;
                                                        var276.field475 = var276.field472;
                                                    }
                                                }
                                                if ((var277 & 0x40) != 0) {
                                                    var276.field457 = field696.method2622();
                                                    if (var276.field457 == 65535) {
                                                        var276.field457 = -1;
                                                    }
                                                }
                                            }
                                            for (int var286 = 0; var286 < field611; var286++) {
                                                int var287 = field612[var286];
                                                if (field496 != field603[var287].field471) {
                                                    field603[var287].field395 = null;
                                                    field603[var287] = null;
                                                }
                                            }
                                            if (field529 != field696.field2027) {
                                                throw new RuntimeException(field696.field2027 + class2.field26 + field529);
                                            }
                                            for (int var288 = 0; var288 < field624; var288++) {
                                                if (field603[field525[var288]] == null) {
                                                    throw new RuntimeException(var288 + class2.field26 + field624);
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 183) {
                                            String var289 = field696.method2507();
                                            if (var289.endsWith(":tradereq:")) {
                                                String var290 = var289.substring(0, var289.indexOf(":"));
                                                boolean var291 = false;
                                                if (method57(var290)) {
                                                    var291 = true;
                                                }
                                                if (!var291 && field637 == 0) {
                                                    method1557(4, var290, class135.field2225);
                                                }
                                            } else if (var289.endsWith(":duelreq:")) {
                                                String var292 = var289.substring(0, var289.indexOf(":"));
                                                boolean var293 = false;
                                                if (method57(var292)) {
                                                    var293 = true;
                                                }
                                                if (!var293 && field637 == 0) {
                                                    method1557(8, var292, class135.field2226);
                                                }
                                            } else if (var289.endsWith(":chalreq:")) {
                                                String var294 = var289.substring(0, var289.indexOf(":"));
                                                boolean var295 = false;
                                                if (method57(var294)) {
                                                    var295 = true;
                                                }
                                                if (!var295 && field637 == 0) {
                                                    String var296 = var289.substring(var289.indexOf(":") + 1, var289.length() - 9);
                                                    method1557(8, var294, var296);
                                                }
                                            } else if (var289.endsWith(":assistreq:")) {
                                                String var297 = var289.substring(0, var289.indexOf(":"));
                                                boolean var298 = false;
                                                if (method57(var297)) {
                                                    var298 = true;
                                                }
                                                if (!var298 && field637 == 0) {
                                                    method1557(10, var297, "");
                                                }
                                            } else if (var289.endsWith(":clan:")) {
                                                String var299 = var289.substring(0, var289.indexOf(":clan:"));
                                                method1557(11, "", var299);
                                            } else if (var289.endsWith(":trade:")) {
                                                String var300 = var289.substring(0, var289.indexOf(":trade:"));
                                                if (field637 == 0) {
                                                    method1557(12, "", var300);
                                                }
                                            } else if (var289.endsWith(":assist:")) {
                                                String var301 = var289.substring(0, var289.indexOf(":assist:"));
                                                if (field637 == 0) {
                                                    method1557(13, "", var301);
                                                }
                                            } else if (var289.endsWith(":broadcast:")) {
                                                String var302 = var289.substring(0, var289.indexOf(":broadcast:"));
                                                if (field637 == 0) {
                                                    method1557(14, "", var302);
                                                }
                                            } else {
                                                method1557(0, "", var289);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 101) {
                                            int var303 = field696.method2499();
                                            int var304 = field696.method2499();
                                            int var305 = field696.method2499();
                                            int var306 = field696.method2499();
                                            field566[var303] = true;
                                            field614[var303] = var304;
                                            field733[var303] = var305;
                                            field734[var303] = var306;
                                            field735[var303] = 0;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 38) {
                                            Statics.field103 = field696.method2524();
                                            Statics.field77 = field696.method2582();
                                            for (int var307 = Statics.field77; var307 < Statics.field77 + 8; var307++) {
                                                for (int var308 = Statics.field103; var308 < Statics.field103 + 8; var308++) {
                                                    if (field617[Statics.field1113][var307][var308] != null) {
                                                        field617[Statics.field1113][var307][var308] = null;
                                                        method252(var307, var308);
                                                    }
                                                }
                                            }
                                            for (class22 var309 = (class22) field616.method3373(); var309 != null; var309 = (class22) field616.method3375()) {
                                                if (var309.field349 >= Statics.field77 && var309.field349 < Statics.field77 + 8 && var309.field350 >= Statics.field103 && var309.field350 < Statics.field103 + 8 && Statics.field1113 == var309.field364) {
                                                    var309.field365 = 0;
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 168) {
                                            if (field681 != -1) {
                                                int var310 = field681;
                                                if (class159.method687(var310)) {
                                                    method38(Statics.field2641[var310], 0);
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 213) {
                                            String var311 = field696.method2507();
                                            class116 var312 = field696;
                                            String var313 = class184.method222(var312, 32767);
                                            String var314 = class185.method3441(class148.method1626(var313));
                                            method1557(6, var311, var314);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 142) {
                                            int var315 = field696.method2541();
                                            int var316 = field696.method2497();
                                            class159 var317 = class159.method166(var316);
                                            if (var317.field2638 != 2 || var317.field2599 != var315) {
                                                var317.field2638 = 2;
                                                var317.field2599 = var315;
                                                method2472(var317);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 167) {
                                            method102();
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 180) {
                                            int var318 = field696.method2548();
                                            int var319 = field696.method2501();
                                            if (var318 < -70000) {
                                                var319 += 32768;
                                            }
                                            class159 var320;
                                            if (var318 >= 0) {
                                                var320 = class159.method166(var318);
                                            } else {
                                                var320 = null;
                                            }
                                            if (var320 != null) {
                                                for (int var321 = 0; var321 < var320.field2708.length; var321++) {
                                                    var320.field2708[var321] = 0;
                                                    var320.field2663[var321] = 0;
                                                }
                                            }
                                            class19 var322 = (class19) class19.field289.method3354((long) var319);
                                            if (var322 != null) {
                                                for (int var323 = 0; var323 < var322.field288.length; var323++) {
                                                    var322.field288[var323] = -1;
                                                    var322.field290[var323] = 0;
                                                }
                                            }
                                            int var324 = field696.method2501();
                                            for (int var325 = 0; var325 < var324; var325++) {
                                                int var326 = field696.method2524();
                                                if (var326 == 255) {
                                                    var326 = field696.method2497();
                                                }
                                                int var327 = field696.method2530();
                                                if (var320 != null && var325 < var320.field2708.length) {
                                                    var320.field2708[var325] = var327;
                                                    var320.field2663[var325] = var326;
                                                }
                                                class19.method2268(var319, var325, var327 - 1, var326);
                                            }
                                            if (var320 != null) {
                                                method2472(var320);
                                            }
                                            method1600();
                                            field580[++field686 - 1 & 0x1F] = var319 & 0x7FFF;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 95) {
                                            for (int var328 = 0; var328 < class160.field2727.length; var328++) {
                                                if (class160.field2727[var328] != class160.field2726[var328]) {
                                                    class160.field2727[var328] = class160.field2726[var328];
                                                    method27(var328);
                                                    field703[++field669 - 1 & 0x1F] = var328;
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 12) {
                                            int var329 = field696.method2501();
                                            int var330 = field696.method2530();
                                            int var331 = field696.method2497();
                                            class159 var332 = class159.method166(var331);
                                            var332.field2684 = (var330 << 16) + var329;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 169) {
                                            while (field696.field2027 < field529) {
                                                int var333 = field696.method2499();
                                                boolean var334 = (var333 & 0x1) == 1;
                                                String var335 = field696.method2507();
                                                String var336 = field696.method2507();
                                                field696.method2507();
                                                for (int var337 = 0; var337 < field493; var337++) {
                                                    class11 var338 = field741[var337];
                                                    if (var334) {
                                                        if (var336.equals(var338.field185)) {
                                                            var338.field185 = var335;
                                                            var338.field178 = var336;
                                                            var335 = null;
                                                            break;
                                                        }
                                                    } else if (var335.equals(var338.field185)) {
                                                        var338.field185 = var335;
                                                        var338.field178 = var336;
                                                        var335 = null;
                                                        break;
                                                    }
                                                }
                                                if (var335 != null && field493 < 400) {
                                                    class11 var339 = new class11();
                                                    field741[field493] = var339;
                                                    var339.field185 = var335;
                                                    var339.field178 = var336;
                                                    field493++;
                                                }
                                            }
                                            field675 = field667;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 55) {
                                            while (field696.field2027 < field529) {
                                                boolean var340 = field696.method2499() == 1;
                                                String var341 = field696.method2507();
                                                String var342 = field696.method2507();
                                                int var343 = field696.method2501();
                                                int var344 = field696.method2499();
                                                int var345 = field696.method2499();
                                                boolean var346 = (var345 & 0x2) != 0;
                                                boolean var347 = (var345 & 0x1) != 0;
                                                if (var343 > 0) {
                                                    field696.method2507();
                                                    field696.method2499();
                                                    field696.method2548();
                                                }
                                                field696.method2507();
                                                for (int var348 = 0; var348 < field736; var348++) {
                                                    class23 var349 = field738[var348];
                                                    if (var340) {
                                                        if (var342.equals(var349.field380)) {
                                                            var349.field380 = var341;
                                                            var349.field369 = var342;
                                                            var341 = null;
                                                            break;
                                                        }
                                                    } else if (var341.equals(var349.field380)) {
                                                        if (var349.field368 != var343) {
                                                            boolean var350 = true;
                                                            for (class28 var351 = (class28) field551.method3341(); var351 != null; var351 = (class28) field551.method3332()) {
                                                                if (var351.field747.equals(var341)) {
                                                                    if (var343 != 0 && var351.field749 == 0) {
                                                                        var351.method3400();
                                                                        var350 = false;
                                                                    } else if (var343 == 0 && var351.field749 != 0) {
                                                                        var351.method3400();
                                                                        var350 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var350) {
                                                                field551.method3339(new class28(var341, var343));
                                                            }
                                                            var349.field368 = var343;
                                                        }
                                                        var349.field369 = var342;
                                                        var349.field371 = var344;
                                                        var349.field372 = var346;
                                                        var349.field373 = var347;
                                                        var341 = null;
                                                        break;
                                                    }
                                                }
                                                if (var341 != null && field736 < 400) {
                                                    class23 var352 = new class23();
                                                    field738[field736] = var352;
                                                    var352.field380 = var341;
                                                    var352.field369 = var342;
                                                    var352.field368 = var343;
                                                    var352.field371 = var344;
                                                    var352.field372 = var346;
                                                    var352.field373 = var347;
                                                    field736++;
                                                }
                                            }
                                            field737 = 2;
                                            field675 = field667;
                                            boolean var353 = false;
                                            int var354 = field736;
                                            while (var354 > 0) {
                                                boolean var355 = true;
                                                var354--;
                                                for (int var356 = 0; var356 < var354; var356++) {
                                                    boolean var357 = false;
                                                    class23 var358 = field738[var356];
                                                    class23 var359 = field738[var356 + 1];
                                                    if (field740 != var358.field368 && field740 == var359.field368) {
                                                        var357 = true;
                                                    }
                                                    if (!var357 && var358.field368 == 0 && var359.field368 != 0) {
                                                        var357 = true;
                                                    }
                                                    if (!var357 && !var358.field372 && var359.field372) {
                                                        var357 = true;
                                                    }
                                                    if (!var357 && !var358.field373 && var359.field373) {
                                                        var357 = true;
                                                    }
                                                    if (var357) {
                                                        class23 var360 = field738[var356];
                                                        field738[var356] = field738[var356 + 1];
                                                        field738[var356 + 1] = var360;
                                                        var355 = false;
                                                    }
                                                }
                                                if (var355) {
                                                    break;
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 248) {
                                            method1600();
                                            int var361 = field696.method2522();
                                            int var362 = field696.method2497();
                                            int var363 = field696.method2522();
                                            field623[var361] = var362;
                                            field621[var361] = var363;
                                            field622[var361] = 1;
                                            for (int var364 = 0; var364 < 98; var364++) {
                                                if (var362 >= class131.field2057[var364]) {
                                                    field622[var361] = var364 + 2;
                                                }
                                            }
                                            field672[++field602 - 1 & 0x1F] = var361;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 16) {
                                            field696.field2027 += 28;
                                            if (field696.method2519()) {
                                                class82.method1489(field696, field696.field2027 - 28);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 83) {
                                            String var365 = field696.method2507();
                                            int var366 = field696.method2582();
                                            int var367 = field696.method2524();
                                            if (var367 >= 1 && var367 <= 8) {
                                                if (var365.equalsIgnoreCase("null")) {
                                                    var365 = null;
                                                }
                                                field642[var367 - 1] = var365;
                                                field615[var367 - 1] = var366 == 0;
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 219) {
                                            method1552();
                                            field744 = -1;
                                            var84 = false;
                                            break label3673;
                                        }
                                        if (field744 == 114) {
                                            int var368 = field696.method2501();
                                            class19.method807(var368);
                                            field580[++field686 - 1 & 0x1F] = var368 & 0x7FFF;
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 94) {
                                            field570 = true;
                                            Statics.field37 = field696.method2499();
                                            Statics.field1450 = field696.method2499();
                                            Statics.field1029 = field696.method2501();
                                            Statics.field1182 = field696.method2499();
                                            Statics.field93 = field696.method2499();
                                            if (Statics.field93 >= 100) {
                                                int var369 = Statics.field37 * 128 + 64;
                                                int var370 = Statics.field1450 * 128 + 64;
                                                int var371 = method183(var369, var370, Statics.field1113) - Statics.field1029;
                                                int var372 = var369 - Statics.field1797;
                                                int var373 = var371 - Statics.field1737;
                                                int var374 = var370 - Statics.field391;
                                                int var375 = (int) Math.sqrt((double) (var372 * var372 + var374 * var374));
                                                Statics.field2419 = (int) (Math.atan2((double) var373, (double) var375) * 325.949D) & 0x7FF;
                                                Statics.field2425 = (int) (Math.atan2((double) var372, (double) var374) * -325.949D) & 0x7FF;
                                                if (Statics.field2419 < 128) {
                                                    Statics.field2419 = 128;
                                                }
                                                if (Statics.field2419 > 383) {
                                                    Statics.field2419 = 383;
                                                }
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 177) {
                                            int var376 = field696.method2530();
                                            if (var376 == 65535) {
                                                var376 = -1;
                                            }
                                            method1627(var376);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 90) {
                                            int var377 = field696.method2622();
                                            if (var377 == 65535) {
                                                var377 = -1;
                                            }
                                            int var378 = field696.method2503();
                                            method2238(var377, var378);
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        if (field744 == 164) {
                                            int var379 = field696.method2542();
                                            int var380 = field696.method2542();
                                            int var381 = field696.method2497();
                                            class159 var382 = class159.method166(var381);
                                            int var383 = var382.field2613 + var379;
                                            int var384 = var382.field2614 + var380;
                                            if (var382.field2611 != var383 || var382.field2612 != var384) {
                                                var382.field2611 = var383;
                                                var382.field2612 = var384;
                                                method2472(var382);
                                            }
                                            field744 = -1;
                                            var84 = true;
                                            break label3673;
                                        }
                                        class80.method1330("" + field744 + class2.field26 + field535 + class2.field26 + field547 + class2.field26 + field529, (Throwable) null);
                                        method1552();
                                    } catch (IOException var525) {
                                        method2758();
                                    } catch (Exception var526) {
                                        String var387 = "" + field744 + class2.field26 + field535 + class2.field26 + field547 + class2.field26 + field529 + class2.field26 + (Statics.field1399 + Statics.field461.field473[0]) + class2.field26 + (Statics.field113 + Statics.field461.field474[0]) + class2.field26;
                                        for (int var388 = 0; var388 < field529 && var388 < 50; var388++) {
                                            var387 = var387 + field696.field2030[var388] + class2.field26;
                                        }
                                        class80.method1330(var387, var526);
                                        method1552();
                                    }
                                    var84 = true;
                                }
                            }
                            if (!var84) {
                                break;
                            }
                        }
                        if (field492 == 30) {
                            class182.method2923(field605, 247);
                            Object var389 = Statics.field268.field264;
                            synchronized (Statics.field268.field264) {
                                if (!field482) {
                                    Statics.field268.field258 = 0;
                                } else if (class77.field1369 != 0 || Statics.field268.field258 >= 40) {
                                    field605.method2360(13);
                                    field605.method2485(0);
                                    int var390 = field605.field2027;
                                    int var391 = 0;
                                    for (int var392 = 0; var392 < Statics.field268.field258 && field605.field2027 - var390 < 240; var392++) {
                                        var391++;
                                        int var393 = Statics.field268.field260[var392];
                                        if (var393 < 0) {
                                            var393 = 0;
                                        } else if (var393 > 502) {
                                            var393 = 502;
                                        }
                                        int var394 = Statics.field268.field259[var392];
                                        if (var394 < 0) {
                                            var394 = 0;
                                        } else if (var394 > 764) {
                                            var394 = 764;
                                        }
                                        int var395 = var393 * 765 + var394;
                                        if (Statics.field268.field260[var392] == -1 && Statics.field268.field259[var392] == -1) {
                                            var394 = -1;
                                            var393 = -1;
                                            var395 = 524287;
                                        }
                                        if (field671 != var394 || field497 != var393) {
                                            int var396 = var394 - field671;
                                            field671 = var394;
                                            int var397 = var393 - field497;
                                            field497 = var393;
                                            if (field498 < 8 && var396 >= -32 && var396 <= 31 && var397 >= -32 && var397 <= 31) {
                                                var396 += 32;
                                                var397 += 32;
                                                field605.method2484((field498 << 12) + (var396 << 6) + var397);
                                                field498 = 0;
                                            } else if (field498 < 8) {
                                                field605.method2487((field498 << 19) + 8388608 + var395);
                                                field498 = 0;
                                            } else {
                                                field605.method2605((field498 << 19) + -1073741824 + var395);
                                                field498 = 0;
                                            }
                                        } else if (field498 < 2047) {
                                            field498++;
                                        }
                                    }
                                    field605.method2496(field605.field2027 - var390);
                                    if (var391 >= Statics.field268.field258) {
                                        Statics.field268.field258 = 0;
                                    } else {
                                        Statics.field268.field258 -= var391;
                                        for (int var398 = 0; var398 < Statics.field268.field258; var398++) {
                                            Statics.field268.field259[var398] = Statics.field268.field259[var391 + var398];
                                            Statics.field268.field260[var398] = Statics.field268.field260[var391 + var398];
                                        }
                                    }
                                }
                            }
                            if (class77.field1369 == 1 || !Statics.field876 && class77.field1369 == 4 || class77.field1369 == 2) {
                                long var400 = (class77.field1383 - field739 * -1L) / 50L;
                                if (var400 > 4095L) {
                                    var400 = 4095L;
                                }
                                field739 = class77.field1383 * -1L;
                                int var402 = class77.field1382;
                                if (var402 < 0) {
                                    var402 = 0;
                                } else if (var402 > 502) {
                                    var402 = 502;
                                }
                                int var403 = class77.field1381;
                                if (var403 < 0) {
                                    var403 = 0;
                                } else if (var403 > 764) {
                                    var403 = 764;
                                }
                                int var404 = var402 * 765 + var403;
                                byte var405 = 0;
                                if (class77.field1369 == 2) {
                                    var405 = 1;
                                }
                                int var406 = (int) var400;
                                field605.method2360(40);
                                field605.method2605((var405 << 19) + (var406 << 20) + var404);
                            }
                            if (class75.field1332 > 0) {
                                field605.method2360(121);
                                field605.method2484(0);
                                int var407 = field605.field2027;
                                long var408 = class121.method226();
                                for (int var410 = 0; var410 < class75.field1332; var410++) {
                                    long var411 = var408 - field583;
                                    if (var411 > 16777215L) {
                                        var411 = 16777215L;
                                    }
                                    field583 = var408;
                                    field605.method2521(class75.field1351[var410]);
                                    field605.method2535((int) var411);
                                }
                                field605.method2495(field605.field2027 - var407);
                            }
                            if (field593 > 0) {
                                field593--;
                            }
                            if (class75.field1345[96] || class75.field1345[97] || class75.field1345[98] || class75.field1345[99]) {
                                field574 = true;
                            }
                            if (field574 && field593 <= 0) {
                                field593 = 20;
                                field574 = false;
                                field605.method2360(223);
                                field605.method2498(field568);
                                field605.method2529(field491);
                            }
                            if (Statics.field206 && !field499) {
                                field499 = true;
                                field605.method2360(112);
                                field605.method2485(1);
                            }
                            if (!Statics.field206 && field499) {
                                field499 = false;
                                field605.method2360(112);
                                field605.method2485(0);
                            }
                            if (field490 && Statics.field1113 != field538) {
                                method187(Statics.field2002, Statics.field254, Statics.field1113, Statics.field461.field473[0], Statics.field461.field474[0]);
                            } else if (Statics.field1113 != field711) {
                                field711 = Statics.field1113;
                                method169(Statics.field1113);
                            }
                            if (field492 == 30) {
                                for (class22 var413 = (class22) field616.method3373(); var413 != null; var413 = (class22) field616.method3375()) {
                                    if (var413.field365 > 0) {
                                        var413.field365--;
                                    }
                                    if (var413.field365 == 0) {
                                        if (var413.field356 >= 0) {
                                            int var414 = var413.field356;
                                            int var415 = var413.field353;
                                            class32 var416 = class32.method249(var414);
                                            if (var415 == 11) {
                                                var415 = 10;
                                            }
                                            if (var415 >= 5 && var415 <= 8) {
                                                var415 = 4;
                                            }
                                            boolean var417 = var416.method677(var415);
                                            if (!var417) {
                                                continue;
                                            }
                                        }
                                        method3042(var413.field364, var413.field352, var413.field349, var413.field350, var413.field356, var413.field355, var413.field353);
                                        var413.method3404();
                                    } else {
                                        if (var413.field357 > 0) {
                                            var413.field357--;
                                        }
                                        if (var413.field357 == 0 && var413.field349 >= 1 && var413.field350 >= 1 && var413.field349 <= 102 && var413.field350 <= 102) {
                                            if (var413.field354 >= 0) {
                                                int var418 = var413.field354;
                                                int var419 = var413.field358;
                                                class32 var420 = class32.method249(var418);
                                                if (var419 == 11) {
                                                    var419 = 10;
                                                }
                                                if (var419 >= 5 && var419 <= 8) {
                                                    var419 = 4;
                                                }
                                                boolean var421 = var420.method677(var419);
                                                if (!var421) {
                                                    continue;
                                                }
                                            }
                                            method3042(var413.field364, var413.field352, var413.field349, var413.field350, var413.field354, var413.field347, var413.field358);
                                            var413.field357 = -1;
                                            if (var413.field356 == var413.field354 && var413.field356 == -1) {
                                                var413.method3404();
                                            } else if (var413.field356 == var413.field354 && var413.field355 == var413.field347 && var413.field358 == var413.field353) {
                                                var413.method3404();
                                            }
                                        }
                                    }
                                }
                                int var10002;
                                for (int var422 = 0; var422 < field724; var422++) {
                                    var10002 = field727[var422]--;
                                    if (field727[var422] >= -10) {
                                        class57 var424 = field526[var422];
                                        if (var424 == null) {
                                            class57 var528 = (class57) null;
                                            var424 = class57.method1276(Statics.field2778, field666[var422], 0);
                                            if (var424 == null) {
                                                continue;
                                            }
                                            field727[var422] += var424.method1275();
                                            field526[var422] = var424;
                                        }
                                        if (field727[var422] < 0) {
                                            int var431;
                                            if (field728[var422] == 0) {
                                                var431 = field663;
                                            } else {
                                                int var425 = (field728[var422] & 0xFF) * 128;
                                                int var426 = field728[var422] >> 16 & 0xFF;
                                                int var427 = var426 * 128 + 64 - Statics.field461.field421;
                                                if (var427 < 0) {
                                                    var427 = -var427;
                                                }
                                                int var428 = field728[var422] >> 8 & 0xFF;
                                                int var429 = var428 * 128 + 64 - Statics.field461.field422;
                                                if (var429 < 0) {
                                                    var429 = -var429;
                                                }
                                                int var430 = var427 + var429 - 128;
                                                if (var430 > var425) {
                                                    field727[var422] = -100;
                                                    continue;
                                                }
                                                if (var430 < 0) {
                                                    var430 = 0;
                                                }
                                                var431 = field743 * (var425 - var430) / var425;
                                            }
                                            if (var431 > 0) {
                                                class63 var432 = var424.method1274().method1335(Statics.field222);
                                                class45 var433 = class45.method964(var432, 100, var431);
                                                var433.method967(field726[var422] - 1);
                                                Statics.field1284.method1137(var433);
                                            }
                                            field727[var422] = -100;
                                        }
                                    } else {
                                        field724--;
                                        for (int var423 = var422; var423 < field724; var423++) {
                                            field666[var423] = field666[var423 + 1];
                                            field526[var423] = field526[var423 + 1];
                                            field726[var423] = field726[var423 + 1];
                                            field727[var423] = field727[var423 + 1];
                                            field728[var423] = field728[var423 + 1];
                                        }
                                        var422--;
                                    }
                                }
                                if (field625 && !class139.method64()) {
                                    if (field705 != 0 && field720 != -1) {
                                        class139.method3193(Statics.field2593, field720, 0, field705, false);
                                    }
                                    field625 = false;
                                }
                                field531++;
                                if (field531 > 750) {
                                    method2758();
                                } else {
                                    for (int var434 = -1; var434 < field604; var434++) {
                                        int var435;
                                        if (var434 == -1) {
                                            var435 = 2047;
                                        } else {
                                            var435 = field584[var434];
                                        }
                                        class3 var436 = field729[var435];
                                        if (var436 != null) {
                                            method155(var436, 1);
                                        }
                                    }
                                    Statics.method113();
                                    method3194();
                                    field723++;
                                    if (field634 != 0) {
                                        field592 += 20;
                                        if (field592 >= 400) {
                                            field634 = 0;
                                        }
                                    }
                                    if (Statics.field2018 != null) {
                                        field564++;
                                        if (field564 >= 15) {
                                            method2472(Statics.field2018);
                                            Statics.field2018 = null;
                                        }
                                    }
                                    if (Statics.field1384 != null) {
                                        method2472(Statics.field1384);
                                        field644++;
                                        if (class77.field1374 > field480 + 5 || class77.field1374 < field480 - 5 || class77.field1375 > field598 + 5 || class77.field1375 < field598 - 5) {
                                            field600 = true;
                                        }
                                        if (class77.field1373 == 0) {
                                            if (field600 && field644 >= 5) {
                                                if (Statics.field377 == Statics.field1384 && field599 != field596) {
                                                    class159 var437 = Statics.field1384;
                                                    byte var438 = 0;
                                                    if (field660 == 1 && var437.field2657 == 206) {
                                                        var438 = 1;
                                                    }
                                                    if (var437.field2708[field599] <= 0) {
                                                        var438 = 0;
                                                    }
                                                    int var439 = method2492(var437);
                                                    boolean var440 = (var439 >> 29 & 0x1) != 0;
                                                    if (var440) {
                                                        int var441 = field596;
                                                        int var442 = field599;
                                                        var437.field2708[var442] = var437.field2708[var441];
                                                        var437.field2663[var442] = var437.field2663[var441];
                                                        var437.field2708[var441] = -1;
                                                        var437.field2663[var441] = 0;
                                                    } else if (var438 == 1) {
                                                        int var443 = field596;
                                                        int var444 = field599;
                                                        while (var443 != var444) {
                                                            if (var443 > var444) {
                                                                var437.method3230(var443 - 1, var443);
                                                                var443--;
                                                            } else if (var443 < var444) {
                                                                var437.method3230(var443 + 1, var443);
                                                                var443++;
                                                            }
                                                        }
                                                    } else {
                                                        var437.method3230(field599, field596);
                                                    }
                                                    field605.method2360(165);
                                                    field605.method2528(field596);
                                                    field605.method2605(Statics.field1384.field2676);
                                                    field605.method2521(var438);
                                                    field605.method2484(field599);
                                                }
                                            } else if ((field486 == 1 || method2418(field626 - 1)) && field626 > 2) {
                                                method251();
                                            } else if (field626 > 0) {
                                                method161(field626 - 1);
                                            }
                                            field564 = 10;
                                            class77.field1369 = 0;
                                            Statics.field1384 = null;
                                        }
                                    }
                                    class159 var445 = Statics.field238;
                                    class159 var446 = Statics.field635;
                                    Statics.field238 = null;
                                    Statics.field635 = null;
                                    field659 = null;
                                    field537 = false;
                                    field494 = false;
                                    field555 = 0;
                                    while (true) {
                                        while (class75.method2260() && field555 < 128) {
                                            if (field651 >= 2 && class75.field1345[82] && Statics.field171 == 66) {
                                                String var447 = "";
                                                for (int var448 = 0; var448 < field699 && var448 < 100; var448++) {
                                                    var447 = var447 + field515[var448] + ':' + field698[var448] + '\n';
                                                }
                                                Statics.field2378.setContents(new StringSelection(var447), (ClipboardOwner) null);
                                            } else {
                                                field707[field555] = Statics.field171;
                                                field495[field555] = Statics.field360;
                                                field555++;
                                            }
                                        }
                                        int var449 = field681;
                                        if (class159.method687(var449)) {
                                            method3029(Statics.field2641[var449], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field667++;
                                        while (true) {
                                            class1 var450;
                                            class159 var451;
                                            class159 var452;
                                            do {
                                                var450 = (class1) field682.method3371();
                                                if (var450 == null) {
                                                    while (true) {
                                                        class1 var453;
                                                        class159 var454;
                                                        class159 var455;
                                                        do {
                                                            var453 = (class1) field683.method3371();
                                                            if (var453 == null) {
                                                                while (true) {
                                                                    class1 var456;
                                                                    class159 var457;
                                                                    class159 var458;
                                                                    do {
                                                                        var456 = (class1) field504.method3371();
                                                                        if (var456 == null) {
                                                                            if (field655 != null) {
                                                                                method2472(field655);
                                                                                Statics.field32++;
                                                                                if (field537 && field494) {
                                                                                    int var459 = class77.field1374;
                                                                                    int var460 = class77.field1375;
                                                                                    int var461 = var459 - field657;
                                                                                    int var462 = var460 - field658;
                                                                                    if (var461 < field643) {
                                                                                        var461 = field643;
                                                                                    }
                                                                                    if (field655.field2615 + var461 > field643 + field656.field2615) {
                                                                                        var461 = field643 + field656.field2615 - field655.field2615;
                                                                                    }
                                                                                    if (var462 < field706) {
                                                                                        var462 = field706;
                                                                                    }
                                                                                    if (field655.field2616 + var462 > field706 + field656.field2616) {
                                                                                        var462 = field706 + field656.field2616 - field655.field2616;
                                                                                    }
                                                                                    int var463 = var461 - field664;
                                                                                    int var464 = var462 - field665;
                                                                                    int var465 = field655.field2624;
                                                                                    if (Statics.field32 > field655.field2670 && (var463 > var465 || var463 < -var465 || var464 > var465 || var464 < -var465)) {
                                                                                        field730 = true;
                                                                                    }
                                                                                    int var466 = field656.field2619 + (var461 - field643);
                                                                                    int var467 = field656.field2620 + (var462 - field706);
                                                                                    if (field655.field2606 != null && field730) {
                                                                                        class1 var468 = new class1();
                                                                                        var468.field3 = field655;
                                                                                        var468.field4 = var466;
                                                                                        var468.field5 = var467;
                                                                                        var468.field13 = field655.field2606;
                                                                                        class26.method134(var468);
                                                                                    }
                                                                                    if (class77.field1373 == 0) {
                                                                                        if (field730) {
                                                                                            if (field655.field2683 != null) {
                                                                                                class1 var469 = new class1();
                                                                                                var469.field3 = field655;
                                                                                                var469.field4 = var466;
                                                                                                var469.field5 = var467;
                                                                                                var469.field7 = field659;
                                                                                                var469.field13 = field655.field2683;
                                                                                                class26.method134(var469);
                                                                                            }
                                                                                            if (field659 != null) {
                                                                                                class159 var470 = field655;
                                                                                                int var471 = class163.method1558(method2492(var470));
                                                                                                class159 var472;
                                                                                                if (var471 == 0) {
                                                                                                    var472 = null;
                                                                                                } else {
                                                                                                    int var473 = 0;
                                                                                                    while (true) {
                                                                                                        if (var473 >= var471) {
                                                                                                            var472 = var470;
                                                                                                            break;
                                                                                                        }
                                                                                                        var470 = class159.method166(var470.field2617);
                                                                                                        if (var470 == null) {
                                                                                                            var472 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var473++;
                                                                                                    }
                                                                                                }
                                                                                                if (var472 != null) {
                                                                                                    field605.method2360(47);
                                                                                                    field605.method2528(field659.field2607);
                                                                                                    field605.method2538(field655.field2676);
                                                                                                    field605.method2484(field655.field2607);
                                                                                                    field605.method2586(field659.field2676);
                                                                                                }
                                                                                            }
                                                                                        } else if ((field486 == 1 || method2418(field626 - 1)) && field626 > 2) {
                                                                                            method251();
                                                                                        } else if (field626 > 0) {
                                                                                            method161(field626 - 1);
                                                                                        }
                                                                                        field655 = null;
                                                                                    }
                                                                                } else if (Statics.field32 > 1) {
                                                                                    field655 = null;
                                                                                }
                                                                            }
                                                                            if (class95.field1597 != -1) {
                                                                                int var474 = class95.field1597;
                                                                                int var475 = class95.field1573;
                                                                                field605.method2360(140);
                                                                                field605.method2485(5);
                                                                                field605.method2529(Statics.field113 + var475);
                                                                                field605.method2520(class75.field1345[82] ? (class75.field1345[81] ? 2 : 1) : 0);
                                                                                field605.method2528(Statics.field1399 + var474);
                                                                                class95.field1597 = -1;
                                                                                field590 = class77.field1381;
                                                                                field591 = class77.field1382;
                                                                                field634 = 1;
                                                                                field592 = 0;
                                                                                field716 = var474;
                                                                                field717 = var475;
                                                                            }
                                                                            if (Statics.field1384 == null && field655 == null) {
                                                                                int var476 = class77.field1369;
                                                                                if (field722) {
                                                                                    if (var476 != 1 && (Statics.field876 || var476 != 4)) {
                                                                                        int var477 = class77.field1374;
                                                                                        int var478 = class77.field1375;
                                                                                        if (var477 < Statics.field1810 - 10 || var477 > Statics.field1810 + Statics.field1263 + 10 || var478 < Statics.field168 - 10 || var478 > Statics.field19 + Statics.field168 + 10) {
                                                                                            field722 = false;
                                                                                            method158(Statics.field1810, Statics.field168, Statics.field1263, Statics.field19);
                                                                                        }
                                                                                    }
                                                                                    if (var476 == 1 || !Statics.field876 && var476 == 4) {
                                                                                        int var479 = Statics.field1810;
                                                                                        int var480 = Statics.field168;
                                                                                        int var481 = Statics.field1263;
                                                                                        int var482 = class77.field1381;
                                                                                        int var483 = class77.field1382;
                                                                                        int var484 = -1;
                                                                                        for (int var485 = 0; var485 < field626; var485++) {
                                                                                            int var486 = (field626 - 1 - var485) * 15 + var480 + 31;
                                                                                            if (var482 > var479 && var482 < var479 + var481 && var483 > var486 - 13 && var483 < var486 + 3) {
                                                                                                var484 = var485;
                                                                                            }
                                                                                        }
                                                                                        if (var484 != -1) {
                                                                                            method161(var484);
                                                                                        }
                                                                                        field722 = false;
                                                                                        method158(Statics.field1810, Statics.field168, Statics.field1263, Statics.field19);
                                                                                    }
                                                                                } else {
                                                                                    label3733: {
                                                                                        int var488;
                                                                                        int var489;
                                                                                        label3794: {
                                                                                            if ((var476 == 1 || !Statics.field876 && var476 == 4) && field626 > 0) {
                                                                                                int var487 = field629[field626 - 1];
                                                                                                if (var487 == 39 || var487 == 40 || var487 == 41 || var487 == 42 || var487 == 43 || var487 == 33 || var487 == 34 || var487 == 35 || var487 == 36 || var487 == 37 || var487 == 38 || var487 == 1005) {
                                                                                                    var488 = field606[field626 - 1];
                                                                                                    var489 = field628[field626 - 1];
                                                                                                    class159 var490 = class159.method166(var489);
                                                                                                    int var491 = method2492(var490);
                                                                                                    boolean var492 = (var491 >> 28 & 0x1) != 0;
                                                                                                    if (var492) {
                                                                                                        break label3794;
                                                                                                    }
                                                                                                    int var493 = method2492(var490);
                                                                                                    boolean var494 = (var493 >> 29 & 0x1) != 0;
                                                                                                    if (var494) {
                                                                                                        break label3794;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if ((var476 == 1 || !Statics.field876 && var476 == 4) && (field486 == 1 && field626 > 2 || method2418(field626 - 1))) {
                                                                                                var476 = 2;
                                                                                            }
                                                                                            if ((var476 == 1 || !Statics.field876 && var476 == 4) && field626 > 0) {
                                                                                                method161(field626 - 1);
                                                                                            }
                                                                                            if (var476 == 2 && field626 > 0) {
                                                                                                method251();
                                                                                            }
                                                                                            break label3733;
                                                                                        }
                                                                                        if (Statics.field1384 != null && !field600 && field486 != 1 && !method2418(field626 - 1) && field626 > 0) {
                                                                                            method161(field626 - 1);
                                                                                        }
                                                                                        field600 = false;
                                                                                        field644 = 0;
                                                                                        if (Statics.field1384 != null) {
                                                                                            method2472(Statics.field1384);
                                                                                        }
                                                                                        Statics.field1384 = class159.method166(var489);
                                                                                        field596 = var488;
                                                                                        field480 = class77.field1381;
                                                                                        field598 = class77.field1382;
                                                                                        method2472(Statics.field1384);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field238 != var445) {
                                                                                if (var445 != null) {
                                                                                    method2472(var445);
                                                                                }
                                                                                if (Statics.field238 != null) {
                                                                                    method2472(Statics.field238);
                                                                                }
                                                                            }
                                                                            if (Statics.field635 != var446 && field636 == field610) {
                                                                                if (var446 != null) {
                                                                                    method2472(var446);
                                                                                }
                                                                                if (Statics.field635 != null) {
                                                                                    method2472(Statics.field635);
                                                                                }
                                                                            }
                                                                            if (Statics.field635 == null) {
                                                                                if (field636 > 0) {
                                                                                    field636--;
                                                                                }
                                                                            } else if (field636 < field610) {
                                                                                field636++;
                                                                                if (field636 == field610) {
                                                                                    method2472(Statics.field635);
                                                                                }
                                                                            }
                                                                            method137();
                                                                            if (field570) {
                                                                                int var495 = Statics.field967 * 128 + 64;
                                                                                int var496 = Statics.field398 * 128 + 64;
                                                                                int var497 = method183(var495, var496, Statics.field1113) - Statics.field1783;
                                                                                if (Statics.field1797 < var495) {
                                                                                    Statics.field1797 += Statics.field252 * (var495 - Statics.field1797) / 1000 + Statics.field954;
                                                                                    if (Statics.field1797 > var495) {
                                                                                        Statics.field1797 = var495;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1797 > var495) {
                                                                                    Statics.field1797 -= Statics.field252 * (Statics.field1797 - var495) / 1000 + Statics.field954;
                                                                                    if (Statics.field1797 < var495) {
                                                                                        Statics.field1797 = var495;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1737 < var497) {
                                                                                    Statics.field1737 += Statics.field252 * (var497 - Statics.field1737) / 1000 + Statics.field954;
                                                                                    if (Statics.field1737 > var497) {
                                                                                        Statics.field1737 = var497;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1737 > var497) {
                                                                                    Statics.field1737 -= Statics.field252 * (Statics.field1737 - var497) / 1000 + Statics.field954;
                                                                                    if (Statics.field1737 < var497) {
                                                                                        Statics.field1737 = var497;
                                                                                    }
                                                                                }
                                                                                if (Statics.field391 < var496) {
                                                                                    Statics.field391 += Statics.field252 * (var496 - Statics.field391) / 1000 + Statics.field954;
                                                                                    if (Statics.field391 > var496) {
                                                                                        Statics.field391 = var496;
                                                                                    }
                                                                                }
                                                                                if (Statics.field391 > var496) {
                                                                                    Statics.field391 -= Statics.field252 * (Statics.field391 - var496) / 1000 + Statics.field954;
                                                                                    if (Statics.field391 < var496) {
                                                                                        Statics.field391 = var496;
                                                                                    }
                                                                                }
                                                                                int var498 = Statics.field37 * 128 + 64;
                                                                                int var499 = Statics.field1450 * 128 + 64;
                                                                                int var500 = method183(var498, var499, Statics.field1113) - Statics.field1029;
                                                                                int var501 = var498 - Statics.field1797;
                                                                                int var502 = var500 - Statics.field1737;
                                                                                int var503 = var499 - Statics.field391;
                                                                                int var504 = (int) Math.sqrt((double) (var501 * var501 + var503 * var503));
                                                                                int var505 = (int) (Math.atan2((double) var502, (double) var504) * 325.949D) & 0x7FF;
                                                                                int var506 = (int) (Math.atan2((double) var501, (double) var503) * -325.949D) & 0x7FF;
                                                                                if (var505 < 128) {
                                                                                    var505 = 128;
                                                                                }
                                                                                if (var505 > 383) {
                                                                                    var505 = 383;
                                                                                }
                                                                                if (Statics.field2419 < var505) {
                                                                                    Statics.field2419 += Statics.field93 * (var505 - Statics.field2419) / 1000 + Statics.field1182;
                                                                                    if (Statics.field2419 > var505) {
                                                                                        Statics.field2419 = var505;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2419 > var505) {
                                                                                    Statics.field2419 -= Statics.field93 * (Statics.field2419 - var505) / 1000 + Statics.field1182;
                                                                                    if (Statics.field2419 < var505) {
                                                                                        Statics.field2419 = var505;
                                                                                    }
                                                                                }
                                                                                int var507 = var506 - Statics.field2425;
                                                                                if (var507 > 1024) {
                                                                                    var507 -= 2048;
                                                                                }
                                                                                if (var507 < -1024) {
                                                                                    var507 += 2048;
                                                                                }
                                                                                if (var507 > 0) {
                                                                                    Statics.field2425 += Statics.field93 * var507 / 1000 + Statics.field1182;
                                                                                    Statics.field2425 &= 0x7FF;
                                                                                }
                                                                                if (var507 < 0) {
                                                                                    Statics.field2425 -= Statics.field93 * -var507 / 1000 + Statics.field1182;
                                                                                    Statics.field2425 &= 0x7FF;
                                                                                }
                                                                                int var508 = var506 - Statics.field2425;
                                                                                if (var508 > 1024) {
                                                                                    var508 -= 2048;
                                                                                }
                                                                                if (var508 < -1024) {
                                                                                    var508 += 2048;
                                                                                }
                                                                                if (var508 < 0 && var507 > 0 || var508 > 0 && var507 < 0) {
                                                                                    Statics.field2425 = var506;
                                                                                }
                                                                            }
                                                                            for (int var509 = 0; var509 < 5; var509++) {
                                                                                var10002 = field735[var509]++;
                                                                            }
                                                                            int var510 = class77.method60();
                                                                            int var511 = class75.field1356;
                                                                            if (var510 > 15000 && var511 > 15000) {
                                                                                field533 = 250;
                                                                                class77.method2250(14500);
                                                                                field605.method2360(46);
                                                                            }
                                                                            field685++;
                                                                            if (field685 > 500) {
                                                                                field685 = 0;
                                                                                int var513 = (int) (Math.random() * 8.0D);
                                                                                if ((var513 & 0x1) == 1) {
                                                                                    field548 += field549;
                                                                                }
                                                                                if ((var513 & 0x2) == 2) {
                                                                                    field550 += field613;
                                                                                }
                                                                                if ((var513 & 0x4) == 4) {
                                                                                    field554 += field553;
                                                                                }
                                                                            }
                                                                            if (field548 < -50) {
                                                                                field549 = 2;
                                                                            }
                                                                            if (field548 > 50) {
                                                                                field549 = -2;
                                                                            }
                                                                            if (field550 < -55) {
                                                                                field613 = 2;
                                                                            }
                                                                            if (field550 > 55) {
                                                                                field613 = -2;
                                                                            }
                                                                            if (field554 < -40) {
                                                                                field553 = 1;
                                                                            }
                                                                            if (field554 > 40) {
                                                                                field553 = -1;
                                                                            }
                                                                            field559++;
                                                                            if (field559 > 500) {
                                                                                field559 = 0;
                                                                                int var514 = (int) (Math.random() * 8.0D);
                                                                                if ((var514 & 0x1) == 1) {
                                                                                    field670 += field650;
                                                                                }
                                                                                if ((var514 & 0x2) == 2) {
                                                                                    field557 += field558;
                                                                                }
                                                                            }
                                                                            if (field670 < -60) {
                                                                                field650 = 2;
                                                                            }
                                                                            if (field670 > 60) {
                                                                                field650 = -2;
                                                                            }
                                                                            if (field557 < -20) {
                                                                                field558 = 1;
                                                                            }
                                                                            if (field557 > 10) {
                                                                                field558 = -1;
                                                                            }
                                                                            for (class28 var515 = (class28) field551.method3341(); var515 != null; var515 = (class28) field551.method3332()) {
                                                                                if ((long) var515.field753 < class121.method226() / 1000L - 5L) {
                                                                                    if (var515.field749 > 0) {
                                                                                        method1557(5, "", var515.field747 + class135.field2229);
                                                                                    }
                                                                                    if (var515.field749 == 0) {
                                                                                        method1557(5, "", var515.field747 + class135.field2127);
                                                                                    }
                                                                                    var515.method3400();
                                                                                }
                                                                            }
                                                                            field719++;
                                                                            if (field719 > 50) {
                                                                                field605.method2360(75);
                                                                            }
                                                                            try {
                                                                                if (Statics.field420 != null && field605.field2027 > 0) {
                                                                                    Statics.field420.method1388(field605.field2030, 0, field605.field2027);
                                                                                    field605.field2027 = 0;
                                                                                    field719 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var517) {
                                                                                method2758();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var457 = var456.field3;
                                                                        if (var457.field2607 < 0) {
                                                                            break;
                                                                        }
                                                                        var458 = class159.method166(var457.field2617);
                                                                    } while (var458 == null || var458.field2706 == null || var457.field2607 >= var458.field2706.length || var458.field2706[var457.field2607] != var457);
                                                                    class26.method134(var456);
                                                                }
                                                            }
                                                            var454 = var453.field3;
                                                            if (var454.field2607 < 0) {
                                                                break;
                                                            }
                                                            var455 = class159.method166(var454.field2617);
                                                        } while (var455 == null || var455.field2706 == null || var454.field2607 >= var455.field2706.length || var455.field2706[var454.field2607] != var454);
                                                        class26.method134(var453);
                                                    }
                                                }
                                                var451 = var450.field3;
                                                if (var451.field2607 < 0) {
                                                    break;
                                                }
                                                var452 = class159.method166(var451.field2617);
                                            } while (var452 == null || var452.field2706 == null || var451.field2607 >= var452.field2706.length || var452.field2706[var451.field2607] != var451);
                                            class26.method134(var450);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field492 == 40) {
                    method14();
                }
                return;
            }
            var2.field2591.method3173(var2.field2588, (int) var2.field2823, var2.field2589, false);
        }
    }

    @ObfuscatedName("client.x(B)V")
    public final void method294() {
        boolean var1 = class139.method2423();
        if (var1 && field625 && Statics.field1803 != null) {
            Statics.field1803.method1182();
        }
        if (field1316) {
            class75.method2241(Statics.field2789);
            Canvas var2 = Statics.field2789;
            var2.removeMouseListener(class77.field1380);
            var2.removeMouseMotionListener(class77.field1380);
            var2.removeFocusListener(class77.field1380);
            class77.field1368 = 0;
            if (Statics.field1359 != null) {
                Statics.field1359.method1363(Statics.field2789);
            }
            this.method1426();
            class75.method1550(Statics.field2789);
            class77.method1488(Statics.field2789);
            if (Statics.field1359 != null) {
                Statics.field1359.method1361(Statics.field2789);
            }
        }
        if (field492 == 0) {
            class73.method792(class21.field323, class21.field324, (Color) null);
        } else if (field492 == 5) {
            class21.method186(Statics.field904, Statics.field923);
        } else if (field492 == 10) {
            class21.method186(Statics.field904, Statics.field923);
        } else if (field492 == 20) {
            class21.method186(Statics.field904, Statics.field923);
        } else if (field492 == 25) {
            if (field543 == 1) {
                if (field588 > field540) {
                    field540 = field588;
                }
                int var3 = (field540 * 50 - field588 * 50) / field540;
                method1186(class135.field2112 + class2.field24 + class2.field21 + var3 + "%" + class2.field22, false);
            } else if (field543 == 2) {
                if (field541 > field542) {
                    field542 = field541;
                }
                int var4 = (field542 * 50 - field541 * 50) / field542 + 50;
                method1186(class135.field2112 + class2.field24 + class2.field21 + var4 + "%" + class2.field22, false);
            } else {
                method1186(class135.field2112, false);
            }
        } else if (field492 == 30) {
            if (!field722) {
                field631[0] = class135.field2313;
                field632[0] = "";
                field629[0] = 1006;
                field626 = 1;
            }
            if (field681 != -1) {
                int var5 = field681;
                if (class159.method687(var5)) {
                    method148(Statics.field2641[var5], -1);
                }
            }
            for (int var6 = 0; var6 < field517; var6++) {
                if (field687[var6]) {
                    field688[var6] = true;
                }
                field689[var6] = field687[var6];
                field687[var6] = false;
            }
            field585 = field496;
            field633 = -1;
            field483 = -1;
            Statics.field377 = null;
            if (field681 != -1) {
                field517 = 0;
                method1698(field681, 0, 0, 765, 503, 0, 0, -1);
            }
            class89.method1823();
            method156();
            if (field722) {
                int var10 = Statics.field1810;
                int var11 = Statics.field168;
                int var12 = Statics.field1263;
                int var13 = Statics.field19;
                int var14 = 6116423;
                class89.method1830(var10, var11, var12, var13, var14);
                class89.method1830(var10 + 1, var11 + 1, var12 - 2, 16, 0);
                class89.method1832(var10 + 1, var11 + 18, var12 - 2, var13 - 19, 0);
                Statics.field904.method3456(class135.field2280, var10 + 3, var11 + 14, var14, -1);
                int var15 = class77.field1374;
                int var16 = class77.field1375;
                for (int var17 = 0; var17 < field626; var17++) {
                    int var18 = (field626 - 1 - var17) * 15 + var11 + 31;
                    int var19 = 16777215;
                    if (var15 > var10 && var15 < var10 + var12 && var16 > var18 - 13 && var16 < var18 + 3) {
                        var19 = 16776960;
                    }
                    Statics.field904.method3456(method165(var17), var10 + 3, var18, var19, 0);
                }
                method3159(Statics.field1810, Statics.field168, Statics.field1263, Statics.field19);
            } else if (field633 != -1) {
                int var7 = field633;
                int var8 = field483;
                if (field626 >= 2 || field638 != 0 || field640) {
                    String var9;
                    if (field638 == 1 && field626 < 2) {
                        var9 = class135.field2230 + class135.field2209 + field639 + " " + class2.field23;
                    } else if (field640 && field626 < 2) {
                        var9 = field678 + class135.field2209 + field565 + " " + class2.field23;
                    } else {
                        var9 = method165(field626 - 1);
                    }
                    if (field626 > 2) {
                        var9 = var9 + class2.method1185(16777215) + " " + '/' + " " + (field626 - 2) + class135.field2234;
                    }
                    Statics.field904.method3443(var9, var7 + 4, var8 + 15, 16777215, 0, field496 / 1000);
                }
            }
            if (field694 == 3) {
                for (int var20 = 0; var20 < field517; var20++) {
                    if (field689[var20]) {
                        class89.method1829(field690[var20], field691[var20], field552[var20], field693[var20], 16711935, 128);
                    } else if (field688[var20]) {
                        class89.method1829(field690[var20], field691[var20], field552[var20], field693[var20], 16711680, 128);
                    }
                }
            }
            int var21 = Statics.field1113;
            int var22 = Statics.field461.field421;
            int var23 = Statics.field461.field422;
            int var24 = field723;
            for (class7 var25 = (class7) class7.field109.method3373(); var25 != null; var25 = (class7) class7.field109.method3375()) {
                if (var25.field95 != -1 || var25.field106 != null) {
                    int var26 = 0;
                    if (var22 > var25.field99) {
                        var26 += var22 - var25.field99;
                    } else if (var22 < var25.field97) {
                        var26 += var25.field97 - var22;
                    }
                    if (var23 > var25.field100) {
                        var26 += var23 - var25.field100;
                    } else if (var23 < var25.field98) {
                        var26 += var25.field98 - var23;
                    }
                    if (var26 - 64 > var25.field101 || field743 == 0 || var25.field96 != var21) {
                        if (var25.field104 != null) {
                            Statics.field1284.method1123(var25.field104);
                            var25.field104 = null;
                        }
                        if (var25.field108 != null) {
                            Statics.field1284.method1123(var25.field108);
                            var25.field108 = null;
                        }
                    } else {
                        var26 -= 64;
                        if (var26 < 0) {
                            var26 = 0;
                        }
                        int var27 = field743 * (var25.field101 - var26) / var25.field101;
                        class57 var10000;
                        if (var25.field104 != null) {
                            var25.field104.method968(var27);
                        } else if (var25.field95 >= 0) {
                            var10000 = (class57) null;
                            class57 var28 = class57.method1276(Statics.field2778, var25.field95, 0);
                            if (var28 != null) {
                                class63 var29 = var28.method1274().method1335(Statics.field222);
                                class45 var30 = class45.method964(var29, 100, var27);
                                var30.method967(-1);
                                Statics.field1284.method1137(var30);
                                var25.field104 = var30;
                            }
                        }
                        if (var25.field108 != null) {
                            var25.field108.method968(var27);
                            if (!var25.field108.method3405()) {
                                var25.field108 = null;
                            }
                        } else if (var25.field106 != null && (var25.field105 -= var24) <= 0) {
                            int var31 = (int) (Math.random() * (double) var25.field106.length);
                            var10000 = (class57) null;
                            class57 var32 = class57.method1276(Statics.field2778, var25.field106[var31], 0);
                            if (var32 != null) {
                                class63 var33 = var32.method1274().method1335(Statics.field222);
                                class45 var34 = class45.method964(var33, 100, var27);
                                var34.method967(0);
                                Statics.field1284.method1137(var34);
                                var25.field108 = var34;
                                var25.field105 = var25.field111 + (int) (Math.random() * (double) (var25.field102 - var25.field111));
                            }
                        }
                    }
                }
            }
            field723 = 0;
        } else if (field492 == 40) {
            method1186(class135.field2324 + class2.field24 + class135.field2098, false);
        }
        if (field492 == 30 && field694 == 0 && !field1315) {
            try {
                Graphics var35 = Statics.field2789.getGraphics();
                for (int var36 = 0; var36 < field517; var36++) {
                    if (field688[var36]) {
                        Statics.field417.method1655(var35, field690[var36], field691[var36], field552[var36], field693[var36]);
                        field688[var36] = false;
                    }
                }
            } catch (Exception var42) {
                Statics.field2789.repaint();
            }
        } else if (field492 > 0) {
            try {
                Graphics var38 = Statics.field2789.getGraphics();
                Statics.field417.method1643(var38, 0, 0);
                field1315 = false;
                for (int var39 = 0; var39 < field517; var39++) {
                    field688[var39] = false;
                }
            } catch (Exception var41) {
                Statics.field2789.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method356() {
        if (Statics.field268 != null) {
            Statics.field268.field257 = false;
        }
        Statics.field268 = null;
        if (Statics.field420 != null) {
            Statics.field420.method1383();
            Statics.field420 = null;
        }
        class75.method1889();
        if (class77.field1380 != null) {
            class77 var1 = class77.field1380;
            synchronized (class77.field1380) {
                class77.field1380 = null;
            }
        }
        Statics.field1359 = null;
        if (Statics.field1803 != null) {
            Statics.field1803.method1197();
        }
        if (Statics.field874 != null) {
            Statics.field874.method1197();
        }
        if (Statics.field2562 != null) {
            Statics.field2562.method1383();
        }
        Object var3 = class158.field2597;
        synchronized (class158.field2597) {
            if (class158.field2595 != 0) {
                class158.field2595 = 1;
                try {
                    class158.field2597.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class82.method1559();
    }

    @ObfuscatedName("av.r(IB)V")
    public static void method819(int arg0) {
        if (field492 == arg0) {
            return;
        }
        if (field492 == 0) {
            class73.method30();
        }
        if (arg0 == 20 || arg0 == 40) {
            field518 = 0;
            field519 = 0;
            field520 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field413 != null) {
            Statics.field413.method1383();
            Statics.field413 = null;
        }
        if (field492 == 25) {
            field543 = 0;
            field588 = 0;
            field540 = 1;
            field541 = 0;
            field542 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method225(Statics.field2789, Statics.field569, Statics.field911);
        } else {
            class21.method1669();
        }
        field492 = arg0;
    }

    @ObfuscatedName("client.z(I)V")
    public void method276() {
        if (field492 != 1000) {
            boolean var1 = class154.method762();
            if (!var1) {
                this.method277();
            }
        }
    }

    @ObfuscatedName("client.n(S)V")
    public void method277() {
        if (class154.field2566 >= 4) {
            this.method1447("js5crc");
            field492 = 1000;
            return;
        }
        if (class154.field2567 >= 4) {
            if (field492 <= 5) {
                this.method1447("js5io");
                field492 = 1000;
                return;
            }
            field513 = 3000;
            class154.field2567 = 3;
        }
        if (--field513 + 1 > 0) {
            return;
        }
        try {
            if (field512 == 0) {
                Statics.field201 = Statics.field1295.method1494(Statics.field59, Statics.field1364);
                field512++;
            }
            if (field512 == 1) {
                if (Statics.field201.field1392 == 2) {
                    this.method278(-1);
                    return;
                }
                if (Statics.field201.field1392 == 1) {
                    field512++;
                }
            }
            if (field512 == 2) {
                Statics.field278 = new class70((Socket) Statics.field201.field1397, Statics.field1295);
                class127 var1 = new class127(5);
                var1.method2485(15);
                var1.method2605(38);
                Statics.field278.method1388(var1.field2030, 0, 5);
                field512++;
                Statics.field114 = class121.method226();
            }
            if (field512 == 3) {
                if (field492 <= 5 || Statics.field278.method1386() > 0) {
                    int var2 = Statics.field278.method1400();
                    if (var2 != 0) {
                        this.method278(var2);
                        return;
                    }
                    field512++;
                } else if (class121.method226() - Statics.field114 > 30000L) {
                    this.method278(-2);
                    return;
                }
            }
            if (field512 == 4) {
                class70 var3 = Statics.field278;
                boolean var4 = field492 > 20;
                if (Statics.field2562 != null) {
                    try {
                        Statics.field2562.method1383();
                    } catch (Exception var14) {
                    }
                    Statics.field2562 = null;
                }
                Statics.field2562 = var3;
                class154.method1419(var4);
                class154.field2563.field2027 = 0;
                Statics.field2070 = null;
                Statics.field1427 = null;
                class154.field2561 = 0;
                while (true) {
                    class156 var6 = (class156) class154.field2549.method3352();
                    if (var6 == null) {
                        while (true) {
                            class156 var7 = (class156) class154.field2555.method3352();
                            if (var7 == null) {
                                if (class154.field2551 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2485(4);
                                        var8.method2485(class154.field2551);
                                        var8.method2484(0);
                                        Statics.field2562.method1388(var8.field2030, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2562.method1383();
                                        } catch (Exception var12) {
                                        }
                                        class154.field2567++;
                                        Statics.field2562 = null;
                                    }
                                }
                                class154.field2565 = 0;
                                Statics.field2550 = class121.method226();
                                Statics.field201 = null;
                                Statics.field278 = null;
                                field512 = 0;
                                field647 = 0;
                                return;
                            }
                            class154.field2553.method3319(var7);
                            class154.field2556.method3364(var7, var7.field2823);
                            class154.field2557++;
                            class154.field2559--;
                        }
                    }
                    class154.field2568.method3364(var6, var6.field2823);
                    class154.field2552++;
                    class154.field2554--;
                }
            }
        } catch (IOException var15) {
            this.method278(-3);
        }
    }

    @ObfuscatedName("client.j(IS)V")
    public void method278(int arg0) {
        Statics.field201 = null;
        Statics.field278 = null;
        field512 = 0;
        if (Statics.field522 == Statics.field1364) {
            Statics.field1364 = Statics.field2406;
        } else {
            Statics.field1364 = Statics.field522;
        }
        field647++;
        if (field647 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field492 <= 5) {
                this.method1447("js5connect_full");
                field492 = 1000;
            } else {
                field513 = 3000;
            }
        } else if (field647 >= 2 && arg0 == 6) {
            this.method1447("js5connect_outofdate");
            field492 = 1000;
        } else if (field647 >= 4) {
            if (field492 <= 5) {
                this.method1447("js5connect");
                field492 = 1000;
            } else {
                field513 = 3000;
            }
        }
    }

    @ObfuscatedName("t.b(I)V")
    public static void method150() {
        if (field731 == 0) {
            Statics.field751 = new class95(4, 104, 104, class9.field135);
            for (int var0 = 0; var0 < 4; var0++) {
                field544[var0] = new class130(104, 104);
            }
            Statics.field344 = new class86(512, 512);
            class21.field324 = class135.field2318;
            class21.field323 = 5;
            field731 = 20;
        } else if (field731 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1755[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1933(var1, 500, 800, 512, 334);
            class21.field324 = class135.field2109;
            class21.field323 = 10;
            field731 = 30;
        } else if (field731 == 30) {
            Statics.field514 = method1362(0, false, true, true);
            Statics.field1041 = method1362(1, false, true, true);
            Statics.field293 = method1362(2, true, false, true);
            Statics.field1286 = method1362(3, false, true, true);
            Statics.field2778 = method1362(4, false, true, true);
            Statics.field242 = method1362(5, true, true, true);
            Statics.field2593 = method1362(6, true, true, false);
            Statics.field1767 = method1362(7, false, true, true);
            Statics.field911 = method1362(8, false, true, true);
            Statics.field163 = method1362(9, false, true, true);
            Statics.field569 = method1362(10, false, true, true);
            Statics.field1990 = method1362(11, false, true, true);
            Statics.field516 = method1362(12, false, true, true);
            Statics.field1500 = method1362(13, true, false, true);
            Statics.field110 = method1362(14, false, true, false);
            Statics.field1728 = method1362(15, false, true, true);
            class21.field324 = class135.field2101;
            class21.field323 = 20;
            field731 = 40;
        } else if (field731 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field514.method3191() * 4 / 100;
            int var8 = var7 + Statics.field1041.method3191() * 4 / 100;
            int var9 = var8 + Statics.field293.method3191() * 2 / 100;
            int var10 = var9 + Statics.field1286.method3191() * 2 / 100;
            int var11 = var10 + Statics.field2778.method3191() * 6 / 100;
            int var12 = var11 + Statics.field242.method3191() * 4 / 100;
            int var13 = var12 + Statics.field2593.method3191() * 2 / 100;
            int var14 = var13 + Statics.field1767.method3191() * 60 / 100;
            int var15 = var14 + Statics.field911.method3191() * 2 / 100;
            int var16 = var15 + Statics.field163.method3191() * 2 / 100;
            int var17 = var16 + Statics.field569.method3191() * 2 / 100;
            int var18 = var17 + Statics.field1990.method3191() * 2 / 100;
            int var19 = var18 + Statics.field516.method3191() * 2 / 100;
            int var20 = var19 + Statics.field1500.method3191() * 2 / 100;
            int var21 = var20 + Statics.field110.method3191() * 2 / 100;
            int var22 = var21 + Statics.field1728.method3191() * 2 / 100;
            if (var22 == 100) {
                class21.field324 = class135.field2186;
                class21.field323 = 30;
                field731 = 45;
            } else {
                if (var22 != 0) {
                    class21.field324 = class135.field2102 + var22 + "%";
                }
                class21.field323 = 30;
            }
        } else if (field731 == 45) {
            class52.method892(22050, !field490, 2);
            class142 var23 = new class142();
            var23.method2822(9, 128);
            Statics.field1803 = class52.method123(Statics.field1295, Statics.field2789, 0, 22050);
            Statics.field1803.method1179(var23);
            class155 var24 = Statics.field1728;
            class155 var25 = Statics.field110;
            class155 var26 = Statics.field2778;
            Statics.field1271 = var24;
            Statics.field2348 = var25;
            Statics.field2362 = var26;
            Statics.field2361 = var23;
            Statics.field874 = class52.method123(Statics.field1295, Statics.field2789, 1, 2048);
            Statics.field1284 = new class46();
            Statics.field874.method1179(Statics.field1284);
            Statics.field222 = new class62(22050, Statics.field1105);
            class21.field324 = class135.field2096;
            class21.field323 = 35;
            field731 = 50;
        } else if (field731 == 50) {
            int var27 = 0;
            if (Statics.field923 == null) {
                class155 var28 = Statics.field911;
                class155 var29 = Statics.field1500;
                int var30 = var28.method3092("p11_full");
                int var31 = var28.method3086(var30, "");
                class183 var32;
                if (class84.method1378(var28, var30, var31)) {
                    byte[] var33 = var29.method3080(var30, var31);
                    class183 var34;
                    if (var33 == null) {
                        var34 = null;
                    } else {
                        class183 var35 = new class183(var33, Statics.field1435, Statics.field1436, Statics.field1994, Statics.field400, Statics.field1438, Statics.field1439);
                        class84.method603();
                        var34 = var35;
                    }
                    var32 = var34;
                } else {
                    var32 = null;
                }
                Statics.field923 = var32;
            } else {
                var27++;
            }
            if (Statics.field305 == null) {
                class155 var37 = Statics.field911;
                class155 var38 = Statics.field1500;
                int var39 = var37.method3092("p12_full");
                int var40 = var37.method3086(var39, "");
                class183 var41;
                if (class84.method1378(var37, var39, var40)) {
                    byte[] var42 = var38.method3080(var39, var40);
                    class183 var43;
                    if (var42 == null) {
                        var43 = null;
                    } else {
                        class183 var44 = new class183(var42, Statics.field1435, Statics.field1436, Statics.field1994, Statics.field400, Statics.field1438, Statics.field1439);
                        class84.method603();
                        var43 = var44;
                    }
                    var41 = var43;
                } else {
                    var41 = null;
                }
                Statics.field305 = var41;
            } else {
                var27++;
            }
            if (Statics.field904 == null) {
                class155 var46 = Statics.field911;
                class155 var47 = Statics.field1500;
                int var48 = var46.method3092("b12_full");
                int var49 = var46.method3086(var48, "");
                class183 var50;
                if (class84.method1378(var46, var48, var49)) {
                    byte[] var51 = var47.method3080(var48, var49);
                    class183 var52;
                    if (var51 == null) {
                        var52 = null;
                    } else {
                        class183 var53 = new class183(var51, Statics.field1435, Statics.field1436, Statics.field1994, Statics.field400, Statics.field1438, Statics.field1439);
                        class84.method603();
                        var52 = var53;
                    }
                    var50 = var52;
                } else {
                    var50 = null;
                }
                Statics.field904 = var50;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field324 = class135.field2283 + var27 * 100 / 3 + "%";
                class21.field323 = 40;
            } else {
                Statics.field1635 = new class152(true);
                class21.field324 = class135.field2106;
                class21.field323 = 40;
                field731 = 60;
            }
        } else if (field731 == 60) {
            class155 var55 = Statics.field569;
            class155 var56 = Statics.field911;
            int var57 = 0;
            if (var55.method3093("title.jpg", "")) {
                var57++;
            }
            if (var56.method3093("logo", "")) {
                var57++;
            }
            if (var56.method3093("titlebox", "")) {
                var57++;
            }
            if (var56.method3093("titlebutton", "")) {
                var57++;
            }
            if (var56.method3093("runes", "")) {
                var57++;
            }
            if (var56.method3093("title_mute", "")) {
                var57++;
            }
            var56.method3093("sl_back", "");
            var56.method3093("sl_flags", "");
            var56.method3093("sl_arrows", "");
            var56.method3093("sl_stars", "");
            var56.method3093("sl_button", "");
            byte var60 = 6;
            if (var57 < var60) {
                class21.field324 = class135.field2107 + var57 * 100 / var60 + "%";
                class21.field323 = 50;
            } else {
                class21.field324 = class135.field2108;
                class21.field323 = 50;
                method819(5);
                field731 = 70;
            }
        } else if (field731 == 70) {
            if (Statics.field293.method3105()) {
                class37.method230(Statics.field293);
                class155 var62 = Statics.field293;
                Statics.field880 = var62;
                class155 var63 = Statics.field293;
                class155 var64 = Statics.field1767;
                Statics.field935 = var63;
                Statics.field2748 = var64;
                Statics.field929 = Statics.field935.method3100(3);
                class155 var65 = Statics.field293;
                class155 var66 = Statics.field1767;
                boolean var67 = field490;
                Statics.field817 = var65;
                Statics.field843 = var66;
                class32.field829 = var67;
                class31.method105(Statics.field293, Statics.field1767);
                class155 var68 = Statics.field293;
                class155 var69 = Statics.field1767;
                boolean var70 = field489;
                class183 var71 = Statics.field923;
                Statics.field990 = var68;
                Statics.field982 = var69;
                Statics.field983 = var70;
                Statics.field990.method3100(10);
                Statics.field265 = var71;
                class34.method1553(Statics.field293, Statics.field514, Statics.field1041);
                class155 var72 = Statics.field293;
                class155 var73 = Statics.field1767;
                Statics.field921 = var72;
                Statics.field906 = var73;
                class155 var74 = Statics.field293;
                Statics.field2491 = var74;
                class42.method5(Statics.field293);
                class159.method1467(Statics.field1286, Statics.field1767, Statics.field911, Statics.field1500);
                class155 var75 = Statics.field293;
                Statics.field1032 = var75;
                class155 var76 = Statics.field293;
                Statics.field961 = var76;
                class21.field324 = class135.field2306;
                class21.field323 = 60;
                field731 = 80;
            } else {
                class21.field324 = class135.field2140 + Statics.field293.method3176() + "%";
                class21.field323 = 60;
            }
        } else if (field731 == 80) {
            int var77 = 0;
            if (Statics.field197 == null) {
                class155 var78 = Statics.field911;
                int var79 = var78.method3092("compass");
                int var80 = var78.method3086(var79, "");
                class86 var81;
                if (class84.method1378(var78, var79, var80)) {
                    class86 var82 = new class86();
                    var82.field1460 = Statics.field1437;
                    var82.field1461 = Statics.field1441;
                    var82.field1455 = Statics.field1435[0];
                    var82.field1459 = Statics.field1436[0];
                    var82.field1463 = Statics.field1994[0];
                    var82.field1458 = Statics.field400[0];
                    int var83 = var82.field1463 * var82.field1458;
                    byte[] var84 = Statics.field1439[0];
                    var82.field1464 = new int[var83];
                    for (int var85 = 0; var85 < var83; var85++) {
                        var82.field1464[var85] = Statics.field1438[var84[var85] & 0xFF];
                    }
                    class84.method603();
                    var81 = var82;
                } else {
                    var81 = null;
                }
                Statics.field197 = var81;
            } else {
                var77++;
            }
            if (Statics.field1008 == null) {
                Statics.field1008 = class84.method592(Statics.field911, "mapedge", "");
            } else {
                var77++;
            }
            if (Statics.field1320 == null) {
                Statics.field1320 = class84.method2353(Statics.field911, "mapscene", "");
            } else {
                var77++;
            }
            if (Statics.field219 == null) {
                Statics.field219 = class84.method114(Statics.field911, "mapfunction", "");
            } else {
                var77++;
            }
            if (Statics.field2719 == null) {
                Statics.field2719 = class84.method114(Statics.field911, "hitmarks", "");
            } else {
                var77++;
            }
            if (Statics.field283 == null) {
                Statics.field283 = class84.method114(Statics.field911, "headicons_pk", "");
            } else {
                var77++;
            }
            if (Statics.field1258 == null) {
                Statics.field1258 = class84.method114(Statics.field911, "headicons_prayer", "");
            } else {
                var77++;
            }
            if (Statics.field340 == null) {
                Statics.field340 = class84.method114(Statics.field911, "headicons_hint", "");
            } else {
                var77++;
            }
            if (Statics.field214 == null) {
                Statics.field214 = class84.method114(Statics.field911, "mapmarker", "");
            } else {
                var77++;
            }
            if (Statics.field277 == null) {
                Statics.field277 = class84.method114(Statics.field911, "cross", "");
            } else {
                var77++;
            }
            if (Statics.field1804 == null) {
                Statics.field1804 = class84.method114(Statics.field911, "mapdots", "");
            } else {
                var77++;
            }
            if (Statics.field286 == null) {
                Statics.field286 = class84.method2353(Statics.field911, "scrollbar", "");
            } else {
                var77++;
            }
            if (Statics.field1790 == null) {
                Statics.field1790 = class84.method2353(Statics.field911, "mod_icons", "");
            } else {
                var77++;
            }
            if (Statics.field397 == null) {
                Statics.field397 = class84.method163(Statics.field911, "mapback", "");
            } else {
                var77++;
            }
            if (var77 < 14) {
                class21.field324 = class135.field2124 + var77 * 100 / 14 + "%";
                class21.field323 = 70;
            } else {
                Statics.field2861 = Statics.field1790;
                Statics.field1008.method1727();
                int var88 = (int) (Math.random() * 21.0D) - 10;
                int var89 = (int) (Math.random() * 21.0D) - 10;
                int var90 = (int) (Math.random() * 21.0D) - 10;
                int var91 = (int) (Math.random() * 41.0D) - 20;
                for (int var92 = 0; var92 < Statics.field219.length; var92++) {
                    Statics.field219[var92].method1711(var88 + var91, var89 + var91, var90 + var91);
                }
                Statics.field1320[0].method1812(var88 + var91, var89 + var91, var90 + var91);
                method36();
                class21.field324 = class135.field2157;
                class21.field323 = 70;
                field731 = 90;
            }
        } else if (field731 == 90) {
            if (Statics.field163.method3105()) {
                class110 var93 = new class110(Statics.field163, Statics.field911, 20, 0.8D, field490 ? 64 : 128);
                class104.method2195(var93);
                class104.method2202(0.8D);
                class21.field324 = class135.field2114;
                class21.field323 = 90;
                field731 = 110;
            } else {
                class21.field324 = class135.field2093 + Statics.field163.method3176() + "%";
                class21.field323 = 90;
            }
        } else if (field731 == 110) {
            Statics.field268 = new class16();
            Statics.field1295.method1521(Statics.field268, 10);
            class21.field324 = class135.field2115;
            class21.field323 = 94;
            field731 = 120;
        } else if (field731 == 120) {
            if (Statics.field569.method3093("huffman", "")) {
                class120 var94 = new class120(Statics.field569.method3099("huffman", ""));
                class184.method3241(var94);
                class21.field324 = class135.field2099;
                class21.field323 = 96;
                field731 = 130;
            } else {
                class21.field324 = class135.field2116 + "%";
                class21.field323 = 96;
            }
        } else if (field731 == 130) {
            if (!Statics.field1286.method3105()) {
                class21.field324 = class135.field2171 + Statics.field1286.method3176() * 4 / 5 + "%";
                class21.field323 = 100;
            } else if (!Statics.field516.method3105()) {
                class21.field324 = class135.field2171 + (80 + Statics.field516.method3176() / 6) + "%";
                class21.field323 = 100;
            } else if (Statics.field1500.method3105()) {
                class21.field324 = class135.field2119;
                class21.field323 = 100;
                field731 = 140;
            } else {
                class21.field324 = class135.field2171 + (96 + Statics.field1500.method3176() / 20) + "%";
                class21.field323 = 100;
            }
        } else if (field731 == 140) {
            method819(10);
        }
    }

    @ObfuscatedName("bm.t(IZZZI)Ley;")
    public static class155 method1362(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1414 != null) {
            var4 = new class71(arg0, class82.field1414, Statics.field1422[arg0], 1000000);
        }
        return new class155(var4, Statics.field1503, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("p.q(I)V")
    public static void method36() {
        Statics.field1424 = new int[33];
        Statics.field2000 = new int[33];
        Statics.field2775 = new int[151];
        Statics.field2066 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field397.field1474[Statics.field397.field1471 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1424[var0] = var1;
            Statics.field2000[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field397.field1474[Statics.field397.field1471 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field2775[var4 - 5] = var5 - 25;
            Statics.field2066[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("h.e(B)V")
    public static final void method14() {
        try {
            if (field518 == 0) {
                if (Statics.field420 != null) {
                    Statics.field420.method1383();
                    Statics.field420 = null;
                }
                Statics.field1795 = null;
                field668 = false;
                field519 = 0;
                field518 = 1;
            }
            if (field518 == 1) {
                if (Statics.field1795 == null) {
                    Statics.field1795 = Statics.field1295.method1494(Statics.field59, Statics.field1364);
                }
                if (Statics.field1795.field1392 == 2) {
                    throw new IOException();
                }
                if (Statics.field1795.field1392 == 1) {
                    Statics.field420 = new class70((Socket) Statics.field1795.field1397, Statics.field1295);
                    Statics.field1795 = null;
                    field518 = 2;
                }
            }
            if (field518 == 2) {
                field605.field2027 = 0;
                field605.method2485(14);
                Statics.field420.method1388(field605.field2030, 0, 1);
                field696.field2027 = 0;
                field518 = 3;
            }
            if (field518 == 3) {
                if (Statics.field1803 != null) {
                    Statics.field1803.method1181();
                }
                if (Statics.field874 != null) {
                    Statics.field874.method1181();
                }
                int var0 = Statics.field420.method1400();
                if (Statics.field1803 != null) {
                    Statics.field1803.method1181();
                }
                if (Statics.field874 != null) {
                    Statics.field874.method1181();
                }
                if (var0 != 0) {
                    method1891(var0);
                    return;
                }
                field696.field2027 = 0;
                field518 = 5;
            }
            if (field518 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field605.field2027 = 0;
                field605.method2485(10);
                field605.method2605(var1[0]);
                field605.method2605(var1[1]);
                field605.method2605(var1[2]);
                field605.method2605(var1[3]);
                field605.method2560(0L);
                field605.method2502(class21.field331);
                field605.method2517(class6.field86, class6.field87);
                field527.field2027 = 0;
                if (field492 == 40) {
                    field527.method2485(18);
                } else {
                    field527.method2485(16);
                }
                field527.method2484(0);
                int var2 = field527.field2027;
                field527.method2605(38);
                field527.method2493(field605.field2030, 0, field605.field2027);
                int var3 = field527.field2027;
                field527.method2502(class21.field329);
                field527.method2485(field490 ? 1 : 0);
                class116 var4 = field527;
                byte[] var5 = new byte[24];
                try {
                    class82.field1419.method579(0L);
                    class82.field1419.method580(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var32) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2493(var5, 0, 24);
                class127 var9 = new class127(Statics.field1635.method3073());
                Statics.field1635.method3072(var9);
                field527.method2493(var9.field2030, 0, var9.field2030.length);
                field527.method2605(Statics.field514.field2539);
                field527.method2605(Statics.field1041.field2539);
                field527.method2605(Statics.field293.field2539);
                field527.method2605(Statics.field1286.field2539);
                field527.method2605(Statics.field2778.field2539);
                field527.method2605(Statics.field242.field2539);
                field527.method2605(Statics.field2593.field2539);
                field527.method2605(Statics.field1767.field2539);
                field527.method2605(Statics.field911.field2539);
                field527.method2605(Statics.field163.field2539);
                field527.method2605(Statics.field569.field2539);
                field527.method2605(Statics.field1990.field2539);
                field527.method2605(Statics.field516.field2539);
                field527.method2605(Statics.field1500.field2539);
                field527.method2605(Statics.field110.field2539);
                field527.method2605(Statics.field1728.field2539);
                field527.method2515(var1, var3, field527.field2027);
                field527.method2495(field527.field2027 - var2);
                Statics.field420.method1388(field527.field2030, 0, field527.field2027);
                field605.method2362(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field696.method2362(var1);
                field518 = 6;
            }
            if (field518 == 6 && Statics.field420.method1386() > 0) {
                int var11 = Statics.field420.method1400();
                if (var11 == 21 && field492 == 20) {
                    field518 = 7;
                } else if (var11 == 2) {
                    field518 = 9;
                } else if (var11 == 15 && field492 == 40) {
                    field605.field2027 = 0;
                    field696.field2027 = 0;
                    field744 = -1;
                    field713 = -1;
                    field535 = -1;
                    field547 = -1;
                    field529 = 0;
                    field531 = 0;
                    field501 = 0;
                    field626 = 0;
                    field722 = false;
                    field718 = 0;
                    field716 = 0;
                    for (int var12 = 0; var12 < field729.length; var12++) {
                        if (field729[var12] != null) {
                            field729[var12].field457 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field603.length; var13++) {
                        if (field603[var13] != null) {
                            field603[var13].field457 = -1;
                        }
                    }
                    class19.field289 = new class175(32);
                    method819(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field687[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field520 < 1) {
                    field520++;
                    field518 = 0;
                } else {
                    method1891(var11);
                    return;
                }
            }
            if (field518 == 7 && Statics.field420.method1386() > 0) {
                field521 = (Statics.field420.method1400() + 3) * 60;
                field518 = 8;
            }
            if (field518 == 8) {
                field519 = 0;
                class21.method2430(class135.field2120, class135.field2121, field521 / 60 + class135.field2122);
                if (--field521 <= 0) {
                    field518 = 0;
                }
            } else {
                if (field518 == 9 && Statics.field420.method1386() >= 8) {
                    field651 = Statics.field420.method1400();
                    field652 = Statics.field420.method1400() == 1;
                    field609 = Statics.field420.method1400();
                    field609 <<= 0x8;
                    field609 += Statics.field420.method1400();
                    field528 = Statics.field420.method1400();
                    Statics.field420.method1387(field696.field2030, 0, 1);
                    field696.field2027 = 0;
                    field744 = field696.method2361();
                    Statics.field420.method1387(field696.field2030, 0, 2);
                    field696.field2027 = 0;
                    field529 = field696.method2501();
                    if (field528 == 1) {
                        try {
                            class67.method1377(Statics.field481, "zap");
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            class67.method1377(Statics.field481, "unzap");
                        } catch (Throwable var30) {
                        }
                    }
                    field518 = 10;
                }
                if (field518 != 10) {
                    field519++;
                    if (field519 > 2000) {
                        if (field520 < 1) {
                            if (Statics.field522 == Statics.field1364) {
                                Statics.field1364 = Statics.field2406;
                            } else {
                                Statics.field1364 = Statics.field522;
                            }
                            field520++;
                            field518 = 0;
                        } else {
                            method1891(-3);
                        }
                    }
                } else if (Statics.field420.method1386() >= field529) {
                    field696.field2027 = 0;
                    Statics.field420.method1387(field696.field2030, 0, field529);
                    field739 = 1L;
                    field498 = -1;
                    Statics.field268.field258 = 0;
                    Statics.field206 = true;
                    field499 = true;
                    field583 = -1L;
                    class182.method2473();
                    field605.field2027 = 0;
                    field696.field2027 = 0;
                    field744 = -1;
                    field713 = -1;
                    field535 = -1;
                    field547 = -1;
                    field531 = 0;
                    field501 = 0;
                    field533 = 0;
                    field502 = 0;
                    field626 = 0;
                    field722 = false;
                    class77.method2250(0);
                    for (int var17 = 0; var17 < 100; var17++) {
                        field698[var17] = null;
                    }
                    field699 = 0;
                    field638 = 0;
                    field640 = false;
                    field724 = 0;
                    field548 = (int) (Math.random() * 100.0D) - 50;
                    field550 = (int) (Math.random() * 110.0D) - 55;
                    field554 = (int) (Math.random() * 80.0D) - 40;
                    field670 = (int) (Math.random() * 120.0D) - 60;
                    field557 = (int) (Math.random() * 30.0D) - 20;
                    field568 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field718 = 0;
                    field711 = -1;
                    field716 = 0;
                    field717 = 0;
                    field604 = 0;
                    field624 = 0;
                    for (int var18 = 0; var18 < 2048; var18++) {
                        field729[var18] = null;
                        field608[var18] = null;
                    }
                    for (int var19 = 0; var19 < 32768; var19++) {
                        field603[var19] = null;
                    }
                    Statics.field461 = field729[2047] = new class3();
                    field619.method3382();
                    field620.method3382();
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 104; var21++) {
                            for (int var22 = 0; var22 < 104; var22++) {
                                field617[var20][var21][var22] = null;
                            }
                        }
                    }
                    field616 = new class177();
                    field737 = 0;
                    field736 = 0;
                    field493 = 0;
                    for (int var23 = 0; var23 < Statics.field1042; var23++) {
                        class42 var24 = class42.method2350(var23);
                        if (var24 != null && var24.field1039 == 0) {
                            class160.field2726[var23] = 0;
                            class160.field2727[var23] = 0;
                        }
                    }
                    for (int var25 = 0; var25 < field708.length; var25++) {
                        field708[var25] = -1;
                    }
                    if (field681 != -1) {
                        class159.method806(field681);
                    }
                    for (class4 var26 = (class4) field653.method3352(); var26 != null; var26 = (class4) field653.method3353()) {
                        method62(var26, true);
                    }
                    field681 = -1;
                    field653 = new class175(8);
                    field648 = null;
                    field722 = false;
                    field626 = 0;
                    field742.method3266((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var27 = 0; var27 < 8; var27++) {
                        field642[var27] = null;
                        field615[var27] = false;
                    }
                    class19.field289 = new class175(32);
                    field725 = true;
                    for (int var28 = 0; var28 < 100; var28++) {
                        field687[var28] = true;
                    }
                    field709 = null;
                    Statics.field1817 = 0;
                    Statics.field199 = null;
                    Statics.field2002 = -1;
                    method786(false);
                    field744 = -1;
                }
            }
        } catch (IOException var33) {
            if (field520 < 1) {
                if (Statics.field522 == Statics.field1364) {
                    Statics.field1364 = Statics.field2406;
                } else {
                    Statics.field1364 = Statics.field522;
                }
                field520++;
                field518 = 0;
            } else {
                method1891(-2);
            }
        }
    }

    @ObfuscatedName("cm.l(IB)V")
    public static void method1891(int arg0) {
        if (arg0 == -3) {
            class21.method2430(class135.field2123, class135.field2210, class135.field2125);
        } else if (arg0 == -2) {
            class21.method2430(class135.field2126, class135.field2169, class135.field2128);
        } else if (arg0 == -1) {
            class21.method2430(class135.field2320, class135.field2130, class135.field2131);
        } else if (arg0 == 3) {
            class21.method2430(class135.field2132, class135.field2276, class135.field2134);
        } else if (arg0 == 4) {
            class21.method2430(class135.field2135, class135.field2136, class135.field2327);
        } else if (arg0 == 5) {
            class21.method2430(class135.field2138, class135.field2262, class135.field2133);
        } else if (arg0 == 6) {
            class21.method2430(class135.field2141, class135.field2142, class135.field2143);
        } else if (arg0 == 7) {
            class21.method2430(class135.field2144, class135.field2145, class135.field2146);
        } else if (arg0 == 8) {
            class21.method2430(class135.field2147, class135.field2211, class135.field2149);
        } else if (arg0 == 9) {
            class21.method2430(class135.field2150, class135.field2151, class135.field2118);
        } else if (arg0 == 10) {
            class21.method2430(class135.field2153, class135.field2152, class135.field2183);
        } else if (arg0 == 11) {
            class21.method2430(class135.field2159, class135.field2328, class135.field2158);
        } else if (arg0 == 12) {
            class21.method2430(class135.field2178, class135.field2160, class135.field2161);
        } else if (arg0 == 13) {
            class21.method2430(class135.field2329, class135.field2244, class135.field2164);
        } else if (arg0 == 14) {
            class21.method2430(class135.field2165, class135.field2113, class135.field2137);
        } else if (arg0 == 16) {
            class21.method2430(class135.field2168, class135.field2237, class135.field2170);
        } else if (arg0 == 17) {
            class21.method2430(class135.field2139, class135.field2241, class135.field2173);
        } else if (arg0 == 18) {
            class21.method2430(class135.field2090, class135.field2185, class135.field2104);
        } else if (arg0 == 19) {
            class21.method2430(class135.field2177, class135.field2220, class135.field2179);
        } else if (arg0 == 20) {
            class21.method2430(class135.field2180, class135.field2181, class135.field2182);
        } else if (arg0 == 22) {
            class21.method2430(class135.field2192, class135.field2184, class135.field2163);
        } else if (arg0 == 23) {
            class21.method2430(class135.field2286, class135.field2187, class135.field2188);
        } else if (arg0 == 24) {
            class21.method2430(class135.field2227, class135.field2190, class135.field2191);
        } else if (arg0 == 25) {
            class21.method2430(class135.field2257, class135.field2193, class135.field2194);
        } else if (arg0 == 26) {
            class21.method2430(class135.field2175, class135.field2196, class135.field2197);
        } else if (arg0 == 27) {
            class21.method2430(class135.field2198, class135.field2117, class135.field2200);
        } else if (arg0 == 31) {
            class21.method2430(class135.field2207, class135.field2208, class135.field2172);
        } else if (arg0 == 32) {
            class21.method2430(class135.field2100, class135.field2166, class135.field2103);
        } else if (arg0 == 37) {
            class21.method2430(class135.field2213, class135.field2214, class135.field2215);
        } else if (arg0 == 38) {
            class21.method2430(class135.field2216, class135.field2176, class135.field2218);
        } else if (arg0 == 55) {
            class21.method2430(class135.field2219, class135.field2233, class135.field2221);
        } else {
            class21.method2430(class135.field2222, class135.field2223, class135.field2274);
        }
        method819(10);
    }

    @ObfuscatedName("bw.u(I)V")
    public static final void method1552() {
        if (Statics.field420 != null) {
            Statics.field420.method1383();
            Statics.field420 = null;
        }
        method2787();
        Statics.field751.method1898();
        for (int var0 = 0; var0 < 4; var0++) {
            field544[var0].method2727();
        }
        System.gc();
        class139.field2351 = 1;
        Statics.field2352 = null;
        Statics.field2349 = -1;
        Statics.field2354 = -1;
        Statics.field2355 = 0;
        Statics.field2356 = false;
        Statics.field2020 = 2;
        field720 = -1;
        field625 = false;
        class7.method149();
        method819(10);
    }

    @ObfuscatedName("er.m(I)V")
    public static final void method2787() {
        class37.field952.method3306();
        class33.method2081();
        class36.method238();
        Statics.method232();
        class31.method899();
        class40.method119();
        class34.method546();
        class35.method2171();
        class38.field964.method3306();
        class42.field1038.method3306();
        class164.field2759.method3306();
        class159.field2662.method3306();
        class159.field2602.method3306();
        class159.field2603.method3306();
        ((class110) Statics.field1759).method2266();
        class5.field80.method3306();
        Statics.field514.method3122();
        Statics.field1041.method3122();
        Statics.field1286.method3122();
        Statics.field2778.method3122();
        Statics.field242.method3122();
        Statics.field2593.method3122();
        Statics.field1767.method3122();
        Statics.field911.method3122();
        Statics.field163.method3122();
        Statics.field569.method3122();
        Statics.field1990.method3122();
        Statics.field516.method3122();
    }

    @ObfuscatedName("ec.a(I)V")
    public static final void method2758() {
        if (field533 > 0) {
            method1552();
        } else {
            method819(40);
            Statics.field413 = Statics.field420;
            Statics.field420 = null;
        }
    }

    @ObfuscatedName("ap.f(I)V")
    public static final void method801() {
        if (Statics.field874 != null) {
            Statics.field874.method1180();
        }
        if (Statics.field1803 != null) {
            Statics.field1803.method1180();
        }
    }

    @ObfuscatedName("k.y(Laz;IIII)V")
    public static void method42(class34 arg0, int arg1, int arg2, int arg3) {
        if (field724 >= 50 || field743 == 0 || arg0.field890 == null || arg1 >= arg0.field890.length) {
            return;
        }
        int var4 = arg0.field890[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field666[field724] = var5;
        field726[field724] = var6;
        field727[field724] = 0;
        field526[field724] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field728[field724] = (var8 << 16) + (var9 << 8) + var7;
        field724++;
    }

    @ObfuscatedName("cw.w(IB)V")
    public static void method1627(int arg0) {
        if (arg0 == -1 && !field625) {
            class139.method565();
        } else if (arg0 != -1 && field720 != arg0 && field705 != 0 && !field625) {
            class155 var1 = Statics.field2593;
            int var2 = field705;
            class139.field2351 = 1;
            Statics.field2352 = var1;
            Statics.field2349 = arg0;
            Statics.field2354 = 0;
            Statics.field2355 = var2;
            Statics.field2356 = false;
            Statics.field2020 = 2;
        }
        field720 = arg0;
    }

    @ObfuscatedName("dg.d(III)V")
    public static void method2238(int arg0, int arg1) {
        if (field705 != 0 && arg0 != -1) {
            class139.method3193(Statics.field1990, arg0, 0, field705, false);
            field625 = true;
        }
    }

    @ObfuscatedName("el.i(I)V")
    public static final void method3194() {
        for (int var0 = -1; var0 < field604; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field584[var0];
            }
            class3 var2 = field729[var1];
            if (var2 != null && var2.field424 > 0) {
                var2.field424--;
                if (var2.field424 == 0) {
                    var2.field462 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field624; var3++) {
            int var4 = field525[var3];
            class25 var5 = field603[var4];
            if (var5 != null && var5.field424 > 0) {
                var5.field424--;
                if (var5.field424 == 0) {
                    var5.field462 = null;
                }
            }
        }
    }

    @ObfuscatedName("bj.c(Ljava/lang/String;I)V")
    public static final void method1405(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field78.field186 = !Statics.field78.field186;
            class12.method3258();
            if (Statics.field78.field186) {
                method1557(0, "", "Roofs are now all hidden");
            } else {
                method1557(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field651 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field500 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field500 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2758();
            }
            if (arg0.equalsIgnoreCase("errortest") && field692 == 2) {
                throw new RuntimeException();
            }
        }
        field605.method2360(204);
        field605.method2485(arg0.length() + 1);
        field605.method2502(arg0);
    }

    @ObfuscatedName("b.af(I)V")
    public static final void method137() {
        int var0 = field548 + Statics.field461.field421;
        int var1 = field550 + Statics.field461.field422;
        if (Statics.field1310 - var0 < -500 || Statics.field1310 - var0 > 500 || Statics.field1976 - var1 < -500 || Statics.field1976 - var1 > 500) {
            Statics.field1310 = var0;
            Statics.field1976 = var1;
        }
        if (Statics.field1310 != var0) {
            Statics.field1310 += (var0 - Statics.field1310) / 16;
        }
        if (Statics.field1976 != var1) {
            Statics.field1976 += (var1 - Statics.field1976) / 16;
        }
        if (class77.field1373 == 4 && Statics.field876) {
            int var2 = class77.field1375 - field524;
            field721 = var2 * 2;
            field524 = var2 == -1 || var2 == 1 ? class77.field1375 : (field524 + class77.field1375) / 2;
            int var3 = field571 - class77.field1374;
            field645 = var3 * 2;
            field571 = var3 == -1 || var3 == 1 ? class77.field1374 : (field571 + class77.field1374) / 2;
        } else {
            if (class75.field1345[96]) {
                field645 += (-24 - field645) / 2;
            } else if (class75.field1345[97]) {
                field645 += (24 - field645) / 2;
            } else {
                field645 /= 2;
            }
            if (class75.field1345[98]) {
                field721 += (12 - field721) / 2;
            } else if (class75.field1345[99]) {
                field721 += (-12 - field721) / 2;
            } else {
                field721 /= 2;
            }
            field524 = class77.field1375;
            field571 = class77.field1374;
        }
        field568 = field645 / 2 + field568 & 0x7FF;
        field491 += field721 / 2;
        if (field491 < 128) {
            field491 = 128;
        }
        if (field491 > 383) {
            field491 = 383;
        }
        int var4 = Statics.field1310 >> 7;
        int var5 = Statics.field1976 >> 7;
        int var6 = method183(Statics.field1310, Statics.field1976, Statics.field1113);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1113;
                    if (var10 < 3 && (class9.field121[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class9.field135[var10][var8][var9];
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
        if (var12 > field575) {
            field575 += (var12 - field575) / 24;
        } else if (var12 < field575) {
            field575 += (var12 - field575) / 80;
        }
    }

    @ObfuscatedName("e.at(Laf;II)V")
    public static final void method155(class27 arg0, int arg1) {
        if (arg0.field425 > field496) {
            int var2 = arg0.field425 - field496;
            int var3 = arg0.field460 * 128 + arg0.field458 * 64;
            int var4 = arg0.field458 * 64 + arg0.field445 * 128;
            arg0.field421 += (var3 - arg0.field421) / var2;
            arg0.field422 += (var4 - arg0.field422) / var2;
            arg0.field476 = 0;
            if (arg0.field466 == 0) {
                arg0.field469 = 1024;
            }
            if (arg0.field466 == 1) {
                arg0.field469 = 1536;
            }
            if (arg0.field466 == 2) {
                arg0.field469 = 0;
            }
            if (arg0.field466 == 3) {
                arg0.field469 = 512;
            }
        } else if (arg0.field465 >= field496) {
            method2771(arg0);
        } else {
            method2759(arg0);
        }
        if (arg0.field421 < 128 || arg0.field422 < 128 || arg0.field421 >= 13184 || arg0.field422 >= 13184) {
            arg0.field450 = -1;
            arg0.field455 = -1;
            arg0.field425 = 0;
            arg0.field465 = 0;
            arg0.field421 = arg0.field473[0] * 128 + arg0.field458 * 64;
            arg0.field422 = arg0.field474[0] * 128 + arg0.field458 * 64;
            arg0.method259();
        }
        if (Statics.field461 == arg0 && (arg0.field421 < 1536 || arg0.field422 < 1536 || arg0.field421 >= 11776 || arg0.field422 >= 11776)) {
            arg0.field450 = -1;
            arg0.field455 = -1;
            arg0.field425 = 0;
            arg0.field465 = 0;
            arg0.field421 = arg0.field473[0] * 128 + arg0.field458 * 64;
            arg0.field422 = arg0.field474[0] * 128 + arg0.field458 * 64;
            arg0.method259();
        }
        if (arg0.field459 != 0) {
            if (arg0.field457 != -1 && arg0.field457 < 32768) {
                class25 var5 = field603[arg0.field457];
                if (var5 != null) {
                    int var6 = arg0.field421 - var5.field421;
                    int var7 = arg0.field422 - var5.field422;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field469 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field457 >= 32768) {
                int var8 = arg0.field457 - 32768;
                if (field609 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field729[var8];
                if (var9 != null) {
                    int var10 = arg0.field421 - var9.field421;
                    int var11 = arg0.field422 - var9.field422;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field469 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field478 != 0 || arg0.field446 != 0) && (arg0.field472 == 0 || arg0.field476 > 0)) {
                int var12 = arg0.field421 - (arg0.field478 * 64 - Statics.field1399 * 64 - Statics.field1399 * 64);
                int var13 = arg0.field422 - (arg0.field446 * 64 - Statics.field113 * 64 - Statics.field113 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field469 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field478 = 0;
                arg0.field446 = 0;
            }
            int var14 = arg0.field469 - arg0.field423 & 0x7FF;
            if (var14 == 0) {
                arg0.field470 = 0;
            } else {
                arg0.field470++;
                if (var14 > 1024) {
                    arg0.field423 -= arg0.field459;
                    boolean var15 = true;
                    if (var14 < arg0.field459 || var14 > 2048 - arg0.field459) {
                        arg0.field423 = arg0.field469;
                        var15 = false;
                    }
                    if (arg0.field447 == arg0.field426 && (arg0.field470 > 25 || var15)) {
                        if (arg0.field427 == -1) {
                            arg0.field447 = arg0.field429;
                        } else {
                            arg0.field447 = arg0.field427;
                        }
                    }
                } else {
                    arg0.field423 += arg0.field459;
                    boolean var16 = true;
                    if (var14 < arg0.field459 || var14 > 2048 - arg0.field459) {
                        arg0.field423 = arg0.field469;
                        var16 = false;
                    }
                    if (arg0.field447 == arg0.field426 && (arg0.field470 > 25 || var16)) {
                        if (arg0.field428 == -1) {
                            arg0.field447 = arg0.field429;
                        } else {
                            arg0.field447 = arg0.field428;
                        }
                    }
                }
                arg0.field423 &= 0x7FF;
            }
        }
        method2813(arg0);
    }

    @ObfuscatedName("eq.aw(Laf;B)V")
    public static final void method2771(class27 arg0) {
        if (field496 == arg0.field465 || arg0.field450 == -1 || arg0.field453 != 0 || arg0.field452 + 1 > class34.method152(arg0.field450).field901[arg0.field430]) {
            int var1 = arg0.field465 - arg0.field425;
            int var2 = field496 - arg0.field425;
            int var3 = arg0.field460 * 128 + arg0.field458 * 64;
            int var4 = arg0.field458 * 64 + arg0.field445 * 128;
            int var5 = arg0.field467 * 128 + arg0.field458 * 64;
            int var6 = arg0.field463 * 128 + arg0.field458 * 64;
            arg0.field421 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field422 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field476 = 0;
        if (arg0.field466 == 0) {
            arg0.field469 = 1024;
        }
        if (arg0.field466 == 1) {
            arg0.field469 = 1536;
        }
        if (arg0.field466 == 2) {
            arg0.field469 = 0;
        }
        if (arg0.field466 == 3) {
            arg0.field469 = 512;
        }
        arg0.field423 = arg0.field469;
    }

    @ObfuscatedName("ec.ax(Laf;I)V")
    public static final void method2759(class27 arg0) {
        arg0.field447 = arg0.field426;
        if (arg0.field472 == 0) {
            arg0.field476 = 0;
            return;
        }
        if (arg0.field450 != -1 && arg0.field453 == 0) {
            class34 var1 = class34.method152(arg0.field450);
            if (arg0.field475 > 0 && var1.field898 == 0) {
                arg0.field476++;
                return;
            }
            if (arg0.field475 <= 0 && var1.field896 == 0) {
                arg0.field476++;
                return;
            }
        }
        int var2 = arg0.field421;
        int var3 = arg0.field422;
        int var4 = arg0.field473[arg0.field472 - 1] * 128 + arg0.field458 * 64;
        int var5 = arg0.field474[arg0.field472 - 1] * 128 + arg0.field458 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field421 = var4;
            arg0.field422 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field469 = 1280;
            } else if (var3 > var5) {
                arg0.field469 = 1792;
            } else {
                arg0.field469 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field469 = 768;
            } else if (var3 > var5) {
                arg0.field469 = 256;
            } else {
                arg0.field469 = 512;
            }
        } else if (var3 < var5) {
            arg0.field469 = 1024;
        } else if (var3 > var5) {
            arg0.field469 = 0;
        }
        int var6 = arg0.field469 - arg0.field423 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field434;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field429;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field444;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field431;
        }
        if (var7 == -1) {
            var7 = arg0.field429;
        }
        arg0.field447 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field395.field814;
        }
        if (var9) {
            if (arg0.field469 != arg0.field423 && arg0.field457 == -1 && arg0.field459 != 0) {
                var8 = 2;
            }
            if (arg0.field472 > 2) {
                var8 = 6;
            }
            if (arg0.field472 > 3) {
                var8 = 8;
            }
            if (arg0.field476 > 0 && arg0.field472 > 1) {
                var8 = 8;
                arg0.field476--;
            }
        } else {
            if (arg0.field472 > 1) {
                var8 = 6;
            }
            if (arg0.field472 > 2) {
                var8 = 8;
            }
            if (arg0.field476 > 0 && arg0.field472 > 1) {
                var8 = 8;
                arg0.field476--;
            }
        }
        if (arg0.field432[arg0.field472 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field447 == arg0.field429 && arg0.field433 != -1) {
            arg0.field447 = arg0.field433;
        }
        if (var2 < var4) {
            arg0.field421 += var8;
            if (arg0.field421 > var4) {
                arg0.field421 = var4;
            }
        } else if (var2 > var4) {
            arg0.field421 -= var8;
            if (arg0.field421 < var4) {
                arg0.field421 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field422 += var8;
            if (arg0.field422 > var5) {
                arg0.field422 = var5;
            }
        } else if (var3 > var5) {
            arg0.field422 -= var8;
            if (arg0.field422 < var5) {
                arg0.field422 = var5;
            }
        }
        if (arg0.field421 == var4 && arg0.field422 == var5) {
            arg0.field472--;
            if (arg0.field475 > 0) {
                arg0.field475--;
            }
        }
    }

    @ObfuscatedName("es.ak(Laf;I)V")
    public static final void method2813(class27 arg0) {
        arg0.field451 = false;
        if (arg0.field447 != -1) {
            class34 var1 = class34.method152(arg0.field447);
            if (var1 == null || var1.field887 == null) {
                arg0.field447 = -1;
            } else {
                arg0.field449++;
                if (arg0.field448 < var1.field887.length && arg0.field449 > var1.field901[arg0.field448]) {
                    arg0.field449 = 1;
                    arg0.field448++;
                    method42(var1, arg0.field448, arg0.field421, arg0.field422);
                }
                if (arg0.field448 >= var1.field887.length) {
                    arg0.field449 = 0;
                    arg0.field448 = 0;
                    method42(var1, arg0.field448, arg0.field421, arg0.field422);
                }
            }
        }
        if (arg0.field455 != -1 && field496 >= arg0.field464) {
            if (arg0.field456 < 0) {
                arg0.field456 = 0;
            }
            int var2 = class35.method3034(arg0.field455).field912;
            if (var2 == -1) {
                arg0.field455 = -1;
            } else {
                class34 var3 = class34.method152(var2);
                if (var3 == null || var3.field887 == null) {
                    arg0.field455 = -1;
                } else {
                    arg0.field477++;
                    if (arg0.field456 < var3.field887.length && arg0.field477 > var3.field901[arg0.field456]) {
                        arg0.field477 = 1;
                        arg0.field456++;
                        method42(var3, arg0.field456, arg0.field421, arg0.field422);
                    }
                    if (arg0.field456 >= var3.field887.length && (arg0.field456 < 0 || arg0.field456 >= var3.field887.length)) {
                        arg0.field455 = -1;
                    }
                }
            }
        }
        if (arg0.field450 != -1 && arg0.field453 <= 1) {
            class34 var4 = class34.method152(arg0.field450);
            if (var4.field898 == 1 && arg0.field475 > 0 && arg0.field425 <= field496 && arg0.field465 < field496) {
                arg0.field453 = 1;
                return;
            }
        }
        if (arg0.field450 != -1 && arg0.field453 == 0) {
            class34 var5 = class34.method152(arg0.field450);
            if (var5 == null || var5.field887 == null) {
                arg0.field450 = -1;
            } else {
                arg0.field452++;
                if (arg0.field430 < var5.field887.length && arg0.field452 > var5.field901[arg0.field430]) {
                    arg0.field452 = 1;
                    arg0.field430++;
                    method42(var5, arg0.field430, arg0.field421, arg0.field422);
                }
                if (arg0.field430 >= var5.field887.length) {
                    arg0.field430 -= var5.field891;
                    arg0.field454++;
                    if (arg0.field454 >= var5.field897) {
                        arg0.field450 = -1;
                    } else if (arg0.field430 >= 0 && arg0.field430 < var5.field887.length) {
                        method42(var5, arg0.field430, arg0.field421, arg0.field422);
                    } else {
                        arg0.field450 = -1;
                    }
                }
                arg0.field451 = var5.field893;
            }
        }
        if (arg0.field453 > 0) {
            arg0.field453--;
        }
    }

    @ObfuscatedName("bd.ar(Ls;IIB)V")
    public static void method1323(class3 arg0, int arg1, int arg2) {
        if (arg0.field450 == arg1 && arg1 != -1) {
            int var3 = class34.method152(arg1).field900;
            if (var3 == 1) {
                arg0.field430 = 0;
                arg0.field452 = 0;
                arg0.field453 = arg2;
                arg0.field454 = 0;
            }
            if (var3 == 2) {
                arg0.field454 = 0;
            }
        } else if (arg1 == -1 || arg0.field450 == -1 || class34.method152(arg1).field894 >= class34.method152(arg0.field450).field894) {
            arg0.field450 = arg1;
            arg0.field430 = 0;
            arg0.field452 = 0;
            arg0.field453 = arg2;
            arg0.field454 = 0;
            arg0.field475 = arg0.field472;
        }
    }

    @ObfuscatedName("as.az(Ljava/lang/String;ZI)V")
    public static final void method1186(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field305.method3465(arg0, 250);
        int var6 = Statics.field305.method3436(arg0, 250) * 13;
        class89.method1830(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1832(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field305.method3445(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method158(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method3159(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2789.getGraphics();
            Statics.field417.method1643(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2789.repaint();
        }
    }

    @ObfuscatedName("af.ai(IIIII)V")
    public static final void method265(int arg0, int arg1, int arg2, int arg3) {
        class89.method1824(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2173();
        field587++;
        method1608(true);
        method2587(true);
        method1608(false);
        method2587(false);
        method2769();
        method2781();
        if (!field570) {
            int var4 = field491;
            if (field575 / 256 > var4) {
                var4 = field575 / 256;
            }
            if (field566[4] && field733[4] + 128 > var4) {
                var4 = field733[4] + 128;
            }
            int var5 = field568 + field554 & 0x7FF;
            int var6 = Statics.field1310;
            int var7 = method183(Statics.field461.field421, Statics.field461.field422, Statics.field1113) - 50;
            int var8 = Statics.field1976;
            int var9 = var4 * 3 + 600;
            int var10 = 2048 - var4 & 0x7FF;
            int var11 = 2048 - var5 & 0x7FF;
            int var12 = 0;
            int var13 = 0;
            int var14 = var9;
            if (var10 != 0) {
                int var15 = class104.field1755[var10];
                int var16 = class104.field1743[var10];
                int var17 = var13 * var16 - var9 * var15 >> 16;
                var14 = var13 * var15 + var9 * var16 >> 16;
                var13 = var17;
            }
            if (var11 != 0) {
                int var18 = class104.field1755[var11];
                int var19 = class104.field1743[var11];
                int var20 = var12 * var19 + var14 * var18 >> 16;
                var14 = var14 * var19 - var12 * var18 >> 16;
                var12 = var20;
            }
            Statics.field1797 = var6 - var12;
            Statics.field1737 = var7 - var13;
            Statics.field391 = var8 - var14;
            Statics.field2419 = var4;
            Statics.field2425 = var5;
        }
        int var33;
        if (field570) {
            int var34;
            if (Statics.field78.field186) {
                var34 = Statics.field1113;
            } else {
                int var35 = method183(Statics.field1797, Statics.field391, Statics.field1113);
                if (var35 - Statics.field1737 >= 800 || (class9.field121[Statics.field1113][Statics.field1797 >> 7][Statics.field391 >> 7] & 0x4) == 0) {
                    var34 = 3;
                } else {
                    var34 = Statics.field1113;
                }
            }
            var33 = var34;
        } else {
            int var21;
            if (Statics.field78.field186) {
                var21 = Statics.field1113;
            } else {
                int var22 = 3;
                if (Statics.field2419 < 310) {
                    int var23 = Statics.field1797 >> 7;
                    int var24 = Statics.field391 >> 7;
                    int var25 = Statics.field461.field421 >> 7;
                    int var26 = Statics.field461.field422 >> 7;
                    if ((class9.field121[Statics.field1113][var23][var24] & 0x4) != 0) {
                        var22 = Statics.field1113;
                    }
                    int var27;
                    if (var25 > var23) {
                        var27 = var25 - var23;
                    } else {
                        var27 = var23 - var25;
                    }
                    int var28;
                    if (var26 > var24) {
                        var28 = var26 - var24;
                    } else {
                        var28 = var24 - var26;
                    }
                    if (var27 > var28) {
                        int var29 = var28 * 65536 / var27;
                        int var30 = 32768;
                        while (var23 != var25) {
                            if (var23 < var25) {
                                var23++;
                            } else if (var23 > var25) {
                                var23--;
                            }
                            if ((class9.field121[Statics.field1113][var23][var24] & 0x4) != 0) {
                                var22 = Statics.field1113;
                            }
                            var30 += var29;
                            if (var30 >= 65536) {
                                var30 -= 65536;
                                if (var24 < var26) {
                                    var24++;
                                } else if (var24 > var26) {
                                    var24--;
                                }
                                if ((class9.field121[Statics.field1113][var23][var24] & 0x4) != 0) {
                                    var22 = Statics.field1113;
                                }
                            }
                        }
                    } else {
                        int var31 = var27 * 65536 / var28;
                        int var32 = 32768;
                        while (var24 != var26) {
                            if (var24 < var26) {
                                var24++;
                            } else if (var24 > var26) {
                                var24--;
                            }
                            if ((class9.field121[Statics.field1113][var23][var24] & 0x4) != 0) {
                                var22 = Statics.field1113;
                            }
                            var32 += var31;
                            if (var32 >= 65536) {
                                var32 -= 65536;
                                if (var23 < var25) {
                                    var23++;
                                } else if (var23 > var25) {
                                    var23--;
                                }
                                if ((class9.field121[Statics.field1113][var23][var24] & 0x4) != 0) {
                                    var22 = Statics.field1113;
                                }
                            }
                        }
                    }
                }
                if ((class9.field121[Statics.field1113][Statics.field461.field421 >> 7][Statics.field461.field422 >> 7] & 0x4) != 0) {
                    var22 = Statics.field1113;
                }
                var21 = var22;
            }
            var33 = var21;
        }
        int var36 = Statics.field1797;
        int var37 = Statics.field1737;
        int var38 = Statics.field391;
        int var39 = Statics.field2419;
        int var40 = Statics.field2425;
        for (int var41 = 0; var41 < 5; var41++) {
            if (field566[var41]) {
                int var42 = (int) (Math.random() * (double) (field614[var41] * 2 + 1) - (double) field614[var41] + Math.sin((double) field734[var41] / 100.0D * (double) field735[var41]) * (double) field733[var41]);
                if (var41 == 0) {
                    Statics.field1797 += var42;
                }
                if (var41 == 1) {
                    Statics.field1737 += var42;
                }
                if (var41 == 2) {
                    Statics.field391 += var42;
                }
                if (var41 == 3) {
                    Statics.field2425 = Statics.field2425 + var42 & 0x7FF;
                }
                if (var41 == 4) {
                    Statics.field2419 += var42;
                    if (Statics.field2419 < 128) {
                        Statics.field2419 = 128;
                    }
                    if (Statics.field2419 > 383) {
                        Statics.field2419 = 383;
                    }
                }
            }
        }
        int var43 = class77.field1374;
        int var44 = class77.field1375;
        if (var43 >= arg0 && var43 < arg0 + arg2 && var44 >= arg1 && var44 < arg1 + arg3) {
            class112.field1859 = true;
            class112.field1900 = 0;
            class112.field1894 = class77.field1374 - arg0;
            class112.field1899 = class77.field1375 - arg1;
        } else {
            class112.field1859 = false;
            class112.field1900 = 0;
        }
        method801();
        class89.method1830(arg0, arg1, arg2, arg3, 0);
        method801();
        Statics.field751.method1936(Statics.field1797, Statics.field1737, Statics.field391, Statics.field2419, Statics.field2425, var33);
        method801();
        Statics.field751.method1912();
        field673 = 0;
        for (int var45 = -1; var45 < field624 + field604; var45++) {
            class27 var46;
            if (var45 == -1) {
                var46 = Statics.field461;
            } else if (var45 < field604) {
                var46 = field729[field584[var45]];
            } else {
                var46 = field603[field525[var45 - field604]];
            }
            if (var46 != null && var46.method21()) {
                if (var46 instanceof class25) {
                    class31 var47 = ((class25) var46).field395;
                    if (var47.field810 != null) {
                        var47 = var47.method612();
                    }
                    if (var47 == null) {
                        continue;
                    }
                }
                if (var45 >= field604) {
                    class31 var50 = ((class25) var46).field395;
                    if (var50.field810 != null) {
                        var50 = var50.method612();
                    }
                    if (var50.field789 >= 0 && var50.field789 < Statics.field1258.length) {
                        method1379(var46, var46.field468 + 15);
                        if (field654 > -1) {
                            Statics.field1258[var50.field789].method1764(field654 + arg0 - 12, field589 + arg1 - 30);
                        }
                    }
                    if (field502 == 1 && field503 == field525[var45 - field604] && field496 % 20 < 10) {
                        method1379(var46, var46.field468 + 15);
                        if (field654 > -1) {
                            Statics.field340[0].method1764(field654 + arg0 - 12, field589 + arg1 - 28);
                        }
                    }
                } else {
                    int var48 = 30;
                    class3 var49 = (class3) var46;
                    if (var49.field43 != -1 || var49.field48 != -1) {
                        method1379(var46, var46.field468 + 15);
                        if (field654 > -1) {
                            if (var49.field43 != -1) {
                                Statics.field283[var49.field43].method1764(field654 + arg0 - 12, field589 + arg1 - var48);
                                var48 += 25;
                            }
                            if (var49.field48 != -1) {
                                Statics.field1258[var49.field48].method1764(field654 + arg0 - 12, field589 + arg1 - var48);
                                var48 += 25;
                            }
                        }
                    }
                    if (var45 >= 0 && field502 == 10 && field597 == field584[var45]) {
                        method1379(var46, var46.field468 + 15);
                        if (field654 > -1) {
                            Statics.field340[1].method1764(field654 + arg0 - 12, field589 + arg1 - var48);
                        }
                    }
                }
                if (var46.field462 != null && (var45 >= field604 || field701 == 0 || field701 == 3 || field701 == 1 && method1706(((class3) var46).field45))) {
                    method1379(var46, var46.field468);
                    if (field654 > -1 && field673 < field577) {
                        field581[field673] = Statics.field904.method3462(var46.field462) / 2;
                        field627[field673] = Statics.field904.field2847;
                        field578[field673] = field654;
                        field579[field673] = field589;
                        field582[field673] = var46.field436;
                        field530[field673] = var46.field437;
                        field576[field673] = var46.field424;
                        field511[field673] = var46.field462;
                        field673++;
                    }
                }
                if (var46.field435 > field496) {
                    method1379(var46, var46.field468 + 15);
                    if (field654 > -1) {
                        int var51 = var46.field442 * 30 / var46.field443;
                        if (var51 > 30) {
                            var51 = 30;
                        } else if (var51 == 0 && var46.field442 > 0) {
                            var51 = 1;
                        }
                        class89.method1830(field654 + arg0 - 15, field589 + arg1 - 3, var51, 5, 65280);
                        class89.method1830(field654 + arg0 - 15 + var51, field589 + arg1 - 3, 30 - var51, 5, 16711680);
                    }
                }
                for (int var52 = 0; var52 < 4; var52++) {
                    if (var46.field440[var52] > field496) {
                        method1379(var46, var46.field468 / 2);
                        if (field654 > -1) {
                            if (var52 == 1) {
                                field589 -= 20;
                            }
                            if (var52 == 2) {
                                field654 -= 15;
                                field589 -= 10;
                            }
                            if (var52 == 3) {
                                field654 += 15;
                                field589 -= 10;
                            }
                            Statics.field2719[var46.field439[var52]].method1764(field654 + arg0 - 12, field589 + arg1 - 12);
                            Statics.field923.method3444(Integer.toString(var46.field438[var52]), field654 + arg0 - 1, field589 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var53 = 0; var53 < field673; var53++) {
            int var54 = field578[var53];
            int var55 = field579[var53];
            int var56 = field581[var53];
            int var57 = field627[var53];
            boolean var58 = true;
            while (var58) {
                var58 = false;
                for (int var59 = 0; var59 < var53; var59++) {
                    if (var55 + 2 > field579[var59] - field627[var59] && var55 - var57 < field579[var59] + 2 && var54 - var56 < field581[var59] + field578[var59] && var54 + var56 > field578[var59] - field581[var59] && field579[var59] - field627[var59] < var55) {
                        var55 = field579[var59] - field627[var59];
                        var58 = true;
                    }
                }
            }
            field654 = field578[var53];
            field589 = field579[var53] = var55;
            String var60 = field511[var53];
            if (field646 == 0) {
                int var61 = 16776960;
                if (field582[var53] < 6) {
                    var61 = field700[field582[var53]];
                }
                if (field582[var53] == 6) {
                    var61 = field587 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field582[var53] == 7) {
                    var61 = field587 % 20 < 10 ? 255 : 65535;
                }
                if (field582[var53] == 8) {
                    var61 = field587 % 20 < 10 ? 45056 : 8454016;
                }
                if (field582[var53] == 9) {
                    int var62 = 150 - field576[var53];
                    if (var62 < 50) {
                        var61 = var62 * 1280 + 16711680;
                    } else if (var62 < 100) {
                        var61 = 16776960 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var61 = (var62 - 100) * 5 + 65280;
                    }
                }
                if (field582[var53] == 10) {
                    int var63 = 150 - field576[var53];
                    if (var63 < 50) {
                        var61 = var63 * 5 + 16711680;
                    } else if (var63 < 100) {
                        var61 = 16711935 - (var63 - 50) * 327680;
                    } else if (var63 < 150) {
                        var61 = (var63 - 100) * 327680 + 255 - (var63 - 100) * 5;
                    }
                }
                if (field582[var53] == 11) {
                    int var64 = 150 - field576[var53];
                    if (var64 < 50) {
                        var61 = 16777215 - var64 * 327685;
                    } else if (var64 < 100) {
                        var61 = (var64 - 50) * 327685 + 65280;
                    } else if (var64 < 150) {
                        var61 = 16777215 - (var64 - 100) * 327680;
                    }
                }
                if (field530[var53] == 0) {
                    Statics.field904.method3444(var60, field654 + arg0, field589 + arg1, var61, 0);
                }
                if (field530[var53] == 1) {
                    Statics.field904.method3460(var60, field654 + arg0, field589 + arg1, var61, 0, field587);
                }
                if (field530[var53] == 2) {
                    Statics.field904.method3447(var60, field654 + arg0, field589 + arg1, var61, 0, field587);
                }
                if (field530[var53] == 3) {
                    Statics.field904.method3448(var60, field654 + arg0, field589 + arg1, var61, 0, field587, 150 - field576[var53]);
                }
                if (field530[var53] == 4) {
                    int var65 = (150 - field576[var53]) * (Statics.field904.method3462(var60) + 100) / 150;
                    class89.method1846(field654 + arg0 - 50, arg1, field654 + arg0 + 50, arg1 + arg3);
                    Statics.field904.method3456(var60, field654 + arg0 + 50 - var65, field589 + arg1, var61, 0);
                    class89.method1824(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field530[var53] == 5) {
                    int var66 = 150 - field576[var53];
                    int var67 = 0;
                    if (var66 < 25) {
                        var67 = var66 - 25;
                    } else if (var66 > 125) {
                        var67 = var66 - 125;
                    }
                    class89.method1846(arg0, field589 + arg1 - Statics.field904.field2847 - 1, arg0 + arg2, field589 + arg1 + 5);
                    Statics.field904.method3444(var60, field654 + arg0, field589 + arg1 + var67, var61, 0);
                    class89.method1824(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field904.method3444(var60, field654 + arg0, field589 + arg1, 16776960, 0);
            }
        }
        method2760(arg0, arg1);
        ((class110) Statics.field1759).method2263(field723);
        if (field634 == 1) {
            Statics.field277[field592 / 100].method1764(field590 - 8, field591 - 8);
        }
        if (field634 == 2) {
            Statics.field277[field592 / 100 + 4].method1764(field590 - 8, field591 - 8);
        }
        method181();
        if (field500) {
            int var68 = arg0 + 512 - 5;
            int var69 = arg1 + 20;
            Statics.field305.method3440("Fps:" + field1312, var68, var69, 16776960, -1);
            int var73 = var69 + 15;
            Runtime var70 = Runtime.getRuntime();
            int var71 = (int) ((var70.totalMemory() - var70.freeMemory()) / 1024L);
            int var72 = 16776960;
            if (var71 > 32768 && field490) {
                var72 = 16711680;
            }
            if (var71 > 65536 && !field490) {
                var72 = 16711680;
            }
            Statics.field305.method3440("Mem:" + var71 + "k", var68, var73, var72, -1);
            var69 = var73 + 15;
        }
        Statics.field1797 = var36;
        Statics.field1737 = var37;
        Statics.field391 = var38;
        Statics.field2419 = var39;
        Statics.field2425 = var40;
        if (field725 && class154.method237(true, false) == 0) {
            field725 = false;
        }
        if (field725) {
            class89.method1830(arg0, arg1, arg2, arg3, 0);
            method1186(class135.field2112, false);
        }
        if (!field725 && !field722 && var43 >= arg0 && var43 < arg0 + arg2 && var44 >= arg1 && var44 < arg1 + arg3) {
            method507(var43, var44, arg0, arg1);
        }
    }

    @ObfuscatedName("ch.aj(ZI)V")
    public static final void method1608(boolean arg0) {
        if (Statics.field461.field421 >> 7 == field716 && Statics.field461.field422 >> 7 == field717) {
            field716 = 0;
        }
        int var1 = field604;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field461;
                var4 = 33538048;
            } else {
                var3 = field729[field584[var2]];
                var4 = field584[var2] << 14;
            }
            if (var3 != null && var3.method21()) {
                var3.field34 = false;
                if ((field490 && field604 > 50 || field604 > 200) && !arg0 && var3.field447 == var3.field426) {
                    var3.field34 = true;
                }
                int var5 = var3.field421 >> 7;
                int var6 = var3.field422 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field46 == null || field496 < var3.field41 || field496 >= var3.field42) {
                        if ((var3.field421 & 0x7F) == 64 && (var3.field422 & 0x7F) == 64) {
                            if (field587 == field586[var5][var6]) {
                                continue;
                            }
                            field586[var5][var6] = field587;
                        }
                        var3.field40 = method183(var3.field421, var3.field422, Statics.field1113);
                        Statics.field751.method1909(Statics.field1113, var3.field421, var3.field422, var3.field40, 60, var3, var3.field423, var4, var3.field451);
                    } else {
                        var3.field34 = false;
                        var3.field40 = method183(var3.field421, var3.field422, Statics.field1113);
                        Statics.field751.method1910(Statics.field1113, var3.field421, var3.field422, var3.field40, 60, var3, var3.field423, var4, var3.field35, var3.field36, var3.field49, var3.field50);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.ap(ZI)V")
    public static final void method2587(boolean arg0) {
        for (int var1 = 0; var1 < field624; var1++) {
            class25 var2 = field603[field525[var1]];
            int var3 = (field525[var1] << 14) + 536870912;
            if (var2 != null && var2.method21() && var2.field395.field805 == arg0 && var2.field395.method613()) {
                int var4 = var2.field421 >> 7;
                int var5 = var2.field422 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field458 == 1 && (var2.field421 & 0x7F) == 64 && (var2.field422 & 0x7F) == 64) {
                        if (field587 == field586[var4][var5]) {
                            continue;
                        }
                        field586[var4][var5] = field587;
                    }
                    if (!var2.field395.field813) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field751.method1909(Statics.field1113, var2.field421, var2.field422, method183(var2.field421 + (var2.field458 * 64 - 64), var2.field422 + (var2.field458 * 64 - 64), Statics.field1113), var2.field458 * 64 - 64 + 60, var2, var2.field423, var3, var2.field451);
                }
            }
        }
    }

    @ObfuscatedName("ei.av(B)V")
    public static final void method2769() {
        for (class10 var0 = (class10) field619.method3373(); var0 != null; var0 = (class10) field619.method3375()) {
            if (Statics.field1113 != var0.field142 || field496 > var0.field158) {
                var0.method3404();
            } else if (field496 >= var0.field147) {
                if (var0.field151 > 0) {
                    class25 var1 = field603[var0.field151 - 1];
                    if (var1 != null && var1.field421 >= 0 && var1.field421 < 13312 && var1.field422 >= 0 && var1.field422 < 13312) {
                        var0.method103(var1.field421, var1.field422, method183(var1.field421, var1.field422, var0.field142) - var0.field146, field496);
                    }
                }
                if (var0.field151 < 0) {
                    int var2 = -var0.field151 - 1;
                    class3 var3;
                    if (field609 == var2) {
                        var3 = Statics.field461;
                    } else {
                        var3 = field729[var2];
                    }
                    if (var3 != null && var3.field421 >= 0 && var3.field421 < 13312 && var3.field422 >= 0 && var3.field422 < 13312) {
                        var0.method103(var3.field421, var3.field422, method183(var3.field421, var3.field422, var0.field142) - var0.field146, field496);
                    }
                }
                var0.method104(field723);
                Statics.field751.method1909(Statics.field1113, (int) var0.field153, (int) var0.field172, (int) var0.field155, 60, var0, var0.field156, -1, false);
            }
        }
    }

    @ObfuscatedName("ep.ad(B)V")
    public static final void method2781() {
        for (class20 var0 = (class20) field620.method3373(); var0 != null; var0 = (class20) field620.method3375()) {
            if (Statics.field1113 != var0.field306 || var0.field304) {
                var0.method3404();
            } else if (field496 >= var0.field296) {
                var0.method188(field723);
                if (var0.field304) {
                    var0.method3404();
                } else {
                    Statics.field751.method1909(var0.field306, var0.field297, var0.field307, var0.field300, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ec.ae(IIS)V")
    public static final void method2760(int arg0, int arg1) {
        if (field502 == 2) {
            method1660((field505 - Statics.field1399 << 7) + field508, (field506 - Statics.field113 << 7) + field509, field507 * 2);
            if (field654 > -1 && field496 % 20 < 10) {
                Statics.field340[0].method1764(field654 + arg0 - 12, field589 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("a.ah(I)V")
    public static final void method181() {
        field637 = 0;
        int var0 = (Statics.field461.field421 >> 7) + Statics.field1399;
        int var1 = (Statics.field461.field422 >> 7) + Statics.field113;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field637 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field637 = 1;
        }
        if (field637 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field637 = 0;
        }
    }

    @ObfuscatedName("bx.am(Laf;II)V")
    public static final void method1379(class27 arg0, int arg1) {
        method1660(arg0.field421, arg0.field422, arg1);
    }

    @ObfuscatedName("ca.ay(IIII)V")
    public static final void method1660(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field654 = -1;
            field589 = -1;
            return;
        }
        int var3 = method183(arg0, arg1, Statics.field1113) - arg2;
        int var4 = arg0 - Statics.field1797;
        int var5 = var3 - Statics.field1737;
        int var6 = arg1 - Statics.field391;
        int var7 = class104.field1755[Statics.field2419];
        int var8 = class104.field1743[Statics.field2419];
        int var9 = class104.field1755[Statics.field2425];
        int var10 = class104.field1743[Statics.field2425];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field654 = (var11 << 9) / var15 + 256;
            field589 = (var14 << 9) / var15 + 167;
        } else {
            field654 = -1;
            field589 = -1;
        }
    }

    @ObfuscatedName("f.ag(IIIB)I")
    public static final int method183(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field121[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field135[var5][var3][var4] + class9.field135[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field135[var5][var3][var4 + 1] + class9.field135[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ap.al(ZB)V")
    public static final void method786(boolean arg0) {
        field545 = arg0;
        if (!field545) {
            int var1 = field696.method2541();
            int var2 = (field529 - field696.field2027) / 16;
            Statics.field1912 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field1912[var3][var4] = field696.method2549();
                }
            }
            int var5 = field696.method2622();
            int var6 = field696.method2501();
            int var7 = field696.method2524();
            int var8 = field696.method2622();
            Statics.field15 = new int[var2];
            Statics.field926 = new int[var2];
            Statics.field1608 = new int[var2];
            Statics.field363 = new byte[var2][];
            Statics.field209 = new byte[var2][];
            boolean var9 = false;
            if ((var6 / 8 == 48 || var6 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var6 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var6 - 6) / 8; var11 <= (var6 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field15[var10] = var13;
                        Statics.field926[var10] = Statics.field242.method3092("m" + var11 + "_" + var12);
                        Statics.field1608[var10] = Statics.field242.method3092("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method187(var6, var1, var7, var5, var8);
            return;
        }
        field696.method2373();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field696.method2359(1);
                    if (var17 == 1) {
                        field546[var14][var15][var16] = field696.method2359(26);
                    } else {
                        field546[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field696.method2364();
        int var18 = (field529 - field696.field2027) / 16;
        Statics.field1912 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1912[var19][var20] = field696.method2549();
            }
        }
        int var21 = field696.method2530();
        int var22 = field696.method2622();
        int var23 = field696.method2622();
        int var24 = field696.method2622();
        int var25 = field696.method2522();
        Statics.field15 = new int[var18];
        Statics.field926 = new int[var18];
        Statics.field1608 = new int[var18];
        Statics.field363 = new byte[var18][];
        Statics.field209 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field546[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field15[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field15[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field926[var26] = Statics.field242.method3092("m" + var35 + "_" + var36);
                            Statics.field1608[var26] = Statics.field242.method3092("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method187(var21, var24, var25, var23, var22);
    }

    @ObfuscatedName("f.an(IIIIIB)V")
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2002 == arg0 && Statics.field254 == arg1 && field538 == arg2 || !field490) {
            return;
        }
        Statics.field2002 = arg0;
        Statics.field254 = arg1;
        field538 = arg2;
        if (!field490) {
            field538 = 0;
        }
        method819(25);
        method1186(class135.field2112, true);
        int var5 = Statics.field1399;
        int var6 = Statics.field113;
        Statics.field1399 = (arg0 - 6) * 8;
        Statics.field113 = (arg1 - 6) * 8;
        int var7 = Statics.field1399 - var5;
        int var8 = Statics.field113 - var6;
        int var9 = Statics.field1399;
        int var10 = Statics.field113;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field603[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field473[var13] -= var7;
                    var12.field474[var13] -= var8;
                }
                var12.field421 -= var7 * 128;
                var12.field422 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field729[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field473[var16] -= var7;
                    var15.field474[var16] -= var8;
                }
                var15.field421 -= var7 * 128;
                var15.field422 -= var8 * 128;
            }
        }
        Statics.field1113 = arg2;
        Statics.field461.method255(arg3, arg4, false);
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
                        field617[var27][var23][var24] = field617[var27][var25][var26];
                    } else {
                        field617[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field616.method3373(); var28 != null; var28 = (class22) field616.method3375()) {
            var28.field349 -= var7;
            var28.field350 -= var8;
            if (var28.field349 < 0 || var28.field350 < 0 || var28.field349 >= 104 || var28.field350 >= 104) {
                var28.method3404();
            }
        }
        if (field716 != 0) {
            field716 -= var7;
            field717 -= var8;
        }
        field724 = 0;
        field570 = false;
        field711 = -1;
        field620.method3382();
        field619.method3382();
    }

    @ObfuscatedName("ci.aa(ZB)V")
    public static final void method1703(boolean arg0) {
        method801();
        field719++;
        if (field719 < 50 && !arg0) {
            return;
        }
        field719 = 0;
        if (field668 || Statics.field420 == null) {
            return;
        }
        field605.method2360(75);
        try {
            Statics.field420.method1388(field605.field2030, 0, field605.field2027);
            field605.field2027 = 0;
        } catch (IOException var2) {
            field668 = true;
        }
    }

    @ObfuscatedName("m.ao(II)V")
    public static final void method169(int arg0) {
        int[] var1 = Statics.field344.field1464;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field121[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field751.method1932(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field121[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field751.method1932(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field344.method1710();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field121[arg0][var10][var9] & 0x18) == 0) {
                    method3298(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field121[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3298(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field712 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field751.method1927(Statics.field1113, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method249(var14).field845;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field544[Statics.field1113].field2049;
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
                        field715[field712] = Statics.field219[var15];
                        field662[field712] = var16;
                        field714[field712] = var17;
                        field712++;
                    }
                }
            }
        }
        Statics.field417.method1702();
    }

    @ObfuscatedName("fm.au(IIIIII)V")
    public static final void method3298(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field751.method1924(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field751.method2005(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field344.field1464;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method249(var12);
            if (var13.field838 == -1) {
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
                class87 var14 = Statics.field1320[var13.field838];
                if (var14 != null) {
                    int var15 = (var13.field823 * 4 - var14.field1471) / 2;
                    int var16 = (var13.field833 * 4 - var14.field1470) / 2;
                    var14.method1819(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field833) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field751.method1926(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field751.method2005(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method249(var21);
            if (var22.field838 != -1) {
                class87 var23 = Statics.field1320[var22.field838];
                if (var23 != null) {
                    int var24 = (var22.field823 * 4 - var23.field1471) / 2;
                    int var25 = (var22.field833 * 4 - var23.field1470) / 2;
                    var23.method1819(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field833) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field344.field1464;
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
        int var29 = Statics.field751.method1927(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method249(var30);
        if (var31.field838 == -1) {
            return;
        }
        class87 var32 = Statics.field1320[var31.field838];
        if (var32 != null) {
            int var33 = (var31.field823 * 4 - var32.field1471) / 2;
            int var34 = (var31.field833 * 4 - var32.field1470) / 2;
            var32.method1819(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field833) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("em.ab(B)V")
    public static final void method2836() {
        if (field744 == 193) {
            int var0 = field696.method2582();
            int var1 = (var0 >> 4 & 0x7) + Statics.field77;
            int var2 = (var0 & 0x7) + Statics.field103;
            int var3 = field696.method2541();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class177 var4 = field617[Statics.field1113][var1][var2];
                if (var4 != null) {
                    for (class17 var5 = (class17) var4.method3373(); var5 != null; var5 = (class17) var4.method3375()) {
                        if ((var3 & 0x7FFF) == var5.field266) {
                            var5.method3404();
                            break;
                        }
                    }
                    if (var4.method3373() == null) {
                        field617[Statics.field1113][var1][var2] = null;
                    }
                    method252(var1, var2);
                }
            }
        } else if (field744 == 174) {
            int var6 = field696.method2522();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field560[var7];
            int var10 = field696.method2522();
            int var11 = (var10 >> 4 & 0x7) + Statics.field77;
            int var12 = (var10 & 0x7) + Statics.field103;
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                method1561(Statics.field1113, var11, var12, var9, -1, var7, var8, 0, -1);
            }
        } else if (field744 == 246) {
            int var13 = field696.method2541();
            int var14 = field696.method2522();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field560[var15];
            int var18 = field696.method2522();
            int var19 = (var18 >> 4 & 0x7) + Statics.field77;
            int var20 = (var18 & 0x7) + Statics.field103;
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                method1561(Statics.field1113, var19, var20, var17, var13, var15, var16, 0, -1);
            }
        } else {
            if (field744 == 172) {
                byte var21 = field696.method2500();
                int var22 = field696.method2501();
                int var23 = field696.method2541();
                byte var24 = field696.method2628();
                int var25 = field696.method2522();
                int var26 = var25 >> 2;
                int var27 = var25 & 0x3;
                int var28 = field560[var26];
                int var29 = field696.method2530();
                byte var30 = field696.method2628();
                int var31 = field696.method2524();
                int var32 = (var31 >> 4 & 0x7) + Statics.field77;
                int var33 = (var31 & 0x7) + Statics.field103;
                int var34 = field696.method2530();
                byte var35 = field696.method2533();
                class3 var36;
                if (field609 == var29) {
                    var36 = Statics.field461;
                } else {
                    var36 = field729[var29];
                }
                if (var36 != null) {
                    class32 var37 = class32.method249(var23);
                    int var38;
                    int var39;
                    if (var27 == 1 || var27 == 3) {
                        var38 = var37.field833;
                        var39 = var37.field823;
                    } else {
                        var38 = var37.field823;
                        var39 = var37.field833;
                    }
                    int var40 = (var38 >> 1) + var32;
                    int var41 = (var38 + 1 >> 1) + var32;
                    int var42 = (var39 >> 1) + var33;
                    int var43 = (var39 + 1 >> 1) + var33;
                    int[][] var44 = class9.field135[Statics.field1113];
                    int var45 = var44[var40][var42] + var44[var41][var42] + var44[var40][var43] + var44[var41][var43] >> 2;
                    int var46 = (var32 << 7) + (var38 << 6);
                    int var47 = (var33 << 7) + (var39 << 6);
                    class112 var48 = var37.method653(var26, var27, var44, var46, var45, var47);
                    if (var48 != null) {
                        method1561(Statics.field1113, var32, var33, var28, -1, 0, 0, var22 + 1, var34 + 1);
                        var36.field41 = field496 + var22;
                        var36.field42 = field496 + var34;
                        var36.field46 = var48;
                        var36.field47 = var32 * 128 + var38 * 64;
                        var36.field53 = var33 * 128 + var39 * 64;
                        var36.field44 = var45;
                        if (var21 > var24) {
                            byte var49 = var21;
                            var21 = var24;
                            var24 = var49;
                        }
                        if (var35 > var30) {
                            byte var50 = var35;
                            var35 = var30;
                            var30 = var50;
                        }
                        var36.field35 = var21 + var32;
                        var36.field49 = var24 + var32;
                        var36.field36 = var33 + var35;
                        var36.field50 = var30 + var33;
                    }
                }
            }
            if (field744 == 20) {
                int var51 = field696.method2499();
                int var52 = (var51 >> 4 & 0x7) + Statics.field77;
                int var53 = (var51 & 0x7) + Statics.field103;
                int var54 = field696.method2501();
                int var55 = field696.method2499();
                int var56 = var55 >> 4 & 0xF;
                int var57 = var55 & 0x7;
                int var58 = field696.method2499();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var59 = var56 + 1;
                    if (Statics.field461.field473[0] >= var52 - var59 && Statics.field461.field473[0] <= var52 + var59 && Statics.field461.field474[0] >= var53 - var59 && Statics.field461.field474[0] <= var53 + var59 && field743 != 0 && var57 > 0 && field724 < 50) {
                        field666[field724] = var54;
                        field726[field724] = var57;
                        field727[field724] = var58;
                        field526[field724] = null;
                        field728[field724] = (var52 << 16) + (var53 << 8) + var56;
                        field724++;
                    }
                }
            }
            if (field744 == 100) {
                int var60 = field696.method2499();
                int var61 = (var60 >> 4 & 0x7) + Statics.field77;
                int var62 = (var60 & 0x7) + Statics.field103;
                int var63 = field696.method2501();
                int var64 = field696.method2501();
                int var65 = field696.method2501();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                    class177 var66 = field617[Statics.field1113][var61][var62];
                    if (var66 != null) {
                        for (class17 var67 = (class17) var66.method3373(); var67 != null; var67 = (class17) var66.method3375()) {
                            if ((var63 & 0x7FFF) == var67.field266 && var67.field270 == var64) {
                                var67.field270 = var65;
                                break;
                            }
                        }
                        method252(var61, var62);
                    }
                }
            } else if (field744 == 157) {
                int var68 = field696.method2499();
                int var69 = (var68 >> 4 & 0x7) + Statics.field77;
                int var70 = (var68 & 0x7) + Statics.field103;
                int var71 = var69 + field696.method2500();
                int var72 = var70 + field696.method2500();
                int var73 = field696.method2511();
                int var74 = field696.method2501();
                int var75 = field696.method2499() * 4;
                int var76 = field696.method2499() * 4;
                int var77 = field696.method2501();
                int var78 = field696.method2501();
                int var79 = field696.method2499();
                int var80 = field696.method2499();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var74 != 65535) {
                    int var81 = var69 * 128 + 64;
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    int var84 = var72 * 128 + 64;
                    class10 var85 = new class10(var74, Statics.field1113, var81, var82, method183(var81, var82, Statics.field1113) - var75, field496 + var77, field496 + var78, var79, var80, var73, var76);
                    var85.method103(var83, var84, method183(var83, var84, Statics.field1113) - var76, field496 + var77);
                    field619.method3381(var85);
                }
            } else if (field744 == 233) {
                int var86 = field696.method2622();
                int var87 = field696.method2541();
                int var88 = field696.method2541();
                int var89 = field696.method2524();
                int var90 = (var89 >> 4 & 0x7) + Statics.field77;
                int var91 = (var89 & 0x7) + Statics.field103;
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && field609 != var87) {
                    class17 var92 = new class17();
                    var92.field266 = var86;
                    var92.field270 = var88;
                    if (field617[Statics.field1113][var90][var91] == null) {
                        field617[Statics.field1113][var90][var91] = new class177();
                    }
                    field617[Statics.field1113][var90][var91].method3381(var92);
                    method252(var90, var91);
                }
            } else if (field744 == 50) {
                int var93 = field696.method2501();
                int var94 = field696.method2524();
                int var95 = (var94 >> 4 & 0x7) + Statics.field77;
                int var96 = (var94 & 0x7) + Statics.field103;
                int var97 = field696.method2541();
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class17 var98 = new class17();
                    var98.field266 = var93;
                    var98.field270 = var97;
                    if (field617[Statics.field1113][var95][var96] == null) {
                        field617[Statics.field1113][var95][var96] = new class177();
                    }
                    field617[Statics.field1113][var95][var96].method3381(var98);
                    method252(var95, var96);
                }
            } else if (field744 == 163) {
                int var99 = field696.method2499();
                int var100 = (var99 >> 4 & 0x7) + Statics.field77;
                int var101 = (var99 & 0x7) + Statics.field103;
                int var102 = field696.method2501();
                int var103 = field696.method2499();
                int var104 = field696.method2501();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    int var105 = var100 * 128 + 64;
                    int var106 = var101 * 128 + 64;
                    class20 var107 = new class20(var102, Statics.field1113, var105, var106, method183(var105, var106, Statics.field1113) - var103, var104, field496);
                    field620.method3381(var107);
                }
            } else if (field744 == 242) {
                int var108 = field696.method2582();
                int var109 = (var108 >> 4 & 0x7) + Statics.field77;
                int var110 = (var108 & 0x7) + Statics.field103;
                int var111 = field696.method2499();
                int var112 = var111 >> 2;
                int var113 = var111 & 0x3;
                int var114 = field560[var112];
                int var115 = field696.method2541();
                if (var109 >= 0 && var110 >= 0 && var109 < 103 && var110 < 103) {
                    if (var114 == 0) {
                        class96 var116 = Statics.field751.method1920(Statics.field1113, var109, var110);
                        if (var116 != null) {
                            int var117 = var116.field1604 >> 14 & 0x7FFF;
                            if (var112 == 2) {
                                var116.field1600 = new class14(var117, 2, var113 + 4, Statics.field1113, var109, var110, var115, false, var116.field1600);
                                var116.field1605 = new class14(var117, 2, var113 + 1 & 0x3, Statics.field1113, var109, var110, var115, false, var116.field1605);
                            } else {
                                var116.field1600 = new class14(var117, var112, var113, Statics.field1113, var109, var110, var115, false, var116.field1600);
                            }
                        }
                    }
                    if (var114 == 1) {
                        class108 var118 = Statics.field751.method1968(Statics.field1113, var109, var110);
                        if (var118 != null) {
                            int var119 = var118.field1793 >> 14 & 0x7FFF;
                            if (var112 == 4 || var112 == 5) {
                                var118.field1791 = new class14(var119, 4, var113, Statics.field1113, var109, var110, var115, false, var118.field1791);
                            } else if (var112 == 6) {
                                var118.field1791 = new class14(var119, 4, var113 + 4, Statics.field1113, var109, var110, var115, false, var118.field1791);
                            } else if (var112 == 7) {
                                var118.field1791 = new class14(var119, 4, (var113 + 2 & 0x3) + 4, Statics.field1113, var109, var110, var115, false, var118.field1791);
                            } else if (var112 == 8) {
                                var118.field1791 = new class14(var119, 4, var113 + 4, Statics.field1113, var109, var110, var115, false, var118.field1791);
                                var118.field1792 = new class14(var119, 4, (var113 + 2 & 0x3) + 4, Statics.field1113, var109, var110, var115, false, var118.field1792);
                            }
                        }
                    }
                    if (var114 == 2) {
                        class98 var120 = Statics.field751.method1977(Statics.field1113, var109, var110);
                        if (var112 == 11) {
                            var112 = 10;
                        }
                        if (var120 != null) {
                            var120.field1636 = new class14(var120.field1634 >> 14 & 0x7FFF, var112, var113, Statics.field1113, var109, var110, var115, false, var120.field1636);
                        }
                    }
                    if (var114 == 3) {
                        class107 var121 = Statics.field751.method1978(Statics.field1113, var109, var110);
                        if (var121 != null) {
                            var121.field1775 = new class14(var121.field1776 >> 14 & 0x7FFF, 22, var113, Statics.field1113, var109, var110, var115, false, var121.field1775);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bp.ac(IIIIIIIIII)V")
    public static final void method1561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field616.method3373(); var10 != null; var10 = (class22) field616.method3375()) {
            if (var10.field364 == arg0 && var10.field349 == arg1 && var10.field350 == arg2 && var10.field352 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field364 = arg0;
            var9.field352 = arg3;
            var9.field349 = arg1;
            var9.field350 = arg2;
            method199(var9);
            field616.method3381(var9);
        }
        var9.field354 = arg4;
        var9.field358 = arg5;
        var9.field347 = arg6;
        var9.field357 = arg7;
        var9.field365 = arg8;
    }

    @ObfuscatedName("aq.as(I)V")
    public static final void method543() {
        for (class22 var0 = (class22) field616.method3373(); var0 != null; var0 = (class22) field616.method3375()) {
            if (var0.field365 == -1) {
                var0.field357 = 0;
                method199(var0);
            } else {
                var0.method3404();
            }
        }
    }

    @ObfuscatedName("y.bn(Lv;B)V")
    public static final void method199(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field352 == 0) {
            var1 = Statics.field751.method1924(arg0.field364, arg0.field349, arg0.field350);
        }
        if (arg0.field352 == 1) {
            var1 = Statics.field751.method1904(arg0.field364, arg0.field349, arg0.field350);
        }
        if (arg0.field352 == 2) {
            var1 = Statics.field751.method1926(arg0.field364, arg0.field349, arg0.field350);
        }
        if (arg0.field352 == 3) {
            var1 = Statics.field751.method1927(arg0.field364, arg0.field349, arg0.field350);
        }
        if (var1 != 0) {
            int var5 = Statics.field751.method2005(arg0.field364, arg0.field349, arg0.field350, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field356 = var2;
        arg0.field353 = var3;
        arg0.field355 = var4;
    }

    @ObfuscatedName("eb.bl(IIIIIIII)V")
    public static final void method3042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field490 && Statics.field1113 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field751.method1924(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field751.method1904(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field751.method1926(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field751.method1927(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field751.method2005(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field751.method2037(arg0, arg2, arg3);
                class32 var15 = class32.method249(var12);
                if (var15.field836 != 0) {
                    field544[arg0].method2732(arg2, arg3, var13, var14, var15.field831);
                }
            }
            if (arg1 == 1) {
                Statics.field751.method1994(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field751.method1917(arg0, arg2, arg3);
                class32 var16 = class32.method249(var12);
                if (var16.field823 + arg2 > 103 || var16.field823 + arg3 > 103 || var16.field833 + arg2 > 103 || var16.field833 + arg3 > 103) {
                    return;
                }
                if (var16.field836 != 0) {
                    field544[arg0].method2733(arg2, arg3, var16.field823, var16.field833, var14, var16.field831);
                }
            }
            if (arg1 == 3) {
                Statics.field751.method1918(arg0, arg2, arg3);
                class32 var17 = class32.method249(var12);
                if (var17.field836 == 1) {
                    field544[arg0].method2741(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field121[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method1551(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field751, field544[arg0]);
    }

    @ObfuscatedName("c.ba(III)V")
    public static final void method252(int arg0, int arg1) {
        class177 var2 = field617[Statics.field1113][arg0][arg1];
        if (var2 == null) {
            Statics.field751.method1919(Statics.field1113, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3373(); var6 != null; var6 = (class17) var2.method3375()) {
            class40 var7 = class40.method1333(var6.field266);
            long var8 = (long) var7.field1001;
            if (var7.field1016 == 1) {
                var8 = (long) (var6.field270 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field751.method1919(Statics.field1113, arg0, arg1);
            return;
        }
        var2.method3369(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3373(); var12 != null; var12 = (class17) var2.method3375()) {
            if (var5.field266 != var12.field266) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field266 != var12.field266 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field751.method1905(Statics.field1113, arg0, arg1, method183(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1113), var5, var13, var10, var11);
    }

    @ObfuscatedName("z.bq(I)V")
    public static final void method102() {
        field611 = 0;
        field594 = 0;
        field696.method2373();
        int var0 = field696.method2359(1);
        if (var0 != 0) {
            int var1 = field696.method2359(2);
            if (var1 == 0) {
                field607[++field594 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field696.method2359(3);
                Statics.field461.method256(var2, false);
                int var3 = field696.method2359(1);
                if (var3 == 1) {
                    field607[++field594 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field696.method2359(3);
                Statics.field461.method256(var4, true);
                int var5 = field696.method2359(3);
                Statics.field461.method256(var5, true);
                int var6 = field696.method2359(1);
                if (var6 == 1) {
                    field607[++field594 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field696.method2359(7);
                int var8 = field696.method2359(1);
                if (var8 == 1) {
                    field607[++field594 - 1] = 2047;
                }
                int var9 = field696.method2359(1);
                Statics.field1113 = field696.method2359(2);
                int var10 = field696.method2359(7);
                Statics.field461.method255(var7, var10, var9 == 1);
            }
        }
        Statics.method549();
        method2237();
        for (int var11 = 0; var11 < field594; var11++) {
            int var12 = field607[var11];
            class3 var13 = field729[var12];
            int var14 = field696.method2499();
            if ((var14 & 0x40) != 0) {
                var14 += field696.method2499() << 8;
            }
            if ((var14 & 0x80) != 0) {
                var13.field457 = field696.method2541();
                if (var13.field457 == 65535) {
                    var13.field457 = -1;
                }
            }
            if ((var14 & 0x8) != 0) {
                var13.field462 = field696.method2507();
                if (var13.field462.charAt(0) == '~') {
                    var13.field462 = var13.field462.substring(1);
                    method1557(2, var13.field45, var13.field462);
                } else if (Statics.field461 == var13) {
                    method1557(2, var13.field45, var13.field462);
                }
                var13.field436 = 0;
                var13.field437 = 0;
                var13.field424 = 150;
            }
            if ((var14 & 0x20) != 0) {
                var13.field478 = field696.method2501();
                var13.field446 = field696.method2530();
            }
            if ((var14 & 0x10) != 0) {
                int var15 = field696.method2499();
                byte[] var16 = new byte[var15];
                class127 var17 = new class127(var16);
                field696.method2536(var16, 0, var15);
                field608[var12] = var17;
                var13.method17(var17);
            }
            if ((var14 & 0x2) != 0) {
                int var18 = field696.method2622();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field696.method2499();
                method1323(var13, var18, var19);
            }
            if ((var14 & 0x1) != 0) {
                int var20 = field696.method2524();
                int var21 = field696.method2524();
                var13.method258(var20, var21, field496);
                var13.field435 = field496 + 300;
                var13.field442 = field696.method2522();
                var13.field443 = field696.method2524();
            }
            if ((var14 & 0x100) != 0) {
                var13.field460 = field696.method2582();
                var13.field445 = field696.method2582();
                var13.field467 = field696.method2522();
                var13.field463 = field696.method2524();
                var13.field425 = field696.method2541() + field496;
                var13.field465 = field696.method2501() + field496;
                var13.field466 = field696.method2524();
                var13.field472 = 1;
                var13.field475 = 0;
            }
            if ((var14 & 0x400) != 0) {
                int var22 = field696.method2522();
                int var23 = field696.method2582();
                var13.method258(var22, var23, field496);
                var13.field435 = field496 + 300;
                var13.field442 = field696.method2522();
                var13.field443 = field696.method2499();
            }
            if ((var14 & 0x200) != 0) {
                var13.field455 = field696.method2530();
                int var24 = field696.method2497();
                var13.field441 = var24 >> 16;
                var13.field464 = (var24 & 0xFFFF) + field496;
                var13.field456 = 0;
                var13.field477 = 0;
                if (var13.field464 > field496) {
                    var13.field456 = -1;
                }
                if (var13.field455 == 65535) {
                    var13.field455 = -1;
                }
            }
            if ((var14 & 0x4) != 0) {
                int var25 = field696.method2530();
                int var26 = field696.method2582();
                int var27 = field696.method2522();
                int var28 = field696.field2027;
                if (var13.field45 != null && var13.field51 != null) {
                    boolean var29 = false;
                    if (var26 <= 1 && method57(var13.field45)) {
                        var29 = true;
                    }
                    if (!var29 && field637 == 0) {
                        field510.field2027 = 0;
                        field696.method2637(field510.field2030, 0, var27);
                        field510.field2027 = 0;
                        String var30 = class185.method3441(class148.method1626(class184.method547(field510)));
                        var13.field462 = var30.trim();
                        var13.field436 = var25 >> 8;
                        var13.field437 = var25 & 0xFF;
                        var13.field424 = 150;
                        if (var26 == 2 || var26 == 3) {
                            method1557(1, class2.method231(1) + var13.field45, var30);
                        } else if (var26 == 1) {
                            method1557(1, class2.method231(0) + var13.field45, var30);
                        } else {
                            method1557(2, var13.field45, var30);
                        }
                    }
                }
                field696.field2027 = var27 + var28;
            }
        }
        for (int var31 = 0; var31 < field611; var31++) {
            int var32 = field612[var31];
            if (field496 != field729[var32].field471) {
                field729[var32] = null;
            }
        }
        if (field529 != field696.field2027) {
            throw new RuntimeException(field696.field2027 + class2.field26 + field529);
        }
        for (int var33 = 0; var33 < field604; var33++) {
            if (field729[field584[var33]] == null) {
                throw new RuntimeException(var33 + class2.field26 + field604);
            }
        }
    }

    @ObfuscatedName("dg.bg(I)V")
    public static final void method2237() {
        while (true) {
            if (field696.method2363(field529) >= 11) {
                int var0 = field696.method2359(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field729[var0] == null) {
                        field729[var0] = new class3();
                        if (field608[var0] != null) {
                            field729[var0].method17(field608[var0]);
                        }
                        var1 = true;
                    }
                    field584[++field604 - 1] = var0;
                    class3 var2 = field729[var0];
                    var2.field471 = field496;
                    int var3 = field696.method2359(1);
                    if (var3 == 1) {
                        field607[++field594 - 1] = var0;
                    }
                    int var4 = field696.method2359(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field732[field696.method2359(3)];
                    if (var1) {
                        var2.field469 = var2.field423 = var5;
                    }
                    int var6 = field696.method2359(1);
                    int var7 = field696.method2359(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method255(Statics.field461.field473[0] + var7, Statics.field461.field474[0] + var4, var6 == 1);
                    continue;
                }
            }
            field696.method2364();
            return;
        }
    }

    @ObfuscatedName("e.bh(IIIIB)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field517; var4++) {
            if (field690[var4] + field552[var4] > arg0 && field690[var4] < arg0 + arg2 && field693[var4] + field691[var4] > arg1 && field691[var4] < arg1 + arg3) {
                field687[var4] = true;
            }
        }
    }

    @ObfuscatedName("eu.bz(IIIII)V")
    public static final void method3159(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field517; var4++) {
            if (field690[var4] + field552[var4] > arg0 && field690[var4] < arg0 + arg2 && field693[var4] + field691[var4] > arg1 && field691[var4] < arg1 + arg3) {
                field688[var4] = true;
            }
        }
    }

    @ObfuscatedName("c.bo(I)V")
    public static final void method251() {
        int var0 = Statics.field904.method3462(class135.field2280);
        for (int var1 = 0; var1 < field626; var1++) {
            int var2 = Statics.field904.method3462(method165(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field626 * 15 + 21;
        int var4 = class77.field1381 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1382;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field722 = true;
        Statics.field1810 = var4;
        Statics.field168 = var5;
        Statics.field1263 = var0;
        Statics.field19 = field626 * 15 + 22;
    }

    @ObfuscatedName("de.bd(IB)Z")
    public static final boolean method2418(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field629[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("l.bk(II)V")
    public static final void method161(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field606[arg0];
        int var2 = field628[arg0];
        int var3 = field629[arg0];
        int var4 = field630[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 50) {
            class3 var5 = field729[var4];
            if (var5 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(229);
                field605.method2529(var4);
            }
        }
        if (var3 == 32) {
            field605.method2360(30);
            field605.method2527(var2);
            field605.method2484(var1);
            field605.method2528(field641);
            field605.method2586(Statics.field381);
            field605.method2528(var4);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 42) {
            field605.method2360(252);
            field605.method2484(var4);
            field605.method2484(var1);
            field605.method2586(var2);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 6) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(117);
            field605.method2484(var4 >> 14 & 0x7FFF);
            field605.method2529(Statics.field113 + var2);
            field605.method2484(Statics.field1399 + var1);
        }
        if (var3 == 38) {
            method157();
            class159 var6 = class159.method166(var2);
            field638 = 1;
            Statics.field1226 = var1;
            Statics.field205 = var2;
            Statics.field169 = var4;
            method2472(var6);
            field639 = class2.method1185(16748608) + class40.method1333(var4).field989 + class2.method1185(16777215);
            if (field639 == null) {
                field639 = "null";
            }
            return;
        }
        if (var3 == 8) {
            class25 var7 = field603[var4];
            if (var7 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(241);
                field605.method2484(var4);
                field605.method2605(Statics.field381);
                field605.method2484(field641);
            }
        }
        if (var3 == 37) {
            field605.method2360(4);
            field605.method2484(var1);
            field605.method2498(var4);
            field605.method2538(var2);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 51) {
            class3 var8 = field729[var4];
            if (var8 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(231);
                field605.method2528(var4);
            }
        }
        if (var3 == 31) {
            field605.method2360(173);
            field605.method2498(var4);
            field605.method2484(var1);
            field605.method2484(Statics.field169);
            field605.method2529(Statics.field1226);
            field605.method2538(var2);
            field605.method2605(Statics.field205);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 39) {
            field605.method2360(228);
            field605.method2527(var2);
            field605.method2484(var4);
            field605.method2498(var1);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 1) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(139);
            field605.method2538(Statics.field205);
            field605.method2528(var4 >> 14 & 0x7FFF);
            field605.method2484(Statics.field169);
            field605.method2528(Statics.field1226);
            field605.method2528(Statics.field1399 + var1);
            field605.method2484(Statics.field113 + var2);
        }
        if (var3 == 22) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(8);
            field605.method2529(var4);
            field605.method2498(Statics.field113 + var2);
            field605.method2529(Statics.field1399 + var1);
        }
        if (var3 == 30 && field648 == null) {
            field605.method2360(20);
            field605.method2498(var1);
            field605.method2586(var2);
            field648 = class159.method2270(var2, var1);
            method2472(field648);
        }
        if (var3 == 28) {
            field605.method2360(238);
            field605.method2605(var2);
            class159 var9 = class159.method166(var2);
            if (var9.field2660 != null && var9.field2660[0][0] == 5) {
                int var10 = var9.field2660[0][1];
                class160.field2727[var10] = 1 - class160.field2727[var10];
                method27(var10);
            }
        }
        if (var3 == 15) {
            class3 var11 = field729[var4];
            if (var11 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(103);
                field605.method2527(Statics.field381);
                field605.method2528(var4);
                field605.method2528(field641);
            }
        }
        if (var3 == 46) {
            class3 var12 = field729[var4];
            if (var12 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(186);
                field605.method2484(var4);
            }
        }
        if (var3 == 11) {
            class25 var13 = field603[var4];
            if (var13 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(211);
                field605.method2529(var4);
            }
        }
        if (var3 == 21) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(104);
            field605.method2528(var4);
            field605.method2498(Statics.field1399 + var1);
            field605.method2529(Statics.field113 + var2);
        }
        if (var3 == 2) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(11);
            field605.method2529(var4 >> 14 & 0x7FFF);
            field605.method2528(Statics.field113 + var2);
            field605.method2538(Statics.field381);
            field605.method2498(Statics.field1399 + var1);
            field605.method2484(field641);
        }
        if (var3 == 36) {
            field605.method2360(230);
            field605.method2527(var2);
            field605.method2529(var1);
            field605.method2498(var4);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 41) {
            field605.method2360(255);
            field605.method2498(var4);
            field605.method2605(var2);
            field605.method2484(var1);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 16) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(58);
            field605.method2529(Statics.field1226);
            field605.method2484(Statics.field169);
            field605.method2484(var4);
            field605.method2484(Statics.field1399 + var1);
            field605.method2586(Statics.field205);
            field605.method2498(Statics.field113 + var2);
        }
        if (var3 == 1001) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(100);
            field605.method2528(Statics.field113 + var2);
            field605.method2528(Statics.field1399 + var1);
            field605.method2498(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 7) {
            class25 var14 = field603[var4];
            if (var14 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(93);
                field605.method2528(var4);
                field605.method2528(Statics.field169);
                field605.method2528(Statics.field1226);
                field605.method2538(Statics.field205);
            }
        }
        if (var3 == 23) {
            Statics.field751.method2039(Statics.field1113, var1, var2);
        }
        if (var3 == 1004) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field605.method2360(175);
            field605.method2528(var4);
        }
        if (var3 == 57 || var3 == 1007) {
            method39(var4, var2, var1, field632[arg0]);
        }
        if (var3 == 25) {
            class159 var15 = class159.method2270(var2, var1);
            if (var15 != null) {
                method157();
                int var18 = method2492(var15);
                int var19 = var18 >> 11 & 0x3F;
                method2354(var2, var1, var19);
                field638 = 0;
                int var20 = method2492(var15);
                int var21 = var20 >> 11 & 0x3F;
                String var22;
                if (var21 == 0) {
                    var22 = null;
                } else if (var15.field2724 == null || var15.field2724.trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = var15.field2724;
                }
                field678 = var22;
                if (field678 == null) {
                    field678 = "Null";
                }
                if (var15.field2608) {
                    field565 = var15.field2666 + class2.method1185(16777215);
                } else {
                    field565 = class2.method1185(65280) + var15.field2712 + class2.method1185(16777215);
                }
            }
            return;
        }
        if (var3 == 19) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(109);
            field605.method2529(var4);
            field605.method2484(Statics.field1399 + var1);
            field605.method2498(Statics.field113 + var2);
        }
        if (var3 == 17) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(113);
            field605.method2498(field641);
            field605.method2484(Statics.field1399 + var1);
            field605.method2529(Statics.field113 + var2);
            field605.method2484(var4);
            field605.method2605(Statics.field381);
        }
        if (var3 == 34) {
            field605.method2360(254);
            field605.method2605(var2);
            field605.method2529(var1);
            field605.method2498(var4);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 24) {
            class159 var23 = class159.method166(var2);
            boolean var24 = true;
            if (var23.field2657 > 0) {
                var24 = method117(var23);
            }
            if (var24) {
                field605.method2360(238);
                field605.method2605(var2);
            }
        }
        if (var3 == 12) {
            class25 var25 = field603[var4];
            if (var25 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(61);
                field605.method2484(var4);
            }
        }
        if (var3 == 3) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(245);
            field605.method2529(Statics.field1399 + var1);
            field605.method2528(var4 >> 14 & 0x7FFF);
            field605.method2528(Statics.field113 + var2);
        }
        if (var3 == 43) {
            field605.method2360(89);
            field605.method2528(var1);
            field605.method2605(var2);
            field605.method2528(var4);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 45) {
            class3 var26 = field729[var4];
            if (var26 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(50);
                field605.method2528(var4);
            }
        }
        if (var3 == 44) {
            class3 var27 = field729[var4];
            if (var27 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(233);
                field605.method2529(var4);
            }
        }
        if (var3 == 18) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(128);
            field605.method2484(Statics.field113 + var2);
            field605.method2529(var4);
            field605.method2528(Statics.field1399 + var1);
        }
        if (var3 == 10) {
            class25 var28 = field603[var4];
            if (var28 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(68);
                field605.method2484(var4);
            }
        }
        if (var3 == 35) {
            field605.method2360(195);
            field605.method2528(var1);
            field605.method2484(var4);
            field605.method2586(var2);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 49) {
            class3 var29 = field729[var4];
            if (var29 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(97);
                field605.method2484(var4);
            }
        }
        if (var3 == 26) {
            field605.method2360(22);
            for (class4 var30 = (class4) field653.method3352(); var30 != null; var30 = (class4) field653.method3353()) {
                if (var30.field61 == 0 || var30.field61 == 3) {
                    method62(var30, true);
                }
            }
            if (field648 != null) {
                method2472(field648);
                field648 = null;
            }
        }
        if (var3 == 40) {
            field605.method2360(33);
            field605.method2484(var4);
            field605.method2528(var1);
            field605.method2586(var2);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 1003) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            class25 var31 = field603[var4];
            if (var31 != null) {
                class31 var32 = var31.field395;
                if (var32.field810 != null) {
                    var32 = var32.method612();
                }
                if (var32 != null) {
                    field605.method2360(53);
                    field605.method2484(var32.field784);
                }
            }
        }
        if (var3 == 14) {
            class3 var33 = field729[var4];
            if (var33 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(201);
                field605.method2529(var4);
                field605.method2484(Statics.field1226);
                field605.method2484(Statics.field169);
                field605.method2586(Statics.field205);
            }
        }
        if (var3 == 48) {
            class3 var34 = field729[var4];
            if (var34 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(251);
                field605.method2484(var4);
            }
        }
        if (var3 == 47) {
            class3 var35 = field729[var4];
            if (var35 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(77);
                field605.method2528(var4);
            }
        }
        if (var3 == 1005) {
            class159 var36 = class159.method166(var2);
            if (var36 == null || var36.field2663[var1] < 100000) {
                field605.method2360(175);
                field605.method2528(var4);
            } else {
                method1557(0, "", var36.field2663[var1] + " x " + class40.method1333(var4).field989);
            }
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 29) {
            field605.method2360(238);
            field605.method2605(var2);
            class159 var37 = class159.method166(var2);
            if (var37.field2660 != null && var37.field2660[0][0] == 5) {
                int var38 = var37.field2660[0][1];
                if (class160.field2727[var38] != var37.field2704[0]) {
                    class160.field2727[var38] = var37.field2704[0];
                    method27(var38);
                }
            }
        }
        if (var3 == 9) {
            class25 var39 = field603[var4];
            if (var39 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(95);
                field605.method2528(var4);
            }
        }
        if (var3 == 20) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(143);
            field605.method2498(Statics.field113 + var2);
            field605.method2528(Statics.field1399 + var1);
            field605.method2528(var4);
        }
        if (var3 == 58) {
            field605.method2360(163);
            field605.method2538(var2);
            field605.method2586(Statics.field381);
            field605.method2498(field641);
            field605.method2484(var1);
        }
        if (var3 == 13) {
            class25 var40 = field603[var4];
            if (var40 != null) {
                field590 = class77.field1381;
                field591 = class77.field1382;
                field634 = 2;
                field592 = 0;
                field716 = var1;
                field717 = var2;
                field605.method2360(219);
                field605.method2529(var4);
            }
        }
        if (var3 == 33) {
            field605.method2360(181);
            field605.method2528(var4);
            field605.method2538(var2);
            field605.method2498(var1);
            field564 = 0;
            Statics.field2018 = class159.method166(var2);
            field595 = var1;
        }
        if (var3 == 5) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(39);
            field605.method2529(Statics.field1399 + var1);
            field605.method2529(Statics.field113 + var2);
            field605.method2484(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1002) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field605.method2360(196);
            field605.method2529(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 4) {
            field590 = class77.field1381;
            field591 = class77.field1382;
            field634 = 2;
            field592 = 0;
            field716 = var1;
            field717 = var2;
            field605.method2360(136);
            field605.method2484(var4 >> 14 & 0x7FFF);
            field605.method2498(Statics.field113 + var2);
            field605.method2528(Statics.field1399 + var1);
        }
        if (field638 != 0) {
            field638 = 0;
            method2472(class159.method166(Statics.field205));
        }
        if (field640) {
            method157();
        }
        if (Statics.field2018 != null && field564 == 0) {
            method2472(Statics.field2018);
        }
    }

    @ObfuscatedName("ex.bs(ILjava/lang/String;I)V")
    public static void method2768(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field604; var3++) {
            class3 var4 = field729[field584[var3]];
            if (var4 != null && var4.field45 != null && var4.field45.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field605.method2360(233);
                    field605.method2529(field584[var3]);
                } else if (arg0 == 4) {
                    field605.method2360(77);
                    field605.method2528(field584[var3]);
                } else if (arg0 == 6) {
                    field605.method2360(97);
                    field605.method2484(field584[var3]);
                } else if (arg0 == 7) {
                    field605.method2360(229);
                    field605.method2529(field584[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method1557(0, "", class135.field2311 + arg1);
        }
    }

    @ObfuscatedName("dd.br(IIII)V")
    public static void method2354(int arg0, int arg1, int arg2) {
        class159 var3 = class159.method2270(arg0, arg1);
        if (var3 != null && var3.field2604 != null) {
            class1 var4 = new class1();
            var4.field3 = var3;
            var4.field13 = var3.field2604;
            class26.method134(var4);
        }
        field640 = true;
        Statics.field381 = arg0;
        field641 = arg1;
        Statics.field67 = arg2;
        method2472(var3);
    }

    @ObfuscatedName("e.bm(I)V")
    public static void method157() {
        if (!field640) {
            return;
        }
        class159 var0 = class159.method2270(Statics.field381, field641);
        if (var0 != null && var0.field2685 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field13 = var0.field2685;
            class26.method134(var1);
        }
        field640 = false;
        method2472(var0);
    }

    @ObfuscatedName("x.be(IIILjava/lang/String;S)V")
    public static void method39(int arg0, int arg1, int arg2, String arg3) {
        class159 var4 = class159.method2270(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2681 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field9 = arg0;
            var5.field1 = arg3;
            var5.field13 = var4.field2681;
            class26.method134(var5);
        }
        boolean var6 = true;
        if (var4.field2657 > 0) {
            var6 = method117(var4);
        }
        if (!var6 || !class163.method170(method2492(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field605.method2360(162);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 2) {
            field605.method2360(155);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 3) {
            field605.method2360(164);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 4) {
            field605.method2360(145);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 5) {
            field605.method2360(118);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 6) {
            field605.method2360(84);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 7) {
            field605.method2360(193);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 8) {
            field605.method2360(1);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 9) {
            field605.method2360(26);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
        if (arg0 == 10) {
            field605.method2360(37);
            field605.method2605(arg1);
            field605.method2484(arg2);
        }
    }

    @ObfuscatedName("e.bx(I)V")
    public static final void method156() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field626 - 1; var1++) {
                if (field629[var1] < 1000 && field629[var1 + 1] > 1000) {
                    String var2 = field632[var1];
                    field632[var1] = field632[var1 + 1];
                    field632[var1 + 1] = var2;
                    String var3 = field631[var1];
                    field631[var1] = field631[var1 + 1];
                    field631[var1 + 1] = var3;
                    int var4 = field629[var1];
                    field629[var1] = field629[var1 + 1];
                    field629[var1 + 1] = var4;
                    int var5 = field606[var1];
                    field606[var1] = field606[var1 + 1];
                    field606[var1 + 1] = var5;
                    int var6 = field628[var1];
                    field628[var1] = field628[var1 + 1];
                    field628[var1 + 1] = var6;
                    int var7 = field630[var1];
                    field630[var1] = field630[var1 + 1];
                    field630[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("n.bb(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method111(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field722 || field626 >= 500) {
            return;
        }
        field631[field626] = arg0;
        field632[field626] = arg1;
        field629[field626] = arg2;
        field630[field626] = arg3;
        field606[field626] = arg4;
        field628[field626] = arg5;
        field626++;
    }

    @ObfuscatedName("ds.bj(B)V")
    public static void method2470() {
        for (int var0 = 0; var0 < field626; var0++) {
            if (method253(field629[var0])) {
                if (var0 < field626 - 1) {
                    for (int var1 = var0; var1 < field626 - 1; var1++) {
                        field631[var1] = field631[var1 + 1];
                        field632[var1] = field632[var1 + 1];
                        field629[var1] = field629[var1 + 1];
                        field630[var1] = field630[var1 + 1];
                        field606[var1] = field606[var1 + 1];
                        field628[var1] = field628[var1 + 1];
                    }
                }
                field626--;
            }
        }
    }

    @ObfuscatedName("c.bc(II)Z")
    public static boolean method253(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("m.bt(II)Ljava/lang/String;")
    public static String method165(int arg0) {
        return field632[arg0].length() > 0 ? field631[arg0] + class135.field2209 + field632[arg0] : field631[arg0];
    }

    @ObfuscatedName("client.bi(IIIII)V")
    public static final void method507(int arg0, int arg1, int arg2, int arg3) {
        if (field638 == 0 && !field640) {
            method111(class135.field2235, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1900; var5++) {
            int var6 = class112.field1881[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field751.method2005(Statics.field1113, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method249(var10);
                    if (var11.field816 != null) {
                        var11 = var11.method656();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field638 == 1) {
                        method111(class135.field2230, field639 + " " + class2.field23 + " " + class2.method1185(65535) + var11.field827, 1, var6, var7, var8);
                    } else if (!field640) {
                        String[] var12 = var11.field844;
                        if (field534) {
                            var12 = method2765(var12);
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
                                    method111(var12[var13], class2.method1185(65535) + var11.field827, var14, var6, var7, var8);
                                }
                            }
                        }
                        method111(class135.field2231, class2.method1185(65535) + var11.field827, 1002, var11.field824 << 14, var7, var8);
                    } else if ((Statics.field67 & 0x4) == 4) {
                        method111(field678, field565 + " " + class2.field23 + " " + class2.method1185(65535) + var11.field827, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field603[var10];
                    if (var15.field395.field794 == 1 && (var15.field421 & 0x7F) == 64 && (var15.field422 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field624; var16++) {
                            class25 var17 = field603[field525[var16]];
                            if (var17 != null && var15 != var17 && var17.field395.field794 == 1 && var15.field421 == var17.field421 && var15.field422 == var17.field422) {
                                method2(var17.field395, field525[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field604; var18++) {
                            class3 var19 = field729[field584[var18]];
                            if (var19 != null && var15.field421 == var19.field421 && var15.field422 == var19.field422) {
                                method804(var19, field584[var18], var7, var8);
                            }
                        }
                    }
                    method2(var15.field395, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field729[var10];
                    if ((var20.field421 & 0x7F) == 64 && (var20.field422 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field624; var21++) {
                            class25 var22 = field603[field525[var21]];
                            if (var22 != null && var22.field395.field794 == 1 && var20.field421 == var22.field421 && var20.field422 == var22.field422) {
                                method2(var22.field395, field525[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field604; var23++) {
                            class3 var24 = field729[field584[var23]];
                            if (var24 != null && var20 != var24 && var20.field421 == var24.field421 && var20.field422 == var24.field422) {
                                method804(var24, field584[var23], var7, var8);
                            }
                        }
                    }
                    method804(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field617[Statics.field1113][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3374(); var26 != null; var26 = (class17) var25.method3376()) {
                            class40 var27 = class40.method1333(var26.field266);
                            if (field638 == 1) {
                                method111(class135.field2230, field639 + " " + class2.field23 + " " + class2.method1185(16748608) + var27.field989, 16, var26.field266, var7, var8);
                            } else if (!field640) {
                                String[] var28 = var27.field1003;
                                if (field534) {
                                    var28 = method2765(var28);
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
                                        method111(var28[var29], class2.method1185(16748608) + var27.field989, var30, var26.field266, var7, var8);
                                    } else if (var29 == 2) {
                                        method111(class135.field2174, class2.method1185(16748608) + var27.field989, 20, var26.field266, var7, var8);
                                    }
                                }
                                method111(class135.field2231, class2.method1185(16748608) + var27.field989, 1004, var26.field266, var7, var8);
                            } else if ((Statics.field67 & 0x1) == 1) {
                                method111(field678, field565 + " " + class2.field23 + " " + class2.method1185(16748608) + var27.field989, 17, var26.field266, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.bf(Lax;IIII)V")
    public static final void method2(class31 arg0, int arg1, int arg2, int arg3) {
        if (field626 >= 400) {
            return;
        }
        if (arg0.field810 != null) {
            arg0 = arg0.method612();
        }
        if (arg0 == null || !arg0.field813) {
            return;
        }
        String var4 = arg0.field785;
        if (arg0.field802 != 0) {
            int var6 = arg0.field802;
            int var7 = Statics.field461.field38;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1185(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1185(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1185(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1185(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1185(65280);
            } else if (var8 > 6) {
                var9 = class2.method1185(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1185(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1185(12648192);
            } else {
                var9 = class2.method1185(16776960);
            }
            var4 = var4 + var9 + " " + class2.field21 + class135.field2203 + arg0.field802 + class2.field22;
        }
        if (field638 == 1) {
            method111(class135.field2230, field639 + " " + class2.field23 + " " + class2.method1185(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field640) {
            String[] var10 = arg0.field800;
            if (field534) {
                var10 = method2765(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class135.field2232)) {
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
                        method111(var10[var11], class2.method1185(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class135.field2232)) {
                        short var14 = 0;
                        if (arg0.field802 > Statics.field461.field38) {
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
                        method111(var10[var13], class2.method1185(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method111(class135.field2231, class2.method1185(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field67 & 0x2) == 2) {
            method111(field678, field565 + " " + class2.field23 + " " + class2.method1185(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ap.bw(Ls;IIIB)V")
    public static final void method804(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field461 == arg0 || field626 >= 400) {
            return;
        }
        String var9;
        if (arg0.field39 == 0) {
            String var4 = arg0.field45;
            int var5 = arg0.field38;
            int var6 = Statics.field461.field38;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1185(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1185(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1185(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1185(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1185(65280);
            } else if (var7 > 6) {
                var8 = class2.method1185(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1185(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1185(12648192);
            } else {
                var8 = class2.method1185(16776960);
            }
            var9 = var4 + var8 + " " + class2.field21 + class135.field2203 + arg0.field38 + class2.field22;
        } else {
            var9 = arg0.field45 + " " + class2.field21 + class135.field2201 + arg0.field39 + class2.field22;
        }
        if (field638 == 1) {
            method111(class135.field2230, field639 + " " + class2.field23 + " " + class2.method1185(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field640) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field642[var10] != null) {
                    short var11 = 0;
                    if (field642[var10].equalsIgnoreCase(class135.field2232)) {
                        if (arg0.field38 > Statics.field461.field38) {
                            var11 = 2000;
                        }
                        if (Statics.field461.field52 != 0 && arg0.field52 != 0) {
                            if (Statics.field461.field52 == arg0.field52) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field615[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field556[var10] + var11;
                    method111(field642[var10], class2.method1185(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field67 & 0x8) == 8) {
            method111(field678, field565 + " " + class2.field23 + " " + class2.method1185(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field626; var14++) {
            if (field629[var14] == 23) {
                field632[var14] = class2.method1185(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cx.bp(IIIIIIIII)V")
    public static final void method1698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class159.method687(arg0)) {
            Statics.field204 = null;
            method248(Statics.field2641[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field204 != null) {
                method248(Statics.field204, -1412584499, arg1, arg2, arg3, arg4, Statics.field336, Statics.field955, arg7);
                Statics.field204 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field687[var8] = true;
            }
        } else {
            field687[arg7] = true;
        }
    }

    @ObfuscatedName("c.bv([Lfn;IIIIIIIIS)V")
    public static final void method248(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1824(arg2, arg3, arg4, arg5);
        class104.method2173();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2617 == arg1 || arg1 == -1412584499 && field655 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field690[field517] = var10.field2611 + arg6;
                    field691[field517] = var10.field2612 + arg7;
                    field552[field517] = var10.field2615;
                    field693[field517] = var10.field2616;
                    var11 = ++field517 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2721 = var11;
                var10.field2722 = field496;
                if (!var10.field2608 || !Statics.method40(var10)) {
                    if (var10.field2657 > 0) {
                        method2483(var10);
                    }
                    int var12 = var10.field2611 + arg6;
                    int var13 = var10.field2612 + arg7;
                    int var14 = var10.field2628;
                    if (field655 == var10) {
                        if (arg1 != -1412584499 && !var10.field2671) {
                            Statics.field204 = arg0;
                            Statics.field336 = arg6;
                            Statics.field955 = arg7;
                            continue;
                        }
                        if (field730 && field494) {
                            int var15 = class77.field1374;
                            int var16 = class77.field1375;
                            int var17 = var15 - field657;
                            int var18 = var16 - field658;
                            if (var17 < field643) {
                                var17 = field643;
                            }
                            if (var10.field2615 + var17 > field643 + field656.field2615) {
                                var17 = field643 + field656.field2615 - var10.field2615;
                            }
                            if (var18 < field706) {
                                var18 = field706;
                            }
                            if (var10.field2616 + var18 > field706 + field656.field2616) {
                                var18 = field706 + field656.field2616 - var10.field2616;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2671) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2668 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2668 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2615 + var12;
                        int var26 = var10.field2616 + var13;
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
                        int var29 = var10.field2615 + var12;
                        int var30 = var10.field2616 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2608 || var19 < var21 && var20 < var22) {
                        if (var10.field2657 != 0) {
                            if (var10.field2657 == 1337) {
                                field633 = var12;
                                field483 = var13;
                                method265(var12, var13, var10.field2615, var10.field2616);
                                class89.method1824(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2657 == 1338) {
                                method801();
                                class89.method1824(var12, var13, Statics.field397.field1471 + var12, Statics.field397.field1470 + var13);
                                if (field718 == 2 || field718 == 5) {
                                    class89.method1839(var12 + 25, var13 + 5, 0, Statics.field2775, Statics.field2066);
                                } else {
                                    int var31 = field670 + field568 & 0x7FF;
                                    int var32 = Statics.field461.field421 / 32 + 48;
                                    int var33 = 464 - Statics.field461.field422 / 32;
                                    Statics.field344.method1730(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field557 + 256, Statics.field2775, Statics.field2066);
                                    for (int var34 = 0; var34 < field712; var34++) {
                                        int var35 = field662[var34] * 4 + 2 - Statics.field461.field421 / 32;
                                        int var36 = field714[var34] * 4 + 2 - Statics.field461.field422 / 32;
                                        method825(var12, var13, var35, var36, field715[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class177 var39 = field617[Statics.field1113][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field461.field421 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field461.field422 / 32;
                                                method825(var12, var13, var40, var41, Statics.field1804[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field624; var42++) {
                                        class25 var43 = field603[field525[var42]];
                                        if (var43 != null && var43.method21()) {
                                            class31 var44 = var43.field395;
                                            if (var44 != null && var44.field810 != null) {
                                                var44 = var44.method612();
                                            }
                                            if (var44 != null && var44.field801 && var44.field813) {
                                                int var45 = var43.field421 / 32 - Statics.field461.field421 / 32;
                                                int var46 = var43.field422 / 32 - Statics.field461.field422 / 32;
                                                method825(var12, var13, var45, var46, Statics.field1804[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field604; var47++) {
                                        class3 var48 = field729[field584[var47]];
                                        if (var48 != null && var48.method21()) {
                                            int var49 = var48.field421 / 32 - Statics.field461.field421 / 32;
                                            int var50 = var48.field422 / 32 - Statics.field461.field422 / 32;
                                            boolean var51 = false;
                                            if (method1706(var48.field45)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field1817; var53++) {
                                                if (var48.field45.equals(Statics.field199[var53].field118)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field461.field52 != 0 && var48.field52 != 0 && Statics.field461.field52 == var48.field52) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method825(var12, var13, var49, var50, Statics.field1804[3]);
                                            } else if (var54) {
                                                method825(var12, var13, var49, var50, Statics.field1804[4]);
                                            } else if (var52) {
                                                method825(var12, var13, var49, var50, Statics.field1804[5]);
                                            } else {
                                                method825(var12, var13, var49, var50, Statics.field1804[2]);
                                            }
                                        }
                                    }
                                    if (field502 != 0 && field496 % 20 < 10) {
                                        if (field502 == 1 && field503 >= 0 && field503 < field603.length) {
                                            class25 var55 = field603[field503];
                                            if (var55 != null) {
                                                int var56 = var55.field421 / 32 - Statics.field461.field421 / 32;
                                                int var57 = var55.field422 / 32 - Statics.field461.field422 / 32;
                                                method3(var12, var13, var56, var57, Statics.field214[1]);
                                            }
                                        }
                                        if (field502 == 2) {
                                            int var58 = field505 * 4 - Statics.field1399 * 4 + 2 - Statics.field461.field421 / 32;
                                            int var59 = field506 * 4 - Statics.field113 * 4 + 2 - Statics.field461.field422 / 32;
                                            method3(var12, var13, var58, var59, Statics.field214[1]);
                                        }
                                        if (field502 == 10 && field597 >= 0 && field597 < field729.length) {
                                            class3 var60 = field729[field597];
                                            if (var60 != null) {
                                                int var61 = var60.field421 / 32 - Statics.field461.field421 / 32;
                                                int var62 = var60.field422 / 32 - Statics.field461.field422 / 32;
                                                method3(var12, var13, var61, var62, Statics.field214[1]);
                                            }
                                        }
                                    }
                                    if (field716 != 0) {
                                        int var63 = field716 * 4 + 2 - Statics.field461.field421 / 32;
                                        int var64 = field717 * 4 + 2 - Statics.field461.field422 / 32;
                                        method825(var12, var13, var63, var64, Statics.field214[0]);
                                    }
                                    class89.method1830(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field718 < 3) {
                                    Statics.field197.method1730(var12, var13, 33, 33, 25, 25, field568, 256, Statics.field1424, Statics.field2000);
                                } else {
                                    class89.method1839(var12, var13, 0, Statics.field1424, Statics.field2000);
                                }
                                if (field689[var11]) {
                                    Statics.field397.method1819(var12, var13);
                                }
                                field688[var11] = true;
                                class89.method1824(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var65 = class77.field1374;
                        int var66 = class77.field1375;
                        if (!field722 && var65 >= var19 && var66 >= var20 && var65 < var21 && var66 < var22) {
                            method31(var10, var65 - var12, var66 - var13);
                        }
                        if (var10.field2668 == 0) {
                            if (!var10.field2608 && Statics.method40(var10) && Statics.field238 != var10) {
                                continue;
                            }
                            if (!var10.field2608) {
                                if (var10.field2620 > var10.field2622 - var10.field2616) {
                                    var10.field2620 = var10.field2622 - var10.field2616;
                                }
                                if (var10.field2620 < 0) {
                                    var10.field2620 = 0;
                                }
                            }
                            method248(arg0, var10.field2676, var19, var20, var21, var22, var12 - var10.field2619, var13 - var10.field2620, var11);
                            if (var10.field2706 != null) {
                                method248(var10.field2706, var10.field2676, var19, var20, var21, var22, var12 - var10.field2619, var13 - var10.field2620, var11);
                            }
                            class4 var67 = (class4) field653.method3354((long) var10.field2676);
                            if (var67 != null) {
                                if (var67.field61 == 0 && class77.field1374 >= var19 && class77.field1375 >= var20 && class77.field1374 < var21 && class77.field1375 < var22 && !field722 && !field573) {
                                    field631[0] = class135.field2313;
                                    field632[0] = "";
                                    field629[0] = 1006;
                                    field626 = 1;
                                }
                                method1698(var67.field63, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1824(arg2, arg3, arg4, arg5);
                            class104.method2173();
                        }
                        if (field689[var11] || field694 > 1) {
                            if (var10.field2668 == 0 && !var10.field2608 && var10.field2622 > var10.field2616) {
                                int var68 = var10.field2615 + var12;
                                int var69 = var10.field2620;
                                int var70 = var10.field2616;
                                int var71 = var10.field2622;
                                Statics.field286[0].method1819(var68, var13);
                                Statics.field286[1].method1819(var68, var13 + var70 - 16);
                                class89.method1830(var68, var13 + 16, 16, var70 - 32, field561);
                                int var72 = (var70 - 32) * var70 / var71;
                                if (var72 < 8) {
                                    var72 = 8;
                                }
                                int var73 = (var70 - 32 - var72) * var69 / (var71 - var70);
                                class89.method1830(var68, var13 + 16 + var73, 16, var72, field562);
                                class89.method1844(var68, var13 + 16 + var73, var72, field618);
                                class89.method1844(var68 + 1, var13 + 16 + var73, var72, field618);
                                class89.method1834(var68, var13 + 16 + var73, 16, field618);
                                class89.method1834(var68, var13 + 17 + var73, 16, field618);
                                class89.method1844(var68 + 15, var13 + 16 + var73, var72, field563);
                                class89.method1844(var68 + 14, var13 + 17 + var73, var72 - 1, field563);
                                class89.method1834(var68, var13 + 15 + var73 + var72, 16, field563);
                                class89.method1834(var68 + 1, var13 + 14 + var73 + var72, 15, field563);
                            }
                            if (var10.field2668 != 1) {
                                if (var10.field2668 == 2) {
                                    int var74 = 0;
                                    for (int var75 = 0; var75 < var10.field2616; var75++) {
                                        for (int var76 = 0; var76 < var10.field2615; var76++) {
                                            int var77 = (var10.field2674 + 32) * var76 + var12;
                                            int var78 = (var10.field2707 + 32) * var75 + var13;
                                            if (var74 < 20) {
                                                var77 += var10.field2661[var74];
                                                var78 += var10.field2702[var74];
                                            }
                                            if (var10.field2708[var74] > 0) {
                                                boolean var79 = false;
                                                boolean var80 = false;
                                                int var81 = var10.field2708[var74] - 1;
                                                if (var77 + 32 > arg2 && var77 < arg4 && var78 + 32 > arg3 && var78 < arg5 || Statics.field1384 == var10 && field596 == var74) {
                                                    class86 var82;
                                                    if (field638 == 1 && Statics.field1226 == var74 && Statics.field205 == var10.field2676) {
                                                        var82 = class40.method1707(var81, var10.field2663[var74], 2, 0, false);
                                                    } else {
                                                        var82 = class40.method1707(var81, var10.field2663[var74], 1, 3153952, false);
                                                    }
                                                    if (var82 == null) {
                                                        method2472(var10);
                                                    } else if (Statics.field1384 == var10 && field596 == var74) {
                                                        int var83 = class77.field1374 - field480;
                                                        int var84 = class77.field1375 - field598;
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (field644 < 5) {
                                                            var83 = 0;
                                                            var84 = 0;
                                                        }
                                                        var82.method1800(var77 + var83, var78 + var84, 128);
                                                        if (arg1 != -1) {
                                                            class159 var85 = arg0[arg1 & 0xFFFF];
                                                            if (var78 + var84 < class89.field1479 && var85.field2620 > 0) {
                                                                int var86 = field723 * (class89.field1479 - var78 - var84) / 3;
                                                                if (var86 > field723 * 10) {
                                                                    var86 = field723 * 10;
                                                                }
                                                                if (var86 > var85.field2620) {
                                                                    var86 = var85.field2620;
                                                                }
                                                                var85.field2620 -= var86;
                                                                field598 += var86;
                                                                method2472(var85);
                                                            }
                                                            if (var78 + var84 + 32 > class89.field1482 && var85.field2620 < var85.field2622 - var85.field2616) {
                                                                int var87 = field723 * (var78 + var84 + 32 - class89.field1482) / 3;
                                                                if (var87 > field723 * 10) {
                                                                    var87 = field723 * 10;
                                                                }
                                                                if (var87 > var85.field2622 - var85.field2616 - var85.field2620) {
                                                                    var87 = var85.field2622 - var85.field2616 - var85.field2620;
                                                                }
                                                                var85.field2620 += var87;
                                                                field598 -= var87;
                                                                method2472(var85);
                                                            }
                                                        }
                                                    } else if (Statics.field2018 == var10 && field595 == var74) {
                                                        var82.method1800(var77, var78, 128);
                                                    } else {
                                                        var82.method1764(var77, var78);
                                                    }
                                                }
                                            } else if (var10.field2652 != null && var74 < 20) {
                                                class86 var88 = var10.method3212(var74);
                                                if (var88 != null) {
                                                    var88.method1764(var77, var78);
                                                } else if (class159.field2642) {
                                                    method2472(var10);
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                } else if (var10.field2668 == 3) {
                                    int var89;
                                    if (method167(var10)) {
                                        var89 = var10.field2672;
                                        if (Statics.field238 == var10 && var10.field2626 != 0) {
                                            var89 = var10.field2626;
                                        }
                                    } else {
                                        var89 = var10.field2623;
                                        if (Statics.field238 == var10 && var10.field2693 != 0) {
                                            var89 = var10.field2693;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2627) {
                                            class89.method1830(var12, var13, var10.field2615, var10.field2616, var89);
                                        } else {
                                            class89.method1832(var12, var13, var10.field2615, var10.field2616, var89);
                                        }
                                    } else if (var10.field2627) {
                                        class89.method1829(var12, var13, var10.field2615, var10.field2616, var89, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1833(var12, var13, var10.field2615, var10.field2616, var89, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2668 == 4) {
                                    class183 var90 = var10.method3211();
                                    if (var90 != null) {
                                        String var91 = var10.field2653;
                                        int var92;
                                        if (method167(var10)) {
                                            var92 = var10.field2672;
                                            if (Statics.field238 == var10 && var10.field2626 != 0) {
                                                var92 = var10.field2626;
                                            }
                                            if (var10.field2654.length() > 0) {
                                                var91 = var10.field2654;
                                            }
                                        } else {
                                            var92 = var10.field2623;
                                            if (Statics.field238 == var10 && var10.field2693 != 0) {
                                                var92 = var10.field2693;
                                            }
                                        }
                                        if (var10.field2608 && var10.field2710 != -1) {
                                            class40 var93 = class40.method1333(var10.field2710);
                                            var91 = var93.field989;
                                            if (var91 == null) {
                                                var91 = "null";
                                            }
                                            if ((var93.field1016 == 1 || var10.field2711 != 1) && var10.field2711 != -1) {
                                                var91 = class2.method1185(16748608) + var91 + class2.field29 + " " + 'x' + method2386(var10.field2711);
                                            }
                                        }
                                        if (field648 == var10) {
                                            class135 var10000 = (class135) null;
                                            var91 = class135.field2238;
                                            var92 = var10.field2623;
                                        }
                                        if (!var10.field2608) {
                                            var91 = method2239(var91, var10);
                                        }
                                        var90.method3445(var91, var12, var13, var10.field2615, var10.field2616, var92, var10.field2658 ? 0 : -1, var10.field2656, var10.field2682, var10.field2655);
                                    } else if (class159.field2642) {
                                        method2472(var10);
                                    }
                                } else if (var10.field2668 == 5) {
                                    if (var10.field2608) {
                                        class86 var95;
                                        if (var10.field2710 == -1) {
                                            var95 = var10.method3221(false);
                                        } else {
                                            var95 = class40.method1707(var10.field2710, var10.field2711, var10.field2634, var10.field2635, false);
                                        }
                                        if (var95 != null) {
                                            int var96 = var95.field1460;
                                            int var97 = var95.field1461;
                                            if (var10.field2610) {
                                                class89.method1846(var12, var13, var10.field2615 + var12, var10.field2616 + var13);
                                                int var98 = (var10.field2615 + (var96 - 1)) / var96;
                                                int var99 = (var10.field2616 + (var97 - 1)) / var97;
                                                for (int var100 = 0; var100 < var98; var100++) {
                                                    for (int var101 = 0; var101 < var99; var101++) {
                                                        if (var10.field2659 != 0) {
                                                            var95.method1724(var96 / 2 + var96 * var100 + var12, var97 / 2 + var97 * var101 + var13, var10.field2659, 4096);
                                                        } else if (var14 == 0) {
                                                            var95.method1764(var96 * var100 + var12, var97 * var101 + var13);
                                                        } else {
                                                            var95.method1800(var96 * var100 + var12, var97 * var101 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1824(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var102 = var10.field2615 * 4096 / var96;
                                                if (var10.field2659 != 0) {
                                                    var95.method1724(var10.field2615 / 2 + var12, var10.field2616 / 2 + var13, var10.field2659, var102);
                                                } else if (var14 != 0) {
                                                    var95.method1728(var12, var13, var10.field2615, var10.field2616, 256 - (var14 & 0xFF));
                                                } else if (var10.field2615 == var96 && var10.field2616 == var97) {
                                                    var95.method1764(var12, var13);
                                                } else {
                                                    var95.method1722(var12, var13, var10.field2615, var10.field2616);
                                                }
                                            }
                                        } else if (class159.field2642) {
                                            method2472(var10);
                                        }
                                    } else {
                                        class86 var94 = var10.method3221(method167(var10));
                                        if (var94 != null) {
                                            var94.method1764(var12, var13);
                                        } else if (class159.field2642) {
                                            method2472(var10);
                                        }
                                    }
                                } else if (var10.field2668 == 6) {
                                    boolean var103 = method167(var10);
                                    int var104;
                                    if (var103) {
                                        var104 = var10.field2643;
                                    } else {
                                        var104 = var10.field2632;
                                    }
                                    class112 var105 = null;
                                    int var106 = 0;
                                    if (var10.field2710 != -1) {
                                        class40 var107 = class40.method1333(var10.field2710);
                                        if (var107 != null) {
                                            class40 var108 = var107.method839(var10.field2711);
                                            var105 = var108.method851(1);
                                            if (var105 == null) {
                                                method2472(var10);
                                            } else {
                                                var105.method2276();
                                                var106 = var105.field1535 / 2;
                                            }
                                        }
                                    } else if (var10.field2638 == 5) {
                                        if (var10.field2599 == 0) {
                                            var105 = field742.method3272((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var105 = Statics.field461.method18();
                                        }
                                    } else if (var104 == -1) {
                                        var105 = var10.method3213((class34) null, -1, var103, Statics.field461.field51);
                                        if (var105 == null && class159.field2642) {
                                            method2472(var10);
                                        }
                                    } else {
                                        class34 var109 = class34.method152(var104);
                                        var105 = var10.method3213(var109, var10.field2601, var103, Statics.field461.field51);
                                        if (var105 == null && class159.field2642) {
                                            method2472(var10);
                                        }
                                    }
                                    class104.method2177(var10.field2615 / 2 + var12, var10.field2616 / 2 + var13);
                                    int var110 = var10.field2649 * class104.field1755[var10.field2715] >> 16;
                                    int var111 = var10.field2649 * class104.field1743[var10.field2715] >> 16;
                                    if (var105 != null) {
                                        if (var10.field2608) {
                                            var105.method2276();
                                            if (var10.field2651) {
                                                var105.method2344(0, var10.field2647, var10.field2646, var10.field2715, var10.field2686, var10.field2717 + var106 + var110, var10.field2717 + var111, var10.field2649);
                                            } else {
                                                var105.method2288(0, var10.field2647, var10.field2646, var10.field2715, var10.field2686, var10.field2717 + var106 + var110, var10.field2717 + var111);
                                            }
                                        } else {
                                            var105.method2288(0, var10.field2647, 0, var10.field2715, 0, var110, var111);
                                        }
                                    }
                                    class104.method2176();
                                } else {
                                    if (var10.field2668 == 7) {
                                        class183 var112 = var10.method3211();
                                        if (var112 == null) {
                                            if (class159.field2642) {
                                                method2472(var10);
                                            }
                                            continue;
                                        }
                                        int var113 = 0;
                                        for (int var114 = 0; var114 < var10.field2616; var114++) {
                                            for (int var115 = 0; var115 < var10.field2615; var115++) {
                                                if (var10.field2708[var113] > 0) {
                                                    class40 var116 = class40.method1333(var10.field2708[var113] - 1);
                                                    String var117;
                                                    if (var116.field1016 != 1 && var10.field2663[var113] == 1) {
                                                        var117 = class2.method1185(16748608) + var116.field989 + class2.field29;
                                                    } else {
                                                        var117 = class2.method1185(16748608) + var116.field989 + class2.field29 + " " + 'x' + method2386(var10.field2663[var113]);
                                                    }
                                                    int var118 = (var10.field2674 + 115) * var115 + var12;
                                                    int var119 = (var10.field2707 + 12) * var114 + var13;
                                                    if (var10.field2656 == 0) {
                                                        var112.method3456(var117, var118, var119, var10.field2623, var10.field2658 ? 0 : -1);
                                                    } else if (var10.field2656 == 1) {
                                                        var112.method3444(var117, var10.field2615 / 2 + var118, var119, var10.field2623, var10.field2658 ? 0 : -1);
                                                    } else {
                                                        var112.method3440(var117, var10.field2615 + var118 - 1, var119, var10.field2623, var10.field2658 ? 0 : -1);
                                                    }
                                                }
                                                var113++;
                                            }
                                        }
                                    }
                                    if (var10.field2668 == 8 && Statics.field635 == var10 && field636 == field610) {
                                        int var120 = 0;
                                        int var121 = 0;
                                        class183 var122 = Statics.field305;
                                        String var123 = var10.field2653;
                                        String var124 = method2239(var123, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class2.field24);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            int var127 = var122.method3462(var126);
                                            if (var127 > var120) {
                                                var120 = var127;
                                            }
                                            var121 += var122.field2847 + 1;
                                        }
                                        var120 += 6;
                                        var121 += 7;
                                        int var128 = var10.field2615 + var12 - 5 - var120;
                                        int var129 = var10.field2616 + var13 + 5;
                                        if (var128 < var12 + 5) {
                                            var128 = var12 + 5;
                                        }
                                        if (var120 + var128 > arg4) {
                                            var128 = arg4 - var120;
                                        }
                                        if (var121 + var129 > arg5) {
                                            var129 = arg5 - var121;
                                        }
                                        class89.method1830(var128, var129, var120, var121, 16777120);
                                        class89.method1832(var128, var129, var120, var121, 0);
                                        String var130 = var10.field2653;
                                        int var131 = var122.field2847 + var129 + 2;
                                        String var132 = method2239(var130, var10);
                                        while (var132.length() > 0) {
                                            int var133 = var132.indexOf(class2.field24);
                                            String var134;
                                            if (var133 == -1) {
                                                var134 = var132;
                                                var132 = "";
                                            } else {
                                                var134 = var132.substring(0, var133);
                                                var132 = var132.substring(var133 + 4);
                                            }
                                            var122.method3456(var134, var128 + 3, var131, 0, -1);
                                            var131 += var122.field2847 + 1;
                                        }
                                    }
                                    if (var10.field2668 == 9) {
                                        if (var10.field2629 == 1) {
                                            class89.method1838(var12, var13, var10.field2615 + var12, var10.field2616 + var13, var10.field2623);
                                        } else {
                                            int var135 = var10.field2615 >= 0 ? var10.field2615 : -var10.field2615;
                                            int var136 = var10.field2616 >= 0 ? var10.field2616 : -var10.field2616;
                                            int var137 = var135;
                                            if (var135 < var136) {
                                                var137 = var136;
                                            }
                                            if (var137 != 0) {
                                                int var138 = (var10.field2615 << 16) / var137;
                                                int var139 = (var10.field2616 << 16) / var137;
                                                if (var139 <= var138) {
                                                    var138 = -var138;
                                                } else {
                                                    var139 = -var139;
                                                }
                                                int var140 = var10.field2629 * var139 >> 17;
                                                int var141 = var10.field2629 * var139 + 1 >> 17;
                                                int var142 = var10.field2629 * var138 >> 17;
                                                int var143 = var10.field2629 * var138 + 1 >> 17;
                                                int var144 = var12 + var140;
                                                int var145 = var12 - var141;
                                                int var146 = var10.field2615 + var12 - var141;
                                                int var147 = var10.field2615 + var12 + var140;
                                                int var148 = var13 + var142;
                                                int var149 = var13 - var143;
                                                int var150 = var10.field2616 + var13 - var143;
                                                int var151 = var10.field2616 + var13 + var142;
                                                class104.method2182(var144, var145, var146);
                                                class104.method2185(var148, var149, var150, var144, var145, var146, var10.field2623);
                                                class104.method2182(var144, var146, var147);
                                                class104.method2185(var148, var150, var151, var144, var146, var147, var10.field2623);
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

    @ObfuscatedName("dm.by(Ljava/lang/String;Lfn;I)Ljava/lang/String;")
    public static String method2239(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1625(arg1, var2 - 1);
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
                if (Statics.field208 != null) {
                    var8 = class148.method1332(Statics.field208.field1395);
                    if (Statics.field208.field1397 != null) {
                        var8 = (String) Statics.field208.field1397;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dk.cp(IS)Ljava/lang/String;")
    public static final String method2386(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field26 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1185(65408) + var1.substring(0, var1.length() - 8) + class135.field2129 + " " + class2.field21 + var1 + class2.field22 + class2.field29;
        } else if (var1.length() > 6) {
            return " " + class2.method1185(16777215) + var1.substring(0, var1.length() - 4) + class135.field2243 + " " + class2.field21 + var1 + class2.field22 + class2.field29;
        } else {
            return " " + class2.method1185(16776960) + var1 + class2.field29;
        }
    }

    @ObfuscatedName("t.ch(Lfn;IIIIIII)V")
    public static final void method146(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field523) {
            field539 = 32;
        } else {
            field539 = 0;
        }
        field523 = false;
        if (class77.field1373 == 1 || !Statics.field876 && class77.field1373 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2620 -= 4;
                method2472(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2620 += 4;
                method2472(arg0);
            } else if (arg5 >= arg1 - field539 && arg5 < field539 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2620 = (arg4 - arg3) * var8 / var9;
                method2472(arg0);
                field523 = true;
            }
        }
        if (field680 == 0) {
            return;
        }
        int var10 = arg0.field2615;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2620 += field680 * 45;
            method2472(arg0);
        }
    }

    @ObfuscatedName("m.cs(Lfn;I)Z")
    public static final boolean method167(class159 arg0) {
        if (arg0.field2637 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2637.length; var1++) {
            int var2 = method1625(arg0, var1);
            int var3 = arg0.field2704[var1];
            if (arg0.field2637[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2637[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2637[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cw.cw(Lfn;II)I")
    public static final int method1625(class159 arg0, int arg1) {
        if (arg0.field2660 == null || arg1 >= arg0.field2660.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2660[arg1];
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
                    var7 = field621[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field622[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field623[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method166(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method1333(var12).field1002 || field489)) {
                        for (int var13 = 0; var13 < var11.field2708.length; var13++) {
                            if (var12 + 1 == var11.field2708[var13]) {
                                var7 += var11.field2663[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2727[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2057[field622[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2727[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field461.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2056[var14]) {
                            var7 += field622[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method166(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method1333(var18).field1002 || field489)) {
                        for (int var19 = 0; var19 < var17.field2708.length; var19++) {
                            if (var18 + 1 == var17.field2708[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field649;
                }
                if (var6 == 12) {
                    var7 = field567;
                }
                if (var6 == 13) {
                    int var20 = class160.field2727[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method154(var22);
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
                    var7 = (Statics.field461.field421 >> 7) + Statics.field1399;
                }
                if (var6 == 19) {
                    var7 = (Statics.field461.field422 >> 7) + Statics.field113;
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

    @ObfuscatedName("o.ca(Lfn;III)V")
    public static final void method31(class159 arg0, int arg1, int arg2) {
        if (arg0.field2609 == 1) {
            method111(arg0.field2625, "", 24, 0, 0, arg0.field2676);
        }
        if (arg0.field2609 == 2 && !field640) {
            int var3 = method2492(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2724 == null || arg0.field2724.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2724;
            }
            if (var5 != null) {
                method111(var5, class2.method1185(65280) + arg0.field2712, 25, 0, -1, arg0.field2676);
            }
        }
        if (arg0.field2609 == 3) {
            method111(class135.field2239, "", 26, 0, 0, arg0.field2676);
        }
        if (arg0.field2609 == 4) {
            method111(arg0.field2625, "", 28, 0, 0, arg0.field2676);
        }
        if (arg0.field2609 == 5) {
            method111(arg0.field2625, "", 29, 0, 0, arg0.field2676);
        }
        if (arg0.field2609 == 6 && field648 == null) {
            method111(arg0.field2625, "", 30, 0, -1, arg0.field2676);
        }
        if (arg0.field2668 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2616; var8++) {
                for (int var9 = 0; var9 < arg0.field2615; var9++) {
                    int var10 = (arg0.field2674 + 32) * var9;
                    int var11 = (arg0.field2707 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2661[var7];
                        var11 += arg0.field2702[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field599 = var7;
                        Statics.field377 = arg0;
                        if (arg0.field2708[var7] > 0) {
                            label309: {
                                class40 var12 = class40.method1333(arg0.field2708[var7] - 1);
                                if (field638 == 1) {
                                    int var13 = method2492(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field205 != arg0.field2676 || Statics.field1226 != var7) {
                                            method111(class135.field2230, field639 + " " + class2.field23 + " " + class2.method1185(16748608) + var12.field989, 31, var12.field981, var7, arg0.field2676);
                                        }
                                        break label309;
                                    }
                                }
                                if (!field640 || !class163.method262(method2492(arg0))) {
                                    String[] var15 = var12.field1014;
                                    if (field534) {
                                        var15 = method2765(var15);
                                    }
                                    int var16 = method2492(arg0);
                                    boolean var17 = (var16 >> 30 & 0x1) != 0;
                                    if (var17) {
                                        for (int var18 = 4; var18 >= 3; var18--) {
                                            if (var15 != null && var15[var18] != null) {
                                                byte var19;
                                                if (var18 == 3) {
                                                    var19 = 36;
                                                } else {
                                                    var19 = 37;
                                                }
                                                method111(var15[var18], class2.method1185(16748608) + var12.field989, var19, var12.field981, var7, arg0.field2676);
                                            } else if (var18 == 4) {
                                                method111(class135.field2091, class2.method1185(16748608) + var12.field989, 37, var12.field981, var7, arg0.field2676);
                                            }
                                        }
                                    }
                                    class163 var10000 = (class163) null;
                                    if (class163.method2254(method2492(arg0))) {
                                        method111(class135.field2230, class2.method1185(16748608) + var12.field989, 38, var12.field981, var7, arg0.field2676);
                                    }
                                    int var20 = method2492(arg0);
                                    boolean var21 = (var20 >> 30 & 0x1) != 0;
                                    if (var21 && var15 != null) {
                                        for (int var22 = 2; var22 >= 0; var22--) {
                                            if (var15[var22] != null) {
                                                byte var23 = 0;
                                                if (var22 == 0) {
                                                    var23 = 33;
                                                }
                                                if (var22 == 1) {
                                                    var23 = 34;
                                                }
                                                if (var22 == 2) {
                                                    var23 = 35;
                                                }
                                                method111(var15[var22], class2.method1185(16748608) + var12.field989, var23, var12.field981, var7, arg0.field2676);
                                            }
                                        }
                                    }
                                    String[] var24 = arg0.field2664;
                                    if (field534) {
                                        var24 = method2765(var24);
                                    }
                                    if (var24 != null) {
                                        for (int var25 = 4; var25 >= 0; var25--) {
                                            if (var24[var25] != null) {
                                                byte var26 = 0;
                                                if (var25 == 0) {
                                                    var26 = 39;
                                                }
                                                if (var25 == 1) {
                                                    var26 = 40;
                                                }
                                                if (var25 == 2) {
                                                    var26 = 41;
                                                }
                                                if (var25 == 3) {
                                                    var26 = 42;
                                                }
                                                if (var25 == 4) {
                                                    var26 = 43;
                                                }
                                                method111(var24[var25], class2.method1185(16748608) + var12.field989, var26, var12.field981, var7, arg0.field2676);
                                            }
                                        }
                                    }
                                    method111(class135.field2231, class2.method1185(16748608) + var12.field989, 1005, var12.field981, var7, arg0.field2676);
                                } else if ((Statics.field67 & 0x10) == 16) {
                                    method111(field678, field565 + " " + class2.field23 + " " + class2.method1185(16748608) + var12.field989, 32, var12.field981, var7, arg0.field2676);
                                }
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2608) {
            return;
        }
        if (field640) {
            int var27 = method2492(arg0);
            boolean var28 = (var27 >> 21 & 0x1) != 0;
            if (var28 && (Statics.field67 & 0x20) == 32) {
                method111(field678, field565 + " " + class2.field23 + " " + arg0.field2666, 58, 0, arg0.field2607, arg0.field2676);
            }
            return;
        }
        for (int var29 = 9; var29 >= 5; var29--) {
            String var30 = method164(arg0, var29);
            if (var30 != null) {
                method111(var30, arg0.field2666, 1007, var29 + 1, arg0.field2607, arg0.field2676);
            }
        }
        int var31 = method2492(arg0);
        int var32 = var31 >> 11 & 0x3F;
        String var33;
        if (var32 == 0) {
            var33 = null;
        } else if (arg0.field2724 == null || arg0.field2724.trim().length() == 0) {
            var33 = null;
        } else {
            var33 = arg0.field2724;
        }
        if (var33 != null) {
            method111(var33, arg0.field2666, 25, 0, arg0.field2607, arg0.field2676);
        }
        for (int var35 = 4; var35 >= 0; var35--) {
            String var36 = method164(arg0, var35);
            if (var36 != null) {
                method111(var36, arg0.field2666, 57, var35 + 1, arg0.field2607, arg0.field2676);
            }
        }
        if (class163.method2356(method2492(arg0))) {
            method111(class135.field2263, "", 30, 0, arg0.field2607, arg0.field2676);
        }
    }

    @ObfuscatedName("ee.cx([Lfn;IIIIIIIB)V")
    public static final void method3029(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2608 || var9.field2668 == 0 || var9.field2673 || method2492(var9) != 0 || field656 == var9) && var9.field2617 == arg1 && (!var9.field2608 || !Statics.method40(var9))) {
                int var10 = var9.field2611 + arg6;
                int var11 = var9.field2612 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2668 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2668 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2615 + var10;
                    int var19 = var9.field2616 + var11;
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
                    int var22 = var9.field2615 + var10;
                    int var23 = var9.field2616 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field655 == var9) {
                    field537 = true;
                    field664 = var10;
                    field665 = var11;
                }
                if (!var9.field2608 || var12 < var14 && var13 < var15) {
                    if (var9.field2657 == 1337) {
                        method2472(var9);
                    } else if (var9.field2657 != 1338) {
                        if (var9.field2668 == 0) {
                            if (!var9.field2608 && Statics.method40(var9) && Statics.field238 != var9) {
                                continue;
                            }
                            method3029(arg0, var9.field2676, var12, var13, var14, var15, var10 - var9.field2619, var11 - var9.field2620);
                            if (var9.field2706 != null) {
                                method3029(var9.field2706, var9.field2676, var12, var13, var14, var15, var10 - var9.field2619, var11 - var9.field2620);
                            }
                            class4 var35 = (class4) field653.method3354((long) var9.field2676);
                            if (var35 != null) {
                                int var36 = var35.field63;
                                if (class159.method687(var36)) {
                                    method3029(Statics.field2641[var36], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2608) {
                            if (var9.field2723 && class77.field1374 >= var12 && class77.field1375 >= var13 && class77.field1374 < var14 && class77.field1375 < var15) {
                                for (class1 var37 = (class1) field504.method3373(); var37 != null; var37 = (class1) field504.method3375()) {
                                    if (var37.field10) {
                                        var37.method3404();
                                        var37.field3.field2703 = false;
                                    }
                                }
                                if (Statics.field32 == 0) {
                                    field655 = null;
                                    field656 = null;
                                }
                                if (!field722) {
                                    field631[0] = class135.field2313;
                                    field632[0] = "";
                                    field629[0] = 1006;
                                    field626 = 1;
                                }
                            }
                            boolean var38;
                            if (class77.field1374 >= var12 && class77.field1375 >= var13 && class77.field1374 < var14 && class77.field1375 < var15) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class77.field1373 == 1 || !Statics.field876 && class77.field1373 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class77.field1369 == 1 || !Statics.field876 && class77.field1369 == 4) && class77.field1381 >= var12 && class77.field1382 >= var13 && class77.field1381 < var14 && class77.field1382 < var15) {
                                var40 = true;
                            }
                            if (var40) {
                                method204(var9, class77.field1381 - var10, class77.field1382 - var11);
                            }
                            if (field655 != null && field655 != var9 && var38) {
                                int var41 = method2492(var9);
                                boolean var42 = (var41 >> 20 & 0x1) != 0;
                                if (var42) {
                                    field659 = var9;
                                }
                            }
                            if (field656 == var9) {
                                field494 = true;
                                field643 = var10;
                                field706 = var11;
                            }
                            if (var9.field2673) {
                                if (var38 && field680 != 0 && var9.field2694 != null) {
                                    class1 var43 = new class1();
                                    var43.field10 = true;
                                    var43.field3 = var9;
                                    var43.field5 = field680;
                                    var43.field13 = var9.field2694;
                                    field504.method3381(var43);
                                }
                                if (field655 != null || Statics.field1384 != null || field722) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field2716 && var40) {
                                    var9.field2716 = true;
                                    if (var9.field2675 != null) {
                                        class1 var44 = new class1();
                                        var44.field10 = true;
                                        var44.field3 = var9;
                                        var44.field4 = class77.field1381 - var10;
                                        var44.field5 = class77.field1382 - var11;
                                        var44.field13 = var9.field2675;
                                        field504.method3381(var44);
                                    }
                                }
                                if (var9.field2716 && var39 && var9.field2648 != null) {
                                    class1 var45 = new class1();
                                    var45.field10 = true;
                                    var45.field3 = var9;
                                    var45.field4 = class77.field1374 - var10;
                                    var45.field5 = class77.field1375 - var11;
                                    var45.field13 = var9.field2648;
                                    field504.method3381(var45);
                                }
                                if (var9.field2716 && !var39) {
                                    var9.field2716 = false;
                                    if (var9.field2677 != null) {
                                        class1 var46 = new class1();
                                        var46.field10 = true;
                                        var46.field3 = var9;
                                        var46.field4 = class77.field1374 - var10;
                                        var46.field5 = class77.field1375 - var11;
                                        var46.field13 = var9.field2677;
                                        field683.method3381(var46);
                                    }
                                }
                                if (var39 && var9.field2678 != null) {
                                    class1 var47 = new class1();
                                    var47.field10 = true;
                                    var47.field3 = var9;
                                    var47.field4 = class77.field1374 - var10;
                                    var47.field5 = class77.field1375 - var11;
                                    var47.field13 = var9.field2678;
                                    field504.method3381(var47);
                                }
                                if (!var9.field2703 && var38) {
                                    var9.field2703 = true;
                                    if (var9.field2679 != null) {
                                        class1 var48 = new class1();
                                        var48.field10 = true;
                                        var48.field3 = var9;
                                        var48.field4 = class77.field1374 - var10;
                                        var48.field5 = class77.field1375 - var11;
                                        var48.field13 = var9.field2679;
                                        field504.method3381(var48);
                                    }
                                }
                                if (var9.field2703 && var38 && var9.field2680 != null) {
                                    class1 var49 = new class1();
                                    var49.field10 = true;
                                    var49.field3 = var9;
                                    var49.field4 = class77.field1374 - var10;
                                    var49.field5 = class77.field1375 - var11;
                                    var49.field13 = var9.field2680;
                                    field504.method3381(var49);
                                }
                                if (var9.field2703 && !var38) {
                                    var9.field2703 = false;
                                    if (var9.field2639 != null) {
                                        class1 var50 = new class1();
                                        var50.field10 = true;
                                        var50.field3 = var9;
                                        var50.field4 = class77.field1374 - var10;
                                        var50.field5 = class77.field1375 - var11;
                                        var50.field13 = var9.field2639;
                                        field683.method3381(var50);
                                    }
                                }
                                if (var9.field2598 != null) {
                                    class1 var51 = new class1();
                                    var51.field3 = var9;
                                    var51.field13 = var9.field2598;
                                    field682.method3381(var51);
                                }
                                if (var9.field2650 != null && field669 > var9.field2718) {
                                    if (var9.field2687 == null || field669 - var9.field2718 > 32) {
                                        class1 var56 = new class1();
                                        var56.field3 = var9;
                                        var56.field13 = var9.field2650;
                                        field504.method3381(var56);
                                    } else {
                                        label432: for (int var52 = var9.field2718; var52 < field669; var52++) {
                                            int var53 = field703[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2687.length; var54++) {
                                                if (var9.field2687[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field3 = var9;
                                                    var55.field13 = var9.field2650;
                                                    field504.method3381(var55);
                                                    break label432;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2718 = field669;
                                }
                                if (var9.field2688 != null && field686 > var9.field2709) {
                                    if (var9.field2695 == null || field686 - var9.field2709 > 32) {
                                        class1 var61 = new class1();
                                        var61.field3 = var9;
                                        var61.field13 = var9.field2688;
                                        field504.method3381(var61);
                                    } else {
                                        label412: for (int var57 = var9.field2709; var57 < field686; var57++) {
                                            int var58 = field580[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2695.length; var59++) {
                                                if (var9.field2695[var59] == var58) {
                                                    class1 var60 = new class1();
                                                    var60.field3 = var9;
                                                    var60.field13 = var9.field2688;
                                                    field504.method3381(var60);
                                                    break label412;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2709 = field686;
                                }
                                if (var9.field2690 != null && field602 > var9.field2720) {
                                    if (var9.field2669 == null || field602 - var9.field2720 > 32) {
                                        class1 var66 = new class1();
                                        var66.field3 = var9;
                                        var66.field13 = var9.field2690;
                                        field504.method3381(var66);
                                    } else {
                                        label392: for (int var62 = var9.field2720; var62 < field602; var62++) {
                                            int var63 = field672[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2669.length; var64++) {
                                                if (var9.field2669[var64] == var63) {
                                                    class1 var65 = new class1();
                                                    var65.field3 = var9;
                                                    var65.field13 = var9.field2690;
                                                    field504.method3381(var65);
                                                    break label392;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2720 = field602;
                                }
                                if (field674 > var9.field2621 && var9.field2644 != null) {
                                    class1 var67 = new class1();
                                    var67.field3 = var9;
                                    var67.field13 = var9.field2644;
                                    field504.method3381(var67);
                                }
                                if (field675 > var9.field2621 && var9.field2697 != null) {
                                    class1 var68 = new class1();
                                    var68.field3 = var9;
                                    var68.field13 = var9.field2697;
                                    field504.method3381(var68);
                                }
                                if (field676 > var9.field2621 && var9.field2698 != null) {
                                    class1 var69 = new class1();
                                    var69.field3 = var9;
                                    var69.field13 = var9.field2698;
                                    field504.method3381(var69);
                                }
                                if (field677 > var9.field2621 && var9.field2699 != null) {
                                    class1 var70 = new class1();
                                    var70.field3 = var9;
                                    var70.field13 = var9.field2699;
                                    field504.method3381(var70);
                                }
                                var9.field2621 = field667;
                                if (var9.field2696 != null) {
                                    for (int var71 = 0; var71 < field555; var71++) {
                                        class1 var72 = new class1();
                                        var72.field3 = var9;
                                        var72.field8 = field707[var71];
                                        var72.field6 = field495[var71];
                                        var72.field13 = var9.field2696;
                                        field504.method3381(var72);
                                    }
                                }
                            }
                        }
                        if (!var9.field2608) {
                            if (field655 != null || Statics.field1384 != null || field722) {
                                return;
                            }
                            if ((var9.field2705 >= 0 || var9.field2693 != 0) && class77.field1374 >= var12 && class77.field1375 >= var13 && class77.field1374 < var14 && class77.field1375 < var15) {
                                if (var9.field2705 >= 0) {
                                    Statics.field238 = arg0[var9.field2705];
                                } else {
                                    Statics.field238 = var9;
                                }
                            }
                            if (var9.field2668 == 8 && class77.field1374 >= var12 && class77.field1375 >= var13 && class77.field1374 < var14 && class77.field1375 < var15) {
                                Statics.field635 = var9;
                            }
                            if (var9.field2622 > var9.field2616) {
                                method146(var9, var9.field2615 + var10, var11, var9.field2616, var9.field2622, class77.field1374, class77.field1375);
                            }
                        }
                    } else if ((field718 == 0 || field718 == 3) && (class77.field1369 == 1 || !Statics.field876 && class77.field1369 == 4)) {
                        int var24 = class77.field1381 - 25 - var10;
                        int var25 = class77.field1382 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151 && (var24 < 0 || var24 > 23 || var25 < 117 || var25 > 142)) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field670 + field568 & 0x7FF;
                            int var27 = class104.field1755[var26];
                            int var28 = class104.field1743[var26];
                            int var29 = (field557 + 256) * var27 >> 8;
                            int var30 = (field557 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field461.field421 + var31 >> 7;
                            int var34 = Statics.field461.field422 - var32 >> 7;
                            field605.method2360(129);
                            field605.method2485(18);
                            field605.method2529(Statics.field113 + var34);
                            field605.method2520(class75.field1345[82] ? (class75.field1345[81] ? 2 : 1) : 0);
                            field605.method2528(Statics.field1399 + var33);
                            field605.method2485(var24);
                            field605.method2485(var25);
                            field605.method2484(field568);
                            field605.method2485(57);
                            field605.method2485(field670);
                            field605.method2485(field557);
                            field605.method2485(89);
                            field605.method2484(Statics.field461.field421);
                            field605.method2484(Statics.field461.field422);
                            field605.method2485(63);
                            field716 = var33;
                            field717 = var34;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.ci([Lfn;IB)V")
    public static final void method38(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2668 == 0) {
                    if (var3.field2706 != null) {
                        method38(var3.field2706, arg1);
                    }
                    class4 var4 = (class4) field653.method3354((long) var3.field2676);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class159.method687(var5)) {
                            method38(Statics.field2641[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2700 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field13 = var3.field2700;
                    class26.method134(var6);
                }
                if (arg1 == 1 && var3.field2701 != null) {
                    if (var3.field2607 >= 0) {
                        class159 var7 = class159.method166(var3.field2676);
                        if (var7 == null || var7.field2706 == null || var3.field2607 >= var7.field2706.length || var7.field2706[var3.field2607] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field13 = var3.field2701;
                    class26.method134(var8);
                }
            }
        }
    }

    @ObfuscatedName("y.cj(Lfn;III)V")
    public static final void method204(class159 arg0, int arg1, int arg2) {
        if (field655 != null || field722 || arg0 == null || method115(arg0) == null) {
            return;
        }
        field655 = arg0;
        field656 = method115(arg0);
        field657 = arg1;
        field658 = arg2;
        Statics.field32 = 0;
        field730 = false;
    }

    @ObfuscatedName("ds.cv(Lfn;I)V")
    public static void method2472(class159 arg0) {
        if (field585 == arg0.field2722) {
            field687[arg0.field2721] = true;
        }
    }

    @ObfuscatedName("bv.ct(I)V")
    public static void method1600() {
        for (class4 var0 = (class4) field653.method3352(); var0 != null; var0 = (class4) field653.method3353()) {
            int var1 = var0.field63;
            if (class159.method687(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field2641[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2608;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2823;
                    class159 var6 = class159.method166(var5);
                    if (var6 != null) {
                        method2472(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cc(Lfn;I)Lfn;")
    public static class159 method115(class159 arg0) {
        class159 var1 = arg0;
        int var2 = class163.method1558(method2492(arg0));
        class159 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class159.method166(var1.field2617);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class159 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2691;
        }
        return var5;
    }

    @ObfuscatedName("ex.cr([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2765(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("p.cf(II)V")
    public static final void method37(int arg0) {
        if (!class159.method687(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2641[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3 != null) {
                var3.field2601 = 0;
                var3.field2713 = 0;
            }
        }
    }

    @ObfuscatedName("t.cq([Lfn;II)V")
    public static final void method148(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2617 == arg1 && (!var3.field2608 || !Statics.method40(var3))) {
                if (var3.field2668 == 0) {
                    if (!var3.field2608 && Statics.method40(var3) && Statics.field238 != var3) {
                        continue;
                    }
                    method148(arg0, var3.field2676);
                    if (var3.field2706 != null) {
                        method148(var3.field2706, var3.field2676);
                    }
                    class4 var4 = (class4) field653.method3354((long) var3.field2676);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class159.method687(var5)) {
                            method148(Statics.field2641[var5], -1);
                        }
                    }
                }
                if (var3.field2668 == 6) {
                    if (var3.field2632 != -1 || var3.field2643 != -1) {
                        boolean var6 = method167(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2643;
                        } else {
                            var7 = var3.field2632;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method152(var7);
                            var3.field2713 += field723;
                            while (var3.field2713 > var8.field901[var3.field2601]) {
                                var3.field2713 -= var8.field901[var3.field2601];
                                var3.field2601++;
                                if (var3.field2601 >= var8.field887.length) {
                                    var3.field2601 -= var8.field891;
                                    if (var3.field2601 < 0 || var3.field2601 >= var8.field887.length) {
                                        var3.field2601 = 0;
                                    }
                                }
                                method2472(var3);
                            }
                        }
                    }
                    if (var3.field2684 != 0 && !var3.field2608) {
                        int var9 = var3.field2684 >> 16;
                        int var10 = var3.field2684 << 16 >> 16;
                        int var11 = field723 * var9;
                        int var12 = field723 * var10;
                        var3.field2715 = var3.field2715 + var11 & 0x7FF;
                        var3.field2647 = var3.field2647 + var12 & 0x7FF;
                        method2472(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.cl(II)V")
    public static final void method27(int arg0) {
        method1600();
        class7.method235();
        int var1 = class42.method2350(arg0).field1039;
        if (var1 == 0) {
            return;
        }
        int var2 = class160.field2727[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class104.method2202(0.9D);
                ((class110) Statics.field1759).method2251(0.9D);
            }
            if (var2 == 2) {
                class104.method2202(0.8D);
                ((class110) Statics.field1759).method2251(0.8D);
            }
            if (var2 == 3) {
                class104.method2202(0.7D);
                ((class110) Statics.field1759).method2251(0.7D);
            }
            if (var2 == 4) {
                class104.method2202(0.6D);
                ((class110) Statics.field1759).method2251(0.6D);
            }
            class40.method591();
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
            if (field705 != var3) {
                if (field705 == 0 && field720 != -1) {
                    class139.method3193(Statics.field2593, field720, 0, var3, false);
                    field625 = false;
                } else if (var3 == 0) {
                    class139.method565();
                    field625 = false;
                } else if (class139.field2351 == 0) {
                    Statics.field2361.method2832(var3);
                } else {
                    Statics.field2355 = var3;
                }
                field705 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field663 = 127;
            }
            if (var2 == 1) {
                field663 = 96;
            }
            if (var2 == 2) {
                field663 = 64;
            }
            if (var2 == 3) {
                field663 = 32;
            }
            if (var2 == 4) {
                field663 = 0;
            }
        }
        if (var1 == 5) {
            field486 = var2;
        }
        if (var1 == 6) {
            field646 = var2;
        }
        if (var1 == 9) {
            field660 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field743 = 127;
        }
        if (var2 == 1) {
            field743 = 96;
        }
        if (var2 == 2) {
            field743 = 64;
        }
        if (var2 == 3) {
            field743 = 32;
        }
        if (var2 == 4) {
            field743 = 0;
        }
    }

    @ObfuscatedName("dh.cm(Lfn;I)V")
    public static final void method2483(class159 arg0) {
        int var1 = arg0.field2657;
        if (var1 == 324) {
            if (field532 == -1) {
                field532 = arg0.field2630;
                field601 = arg0.field2631;
            }
            if (field742.field2751) {
                arg0.field2630 = field532;
            } else {
                arg0.field2630 = field601;
            }
        } else if (var1 == 325) {
            if (field532 == -1) {
                field532 = arg0.field2630;
                field601 = arg0.field2631;
            }
            if (field742.field2751) {
                arg0.field2630 = field601;
            } else {
                arg0.field2630 = field532;
            }
        } else if (var1 == 327) {
            arg0.field2715 = 150;
            arg0.field2647 = (int) (Math.sin((double) field496 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2638 = 5;
            arg0.field2599 = 0;
        } else if (var1 == 328) {
            arg0.field2715 = 150;
            arg0.field2647 = (int) (Math.sin((double) field496 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2638 = 5;
            arg0.field2599 = 1;
        }
    }

    @ObfuscatedName("dz.ck(IIII)Lo;")
    public static final class4 method2357(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field63 = arg1;
        var3.field61 = arg2;
        field653.method3364(var3, (long) arg0);
        method37(arg1);
        class26.method2395(arg1);
        class159 var4 = class159.method166(arg0);
        if (var4 != null) {
            method2472(var4);
        }
        if (field648 != null) {
            method2472(field648);
            field648 = null;
        }
        method2470();
        if (field681 != -1) {
            int var5 = field681;
            if (class159.method687(var5)) {
                method38(Statics.field2641[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("r.ce(Lo;ZI)V")
    public static final void method62(class4 arg0, boolean arg1) {
        int var2 = arg0.field63;
        int var3 = (int) arg0.field2823;
        arg0.method3404();
        if (arg1) {
            class159.method806(var2);
        }
        method1560(var2);
        class159 var4 = class159.method166(var3);
        if (var4 != null) {
            method2472(var4);
        }
        method2470();
        if (field681 != -1) {
            int var5 = field681;
            if (class159.method687(var5)) {
                method38(Statics.field2641[var5], 1);
            }
        }
    }

    @ObfuscatedName("j.cb(Lfn;I)Z")
    public static final boolean method117(class159 arg0) {
        int var1 = arg0.field2657;
        if (var1 == 205) {
            field533 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field742.method3267(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field742.method3268(var4, var5 == 1);
        }
        if (var1 == 324) {
            field742.method3269(false);
        }
        if (var1 == 325) {
            field742.method3269(true);
        }
        if (var1 == 326) {
            field605.method2360(209);
            field742.method3291(field605);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.cg(IIIILcj;B)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method825(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field670 + field568 & 0x7FF;
        int var7 = class104.field1755[var6];
        int var8 = class104.field1743[var6];
        int var9 = var7 * 256 / (field557 + 256);
        int var10 = var8 * 256 / (field557 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1008.method1731(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("ad.cd(IIIILcj;B)V")
    public static final void method825(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field670 + field568 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1755[var5];
        int var8 = class104.field1743[var5];
        int var9 = var7 * 256 / (field557 + 256);
        int var10 = var8 * 256 / (field557 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1734(Statics.field397, arg0 + 94 + var11 - arg4.field1460 / 2 + 4, arg1 + 83 - var12 - arg4.field1461 / 2 - 4);
        } else {
            arg4.method1764(arg0 + 94 + var11 - arg4.field1460 / 2 + 4, arg1 + 83 - var12 - arg4.field1461 / 2 - 4);
        }
    }

    @ObfuscatedName("bp.cy(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1557(int arg0, String arg1, String arg2) {
        method34(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("p.cz(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method34(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field695[var4] = field695[var4 - 1];
            field515[var4] = field515[var4 - 1];
            field698[var4] = field698[var4 - 1];
            field697[var4] = field697[var4 - 1];
        }
        field695[0] = arg0;
        field515[0] = arg1;
        field698[0] = arg2;
        field697[0] = arg3;
        field699++;
        field674 = field667;
    }

    @ObfuscatedName("ci.cu(Ljava/lang/String;I)Z")
    public static boolean method1706(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method2249(arg0, Statics.field661);
        for (int var2 = 0; var2 < field736; var2++) {
            if (var1.equalsIgnoreCase(class149.method2249(field738[var2].field380, Statics.field661))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method2249(Statics.field461.field45, Statics.field661))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("k.cn(Ljava/lang/String;I)Z")
    public static boolean method57(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method2249(arg0, Statics.field661);
        for (int var2 = 0; var2 < field493; var2++) {
            class11 var3 = field741[var2];
            if (var1.equalsIgnoreCase(class149.method2249(var3.field185, Statics.field661))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method2249(var3.field178, Statics.field661))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ah.co(Ljava/lang/String;I)V")
    public static final void method884(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field736 < 200 || field528 == 1) || field736 >= 400) {
            method1557(0, "", class135.field2246);
            return;
        }
        String var1 = class149.method2249(arg0, Statics.field661);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field736; var2++) {
            class23 var3 = field738[var2];
            String var4 = class149.method2249(var3.field380, Statics.field661);
            if (var4 != null && var4.equals(var1)) {
                method1557(0, "", arg0 + class135.field2247);
                return;
            }
            if (var3.field369 != null) {
                String var5 = class149.method2249(var3.field369, Statics.field661);
                if (var5 != null && var5.equals(var1)) {
                    method1557(0, "", arg0 + class135.field2247);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field493; var6++) {
            class11 var7 = field741[var6];
            String var8 = class149.method2249(var7.field185, Statics.field661);
            if (var8 != null && var8.equals(var1)) {
                method1557(0, "", class135.field2252 + arg0 + class135.field2253);
                return;
            }
            if (var7.field178 != null) {
                String var9 = class149.method2249(var7.field178, Statics.field661);
                if (var9 != null && var9.equals(var1)) {
                    method1557(0, "", class135.field2252 + arg0 + class135.field2253);
                    return;
                }
            }
        }
        if (class149.method2249(Statics.field461.field45, Statics.field661).equals(var1)) {
            method1557(0, "", class135.field2111);
        } else {
            field605.method2360(49);
            field605.method2485(class127.method2082(arg0));
            field605.method2502(arg0);
        }
    }

    @ObfuscatedName("dj.dv(Ljava/lang/String;ZB)V")
    public static final void method2269(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field493 < 100 || field528 == 1) || field493 >= 400) {
            method1557(0, "", class135.field2248);
            return;
        }
        String var2 = class149.method2249(arg0, Statics.field661);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field493; var3++) {
            class11 var4 = field741[var3];
            String var5 = class149.method2249(var4.field185, Statics.field661);
            if (var5 != null && var5.equals(var2)) {
                method1557(0, "", arg0 + class135.field2249);
                return;
            }
            if (var4.field178 != null) {
                String var6 = class149.method2249(var4.field178, Statics.field661);
                if (var6 != null && var6.equals(var2)) {
                    method1557(0, "", arg0 + class135.field2249);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field736; var7++) {
            class23 var8 = field738[var7];
            String var9 = class149.method2249(var8.field380, Statics.field661);
            if (var9 != null && var9.equals(var2)) {
                method1557(0, "", class135.field2326 + arg0 + class135.field2255);
                return;
            }
            if (var8.field369 != null) {
                String var10 = class149.method2249(var8.field369, Statics.field661);
                if (var10 != null && var10.equals(var2)) {
                    method1557(0, "", class135.field2326 + arg0 + class135.field2255);
                    return;
                }
            }
        }
        if (class149.method2249(Statics.field461.field45, Statics.field661).equals(var2)) {
            method1557(0, "", class135.field2251);
        } else {
            field605.method2360(187);
            field605.method2485(class127.method2082(arg0));
            field605.method2502(arg0);
        }
    }

    @ObfuscatedName("di.dc(Ljava/lang/String;B)V")
    public static final void method2253(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method2249(arg0, Statics.field661);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field493; var2++) {
            class11 var3 = field741[var2];
            String var4 = var3.field185;
            String var5 = class149.method2249(var4, Statics.field661);
            if (class137.method821(arg0, var1, var4, var5)) {
                field493--;
                for (int var6 = var2; var6 < field493; var6++) {
                    field741[var6] = field741[var6 + 1];
                }
                field675 = field667;
                field605.method2360(9);
                field605.method2485(class127.method2082(arg0));
                field605.method2502(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("n.dm(Ljava/lang/String;I)V")
    public static final void method112(String arg0) {
        if (!arg0.equals("")) {
            field605.method2360(27);
            field605.method2485(class127.method2082(arg0));
            field605.method2502(arg0);
        }
    }

    @ObfuscatedName("bp.dl(II)V")
    public static void method1560(int arg0) {
        for (class171 var1 = (class171) field684.method3352(); var1 != null; var1 = (class171) field684.method3353()) {
            if ((long) arg0 == (var1.field2823 >> 48 & 0xFFFFL)) {
                var1.method3404();
            }
        }
    }

    @ObfuscatedName("dw.di(Lfn;I)I")
    public static int method2492(class159 arg0) {
        class171 var1 = (class171) field684.method3354(((long) arg0.field2676 << 32) + (long) arg0.field2607);
        return var1 == null ? arg0.field2665 : var1.field2806;
    }

    @ObfuscatedName("u.dn(Lfn;II)Ljava/lang/String;")
    public static String method164(class159 arg0, int arg1) {
        if (!class163.method170(method2492(arg0), arg1) && arg0.field2681 == null) {
            return null;
        } else if (arg0.field2667 == null || arg0.field2667.length <= arg1 || arg0.field2667[arg1] == null || arg0.field2667[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2667[arg1];
        }
    }
}

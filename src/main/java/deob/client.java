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
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.v")
    public static boolean field493 = true;

    @ObfuscatedName("client.g")
    public static int field494 = 1;

    @ObfuscatedName("client.u")
    public static int field619 = 0;

    @ObfuscatedName("client.a")
    public static int field496 = 0;

    @ObfuscatedName("client.m")
    public static boolean field602 = false;

    @ObfuscatedName("client.s")
    public static boolean field499 = false;

    @ObfuscatedName("client.j")
    public static int field623 = 0;

    @ObfuscatedName("client.n")
    public static int field501 = 0;

    @ObfuscatedName("client.z")
    public static boolean field502 = true;

    @ObfuscatedName("client.d")
    public static int field503 = 0;

    @ObfuscatedName("client.f")
    public static long field713 = -1L;

    @ObfuscatedName("client.r")
    public static int field559 = -1;

    @ObfuscatedName("client.k")
    public static int field506 = -1;

    @ObfuscatedName("client.w")
    public static class130[] field551 = new class130[4];

    @ObfuscatedName("client.e")
    public static int field507 = -1;

    @ObfuscatedName("client.p")
    public static boolean field508 = true;

    @ObfuscatedName("client.i")
    public static boolean field688 = false;

    @ObfuscatedName("client.ap")
    public static int field660 = 0;

    @ObfuscatedName("client.as")
    public static int field633 = 0;

    @ObfuscatedName("client.ak")
    public static int field512 = 0;

    @ObfuscatedName("client.af")
    public static int field513 = 0;

    @ObfuscatedName("client.ag")
    public static int field514 = 0;

    @ObfuscatedName("client.aj")
    public static int field611 = 0;

    @ObfuscatedName("client.ac")
    public static int field638 = 0;

    @ObfuscatedName("client.an")
    public static int field517 = 0;

    @ObfuscatedName("client.ad")
    public static int field753 = 0;

    @ObfuscatedName("client.ai")
    public static class127 field635 = new class127(new byte[5000]);

    @ObfuscatedName("client.ax")
    public static int field520 = 0;

    @ObfuscatedName("client.ao")
    public static int field521 = 0;

    @ObfuscatedName("client.aa")
    public static int field522 = 0;

    @ObfuscatedName("client.bo")
    public static int field498 = 0;

    @ObfuscatedName("client.bg")
    public static int field646 = 0;

    @ObfuscatedName("client.bs")
    public static int field525 = 0;

    @ObfuscatedName("client.bc")
    public static int field526 = 0;

    @ObfuscatedName("client.bv")
    public static int field527 = 0;

    @ObfuscatedName("client.br")
    public static class25[] field529 = new class25[32768];

    @ObfuscatedName("client.bh")
    public static int field530 = 0;

    @ObfuscatedName("client.bq")
    public static int[] field531 = new int[32768];

    @ObfuscatedName("client.cf")
    public static class116 field504 = new class116(5000);

    @ObfuscatedName("client.cr")
    public static class116 field533 = new class116(5000);

    @ObfuscatedName("client.cy")
    public static class116 field534 = new class116(5000);

    @ObfuscatedName("client.cq")
    public static int field535 = 0;

    @ObfuscatedName("client.cj")
    public static int field536 = 0;

    @ObfuscatedName("client.cd")
    public static int field537 = 0;

    @ObfuscatedName("client.cw")
    public static int field538 = 0;

    @ObfuscatedName("client.ch")
    public static int field518 = 0;

    @ObfuscatedName("client.ci")
    public static int field540 = 0;

    @ObfuscatedName("client.cx")
    public static int field708 = 0;

    @ObfuscatedName("client.ct")
    public static int field542 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field543 = false;

    @ObfuscatedName("client.cv")
    public static int field710 = 0;

    @ObfuscatedName("client.cp")
    public static int field545 = 0;

    @ObfuscatedName("client.cg")
    public static int field546 = 1;

    @ObfuscatedName("client.du")
    public static int field723 = 0;

    @ObfuscatedName("client.dh")
    public static int field511 = 1;

    @ObfuscatedName("client.dv")
    public static int field549 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field552 = false;

    @ObfuscatedName("client.dm")
    public static int[][][] field553 = new int[4][13][13];

    @ObfuscatedName("client.dq")
    public static final int[] field554 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dn")
    public static int field555 = 0;

    @ObfuscatedName("client.dx")
    public static int field678 = 2;

    @ObfuscatedName("client.dd")
    public static int field557 = 0;

    @ObfuscatedName("client.dw")
    public static int field558 = 2;

    @ObfuscatedName("client.df")
    public static int field720 = 0;

    @ObfuscatedName("client.db")
    public static int field560 = 1;

    @ObfuscatedName("client.dj")
    public static int field561 = 0;

    @ObfuscatedName("client.dg")
    public static int field562 = 0;

    @ObfuscatedName("client.dy")
    public static int field563 = 2;

    @ObfuscatedName("client.dk")
    public static int field491 = 0;

    @ObfuscatedName("client.dp")
    public static int field565 = 1;

    @ObfuscatedName("client.ea")
    public static int field566 = 0;

    @ObfuscatedName("client.ev")
    public static int field567 = 0;

    @ObfuscatedName("client.eg")
    public static int field571 = 2301979;

    @ObfuscatedName("client.em")
    public static int field569 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field609 = 3353893;

    @ObfuscatedName("client.ep")
    public static int field570 = 7759444;

    @ObfuscatedName("client.eq")
    public static boolean field572 = false;

    @ObfuscatedName("client.en")
    public static int field573 = 0;

    @ObfuscatedName("client.fg")
    public static int field748 = 128;

    @ObfuscatedName("client.fp")
    public static int field575 = 0;

    @ObfuscatedName("client.fl")
    public static int field576 = 0;

    @ObfuscatedName("client.fx")
    public static int field523 = 0;

    @ObfuscatedName("client.fw")
    public static int field578 = 0;

    @ObfuscatedName("client.fj")
    public static int field579 = 0;

    @ObfuscatedName("client.fo")
    public static int field580 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field581 = false;

    @ObfuscatedName("client.fu")
    public static int field582 = 0;

    @ObfuscatedName("client.fh")
    public static int field583 = 0;

    @ObfuscatedName("client.fb")
    public static int field584 = 50;

    @ObfuscatedName("client.fc")
    public static int[] field585 = new int[field584];

    @ObfuscatedName("client.fa")
    public static int[] field586 = new int[field584];

    @ObfuscatedName("client.fk")
    public static int[] field587 = new int[field584];

    @ObfuscatedName("client.fs")
    public static int[] field588 = new int[field584];

    @ObfuscatedName("client.fr")
    public static int[] field607 = new int[field584];

    @ObfuscatedName("client.fv")
    public static int[] field505 = new int[field584];

    @ObfuscatedName("client.fd")
    public static int[] field591 = new int[field584];

    @ObfuscatedName("client.fn")
    public static String[] field592 = new String[field584];

    @ObfuscatedName("client.ge")
    public static int[][] field668 = new int[104][104];

    @ObfuscatedName("client.gy")
    public static int field594 = 0;

    @ObfuscatedName("client.gr")
    public static int field595 = -1;

    @ObfuscatedName("client.gl")
    public static int field596 = -1;

    @ObfuscatedName("client.gd")
    public static int field597 = 0;

    @ObfuscatedName("client.gv")
    public static int field598 = 0;

    @ObfuscatedName("client.gx")
    public static int field599 = 0;

    @ObfuscatedName("client.gb")
    public static int field600 = 0;

    @ObfuscatedName("client.gq")
    public static int field601 = 0;

    @ObfuscatedName("client.gc")
    public static int field590 = 0;

    @ObfuscatedName("client.gh")
    public static int field603 = 0;

    @ObfuscatedName("client.gt")
    public static int field605 = 0;

    @ObfuscatedName("client.gs")
    public static int field500 = 0;

    @ObfuscatedName("client.gn")
    public static int field606 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field532 = false;

    @ObfuscatedName("client.gf")
    public static int field608 = 0;

    @ObfuscatedName("client.gz")
    public static int field574 = 0;

    @ObfuscatedName("client.gm")
    public static class3[] field610 = new class3[2048];

    @ObfuscatedName("client.go")
    public static int field516 = 0;

    @ObfuscatedName("client.gg")
    public static int[] field738 = new int[2048];

    @ObfuscatedName("client.gi")
    public static int field667 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field614 = new int[2048];

    @ObfuscatedName("client.hf")
    public static class127[] field615 = new class127[2048];

    @ObfuscatedName("client.hs")
    public static int field616 = -1;

    @ObfuscatedName("client.he")
    public static int field617 = 0;

    @ObfuscatedName("client.ho")
    public static int field618 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field747 = new int[1000];

    @ObfuscatedName("client.hl")
    public static final int[] field620 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field621 = new String[8];

    @ObfuscatedName("client.ha")
    public static boolean[] field622 = new boolean[8];

    @ObfuscatedName("client.hn")
    public static int[] field716 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static class177[][][] field624 = new class177[4][104][104];

    @ObfuscatedName("client.hr")
    public static class177 field625 = new class177();

    @ObfuscatedName("client.hc")
    public static class177 field717 = new class177();

    @ObfuscatedName("client.hj")
    public static class177 field627 = new class177();

    @ObfuscatedName("client.hh")
    public static int[] field628 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field629 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field630 = new int[25];

    @ObfuscatedName("client.hx")
    public static int field631 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field743 = false;

    @ObfuscatedName("client.ik")
    public static int field676 = 0;

    @ObfuscatedName("client.il")
    public static int[] field634 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field492 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field564 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field593 = new int[500];

    @ObfuscatedName("client.in")
    public static String[] field639 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field640 = new String[500];

    @ObfuscatedName("client.ic")
    public static int field641 = -1;

    @ObfuscatedName("client.ib")
    public static int field515 = -1;

    @ObfuscatedName("client.ih")
    public static int field643 = 0;

    @ObfuscatedName("client.iu")
    public static int field669 = 50;

    @ObfuscatedName("client.ir")
    public static int field709 = 0;

    @ObfuscatedName("client.it")
    public static String field736 = null;

    @ObfuscatedName("client.iz")
    public static boolean field647 = false;

    @ObfuscatedName("client.ig")
    public static int field649 = -1;

    @ObfuscatedName("client.iw")
    public static String field556 = null;

    @ObfuscatedName("client.iq")
    public static String field650 = null;

    @ObfuscatedName("client.io")
    public static int field727 = -1;

    @ObfuscatedName("client.ji")
    public static class175 field652 = new class175(8);

    @ObfuscatedName("client.jg")
    public static int field653 = 0;

    @ObfuscatedName("client.jo")
    public static int field654 = 0;

    @ObfuscatedName("client.je")
    public static class159 field568 = null;

    @ObfuscatedName("client.jy")
    public static int field656 = 0;

    @ObfuscatedName("client.jb")
    public static int field657 = 0;

    @ObfuscatedName("client.jp")
    public static int field658 = 0;

    @ObfuscatedName("client.jc")
    public static boolean field659 = false;

    @ObfuscatedName("client.jj")
    public static boolean field509 = false;

    @ObfuscatedName("client.jh")
    public static boolean field703 = false;

    @ObfuscatedName("client.jx")
    public static class159 field664 = null;

    @ObfuscatedName("client.jn")
    public static class159 field577 = null;

    @ObfuscatedName("client.jl")
    public static int field648 = 0;

    @ObfuscatedName("client.jv")
    public static int field663 = 0;

    @ObfuscatedName("client.jq")
    public static class159 field666 = null;

    @ObfuscatedName("client.jf")
    public static boolean field755 = false;

    @ObfuscatedName("client.jr")
    public static int field754 = -1;

    @ObfuscatedName("client.jz")
    public static int field642 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field670 = false;

    @ObfuscatedName("client.ju")
    public static int field671 = -1;

    @ObfuscatedName("client.js")
    public static int field672 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field673 = false;

    @ObfuscatedName("client.kc")
    public static int field675 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field612 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field677 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field749 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field684 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field680 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field637 = 0;

    @ObfuscatedName("client.kp")
    public static int field682 = 0;

    @ObfuscatedName("client.kj")
    public static int field683 = 0;

    @ObfuscatedName("client.ke")
    public static int field700 = 0;

    @ObfuscatedName("client.kn")
    public static int field685 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field686 = new int[2000];

    @ObfuscatedName("client.kg")
    public static String[] field687 = new String[1000];

    @ObfuscatedName("client.kt")
    public static int field692 = 0;

    @ObfuscatedName("client.km")
    public static class177 field689 = new class177();

    @ObfuscatedName("client.ko")
    public static class177 field690 = new class177();

    @ObfuscatedName("client.kf")
    public static class177 field691 = new class177();

    @ObfuscatedName("client.kw")
    public static class175 field495 = new class175(512);

    @ObfuscatedName("client.kz")
    public static int field693 = 0;

    @ObfuscatedName("client.ks")
    public static int field694 = -2;

    @ObfuscatedName("client.kh")
    public static boolean[] field695 = new boolean[100];

    @ObfuscatedName("client.ki")
    public static boolean[] field696 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field697 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static int[] field698 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field699 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field645 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field701 = new int[100];

    @ObfuscatedName("client.lf")
    public static int field702 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field655 = new int[100];

    @ObfuscatedName("client.lq")
    public static String[] field704 = new String[100];

    @ObfuscatedName("client.lz")
    public static String[] field705 = new String[100];

    @ObfuscatedName("client.le")
    public static String[] field706 = new String[100];

    @ObfuscatedName("client.lx")
    public static int field707 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field539 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lo")
    public static int field752 = 0;

    @ObfuscatedName("client.lp")
    public static int field519 = 0;

    @ObfuscatedName("client.ll")
    public static long[] field711 = new long[100];

    @ObfuscatedName("client.ls")
    public static int field712 = 0;

    @ObfuscatedName("client.lj")
    public static int field497 = 0;

    @ObfuscatedName("client.la")
    public static int[] field589 = new int[128];

    @ObfuscatedName("client.ln")
    public static int[] field715 = new int[128];

    @ObfuscatedName("client.lc")
    public static long field644 = -1L;

    @ObfuscatedName("client.lt")
    public static String field651 = null;

    @ObfuscatedName("client.lb")
    public static String field718 = null;

    @ObfuscatedName("client.mc")
    public static int field719 = -1;

    @ObfuscatedName("client.ma")
    public static int field613 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field721 = new int[1000];

    @ObfuscatedName("client.mp")
    public static int[] field722 = new int[1000];

    @ObfuscatedName("client.my")
    public static class86[] field751 = new class86[1000];

    @ObfuscatedName("client.mu")
    public static int field665 = 0;

    @ObfuscatedName("client.mi")
    public static int field725 = 0;

    @ObfuscatedName("client.mo")
    public static int field726 = 0;

    @ObfuscatedName("client.mm")
    public static int field626 = 255;

    @ObfuscatedName("client.ml")
    public static int field728 = -1;

    @ObfuscatedName("client.mz")
    public static boolean field729 = false;

    @ObfuscatedName("client.mn")
    public static int field730 = 127;

    @ObfuscatedName("client.mt")
    public static int field731 = 127;

    @ObfuscatedName("client.na")
    public static int field510 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field733 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field541 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field724 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field544 = new int[50];

    @ObfuscatedName("client.nn")
    public static class57[] field548 = new class57[50];

    @ObfuscatedName("client.nt")
    public static boolean field739 = false;

    @ObfuscatedName("client.nc")
    public static boolean[] field732 = new boolean[5];

    @ObfuscatedName("client.nd")
    public static int[] field740 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field741 = new int[5];

    @ObfuscatedName("client.nm")
    public static int[] field742 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field661 = new int[5];

    @ObfuscatedName("client.ob")
    public static int field744 = 0;

    @ObfuscatedName("client.oc")
    public static int field745 = 0;

    @ObfuscatedName("client.ov")
    public static class23[] field746 = new class23[400];

    @ObfuscatedName("client.og")
    public static class173 field632 = new class173();

    @ObfuscatedName("client.oy")
    public static int field524 = 0;

    @ObfuscatedName("client.or")
    public static class11[] field681 = new class11[400];

    @ObfuscatedName("client.of")
    public static class164 field750 = new class164();

    @ObfuscatedName("client.om")
    public static int field604 = -1;

    @ObfuscatedName("client.oj")
    public static int field679 = -1;

    @ObfuscatedName("client.q(I)V")
    public final void method247() {
    }

    public final void init() {
        if (!this.method1369()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2792, class167.field2784, class167.field2785, class167.field2786, class167.field2781, class167.field2790, class167.field2787, class167.field2783, class167.field2788, class167.field2789 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2791);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2791)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                            field602 = true;
                        } else {
                            field602 = false;
                        }
                        break;
                    case 2:
                        Statics.field1461 = class133.method1777(Integer.parseInt(var5));
                        break;
                    case 3:
                        field619 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field494 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field623 = Integer.parseInt(var5);
                        break;
                    case 6:
                        class134[] var6 = new class134[] { class134.field2113, class134.field2103, class134.field2105, class134.field2106, class134.field2110, class134.field2108 };
                        Statics.field714 = (class134) Statics.method1955(var6, Integer.parseInt(var5));
                        if (Statics.field714 == class134.field2108) {
                            Statics.field427 = class186.field2865;
                        } else {
                            Statics.field427 = class186.field2871;
                        }
                    case 7:
                    default:
                        break;
                    case 8:
                        Statics.field2737 = var5;
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                        }
                        break;
                    case 10:
                        field496 = Integer.parseInt(var5);
                }
            }
        }
        class95.field1583 = false;
        field499 = false;
        Statics.field90 = this.getCodeBase().getHost();
        String var7 = Statics.field1461.field2099;
        byte var8 = 0;
        try {
            Statics.field1444 = 16;
            Statics.field1450 = var8;
            try {
                Statics.field1312 = System.getProperty("os.name");
            } catch (Exception var22) {
                Statics.field1312 = "Unknown";
            }
            Statics.field1351 = Statics.field1312.toLowerCase();
            try {
                Statics.field1451 = System.getProperty("user.home");
                if (Statics.field1451 != null) {
                    Statics.field1451 = Statics.field1451 + "/";
                }
            } catch (Exception var21) {
            }
            try {
                if (Statics.field1351.startsWith("win")) {
                    if (Statics.field1451 == null) {
                        Statics.field1451 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1451 == null) {
                    Statics.field1451 = System.getenv("HOME");
                }
                if (Statics.field1451 != null) {
                    Statics.field1451 = Statics.field1451 + "/";
                }
            } catch (Exception var20) {
            }
            if (Statics.field1451 == null) {
                Statics.field1451 = "~/";
            }
            Statics.field367 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1451, "/tmp/", "" };
            Statics.field1058 = new String[] { ".jagex_cache_" + Statics.field1450, ".file_store_" + Statics.field1450 };
            label119: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field1452 = class82.method1305("oldschool", var7, var12);
                if (!Statics.field1452.exists()) {
                    Statics.field1452.mkdirs();
                }
                File[] var13 = Statics.field1452.listFiles();
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
                    if (!class82.method194(var16, false)) {
                        break;
                    }
                    var15++;
                }
            }
            File var17 = Statics.field1452;
            Statics.field1319 = var17;
            if (!Statics.field1319.exists()) {
                throw new RuntimeException("");
            }
            class72.field1321 = true;
            Statics.method2093();
            class82.field1448 = new class30(new class29(class72.method29("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1449 = new class30(new class29(class72.method29("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field259 = new class30[Statics.field1444];
            for (int var18 = 0; var18 < Statics.field1444; var18++) {
                Statics.field259[var18] = new class30(new class29(class72.method29("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var23) {
            class80.method789((String) null, var23);
        }
        Statics.field662 = this;
        this.method1414(765, 503, 40);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method249() {
        Statics.field1940 = field496 == 0 ? 43594 : field494 + 40000;
        Statics.field206 = field496 == 0 ? 443 : field494 + 50000;
        Statics.field365 = Statics.field1940;
        Statics.field1435 = class162.field2744;
        Statics.field2757 = class162.field2742;
        Statics.field182 = class162.field2743;
        Statics.field1248 = class162.field2745;
        class75.method1327();
        class75.method5(Statics.field1394);
        class77.method2597(Statics.field1394);
        Statics.field23 = class66.method2120();
        if (Statics.field23 != null) {
            Statics.field23.method1306(Statics.field1394);
        }
        Statics.field1828 = new class71(255, class82.field1448, class82.field1449, 500000);
        Statics.field1472 = class12.method1959();
        Statics.field265 = this.getToolkit().getSystemClipboard();
        if (field496 != 0) {
            field688 = true;
        }
    }

    @ObfuscatedName("client.g(B)V")
    public final void method290() {
        field503++;
        this.method253();
        class158.method1232();
        class139.method1960();
        method655();
        class75 var1 = class75.field1387;
        synchronized (class75.field1387) {
            class75.field1391++;
            class75.field1384 = class75.field1386;
            class75.field1383 = 0;
            if (class75.field1379 >= 0) {
                while (class75.field1379 != class75.field1375) {
                    int var3 = class75.field1377[class75.field1375];
                    class75.field1375 = class75.field1375 + 1 & 0x7F;
                    if (var3 < 0) {
                        class75.field1370[~var3] = false;
                    } else {
                        if (!class75.field1370[var3] && class75.field1383 < class75.field1374.length - 1) {
                            class75.field1374[++class75.field1383 - 1] = var3;
                        }
                        class75.field1370[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class75.field1370[var2] = false;
                }
                class75.field1379 = class75.field1375;
            }
            class75.field1386 = class75.field1385;
        }
        Statics.method1780();
        if (Statics.field23 != null) {
            int var5 = Statics.field23.method1308();
            field692 = var5;
        }
        if (field501 == 0) {
            method2227();
            class73.method3049();
        } else if (field501 == 5) {
            class21.method550(this);
            method2227();
            class73.method3049();
        } else if (field501 == 10) {
            class21.method550(this);
        } else if (field501 == 20) {
            class21.method550(this);
            method199();
        } else if (field501 == 25) {
            method2596();
        }
        if (field501 == 30) {
            method1585();
        } else if (field501 == 40 || field501 == 45) {
            method199();
        }
    }

    @ObfuscatedName("client.x(I)V")
    public final void method279() {
        boolean var1 = class139.method1233();
        if (var1 && field729 && Statics.field1244 != null) {
            Statics.field1244.method1113();
        }
        if (field1337) {
            class75.method155(Statics.field1394);
            Canvas var2 = Statics.field1394;
            var2.removeMouseListener(class77.field1398);
            var2.removeMouseMotionListener(class77.field1398);
            var2.removeFocusListener(class77.field1398);
            class77.field1416 = 0;
            if (Statics.field23 != null) {
                Statics.field23.method1314(Statics.field1394);
            }
            this.method1368();
            class75.method5(Statics.field1394);
            class77.method2597(Statics.field1394);
            if (Statics.field23 != null) {
                Statics.field23.method1306(Statics.field1394);
            }
        }
        if (field501 == 0) {
            int var3 = class21.field330;
            String var4 = class21.field331;
            Color var5 = null;
            try {
                Graphics var6 = Statics.field1394.getGraphics();
                if (Statics.field279 == null) {
                    Statics.field279 = new Font("Helvetica", 1, 13);
                    Statics.field56 = Statics.field1394.getFontMetrics(Statics.field279);
                }
                if (field1335) {
                    field1335 = false;
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, Statics.field991, Statics.field91);
                }
                if (var5 == null) {
                    var5 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field247 == null) {
                        Statics.field247 = Statics.field1394.createImage(304, 34);
                    }
                    Graphics var7 = Statics.field247.getGraphics();
                    var7.setColor(var5);
                    var7.drawRect(0, 0, 303, 33);
                    var7.fillRect(2, 2, var3 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(1, 1, 301, 31);
                    var7.fillRect(var3 * 3 + 2, 2, 300 - var3 * 3, 30);
                    var7.setFont(Statics.field279);
                    var7.setColor(Color.white);
                    var7.drawString(var4, (304 - Statics.field56.stringWidth(var4)) / 2, 22);
                    var6.drawImage(Statics.field247, Statics.field991 / 2 - 152, Statics.field91 / 2 - 18, (ImageObserver) null);
                } catch (Exception var20) {
                    int var9 = Statics.field991 / 2 - 152;
                    int var10 = Statics.field91 / 2 - 18;
                    var6.setColor(var5);
                    var6.drawRect(var9, var10, 303, 33);
                    var6.fillRect(var9 + 2, var10 + 2, var3 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var9 + 1, var10 + 1, 301, 31);
                    var6.fillRect(var3 * 3 + var9 + 2, var10 + 2, 300 - var3 * 3, 30);
                    var6.setFont(Statics.field279);
                    var6.setColor(Color.white);
                    var6.drawString(var4, var9 + (304 - Statics.field56.stringWidth(var4)) / 2, var10 + 22);
                }
            } catch (Exception var21) {
                Statics.field1394.repaint();
            }
        } else if (field501 == 5) {
            class21.method531(Statics.field216, Statics.field350);
        } else if (field501 == 10) {
            class21.method531(Statics.field216, Statics.field350);
        } else if (field501 == 20) {
            class21.method531(Statics.field216, Statics.field350);
        } else if (field501 == 25) {
            if (field549 == 1) {
                if (field545 > field546) {
                    field546 = field545;
                }
                int var12 = (field546 * 50 - field545 * 50) / field546;
                method201(class135.field2191 + class2.field21 + class2.field18 + var12 + "%" + class2.field19, false);
            } else if (field549 == 2) {
                if (field723 > field511) {
                    field511 = field723;
                }
                int var13 = (field511 * 50 - field723 * 50) / field511 + 50;
                method201(class135.field2191 + class2.field21 + class2.field18 + var13 + "%" + class2.field19, false);
            } else {
                method201(class135.field2191, false);
            }
        } else if (field501 == 30) {
            method2598();
        } else if (field501 == 40) {
            method201(class135.field2240 + class2.field21 + class135.field2140, false);
        } else if (field501 == 45) {
            method201(class135.field2264, false);
        }
        if (field501 == 30 && field702 == 0 && !field1335) {
            try {
                Graphics var14 = Statics.field1394.getGraphics();
                for (int var15 = 0; var15 < field693; var15++) {
                    if (field696[var15]) {
                        Statics.field1197.method1534(var14, field698[var15], field699[var15], field645[var15], field701[var15]);
                        field696[var15] = false;
                    }
                }
            } catch (Exception var23) {
                Statics.field1394.repaint();
            }
        } else if (field501 > 0) {
            try {
                Graphics var17 = Statics.field1394.getGraphics();
                Statics.field1197.method1533(var17, 0, 0);
                field1335 = false;
                for (int var18 = 0; var18 < field693; var18++) {
                    field696[var18] = false;
                }
            } catch (Exception var22) {
                Statics.field1394.repaint();
            }
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method479() {
        if (Statics.field1433 != null) {
            Statics.field1433.field260 = false;
        }
        Statics.field1433 = null;
        if (Statics.field347 != null) {
            Statics.field347.method1330();
            Statics.field347 = null;
        }
        class75.method243();
        if (class77.field1398 != null) {
            class77 var1 = class77.field1398;
            synchronized (class77.field1398) {
                class77.field1398 = null;
            }
        }
        Statics.field23 = null;
        if (Statics.field1244 != null) {
            Statics.field1244.method1114();
        }
        if (Statics.field1199 != null) {
            Statics.field1199.method1114();
        }
        class154.method1349();
        class158.method1964();
        class82.method778();
    }

    @ObfuscatedName("y.l(II)V")
    public static void method22(int arg0) {
        if (field501 == arg0) {
            return;
        }
        if (field501 == 0) {
            class73.method2257();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field646 = 0;
            field525 = 0;
            field526 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1340 != null) {
            Statics.field1340.method1330();
            Statics.field1340 = null;
        }
        if (field501 == 25) {
            field549 = 0;
            field545 = 0;
            field546 = 1;
            field723 = 0;
            field511 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1394;
            class155 var2 = Statics.field734;
            class155 var3 = Statics.field289;
            if (!Statics.field343) {
                class89.method1726();
                byte[] var4 = var2.method2895("title.jpg", "");
                Statics.field316 = new class86(var4, var1);
                Statics.field340 = Statics.field316.method1592();
                Statics.field255 = class84.method207(var3, "logo", "");
                Statics.field348 = class84.method207(var3, "titlebox", "");
                Statics.field314 = class84.method207(var3, "titlebutton", "");
                Statics.field323 = class84.method2112(var3, "runes", "");
                Statics.field318 = class84.method2112(var3, "title_mute", "");
                Statics.field123 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field123[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field123[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field123[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field123[var8 + 192] = 16777215;
                }
                Statics.field2779 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field2779[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field2779[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field2779[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field2779[var12 + 192] = 16777215;
                }
                Statics.field1797 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field1797[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field1797[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field1797[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field1797[var16 + 192] = 16777215;
                }
                Statics.field2054 = new int[256];
                Statics.field1458 = new int[32768];
                Statics.field282 = new int[32768];
                class21.method35((class87) null);
                Statics.field952 = new int[32768];
                Statics.field325 = new int[32768];
                class21.field332 = 0;
                class21.field336 = "";
                class21.field337 = "";
                class21.field328 = false;
                if (Statics.field1472.field192) {
                    class139.method244(2);
                } else {
                    class155 var17 = Statics.field951;
                    int var18 = var17.method2901("scape main");
                    int var19 = var17.method2948(var18, "");
                    class139.method1779(2, var17, var18, var19, 255, false);
                }
                class154.method2957(false);
                Statics.field343 = true;
                Statics.field316.method1678(0, 0);
                Statics.field340.method1678(382, 0);
                Statics.field255.method1693(382 - Statics.field255.field1503 / 2, 18);
            }
        } else {
            class21.method150();
        }
        field501 = arg0;
    }

    @ObfuscatedName("client.a(I)V")
    public void method253() {
        if (field501 == 1000) {
            return;
        }
        long var1 = class121.method2119();
        int var3 = (int) (var1 - Statics.field2567);
        Statics.field2567 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class154.field2547 += var3;
        boolean var4;
        if (class154.field2557 == 0 && class154.field2552 == 0 && class154.field2549 == 0 && class154.field2550 == 0) {
            var4 = true;
        } else if (Statics.field2556 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class154.field2547 > 30000) {
                        throw new IOException();
                    }
                    while (class154.field2552 < 20 && class154.field2550 > 0) {
                        class156 var5 = (class156) class154.field2563.method3155();
                        class127 var6 = new class127(4);
                        var6.method2333(1);
                        var6.method2406((int) var5.field2824);
                        Statics.field2556.method1347(var6.field2057, 0, 4);
                        class154.field2566.method3136(var5, var5.field2824);
                        class154.field2550--;
                        class154.field2552++;
                    }
                    while (class154.field2557 < 20 && class154.field2549 > 0) {
                        class156 var7 = (class156) class154.field2553.method3109();
                        class127 var8 = new class127(4);
                        var8.method2333(0);
                        var8.method2406((int) var7.field2824);
                        Statics.field2556.method1347(var8.field2057, 0, 4);
                        var7.method3133();
                        class154.field2554.method3136(var7, var7.field2824);
                        class154.field2549--;
                        class154.field2557++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2556.method1332();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class154.field2547 = 0;
                        byte var11 = 0;
                        if (Statics.field2559 == null) {
                            var11 = 8;
                        } else if (class154.field2561 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class154.field2560.field2052;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2556.method1340(class154.field2560.field2057, class154.field2560.field2052, var12);
                            if (class154.field2564 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class154.field2560.field2057[class154.field2560.field2052 + var13] ^= class154.field2564;
                                }
                            }
                            class154.field2560.field2052 += var12;
                            if (class154.field2560.field2052 < var11) {
                                break;
                            }
                            if (Statics.field2559 == null) {
                                class154.field2560.field2052 = 0;
                                int var14 = class154.field2560.method2383();
                                int var15 = class154.field2560.method2327();
                                int var16 = class154.field2560.method2383();
                                int var17 = class154.field2560.method2323();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class154.field2566.method3138(var18);
                                Statics.field2558 = true;
                                if (var20 == null) {
                                    var20 = (class156) class154.field2554.method3138(var18);
                                    Statics.field2558 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2559 = var20;
                                Statics.field92 = new class127(var17 + var21 + Statics.field2559.field2588);
                                Statics.field92.method2333(var16);
                                Statics.field92.method2307(var17);
                                class154.field2561 = 8;
                                class154.field2560.field2052 = 0;
                            } else if (class154.field2561 == 0) {
                                if (class154.field2560.field2057[0] == -1) {
                                    class154.field2561 = 1;
                                    class154.field2560.field2052 = 0;
                                } else {
                                    Statics.field2559 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field92.field2057.length - Statics.field2559.field2588;
                            int var23 = 512 - class154.field2561;
                            if (var23 > var22 - Statics.field92.field2052) {
                                var23 = var22 - Statics.field92.field2052;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2556.method1340(Statics.field92.field2057, Statics.field92.field2052, var23);
                            if (class154.field2564 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field92.field2057[Statics.field92.field2052 + var24] ^= class154.field2564;
                                }
                            }
                            Statics.field92.field2052 += var23;
                            class154.field2561 += var23;
                            if (Statics.field92.field2052 == var22) {
                                if (Statics.field2559.field2824 == 16711935L) {
                                    Statics.field1396 = Statics.field92;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class155 var26 = class154.field2551[var25];
                                        if (var26 != null) {
                                            Statics.field1396.field2052 = var25 * 8 + 5;
                                            int var27 = Statics.field1396.method2323();
                                            int var28 = Statics.field1396.method2323();
                                            var26.method2975(var27, var28);
                                        }
                                    }
                                } else {
                                    class154.field2562.reset();
                                    class154.field2562.update(Statics.field92.field2057, 0, var22);
                                    int var29 = (int) class154.field2562.getValue();
                                    if (Statics.field2559.field2585 != var29) {
                                        try {
                                            Statics.field2556.method1330();
                                        } catch (Exception var35) {
                                        }
                                        class154.field2565++;
                                        Statics.field2556 = null;
                                        class154.field2564 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class154.field2565 = 0;
                                    class154.field2548 = 0;
                                    Statics.field2559.field2586.method2976((int) (Statics.field2559.field2824 & 0xFFFFL), Statics.field92.field2057, (Statics.field2559.field2824 & 0xFF0000L) == 16711680L, Statics.field2558);
                                }
                                Statics.field2559.method3196();
                                if (Statics.field2558) {
                                    class154.field2552--;
                                } else {
                                    class154.field2557--;
                                }
                                class154.field2561 = 0;
                                Statics.field2559 = null;
                                Statics.field92 = null;
                            } else {
                                if (class154.field2561 != 512) {
                                    break;
                                }
                                class154.field2561 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2556.method1330();
                } catch (Exception var34) {
                }
                class154.field2548++;
                Statics.field2556 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method254();
        }
    }

    @ObfuscatedName("client.h(I)V")
    public void method254() {
        if (class154.field2565 >= 4) {
            this.method1417("js5crc");
            field501 = 1000;
            return;
        }
        if (class154.field2548 >= 4) {
            if (field501 <= 5) {
                this.method1417("js5io");
                field501 = 1000;
                return;
            }
            field522 = 3000;
            class154.field2548 = 3;
        }
        if (--field522 + 1 > 0) {
            return;
        }
        try {
            if (field521 == 0) {
                Statics.field413 = Statics.field271.method1428(Statics.field90, Statics.field365);
                field521++;
            }
            if (field521 == 1) {
                if (Statics.field413.field1423 == 2) {
                    this.method255(-1);
                    return;
                }
                if (Statics.field413.field1423 == 1) {
                    field521++;
                }
            }
            if (field521 == 2) {
                Statics.field294 = new class70((Socket) Statics.field413.field1427, Statics.field271);
                class127 var1 = new class127(5);
                var1.method2333(15);
                var1.method2307(40);
                Statics.field294.method1347(var1.field2057, 0, 5);
                field521++;
                Statics.field193 = class121.method2119();
            }
            if (field521 == 3) {
                if (field501 <= 5 || Statics.field294.method1332() > 0) {
                    int var2 = Statics.field294.method1331();
                    if (var2 != 0) {
                        this.method255(var2);
                        return;
                    }
                    field521++;
                } else if (class121.method2119() - Statics.field193 > 30000L) {
                    this.method255(-2);
                    return;
                }
            }
            if (field521 == 4) {
                class70 var3 = Statics.field294;
                boolean var4 = field501 > 20;
                if (Statics.field2556 != null) {
                    try {
                        Statics.field2556.method1330();
                    } catch (Exception var14) {
                    }
                    Statics.field2556 = null;
                }
                Statics.field2556 = var3;
                class154.method2957(var4);
                class154.field2560.field2052 = 0;
                Statics.field2559 = null;
                Statics.field92 = null;
                class154.field2561 = 0;
                while (true) {
                    class156 var6 = (class156) class154.field2566.method3155();
                    if (var6 == null) {
                        while (true) {
                            class156 var7 = (class156) class154.field2554.method3155();
                            if (var7 == null) {
                                if (class154.field2564 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2333(4);
                                        var8.method2333(class154.field2564);
                                        var8.method2306(0);
                                        Statics.field2556.method1347(var8.field2057, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2556.method1330();
                                        } catch (Exception var12) {
                                        }
                                        class154.field2548++;
                                        Statics.field2556 = null;
                                    }
                                }
                                class154.field2547 = 0;
                                Statics.field2567 = class121.method2119();
                                Statics.field413 = null;
                                Statics.field294 = null;
                                field521 = 0;
                                field498 = 0;
                                return;
                            }
                            class154.field2553.method3108(var7);
                            class154.field2546.method3136(var7, var7.field2824);
                            class154.field2549++;
                            class154.field2557--;
                        }
                    }
                    class154.field2563.method3136(var6, var6.field2824);
                    class154.field2550++;
                    class154.field2552--;
                }
            }
        } catch (IOException var15) {
            this.method255(-3);
        }
    }

    @ObfuscatedName("client.t(IB)V")
    public void method255(int arg0) {
        Statics.field413 = null;
        Statics.field294 = null;
        field521 = 0;
        if (Statics.field365 == Statics.field1940) {
            Statics.field365 = Statics.field206;
        } else {
            Statics.field365 = Statics.field1940;
        }
        field498++;
        if (field498 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field501 <= 5) {
                this.method1417("js5connect_full");
                field501 = 1000;
            } else {
                field522 = 3000;
            }
        } else if (field498 >= 2 && arg0 == 6) {
            this.method1417("js5connect_outofdate");
            field501 = 1000;
        } else if (field498 >= 4) {
            if (field501 <= 5) {
                this.method1417("js5connect");
                field501 = 1000;
            } else {
                field522 = 3000;
            }
        }
    }

    @ObfuscatedName("dm.m(B)V")
    public static void method2227() {
        if (field520 == 0) {
            Statics.field550 = new class95(4, 104, 104, class9.field150);
            for (int var0 = 0; var0 < 4; var0++) {
                field551[var0] = new class130(104, 104);
            }
            Statics.field210 = new class86(512, 512);
            class21.field331 = class135.field2125;
            class21.field330 = 5;
            field520 = 20;
        } else if (field520 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1776[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1845(var1, 500, 800, 512, 334);
            class21.field331 = class135.field2126;
            class21.field330 = 10;
            field520 = 30;
        } else if (field520 == 30) {
            Statics.field818 = method129(0, false, true, true);
            Statics.field1672 = method129(1, false, true, true);
            Statics.field248 = method129(2, true, false, true);
            Statics.field973 = method129(3, false, true, true);
            Statics.field770 = method129(4, false, true, true);
            Statics.field2801 = method129(5, true, true, true);
            Statics.field951 = method129(6, true, true, false);
            Statics.field213 = method129(7, false, true, true);
            Statics.field289 = method129(8, false, true, true);
            Statics.field291 = method129(9, false, true, true);
            Statics.field734 = method129(10, false, true, true);
            Statics.field1867 = method129(11, false, true, true);
            Statics.field896 = method129(12, false, true, true);
            Statics.field283 = method129(13, true, false, true);
            Statics.field71 = method129(14, false, true, false);
            Statics.field764 = method129(15, false, true, true);
            class21.field331 = class135.field2127;
            class21.field330 = 20;
            field520 = 40;
        } else if (field520 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field818.method2974() * 4 / 100;
            int var8 = var7 + Statics.field1672.method2974() * 4 / 100;
            int var9 = var8 + Statics.field248.method2974() * 2 / 100;
            int var10 = var9 + Statics.field973.method2974() * 2 / 100;
            int var11 = var10 + Statics.field770.method2974() * 6 / 100;
            int var12 = var11 + Statics.field2801.method2974() * 4 / 100;
            int var13 = var12 + Statics.field951.method2974() * 2 / 100;
            int var14 = var13 + Statics.field213.method2974() * 60 / 100;
            int var15 = var14 + Statics.field289.method2974() * 2 / 100;
            int var16 = var15 + Statics.field291.method2974() * 2 / 100;
            int var17 = var16 + Statics.field734.method2974() * 2 / 100;
            int var18 = var17 + Statics.field1867.method2974() * 2 / 100;
            int var19 = var18 + Statics.field896.method2974() * 2 / 100;
            int var20 = var19 + Statics.field283.method2974() * 2 / 100;
            int var21 = var20 + Statics.field71.method2974() * 2 / 100;
            int var22 = var21 + Statics.field764.method2974() * 2 / 100;
            if (var22 == 100) {
                class21.field331 = class135.field2129;
                class21.field330 = 30;
                field520 = 45;
            } else {
                if (var22 != 0) {
                    class21.field331 = class135.field2128 + var22 + "%";
                }
                class21.field330 = 30;
            }
        } else if (field520 == 45) {
            class52.method53(22050, !field499, 2);
            class142 var23 = new class142();
            var23.method2647(9, 128);
            Statics.field1244 = class52.method1530(Statics.field271, Statics.field1394, 0, 22050);
            Statics.field1244.method1111(var23);
            class155 var24 = Statics.field764;
            class155 var25 = Statics.field71;
            class155 var26 = Statics.field770;
            Statics.field1289 = var24;
            Statics.field2381 = var25;
            Statics.field2377 = var26;
            Statics.field409 = var23;
            Statics.field1199 = class52.method1530(Statics.field271, Statics.field1394, 1, 2048);
            Statics.field113 = new class46();
            Statics.field1199.method1111(Statics.field113);
            Statics.field737 = new class62(22050, Statics.field1118);
            class21.field331 = class135.field2130;
            class21.field330 = 35;
            field520 = 50;
        } else if (field520 == 50) {
            int var27 = 0;
            if (Statics.field350 == null) {
                class155 var28 = Statics.field289;
                class155 var29 = Statics.field283;
                int var30 = var28.method2901("p11_full");
                int var31 = var28.method2948(var30, "");
                class183 var32;
                if (class84.method1961(var28, var30, var31)) {
                    var32 = class84.method54(var29.method2886(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field350 = var32;
            } else {
                var27++;
            }
            if (Statics.field2582 == null) {
                class155 var34 = Statics.field289;
                class155 var35 = Statics.field283;
                int var36 = var34.method2901("p12_full");
                int var37 = var34.method2948(var36, "");
                class183 var38;
                if (class84.method1961(var34, var36, var37)) {
                    var38 = class84.method54(var35.method2886(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field2582 = var38;
            } else {
                var27++;
            }
            if (Statics.field216 == null) {
                class155 var40 = Statics.field289;
                class155 var41 = Statics.field283;
                int var42 = var40.method2901("b12_full");
                int var43 = var40.method2948(var42, "");
                class183 var44;
                if (class84.method1961(var40, var42, var43)) {
                    var44 = class84.method54(var41.method2886(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field216 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field331 = class135.field2131 + var27 * 100 / 3 + "%";
                class21.field330 = 40;
            } else {
                Statics.field1224 = new class152(true);
                class21.field331 = class135.field2132;
                class21.field330 = 40;
                field520 = 60;
            }
        } else if (field520 == 60) {
            class155 var46 = Statics.field734;
            class155 var47 = Statics.field289;
            int var48 = 0;
            if (var46.method2902("title.jpg", "")) {
                var48++;
            }
            if (var47.method2902("logo", "")) {
                var48++;
            }
            if (var47.method2902("titlebox", "")) {
                var48++;
            }
            if (var47.method2902("titlebutton", "")) {
                var48++;
            }
            if (var47.method2902("runes", "")) {
                var48++;
            }
            if (var47.method2902("title_mute", "")) {
                var48++;
            }
            var47.method2902("sl_back", "");
            var47.method2902("sl_flags", "");
            var47.method2902("sl_arrows", "");
            var47.method2902("sl_stars", "");
            var47.method2902("sl_button", "");
            byte var51 = 6;
            if (var48 < var51) {
                class21.field331 = class135.field2133 + var48 * 100 / var51 + "%";
                class21.field330 = 50;
            } else {
                class21.field331 = class135.field2313;
                class21.field330 = 50;
                method22(5);
                field520 = 70;
            }
        } else if (field520 == 70) {
            if (Statics.field248.method2896()) {
                class155 var53 = Statics.field248;
                Statics.field957 = var53;
                class155 var54 = Statics.field248;
                Statics.field885 = var54;
                class155 var55 = Statics.field248;
                class155 var56 = Statics.field213;
                Statics.field948 = var55;
                Statics.field938 = var56;
                Statics.field939 = Statics.field948.method2956(3);
                class32.method726(Statics.field248, Statics.field213, field499);
                class31.method211(Statics.field248, Statics.field213);
                class40.method51(Statics.field248, Statics.field213, field602, Statics.field350);
                class34.method1180(Statics.field248, Statics.field818, Statics.field1672);
                class155 var57 = Statics.field248;
                class155 var58 = Statics.field213;
                Statics.field929 = var57;
                Statics.field921 = var58;
                class155 var59 = Statics.field248;
                Statics.field1534 = var59;
                class155 var60 = Statics.field248;
                Statics.field1059 = var60;
                Statics.field2479 = Statics.field1059.method2956(16);
                class159.method2754(Statics.field973, Statics.field213, Statics.field289, Statics.field283);
                class155 var61 = Statics.field248;
                Statics.field1048 = var61;
                class155 var62 = Statics.field248;
                Statics.field983 = var62;
                class21.field331 = class135.field2187;
                class21.field330 = 60;
                field520 = 80;
            } else {
                class21.field331 = class135.field2298 + Statics.field248.method2980() + "%";
                class21.field330 = 60;
            }
        } else if (field520 == 80) {
            int var63 = 0;
            if (Statics.field217 == null) {
                Statics.field217 = class84.method204(Statics.field289, "compass", "");
            } else {
                var63++;
            }
            if (Statics.field874 == null) {
                Statics.field874 = class84.method204(Statics.field289, "mapedge", "");
            } else {
                var63++;
            }
            if (Statics.field1830 == null) {
                Statics.field1830 = class84.method2112(Statics.field289, "mapscene", "");
            } else {
                var63++;
            }
            if (Statics.field75 == null) {
                Statics.field75 = class84.method2998(Statics.field289, "mapfunction", "");
            } else {
                var63++;
            }
            if (Statics.field1809 == null) {
                Statics.field1809 = class84.method2998(Statics.field289, "hitmarks", "");
            } else {
                var63++;
            }
            if (Statics.field1995 == null) {
                Statics.field1995 = class84.method2998(Statics.field289, "headicons_pk", "");
            } else {
                var63++;
            }
            if (Statics.field305 == null) {
                Statics.field305 = class84.method2998(Statics.field289, "headicons_prayer", "");
            } else {
                var63++;
            }
            if (Statics.field228 == null) {
                Statics.field228 = class84.method2998(Statics.field289, "headicons_hint", "");
            } else {
                var63++;
            }
            if (Statics.field34 == null) {
                Statics.field34 = class84.method2998(Statics.field289, "mapmarker", "");
            } else {
                var63++;
            }
            if (Statics.field402 == null) {
                Statics.field402 = class84.method2998(Statics.field289, "cross", "");
            } else {
                var63++;
            }
            if (Statics.field1414 == null) {
                Statics.field1414 = class84.method2998(Statics.field289, "mapdots", "");
            } else {
                var63++;
            }
            if (Statics.field1759 == null) {
                Statics.field1759 = class84.method2112(Statics.field289, "scrollbar", "");
            } else {
                var63++;
            }
            if (Statics.field2011 == null) {
                Statics.field2011 = class84.method2112(Statics.field289, "mod_icons", "");
            } else {
                var63++;
            }
            if (Statics.field64 == null) {
                Statics.field64 = class84.method207(Statics.field289, "mapback", "");
            } else {
                var63++;
            }
            if (var63 < 14) {
                class21.field331 = class135.field2137 + var63 * 100 / 14 + "%";
                class21.field330 = 70;
            } else {
                Statics.field2852 = Statics.field2011;
                Statics.field874.method1595();
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 41.0D) - 20;
                for (int var68 = 0; var68 < Statics.field75.length; var68++) {
                    Statics.field75[var68].method1605(var64 + var67, var65 + var67, var66 + var67);
                }
                Statics.field1830[0].method1692(var64 + var67, var65 + var67, var66 + var67);
                Statics.field1793 = new int[33];
                Statics.field1130 = new int[33];
                Statics.field110 = new int[151];
                Statics.field149 = new int[151];
                for (int var69 = 0; var69 < 33; var69++) {
                    int var70 = 999;
                    int var71 = 0;
                    for (int var72 = 0; var72 < 34; var72++) {
                        if (Statics.field64.field1505[Statics.field64.field1503 * var69 + var72] == 0) {
                            if (var70 == 999) {
                                var70 = var72;
                            }
                        } else if (var70 != 999) {
                            var71 = var72;
                            break;
                        }
                    }
                    Statics.field1793[var69] = var70;
                    Statics.field1130[var69] = var71 - var70;
                }
                for (int var73 = 5; var73 < 156; var73++) {
                    int var74 = 999;
                    int var75 = 0;
                    for (int var76 = 25; var76 < 172; var76++) {
                        if (Statics.field64.field1505[Statics.field64.field1503 * var73 + var76] == 0 && (var76 > 34 || var73 > 34)) {
                            if (var74 == 999) {
                                var74 = var76;
                            }
                        } else if (var74 != 999) {
                            var75 = var76;
                            break;
                        }
                    }
                    Statics.field110[var73 - 5] = var74 - 25;
                    Statics.field149[var73 - 5] = var75 - var74;
                }
                class21.field331 = class135.field2138;
                class21.field330 = 70;
                field520 = 90;
            }
        } else if (field520 == 90) {
            if (Statics.field291.method2896()) {
                class110 var77 = new class110(Statics.field291, Statics.field289, 20, 0.8D, field499 ? 64 : 128);
                class104.method2050(var77);
                class104.method2037(0.8D);
                class21.field331 = class135.field2177;
                class21.field330 = 90;
                field520 = 110;
            } else {
                class21.field331 = class135.field2139 + Statics.field291.method2980() + "%";
                class21.field330 = 90;
            }
        } else if (field520 == 110) {
            Statics.field1433 = new class16();
            Statics.field271.method1433(Statics.field1433, 10);
            class21.field331 = class135.field2303;
            class21.field330 = 94;
            field520 = 120;
        } else if (field520 == 120) {
            if (Statics.field734.method2902("huffman", "")) {
                class120 var78 = new class120(Statics.field734.method2895("huffman", ""));
                Statics.field2839 = var78;
                class21.field331 = class135.field2143;
                class21.field330 = 96;
                field520 = 130;
            } else {
                class21.field331 = class135.field2293 + "%";
                class21.field330 = 96;
            }
        } else if (field520 == 130) {
            if (!Statics.field973.method2896()) {
                class21.field331 = class135.field2144 + Statics.field973.method2980() * 4 / 5 + "%";
                class21.field330 = 100;
            } else if (!Statics.field896.method2896()) {
                class21.field331 = class135.field2144 + (80 + Statics.field896.method2980() / 6) + "%";
                class21.field330 = 100;
            } else if (Statics.field283.method2896()) {
                class21.field331 = class135.field2147;
                class21.field330 = 100;
                field520 = 140;
            } else {
                class21.field331 = class135.field2144 + (96 + Statics.field283.method2980() / 20) + "%";
                class21.field330 = 100;
            }
        } else if (field520 == 140) {
            method22(10);
        }
    }

    @ObfuscatedName("s.s(IZZZI)Leq;")
    public static class155 method129(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1448 != null) {
            var4 = new class71(arg0, class82.field1448, Statics.field259[arg0], 1000000);
        }
        return new class155(var4, Statics.field1828, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("k.j(B)V")
    public static final void method199() {
        try {
            if (field646 == 0) {
                if (Statics.field347 != null) {
                    Statics.field347.method1330();
                    Statics.field347 = null;
                }
                Statics.field59 = null;
                field543 = false;
                field525 = 0;
                field646 = 1;
            }
            if (field646 == 1) {
                if (Statics.field59 == null) {
                    Statics.field59 = Statics.field271.method1428(Statics.field90, Statics.field365);
                }
                if (Statics.field59.field1423 == 2) {
                    throw new IOException();
                }
                if (Statics.field59.field1423 == 1) {
                    Statics.field347 = new class70((Socket) Statics.field59.field1427, Statics.field271);
                    Statics.field59 = null;
                    field646 = 2;
                }
            }
            if (field646 == 2) {
                field504.field2052 = 0;
                field504.method2333(14);
                Statics.field347.method1347(field504.field2057, 0, 1);
                field534.field2052 = 0;
                field646 = 3;
            }
            if (field646 == 3) {
                if (Statics.field1244 != null) {
                    Statics.field1244.method1117();
                }
                if (Statics.field1199 != null) {
                    Statics.field1199.method1117();
                }
                int var0 = Statics.field347.method1331();
                if (Statics.field1244 != null) {
                    Statics.field1244.method1117();
                }
                if (Statics.field1199 != null) {
                    Statics.field1199.method1117();
                }
                if (var0 != 0) {
                    method2030(var0);
                    return;
                }
                field534.field2052 = 0;
                field646 = 5;
            }
            if (field646 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field504.field2052 = 0;
                field504.method2333(10);
                field504.method2307(var1[0]);
                field504.method2307(var1[1]);
                field504.method2307(var1[2]);
                field504.method2307(var1[3]);
                field504.method2308(0L);
                field504.method2309(class21.field337);
                field504.method2336(class6.field82, class6.field78);
                field533.field2052 = 0;
                if (field501 == 40) {
                    field533.method2333(18);
                } else {
                    field533.method2333(16);
                }
                field533.method2306(0);
                int var2 = field533.field2052;
                field533.method2307(40);
                field533.method2312(field504.field2057, 0, field504.field2052);
                int var3 = field533.field2052;
                field533.method2309(class21.field336);
                field533.method2333(field499 ? 1 : 0);
                class116 var4 = field533;
                byte[] var5 = new byte[24];
                try {
                    class82.field1440.method554(0L);
                    class82.field1440.method556(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var19) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2312(var5, 0, 24);
                class127 var9 = new class127(Statics.field1224.method2874());
                Statics.field1224.method2873(var9);
                field533.method2312(var9.field2057, 0, var9.field2057.length);
                field533.method2307(Statics.field818.field2540);
                field533.method2307(Statics.field1672.field2540);
                field533.method2307(Statics.field248.field2540);
                field533.method2307(Statics.field973.field2540);
                field533.method2307(Statics.field770.field2540);
                field533.method2307(Statics.field2801.field2540);
                field533.method2307(Statics.field951.field2540);
                field533.method2307(Statics.field213.field2540);
                field533.method2307(Statics.field289.field2540);
                field533.method2307(Statics.field291.field2540);
                field533.method2307(Statics.field734.field2540);
                field533.method2307(Statics.field1867.field2540);
                field533.method2307(Statics.field896.field2540);
                field533.method2307(Statics.field283.field2540);
                field533.method2307(Statics.field71.field2540);
                field533.method2307(Statics.field764.field2540);
                field533.method2334(var1, var3, field533.field2052);
                field533.method2314(field533.field2052 - var2);
                Statics.field347.method1347(field533.field2057, 0, field533.field2052);
                field504.method2201(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field534.method2201(var1);
                field646 = 6;
            }
            if (field646 == 6 && Statics.field347.method1332() > 0) {
                int var11 = Statics.field347.method1331();
                if (var11 == 21 && field501 == 20) {
                    field646 = 7;
                } else if (var11 == 2) {
                    field646 = 9;
                } else if (var11 == 15 && field501 == 40) {
                    method159();
                    return;
                } else if (var11 == 23 && field526 < 1) {
                    field526++;
                    field646 = 0;
                } else {
                    method2030(var11);
                    return;
                }
            }
            if (field646 == 7 && Statics.field347.method1332() > 0) {
                field527 = (Statics.field347.method1331() + 3) * 60;
                field646 = 8;
            }
            if (field646 == 8) {
                field525 = 0;
                class21.method25(class135.field2345, class135.field2281, field527 / 60 + class135.field2148);
                if (--field527 <= 0) {
                    field646 = 0;
                }
            } else {
                if (field646 == 9 && Statics.field347.method1332() >= 8) {
                    field658 = Statics.field347.method1331();
                    field659 = Statics.field347.method1331() == 1;
                    field616 = Statics.field347.method1331();
                    field616 <<= 0x8;
                    field616 += Statics.field347.method1331();
                    field617 = Statics.field347.method1331();
                    Statics.field347.method1340(field534.field2057, 0, 1);
                    field534.field2052 = 0;
                    field536 = field534.method2203();
                    Statics.field347.method1340(field534.field2057, 0, 2);
                    field534.field2052 = 0;
                    field535 = field534.method2327();
                    if (field617 == 1) {
                        try {
                            client var12 = Statics.field662;
                            JSObject.getWindow(var12).call("zap", (Object[]) null);
                        } catch (Throwable var18) {
                        }
                    } else {
                        try {
                            client var14 = Statics.field662;
                            JSObject.getWindow(var14).call("unzap", (Object[]) null);
                        } catch (Throwable var17) {
                        }
                    }
                    field646 = 10;
                }
                if (field646 != 10) {
                    field525++;
                    if (field525 > 2000) {
                        if (field526 < 1) {
                            if (Statics.field365 == Statics.field1940) {
                                Statics.field365 = Statics.field206;
                            } else {
                                Statics.field365 = Statics.field1940;
                            }
                            field526++;
                            field646 = 0;
                        } else {
                            method2030(-3);
                        }
                    }
                } else if (Statics.field347.method1332() >= field535) {
                    field534.field2052 = 0;
                    Statics.field347.method1340(field534.field2057, 0, field535);
                    method102();
                    Statics.field769 = -1;
                    Statics.method48(false);
                    field536 = -1;
                }
            }
        } catch (IOException var20) {
            if (field526 < 1) {
                if (Statics.field365 == Statics.field1940) {
                    Statics.field365 = Statics.field206;
                } else {
                    Statics.field365 = Statics.field1940;
                }
                field526++;
                field646 = 0;
            } else {
                method2030(-2);
            }
        }
    }

    @ObfuscatedName("t.b(B)V")
    public static void method102() {
        field713 = -1L;
        field507 = -1;
        Statics.field1433.field252 = 0;
        Statics.field112 = true;
        field508 = true;
        field644 = -1L;
        class182.field2838 = new class177();
        field504.field2052 = 0;
        field534.field2052 = 0;
        field536 = -1;
        field540 = -1;
        field708 = -1;
        field542 = -1;
        field537 = 0;
        field660 = 0;
        field518 = 0;
        field633 = 0;
        field676 = 0;
        field743 = false;
        class77.method202(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field706[var0] = null;
        }
        field707 = 0;
        field709 = 0;
        field647 = false;
        field510 = 0;
        field555 = (int) (Math.random() * 100.0D) - 50;
        field557 = (int) (Math.random() * 110.0D) - 55;
        field720 = (int) (Math.random() * 80.0D) - 40;
        field562 = (int) (Math.random() * 120.0D) - 60;
        field491 = (int) (Math.random() * 30.0D) - 20;
        field575 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field726 = 0;
        field719 = -1;
        field665 = 0;
        field725 = 0;
        field516 = 0;
        field530 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field610[var1] = null;
            field615[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field529[var2] = null;
        }
        Statics.field2555 = field610[2047] = new class3();
        field717.method3175();
        field627.method3175();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field624[var3][var4][var5] = null;
                }
            }
        }
        field625 = new class177();
        field745 = 0;
        field744 = 0;
        field524 = 0;
        for (int var6 = 0; var6 < Statics.field2479; var6++) {
            class42 var7 = class42.method2637(var6);
            if (var7 != null && var7.field1056 == 0) {
                class160.field2729[var6] = 0;
                class160.field2731[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field686.length; var8++) {
            field686[var8] = -1;
        }
        if (field727 != -1) {
            class159.method2852(field727);
        }
        for (class4 var9 = (class4) field652.method3155(); var9 != null; var9 = (class4) field652.method3139()) {
            method37(var9, true);
        }
        field727 = -1;
        field652 = new class175(8);
        field568 = null;
        field743 = false;
        field676 = 0;
        field750.method3061((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field621[var10] = null;
            field622[var10] = false;
        }
        class19.field290 = new class175(32);
        field502 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field695[var11] = true;
        }
        field651 = null;
        Statics.field15 = 0;
        Statics.field962 = null;
    }

    @ObfuscatedName("o.n(I)V")
    public static void method159() {
        field504.field2052 = 0;
        field534.field2052 = 0;
        field536 = -1;
        field540 = -1;
        field708 = -1;
        field542 = -1;
        field535 = 0;
        field537 = 0;
        field660 = 0;
        field676 = 0;
        field743 = false;
        field726 = 0;
        field665 = 0;
        for (int var0 = 0; var0 < field610.length; var0++) {
            if (field610[var0] != null) {
                field610[var0].field455 = -1;
            }
        }
        for (int var1 = 0; var1 < field529.length; var1++) {
            if (field529[var1] != null) {
                field529[var1].field455 = -1;
            }
        }
        class19.field290 = new class175(32);
        method22(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field695[var2] = true;
        }
    }

    @ObfuscatedName("cp.z(IB)V")
    public static void method2030(int arg0) {
        if (arg0 == -3) {
            class21.method25(class135.field2149, class135.field2150, class135.field2151);
        } else if (arg0 == -2) {
            class21.method25(class135.field2152, class135.field2344, class135.field2154);
        } else if (arg0 == -1) {
            class21.method25(class135.field2145, class135.field2156, class135.field2272);
        } else if (arg0 == 3) {
            class21.method25(class135.field2276, class135.field2159, class135.field2160);
        } else if (arg0 == 4) {
            class21.method25(class135.field2161, class135.field2162, class135.field2163);
        } else if (arg0 == 5) {
            class21.method25(class135.field2164, class135.field2165, class135.field2166);
        } else if (arg0 == 6) {
            class21.method25(class135.field2167, class135.field2168, class135.field2300);
        } else if (arg0 == 7) {
            class21.method25(class135.field2170, class135.field2115, class135.field2172);
        } else if (arg0 == 8) {
            class21.method25(class135.field2173, class135.field2279, class135.field2175);
        } else if (arg0 == 9) {
            class21.method25(class135.field2204, class135.field2328, class135.field2178);
        } else if (arg0 == 10) {
            class21.method25(class135.field2324, class135.field2180, class135.field2181);
        } else if (arg0 == 11) {
            class21.method25(class135.field2226, class135.field2183, class135.field2184);
        } else if (arg0 == 12) {
            class21.method25(class135.field2185, class135.field2186, class135.field2314);
        } else if (arg0 == 13) {
            class21.method25(class135.field2188, class135.field2189, class135.field2190);
        } else if (arg0 == 14) {
            class21.method25(class135.field2146, class135.field2192, class135.field2193);
        } else if (arg0 == 16) {
            class21.method25(class135.field2194, class135.field2195, class135.field2196);
        } else if (arg0 == 17) {
            class21.method25(class135.field2197, class135.field2157, class135.field2227);
        } else if (arg0 == 18) {
            class21.method25(class135.field2200, class135.field2201, class135.field2202);
        } else if (arg0 == 19) {
            class21.method25(class135.field2203, class135.field2153, class135.field2205);
        } else if (arg0 == 20) {
            class21.method25(class135.field2206, class135.field2207, class135.field2208);
        } else if (arg0 == 22) {
            class21.method25(class135.field2209, class135.field2210, class135.field2221);
        } else if (arg0 == 23) {
            class21.method25(class135.field2241, class135.field2312, class135.field2238);
        } else if (arg0 == 24) {
            class21.method25(class135.field2215, class135.field2216, class135.field2217);
        } else if (arg0 == 25) {
            class21.method25(class135.field2218, class135.field2219, class135.field2220);
        } else if (arg0 == 26) {
            class21.method25(class135.field2243, class135.field2222, class135.field2223);
        } else if (arg0 == 27) {
            class21.method25(class135.field2280, class135.field2325, class135.field2258);
        } else if (arg0 == 31) {
            class21.method25(class135.field2212, class135.field2228, class135.field2122);
        } else if (arg0 == 32) {
            class21.method25(class135.field2236, class135.field2237, class135.field2275);
        } else if (arg0 == 37) {
            class21.method25(class135.field2239, class135.field2320, class135.field2174);
        } else if (arg0 == 38) {
            class21.method25(class135.field2242, class135.field2284, class135.field2244);
        } else if (arg0 == 55) {
            class21.method25(class135.field2141, class135.field2246, class135.field2329);
        } else {
            class21.method25(class135.field2248, class135.field2316, class135.field2250);
        }
        method22(10);
    }

    @ObfuscatedName("cy.d(B)V")
    public static final void method1558() {
        if (Statics.field347 != null) {
            Statics.field347.method1330();
            Statics.field347 = null;
        }
        method1962();
        Statics.field550.method1786();
        for (int var0 = 0; var0 < 4; var0++) {
            field551[var0].method2553();
        }
        System.gc();
        class139.method244(2);
        field728 = -1;
        field729 = false;
        for (class7 var1 = (class7) class7.field103.method3163(); var1 != null; var1 = (class7) class7.field103.method3165()) {
            if (var1.field102 != null) {
                Statics.field113.method1063(var1.field102);
                var1.field102 = null;
            }
            if (var1.field107 != null) {
                Statics.field113.method1063(var1.field107);
                var1.field107 = null;
            }
        }
        class7.field103.method3175();
        method22(10);
    }

    @ObfuscatedName("cv.f(I)V")
    public static final void method1962() {
        class37.field954.method3093();
        class33.method57();
        class36.field940.method3093();
        class32.method1365();
        class31.field792.method3093();
        class31.field815.method3093();
        class40.field1026.method3093();
        class40.field1007.method3093();
        class40.field998.method3093();
        class34.method3050();
        class35.field922.method3093();
        class35.field923.method3093();
        class38.field971.method3093();
        class42.field1053.method3093();
        class164.method212();
        class159.field2669.method3093();
        class159.field2607.method3093();
        class159.field2637.method3093();
        ((class110) Statics.field1780).method2124();
        class5.field77.method3093();
        Statics.field818.method2899();
        Statics.field1672.method2899();
        Statics.field973.method2899();
        Statics.field770.method2899();
        Statics.field2801.method2899();
        Statics.field951.method2899();
        Statics.field213.method2899();
        Statics.field289.method2899();
        Statics.field291.method2899();
        Statics.field734.method2899();
        Statics.field1867.method2899();
        Statics.field896.method2899();
    }

    @ObfuscatedName("x.o(B)V")
    public static final void method38() {
        if (field518 > 0) {
            method1558();
        } else {
            method22(40);
            Statics.field1340 = Statics.field347;
            Statics.field347 = null;
        }
    }

    @ObfuscatedName("cq.r(B)V")
    public static final void method1585() {
        if (field660 > 1) {
            field660--;
        }
        if (field518 > 0) {
            field518--;
        }
        if (field543) {
            field543 = false;
            method38();
            return;
        }
        if (!field743) {
            field639[0] = class135.field2339;
            field640[0] = "";
            field564[0] = 1006;
            field676 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field347 == null) {
                var1 = false;
            } else {
                label2611: {
                    try {
                        int var2 = Statics.field347.method1332();
                        if (var2 == 0) {
                            var1 = false;
                            break label2611;
                        }
                        if (field536 == -1) {
                            Statics.field347.method1340(field534.field2057, 0, 1);
                            field534.field2052 = 0;
                            field536 = field534.method2203();
                            field535 = class165.field2762[field536];
                            var2--;
                        }
                        if (field535 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2611;
                            }
                            Statics.field347.method1340(field534.field2057, 0, 1);
                            field535 = field534.field2057[0] & 0xFF;
                            var2--;
                        }
                        if (field535 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2611;
                            }
                            Statics.field347.method1340(field534.field2057, 0, 2);
                            field534.field2052 = 0;
                            field535 = field534.method2327();
                            var2 -= 2;
                        }
                        if (var2 < field535) {
                            var1 = false;
                            break label2611;
                        }
                        field534.field2052 = 0;
                        Statics.field347.method1340(field534.field2057, 0, field535);
                        field537 = 0;
                        field542 = field708;
                        field708 = field540;
                        field540 = field536;
                        if (field536 == 3) {
                            field534.field2052 += 28;
                            if (field534.method2338()) {
                                class82.method1957(field534, field534.field2052 - 28);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 180) {
                            int var3 = field534.method2327();
                            field727 = var3;
                            method223(var3);
                            class26.method141(field727);
                            for (int var4 = 0; var4 < 100; var4++) {
                                field695[var4] = true;
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 20) {
                            while (field534.field2052 < field535) {
                                boolean var5 = field534.method2383() == 1;
                                String var6 = field534.method2315();
                                String var7 = field534.method2315();
                                int var8 = field534.method2327();
                                int var9 = field534.method2383();
                                int var10 = field534.method2383();
                                boolean var11 = (var10 & 0x2) != 0;
                                boolean var12 = (var10 & 0x1) != 0;
                                if (var8 > 0) {
                                    field534.method2315();
                                    field534.method2383();
                                    field534.method2323();
                                }
                                field534.method2315();
                                for (int var13 = 0; var13 < field744; var13++) {
                                    class23 var14 = field746[var13];
                                    if (var5) {
                                        if (var7.equals(var14.field383)) {
                                            var14.field383 = var6;
                                            var14.field374 = var7;
                                            var6 = null;
                                            break;
                                        }
                                    } else if (var6.equals(var14.field383)) {
                                        if (var14.field375 != var8) {
                                            boolean var15 = true;
                                            for (class28 var16 = (class28) field632.method3129(); var16 != null; var16 = (class28) field632.method3124()) {
                                                if (var16.field759.equals(var6)) {
                                                    if (var8 != 0 && var16.field757 == 0) {
                                                        var16.method3195();
                                                        var15 = false;
                                                    } else if (var8 == 0 && var16.field757 != 0) {
                                                        var16.method3195();
                                                        var15 = false;
                                                    }
                                                }
                                            }
                                            if (var15) {
                                                field632.method3123(new class28(var6, var8));
                                            }
                                            var14.field375 = var8;
                                        }
                                        var14.field374 = var7;
                                        var14.field376 = var9;
                                        var14.field377 = var11;
                                        var14.field378 = var12;
                                        var6 = null;
                                        break;
                                    }
                                }
                                if (var6 != null && field744 < 400) {
                                    class23 var17 = new class23();
                                    field746[field744] = var17;
                                    var17.field383 = var6;
                                    var17.field374 = var7;
                                    var17.field375 = var8;
                                    var17.field376 = var9;
                                    var17.field377 = var11;
                                    var17.field378 = var12;
                                    field744++;
                                }
                            }
                            field745 = 2;
                            field683 = field675;
                            boolean var18 = false;
                            int var19 = field744;
                            while (var19 > 0) {
                                boolean var20 = true;
                                var19--;
                                for (int var21 = 0; var21 < var19; var21++) {
                                    boolean var22 = false;
                                    class23 var23 = field746[var21];
                                    class23 var24 = field746[var21 + 1];
                                    if (field494 != var23.field375 && field494 == var24.field375) {
                                        var22 = true;
                                    }
                                    if (!var22 && var23.field375 == 0 && var24.field375 != 0) {
                                        var22 = true;
                                    }
                                    if (!var22 && !var23.field377 && var24.field377) {
                                        var22 = true;
                                    }
                                    if (!var22 && !var23.field378 && var24.field378) {
                                        var22 = true;
                                    }
                                    if (var22) {
                                        class23 var25 = field746[var21];
                                        field746[var21] = field746[var21 + 1];
                                        field746[var21 + 1] = var25;
                                        var20 = false;
                                    }
                                }
                                if (var20) {
                                    break;
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 21) {
                            int var26 = field534.method2361();
                            class159 var27 = class159.method1507(var26);
                            for (int var28 = 0; var28 < var27.field2713.length; var28++) {
                                var27.field2713[var28] = -1;
                                var27.field2713[var28] = 0;
                            }
                            method852(var27);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 115) {
                            method776();
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 60) {
                            boolean var29 = field534.method2515() == 1;
                            int var30 = field534.method2323();
                            class159 var31 = class159.method1507(var30);
                            if (var31.field2625 != var29) {
                                var31.field2625 = var29;
                                method852(var31);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 99) {
                            field739 = false;
                            for (int var32 = 0; var32 < 5; var32++) {
                                field732[var32] = false;
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 69) {
                            method2300();
                            field656 = field534.method2383();
                            field685 = field675;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 241) {
                            Statics.field186 = field534.method2383();
                            Statics.field351 = field534.method2454();
                            while (field534.field2052 < field535) {
                                field536 = field534.method2383();
                                method2552();
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 36) {
                            int var33 = field534.method2477();
                            class159 var34 = class159.method1507(var33);
                            var34.field2643 = 3;
                            var34.field2644 = Statics.field2555.field31.method3069();
                            method852(var34);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 129) {
                            int var35 = field534.method2477();
                            int var36 = field534.method2387();
                            class160.field2729[var36] = var35;
                            if (class160.field2731[var36] != var35) {
                                class160.field2731[var36] = var35;
                                method549(var36);
                            }
                            field612[++field677 - 1 & 0x1F] = var36;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 80) {
                            int var37 = field534.method2323();
                            class4 var38 = (class4) field652.method3138((long) var37);
                            if (var38 != null) {
                                method37(var38, true);
                            }
                            if (field568 != null) {
                                method852(field568);
                                field568 = null;
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 98) {
                            Statics.field184 = class138.method1176(field534.method2383());
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 87) {
                            int var39 = field534.method2477();
                            int var40 = field534.method2454();
                            int var41 = field534.method2393();
                            class4 var42 = (class4) field652.method3138((long) var39);
                            if (var42 != null) {
                                method37(var42, var42.field58 != var41);
                            }
                            method1178(var39, var41, var40);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 50) {
                            method1558();
                            field536 = -1;
                            var1 = false;
                            break label2611;
                        }
                        if (field536 == 39) {
                            int var43 = field534.method2327();
                            int var44 = field534.method2383();
                            int var45 = field534.method2327();
                            method1225(var43, var44, var45);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 34) {
                            Statics.method48(true);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 126) {
                            int var46 = field534.method2383();
                            int var47 = field534.method2454();
                            String var48 = field534.method2315();
                            if (var46 >= 1 && var46 <= 8) {
                                if (var48.equalsIgnoreCase("null")) {
                                    var48 = null;
                                }
                                field621[var46 - 1] = var48;
                                field622[var46 - 1] = var47 == 0;
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 206) {
                            method2300();
                            int var49 = field534.method2383();
                            int var50 = field534.method2463();
                            int var51 = field534.method2515();
                            field630[var49] = var50;
                            field628[var49] = var51;
                            field629[var49] = 1;
                            for (int var52 = 0; var52 < 98; var52++) {
                                if (var50 >= class131.field2080[var52]) {
                                    field629[var49] = var52 + 2;
                                }
                            }
                            field680[++field637 - 1 & 0x1F] = var49;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 247) {
                            int var53 = field534.method2393();
                            int var54 = field534.method2463();
                            class159 var55 = class159.method1507(var54);
                            if (var55.field2643 != 1 || var55.field2644 != var53) {
                                var55.field2643 = 1;
                                var55.field2644 = var53;
                                method852(var55);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 122) {
                            field660 = field534.method2350() * 30;
                            field685 = field675;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 223) {
                            int var56 = field534.method2477();
                            int var57 = field534.method2477();
                            int var58 = field534.method2393();
                            if (var58 == 65535) {
                                var58 = -1;
                            }
                            class159 var59 = class159.method1507(var57);
                            if (var59.field2654) {
                                var59.field2721 = var58;
                                var59.field2716 = var56;
                                class40 var61 = class40.method11(var58);
                                var59.field2651 = var61.field1031;
                                var59.field2606 = var61.field1009;
                                var59.field2653 = var61.field1005;
                                var59.field2649 = var61.field1011;
                                var59.field2650 = var61.field1012;
                                var59.field2680 = var61.field1022;
                                if (var59.field2620 > 0) {
                                    var59.field2680 = var59.field2680 * 32 / var59.field2620;
                                }
                                method852(var59);
                            } else {
                                if (var58 == -1) {
                                    var59.field2643 = 0;
                                    field536 = -1;
                                    var1 = true;
                                    break label2611;
                                }
                                class40 var60 = class40.method11(var58);
                                var59.field2643 = 4;
                                var59.field2644 = var58;
                                var59.field2651 = var60.field1031;
                                var59.field2606 = var60.field1009;
                                var59.field2680 = var60.field1022 * 100 / var56;
                                method852(var59);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 123) {
                            method2300();
                            field657 = field534.method2321();
                            field685 = field675;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 40) {
                            int var62 = field534.method2383();
                            int var63 = field534.method2383();
                            int var64 = field534.method2383();
                            int var65 = field534.method2383();
                            field732[var62] = true;
                            field740[var62] = var63;
                            field741[var62] = var64;
                            field742[var62] = var65;
                            field661[var62] = 0;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 221) {
                            int var66 = field534.method2477();
                            int var67 = field534.method2393();
                            int var68 = var67 >> 10 & 0x1F;
                            int var69 = var67 >> 5 & 0x1F;
                            int var70 = var67 & 0x1F;
                            int var71 = (var70 << 3) + (var68 << 19) + (var69 << 11);
                            class159 var72 = class159.method1507(var66);
                            if (var72.field2702 != var71) {
                                var72.field2702 = var71;
                                method852(var72);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 150) {
                            int var73 = field534.method2477();
                            int var74 = field534.method2354();
                            class159 var75 = class159.method1507(var73);
                            if (var75.field2647 != var74 || var74 == -1) {
                                var75.field2647 = var74;
                                var75.field2717 = 0;
                                var75.field2718 = 0;
                                method852(var75);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 77) {
                            int var76 = field534.method2327();
                            if (var76 == 65535) {
                                var76 = -1;
                            }
                            if (var76 == -1 && !field729) {
                                Statics.field409.method2686();
                                class139.field2378 = 1;
                                Statics.field2599 = null;
                            } else if (var76 != -1 && field728 != var76 && field626 != 0 && !field729) {
                                class139.method1779(2, Statics.field951, var76, 0, field626, false);
                            }
                            field728 = var76;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 211) {
                            int var77 = field534.method2440();
                            int var78 = field534.method2350();
                            if (var78 == 65535) {
                                var78 = -1;
                            }
                            if (field626 != 0 && var78 != -1) {
                                class139.method1505(Statics.field1867, var78, 0, field626, false);
                                field729 = true;
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 1 || field536 == 249 || field536 == 199 || field536 == 168 || field536 == 116 || field536 == 76 || field536 == 162 || field536 == 178 || field536 == 151 || field536 == 215 || field536 == 8) {
                            method2552();
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 17) {
                            int var79 = field534.method2477();
                            String var80 = field534.method2315();
                            class159 var81 = class159.method1507(var79);
                            if (!var80.equals(var81.field2658)) {
                                var81.field2658 = var80;
                                method852(var81);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 108) {
                            field726 = field534.method2383();
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 140) {
                            int var82 = field534.method2387();
                            class19 var83 = (class19) class19.field290.method3138((long) var82);
                            if (var83 != null) {
                                var83.method3196();
                            }
                            field749[++field684 - 1 & 0x1F] = var82 & 0x7FFF;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 33) {
                            int var84 = field534.method2323();
                            int var85 = field534.method2327();
                            if (var84 < -70000) {
                                var85 += 32768;
                            }
                            class159 var86;
                            if (var84 >= 0) {
                                var86 = class159.method1507(var84);
                            } else {
                                var86 = null;
                            }
                            if (var86 != null) {
                                for (int var87 = 0; var87 < var86.field2713.length; var87++) {
                                    var86.field2713[var87] = 0;
                                    var86.field2714[var87] = 0;
                                }
                            }
                            class19 var88 = (class19) class19.field290.method3138((long) var85);
                            if (var88 != null) {
                                for (int var89 = 0; var89 < var88.field287.length; var89++) {
                                    var88.field287[var89] = -1;
                                    var88.field292[var89] = 0;
                                }
                            }
                            int var90 = field534.method2327();
                            for (int var91 = 0; var91 < var90; var91++) {
                                int var92 = field534.method2515();
                                if (var92 == 255) {
                                    var92 = field534.method2323();
                                }
                                int var93 = field534.method2393();
                                if (var86 != null && var91 < var86.field2713.length) {
                                    var86.field2713[var91] = var93;
                                    var86.field2714[var91] = var92;
                                }
                                class19.method104(var85, var91, var93 - 1, var92);
                            }
                            if (var86 != null) {
                                method852(var86);
                            }
                            method2300();
                            field749[++field684 - 1 & 0x1F] = var85 & 0x7FFF;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 26) {
                            for (int var94 = 0; var94 < class160.field2731.length; var94++) {
                                if (class160.field2731[var94] != class160.field2729[var94]) {
                                    class160.field2731[var94] = class160.field2729[var94];
                                    method549(var94);
                                    field612[++field677 - 1 & 0x1F] = var94;
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 62) {
                            Statics.field186 = field534.method2383();
                            Statics.field351 = field534.method2454();
                            for (int var95 = Statics.field186; var95 < Statics.field186 + 8; var95++) {
                                for (int var96 = Statics.field351; var96 < Statics.field351 + 8; var96++) {
                                    if (field624[Statics.field178][var95][var96] != null) {
                                        field624[Statics.field178][var95][var96] = null;
                                        method224(var95, var96);
                                    }
                                }
                            }
                            for (class22 var97 = (class22) field625.method3163(); var97 != null; var97 = (class22) field625.method3165()) {
                                if (var97.field355 >= Statics.field186 && var97.field355 < Statics.field186 + 8 && var97.field353 >= Statics.field351 && var97.field353 < Statics.field351 + 8 && Statics.field178 == var97.field372) {
                                    var97.field366 = 0;
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 89) {
                            field665 = field534.method2383();
                            if (field665 == 255) {
                                field665 = 0;
                            }
                            field725 = field534.method2383();
                            if (field725 == 255) {
                                field725 = 0;
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 190) {
                            int var98 = field534.method2350();
                            if (var98 == 65535) {
                                var98 = -1;
                            }
                            int var99 = field534.method2350();
                            if (var99 == 65535) {
                                var99 = -1;
                            }
                            int var100 = field534.method2463();
                            int var101 = field534.method2361();
                            for (int var102 = var98; var102 <= var99; var102++) {
                                long var103 = ((long) var101 << 32) + (long) var102;
                                class179 var105 = field495.method3138(var103);
                                if (var105 != null) {
                                    var105.method3196();
                                }
                                field495.method3136(new class171(var100), var103);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 185) {
                            class13 var106 = new class13();
                            var106.field204 = field534.method2315();
                            var106.field215 = field534.method2327();
                            int var107 = field534.method2323();
                            var106.field211 = var107;
                            method22(45);
                            Statics.field347.method1330();
                            Statics.field347 = null;
                            class21.method455(var106);
                            field536 = -1;
                            var1 = false;
                            break label2611;
                        }
                        if (field536 == 147) {
                            int var108 = field534.method2387();
                            int var109 = field534.method2477();
                            int var110 = field534.method2350();
                            class159 var111 = class159.method1507(var109);
                            var111.field2681 = (var110 << 16) + var108;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 226) {
                            int var112 = field534.method2327();
                            int var113 = field534.method2477();
                            class159 var114 = class159.method1507(var113);
                            if (var114.field2643 != 2 || var114.field2644 != var112) {
                                var114.field2643 = 2;
                                var114.field2644 = var112;
                                method852(var114);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 6) {
                            int var115 = field534.method2323();
                            int var116 = field534.method2327();
                            if (var115 < -70000) {
                                var116 += 32768;
                            }
                            class159 var117;
                            if (var115 >= 0) {
                                var117 = class159.method1507(var115);
                            } else {
                                var117 = null;
                            }
                            while (field534.field2052 < field535) {
                                int var118 = field534.method2331();
                                int var119 = field534.method2327();
                                int var120 = 0;
                                if (var119 != 0) {
                                    var120 = field534.method2383();
                                    if (var120 == 255) {
                                        var120 = field534.method2323();
                                    }
                                }
                                if (var117 != null && var118 >= 0 && var118 < var117.field2713.length) {
                                    var117.field2713[var118] = var119;
                                    var117.field2714[var118] = var120;
                                }
                                class19.method104(var116, var118, var119 - 1, var120);
                            }
                            if (var117 != null) {
                                method852(var117);
                            }
                            method2300();
                            field749[++field684 - 1 & 0x1F] = var116 & 0x7FFF;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 82) {
                            field700 = field675;
                            if (field535 == 0) {
                                field651 = null;
                                field718 = null;
                                Statics.field15 = 0;
                                Statics.field962 = null;
                                field536 = -1;
                                var1 = true;
                            } else {
                                field718 = field534.method2315();
                                long var121 = field534.method2324();
                                long var123 = var121;
                                String var125;
                                if (var121 <= 0L || var121 >= 6582952005840035281L) {
                                    var125 = null;
                                } else if (var121 % 37L == 0L) {
                                    var125 = null;
                                } else {
                                    int var126 = 0;
                                    for (long var127 = var121; var127 != 0L; var127 /= 37L) {
                                        var126++;
                                    }
                                    StringBuilder var129 = new StringBuilder(var126);
                                    while (var123 != 0L) {
                                        long var130 = var123;
                                        var123 /= 37L;
                                        var129.append(class147.field2481[(int) (var130 - var123 * 37L)]);
                                    }
                                    var125 = var129.reverse().toString();
                                }
                                field651 = var125;
                                Statics.field2008 = field534.method2319();
                                int var132 = field534.method2383();
                                if (var132 == 255) {
                                    field536 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field15 = var132;
                                    class8[] var133 = new class8[100];
                                    for (int var134 = 0; var134 < Statics.field15; var134++) {
                                        var133[var134] = new class8();
                                        var133[var134].field120 = field534.method2315();
                                        var133[var134].field118 = class149.method2225(var133[var134].field120, Statics.field427);
                                        var133[var134].field124 = field534.method2327();
                                        var133[var134].field121 = field534.method2319();
                                        field534.method2315();
                                        if (var133[var134].field120.equals(Statics.field2555.field50)) {
                                            Statics.field258 = var133[var134].field121;
                                        }
                                    }
                                    boolean var135 = false;
                                    int var136 = Statics.field15;
                                    while (var136 > 0) {
                                        boolean var137 = true;
                                        var136--;
                                        for (int var138 = 0; var138 < var136; var138++) {
                                            if (var133[var138].field118.compareTo(var133[var138 + 1].field118) > 0) {
                                                class8 var139 = var133[var138];
                                                var133[var138] = var133[var138 + 1];
                                                var133[var138 + 1] = var139;
                                                var137 = false;
                                            }
                                        }
                                        if (var137) {
                                            break;
                                        }
                                    }
                                    Statics.field962 = var133;
                                    field536 = -1;
                                    var1 = true;
                                }
                            }
                            break label2611;
                        }
                        if (field536 == 154) {
                            int var140 = field534.method2361();
                            int var141 = field534.method2350();
                            class159 var142 = class159.method1507(var140);
                            if (var142 != null && var142.field2611 == 0) {
                                if (var141 > var142.field2627 - var142.field2615) {
                                    var141 = var142.field2627 - var142.field2615;
                                }
                                if (var141 < 0) {
                                    var141 = 0;
                                }
                                if (var142.field2683 != var141) {
                                    var142.field2683 = var141;
                                    method852(var142);
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 251) {
                            String var143 = field534.method2315();
                            long var144 = field534.method2324();
                            long var146 = (long) field534.method2327();
                            long var148 = (long) field534.method2322();
                            int var150 = field534.method2383();
                            long var151 = (var146 << 32) + var148;
                            boolean var153 = false;
                            for (int var154 = 0; var154 < 100; var154++) {
                                if (field711[var154] == var151) {
                                    var153 = true;
                                    break;
                                }
                            }
                            if (var150 <= 1 && method605(var143)) {
                                var153 = true;
                            }
                            if (!var153 && field574 == 0) {
                                field711[field712] = var151;
                                field712 = (field712 + 1) % 100;
                                String var155 = class185.method3231(class148.method1328(class184.method2267(field534)));
                                if (var150 == 2 || var150 == 3) {
                                    method90(9, class2.method1422(1) + var143, var155, class147.method203(var144));
                                } else if (var150 == 1) {
                                    method90(9, class2.method1422(0) + var143, var155, class147.method203(var144));
                                } else {
                                    method90(9, var143, var155, class147.method203(var144));
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 119) {
                            field633 = field534.method2383();
                            if (field633 == 1) {
                                field512 = field534.method2327();
                            }
                            if (field633 >= 2 && field633 <= 6) {
                                if (field633 == 2) {
                                    field517 = 64;
                                    field753 = 64;
                                }
                                if (field633 == 3) {
                                    field517 = 0;
                                    field753 = 64;
                                }
                                if (field633 == 4) {
                                    field517 = 128;
                                    field753 = 64;
                                }
                                if (field633 == 5) {
                                    field517 = 64;
                                    field753 = 0;
                                }
                                if (field633 == 6) {
                                    field517 = 64;
                                    field753 = 128;
                                }
                                field633 = 2;
                                field514 = field534.method2327();
                                field611 = field534.method2327();
                                field638 = field534.method2383();
                            }
                            if (field633 == 10) {
                                field513 = field534.method2327();
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 105) {
                            Statics.field186 = field534.method2515();
                            Statics.field351 = field534.method2444();
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 218) {
                            field739 = true;
                            Statics.field2478 = field534.method2383();
                            Statics.field767 = field534.method2383();
                            Statics.field381 = field534.method2327();
                            Statics.field227 = field534.method2383();
                            Statics.field1249 = field534.method2383();
                            if (Statics.field1249 >= 100) {
                                Statics.field1200 = Statics.field2478 * 128 + 64;
                                Statics.field1567 = Statics.field767 * 128 + 64;
                                Statics.field1341 = method138(Statics.field1200, Statics.field1567, Statics.field178) - Statics.field381;
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 52) {
                            while (field534.field2052 < field535) {
                                int var156 = field534.method2383();
                                boolean var157 = (var156 & 0x1) == 1;
                                String var158 = field534.method2315();
                                String var159 = field534.method2315();
                                field534.method2315();
                                for (int var160 = 0; var160 < field524; var160++) {
                                    class11 var161 = field681[var160];
                                    if (var157) {
                                        if (var159.equals(var161.field187)) {
                                            var161.field187 = var158;
                                            var161.field189 = var159;
                                            var158 = null;
                                            break;
                                        }
                                    } else if (var158.equals(var161.field187)) {
                                        var161.field187 = var158;
                                        var161.field189 = var159;
                                        var158 = null;
                                        break;
                                    }
                                }
                                if (var158 != null && field524 < 400) {
                                    class11 var162 = new class11();
                                    field681[field524] = var162;
                                    var162.field187 = var158;
                                    var162.field189 = var159;
                                    field524++;
                                }
                            }
                            field683 = field675;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 207) {
                            String var163 = field534.method2315();
                            long var164 = (long) field534.method2327();
                            long var166 = (long) field534.method2322();
                            int var168 = field534.method2383();
                            long var169 = (var164 << 32) + var166;
                            boolean var171 = false;
                            for (int var172 = 0; var172 < 100; var172++) {
                                if (field711[var172] == var169) {
                                    var171 = true;
                                    break;
                                }
                            }
                            if (method605(var163)) {
                                var171 = true;
                            }
                            if (!var171 && field574 == 0) {
                                field711[field712] = var169;
                                field712 = (field712 + 1) % 100;
                                String var173 = class185.method3231(class148.method1328(class184.method2267(field534)));
                                if (var168 == 2 || var168 == 3) {
                                    method105(7, class2.method1422(1) + var163, var173);
                                } else if (var168 == 1) {
                                    method105(7, class2.method1422(0) + var163, var173);
                                } else {
                                    method105(3, var163, var173);
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 4) {
                            for (int var174 = 0; var174 < Statics.field2479; var174++) {
                                class42 var175 = class42.method2637(var174);
                                if (var175 != null && var175.field1056 == 0) {
                                    class160.field2729[var174] = 0;
                                    class160.field2731[var174] = 0;
                                }
                            }
                            method2300();
                            field677 += 32;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 47) {
                            class182.method1953(field534, field535);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 101) {
                            int var176 = field534.method2323();
                            int var177 = field534.method2353();
                            int var178 = field534.method2353();
                            class159 var179 = class159.method1507(var176);
                            int var180 = var179.field2618 + var177;
                            int var181 = var179.field2619 + var178;
                            if (var179.field2609 != var180 || var179.field2707 != var181) {
                                var179.field2609 = var180;
                                var179.field2707 = var181;
                                method852(var179);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 97) {
                            String var182 = field534.method2315();
                            int var183 = field534.method2327();
                            byte var184 = field534.method2319();
                            boolean var185 = false;
                            if (var184 == -128) {
                                var185 = true;
                            }
                            if (var185) {
                                if (Statics.field15 == 0) {
                                    field536 = -1;
                                    var1 = true;
                                    break label2611;
                                }
                                boolean var186 = false;
                                int var187;
                                for (var187 = 0; var187 < Statics.field15 && (!Statics.field962[var187].field120.equals(var182) || Statics.field962[var187].field124 != var183); var187++) {
                                }
                                if (var187 < Statics.field15) {
                                    while (var187 < Statics.field15 - 1) {
                                        Statics.field962[var187] = Statics.field962[var187 + 1];
                                        var187++;
                                    }
                                    Statics.field15--;
                                    Statics.field962[Statics.field15] = null;
                                }
                            } else {
                                field534.method2315();
                                class8 var188 = new class8();
                                var188.field120 = var182;
                                var188.field118 = class149.method2225(var188.field120, Statics.field427);
                                var188.field124 = var183;
                                var188.field121 = var184;
                                int var189;
                                for (var189 = Statics.field15 - 1; var189 >= 0; var189--) {
                                    int var190 = Statics.field962[var189].field118.compareTo(var188.field120);
                                    if (var190 == 0) {
                                        Statics.field962[var189].field124 = var183;
                                        Statics.field962[var189].field121 = var184;
                                        if (var182.equals(Statics.field2555.field50)) {
                                            Statics.field258 = var184;
                                        }
                                        field700 = field675;
                                        field536 = -1;
                                        var1 = true;
                                        break label2611;
                                    }
                                    if (var190 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field15 >= Statics.field962.length) {
                                    field536 = -1;
                                    var1 = true;
                                    break label2611;
                                }
                                for (int var191 = Statics.field15 - 1; var191 > var189; var191--) {
                                    Statics.field962[var191 + 1] = Statics.field962[var191];
                                }
                                if (Statics.field15 == 0) {
                                    Statics.field962 = new class8[100];
                                }
                                Statics.field962[var189 + 1] = var188;
                                Statics.field15++;
                                if (var182.equals(Statics.field2555.field50)) {
                                    Statics.field258 = var184;
                                }
                            }
                            field700 = field675;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 58) {
                            if (field727 != -1) {
                                int var192 = field727;
                                if (class159.method227(var192)) {
                                    method156(Statics.field2666[var192], 0);
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 92) {
                            int var193 = field535 + field534.field2052;
                            int var194 = field534.method2327();
                            int var195 = field534.method2327();
                            if (field727 != var194) {
                                field727 = var194;
                                method223(field727);
                                class26.method141(field727);
                                for (int var196 = 0; var196 < 100; var196++) {
                                    field695[var196] = true;
                                }
                            }
                            while (var195-- > 0) {
                                int var197 = field534.method2323();
                                int var198 = field534.method2327();
                                int var199 = field534.method2383();
                                class4 var200 = (class4) field652.method3138((long) var197);
                                if (var200 != null && var200.field58 != var198) {
                                    method37(var200, true);
                                    var200 = null;
                                }
                                if (var200 == null) {
                                    class4 var201 = new class4();
                                    var201.field58 = var198;
                                    var201.field52 = var199;
                                    field652.method3136(var201, (long) var197);
                                    method223(var198);
                                    class26.method141(var198);
                                    class159 var202 = class159.method1507(var197);
                                    if (var202 != null) {
                                        method852(var202);
                                    }
                                    if (field568 != null) {
                                        method852(field568);
                                        field568 = null;
                                    }
                                    Statics.method1421();
                                    if (field727 != -1) {
                                        int var203 = field727;
                                        if (class159.method227(var203)) {
                                            method156(Statics.field2666[var203], 1);
                                        }
                                    }
                                    var200 = var201;
                                }
                                var200.field53 = true;
                            }
                            for (class4 var205 = (class4) field652.method3155(); var205 != null; var205 = (class4) field652.method3139()) {
                                if (var205.field53) {
                                    var205.field53 = false;
                                } else {
                                    method37(var205, true);
                                }
                            }
                            field495 = new class175(512);
                            while (field534.field2052 < var193) {
                                int var206 = field534.method2323();
                                int var207 = field534.method2327();
                                int var208 = field534.method2327();
                                int var209 = field534.method2323();
                                for (int var210 = var207; var210 <= var208; var210++) {
                                    long var211 = ((long) var206 << 32) + (long) var210;
                                    field495.method3136(new class171(var209), var211);
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 186) {
                            Statics.method154();
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 202) {
                            int var213 = field534.method2387();
                            int var214 = field534.method2393();
                            int var215 = field534.method2361();
                            int var216 = field534.method2393();
                            class159 var217 = class159.method1507(var215);
                            if (var217.field2651 != var216 || var217.field2606 != var213 || var217.field2680 != var214) {
                                var217.field2651 = var216;
                                var217.field2606 = var213;
                                var217.field2680 = var214;
                                method852(var217);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 35) {
                            field752 = field534.method2383();
                            field519 = field534.method2383();
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 165) {
                            int var218 = field534.method2350();
                            byte var219 = field534.method2319();
                            class160.field2729[var218] = var219;
                            if (class160.field2731[var218] != var219) {
                                class160.field2731[var218] = var219;
                                method549(var218);
                            }
                            field612[++field677 - 1 & 0x1F] = var218;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 161) {
                            String var220 = field534.method2315();
                            Object[] var221 = new Object[var220.length() + 1];
                            for (int var222 = var220.length() - 1; var222 >= 0; var222--) {
                                if (var220.charAt(var222) == 's') {
                                    var221[var222 + 1] = field534.method2315();
                                } else {
                                    var221[var222 + 1] = Integer.valueOf(field534.method2323());
                                }
                            }
                            var221[0] = Integer.valueOf(field534.method2323());
                            class1 var223 = new class1();
                            var223.field11 = var221;
                            class26.method196(var223);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 167) {
                            for (int var224 = 0; var224 < field610.length; var224++) {
                                if (field610[var224] != null) {
                                    field610[var224].field461 = -1;
                                }
                            }
                            for (int var225 = 0; var225 < field529.length; var225++) {
                                if (field529[var225] != null) {
                                    field529[var225].field461 = -1;
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 81) {
                            Statics.method48(false);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 104) {
                            int var226 = field534.method2361();
                            Statics.field1543 = Statics.field271.method1429(var226);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 213) {
                            field739 = true;
                            Statics.field2017 = field534.method2383();
                            Statics.field268 = field534.method2383();
                            Statics.field86 = field534.method2327();
                            Statics.field115 = field534.method2383();
                            Statics.field94 = field534.method2383();
                            if (Statics.field94 >= 100) {
                                int var227 = Statics.field2017 * 128 + 64;
                                int var228 = Statics.field268 * 128 + 64;
                                int var229 = method138(var227, var228, Statics.field178) - Statics.field86;
                                int var230 = var227 - Statics.field1200;
                                int var231 = var229 - Statics.field1341;
                                int var232 = var228 - Statics.field1567;
                                int var233 = (int) Math.sqrt((double) (var230 * var230 + var232 * var232));
                                Statics.field1482 = (int) (Math.atan2((double) var231, (double) var233) * 325.949D) & 0x7FF;
                                Statics.field362 = (int) (Math.atan2((double) var230, (double) var232) * -325.949D) & 0x7FF;
                                if (Statics.field1482 < 128) {
                                    Statics.field1482 = 128;
                                }
                                if (Statics.field1482 > 383) {
                                    Statics.field1482 = 383;
                                }
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 10) {
                            int var234 = field534.method2515();
                            int var235 = field534.method2454();
                            int var236 = field534.method2454();
                            Statics.field178 = var234 >> 1;
                            Statics.field2555.method229(var236, var235, (var234 & 0x1) == 1);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 112) {
                            String var237 = field534.method2315();
                            String var238 = class185.method3231(class148.method1328(class184.method2267(field534)));
                            method105(6, var237, var238);
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 232) {
                            String var239 = field534.method2315();
                            if (var239.endsWith(":tradereq:")) {
                                String var240 = var239.substring(0, var239.indexOf(":"));
                                boolean var241 = false;
                                if (method605(var240)) {
                                    var241 = true;
                                }
                                if (!var241 && field574 == 0) {
                                    method105(4, var240, class135.field2251);
                                }
                            } else if (var239.endsWith(":duelreq:")) {
                                String var242 = var239.substring(0, var239.indexOf(":"));
                                boolean var243 = false;
                                if (method605(var242)) {
                                    var243 = true;
                                }
                                if (!var243 && field574 == 0) {
                                    method105(8, var242, class135.field2252);
                                }
                            } else if (var239.endsWith(":chalreq:")) {
                                String var244 = var239.substring(0, var239.indexOf(":"));
                                boolean var245 = false;
                                if (method605(var244)) {
                                    var245 = true;
                                }
                                if (!var245 && field574 == 0) {
                                    String var246 = var239.substring(var239.indexOf(":") + 1, var239.length() - 9);
                                    method105(8, var244, var246);
                                }
                            } else if (var239.endsWith(":assistreq:")) {
                                String var247 = var239.substring(0, var239.indexOf(":"));
                                boolean var248 = false;
                                if (method605(var247)) {
                                    var248 = true;
                                }
                                if (!var248 && field574 == 0) {
                                    method105(10, var247, "");
                                }
                            } else if (var239.endsWith(":clan:")) {
                                String var249 = var239.substring(0, var239.indexOf(":clan:"));
                                method105(11, "", var249);
                            } else if (var239.endsWith(":trade:")) {
                                String var250 = var239.substring(0, var239.indexOf(":trade:"));
                                if (field574 == 0) {
                                    method105(12, "", var250);
                                }
                            } else if (var239.endsWith(":assist:")) {
                                String var251 = var239.substring(0, var239.indexOf(":assist:"));
                                if (field574 == 0) {
                                    method105(13, "", var251);
                                }
                            } else if (var239.endsWith(":broadcast:")) {
                                String var252 = var239.substring(0, var239.indexOf(":broadcast:"));
                                if (field574 == 0) {
                                    method105(14, "", var252);
                                }
                            } else {
                                method105(0, "", var239);
                            }
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        if (field536 == 201) {
                            field745 = 1;
                            field683 = field675;
                            field536 = -1;
                            var1 = true;
                            break label2611;
                        }
                        class80.method789("" + field536 + class2.field16 + field708 + class2.field16 + field542 + class2.field16 + field535, (Throwable) null);
                        method1558();
                    } catch (IOException var370) {
                        method38();
                    } catch (Exception var371) {
                        String var255 = "" + field536 + class2.field16 + field708 + class2.field16 + field542 + class2.field16 + field535 + class2.field16 + (Statics.field267 + Statics.field2555.field469[0]) + class2.field16 + (Statics.field1246 + Statics.field2555.field481[0]) + class2.field16;
                        for (int var256 = 0; var256 < field535 && var256 < 50; var256++) {
                            var255 = var255 + field534.field2057[var256] + class2.field16;
                        }
                        class80.method789(var255, var371);
                        method1558();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field501 != 30) {
            return;
        }
        class182.method1298(field504, 84);
        Object var257 = Statics.field1433.field262;
        synchronized (Statics.field1433.field262) {
            if (!field493) {
                Statics.field1433.field252 = 0;
            } else if (class77.field1403 != 0 || Statics.field1433.field252 >= 40) {
                field504.method2218(190);
                field504.method2333(0);
                int var258 = field504.field2052;
                int var259 = 0;
                for (int var260 = 0; var260 < Statics.field1433.field252 && field504.field2052 - var258 < 240; var260++) {
                    var259++;
                    int var261 = Statics.field1433.field254[var260];
                    if (var261 < 0) {
                        var261 = 0;
                    } else if (var261 > 502) {
                        var261 = 502;
                    }
                    int var262 = Statics.field1433.field253[var260];
                    if (var262 < 0) {
                        var262 = 0;
                    } else if (var262 > 764) {
                        var262 = 764;
                    }
                    int var263 = var261 * 765 + var262;
                    if (Statics.field1433.field254[var260] == -1 && Statics.field1433.field253[var260] == -1) {
                        var262 = -1;
                        var261 = -1;
                        var263 = 524287;
                    }
                    if (field559 != var262 || field506 != var261) {
                        int var264 = var262 - field559;
                        field559 = var262;
                        int var265 = var261 - field506;
                        field506 = var261;
                        if (field507 < 8 && var264 >= -32 && var264 <= 31 && var265 >= -32 && var265 <= 31) {
                            var264 += 32;
                            var265 += 32;
                            field504.method2306((field507 << 12) + (var264 << 6) + var265);
                            field507 = 0;
                        } else if (field507 < 8) {
                            field504.method2406((field507 << 19) + 8388608 + var263);
                            field507 = 0;
                        } else {
                            field504.method2307((field507 << 19) + -1073741824 + var263);
                            field507 = 0;
                        }
                    } else if (field507 < 2047) {
                        field507++;
                    }
                }
                field504.method2374(field504.field2052 - var258);
                if (var259 >= Statics.field1433.field252) {
                    Statics.field1433.field252 = 0;
                } else {
                    Statics.field1433.field252 -= var259;
                    for (int var266 = 0; var266 < Statics.field1433.field252; var266++) {
                        Statics.field1433.field253[var266] = Statics.field1433.field253[var259 + var266];
                        Statics.field1433.field254[var266] = Statics.field1433.field254[var259 + var266];
                    }
                }
            }
        }
        if (class77.field1403 == 1 || !Statics.field1273 && class77.field1403 == 4 || class77.field1403 == 2) {
            long var268 = (class77.field1412 - field713) / 50L;
            if (var268 > 4095L) {
                var268 = 4095L;
            }
            field713 = class77.field1412;
            int var270 = class77.field1413;
            if (var270 < 0) {
                var270 = 0;
            } else if (var270 > 502) {
                var270 = 502;
            }
            int var271 = class77.field1410;
            if (var271 < 0) {
                var271 = 0;
            } else if (var271 > 764) {
                var271 = 764;
            }
            int var272 = var270 * 765 + var271;
            byte var273 = 0;
            if (class77.field1403 == 2) {
                var273 = 1;
            }
            int var274 = (int) var268;
            field504.method2218(178);
            field504.method2307((var273 << 19) + (var274 << 20) + var272);
        }
        if (class75.field1383 > 0) {
            field504.method2218(104);
            field504.method2306(0);
            int var275 = field504.field2052;
            long var276 = class121.method2119();
            for (int var278 = 0; var278 < class75.field1383; var278++) {
                long var279 = var276 - field644;
                if (var279 > 16777215L) {
                    var279 = 16777215L;
                }
                field644 = var276;
                field504.method2341(class75.field1374[var278]);
                field504.method2362((int) var279);
            }
            field504.method2314(field504.field2052 - var275);
        }
        if (field580 > 0) {
            field580--;
        }
        if (class75.field1370[96] || class75.field1370[97] || class75.field1370[98] || class75.field1370[99]) {
            field581 = true;
        }
        if (field581 && field580 <= 0) {
            field580 = 20;
            field581 = false;
            field504.method2218(182);
            field504.method2330(field575);
            field504.method2306(field748);
        }
        if (Statics.field112 && !field508) {
            field508 = true;
            field504.method2218(108);
            field504.method2333(1);
        }
        if (!Statics.field112 && field508) {
            field508 = false;
            field504.method2218(108);
            field504.method2333(0);
        }
        if (field499 && Statics.field178 != field710) {
            method729(Statics.field769, Statics.field55, Statics.field178, Statics.field2555.field469[0], Statics.field2555.field481[0]);
        } else if (Statics.field178 != field719) {
            field719 = Statics.field178;
            int var281 = Statics.field178;
            int[] var282 = Statics.field210.field1497;
            int var283 = var282.length;
            for (int var284 = 0; var284 < var283; var284++) {
                var282[var284] = 0;
            }
            for (int var285 = 1; var285 < 103; var285++) {
                int var286 = (103 - var285) * 2048 + 24628;
                for (int var287 = 1; var287 < 103; var287++) {
                    if ((class9.field141[var281][var287][var285] & 0x18) == 0) {
                        Statics.field550.method1818(var282, var286, 512, var281, var287, var285);
                    }
                    if (var281 < 3 && (class9.field141[var281 + 1][var287][var285] & 0x8) != 0) {
                        Statics.field550.method1818(var282, var286, 512, var281 + 1, var287, var285);
                    }
                    var286 += 4;
                }
            }
            int var288 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var289 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field210.method1647();
            for (int var290 = 1; var290 < 103; var290++) {
                for (int var291 = 1; var291 < 103; var291++) {
                    if ((class9.field141[var281][var291][var290] & 0x18) == 0) {
                        method228(var281, var291, var290, var288, var289);
                    }
                    if (var281 < 3 && (class9.field141[var281 + 1][var291][var290] & 0x8) != 0) {
                        method228(var281 + 1, var291, var290, var288, var289);
                    }
                }
            }
            field613 = 0;
            for (int var292 = 0; var292 < 104; var292++) {
                for (int var293 = 0; var293 < 104; var293++) {
                    int var294 = Statics.field550.method1815(Statics.field178, var292, var293);
                    if (var294 != 0) {
                        int var295 = var294 >> 14 & 0x7FFF;
                        int var296 = class32.method1446(var295).field838;
                        if (var296 >= 0) {
                            int var297 = var292;
                            int var298 = var293;
                            if (var296 != 22 && var296 != 29 && var296 != 34 && var296 != 36 && var296 != 46 && var296 != 47 && var296 != 48) {
                                int[][] var299 = field551[Statics.field178].field2076;
                                for (int var300 = 0; var300 < 10; var300++) {
                                    int var301 = (int) (Math.random() * 4.0D);
                                    if (var301 == 0 && var297 > 0 && var297 > var292 - 3 && (var299[var297 - 1][var298] & 0x1240108) == 0) {
                                        var297--;
                                    }
                                    if (var301 == 1 && var297 < 103 && var297 < var292 + 3 && (var299[var297 + 1][var298] & 0x1240180) == 0) {
                                        var297++;
                                    }
                                    if (var301 == 2 && var298 > 0 && var298 > var293 - 3 && (var299[var297][var298 - 1] & 0x1240102) == 0) {
                                        var298--;
                                    }
                                    if (var301 == 3 && var298 < 103 && var298 < var293 + 3 && (var299[var297][var298 + 1] & 0x1240120) == 0) {
                                        var298++;
                                    }
                                }
                            }
                            field751[field613] = Statics.field75[var296];
                            field721[field613] = var297;
                            field722[field613] = var298;
                            field613++;
                        }
                    }
                }
            }
            Statics.field1197.method1586();
        }
        if (field501 != 30) {
            return;
        }
        method1459();
        method231();
        field537++;
        if (field537 > 750) {
            method38();
            return;
        }
        method118();
        for (int var302 = 0; var302 < field530; var302++) {
            int var303 = field531[var302];
            class25 var304 = field529[var303];
            if (var304 != null) {
                method225(var304, var304.field406.field796);
            }
        }
        for (int var305 = -1; var305 < field516; var305++) {
            int var306;
            if (var305 == -1) {
                var306 = 2047;
            } else {
                var306 = field738[var305];
            }
            class3 var307 = field610[var306];
            if (var307 != null && var307.field446 > 0) {
                var307.field446--;
                if (var307.field446 == 0) {
                    var307.field445 = null;
                }
            }
        }
        for (int var308 = 0; var308 < field530; var308++) {
            int var309 = field531[var308];
            class25 var310 = field529[var309];
            if (var310 != null && var310.field446 > 0) {
                var310.field446--;
                if (var310.field446 == 0) {
                    var310.field445 = null;
                }
            }
        }
        field567++;
        if (field600 != 0) {
            field599 += 20;
            if (field599 >= 400) {
                field600 = 0;
            }
        }
        if (Statics.field1764 != null) {
            field601++;
            if (field601 >= 15) {
                method852(Statics.field1764);
                Statics.field1764 = null;
            }
        }
        class159 var311 = Statics.field256;
        class159 var312 = Statics.field980;
        Statics.field256 = null;
        Statics.field980 = null;
        field666 = null;
        field670 = false;
        field755 = false;
        field497 = 0;
        while (class75.method2733() && field497 < 128) {
            if (field658 >= 2 && class75.field1370[82] && Statics.field879 == 66) {
                String var313 = "";
                for (int var314 = 0; var314 < field707 && var314 < 100; var314++) {
                    var313 = var313 + field704[var314] + ':' + field706[var314] + '\n';
                }
                Statics.field265.setContents(new StringSelection(var313), (ClipboardOwner) null);
            } else {
                field715[field497] = Statics.field879;
                field589[field497] = Statics.field783;
                field497++;
            }
        }
        int var315 = field727;
        if (class159.method227(var315)) {
            method137(Statics.field2666[var315], -1, 0, 0, 765, 503, 0, 0);
        }
        field675++;
        while (true) {
            class1 var316;
            class159 var317;
            class159 var318;
            do {
                var316 = (class1) field690.method3161();
                if (var316 == null) {
                    while (true) {
                        class1 var319;
                        class159 var320;
                        class159 var321;
                        do {
                            var319 = (class1) field691.method3161();
                            if (var319 == null) {
                                while (true) {
                                    class1 var322;
                                    class159 var323;
                                    class159 var324;
                                    do {
                                        var322 = (class1) field689.method3161();
                                        if (var322 == null) {
                                            method1230();
                                            if (field664 != null) {
                                                method852(field664);
                                                Statics.field974++;
                                                if (field670 && field755) {
                                                    int var325 = class77.field1397;
                                                    int var326 = class77.field1404;
                                                    int var327 = var325 - field648;
                                                    int var328 = var326 - field663;
                                                    if (var327 < field754) {
                                                        var327 = field754;
                                                    }
                                                    if (field664.field2620 + var327 > field754 + field577.field2620) {
                                                        var327 = field754 + field577.field2620 - field664.field2620;
                                                    }
                                                    if (var328 < field642) {
                                                        var328 = field642;
                                                    }
                                                    if (field664.field2615 + var328 > field642 + field577.field2615) {
                                                        var328 = field642 + field577.field2615 - field664.field2615;
                                                    }
                                                    int var329 = var327 - field671;
                                                    int var330 = var328 - field672;
                                                    int var331 = field664.field2678;
                                                    if (Statics.field974 > field664.field2675 && (var329 > var331 || var329 < -var331 || var330 > var331 || var330 < -var331)) {
                                                        field673 = true;
                                                    }
                                                    int var332 = field577.field2624 + (var327 - field754);
                                                    int var333 = field577.field2683 + (var328 - field642);
                                                    if (field664.field2687 != null && field673) {
                                                        class1 var334 = new class1();
                                                        var334.field3 = field664;
                                                        var334.field4 = var332;
                                                        var334.field1 = var333;
                                                        var334.field11 = field664.field2687;
                                                        class26.method196(var334);
                                                    }
                                                    if (class77.field1409 == 0) {
                                                        if (field673) {
                                                            if (field664.field2688 != null) {
                                                                class1 var335 = new class1();
                                                                var335.field3 = field664;
                                                                var335.field4 = var332;
                                                                var335.field1 = var333;
                                                                var335.field7 = field666;
                                                                var335.field11 = field664.field2688;
                                                                class26.method196(var335);
                                                            }
                                                            if (field666 != null && method2755(field664) != null) {
                                                                field504.method2218(109);
                                                                field504.method2337(field664.field2612);
                                                                field504.method2306(field666.field2612);
                                                                field504.method2305(field664.field2719);
                                                                field504.method2370(field666.field2719);
                                                            }
                                                        } else if ((field631 == 1 || method1303(field676 - 1)) && field676 > 2) {
                                                            method130();
                                                        } else if (field676 > 0) {
                                                            method52(field676 - 1);
                                                        }
                                                        field664 = null;
                                                    }
                                                } else if (Statics.field974 > 1) {
                                                    field664 = null;
                                                }
                                            }
                                            if (Statics.field878 != null) {
                                                method852(Statics.field878);
                                                field608++;
                                                if (class77.field1409 == 0) {
                                                    if (field532) {
                                                        if (Statics.field878 == Statics.field1989 && field606 != field603) {
                                                            class159 var336 = Statics.field878;
                                                            byte var337 = 0;
                                                            if (field654 == 1 && var336.field2642 == 206) {
                                                                var337 = 1;
                                                            }
                                                            if (var336.field2713[field606] <= 0) {
                                                                var337 = 0;
                                                            }
                                                            int var338 = method2111(var336);
                                                            boolean var339 = (var338 >> 29 & 0x1) != 0;
                                                            if (var339) {
                                                                int var340 = field603;
                                                                int var341 = field606;
                                                                var336.field2713[var341] = var336.field2713[var340];
                                                                var336.field2714[var341] = var336.field2714[var340];
                                                                var336.field2713[var340] = -1;
                                                                var336.field2714[var340] = 0;
                                                            } else if (var337 == 1) {
                                                                int var342 = field603;
                                                                int var343 = field606;
                                                                while (var342 != var343) {
                                                                    if (var342 > var343) {
                                                                        var336.method3007(var342 - 1, var342);
                                                                        var342--;
                                                                    } else if (var342 < var343) {
                                                                        var336.method3007(var342 + 1, var342);
                                                                        var342++;
                                                                    }
                                                                }
                                                            } else {
                                                                var336.method3007(field606, field603);
                                                            }
                                                            field504.method2218(246);
                                                            field504.method2307(Statics.field878.field2719);
                                                            field504.method2507(var337);
                                                            field504.method2337(field603);
                                                            field504.method2348(field606);
                                                        }
                                                    } else if ((field631 == 1 || method1303(field676 - 1)) && field676 > 2) {
                                                        method130();
                                                    } else if (field676 > 0) {
                                                        method52(field676 - 1);
                                                    }
                                                    field601 = 10;
                                                    class77.field1403 = 0;
                                                    Statics.field878 = null;
                                                } else if (field608 >= 5 && (class77.field1397 > field605 + 5 || class77.field1397 < field605 - 5 || class77.field1404 > field500 + 5 || class77.field1404 < field500 - 5)) {
                                                    field532 = true;
                                                }
                                            }
                                            if (class95.field1613 != -1) {
                                                int var344 = class95.field1613;
                                                int var345 = class95.field1607;
                                                field504.method2218(207);
                                                field504.method2333(5);
                                                field504.method2372(class75.field1370[82] ? (class75.field1370[81] ? 2 : 1) : 0);
                                                field504.method2330(Statics.field267 + var344);
                                                field504.method2348(Statics.field1246 + var345);
                                                class95.field1613 = -1;
                                                field597 = class77.field1410;
                                                field598 = class77.field1413;
                                                field600 = 1;
                                                field599 = 0;
                                                field665 = var344;
                                                field725 = var345;
                                            }
                                            if (Statics.field256 != var311) {
                                                if (var311 != null) {
                                                    method852(var311);
                                                }
                                                if (Statics.field256 != null) {
                                                    method852(Statics.field256);
                                                }
                                            }
                                            if (Statics.field980 != var312 && field669 == field643) {
                                                if (var312 != null) {
                                                    method852(var312);
                                                }
                                                if (Statics.field980 != null) {
                                                    method852(Statics.field980);
                                                }
                                            }
                                            if (Statics.field980 == null) {
                                                if (field643 > 0) {
                                                    field643--;
                                                }
                                            } else if (field643 < field669) {
                                                field643++;
                                                if (field669 == field643) {
                                                    method852(Statics.field980);
                                                }
                                            }
                                            method106();
                                            if (field739) {
                                                int var346 = Statics.field2478 * 128 + 64;
                                                int var347 = Statics.field767 * 128 + 64;
                                                int var348 = method138(var346, var347, Statics.field178) - Statics.field381;
                                                if (Statics.field1200 < var346) {
                                                    Statics.field1200 += Statics.field1249 * (var346 - Statics.field1200) / 1000 + Statics.field227;
                                                    if (Statics.field1200 > var346) {
                                                        Statics.field1200 = var346;
                                                    }
                                                }
                                                if (Statics.field1200 > var346) {
                                                    Statics.field1200 -= Statics.field1249 * (Statics.field1200 - var346) / 1000 + Statics.field227;
                                                    if (Statics.field1200 < var346) {
                                                        Statics.field1200 = var346;
                                                    }
                                                }
                                                if (Statics.field1341 < var348) {
                                                    Statics.field1341 += Statics.field1249 * (var348 - Statics.field1341) / 1000 + Statics.field227;
                                                    if (Statics.field1341 > var348) {
                                                        Statics.field1341 = var348;
                                                    }
                                                }
                                                if (Statics.field1341 > var348) {
                                                    Statics.field1341 -= Statics.field1249 * (Statics.field1341 - var348) / 1000 + Statics.field227;
                                                    if (Statics.field1341 < var348) {
                                                        Statics.field1341 = var348;
                                                    }
                                                }
                                                if (Statics.field1567 < var347) {
                                                    Statics.field1567 += Statics.field1249 * (var347 - Statics.field1567) / 1000 + Statics.field227;
                                                    if (Statics.field1567 > var347) {
                                                        Statics.field1567 = var347;
                                                    }
                                                }
                                                if (Statics.field1567 > var347) {
                                                    Statics.field1567 -= Statics.field1249 * (Statics.field1567 - var347) / 1000 + Statics.field227;
                                                    if (Statics.field1567 < var347) {
                                                        Statics.field1567 = var347;
                                                    }
                                                }
                                                int var349 = Statics.field2017 * 128 + 64;
                                                int var350 = Statics.field268 * 128 + 64;
                                                int var351 = method138(var349, var350, Statics.field178) - Statics.field86;
                                                int var352 = var349 - Statics.field1200;
                                                int var353 = var351 - Statics.field1341;
                                                int var354 = var350 - Statics.field1567;
                                                int var355 = (int) Math.sqrt((double) (var352 * var352 + var354 * var354));
                                                int var356 = (int) (Math.atan2((double) var353, (double) var355) * 325.949D) & 0x7FF;
                                                int var357 = (int) (Math.atan2((double) var352, (double) var354) * -325.949D) & 0x7FF;
                                                if (var356 < 128) {
                                                    var356 = 128;
                                                }
                                                if (var356 > 383) {
                                                    var356 = 383;
                                                }
                                                if (Statics.field1482 < var356) {
                                                    Statics.field1482 += Statics.field94 * (var356 - Statics.field1482) / 1000 + Statics.field115;
                                                    if (Statics.field1482 > var356) {
                                                        Statics.field1482 = var356;
                                                    }
                                                }
                                                if (Statics.field1482 > var356) {
                                                    Statics.field1482 -= Statics.field94 * (Statics.field1482 - var356) / 1000 + Statics.field115;
                                                    if (Statics.field1482 < var356) {
                                                        Statics.field1482 = var356;
                                                    }
                                                }
                                                int var358 = var357 - Statics.field362;
                                                if (var358 > 1024) {
                                                    var358 -= 2048;
                                                }
                                                if (var358 < -1024) {
                                                    var358 += 2048;
                                                }
                                                if (var358 > 0) {
                                                    Statics.field362 += Statics.field94 * var358 / 1000 + Statics.field115;
                                                    Statics.field362 &= 0x7FF;
                                                }
                                                if (var358 < 0) {
                                                    Statics.field362 -= Statics.field94 * -var358 / 1000 + Statics.field115;
                                                    Statics.field362 &= 0x7FF;
                                                }
                                                int var359 = var357 - Statics.field362;
                                                if (var359 > 1024) {
                                                    var359 -= 2048;
                                                }
                                                if (var359 < -1024) {
                                                    var359 += 2048;
                                                }
                                                if (var359 < 0 && var358 > 0 || var359 > 0 && var358 < 0) {
                                                    Statics.field362 = var357;
                                                }
                                            }
                                            for (int var360 = 0; var360 < 5; var360++) {
                                                int var10002 = field661[var360]++;
                                            }
                                            int var361 = ++class77.field1402 - 1;
                                            int var363 = class75.method1336();
                                            if (var361 > 15000 && var363 > 15000) {
                                                field518 = 250;
                                                class77.method202(14500);
                                                field504.method2218(100);
                                            }
                                            field561++;
                                            if (field561 > 500) {
                                                field561 = 0;
                                                int var364 = (int) (Math.random() * 8.0D);
                                                if ((var364 & 0x1) == 1) {
                                                    field555 += field678;
                                                }
                                                if ((var364 & 0x2) == 2) {
                                                    field557 += field558;
                                                }
                                                if ((var364 & 0x4) == 4) {
                                                    field720 += field560;
                                                }
                                            }
                                            if (field555 < -50) {
                                                field678 = 2;
                                            }
                                            if (field555 > 50) {
                                                field678 = -2;
                                            }
                                            if (field557 < -55) {
                                                field558 = 2;
                                            }
                                            if (field557 > 55) {
                                                field558 = -2;
                                            }
                                            if (field720 < -40) {
                                                field560 = 1;
                                            }
                                            if (field720 > 40) {
                                                field560 = -1;
                                            }
                                            field566++;
                                            if (field566 > 500) {
                                                field566 = 0;
                                                int var365 = (int) (Math.random() * 8.0D);
                                                if ((var365 & 0x1) == 1) {
                                                    field562 += field563;
                                                }
                                                if ((var365 & 0x2) == 2) {
                                                    field491 += field565;
                                                }
                                            }
                                            if (field562 < -60) {
                                                field563 = 2;
                                            }
                                            if (field562 > 60) {
                                                field563 = -2;
                                            }
                                            if (field491 < -20) {
                                                field565 = 1;
                                            }
                                            if (field491 > 10) {
                                                field565 = -1;
                                            }
                                            for (class28 var366 = (class28) field632.method3129(); var366 != null; var366 = (class28) field632.method3124()) {
                                                if ((long) var366.field758 < class121.method2119() / 1000L - 5L) {
                                                    if (var366.field757 > 0) {
                                                        method105(5, "", var366.field759 + class135.field2253);
                                                    }
                                                    if (var366.field757 == 0) {
                                                        method105(5, "", var366.field759 + class135.field2225);
                                                    }
                                                    var366.method3195();
                                                }
                                            }
                                            field538++;
                                            if (field538 > 50) {
                                                field504.method2218(88);
                                            }
                                            try {
                                                if (Statics.field347 != null && field504.field2052 > 0) {
                                                    Statics.field347.method1347(field504.field2057, 0, field504.field2052);
                                                    field504.field2052 = 0;
                                                    field538 = 0;
                                                }
                                            } catch (IOException var368) {
                                                method38();
                                            }
                                            return;
                                        }
                                        var323 = var322.field3;
                                        if (var323.field2612 < 0) {
                                            break;
                                        }
                                        var324 = class159.method1507(var323.field2622);
                                    } while (var324 == null || var324.field2705 == null || var323.field2612 >= var324.field2705.length || var324.field2705[var323.field2612] != var323);
                                    class26.method196(var322);
                                }
                            }
                            var320 = var319.field3;
                            if (var320.field2612 < 0) {
                                break;
                            }
                            var321 = class159.method1507(var320.field2622);
                        } while (var321 == null || var321.field2705 == null || var320.field2612 >= var321.field2705.length || var321.field2705[var320.field2612] != var320);
                        class26.method196(var319);
                    }
                }
                var317 = var316.field3;
                if (var317.field2612 < 0) {
                    break;
                }
                var318 = class159.method1507(var317.field2622);
            } while (var318 == null || var318.field2705 == null || var317.field2612 >= var318.field2705.length || var318.field2705[var317.field2612] != var317);
            class26.method196(var316);
        }
    }

    @ObfuscatedName("ac.k(I)V")
    public static final void method655() {
        if (Statics.field1199 != null) {
            Statics.field1199.method1134();
        }
        if (Statics.field1244 != null) {
            Statics.field1244.method1134();
        }
    }

    @ObfuscatedName("ap.w(I)V")
    public static final void method231() {
        for (int var0 = 0; var0 < field510; var0++) {
            int var10002 = field724[var0]--;
            if (field724[var0] >= -10) {
                class57 var2 = field548[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1209(Statics.field770, field733[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field724[var0] += var2.method1214();
                    field548[var0] = var2;
                }
                if (field724[var0] < 0) {
                    int var9;
                    if (field544[var0] == 0) {
                        var9 = field730;
                    } else {
                        int var3 = (field544[var0] & 0xFF) * 128;
                        int var4 = field544[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2555.field468;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field544[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2555.field435;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field724[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field731 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1199().method1276(Statics.field737);
                        class45 var11 = class45.method1022(var10, 100, var9);
                        var11.method917(field541[var0] - 1);
                        Statics.field113.method1057(var11);
                    }
                    field724[var0] = -100;
                }
            } else {
                field510--;
                for (int var1 = var0; var1 < field510; var1++) {
                    field733[var1] = field733[var1 + 1];
                    field548[var1] = field548[var1 + 1];
                    field541[var1] = field541[var1 + 1];
                    field724[var1] = field724[var1 + 1];
                    field544[var1] = field544[var1 + 1];
                }
                var0--;
            }
        }
        if (field729 && !class139.method99()) {
            if (field626 != 0 && field728 != -1) {
                class139.method1505(Statics.field951, field728, 0, field626, false);
            }
            field729 = false;
        }
    }

    @ObfuscatedName("ap.e(Lan;IIII)V")
    public static void method232(class34 arg0, int arg1, int arg2, int arg3) {
        if (field510 >= 50 || field731 == 0 || arg0.field919 == null || arg1 >= arg0.field919.length) {
            return;
        }
        int var4 = arg0.field919[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field733[field510] = var5;
        field541[field510] = var6;
        field724[field510] = 0;
        field548[field510] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field544[field510] = (var8 << 16) + (var9 << 8) + var7;
        field510++;
    }

    @ObfuscatedName("bm.p(IIII)V")
    public static void method1225(int arg0, int arg1, int arg2) {
        if (field730 == 0 || arg1 == 0 || field510 >= 50) {
            return;
        }
        field733[field510] = arg0;
        field541[field510] = arg1;
        field724[field510] = arg2;
        field548[field510] = null;
        field544[field510] = 0;
        field510++;
    }

    @ObfuscatedName("n.i(II)V")
    public static void method140(int arg0) {
        if (arg0 == -1 && !field729) {
            Statics.field409.method2686();
            class139.field2378 = 1;
            Statics.field2599 = null;
        } else if (arg0 != -1 && field728 != arg0 && field626 != 0 && !field729) {
            class139.method1779(2, Statics.field951, arg0, 0, field626, false);
        }
        field728 = arg0;
    }

    @ObfuscatedName("ea.ap(Ljava/lang/String;B)V")
    public static final void method2587(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1472.field191 = !Statics.field1472.field191;
            class29 var1 = null;
            try {
                var1 = class82.method1326("", Statics.field714.field2109, true);
                class127 var2 = Statics.field1472.method113();
                var1.method527(var2.field2057, 0, var2.field2052);
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method528();
                }
            } catch (Exception var5) {
            }
            if (Statics.field1472.field191) {
                method105(0, "", "Roofs are now all hidden");
            } else {
                method105(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field658 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field688 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field688 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method38();
            }
            if (arg0.equalsIgnoreCase("errortest") && field496 == 2) {
                throw new RuntimeException();
            }
        }
        field504.method2218(240);
        field504.method2333(arg0.length() + 1);
        field504.method2309(arg0);
    }

    @ObfuscatedName("t.as(I)V")
    public static final void method106() {
        int var0 = field555 + Statics.field2555.field468;
        int var1 = field557 + Statics.field2555.field435;
        if (Statics.field2047 - var0 < -500 || Statics.field2047 - var0 > 500 || Statics.field1308 - var1 < -500 || Statics.field1308 - var1 > 500) {
            Statics.field2047 = var0;
            Statics.field1308 = var1;
        }
        if (Statics.field2047 != var0) {
            Statics.field2047 += (var0 - Statics.field2047) / 16;
        }
        if (Statics.field1308 != var1) {
            Statics.field1308 += (var1 - Statics.field1308) / 16;
        }
        if (class77.field1409 == 4 && Statics.field1273) {
            int var2 = class77.field1404 - field579;
            field523 = var2 * 2;
            field579 = var2 == -1 || var2 == 1 ? class77.field1404 : (field579 + class77.field1404) / 2;
            int var3 = field578 - class77.field1397;
            field576 = var3 * 2;
            field578 = var3 == -1 || var3 == 1 ? class77.field1397 : (field578 + class77.field1397) / 2;
        } else {
            if (class75.field1370[96]) {
                field576 += (-24 - field576) / 2;
            } else if (class75.field1370[97]) {
                field576 += (24 - field576) / 2;
            } else {
                field576 /= 2;
            }
            if (class75.field1370[98]) {
                field523 += (12 - field523) / 2;
            } else if (class75.field1370[99]) {
                field523 += (-12 - field523) / 2;
            } else {
                field523 /= 2;
            }
            field579 = class77.field1404;
            field578 = class77.field1397;
        }
        field575 = field576 / 2 + field575 & 0x7FF;
        field748 += field523 / 2;
        if (field748 < 128) {
            field748 = 128;
        }
        if (field748 > 383) {
            field748 = 383;
        }
        int var4 = Statics.field2047 >> 7;
        int var5 = Statics.field1308 >> 7;
        int var6 = method138(Statics.field2047, Statics.field1308, Statics.field178);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field178;
                    if (var10 < 3 && (class9.field141[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class9.field150[var10][var8][var9];
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
        if (var12 > field582) {
            field582 += (var12 - field582) / 24;
        } else if (var12 < field582) {
            field582 += (var12 - field582) / 80;
        }
    }

    @ObfuscatedName("m.ak(B)V")
    public static final void method118() {
        for (int var0 = -1; var0 < field516; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field738[var0];
            }
            class3 var2 = field610[var1];
            if (var2 != null) {
                method225(var2, 1);
            }
        }
    }

    @ObfuscatedName("i.af(Lap;II)V")
    public static final void method225(class27 arg0, int arg1) {
        if (arg0.field475 > field503) {
            method101(arg0);
        } else if (arg0.field476 >= field503) {
            method728(arg0);
        } else {
            arg0.field458 = arg0.field437;
            if (arg0.field483 == 0) {
                arg0.field487 = 0;
            } else {
                label424: {
                    if (arg0.field461 != -1 && arg0.field464 == 0) {
                        class34 var2 = Statics.method1425(arg0.field461);
                        if (arg0.field488 > 0 && var2.field904 == 0) {
                            arg0.field487++;
                            break label424;
                        }
                        if (arg0.field488 <= 0 && var2.field907 == 0) {
                            arg0.field487++;
                            break label424;
                        }
                    }
                    int var3 = arg0.field468;
                    int var4 = arg0.field435;
                    int var5 = arg0.field469[arg0.field483 - 1] * 128 + arg0.field470 * 64;
                    int var6 = arg0.field481[arg0.field483 - 1] * 128 + arg0.field470 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field489 = 1280;
                            } else if (var4 > var6) {
                                arg0.field489 = 1792;
                            } else {
                                arg0.field489 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field489 = 768;
                            } else if (var4 > var6) {
                                arg0.field489 = 256;
                            } else {
                                arg0.field489 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field489 = 1024;
                        } else if (var4 > var6) {
                            arg0.field489 = 0;
                        }
                        int var7 = arg0.field489 - arg0.field480 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field441;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field436;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field443;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field442;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field436;
                        }
                        arg0.field458 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class25) {
                            var10 = ((class25) arg0).field406.field825;
                        }
                        if (var10) {
                            if (arg0.field489 != arg0.field480 && arg0.field455 == -1 && arg0.field434 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field483 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field483 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field487 > 0 && arg0.field483 > 1) {
                                var9 = 8;
                                arg0.field487--;
                            }
                        } else {
                            if (arg0.field483 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field483 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field487 > 0 && arg0.field483 > 1) {
                                var9 = 8;
                                arg0.field487--;
                            }
                        }
                        if (arg0.field486[arg0.field483 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field458 == arg0.field436 && arg0.field444 != -1) {
                            arg0.field458 = arg0.field444;
                        }
                        if (var3 < var5) {
                            arg0.field468 += var9;
                            if (arg0.field468 > var5) {
                                arg0.field468 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field468 -= var9;
                            if (arg0.field468 < var5) {
                                arg0.field468 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field435 += var9;
                            if (arg0.field435 > var6) {
                                arg0.field435 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field435 -= var9;
                            if (arg0.field435 < var6) {
                                arg0.field435 = var6;
                            }
                        }
                        if (arg0.field468 == var5 && arg0.field435 == var6) {
                            arg0.field483--;
                            if (arg0.field488 > 0) {
                                arg0.field488--;
                            }
                        }
                    } else {
                        arg0.field468 = var5;
                        arg0.field435 = var6;
                    }
                }
            }
        }
        if (arg0.field468 < 128 || arg0.field435 < 128 || arg0.field468 >= 13184 || arg0.field435 >= 13184) {
            arg0.field461 = -1;
            arg0.field484 = -1;
            arg0.field475 = 0;
            arg0.field476 = 0;
            arg0.field468 = arg0.field469[0] * 128 + arg0.field470 * 64;
            arg0.field435 = arg0.field481[0] * 128 + arg0.field470 * 64;
            arg0.method230();
        }
        if (Statics.field2555 == arg0 && (arg0.field468 < 1536 || arg0.field435 < 1536 || arg0.field468 >= 11776 || arg0.field435 >= 11776)) {
            arg0.field461 = -1;
            arg0.field484 = -1;
            arg0.field475 = 0;
            arg0.field476 = 0;
            arg0.field468 = arg0.field469[0] * 128 + arg0.field470 * 64;
            arg0.field435 = arg0.field481[0] * 128 + arg0.field470 * 64;
            arg0.method230();
        }
        if (arg0.field434 != 0) {
            if (arg0.field455 != -1 && arg0.field455 < 32768) {
                class25 var11 = field529[arg0.field455];
                if (var11 != null) {
                    int var12 = arg0.field468 - var11.field468;
                    int var13 = arg0.field435 - var11.field435;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field489 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field455 >= 32768) {
                int var14 = arg0.field455 - 32768;
                if (field616 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field610[var14];
                if (var15 != null) {
                    int var16 = arg0.field468 - var15.field468;
                    int var17 = arg0.field435 - var15.field435;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field489 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field451 != 0 || arg0.field457 != 0) && (arg0.field483 == 0 || arg0.field487 > 0)) {
                int var18 = arg0.field468 - (arg0.field451 * 64 - Statics.field267 * 64 - Statics.field267 * 64);
                int var19 = arg0.field435 - (arg0.field457 * 64 - Statics.field1246 * 64 - Statics.field1246 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field489 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field451 = 0;
                arg0.field457 = 0;
            }
            int var20 = arg0.field489 - arg0.field480 & 0x7FF;
            if (var20 == 0) {
                arg0.field452 = 0;
            } else {
                arg0.field452++;
                if (var20 > 1024) {
                    arg0.field480 -= arg0.field434;
                    boolean var21 = true;
                    if (var20 < arg0.field434 || var20 > 2048 - arg0.field434) {
                        arg0.field480 = arg0.field489;
                        var21 = false;
                    }
                    if (arg0.field458 == arg0.field437 && (arg0.field452 > 25 || var21)) {
                        if (arg0.field438 == -1) {
                            arg0.field458 = arg0.field436;
                        } else {
                            arg0.field458 = arg0.field438;
                        }
                    }
                } else {
                    arg0.field480 += arg0.field434;
                    boolean var22 = true;
                    if (var20 < arg0.field434 || var20 > 2048 - arg0.field434) {
                        arg0.field480 = arg0.field489;
                        var22 = false;
                    }
                    if (arg0.field458 == arg0.field437 && (arg0.field452 > 25 || var22)) {
                        if (arg0.field439 == -1) {
                            arg0.field458 = arg0.field436;
                        } else {
                            arg0.field458 = arg0.field439;
                        }
                    }
                }
                arg0.field480 &= 0x7FF;
            }
        }
        arg0.field474 = false;
        if (arg0.field458 != -1) {
            class34 var24 = Statics.method1425(arg0.field458);
            if (var24 == null || var24.field899 == null) {
                arg0.field458 = -1;
            } else {
                arg0.field471++;
                if (arg0.field459 < var24.field899.length && arg0.field471 > var24.field906[arg0.field459]) {
                    arg0.field471 = 1;
                    arg0.field459++;
                    method232(var24, arg0.field459, arg0.field468, arg0.field435);
                }
                if (arg0.field459 >= var24.field899.length) {
                    arg0.field471 = 0;
                    arg0.field459 = 0;
                    method232(var24, arg0.field459, arg0.field468, arg0.field435);
                }
            }
        }
        if (arg0.field484 != -1 && field503 >= arg0.field466) {
            if (arg0.field467 < 0) {
                arg0.field467 = 0;
            }
            int var25 = class35.method743(arg0.field484).field926;
            if (var25 == -1) {
                arg0.field484 = -1;
            } else {
                class34 var26 = Statics.method1425(var25);
                if (var26 == null || var26.field899 == null) {
                    arg0.field484 = -1;
                } else {
                    arg0.field479++;
                    if (arg0.field467 < var26.field899.length && arg0.field479 > var26.field906[arg0.field467]) {
                        arg0.field479 = 1;
                        arg0.field467++;
                        method232(var26, arg0.field467, arg0.field468, arg0.field435);
                    }
                    if (arg0.field467 >= var26.field899.length && (arg0.field467 < 0 || arg0.field467 >= var26.field899.length)) {
                        arg0.field484 = -1;
                    }
                }
            }
        }
        if (arg0.field461 != -1 && arg0.field464 <= 1) {
            class34 var27 = Statics.method1425(arg0.field461);
            if (var27.field904 == 1 && arg0.field488 > 0 && arg0.field475 <= field503 && arg0.field476 < field503) {
                arg0.field464 = 1;
                return;
            }
        }
        if (arg0.field461 != -1 && arg0.field464 == 0) {
            class34 var28 = Statics.method1425(arg0.field461);
            if (var28 == null || var28.field899 == null) {
                arg0.field461 = -1;
            } else {
                arg0.field463++;
                if (arg0.field462 < var28.field899.length && arg0.field463 > var28.field906[arg0.field462]) {
                    arg0.field463 = 1;
                    arg0.field462++;
                    method232(var28, arg0.field462, arg0.field468, arg0.field435);
                }
                if (arg0.field462 >= var28.field899.length) {
                    arg0.field462 -= var28.field908;
                    arg0.field465++;
                    if (arg0.field465 >= var28.field917) {
                        arg0.field461 = -1;
                    } else if (arg0.field462 >= 0 && arg0.field462 < var28.field899.length) {
                        method232(var28, arg0.field462, arg0.field468, arg0.field435);
                    } else {
                        arg0.field461 = -1;
                    }
                }
                arg0.field474 = var28.field910;
            }
        }
        if (arg0.field464 > 0) {
            arg0.field464--;
        }
    }

    @ObfuscatedName("h.ag(Lap;B)V")
    public static final void method101(class27 arg0) {
        int var1 = arg0.field475 - field503;
        int var2 = arg0.field473 * 128 + arg0.field470 * 64;
        int var3 = arg0.field482 * 128 + arg0.field470 * 64;
        arg0.field468 += (var2 - arg0.field468) / var1;
        arg0.field435 += (var3 - arg0.field435) / var1;
        arg0.field487 = 0;
        if (arg0.field477 == 0) {
            arg0.field489 = 1024;
        }
        if (arg0.field477 == 1) {
            arg0.field489 = 1536;
        }
        if (arg0.field477 == 2) {
            arg0.field489 = 0;
        }
        if (arg0.field477 == 3) {
            arg0.field489 = 512;
        }
    }

    @ObfuscatedName("ad.aj(Lap;B)V")
    public static final void method728(class27 arg0) {
        if (field503 == arg0.field476 || arg0.field461 == -1 || arg0.field464 != 0 || arg0.field463 + 1 > Statics.method1425(arg0.field461).field906[arg0.field462]) {
            int var1 = arg0.field476 - arg0.field475;
            int var2 = field503 - arg0.field475;
            int var3 = arg0.field473 * 128 + arg0.field470 * 64;
            int var4 = arg0.field482 * 128 + arg0.field470 * 64;
            int var5 = arg0.field472 * 128 + arg0.field470 * 64;
            int var6 = arg0.field470 * 64 + arg0.field433 * 128;
            arg0.field468 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field435 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field487 = 0;
        if (arg0.field477 == 0) {
            arg0.field489 = 1024;
        }
        if (arg0.field477 == 1) {
            arg0.field489 = 1536;
        }
        if (arg0.field477 == 2) {
            arg0.field489 = 0;
        }
        if (arg0.field477 == 3) {
            arg0.field489 = 512;
        }
        arg0.field480 = arg0.field489;
    }

    @ObfuscatedName("bs.ac(Ly;IIB)V")
    public static void method1296(class3 arg0, int arg1, int arg2) {
        if (arg0.field461 == arg1 && arg1 != -1) {
            int var3 = Statics.method1425(arg1).field916;
            if (var3 == 1) {
                arg0.field462 = 0;
                arg0.field463 = 0;
                arg0.field464 = arg2;
                arg0.field465 = 0;
            }
            if (var3 == 2) {
                arg0.field465 = 0;
            }
        } else if (arg1 == -1 || arg0.field461 == -1 || Statics.method1425(arg1).field911 >= Statics.method1425(arg0.field461).field911) {
            arg0.field461 = arg1;
            arg0.field462 = 0;
            arg0.field463 = 0;
            arg0.field464 = arg2;
            arg0.field465 = 0;
            arg0.field488 = arg0.field483;
        }
    }

    @ObfuscatedName("eu.an(I)V")
    public static final void method2598() {
        if (field727 != -1) {
            int var0 = field727;
            if (class159.method227(var0)) {
                method2869(Statics.field2666[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field693; var1++) {
            if (field695[var1]) {
                field696[var1] = true;
            }
            field697[var1] = field695[var1];
            field695[var1] = false;
        }
        field694 = field503;
        field641 = -1;
        field515 = -1;
        Statics.field1989 = null;
        if (field727 != -1) {
            field693 = 0;
            method121(field727, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1764();
        if (field743) {
            method132();
        } else if (field641 != -1) {
            int var2 = field641;
            int var3 = field515;
            if (field676 >= 2 || field709 != 0 || field647) {
                String var4;
                if (field709 == 1 && field676 < 2) {
                    var4 = class135.field2256 + class135.field2266 + field736 + " " + class2.field20;
                } else if (field647 && field676 < 2) {
                    var4 = field556 + class135.field2266 + field650 + " " + class2.field20;
                } else {
                    int var5 = field676 - 1;
                    String var6;
                    if (field640[var5].length() > 0) {
                        var6 = field639[var5] + class135.field2266 + field640[var5];
                    } else {
                        var6 = field639[var5];
                    }
                    var4 = var6;
                }
                if (field676 > 2) {
                    var4 = var4 + class2.method1311(16777215) + " " + '/' + " " + (field676 - 2) + class135.field2260;
                }
                Statics.field216.method3239(var4, var2 + 4, var3 + 15, 16777215, 0, field503 / 1000);
            }
        }
        if (field702 == 3) {
            for (int var7 = 0; var7 < field693; var7++) {
                if (field697[var7]) {
                    class89.method1718(field698[var7], field699[var7], field645[var7], field701[var7], 16711935, 128);
                } else if (field696[var7]) {
                    class89.method1718(field698[var7], field699[var7], field645[var7], field701[var7], 16711680, 128);
                }
            }
        }
        int var8 = Statics.field178;
        int var9 = Statics.field2555.field468;
        int var10 = Statics.field2555.field435;
        int var11 = field567;
        for (class7 var12 = (class7) class7.field103.method3163(); var12 != null; var12 = (class7) class7.field103.method3165()) {
            if (var12.field101 != -1 || var12.field105 != null) {
                int var13 = 0;
                if (var9 > var12.field98) {
                    var13 += var9 - var12.field98;
                } else if (var9 < var12.field96) {
                    var13 += var12.field96 - var9;
                }
                if (var10 > var12.field99) {
                    var13 += var10 - var12.field99;
                } else if (var10 < var12.field97) {
                    var13 += var12.field97 - var10;
                }
                if (var13 - 64 > var12.field100 || field731 == 0 || var12.field95 != var8) {
                    if (var12.field102 != null) {
                        Statics.field113.method1063(var12.field102);
                        var12.field102 = null;
                    }
                    if (var12.field107 != null) {
                        Statics.field113.method1063(var12.field107);
                        var12.field107 = null;
                    }
                } else {
                    var13 -= 64;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = field731 * (var12.field100 - var13) / var12.field100;
                    class57 var10000;
                    if (var12.field102 != null) {
                        var12.field102.method1044(var14);
                    } else if (var12.field101 >= 0) {
                        var10000 = (class57) null;
                        class57 var15 = class57.method1209(Statics.field770, var12.field101, 0);
                        if (var15 != null) {
                            class63 var16 = var15.method1199().method1276(Statics.field737);
                            class45 var17 = class45.method1022(var16, 100, var14);
                            var17.method917(-1);
                            Statics.field113.method1057(var17);
                            var12.field102 = var17;
                        }
                    }
                    if (var12.field107 != null) {
                        var12.field107.method1044(var14);
                        if (!var12.field107.method3198()) {
                            var12.field107 = null;
                        }
                    } else if (var12.field105 != null && (var12.field106 -= var11) <= 0) {
                        int var18 = (int) (Math.random() * (double) var12.field105.length);
                        var10000 = (class57) null;
                        class57 var19 = class57.method1209(Statics.field770, var12.field105[var18], 0);
                        if (var19 != null) {
                            class63 var20 = var19.method1199().method1276(Statics.field737);
                            class45 var21 = class45.method1022(var20, 100, var14);
                            var21.method917(0);
                            Statics.field113.method1057(var21);
                            var12.field107 = var21;
                            var12.field106 = var12.field114 + (int) (Math.random() * (double) (var12.field108 - var12.field114));
                        }
                    }
                }
            }
        }
        field567 = 0;
    }

    @ObfuscatedName("w.ad(Ljava/lang/String;ZI)V")
    public static final void method201(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2582.method3277(arg0, 250);
        int var6 = Statics.field2582.method3229(arg0, 250) * 13;
        class89.method1711(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1713(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2582.method3295(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method169(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method176(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1394.getGraphics();
            Statics.field1197.method1533(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1394.repaint();
        }
    }

    @ObfuscatedName("a.ai(IIIII)V")
    public static final void method65(int arg0, int arg1, int arg2, int arg3) {
        class89.method1705(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2032();
        field594++;
        method1589(true);
        method1183(true);
        method1589(false);
        method1183(false);
        for (class10 var4 = (class10) field717.method3163(); var4 != null; var4 = (class10) field717.method3165()) {
            if (Statics.field178 != var4.field152 || field503 > var4.field158) {
                var4.method3196();
            } else if (field503 >= var4.field157) {
                if (var4.field155 > 0) {
                    class25 var5 = field529[var4.field155 - 1];
                    if (var5 != null && var5.field468 >= 0 && var5.field468 < 13312 && var5.field435 >= 0 && var5.field435 < 13312) {
                        var4.method98(var5.field468, var5.field435, method138(var5.field468, var5.field435, var4.field152) - var4.field156, field503);
                    }
                }
                if (var4.field155 < 0) {
                    int var6 = -var4.field155 - 1;
                    class3 var7;
                    if (field616 == var6) {
                        var7 = Statics.field2555;
                    } else {
                        var7 = field610[var6];
                    }
                    if (var7 != null && var7.field468 >= 0 && var7.field468 < 13312 && var7.field435 >= 0 && var7.field435 < 13312) {
                        var4.method98(var7.field468, var7.field435, method138(var7.field468, var7.field435, var4.field152) - var4.field156, field503);
                    }
                }
                var4.method94(field567);
                Statics.field550.method1797(Statics.field178, (int) var4.field163, (int) var4.field168, (int) var4.field177, 60, var4, var4.field162, -1, false);
            }
        }
        method2258();
        if (!field739) {
            int var8 = field748;
            if (field582 / 256 > var8) {
                var8 = field582 / 256;
            }
            if (field732[4] && field741[4] + 128 > var8) {
                var8 = field741[4] + 128;
            }
            int var9 = field720 + field575 & 0x7FF;
            int var10 = Statics.field2047;
            int var11 = method138(Statics.field2555.field468, Statics.field2555.field435, Statics.field178) - 50;
            int var12 = Statics.field1308;
            int var13 = var8 * 3 + 600;
            int var14 = 2048 - var8 & 0x7FF;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 0;
            int var17 = 0;
            int var18 = var13;
            if (var14 != 0) {
                int var19 = class104.field1776[var14];
                int var20 = class104.field1789[var14];
                int var21 = var17 * var20 - var13 * var19 >> 16;
                var18 = var17 * var19 + var13 * var20 >> 16;
                var17 = var21;
            }
            if (var15 != 0) {
                int var22 = class104.field1776[var15];
                int var23 = class104.field1789[var15];
                int var24 = var16 * var23 + var18 * var22 >> 16;
                var18 = var18 * var23 - var16 * var22 >> 16;
                var16 = var24;
            }
            Statics.field1200 = var10 - var16;
            Statics.field1341 = var11 - var17;
            Statics.field1567 = var12 - var18;
            Statics.field1482 = var8;
            Statics.field362 = var9;
        }
        int var37;
        if (field739) {
            int var38;
            if (Statics.field1472.field191) {
                var38 = Statics.field178;
            } else {
                int var39 = method138(Statics.field1200, Statics.field1567, Statics.field178);
                if (var39 - Statics.field1341 >= 800 || (class9.field141[Statics.field178][Statics.field1200 >> 7][Statics.field1567 >> 7] & 0x4) == 0) {
                    var38 = 3;
                } else {
                    var38 = Statics.field178;
                }
            }
            var37 = var38;
        } else {
            int var25;
            if (Statics.field1472.field191) {
                var25 = Statics.field178;
            } else {
                int var26 = 3;
                if (Statics.field1482 < 310) {
                    int var27 = Statics.field1200 >> 7;
                    int var28 = Statics.field1567 >> 7;
                    int var29 = Statics.field2555.field468 >> 7;
                    int var30 = Statics.field2555.field435 >> 7;
                    if ((class9.field141[Statics.field178][var27][var28] & 0x4) != 0) {
                        var26 = Statics.field178;
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
                            if ((class9.field141[Statics.field178][var27][var28] & 0x4) != 0) {
                                var26 = Statics.field178;
                            }
                            var34 += var33;
                            if (var34 >= 65536) {
                                var34 -= 65536;
                                if (var28 < var30) {
                                    var28++;
                                } else if (var28 > var30) {
                                    var28--;
                                }
                                if ((class9.field141[Statics.field178][var27][var28] & 0x4) != 0) {
                                    var26 = Statics.field178;
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
                            if ((class9.field141[Statics.field178][var27][var28] & 0x4) != 0) {
                                var26 = Statics.field178;
                            }
                            var36 += var35;
                            if (var36 >= 65536) {
                                var36 -= 65536;
                                if (var27 < var29) {
                                    var27++;
                                } else if (var27 > var29) {
                                    var27--;
                                }
                                if ((class9.field141[Statics.field178][var27][var28] & 0x4) != 0) {
                                    var26 = Statics.field178;
                                }
                            }
                        }
                    }
                }
                if ((class9.field141[Statics.field178][Statics.field2555.field468 >> 7][Statics.field2555.field435 >> 7] & 0x4) != 0) {
                    var26 = Statics.field178;
                }
                var25 = var26;
            }
            var37 = var25;
        }
        int var40 = Statics.field1200;
        int var41 = Statics.field1341;
        int var42 = Statics.field1567;
        int var43 = Statics.field1482;
        int var44 = Statics.field362;
        for (int var45 = 0; var45 < 5; var45++) {
            if (field732[var45]) {
                int var46 = (int) (Math.random() * (double) (field740[var45] * 2 + 1) - (double) field740[var45] + Math.sin((double) field742[var45] / 100.0D * (double) field661[var45]) * (double) field741[var45]);
                if (var45 == 0) {
                    Statics.field1200 += var46;
                }
                if (var45 == 1) {
                    Statics.field1341 += var46;
                }
                if (var45 == 2) {
                    Statics.field1567 += var46;
                }
                if (var45 == 3) {
                    Statics.field362 = Statics.field362 + var46 & 0x7FF;
                }
                if (var45 == 4) {
                    Statics.field1482 += var46;
                    if (Statics.field1482 < 128) {
                        Statics.field1482 = 128;
                    }
                    if (Statics.field1482 > 383) {
                        Statics.field1482 = 383;
                    }
                }
            }
        }
        int var47 = class77.field1397;
        int var48 = class77.field1404;
        if (class77.field1403 != 0) {
            var47 = class77.field1410;
            var48 = class77.field1413;
        }
        if (var47 >= arg0 && var47 < arg0 + arg2 && var48 >= arg1 && var48 < arg1 + arg3) {
            class112.field1923 = true;
            class112.field1926 = 0;
            class112.field1924 = var47 - arg0;
            class112.field1868 = var48 - arg1;
        } else {
            class112.field1923 = false;
            class112.field1926 = 0;
        }
        method655();
        class89.method1711(arg0, arg1, arg2, arg3, 0);
        method655();
        Statics.field550.method1823(Statics.field1200, Statics.field1341, Statics.field1567, Statics.field1482, Statics.field362, var37);
        method655();
        Statics.field550.method1934();
        field583 = 0;
        for (int var49 = -1; var49 < field530 + field516; var49++) {
            class27 var50;
            if (var49 == -1) {
                var50 = Statics.field2555;
            } else if (var49 < field516) {
                var50 = field610[field738[var49]];
            } else {
                var50 = field529[field531[var49 - field516]];
            }
            if (var50 != null && var50.method14()) {
                if (var50 instanceof class25) {
                    class31 var51 = ((class25) var50).field406;
                    if (var51.field824 != null) {
                        var51 = var51.method583();
                    }
                    if (var51 == null) {
                        continue;
                    }
                }
                if (var49 >= field516) {
                    class31 var54 = ((class25) var50).field406;
                    if (var54.field824 != null) {
                        var54 = var54.method583();
                    }
                    if (var54.field809 >= 0 && var54.field809 < Statics.field305.length) {
                        method135(var50, var50.field440 + 15);
                        if (field595 > -1) {
                            Statics.field305[var54.field809].method1603(field595 + arg0 - 12, field596 + arg1 - 30);
                        }
                    }
                    if (field633 == 1 && field512 == field531[var49 - field516] && field503 % 20 < 10) {
                        method135(var50, var50.field440 + 15);
                        if (field595 > -1) {
                            Statics.field228[0].method1603(field595 + arg0 - 12, field596 + arg1 - 28);
                        }
                    }
                } else {
                    int var52 = 30;
                    class3 var53 = (class3) var50;
                    if (var53.field36 != -1 || var53.field33 != -1) {
                        method135(var50, var50.field440 + 15);
                        if (field595 > -1) {
                            if (var53.field36 != -1) {
                                Statics.field1995[var53.field36].method1603(field595 + arg0 - 12, field596 + arg1 - var52);
                                var52 += 25;
                            }
                            if (var53.field33 != -1) {
                                Statics.field305[var53.field33].method1603(field595 + arg0 - 12, field596 + arg1 - var52);
                                var52 += 25;
                            }
                        }
                    }
                    if (var49 >= 0 && field633 == 10 && field513 == field738[var49]) {
                        method135(var50, var50.field440 + 15);
                        if (field595 > -1) {
                            Statics.field228[1].method1603(field595 + arg0 - 12, field596 + arg1 - var52);
                        }
                    }
                }
                if (var50.field445 != null && (var49 >= field516 || field752 == 0 || field752 == 3 || field752 == 1 && method1(((class3) var50).field50))) {
                    method135(var50, var50.field440);
                    if (field595 > -1 && field583 < field584) {
                        field588[field583] = Statics.field216.method3228(var50.field445) / 2;
                        field587[field583] = Statics.field216.field2843;
                        field585[field583] = field595;
                        field586[field583] = field596;
                        field607[field583] = var50.field447;
                        field505[field583] = var50.field448;
                        field591[field583] = var50.field446;
                        field592[field583] = var50.field445;
                        field583++;
                    }
                }
                if (var50.field432 > field503) {
                    method135(var50, var50.field440 + 15);
                    if (field595 > -1) {
                        int var55 = var50.field453 * 30 / var50.field456;
                        if (var55 > 30) {
                            var55 = 30;
                        } else if (var55 == 0 && var50.field453 > 0) {
                            var55 = 1;
                        }
                        class89.method1711(field595 + arg0 - 15, field596 + arg1 - 3, var55, 5, 65280);
                        class89.method1711(field595 + arg0 - 15 + var55, field596 + arg1 - 3, 30 - var55, 5, 16711680);
                    }
                }
                for (int var56 = 0; var56 < 4; var56++) {
                    if (var50.field454[var56] > field503) {
                        method135(var50, var50.field440 / 2);
                        if (field595 > -1) {
                            if (var56 == 1) {
                                field596 -= 20;
                            }
                            if (var56 == 2) {
                                field595 -= 15;
                                field596 -= 10;
                            }
                            if (var56 == 3) {
                                field595 += 15;
                                field596 -= 10;
                            }
                            Statics.field1809[var50.field450[var56]].method1603(field595 + arg0 - 12, field596 + arg1 - 12);
                            Statics.field350.method3286(Integer.toString(var50.field449[var56]), field595 + arg0 - 1, field596 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var57 = 0; var57 < field583; var57++) {
            int var58 = field585[var57];
            int var59 = field586[var57];
            int var60 = field588[var57];
            int var61 = field587[var57];
            boolean var62 = true;
            while (var62) {
                var62 = false;
                for (int var63 = 0; var63 < var57; var63++) {
                    if (var59 + 2 > field586[var63] - field587[var63] && var59 - var61 < field586[var63] + 2 && var58 - var60 < field588[var63] + field585[var63] && var58 + var60 > field585[var63] - field588[var63] && field586[var63] - field587[var63] < var59) {
                        var59 = field586[var63] - field587[var63];
                        var62 = true;
                    }
                }
            }
            field595 = field585[var57];
            field596 = field586[var57] = var59;
            String var64 = field592[var57];
            if (field653 == 0) {
                int var65 = 16776960;
                if (field607[var57] < 6) {
                    var65 = field539[field607[var57]];
                }
                if (field607[var57] == 6) {
                    var65 = field594 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field607[var57] == 7) {
                    var65 = field594 % 20 < 10 ? 255 : 65535;
                }
                if (field607[var57] == 8) {
                    var65 = field594 % 20 < 10 ? 45056 : 8454016;
                }
                if (field607[var57] == 9) {
                    int var66 = 150 - field591[var57];
                    if (var66 < 50) {
                        var65 = var66 * 1280 + 16711680;
                    } else if (var66 < 100) {
                        var65 = 16776960 - (var66 - 50) * 327680;
                    } else if (var66 < 150) {
                        var65 = (var66 - 100) * 5 + 65280;
                    }
                }
                if (field607[var57] == 10) {
                    int var67 = 150 - field591[var57];
                    if (var67 < 50) {
                        var65 = var67 * 5 + 16711680;
                    } else if (var67 < 100) {
                        var65 = 16711935 - (var67 - 50) * 327680;
                    } else if (var67 < 150) {
                        var65 = (var67 - 100) * 327680 + 255 - (var67 - 100) * 5;
                    }
                }
                if (field607[var57] == 11) {
                    int var68 = 150 - field591[var57];
                    if (var68 < 50) {
                        var65 = 16777215 - var68 * 327685;
                    } else if (var68 < 100) {
                        var65 = (var68 - 50) * 327685 + 65280;
                    } else if (var68 < 150) {
                        var65 = 16777215 - (var68 - 100) * 327680;
                    }
                }
                if (field505[var57] == 0) {
                    Statics.field216.method3286(var64, field595 + arg0, field596 + arg1, var65, 0);
                }
                if (field505[var57] == 1) {
                    Statics.field216.method3245(var64, field595 + arg0, field596 + arg1, var65, 0, field594);
                }
                if (field505[var57] == 2) {
                    Statics.field216.method3262(var64, field595 + arg0, field596 + arg1, var65, 0, field594);
                }
                if (field505[var57] == 3) {
                    Statics.field216.method3238(var64, field595 + arg0, field596 + arg1, var65, 0, field594, 150 - field591[var57]);
                }
                if (field505[var57] == 4) {
                    int var69 = (150 - field591[var57]) * (Statics.field216.method3228(var64) + 100) / 150;
                    class89.method1706(field595 + arg0 - 50, arg1, field595 + arg0 + 50, arg1 + arg3);
                    Statics.field216.method3232(var64, field595 + arg0 + 50 - var69, field596 + arg1, var65, 0);
                    class89.method1705(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field505[var57] == 5) {
                    int var70 = 150 - field591[var57];
                    int var71 = 0;
                    if (var70 < 25) {
                        var71 = var70 - 25;
                    } else if (var70 > 125) {
                        var71 = var70 - 125;
                    }
                    class89.method1706(arg0, field596 + arg1 - Statics.field216.field2843 - 1, arg0 + arg2, field596 + arg1 + 5);
                    Statics.field216.method3286(var64, field595 + arg0, field596 + arg1 + var71, var65, 0);
                    class89.method1705(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field216.method3286(var64, field595 + arg0, field596 + arg1, 16776960, 0);
            }
        }
        method1958(arg0, arg1);
        ((class110) Statics.field1780).method2125(field567);
        if (field600 == 1) {
            Statics.field402[field599 / 100].method1603(field597 - 8, field598 - 8);
        }
        if (field600 == 2) {
            Statics.field402[field599 / 100 + 4].method1603(field597 - 8, field598 - 8);
        }
        field574 = 0;
        int var72 = (Statics.field2555.field468 >> 7) + Statics.field267;
        int var73 = (Statics.field2555.field435 >> 7) + Statics.field1246;
        if (var72 >= 3053 && var72 <= 3156 && var73 >= 3056 && var73 <= 3136) {
            field574 = 1;
        }
        if (var72 >= 3072 && var72 <= 3118 && var73 >= 9492 && var73 <= 9535) {
            field574 = 1;
        }
        if (field574 == 1 && var72 >= 3139 && var72 <= 3199 && var73 >= 3008 && var73 <= 3062) {
            field574 = 0;
        }
        if (field688) {
            int var74 = arg0 + 512 - 5;
            int var75 = arg1 + 20;
            Statics.field2582.method3233("Fps:" + field1336, var74, var75, 16776960, -1);
            int var79 = var75 + 15;
            Runtime var76 = Runtime.getRuntime();
            int var77 = (int) ((var76.totalMemory() - var76.freeMemory()) / 1024L);
            int var78 = 16776960;
            if (var77 > 32768 && field499) {
                var78 = 16711680;
            }
            if (var77 > 65536 && !field499) {
                var78 = 16711680;
            }
            Statics.field2582.method3233("Mem:" + var77 + "k", var74, var79, var78, -1);
            var75 = var79 + 15;
        }
        Statics.field1200 = var40;
        Statics.field1341 = var41;
        Statics.field1567 = var42;
        Statics.field1482 = var43;
        Statics.field362 = var44;
        if (field502 && class154.method195(true, false) == 0) {
            field502 = false;
        }
        if (field502) {
            class89.method1711(arg0, arg1, arg2, arg3, 0);
            method201(class135.field2191, false);
        }
    }

    @ObfuscatedName("cj.ae(ZB)V")
    public static final void method1589(boolean arg0) {
        if (Statics.field2555.field468 >> 7 == field665 && Statics.field2555.field435 >> 7 == field725) {
            field665 = 0;
        }
        int var1 = field516;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2555;
                var4 = 33538048;
            } else {
                var3 = field610[field738[var2]];
                var4 = field738[var2] << 14;
            }
            if (var3 != null && var3.method14()) {
                var3.field47 = false;
                if ((field499 && field516 > 50 || field516 > 200) && !arg0 && var3.field458 == var3.field437) {
                    var3.field47 = true;
                }
                int var5 = var3.field468 >> 7;
                int var6 = var3.field435 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field32 == null || field503 < var3.field37 || field503 >= var3.field38) {
                        if ((var3.field468 & 0x7F) == 64 && (var3.field435 & 0x7F) == 64) {
                            if (field594 == field668[var5][var6]) {
                                continue;
                            }
                            field668[var5][var6] = field594;
                        }
                        var3.field45 = method138(var3.field468, var3.field435, Statics.field178);
                        Statics.field550.method1797(Statics.field178, var3.field468, var3.field435, var3.field45, 60, var3, var3.field480, var4, var3.field474);
                    } else {
                        var3.field47 = false;
                        var3.field45 = method138(var3.field468, var3.field435, Statics.field178);
                        Statics.field550.method1930(Statics.field178, var3.field468, var3.field435, var3.field45, 60, var3, var3.field480, var4, var3.field43, var3.field42, var3.field49, var3.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("be.au(ZI)V")
    public static final void method1183(boolean arg0) {
        for (int var1 = 0; var1 < field530; var1++) {
            class25 var2 = field529[field531[var1]];
            int var3 = (field531[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field406.field820 == arg0 && var2.field406.method584()) {
                int var4 = var2.field468 >> 7;
                int var5 = var2.field435 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field470 == 1 && (var2.field468 & 0x7F) == 64 && (var2.field435 & 0x7F) == 64) {
                        if (field594 == field668[var4][var5]) {
                            continue;
                        }
                        field668[var4][var5] = field594;
                    }
                    if (!var2.field406.field823) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field550.method1797(Statics.field178, var2.field468, var2.field435, method138(var2.field468 + (var2.field470 * 64 - 64), var2.field435 + (var2.field470 * 64 - 64), Statics.field178), var2.field470 * 64 - 64 + 60, var2, var2.field480, var3, var2.field474);
                }
            }
        }
    }

    @ObfuscatedName("dx.at(I)V")
    public static final void method2258() {
        for (class20 var0 = (class20) field627.method3163(); var0 != null; var0 = (class20) field627.method3165()) {
            if (Statics.field178 != var0.field302 || var0.field303) {
                var0.method3196();
            } else if (field503 >= var0.field299) {
                var0.method157(field567);
                if (var0.field303) {
                    var0.method3196();
                } else {
                    Statics.field550.method1797(var0.field302, var0.field297, var0.field298, var0.field296, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("cb.ax(III)V")
    public static final void method1958(int arg0, int arg1) {
        if (field633 == 2) {
            method198((field514 - Statics.field267 << 7) + field517, (field611 - Statics.field1246 << 7) + field753, field638 * 2);
            if (field595 > -1 && field503 % 20 < 10) {
                Statics.field228[0].method1603(field595 + arg0 - 12, field596 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("b.aq(Lap;IB)V")
    public static final void method135(class27 arg0, int arg1) {
        method198(arg0.field468, arg0.field435, arg1);
    }

    @ObfuscatedName("k.aw(IIII)V")
    public static final void method198(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field595 = -1;
            field596 = -1;
            return;
        }
        int var3 = method138(arg0, arg1, Statics.field178) - arg2;
        int var4 = arg0 - Statics.field1200;
        int var5 = var3 - Statics.field1341;
        int var6 = arg1 - Statics.field1567;
        int var7 = class104.field1776[Statics.field1482];
        int var8 = class104.field1789[Statics.field1482];
        int var9 = class104.field1776[Statics.field362];
        int var10 = class104.field1789[Statics.field362];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field595 = (var11 << 9) / var15 + 256;
            field596 = (var14 << 9) / var15 + 167;
        } else {
            field595 = -1;
            field596 = -1;
        }
    }

    @ObfuscatedName("b.ao(IIIB)I")
    public static final int method138(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field141[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field150[var5][var3][var4] + class9.field150[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field150[var5][var3][var4 + 1] + class9.field150[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ad.ah(IIIIII)V")
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field769 == arg0 && Statics.field55 == arg1 && field710 == arg2 || !field499) {
            return;
        }
        Statics.field769 = arg0;
        Statics.field55 = arg1;
        field710 = arg2;
        if (!field499) {
            field710 = 0;
        }
        method22(25);
        method201(class135.field2191, true);
        int var5 = Statics.field267;
        int var6 = Statics.field1246;
        Statics.field267 = (arg0 - 6) * 8;
        Statics.field1246 = (arg1 - 6) * 8;
        int var7 = Statics.field267 - var5;
        int var8 = Statics.field1246 - var6;
        int var9 = Statics.field267;
        int var10 = Statics.field1246;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field529[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field469[var13] -= var7;
                    var12.field481[var13] -= var8;
                }
                var12.field468 -= var7 * 128;
                var12.field435 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field610[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field469[var16] -= var7;
                    var15.field481[var16] -= var8;
                }
                var15.field468 -= var7 * 128;
                var15.field435 -= var8 * 128;
            }
        }
        Statics.field178 = arg2;
        Statics.field2555.method229(arg3, arg4, false);
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
                        field624[var27][var23][var24] = field624[var27][var25][var26];
                    } else {
                        field624[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field625.method3163(); var28 != null; var28 = (class22) field625.method3165()) {
            var28.field355 -= var7;
            var28.field353 -= var8;
            if (var28.field355 < 0 || var28.field353 < 0 || var28.field355 >= 104 || var28.field353 >= 104) {
                var28.method3196();
            }
        }
        if (field665 != 0) {
            field665 -= var7;
            field725 -= var8;
        }
        field510 = 0;
        field739 = false;
        field719 = -1;
        field627.method3175();
        field717.method3175();
    }

    @ObfuscatedName("ep.av(ZI)V")
    public static final void method2972(boolean arg0) {
        method655();
        field538++;
        if (field538 < 50 && !arg0) {
            return;
        }
        field538 = 0;
        if (field543 || Statics.field347 == null) {
            return;
        }
        field504.method2218(88);
        try {
            Statics.field347.method1347(field504.field2057, 0, field504.field2052);
            field504.field2052 = 0;
        } catch (IOException var2) {
            field543 = true;
        }
    }

    @ObfuscatedName("eb.am(I)V")
    public static final void method2596() {
        method2972(false);
        field545 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field396.length; var1++) {
            if (Statics.field6[var1] != -1 && Statics.field396[var1] == null) {
                Statics.field396[var1] = Statics.field2801.method2886(Statics.field6[var1], 0);
                if (Statics.field396[var1] == null) {
                    var0 = false;
                    field545++;
                }
            }
            if (Statics.field2491[var1] != -1 && Statics.field1476[var1] == null) {
                Statics.field1476[var1] = Statics.field2801.method2942(Statics.field2491[var1], 0, Statics.field170[var1]);
                if (Statics.field1476[var1] == null) {
                    var0 = false;
                    field545++;
                }
            }
        }
        if (!var0) {
            field549 = 1;
            return;
        }
        field723 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field396.length; var3++) {
            byte[] var4 = Statics.field1476[var3];
            if (var4 != null) {
                int var5 = (Statics.field209[var3] >> 8) * 64 - Statics.field267;
                int var6 = (Statics.field209[var3] & 0xFF) * 64 - Statics.field1246;
                if (field552) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class127 var9 = new class127(var4);
                int var10 = -1;
                label1189: while (true) {
                    int var11 = var9.method2331();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2331();
                            if (var16 == 0) {
                                continue label1189;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2383() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class32 var22 = class32.method1446(var10);
                                if (var19 != 22 || !field499 || var22.field841 != 0 || var22.field844 == 1 || var22.field865) {
                                    if (!var22.method611()) {
                                        field723++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2331();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2383();
                    }
                }
            }
        }
        if (!var2) {
            field549 = 2;
            return;
        }
        if (field549 != 0) {
            method201(class135.field2191 + class2.field21 + class2.field18 + 100 + "%" + class2.field19, true);
        }
        method655();
        method1962();
        method655();
        Statics.field550.method1786();
        method655();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field551[var23].method2553();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field141[var24][var25][var26] = 0;
                }
            }
        }
        method655();
        class9.method790();
        int var27 = Statics.field396.length;
        class7.method3201();
        method2972(true);
        if (!field552) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field209[var28] >> 8) * 64 - Statics.field267;
                int var30 = (Statics.field209[var28] & 0xFF) * 64 - Statics.field1246;
                byte[] var31 = Statics.field396[var28];
                if (var31 != null) {
                    method655();
                    int var32 = Statics.field769 * 8 - 48;
                    int var33 = Statics.field55 * 8 - 48;
                    class130[] var34 = field551;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2076[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class127 var38 = new class127(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class9.method209(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field209[var42] >> 8) * 64 - Statics.field267;
                int var44 = (Statics.field209[var42] & 0xFF) * 64 - Statics.field1246;
                byte[] var45 = Statics.field396[var42];
                if (var45 == null && Statics.field55 < 800) {
                    method655();
                    class9.method56(var43, var44, 64, 64);
                }
            }
            method2972(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field1476[var46];
                if (var47 != null) {
                    int var48 = (Statics.field209[var46] >> 8) * 64 - Statics.field267;
                    int var49 = (Statics.field209[var46] & 0xFF) * 64 - Statics.field1246;
                    method655();
                    class9.method124(var47, var48, var49, Statics.field550, field551);
                }
            }
        }
        if (field552) {
            for (int var50 = 0; var50 < 4; var50++) {
                method655();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field553[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field209.length; var60++) {
                                if (Statics.field209[var60] == var59 && Statics.field396[var60] != null) {
                                    byte[] var61 = Statics.field396[var60];
                                    int var62 = var51 * 8;
                                    int var63 = var52 * 8;
                                    int var64 = (var57 & 0x7) * 8;
                                    int var65 = (var58 & 0x7) * 8;
                                    class130[] var66 = field551;
                                    for (int var67 = 0; var67 < 8; var67++) {
                                        for (int var68 = 0; var68 < 8; var68++) {
                                            if (var62 + var67 > 0 && var62 + var67 < 103 && var63 + var68 > 0 && var63 + var68 < 103) {
                                                var66[var50].field2076[var62 + var67][var63 + var68] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class127 var69 = new class127(var61);
                                    for (int var70 = 0; var70 < 4; var70++) {
                                        for (int var71 = 0; var71 < 64; var71++) {
                                            for (int var72 = 0; var72 < 64; var72++) {
                                                if (var55 == var70 && var71 >= var64 && var71 < var64 + 8 && var72 >= var65 && var72 < var65 + 8) {
                                                    int var76 = var71 & 0x7;
                                                    int var77 = var72 & 0x7;
                                                    int var79 = var56 & 0x3;
                                                    int var80;
                                                    if (var79 == 0) {
                                                        var80 = var76;
                                                    } else if (var79 == 1) {
                                                        var80 = var77;
                                                    } else if (var79 == 2) {
                                                        var80 = 7 - var76;
                                                    } else {
                                                        var80 = 7 - var77;
                                                    }
                                                    int var83 = var62 + var80;
                                                    int var85 = var71 & 0x7;
                                                    int var86 = var72 & 0x7;
                                                    int var88 = var56 & 0x3;
                                                    int var89;
                                                    if (var88 == 0) {
                                                        var89 = var86;
                                                    } else if (var88 == 1) {
                                                        var89 = 7 - var85;
                                                    } else if (var88 == 2) {
                                                        var89 = 7 - var86;
                                                    } else {
                                                        var89 = var85;
                                                    }
                                                    class9.method209(var69, var50, var83, var63 + var89, 0, 0, var56);
                                                } else {
                                                    class9.method209(var69, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            Statics.method9(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var90 = 0; var90 < 13; var90++) {
                for (int var91 = 0; var91 < 13; var91++) {
                    int var92 = field553[0][var90][var91];
                    if (var92 == -1) {
                        class9.method56(var90 * 8, var91 * 8, 8, 8);
                    }
                }
            }
            method2972(true);
            for (int var93 = 0; var93 < 4; var93++) {
                method655();
                for (int var94 = 0; var94 < 13; var94++) {
                    label994: for (int var95 = 0; var95 < 13; var95++) {
                        int var96 = field553[var93][var94][var95];
                        if (var96 != -1) {
                            int var97 = var96 >> 24 & 0x3;
                            int var98 = var96 >> 1 & 0x3;
                            int var99 = var96 >> 14 & 0x3FF;
                            int var100 = var96 >> 3 & 0x7FF;
                            int var101 = (var99 / 8 << 8) + var100 / 8;
                            for (int var102 = 0; var102 < Statics.field209.length; var102++) {
                                if (Statics.field209[var102] == var101 && Statics.field1476[var102] != null) {
                                    byte[] var103 = Statics.field1476[var102];
                                    int var104 = var94 * 8;
                                    int var105 = var95 * 8;
                                    int var106 = (var99 & 0x7) * 8;
                                    int var107 = (var100 & 0x7) * 8;
                                    class95 var108 = Statics.field550;
                                    class130[] var109 = field551;
                                    class127 var110 = new class127(var103);
                                    int var111 = -1;
                                    while (true) {
                                        int var112 = var110.method2331();
                                        if (var112 == 0) {
                                            continue label994;
                                        }
                                        var111 += var112;
                                        int var113 = 0;
                                        while (true) {
                                            int var114 = var110.method2331();
                                            if (var114 == 0) {
                                                break;
                                            }
                                            var113 += var114 - 1;
                                            int var115 = var113 & 0x3F;
                                            int var116 = var113 >> 6 & 0x3F;
                                            int var117 = var113 >> 12;
                                            int var118 = var110.method2383();
                                            int var119 = var118 >> 2;
                                            int var120 = var118 & 0x3;
                                            if (var97 == var117 && var116 >= var106 && var116 < var106 + 8 && var115 >= var107 && var115 < var107 + 8) {
                                                class32 var121 = class32.method1446(var111);
                                                int var123 = var116 & 0x7;
                                                int var124 = var115 & 0x7;
                                                int var126 = var121.field842;
                                                int var127 = var121.field835;
                                                if ((var120 & 0x1) == 1) {
                                                    int var128 = var126;
                                                    var126 = var127;
                                                    var127 = var128;
                                                }
                                                int var129 = var98 & 0x3;
                                                int var130;
                                                if (var129 == 0) {
                                                    var130 = var123;
                                                } else if (var129 == 1) {
                                                    var130 = var124;
                                                } else if (var129 == 2) {
                                                    var130 = 7 - var123 - (var126 - 1);
                                                } else {
                                                    var130 = 7 - var124 - (var127 - 1);
                                                }
                                                int var131 = var104 + var130;
                                                int var133 = var116 & 0x7;
                                                int var134 = var115 & 0x7;
                                                int var136 = var121.field842;
                                                int var137 = var121.field835;
                                                if ((var120 & 0x1) == 1) {
                                                    int var138 = var136;
                                                    var136 = var137;
                                                    var137 = var138;
                                                }
                                                int var139 = var98 & 0x3;
                                                int var140;
                                                if (var139 == 0) {
                                                    var140 = var134;
                                                } else if (var139 == 1) {
                                                    var140 = 7 - var133 - (var136 - 1);
                                                } else if (var139 == 2) {
                                                    var140 = 7 - var134 - (var137 - 1);
                                                } else {
                                                    var140 = var133;
                                                }
                                                int var141 = var105 + var140;
                                                if (var131 > 0 && var141 > 0 && var131 < 103 && var141 < 103) {
                                                    int var142 = var93;
                                                    if ((class9.field141[1][var131][var141] & 0x2) == 2) {
                                                        var142 = var93 - 1;
                                                    }
                                                    class130 var143 = null;
                                                    if (var142 >= 0) {
                                                        var143 = var109[var142];
                                                    }
                                                    class9.method520(var93, var131, var141, var111, var98 + var120 & 0x3, var119, var108, var143);
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
        method2972(true);
        method1962();
        method655();
        class95 var144 = Statics.field550;
        class130[] var145 = field551;
        for (int var146 = 0; var146 < 4; var146++) {
            for (int var147 = 0; var147 < 104; var147++) {
                for (int var148 = 0; var148 < 104; var148++) {
                    if ((class9.field141[var146][var147][var148] & 0x1) == 1) {
                        int var149 = var146;
                        if ((class9.field141[1][var147][var148] & 0x2) == 2) {
                            var149 = var146 - 1;
                        }
                        if (var149 >= 0) {
                            var145[var149].method2556(var147, var148);
                        }
                    }
                }
            }
        }
        class9.field130 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field130 < -8) {
            class9.field130 = -8;
        }
        if (class9.field130 > 8) {
            class9.field130 = 8;
        }
        class9.field142 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field142 < -16) {
            class9.field142 = -16;
        }
        if (class9.field142 > 16) {
            class9.field142 = 16;
        }
        for (int var150 = 0; var150 < 4; var150++) {
            byte[][] var151 = Statics.field133[var150];
            int var152 = (int) Math.sqrt(5100.0D);
            int var153 = var152 * 768 >> 8;
            for (int var154 = 1; var154 < 103; var154++) {
                for (int var155 = 1; var155 < 103; var155++) {
                    int var156 = class9.field150[var150][var155 + 1][var154] - class9.field150[var150][var155 - 1][var154];
                    int var157 = class9.field150[var150][var155][var154 + 1] - class9.field150[var150][var155][var154 - 1];
                    int var158 = (int) Math.sqrt((double) (var157 * var157 + var156 * var156 + 65536));
                    int var159 = (var156 << 8) / var158;
                    int var160 = 65536 / var158;
                    int var161 = (var157 << 8) / var158;
                    int var162 = (var161 * -50 + var159 * -50 + var160 * -10) / var153 + 96;
                    int var163 = (var151[var155][var154] >> 1) + (var151[var155][var154 + 1] >> 3) + (var151[var155][var154 - 1] >> 2) + (var151[var155 - 1][var154] >> 2) + (var151[var155 + 1][var154] >> 3);
                    Statics.field87[var155][var154] = var162 - var163;
                }
            }
            for (int var164 = 0; var164 < 104; var164++) {
                Statics.field1806[var164] = 0;
                Statics.field80[var164] = 0;
                Statics.field129[var164] = 0;
                Statics.field1291[var164] = 0;
                Statics.field369[var164] = 0;
            }
            for (int var165 = -5; var165 < 109; var165++) {
                for (int var166 = 0; var166 < 104; var166++) {
                    int var167 = var165 + 5;
                    int var10002;
                    if (var167 >= 0 && var167 < 104) {
                        int var168 = Statics.field1832[var150][var167][var166] & 0xFF;
                        if (var168 > 0) {
                            int var169 = var168 - 1;
                            class33 var170 = (class33) class33.field881.method3097((long) var169);
                            class33 var171;
                            if (var170 == null) {
                                byte[] var172 = Statics.field885.method2886(1, var169);
                                class33 var173 = new class33();
                                if (var172 != null) {
                                    var173.method653(new class127(var172), var169);
                                }
                                var173.method652();
                                class33.field881.method3092(var173, (long) var169);
                                var171 = var173;
                            } else {
                                var171 = var170;
                            }
                            Statics.field1806[var166] += var171.field883;
                            Statics.field80[var166] += var171.field884;
                            Statics.field129[var166] += var171.field897;
                            Statics.field1291[var166] += var171.field886;
                            var10002 = Statics.field369[var166]++;
                        }
                    }
                    int var175 = var165 - 5;
                    if (var175 >= 0 && var175 < 104) {
                        int var176 = Statics.field1832[var150][var175][var166] & 0xFF;
                        if (var176 > 0) {
                            int var177 = var176 - 1;
                            class33 var178 = (class33) class33.field881.method3097((long) var177);
                            class33 var179;
                            if (var178 == null) {
                                byte[] var180 = Statics.field885.method2886(1, var177);
                                class33 var181 = new class33();
                                if (var180 != null) {
                                    var181.method653(new class127(var180), var177);
                                }
                                var181.method652();
                                class33.field881.method3092(var181, (long) var177);
                                var179 = var181;
                            } else {
                                var179 = var178;
                            }
                            Statics.field1806[var166] -= var179.field883;
                            Statics.field80[var166] -= var179.field884;
                            Statics.field129[var166] -= var179.field897;
                            Statics.field1291[var166] -= var179.field886;
                            var10002 = Statics.field369[var166]--;
                        }
                    }
                }
                if (var165 >= 1 && var165 < 103) {
                    int var183 = 0;
                    int var184 = 0;
                    int var185 = 0;
                    int var186 = 0;
                    int var187 = 0;
                    for (int var188 = -5; var188 < 109; var188++) {
                        int var189 = var188 + 5;
                        if (var189 >= 0 && var189 < 104) {
                            var183 += Statics.field1806[var189];
                            var184 += Statics.field80[var189];
                            var185 += Statics.field129[var189];
                            var186 += Statics.field1291[var189];
                            var187 += Statics.field369[var189];
                        }
                        int var190 = var188 - 5;
                        if (var190 >= 0 && var190 < 104) {
                            var183 -= Statics.field1806[var190];
                            var184 -= Statics.field80[var190];
                            var185 -= Statics.field129[var190];
                            var186 -= Statics.field1291[var190];
                            var187 -= Statics.field369[var190];
                        }
                        if (var188 >= 1 && var188 < 103 && (!field499 || (class9.field141[0][var165][var188] & 0x2) != 0 || (class9.field141[var150][var165][var188] & 0x10) == 0 && class9.method2588(var150, var165, var188) == field710)) {
                            if (var150 < class9.field131) {
                                class9.field131 = var150;
                            }
                            int var191 = Statics.field1832[var150][var165][var188] & 0xFF;
                            int var192 = Statics.field132[var150][var165][var188] & 0xFF;
                            if (var191 > 0 || var192 > 0) {
                                int var193 = class9.field150[var150][var165][var188];
                                int var194 = class9.field150[var150][var165 + 1][var188];
                                int var195 = class9.field150[var150][var165 + 1][var188 + 1];
                                int var196 = class9.field150[var150][var165][var188 + 1];
                                int var197 = Statics.field87[var165][var188];
                                int var198 = Statics.field87[var165 + 1][var188];
                                int var199 = Statics.field87[var165 + 1][var188 + 1];
                                int var200 = Statics.field87[var165][var188 + 1];
                                int var201 = -1;
                                int var202 = -1;
                                if (var191 > 0) {
                                    int var203 = var183 * 256 / var186;
                                    int var204 = var184 / var187;
                                    int var205 = var185 / var187;
                                    var201 = class9.method31(var203, var204, var205);
                                    int var206 = class9.field130 + var203 & 0xFF;
                                    int var207 = class9.field142 + var205;
                                    if (var207 < 0) {
                                        var207 = 0;
                                    } else if (var207 > 255) {
                                        var207 = 255;
                                    }
                                    var202 = class9.method31(var206, var204, var207);
                                }
                                if (var150 > 0) {
                                    boolean var208 = true;
                                    if (var191 == 0 && Statics.field2480[var150][var165][var188] != 0) {
                                        var208 = false;
                                    }
                                    if (var192 > 0 && !class37.method30(var192 - 1).field958) {
                                        var208 = false;
                                    }
                                    if (var208 && var193 == var194 && var193 == var195 && var193 == var196) {
                                        Statics.field1838[var150][var165][var188] |= 0x924;
                                    }
                                }
                                int var209 = 0;
                                if (var202 != -1) {
                                    var209 = class104.field1785[class9.method1320(var202, 96)];
                                }
                                if (var192 == 0) {
                                    var144.method1904(var150, var165, var188, 0, 0, -1, var193, var194, var195, var196, class9.method1320(var201, var197), class9.method1320(var201, var198), class9.method1320(var201, var199), class9.method1320(var201, var200), 0, 0, 0, 0, var209, 0);
                                } else {
                                    int var210 = Statics.field2480[var150][var165][var188] + 1;
                                    byte var211 = Statics.field2484[var150][var165][var188];
                                    class37 var212 = class37.method30(var192 - 1);
                                    int var213 = var212.field959;
                                    int var214;
                                    int var215;
                                    if (var213 >= 0) {
                                        var214 = Statics.field1780.method2095(var213);
                                        var215 = -1;
                                    } else if (var212.field955 == 16711935) {
                                        var215 = -2;
                                        var213 = -1;
                                        var214 = -2;
                                    } else {
                                        var215 = class9.method31(var212.field953, var212.field960, var212.field961);
                                        int var216 = class9.field130 + var212.field953 & 0xFF;
                                        int var217 = class9.field142 + var212.field961;
                                        if (var217 < 0) {
                                            var217 = 0;
                                        } else if (var217 > 255) {
                                            var217 = 255;
                                        }
                                        var214 = class9.method31(var216, var212.field960, var217);
                                    }
                                    int var218 = 0;
                                    if (var214 != -2) {
                                        var218 = class104.field1785[class9.method2753(var214, 96)];
                                    }
                                    if (var212.field967 != -1) {
                                        int var219 = class9.field130 + var212.field956 & 0xFF;
                                        int var220 = class9.field142 + var212.field964;
                                        if (var220 < 0) {
                                            var220 = 0;
                                        } else if (var220 > 255) {
                                            var220 = 255;
                                        }
                                        int var221 = class9.method31(var219, var212.field963, var220);
                                        var218 = class104.field1785[class9.method2753(var221, 96)];
                                    }
                                    var144.method1904(var150, var165, var188, var210, var211, var213, var193, var194, var195, var196, class9.method1320(var201, var197), class9.method1320(var201, var198), class9.method1320(var201, var199), class9.method1320(var201, var200), class9.method2753(var215, var197), class9.method2753(var215, var198), class9.method2753(var215, var199), class9.method2753(var215, var200), var209, var218);
                                }
                            }
                        }
                    }
                }
            }
            for (int var222 = 1; var222 < 103; var222++) {
                for (int var223 = 1; var223 < 103; var223++) {
                    var144.method1790(var150, var223, var222, class9.method2588(var150, var223, var222));
                }
            }
            Statics.field1832[var150] = (byte[][]) null;
            Statics.field132[var150] = (byte[][]) null;
            Statics.field2480[var150] = (byte[][]) null;
            Statics.field2484[var150] = (byte[][]) null;
            Statics.field133[var150] = (byte[][]) null;
        }
        var144.method1817(-50, -10, -50);
        for (int var224 = 0; var224 < 104; var224++) {
            for (int var225 = 0; var225 < 104; var225++) {
                if ((class9.field141[1][var224][var225] & 0x2) == 2) {
                    var144.method1940(var224, var225);
                }
            }
        }
        int var226 = 1;
        int var227 = 2;
        int var228 = 4;
        for (int var229 = 0; var229 < 4; var229++) {
            if (var229 > 0) {
                var226 <<= 0x3;
                var227 <<= 0x3;
                var228 <<= 0x3;
            }
            for (int var230 = 0; var230 <= var229; var230++) {
                for (int var231 = 0; var231 <= 104; var231++) {
                    for (int var232 = 0; var232 <= 104; var232++) {
                        if ((Statics.field1838[var230][var232][var231] & var226) != 0) {
                            int var233 = var231;
                            int var234 = var231;
                            int var235 = var230;
                            int var236 = var230;
                            while (var233 > 0 && (Statics.field1838[var230][var232][var233 - 1] & var226) != 0) {
                                var233--;
                            }
                            while (var234 < 104 && (Statics.field1838[var230][var232][var234 + 1] & var226) != 0) {
                                var234++;
                            }
                            label727: while (var235 > 0) {
                                for (int var237 = var233; var237 <= var234; var237++) {
                                    if ((Statics.field1838[var235 - 1][var232][var237] & var226) == 0) {
                                        break label727;
                                    }
                                }
                                var235--;
                            }
                            label716: while (var236 < var229) {
                                for (int var238 = var233; var238 <= var234; var238++) {
                                    if ((Statics.field1838[var236 + 1][var232][var238] & var226) == 0) {
                                        break label716;
                                    }
                                }
                                var236++;
                            }
                            int var239 = (var236 + 1 - var235) * (var234 - var233 + 1);
                            if (var239 >= 8) {
                                short var240 = 240;
                                int var241 = class9.field150[var236][var232][var233] - var240;
                                int var242 = class9.field150[var235][var232][var233];
                                class95.method1808(var229, 1, var232 * 128, var232 * 128, var233 * 128, var234 * 128 + 128, var241, var242);
                                for (int var243 = var235; var243 <= var236; var243++) {
                                    for (int var244 = var233; var244 <= var234; var244++) {
                                        Statics.field1838[var243][var232][var244] &= ~var226;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1838[var230][var232][var231] & var227) != 0) {
                            int var245 = var232;
                            int var246 = var232;
                            int var247 = var230;
                            int var248 = var230;
                            while (var245 > 0 && (Statics.field1838[var230][var245 - 1][var231] & var227) != 0) {
                                var245--;
                            }
                            while (var246 < 104 && (Statics.field1838[var230][var246 + 1][var231] & var227) != 0) {
                                var246++;
                            }
                            label780: while (var247 > 0) {
                                for (int var249 = var245; var249 <= var246; var249++) {
                                    if ((Statics.field1838[var247 - 1][var249][var231] & var227) == 0) {
                                        break label780;
                                    }
                                }
                                var247--;
                            }
                            label769: while (var248 < var229) {
                                for (int var250 = var245; var250 <= var246; var250++) {
                                    if ((Statics.field1838[var248 + 1][var250][var231] & var227) == 0) {
                                        break label769;
                                    }
                                }
                                var248++;
                            }
                            int var251 = (var248 + 1 - var247) * (var246 - var245 + 1);
                            if (var251 >= 8) {
                                short var252 = 240;
                                int var253 = class9.field150[var248][var245][var231] - var252;
                                int var254 = class9.field150[var247][var245][var231];
                                class95.method1808(var229, 2, var245 * 128, var246 * 128 + 128, var231 * 128, var231 * 128, var253, var254);
                                for (int var255 = var247; var255 <= var248; var255++) {
                                    for (int var256 = var245; var256 <= var246; var256++) {
                                        Statics.field1838[var255][var256][var231] &= ~var227;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1838[var230][var232][var231] & var228) != 0) {
                            int var257 = var232;
                            int var258 = var232;
                            int var259 = var231;
                            int var260 = var231;
                            while (var259 > 0 && (Statics.field1838[var230][var232][var259 - 1] & var228) != 0) {
                                var259--;
                            }
                            while (var260 < 104 && (Statics.field1838[var230][var232][var260 + 1] & var228) != 0) {
                                var260++;
                            }
                            label833: while (var257 > 0) {
                                for (int var261 = var259; var261 <= var260; var261++) {
                                    if ((Statics.field1838[var230][var257 - 1][var261] & var228) == 0) {
                                        break label833;
                                    }
                                }
                                var257--;
                            }
                            label822: while (var258 < 104) {
                                for (int var262 = var259; var262 <= var260; var262++) {
                                    if ((Statics.field1838[var230][var258 + 1][var262] & var228) == 0) {
                                        break label822;
                                    }
                                }
                                var258++;
                            }
                            if ((var258 - var257 + 1) * (var260 - var259 + 1) >= 4) {
                                int var263 = class9.field150[var230][var257][var259];
                                class95.method1808(var229, 4, var257 * 128, var258 * 128 + 128, var259 * 128, var260 * 128 + 128, var263, var263);
                                for (int var264 = var257; var264 <= var258; var264++) {
                                    for (int var265 = var259; var265 <= var260; var265++) {
                                        Statics.field1838[var230][var264][var265] &= ~var228;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2972(true);
        int var266 = class9.field131;
        if (var266 > Statics.field178) {
            var266 = Statics.field178;
        }
        if (var266 < Statics.field178 - 1) {
            int var267 = Statics.field178 - 1;
        }
        if (field499) {
            Statics.field550.method1787(class9.field131);
        } else {
            Statics.field550.method1787(0);
        }
        for (int var268 = 0; var268 < 104; var268++) {
            for (int var269 = 0; var269 < 104; var269++) {
                method224(var268, var269);
            }
        }
        method655();
        for (class22 var270 = (class22) field625.method3163(); var270 != null; var270 = (class22) field625.method3165()) {
            if (var270.field366 == -1) {
                var270.field363 = 0;
                method103(var270);
            } else {
                var270.method3196();
            }
        }
        class32.field830.method3093();
        if (Statics.field2782 != null) {
            field504.method2218(142);
            field504.method2307(1057001181);
        }
        if (!field552) {
            int var271 = (Statics.field769 - 6) / 8;
            int var272 = (Statics.field769 + 6) / 8;
            int var273 = (Statics.field55 - 6) / 8;
            int var274 = (Statics.field55 + 6) / 8;
            for (int var275 = var271 - 1; var275 <= var272 + 1; var275++) {
                for (int var276 = var273 - 1; var276 <= var274 + 1; var276++) {
                    if (var275 < var271 || var275 > var272 || var276 < var273 || var276 > var274) {
                        Statics.field2801.method2905("m" + var275 + "_" + var276);
                        Statics.field2801.method2905("l" + var275 + "_" + var276);
                    }
                }
            }
        }
        method22(30);
        method655();
        Statics.field1832 = (byte[][][]) null;
        Statics.field132 = (byte[][][]) null;
        Statics.field2480 = (byte[][][]) null;
        Statics.field2484 = (byte[][][]) null;
        Statics.field1838 = (int[][][]) null;
        Statics.field133 = (byte[][][]) null;
        Statics.field87 = (int[][]) null;
        Statics.field1806 = null;
        Statics.field80 = null;
        Statics.field129 = null;
        Statics.field1291 = null;
        Statics.field369 = null;
        field504.method2218(110);
        class73.method3049();
    }

    @ObfuscatedName("i.ab(IIIIII)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field550.method1812(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field550.method1816(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field210.field1497;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method1446(var12);
            if (var13.field861 == -1) {
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
                class87 var14 = Statics.field1830[var13.field861];
                if (var14 != null) {
                    int var15 = (var13.field842 * 4 - var14.field1503) / 2;
                    int var16 = (var13.field835 * 4 - var14.field1504) / 2;
                    var14.method1693(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field835) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field550.method1814(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field550.method1816(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method1446(var21);
            if (var22.field861 != -1) {
                class87 var23 = Statics.field1830[var22.field861];
                if (var23 != null) {
                    int var24 = (var22.field842 * 4 - var23.field1503) / 2;
                    int var25 = (var22.field835 * 4 - var23.field1504) / 2;
                    var23.method1693(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field835) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field210.field1497;
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
        int var29 = Statics.field550.method1815(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method1446(var30);
        if (var31.field861 == -1) {
            return;
        }
        class87 var32 = Statics.field1830[var31.field861];
        if (var32 != null) {
            int var33 = (var31.field842 * 4 - var32.field1503) / 2;
            int var34 = (var31.field835 * 4 - var32.field1504) / 2;
            var32.method1693(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field835) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dp.az(B)V")
    public static final void method2552() {
        if (field536 == 249) {
            int var0 = field534.method2383();
            int var1 = (var0 >> 4 & 0x7) + Statics.field186;
            int var2 = (var0 & 0x7) + Statics.field351;
            int var3 = field534.method2327();
            int var4 = field534.method2327();
            int var5 = field534.method2327();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class177 var6 = field624[Statics.field178][var1][var2];
                if (var6 != null) {
                    for (class17 var7 = (class17) var6.method3163(); var7 != null; var7 = (class17) var6.method3165()) {
                        if ((var3 & 0x7FFF) == var7.field270 && var7.field266 == var4) {
                            var7.field266 = var5;
                            break;
                        }
                    }
                    method224(var1, var2);
                }
            }
        } else if (field536 == 76) {
            int var8 = field534.method2383();
            int var9 = (var8 >> 4 & 0x7) + Statics.field186;
            int var10 = (var8 & 0x7) + Statics.field351;
            int var11 = var9 + field534.method2319();
            int var12 = var10 + field534.method2319();
            int var13 = field534.method2321();
            int var14 = field534.method2327();
            int var15 = field534.method2383() * 4;
            int var16 = field534.method2383() * 4;
            int var17 = field534.method2327();
            int var18 = field534.method2327();
            int var19 = field534.method2383();
            int var20 = field534.method2383();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var14 != 65535) {
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                int var24 = var12 * 128 + 64;
                class10 var25 = new class10(var14, Statics.field178, var21, var22, method138(var21, var22, Statics.field178) - var15, field503 + var17, field503 + var18, var19, var20, var13, var16);
                var25.method98(var23, var24, method138(var23, var24, Statics.field178) - var16, field503 + var17);
                field717.method3158(var25);
            }
        } else if (field536 == 168) {
            int var26 = field534.method2387();
            int var27 = field534.method2515();
            int var28 = (var27 >> 4 & 0x7) + Statics.field186;
            int var29 = (var27 & 0x7) + Statics.field351;
            int var30 = field534.method2350();
            int var31 = field534.method2327();
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && field616 != var30) {
                class17 var32 = new class17();
                var32.field270 = var31;
                var32.field266 = var26;
                if (field624[Statics.field178][var28][var29] == null) {
                    field624[Statics.field178][var28][var29] = new class177();
                }
                field624[Statics.field178][var28][var29].method3158(var32);
                method224(var28, var29);
            }
        } else {
            if (field536 == 1) {
                int var33 = field534.method2383();
                int var34 = (var33 >> 4 & 0x7) + Statics.field186;
                int var35 = (var33 & 0x7) + Statics.field351;
                int var36 = field534.method2327();
                int var37 = field534.method2383();
                int var38 = var37 >> 4 & 0xF;
                int var39 = var37 & 0x7;
                int var40 = field534.method2383();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                    int var41 = var38 + 1;
                    if (Statics.field2555.field469[0] >= var34 - var41 && Statics.field2555.field469[0] <= var34 + var41 && Statics.field2555.field481[0] >= var35 - var41 && Statics.field2555.field481[0] <= var35 + var41 && field731 != 0 && var39 > 0 && field510 < 50) {
                        field733[field510] = var36;
                        field541[field510] = var39;
                        field724[field510] = var40;
                        field548[field510] = null;
                        field544[field510] = (var34 << 16) + (var35 << 8) + var38;
                        field510++;
                    }
                }
            }
            if (field536 == 8) {
                int var42 = field534.method2327();
                int var43 = field534.method2515();
                int var44 = (var43 >> 4 & 0x7) + Statics.field186;
                int var45 = (var43 & 0x7) + Statics.field351;
                int var46 = field534.method2454();
                int var47 = var46 >> 2;
                int var48 = var46 & 0x3;
                int var49 = field554[var47];
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    method2226(Statics.field178, var44, var45, var49, var42, var47, var48, 0, -1);
                }
            } else if (field536 == 162) {
                int var50 = field534.method2350();
                int var51 = field534.method2515();
                int var52 = (var51 >> 4 & 0x7) + Statics.field186;
                int var53 = (var51 & 0x7) + Statics.field351;
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    class177 var54 = field624[Statics.field178][var52][var53];
                    if (var54 != null) {
                        for (class17 var55 = (class17) var54.method3163(); var55 != null; var55 = (class17) var54.method3165()) {
                            if ((var50 & 0x7FFF) == var55.field270) {
                                var55.method3196();
                                break;
                            }
                        }
                        if (var54.method3163() == null) {
                            field624[Statics.field178][var52][var53] = null;
                        }
                        method224(var52, var53);
                    }
                }
            } else if (field536 == 178) {
                int var56 = field534.method2444();
                int var57 = (var56 >> 4 & 0x7) + Statics.field186;
                int var58 = (var56 & 0x7) + Statics.field351;
                int var59 = field534.method2387();
                int var60 = field534.method2393();
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    class17 var61 = new class17();
                    var61.field270 = var60;
                    var61.field266 = var59;
                    if (field624[Statics.field178][var57][var58] == null) {
                        field624[Statics.field178][var57][var58] = new class177();
                    }
                    field624[Statics.field178][var57][var58].method3158(var61);
                    method224(var57, var58);
                }
            } else if (field536 == 116) {
                int var62 = field534.method2383();
                int var63 = (var62 >> 4 & 0x7) + Statics.field186;
                int var64 = (var62 & 0x7) + Statics.field351;
                int var65 = field534.method2327();
                int var66 = field534.method2383();
                int var67 = field534.method2327();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var68 = var63 * 128 + 64;
                    int var69 = var64 * 128 + 64;
                    class20 var70 = new class20(var65, Statics.field178, var68, var69, method138(var68, var69, Statics.field178) - var66, var67, field503);
                    field627.method3158(var70);
                }
            } else if (field536 == 215) {
                int var71 = field534.method2454();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field554[var72];
                int var75 = field534.method2383();
                int var76 = (var75 >> 4 & 0x7) + Statics.field186;
                int var77 = (var75 & 0x7) + Statics.field351;
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    method2226(Statics.field178, var76, var77, var74, -1, var72, var73, 0, -1);
                }
            } else {
                if (field536 == 199) {
                    int var78 = field534.method2515();
                    int var79 = var78 >> 2;
                    int var80 = var78 & 0x3;
                    int var81 = field554[var79];
                    int var82 = field534.method2387();
                    int var83 = field534.method2327();
                    int var84 = field534.method2327();
                    byte var85 = field534.method2346();
                    byte var86 = field534.method2345();
                    int var87 = field534.method2393();
                    byte var88 = field534.method2319();
                    int var89 = field534.method2515();
                    int var90 = (var89 >> 4 & 0x7) + Statics.field186;
                    int var91 = (var89 & 0x7) + Statics.field351;
                    byte var92 = field534.method2319();
                    class3 var93;
                    if (field616 == var82) {
                        var93 = Statics.field2555;
                    } else {
                        var93 = field610[var82];
                    }
                    if (var93 != null) {
                        class32 var94 = class32.method1446(var84);
                        int var95;
                        int var96;
                        if (var80 == 1 || var80 == 3) {
                            var95 = var94.field835;
                            var96 = var94.field842;
                        } else {
                            var95 = var94.field842;
                            var96 = var94.field835;
                        }
                        int var97 = (var95 >> 1) + var90;
                        int var98 = (var95 + 1 >> 1) + var90;
                        int var99 = (var96 >> 1) + var91;
                        int var100 = (var96 + 1 >> 1) + var91;
                        int[][] var101 = class9.field150[Statics.field178];
                        int var102 = var101[var97][var99] + var101[var98][var99] + var101[var97][var100] + var101[var98][var100] >> 2;
                        int var103 = (var90 << 7) + (var95 << 6);
                        int var104 = (var91 << 7) + (var96 << 6);
                        class112 var105 = var94.method614(var79, var80, var101, var103, var102, var104);
                        if (var105 != null) {
                            method2226(Statics.field178, var90, var91, var81, -1, 0, 0, var83 + 1, var87 + 1);
                            var93.field37 = field503 + var83;
                            var93.field38 = field503 + var87;
                            var93.field32 = var105;
                            var93.field39 = var90 * 128 + var95 * 64;
                            var93.field41 = var91 * 128 + var96 * 64;
                            var93.field40 = var102;
                            if (var85 > var92) {
                                byte var106 = var85;
                                var85 = var92;
                                var92 = var106;
                            }
                            if (var88 > var86) {
                                byte var107 = var88;
                                var88 = var86;
                                var86 = var107;
                            }
                            var93.field43 = var85 + var90;
                            var93.field49 = var90 + var92;
                            var93.field42 = var88 + var91;
                            var93.field46 = var86 + var91;
                        }
                    }
                }
                if (field536 == 151) {
                    int var108 = field534.method2454();
                    int var109 = var108 >> 2;
                    int var110 = var108 & 0x3;
                    int var111 = field554[var109];
                    int var112 = field534.method2383();
                    int var113 = (var112 >> 4 & 0x7) + Statics.field186;
                    int var114 = (var112 & 0x7) + Statics.field351;
                    int var115 = field534.method2387();
                    if (var113 >= 0 && var114 >= 0 && var113 < 103 && var114 < 103) {
                        if (var111 == 0) {
                            class96 var116 = Statics.field550.method1789(Statics.field178, var113, var114);
                            if (var116 != null) {
                                int var117 = var116.field1640 >> 14 & 0x7FFF;
                                if (var109 == 2) {
                                    var116.field1634 = new class14(var117, 2, var110 + 4, Statics.field178, var113, var114, var115, false, var116.field1634);
                                    var116.field1639 = new class14(var117, 2, var110 + 1 & 0x3, Statics.field178, var113, var114, var115, false, var116.field1639);
                                } else {
                                    var116.field1634 = new class14(var117, var109, var110, Statics.field178, var113, var114, var115, false, var116.field1634);
                                }
                            }
                        }
                        if (var111 == 1) {
                            class108 var118 = Statics.field550.method1809(Statics.field178, var113, var114);
                            if (var118 != null) {
                                int var119 = var118.field1826 >> 14 & 0x7FFF;
                                if (var109 == 4 || var109 == 5) {
                                    var118.field1824 = new class14(var119, 4, var110, Statics.field178, var113, var114, var115, false, var118.field1824);
                                } else if (var109 == 6) {
                                    var118.field1824 = new class14(var119, 4, var110 + 4, Statics.field178, var113, var114, var115, false, var118.field1824);
                                } else if (var109 == 7) {
                                    var118.field1824 = new class14(var119, 4, (var110 + 2 & 0x3) + 4, Statics.field178, var113, var114, var115, false, var118.field1824);
                                } else if (var109 == 8) {
                                    var118.field1824 = new class14(var119, 4, var110 + 4, Statics.field178, var113, var114, var115, false, var118.field1824);
                                    var118.field1825 = new class14(var119, 4, (var110 + 2 & 0x3) + 4, Statics.field178, var113, var114, var115, false, var118.field1825);
                                }
                            }
                        }
                        if (var111 == 2) {
                            class98 var120 = Statics.field550.method1810(Statics.field178, var113, var114);
                            if (var109 == 11) {
                                var109 = 10;
                            }
                            if (var120 != null) {
                                var120.field1668 = new class14(var120.field1669 >> 14 & 0x7FFF, var109, var110, Statics.field178, var113, var114, var115, false, var120.field1668);
                            }
                        }
                        if (var111 == 3) {
                            class107 var121 = Statics.field550.method1811(Statics.field178, var113, var114);
                            if (var121 != null) {
                                var121.field1803 = new class14(var121.field1804 >> 14 & 0x7FFF, 22, var110, Statics.field178, var113, var114, var115, false, var121.field1803);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dm.al(IIIIIIIIIB)V")
    public static final void method2226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field625.method3163(); var10 != null; var10 = (class22) field625.method3165()) {
            if (var10.field372 == arg0 && var10.field355 == arg1 && var10.field353 == arg2 && var10.field354 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field372 = arg0;
            var9.field354 = arg3;
            var9.field355 = arg1;
            var9.field353 = arg2;
            method103(var9);
            field625.method3158(var9);
        }
        var9.field360 = arg4;
        var9.field358 = arg5;
        var9.field364 = arg6;
        var9.field363 = arg7;
        var9.field366 = arg8;
    }

    @ObfuscatedName("t.ar(Lk;I)V")
    public static final void method103(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field354 == 0) {
            var1 = Statics.field550.method1812(arg0.field372, arg0.field355, arg0.field353);
        }
        if (arg0.field354 == 1) {
            var1 = Statics.field550.method1813(arg0.field372, arg0.field355, arg0.field353);
        }
        if (arg0.field354 == 2) {
            var1 = Statics.field550.method1814(arg0.field372, arg0.field355, arg0.field353);
        }
        if (arg0.field354 == 3) {
            var1 = Statics.field550.method1815(arg0.field372, arg0.field355, arg0.field353);
        }
        if (var1 != 0) {
            int var5 = Statics.field550.method1816(arg0.field372, arg0.field355, arg0.field353, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field357 = var2;
        arg0.field359 = var3;
        arg0.field370 = var4;
    }

    @ObfuscatedName("br.ay(I)V")
    public static final void method1459() {
        for (class22 var0 = (class22) field625.method3163(); var0 != null; var0 = (class22) field625.method3165()) {
            if (var0.field366 > 0) {
                var0.field366--;
            }
            if (var0.field366 != 0) {
                if (var0.field363 > 0) {
                    var0.field363--;
                }
                if (var0.field363 == 0 && var0.field355 >= 1 && var0.field353 >= 1 && var0.field355 <= 102 && var0.field353 <= 102 && (var0.field360 < 0 || class9.method868(var0.field360, var0.field358))) {
                    method2(var0.field372, var0.field354, var0.field355, var0.field353, var0.field360, var0.field364, var0.field358);
                    var0.field363 = -1;
                    if (var0.field360 == var0.field357 && var0.field357 == -1) {
                        var0.method3196();
                    } else if (var0.field360 == var0.field357 && var0.field370 == var0.field364 && var0.field359 == var0.field358) {
                        var0.method3196();
                    }
                }
            } else if (var0.field357 < 0 || class9.method868(var0.field357, var0.field359)) {
                method2(var0.field372, var0.field354, var0.field355, var0.field353, var0.field357, var0.field370, var0.field359);
                var0.method3196();
            }
        }
    }

    @ObfuscatedName("c.bi(IIIIIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field499 && Statics.field178 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field550.method1812(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field550.method1813(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field550.method1814(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field550.method1815(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field550.method1816(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field550.method1854(arg0, arg2, arg3);
                class32 var15 = class32.method1446(var12);
                if (var15.field844 != 0) {
                    field551[arg0].method2559(arg2, arg3, var13, var14, var15.field845);
                }
            }
            if (arg1 == 1) {
                Statics.field550.method1849(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field550.method1863(arg0, arg2, arg3);
                class32 var16 = class32.method1446(var12);
                if (var16.field842 + arg2 > 103 || var16.field842 + arg3 > 103 || var16.field835 + arg2 > 103 || var16.field835 + arg3 > 103) {
                    return;
                }
                if (var16.field844 != 0) {
                    field551[arg0].method2560(arg2, arg3, var16.field842, var16.field835, var14, var16.field845);
                }
            }
            if (arg1 == 3) {
                Statics.field550.method1806(arg0, arg2, arg3);
                class32 var17 = class32.method1446(var12);
                if (var17.field844 == 1) {
                    field551[arg0].method2581(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field141[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class95 var19 = Statics.field550;
        class130 var20 = field551[arg0];
        class32 var21 = class32.method1446(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field835;
            var23 = var21.field842;
        } else {
            var22 = var21.field842;
            var23 = var21.field835;
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
        int[][] var28 = class9.field150[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field841 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field867 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class94 var34;
            if (var21.field850 == -1 && var21.field868 == null) {
                var34 = var21.method614(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1792(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field844 == 1) {
                var20.method2557(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var57;
            if (var21.field850 == -1 && var21.field868 == null) {
                var57 = var21.method614(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            if (var57 != null) {
                var19.method1805(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field844 != 0) {
                var20.method2555(arg2, arg3, var22, var23, var21.field845);
            }
        } else if (arg6 >= 12) {
            class94 var35;
            if (var21.field850 == -1 && var21.field868 == null) {
                var35 = var21.method614(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1805(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field844 != 0) {
                var20.method2555(arg2, arg3, var22, var23, var21.field845);
            }
        } else if (arg6 == 0) {
            class94 var36;
            if (var21.field850 == -1 && var21.field868 == null) {
                var36 = var21.method614(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1794(arg0, arg2, arg3, var29, var36, (class94) null, class9.field137[arg5], 0, var32, var33);
            if (var21.field844 != 0) {
                var20.method2554(arg2, arg3, arg6, arg5, var21.field845);
            }
        } else if (arg6 == 1) {
            class94 var37;
            if (var21.field850 == -1 && var21.field868 == null) {
                var37 = var21.method614(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1794(arg0, arg2, arg3, var29, var37, (class94) null, class9.field136[arg5], 0, var32, var33);
            if (var21.field844 != 0) {
                var20.method2554(arg2, arg3, arg6, arg5, var21.field845);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class94 var39;
            class94 var40;
            if (var21.field850 == -1 && var21.field868 == null) {
                var39 = var21.method614(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method614(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field850, true, (class94) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1794(arg0, arg2, arg3, var29, var39, var40, class9.field137[arg5], class9.field137[var38], var32, var33);
            if (var21.field844 != 0) {
                var20.method2554(arg2, arg3, arg6, arg5, var21.field845);
            }
        } else if (arg6 == 3) {
            class94 var41;
            if (var21.field850 == -1 && var21.field868 == null) {
                var41 = var21.method614(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1794(arg0, arg2, arg3, var29, var41, (class94) null, class9.field136[arg5], 0, var32, var33);
            if (var21.field844 != 0) {
                var20.method2554(arg2, arg3, arg6, arg5, var21.field845);
            }
        } else if (arg6 == 9) {
            class94 var42;
            if (var21.field850 == -1 && var21.field868 == null) {
                var42 = var21.method614(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1805(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field844 != 0) {
                var20.method2555(arg2, arg3, var22, var23, var21.field845);
            }
        } else if (arg6 == 4) {
            class94 var43;
            if (var21.field850 == -1 && var21.field868 == null) {
                var43 = var21.method614(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var43, (class94) null, class9.field137[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1812(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class32.method1446(var45 >> 14 & 0x7FFF).field859;
            }
            class94 var46;
            if (var21.field850 == -1 && var21.field868 == null) {
                var46 = var21.method614(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var46, (class94) null, class9.field137[arg5], 0, class9.field147[arg5] * var44, class9.field144[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1812(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class32.method1446(var48 >> 14 & 0x7FFF).field859 / 2;
            }
            class94 var49;
            if (var21.field850 == -1 && var21.field868 == null) {
                var49 = var21.method614(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var49, (class94) null, 256, arg5, class9.field139[arg5] * var47, class9.field140[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class94 var51;
            if (var21.field850 == -1 && var21.field868 == null) {
                var51 = var21.method614(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var51, (class94) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1812(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class32.method1446(var53 >> 14 & 0x7FFF).field859 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class94 var55;
            class94 var56;
            if (var21.field850 == -1 && var21.field868 == null) {
                var55 = var21.method614(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method614(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field850, true, (class94) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field850, true, (class94) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field139[arg5] * var52, class9.field140[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("i.bf(III)V")
    public static final void method224(int arg0, int arg1) {
        class177 var2 = field624[Statics.field178][arg0][arg1];
        if (var2 == null) {
            Statics.field550.method1807(Statics.field178, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3163(); var6 != null; var6 = (class17) var2.method3165()) {
            class40 var7 = class40.method11(var6.field270);
            long var8 = (long) var7.field1014;
            if (var7.field1013 == 1) {
                var8 = (long) (var6.field266 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field550.method1807(Statics.field178, arg0, arg1);
            return;
        }
        var2.method3159(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3163(); var12 != null; var12 = (class17) var2.method3165()) {
            if (var5.field270 != var12.field270) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field270 != var12.field270 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field550.method1793(Statics.field178, arg0, arg1, method138(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field178), var5, var13, var10, var11);
    }

    @ObfuscatedName("ax.bl(I)V")
    public static final void method846() {
        field534.method2204();
        int var0 = field534.method2209(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field534.method2209(2);
        if (var1 == 0) {
            field614[++field667 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field534.method2209(3);
            Statics.field2555.method237(var2, false);
            int var3 = field534.method2209(1);
            if (var3 == 1) {
                field614[++field667 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field534.method2209(3);
            Statics.field2555.method237(var4, true);
            int var5 = field534.method2209(3);
            Statics.field2555.method237(var5, true);
            int var6 = field534.method2209(1);
            if (var6 == 1) {
                field614[++field667 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field178 = field534.method2209(2);
            int var7 = field534.method2209(1);
            if (var7 == 1) {
                field614[++field667 - 1] = 2047;
            }
            int var8 = field534.method2209(1);
            int var9 = field534.method2209(7);
            int var10 = field534.method2209(7);
            Statics.field2555.method229(var9, var10, var8 == 1);
        }
    }

    @ObfuscatedName("dx.bd(I)V")
    public static final void method2261() {
        while (true) {
            if (field534.method2207(field535) >= 11) {
                int var0 = field534.method2209(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field610[var0] == null) {
                        field610[var0] = new class3();
                        if (field615[var0] != null) {
                            field610[var0].method12(field615[var0]);
                        }
                        var1 = true;
                    }
                    field738[++field516 - 1] = var0;
                    class3 var2 = field610[var0];
                    var2.field478 = field503;
                    int var3 = field716[field534.method2209(3)];
                    if (var1) {
                        var2.field489 = var2.field480 = var3;
                    }
                    int var4 = field534.method2209(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field534.method2209(1);
                    if (var5 == 1) {
                        field614[++field667 - 1] = var0;
                    }
                    int var6 = field534.method2209(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field534.method2209(1);
                    var2.method229(Statics.field2555.field469[0] + var6, Statics.field2555.field481[0] + var4, var7 == 1);
                    continue;
                }
            }
            field534.method2206();
            return;
        }
    }

    @ObfuscatedName("au.bm(I)V")
    public static final void method776() {
        field618 = 0;
        field667 = 0;
        field534.method2204();
        int var0 = field534.method2209(8);
        if (var0 < field530) {
            for (int var1 = var0; var1 < field530; var1++) {
                field747[++field618 - 1] = field531[var1];
            }
        }
        if (var0 > field530) {
            throw new RuntimeException("");
        }
        field530 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field531[var2];
            class25 var4 = field529[var3];
            int var5 = field534.method2209(1);
            if (var5 == 0) {
                field531[++field530 - 1] = var3;
                var4.field478 = field503;
            } else {
                int var6 = field534.method2209(2);
                if (var6 == 0) {
                    field531[++field530 - 1] = var3;
                    var4.field478 = field503;
                    field614[++field667 - 1] = var3;
                } else if (var6 == 1) {
                    field531[++field530 - 1] = var3;
                    var4.field478 = field503;
                    int var7 = field534.method2209(3);
                    var4.method237(var7, false);
                    int var8 = field534.method2209(1);
                    if (var8 == 1) {
                        field614[++field667 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field531[++field530 - 1] = var3;
                    var4.field478 = field503;
                    int var9 = field534.method2209(3);
                    var4.method237(var9, true);
                    int var10 = field534.method2209(3);
                    var4.method237(var10, true);
                    int var11 = field534.method2209(1);
                    if (var11 == 1) {
                        field614[++field667 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field747[++field618 - 1] = var3;
                }
            }
        }
        method146();
        method2634();
        for (int var12 = 0; var12 < field618; var12++) {
            int var13 = field747[var12];
            if (field503 != field529[var13].field478) {
                field529[var13].field406 = null;
                field529[var13] = null;
            }
        }
        if (field535 != field534.field2052) {
            throw new RuntimeException(field534.field2052 + class2.field16 + field535);
        }
        for (int var14 = 0; var14 < field530; var14++) {
            if (field529[field531[var14]] == null) {
                throw new RuntimeException(var14 + class2.field16 + field530);
            }
        }
    }

    @ObfuscatedName("z.ba(I)V")
    public static final void method146() {
        while (true) {
            if (field534.method2207(field535) >= 27) {
                int var0 = field534.method2209(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field529[var0] == null) {
                        field529[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field529[var0];
                    field531[++field530 - 1] = var0;
                    var2.field478 = field503;
                    int var3 = field534.method2209(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field534.method2209(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var2.field406 = class31.method131(field534.method2209(14));
                    int var5 = field534.method2209(1);
                    if (var5 == 1) {
                        field614[++field667 - 1] = var0;
                    }
                    int var6 = field534.method2209(1);
                    int var7 = field716[field534.method2209(3)];
                    if (var1) {
                        var2.field489 = var2.field480 = var7;
                    }
                    var2.field470 = var2.field406.field796;
                    var2.field434 = var2.field406.field819;
                    if (var2.field434 == 0) {
                        var2.field480 = 0;
                    }
                    var2.field436 = var2.field406.field802;
                    var2.field441 = var2.field406.field803;
                    var2.field442 = var2.field406.field793;
                    var2.field443 = var2.field406.field805;
                    var2.field437 = var2.field406.field799;
                    var2.field438 = var2.field406.field800;
                    var2.field439 = var2.field406.field801;
                    var2.method229(Statics.field2555.field469[0] + var3, Statics.field2555.field481[0] + var4, var6 == 1);
                    continue;
                }
            }
            field534.method2206();
            return;
        }
    }

    @ObfuscatedName("ef.bu(B)V")
    public static final void method2634() {
        for (int var0 = 0; var0 < field667; var0++) {
            int var1 = field614[var0];
            class25 var2 = field529[var1];
            int var3 = field534.method2383();
            if ((var3 & 0x8) != 0) {
                int var4 = field534.method2444();
                int var5 = field534.method2383();
                var2.method233(var4, var5, field503);
                var2.field432 = field503 + 300;
                var2.field453 = field534.method2454();
                var2.field456 = field534.method2383();
            }
            if ((var3 & 0x1) != 0) {
                int var6 = field534.method2327();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field534.method2515();
                if (var2.field461 == var6 && var6 != -1) {
                    int var8 = Statics.method1425(var6).field916;
                    if (var8 == 1) {
                        var2.field462 = 0;
                        var2.field463 = 0;
                        var2.field464 = var7;
                        var2.field465 = 0;
                    }
                    if (var8 == 2) {
                        var2.field465 = 0;
                    }
                } else if (var6 == -1 || var2.field461 == -1 || Statics.method1425(var6).field911 >= Statics.method1425(var2.field461).field911) {
                    var2.field461 = var6;
                    var2.field462 = 0;
                    var2.field463 = 0;
                    var2.field464 = var7;
                    var2.field465 = 0;
                    var2.field488 = var2.field483;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field455 = field534.method2350();
                if (var2.field455 == 65535) {
                    var2.field455 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field406 = class31.method131(field534.method2327());
                var2.field470 = var2.field406.field796;
                var2.field434 = var2.field406.field819;
                var2.field436 = var2.field406.field802;
                var2.field441 = var2.field406.field803;
                var2.field442 = var2.field406.field793;
                var2.field443 = var2.field406.field805;
                var2.field437 = var2.field406.field799;
                var2.field438 = var2.field406.field800;
                var2.field439 = var2.field406.field801;
            }
            if ((var3 & 0x4) != 0) {
                var2.field445 = field534.method2315();
                var2.field446 = 100;
            }
            if ((var3 & 0x10) != 0) {
                var2.field484 = field534.method2393();
                int var9 = field534.method2477();
                var2.field460 = var9 >> 16;
                var2.field466 = (var9 & 0xFFFF) + field503;
                var2.field467 = 0;
                var2.field479 = 0;
                if (var2.field466 > field503) {
                    var2.field467 = -1;
                }
                if (var2.field484 == 65535) {
                    var2.field484 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field451 = field534.method2393();
                var2.field457 = field534.method2327();
            }
            if ((var3 & 0x2) != 0) {
                int var10 = field534.method2515();
                int var11 = field534.method2515();
                var2.method233(var10, var11, field503);
                var2.field432 = field503 + 300;
                var2.field453 = field534.method2454();
                var2.field456 = field534.method2383();
            }
        }
    }

    @ObfuscatedName("j.bb(B)V")
    public static final void method132() {
        int var0 = Statics.field399;
        int var1 = Statics.field547;
        int var2 = Statics.field251;
        int var3 = Statics.field197;
        int var4 = 6116423;
        class89.method1711(var0, var1, var2, var3, var4);
        class89.method1711(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class89.method1713(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field216.method3232(class135.field2134, var0 + 3, var1 + 14, var4, -1);
        int var5 = class77.field1397;
        int var6 = class77.field1404;
        for (int var7 = 0; var7 < field676; var7++) {
            int var8 = (field676 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class183 var10 = Statics.field216;
            String var11;
            if (field640[var7].length() > 0) {
                var11 = field639[var7] + class135.field2266 + field640[var7];
            } else {
                var11 = field639[var7];
            }
            var10.method3232(var11, var0 + 3, var8, var9, 0);
        }
        method176(Statics.field399, Statics.field547, Statics.field251, Statics.field197);
    }

    @ObfuscatedName("r.by(IIIII)V")
    public static final void method169(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field693; var4++) {
            if (field698[var4] + field645[var4] > arg0 && field698[var4] < arg0 + arg2 && field701[var4] + field699[var4] > arg1 && field699[var4] < arg1 + arg3) {
                field695[var4] = true;
            }
        }
    }

    @ObfuscatedName("r.bo(IIIII)V")
    public static final void method176(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field693; var4++) {
            if (field698[var4] + field645[var4] > arg0 && field698[var4] < arg0 + arg2 && field701[var4] + field699[var4] > arg1 && field699[var4] < arg1 + arg3) {
                field696[var4] = true;
            }
        }
    }

    @ObfuscatedName("bm.bg(I)V")
    public static final void method1230() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field676 - 1; var1++) {
                if (field564[var1] < 1000 && field564[var1 + 1] > 1000) {
                    String var2 = field640[var1];
                    field640[var1] = field640[var1 + 1];
                    field640[var1 + 1] = var2;
                    String var3 = field639[var1];
                    field639[var1] = field639[var1 + 1];
                    field639[var1 + 1] = var3;
                    int var4 = field564[var1];
                    field564[var1] = field564[var1 + 1];
                    field564[var1 + 1] = var4;
                    int var5 = field634[var1];
                    field634[var1] = field634[var1 + 1];
                    field634[var1 + 1] = var5;
                    int var6 = field492[var1];
                    field492[var1] = field492[var1 + 1];
                    field492[var1 + 1] = var6;
                    int var7 = field593[var1];
                    field593[var1] = field593[var1 + 1];
                    field593[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field878 != null || field664 != null) {
            return;
        }
        int var20;
        int var21;
        label220: {
            int var8 = class77.field1403;
            if (field743) {
                if (var8 != 1 && (Statics.field1273 || var8 != 4)) {
                    int var9 = class77.field1397;
                    int var10 = class77.field1404;
                    if (var9 < Statics.field399 - 10 || var9 > Statics.field399 + Statics.field251 + 10 || var10 < Statics.field547 - 10 || var10 > Statics.field547 + Statics.field197 + 10) {
                        field743 = false;
                        method169(Statics.field399, Statics.field547, Statics.field251, Statics.field197);
                    }
                }
                if (var8 == 1 || !Statics.field1273 && var8 == 4) {
                    int var11 = Statics.field399;
                    int var12 = Statics.field547;
                    int var13 = Statics.field251;
                    int var14 = class77.field1410;
                    int var15 = class77.field1413;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field676; var17++) {
                        int var18 = (field676 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        method52(var16);
                    }
                    field743 = false;
                    method169(Statics.field399, Statics.field547, Statics.field251, Statics.field197);
                }
            } else {
                if ((var8 == 1 || !Statics.field1273 && var8 == 4) && field676 > 0) {
                    int var19 = field564[field676 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field634[field676 - 1];
                        var21 = field492[field676 - 1];
                        class159 var22 = class159.method1507(var21);
                        int var23 = method2111(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label220;
                        }
                        int var25 = method2111(var22);
                        boolean var26 = (var25 >> 29 & 0x1) != 0;
                        if (var26) {
                            break label220;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field1273 && var8 == 4) && (field631 == 1 && field676 > 2 || method1303(field676 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field1273 && var8 == 4) && field676 > 0) {
                    method52(field676 - 1);
                }
                if (var8 == 2 && field676 > 0) {
                    method130();
                }
            }
            return;
        }
        if (Statics.field878 != null && !field532 && field631 != 1 && !method1303(field676 - 1) && field676 > 0) {
            method52(field676 - 1);
        }
        field532 = false;
        field608 = 0;
        if (Statics.field878 != null) {
            method852(Statics.field878);
        }
        Statics.field878 = class159.method1507(var21);
        field603 = var20;
        field605 = class77.field1410;
        field500 = class77.field1413;
        method852(Statics.field878);
    }

    @ObfuscatedName("s.bs(I)V")
    public static final void method130() {
        int var0 = Statics.field216.method3228(class135.field2134);
        for (int var1 = 0; var1 < field676; var1++) {
            class183 var2 = Statics.field216;
            String var3;
            if (field640[var1].length() > 0) {
                var3 = field639[var1] + class135.field2266 + field640[var1];
            } else {
                var3 = field639[var1];
            }
            int var4 = var2.method3228(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field676 * 15 + 21;
        int var6 = class77.field1410 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1413;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field743 = true;
        Statics.field399 = var6;
        Statics.field547 = var7;
        Statics.field251 = var0;
        Statics.field197 = field676 * 15 + 22;
    }

    @ObfuscatedName("bs.bc(II)Z")
    public static final boolean method1303(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field564[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("l.bv(IB)V")
    public static final void method52(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field634[arg0];
        int var2 = field492[arg0];
        int var3 = field564[arg0];
        int var4 = field593[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 1) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(214);
            field504.method2330(Statics.field397);
            field504.method2330(var4 >> 14 & 0x7FFF);
            field504.method2337(Statics.field1808);
            field504.method2306(Statics.field1246 + var2);
            field504.method2337(Statics.field267 + var1);
            field504.method2305(Statics.field1378);
        }
        if (var3 == 12) {
            class25 var5 = field529[var4];
            if (var5 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(169);
                field504.method2348(var4);
            }
        }
        if (var3 == 16) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(119);
            field504.method2305(Statics.field1378);
            field504.method2348(Statics.field267 + var1);
            field504.method2337(Statics.field1246 + var2);
            field504.method2330(Statics.field1808);
            field504.method2306(var4);
            field504.method2306(Statics.field397);
        }
        if (var3 == 20) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(48);
            field504.method2337(Statics.field1246 + var2);
            field504.method2337(Statics.field267 + var1);
            field504.method2306(var4);
        }
        if (var3 == 30 && field568 == null) {
            field504.method2218(56);
            field504.method2306(var1);
            field504.method2305(var2);
            field568 = class159.method2121(var2, var1);
            method852(field568);
        }
        if (var3 == 1003) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            class25 var6 = field529[var4];
            if (var6 != null) {
                class31 var7 = var6.field406;
                if (var7.field824 != null) {
                    var7 = var7.method583();
                }
                if (var7 != null) {
                    field504.method2218(23);
                    field504.method2348(var7.field790);
                }
            }
        }
        if (var3 == 21) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(137);
            field504.method2348(Statics.field1246 + var2);
            field504.method2348(var4);
            field504.method2348(Statics.field267 + var1);
        }
        if (var3 == 29) {
            field504.method2218(133);
            field504.method2307(var2);
            class159 var8 = class159.method1507(var2);
            if (var8.field2633 != null && var8.field2633[0][0] == 5) {
                int var9 = var8.field2633[0][1];
                if (class160.field2731[var9] != var8.field2725[0]) {
                    class160.field2731[var9] = var8.field2725[0];
                    method549(var9);
                }
            }
        }
        if (var3 == 10) {
            class25 var10 = field529[var4];
            if (var10 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(187);
                field504.method2306(var4);
            }
        }
        if (var3 == 3) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(185);
            field504.method2348(Statics.field267 + var1);
            field504.method2306(Statics.field1246 + var2);
            field504.method2337(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 57 || var3 == 1007) {
            String var11 = field640[arg0];
            class159 var12 = class159.method2121(var2, var1);
            if (var12 != null) {
                if (var12.field2698 != null) {
                    class1 var13 = new class1();
                    var13.field3 = var12;
                    var13.field9 = var4;
                    var13.field10 = var11;
                    var13.field11 = var12.field2698;
                    class26.method196(var13);
                }
                boolean var14 = true;
                if (var12.field2642 > 0) {
                    var14 = method242(var12);
                }
                if (var14 && class163.method2116(method2111(var12), var4 - 1)) {
                    if (var4 == 1) {
                        field504.method2218(205);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 2) {
                        field504.method2218(215);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 3) {
                        field504.method2218(40);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 4) {
                        field504.method2218(24);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 5) {
                        field504.method2218(253);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 6) {
                        field504.method2218(172);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 7) {
                        field504.method2218(79);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 8) {
                        field504.method2218(176);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 9) {
                        field504.method2218(9);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                    if (var4 == 10) {
                        field504.method2218(223);
                        field504.method2307(var2);
                        field504.method2306(var1);
                    }
                }
            }
        }
        if (var3 == 23) {
            Statics.field550.method1891(Statics.field178, var1, var2);
        }
        if (var3 == 24) {
            class159 var15 = class159.method1507(var2);
            boolean var16 = true;
            if (var15.field2642 > 0) {
                var16 = method242(var15);
            }
            if (var16) {
                field504.method2218(133);
                field504.method2307(var2);
            }
        }
        if (var3 == 1005) {
            class159 var17 = class159.method1507(var2);
            if (var17 == null || var17.field2714[var1] < 100000) {
                field504.method2218(196);
                field504.method2348(var4);
            } else {
                method105(0, "", var17.field2714[var1] + " x " + class40.method11(var4).field1030);
            }
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 31) {
            field504.method2218(92);
            field504.method2306(var4);
            field504.method2348(Statics.field397);
            field504.method2307(Statics.field1378);
            field504.method2307(var2);
            field504.method2330(Statics.field1808);
            field504.method2337(var1);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 17) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(179);
            field504.method2306(Statics.field267 + var1);
            field504.method2337(field649);
            field504.method2359(Statics.field196);
            field504.method2348(Statics.field1246 + var2);
            field504.method2348(var4);
        }
        if (var3 == 44) {
            class3 var18 = field610[var4];
            if (var18 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(89);
                field504.method2348(var4);
            }
        }
        if (var3 == 28) {
            field504.method2218(133);
            field504.method2307(var2);
            class159 var19 = class159.method1507(var2);
            if (var19.field2633 != null && var19.field2633[0][0] == 5) {
                int var20 = var19.field2633[0][1];
                class160.field2731[var20] = 1 - class160.field2731[var20];
                method549(var20);
            }
        }
        if (var3 == 22) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(128);
            field504.method2337(Statics.field267 + var1);
            field504.method2306(Statics.field1246 + var2);
            field504.method2330(var4);
        }
        if (var3 == 49) {
            class3 var21 = field610[var4];
            if (var21 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(153);
                field504.method2337(var4);
            }
        }
        if (var3 == 36) {
            field504.method2218(152);
            field504.method2330(var4);
            field504.method2370(var2);
            field504.method2348(var1);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 34) {
            field504.method2218(194);
            field504.method2348(var1);
            field504.method2359(var2);
            field504.method2337(var4);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 32) {
            field504.method2218(131);
            field504.method2337(var1);
            field504.method2305(Statics.field196);
            field504.method2359(var2);
            field504.method2337(field649);
            field504.method2306(var4);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 48) {
            class3 var22 = field610[var4];
            if (var22 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(156);
                field504.method2306(var4);
            }
        }
        if (var3 == 33) {
            field504.method2218(173);
            field504.method2348(var1);
            field504.method2330(var4);
            field504.method2359(var2);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 14) {
            class3 var23 = field610[var4];
            if (var23 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(231);
                field504.method2348(Statics.field1808);
                field504.method2359(Statics.field1378);
                field504.method2348(Statics.field397);
                field504.method2330(var4);
            }
        }
        if (var3 == 43) {
            field504.method2218(11);
            field504.method2359(var2);
            field504.method2337(var4);
            field504.method2337(var1);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 9) {
            class25 var24 = field529[var4];
            if (var24 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(3);
                field504.method2337(var4);
            }
        }
        if (var3 == 25) {
            class159 var25 = class159.method2121(var2, var1);
            if (var25 != null) {
                method524();
                int var26 = method2111(var25);
                int var27 = var26 >> 11 & 0x3F;
                class159 var29 = class159.method2121(var2, var1);
                if (var29 != null && var29.field2689 != null) {
                    class1 var30 = new class1();
                    var30.field3 = var29;
                    var30.field11 = var29.field2689;
                    class26.method196(var30);
                }
                field647 = true;
                Statics.field196 = var2;
                field649 = var1;
                Statics.field185 = var27;
                method852(var29);
                field709 = 0;
                int var31 = method2111(var25);
                int var32 = var31 >> 11 & 0x3F;
                String var33;
                if (var32 == 0) {
                    var33 = null;
                } else if (var25.field2617 == null || var25.field2617.trim().length() == 0) {
                    var33 = null;
                } else {
                    var33 = var25.field2617;
                }
                field556 = var33;
                if (field556 == null) {
                    field556 = "Null";
                }
                if (var25.field2654) {
                    field650 = var25.field2671 + class2.method1311(16777215);
                } else {
                    field650 = class2.method1311(65280) + var25.field2711 + class2.method1311(16777215);
                }
            }
            return;
        }
        if (var3 == 15) {
            class3 var34 = field610[var4];
            if (var34 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(191);
                field504.method2306(var4);
                field504.method2370(Statics.field196);
                field504.method2306(field649);
            }
        }
        if (var3 == 47) {
            class3 var35 = field610[var4];
            if (var35 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(4);
                field504.method2348(var4);
            }
        }
        if (var3 == 38) {
            method524();
            class159 var36 = class159.method1507(var2);
            field709 = 1;
            Statics.field397 = var1;
            Statics.field1378 = var2;
            Statics.field1808 = var4;
            method852(var36);
            field736 = class2.method1311(16748608) + class40.method11(var4).field1030 + class2.method1311(16777215);
            if (field736 == null) {
                field736 = "null";
            }
            return;
        }
        if (var3 == 39) {
            field504.method2218(10);
            field504.method2348(var4);
            field504.method2307(var2);
            field504.method2306(var1);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 42) {
            field504.method2218(168);
            field504.method2348(var1);
            field504.method2359(var2);
            field504.method2337(var4);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 2) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(69);
            field504.method2348(field649);
            field504.method2337(Statics.field267 + var1);
            field504.method2306(Statics.field1246 + var2);
            field504.method2348(var4 >> 14 & 0x7FFF);
            field504.method2305(Statics.field196);
        }
        if (var3 == 46) {
            class3 var37 = field610[var4];
            if (var37 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(75);
                field504.method2306(var4);
            }
        }
        if (var3 == 51) {
            class3 var38 = field610[var4];
            if (var38 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(116);
                field504.method2337(var4);
            }
        }
        if (var3 == 50) {
            class3 var39 = field610[var4];
            if (var39 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(160);
                field504.method2337(var4);
            }
        }
        if (var3 == 1004) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field504.method2218(196);
            field504.method2348(var4);
        }
        if (var3 == 8) {
            class25 var40 = field529[var4];
            if (var40 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(58);
                field504.method2370(Statics.field196);
                field504.method2348(field649);
                field504.method2306(var4);
            }
        }
        if (var3 == 6) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(45);
            field504.method2337(Statics.field267 + var1);
            field504.method2337(var4 >> 14 & 0x7FFF);
            field504.method2306(Statics.field1246 + var2);
        }
        if (var3 == 1002) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field504.method2218(243);
            field504.method2337(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 40) {
            field504.method2218(211);
            field504.method2306(var4);
            field504.method2370(var2);
            field504.method2337(var1);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 45) {
            class3 var41 = field610[var4];
            if (var41 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(213);
                field504.method2348(var4);
            }
        }
        if (var3 == 19) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(139);
            field504.method2337(Statics.field1246 + var2);
            field504.method2348(var4);
            field504.method2348(Statics.field267 + var1);
        }
        if (var3 == 35) {
            field504.method2218(2);
            field504.method2337(var1);
            field504.method2307(var2);
            field504.method2306(var4);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 18) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(0);
            field504.method2337(var4);
            field504.method2348(Statics.field267 + var1);
            field504.method2306(Statics.field1246 + var2);
        }
        if (var3 == 5) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(38);
            field504.method2337(Statics.field267 + var1);
            field504.method2337(var4 >> 14 & 0x7FFF);
            field504.method2330(Statics.field1246 + var2);
        }
        if (var3 == 37) {
            field504.method2218(65);
            field504.method2348(var4);
            field504.method2307(var2);
            field504.method2337(var1);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 1001) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(118);
            field504.method2306(Statics.field1246 + var2);
            field504.method2330(var4 >> 14 & 0x7FFF);
            field504.method2337(Statics.field267 + var1);
        }
        if (var3 == 58) {
            field504.method2218(145);
            field504.method2370(Statics.field196);
            field504.method2348(field649);
            field504.method2348(var1);
            field504.method2370(var2);
        }
        if (var3 == 4) {
            field597 = class77.field1410;
            field598 = class77.field1413;
            field600 = 2;
            field599 = 0;
            field665 = var1;
            field725 = var2;
            field504.method2218(112);
            field504.method2330(var4 >> 14 & 0x7FFF);
            field504.method2348(Statics.field267 + var1);
            field504.method2337(Statics.field1246 + var2);
        }
        if (var3 == 13) {
            class25 var42 = field529[var4];
            if (var42 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(158);
                field504.method2348(var4);
            }
        }
        if (var3 == 7) {
            class25 var43 = field529[var4];
            if (var43 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(181);
                field504.method2359(Statics.field1378);
                field504.method2348(var4);
                field504.method2337(Statics.field1808);
                field504.method2306(Statics.field397);
            }
        }
        if (var3 == 41) {
            field504.method2218(232);
            field504.method2307(var2);
            field504.method2330(var1);
            field504.method2330(var4);
            field601 = 0;
            Statics.field1764 = class159.method1507(var2);
            field590 = var1;
        }
        if (var3 == 11) {
            class25 var44 = field529[var4];
            if (var44 != null) {
                field597 = class77.field1410;
                field598 = class77.field1413;
                field600 = 2;
                field599 = 0;
                field665 = var1;
                field725 = var2;
                field504.method2218(210);
                field504.method2330(var4);
            }
        }
        if (var3 == 26) {
            field504.method2218(72);
            for (class4 var45 = (class4) field652.method3155(); var45 != null; var45 = (class4) field652.method3139()) {
                if (var45.field52 == 0 || var45.field52 == 3) {
                    method37(var45, true);
                }
            }
            if (field568 != null) {
                method852(field568);
                field568 = null;
            }
        }
        if (field709 != 0) {
            field709 = 0;
            method852(class159.method1507(Statics.field1378));
        }
        if (field647) {
            method524();
        }
        if (Statics.field1764 != null && field601 == 0) {
            method852(Statics.field1764);
        }
    }

    @ObfuscatedName("h.bx(ILjava/lang/String;B)V")
    public static void method92(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field516; var3++) {
            class3 var4 = field610[field738[var3]];
            if (var4 != null && var4.field50 != null && var4.field50.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field504.method2218(89);
                    field504.method2348(field738[var3]);
                } else if (arg0 == 4) {
                    field504.method2218(4);
                    field504.method2348(field738[var3]);
                } else if (arg0 == 6) {
                    field504.method2218(153);
                    field504.method2337(field738[var3]);
                } else if (arg0 == 7) {
                    field504.method2218(160);
                    field504.method2337(field738[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method105(0, "", class135.field2270 + arg1);
        }
    }

    @ObfuscatedName("as.bt(I)V")
    public static void method524() {
        if (!field647) {
            return;
        }
        class159 var0 = class159.method2121(Statics.field196, field649);
        if (var0 != null && var0.field2690 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field11 = var0.field2690;
            class26.method196(var1);
        }
        field647 = false;
        method852(var0);
    }

    @ObfuscatedName("b.bk(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method136(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field743 || field676 >= 500) {
            return;
        }
        field639[field676] = arg0;
        field640[field676] = arg1;
        field564[field676] = arg2;
        field593[field676] = arg3;
        field634[field676] = arg4;
        field492[field676] = arg5;
        field676++;
    }

    @ObfuscatedName("aw.bp(II)Z")
    public static boolean method861(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("n.bw(Lag;IIII)V")
    public static final void method144(class31 arg0, int arg1, int arg2, int arg3) {
        if (field676 >= 400) {
            return;
        }
        if (arg0.field824 != null) {
            arg0 = arg0.method583();
        }
        if (arg0 == null || !arg0.field823) {
            return;
        }
        String var4 = arg0.field795;
        if (arg0.field794 != 0) {
            int var6 = arg0.field794;
            int var7 = Statics.field2555.field35;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1311(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1311(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1311(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1311(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1311(65280);
            } else if (var8 > 6) {
                var9 = class2.method1311(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1311(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1311(12648192);
            } else {
                var9 = class2.method1311(16776960);
            }
            var4 = var4 + var9 + " " + class2.field18 + class135.field2262 + arg0.field794 + class2.field19;
        }
        if (field709 == 1) {
            method136(class135.field2256, field736 + " " + class2.field20 + " " + class2.method1311(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field647) {
            String[] var10 = arg0.field810;
            if (field703) {
                var10 = method1275(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class135.field2353)) {
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
                        method136(var10[var11], class2.method1311(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class135.field2353)) {
                        short var14 = 0;
                        if (arg0.field794 > Statics.field2555.field35) {
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
                        method136(var10[var13], class2.method1311(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method136(class135.field2257, class2.method1311(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field185 & 0x2) == 2) {
            method136(field556, field650 + " " + class2.field20 + " " + class2.method1311(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("k.bz(Ly;IIII)V")
    public static final void method197(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2555 == arg0 || field676 >= 400) {
            return;
        }
        String var9;
        if (arg0.field44 == 0) {
            String var4 = arg0.field50;
            int var5 = arg0.field35;
            int var6 = Statics.field2555.field35;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1311(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1311(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1311(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1311(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1311(65280);
            } else if (var7 > 6) {
                var8 = class2.method1311(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1311(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1311(12648192);
            } else {
                var8 = class2.method1311(16776960);
            }
            var9 = var4 + var8 + " " + class2.field18 + class135.field2262 + arg0.field35 + class2.field19;
        } else {
            var9 = arg0.field50 + " " + class2.field18 + class135.field2199 + arg0.field44 + class2.field19;
        }
        if (field709 == 1) {
            method136(class135.field2256, field736 + " " + class2.field20 + " " + class2.method1311(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field647) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field621[var10] != null) {
                    short var11 = 0;
                    if (field621[var10].equalsIgnoreCase(class135.field2353)) {
                        if (arg0.field35 > Statics.field2555.field35) {
                            var11 = 2000;
                        }
                        if (Statics.field2555.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field2555.field48 == arg0.field48) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field622[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field620[var10] + var11;
                    method136(field621[var10], class2.method1311(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field185 & 0x8) == 8) {
            method136(field556, field650 + " " + class2.field20 + " " + class2.method1311(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field676; var14++) {
            if (field564[var14] == 23) {
                field640[var14] = class2.method1311(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("m.br(IIIIIIIIB)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class159.method227(arg0)) {
            Statics.field407 = null;
            method120(Statics.field2666[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field407 != null) {
                method120(Statics.field407, -1412584499, arg1, arg2, arg3, arg4, Statics.field763, Statics.field674, arg7);
                Statics.field407 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field695[var8] = true;
            }
        } else {
            field695[arg7] = true;
        }
    }

    @ObfuscatedName("m.bh([Lfz;IIIIIIIII)V")
    public static final void method120(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1705(arg2, arg3, arg4, arg5);
        class104.method2032();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2622 == arg1 || arg1 == -1412584499 && field664 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field698[field693] = var10.field2609 + arg6;
                    field699[field693] = var10.field2707 + arg7;
                    field645[field693] = var10.field2620;
                    field701[field693] = var10.field2615;
                    var11 = ++field693 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2639 = var11;
                var10.field2727 = field503;
                if (!var10.field2654 || !method2114(var10)) {
                    if (var10.field2642 > 0) {
                        method221(var10);
                    }
                    int var12 = var10.field2609 + arg6;
                    int var13 = var10.field2707 + arg7;
                    int var14 = var10.field2610;
                    if (field664 == var10) {
                        if (arg1 != -1412584499 && !var10.field2674) {
                            Statics.field407 = arg0;
                            Statics.field763 = arg6;
                            Statics.field674 = arg7;
                            continue;
                        }
                        if (field673 && field755) {
                            int var15 = class77.field1397;
                            int var16 = class77.field1404;
                            int var17 = var15 - field648;
                            int var18 = var16 - field663;
                            if (var17 < field754) {
                                var17 = field754;
                            }
                            if (var10.field2620 + var17 > field754 + field577.field2620) {
                                var17 = field754 + field577.field2620 - var10.field2620;
                            }
                            if (var18 < field642) {
                                var18 = field642;
                            }
                            if (var10.field2615 + var18 > field642 + field577.field2615) {
                                var18 = field642 + field577.field2615 - var10.field2615;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2674) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2611 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2611 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2620 + var12;
                        int var26 = var10.field2615 + var13;
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
                        int var29 = var10.field2620 + var12;
                        int var30 = var10.field2615 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2654 || var19 < var21 && var20 < var22) {
                        if (var10.field2642 != 0) {
                            if (var10.field2642 == 1337) {
                                field641 = var12;
                                field515 = var13;
                                method65(var12, var13, var10.field2620, var10.field2615);
                                class89.method1705(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2642 == 1338) {
                                method2196(var12, var13, var11);
                                class89.method1705(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2611 == 0) {
                            if (!var10.field2654 && method2114(var10) && Statics.field256 != var10) {
                                continue;
                            }
                            if (!var10.field2654) {
                                if (var10.field2683 > var10.field2627 - var10.field2615) {
                                    var10.field2683 = var10.field2627 - var10.field2615;
                                }
                                if (var10.field2683 < 0) {
                                    var10.field2683 = 0;
                                }
                            }
                            method120(arg0, var10.field2719, var19, var20, var21, var22, var12 - var10.field2624, var13 - var10.field2683, var11);
                            if (var10.field2705 != null) {
                                method120(var10.field2705, var10.field2719, var19, var20, var21, var22, var12 - var10.field2624, var13 - var10.field2683, var11);
                            }
                            class4 var31 = (class4) field652.method3138((long) var10.field2719);
                            if (var31 != null) {
                                method121(var31.field58, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1705(arg2, arg3, arg4, arg5);
                            class104.method2032();
                        }
                        if (field697[var11] || field702 > 1) {
                            if (var10.field2611 == 0 && !var10.field2654 && var10.field2627 > var10.field2615) {
                                method134(var10.field2620 + var12, var13, var10.field2683, var10.field2615, var10.field2627);
                            }
                            if (var10.field2611 != 1) {
                                if (var10.field2611 == 2) {
                                    int var32 = 0;
                                    for (int var33 = 0; var33 < var10.field2615; var33++) {
                                        for (int var34 = 0; var34 < var10.field2620; var34++) {
                                            int var35 = (var10.field2664 + 32) * var34 + var12;
                                            int var36 = (var10.field2665 + 32) * var33 + var13;
                                            if (var32 < 20) {
                                                var35 += var10.field2701[var32];
                                                var36 += var10.field2686[var32];
                                            }
                                            if (var10.field2713[var32] > 0) {
                                                boolean var37 = false;
                                                boolean var38 = false;
                                                int var39 = var10.field2713[var32] - 1;
                                                if (var35 + 32 > arg2 && var35 < arg4 && var36 + 32 > arg3 && var36 < arg5 || Statics.field878 == var10 && field603 == var32) {
                                                    class86 var40;
                                                    if (field709 == 1 && Statics.field397 == var32 && Statics.field1378 == var10.field2719) {
                                                        var40 = class40.method745(var39, var10.field2714[var32], 2, 0, false);
                                                    } else {
                                                        var40 = class40.method745(var39, var10.field2714[var32], 1, 3153952, false);
                                                    }
                                                    if (var40 == null) {
                                                        method852(var10);
                                                    } else if (Statics.field878 == var10 && field603 == var32) {
                                                        int var41 = class77.field1397 - field605;
                                                        int var42 = class77.field1404 - field500;
                                                        if (var41 < 5 && var41 > -5) {
                                                            var41 = 0;
                                                        }
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        if (field608 < 5) {
                                                            var41 = 0;
                                                            var42 = 0;
                                                        }
                                                        var40.method1609(var35 + var41, var36 + var42, 128);
                                                        if (arg1 != -1) {
                                                            class159 var43 = arg0[arg1 & 0xFFFF];
                                                            if (var36 + var42 < class89.field1513 && var43.field2683 > 0) {
                                                                int var44 = field567 * (class89.field1513 - var36 - var42) / 3;
                                                                if (var44 > field567 * 10) {
                                                                    var44 = field567 * 10;
                                                                }
                                                                if (var44 > var43.field2683) {
                                                                    var44 = var43.field2683;
                                                                }
                                                                var43.field2683 -= var44;
                                                                field500 += var44;
                                                                method852(var43);
                                                            }
                                                            if (var36 + var42 + 32 > class89.field1511 && var43.field2683 < var43.field2627 - var43.field2615) {
                                                                int var45 = field567 * (var36 + var42 + 32 - class89.field1511) / 3;
                                                                if (var45 > field567 * 10) {
                                                                    var45 = field567 * 10;
                                                                }
                                                                if (var45 > var43.field2627 - var43.field2615 - var43.field2683) {
                                                                    var45 = var43.field2627 - var43.field2615 - var43.field2683;
                                                                }
                                                                var43.field2683 += var45;
                                                                field500 -= var45;
                                                                method852(var43);
                                                            }
                                                        }
                                                    } else if (Statics.field1764 == var10 && field590 == var32) {
                                                        var40.method1609(var35, var36, 128);
                                                    } else {
                                                        var40.method1603(var35, var36);
                                                    }
                                                }
                                            } else if (var10.field2696 != null && var32 < 20) {
                                                class86 var46 = var10.method3010(var32);
                                                if (var46 != null) {
                                                    var46.method1603(var35, var36);
                                                } else if (class159.field2726) {
                                                    method852(var10);
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                } else if (var10.field2611 == 3) {
                                    int var47;
                                    if (method2130(var10)) {
                                        var47 = var10.field2629;
                                        if (Statics.field256 == var10 && var10.field2631 != 0) {
                                            var47 = var10.field2631;
                                        }
                                    } else {
                                        var47 = var10.field2702;
                                        if (Statics.field256 == var10 && var10.field2630 != 0) {
                                            var47 = var10.field2630;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2632) {
                                            class89.method1711(var12, var13, var10.field2620, var10.field2615, var47);
                                        } else {
                                            class89.method1713(var12, var13, var10.field2620, var10.field2615, var47);
                                        }
                                    } else if (var10.field2632) {
                                        class89.method1718(var12, var13, var10.field2620, var10.field2615, var47, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1702(var12, var13, var10.field2620, var10.field2615, var47, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2611 == 4) {
                                    class183 var48 = var10.method3023();
                                    if (var48 != null) {
                                        String var49 = var10.field2658;
                                        int var50;
                                        if (method2130(var10)) {
                                            var50 = var10.field2629;
                                            if (Statics.field256 == var10 && var10.field2631 != 0) {
                                                var50 = var10.field2631;
                                            }
                                            if (var10.field2715.length() > 0) {
                                                var49 = var10.field2715;
                                            }
                                        } else {
                                            var50 = var10.field2702;
                                            if (Statics.field256 == var10 && var10.field2630 != 0) {
                                                var50 = var10.field2630;
                                            }
                                        }
                                        if (var10.field2654 && var10.field2721 != -1) {
                                            class40 var51 = class40.method11(var10.field2721);
                                            var49 = var51.field1030;
                                            if (var49 == null) {
                                                var49 = "null";
                                            }
                                            if ((var51.field1013 == 1 || var10.field2716 != 1) && var10.field2716 != -1) {
                                                var49 = class2.method1311(16748608) + var49 + class2.field22 + " " + 'x' + method1590(var10.field2716);
                                            }
                                        }
                                        if (field568 == var10) {
                                            class135 var10000 = (class135) null;
                                            var49 = class135.field2264;
                                            var50 = var10.field2702;
                                        }
                                        if (!var10.field2654) {
                                            var49 = method241(var49, var10);
                                        }
                                        var48.method3295(var49, var12, var13, var10.field2620, var10.field2615, var50, var10.field2663 ? 0 : -1, var10.field2661, var10.field2662, var10.field2659);
                                    } else if (class159.field2726) {
                                        method852(var10);
                                    }
                                } else if (var10.field2611 == 5) {
                                    if (var10.field2654) {
                                        class86 var53;
                                        if (var10.field2721 == -1) {
                                            var53 = var10.method3008(false);
                                        } else {
                                            var53 = class40.method745(var10.field2721, var10.field2716, var10.field2703, var10.field2640, false);
                                        }
                                        if (var53 != null) {
                                            int var54 = var53.field1494;
                                            int var55 = var53.field1490;
                                            if (var10.field2638) {
                                                class89.method1706(var12, var13, var10.field2620 + var12, var10.field2615 + var13);
                                                int var56 = (var10.field2620 + (var54 - 1)) / var54;
                                                int var57 = (var10.field2615 + (var55 - 1)) / var55;
                                                for (int var58 = 0; var58 < var56; var58++) {
                                                    for (int var59 = 0; var59 < var57; var59++) {
                                                        if (var10.field2635 != 0) {
                                                            var53.method1674(var54 / 2 + var54 * var58 + var12, var55 / 2 + var55 * var59 + var13, var10.field2635, 4096);
                                                        } else if (var14 == 0) {
                                                            var53.method1603(var54 * var58 + var12, var55 * var59 + var13);
                                                        } else {
                                                            var53.method1609(var54 * var58 + var12, var55 * var59 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1705(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var60 = var10.field2620 * 4096 / var54;
                                                if (var10.field2635 != 0) {
                                                    var53.method1674(var10.field2620 / 2 + var12, var10.field2615 / 2 + var13, var10.field2635, var60);
                                                } else if (var14 != 0) {
                                                    var53.method1632(var12, var13, var10.field2620, var10.field2615, 256 - (var14 & 0xFF));
                                                } else if (var10.field2620 == var54 && var10.field2615 == var55) {
                                                    var53.method1603(var12, var13);
                                                } else {
                                                    var53.method1602(var12, var13, var10.field2620, var10.field2615);
                                                }
                                            }
                                        } else if (class159.field2726) {
                                            method852(var10);
                                        }
                                    } else {
                                        class86 var52 = var10.method3008(method2130(var10));
                                        if (var52 != null) {
                                            var52.method1603(var12, var13);
                                        } else if (class159.field2726) {
                                            method852(var10);
                                        }
                                    }
                                } else if (var10.field2611 == 6) {
                                    boolean var61 = method2130(var10);
                                    int var62;
                                    if (var61) {
                                        var62 = var10.field2602;
                                    } else {
                                        var62 = var10.field2647;
                                    }
                                    class112 var63 = null;
                                    int var64 = 0;
                                    if (var10.field2721 != -1) {
                                        class40 var65 = class40.method11(var10.field2721);
                                        if (var65 != null) {
                                            class40 var66 = var65.method798(var10.field2716);
                                            var63 = var66.method797(1);
                                            if (var63 == null) {
                                                method852(var10);
                                            } else {
                                                var63.method2192();
                                                var64 = var63.field1569 / 2;
                                            }
                                        }
                                    } else if (var10.field2643 == 5) {
                                        if (var10.field2644 == 0) {
                                            var63 = field750.method3081((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var63 = Statics.field2555.method13();
                                        }
                                    } else if (var62 == -1) {
                                        var63 = var10.method3011((class34) null, -1, var61, Statics.field2555.field31);
                                        if (var63 == null && class159.field2726) {
                                            method852(var10);
                                        }
                                    } else {
                                        class34 var67 = Statics.method1425(var62);
                                        var63 = var10.method3011(var67, var10.field2717, var61, Statics.field2555.field31);
                                        if (var63 == null && class159.field2726) {
                                            method852(var10);
                                        }
                                    }
                                    class104.method2035(var10.field2620 / 2 + var12, var10.field2615 / 2 + var13);
                                    int var68 = var10.field2680 * class104.field1776[var10.field2651] >> 16;
                                    int var69 = var10.field2680 * class104.field1789[var10.field2651] >> 16;
                                    if (var63 != null) {
                                        if (var10.field2654) {
                                            var63.method2192();
                                            if (var10.field2656) {
                                                var63.method2151(0, var10.field2606, var10.field2653, var10.field2651, var10.field2649, var10.field2650 + var64 + var68, var10.field2650 + var69, var10.field2680);
                                            } else {
                                                var63.method2150(0, var10.field2606, var10.field2653, var10.field2651, var10.field2649, var10.field2650 + var64 + var68, var10.field2650 + var69);
                                            }
                                        } else {
                                            var63.method2150(0, var10.field2606, 0, var10.field2651, 0, var68, var69);
                                        }
                                    }
                                    class104.method2034();
                                } else {
                                    if (var10.field2611 == 7) {
                                        class183 var70 = var10.method3023();
                                        if (var70 == null) {
                                            if (class159.field2726) {
                                                method852(var10);
                                            }
                                            continue;
                                        }
                                        int var71 = 0;
                                        for (int var72 = 0; var72 < var10.field2615; var72++) {
                                            for (int var73 = 0; var73 < var10.field2620; var73++) {
                                                if (var10.field2713[var71] > 0) {
                                                    class40 var74 = class40.method11(var10.field2713[var71] - 1);
                                                    String var75;
                                                    if (var74.field1013 != 1 && var10.field2714[var71] == 1) {
                                                        var75 = class2.method1311(16748608) + var74.field1030 + class2.field22;
                                                    } else {
                                                        var75 = class2.method1311(16748608) + var74.field1030 + class2.field22 + " " + 'x' + method1590(var10.field2714[var71]);
                                                    }
                                                    int var76 = (var10.field2664 + 115) * var73 + var12;
                                                    int var77 = (var10.field2665 + 12) * var72 + var13;
                                                    if (var10.field2661 == 0) {
                                                        var70.method3232(var75, var76, var77, var10.field2702, var10.field2663 ? 0 : -1);
                                                    } else if (var10.field2661 == 1) {
                                                        var70.method3286(var75, var10.field2620 / 2 + var76, var77, var10.field2702, var10.field2663 ? 0 : -1);
                                                    } else {
                                                        var70.method3233(var75, var10.field2620 + var76 - 1, var77, var10.field2702, var10.field2663 ? 0 : -1);
                                                    }
                                                }
                                                var71++;
                                            }
                                        }
                                    }
                                    if (var10.field2611 == 8 && Statics.field980 == var10 && field669 == field643) {
                                        int var78 = 0;
                                        int var79 = 0;
                                        class183 var80 = Statics.field2582;
                                        String var81 = var10.field2658;
                                        String var82 = method241(var81, var10);
                                        while (var82.length() > 0) {
                                            int var83 = var82.indexOf(class2.field21);
                                            String var84;
                                            if (var83 == -1) {
                                                var84 = var82;
                                                var82 = "";
                                            } else {
                                                var84 = var82.substring(0, var83);
                                                var82 = var82.substring(var83 + 4);
                                            }
                                            int var85 = var80.method3228(var84);
                                            if (var85 > var78) {
                                                var78 = var85;
                                            }
                                            var79 += var80.field2843 + 1;
                                        }
                                        var78 += 6;
                                        var79 += 7;
                                        int var86 = var10.field2620 + var12 - 5 - var78;
                                        int var87 = var10.field2615 + var13 + 5;
                                        if (var86 < var12 + 5) {
                                            var86 = var12 + 5;
                                        }
                                        if (var78 + var86 > arg4) {
                                            var86 = arg4 - var78;
                                        }
                                        if (var79 + var87 > arg5) {
                                            var87 = arg5 - var79;
                                        }
                                        class89.method1711(var86, var87, var78, var79, 16777120);
                                        class89.method1713(var86, var87, var78, var79, 0);
                                        String var88 = var10.field2658;
                                        int var89 = var80.field2843 + var87 + 2;
                                        String var90 = method241(var88, var10);
                                        while (var90.length() > 0) {
                                            int var91 = var90.indexOf(class2.field21);
                                            String var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = "";
                                            } else {
                                                var92 = var90.substring(0, var91);
                                                var90 = var90.substring(var91 + 4);
                                            }
                                            var80.method3232(var92, var86 + 3, var89, 0, -1);
                                            var89 += var80.field2843 + 1;
                                        }
                                    }
                                    if (var10.field2611 == 9) {
                                        if (var10.field2634 == 1) {
                                            class89.method1719(var12, var13, var10.field2620 + var12, var10.field2615 + var13, var10.field2702);
                                        } else {
                                            int var93 = var10.field2620 >= 0 ? var10.field2620 : -var10.field2620;
                                            int var94 = var10.field2615 >= 0 ? var10.field2615 : -var10.field2615;
                                            int var95 = var93;
                                            if (var93 < var94) {
                                                var95 = var94;
                                            }
                                            if (var95 != 0) {
                                                int var96 = (var10.field2620 << 16) / var95;
                                                int var97 = (var10.field2615 << 16) / var95;
                                                if (var97 <= var96) {
                                                    var96 = -var96;
                                                } else {
                                                    var97 = -var97;
                                                }
                                                int var98 = var10.field2634 * var97 >> 17;
                                                int var99 = var10.field2634 * var97 + 1 >> 17;
                                                int var100 = var10.field2634 * var96 >> 17;
                                                int var101 = var10.field2634 * var96 + 1 >> 17;
                                                int var102 = var12 + var98;
                                                int var103 = var12 - var99;
                                                int var104 = var10.field2620 + var12 - var99;
                                                int var105 = var10.field2620 + var12 + var98;
                                                int var106 = var13 + var100;
                                                int var107 = var13 - var101;
                                                int var108 = var10.field2615 + var13 - var101;
                                                int var109 = var10.field2615 + var13 + var100;
                                                class104.method2080(var102, var103, var104);
                                                class104.method2043(var106, var107, var108, var102, var103, var104, var10.field2702);
                                                class104.method2080(var102, var104, var105);
                                                class104.method2043(var106, var108, var109, var102, var104, var105, var10.field2702);
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

    @ObfuscatedName("ap.bq(Ljava/lang/String;Lfz;B)Ljava/lang/String;")
    public static String method241(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2815(method2859(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1543 != null) {
                    var5 = class148.method143(Statics.field1543.field1425);
                    if (Statics.field1543.field1427 != null) {
                        var5 = (String) Statics.field1543.field1427;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cj.bj(II)Ljava/lang/String;")
    public static final String method1590(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field16 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1311(65408) + var1.substring(0, var1.length() - 8) + class135.field2307 + " " + class2.field18 + var1 + class2.field19 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method1311(16777215) + var1.substring(0, var1.length() - 4) + class135.field2269 + " " + class2.field18 + var1 + class2.field19 + class2.field22;
        } else {
            return " " + class2.method1311(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("l.co(Lfz;IIIIIII)V")
    public static final void method55(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field572) {
            field573 = 32;
        } else {
            field573 = 0;
        }
        field572 = false;
        if (class77.field1409 == 1 || !Statics.field1273 && class77.field1409 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2683 -= 4;
                method852(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2683 += 4;
                method852(arg0);
            } else if (arg5 >= arg1 - field573 && arg5 < field573 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2683 = (arg4 - arg3) * var8 / var9;
                method852(arg0);
                field572 = true;
            }
        }
        if (field692 == 0) {
            return;
        }
        int var10 = arg0.field2620;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2683 += field692 * 45;
            method852(arg0);
        }
    }

    @ObfuscatedName("j.ce(IIIIII)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1759[0].method1693(arg0, arg1);
        Statics.field1759[1].method1693(arg0, arg1 + arg3 - 16);
        class89.method1711(arg0, arg1 + 16, 16, arg3 - 32, field571);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1711(arg0, arg1 + 16 + var6, 16, var5, field569);
        class89.method1748(arg0, arg1 + 16 + var6, var5, field570);
        class89.method1748(arg0 + 1, arg1 + 16 + var6, var5, field570);
        class89.method1753(arg0, arg1 + 16 + var6, 16, field570);
        class89.method1753(arg0, arg1 + 17 + var6, 16, field570);
        class89.method1748(arg0 + 15, arg1 + 16 + var6, var5, field609);
        class89.method1748(arg0 + 14, arg1 + 17 + var6, var5 - 1, field609);
        class89.method1753(arg0, arg1 + 15 + var6 + var5, 16, field609);
        class89.method1753(arg0 + 1, arg1 + 14 + var6 + var5, 15, field609);
    }

    @ObfuscatedName("eh.cf(II)Ljava/lang/String;")
    public static final String method2815(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("do.cr(Lfz;S)Z")
    public static final boolean method2130(class159 arg0) {
        if (arg0.field2708 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2708.length; var1++) {
            int var2 = method2859(arg0, var1);
            int var3 = arg0.field2725[var1];
            if (arg0.field2708[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2708[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2708[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ei.cy(Lfz;II)I")
    public static final int method2859(class159 arg0, int arg1) {
        if (arg0.field2633 == null || arg1 >= arg0.field2633.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2633[arg1];
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
                    var7 = field628[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field629[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field630[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method1507(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method11(var12).field1015 || field602)) {
                        for (int var13 = 0; var13 < var11.field2713.length; var13++) {
                            if (var12 + 1 == var11.field2713[var13]) {
                                var7 += var11.field2714[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2731[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2080[field629[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2731[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2555.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2083[var14]) {
                            var7 += field629[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method1507(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method11(var18).field1015 || field602)) {
                        for (int var19 = 0; var19 < var17.field2713.length; var19++) {
                            if (var18 + 1 == var17.field2713[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field656;
                }
                if (var6 == 12) {
                    var7 = field657;
                }
                if (var6 == 13) {
                    int var20 = class160.field2731[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method2195(var22);
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
                    var7 = (Statics.field2555.field468 >> 7) + Statics.field267;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2555.field435 >> 7) + Statics.field1246;
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

    @ObfuscatedName("b.cq([Lfz;IIIIIIII)V")
    public static final void method137(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2654 || var9.field2611 == 0 || var9.field2621 || method2111(var9) != 0 || field577 == var9) && var9.field2622 == arg1 && (!var9.field2654 || !method2114(var9))) {
                int var10 = var9.field2609 + arg6;
                int var11 = var9.field2707 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2611 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2611 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2620 + var10;
                    int var19 = var9.field2615 + var11;
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
                    int var22 = var9.field2620 + var10;
                    int var23 = var9.field2615 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field664 == var9) {
                    field670 = true;
                    field671 = var10;
                    field672 = var11;
                }
                if (!var9.field2654 || var12 < var14 && var13 < var15) {
                    int var24 = class77.field1397;
                    int var25 = class77.field1404;
                    if (class77.field1403 != 0) {
                        var24 = class77.field1410;
                        var25 = class77.field1413;
                    }
                    if (var9.field2642 == 1337) {
                        method852(var9);
                        if (!field502 && !field743 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field709 == 0 && !field647) {
                                method136(class135.field2261, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class112.field1926; var27++) {
                                int var28 = class112.field1931[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field550.method1816(Statics.field178, var29, var30, var28) >= 0) {
                                        class32 var33 = class32.method1446(var32);
                                        if (var33.field868 != null) {
                                            var33 = var33.method628();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field709 == 1) {
                                            method136(class135.field2256, field736 + " " + class2.field20 + " " + class2.method1311(65535) + var33.field837, 1, var28, var29, var30);
                                        } else if (!field647) {
                                            String[] var34 = var33.field854;
                                            if (field703) {
                                                var34 = method1275(var34);
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
                                                        method136(var34[var35], class2.method1311(65535) + var33.field837, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method136(class135.field2257, class2.method1311(65535) + var33.field837, 1002, var33.field834 << 14, var29, var30);
                                        } else if ((Statics.field185 & 0x4) == 4) {
                                            method136(field556, field650 + " " + class2.field20 + " " + class2.method1311(65535) + var33.field837, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class25 var37 = field529[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field406.field796 == 1 && (var37.field468 & 0x7F) == 64 && (var37.field435 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field530; var38++) {
                                                class25 var39 = field529[field531[var38]];
                                                if (var39 != null && var37 != var39 && var39.field406.field796 == 1 && var37.field468 == var39.field468 && var37.field435 == var39.field435) {
                                                    method144(var39.field406, field531[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field516; var40++) {
                                                class3 var41 = field610[field738[var40]];
                                                if (var41 != null && var37.field468 == var41.field468 && var37.field435 == var41.field435) {
                                                    method197(var41, field738[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method144(var37.field406, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field610[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field468 & 0x7F) == 64 && (var42.field435 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field530; var43++) {
                                                class25 var44 = field529[field531[var43]];
                                                if (var44 != null && var44.field406.field796 == 1 && var42.field468 == var44.field468 && var42.field435 == var44.field435) {
                                                    method144(var44.field406, field531[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field516; var45++) {
                                                class3 var46 = field610[field738[var45]];
                                                if (var46 != null && var42 != var46 && var42.field468 == var46.field468 && var42.field435 == var46.field435) {
                                                    method197(var46, field738[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method197(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class177 var47 = field624[Statics.field178][var29][var30];
                                        if (var47 != null) {
                                            for (class17 var48 = (class17) var47.method3178(); var48 != null; var48 = (class17) var47.method3166()) {
                                                class40 var49 = class40.method11(var48.field270);
                                                if (field709 == 1) {
                                                    method136(class135.field2256, field736 + " " + class2.field20 + " " + class2.method1311(16748608) + var49.field1030, 16, var48.field270, var29, var30);
                                                } else if (!field647) {
                                                    String[] var50 = var49.field1016;
                                                    if (field703) {
                                                        var50 = method1275(var50);
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
                                                            method136(var50[var51], class2.method1311(16748608) + var49.field1030, var52, var48.field270, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method136(class135.field2116, class2.method1311(16748608) + var49.field1030, 20, var48.field270, var29, var30);
                                                        }
                                                    }
                                                    method136(class135.field2257, class2.method1311(16748608) + var49.field1030, 1004, var48.field270, var29, var30);
                                                } else if ((Statics.field185 & 0x1) == 1) {
                                                    method136(field556, field650 + " " + class2.field20 + " " + class2.method1311(16748608) + var49.field1030, 17, var48.field270, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2642 != 1338) {
                        if (!field743 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var64 = var24 - var10;
                            int var65 = var25 - var11;
                            if (var9.field2677 == 1) {
                                method136(var9.field2616, "", 24, 0, 0, var9.field2719);
                            }
                            if (var9.field2677 == 2 && !field647) {
                                int var66 = method2111(var9);
                                int var67 = var66 >> 11 & 0x3F;
                                String var68;
                                if (var67 == 0) {
                                    var68 = null;
                                } else if (var9.field2617 == null || var9.field2617.trim().length() == 0) {
                                    var68 = null;
                                } else {
                                    var68 = var9.field2617;
                                }
                                if (var68 != null) {
                                    method136(var68, class2.method1311(65280) + var9.field2711, 25, 0, -1, var9.field2719);
                                }
                            }
                            if (var9.field2677 == 3) {
                                method136(class135.field2265, "", 26, 0, 0, var9.field2719);
                            }
                            if (var9.field2677 == 4) {
                                method136(var9.field2616, "", 28, 0, 0, var9.field2719);
                            }
                            if (var9.field2677 == 5) {
                                method136(var9.field2616, "", 29, 0, 0, var9.field2719);
                            }
                            if (var9.field2677 == 6 && field568 == null) {
                                method136(var9.field2616, "", 30, 0, -1, var9.field2719);
                            }
                            if (var9.field2611 == 2) {
                                int var70 = 0;
                                for (int var71 = 0; var71 < var9.field2615; var71++) {
                                    for (int var72 = 0; var72 < var9.field2620; var72++) {
                                        int var73 = (var9.field2664 + 32) * var72;
                                        int var74 = (var9.field2665 + 32) * var71;
                                        if (var70 < 20) {
                                            var73 += var9.field2701[var70];
                                            var74 += var9.field2686[var70];
                                        }
                                        if (var64 >= var73 && var65 >= var74 && var64 < var73 + 32 && var65 < var74 + 32) {
                                            field606 = var70;
                                            Statics.field1989 = var9;
                                            if (var9.field2713[var70] > 0) {
                                                class40 var75 = class40.method11(var9.field2713[var70] - 1);
                                                if (field709 == 1 && class163.method2844(method2111(var9))) {
                                                    if (Statics.field1378 != var9.field2719 || Statics.field397 != var70) {
                                                        method136(class135.field2256, field736 + " " + class2.field20 + " " + class2.method1311(16748608) + var75.field1030, 31, var75.field1008, var70, var9.field2719);
                                                    }
                                                } else if (!field647 || !class163.method2844(method2111(var9))) {
                                                    String[] var76 = var75.field1041;
                                                    if (field703) {
                                                        var76 = method1275(var76);
                                                    }
                                                    if (class163.method2844(method2111(var9))) {
                                                        for (int var77 = 4; var77 >= 3; var77--) {
                                                            if (var76 != null && var76[var77] != null) {
                                                                byte var78;
                                                                if (var77 == 3) {
                                                                    var78 = 36;
                                                                } else {
                                                                    var78 = 37;
                                                                }
                                                                method136(var76[var77], class2.method1311(16748608) + var75.field1030, var78, var75.field1008, var70, var9.field2719);
                                                            } else if (var77 == 4) {
                                                                method136(class135.field2117, class2.method1311(16748608) + var75.field1030, 37, var75.field1008, var70, var9.field2719);
                                                            }
                                                        }
                                                    }
                                                    int var79 = method2111(var9);
                                                    boolean var80 = (var79 >> 31 & 0x1) != 0;
                                                    if (var80) {
                                                        method136(class135.field2256, class2.method1311(16748608) + var75.field1030, 38, var75.field1008, var70, var9.field2719);
                                                    }
                                                    class163 var10000 = (class163) null;
                                                    if (class163.method2844(method2111(var9)) && var76 != null) {
                                                        for (int var81 = 2; var81 >= 0; var81--) {
                                                            if (var76[var81] != null) {
                                                                byte var82 = 0;
                                                                if (var81 == 0) {
                                                                    var82 = 33;
                                                                }
                                                                if (var81 == 1) {
                                                                    var82 = 34;
                                                                }
                                                                if (var81 == 2) {
                                                                    var82 = 35;
                                                                }
                                                                method136(var76[var81], class2.method1311(16748608) + var75.field1030, var82, var75.field1008, var70, var9.field2719);
                                                            }
                                                        }
                                                    }
                                                    String[] var83 = var9.field2694;
                                                    if (field703) {
                                                        var83 = method1275(var83);
                                                    }
                                                    if (var83 != null) {
                                                        for (int var84 = 4; var84 >= 0; var84--) {
                                                            if (var83[var84] != null) {
                                                                byte var85 = 0;
                                                                if (var84 == 0) {
                                                                    var85 = 39;
                                                                }
                                                                if (var84 == 1) {
                                                                    var85 = 40;
                                                                }
                                                                if (var84 == 2) {
                                                                    var85 = 41;
                                                                }
                                                                if (var84 == 3) {
                                                                    var85 = 42;
                                                                }
                                                                if (var84 == 4) {
                                                                    var85 = 43;
                                                                }
                                                                method136(var83[var84], class2.method1311(16748608) + var75.field1030, var85, var75.field1008, var70, var9.field2719);
                                                            }
                                                        }
                                                    }
                                                    method136(class135.field2257, class2.method1311(16748608) + var75.field1030, 1005, var75.field1008, var70, var9.field2719);
                                                } else if ((Statics.field185 & 0x10) == 16) {
                                                    method136(field556, field650 + " " + class2.field20 + " " + class2.method1311(16748608) + var75.field1030, 32, var75.field1008, var70, var9.field2719);
                                                }
                                            }
                                        }
                                        var70++;
                                    }
                                }
                            }
                            if (var9.field2654) {
                                if (field647) {
                                    int var86 = method2111(var9);
                                    boolean var87 = (var86 >> 21 & 0x1) != 0;
                                    if (var87 && (Statics.field185 & 0x20) == 32) {
                                        method136(field556, field650 + " " + class2.field20 + " " + var9.field2671, 58, 0, var9.field2612, var9.field2719);
                                    }
                                } else {
                                    int var88 = 9;
                                    while (true) {
                                        if (var88 < 5) {
                                            int var91 = method2111(var9);
                                            int var92 = var91 >> 11 & 0x3F;
                                            String var93;
                                            if (var92 == 0) {
                                                var93 = null;
                                            } else if (var9.field2617 == null || var9.field2617.trim().length() == 0) {
                                                var93 = null;
                                            } else {
                                                var93 = var9.field2617;
                                            }
                                            if (var93 != null) {
                                                method136(var93, var9.field2671, 25, 0, var9.field2612, var9.field2719);
                                            }
                                            for (int var95 = 4; var95 >= 0; var95--) {
                                                String var96;
                                                if (!class163.method2116(method2111(var9), var95) && var9.field2698 == null) {
                                                    var96 = null;
                                                } else if (var9.field2672 == null || var9.field2672.length <= var95 || var9.field2672[var95] == null || var9.field2672[var95].trim().length() == 0) {
                                                    var96 = null;
                                                } else {
                                                    var96 = var9.field2672[var95];
                                                }
                                                if (var96 != null) {
                                                    method136(var96, var9.field2671, 57, var95 + 1, var9.field2612, var9.field2719);
                                                }
                                            }
                                            int var98 = method2111(var9);
                                            boolean var99 = (var98 & 0x1) != 0;
                                            if (var99) {
                                                method136(class135.field2254, "", 30, 0, var9.field2612, var9.field2719);
                                            }
                                            break;
                                        }
                                        String var89;
                                        if (!class163.method2116(method2111(var9), var88) && var9.field2698 == null) {
                                            var89 = null;
                                        } else if (var9.field2672 == null || var9.field2672.length <= var88 || var9.field2672[var88] == null || var9.field2672[var88].trim().length() == 0) {
                                            var89 = null;
                                        } else {
                                            var89 = var9.field2672[var88];
                                        }
                                        if (var89 != null) {
                                            method136(var89, var9.field2671, 1007, var88 + 1, var9.field2612, var9.field2719);
                                        }
                                        var88--;
                                    }
                                }
                            }
                        }
                        if (var9.field2611 == 0) {
                            if (!var9.field2654 && method2114(var9) && Statics.field256 != var9) {
                                continue;
                            }
                            method137(arg0, var9.field2719, var12, var13, var14, var15, var10 - var9.field2624, var11 - var9.field2683);
                            if (var9.field2705 != null) {
                                method137(var9.field2705, var9.field2719, var12, var13, var14, var15, var10 - var9.field2624, var11 - var9.field2683);
                            }
                            class4 var100 = (class4) field652.method3138((long) var9.field2719);
                            if (var100 != null) {
                                if (var100.field52 == 0 && class77.field1397 >= var12 && class77.field1404 >= var13 && class77.field1397 < var14 && class77.field1404 < var15 && !field743 && !field509) {
                                    field639[0] = class135.field2339;
                                    field640[0] = "";
                                    field564[0] = 1006;
                                    field676 = 1;
                                }
                                int var101 = var100.field58;
                                if (class159.method227(var101)) {
                                    method137(Statics.field2666[var101], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2654) {
                            if (var9.field2728 && class77.field1397 >= var12 && class77.field1404 >= var13 && class77.field1397 < var14 && class77.field1404 < var15) {
                                for (class1 var102 = (class1) field689.method3163(); var102 != null; var102 = (class1) field689.method3165()) {
                                    if (var102.field2) {
                                        var102.method3196();
                                        var102.field3.field2613 = false;
                                    }
                                }
                                if (Statics.field974 == 0) {
                                    field664 = null;
                                    field577 = null;
                                }
                                if (!field743) {
                                    field639[0] = class135.field2339;
                                    field640[0] = "";
                                    field564[0] = 1006;
                                    field676 = 1;
                                }
                            }
                            boolean var103;
                            if (class77.field1397 >= var12 && class77.field1404 >= var13 && class77.field1397 < var14 && class77.field1404 < var15) {
                                var103 = true;
                            } else {
                                var103 = false;
                            }
                            boolean var104 = false;
                            if ((class77.field1409 == 1 || !Statics.field1273 && class77.field1409 == 4) && var103) {
                                var104 = true;
                            }
                            boolean var105 = false;
                            if ((class77.field1403 == 1 || !Statics.field1273 && class77.field1403 == 4) && class77.field1410 >= var12 && class77.field1413 >= var13 && class77.field1410 < var14 && class77.field1413 < var15) {
                                var105 = true;
                            }
                            if (var105) {
                                method245(var9, class77.field1410 - var10, class77.field1413 - var11);
                            }
                            if (field664 != null && field664 != var9 && var103) {
                                int var106 = method2111(var9);
                                boolean var107 = (var106 >> 20 & 0x1) != 0;
                                if (var107) {
                                    field666 = var9;
                                }
                            }
                            if (field577 == var9) {
                                field755 = true;
                                field754 = var10;
                                field642 = var11;
                            }
                            if (var9.field2621) {
                                if (var103 && field692 != 0 && var9.field2699 != null) {
                                    class1 var108 = new class1();
                                    var108.field2 = true;
                                    var108.field3 = var9;
                                    var108.field1 = field692;
                                    var108.field11 = var9.field2699;
                                    field689.method3158(var108);
                                }
                                if (field664 != null || Statics.field878 != null || field743) {
                                    var105 = false;
                                    var104 = false;
                                    var103 = false;
                                }
                                if (!var9.field2648 && var105) {
                                    var9.field2648 = true;
                                    if (var9.field2628 != null) {
                                        class1 var109 = new class1();
                                        var109.field2 = true;
                                        var109.field3 = var9;
                                        var109.field4 = class77.field1410 - var10;
                                        var109.field1 = class77.field1413 - var11;
                                        var109.field11 = var9.field2628;
                                        field689.method3158(var109);
                                    }
                                }
                                if (var9.field2648 && var104 && var9.field2608 != null) {
                                    class1 var110 = new class1();
                                    var110.field2 = true;
                                    var110.field3 = var9;
                                    var110.field4 = class77.field1397 - var10;
                                    var110.field1 = class77.field1404 - var11;
                                    var110.field11 = var9.field2608;
                                    field689.method3158(var110);
                                }
                                if (var9.field2648 && !var104) {
                                    var9.field2648 = false;
                                    if (var9.field2682 != null) {
                                        class1 var111 = new class1();
                                        var111.field2 = true;
                                        var111.field3 = var9;
                                        var111.field4 = class77.field1397 - var10;
                                        var111.field1 = class77.field1404 - var11;
                                        var111.field11 = var9.field2682;
                                        field691.method3158(var111);
                                    }
                                }
                                if (var104 && var9.field2709 != null) {
                                    class1 var112 = new class1();
                                    var112.field2 = true;
                                    var112.field3 = var9;
                                    var112.field4 = class77.field1397 - var10;
                                    var112.field1 = class77.field1404 - var11;
                                    var112.field11 = var9.field2709;
                                    field689.method3158(var112);
                                }
                                if (!var9.field2613 && var103) {
                                    var9.field2613 = true;
                                    if (var9.field2684 != null) {
                                        class1 var113 = new class1();
                                        var113.field2 = true;
                                        var113.field3 = var9;
                                        var113.field4 = class77.field1397 - var10;
                                        var113.field1 = class77.field1404 - var11;
                                        var113.field11 = var9.field2684;
                                        field689.method3158(var113);
                                    }
                                }
                                if (var9.field2613 && var103 && var9.field2685 != null) {
                                    class1 var114 = new class1();
                                    var114.field2 = true;
                                    var114.field3 = var9;
                                    var114.field4 = class77.field1397 - var10;
                                    var114.field1 = class77.field1404 - var11;
                                    var114.field11 = var9.field2685;
                                    field689.method3158(var114);
                                }
                                if (var9.field2613 && !var103) {
                                    var9.field2613 = false;
                                    if (var9.field2676 != null) {
                                        class1 var115 = new class1();
                                        var115.field2 = true;
                                        var115.field3 = var9;
                                        var115.field4 = class77.field1397 - var10;
                                        var115.field1 = class77.field1404 - var11;
                                        var115.field11 = var9.field2676;
                                        field691.method3158(var115);
                                    }
                                }
                                if (var9.field2697 != null) {
                                    class1 var116 = new class1();
                                    var116.field3 = var9;
                                    var116.field11 = var9.field2697;
                                    field690.method3158(var116);
                                }
                                if (var9.field2691 != null && field677 > var9.field2723) {
                                    if (var9.field2692 == null || field677 - var9.field2723 > 32) {
                                        class1 var121 = new class1();
                                        var121.field3 = var9;
                                        var121.field11 = var9.field2691;
                                        field689.method3158(var121);
                                    } else {
                                        label825: for (int var117 = var9.field2723; var117 < field677; var117++) {
                                            int var118 = field612[var117 & 0x1F];
                                            for (int var119 = 0; var119 < var9.field2692.length; var119++) {
                                                if (var9.field2692[var119] == var118) {
                                                    class1 var120 = new class1();
                                                    var120.field3 = var9;
                                                    var120.field11 = var9.field2691;
                                                    field689.method3158(var120);
                                                    break label825;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2723 = field677;
                                }
                                if (var9.field2693 != null && field684 > var9.field2724) {
                                    if (var9.field2660 == null || field684 - var9.field2724 > 32) {
                                        class1 var126 = new class1();
                                        var126.field3 = var9;
                                        var126.field11 = var9.field2693;
                                        field689.method3158(var126);
                                    } else {
                                        label805: for (int var122 = var9.field2724; var122 < field684; var122++) {
                                            int var123 = field749[var122 & 0x1F];
                                            for (int var124 = 0; var124 < var9.field2660.length; var124++) {
                                                if (var9.field2660[var124] == var123) {
                                                    class1 var125 = new class1();
                                                    var125.field3 = var9;
                                                    var125.field11 = var9.field2693;
                                                    field689.method3158(var125);
                                                    break label805;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2724 = field684;
                                }
                                if (var9.field2695 != null && field637 > var9.field2614) {
                                    if (var9.field2712 == null || field637 - var9.field2614 > 32) {
                                        class1 var131 = new class1();
                                        var131.field3 = var9;
                                        var131.field11 = var9.field2695;
                                        field689.method3158(var131);
                                    } else {
                                        label785: for (int var127 = var9.field2614; var127 < field637; var127++) {
                                            int var128 = field680[var127 & 0x1F];
                                            for (int var129 = 0; var129 < var9.field2712.length; var129++) {
                                                if (var9.field2712[var129] == var128) {
                                                    class1 var130 = new class1();
                                                    var130.field3 = var9;
                                                    var130.field11 = var9.field2695;
                                                    field689.method3158(var130);
                                                    break label785;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2614 = field637;
                                }
                                if (field682 > var9.field2722 && var9.field2700 != null) {
                                    class1 var132 = new class1();
                                    var132.field3 = var9;
                                    var132.field11 = var9.field2700;
                                    field689.method3158(var132);
                                }
                                if (field683 > var9.field2722 && var9.field2623 != null) {
                                    class1 var133 = new class1();
                                    var133.field3 = var9;
                                    var133.field11 = var9.field2623;
                                    field689.method3158(var133);
                                }
                                if (field700 > var9.field2722 && var9.field2652 != null) {
                                    class1 var134 = new class1();
                                    var134.field3 = var9;
                                    var134.field11 = var9.field2652;
                                    field689.method3158(var134);
                                }
                                if (field685 > var9.field2722 && var9.field2704 != null) {
                                    class1 var135 = new class1();
                                    var135.field3 = var9;
                                    var135.field11 = var9.field2704;
                                    field689.method3158(var135);
                                }
                                var9.field2722 = field675;
                                if (var9.field2667 != null) {
                                    for (int var136 = 0; var136 < field497; var136++) {
                                        class1 var137 = new class1();
                                        var137.field3 = var9;
                                        var137.field8 = field715[var136];
                                        var137.field5 = field589[var136];
                                        var137.field11 = var9.field2667;
                                        field689.method3158(var137);
                                    }
                                }
                            }
                        }
                        if (!var9.field2654) {
                            if (field664 != null || Statics.field878 != null || field743) {
                                return;
                            }
                            if ((var9.field2710 >= 0 || var9.field2630 != 0) && class77.field1397 >= var12 && class77.field1404 >= var13 && class77.field1397 < var14 && class77.field1404 < var15) {
                                if (var9.field2710 >= 0) {
                                    Statics.field256 = arg0[var9.field2710];
                                } else {
                                    Statics.field256 = var9;
                                }
                            }
                            if (var9.field2611 == 8 && class77.field1397 >= var12 && class77.field1404 >= var13 && class77.field1397 < var14 && class77.field1404 < var15) {
                                Statics.field980 = var9;
                            }
                            if (var9.field2627 > var9.field2615) {
                                method55(var9, var9.field2620 + var10, var11, var9.field2615, var9.field2627, class77.field1397, class77.field1404);
                            }
                        }
                    } else if ((field726 == 0 || field726 == 3) && (class77.field1403 == 1 || !Statics.field1273 && class77.field1403 == 4)) {
                        int var53 = class77.field1410 - 25 - var10;
                        int var54 = class77.field1413 - 5 - var11;
                        if (var53 >= 0 && var54 >= 0 && var53 < 146 && var54 < 151 && (var53 < 0 || var53 > 23 || var54 < 117 || var54 > 142)) {
                            var53 -= 73;
                            var54 -= 75;
                            int var55 = field575 + field562 & 0x7FF;
                            int var56 = class104.field1776[var55];
                            int var57 = class104.field1789[var55];
                            int var58 = (field491 + 256) * var56 >> 8;
                            int var59 = (field491 + 256) * var57 >> 8;
                            int var60 = var53 * var59 + var54 * var58 >> 11;
                            int var61 = var54 * var59 - var53 * var58 >> 11;
                            int var62 = Statics.field2555.field468 + var60 >> 7;
                            int var63 = Statics.field2555.field435 - var61 >> 7;
                            field504.method2218(96);
                            field504.method2333(18);
                            field504.method2372(class75.field1370[82] ? (class75.field1370[81] ? 2 : 1) : 0);
                            field504.method2330(Statics.field267 + var62);
                            field504.method2348(Statics.field1246 + var63);
                            field504.method2333(var53);
                            field504.method2333(var54);
                            field504.method2306(field575);
                            field504.method2333(57);
                            field504.method2333(field562);
                            field504.method2333(field491);
                            field504.method2333(89);
                            field504.method2306(Statics.field2555.field468);
                            field504.method2306(Statics.field2555.field435);
                            field504.method2333(63);
                            field665 = var62;
                            field725 = var63;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.cj([Lfz;IB)V")
    public static final void method156(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2611 == 0) {
                    if (var3.field2705 != null) {
                        method156(var3.field2705, arg1);
                    }
                    class4 var4 = (class4) field652.method3138((long) var3.field2719);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class159.method227(var5)) {
                            method156(Statics.field2666[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2720 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field11 = var3.field2720;
                    class26.method196(var6);
                }
                if (arg1 == 1 && var3.field2706 != null) {
                    if (var3.field2612 >= 0) {
                        class159 var7 = class159.method1507(var3.field2719);
                        if (var7 == null || var7.field2705 == null || var3.field2612 >= var7.field2705.length || var7.field2705[var3.field2612] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field11 = var3.field2706;
                    class26.method196(var8);
                }
            }
        }
    }

    @ObfuscatedName("ap.cd(Lfz;IIB)V")
    public static final void method245(class159 arg0, int arg1, int arg2) {
        if (field664 != null || field743 || arg0 == null) {
            return;
        }
        class159 var3 = arg0;
        int var4 = class163.method39(method2111(arg0));
        class159 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class159.method1507(var3.field2622);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class159 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2673;
        }
        if (var7 == null) {
            return;
        }
        field664 = arg0;
        class159 var9 = arg0;
        int var10 = class163.method39(method2111(arg0));
        class159 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class159.method1507(var9.field2622);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class159 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2673;
        }
        field577 = var13;
        field648 = arg1;
        field663 = arg2;
        Statics.field974 = 0;
        field673 = false;
        return;
    }

    @ObfuscatedName("aq.cw(Lfz;B)V")
    public static void method852(class159 arg0) {
        if (field694 == arg0.field2727) {
            field695[arg0.field2639] = true;
        }
    }

    @ObfuscatedName("df.ch(I)V")
    public static void method2300() {
        for (class4 var0 = (class4) field652.method3155(); var0 != null; var0 = (class4) field652.method3139()) {
            int var1 = var0.field58;
            if (class159.method227(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field2666[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2654;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2824;
                    class159 var6 = class159.method1507(var5);
                    if (var6 != null) {
                        method852(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.ci([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method1275(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("i.cx(II)V")
    public static final void method223(int arg0) {
        if (!class159.method227(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2666[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3 != null) {
                var3.field2717 = 0;
                var3.field2718 = 0;
            }
        }
    }

    @ObfuscatedName("eg.ct([Lfz;II)V")
    public static final void method2869(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2622 == arg1 && (!var3.field2654 || !method2114(var3))) {
                if (var3.field2611 == 0) {
                    if (!var3.field2654 && method2114(var3) && Statics.field256 != var3) {
                        continue;
                    }
                    method2869(arg0, var3.field2719);
                    if (var3.field2705 != null) {
                        method2869(var3.field2705, var3.field2719);
                    }
                    class4 var4 = (class4) field652.method3138((long) var3.field2719);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class159.method227(var5)) {
                            method2869(Statics.field2666[var5], -1);
                        }
                    }
                }
                if (var3.field2611 == 6) {
                    if (var3.field2647 != -1 || var3.field2602 != -1) {
                        boolean var6 = method2130(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2602;
                        } else {
                            var7 = var3.field2647;
                        }
                        if (var7 != -1) {
                            class34 var8 = Statics.method1425(var7);
                            var3.field2718 += field567;
                            while (var3.field2718 > var8.field906[var3.field2717]) {
                                var3.field2718 -= var8.field906[var3.field2717];
                                var3.field2717++;
                                if (var3.field2717 >= var8.field899.length) {
                                    var3.field2717 -= var8.field908;
                                    if (var3.field2717 < 0 || var3.field2717 >= var8.field899.length) {
                                        var3.field2717 = 0;
                                    }
                                }
                                method852(var3);
                            }
                        }
                    }
                    if (var3.field2681 != 0 && !var3.field2654) {
                        int var9 = var3.field2681 >> 16;
                        int var10 = var3.field2681 << 16 >> 16;
                        int var11 = field567 * var9;
                        int var12 = field567 * var10;
                        var3.field2651 = var3.field2651 + var11 & 0x7FF;
                        var3.field2606 = var3.field2606 + var12 & 0x7FF;
                        method852(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.cm(II)V")
    public static final void method549(int arg0) {
        method2300();
        for (class7 var1 = (class7) class7.field103.method3163(); var1 != null; var1 = (class7) class7.field103.method3165()) {
            if (var1.field109 != null) {
                var1.method40();
            }
        }
        int var2 = class42.method2637(arg0).field1056;
        if (var2 == 0) {
            return;
        }
        int var3 = class160.field2731[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2037(0.9D);
                ((class110) Statics.field1780).method2122(0.9D);
            }
            if (var3 == 2) {
                class104.method2037(0.8D);
                ((class110) Statics.field1780).method2122(0.8D);
            }
            if (var3 == 3) {
                class104.method2037(0.7D);
                ((class110) Statics.field1780).method2122(0.7D);
            }
            if (var3 == 4) {
                class104.method2037(0.6D);
                ((class110) Statics.field1780).method2122(0.6D);
            }
            class40.method727();
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
            if (field626 != var4) {
                if (field626 == 0 && field728 != -1) {
                    class139.method1505(Statics.field951, field728, 0, var4, false);
                    field729 = false;
                } else if (var4 == 0) {
                    Statics.field409.method2686();
                    class139.field2378 = 1;
                    Statics.field2599 = null;
                    field729 = false;
                } else if (class139.field2378 == 0) {
                    Statics.field409.method2736(var4);
                } else {
                    Statics.field2842 = var4;
                }
                field626 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field730 = 127;
            }
            if (var3 == 1) {
                field730 = 96;
            }
            if (var3 == 2) {
                field730 = 64;
            }
            if (var3 == 3) {
                field730 = 32;
            }
            if (var3 == 4) {
                field730 = 0;
            }
        }
        if (var2 == 5) {
            field631 = var3;
        }
        if (var2 == 6) {
            field653 = var3;
        }
        if (var2 == 9) {
            field654 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field731 = 127;
        }
        if (var3 == 1) {
            field731 = 96;
        }
        if (var3 == 2) {
            field731 = 64;
        }
        if (var3 == 3) {
            field731 = 32;
        }
        if (var3 == 4) {
            field731 = 0;
        }
    }

    @ObfuscatedName("i.cc(Lfz;I)V")
    public static final void method221(class159 arg0) {
        int var1 = arg0.field2642;
        if (var1 == 324) {
            if (field604 == -1) {
                field604 = arg0.field2668;
                field679 = arg0.field2636;
            }
            if (field750.field2753) {
                arg0.field2668 = field604;
            } else {
                arg0.field2668 = field679;
            }
        } else if (var1 == 325) {
            if (field604 == -1) {
                field604 = arg0.field2668;
                field679 = arg0.field2636;
            }
            if (field750.field2753) {
                arg0.field2668 = field679;
            } else {
                arg0.field2668 = field604;
            }
        } else if (var1 == 327) {
            arg0.field2651 = 150;
            arg0.field2606 = (int) (Math.sin((double) field503 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2643 = 5;
            arg0.field2644 = 0;
        } else if (var1 == 328) {
            arg0.field2651 = 150;
            arg0.field2606 = (int) (Math.sin((double) field503 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2643 = 5;
            arg0.field2644 = 1;
        }
    }

    @ObfuscatedName("be.cn(IIIB)Lv;")
    public static final class4 method1178(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field58 = arg1;
        var3.field52 = arg2;
        field652.method3136(var3, (long) arg0);
        method223(arg1);
        class26.method141(arg1);
        class159 var4 = class159.method1507(arg0);
        if (var4 != null) {
            method852(var4);
        }
        if (field568 != null) {
            method852(field568);
            field568 = null;
        }
        Statics.method1421();
        if (field727 != -1) {
            int var5 = field727;
            if (class159.method227(var5)) {
                method156(Statics.field2666[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("x.ck(Lv;ZI)V")
    public static final void method37(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field2824;
        arg0.method3196();
        if (arg1) {
            class159.method2852(var2);
        }
        for (class171 var4 = (class171) field495.method3155(); var4 != null; var4 = (class171) field495.method3139()) {
            if ((long) var2 == (var4.field2824 >> 48 & 0xFFFFL)) {
                var4.method3196();
            }
        }
        class159 var5 = class159.method1507(var3);
        if (var5 != null) {
            method852(var5);
        }
        Statics.method1421();
        if (field727 != -1) {
            int var6 = field727;
            if (class159.method227(var6)) {
                method156(Statics.field2666[var6], 1);
            }
        }
    }

    @ObfuscatedName("ap.ca(Lfz;I)Z")
    public static final boolean method242(class159 arg0) {
        int var1 = arg0.field2642;
        if (var1 == 205) {
            field518 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field750.method3060(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field750.method3074(var4, var5 == 1);
        }
        if (var1 == 324) {
            field750.method3064(false);
        }
        if (var1 == 325) {
            field750.method3064(true);
        }
        if (var1 == 326) {
            field504.method2218(7);
            field750.method3065(field504);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dc.cl(IIII)V")
    public static final void method2196(int arg0, int arg1, int arg2) {
        method655();
        class89.method1705(arg0, arg1, Statics.field64.field1503 + arg0, Statics.field64.field1504 + arg1);
        if (field726 == 2 || field726 == 5) {
            class89.method1720(arg0 + 25, arg1 + 5, 0, Statics.field110, Statics.field149);
        } else {
            int var3 = field575 + field562 & 0x7FF;
            int var4 = Statics.field2555.field468 / 32 + 48;
            int var5 = 464 - Statics.field2555.field435 / 32;
            Statics.field210.method1612(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field491 + 256, Statics.field110, Statics.field149);
            for (int var6 = 0; var6 < field613; var6++) {
                int var7 = field721[var6] * 4 + 2 - Statics.field2555.field468 / 32;
                int var8 = field722[var6] * 4 + 2 - Statics.field2555.field435 / 32;
                Statics.method2594(arg0, arg1, var7, var8, field751[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field624[Statics.field178][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field2555.field468 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field2555.field435 / 32;
                        Statics.method2594(arg0, arg1, var12, var13, Statics.field1414[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field530; var14++) {
                class25 var15 = field529[field531[var14]];
                if (var15 != null && var15.method14()) {
                    class31 var16 = var15.field406;
                    if (var16 != null && var16.field824 != null) {
                        var16 = var16.method583();
                    }
                    if (var16 != null && var16.field811 && var16.field823) {
                        int var17 = var15.field468 / 32 - Statics.field2555.field468 / 32;
                        int var18 = var15.field435 / 32 - Statics.field2555.field435 / 32;
                        Statics.method2594(arg0, arg1, var17, var18, Statics.field1414[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field516; var19++) {
                class3 var20 = field610[field738[var19]];
                if (var20 != null && var20.method14()) {
                    int var21 = var20.field468 / 32 - Statics.field2555.field468 / 32;
                    int var22 = var20.field435 / 32 - Statics.field2555.field435 / 32;
                    boolean var23 = false;
                    if (method1(var20.field50)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field15; var25++) {
                        if (var20.field50.equals(Statics.field962[var25].field120)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field2555.field48 != 0 && var20.field48 != 0 && Statics.field2555.field48 == var20.field48) {
                        var26 = true;
                    }
                    if (var23) {
                        Statics.method2594(arg0, arg1, var21, var22, Statics.field1414[3]);
                    } else if (var26) {
                        Statics.method2594(arg0, arg1, var21, var22, Statics.field1414[4]);
                    } else if (var24) {
                        Statics.method2594(arg0, arg1, var21, var22, Statics.field1414[5]);
                    } else {
                        Statics.method2594(arg0, arg1, var21, var22, Statics.field1414[2]);
                    }
                }
            }
            if (field633 != 0 && field503 % 20 < 10) {
                if (field633 == 1 && field512 >= 0 && field512 < field529.length) {
                    class25 var27 = field529[field512];
                    if (var27 != null) {
                        int var28 = var27.field468 / 32 - Statics.field2555.field468 / 32;
                        int var29 = var27.field435 / 32 - Statics.field2555.field435 / 32;
                        method139(arg0, arg1, var28, var29, Statics.field34[1]);
                    }
                }
                if (field633 == 2) {
                    int var30 = field514 * 4 - Statics.field267 * 4 + 2 - Statics.field2555.field468 / 32;
                    int var31 = field611 * 4 - Statics.field1246 * 4 + 2 - Statics.field2555.field435 / 32;
                    method139(arg0, arg1, var30, var31, Statics.field34[1]);
                }
                if (field633 == 10 && field513 >= 0 && field513 < field610.length) {
                    class3 var32 = field610[field513];
                    if (var32 != null) {
                        int var33 = var32.field468 / 32 - Statics.field2555.field468 / 32;
                        int var34 = var32.field435 / 32 - Statics.field2555.field435 / 32;
                        method139(arg0, arg1, var33, var34, Statics.field34[1]);
                    }
                }
            }
            if (field665 != 0) {
                int var35 = field665 * 4 + 2 - Statics.field2555.field468 / 32;
                int var36 = field725 * 4 + 2 - Statics.field2555.field435 / 32;
                Statics.method2594(arg0, arg1, var35, var36, Statics.field34[0]);
            }
            class89.method1711(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field726 < 3) {
            Statics.field217.method1612(arg0, arg1, 33, 33, 25, 25, field575, 256, Statics.field1793, Statics.field1130);
        } else {
            class89.method1720(arg0, arg1, 0, Statics.field1793, Statics.field1130);
        }
        if (field697[arg2]) {
            Statics.field64.method1693(arg0, arg1);
        }
        field696[arg2] = true;
    }

    @ObfuscatedName("b.cs(IIIILcd;B)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method2594(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field575 + field562 & 0x7FF;
        int var7 = class104.field1776[var6];
        int var8 = class104.field1789[var6];
        int var9 = var7 * 256 / (field491 + 256);
        int var10 = var8 * 256 / (field491 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field874.method1614(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("t.cv(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method105(int arg0, String arg1, String arg2) {
        method90(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("a.cz(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method90(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field655[var4] = field655[var4 - 1];
            field704[var4] = field704[var4 - 1];
            field706[var4] = field706[var4 - 1];
            field705[var4] = field705[var4 - 1];
        }
        field655[0] = arg0;
        field704[0] = arg1;
        field706[0] = arg2;
        field705[0] = arg3;
        field707++;
        field682 = field675;
    }

    @ObfuscatedName("c.cu(Ljava/lang/String;I)Z")
    public static boolean method1(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method2225(arg0, Statics.field427);
        for (int var2 = 0; var2 < field744; var2++) {
            if (var1.equalsIgnoreCase(class149.method2225(field746[var2].field383, Statics.field427))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method2225(Statics.field2555.field50, Statics.field427))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.cp(Ljava/lang/String;B)Z")
    public static boolean method605(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method2225(arg0, Statics.field427);
        for (int var2 = 0; var2 < field524; var2++) {
            class11 var3 = field681[var2];
            if (var1.equalsIgnoreCase(class149.method2225(var3.field187, Statics.field427))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method2225(var3.field189, Statics.field427))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bh.cg(Ljava/lang/String;ZI)V")
    public static final void method1475(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field524 < 100 || field617 == 1) || field524 >= 400) {
            method105(0, "", class135.field2274);
            return;
        }
        String var2 = class149.method2225(arg0, Statics.field427);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field524; var3++) {
            class11 var4 = field681[var3];
            String var5 = class149.method2225(var4.field187, Statics.field427);
            if (var5 != null && var5.equals(var2)) {
                method105(0, "", arg0 + class135.field2158);
                return;
            }
            if (var4.field189 != null) {
                String var6 = class149.method2225(var4.field189, Statics.field427);
                if (var6 != null && var6.equals(var2)) {
                    method105(0, "", arg0 + class135.field2158);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field744; var7++) {
            class23 var8 = field746[var7];
            String var9 = class149.method2225(var8.field383, Statics.field427);
            if (var9 != null && var9.equals(var2)) {
                method105(0, "", class135.field2155 + arg0 + class135.field2311);
                return;
            }
            if (var8.field374 != null) {
                String var10 = class149.method2225(var8.field374, Statics.field427);
                if (var10 != null && var10.equals(var2)) {
                    method105(0, "", class135.field2155 + arg0 + class135.field2311);
                    return;
                }
            }
        }
        if (class149.method2225(Statics.field2555.field50, Statics.field427).equals(var2)) {
            method105(0, "", class135.field2277);
        } else {
            field504.method2218(115);
            field504.method2333(class127.method210(arg0));
            field504.method2309(arg0);
        }
    }

    @ObfuscatedName("ak.du(Ljava/lang/String;I)V")
    public static final void method541(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method2225(arg0, Statics.field427);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field744; var2++) {
            class23 var3 = field746[var2];
            String var4 = var3.field383;
            String var5 = class149.method2225(var4, Statics.field427);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field744--;
                for (int var7 = var2; var7 < field744; var7++) {
                    field746[var7] = field746[var7 + 1];
                }
                field683 = field675;
                field504.method2218(8);
                field504.method2333(class127.method210(arg0));
                field504.method2309(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("en.dh(Ljava/lang/String;I)V")
    public static final void method2993(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method2225(arg0, Statics.field427);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field524; var2++) {
            class11 var3 = field681[var2];
            String var4 = var3.field187;
            String var5 = class149.method2225(var4, Statics.field427);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field524--;
                for (int var7 = var2; var7 < field524; var7++) {
                    field681[var7] = field681[var7 + 1];
                }
                field683 = field675;
                field504.method2218(25);
                field504.method2333(class127.method210(arg0));
                field504.method2309(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("by.dv(Ljava/lang/String;I)V")
    public static final void method1274(String arg0) {
        if (Statics.field962 != null) {
            field504.method2218(149);
            field504.method2333(class127.method210(arg0));
            field504.method2309(arg0);
        }
    }

    @ObfuscatedName("ag.dt(I)V")
    public static final void method606() {
        field504.method2218(206);
        field504.method2333(0);
    }

    @ObfuscatedName("dv.da(Lfz;I)I")
    public static int method2111(class159 arg0) {
        class171 var1 = (class171) field495.method3138(((long) arg0.field2719 << 32) + (long) arg0.field2612);
        return var1 == null ? arg0.field2670 : var1.field2808;
    }

    @ObfuscatedName("ew.do(Lfz;I)Lfz;")
    public static class159 method2755(class159 arg0) {
        int var1 = class163.method39(method2111(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class159.method1507(arg0.field2622);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dt.di(Lfz;I)Z")
    public static boolean method2114(class159 arg0) {
        if (field509) {
            if (method2111(arg0) != 0) {
                return false;
            }
            if (arg0.field2611 == 0) {
                return false;
            }
        }
        return arg0.field2625;
    }
}

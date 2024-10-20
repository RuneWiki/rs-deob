package deob;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.a")
    public static boolean field480 = true;

    @ObfuscatedName("client.l")
    public static int field546 = 1;

    @ObfuscatedName("client.b")
    public static int field483 = 0;

    @ObfuscatedName("client.m")
    public static boolean field544 = false;

    @ObfuscatedName("client.v")
    public static boolean field487 = false;

    @ObfuscatedName("client.j")
    public static int field488 = 0;

    @ObfuscatedName("client.h")
    public static int field489 = 0;

    @ObfuscatedName("client.o")
    public static boolean field490 = true;

    @ObfuscatedName("client.z")
    public static int field491 = 0;

    @ObfuscatedName("client.k")
    public static long field745 = -1L;

    @ObfuscatedName("client.e")
    public static int field493 = -1;

    @ObfuscatedName("client.s")
    public static int field502 = -1;

    @ObfuscatedName("client.t")
    public static int field495 = -1;

    @ObfuscatedName("client.r")
    public static boolean field496 = true;

    @ObfuscatedName("client.w")
    public static class164[] field494 = new class164[4];

    @ObfuscatedName("client.n")
    public static boolean field497 = false;

    @ObfuscatedName("client.c")
    public static int field736 = 0;

    @ObfuscatedName("client.az")
    public static int field599 = 0;

    @ObfuscatedName("client.ax")
    public static int field500 = 0;

    @ObfuscatedName("client.aq")
    public static int field501 = 0;

    @ObfuscatedName("client.ap")
    public static int field527 = 0;

    @ObfuscatedName("client.aa")
    public static int field537 = 0;

    @ObfuscatedName("client.ai")
    public static int field740 = 0;

    @ObfuscatedName("client.ar")
    public static int field746 = 0;

    @ObfuscatedName("client.ag")
    public static int field723 = 0;

    @ObfuscatedName("client.as")
    public static class127 field498 = new class127(new byte[5000]);

    @ObfuscatedName("client.am")
    public static int field509 = 0;

    @ObfuscatedName("client.aw")
    public static int field511 = 0;

    @ObfuscatedName("client.av")
    public static int field725 = 0;

    @ObfuscatedName("client.bk")
    public static int field516 = 0;

    @ObfuscatedName("client.bz")
    public static int field517 = 0;

    @ObfuscatedName("client.bh")
    public static int field646 = 0;

    @ObfuscatedName("client.bp")
    public static int field519 = 0;

    @ObfuscatedName("client.bg")
    public static int field520 = 0;

    @ObfuscatedName("client.by")
    public static class25[] field522 = new class25[32768];

    @ObfuscatedName("client.bl")
    public static int field523 = 0;

    @ObfuscatedName("client.bo")
    public static int[] field639 = new int[32768];

    @ObfuscatedName("client.ci")
    public static class116 field526 = new class116(5000);

    @ObfuscatedName("client.ch")
    public static class116 field635 = new class116(5000);

    @ObfuscatedName("client.cy")
    public static class116 field619 = new class116(5000);

    @ObfuscatedName("client.cr")
    public static int field529 = 0;

    @ObfuscatedName("client.ca")
    public static int field533 = 0;

    @ObfuscatedName("client.cs")
    public static int field521 = 0;

    @ObfuscatedName("client.cj")
    public static int field532 = 0;

    @ObfuscatedName("client.cq")
    public static int field492 = 0;

    @ObfuscatedName("client.cn")
    public static int field534 = 0;

    @ObfuscatedName("client.cf")
    public static int field535 = 0;

    @ObfuscatedName("client.cp")
    public static int field586 = 0;

    @ObfuscatedName("client.cc")
    public static boolean field604 = false;

    @ObfuscatedName("client.ck")
    public static int field539 = 0;

    @ObfuscatedName("client.cm")
    public static int field540 = 0;

    @ObfuscatedName("client.cw")
    public static int field541 = 1;

    @ObfuscatedName("client.ce")
    public static int field542 = 0;

    @ObfuscatedName("client.co")
    public static int field543 = 1;

    @ObfuscatedName("client.dw")
    public static int field649 = 0;

    @ObfuscatedName("client.dm")
    public static boolean field547 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field479 = new int[4][13][13];

    @ObfuscatedName("client.dj")
    public static final int[] field549 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dp")
    public static int field550 = 0;

    @ObfuscatedName("client.do")
    public static int[][] field551 = new int[104][104];

    @ObfuscatedName("client.dv")
    public static int[][] field568 = new int[104][104];

    @ObfuscatedName("client.dl")
    public static int[] field637 = new int[4000];

    @ObfuscatedName("client.da")
    public static int[] field554 = new int[4000];

    @ObfuscatedName("client.dd")
    public static int field714 = 0;

    @ObfuscatedName("client.dt")
    public static int field653 = 2;

    @ObfuscatedName("client.dq")
    public static int field528 = 0;

    @ObfuscatedName("client.di")
    public static int field558 = 2;

    @ObfuscatedName("client.dn")
    public static int field559 = 0;

    @ObfuscatedName("client.ds")
    public static int field709 = 1;

    @ObfuscatedName("client.du")
    public static int field695 = 0;

    @ObfuscatedName("client.df")
    public static int field499 = 0;

    @ObfuscatedName("client.eb")
    public static int field563 = 2;

    @ObfuscatedName("client.ea")
    public static int field564 = 0;

    @ObfuscatedName("client.ej")
    public static int field565 = 1;

    @ObfuscatedName("client.ex")
    public static int field566 = 0;

    @ObfuscatedName("client.ew")
    public static int field683 = 0;

    @ObfuscatedName("client.et")
    public static int field651 = 2301979;

    @ObfuscatedName("client.en")
    public static int field569 = 5063219;

    @ObfuscatedName("client.ez")
    public static int field570 = 3353893;

    @ObfuscatedName("client.fz")
    public static int field503 = 7759444;

    @ObfuscatedName("client.fj")
    public static boolean field732 = false;

    @ObfuscatedName("client.fi")
    public static int field573 = 0;

    @ObfuscatedName("client.fr")
    public static int field574 = 128;

    @ObfuscatedName("client.fq")
    public static int field553 = 0;

    @ObfuscatedName("client.fn")
    public static int field576 = 0;

    @ObfuscatedName("client.fh")
    public static int field577 = 0;

    @ObfuscatedName("client.ff")
    public static int field657 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field712 = false;

    @ObfuscatedName("client.fw")
    public static int field673 = 0;

    @ObfuscatedName("client.fd")
    public static int field581 = 0;

    @ObfuscatedName("client.fm")
    public static int field582 = 50;

    @ObfuscatedName("client.fc")
    public static int[] field583 = new int[field582];

    @ObfuscatedName("client.fx")
    public static int[] field584 = new int[field582];

    @ObfuscatedName("client.fv")
    public static int[] field585 = new int[field582];

    @ObfuscatedName("client.fk")
    public static int[] field605 = new int[field582];

    @ObfuscatedName("client.fp")
    public static int[] field587 = new int[field582];

    @ObfuscatedName("client.fy")
    public static int[] field616 = new int[field582];

    @ObfuscatedName("client.fa")
    public static int[] field505 = new int[field582];

    @ObfuscatedName("client.gi")
    public static String[] field590 = new String[field582];

    @ObfuscatedName("client.ge")
    public static int[][] field591 = new int[104][104];

    @ObfuscatedName("client.ga")
    public static int field575 = 0;

    @ObfuscatedName("client.gw")
    public static int field593 = -1;

    @ObfuscatedName("client.gv")
    public static int field594 = -1;

    @ObfuscatedName("client.gs")
    public static int field595 = 0;

    @ObfuscatedName("client.gh")
    public static int field531 = 0;

    @ObfuscatedName("client.gk")
    public static int field597 = 0;

    @ObfuscatedName("client.gq")
    public static int field598 = 0;

    @ObfuscatedName("client.gm")
    public static int field634 = 0;

    @ObfuscatedName("client.gf")
    public static int field600 = 0;

    @ObfuscatedName("client.gg")
    public static int field734 = 0;

    @ObfuscatedName("client.gc")
    public static int field602 = 0;

    @ObfuscatedName("client.gz")
    public static int field603 = 0;

    @ObfuscatedName("client.gt")
    public static int field690 = 0;

    @ObfuscatedName("client.gy")
    public static boolean field675 = false;

    @ObfuscatedName("client.gd")
    public static int field606 = 0;

    @ObfuscatedName("client.gj")
    public static int field607 = 0;

    @ObfuscatedName("client.gb")
    public static class3[] field608 = new class3[2048];

    @ObfuscatedName("client.gl")
    public static int field560 = 0;

    @ObfuscatedName("client.go")
    public static int[] field744 = new int[2048];

    @ObfuscatedName("client.hl")
    public static int field611 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field612 = new int[2048];

    @ObfuscatedName("client.hp")
    public static class127[] field601 = new class127[2048];

    @ObfuscatedName("client.hd")
    public static int field518 = -1;

    @ObfuscatedName("client.ha")
    public static int field615 = 0;

    @ObfuscatedName("client.hm")
    public static int field486 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field617 = new int[1000];

    @ObfuscatedName("client.hb")
    public static final int[] field674 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hu")
    public static String[] field552 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field620 = new boolean[8];

    @ObfuscatedName("client.hf")
    public static int[] field621 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hr")
    public static class177[][][] field622 = new class177[4][104][104];

    @ObfuscatedName("client.hh")
    public static class177 field623 = new class177();

    @ObfuscatedName("client.ho")
    public static class177 field624 = new class177();

    @ObfuscatedName("client.hn")
    public static class177 field625 = new class177();

    @ObfuscatedName("client.hi")
    public static int[] field626 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field627 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field628 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field629 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field630 = false;

    @ObfuscatedName("client.ip")
    public static int field631 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field557 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field633 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field592 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field548 = new int[500];

    @ObfuscatedName("client.il")
    public static String[] field507 = new String[500];

    @ObfuscatedName("client.ig")
    public static String[] field530 = new String[500];

    @ObfuscatedName("client.id")
    public static int field688 = -1;

    @ObfuscatedName("client.io")
    public static int field721 = -1;

    @ObfuscatedName("client.iw")
    public static int field610 = 0;

    @ObfuscatedName("client.ie")
    public static int field641 = 50;

    @ObfuscatedName("client.iy")
    public static int field642 = 0;

    @ObfuscatedName("client.it")
    public static String field643 = null;

    @ObfuscatedName("client.im")
    public static boolean field644 = false;

    @ObfuscatedName("client.iq")
    public static int field589 = -1;

    @ObfuscatedName("client.iu")
    public static String field504 = null;

    @ObfuscatedName("client.iv")
    public static String field647 = null;

    @ObfuscatedName("client.ji")
    public static int field648 = -1;

    @ObfuscatedName("client.jg")
    public static class175 field663 = new class175(8);

    @ObfuscatedName("client.jn")
    public static int field650 = 0;

    @ObfuscatedName("client.je")
    public static int field720 = 0;

    @ObfuscatedName("client.ja")
    public static class158 field652 = null;

    @ObfuscatedName("client.jo")
    public static int field609 = 0;

    @ObfuscatedName("client.jt")
    public static int field654 = 0;

    @ObfuscatedName("client.jk")
    public static int field655 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field656 = false;

    @ObfuscatedName("client.jq")
    public static boolean field693 = false;

    @ObfuscatedName("client.jv")
    public static boolean field658 = false;

    @ObfuscatedName("client.jx")
    public static class158 field659 = null;

    @ObfuscatedName("client.jr")
    public static class158 field660 = null;

    @ObfuscatedName("client.jz")
    public static int field661 = 0;

    @ObfuscatedName("client.jh")
    public static int field662 = 0;

    @ObfuscatedName("client.jy")
    public static class158 field636 = null;

    @ObfuscatedName("client.jj")
    public static boolean field664 = false;

    @ObfuscatedName("client.ju")
    public static int field665 = -1;

    @ObfuscatedName("client.js")
    public static int field666 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field485 = false;

    @ObfuscatedName("client.jc")
    public static int field588 = -1;

    @ObfuscatedName("client.jl")
    public static int field669 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field670 = false;

    @ObfuscatedName("client.kl")
    public static int field538 = 1;

    @ObfuscatedName("client.ky")
    public static int[] field672 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field506 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field579 = new int[32];

    @ObfuscatedName("client.km")
    public static int field613 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field676 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field677 = 0;

    @ObfuscatedName("client.kf")
    public static int field678 = 0;

    @ObfuscatedName("client.ks")
    public static int field667 = 0;

    @ObfuscatedName("client.ko")
    public static int field680 = 0;

    @ObfuscatedName("client.kd")
    public static int field668 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field562 = new int[2000];

    @ObfuscatedName("client.kg")
    public static String[] field729 = new String[1000];

    @ObfuscatedName("client.kc")
    public static int field684 = 0;

    @ObfuscatedName("client.kj")
    public static class177 field685 = new class177();

    @ObfuscatedName("client.kq")
    public static class177 field686 = new class177();

    @ObfuscatedName("client.kh")
    public static class177 field687 = new class177();

    @ObfuscatedName("client.ku")
    public static class175 field645 = new class175(512);

    @ObfuscatedName("client.kv")
    public static int field689 = 0;

    @ObfuscatedName("client.ka")
    public static int field580 = -2;

    @ObfuscatedName("client.kr")
    public static boolean[] field691 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static boolean[] field692 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field512 = new boolean[100];

    @ObfuscatedName("client.le")
    public static int[] field694 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field596 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field696 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field536 = new int[100];

    @ObfuscatedName("client.lw")
    public static int field698 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field699 = new int[100];

    @ObfuscatedName("client.lu")
    public static String[] field700 = new String[100];

    @ObfuscatedName("client.lx")
    public static String[] field701 = new String[100];

    @ObfuscatedName("client.lo")
    public static String[] field702 = new String[100];

    @ObfuscatedName("client.ll")
    public static int field703 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field704 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ly")
    public static int field555 = 0;

    @ObfuscatedName("client.lr")
    public static int field716 = 0;

    @ObfuscatedName("client.lc")
    public static long[] field707 = new long[100];

    @ObfuscatedName("client.lk")
    public static int field708 = 0;

    @ObfuscatedName("client.lq")
    public static int field572 = 0;

    @ObfuscatedName("client.ls")
    public static int[] field710 = new int[128];

    @ObfuscatedName("client.li")
    public static int[] field571 = new int[128];

    @ObfuscatedName("client.lt")
    public static long field614 = -1L;

    @ObfuscatedName("client.lf")
    public static String field713 = null;

    @ObfuscatedName("client.mi")
    public static String field640 = null;

    @ObfuscatedName("client.mk")
    public static int field715 = -1;

    @ObfuscatedName("client.mb")
    public static int field567 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field717 = new int[1000];

    @ObfuscatedName("client.mn")
    public static int[] field718 = new int[1000];

    @ObfuscatedName("client.mj")
    public static class86[] field719 = new class86[1000];

    @ObfuscatedName("client.ms")
    public static int field632 = 0;

    @ObfuscatedName("client.ml")
    public static int field706 = 0;

    @ObfuscatedName("client.mr")
    public static int field722 = 0;

    @ObfuscatedName("client.md")
    public static int field682 = 255;

    @ObfuscatedName("client.mv")
    public static int field724 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field681 = false;

    @ObfuscatedName("client.mh")
    public static int field726 = 127;

    @ObfuscatedName("client.me")
    public static int field727 = 127;

    @ObfuscatedName("client.ne")
    public static int field481 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field711 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field730 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field731 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field556 = new int[50];

    @ObfuscatedName("client.nb")
    public static class57[] field733 = new class57[50];

    @ObfuscatedName("client.nm")
    public static boolean field561 = false;

    @ObfuscatedName("client.nd")
    public static boolean[] field735 = new boolean[5];

    @ObfuscatedName("client.nk")
    public static int[] field749 = new int[5];

    @ObfuscatedName("client.nu")
    public static int[] field737 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field738 = new int[5];

    @ObfuscatedName("client.ot")
    public static int[] field671 = new int[5];

    @ObfuscatedName("client.oy")
    public static int field705 = 0;

    @ObfuscatedName("client.on")
    public static int field741 = 0;

    @ObfuscatedName("client.ol")
    public static class23[] field742 = new class23[400];

    @ObfuscatedName("client.oe")
    public static class173 field743 = new class173();

    @ObfuscatedName("client.oq")
    public static int field638 = 0;

    @ObfuscatedName("client.oc")
    public static class11[] field739 = new class11[400];

    @ObfuscatedName("client.oh")
    public static class163 field618 = new class163();

    @ObfuscatedName("client.om")
    public static int field747 = -1;

    @ObfuscatedName("client.ov")
    public static int field748 = -1;

    @ObfuscatedName("client.a(I)V")
    public final void method273() {
    }

    public final void init() {
        if (!this.method1397()) {
            return;
        }
        class167[] var1 = class167.method724();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2784);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2784)) {
                    case 1:
                        class133[] var5 = class133.method2640();
                        int var6 = Integer.parseInt(var4);
                        class133[] var7 = var5;
                        int var8 = 0;
                        class133 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class133 var9 = var7[var8];
                            if (var6 == var9.method2302()) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field484 = (class133) var10;
                        if (Statics.field484 == class133.field2084) {
                            Statics.field728 = class186.field2856;
                        } else {
                            Statics.field728 = class186.field2863;
                        }
                        break;
                    case 2:
                        field483 = Integer.parseInt(var4);
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field25)) {
                        }
                        break;
                    case 4:
                        int var11 = Integer.parseInt(var4);
                        class132[] var12 = class132.method56();
                        int var13 = 0;
                        class132 var15;
                        while (true) {
                            if (var13 >= var12.length) {
                                var15 = null;
                                break;
                            }
                            class132 var14 = var12[var13];
                            if (var14.field2074 == var11) {
                                var15 = var14;
                                break;
                            }
                            var13++;
                        }
                        Statics.field482 = var15;
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field25)) {
                            field544 = true;
                        } else {
                            field544 = false;
                        }
                        break;
                    case 6:
                        field488 = Integer.parseInt(var4);
                    case 7:
                    default:
                        break;
                    case 8:
                        field546 = Integer.parseInt(var4);
                        break;
                    case 9:
                        Statics.field1764 = var4;
                }
            }
        }
        class95.field1606 = false;
        field487 = false;
        Statics.field1463 = this.getCodeBase().getHost();
        String var16 = Statics.field482.field2068;
        byte var17 = 0;
        try {
            Statics.method118("oldschool", var16, var17, 16);
        } catch (Exception var19) {
            class80.method252((String) null, var19);
        }
        Statics.field2716 = this;
        this.method1420(765, 503, 21);
    }

    @ObfuscatedName("client.q(I)V")
    public final void method345() {
        Statics.field524 = field483 == 0 ? 43594 : field546 + 40000;
        Statics.field1347 = field483 == 0 ? 443 : field546 + 50000;
        Statics.field387 = Statics.field524;
        Statics.field1311 = class161.field2726;
        Statics.field1997 = class161.field2723;
        Statics.field1794 = class161.field2724;
        Statics.field28 = class161.field2725;
        class75.method29();
        class75.method2818(Statics.field962);
        class77.method1977(Statics.field962);
        Statics.field765 = class66.method786();
        if (Statics.field765 != null) {
            Statics.field765.method1306(Statics.field962);
        }
        Statics.field125 = new class71(255, class82.field1449, class82.field1450, 500000);
        class29 var1 = null;
        class12 var2 = new class12();
        try {
            var1 = Statics.method1323("", Statics.field484.field2081, false);
            byte[] var3 = new byte[(int) var1.method552()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method553(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class12(new class127(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method548();
            }
        } catch (Exception var9) {
        }
        Statics.field1048 = var2;
        if (field483 != 0) {
            field497 = true;
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method373() {
        field491++;
        this.method280();
        while (true) {
            class177 var1 = class157.field2577;
            class156 var2;
            synchronized (class157.field2577) {
                var2 = (class156) class157.field2578.method3288();
            }
            if (var2 == null) {
                class138.method230();
                Statics.method25();
                class75 var4 = class75.field1367;
                synchronized (class75.field1367) {
                    class75.field1376++;
                    class75.field1386 = class75.field1388;
                    class75.field1385 = 0;
                    if (class75.field1366 >= 0) {
                        while (class75.field1380 != class75.field1366) {
                            int var6 = class75.field1377[class75.field1380];
                            class75.field1380 = class75.field1380 + 1 & 0x7F;
                            if (var6 < 0) {
                                class75.field1384[~var6] = false;
                            } else {
                                if (!class75.field1384[var6] && class75.field1385 < class75.field1379.length - 1) {
                                    class75.field1379[++class75.field1385 - 1] = var6;
                                }
                                class75.field1384[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class75.field1384[var5] = false;
                        }
                        class75.field1366 = class75.field1380;
                    }
                    class75.field1388 = class75.field1387;
                }
                class77 var8 = class77.field1414;
                synchronized (class77.field1414) {
                    class77.field1407 = class77.field1404;
                    class77.field1408 = class77.field1405;
                    class77.field1409 = class77.field1406;
                    class77.field1412 = class77.field1410;
                    class77.field1415 = class77.field1422;
                    class77.field1416 = class77.field1420;
                    class77.field1402 = class77.field1413;
                    class77.field1410 = 0;
                }
                if (Statics.field765 != null) {
                    int var10 = Statics.field765.method1317();
                    field684 = var10;
                }
                int var10002;
                if (field489 == 0) {
                    method159();
                    class73.method141();
                } else if (field489 == 5) {
                    class21.method1368(this);
                    method159();
                    class73.method141();
                } else if (field489 == 10) {
                    class21.method1368(this);
                } else if (field489 == 20) {
                    class21.method1368(this);
                    method24();
                } else if (field489 == 25) {
                    method2900(false);
                    field540 = 0;
                    boolean var11 = true;
                    for (int var12 = 0; var12 < Statics.field926.length; var12++) {
                        if (Statics.field194[var12] != -1 && Statics.field926[var12] == null) {
                            Statics.field926[var12] = Statics.field275.method2932(Statics.field194[var12], 0);
                            if (Statics.field926[var12] == null) {
                                var11 = false;
                                field540++;
                            }
                        }
                        if (Statics.field2002[var12] != -1 && Statics.field331[var12] == null) {
                            Statics.field331[var12] = Statics.field275.method2936(Statics.field2002[var12], 0, Statics.field1761[var12]);
                            if (Statics.field331[var12] == null) {
                                var11 = false;
                                field540++;
                            }
                        }
                    }
                    if (var11) {
                        field542 = 0;
                        boolean var13 = true;
                        for (int var14 = 0; var14 < Statics.field926.length; var14++) {
                            byte[] var15 = Statics.field331[var14];
                            if (var15 != null) {
                                int var16 = (Statics.field267[var14] >> 8) * 64 - Statics.field287;
                                int var17 = (Statics.field267[var14] & 0xFF) * 64 - Statics.field364;
                                if (field547) {
                                    var16 = 10;
                                    var17 = 10;
                                }
                                boolean var19 = true;
                                class127 var20 = new class127(var15);
                                int var21 = -1;
                                label3750: while (true) {
                                    int var22 = var20.method2424();
                                    if (var22 == 0) {
                                        var13 &= var19;
                                        break;
                                    }
                                    var21 += var22;
                                    int var23 = 0;
                                    boolean var24 = false;
                                    while (true) {
                                        while (!var24) {
                                            int var26 = var20.method2424();
                                            if (var26 == 0) {
                                                continue label3750;
                                            }
                                            var23 += var26 - 1;
                                            int var27 = var23 & 0x3F;
                                            int var28 = var23 >> 6 & 0x3F;
                                            int var29 = var20.method2411() >> 2;
                                            int var30 = var16 + var28;
                                            int var31 = var17 + var27;
                                            if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                                                class32 var32 = class32.method1460(var21);
                                                if (var29 != 22 || !field487 || var32.field857 != 0 || var32.field838 == 1 || var32.field860) {
                                                    if (!var32.method634()) {
                                                        field542++;
                                                        var19 = false;
                                                    }
                                                    var24 = true;
                                                }
                                            }
                                        }
                                        int var25 = var20.method2424();
                                        if (var25 == 0) {
                                            break;
                                        }
                                        var20.method2411();
                                    }
                                }
                            }
                        }
                        if (var13) {
                            if (field649 != 0) {
                                method1534(class134.field2093 + class2.field16 + class2.field19 + 100 + "%" + class2.field20, true);
                            }
                            Statics.method25();
                            method1331();
                            Statics.method25();
                            Statics.field545.method1805();
                            Statics.method25();
                            System.gc();
                            for (int var34 = 0; var34 < 4; var34++) {
                                field494[var34].method3181();
                            }
                            for (int var35 = 0; var35 < 4; var35++) {
                                for (int var36 = 0; var36 < 104; var36++) {
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        class9.field134[var35][var36][var37] = 0;
                                    }
                                }
                            }
                            Statics.method25();
                            class9.field135 = 99;
                            Statics.field136 = new byte[4][104][104];
                            Statics.field137 = new byte[4][104][104];
                            Statics.field138 = new byte[4][104][104];
                            Statics.field139 = new byte[4][104][104];
                            Statics.field208 = new int[4][105][105];
                            Statics.field968 = new byte[4][105][105];
                            Statics.field1927 = new int[105][105];
                            Statics.field147 = new int[104];
                            Statics.field1306 = new int[104];
                            Statics.field762 = new int[104];
                            Statics.field766 = new int[104];
                            Statics.field57 = new int[104];
                            int var38 = Statics.field926.length;
                            class7.method556();
                            method2900(true);
                            if (!field547) {
                                for (int var39 = 0; var39 < var38; var39++) {
                                    int var40 = (Statics.field267[var39] >> 8) * 64 - Statics.field287;
                                    int var41 = (Statics.field267[var39] & 0xFF) * 64 - Statics.field364;
                                    byte[] var42 = Statics.field926[var39];
                                    if (var42 != null) {
                                        Statics.method25();
                                        class9.method2154(var42, var40, var41, Statics.field1345 * 8 - 48, Statics.field15 * 8 - 48, field494);
                                    }
                                }
                                for (int var43 = 0; var43 < var38; var43++) {
                                    int var44 = (Statics.field267[var43] >> 8) * 64 - Statics.field287;
                                    int var45 = (Statics.field267[var43] & 0xFF) * 64 - Statics.field364;
                                    byte[] var46 = Statics.field926[var43];
                                    if (var46 == null && Statics.field15 < 800) {
                                        Statics.method25();
                                        class9.method2813(var44, var45, 64, 64);
                                    }
                                }
                                method2900(true);
                                for (int var47 = 0; var47 < var38; var47++) {
                                    byte[] var48 = Statics.field331[var47];
                                    if (var48 != null) {
                                        int var49 = (Statics.field267[var47] >> 8) * 64 - Statics.field287;
                                        int var50 = (Statics.field267[var47] & 0xFF) * 64 - Statics.field364;
                                        Statics.method25();
                                        class95 var51 = Statics.field545;
                                        class164[] var52 = field494;
                                        class127 var53 = new class127(var48);
                                        int var54 = -1;
                                        while (true) {
                                            int var55 = var53.method2424();
                                            if (var55 == 0) {
                                                break;
                                            }
                                            var54 += var55;
                                            int var56 = 0;
                                            while (true) {
                                                int var57 = var53.method2424();
                                                if (var57 == 0) {
                                                    break;
                                                }
                                                var56 += var57 - 1;
                                                int var58 = var56 & 0x3F;
                                                int var59 = var56 >> 6 & 0x3F;
                                                int var60 = var56 >> 12;
                                                int var61 = var53.method2411();
                                                int var62 = var61 >> 2;
                                                int var63 = var61 & 0x3;
                                                int var64 = var49 + var59;
                                                int var65 = var50 + var58;
                                                if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                                    int var66 = var60;
                                                    if ((class9.field134[1][var64][var65] & 0x2) == 2) {
                                                        var66 = var60 - 1;
                                                    }
                                                    class164 var67 = null;
                                                    if (var66 >= 0) {
                                                        var67 = var52[var66];
                                                    }
                                                    class9.method173(var60, var64, var65, var54, var63, var62, var51, var67);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field547) {
                                int var68 = 0;
                                label3655: while (true) {
                                    if (var68 >= 4) {
                                        for (int var86 = 0; var86 < 13; var86++) {
                                            for (int var87 = 0; var87 < 13; var87++) {
                                                int var88 = field479[0][var86][var87];
                                                if (var88 == -1) {
                                                    class9.method2813(var86 * 8, var87 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2900(true);
                                        int var89 = 0;
                                        while (true) {
                                            if (var89 >= 4) {
                                                break label3655;
                                            }
                                            Statics.method25();
                                            for (int var90 = 0; var90 < 13; var90++) {
                                                label3578: for (int var91 = 0; var91 < 13; var91++) {
                                                    int var92 = field479[var89][var90][var91];
                                                    if (var92 != -1) {
                                                        int var93 = var92 >> 24 & 0x3;
                                                        int var94 = var92 >> 1 & 0x3;
                                                        int var95 = var92 >> 14 & 0x3FF;
                                                        int var96 = var92 >> 3 & 0x7FF;
                                                        int var97 = (var95 / 8 << 8) + var96 / 8;
                                                        for (int var98 = 0; var98 < Statics.field267.length; var98++) {
                                                            if (Statics.field267[var98] == var97 && Statics.field331[var98] != null) {
                                                                byte[] var99 = Statics.field331[var98];
                                                                int var100 = var90 * 8;
                                                                int var101 = var91 * 8;
                                                                int var102 = (var95 & 0x7) * 8;
                                                                int var103 = (var96 & 0x7) * 8;
                                                                class95 var104 = Statics.field545;
                                                                class164[] var105 = field494;
                                                                class127 var106 = new class127(var99);
                                                                int var107 = -1;
                                                                while (true) {
                                                                    int var108 = var106.method2424();
                                                                    if (var108 == 0) {
                                                                        continue label3578;
                                                                    }
                                                                    var107 += var108;
                                                                    int var109 = 0;
                                                                    while (true) {
                                                                        int var110 = var106.method2424();
                                                                        if (var110 == 0) {
                                                                            break;
                                                                        }
                                                                        var109 += var110 - 1;
                                                                        int var111 = var109 & 0x3F;
                                                                        int var112 = var109 >> 6 & 0x3F;
                                                                        int var113 = var109 >> 12;
                                                                        int var114 = var106.method2411();
                                                                        int var115 = var114 >> 2;
                                                                        int var116 = var114 & 0x3;
                                                                        if (var93 == var113 && var112 >= var102 && var112 < var102 + 8 && var111 >= var103 && var111 < var103 + 8) {
                                                                            class32 var117 = class32.method1460(var107);
                                                                            int var119 = var112 & 0x7;
                                                                            int var120 = var111 & 0x7;
                                                                            int var122 = var117.field836;
                                                                            int var123 = var117.field837;
                                                                            if ((var116 & 0x1) == 1) {
                                                                                int var124 = var122;
                                                                                var122 = var123;
                                                                                var123 = var124;
                                                                            }
                                                                            int var125 = var94 & 0x3;
                                                                            int var126;
                                                                            if (var125 == 0) {
                                                                                var126 = var119;
                                                                            } else if (var125 == 1) {
                                                                                var126 = var120;
                                                                            } else if (var125 == 2) {
                                                                                var126 = 7 - var119 - (var122 - 1);
                                                                            } else {
                                                                                var126 = 7 - var120 - (var123 - 1);
                                                                            }
                                                                            int var127 = var100 + var126;
                                                                            int var128 = var101 + class160.method2149(var112 & 0x7, var111 & 0x7, var94, var117.field836, var117.field837, var116);
                                                                            if (var127 > 0 && var128 > 0 && var127 < 103 && var128 < 103) {
                                                                                int var129 = var89;
                                                                                if ((class9.field134[1][var127][var128] & 0x2) == 2) {
                                                                                    var129 = var89 - 1;
                                                                                }
                                                                                class164 var130 = null;
                                                                                if (var129 >= 0) {
                                                                                    var130 = var105[var129];
                                                                                }
                                                                                class9.method173(var89, var127, var128, var107, var94 + var116 & 0x3, var115, var104, var130);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var89++;
                                        }
                                    }
                                    Statics.method25();
                                    for (int var69 = 0; var69 < 13; var69++) {
                                        for (int var70 = 0; var70 < 13; var70++) {
                                            boolean var71 = false;
                                            int var72 = field479[var68][var69][var70];
                                            if (var72 != -1) {
                                                int var73 = var72 >> 24 & 0x3;
                                                int var74 = var72 >> 1 & 0x3;
                                                int var75 = var72 >> 14 & 0x3FF;
                                                int var76 = var72 >> 3 & 0x7FF;
                                                int var77 = (var75 / 8 << 8) + var76 / 8;
                                                for (int var78 = 0; var78 < Statics.field267.length; var78++) {
                                                    if (Statics.field267[var78] == var77 && Statics.field926[var78] != null) {
                                                        class9.method2664(Statics.field926[var78], var68, var69 * 8, var70 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, field494);
                                                        var71 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var71) {
                                                int var79 = var68;
                                                int var80 = var69 * 8;
                                                int var81 = var70 * 8;
                                                for (int var82 = 0; var82 < 8; var82++) {
                                                    for (int var83 = 0; var83 < 8; var83++) {
                                                        class9.field141[var79][var80 + var82][var81 + var83] = 0;
                                                    }
                                                }
                                                if (var80 > 0) {
                                                    for (int var84 = 1; var84 < 8; var84++) {
                                                        class9.field141[var79][var80][var81 + var84] = class9.field141[var79][var80 - 1][var81 + var84];
                                                    }
                                                }
                                                if (var81 > 0) {
                                                    for (int var85 = 1; var85 < 8; var85++) {
                                                        class9.field141[var79][var80 + var85][var81] = class9.field141[var79][var80 + var85][var81 - 1];
                                                    }
                                                }
                                                if (var80 > 0 && class9.field141[var79][var80 - 1][var81] != 0) {
                                                    class9.field141[var79][var80][var81] = class9.field141[var79][var80 - 1][var81];
                                                } else if (var81 > 0 && class9.field141[var79][var80][var81 - 1] != 0) {
                                                    class9.field141[var79][var80][var81] = class9.field141[var79][var80][var81 - 1];
                                                } else if (var80 > 0 && var81 > 0 && class9.field141[var79][var80 - 1][var81 - 1] != 0) {
                                                    class9.field141[var79][var80][var81] = class9.field141[var79][var80 - 1][var81 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var68++;
                                }
                            }
                            method2900(true);
                            method1331();
                            Statics.method25();
                            class95 var131 = Statics.field545;
                            class164[] var132 = field494;
                            for (int var133 = 0; var133 < 4; var133++) {
                                for (int var134 = 0; var134 < 104; var134++) {
                                    for (int var135 = 0; var135 < 104; var135++) {
                                        if ((class9.field134[var133][var134][var135] & 0x1) == 1) {
                                            int var136 = var133;
                                            if ((class9.field134[1][var134][var135] & 0x2) == 2) {
                                                var136 = var133 - 1;
                                            }
                                            if (var136 >= 0) {
                                                var132[var136].method3212(var134, var135);
                                            }
                                        }
                                    }
                                }
                            }
                            class9.field133 += (int) (Math.random() * 5.0D) - 2;
                            if (class9.field133 < -8) {
                                class9.field133 = -8;
                            }
                            if (class9.field133 > 8) {
                                class9.field133 = 8;
                            }
                            class9.field149 += (int) (Math.random() * 5.0D) - 2;
                            if (class9.field149 < -16) {
                                class9.field149 = -16;
                            }
                            if (class9.field149 > 16) {
                                class9.field149 = 16;
                            }
                            for (int var137 = 0; var137 < 4; var137++) {
                                byte[][] var138 = Statics.field968[var137];
                                int var139 = (int) Math.sqrt(5100.0D);
                                int var140 = var139 * 768 >> 8;
                                for (int var141 = 1; var141 < 103; var141++) {
                                    for (int var142 = 1; var142 < 103; var142++) {
                                        int var143 = class9.field141[var137][var142 + 1][var141] - class9.field141[var137][var142 - 1][var141];
                                        int var144 = class9.field141[var137][var142][var141 + 1] - class9.field141[var137][var142][var141 - 1];
                                        int var145 = (int) Math.sqrt((double) (var144 * var144 + var143 * var143 + 65536));
                                        int var146 = (var143 << 8) / var145;
                                        int var147 = 65536 / var145;
                                        int var148 = (var144 << 8) / var145;
                                        int var149 = (var148 * -50 + var146 * -50 + var147 * -10) / var140 + 96;
                                        int var150 = (var138[var142][var141] >> 1) + (var138[var142][var141 + 1] >> 3) + (var138[var142][var141 - 1] >> 2) + (var138[var142 - 1][var141] >> 2) + (var138[var142 + 1][var141] >> 3);
                                        Statics.field1927[var142][var141] = var149 - var150;
                                    }
                                }
                                for (int var151 = 0; var151 < 104; var151++) {
                                    Statics.field147[var151] = 0;
                                    Statics.field1306[var151] = 0;
                                    Statics.field762[var151] = 0;
                                    Statics.field766[var151] = 0;
                                    Statics.field57[var151] = 0;
                                }
                                for (int var152 = -5; var152 < 109; var152++) {
                                    for (int var153 = 0; var153 < 104; var153++) {
                                        int var154 = var152 + 5;
                                        if (var154 >= 0 && var154 < 104) {
                                            int var155 = Statics.field136[var137][var154][var153] & 0xFF;
                                            if (var155 > 0) {
                                                int var156 = var155 - 1;
                                                class33 var157 = (class33) class33.field877.method3223((long) var156);
                                                class33 var158;
                                                if (var157 == null) {
                                                    byte[] var159 = Statics.field876.method2932(1, var156);
                                                    class33 var160 = new class33();
                                                    if (var159 != null) {
                                                        var160.method671(new class127(var159), var156);
                                                    }
                                                    var160.method670();
                                                    class33.field877.method3225(var160, (long) var156);
                                                    var158 = var160;
                                                } else {
                                                    var158 = var157;
                                                }
                                                Statics.field147[var153] += var158.field878;
                                                Statics.field1306[var153] += var158.field875;
                                                Statics.field762[var153] += var158.field879;
                                                Statics.field766[var153] += var158.field880;
                                                var10002 = Statics.field57[var153]++;
                                            }
                                        }
                                        int var162 = var152 - 5;
                                        if (var162 >= 0 && var162 < 104) {
                                            int var163 = Statics.field136[var137][var162][var153] & 0xFF;
                                            if (var163 > 0) {
                                                int var164 = var163 - 1;
                                                class33 var165 = (class33) class33.field877.method3223((long) var164);
                                                class33 var166;
                                                if (var165 == null) {
                                                    byte[] var167 = Statics.field876.method2932(1, var164);
                                                    class33 var168 = new class33();
                                                    if (var167 != null) {
                                                        var168.method671(new class127(var167), var164);
                                                    }
                                                    var168.method670();
                                                    class33.field877.method3225(var168, (long) var164);
                                                    var166 = var168;
                                                } else {
                                                    var166 = var165;
                                                }
                                                Statics.field147[var153] -= var166.field878;
                                                Statics.field1306[var153] -= var166.field875;
                                                Statics.field762[var153] -= var166.field879;
                                                Statics.field766[var153] -= var166.field880;
                                                var10002 = Statics.field57[var153]--;
                                            }
                                        }
                                    }
                                    if (var152 >= 1 && var152 < 103) {
                                        int var170 = 0;
                                        int var171 = 0;
                                        int var172 = 0;
                                        int var173 = 0;
                                        int var174 = 0;
                                        for (int var175 = -5; var175 < 109; var175++) {
                                            int var176 = var175 + 5;
                                            if (var176 >= 0 && var176 < 104) {
                                                var170 += Statics.field147[var176];
                                                var171 += Statics.field1306[var176];
                                                var172 += Statics.field762[var176];
                                                var173 += Statics.field766[var176];
                                                var174 += Statics.field57[var176];
                                            }
                                            int var177 = var175 - 5;
                                            if (var177 >= 0 && var177 < 104) {
                                                var170 -= Statics.field147[var177];
                                                var171 -= Statics.field1306[var177];
                                                var172 -= Statics.field762[var177];
                                                var173 -= Statics.field766[var177];
                                                var174 -= Statics.field57[var177];
                                            }
                                            if (var175 >= 1 && var175 < 103) {
                                                if (field487 && (class9.field134[0][var152][var175] & 0x2) == 0) {
                                                    if ((class9.field134[var137][var152][var175] & 0x10) != 0) {
                                                        continue;
                                                    }
                                                    int var178;
                                                    if ((class9.field134[var137][var152][var175] & 0x8) != 0) {
                                                        var178 = 0;
                                                    } else if (var137 <= 0 || (class9.field134[1][var152][var175] & 0x2) == 0) {
                                                        var178 = var137;
                                                    } else {
                                                        var178 = var137 - 1;
                                                    }
                                                    if (field539 != var178) {
                                                        continue;
                                                    }
                                                }
                                                if (var137 < class9.field135) {
                                                    class9.field135 = var137;
                                                }
                                                int var179 = Statics.field136[var137][var152][var175] & 0xFF;
                                                int var180 = Statics.field137[var137][var152][var175] & 0xFF;
                                                if (var179 > 0 || var180 > 0) {
                                                    int var181 = class9.field141[var137][var152][var175];
                                                    int var182 = class9.field141[var137][var152 + 1][var175];
                                                    int var183 = class9.field141[var137][var152 + 1][var175 + 1];
                                                    int var184 = class9.field141[var137][var152][var175 + 1];
                                                    int var185 = Statics.field1927[var152][var175];
                                                    int var186 = Statics.field1927[var152 + 1][var175];
                                                    int var187 = Statics.field1927[var152 + 1][var175 + 1];
                                                    int var188 = Statics.field1927[var152][var175 + 1];
                                                    int var189 = -1;
                                                    int var190 = -1;
                                                    if (var179 > 0) {
                                                        int var191 = var170 * 256 / var173;
                                                        int var192 = var171 / var174;
                                                        int var193 = var172 / var174;
                                                        var189 = Statics.method2306(var191, var192, var193);
                                                        int var194 = class9.field133 + var191 & 0xFF;
                                                        int var195 = class9.field149 + var193;
                                                        if (var195 < 0) {
                                                            var195 = 0;
                                                        } else if (var195 > 255) {
                                                            var195 = 255;
                                                        }
                                                        var190 = Statics.method2306(var194, var192, var195);
                                                    }
                                                    if (var137 > 0) {
                                                        boolean var196 = true;
                                                        if (var179 == 0 && Statics.field138[var137][var152][var175] != 0) {
                                                            var196 = false;
                                                        }
                                                        if (var180 > 0 && !class37.method1384(var180 - 1).field957) {
                                                            var196 = false;
                                                        }
                                                        if (var196 && var181 == var182 && var181 == var183 && var181 == var184) {
                                                            Statics.field208[var137][var152][var175] |= 0x924;
                                                        }
                                                    }
                                                    int var197 = 0;
                                                    if (var190 != -1) {
                                                        var197 = class104.field1785[class9.method2899(var190, 96)];
                                                    }
                                                    if (var180 == 0) {
                                                        var131.method1941(var137, var152, var175, 0, 0, -1, var181, var182, var183, var184, class9.method2899(var189, var185), class9.method2899(var189, var186), class9.method2899(var189, var187), class9.method2899(var189, var188), 0, 0, 0, 0, var197, 0);
                                                    } else {
                                                        int var198 = Statics.field138[var137][var152][var175] + 1;
                                                        byte var199 = Statics.field139[var137][var152][var175];
                                                        class37 var200 = class37.method1384(var180 - 1);
                                                        int var201 = var200.field947;
                                                        int var202;
                                                        int var203;
                                                        if (var201 >= 0) {
                                                            var202 = Statics.field1786.method2136(var201);
                                                            var203 = -1;
                                                        } else if (var200.field946 == 16711935) {
                                                            var203 = -2;
                                                            var201 = -1;
                                                            var202 = -2;
                                                        } else {
                                                            var203 = Statics.method2306(var200.field948, var200.field951, var200.field952);
                                                            int var204 = class9.field133 + var200.field948 & 0xFF;
                                                            int var205 = class9.field149 + var200.field952;
                                                            if (var205 < 0) {
                                                                var205 = 0;
                                                            } else if (var205 > 255) {
                                                                var205 = 255;
                                                            }
                                                            var202 = Statics.method2306(var204, var200.field951, var205);
                                                        }
                                                        int var206 = 0;
                                                        if (var202 != -2) {
                                                            var206 = class104.field1785[class9.method2337(var202, 96)];
                                                        }
                                                        if (var200.field949 != -1) {
                                                            int var207 = class9.field133 + var200.field953 & 0xFF;
                                                            int var208 = class9.field149 + var200.field955;
                                                            if (var208 < 0) {
                                                                var208 = 0;
                                                            } else if (var208 > 255) {
                                                                var208 = 255;
                                                            }
                                                            int var209 = Statics.method2306(var207, var200.field954, var208);
                                                            var206 = class104.field1785[class9.method2337(var209, 96)];
                                                        }
                                                        var131.method1941(var137, var152, var175, var198, var199, var201, var181, var182, var183, var184, class9.method2899(var189, var185), class9.method2899(var189, var186), class9.method2899(var189, var187), class9.method2899(var189, var188), class9.method2337(var203, var185), class9.method2337(var203, var186), class9.method2337(var203, var187), class9.method2337(var203, var188), var197, var206);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var210 = 1; var210 < 103; var210++) {
                                    for (int var211 = 1; var211 < 103; var211++) {
                                        int var216;
                                        if ((class9.field134[var137][var211][var210] & 0x8) != 0) {
                                            var216 = 0;
                                        } else if (var137 <= 0 || (class9.field134[1][var211][var210] & 0x2) == 0) {
                                            var216 = var137;
                                        } else {
                                            var216 = var137 - 1;
                                        }
                                        var131.method1866(var137, var211, var210, var216);
                                    }
                                }
                                Statics.field136[var137] = (byte[][]) null;
                                Statics.field137[var137] = (byte[][]) null;
                                Statics.field138[var137] = (byte[][]) null;
                                Statics.field139[var137] = (byte[][]) null;
                                Statics.field968[var137] = (byte[][]) null;
                            }
                            var131.method1825(-50, -10, -50);
                            for (int var217 = 0; var217 < 104; var217++) {
                                for (int var218 = 0; var218 < 104; var218++) {
                                    if ((class9.field134[1][var217][var218] & 0x2) == 2) {
                                        var131.method1796(var217, var218);
                                    }
                                }
                            }
                            int var219 = 1;
                            int var220 = 2;
                            int var221 = 4;
                            for (int var222 = 0; var222 < 4; var222++) {
                                if (var222 > 0) {
                                    var219 <<= 0x3;
                                    var220 <<= 0x3;
                                    var221 <<= 0x3;
                                }
                                for (int var223 = 0; var223 <= var222; var223++) {
                                    for (int var224 = 0; var224 <= 104; var224++) {
                                        for (int var225 = 0; var225 <= 104; var225++) {
                                            if ((Statics.field208[var223][var225][var224] & var219) != 0) {
                                                int var226 = var224;
                                                int var227 = var224;
                                                int var228 = var223;
                                                int var229 = var223;
                                                while (var226 > 0 && (Statics.field208[var223][var225][var226 - 1] & var219) != 0) {
                                                    var226--;
                                                }
                                                while (var227 < 104 && (Statics.field208[var223][var225][var227 + 1] & var219) != 0) {
                                                    var227++;
                                                }
                                                label3288: while (var228 > 0) {
                                                    for (int var230 = var226; var230 <= var227; var230++) {
                                                        if ((Statics.field208[var228 - 1][var225][var230] & var219) == 0) {
                                                            break label3288;
                                                        }
                                                    }
                                                    var228--;
                                                }
                                                label3277: while (var229 < var222) {
                                                    for (int var231 = var226; var231 <= var227; var231++) {
                                                        if ((Statics.field208[var229 + 1][var225][var231] & var219) == 0) {
                                                            break label3277;
                                                        }
                                                    }
                                                    var229++;
                                                }
                                                int var232 = (var229 + 1 - var228) * (var227 - var226 + 1);
                                                if (var232 >= 8) {
                                                    short var233 = 240;
                                                    int var234 = class9.field141[var229][var225][var226] - var233;
                                                    int var235 = class9.field141[var228][var225][var226];
                                                    class95.method1804(var222, 1, var225 * 128, var225 * 128, var226 * 128, var227 * 128 + 128, var234, var235);
                                                    for (int var236 = var228; var236 <= var229; var236++) {
                                                        for (int var237 = var226; var237 <= var227; var237++) {
                                                            Statics.field208[var236][var225][var237] &= ~var219;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field208[var223][var225][var224] & var220) != 0) {
                                                int var238 = var225;
                                                int var239 = var225;
                                                int var240 = var223;
                                                int var241 = var223;
                                                while (var238 > 0 && (Statics.field208[var223][var238 - 1][var224] & var220) != 0) {
                                                    var238--;
                                                }
                                                while (var239 < 104 && (Statics.field208[var223][var239 + 1][var224] & var220) != 0) {
                                                    var239++;
                                                }
                                                label3341: while (var240 > 0) {
                                                    for (int var242 = var238; var242 <= var239; var242++) {
                                                        if ((Statics.field208[var240 - 1][var242][var224] & var220) == 0) {
                                                            break label3341;
                                                        }
                                                    }
                                                    var240--;
                                                }
                                                label3330: while (var241 < var222) {
                                                    for (int var243 = var238; var243 <= var239; var243++) {
                                                        if ((Statics.field208[var241 + 1][var243][var224] & var220) == 0) {
                                                            break label3330;
                                                        }
                                                    }
                                                    var241++;
                                                }
                                                int var244 = (var241 + 1 - var240) * (var239 - var238 + 1);
                                                if (var244 >= 8) {
                                                    short var245 = 240;
                                                    int var246 = class9.field141[var241][var238][var224] - var245;
                                                    int var247 = class9.field141[var240][var238][var224];
                                                    class95.method1804(var222, 2, var238 * 128, var239 * 128 + 128, var224 * 128, var224 * 128, var246, var247);
                                                    for (int var248 = var240; var248 <= var241; var248++) {
                                                        for (int var249 = var238; var249 <= var239; var249++) {
                                                            Statics.field208[var248][var249][var224] &= ~var220;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field208[var223][var225][var224] & var221) != 0) {
                                                int var250 = var225;
                                                int var251 = var225;
                                                int var252 = var224;
                                                int var253 = var224;
                                                while (var252 > 0 && (Statics.field208[var223][var225][var252 - 1] & var221) != 0) {
                                                    var252--;
                                                }
                                                while (var253 < 104 && (Statics.field208[var223][var225][var253 + 1] & var221) != 0) {
                                                    var253++;
                                                }
                                                label3394: while (var250 > 0) {
                                                    for (int var254 = var252; var254 <= var253; var254++) {
                                                        if ((Statics.field208[var223][var250 - 1][var254] & var221) == 0) {
                                                            break label3394;
                                                        }
                                                    }
                                                    var250--;
                                                }
                                                label3383: while (var251 < 104) {
                                                    for (int var255 = var252; var255 <= var253; var255++) {
                                                        if ((Statics.field208[var223][var251 + 1][var255] & var221) == 0) {
                                                            break label3383;
                                                        }
                                                    }
                                                    var251++;
                                                }
                                                if ((var251 - var250 + 1) * (var253 - var252 + 1) >= 4) {
                                                    int var256 = class9.field141[var223][var250][var252];
                                                    class95.method1804(var222, 4, var250 * 128, var251 * 128 + 128, var252 * 128, var253 * 128 + 128, var256, var256);
                                                    for (int var257 = var250; var257 <= var251; var257++) {
                                                        for (int var258 = var252; var258 <= var253; var258++) {
                                                            Statics.field208[var223][var257][var258] &= ~var221;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method2900(true);
                            int var259 = class9.field135;
                            if (var259 > Statics.field30) {
                                var259 = Statics.field30;
                            }
                            if (var259 < Statics.field30 - 1) {
                                int var260 = Statics.field30 - 1;
                            }
                            if (field487) {
                                Statics.field545.method1947(class9.field135);
                            } else {
                                Statics.field545.method1947(0);
                            }
                            for (int var261 = 0; var261 < 104; var261++) {
                                for (int var262 = 0; var262 < 104; var262++) {
                                    method149(var261, var262);
                                }
                            }
                            Statics.method25();
                            for (class22 var263 = (class22) field623.method3313(); var263 != null; var263 = (class22) field623.method3292()) {
                                if (var263.field362 == -1) {
                                    var263.field360 = 0;
                                    method855(var263);
                                } else {
                                    var263.method3319();
                                }
                            }
                            class32.field821.method3226();
                            if (Statics.field1275 != null) {
                                field526.method2265(93);
                                field526.method2400(1057001181);
                            }
                            if (!field547) {
                                int var264 = (Statics.field1345 - 6) / 8;
                                int var265 = (Statics.field1345 + 6) / 8;
                                int var266 = (Statics.field15 - 6) / 8;
                                int var267 = (Statics.field15 + 6) / 8;
                                for (int var268 = var264 - 1; var268 <= var265 + 1; var268++) {
                                    for (int var269 = var266 - 1; var269 <= var267 + 1; var269++) {
                                        if (var268 < var264 || var268 > var265 || var269 < var266 || var269 > var267) {
                                            Statics.field275.method2941("m" + var268 + "_" + var269);
                                            Statics.field275.method2941("l" + var268 + "_" + var269);
                                        }
                                    }
                                }
                            }
                            method67(30);
                            Statics.method25();
                            Statics.field136 = (byte[][][]) null;
                            Statics.field137 = (byte[][][]) null;
                            Statics.field138 = (byte[][][]) null;
                            Statics.field139 = (byte[][][]) null;
                            Statics.field208 = (int[][][]) null;
                            Statics.field968 = (byte[][][]) null;
                            Statics.field1927 = (int[][]) null;
                            Statics.field147 = null;
                            Statics.field1306 = null;
                            Statics.field762 = null;
                            Statics.field766 = null;
                            Statics.field57 = null;
                            field526.method2265(41);
                            class73.method141();
                        } else {
                            field649 = 2;
                        }
                    } else {
                        field649 = 1;
                    }
                }
                if (field489 == 30) {
                    if (field736 > 1) {
                        field736--;
                    }
                    if (field492 > 0) {
                        field492--;
                    }
                    if (field604) {
                        field604 = false;
                        method787();
                    } else {
                        for (int var270 = 0; var270 < 100; var270++) {
                            boolean var271;
                            if (Statics.field578 == null) {
                                var271 = false;
                            } else {
                                label4013: {
                                    try {
                                        int var272 = Statics.field578.method1335();
                                        if (var272 == 0) {
                                            var271 = false;
                                            break label4013;
                                        }
                                        if (field533 == -1) {
                                            Statics.field578.method1355(field619.field2039, 0, 1);
                                            field619.field2037 = 0;
                                            field533 = field619.method2268();
                                            field529 = class165.field2776[field533];
                                            var272--;
                                        }
                                        if (field529 == -1) {
                                            if (var272 <= 0) {
                                                var271 = false;
                                                break label4013;
                                            }
                                            Statics.field578.method1355(field619.field2039, 0, 1);
                                            field529 = field619.field2039[0] & 0xFF;
                                            var272--;
                                        }
                                        if (field529 == -2) {
                                            if (var272 <= 1) {
                                                var271 = false;
                                                break label4013;
                                            }
                                            Statics.field578.method1355(field619.field2039, 0, 2);
                                            field619.field2037 = 0;
                                            field529 = field619.method2413();
                                            var272 -= 2;
                                        }
                                        if (var272 < field529) {
                                            var271 = false;
                                            break label4013;
                                        }
                                        field619.field2037 = 0;
                                        Statics.field578.method1355(field619.field2039, 0, field529);
                                        field521 = 0;
                                        field586 = field535;
                                        field535 = field534;
                                        field534 = field533;
                                        if (field533 == 216) {
                                            for (int var273 = 0; var273 < Statics.field1043; var273++) {
                                                class42 var274 = (class42) class42.field1044.method3223((long) var273);
                                                class42 var275;
                                                if (var274 == null) {
                                                    byte[] var276 = Statics.field1047.method2932(16, var273);
                                                    class42 var277 = new class42();
                                                    if (var276 != null) {
                                                        var277.method867(new class127(var276));
                                                    }
                                                    class42.field1044.method3225(var277, (long) var273);
                                                    var275 = var277;
                                                } else {
                                                    var275 = var274;
                                                }
                                                if (var275 != null && var275.field1045 == 0) {
                                                    class159.field2710[var273] = 0;
                                                    class159.field2709[var273] = 0;
                                                }
                                            }
                                            method228();
                                            field506 += 32;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 225) {
                                            int var279 = field619.method2416();
                                            class4 var280 = (class4) field663.method3268((long) var279);
                                            if (var280 != null) {
                                                method809(var280, true);
                                            }
                                            if (field652 != null) {
                                                method64(field652);
                                                field652 = null;
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 173) {
                                            int var281 = field619.method2413();
                                            class19 var282 = (class19) class19.field293.method3268((long) var281);
                                            if (var282 != null) {
                                                var282.method3319();
                                            }
                                            field579[++field613 - 1 & 0x1F] = var281 & 0x7FFF;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 67) {
                                            String var283 = field619.method2419();
                                            if (var283.endsWith(":tradereq:")) {
                                                String var284 = var283.substring(0, var283.indexOf(":"));
                                                boolean var285 = false;
                                                if (method144(var284)) {
                                                    var285 = true;
                                                }
                                                if (!var285 && field607 == 0) {
                                                    Statics.method3033(4, var284, class134.field2222);
                                                }
                                            } else if (var283.endsWith(":duelreq:")) {
                                                String var286 = var283.substring(0, var283.indexOf(":"));
                                                boolean var287 = false;
                                                if (method144(var286)) {
                                                    var287 = true;
                                                }
                                                if (!var287 && field607 == 0) {
                                                    Statics.method3033(8, var286, class134.field2223);
                                                }
                                            } else if (var283.endsWith(":chalreq:")) {
                                                String var288 = var283.substring(0, var283.indexOf(":"));
                                                boolean var289 = false;
                                                if (method144(var288)) {
                                                    var289 = true;
                                                }
                                                if (!var289 && field607 == 0) {
                                                    String var290 = var283.substring(var283.indexOf(":") + 1, var283.length() - 9);
                                                    Statics.method3033(8, var288, var290);
                                                }
                                            } else if (var283.endsWith(":assistreq:")) {
                                                String var291 = var283.substring(0, var283.indexOf(":"));
                                                boolean var292 = false;
                                                if (method144(var291)) {
                                                    var292 = true;
                                                }
                                                if (!var292 && field607 == 0) {
                                                    Statics.method3033(10, var291, "");
                                                }
                                            } else if (var283.endsWith(":clan:")) {
                                                String var293 = var283.substring(0, var283.indexOf(":clan:"));
                                                Statics.method3033(11, "", var293);
                                            } else if (var283.endsWith(":trade:")) {
                                                String var294 = var283.substring(0, var283.indexOf(":trade:"));
                                                if (field607 == 0) {
                                                    Statics.method3033(12, "", var294);
                                                }
                                            } else if (var283.endsWith(":assist:")) {
                                                String var295 = var283.substring(0, var283.indexOf(":assist:"));
                                                if (field607 == 0) {
                                                    Statics.method3033(13, "", var295);
                                                }
                                            } else {
                                                Statics.method3033(0, "", var283);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 124) {
                                            int var296 = field619.method2434();
                                            int var297 = field619.method2434();
                                            String var298 = field619.method2419();
                                            if (var297 >= 1 && var297 <= 8) {
                                                if (var298.equalsIgnoreCase("null")) {
                                                    var298 = null;
                                                }
                                                field552[var297 - 1] = var298;
                                                field620[var297 - 1] = var296 == 0;
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 19) {
                                            int var299 = field619.method2416();
                                            class158 var300 = class158.method139(var299);
                                            var300.field2623 = 3;
                                            var300.field2625 = Statics.field1358.field32.method3144();
                                            method64(var300);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 54) {
                                            Statics.field265 = field619.method2457();
                                            Statics.field2321 = field619.method2535();
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 190) {
                                            int var301 = field619.method2453();
                                            Statics.field508 = Statics.field2466.method1441(var301);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 49) {
                                            field619.field2037 += 28;
                                            if (field619.method2431()) {
                                                class116 var302 = field619;
                                                int var303 = field619.field2037 - 28;
                                                if (class82.field1453 != null) {
                                                    try {
                                                        class82.field1453.method569(0L);
                                                        class82.field1453.method578(var302.field2039, var303, 24);
                                                    } catch (Exception var665) {
                                                    }
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 33) {
                                            int var305 = field619.method2453();
                                            int var306 = field619.method2490();
                                            class158 var307 = class158.method139(var305);
                                            if (var307 != null && var307.field2593 == 0) {
                                                if (var306 > var307.field2697 - var307.field2582) {
                                                    var306 = var307.field2697 - var307.field2582;
                                                }
                                                if (var306 < 0) {
                                                    var306 = 0;
                                                }
                                                if (var307.field2605 != var306) {
                                                    var307.field2605 = var306;
                                                    method64(var307);
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 209) {
                                            method143(false);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 217) {
                                            int var308 = field619.method2435();
                                            boolean var309 = field619.method2411() == 1;
                                            class158 var310 = class158.method139(var308);
                                            if (var310.field2603 != var309) {
                                                var310.field2603 = var309;
                                                method64(var310);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 66) {
                                            String var311 = field619.method2419();
                                            long var312 = field619.method2417();
                                            long var314 = (long) field619.method2413();
                                            long var316 = (long) field619.method2415();
                                            int var318 = field619.method2411();
                                            long var319 = (var314 << 32) + var316;
                                            boolean var321 = false;
                                            for (int var322 = 0; var322 < 100; var322++) {
                                                if (field707[var322] == var319) {
                                                    var321 = true;
                                                    break;
                                                }
                                            }
                                            if (var318 <= 1 && method144(var311)) {
                                                var321 = true;
                                            }
                                            if (!var321 && field607 == 0) {
                                                field707[field708] = var319;
                                                field708 = (field708 + 1) % 100;
                                                class116 var323 = field619;
                                                String var327;
                                                try {
                                                    int var324 = var323.method2424();
                                                    if (var324 > 32767) {
                                                        var324 = 32767;
                                                    }
                                                    byte[] var325 = new byte[var324];
                                                    var323.field2037 += Statics.field2832.method2323(var323.field2039, var323.field2037, var325, 0, var324);
                                                    String var326 = class149.method215(var325, 0, var324);
                                                    var327 = var326;
                                                } catch (Exception var664) {
                                                    var327 = "Cabbage";
                                                }
                                                String var330 = class185.method3350(Statics.method1442(var327));
                                                if (var318 == 2 || var318 == 3) {
                                                    method39(9, class2.method1236(1) + var311, var330, Statics.method1978(var312));
                                                } else if (var318 == 1) {
                                                    method39(9, class2.method1236(0) + var311, var330, Statics.method1978(var312));
                                                } else {
                                                    method39(9, var311, var330, Statics.method1978(var312));
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 181) {
                                            field486 = 0;
                                            field611 = 0;
                                            method2146();
                                            while (field619.method2288(field529) >= 27) {
                                                int var331 = field619.method2267(15);
                                                if (var331 == 32767) {
                                                    break;
                                                }
                                                boolean var332 = false;
                                                if (field522[var331] == null) {
                                                    field522[var331] = new class25();
                                                    var332 = true;
                                                }
                                                class25 var333 = field522[var331];
                                                field639[++field523 - 1] = var331;
                                                var333.field465 = field491;
                                                int var334 = field621[field619.method2267(3)];
                                                if (var332) {
                                                    var333.field467 = var333.field476 = var334;
                                                }
                                                var333.field402 = class31.method246(field619.method2267(14));
                                                int var335 = field619.method2267(5);
                                                if (var335 > 15) {
                                                    var335 -= 32;
                                                }
                                                int var336 = field619.method2267(1);
                                                int var337 = field619.method2267(1);
                                                if (var337 == 1) {
                                                    field612[++field611 - 1] = var331;
                                                }
                                                int var338 = field619.method2267(5);
                                                if (var338 > 15) {
                                                    var338 -= 32;
                                                }
                                                var333.field423 = var333.field402.field790;
                                                var333.field440 = var333.field402.field811;
                                                if (var333.field440 == 0) {
                                                    var333.field476 = 0;
                                                }
                                                var333.field427 = var333.field402.field794;
                                                var333.field428 = var333.field402.field803;
                                                var333.field425 = var333.field402.field796;
                                                var333.field419 = var333.field402.field816;
                                                var333.field424 = var333.field402.field791;
                                                var333.field469 = var333.field402.field792;
                                                var333.field421 = var333.field402.field793;
                                                var333.method262(Statics.field1358.field471[0] + var335, Statics.field1358.field472[0] + var338, var336 == 1);
                                            }
                                            field619.method2269();
                                            method73();
                                            for (int var339 = 0; var339 < field486; var339++) {
                                                int var340 = field617[var339];
                                                if (field491 != field522[var340].field465) {
                                                    field522[var340].field402 = null;
                                                    field522[var340] = null;
                                                }
                                            }
                                            if (field529 != field619.field2037) {
                                                throw new RuntimeException(field619.field2037 + class2.field26 + field529);
                                            }
                                            for (int var341 = 0; var341 < field523; var341++) {
                                                if (field522[field639[var341]] == null) {
                                                    throw new RuntimeException(var341 + class2.field26 + field523);
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 176) {
                                            int var342 = field619.method2453();
                                            int var343 = field619.method2416();
                                            int var344 = field619.method2445();
                                            if (var344 == 65535) {
                                                var344 = -1;
                                            }
                                            class158 var345 = class158.method139(var343);
                                            if (var345.field2590) {
                                                var345.field2695 = var344;
                                                var345.field2624 = var342;
                                                class40 var347 = class40.method44(var344);
                                                var345.field2631 = var347.field1002;
                                                var345.field2632 = var347.field1003;
                                                var345.field2633 = var347.field1030;
                                                var345.field2629 = var347.field1005;
                                                var345.field2630 = var347.field1006;
                                                var345.field2619 = var347.field1026;
                                                if (var345.field2600 > 0) {
                                                    var345.field2619 = var345.field2619 * 32 / var345.field2600;
                                                }
                                                method64(var345);
                                            } else {
                                                if (var344 == -1) {
                                                    var345.field2623 = 0;
                                                    field533 = -1;
                                                    var271 = true;
                                                    break label4013;
                                                }
                                                class40 var346 = class40.method44(var344);
                                                var345.field2623 = 4;
                                                var345.field2625 = var344;
                                                var345.field2631 = var346.field1002;
                                                var345.field2632 = var346.field1003;
                                                var345.field2619 = var346.field1026 * 100 / var342;
                                                method64(var345);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 160) {
                                            String var348 = field619.method2419();
                                            int var349 = field619.method2416();
                                            class158 var350 = class158.method139(var349);
                                            if (!var348.equals(var350.field2638)) {
                                                var350.field2638 = var348;
                                                method64(var350);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 208) {
                                            String var351 = field619.method2419();
                                            Object[] var352 = new Object[var351.length() + 1];
                                            for (int var353 = var351.length() - 1; var353 >= 0; var353--) {
                                                if (var351.charAt(var353) == 's') {
                                                    var352[var353 + 1] = field619.method2419();
                                                } else {
                                                    var352[var353 + 1] = Integer.valueOf(field619.method2416());
                                                }
                                            }
                                            var352[0] = Integer.valueOf(field619.method2416());
                                            class1 var354 = new class1();
                                            var354.field8 = var352;
                                            class26.method1269(var354);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 248) {
                                            String var355 = field619.method2419();
                                            long var356 = (long) field619.method2413();
                                            long var358 = (long) field619.method2415();
                                            int var360 = field619.method2411();
                                            long var361 = (var356 << 32) + var358;
                                            boolean var363 = false;
                                            for (int var364 = 0; var364 < 100; var364++) {
                                                if (field707[var364] == var361) {
                                                    var363 = true;
                                                    break;
                                                }
                                            }
                                            if (method144(var355)) {
                                                var363 = true;
                                            }
                                            if (!var363 && field607 == 0) {
                                                field707[field708] = var361;
                                                field708 = (field708 + 1) % 100;
                                                class116 var365 = field619;
                                                String var369;
                                                try {
                                                    int var366 = var365.method2424();
                                                    if (var366 > 32767) {
                                                        var366 = 32767;
                                                    }
                                                    byte[] var367 = new byte[var366];
                                                    var365.field2037 += Statics.field2832.method2323(var365.field2039, var365.field2037, var367, 0, var366);
                                                    String var368 = class149.method215(var367, 0, var366);
                                                    var369 = var368;
                                                } catch (Exception var663) {
                                                    var369 = "Cabbage";
                                                }
                                                String var372 = class185.method3350(Statics.method1442(var369));
                                                if (var360 == 2 || var360 == 3) {
                                                    Statics.method3033(7, class2.method1236(1) + var355, var372);
                                                } else if (var360 == 1) {
                                                    Statics.method3033(7, class2.method1236(0) + var355, var372);
                                                } else {
                                                    Statics.method3033(3, var355, var372);
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 224) {
                                            int var373 = field619.method2445();
                                            if (var373 == 65535) {
                                                var373 = -1;
                                            }
                                            if (var373 == -1 && !field681) {
                                                Statics.field2346.method2710();
                                                class138.field2345 = 1;
                                                Statics.field1518 = null;
                                            } else if (var373 != -1 && field724 != var373 && field682 != 0 && !field681) {
                                                class154 var374 = Statics.field514;
                                                int var375 = field682;
                                                class138.field2345 = 1;
                                                Statics.field1518 = var374;
                                                Statics.field2344 = var373;
                                                Statics.field2347 = 0;
                                                Statics.field155 = var375;
                                                Statics.field2715 = false;
                                                Statics.field2327 = 2;
                                            }
                                            field724 = var373;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 169) {
                                            int var376 = field619.method2502();
                                            int var377 = field619.method2413();
                                            if (var377 == 65535) {
                                                var377 = -1;
                                            }
                                            method1979(var377, var376);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 175) {
                                            field736 = field619.method2413() * 30;
                                            field668 = field538;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 116) {
                                            String var378 = field619.method2419();
                                            int var379 = field619.method2413();
                                            byte var380 = field619.method2475();
                                            boolean var381 = false;
                                            if (var380 == -128) {
                                                var381 = true;
                                            }
                                            if (var381) {
                                                if (Statics.field22 == 0) {
                                                    field533 = -1;
                                                    var271 = true;
                                                    break label4013;
                                                }
                                                boolean var382 = false;
                                                int var383;
                                                for (var383 = 0; var383 < Statics.field22 && (!Statics.field1530[var383].field123.equals(var378) || Statics.field1530[var383].field120 != var379); var383++) {
                                                }
                                                if (var383 < Statics.field22) {
                                                    while (var383 < Statics.field22 - 1) {
                                                        Statics.field1530[var383] = Statics.field1530[var383 + 1];
                                                        var383++;
                                                    }
                                                    Statics.field22--;
                                                    Statics.field1530[Statics.field22] = null;
                                                }
                                            } else {
                                                field619.method2419();
                                                class8 var384 = new class8();
                                                var384.field123 = var378;
                                                var384.field119 = class148.method38(var384.field123, Statics.field728);
                                                var384.field120 = var379;
                                                var384.field132 = var380;
                                                int var385;
                                                for (var385 = Statics.field22 - 1; var385 >= 0; var385--) {
                                                    int var386 = Statics.field1530[var385].field119.compareTo(var384.field123);
                                                    if (var386 == 0) {
                                                        Statics.field1530[var385].field120 = var379;
                                                        Statics.field1530[var385].field132 = var380;
                                                        if (var378.equals(Statics.field1358.field40)) {
                                                            Statics.field10 = var380;
                                                        }
                                                        field680 = field538;
                                                        field533 = -1;
                                                        var271 = true;
                                                        break label4013;
                                                    }
                                                    if (var386 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field22 >= Statics.field1530.length) {
                                                    field533 = -1;
                                                    var271 = true;
                                                    break label4013;
                                                }
                                                for (int var387 = Statics.field22 - 1; var387 > var385; var387--) {
                                                    Statics.field1530[var387 + 1] = Statics.field1530[var387];
                                                }
                                                if (Statics.field22 == 0) {
                                                    Statics.field1530 = new class8[100];
                                                }
                                                Statics.field1530[var385 + 1] = var384;
                                                Statics.field22++;
                                                if (var378.equals(Statics.field1358.field40)) {
                                                    Statics.field10 = var380;
                                                }
                                            }
                                            field680 = field538;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 123) {
                                            for (int var388 = 0; var388 < class159.field2709.length; var388++) {
                                                if (class159.field2710[var388] != class159.field2709[var388]) {
                                                    class159.field2709[var388] = class159.field2710[var388];
                                                    method244(var388);
                                                    field672[++field506 - 1 & 0x1F] = var388;
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 6) {
                                            if (field648 != -1) {
                                                method3(field648, 0);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 146) {
                                            for (int var389 = 0; var389 < field608.length; var389++) {
                                                if (field608[var389] != null) {
                                                    field608[var389].field452 = -1;
                                                }
                                            }
                                            for (int var390 = 0; var390 < field522.length; var390++) {
                                                if (field522[var390] != null) {
                                                    field522[var390].field452 = -1;
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 68) {
                                            int var391 = field619.method2435();
                                            int var392 = field619.method2443();
                                            class159.field2710[var392] = var391;
                                            if (class159.field2709[var392] != var391) {
                                                class159.field2709[var392] = var391;
                                                method244(var392);
                                            }
                                            field672[++field506 - 1 & 0x1F] = var392;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 139) {
                                            int var393 = field619.method2478();
                                            int var394 = field619.method2447();
                                            int var395 = field619.method2447();
                                            class158 var396 = class158.method139(var393);
                                            int var397 = var396.field2598 + var395;
                                            int var398 = var396.field2599 + var394;
                                            if (var396.field2644 != var397 || var396.field2597 != var398) {
                                                var396.field2644 = var397;
                                                var396.field2597 = var398;
                                                method64(var396);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 218) {
                                            field599 = field619.method2411();
                                            if (field599 == 1) {
                                                field500 = field619.method2413();
                                            }
                                            if (field599 >= 2 && field599 <= 6) {
                                                if (field599 == 2) {
                                                    field746 = 64;
                                                    field723 = 64;
                                                }
                                                if (field599 == 3) {
                                                    field746 = 0;
                                                    field723 = 64;
                                                }
                                                if (field599 == 4) {
                                                    field746 = 128;
                                                    field723 = 64;
                                                }
                                                if (field599 == 5) {
                                                    field746 = 64;
                                                    field723 = 0;
                                                }
                                                if (field599 == 6) {
                                                    field746 = 64;
                                                    field723 = 128;
                                                }
                                                field599 = 2;
                                                field527 = field619.method2413();
                                                field537 = field619.method2413();
                                                field740 = field619.method2411();
                                            }
                                            if (field599 == 10) {
                                                field501 = field619.method2413();
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 63) {
                                            Statics.field265 = field619.method2457();
                                            Statics.field2321 = field619.method2434();
                                            while (field619.field2037 < field529) {
                                                field533 = field619.method2411();
                                                method721();
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 28) {
                                            byte var399 = field619.method2503();
                                            int var400 = field619.method2490();
                                            class159.field2710[var400] = var399;
                                            if (class159.field2709[var400] != var399) {
                                                class159.field2709[var400] = var399;
                                                method244(var400);
                                            }
                                            field672[++field506 - 1 & 0x1F] = var400;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 96) {
                                            int var401 = field619.method2478();
                                            int var402 = field619.method2445();
                                            int var403 = field619.method2457();
                                            class4 var404 = (class4) field663.method3268((long) var401);
                                            if (var404 != null) {
                                                method809(var404, var404.field64 != var402);
                                            }
                                            class4 var405 = new class4();
                                            var405.field64 = var402;
                                            var405.field55 = var403;
                                            field663.method3269(var405, (long) var401);
                                            method134(var402);
                                            class26.method2(var402);
                                            class158 var406 = class158.method139(var401);
                                            if (var406 != null) {
                                                method64(var406);
                                            }
                                            if (field652 != null) {
                                                method64(field652);
                                                field652 = null;
                                            }
                                            method166();
                                            if (field648 != -1) {
                                                method3(field648, 1);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 24) {
                                            int var407 = field619.method2457();
                                            int var408 = field619.method2535();
                                            int var409 = field619.method2457();
                                            Statics.field30 = var409 >> 1;
                                            Statics.field1358.method262(var407, var408, (var409 & 0x1) == 1);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 150) {
                                            int var410 = field529 + field619.field2037;
                                            int var411 = field619.method2413();
                                            int var412 = field619.method2413();
                                            if (field648 != var411) {
                                                field648 = var411;
                                                method134(field648);
                                                class26.method2(field648);
                                                for (int var413 = 0; var413 < 100; var413++) {
                                                    field691[var413] = true;
                                                }
                                            }
                                            while (var412-- > 0) {
                                                int var414 = field619.method2416();
                                                int var415 = field619.method2413();
                                                int var416 = field619.method2411();
                                                class4 var417 = (class4) field663.method3268((long) var414);
                                                if (var417 != null && var417.field64 != var415) {
                                                    method809(var417, true);
                                                    var417 = null;
                                                }
                                                if (var417 == null) {
                                                    class4 var418 = new class4();
                                                    var418.field64 = var415;
                                                    var418.field55 = var416;
                                                    field663.method3269(var418, (long) var414);
                                                    method134(var415);
                                                    class26.method2(var415);
                                                    class158 var419 = class158.method139(var414);
                                                    if (var419 != null) {
                                                        method64(var419);
                                                    }
                                                    if (field652 != null) {
                                                        method64(field652);
                                                        field652 = null;
                                                    }
                                                    method166();
                                                    if (field648 != -1) {
                                                        method3(field648, 1);
                                                    }
                                                    var417 = var418;
                                                }
                                                var417.field56 = true;
                                            }
                                            for (class4 var421 = (class4) field663.method3271(); var421 != null; var421 = (class4) field663.method3272()) {
                                                if (var421.field56) {
                                                    var421.field56 = false;
                                                } else {
                                                    method809(var421, true);
                                                }
                                            }
                                            field645 = new class175(512);
                                            while (field619.field2037 < var410) {
                                                int var422 = field619.method2416();
                                                int var423 = field619.method2413();
                                                int var424 = field619.method2413();
                                                int var425 = field619.method2416();
                                                for (int var426 = var423; var426 <= var424; var426++) {
                                                    long var427 = ((long) var422 << 32) + (long) var426;
                                                    field645.method3269(new class171(var425), var427);
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 40) {
                                            method228();
                                            field609 = field619.method2411();
                                            field668 = field538;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 182) {
                                            field722 = field619.method2411();
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 18) {
                                            method132();
                                            field533 = -1;
                                            var271 = false;
                                            break label4013;
                                        }
                                        if (field533 == 205) {
                                            method2649();
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 74) {
                                            int var429 = field619.method2490();
                                            int var430 = field619.method2490();
                                            int var431 = field619.method2453();
                                            class158 var432 = class158.method139(var431);
                                            var432.field2635 = (var429 << 16) + var430;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 239) {
                                            field680 = field538;
                                            if (field529 == 0) {
                                                field713 = null;
                                                field640 = null;
                                                Statics.field22 = 0;
                                                Statics.field1530 = null;
                                                field533 = -1;
                                                var271 = true;
                                                break label4013;
                                            }
                                            field640 = field619.method2419();
                                            long var433 = field619.method2417();
                                            long var435 = var433;
                                            String var437;
                                            if (var433 <= 0L || var433 >= 6582952005840035281L) {
                                                var437 = null;
                                            } else if (var433 % 37L == 0L) {
                                                var437 = null;
                                            } else {
                                                int var438 = 0;
                                                for (long var439 = var433; var439 != 0L; var439 /= 37L) {
                                                    var438++;
                                                }
                                                StringBuilder var441 = new StringBuilder(var438);
                                                while (var435 != 0L) {
                                                    long var442 = var435;
                                                    var435 /= 37L;
                                                    var441.append(class146.field2449[(int) (var442 - var435 * 37L)]);
                                                }
                                                var437 = var441.reverse().toString();
                                            }
                                            field713 = var437;
                                            Statics.field1328 = field619.method2475();
                                            int var444 = field619.method2411();
                                            if (var444 == 255) {
                                                field533 = -1;
                                                var271 = true;
                                                break label4013;
                                            }
                                            Statics.field22 = var444;
                                            class8[] var445 = new class8[100];
                                            for (int var446 = 0; var446 < Statics.field22; var446++) {
                                                var445[var446] = new class8();
                                                var445[var446].field123 = field619.method2419();
                                                var445[var446].field119 = class148.method38(var445[var446].field123, Statics.field728);
                                                var445[var446].field120 = field619.method2413();
                                                var445[var446].field132 = field619.method2475();
                                                field619.method2419();
                                                if (var445[var446].field123.equals(Statics.field1358.field40)) {
                                                    Statics.field10 = var445[var446].field132;
                                                }
                                            }
                                            boolean var447 = false;
                                            int var448 = Statics.field22;
                                            while (var448 > 0) {
                                                boolean var449 = true;
                                                var448--;
                                                for (int var450 = 0; var450 < var448; var450++) {
                                                    if (var445[var450].field119.compareTo(var445[var450 + 1].field119) > 0) {
                                                        class8 var451 = var445[var450];
                                                        var445[var450] = var445[var450 + 1];
                                                        var445[var450 + 1] = var451;
                                                        var449 = false;
                                                    }
                                                }
                                                if (var449) {
                                                    break;
                                                }
                                            }
                                            Statics.field1530 = var445;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 233) {
                                            Statics.field2321 = field619.method2457();
                                            Statics.field265 = field619.method2457();
                                            for (int var452 = Statics.field265; var452 < Statics.field265 + 8; var452++) {
                                                for (int var453 = Statics.field2321; var453 < Statics.field2321 + 8; var453++) {
                                                    if (field622[Statics.field30][var452][var453] != null) {
                                                        field622[Statics.field30][var452][var453] = null;
                                                        method149(var452, var453);
                                                    }
                                                }
                                            }
                                            for (class22 var454 = (class22) field623.method3313(); var454 != null; var454 = (class22) field623.method3292()) {
                                                if (var454.field352 >= Statics.field265 && var454.field352 < Statics.field265 + 8 && var454.field353 >= Statics.field2321 && var454.field353 < Statics.field2321 + 8 && Statics.field30 == var454.field354) {
                                                    var454.field362 = 0;
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 61) {
                                            field561 = true;
                                            Statics.field1401 = field619.method2411();
                                            Statics.field2550 = field619.method2411();
                                            Statics.field61 = field619.method2413();
                                            Statics.field1307 = field619.method2411();
                                            Statics.field1283 = field619.method2411();
                                            if (Statics.field1283 >= 100) {
                                                int var455 = Statics.field1401 * 128 + 64;
                                                int var456 = Statics.field2550 * 128 + 64;
                                                int var457 = method1492(var455, var456, Statics.field30) - Statics.field61;
                                                int var458 = var455 - Statics.field1626;
                                                int var459 = var457 - Statics.field1793;
                                                int var460 = var456 - Statics.field1981;
                                                int var461 = (int) Math.sqrt((double) (var458 * var458 + var460 * var460));
                                                Statics.field1040 = (int) (Math.atan2((double) var459, (double) var461) * 325.949D) & 0x7FF;
                                                Statics.field151 = (int) (Math.atan2((double) var458, (double) var460) * -325.949D) & 0x7FF;
                                                if (Statics.field1040 < 128) {
                                                    Statics.field1040 = 128;
                                                }
                                                if (Statics.field1040 > 383) {
                                                    Statics.field1040 = 383;
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 25) {
                                            int var462 = field619.method2445();
                                            field648 = var462;
                                            method134(var462);
                                            class26.method2(field648);
                                            for (int var463 = 0; var463 < 100; var463++) {
                                                field691[var463] = true;
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 232) {
                                            method228();
                                            field654 = field619.method2414();
                                            field668 = field538;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 47) {
                                            int var464 = field619.method2445();
                                            if (var464 == 65535) {
                                                var464 = -1;
                                            }
                                            int var465 = field619.method2443();
                                            if (var465 == 65535) {
                                                var465 = -1;
                                            }
                                            int var466 = field619.method2453();
                                            int var467 = field619.method2416();
                                            for (int var468 = var465; var468 <= var464; var468++) {
                                                long var469 = ((long) var467 << 32) + (long) var468;
                                                class179 var471 = field645.method3268(var469);
                                                if (var471 != null) {
                                                    var471.method3319();
                                                }
                                                field645.method3269(new class171(var466), var469);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 13) {
                                            int var472 = field619.method2453();
                                            int var473 = field619.method2443();
                                            class158 var474 = class158.method139(var472);
                                            if (var474.field2623 != 1 || var474.field2625 != var473) {
                                                var474.field2623 = 1;
                                                var474.field2625 = var473;
                                                method64(var474);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 75) {
                                            field632 = 0;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 191) {
                                            field555 = field619.method2411();
                                            field716 = field619.method2411();
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 108 || field533 == 32 || field533 == 7 || field533 == 15 || field533 == 78 || field533 == 242 || field533 == 251 || field533 == 211 || field533 == 20 || field533 == 100 || field533 == 56) {
                                            method721();
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 62) {
                                            int var475 = field619.method2446();
                                            int var476 = field619.method2435();
                                            class158 var477 = class158.method139(var476);
                                            if (var477.field2627 != var475 || var475 == -1) {
                                                var477.field2627 = var475;
                                                var477.field2616 = 0;
                                                var477.field2698 = 0;
                                                method64(var477);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 142) {
                                            field561 = false;
                                            for (int var478 = 0; var478 < 5; var478++) {
                                                field735[var478] = false;
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 135) {
                                            method143(true);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 112) {
                                            int var479 = field619.method2413();
                                            int var480 = field619.method2411();
                                            int var481 = field619.method2413();
                                            if (field726 != 0 && var480 != 0 && field481 < 50) {
                                                field711[field481] = var479;
                                                field730[field481] = var480;
                                                field731[field481] = var481;
                                                field733[field481] = null;
                                                field556[field481] = 0;
                                                field481++;
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 114) {
                                            Statics.field1394 = class137.method224(field619.method2411());
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 76) {
                                            int var485 = field619.method2411();
                                            int var486 = field619.method2411();
                                            int var487 = field619.method2411();
                                            int var488 = field619.method2411();
                                            field735[var485] = true;
                                            field749[var485] = var486;
                                            field737[var485] = var487;
                                            field738[var485] = var488;
                                            field671[var485] = 0;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 23) {
                                            int var489 = field619.method2445();
                                            int var490 = field619.method2453();
                                            int var491 = var489 >> 10 & 0x1F;
                                            int var492 = var489 >> 5 & 0x1F;
                                            int var493 = var489 & 0x1F;
                                            int var494 = (var493 << 3) + (var491 << 19) + (var492 << 11);
                                            class158 var495 = class158.method139(var490);
                                            if (var495.field2608 != var494) {
                                                var495.field2608 = var494;
                                                method64(var495);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 36) {
                                            int var496 = field619.method2478();
                                            class158 var497 = class158.method139(var496);
                                            for (int var498 = 0; var498 < var497.field2649.length; var498++) {
                                                var497.field2649[var498] = -1;
                                                var497.field2649[var498] = 0;
                                            }
                                            method64(var497);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 111) {
                                            field561 = true;
                                            Statics.field124 = field619.method2411();
                                            Statics.field1820 = field619.method2411();
                                            Statics.field2010 = field619.method2413();
                                            Statics.field754 = field619.method2411();
                                            Statics.field52 = field619.method2411();
                                            if (Statics.field52 >= 100) {
                                                Statics.field1626 = Statics.field124 * 128 + 64;
                                                Statics.field1981 = Statics.field1820 * 128 + 64;
                                                Statics.field1793 = method1492(Statics.field1626, Statics.field1981, Statics.field30) - Statics.field2010;
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 162) {
                                            class182.method129(field619, field529);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 154) {
                                            while (field619.field2037 < field529) {
                                                boolean var499 = field619.method2411() == 1;
                                                String var500 = field619.method2419();
                                                String var501 = field619.method2419();
                                                int var502 = field619.method2413();
                                                int var503 = field619.method2411();
                                                int var504 = field619.method2411();
                                                boolean var505 = (var504 & 0x2) != 0;
                                                boolean var506 = (var504 & 0x1) != 0;
                                                if (var502 > 0) {
                                                    field619.method2419();
                                                    field619.method2411();
                                                    field619.method2416();
                                                }
                                                field619.method2419();
                                                for (int var507 = 0; var507 < field705; var507++) {
                                                    class23 var508 = field742[var507];
                                                    if (var499) {
                                                        if (var501.equals(var508.field372)) {
                                                            var508.field372 = var500;
                                                            var508.field371 = var501;
                                                            var500 = null;
                                                            break;
                                                        }
                                                    } else if (var500.equals(var508.field372)) {
                                                        if (var508.field375 != var502) {
                                                            boolean var509 = true;
                                                            for (class28 var510 = (class28) field743.method3262(); var510 != null; var510 = (class28) field743.method3255()) {
                                                                if (var510.field752.equals(var500)) {
                                                                    if (var502 != 0 && var510.field753 == 0) {
                                                                        var510.method3317();
                                                                        var509 = false;
                                                                    } else if (var502 == 0 && var510.field753 != 0) {
                                                                        var510.method3317();
                                                                        var509 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var509) {
                                                                field743.method3253(new class28(var500, var502));
                                                            }
                                                            var508.field375 = var502;
                                                        }
                                                        var508.field371 = var501;
                                                        var508.field370 = var503;
                                                        var508.field373 = var505;
                                                        var508.field374 = var506;
                                                        var500 = null;
                                                        break;
                                                    }
                                                }
                                                if (var500 != null && field705 < 400) {
                                                    class23 var511 = new class23();
                                                    field742[field705] = var511;
                                                    var511.field372 = var500;
                                                    var511.field371 = var501;
                                                    var511.field375 = var502;
                                                    var511.field370 = var503;
                                                    var511.field373 = var505;
                                                    var511.field374 = var506;
                                                    field705++;
                                                }
                                            }
                                            field741 = 2;
                                            field667 = field538;
                                            boolean var512 = false;
                                            int var513 = field705;
                                            while (var513 > 0) {
                                                boolean var514 = true;
                                                var513--;
                                                for (int var515 = 0; var515 < var513; var515++) {
                                                    boolean var516 = false;
                                                    class23 var517 = field742[var515];
                                                    class23 var518 = field742[var515 + 1];
                                                    if (field546 != var517.field375 && field546 == var518.field375) {
                                                        var516 = true;
                                                    }
                                                    if (!var516 && var517.field375 == 0 && var518.field375 != 0) {
                                                        var516 = true;
                                                    }
                                                    if (!var516 && !var517.field373 && var518.field373) {
                                                        var516 = true;
                                                    }
                                                    if (!var516 && !var517.field374 && var518.field374) {
                                                        var516 = true;
                                                    }
                                                    if (var516) {
                                                        class23 var519 = field742[var515];
                                                        field742[var515] = field742[var515 + 1];
                                                        field742[var515 + 1] = var519;
                                                        var514 = false;
                                                    }
                                                }
                                                if (var514) {
                                                    break;
                                                }
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 93) {
                                            int var520 = field619.method2445();
                                            int var521 = field619.method2413();
                                            int var522 = field619.method2416();
                                            int var523 = field619.method2490();
                                            class158 var524 = class158.method139(var522);
                                            if (var524.field2631 != var523 || var524.field2632 != var521 || var524.field2619 != var520) {
                                                var524.field2631 = var523;
                                                var524.field2632 = var521;
                                                var524.field2619 = var520;
                                                method64(var524);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 184) {
                                            while (field619.field2037 < field529) {
                                                int var525 = field619.method2411();
                                                boolean var526 = (var525 & 0x1) == 1;
                                                String var527 = field619.method2419();
                                                String var528 = field619.method2419();
                                                field619.method2419();
                                                for (int var529 = 0; var529 < field638; var529++) {
                                                    class11 var530 = field739[var529];
                                                    if (var526) {
                                                        if (var528.equals(var530.field197)) {
                                                            var530.field197 = var527;
                                                            var530.field196 = var528;
                                                            var527 = null;
                                                            break;
                                                        }
                                                    } else if (var527.equals(var530.field197)) {
                                                        var530.field197 = var527;
                                                        var530.field196 = var528;
                                                        var527 = null;
                                                        break;
                                                    }
                                                }
                                                if (var527 != null && field638 < 400) {
                                                    class11 var531 = new class11();
                                                    field739[field638] = var531;
                                                    var531.field197 = var527;
                                                    var531.field196 = var528;
                                                    field638++;
                                                }
                                            }
                                            field667 = field538;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 179) {
                                            int var532 = field619.method2416();
                                            int var533 = field619.method2413();
                                            if (var532 < -70000) {
                                                var533 += 32768;
                                            }
                                            class158 var534;
                                            if (var532 >= 0) {
                                                var534 = class158.method139(var532);
                                            } else {
                                                var534 = null;
                                            }
                                            while (field619.field2037 < field529) {
                                                int var535 = field619.method2424();
                                                int var536 = field619.method2413();
                                                int var537 = 0;
                                                if (var536 != 0) {
                                                    var537 = field619.method2411();
                                                    if (var537 == 255) {
                                                        var537 = field619.method2416();
                                                    }
                                                }
                                                if (var534 != null && var535 >= 0 && var535 < var534.field2649.length) {
                                                    var534.field2649[var535] = var536;
                                                    var534.field2634[var535] = var537;
                                                }
                                                class19.method688(var533, var535, var536 - 1, var537);
                                            }
                                            if (var534 != null) {
                                                method64(var534);
                                            }
                                            method228();
                                            field579[++field613 - 1 & 0x1F] = var533 & 0x7FFF;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 17) {
                                            int var538 = field619.method2416();
                                            int var539 = field619.method2413();
                                            if (var538 < -70000) {
                                                var539 += 32768;
                                            }
                                            class158 var540;
                                            if (var538 >= 0) {
                                                var540 = class158.method139(var538);
                                            } else {
                                                var540 = null;
                                            }
                                            if (var540 != null) {
                                                for (int var541 = 0; var541 < var540.field2649.length; var541++) {
                                                    var540.field2649[var541] = 0;
                                                    var540.field2634[var541] = 0;
                                                }
                                            }
                                            class19 var542 = (class19) class19.field293.method3268((long) var539);
                                            if (var542 != null) {
                                                for (int var543 = 0; var543 < var542.field292.length; var543++) {
                                                    var542.field292[var543] = -1;
                                                    var542.field294[var543] = 0;
                                                }
                                            }
                                            int var544 = field619.method2413();
                                            for (int var545 = 0; var545 < var544; var545++) {
                                                int var546 = field619.method2490();
                                                int var547 = field619.method2457();
                                                if (var547 == 255) {
                                                    var547 = field619.method2478();
                                                }
                                                if (var540 != null && var545 < var540.field2649.length) {
                                                    var540.field2649[var545] = var546;
                                                    var540.field2634[var545] = var547;
                                                }
                                                class19.method688(var539, var545, var546 - 1, var547);
                                            }
                                            if (var540 != null) {
                                                method64(var540);
                                            }
                                            method228();
                                            field579[++field613 - 1 & 0x1F] = var539 & 0x7FFF;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 159) {
                                            method228();
                                            int var548 = field619.method2435();
                                            int var549 = field619.method2411();
                                            int var550 = field619.method2434();
                                            field628[var550] = var548;
                                            field626[var550] = var549;
                                            field627[var550] = 1;
                                            for (int var551 = 0; var551 < 98; var551++) {
                                                if (var548 >= class130.field2043[var551]) {
                                                    field627[var550] = var551 + 2;
                                                }
                                            }
                                            field676[++field677 - 1 & 0x1F] = var550;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 194) {
                                            String var552 = field619.method2419();
                                            class116 var553 = field619;
                                            String var557;
                                            try {
                                                int var554 = var553.method2424();
                                                if (var554 > 32767) {
                                                    var554 = 32767;
                                                }
                                                byte[] var555 = new byte[var554];
                                                var553.field2037 += Statics.field2832.method2323(var553.field2039, var553.field2037, var555, 0, var554);
                                                String var556 = class149.method215(var555, 0, var554);
                                                var557 = var556;
                                            } catch (Exception var662) {
                                                var557 = "Cabbage";
                                            }
                                            String var560 = class185.method3350(Statics.method1442(var557));
                                            Statics.method3033(6, var552, var560);
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 105) {
                                            field741 = 1;
                                            field667 = field538;
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        if (field533 == 132) {
                                            int var561 = field619.method2413();
                                            int var562 = field619.method2435();
                                            class158 var563 = class158.method139(var562);
                                            if (var563.field2623 != 2 || var563.field2625 != var561) {
                                                var563.field2623 = 2;
                                                var563.field2625 = var561;
                                                method64(var563);
                                            }
                                            field533 = -1;
                                            var271 = true;
                                            break label4013;
                                        }
                                        class80.method252("" + field533 + class2.field26 + field535 + class2.field26 + field586 + class2.field26 + field529, (Throwable) null);
                                        method132();
                                    } catch (IOException var669) {
                                        method787();
                                    } catch (Exception var670) {
                                        String var566 = "" + field533 + class2.field26 + field535 + class2.field26 + field586 + class2.field26 + field529 + class2.field26 + (Statics.field287 + Statics.field1358.field471[0]) + class2.field26 + (Statics.field364 + Statics.field1358.field472[0]) + class2.field26;
                                        for (int var567 = 0; var567 < field529 && var567 < 50; var567++) {
                                            var566 = var566 + field619.field2039[var567] + class2.field26;
                                        }
                                        class80.method252(var566, var670);
                                        method132();
                                    }
                                    var271 = true;
                                }
                            }
                            if (!var271) {
                                break;
                            }
                        }
                        if (field489 == 30) {
                            class182.method31(field526, 87);
                            Object var568 = Statics.field193.field258;
                            synchronized (Statics.field193.field258) {
                                if (!field480) {
                                    Statics.field193.field260 = 0;
                                } else if (class77.field1412 != 0 || Statics.field193.field260 >= 40) {
                                    field526.method2265(130);
                                    field526.method2397(0);
                                    int var569 = field526.field2037;
                                    int var570 = 0;
                                    for (int var571 = 0; var571 < Statics.field193.field260 && field526.field2037 - var569 < 240; var571++) {
                                        var570++;
                                        int var572 = Statics.field193.field259[var571];
                                        if (var572 < 0) {
                                            var572 = 0;
                                        } else if (var572 > 502) {
                                            var572 = 502;
                                        }
                                        int var573 = Statics.field193.field261[var571];
                                        if (var573 < 0) {
                                            var573 = 0;
                                        } else if (var573 > 764) {
                                            var573 = 764;
                                        }
                                        int var574 = var572 * 765 + var573;
                                        if (Statics.field193.field259[var571] == -1 && Statics.field193.field261[var571] == -1) {
                                            var573 = -1;
                                            var572 = -1;
                                            var574 = 524287;
                                        }
                                        if (field493 != var573 || field502 != var572) {
                                            int var575 = var573 - field493;
                                            field493 = var573;
                                            int var576 = var572 - field502;
                                            field502 = var572;
                                            if (field495 < 8 && var575 >= -32 && var575 <= 31 && var576 >= -32 && var576 <= 31) {
                                                var575 += 32;
                                                var576 += 32;
                                                field526.method2398((field495 << 12) + (var575 << 6) + var576);
                                                field495 = 0;
                                            } else if (field495 < 8) {
                                                field526.method2399((field495 << 19) + 8388608 + var574);
                                                field495 = 0;
                                            } else {
                                                field526.method2400((field495 << 19) + -1073741824 + var574);
                                                field495 = 0;
                                            }
                                        } else if (field495 < 2047) {
                                            field495++;
                                        }
                                    }
                                    field526.method2408(field526.field2037 - var569);
                                    if (var570 >= Statics.field193.field260) {
                                        Statics.field193.field260 = 0;
                                    } else {
                                        Statics.field193.field260 -= var570;
                                        for (int var577 = 0; var577 < Statics.field193.field260; var577++) {
                                            Statics.field193.field261[var577] = Statics.field193.field261[var570 + var577];
                                            Statics.field193.field259[var577] = Statics.field193.field259[var570 + var577];
                                        }
                                    }
                                }
                            }
                            if (class77.field1412 != 0) {
                                long var579 = (class77.field1402 - field745) / 50L;
                                if (var579 > 4095L) {
                                    var579 = 4095L;
                                }
                                field745 = class77.field1402;
                                int var581 = class77.field1416;
                                if (var581 < 0) {
                                    var581 = 0;
                                } else if (var581 > 502) {
                                    var581 = 502;
                                }
                                int var582 = class77.field1415;
                                if (var582 < 0) {
                                    var582 = 0;
                                } else if (var582 > 764) {
                                    var582 = 764;
                                }
                                int var583 = var581 * 765 + var582;
                                byte var584 = 0;
                                if (class77.field1412 == 2) {
                                    var584 = 1;
                                }
                                int var585 = (int) var579;
                                field526.method2265(159);
                                field526.method2400((var584 << 19) + (var585 << 20) + var583);
                            }
                            if (class75.field1385 > 0) {
                                field526.method2265(153);
                                field526.method2398(0);
                                int var586 = field526.field2037;
                                long var587 = class121.method2124();
                                for (int var589 = 0; var589 < class75.field1385; var589++) {
                                    long var590 = var587 - field614;
                                    if (var590 > 16777215L) {
                                        var590 = 16777215L;
                                    }
                                    field614 = var587;
                                    field526.method2448((int) var590);
                                    field526.method2433(class75.field1379[var589]);
                                }
                                field526.method2407(field526.field2037 - var586);
                            }
                            if (field657 > 0) {
                                field657--;
                            }
                            if (class75.field1384[96] || class75.field1384[97] || class75.field1384[98] || class75.field1384[99]) {
                                field712 = true;
                            }
                            if (field712 && field657 <= 0) {
                                field657 = 20;
                                field712 = false;
                                field526.method2265(236);
                                field526.method2441(field553);
                                field526.method2442(field574);
                            }
                            if (Statics.field237 && !field496) {
                                field496 = true;
                                field526.method2265(218);
                                field526.method2397(1);
                            }
                            if (!Statics.field237 && field496) {
                                field496 = false;
                                field526.method2265(218);
                                field526.method2397(0);
                            }
                            method267();
                            if (field489 == 30) {
                                method2658();
                                for (int var592 = 0; var592 < field481; var592++) {
                                    var10002 = field731[var592]--;
                                    if (field731[var592] >= -10) {
                                        class57 var594 = field733[var592];
                                        if (var594 == null) {
                                            class57 var672 = (class57) null;
                                            var594 = class57.method1215(Statics.field1756, field711[var592], 0);
                                            if (var594 == null) {
                                                continue;
                                            }
                                            field731[var592] += var594.method1211();
                                            field733[var592] = var594;
                                        }
                                        if (field731[var592] < 0) {
                                            int var601;
                                            if (field556[var592] == 0) {
                                                var601 = field726;
                                            } else {
                                                int var595 = (field556[var592] & 0xFF) * 128;
                                                int var596 = field556[var592] >> 16 & 0xFF;
                                                int var597 = var596 * 128 + 64 - Statics.field1358.field462;
                                                if (var597 < 0) {
                                                    var597 = -var597;
                                                }
                                                int var598 = field556[var592] >> 8 & 0xFF;
                                                int var599 = var598 * 128 + 64 - Statics.field1358.field470;
                                                if (var599 < 0) {
                                                    var599 = -var599;
                                                }
                                                int var600 = var597 + var599 - 128;
                                                if (var600 > var595) {
                                                    field731[var592] = -100;
                                                    continue;
                                                }
                                                if (var600 < 0) {
                                                    var600 = 0;
                                                }
                                                var601 = field727 * (var595 - var600) / var595;
                                            }
                                            if (var601 > 0) {
                                                class63 var602 = var594.method1218().method1270(Statics.field1977);
                                                class45 var603 = class45.method963(var602, 100, var601);
                                                var603.method1040(field730[var592] - 1);
                                                Statics.field2325.method1057(var603);
                                            }
                                            field731[var592] = -100;
                                        }
                                    } else {
                                        field481--;
                                        for (int var593 = var592; var593 < field481; var593++) {
                                            field711[var593] = field711[var593 + 1];
                                            field733[var593] = field733[var593 + 1];
                                            field730[var593] = field730[var593 + 1];
                                            field731[var593] = field731[var593 + 1];
                                            field556[var593] = field556[var593 + 1];
                                        }
                                        var592--;
                                    }
                                }
                                if (field681 && !class138.method542()) {
                                    if (field682 != 0 && field724 != -1) {
                                        class138.method2650(Statics.field514, field724, 0, field682, false);
                                    }
                                    field681 = false;
                                }
                                field521++;
                                if (field521 > 750) {
                                    method787();
                                } else {
                                    method660();
                                    for (int var604 = 0; var604 < field523; var604++) {
                                        int var605 = field639[var604];
                                        class25 var606 = field522[var605];
                                        if (var606 != null) {
                                            method227(var606, var606.field402.field790);
                                        }
                                    }
                                    for (int var607 = -1; var607 < field560; var607++) {
                                        int var608;
                                        if (var607 == -1) {
                                            var608 = 2047;
                                        } else {
                                            var608 = field744[var607];
                                        }
                                        class3 var609 = field608[var608];
                                        if (var609 != null && var609.field420 > 0) {
                                            var609.field420--;
                                            if (var609.field420 == 0) {
                                                var609.field460 = null;
                                            }
                                        }
                                    }
                                    for (int var610 = 0; var610 < field523; var610++) {
                                        int var611 = field639[var610];
                                        class25 var612 = field522[var611];
                                        if (var612 != null && var612.field420 > 0) {
                                            var612.field420--;
                                            if (var612.field420 == 0) {
                                                var612.field460 = null;
                                            }
                                        }
                                    }
                                    field683++;
                                    if (field598 != 0) {
                                        field597 += 20;
                                        if (field597 >= 400) {
                                            field598 = 0;
                                        }
                                    }
                                    if (Statics.field263 != null) {
                                        field634++;
                                        if (field634 >= 15) {
                                            method64(Statics.field263);
                                            Statics.field263 = null;
                                        }
                                    }
                                    if (Statics.field152 != null) {
                                        method64(Statics.field152);
                                        field606++;
                                        if (class77.field1408 > field602 + 5 || class77.field1408 < field602 - 5 || class77.field1409 > field603 + 5 || class77.field1409 < field603 - 5) {
                                            field675 = true;
                                        }
                                        if (class77.field1407 == 0) {
                                            if (!field675 || field606 < 5) {
                                                label4087: {
                                                    label2491: {
                                                        if (field629 != 1) {
                                                            int var621 = field631 - 1;
                                                            boolean var622;
                                                            if (var621 < 0) {
                                                                var622 = false;
                                                            } else {
                                                                int var623 = field592[var621];
                                                                if (var623 >= 2000) {
                                                                    var623 -= 2000;
                                                                }
                                                                if (var623 == 1007) {
                                                                    var622 = true;
                                                                } else {
                                                                    var622 = false;
                                                                }
                                                            }
                                                            if (!var622) {
                                                                break label2491;
                                                            }
                                                        }
                                                        if (field631 > 2) {
                                                            method2261();
                                                            break label4087;
                                                        }
                                                    }
                                                    if (field631 > 0) {
                                                        method131(field631 - 1);
                                                    }
                                                }
                                            } else if (Statics.field152 == Statics.field1442 && field734 != field690) {
                                                class158 var613 = Statics.field152;
                                                byte var614 = 0;
                                                if (field720 == 1 && var613.field2657 == 206) {
                                                    var614 = 1;
                                                }
                                                if (var613.field2649[field690] <= 0) {
                                                    var614 = 0;
                                                }
                                                int var615 = method119(var613);
                                                boolean var616 = (var615 >> 29 & 0x1) != 0;
                                                if (var616) {
                                                    int var617 = field734;
                                                    int var618 = field690;
                                                    var613.field2649[var618] = var613.field2649[var617];
                                                    var613.field2634[var618] = var613.field2634[var617];
                                                    var613.field2649[var617] = -1;
                                                    var613.field2634[var617] = 0;
                                                } else if (var614 == 1) {
                                                    int var619 = field734;
                                                    int var620 = field690;
                                                    while (var619 != var620) {
                                                        if (var619 > var620) {
                                                            var613.method3074(var619 - 1, var619);
                                                            var619--;
                                                        } else if (var619 < var620) {
                                                            var613.method3074(var619 + 1, var619);
                                                            var619++;
                                                        }
                                                    }
                                                } else {
                                                    var613.method3074(field690, field734);
                                                }
                                                field526.method2265(31);
                                                field526.method2432(var614);
                                                field526.method2452(Statics.field152.field2591);
                                                field526.method2398(field734);
                                                field526.method2441(field690);
                                            }
                                            field634 = 10;
                                            class77.field1412 = 0;
                                            Statics.field152 = null;
                                        }
                                    }
                                    class158 var624 = Statics.field969;
                                    class158 var625 = Statics.field970;
                                    Statics.field969 = null;
                                    Statics.field970 = null;
                                    field636 = null;
                                    field485 = false;
                                    field664 = false;
                                    for (field572 = 0; class75.method2256() && field572 < 128; field572++) {
                                        field571[field572] = Statics.field430;
                                        field710[field572] = Statics.field2071;
                                    }
                                    int var626 = field648;
                                    if (Statics.method2702(var626)) {
                                        method222(Statics.field2595[var626], -1, 0, 0, 765, 503, 0, 0);
                                    }
                                    field538++;
                                    while (true) {
                                        class1 var627;
                                        class158 var628;
                                        class158 var629;
                                        do {
                                            var627 = (class1) field686.method3288();
                                            if (var627 == null) {
                                                while (true) {
                                                    class1 var630;
                                                    class158 var631;
                                                    class158 var632;
                                                    do {
                                                        var630 = (class1) field687.method3288();
                                                        if (var630 == null) {
                                                            while (true) {
                                                                class1 var633;
                                                                class158 var634;
                                                                class158 var635;
                                                                do {
                                                                    var633 = (class1) field685.method3288();
                                                                    if (var633 == null) {
                                                                        if (field659 != null) {
                                                                            method64(field659);
                                                                            Statics.field1295++;
                                                                            if (field485 && field664) {
                                                                                int var636 = class77.field1408;
                                                                                int var637 = class77.field1409;
                                                                                int var638 = var636 - field661;
                                                                                int var639 = var637 - field662;
                                                                                if (var638 < field665) {
                                                                                    var638 = field665;
                                                                                }
                                                                                if (field659.field2600 + var638 > field665 + field660.field2600) {
                                                                                    var638 = field665 + field660.field2600 - field659.field2600;
                                                                                }
                                                                                if (var639 < field666) {
                                                                                    var639 = field666;
                                                                                }
                                                                                if (field659.field2582 + var639 > field666 + field660.field2582) {
                                                                                    var639 = field666 + field660.field2582 - field659.field2582;
                                                                                }
                                                                                int var640 = var638 - field588;
                                                                                int var641 = var639 - field669;
                                                                                int var642 = field659.field2654;
                                                                                if (Statics.field1295 > field659.field2655 && (var640 > var642 || var640 < -var642 || var641 > var642 || var641 < -var642)) {
                                                                                    field670 = true;
                                                                                }
                                                                                int var643 = field660.field2604 + (var638 - field665);
                                                                                int var644 = field660.field2605 + (var639 - field666);
                                                                                if (field659.field2667 != null && field670) {
                                                                                    class1 var645 = new class1();
                                                                                    var645.field1 = field659;
                                                                                    var645.field3 = var643;
                                                                                    var645.field4 = var644;
                                                                                    var645.field8 = field659.field2667;
                                                                                    class26.method1269(var645);
                                                                                }
                                                                                if (class77.field1407 == 0) {
                                                                                    if (field670) {
                                                                                        if (field659.field2610 != null) {
                                                                                            class1 var646 = new class1();
                                                                                            var646.field1 = field659;
                                                                                            var646.field3 = var643;
                                                                                            var646.field4 = var644;
                                                                                            var646.field6 = field636;
                                                                                            var646.field8 = field659.field2610;
                                                                                            class26.method1269(var646);
                                                                                        }
                                                                                        if (field636 != null && Statics.method142(field659) != null) {
                                                                                            field526.method2265(20);
                                                                                            field526.method2400(field659.field2591);
                                                                                            field526.method2403(field636.field2591);
                                                                                            field526.method2440(field659.field2592);
                                                                                            field526.method2398(field636.field2592);
                                                                                        }
                                                                                    } else {
                                                                                        label2399: {
                                                                                            label2398: {
                                                                                                if (field629 != 1) {
                                                                                                    int var647 = field631 - 1;
                                                                                                    boolean var648;
                                                                                                    if (var647 < 0) {
                                                                                                        var648 = false;
                                                                                                    } else {
                                                                                                        int var649 = field592[var647];
                                                                                                        if (var649 >= 2000) {
                                                                                                            var649 -= 2000;
                                                                                                        }
                                                                                                        if (var649 == 1007) {
                                                                                                            var648 = true;
                                                                                                        } else {
                                                                                                            var648 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var648) {
                                                                                                        break label2398;
                                                                                                    }
                                                                                                }
                                                                                                if (field631 > 2) {
                                                                                                    method2261();
                                                                                                    break label2399;
                                                                                                }
                                                                                            }
                                                                                            if (field631 > 0) {
                                                                                                method131(field631 - 1);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    field659 = null;
                                                                                }
                                                                            } else if (Statics.field1295 > 1) {
                                                                                field659 = null;
                                                                            }
                                                                        }
                                                                        if (class95.field1594 != -1) {
                                                                            int var650 = class95.field1594;
                                                                            int var651 = class95.field1595;
                                                                            boolean var652 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var650, var651, true, 0, 0, 0, 0, 0, 0);
                                                                            class95.field1594 = -1;
                                                                            if (var652) {
                                                                                field595 = class77.field1415;
                                                                                field531 = class77.field1416;
                                                                                field598 = 1;
                                                                                field597 = 0;
                                                                            }
                                                                        }
                                                                        method248();
                                                                        if (Statics.field969 != var624) {
                                                                            if (var624 != null) {
                                                                                method64(var624);
                                                                            }
                                                                            if (Statics.field969 != null) {
                                                                                method64(Statics.field969);
                                                                            }
                                                                        }
                                                                        if (Statics.field970 != var625 && field641 == field610) {
                                                                            if (var625 != null) {
                                                                                method64(var625);
                                                                            }
                                                                            if (Statics.field970 != null) {
                                                                                method64(Statics.field970);
                                                                            }
                                                                        }
                                                                        if (Statics.field970 == null) {
                                                                            if (field610 > 0) {
                                                                                field610--;
                                                                            }
                                                                        } else if (field610 < field641) {
                                                                            field610++;
                                                                            if (field641 == field610) {
                                                                                method64(Statics.field970);
                                                                            }
                                                                        }
                                                                        method12();
                                                                        if (field561) {
                                                                            method1330();
                                                                        }
                                                                        for (int var653 = 0; var653 < 5; var653++) {
                                                                            var10002 = field671[var653]++;
                                                                        }
                                                                        int var654 = ++class77.field1403 - 1;
                                                                        int var656 = class75.method68();
                                                                        if (var654 > 15000 && var656 > 15000) {
                                                                            field492 = 250;
                                                                            class77.method180(14500);
                                                                            field526.method2265(110);
                                                                        }
                                                                        field695++;
                                                                        if (field695 > 500) {
                                                                            field695 = 0;
                                                                            int var657 = (int) (Math.random() * 8.0D);
                                                                            if ((var657 & 0x1) == 1) {
                                                                                field714 += field653;
                                                                            }
                                                                            if ((var657 & 0x2) == 2) {
                                                                                field528 += field558;
                                                                            }
                                                                            if ((var657 & 0x4) == 4) {
                                                                                field559 += field709;
                                                                            }
                                                                        }
                                                                        if (field714 < -50) {
                                                                            field653 = 2;
                                                                        }
                                                                        if (field714 > 50) {
                                                                            field653 = -2;
                                                                        }
                                                                        if (field528 < -55) {
                                                                            field558 = 2;
                                                                        }
                                                                        if (field528 > 55) {
                                                                            field558 = -2;
                                                                        }
                                                                        if (field559 < -40) {
                                                                            field709 = 1;
                                                                        }
                                                                        if (field559 > 40) {
                                                                            field709 = -1;
                                                                        }
                                                                        field566++;
                                                                        if (field566 > 500) {
                                                                            field566 = 0;
                                                                            int var658 = (int) (Math.random() * 8.0D);
                                                                            if ((var658 & 0x1) == 1) {
                                                                                field499 += field563;
                                                                            }
                                                                            if ((var658 & 0x2) == 2) {
                                                                                field564 += field565;
                                                                            }
                                                                        }
                                                                        if (field499 < -60) {
                                                                            field563 = 2;
                                                                        }
                                                                        if (field499 > 60) {
                                                                            field563 = -2;
                                                                        }
                                                                        if (field564 < -20) {
                                                                            field565 = 1;
                                                                        }
                                                                        if (field564 > 10) {
                                                                            field565 = -1;
                                                                        }
                                                                        for (class28 var659 = (class28) field743.method3262(); var659 != null; var659 = (class28) field743.method3255()) {
                                                                            if ((long) var659.field756 < class121.method2124() / 1000L - 5L) {
                                                                                if (var659.field753 > 0) {
                                                                                    Statics.method3033(5, "", var659.field752 + class134.field2175);
                                                                                }
                                                                                if (var659.field753 == 0) {
                                                                                    Statics.method3033(5, "", var659.field752 + class134.field2225);
                                                                                }
                                                                                var659.method3317();
                                                                            }
                                                                        }
                                                                        field532++;
                                                                        if (field532 > 50) {
                                                                            field526.method2265(71);
                                                                        }
                                                                        try {
                                                                            if (Statics.field578 != null && field526.field2037 > 0) {
                                                                                Statics.field578.method1350(field526.field2039, 0, field526.field2037);
                                                                                field526.field2037 = 0;
                                                                                field532 = 0;
                                                                                return;
                                                                            }
                                                                        } catch (IOException var661) {
                                                                            method787();
                                                                        }
                                                                        return;
                                                                    }
                                                                    var634 = var633.field1;
                                                                    if (var634.field2592 < 0) {
                                                                        break;
                                                                    }
                                                                    var635 = class158.method139(var634.field2602);
                                                                } while (var635 == null || var635.field2699 == null || var634.field2592 >= var635.field2699.length || var635.field2699[var634.field2592] != var634);
                                                                class26.method1269(var633);
                                                            }
                                                        }
                                                        var631 = var630.field1;
                                                        if (var631.field2592 < 0) {
                                                            break;
                                                        }
                                                        var632 = class158.method139(var631.field2602);
                                                    } while (var632 == null || var632.field2699 == null || var631.field2592 >= var632.field2699.length || var632.field2699[var631.field2592] != var631);
                                                    class26.method1269(var630);
                                                }
                                            }
                                            var628 = var627.field1;
                                            if (var628.field2592 < 0) {
                                                break;
                                            }
                                            var629 = class158.method139(var628.field2602);
                                        } while (var629 == null || var629.field2699 == null || var628.field2592 >= var629.field2699.length || var629.field2699[var628.field2592] != var628);
                                        class26.method1269(var627);
                                    }
                                }
                            }
                        }
                    }
                } else if (field489 == 40) {
                    method24();
                }
                return;
            }
            var2.field2572.method3041(var2.field2576, (int) var2.field2818, var2.field2573, false);
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method278() {
        boolean var1 = class138.method135();
        if (var1 && field681 && Statics.field2332 != null) {
            Statics.field2332.method1133();
        }
        if (field1342) {
            class75.method1376(Statics.field962);
            class77.method801(Statics.field962);
            if (Statics.field765 != null) {
                Statics.field765.method1305(Statics.field962);
            }
            this.method1378();
            class75.method2818(Statics.field962);
            class77.method1977(Statics.field962);
            if (Statics.field765 != null) {
                Statics.field765.method1306(Statics.field962);
            }
        }
        if (field489 == 0) {
            class73.method28(class21.field332, class21.field345, (Color) null);
        } else if (field489 == 5) {
            class21.method45(Statics.field1397, Statics.field254);
        } else if (field489 == 10) {
            class21.method45(Statics.field1397, Statics.field254);
        } else if (field489 == 20) {
            class21.method45(Statics.field1397, Statics.field254);
        } else if (field489 == 25) {
            if (field649 == 1) {
                if (field540 > field541) {
                    field541 = field540;
                }
                int var2 = (field541 * 50 - field540 * 50) / field541;
                method1534(class134.field2093 + class2.field16 + class2.field19 + var2 + "%" + class2.field20, false);
            } else if (field649 == 2) {
                if (field542 > field543) {
                    field543 = field542;
                }
                int var3 = (field543 * 50 - field542 * 50) / field543 + 50;
                method1534(class134.field2093 + class2.field16 + class2.field19 + var3 + "%" + class2.field20, false);
            } else {
                method1534(class134.field2093, false);
            }
        } else if (field489 == 30) {
            method727();
        } else if (field489 == 40) {
            method1534(class134.field2287 + class2.field16 + class134.field2095, false);
        }
        if (field489 == 30 && field698 == 0 && !field1340) {
            try {
                Graphics var4 = Statics.field962.getGraphics();
                for (int var5 = 0; var5 < field689; var5++) {
                    if (field692[var5]) {
                        Statics.field379.method1546(var4, field694[var5], field596[var5], field696[var5], field536[var5]);
                        field692[var5] = false;
                    }
                }
            } catch (Exception var11) {
                Statics.field962.repaint();
            }
        } else if (field489 > 0) {
            try {
                Graphics var7 = Statics.field962.getGraphics();
                Statics.field379.method1573(var7, 0, 0);
                field1340 = false;
                for (int var8 = 0; var8 < field689; var8++) {
                    field692[var8] = false;
                }
            } catch (Exception var10) {
                Statics.field962.repaint();
            }
        }
    }

    @ObfuscatedName("client.d(S)V")
    public final void method362() {
        if (Statics.field193 != null) {
            Statics.field193.field262 = false;
        }
        Statics.field193 = null;
        if (Statics.field578 != null) {
            Statics.field578.method1332();
            Statics.field578 = null;
        }
        if (class75.field1367 != null) {
            class75 var1 = class75.field1367;
            synchronized (class75.field1367) {
                class75.field1367 = null;
            }
        }
        if (class77.field1414 != null) {
            class77 var3 = class77.field1414;
            synchronized (class77.field1414) {
                class77.field1414 = null;
            }
        }
        Statics.field765 = null;
        if (Statics.field2332 != null) {
            Statics.field2332.method1118();
        }
        if (Statics.field217 != null) {
            Statics.field217.method1118();
        }
        if (Statics.field2548 != null) {
            Statics.field2548.method1332();
        }
        Object var5 = class157.field2580;
        synchronized (class157.field2580) {
            if (class157.field2579 != 0) {
                class157.field2579 = 1;
                try {
                    class157.field2580.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class82.method859();
    }

    @ObfuscatedName("d.m(IB)V")
    public static void method67(int arg0) {
        if (field489 == arg0) {
            return;
        }
        if (field489 == 0) {
            Statics.field346 = null;
            Statics.field1265 = null;
            Statics.field388 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field517 = 0;
            field646 = 0;
            field519 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field758 != null) {
            Statics.field758.method1332();
            Statics.field758 = null;
        }
        if (field489 == 25) {
            field649 = 0;
            field540 = 0;
            field541 = 1;
            field542 = 0;
            field543 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method42(Statics.field962, Statics.field213, Statics.field1758);
        } else {
            class21.method43();
        }
        field489 = arg0;
    }

    @ObfuscatedName("client.v(I)V")
    public void method280() {
        if (field489 == 1000) {
            return;
        }
        long var1 = class121.method2124();
        int var3 = (int) (var1 - Statics.field2019);
        Statics.field2019 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2533 += var3;
        boolean var4;
        if (class153.field2542 == 0 && class153.field2546 == 0 && class153.field2540 == 0 && class153.field2535 == 0) {
            var4 = true;
        } else if (Statics.field2548 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2533 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2546 < 20 && class153.field2535 > 0) {
                        class155 var5 = (class155) class153.field2552.method3271();
                        class127 var6 = new class127(4);
                        var6.method2397(1);
                        var6.method2399((int) var5.field2818);
                        Statics.field2548.method1350(var6.field2039, 0, 4);
                        class153.field2536.method3269(var5, var5.field2818);
                        class153.field2535--;
                        class153.field2546++;
                    }
                    while (class153.field2542 < 20 && class153.field2540 > 0) {
                        class155 var7 = (class155) class153.field2538.method3250();
                        class127 var8 = new class127(4);
                        var8.method2397(0);
                        var8.method2399((int) var7.field2818);
                        Statics.field2548.method1350(var8.field2039, 0, 4);
                        var7.method3264();
                        class153.field2541.method3269(var7, var7.field2818);
                        class153.field2540--;
                        class153.field2542++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2548.method1335();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2533 = 0;
                        byte var11 = 0;
                        if (Statics.field2544 == null) {
                            var11 = 8;
                        } else if (class153.field2534 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2547.field2037;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2548.method1355(class153.field2547.field2039, class153.field2547.field2037, var12);
                            if (class153.field2537 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2547.field2039[class153.field2547.field2037 + var13] ^= class153.field2537;
                                }
                            }
                            class153.field2547.field2037 += var12;
                            if (class153.field2547.field2037 < var11) {
                                break;
                            }
                            if (Statics.field2544 == null) {
                                class153.field2547.field2037 = 0;
                                int var14 = class153.field2547.method2411();
                                int var15 = class153.field2547.method2413();
                                int var16 = class153.field2547.method2411();
                                int var17 = class153.field2547.method2416();
                                long var18 = (long) ((var14 << 16) + var15);
                                class155 var20 = (class155) class153.field2536.method3268(var18);
                                Statics.field2543 = true;
                                if (var20 == null) {
                                    var20 = (class155) class153.field2541.method3268(var18);
                                    Statics.field2543 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2544 = var20;
                                Statics.field983 = new class127(var17 + var21 + Statics.field2544.field2568);
                                Statics.field983.method2397(var16);
                                Statics.field983.method2400(var17);
                                class153.field2534 = 8;
                                class153.field2547.field2037 = 0;
                            } else if (class153.field2534 == 0) {
                                if (class153.field2547.field2039[0] == -1) {
                                    class153.field2534 = 1;
                                    class153.field2547.field2037 = 0;
                                } else {
                                    Statics.field2544 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field983.field2039.length - Statics.field2544.field2568;
                            int var23 = 512 - class153.field2534;
                            if (var23 > var22 - Statics.field983.field2037) {
                                var23 = var22 - Statics.field983.field2037;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2548.method1355(Statics.field983.field2039, Statics.field983.field2037, var23);
                            if (class153.field2537 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field983.field2039[Statics.field983.field2037 + var24] ^= class153.field2537;
                                }
                            }
                            Statics.field983.field2037 += var23;
                            class153.field2534 += var23;
                            if (Statics.field983.field2037 == var22) {
                                if (Statics.field2544.field2818 == 16711935L) {
                                    Statics.field2323 = Statics.field983;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class154 var26 = class153.field2553[var25];
                                        if (var26 != null) {
                                            Statics.field2323.field2037 = var25 * 8 + 5;
                                            int var27 = Statics.field2323.method2416();
                                            int var28 = Statics.field2323.method2416();
                                            var26.method3036(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2549.reset();
                                    class153.field2549.update(Statics.field983.field2039, 0, var22);
                                    int var29 = (int) class153.field2549.getValue();
                                    if (Statics.field2544.field2565 != var29) {
                                        try {
                                            Statics.field2548.method1332();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2545++;
                                        Statics.field2548 = null;
                                        class153.field2537 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2545 = 0;
                                    class153.field2551 = 0;
                                    Statics.field2544.field2567.method3050((int) (Statics.field2544.field2818 & 0xFFFFL), Statics.field983.field2039, (Statics.field2544.field2818 & 0xFF0000L) == 16711680L, Statics.field2543);
                                }
                                Statics.field2544.method3319();
                                if (Statics.field2543) {
                                    class153.field2546--;
                                } else {
                                    class153.field2542--;
                                }
                                class153.field2534 = 0;
                                Statics.field2544 = null;
                                Statics.field983 = null;
                            } else {
                                if (class153.field2534 != 512) {
                                    break;
                                }
                                class153.field2534 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2548.method1332();
                } catch (Exception var34) {
                }
                class153.field2551++;
                Statics.field2548 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method281();
        }
    }

    @ObfuscatedName("client.j(B)V")
    public void method281() {
        if (class153.field2545 >= 4) {
            this.method1387("js5crc");
            field489 = 1000;
            return;
        }
        if (class153.field2551 >= 4) {
            if (field489 <= 5) {
                this.method1387("js5io");
                field489 = 1000;
                return;
            }
            field725 = 3000;
            class153.field2551 = 3;
        }
        if (--field725 + 1 > 0) {
            return;
        }
        try {
            if (field511 == 0) {
                Statics.field1104 = Statics.field2466.method1439(Statics.field1463, Statics.field387);
                field511++;
            }
            if (field511 == 1) {
                if (Statics.field1104.field1428 == 2) {
                    this.method282(-1);
                    return;
                }
                if (Statics.field1104.field1428 == 1) {
                    field511++;
                }
            }
            if (field511 == 2) {
                Statics.field510 = new class70((Socket) Statics.field1104.field1432, Statics.field2466);
                class127 var1 = new class127(5);
                var1.method2397(15);
                var1.method2400(21);
                Statics.field510.method1350(var1.field2039, 0, 5);
                field511++;
                Statics.field1671 = class121.method2124();
            }
            if (field511 == 3) {
                if (field489 <= 5 || Statics.field510.method1335() > 0) {
                    int var2 = Statics.field510.method1334();
                    if (var2 != 0) {
                        this.method282(var2);
                        return;
                    }
                    field511++;
                } else if (class121.method2124() - Statics.field1671 > 30000L) {
                    this.method282(-2);
                    return;
                }
            }
            if (field511 == 4) {
                class70 var3 = Statics.field510;
                boolean var4 = field489 > 20;
                if (Statics.field2548 != null) {
                    try {
                        Statics.field2548.method1332();
                    } catch (Exception var14) {
                    }
                    Statics.field2548 = null;
                }
                Statics.field2548 = var3;
                class153.method2657(var4);
                class153.field2547.field2037 = 0;
                Statics.field2544 = null;
                Statics.field983 = null;
                class153.field2534 = 0;
                while (true) {
                    class155 var6 = (class155) class153.field2536.method3271();
                    if (var6 == null) {
                        while (true) {
                            class155 var7 = (class155) class153.field2541.method3271();
                            if (var7 == null) {
                                if (class153.field2537 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2397(4);
                                        var8.method2397(class153.field2537);
                                        var8.method2398(0);
                                        Statics.field2548.method1350(var8.field2039, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2548.method1332();
                                        } catch (Exception var12) {
                                        }
                                        class153.field2551++;
                                        Statics.field2548 = null;
                                    }
                                }
                                class153.field2533 = 0;
                                Statics.field2019 = class121.method2124();
                                Statics.field1104 = null;
                                Statics.field510 = null;
                                field511 = 0;
                                field516 = 0;
                                return;
                            }
                            class153.field2538.method3236(var7);
                            class153.field2539.method3269(var7, var7.field2818);
                            class153.field2540++;
                            class153.field2542--;
                        }
                    }
                    class153.field2552.method3269(var6, var6.field2818);
                    class153.field2535++;
                    class153.field2546--;
                }
            }
        } catch (IOException var15) {
            this.method282(-3);
        }
    }

    @ObfuscatedName("client.f(IB)V")
    public void method282(int arg0) {
        Statics.field1104 = null;
        Statics.field510 = null;
        field511 = 0;
        if (Statics.field524 == Statics.field387) {
            Statics.field387 = Statics.field1347;
        } else {
            Statics.field387 = Statics.field524;
        }
        field516++;
        if (field516 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field489 <= 5) {
                this.method1387("js5connect_full");
                field489 = 1000;
            } else {
                field725 = 3000;
            }
        } else if (field516 >= 2 && arg0 == 6) {
            this.method1387("js5connect_outofdate");
            field489 = 1000;
        } else if (field516 >= 4) {
            if (field489 <= 5) {
                this.method1387("js5connect");
                field489 = 1000;
            } else {
                field725 = 3000;
            }
        }
    }

    @ObfuscatedName("g.h(B)V")
    public static void method159() {
        if (field509 == 0) {
            Statics.field545 = new class95(4, 104, 104, class9.field141);
            for (int var0 = 0; var0 < 4; var0++) {
                field494[var0] = new class164(104, 104);
            }
            Statics.field36 = new class86(512, 512);
            class21.field345 = class134.field2167;
            class21.field332 = 5;
            field509 = 20;
        } else if (field509 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1789[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1949(var1, 500, 800, 512, 334);
            class21.field345 = class134.field2141;
            class21.field332 = 10;
            field509 = 30;
        } else if (field509 == 30) {
            Statics.field286 = method257(0, false, true, true);
            Statics.field2083 = method257(1, false, true, true);
            Statics.field2532 = method257(2, true, false, true);
            Statics.field513 = method257(3, false, true, true);
            Statics.field1756 = method257(4, false, true, true);
            Statics.field275 = method257(5, true, true, true);
            Statics.field514 = method257(6, true, true, false);
            Statics.field361 = method257(7, false, true, true);
            Statics.field1758 = method257(8, false, true, true);
            Statics.field515 = method257(9, false, true, true);
            Statics.field213 = method257(10, false, true, true);
            Statics.field1321 = method257(11, false, true, true);
            Statics.field1795 = method257(12, false, true, true);
            Statics.field102 = method257(13, true, false, true);
            Statics.field797 = method257(14, false, true, false);
            Statics.field110 = method257(15, false, true, true);
            class21.field345 = class134.field2138;
            class21.field332 = 20;
            field509 = 40;
        } else if (field509 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field286.method3034() * 4 / 100;
            int var8 = var7 + Statics.field2083.method3034() * 4 / 100;
            int var9 = var8 + Statics.field2532.method3034() * 2 / 100;
            int var10 = var9 + Statics.field513.method3034() * 2 / 100;
            int var11 = var10 + Statics.field1756.method3034() * 6 / 100;
            int var12 = var11 + Statics.field275.method3034() * 4 / 100;
            int var13 = var12 + Statics.field514.method3034() * 2 / 100;
            int var14 = var13 + Statics.field361.method3034() * 60 / 100;
            int var15 = var14 + Statics.field1758.method3034() * 2 / 100;
            int var16 = var15 + Statics.field515.method3034() * 2 / 100;
            int var17 = var16 + Statics.field213.method3034() * 2 / 100;
            int var18 = var17 + Statics.field1321.method3034() * 2 / 100;
            int var19 = var18 + Statics.field1795.method3034() * 2 / 100;
            int var20 = var19 + Statics.field102.method3034() * 2 / 100;
            int var21 = var20 + Statics.field797.method3034() * 2 / 100;
            int var22 = var21 + Statics.field110.method3034() * 2 / 100;
            if (var22 == 100) {
                class21.field345 = class134.field2100;
                class21.field332 = 30;
                field509 = 45;
            } else {
                if (var22 != 0) {
                    class21.field345 = class134.field2099 + var22 + "%";
                }
                class21.field332 = 30;
            }
        } else if (field509 == 45) {
            class52.method667(22050, !field487, 2);
            class141 var23 = new class141();
            var23.method2742(9, 128);
            Statics.field2332 = class52.method544(Statics.field2466, Statics.field962, 0, 22050);
            Statics.field2332.method1132(var23);
            Statics.method2145(Statics.field110, Statics.field797, Statics.field1756, var23);
            Statics.field217 = class52.method544(Statics.field2466, Statics.field962, 1, 2048);
            Statics.field2325 = new class46();
            Statics.field217.method1132(Statics.field2325);
            Statics.field1977 = new class62(22050, Statics.field763);
            class21.field345 = class134.field2101;
            class21.field332 = 35;
            field509 = 50;
        } else if (field509 == 50) {
            int var24 = 0;
            if (Statics.field254 == null) {
                Statics.field254 = class84.method1326(Statics.field1758, Statics.field102, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field697 == null) {
                Statics.field697 = class84.method1326(Statics.field1758, Statics.field102, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field1397 == null) {
                Statics.field1397 = class84.method1326(Statics.field1758, Statics.field102, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class21.field345 = class134.field2102 + var24 * 100 / 3 + "%";
                class21.field332 = 40;
            } else {
                Statics.field1346 = new class151(true);
                class21.field345 = class134.field2189;
                class21.field332 = 40;
                field509 = 60;
            }
        } else if (field509 == 60) {
            class154 var25 = Statics.field213;
            class154 var26 = Statics.field1758;
            int var27 = 0;
            if (var25.method2953("title.jpg", "")) {
                var27++;
            }
            if (var26.method2953("logo", "")) {
                var27++;
            }
            if (var26.method2953("titlebox", "")) {
                var27++;
            }
            if (var26.method2953("titlebutton", "")) {
                var27++;
            }
            if (var26.method2953("runes", "")) {
                var27++;
            }
            if (var26.method2953("title_mute", "")) {
                var27++;
            }
            var26.method2953("sl_back", "");
            var26.method2953("sl_flags", "");
            var26.method2953("sl_arrows", "");
            var26.method2953("sl_stars", "");
            var26.method2953("sl_button", "");
            int var30 = class21.method245();
            if (var27 < var30) {
                class21.field345 = class134.field2104 + var27 * 100 / var30 + "%";
                class21.field332 = 50;
            } else {
                class21.field345 = class134.field2237;
                class21.field332 = 50;
                method67(5);
                field509 = 70;
            }
        } else if (field509 == 70) {
            if (Statics.field2532.method3013()) {
                class154 var31 = Statics.field2532;
                Statics.field945 = var31;
                class154 var32 = Statics.field2532;
                Statics.field876 = var32;
                class154 var33 = Statics.field2532;
                class154 var34 = Statics.field361;
                Statics.field931 = var33;
                Statics.field929 = var34;
                Statics.field930 = Statics.field931.method2945(3);
                class32.method181(Statics.field2532, Statics.field361, field487);
                class31.method1526(Statics.field2532, Statics.field361);
                class40.method1975(Statics.field2532, Statics.field361, field544, Statics.field254);
                class154 var35 = Statics.field2532;
                class154 var36 = Statics.field286;
                class154 var37 = Statics.field2083;
                Statics.field889 = var35;
                Statics.field886 = var36;
                Statics.field895 = var37;
                class35.method2392(Statics.field2532, Statics.field361);
                class38.method2254(Statics.field2532);
                class42.method1787(Statics.field2532);
                class154 var38 = Statics.field513;
                class154 var39 = Statics.field361;
                class154 var40 = Statics.field1758;
                class154 var41 = Statics.field102;
                Statics.field2584 = var38;
                Statics.field2596 = var39;
                Statics.field1817 = var40;
                Statics.field2322 = var41;
                Statics.field2595 = new class158[Statics.field2584.method2964()][];
                Statics.field2583 = new boolean[Statics.field2584.method2964()];
                class41.method70(Statics.field2532);
                class154 var42 = Statics.field2532;
                Statics.field979 = var42;
                class21.field345 = class134.field2107;
                class21.field332 = 60;
                field509 = 80;
            } else {
                class21.field345 = class134.field2106 + Statics.field2532.method3040() + "%";
                class21.field332 = 60;
            }
        } else if (field509 == 80) {
            int var43 = 0;
            if (Statics.field68 == null) {
                class154 var44 = Statics.field1758;
                int var45 = var44.method3012("compass");
                int var46 = var44.method2951(var45, "");
                class86 var47 = Statics.method1234(var44, var45, var46);
                Statics.field68 = var47;
            } else {
                var43++;
            }
            if (Statics.field780 == null) {
                class154 var48 = Statics.field1758;
                int var49 = var48.method3012("mapedge");
                int var50 = var48.method2951(var49, "");
                class86 var51 = Statics.method1234(var48, var49, var50);
                Statics.field780 = var51;
            } else {
                var43++;
            }
            if (Statics.field2463 == null) {
                Statics.field2463 = class84.method545(Statics.field1758, "mapscene", "");
            } else {
                var43++;
            }
            if (Statics.field871 == null) {
                Statics.field871 = class84.method2391(Statics.field1758, "mapfunction", "");
            } else {
                var43++;
            }
            if (Statics.field2 == null) {
                Statics.field2 = class84.method2391(Statics.field1758, "hitmarks", "");
            } else {
                var43++;
            }
            if (Statics.field2340 == null) {
                Statics.field2340 = class84.method2391(Statics.field1758, "headicons_pk", "");
            } else {
                var43++;
            }
            if (Statics.field2721 == null) {
                Statics.field2721 = class84.method2391(Statics.field1758, "headicons_prayer", "");
            } else {
                var43++;
            }
            if (Statics.field204 == null) {
                Statics.field204 = class84.method2391(Statics.field1758, "headicons_hint", "");
            } else {
                var43++;
            }
            if (Statics.field757 == null) {
                Statics.field757 = class84.method2391(Statics.field1758, "mapmarker", "");
            } else {
                var43++;
            }
            if (Statics.field950 == null) {
                Statics.field950 = class84.method2391(Statics.field1758, "cross", "");
            } else {
                var43++;
            }
            if (Statics.field1322 == null) {
                Statics.field1322 = class84.method2391(Statics.field1758, "mapdots", "");
            } else {
                var43++;
            }
            if (Statics.field1680 == null) {
                Statics.field1680 = class84.method545(Statics.field1758, "scrollbar", "");
            } else {
                var43++;
            }
            if (Statics.field51 == null) {
                Statics.field51 = class84.method545(Statics.field1758, "mod_icons", "");
            } else {
                var43++;
            }
            if (Statics.field187 == null) {
                Statics.field187 = class84.method743(Statics.field1758, "mapback", "");
            } else {
                var43++;
            }
            if (var43 < 14) {
                class21.field345 = class134.field2182 + var43 * 100 / 14 + "%";
                class21.field332 = 70;
            } else {
                Statics.field2839 = Statics.field51;
                Statics.field780.method1618();
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 41.0D) - 20;
                for (int var56 = 0; var56 < Statics.field871.length; var56++) {
                    Statics.field871[var56].method1677(var52 + var55, var53 + var55, var54 + var55);
                }
                Statics.field2463[0].method1702(var52 + var55, var53 + var55, var54 + var55);
                Statics.field299 = new int[33];
                Statics.field225 = new int[33];
                Statics.field1819 = new int[151];
                Statics.field2788 = new int[151];
                for (int var57 = 0; var57 < 33; var57++) {
                    int var58 = 999;
                    int var59 = 0;
                    for (int var60 = 0; var60 < 34; var60++) {
                        if (Statics.field187.field1489[Statics.field187.field1494 * var57 + var60] == 0) {
                            if (var58 == 999) {
                                var58 = var60;
                            }
                        } else if (var58 != 999) {
                            var59 = var60;
                            break;
                        }
                    }
                    Statics.field299[var57] = var58;
                    Statics.field225[var57] = var59 - var58;
                }
                for (int var61 = 5; var61 < 156; var61++) {
                    int var62 = 999;
                    int var63 = 0;
                    for (int var64 = 25; var64 < 172; var64++) {
                        if (Statics.field187.field1489[Statics.field187.field1494 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                            if (var62 == 999) {
                                var62 = var64;
                            }
                        } else if (var62 != 999) {
                            var63 = var64;
                            break;
                        }
                    }
                    Statics.field1819[var61 - 5] = var62 - 25;
                    Statics.field2788[var61 - 5] = var63 - var62;
                }
                class21.field345 = class134.field2109;
                class21.field332 = 70;
                field509 = 90;
            }
        } else if (field509 == 90) {
            if (Statics.field515.method3013()) {
                class110 var65 = new class110(Statics.field515, Statics.field1758, 20, 0.8D, field487 ? 64 : 128);
                class104.method2066(var65);
                class104.method2093(0.8D);
                class21.field345 = class134.field2111;
                class21.field332 = 90;
                field509 = 110;
            } else {
                class21.field345 = class134.field2110 + Statics.field515.method3040() + "%";
                class21.field332 = 90;
            }
        } else if (field509 == 110) {
            Statics.field193 = new class16();
            Statics.field2466.method1455(Statics.field193, 10);
            class21.field345 = class134.field2112;
            class21.field332 = 94;
            field509 = 120;
        } else if (field509 == 120) {
            if (Statics.field213.method2953("huffman", "")) {
                class120 var66 = new class120(Statics.field213.method2963("huffman", ""));
                Statics.field2832 = var66;
                class21.field345 = class134.field2114;
                class21.field332 = 96;
                field509 = 130;
            } else {
                class21.field345 = class134.field2113 + "%";
                class21.field332 = 96;
            }
        } else if (field509 == 130) {
            if (!Statics.field513.method3013()) {
                class21.field345 = class134.field2115 + Statics.field513.method3040() * 4 / 5 + "%";
                class21.field332 = 100;
            } else if (!Statics.field1795.method3013()) {
                class21.field345 = class134.field2115 + (80 + Statics.field1795.method3040() / 6) + "%";
                class21.field332 = 100;
            } else if (Statics.field102.method3013()) {
                class21.field345 = class134.field2315;
                class21.field332 = 100;
                field509 = 140;
            } else {
                class21.field345 = class134.field2115 + (96 + Statics.field102.method3040() / 20) + "%";
                class21.field332 = 100;
            }
        } else if (field509 == 140) {
            method67(10);
        }
    }

    @ObfuscatedName("az.o(IZZZI)Let;")
    public static class154 method257(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1449 != null) {
            var4 = new class71(arg0, class82.field1449, Statics.field2794[arg0], 1000000);
        }
        return new class154(var4, Statics.field125, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("a.z(B)V")
    public static final void method24() {
        try {
            if (field517 == 0) {
                if (Statics.field578 != null) {
                    Statics.field578.method1332();
                    Statics.field578 = null;
                }
                Statics.field525 = null;
                field604 = false;
                field646 = 0;
                field517 = 1;
            }
            if (field517 == 1) {
                if (Statics.field525 == null) {
                    Statics.field525 = Statics.field2466.method1439(Statics.field1463, Statics.field387);
                }
                if (Statics.field525.field1428 == 2) {
                    throw new IOException();
                }
                if (Statics.field525.field1428 == 1) {
                    Statics.field578 = new class70((Socket) Statics.field525.field1432, Statics.field2466);
                    Statics.field525 = null;
                    field517 = 2;
                }
            }
            if (field517 == 2) {
                field526.field2037 = 0;
                field526.method2397(14);
                Statics.field578.method1350(field526.field2039, 0, 1);
                field619.field2037 = 0;
                field517 = 3;
            }
            if (field517 == 3) {
                if (Statics.field2332 != null) {
                    Statics.field2332.method1144();
                }
                if (Statics.field217 != null) {
                    Statics.field217.method1144();
                }
                int var0 = Statics.field578.method1334();
                if (Statics.field2332 != null) {
                    Statics.field2332.method1144();
                }
                if (Statics.field217 != null) {
                    Statics.field217.method1144();
                }
                if (var0 != 0) {
                    method2148(var0);
                    return;
                }
                field619.field2037 = 0;
                field517 = 5;
            }
            if (field517 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field526.field2037 = 0;
                field526.method2397(10);
                field526.method2400(var1[0]);
                field526.method2400(var1[1]);
                field526.method2400(var1[2]);
                field526.method2400(var1[3]);
                field526.method2401(0L);
                field526.method2469(class21.field329);
                field526.method2429(class6.field85, class6.field93);
                field635.field2037 = 0;
                if (field489 == 40) {
                    field635.method2397(18);
                } else {
                    field635.method2397(16);
                }
                field635.method2398(0);
                int var2 = field635.field2037;
                field635.method2400(21);
                field635.method2405(field526.field2039, 0, field526.field2037);
                int var3 = field635.field2037;
                field635.method2469(class21.field336);
                field635.method2397(field487 ? 1 : 0);
                class116 var4 = field635;
                byte[] var5 = new byte[24];
                try {
                    class82.field1453.method569(0L);
                    class82.field1453.method583(var5);
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
                var4.method2405(var5, 0, 24);
                class127 var9 = new class127(Statics.field1346.method2925());
                Statics.field1346.method2923(var9);
                field635.method2405(var9.field2039, 0, var9.field2039.length);
                field635.method2400(Statics.field286.field2524);
                field635.method2400(Statics.field2083.field2524);
                field635.method2400(Statics.field2532.field2524);
                field635.method2400(Statics.field513.field2524);
                field635.method2400(Statics.field1756.field2524);
                field635.method2400(Statics.field275.field2524);
                field635.method2400(Statics.field514.field2524);
                field635.method2400(Statics.field361.field2524);
                field635.method2400(Statics.field1758.field2524);
                field635.method2400(Statics.field515.field2524);
                field635.method2400(Statics.field213.field2524);
                field635.method2400(Statics.field1321.field2524);
                field635.method2400(Statics.field1795.field2524);
                field635.method2400(Statics.field102.field2524);
                field635.method2400(Statics.field797.field2524);
                field635.method2400(Statics.field110.field2524);
                field635.method2427(var1, var3, field635.field2037);
                field635.method2407(field635.field2037 - var2);
                Statics.field578.method1350(field635.field2039, 0, field635.field2037);
                field526.method2264(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field619.method2264(var1);
                field517 = 6;
            }
            if (field517 == 6 && Statics.field578.method1335() > 0) {
                int var11 = Statics.field578.method1334();
                if (var11 == 21 && field489 == 20) {
                    field517 = 7;
                } else if (var11 == 2) {
                    field517 = 9;
                } else if (var11 == 15 && field489 == 40) {
                    field526.field2037 = 0;
                    field619.field2037 = 0;
                    field533 = -1;
                    field534 = -1;
                    field535 = -1;
                    field586 = -1;
                    field529 = 0;
                    field521 = 0;
                    field736 = 0;
                    field631 = 0;
                    field630 = false;
                    field722 = 0;
                    field632 = 0;
                    for (int var12 = 0; var12 < field608.length; var12++) {
                        if (field608[var12] != null) {
                            field608[var12].field442 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field522.length; var13++) {
                        if (field522[var13] != null) {
                            field522[var13].field442 = -1;
                        }
                    }
                    class19.method153();
                    method67(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field691[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field519 < 1) {
                    field519++;
                    field517 = 0;
                } else {
                    method2148(var11);
                    return;
                }
            }
            if (field517 == 7 && Statics.field578.method1335() > 0) {
                field520 = (Statics.field578.method1334() + 3) * 60;
                field517 = 8;
            }
            if (field517 == 8) {
                field646 = 0;
                class21.method2641(class134.field2160, class134.field2118, field520 / 60 + class134.field2235);
                if (--field520 <= 0) {
                    field517 = 0;
                }
            } else {
                if (field517 == 9 && Statics.field578.method1335() >= 8) {
                    field655 = Statics.field578.method1334();
                    field656 = Statics.field578.method1334() == 1;
                    field518 = Statics.field578.method1334();
                    field518 <<= 0x8;
                    field518 += Statics.field578.method1334();
                    field615 = Statics.field578.method1334();
                    Statics.field578.method1355(field619.field2039, 0, 1);
                    field619.field2037 = 0;
                    field533 = field619.method2268();
                    Statics.field578.method1355(field619.field2039, 0, 2);
                    field619.field2037 = 0;
                    field529 = field619.method2413();
                    if (field615 == 1) {
                        try {
                            class67.method1321(Statics.field2716, "zap");
                        } catch (Throwable var19) {
                        }
                    } else {
                        try {
                            class67.method1321(Statics.field2716, "unzap");
                        } catch (Throwable var18) {
                        }
                    }
                    field517 = 10;
                }
                if (field517 != 10) {
                    field646++;
                    if (field646 > 2000) {
                        if (field519 < 1) {
                            if (Statics.field524 == Statics.field387) {
                                Statics.field387 = Statics.field1347;
                            } else {
                                Statics.field387 = Statics.field524;
                            }
                            field519++;
                            field517 = 0;
                        } else {
                            method2148(-3);
                        }
                    }
                } else if (Statics.field578.method1335() >= field529) {
                    field619.field2037 = 0;
                    Statics.field578.method1355(field619.field2039, 0, field529);
                    method229();
                    Statics.field1345 = -1;
                    method143(false);
                    field533 = -1;
                }
            }
        } catch (IOException var21) {
            if (field519 < 1) {
                if (Statics.field524 == Statics.field387) {
                    Statics.field387 = Statics.field1347;
                } else {
                    Statics.field387 = Statics.field524;
                }
                field519++;
                field517 = 0;
            } else {
                method2148(-2);
            }
        }
    }

    @ObfuscatedName("r.k(I)V")
    public static void method229() {
        field745 = -1L;
        field495 = -1;
        Statics.field193.field260 = 0;
        Statics.field237 = true;
        field496 = true;
        field614 = -1L;
        class182.method3072();
        field526.field2037 = 0;
        field619.field2037 = 0;
        field533 = -1;
        field534 = -1;
        field535 = -1;
        field586 = -1;
        field521 = 0;
        field736 = 0;
        field492 = 0;
        field599 = 0;
        field631 = 0;
        field630 = false;
        class77.method180(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field702[var0] = null;
        }
        field703 = 0;
        field642 = 0;
        field644 = false;
        field481 = 0;
        field714 = (int) (Math.random() * 100.0D) - 50;
        field528 = (int) (Math.random() * 110.0D) - 55;
        field559 = (int) (Math.random() * 80.0D) - 40;
        field499 = (int) (Math.random() * 120.0D) - 60;
        field564 = (int) (Math.random() * 30.0D) - 20;
        field553 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field722 = 0;
        field715 = -1;
        field632 = 0;
        field706 = 0;
        field560 = 0;
        field523 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field608[var1] = null;
            field601[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field522[var2] = null;
        }
        Statics.field1358 = field608[2047] = new class3();
        field624.method3284();
        field625.method3284();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field622[var3][var4][var5] = null;
                }
            }
        }
        field623 = new class177();
        field741 = 0;
        field705 = 0;
        field638 = 0;
        for (int var6 = 0; var6 < Statics.field1043; var6++) {
            class42 var7 = (class42) class42.field1044.method3223((long) var6);
            class42 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field1047.method2932(16, var6);
                class42 var10 = new class42();
                if (var9 != null) {
                    var10.method867(new class127(var9));
                }
                class42.field1044.method3225(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null && var8.field1045 == 0) {
                class159.field2710[var6] = 0;
                class159.field2709[var6] = 0;
            }
        }
        for (int var12 = 0; var12 < field562.length; var12++) {
            field562[var12] = -1;
        }
        if (field648 != -1) {
            class158.method163(field648);
        }
        for (class4 var13 = (class4) field663.method3271(); var13 != null; var13 = (class4) field663.method3272()) {
            method809(var13, true);
        }
        field648 = -1;
        field663 = new class175(8);
        field652 = null;
        field630 = false;
        field631 = 0;
        field618.method3137((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var14 = 0; var14 < 8; var14++) {
            field552[var14] = null;
            field620[var14] = false;
        }
        class19.method153();
        field490 = true;
        for (int var15 = 0; var15 < 100; var15++) {
            field691[var15] = true;
        }
        field713 = null;
        Statics.field22 = 0;
        Statics.field1530 = null;
    }

    @ObfuscatedName("dy.y(II)V")
    public static void method2148(int arg0) {
        if (arg0 == -3) {
            class21.method2641(class134.field2120, class134.field2121, class134.field2122);
        } else if (arg0 == -2) {
            class21.method2641(class134.field2123, class134.field2242, class134.field2125);
        } else if (arg0 == -1) {
            class21.method2641(class134.field2126, class134.field2127, class134.field2128);
        } else if (arg0 == 3) {
            class21.method2641(class134.field2264, class134.field2130, class134.field2131);
        } else if (arg0 == 4) {
            class21.method2641(class134.field2132, class134.field2133, class134.field2134);
        } else if (arg0 == 5) {
            class21.method2641(class134.field2270, class134.field2136, class134.field2137);
        } else if (arg0 == 6) {
            class21.method2641(class134.field2217, class134.field2139, class134.field2140);
        } else if (arg0 == 7) {
            class21.method2641(class134.field2144, class134.field2219, class134.field2143);
        } else if (arg0 == 8) {
            class21.method2641(class134.field2105, class134.field2145, class134.field2103);
        } else if (arg0 == 9) {
            class21.method2641(class134.field2187, class134.field2148, class134.field2149);
        } else if (arg0 == 10) {
            class21.method2641(class134.field2216, class134.field2207, class134.field2152);
        } else if (arg0 == 11) {
            class21.method2641(class134.field2153, class134.field2310, class134.field2155);
        } else if (arg0 == 12) {
            class21.method2641(class134.field2156, class134.field2309, class134.field2158);
        } else if (arg0 == 13) {
            class21.method2641(class134.field2159, class134.field2200, class134.field2161);
        } else if (arg0 == 14) {
            class21.method2641(class134.field2162, class134.field2297, class134.field2304);
        } else if (arg0 == 16) {
            class21.method2641(class134.field2171, class134.field2191, class134.field2097);
        } else if (arg0 == 17) {
            class21.method2641(class134.field2253, class134.field2169, class134.field2119);
        } else if (arg0 == 18) {
            class21.method2641(class134.field2238, class134.field2166, class134.field2173);
        } else if (arg0 == 19) {
            class21.method2641(class134.field2174, class134.field2146, class134.field2176);
        } else if (arg0 == 20) {
            class21.method2641(class134.field2177, class134.field2178, class134.field2142);
        } else if (arg0 == 22) {
            class21.method2641(class134.field2180, class134.field2181, class134.field2088);
        } else if (arg0 == 23) {
            class21.method2641(class134.field2163, class134.field2314, class134.field2220);
        } else if (arg0 == 24) {
            class21.method2641(class134.field2186, class134.field2151, class134.field2188);
        } else if (arg0 == 25) {
            class21.method2641(class134.field2224, class134.field2135, class134.field2165);
        } else if (arg0 == 26) {
            class21.method2641(class134.field2192, class134.field2092, class134.field2194);
        } else if (arg0 == 27) {
            class21.method2641(class134.field2195, class134.field2295, class134.field2258);
        } else if (arg0 == 31) {
            class21.method2641(class134.field2190, class134.field2221, class134.field2206);
        } else if (arg0 == 32) {
            class21.method2641(class134.field2184, class134.field2208, class134.field2209);
        } else if (arg0 == 37) {
            class21.method2641(class134.field2210, class134.field2211, class134.field2212);
        } else if (arg0 == 38) {
            class21.method2641(class134.field2249, class134.field2094, class134.field2215);
        } else if (arg0 == 55) {
            class21.method2641(class134.field2204, class134.field2284, class134.field2218);
        } else {
            class21.method2641(class134.field2279, class134.field2288, class134.field2098);
        }
        method67(10);
    }

    @ObfuscatedName("f.g(I)V")
    public static final void method132() {
        if (Statics.field578 != null) {
            Statics.field578.method1332();
            Statics.field578 = null;
        }
        method1331();
        Statics.field545.method1805();
        for (int var0 = 0; var0 < 4; var0++) {
            field494[var0].method3181();
        }
        System.gc();
        class138.method2662(2);
        field724 = -1;
        field681 = false;
        class7.method556();
        method67(10);
    }

    @ObfuscatedName("bs.e(B)V")
    public static final void method1331() {
        class37.method1304();
        class33.method2659();
        class36.field935.method3226();
        class32.field823.method3226();
        class32.field821.method3226();
        class32.field825.method3226();
        class32.field840.method3226();
        class31.field784.method3226();
        class31.field785.method3226();
        class40.field990.method3226();
        class40.field991.method3226();
        class40.field992.method3226();
        class34.field888.method3226();
        class34.field893.method3226();
        class35.field910.method3226();
        class35.field911.method3226();
        Statics.method36();
        class42.method811();
        class163.method2642();
        class158.field2659.method3226();
        class158.field2587.method3226();
        class158.field2674.method3226();
        ((class110) Statics.field1786).method2157();
        class5.field80.method3226();
        Statics.field286.method2982();
        Statics.field2083.method2982();
        Statics.field513.method2982();
        Statics.field1756.method2982();
        Statics.field275.method2982();
        Statics.field514.method2982();
        Statics.field361.method2982();
        Statics.field1758.method2982();
        Statics.field515.method2982();
        Statics.field213.method2982();
        Statics.field1321.method2982();
        Statics.field1795.method2982();
    }

    @ObfuscatedName("al.s(B)V")
    public static final void method787() {
        if (field492 > 0) {
            method132();
        } else {
            method67(40);
            Statics.field758 = Statics.field578;
            Statics.field578 = null;
        }
    }

    @ObfuscatedName("cx.r(Lag;IIII)V")
    public static void method1976(class34 arg0, int arg1, int arg2, int arg3) {
        if (field481 >= 50 || field727 == 0 || arg0.field887 == null || arg1 >= arg0.field887.length) {
            return;
        }
        int var4 = arg0.field887[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field711[field481] = var5;
        field730[field481] = var6;
        field731[field481] = 0;
        field733[field481] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field556[field481] = (var8 << 16) + (var9 << 8) + var7;
        field481++;
    }

    @ObfuscatedName("cg.w(IIB)V")
    public static void method1979(int arg0, int arg1) {
        if (field682 != 0 && arg0 != -1) {
            class138.method2650(Statics.field1321, arg0, 0, field682, false);
            field681 = true;
        }
    }

    @ObfuscatedName("az.x(B)V")
    public static final void method267() {
        if (field487 && Statics.field30 != field539) {
            method810(Statics.field1345, Statics.field15, Statics.field30, Statics.field1358.field471[0], Statics.field1358.field472[0]);
        } else if (Statics.field30 != field715) {
            field715 = Statics.field30;
            int var0 = Statics.field30;
            int[] var1 = Statics.field36.field1482;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field134[var0][var6][var4] & 0x18) == 0) {
                        Statics.field545.method1828(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field134[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field545.method1828(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field36.method1616();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field134[var0][var10][var9] & 0x18) == 0) {
                        Statics.method46(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field134[var0 + 1][var10][var9] & 0x8) != 0) {
                        Statics.method46(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field567 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field545.method1849(Statics.field30, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class32.method1460(var14).field849;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field494[Statics.field30].field2755;
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
                            field719[field567] = Statics.field871[var15];
                            field717[field567] = var16;
                            field718[field567] = var17;
                            field567++;
                        }
                    }
                }
            }
            Statics.field379.method1606();
        }
    }

    @ObfuscatedName("cd.n(III)V")
    public static final void method1785(int arg0, int arg1) {
        if (field722 != 0 && field722 != 3 || class77.field1412 != 1) {
            return;
        }
        int var2 = class77.field1415 - 25 - arg0;
        int var3 = class77.field1416 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field553 + field499 & 0x7FF;
        int var5 = class104.field1789[var4];
        int var6 = class104.field1781[var4];
        int var7 = (field564 + 256) * var5 >> 8;
        int var8 = (field564 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1358.field462 + var9 >> 7;
        int var12 = Statics.field1358.field470 - var10 >> 7;
        boolean var13 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field526.method2397(var2);
        field526.method2397(var3);
        field526.method2398(field553);
        field526.method2397(57);
        field526.method2397(field499);
        field526.method2397(field564);
        field526.method2397(89);
        field526.method2398(Statics.field1358.field462);
        field526.method2398(Statics.field1358.field470);
        field526.method2397(field550);
        field526.method2397(63);
    }

    @ObfuscatedName("l.c(Ljava/lang/String;I)V")
    public static final void method33(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field1048.field203 = !Statics.field1048.field203;
            class12.method2917();
            if (Statics.field1048.field203) {
                Statics.method3033(0, "", "Roofs are now all hidden");
            } else {
                Statics.method3033(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field655 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method787();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field497 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field497 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field494[var1].field2755[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field483 == 2) {
                throw new RuntimeException();
            }
        }
        field526.method2265(189);
        field526.method2397(arg0.length() - 1);
        field526.method2469(arg0.substring(2));
    }

    @ObfuscatedName("bc.az(I)V")
    public static final void method1330() {
        int var0 = Statics.field124 * 128 + 64;
        int var1 = Statics.field1820 * 128 + 64;
        int var2 = method1492(var0, var1, Statics.field30) - Statics.field2010;
        if (Statics.field1626 < var0) {
            Statics.field1626 += Statics.field52 * (var0 - Statics.field1626) / 1000 + Statics.field754;
            if (Statics.field1626 > var0) {
                Statics.field1626 = var0;
            }
        }
        if (Statics.field1626 > var0) {
            Statics.field1626 -= Statics.field52 * (Statics.field1626 - var0) / 1000 + Statics.field754;
            if (Statics.field1626 < var0) {
                Statics.field1626 = var0;
            }
        }
        if (Statics.field1793 < var2) {
            Statics.field1793 += Statics.field52 * (var2 - Statics.field1793) / 1000 + Statics.field754;
            if (Statics.field1793 > var2) {
                Statics.field1793 = var2;
            }
        }
        if (Statics.field1793 > var2) {
            Statics.field1793 -= Statics.field52 * (Statics.field1793 - var2) / 1000 + Statics.field754;
            if (Statics.field1793 < var2) {
                Statics.field1793 = var2;
            }
        }
        if (Statics.field1981 < var1) {
            Statics.field1981 += Statics.field52 * (var1 - Statics.field1981) / 1000 + Statics.field754;
            if (Statics.field1981 > var1) {
                Statics.field1981 = var1;
            }
        }
        if (Statics.field1981 > var1) {
            Statics.field1981 -= Statics.field52 * (Statics.field1981 - var1) / 1000 + Statics.field754;
            if (Statics.field1981 < var1) {
                Statics.field1981 = var1;
            }
        }
        int var3 = Statics.field1401 * 128 + 64;
        int var4 = Statics.field2550 * 128 + 64;
        int var5 = method1492(var3, var4, Statics.field30) - Statics.field61;
        int var6 = var3 - Statics.field1626;
        int var7 = var5 - Statics.field1793;
        int var8 = var4 - Statics.field1981;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1040 < var10) {
            Statics.field1040 += Statics.field1283 * (var10 - Statics.field1040) / 1000 + Statics.field1307;
            if (Statics.field1040 > var10) {
                Statics.field1040 = var10;
            }
        }
        if (Statics.field1040 > var10) {
            Statics.field1040 -= Statics.field1283 * (Statics.field1040 - var10) / 1000 + Statics.field1307;
            if (Statics.field1040 < var10) {
                Statics.field1040 = var10;
            }
        }
        int var12 = var11 - Statics.field151;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field151 += Statics.field1283 * var12 / 1000 + Statics.field1307;
            Statics.field151 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field151 -= Statics.field1283 * -var12 / 1000 + Statics.field1307;
            Statics.field151 &= 0x7FF;
        }
        int var13 = var11 - Statics.field151;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field151 = var11;
        }
    }

    @ObfuscatedName("p.ax(B)V")
    public static final void method12() {
        int var0 = field714 + Statics.field1358.field462;
        int var1 = field528 + Statics.field1358.field470;
        if (Statics.field378 - var0 < -500 || Statics.field378 - var0 > 500 || Statics.field1299 - var1 < -500 || Statics.field1299 - var1 > 500) {
            Statics.field378 = var0;
            Statics.field1299 = var1;
        }
        if (Statics.field378 != var0) {
            Statics.field378 += (var0 - Statics.field378) / 16;
        }
        if (Statics.field1299 != var1) {
            Statics.field1299 += (var1 - Statics.field1299) / 16;
        }
        if (class75.field1384[96]) {
            field576 += (-24 - field576) / 2;
        } else if (class75.field1384[97]) {
            field576 += (24 - field576) / 2;
        } else {
            field576 /= 2;
        }
        if (class75.field1384[98]) {
            field577 += (12 - field577) / 2;
        } else if (class75.field1384[99]) {
            field577 += (-12 - field577) / 2;
        } else {
            field577 /= 2;
        }
        field553 = field576 / 2 + field553 & 0x7FF;
        field574 += field577 / 2;
        if (field574 < 128) {
            field574 = 128;
        }
        if (field574 > 383) {
            field574 = 383;
        }
        int var2 = Statics.field378 >> 7;
        int var3 = Statics.field1299 >> 7;
        int var4 = method1492(Statics.field378, Statics.field1299, Statics.field30);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field30;
                    if (var8 < 3 && (class9.field134[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class9.field141[var8][var6][var7];
                    if (var9 > var5) {
                        var5 = var9;
                    }
                }
            }
        }
        int var10 = var5 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > field673) {
            field673 += (var10 - field673) / 24;
        } else if (var10 < field673) {
            field673 += (var10 - field673) / 80;
        }
    }

    @ObfuscatedName("ai.aq(I)V")
    public static final void method660() {
        for (int var0 = -1; var0 < field560; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field744[var0];
            }
            class3 var2 = field608[var1];
            if (var2 != null) {
                method227(var2, 1);
            }
        }
    }

    @ObfuscatedName("r.ap(Laz;II)V")
    public static final void method227(class27 arg0, int arg1) {
        if (arg0.field466 > field491) {
            int var2 = arg0.field466 - field491;
            int var3 = arg0.field458 * 128 + arg0.field423 * 64;
            int var4 = arg0.field429 * 128 + arg0.field423 * 64;
            arg0.field462 += (var3 - arg0.field462) / var2;
            arg0.field470 += (var4 - arg0.field470) / var2;
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
        } else if (arg0.field448 >= field491) {
            method34(arg0);
        } else {
            method1786(arg0);
        }
        if (arg0.field462 < 128 || arg0.field470 < 128 || arg0.field462 >= 13184 || arg0.field470 >= 13184) {
            arg0.field452 = -1;
            arg0.field453 = -1;
            arg0.field466 = 0;
            arg0.field448 = 0;
            arg0.field462 = arg0.field471[0] * 128 + arg0.field423 * 64;
            arg0.field470 = arg0.field472[0] * 128 + arg0.field423 * 64;
            arg0.method270();
        }
        if (Statics.field1358 == arg0 && (arg0.field462 < 1536 || arg0.field470 < 1536 || arg0.field462 >= 11776 || arg0.field470 >= 11776)) {
            arg0.field452 = -1;
            arg0.field453 = -1;
            arg0.field466 = 0;
            arg0.field448 = 0;
            arg0.field462 = arg0.field471[0] * 128 + arg0.field423 * 64;
            arg0.field470 = arg0.field472[0] * 128 + arg0.field423 * 64;
            arg0.method270();
        }
        if (arg0.field440 != 0) {
            if (arg0.field442 != -1 && arg0.field442 < 32768) {
                class25 var5 = field522[arg0.field442];
                if (var5 != null) {
                    int var6 = arg0.field462 - var5.field462;
                    int var7 = arg0.field470 - var5.field470;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field467 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field442 >= 32768) {
                int var8 = arg0.field442 - 32768;
                if (field518 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field608[var8];
                if (var9 != null) {
                    int var10 = arg0.field462 - var9.field462;
                    int var11 = arg0.field470 - var9.field470;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field467 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field443 != 0 || arg0.field444 != 0) && (arg0.field455 == 0 || arg0.field474 > 0)) {
                int var12 = arg0.field462 - (arg0.field443 * 64 - Statics.field287 * 64 - Statics.field287 * 64);
                int var13 = arg0.field470 - (arg0.field444 * 64 - Statics.field364 * 64 - Statics.field364 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field467 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field443 = 0;
                arg0.field444 = 0;
            }
            int var14 = arg0.field467 - arg0.field476 & 0x7FF;
            if (var14 == 0) {
                arg0.field468 = 0;
            } else {
                arg0.field468++;
                if (var14 > 1024) {
                    arg0.field476 -= arg0.field440;
                    boolean var15 = true;
                    if (var14 < arg0.field440 || var14 > 2048 - arg0.field440) {
                        arg0.field476 = arg0.field467;
                        var15 = false;
                    }
                    if (arg0.field445 == arg0.field424 && (arg0.field468 > 25 || var15)) {
                        if (arg0.field469 == -1) {
                            arg0.field445 = arg0.field427;
                        } else {
                            arg0.field445 = arg0.field469;
                        }
                    }
                } else {
                    arg0.field476 += arg0.field440;
                    boolean var16 = true;
                    if (var14 < arg0.field440 || var14 > 2048 - arg0.field440) {
                        arg0.field476 = arg0.field467;
                        var16 = false;
                    }
                    if (arg0.field445 == arg0.field424 && (arg0.field468 > 25 || var16)) {
                        if (arg0.field421 == -1) {
                            arg0.field445 = arg0.field427;
                        } else {
                            arg0.field445 = arg0.field421;
                        }
                    }
                }
                arg0.field476 &= 0x7FF;
            }
        }
        method107(arg0);
    }

    @ObfuscatedName("l.aa(Laz;I)V")
    public static final void method34(class27 arg0) {
        if (field491 == arg0.field448 || arg0.field452 == -1 || arg0.field451 != 0 || arg0.field450 + 1 > class34.method763(arg0.field452).field892[arg0.field449]) {
            int var1 = arg0.field448 - arg0.field466;
            int var2 = field491 - arg0.field466;
            int var3 = arg0.field458 * 128 + arg0.field423 * 64;
            int var4 = arg0.field429 * 128 + arg0.field423 * 64;
            int var5 = arg0.field459 * 128 + arg0.field423 * 64;
            int var6 = arg0.field461 * 128 + arg0.field423 * 64;
            arg0.field462 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field470 = ((var1 - var2) * var4 + var2 * var6) / var1;
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
        arg0.field476 = arg0.field467;
    }

    @ObfuscatedName("cd.ai(Laz;I)V")
    public static final void method1786(class27 arg0) {
        arg0.field445 = arg0.field424;
        if (arg0.field455 == 0) {
            arg0.field474 = 0;
            return;
        }
        if (arg0.field452 != -1 && arg0.field451 == 0) {
            class34 var1 = class34.method763(arg0.field452);
            if (arg0.field475 > 0 && var1.field902 == 0) {
                arg0.field474++;
                return;
            }
            if (arg0.field475 <= 0 && var1.field896 == 0) {
                arg0.field474++;
                return;
            }
        }
        int var2 = arg0.field462;
        int var3 = arg0.field470;
        int var4 = arg0.field471[arg0.field455 - 1] * 128 + arg0.field423 * 64;
        int var5 = arg0.field472[arg0.field455 - 1] * 128 + arg0.field423 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field462 = var4;
            arg0.field470 = var5;
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
        int var6 = arg0.field467 - arg0.field476 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field428;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field427;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field419;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field425;
        }
        if (var7 == -1) {
            var7 = arg0.field427;
        }
        arg0.field445 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field402.field795;
        }
        if (var9) {
            if (arg0.field476 != arg0.field467 && arg0.field442 == -1 && arg0.field440 != 0) {
                var8 = 2;
            }
            if (arg0.field455 > 2) {
                var8 = 6;
            }
            if (arg0.field455 > 3) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field455 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        } else {
            if (arg0.field455 > 1) {
                var8 = 6;
            }
            if (arg0.field455 > 2) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field455 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        }
        if (arg0.field437[arg0.field455 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field445 == arg0.field427 && arg0.field431 != -1) {
            arg0.field445 = arg0.field431;
        }
        if (var2 < var4) {
            arg0.field462 += var8;
            if (arg0.field462 > var4) {
                arg0.field462 = var4;
            }
        } else if (var2 > var4) {
            arg0.field462 -= var8;
            if (arg0.field462 < var4) {
                arg0.field462 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field470 += var8;
            if (arg0.field470 > var5) {
                arg0.field470 = var5;
            }
        } else if (var3 > var5) {
            arg0.field470 -= var8;
            if (arg0.field470 < var5) {
                arg0.field470 = var5;
            }
        }
        if (arg0.field462 == var4 && arg0.field470 == var5) {
            arg0.field455--;
            if (arg0.field475 > 0) {
                arg0.field475--;
            }
        }
    }

    @ObfuscatedName("m.ar(Laz;I)V")
    public static final void method107(class27 arg0) {
        arg0.field422 = false;
        if (arg0.field445 != -1) {
            class34 var1 = class34.method763(arg0.field445);
            if (var1 == null || var1.field890 == null) {
                arg0.field445 = -1;
            } else {
                arg0.field447++;
                if (arg0.field433 < var1.field890.length && arg0.field447 > var1.field892[arg0.field433]) {
                    arg0.field447 = 1;
                    arg0.field433++;
                    method1976(var1, arg0.field433, arg0.field462, arg0.field470);
                }
                if (arg0.field433 >= var1.field890.length) {
                    arg0.field447 = 0;
                    arg0.field433 = 0;
                    method1976(var1, arg0.field433, arg0.field462, arg0.field470);
                }
            }
        }
        if (arg0.field453 != -1 && field491 >= arg0.field456) {
            if (arg0.field454 < 0) {
                arg0.field454 = 0;
            }
            int var2 = class35.method37(arg0.field453).field914;
            if (var2 == -1) {
                arg0.field453 = -1;
            } else {
                class34 var3 = class34.method763(var2);
                if (var3 == null || var3.field890 == null) {
                    arg0.field453 = -1;
                } else {
                    arg0.field463++;
                    if (arg0.field454 < var3.field890.length && arg0.field463 > var3.field892[arg0.field454]) {
                        arg0.field463 = 1;
                        arg0.field454++;
                        method1976(var3, arg0.field454, arg0.field462, arg0.field470);
                    }
                    if (arg0.field454 >= var3.field890.length && (arg0.field454 < 0 || arg0.field454 >= var3.field890.length)) {
                        arg0.field453 = -1;
                    }
                }
            }
        }
        if (arg0.field452 != -1 && arg0.field451 <= 1) {
            class34 var4 = class34.method763(arg0.field452);
            if (var4.field902 == 1 && arg0.field475 > 0 && arg0.field466 <= field491 && arg0.field448 < field491) {
                arg0.field451 = 1;
                return;
            }
        }
        if (arg0.field452 != -1 && arg0.field451 == 0) {
            class34 var5 = class34.method763(arg0.field452);
            if (var5 == null || var5.field890 == null) {
                arg0.field452 = -1;
            } else {
                arg0.field450++;
                if (arg0.field449 < var5.field890.length && arg0.field450 > var5.field892[arg0.field449]) {
                    arg0.field450 = 1;
                    arg0.field449++;
                    method1976(var5, arg0.field449, arg0.field462, arg0.field470);
                }
                if (arg0.field449 >= var5.field890.length) {
                    arg0.field449 -= var5.field894;
                    arg0.field441++;
                    if (arg0.field441 >= var5.field900) {
                        arg0.field452 = -1;
                    } else if (arg0.field449 >= 0 && arg0.field449 < var5.field890.length) {
                        method1976(var5, arg0.field449, arg0.field462, arg0.field470);
                    } else {
                        arg0.field452 = -1;
                    }
                }
                arg0.field422 = var5.field901;
            }
        }
        if (arg0.field451 > 0) {
            arg0.field451--;
        }
    }

    @ObfuscatedName("ap.ag(La;IIB)V")
    public static void method580(class3 arg0, int arg1, int arg2) {
        if (arg0.field452 == arg1 && arg1 != -1) {
            int var3 = class34.method763(arg1).field903;
            if (var3 == 1) {
                arg0.field449 = 0;
                arg0.field450 = 0;
                arg0.field451 = arg2;
                arg0.field441 = 0;
            }
            if (var3 == 2) {
                arg0.field441 = 0;
            }
        } else if (arg1 == -1 || arg0.field452 == -1 || class34.method763(arg1).field897 >= class34.method763(arg0.field452).field897) {
            arg0.field452 = arg1;
            arg0.field449 = 0;
            arg0.field450 = 0;
            arg0.field451 = arg2;
            arg0.field441 = 0;
            arg0.field475 = arg0.field455;
        }
    }

    @ObfuscatedName("as.as(I)V")
    public static final void method727() {
        if (!field630) {
            field507[0] = class134.field2300;
            field530[0] = "";
            field592[0] = 1006;
            field631 = 1;
        }
        if (field648 != -1) {
            method1574(field648);
        }
        for (int var0 = 0; var0 < field689; var0++) {
            if (field691[var0]) {
                field692[var0] = true;
            }
            field512[var0] = field691[var0];
            field691[var0] = false;
        }
        field580 = field491;
        field688 = -1;
        field721 = -1;
        Statics.field1442 = null;
        if (field648 != -1) {
            field689 = 0;
            int var1 = field648;
            if (Statics.method2702(var1)) {
                Statics.field2470 = null;
                method686(Statics.field2595[var1], -1, 0, 0, 765, 503, 0, 0, -1);
                if (Statics.field2470 != null) {
                    method686(Statics.field2470, -1412584499, 0, 0, 765, 503, Statics.field31, Statics.field368, -1);
                    Statics.field2470 = null;
                }
            } else {
                for (int var2 = 0; var2 < 100; var2++) {
                    field691[var2] = true;
                }
            }
        }
        class89.method1752();
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < field631 - 1; var4++) {
                if (field592[var4] < 1000 && field592[var4 + 1] > 1000) {
                    String var5 = field530[var4];
                    field530[var4] = field530[var4 + 1];
                    field530[var4 + 1] = var5;
                    String var6 = field507[var4];
                    field507[var4] = field507[var4 + 1];
                    field507[var4 + 1] = var6;
                    int var7 = field592[var4];
                    field592[var4] = field592[var4 + 1];
                    field592[var4 + 1] = var7;
                    int var8 = field557[var4];
                    field557[var4] = field557[var4 + 1];
                    field557[var4 + 1] = var8;
                    int var9 = field633[var4];
                    field633[var4] = field633[var4 + 1];
                    field633[var4 + 1] = var9;
                    int var10 = field548[var4];
                    field548[var4] = field548[var4 + 1];
                    field548[var4 + 1] = var10;
                    var3 = false;
                }
            }
        }
        if (field630) {
            int var16 = Statics.field195;
            int var17 = Statics.field81;
            int var18 = Statics.field1323;
            int var19 = Statics.field398;
            int var20 = 6116423;
            class89.method1772(var16, var17, var18, var19, var20);
            class89.method1772(var16 + 1, var17 + 1, var18 - 2, 16, 0);
            class89.method1722(var16 + 1, var17 + 18, var18 - 2, var19 - 19, 0);
            Statics.field1397.method3351(class134.field2230, var16 + 3, var17 + 14, var20, -1);
            int var21 = class77.field1408;
            int var22 = class77.field1409;
            for (int var23 = 0; var23 < field631; var23++) {
                int var24 = (field631 - 1 - var23) * 15 + var17 + 31;
                int var25 = 16777215;
                if (var21 > var16 && var21 < var16 + var18 && var22 > var24 - 13 && var22 < var24 + 3) {
                    var25 = 16776960;
                }
                class183 var26 = Statics.field1397;
                String var27;
                if (field530[var23].length() > 0) {
                    var27 = field507[var23] + class134.field2168 + field530[var23];
                } else {
                    var27 = field507[var23];
                }
                var26.method3351(var27, var16 + 3, var24, var25, 0);
            }
            method150(Statics.field195, Statics.field81, Statics.field1323, Statics.field398);
        } else if (field688 != -1) {
            int var11 = field688;
            int var12 = field721;
            if (field631 >= 2 || field642 != 0 || field644) {
                String var13;
                if (field642 == 1 && field631 < 2) {
                    var13 = class134.field2227 + class134.field2168 + field643 + " " + class2.field21;
                } else if (field644 && field631 < 2) {
                    var13 = field504 + class134.field2168 + field647 + " " + class2.field21;
                } else {
                    int var14 = field631 - 1;
                    String var15;
                    if (field530[var14].length() > 0) {
                        var15 = field507[var14] + class134.field2168 + field530[var14];
                    } else {
                        var15 = field507[var14];
                    }
                    var13 = var15;
                }
                if (field631 > 2) {
                    var13 = var13 + class2.method2648(16777215) + " " + '/' + " " + (field631 - 2) + class134.field2282;
                }
                Statics.field1397.method3343(var13, var11 + 4, var12 + 15, 16777215, 0, field491 / 1000);
            }
        }
        if (field698 == 3) {
            for (int var28 = 0; var28 < field689; var28++) {
                if (field512[var28]) {
                    class89.method1750(field694[var28], field596[var28], field696[var28], field536[var28], 16711935, 128);
                } else if (field692[var28]) {
                    class89.method1750(field694[var28], field596[var28], field696[var28], field536[var28], 16711680, 128);
                }
            }
        }
        int var29 = Statics.field30;
        int var30 = Statics.field1358.field462;
        int var31 = Statics.field1358.field470;
        int var32 = field683;
        for (class7 var33 = (class7) class7.field112.method3313(); var33 != null; var33 = (class7) class7.field112.method3292()) {
            if (var33.field113 != -1 || var33.field114 != null) {
                int var34 = 0;
                if (var30 > var33.field104) {
                    var34 += var30 - var33.field104;
                } else if (var30 < var33.field96) {
                    var34 += var33.field96 - var30;
                }
                if (var31 > var33.field99) {
                    var34 += var31 - var33.field99;
                } else if (var31 < var33.field97) {
                    var34 += var33.field97 - var31;
                }
                if (var34 - 64 > var33.field100 || field727 == 0 || var33.field95 != var29) {
                    if (var33.field103 != null) {
                        Statics.field2325.method1058(var33.field103);
                        var33.field103 = null;
                    }
                    if (var33.field107 != null) {
                        Statics.field2325.method1058(var33.field107);
                        var33.field107 = null;
                    }
                } else {
                    var34 -= 64;
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    int var35 = field727 * (var33.field100 - var34) / var33.field100;
                    class57 var10000;
                    if (var33.field103 != null) {
                        var33.field103.method925(var35);
                    } else if (var33.field113 >= 0) {
                        var10000 = (class57) null;
                        class57 var36 = class57.method1215(Statics.field1756, var33.field113, 0);
                        if (var36 != null) {
                            class63 var37 = var36.method1218().method1270(Statics.field1977);
                            class45 var38 = class45.method963(var37, 100, var35);
                            var38.method1040(-1);
                            Statics.field2325.method1057(var38);
                            var33.field103 = var38;
                        }
                    }
                    if (var33.field107 != null) {
                        var33.field107.method925(var35);
                        if (!var33.field107.method3318()) {
                            var33.field107 = null;
                        }
                    } else if (var33.field114 != null && (var33.field98 -= var32) <= 0) {
                        int var39 = (int) (Math.random() * (double) var33.field114.length);
                        var10000 = (class57) null;
                        class57 var40 = class57.method1215(Statics.field1756, var33.field114[var39], 0);
                        if (var40 != null) {
                            class63 var41 = var40.method1218().method1270(Statics.field1977);
                            class45 var42 = class45.method963(var41, 100, var35);
                            var42.method1040(0);
                            Statics.field2325.method1057(var42);
                            var33.field107 = var42;
                            var33.field98 = var33.field94 + (int) (Math.random() * (double) (var33.field111 - var33.field94));
                        }
                    }
                }
            }
        }
        field683 = 0;
    }

    @ObfuscatedName("ch.ak(Ljava/lang/String;ZI)V")
    public static final void method1534(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field697.method3348(arg0, 250);
        int var6 = Statics.field697.method3349(arg0, 250) * 13;
        class89.method1772(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1722(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field697.method3354(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method573(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method150(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field962.getGraphics();
            Statics.field379.method1573(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field962.repaint();
        }
    }

    @ObfuscatedName("j.al(IIIIS)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3) {
        class89.method1714(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2062();
        field575++;
        method1981(true);
        method2915(true);
        method1981(false);
        method2915(false);
        for (class10 var4 = (class10) field624.method3313(); var4 != null; var4 = (class10) field624.method3292()) {
            if (Statics.field30 != var4.field162 || field491 > var4.field181) {
                var4.method3319();
            } else if (field491 >= var4.field167) {
                if (var4.field171 > 0) {
                    class25 var5 = field522[var4.field171 - 1];
                    if (var5 != null && var5.field462 >= 0 && var5.field462 < 13312 && var5.field470 >= 0 && var5.field470 < 13312) {
                        var4.method110(var5.field462, var5.field470, method1492(var5.field462, var5.field470, var4.field162) - var4.field166, field491);
                    }
                }
                if (var4.field171 < 0) {
                    int var6 = -var4.field171 - 1;
                    class3 var7;
                    if (field518 == var6) {
                        var7 = Statics.field1358;
                    } else {
                        var7 = field608[var6];
                    }
                    if (var7 != null && var7.field462 >= 0 && var7.field462 < 13312 && var7.field470 >= 0 && var7.field470 < 13312) {
                        var4.method110(var7.field462, var7.field470, method1492(var7.field462, var7.field470, var4.field162) - var4.field166, field491);
                    }
                }
                var4.method116(field683);
                Statics.field545.method1963(Statics.field30, (int) var4.field173, (int) var4.field174, (int) var4.field175, 60, var4, var4.field177, -1, false);
            }
        }
        for (class20 var8 = (class20) field625.method3313(); var8 != null; var8 = (class20) field625.method3292()) {
            if (Statics.field30 != var8.field302 || var8.field311) {
                var8.method3319();
            } else if (field491 >= var8.field308) {
                var8.method176(field683);
                if (var8.field311) {
                    var8.method3319();
                } else {
                    Statics.field545.method1963(var8.field302, var8.field305, var8.field303, var8.field307, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field561) {
            int var9 = field574;
            if (field673 / 256 > var9) {
                var9 = field673 / 256;
            }
            if (field735[4] && field737[4] + 128 > var9) {
                var9 = field737[4] + 128;
            }
            int var10 = field559 + field553 & 0x7FF;
            int var11 = Statics.field378;
            int var12 = method1492(Statics.field1358.field462, Statics.field1358.field470, Statics.field30) - 50;
            int var13 = Statics.field1299;
            int var14 = var9 * 3 + 600;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 2048 - var10 & 0x7FF;
            int var17 = 0;
            int var18 = 0;
            int var19 = var14;
            if (var15 != 0) {
                int var20 = class104.field1789[var15];
                int var21 = class104.field1781[var15];
                int var22 = var18 * var21 - var14 * var20 >> 16;
                var19 = var18 * var20 + var14 * var21 >> 16;
                var18 = var22;
            }
            if (var16 != 0) {
                int var23 = class104.field1789[var16];
                int var24 = class104.field1781[var16];
                int var25 = var17 * var24 + var19 * var23 >> 16;
                var19 = var19 * var24 - var17 * var23 >> 16;
                var17 = var25;
            }
            Statics.field1626 = var11 - var17;
            Statics.field1793 = var12 - var18;
            Statics.field1981 = var13 - var19;
            Statics.field1040 = var9;
            Statics.field151 = var10;
        }
        int var38;
        if (field561) {
            int var39;
            if (Statics.field1048.field203) {
                var39 = Statics.field30;
            } else {
                int var40 = method1492(Statics.field1626, Statics.field1981, Statics.field30);
                if (var40 - Statics.field1793 >= 800 || (class9.field134[Statics.field30][Statics.field1626 >> 7][Statics.field1981 >> 7] & 0x4) == 0) {
                    var39 = 3;
                } else {
                    var39 = Statics.field30;
                }
            }
            var38 = var39;
        } else {
            int var26;
            if (Statics.field1048.field203) {
                var26 = Statics.field30;
            } else {
                int var27 = 3;
                if (Statics.field1040 < 310) {
                    int var28 = Statics.field1626 >> 7;
                    int var29 = Statics.field1981 >> 7;
                    int var30 = Statics.field1358.field462 >> 7;
                    int var31 = Statics.field1358.field470 >> 7;
                    if ((class9.field134[Statics.field30][var28][var29] & 0x4) != 0) {
                        var27 = Statics.field30;
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
                            if ((class9.field134[Statics.field30][var28][var29] & 0x4) != 0) {
                                var27 = Statics.field30;
                            }
                            var35 += var34;
                            if (var35 >= 65536) {
                                var35 -= 65536;
                                if (var29 < var31) {
                                    var29++;
                                } else if (var29 > var31) {
                                    var29--;
                                }
                                if ((class9.field134[Statics.field30][var28][var29] & 0x4) != 0) {
                                    var27 = Statics.field30;
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
                            if ((class9.field134[Statics.field30][var28][var29] & 0x4) != 0) {
                                var27 = Statics.field30;
                            }
                            var37 += var36;
                            if (var37 >= 65536) {
                                var37 -= 65536;
                                if (var28 < var30) {
                                    var28++;
                                } else if (var28 > var30) {
                                    var28--;
                                }
                                if ((class9.field134[Statics.field30][var28][var29] & 0x4) != 0) {
                                    var27 = Statics.field30;
                                }
                            }
                        }
                    }
                }
                if ((class9.field134[Statics.field30][Statics.field1358.field462 >> 7][Statics.field1358.field470 >> 7] & 0x4) != 0) {
                    var27 = Statics.field30;
                }
                var26 = var27;
            }
            var38 = var26;
        }
        int var41 = Statics.field1626;
        int var42 = Statics.field1793;
        int var43 = Statics.field1981;
        int var44 = Statics.field1040;
        int var45 = Statics.field151;
        for (int var46 = 0; var46 < 5; var46++) {
            if (field735[var46]) {
                int var47 = (int) (Math.random() * (double) (field749[var46] * 2 + 1) - (double) field749[var46] + Math.sin((double) field738[var46] / 100.0D * (double) field671[var46]) * (double) field737[var46]);
                if (var46 == 0) {
                    Statics.field1626 += var47;
                }
                if (var46 == 1) {
                    Statics.field1793 += var47;
                }
                if (var46 == 2) {
                    Statics.field1981 += var47;
                }
                if (var46 == 3) {
                    Statics.field151 = Statics.field151 + var47 & 0x7FF;
                }
                if (var46 == 4) {
                    Statics.field1040 += var47;
                    if (Statics.field1040 < 128) {
                        Statics.field1040 = 128;
                    }
                    if (Statics.field1040 > 383) {
                        Statics.field1040 = 383;
                    }
                }
            }
        }
        int var48 = class77.field1408;
        int var49 = class77.field1409;
        if (var48 >= arg0 && var48 < arg0 + arg2 && var49 >= arg1 && var49 < arg1 + arg3) {
            class112.field1909 = true;
            class112.field1877 = 0;
            class112.field1867 = class77.field1408 - arg0;
            class112.field1911 = class77.field1409 - arg1;
        } else {
            class112.field1909 = false;
            class112.field1877 = 0;
        }
        Statics.method25();
        class89.method1772(arg0, arg1, arg2, arg3, 0);
        Statics.method25();
        Statics.field545.method1858(Statics.field1626, Statics.field1793, Statics.field1981, Statics.field1040, Statics.field151, var38);
        Statics.method25();
        Statics.field545.method1808();
        method543(arg0, arg1, arg2, arg3);
        method71(arg0, arg1);
        ((class110) Statics.field1786).method2158(field683);
        if (field598 == 1) {
            Statics.field950[field597 / 100].method1626(field595 - 8, field531 - 8);
        }
        if (field598 == 2) {
            Statics.field950[field597 / 100 + 4].method1626(field595 - 8, field531 - 8);
        }
        method140();
        if (field497) {
            int var50 = arg0 + 512 - 5;
            int var51 = arg1 + 20;
            Statics.field697.method3421("Fps:" + field1337, var50, var51, 16776960, -1);
            int var85 = var51 + 15;
            Runtime var52 = Runtime.getRuntime();
            int var53 = (int) ((var52.totalMemory() - var52.freeMemory()) / 1024L);
            int var54 = 16776960;
            if (var53 > 32768 && field487) {
                var54 = 16711680;
            }
            if (var53 > 65536 && !field487) {
                var54 = 16711680;
            }
            Statics.field697.method3421("Mem:" + var53 + "k", var50, var85, var54, -1);
            var51 = var85 + 15;
        }
        Statics.field1626 = var41;
        Statics.field1793 = var42;
        Statics.field1981 = var43;
        Statics.field1040 = var44;
        Statics.field151 = var45;
        if (field490) {
            byte var55 = 0;
            int var56 = class153.field2546 + class153.field2535 + var55;
            if (var56 == 0) {
                field490 = false;
            }
        }
        if (field490) {
            class89.method1772(arg0, arg1, arg2, arg3, 0);
            method1534(class134.field2093, false);
        }
        if (field490 || field630 || var48 < arg0 || var48 >= arg0 + arg2 || var49 < arg1 || var49 >= arg1 + arg3) {
            return;
        }
        if (field642 == 0 && !field644) {
            method65(class134.field2232, "", 23, 0, var48 - arg0, var49 - arg1);
        }
        int var58 = -1;
        for (int var59 = 0; var59 < class112.field1877; var59++) {
            int var60 = class112.field1913[var59];
            int var61 = var60 & 0x7F;
            int var62 = var60 >> 7 & 0x7F;
            int var63 = var60 >> 29 & 0x3;
            int var64 = var60 >> 14 & 0x7FFF;
            if (var58 != var60) {
                var58 = var60;
                if (var63 == 2 && Statics.field545.method1824(Statics.field30, var61, var62, var60) >= 0) {
                    class32 var65 = class32.method1460(var64);
                    if (var65.field856 != null) {
                        var65 = var65.method639();
                    }
                    if (var65 == null) {
                        continue;
                    }
                    if (field642 == 1) {
                        method65(class134.field2227, field643 + " " + class2.field21 + " " + class2.method2648(65535) + var65.field833, 1, var60, var61, var62);
                    } else if (!field644) {
                        String[] var66 = var65.field848;
                        if (field658) {
                            var66 = method35(var66);
                        }
                        if (var66 != null) {
                            for (int var67 = 4; var67 >= 0; var67--) {
                                if (var66[var67] != null) {
                                    short var68 = 0;
                                    if (var67 == 0) {
                                        var68 = 3;
                                    }
                                    if (var67 == 1) {
                                        var68 = 4;
                                    }
                                    if (var67 == 2) {
                                        var68 = 5;
                                    }
                                    if (var67 == 3) {
                                        var68 = 6;
                                    }
                                    if (var67 == 4) {
                                        var68 = 1001;
                                    }
                                    method65(var66[var67], class2.method2648(65535) + var65.field833, var68, var60, var61, var62);
                                }
                            }
                        }
                        method65(class134.field2228, class2.method2648(65535) + var65.field833, 1002, var65.field828 << 14, var61, var62);
                    } else if ((Statics.field79 & 0x4) == 4) {
                        method65(field504, field647 + " " + class2.field21 + " " + class2.method2648(65535) + var65.field833, 2, var60, var61, var62);
                    }
                }
                if (var63 == 1) {
                    class25 var69 = field522[var64];
                    if (var69.field402.field790 == 1 && (var69.field462 & 0x7F) == 64 && (var69.field470 & 0x7F) == 64) {
                        for (int var70 = 0; var70 < field523; var70++) {
                            class25 var71 = field522[field639[var70]];
                            if (var71 != null && var69 != var71 && var71.field402.field790 == 1 && var69.field462 == var71.field462 && var69.field470 == var71.field470) {
                                method2580(var71.field402, field639[var70], var61, var62);
                            }
                        }
                        for (int var72 = 0; var72 < field560; var72++) {
                            class3 var73 = field608[field744[var72]];
                            if (var73 != null && var69.field462 == var73.field462 && var69.field470 == var73.field470) {
                                method41(var73, field744[var72], var61, var62);
                            }
                        }
                    }
                    method2580(var69.field402, var64, var61, var62);
                }
                if (var63 == 0) {
                    class3 var74 = field608[var64];
                    if ((var74.field462 & 0x7F) == 64 && (var74.field470 & 0x7F) == 64) {
                        for (int var75 = 0; var75 < field523; var75++) {
                            class25 var76 = field522[field639[var75]];
                            if (var76 != null && var76.field402.field790 == 1 && var74.field462 == var76.field462 && var74.field470 == var76.field470) {
                                method2580(var76.field402, field639[var75], var61, var62);
                            }
                        }
                        for (int var77 = 0; var77 < field560; var77++) {
                            class3 var78 = field608[field744[var77]];
                            if (var78 != null && var74 != var78 && var74.field462 == var78.field462 && var74.field470 == var78.field470) {
                                method41(var78, field744[var77], var61, var62);
                            }
                        }
                    }
                    method41(var74, var64, var61, var62);
                }
                if (var63 == 3) {
                    class177 var79 = field622[Statics.field30][var61][var62];
                    if (var79 != null) {
                        for (class17 var80 = (class17) var79.method3291(); var80 != null; var80 = (class17) var79.method3293()) {
                            class40 var81 = class40.method44(var80.field278);
                            if (field642 == 1) {
                                method65(class134.field2227, field643 + " " + class2.field21 + " " + class2.method2648(16748608) + var81.field996, 16, var80.field278, var61, var62);
                            } else if (!field644) {
                                String[] var82 = var81.field1015;
                                if (field658) {
                                    var82 = method35(var82);
                                }
                                for (int var83 = 4; var83 >= 0; var83--) {
                                    if (var82 != null && var82[var83] != null) {
                                        byte var84 = 0;
                                        if (var83 == 0) {
                                            var84 = 18;
                                        }
                                        if (var83 == 1) {
                                            var84 = 19;
                                        }
                                        if (var83 == 2) {
                                            var84 = 20;
                                        }
                                        if (var83 == 3) {
                                            var84 = 21;
                                        }
                                        if (var83 == 4) {
                                            var84 = 22;
                                        }
                                        method65(var82[var83], class2.method2648(16748608) + var81.field996, var84, var80.field278, var61, var62);
                                    } else if (var83 == 2) {
                                        method65(class134.field2087, class2.method2648(16748608) + var81.field996, 20, var80.field278, var61, var62);
                                    }
                                }
                                method65(class134.field2228, class2.method2648(16748608) + var81.field996, 1004, var80.field278, var61, var62);
                            } else if ((Statics.field79 & 0x1) == 1) {
                                method65(field504, field647 + " " + class2.field21 + " " + class2.method2648(16748608) + var81.field996, 17, var80.field278, var61, var62);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cb.am(ZB)V")
    public static final void method1981(boolean arg0) {
        if (Statics.field1358.field462 >> 7 == field632 && Statics.field1358.field470 >> 7 == field706) {
            field632 = 0;
        }
        int var1 = field560;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1358;
                var4 = 33538048;
            } else {
                var3 = field608[field744[var2]];
                var4 = field744[var2] << 14;
            }
            if (var3 != null && var3.method18()) {
                var3.field45 = false;
                if ((field487 && field560 > 50 || field560 > 200) && !arg0 && var3.field445 == var3.field424) {
                    var3.field45 = true;
                }
                int var5 = var3.field462 >> 7;
                int var6 = var3.field470 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field43 == null || field491 < var3.field38 || field491 >= var3.field39) {
                        if ((var3.field462 & 0x7F) == 64 && (var3.field470 & 0x7F) == 64) {
                            if (field575 == field591[var5][var6]) {
                                continue;
                            }
                            field591[var5][var6] = field575;
                        }
                        var3.field37 = method1492(var3.field462, var3.field470, Statics.field30);
                        Statics.field545.method1963(Statics.field30, var3.field462, var3.field470, var3.field37, 60, var3, var3.field476, var4, var3.field422);
                    } else {
                        var3.field45 = false;
                        var3.field37 = method1492(var3.field462, var3.field470, Statics.field30);
                        Statics.field545.method1806(Statics.field30, var3.field462, var3.field470, var3.field37, 60, var3, var3.field476, var4, var3.field44, var3.field48, var3.field33, var3.field47);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eq.ao(ZI)V")
    public static final void method2915(boolean arg0) {
        for (int var1 = 0; var1 < field523; var1++) {
            class25 var2 = field522[field639[var1]];
            int var3 = (field639[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field402.field783 == arg0 && var2.field402.method601()) {
                int var4 = var2.field462 >> 7;
                int var5 = var2.field470 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field423 == 1 && (var2.field462 & 0x7F) == 64 && (var2.field470 & 0x7F) == 64) {
                        if (field575 == field591[var4][var5]) {
                            continue;
                        }
                        field591[var4][var5] = field575;
                    }
                    if (!var2.field402.field788) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field545.method1963(Statics.field30, var2.field462, var2.field470, method1492(var2.field462 + (var2.field423 * 64 - 64), var2.field470 + (var2.field423 * 64 - 64), Statics.field30), var2.field423 * 64 - 64 + 60, var2, var2.field476, var3, var2.field422);
                }
            }
        }
    }

    @ObfuscatedName("d.ah(III)V")
    public static final void method71(int arg0, int arg1) {
        if (field599 == 2) {
            method2291((field527 - Statics.field287 << 7) + field746, (field537 - Statics.field364 << 7) + field723, field740 * 2);
            if (field593 > -1 && field491 % 20 < 10) {
                Statics.field204[0].method1626(field593 + arg0 - 12, field594 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ax.aw(IIIII)V")
    public static final void method543(int arg0, int arg1, int arg2, int arg3) {
        field581 = 0;
        for (int var4 = -1; var4 < field560 + field523; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field1358;
            } else if (var4 < field560) {
                var5 = field608[field744[var4]];
            } else {
                var5 = field522[field639[var4 - field560]];
            }
            if (var5 != null && var5.method18()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field402;
                    if (var6.field812 != null) {
                        var6 = var6.method603();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field560) {
                    class31 var9 = ((class25) var5).field402;
                    if (var9.field812 != null) {
                        var9 = var9.method603();
                    }
                    if (var9.field810 >= 0 && var9.field810 < Statics.field2721.length) {
                        method122(var5, var5.field473 + 15);
                        if (field593 > -1) {
                            Statics.field2721[var9.field810].method1626(field593 + arg0 - 12, field594 + arg1 - 30);
                        }
                    }
                    if (field599 == 1 && field500 == field639[var4 - field560] && field491 % 20 < 10) {
                        method122(var5, var5.field473 + 15);
                        if (field593 > -1) {
                            Statics.field204[0].method1626(field593 + arg0 - 12, field594 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field46 != -1 || var8.field34 != -1) {
                        method122(var5, var5.field473 + 15);
                        if (field593 > -1) {
                            if (var8.field46 != -1) {
                                Statics.field2340[var8.field46].method1626(field593 + arg0 - 12, field594 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field34 != -1) {
                                Statics.field2721[var8.field34].method1626(field593 + arg0 - 12, field594 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field599 == 10 && field501 == field744[var4]) {
                        method122(var5, var5.field473 + 15);
                        if (field593 > -1) {
                            Statics.field204[1].method1626(field593 + arg0 - 12, field594 + arg1 - var7);
                        }
                    }
                }
                if (var5.field460 != null && (var4 >= field560 || field555 == 0 || field555 == 3 || field555 == 1 && method232(((class3) var5).field40))) {
                    method122(var5, var5.field473);
                    if (field593 > -1 && field581 < field582) {
                        field605[field581] = Statics.field1397.method3346(var5.field460) / 2;
                        field585[field581] = Statics.field1397.field2840;
                        field583[field581] = field593;
                        field584[field581] = field594;
                        field587[field581] = var5.field434;
                        field616[field581] = var5.field426;
                        field505[field581] = var5.field420;
                        field590[field581] = var5.field460;
                        field581++;
                    }
                }
                if (var5.field439 > field491) {
                    method122(var5, var5.field473 + 15);
                    if (field593 > -1) {
                        int var10 = var5.field477 * 30 / var5.field432;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class89.method1772(field593 + arg0 - 15, field594 + arg1 - 3, var10, 5, 65280);
                        class89.method1772(field593 + arg0 - 15 + var10, field594 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field435[var11] > field491) {
                        method122(var5, var5.field473 / 2);
                        if (field593 > -1) {
                            if (var11 == 1) {
                                field594 -= 20;
                            }
                            if (var11 == 2) {
                                field593 -= 15;
                                field594 -= 10;
                            }
                            if (var11 == 3) {
                                field593 += 15;
                                field594 -= 10;
                            }
                            Statics.field2[var5.field438[var11]].method1626(field593 + arg0 - 12, field594 + arg1 - 12);
                            Statics.field254.method3353(Integer.toString(var5.field436[var11]), field593 + arg0 - 1, field594 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field581; var12++) {
            int var13 = field583[var12];
            int var14 = field584[var12];
            int var15 = field605[var12];
            int var16 = field585[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field584[var18] - field585[var18] && var14 - var16 < field584[var18] + 2 && var13 - var15 < field605[var18] + field583[var18] && var13 + var15 > field583[var18] - field605[var18] && field584[var18] - field585[var18] < var14) {
                        var14 = field584[var18] - field585[var18];
                        var17 = true;
                    }
                }
            }
            field593 = field583[var12];
            field594 = field584[var12] = var14;
            String var19 = field590[var12];
            if (field650 == 0) {
                int var20 = 16776960;
                if (field587[var12] < 6) {
                    var20 = field704[field587[var12]];
                }
                if (field587[var12] == 6) {
                    var20 = field575 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field587[var12] == 7) {
                    var20 = field575 % 20 < 10 ? 255 : 65535;
                }
                if (field587[var12] == 8) {
                    var20 = field575 % 20 < 10 ? 45056 : 8454016;
                }
                if (field587[var12] == 9) {
                    int var21 = 150 - field505[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field587[var12] == 10) {
                    int var22 = 150 - field505[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field587[var12] == 11) {
                    int var23 = 150 - field505[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field616[var12] == 0) {
                    Statics.field1397.method3353(var19, field593 + arg0, field594 + arg1, var20, 0);
                }
                if (field616[var12] == 1) {
                    Statics.field1397.method3355(var19, field593 + arg0, field594 + arg1, var20, 0, field575);
                }
                if (field616[var12] == 2) {
                    Statics.field1397.method3356(var19, field593 + arg0, field594 + arg1, var20, 0, field575);
                }
                if (field616[var12] == 3) {
                    Statics.field1397.method3357(var19, field593 + arg0, field594 + arg1, var20, 0, field575, 150 - field505[var12]);
                }
                if (field616[var12] == 4) {
                    int var24 = (150 - field505[var12]) * (Statics.field1397.method3346(var19) + 100) / 150;
                    class89.method1718(field593 + arg0 - 50, arg1, field593 + arg0 + 50, arg1 + arg3);
                    Statics.field1397.method3351(var19, field593 + arg0 + 50 - var24, field594 + arg1, var20, 0);
                    class89.method1714(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field616[var12] == 5) {
                    int var25 = 150 - field505[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1718(arg0, field594 + arg1 - Statics.field1397.field2840 - 1, arg0 + arg2, field594 + arg1 + 5);
                    Statics.field1397.method3353(var19, field593 + arg0, field594 + arg1 + var26, var20, 0);
                    class89.method1714(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1397.method3353(var19, field593 + arg0, field594 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("o.av(I)V")
    public static final void method140() {
        field607 = 0;
        int var0 = (Statics.field1358.field462 >> 7) + Statics.field287;
        int var1 = (Statics.field1358.field470 >> 7) + Statics.field364;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field607 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field607 = 1;
        }
        if (field607 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field607 = 0;
        }
    }

    @ObfuscatedName("j.au(Laz;II)V")
    public static final void method122(class27 arg0, int arg1) {
        method2291(arg0.field462, arg0.field470, arg1);
    }

    @ObfuscatedName("dk.af(IIII)V")
    public static final void method2291(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field593 = -1;
            field594 = -1;
            return;
        }
        int var3 = method1492(arg0, arg1, Statics.field30) - arg2;
        int var4 = arg0 - Statics.field1626;
        int var5 = var3 - Statics.field1793;
        int var6 = arg1 - Statics.field1981;
        int var7 = class104.field1789[Statics.field1040];
        int var8 = class104.field1781[Statics.field1040];
        int var9 = class104.field1789[Statics.field151];
        int var10 = class104.field1781[Statics.field151];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field593 = (var11 << 9) / var15 + 256;
            field594 = (var14 << 9) / var15 + 167;
        } else {
            field593 = -1;
            field594 = -1;
        }
    }

    @ObfuscatedName("bv.ab(IIII)I")
    public static final int method1492(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field134[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field141[var5][var3][var4] + class9.field141[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field141[var5][var3][var4 + 1] + class9.field141[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("z.aj(ZB)V")
    public static final void method143(boolean arg0) {
        field547 = arg0;
        if (!field547) {
            int var1 = field619.method2413();
            int var2 = (field529 - field619.field2037) / 16;
            Statics.field1761 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field1761[var3][var4] = field619.method2416();
                }
            }
            int var5 = field619.method2413();
            int var6 = field619.method2443();
            int var7 = field619.method2535();
            int var8 = field619.method2413();
            Statics.field267 = new int[var2];
            Statics.field194 = new int[var2];
            Statics.field2002 = new int[var2];
            Statics.field926 = new byte[var2][];
            Statics.field331 = new byte[var2][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field267[var10] = var13;
                        Statics.field194[var10] = Statics.field275.method3012("m" + var11 + "_" + var12);
                        Statics.field2002[var10] = Statics.field275.method3012("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method810(var8, var1, var7, var6, var5);
            return;
        }
        int var14 = field619.method2443();
        int var15 = field619.method2535();
        field619.method2280();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field619.method2267(1);
                    if (var19 == 1) {
                        field479[var16][var17][var18] = field619.method2267(26);
                    } else {
                        field479[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field619.method2269();
        int var20 = (field529 - field619.field2037) / 16;
        Statics.field1761 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field1761[var21][var22] = field619.method2478();
            }
        }
        int var23 = field619.method2443();
        int var24 = field619.method2445();
        int var25 = field619.method2413();
        Statics.field267 = new int[var20];
        Statics.field194 = new int[var20];
        Statics.field2002 = new int[var20];
        Statics.field926 = new byte[var20][];
        Statics.field331 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field479[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field267[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field267[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field194[var26] = Statics.field275.method3012("m" + var35 + "_" + var36);
                            Statics.field2002[var26] = Statics.field275.method3012("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method810(var14, var23, var15, var24, var25);
    }

    @ObfuscatedName("ao.ac(IIIIII)V")
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1345 == arg0 && Statics.field15 == arg1 && field539 == arg2 || !field487) {
            return;
        }
        Statics.field1345 = arg0;
        Statics.field15 = arg1;
        field539 = arg2;
        if (!field487) {
            field539 = 0;
        }
        method67(25);
        method1534(class134.field2093, true);
        int var5 = Statics.field287;
        int var6 = Statics.field364;
        Statics.field287 = (arg0 - 6) * 8;
        Statics.field364 = (arg1 - 6) * 8;
        int var7 = Statics.field287 - var5;
        int var8 = Statics.field364 - var6;
        int var9 = Statics.field287;
        int var10 = Statics.field364;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field522[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field471[var13] -= var7;
                    var12.field472[var13] -= var8;
                }
                var12.field462 -= var7 * 128;
                var12.field470 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field608[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field471[var16] -= var7;
                    var15.field472[var16] -= var8;
                }
                var15.field462 -= var7 * 128;
                var15.field470 -= var8 * 128;
            }
        }
        Statics.field30 = arg2;
        Statics.field1358.method262(arg3, arg4, false);
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
                        field622[var27][var23][var24] = field622[var27][var25][var26];
                    } else {
                        field622[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field623.method3313(); var28 != null; var28 = (class22) field623.method3292()) {
            var28.field352 -= var7;
            var28.field353 -= var8;
            if (var28.field352 < 0 || var28.field353 < 0 || var28.field352 >= 104 || var28.field353 >= 104) {
                var28.method3319();
            }
        }
        if (field632 != 0) {
            field632 -= var7;
            field706 -= var8;
        }
        field481 = 0;
        field561 = false;
        field715 = -1;
        field625.method3284();
        field624.method3284();
    }

    @ObfuscatedName("ec.ay(ZI)V")
    public static final void method2900(boolean arg0) {
        Statics.method25();
        field532++;
        if (field532 < 50 && !arg0) {
            return;
        }
        field532 = 0;
        if (field604 || Statics.field578 == null) {
            return;
        }
        field526.method2265(71);
        try {
            Statics.field578.method1350(field526.field2039, 0, field526.field2037);
            field526.field2037 = 0;
        } catch (IOException var2) {
            field604 = true;
        }
    }

    @ObfuscatedName("dr.ad(IIIB)Z")
    public static final boolean method2168(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field545.method1824(Statics.field30, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method1460(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field836;
                var9 = var7.field837;
            } else {
                var8 = var7.field837;
                var9 = var7.field836;
            }
            int var10 = var7.field824;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method27(Statics.field1358.field471[0], Statics.field1358.field472[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method27(Statics.field1358.field471[0], Statics.field1358.field472[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field595 = class77.field1415;
        field531 = class77.field1416;
        field598 = 2;
        field597 = 0;
        return true;
    }

    @ObfuscatedName("a.an(IIIIZIIIIIIB)Z")
    public static final boolean method27(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field551[var11][var12] = 0;
                field568[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field551[arg0][arg1] = 99;
        field568[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field637[var15] = arg0;
        int var36 = var15 + 1;
        field554[var15] = arg1;
        boolean var17 = false;
        int var18 = field637.length;
        int[][] var19 = field494[Statics.field30].field2755;
        while (var36 != var16) {
            var13 = field637[var16];
            var14 = field554[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field494[Statics.field30].method3180(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field494[Statics.field30].method3191(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field494[Statics.field30].method3182(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field568[var13][var14] + 1;
            if (var13 > 0 && field551[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field637[var36] = var13 - 1;
                field554[var36] = var14;
                var36 = (var36 + 1) % var18;
                field551[var13 - 1][var14] = 2;
                field568[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field551[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field637[var36] = var13 + 1;
                field554[var36] = var14;
                var36 = (var36 + 1) % var18;
                field551[var13 + 1][var14] = 8;
                field568[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field551[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field637[var36] = var13;
                field554[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field551[var13][var14 - 1] = 1;
                field568[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field551[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field637[var36] = var13;
                field554[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field551[var13][var14 + 1] = 4;
                field568[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field551[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field637[var36] = var13 - 1;
                field554[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field551[var13 - 1][var14 - 1] = 3;
                field568[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field551[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field637[var36] = var13 + 1;
                field554[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field551[var13 + 1][var14 - 1] = 9;
                field568[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field551[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field637[var36] = var13 - 1;
                field554[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field551[var13 - 1][var14 + 1] = 6;
                field568[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field551[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field637[var36] = var13 + 1;
                field554[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field551[var13 + 1][var14 + 1] = 12;
                field568[var13 + 1][var14 + 1] = var20;
            }
        }
        field550 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field568[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field568[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field568[var24][var25];
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
            field550 = 1;
        }
        byte var29 = 0;
        field637[var29] = var13;
        int var37 = var29 + 1;
        field554[var29] = var14;
        int var30;
        int var31 = var30 = field551[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field637[var37] = var13;
                field554[var37++] = var14;
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
            var31 = field551[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field637[var37];
            int var34 = field554[var37];
            if (arg10 == 0) {
                field526.method2265(10);
                field526.method2397(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field526.method2265(40);
                field526.method2397(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field526.method2265(0);
                field526.method2397(var32 + var32 + 3);
            }
            field526.method2398(Statics.field287 + var33);
            field526.method2397(class75.field1384[82] ? 1 : 0);
            field632 = field637[0];
            field706 = field554[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field526.method2397(field637[var37] - var33);
                field526.method2432(field554[var37] - var34);
            }
            field526.method2398(Statics.field364 + var34);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ag.at(I)V")
    public static final void method721() {
        if (field533 == 7) {
            byte var0 = field619.method2438();
            int var1 = field619.method2413();
            byte var2 = field619.method2499();
            int var3 = field619.method2457();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field549[var4];
            int var7 = field619.method2413();
            int var8 = field619.method2434();
            int var9 = (var8 >> 4 & 0x7) + Statics.field265;
            int var10 = (var8 & 0x7) + Statics.field2321;
            int var11 = field619.method2490();
            byte var12 = field619.method2475();
            int var13 = field619.method2413();
            byte var14 = field619.method2438();
            class3 var15;
            if (field518 == var1) {
                var15 = Statics.field1358;
            } else {
                var15 = field608[var1];
            }
            if (var15 != null) {
                class32 var16 = class32.method1460(var13);
                int var17;
                int var18;
                if (var5 == 1 || var5 == 3) {
                    var17 = var16.field837;
                    var18 = var16.field836;
                } else {
                    var17 = var16.field836;
                    var18 = var16.field837;
                }
                int var19 = (var17 >> 1) + var9;
                int var20 = (var17 + 1 >> 1) + var9;
                int var21 = (var18 >> 1) + var10;
                int var22 = (var18 + 1 >> 1) + var10;
                int[][] var23 = class9.field141[Statics.field30];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var9 << 7) + (var17 << 6);
                int var26 = (var10 << 7) + (var18 << 6);
                class112 var27 = var16.method666(var4, var5, var23, var25, var24, var26);
                if (var27 != null) {
                    method1320(Statics.field30, var9, var10, var6, -1, 0, 0, var11 + 1, var7 + 1);
                    var15.field38 = field491 + var11;
                    var15.field39 = field491 + var7;
                    var15.field43 = var27;
                    var15.field53 = var9 * 128 + var17 * 64;
                    var15.field42 = var10 * 128 + var18 * 64;
                    var15.field41 = var24;
                    if (var2 > var12) {
                        byte var28 = var2;
                        var2 = var12;
                        var12 = var28;
                    }
                    if (var14 > var0) {
                        byte var29 = var14;
                        var14 = var0;
                        var0 = var29;
                    }
                    var15.field44 = var2 + var9;
                    var15.field33 = var9 + var12;
                    var15.field48 = var10 + var14;
                    var15.field47 = var0 + var10;
                }
            }
        }
        if (field533 == 211) {
            int var30 = field619.method2434();
            int var31 = (var30 >> 4 & 0x7) + Statics.field265;
            int var32 = (var30 & 0x7) + Statics.field2321;
            int var33 = field619.method2490();
            int var34 = field619.method2490();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class17 var35 = new class17();
                var35.field278 = var34;
                var35.field269 = var33;
                if (field622[Statics.field30][var31][var32] == null) {
                    field622[Statics.field30][var31][var32] = new class177();
                }
                field622[Statics.field30][var31][var32].method3308(var35);
                method149(var31, var32);
            }
        } else if (field533 == 32) {
            int var36 = field619.method2411();
            int var37 = (var36 >> 4 & 0x7) + Statics.field265;
            int var38 = (var36 & 0x7) + Statics.field2321;
            int var39 = field619.method2413();
            int var40 = field619.method2413();
            int var41 = field619.method2413();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class177 var42 = field622[Statics.field30][var37][var38];
                if (var42 != null) {
                    for (class17 var43 = (class17) var42.method3313(); var43 != null; var43 = (class17) var42.method3292()) {
                        if ((var39 & 0x7FFF) == var43.field278 && var43.field269 == var40) {
                            var43.field269 = var41;
                            break;
                        }
                    }
                    method149(var37, var38);
                }
            }
        } else if (field533 == 20) {
            int var44 = field619.method2411();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field549[var45];
            int var48 = field619.method2445();
            int var49 = field619.method2411();
            int var50 = (var49 >> 4 & 0x7) + Statics.field265;
            int var51 = (var49 & 0x7) + Statics.field2321;
            if (var50 >= 0 && var51 >= 0 && var50 < 103 && var51 < 103) {
                if (var47 == 0) {
                    class96 var52 = Statics.field545.method1826(Statics.field30, var50, var51);
                    if (var52 != null) {
                        int var53 = var52.field1623 >> 14 & 0x7FFF;
                        if (var45 == 2) {
                            var52.field1624 = new class14(var53, 2, var46 + 4, Statics.field30, var50, var51, var48, false, var52.field1624);
                            var52.field1627 = new class14(var53, 2, var46 + 1 & 0x3, Statics.field30, var50, var51, var48, false, var52.field1627);
                        } else {
                            var52.field1624 = new class14(var53, var45, var46, Statics.field30, var50, var51, var48, false, var52.field1624);
                        }
                    }
                }
                if (var47 == 1) {
                    class108 var54 = Statics.field545.method1817(Statics.field30, var50, var51);
                    if (var54 != null) {
                        int var55 = var54.field1816 >> 14 & 0x7FFF;
                        if (var45 == 4 || var45 == 5) {
                            var54.field1813 = new class14(var55, 4, var46, Statics.field30, var50, var51, var48, false, var54.field1813);
                        } else if (var45 == 6) {
                            var54.field1813 = new class14(var55, 4, var46 + 4, Statics.field30, var50, var51, var48, false, var54.field1813);
                        } else if (var45 == 7) {
                            var54.field1813 = new class14(var55, 4, (var46 + 2 & 0x3) + 4, Statics.field30, var50, var51, var48, false, var54.field1813);
                        } else if (var45 == 8) {
                            var54.field1813 = new class14(var55, 4, var46 + 4, Statics.field30, var50, var51, var48, false, var54.field1813);
                            var54.field1806 = new class14(var55, 4, (var46 + 2 & 0x3) + 4, Statics.field30, var50, var51, var48, false, var54.field1806);
                        }
                    }
                }
                if (var47 == 2) {
                    class98 var56 = Statics.field545.method1818(Statics.field30, var50, var51);
                    if (var45 == 11) {
                        var45 = 10;
                    }
                    if (var56 != null) {
                        var56.field1648 = new class14(var56.field1656 >> 14 & 0x7FFF, var45, var46, Statics.field30, var50, var51, var48, false, var56.field1648);
                    }
                }
                if (var47 == 3) {
                    class107 var57 = Statics.field545.method1819(Statics.field30, var50, var51);
                    if (var57 != null) {
                        var57.field1802 = new class14(var57.field1803 >> 14 & 0x7FFF, 22, var46, Statics.field30, var50, var51, var48, false, var57.field1802);
                    }
                }
            }
        } else if (field533 == 242) {
            int var58 = field619.method2411();
            int var59 = (var58 >> 4 & 0x7) + Statics.field265;
            int var60 = (var58 & 0x7) + Statics.field2321;
            int var61 = var59 + field619.method2475();
            int var62 = var60 + field619.method2475();
            int var63 = field619.method2414();
            int var64 = field619.method2413();
            int var65 = field619.method2411() * 4;
            int var66 = field619.method2411() * 4;
            int var67 = field619.method2413();
            int var68 = field619.method2413();
            int var69 = field619.method2411();
            int var70 = field619.method2411();
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var64 != 65535) {
                int var71 = var59 * 128 + 64;
                int var72 = var60 * 128 + 64;
                int var73 = var61 * 128 + 64;
                int var74 = var62 * 128 + 64;
                class10 var75 = new class10(var64, Statics.field30, var71, var72, method1492(var71, var72, Statics.field30) - var65, field491 + var67, field491 + var68, var69, var70, var63, var66);
                var75.method110(var73, var74, method1492(var73, var74, Statics.field30) - var66, field491 + var67);
                field624.method3308(var75);
            }
        } else if (field533 == 15) {
            int var76 = field619.method2445();
            int var77 = field619.method2413();
            int var78 = field619.method2457();
            int var79 = (var78 >> 4 & 0x7) + Statics.field265;
            int var80 = (var78 & 0x7) + Statics.field2321;
            int var81 = field619.method2445();
            if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && field518 != var76) {
                class17 var82 = new class17();
                var82.field278 = var81;
                var82.field269 = var77;
                if (field622[Statics.field30][var79][var80] == null) {
                    field622[Statics.field30][var79][var80] = new class177();
                }
                field622[Statics.field30][var79][var80].method3308(var82);
                method149(var79, var80);
            }
        } else if (field533 == 78) {
            int var83 = field619.method2411();
            int var84 = (var83 >> 4 & 0x7) + Statics.field265;
            int var85 = (var83 & 0x7) + Statics.field2321;
            int var86 = field619.method2413();
            int var87 = field619.method2411();
            int var88 = field619.method2413();
            if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                int var89 = var84 * 128 + 64;
                int var90 = var85 * 128 + 64;
                class20 var91 = new class20(var86, Statics.field30, var89, var90, method1492(var89, var90, Statics.field30) - var87, var88, field491);
                field625.method3308(var91);
            }
        } else if (field533 == 100) {
            int var92 = field619.method2434();
            int var93 = var92 >> 2;
            int var94 = var92 & 0x3;
            int var95 = field549[var93];
            int var96 = field619.method2457();
            int var97 = (var96 >> 4 & 0x7) + Statics.field265;
            int var98 = (var96 & 0x7) + Statics.field2321;
            if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                method1320(Statics.field30, var97, var98, var95, -1, var93, var94, 0, -1);
            }
        } else if (field533 == 56) {
            int var99 = field619.method2535();
            int var100 = var99 >> 2;
            int var101 = var99 & 0x3;
            int var102 = field549[var100];
            int var103 = field619.method2457();
            int var104 = (var103 >> 4 & 0x7) + Statics.field265;
            int var105 = (var103 & 0x7) + Statics.field2321;
            int var106 = field619.method2413();
            if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                method1320(Statics.field30, var104, var105, var102, var106, var100, var101, 0, -1);
            }
        } else {
            if (field533 == 108) {
                int var107 = field619.method2411();
                int var108 = (var107 >> 4 & 0x7) + Statics.field265;
                int var109 = (var107 & 0x7) + Statics.field2321;
                int var110 = field619.method2413();
                int var111 = field619.method2411();
                int var112 = var111 >> 4 & 0xF;
                int var113 = var111 & 0x7;
                int var114 = field619.method2411();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    int var115 = var112 + 1;
                    if (Statics.field1358.field471[0] >= var108 - var115 && Statics.field1358.field471[0] <= var108 + var115 && Statics.field1358.field472[0] >= var109 - var115 && Statics.field1358.field472[0] <= var109 + var115 && field727 != 0 && var113 > 0 && field481 < 50) {
                        field711[field481] = var110;
                        field730[field481] = var113;
                        field731[field481] = var114;
                        field733[field481] = null;
                        field556[field481] = (var108 << 16) + (var109 << 8) + var112;
                        field481++;
                    }
                }
            }
            if (field533 == 251) {
                int var116 = field619.method2457();
                int var117 = (var116 >> 4 & 0x7) + Statics.field265;
                int var118 = (var116 & 0x7) + Statics.field2321;
                int var119 = field619.method2443();
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                    class177 var120 = field622[Statics.field30][var117][var118];
                    if (var120 != null) {
                        for (class17 var121 = (class17) var120.method3313(); var121 != null; var121 = (class17) var120.method3292()) {
                            if ((var119 & 0x7FFF) == var121.field278) {
                                var121.method3319();
                                break;
                            }
                        }
                        if (var120.method3313() == null) {
                            field622[Statics.field30][var117][var118] = null;
                        }
                        method149(var117, var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.bu(IIIIIIIIIS)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field623.method3313(); var10 != null; var10 = (class22) field623.method3292()) {
            if (var10.field354 == arg0 && var10.field352 == arg1 && var10.field353 == arg2 && var10.field366 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field354 = arg0;
            var9.field366 = arg3;
            var9.field352 = arg1;
            var9.field353 = arg2;
            method855(var9);
            field623.method3308(var9);
        }
        var9.field357 = arg4;
        var9.field359 = arg5;
        var9.field358 = arg6;
        var9.field360 = arg7;
        var9.field362 = arg8;
    }

    @ObfuscatedName("ah.bt(Lr;B)V")
    public static final void method855(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field366 == 0) {
            var1 = Statics.field545.method1801(arg0.field354, arg0.field352, arg0.field353);
        }
        if (arg0.field366 == 1) {
            var1 = Statics.field545.method1814(arg0.field354, arg0.field352, arg0.field353);
        }
        if (arg0.field366 == 2) {
            var1 = Statics.field545.method1822(arg0.field354, arg0.field352, arg0.field353);
        }
        if (arg0.field366 == 3) {
            var1 = Statics.field545.method1849(arg0.field354, arg0.field352, arg0.field353);
        }
        if (var1 != 0) {
            int var5 = Statics.field545.method1824(arg0.field354, arg0.field352, arg0.field353, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field351 = var2;
        arg0.field356 = var3;
        arg0.field355 = var4;
    }

    @ObfuscatedName("ew.bm(B)V")
    public static final void method2658() {
        for (class22 var0 = (class22) field623.method3313(); var0 != null; var0 = (class22) field623.method3292()) {
            if (var0.field362 > 0) {
                var0.field362--;
            }
            if (var0.field362 != 0) {
                if (var0.field360 > 0) {
                    var0.field360--;
                }
                if (var0.field360 == 0 && var0.field352 >= 1 && var0.field353 >= 1 && var0.field352 <= 102 && var0.field353 <= 102 && (var0.field357 < 0 || class9.method1233(var0.field357, var0.field359))) {
                    method741(var0.field354, var0.field366, var0.field352, var0.field353, var0.field357, var0.field358, var0.field359);
                    var0.field360 = -1;
                    if (var0.field357 == var0.field351 && var0.field351 == -1) {
                        var0.method3319();
                    } else if (var0.field357 == var0.field351 && var0.field358 == var0.field355 && var0.field359 == var0.field356) {
                        var0.method3319();
                    }
                }
            } else if (var0.field351 < 0 || class9.method1233(var0.field351, var0.field356)) {
                method741(var0.field354, var0.field366, var0.field352, var0.field353, var0.field351, var0.field355, var0.field356);
                var0.method3319();
            }
        }
    }

    @ObfuscatedName("as.bf(IIIIIIII)V")
    public static final void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field487 && Statics.field30 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field545.method1801(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field545.method1814(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field545.method1822(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field545.method1849(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field545.method1824(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field545.method1811(arg0, arg2, arg3);
                class32 var15 = class32.method1460(var12);
                if (var15.field838 != 0) {
                    field494[arg0].method3176(arg2, arg3, var13, var14, var15.field839);
                }
            }
            if (arg1 == 1) {
                Statics.field545.method1856(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field545.method1813(arg0, arg2, arg3);
                class32 var16 = class32.method1460(var12);
                if (var16.field836 + arg2 > 103 || var16.field836 + arg3 > 103 || var16.field837 + arg2 > 103 || var16.field837 + arg3 > 103) {
                    return;
                }
                if (var16.field838 != 0) {
                    field494[arg0].method3177(arg2, arg3, var16.field836, var16.field837, var14, var16.field839);
                }
            }
            if (arg1 == 3) {
                Statics.field545.method1840(arg0, arg2, arg3);
                class32 var17 = class32.method1460(var12);
                if (var17.field838 == 1) {
                    field494[arg0].method3179(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field134[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method87(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field545, field494[arg0]);
    }

    @ObfuscatedName("k.bn(III)V")
    public static final void method149(int arg0, int arg1) {
        class177 var2 = field622[Statics.field30][arg0][arg1];
        if (var2 == null) {
            Statics.field545.method1815(Statics.field30, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3313(); var5 != null; var5 = (class17) var2.method3292()) {
            class40 var6 = class40.method44(var5.field278);
            int var7 = var6.field1010;
            if (var6.field1007 == 1) {
                var7 = (var5.field269 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field545.method1815(Statics.field30, arg0, arg1);
            return;
        }
        var2.method3294(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3313(); var10 != null; var10 = (class17) var2.method3292()) {
            if (var4.field278 != var10.field278) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field278 != var10.field278 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field545.method1881(Statics.field30, arg0, arg1, method1492(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field30), var4, var11, var8, var9);
    }

    @ObfuscatedName("ej.bw(S)V")
    public static final void method2649() {
        field486 = 0;
        field611 = 0;
        field619.method2280();
        int var0 = field619.method2267(1);
        if (var0 != 0) {
            int var1 = field619.method2267(2);
            if (var1 == 0) {
                field612[++field611 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field619.method2267(3);
                Statics.field1358.method256(var2, false);
                int var3 = field619.method2267(1);
                if (var3 == 1) {
                    field612[++field611 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field619.method2267(3);
                Statics.field1358.method256(var4, true);
                int var5 = field619.method2267(3);
                Statics.field1358.method256(var5, true);
                int var6 = field619.method2267(1);
                if (var6 == 1) {
                    field612[++field611 - 1] = 2047;
                }
            } else if (var1 == 3) {
                Statics.field30 = field619.method2267(2);
                int var7 = field619.method2267(7);
                int var8 = field619.method2267(1);
                int var9 = field619.method2267(7);
                int var10 = field619.method2267(1);
                if (var10 == 1) {
                    field612[++field611 - 1] = 2047;
                }
                Statics.field1358.method262(var9, var7, var8 == 1);
            }
        }
        method633();
        while (field619.method2288(field529) >= 11) {
            int var11 = field619.method2267(11);
            if (var11 == 2047) {
                break;
            }
            boolean var15 = false;
            if (field608[var11] == null) {
                field608[var11] = new class3();
                if (field601[var11] != null) {
                    field608[var11].method17(field601[var11]);
                }
                var15 = true;
            }
            field744[++field560 - 1] = var11;
            class3 var16 = field608[var11];
            var16.field465 = field491;
            int var17 = field619.method2267(1);
            if (var17 == 1) {
                field612[++field611 - 1] = var11;
            }
            int var18 = field621[field619.method2267(3)];
            if (var15) {
                var16.field467 = var16.field476 = var18;
            }
            int var19 = field619.method2267(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field619.method2267(5);
            if (var20 > 15) {
                var20 -= 32;
            }
            int var21 = field619.method2267(1);
            var16.method262(Statics.field1358.field471[0] + var20, Statics.field1358.field472[0] + var19, var21 == 1);
        }
        field619.method2269();
        method2655();
        for (int var12 = 0; var12 < field486; var12++) {
            int var13 = field617[var12];
            if (field491 != field608[var13].field465) {
                field608[var13] = null;
            }
        }
        if (field529 != field619.field2037) {
            throw new RuntimeException(field619.field2037 + class2.field26 + field529);
        }
        for (int var14 = 0; var14 < field560; var14++) {
            if (field608[field744[var14]] == null) {
                throw new RuntimeException(var14 + class2.field26 + field560);
            }
        }
    }

    @ObfuscatedName("ai.bd(I)V")
    public static final void method633() {
        int var0 = field619.method2267(8);
        if (var0 < field560) {
            for (int var1 = var0; var1 < field560; var1++) {
                field617[++field486 - 1] = field744[var1];
            }
        }
        if (var0 > field560) {
            throw new RuntimeException("");
        }
        field560 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field744[var2];
            class3 var4 = field608[var3];
            int var5 = field619.method2267(1);
            if (var5 == 0) {
                field744[++field560 - 1] = var3;
                var4.field465 = field491;
            } else {
                int var6 = field619.method2267(2);
                if (var6 == 0) {
                    field744[++field560 - 1] = var3;
                    var4.field465 = field491;
                    field612[++field611 - 1] = var3;
                } else if (var6 == 1) {
                    field744[++field560 - 1] = var3;
                    var4.field465 = field491;
                    int var7 = field619.method2267(3);
                    var4.method256(var7, false);
                    int var8 = field619.method2267(1);
                    if (var8 == 1) {
                        field612[++field611 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field744[++field560 - 1] = var3;
                    var4.field465 = field491;
                    int var9 = field619.method2267(3);
                    var4.method256(var9, true);
                    int var10 = field619.method2267(3);
                    var4.method256(var10, true);
                    int var11 = field619.method2267(1);
                    if (var11 == 1) {
                        field612[++field611 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field617[++field486 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ex.ba(B)V")
    public static final void method2655() {
        for (int var0 = 0; var0 < field611; var0++) {
            int var1 = field612[var0];
            class3 var2 = field608[var1];
            int var3 = field619.method2411();
            if ((var3 & 0x80) != 0) {
                var3 += field619.method2411() << 8;
            }
            if ((var3 & 0x40) != 0) {
                int var4 = field619.method2411();
                byte[] var5 = new byte[var4];
                class127 var6 = new class127(var5);
                field619.method2584(var5, 0, var4);
                field601[var1] = var6;
                var2.method17(var6);
            }
            if ((var3 & 0x20) != 0) {
                int var7 = field619.method2413();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field619.method2457();
                method580(var2, var7, var8);
            }
            if ((var3 & 0x100) != 0) {
                var2.field458 = field619.method2411();
                var2.field429 = field619.method2411();
                var2.field459 = field619.method2457();
                var2.field461 = field619.method2457();
                var2.field466 = field619.method2413() + field491;
                var2.field448 = field619.method2445() + field491;
                var2.field464 = field619.method2411();
                var2.field455 = 1;
                var2.field475 = 0;
            }
            if ((var3 & 0x4) != 0) {
                int var9 = field619.method2434();
                int var10 = field619.method2535();
                var2.method271(var9, var10, field491);
                var2.field439 = field491 + 300;
                var2.field477 = field619.method2457();
                var2.field432 = field619.method2535();
            }
            if ((var3 & 0x1) != 0) {
                int var11 = field619.method2490();
                int var12 = field619.method2434();
                int var13 = field619.method2434();
                int var14 = field619.field2037;
                if (var2.field40 != null && var2.field32 != null) {
                    boolean var15 = false;
                    if (var12 <= 1 && method144(var2.field40)) {
                        var15 = true;
                    }
                    if (!var15 && field607 == 0) {
                        field498.field2037 = 0;
                        field619.method2456(field498.field2039, 0, var13);
                        field498.field2037 = 0;
                        class127 var16 = field498;
                        String var20;
                        try {
                            int var17 = var16.method2424();
                            if (var17 > 32767) {
                                var17 = 32767;
                            }
                            byte[] var18 = new byte[var17];
                            var16.field2037 += Statics.field2832.method2323(var16.field2039, var16.field2037, var18, 0, var17);
                            String var19 = class149.method215(var18, 0, var17);
                            var20 = var19;
                        } catch (Exception var27) {
                            var20 = "Cabbage";
                        }
                        String var23 = class185.method3350(Statics.method1442(var20));
                        var2.field460 = var23.trim();
                        var2.field434 = var11 >> 8;
                        var2.field426 = var11 & 0xFF;
                        var2.field420 = 150;
                        if (var12 == 2 || var12 == 3) {
                            Statics.method3033(1, class2.method1236(1) + var2.field40, var23);
                        } else if (var12 == 1) {
                            Statics.method3033(1, class2.method1236(0) + var2.field40, var23);
                        } else {
                            Statics.method3033(2, var2.field40, var23);
                        }
                    }
                }
                field619.field2037 = var13 + var14;
            }
            if ((var3 & 0x2) != 0) {
                var2.field443 = field619.method2445();
                var2.field444 = field619.method2413();
            }
            if ((var3 & 0x400) != 0) {
                int var24 = field619.method2535();
                int var25 = field619.method2457();
                var2.method271(var24, var25, field491);
                var2.field439 = field491 + 300;
                var2.field477 = field619.method2457();
                var2.field432 = field619.method2411();
            }
            if ((var3 & 0x200) != 0) {
                var2.field453 = field619.method2490();
                int var26 = field619.method2478();
                var2.field457 = var26 >> 16;
                var2.field456 = (var26 & 0xFFFF) + field491;
                var2.field454 = 0;
                var2.field463 = 0;
                if (var2.field456 > field491) {
                    var2.field454 = -1;
                }
                if (var2.field453 == 65535) {
                    var2.field453 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field442 = field619.method2413();
                if (var2.field442 == 65535) {
                    var2.field442 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field460 = field619.method2419();
                if (var2.field460.charAt(0) == '~') {
                    var2.field460 = var2.field460.substring(1);
                    Statics.method3033(2, var2.field40, var2.field460);
                } else if (Statics.field1358 == var2) {
                    Statics.method3033(2, var2.field40, var2.field460);
                }
                var2.field434 = 0;
                var2.field426 = 0;
                var2.field420 = 150;
            }
        }
    }

    @ObfuscatedName("db.bk(B)V")
    public static final void method2146() {
        field619.method2280();
        int var0 = field619.method2267(8);
        if (var0 < field523) {
            for (int var1 = var0; var1 < field523; var1++) {
                field617[++field486 - 1] = field639[var1];
            }
        }
        if (var0 > field523) {
            throw new RuntimeException("");
        }
        field523 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field639[var2];
            class25 var4 = field522[var3];
            int var5 = field619.method2267(1);
            if (var5 == 0) {
                field639[++field523 - 1] = var3;
                var4.field465 = field491;
            } else {
                int var6 = field619.method2267(2);
                if (var6 == 0) {
                    field639[++field523 - 1] = var3;
                    var4.field465 = field491;
                    field612[++field611 - 1] = var3;
                } else if (var6 == 1) {
                    field639[++field523 - 1] = var3;
                    var4.field465 = field491;
                    int var7 = field619.method2267(3);
                    var4.method256(var7, false);
                    int var8 = field619.method2267(1);
                    if (var8 == 1) {
                        field612[++field611 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field639[++field523 - 1] = var3;
                    var4.field465 = field491;
                    int var9 = field619.method2267(3);
                    var4.method256(var9, true);
                    int var10 = field619.method2267(3);
                    var4.method256(var10, true);
                    int var11 = field619.method2267(1);
                    if (var11 == 1) {
                        field612[++field611 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field617[++field486 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("m.bz(S)V")
    public static final void method73() {
        for (int var0 = 0; var0 < field611; var0++) {
            int var1 = field612[var0];
            class25 var2 = field522[var1];
            int var3 = field619.method2411();
            if ((var3 & 0x10) != 0) {
                var2.field442 = field619.method2413();
                if (var2.field442 == 65535) {
                    var2.field442 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var4 = field619.method2490();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field619.method2535();
                if (var2.field452 == var4 && var4 != -1) {
                    int var6 = class34.method763(var4).field903;
                    if (var6 == 1) {
                        var2.field449 = 0;
                        var2.field450 = 0;
                        var2.field451 = var5;
                        var2.field441 = 0;
                    }
                    if (var6 == 2) {
                        var2.field441 = 0;
                    }
                } else if (var4 == -1 || var2.field452 == -1 || class34.method763(var4).field897 >= class34.method763(var2.field452).field897) {
                    var2.field452 = var4;
                    var2.field449 = 0;
                    var2.field450 = 0;
                    var2.field451 = var5;
                    var2.field441 = 0;
                    var2.field475 = var2.field455;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var7 = field619.method2535();
                int var8 = field619.method2535();
                var2.method271(var7, var8, field491);
                var2.field439 = field491 + 300;
                var2.field477 = field619.method2411();
                var2.field432 = field619.method2434();
            }
            if ((var3 & 0x40) != 0) {
                var2.field453 = field619.method2445();
                int var9 = field619.method2453();
                var2.field457 = var9 >> 16;
                var2.field456 = (var9 & 0xFFFF) + field491;
                var2.field454 = 0;
                var2.field463 = 0;
                if (var2.field456 > field491) {
                    var2.field454 = -1;
                }
                if (var2.field453 == 65535) {
                    var2.field453 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var10 = field619.method2434();
                int var11 = field619.method2411();
                var2.method271(var10, var11, field491);
                var2.field439 = field491 + 300;
                var2.field477 = field619.method2411();
                var2.field432 = field619.method2434();
            }
            if ((var3 & 0x80) != 0) {
                var2.field460 = field619.method2419();
                var2.field420 = 100;
            }
            if ((var3 & 0x1) != 0) {
                var2.field402 = class31.method246(field619.method2443());
                var2.field423 = var2.field402.field790;
                var2.field440 = var2.field402.field811;
                var2.field427 = var2.field402.field794;
                var2.field428 = var2.field402.field803;
                var2.field425 = var2.field402.field796;
                var2.field419 = var2.field402.field816;
                var2.field424 = var2.field402.field791;
                var2.field469 = var2.field402.field792;
                var2.field421 = var2.field402.field793;
            }
            if ((var3 & 0x4) != 0) {
                var2.field443 = field619.method2443();
                var2.field444 = field619.method2490();
            }
        }
    }

    @ObfuscatedName("ap.bh(IIIII)V")
    public static final void method573(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field689; var4++) {
            if (field696[var4] + field694[var4] > arg0 && field694[var4] < arg0 + arg2 && field596[var4] + field536[var4] > arg1 && field596[var4] < arg1 + arg3) {
                field691[var4] = true;
            }
        }
    }

    @ObfuscatedName("k.bp(IIIII)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field689; var4++) {
            if (field696[var4] + field694[var4] > arg0 && field694[var4] < arg0 + arg2 && field596[var4] + field536[var4] > arg1 && field596[var4] < arg1 + arg3) {
                field692[var4] = true;
            }
        }
    }

    @ObfuscatedName("c.bg(I)V")
    public static final void method248() {
        if (Statics.field152 != null || field659 != null) {
            return;
        }
        int var0 = class77.field1412;
        if (field630) {
            if (var0 != 1) {
                int var1 = class77.field1408;
                int var2 = class77.field1409;
                if (var1 < Statics.field195 - 10 || var1 > Statics.field195 + Statics.field1323 + 10 || var2 < Statics.field81 - 10 || var2 > Statics.field81 + Statics.field398 + 10) {
                    field630 = false;
                    method573(Statics.field195, Statics.field81, Statics.field1323, Statics.field398);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field195;
                int var4 = Statics.field81;
                int var5 = Statics.field1323;
                int var6 = class77.field1415;
                int var7 = class77.field1416;
                int var8 = -1;
                for (int var9 = 0; var9 < field631; var9++) {
                    int var10 = (field631 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method131(var8);
                }
                field630 = false;
                method573(Statics.field195, Statics.field81, Statics.field1323, Statics.field398);
            }
            return;
        }
        if (var0 == 1 && field631 > 0) {
            int var11 = field592[field631 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                label176: {
                    int var12 = field557[field631 - 1];
                    int var13 = field633[field631 - 1];
                    class158 var14 = class158.method139(var13);
                    int var15 = method119(var14);
                    boolean var16 = (var15 >> 28 & 0x1) != 0;
                    if (!var16) {
                        int var17 = method119(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (!var18) {
                            break label176;
                        }
                    }
                    field675 = false;
                    field606 = 0;
                    if (Statics.field152 != null) {
                        method64(Statics.field152);
                    }
                    Statics.field152 = class158.method139(var13);
                    field734 = var12;
                    field602 = class77.field1415;
                    field603 = class77.field1416;
                    method64(Statics.field152);
                    return;
                }
            }
        }
        if (var0 == 1) {
            label178: {
                if (field629 != 1 || field631 <= 2) {
                    int var19 = field631 - 1;
                    boolean var20;
                    if (var19 < 0) {
                        var20 = false;
                    } else {
                        int var21 = field592[var19];
                        if (var21 >= 2000) {
                            var21 -= 2000;
                        }
                        if (var21 == 1007) {
                            var20 = true;
                        } else {
                            var20 = false;
                        }
                    }
                    if (!var20) {
                        break label178;
                    }
                }
                var0 = 2;
            }
        }
        if (var0 == 1 && field631 > 0) {
            method131(field631 - 1);
        }
        if (var0 == 2 && field631 > 0) {
            method2261();
        }
    }

    @ObfuscatedName("dz.bx(I)V")
    public static final void method2261() {
        int var0 = Statics.field1397.method3346(class134.field2230);
        for (int var1 = 0; var1 < field631; var1++) {
            class183 var2 = Statics.field1397;
            String var3;
            if (field530[var1].length() > 0) {
                var3 = field507[var1] + class134.field2168 + field530[var1];
            } else {
                var3 = field507[var1];
            }
            int var4 = var2.method3346(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field631 * 15 + 21;
        int var6 = class77.field1415 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1416;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field630 = true;
        Statics.field195 = var6;
        Statics.field81 = var7;
        Statics.field1323 = var0;
        Statics.field398 = field631 * 15 + 22;
    }

    @ObfuscatedName("f.bi(IB)V")
    public static final void method131(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field557[arg0];
        int var2 = field633[arg0];
        int var3 = field592[arg0];
        int var4 = field548[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 34) {
            field526.method2265(241);
            field526.method2441(var1);
            field526.method2440(var4);
            field526.method2403(var2);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 45) {
            class3 var5 = field608[var4];
            if (var5 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var5.field471[0], var5.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(254);
                field526.method2398(var4);
            }
        }
        if (var3 == 9) {
            class25 var6 = field522[var4];
            if (var6 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var6.field471[0], var6.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(73);
                field526.method2441(var4);
            }
        }
        if (var3 == 1001) {
            method2168(var1, var2, var4);
            field526.method2265(98);
            field526.method2441(Statics.field287 + var1);
            field526.method2440(var4 >> 14 & 0x7FFF);
            field526.method2441(Statics.field364 + var2);
        }
        if (var3 == 30 && field652 == null) {
            field526.method2265(152);
            field526.method2398(var1);
            field526.method2400(var2);
            field652 = class158.method1789(var2, var1);
            method64(field652);
        }
        if (var3 == 11) {
            class25 var7 = field522[var4];
            if (var7 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var7.field471[0], var7.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(52);
                field526.method2441(var4);
            }
        }
        if (var3 == 26) {
            field526.method2265(169);
            for (class4 var8 = (class4) field663.method3271(); var8 != null; var8 = (class4) field663.method3272()) {
                if (var8.field55 == 0 || var8.field55 == 3) {
                    method809(var8, true);
                }
            }
            if (field652 != null) {
                method64(field652);
                field652 = null;
            }
        }
        if (var3 == 10) {
            class25 var9 = field522[var4];
            if (var9 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var9.field471[0], var9.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(249);
                field526.method2398(var4);
            }
        }
        if (var3 == 28) {
            field526.method2265(80);
            field526.method2400(var2);
            class158 var10 = class158.method139(var2);
            if (var10.field2700 != null && var10.field2700[0][0] == 5) {
                int var11 = var10.field2700[0][1];
                class159.field2709[var11] = 1 - class159.field2709[var11];
                method244(var11);
            }
        }
        if (var3 == 8) {
            class25 var12 = field522[var4];
            if (var12 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var12.field471[0], var12.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(12);
                field526.method2398(var4);
                field526.method2398(field589);
                field526.method2403(Statics.field1459);
            }
        }
        if (var3 == 23) {
            Statics.field545.method1831(Statics.field30, var1, var2);
        }
        if (var3 == 40) {
            field526.method2265(35);
            field526.method2441(var4);
            field526.method2452(var2);
            field526.method2442(var1);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 2 && method2168(var1, var2, var4)) {
            field526.method2265(131);
            field526.method2442(Statics.field287 + var1);
            field526.method2452(Statics.field1459);
            field526.method2442(var4 >> 14 & 0x7FFF);
            field526.method2442(Statics.field364 + var2);
            field526.method2440(field589);
        }
        if (var3 == 57 || var3 == 1007) {
            method1980(var4, var2, var1, field530[arg0]);
        }
        if (var3 == 29) {
            field526.method2265(80);
            field526.method2400(var2);
            class158 var13 = class158.method139(var2);
            if (var13.field2700 != null && var13.field2700[0][0] == 5) {
                int var14 = var13.field2700[0][1];
                if (class159.field2709[var14] != var13.field2687[0]) {
                    class159.field2709[var14] = var13.field2687[0];
                    method244(var14);
                }
            }
        }
        if (var3 == 35) {
            field526.method2265(4);
            field526.method2440(var4);
            field526.method2400(var2);
            field526.method2440(var1);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 50) {
            class3 var15 = field608[var4];
            if (var15 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var15.field471[0], var15.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(83);
                field526.method2441(var4);
            }
        }
        if (var3 == 58) {
            field526.method2265(64);
            field526.method2440(var1);
            field526.method2398(field589);
            field526.method2400(Statics.field1459);
            field526.method2403(var2);
        }
        if (var3 == 13) {
            class25 var16 = field522[var4];
            if (var16 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var16.field471[0], var16.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(192);
                field526.method2398(var4);
            }
        }
        if (var3 == 6) {
            method2168(var1, var2, var4);
            field526.method2265(224);
            field526.method2441(Statics.field364 + var2);
            field526.method2442(var4 >> 14 & 0x7FFF);
            field526.method2398(Statics.field287 + var1);
        }
        if (var3 == 41) {
            field526.method2265(245);
            field526.method2452(var2);
            field526.method2441(var1);
            field526.method2441(var4);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 14) {
            class3 var17 = field608[var4];
            if (var17 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var17.field471[0], var17.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(247);
                field526.method2559(Statics.field230);
                field526.method2440(Statics.field958);
                field526.method2442(Statics.field395);
                field526.method2440(var4);
            }
        }
        if (var3 == 12) {
            class25 var18 = field522[var4];
            if (var18 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var18.field471[0], var18.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(28);
                field526.method2441(var4);
            }
        }
        if (var3 == 1002) {
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(95);
            field526.method2398(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 3) {
            method2168(var1, var2, var4);
            field526.method2265(30);
            field526.method2398(Statics.field364 + var2);
            field526.method2441(var4 >> 14 & 0x7FFF);
            field526.method2398(Statics.field287 + var1);
        }
        if (var3 == 22) {
            boolean var19 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var19) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(121);
            field526.method2442(var4);
            field526.method2442(Statics.field287 + var1);
            field526.method2441(Statics.field364 + var2);
        }
        if (var3 == 15) {
            class3 var21 = field608[var4];
            if (var21 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var21.field471[0], var21.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(97);
                field526.method2441(field589);
                field526.method2398(var4);
                field526.method2400(Statics.field1459);
            }
        }
        if (var3 == 24) {
            class158 var22 = class158.method139(var2);
            boolean var23 = true;
            if (var22.field2657 > 0) {
                var23 = method1525(var22);
            }
            if (var23) {
                field526.method2265(80);
                field526.method2400(var2);
            }
        }
        if (var3 == 5) {
            method2168(var1, var2, var4);
            field526.method2265(47);
            field526.method2442(var4 >> 14 & 0x7FFF);
            field526.method2442(Statics.field364 + var2);
            field526.method2441(Statics.field287 + var1);
        }
        if (var3 == 42) {
            field526.method2265(37);
            field526.method2400(var2);
            field526.method2442(var1);
            field526.method2398(var4);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 44) {
            class3 var24 = field608[var4];
            if (var24 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var24.field471[0], var24.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(171);
                field526.method2442(var4);
            }
        }
        if (var3 == 18) {
            boolean var25 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var25) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(212);
            field526.method2398(Statics.field364 + var2);
            field526.method2441(Statics.field287 + var1);
            field526.method2440(var4);
        }
        if (var3 == 1 && method2168(var1, var2, var4)) {
            field526.method2265(231);
            field526.method2441(Statics.field287 + var1);
            field526.method2441(Statics.field364 + var2);
            field526.method2440(Statics.field958);
            field526.method2441(Statics.field395);
            field526.method2440(var4 >> 14 & 0x7FFF);
            field526.method2452(Statics.field230);
        }
        if (var3 == 31) {
            field526.method2265(123);
            field526.method2403(var2);
            field526.method2440(var4);
            field526.method2440(Statics.field395);
            field526.method2441(var1);
            field526.method2400(Statics.field230);
            field526.method2441(Statics.field958);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 48) {
            class3 var27 = field608[var4];
            if (var27 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var27.field471[0], var27.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(51);
                field526.method2441(var4);
            }
        }
        if (var3 == 1003) {
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            class25 var28 = field522[var4];
            if (var28 != null) {
                class31 var29 = var28.field402;
                if (var29.field812 != null) {
                    var29 = var29.method603();
                }
                if (var29 != null) {
                    field526.method2265(115);
                    field526.method2440(var29.field786);
                }
            }
        }
        if (var3 == 16) {
            boolean var30 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var30) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(65);
            field526.method2442(Statics.field395);
            field526.method2452(Statics.field230);
            field526.method2442(Statics.field364 + var2);
            field526.method2440(Statics.field958);
            field526.method2441(var4);
            field526.method2398(Statics.field287 + var1);
        }
        if (var3 == 25) {
            class158 var32 = class158.method1789(var2, var1);
            if (var32 != null) {
                method233();
                int var33 = class162.method3058(method119(var32));
                class158 var34 = class158.method1789(var2, var1);
                if (var34 != null && var34.field2681 != null) {
                    class1 var35 = new class1();
                    var35.field1 = var34;
                    var35.field8 = var34.field2681;
                    class26.method1269(var35);
                }
                field644 = true;
                Statics.field1459 = var2;
                field589 = var1;
                Statics.field79 = var33;
                method64(var34);
                field642 = 0;
                String var36;
                if (class162.method3058(method119(var32)) == 0) {
                    var36 = null;
                } else if (var32.field2636 == null || var32.field2636.trim().length() == 0) {
                    var36 = null;
                } else {
                    var36 = var32.field2636;
                }
                field504 = var36;
                if (field504 == null) {
                    field504 = "Null";
                }
                if (var32.field2590) {
                    field647 = var32.field2648 + class2.method2648(16777215);
                } else {
                    field647 = class2.method2648(65280) + var32.field2691 + class2.method2648(16777215);
                }
            }
            return;
        }
        if (var3 == 36) {
            field526.method2265(142);
            field526.method2440(var1);
            field526.method2559(var2);
            field526.method2440(var4);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 51) {
            class3 var37 = field608[var4];
            if (var37 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var37.field471[0], var37.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(149);
                field526.method2398(var4);
            }
        }
        if (var3 == 19) {
            boolean var38 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var38) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(146);
            field526.method2440(var4);
            field526.method2440(Statics.field287 + var1);
            field526.method2441(Statics.field364 + var2);
        }
        if (var3 == 20) {
            boolean var40 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var40) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(23);
            field526.method2442(Statics.field287 + var1);
            field526.method2442(var4);
            field526.method2441(Statics.field364 + var2);
        }
        if (var3 == 38) {
            method233();
            class158 var42 = class158.method139(var2);
            field642 = 1;
            Statics.field958 = var1;
            Statics.field230 = var2;
            Statics.field395 = var4;
            method64(var42);
            field643 = class2.method2648(16748608) + class40.method44(var4).field996 + class2.method2648(16777215);
            if (field643 == null) {
                field643 = "null";
            }
            return;
        }
        if (var3 == 32) {
            field526.method2265(49);
            field526.method2441(field589);
            field526.method2403(Statics.field1459);
            field526.method2442(var4);
            field526.method2442(var1);
            field526.method2559(var2);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 1004) {
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(57);
            field526.method2440(var4);
        }
        if (var3 == 46) {
            class3 var43 = field608[var4];
            if (var43 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var43.field471[0], var43.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(11);
                field526.method2441(var4);
            }
        }
        if (var3 == 1005) {
            class158 var44 = class158.method139(var2);
            if (var44 == null || var44.field2634[var1] < 100000) {
                field526.method2265(57);
                field526.method2440(var4);
            } else {
                Statics.method3033(0, "", var44.field2634[var1] + " x " + class40.method44(var4).field996);
            }
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 33) {
            field526.method2265(91);
            field526.method2398(var1);
            field526.method2559(var2);
            field526.method2441(var4);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 37) {
            field526.method2265(154);
            field526.method2441(var1);
            field526.method2440(var4);
            field526.method2400(var2);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 39) {
            field526.method2265(156);
            field526.method2403(var2);
            field526.method2442(var4);
            field526.method2441(var1);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 47) {
            class3 var45 = field608[var4];
            if (var45 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var45.field471[0], var45.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(118);
                field526.method2398(var4);
            }
        }
        if (var3 == 21) {
            boolean var46 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var46) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(96);
            field526.method2398(Statics.field287 + var1);
            field526.method2440(var4);
            field526.method2440(Statics.field364 + var2);
        }
        if (var3 == 7) {
            class25 var48 = field522[var4];
            if (var48 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var48.field471[0], var48.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(180);
                field526.method2441(Statics.field395);
                field526.method2400(Statics.field230);
                field526.method2442(var4);
                field526.method2442(Statics.field958);
            }
        }
        if (var3 == 17) {
            boolean var49 = method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var49) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field595 = class77.field1415;
            field531 = class77.field1416;
            field598 = 2;
            field597 = 0;
            field526.method2265(38);
            field526.method2398(Statics.field287 + var1);
            field526.method2441(Statics.field364 + var2);
            field526.method2559(Statics.field1459);
            field526.method2442(field589);
            field526.method2442(var4);
        }
        if (var3 == 4) {
            method2168(var1, var2, var4);
            field526.method2265(67);
            field526.method2442(Statics.field287 + var1);
            field526.method2440(Statics.field364 + var2);
            field526.method2442(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 43) {
            field526.method2265(66);
            field526.method2442(var4);
            field526.method2441(var1);
            field526.method2400(var2);
            field634 = 0;
            Statics.field263 = class158.method139(var2);
            field600 = var1;
        }
        if (var3 == 49) {
            class3 var51 = field608[var4];
            if (var51 != null) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var51.field471[0], var51.field472[0], false, 0, 0, 1, 1, 0, 2);
                field595 = class77.field1415;
                field531 = class77.field1416;
                field598 = 2;
                field597 = 0;
                field526.method2265(127);
                field526.method2440(var4);
            }
        }
        if (field642 != 0) {
            field642 = 0;
            method64(class158.method139(Statics.field230));
        }
        if (field644) {
            method233();
        }
        if (Statics.field263 != null && field634 == 0) {
            method64(Statics.field263);
        }
    }

    @ObfuscatedName("y.bq(ILjava/lang/String;I)V")
    public static void method157(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field560; var3++) {
            class3 var4 = field608[field744[var3]];
            if (var4 != null && var4.field40 != null && var4.field40.equalsIgnoreCase(arg1)) {
                method27(Statics.field1358.field471[0], Statics.field1358.field472[0], var4.field471[0], var4.field472[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field526.method2265(171);
                    field526.method2442(field744[var3]);
                } else if (arg0 == 4) {
                    field526.method2265(118);
                    field526.method2398(field744[var3]);
                } else if (arg0 == 6) {
                    field526.method2265(127);
                    field526.method2440(field744[var3]);
                } else if (arg0 == 7) {
                    field526.method2265(83);
                    field526.method2441(field744[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            Statics.method3033(0, "", class134.field2226 + arg1);
        }
    }

    @ObfuscatedName("r.bc(B)V")
    public static void method233() {
        if (!field644) {
            return;
        }
        class158 var0 = class158.method1789(Statics.field1459, field589);
        if (var0 != null && var0.field2670 != null) {
            class1 var1 = new class1();
            var1.field1 = var0;
            var1.field8 = var0.field2670;
            class26.method1269(var1);
        }
        field644 = false;
        method64(var0);
    }

    @ObfuscatedName("cb.bs(IIILjava/lang/String;B)V")
    public static void method1980(int arg0, int arg1, int arg2, String arg3) {
        class158 var4 = class158.method1789(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2621 != null) {
            class1 var5 = new class1();
            var5.field1 = var4;
            var5.field9 = arg0;
            var5.field5 = arg3;
            var5.field8 = var4.field2621;
            class26.method1269(var5);
        }
        boolean var6 = true;
        if (var4.field2657 > 0) {
            var6 = method1525(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method119(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field526.method2265(211);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 2) {
            field526.method2265(234);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 3) {
            field526.method2265(134);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 4) {
            field526.method2265(27);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 5) {
            field526.method2265(78);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 6) {
            field526.method2265(166);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 7) {
            field526.method2265(209);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 8) {
            field526.method2265(112);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 9) {
            field526.method2265(143);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
        if (arg0 == 10) {
            field526.method2265(196);
            field526.method2400(arg1);
            field526.method2398(arg2);
        }
    }

    @ObfuscatedName("d.bb(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method65(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field630 || field631 >= 500) {
            return;
        }
        field507[field631] = arg0;
        field530[field631] = arg1;
        field592[field631] = arg2;
        field548[field631] = arg3;
        field557[field631] = arg4;
        field633[field631] = arg5;
        field631++;
    }

    @ObfuscatedName("e.be(I)V")
    public static void method166() {
        for (int var0 = 0; var0 < field631 - 1; var0++) {
            if (method2812(field592[var0])) {
                for (int var1 = var0; var1 < field631 - 1; var1++) {
                    field507[var1] = field507[var1 + 1];
                    field530[var1] = field530[var1 + 1];
                    field592[var1] = field592[var1 + 1];
                    field548[var1] = field548[var1 + 1];
                    field557[var1] = field557[var1 + 1];
                    field633[var1] = field633[var1 + 1];
                }
                field631--;
            }
        }
    }

    @ObfuscatedName("el.by(II)Z")
    public static boolean method2812(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("dn.bl(Laa;IIIB)V")
    public static final void method2580(class31 arg0, int arg1, int arg2, int arg3) {
        if (field631 >= 400) {
            return;
        }
        if (arg0.field812 != null) {
            arg0 = arg0.method603();
        }
        if (arg0 == null || !arg0.field788) {
            return;
        }
        String var4 = arg0.field787;
        if (arg0.field809 != 0) {
            var4 = var4 + method1433(arg0.field809, Statics.field1358.field35) + " " + class2.field19 + class134.field2307 + arg0.field809 + class2.field20;
        }
        if (field642 == 1) {
            method65(class134.field2227, field643 + " " + class2.field21 + " " + class2.method2648(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field644) {
            String[] var5 = arg0.field802;
            if (field658) {
                var5 = method35(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class134.field2229)) {
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
                        method65(var5[var6], class2.method2648(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class134.field2229)) {
                        short var9 = 0;
                        if (arg0.field809 > Statics.field1358.field35) {
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
                        method65(var5[var8], class2.method2648(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method65(class134.field2228, class2.method2648(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field79 & 0x2) == 2) {
            method65(field504, field647 + " " + class2.field21 + " " + class2.method2648(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("q.bo(La;IIII)V")
    public static final void method41(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1358 == arg0 || field631 >= 400) {
            return;
        }
        String var4;
        if (arg0.field50 == 0) {
            var4 = arg0.field40 + method1433(arg0.field35, Statics.field1358.field35) + " " + class2.field19 + class134.field2307 + arg0.field35 + class2.field20;
        } else {
            var4 = arg0.field40 + " " + class2.field19 + class134.field2234 + arg0.field50 + class2.field20;
        }
        if (field642 == 1) {
            method65(class134.field2227, field643 + " " + class2.field21 + " " + class2.method2648(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field644) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field552[var5] != null) {
                    short var6 = 0;
                    if (field552[var5].equalsIgnoreCase(class134.field2229)) {
                        if (arg0.field35 > Statics.field1358.field35) {
                            var6 = 2000;
                        }
                        if (Statics.field1358.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field1358.field49 == arg0.field49) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field620[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field674[var5] + var6;
                    method65(field552[var5], class2.method2648(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field79 & 0x8) == 8) {
            method65(field504, field647 + " " + class2.field21 + " " + class2.method2648(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field631; var9++) {
            if (field592[var9] == 23) {
                field530[var9] = class2.method2648(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("by.bv(III)Ljava/lang/String;")
    public static final String method1433(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2648(16711680);
        } else if (var2 < -6) {
            return class2.method2648(16723968);
        } else if (var2 < -3) {
            return class2.method2648(16740352);
        } else if (var2 < 0) {
            return class2.method2648(16756736);
        } else if (var2 > 9) {
            return class2.method2648(65280);
        } else if (var2 > 6) {
            return class2.method2648(4259584);
        } else if (var2 > 3) {
            return class2.method2648(8453888);
        } else if (var2 > 0) {
            return class2.method2648(12648192);
        } else {
            return class2.method2648(16776960);
        }
    }

    @ObfuscatedName("l.bj(IIIIIIIIB)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.method2702(arg0)) {
            Statics.field2470 = null;
            method686(Statics.field2595[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2470 != null) {
                method686(Statics.field2470, -1412584499, arg1, arg2, arg3, arg4, Statics.field31, Statics.field368, arg7);
                Statics.field2470 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field691[var8] = true;
            }
        } else {
            field691[arg7] = true;
        }
    }

    @ObfuscatedName("ar.br([Lfj;IIIIIIIII)V")
    public static final void method686(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1714(arg2, arg3, arg4, arg5);
        class104.method2062();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2602 == arg1 || arg1 == -1412584499 && field659 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field694[field689] = var10.field2644 + arg6;
                    field596[field689] = var10.field2597 + arg7;
                    field696[field689] = var10.field2600;
                    field536[field689] = var10.field2582;
                    var11 = ++field689 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2706 = var11;
                var10.field2707 = field491;
                if (!var10.field2590 || !method2164(var10)) {
                    if (var10.field2657 > 0) {
                        method874(var10);
                    }
                    int var12 = var10.field2644 + arg6;
                    int var13 = var10.field2597 + arg7;
                    int var14 = var10.field2613;
                    if (field659 == var10) {
                        if (arg1 != -1412584499 && !var10.field2656) {
                            Statics.field2470 = arg0;
                            Statics.field31 = arg6;
                            Statics.field368 = arg7;
                            continue;
                        }
                        if (field670 && field664) {
                            int var15 = class77.field1408;
                            int var16 = class77.field1409;
                            int var17 = var15 - field661;
                            int var18 = var16 - field662;
                            if (var17 < field665) {
                                var17 = field665;
                            }
                            if (var10.field2600 + var17 > field665 + field660.field2600) {
                                var17 = field665 + field660.field2600 - var10.field2600;
                            }
                            if (var18 < field666) {
                                var18 = field666;
                            }
                            if (var10.field2582 + var18 > field666 + field660.field2582) {
                                var18 = field666 + field660.field2582 - var10.field2582;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2656) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2593 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2593 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2600 + var12;
                        int var26 = var10.field2582 + var13;
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
                        int var29 = var10.field2600 + var12;
                        int var30 = var10.field2582 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2590 || var19 < var21 && var20 < var22) {
                        if (var10.field2657 != 0) {
                            if (var10.field2657 == 1337) {
                                field688 = var12;
                                field721 = var13;
                                method120(var12, var13, var10.field2600, var10.field2582);
                                class89.method1714(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2657 == 1338) {
                                Statics.method25();
                                class89.method1714(var12, var13, Statics.field187.field1494 + var12, Statics.field187.field1490 + var13);
                                if (field722 == 2 || field722 == 5) {
                                    class89.method1729(var12 + 25, var13 + 5, 0, Statics.field1819, Statics.field2788);
                                } else {
                                    int var31 = field553 + field499 & 0x7FF;
                                    int var32 = Statics.field1358.field462 / 32 + 48;
                                    int var33 = 464 - Statics.field1358.field470 / 32;
                                    Statics.field36.method1676(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field564 + 256, Statics.field1819, Statics.field2788);
                                    for (int var34 = 0; var34 < field567; var34++) {
                                        int var35 = field717[var34] * 4 + 2 - Statics.field1358.field462 / 32;
                                        int var36 = field718[var34] * 4 + 2 - Statics.field1358.field470 / 32;
                                        method155(var12, var13, var35, var36, field719[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class177 var39 = field622[Statics.field30][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field1358.field462 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field1358.field470 / 32;
                                                method155(var12, var13, var40, var41, Statics.field1322[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field523; var42++) {
                                        class25 var43 = field522[field639[var42]];
                                        if (var43 != null && var43.method18()) {
                                            class31 var44 = var43.field402;
                                            if (var44 != null && var44.field812 != null) {
                                                var44 = var44.method603();
                                            }
                                            if (var44 != null && var44.field807 && var44.field788) {
                                                int var45 = var43.field462 / 32 - Statics.field1358.field462 / 32;
                                                int var46 = var43.field470 / 32 - Statics.field1358.field470 / 32;
                                                method155(var12, var13, var45, var46, Statics.field1322[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field560; var47++) {
                                        class3 var48 = field608[field744[var47]];
                                        if (var48 != null && var48.method18()) {
                                            int var49 = var48.field462 / 32 - Statics.field1358.field462 / 32;
                                            int var50 = var48.field470 / 32 - Statics.field1358.field470 / 32;
                                            boolean var51 = false;
                                            if (method232(var48.field40)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field22; var53++) {
                                                if (var48.field40.equals(Statics.field1530[var53].field123)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field1358.field49 != 0 && var48.field49 != 0 && Statics.field1358.field49 == var48.field49) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method155(var12, var13, var49, var50, Statics.field1322[3]);
                                            } else if (var54) {
                                                method155(var12, var13, var49, var50, Statics.field1322[4]);
                                            } else if (var52) {
                                                method155(var12, var13, var49, var50, Statics.field1322[2]);
                                            } else {
                                                method155(var12, var13, var49, var50, Statics.field1322[2]);
                                            }
                                        }
                                    }
                                    if (field599 != 0 && field491 % 20 < 10) {
                                        if (field599 == 1 && field500 >= 0 && field500 < field522.length) {
                                            class25 var55 = field522[field500];
                                            if (var55 != null) {
                                                int var56 = var55.field462 / 32 - Statics.field1358.field462 / 32;
                                                int var57 = var55.field470 / 32 - Statics.field1358.field470 / 32;
                                                method2335(var12, var13, var56, var57, Statics.field757[1]);
                                            }
                                        }
                                        if (field599 == 2) {
                                            int var58 = field527 * 4 - Statics.field287 * 4 + 2 - Statics.field1358.field462 / 32;
                                            int var59 = field537 * 4 - Statics.field364 * 4 + 2 - Statics.field1358.field470 / 32;
                                            method2335(var12, var13, var58, var59, Statics.field757[1]);
                                        }
                                        if (field599 == 10 && field501 >= 0 && field501 < field608.length) {
                                            class3 var60 = field608[field501];
                                            if (var60 != null) {
                                                int var61 = var60.field462 / 32 - Statics.field1358.field462 / 32;
                                                int var62 = var60.field470 / 32 - Statics.field1358.field470 / 32;
                                                method2335(var12, var13, var61, var62, Statics.field757[1]);
                                            }
                                        }
                                    }
                                    if (field632 != 0) {
                                        int var63 = field632 * 4 + 2 - Statics.field1358.field462 / 32;
                                        int var64 = field706 * 4 + 2 - Statics.field1358.field470 / 32;
                                        method155(var12, var13, var63, var64, Statics.field757[0]);
                                    }
                                    class89.method1772(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field722 < 3) {
                                    Statics.field68.method1676(var12, var13, 33, 33, 25, 25, field553, 256, Statics.field299, Statics.field225);
                                } else {
                                    class89.method1729(var12, var13, 0, Statics.field299, Statics.field225);
                                }
                                if (field512[var11]) {
                                    Statics.field187.method1700(var12, var13);
                                }
                                field692[var11] = true;
                                class89.method1714(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var65 = class77.field1408;
                        int var66 = class77.field1409;
                        if (!field630 && var65 >= var19 && var66 >= var20 && var65 < var21 && var66 < var22) {
                            method268(var10, var65 - var12, var66 - var13);
                        }
                        if (var10.field2593 == 0) {
                            if (!var10.field2590 && method2164(var10) && Statics.field969 != var10) {
                                continue;
                            }
                            if (!var10.field2590) {
                                if (var10.field2605 > var10.field2697 - var10.field2582) {
                                    var10.field2605 = var10.field2697 - var10.field2582;
                                }
                                if (var10.field2605 < 0) {
                                    var10.field2605 = 0;
                                }
                            }
                            method686(arg0, var10.field2591, var19, var20, var21, var22, var12 - var10.field2604, var13 - var10.field2605, var11);
                            if (var10.field2699 != null) {
                                method686(var10.field2699, var10.field2591, var19, var20, var21, var22, var12 - var10.field2604, var13 - var10.field2605, var11);
                            }
                            class4 var67 = (class4) field663.method3268((long) var10.field2591);
                            if (var67 != null) {
                                if (var67.field55 == 0 && class77.field1408 >= var19 && class77.field1409 >= var20 && class77.field1408 < var21 && class77.field1409 < var22 && !field630 && !field693) {
                                    field507[0] = class134.field2300;
                                    field530[0] = "";
                                    field592[0] = 1006;
                                    field631 = 1;
                                }
                                method32(var67.field64, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1714(arg2, arg3, arg4, arg5);
                            class104.method2062();
                        }
                        if (field512[var11] || field698 > 1) {
                            if (var10.field2593 == 0 && !var10.field2590 && var10.field2697 > var10.field2582) {
                                int var68 = var10.field2600 + var12;
                                int var69 = var10.field2605;
                                int var70 = var10.field2582;
                                int var71 = var10.field2697;
                                Statics.field1680[0].method1700(var68, var13);
                                Statics.field1680[1].method1700(var68, var13 + var70 - 16);
                                class89.method1772(var68, var13 + 16, 16, var70 - 32, field651);
                                int var72 = (var70 - 32) * var70 / var71;
                                if (var72 < 8) {
                                    var72 = 8;
                                }
                                int var73 = (var70 - 32 - var72) * var69 / (var71 - var70);
                                class89.method1772(var68, var13 + 16 + var73, 16, var72, field569);
                                class89.method1765(var68, var13 + 16 + var73, var72, field503);
                                class89.method1765(var68 + 1, var13 + 16 + var73, var72, field503);
                                class89.method1724(var68, var13 + 16 + var73, 16, field503);
                                class89.method1724(var68, var13 + 17 + var73, 16, field503);
                                class89.method1765(var68 + 15, var13 + 16 + var73, var72, field570);
                                class89.method1765(var68 + 14, var13 + 17 + var73, var72 - 1, field570);
                                class89.method1724(var68, var13 + 15 + var73 + var72, 16, field570);
                                class89.method1724(var68 + 1, var13 + 14 + var73 + var72, 15, field570);
                            }
                            if (var10.field2593 != 1) {
                                if (var10.field2593 == 2) {
                                    int var74 = 0;
                                    for (int var75 = 0; var75 < var10.field2582; var75++) {
                                        for (int var76 = 0; var76 < var10.field2600; var76++) {
                                            int var77 = (var10.field2690 + 32) * var76 + var12;
                                            int var78 = (var10.field2645 + 32) * var75 + var13;
                                            if (var74 < 20) {
                                                var77 += var10.field2606[var74];
                                                var78 += var10.field2672[var74];
                                            }
                                            if (var10.field2649[var74] > 0) {
                                                boolean var79 = false;
                                                boolean var80 = false;
                                                int var81 = var10.field2649[var74] - 1;
                                                if (var77 + 32 > arg2 && var77 < arg4 && var78 + 32 > arg3 && var78 < arg5 || Statics.field152 == var10 && field734 == var74) {
                                                    class86 var82;
                                                    if (field642 == 1 && Statics.field958 == var74 && Statics.field230 == var10.field2591) {
                                                        var82 = class40.method6(var81, var10.field2634[var74], 2, 0, false);
                                                    } else {
                                                        var82 = class40.method6(var81, var10.field2634[var74], 1, 3153952, false);
                                                    }
                                                    if (var82 == null) {
                                                        method64(var10);
                                                    } else if (Statics.field152 == var10 && field734 == var74) {
                                                        int var83 = class77.field1408 - field602;
                                                        int var84 = class77.field1409 - field603;
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (field606 < 5) {
                                                            var83 = 0;
                                                            var84 = 0;
                                                        }
                                                        var82.method1632(var77 + var83, var78 + var84, 128);
                                                        if (arg1 != -1) {
                                                            class158 var85 = arg0[arg1 & 0xFFFF];
                                                            if (var78 + var84 < class89.field1499 && var85.field2605 > 0) {
                                                                int var86 = field683 * (class89.field1499 - var78 - var84) / 3;
                                                                if (var86 > field683 * 10) {
                                                                    var86 = field683 * 10;
                                                                }
                                                                if (var86 > var85.field2605) {
                                                                    var86 = var85.field2605;
                                                                }
                                                                var85.field2605 -= var86;
                                                                field603 += var86;
                                                                method64(var85);
                                                            }
                                                            if (var78 + var84 + 32 > class89.field1500 && var85.field2605 < var85.field2697 - var85.field2582) {
                                                                int var87 = field683 * (var78 + var84 + 32 - class89.field1500) / 3;
                                                                if (var87 > field683 * 10) {
                                                                    var87 = field683 * 10;
                                                                }
                                                                if (var87 > var85.field2697 - var85.field2582 - var85.field2605) {
                                                                    var87 = var85.field2697 - var85.field2582 - var85.field2605;
                                                                }
                                                                var85.field2605 += var87;
                                                                field603 -= var87;
                                                                method64(var85);
                                                            }
                                                        }
                                                    } else if (Statics.field263 == var10 && field600 == var74) {
                                                        var82.method1632(var77, var78, 128);
                                                    } else {
                                                        var82.method1626(var77, var78);
                                                    }
                                                }
                                            } else if (var10.field2620 != null && var74 < 20) {
                                                class86 var88 = var10.method3076(var74);
                                                if (var88 != null) {
                                                    var88.method1626(var77, var78);
                                                } else if (class158.field2589) {
                                                    method64(var10);
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                } else if (var10.field2593 == 3) {
                                    int var89;
                                    if (method2155(var10)) {
                                        var89 = var10.field2609;
                                        if (Statics.field969 == var10 && var10.field2611 != 0) {
                                            var89 = var10.field2611;
                                        }
                                    } else {
                                        var89 = var10.field2608;
                                        if (Statics.field969 == var10 && var10.field2694 != 0) {
                                            var89 = var10.field2694;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2647) {
                                            class89.method1772(var12, var13, var10.field2600, var10.field2582, var89);
                                        } else {
                                            class89.method1722(var12, var13, var10.field2600, var10.field2582, var89);
                                        }
                                    } else if (var10.field2647) {
                                        class89.method1750(var12, var13, var10.field2600, var10.field2582, var89, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1723(var12, var13, var10.field2600, var10.field2582, var89, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2593 == 4) {
                                    class183 var90 = var10.method3106();
                                    if (var90 != null) {
                                        String var91 = var10.field2638;
                                        int var92;
                                        if (method2155(var10)) {
                                            var92 = var10.field2609;
                                            if (Statics.field969 == var10 && var10.field2611 != 0) {
                                                var92 = var10.field2611;
                                            }
                                            if (var10.field2639.length() > 0) {
                                                var91 = var10.field2639;
                                            }
                                        } else {
                                            var92 = var10.field2608;
                                            if (Statics.field969 == var10 && var10.field2694 != 0) {
                                                var92 = var10.field2694;
                                            }
                                        }
                                        if (var10.field2590 && var10.field2695 != -1) {
                                            class40 var93 = class40.method44(var10.field2695);
                                            var91 = var93.field996;
                                            if (var91 == null) {
                                                var91 = "null";
                                            }
                                            if ((var93.field1007 == 1 || var10.field2624 != 1) && var10.field2624 != -1) {
                                                String var94 = class2.method2648(16748608) + var91 + class2.field23 + " " + 'x';
                                                int var95 = var10.field2624;
                                                String var96 = Integer.toString(var95);
                                                for (int var97 = var96.length() - 3; var97 > 0; var97 -= 3) {
                                                    var96 = var96.substring(0, var97) + class2.field26 + var96.substring(var97);
                                                }
                                                StringBuilder var10000;
                                                class134 var10001;
                                                String var98;
                                                if (var96.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2648(65408)).append(var96.substring(0, var96.length() - 8));
                                                    var10001 = (class134) null;
                                                    var98 = var10000.append(class134.field2172).append(" ").append(class2.field19).append(var96).append(class2.field20).append(class2.field23).toString();
                                                } else if (var96.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2648(16777215)).append(var96.substring(0, var96.length() - 4));
                                                    var10001 = (class134) null;
                                                    var98 = var10000.append(class134.field2240).append(" ").append(class2.field19).append(var96).append(class2.field20).append(class2.field23).toString();
                                                } else {
                                                    var98 = " " + class2.method2648(16776960) + var96 + class2.field23;
                                                }
                                                var91 = var94 + var98;
                                            }
                                        }
                                        if (field652 == var10) {
                                            class134 var162 = (class134) null;
                                            var91 = class134.field2108;
                                            var92 = var10.field2608;
                                        }
                                        if (!var10.field2590) {
                                            var91 = method199(var91, var10);
                                        }
                                        var90.method3354(var91, var12, var13, var10.field2600, var10.field2582, var92, var10.field2643 ? 0 : -1, var10.field2678, var10.field2642, var10.field2640);
                                    } else if (class158.field2589) {
                                        method64(var10);
                                    }
                                } else if (var10.field2593 == 5) {
                                    if (var10.field2590) {
                                        class86 var100;
                                        if (var10.field2695 == -1) {
                                            var100 = var10.method3075(false);
                                        } else {
                                            var100 = class40.method6(var10.field2695, var10.field2624, var10.field2696, var10.field2646, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field1485;
                                            int var102 = var100.field1481;
                                            if (var10.field2693) {
                                                class89.method1718(var12, var13, var10.field2600 + var12, var10.field2582 + var13);
                                                int var103 = (var10.field2600 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2582 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2617 != 0) {
                                                            var100.method1638(var101 / 2 + var101 * var105 + var12, var102 / 2 + var102 * var106 + var13, var10.field2617, 4096);
                                                        } else if (var14 == 0) {
                                                            var100.method1626(var101 * var105 + var12, var102 * var106 + var13);
                                                        } else {
                                                            var100.method1632(var101 * var105 + var12, var102 * var106 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1714(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2600 * 4096 / var101;
                                                if (var10.field2617 != 0) {
                                                    var100.method1638(var10.field2600 / 2 + var12, var10.field2582 / 2 + var13, var10.field2617, var107);
                                                } else if (var14 != 0) {
                                                    var100.method1652(var12, var13, var10.field2600, var10.field2582, 256 - (var14 & 0xFF));
                                                } else if (var10.field2600 == var101 && var10.field2582 == var102) {
                                                    var100.method1626(var12, var13);
                                                } else {
                                                    var100.method1628(var12, var13, var10.field2600, var10.field2582);
                                                }
                                            }
                                        } else if (class158.field2589) {
                                            method64(var10);
                                        }
                                    } else {
                                        class86 var99 = var10.method3075(method2155(var10));
                                        if (var99 != null) {
                                            var99.method1626(var12, var13);
                                        } else if (class158.field2589) {
                                            method64(var10);
                                        }
                                    }
                                } else if (var10.field2593 == 6) {
                                    boolean var108 = method2155(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2628;
                                    } else {
                                        var109 = var10.field2627;
                                    }
                                    class112 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2695 != -1) {
                                        class40 var112 = class40.method44(var10.field2695);
                                        if (var112 != null) {
                                            class40 var113 = var112.method812(var10.field2624);
                                            var110 = var113.method817(1);
                                            if (var110 == null) {
                                                method64(var10);
                                            } else {
                                                var110.method2174();
                                                var111 = var110.field1556 / 2;
                                            }
                                        }
                                    } else if (var10.field2623 == 5) {
                                        if (var10.field2625 == 0) {
                                            var110 = field618.method3161((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var110 = Statics.field1358.method26();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method3077((class34) null, -1, var108, Statics.field1358.field32);
                                        if (var110 == null && class158.field2589) {
                                            method64(var10);
                                        }
                                    } else {
                                        class34 var114 = class34.method763(var109);
                                        var110 = var10.method3077(var114, var10.field2616, var108, Statics.field1358.field32);
                                        if (var110 == null && class158.field2589) {
                                            method64(var10);
                                        }
                                    }
                                    class104.method2065(var10.field2600 / 2 + var12, var10.field2582 / 2 + var13);
                                    int var115 = var10.field2619 * class104.field1789[var10.field2631] >> 16;
                                    int var116 = var10.field2619 * class104.field1781[var10.field2631] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2590) {
                                            var110.method2174();
                                            if (var10.field2664) {
                                                var110.method2187(0, var10.field2632, var10.field2633, var10.field2631, var10.field2629, var10.field2630 + var111 + var115, var10.field2630 + var116, var10.field2619);
                                            } else {
                                                var110.method2186(0, var10.field2632, var10.field2633, var10.field2631, var10.field2629, var10.field2630 + var111 + var115, var10.field2630 + var116);
                                            }
                                        } else {
                                            var110.method2186(0, var10.field2632, 0, var10.field2631, 0, var115, var116);
                                        }
                                    }
                                    class104.method2064();
                                } else {
                                    if (var10.field2593 == 7) {
                                        class183 var117 = var10.method3106();
                                        if (var117 == null) {
                                            if (class158.field2589) {
                                                method64(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2582; var119++) {
                                            for (int var120 = 0; var120 < var10.field2600; var120++) {
                                                if (var10.field2649[var118] > 0) {
                                                    class40 var121 = class40.method44(var10.field2649[var118] - 1);
                                                    String var122;
                                                    if (var121.field1007 != 1 && var10.field2634[var118] == 1) {
                                                        var122 = class2.method2648(16748608) + var121.field996 + class2.field23;
                                                    } else {
                                                        String var123 = class2.method2648(16748608) + var121.field996 + class2.field23 + " " + 'x';
                                                        int var124 = var10.field2634[var118];
                                                        String var125 = Integer.toString(var124);
                                                        for (int var126 = var125.length() - 3; var126 > 0; var126 -= 3) {
                                                            var125 = var125.substring(0, var126) + class2.field26 + var125.substring(var126);
                                                        }
                                                        String var127;
                                                        if (var125.length() > 9) {
                                                            var127 = " " + class2.method2648(65408) + var125.substring(0, var125.length() - 8) + class134.field2172 + " " + class2.field19 + var125 + class2.field20 + class2.field23;
                                                        } else if (var125.length() > 6) {
                                                            var127 = " " + class2.method2648(16777215) + var125.substring(0, var125.length() - 4) + class134.field2240 + " " + class2.field19 + var125 + class2.field20 + class2.field23;
                                                        } else {
                                                            var127 = " " + class2.method2648(16776960) + var125 + class2.field23;
                                                        }
                                                        var122 = var123 + var127;
                                                    }
                                                    int var128 = (var10.field2690 + 115) * var120 + var12;
                                                    int var129 = (var10.field2645 + 12) * var119 + var13;
                                                    if (var10.field2678 == 0) {
                                                        var117.method3351(var122, var128, var129, var10.field2608, var10.field2643 ? 0 : -1);
                                                    } else if (var10.field2678 == 1) {
                                                        var117.method3353(var122, var10.field2600 / 2 + var128, var129, var10.field2608, var10.field2643 ? 0 : -1);
                                                    } else {
                                                        var117.method3421(var122, var10.field2600 + var128 - 1, var129, var10.field2608, var10.field2643 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2593 == 8 && Statics.field970 == var10 && field641 == field610) {
                                        int var130 = 0;
                                        int var131 = 0;
                                        class183 var132 = Statics.field697;
                                        String var133 = var10.field2638;
                                        String var134 = method199(var133, var10);
                                        while (var134.length() > 0) {
                                            int var135 = var134.indexOf(class2.field16);
                                            String var136;
                                            if (var135 == -1) {
                                                var136 = var134;
                                                var134 = "";
                                            } else {
                                                var136 = var134.substring(0, var135);
                                                var134 = var134.substring(var135 + 4);
                                            }
                                            int var137 = var132.method3346(var136);
                                            if (var137 > var130) {
                                                var130 = var137;
                                            }
                                            var131 += var132.field2840 + 1;
                                        }
                                        var130 += 6;
                                        var131 += 7;
                                        int var138 = var10.field2600 + var12 - 5 - var130;
                                        int var139 = var10.field2582 + var13 + 5;
                                        if (var138 < var12 + 5) {
                                            var138 = var12 + 5;
                                        }
                                        if (var130 + var138 > arg4) {
                                            var138 = arg4 - var130;
                                        }
                                        if (var131 + var139 > arg5) {
                                            var139 = arg5 - var131;
                                        }
                                        class89.method1772(var138, var139, var130, var131, 16777120);
                                        class89.method1722(var138, var139, var130, var131, 0);
                                        String var140 = var10.field2638;
                                        int var141 = var132.field2840 + var139 + 2;
                                        String var142 = method199(var140, var10);
                                        while (var142.length() > 0) {
                                            int var143 = var142.indexOf(class2.field16);
                                            String var144;
                                            if (var143 == -1) {
                                                var144 = var142;
                                                var142 = "";
                                            } else {
                                                var144 = var142.substring(0, var143);
                                                var142 = var142.substring(var143 + 4);
                                            }
                                            var132.method3351(var144, var138 + 3, var141, 0, -1);
                                            var141 += var132.field2840 + 1;
                                        }
                                    }
                                    if (var10.field2593 == 9) {
                                        if (var10.field2614 == 1) {
                                            class89.method1728(var12, var13, var10.field2600 + var12, var10.field2582 + var13, var10.field2608);
                                        } else {
                                            int var145 = var10.field2600 >= 0 ? var10.field2600 : -var10.field2600;
                                            int var146 = var10.field2582 >= 0 ? var10.field2582 : -var10.field2582;
                                            int var147 = var145;
                                            if (var145 < var146) {
                                                var147 = var146;
                                            }
                                            if (var147 != 0) {
                                                int var148 = (var10.field2600 << 16) / var147;
                                                int var149 = (var10.field2582 << 16) / var147;
                                                if (var149 <= var148) {
                                                    var148 = -var148;
                                                } else {
                                                    var149 = -var149;
                                                }
                                                int var150 = var10.field2614 * var149 >> 17;
                                                int var151 = var10.field2614 * var149 + 1 >> 17;
                                                int var152 = var10.field2614 * var148 >> 17;
                                                int var153 = var10.field2614 * var148 + 1 >> 17;
                                                int var154 = var12 + var150;
                                                int var155 = var12 - var151;
                                                int var156 = var10.field2600 + var12 - var151;
                                                int var157 = var10.field2600 + var12 + var150;
                                                int var158 = var13 + var152;
                                                int var159 = var13 - var153;
                                                int var160 = var10.field2582 + var13 - var153;
                                                int var161 = var10.field2582 + var13 + var152;
                                                class104.method2070(var154, var155, var156);
                                                class104.method2073(var158, var159, var160, var154, var155, var156, var10.field2608);
                                                class104.method2070(var154, var156, var157);
                                                class104.method2073(var158, var160, var161, var154, var156, var157, var10.field2608);
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

    @ObfuscatedName("t.ci(Ljava/lang/String;Lfj;B)Ljava/lang/String;")
    public static String method199(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method109(arg1, var2 - 1);
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
                if (Statics.field508 != null) {
                    var8 = class147.method2654(Statics.field508.field1426);
                    if (Statics.field508.field1432 != null) {
                        var8 = (String) Statics.field508.field1432;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dv.ch(Lfj;IIIIIIB)V")
    public static final void method2330(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field732) {
            field573 = 32;
        } else {
            field573 = 0;
        }
        field732 = false;
        if (class77.field1407 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2605 -= 4;
                method64(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2605 += 4;
                method64(arg0);
            } else if (arg5 >= arg1 - field573 && arg5 < field573 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2605 = (arg4 - arg3) * var8 / var9;
                method64(arg0);
                field732 = true;
            }
        }
        if (field684 == 0) {
            return;
        }
        int var10 = arg0.field2600;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2605 += field684 * 45;
            method64(arg0);
        }
    }

    @ObfuscatedName("dh.cy(Lfj;B)Z")
    public static final boolean method2155(class158 arg0) {
        if (arg0.field2688 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2688.length; var1++) {
            int var2 = method109(arg0, var1);
            int var3 = arg0.field2687[var1];
            if (arg0.field2688[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2688[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2688[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("v.cr(Lfj;IB)I")
    public static final int method109(class158 arg0, int arg1) {
        if (arg0.field2700 == null || arg1 >= arg0.field2700.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2700[arg1];
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
                    var7 = field626[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field627[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field628[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method139(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method44(var12).field1009 || field544)) {
                        for (int var13 = 0; var13 < var11.field2649.length; var13++) {
                            if (var12 + 1 == var11.field2649[var13]) {
                                var7 += var11.field2634[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2709[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2043[field627[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2709[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1358.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2045[var14]) {
                            var7 += field627[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method139(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method44(var18).field1009 || field544)) {
                        for (int var19 = 0; var19 < var17.field2649.length; var19++) {
                            if (var18 + 1 == var17.field2649[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field609;
                }
                if (var6 == 12) {
                    var7 = field654;
                }
                if (var6 == 13) {
                    int var20 = class159.field2709[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method1461(var22);
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
                    var7 = (Statics.field1358.field462 >> 7) + Statics.field287;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1358.field470 >> 7) + Statics.field364;
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

    @ObfuscatedName("az.ca(Lfj;III)V")
    public static final void method268(class158 arg0, int arg1, int arg2) {
        if (arg0.field2594 == 1) {
            method65(arg0.field2692, "", 24, 0, 0, arg0.field2591);
        }
        if (arg0.field2594 == 2 && !field644) {
            String var3;
            if (class162.method3058(method119(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2636 == null || arg0.field2636.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2636;
            }
            if (var3 != null) {
                method65(var3, class2.method2648(65280) + arg0.field2691, 25, 0, -1, arg0.field2591);
            }
        }
        if (arg0.field2594 == 3) {
            method65(class134.field2236, "", 26, 0, 0, arg0.field2591);
        }
        if (arg0.field2594 == 4) {
            method65(arg0.field2692, "", 28, 0, 0, arg0.field2591);
        }
        if (arg0.field2594 == 5) {
            method65(arg0.field2692, "", 29, 0, 0, arg0.field2591);
        }
        if (arg0.field2594 == 6 && field652 == null) {
            method65(arg0.field2692, "", 30, 0, -1, arg0.field2591);
        }
        if (arg0.field2593 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2582; var6++) {
                for (int var7 = 0; var7 < arg0.field2600; var7++) {
                    int var8 = (arg0.field2690 + 32) * var7;
                    int var9 = (arg0.field2645 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2606[var5];
                        var9 += arg0.field2672[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field690 = var5;
                        Statics.field1442 = arg0;
                        if (arg0.field2649[var5] > 0) {
                            label314: {
                                class40 var10 = class40.method44(arg0.field2649[var5] - 1);
                                if (field642 == 1) {
                                    int var11 = method119(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field230 != arg0.field2591 || Statics.field958 != var5) {
                                            method65(class134.field2227, field643 + " " + class2.field21 + " " + class2.method2648(16748608) + var10.field996, 31, var10.field994, var5, arg0.field2591);
                                        }
                                        break label314;
                                    }
                                }
                                if (field644) {
                                    int var13 = method119(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field79 & 0x10) == 16) {
                                            method65(field504, field647 + " " + class2.field21 + " " + class2.method2648(16748608) + var10.field996, 32, var10.field994, var5, arg0.field2591);
                                        }
                                        break label314;
                                    }
                                }
                                String[] var15 = var10.field1011;
                                if (field658) {
                                    var15 = method35(var15);
                                }
                                int var16 = method119(arg0);
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
                                            method65(var15[var18], class2.method2648(16748608) + var10.field996, var19, var10.field994, var5, arg0.field2591);
                                        } else if (var18 == 4) {
                                            method65(class134.field2213, class2.method2648(16748608) + var10.field996, 37, var10.field994, var5, arg0.field2591);
                                        }
                                    }
                                }
                                class162 var10000 = (class162) null;
                                if (class162.method2262(method119(arg0))) {
                                    method65(class134.field2227, class2.method2648(16748608) + var10.field996, 38, var10.field994, var5, arg0.field2591);
                                }
                                int var20 = method119(arg0);
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
                                            method65(var15[var22], class2.method2648(16748608) + var10.field996, var23, var10.field994, var5, arg0.field2591);
                                        }
                                    }
                                }
                                String[] var24 = arg0.field2612;
                                if (field658) {
                                    var24 = method35(var24);
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
                                            method65(var24[var25], class2.method2648(16748608) + var10.field996, var26, var10.field994, var5, arg0.field2591);
                                        }
                                    }
                                }
                                method65(class134.field2228, class2.method2648(16748608) + var10.field996, 1005, var10.field994, var5, arg0.field2591);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2590) {
            return;
        }
        if (field644) {
            int var27 = method119(arg0);
            boolean var28 = (var27 >> 21 & 0x1) != 0;
            if (var28 && (Statics.field79 & 0x20) == 32) {
                method65(field504, field647 + " " + class2.field21 + " " + arg0.field2648, 58, 0, arg0.field2592, arg0.field2591);
            }
            return;
        }
        for (int var29 = 9; var29 >= 5; var29--) {
            String var30 = method547(arg0, var29);
            if (var30 != null) {
                method65(var30, arg0.field2648, 1007, var29 + 1, arg0.field2592, arg0.field2591);
            }
        }
        String var31;
        if (class162.method3058(method119(arg0)) == 0) {
            var31 = null;
        } else if (arg0.field2636 == null || arg0.field2636.trim().length() == 0) {
            var31 = null;
        } else {
            var31 = arg0.field2636;
        }
        if (var31 != null) {
            method65(var31, arg0.field2648, 25, 0, arg0.field2592, arg0.field2591);
        }
        for (int var33 = 4; var33 >= 0; var33--) {
            String var34 = method547(arg0, var33);
            if (var34 != null) {
                method65(var34, arg0.field2648, 57, var33 + 1, arg0.field2592, arg0.field2591);
            }
        }
        if (class162.method1982(method119(arg0))) {
            method65(class134.field2214, "", 30, 0, arg0.field2592, arg0.field2591);
        }
    }

    @ObfuscatedName("t.cs([Lfj;IIIIIIII)V")
    public static final void method222(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2590 || var9.field2593 == 0 || var9.field2658 || method119(var9) != 0 || field660 == var9) && var9.field2602 == arg1 && (!var9.field2590 || !method2164(var9))) {
                int var10 = var9.field2644 + arg6;
                int var11 = var9.field2597 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2593 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2593 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2600 + var10;
                    int var19 = var9.field2582 + var11;
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
                    int var22 = var9.field2600 + var10;
                    int var23 = var9.field2582 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field659 == var9) {
                    field485 = true;
                    field588 = var10;
                    field669 = var11;
                }
                if (!var9.field2590 || var12 < var14 && var13 < var15) {
                    if (var9.field2657 == 1337) {
                        method64(var9);
                    } else if (var9.field2657 == 1338) {
                        method1785(var10, var11);
                    } else {
                        if (var9.field2593 == 0) {
                            if (!var9.field2590 && method2164(var9) && Statics.field969 != var9) {
                                continue;
                            }
                            method222(arg0, var9.field2591, var12, var13, var14, var15, var10 - var9.field2604, var11 - var9.field2605);
                            if (var9.field2699 != null) {
                                method222(var9.field2699, var9.field2591, var12, var13, var14, var15, var10 - var9.field2604, var11 - var9.field2605);
                            }
                            class4 var24 = (class4) field663.method3268((long) var9.field2591);
                            if (var24 != null) {
                                int var25 = var24.field64;
                                if (Statics.method2702(var25)) {
                                    method222(Statics.field2595[var25], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2590) {
                            boolean var26;
                            if (class77.field1408 >= var12 && class77.field1409 >= var13 && class77.field1408 < var14 && class77.field1409 < var15) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class77.field1407 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class77.field1412 == 1 && class77.field1415 >= var12 && class77.field1416 >= var13 && class77.field1415 < var14 && class77.field1416 < var15) {
                                var28 = true;
                            }
                            if (var28) {
                                method546(var9, class77.field1415 - var10, class77.field1416 - var11);
                            }
                            if (field659 != null && field659 != var9 && var26 && class162.method2169(method119(var9))) {
                                field636 = var9;
                            }
                            if (field660 == var9) {
                                field664 = true;
                                field665 = var10;
                                field666 = var11;
                            }
                            if (var9.field2658) {
                                if (var26 && field684 != 0 && var9.field2679 != null) {
                                    class1 var29 = new class1();
                                    var29.field1 = var9;
                                    var29.field4 = field684;
                                    var29.field8 = var9.field2679;
                                    field685.method3308(var29);
                                }
                                if (field659 != null || Statics.field152 != null || field630) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var9.field2669 && var28) {
                                    var9.field2669 = true;
                                    if (var9.field2660 != null) {
                                        class1 var30 = new class1();
                                        var30.field1 = var9;
                                        var30.field3 = class77.field1415 - var10;
                                        var30.field4 = class77.field1416 - var11;
                                        var30.field8 = var9.field2660;
                                        field685.method3308(var30);
                                    }
                                }
                                if (var9.field2669 && var27 && var9.field2661 != null) {
                                    class1 var31 = new class1();
                                    var31.field1 = var9;
                                    var31.field3 = class77.field1408 - var10;
                                    var31.field4 = class77.field1409 - var11;
                                    var31.field8 = var9.field2661;
                                    field685.method3308(var31);
                                }
                                if (var9.field2669 && !var27) {
                                    var9.field2669 = false;
                                    if (var9.field2618 != null) {
                                        class1 var32 = new class1();
                                        var32.field1 = var9;
                                        var32.field3 = class77.field1408 - var10;
                                        var32.field4 = class77.field1409 - var11;
                                        var32.field8 = var9.field2618;
                                        field687.method3308(var32);
                                    }
                                }
                                if (var27 && var9.field2663 != null) {
                                    class1 var33 = new class1();
                                    var33.field1 = var9;
                                    var33.field3 = class77.field1408 - var10;
                                    var33.field4 = class77.field1409 - var11;
                                    var33.field8 = var9.field2663;
                                    field685.method3308(var33);
                                }
                                if (!var9.field2585 && var26) {
                                    var9.field2585 = true;
                                    if (var9.field2662 != null) {
                                        class1 var34 = new class1();
                                        var34.field1 = var9;
                                        var34.field3 = class77.field1408 - var10;
                                        var34.field4 = class77.field1409 - var11;
                                        var34.field8 = var9.field2662;
                                        field685.method3308(var34);
                                    }
                                }
                                if (var9.field2585 && var26 && var9.field2665 != null) {
                                    class1 var35 = new class1();
                                    var35.field1 = var9;
                                    var35.field3 = class77.field1408 - var10;
                                    var35.field4 = class77.field1409 - var11;
                                    var35.field8 = var9.field2665;
                                    field685.method3308(var35);
                                }
                                if (var9.field2585 && !var26) {
                                    var9.field2585 = false;
                                    if (var9.field2666 != null) {
                                        class1 var36 = new class1();
                                        var36.field1 = var9;
                                        var36.field3 = class77.field1408 - var10;
                                        var36.field4 = class77.field1409 - var11;
                                        var36.field8 = var9.field2666;
                                        field687.method3308(var36);
                                    }
                                }
                                if (var9.field2641 != null) {
                                    class1 var37 = new class1();
                                    var37.field1 = var9;
                                    var37.field8 = var9.field2641;
                                    field686.method3308(var37);
                                }
                                if (var9.field2671 != null && field506 > var9.field2703) {
                                    if (var9.field2601 == null || field506 - var9.field2703 > 32) {
                                        class1 var42 = new class1();
                                        var42.field1 = var9;
                                        var42.field8 = var9.field2671;
                                        field685.method3308(var42);
                                    } else {
                                        label381: for (int var38 = var9.field2703; var38 < field506; var38++) {
                                            int var39 = field672[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var9.field2601.length; var40++) {
                                                if (var9.field2601[var40] == var39) {
                                                    class1 var41 = new class1();
                                                    var41.field1 = var9;
                                                    var41.field8 = var9.field2671;
                                                    field685.method3308(var41);
                                                    break label381;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2703 = field506;
                                }
                                if (var9.field2673 != null && field613 > var9.field2704) {
                                    if (var9.field2651 == null || field613 - var9.field2704 > 32) {
                                        class1 var47 = new class1();
                                        var47.field1 = var9;
                                        var47.field8 = var9.field2673;
                                        field685.method3308(var47);
                                    } else {
                                        label361: for (int var43 = var9.field2704; var43 < field613; var43++) {
                                            int var44 = field579[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2651.length; var45++) {
                                                if (var9.field2651[var45] == var44) {
                                                    class1 var46 = new class1();
                                                    var46.field1 = var9;
                                                    var46.field8 = var9.field2673;
                                                    field685.method3308(var46);
                                                    break label361;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2704 = field613;
                                }
                                if (var9.field2607 != null && field677 > var9.field2705) {
                                    if (var9.field2676 == null || field677 - var9.field2705 > 32) {
                                        class1 var52 = new class1();
                                        var52.field1 = var9;
                                        var52.field8 = var9.field2607;
                                        field685.method3308(var52);
                                    } else {
                                        label341: for (int var48 = var9.field2705; var48 < field677; var48++) {
                                            int var49 = field676[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2676.length; var50++) {
                                                if (var9.field2676[var50] == var49) {
                                                    class1 var51 = new class1();
                                                    var51.field1 = var9;
                                                    var51.field8 = var9.field2607;
                                                    field685.method3308(var51);
                                                    break label341;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2705 = field677;
                                }
                                if (field678 > var9.field2702 && var9.field2680 != null) {
                                    class1 var53 = new class1();
                                    var53.field1 = var9;
                                    var53.field8 = var9.field2680;
                                    field685.method3308(var53);
                                }
                                if (field667 > var9.field2702 && var9.field2675 != null) {
                                    class1 var54 = new class1();
                                    var54.field1 = var9;
                                    var54.field8 = var9.field2675;
                                    field685.method3308(var54);
                                }
                                if (field680 > var9.field2702 && var9.field2683 != null) {
                                    class1 var55 = new class1();
                                    var55.field1 = var9;
                                    var55.field8 = var9.field2683;
                                    field685.method3308(var55);
                                }
                                if (field668 > var9.field2702 && var9.field2684 != null) {
                                    class1 var56 = new class1();
                                    var56.field1 = var9;
                                    var56.field8 = var9.field2684;
                                    field685.method3308(var56);
                                }
                                var9.field2702 = field538;
                                if (var9.field2668 != null) {
                                    for (int var57 = 0; var57 < field572; var57++) {
                                        class1 var58 = new class1();
                                        var58.field1 = var9;
                                        var58.field7 = field571[var57];
                                        var58.field12 = field710[var57];
                                        var58.field8 = var9.field2668;
                                        field685.method3308(var58);
                                    }
                                }
                            }
                        }
                        if (!var9.field2590) {
                            if (field659 != null || Statics.field152 != null || field630) {
                                return;
                            }
                            if ((var9.field2682 >= 0 || var9.field2694 != 0) && class77.field1408 >= var12 && class77.field1409 >= var13 && class77.field1408 < var14 && class77.field1409 < var15) {
                                if (var9.field2682 >= 0) {
                                    Statics.field969 = arg0[var9.field2682];
                                } else {
                                    Statics.field969 = var9;
                                }
                            }
                            if (var9.field2593 == 8 && class77.field1408 >= var12 && class77.field1409 >= var13 && class77.field1408 < var14 && class77.field1409 < var15) {
                                Statics.field970 = var9;
                            }
                            if (var9.field2697 > var9.field2582) {
                                method2330(var9, var9.field2600 + var10, var11, var9.field2582, var9.field2697, class77.field1408, class77.field1409);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.cj(IIB)V")
    public static final void method3(int arg0, int arg1) {
        if (Statics.method2702(arg0)) {
            method15(Statics.field2595[arg0], arg1);
        }
    }

    @ObfuscatedName("p.cq([Lfj;II)V")
    public static final void method15(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2593 == 0) {
                    if (var3.field2699 != null) {
                        method15(var3.field2699, arg1);
                    }
                    class4 var4 = (class4) field663.method3268((long) var3.field2591);
                    if (var4 != null) {
                        method3(var4.field64, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2685 != null) {
                    class1 var5 = new class1();
                    var5.field1 = var3;
                    var5.field8 = var3.field2685;
                    class26.method1269(var5);
                }
                if (arg1 == 1 && var3.field2686 != null) {
                    if (var3.field2592 >= 0) {
                        class158 var6 = class158.method139(var3.field2591);
                        if (var6 == null || var6.field2699 == null || var3.field2592 >= var6.field2699.length || var6.field2699[var3.field2592] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field1 = var3;
                    var7.field8 = var3.field2686;
                    class26.method1269(var7);
                }
            }
        }
    }

    @ObfuscatedName("ax.cn(Lfj;III)V")
    public static final void method546(class158 arg0, int arg1, int arg2) {
        if (field659 != null || field630 || arg0 == null || method1324(arg0) == null) {
            return;
        }
        field659 = arg0;
        field660 = method1324(arg0);
        field661 = arg1;
        field662 = arg2;
        Statics.field1295 = 0;
        field670 = false;
    }

    @ObfuscatedName("d.cf(Lfj;I)V")
    public static void method64(class158 arg0) {
        if (field580 == arg0.field2707) {
            field691[arg0.field2706] = true;
        }
    }

    @ObfuscatedName("r.cp(S)V")
    public static void method228() {
        for (class4 var0 = (class4) field663.method3271(); var0 != null; var0 = (class4) field663.method3272()) {
            int var1 = var0.field64;
            if (Statics.method2702(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2595[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2590;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2818;
                    class158 var6 = class158.method139(var5);
                    if (var6 != null) {
                        method64(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.cc(Lfj;B)Lfj;")
    public static class158 method1324(class158 arg0) {
        class158 var1 = Statics.method142(arg0);
        if (var1 == null) {
            var1 = arg0.field2653;
        }
        return var1;
    }

    @ObfuscatedName("l.cd([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method35(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("h.cz(II)V")
    public static final void method134(int arg0) {
        if (!Statics.method2702(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2595[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2616 = 0;
                var3.field2698 = 0;
            }
        }
    }

    @ObfuscatedName("ca.ct(II)V")
    public static final void method1574(int arg0) {
        if (Statics.method2702(arg0)) {
            method2147(Statics.field2595[arg0], -1);
        }
    }

    @ObfuscatedName("dy.cv([Lfj;II)V")
    public static final void method2147(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2602 == arg1 && (!var3.field2590 || !method2164(var3))) {
                if (var3.field2593 == 0) {
                    if (!var3.field2590 && method2164(var3) && Statics.field969 != var3) {
                        continue;
                    }
                    method2147(arg0, var3.field2591);
                    if (var3.field2699 != null) {
                        method2147(var3.field2699, var3.field2591);
                    }
                    class4 var4 = (class4) field663.method3268((long) var3.field2591);
                    if (var4 != null) {
                        int var5 = var4.field64;
                        if (Statics.method2702(var5)) {
                            method2147(Statics.field2595[var5], -1);
                        }
                    }
                }
                if (var3.field2593 == 6) {
                    if (var3.field2627 != -1 || var3.field2628 != -1) {
                        boolean var6 = method2155(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2628;
                        } else {
                            var7 = var3.field2627;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method763(var7);
                            var3.field2698 += field683;
                            while (var3.field2698 > var8.field892[var3.field2616]) {
                                var3.field2698 -= var8.field892[var3.field2616];
                                var3.field2616++;
                                if (var3.field2616 >= var8.field890.length) {
                                    var3.field2616 -= var8.field894;
                                    if (var3.field2616 < 0 || var3.field2616 >= var8.field890.length) {
                                        var3.field2616 = 0;
                                    }
                                }
                                method64(var3);
                            }
                        }
                    }
                    if (var3.field2635 != 0 && !var3.field2590) {
                        int var9 = var3.field2635 >> 16;
                        int var10 = var3.field2635 << 16 >> 16;
                        int var11 = field683 * var9;
                        int var12 = field683 * var10;
                        var3.field2631 = var3.field2631 + var11 & 0x7FF;
                        var3.field2632 = var3.field2632 + var12 & 0x7FF;
                        method64(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.cl(IB)V")
    public static final void method244(int arg0) {
        method228();
        class7.method722();
        class42 var1 = (class42) class42.field1044.method3223((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1047.method2932(16, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method867(new class127(var3));
            }
            class42.field1044.method3225(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1045;
        if (var5 == 0) {
            return;
        }
        int var6 = class159.field2709[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class104.method2093(0.9D);
                ((class110) Statics.field1786).method2156(0.9D);
            }
            if (var6 == 2) {
                class104.method2093(0.8D);
                ((class110) Statics.field1786).method2156(0.8D);
            }
            if (var6 == 3) {
                class104.method2093(0.7D);
                ((class110) Statics.field1786).method2156(0.7D);
            }
            if (var6 == 4) {
                class104.method2093(0.6D);
                ((class110) Statics.field1786).method2156(0.6D);
            }
            class40.method16();
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
            if (field682 != var7) {
                if (field682 == 0 && field724 != -1) {
                    class138.method2650(Statics.field514, field724, 0, var7, false);
                    field681 = false;
                } else if (var7 == 0) {
                    Statics.field2346.method2710();
                    class138.field2345 = 1;
                    Statics.field1518 = null;
                    field681 = false;
                } else if (class138.field2345 == 0) {
                    Statics.field2346.method2704(var7);
                } else {
                    Statics.field155 = var7;
                }
                field682 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field726 = 127;
            }
            if (var6 == 1) {
                field726 = 96;
            }
            if (var6 == 2) {
                field726 = 64;
            }
            if (var6 == 3) {
                field726 = 32;
            }
            if (var6 == 4) {
                field726 = 0;
            }
        }
        if (var5 == 5) {
            field629 = var6;
        }
        if (var5 == 6) {
            field650 = var6;
        }
        if (var5 == 9) {
            field720 = var6;
        }
        if (var5 != 10) {
            return;
        }
        if (var6 == 0) {
            field727 = 127;
        }
        if (var6 == 1) {
            field727 = 96;
        }
        if (var6 == 2) {
            field727 = 64;
        }
        if (var6 == 3) {
            field727 = 32;
        }
        if (var6 == 4) {
            field727 = 0;
        }
    }

    @ObfuscatedName("av.cx(Lfj;I)V")
    public static final void method874(class158 arg0) {
        int var1 = arg0.field2657;
        if (var1 == 324) {
            if (field747 == -1) {
                field747 = arg0.field2615;
                field748 = arg0.field2701;
            }
            if (field618.field2743) {
                arg0.field2615 = field747;
            } else {
                arg0.field2615 = field748;
            }
        } else if (var1 == 325) {
            if (field747 == -1) {
                field747 = arg0.field2615;
                field748 = arg0.field2701;
            }
            if (field618.field2743) {
                arg0.field2615 = field748;
            } else {
                arg0.field2615 = field747;
            }
        } else if (var1 == 327) {
            arg0.field2631 = 150;
            arg0.field2632 = (int) (Math.sin((double) field491 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2623 = 5;
            arg0.field2625 = 0;
        } else if (var1 == 328) {
            arg0.field2631 = 150;
            arg0.field2632 = (int) (Math.sin((double) field491 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2623 = 5;
            arg0.field2625 = 1;
        }
    }

    @ObfuscatedName("ao.cu(Ll;ZI)V")
    public static final void method809(class4 arg0, boolean arg1) {
        int var2 = arg0.field64;
        int var3 = (int) arg0.field2818;
        arg0.method3319();
        if (arg1) {
            class158.method163(var2);
        }
        for (class171 var4 = (class171) field645.method3271(); var4 != null; var4 = (class171) field645.method3272()) {
            if ((long) var2 == (var4.field2818 >> 48 & 0xFFFFL)) {
                var4.method3319();
            }
        }
        class158 var5 = class158.method139(var3);
        if (var5 != null) {
            method64(var5);
        }
        method166();
        if (field648 != -1) {
            method3(field648, 1);
        }
    }

    @ObfuscatedName("bj.ck(Lfj;B)Z")
    public static final boolean method1525(class158 arg0) {
        int var1 = arg0.field2657;
        if (var1 == 205) {
            field492 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field618.method3138(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field618.method3139(var4, var5 == 1);
        }
        if (var1 == 324) {
            field618.method3140(false);
        }
        if (var1 == 325) {
            field618.method3140(true);
        }
        if (var1 == 326) {
            field526.method2265(33);
            field618.method3141(field526);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dl.cg(IIIILcq;I)V")
    public static final void method2335(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method155(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field553 + field499 & 0x7FF;
        int var7 = class104.field1789[var6];
        int var8 = class104.field1781[var6];
        int var9 = var7 * 256 / (field564 + 256);
        int var10 = var8 * 256 / (field564 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field780.method1637(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("y.cb(IIIILcq;I)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field553 + field499 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1789[var5];
        int var8 = class104.field1781[var5];
        int var9 = var7 * 256 / (field564 + 256);
        int var10 = var8 * 256 / (field564 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1640(Statics.field187, arg0 + 94 + var11 - arg4.field1485 / 2 + 4, arg1 + 83 - var12 - arg4.field1481 / 2 - 4);
        } else {
            arg4.method1626(arg0 + 94 + var11 - arg4.field1485 / 2 + 4, arg1 + 83 - var12 - arg4.field1481 / 2 - 4);
        }
    }

    @ObfuscatedName("q.cw(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method39(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field699[var4] = field699[var4 - 1];
            field700[var4] = field700[var4 - 1];
            field702[var4] = field702[var4 - 1];
            field701[var4] = field701[var4 - 1];
        }
        field699[0] = arg0;
        field700[0] = arg1;
        field702[0] = arg2;
        field701[0] = arg3;
        field703++;
        field678 = field538;
    }

    @ObfuscatedName("r.ce(Ljava/lang/String;S)Z")
    public static boolean method232(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method38(arg0, Statics.field728);
        for (int var2 = 0; var2 < field705; var2++) {
            if (var1.equalsIgnoreCase(class148.method38(field742[var2].field372, Statics.field728))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class148.method38(Statics.field1358.field40, Statics.field728))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("z.co(Ljava/lang/String;I)Z")
    public static boolean method144(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method38(arg0, Statics.field728);
        for (int var2 = 0; var2 < field638; var2++) {
            class11 var3 = field739[var2];
            if (var1.equalsIgnoreCase(class148.method38(var3.field197, Statics.field728))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method38(var3.field196, Statics.field728))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bl.dw(Ljava/lang/String;I)V")
    public static final void method1458(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method38(arg0, Statics.field728);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field705; var2++) {
            class23 var3 = field742[var2];
            String var4 = var3.field372;
            String var5 = class148.method38(var4, Statics.field728);
            if (class136.method2125(arg0, var1, var4, var5)) {
                field705--;
                for (int var6 = var2; var6 < field705; var6++) {
                    field742[var6] = field742[var6 + 1];
                }
                field667 = field538;
                field526.method2265(86);
                field526.method2397(class127.method1488(arg0));
                field526.method2469(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("x.de(Ljava/lang/String;I)V")
    public static final void method236(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method38(arg0, Statics.field728);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field638; var2++) {
            class11 var3 = field739[var2];
            String var4 = var3.field197;
            String var5 = class148.method38(var4, Statics.field728);
            if (class136.method2125(arg0, var1, var4, var5)) {
                field638--;
                for (int var6 = var2; var6 < field638; var6++) {
                    field739[var6] = field739[var6 + 1];
                }
                field667 = field538;
                field526.method2265(25);
                field526.method2397(class127.method1488(arg0));
                field526.method2469(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("by.db(Ljava/lang/String;II)V")
    public static final void method1434(String arg0, int arg1) {
        field526.method2265(243);
        field526.method2397(class127.method1488(arg0) + 1);
        field526.method2433(arg1);
        field526.method2469(arg0);
    }

    @ObfuscatedName("ch.dy(Ljava/lang/String;B)V")
    public static final void method1535(String arg0) {
        if (Statics.field1530 != null) {
            field526.method2265(210);
            field526.method2397(class127.method1488(arg0));
            field526.method2469(arg0);
        }
    }

    @ObfuscatedName("cr.dg(Ljava/lang/String;I)V")
    public static final void method1542(String arg0) {
        if (!arg0.equals("")) {
            field526.method2265(68);
            field526.method2397(class127.method1488(arg0));
            field526.method2469(arg0);
        }
    }

    @ObfuscatedName("h.dh(I)V")
    public static final void method136() {
        field526.method2265(68);
        field526.method2397(0);
    }

    @ObfuscatedName("j.dr(Lfj;I)I")
    public static int method119(class158 arg0) {
        class171 var1 = (class171) field645.method3268(((long) arg0.field2591 << 32) + (long) arg0.field2592);
        return var1 == null ? arg0.field2650 : var1.field2801;
    }

    @ObfuscatedName("dh.dm(Lfj;S)Z")
    public static boolean method2164(class158 arg0) {
        if (field693) {
            if (method119(arg0) != 0) {
                return false;
            }
            if (arg0.field2593 == 0) {
                return false;
            }
        }
        return arg0.field2603;
    }

    @ObfuscatedName("ax.dz(Lfj;II)Ljava/lang/String;")
    public static String method547(class158 arg0, int arg1) {
        int var2 = method119(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2621 == null) {
            return null;
        } else if (arg0.field2652 == null || arg0.field2652.length <= arg1 || arg0.field2652[arg1] == null || arg0.field2652[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2652[arg1];
        }
    }
}

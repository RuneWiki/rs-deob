package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.a")
    public static boolean field481 = true;

    @ObfuscatedName("client.h")
    public static int field635 = 1;

    @ObfuscatedName("client.l")
    public static int field467 = 0;

    @ObfuscatedName("client.k")
    public static boolean field636 = false;

    @ObfuscatedName("client.q")
    public static boolean field471 = false;

    @ObfuscatedName("client.w")
    public static class130[] field475 = new class130[4];

    @ObfuscatedName("client.v")
    public static int field472 = 0;

    @ObfuscatedName("client.m")
    public static int field474 = 0;

    @ObfuscatedName("client.r")
    public static boolean field664 = true;

    @ObfuscatedName("client.u")
    public static int field476 = 0;

    @ObfuscatedName("client.i")
    public static long field578 = 1L;

    @ObfuscatedName("client.o")
    public static int field479 = -1;

    @ObfuscatedName("client.g")
    public static int field583 = -1;

    @ObfuscatedName("client.d")
    public static int field629 = -1;

    @ObfuscatedName("client.t")
    public static boolean field653 = true;

    @ObfuscatedName("client.b")
    public static boolean field483 = false;

    @ObfuscatedName("client.c")
    public static int field484 = 0;

    @ObfuscatedName("client.aw")
    public static int field545 = 0;

    @ObfuscatedName("client.ap")
    public static int field486 = 0;

    @ObfuscatedName("client.am")
    public static int field615 = 0;

    @ObfuscatedName("client.az")
    public static int field488 = 0;

    @ObfuscatedName("client.ax")
    public static int field688 = 0;

    @ObfuscatedName("client.af")
    public static int field693 = 0;

    @ObfuscatedName("client.aa")
    public static int field668 = 0;

    @ObfuscatedName("client.ag")
    public static int field492 = 0;

    @ObfuscatedName("client.aj")
    public static class127 field676 = new class127(new byte[5000]);

    @ObfuscatedName("client.ae")
    public static int field494 = 0;

    @ObfuscatedName("client.ay")
    public static int field495 = 0;

    @ObfuscatedName("client.ac")
    public static int field496 = 0;

    @ObfuscatedName("client.bw")
    public static int field499 = 0;

    @ObfuscatedName("client.bj")
    public static int field491 = 0;

    @ObfuscatedName("client.by")
    public static int field501 = 0;

    @ObfuscatedName("client.be")
    public static int field502 = 0;

    @ObfuscatedName("client.bv")
    public static int field527 = 0;

    @ObfuscatedName("client.bx")
    public static class25[] field505 = new class25[32768];

    @ObfuscatedName("client.bb")
    public static int field506 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field575 = new int[32768];

    @ObfuscatedName("client.cy")
    public static class116 field509 = new class116(5000);

    @ObfuscatedName("client.cp")
    public static class116 field510 = new class116(5000);

    @ObfuscatedName("client.cs")
    public static class116 field487 = new class116(5000);

    @ObfuscatedName("client.cf")
    public static int field512 = 0;

    @ObfuscatedName("client.ca")
    public static int field466 = 0;

    @ObfuscatedName("client.ce")
    public static int field514 = 0;

    @ObfuscatedName("client.cb")
    public static int field515 = 0;

    @ObfuscatedName("client.ct")
    public static int field516 = 0;

    @ObfuscatedName("client.cw")
    public static int field517 = 0;

    @ObfuscatedName("client.ck")
    public static int field518 = 0;

    @ObfuscatedName("client.cu")
    public static int field519 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field520 = false;

    @ObfuscatedName("client.cn")
    public static int field521 = 0;

    @ObfuscatedName("client.ch")
    public static int field504 = 0;

    @ObfuscatedName("client.cq")
    public static int field523 = 1;

    @ObfuscatedName("client.cz")
    public static int field524 = 0;

    @ObfuscatedName("client.cd")
    public static int field525 = 1;

    @ObfuscatedName("client.de")
    public static int field526 = 0;

    @ObfuscatedName("client.dq")
    public static boolean field679 = false;

    @ObfuscatedName("client.dc")
    public static int[][][] field597 = new int[4][13][13];

    @ObfuscatedName("client.dy")
    public static final int[] field490 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dg")
    public static int field531 = 0;

    @ObfuscatedName("client.dd")
    public static int field631 = 2;

    @ObfuscatedName("client.do")
    public static int field686 = 0;

    @ObfuscatedName("client.dz")
    public static int field534 = 2;

    @ObfuscatedName("client.dt")
    public static int field535 = 0;

    @ObfuscatedName("client.dn")
    public static int field536 = 1;

    @ObfuscatedName("client.di")
    public static int field537 = 0;

    @ObfuscatedName("client.da")
    public static int field538 = 0;

    @ObfuscatedName("client.dv")
    public static int field539 = 2;

    @ObfuscatedName("client.dj")
    public static int field540 = 0;

    @ObfuscatedName("client.dp")
    public static int field541 = 1;

    @ObfuscatedName("client.du")
    public static int field542 = 0;

    @ObfuscatedName("client.dr")
    public static int field543 = 0;

    @ObfuscatedName("client.et")
    public static int field511 = 2301979;

    @ObfuscatedName("client.ex")
    public static int field546 = 5063219;

    @ObfuscatedName("client.eh")
    public static int field723 = 3353893;

    @ObfuscatedName("client.eq")
    public static int field463 = 7759444;

    @ObfuscatedName("client.eu")
    public static boolean field549 = false;

    @ObfuscatedName("client.ez")
    public static int field547 = 0;

    @ObfuscatedName("client.fx")
    public static int field557 = 128;

    @ObfuscatedName("client.fg")
    public static int field720 = 0;

    @ObfuscatedName("client.fd")
    public static int field603 = 0;

    @ObfuscatedName("client.fa")
    public static int field554 = 0;

    @ObfuscatedName("client.fh")
    public static int field555 = 0;

    @ObfuscatedName("client.fm")
    public static int field556 = 0;

    @ObfuscatedName("client.fn")
    public static int field661 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field558 = false;

    @ObfuscatedName("client.fr")
    public static int field566 = 0;

    @ObfuscatedName("client.fz")
    public static int field560 = 0;

    @ObfuscatedName("client.fo")
    public static int field561 = 50;

    @ObfuscatedName("client.fb")
    public static int[] field672 = new int[field561];

    @ObfuscatedName("client.fu")
    public static int[] field563 = new int[field561];

    @ObfuscatedName("client.ft")
    public static int[] field544 = new int[field561];

    @ObfuscatedName("client.fc")
    public static int[] field711 = new int[field561];

    @ObfuscatedName("client.ff")
    public static int[] field618 = new int[field561];

    @ObfuscatedName("client.fe")
    public static int[] field565 = new int[field561];

    @ObfuscatedName("client.fw")
    public static int[] field568 = new int[field561];

    @ObfuscatedName("client.fq")
    public static String[] field569 = new String[field561];

    @ObfuscatedName("client.fs")
    public static int[][] field570 = new int[104][104];

    @ObfuscatedName("client.fk")
    public static int field667 = 0;

    @ObfuscatedName("client.gs")
    public static int field572 = -1;

    @ObfuscatedName("client.ge")
    public static int field649 = -1;

    @ObfuscatedName("client.gm")
    public static int field574 = 0;

    @ObfuscatedName("client.gg")
    public static int field470 = 0;

    @ObfuscatedName("client.gb")
    public static int field477 = 0;

    @ObfuscatedName("client.gn")
    public static int field577 = 0;

    @ObfuscatedName("client.gi")
    public static int field522 = 0;

    @ObfuscatedName("client.gy")
    public static int field579 = 0;

    @ObfuscatedName("client.gw")
    public static int field553 = 0;

    @ObfuscatedName("client.gu")
    public static int field581 = 0;

    @ObfuscatedName("client.gv")
    public static int field582 = 0;

    @ObfuscatedName("client.gx")
    public static int field591 = 0;

    @ObfuscatedName("client.gf")
    public static boolean field584 = false;

    @ObfuscatedName("client.gc")
    public static int field730 = 0;

    @ObfuscatedName("client.gk")
    public static int field586 = 0;

    @ObfuscatedName("client.ga")
    public static class3[] field587 = new class3[2048];

    @ObfuscatedName("client.gr")
    public static int field588 = 0;

    @ObfuscatedName("client.go")
    public static int[] field589 = new int[2048];

    @ObfuscatedName("client.gq")
    public static int field590 = 0;

    @ObfuscatedName("client.gh")
    public static int[] field725 = new int[2048];

    @ObfuscatedName("client.gd")
    public static class127[] field592 = new class127[2048];

    @ObfuscatedName("client.hv")
    public static int field593 = -1;

    @ObfuscatedName("client.hh")
    public static int field594 = 0;

    @ObfuscatedName("client.hw")
    public static int field595 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field612 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field710 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hn")
    public static String[] field598 = new String[8];

    @ObfuscatedName("client.hd")
    public static boolean[] field599 = new boolean[8];

    @ObfuscatedName("client.hg")
    public static int[] field567 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hb")
    public static class177[][][] field715 = new class177[4][104][104];

    @ObfuscatedName("client.he")
    public static class177 field602 = new class177();

    @ObfuscatedName("client.hq")
    public static class177 field585 = new class177();

    @ObfuscatedName("client.hc")
    public static class177 field648 = new class177();

    @ObfuscatedName("client.ha")
    public static int[] field600 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field606 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field607 = new int[25];

    @ObfuscatedName("client.hi")
    public static int field608 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field609 = false;

    @ObfuscatedName("client.hj")
    public static int field610 = 0;

    @ObfuscatedName("client.iu")
    public static int[] field562 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field622 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field613 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field614 = new int[500];

    @ObfuscatedName("client.if")
    public static String[] field713 = new String[500];

    @ObfuscatedName("client.ie")
    public static String[] field493 = new String[500];

    @ObfuscatedName("client.ib")
    public static int field707 = -1;

    @ObfuscatedName("client.iy")
    public static int field669 = -1;

    @ObfuscatedName("client.ih")
    public static int field619 = 0;

    @ObfuscatedName("client.ig")
    public static int field620 = 50;

    @ObfuscatedName("client.is")
    public static int field621 = 0;

    @ObfuscatedName("client.it")
    public static String field580 = null;

    @ObfuscatedName("client.ip")
    public static boolean field605 = false;

    @ObfuscatedName("client.ix")
    public static int field624 = -1;

    @ObfuscatedName("client.ij")
    public static String field714 = null;

    @ObfuscatedName("client.ia")
    public static String field626 = null;

    @ObfuscatedName("client.ii")
    public static int field627 = -1;

    @ObfuscatedName("client.iv")
    public static class175 field628 = new class175(8);

    @ObfuscatedName("client.il")
    public static int field632 = 0;

    @ObfuscatedName("client.jn")
    public static int field630 = 0;

    @ObfuscatedName("client.jy")
    public static class159 field623 = null;

    @ObfuscatedName("client.jm")
    public static int field727 = 0;

    @ObfuscatedName("client.jz")
    public static int field548 = 0;

    @ObfuscatedName("client.js")
    public static int field573 = 0;

    @ObfuscatedName("client.ja")
    public static boolean field485 = false;

    @ObfuscatedName("client.jf")
    public static boolean field552 = false;

    @ObfuscatedName("client.jk")
    public static boolean field637 = false;

    @ObfuscatedName("client.jb")
    public static class159 field638 = null;

    @ObfuscatedName("client.jp")
    public static class159 field508 = null;

    @ObfuscatedName("client.jo")
    public static int field640 = 0;

    @ObfuscatedName("client.je")
    public static int field641 = 0;

    @ObfuscatedName("client.jq")
    public static class159 field642 = null;

    @ObfuscatedName("client.jv")
    public static boolean field643 = false;

    @ObfuscatedName("client.ju")
    public static int field644 = -1;

    @ObfuscatedName("client.ji")
    public static int field645 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field646 = false;

    @ObfuscatedName("client.jw")
    public static int field647 = -1;

    @ObfuscatedName("client.jc")
    public static int field550 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field500 = false;

    @ObfuscatedName("client.jl")
    public static int field650 = 1;

    @ObfuscatedName("client.kg")
    public static int[] field651 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field625 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field529 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field564 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field655 = new int[32];

    @ObfuscatedName("client.km")
    public static int field656 = 0;

    @ObfuscatedName("client.ku")
    public static int field657 = 0;

    @ObfuscatedName("client.kp")
    public static int field658 = 0;

    @ObfuscatedName("client.kd")
    public static int field659 = 0;

    @ObfuscatedName("client.kk")
    public static int field617 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field551 = new int[2000];

    @ObfuscatedName("client.kq")
    public static String[] field662 = new String[1000];

    @ObfuscatedName("client.kc")
    public static int field559 = 0;

    @ObfuscatedName("client.ka")
    public static class177 field571 = new class177();

    @ObfuscatedName("client.kw")
    public static class177 field665 = new class177();

    @ObfuscatedName("client.kh")
    public static class177 field666 = new class177();

    @ObfuscatedName("client.ky")
    public static class175 field480 = new class175(512);

    @ObfuscatedName("client.kx")
    public static int field489 = 0;

    @ObfuscatedName("client.kt")
    public static int field634 = -2;

    @ObfuscatedName("client.kr")
    public static boolean[] field663 = new boolean[100];

    @ObfuscatedName("client.ks")
    public static boolean[] field671 = new boolean[100];

    @ObfuscatedName("client.kj")
    public static boolean[] field465 = new boolean[100];

    @ObfuscatedName("client.ko")
    public static int[] field673 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field674 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field604 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field528 = new int[100];

    @ObfuscatedName("client.lt")
    public static int field677 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field678 = new int[100];

    @ObfuscatedName("client.lm")
    public static String[] field675 = new String[100];

    @ObfuscatedName("client.lc")
    public static String[] field482 = new String[100];

    @ObfuscatedName("client.ly")
    public static String[] field681 = new String[100];

    @ObfuscatedName("client.lw")
    public static int field682 = 0;

    @ObfuscatedName("client.la")
    public static int[] field683 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lp")
    public static int field684 = 0;

    @ObfuscatedName("client.le")
    public static int field685 = 0;

    @ObfuscatedName("client.ls")
    public static long[] field611 = new long[100];

    @ObfuscatedName("client.lo")
    public static int field687 = 0;

    @ObfuscatedName("client.lv")
    public static int field596 = 0;

    @ObfuscatedName("client.li")
    public static int[] field689 = new int[128];

    @ObfuscatedName("client.lz")
    public static int[] field690 = new int[128];

    @ObfuscatedName("client.lx")
    public static long field691 = -1L;

    @ObfuscatedName("client.ld")
    public static String field692 = null;

    @ObfuscatedName("client.lu")
    public static String field468 = null;

    @ObfuscatedName("client.mf")
    public static int field694 = -1;

    @ObfuscatedName("client.mk")
    public static int field695 = 0;

    @ObfuscatedName("client.ml")
    public static int[] field696 = new int[1000];

    @ObfuscatedName("client.ms")
    public static int[] field697 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class86[] field698 = new class86[1000];

    @ObfuscatedName("client.mq")
    public static int field699 = 0;

    @ObfuscatedName("client.mi")
    public static int field700 = 0;

    @ObfuscatedName("client.mp")
    public static int field701 = 0;

    @ObfuscatedName("client.mw")
    public static int field702 = 255;

    @ObfuscatedName("client.mr")
    public static int field703 = -1;

    @ObfuscatedName("client.mo")
    public static boolean field704 = false;

    @ObfuscatedName("client.me")
    public static int field705 = 127;

    @ObfuscatedName("client.mz")
    public static int field706 = 127;

    @ObfuscatedName("client.ng")
    public static int field576 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field708 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field709 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field639 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nv")
    public static class57[] field712 = new class57[50];

    @ObfuscatedName("client.nu")
    public static boolean field532 = false;

    @ObfuscatedName("client.nk")
    public static boolean[] field601 = new boolean[5];

    @ObfuscatedName("client.no")
    public static int[] field507 = new int[5];

    @ObfuscatedName("client.na")
    public static int[] field633 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field717 = new int[5];

    @ObfuscatedName("client.nz")
    public static int[] field718 = new int[5];

    @ObfuscatedName("client.nf")
    public static int field719 = 0;

    @ObfuscatedName("client.nd")
    public static int field654 = 0;

    @ObfuscatedName("client.oy")
    public static class23[] field721 = new class23[400];

    @ObfuscatedName("client.oj")
    public static class173 field722 = new class173();

    @ObfuscatedName("client.oo")
    public static int field533 = 0;

    @ObfuscatedName("client.oc")
    public static class11[] field724 = new class11[400];

    @ObfuscatedName("client.ow")
    public static class164 field729 = new class164();

    @ObfuscatedName("client.oq")
    public static int field726 = -1;

    @ObfuscatedName("client.om")
    public static int field469 = -1;

    @ObfuscatedName("client.h(I)V")
    public final void method256() {
    }

    public final void init() {
        if (!this.method1454()) {
            return;
        }
        class167[] var1 = class167.method75();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2775);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2775)) {
                    case 1:
                        field635 = Integer.parseInt(var4);
                    case 2:
                    default:
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field28)) {
                            field636 = true;
                        } else {
                            field636 = false;
                        }
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 5:
                        Statics.field503 = class133.method584(Integer.parseInt(var4));
                        break;
                    case 6:
                        Statics.field473 = var4;
                        break;
                    case 7:
                        Statics.field660 = (class134) class113.method152(class134.method1395(), Integer.parseInt(var4));
                        if (Statics.field660 == class134.field2097) {
                            Statics.field513 = class186.field2851;
                        } else {
                            Statics.field513 = class186.field2855;
                        }
                        break;
                    case 8:
                        field472 = Integer.parseInt(var4);
                        break;
                    case 9:
                        field467 = Integer.parseInt(var4);
                }
            }
        }
        method905();
        Statics.field1267 = this.getCodeBase().getHost();
        String var5 = Statics.field503.field2078;
        byte var6 = 0;
        try {
            class82.method916("oldschool", var5, var6, 16);
        } catch (Exception var8) {
            class80.method838((String) null, var8);
        }
        Statics.field680 = this;
        this.method1452(765, 503, 35);
    }

    @ObfuscatedName("ay.j(I)V")
    public static final void method905() {
        class95.field1597 = false;
        field471 = false;
    }

    @ObfuscatedName("client.l(B)V")
    public final void method259() {
        Statics.field1792 = field467 == 0 ? 43594 : field635 + 40000;
        Statics.field300 = field467 == 0 ? 443 : field635 + 50000;
        Statics.field1816 = Statics.field1792;
        Statics.field2740 = class162.field2718;
        Statics.field2732 = class162.field2716;
        Statics.field374 = class162.field2717;
        Statics.field2735 = class162.field2722;
        if (Statics.field1347.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1367[44] = 71;
            class75.field1367[45] = 26;
            class75.field1367[46] = 72;
            class75.field1367[47] = 73;
            class75.field1367[59] = 57;
            class75.field1367[61] = 27;
            class75.field1367[91] = 42;
            class75.field1367[92] = 74;
            class75.field1367[93] = 43;
            class75.field1367[192] = 28;
            class75.field1367[222] = 58;
            class75.field1367[520] = 59;
        } else {
            class75.field1367[186] = 57;
            class75.field1367[187] = 27;
            class75.field1367[188] = 71;
            class75.field1367[189] = 26;
            class75.field1367[190] = 72;
            class75.field1367[191] = 73;
            class75.field1367[192] = 58;
            class75.field1367[219] = 42;
            class75.field1367[220] = 74;
            class75.field1367[221] = 43;
            class75.field1367[222] = 59;
            class75.field1367[223] = 28;
        }
        Statics.method1401(Statics.field351);
        class77.method819(Statics.field351);
        class78 var1;
        try {
            var1 = new class78();
        } catch (Throwable var3) {
            var1 = null;
        }
        Statics.field1838 = var1;
        if (Statics.field1838 != null) {
            Statics.field1838.method1380(Statics.field351);
        }
        Statics.field282 = new class71(255, class82.field1430, class82.field1439, 500000);
        Statics.field29 = class12.method223();
        if (field467 != 0) {
            field483 = true;
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method260() {
        field476++;
        this.method314();
        while (true) {
            class177 var1 = class158.field2579;
            class157 var2;
            synchronized (class158.field2579) {
                var2 = (class157) class158.field2576.method3328();
            }
            if (var2 == null) {
                class139.method2348();
                method2251();
                class75.method159();
                class77.method899();
                if (Statics.field1838 != null) {
                    int var4 = Statics.field1838.method1388();
                    field559 = var4;
                }
                if (field474 == 0) {
                    method1660();
                    class73.method713();
                } else if (field474 == 5) {
                    class21.method797(this);
                    method1660();
                    class73.method713();
                } else if (field474 == 10) {
                    class21.method797(this);
                } else if (field474 == 20) {
                    class21.method797(this);
                    method144();
                } else if (field474 == 25) {
                    Statics.method1661(false);
                    field504 = 0;
                    boolean var5 = true;
                    for (int var6 = 0; var6 < Statics.field199.length; var6++) {
                        if (Statics.field229[var6] != -1 && Statics.field199[var6] == null) {
                            Statics.field199[var6] = Statics.field2415.method3048(Statics.field229[var6], 0);
                            if (Statics.field199[var6] == null) {
                                var5 = false;
                                field504++;
                            }
                        }
                        if (Statics.field1453[var6] != -1 && Statics.field206[var6] == null) {
                            Statics.field206[var6] = Statics.field2415.method3049(Statics.field1453[var6], 0, Statics.field357[var6]);
                            if (Statics.field206[var6] == null) {
                                var5 = false;
                                field504++;
                            }
                        }
                    }
                    if (var5) {
                        field524 = 0;
                        boolean var7 = true;
                        for (int var8 = 0; var8 < Statics.field199.length; var8++) {
                            byte[] var9 = Statics.field206[var8];
                            if (var9 != null) {
                                int var10 = (Statics.field2372[var8] >> 8) * 64 - Statics.field1646;
                                int var11 = (Statics.field2372[var8] & 0xFF) * 64 - Statics.field1269;
                                if (field679) {
                                    var10 = 10;
                                    var11 = 10;
                                }
                                boolean var13 = true;
                                class127 var14 = new class127(var9);
                                int var15 = -1;
                                label475: while (true) {
                                    int var16 = var14.method2507();
                                    if (var16 == 0) {
                                        var7 &= var13;
                                        break;
                                    }
                                    var15 += var16;
                                    int var17 = 0;
                                    boolean var18 = false;
                                    while (true) {
                                        while (!var18) {
                                            int var20 = var14.method2507();
                                            if (var20 == 0) {
                                                continue label475;
                                            }
                                            var17 += var20 - 1;
                                            int var21 = var17 & 0x3F;
                                            int var22 = var17 >> 6 & 0x3F;
                                            int var23 = var14.method2494() >> 2;
                                            int var24 = var10 + var22;
                                            int var25 = var11 + var21;
                                            if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                                                class32 var26 = class32.method2811(var15);
                                                if (var23 != 22 || !field471 || var26.field851 != 0 || var26.field824 == 1 || var26.field812) {
                                                    if (!var26.method661()) {
                                                        field524++;
                                                        var13 = false;
                                                    }
                                                    var18 = true;
                                                }
                                            }
                                        }
                                        int var19 = var14.method2507();
                                        if (var19 == 0) {
                                            break;
                                        }
                                        var14.method2494();
                                    }
                                }
                            }
                        }
                        if (var7) {
                            if (field526 != 0) {
                                method2250(class135.field2105 + class2.field23 + class2.field26 + 100 + "%" + class2.field20, true);
                            }
                            method2251();
                            method226();
                            method2251();
                            Statics.field802.method2026();
                            method2251();
                            System.gc();
                            for (int var28 = 0; var28 < 4; var28++) {
                                field475[var28].method2748();
                            }
                            for (int var29 = 0; var29 < 4; var29++) {
                                for (int var30 = 0; var30 < 104; var30++) {
                                    for (int var31 = 0; var31 < 104; var31++) {
                                        class9.field141[var29][var30][var31] = 0;
                                    }
                                }
                            }
                            method2251();
                            class9.field120 = 99;
                            Statics.field121 = new byte[4][104][104];
                            Statics.field739 = new byte[4][104][104];
                            Statics.field277 = new byte[4][104][104];
                            Statics.field122 = new byte[4][104][104];
                            Statics.field2026 = new int[4][105][105];
                            Statics.field123 = new byte[4][105][105];
                            Statics.field124 = new int[105][105];
                            Statics.field276 = new int[104];
                            Statics.field125 = new int[104];
                            Statics.field1178 = new int[104];
                            Statics.field139 = new int[104];
                            Statics.field130 = new int[104];
                            int var32 = Statics.field199.length;
                            for (class7 var33 = (class7) class7.field105.method3325(); var33 != null; var33 = (class7) class7.field105.method3333()) {
                                if (var33.field93 != null) {
                                    Statics.field106.method1122(var33.field93);
                                    var33.field93 = null;
                                }
                                if (var33.field90 != null) {
                                    Statics.field106.method1122(var33.field90);
                                    var33.field90 = null;
                                }
                            }
                            class7.field105.method3324();
                            Statics.method1661(true);
                            if (!field679) {
                                for (int var34 = 0; var34 < var32; var34++) {
                                    int var35 = (Statics.field2372[var34] >> 8) * 64 - Statics.field1646;
                                    int var36 = (Statics.field2372[var34] & 0xFF) * 64 - Statics.field1269;
                                    byte[] var37 = Statics.field199[var34];
                                    if (var37 != null) {
                                        method2251();
                                        class9.method9(var37, var35, var36, Statics.field1523 * 8 - 48, Statics.field269 * 8 - 48, field475);
                                    }
                                }
                                for (int var38 = 0; var38 < var32; var38++) {
                                    int var39 = (Statics.field2372[var38] >> 8) * 64 - Statics.field1646;
                                    int var40 = (Statics.field2372[var38] & 0xFF) * 64 - Statics.field1269;
                                    byte[] var41 = Statics.field199[var38];
                                    if (var41 == null && Statics.field269 < 800) {
                                        method2251();
                                        class9.method235(var39, var40, 64, 64);
                                    }
                                }
                                Statics.method1661(true);
                                for (int var42 = 0; var42 < var32; var42++) {
                                    byte[] var43 = Statics.field206[var42];
                                    if (var43 != null) {
                                        int var44 = (Statics.field2372[var42] >> 8) * 64 - Statics.field1646;
                                        int var45 = (Statics.field2372[var42] & 0xFF) * 64 - Statics.field1269;
                                        method2251();
                                        class9.method2222(var43, var44, var45, Statics.field802, field475);
                                    }
                                }
                            }
                            if (field679) {
                                int var46 = 0;
                                label387: while (true) {
                                    if (var46 >= 4) {
                                        for (int var64 = 0; var64 < 13; var64++) {
                                            for (int var65 = 0; var65 < 13; var65++) {
                                                int var66 = field597[0][var64][var65];
                                                if (var66 == -1) {
                                                    class9.method235(var64 * 8, var65 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        Statics.method1661(true);
                                        int var67 = 0;
                                        while (true) {
                                            if (var67 >= 4) {
                                                break label387;
                                            }
                                            method2251();
                                            for (int var68 = 0; var68 < 13; var68++) {
                                                for (int var69 = 0; var69 < 13; var69++) {
                                                    int var70 = field597[var67][var68][var69];
                                                    if (var70 != -1) {
                                                        int var71 = var70 >> 24 & 0x3;
                                                        int var72 = var70 >> 1 & 0x3;
                                                        int var73 = var70 >> 14 & 0x3FF;
                                                        int var74 = var70 >> 3 & 0x7FF;
                                                        int var75 = (var73 / 8 << 8) + var74 / 8;
                                                        for (int var76 = 0; var76 < Statics.field2372.length; var76++) {
                                                            if (Statics.field2372[var76] == var75 && Statics.field206[var76] != null) {
                                                                class9.method64(Statics.field206[var76], var67, var68 * 8, var69 * 8, var71, (var73 & 0x7) * 8, (var74 & 0x7) * 8, var72, Statics.field802, field475);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var67++;
                                        }
                                    }
                                    method2251();
                                    for (int var47 = 0; var47 < 13; var47++) {
                                        for (int var48 = 0; var48 < 13; var48++) {
                                            boolean var49 = false;
                                            int var50 = field597[var46][var47][var48];
                                            if (var50 != -1) {
                                                int var51 = var50 >> 24 & 0x3;
                                                int var52 = var50 >> 1 & 0x3;
                                                int var53 = var50 >> 14 & 0x3FF;
                                                int var54 = var50 >> 3 & 0x7FF;
                                                int var55 = (var53 / 8 << 8) + var54 / 8;
                                                for (int var56 = 0; var56 < Statics.field2372.length; var56++) {
                                                    if (Statics.field2372[var56] == var55 && Statics.field199[var56] != null) {
                                                        class9.method2472(Statics.field199[var56], var46, var47 * 8, var48 * 8, var51, (var53 & 0x7) * 8, (var54 & 0x7) * 8, var52, field475);
                                                        var49 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var49) {
                                                int var57 = var46;
                                                int var58 = var47 * 8;
                                                int var59 = var48 * 8;
                                                for (int var60 = 0; var60 < 8; var60++) {
                                                    for (int var61 = 0; var61 < 8; var61++) {
                                                        class9.field119[var57][var58 + var60][var59 + var61] = 0;
                                                    }
                                                }
                                                if (var58 > 0) {
                                                    for (int var62 = 1; var62 < 8; var62++) {
                                                        class9.field119[var57][var58][var59 + var62] = class9.field119[var57][var58 - 1][var59 + var62];
                                                    }
                                                }
                                                if (var59 > 0) {
                                                    for (int var63 = 1; var63 < 8; var63++) {
                                                        class9.field119[var57][var58 + var63][var59] = class9.field119[var57][var58 + var63][var59 - 1];
                                                    }
                                                }
                                                if (var58 > 0 && class9.field119[var57][var58 - 1][var59] != 0) {
                                                    class9.field119[var57][var58][var59] = class9.field119[var57][var58 - 1][var59];
                                                } else if (var59 > 0 && class9.field119[var57][var58][var59 - 1] != 0) {
                                                    class9.field119[var57][var58][var59] = class9.field119[var57][var58][var59 - 1];
                                                } else if (var58 > 0 && var59 > 0 && class9.field119[var57][var58 - 1][var59 - 1] != 0) {
                                                    class9.field119[var57][var58][var59] = class9.field119[var57][var58 - 1][var59 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var46++;
                                }
                            }
                            Statics.method1661(true);
                            method226();
                            method2251();
                            class9.method2601(Statics.field802, field475);
                            Statics.method1661(true);
                            int var77 = class9.field120;
                            if (var77 > Statics.field1467) {
                                var77 = Statics.field1467;
                            }
                            if (var77 < Statics.field1467 - 1) {
                                int var78 = Statics.field1467 - 1;
                            }
                            if (field471) {
                                Statics.field802.method1890(class9.field120);
                            } else {
                                Statics.field802.method1890(0);
                            }
                            for (int var79 = 0; var79 < 104; var79++) {
                                for (int var80 = 0; var80 < 104; var80++) {
                                    method914(var79, var80);
                                }
                            }
                            method2251();
                            method2067();
                            class32.field810.method3269();
                            if (Statics.field1298 != null) {
                                field509.method2345(60);
                                field509.method2483(1057001181);
                            }
                            if (!field679) {
                                int var81 = (Statics.field1523 - 6) / 8;
                                int var82 = (Statics.field1523 + 6) / 8;
                                int var83 = (Statics.field269 - 6) / 8;
                                int var84 = (Statics.field269 + 6) / 8;
                                for (int var85 = var81 - 1; var85 <= var82 + 1; var85++) {
                                    for (int var86 = var83 - 1; var86 <= var84 + 1; var86++) {
                                        if (var85 < var81 || var85 > var82 || var86 < var83 || var86 > var84) {
                                            Statics.field2415.method3067("m" + var85 + "_" + var86);
                                            Statics.field2415.method3067("l" + var85 + "_" + var86);
                                        }
                                    }
                                }
                            }
                            method176(30);
                            method2251();
                            class9.method122();
                            field509.method2345(66);
                            class73.method713();
                        } else {
                            field526 = 2;
                        }
                    } else {
                        field526 = 1;
                    }
                }
                if (field474 == 30) {
                    method240();
                } else if (field474 == 40) {
                    method144();
                }
                return;
            }
            var2.field2570.method3138(var2.field2573, (int) var2.field2813, var2.field2568, false);
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method543() {
        boolean var1 = class139.method146();
        if (var1 && field704 && Statics.field2015 != null) {
            Statics.field2015.method1171();
        }
        if (field1339) {
            Canvas var2 = Statics.field351;
            var2.removeKeyListener(class75.field1360);
            var2.removeFocusListener(class75.field1360);
            class75.field1369 = -1;
            class77.method1341(Statics.field351);
            if (Statics.field1838 != null) {
                Statics.field1838.method1381(Statics.field351);
            }
            this.method1453();
            Statics.method1401(Statics.field351);
            class77.method819(Statics.field351);
            if (Statics.field1838 != null) {
                Statics.field1838.method1380(Statics.field351);
            }
        }
        if (field474 == 0) {
            class73.method2774(class21.field301, class21.field315, (Color) null);
        } else if (field474 == 5) {
            Statics.method17(Statics.field1626, Statics.field170);
        } else if (field474 == 10) {
            Statics.method17(Statics.field1626, Statics.field170);
        } else if (field474 == 20) {
            Statics.method17(Statics.field1626, Statics.field170);
        } else if (field474 == 25) {
            if (field526 == 1) {
                if (field504 > field523) {
                    field523 = field504;
                }
                int var3 = (field523 * 50 - field504 * 50) / field523;
                method2250(class135.field2105 + class2.field23 + class2.field26 + var3 + "%" + class2.field20, false);
            } else if (field526 == 2) {
                if (field524 > field525) {
                    field525 = field524;
                }
                int var4 = (field525 * 50 - field524 * 50) / field525 + 50;
                method2250(class135.field2105 + class2.field23 + class2.field26 + var4 + "%" + class2.field20, false);
            } else {
                method2250(class135.field2105, false);
            }
        } else if (field474 == 30) {
            method236();
        } else if (field474 == 40) {
            method2250(class135.field2106 + class2.field23 + class135.field2116, false);
        }
        if (field474 == 30 && field677 == 0 && !field1336) {
            try {
                Graphics var5 = Statics.field351.getGraphics();
                for (int var6 = 0; var6 < field489; var6++) {
                    if (field671[var6]) {
                        Statics.field1469.method1626(var5, field673[var6], field674[var6], field604[var6], field528[var6]);
                        field671[var6] = false;
                    }
                }
            } catch (Exception var12) {
                Statics.field351.repaint();
            }
        } else if (field474 > 0) {
            try {
                Graphics var8 = Statics.field351.getGraphics();
                Statics.field1469.method1625(var8, 0, 0);
                field1336 = false;
                for (int var9 = 0; var9 < field489; var9++) {
                    field671[var9] = false;
                }
            } catch (Exception var11) {
                Statics.field351.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method255() {
        if (Statics.field478 != null) {
            Statics.field478.field243 = false;
        }
        Statics.field478 = null;
        if (Statics.field652 != null) {
            Statics.field652.method1414();
            Statics.field652 = null;
        }
        class75.method1570();
        if (class77.field1390 != null) {
            class77 var1 = class77.field1390;
            synchronized (class77.field1390) {
                class77.field1390 = null;
            }
        }
        Statics.field1838 = null;
        if (Statics.field2015 != null) {
            Statics.field2015.method1195();
        }
        if (Statics.field1758 != null) {
            Statics.field1758.method1195();
        }
        if (Statics.field2713 != null) {
            Statics.field2713.method1414();
        }
        class158.method1400();
        class82.method840();
    }

    @ObfuscatedName("x.q(II)V")
    public static void method176(int arg0) {
        if (field474 == arg0) {
            return;
        }
        if (field474 == 0) {
            Statics.field458 = null;
            Statics.field1019 = null;
            Statics.field925 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field491 = 0;
            field501 = 0;
            field502 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field848 != null) {
            Statics.field848.method1414();
            Statics.field848 = null;
        }
        if (field474 == 25) {
            field526 = 0;
            field504 = 0;
            field523 = 1;
            field524 = 0;
            field525 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method237(Statics.field351, Statics.field273, Statics.field497);
        } else {
            class21.method1707();
        }
        field474 = arg0;
    }

    @ObfuscatedName("client.w(I)V")
    public void method314() {
        if (field474 == 1000) {
            return;
        }
        long var1 = class121.method2();
        int var3 = (int) (var1 - Statics.field2546);
        Statics.field2546 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class154.field2539 += var3;
        boolean var4;
        if (class154.field2543 == 0 && class154.field2533 == 0 && class154.field2536 == 0 && class154.field2538 == 0) {
            var4 = true;
        } else if (Statics.field2713 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class154.field2539 > 30000) {
                        throw new IOException();
                    }
                    while (class154.field2533 < 20 && class154.field2538 > 0) {
                        class156 var5 = (class156) class154.field2530.method3312();
                        class127 var6 = new class127(4);
                        var6.method2657(1);
                        var6.method2482((int) var5.field2813);
                        Statics.field2713.method1408(var6.field2033, 0, 4);
                        class154.field2532.method3310(var5, var5.field2813);
                        class154.field2538--;
                        class154.field2533++;
                    }
                    while (class154.field2543 < 20 && class154.field2536 > 0) {
                        class156 var7 = (class156) class154.field2534.method3281();
                        class127 var8 = new class127(4);
                        var8.method2657(0);
                        var8.method2482((int) var7.field2813);
                        Statics.field2713.method1408(var8.field2033, 0, 4);
                        var7.method3305();
                        class154.field2528.method3310(var7, var7.field2813);
                        class154.field2536--;
                        class154.field2543++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2713.method1406();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class154.field2539 = 0;
                        byte var11 = 0;
                        if (Statics.field1312 == null) {
                            var11 = 8;
                        } else if (class154.field2541 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class154.field2540.field2029;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2713.method1411(class154.field2540.field2033, class154.field2540.field2029, var12);
                            if (class154.field2545 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class154.field2540.field2033[class154.field2540.field2029 + var13] ^= class154.field2545;
                                }
                            }
                            class154.field2540.field2029 += var12;
                            if (class154.field2540.field2029 < var11) {
                                break;
                            }
                            if (Statics.field1312 == null) {
                                class154.field2540.field2029 = 0;
                                int var14 = class154.field2540.method2494();
                                int var15 = class154.field2540.method2496();
                                int var16 = class154.field2540.method2494();
                                int var17 = class154.field2540.method2617();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class154.field2532.method3311(var18);
                                Statics.field2549 = true;
                                if (var20 == null) {
                                    var20 = (class156) class154.field2528.method3311(var18);
                                    Statics.field2549 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1312 = var20;
                                Statics.field2076 = new class127(var17 + var21 + Statics.field1312.field2563);
                                Statics.field2076.method2657(var16);
                                Statics.field2076.method2483(var17);
                                class154.field2541 = 8;
                                class154.field2540.field2029 = 0;
                            } else if (class154.field2541 == 0) {
                                if (class154.field2540.field2033[0] == -1) {
                                    class154.field2541 = 1;
                                    class154.field2540.field2029 = 0;
                                } else {
                                    Statics.field1312 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2076.field2033.length - Statics.field1312.field2563;
                            int var23 = 512 - class154.field2541;
                            if (var23 > var22 - Statics.field2076.field2029) {
                                var23 = var22 - Statics.field2076.field2029;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2713.method1411(Statics.field2076.field2033, Statics.field2076.field2029, var23);
                            if (class154.field2545 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2076.field2033[Statics.field2076.field2029 + var24] ^= class154.field2545;
                                }
                            }
                            Statics.field2076.field2029 += var23;
                            class154.field2541 += var23;
                            if (Statics.field2076.field2029 == var22) {
                                if (Statics.field1312.field2813 == 16711935L) {
                                    Statics.field2544 = Statics.field2076;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class155 var26 = class154.field2531[var25];
                                        if (var26 != null) {
                                            Statics.field2544.field2029 = var25 * 8 + 5;
                                            int var27 = Statics.field2544.method2617();
                                            int var28 = Statics.field2544.method2617();
                                            var26.method3136(var27, var28);
                                        }
                                    }
                                } else {
                                    class154.field2529.reset();
                                    class154.field2529.update(Statics.field2076.field2033, 0, var22);
                                    int var29 = (int) class154.field2529.getValue();
                                    if (Statics.field1312.field2564 != var29) {
                                        try {
                                            Statics.field2713.method1414();
                                        } catch (Exception var35) {
                                        }
                                        class154.field2547++;
                                        Statics.field2713 = null;
                                        class154.field2545 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class154.field2547 = 0;
                                    class154.field2548 = 0;
                                    Statics.field1312.field2562.method3149((int) (Statics.field1312.field2813 & 0xFFFFL), Statics.field2076.field2033, (Statics.field1312.field2813 & 0xFF0000L) == 16711680L, Statics.field2549);
                                }
                                Statics.field1312.method3360();
                                if (Statics.field2549) {
                                    class154.field2533--;
                                } else {
                                    class154.field2543--;
                                }
                                class154.field2541 = 0;
                                Statics.field1312 = null;
                                Statics.field2076 = null;
                            } else {
                                if (class154.field2541 != 512) {
                                    break;
                                }
                                class154.field2541 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2713.method1414();
                } catch (Exception var34) {
                }
                class154.field2548++;
                Statics.field2713 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method264();
        }
    }

    @ObfuscatedName("client.v(I)V")
    public void method264() {
        if (class154.field2547 >= 4) {
            this.method1458("js5crc");
            field474 = 1000;
            return;
        }
        if (class154.field2548 >= 4) {
            if (field474 <= 5) {
                this.method1458("js5io");
                field474 = 1000;
                return;
            }
            field496 = 3000;
            class154.field2548 = 3;
        }
        if (--field496 + 1 > 0) {
            return;
        }
        try {
            if (field495 == 0) {
                Statics.field1018 = Statics.field441.method1516(Statics.field1267, Statics.field1816);
                field495++;
            }
            if (field495 == 1) {
                if (Statics.field1018.field1415 == 2) {
                    this.method265(-1);
                    return;
                }
                if (Statics.field1018.field1415 == 1) {
                    field495++;
                }
            }
            if (field495 == 2) {
                Statics.field1522 = new class70((Socket) Statics.field1018.field1418, Statics.field441);
                class127 var1 = new class127(5);
                var1.method2657(15);
                var1.method2483(35);
                Statics.field1522.method1408(var1.field2033, 0, 5);
                field495++;
                Statics.field57 = class121.method2();
            }
            if (field495 == 3) {
                if (field474 <= 5 || Statics.field1522.method1406() > 0) {
                    int var2 = Statics.field1522.method1405();
                    if (var2 != 0) {
                        this.method265(var2);
                        return;
                    }
                    field495++;
                } else if (class121.method2() - Statics.field57 > 30000L) {
                    this.method265(-2);
                    return;
                }
            }
            if (field495 == 4) {
                class154.method3031(Statics.field1522, field474 > 20);
                Statics.field1018 = null;
                Statics.field1522 = null;
                field495 = 0;
                field499 = 0;
            }
        } catch (IOException var4) {
            this.method265(-3);
        }
    }

    @ObfuscatedName("client.z(II)V")
    public void method265(int arg0) {
        Statics.field1018 = null;
        Statics.field1522 = null;
        field495 = 0;
        if (Statics.field1816 == Statics.field1792) {
            Statics.field1816 = Statics.field300;
        } else {
            Statics.field1816 = Statics.field1792;
        }
        field499++;
        if (field499 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field474 <= 5) {
                this.method1458("js5connect_full");
                field474 = 1000;
            } else {
                field496 = 3000;
            }
        } else if (field499 >= 2 && arg0 == 6) {
            this.method1458("js5connect_outofdate");
            field474 = 1000;
        } else if (field499 >= 4) {
            if (field474 <= 5) {
                this.method1458("js5connect");
                field474 = 1000;
            } else {
                field496 = 3000;
            }
        }
    }

    @ObfuscatedName("ca.m(I)V")
    public static void method1660() {
        if (field494 == 0) {
            Statics.field802 = new class95(4, 104, 104, class9.field119);
            for (int var0 = 0; var0 < 4; var0++) {
                field475[var0] = new class130(104, 104);
            }
            Statics.field2000 = new class86(512, 512);
            class21.field315 = class135.field2108;
            class21.field301 = 5;
            field494 = 20;
        } else if (field494 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1780[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1923(var1, 500, 800, 512, 334);
            class21.field315 = class135.field2174;
            class21.field301 = 10;
            field494 = 30;
        } else if (field494 == 30) {
            Statics.field343 = method716(0, false, true, true);
            Statics.field267 = method716(1, false, true, true);
            Statics.field1370 = method716(2, true, false, true);
            Statics.field1324 = method716(3, false, true, true);
            Statics.field1392 = method716(4, false, true, true);
            Statics.field2415 = method716(5, true, true, true);
            Statics.field244 = method716(6, true, true, false);
            Statics.field280 = method716(7, false, true, true);
            Statics.field497 = method716(8, false, true, true);
            Statics.field204 = method716(9, false, true, true);
            Statics.field273 = method716(10, false, true, true);
            Statics.field394 = method716(11, false, true, true);
            Statics.field761 = method716(12, false, true, true);
            Statics.field2537 = method716(13, true, false, true);
            Statics.field616 = method716(14, false, true, false);
            Statics.field498 = method716(15, false, true, true);
            class21.field315 = class135.field2110;
            class21.field301 = 20;
            field494 = 40;
        } else if (field494 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field343.method3142() * 4 / 100;
            int var8 = var7 + Statics.field267.method3142() * 4 / 100;
            int var9 = var8 + Statics.field1370.method3142() * 2 / 100;
            int var10 = var9 + Statics.field1324.method3142() * 2 / 100;
            int var11 = var10 + Statics.field1392.method3142() * 6 / 100;
            int var12 = var11 + Statics.field2415.method3142() * 4 / 100;
            int var13 = var12 + Statics.field244.method3142() * 2 / 100;
            int var14 = var13 + Statics.field280.method3142() * 60 / 100;
            int var15 = var14 + Statics.field497.method3142() * 2 / 100;
            int var16 = var15 + Statics.field204.method3142() * 2 / 100;
            int var17 = var16 + Statics.field273.method3142() * 2 / 100;
            int var18 = var17 + Statics.field394.method3142() * 2 / 100;
            int var19 = var18 + Statics.field761.method3142() * 2 / 100;
            int var20 = var19 + Statics.field2537.method3142() * 2 / 100;
            int var21 = var20 + Statics.field616.method3142() * 2 / 100;
            int var22 = var21 + Statics.field498.method3142() * 2 / 100;
            if (var22 == 100) {
                class21.field315 = class135.field2112;
                class21.field301 = 30;
                field494 = 45;
            } else {
                if (var22 != 0) {
                    class21.field315 = class135.field2211 + var22 + "%";
                }
                class21.field301 = 30;
            }
        } else if (field494 == 45) {
            class52.method2524(22050, !field471, 2);
            class142 var23 = new class142();
            var23.method2820(9, 128);
            Statics.field2015 = class52.method1882(Statics.field441, Statics.field351, 0, 22050);
            Statics.field2015.method1172(var23);
            class155 var24 = Statics.field498;
            class155 var25 = Statics.field616;
            class155 var26 = Statics.field1392;
            Statics.field2351 = var24;
            Statics.field2360 = var25;
            Statics.field2358 = var26;
            Statics.field2815 = var23;
            Statics.field1758 = class52.method1882(Statics.field441, Statics.field351, 1, 2048);
            Statics.field106 = new class46();
            Statics.field1758.method1172(Statics.field106);
            Statics.field914 = new class62(22050, Statics.field2457);
            class21.field315 = class135.field2104;
            class21.field301 = 35;
            field494 = 50;
        } else if (field494 == 50) {
            int var27 = 0;
            if (Statics.field170 == null) {
                Statics.field170 = class84.method32(Statics.field497, Statics.field2537, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field1281 == null) {
                Statics.field1281 = class84.method32(Statics.field497, Statics.field2537, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field1626 == null) {
                Statics.field1626 = class84.method32(Statics.field497, Statics.field2537, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field315 = class135.field2138 + var27 * 100 / 3 + "%";
                class21.field301 = 40;
            } else {
                Statics.field14 = new class152(true);
                class21.field315 = class135.field2115;
                class21.field301 = 40;
                field494 = 60;
            }
        } else if (field494 == 60) {
            int var28 = class21.method621(Statics.field273, Statics.field497);
            int var29 = class21.method143();
            if (var28 < var29) {
                class21.field315 = class135.field2151 + var28 * 100 / var29 + "%";
                class21.field301 = 50;
            } else {
                class21.field315 = class135.field2117;
                class21.field301 = 50;
                method176(5);
                field494 = 70;
            }
        } else if (field494 == 70) {
            if (Statics.field1370.method3113()) {
                class37.method62(Statics.field1370);
                class155 var30 = Statics.field1370;
                Statics.field867 = var30;
                class155 var31 = Statics.field1370;
                class155 var32 = Statics.field280;
                Statics.field921 = var31;
                Statics.field912 = var32;
                Statics.field926 = Statics.field921.method3058(3);
                class155 var33 = Statics.field1370;
                class155 var34 = Statics.field280;
                boolean var35 = field471;
                Statics.field831 = var33;
                Statics.field808 = var34;
                class32.field833 = var35;
                class155 var36 = Statics.field1370;
                class155 var37 = Statics.field280;
                Statics.field791 = var36;
                Statics.field767 = var37;
                class155 var38 = Statics.field1370;
                class155 var39 = Statics.field280;
                boolean var40 = field636;
                class183 var41 = Statics.field170;
                Statics.field970 = var38;
                Statics.field989 = var39;
                Statics.field1012 = var40;
                Statics.field970.method3058(10);
                Statics.field1165 = var41;
                class34.method581(Statics.field1370, Statics.field343, Statics.field267);
                class155 var42 = Statics.field1370;
                class155 var43 = Statics.field280;
                Statics.field2728 = var42;
                Statics.field899 = var43;
                class155 var44 = Statics.field1370;
                Statics.field949 = var44;
                class155 var45 = Statics.field1370;
                Statics.field1024 = var45;
                Statics.field1023 = Statics.field1024.method3058(16);
                class155 var46 = Statics.field1324;
                class155 var47 = Statics.field280;
                class155 var48 = Statics.field497;
                class155 var49 = Statics.field2537;
                Statics.field2583 = var46;
                Statics.field2590 = var47;
                Statics.field270 = var48;
                Statics.field2471 = var49;
                Statics.field2641 = new class159[Statics.field2583.method3059()][];
                Statics.field2470 = new boolean[Statics.field2583.method3059()];
                class155 var50 = Statics.field1370;
                Statics.field1021 = var50;
                class155 var51 = Statics.field1370;
                Statics.field961 = var51;
                class21.field315 = class135.field2099;
                class21.field301 = 60;
                field494 = 80;
            } else {
                class21.field315 = class135.field2194 + Statics.field1370.method3140() + "%";
                class21.field301 = 60;
            }
        } else if (field494 == 80) {
            int var52 = 0;
            if (Statics.field2083 == null) {
                Statics.field2083 = class84.method2919(Statics.field497, "compass", "");
            } else {
                var52++;
            }
            if (Statics.field113 == null) {
                Statics.field113 = class84.method2919(Statics.field497, "mapedge", "");
            } else {
                var52++;
            }
            if (Statics.field716 == null) {
                Statics.field716 = class84.method1513(Statics.field497, "mapscene", "");
            } else {
                var52++;
            }
            if (Statics.field1393 == null) {
                Statics.field1393 = class84.method693(Statics.field497, "mapfunction", "");
            } else {
                var52++;
            }
            if (Statics.field459 == null) {
                Statics.field459 = class84.method693(Statics.field497, "hitmarks", "");
            } else {
                var52++;
            }
            if (Statics.field109 == null) {
                Statics.field109 = class84.method693(Statics.field497, "headicons_pk", "");
            } else {
                var52++;
            }
            if (Statics.field179 == null) {
                Statics.field179 = class84.method693(Statics.field497, "headicons_prayer", "");
            } else {
                var52++;
            }
            if (Statics.field5 == null) {
                Statics.field5 = class84.method693(Statics.field497, "headicons_hint", "");
            } else {
                var52++;
            }
            if (Statics.field1317 == null) {
                Statics.field1317 = class84.method693(Statics.field497, "mapmarker", "");
            } else {
                var52++;
            }
            if (Statics.field1823 == null) {
                Statics.field1823 = class84.method693(Statics.field497, "cross", "");
            } else {
                var52++;
            }
            if (Statics.field116 == null) {
                Statics.field116 = class84.method693(Statics.field497, "mapdots", "");
            } else {
                var52++;
            }
            if (Statics.field1451 == null) {
                Statics.field1451 = class84.method1513(Statics.field497, "scrollbar", "");
            } else {
                var52++;
            }
            if (Statics.field1199 == null) {
                Statics.field1199 = class84.method1513(Statics.field497, "mod_icons", "");
            } else {
                var52++;
            }
            if (Statics.field9 == null) {
                Statics.field9 = class84.method619(Statics.field497, "mapback", "");
            } else {
                var52++;
            }
            if (var52 < 14) {
                class21.field315 = class135.field2120 + var52 * 100 / 14 + "%";
                class21.field301 = 70;
            } else {
                Statics.field2826 = Statics.field1199;
                Statics.field113.method1712();
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 41.0D) - 20;
                for (int var57 = 0; var57 < Statics.field1393.length; var57++) {
                    Statics.field1393[var57].method1711(var53 + var56, var54 + var56, var55 + var56);
                }
                Statics.field716[0].method1794(var53 + var56, var54 + var56, var55 + var56);
                Statics.field1672 = new int[33];
                Statics.field1229 = new int[33];
                Statics.field1753 = new int[151];
                Statics.field1442 = new int[151];
                for (int var58 = 0; var58 < 33; var58++) {
                    int var59 = 999;
                    int var60 = 0;
                    for (int var61 = 0; var61 < 34; var61++) {
                        if (Statics.field9.field1491[Statics.field9.field1489 * var58 + var61] == 0) {
                            if (var59 == 999) {
                                var59 = var61;
                            }
                        } else if (var59 != 999) {
                            var60 = var61;
                            break;
                        }
                    }
                    Statics.field1672[var58] = var59;
                    Statics.field1229[var58] = var60 - var59;
                }
                for (int var62 = 5; var62 < 156; var62++) {
                    int var63 = 999;
                    int var64 = 0;
                    for (int var65 = 25; var65 < 172; var65++) {
                        if (Statics.field9.field1491[Statics.field9.field1489 * var62 + var65] == 0 && var65 > 34 || var62 > 34) {
                            if (var63 == 999) {
                                var63 = var65;
                            }
                        } else if (var63 != 999) {
                            var64 = var65;
                            break;
                        }
                    }
                    Statics.field1753[var62 - 5] = var63 - 25;
                    Statics.field1442[var62 - 5] = var64 - var63;
                }
                class21.field315 = class135.field2121;
                class21.field301 = 70;
                field494 = 90;
            }
        } else if (field494 == 90) {
            if (Statics.field204.method3113()) {
                class110 var66 = new class110(Statics.field204, Statics.field497, 20, 0.8D, field471 ? 64 : 128);
                class104.method2158(var66);
                class104.method2159(0.8D);
                class21.field315 = class135.field2227;
                class21.field301 = 90;
                field494 = 110;
            } else {
                class21.field315 = class135.field2122 + Statics.field204.method3140() + "%";
                class21.field301 = 90;
            }
        } else if (field494 == 110) {
            Statics.field478 = new class16();
            Statics.field441.method1517(Statics.field478, 10);
            class21.field315 = class135.field2299;
            class21.field301 = 94;
            field494 = 120;
        } else if (field494 == 120) {
            if (Statics.field273.method3066("huffman", "")) {
                class120 var67 = new class120(Statics.field273.method3065("huffman", ""));
                class184.method2911(var67);
                class21.field315 = class135.field2126;
                class21.field301 = 96;
                field494 = 130;
            } else {
                class21.field315 = class135.field2304 + "%";
                class21.field301 = 96;
            }
        } else if (field494 == 130) {
            if (!Statics.field1324.method3113()) {
                class21.field315 = class135.field2298 + Statics.field1324.method3140() * 4 / 5 + "%";
                class21.field301 = 100;
            } else if (!Statics.field761.method3113()) {
                class21.field315 = class135.field2298 + (80 + Statics.field761.method3140() / 6) + "%";
                class21.field301 = 100;
            } else if (Statics.field2537.method3113()) {
                class21.field315 = class135.field2128;
                class21.field301 = 100;
                field494 = 140;
            } else {
                class21.field315 = class135.field2298 + (96 + Statics.field2537.method3140() / 20) + "%";
                class21.field301 = 100;
            }
        } else if (field494 == 140) {
            method176(10);
        }
    }

    @ObfuscatedName("aa.r(IZZZI)Lep;")
    public static class155 method716(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1430 != null) {
            var4 = new class71(arg0, class82.field1430, Statics.field279[arg0], 1000000);
        }
        return new class155(var4, Statics.field282, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("v.u(S)V")
    public static final void method144() {
        try {
            if (field491 == 0) {
                if (Statics.field652 != null) {
                    Statics.field652.method1414();
                    Statics.field652 = null;
                }
                Statics.field391 = null;
                field520 = false;
                field501 = 0;
                field491 = 1;
            }
            if (field491 == 1) {
                if (Statics.field391 == null) {
                    Statics.field391 = Statics.field441.method1516(Statics.field1267, Statics.field1816);
                }
                if (Statics.field391.field1415 == 2) {
                    throw new IOException();
                }
                if (Statics.field391.field1415 == 1) {
                    Statics.field652 = new class70((Socket) Statics.field391.field1418, Statics.field441);
                    Statics.field391 = null;
                    field491 = 2;
                }
            }
            if (field491 == 2) {
                field509.field2029 = 0;
                field509.method2657(14);
                Statics.field652.method1408(field509.field2033, 0, 1);
                field487.field2029 = 0;
                field491 = 3;
            }
            if (field491 == 3) {
                if (Statics.field2015 != null) {
                    Statics.field2015.method1170();
                }
                if (Statics.field1758 != null) {
                    Statics.field1758.method1170();
                }
                int var0 = Statics.field652.method1405();
                if (Statics.field2015 != null) {
                    Statics.field2015.method1170();
                }
                if (Statics.field1758 != null) {
                    Statics.field1758.method1170();
                }
                if (var0 != 0) {
                    method821(var0);
                    return;
                }
                field487.field2029 = 0;
                field491 = 5;
            }
            if (field491 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field509.field2029 = 0;
                field509.method2657(10);
                field509.method2483(var1[0]);
                field509.method2483(var1[1]);
                field509.method2483(var1[2]);
                field509.method2483(var1[3]);
                field509.method2552(0L);
                field509.method2485(class21.field306);
                field509.method2568(class6.field78, class6.field84);
                field510.field2029 = 0;
                if (field474 == 40) {
                    field510.method2657(18);
                } else {
                    field510.method2657(16);
                }
                field510.method2481(0);
                int var2 = field510.field2029;
                field510.method2483(35);
                field510.method2488(field509.field2033, 0, field509.field2029);
                int var3 = field510.field2029;
                field510.method2485(class21.field329);
                field510.method2657(field471 ? 1 : 0);
                class116 var4 = field510;
                byte[] var5 = new byte[24];
                try {
                    class82.field1434.method587(0L);
                    class82.field1434.method585(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var34) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2488(var5, 0, 24);
                class127 var9 = new class127(Statics.field14.method3034());
                Statics.field14.method3044(var9);
                field510.method2488(var9.field2033, 0, var9.field2033.length);
                field510.method2483(Statics.field343.field2515);
                field510.method2483(Statics.field267.field2515);
                field510.method2483(Statics.field1370.field2515);
                field510.method2483(Statics.field1324.field2515);
                field510.method2483(Statics.field1392.field2515);
                field510.method2483(Statics.field2415.field2515);
                field510.method2483(Statics.field244.field2515);
                field510.method2483(Statics.field280.field2515);
                field510.method2483(Statics.field497.field2515);
                field510.method2483(Statics.field204.field2515);
                field510.method2483(Statics.field273.field2515);
                field510.method2483(Statics.field394.field2515);
                field510.method2483(Statics.field761.field2515);
                field510.method2483(Statics.field2537.field2515);
                field510.method2483(Statics.field616.field2515);
                field510.method2483(Statics.field498.field2515);
                field510.method2591(var1, var3, field510.field2029);
                field510.method2490(field510.field2029 - var2);
                Statics.field652.method1408(field510.field2033, 0, field510.field2029);
                field509.method2357(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field487.method2357(var1);
                field491 = 6;
            }
            if (field491 == 6 && Statics.field652.method1406() > 0) {
                int var11 = Statics.field652.method1405();
                if (var11 == 21 && field474 == 20) {
                    field491 = 7;
                } else if (var11 == 2) {
                    field491 = 9;
                } else if (var11 == 15 && field474 == 40) {
                    method58();
                    return;
                } else if (var11 == 23 && field502 < 1) {
                    field502++;
                    field491 = 0;
                } else {
                    method821(var11);
                    return;
                }
            }
            if (field491 == 7 && Statics.field652.method1406() > 0) {
                field527 = (Statics.field652.method1405() + 3) * 60;
                field491 = 8;
            }
            if (field491 == 8) {
                field501 = 0;
                class21.method228(class135.field2231, class135.field2130, field527 / 60 + class135.field2131);
                if (--field527 <= 0) {
                    field491 = 0;
                }
            } else {
                if (field491 == 9 && Statics.field652.method1406() >= 8) {
                    field573 = Statics.field652.method1405();
                    field485 = Statics.field652.method1405() == 1;
                    field593 = Statics.field652.method1405();
                    field593 <<= 0x8;
                    field593 += Statics.field652.method1405();
                    field594 = Statics.field652.method1405();
                    Statics.field652.method1411(field487.field2033, 0, 1);
                    field487.field2029 = 0;
                    field466 = field487.method2343();
                    Statics.field652.method1411(field487.field2033, 0, 2);
                    field487.field2029 = 0;
                    field512 = field487.method2496();
                    if (field594 == 1) {
                        try {
                            client var12 = Statics.field680;
                            JSObject.getWindow(var12).call("zap", (Object[]) null);
                        } catch (Throwable var33) {
                        }
                    } else {
                        try {
                            client var14 = Statics.field680;
                            JSObject.getWindow(var14).call("unzap", (Object[]) null);
                        } catch (Throwable var32) {
                        }
                    }
                    field491 = 10;
                }
                if (field491 != 10) {
                    field501++;
                    if (field501 > 2000) {
                        if (field502 < 1) {
                            if (Statics.field1816 == Statics.field1792) {
                                Statics.field1816 = Statics.field300;
                            } else {
                                Statics.field1816 = Statics.field1792;
                            }
                            field502++;
                            field491 = 0;
                        } else {
                            method821(-3);
                        }
                    }
                } else if (Statics.field652.method1406() >= field512) {
                    field487.field2029 = 0;
                    Statics.field652.method1411(field487.field2033, 0, field512);
                    field578 = 1L;
                    field629 = -1;
                    Statics.field478.field240 = 0;
                    Statics.field114 = true;
                    field653 = true;
                    field691 = -1L;
                    class182.method2253();
                    field509.field2029 = 0;
                    field487.field2029 = 0;
                    field466 = -1;
                    field517 = -1;
                    field518 = -1;
                    field519 = -1;
                    field514 = 0;
                    field484 = 0;
                    field516 = 0;
                    field545 = 0;
                    field610 = 0;
                    field609 = false;
                    class77.field1391 = 0;
                    for (int var16 = 0; var16 < 100; var16++) {
                        field681[var16] = null;
                    }
                    field682 = 0;
                    field621 = 0;
                    field605 = false;
                    field576 = 0;
                    field531 = (int) (Math.random() * 100.0D) - 50;
                    field686 = (int) (Math.random() * 110.0D) - 55;
                    field535 = (int) (Math.random() * 80.0D) - 40;
                    field538 = (int) (Math.random() * 120.0D) - 60;
                    field540 = (int) (Math.random() * 30.0D) - 20;
                    field720 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field701 = 0;
                    field694 = -1;
                    field699 = 0;
                    field700 = 0;
                    field588 = 0;
                    field506 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field587[var17] = null;
                        field592[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field505[var18] = null;
                    }
                    Statics.field1271 = field587[2047] = new class3();
                    field585.method3324();
                    field648.method3324();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field715[var19][var20][var21] = null;
                            }
                        }
                    }
                    field602 = new class177();
                    field654 = 0;
                    field719 = 0;
                    field533 = 0;
                    for (int var22 = 0; var22 < Statics.field1023; var22++) {
                        class42 var23 = class42.method157(var22);
                        if (var23 != null && var23.field1025 == 0) {
                            class160.field2710[var22] = 0;
                            class160.field2709[var22] = 0;
                        }
                    }
                    for (int var24 = 0; var24 < field551.length; var24++) {
                        field551[var24] = -1;
                    }
                    if (field627 != -1) {
                        int var25 = field627;
                        if (var25 != -1 && Statics.field2470[var25]) {
                            Statics.field2583.method3060(var25);
                            if (Statics.field2641[var25] != null) {
                                boolean var26 = true;
                                for (int var27 = 0; var27 < Statics.field2641[var25].length; var27++) {
                                    if (Statics.field2641[var25][var27] != null) {
                                        if (Statics.field2641[var25][var27].field2592 == 2) {
                                            var26 = false;
                                        } else {
                                            Statics.field2641[var25][var27] = null;
                                        }
                                    }
                                }
                                if (var26) {
                                    Statics.field2641[var25] = null;
                                }
                                Statics.field2470[var25] = false;
                            }
                        }
                    }
                    for (class4 var28 = (class4) field628.method3312(); var28 != null; var28 = (class4) field628.method3313()) {
                        method1541(var28, true);
                    }
                    field627 = -1;
                    field628 = new class175(8);
                    field623 = null;
                    field609 = false;
                    field610 = 0;
                    field729.method3230((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var29 = 0; var29 < 8; var29++) {
                        field598[var29] = null;
                        field599[var29] = false;
                    }
                    class19.field274 = new class175(32);
                    field664 = true;
                    for (int var30 = 0; var30 < 100; var30++) {
                        field663[var30] = true;
                    }
                    field692 = null;
                    Statics.field934 = 0;
                    Statics.field1930 = null;
                    Statics.field1523 = -1;
                    method33(false);
                    field466 = -1;
                }
            }
        } catch (IOException var35) {
            if (field502 < 1) {
                if (Statics.field1816 == Statics.field1792) {
                    Statics.field1816 = Statics.field300;
                } else {
                    Statics.field1816 = Statics.field1792;
                }
                field502++;
                field491 = 0;
            } else {
                method821(-2);
            }
        }
    }

    @ObfuscatedName("f.i(I)V")
    public static void method58() {
        field509.field2029 = 0;
        field487.field2029 = 0;
        field466 = -1;
        field517 = -1;
        field518 = -1;
        field519 = -1;
        field512 = 0;
        field514 = 0;
        field484 = 0;
        field610 = 0;
        field609 = false;
        field701 = 0;
        field699 = 0;
        for (int var0 = 0; var0 < field587.length; var0++) {
            if (field587[var0] != null) {
                field587[var0].field420 = -1;
            }
        }
        for (int var1 = 0; var1 < field505.length; var1++) {
            if (field505[var1] != null) {
                field505[var1].field420 = -1;
            }
        }
        class19.field274 = new class175(32);
        method176(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field663[var2] = true;
        }
    }

    @ObfuscatedName("ah.x(IB)V")
    public static void method821(int arg0) {
        if (arg0 == -3) {
            class21.method228(class135.field2167, class135.field2181, class135.field2134);
        } else if (arg0 == -2) {
            class21.method228(class135.field2135, class135.field2111, class135.field2137);
        } else if (arg0 == -1) {
            class21.method228(class135.field2098, class135.field2139, class135.field2140);
        } else if (arg0 == 3) {
            class21.method228(class135.field2141, class135.field2165, class135.field2293);
        } else if (arg0 == 4) {
            class21.method228(class135.field2144, class135.field2145, class135.field2146);
        } else if (arg0 == 5) {
            class21.method228(class135.field2147, class135.field2148, class135.field2149);
        } else if (arg0 == 6) {
            class21.method228(class135.field2150, class135.field2256, class135.field2133);
        } else if (arg0 == 7) {
            class21.method228(class135.field2153, class135.field2154, class135.field2155);
        } else if (arg0 == 8) {
            class21.method228(class135.field2156, class135.field2157, class135.field2200);
        } else if (arg0 == 9) {
            class21.method228(class135.field2159, class135.field2160, class135.field2161);
        } else if (arg0 == 10) {
            class21.method228(class135.field2162, class135.field2163, class135.field2164);
        } else if (arg0 == 11) {
            class21.method228(class135.field2190, class135.field2302, class135.field2268);
        } else if (arg0 == 12) {
            class21.method228(class135.field2168, class135.field2169, class135.field2170);
        } else if (arg0 == 13) {
            class21.method228(class135.field2171, class135.field2266, class135.field2239);
        } else if (arg0 == 14) {
            class21.method228(class135.field2124, class135.field2317, class135.field2176);
        } else if (arg0 == 16) {
            class21.method228(class135.field2177, class135.field2178, class135.field2319);
        } else if (arg0 == 17) {
            class21.method228(class135.field2180, class135.field2142, class135.field2182);
        } else if (arg0 == 18) {
            class21.method228(class135.field2183, class135.field2184, class135.field2185);
        } else if (arg0 == 19) {
            class21.method228(class135.field2186, class135.field2187, class135.field2188);
        } else if (arg0 == 20) {
            class21.method228(class135.field2189, class135.field2109, class135.field2191);
        } else if (arg0 == 22) {
            class21.method228(class135.field2192, class135.field2113, class135.field2306);
        } else if (arg0 == 23) {
            class21.method228(class135.field2195, class135.field2196, class135.field2197);
        } else if (arg0 == 24) {
            class21.method228(class135.field2198, class135.field2199, class135.field2125);
        } else if (arg0 == 25) {
            class21.method228(class135.field2201, class135.field2202, class135.field2203);
        } else if (arg0 == 26) {
            class21.method228(class135.field2204, class135.field2205, class135.field2287);
        } else if (arg0 == 27) {
            class21.method228(class135.field2207, class135.field2208, class135.field2209);
        } else if (arg0 == 31) {
            class21.method228(class135.field2216, class135.field2292, class135.field2218);
        } else if (arg0 == 32) {
            class21.method228(class135.field2219, class135.field2107, class135.field2221);
        } else if (arg0 == 37) {
            class21.method228(class135.field2297, class135.field2223, class135.field2224);
        } else if (arg0 == 38) {
            class21.method228(class135.field2229, class135.field2226, class135.field2175);
        } else if (arg0 == 55) {
            class21.method228(class135.field2228, class135.field2245, class135.field2230);
        } else {
            class21.method228(class135.field2320, class135.field2232, class135.field2233);
        }
        method176(10);
    }

    @ObfuscatedName("ce.s(I)V")
    public static final void method1697() {
        if (Statics.field652 != null) {
            Statics.field652.method1414();
            Statics.field652 = null;
        }
        method226();
        Statics.field802.method2026();
        for (int var0 = 0; var0 < 4; var0++) {
            field475[var0].method2748();
        }
        System.gc();
        class139.method799(2);
        field703 = -1;
        field704 = false;
        for (class7 var1 = (class7) class7.field105.method3325(); var1 != null; var1 = (class7) class7.field105.method3333()) {
            if (var1.field93 != null) {
                Statics.field106.method1122(var1.field93);
                var1.field93 = null;
            }
            if (var1.field90 != null) {
                Statics.field106.method1122(var1.field90);
                var1.field90 = null;
            }
        }
        class7.field105.method3324();
        method176(10);
    }

    @ObfuscatedName("g.o(I)V")
    public static final void method226() {
        class37.field933.method3269();
        class33.field861.method3269();
        class36.method12();
        class32.method668();
        class31.field768.method3269();
        class31.field769.method3269();
        class40.method1566();
        class34.field874.method3269();
        class34.field875.method3269();
        class35.field897.method3269();
        class35.field896.method3269();
        class38.field950.method3269();
        class42.field1034.method3269();
        class164.field2742.method3269();
        class159.field2596.method3269();
        class159.field2586.method3269();
        class159.field2591.method3269();
        ((class110) Statics.field1767).method2239();
        class5.field73.method3269();
        Statics.field343.method3061();
        Statics.field267.method3061();
        Statics.field1324.method3061();
        Statics.field1392.method3061();
        Statics.field2415.method3061();
        Statics.field244.method3061();
        Statics.field280.method3061();
        Statics.field497.method3061();
        Statics.field204.method3061();
        Statics.field273.method3061();
        Statics.field394.method3061();
        Statics.field761.method3061();
    }

    @ObfuscatedName("aw.g(B)V")
    public static final void method242() {
        if (field516 > 0) {
            method1697();
        } else {
            method176(40);
            Statics.field848 = Statics.field652;
            Statics.field652 = null;
        }
    }

    @ObfuscatedName("c.d(B)V")
    public static final void method240() {
        if (field484 > 1) {
            field484--;
        }
        if (field516 > 0) {
            field516--;
        }
        if (field520) {
            field520 = false;
            method242();
            return;
        }
        for (int var0 = 0; var0 < 100 && method647(); var0++) {
        }
        if (field474 != 30) {
            return;
        }
        class182.method1378(field509, 121);
        Object var1 = Statics.field478.field247;
        synchronized (Statics.field478.field247) {
            if (!field481) {
                Statics.field478.field240 = 0;
            } else if (class77.field1394 != 0 || Statics.field478.field240 >= 40) {
                field509.method2345(156);
                field509.method2657(0);
                int var2 = field509.field2029;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field478.field240 && field509.field2029 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field478.field238[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field478.field241[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field478.field238[var4] == -1 && Statics.field478.field241[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field479 != var6 || field583 != var5) {
                        int var8 = var6 - field479;
                        field479 = var6;
                        int var9 = var5 - field583;
                        field583 = var5;
                        if (field629 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field509.method2481((field629 << 12) + (var8 << 6) + var9);
                            field629 = 0;
                        } else if (field629 < 8) {
                            field509.method2482((field629 << 19) + 8388608 + var7);
                            field629 = 0;
                        } else {
                            field509.method2483((field629 << 19) + -1073741824 + var7);
                            field629 = 0;
                        }
                    } else if (field629 < 2047) {
                        field629++;
                    }
                }
                field509.method2491(field509.field2029 - var2);
                if (var3 >= Statics.field478.field240) {
                    Statics.field478.field240 = 0;
                } else {
                    Statics.field478.field240 -= var3;
                    for (int var10 = 0; var10 < Statics.field478.field240; var10++) {
                        Statics.field478.field241[var10] = Statics.field478.field241[var3 + var10];
                        Statics.field478.field238[var10] = Statics.field478.field238[var3 + var10];
                    }
                }
            }
        }
        if (class77.field1394 == 1 || class77.field1394 == 2) {
            long var12 = (class77.field1405 - field578 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field578 = class77.field1405 * -1L;
            int var14 = class77.field1404;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class77.field1400;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class77.field1394 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field509.method2345(37);
            field509.method2483((var17 << 19) + (var18 << 20) + var16);
        }
        if (class75.field1352 > 0) {
            field509.method2345(71);
            field509.method2481(0);
            int var19 = field509.field2029;
            long var20 = class121.method2();
            for (int var22 = 0; var22 < class75.field1352; var22++) {
                long var23 = var20 - field691;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field691 = var20;
                field509.method2515(class75.field1372[var22]);
                field509.method2529((int) var23);
            }
            field509.method2490(field509.field2029 - var19);
        }
        if (field661 > 0) {
            field661--;
        }
        if (class75.field1366[96] || class75.field1366[97] || class75.field1366[98] || class75.field1366[99]) {
            field558 = true;
        }
        if (field558 && field661 <= 0) {
            field661 = 20;
            field558 = false;
            field509.method2345(162);
            field509.method2595(field720);
            field509.method2481(field557);
        }
        if (Statics.field114 && !field653) {
            field653 = true;
            field509.method2345(78);
            field509.method2657(1);
        }
        if (!Statics.field114 && field653) {
            field653 = false;
            field509.method2345(78);
            field509.method2657(0);
        }
        method2221();
        if (field474 != 30) {
            return;
        }
        method694();
        int var10002;
        for (int var25 = 0; var25 < field576; var25++) {
            var10002 = field639[var25]--;
            if (field639[var25] >= -10) {
                class57 var27 = field712[var25];
                if (var27 == null) {
                    class57 var10000 = (class57) null;
                    var27 = class57.method1280(Statics.field1392, field708[var25], 0);
                    if (var27 == null) {
                        continue;
                    }
                    field639[var25] += var27.method1276();
                    field712[var25] = var27;
                }
                if (field639[var25] < 0) {
                    int var34;
                    if (field530[var25] == 0) {
                        var34 = field705;
                    } else {
                        int var28 = (field530[var25] & 0xFF) * 128;
                        int var29 = field530[var25] >> 16 & 0xFF;
                        int var30 = var29 * 128 + 64 - Statics.field1271.field418;
                        if (var30 < 0) {
                            var30 = -var30;
                        }
                        int var31 = field530[var25] >> 8 & 0xFF;
                        int var32 = var31 * 128 + 64 - Statics.field1271.field398;
                        if (var32 < 0) {
                            var32 = -var32;
                        }
                        int var33 = var30 + var32 - 128;
                        if (var33 > var28) {
                            field639[var25] = -100;
                            continue;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        var34 = field706 * (var28 - var33) / var28;
                    }
                    if (var34 > 0) {
                        class63 var35 = var27.method1275().method1346(Statics.field914);
                        class45 var36 = class45.method992(var35, 100, var34);
                        var36.method970(field709[var25] - 1);
                        Statics.field106.method1121(var36);
                    }
                    field639[var25] = -100;
                }
            } else {
                field576--;
                for (int var26 = var25; var26 < field576; var26++) {
                    field708[var26] = field708[var26 + 1];
                    field712[var26] = field712[var26 + 1];
                    field709[var26] = field709[var26 + 1];
                    field639[var26] = field639[var26 + 1];
                    field530[var26] = field530[var26 + 1];
                }
                var25--;
            }
        }
        if (field704) {
            boolean var37;
            if (class139.field2353 == 0) {
                var37 = Statics.field2815.method2819();
            } else {
                var37 = true;
            }
            if (!var37) {
                if (field702 != 0 && field703 != -1) {
                    class139.method2150(Statics.field244, field703, 0, field702, false);
                }
                field704 = false;
            }
        }
        field514++;
        if (field514 > 750) {
            method242();
            return;
        }
        for (int var38 = -1; var38 < field588; var38++) {
            int var39;
            if (var38 == -1) {
                var39 = 2047;
            } else {
                var39 = field589[var38];
            }
            class3 var40 = field587[var39];
            if (var40 != null) {
                method2370(var40, 1);
            }
        }
        for (int var41 = 0; var41 < field506; var41++) {
            int var42 = field575[var41];
            class25 var43 = field505[var42];
            if (var43 != null) {
                method2370(var43, var43.field376.field766);
            }
        }
        method750();
        field543++;
        if (field577 != 0) {
            field477 += 20;
            if (field477 >= 400) {
                field577 = 0;
            }
        }
        if (Statics.field345 != null) {
            field522++;
            if (field522 >= 15) {
                method1335(Statics.field345);
                Statics.field345 = null;
            }
        }
        if (Statics.field789 != null) {
            method1335(Statics.field789);
            field730++;
            if (class77.field1396 > field581 + 5 || class77.field1396 < field581 - 5 || class77.field1397 > field582 + 5 || class77.field1397 < field582 - 5) {
                field584 = true;
            }
            if (class77.field1395 == 0) {
                if (!field584 || field730 < 5) {
                    label849: {
                        label667: {
                            if (field608 != 1) {
                                int var52 = field610 - 1;
                                boolean var53;
                                if (var52 < 0) {
                                    var53 = false;
                                } else {
                                    int var54 = field613[var52];
                                    if (var54 >= 2000) {
                                        var54 -= 2000;
                                    }
                                    if (var54 == 1007) {
                                        var53 = true;
                                    } else {
                                        var53 = false;
                                    }
                                }
                                if (!var53) {
                                    break label667;
                                }
                            }
                            if (field610 > 2) {
                                method149();
                                break label849;
                            }
                        }
                        if (field610 > 0) {
                            method646(field610 - 1);
                        }
                    }
                } else if (Statics.field789 == Statics.field1223 && field591 != field553) {
                    class159 var44 = Statics.field789;
                    byte var45 = 0;
                    if (field630 == 1 && var44.field2594 == 206) {
                        var45 = 1;
                    }
                    if (var44.field2692[field591] <= 0) {
                        var45 = 0;
                    }
                    int var46 = method3160(var44);
                    boolean var47 = (var46 >> 29 & 0x1) != 0;
                    if (var47) {
                        int var48 = field553;
                        int var49 = field591;
                        var44.field2692[var49] = var44.field2692[var48];
                        var44.field2693[var49] = var44.field2693[var48];
                        var44.field2692[var48] = -1;
                        var44.field2693[var48] = 0;
                    } else if (var45 == 1) {
                        int var50 = field553;
                        int var51 = field591;
                        while (var50 != var51) {
                            if (var50 > var51) {
                                var44.method3175(var50 - 1, var50);
                                var50--;
                            } else if (var50 < var51) {
                                var44.method3175(var50 + 1, var50);
                                var50++;
                            }
                        }
                    } else {
                        var44.method3175(field591, field553);
                    }
                    field509.method2345(87);
                    field509.method2531(field591);
                    field509.method2515(var45);
                    field509.method2501(Statics.field789.field2665);
                    field509.method2481(field553);
                }
                field522 = 10;
                class77.field1394 = 0;
                Statics.field789 = null;
            }
        }
        class159 var55 = Statics.field392;
        class159 var56 = Statics.field355;
        Statics.field392 = null;
        Statics.field355 = null;
        field642 = null;
        field646 = false;
        field643 = false;
        for (field596 = 0; class75.method37() && field596 < 128; field596++) {
            field690[field596] = Statics.field2045;
            field689[field596] = Statics.field1848;
        }
        int var57 = field627;
        if (Statics.method66(var57)) {
            Statics.method3032(Statics.field2641[var57], -1, 0, 0, 765, 503, 0, 0);
        }
        field650++;
        while (true) {
            class1 var58;
            class159 var59;
            class159 var60;
            do {
                var58 = (class1) field665.method3328();
                if (var58 == null) {
                    while (true) {
                        class1 var61;
                        class159 var62;
                        class159 var63;
                        do {
                            var61 = (class1) field666.method3328();
                            if (var61 == null) {
                                while (true) {
                                    class1 var64;
                                    class159 var65;
                                    class159 var66;
                                    do {
                                        var64 = (class1) field571.method3328();
                                        if (var64 == null) {
                                            if (field638 != null) {
                                                method1335(field638);
                                                Statics.field1814++;
                                                if (field646 && field643) {
                                                    int var67 = class77.field1396;
                                                    int var68 = class77.field1397;
                                                    int var69 = var67 - field640;
                                                    int var70 = var68 - field641;
                                                    if (var69 < field644) {
                                                        var69 = field644;
                                                    }
                                                    if (field638.field2599 + var69 > field644 + field508.field2599) {
                                                        var69 = field644 + field508.field2599 - field638.field2599;
                                                    }
                                                    if (var70 < field645) {
                                                        var70 = field645;
                                                    }
                                                    if (field638.field2585 + var70 > field645 + field508.field2585) {
                                                        var70 = field645 + field508.field2585 - field638.field2585;
                                                    }
                                                    int var71 = var69 - field647;
                                                    int var72 = var70 - field550;
                                                    int var73 = field638.field2668;
                                                    if (Statics.field1814 > field638.field2654 && (var71 > var73 || var71 < -var73 || var72 > var73 || var72 < -var73)) {
                                                        field500 = true;
                                                    }
                                                    int var74 = field508.field2603 + (var69 - field644);
                                                    int var75 = field508.field2604 + (var70 - field645);
                                                    if (field638.field2664 != null && field500) {
                                                        class1 var76 = new class1();
                                                        var76.field2 = field638;
                                                        var76.field3 = var74;
                                                        var76.field4 = var75;
                                                        var76.field12 = field638.field2664;
                                                        class26.method1603(var76);
                                                    }
                                                    if (class77.field1395 == 0) {
                                                        if (field500) {
                                                            if (field638.field2667 != null) {
                                                                class1 var77 = new class1();
                                                                var77.field2 = field638;
                                                                var77.field3 = var74;
                                                                var77.field4 = var75;
                                                                var77.field11 = field642;
                                                                var77.field12 = field638.field2667;
                                                                class26.method1603(var77);
                                                            }
                                                            if (field642 != null) {
                                                                class159 var78 = field638;
                                                                int var79 = class163.method2248(method3160(var78));
                                                                class159 var80;
                                                                if (var79 == 0) {
                                                                    var80 = null;
                                                                } else {
                                                                    int var81 = 0;
                                                                    while (true) {
                                                                        if (var81 >= var79) {
                                                                            var80 = var78;
                                                                            break;
                                                                        }
                                                                        var78 = class159.method1393(var78.field2601);
                                                                        if (var78 == null) {
                                                                            var80 = null;
                                                                            break;
                                                                        }
                                                                        var81++;
                                                                    }
                                                                }
                                                                if (var80 != null) {
                                                                    field509.method2345(107);
                                                                    field509.method2531(field638.field2700);
                                                                    field509.method2481(field642.field2700);
                                                                    field509.method2501(field642.field2665);
                                                                    field509.method2483(field638.field2665);
                                                                }
                                                            }
                                                        } else {
                                                            label830: {
                                                                label562: {
                                                                    if (field608 != 1) {
                                                                        int var82 = field610 - 1;
                                                                        boolean var83;
                                                                        if (var82 < 0) {
                                                                            var83 = false;
                                                                        } else {
                                                                            int var84 = field613[var82];
                                                                            if (var84 >= 2000) {
                                                                                var84 -= 2000;
                                                                            }
                                                                            if (var84 == 1007) {
                                                                                var83 = true;
                                                                            } else {
                                                                                var83 = false;
                                                                            }
                                                                        }
                                                                        if (!var83) {
                                                                            break label562;
                                                                        }
                                                                    }
                                                                    if (field610 > 2) {
                                                                        method149();
                                                                        break label830;
                                                                    }
                                                                }
                                                                if (field610 > 0) {
                                                                    method646(field610 - 1);
                                                                }
                                                            }
                                                        }
                                                        field638 = null;
                                                    }
                                                } else if (Statics.field1814 > 1) {
                                                    field638 = null;
                                                }
                                            }
                                            if (class95.field1591 != -1) {
                                                int var85 = class95.field1591;
                                                int var86 = class95.field1592;
                                                field509.method2345(124);
                                                field509.method2657(5);
                                                field509.method2657(class75.field1366[82] ? (class75.field1366[81] ? 2 : 1) : 0);
                                                field509.method2522(Statics.field1269 + var86);
                                                field509.method2522(Statics.field1646 + var85);
                                                class95.field1591 = -1;
                                                field574 = class77.field1400;
                                                field470 = class77.field1404;
                                                field577 = 1;
                                                field477 = 0;
                                                field699 = var85;
                                                field700 = var86;
                                            }
                                            method142();
                                            if (Statics.field392 != var55) {
                                                if (var55 != null) {
                                                    method1335(var55);
                                                }
                                                if (Statics.field392 != null) {
                                                    method1335(Statics.field392);
                                                }
                                            }
                                            if (Statics.field355 != var56 && field620 == field619) {
                                                if (var56 != null) {
                                                    method1335(var56);
                                                }
                                                if (Statics.field355 != null) {
                                                    method1335(Statics.field355);
                                                }
                                            }
                                            if (Statics.field355 == null) {
                                                if (field619 > 0) {
                                                    field619--;
                                                }
                                            } else if (field619 < field620) {
                                                field619++;
                                                if (field620 == field619) {
                                                    method1335(Statics.field355);
                                                }
                                            }
                                            method1345();
                                            if (field532) {
                                                method253();
                                            }
                                            for (int var87 = 0; var87 < 5; var87++) {
                                                var10002 = field718[var87]++;
                                            }
                                            int var88 = ++class77.field1391 - 1;
                                            int var90 = class75.method158();
                                            if (var88 > 15000 && var90 > 15000) {
                                                field516 = 250;
                                                class77.field1391 = 14500;
                                                field509.method2345(208);
                                            }
                                            field537++;
                                            if (field537 > 500) {
                                                field537 = 0;
                                                int var91 = (int) (Math.random() * 8.0D);
                                                if ((var91 & 0x1) == 1) {
                                                    field531 += field631;
                                                }
                                                if ((var91 & 0x2) == 2) {
                                                    field686 += field534;
                                                }
                                                if ((var91 & 0x4) == 4) {
                                                    field535 += field536;
                                                }
                                            }
                                            if (field531 < -50) {
                                                field631 = 2;
                                            }
                                            if (field531 > 50) {
                                                field631 = -2;
                                            }
                                            if (field686 < -55) {
                                                field534 = 2;
                                            }
                                            if (field686 > 55) {
                                                field534 = -2;
                                            }
                                            if (field535 < -40) {
                                                field536 = 1;
                                            }
                                            if (field535 > 40) {
                                                field536 = -1;
                                            }
                                            field542++;
                                            if (field542 > 500) {
                                                field542 = 0;
                                                int var92 = (int) (Math.random() * 8.0D);
                                                if ((var92 & 0x1) == 1) {
                                                    field538 += field539;
                                                }
                                                if ((var92 & 0x2) == 2) {
                                                    field540 += field541;
                                                }
                                            }
                                            if (field538 < -60) {
                                                field539 = 2;
                                            }
                                            if (field538 > 60) {
                                                field539 = -2;
                                            }
                                            if (field540 < -20) {
                                                field541 = 1;
                                            }
                                            if (field540 > 10) {
                                                field541 = -1;
                                            }
                                            for (class28 var93 = (class28) field722.method3297(); var93 != null; var93 = (class28) field722.method3299()) {
                                                if ((long) var93.field737 < class121.method2() / 1000L - 5L) {
                                                    if (var93.field736 > 0) {
                                                        method1399(5, "", var93.field732 + class135.field2236);
                                                    }
                                                    if (var93.field736 == 0) {
                                                        method1399(5, "", var93.field732 + class135.field2237);
                                                    }
                                                    var93.method3354();
                                                }
                                            }
                                            field515++;
                                            if (field515 > 50) {
                                                field509.method2345(25);
                                            }
                                            try {
                                                if (Statics.field652 != null && field509.field2029 > 0) {
                                                    Statics.field652.method1408(field509.field2033, 0, field509.field2029);
                                                    field509.field2029 = 0;
                                                    field515 = 0;
                                                }
                                            } catch (IOException var95) {
                                                method242();
                                            }
                                            return;
                                        }
                                        var65 = var64.field2;
                                        if (var65.field2700 < 0) {
                                            break;
                                        }
                                        var66 = class159.method1393(var65.field2601);
                                    } while (var66 == null || var66.field2670 == null || var65.field2700 >= var66.field2670.length || var66.field2670[var65.field2700] != var65);
                                    class26.method1603(var64);
                                }
                            }
                            var62 = var61.field2;
                            if (var62.field2700 < 0) {
                                break;
                            }
                            var63 = class159.method1393(var62.field2601);
                        } while (var63 == null || var63.field2670 == null || var62.field2700 >= var63.field2670.length || var63.field2670[var62.field2700] != var62);
                        class26.method1603(var61);
                    }
                }
                var59 = var58.field2;
                if (var59.field2700 < 0) {
                    break;
                }
                var60 = class159.method1393(var59.field2601);
            } while (var60 == null || var60.field2670 == null || var59.field2700 >= var60.field2670.length || var60.field2670[var59.field2700] != var59);
            class26.method1603(var58);
        }
    }

    @ObfuscatedName("dl.t(I)V")
    public static final void method2251() {
        if (Statics.field1758 != null) {
            Statics.field1758.method1169();
        }
        if (Statics.field2015 != null) {
            Statics.field2015.method1169();
        }
    }

    @ObfuscatedName("es.b(Lag;IIII)V")
    public static void method2912(class34 arg0, int arg1, int arg2, int arg3) {
        if (field576 >= 50 || field706 == 0 || arg0.field879 == null || arg1 >= arg0.field879.length) {
            return;
        }
        int var4 = arg0.field879[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field708[field576] = var5;
        field709[field576] = var6;
        field639[field576] = 0;
        field712[field576] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field530[field576] = (var8 << 16) + (var9 << 8) + var7;
        field576++;
    }

    @ObfuscatedName("g.c(IIII)V")
    public static void method224(int arg0, int arg1, int arg2) {
        if (field705 == 0 || arg1 == 0 || field576 >= 50) {
            return;
        }
        field708[field576] = arg0;
        field709[field576] = arg1;
        field639[field576] = arg2;
        field712[field576] = null;
        field530[field576] = 0;
        field576++;
    }

    @ObfuscatedName("az.ap(III)V")
    public static void method623(int arg0, int arg1) {
        if (field702 != 0 && arg0 != -1) {
            class139.method2150(Statics.field394, arg0, 0, field702, false);
            field704 = true;
        }
    }

    @ObfuscatedName("de.am(B)V")
    public static final void method2221() {
        if (field471 && Statics.field1467 != field521) {
            method140(Statics.field1523, Statics.field269, Statics.field1467, Statics.field1271.field449[0], Statics.field1271.field460[0]);
        } else if (Statics.field1467 != field694) {
            field694 = Statics.field1467;
            method2235(Statics.field1467);
        }
    }

    @ObfuscatedName("k.az(IIB)V")
    public static final void method123(int arg0, int arg1) {
        if (field701 != 0 && field701 != 3 || class77.field1394 != 1) {
            return;
        }
        int var2 = class77.field1400 - 25 - arg0;
        int var3 = class77.field1404 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field720 + field538 & 0x7FF;
        int var5 = class104.field1780[var4];
        int var6 = class104.field1784[var4];
        int var7 = (field540 + 256) * var5 >> 8;
        int var8 = (field540 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1271.field418 + var9 >> 7;
        int var12 = Statics.field1271.field398 - var10 >> 7;
        field509.method2345(35);
        field509.method2657(18);
        field509.method2657(class75.field1366[82] ? (class75.field1366[81] ? 2 : 1) : 0);
        field509.method2522(Statics.field1269 + var12);
        field509.method2522(Statics.field1646 + var11);
        field509.method2657(var2);
        field509.method2657(var3);
        field509.method2481(field720);
        field509.method2657(57);
        field509.method2657(field538);
        field509.method2657(field540);
        field509.method2657(89);
        field509.method2481(Statics.field1271.field418);
        field509.method2481(Statics.field1271.field398);
        field509.method2657(63);
        field699 = var11;
        field700 = var12;
    }

    @ObfuscatedName("ag.ax(B)V")
    public static final void method750() {
        for (int var0 = -1; var0 < field588; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field589[var0];
            }
            class3 var2 = field587[var1];
            if (var2 != null && var2.field412 > 0) {
                var2.field412--;
                if (var2.field412 == 0) {
                    var2.field410 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field506; var3++) {
            int var4 = field575[var3];
            class25 var5 = field505[var4];
            if (var5 != null && var5.field412 > 0) {
                var5.field412--;
                if (var5.field412 == 0) {
                    var5.field410 = null;
                }
            }
        }
    }

    @ObfuscatedName("y.af(Ljava/lang/String;I)V")
    public static final void method39(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field29.field187 = !Statics.field29.field187;
            class29 var1 = null;
            try {
                var1 = class82.method1392("", Statics.field660.field2091, true);
                class127 var2 = Statics.field29.method128();
                var1.method561(var2.field2033, 0, var2.field2029);
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method559();
                }
            } catch (Exception var5) {
            }
            if (Statics.field29.field187) {
                method1399(0, "", "Roofs are now all hidden");
            } else {
                method1399(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field573 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field483 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field483 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method242();
            }
            if (arg0.equalsIgnoreCase("errortest") && field467 == 2) {
                throw new RuntimeException();
            }
        }
        field509.method2345(192);
        field509.method2657(arg0.length() + 1);
        field509.method2485(arg0);
    }

    @ObfuscatedName("aw.aa(B)V")
    public static final void method253() {
        int var0 = Statics.field70 * 128 + 64;
        int var1 = Statics.field1830 * 128 + 64;
        int var2 = method2979(var0, var1, Statics.field1467) - Statics.field55;
        if (Statics.field68 < var0) {
            Statics.field68 += Statics.field2334 * (var0 - Statics.field68) / 1000 + Statics.field1933;
            if (Statics.field68 > var0) {
                Statics.field68 = var0;
            }
        }
        if (Statics.field68 > var0) {
            Statics.field68 -= Statics.field2334 * (Statics.field68 - var0) / 1000 + Statics.field1933;
            if (Statics.field68 < var0) {
                Statics.field68 = var0;
            }
        }
        if (Statics.field1835 < var2) {
            Statics.field1835 += Statics.field2334 * (var2 - Statics.field1835) / 1000 + Statics.field1933;
            if (Statics.field1835 > var2) {
                Statics.field1835 = var2;
            }
        }
        if (Statics.field1835 > var2) {
            Statics.field1835 -= Statics.field2334 * (Statics.field1835 - var2) / 1000 + Statics.field1933;
            if (Statics.field1835 < var2) {
                Statics.field1835 = var2;
            }
        }
        if (Statics.field258 < var1) {
            Statics.field258 += Statics.field2334 * (var1 - Statics.field258) / 1000 + Statics.field1933;
            if (Statics.field258 > var1) {
                Statics.field258 = var1;
            }
        }
        if (Statics.field258 > var1) {
            Statics.field258 -= Statics.field2334 * (Statics.field258 - var1) / 1000 + Statics.field1933;
            if (Statics.field258 < var1) {
                Statics.field258 = var1;
            }
        }
        int var3 = Statics.field136 * 128 + 64;
        int var4 = Statics.field360 * 128 + 64;
        int var5 = method2979(var3, var4, Statics.field1467) - Statics.field811;
        int var6 = var3 - Statics.field68;
        int var7 = var5 - Statics.field1835;
        int var8 = var4 - Statics.field258;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1472 < var10) {
            Statics.field1472 += Statics.field443 * (var10 - Statics.field1472) / 1000 + Statics.field21;
            if (Statics.field1472 > var10) {
                Statics.field1472 = var10;
            }
        }
        if (Statics.field1472 > var10) {
            Statics.field1472 -= Statics.field443 * (Statics.field1472 - var10) / 1000 + Statics.field21;
            if (Statics.field1472 < var10) {
                Statics.field1472 = var10;
            }
        }
        int var12 = var11 - Statics.field1304;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1304 += Statics.field443 * var12 / 1000 + Statics.field21;
            Statics.field1304 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1304 -= Statics.field443 * -var12 / 1000 + Statics.field21;
            Statics.field1304 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1304;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1304 = var11;
        }
    }

    @ObfuscatedName("bj.ag(I)V")
    public static final void method1345() {
        int var0 = field531 + Statics.field1271.field418;
        int var1 = field686 + Statics.field1271.field398;
        if (Statics.field454 - var0 < -500 || Statics.field454 - var0 > 500 || Statics.field2332 - var1 < -500 || Statics.field2332 - var1 > 500) {
            Statics.field454 = var0;
            Statics.field2332 = var1;
        }
        if (Statics.field454 != var0) {
            Statics.field454 += (var0 - Statics.field454) / 16;
        }
        if (Statics.field2332 != var1) {
            Statics.field2332 += (var1 - Statics.field2332) / 16;
        }
        if (class77.field1395 == 4 && field573 >= 2) {
            int var2 = class77.field1397 - field556;
            field554 = var2 * 2;
            field556 = var2 == -1 || var2 == 1 ? class77.field1397 : (field556 + class77.field1397) / 2;
            int var3 = field555 - class77.field1396;
            field603 = var3 * 2;
            field555 = var3 == -1 || var3 == 1 ? class77.field1396 : (field555 + class77.field1396) / 2;
        } else {
            if (class75.field1366[96]) {
                field603 += (-24 - field603) / 2;
            } else if (class75.field1366[97]) {
                field603 += (24 - field603) / 2;
            } else {
                field603 /= 2;
            }
            if (class75.field1366[98]) {
                field554 += (12 - field554) / 2;
            } else if (class75.field1366[99]) {
                field554 += (-12 - field554) / 2;
            } else {
                field554 /= 2;
            }
            field556 = class77.field1397;
            field555 = class77.field1396;
        }
        field720 = field603 / 2 + field720 & 0x7FF;
        field557 += field554 / 2;
        if (field557 < 128) {
            field557 = 128;
        }
        if (field557 > 383) {
            field557 = 383;
        }
        int var4 = Statics.field454 >> 7;
        int var5 = Statics.field2332 >> 7;
        int var6 = method2979(Statics.field454, Statics.field2332, Statics.field1467);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1467;
                    if (var10 < 3 && (class9.field141[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class9.field119[var10][var8][var9];
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
        if (var12 > field566) {
            field566 += (var12 - field566) / 24;
        } else if (var12 < field566) {
            field566 += (var12 - field566) / 80;
        }
    }

    @ObfuscatedName("db.aj(Law;II)V")
    public static final void method2370(class27 arg0, int arg1) {
        if (arg0.field440 > field476) {
            method1367(arg0);
        } else if (arg0.field438 >= field476) {
            method3262(arg0);
        } else {
            arg0.field423 = arg0.field402;
            if (arg0.field448 == 0) {
                arg0.field430 = 0;
            } else {
                label424: {
                    if (arg0.field456 != -1 && arg0.field429 == 0) {
                        class34 var2 = Statics.method1204(arg0.field456);
                        if (arg0.field421 > 0 && var2.field872 == 0) {
                            arg0.field430++;
                            break label424;
                        }
                        if (arg0.field421 <= 0 && var2.field887 == 0) {
                            arg0.field430++;
                            break label424;
                        }
                    }
                    int var3 = arg0.field418;
                    int var4 = arg0.field398;
                    int var5 = arg0.field449[arg0.field448 - 1] * 128 + arg0.field416 * 64;
                    int var6 = arg0.field460[arg0.field448 - 1] * 128 + arg0.field416 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field445 = 1280;
                            } else if (var4 > var6) {
                                arg0.field445 = 1792;
                            } else {
                                arg0.field445 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field445 = 768;
                            } else if (var4 > var6) {
                                arg0.field445 = 256;
                            } else {
                                arg0.field445 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field445 = 1024;
                        } else if (var4 > var6) {
                            arg0.field445 = 0;
                        }
                        int var7 = arg0.field445 - arg0.field399 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field406;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field405;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field408;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field407;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field405;
                        }
                        arg0.field423 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class25) {
                            var10 = ((class25) arg0).field376.field800;
                        }
                        if (var10) {
                            if (arg0.field445 != arg0.field399 && arg0.field420 == -1 && arg0.field447 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field448 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field448 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field430 > 0 && arg0.field448 > 1) {
                                var9 = 8;
                                arg0.field430--;
                            }
                        } else {
                            if (arg0.field448 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field448 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field430 > 0 && arg0.field448 > 1) {
                                var9 = 8;
                                arg0.field430--;
                            }
                        }
                        if (arg0.field452[arg0.field448 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field423 == arg0.field405 && arg0.field409 != -1) {
                            arg0.field423 = arg0.field409;
                        }
                        if (var3 < var5) {
                            arg0.field418 += var9;
                            if (arg0.field418 > var5) {
                                arg0.field418 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field418 -= var9;
                            if (arg0.field418 < var5) {
                                arg0.field418 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field398 += var9;
                            if (arg0.field398 > var6) {
                                arg0.field398 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field398 -= var9;
                            if (arg0.field398 < var6) {
                                arg0.field398 = var6;
                            }
                        }
                        if (arg0.field418 == var5 && arg0.field398 == var6) {
                            arg0.field448--;
                            if (arg0.field421 > 0) {
                                arg0.field421--;
                            }
                        }
                    } else {
                        arg0.field418 = var5;
                        arg0.field398 = var6;
                    }
                }
            }
        }
        if (arg0.field418 < 128 || arg0.field398 < 128 || arg0.field418 >= 13184 || arg0.field398 >= 13184) {
            arg0.field456 = -1;
            arg0.field415 = -1;
            arg0.field440 = 0;
            arg0.field438 = 0;
            arg0.field418 = arg0.field449[0] * 128 + arg0.field416 * 64;
            arg0.field398 = arg0.field460[0] * 128 + arg0.field416 * 64;
            arg0.method245();
        }
        if (Statics.field1271 == arg0 && (arg0.field418 < 1536 || arg0.field398 < 1536 || arg0.field418 >= 11776 || arg0.field398 >= 11776)) {
            arg0.field456 = -1;
            arg0.field415 = -1;
            arg0.field440 = 0;
            arg0.field438 = 0;
            arg0.field418 = arg0.field449[0] * 128 + arg0.field416 * 64;
            arg0.field398 = arg0.field460[0] * 128 + arg0.field416 * 64;
            arg0.method245();
        }
        if (arg0.field447 != 0) {
            if (arg0.field420 != -1 && arg0.field420 < 32768) {
                class25 var11 = field505[arg0.field420];
                if (var11 != null) {
                    int var12 = arg0.field418 - var11.field418;
                    int var13 = arg0.field398 - var11.field398;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field445 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field420 >= 32768) {
                int var14 = arg0.field420 - 32768;
                if (field593 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field587[var14];
                if (var15 != null) {
                    int var16 = arg0.field418 - var15.field418;
                    int var17 = arg0.field398 - var15.field398;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field445 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field424 != 0 || arg0.field422 != 0) && (arg0.field448 == 0 || arg0.field430 > 0)) {
                int var18 = arg0.field418 - (arg0.field424 * 64 - Statics.field1646 * 64 - Statics.field1646 * 64);
                int var19 = arg0.field398 - (arg0.field422 * 64 - Statics.field1269 * 64 - Statics.field1269 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field445 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field424 = 0;
                arg0.field422 = 0;
            }
            int var20 = arg0.field445 - arg0.field399 & 0x7FF;
            if (var20 == 0) {
                arg0.field436 = 0;
            } else {
                arg0.field436++;
                if (var20 > 1024) {
                    arg0.field399 -= arg0.field447;
                    boolean var21 = true;
                    if (var20 < arg0.field447 || var20 > 2048 - arg0.field447) {
                        arg0.field399 = arg0.field445;
                        var21 = false;
                    }
                    if (arg0.field423 == arg0.field402 && (arg0.field436 > 25 || var21)) {
                        if (arg0.field403 == -1) {
                            arg0.field423 = arg0.field405;
                        } else {
                            arg0.field423 = arg0.field403;
                        }
                    }
                } else {
                    arg0.field399 += arg0.field447;
                    boolean var22 = true;
                    if (var20 < arg0.field447 || var20 > 2048 - arg0.field447) {
                        arg0.field399 = arg0.field445;
                        var22 = false;
                    }
                    if (arg0.field423 == arg0.field402 && (arg0.field436 > 25 || var22)) {
                        if (arg0.field404 == -1) {
                            arg0.field423 = arg0.field405;
                        } else {
                            arg0.field423 = arg0.field404;
                        }
                    }
                }
                arg0.field399 &= 0x7FF;
            }
        }
        arg0.field400 = false;
        if (arg0.field423 != -1) {
            class34 var24 = Statics.method1204(arg0.field423);
            if (var24 == null || var24.field888 == null) {
                arg0.field423 = -1;
            } else {
                arg0.field425++;
                if (arg0.field401 < var24.field888.length && arg0.field425 > var24.field878[arg0.field401]) {
                    arg0.field425 = 1;
                    arg0.field401++;
                    method2912(var24, arg0.field401, arg0.field418, arg0.field398);
                }
                if (arg0.field401 >= var24.field888.length) {
                    arg0.field425 = 0;
                    arg0.field401 = 0;
                    method2912(var24, arg0.field401, arg0.field418, arg0.field398);
                }
            }
        }
        if (arg0.field415 != -1 && field476 >= arg0.field411) {
            if (arg0.field432 < 0) {
                arg0.field432 = 0;
            }
            int var25 = class35.method163(arg0.field415).field891;
            if (var25 == -1) {
                arg0.field415 = -1;
            } else {
                class34 var26 = Statics.method1204(var25);
                if (var26 == null || var26.field888 == null) {
                    arg0.field415 = -1;
                } else {
                    arg0.field433++;
                    if (arg0.field432 < var26.field888.length && arg0.field433 > var26.field878[arg0.field432]) {
                        arg0.field433 = 1;
                        arg0.field432++;
                        method2912(var26, arg0.field432, arg0.field418, arg0.field398);
                    }
                    if (arg0.field432 >= var26.field888.length && (arg0.field432 < 0 || arg0.field432 >= var26.field888.length)) {
                        arg0.field415 = -1;
                    }
                }
            }
        }
        if (arg0.field456 != -1 && arg0.field429 <= 1) {
            class34 var27 = Statics.method1204(arg0.field456);
            if (var27.field872 == 1 && arg0.field421 > 0 && arg0.field440 <= field476 && arg0.field438 < field476) {
                arg0.field429 = 1;
                return;
            }
        }
        if (arg0.field456 != -1 && arg0.field429 == 0) {
            class34 var28 = Statics.method1204(arg0.field456);
            if (var28 == null || var28.field888 == null) {
                arg0.field456 = -1;
            } else {
                arg0.field428++;
                if (arg0.field427 < var28.field888.length && arg0.field428 > var28.field878[arg0.field427]) {
                    arg0.field428 = 1;
                    arg0.field427++;
                    method2912(var28, arg0.field427, arg0.field418, arg0.field398);
                }
                if (arg0.field427 >= var28.field888.length) {
                    arg0.field427 -= var28.field876;
                    arg0.field446++;
                    if (arg0.field446 >= var28.field886) {
                        arg0.field456 = -1;
                    } else if (arg0.field427 >= 0 && arg0.field427 < var28.field888.length) {
                        method2912(var28, arg0.field427, arg0.field418, arg0.field398);
                    } else {
                        arg0.field456 = -1;
                    }
                }
                arg0.field400 = var28.field882;
            }
        }
        if (arg0.field429 > 0) {
            arg0.field429--;
        }
    }

    @ObfuscatedName("bv.aq(Law;I)V")
    public static final void method1367(class27 arg0) {
        int var1 = arg0.field440 - field476;
        int var2 = arg0.field453 * 128 + arg0.field416 * 64;
        int var3 = arg0.field426 * 128 + arg0.field416 * 64;
        arg0.field418 += (var2 - arg0.field418) / var1;
        arg0.field398 += (var3 - arg0.field398) / var1;
        arg0.field430 = 0;
        if (arg0.field442 == 0) {
            arg0.field445 = 1024;
        }
        if (arg0.field442 == 1) {
            arg0.field445 = 1536;
        }
        if (arg0.field442 == 2) {
            arg0.field445 = 0;
        }
        if (arg0.field442 == 3) {
            arg0.field445 = 512;
        }
    }

    @ObfuscatedName("fj.ah(Law;I)V")
    public static final void method3262(class27 arg0) {
        if (field476 == arg0.field438 || arg0.field456 == -1 || arg0.field429 != 0 || arg0.field428 + 1 > Statics.method1204(arg0.field456).field878[arg0.field427]) {
            int var1 = arg0.field438 - arg0.field440;
            int var2 = field476 - arg0.field440;
            int var3 = arg0.field453 * 128 + arg0.field416 * 64;
            int var4 = arg0.field426 * 128 + arg0.field416 * 64;
            int var5 = arg0.field437 * 128 + arg0.field416 * 64;
            int var6 = arg0.field439 * 128 + arg0.field416 * 64;
            arg0.field418 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field398 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field430 = 0;
        if (arg0.field442 == 0) {
            arg0.field445 = 1024;
        }
        if (arg0.field442 == 1) {
            arg0.field445 = 1536;
        }
        if (arg0.field442 == 2) {
            arg0.field445 = 0;
        }
        if (arg0.field442 == 3) {
            arg0.field445 = 512;
        }
        arg0.field399 = arg0.field445;
    }

    @ObfuscatedName("bx.ae(La;III)V")
    public static void method1511(class3 arg0, int arg1, int arg2) {
        if (arg0.field456 == arg1 && arg1 != -1) {
            int var3 = Statics.method1204(arg1).field889;
            if (var3 == 1) {
                arg0.field427 = 0;
                arg0.field428 = 0;
                arg0.field429 = arg2;
                arg0.field446 = 0;
            }
            if (var3 == 2) {
                arg0.field446 = 0;
            }
        } else if (arg1 == -1 || arg0.field456 == -1 || Statics.method1204(arg1).field880 >= Statics.method1204(arg0.field456).field880) {
            arg0.field456 = arg1;
            arg0.field427 = 0;
            arg0.field428 = 0;
            arg0.field429 = arg2;
            arg0.field446 = 0;
            arg0.field421 = arg0.field448;
        }
    }

    @ObfuscatedName("b.ar(I)V")
    public static final void method236() {
        if (!field609) {
            field713[0] = class135.field2262;
            field493[0] = "";
            field613[0] = 1006;
            field610 = 1;
        }
        if (field627 != -1) {
            int var0 = field627;
            if (Statics.method66(var0)) {
                method6(Statics.field2641[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field489; var1++) {
            if (field663[var1]) {
                field671[var1] = true;
            }
            field465[var1] = field663[var1];
            field663[var1] = false;
        }
        field634 = field476;
        field707 = -1;
        field669 = -1;
        Statics.field1223 = null;
        if (field627 != -1) {
            field489 = 0;
            int var2 = field627;
            if (Statics.method66(var2)) {
                Statics.field909 = null;
                method2771(Statics.field2641[var2], -1, 0, 0, 765, 503, 0, 0, -1);
                if (Statics.field909 != null) {
                    method2771(Statics.field909, -1412584499, 0, 0, 765, 503, Statics.field372, Statics.field1759, -1);
                    Statics.field909 = null;
                }
            } else {
                for (int var3 = 0; var3 < 100; var3++) {
                    field663[var3] = true;
                }
            }
        }
        class89.method1809();
        method1881();
        if (field609) {
            int var7 = Statics.field1031;
            int var8 = Statics.field1553;
            int var9 = Statics.field910;
            int var10 = Statics.field322;
            int var11 = 6116423;
            class89.method1816(var7, var8, var9, var10, var11);
            class89.method1816(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class89.method1818(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field1626.method3405(class135.field2242, var7 + 3, var8 + 14, var11, -1);
            int var12 = class77.field1396;
            int var13 = class77.field1397;
            for (int var14 = 0; var14 < field610; var14++) {
                int var15 = (field610 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                Statics.field1626.method3405(method40(var14), var7 + 3, var15, var16, 0);
            }
            method1428(Statics.field1031, Statics.field1553, Statics.field910, Statics.field322);
        } else if (field707 != -1) {
            int var4 = field707;
            int var5 = field669;
            if (field610 >= 2 || field621 != 0 || field605) {
                String var6;
                if (field621 == 1 && field610 < 2) {
                    var6 = class135.field2172 + class135.field2249 + field580 + " " + class2.field17;
                } else if (field605 && field610 < 2) {
                    var6 = field714 + class135.field2249 + field626 + " " + class2.field17;
                } else {
                    var6 = method40(field610 - 1);
                }
                if (field610 > 2) {
                    var6 = var6 + class2.method2758(16777215) + " " + '/' + " " + (field610 - 2) + class135.field2243;
                }
                Statics.field1626.method3411(var6, var4 + 4, var5 + 15, 16777215, 0, field476 / 1000);
            }
        }
        if (field677 == 3) {
            for (int var17 = 0; var17 < field489; var17++) {
                if (field465[var17]) {
                    class89.method1815(field673[var17], field674[var17], field604[var17], field528[var17], 16711935, 128);
                } else if (field671[var17]) {
                    class89.method1815(field673[var17], field674[var17], field604[var17], field528[var17], 16711680, 128);
                }
            }
        }
        class7.method1(Statics.field1467, Statics.field1271.field418, Statics.field1271.field398, field543);
        field543 = 0;
    }

    @ObfuscatedName("dl.ab(Ljava/lang/String;ZI)V")
    public static final void method2250(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1281.method3402(arg0, 250);
        int var6 = Statics.field1281.method3396(arg0, 250) * 13;
        class89.method1816(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1818(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1281.method3408(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method842(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1428(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field351.getGraphics();
            Statics.field1469.method1625(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field351.repaint();
        }
    }

    @ObfuscatedName("k.ay(ZI)V")
    public static final void method115(boolean arg0) {
        if (Statics.field1271.field418 >> 7 == field699 && Statics.field1271.field398 >> 7 == field700) {
            field699 = 0;
        }
        int var1 = field588;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1271;
                var4 = 33538048;
            } else {
                var3 = field587[field589[var2]];
                var4 = field589[var2] << 14;
            }
            if (var3 != null && var3.method20()) {
                var3.field47 = false;
                if ((field471 && field588 > 50 || field588 > 200) && !arg0 && var3.field423 == var3.field402) {
                    var3.field47 = true;
                }
                int var5 = var3.field418 >> 7;
                int var6 = var3.field398 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field30 == null || field476 < var3.field42 || field476 >= var3.field38) {
                        if ((var3.field418 & 0x7F) == 64 && (var3.field398 & 0x7F) == 64) {
                            if (field667 == field570[var5][var6]) {
                                continue;
                            }
                            field570[var5][var6] = field667;
                        }
                        var3.field35 = method2979(var3.field418, var3.field398, Statics.field1467);
                        Statics.field802.method1900(Statics.field1467, var3.field418, var3.field398, var3.field35, 60, var3, var3.field399, var4, var3.field400);
                    } else {
                        var3.field47 = false;
                        var3.field35 = method2979(var3.field418, var3.field398, Statics.field1467);
                        Statics.field802.method1901(Statics.field1467, var3.field418, var3.field398, var3.field35, 60, var3, var3.field399, var4, var3.field37, var3.field44, var3.field45, var3.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ac(ZB)V")
    public static final void method231(boolean arg0) {
        for (int var1 = 0; var1 < field506; var1++) {
            class25 var2 = field505[field575[var1]];
            int var3 = (field575[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field376.field772 == arg0 && var2.field376.method626()) {
                int var4 = var2.field418 >> 7;
                int var5 = var2.field398 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field416 == 1 && (var2.field418 & 0x7F) == 64 && (var2.field398 & 0x7F) == 64) {
                        if (field667 == field570[var4][var5]) {
                            continue;
                        }
                        field570[var4][var5] = field667;
                    }
                    if (!var2.field376.field790) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field802.method1900(Statics.field1467, var2.field418, var2.field398, method2979(var2.field418 + (var2.field416 * 64 - 64), var2.field398 + (var2.field416 * 64 - 64), Statics.field1467), var2.field416 * 64 - 64 + 60, var2, var2.field399, var3, var2.field400);
                }
            }
        }
    }

    @ObfuscatedName("a.ad(I)I")
    public static final int method30() {
        if (Statics.field29.field187) {
            return Statics.field1467;
        } else {
            int var0 = method2979(Statics.field68, Statics.field258, Statics.field1467);
            return var0 - Statics.field1835 >= 800 || (class9.field141[Statics.field1467][Statics.field68 >> 7][Statics.field258 >> 7] & 0x4) == 0 ? 3 : Statics.field1467;
        }
    }

    @ObfuscatedName("h.al(III)V")
    public static final void method34(int arg0, int arg1) {
        if (field545 == 2) {
            method3259((field488 - Statics.field1646 << 7) + field668, (field688 - Statics.field1269 << 7) + field492, field693 * 2);
            if (field572 > -1 && field476 % 20 < 10) {
                Statics.field5[0].method1725(field572 + arg0 - 12, field649 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("br.an(I)V")
    public static final void method1442() {
        field586 = 0;
        int var0 = (Statics.field1271.field418 >> 7) + Statics.field1646;
        int var1 = (Statics.field1271.field398 >> 7) + Statics.field1269;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field586 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field586 = 1;
        }
        if (field586 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field586 = 0;
        }
    }

    @ObfuscatedName("af.at(IIIII)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3) {
        if (field577 == 1) {
            Statics.field1823[field477 / 100].method1725(field574 - 8, field470 - 8);
        }
        if (field577 == 2) {
            Statics.field1823[field477 / 100 + 4].method1725(field574 - 8, field470 - 8);
        }
        method1442();
        if (!field483) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1281.method3406("Fps:" + field1328, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field471) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field471) {
            var8 = 16711680;
        }
        Statics.field1281.method3406("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("aa.ak(Law;II)V")
    public static final void method712(class27 arg0, int arg1) {
        method3259(arg0.field418, arg0.field398, arg1);
    }

    @ObfuscatedName("fh.as(IIIB)V")
    public static final void method3259(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field572 = -1;
            field649 = -1;
            return;
        }
        int var3 = method2979(arg0, arg1, Statics.field1467) - arg2;
        int var4 = arg0 - Statics.field68;
        int var5 = var3 - Statics.field1835;
        int var6 = arg1 - Statics.field258;
        int var7 = class104.field1780[Statics.field1472];
        int var8 = class104.field1784[Statics.field1472];
        int var9 = class104.field1780[Statics.field1304];
        int var10 = class104.field1784[Statics.field1304];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field572 = (var11 << 9) / var15 + 256;
            field649 = (var14 << 9) / var15 + 167;
        } else {
            field572 = -1;
            field649 = -1;
        }
    }

    @ObfuscatedName("ek.ai(IIII)I")
    public static final int method2979(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class9.field119[var5][var3][var4] + class9.field119[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field119[var5][var3][var4 + 1] + class9.field119[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("z.ao(IIIIIII)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1780[var6];
            int var12 = class104.field1784[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1780[var7];
            int var15 = class104.field1784[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field68 = arg0 - var8;
        Statics.field1835 = arg1 - var9;
        Statics.field258 = arg2 - var10;
        Statics.field1472 = arg3;
        Statics.field1304 = arg4;
    }

    @ObfuscatedName("a.av(ZI)V")
    public static final void method33(boolean arg0) {
        field679 = arg0;
        if (!field679) {
            int var1 = field487.method2527();
            int var2 = field487.method2527();
            int var3 = field487.method2496();
            int var4 = field487.method2527();
            int var5 = field487.method2517();
            int var6 = (field512 - field487.field2029) / 16;
            Statics.field357 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field357[var7][var8] = field487.method2617();
                }
            }
            Statics.field2372 = new int[var6];
            Statics.field229 = new int[var6];
            Statics.field1453 = new int[var6];
            Statics.field199 = new byte[var6][];
            Statics.field206 = new byte[var6][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2372[var10] = var13;
                        Statics.field229[var10] = Statics.field2415.method3063("m" + var11 + "_" + var12);
                        Statics.field1453[var10] = Statics.field2415.method3063("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method140(var2, var1, var5, var3, var4);
            return;
        }
        int var14 = field487.method2525();
        field487.method2347();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field487.method2352(1);
                    if (var18 == 1) {
                        field597[var15][var16][var17] = field487.method2352(26);
                    } else {
                        field597[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field487.method2349();
        int var19 = (field512 - field487.field2029) / 16;
        Statics.field357 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field357[var20][var21] = field487.method2512();
            }
        }
        int var22 = field487.method2527();
        int var23 = field487.method2494();
        int var24 = field487.method2527();
        int var25 = field487.method2496();
        Statics.field2372 = new int[var19];
        Statics.field229 = new int[var19];
        Statics.field1453 = new int[var19];
        Statics.field199 = new byte[var19][];
        Statics.field206 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field597[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2372[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2372[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field229[var26] = Statics.field2415.method3063("m" + var35 + "_" + var36);
                            Statics.field1453[var26] = Statics.field2415.method3063("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method140(var14, var22, var23, var24, var25);
    }

    @ObfuscatedName("w.au(IIIIIB)V")
    public static final void method140(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1523 == arg0 && Statics.field269 == arg1 && field521 == arg2 || !field471) {
            return;
        }
        Statics.field1523 = arg0;
        Statics.field269 = arg1;
        field521 = arg2;
        if (!field471) {
            field521 = 0;
        }
        method176(25);
        method2250(class135.field2105, true);
        int var5 = Statics.field1646;
        int var6 = Statics.field1269;
        Statics.field1646 = (arg0 - 6) * 8;
        Statics.field1269 = (arg1 - 6) * 8;
        int var7 = Statics.field1646 - var5;
        int var8 = Statics.field1269 - var6;
        int var9 = Statics.field1646;
        int var10 = Statics.field1269;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field505[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field449[var13] -= var7;
                    var12.field460[var13] -= var8;
                }
                var12.field418 -= var7 * 128;
                var12.field398 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field587[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field449[var16] -= var7;
                    var15.field460[var16] -= var8;
                }
                var15.field418 -= var7 * 128;
                var15.field398 -= var8 * 128;
            }
        }
        Statics.field1467 = arg2;
        Statics.field1271.method248(arg3, arg4, false);
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
                        field715[var27][var23][var24] = field715[var27][var25][var26];
                    } else {
                        field715[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field602.method3325(); var28 != null; var28 = (class22) field602.method3333()) {
            var28.field334 -= var7;
            var28.field346 -= var8;
            if (var28.field334 < 0 || var28.field346 < 0 || var28.field334 >= 104 || var28.field346 >= 104) {
                var28.method3360();
            }
        }
        if (field699 != 0) {
            field699 -= var7;
            field700 -= var8;
        }
        field576 = 0;
        field532 = false;
        field694 = -1;
        field648.method3324();
        field585.method3324();
    }

    @ObfuscatedName("df.bl(II)V")
    public static final void method2235(int arg0) {
        int[] var1 = Statics.field2000.field1482;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field141[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field802.method1922(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field141[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field802.method1922(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2000.method1710();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field141[arg0][var10][var9] & 0x18) == 0) {
                    method2775(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field141[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2775(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field695 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field802.method1918(Statics.field1467, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method2811(var14).field835;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field475[Statics.field1467].field2057;
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
                        field698[field695] = Statics.field1393[var15];
                        field696[field695] = var16;
                        field697[field695] = var17;
                        field695++;
                    }
                }
            }
        }
        Statics.field1469.method1699();
    }

    @ObfuscatedName("ed.bn(IIIIIB)V")
    public static final void method2775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field802.method1978(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field802.method1947(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2000.field1482;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method2811(var12);
            if (var13.field836 == -1) {
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
                class87 var14 = Statics.field716[var13.field836];
                if (var14 != null) {
                    int var15 = (var13.field822 * 4 - var14.field1489) / 2;
                    int var16 = (var13.field807 * 4 - var14.field1490) / 2;
                    var14.method1795(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field807) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field802.method1917(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field802.method1947(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method2811(var21);
            if (var22.field836 != -1) {
                class87 var23 = Statics.field716[var22.field836];
                if (var23 != null) {
                    int var24 = (var22.field822 * 4 - var23.field1489) / 2;
                    int var25 = (var22.field807 * 4 - var23.field1490) / 2;
                    var23.method1795(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field807) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2000.field1482;
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
        int var29 = Statics.field802.method1918(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method2811(var30);
        if (var31.field836 == -1) {
            return;
        }
        class87 var32 = Statics.field716[var31.field836];
        if (var32 != null) {
            int var33 = (var31.field822 * 4 - var32.field1489) / 2;
            int var34 = (var31.field807 * 4 - var32.field1490) / 2;
            var32.method1795(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field807) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ax.bh(I)Z")
    public static final boolean method647() {
        if (Statics.field652 == null) {
            return false;
        }
        try {
            int var0 = Statics.field652.method1406();
            if (var0 == 0) {
                return false;
            }
            if (field466 == -1) {
                Statics.field652.method1411(field487.field2033, 0, 1);
                field487.field2029 = 0;
                field466 = field487.method2343();
                field512 = class165.field2767[field466];
                var0--;
            }
            if (field512 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field652.method1411(field487.field2033, 0, 1);
                field512 = field487.field2033[0] & 0xFF;
                var0--;
            }
            if (field512 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field652.method1411(field487.field2033, 0, 2);
                field487.field2029 = 0;
                field512 = field487.method2496();
                var0 -= 2;
            }
            if (var0 < field512) {
                return false;
            }
            field487.field2029 = 0;
            Statics.field652.method1411(field487.field2033, 0, field512);
            field514 = 0;
            field519 = field518;
            field518 = field517;
            field517 = field466;
            if (field466 == 30) {
                field654 = 1;
                field658 = field650;
                field466 = -1;
                return true;
            }
            if (field466 == 122) {
                int var1 = field487.method2617();
                int var2 = field487.method2517();
                int var3 = field487.method2527();
                class4 var4 = (class4) field628.method3311((long) var1);
                if (var4 != null) {
                    method1541(var4, var4.field54 != var3);
                }
                method556(var1, var3, var2);
                field466 = -1;
                return true;
            }
            if (field466 == 46) {
                boolean var5 = field487.method2516() == 1;
                int var6 = field487.method2536();
                class159 var7 = class159.method1393(var6);
                if (var7.field2602 != var5) {
                    var7.field2602 = var5;
                    method1335(var7);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 195) {
                int var8 = field487.method2617();
                class159 var9 = class159.method1393(var8);
                var9.field2703 = 3;
                var9.field2623 = Statics.field1271.field31.method3241();
                method1335(var9);
                field466 = -1;
                return true;
            }
            if (field466 == 86) {
                int var10 = field487.method2536();
                Statics.field79 = Statics.field441.method1518(var10);
                field466 = -1;
                return true;
            }
            if (field466 == 189) {
                int var11 = field487.method2536();
                int var12 = field487.method2496();
                int var13 = var12 >> 10 & 0x1F;
                int var14 = var12 >> 5 & 0x1F;
                int var15 = var12 & 0x1F;
                int var16 = (var15 << 3) + (var13 << 19) + (var14 << 11);
                class159 var17 = class159.method1393(var11);
                if (var17.field2698 != var16) {
                    var17.field2698 = var16;
                    method1335(var17);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 119) {
                field487.field2029 += 28;
                if (field487.method2542()) {
                    class82.method43(field487, field487.field2029 - 28);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 193) {
                Statics.field129 = field487.method2516();
                Statics.field1982 = field487.method2494();
                for (int var18 = Statics.field1982; var18 < Statics.field1982 + 8; var18++) {
                    for (int var19 = Statics.field129; var19 < Statics.field129 + 8; var19++) {
                        if (field715[Statics.field1467][var18][var19] != null) {
                            field715[Statics.field1467][var18][var19] = null;
                            method914(var18, var19);
                        }
                    }
                }
                for (class22 var20 = (class22) field602.method3325(); var20 != null; var20 = (class22) field602.method3333()) {
                    if (var20.field334 >= Statics.field1982 && var20.field334 < Statics.field1982 + 8 && var20.field346 >= Statics.field129 && var20.field346 < Statics.field129 + 8 && Statics.field1467 == var20.field332) {
                        var20.field335 = 0;
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 59) {
                int var21 = field487.method2526();
                if (var21 == 65535) {
                    var21 = -1;
                }
                Statics.method830(var21);
                field466 = -1;
                return true;
            }
            if (field466 == 133) {
                int var22 = field487.method2527();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field487.method2530();
                method623(var22, var23);
                field466 = -1;
                return true;
            }
            if (field466 == 234 || field466 == 71 || field466 == 245 || field466 == 176 || field466 == 0 || field466 == 81 || field466 == 241 || field466 == 44 || field466 == 97 || field466 == 115 || field466 == 142) {
                method1451();
                field466 = -1;
                return true;
            }
            if (field466 == 75) {
                String var24 = field487.method2502();
                long var25 = field487.method2647();
                long var27 = (long) field487.method2496();
                long var29 = (long) field487.method2498();
                int var31 = field487.method2494();
                long var32 = (var27 << 32) + var29;
                boolean var34 = false;
                for (int var35 = 0; var35 < 100; var35++) {
                    if (field611[var35] == var32) {
                        var34 = true;
                        break;
                    }
                }
                if (var31 <= 1 && method59(var24)) {
                    var34 = true;
                }
                if (!var34 && field586 == 0) {
                    field611[field687] = var32;
                    field687 = (field687 + 1) % 100;
                    String var36 = class185.method3425(class148.method1628(class184.method151(field487)));
                    if (var31 == 2 || var31 == 3) {
                        method35(9, class2.method2415(1) + var24, var36, Statics.method711(var25));
                    } else if (var31 == 1) {
                        method35(9, class2.method2415(0) + var24, var36, Statics.method711(var25));
                    } else {
                        method35(9, var24, var36, Statics.method711(var25));
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 207) {
                for (int var37 = 0; var37 < class160.field2709.length; var37++) {
                    if (class160.field2710[var37] != class160.field2709[var37]) {
                        class160.field2709[var37] = class160.field2710[var37];
                        method554(var37);
                        field651[++field625 - 1 & 0x1F] = var37;
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 146) {
                class182.method2402(field487, field512);
                field466 = -1;
                return true;
            }
            if (field466 == 160) {
                method580();
                int var38 = field487.method2517();
                int var39 = field487.method2512();
                int var40 = field487.method2517();
                field607[var38] = var39;
                field600[var38] = var40;
                field606[var38] = 1;
                for (int var41 = 0; var41 < 98; var41++) {
                    if (var39 >= class131.field2058[var41]) {
                        field606[var38] = var41 + 2;
                    }
                }
                field655[++field656 - 1 & 0x1F] = var38;
                field466 = -1;
                return true;
            }
            if (field466 == 165) {
                int var42 = field487.method2517();
                int var43 = field487.method2494();
                int var44 = field487.method2517();
                Statics.field1467 = var44 >> 1;
                Statics.field1271.method248(var43, var42, (var44 & 0x1) == 1);
                field466 = -1;
                return true;
            }
            if (field466 == 180) {
                field595 = 0;
                field590 = 0;
                field487.method2347();
                int var45 = field487.method2352(8);
                if (var45 < field506) {
                    for (int var46 = var45; var46 < field506; var46++) {
                        field612[++field595 - 1] = field575[var46];
                    }
                }
                if (var45 > field506) {
                    throw new RuntimeException("");
                }
                field506 = 0;
                for (int var47 = 0; var47 < var45; var47++) {
                    int var48 = field575[var47];
                    class25 var49 = field505[var48];
                    int var50 = field487.method2352(1);
                    if (var50 == 0) {
                        field575[++field506 - 1] = var48;
                        var49.field434 = field476;
                    } else {
                        int var51 = field487.method2352(2);
                        if (var51 == 0) {
                            field575[++field506 - 1] = var48;
                            var49.field434 = field476;
                            field725[++field590 - 1] = var48;
                        } else if (var51 == 1) {
                            field575[++field506 - 1] = var48;
                            var49.field434 = field476;
                            int var52 = field487.method2352(3);
                            var49.method243(var52, false);
                            int var53 = field487.method2352(1);
                            if (var53 == 1) {
                                field725[++field590 - 1] = var48;
                            }
                        } else if (var51 == 2) {
                            field575[++field506 - 1] = var48;
                            var49.field434 = field476;
                            int var54 = field487.method2352(3);
                            var49.method243(var54, true);
                            int var55 = field487.method2352(3);
                            var49.method243(var55, true);
                            int var56 = field487.method2352(1);
                            if (var56 == 1) {
                                field725[++field590 - 1] = var48;
                            }
                        } else if (var51 == 3) {
                            field612[++field595 - 1] = var48;
                        }
                    }
                }
                while (field487.method2350(field512) >= 27) {
                    int var57 = field487.method2352(15);
                    if (var57 == 32767) {
                        break;
                    }
                    boolean var58 = false;
                    if (field505[var57] == null) {
                        field505[var57] = new class25();
                        var58 = true;
                    }
                    class25 var59 = field505[var57];
                    field575[++field506 - 1] = var57;
                    var59.field434 = field476;
                    int var60 = field487.method2352(1);
                    int var61 = field567[field487.method2352(3)];
                    if (var58) {
                        var59.field445 = var59.field399 = var61;
                    }
                    int var62 = field487.method2352(5);
                    if (var62 > 15) {
                        var62 -= 32;
                    }
                    var59.field376 = class31.method843(field487.method2352(14));
                    int var63 = field487.method2352(5);
                    if (var63 > 15) {
                        var63 -= 32;
                    }
                    int var64 = field487.method2352(1);
                    if (var64 == 1) {
                        field725[++field590 - 1] = var57;
                    }
                    var59.field416 = var59.field376.field766;
                    var59.field447 = var59.field376.field795;
                    if (var59.field447 == 0) {
                        var59.field399 = 0;
                    }
                    var59.field405 = var59.field376.field778;
                    var59.field406 = var59.field376.field779;
                    var59.field407 = var59.field376.field780;
                    var59.field408 = var59.field376.field781;
                    var59.field402 = var59.field376.field799;
                    var59.field403 = var59.field376.field788;
                    var59.field404 = var59.field376.field777;
                    var59.method248(Statics.field1271.field449[0] + var63, Statics.field1271.field460[0] + var62, var60 == 1);
                }
                field487.method2349();
                method2910();
                for (int var65 = 0; var65 < field595; var65++) {
                    int var66 = field612[var65];
                    if (field476 != field505[var66].field434) {
                        field505[var66].field376 = null;
                        field505[var66] = null;
                    }
                }
                if (field512 != field487.field2029) {
                    throw new RuntimeException(field487.field2029 + class2.field18 + field512);
                }
                for (int var67 = 0; var67 < field506; var67++) {
                    if (field505[field575[var67]] == null) {
                        throw new RuntimeException(var67 + class2.field18 + field506);
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 187) {
                Statics.field129 = field487.method2516();
                Statics.field1982 = field487.method2518();
                field466 = -1;
                return true;
            }
            if (field466 == 89) {
                method1697();
                field466 = -1;
                return false;
            }
            if (field466 == 104) {
                int var68 = field512 + field487.field2029;
                int var69 = field487.method2496();
                int var70 = field487.method2496();
                if (field627 != var69) {
                    field627 = var69;
                    method1879(field627);
                    Statics.method2757(field627);
                    for (int var71 = 0; var71 < 100; var71++) {
                        field663[var71] = true;
                    }
                }
                while (var70-- > 0) {
                    int var72 = field487.method2617();
                    int var73 = field487.method2496();
                    int var74 = field487.method2494();
                    class4 var75 = (class4) field628.method3311((long) var72);
                    if (var75 != null && var75.field54 != var73) {
                        method1541(var75, true);
                        var75 = null;
                    }
                    if (var75 == null) {
                        var75 = method556(var72, var73, var74);
                    }
                    var75.field52 = true;
                }
                for (class4 var76 = (class4) field628.method3312(); var76 != null; var76 = (class4) field628.method3313()) {
                    if (var76.field52) {
                        var76.field52 = false;
                    } else {
                        method1541(var76, true);
                    }
                }
                field480 = new class175(512);
                while (field487.field2029 < var68) {
                    int var77 = field487.method2617();
                    int var78 = field487.method2496();
                    int var79 = field487.method2496();
                    int var80 = field487.method2617();
                    for (int var81 = var78; var81 <= var79; var81++) {
                        long var82 = ((long) var77 << 32) + (long) var81;
                        field480.method3310(new class171(var80), var82);
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 93) {
                int var84 = field487.method2617();
                int var85 = field487.method2528();
                class159 var86 = class159.method1393(var84);
                if (var86.field2626 != var85 || var85 == -1) {
                    var86.field2626 = var85;
                    var86.field2696 = 0;
                    var86.field2697 = 0;
                    method1335(var86);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 108) {
                field701 = field487.method2494();
                field466 = -1;
                return true;
            }
            if (field466 == 147) {
                method1409();
                field466 = -1;
                return true;
            }
            if (field466 == 132) {
                field684 = field487.method2494();
                field685 = field487.method2494();
                field466 = -1;
                return true;
            }
            if (field466 == 243) {
                if (field627 != -1) {
                    method563(field627, 0);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 110) {
                int var87 = field487.method2536();
                int var88 = field487.method2536();
                int var89 = field487.method2526();
                if (var89 == 65535) {
                    var89 = -1;
                }
                int var90 = field487.method2525();
                if (var90 == 65535) {
                    var90 = -1;
                }
                for (int var91 = var90; var91 <= var89; var91++) {
                    long var92 = ((long) var87 << 32) + (long) var91;
                    class179 var94 = field480.method3311(var92);
                    if (var94 != null) {
                        var94.method3360();
                    }
                    field480.method3310(new class171(var88), var92);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 233) {
                int var95 = field487.method2528();
                int var96 = field487.method2528();
                int var97 = field487.method2617();
                class159 var98 = class159.method1393(var97);
                int var99 = var98.field2587 + var95;
                int var100 = var98.field2598 + var96;
                if (var98.field2606 != var99 || var98.field2690 != var100) {
                    var98.field2606 = var99;
                    var98.field2690 = var100;
                    method1335(var98);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 230) {
                method33(true);
                field466 = -1;
                return true;
            }
            if (field466 == 22) {
                String var101 = field487.method2502();
                int var102 = field487.method2496();
                byte var103 = field487.method2604();
                boolean var104 = false;
                if (var103 == -128) {
                    var104 = true;
                }
                if (var104) {
                    if (Statics.field934 == 0) {
                        field466 = -1;
                        return true;
                    }
                    boolean var105 = false;
                    int var106;
                    for (var106 = 0; var106 < Statics.field934 && (!Statics.field1930[var106].field117.equals(var101) || Statics.field1930[var106].field108 != var102); var106++) {
                    }
                    if (var106 < Statics.field934) {
                        while (var106 < Statics.field934 - 1) {
                            Statics.field1930[var106] = Statics.field1930[var106 + 1];
                            var106++;
                        }
                        Statics.field934--;
                        Statics.field1930[Statics.field934] = null;
                    }
                } else {
                    field487.method2502();
                    class8 var107 = new class8();
                    var107.field117 = var101;
                    var107.field107 = class149.method2767(var107.field117, Statics.field513);
                    var107.field108 = var102;
                    var107.field112 = var103;
                    int var108;
                    for (var108 = Statics.field934 - 1; var108 >= 0; var108--) {
                        int var109 = Statics.field1930[var108].field107.compareTo(var107.field117);
                        if (var109 == 0) {
                            Statics.field1930[var108].field108 = var102;
                            Statics.field1930[var108].field112 = var103;
                            if (var101.equals(Statics.field1271.field33)) {
                                Statics.field8 = var103;
                            }
                            field659 = field650;
                            field466 = -1;
                            return true;
                        }
                        if (var109 < 0) {
                            break;
                        }
                    }
                    if (Statics.field934 >= Statics.field1930.length) {
                        field466 = -1;
                        return true;
                    }
                    for (int var110 = Statics.field934 - 1; var110 > var108; var110--) {
                        Statics.field1930[var110 + 1] = Statics.field1930[var110];
                    }
                    if (Statics.field934 == 0) {
                        Statics.field1930 = new class8[100];
                    }
                    Statics.field1930[var108 + 1] = var107;
                    Statics.field934++;
                    if (var101.equals(Statics.field1271.field33)) {
                        Statics.field8 = var103;
                    }
                }
                field659 = field650;
                field466 = -1;
                return true;
            }
            if (field466 == 212) {
                String var111 = field487.method2502();
                long var112 = (long) field487.method2496();
                long var114 = (long) field487.method2498();
                int var116 = field487.method2494();
                long var117 = (var112 << 32) + var114;
                boolean var119 = false;
                for (int var120 = 0; var120 < 100; var120++) {
                    if (field611[var120] == var117) {
                        var119 = true;
                        break;
                    }
                }
                if (method59(var111)) {
                    var119 = true;
                }
                if (!var119 && field586 == 0) {
                    field611[field687] = var117;
                    field687 = (field687 + 1) % 100;
                    String var121 = class185.method3425(class148.method1628(class184.method151(field487)));
                    if (var116 == 2 || var116 == 3) {
                        method1399(7, class2.method2415(1) + var111, var121);
                    } else if (var116 == 1) {
                        method1399(7, class2.method2415(0) + var111, var121);
                    } else {
                        method1399(3, var111, var121);
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 219) {
                field532 = true;
                Statics.field136 = field487.method2494();
                Statics.field360 = field487.method2494();
                Statics.field811 = field487.method2496();
                Statics.field21 = field487.method2494();
                Statics.field443 = field487.method2494();
                if (Statics.field443 >= 100) {
                    int var122 = Statics.field136 * 128 + 64;
                    int var123 = Statics.field360 * 128 + 64;
                    int var124 = method2979(var122, var123, Statics.field1467) - Statics.field811;
                    int var125 = var122 - Statics.field68;
                    int var126 = var124 - Statics.field1835;
                    int var127 = var123 - Statics.field258;
                    int var128 = (int) Math.sqrt((double) (var125 * var125 + var127 * var127));
                    Statics.field1472 = (int) (Math.atan2((double) var126, (double) var128) * 325.949D) & 0x7FF;
                    Statics.field1304 = (int) (Math.atan2((double) var125, (double) var127) * -325.949D) & 0x7FF;
                    if (Statics.field1472 < 128) {
                        Statics.field1472 = 128;
                    }
                    if (Statics.field1472 > 383) {
                        Statics.field1472 = 383;
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 223) {
                int var129 = field487.method2527();
                int var130 = field487.method2525();
                int var131 = field487.method2617();
                class159 var132 = class159.method1393(var131);
                var132.field2634 = (var129 << 16) + var130;
                field466 = -1;
                return true;
            }
            if (field466 == 162) {
                field532 = false;
                for (int var133 = 0; var133 < 5; var133++) {
                    field601[var133] = false;
                }
                field466 = -1;
                return true;
            }
            if (field466 == 150) {
                while (field487.field2029 < field512) {
                    boolean var134 = field487.method2494() == 1;
                    String var135 = field487.method2502();
                    String var136 = field487.method2502();
                    int var137 = field487.method2496();
                    int var138 = field487.method2494();
                    int var139 = field487.method2494();
                    boolean var140 = (var139 & 0x2) != 0;
                    boolean var141 = (var139 & 0x1) != 0;
                    if (var137 > 0) {
                        field487.method2502();
                        field487.method2494();
                        field487.method2617();
                    }
                    field487.method2502();
                    for (int var142 = 0; var142 < field719; var142++) {
                        class23 var143 = field721[var142];
                        if (var134) {
                            if (var136.equals(var143.field356)) {
                                var143.field356 = var135;
                                var143.field349 = var136;
                                var135 = null;
                                break;
                            }
                        } else if (var135.equals(var143.field356)) {
                            if (var143.field350 != var137) {
                                boolean var144 = true;
                                for (class28 var145 = (class28) field722.method3297(); var145 != null; var145 = (class28) field722.method3299()) {
                                    if (var145.field732.equals(var135)) {
                                        if (var137 != 0 && var145.field736 == 0) {
                                            var145.method3354();
                                            var144 = false;
                                        } else if (var137 == 0 && var145.field736 != 0) {
                                            var145.method3354();
                                            var144 = false;
                                        }
                                    }
                                }
                                if (var144) {
                                    field722.method3295(new class28(var135, var137));
                                }
                                var143.field350 = var137;
                            }
                            var143.field349 = var136;
                            var143.field358 = var138;
                            var143.field352 = var140;
                            var143.field353 = var141;
                            var135 = null;
                            break;
                        }
                    }
                    if (var135 != null && field719 < 400) {
                        class23 var146 = new class23();
                        field721[field719] = var146;
                        var146.field356 = var135;
                        var146.field349 = var136;
                        var146.field350 = var137;
                        var146.field358 = var138;
                        var146.field352 = var140;
                        var146.field353 = var141;
                        field719++;
                    }
                }
                field654 = 2;
                field658 = field650;
                boolean var147 = false;
                int var148 = field719;
                while (var148 > 0) {
                    boolean var149 = true;
                    var148--;
                    for (int var150 = 0; var150 < var148; var150++) {
                        boolean var151 = false;
                        class23 var152 = field721[var150];
                        class23 var153 = field721[var150 + 1];
                        if (field635 != var152.field350 && field635 == var153.field350) {
                            var151 = true;
                        }
                        if (!var151 && var152.field350 == 0 && var153.field350 != 0) {
                            var151 = true;
                        }
                        if (!var151 && !var152.field352 && var153.field352) {
                            var151 = true;
                        }
                        if (!var151 && !var152.field353 && var153.field353) {
                            var151 = true;
                        }
                        if (var151) {
                            class23 var154 = field721[var150];
                            field721[var150] = field721[var150 + 1];
                            field721[var150 + 1] = var154;
                            var149 = false;
                        }
                    }
                    if (var149) {
                        break;
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 251) {
                int var155 = field487.method2536();
                int var156 = field487.method2526();
                class159 var157 = class159.method1393(var155);
                if (var157 != null && var157.field2592 == 0) {
                    if (var156 > var157.field2620 - var157.field2585) {
                        var156 = var157.field2620 - var157.field2585;
                    }
                    if (var156 < 0) {
                        var156 = 0;
                    }
                    if (var157.field2604 != var156) {
                        var157.field2604 = var156;
                        method1335(var157);
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 255) {
                String var158 = field487.method2502();
                if (var158.endsWith(":tradereq:")) {
                    String var159 = var158.substring(0, var158.indexOf(":"));
                    boolean var160 = false;
                    if (method59(var159)) {
                        var160 = true;
                    }
                    if (!var160 && field586 == 0) {
                        method1399(4, var159, class135.field2234);
                    }
                } else if (var158.endsWith(":duelreq:")) {
                    String var161 = var158.substring(0, var158.indexOf(":"));
                    boolean var162 = false;
                    if (method59(var161)) {
                        var162 = true;
                    }
                    if (!var162 && field586 == 0) {
                        method1399(8, var161, class135.field2235);
                    }
                } else if (var158.endsWith(":chalreq:")) {
                    String var163 = var158.substring(0, var158.indexOf(":"));
                    boolean var164 = false;
                    if (method59(var163)) {
                        var164 = true;
                    }
                    if (!var164 && field586 == 0) {
                        String var165 = var158.substring(var158.indexOf(":") + 1, var158.length() - 9);
                        method1399(8, var163, var165);
                    }
                } else if (var158.endsWith(":assistreq:")) {
                    String var166 = var158.substring(0, var158.indexOf(":"));
                    boolean var167 = false;
                    if (method59(var166)) {
                        var167 = true;
                    }
                    if (!var167 && field586 == 0) {
                        method1399(10, var166, "");
                    }
                } else if (var158.endsWith(":clan:")) {
                    String var168 = var158.substring(0, var158.indexOf(":clan:"));
                    method1399(11, "", var168);
                } else if (var158.endsWith(":trade:")) {
                    String var169 = var158.substring(0, var158.indexOf(":trade:"));
                    if (field586 == 0) {
                        method1399(12, "", var169);
                    }
                } else if (var158.endsWith(":assist:")) {
                    String var170 = var158.substring(0, var158.indexOf(":assist:"));
                    if (field586 == 0) {
                        method1399(13, "", var170);
                    }
                } else {
                    method1399(0, "", var158);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 55) {
                method33(false);
                field466 = -1;
                return true;
            }
            if (field466 == 60) {
                int var171 = field487.method2527();
                field627 = var171;
                method1879(var171);
                Statics.method2757(field627);
                for (int var172 = 0; var172 < 100; var172++) {
                    field663[var172] = true;
                }
                field466 = -1;
                return true;
            }
            if (field466 == 244) {
                int var173 = field487.method2617();
                int var174 = field487.method2496();
                if (var173 < -70000) {
                    var174 += 32768;
                }
                class159 var175;
                if (var173 >= 0) {
                    var175 = class159.method1393(var173);
                } else {
                    var175 = null;
                }
                if (var175 != null) {
                    for (int var176 = 0; var176 < var175.field2692.length; var176++) {
                        var175.field2692[var176] = 0;
                        var175.field2693[var176] = 0;
                    }
                }
                class19.method2148(var174);
                int var177 = field487.method2496();
                for (int var178 = 0; var178 < var177; var178++) {
                    int var179 = field487.method2496();
                    int var180 = field487.method2517();
                    if (var180 == 255) {
                        var180 = field487.method2536();
                    }
                    if (var175 != null && var178 < var175.field2692.length) {
                        var175.field2692[var178] = var179;
                        var175.field2693[var178] = var180;
                    }
                    class19.method755(var174, var178, var179 - 1, var180);
                }
                if (var175 != null) {
                    method1335(var175);
                }
                method580();
                field529[++field564 - 1 & 0x1F] = var174 & 0x7FFF;
                field466 = -1;
                return true;
            }
            if (field466 == 198) {
                int var181 = field487.method2617();
                int var182 = field487.method2496();
                if (var181 < -70000) {
                    var182 += 32768;
                }
                class159 var183;
                if (var181 >= 0) {
                    var183 = class159.method1393(var181);
                } else {
                    var183 = null;
                }
                while (field487.field2029 < field512) {
                    int var184 = field487.method2507();
                    int var185 = field487.method2496();
                    int var186 = 0;
                    if (var185 != 0) {
                        var186 = field487.method2494();
                        if (var186 == 255) {
                            var186 = field487.method2617();
                        }
                    }
                    if (var183 != null && var184 >= 0 && var184 < var183.field2692.length) {
                        var183.field2692[var184] = var185;
                        var183.field2693[var184] = var186;
                    }
                    class19.method755(var182, var184, var185 - 1, var186);
                }
                if (var183 != null) {
                    method1335(var183);
                }
                method580();
                field529[++field564 - 1 & 0x1F] = var182 & 0x7FFF;
                field466 = -1;
                return true;
            }
            if (field466 == 74) {
                int var187 = field487.method2526();
                if (var187 == 65535) {
                    var187 = -1;
                }
                int var188 = field487.method2536();
                int var189 = field487.method2617();
                class159 var190 = class159.method1393(var189);
                if (var190.field2589) {
                    var190.field2694 = var187;
                    var190.field2695 = var188;
                    class40 var192 = class40.method1554(var187);
                    var190.field2630 = var192.field976;
                    var190.field2631 = var192.field985;
                    var190.field2632 = var192.field984;
                    var190.field2628 = var192.field982;
                    var190.field2629 = var192.field986;
                    var190.field2633 = var192.field981;
                    if (var190.field2599 > 0) {
                        var190.field2633 = var190.field2633 * 32 / var190.field2599;
                    }
                    method1335(var190);
                } else if (var187 == -1) {
                    var190.field2703 = 0;
                    field466 = -1;
                    return true;
                } else {
                    class40 var191 = class40.method1554(var187);
                    var190.field2703 = 4;
                    var190.field2623 = var187;
                    var190.field2630 = var191.field976;
                    var190.field2631 = var191.field985;
                    var190.field2633 = var191.field981 * 100 / var188;
                    method1335(var190);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 222) {
                String var193 = field487.method2502();
                Object[] var194 = new Object[var193.length() + 1];
                for (int var195 = var193.length() - 1; var195 >= 0; var195--) {
                    if (var193.charAt(var195) == 's') {
                        var194[var195 + 1] = field487.method2502();
                    } else {
                        var194[var195 + 1] = Integer.valueOf(field487.method2617());
                    }
                }
                var194[0] = Integer.valueOf(field487.method2617());
                class1 var196 = new class1();
                var196.field12 = var194;
                class26.method1603(var196);
                field466 = -1;
                return true;
            }
            if (field466 == 34) {
                field545 = field487.method2494();
                if (field545 == 1) {
                    field486 = field487.method2496();
                }
                if (field545 >= 2 && field545 <= 6) {
                    if (field545 == 2) {
                        field668 = 64;
                        field492 = 64;
                    }
                    if (field545 == 3) {
                        field668 = 0;
                        field492 = 64;
                    }
                    if (field545 == 4) {
                        field668 = 128;
                        field492 = 64;
                    }
                    if (field545 == 5) {
                        field668 = 64;
                        field492 = 0;
                    }
                    if (field545 == 6) {
                        field668 = 64;
                        field492 = 128;
                    }
                    field545 = 2;
                    field488 = field487.method2496();
                    field688 = field487.method2496();
                    field693 = field487.method2494();
                }
                if (field545 == 10) {
                    field615 = field487.method2496();
                }
                field466 = -1;
                return true;
            }
            if (field466 == 248) {
                while (field487.field2029 < field512) {
                    int var197 = field487.method2494();
                    boolean var198 = (var197 & 0x1) == 1;
                    String var199 = field487.method2502();
                    String var200 = field487.method2502();
                    field487.method2502();
                    for (int var201 = 0; var201 < field533; var201++) {
                        class11 var202 = field724[var201];
                        if (var198) {
                            if (var200.equals(var202.field181)) {
                                var202.field181 = var199;
                                var202.field176 = var200;
                                var199 = null;
                                break;
                            }
                        } else if (var199.equals(var202.field181)) {
                            var202.field181 = var199;
                            var202.field176 = var200;
                            var199 = null;
                            break;
                        }
                    }
                    if (var199 != null && field533 < 400) {
                        class11 var203 = new class11();
                        field724[field533] = var203;
                        var203.field181 = var199;
                        var203.field176 = var200;
                        field533++;
                    }
                }
                field658 = field650;
                field466 = -1;
                return true;
            }
            if (field466 == 8) {
                int var204 = field487.method2617();
                int var205 = field487.method2526();
                class159 var206 = class159.method1393(var204);
                if (var206.field2703 != 1 || var206.field2623 != var205) {
                    var206.field2703 = 1;
                    var206.field2623 = var205;
                    method1335(var206);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 175) {
                String var207 = field487.method2502();
                String var208 = class185.method3425(class148.method1628(class184.method151(field487)));
                method1399(6, var207, var208);
                field466 = -1;
                return true;
            }
            if (field466 == 240) {
                field532 = true;
                Statics.field70 = field487.method2494();
                Statics.field1830 = field487.method2494();
                Statics.field55 = field487.method2496();
                Statics.field1933 = field487.method2494();
                Statics.field2334 = field487.method2494();
                if (Statics.field2334 >= 100) {
                    Statics.field68 = Statics.field70 * 128 + 64;
                    Statics.field258 = Statics.field1830 * 128 + 64;
                    Statics.field1835 = method2979(Statics.field68, Statics.field258, Statics.field1467) - Statics.field55;
                }
                field466 = -1;
                return true;
            }
            if (field466 == 196) {
                int var209 = field487.method2617();
                class4 var210 = (class4) field628.method3311((long) var209);
                if (var210 != null) {
                    method1541(var210, true);
                }
                if (field623 != null) {
                    method1335(field623);
                    field623 = null;
                }
                field466 = -1;
                return true;
            }
            if (field466 == 2) {
                field699 = field487.method2494();
                if (field699 == 255) {
                    field699 = 0;
                }
                field700 = field487.method2494();
                if (field700 == 255) {
                    field700 = 0;
                }
                field466 = -1;
                return true;
            }
            if (field466 == 21) {
                for (int var211 = 0; var211 < field587.length; var211++) {
                    if (field587[var211] != null) {
                        field587[var211].field456 = -1;
                    }
                }
                for (int var212 = 0; var212 < field505.length; var212++) {
                    if (field505[var212] != null) {
                        field505[var212].field456 = -1;
                    }
                }
                field466 = -1;
                return true;
            }
            if (field466 == 69) {
                int var213 = field487.method2527();
                int var214 = field487.method2534();
                class160.field2710[var213] = var214;
                if (class160.field2709[var213] != var214) {
                    class160.field2709[var213] = var214;
                    method554(var213);
                }
                field651[++field625 - 1 & 0x1F] = var213;
                field466 = -1;
                return true;
            }
            if (field466 == 95) {
                Statics.field129 = field487.method2518();
                Statics.field1982 = field487.method2518();
                while (field487.field2029 < field512) {
                    field466 = field487.method2494();
                    method1451();
                }
                field466 = -1;
                return true;
            }
            if (field466 == 109) {
                method580();
                field548 = field487.method2582();
                field617 = field650;
                field466 = -1;
                return true;
            }
            if (field466 == 173) {
                int var215 = field487.method2494();
                int var216 = field487.method2494();
                String var217 = field487.method2502();
                if (var215 >= 1 && var215 <= 8) {
                    if (var217.equalsIgnoreCase("null")) {
                        var217 = null;
                    }
                    field598[var215 - 1] = var217;
                    field599[var215 - 1] = var216 == 0;
                }
                field466 = -1;
                return true;
            }
            if (field466 == 188) {
                int var218 = field487.method2527();
                int var219 = field487.method2496();
                int var220 = field487.method2534();
                int var221 = field487.method2527();
                class159 var222 = class159.method1393(var220);
                if (var222.field2630 != var218 || var222.field2631 != var219 || var222.field2633 != var221) {
                    var222.field2630 = var218;
                    var222.field2631 = var219;
                    var222.field2633 = var221;
                    method1335(var222);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 116) {
                Statics.field239 = class138.method1568(field487.method2494());
                field466 = -1;
                return true;
            }
            if (field466 == 129) {
                field659 = field650;
                if (field512 == 0) {
                    field692 = null;
                    field468 = null;
                    Statics.field934 = 0;
                    Statics.field1930 = null;
                    field466 = -1;
                    return true;
                }
                field468 = field487.method2502();
                long var223 = field487.method2647();
                field692 = class147.method1440(var223);
                Statics.field2472 = field487.method2604();
                int var225 = field487.method2494();
                if (var225 == 255) {
                    field466 = -1;
                    return true;
                }
                Statics.field934 = var225;
                class8[] var226 = new class8[100];
                for (int var227 = 0; var227 < Statics.field934; var227++) {
                    var226[var227] = new class8();
                    var226[var227].field117 = field487.method2502();
                    var226[var227].field107 = class149.method2767(var226[var227].field117, Statics.field513);
                    var226[var227].field108 = field487.method2496();
                    var226[var227].field112 = field487.method2604();
                    field487.method2502();
                    if (var226[var227].field117.equals(Statics.field1271.field33)) {
                        Statics.field8 = var226[var227].field112;
                    }
                }
                boolean var228 = false;
                int var229 = Statics.field934;
                while (var229 > 0) {
                    boolean var230 = true;
                    var229--;
                    for (int var231 = 0; var231 < var229; var231++) {
                        if (var226[var231].field107.compareTo(var226[var231 + 1].field107) > 0) {
                            class8 var232 = var226[var231];
                            var226[var231] = var226[var231 + 1];
                            var226[var231 + 1] = var232;
                            var230 = false;
                        }
                    }
                    if (var230) {
                        break;
                    }
                }
                Statics.field1930 = var226;
                field466 = -1;
                return true;
            }
            if (field466 == 103) {
                String var233 = field487.method2502();
                int var234 = field487.method2536();
                class159 var235 = class159.method1393(var234);
                if (!var233.equals(var235.field2637)) {
                    var235.field2637 = var233;
                    method1335(var235);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 66) {
                int var236 = field487.method2526();
                class19 var237 = (class19) class19.field274.method3311((long) var236);
                if (var237 != null) {
                    var237.method3360();
                }
                field529[++field564 - 1 & 0x1F] = var236 & 0x7FFF;
                field466 = -1;
                return true;
            }
            if (field466 == 111) {
                int var238 = field487.method2494();
                int var239 = field487.method2494();
                int var240 = field487.method2494();
                int var241 = field487.method2494();
                field601[var238] = true;
                field507[var238] = var239;
                field633[var238] = var240;
                field717[var238] = var241;
                field718[var238] = 0;
                field466 = -1;
                return true;
            }
            if (field466 == 206) {
                method580();
                field727 = field487.method2494();
                field617 = field650;
                field466 = -1;
                return true;
            }
            if (field466 == 121) {
                for (int var242 = 0; var242 < Statics.field1023; var242++) {
                    class42 var243 = class42.method157(var242);
                    if (var243 != null && var243.field1025 == 0) {
                        class160.field2710[var242] = 0;
                        class160.field2709[var242] = 0;
                    }
                }
                method580();
                field625 += 32;
                field466 = -1;
                return true;
            }
            if (field466 == 6) {
                field484 = field487.method2525() * 30;
                field617 = field650;
                field466 = -1;
                return true;
            }
            if (field466 == 83) {
                int var244 = field487.method2536();
                class159 var245 = class159.method1393(var244);
                for (int var246 = 0; var246 < var245.field2692.length; var246++) {
                    var245.field2692[var246] = -1;
                    var245.field2692[var246] = 0;
                }
                method1335(var245);
                field466 = -1;
                return true;
            }
            if (field466 == 114) {
                int var247 = field487.method2496();
                int var248 = field487.method2494();
                int var249 = field487.method2496();
                method224(var247, var248, var249);
                field466 = -1;
                return true;
            }
            if (field466 == 149) {
                int var250 = field487.method2496();
                int var251 = field487.method2512();
                class159 var252 = class159.method1393(var251);
                if (var252.field2703 != 2 || var252.field2623 != var250) {
                    var252.field2703 = 2;
                    var252.field2623 = var250;
                    method1335(var252);
                }
                field466 = -1;
                return true;
            }
            if (field466 == 113) {
                int var253 = field487.method2527();
                byte var254 = field487.method2521();
                class160.field2710[var253] = var254;
                if (class160.field2709[var253] != var254) {
                    class160.field2709[var253] = var254;
                    method554(var253);
                }
                field651[++field625 - 1 & 0x1F] = var253;
                field466 = -1;
                return true;
            }
            class80.method838("" + field466 + class2.field18 + field518 + class2.field18 + field519 + class2.field18 + field512, (Throwable) null);
            method1697();
        } catch (IOException var259) {
            method242();
        } catch (Exception var260) {
            String var257 = "" + field466 + class2.field18 + field518 + class2.field18 + field519 + class2.field18 + field512 + class2.field18 + (Statics.field1646 + Statics.field1271.field449[0]) + class2.field18 + (Statics.field1269 + Statics.field1271.field460[0]) + class2.field18;
            for (int var258 = 0; var258 < field512 && var258 < 50; var258++) {
                var257 = var257 + field487.field2033[var258] + class2.field18;
            }
            class80.method838(var257, var260);
            method1697();
        }
        return true;
    }

    @ObfuscatedName("bm.bi(I)V")
    public static final void method1451() {
        if (field466 == 241) {
            int var0 = field487.method2494();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1982;
            int var2 = (var0 & 0x7) + Statics.field129;
            int var3 = field487.method2525();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class177 var4 = field715[Statics.field1467][var1][var2];
                if (var4 != null) {
                    for (class17 var5 = (class17) var4.method3325(); var5 != null; var5 = (class17) var4.method3333()) {
                        if ((var3 & 0x7FFF) == var5.field256) {
                            var5.method3360();
                            break;
                        }
                    }
                    if (var4.method3325() == null) {
                        field715[Statics.field1467][var1][var2] = null;
                    }
                    method914(var1, var2);
                }
            }
            return;
        }
        if (field466 == 245) {
            int var6 = field487.method2494();
            int var7 = (var6 >> 4 & 0x7) + Statics.field1982;
            int var8 = (var6 & 0x7) + Statics.field129;
            int var9 = field487.method2525();
            int var10 = field487.method2525();
            int var11 = field487.method2518();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field490[var12];
            byte var15 = field487.method2520();
            int var16 = field487.method2496();
            int var17 = field487.method2496();
            byte var18 = field487.method2519();
            byte var19 = field487.method2521();
            byte var20 = field487.method2519();
            class3 var21;
            if (field593 == var10) {
                var21 = Statics.field1271;
            } else {
                var21 = field587[var10];
            }
            if (var21 != null) {
                class32 var22 = class32.method2811(var17);
                int var23;
                int var24;
                if (var13 == 1 || var13 == 3) {
                    var23 = var22.field807;
                    var24 = var22.field822;
                } else {
                    var23 = var22.field822;
                    var24 = var22.field807;
                }
                int var25 = (var23 >> 1) + var7;
                int var26 = (var23 + 1 >> 1) + var7;
                int var27 = (var24 >> 1) + var8;
                int var28 = (var24 + 1 >> 1) + var8;
                int[][] var29 = class9.field119[Statics.field1467];
                int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
                int var31 = (var7 << 7) + (var23 << 6);
                int var32 = (var8 << 7) + (var24 << 6);
                class112 var33 = var22.method677(var12, var13, var29, var31, var30, var32);
                if (var33 != null) {
                    method2913(Statics.field1467, var7, var8, var14, -1, 0, 0, var16 + 1, var9 + 1);
                    var21.field42 = field476 + var16;
                    var21.field38 = field476 + var9;
                    var21.field30 = var33;
                    var21.field39 = var7 * 128 + var23 * 64;
                    var21.field41 = var8 * 128 + var24 * 64;
                    var21.field40 = var30;
                    if (var18 > var15) {
                        byte var34 = var18;
                        var18 = var15;
                        var15 = var34;
                    }
                    if (var19 > var20) {
                        byte var35 = var19;
                        var19 = var20;
                        var20 = var35;
                    }
                    var21.field37 = var7 + var18;
                    var21.field45 = var7 + var15;
                    var21.field44 = var8 + var19;
                    var21.field46 = var8 + var20;
                }
            }
        }
        if (field466 == 115) {
            int var36 = field487.method2517();
            int var37 = var36 >> 2;
            int var38 = var36 & 0x3;
            int var39 = field490[var37];
            int var40 = field487.method2516();
            int var41 = (var40 >> 4 & 0x7) + Statics.field1982;
            int var42 = (var40 & 0x7) + Statics.field129;
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                method2913(Statics.field1467, var41, var42, var39, -1, var37, var38, 0, -1);
            }
        } else if (field466 == 44) {
            int var43 = field487.method2525();
            int var44 = field487.method2517();
            int var45 = (var44 >> 4 & 0x7) + Statics.field1982;
            int var46 = (var44 & 0x7) + Statics.field129;
            int var47 = field487.method2527();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                class17 var48 = new class17();
                var48.field256 = var47;
                var48.field251 = var43;
                if (field715[Statics.field1467][var45][var46] == null) {
                    field715[Statics.field1467][var45][var46] = new class177();
                }
                field715[Statics.field1467][var45][var46].method3332(var48);
                method914(var45, var46);
            }
        } else if (field466 == 0) {
            int var49 = field487.method2494();
            int var50 = (var49 >> 4 & 0x7) + Statics.field1982;
            int var51 = (var49 & 0x7) + Statics.field129;
            int var52 = field487.method2496();
            int var53 = field487.method2494();
            int var54 = field487.method2496();
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                int var55 = var50 * 128 + 64;
                int var56 = var51 * 128 + 64;
                class20 var57 = new class20(var52, Statics.field1467, var55, var56, method2979(var55, var56, Statics.field1467) - var53, var54, field476);
                field648.method3332(var57);
            }
        } else if (field466 == 81) {
            int var58 = field487.method2494();
            int var59 = (var58 >> 4 & 0x7) + Statics.field1982;
            int var60 = (var58 & 0x7) + Statics.field129;
            int var61 = var59 + field487.method2604();
            int var62 = var60 + field487.method2604();
            int var63 = field487.method2582();
            int var64 = field487.method2496();
            int var65 = field487.method2494() * 4;
            int var66 = field487.method2494() * 4;
            int var67 = field487.method2496();
            int var68 = field487.method2496();
            int var69 = field487.method2494();
            int var70 = field487.method2494();
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var64 != 65535) {
                int var71 = var59 * 128 + 64;
                int var72 = var60 * 128 + 64;
                int var73 = var61 * 128 + 64;
                int var74 = var62 * 128 + 64;
                class10 var75 = new class10(var64, Statics.field1467, var71, var72, method2979(var71, var72, Statics.field1467) - var65, field476 + var67, field476 + var68, var69, var70, var63, var66);
                var75.method114(var73, var74, method2979(var73, var74, Statics.field1467) - var66, field476 + var67);
                field585.method3332(var75);
            }
        } else if (field466 == 71) {
            int var76 = field487.method2494();
            int var77 = (var76 >> 4 & 0x7) + Statics.field1982;
            int var78 = (var76 & 0x7) + Statics.field129;
            int var79 = field487.method2496();
            int var80 = field487.method2496();
            int var81 = field487.method2496();
            if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                class177 var82 = field715[Statics.field1467][var77][var78];
                if (var82 != null) {
                    for (class17 var83 = (class17) var82.method3325(); var83 != null; var83 = (class17) var82.method3333()) {
                        if ((var79 & 0x7FFF) == var83.field256 && var83.field251 == var80) {
                            var83.field251 = var81;
                            break;
                        }
                    }
                    method914(var77, var78);
                }
            }
        } else {
            if (field466 == 234) {
                int var84 = field487.method2494();
                int var85 = (var84 >> 4 & 0x7) + Statics.field1982;
                int var86 = (var84 & 0x7) + Statics.field129;
                int var87 = field487.method2496();
                int var88 = field487.method2494();
                int var89 = var88 >> 4 & 0xF;
                int var90 = var88 & 0x7;
                int var91 = field487.method2494();
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    int var92 = var89 + 1;
                    if (Statics.field1271.field449[0] >= var85 - var92 && Statics.field1271.field449[0] <= var85 + var92 && Statics.field1271.field460[0] >= var86 - var92 && Statics.field1271.field460[0] <= var86 + var92 && field706 != 0 && var90 > 0 && field576 < 50) {
                        field708[field576] = var87;
                        field709[field576] = var90;
                        field639[field576] = var91;
                        field712[field576] = null;
                        field530[field576] = (var85 << 16) + (var86 << 8) + var89;
                        field576++;
                    }
                }
            }
            if (field466 == 142) {
                int var93 = field487.method2494();
                int var94 = var93 >> 2;
                int var95 = var93 & 0x3;
                int var96 = field490[var94];
                int var97 = field487.method2517();
                int var98 = (var97 >> 4 & 0x7) + Statics.field1982;
                int var99 = (var97 & 0x7) + Statics.field129;
                int var100 = field487.method2496();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    method2913(Statics.field1467, var98, var99, var96, var100, var94, var95, 0, -1);
                }
            } else if (field466 == 176) {
                int var101 = field487.method2525();
                int var102 = field487.method2496();
                int var103 = field487.method2496();
                int var104 = field487.method2494();
                int var105 = (var104 >> 4 & 0x7) + Statics.field1982;
                int var106 = (var104 & 0x7) + Statics.field129;
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && field593 != var102) {
                    class17 var107 = new class17();
                    var107.field256 = var101;
                    var107.field251 = var103;
                    if (field715[Statics.field1467][var105][var106] == null) {
                        field715[Statics.field1467][var105][var106] = new class177();
                    }
                    field715[Statics.field1467][var105][var106].method3332(var107);
                    method914(var105, var106);
                }
            } else if (field466 == 97) {
                int var108 = field487.method2518();
                int var109 = var108 >> 2;
                int var110 = var108 & 0x3;
                int var111 = field490[var109];
                int var112 = field487.method2494();
                int var113 = (var112 >> 4 & 0x7) + Statics.field1982;
                int var114 = (var112 & 0x7) + Statics.field129;
                int var115 = field487.method2526();
                if (var113 >= 0 && var114 >= 0 && var113 < 103 && var114 < 103) {
                    if (var111 == 0) {
                        class96 var116 = Statics.field802.method1965(Statics.field1467, var113, var114);
                        if (var116 != null) {
                            int var117 = var116.field1625 >> 14 & 0x7FFF;
                            if (var109 == 2) {
                                var116.field1623 = new class14(var117, 2, var110 + 4, Statics.field1467, var113, var114, var115, false, var116.field1623);
                                var116.field1624 = new class14(var117, 2, var110 + 1 & 0x3, Statics.field1467, var113, var114, var115, false, var116.field1624);
                            } else {
                                var116.field1623 = new class14(var117, var109, var110, Statics.field1467, var113, var114, var115, false, var116.field1623);
                            }
                        }
                    }
                    if (var111 == 1) {
                        class108 var118 = Statics.field802.method1912(Statics.field1467, var113, var114);
                        if (var118 != null) {
                            int var119 = var118.field1812 >> 14 & 0x7FFF;
                            if (var109 == 4 || var109 == 5) {
                                var118.field1810 = new class14(var119, 4, var110, Statics.field1467, var113, var114, var115, false, var118.field1810);
                            } else if (var109 == 6) {
                                var118.field1810 = new class14(var119, 4, var110 + 4, Statics.field1467, var113, var114, var115, false, var118.field1810);
                            } else if (var109 == 7) {
                                var118.field1810 = new class14(var119, 4, (var110 + 2 & 0x3) + 4, Statics.field1467, var113, var114, var115, false, var118.field1810);
                            } else if (var109 == 8) {
                                var118.field1810 = new class14(var119, 4, var110 + 4, Statics.field1467, var113, var114, var115, false, var118.field1810);
                                var118.field1818 = new class14(var119, 4, (var110 + 2 & 0x3) + 4, Statics.field1467, var113, var114, var115, false, var118.field1818);
                            }
                        }
                    }
                    if (var111 == 2) {
                        class98 var120 = Statics.field802.method1972(Statics.field1467, var113, var114);
                        if (var109 == 11) {
                            var109 = 10;
                        }
                        if (var120 != null) {
                            var120.field1643 = new class14(var120.field1655 >> 14 & 0x7FFF, var109, var110, Statics.field1467, var113, var114, var115, false, var120.field1643);
                        }
                    }
                    if (var111 == 3) {
                        class107 var121 = Statics.field802.method1914(Statics.field1467, var113, var114);
                        if (var121 != null) {
                            var121.field1796 = new class14(var121.field1798 >> 14 & 0x7FFF, 22, var110, Statics.field1467, var113, var114, var115, false, var121.field1796);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.ba(IIIIIIIIII)V")
    public static final void method2913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field602.method3325(); var10 != null; var10 = (class22) field602.method3333()) {
            if (var10.field332 == arg0 && var10.field334 == arg1 && var10.field346 == arg2 && var10.field333 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field332 = arg0;
            var9.field333 = arg3;
            var9.field334 = arg1;
            var9.field346 = arg2;
            method882(var9);
            field602.method3332(var9);
        }
        var9.field339 = arg4;
        var9.field337 = arg5;
        var9.field340 = arg6;
        var9.field342 = arg7;
        var9.field335 = arg8;
    }

    @ObfuscatedName("cn.bf(I)V")
    public static final void method2067() {
        for (class22 var0 = (class22) field602.method3325(); var0 != null; var0 = (class22) field602.method3333()) {
            if (var0.field335 == -1) {
                var0.field342 = 0;
                method882(var0);
            } else {
                var0.method3360();
            }
        }
    }

    @ObfuscatedName("ab.bd(Lg;I)V")
    public static final void method882(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field333 == 0) {
            var1 = Statics.field802.method1978(arg0.field332, arg0.field334, arg0.field346);
        }
        if (arg0.field333 == 1) {
            var1 = Statics.field802.method1916(arg0.field332, arg0.field334, arg0.field346);
        }
        if (arg0.field333 == 2) {
            var1 = Statics.field802.method1917(arg0.field332, arg0.field334, arg0.field346);
        }
        if (arg0.field333 == 3) {
            var1 = Statics.field802.method1918(arg0.field332, arg0.field334, arg0.field346);
        }
        if (var1 != 0) {
            int var5 = Statics.field802.method1947(arg0.field332, arg0.field334, arg0.field346, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field336 = var2;
        arg0.field344 = var3;
        arg0.field341 = var4;
    }

    @ObfuscatedName("af.bw(B)V")
    public static final void method694() {
        for (class22 var0 = (class22) field602.method3325(); var0 != null; var0 = (class22) field602.method3333()) {
            if (var0.field335 > 0) {
                var0.field335--;
            }
            if (var0.field335 == 0) {
                if (var0.field336 >= 0) {
                    int var1 = var0.field336;
                    int var2 = var0.field344;
                    class32 var3 = class32.method2811(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method680(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2422(var0.field332, var0.field333, var0.field334, var0.field346, var0.field336, var0.field341, var0.field344);
                var0.method3360();
            } else {
                if (var0.field342 > 0) {
                    var0.field342--;
                }
                if (var0.field342 == 0 && var0.field334 >= 1 && var0.field346 >= 1 && var0.field334 <= 102 && var0.field346 <= 102) {
                    if (var0.field339 >= 0) {
                        int var5 = var0.field339;
                        int var6 = var0.field337;
                        class32 var7 = class32.method2811(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method680(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2422(var0.field332, var0.field333, var0.field334, var0.field346, var0.field339, var0.field340, var0.field337);
                    var0.field342 = -1;
                    if (var0.field339 == var0.field336 && var0.field336 == -1) {
                        var0.method3360();
                    } else if (var0.field339 == var0.field336 && var0.field341 == var0.field340 && var0.field344 == var0.field337) {
                        var0.method3360();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.bj(IIIIIIII)V")
    public static final void method2422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field471 && Statics.field1467 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field802.method1978(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field802.method1916(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field802.method1917(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field802.method1918(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field802.method1947(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field802.method1906(arg0, arg2, arg3);
                class32 var15 = class32.method2811(var12);
                if (var15.field824 != 0) {
                    field475[arg0].method2727(arg2, arg3, var13, var14, var15.field825);
                }
            }
            if (arg1 == 1) {
                Statics.field802.method1907(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field802.method1908(arg0, arg2, arg3);
                class32 var16 = class32.method2811(var12);
                if (var16.field822 + arg2 > 103 || var16.field822 + arg3 > 103 || var16.field807 + arg2 > 103 || var16.field807 + arg3 > 103) {
                    return;
                }
                if (var16.field824 != 0) {
                    field475[arg0].method2720(arg2, arg3, var16.field822, var16.field807, var14, var16.field825);
                }
            }
            if (arg1 == 3) {
                Statics.field802.method1909(arg0, arg2, arg3);
                class32 var17 = class32.method2811(var12);
                if (var17.field824 == 1) {
                    field475[arg0].method2730(arg2, arg3);
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
        class9.method2408(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field802, field475[arg0]);
    }

    @ObfuscatedName("ac.by(III)V")
    public static final void method914(int arg0, int arg1) {
        class177 var2 = field715[Statics.field1467][arg0][arg1];
        if (var2 == null) {
            Statics.field802.method1910(Statics.field1467, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3325(); var6 != null; var6 = (class17) var2.method3333()) {
            class40 var7 = class40.method1554(var6.field256);
            long var8 = (long) var7.field988;
            if (var7.field987 == 1) {
                var8 = (long) (var6.field251 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field802.method1910(Statics.field1467, arg0, arg1);
            return;
        }
        var2.method3334(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3325(); var12 != null; var12 = (class17) var2.method3333()) {
            if (var5.field256 != var12.field256) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field256 != var12.field256 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field802.method2050(Statics.field1467, arg0, arg1, method2979(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1467), var5, var13, var10, var11);
    }

    @ObfuscatedName("bp.be(B)V")
    public static final void method1409() {
        field595 = 0;
        field590 = 0;
        field487.method2347();
        int var0 = field487.method2352(1);
        if (var0 != 0) {
            int var1 = field487.method2352(2);
            if (var1 == 0) {
                field725[++field590 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field487.method2352(3);
                Statics.field1271.method243(var2, false);
                int var3 = field487.method2352(1);
                if (var3 == 1) {
                    field725[++field590 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field487.method2352(3);
                Statics.field1271.method243(var4, true);
                int var5 = field487.method2352(3);
                Statics.field1271.method243(var5, true);
                int var6 = field487.method2352(1);
                if (var6 == 1) {
                    field725[++field590 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field487.method2352(1);
                int var8 = field487.method2352(7);
                int var9 = field487.method2352(7);
                int var10 = field487.method2352(1);
                if (var10 == 1) {
                    field725[++field590 - 1] = 2047;
                }
                Statics.field1467 = field487.method2352(2);
                Statics.field1271.method248(var9, var8, var7 == 1);
            }
        }
        int var11 = field487.method2352(8);
        if (var11 < field588) {
            for (int var12 = var11; var12 < field588; var12++) {
                field612[++field595 - 1] = field589[var12];
            }
        }
        if (var11 > field588) {
            throw new RuntimeException("");
        }
        field588 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field589[var13];
            class3 var15 = field587[var14];
            int var16 = field487.method2352(1);
            if (var16 == 0) {
                field589[++field588 - 1] = var14;
                var15.field434 = field476;
            } else {
                int var17 = field487.method2352(2);
                if (var17 == 0) {
                    field589[++field588 - 1] = var14;
                    var15.field434 = field476;
                    field725[++field590 - 1] = var14;
                } else if (var17 == 1) {
                    field589[++field588 - 1] = var14;
                    var15.field434 = field476;
                    int var18 = field487.method2352(3);
                    var15.method243(var18, false);
                    int var19 = field487.method2352(1);
                    if (var19 == 1) {
                        field725[++field590 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field589[++field588 - 1] = var14;
                    var15.field434 = field476;
                    int var20 = field487.method2352(3);
                    var15.method243(var20, true);
                    int var21 = field487.method2352(3);
                    var15.method243(var21, true);
                    int var22 = field487.method2352(1);
                    if (var22 == 1) {
                        field725[++field590 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field612[++field595 - 1] = var14;
                }
            }
        }
        while (field487.method2350(field512) >= 11) {
            int var23 = field487.method2352(11);
            if (var23 == 2047) {
                break;
            }
            boolean var27 = false;
            if (field587[var23] == null) {
                field587[var23] = new class3();
                if (field592[var23] != null) {
                    field587[var23].method18(field592[var23]);
                }
                var27 = true;
            }
            field589[++field588 - 1] = var23;
            class3 var28 = field587[var23];
            var28.field434 = field476;
            int var29 = field487.method2352(5);
            if (var29 > 15) {
                var29 -= 32;
            }
            int var30 = field487.method2352(5);
            if (var30 > 15) {
                var30 -= 32;
            }
            int var31 = field487.method2352(1);
            if (var31 == 1) {
                field725[++field590 - 1] = var23;
            }
            int var32 = field487.method2352(1);
            int var33 = field567[field487.method2352(3)];
            if (var27) {
                var28.field445 = var28.field399 = var33;
            }
            var28.method248(Statics.field1271.field449[0] + var30, Statics.field1271.field460[0] + var29, var32 == 1);
        }
        field487.method2349();
        method52();
        for (int var24 = 0; var24 < field595; var24++) {
            int var25 = field612[var24];
            if (field476 != field587[var25].field434) {
                field587[var25] = null;
            }
        }
        if (field512 != field487.field2029) {
            throw new RuntimeException(field487.field2029 + class2.field18 + field512);
        }
        for (int var26 = 0; var26 < field588; var26++) {
            if (field587[field589[var26]] == null) {
                throw new RuntimeException(var26 + class2.field18 + field588);
            }
        }
    }

    @ObfuscatedName("l.bv(B)V")
    public static final void method52() {
        for (int var0 = 0; var0 < field590; var0++) {
            int var1 = field725[var0];
            class3 var2 = field587[var1];
            int var3 = field487.method2494();
            if ((var3 & 0x2) != 0) {
                var3 += field487.method2494() << 8;
            }
            if ((var3 & 0x1) != 0) {
                var2.field410 = field487.method2502();
                if (var2.field410.charAt(0) == '~') {
                    var2.field410 = var2.field410.substring(1);
                    method1399(2, var2.field33, var2.field410);
                } else if (Statics.field1271 == var2) {
                    method1399(2, var2.field33, var2.field410);
                }
                var2.field397 = 0;
                var2.field413 = 0;
                var2.field412 = 150;
            }
            if ((var3 & 0x40) != 0) {
                int var4 = field487.method2496();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field487.method2518();
                method1511(var2, var4, var5);
            }
            if ((var3 & 0x4) != 0) {
                int var6 = field487.method2516();
                byte[] var7 = new byte[var6];
                class127 var8 = new class127(var7);
                field487.method2537(var7, 0, var6);
                field592[var1] = var8;
                var2.method18(var8);
            }
            if ((var3 & 0x100) != 0) {
                var2.field415 = field487.method2525();
                int var9 = field487.method2617();
                var2.field435 = var9 >> 16;
                var2.field411 = (var9 & 0xFFFF) + field476;
                var2.field432 = 0;
                var2.field433 = 0;
                if (var2.field411 > field476) {
                    var2.field432 = -1;
                }
                if (var2.field415 == 65535) {
                    var2.field415 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field420 = field487.method2496();
                if (var2.field420 == 65535) {
                    var2.field420 = -1;
                }
            }
            if ((var3 & 0x400) != 0) {
                int var10 = field487.method2494();
                int var11 = field487.method2494();
                var2.method246(var10, var11, field476);
                var2.field417 = field476 + 300;
                var2.field451 = field487.method2494();
                var2.field419 = field487.method2516();
            }
            if ((var3 & 0x10) != 0) {
                int var12 = field487.method2526();
                int var13 = field487.method2517();
                int var14 = field487.method2494();
                int var15 = field487.field2029;
                if (var2.field33 != null && var2.field31 != null) {
                    boolean var16 = false;
                    if (var13 <= 1 && method59(var2.field33)) {
                        var16 = true;
                    }
                    if (!var16 && field586 == 0) {
                        field676.field2029 = 0;
                        field487.method2537(field676.field2033, 0, var14);
                        field676.field2029 = 0;
                        String var17 = class185.method3425(class148.method1628(class184.method151(field676)));
                        var2.field410 = var17.trim();
                        var2.field397 = var12 >> 8;
                        var2.field413 = var12 & 0xFF;
                        var2.field412 = 150;
                        if (var13 == 2 || var13 == 3) {
                            method1399(1, class2.method2415(1) + var2.field33, var17);
                        } else if (var13 == 1) {
                            method1399(1, class2.method2415(0) + var2.field33, var17);
                        } else {
                            method1399(2, var2.field33, var17);
                        }
                    }
                }
                field487.field2029 = var14 + var15;
            }
            if ((var3 & 0x8) != 0) {
                int var18 = field487.method2518();
                int var19 = field487.method2517();
                var2.method246(var18, var19, field476);
                var2.field417 = field476 + 300;
                var2.field451 = field487.method2517();
                var2.field419 = field487.method2518();
            }
            if ((var3 & 0x20) != 0) {
                var2.field424 = field487.method2496();
                var2.field422 = field487.method2526();
            }
            if ((var3 & 0x200) != 0) {
                var2.field453 = field487.method2516();
                var2.field426 = field487.method2516();
                var2.field437 = field487.method2516();
                var2.field439 = field487.method2494();
                var2.field440 = field487.method2526() + field476;
                var2.field438 = field487.method2496() + field476;
                var2.field442 = field487.method2516();
                var2.field448 = 1;
                var2.field421 = 0;
            }
        }
    }

    @ObfuscatedName("ey.bk(I)V")
    public static final void method2910() {
        for (int var0 = 0; var0 < field590; var0++) {
            int var1 = field725[var0];
            class25 var2 = field505[var1];
            int var3 = field487.method2494();
            if ((var3 & 0x20) != 0) {
                var2.field420 = field487.method2525();
                if (var2.field420 == 65535) {
                    var2.field420 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field424 = field487.method2496();
                var2.field422 = field487.method2526();
            }
            if ((var3 & 0x40) != 0) {
                var2.field415 = field487.method2496();
                int var4 = field487.method2512();
                var2.field435 = var4 >> 16;
                var2.field411 = (var4 & 0xFFFF) + field476;
                var2.field432 = 0;
                var2.field433 = 0;
                if (var2.field411 > field476) {
                    var2.field432 = -1;
                }
                if (var2.field415 == 65535) {
                    var2.field415 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var5 = field487.method2516();
                int var6 = field487.method2517();
                var2.method246(var5, var6, field476);
                var2.field417 = field476 + 300;
                var2.field451 = field487.method2494();
                var2.field419 = field487.method2518();
            }
            if ((var3 & 0x4) != 0) {
                var2.field376 = class31.method843(field487.method2526());
                var2.field416 = var2.field376.field766;
                var2.field447 = var2.field376.field795;
                var2.field405 = var2.field376.field778;
                var2.field406 = var2.field376.field779;
                var2.field407 = var2.field376.field780;
                var2.field408 = var2.field376.field781;
                var2.field402 = var2.field376.field799;
                var2.field403 = var2.field376.field788;
                var2.field404 = var2.field376.field777;
            }
            if ((var3 & 0x10) != 0) {
                int var7 = field487.method2494();
                int var8 = field487.method2494();
                var2.method246(var7, var8, field476);
                var2.field417 = field476 + 300;
                var2.field451 = field487.method2517();
                var2.field419 = field487.method2516();
            }
            if ((var3 & 0x2) != 0) {
                var2.field410 = field487.method2502();
                var2.field412 = 100;
            }
            if ((var3 & 0x8) != 0) {
                int var9 = field487.method2527();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field487.method2494();
                if (var2.field456 == var9 && var9 != -1) {
                    int var11 = Statics.method1204(var9).field889;
                    if (var11 == 1) {
                        var2.field427 = 0;
                        var2.field428 = 0;
                        var2.field429 = var10;
                        var2.field446 = 0;
                    }
                    if (var11 == 2) {
                        var2.field446 = 0;
                    }
                } else if (var9 == -1 || var2.field456 == -1 || Statics.method1204(var9).field880 >= Statics.method1204(var2.field456).field880) {
                    var2.field456 = var9;
                    var2.field427 = 0;
                    var2.field428 = 0;
                    var2.field429 = var10;
                    var2.field446 = 0;
                    var2.field421 = var2.field448;
                }
            }
        }
    }

    @ObfuscatedName("ar.bu(IIIII)V")
    public static final void method842(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field489; var4++) {
            if (field673[var4] + field604[var4] > arg0 && field673[var4] < arg0 + arg2 && field674[var4] + field528[var4] > arg1 && field674[var4] < arg1 + arg3) {
                field663[var4] = true;
            }
        }
    }

    @ObfuscatedName("bp.bc(IIIII)V")
    public static final void method1428(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field489; var4++) {
            if (field673[var4] + field604[var4] > arg0 && field673[var4] < arg0 + arg2 && field674[var4] + field528[var4] > arg1 && field674[var4] < arg1 + arg3) {
                field671[var4] = true;
            }
        }
    }

    @ObfuscatedName("v.bq(I)V")
    public static final void method142() {
        if (Statics.field789 != null || field638 != null) {
            return;
        }
        int var0 = class77.field1394;
        if (field609) {
            if (var0 != 1) {
                int var1 = class77.field1396;
                int var2 = class77.field1397;
                if (var1 < Statics.field1031 - 10 || var1 > Statics.field910 + Statics.field1031 + 10 || var2 < Statics.field1553 - 10 || var2 > Statics.field322 + Statics.field1553 + 10) {
                    field609 = false;
                    method842(Statics.field1031, Statics.field1553, Statics.field910, Statics.field322);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field1031;
                int var4 = Statics.field1553;
                int var5 = Statics.field910;
                int var6 = class77.field1400;
                int var7 = class77.field1404;
                int var8 = -1;
                for (int var9 = 0; var9 < field610; var9++) {
                    int var10 = (field610 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method646(var8);
                }
                field609 = false;
                method842(Statics.field1031, Statics.field1553, Statics.field910, Statics.field322);
            }
            return;
        }
        if (var0 == 1 && field610 > 0) {
            int var11 = field613[field610 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                label193: {
                    int var12 = field562[field610 - 1];
                    int var13 = field622[field610 - 1];
                    class159 var14 = class159.method1393(var13);
                    if (!Statics.method65(method3160(var14))) {
                        int var15 = method3160(var14);
                        boolean var16 = (var15 >> 29 & 0x1) != 0;
                        if (!var16) {
                            break label193;
                        }
                    }
                    if (Statics.field789 != null && !field584 && field608 != 1) {
                        int var17 = field610 - 1;
                        boolean var18;
                        if (var17 < 0) {
                            var18 = false;
                        } else {
                            int var19 = field613[var17];
                            if (var19 >= 2000) {
                                var19 -= 2000;
                            }
                            if (var19 == 1007) {
                                var18 = true;
                            } else {
                                var18 = false;
                            }
                        }
                        if (!var18 && field610 > 0) {
                            method646(field610 - 1);
                        }
                    }
                    field584 = false;
                    field730 = 0;
                    if (Statics.field789 != null) {
                        method1335(Statics.field789);
                    }
                    Statics.field789 = class159.method1393(var13);
                    field553 = var12;
                    field581 = class77.field1400;
                    field582 = class77.field1404;
                    method1335(Statics.field789);
                    return;
                }
            }
        }
        if (var0 == 1) {
            label195: {
                if (field608 != 1 || field610 <= 2) {
                    int var20 = field610 - 1;
                    boolean var21;
                    if (var20 < 0) {
                        var21 = false;
                    } else {
                        int var22 = field613[var20];
                        if (var22 >= 2000) {
                            var22 -= 2000;
                        }
                        if (var22 == 1007) {
                            var21 = true;
                        } else {
                            var21 = false;
                        }
                    }
                    if (!var21) {
                        break label195;
                    }
                }
                var0 = 2;
            }
        }
        if (var0 == 1 && field610 > 0) {
            method646(field610 - 1);
        }
        if (var0 == 2 && field610 > 0) {
            method149();
        }
    }

    @ObfuscatedName("z.bp(I)V")
    public static final void method149() {
        int var0 = Statics.field1626.method3400(class135.field2242);
        for (int var1 = 0; var1 < field610; var1++) {
            int var2 = Statics.field1626.method3400(method40(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field610 * 15 + 21;
        int var4 = class77.field1400 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1404;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field609 = true;
        Statics.field1031 = var4;
        Statics.field1553 = var5;
        Statics.field910 = var0;
        Statics.field322 = field610 * 15 + 22;
    }

    @ObfuscatedName("ax.br(II)V")
    public static final void method646(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field562[arg0];
        int var2 = field622[arg0];
        int var3 = field613[arg0];
        int var4 = field614[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 18) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(51);
            field509.method2531(var4);
            field509.method2595(Statics.field1646 + var1);
            field509.method2595(Statics.field1269 + var2);
        }
        if (var3 == 1003) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            class25 var5 = field505[var4];
            if (var5 != null) {
                class31 var6 = var5.field376;
                if (var6.field796 != null) {
                    var6 = var6.method629();
                }
                if (var6 != null) {
                    field509.method2345(233);
                    field509.method2531(var6.field801);
                }
            }
        }
        if (var3 == 10) {
            class25 var7 = field505[var4];
            if (var7 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(29);
                field509.method2481(var4);
            }
        }
        if (var3 == 11) {
            class25 var8 = field505[var4];
            if (var8 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(62);
                field509.method2481(var4);
            }
        }
        if (var3 == 9) {
            class25 var9 = field505[var4];
            if (var9 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(99);
                field509.method2595(var4);
            }
        }
        if (var3 == 3) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(102);
            field509.method2531(Statics.field1269 + var2);
            field509.method2481(var4 >> 14 & 0x7FFF);
            field509.method2531(Statics.field1646 + var1);
        }
        if (var3 == 6) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(174);
            field509.method2481(var4 >> 14 & 0x7FFF);
            field509.method2595(Statics.field1269 + var2);
            field509.method2595(Statics.field1646 + var1);
        }
        if (var3 == 17) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(7);
            field509.method2531(field624);
            field509.method2501(Statics.field138);
            field509.method2531(Statics.field1269 + var2);
            field509.method2531(Statics.field1646 + var1);
            field509.method2522(var4);
        }
        if (var3 == 42) {
            field509.method2345(13);
            field509.method2522(var4);
            field509.method2595(var1);
            field509.method2486(var2);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 38) {
            method557();
            class159 var10 = class159.method1393(var2);
            field621 = 1;
            Statics.field792 = var1;
            Statics.field27 = var2;
            Statics.field1659 = var4;
            method1335(var10);
            field580 = class2.method2758(16748608) + class40.method1554(var4).field1004 + class2.method2758(16777215);
            if (field580 == null) {
                field580 = "null";
            }
            return;
        }
        if (var3 == 34) {
            field509.method2345(245);
            field509.method2595(var1);
            field509.method2532(var2);
            field509.method2531(var4);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 23) {
            Statics.field802.method1925(Statics.field1467, var1, var2);
        }
        if (var3 == 25) {
            class159 var11 = class159.method3023(var2, var1);
            if (var11 != null) {
                method557();
                method1255(var2, var1, class163.method1572(method3160(var11)));
                field621 = 0;
                String var12;
                if (class163.method1572(method3160(var11)) == 0) {
                    var12 = null;
                } else if (var11.field2656 == null || var11.field2656.trim().length() == 0) {
                    var12 = null;
                } else {
                    var12 = var11.field2656;
                }
                field714 = var12;
                if (field714 == null) {
                    field714 = "Null";
                }
                if (var11.field2589) {
                    field626 = var11.field2650 + class2.method2758(16777215);
                } else {
                    field626 = class2.method2758(65280) + var11.field2661 + class2.method2758(16777215);
                }
            }
            return;
        }
        if (var3 == 43) {
            field509.method2345(43);
            field509.method2531(var4);
            field509.method2483(var2);
            field509.method2595(var1);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 32) {
            field509.method2345(123);
            field509.method2486(Statics.field138);
            field509.method2522(var1);
            field509.method2531(field624);
            field509.method2481(var4);
            field509.method2501(var2);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 4) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(76);
            field509.method2595(Statics.field1646 + var1);
            field509.method2481(Statics.field1269 + var2);
            field509.method2595(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 12) {
            class25 var13 = field505[var4];
            if (var13 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(132);
                field509.method2595(var4);
            }
        }
        if (var3 == 7) {
            class25 var14 = field505[var4];
            if (var14 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(231);
                field509.method2483(Statics.field27);
                field509.method2595(Statics.field1659);
                field509.method2481(var4);
                field509.method2522(Statics.field792);
            }
        }
        if (var3 == 5) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(242);
            field509.method2595(var4 >> 14 & 0x7FFF);
            field509.method2595(Statics.field1646 + var1);
            field509.method2595(Statics.field1269 + var2);
        }
        if (var3 == 2) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(171);
            field509.method2595(Statics.field1269 + var2);
            field509.method2522(var4 >> 14 & 0x7FFF);
            field509.method2486(Statics.field138);
            field509.method2481(field624);
            field509.method2595(Statics.field1646 + var1);
        }
        if (var3 == 1002) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field509.method2345(211);
            field509.method2481(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 21) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(91);
            field509.method2531(Statics.field1646 + var1);
            field509.method2531(Statics.field1269 + var2);
            field509.method2531(var4);
        }
        if (var3 == 20) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(81);
            field509.method2531(var4);
            field509.method2595(Statics.field1269 + var2);
            field509.method2531(Statics.field1646 + var1);
        }
        if (var3 == 39) {
            field509.method2345(229);
            field509.method2532(var2);
            field509.method2522(var4);
            field509.method2522(var1);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 1005) {
            class159 var15 = class159.method1393(var2);
            if (var15 == null || var15.field2693[var1] < 100000) {
                field509.method2345(90);
                field509.method2531(var4);
            } else {
                method1399(0, "", var15.field2693[var1] + " x " + class40.method1554(var4).field1004);
            }
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 47) {
            class3 var16 = field587[var4];
            if (var16 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(253);
                field509.method2522(var4);
            }
        }
        if (var3 == 35) {
            field509.method2345(77);
            field509.method2595(var1);
            field509.method2595(var4);
            field509.method2532(var2);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 40) {
            field509.method2345(206);
            field509.method2483(var2);
            field509.method2531(var1);
            field509.method2531(var4);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 15) {
            class3 var17 = field587[var4];
            if (var17 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(9);
                field509.method2532(Statics.field138);
                field509.method2531(field624);
                field509.method2531(var4);
            }
        }
        if (var3 == 41) {
            field509.method2345(152);
            field509.method2522(var4);
            field509.method2531(var1);
            field509.method2486(var2);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 46) {
            class3 var18 = field587[var4];
            if (var18 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(147);
                field509.method2481(var4);
            }
        }
        if (var3 == 24) {
            class159 var19 = class159.method1393(var2);
            boolean var20 = true;
            if (var19.field2594 > 0) {
                var20 = method61(var19);
            }
            if (var20) {
                field509.method2345(136);
                field509.method2483(var2);
            }
        }
        if (var3 == 29) {
            field509.method2345(136);
            field509.method2483(var2);
            class159 var21 = class159.method1393(var2);
            if (var21.field2686 != null && var21.field2686[0][0] == 5) {
                int var22 = var21.field2686[0][1];
                if (class160.field2709[var22] != var21.field2688[0]) {
                    class160.field2709[var22] = var21.field2688[0];
                    method554(var22);
                }
            }
        }
        if (var3 == 36) {
            field509.method2345(67);
            field509.method2501(var2);
            field509.method2595(var4);
            field509.method2531(var1);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 1001) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(223);
            field509.method2531(Statics.field1646 + var1);
            field509.method2531(var4 >> 14 & 0x7FFF);
            field509.method2595(Statics.field1269 + var2);
        }
        if (var3 == 1) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(3);
            field509.method2595(Statics.field1269 + var2);
            field509.method2483(Statics.field27);
            field509.method2531(Statics.field792);
            field509.method2531(Statics.field1646 + var1);
            field509.method2595(var4 >> 14 & 0x7FFF);
            field509.method2481(Statics.field1659);
        }
        if (var3 == 22) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(146);
            field509.method2522(var4);
            field509.method2531(Statics.field1269 + var2);
            field509.method2522(Statics.field1646 + var1);
        }
        if (var3 == 48) {
            class3 var23 = field587[var4];
            if (var23 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(212);
                field509.method2481(var4);
            }
        }
        if (var3 == 51) {
            class3 var24 = field587[var4];
            if (var24 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(83);
                field509.method2531(var4);
            }
        }
        if (var3 == 13) {
            class25 var25 = field505[var4];
            if (var25 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(185);
                field509.method2522(var4);
            }
        }
        if (var3 == 8) {
            class25 var26 = field505[var4];
            if (var26 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(195);
                field509.method2481(field624);
                field509.method2531(var4);
                field509.method2532(Statics.field138);
            }
        }
        if (var3 == 14) {
            class3 var27 = field587[var4];
            if (var27 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(207);
                field509.method2522(Statics.field1659);
                field509.method2486(Statics.field27);
                field509.method2481(Statics.field792);
                field509.method2531(var4);
            }
        }
        if (var3 == 26) {
            method2342();
        }
        if (var3 == 19) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(21);
            field509.method2481(var4);
            field509.method2595(Statics.field1269 + var2);
            field509.method2595(Statics.field1646 + var1);
        }
        if (var3 == 37) {
            field509.method2345(198);
            field509.method2481(var1);
            field509.method2481(var4);
            field509.method2532(var2);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 28) {
            field509.method2345(136);
            field509.method2483(var2);
            class159 var28 = class159.method1393(var2);
            if (var28.field2686 != null && var28.field2686[0][0] == 5) {
                int var29 = var28.field2686[0][1];
                class160.field2709[var29] = 1 - class160.field2709[var29];
                method554(var29);
            }
        }
        if (var3 == 16) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field699 = var1;
            field700 = var2;
            field509.method2345(193);
            field509.method2595(var4);
            field509.method2595(Statics.field1646 + var1);
            field509.method2531(Statics.field792);
            field509.method2486(Statics.field27);
            field509.method2531(Statics.field1659);
            field509.method2595(Statics.field1269 + var2);
        }
        if (var3 == 49) {
            class3 var30 = field587[var4];
            if (var30 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(44);
                field509.method2595(var4);
            }
        }
        if (var3 == 58) {
            field509.method2345(228);
            field509.method2522(var1);
            field509.method2531(field624);
            field509.method2532(var2);
            field509.method2486(Statics.field138);
        }
        if (var3 == 50) {
            class3 var31 = field587[var4];
            if (var31 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(151);
                field509.method2522(var4);
            }
        }
        if (var3 == 1004) {
            field574 = class77.field1400;
            field470 = class77.field1404;
            field577 = 2;
            field477 = 0;
            field509.method2345(90);
            field509.method2531(var4);
        }
        if (var3 == 30 && field623 == null) {
            field509.method2345(58);
            field509.method2501(var2);
            field509.method2522(var1);
            field623 = class159.method3023(var2, var1);
            method1335(field623);
        }
        if (var3 == 33) {
            field509.method2345(126);
            field509.method2483(var2);
            field509.method2522(var1);
            field509.method2531(var4);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 31) {
            field509.method2345(48);
            field509.method2595(var1);
            field509.method2501(var2);
            field509.method2595(Statics.field792);
            field509.method2501(Statics.field27);
            field509.method2481(Statics.field1659);
            field509.method2595(var4);
            field522 = 0;
            Statics.field345 = class159.method1393(var2);
            field579 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            String var32 = field493[arg0];
            class159 var33 = class159.method3023(var2, var1);
            if (var33 != null) {
                if (var33.field2607 != null) {
                    class1 var34 = new class1();
                    var34.field2 = var33;
                    var34.field10 = var4;
                    var34.field15 = var32;
                    var34.field12 = var33.field2607;
                    class26.method1603(var34);
                }
                boolean var35 = true;
                if (var33.field2594 > 0) {
                    var35 = method61(var33);
                }
                if (var35 && class163.method1383(method3160(var33), var4 - 1)) {
                    if (var4 == 1) {
                        field509.method2345(145);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 2) {
                        field509.method2345(159);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 3) {
                        field509.method2345(200);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 4) {
                        field509.method2345(227);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 5) {
                        field509.method2345(179);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 6) {
                        field509.method2345(34);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 7) {
                        field509.method2345(251);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 8) {
                        field509.method2345(101);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 9) {
                        field509.method2345(70);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                    if (var4 == 10) {
                        field509.method2345(93);
                        field509.method2483(var2);
                        field509.method2481(var1);
                    }
                }
            }
        }
        if (var3 == 45) {
            class3 var36 = field587[var4];
            if (var36 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(150);
                field509.method2531(var4);
            }
        }
        if (var3 == 44) {
            class3 var37 = field587[var4];
            if (var37 != null) {
                field574 = class77.field1400;
                field470 = class77.field1404;
                field577 = 2;
                field477 = 0;
                field699 = var1;
                field700 = var2;
                field509.method2345(177);
                field509.method2522(var4);
            }
        }
        if (field621 != 0) {
            field621 = 0;
            method1335(class159.method1393(Statics.field27));
        }
        if (field605) {
            method557();
        }
        if (Statics.field345 != null && field522 == 0) {
            method1335(Statics.field345);
        }
    }

    @ObfuscatedName("bn.bx(IIII)V")
    public static void method1255(int arg0, int arg1, int arg2) {
        class159 var3 = class159.method3023(arg0, arg1);
        if (var3 != null && var3.field2679 != null) {
            class1 var4 = new class1();
            var4.field2 = var3;
            var4.field12 = var3.field2679;
            class26.method1603(var4);
        }
        field605 = true;
        Statics.field138 = arg0;
        field624 = arg1;
        Statics.field330 = arg2;
        method1335(var3);
    }

    @ObfuscatedName("ap.bb(B)V")
    public static void method557() {
        if (!field605) {
            return;
        }
        class159 var0 = class159.method3023(Statics.field138, field624);
        if (var0 != null && var0.field2669 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field12 = var0.field2669;
            class26.method1603(var1);
        }
        field605 = false;
        method1335(var0);
    }

    @ObfuscatedName("cm.bs(B)V")
    public static final void method1881() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field610 - 1; var1++) {
                if (field613[var1] < 1000 && field613[var1 + 1] > 1000) {
                    String var2 = field493[var1];
                    field493[var1] = field493[var1 + 1];
                    field493[var1 + 1] = var2;
                    String var3 = field713[var1];
                    field713[var1] = field713[var1 + 1];
                    field713[var1 + 1] = var3;
                    int var4 = field613[var1];
                    field613[var1] = field613[var1 + 1];
                    field613[var1 + 1] = var4;
                    int var5 = field562[var1];
                    field562[var1] = field562[var1 + 1];
                    field562[var1 + 1] = var5;
                    int var6 = field622[var1];
                    field622[var1] = field622[var1 + 1];
                    field622[var1 + 1] = var6;
                    int var7 = field614[var1];
                    field614[var1] = field614[var1 + 1];
                    field614[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ce.bz(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1688(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field609 || field610 >= 500) {
            return;
        }
        field713[field610] = arg0;
        field493[field610] = arg1;
        field613[field610] = arg2;
        field614[field610] = arg3;
        field562[field610] = arg4;
        field622[field610] = arg5;
        field610++;
    }

    @ObfuscatedName("y.bo(II)Ljava/lang/String;")
    public static String method40(int arg0) {
        return field493[arg0].length() > 0 ? field713[arg0] + class135.field2249 + field493[arg0] : field713[arg0];
    }

    @ObfuscatedName("bv.bt(Lax;IIII)V")
    public static final void method1369(class31 arg0, int arg1, int arg2, int arg3) {
        if (field610 >= 400) {
            return;
        }
        if (arg0.field796 != null) {
            arg0 = arg0.method629();
        }
        if (arg0 == null || !arg0.field790) {
            return;
        }
        String var4 = arg0.field794;
        if (arg0.field776 != 0) {
            var4 = var4 + method1205(arg0.field776, Statics.field1271.field34) + " " + class2.field26 + class135.field2179 + arg0.field776 + class2.field20;
        }
        if (field621 == 1) {
            method1688(class135.field2172, field580 + " " + class2.field17 + " " + class2.method2758(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field605) {
            String[] var5 = arg0.field786;
            if (field637) {
                var5 = method31(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class135.field2294)) {
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
                        method1688(var5[var6], class2.method2758(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class135.field2294)) {
                        short var9 = 0;
                        if (arg0.field776 > Statics.field1271.field34) {
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
                        method1688(var5[var8], class2.method2758(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method1688(class135.field2240, class2.method2758(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field330 & 0x2) == 2) {
            method1688(field714, field626 + " " + class2.field17 + " " + class2.method2758(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("l.cy(La;IIII)V")
    public static final void method56(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1271 == arg0 || field610 >= 400) {
            return;
        }
        String var4;
        if (arg0.field49 * 1973328615 * -10025 == 0) {
            var4 = arg0.field33 + method1205(arg0.field34, Statics.field1271.field34) + " " + class2.field26 + class135.field2179 + arg0.field34 + class2.field20;
        } else {
            var4 = arg0.field33 + " " + class2.field26 + class135.field2246 + arg0.field49 * 1973328615 * -10025 + class2.field20;
        }
        if (field621 == 1) {
            method1688(class135.field2172, field580 + " " + class2.field17 + " " + class2.method2758(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field605) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field598[var5] != null) {
                    short var6 = 0;
                    if (field598[var5].equalsIgnoreCase(class135.field2294)) {
                        if (arg0.field34 > Statics.field1271.field34) {
                            var6 = 2000;
                        }
                        if (Statics.field1271.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field1271.field48 == arg0.field48) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field599[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field710[var5] + var6;
                    method1688(field598[var5], class2.method2758(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field330 & 0x8) == 8) {
            method1688(field714, field626 + " " + class2.field17 + " " + class2.method2758(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field610; var9++) {
            if (field613[var9] == 23) {
                field493[var9] = class2.method2758(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("au.cp(III)Ljava/lang/String;")
    public static final String method1205(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2758(16711680);
        } else if (var2 < -6) {
            return class2.method2758(16723968);
        } else if (var2 < -3) {
            return class2.method2758(16740352);
        } else if (var2 < 0) {
            return class2.method2758(16756736);
        } else if (var2 > 9) {
            return class2.method2758(65280);
        } else if (var2 > 6) {
            return class2.method2758(4259584);
        } else if (var2 > 3) {
            return class2.method2758(8453888);
        } else if (var2 > 0) {
            return class2.method2758(12648192);
        } else {
            return class2.method2758(16776960);
        }
    }

    @ObfuscatedName("ef.cs([Lfv;IIIIIIIIS)V")
    public static final void method2771(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1819(arg2, arg3, arg4, arg5);
        class104.method2182();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2601 == arg1 || arg1 == -1412584499 && field638 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field673[field489] = var10.field2606 + arg6;
                    field674[field489] = var10.field2690 + arg7;
                    field604[field489] = var10.field2599;
                    field528[field489] = var10.field2585;
                    var11 = ++field489 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2705 = var11;
                var10.field2676 = field476;
                if (!var10.field2589 || !method2340(var10)) {
                    if (var10.field2594 > 0) {
                        method14(var10);
                    }
                    int var12 = var10.field2606 + arg6;
                    int var13 = var10.field2690 + arg7;
                    int var14 = var10.field2612;
                    if (field638 == var10) {
                        if (arg1 != -1412584499 && !var10.field2655) {
                            Statics.field909 = arg0;
                            Statics.field372 = arg6;
                            Statics.field1759 = arg7;
                            continue;
                        }
                        if (field500 && field643) {
                            int var15 = class77.field1396;
                            int var16 = class77.field1397;
                            int var17 = var15 - field640;
                            int var18 = var16 - field641;
                            if (var17 < field644) {
                                var17 = field644;
                            }
                            if (var10.field2599 + var17 > field644 + field508.field2599) {
                                var17 = field644 + field508.field2599 - var10.field2599;
                            }
                            if (var18 < field645) {
                                var18 = field645;
                            }
                            if (var10.field2585 + var18 > field645 + field508.field2585) {
                                var18 = field645 + field508.field2585 - var10.field2585;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2655) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2592 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2592 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2599 + var12;
                        int var26 = var10.field2585 + var13;
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
                        int var29 = var10.field2599 + var12;
                        int var30 = var10.field2585 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2589 || var19 < var21 && var20 < var22) {
                        if (var10.field2594 != 0) {
                            if (var10.field2594 == 1337) {
                                field707 = var12;
                                field669 = var13;
                                int var31 = var10.field2599;
                                int var32 = var10.field2585;
                                class89.method1819(var12, var13, var12 + var31, var13 + var32);
                                class104.method2182();
                                field667++;
                                method115(true);
                                method231(true);
                                method115(false);
                                method231(false);
                                for (class10 var33 = (class10) field585.method3325(); var33 != null; var33 = (class10) field585.method3333()) {
                                    if (Statics.field1467 != var33.field155 || field476 > var33.field151) {
                                        var33.method3360();
                                    } else if (field476 >= var33.field150) {
                                        if (var33.field167 > 0) {
                                            class25 var34 = field505[var33.field167 - 1];
                                            if (var34 != null && var34.field418 >= 0 && var34.field418 < 13312 && var34.field398 >= 0 && var34.field398 < 13312) {
                                                var33.method114(var34.field418, var34.field398, method2979(var34.field418, var34.field398, var33.field155) - var33.field149, field476);
                                            }
                                        }
                                        if (var33.field167 < 0) {
                                            int var35 = -var33.field167 - 1;
                                            class3 var36;
                                            if (field593 == var35) {
                                                var36 = Statics.field1271;
                                            } else {
                                                var36 = field587[var35];
                                            }
                                            if (var36 != null && var36.field418 >= 0 && var36.field418 < 13312 && var36.field398 >= 0 && var36.field398 < 13312) {
                                                var33.method114(var36.field418, var36.field398, method2979(var36.field418, var36.field398, var33.field155) - var33.field149, field476);
                                            }
                                        }
                                        var33.method113(field543);
                                        Statics.field802.method1900(Statics.field1467, (int) var33.field156, (int) var33.field157, (int) var33.field171, 60, var33, var33.field164, -1, false);
                                    }
                                }
                                for (class20 var37 = (class20) field648.method3325(); var37 != null; var37 = (class20) field648.method3333()) {
                                    if (Statics.field1467 != var37.field297 || var37.field296) {
                                        var37.method3360();
                                    } else if (field476 >= var37.field288) {
                                        var37.method180(field543);
                                        if (var37.field296) {
                                            var37.method3360();
                                        } else {
                                            Statics.field802.method1900(var37.field297, var37.field287, var37.field291, var37.field292, 60, var37, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field532) {
                                    int var38 = field557;
                                    if (field566 / 256 > var38) {
                                        var38 = field566 / 256;
                                    }
                                    if (field601[4] && field633[4] + 128 > var38) {
                                        var38 = field633[4] + 128;
                                    }
                                    int var39 = field720 + field535 & 0x7FF;
                                    method148(Statics.field454, method2979(Statics.field1271.field418, Statics.field1271.field398, Statics.field1467) - 50, Statics.field2332, var38, var39, var38 * 3 + 600);
                                }
                                int var52;
                                if (field532) {
                                    var52 = method30();
                                } else {
                                    int var40;
                                    if (Statics.field29.field187) {
                                        var40 = Statics.field1467;
                                    } else {
                                        int var41 = 3;
                                        if (Statics.field1472 < 310) {
                                            int var42 = Statics.field68 >> 7;
                                            int var43 = Statics.field258 >> 7;
                                            int var44 = Statics.field1271.field418 >> 7;
                                            int var45 = Statics.field1271.field398 >> 7;
                                            if ((class9.field141[Statics.field1467][var42][var43] & 0x4) != 0) {
                                                var41 = Statics.field1467;
                                            }
                                            int var46;
                                            if (var44 > var42) {
                                                var46 = var44 - var42;
                                            } else {
                                                var46 = var42 - var44;
                                            }
                                            int var47;
                                            if (var45 > var43) {
                                                var47 = var45 - var43;
                                            } else {
                                                var47 = var43 - var45;
                                            }
                                            if (var46 > var47) {
                                                int var48 = var47 * 65536 / var46;
                                                int var49 = 32768;
                                                while (var42 != var44) {
                                                    if (var42 < var44) {
                                                        var42++;
                                                    } else if (var42 > var44) {
                                                        var42--;
                                                    }
                                                    if ((class9.field141[Statics.field1467][var42][var43] & 0x4) != 0) {
                                                        var41 = Statics.field1467;
                                                    }
                                                    var49 += var48;
                                                    if (var49 >= 65536) {
                                                        var49 -= 65536;
                                                        if (var43 < var45) {
                                                            var43++;
                                                        } else if (var43 > var45) {
                                                            var43--;
                                                        }
                                                        if ((class9.field141[Statics.field1467][var42][var43] & 0x4) != 0) {
                                                            var41 = Statics.field1467;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var50 = var46 * 65536 / var47;
                                                int var51 = 32768;
                                                while (var43 != var45) {
                                                    if (var43 < var45) {
                                                        var43++;
                                                    } else if (var43 > var45) {
                                                        var43--;
                                                    }
                                                    if ((class9.field141[Statics.field1467][var42][var43] & 0x4) != 0) {
                                                        var41 = Statics.field1467;
                                                    }
                                                    var51 += var50;
                                                    if (var51 >= 65536) {
                                                        var51 -= 65536;
                                                        if (var42 < var44) {
                                                            var42++;
                                                        } else if (var42 > var44) {
                                                            var42--;
                                                        }
                                                        if ((class9.field141[Statics.field1467][var42][var43] & 0x4) != 0) {
                                                            var41 = Statics.field1467;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class9.field141[Statics.field1467][Statics.field1271.field418 >> 7][Statics.field1271.field398 >> 7] & 0x4) != 0) {
                                            var41 = Statics.field1467;
                                        }
                                        var40 = var41;
                                    }
                                    var52 = var40;
                                }
                                int var53 = Statics.field68;
                                int var54 = Statics.field1835;
                                int var55 = Statics.field258;
                                int var56 = Statics.field1472;
                                int var57 = Statics.field1304;
                                for (int var58 = 0; var58 < 5; var58++) {
                                    if (field601[var58]) {
                                        int var59 = (int) (Math.random() * (double) (field507[var58] * 2 + 1) - (double) field507[var58] + Math.sin((double) field717[var58] / 100.0D * (double) field718[var58]) * (double) field633[var58]);
                                        if (var58 == 0) {
                                            Statics.field68 += var59;
                                        }
                                        if (var58 == 1) {
                                            Statics.field1835 += var59;
                                        }
                                        if (var58 == 2) {
                                            Statics.field258 += var59;
                                        }
                                        if (var58 == 3) {
                                            Statics.field1304 = Statics.field1304 + var59 & 0x7FF;
                                        }
                                        if (var58 == 4) {
                                            Statics.field1472 += var59;
                                            if (Statics.field1472 < 128) {
                                                Statics.field1472 = 128;
                                            }
                                            if (Statics.field1472 > 383) {
                                                Statics.field1472 = 383;
                                            }
                                        }
                                    }
                                }
                                int var60 = class77.field1396;
                                int var61 = class77.field1397;
                                if (var60 >= var12 && var60 < var12 + var31 && var61 >= var13 && var61 < var13 + var32) {
                                    class112.field1887 = true;
                                    class112.field1917 = 0;
                                    class112.field1915 = class77.field1396 - var12;
                                    class112.field1916 = class77.field1397 - var13;
                                } else {
                                    class112.field1887 = false;
                                    class112.field1917 = 0;
                                }
                                method2251();
                                class89.method1816(var12, var13, var31, var32, 0);
                                method2251();
                                Statics.field802.method1926(Statics.field68, Statics.field1835, Statics.field258, Statics.field1472, Statics.field1304, var52);
                                method2251();
                                Statics.field802.method1911();
                                field560 = 0;
                                for (int var62 = -1; var62 < field588 + field506; var62++) {
                                    class27 var63;
                                    if (var62 == -1) {
                                        var63 = Statics.field1271;
                                    } else if (var62 < field588) {
                                        var63 = field587[field589[var62]];
                                    } else {
                                        var63 = field505[field575[var62 - field588]];
                                    }
                                    if (var63 != null && var63.method20()) {
                                        if (var63 instanceof class25) {
                                            class31 var64 = ((class25) var63).field376;
                                            if (var64.field796 != null) {
                                                var64 = var64.method629();
                                            }
                                            if (var64 == null) {
                                                continue;
                                            }
                                        }
                                        if (var62 >= field588) {
                                            class31 var67 = ((class25) var63).field376;
                                            if (var67.field796 != null) {
                                                var67 = var67.method629();
                                            }
                                            if (var67.field773 >= 0 && var67.field773 < Statics.field179.length) {
                                                method712(var63, var63.field444 + 15);
                                                if (field572 > -1) {
                                                    Statics.field179[var67.field773].method1725(field572 + var12 - 12, field649 + var13 - 30);
                                                }
                                            }
                                            if (field545 == 1 && field486 == field575[var62 - field588] && field476 % 20 < 10) {
                                                method712(var63, var63.field444 + 15);
                                                if (field572 > -1) {
                                                    Statics.field5[0].method1725(field572 + var12 - 12, field649 + var13 - 28);
                                                }
                                            }
                                        } else {
                                            int var65 = 30;
                                            class3 var66 = (class3) var63;
                                            if (var66.field32 != -1 || var66.field36 != -1) {
                                                method712(var63, var63.field444 + 15);
                                                if (field572 > -1) {
                                                    if (var66.field32 != -1) {
                                                        Statics.field109[var66.field32].method1725(field572 + var12 - 12, field649 + var13 - var65);
                                                        var65 += 25;
                                                    }
                                                    if (var66.field36 != -1) {
                                                        Statics.field179[var66.field36].method1725(field572 + var12 - 12, field649 + var13 - var65);
                                                        var65 += 25;
                                                    }
                                                }
                                            }
                                            if (var62 >= 0 && field545 == 10 && field615 == field589[var62]) {
                                                method712(var63, var63.field444 + 15);
                                                if (field572 > -1) {
                                                    Statics.field5[1].method1725(field572 + var12 - 12, field649 + var13 - var65);
                                                }
                                            }
                                        }
                                        if (var63.field410 != null && (var62 >= field588 || field684 == 0 || field684 == 3 || field684 == 1 && method791(((class3) var63).field33))) {
                                            method712(var63, var63.field444);
                                            if (field572 > -1 && field560 < field561) {
                                                field711[field560] = Statics.field1626.method3400(var63.field410) / 2;
                                                field544[field560] = Statics.field1626.field2832;
                                                field672[field560] = field572;
                                                field563[field560] = field649;
                                                field618[field560] = var63.field397;
                                                field565[field560] = var63.field413;
                                                field568[field560] = var63.field412;
                                                field569[field560] = var63.field410;
                                                field560++;
                                            }
                                        }
                                        if (var63.field417 > field476) {
                                            method712(var63, var63.field444 + 15);
                                            if (field572 > -1) {
                                                int var68 = var63.field451 * 30 / var63.field419;
                                                if (var68 > 30) {
                                                    var68 = 30;
                                                } else if (var68 == 0 && var63.field451 > 0) {
                                                    var68 = 1;
                                                }
                                                class89.method1816(field572 + var12 - 15, field649 + var13 - 3, var68, 5, 65280);
                                                class89.method1816(field572 + var12 - 15 + var68, field649 + var13 - 3, 30 - var68, 5, 16711680);
                                            }
                                        }
                                        for (int var69 = 0; var69 < 4; var69++) {
                                            if (var63.field461[var69] > field476) {
                                                method712(var63, var63.field444 / 2);
                                                if (field572 > -1) {
                                                    if (var69 == 1) {
                                                        field649 -= 20;
                                                    }
                                                    if (var69 == 2) {
                                                        field572 -= 15;
                                                        field649 -= 10;
                                                    }
                                                    if (var69 == 3) {
                                                        field572 += 15;
                                                        field649 -= 10;
                                                    }
                                                    Statics.field459[var63.field450[var69]].method1725(field572 + var12 - 12, field649 + var13 - 12);
                                                    Statics.field170.method3407(Integer.toString(var63.field414[var69]), field572 + var12 - 1, field649 + var13 + 3, 16777215, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var70 = 0; var70 < field560; var70++) {
                                    int var71 = field672[var70];
                                    int var72 = field563[var70];
                                    int var73 = field711[var70];
                                    int var74 = field544[var70];
                                    boolean var75 = true;
                                    while (var75) {
                                        var75 = false;
                                        for (int var76 = 0; var76 < var70; var76++) {
                                            if (var72 + 2 > field563[var76] - field544[var76] && var72 - var74 < field563[var76] + 2 && var71 - var73 < field711[var76] + field672[var76] && var71 + var73 > field672[var76] - field711[var76] && field563[var76] - field544[var76] < var72) {
                                                var72 = field563[var76] - field544[var76];
                                                var75 = true;
                                            }
                                        }
                                    }
                                    field572 = field672[var70];
                                    field649 = field563[var70] = var72;
                                    String var77 = field569[var70];
                                    if (field632 == 0) {
                                        int var78 = 16776960;
                                        if (field618[var70] < 6) {
                                            var78 = field683[field618[var70]];
                                        }
                                        if (field618[var70] == 6) {
                                            var78 = field667 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field618[var70] == 7) {
                                            var78 = field667 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field618[var70] == 8) {
                                            var78 = field667 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field618[var70] == 9) {
                                            int var79 = 150 - field568[var70];
                                            if (var79 < 50) {
                                                var78 = var79 * 1280 + 16711680;
                                            } else if (var79 < 100) {
                                                var78 = 16776960 - (var79 - 50) * 327680;
                                            } else if (var79 < 150) {
                                                var78 = (var79 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field618[var70] == 10) {
                                            int var80 = 150 - field568[var70];
                                            if (var80 < 50) {
                                                var78 = var80 * 5 + 16711680;
                                            } else if (var80 < 100) {
                                                var78 = 16711935 - (var80 - 50) * 327680;
                                            } else if (var80 < 150) {
                                                var78 = (var80 - 100) * 327680 + 255 - (var80 - 100) * 5;
                                            }
                                        }
                                        if (field618[var70] == 11) {
                                            int var81 = 150 - field568[var70];
                                            if (var81 < 50) {
                                                var78 = 16777215 - var81 * 327685;
                                            } else if (var81 < 100) {
                                                var78 = (var81 - 50) * 327685 + 65280;
                                            } else if (var81 < 150) {
                                                var78 = 16777215 - (var81 - 100) * 327680;
                                            }
                                        }
                                        if (field565[var70] == 0) {
                                            Statics.field1626.method3407(var77, field572 + var12, field649 + var13, var78, 0);
                                        }
                                        if (field565[var70] == 1) {
                                            Statics.field1626.method3409(var77, field572 + var12, field649 + var13, var78, 0, field667);
                                        }
                                        if (field565[var70] == 2) {
                                            Statics.field1626.method3454(var77, field572 + var12, field649 + var13, var78, 0, field667);
                                        }
                                        if (field565[var70] == 3) {
                                            Statics.field1626.method3410(var77, field572 + var12, field649 + var13, var78, 0, field667, 150 - field568[var70]);
                                        }
                                        if (field565[var70] == 4) {
                                            int var82 = (150 - field568[var70]) * (Statics.field1626.method3400(var77) + 100) / 150;
                                            class89.method1811(field572 + var12 - 50, var13, field572 + var12 + 50, var13 + var32);
                                            Statics.field1626.method3405(var77, field572 + var12 + 50 - var82, field649 + var13, var78, 0);
                                            class89.method1819(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field565[var70] == 5) {
                                            int var83 = 150 - field568[var70];
                                            int var84 = 0;
                                            if (var83 < 25) {
                                                var84 = var83 - 25;
                                            } else if (var83 > 125) {
                                                var84 = var83 - 125;
                                            }
                                            class89.method1811(var12, field649 + var13 - Statics.field1626.field2832 - 1, var12 + var31, field649 + var13 + 5);
                                            Statics.field1626.method3407(var77, field572 + var12, field649 + var13 + var84, var78, 0);
                                            class89.method1819(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field1626.method3407(var77, field572 + var12, field649 + var13, 16776960, 0);
                                    }
                                }
                                method34(var12, var13);
                                ((class110) Statics.field1767).method2241(field543);
                                method691(var12, var13, var31, var32);
                                Statics.field68 = var53;
                                Statics.field1835 = var54;
                                Statics.field258 = var55;
                                Statics.field1472 = var56;
                                Statics.field1304 = var57;
                                if (field664) {
                                    byte var85 = 0;
                                    int var86 = class154.field2538 + class154.field2533 + var85;
                                    if (var86 == 0) {
                                        field664 = false;
                                    }
                                }
                                if (field664) {
                                    class89.method1816(var12, var13, var31, var32, 0);
                                    method2250(class135.field2105, false);
                                }
                                if (!field664 && !field609 && var60 >= var12 && var60 < var12 + var31 && var61 >= var13 && var61 < var13 + var32) {
                                    if (field621 == 0 && !field605) {
                                        method1688(class135.field2244, "", 23, 0, var60 - var12, var61 - var13);
                                    }
                                    int var88 = -1;
                                    for (int var89 = 0; var89 < class112.field1917; var89++) {
                                        int var90 = class112.field1913[var89];
                                        int var91 = var90 & 0x7F;
                                        int var92 = var90 >> 7 & 0x7F;
                                        int var93 = var90 >> 29 & 0x3;
                                        int var94 = var90 >> 14 & 0x7FFF;
                                        if (var88 != var90) {
                                            var88 = var90;
                                            if (var93 == 2 && Statics.field802.method1947(Statics.field1467, var91, var92, var90) >= 0) {
                                                class32 var95 = class32.method2811(var94);
                                                if (var95.field846 != null) {
                                                    var95 = var95.method660();
                                                }
                                                if (var95 == null) {
                                                    continue;
                                                }
                                                if (field621 == 1) {
                                                    method1688(class135.field2172, field580 + " " + class2.field17 + " " + class2.method2758(65535) + var95.field827, 1, var90, var91, var92);
                                                } else if (!field605) {
                                                    String[] var96 = var95.field834;
                                                    if (field637) {
                                                        var96 = method31(var96);
                                                    }
                                                    if (var96 != null) {
                                                        for (int var97 = 4; var97 >= 0; var97--) {
                                                            if (var96[var97] != null) {
                                                                short var98 = 0;
                                                                if (var97 == 0) {
                                                                    var98 = 3;
                                                                }
                                                                if (var97 == 1) {
                                                                    var98 = 4;
                                                                }
                                                                if (var97 == 2) {
                                                                    var98 = 5;
                                                                }
                                                                if (var97 == 3) {
                                                                    var98 = 6;
                                                                }
                                                                if (var97 == 4) {
                                                                    var98 = 1001;
                                                                }
                                                                method1688(var96[var97], class2.method2758(65535) + var95.field827, var98, var90, var91, var92);
                                                            }
                                                        }
                                                    }
                                                    method1688(class135.field2240, class2.method2758(65535) + var95.field827, 1002, var95.field814 << 14, var91, var92);
                                                } else if ((Statics.field330 & 0x4) == 4) {
                                                    method1688(field714, field626 + " " + class2.field17 + " " + class2.method2758(65535) + var95.field827, 2, var90, var91, var92);
                                                }
                                            }
                                            if (var93 == 1) {
                                                class25 var99 = field505[var94];
                                                if (var99.field376.field766 == 1 && (var99.field418 & 0x7F) == 64 && (var99.field398 & 0x7F) == 64) {
                                                    for (int var100 = 0; var100 < field506; var100++) {
                                                        class25 var101 = field505[field575[var100]];
                                                        if (var101 != null && var99 != var101 && var101.field376.field766 == 1 && var99.field418 == var101.field418 && var99.field398 == var101.field398) {
                                                            method1369(var101.field376, field575[var100], var91, var92);
                                                        }
                                                    }
                                                    for (int var102 = 0; var102 < field588; var102++) {
                                                        class3 var103 = field587[field589[var102]];
                                                        if (var103 != null && var99.field418 == var103.field418 && var99.field398 == var103.field398) {
                                                            method56(var103, field589[var102], var91, var92);
                                                        }
                                                    }
                                                }
                                                method1369(var99.field376, var94, var91, var92);
                                            }
                                            if (var93 == 0) {
                                                class3 var104 = field587[var94];
                                                if ((var104.field418 & 0x7F) == 64 && (var104.field398 & 0x7F) == 64) {
                                                    for (int var105 = 0; var105 < field506; var105++) {
                                                        class25 var106 = field505[field575[var105]];
                                                        if (var106 != null && var106.field376.field766 == 1 && var104.field418 == var106.field418 && var104.field398 == var106.field398) {
                                                            method1369(var106.field376, field575[var105], var91, var92);
                                                        }
                                                    }
                                                    for (int var107 = 0; var107 < field588; var107++) {
                                                        class3 var108 = field587[field589[var107]];
                                                        if (var108 != null && var104 != var108 && var104.field418 == var108.field418 && var104.field398 == var108.field398) {
                                                            method56(var108, field589[var107], var91, var92);
                                                        }
                                                    }
                                                }
                                                method56(var104, var94, var91, var92);
                                            }
                                            if (var93 == 3) {
                                                class177 var109 = field715[Statics.field1467][var91][var92];
                                                if (var109 != null) {
                                                    for (class17 var110 = (class17) var109.method3331(); var110 != null; var110 = (class17) var109.method3350()) {
                                                        class40 var111 = class40.method1554(var110.field256);
                                                        if (field621 == 1) {
                                                            method1688(class135.field2172, field580 + " " + class2.field17 + " " + class2.method2758(16748608) + var111.field1004, 16, var110.field256, var91, var92);
                                                        } else if (!field605) {
                                                            String[] var112 = var111.field990;
                                                            if (field637) {
                                                                var112 = method31(var112);
                                                            }
                                                            for (int var113 = 4; var113 >= 0; var113--) {
                                                                if (var112 != null && var112[var113] != null) {
                                                                    byte var114 = 0;
                                                                    if (var113 == 0) {
                                                                        var114 = 18;
                                                                    }
                                                                    if (var113 == 1) {
                                                                        var114 = 19;
                                                                    }
                                                                    if (var113 == 2) {
                                                                        var114 = 20;
                                                                    }
                                                                    if (var113 == 3) {
                                                                        var114 = 21;
                                                                    }
                                                                    if (var113 == 4) {
                                                                        var114 = 22;
                                                                    }
                                                                    method1688(var112[var113], class2.method2758(16748608) + var111.field1004, var114, var110.field256, var91, var92);
                                                                } else if (var113 == 2) {
                                                                    method1688(class135.field2152, class2.method2758(16748608) + var111.field1004, 20, var110.field256, var91, var92);
                                                                }
                                                            }
                                                            method1688(class135.field2240, class2.method2758(16748608) + var111.field1004, 1004, var110.field256, var91, var92);
                                                        } else if ((Statics.field330 & 0x1) == 1) {
                                                            method1688(field714, field626 + " " + class2.field17 + " " + class2.method2758(16748608) + var111.field1004, 17, var110.field256, var91, var92);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class89.method1819(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2594 == 1338) {
                                method2367(var12, var13, var11);
                                class89.method1819(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var115 = class77.field1396;
                        int var116 = class77.field1397;
                        if (!field609 && var115 >= var19 && var116 >= var20 && var115 < var21 && var116 < var22) {
                            int var117 = var115 - var12;
                            int var118 = var116 - var13;
                            if (var10.field2593 == 1) {
                                method1688(var10.field2662, "", 24, 0, 0, var10.field2665);
                            }
                            if (var10.field2593 == 2 && !field605) {
                                String var119;
                                if (class163.method1572(method3160(var10)) == 0) {
                                    var119 = null;
                                } else if (var10.field2656 == null || var10.field2656.trim().length() == 0) {
                                    var119 = null;
                                } else {
                                    var119 = var10.field2656;
                                }
                                if (var119 != null) {
                                    method1688(var119, class2.method2758(65280) + var10.field2661, 25, 0, -1, var10.field2665);
                                }
                            }
                            if (var10.field2593 == 3) {
                                method1688(class135.field2248, "", 26, 0, 0, var10.field2665);
                            }
                            if (var10.field2593 == 4) {
                                method1688(var10.field2662, "", 28, 0, 0, var10.field2665);
                            }
                            if (var10.field2593 == 5) {
                                method1688(var10.field2662, "", 29, 0, 0, var10.field2665);
                            }
                            if (var10.field2593 == 6 && field623 == null) {
                                method1688(var10.field2662, "", 30, 0, -1, var10.field2665);
                            }
                            if (var10.field2592 == 2) {
                                int var121 = 0;
                                for (int var122 = 0; var122 < var10.field2585; var122++) {
                                    for (int var123 = 0; var123 < var10.field2599; var123++) {
                                        int var124 = (var10.field2643 + 32) * var123;
                                        int var125 = (var10.field2691 + 32) * var122;
                                        if (var121 < 20) {
                                            var124 += var10.field2645[var121];
                                            var125 += var10.field2659[var121];
                                        }
                                        if (var117 >= var124 && var118 >= var125 && var117 < var124 + 32 && var118 < var125 + 32) {
                                            field591 = var121;
                                            Statics.field1223 = var10;
                                            if (var10.field2692[var121] > 0) {
                                                class40 var126 = class40.method1554(var10.field2692[var121] - 1);
                                                if (field621 == 1 && Statics.method2377(method3160(var10))) {
                                                    if (Statics.field27 != var10.field2665 || Statics.field792 != var121) {
                                                        method1688(class135.field2172, field580 + " " + class2.field17 + " " + class2.method2758(16748608) + var126.field1004, 31, var126.field1014, var121, var10.field2665);
                                                    }
                                                } else if (!field605 || !Statics.method2377(method3160(var10))) {
                                                    String[] var127 = var126.field991;
                                                    if (field637) {
                                                        var127 = method31(var127);
                                                    }
                                                    if (Statics.method2377(method3160(var10))) {
                                                        for (int var128 = 4; var128 >= 3; var128--) {
                                                            if (var127 != null && var127[var128] != null) {
                                                                byte var129;
                                                                if (var128 == 3) {
                                                                    var129 = 36;
                                                                } else {
                                                                    var129 = 37;
                                                                }
                                                                method1688(var127[var128], class2.method2758(16748608) + var126.field1004, var129, var126.field1014, var121, var10.field2665);
                                                            } else if (var128 == 4) {
                                                                method1688(class135.field2100, class2.method2758(16748608) + var126.field1004, 37, var126.field1014, var121, var10.field2665);
                                                            }
                                                        }
                                                    }
                                                    if (class163.method2455(method3160(var10))) {
                                                        method1688(class135.field2172, class2.method2758(16748608) + var126.field1004, 38, var126.field1014, var121, var10.field2665);
                                                    }
                                                    if (Statics.method2377(method3160(var10)) && var127 != null) {
                                                        for (int var130 = 2; var130 >= 0; var130--) {
                                                            if (var127[var130] != null) {
                                                                byte var131 = 0;
                                                                if (var130 == 0) {
                                                                    var131 = 33;
                                                                }
                                                                if (var130 == 1) {
                                                                    var131 = 34;
                                                                }
                                                                if (var130 == 2) {
                                                                    var131 = 35;
                                                                }
                                                                method1688(var127[var130], class2.method2758(16748608) + var126.field1004, var131, var126.field1014, var121, var10.field2665);
                                                            }
                                                        }
                                                    }
                                                    String[] var132 = var10.field2648;
                                                    if (field637) {
                                                        var132 = method31(var132);
                                                    }
                                                    if (var132 != null) {
                                                        for (int var133 = 4; var133 >= 0; var133--) {
                                                            if (var132[var133] != null) {
                                                                byte var134 = 0;
                                                                if (var133 == 0) {
                                                                    var134 = 39;
                                                                }
                                                                if (var133 == 1) {
                                                                    var134 = 40;
                                                                }
                                                                if (var133 == 2) {
                                                                    var134 = 41;
                                                                }
                                                                if (var133 == 3) {
                                                                    var134 = 42;
                                                                }
                                                                if (var133 == 4) {
                                                                    var134 = 43;
                                                                }
                                                                method1688(var132[var133], class2.method2758(16748608) + var126.field1004, var134, var126.field1014, var121, var10.field2665);
                                                            }
                                                        }
                                                    }
                                                    method1688(class135.field2240, class2.method2758(16748608) + var126.field1004, 1005, var126.field1014, var121, var10.field2665);
                                                } else if ((Statics.field330 & 0x10) == 16) {
                                                    method1688(field714, field626 + " " + class2.field17 + " " + class2.method2758(16748608) + var126.field1004, 32, var126.field1014, var121, var10.field2665);
                                                }
                                            }
                                        }
                                        var121++;
                                    }
                                }
                            }
                            if (var10.field2589) {
                                if (field605) {
                                    int var135 = method3160(var10);
                                    boolean var136 = (var135 >> 21 & 0x1) != 0;
                                    if (var136 && (Statics.field330 & 0x20) == 32) {
                                        method1688(field714, field626 + " " + class2.field17 + " " + var10.field2650, 58, 0, var10.field2700, var10.field2665);
                                    }
                                } else {
                                    for (int var137 = 9; var137 >= 5; var137--) {
                                        String var138 = method124(var10, var137);
                                        if (var138 != null) {
                                            method1688(var138, var10.field2650, 1007, var137 + 1, var10.field2700, var10.field2665);
                                        }
                                    }
                                    String var139;
                                    if (class163.method1572(method3160(var10)) == 0) {
                                        var139 = null;
                                    } else if (var10.field2656 == null || var10.field2656.trim().length() == 0) {
                                        var139 = null;
                                    } else {
                                        var139 = var10.field2656;
                                    }
                                    if (var139 != null) {
                                        method1688(var139, var10.field2650, 25, 0, var10.field2700, var10.field2665);
                                    }
                                    for (int var141 = 4; var141 >= 0; var141--) {
                                        String var142 = method124(var10, var141);
                                        if (var142 != null) {
                                            method1688(var142, var10.field2650, 57, var141 + 1, var10.field2700, var10.field2665);
                                        }
                                    }
                                    int var143 = method3160(var10);
                                    boolean var144 = (var143 & 0x1) != 0;
                                    if (var144) {
                                        method1688(class135.field2119, "", 30, 0, var10.field2700, var10.field2665);
                                    }
                                }
                            }
                        }
                        if (var10.field2592 == 0) {
                            if (!var10.field2589 && method2340(var10) && Statics.field392 != var10) {
                                continue;
                            }
                            if (!var10.field2589) {
                                if (var10.field2604 > var10.field2620 - var10.field2585) {
                                    var10.field2604 = var10.field2620 - var10.field2585;
                                }
                                if (var10.field2604 < 0) {
                                    var10.field2604 = 0;
                                }
                            }
                            method2771(arg0, var10.field2665, var19, var20, var21, var22, var12 - var10.field2603, var13 - var10.field2604, var11);
                            if (var10.field2670 != null) {
                                method2771(var10.field2670, var10.field2665, var19, var20, var21, var22, var12 - var10.field2603, var13 - var10.field2604, var11);
                            }
                            class4 var145 = (class4) field628.method3311((long) var10.field2665);
                            if (var145 != null) {
                                if (var145.field51 == 0 && class77.field1396 >= var19 && class77.field1397 >= var20 && class77.field1396 < var21 && class77.field1397 < var22 && !field609 && !field552) {
                                    field713[0] = class135.field2262;
                                    field493[0] = "";
                                    field613[0] = 1006;
                                    field610 = 1;
                                }
                                int var146 = var145.field54;
                                if (Statics.method66(var146)) {
                                    Statics.field909 = null;
                                    method2771(Statics.field2641[var146], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field909 != null) {
                                        method2771(Statics.field909, -1412584499, var19, var20, var21, var22, Statics.field372, Statics.field1759, var11);
                                        Statics.field909 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var147 = 0; var147 < 100; var147++) {
                                        field663[var147] = true;
                                    }
                                } else {
                                    field663[var11] = true;
                                }
                            }
                            class89.method1819(arg2, arg3, arg4, arg5);
                            class104.method2182();
                        }
                        if (field465[var11] || field677 > 1) {
                            if (var10.field2592 == 0 && !var10.field2589 && var10.field2620 > var10.field2585) {
                                int var148 = var10.field2599 + var12;
                                int var149 = var10.field2604;
                                int var150 = var10.field2585;
                                int var151 = var10.field2620;
                                Statics.field1451[0].method1795(var148, var13);
                                Statics.field1451[1].method1795(var148, var13 + var150 - 16);
                                class89.method1816(var148, var13 + 16, 16, var150 - 32, field511);
                                int var152 = (var150 - 32) * var150 / var151;
                                if (var152 < 8) {
                                    var152 = 8;
                                }
                                int var153 = (var150 - 32 - var152) * var149 / (var151 - var150);
                                class89.method1816(var148, var13 + 16 + var153, 16, var152, field546);
                                class89.method1821(var148, var13 + 16 + var153, var152, field463);
                                class89.method1821(var148 + 1, var13 + 16 + var153, var152, field463);
                                class89.method1857(var148, var13 + 16 + var153, 16, field463);
                                class89.method1857(var148, var13 + 17 + var153, 16, field463);
                                class89.method1821(var148 + 15, var13 + 16 + var153, var152, field723);
                                class89.method1821(var148 + 14, var13 + 17 + var153, var152 - 1, field723);
                                class89.method1857(var148, var13 + 15 + var153 + var152, 16, field723);
                                class89.method1857(var148 + 1, var13 + 14 + var153 + var152, 15, field723);
                            }
                            if (var10.field2592 != 1) {
                                if (var10.field2592 == 2) {
                                    int var154 = 0;
                                    for (int var155 = 0; var155 < var10.field2585; var155++) {
                                        for (int var156 = 0; var156 < var10.field2599; var156++) {
                                            int var157 = (var10.field2643 + 32) * var156 + var12;
                                            int var158 = (var10.field2691 + 32) * var155 + var13;
                                            if (var154 < 20) {
                                                var157 += var10.field2645[var154];
                                                var158 += var10.field2659[var154];
                                            }
                                            if (var10.field2692[var154] > 0) {
                                                boolean var159 = false;
                                                boolean var160 = false;
                                                int var161 = var10.field2692[var154] - 1;
                                                if (var157 + 32 > arg2 && var157 < arg4 && var158 + 32 > arg3 && var158 < arg5 || Statics.field789 == var10 && field553 == var154) {
                                                    class86 var162;
                                                    if (field621 == 1 && Statics.field792 == var154 && Statics.field27 == var10.field2665) {
                                                        var162 = class40.method2475(var161, var10.field2693[var154], 2, 0, false);
                                                    } else {
                                                        var162 = class40.method2475(var161, var10.field2693[var154], 1, 3153952, false);
                                                    }
                                                    if (var162 == null) {
                                                        method1335(var10);
                                                    } else if (Statics.field789 == var10 && field553 == var154) {
                                                        int var163 = class77.field1396 - field581;
                                                        int var164 = class77.field1397 - field582;
                                                        if (var163 < 5 && var163 > -5) {
                                                            var163 = 0;
                                                        }
                                                        if (var164 < 5 && var164 > -5) {
                                                            var164 = 0;
                                                        }
                                                        if (field730 < 5) {
                                                            var163 = 0;
                                                            var164 = 0;
                                                        }
                                                        var162.method1726(var157 + var163, var158 + var164, 128);
                                                        if (arg1 != -1) {
                                                            class159 var165 = arg0[arg1 & 0xFFFF];
                                                            if (var158 + var164 < class89.field1496 && var165.field2604 > 0) {
                                                                int var166 = field543 * (class89.field1496 - var158 - var164) / 3;
                                                                if (var166 > field543 * 10) {
                                                                    var166 = field543 * 10;
                                                                }
                                                                if (var166 > var165.field2604) {
                                                                    var166 = var165.field2604;
                                                                }
                                                                var165.field2604 -= var166;
                                                                field582 += var166;
                                                                method1335(var165);
                                                            }
                                                            if (var158 + var164 + 32 > class89.field1500 && var165.field2604 < var165.field2620 - var165.field2585) {
                                                                int var167 = field543 * (var158 + var164 + 32 - class89.field1500) / 3;
                                                                if (var167 > field543 * 10) {
                                                                    var167 = field543 * 10;
                                                                }
                                                                if (var167 > var165.field2620 - var165.field2585 - var165.field2604) {
                                                                    var167 = var165.field2620 - var165.field2585 - var165.field2604;
                                                                }
                                                                var165.field2604 += var167;
                                                                field582 -= var167;
                                                                method1335(var165);
                                                            }
                                                        }
                                                    } else if (Statics.field345 == var10 && field579 == var154) {
                                                        var162.method1726(var157, var158, 128);
                                                    } else {
                                                        var162.method1725(var157, var158);
                                                    }
                                                }
                                            } else if (var10.field2647 != null && var154 < 20) {
                                                class86 var168 = var10.method3176(var154);
                                                if (var168 != null) {
                                                    var168.method1725(var157, var158);
                                                } else if (class159.field2588) {
                                                    method1335(var10);
                                                }
                                            }
                                            var154++;
                                        }
                                    }
                                } else if (var10.field2592 == 3) {
                                    int var169;
                                    if (method225(var10)) {
                                        var169 = var10.field2608;
                                        if (Statics.field392 == var10 && var10.field2610 != 0) {
                                            var169 = var10.field2610;
                                        }
                                    } else {
                                        var169 = var10.field2698;
                                        if (Statics.field392 == var10 && var10.field2609 != 0) {
                                            var169 = var10.field2609;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2611) {
                                            class89.method1816(var12, var13, var10.field2599, var10.field2585, var169);
                                        } else {
                                            class89.method1818(var12, var13, var10.field2599, var10.field2585, var169);
                                        }
                                    } else if (var10.field2611) {
                                        class89.method1815(var12, var13, var10.field2599, var10.field2585, var169, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1826(var12, var13, var10.field2599, var10.field2585, var169, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2592 == 4) {
                                    class183 var170 = var10.method3177();
                                    if (var170 != null) {
                                        String var171 = var10.field2637;
                                        int var172;
                                        if (method225(var10)) {
                                            var172 = var10.field2608;
                                            if (Statics.field392 == var10 && var10.field2610 != 0) {
                                                var172 = var10.field2610;
                                            }
                                            if (var10.field2638.length() > 0) {
                                                var171 = var10.field2638;
                                            }
                                        } else {
                                            var172 = var10.field2698;
                                            if (Statics.field392 == var10 && var10.field2609 != 0) {
                                                var172 = var10.field2609;
                                            }
                                        }
                                        if (var10.field2589 && var10.field2694 != -1) {
                                            class40 var173 = class40.method1554(var10.field2694);
                                            var171 = var173.field1004;
                                            if (var171 == null) {
                                                var171 = "null";
                                            }
                                            if ((var173.field987 == 1 || var10.field2695 != 1) && var10.field2695 != -1) {
                                                String var174 = class2.method2758(16748608) + var171 + class2.field24 + " " + 'x';
                                                int var175 = var10.field2695;
                                                String var176 = Integer.toString(var175);
                                                for (int var177 = var176.length() - 3; var177 > 0; var177 -= 3) {
                                                    var176 = var176.substring(0, var177) + class2.field18 + var176.substring(var177);
                                                }
                                                String var178;
                                                StringBuilder var10000;
                                                class135 var10001;
                                                if (var176.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2758(65408)).append(var176.substring(0, var176.length() - 8));
                                                    var10001 = (class135) null;
                                                    var178 = var10000.append(class135.field2250).append(" ").append(class2.field26).append(var176).append(class2.field20).append(class2.field24).toString();
                                                } else if (var176.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2758(16777215)).append(var176.substring(0, var176.length() - 4));
                                                    var10001 = (class135) null;
                                                    var178 = var10000.append(class135.field2252).append(" ").append(class2.field26).append(var176).append(class2.field20).append(class2.field24).toString();
                                                } else {
                                                    var178 = " " + class2.method2758(16776960) + var176 + class2.field24;
                                                }
                                                var171 = var174 + var178;
                                            }
                                        }
                                        if (field623 == var10) {
                                            class135 var242 = (class135) null;
                                            var171 = class135.field2247;
                                            var172 = var10.field2698;
                                        }
                                        if (!var10.field2589) {
                                            var171 = method1657(var171, var10);
                                        }
                                        var170.method3408(var171, var12, var13, var10.field2599, var10.field2585, var172, var10.field2642 ? 0 : -1, var10.field2640, var10.field2619, var10.field2584);
                                    } else if (class159.field2588) {
                                        method1335(var10);
                                    }
                                } else if (var10.field2592 == 5) {
                                    if (var10.field2589) {
                                        class86 var180;
                                        if (var10.field2694 == -1) {
                                            var180 = var10.method3211(false);
                                        } else {
                                            var180 = class40.method2475(var10.field2694, var10.field2695, var10.field2653, var10.field2639, false);
                                        }
                                        if (var180 != null) {
                                            int var181 = var180.field1475;
                                            int var182 = var180.field1484;
                                            if (var10.field2617) {
                                                class89.method1811(var12, var13, var10.field2599 + var12, var10.field2585 + var13);
                                                int var183 = (var10.field2599 + (var181 - 1)) / var181;
                                                int var184 = (var10.field2585 + (var182 - 1)) / var182;
                                                for (int var185 = 0; var185 < var183; var185++) {
                                                    for (int var186 = 0; var186 < var184; var186++) {
                                                        if (var10.field2600 != 0) {
                                                            var180.method1744(var181 / 2 + var181 * var185 + var12, var182 / 2 + var182 * var186 + var13, var10.field2600, 4096);
                                                        } else if (var14 == 0) {
                                                            var180.method1725(var181 * var185 + var12, var182 * var186 + var13);
                                                        } else {
                                                            var180.method1726(var181 * var185 + var12, var182 * var186 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1819(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var187 = var10.field2599 * 4096 / var181;
                                                if (var10.field2600 != 0) {
                                                    var180.method1744(var10.field2599 / 2 + var12, var10.field2585 / 2 + var13, var10.field2600, var187);
                                                } else if (var14 != 0) {
                                                    var180.method1728(var12, var13, var10.field2599, var10.field2585, 256 - (var14 & 0xFF));
                                                } else if (var10.field2599 == var181 && var10.field2585 == var182) {
                                                    var180.method1725(var12, var13);
                                                } else {
                                                    var180.method1789(var12, var13, var10.field2599, var10.field2585);
                                                }
                                            }
                                        } else if (class159.field2588) {
                                            method1335(var10);
                                        }
                                    } else {
                                        class86 var179 = var10.method3211(method225(var10));
                                        if (var179 != null) {
                                            var179.method1725(var12, var13);
                                        } else if (class159.field2588) {
                                            method1335(var10);
                                        }
                                    }
                                } else if (var10.field2592 == 6) {
                                    boolean var188 = method225(var10);
                                    int var189;
                                    if (var188) {
                                        var189 = var10.field2618;
                                    } else {
                                        var189 = var10.field2626;
                                    }
                                    class112 var190 = null;
                                    int var191 = 0;
                                    if (var10.field2694 != -1) {
                                        class40 var192 = class40.method1554(var10.field2694);
                                        if (var192 != null) {
                                            class40 var193 = var192.method854(var10.field2695);
                                            var190 = var193.method849(1);
                                            if (var190 == null) {
                                                method1335(var10);
                                            } else {
                                                var190.method2303();
                                                var191 = var190.field1554 / 2;
                                            }
                                        }
                                    } else if (var10.field2703 == 5) {
                                        if (var10.field2623 == 0) {
                                            var190 = field729.method3236((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var190 = Statics.field1271.method19();
                                        }
                                    } else if (var189 == -1) {
                                        var190 = var10.method3179((class34) null, -1, var188, Statics.field1271.field31);
                                        if (var190 == null && class159.field2588) {
                                            method1335(var10);
                                        }
                                    } else {
                                        class34 var194 = Statics.method1204(var189);
                                        var190 = var10.method3179(var194, var10.field2696, var188, Statics.field1271.field31);
                                        if (var190 == null && class159.field2588) {
                                            method1335(var10);
                                        }
                                    }
                                    class104.method2157(var10.field2599 / 2 + var12, var10.field2585 / 2 + var13);
                                    int var195 = var10.field2633 * class104.field1780[var10.field2630] >> 16;
                                    int var196 = var10.field2633 * class104.field1784[var10.field2630] >> 16;
                                    if (var190 != null) {
                                        if (var10.field2589) {
                                            var190.method2303();
                                            if (var10.field2635) {
                                                var190.method2306(0, var10.field2631, var10.field2632, var10.field2630, var10.field2628, var10.field2629 + var191 + var195, var10.field2629 + var196, var10.field2633);
                                            } else {
                                                var190.method2285(0, var10.field2631, var10.field2632, var10.field2630, var10.field2628, var10.field2629 + var191 + var195, var10.field2629 + var196);
                                            }
                                        } else {
                                            var190.method2285(0, var10.field2631, 0, var10.field2630, 0, var195, var196);
                                        }
                                    }
                                    class104.method2156();
                                } else {
                                    if (var10.field2592 == 7) {
                                        class183 var197 = var10.method3177();
                                        if (var197 == null) {
                                            if (class159.field2588) {
                                                method1335(var10);
                                            }
                                            continue;
                                        }
                                        int var198 = 0;
                                        for (int var199 = 0; var199 < var10.field2585; var199++) {
                                            for (int var200 = 0; var200 < var10.field2599; var200++) {
                                                if (var10.field2692[var198] > 0) {
                                                    class40 var201 = class40.method1554(var10.field2692[var198] - 1);
                                                    String var202;
                                                    if (var201.field987 != 1 && var10.field2693[var198] == 1) {
                                                        var202 = class2.method2758(16748608) + var201.field1004 + class2.field24;
                                                    } else {
                                                        String var203 = class2.method2758(16748608) + var201.field1004 + class2.field24 + " " + 'x';
                                                        int var204 = var10.field2693[var198];
                                                        String var205 = Integer.toString(var204);
                                                        for (int var206 = var205.length() - 3; var206 > 0; var206 -= 3) {
                                                            var205 = var205.substring(0, var206) + class2.field18 + var205.substring(var206);
                                                        }
                                                        String var207;
                                                        if (var205.length() > 9) {
                                                            var207 = " " + class2.method2758(65408) + var205.substring(0, var205.length() - 8) + class135.field2250 + " " + class2.field26 + var205 + class2.field20 + class2.field24;
                                                        } else if (var205.length() > 6) {
                                                            var207 = " " + class2.method2758(16777215) + var205.substring(0, var205.length() - 4) + class135.field2252 + " " + class2.field26 + var205 + class2.field20 + class2.field24;
                                                        } else {
                                                            var207 = " " + class2.method2758(16776960) + var205 + class2.field24;
                                                        }
                                                        var202 = var203 + var207;
                                                    }
                                                    int var208 = (var10.field2643 + 115) * var200 + var12;
                                                    int var209 = (var10.field2691 + 12) * var199 + var13;
                                                    if (var10.field2640 == 0) {
                                                        var197.method3405(var202, var208, var209, var10.field2698, var10.field2642 ? 0 : -1);
                                                    } else if (var10.field2640 == 1) {
                                                        var197.method3407(var202, var10.field2599 / 2 + var208, var209, var10.field2698, var10.field2642 ? 0 : -1);
                                                    } else {
                                                        var197.method3406(var202, var10.field2599 + var208 - 1, var209, var10.field2698, var10.field2642 ? 0 : -1);
                                                    }
                                                }
                                                var198++;
                                            }
                                        }
                                    }
                                    if (var10.field2592 == 8 && Statics.field355 == var10 && field620 == field619) {
                                        int var210 = 0;
                                        int var211 = 0;
                                        class183 var212 = Statics.field1281;
                                        String var213 = var10.field2637;
                                        String var214 = method1657(var213, var10);
                                        while (var214.length() > 0) {
                                            int var215 = var214.indexOf(class2.field23);
                                            String var216;
                                            if (var215 == -1) {
                                                var216 = var214;
                                                var214 = "";
                                            } else {
                                                var216 = var214.substring(0, var215);
                                                var214 = var214.substring(var215 + 4);
                                            }
                                            int var217 = var212.method3400(var216);
                                            if (var217 > var210) {
                                                var210 = var217;
                                            }
                                            var211 += var212.field2832 + 1;
                                        }
                                        var210 += 6;
                                        var211 += 7;
                                        int var218 = var10.field2599 + var12 - 5 - var210;
                                        int var219 = var10.field2585 + var13 + 5;
                                        if (var218 < var12 + 5) {
                                            var218 = var12 + 5;
                                        }
                                        if (var210 + var218 > arg4) {
                                            var218 = arg4 - var210;
                                        }
                                        if (var211 + var219 > arg5) {
                                            var219 = arg5 - var211;
                                        }
                                        class89.method1816(var218, var219, var210, var211, 16777120);
                                        class89.method1818(var218, var219, var210, var211, 0);
                                        String var220 = var10.field2637;
                                        int var221 = var212.field2832 + var219 + 2;
                                        String var222 = method1657(var220, var10);
                                        while (var222.length() > 0) {
                                            int var223 = var222.indexOf(class2.field23);
                                            String var224;
                                            if (var223 == -1) {
                                                var224 = var222;
                                                var222 = "";
                                            } else {
                                                var224 = var222.substring(0, var223);
                                                var222 = var222.substring(var223 + 4);
                                            }
                                            var212.method3405(var224, var218 + 3, var221, 0, -1);
                                            var221 += var212.field2832 + 1;
                                        }
                                    }
                                    if (var10.field2592 == 9) {
                                        if (var10.field2613 == 1) {
                                            class89.method1824(var12, var13, var10.field2599 + var12, var10.field2585 + var13, var10.field2698);
                                        } else {
                                            int var225 = var10.field2599 >= 0 ? var10.field2599 : -var10.field2599;
                                            int var226 = var10.field2585 >= 0 ? var10.field2585 : -var10.field2585;
                                            int var227 = var225;
                                            if (var225 < var226) {
                                                var227 = var226;
                                            }
                                            if (var227 != 0) {
                                                int var228 = (var10.field2599 << 16) / var227;
                                                int var229 = (var10.field2585 << 16) / var227;
                                                if (var229 <= var228) {
                                                    var228 = -var228;
                                                } else {
                                                    var229 = -var229;
                                                }
                                                int var230 = var10.field2613 * var229 >> 17;
                                                int var231 = var10.field2613 * var229 + 1 >> 17;
                                                int var232 = var10.field2613 * var228 >> 17;
                                                int var233 = var10.field2613 * var228 + 1 >> 17;
                                                int var234 = var12 + var230;
                                                int var235 = var12 - var231;
                                                int var236 = var10.field2599 + var12 - var231;
                                                int var237 = var10.field2599 + var12 + var230;
                                                int var238 = var13 + var232;
                                                int var239 = var13 - var233;
                                                int var240 = var10.field2585 + var13 - var233;
                                                int var241 = var10.field2585 + var13 + var232;
                                                class104.method2162(var234, var235, var236);
                                                class104.method2155(var238, var239, var240, var234, var235, var236, var10.field2698);
                                                class104.method2162(var234, var236, var237);
                                                class104.method2155(var238, var240, var241, var234, var236, var237, var10.field2698);
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

    @ObfuscatedName("ca.cf(Ljava/lang/String;Lfv;I)Ljava/lang/String;")
    public static String method1657(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method16(method186(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field79 != null) {
                    var5 = class148.method2781(Statics.field79.field1416);
                    if (Statics.field79.field1418 != null) {
                        var5 = (String) Statics.field79.field1418;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cn.ca(Lfv;IIIIIIB)V")
    public static final void method2066(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field549) {
            field547 = 32;
        } else {
            field547 = 0;
        }
        field549 = false;
        if (class77.field1395 == 1) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2604 -= 4;
                method1335(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2604 += 4;
                method1335(arg0);
            } else if (arg5 >= arg1 - field547 && arg5 < field547 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2604 = (arg4 - arg3) * var8 / var9;
                method1335(arg0);
                field549 = true;
            }
        }
        if (field559 == 0) {
            return;
        }
        int var10 = arg0.field2599;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2604 += field559 * 45;
            method1335(arg0);
        }
    }

    @ObfuscatedName("e.ce(IB)Ljava/lang/String;")
    public static final String method16(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("g.cb(Lfv;I)Z")
    public static final boolean method225(class159 arg0) {
        if (arg0.field2687 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2687.length; var1++) {
            int var2 = method186(arg0, var1);
            int var3 = arg0.field2688[var1];
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

    @ObfuscatedName("s.ct(Lfv;IS)I")
    public static final int method186(class159 arg0, int arg1) {
        if (arg0.field2686 == null || arg1 >= arg0.field2686.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2686[arg1];
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
                    var7 = field600[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field606[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field607[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method1393(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method1554(var12).field972 || field636)) {
                        for (int var13 = 0; var13 < var11.field2692.length; var13++) {
                            if (var12 + 1 == var11.field2692[var13]) {
                                var7 += var11.field2693[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2709[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2058[field606[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2709[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1271.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2059[var14]) {
                            var7 += field606[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method1393(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method1554(var18).field972 || field636)) {
                        for (int var19 = 0; var19 < var17.field2692.length; var19++) {
                            if (var18 + 1 == var17.field2692[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field727;
                }
                if (var6 == 12) {
                    var7 = field548;
                }
                if (var6 == 13) {
                    int var20 = class160.field2709[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method2809(var22);
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
                    var7 = (Statics.field1271.field418 >> 7) + Statics.field1646;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1271.field398 >> 7) + Statics.field1269;
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

    @ObfuscatedName("am.ck(III)V")
    public static final void method563(int arg0, int arg1) {
        if (Statics.method66(arg0)) {
            method2369(Statics.field2641[arg0], arg1);
        }
    }

    @ObfuscatedName("db.cu([Lfv;II)V")
    public static final void method2369(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2592 == 0) {
                    if (var3.field2670 != null) {
                        method2369(var3.field2670, arg1);
                    }
                    class4 var4 = (class4) field628.method3311((long) var3.field2665);
                    if (var4 != null) {
                        method563(var4.field54, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2684 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field12 = var3.field2684;
                    class26.method1603(var5);
                }
                if (arg1 == 1 && var3.field2685 != null) {
                    if (var3.field2700 >= 0) {
                        class159 var6 = class159.method1393(var3.field2665);
                        if (var6 == null || var6.field2670 == null || var3.field2700 >= var6.field2670.length || var6.field2670[var3.field2700] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field12 = var3.field2685;
                    class26.method1603(var7);
                }
            }
        }
    }

    @ObfuscatedName("e.cj(Lfv;III)V")
    public static final void method13(class159 arg0, int arg1, int arg2) {
        if (field638 != null || field609 || arg0 == null || method178(arg0) == null) {
            return;
        }
        field638 = arg0;
        field508 = method178(arg0);
        field640 = arg1;
        field641 = arg2;
        Statics.field1814 = 0;
        field500 = false;
    }

    @ObfuscatedName("bj.cg(Lfv;I)V")
    public static void method1335(class159 arg0) {
        if (field634 == arg0.field2676) {
            field663[arg0.field2705] = true;
        }
    }

    @ObfuscatedName("am.cm(B)V")
    public static void method580() {
        for (class4 var0 = (class4) field628.method3312(); var0 != null; var0 = (class4) field628.method3313()) {
            int var1 = var0.field54;
            if (Statics.method66(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field2641[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2589;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2813;
                    class159 var6 = class159.method1393(var5);
                    if (var6 != null) {
                        method1335(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.cl(Lfv;I)Lfv;")
    public static class159 method178(class159 arg0) {
        class159 var1 = arg0;
        int var2 = class163.method2248(method3160(arg0));
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
                var1 = class159.method1393(var1.field2601);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class159 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2652;
        }
        return var5;
    }

    @ObfuscatedName("a.cx([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method31(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cg.cv(II)V")
    public static final void method1879(int arg0) {
        if (!Statics.method66(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2641[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3 != null) {
                var3.field2696 = 0;
                var3.field2697 = 0;
            }
        }
    }

    @ObfuscatedName("e.cc([Lfv;II)V")
    public static final void method6(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2601 == arg1 && (!var3.field2589 || !method2340(var3))) {
                if (var3.field2592 == 0) {
                    if (!var3.field2589 && method2340(var3) && Statics.field392 != var3) {
                        continue;
                    }
                    method6(arg0, var3.field2665);
                    if (var3.field2670 != null) {
                        method6(var3.field2670, var3.field2665);
                    }
                    class4 var4 = (class4) field628.method3311((long) var3.field2665);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (Statics.method66(var5)) {
                            method6(Statics.field2641[var5], -1);
                        }
                    }
                }
                if (var3.field2592 == 6) {
                    if (var3.field2626 != -1 || var3.field2618 != -1) {
                        boolean var6 = method225(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2618;
                        } else {
                            var7 = var3.field2626;
                        }
                        if (var7 != -1) {
                            class34 var8 = Statics.method1204(var7);
                            var3.field2697 += field543;
                            while (var3.field2697 > var8.field878[var3.field2696]) {
                                var3.field2697 -= var8.field878[var3.field2696];
                                var3.field2696++;
                                if (var3.field2696 >= var8.field888.length) {
                                    var3.field2696 -= var8.field876;
                                    if (var3.field2696 < 0 || var3.field2696 >= var8.field888.length) {
                                        var3.field2696 = 0;
                                    }
                                }
                                method1335(var3);
                            }
                        }
                    }
                    if (var3.field2634 != 0 && !var3.field2589) {
                        int var9 = var3.field2634 >> 16;
                        int var10 = var3.field2634 << 16 >> 16;
                        int var11 = field543 * var9;
                        int var12 = field543 * var10;
                        var3.field2630 = var3.field2630 + var11 & 0x7FF;
                        var3.field2631 = var3.field2631 + var12 & 0x7FF;
                        method1335(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.ci(II)V")
    public static final void method554(int arg0) {
        method580();
        for (class7 var1 = (class7) class7.field105.method3325(); var1 != null; var1 = (class7) class7.field105.method3333()) {
            if (var1.field99 != null) {
                var1.method49();
            }
        }
        int var2 = class42.method157(arg0).field1025;
        if (var2 == 0) {
            return;
        }
        int var3 = class160.field2709[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2159(0.9D);
                ((class110) Statics.field1767).method2242(0.9D);
            }
            if (var3 == 2) {
                class104.method2159(0.8D);
                ((class110) Statics.field1767).method2242(0.8D);
            }
            if (var3 == 3) {
                class104.method2159(0.7D);
                ((class110) Statics.field1767).method2242(0.7D);
            }
            if (var3 == 4) {
                class104.method2159(0.6D);
                ((class110) Statics.field1767).method2242(0.6D);
            }
            class40.field973.method3269();
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
            if (field702 != var4) {
                if (field702 == 0 && field703 != -1) {
                    class139.method2150(Statics.field244, field703, 0, var4, false);
                    field704 = false;
                } else if (var4 == 0) {
                    Statics.field2815.method2909();
                    class139.field2353 = 1;
                    Statics.field1029 = null;
                    field704 = false;
                } else if (class139.field2353 == 0) {
                    Statics.field2815.method2812(var4);
                } else {
                    Statics.field1821 = var4;
                }
                field702 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field705 = 127;
            }
            if (var3 == 1) {
                field705 = 96;
            }
            if (var3 == 2) {
                field705 = 64;
            }
            if (var3 == 3) {
                field705 = 32;
            }
            if (var3 == 4) {
                field705 = 0;
            }
        }
        if (var2 == 5) {
            field608 = var3;
        }
        if (var2 == 6) {
            field632 = var3;
        }
        if (var2 == 9) {
            field630 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field706 = 127;
        }
        if (var3 == 1) {
            field706 = 96;
        }
        if (var3 == 2) {
            field706 = 64;
        }
        if (var3 == 3) {
            field706 = 32;
        }
        if (var3 == 4) {
            field706 = 0;
        }
    }

    @ObfuscatedName("e.cn(Lfv;B)V")
    public static final void method14(class159 arg0) {
        int var1 = arg0.field2594;
        if (var1 == 324) {
            if (field726 == -1) {
                field726 = arg0.field2614;
                field469 = arg0.field2582;
            }
            if (field729.field2734) {
                arg0.field2614 = field726;
            } else {
                arg0.field2614 = field469;
            }
        } else if (var1 == 325) {
            if (field726 == -1) {
                field726 = arg0.field2614;
                field469 = arg0.field2582;
            }
            if (field729.field2734) {
                arg0.field2614 = field469;
            } else {
                arg0.field2614 = field726;
            }
        } else if (var1 == 327) {
            arg0.field2630 = 150;
            arg0.field2631 = (int) (Math.sin((double) field476 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2703 = 5;
            arg0.field2623 = 0;
        } else if (var1 == 328) {
            arg0.field2630 = 150;
            arg0.field2631 = (int) (Math.sin((double) field476 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2703 = 5;
            arg0.field2623 = 1;
        }
    }

    @ObfuscatedName("dy.co(B)V")
    public static final void method2342() {
        field509.method2345(24);
        for (class4 var0 = (class4) field628.method3312(); var0 != null; var0 = (class4) field628.method3313()) {
            if (var0.field51 == 0 || var0.field51 == 3) {
                method1541(var0, true);
            }
        }
        if (field623 != null) {
            method1335(field623);
            field623 = null;
        }
    }

    @ObfuscatedName("client.cr(IIIS)Lh;")
    public static final class4 method556(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field54 = arg1;
        var3.field51 = arg2;
        field628.method3310(var3, (long) arg0);
        method1879(arg1);
        Statics.method2757(arg1);
        class159 var4 = class159.method1393(arg0);
        if (var4 != null) {
            method1335(var4);
        }
        if (field623 != null) {
            method1335(field623);
            field623 = null;
        }
        for (int var5 = 0; var5 < field610; var5++) {
            int var6 = field613[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field610 - 1) {
                    for (int var8 = var5; var8 < field610 - 1; var8++) {
                        field713[var8] = field713[var8 + 1];
                        field493[var8] = field493[var8 + 1];
                        field613[var8] = field613[var8 + 1];
                        field614[var8] = field614[var8 + 1];
                        field562[var8] = field562[var8 + 1];
                        field622[var8] = field622[var8 + 1];
                    }
                }
                field610--;
            }
        }
        if (field627 != -1) {
            method563(field627, 1);
        }
        return var3;
    }

    @ObfuscatedName("bb.ch(Lh;ZB)V")
    public static final void method1541(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2813;
        arg0.method3360();
        if (arg1 && var2 != -1 && Statics.field2470[var2]) {
            Statics.field2583.method3060(var2);
            if (Statics.field2641[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2641[var2].length; var5++) {
                    if (Statics.field2641[var2][var5] != null) {
                        if (Statics.field2641[var2][var5].field2592 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2641[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2641[var2] = null;
                }
                Statics.field2470[var2] = false;
            }
        }
        method63(var2);
        class159 var6 = class159.method1393(var3);
        if (var6 != null) {
            method1335(var6);
        }
        for (int var7 = 0; var7 < field610; var7++) {
            int var8 = field613[var7];
            boolean var9 = var8 == 57 || var8 == 58 || var8 == 1007 || var8 == 25 || var8 == 30;
            if (var9) {
                if (var7 < field610 - 1) {
                    for (int var10 = var7; var10 < field610 - 1; var10++) {
                        field713[var10] = field713[var10 + 1];
                        field493[var10] = field493[var10 + 1];
                        field613[var10] = field613[var10 + 1];
                        field614[var10] = field614[var10 + 1];
                        field562[var10] = field562[var10 + 1];
                        field622[var10] = field622[var10 + 1];
                    }
                }
                field610--;
            }
        }
        if (field627 != -1) {
            method563(field627, 1);
        }
    }

    @ObfuscatedName("f.cq(Lfv;B)Z")
    public static final boolean method61(class159 arg0) {
        int var1 = arg0.field2594;
        if (var1 == 205) {
            field516 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field729.method3231(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field729.method3232(var4, var5 == 1);
        }
        if (var1 == 324) {
            field729.method3247(false);
        }
        if (var1 == 325) {
            field729.method3247(true);
        }
        if (var1 == 326) {
            field509.method2345(110);
            field729.method3234(field509);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("db.cz(IIII)V")
    public static final void method2367(int arg0, int arg1, int arg2) {
        method2251();
        class89.method1819(arg0, arg1, Statics.field9.field1489 + arg0, Statics.field9.field1490 + arg1);
        if (field701 == 2 || field701 == 5) {
            class89.method1863(arg0 + 25, arg1 + 5, 0, Statics.field1753, Statics.field1442);
        } else {
            int var3 = field720 + field538 & 0x7FF;
            int var4 = Statics.field1271.field418 / 32 + 48;
            int var5 = 464 - Statics.field1271.field398 / 32;
            Statics.field2000.method1708(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field540 + 256, Statics.field1753, Statics.field1442);
            for (int var6 = 0; var6 < field695; var6++) {
                int var7 = field696[var6] * 4 + 2 - Statics.field1271.field418 / 32;
                int var8 = field697[var6] * 4 + 2 - Statics.field1271.field398 / 32;
                method2381(arg0, arg1, var7, var8, field698[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field715[Statics.field1467][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1271.field418 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1271.field398 / 32;
                        method2381(arg0, arg1, var12, var13, Statics.field116[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field506; var14++) {
                class25 var15 = field505[field575[var14]];
                if (var15 != null && var15.method20()) {
                    class31 var16 = var15.field376;
                    if (var16 != null && var16.field796 != null) {
                        var16 = var16.method629();
                    }
                    if (var16 != null && var16.field787 && var16.field790) {
                        int var17 = var15.field418 / 32 - Statics.field1271.field418 / 32;
                        int var18 = var15.field398 / 32 - Statics.field1271.field398 / 32;
                        method2381(arg0, arg1, var17, var18, Statics.field116[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field588; var19++) {
                class3 var20 = field587[field589[var19]];
                if (var20 != null && var20.method20()) {
                    int var21 = var20.field418 / 32 - Statics.field1271.field418 / 32;
                    int var22 = var20.field398 / 32 - Statics.field1271.field398 / 32;
                    boolean var23 = false;
                    if (method791(var20.field33)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field934; var25++) {
                        if (var20.field33.equals(Statics.field1930[var25].field117)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1271.field48 != 0 && var20.field48 != 0 && Statics.field1271.field48 == var20.field48) {
                        var26 = true;
                    }
                    if (var23) {
                        method2381(arg0, arg1, var21, var22, Statics.field116[3]);
                    } else if (var26) {
                        method2381(arg0, arg1, var21, var22, Statics.field116[4]);
                    } else if (var24) {
                        method2381(arg0, arg1, var21, var22, Statics.field116[5]);
                    } else {
                        method2381(arg0, arg1, var21, var22, Statics.field116[2]);
                    }
                }
            }
            if (field545 != 0 && field476 % 20 < 10) {
                if (field545 == 1 && field486 >= 0 && field486 < field505.length) {
                    class25 var27 = field505[field486];
                    if (var27 != null) {
                        int var28 = var27.field418 / 32 - Statics.field1271.field418 / 32;
                        int var29 = var27.field398 / 32 - Statics.field1271.field398 / 32;
                        method150(arg0, arg1, var28, var29, Statics.field1317[1]);
                    }
                }
                if (field545 == 2) {
                    int var30 = field488 * 4 - Statics.field1646 * 4 + 2 - Statics.field1271.field418 / 32;
                    int var31 = field688 * 4 - Statics.field1269 * 4 + 2 - Statics.field1271.field398 / 32;
                    method150(arg0, arg1, var30, var31, Statics.field1317[1]);
                }
                if (field545 == 10 && field615 >= 0 && field615 < field587.length) {
                    class3 var32 = field587[field615];
                    if (var32 != null) {
                        int var33 = var32.field418 / 32 - Statics.field1271.field418 / 32;
                        int var34 = var32.field398 / 32 - Statics.field1271.field398 / 32;
                        method150(arg0, arg1, var33, var34, Statics.field1317[1]);
                    }
                }
            }
            if (field699 != 0) {
                int var35 = field699 * 4 + 2 - Statics.field1271.field418 / 32;
                int var36 = field700 * 4 + 2 - Statics.field1271.field398 / 32;
                method2381(arg0, arg1, var35, var36, Statics.field1317[0]);
            }
            class89.method1816(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field701 < 3) {
            Statics.field2083.method1708(arg0, arg1, 33, 33, 25, 25, field720, 256, Statics.field1672, Statics.field1229);
        } else {
            class89.method1863(arg0, arg1, 0, Statics.field1672, Statics.field1229);
        }
        if (field465[arg2]) {
            Statics.field9.method1795(arg0, arg1);
        }
        field671[arg2] = true;
    }

    @ObfuscatedName("z.cd(IIIILct;B)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2381(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field720 + field538 & 0x7FF;
        int var7 = class104.field1780[var6];
        int var8 = class104.field1784[var6];
        int var9 = var7 * 256 / (field540 + 256);
        int var10 = var8 * 256 / (field540 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field113.method1731(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("dx.de(IIIILct;I)V")
    public static final void method2381(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field720 + field538 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1780[var5];
        int var8 = class104.field1784[var5];
        int var9 = var7 * 256 / (field540 + 256);
        int var10 = var8 * 256 / (field540 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1778(Statics.field9, arg0 + 94 + var11 - arg4.field1475 / 2 + 4, arg1 + 83 - var12 - arg4.field1484 / 2 - 4);
        } else {
            arg4.method1725(arg0 + 94 + var11 - arg4.field1475 / 2 + 4, arg1 + 83 - var12 - arg4.field1484 / 2 - 4);
        }
    }

    @ObfuscatedName("bq.dw(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method1399(int arg0, String arg1, String arg2) {
        method35(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("h.df(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method35(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field678[var4] = field678[var4 - 1];
            field675[var4] = field675[var4 - 1];
            field681[var4] = field681[var4 - 1];
            field482[var4] = field482[var4 - 1];
        }
        field678[0] = arg0;
        field675[0] = arg1;
        field681[0] = arg2;
        field482[0] = arg3;
        field682++;
        field657 = field650;
    }

    @ObfuscatedName("aq.dm(Ljava/lang/String;I)Z")
    public static boolean method791(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method2767(arg0, Statics.field513);
        for (int var2 = 0; var2 < field719; var2++) {
            if (var1.equalsIgnoreCase(class149.method2767(field721[var2].field356, Statics.field513))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method2767(Statics.field1271.field33, Statics.field513))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("f.dk(Ljava/lang/String;B)Z")
    public static boolean method59(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method2767(arg0, Statics.field513);
        for (int var2 = 0; var2 < field533; var2++) {
            class11 var3 = field724[var2];
            if (var1.equalsIgnoreCase(class149.method2767(var3.field181, Statics.field513))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method2767(var3.field176, Statics.field513))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cq.dh(Ljava/lang/String;I)V")
    public static final void method2147(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field719 < 200 || field594 == 1) || field719 >= 400) {
            method1399(0, "", class135.field2255);
            return;
        }
        String var1 = class149.method2767(arg0, Statics.field513);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field719; var2++) {
            class23 var3 = field721[var2];
            String var4 = class149.method2767(var3.field356, Statics.field513);
            if (var4 != null && var4.equals(var1)) {
                method1399(0, "", arg0 + class135.field2303);
                return;
            }
            if (var3.field349 != null) {
                String var5 = class149.method2767(var3.field349, Statics.field513);
                if (var5 != null && var5.equals(var1)) {
                    method1399(0, "", arg0 + class135.field2303);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field533; var6++) {
            class11 var7 = field724[var6];
            String var8 = class149.method2767(var7.field181, Statics.field513);
            if (var8 != null && var8.equals(var1)) {
                method1399(0, "", class135.field2324 + arg0 + class135.field2264);
                return;
            }
            if (var7.field176 != null) {
                String var9 = class149.method2767(var7.field176, Statics.field513);
                if (var9 != null && var9.equals(var1)) {
                    method1399(0, "", class135.field2324 + arg0 + class135.field2264);
                    return;
                }
            }
        }
        if (class149.method2767(Statics.field1271.field33, Statics.field513).equals(var1)) {
            method1399(0, "", class135.field2259);
            return;
        }
        field509.method2345(194);
        class116 var10 = field509;
        int var11 = arg0.length() + 1;
        var10.method2657(var11);
        field509.method2485(arg0);
    }

    @ObfuscatedName("cx.dl(Ljava/lang/String;I)V")
    public static final void method1885(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method2767(arg0, Statics.field513);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field719; var2++) {
            class23 var3 = field721[var2];
            String var4 = var3.field356;
            String var5 = class149.method2767(var4, Statics.field513);
            if (class137.method42(arg0, var1, var4, var5)) {
                field719--;
                for (int var6 = var2; var6 < field719; var6++) {
                    field721[var6] = field721[var6 + 1];
                }
                field658 = field650;
                field509.method2345(116);
                class116 var7 = field509;
                int var8 = arg0.length() + 1;
                var7.method2657(var8);
                field509.method2485(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dq.ds(Ljava/lang/String;II)V")
    public static final void method2336(String arg0, int arg1) {
        field509.method2345(27);
        class116 var2 = field509;
        int var3 = arg0.length() + 1;
        var2.method2657(var3 + 1);
        field509.method2485(arg0);
        field509.method2657(arg1);
    }

    @ObfuscatedName("co.dq(I)V")
    public static final void method2068() {
        field509.method2345(57);
        field509.method2657(0);
    }

    @ObfuscatedName("f.dc(II)V")
    public static void method63(int arg0) {
        for (class171 var1 = (class171) field480.method3312(); var1 != null; var1 = (class171) field480.method3313()) {
            if ((var1.field2813 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3360();
            }
        }
    }

    @ObfuscatedName("fy.dy(Lfv;I)I")
    public static int method3160(class159 arg0) {
        class171 var1 = (class171) field480.method3311(((long) arg0.field2665 << 32) + (long) arg0.field2700);
        return var1 == null ? arg0.field2649 : var1.field2796;
    }

    @ObfuscatedName("dc.db(Lfv;I)Z")
    public static boolean method2340(class159 arg0) {
        if (field552) {
            if (method3160(arg0) != 0) {
                return false;
            }
            if (arg0.field2592 == 0) {
                return false;
            }
        }
        return arg0.field2602;
    }

    @ObfuscatedName("k.dx(Lfv;II)Ljava/lang/String;")
    public static String method124(class159 arg0, int arg1) {
        if (!class163.method1383(method3160(arg0), arg1) && arg0.field2607 == null) {
            return null;
        } else if (arg0.field2706 == null || arg0.field2706.length <= arg1 || arg0.field2706[arg1] == null || arg0.field2706[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2706[arg1];
        }
    }
}
